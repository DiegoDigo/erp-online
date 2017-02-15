CREATE VIEW dbcontrol1049999. "VW_HISTORICO_PEDIDO_CAPA" 
AS 
  SELECT CASE 
           WHEN dbcontrol1049999.pedcp01. "vdpedcpe_fl" = 9 THEN 0 
           ELSE 1 
         END                                               AS ATIVO, 
         dbcontrol1049999.pedcp01. "vdpedcpe_motdev"       AS 
            CODIGO_MOTIVO_DEVOLUCAO, 
         dbcontrol1049999.pedcp01. "vdpedcpe_dtemiped"     AS 
            DATA_HORA_EMISSAO_PEDIDO, 
         dbcontrol1049999.pedcp01. "vdpedcpe_dt1vc"        AS DATA_VENCIMENTO, 
         dbcontrol1049999.pedcp01. "vdpedcpe_descfi"       AS DESCONTO_FINANCEIRO 
         , 
         dbcontrol1049999.pedcp01. "vdpedcpe_nped"         AS 
         NUMERO_PEDIDO, 
         dbcontrol1049999.pedcp01. "vdpedcpe_desc"         AS PERCENTUAL_DESCONTO 
         , 
         CASE 
           WHEN dbcontrol1049999.pedcp01. "vdpedcpe_fl" = 9 THEN 'CA' 
           ELSE 
             CASE 
               WHEN dbcontrol1049999.pedcp01. "vdpedcpe_vlr_fcem_r" 
                    + dbcontrol1049999.pedcp01. "vdpedcpe_vlr_fsem_r" 
                    + dbcontrol1049999.pedcp01. "vdpedcpe_vlr_fctr_r" 
                    + dbcontrol1049999.pedcp01. "vdpedcpe_vlr_fstr_r" = 0 THEN 
               'DV' 
               ELSE '0' 
             END 
         END                                               AS STATUS_PEDIDO, 
         dbcontrol1049999.pedcp01. "vdpedcpe_txfin"        AS TAXA_FINANCEIRO, 
         dbcontrol1049999.pedcp01. "vdpedcpe_vlr_fcem_r" 
         + dbcontrol1049999.pedcp01. "vdpedcpe_vlr_fsem_r" 
         + dbcontrol1049999.pedcp01. "vdpedcpe_vlr_fctr_r" 
         + dbcontrol1049999.pedcp01. "vdpedcpe_vlr_fstr_r" AS VALOR_DEVOLUCAO, 
         dbcontrol1049999.pedcp01. "vdpedcpe_vlr_fcem" 
         + dbcontrol1049999.pedcp01. "vdpedcpe_vlr_fsem" 
         + dbcontrol1049999.pedcp01. "vdpedcpe_vlr_fctr" 
         + dbcontrol1049999.pedcp01. "vdpedcpe_vlr_fstr"   AS VALOR_PEDIDO, 
         CASE 
           WHEN Length(Cast(dbcontrol1049999.pedcp01. "vdpedcpe_codcli" AS CHAR(8 
                            )) 
                ) = 5 
         THEN Concat('000', Cast(dbcontrol1049999.pedcp01. "vdpedcpe_codcli" AS 
                                 VARCHAR(8) 
                            )) 
           WHEN Length(Cast(dbcontrol1049999.pedcp01. "vdpedcpe_codcli" AS CHAR(8 
                            )) 
                ) = 6 
         THEN Concat('00', Cast(dbcontrol1049999.pedcp01. "vdpedcpe_codcli" AS 
                                VARCHAR(8)) 
              ) 
           WHEN Length(Cast(dbcontrol1049999.pedcp01. "vdpedcpe_codcli" AS CHAR(8 
                            )) 
                ) = 7 
         THEN Concat('0', Cast(dbcontrol1049999.pedcp01. "vdpedcpe_codcli" AS 
                               VARCHAR(4))) 
           WHEN Length(Cast(dbcontrol1049999.pedcp01. "vdpedcpe_codcli" AS CHAR(8 
                            )) 
                ) = 8 
         THEN Cast(dbcontrol1049999.pedcp01. "vdpedcpe_codcli" AS VARCHAR(8)) 
         END                                               AS 
            CODIGO_CLIENTE_REC_ID, 
         dbcontrol1049999.pedcp01. "vdpedcpe_cpg"          AS 
            CODIGO_CONDICAO_PAGAMENTO_REC_ID, 
         dbcontrol1049999.pedcp01. "vdpedcpe_tpcobr"       AS 
            CODIGO_TIPO_COBRANCA_REC_ID 
  FROM   dbcontrol1049999.pedcp01 
  WHERE  dbcontrol1049999.pedcp01. "vdpedcpe_dtemiped" >= Cast( 
                Replace(Cast(Curdate() - 45 
                             AS VARCHAR(10)), '-', '') AS INT) 
         AND dbcontrol1049999.pedcp01. "vdpedcpe_dtemiped" <= Cast( 
             Replace(Cast(Curdate() AS 
                          VARCHAR( 
                     10)), '-', '') AS INT) 