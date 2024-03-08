package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("a")
public class class29 {

	@ObfuscatedName("a.e")
	public static boolean field603 = false;

	public class29() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("y.e(Lakt;I)V")
	public static void method542(class994 arg0) {
		Statics.field604 = new class893(client.field11034);
		Statics.field604.method4683(class268.field2828);
		try {
			class909 var1 = (class909) Statics.field604.method4688(class266.field2816, false);
			class1070 var2 = (class1070) Statics.field604.method4684(class263.field2791, false);
			var1.method16671(arg0);
			var2.method18781(new class421(0.0F, 0.0F, 0.0F));
			Statics.field604.method4695(class423.method6483(99999.0F, 99999.0F, 99999.0F));
			Statics.field604.method4814(class423.method6483(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY));
			Statics.field604.method4832(class423.method6483(99999.0F, 99999.0F, 99999.0F));
			Statics.field604.method4690(class423.method6483(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY));
		} catch (class1109 var4) {
		}
		Statics.field605 = Statics.field9182.method9086();
		Statics.field7284 = Statics.field9182.method9092();
		field603 = true;
	}

	@ObfuscatedName("hd.n(I)V")
	public static void method3913() {
		Statics.field604 = null;
		field603 = false;
	}

	@ObfuscatedName("ex.m(B)Z")
	public static boolean method2978() {
		return field603;
	}

	@ObfuscatedName("dg.k(B)V")
	public static void method2585() {
		class909 var0 = (class909) Statics.field604.method4709();
		class1070 var1 = (class1070) Statics.field604.method4797();
		class423 var2 = var0.method5219();
		class421 var3 = var1.method18787();
		if (client.field10986 != null) {
			int var4 = client.field10986.field2196;
			int var5 = client.field10986.field2197;
			float var6 = 1000.0F;
			float var7 = (float) (Math.atan((double) ((float) var4 / 2.0F / var6)) * 2.0D);
			float var8 = (float) (Math.atan((double) ((float) var5 / 2.0F / var6)) * 2.0D);
			try {
				Statics.field604.method4828(var7, var8);
			} catch (class1109 var21) {
			}
		}
		if (Statics.field9182.method9121()) {
			class421 var10 = class421.method6469();
			var10.method6414(1.0F, 0.0F, 0.0F, (float) (Statics.field9182.method9092() - Statics.field7284) / 200.0F);
			var3.method6424(var10);
			class423 var11 = class423.method6483(0.0F, 1.0F, 0.0F);
			var11.method6526(var3);
			class421 var12 = class421.method6469();
			var12.method6413(var11, (float) (Statics.field605 - Statics.field9182.method9086()) / 200.0F);
			var3.method6424(var12);
			var1.method18781(var3);
		}
		Statics.field605 = Statics.field9182.method9086();
		Statics.field7284 = Statics.field9182.method9092();
		var3.method6418();
		if (Statics.field11931.method9080(98)) {
			class423 var13 = class423.method6483(0.0F, 0.0F, 25.0F);
			var13.method6526(var3);
			var13.field4311 *= -1.0F;
			var2.method6497(var13);
		}
		if (Statics.field11931.method9080(99)) {
			class423 var14 = class423.method6483(0.0F, 0.0F, -25.0F);
			var14.method6526(var3);
			var14.field4311 *= -1.0F;
			var2.method6497(var14);
		}
		if (Statics.field11931.method9080(96)) {
			class423 var15 = class423.method6483(-25.0F, 0.0F, 0.0F);
			var15.method6526(var3);
			var15.field4311 *= -1.0F;
			var2.method6497(var15);
		}
		if (Statics.field11931.method9080(97)) {
			class423 var16 = class423.method6483(25.0F, 0.0F, 0.0F);
			var16.method6526(var3);
			var16.field4311 *= -1.0F;
			var2.method6497(var16);
		}
		class994 var17 = new class994(0, (int) var2.field4308, (int) var2.field4311, (int) var2.field4313);
		var0.method16671(var17);
		class594 var18 = client.field10855.method7727();
		int var19 = var18.field7426 << 9;
		int var20 = var18.field7427 << 9;
		Statics.field604.method4681(0.02F, client.field10855.method7744().field4540, client.field10855.method7793(), var19, var20);
	}
}
