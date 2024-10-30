package com.jagex.core.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("ix")
public class HashMap {

	@ObfuscatedName("ix.e")
	public HashTable map;

	@ObfuscatedName("ix.n")
	public HashMapValue[] nodes;

	@ObfuscatedName("ix.m")
	public final HashMapKey key;

	public HashMap(int arg0, HashMapKey arg1) {
		int var3;
		for (var3 = 1; var3 < arg0; var3 += var3) {
		}
		this.map = new HashTable(var3);
		this.nodes = new HashMapValue[var3];
		this.key = arg1;
	}

	@ObfuscatedName("ix.e(II)Lakw;")
	public HashMapValue get(int arg0) {
		return arg0 >= this.nodes.length ? null : this.nodes[arg0];
	}

	@ObfuscatedName("ix.n(Ljava/lang/String;B)Lakw;")
	public HashMapValue get(String arg0) {
		long var2 = this.key.hash(arg0);
		for (HashMapValue var4 = (HashMapValue) this.map.get(var2); var4 != null; var4 = (HashMapValue) this.map.nextWithKey()) {
			if (var4.valuestr.equals(arg0)) {
				return var4;
			}
		}
		return null;
	}

	@ObfuscatedName("ix.m(II)V")
	public void removeEntry(int arg0) {
		HashMapValue var2 = this.get(arg0);
		if (var2 != null) {
			var2.unlink();
			this.nodes[var2.valueint] = null;
		}
	}

	@ObfuscatedName("ix.k(ILjava/lang/String;Lakw;B)V")
	public void put(int arg0, String arg1, HashMapValue arg2) {
		HashMapValue var4 = this.get(arg1);
		if (var4 != null && var4.valueint != arg0) {
			throw new IllegalArgumentException(arg1);
		}
		this.removeEntry(arg0);
		if (arg0 >= this.nodes.length) {
			int var5;
			for (var5 = this.nodes.length; var5 <= arg0; var5 += var5) {
			}
			this.map = new HashTable(var5);
			for (int var6 = 0; var6 < this.nodes.length; var6++) {
				HashMapValue var7 = this.nodes[var6];
				if (var7 != null) {
					this.map.put(var7, var7.nodeId);
				}
			}
			HashMapValue[] var8 = new HashMapValue[var5];
			for (int var9 = 0; var9 < this.nodes.length; var9++) {
				var8[var9] = this.nodes[var9];
			}
			this.nodes = var8;
		}
		arg2.valueint = arg0;
		arg2.valuestr = arg1;
		this.map.put(arg2, this.key.hash(arg1));
		this.nodes[arg0] = arg2;
	}
}
