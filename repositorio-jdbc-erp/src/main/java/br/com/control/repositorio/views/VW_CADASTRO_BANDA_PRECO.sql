CREATE VIEW dbcontrol1049999. "VW_CADASTRO_BANDA_PRECO" 
AS 
  SELECT 1                                                      AS ATIVO, 
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
              VARCHAR(50))                                      AS 
            CODIGO_BANDA_PRECO_ERP, 
         dbcontrol1049999.bdapre01. "vdprdbda_fam"              AS CODIGO_FAMEB, 
         dbcontrol1049999.bdapre01. "vdprdbda_grpcli"           AS 
            CODIGO_GRUPO_ANALISE_CLI, 
         dbcontrol1049999.bdapre01. "vdprdbda_grpcan"           AS 
            CODIGO_GRUPO_CANAL_CLI, 
         dbcontrol1049999.bdapre01. "vdprdbda_pst"              AS 
         CODIGO_PASTA_CLI 
            , 
         NULL                                                   AS 
            DESCRICAO, 
         CASE 
           WHEN dbcontrol1049999.bdapre01. "vdprdbda_importado" = 'S' THEN 
           'IMPORTADO' 
           ELSE 'MANUAL' 
         END                                                    AS ORIGEM_BANDA, 
         dbcontrol1049999.bdapre01. "vdprdbda_reg"              AS REGIAO_CLIENTE 
         , 
         dbcontrol1049999.bdapre01. "vdprdbda_caixa_unid"       AS 
         UNIDADE, 
         dbcontrol1049999.bdapre01. "vdprdbda_can"              AS 
         CODIGO_CANAL_ERP 
            , 
         dbcontrol1049999.bdapre01. "vdprdbda_cat"              AS 
            CODIGO_CATEGORIA_PRODUTO_ERP, 
         dbcontrol1049999.bdapre01. "vdprdbda_fam"              AS 
            CODIGO_FAMILIA_PRODUTO_ERP, 
         dbcontrol1049999.bdapre01. "vdprdbda_grp"              AS 
            CODIGO_GRUPO_PRODUTO_ERP, 
         dbcontrol1049999.bdapre01. "vdprdbda_mar"              AS 
            CODIGO_MARCA_PRODUTO_ERP, 
         (SELECT dbcontrol1049999.cadprd01. "vdprdprd_codr" 
          FROM   dbcontrol1049999.cadprd01 
          WHERE  dbcontrol1049999.cadprd01. "vdprdprd_cfam" = 
                         dbcontrol1049999.bdapre01. "vdprdbda_fam" 
                 AND dbcontrol1049999.cadprd01. "vdprdprd_nro" = 
                     dbcontrol1049999.bdapre01. "vdprdbda_prd") AS 
            CODIGO_PRODUTO_ERP, 
         dbcontrol1049999.bdapre01. "vdprdbda_cpg"              AS 
            CODIGO_CONDICAO_PAGAMENTO_ERP 
  FROM   dbcontrol1049999.bdapre01 
  WHERE  dbcontrol1049999.bdapre01. "vdprdbda_cancsn" = 0 ;