package com.jagex.core.io;

import deob.ObfuscatedName;

import java.util.zip.Inflater;

@ObfuscatedName("adv")
public class GZip {

	@ObfuscatedName("adv.e")
	public Inflater field9252;

	public GZip() {
		this(-1, 1000000, 1000000);
	}

	public GZip(int arg0, int arg1, int arg2) {
	}

	@ObfuscatedName("adv.e([BI)[B")
	public byte[] method15246(byte[] arg0) {
		Packet var2 = new Packet(arg0);
		var2.pos = (arg0.length - 4);
		int var3 = var2.ig4s();
		byte[] var4 = new byte[var3];
		var2.pos = 0;
		this.decompress(var2, var4);
		return var4;
	}

	@ObfuscatedName("adv.n(Lalw;[BS)V")
	public void decompress(Packet arg0, byte[] arg1) {
		if (arg0.data[arg0.pos] != 31 || arg0.data[arg0.pos + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.field9252 == null) {
			this.field9252 = new Inflater(true);
		}
		try {
			this.field9252.setInput(arg0.data, arg0.pos + 10, arg0.data.length - (arg0.pos + 10 + 8));
			this.field9252.inflate(arg1);
		} catch (Exception var4) {
			this.field9252.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.field9252.reset();
	}
}
