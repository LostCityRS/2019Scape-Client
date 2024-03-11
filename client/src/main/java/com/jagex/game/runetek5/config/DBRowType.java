package com.jagex.game.runetek5.config;

import com.jagex.ConfigRelated;
import com.jagex.DbTableUtil;
import com.jagex.core.io.Packet;
import com.jagex.SerializableEnums;
import com.jagex.game.runetek5.config.vartype.constants.ScriptVarType;
import deob.ObfuscatedName;

@ObfuscatedName("abc")
public class DBRowType implements ConfigType, ConfigRelated {

	@ObfuscatedName("abc.e")
	public Object[][] field8734;

	@ObfuscatedName("abc.n")
	public ScriptVarType[][] field8733;

	@ObfuscatedName("abc.m")
	public int field8735;

	@ObfuscatedName("abc.e(Lalw;B)V")
	public void decode(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.method14710(arg0, var2);
		}
	}

	@ObfuscatedName("abc.u(II)[Ljava/lang/Object;")
	public Object[] method14711(int arg0) {
		return this.field8734 == null ? null : this.field8734[arg0];
	}

	@ObfuscatedName("abc.p(Lalw;II)V")
	public void method14710(Packet arg0, int arg1) {
		if (arg1 == 3) {
			int var3 = arg0.g1();
			if (this.field8734 == null) {
				this.field8734 = new Object[var3][];
				this.field8733 = new ScriptVarType[var3][];
			}
			for (int var4 = arg0.g1(); var4 != 255; var4 = arg0.g1()) {
				int var5 = arg0.g1();
				ScriptVarType[] var6 = new ScriptVarType[var5];
				for (int var7 = 0; var7 < var5; var7++) {
					var6[var7] = (ScriptVarType) SerializableEnums.decode(ScriptVarType.method7293(), arg0.gSmart1or2());
				}
				this.field8734[var4] = DbTableUtil.method18719(arg0, var6);
				this.field8733[var4] = var6;
			}
		} else if (arg1 == 4) {
			this.field8735 = arg0.gVarInt2();
		}
	}

	@ObfuscatedName("abc.n(I)V")
	public void postDecode() {
	}

	@ObfuscatedName("abc.z(IB)V")
	public void method2998(int arg0) {
	}
}
