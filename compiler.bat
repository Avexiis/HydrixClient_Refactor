@echo off
title Client Compiler
echo starting...
"C:\Program Files\Java\jdk1.8.0_202\bin\javac" ^
    -XDignore.symbol.file ^
    -cp "lib\*;" ^
    -d bin ^
    -sourcepath src ^
    src\*.java
@pause
