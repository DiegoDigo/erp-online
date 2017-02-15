CREATE VIEW dbcontrol1049999. "VW_CADASTRO_FAMILIA_PRODUTO" 
AS 
  SELECT dbcontrol1049999.cadfam01. "vdprdfam_fameb" AS CODIGO_FAMEB, 
         dbcontrol1049999.cadfam01. "vdprdfam_cod"   AS 
         CODIGO_FAMILIA_PRODUTO_ERP, 
         dbcontrol1049999.cadfam01. "vdprdfam_nome"  AS DESCRICAO 
  FROM   dbcontrol1049999.cadfam01 
  WHERE  ( dbcontrol1049999.cadfam01. "vdprdfam_cod" = @CODIGO_FAMILIA 
            OR @CODIGO_FAMILIA = 0 ) 