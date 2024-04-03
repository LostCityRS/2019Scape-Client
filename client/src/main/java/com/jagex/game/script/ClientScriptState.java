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
	public int[] intLocals;

	@ObfuscatedName("yf.n")
	public Object[] objectLocals;

	@ObfuscatedName("yf.m")
	public long[] longLocals;

	@ObfuscatedName("yf.k")
	public int[] field8214 = new int[5];

	@ObfuscatedName("yf.f")
	public int[][] field8215 = new int[5][5000];

	@ObfuscatedName("yf.w")
	public int[] intStack = new int[1000];

	@ObfuscatedName("yf.l")
	public int isp = 0;

	@ObfuscatedName("yf.u")
	public Object[] objectStack = new Object[1000];

	@ObfuscatedName("yf.z")
	public int osp = 0;

	@ObfuscatedName("yf.p")
	public long[] longStack = new long[1000];

	@ObfuscatedName("yf.d")
	public int lsp = 0;

	@ObfuscatedName("yf.c")
	public int fp = 0;

	@ObfuscatedName("yf.r")
	public ScriptFrame[] frames = new ScriptFrame[50];

	@ObfuscatedName("yf.v")
	public ActiveComponent activeComponent = new ActiveComponent();

	@ObfuscatedName("yf.o")
	public ActiveComponent activeComponent2 = new ActiveComponent();

	@ObfuscatedName("yf.s")
	public boolean secondary;

	@ObfuscatedName("yf.y")
	public QuickChatPhrase activeChatPhrase;

	@ObfuscatedName("yf.q")
	public ClanSettings activeClanSettings;

	@ObfuscatedName("yf.x")
	public ClanChannel activeClanChannel;

	@ObfuscatedName("yf.b")
	public PathingEntity activeEntity;

	@ObfuscatedName("yf.h")
	public Location activeLoc;

	@ObfuscatedName("yf.a")
	public ObjStackEntity activeObj;

	@ObfuscatedName("yf.g")
	public Map primaryVars = new HashMap();

	@ObfuscatedName("yf.i")
	public Map secondaryVars = new HashMap();

	@ObfuscatedName("yf.j")
	public int nestedCount = 0;

	@ObfuscatedName("yf.t")
	public int field8231;

	@ObfuscatedName("yf.ae")
	public int[] intOperands;

	@ObfuscatedName("yf.ag")
	public ClientScriptCommand[] instructions;

	@ObfuscatedName("yf.ah")
	public int pc = -1;

	@ObfuscatedName("yf.al")
	public ClientScript script;
}
