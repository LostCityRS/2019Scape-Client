package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ca")
public class class94 {

	@ObfuscatedName("ca.e")
	public final class849 field1187;

	@ObfuscatedName("ca.n")
	public final class143 field1186;

	@ObfuscatedName("ca.m")
	public final class162 field1185 = new class162(10485760, 256);

	public class94(class849 arg0, class143 arg1) {
		this.field1187 = arg0;
		this.field1186 = arg1;
	}

	@ObfuscatedName("ca.e(Ldv;)Ladt;")
	public class812 method1404(class118 arg0) {
		return this.method1398(arg0, arg0.field1357);
	}

	@ObfuscatedName("ca.n(Ldv;I)Ladt;")
	public class812 method1398(class118 arg0, int arg1) {
		class812 var3 = (class812) this.field1185.method2930((long) arg0.field1329);
		if (var3 != null) {
			return var3;
		} else if (this.method1397(class605.field7586, arg0, arg1)) {
			if (arg1 == -1) {
				arg1 = arg0.field1357;
			}
			class812 var5;
			if (arg0.field1336 && this.field1187.method2242()) {
				float[] var4 = this.field1186.method1984(class605.field7586, arg0.field1334, arg0.field1302, 0.7F, arg1, arg1, false);
				var5 = new class812(this.field1187, 3553, class109.field1273, class135.field1647, arg1, arg1, arg0.field1332 != 0, var4, class109.field1273);
			} else {
				int[] var6;
				if (class603.field7575 == arg0.field1340 && class118.method261(arg0.field1308)) {
					var6 = this.field1186.method1986(class605.field7586, arg0.field1334, 0.7F, arg1, arg1, true);
				} else {
					var6 = this.field1186.method1983(class605.field7586, arg0.field1334, 0.7F, arg1, arg1, false);
				}
				var5 = new class812(this.field1187, 3553, arg1, arg1, arg0.field1332 != 0, var6, 0, 0, false);
			}
			var5.method15312(arg0.field1307 == 1, arg0.field1343 == 1);
			this.field1185.method2922(var5, (long) arg0.field1329, arg1 * arg1);
			return var5;
		} else {
			return null;
		}
	}

	@ObfuscatedName("ca.m(Lvk;Ldv;I)Z")
	public boolean method1397(class605 arg0, class118 arg1, int arg2) {
		if (arg2 == -1) {
			arg2 = arg1.field1357;
		}
		if (arg1.field1336 && this.field1187.method2242()) {
			return this.field1186.method1977(arg0, arg1.field1334, arg1.field1302, class602.field7570, 0.7F, arg2, arg2, false);
		} else if (class603.field7575 == arg1.field1340 && class118.method261(arg1.field1308)) {
			return this.field1186.method1977(arg0, arg1.field1334, -1, class602.field7568, 0.7F, arg2, arg2, true);
		} else {
			return this.field1186.method1977(arg0, arg1.field1334, -1, class602.field7569, 0.7F, arg2, arg2, false);
		}
	}

	@ObfuscatedName("ca.k()V")
	public void method1402() {
		this.field1185.method2923(5);
	}

	@ObfuscatedName("ca.f()V")
	public void method1399() {
		this.field1185.method2924();
	}
}
