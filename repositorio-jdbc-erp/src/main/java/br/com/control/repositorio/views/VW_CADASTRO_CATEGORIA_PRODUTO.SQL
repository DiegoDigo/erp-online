CREATE VIEW dbcontrol1049999. "VW_CADASTRO_CATEGORIA_PRODUTO" 
AS 
  SELECT dbcontrol1049999.catprd01. "vdprdcat_nr"    AS 
         CODIGO_CATEGORIA_PRODUTO_ERP, 
         dbcontrol1049999.catprd01. "vdprdcat_descr" AS DESCRICAO 
  FROM   dbcontrol1049999.catprd01 
  WHERE  ( dbcontrol1049999.catprd01. "vdprdcat_nr" = @CODIGO_CATEGORIA_PRODUTO 
            OR @CODIGO_CATEGORIA_PRODUTO = 0 ) 