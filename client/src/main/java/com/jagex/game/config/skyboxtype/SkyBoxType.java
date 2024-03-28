package com.jagex.game.config.skyboxtype;

import com.jagex.core.datastruct.SerializableEnums;
import com.jagex.core.io.Packet;
import com.jagex.game.client.MutableConfig;
import com.jagex.game.config.ConfigType;
import com.jagex.game.config.ConfigTypeList;
import com.jagex.game.config.skydecortype.SkyDecorType;
import com.jagex.graphics.SkyBox;
import com.jagex.graphics.SkyBoxFillMode;
import com.jagex.graphics.SkyboxRelated;
import deob.ObfuscatedName;

@ObfuscatedName("uv")
public class SkyBoxType implements ConfigType, MutableConfig {

	@ObfuscatedName("uv.e")
	public int field7233 = 0;

	@ObfuscatedName("uv.n")
	public int field7234 = 0;

	@ObfuscatedName("uv.m")
	public int[] field7232;

	@ObfuscatedName("uv.k")
	public SkyBoxFillMode field7235 = SkyBoxFillMode.field7239;

	@ObfuscatedName("uv.f")
	public int field7236 = 0;

	@ObfuscatedName("uv.e(Lalw;B)V")
	public void decode(Packet buf) {
		while (true) {
			int var2 = buf.g1();
			if (var2 == 0) {
				return;
			}
			this.method9176(buf, var2);
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
			this.field7235 = (SkyBoxFillMode) SerializableEnums.decode(SkyBoxFillMode.method8341(), arg0.g1());
		} else if (arg1 == 5) {
			this.field7236 = arg0.gSmart2or4null();
		} else if (arg1 == 6) {
			arg0.gSmart2or4null();
		}
	}

	@ObfuscatedName("uv.z(IB)V")
	public void setId(int arg0) {
	}

	@ObfuscatedName("uv.n(I)V")
	public void postDecode() {
	}

	@ObfuscatedName("d.p(IIIILao;Lao;I)Lsv;")
	public static SkyBox method305(int arg0, int arg1, int arg2, int arg3, ConfigTypeList arg4, ConfigTypeList arg5) {
		SkyboxRelated[] var6 = null;
		SkyBoxType var7 = (SkyBoxType) arg4.list(arg0);
		if (var7.field7232 != null) {
			var6 = new SkyboxRelated[var7.field7232.length];
			for (int var8 = 0; var8 < var6.length; var8++) {
				SkyDecorType var9 = (SkyDecorType) arg5.list(var7.field7232[var8]);
				var6[var8] = new SkyboxRelated(var9.field2780, var9.field2778, var9.field2783, var9.field2779, var9.field2777, var9.field2776, var9.field2782, var9.field2781, var9.field2784, var9.field2785, var9.field2786);
			}
		}
		return new SkyBox(var7.field7233, var6, var7.field7234, arg1, arg2, arg3, var7.field7235, var7.field7236);
	}
}
