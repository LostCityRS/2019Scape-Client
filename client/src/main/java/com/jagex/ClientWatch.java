package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

import java.awt.*;
import java.util.Queue;
import java.util.*;

@ObfuscatedName("xc")
public class ClientWatch {

	@ObfuscatedName("xc.e")
	public static long field7947 = -1L;

	@ObfuscatedName("xc.n")
	public static int field7945 = 0;

	@ObfuscatedName("xc.m")
	public static boolean field7944 = true;

	@ObfuscatedName("xc.k")
	public static final AppletMouseLogger field7949 = new AppletMouseLogger();

	@ObfuscatedName("xc.f")
	public static final NativeMouseLogger field7948 = new NativeMouseLogger();

	@ObfuscatedName("xc.w")
	public static Queue field7946 = new LinkedList();

	public ClientWatch() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("cr.e(I)V")
	public static void method1427() {
		if (Statics.method5216()) {
			NativeMouse.method17426(new NativeMouseLoggerNativeMouseListener());
		}
	}

	@ObfuscatedName("arw.n(I)V")
	public static void method19265() {
		NativeMouse.method13850();
	}

	@ObfuscatedName("yu.m(S)V")
	public static void method13845() {
		field7949.method10260();
		field7948.method10260();
		field7947 = -1L;
		field7944 = true;
	}

	@ObfuscatedName("ag.k(Lakm;I)V")
	public static void method670(MouseEvent arg0) {
		if (client.isStateGame(client.state)) {
			field7949.method10261(arg0);
		} else {
			arg0.method17835();
		}
	}

	@ObfuscatedName("na.f(B)V")
	public static void method5995() {
		Queue var0 = field7946;
		synchronized (field7946) {
			Point var1;
			if (Statics.canvas.isShowing()) {
				var1 = Statics.canvas.getLocationOnScreen();
			} else {
				var1 = null;
			}
			while (true) {
				while (true) {
					NativeMouseEvent var2 = (NativeMouseEvent) field7946.poll();
					if (var2 == null) {
						return;
					}
					if (var1 != null && Statics.canvas.isShowing() && Statics.focus) {
						var2.method19541(var1);
						if (!var2.method19540() && var2.method17831() < Statics.canvasWid && var2.method17832() < Statics.canvasHei && var2.method17831() >= 0 && var2.method17832() >= 0) {
							int var3 = var2.method17848();
							if (var2.method17848() == -1) {
								field7948.method10261(var2);
							} else if (MouseEvent.method15143(var3)) {
								field7948.method18343(var2);
							}
						}
					} else {
						var2.method17835();
					}
				}
			}
		}
	}

	@ObfuscatedName("gd.l(I)V")
	public static void method3648() {
		method5995();
		field7949.method10280();
		field7948.method10280();
		if (client.field10822 > 0) {
			ClientMessage var0 = Statics.method1604(ClientProt.EVENT_KEYBOARD, client.field10849.field794);
			var0.field11432.p2(client.field10822 * 4);
			for (int var1 = 0; var1 < client.field10822; var1++) {
				KeyboardEvent var2 = client.field11024[var1];
				long var3 = var2.method9133() - field7947;
				if (var3 > 16777215L) {
					var3 = 16777215L;
				}
				field7947 = var2.method9133();
				var0.field11432.p1(var2.method9141());
				var0.field11432.p3((int) var3);
			}
			client.field10849.method934(var0);
		}
		if (field7945 > 0) {
			field7945--;
		}
		if (client.field10902 && field7945 <= 0) {
			field7945 = 20;
			client.field10902 = false;
			int var6;
			int var8;
			if (Statics.field3416 != 3) {
				var6 = (int) client.field11004 >> 3;
				var8 = (int) client.field10895 >> 3;
			} else if (Statics.field9155.method4780() == PositionMode.field2815) {
				PositionEntity var5 = (PositionEntity) Statics.field9155.method4709();
				var6 = CameraHelpers.method9198(var5.field10554) >> 3;
				short var7 = 1024;
				var8 = (var7 * 3 - (CameraHelpers.method2041(var5.field10554) >> 3)) % (var7 * 2);
			} else {
				var6 = 0;
				var8 = 0;
			}
			ClientMessage var9 = Statics.method1604(ClientProt.EVENT_CAMERA_POSITION, client.field10849.field794);
			var9.field11432.p2_alt3(var8);
			var9.field11432.p2(var6);
			client.field10849.method934(var9);
		}
		if (Statics.focus != field7944) {
			field7944 = Statics.focus;
			ClientMessage var10 = Statics.method1604(ClientProt.EVENT_APPLET_FOCUS, client.field10849.field794);
			var10.field11432.p1(Statics.focus ? 1 : 0);
			client.field10849.method934(var10);
		}
		if (!client.field10800) {
			ClientMessage var11 = Statics.method1604(ClientProt.CLIENT_DETAILOPTIONS_STATUS, client.field10849.field794);
			var11.field11432.p1(0);
			int var12 = var11.field11432.pos;
			Packet var13 = Statics.field688.method18156();
			var11.field11432.pdata(var13.data, 0, var13.pos);
			var11.field11432.psize1(var11.field11432.pos - var12);
			client.field10849.method934(var11);
			client.field10800 = true;
		}
		if (client.field10801 || Statics.field688.displayMode.method18545() != 1) {
			return;
		}
		int[] var14 = Statics.field8198.method2413();
		ClientMessage var15 = Statics.method1604(ClientProt.CLIENT_COMPRESSEDTEXTUREFORMAT_SUPPORT, client.field10849.field794);
		var15.field11432.p2(0);
		int var16 = var15.field11432.pos;
		if (var14 == null || var14.length == 0) {
			var15.field11432.p1(0);
		} else {
			var15.field11432.p1(1);
			CompressedTextureFormat[] var17 = CompressedTextureFormat.method1304();
			HashSet var18 = new HashSet();
			ArrayList var19 = new ArrayList();
			int var20 = 0;
			label94: while (true) {
				if (var20 >= var14.length) {
					SerializableEnums.method618(var18, var15.field11432);
					var15.field11432.pSmart1or2(var19.size());
					if (var19.size() <= 0) {
						break;
					}
					int var23 = Integer.MAX_VALUE;
					Iterator var24 = var19.iterator();
					while (var24.hasNext()) {
						Integer var25 = (Integer) var24.next();
						if (var25 < var23) {
							var23 = var25;
						}
					}
					var15.field11432.pSmart2or4(var23);
					Iterator var26 = var19.iterator();
					while (true) {
						if (!var26.hasNext()) {
							break label94;
						}
						Integer var27 = (Integer) var26.next();
						if (var27 != var23) {
							var15.field11432.pSmart2or4(var27 - var23);
						}
					}
				}
				boolean var21 = false;
				for (int var22 = 0; var22 < var17.length; var22++) {
					if (var14[var20] == var17[var22].field1074) {
						var18.add(var17[var22]);
						var21 = true;
						break;
					}
				}
				if (!var21) {
					var19.add(var14[var20]);
				}
				var20++;
			}
		}
		var15.field11432.psize2(var15.field11432.pos - var16);
		client.field10849.method934(var15);
		client.field10801 = true;
	}
}
