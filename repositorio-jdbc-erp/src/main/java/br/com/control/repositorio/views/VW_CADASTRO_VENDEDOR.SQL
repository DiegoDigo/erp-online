CREATE VIEW dbcontrol1049999. "VW_CADASTRO_VENDEDOR" 
AS 
  SELECT 1                                           AS ATIVO, 
         dbcontrol1049999.cadven01. "vdvenven_sigla" AS CODIGO_VENDEDOR_ERP, 
         dbcontrol1049999.cadven01. "vdvenven_nome"  AS NOME, 
         dbcontrol1049999.cadven01. "vdvenven_ddd"   AS TELEFONE_DD, 
         dbcontrol1049999.cadven01. "vdvenven_tel"   AS TELEFONE_TRONCO, 
         '01'                                        AS TIPO 
  FROM   dbcontrol1049999.cadven01 
  WHERE  ( dbcontrol1049999.cadven01. "vdvenven_sigla" = @CODIGO_VENDEDOR 
            OR @CODIGO_VENDEDOR = '' ) 
         AND ( dbcontrol1049999.cadven01. "vdvenven_nivel" = 4 
                OR dbcontrol1049999.cadven01. "vdvenven_nivel" = 5 ) 
         AND ( dbcontrol1049999.cadven01. "vdvenven_tpven" = 'V' 
                OR dbcontrol1049999.cadven01. "vdvenven_tpven" = 'R' ) 