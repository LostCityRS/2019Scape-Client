@echo off
java -Xmx384m -Xss2m -Dsun.java2d.noddraw=true -XX:CompileThreshold=1500 -Xincgc -XX:+UseConcMarkSweepGC -XX:+UseParNewGC -cp ref/innerpack.patched.jar AppletViewer
