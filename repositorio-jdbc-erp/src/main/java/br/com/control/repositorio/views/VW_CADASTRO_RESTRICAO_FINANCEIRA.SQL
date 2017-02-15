CREATE VIEW dbcontrol1049999. "VW_CADASTRO_RESTRICAO_FINANCEIRA" 
AS 
  SELECT 1                                                         AS ativo, 
         Concat(Cast(dbcontrol1049999.txpalm01. "vdcnftxp_tpcobr" AS VARCHAR(2)), 
         Cast( 
         dbcontrol1049999.txpalm01. "vdcnftxp_cpg" AS VARCHAR(2))) AS 
         codigo_restricao_financeira, 
         dbcontrol1049999.txpalm01. "vdcnftxp_descto"              AS desconto, 
         dbcontrol1049999.txpalm01. "vdcnftxp_descmax"             AS 
            desconto_maximo, 
         dbcontrol1049999.txpalm01. "vdcnftxp_taxa"                AS taxa, 
         dbcontrol1049999.txpalm01. "vdcnftxp_vrpedmax"            AS 
            valor_maximo_pedido, 
         dbcontrol1049999.txpalm01. "vdcnftxp_vlrpedmin"           AS 
            valor_minimo_pedido, 
         dbcontrol1049999.txpalm01. "vdcnftxp_cpg"                 AS 
            codigo_condicao_pagamento_rec_id, 
         dbcontrol1049999.txpalm01. "vdcnftxp_tpcobr"              AS 
            codigo_tipo_cobranca_rec_id 
  FROM   dbcontrol1049999.txpalm01 