CREATE VIEW dbcontrol1049999. "VW_CADASTRO_DETALHE_PRODUTO_COMBO" 
AS 
  SELECT dbcontrol1049999.vdprdcbo. "vdprdcbo_qtdcx"   AS QUANTIDADE_CAIXA, 
         dbcontrol1049999.vdprdcbo. "vdprdcbo_qtdav"   AS QUANTIDADE_AVULSO, 
         dbcontrol1049999.vdprdcbo. "vdprdcbo_codrprd" AS CODIGO_PRODUTO_ERP, 
         dbcontrol1049999.vdprdcbo. "vdprdcbo_codcbo"  AS 
         CODIGO_PRODUTO_COMBO_ERP 
  FROM   dbcontrol1049999.vdprdcbo 
  WHERE  dbcontrol1049999.vdprdcbo. "vdprdcbo_codrprd" <> 0 