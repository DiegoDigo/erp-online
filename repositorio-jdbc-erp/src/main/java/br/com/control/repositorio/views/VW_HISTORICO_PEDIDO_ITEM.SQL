CREATE VIEW dbcontrol1049999. "VW_HISTORICO_PEDIDO_ITEM" 
AS 
  SELECT dbcontrol1049999.pedit01. "vdpedipe_item"    AS NUMERO_ITEM_PEDIDO, 
         Mod(dbcontrol1049999.pedit01. "vdpedipe_preprdt", 
         dbcontrol1049999.pedit01. "vdpedipe_qtdprd") AS PRECO_PRODUTO, 
         dbcontrol1049999.pedit01. "vdpedipe_qtdret"  AS QUANTIDADE_AVULSA, 
         dbcontrol1049999.pedit01. "vdpedipe_qtdprd"  AS QUANTIDADE_CAIXA, 
         dbcontrol1049999.pedit01. "vdpedipe_nit"     AS NUMERO_PEDIDO_REC_ID, 
         dbcontrol1049999.pedit01. "vdpedipe_ocokd"   AS CODIGO_OCORRENCIA_REC_ID 
         , 
         dbcontrol1049999.pedit01. "vdpedipe_tbprd"   AS 
         CODIGO_TABELA_PRECO_REC_ID 
            , 
         dbcontrol1049999.pedit01. "vdpedipe_codr"    AS 
            CODIGO_PRODUTO_REC_ID 
  FROM   dbcontrol1049999.pedit01, 
         dbcontrol1049999.pedcp01 
  WHERE  dbcontrol1049999.pedcp01. "vdpedcpe_dtemiped" >= Cast( 
                Replace(Cast(Curdate() - 45 
                             AS VARCHAR(10)), '-', '') AS INT) 
         AND dbcontrol1049999.pedcp01. "vdpedcpe_dtemiped" <= Cast( 
             Replace(Cast(Curdate() AS 
                          VARCHAR( 
                     10)), '-', '') AS INT) 
         AND dbcontrol1049999.pedit01. "vdpedipe_qtdprd" > 0 
         AND dbcontrol1049999.pedcp01. "vdpedcpe_nped" = 
             dbcontrol1049999.pedit01. "vdpedipe_nit" 