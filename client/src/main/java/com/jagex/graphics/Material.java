package com.jagex.graphics;

import com.jagex.core.datastruct.SerializableEnums;
import com.jagex.core.io.Packet;
import deob.ObfuscatedName;

@ObfuscatedName("dv")
public class Material {

	@ObfuscatedName("dv.ag")
	public int field1329;

	@ObfuscatedName("dv.ah")
	public boolean field1330 = false;

	@ObfuscatedName("dv.al")
	public boolean field1331 = false;

	@ObfuscatedName("dv.ac")
	public boolean field1321 = false;

	@ObfuscatedName("dv.ai")
	public boolean field1333 = false;

	@ObfuscatedName("dv.aw")
	public int diffuseTexture = -1;

	@ObfuscatedName("dv.as")
	public int field1302 = -1;

	@ObfuscatedName("dv.at")
	public int size;

	@ObfuscatedName("dv.ad")
	public float speedU = 0.0F;

	@ObfuscatedName("dv.am")
	public float speedV = 0.0F;

	@ObfuscatedName("dv.au")
	public boolean field1336 = false;

	@ObfuscatedName("dv.ar")
	public MaterialAlphaMode alphaMode = MaterialAlphaMode.NONE;

	@ObfuscatedName("dv.ap")
	public byte alphaThreshold = -1;

	@ObfuscatedName("dv.aq")
	public byte repeatS = 0;

	@ObfuscatedName("dv.ax")
	public byte repeatT = 0;

	@ObfuscatedName("dv.bh")
	public byte effect = 0;

	@ObfuscatedName("dv.bx")
	public byte effectArg1 = 0;

	@ObfuscatedName("dv.bd")
	public int field1359 = 0;

	@ObfuscatedName("dv.bc")
	public byte field1332 = 0;

	@ObfuscatedName("dv.bi")
	public boolean field1361 = false;

	@ObfuscatedName("dv.bn")
	public boolean highDetail = false;

	@ObfuscatedName("dv.bt")
	public byte field1363 = 0;

	@ObfuscatedName("dv.bq")
	public byte field1364 = -1;

	@ObfuscatedName("dv.bm")
	public byte field1311 = 0;

	@ObfuscatedName("dv.bb")
	public short averageColour = 0;

	@ObfuscatedName("rk.e(IB)I")
	public static int method7618(int arg0) {
		switch(arg0) {
			case 0:
				return 64;
			case 1:
				return 128;
			case 2:
				return 256;
			case 3:
				return 512;
			case 4:
				return 1024;
			default:
				return -1;
		}
	}

	@ObfuscatedName("u.n(IB)Z")
	public static boolean method261(int arg0) {
		return arg0 != 1 && arg0 != 7;
	}

	@ObfuscatedName("dv.m(ILalw;I)V")
	public void method1909(int arg0, Packet arg1) {
		this.field1329 = arg0;
		byte var3 = (byte) arg1.g1();
		if (var3 == 0) {
			this.method1904(arg1);
		} else {
			this.method1905(arg1);
		}
	}

