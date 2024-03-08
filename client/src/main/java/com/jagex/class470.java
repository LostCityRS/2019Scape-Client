package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("qa")
public class class470 implements class685 {

	@ObfuscatedName("qa.e")
	public static final class470 field4840 = new class470(2, 0, Integer.class, new class471());

	@ObfuscatedName("qa.n")
	public static final class470 field4837 = new class470(4, 1, Long.class, new class469());

	@ObfuscatedName("qa.m")
	public static final class470 field4836 = new class470(1, 2, String.class, new class467());

	@ObfuscatedName("qa.k")
	public static final class470 field4839 = new class470(0, 3, class994.class, new class465());

	@ObfuscatedName("qa.f")
	public static final class470 field4838 = new class470(3, 4, class227.class, new class464());

	@ObfuscatedName("qa.w")
	public final int field4841;

	@ObfuscatedName("qa.l")
	public final int field4842;

	@ObfuscatedName("qa.u")
	public final Class field4843;

	@ObfuscatedName("qa.z")
	public final class802 field4844;

	public class470(int arg0, int arg1, Class arg2, class802 arg3) {
		this.field4841 = arg0;
		this.field4842 = arg1;
		this.field4843 = arg2;
		this.field4844 = arg3;
	}

	@ObfuscatedName("qa.m(Ljava/lang/Class;I)Lqa;")
	public static class470 method7337(Class arg0) {
		class470[] var1 = Statics.method7338();
		for (int var2 = 0; var2 < var1.length; var2++) {
			class470 var3 = var1[var2];
			if (var3.field4843 == arg0) {
				return var3;
			}
		}
		return null;
	}

	@ObfuscatedName("qa.f(Ljava/lang/Class;I)Lade;")
	public static class802 method7336(Class arg0) {
		class470 var1 = method7337(arg0);
		if (var1 == null) {
			throw new IllegalArgumentException();
		}
		return var1.field4844;
	}

	@ObfuscatedName("qa.n()I")
	public int method1303() {
		return this.field4842;
	}

	@ObfuscatedName("qa.w(Lalw;B)Ljava/lang/Object;")
	public Object method7335(class997 arg0) {
		return this.field4844.method7308(arg0);
	}
}
