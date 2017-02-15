CREATE VIEW dbcontrol1049999. "VW_CADASTRO_BANDA_PRECO_REST" 
AS 
  SELECT 1                                         AS ATIVO, 
         Cast(Cast(dbcontrol1049999.bdapre01. "vdprdbda_fam" AS VARCHAR(3)) 
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
              VARCHAR(50))                         AS CODIGO_BANDA_PRECO_ERP, 
         dbcontrol1049999.bdapre01. "vdprdbda_ven" AS CODIGO_VENDEDOR_ERP 
  FROM   dbcontrol1049999.bdapre01 
  WHERE  dbcontrol1049999.bdapre01. "vdprdbda_cancsn" = 0 
         AND dbcontrol1049999.bdapre01. "vdprdbda_ven" <> '   ' 