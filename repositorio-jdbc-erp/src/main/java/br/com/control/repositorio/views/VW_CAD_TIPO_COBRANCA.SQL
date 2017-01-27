CREATE VIEW dbcontrol1049999. "VW_CAD_TIPO_COBRANCA" 
AS 
  SELECT dbcontrol1049999.tpcobr01. "vdcadtco_ativo"     AS ATIVO, 
         dbcontrol1049999.tpcobr01. "vdcadtco_cod"       AS 
            CODIGO_TIPO_COBRANCA_ERP, 
         dbcontrol1049999.tpcobr01. "vdcadtco_descricao" AS DESCRICAO, 
         dbcontrol1049999.tpcobr01. "vdcadtco_prazo"     AS PRAZO, 
         dbcontrol1049999.tpcobr01. "vdcadtco_redcnt"    AS RED, 
         dbcontrol1049999.tpcobr01. "vdcadtco_redcnt"    AS RED_F 
  FROM   dbcontrol1049999.tpcobr01 
  WHERE  dbcontrol1049999.tpcobr01. "vdcadtco_cod" > @CODIGO_TIPO_COBRANCA 