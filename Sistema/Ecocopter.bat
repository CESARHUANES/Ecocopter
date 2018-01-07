SET RUTA=\\CHUANES\Sistema
%RUTA%\jre7\bin\java.exe -jar %RUTA%\Ecocopter\Ecocopter.jar  
%RUTA%\Ecocopter\conexion\ParametrosConexion.properties

 
if %USERNAME%==soporte c:\windows\explorer.exe
if %USERNAME%==Administrator c:\windows\explorer.exe
if %USERNAME%==oracle c:\windows\explorer.exe
if %USERNAME%==ventas  shutdown -l
if %USERNAME%==auditor  shutdown -l
