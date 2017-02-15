CREATE VIEW dbcontrol1049999. "VW_CADASTRO_PRECO" 
AS 
  SELECT dbcontrol1049999.tabprc01. "vdtabprd_aliqpvv"          AS ALIQ_PVV, 
         1                                                      AS ATIVO, 
         Cast(Cast(Cast(dbcontrol1049999.tabprc01. "vdtabprd_ano" AS CHAR(04)) 
                   || CASE 
                        WHEN dbcontrol1049999.tabprc01. "vdtabprd_mes" <= 9 THEN 
                        Concat('0', Cast(dbcontrol1049999.tabprc01. 
                                         "vdtabprd_mes" 
                                         AS CHAR 
                                         (1))) 
                        ELSE Cast(dbcontrol1049999.tabprc01. "vdtabprd_mes" AS 
                                  CHAR 
                                  (2)) 
                      END 
                   || CASE 
                        WHEN dbcontrol1049999.tabprc01. "vdtabprd_nmes" <= 9 THEN 
                        Concat('0', Cast(dbcontrol1049999.tabprc01. 
                                         "vdtabprd_nmes" 
                                         AS 
                                         CHAR(1)) 
                        ) 
                        ELSE Cast(dbcontrol1049999.tabprc01. "vdtabprd_nmes" AS 
                                  CHAR(2)) 
                      END AS CHAR(08)) AS BIGINT)               AS 
            CODIGO_TABPRECO_ERP, 
         dbcontrol1049999.tabprc01. "vdtabprd_daicmo"           AS DA_ICM_O, 
         dbcontrol1049999.tabprc01. "vdtabprd_desc"             AS DESCONTO, 
         dbcontrol1049999.tabprc01. "vdtabprd_descmax"          AS 
         DESCONTO_MAXIMO, 
         dbcontrol1049999.tabprc01. "vdtabprd_descvb"           AS DESCONTO_VERBA 
         , 
         dbcontrol1049999.tabprc01. "vdtabprd_despac"           AS 
         DESPAC, 
         dbcontrol1049999.tabprc01. "vdtabprd_tipotab"          AS ORIGEM_TABELA, 
         dbcontrol1049999.tabprc01. "vdtabprd_participabda"     AS 
            PARTICIPA_BANDA_PRECO, 
         NULL                                                   AS 
            PRECO_CUSTO_CAIXA, 
         NULL                                                   AS 
         PRECO_CUSTO_UN, 
         dbcontrol1049999.tabprc01. "vdtabprd_precopvv"         AS PRECO_PVV, 
         NULL                                                   AS PROMOCAO, 
         dbcontrol1049999.tabprc01. "vdtabprd_restr_comerciais" AS RESTRICAO, 
         dbcontrol1049999.tabprc01. "vdtabprd_selo"             AS SELO, 
         dbcontrol1049999.tabprc01. "vdtabprd_tpcont"           AS TP_CONT, 
         NULL                                                   AS 
         UF_TABLE_PRECO, 
         dbcontrol1049999.tabprc01. "vdtabprd_valicm"           AS VAL_ICMS, 
         dbcontrol1049999.tabprc01. "vdtabprd_valipi"           AS VAL_IPI, 
         dbcontrol1049999.tabprc01. "vdtabprd_preco"            AS VALOR, 
         (SELECT dbcontrol1049999.cadprd01. "vdprdprd_codr" 
          FROM   dbcontrol1049999.cadprd01 
          WHERE  dbcontrol1049999.cadprd01. "vdprdprd_cfam" = 
                         dbcontrol1049999.tabprc01. "vdtabprd_cfam" 
                 AND dbcontrol1049999.cadprd01. "vdprdprd_nro" = 
                     dbcontrol1049999.tabprc01. "vdtabprd_nro") AS 
            CODIGO_PRODUTO_ERP 
  FROM   dbcontrol1049999.tabprc01 
         CROSS JOIN dbcontrol1049999.bdapre01 
  WHERE  ( dbcontrol1049999.tabprc01. "vdtabprd_ano" = @TABELA_ANO 
           AND dbcontrol1049999.tabprc01. "vdtabprd_mes" = @TABELA_MES 
           AND dbcontrol1049999.tabprc01. "vdtabprd_nmes" = @TABELA_NMES 
           AND dbcontrol1049999.tabprc01. "vdtabprd_cfam" > 0 ) 
          OR ( Cast(Cast(Cast(dbcontrol1049999.tabprc01. "vdtabprd_ano" AS CHAR( 
                              04) 
                         ) 
                         || CASE 
                              WHEN dbcontrol1049999.tabprc01. "vdtabprd_mes" <= 9 
                            THEN 
                              Concat('0', Cast(dbcontrol1049999.tabprc01. 
                                               "vdtabprd_mes" 
                                               AS 
                                               CHAR 
                                               (1))) 
                              ELSE Cast(dbcontrol1049999.tabprc01. "vdtabprd_mes" 
                                        AS CHAR( 
                                        2)) 
                            END 
                         || CASE 
                              WHEN dbcontrol1049999.tabprc01. "vdtabprd_nmes" <= 
                                   9 
                            THEN 
                              Concat('0', Cast(dbcontrol1049999.tabprc01. 
                                               "vdtabprd_nmes" 
                                               AS 
                                               CHAR(1)) 
                              ) 
                              ELSE Cast(dbcontrol1049999.tabprc01. 
                                        "vdtabprd_nmes" 
                                        AS CHAR 
                                        (2)) 
                            END AS CHAR(08)) AS INTEGER) = 
                   dbcontrol1049999.bdapre01. "vdprdbda_tab_x_1" ) 