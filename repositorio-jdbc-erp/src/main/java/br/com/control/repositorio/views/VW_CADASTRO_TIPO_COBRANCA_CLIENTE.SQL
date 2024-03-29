CREATE VIEW dbcontrol1049999. "VW_CADASTRO_TIPO_COBRANCA_CLIENTE" 
AS 
  SELECT 1                                             AS ATIVO, 
         Concat(CASE 
                  WHEN Length(Cast(dbcontrol1049999.cadcli01. "vdclicli_regi" AS 
                                   CHAR(4))) 
                       = 1 
                THEN Concat('000', Cast(dbcontrol1049999.cadcli01. 
                                        "vdclicli_regi" 
                                        AS 
                                        VARCHAR(4)) 
                     ) 
                  WHEN Length(Cast(dbcontrol1049999.cadcli01. "vdclicli_regi" AS 
                                   CHAR(4))) 
                       = 2 
                THEN Concat('00', Cast(dbcontrol1049999.cadcli01. "vdclicli_regi" 
                                       AS 
                                       VARCHAR(4))) 
                  WHEN Length(Cast(dbcontrol1049999.cadcli01. "vdclicli_regi" AS 
                                   CHAR(4))) 
                       = 3 
                THEN Concat('0', Cast(dbcontrol1049999.cadcli01. "vdclicli_regi" 
                                      AS 
                                      VARCHAR(4))) 
                  WHEN Length(Cast(dbcontrol1049999.cadcli01. "vdclicli_regi" AS 
                                   CHAR(4))) 
                       = 4 
                THEN Cast(dbcontrol1049999.cadcli01. "vdclicli_regi" AS VARCHAR(4 
                          )) 
                END, CASE 
                       WHEN Length(Cast(dbcontrol1049999.cadcli01. "vdclicli_num" 
                                        AS CHAR( 
                                        4))) = 1 
                     THEN Concat('000', Cast(dbcontrol1049999.cadcli01. 
                                             "vdclicli_num" AS 
                                             VARCHAR(4))) 
                       WHEN Length(Cast(dbcontrol1049999.cadcli01. "vdclicli_num" 
                                        AS CHAR( 
                                        4))) = 2 
                     THEN Concat('00', Cast(dbcontrol1049999.cadcli01. 
                                            "vdclicli_num" AS 
                                            VARCHAR(4))) 
                       WHEN Length(Cast(dbcontrol1049999.cadcli01. "vdclicli_num" 
                                        AS CHAR( 
                                        4))) = 3 
                     THEN Concat('0', Cast(dbcontrol1049999.cadcli01. 
                                           "vdclicli_num" AS 
                                           VARCHAR(4))) 
                       WHEN Length(Cast(dbcontrol1049999.cadcli01. "vdclicli_num" 
                                        AS CHAR( 
                                        4))) = 4 
                     THEN Cast(dbcontrol1049999.cadcli01. "vdclicli_num" AS 
                               VARCHAR 
                               (4)) 
                     END)                              AS CODIGO_CLIENTE_ERP, 
         dbcontrol1049999.cadcli01. "vdclicli_tpcobra" AS 
         CODIGO_TIPO_COBRANCA_ERP 
  FROM   dbcontrol1049999.cadcli01 
  WHERE  dbcontrol1049999.cadcli01. "vdclicli_classe" <> 20 
          OR (SELECT dbcontrol1049999.tbblocli. "vdcadblo_impclipalm" 
              FROM   dbcontrol1049999.tbblocli 
              WHERE  dbcontrol1049999.tbblocli. "vdcadblo_cod" = 
                     dbcontrol1049999.cadcli01. "vdclicli_motblo") = 1 