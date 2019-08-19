@ECHO OFF
IF %1.==. GOTO No1
IF %2.==. GOTO No2

GOTO deploy

:No1
  ECHO Digite a versao.

:No2
  ECHO Digite o ambiente.

:deploy
    call mvn clean install -P LOCAL -DskipTests=true
    call docker build -t linkedby/erp-online-%2:%1 .
    call docker build -t linkedby/erp-online-%2:latest .
    call docker login --username linkedby --password @Control2019
    call docker push linkedby/erp-online-%2:%1
    call docker push linkedby/erp-online-%2:latest