package com.jagex;

import com.jagex.deob.ObfuscatedName;
import java.math.BigInteger;

@ObfuscatedName("qp")
public class class450 {

	@ObfuscatedName("qp.e")
	public class438[] field4480;

	public class450(class997 arg0, BigInteger arg1, BigInteger arg2) {
		arg0.field11503 = 1361799817;
		int var4 = arg0.method17904();
		arg0.field11503 += var4 * 313960592;
		byte[] var5 = new byte[arg0.field11502.length - arg0.field11503 * 212851357];
		arg0.method17921(var5, 0, var5.length);
		byte[] var8;
		if (arg1 == null || arg2 == null) {
			var8 = var5;
		} else {
			BigInteger var6 = new BigInteger(var5);
			BigInteger var7 = var6.modPow(arg1, arg2);
			var8 = var7.toByteArray();
		}
		if (var8.length != 65) {
			throw new RuntimeException();
		}
		byte[] var9 = class735.method18308(arg0.field11502, 5, arg0.field11503 * 212851357 - var5.length - 5);
		for (int var10 = 0; var10 < 64; var10++) {
			if (var8[var10 + 1] != var9[var10]) {
				throw new RuntimeException();
			}
		}
		this.field4480 = new class438[var4];
		for (int var11 = 0; var11 < var4; var11++) {
			arg0.field11503 = var11 * 313960592 + -83827138;
			int var12 = arg0.method17910();
			int var13 = arg0.method17910();
			int var14 = arg0.method17910();
			int var15 = arg0.method17910();
			byte[] var16 = new byte[64];
			arg0.method17921(var16, 0, 64);
			this.field4480[var11] = new class438(var12, var14, var13, var15, var16);
		}
	}
}
