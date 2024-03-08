package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("adx")
public class StructType extends SecondaryNode implements ConfigType, class757 {

	@ObfuscatedName("adx.k")
	public IterableMap field9261;

	@ObfuscatedName("adx.e(Lalw;B)V")
	public void decode(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.method15295(arg0, var2);
		}
	}

	@ObfuscatedName("adx.u(Lalw;IS)V")
	public void method15295(Packet arg0, int arg1) {
		if (arg1 != 249) {
			return;
		}
		int var3 = arg0.g1();
		if (this.field9261 == null) {
			int var4 = class783.method16657(var3);
			this.field9261 = new IterableMap(var4);
		}
		for (int var5 = 0; var5 < var3; var5++) {
			boolean var6 = arg0.g1() == 1;
			int var7 = arg0.g3();
			Node var8;
			if (var6) {
				var8 = new class984(arg0.gjstr());
			} else {
				var8 = new class988(arg0.g4s());
			}
			this.field9261.method14501(var8, (long) var7);
		}
	}

	@ObfuscatedName("adx.p(IIB)I")
	public int method15296(int arg0, int arg1) {
		if (this.field9261 == null) {
			return arg1;
		} else {
			class988 var3 = (class988) this.field9261.method14495((long) arg0);
			return var3 == null ? arg1 : var3.field11442;
		}
	}

	@ObfuscatedName("adx.d(ILjava/lang/String;I)Ljava/lang/String;")
	public String method15297(int arg0, String arg1) {
		if (this.field9261 == null) {
			return arg1;
		} else {
			class984 var3 = (class984) this.field9261.method14495((long) arg0);
			return var3 == null ? arg1 : (String) var3.field11436;
		}
	}

	@ObfuscatedName("adx.z(IB)V")
	public void method2998(int arg0) {
	}

	@ObfuscatedName("adx.n(I)V")
	public void postDecode() {
	}
}
