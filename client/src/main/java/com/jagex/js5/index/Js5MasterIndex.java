package com.jagex.js5.index;

import com.jagex.core.io.Packet;
import com.jagex.encryption.Whirlpool;
import deob.ObfuscatedName;
import rs2.client.Client;

import java.math.BigInteger;

@ObfuscatedName("qp")
public class Js5MasterIndex {

	@ObfuscatedName("qp.e")
	public Js5MasterIndexArchiveData[] archiveData;

	public Js5MasterIndex(Packet buf, BigInteger exponent, BigInteger modulus) {
		buf.pos = 5;

		int var4 = buf.g1();
		buf.pos += var4 * 80;

		byte[] var5 = new byte[buf.data.length - buf.pos];
		buf.gdata(var5, 0, var5.length);

		byte[] raw;
		if (exponent == null || modulus == null || !Client.ENABLE_JS5_RSA) {
			raw = var5;
		} else {
			BigInteger var6 = new BigInteger(var5);
			BigInteger var7 = var6.modPow(exponent, modulus);
			raw = var7.toByteArray();
		}

		if (raw.length != 65) {
			throw new RuntimeException("Incorrect Whirlpool length - got: " + raw.length + " bytes");
		}

		byte[] digest = Whirlpool.compute(buf.data, 5, buf.pos - var5.length - 5);

		for (int i = 0; i < 64; i++) {
			if (raw[i + 1] != digest[i]) {
	            // throw new RuntimeException("Masterindex Whirlpool from server does not match my calculation - expected:" + hexString(raw) + " got:" + hexString(digest));
				throw new RuntimeException("Masterindex Whirlpool from server does not match my calculation");
			}
		}

		this.archiveData = new Js5MasterIndexArchiveData[var4];
		for (int i = 0; i < var4; i++) {
			buf.pos = i * 80 + 6;

			int crc = buf.g4s();
			int version = buf.g4s();
			int groupCount = buf.g4s();
			int var15 = buf.g4s();
			byte[] whirlpool = new byte[64];
			buf.gdata(whirlpool, 0, 64);
			this.archiveData[i] = new Js5MasterIndexArchiveData(crc, groupCount, version, var15, whirlpool);
		}
	}
}
