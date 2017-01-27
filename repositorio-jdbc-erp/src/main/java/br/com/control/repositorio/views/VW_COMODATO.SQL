CREATE VIEW dbcontrol1049999. "VW_COMODATO" 
AS 
  SELECT CASE 
           WHEN Length(Cast(dbcontrol1049999.cevped01. "vdcevpen_codcli" AS 
                            VARCHAR 
                            (6))) = 
                5 THEN Concat('000', Cast(dbcontrol1049999.cevped01. 
                                          "vdcevpen_codcli" AS 
                                          VARCHAR(6))) 
           ELSE 
             CASE 
               WHEN Length(Cast(dbcontrol1049999.cevped01. "vdcevpen_codcli" AS 
                                VARCHAR(6) 
                           )) = 
                    6 THEN Concat('00', Cast(dbcontrol1049999.cevped01. 
                                             "vdcevpen_codcli" 
                                             AS 
                                             VARCHAR(6))) 
               ELSE 
                 CASE 
                   WHEN Length(Cast(dbcontrol1049999.cevped01. "vdcevpen_codcli" 
                                    AS 
                                    VARCHAR(6) 
                               )) = 
                        7 THEN Concat('0', Cast(dbcontrol1049999.cevped01. 
                                                "vdcevpen_codcli" 
                                                AS 
                                                VARCHAR(6))) 
                 END 
             END 
         END 
            AS CODIGO_CLIENTE_ERP, 
         NULL 
            AS CODIGO_MODELO, 
         NULL 
            AS CODIGO_OCORRENCIA, 
         NULL 
            AS CODIGO_SITUACAO, 
         dbcontrol1049999.cevped01. "vdcevpen_dte" 
            AS DATA_CEV, 
         NULL 
            AS DATA_UTILMA_AUDITORIA, 
         dbcontrol1049999.cevped01. "vdcevpen_dtv" 
            AS DATA_VENCIMENTO, 
         NULL 
            AS DESCRICAO_MODELO, 
         NULL 
            AS FAZ_INVENTARIO, 
         NULL 
            AS NOME_FABRICANTE, 
         NULL 
            AS NUMERO_ATIVO, 
         dbcontrol1049999.cevped01. "vdcevpen_nrccev" 
            AS NUMERO_CEV, 
         NULL 
            AS NUMERO_CEV_ITEM, 
         NULL 
            AS PATRIMONIO_DOIS, 
         (SELECT dbcontrol1049999.cadprd01. "vdprdprd_codr" 
          FROM   dbcontrol1049999.cadprd01 
          WHERE  dbcontrol1049999.cadprd01. "vdprdprd_cfam" = Cast( 
                         Substring(Cast(dbcontrol1049999.cevped01. 
                                        "vdcevpen_prod" 
                                        AS 
                                        VARCHAR(6)), 
                         1, 
                                                                      3) 
                                                                      AS 
                         SMALLINT) 
                 AND dbcontrol1049999.cadprd01. "vdprdprd_nro" = 
                     Cast( 
                         Substring(Cast(dbcontrol1049999.cevped01. 
                                        "vdcevpen_prod" 
                                        AS 
                                        VARCHAR(6)), 
                         4, 
                                                                     3) 
                                                                     AS SMALLINT 
                     ) 
         ) 
            AS 
         CODIGO_PRODUTO_ERP, 
         dbcontrol1049999.cevped01. "vdcevpen_qtdprd" 
            AS QUANTIDADE, 
         NULL 
            AS TABELA_PRECO_REC_ID, 
         NULL 
            AS TECNOLOGIA_UTILIZADA, 
         NULL 
            AS TIPO_STATUS, 
         NULL 
            AS VALOR_ITEM 
  FROM   dbcontrol1049999.cevped01 