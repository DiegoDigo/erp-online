CREATE VIEW dbcontrol1049999. "VW_CAD_CANAL" 
AS 
  SELECT CASE 
           WHEN dbcontrol1049999.ccat01. "vdclicat_cancsn" = 0 THEN 1 
           ELSE 0 
         END                                             AS ATIVO, 
         dbcontrol1049999.ccat01. "vdclicat_autoserv"    AS AUTO_SERVICO, 
         dbcontrol1049999.ccat01. "vdclicat_cod"         AS CODIGO_CANAL, 
         dbcontrol1049999.ccat01. "vdclicat_grpcan"      AS CODIGO_GRUPO_CANAL, 
         dbcontrol1049999.ccat01. "vdclicat_nome"        AS DESCRICAO, 
         dbcontrol1049999.ccat01. "vdclicat_descr_compl" AS 
         DESCRICAO_COMPLEMENTAR, 
         dbcontrol1049999.ccat01. "vdclicat_descr_compl" AS DIVISAO_CANAL 
  FROM   dbcontrol1049999.ccat01 
  WHERE  dbcontrol1049999.ccat01. "vdclicat_cod" > @CODIGO_CANAL 
         AND dbcontrol1049999.ccat01. "vdclicat_cod" > '00' 