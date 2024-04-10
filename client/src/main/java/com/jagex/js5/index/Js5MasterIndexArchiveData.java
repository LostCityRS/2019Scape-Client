package com.jagex.js5.index;

import deob.ObfuscatedName;

@ObfuscatedName("ps")
public class Js5MasterIndexArchiveData {

	@ObfuscatedName("ps.e")
	public final int crc;

	@ObfuscatedName("ps.n")
	public final int groupCount;

	@ObfuscatedName("ps.m")
	public final int version;

	@ObfuscatedName("ps.k")
	public final byte[] whirlpool;

	public Js5MasterIndexArchiveData(int crc, int groupCount, int version, int arg3, byte[] whirlpool) {
		this.crc = crc;
		this.groupCount = groupCount;
		this.version = version;
		this.whirlpool = whirlpool;
	}
}
