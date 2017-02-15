CREATE VIEW dbcontrol1049999. "VW_CADASTRO_GRUPO_PRODUTO" 
AS 
  SELECT dbcontrol1049999.grpprd01. "vdprdgrp_grupo" AS CODIGO_GRUPO_PRODUTO_ERP, 
         dbcontrol1049999.grpprd01. "vdprdgrp_descr" AS DESCRICAO 
  FROM   dbcontrol1049999.grpprd01 
  WHERE  ( dbcontrol1049999.grpprd01. "vdprdgrp_grupo" = @CODIGO_GRUPO_PRODUTO 
            OR @CODIGO_GRUPO_PRODUTO = 0 ) 