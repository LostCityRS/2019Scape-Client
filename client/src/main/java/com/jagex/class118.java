package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("dv")
public class class118 {

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
	public int field1334 = -1;

	@ObfuscatedName("dv.as")
	public int field1302 = -1;

	@ObfuscatedName("dv.at")
	public int field1357;

	@ObfuscatedName("dv.ad")
	public float field1317 = 0.0F;

	@ObfuscatedName("dv.am")
	public float field1338 = 0.0F;

	@ObfuscatedName("dv.au")
	public boolean field1336 = false;

	@ObfuscatedName("dv.ar")
	public class603 field1340 = class603.field7575;

	@ObfuscatedName("dv.ap")
	public byte field1358 = -1;

	@ObfuscatedName("dv.aq")
	public byte field1307 = 0;

	@ObfuscatedName("dv.ax")
	public byte field1343 = 0;

	@ObfuscatedName("dv.bh")
	public byte field1308 = 0;

	@ObfuscatedName("dv.bx")
	public byte field1305 = 0;

	@ObfuscatedName("dv.bd")
	public int field1359 = 0;

	@ObfuscatedName("dv.bc")
	public byte field1332 = 0;

	@ObfuscatedName("dv.bi")
	public boolean field1361 = false;

	@ObfuscatedName("dv.bn")
	public boolean field1342 = false;

	@ObfuscatedName("dv.bt")
	public byte field1363 = 0;

	@ObfuscatedName("dv.bq")
	public byte field1364 = -1;

	@ObfuscatedName("dv.bm")
	public byte field1311 = 0;

	@ObfuscatedName("dv.bb")
	public short field1366 = 0;

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
	public void method1909(int arg0, class997 arg1) {
		this.field1329 = arg0;
		byte var3 = (byte) arg1.method17904();
		if (var3 == 0) {
			this.method1904(arg1);
		} else {
			this.method1905(arg1);
		}
	}

	@ObfuscatedName("dv.k(Lalw;I)V")
	public void method1904(class997 arg0) {
		arg0.method17904();
		int var2 = arg0.method17904();
		this.field1357 = method7618(var2);
		if (this.field1357 == -1) {
		}
		int var3 = arg0.method17910();
		this.field1330 = (var3 & 0x1) != 0;
		this.field1331 = (var3 & 0x2) != 0;
		this.field1321 = (var3 & 0x8) != 0;
		this.field1333 = (var3 & 0x10) != 0;
		if (this.field1330 || this.field1333) {
			this.field1334 = arg0.method17910();
		}
		if (this.field1321 || this.field1331) {
			this.field1302 = arg0.method17910();
		}
		byte var4 = (byte) arg0.method17904();
		this.field1307 = (byte) (var4 & 0x7);
		this.field1343 = (byte) (var4 >> 3 & 0x7);
		int var5 = arg0.method17910();
		boolean var6 = (var5 & 0x800) != 0;
		if ((var5 & 0x10) != 0) {
			arg0.method17916();
			arg0.method17916();
		}
		if (this.field1331) {
			arg0.method17916();
		}
		this.field1336 = arg0.method17904() == 1;
		class686.method1897(class604.method4590(), arg0.method17904());
		this.field1340 = (class603) class686.method1897(Statics.method8501(), arg0.method17904());
		if (class603.field7574 == this.field1340) {
			this.field1358 = (byte) arg0.method17904();
		}
		if (var6) {
			arg0.method17916();
			arg0.method17916();
			arg0.method17916();
		}
		int var7 = arg0.method17904();
		if ((var7 & 0x1) != 0) {
			this.field1317 = (float) arg0.method17973() * 127.0F / 32767.0F / 64.0F;
		}
		if ((var7 & 0x2) != 0) {
			this.field1338 = (float) arg0.method17973() * 127.0F / 32767.0F / 64.0F;
		}
		if (arg0.method17904() != 1) {
			return;
		}
		this.field1308 = (byte) arg0.method17904();
		this.field1305 = (byte) arg0.method17904();
		this.field1359 = arg0.method17910();
		this.field1311 = (byte) arg0.method17904();
		arg0.method17904();
		this.field1332 = (byte) arg0.method17904();
		this.field1361 = arg0.method17904() == 1;
		this.field1342 = arg0.method17904() == 1;
		this.field1363 = (byte) arg0.method17904();
		this.field1364 = (byte) arg0.method17904();
		this.field1366 = (short) arg0.method17906();
	}

	@ObfuscatedName("dv.f(Lalw;I)V")
	public void method1905(class997 arg0) {
		int var2 = arg0.method17910();
		boolean var3 = (var2 & 0x800) != 0;
		if ((var2 & 0x20) != 0) {
			this.field1330 = true;
			arg0.method17904();
			this.field1334 = arg0.method17910();
		}
		if ((var2 & 0x40) != 0) {
			arg0.method17904();
			arg0.method17910();
		}
		if ((var2 & 0x80) != 0) {
			arg0.method17904();
			arg0.method17910();
		}
		if ((var2 & 0x1000) != 0) {
			arg0.method17916();
		}
		if ((var2 & 0x2000) != 0) {
			arg0.method17916();
		}
		if ((var2 & 0x4000) != 0) {
			arg0.method17916();
		}
		if ((var2 & 0x8000) != 0) {
			arg0.method17910();
		}
		if ((var2 & 0x40) != 0) {
			arg0.method17916();
		}
		if (var3) {
			arg0.method17916();
			arg0.method17916();
			arg0.method17916();
		}
		if ((var2 & 0x10000) != 0) {
			arg0.method17916();
		}
		if ((var2 & 0x20000) != 0) {
			arg0.method17916();
		}
		if ((var2 & 0x100) != 0) {
			this.field1317 = (float) arg0.method17973() * 127.0F / 32767.0F / 64.0F;
		}
		if ((var2 & 0x200) != 0) {
			this.field1338 = (float) arg0.method17973() * 127.0F / 32767.0F / 64.0F;
		}
		byte var4 = (byte) arg0.method17904();
		this.field1307 = (byte) (var4 & 0x7);
		this.field1343 = (byte) (var4 >> 3 & 0x7);
		class686.method1897(class604.method4590(), arg0.method17904());
		class606 var5 = (class606) class686.method1897(class606.method745(), arg0.method17904());
		if (class606.field7589 == var5) {
			this.field1342 = true;
		} else if (class606.field7588 == var5) {
			this.field1361 = true;
		}
		this.field1340 = (class603) class686.method1897(Statics.method8501(), arg0.method17904());
		if (class603.field7574 == this.field1340) {
			this.field1358 = (byte) arg0.method17904();
		}
		this.field1366 = (short) arg0.method17906();
		int var6 = arg0.method17904();
		this.field1357 = method7618(var6);
		if (this.field1357 == -1) {
		}
	}
}
