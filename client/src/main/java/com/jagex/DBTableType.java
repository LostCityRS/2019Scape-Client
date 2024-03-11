package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("adb")
public class DBTableType implements ConfigType, class757 {

	@ObfuscatedName("adb.e")
	public ScriptVarType[][] field9185;

	@ObfuscatedName("adb.n")
	public Object[][] field9186;

	@ObfuscatedName("adb.e(Lalw;B)V")
	public void decode(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.method15192(arg0, var2);
		}
	}

	@ObfuscatedName("adb.u(Lalw;IS)V")
	public void method15192(Packet arg0, int arg1) {
		if (arg1 != 1) {
			return;
		}
		int var3 = arg0.g1();
		if (this.field9185 == null) {
			this.field9185 = new ScriptVarType[var3][];
		}
		for (int var4 = arg0.g1(); var4 != 255; var4 = arg0.g1()) {
			int var5 = var4 & 0x7F;
			boolean var6 = (var4 & 0x80) != 0;
			ScriptVarType[] var7 = new ScriptVarType[arg0.g1()];
			for (int var8 = 0; var8 < var7.length; var8++) {
				var7[var8] = (ScriptVarType) SerializableEnums.decode(ScriptVarType.method7293(), arg0.gSmart1or2());
			}
			this.field9185[var5] = var7;
			if (var6) {
				if (this.field9186 == null) {
					this.field9186 = new Object[this.field9185.length][];
				}
				this.field9186[var5] = DbTableUtil.method18719(arg0, var7);
			}
		}
	}

	@ObfuscatedName("adb.n(I)V")
	public void postDecode() {
	}

	@ObfuscatedName("adb.z(IB)V")
	public void method2998(int arg0) {
	}
}
