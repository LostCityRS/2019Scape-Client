package com.jagex;

import com.jagex.deob.ObfuscatedName;
import com.jagex.deob.Statics;
import jaclib.ping.IcmpService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@ObfuscatedName("alr")
public class class1020 extends IcmpService {

	@ObfuscatedName("alr.n")
	public final List field11718 = new ArrayList();

	@ObfuscatedName("ajh.f(Lyh;S)V")
	public static void method17426(class666 arg0) {
		if (Statics.field11719 == null) {
			throw new IllegalStateException("");
		}
		Statics.field11719.field11718.add(arg0);
	}

	@ObfuscatedName("yu.l(I)V")
	public static void method13850() {
		if (Statics.field11719 == null) {
			return;
		}
		try {
			Statics.field11719.quit();
		} catch (Throwable var1) {
		}
		Statics.field11719 = null;
	}

	public void notify(int arg0) {
		Iterator var2 = this.field11718.iterator();
		while (var2.hasNext()) {
			class666 var3 = (class666) var2.next();
			var3.method10225(arg0 == 0);
		}
	}

	public void notify(int arg0, int arg1, int arg2) {
		Iterator var4 = this.field11718.iterator();
		while (var4.hasNext()) {
			class666 var5 = (class666) var4.next();
			var5.method10226(arg0, arg1, arg2);
		}
	}
}
