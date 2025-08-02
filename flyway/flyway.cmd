@echo off
REM === Project-local flyway.cmd ===
REM Delegates to the Flyway CLI installed at C:\app\flyway

set FLYWAY_HOME=C:\app\flyway
set FLYWAY_CONF=%~dp0\flyway.conf
set FLYWAY_LOCATIONS=filesystem:%~dp0..\src\main\resources\db\migration

"%FLYWAY_HOME%\flyway" ^
  -configFiles="%FLYWAY_CONF%" ^
  -locations="%FLYWAY_LOCATIONS%" ^
  %*
