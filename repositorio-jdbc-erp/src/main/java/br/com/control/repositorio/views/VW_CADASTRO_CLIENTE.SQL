CREATE VIEW dbcontrol1049999. "VW_CADASTRO_CLIENTE" 
AS 
  SELECT 0                                                        AS abate_icms, 
         CASE 
           WHEN dbcontrol1049999.cadcli01. "vdclicli_classe" = 20 THEN 0 
           ELSE 1 
         END                                                      AS ativo, 
         CASE 
           WHEN Length(Cast(dbcontrol1049999.cadcli01. "vdclicli_regi" AS CHAR(4) 
                       )) 
                = 1 
         THEN Concat('000', Cast(dbcontrol1049999.cadcli01. "vdclicli_regi" AS 
                                 VARCHAR(4)) 
              ) 
           WHEN Length(Cast(dbcontrol1049999.cadcli01. "vdclicli_regi" AS CHAR(4) 
                       )) 
                = 2 
         THEN Concat('00', Cast(dbcontrol1049999.cadcli01. "vdclicli_regi" AS 
                                VARCHAR(4))) 
           WHEN Length(Cast(dbcontrol1049999.cadcli01. "vdclicli_regi" AS CHAR(4) 
                       )) 
                = 3 
         THEN Concat('0', Cast(dbcontrol1049999.cadcli01. "vdclicli_regi" AS 
                               VARCHAR(4))) 
           WHEN Length(Cast(dbcontrol1049999.cadcli01. "vdclicli_regi" AS CHAR(4) 
                       )) 
                = 4 
         THEN Cast(dbcontrol1049999.cadcli01. "vdclicli_regi" AS VARCHAR(4)) 
         END                                                      AS 
            codigo_regiao_cliente, 
         CASE 
           WHEN Length(Cast(dbcontrol1049999.cadcli01. "vdclicli_num" AS CHAR(4)) 
                ) 
                = 1 
         THEN Concat('000', Cast(dbcontrol1049999.cadcli01. "vdclicli_num" AS 
                                 VARCHAR(4))) 
           WHEN Length(Cast(dbcontrol1049999.cadcli01. "vdclicli_num" AS CHAR(4)) 
                ) 
                = 2 
         THEN Concat('00', Cast(dbcontrol1049999.cadcli01. "vdclicli_num" AS 
                                VARCHAR(4))) 
           WHEN Length(Cast(dbcontrol1049999.cadcli01. "vdclicli_num" AS CHAR(4)) 
                ) 
                = 3 
         THEN Concat('0', Cast(dbcontrol1049999.cadcli01. "vdclicli_num" AS 
                               VARCHAR 
                               (4))) 
           WHEN Length(Cast(dbcontrol1049999.cadcli01. "vdclicli_num" AS CHAR(4)) 
                ) 
                = 4 
         THEN Cast(dbcontrol1049999.cadcli01. "vdclicli_num" AS VARCHAR(4)) 
         END                                                      AS 
            codigo_cliente, 
         Concat(CASE 
                  WHEN Length(Cast(dbcontrol1049999.cadcli01. "vdclicli_regi" AS 
                                   CHAR(4))) 
                       = 1 
                THEN Concat('000', Cast(dbcontrol1049999.cadcli01. 
                                        "vdclicli_regi" 
                                        AS 
                                        VARCHAR(4)) 
                     ) 
                  WHEN Length(Cast(dbcontrol1049999.cadcli01. "vdclicli_regi" AS 
                                   CHAR(4))) 
                       = 2 
                THEN Concat('00', Cast(dbcontrol1049999.cadcli01. "vdclicli_regi" 
                                       AS 
                                       VARCHAR(4))) 
                  WHEN Length(Cast(dbcontrol1049999.cadcli01. "vdclicli_regi" AS 
                                   CHAR(4))) 
                       = 3 
                THEN Concat('0', Cast(dbcontrol1049999.cadcli01. "vdclicli_regi" 
                                      AS 
                                      VARCHAR(4))) 
                  WHEN Length(Cast(dbcontrol1049999.cadcli01. "vdclicli_regi" AS 
                                   CHAR(4))) 
                       = 4 
                THEN Cast(dbcontrol1049999.cadcli01. "vdclicli_regi" AS VARCHAR(4 
                          )) 
                END, CASE 
                       WHEN Length(Cast(dbcontrol1049999.cadcli01. "vdclicli_num" 
                                        AS CHAR( 
                                        4))) = 1 
                     THEN Concat('000', Cast(dbcontrol1049999.cadcli01. 
                                             "vdclicli_num" AS 
                                             VARCHAR(4))) 
                       WHEN Length(Cast(dbcontrol1049999.cadcli01. "vdclicli_num" 
                                        AS CHAR( 
                                        4))) = 2 
                     THEN Concat('00', Cast(dbcontrol1049999.cadcli01. 
                                            "vdclicli_num" AS 
                                            VARCHAR(4))) 
                       WHEN Length(Cast(dbcontrol1049999.cadcli01. "vdclicli_num" 
                                        AS CHAR( 
                                        4))) = 3 
                     THEN Concat('0', Cast(dbcontrol1049999.cadcli01. 
                                           "vdclicli_num" AS 
                                           VARCHAR(4))) 
                       WHEN Length(Cast(dbcontrol1049999.cadcli01. "vdclicli_num" 
                                        AS CHAR( 
                                        4))) = 4 
                     THEN Cast(dbcontrol1049999.cadcli01. "vdclicli_num" AS 
                               VARCHAR 
                               (4)) 
                     END)                                         AS 
            codigo_cliente_erp, 
         NULL                                                     AS 
            bonus_disponivel, 
         dbcontrol1049999.cadcli01. "vdclicli_classe"             AS classe, 
         dbcontrol1049999.cadcli01. "vdclicli_tbprd"              AS 
            codigo_tabpreco, 
         dbcontrol1049999.cadcli01. "vdclicli_contato"            AS contato, 
         dbcontrol1049999.cadcli01. "vdclicli_cgc"                AS cpf_cnpj, 
         dbcontrol1049999.cadcli01. "vdclicli_abona_tx_financ"    AS 
            despreza_taxa_financeira, 
         0                                                        AS dia_semana, 
         dbcontrol1049999.cadcli01. "vdclicli_dias_entrega"       AS dias_entrega 
         , 
         dbcontrol1049999.cadcli01. "vdclicli_email_ori"          AS 
         email, 
         dbcontrol1049999.cadcli01. "vdclicli_ignora_banda_preco" AS 
            ignora_banda_preco, 
         NULL                                                     AS 
            inconformidade_cadastro, 
         1000                                                     AS 
            limite_credito, 
         dbcontrol1049999.cadcli01. "vdclicli_motblo"             AS 
            motivo_bloq_classe_20, 
         dbcontrol1049999.cadcli01. "vdclicli_motblo_jur"         AS 
            motivo_bloqueio_juridico, 
         dbcontrol1049999.cadcli01. "vdclicli_num"                AS 
         numero_cliente 
            , 
         dbcontrol1049999.cadcli01. "vdclicli_codpasta1"          AS 
            pasta, 
         dbcontrol1049999.cadcli01. "vdclicli_razao50"            AS razao_social 
         , 
         dbcontrol1049999.cadcli01. "vdclicli_regi"               AS 
         regiao_cliente 
            , 
         NULL                                                     AS 
            registro_alterado, 
         dbcontrol1049999.cadcli01. "vdclicli_restr_comerciais"   AS 
            restircao_comercial, 
         dbcontrol1049999.cadcli01. "vdclicli_sigla"              AS sigla, 
         dbcontrol1049999.cadcli01. "vdclicli_subcanal"           AS sub_canal, 
         CASE 
           WHEN Char_length(Cast(dbcontrol1049999.cadcli01. "vdclicli_fone" AS 
                                 CHAR 
                                 (12))) 
                = 11 THEN Subblobtochar(Cast(dbcontrol1049999.cadcli01. 
                                             "vdclicli_fone" AS 
                                             CHAR(12)), 1, 2) 
           ELSE '0' 
         END                                                      AS 
         telefone_ddd, 
         CASE 
           WHEN Char_length(Cast(dbcontrol1049999.cadcli01. "vdclicli_fone" AS 
                                 CHAR 
                                 (12))) 
                <= 9 THEN Cast(dbcontrol1049999.cadcli01. "vdclicli_fone" AS CHAR 
                               ( 
                               12)) 
           ELSE 
             CASE 
               WHEN Char_length(Cast(dbcontrol1049999.cadcli01. "vdclicli_fone" 
                                     AS 
                                     CHAR(12 
                                     ))) 
                    = 1 THEN '0' 
               ELSE Subblobtochar(Cast(dbcontrol1049999.cadcli01. "vdclicli_fone" 
                                       AS CHAR( 
                                       12)), 3, 11 
                    ) 
             END 
         END                                                      AS 
            telefone_tronco, 
         dbcontrol1049999.cadcli01. "vdclicli_verba_fin_pro"      AS 
            uso_verba_restrito_produto, 
         dbcontrol1049999.cadcli01. "vdclicli_cat"                AS 
            codigo_canal_erp, 
         dbcontrol1049999.cadcli01. "vdclicli_cpg"                AS 
            codigo_condicao_pagamento_erp, 
         dbcontrol1049999.cadcli01. "vdclicli_tpcobra"            AS 
            codigo_tipo_cobranca_erp 
  FROM   dbcontrol1049999.cadcli01 
  WHERE  dbcontrol1049999.cadcli01. "vdclicli_classe" <> 20 
         AND ( Cast(Concat(CASE 
                             WHEN Length(Cast(dbcontrol1049999.cadcli01. 
                                              "vdclicli_regi" 
                                              AS 
                                              CHAR 
                                              (4))) 
                                  = 1 
                           THEN Concat('000', Cast(dbcontrol1049999.cadcli01. 
                                                   "vdclicli_regi" 
                                                   AS 
                                                   VARCHAR(4)) 
                                ) 
                             WHEN Length(Cast(dbcontrol1049999.cadcli01. 
                                              "vdclicli_regi" 
                                              AS 
                                              CHAR 
                                              (4))) 
                                  = 2 
                           THEN Concat('00', Cast(dbcontrol1049999.cadcli01. 
                                                  "vdclicli_regi" 
                                                  AS 
                                                  VARCHAR(4))) 
                             WHEN Length(Cast(dbcontrol1049999.cadcli01. 
                                              "vdclicli_regi" 
                                              AS 
                                              CHAR 
                                              (4))) 
                                  = 3 
                           THEN Concat('0', Cast(dbcontrol1049999.cadcli01. 
                                                 "vdclicli_regi" AS 
                                                 VARCHAR(4))) 
                             WHEN Length(Cast(dbcontrol1049999.cadcli01. 
                                              "vdclicli_regi" 
                                              AS 
                                              CHAR 
                                              (4))) 
                                  = 4 
                           THEN Cast(dbcontrol1049999.cadcli01. "vdclicli_regi" 
                                     AS 
                                     VARCHAR 
                                     (4)) 
                           END, CASE 
                                  WHEN Length(Cast(dbcontrol1049999.cadcli01. 
                                                   "vdclicli_num" 
                                                   AS 
                                                   CHAR( 
                                                   4))) = 1 
                                THEN Concat('000', Cast( 
                                     dbcontrol1049999.cadcli01. 
                                     "vdclicli_num" AS 
                                     VARCHAR(4))) 
                                  WHEN Length(Cast(dbcontrol1049999.cadcli01. 
                                                   "vdclicli_num" 
                                                   AS 
                                                   CHAR( 
                                                   4))) = 2 
                                THEN Concat('00', Cast(dbcontrol1049999.cadcli01. 
                                                       "vdclicli_num" 
                                                       AS 
                                                       VARCHAR(4))) 
                                  WHEN Length(Cast(dbcontrol1049999.cadcli01. 
                                                   "vdclicli_num" 
                                                   AS 
                                                   CHAR( 
                                                   4))) = 3 
                                THEN Concat('0', Cast(dbcontrol1049999.cadcli01. 
                                                      "vdclicli_num" 
                                                      AS 
                                                      VARCHAR(4))) 
                                  WHEN Length(Cast(dbcontrol1049999.cadcli01. 
                                                   "vdclicli_num" 
                                                   AS 
                                                   CHAR( 
                                                   4))) = 4 
                                THEN Cast(dbcontrol1049999.cadcli01. 
                                          "vdclicli_num" 
                                          AS 
                                          VARCHAR 
                                          ( 
                                          4)) 
                                END) AS INTEGER) = @CODIGO_CLIENTE 
                OR @CODIGO_CLIENTE = 0 ) 