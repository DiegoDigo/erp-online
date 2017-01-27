CREATE VIEW dbcontrol1049999. "VW_CADASTRO_CLIENTE_ENDERECO" 
AS 
  SELECT 1                                                AS ATIVO, 
         dbcontrol1049999.cadcli01. "vdclicli_baifat"     AS BAIRRO, 
         dbcontrol1049999.cadcli01. "vdclicli_cepfat"     AS CEP_ENDERECO, 
         dbcontrol1049999.cadcli01. "vdclicli_endfat"     AS ENDERECO, 
         dbcontrol1049999.cadcli01. "vdclicli_munfat"     AS MUNICIPIO, 
         dbcontrol1049999.cadcli01. "vdclicli_endfat_nr"  AS NUMERO, 
         NULL                                             AS PONTO_REFERENCIA, 
         dbcontrol1049999.cadcli01. "vdclicli_estfat"     AS UTF_ENDERECO, 
         1                                                AS 
         ORIGEM_LOGRADOURO_ERP 
            , 
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
                     END)                                 AS codigo_cliente_erp, 
         dbcontrol1049999.cadcli01. "vdclicli_endfat_tip" AS SIGLA_LOGRADOURO_ERP 
  FROM   dbcontrol1049999.cadcli01 
  UNION ALL 
  SELECT 1                                                AS ATIVO, 
         dbcontrol1049999.cadcli01. "vdclicli_baicob"     AS BAIRRO, 
         dbcontrol1049999.cadcli01. "vdclicli_cepcob"     AS CEP_ENDERECO, 
         dbcontrol1049999.cadcli01. "vdclicli_endcob"     AS ENDERECO, 
         dbcontrol1049999.cadcli01. "vdclicli_muncob"     AS MUNICIPIO, 
         dbcontrol1049999.cadcli01. "vdclicli_endcob_nr"  AS NUMERO, 
         NULL                                             AS 
         PONTO_REFERENCIAENDFAT, 
         dbcontrol1049999.cadcli01. "vdclicli_estcob"     AS UTF_ENDERECO, 
         2                                                AS 
         ORIGEM_LOGRADOURO_REC_ID, 
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
                     END)                                 AS codigo_cliente_erp, 
         dbcontrol1049999.cadcli01. "vdclicli_endcob_tip" AS 
         SIGLA_LOGRADOURO_REC_ID 
  FROM   dbcontrol1049999.cadcli01 
  UNION ALL 
  SELECT 1                                                AS ATIVO, 
         dbcontrol1049999.cadcli01. "vdclicli_baient"     AS BAIRRO, 
         dbcontrol1049999.cadcli01. "vdclicli_cepent"     AS CEP_ENDERECO, 
         dbcontrol1049999.cadcli01. "vdclicli_endent"     AS ENDERECO, 
         dbcontrol1049999.cadcli01. "vdclicli_munent"     AS MUNICIPIO, 
         dbcontrol1049999.cadcli01. "vdclicli_endent_nr"  AS NUMERO, 
         NULL                                             AS 
         PONTO_REFERENCIAENDFAT, 
         dbcontrol1049999.cadcli01. "vdclicli_estent"     AS UTF_ENDERECO, 
         3                                                AS 
         ORIGEM_LOGRADOURO_REC_ID, 
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
                     END)                                 AS codigo_cliente_erp, 
         dbcontrol1049999.cadcli01. "vdclicli_endent_tip" AS 
         SIGLA_LOGRADOURO_REC_ID 
  FROM   dbcontrol1049999.cadcli01 