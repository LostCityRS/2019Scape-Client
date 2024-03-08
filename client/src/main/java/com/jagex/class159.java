package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ew")
public abstract class class159 {

	@ObfuscatedName("ew.e")
	public final int field1750;

	public class159(class997 arg0) {
		this.field1750 = arg0.method17906();
	}

	@ObfuscatedName("aap.e(Lalw;I)Lew;")
	public static class159 method14342(class997 arg0) {
		int var1 = arg0.method17904();
		class801 var2 = class801.method3108(var1);
		class159 var3 = null;
		switch(var2.field9249) {
			case 0:
				var3 = new class868(arg0);
				break;
			case 1:
				var3 = new class865(arg0);
				break;
			case 2:
				var3 = new class864(arg0);
				break;
			case 3:
				var3 = new class883(arg0);
				break;
			case 4:
				var3 = new class870(arg0, true);
				break;
			case 5:
				var3 = new class879(arg0);
				break;
			case 6:
				var3 = new class882(arg0);
			case 7:
			case 17:
			case 18:
			default:
				break;
			case 8:
				var3 = new class876(arg0);
				break;
			case 9:
				var3 = new class863(arg0);
				break;
			case 10:
				var3 = new class884(arg0, 1, 1);
				break;
			case 11:
				var3 = new class869(arg0);
				break;
			case 12:
				var3 = new class873(arg0);
				break;
			case 13:
				var3 = new class871(arg0);
				break;
			case 14:
				var3 = new class875(arg0);
				break;
			case 15:
				var3 = new class884(arg0, 0, 0);
				break;
			case 16:
				var3 = new class870(arg0, false);
				break;
			case 19:
				var3 = new class881(arg0);
				break;
			case 20:
				var3 = new class878(arg0);
				break;
			case 21:
				var3 = new class866(arg0);
				break;
			case 22:
				var3 = new class880(arg0);
				break;
			case 23:
				var3 = new class862(arg0);
				break;
			case 24:
				var3 = new class1129(arg0);
				break;
			case 25:
				var3 = new class877(arg0);
				break;
			case 26:
				var3 = new class884(arg0, 0, 1);
				break;
			case 27:
				var3 = new class884(arg0, 1, 0);
				break;
			case 28:
				var3 = new class1128(arg0);
				break;
			case 29:
				var3 = new class872(arg0);
				break;
			case 30:
				var3 = new class867(arg0);
		}
		return var3;
	}

	@ObfuscatedName("ew.m(I)V")
	public void method2896() {
	}

	@ObfuscatedName("ew.k(I)Z")
	public boolean method2891() {
		return true;
	}

	@ObfuscatedName("ew.n(I)V")
	public abstract void method2890();
}
