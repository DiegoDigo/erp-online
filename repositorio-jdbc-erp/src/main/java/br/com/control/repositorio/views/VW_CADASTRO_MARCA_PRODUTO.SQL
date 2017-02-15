CREATE VIEW dbcontrol1049999. "VW_CADASTRO_MARCA_PRODUTO" 
AS 
  SELECT dbcontrol1049999.marprd01. "vdprdmar_marca" AS CODIGO_MARCA_PRODUTO_ERP, 
         dbcontrol1049999.marprd01. "vdprdmar_descr" AS DESCRICAO 
  FROM   dbcontrol1049999.marprd01 
  WHERE  ( dbcontrol1049999.marprd01. "vdprdmar_marca" = @CODIGO_MARCA_PRODUTO 
            OR codigo_marca_produto = 0 ) 