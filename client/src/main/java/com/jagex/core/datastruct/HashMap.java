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

	public HashMap(int size, HashMapKey key) {
		int var3;
		for (var3 = 1; var3 < size; var3 += var3) {
		}
		this.map = new HashTable(var3);
		this.nodes = new HashMapValue[var3];
		this.key = key;
	}

	@ObfuscatedName("ix.e(II)Lakw;")
	public HashMapValue get(int index) {
		return index >= this.nodes.length ? null : this.nodes[index];
	}

	@ObfuscatedName("ix.n(Ljava/lang/String;B)Lakw;")
	public HashMapValue get(String value) {
		long key = this.key.hash(value);
		for (HashMapValue var4 = (HashMapValue) this.map.get(key); var4 != null; var4 = (HashMapValue) this.map.nextWithKey()) {
			if (var4.valuestr.equals(value)) {
				return var4;
			}
		}
		return null;
	}

	@ObfuscatedName("ix.m(II)V")
	public void removeEntry(int index) {
		HashMapValue entry = this.get(index);
		if (entry != null) {
			entry.unlink();
			this.nodes[entry.valueint] = null;
		}
	}

	@ObfuscatedName("ix.k(ILjava/lang/String;Lakw;B)V")
	public void put(int valueint, String valuestr, HashMapValue value) {
		HashMapValue current = this.get(valuestr);
		if (current != null && current.valueint != valueint) {
			throw new IllegalArgumentException(valuestr);
		}
		this.removeEntry(valueint);
		if (valueint >= this.nodes.length) {
			int size;
			for (size = this.nodes.length; size <= valueint; size += size) {
			}
			this.map = new HashTable(size);
			for (int index = 0; index < this.nodes.length; index++) {
				HashMapValue var7 = this.nodes[index];
				if (var7 != null) {
					this.map.put(var7, var7.nodeId);
				}
			}
			HashMapValue[] entries = new HashMapValue[size];
			for (int index = 0; index < this.nodes.length; index++) {
				entries[index] = this.nodes[index];
			}
			this.nodes = entries;
		}
		value.valueint = valueint;
		value.valuestr = valuestr;
		this.map.put(value, this.key.hash(valuestr));
		this.nodes[valueint] = value;
	}
}
