package com.jagex.game.config.structtype;

import com.jagex.core.datastruct.IntNode;
import com.jagex.core.datastruct.HashTable;
import com.jagex.core.datastruct.Node;
import com.jagex.core.datastruct.SecondaryNode;
import com.jagex.core.io.Packet;
import com.jagex.game.client.MutableConfig;
import com.jagex.game.config.ConfigType;
import com.jagex.game.world.entity.ObjectNode;
import com.jagex.math.IntMath;
import deob.ObfuscatedName;

@ObfuscatedName("adx")
public class StructType extends SecondaryNode implements ConfigType, MutableConfig {

	@ObfuscatedName("adx.k")
	public HashTable params;

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
			this.params = new HashTable(var4);
		}
		for (int var5 = 0; var5 < var3; var5++) {
			boolean var6 = buf.g1() == 1;
			int var7 = buf.g3();
			Node var8;
			if (var6) {
				var8 = new ObjectNode(buf.gjstr());
			} else {
				var8 = new IntNode(buf.g4s());
			}
			this.params.put(var8, (long) var7);
		}
	}

	@ObfuscatedName("adx.p(IIB)I")
	public int getParam(int arg0, int arg1) {
		if (this.params == null) {
			return arg1;
		} else {
			IntNode var3 = (IntNode) this.params.get((long) arg0);
			return var3 == null ? arg1 : var3.value;
		}
	}

	@ObfuscatedName("adx.d(ILjava/lang/String;I)Ljava/lang/String;")
	public String getParam(int arg0, String arg1) {
		if (this.params == null) {
			return arg1;
		} else {
			ObjectNode var3 = (ObjectNode) this.params.get((long) arg0);
			return var3 == null ? arg1 : (String) var3.value;
		}
	}

	@ObfuscatedName("adx.z(IB)V")
	public void setId(int arg0) {
	}

	@ObfuscatedName("adx.n(I)V")
	public void postDecode() {
	}
}
