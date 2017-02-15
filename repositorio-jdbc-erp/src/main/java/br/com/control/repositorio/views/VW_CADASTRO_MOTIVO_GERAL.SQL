CREATE VIEW dbcontrol1049999. "VW_CADASTRO_MOTIVO_GERAL" 
AS 
  SELECT 1                                                          AS ativo, 
         Cast(dbcontrol1049999.bnftip01. "vdpedbnf_cod" AS CHAR(3)) AS 
            codigo_motivo_geral, 
         dbcontrol1049999.bnftip01. "vdpedbnf_descricao"            AS descricao, 
         NULL                                                       AS 
            descrecao_reduzida, 
         0                                                          AS 
         infui_venda 
            , 
         dbcontrol1049999.bnftip01. "vdpedbnf_influi_verba"         AS 
            permite_venda, 
         01                                                         AS 
            tipo_motivo_geral_rec_id 
  FROM   dbcontrol1049999.bnftip01 
  WHERE  dbcontrol1049999.bnftip01. "vdpedbnf_cancsn" = 0 
         AND dbcontrol1049999.bnftip01. "vdpedbnf_carrega_palm" = 1 
  UNION ALL 
  SELECT 1                                             AS ativo, 
         dbcontrol1049999.tbtroca. "vdcadtro_cod"      AS codigo_motivo_geral, 
         dbcontrol1049999.tbtroca. "vdcadtro_descr"    AS descricao, 
         dbcontrol1049999.tbtroca. "vdcadtro_descrred" AS descrecao_reduzida, 
         0                                             AS infui_venda, 
         0                                             AS permite_venda, 
         CASE 
           WHEN dbcontrol1049999.tbtroca. "vdcadtro_tipo" = 1 THEN 02 
           ELSE 03 
         END                                           AS 
         tipo_motivo_geral_rec_id 
  FROM   dbcontrol1049999.tbtroca 
  WHERE  dbcontrol1049999.tbtroca. "vdcadtro_cancsn" = 0 
  UNION ALL 
  SELECT 1                                          AS ativo, 
         dbcontrol1049999.tipcev01. "vdcevtip_cod"  AS codigo_motivo_geral, 
         dbcontrol1049999.tipcev01. "vdcevtip_nome" AS descricao, 
         NULL                                       AS descrecao_reduzida, 
         0                                          AS infui_venda, 
         0                                          AS permite_venda, 
         CASE 
           WHEN dbcontrol1049999.tipcev01. "vdcevtip_operacao" = 1 THEN 04 
           ELSE 
             CASE 
               WHEN dbcontrol1049999.tipcev01. "vdcevtip_operacao" = 3 THEN 3 
               ELSE 05 
             END 
         END                                        AS tipo_motivo_geral_rec_id 
  FROM   dbcontrol1049999.tipcev01 
  UNION ALL 
  SELECT 1                                              AS ativo, 
         dbcontrol1049999.tbblocli. "vdcadblo_cod"      AS codigo_motivo_geral, 
         dbcontrol1049999.tbblocli. "vdcadblo_descr"    AS descricao, 
         dbcontrol1049999.tbblocli. "vdcadblo_descrred" AS descrecao_reduzida, 
         dbcontrol1049999.tbblocli. "vdcadblo_venda"    AS infui_venda, 
         0                                              AS permite_venda, 
         06                                             AS 
         tipo_motivo_geral_rec_id 
  FROM   dbcontrol1049999.tbblocli 
  UNION ALL 
  SELECT 1                                                          AS ativo, 
         Cast(dbcontrol1049999.motcanpd. "vdcadmdc_cod" AS CHAR(3)) AS 
         codigo_motivo_geral, 
         dbcontrol1049999.motcanpd. "vdcadmdc_descr"                AS descricao, 
         dbcontrol1049999.motcanpd. "vdcadmdc_descrred"             AS 
         descrecao_reduzida, 
         0                                                          AS 
         infui_venda 
         , 
         0                                                          AS 
         permite_venda, 
         08                                                         AS 
         tipo_motivo_geral_rec_id 
  FROM   dbcontrol1049999.motcanpd 
  UNION ALL 
  SELECT 1                                             AS ativo, 
         dbcontrol1049999.tbdevol. "vdcaddev_cod"      AS codigo_motivo_geral, 
         dbcontrol1049999.tbdevol. "vdcaddev_descr"    AS descricao, 
         dbcontrol1049999.tbdevol. "vdcaddev_descrred" AS descrecao_reduzida, 
         0                                             AS infui_venda, 
         0                                             AS permite_venda, 
         09                                            AS 
         tipo_motivo_geral_rec_id 
  FROM   dbcontrol1049999.tbdevol 
  WHERE  dbcontrol1049999.tbdevol. "vdcaddev_cancsn" = 0 
  UNION ALL 
  SELECT 1                                            AS ativo, 
         dbcontrol1049999.tbncol. "vdcadnco_cod"      AS codigo_motivo_geral, 
         dbcontrol1049999.tbncol. "vdcadnco_descr"    AS descricao, 
         dbcontrol1049999.tbncol. "vdcadnco_descrred" AS descrecao_reduzida, 
         0                                            AS infui_venda, 
         0                                            AS permite_venda, 
         10                                           AS 
         tipo_motivo_geral_rec_id 
  FROM   dbcontrol1049999.tbncol 
  UNION ALL 
  SELECT 1                                            AS ativo, 
         dbcontrol1049999.tbncol. "vdcadnco_cod"      AS codigo_motivo_geral, 
         dbcontrol1049999.tbncol. "vdcadnco_descr"    AS descricao, 
         dbcontrol1049999.tbncol. "vdcadnco_descrred" AS descrecao_reduzida, 
         0                                            AS infui_venda, 
         0                                            AS permite_venda, 
         18                                           AS 
         tipo_motivo_geral_rec_id 
  FROM   dbcontrol1049999.tbncol 
  WHERE  dbcontrol1049999.tbncol. "vdcadnco_cod" = 'I' 
          OR dbcontrol1049999.tbncol. "vdcadnco_cod" = 'F' 
          OR dbcontrol1049999.tbncol. "vdcadnco_cod" = 'N' 
  UNION ALL 
  SELECT 1                                                          AS ativo, 
         Cast(dbcontrol1049999.tabblq01. "vdcadbpd_cod" AS CHAR(3)) AS 
         codigo_motivo_geral, 
         dbcontrol1049999.tabblq01. "vdcadbpd_descr"                AS descricao, 
         dbcontrol1049999.tabblq01. "vdcadbpd_descr"                AS 
         descrecao_reduzida, 
         0                                                          AS 
         infui_venda 
         , 
         0                                                          AS 
         permite_venda, 
         99                                                         AS 
         tipo_motivo_geral_rec_id 
  FROM   dbcontrol1049999.tabblq01 
  WHERE  dbcontrol1049999.tabblq01. "vdcadbpd_cancsn" = 0 