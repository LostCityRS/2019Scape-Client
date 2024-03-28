package com.jagex.game.config.seqgrouptype;

import com.jagex.core.io.Packet;
import com.jagex.game.client.MutableConfig;
import com.jagex.game.config.ConfigType;
import deob.ObfuscatedName;

@ObfuscatedName("fm")
public class SeqGroupType implements ConfigType, MutableConfig {

	@ObfuscatedName("fm.e")
	public boolean[] field1793;

	@ObfuscatedName("fm.e(Lalw;B)V")
	public void decode(Packet buf) {
		while (true) {
			int var2 = buf.g1();
			if (var2 == 0) {
				return;
			}
			this.method2997(buf, var2);
		}
	}

	@ObfuscatedName("fm.u(Lalw;II)V")
	public void method2997(Packet arg0, int arg1) {
		if (arg1 == 2) {
			this.field1793 = new boolean[400];
			int var3 = arg0.gSmart1or2();
			for (int var4 = 0; var4 < var3; var4++) {
				this.field1793[arg0.gSmart1or2()] = true;
			}
		} else if (arg1 == 3) {
			arg0.g1();
			int var5 = arg0.gSmart1or2();
			for (int var6 = 0; var6 < var5; var6++) {
				arg0.gSmart1or2();
				arg0.g1();
			}
		}
	}

	@ObfuscatedName("fm.n(I)V")
	public void postDecode() {
	}

	@ObfuscatedName("fm.z(IB)V")
	public void setId(int arg0) {
	}
}
