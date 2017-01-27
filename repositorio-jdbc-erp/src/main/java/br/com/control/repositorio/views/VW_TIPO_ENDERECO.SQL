CREATE VIEW dbcontrol1049999. "VW_TIPO_ENDERECO" 
AS 
  SELECT @ATIVO                                    AS ATIVO, 
         dbcontrol1049999.ceptip. "gegentip_cod"   AS DESCRICAO_LOGRADOURO, 
         dbcontrol1049999.ceptip. "gegentip_sigla" AS SIGLA_LOGRADOURO 
  FROM   dbcontrol1049999.ceptip 
  GROUP  BY ativo, 
            descricao_logradouro, 
            sigla_logradouro 