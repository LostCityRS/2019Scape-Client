package com.jagex;

import deob.ObfuscatedName;

import java.util.HashMap;
import java.util.Iterator;

@ObfuscatedName("tv")
public class JavaSoundBackend_Task2 implements Runnable {

	// $FF: synthetic field
	public final JavaSoundBackend this$0;

	public JavaSoundBackend_Task2(JavaSoundBackend arg0) {
		this.this$0 = arg0;
	}

	public void run() {
		label36: while (true) {
			try {
				if (!this.this$0.field10690) {
					HashMap var1 = this.this$0.method16804();
					Iterator var2 = var1.keySet().iterator();
					while (true) {
						class473 var3;
						do {
							if (!var2.hasNext()) {
								PreciseSleep.sleep(10L);
								continue label36;
							}
							var3 = (class473) var2.next();
						} while (var3.field4856);
						class480[] var4 = (class480[]) var1.get(var3);
						for (int var5 = 0; var5 < var4.length; var5++) {
							var4[var5].method7504();
						}
					}
				}
			} catch (Exception var7) {
				JagException.report(null, var7);
				var7.printStackTrace();
			}
			return;
		}
	}
}
