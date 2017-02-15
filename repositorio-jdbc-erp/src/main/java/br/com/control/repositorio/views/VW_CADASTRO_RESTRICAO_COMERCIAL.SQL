CREATE VIEW dbcontrol1049999. "VW_CADASTRO_RESTRICAO_COMERCIAL" 
AS 
  SELECT CASE 
           WHEN dbcontrol1049999.grptab01. "vdtabgrc_cancsn" = 0 THEN 1 
           ELSE 0 
         END                                             AS ATIVO, 
         dbcontrol1049999.grptab01. "vdtabgrc_grpcan"    AS 
         CODIGO_GRUPO_CANAL_ERP, 
         dbcontrol1049999.grptab01. "vdtabgrc_seq"       AS 
            CODIGO_RESTRICAO_COMERCIAL_ERP, 
         dbcontrol1049999.grptab01. "vdtabgrc_divcan"    AS DIVISAO_CANAL, 
         dbcontrol1049999.grptab01. "vdtabgrc_valminped" AS VALOR_MINIMO_PEDIDO, 
         dbcontrol1049999.grptab01. "vdtabgrc_canal"     AS CODIGO_CANAL_ERP, 
         CASE 
           WHEN Length(Cast(dbcontrol1049999.grptab01. "vdtabgrc_cliente" AS 
                            VARCHAR(8))) 
                = 5 THEN Concat('000', Cast(dbcontrol1049999.grptab01. 
                                            "vdtabgrc_cliente" 
                                            AS VARCHAR(8))) 
           ELSE 
             CASE 
               WHEN Length(Cast(dbcontrol1049999.grptab01. "vdtabgrc_cliente" AS 
                                VARCHAR(8 
                                ))) 
                    = 6 THEN Concat('00', Cast(dbcontrol1049999.grptab01. 
                                               "vdtabgrc_cliente" 
                                               AS VARCHAR(8))) 
               ELSE 
                 CASE 
                   WHEN Length(Cast(dbcontrol1049999.grptab01. "vdtabgrc_cliente" 
                                    AS 
                                    VARCHAR(8 
                                    ))) 
                        = 7 THEN Concat('0', Cast(dbcontrol1049999.grptab01. 
                                                  "vdtabgrc_cliente" AS 
                                                  VARCHAR(8))) 
                   ELSE 
                     CASE 
                       WHEN Length(Cast(dbcontrol1049999.grptab01. 
                                        "vdtabgrc_cliente" AS 
                                        VARCHAR(8 
                                        ))) 
                            = 8 THEN Cast(dbcontrol1049999.grptab01. 
                                          "vdtabgrc_cliente" AS 
                                          VARCHAR 
                                          (8)) 
                     END 
                 END 
             END 
         END                                             AS CODIGO_CLIENTE_ERP, 
         dbcontrol1049999.grptab01. "vdtabgrc_condpag"   AS 
            CODIGO_CONDICAO_PAGAMENTO_ERP, 
         dbcontrol1049999.grptab01. "vdtabgrc_tipcobr"   AS 
            CODIGO_TIPO_COBRANCA_ERP 
  FROM   dbcontrol1049999.grptab01 
  WHERE  Cast(dbcontrol1049999.grptab01. "vdtabgrc_cliente" AS VARCHAR(8)) <> '0' 