CREATE VIEW dbcontrol1049999. "VW_MOVIMENTO_FINANCEIRO" 
AS 
  SELECT CASE 
           WHEN Length(Cast(dbcontrol1049999.chdepo01. "crchqdep_codcli" AS 
                            VARCHAR 
                            (10))) 
                = 5 THEN Concat('000', Cast(dbcontrol1049999.chdepo01. 
                                            "crchqdep_codcli" 
                                            AS VARCHAR(10))) 
           ELSE 
             CASE 
               WHEN Length(Cast(dbcontrol1049999.chdepo01. "crchqdep_codcli" AS 
                                VARCHAR(10))) 
                    = 6 THEN Concat('00', Cast(dbcontrol1049999.chdepo01. 
                                               "crchqdep_codcli" AS 
                                               VARCHAR(10))) 
               ELSE 
                 CASE 
                   WHEN Length(Cast(dbcontrol1049999.chdepo01. "crchqdep_codcli" 
                                    AS 
                                    VARCHAR(10))) 
                        = 7 THEN Concat('0', Cast(dbcontrol1049999.chdepo01. 
                                                  "crchqdep_codcli" 
                                                  AS 
                                                  VARCHAR(10))) 
                   ELSE 
                     CASE 
                       WHEN Length(Cast(dbcontrol1049999.chdepo01. 
                                        "crchqdep_codcli" AS 
                                        VARCHAR(10))) 
                            = 8 THEN Cast(dbcontrol1049999.chdepo01. 
                                          "crchqdep_codcli" AS 
                                          VARCHAR( 
                                          10)) 
                     END 
                 END 
             END 
         END                                                              AS 
            CODIGO_CLIENTE_ERP, 
         NULL                                                             AS 
            CODIGO_PRODUTO_ERP, 
         CASE 
           WHEN dbcontrol1049999.chdepo01. "crchqdep_dtv" >= Cast( 
                Replace(Cast(Curdate() AS 
                VARCHAR(10)), '-', '') AS INT) THEN 
           dbcontrol1049999.chdepo01. "crchqdep_dte" 
           ELSE dbcontrol1049999.chdepo01. "crchqdep_dtv" 
         END                                                              AS 
            DATA_OPERACAO, 
         dbcontrol1049999.chdepo01. "crchqdep_dtv"                        AS 
            DATA_VENCIMENTO, 
         CASE 
           WHEN dbcontrol1049999.chdepo01. "crchqdep_dte" = 
                dbcontrol1049999.chdepo01. "crchqdep_dtv" THEN 1 
           ELSE 2 
         END                                                              AS MOD 
         , 
         Cast(dbcontrol1049999.chdepo01. "crchqdep_ndoc" AS 
              VARCHAR(255)) AS 
         NUMERO_DOCUMENTO, 
         CASE 
           WHEN dbcontrol1049999.chdepo01. "crchqdep_dtv" >= Cast( 
                Replace(Cast(Curdate() AS 
                VARCHAR(10)), '-', '') AS INT) THEN '1' 
           ELSE '2' 
         END                                                              AS 
            TIPO_REGISTRO, 
         dbcontrol1049999.chdepo01. "crchqdep_vldoc"                      AS 
         VALOR 
  FROM   dbcontrol1049999.chdepo01 
  WHERE  dbcontrol1049999.chdepo01. "crchqdep_dtv" >= Cast( 
         Replace(Cast(Curdate() AS 
         VARCHAR(10)), '-', '') AS INT) 
  UNION ALL 
  SELECT CASE 
           WHEN Length(Cast(dbcontrol1049999.chdev01. "crchqdev_ccli" AS 
                            VARCHAR(10))) = 5 
         THEN Concat('000', Cast(dbcontrol1049999.chdev01. "crchqdev_ccli" AS 
                                 VARCHAR(10)) 
              ) 
           ELSE 
             CASE 
               WHEN Length(Cast(dbcontrol1049999.chdev01. "crchqdev_ccli" AS 
                                VARCHAR(10))) 
                    = 6 
             THEN Concat('00', Cast(dbcontrol1049999.chdev01. "crchqdev_ccli" AS 
                                    VARCHAR( 
                                    10))) 
               ELSE 
                 CASE 
                   WHEN Length(Cast(dbcontrol1049999.chdev01. "crchqdev_ccli" AS 
                                    VARCHAR( 
                                    10))) 
                        = 7 
                 THEN Concat('0', Cast(dbcontrol1049999.chdev01. "crchqdev_ccli" 
                                       AS 
                                       VARCHAR(10))) 
                   ELSE 
                     CASE 
                       WHEN Length(Cast(dbcontrol1049999.chdev01. "crchqdev_ccli" 
                                        AS 
                                        VARCHAR( 
                                        10))) 
                            = 8 
                     THEN Cast(dbcontrol1049999.chdev01. "crchqdev_ccli" AS 
                               VARCHAR 
                               (10)) 
                     END 
                 END 
             END 
         END                                        AS CODIGO_CLIENTE_ERP, 
         NULL                                       AS CODIGO_PRODUTO, 
         CASE 
           WHEN dbcontrol1049999.chdev01. "crchqdev_dtqui" > 0 THEN 
           dbcontrol1049999.chdev01. "crchqdev_dtqui" 
           ELSE 0 
         END                                        AS DATA_OPERACAO, 
         dbcontrol1049999.chdev01. "crchqdev_dtvto" AS DATA_VENCIMENTO, 
         0                                          AS MOD, 
         dbcontrol1049999.chdev01. "crchqdev_nchq"  AS NUMERO_DOCUMENTO, 
         '3'                                        AS TIPO_REGISTRO, 
         dbcontrol1049999.chdev01. "crchqdev_vlori" AS VALOR 
  FROM   dbcontrol1049999.chdev01 
  WHERE  dbcontrol1049999.chdev01. "crchqdev_dtqui" = 0 
         AND dbcontrol1049999.chdev01. "crchqdev_dtemi" >= Cast( 
             Replace(Cast(Curdate() - 45 AS 
                          VARCHAR(10)), '-', '') AS INT) 
  UNION ALL 
  SELECT CASE 
           WHEN Length(Cast(dbcontrol1049999.cadbai01. "crmovbai_ccli" AS VARCHAR 
                            ( 
                            10))) = 
                5 THEN Concat('000', Cast(dbcontrol1049999.cadbai01. 
                                          "crmovbai_ccli" AS 
                                          VARCHAR(10))) 
           ELSE 
             CASE 
               WHEN Length(Cast(dbcontrol1049999.cadbai01. "crmovbai_ccli" AS 
                                VARCHAR(10)) 
                    ) = 
                    6 THEN Concat('00', Cast(dbcontrol1049999.cadbai01. 
                                             "crmovbai_ccli" AS 
                                             VARCHAR(10))) 
               ELSE 
                 CASE 
                   WHEN Length(Cast(dbcontrol1049999.cadbai01. "crmovbai_ccli" AS 
                                    VARCHAR( 
                                    10)) 
                        ) = 
                        7 THEN Concat('0', Cast(dbcontrol1049999.cadbai01. 
                                                "crmovbai_ccli" 
                                                AS 
                                                VARCHAR(10))) 
                   ELSE 
                     CASE 
                       WHEN Length(Cast(dbcontrol1049999.cadbai01. 
                                        "crmovbai_ccli" 
                                        AS 
                                        VARCHAR( 
                                        10)) 
                            ) = 
                            8 THEN Cast(dbcontrol1049999.cadbai01. 
                                        "crmovbai_ccli" 
                                        AS 
                                        VARCHAR( 
                                        10)) 
                     END 
                 END 
             END 
         END                                         AS CODIGO_CLIENTE_ERP, 
         NULL                                        AS CODIGO_PRODUTO, 
         dbcontrol1049999.cadbai01. "crmovbai_dtp"   AS DATA_OPERACAO, 
         dbcontrol1049999.cadbai01. "crmovbai_dtv"   AS DATA_VENCIMENTO, 
         dbcontrol1049999.cadbai01. "crmovbai_mod"   AS MOD, 
         dbcontrol1049999.cadbai01. "crmovbai_ndupl" AS NUMERO_DOCUMENTO, 
         '2'                                         AS TIPO_REGISTRO, 
         dbcontrol1049999.cadbai01. "crmovbai_valor" AS VALOR 
  FROM   dbcontrol1049999.cadbai01 
  WHERE  dbcontrol1049999.cadbai01. "crmovbai_dtp" >= Cast( 
         Replace(Cast(Curdate() - 45 AS 
         VARCHAR(10)), '-', '') AS INT) 
  UNION ALL 
  SELECT CASE 
           WHEN Length(Cast(dbcontrol1049999.cadmov01. "crmovmov_ccli" AS VARCHAR 
                            ( 
                            10))) = 
                5 THEN Concat('000', Cast(dbcontrol1049999.cadmov01. 
                                          "crmovmov_ccli" AS 
                                          VARCHAR(10))) 
           ELSE 
             CASE 
               WHEN Length(Cast(dbcontrol1049999.cadmov01. "crmovmov_ccli" AS 
                                VARCHAR(10)) 
                    ) = 
                    6 THEN Concat('00', Cast(dbcontrol1049999.cadmov01. 
                                             "crmovmov_ccli" AS 
                                             VARCHAR(10))) 
               ELSE 
                 CASE 
                   WHEN Length(Cast(dbcontrol1049999.cadmov01. "crmovmov_ccli" AS 
                                    VARCHAR( 
                                    10)) 
                        ) = 
                        7 THEN Concat('0', Cast(dbcontrol1049999.cadmov01. 
                                                "crmovmov_ccli" 
                                                AS 
                                                VARCHAR(10))) 
                   ELSE 
                     CASE 
                       WHEN Length(Cast(dbcontrol1049999.cadmov01. 
                                        "crmovmov_ccli" 
                                        AS 
                                        VARCHAR( 
                                        10)) 
                            ) = 
                            8 THEN Cast(dbcontrol1049999.cadmov01. 
                                        "crmovmov_ccli" 
                                        AS 
                                        VARCHAR( 
                                        10)) 
                     END 
                 END 
             END 
         END                                         AS CODIGO_CLIENTE_ERP, 
         NULL                                        AS CODIGO_PRODUTO, 
         dbcontrol1049999.cadmov01. "crmovmov_dte"   AS DATA_OPERACAO, 
         dbcontrol1049999.cadmov01. "crmovmov_dtv"   AS DATA_VENCIMENTO, 
         dbcontrol1049999.cadmov01. "crmovmov_mod"   AS MOD, 
         dbcontrol1049999.cadmov01. "crmovmov_ndupl" AS NUMERO_DOCUMENTO, 
         '1'                                         AS TIPO_REGISTRO, 
         dbcontrol1049999.cadmov01. "crmovmov_valor" AS VALOR 
  FROM   dbcontrol1049999.cadmov01 
  ORDER  BY 3 