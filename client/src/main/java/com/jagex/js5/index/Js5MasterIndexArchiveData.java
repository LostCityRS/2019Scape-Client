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

	public Js5MasterIndexArchiveData(int arg0, int arg1, int arg2, int arg3, byte[] arg4) {
		this.crc = arg0;
		this.groupCount = arg1;
		this.version = arg2;
		this.whirlpool = arg4;
	}
}
