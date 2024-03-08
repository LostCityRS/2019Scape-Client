package com.jagex;

import com.jagex.deob.ObfuscatedName;
import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("io")
public class class243 {

	@ObfuscatedName("io.n")
	public boolean field2603 = false;

	@ObfuscatedName("io.m")
	public LinkedList field2604 = new LinkedList();

	@ObfuscatedName("io.k")
	public String field2602;

	@ObfuscatedName("io.e(I)Z")
	public boolean method4340() {
		return this.field2603;
	}

	@ObfuscatedName("io.n(ZS)V")
	public void method4341(boolean arg0) {
		this.field2603 = arg0;
	}

	@ObfuscatedName("io.m(I)I")
	public int method4353() {
		return this.field2604.size();
	}

	@ObfuscatedName("alv.k(CB)Z")
	public static final boolean method18307(char arg0) {
		return arg0 >= '!' && arg0 < '0' || arg0 >= ':' && arg0 <= '@' && arg0 != '<' || arg0 >= '[' && arg0 <= '_' || arg0 >= '{';
	}

	@ObfuscatedName("io.f(Ljava/lang/String;III)Z")
	public final boolean method4342(String arg0, int arg1, int arg2) {
		if (arg0.isEmpty() || arg0.length() > 10 || !method18307(arg0.charAt(0))) {
			return false;
		}
		class244 var4 = this.method4361(arg0);
		if (var4 != null) {
			this.field2604.remove(var4);
		}
		this.field2604.add(new class244(arg0, arg1, arg2));
		this.method4346();
		return true;
	}

	@ObfuscatedName("io.w(Ljava/lang/String;I)Liq;")
	public final class244 method4361(String arg0) {
		Iterator var2 = this.field2604.iterator();
		class244 var3;
		do {
			if (!var2.hasNext()) {
				return null;
			}
			var3 = (class244) var2.next();
		} while (!var3.field2607.equals(arg0));
		return var3;
	}

	@ObfuscatedName("io.l(Ljava/lang/String;I)V")
	public final void method4344(String arg0) {
		Iterator var2 = this.field2604.iterator();
		while (var2.hasNext()) {
			class244 var3 = (class244) var2.next();
			if (var3.field2607.equals(arg0)) {
				var2.remove();
				break;
			}
		}
	}

	@ObfuscatedName("io.u(I)V")
	public final void method4345() {
		this.field2604.clear();
		this.field2602 = "";
	}

	@ObfuscatedName("io.z(Ljava/lang/String;I)Ljava/lang/String;")
	public final String method4339(String arg0) {
		if (this.field2604.isEmpty()) {
			return arg0;
		}
		StringBuilder var2 = new StringBuilder(arg0.length());
		int var3 = arg0.length();
		boolean var4 = false;
		for (int var5 = 0; var5 < var3; var5++) {
			boolean var6 = false;
			char var7 = arg0.charAt(var5);
			if (var4) {
				if (var7 == '>') {
					var4 = false;
				}
			} else if (var7 == '<') {
				var4 = true;
			} else if (this.field2602.indexOf(var7) != -1) {
				for (int var8 = 0; var8 < this.field2604.size(); var8++) {
					class244 var9 = (class244) this.field2604.get(var8);
					int var10 = var9.field2607.length();
					if (var5 <= var3 - var10 && arg0.substring(var5, var5 + var10).equals(var9.field2607)) {
						String var11;
						if (var9.field2609 > 0) {
							var11 = String.format("<sprite=%d,%d>", var9.field2608, var9.field2609);
						} else {
							var11 = String.format("<sprite=%d>", var9.field2608);
						}
						var2.append(var11);
						var6 = true;
						var5 += var10 - 1;
						break;
					}
				}
			}
			if (!var6) {
				var2.append(var7);
			}
		}
		return var2.toString();
	}

	@ObfuscatedName("io.p(I)V")
	public final void method4346() {
		this.field2602 = "";
		for (int var1 = 0; var1 < this.field2604.size(); var1++) {
			class244 var2 = (class244) this.field2604.get(var1);
			char var3 = var2.field2607.charAt(0);
			if (this.field2602.indexOf(var3) < 0) {
				this.field2602 = this.field2602 + var3;
			}
		}
	}
}
