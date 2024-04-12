package com.jagex.game.scene;

import com.jagex.core.datastruct.LinkList;
import com.jagex.core.datastruct.Node;
import com.jagex.game.client.ClientMapLoader;
import com.jagex.game.world.entity.*;
import com.jagex.game.MiniMap;
import com.jagex.graphics.scenegraph.GraphEntity;
import com.jagex.math.ScaleRotTrans;
import deob.ObfuscatedName;
import rs2.client.Client;

@ObfuscatedName("ajt")
public final class ChangeLocationRequest extends Node {

	@ObfuscatedName("ajt.k")
	public int level;

	@ObfuscatedName("ajt.f")
	public int field11229;

	@ObfuscatedName("ajt.w")
	public int x;

	@ObfuscatedName("ajt.l")
	public int z;

	@ObfuscatedName("ajt.u")
	public int field11227;

	@ObfuscatedName("ajt.z")
	public int field11231;

	@ObfuscatedName("ajt.p")
	public int field11232;

	@ObfuscatedName("ajt.d")
	public ScaleRotTrans field11233;

	@ObfuscatedName("ajt.c")
	public int field11234;

	@ObfuscatedName("ajt.r")
	public int field11235;

	@ObfuscatedName("ajt.v")
	public int field11236;

	@ObfuscatedName("ajt.o")
	public ScaleRotTrans field11230;

	@ObfuscatedName("ajt.s")
	public LocTypeCustomisation field11241;

	@ObfuscatedName("ajt.y")
	public boolean field11239 = true;

	@ObfuscatedName("ajt.q")
	public boolean field11240 = false;

	@ObfuscatedName("ajt.x")
	public static LinkList field11237 = new LinkList();

	@ObfuscatedName("ajt.b")
	public static LinkList field11242 = new LinkList();

	@ObfuscatedName("ajt.h")
	public static long field11243 = 1L;

	@ObfuscatedName("jf.e(IIIIIIILoe;B)V")
	public static void method4653(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, ScaleRotTrans arg7) {
		ChangeLocationRequest var8 = null;
		for (ChangeLocationRequest var9 = (ChangeLocationRequest) field11237.head(); var9 != null; var9 = (ChangeLocationRequest) field11237.next()) {
			if (var9.level == arg0 && var9.x == arg1 && var9.z == arg2 && var9.field11229 == arg3) {
				var8 = var9;
				break;
			}
		}
		if (var8 == null) {
			var8 = new ChangeLocationRequest();
			var8.level = arg0;
			var8.field11229 = arg3;
			var8.x = arg1;
			var8.z = arg2;
			if (arg1 >= 0 && arg2 >= 0 && arg1 < Client.world.getSizeX() && arg2 < Client.world.getSizeZ()) {
				method9023(var8);
			}
			field11237.addTail(var8);
		}
		var8.field11234 = arg4;
		var8.field11236 = arg5;
		var8.field11235 = arg6;
		if (arg7 != null) {
			var8.field11230 = new ScaleRotTrans(arg7);
		}
		var8.field11239 = true;
		var8.field11240 = false;
	}

	@ObfuscatedName("pa.n(IIIIIILvp;B)V")
	public static void method6816(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, LocTypeCustomisation arg6) {
		ChangeLocationRequest var7 = null;
		for (ChangeLocationRequest var8 = (ChangeLocationRequest) field11242.head(); var8 != null; var8 = (ChangeLocationRequest) field11242.next()) {
			if (var8.level == arg0 && var8.x == arg1 && var8.z == arg2 && var8.field11229 == arg3) {
				var7 = var8;
				break;
			}
		}
		if (var7 == null) {
			var7 = new ChangeLocationRequest();
			var7.level = arg0;
			var7.field11229 = arg3;
			var7.x = arg1;
			var7.z = arg2;
			field11242.addTail(var7);
		}
		var7.field11234 = arg4;
		var7.field11236 = arg5;
		var7.field11241 = arg6;
		var7.field11239 = true;
		var7.field11240 = false;
	}

	@ObfuscatedName("jx.m(B)V")
	public static final void method5070() {
		for (ChangeLocationRequest var0 = (ChangeLocationRequest) field11237.head(); var0 != null; var0 = (ChangeLocationRequest) field11237.next()) {
			if (var0.field11240) {
				var0.unlink();
			} else {
				var0.field11239 = true;
				if (var0.x >= 0 && var0.z >= 0 && var0.x < Client.world.getSizeX() && var0.z < Client.world.getSizeZ()) {
					method9023(var0);
				}
			}
		}
		for (ChangeLocationRequest var1 = (ChangeLocationRequest) field11242.head(); var1 != null; var1 = (ChangeLocationRequest) field11242.next()) {
			if (var1.field11240) {
				var1.unlink();
			} else {
				var1.field11239 = true;
			}
		}
	}

