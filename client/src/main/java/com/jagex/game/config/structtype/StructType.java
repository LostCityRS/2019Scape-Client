package com.jagex.game.config.structtype;

import com.jagex.core.datastruct.IntWrapper;
import com.jagex.core.datastruct.IterableMap;
import com.jagex.core.datastruct.Node;
import com.jagex.core.datastruct.SecondaryNode;
import com.jagex.core.io.Packet;
import com.jagex.game.client.ConfigRelated;
import com.jagex.game.config.ConfigType;
import com.jagex.game.world.entity.ObjectWrapper;
import com.jagex.math.IntMath;
import deob.ObfuscatedName;

@ObfuscatedName("adx")
public class StructType extends SecondaryNode implements ConfigType, ConfigRelated {

	@ObfuscatedName("adx.k")
	public IterableMap field9261;

	@ObfuscatedName("adx.e(Lalw;B)V")
	public void decode(Packet buf) {
		while (true) {
			int var2 = buf.g1();
			if (var2 == 0) {
				return;
			}
			this.method15295(buf, var2);
		}
	}

	@ObfuscatedName("adx.u(Lalw;IS)V")
	public void method15295(Packet arg0, int arg1) {
		if (arg1 != 249) {
			return;
		}
		int var3 = arg0.g1();
		if (this.field9261 == null) {
			int var4 = IntMath.bitceil(var3);
			this.field9261 = new IterableMap(var4);
		}
		for (int var5 = 0; var5 < var3; var5++) {
			boolean var6 = arg0.g1() == 1;
			int var7 = arg0.g3();
			Node var8;
			if (var6) {
				var8 = new ObjectWrapper(arg0.gjstr());
			} else {
				var8 = new IntWrapper(arg0.g4s());
			}
			this.field9261.method14501(var8, (long) var7);
		}
	}

	@ObfuscatedName("adx.p(IIB)I")
	public int method15296(int arg0, int arg1) {
		if (this.field9261 == null) {
			return arg1;
		} else {
			IntWrapper var3 = (IntWrapper) this.field9261.method14495((long) arg0);
			return var3 == null ? arg1 : var3.field11442;
		}
	}

	@ObfuscatedName("adx.d(ILjava/lang/String;I)Ljava/lang/String;")
	public String method15297(int arg0, String arg1) {
		if (this.field9261 == null) {
			return arg1;
		} else {
			ObjectWrapper var3 = (ObjectWrapper) this.field9261.method14495((long) arg0);
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