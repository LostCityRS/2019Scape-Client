package com.jagex.js5.index;

import com.jagex.core.io.Packet;
import com.jagex.encryption.Whirlpool;
import deob.ObfuscatedName;
import java.math.BigInteger;
import rs2.client.Client;

@ObfuscatedName("qp")
public class Js5MasterIndex {

	@ObfuscatedName("qp.e")
	public Js5MasterIndexArchiveData[] archiveData;

	public Js5MasterIndex(Packet arg0, BigInteger arg1, BigInteger arg2) {
		arg0.pos = 5;
		int var4 = arg0.g1();
		arg0.pos += var4 * 80;
		byte[] var5 = new byte[arg0.data.length - arg0.pos];
		arg0.gdata(var5, 0, var5.length);
		byte[] var8;
		if (arg1 == null || arg2 == null || !Client.ENABLE_JS5_RSA) {
			var8 = var5;
		} else {
			BigInteger var6 = new BigInteger(var5);
			BigInteger var7 = var6.modPow(arg1, arg2);
			var8 = var7.toByteArray();
		}
		if (var8.length != 65) {
			throw new RuntimeException();
		}
		byte[] var9 = Whirlpool.compute(arg0.data, 5, arg0.pos - var5.length - 5);
		for (int var10 = 0; var10 < 64; var10++) {
			if (var8[var10 + 1] != var9[var10]) {
				throw new RuntimeException();
			}
		}
		this.archiveData = new Js5MasterIndexArchiveData[var4];
		for (int var11 = 0; var11 < var4; var11++) {
			arg0.pos = var11 * 80 + 6;
			int var12 = arg0.g4s();
			int var13 = arg0.g4s();
			int var14 = arg0.g4s();
			int var15 = arg0.g4s();
			byte[] var16 = new byte[64];
			arg0.gdata(var16, 0, 64);
			this.archiveData[var11] = new Js5MasterIndexArchiveData(var12, var14, var13, var15, var16);
		}
	}
}
