package com.jagex;

import com.jagex.deob.ObfuscatedName;
import java.io.EOFException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@ObfuscatedName("h")
public class class28 {

	@ObfuscatedName("h.m")
	public LinkedHashMap field600;

	public class28() {
		this((class997) null);
	}

	public class28(class997 arg0) {
		this.field600 = new LinkedHashMap();
		if (arg0 != null && arg0.field11502 != null) {
			int var2 = arg0.method17904();
			if (var2 > 0 && var2 <= 1) {
				int var3 = arg0.method17904();
				for (int var4 = 0; var4 < var3; var4++) {
					long var5 = arg0.method17914();
					int var7 = arg0.method17910();
					this.field600.put(var5, var7);
				}
			}
		}
	}

	@ObfuscatedName("h.e(Lalw;B)V")
	public void method580(class997 arg0) {
		arg0.method18001(1);
		arg0.method18001(this.field600.size());
		Iterator var2 = this.field600.entrySet().iterator();
		while (var2.hasNext()) {
			Entry var3 = (Entry) var2.next();
			arg0.method17890((Long) var3.getKey());
			arg0.method17886((Integer) var3.getValue());
		}
	}

	@ObfuscatedName("h.n(JII)V")
	public void method590(long arg0, int arg1) {
		if (this.field600.size() >= 10 && !this.field600.containsKey(arg0)) {
			Iterator var4 = this.field600.entrySet().iterator();
			var4.next();
			var4.remove();
		}
		this.field600.put(arg0, arg1);
		this.method578();
	}

	@ObfuscatedName("h.m(J)Z")
	public boolean method589(long arg0) {
		return this.field600.containsKey(arg0);
	}

	@ObfuscatedName("h.k(J)I")
	public int method577(long arg0) {
		return (Integer) this.field600.get(arg0);
	}

	@ObfuscatedName("ane.f(I)Lh;")
	public static class28 method18618() {
		class752 var0 = null;
		class28 var7;
		try {
			var0 = class507.method18567("3", client.field10768.field8333, false);
			byte[] var1 = new byte[(int) var0.method14821()];
			int var3;
			for (int var2 = 0; var2 < var1.length; var2 += var3) {
				var3 = var0.method14812(var1, var2, var1.length - var2);
				if (var3 == -1) {
					throw new EOFException();
				}
			}
			class28 var4 = new class28(new class997(var1));
			return var4;
		} catch (Exception var17) {
			var7 = new class28();
		} finally {
			try {
				if (var0 != null) {
					var0.method14818();
				}
			} catch (Exception var16) {
			}
		}
		return var7;
	}

	@ObfuscatedName("h.w(B)V")
	public void method578() {
		class752 var1 = null;
		try {
			var1 = class507.method18567("3", client.field10768.field8333, true);
			class997 var2 = new class997(5000);
			this.method580(var2);
			var1.method14808(var2.field11502, 0, var2.field11503 * 212851357);
		} catch (Exception var14) {
		} finally {
			try {
				if (var1 != null) {
					var1.method14818();
				}
			} catch (Exception var13) {
			}
		}
	}
}
