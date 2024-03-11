package com.jagex;

import com.jagex.core.io.Packet;
import com.jagex.math.Vector3;
import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("akt")
public class CoordFine extends Node implements Serializable {

	@ObfuscatedName("akt.k")
	public static CoordFine[] field11476 = new CoordFine[0];

	@ObfuscatedName("akt.w")
	public int field11477;

	@ObfuscatedName("akt.l")
	public int field11478;

	@ObfuscatedName("akt.u")
	public int field11479;

	@ObfuscatedName("akt.p")
	public int field11480;

	@ObfuscatedName("l.u(IIIIS)Lakt;")
	public static CoordFine method258(int arg0, int arg1, int arg2, int arg3) {
		CoordFine[] var4 = field11476;
		synchronized (field11476) {
			if (Statics.field4608 == 0) {
				return new CoordFine(arg0, arg1, arg2, arg3);
			} else {
				field11476[--Statics.field4608].method17851(arg0, arg1, arg2, arg3);
				return field11476[Statics.field4608];
			}
		}
	}

	@ObfuscatedName("pu.z(Lakt;I)Lakt;")
	public static CoordFine method7078(CoordFine arg0) {
		CoordFine[] var1 = field11476;
		synchronized (field11476) {
			if (Statics.field4608 == 0) {
				return new CoordFine(arg0);
			} else {
				field11476[--Statics.field4608].method17868(arg0);
				return field11476[Statics.field4608];
			}
		}
	}

	@ObfuscatedName("au.p(IZB)Lakt;")
	public static CoordFine method849(int arg0, boolean arg1) {
		CoordFine[] var2 = field11476;
		synchronized (field11476) {
			if (Statics.field4608 == 0) {
				return new CoordFine(arg0, arg1);
			} else {
				field11476[--Statics.field4608].method17870(arg0, arg1);
				return field11476[Statics.field4608];
			}
		}
	}

	public CoordFine() {
		this.field11477 = -1;
	}

	public CoordFine(int arg0, int arg1, int arg2, int arg3) {
		this.field11477 = arg0;
		this.field11478 = arg1;
		this.field11479 = arg2;
		this.field11480 = arg3;
	}

	public CoordFine(CoordFine arg0) {
		this.field11477 = arg0.field11477;
		this.field11478 = arg0.field11478;
		this.field11479 = arg0.field11479;
		this.field11480 = arg0.field11480;
	}

	public CoordFine(Packet arg0) {
		this.method15115(arg0);
	}

	public CoordFine(int arg0, boolean arg1) {
		if (arg0 == -1) {
			this.field11477 = -1;
		} else {
			this.field11477 = arg0 >> 28 & 0x3;
			this.field11478 = (arg0 >> 14 & 0x3FFF) << 9;
			this.field11479 = 0;
			this.field11480 = (arg0 & 0x3FFF) << 9;
			if (arg1) {
				this.field11478 += 256;
				this.field11480 += 256;
			}
		}
	}

	@ObfuscatedName("akt.d(IIIII)V")
	public void method17851(int arg0, int arg1, int arg2, int arg3) {
		this.field11477 = arg0;
		this.field11478 = arg1;
		this.field11479 = arg2;
		this.field11480 = arg3;
	}

	@ObfuscatedName("akt.c(Lakt;I)V")
	public void method17868(CoordFine arg0) {
		this.field11477 = arg0.field11477;
		this.field11478 = arg0.field11478;
		this.field11479 = arg0.field11479;
		this.field11480 = arg0.field11480;
	}

	@ObfuscatedName("akt.r(IZI)V")
	public void method17870(int arg0, boolean arg1) {
		if (arg0 == -1) {
			this.field11477 = -1;
			return;
		}
		this.field11477 = arg0 >> 28 & 0x3;
		this.field11478 = (arg0 >> 14 & 0x3FFF) << 9;
		this.field11479 = 0;
		this.field11480 = (arg0 & 0x3FFF) << 9;
		if (arg1) {
			this.field11478 += 256;
			this.field11480 += 256;
		}
	}

	@ObfuscatedName("akt.v(I)Lox;")
	public Vector3 method17853() {
		return new Vector3((float) this.field11478, (float) this.field11479, (float) this.field11480);
	}

	@ObfuscatedName("akt.y(Lalw;I)V")
	public void method17852(Packet arg0) {
		arg0.p1(this.field11477);
		arg0.p4(this.field11478);
		arg0.p4(this.field11479);
		arg0.p4(this.field11480);
	}

	public String toString() {
		return "Level: " + this.field11477 + " Coord: " + this.field11478 + "," + this.field11479 + "," + this.field11480 + " Coord Split: " + (this.field11478 >> 15) + "," + (this.field11480 >> 15) + "," + (this.field11478 >> 9 & 0x3F) + "," + (this.field11480 >> 9 & 0x3F) + "," + (this.field11478 & 0x1FF) + "," + (this.field11480 & 0x1FF);
	}

	@ObfuscatedName("akt.e(B)I")
	public int method15118() {
		return Statics.method3582();
	}

	@ObfuscatedName("akt.n(Lalw;S)V")
	public void method15114(Packet arg0) {
		this.method17852(arg0);
	}

	@ObfuscatedName("akt.m(Lalw;I)V")
	public void method15115(Packet arg0) {
		this.field11477 = arg0.g1();
		this.field11478 = arg0.g4s();
		this.field11479 = arg0.g4s();
		this.field11480 = arg0.g4s();
	}
}
