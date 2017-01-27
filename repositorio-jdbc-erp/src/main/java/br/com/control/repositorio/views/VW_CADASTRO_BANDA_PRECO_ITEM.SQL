CREATE VIEW dbcontrol1049999. "VW_CADASTRO_BANDA_PRECO_ITEM" 
AS 
  SELECT Cast(Cast(dbcontrol1049999.bdapre01. "vdprdbda_fam" AS VARCHAR(3)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_prd" AS VARCHAR(3)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_grp" AS VARCHAR(2)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_cat" AS VARCHAR(2)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_mar" AS VARCHAR(2)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_reg" AS VARCHAR(4)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_pst" AS VARCHAR(4)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_grpcli" AS VARCHAR(4)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_ven" AS VARCHAR(3)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_can" AS VARCHAR(2)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_grpcan" AS VARCHAR(2)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_cpg" AS VARCHAR(2)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_grpesc" AS VARCHAR(3)) 
                 AS 
                        VARCHAR(50))                      AS 
            CODIGO_BANDA_PRECO_ERP, 
         dbcontrol1049999.bdapre01. "vdprdbda_bandprec_1" AS QUANTIDADE, 
         dbcontrol1049999.bdapre01. "vdprdbda_tab_x_1"    AS CODIGO_TABPRECO_ERP, 
         dbcontrol1049999.bdapre01. "vdprdbda_descto_1"   AS DESCONTO_MAXIMO 
  FROM   dbcontrol1049999.bdapre01 
  WHERE  dbcontrol1049999.bdapre01. "vdprdbda_cancsn" = 0 
         AND dbcontrol1049999.bdapre01. "vdprdbda_bandprec_1" > 0 
  UNION 
  SELECT Cast(Cast(dbcontrol1049999.bdapre01. "vdprdbda_fam" AS VARCHAR(3)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_prd" AS VARCHAR(3)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_grp" AS VARCHAR(2)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_cat" AS VARCHAR(2)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_mar" AS VARCHAR(2)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_reg" AS VARCHAR(4)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_pst" AS VARCHAR(4)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_grpcli" AS VARCHAR(4)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_ven" AS VARCHAR(3)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_can" AS VARCHAR(2)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_grpcan" AS VARCHAR(2)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_cpg" AS VARCHAR(2)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_grpesc" AS VARCHAR(3)) 
              AS 
                     VARCHAR(50))                         AS 
         CODIGO_BANDA_PRECO_ERP, 
         dbcontrol1049999.bdapre01. "vdprdbda_bandprec_2" AS QUANTIDADE, 
         dbcontrol1049999.bdapre01. "vdprdbda_tab_x_2"    AS CODIGO_TABPRECO_ERP, 
         dbcontrol1049999.bdapre01. "vdprdbda_descto_2"   AS DESCONTO_MAXIMO 
  FROM   dbcontrol1049999.bdapre01 
  WHERE  dbcontrol1049999.bdapre01. "vdprdbda_cancsn" = 0 
         AND dbcontrol1049999.bdapre01. "vdprdbda_bandprec_2" > 0 
  UNION 
  SELECT Cast(Cast(dbcontrol1049999.bdapre01. "vdprdbda_fam" AS VARCHAR(3)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_prd" AS VARCHAR(3)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_grp" AS VARCHAR(2)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_cat" AS VARCHAR(2)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_mar" AS VARCHAR(2)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_reg" AS VARCHAR(4)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_pst" AS VARCHAR(4)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_grpcli" AS VARCHAR(4)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_ven" AS VARCHAR(3)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_can" AS VARCHAR(2)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_grpcan" AS VARCHAR(2)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_cpg" AS VARCHAR(2)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_grpesc" AS VARCHAR(3)) 
              AS 
                     VARCHAR(50))                         AS 
         CODIGO_BANDA_PRECO_ERP, 
         dbcontrol1049999.bdapre01. "vdprdbda_bandprec_3" AS QUANTIDADE, 
         dbcontrol1049999.bdapre01. "vdprdbda_tab_x_3"    AS CODIGO_TABPRECO_ERP, 
         dbcontrol1049999.bdapre01. "vdprdbda_descto_3"   AS DESCONTO_MAXIMO 
  FROM   dbcontrol1049999.bdapre01 
  WHERE  dbcontrol1049999.bdapre01. "vdprdbda_cancsn" = 0 
         AND dbcontrol1049999.bdapre01. "vdprdbda_bandprec_3" > 0 
  UNION 
  SELECT Cast(Cast(dbcontrol1049999.bdapre01. "vdprdbda_fam" AS VARCHAR(3)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_prd" AS VARCHAR(3)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_grp" AS VARCHAR(2)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_cat" AS VARCHAR(2)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_mar" AS VARCHAR(2)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_reg" AS VARCHAR(4)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_pst" AS VARCHAR(4)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_grpcli" AS VARCHAR(4)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_ven" AS VARCHAR(3)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_can" AS VARCHAR(2)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_grpcan" AS VARCHAR(2)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_cpg" AS VARCHAR(2)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_grpesc" AS VARCHAR(3)) 
              AS 
                     VARCHAR(50))                         AS 
         CODIGO_BANDA_PRECO_ERP, 
         dbcontrol1049999.bdapre01. "vdprdbda_bandprec_4" AS QUANTIDADE, 
         dbcontrol1049999.bdapre01. "vdprdbda_tab_x_4"    AS CODIGO_TABPRECO_ERP, 
         dbcontrol1049999.bdapre01. "vdprdbda_descto_4"   AS DESCONTO_MAXIMO 
  FROM   dbcontrol1049999.bdapre01 
  WHERE  dbcontrol1049999.bdapre01. "vdprdbda_cancsn" = 0 
         AND dbcontrol1049999.bdapre01. "vdprdbda_bandprec_4" > 0 
  UNION 
  SELECT Cast(Cast(dbcontrol1049999.bdapre01. "vdprdbda_fam" AS VARCHAR(3)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_prd" AS VARCHAR(3)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_grp" AS VARCHAR(2)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_cat" AS VARCHAR(2)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_mar" AS VARCHAR(2)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_reg" AS VARCHAR(4)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_pst" AS VARCHAR(4)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_grpcli" AS VARCHAR(4)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_ven" AS VARCHAR(3)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_can" AS VARCHAR(2)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_grpcan" AS VARCHAR(2)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_cpg" AS VARCHAR(2)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_grpesc" AS VARCHAR(3)) 
              AS 
                     VARCHAR(50))                         AS 
         CODIGO_BANDA_PRECO_ERP, 
         dbcontrol1049999.bdapre01. "vdprdbda_bandprec_5" AS QUANTIDADE, 
         dbcontrol1049999.bdapre01. "vdprdbda_tab_x_5"    AS CODIGO_TABPRECO_ERP, 
         dbcontrol1049999.bdapre01. "vdprdbda_descto_5"   AS DESCONTO_MAXIMO 
  FROM   dbcontrol1049999.bdapre01 
  WHERE  dbcontrol1049999.bdapre01. "vdprdbda_cancsn" = 0 
         AND dbcontrol1049999.bdapre01. "vdprdbda_bandprec_5" > 0 
  UNION 
  SELECT Cast(Cast(dbcontrol1049999.bdapre01. "vdprdbda_fam" AS VARCHAR(3)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_prd" AS VARCHAR(3)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_grp" AS VARCHAR(2)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_cat" AS VARCHAR(2)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_mar" AS VARCHAR(2)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_reg" AS VARCHAR(4)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_pst" AS VARCHAR(4)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_grpcli" AS VARCHAR(4)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_ven" AS VARCHAR(3)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_can" AS VARCHAR(2)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_grpcan" AS VARCHAR(2)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_cpg" AS VARCHAR(2)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_grpesc" AS VARCHAR(3)) 
              AS 
                     VARCHAR(50))                         AS 
         CODIGO_BANDA_PRECO_ERP, 
         dbcontrol1049999.bdapre01. "vdprdbda_bandprec_6" AS QUANTIDADE, 
         dbcontrol1049999.bdapre01. "vdprdbda_tab_x_6"    AS CODIGO_TABPRECO_ERP, 
         dbcontrol1049999.bdapre01. "vdprdbda_descto_6"   AS DESCONTO_MAXIMO 
  FROM   dbcontrol1049999.bdapre01 
  WHERE  dbcontrol1049999.bdapre01. "vdprdbda_cancsn" = 0 
         AND dbcontrol1049999.bdapre01. "vdprdbda_bandprec_6" > 0 
  UNION 
  SELECT Cast(Cast(dbcontrol1049999.bdapre01. "vdprdbda_fam" AS VARCHAR(3)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_prd" AS VARCHAR(3)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_grp" AS VARCHAR(2)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_cat" AS VARCHAR(2)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_mar" AS VARCHAR(2)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_reg" AS VARCHAR(4)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_pst" AS VARCHAR(4)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_grpcli" AS VARCHAR(4)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_ven" AS VARCHAR(3)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_can" AS VARCHAR(2)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_grpcan" AS VARCHAR(2)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_cpg" AS VARCHAR(2)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_grpesc" AS VARCHAR(3)) 
              AS 
                     VARCHAR(50))                         AS 
         CODIGO_BANDA_PRECO_ERP, 
         dbcontrol1049999.bdapre01. "vdprdbda_bandprec_7" AS QUANTIDADE, 
         dbcontrol1049999.bdapre01. "vdprdbda_tab_x_7"    AS CODIGO_TABPRECO_ERP, 
         dbcontrol1049999.bdapre01. "vdprdbda_descto_7"   AS DESCONTO_MAXIMO 
  FROM   dbcontrol1049999.bdapre01 
  WHERE  dbcontrol1049999.bdapre01. "vdprdbda_cancsn" = 0 
         AND dbcontrol1049999.bdapre01. "vdprdbda_bandprec_7" > 0 
  UNION 
  SELECT Cast(Cast(dbcontrol1049999.bdapre01. "vdprdbda_fam" AS VARCHAR(3)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_prd" AS VARCHAR(3)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_grp" AS VARCHAR(2)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_cat" AS VARCHAR(2)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_mar" AS VARCHAR(2)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_reg" AS VARCHAR(4)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_pst" AS VARCHAR(4)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_grpcli" AS VARCHAR(4)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_ven" AS VARCHAR(3)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_can" AS VARCHAR(2)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_grpcan" AS VARCHAR(2)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_cpg" AS VARCHAR(2)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_grpesc" AS VARCHAR(3)) 
              AS 
                     VARCHAR(50))                         AS 
         CODIGO_BANDA_PRECO_ERP, 
         dbcontrol1049999.bdapre01. "vdprdbda_bandprec_8" AS QUANTIDADE, 
         dbcontrol1049999.bdapre01. "vdprdbda_tab_x_8"    AS CODIGO_TABPRECO_ERP, 
         dbcontrol1049999.bdapre01. "vdprdbda_descto_8"   AS DESCONTO_MAXIMO 
  FROM   dbcontrol1049999.bdapre01 
  WHERE  dbcontrol1049999.bdapre01. "vdprdbda_cancsn" = 0 
         AND dbcontrol1049999.bdapre01. "vdprdbda_bandprec_8" > 0 
  UNION 
  SELECT Cast(Cast(dbcontrol1049999.bdapre01. "vdprdbda_fam" AS VARCHAR(3)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_prd" AS VARCHAR(3)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_grp" AS VARCHAR(2)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_cat" AS VARCHAR(2)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_mar" AS VARCHAR(2)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_reg" AS VARCHAR(4)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_pst" AS VARCHAR(4)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_grpcli" AS VARCHAR(4)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_ven" AS VARCHAR(3)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_can" AS VARCHAR(2)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_grpcan" AS VARCHAR(2)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_cpg" AS VARCHAR(2)) 
              || Cast(dbcontrol1049999.bdapre01. "vdprdbda_grpesc" AS VARCHAR(3)) 
              AS 
                     VARCHAR(50))                         AS 
         CODIGO_BANDA_PRECO_ERP, 
         dbcontrol1049999.bdapre01. "vdprdbda_bandprec_9" AS QUANTIDADE, 
         dbcontrol1049999.bdapre01. "vdprdbda_tab_x_9"    AS CODIGO_TABPRECO_ERP, 
         dbcontrol1049999.bdapre01. "vdprdbda_descto_9"   AS DESCONTO_MAXIMO 
  FROM   dbcontrol1049999.bdapre01 
  WHERE  dbcontrol1049999.bdapre01. "vdprdbda_cancsn" = 0 
         AND dbcontrol1049999.bdapre01. "vdprdbda_bandprec_9" > 0 