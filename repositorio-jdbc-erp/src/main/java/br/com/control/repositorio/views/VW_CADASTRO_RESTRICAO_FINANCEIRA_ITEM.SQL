CREATE VIEW dbcontrol1049999. "VW_CADASTRO_RESTRICAO_FINANCEIRA_ITEM" 
AS 
  SELECT Concat('201610', Cast(dbcontrol1049999.txpalm01. "vdcnftxp_tabela_1" AS 
                                  VARCHAR(2 
                                         )))                       AS 
            CODIGO_TABELA_PRECO, 
         Concat(Cast(dbcontrol1049999.txpalm01. "vdcnftxp_tpcobr" AS VARCHAR(2)), 
         Cast( 
         dbcontrol1049999.txpalm01. "vdcnftxp_cpg" AS VARCHAR(2))) AS 
         codigo_restricao_financeira 
  FROM   dbcontrol1049999.txpalm01 
  WHERE  dbcontrol1049999.txpalm01. "vdcnftxp_tabela_1" <> 0 
  UNION 
  SELECT Concat('201610', Cast(dbcontrol1049999.txpalm01. "vdcnftxp_tabela_2" AS 
                               VARCHAR(2 
                                      )))                          AS 
         CODIGO_TABELA_PRECO, 
         Concat(Cast(dbcontrol1049999.txpalm01. "vdcnftxp_tpcobr" AS VARCHAR(2)), 
         Cast( 
         dbcontrol1049999.txpalm01. "vdcnftxp_cpg" AS VARCHAR(2))) AS 
         codigo_restricao_financeira 
  FROM   dbcontrol1049999.txpalm01 
  WHERE  dbcontrol1049999.txpalm01. "vdcnftxp_tabela_2" <> 0 
  UNION 
  SELECT Concat('201610', Cast(dbcontrol1049999.txpalm01. "vdcnftxp_tabela_3" AS 
                               VARCHAR(2 
                                      )))                          AS 
         CODIGO_TABELA_PRECO, 
         Concat(Cast(dbcontrol1049999.txpalm01. "vdcnftxp_tpcobr" AS VARCHAR(2)), 
         Cast( 
         dbcontrol1049999.txpalm01. "vdcnftxp_cpg" AS VARCHAR(2))) AS 
         codigo_restricao_financeira 
  FROM   dbcontrol1049999.txpalm01 
  WHERE  dbcontrol1049999.txpalm01. "vdcnftxp_tabela_3" <> 0 
  UNION 
  SELECT Concat('201610', Cast(dbcontrol1049999.txpalm01. "vdcnftxp_tabela_4" AS 
                               VARCHAR(2 
                                      )))                          AS 
         CODIGO_TABELA_PRECO, 
         Concat(Cast(dbcontrol1049999.txpalm01. "vdcnftxp_tpcobr" AS VARCHAR(2)), 
         Cast( 
         dbcontrol1049999.txpalm01. "vdcnftxp_cpg" AS VARCHAR(2))) AS 
         codigo_restricao_financeira 
  FROM   dbcontrol1049999.txpalm01 
  WHERE  dbcontrol1049999.txpalm01. "vdcnftxp_tabela_4" <> 0 
  UNION 
  SELECT Concat('201610', Cast(dbcontrol1049999.txpalm01. "vdcnftxp_tabela_5" AS 
                               VARCHAR(2 
                                      )))                          AS 
         CODIGO_TABELA_PRECO, 
         Concat(Cast(dbcontrol1049999.txpalm01. "vdcnftxp_tpcobr" AS VARCHAR(2)), 
         Cast( 
         dbcontrol1049999.txpalm01. "vdcnftxp_cpg" AS VARCHAR(2))) AS 
         codigo_restricao_financeira 
  FROM   dbcontrol1049999.txpalm01 
  WHERE  dbcontrol1049999.txpalm01. "vdcnftxp_tabela_5" <> 0 
  UNION 
  SELECT Concat('201610', Cast(dbcontrol1049999.txpalm01. "vdcnftxp_tabela2_1" AS 
                               VARCHAR( 
                                      2)))                         AS 
         CODIGO_TABELA_PRECO, 
         Concat(Cast(dbcontrol1049999.txpalm01. "vdcnftxp_tpcobr" AS VARCHAR(2)), 
         Cast( 
         dbcontrol1049999.txpalm01. "vdcnftxp_cpg" AS VARCHAR(2))) AS 
         codigo_restricao_financeira 
  FROM   dbcontrol1049999.txpalm01 
  WHERE  dbcontrol1049999.txpalm01. "vdcnftxp_tabela2_1" <> 0 
  UNION 
  SELECT Concat('201610', Cast(dbcontrol1049999.txpalm01. "vdcnftxp_tabela2_2" AS 
                               VARCHAR( 
                                      2)))                         AS 
         CODIGO_TABELA_PRECO, 
         Concat(Cast(dbcontrol1049999.txpalm01. "vdcnftxp_tpcobr" AS VARCHAR(2)), 
         Cast( 
         dbcontrol1049999.txpalm01. "vdcnftxp_cpg" AS VARCHAR(2))) AS 
         codigo_restricao_financeira 
  FROM   dbcontrol1049999.txpalm01 
  WHERE  dbcontrol1049999.txpalm01. "vdcnftxp_tabela2_2" <> 0 
  UNION 
  SELECT Concat('201610', Cast(dbcontrol1049999.txpalm01. "vdcnftxp_tabela2_3" AS 
                               VARCHAR( 
                                      2)))                         AS 
         CODIGO_TABELA_PRECO, 
         Concat(Cast(dbcontrol1049999.txpalm01. "vdcnftxp_tpcobr" AS VARCHAR(2)), 
         Cast( 
         dbcontrol1049999.txpalm01. "vdcnftxp_cpg" AS VARCHAR(2))) AS 
         codigo_restricao_financeira 
  FROM   dbcontrol1049999.txpalm01 
  WHERE  dbcontrol1049999.txpalm01. "vdcnftxp_tabela2_3" <> 0 
  UNION 
  SELECT Concat('201610', Cast(dbcontrol1049999.txpalm01. "vdcnftxp_tabela2_4" AS 
                               VARCHAR( 
                                      2)))                         AS 
         CODIGO_TABELA_PRECO, 
         Concat(Cast(dbcontrol1049999.txpalm01. "vdcnftxp_tpcobr" AS VARCHAR(2)), 
         Cast( 
         dbcontrol1049999.txpalm01. "vdcnftxp_cpg" AS VARCHAR(2))) AS 
         codigo_restricao_financeira 
  FROM   dbcontrol1049999.txpalm01 
  WHERE  dbcontrol1049999.txpalm01. "vdcnftxp_tabela2_4" <> 0 
  UNION 
  SELECT Concat('201610', Cast(dbcontrol1049999.txpalm01. "vdcnftxp_tabela2_5" AS 
                               VARCHAR( 
                                      2)))                         AS 
         CODIGO_TABELA_PRECO, 
         Concat(Cast(dbcontrol1049999.txpalm01. "vdcnftxp_tpcobr" AS VARCHAR(2)), 
         Cast( 
         dbcontrol1049999.txpalm01. "vdcnftxp_cpg" AS VARCHAR(2))) AS 
         codigo_restricao_financeira 
  FROM   dbcontrol1049999.txpalm01 
  WHERE  dbcontrol1049999.txpalm01. "vdcnftxp_tabela2_5" <> 0 
  UNION 
  SELECT Concat('201610', Cast(dbcontrol1049999.txpalm01. "vdcnftxp_tabela2_6" AS 
                               VARCHAR( 
                                      2)))                         AS 
         CODIGO_TABELA_PRECO, 
         Concat(Cast(dbcontrol1049999.txpalm01. "vdcnftxp_tpcobr" AS VARCHAR(2)), 
         Cast( 
         dbcontrol1049999.txpalm01. "vdcnftxp_cpg" AS VARCHAR(2))) AS 
         codigo_restricao_financeira 
  FROM   dbcontrol1049999.txpalm01 
  WHERE  dbcontrol1049999.txpalm01. "vdcnftxp_tabela2_6" <> 0 
  UNION 
  SELECT Concat('201610', Cast(dbcontrol1049999.txpalm01. "vdcnftxp_tabela2_7" AS 
                               VARCHAR( 
                                      2)))                         AS 
         CODIGO_TABELA_PRECO, 
         Concat(Cast(dbcontrol1049999.txpalm01. "vdcnftxp_tpcobr" AS VARCHAR(2)), 
         Cast( 
         dbcontrol1049999.txpalm01. "vdcnftxp_cpg" AS VARCHAR(2))) AS 
         codigo_restricao_financeira 
  FROM   dbcontrol1049999.txpalm01 
  WHERE  dbcontrol1049999.txpalm01. "vdcnftxp_tabela2_7" <> 0 
  UNION 
  SELECT Concat('201610', Cast(dbcontrol1049999.txpalm01. "vdcnftxp_tabela2_8" AS 
                               VARCHAR( 
                                      2)))                         AS 
         CODIGO_TABELA_PRECO, 
         Concat(Cast(dbcontrol1049999.txpalm01. "vdcnftxp_tpcobr" AS VARCHAR(2)), 
         Cast( 
         dbcontrol1049999.txpalm01. "vdcnftxp_cpg" AS VARCHAR(2))) AS 
         codigo_restricao_financeira 
  FROM   dbcontrol1049999.txpalm01 
  WHERE  dbcontrol1049999.txpalm01. "vdcnftxp_tabela2_8" <> 0 
  UNION 
  SELECT Concat('201610', Cast(dbcontrol1049999.txpalm01. "vdcnftxp_tabela2_9" AS 
                               VARCHAR( 
                                      2)))                         AS 
         CODIGO_TABELA_PRECO, 
         Concat(Cast(dbcontrol1049999.txpalm01. "vdcnftxp_tpcobr" AS VARCHAR(2)), 
         Cast( 
         dbcontrol1049999.txpalm01. "vdcnftxp_cpg" AS VARCHAR(2))) AS 
         codigo_restricao_financeira 
  FROM   dbcontrol1049999.txpalm01 
  WHERE  dbcontrol1049999.txpalm01. "vdcnftxp_tabela2_9" <> 0 
  UNION 
  SELECT Concat('201610', Cast(dbcontrol1049999.txpalm01. "vdcnftxp_tabela2_10" 
                               AS 
                               VARCHAR 
                                      (2)))                        AS 
         CODIGO_TABELA_PRECO, 
         Concat(Cast(dbcontrol1049999.txpalm01. "vdcnftxp_tpcobr" AS VARCHAR(2)), 
         Cast( 
         dbcontrol1049999.txpalm01. "vdcnftxp_cpg" AS VARCHAR(2))) AS 
         codigo_restricao_financeira 
  FROM   dbcontrol1049999.txpalm01 
  WHERE  dbcontrol1049999.txpalm01. "vdcnftxp_tabela2_10" <> 0 
  UNION 
  SELECT Concat('201610', Cast(dbcontrol1049999.txpalm01. "vdcnftxp_tabela3_1" AS 
                               VARCHAR( 
                                      2)))                         AS 
         CODIGO_TABELA_PRECO, 
         Concat(Cast(dbcontrol1049999.txpalm01. "vdcnftxp_tpcobr" AS VARCHAR(2)), 
         Cast( 
         dbcontrol1049999.txpalm01. "vdcnftxp_cpg" AS VARCHAR(2))) AS 
         codigo_restricao_financeira 
  FROM   dbcontrol1049999.txpalm01 
  WHERE  dbcontrol1049999.txpalm01. "vdcnftxp_tabela3_1" <> 0 
  UNION 
  SELECT Concat('201610', Cast(dbcontrol1049999.txpalm01. "vdcnftxp_tabela3_2" AS 
                               VARCHAR( 
                                      2)))                         AS 
         CODIGO_TABELA_PRECO, 
         Concat(Cast(dbcontrol1049999.txpalm01. "vdcnftxp_tpcobr" AS VARCHAR(2)), 
         Cast( 
         dbcontrol1049999.txpalm01. "vdcnftxp_cpg" AS VARCHAR(2))) AS 
         codigo_restricao_financeira 
  FROM   dbcontrol1049999.txpalm01 
  WHERE  dbcontrol1049999.txpalm01. "vdcnftxp_tabela3_2" <> 0 
  UNION 
  SELECT Concat('201610', Cast(dbcontrol1049999.txpalm01. "vdcnftxp_tabela3_3" AS 
                               VARCHAR( 
                                      2)))                         AS 
         CODIGO_TABELA_PRECO, 
         Concat(Cast(dbcontrol1049999.txpalm01. "vdcnftxp_tpcobr" AS VARCHAR(2)), 
         Cast( 
         dbcontrol1049999.txpalm01. "vdcnftxp_cpg" AS VARCHAR(2))) AS 
         codigo_restricao_financeira 
  FROM   dbcontrol1049999.txpalm01 
  WHERE  dbcontrol1049999.txpalm01. "vdcnftxp_tabela3_3" <> 0 
  UNION 
  SELECT Concat('201610', Cast(dbcontrol1049999.txpalm01. "vdcnftxp_tabela3_4" AS 
                               VARCHAR( 
                                      2)))                         AS 
         CODIGO_TABELA_PRECO, 
         Concat(Cast(dbcontrol1049999.txpalm01. "vdcnftxp_tpcobr" AS VARCHAR(2)), 
         Cast( 
         dbcontrol1049999.txpalm01. "vdcnftxp_cpg" AS VARCHAR(2))) AS 
         codigo_restricao_financeira 
  FROM   dbcontrol1049999.txpalm01 
  WHERE  dbcontrol1049999.txpalm01. "vdcnftxp_tabela3_4" <> 0 
  UNION 
  SELECT Concat('201610', Cast(dbcontrol1049999.txpalm01. "vdcnftxp_tabela3_5" AS 
                               VARCHAR( 
                                      2)))                         AS 
         CODIGO_TABELA_PRECO, 
         Concat(Cast(dbcontrol1049999.txpalm01. "vdcnftxp_tpcobr" AS VARCHAR(2)), 
         Cast( 
         dbcontrol1049999.txpalm01. "vdcnftxp_cpg" AS VARCHAR(2))) AS 
         codigo_restricao_financeira 
  FROM   dbcontrol1049999.txpalm01 
  WHERE  dbcontrol1049999.txpalm01. "vdcnftxp_tabela3_5" <> 0 
  UNION 
  SELECT Concat('201610', Cast(dbcontrol1049999.txpalm01. "vdcnftxp_tabela3_6" AS 
                               VARCHAR( 
                                      2)))                         AS 
         CODIGO_TABELA_PRECO, 
         Concat(Cast(dbcontrol1049999.txpalm01. "vdcnftxp_tpcobr" AS VARCHAR(2)), 
         Cast( 
         dbcontrol1049999.txpalm01. "vdcnftxp_cpg" AS VARCHAR(2))) AS 
         codigo_restricao_financeira 
  FROM   dbcontrol1049999.txpalm01 
  WHERE  dbcontrol1049999.txpalm01. "vdcnftxp_tabela3_6" <> 0 
  UNION 
  SELECT Concat('201610', Cast(dbcontrol1049999.txpalm01. "vdcnftxp_tabela3_7" AS 
                               VARCHAR( 
                                      2)))                         AS 
         CODIGO_TABELA_PRECO, 
         Concat(Cast(dbcontrol1049999.txpalm01. "vdcnftxp_tpcobr" AS VARCHAR(2)), 
         Cast( 
         dbcontrol1049999.txpalm01. "vdcnftxp_cpg" AS VARCHAR(2))) AS 
         codigo_restricao_financeira 
  FROM   dbcontrol1049999.txpalm01 
  WHERE  dbcontrol1049999.txpalm01. "vdcnftxp_tabela3_7" <> 0 
  UNION 
  SELECT Concat('201610', Cast(dbcontrol1049999.txpalm01. "vdcnftxp_tabela3_8" AS 
                               VARCHAR( 
                                      2)))                         AS 
         CODIGO_TABELA_PRECO, 
         Concat(Cast(dbcontrol1049999.txpalm01. "vdcnftxp_tpcobr" AS VARCHAR(2)), 
         Cast( 
         dbcontrol1049999.txpalm01. "vdcnftxp_cpg" AS VARCHAR(2))) AS 
         codigo_restricao_financeira 
  FROM   dbcontrol1049999.txpalm01 
  WHERE  dbcontrol1049999.txpalm01. "vdcnftxp_tabela3_8" <> 0 