package com.jagex.game.shared.framework.gwc;

import com.jagex.core.io.Packet;
import deob.ObfuscatedName;

@ObfuscatedName("wb")
public class GWC {

	@ObfuscatedName("wb.k")
	public static boolean field7645 = false;

	@ObfuscatedName("wb.f")
	public static GWCWorld[] field7644;

	@ObfuscatedName("va.w")
	public static int field7414;

	@ObfuscatedName("jh.l")
	public static int field3011;

	@ObfuscatedName("v.u")
	public static int field533;

	@ObfuscatedName("wb.z")
	public static GWCLocation[] field7647;

	@ObfuscatedName("wb.p")
	public static int field7642;

	public GWC() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("js.e(IB)Lalc;")
	public static GWCWorld method4944(int arg0) {
		return field7645 && arg0 >= field7414 && arg0 <= field3011 ? field7644[arg0 - field7414] : null;
	}

	@ObfuscatedName("x.n([BI)Z")
	public static boolean method570(byte[] arg0) {
		Packet var1 = new Packet(arg0);
		int var2 = var1.g1();
		if (var2 != 2) {
			return false;
		}
		boolean var3 = var1.g1() == 1;
		if (var3) {
			method10593(var1);
		}
		method4513(var1);
		return true;
	}

	@ObfuscatedName("yz.m(Lalw;I)V")
	public static void method10593(Packet arg0) {
		int var1 = arg0.gSmart1or2();
		field7647 = new GWCLocation[var1];
		for (int var2 = 0; var2 < var1; var2++) {
			field7647[var2] = new GWCLocation();
			field7647[var2].field7634 = arg0.gSmart1or2();
			field7647[var2].field7633 = arg0.gjstr2();
		}
		field7414 = arg0.gSmart1or2();
		field3011 = arg0.gSmart1or2();
		field533 = arg0.gSmart1or2();
		field7644 = new GWCWorld[field3011 - field7414 + 1];
		for (int var3 = 0; var3 < field533; var3++) {
			int var4 = arg0.gSmart1or2();
			GWCWorld var5 = field7644[var4] = new GWCWorld();
			var5.field7640 = arg0.g1();
			var5.field7639 = arg0.g4s();
			var5.field11702 = arg0.gSmart1or2();
			if (var5.field11702 != 0) {
				var5.field11706 = arg0.gjstr2();
			}
			var5.field11705 = field7414 + var4;
			var5.field11704 = arg0.gjstr2();
			var5.field11703 = arg0.gjstr2();
		}
		field7642 = arg0.g4s();
		field7645 = true;
	}

	@ObfuscatedName("iw.k(Lalw;I)V")
	public static void method4513(Packet arg0) {
		for (int var1 = 0; var1 < field533; var1++) {
			int var2 = arg0.gSmart1or2();
			int var3 = arg0.g2();
			if (var3 == 65535) {
				var3 = -1;
			}
			if (field7644[var2] != null) {
				field7644[var2].field7641 = var3;
			}
		}
	}
}
