package com.jagex;

import deob.ObfuscatedName;

import java.util.HashMap;
import java.util.Iterator;

@ObfuscatedName("ei")
public class class144 implements Runnable {

	// $FF: synthetic field
	public final class931 this$0;

	public class144(class931 arg0) {
		this.this$0 = arg0;
	}

	public void run() {
		label36: while (true) {
			try {
				if (!this.this$0.field10681) {
					HashMap var1 = this.this$0.method16802();
					Iterator var2 = var1.keySet().iterator();
					while (true) {
						class473 var3;
						do {
							if (!var2.hasNext()) {
								class214.method1571(25L);
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
				JagException.method9845(null, var7);
			}
			return;
		}
	}
}
