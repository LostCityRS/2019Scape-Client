package com.jagex.game.config.db;

import com.jagex.core.datastruct.SerializableEnums;
import com.jagex.core.io.Packet;
import com.jagex.game.config.vartype.constants.BaseVarType;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ObfuscatedName("adh")
public class DBTableIndex {

	@ObfuscatedName("adh.m")
	public BaseVarType field9181;

	@ObfuscatedName("adh.k")
	public Map field9180;

	public DBTableIndex(Js5 arg0, int arg1, int arg2) {
		byte[] var4 = arg0.getfile(arg1, arg2 + 1);
		this.method15188(new Packet(var4));
	}

	public DBTableIndex(Js5 arg0, int arg1) {
		byte[] var3 = arg0.getfile(arg1, 0);
		this.method15188(new Packet(var3));
	}

	@ObfuscatedName("adh.e(Lalw;B)V")
	public void method15188(Packet arg0) {
		this.field9181 = (BaseVarType) SerializableEnums.decode(BaseVarType.values(), arg0.g1());
		int var2 = arg0.gVarInt2();
		this.field9180 = new HashMap(var2);
		while (var2-- > 0) {
			Object var3 = this.field9181.dbDecode(arg0);
			int var4 = arg0.gVarInt2();
			ArrayList var5 = new ArrayList();
			while (var4-- > 0) {
				int var6 = arg0.gVarInt2();
				var5.add(var6);
			}
			this.field9180.put(var3, var5);
		}
	}

	@ObfuscatedName("adh.n(Ljava/lang/Object;I)Ljava/util/List;")
	public List method15187(Object arg0) {
		return (List) this.field9180.get(arg0);
	}
}
