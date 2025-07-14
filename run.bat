@echo off
"C:\Program Files\Java\jre1.8.0_202\bin\java.exe" ^
  -Xmx2048m -Xss2m ^
  -Dsun.java2d.noddraw=true ^
  -XX:CompileThreshold=1500 ^
  -Xincgc -XX:+UseConcMarkSweepGC -XX:+UseParNewGC ^
  -cp bin;^
lib/clientlibs.jar;^
lib/lwjgl.jar;^
lib/substance.jar;^
lib/java-discord-rpc-2.0.1-all.jar;^
lib/jackson-core-2.15.2.jar;^
lib/jackson-databind-2.15.2.jar;^
lib/jackson-annotations-2.15.2.jar ^
  Loader
pause
