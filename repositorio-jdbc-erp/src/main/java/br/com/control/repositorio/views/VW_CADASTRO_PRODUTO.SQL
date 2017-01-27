CREATE VIEW dbcontrol1049999. "VW_CADASTRO_PRODUTO" 
AS 
  SELECT CASE 
           WHEN dbcontrol1049999.cadprd01. "vdprdprd_flag" = 'A' THEN 1 
           ELSE 0 
         END                                                 AS ATIVO, 
         dbcontrol1049999.cadprd01. "vdprdprd_bonifica_unid" AS BONIFICA_UNIDADE, 
         dbcontrol1049999.cadprd01. "vdprdprd_clasf"         AS CLASS_FISCAL, 
         NULL                                                AS CODIGO_EAN_FAB, 
         dbcontrol1049999.cadprd01. "vdprdprd_codr"          AS 
         CODIGO_PRODUTO_ERP, 
         dbcontrol1049999.cadprd01. "vdprdprd_descr"         AS DESCRICAO, 
         dbcontrol1049999.cadprd01. "vdprdprd_descri"        AS DESCRICAO_RED, 
         dbcontrol1049999.cadprd01. "vdprdprd_ipipauta"      AS IPI_PAUTA, 
         dbcontrol1049999.cadprd01. "vdprdprd_linha"         AS LINHA, 
         dbcontrol1049999.cadprd01. "vdprdprd_medida"        AS LITRAGEM, 
         NULL                                                AS 
            PERCENTUAL_BONUS_GERA, 
         NULL                                                AS 
            PERCENTUAL_BONUS_USA, 
         dbcontrol1049999.cadprd01. "vdprdprd_permite_bonif" AS 
         PERMITE_BONIFICACAO 
            , 
         dbcontrol1049999.cadprd01. "vdprdprd_peso"          AS PESO, 
         dbcontrol1049999.cadprd01. "vdprdprd_pesoemb"       AS PESO_EMB, 
         dbcontrol1049999.cadprd01. "vdprdprd_qtdminvd"      AS QTD_MIN_VENDA_AV, 
         NULL                                                AS QTD_MIN_VENDA_CX 
         , 
         dbcontrol1049999.cadprd01. "vdprdprd_qtdun"         AS 
         QUANTIDADE_CX, 
         dbcontrol1049999.cadprd01. "vdprdprd_tipobanda"     AS TIPO_BANDA, 
         dbcontrol1049999.cadprd01. "vdprdprd_tipo"          AS TIPO_PRODUTO, 
         NULL                                                AS 
            UTILIZA_BANDA_PRECO_TIPO, 
         NULL                                                AS 
         VALOR_MINIMO_BONUS 
            , 
         dbcontrol1049999.cadprd01. "vdprdprd_tipoqtdvdcx"   AS 
            VENDA_MULTI_MIN_CX, 
         dbcontrol1049999.cadprd01. "vdprdprd_tipoqtdvd"     AS 
         VENDA_MULTI_MIN_AV, 
         CASE 
           WHEN dbcontrol1049999.cadprd01. "vdprdprd_enc" = 'S' THEN 1 
           ELSE 0 
         END                                                 AS VENDA_AVULSO, 
         CASE 
           WHEN dbcontrol1049999.cadprd01. "vdprdprd_tipo" = 'P' THEN 1 
           ELSE 0 
         END                                                 AS 
            VISIBILIDADE_PORTAL, 
         dbcontrol1049999.cadprd01. "vdprdprd_catprd"        AS 
            CODIGO_CATEGORIA_PRODUTO_ERP, 
         dbcontrol1049999.cadprd01. "vdprdprd_cfam"          AS 
            CODIGO_FAMILIA_PRODUTO_ERP, 
         dbcontrol1049999.cadprd01. "vdprdprd_grpprd"        AS 
            CODIGO_GRUPO_PRODUTO_ERP, 
         dbcontrol1049999.cadprd01. "vdprdprd_marprd"        AS 
            CODIGO_MARCA_PRODUTO_ERP 
  FROM   dbcontrol1049999.cadprd01 
  WHERE  dbcontrol1049999.cadprd01. "vdprdprd_cfam" > @CODIGO_FAMILIA 
         AND dbcontrol1049999.cadprd01. "vdprdprd_nro" > @CODIGO_SEQUENCIA 
         AND dbcontrol1049999.cadprd01. "vdprdprd_flag" = 'A' 
         AND dbcontrol1049999.cadprd01. "vdprdprd_prdpalm" = 0 
         AND ( dbcontrol1049999.cadprd01. "vdprdprd_codr" = @CODIGO_PROD 
                OR @CODIGO_PROD = 0 ) 