package com.jagex.game;

import com.jagex.core.datastruct.SerializableEnums;
import com.jagex.core.io.Packet;
import com.jagex.game.camera.position.PositionEntity;
import com.jagex.game.client.*;
import com.jagex.game.network.protocol.ClientProt;
import com.jagex.game.world.entity.PositionMode;
import com.jagex.graphics.CompressedTextureFormat;
import com.jagex.graphics.camera.CameraHelpers;
import deob.ObfuscatedName;
import rs2.client.Client;

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
		if (NativeMouse.method5216()) {
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
		if (Client.isStateGame(Client.state)) {
			field7949.method10261(arg0);
		} else {
			arg0.release();
		}
	}

	@ObfuscatedName("na.f(B)V")
	public static void method5995() {
		Queue var0 = field7946;
		synchronized (field7946) {
			Point var1;
			if (GameShell.canvas.isShowing()) {
				var1 = GameShell.canvas.getLocationOnScreen();
			} else {
				var1 = null;
			}
			while (true) {
				while (true) {
					NativeMouseEvent var2 = (NativeMouseEvent) field7946.poll();
					if (var2 == null) {
						return;
					}
					if (var1 != null && GameShell.canvas.isShowing() && GameShell.focus) {
						var2.method19541(var1);
						if (!var2.method19540() && var2.getMouseClickX() < GameShell.canvasWid && var2.getMouseClickY() < GameShell.canvasHei && var2.getMouseClickX() >= 0 && var2.getMouseClickY() >= 0) {
							int var3 = var2.getButtonAction();
							if (var2.getButtonAction() == -1) {
								field7948.method10261(var2);
							} else if (MouseEvent.method15143(var3)) {
								field7948.method18343(var2);
							}
						}
					} else {
						var2.release();
					}
				}
			}
		}
	}

	@ObfuscatedName("wc.w(B)V")
	public static void method9835() {
		Queue var0 = field7946;
		synchronized (field7946) {
			while (true) {
				NativeMouseEvent var1 = (NativeMouseEvent) field7946.poll();
				if (var1 == null) {
					return;
				}
				var1.release();
			}
		}
	}

	@ObfuscatedName("gd.l(I)V")
	public static void method3648() {
		method5995();
		field7949.method10280();
		field7948.method10280();
		if (Client.keyboardEventCount > 0) {
			ClientMessage var0 = ClientMessage.createMessage(ClientProt.EVENT_KEYBOARD, Client.gameConnection.randomOut);
			var0.buf.p2(Client.keyboardEventCount * 4);
			for (int var1 = 0; var1 < Client.keyboardEventCount; var1++) {
				KeyboardEvent var2 = Client.keyboardEvents[var1];
				long var3 = var2.method9133() - field7947;
				if (var3 > 16777215L) {
					var3 = 16777215L;
				}
				field7947 = var2.method9133();
				var0.buf.p1(var2.method9141());
				var0.buf.p3((int) var3);
			}
			Client.gameConnection.queue(var0);
		}
		if (field7945 > 0) {
			field7945--;
		}
		if (Client.field10902 && field7945 <= 0) {
			field7945 = 20;
			Client.field10902 = false;
			int var6;
			int var8;
			if (Client.cameraState != 3) {
				var6 = (int) Client.orbitCameraPitch >> 3;
				var8 = (int) Client.orbitCameraYaw >> 3;
			} else if (Client.cam2.getPositionMode() == PositionMode.ENTITY) {
				PositionEntity var5 = (PositionEntity) Client.cam2.getPosition();
				var6 = CameraHelpers.method9198(var5.field10554) >> 3;
				short var7 = 1024;
				var8 = (var7 * 3 - (CameraHelpers.method2041(var5.field10554) >> 3)) % (var7 * 2);
			} else {
				var6 = 0;
				var8 = 0;
			}
			ClientMessage var9 = ClientMessage.createMessage(ClientProt.EVENT_CAMERA_POSITION, Client.gameConnection.randomOut);
			var9.buf.p2_alt3(var8);
			var9.buf.p2(var6);
			Client.gameConnection.queue(var9);
		}
		if (GameShell.focus != field7944) {
			field7944 = GameShell.focus;
			ClientMessage var10 = ClientMessage.createMessage(ClientProt.EVENT_APPLET_FOCUS, Client.gameConnection.randomOut);
			var10.buf.p1(GameShell.focus ? 1 : 0);
			Client.gameConnection.queue(var10);
		}
		if (!Client.preferencesChangeNotified) {
			ClientMessage var11 = ClientMessage.createMessage(ClientProt.CLIENT_DETAILOPTIONS_STATUS, Client.gameConnection.randomOut);
			var11.buf.p1(0);
			int var12 = var11.buf.pos;
			Packet var13 = Client.preferences.createPreferencesBlock();
			var11.buf.pdata(var13.data, 0, var13.pos);
			var11.buf.psize1(var11.buf.pos - var12);
			Client.gameConnection.queue(var11);
			Client.preferencesChangeNotified = true;
		}
		if (Client.compressedTextureFormatSupportTransmitted || Client.preferences.toolkit.getValue() != 1) {
			return;
		}
		int[] var14 = Client.toolkit.textureFormat();
		ClientMessage var15 = ClientMessage.createMessage(ClientProt.CLIENT_COMPRESSEDTEXTUREFORMAT_SUPPORT, Client.gameConnection.randomOut);
		var15.buf.p2(0);
		int var16 = var15.buf.pos;
		if (var14 == null || var14.length == 0) {
			var15.buf.p1(0);
		} else {
			var15.buf.p1(1);
			CompressedTextureFormat[] var17 = CompressedTextureFormat.values();
			HashSet var18 = new HashSet();
			ArrayList var19 = new ArrayList();
			int var20 = 0;
			label94: while (true) {
				if (var20 >= var14.length) {
					SerializableEnums.encodeSet(var18, var15.buf);
					var15.buf.pSmart1or2(var19.size());
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
					var15.buf.pSmart2or4(var23);
					Iterator var26 = var19.iterator();
					while (true) {
						if (!var26.hasNext()) {
							break label94;
						}
						Integer var27 = (Integer) var26.next();
						if (var27 != var23) {
							var15.buf.pSmart2or4(var27 - var23);
						}
					}
				}
				boolean var21 = false;
				for (int var22 = 0; var22 < var17.length; var22++) {
					if (var14[var20] == var17[var22].code) {
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
		var15.buf.psize2(var15.buf.pos - var16);
		Client.gameConnection.queue(var15);
		Client.compressedTextureFormatSupportTransmitted = true;
	}
}
