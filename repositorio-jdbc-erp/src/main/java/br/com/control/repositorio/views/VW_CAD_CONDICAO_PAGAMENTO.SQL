CREATE VIEW dbcontrol1049999. "VW_CAD_CONDICAO_PAGAMENTO" 
AS 
  SELECT dbcontrol1049999.condpg01. "vdcadpag_ativo"  AS ATIVO, 
         dbcontrol1049999.condpg01. "vdcadpag_cod"    AS 
            CODIGO_CONDICAO_PAGAMENTO_ERP, 
         dbcontrol1049999.condpg01. "vdcadpag_descr"  AS DESCRICAO, 
         CASE 
           WHEN dbcontrol1049999.condpg01. "vdcadpag_cod" = 1 THEN 1 
           ELSE 0 
         END                                          AS 
         INFORMA_PRIMEIRA_PARCELA, 
         dbcontrol1049999.condpg01. "vdcadpag_nrdias" AS NUMERO_DIAS, 
         dbcontrol1049999.condpg01. "vdcadpag_prazo"  AS PRAZO 
  FROM   dbcontrol1049999.condpg01 
  WHERE  ( dbcontrol1049999.condpg01. "vdcadpag_cod" = @CODIGO_CONDICAO_PAGAMENTO 
            OR @CODIGO_CONDICAO_PAGAMENTO = 0 ) 