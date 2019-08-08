@ECHO OFF
IF %1.==. GOTO No1

GOTO deploy
:No1
  ECHO Digite a versao.

:deploy
    call mvn clean install -P LOCAL -DskipTests=true
    call docker build -t linkedby/erp-online:%1 .
    call docker build -t linkedby/erp-online:latest .
    call docker login --username linkedby --password @Control2019
    call docker push linkedby/erp-online:%1
    call docker push linkedby/erp-online:latest