package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("uv")
public class class568 implements class53, class757 {

	@ObfuscatedName("uv.e")
	public int field7233 = 0;

	@ObfuscatedName("uv.n")
	public int field7234 = 0;

	@ObfuscatedName("uv.m")
	public int[] field7232;

	@ObfuscatedName("uv.k")
	public class569 field7235 = class569.field7239;

	@ObfuscatedName("uv.f")
	public int field7236 = 0;

	@ObfuscatedName("uv.e(Lalw;B)V")
	public void method976(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.method9176(arg0, var2);
		}
	}

	@ObfuscatedName("uv.u(Lalw;IB)V")
	public void method9176(Packet arg0, int arg1) {
		if (arg1 == 1) {
			this.field7233 = arg0.g2();
		} else if (arg1 == 2) {
			this.field7232 = new int[arg0.g1()];
			for (int var3 = 0; var3 < this.field7232.length; var3++) {
				this.field7232[var3] = arg0.g2();
			}
		} else if (arg1 == 3) {
			this.field7234 = arg0.g1();
		} else if (arg1 == 4) {
			this.field7235 = (class569) class686.method1897(class569.method8341(), arg0.g1());
		} else if (arg1 == 5) {
			this.field7236 = arg0.gSmart2or4null();
		} else if (arg1 == 6) {
			arg0.gSmart2or4null();
		}
	}

	@ObfuscatedName("uv.z(IB)V")
	public void method2998(int arg0) {
	}

	@ObfuscatedName("uv.n(I)V")
	public void method975() {
	}

	@ObfuscatedName("d.p(IIIILao;Lao;I)Lsv;")
	public static class502 method305(int arg0, int arg1, int arg2, int arg3, class51 arg4, class51 arg5) {
		class503[] var6 = null;
		class568 var7 = (class568) arg4.method962(arg0);
		if (var7.field7232 != null) {
			var6 = new class503[var7.field7232.length];
			for (int var8 = 0; var8 < var6.length; var8++) {
				class262 var9 = (class262) arg5.method962(var7.field7232[var8]);
				var6[var8] = new class503(var9.field2780, var9.field2778, var9.field2783, var9.field2779, var9.field2777, var9.field2776, var9.field2782, var9.field2781, var9.field2784, var9.field2785, var9.field2786);
			}
		}
		return new class502(var7.field7233, var6, var7.field7234, arg1, arg2, arg3, var7.field7235, var7.field7236);
	}
}
