package com.jagex;

import com.jagex.deob.ObfuscatedName;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("zn")
public class class686 {

	@ObfuscatedName("zn.e")
	public static Map field8286 = new HashMap();

	public class686() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("akf.e(Ljava/lang/Class;IB)Lza;")
	public static class685 method17657(Class arg0, int arg1) {
		Map var2 = field8286;
		synchronized (field8286) {
			Map var3 = (Map) field8286.get(arg0);
			if (var3 == null) {
				var3 = new HashMap();
				class685[] var4 = (class685[]) arg0.getEnumConstants();
				for (int var5 = 0; var5 < var4.length; var5++) {
					class685 var6 = var4[var5];
					var3.put(var6.method1303(), var6);
				}
				field8286.put(arg0, var3);
			}
			return (class685) var3.get(arg1);
		}
	}

	@ObfuscatedName("dz.n([Lza;II)Lza;")
	public static class685 method1897(class685[] arg0, int arg1) {
		class685[] var2 = arg0;
		for (int var3 = 0; var3 < var2.length; var3++) {
			class685 var4 = var2[var3];
			if (arg1 == var4.method1303()) {
				return var4;
			}
		}
		return null;
	}

	@ObfuscatedName("g.m(Ljava/lang/Iterable;Lalw;I)V")
	public static void method618(Iterable arg0, class997 arg1) {
		int var2 = method5155(arg0);
		arg1.method18130(var2);
		if (var2 == 0) {
			return;
		}
		for (int var3 = 0; var3 < var2; var3++) {
			arg1.field11502[arg1.field11503 + var3] = 0;
		}
		Iterator var4 = arg0.iterator();
		while (var4.hasNext()) {
			class685 var5 = (class685) var4.next();
			int var6 = var5.method1303();
			int var7 = var6 / 8;
			arg1.field11502[arg1.field11503 + var7] = (byte) (arg1.field11502[arg1.field11503 + var7] | 0x1 << (var6 & 0x7));
		}
		arg1.field11503 += var2;
	}

	@ObfuscatedName("ko.k(Ljava/lang/Iterable;I)I")
	public static int method5155(Iterable arg0) {
		int var1 = -1;
		Iterator var2 = arg0.iterator();
		while (var2.hasNext()) {
			class685 var3 = (class685) var2.next();
			if (var3.method1303() > var1) {
				var1 = var3.method1303();
			}
		}
		return (var1 + 8) / 8;
	}
}
