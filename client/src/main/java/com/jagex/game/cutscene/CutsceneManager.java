package com.jagex.game.cutscene;

import com.jagex.core.datastruct.HashTable;
import com.jagex.core.datastruct.LinkList;
import com.jagex.core.io.Packet;
import com.jagex.game.client.ClientMessage;
import com.jagex.game.config.vartype.VarIntDomain;
import com.jagex.game.network.protocol.ClientProt;
import com.jagex.game.script.ClientTriggerType;
import deob.ObfuscatedName;
import rs2.client.Client;
import rs2.client.clientscript.ScriptRunner;

@ObfuscatedName("eq")
public class CutsceneManager {

	@ObfuscatedName("eq.e")
	public static LinkList field1712 = new LinkList();

	@ObfuscatedName("eq.n")
	public static CutsceneSpline[] field1714;

	@ObfuscatedName("eq.m")
	public static CutsceneEntity[] entities;

	@ObfuscatedName("vl.k")
	public static CutsceneLocation[] field7317;

	@ObfuscatedName("zs.f")
	public static CutsceneRoute[] field8358;

	@ObfuscatedName("eq.w")
	public static CutsceneAction[] actions;

	@ObfuscatedName("eq.l")
	public static HashTable varPlayerOverrides = new HashTable(32);

	@ObfuscatedName("eq.u")
	public static int field1715 = 1;

	@ObfuscatedName("eq.z")
	public static int field1716 = 0;

	@ObfuscatedName("eq.p")
	public static int field1710 = 0;

	@ObfuscatedName("eq.d")
	public static boolean field1711 = false;

	@ObfuscatedName("ahx.c")
	public static short field10538;

	@ObfuscatedName("ala.r")
	public static short field11700;

	@ObfuscatedName("eq.v")
	public static short field1719;

	@ObfuscatedName("eq.o")
	public static short field1720;

	@ObfuscatedName("eq.s")
	public static int field1717 = -1;

	@ObfuscatedName("eq.y")
	public static int field1722 = -1;

	@ObfuscatedName("ai.q")
	public static CutsceneLoadingStage field694;

	@ObfuscatedName("eq.x")
	public static final VarIntDomain field1723 = new CutsceneVarDomain();

	public CutsceneManager() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("xj.e(II)Z")
	public static boolean load(int arg0) {
		if (field1722 != arg0 || field694 == null) {
			method3551();
			field694 = CutsceneLoadingStage.field1724;
			field1722 = arg0;
		}
		if (field694 == CutsceneLoadingStage.field1724) {
			byte[] var1 = Client.cutscenesJs5.fetchFile(arg0);
			if (var1 == null) {
				return false;
			}
			Packet var2 = new Packet(var1);
			method6121(var2);
			int var3 = var2.g1();
			for (int var4 = 0; var4 < var3; var4++) {
				field1712.addTail(new CutsceneTemplate(var2));
			}
			int var5 = var2.gSmart1or2();
			field1714 = new CutsceneSpline[var5];
			for (int var6 = 0; var6 < var5; var6++) {
				field1714[var6] = new CutsceneSpline(var2);
			}
			int var7 = var2.gSmart1or2();
			entities = new CutsceneEntity[var7];
			for (int var8 = 0; var8 < var7; var8++) {
				entities[var8] = new CutsceneEntity(var2, var8);
			}
			int var9 = var2.gSmart1or2();
			field7317 = new CutsceneLocation[var9];
			for (int var10 = 0; var10 < var9; var10++) {
				field7317[var10] = new CutsceneLocation(var2);
			}
			int var11 = var2.gSmart1or2();
			field8358 = new CutsceneRoute[var11];
			for (int var12 = 0; var12 < var11; var12++) {
				field8358[var12] = new CutsceneRoute(var2);
			}
			int var13 = var2.gSmart1or2();
			actions = new CutsceneAction[var13];
			for (int var14 = 0; var14 < var13; var14++) {
				actions[var14] = CutsceneAction.method14342(var2);
			}
			field694 = CutsceneLoadingStage.field1725;
		}
		if (field694 == CutsceneLoadingStage.field1725) {
			boolean var15 = true;
			CutsceneEntity[] var16 = entities;
			for (int var17 = 0; var17 < var16.length; var17++) {
				CutsceneEntity var18 = var16[var17];
				if (!var18.method2871()) {
					var15 = false;
				}
			}
			CutsceneAction[] var19 = actions;
			for (int var20 = 0; var20 < var19.length; var20++) {
				CutsceneAction var21 = var19[var20];
				if (!var21.method2891()) {
					var15 = false;
				}
			}
			CutsceneLocation[] var22 = field7317;
			for (int var23 = 0; var23 < var22.length; var23++) {
				CutsceneLocation var24 = var22[var23];
				if (!var24.method2849()) {
					var15 = false;
				}
			}
			if (!var15) {
				return false;
			}
			field694 = CutsceneLoadingStage.field1726;
		}
		return true;
	}

	@ObfuscatedName("nh.n(Lalw;I)V")
	public static void method6121(Packet arg0) {
		while (true) {
			int var1 = arg0.g1();
			switch(var1) {
				case 0:
					field1716 = arg0.g2();
					field1710 = arg0.g2();
					break;
				case 255:
					return;
			}
		}
	}

	@ObfuscatedName("gf.m(I)V")
	public static void method3551() {
		varPlayerOverrides.removeAll();
		field1712.removeAll();
		field1714 = null;
		entities = null;
		field7317 = null;
		field8358 = null;
		actions = null;
		field1715 = 1;
		field1716 = 0;
		field1710 = 0;
		field694 = null;
		field1722 = -1;
		field1717 = -1;
		if (!field1711) {
			return;
		}
		Client.field10900 = field10538;
		Client.field10943 = field1719;
		Client.field11070 = field11700;
		Client.field11071 = field1720;
		field1711 = false;
	}

	@ObfuscatedName("cs.k(I)V")
	public static void method1576() {
		field10538 = Client.field10900;
		field1719 = Client.field10943;
		field11700 = Client.field11070;
		field1720 = Client.field11071;
		field1711 = true;
		field1717 = Client.audioApi.getCurrentSong();
		if (field1710 != 0 && field1716 != 0) {
			Client.field11070 = 334;
			Client.field11071 = 334;
			Client.field10943 = Client.field10900 = (short) (field1710 * 512 / field1716);
		}
	}

	@ObfuscatedName("qb.f(ZI)V")
	public static void finish(boolean arg0) {
		if (Client.sceneState == 4 || Client.sceneState == 3) {
			return;
		}
		if (!arg0) {
			if (actions != null) {
				CutsceneAction[] var1 = actions;
				for (int var2 = 0; var2 < var1.length; var2++) {
					CutsceneAction var3 = var1[var2];
					var3.method2896();
				}
			}
			if (field1717 != -1) {
				Client.audioApi.playSong(field1717, 255);
			}
		}
		Client.sceneState = 4;
		Client.field8729 = null;
		Client.field10877 = false;
		if (field1722 > 0) {
			ScriptRunner.executeTriggeredScriptMapElement(ClientTriggerType.CUTSCENE_END, field1722, -1);
		}
		method3551();
		ClientMessage var4 = ClientMessage.createMessage(ClientProt.CUTSCENE_FINISHED, Client.gameConnection.randomOut);
		var4.buf.p1(arg0 ? 1 : 0);
		Client.gameConnection.queue(var4);
	}
}
