package com.jagex.game.script;

import com.jagex.game.config.quickchatphrasetype.QuickChatPhrase;
import com.jagex.game.script.activepointers.ActiveComponent;
import com.jagex.game.world.entity.Location;
import com.jagex.game.world.entity.ObjStackEntity;
import deob.ObfuscatedName;
import rs2.client.logic.clans.ClanChannel;
import rs2.client.logic.clans.ClanSettings;
import rs2.client.scene.entities.PathingEntity;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("yf")
public class ClientScriptState {

	@ObfuscatedName("yf.e")
	public int[] field8213;

	@ObfuscatedName("yf.n")
	public Object[] field8212;

	@ObfuscatedName("yf.m")
	public long[] field8219;

	@ObfuscatedName("yf.k")
	public int[] field8214 = new int[5];

	@ObfuscatedName("yf.f")
	public int[][] field8215 = new int[5][5000];

	@ObfuscatedName("yf.w")
	public int[] field8216 = new int[1000];

	@ObfuscatedName("yf.l")
	public int field8226 = 0;

	@ObfuscatedName("yf.u")
	public Object[] field8218 = new Object[1000];

	@ObfuscatedName("yf.z")
	public int field8211 = 0;

	@ObfuscatedName("yf.p")
	public long[] field8224 = new long[1000];

	@ObfuscatedName("yf.d")
	public int field8238 = 0;

	@ObfuscatedName("yf.c")
	public int field8222 = 0;

	@ObfuscatedName("yf.r")
	public ScriptFrame[] field8223 = new ScriptFrame[50];

	@ObfuscatedName("yf.v")
	public ActiveComponent field8217 = new ActiveComponent();

	@ObfuscatedName("yf.o")
	public ActiveComponent field8225 = new ActiveComponent();

	@ObfuscatedName("yf.s")
	public boolean field8235;

	@ObfuscatedName("yf.y")
	public QuickChatPhrase field8240;

	@ObfuscatedName("yf.q")
	public ClanSettings field8227;

	@ObfuscatedName("yf.x")
	public ClanChannel field8228;

	@ObfuscatedName("yf.b")
	public PathingEntity field8221;

	@ObfuscatedName("yf.h")
	public Location field8230;

	@ObfuscatedName("yf.a")
	public ObjStackEntity field8232;

	@ObfuscatedName("yf.g")
	public Map field8234 = new HashMap();

	@ObfuscatedName("yf.i")
	public Map field8233 = new HashMap();

	@ObfuscatedName("yf.j")
	public int field8229 = 0;

	@ObfuscatedName("yf.t")
	public int field8231;

	@ObfuscatedName("yf.ae")
	public int[] field8236;

	@ObfuscatedName("yf.ag")
	public ClientScriptCommand[] field8237;

	@ObfuscatedName("yf.ah")
	public int field8220 = -1;

	@ObfuscatedName("yf.al")
	public ClientScript field8239;
}
