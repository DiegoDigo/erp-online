CREATE VIEW dbcontrol1049999. "VW_CADASTRO_OCORRENCIA" 
AS 
  SELECT CASE 
           WHEN dbcontrol1049999.cadoco01. "vdnopoco_cancsn" = 0 THEN 1 
           ELSE 0 
         END 
            AS ATIVO, 
         dbcontrol1049999.cadoco01. "vdnopoco_cod" 
            AS CODIGO_OCORRENCIA_ERP, 
         dbcontrol1049999.cadoco01. "vdnopoco_nome" 
            AS DESCRICAO, 
         dbcontrol1049999.cadoco01. "vdnopoco_nomer" 
            AS DESCRICAO_REDUZIDA, 
         dbcontrol1049999.cadoco01. "vdnopoco_desdobro" 
            AS DESDOBRO, 
         NULL 
            AS EMPRESA, 
         CASE 
           WHEN dbcontrol1049999.cadoco01. "vdnopoco_totven" = 'S' THEN 1 
           ELSE 0 
         END 
            AS GERA_MOTIVO_FINANC, 
         1 
            AS OCORR_DISP_PORTAL, 
         dbcontrol1049999.cadoco01. "vdnopoco_sinal" 
            AS SINAL, 
         dbcontrol1049999.cadoco01. "vdnopoco_tipo" 
            AS TIPO, 
         dbcontrol1049999.cadoco01. "vdnopoco_tpprd" 
            AS TIPO_PRODUTO, 
         Concat('0', Cast(dbcontrol1049999.cadoco01. "vdnopoco_tipooco" AS 
                          VARCHAR( 
                          2))) AS 
         CODIGO_TIPO_OCORRENCIA_ERP, 
         dbcontrol1049999.vdnoot01. "vdnopotp_natop" 
            AS NATUREZA_OPERACAO 
  FROM   dbcontrol1049999.cadoco01 
         INNER JOIN dbcontrol1049999.vdnoot01 
                 ON dbcontrol1049999.vdnoot01. "vdnopotp_oco" = Cast( 
                    dbcontrol1049999.cadoco01. "vdnopoco_cod" AS SMALLINT) 
  WHERE  dbcontrol1049999.cadoco01. "vdnopoco_tipooco" = 1 
         AND dbcontrol1049999.cadoco01. "vdnopoco_cod" = '001' 
         AND dbcontrol1049999.vdnoot01. "vdnopotp_tipo_prod" = 'P' 
         AND ( dbcontrol1049999.cadoco01. "vdnopoco_cod" = @CODIGO_OCORRENCIA 
                OR @CODIGO_OCORRENCIA = '' ) 