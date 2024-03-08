package com.jagex;

import deob.ObfuscatedName;

import java.util.HashMap;
import java.util.Iterator;

@ObfuscatedName("tp")
public class class545 implements Runnable {

	// $FF: synthetic field
	public final class932 this$0;

	public class545(class932 arg0) {
		this.this$0 = arg0;
	}

	public void run() {
		label54: while (true) {
			try {
				if (!this.this$0.field10690) {
					Iterator var1 = this.this$0.field10693.iterator();
					while (var1.hasNext()) {
						class544 var2 = (class544) var1.next();
						var2.method8646();
					}
					HashMap var3 = this.this$0.method16804();
					Iterator var4 = var3.keySet().iterator();
					while (true) {
						class473 var5;
						do {
							if (!var4.hasNext()) {
								Iterator var8 = this.this$0.field10693.iterator();
								while (var8.hasNext()) {
									class544 var9 = (class544) var8.next();
									var9.method8647();
								}
								PreciseSleep.sleep(6L);
								continue label54;
							}
							var5 = (class473) var4.next();
						} while (var5.field4856);
						class480[] var6 = (class480[]) var3.get(var5);
						for (int var7 = 0; var7 < var6.length; var7++) {
							var6[var7].method7507();
						}
					}
				}
			} catch (Exception var11) {
				JagException.method9845(null, var11);
				var11.printStackTrace();
			}
			return;
		}
	}
}
