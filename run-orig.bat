@echo off
java -Xmx384m -Xss2m -Dsun.java2d.noddraw=true -XX:CompileThreshold=1500 -cp ref/innerpack.patched.jar AppletViewer