	@ObfuscatedName("uf.k(Lajt;B)V")
	public static final void method9023(ChangeLocationRequest arg0) {
		Scene var1 = Client.world.getScene();
		if (var1 == null) {
			return;
		}
		Location var2 = null;
		if (arg0.field11229 == 0) {
			var2 = (Location) var1.getWall(arg0.level, arg0.x, arg0.z);
		}
		if (arg0.field11229 == 1) {
			var2 = (Location) var1.getWallDecoration(arg0.level, arg0.x, arg0.z);
		}
		if (arg0.field11229 == 2) {
			var2 = (Location) var1.getEntity(arg0.level, arg0.x, arg0.z, Client.field11001);
		}
		if (arg0.field11229 == 3) {
			var2 = (Location) var1.getGroundDecoration(arg0.level, arg0.x, arg0.z);
		}
		if (var2 == null) {
			arg0.field11227 = -1;
			arg0.field11232 = 0;
			arg0.field11231 = 0;
		} else {
			arg0.field11227 = var2.getId();
			arg0.field11232 = var2.getShape();
			arg0.field11231 = var2.getAngle();
		}
		if (var2 instanceof GraphEntity) {
			GraphEntity var3 = (GraphEntity) var2;
			arg0.field11230 = var3.scaleRotTrans == null ? null : new ScaleRotTrans(var3.scaleRotTrans);
		}
	}

	@ObfuscatedName("gp.f(B)V")
	public static final void updateLocs() {
		for (ChangeLocationRequest var0 = (ChangeLocationRequest) field11237.head(); var0 != null; var0 = (ChangeLocationRequest) field11237.next()) {
			method2834(var0, false);
		}
		for (ChangeLocationRequest var1 = (ChangeLocationRequest) field11242.head(); var1 != null; var1 = (ChangeLocationRequest) field11242.next()) {
			method2834(var1, true);
		}
	}

	@ObfuscatedName("eq.w(Lajt;ZI)V")
	public static final void method2834(ChangeLocationRequest arg0, boolean arg1) {
		if (arg0.field11240) {
			if (arg0.field11227 < 0 || ClientMapLoader.method14705(Client.world.getLocTypeList(), arg0.field11227, arg0.field11232)) {
				if (arg1) {
					method9194(arg0.level, arg0.field11229, arg0.x, arg0.z, null);
				} else {
					method15005(arg0.level, arg0.field11229, arg0.x, arg0.z, arg0.field11227, arg0.field11231, arg0.field11232, arg0.field11233, -1, 0);
				}
				arg0.unlink();
			}
		} else if (arg0.field11239 && arg0.x >= 1 && arg0.z >= 1 && arg0.x <= Client.world.getSizeX() - 2 && arg0.z <= Client.world.getSizeZ() - 2 && (arg0.field11234 < 0 || ClientMapLoader.method14705(Client.world.getLocTypeList(), arg0.field11234, arg0.field11236))) {
			if (arg1) {
				method9194(arg0.level, arg0.field11229, arg0.x, arg0.z, arg0.field11241);
			} else {
				method15005(arg0.level, arg0.field11229, arg0.x, arg0.z, arg0.field11234, arg0.field11235, arg0.field11236, arg0.field11230, -1, 0);
			}
			arg0.field11239 = false;
			if (!arg1 && arg0.field11234 == arg0.field11227 && arg0.field11227 == -1) {
				arg0.unlink();
			} else if (!arg1 && arg0.field11234 == arg0.field11227 && arg0.field11235 == arg0.field11231 && arg0.field11236 == arg0.field11232) {
				arg0.unlink();
			}
		}
	}

	@ObfuscatedName("acv.l(IIIIIIILoe;IIB)V")
	public static final void method15005(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, ScaleRotTrans arg7, int arg8, int arg9) {
		if (arg2 < 1 || arg3 < 1 || arg2 > Client.world.getSizeX() - 2 || arg3 > Client.world.getSizeZ() - 2) {
			return;
		}
		int var10 = arg0;
		if (arg0 < 3 && Client.world.getSceneLevelTileFlags().isLinkBelow(arg2, arg3)) {
			var10 = arg0 + 1;
		}
		if (Client.world.getScene() == null) {
			return;
		}
		Client.world.method7744().method16871(Client.toolkit, arg0, arg1, arg2, arg3);
		if (arg4 >= 0) {
			int var11 = Client.preferences.groundDecoration.getValue();
			Client.preferences.setPreference(Client.preferences.groundDecoration, 1);
			Client.world.method7744().addGroundLoc(Client.toolkit, var10, arg0, arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg7);
			Client.preferences.setPreference(Client.preferences.groundDecoration, var11);
		}
		MiniMap.method16444(Client.localPlayerEntity.level);
	}

	@ObfuscatedName("ud.u(IIIILvp;I)V")
	public static final void method9194(int arg0, int arg1, int arg2, int arg3, LocTypeCustomisation arg4) {
		if (arg2 < 1 || arg3 < 1 || arg2 > Client.world.getSizeX() - 2 || arg3 > Client.world.getSizeZ() - 2) {
			return;
		}
		if (Client.world.getScene() == null) {
			return;
		}
		Location var5 = Client.world.method7744().getLocation(arg0, arg1, arg2, arg3);
		if (var5 == null) {
			return;
		}
		if (var5 instanceof DynamicSceneryEntity) {
			((DynamicSceneryEntity) var5).method17369(arg4);
		} else if (var5 instanceof DynamicGroundDecorEntity) {
			((DynamicGroundDecorEntity) var5).method17396(arg4);
		} else if (var5 instanceof DynamicWallEntity) {
			((DynamicWallEntity) var5).method17429(arg4);
		} else if (var5 instanceof DynamicWallDecorEntity) {
			((DynamicWallDecorEntity) var5).method17425(arg4);
		}
	}
}
