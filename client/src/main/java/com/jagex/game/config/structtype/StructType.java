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
	public IterableMap params;

	@ObfuscatedName("adx.e(Lalw;B)V")
	public void decode(Packet buf) {
		while (true) {
			int code = buf.g1();
			if (code == 0) {
				return;
			}
			this.decode(buf, code);
		}
	}

	@ObfuscatedName("adx.u(Lalw;IS)V")
	public void decode(Packet buf, int code) {
		if (code != 249) {
			return;
		}
		int var3 = buf.g1();
		if (this.params == null) {
			int var4 = IntMath.bitceil(var3);
			this.params = new IterableMap(var4);
		}
		for (int var5 = 0; var5 < var3; var5++) {
			boolean var6 = buf.g1() == 1;
			int var7 = buf.g3();
			Node var8;
			if (var6) {
				var8 = new ObjectWrapper(buf.gjstr());
			} else {
				var8 = new IntWrapper(buf.g4s());
			}
			this.params.pushNode(var8, (long) var7);
		}
	}

	@ObfuscatedName("adx.p(IIB)I")
	public int getParam(int arg0, int arg1) {
		if (this.params == null) {
			return arg1;
		} else {
			IntWrapper var3 = (IntWrapper) this.params.getNode((long) arg0);
			return var3 == null ? arg1 : var3.intValue;
		}
	}

	@ObfuscatedName("adx.d(ILjava/lang/String;I)Ljava/lang/String;")
	public String getParam(int arg0, String arg1) {
		if (this.params == null) {
			return arg1;
		} else {
			ObjectWrapper var3 = (ObjectWrapper) this.params.getNode((long) arg0);
			return var3 == null ? arg1 : (String) var3.field11436;
		}
	}

	@ObfuscatedName("adx.z(IB)V")
	public void setId(int arg0) {
	}

	@ObfuscatedName("adx.n(I)V")
	public void postDecode() {
	}
}