	@ObfuscatedName("dv.k(Lalw;I)V")
	public void method1904(Packet arg0) {
		arg0.g1();
		int var2 = arg0.g1();
		this.size = method7618(var2);
		if (this.size == -1) {
		}
		int var3 = arg0.g4s();
		this.field1330 = (var3 & 0x1) != 0;
		this.field1331 = (var3 & 0x2) != 0;
		this.field1321 = (var3 & 0x8) != 0;
		this.field1333 = (var3 & 0x10) != 0;
		if (this.field1330 || this.field1333) {
			this.diffuseTexture = arg0.g4s();
		}
		if (this.field1321 || this.field1331) {
			this.field1302 = arg0.g4s();
		}
		byte var4 = (byte) arg0.g1();
		this.repeatS = (byte) (var4 & 0x7);
		this.repeatT = (byte) (var4 >> 3 & 0x7);
		int var5 = arg0.g4s();
		boolean var6 = (var5 & 0x800) != 0;
		if ((var5 & 0x10) != 0) {
			arg0.gFloat();
			arg0.gFloat();
		}
		if (this.field1331) {
			arg0.gFloat();
		}
		this.field1336 = arg0.g1() == 1;
		SerializableEnums.decode(FacetMode.method4590(), arg0.g1());
		this.alphaMode = (MaterialAlphaMode) SerializableEnums.decode(MaterialAlphaMode.method8501(), arg0.g1());
		if (MaterialAlphaMode.TEST == this.alphaMode) {
			this.alphaThreshold = (byte) arg0.g1();
		}
		if (var6) {
			arg0.gFloat();
			arg0.gFloat();
			arg0.gFloat();
		}
		int var7 = arg0.g1();
		if ((var7 & 0x1) != 0) {
			this.speedU = (float) arg0.g2s() * 127.0F / 32767.0F / 64.0F;
		}
		if ((var7 & 0x2) != 0) {
			this.speedV = (float) arg0.g2s() * 127.0F / 32767.0F / 64.0F;
		}
		if (arg0.g1() != 1) {
			return;
		}
		this.effect = (byte) arg0.g1();
		this.effectArg1 = (byte) arg0.g1();
		this.field1359 = arg0.g4s();
		this.field1311 = (byte) arg0.g1();
		arg0.g1();
		this.field1332 = (byte) arg0.g1();
		this.field1361 = arg0.g1() == 1;
		this.highDetail = arg0.g1() == 1;
		this.field1363 = (byte) arg0.g1();
		this.field1364 = (byte) arg0.g1();
		this.averageColour = (short) arg0.g2();
	}

	@ObfuscatedName("dv.f(Lalw;I)V")
	public void method1905(Packet arg0) {
		int var2 = arg0.g4s();
		boolean var3 = (var2 & 0x800) != 0;
		if ((var2 & 0x20) != 0) {
			this.field1330 = true;
			arg0.g1();
			this.diffuseTexture = arg0.g4s();
		}
		if ((var2 & 0x40) != 0) {
			arg0.g1();
			arg0.g4s();
		}
		if ((var2 & 0x80) != 0) {
			arg0.g1();
			arg0.g4s();
		}
		if ((var2 & 0x1000) != 0) {
			arg0.gFloat();
		}
		if ((var2 & 0x2000) != 0) {
			arg0.gFloat();
		}
		if ((var2 & 0x4000) != 0) {
			arg0.gFloat();
		}
		if ((var2 & 0x8000) != 0) {
			arg0.g4s();
		}
		if ((var2 & 0x40) != 0) {
			arg0.gFloat();
		}
		if (var3) {
			arg0.gFloat();
			arg0.gFloat();
			arg0.gFloat();
		}
		if ((var2 & 0x10000) != 0) {
			arg0.gFloat();
		}
		if ((var2 & 0x20000) != 0) {
			arg0.gFloat();
		}
		if ((var2 & 0x100) != 0) {
			this.speedU = (float) arg0.g2s() * 127.0F / 32767.0F / 64.0F;
		}
		if ((var2 & 0x200) != 0) {
			this.speedV = (float) arg0.g2s() * 127.0F / 32767.0F / 64.0F;
		}
		byte var4 = (byte) arg0.g1();
		this.repeatS = (byte) (var4 & 0x7);
		this.repeatT = (byte) (var4 >> 3 & 0x7);
		SerializableEnums.decode(FacetMode.method4590(), arg0.g1());
		MaterialQualityMode var5 = (MaterialQualityMode) SerializableEnums.decode(MaterialQualityMode.method745(), arg0.g1());
		if (MaterialQualityMode.HD == var5) {
			this.highDetail = true;
		} else if (MaterialQualityMode.LD == var5) {
			this.field1361 = true;
		}
		this.alphaMode = (MaterialAlphaMode) SerializableEnums.decode(MaterialAlphaMode.method8501(), arg0.g1());
		if (MaterialAlphaMode.TEST == this.alphaMode) {
			this.alphaThreshold = (byte) arg0.g1();
		}
		this.averageColour = (short) arg0.g2();
		int var6 = arg0.g1();
		this.size = method7618(var6);
		if (this.size == -1) {
		}
	}
}
