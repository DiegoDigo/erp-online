CREATE VIEW dbcontrol1049999. "VW_CADASTRO_TIPO_OCORRENCIA" 
AS 
  SELECT @ATIVO                                        AS ATIVO, 
         CASE dbcontrol1049999.cadoco01. "vdnopoco_tipooco" 
           WHEN 01 THEN 'Vendas' 
           ELSE 
             CASE dbcontrol1049999.cadoco01. "vdnopoco_tipooco" 
               WHEN 02 THEN 'Bonificacao' 
               ELSE 
                 CASE dbcontrol1049999.cadoco01. "vdnopoco_tipooco" 
                   WHEN 03 THEN 'Troca' 
                   ELSE 
                     CASE dbcontrol1049999.cadoco01. "vdnopoco_tipooco" 
                       WHEN 04 THEN 'Indenizacao' 
                       ELSE 
                         CASE dbcontrol1049999.cadoco01. "vdnopoco_tipooco" 
                           WHEN 05 THEN 'Cev Recolhimento' 
                           ELSE 
                             CASE dbcontrol1049999.cadoco01. "vdnopoco_tipooco" 
                               WHEN 06 THEN 'Cev Recolhimento FE' 
                               ELSE 
                                 CASE dbcontrol1049999.cadoco01. 
                                      "vdnopoco_tipooco" 
                                   WHEN 07 THEN 'Cev Saida' 
                                   ELSE 
                                     CASE dbcontrol1049999.cadoco01. 
                                          "vdnopoco_tipooco" 
                                       WHEN 08 THEN 'Cev Saida FE' 
                                       ELSE 
                                         CASE dbcontrol1049999.cadoco01. 
                                              "vdnopoco_tipooco" 
                                           WHEN 09 THEN 'Cev Saida SL' 
                                           ELSE 
                                             CASE dbcontrol1049999.cadoco01. 
                                                  "vdnopoco_tipooco" 
                                               WHEN 10 THEN 'Cev Saida FESL' 
                                               ELSE 
                                                 CASE dbcontrol1049999.cadoco01. 
                                                      "vdnopoco_tipooco" 
                                                   WHEN 11 THEN 
                                                   'Bonificacao Solavanco' 
                                                   ELSE 
                                                     CASE 
                                             dbcontrol1049999.cadoco01. 
                                             "vdnopoco_tipooco" 
                                                       WHEN 12 THEN 
                                                       'Recolhimento CEV' 
                                                       ELSE 
                                 CASE dbcontrol1049999.cadoco01. 
                                      "vdnopoco_tipooco" 
                                   WHEN 13 THEN 
                                   'Recolhimento CEV FE' 
                                   ELSE 
                                     CASE dbcontrol1049999.cadoco01. 
                                          "vdnopoco_tipooco" 
                                       WHEN 14 THEN 
                                       'Recolhimento Vasilhame' 
                                       ELSE 
                                         CASE 
                                 dbcontrol1049999.cadoco01. 
                                 "vdnopoco_tipooco" 
                                           WHEN 15 THEN 
                                           'Recolhimento Vasilhame FE' 
                                           ELSE 
                                             CASE 
                                     dbcontrol1049999.cadoco01. 
                                     "vdnopoco_tipooco" 
                                               WHEN 16 THEN 'VIMOB' 
                                               ELSE 
                                                 CASE 
                                         dbcontrol1049999.cadoco01. 
                                         "vdnopoco_tipooco" 
                                                   WHEN 17 THEN 
                                                   'Inventario' 
                                                   ELSE 
                                                     CASE 
                                             dbcontrol1049999.cadoco01. 
                                             "vdnopoco_tipooco" 
                                                       WHEN 18 THEN 
                                                       'Descarga' 
                                                       ELSE 
                                             CASE 
                                     dbcontrol1049999.cadoco01. 
                                     "vdnopoco_tipooco" 
                                               WHEN 19 THEN 
                                               'Descarga Tipo80' 
                                               ELSE 
                                                 CASE 
                     dbcontrol1049999.cadoco01. 
                     "vdnopoco_tipooco" 
                     WHEN 20 THEN 'Venda Verba' 
                     ELSE 
                     CASE 
                     dbcontrol1049999.cadoco01. 
                     "vdnopoco_tipooco" 
                     WHEN 21 THEN 
                     'Bonificacao Automatica' 
                     ELSE 
                     CASE 
                     dbcontrol1049999.cadoco01. 
                     "vdnopoco_tipooco" 
                     WHEN 22 THEN 
                     'Transferencia' 
                     ELSE 
                     CASE 
                     dbcontrol1049999.cadoco01. 
                     "vdnopoco_tipooco" 
                     WHEN 99 THEN 
                     'Outros' 
                     END 
                     END 
                     END 
                     END 
                     END 
                     END 
                     END 
                     END 
                     END 
                     END 
                     END 
                     END 
                     END 
                     END 
                     END 
                     END 
                     END 
                     END 
                     END 
                     END 
                 END 
             END 
         END                                           AS DESCRICAO, 
         dbcontrol1049999.cadoco01. "vdnopoco_tipooco" AS 
            CODIGO_TIPO_OCORRENCIA_ERP 
  FROM   dbcontrol1049999.cadoco01 
  WHERE  dbcontrol1049999.cadoco01. "vdnopoco_tipooco" > 0 
  GROUP  BY ativo, 
            descricao, 
            codigo_tipo_ocorrencia_erp 
  HAVING Count(DISTINCT dbcontrol1049999.cadoco01. "vdnopoco_tipooco", 
                dbcontrol1049999.cadoco01. "vdnopoco_tipooco" > 0) > 0 