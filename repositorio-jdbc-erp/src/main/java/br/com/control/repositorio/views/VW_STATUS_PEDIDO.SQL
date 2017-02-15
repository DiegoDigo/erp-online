CREATE VIEW dbcontrol1049999. "VW_STATUS_PEDIDO" 
AS 
  SELECT dbcontrol1049999.vdpedflc. "vdpedflc_nped"         AS 
         NUMERO_PEDIDO_GESTAO, 
         dbcontrol1049999.vdpedflc. "vdpedflc_sit_nped"     AS 
            SITUACAO_PEDIDO_GESTAO, 
         dbcontrol1049999.vdpedflc. "vdpedflc_pnped"        AS 
            NUMERO_PRE_PEDIDO_GESTAO, 
         dbcontrol1049999.vdpedflc. "vdpedflc_croma"        AS NUMERO_ROMANEIO, 
         dbcontrol1049999.vdpedflc. "vdpedflc_sit_crom"     AS SITUACAO_ROMANEIO, 
         dbcontrol1049999.vdpedflc. "vdpedflc_serie"        AS SERIE_NFISCAL, 
         dbcontrol1049999.vdpedflc. "vdpedflc_nf"           AS NUMERO_NFISCAL, 
         dbcontrol1049999.vdpedflc. "vdpedflc_cod_bloq_ped" AS CODIGO_BLOQ_PEDIDO 
  FROM   dbcontrol1049999.vdpedflc 
  WHERE  dbcontrol1049999.vdpedflc. "vdpedflc_pnped" > 0 
         AND ( dbcontrol1049999.vdpedflc. "vdpedflc_status_integ" = '0' 
                OR dbcontrol1049999.vdpedflc. "vdpedflc_status_integ" = '' ) 
         AND ( dbcontrol1049999.vdpedflc. "vdpedflc_pnped" = @CODIGOPREPEDIDO 
                OR @CODIGOPREPEDIDO = 0 ) 