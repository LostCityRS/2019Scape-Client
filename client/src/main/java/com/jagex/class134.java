package com.jagex;

import com.jagex.deob.ObfuscatedName;

@ObfuscatedName("dx")
public class class134 {

	@ObfuscatedName("dx.e")
	public static short[] field1626 = new short[500];

	@ObfuscatedName("dx.n")
	public static short[] field1623 = new short[500];

	@ObfuscatedName("dx.m")
	public static short[] field1633 = new short[500];

	@ObfuscatedName("dx.k")
	public static short[] field1625 = new short[500];

	@ObfuscatedName("dx.f")
	public static short[] field1629 = new short[500];

	@ObfuscatedName("dx.w")
	public static byte[] field1624 = new byte[500];

	@ObfuscatedName("dx.l")
	public class971 field1628 = null;

	@ObfuscatedName("dx.u")
	public int field1631 = 0;

	@ObfuscatedName("dx.z")
	public short[] field1630;

	@ObfuscatedName("dx.p")
	public short[] field1627;

	@ObfuscatedName("dx.d")
	public short[] field1622;

	@ObfuscatedName("dx.c")
	public short[] field1632;

	@ObfuscatedName("dx.r")
	public short[] field1634;

	@ObfuscatedName("dx.v")
	public byte[] field1635;

	@ObfuscatedName("dx.o")
	public boolean field1636 = false;

	@ObfuscatedName("dx.s")
	public boolean field1637 = false;

	@ObfuscatedName("dx.y")
	public boolean field1638 = false;

	public class134(byte[] arg0, class971 arg1) {
		this.field1628 = arg1;
		try {
			class997 var3 = new class997(arg0);
			class997 var4 = new class997(arg0);
			int var5 = var3.method17904();
			var3.field11503 += 2;
			int var6 = var3.method17906();
			int var7 = 0;
			int var8 = -1;
			int var9 = -1;
			var4.field11503 = (var3.field11503 + var6);
			for (int var10 = 0; var10 < var6; var10++) {
				int var11 = this.field1628.field11314[var10];
				if (var11 == 0) {
					var8 = var10;
				}
				int var12 = var3.method17904();
				if (var12 > 0) {
					if (var11 == 0) {
						var9 = var10;
					}
					field1626[var7] = (short) var10;
					short var13 = 0;
					if (var11 == 3 || var11 == 10) {
						var13 = 128;
					}
					if (var5 >= 2 && var11 == 7) {
						if ((var12 & 0x1) == 0) {
							field1623[var7] = var13;
						} else {
							field1623[var7] = (short) var4.method17922();
							var4.method17922();
						}
						if ((var12 & 0x2) == 0) {
							field1633[var7] = var13;
						} else {
							field1633[var7] = (short) var4.method17922();
							var4.method17922();
						}
						if ((var12 & 0x4) == 0) {
							field1625[var7] = var13;
						} else {
							field1625[var7] = (short) var4.method17922();
							var4.method17922();
						}
					} else {
						if ((var12 & 0x1) == 0) {
							field1623[var7] = var13;
						} else {
							field1623[var7] = (short) var4.method17922();
						}
						if ((var12 & 0x2) == 0) {
							field1633[var7] = var13;
						} else {
							field1633[var7] = (short) var4.method17922();
						}
						if ((var12 & 0x4) == 0) {
							field1625[var7] = var13;
						} else {
							field1625[var7] = (short) var4.method17922();
						}
					}
					field1624[var7] = (byte) (var12 >>> 3 & 0x3);
					if (var11 == 2 || var11 == 9) {
						field1623[var7] = (short) (field1623[var7] << 2 & 0x3FFF);
						field1633[var7] = (short) (field1633[var7] << 2 & 0x3FFF);
						field1625[var7] = (short) (field1625[var7] << 2 & 0x3FFF);
					}
					field1629[var7] = -1;
					if (var11 == 1 || var11 == 2 || var11 == 3) {
						if (var8 > var9) {
							field1629[var7] = (short) var8;
							var9 = var8;
						}
					} else if (var11 == 5) {
						this.field1636 = true;
					} else if (var11 == 7) {
						this.field1637 = true;
					} else if (var11 == 9 || var11 == 10 || var11 == 8) {
						this.field1638 = true;
					}
					var7++;
				}
			}
			if (var4.field11503 != arg0.length) {
				throw new RuntimeException();
			}
			this.field1631 = var7;
			this.field1630 = new short[var7];
			this.field1627 = new short[var7];
			this.field1622 = new short[var7];
			this.field1632 = new short[var7];
			this.field1634 = new short[var7];
			this.field1635 = new byte[var7];
			for (int var14 = 0; var14 < var7; var14++) {
				this.field1630[var14] = field1626[var14];
				this.field1627[var14] = field1623[var14];
				this.field1622[var14] = field1633[var14];
				this.field1632[var14] = field1625[var14];
				this.field1634[var14] = field1629[var14];
				this.field1635[var14] = field1624[var14];
			}
		} catch (Exception var16) {
			this.field1631 = 0;
			this.field1636 = false;
			this.field1637 = false;
		}
	}
}
