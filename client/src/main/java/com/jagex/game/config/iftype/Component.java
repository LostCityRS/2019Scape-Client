package com.jagex.game.config.iftype;

import com.jagex.core.datastruct.IntNode;
import com.jagex.core.datastruct.HashTable;
import com.jagex.core.datastruct.Node;
import com.jagex.core.datastruct.SoftLruHashTable;
import com.jagex.core.io.Packet;
import com.jagex.game.client.Graphic;
import com.jagex.game.client.GroupUserKind;
import com.jagex.game.config.bastype.BASTypeList;
import com.jagex.game.config.idktype.IDKTypeList;
import com.jagex.game.config.iftype.componentproperties.ServerKeyProperties;
import com.jagex.game.config.npctype.NPCTypeCustomisation;
import com.jagex.game.config.npctype.NPCType;
import com.jagex.game.config.npctype.NPCTypeList;
import com.jagex.game.config.objtype.ObjType;
import com.jagex.game.config.objtype.ObjTypeList;
import com.jagex.game.config.seqtype.SeqTypeList;
import com.jagex.game.config.skyboxtype.SkyBoxType;
import com.jagex.game.config.skyboxtype.SkyBoxTypeList;
import com.jagex.game.config.skydecortype.SkyDecorTypeList;
import com.jagex.game.config.vartype.VarIntDomain;
import com.jagex.game.config.vartype.VariableTypeProvider;
import com.jagex.game.world.entity.ObjectNode;
import com.jagex.game.world.entity.PlayerModel;
import com.jagex.graphics.*;
import com.jagex.graphics.particles.ParticleSystem;
import com.jagex.js5.Js5;
import com.jagex.math.Matrix4x3;
import deob.ObfuscatedName;

@ObfuscatedName("hf")
public class Component {

	@ObfuscatedName("hf.e")
	public static int field2234 = 0;

	@ObfuscatedName("hf.n")
	public static int field2301 = 1;

	@ObfuscatedName("hf.m")
	public static int field2157 = 2;

	@ObfuscatedName("hf.k")
	public static int field2266 = 3;

	@ObfuscatedName("hf.f")
	public static int field2159 = 328;

	@ObfuscatedName("hf.w")
	public static int field2341 = 1337;

	@ObfuscatedName("hf.l")
	public static int field2161 = 1403;

	@ObfuscatedName("hf.u")
	public static int field2171 = 1338;

	@ObfuscatedName("hf.z")
	public static int COMPASS = 1339;

	@ObfuscatedName("hf.p")
	public static int WORLD_MAP = 1400;

	@ObfuscatedName("hf.d")
	public static int WORLD_MAP_OVERVIEW = 1401;

	@ObfuscatedName("hf.c")
	public static int DEBUG = 1405;

	@ObfuscatedName("hf.r")
	public static int field2167 = 1406;

	@ObfuscatedName("hf.v")
	public static int field2168 = 1407;

	@ObfuscatedName("hf.o")
	public static int field2169 = 1408;

	@ObfuscatedName("hf.s")
	public static int field2340 = 1409;

	@ObfuscatedName("hf.y")
	public static int field2163 = 1410;

	@ObfuscatedName("hf.q")
	public static int field2172 = 1411;

	@ObfuscatedName("ama.h")
	public static Interface[] interfaces;

	@ObfuscatedName("aag.a")
	public static boolean[] field8424;

	@ObfuscatedName("ua.g")
	public static Js5 interfacesJs5;

	@ObfuscatedName("ec.i")
	public static Js5 modelsJs5;

	@ObfuscatedName("zl.j")
	public static Js5 spritesJs5;

	@ObfuscatedName("hf.t")
	public static SoftLruHashTable spriteCache = new SoftLruHashTable(6000000, 200);

	@ObfuscatedName("hf.ae")
	public static SoftLruHashTable graphicCache = new SoftLruHashTable(8);

	@ObfuscatedName("hf.ag")
	public static SoftLruHashTable skyBoxCache = new SoftLruHashTable(4);

	@ObfuscatedName("hf.ah")
	public static SoftLruHashTable modelCache = new SoftLruHashTable(50);

	@ObfuscatedName("anq.al")
	public static int field11802;

	@ObfuscatedName("hf.ac")
	public static boolean field2338 = false;

	@ObfuscatedName("hf.ai")
	public String name;

	@ObfuscatedName("hf.aw")
	public int field2181;

	@ObfuscatedName("hf.as")
	public int parentlayer = -1;

	@ObfuscatedName("hf.at")
	public int id = -1;

	@ObfuscatedName("hf.ad")
	public int type;

	@ObfuscatedName("hf.am")
	public int clientcode = 0;

	@ObfuscatedName("hf.au")
	public byte xmode = 0;

	@ObfuscatedName("hf.ar")
	public byte ymode = 0;

	@ObfuscatedName("hf.ap")
	public byte field2356 = 0;

	@ObfuscatedName("hf.aq")
	public byte field2174 = 0;

	@ObfuscatedName("hf.ax")
	public int xpos = 0;

	@ObfuscatedName("hf.av")
	public int ypos = 0;

	@ObfuscatedName("hf.ao")
	public int wsize = 0;

	@ObfuscatedName("hf.aj")
	public int hsize = 0;

	@ObfuscatedName("hf.ay")
	public int x = 0;

	@ObfuscatedName("hf.ab")
	public int y = 0;

	@ObfuscatedName("hf.az")
	public int width = 0;

	@ObfuscatedName("hf.aa")
	public int height = 0;

	@ObfuscatedName("hf.af")
	public int aspectwidth = 1;

	@ObfuscatedName("hf.ak")
	public int aspectheight = 1;

	@ObfuscatedName("hf.an")
	public int layer = -1;

	@ObfuscatedName("hf.bf")
	public boolean hide = false;

	@ObfuscatedName("hf.bl")
	public int field2202 = -1;

	@ObfuscatedName("hf.bk")
	public int field2269 = -1;

	@ObfuscatedName("hf.bh")
	public int mouseovercursor = -1;

	@ObfuscatedName("hf.bx")
	public boolean noclickthrough = false;

	@ObfuscatedName("hf.bd")
	public int scrollx = 0;

	@ObfuscatedName("hf.bc")
	public int scrolly = 0;

	@ObfuscatedName("hf.bi")
	public int scrollwidth = 0;

	@ObfuscatedName("hf.bn")
	public int scrollheight = 0;

	@ObfuscatedName("hf.bt")
	public int colour = 0;

	@ObfuscatedName("hf.bq")
	public boolean fill = false;

	@ObfuscatedName("hf.bm")
	public int trans = 0;

	@ObfuscatedName("hf.bb")
	public int linewid = 1;

	@ObfuscatedName("hf.be")
	public boolean linedirection = false;

	@ObfuscatedName("hf.by")
	public int graphic = -1;

	@ObfuscatedName("hf.bu")
	public int angle2d = 0;

	@ObfuscatedName("hf.bw")
	public boolean tiling = false;

	@ObfuscatedName("hf.bo")
	public int outline = 0;

	@ObfuscatedName("hf.bz")
	public int graphicshadow = 0;

	@ObfuscatedName("hf.bv")
	public boolean vflip;

	@ObfuscatedName("hf.br")
	public boolean hflip;

	@ObfuscatedName("hf.bg")
	public boolean alpha = false;

	@ObfuscatedName("hf.ba")
	public boolean clickmask = true;

	@ObfuscatedName("hf.bp")
	public int modelkind = 1;

	@ObfuscatedName("hf.bj")
	public int model;

	@ObfuscatedName("hf.bs")
	public int field2298 = -1;

	@ObfuscatedName("hf.cl")
	public boolean field2274;

	@ObfuscatedName("hf.cg")
	public int modelxof = 0;

	@ObfuscatedName("hf.ce")
	public int modelyof = 0;

	@ObfuscatedName("hf.cu")
	public int modelangle_x = 0;

	@ObfuscatedName("hf.ci")
	public int modelangle_y = 0;

	@ObfuscatedName("hf.cn")
	public int modelangle_z = 0;

	@ObfuscatedName("hf.cv")
	public int modelorigin_x = 0;

	@ObfuscatedName("hf.cp")
	public int modelorigin_y = 0;

	@ObfuscatedName("hf.ca")
	public int modelorigin_z = 0;

	@ObfuscatedName("hf.cx")
	public int modelzoom = 100;

	@ObfuscatedName("hf.cw")
	public int modelobjwidth = 0;

	@ObfuscatedName("hf.ct")
	public int field2238 = 0;

	@ObfuscatedName("hf.cf")
	public boolean modelorthog = false;

	@ObfuscatedName("hf.co")
	public boolean field2260 = false;

	@ObfuscatedName("hf.cr")
	public int field2241 = 2;

	@ObfuscatedName("hf.cm")
	public short[] recol_s;

	@ObfuscatedName("hf.cq")
	public short[] recol_d;

	@ObfuscatedName("hf.ch")
	public short[] retex_s;

	@ObfuscatedName("hf.cb")
	public short[] retex_d;

	@ObfuscatedName("hf.cs")
	public int tint_hue;

	@ObfuscatedName("hf.cy")
	public int tint_saturation;

	@ObfuscatedName("hf.cc")
	public int tint_luminence;

	@ObfuscatedName("hf.cz")
	public int tint_weight;

	@ObfuscatedName("hf.ck")
	public boolean customlighting = false;

	@ObfuscatedName("hf.cj")
	public int field2345;

	@ObfuscatedName("hf.cd")
	public int field2252;

	@ObfuscatedName("hf.dd")
	public int field2302;

	@ObfuscatedName("hf.dr")
	public int field2251;

	@ObfuscatedName("hf.da")
	public int field2255;

	@ObfuscatedName("hf.dt")
	public int field2248;

	@ObfuscatedName("hf.do")
	public int field2257;

	@ObfuscatedName("hf.dz")
	public int field2258;

	@ObfuscatedName("hf.dv")
	public int textfont = -1;

	@ObfuscatedName("hf.dm")
	public boolean fontmono = true;

	@ObfuscatedName("hf.dq")
	public String text = "";

	@ObfuscatedName("hf.dc")
	public int field2229 = 0;

	@ObfuscatedName("hf.di")
	public int field2223 = 0;

	@ObfuscatedName("hf.dk")
	public int field2264 = 0;

	@ObfuscatedName("hf.dn")
	public boolean textshadow = false;

	@ObfuscatedName("hf.df")
	public int maxlines = 0;

	@ObfuscatedName("hf.dw")
	public boolean textantimacro = false;

	@ObfuscatedName("hf.ds")
	public ServerKeyProperties field2268 = ServerKeyProperties.field11386;

	@ObfuscatedName("hf.du")
	public boolean field2324 = false;

	@ObfuscatedName("hf.dl")
	public byte[][] field2270;

	@ObfuscatedName("hf.dp")
	public byte[][] field2281;

	@ObfuscatedName("hf.dy")
	public int[] field2211;

	@ObfuscatedName("hf.db")
	public int[] field2273;

	@ObfuscatedName("hf.dh")
	public int[] field2300;

	@ObfuscatedName("hf.eo")
	public String opbase = "";

	@ObfuscatedName("hf.ey")
	public String[] op;

	@ObfuscatedName("hf.eu")
	public String pausetext;

	@ObfuscatedName("hf.ed")
	public int[] opcursor;

	@ObfuscatedName("hf.ee")
	public int targetopcursor = -1;

	@ObfuscatedName("hf.es")
	public Component draggable = null;

	@ObfuscatedName("hf.ei")
	public int dragdeadzone = 0;

	@ObfuscatedName("hf.el")
	public int dragdeadtime = 0;

	@ObfuscatedName("hf.ej")
	public int dragrenderbehaviour = field2234;

	@ObfuscatedName("hf.ep")
	public String targetverb = "";

	@ObfuscatedName("hf.ev")
	public boolean hashook = false;

	@ObfuscatedName("hf.ec")
	public Object[] onload;

	@ObfuscatedName("hf.ek")
	public Object[] onclick;

	@ObfuscatedName("hf.em")
	public Object[] onclickrepeat;

	@ObfuscatedName("hf.eh")
	public Object[] onrelease;

	@ObfuscatedName("hf.eq")
	public Object[] onhold;

	@ObfuscatedName("hf.eg")
	public Object[] onmouseover;

	@ObfuscatedName("hf.ez")
	public Object[] onmouserepeat;

	@ObfuscatedName("hf.ef")
	public Object[] onmouseleave;

	@ObfuscatedName("hf.et")
	public Object[] ondrag;

	@ObfuscatedName("hf.ea")
	public Object[] ondragcomplete;

	@ObfuscatedName("hf.ew")
	public Object[] ontargetenter;

	@ObfuscatedName("hf.er")
	public Object[] ontargetleave;

	@ObfuscatedName("hf.en")
	public Object[] onvartransmit;

	@ObfuscatedName("hf.eb")
	public int[] onvartransmitlist;

	@ObfuscatedName("hf.ex")
	public Object[] oninvtransmit;

	@ObfuscatedName("hf.fg")
	public int[] oninvtransmitlist;

	@ObfuscatedName("hf.fm")
	public Object[] onstattransmit;

	@ObfuscatedName("hf.fu")
	public int[] onstattransmitlist;

	@ObfuscatedName("hf.fs")
	public Object[] onvarctransmit;

	@ObfuscatedName("hf.fz")
	public int[] onvarctransmitlist;

	@ObfuscatedName("hf.fj")
	public Object[] onvarcstrtransmit;

	@ObfuscatedName("hf.fd")
	public int[] onvarcstrtransmitlist;

	@ObfuscatedName("hf.fn")
	public Object[] onvarclantransmit;

	@ObfuscatedName("hf.fi")
	public int[] field2313;

	@ObfuscatedName("hf.ft")
	public Object[] ontimer;

	@ObfuscatedName("hf.fx")
	public Object[] onop;

	@ObfuscatedName("hf.fv")
	public Object[] onopt;

	@ObfuscatedName("hf.fc")
	public Object[] onscrollwheel;

	@ObfuscatedName("hf.fw")
	public Object[] onchattransmit;

	@ObfuscatedName("hf.fa")
	public Object[] onkey;

	@ObfuscatedName("hf.fp")
	public Object[] onfriendtransmit;

	@ObfuscatedName("hf.fq")
	public Object[] onclantransmit;

	@ObfuscatedName("hf.ff")
	public Object[] onclansettingstransmit;

	@ObfuscatedName("hf.fl")
	public Object[] onclanchanneltransmit;

	@ObfuscatedName("hf.fb")
	public Object[] onmisctransmit;

	@ObfuscatedName("hf.fo")
	public Object[] onstocktransmit;

	@ObfuscatedName("hf.fy")
	public Object[] ondialogabort;

	@ObfuscatedName("hf.fe")
	public Object[] onsubchange;

	@ObfuscatedName("hf.fk")
	public Object[] oncamfinished;

	@ObfuscatedName("hf.fh")
	public Object[] onresize;

	@ObfuscatedName("hf.fr")
	public Object[] onplayergrouptransmit;

	@ObfuscatedName("hf.gu")
	public Object[] onplayergroupvarptransmit;

	@ObfuscatedName("hf.gq")
	public Object[] oncameraupdatetransmit;

	@ObfuscatedName("hf.gl")
	public HashTable params;

	@ObfuscatedName("hf.go")
	public int invobject = -1;

	@ObfuscatedName("hf.gk")
	public int invcount = 0;

	@ObfuscatedName("hf.gp")
	public String link = null;

	@ObfuscatedName("hf.gy")
	public GroupUserKind groupKind;

	@ObfuscatedName("hf.ga")
	public boolean field2246 = false;

	@ObfuscatedName("hf.gn")
	public int field2339 = -1;

	@ObfuscatedName("hf.gc")
	public int field2348;

	@ObfuscatedName("hf.gf")
	public int field2162;

	@ObfuscatedName("hf.gx")
	public int field2342;

	@ObfuscatedName("hf.ge")
	public int field2343;

	@ObfuscatedName("hf.gg")
	public int field2344;

	@ObfuscatedName("hf.gr")
	public int field2188 = -1;

	@ObfuscatedName("hf.gs")
	public int modelanim = -1;

	@ObfuscatedName("hf.gt")
	public AnimationNode modelAnimator;

	@ObfuscatedName("hf.gh")
	public Component[] subcomponents;

	@ObfuscatedName("hf.gm")
	public Component[] sortedsubcomponents;

	@ObfuscatedName("hf.gv")
	public boolean field2350 = false;

	@ObfuscatedName("hf.gj")
	public boolean held = false;

	@ObfuscatedName("hf.gw")
	public int lastRedrawCycle = -1;

	@ObfuscatedName("hf.gd")
	public int field2353 = 0;

	@ObfuscatedName("hf.gz")
	public int field2354 = 0;

	@ObfuscatedName("hf.gb")
	public int field2160 = 0;

	@ObfuscatedName("hf.gi")
	public int field2289 = 0;

	@ObfuscatedName("hf.hm")
	public int field2357 = 0;

	@ObfuscatedName("hf.ha")
	public int field2358 = 0;

	@ObfuscatedName("hf.hk")
	public int field2182 = -1;

	@ObfuscatedName("hf.hu")
	public int field2237 = -1;

	@ObfuscatedName("hf.hb")
	public int[] field2361;

	@ObfuscatedName("hf.hl")
	public ParticleSystem field2254;

	@ObfuscatedName("hf.hg")
	public NPCTypeCustomisation customisation;

	@ObfuscatedName("gb.e(Lpy;Lpy;Lpy;Lpy;I)V")
	public static void method3669(Js5 arg0, Js5 arg1, Js5 arg2, Js5 arg3) {
		interfacesJs5 = arg0;
		modelsJs5 = arg1;
		spritesJs5 = arg2;
		interfaces = new Interface[interfacesJs5.capacity()];
		field8424 = new boolean[interfacesJs5.capacity()];
	}

	@ObfuscatedName("xh.n(II)Lhf;")
	public static Component get(int arg0) {
		int var1 = arg0 >> 16;
		if (interfaces[var1] == null || interfaces[var1].getComponent(arg0) == null) {
			boolean var2 = openInterface(var1, null);
			if (!var2) {
				return null;
			}
		}
		return interfaces[var1].getComponent(arg0);
	}

	@ObfuscatedName("kp.m(II)Lhq;")
	public static Interface method5367(int arg0) {
		return interfaces[arg0 >> 16];
	}

	@ObfuscatedName("ahh.k(IIB)Lhf;")
	public static Component method16682(int arg0, int arg1) {
		Component var2 = get(arg0);
		if (arg1 == -1) {
			return var2;
		} else if (var2 == null || var2.subcomponents == null || arg1 >= var2.subcomponents.length) {
			return null;
		} else {
			return var2.subcomponents[arg1];
		}
	}

	@ObfuscatedName("kn.f(I[II)Z")
	public static boolean openInterface(int arg0, int[] arg1) {
		if (field8424[arg0]) {
			return true;
		}
		interfaces[arg0] = method5405(arg0, arg1, interfaces[arg0], false);
		if (interfaces[arg0] == null) {
			return false;
		} else {
			field8424[arg0] = true;
			return true;
		}
	}

	@ObfuscatedName("la.w(I[ILhq;ZI)Lhq;")
	public static Interface method5405(int arg0, int[] arg1, Interface arg2, boolean arg3) {
		if (!interfacesJs5.isGroupReady(arg0)) {
			return null;
		}
		int var4 = interfacesJs5.getGroupCapacity(arg0);
		Component[] var5;
		if (var4 == 0) {
			var5 = new Component[0];
		} else if (arg2 == null) {
			var5 = new Component[var4];
		} else {
			var5 = arg2.components;
		}
		if (arg2 == null) {
			arg2 = new Interface(arg3, var5);
		} else {
			arg2.components = var5;
			arg2.field2150 = arg3;
		}
		for (int var6 = 0; var6 < var4; var6++) {
			if (arg2.components[var6] == null) {
				byte[] var7 = interfacesJs5.getfile(arg0, var6, arg1);
				if (var7 != null) {
					Component var8 = arg2.components[var6] = new Component();
					var8.parentlayer = (arg0 << 16) + var6;
					var8.decode(new Packet(var7));
				}
			}
		}
		return arg2;
	}

	@ObfuscatedName("ahr.l(II)V")
	public static void method16640(int arg0) {
		if (arg0 != -1 && !field8424[arg0]) {
			interfacesJs5.discardUnpacked(arg0);
			interfaces[arg0] = null;
		}
	}

	@ObfuscatedName("rq.u(II)V")
	public static void method7602(int arg0) {
		field8424[arg0] = false;
		method16640(arg0);
	}

	@ObfuscatedName("hf.z(Lalw;I)V")
	public void decode(Packet buf) {
		int var2 = buf.g1();
		if (var2 == 255) {
			var2 = -1;
		}
		this.type = buf.g1();
		if ((this.type & 0x80) != 0) {
			this.type &= 0x7F;
			this.name = buf.gjstr();
		}
		this.clientcode = buf.g2();
		this.xpos = buf.g2s();
		this.ypos = buf.g2s();
		this.wsize = buf.g2();
		this.hsize = buf.g2();
		this.field2356 = buf.g1b();
		this.field2174 = buf.g1b();
		this.xmode = buf.g1b();
		this.ymode = buf.g1b();
		if (this.field2356 == 4 || this.field2174 == 4) {
			this.aspectwidth = buf.g2();
			this.aspectheight = buf.g2();
		}
		this.layer = buf.g2();
		if (this.layer == 65535) {
			this.layer = -1;
		} else {
			this.layer += this.parentlayer & 0xFFFF0000;
		}
		int var3 = buf.g1();
		this.hide = (var3 & 0x1) != 0;
		if (var2 >= 0) {
			this.noclickthrough = (var3 & 0x2) != 0;
		}
		if (this.type == 0) {
			this.scrollwidth = buf.g2();
			this.scrollheight = buf.g2();
			if (var2 < 0) {
				this.noclickthrough = buf.g1() == 1;
			}
		}
		if (this.type == 5) {
			this.graphic = buf.g4s();
			this.angle2d = buf.g2();
			int var4 = buf.g1();
			this.tiling = (var4 & 0x1) != 0;
			this.alpha = (var4 & 0x2) != 0;
			this.trans = buf.g1();
			this.outline = buf.g1();
			this.graphicshadow = buf.g4s();
			this.vflip = buf.g1() == 1;
			this.hflip = buf.g1() == 1;
			this.colour = buf.g4s();
			if (var2 >= 3) {
				this.clickmask = buf.g1() == 1;
			}
		}
		if (this.type == 6) {
			this.modelkind = 1;
			this.model = buf.gSmart2or4null();
			int var5 = buf.g1();
			boolean var6 = (var5 & 0x1) == 1;
			this.field2274 = (var5 & 0x2) == 2;
			this.modelorthog = (var5 & 0x4) == 4;
			this.field2260 = (var5 & 0x8) == 8;
			if (var6) {
				this.modelorigin_x = buf.g2s();
				this.modelorigin_y = buf.g2s();
				this.modelangle_x = buf.g2();
				this.modelangle_y = buf.g2();
				this.modelangle_z = buf.g2();
				this.modelzoom = buf.g2();
			} else if (this.field2274) {
				this.modelorigin_x = buf.g2s();
				this.modelorigin_y = buf.g2s();
				this.modelorigin_z = buf.g2s();
				this.modelangle_x = buf.g2();
				this.modelangle_y = buf.g2();
				this.modelangle_z = buf.g2();
				this.modelzoom = buf.g2s();
			}
			this.modelanim = buf.gSmart2or4null();
			if (this.field2356 != 0) {
				this.modelobjwidth = buf.g2();
			}
			if (this.field2174 != 0) {
				this.field2238 = buf.g2();
			}
		}
		if (this.type == 4) {
			this.textfont = buf.gSmart2or4null();
			if (var2 >= 2) {
				this.fontmono = buf.g1() == 1;
			}
			this.text = buf.gjstr();
			this.field2229 = buf.g1();
			this.field2223 = buf.g1();
			this.field2264 = buf.g1();
			this.textshadow = buf.g1() == 1;
			this.colour = buf.g4s();
			this.trans = buf.g1();
			if (var2 >= 0) {
				this.maxlines = buf.g1();
			}
		}
		if (this.type == 3) {
			this.colour = buf.g4s();
			this.fill = buf.g1() == 1;
			this.trans = buf.g1();
		}
		if (this.type == 9) {
			this.linewid = buf.g1();
			this.colour = buf.g4s();
			this.linedirection = buf.g1() == 1;
		}
		int var7 = buf.g3();
		int var8 = buf.g1();
		if (var8 != 0) {
			this.field2270 = new byte[11][];
			this.field2281 = new byte[11][];
			this.field2211 = new int[11];
			this.field2300 = new int[11];
			while (var8 != 0) {
				int var9 = (var8 >> 4) - 1;
				int var10 = var8 << 8 | buf.g1();
				int var11 = var10 & 0xFFF;
				if (var11 == 4095) {
					var11 = -1;
				}
				byte var12 = buf.g1b();
				if (var12 != 0) {
					this.field2324 = true;
				}
				byte var13 = buf.g1b();
				this.field2211[var9] = var11;
				this.field2270[var9] = new byte[] { var12 };
				this.field2281[var9] = new byte[] { var13 };
				var8 = buf.g1();
			}
		}
		this.opbase = buf.gjstr();
		int var14 = buf.g1();
		int var15 = var14 & 0xF;
		int var16 = var14 >> 4;
		if (var15 > 0) {
			this.op = new String[var15];
			for (int var17 = 0; var17 < var15; var17++) {
				this.op[var17] = buf.gjstr();
			}
		}
		if (var16 > 0) {
			int var18 = buf.g1();
			this.opcursor = new int[var18 + 1];
			for (int var19 = 0; var19 < this.opcursor.length; var19++) {
				this.opcursor[var19] = -1;
			}
			this.opcursor[var18] = buf.g2();
		}
		if (var16 > 1) {
			int var20 = buf.g1();
			this.opcursor[var20] = buf.g2();
		}
		this.pausetext = buf.gjstr();
		if (this.pausetext.equals("")) {
			this.pausetext = null;
		}
		this.dragdeadzone = buf.g1();
		this.dragdeadtime = buf.g1();
		this.dragrenderbehaviour = buf.g1();
		this.targetverb = buf.gjstr();
		int var21 = -1;
		if (ServerKeyProperties.method16667(var7) != 0) {
			var21 = buf.g2();
			if (var21 == 65535) {
				var21 = -1;
			}
			this.field2202 = buf.g2();
			if (this.field2202 == 65535) {
				this.field2202 = -1;
			}
			this.field2269 = buf.g2();
			if (this.field2269 == 65535) {
				this.field2269 = -1;
			}
		}
		if (var2 >= 0) {
			this.mouseovercursor = buf.g2();
			if (this.mouseovercursor == 65535) {
				this.mouseovercursor = -1;
			}
		}
		this.field2268 = new ServerKeyProperties(var7, var21);
		if (var2 >= 0) {
			int var22 = buf.g1();
			for (int var23 = 0; var23 < var22; var23++) {
				int var24 = buf.g3();
				int var25 = buf.g4s();
				this.params.put(new IntNode(var25), (long) var24);
			}
			int var26 = buf.g1();
			for (int var27 = 0; var27 < var26; var27++) {
				int var28 = buf.g3();
				String var29 = buf.gjstr2();
				this.params.put(new ObjectNode(var29), (long) var28);
			}
		}
		this.onload = this.decodeHook(buf);
		this.onmouseover = this.decodeHook(buf);
		this.onmouseleave = this.decodeHook(buf);
		this.ontargetleave = this.decodeHook(buf);
		this.ontargetenter = this.decodeHook(buf);
		this.onvartransmit = this.decodeHook(buf);
		this.oninvtransmit = this.decodeHook(buf);
		this.onstattransmit = this.decodeHook(buf);
		this.ontimer = this.decodeHook(buf);
		this.onop = this.decodeHook(buf);
		if (var2 >= 0) {
			this.onopt = this.decodeHook(buf);
		}
		this.onmouserepeat = this.decodeHook(buf);
		this.onclick = this.decodeHook(buf);
		this.onclickrepeat = this.decodeHook(buf);
		this.onrelease = this.decodeHook(buf);
		this.onhold = this.decodeHook(buf);
		this.ondrag = this.decodeHook(buf);
		this.ondragcomplete = this.decodeHook(buf);
		this.onscrollwheel = this.decodeHook(buf);
		this.onvarctransmit = this.decodeHook(buf);
		this.onvarcstrtransmit = this.decodeHook(buf);
		this.onvartransmitlist = this.decodeTransmitList(buf);
		this.oninvtransmitlist = this.decodeTransmitList(buf);
		this.onstattransmitlist = this.decodeTransmitList(buf);
		this.onvarctransmitlist = this.decodeTransmitList(buf);
		this.onvarcstrtransmitlist = this.decodeTransmitList(buf);
	}

	@ObfuscatedName("hf.p(Lalw;I)[Ljava/lang/Object;")
	public Object[] decodeHook(Packet buf) {
		int length = buf.g1();
		if (length == 0) {
			return null;
		}
		Object[] var3 = new Object[length];
		for (int index = 0; index < length; index++) {
			int var5 = buf.g1();
			if (var5 == 0) {
				var3[index] = Integer.valueOf(buf.g4s());
			} else if (var5 == 1) {
				var3[index] = buf.gjstr();
			}
		}
		this.hashook = true;
		return var3;
	}

	@ObfuscatedName("hf.d(Lalw;B)[I")
	public int[] decodeTransmitList(Packet buf) {
		int length = buf.g1();
		if (length == 0) {
			return null;
		}
		int[] var3 = new int[length];
		for (int index = 0; index < length; index++) {
			var3[index] = buf.g4s();
		}
		return var3;
	}

	@ObfuscatedName("hf.c(Ldh;B)Lcm;")
	public Sprite method3941(Toolkit arg0) {
		field2338 = false;
		long var2 = ((long) this.graphicshadow << 40) + ((long) this.outline << 36) + (long) this.graphic + ((this.alpha ? 1L : 0L) << 35) + ((this.vflip ? 1L : 0L) << 38) + ((this.hflip ? 1L : 0L) << 39);
		Sprite var4 = (Sprite) spriteCache.get(var2);
		if (var4 != null) {
			return var4;
		}
		SpriteData var5 = SpriteDataProvider.method1609(spritesJs5, this.graphic, 0);
		if (var5 == null) {
			field2338 = true;
			return null;
		}
		if (this.vflip) {
			var5.flipVertically();
		}
		if (this.hflip) {
			var5.flipHorizontally();
		}
		if (this.outline > 0) {
			var5.method2646(this.outline);
		} else if (this.graphicshadow != 0) {
			var5.method2646(1);
		}
		if (this.outline >= 1) {
			var5.method2599(1);
		}
		if (this.outline >= 2) {
			var5.method2599(16777215);
		}
		if (this.graphicshadow != 0) {
			var5.method2600(this.graphicshadow | 0xFF000000);
		}
		Sprite var6 = arg0.createSprite(var5, true);
		spriteCache.put(var6, var2, var6.getWidth() * var6.getHeight() * 4);
		return var6;
	}

	@ObfuscatedName("hf.r(Loi;Loq;S)Leu;")
	public Font method3942(FontProvider arg0, FontFactory arg1) {
		Font var3 = (Font) arg0.getFont(arg1, this.textfont, false, this.fontmono);
		field2338 = var3 == null;
		return var3;
	}

	@ObfuscatedName("hf.v(Loi;Loq;I)Laac;")
	public FontMetrics method3943(FontProvider arg0, FontFactory arg1) {
		FontMetrics var3 = arg0.getFontMetrics(arg1, this.textfont);
		field2338 = var3 == null;
		return var3;
	}

	@ObfuscatedName("hf.o(Ldh;ILaof;Laov;Laod;Laon;Laos;Lem;Lep;Laaq;Lxg;I)Ldo;")
	public Model method3944(Toolkit arg0, int arg1, BASTypeList arg2, IDKTypeList arg3, NPCTypeList arg4, ObjTypeList arg5, SeqTypeList arg6, VariableTypeProvider arg7, VarIntDomain arg8, AnimationNode arg9, PlayerModel arg10) {
		field2338 = false;
		if (this.modelkind == 0) {
			return null;
		} else if (this.modelkind == 1 && this.model == -1) {
			return null;
		} else if (this.modelkind == 1) {
			int var12 = arg1;
			if (arg9 != null) {
				arg1 |= arg9.method14358();
			}
			long var13 = -1L;
			long[] var15 = Packet.crc64table;
			if (this.recol_s != null) {
				for (int var16 = 0; var16 < this.recol_s.length; var16++) {
					long var17 = var13 >>> 8 ^ var15[(int) ((var13 ^ (long) (this.recol_s[var16] >> 8)) & 0xFFL)];
					long var19 = var17 >>> 8 ^ var15[(int) ((var17 ^ (long) this.recol_s[var16]) & 0xFFL)];
					long var21 = var19 >>> 8 ^ var15[(int) ((var19 ^ (long) (this.recol_d[var16] >> 8)) & 0xFFL)];
					var13 = var21 >>> 8 ^ var15[(int) ((var21 ^ (long) this.recol_d[var16]) & 0xFFL)];
				}
				arg1 |= 0x4000;
			}
			if (this.retex_s != null) {
				for (int var23 = 0; var23 < this.retex_s.length; var23++) {
					long var24 = var13 >>> 8 ^ var15[(int) ((var13 ^ (long) (this.retex_s[var23] >> 8)) & 0xFFL)];
					long var26 = var24 >>> 8 ^ var15[(int) ((var24 ^ (long) this.retex_s[var23]) & 0xFFL)];
					long var28 = var26 >>> 8 ^ var15[(int) ((var26 ^ (long) (this.retex_d[var23] >> 8)) & 0xFFL)];
					var13 = var28 >>> 8 ^ var15[(int) ((var28 ^ (long) this.retex_d[var23]) & 0xFFL)];
				}
				arg1 |= 0x8000;
			}
			long var30 = (long) arg0.field1595 << 59 | (long) this.modelkind << 55 | (long) this.model << 38 | var13 & 0x3FFFFFFFFFL;
			Model var32 = (Model) modelCache.get(var30);
			if (var32 == null || arg0.method2394(var32.method1691(), arg1) != 0) {
				if (var32 != null) {
					arg1 = arg0.method2213(arg1, var32.method1691());
				}
				ModelUnlit var33 = ModelUnlit.get(modelsJs5, this.model, 0);
				if (var33 == null) {
					field2338 = true;
					return null;
				}
				if (var33.version < 13) {
					var33.scaleByPowerOfTwo(2);
				}
				var32 = arg0.createModel(var33, arg1, field11802, 64, 768);
				if (this.recol_s != null) {
					for (int var34 = 0; var34 < this.recol_s.length; var34++) {
						var32.recolor(this.recol_s[var34], this.recol_d[var34]);
					}
				}
				if (this.retex_s != null) {
					for (int var35 = 0; var35 < this.retex_s.length; var35++) {
						var32.retexture(this.retex_s[var35], this.retex_d[var35]);
					}
				}
				modelCache.put(var32, var30);
			}
			if (var32 == null) {
				return null;
			}
			if (arg9 != null) {
				var32 = var32.method1773((byte) 1, arg1, true);
				arg9.method14359(var32, 0);
			}
			var32.method1690(var12);
			return var32;
		} else if (this.modelkind == 2) {
			Model var36 = ((NPCType) arg4.list(this.model)).getHeadModel(arg0, arg1, arg7, arg8, arg9, this.customisation);
			if (var36 == null) {
				field2338 = true;
				return null;
			} else {
				return var36;
			}
		} else if (this.modelkind == 3) {
			if (arg10 == null) {
				return null;
			}
			Model var37 = arg10.getHeadModel(arg0, arg1, arg3, arg4, arg5, arg7, arg8, arg9);
			if (var37 == null) {
				field2338 = true;
				return null;
			} else {
				return var37;
			}
		} else if (this.modelkind == 4) {
			ObjType var38 = (ObjType) arg5.list(this.model);
			Model var39 = var38.method14644(arg0, arg1, 10, arg10, arg9, 0, 0, 0, 0);
			if (var39 == null) {
				field2338 = true;
				return null;
			} else {
				return var39;
			}
		} else if (this.modelkind == 6) {
			Model var40 = ((NPCType) arg4.list(this.model)).getSequencedModel(arg0, arg1, arg2, arg7, arg8, arg9, null, null, null, 0, this.customisation);
			if (var40 == null) {
				field2338 = true;
				return null;
			} else {
				return var40;
			}
		} else if (this.modelkind != 7) {
			return null;
		} else if (arg10 == null) {
			return null;
		} else {
			int var41 = this.model >>> 16;
			int var42 = this.model & 0xFFFF;
			int var43 = this.field2298;
			Model var44 = arg10.method10130(arg0, arg1, arg3, arg6, arg9, var41, var42, var43);
			if (var44 == null) {
				field2338 = true;
				return null;
			} else {
				return var44;
			}
		}
	}

	@ObfuscatedName("hf.s(Ldh;Ldo;Lou;IB)V")
	public void method3951(Toolkit arg0, Model arg1, Matrix4x3 arg2, int arg3) {
		arg1.method1689(arg2);
		ModelParticleEmitter[] var5 = arg1.method1750();
		ModelParticleEffector[] var6 = arg1.method1765();
		if ((this.field2254 == null || this.field2254.field7804) && (var5 != null || var6 != null)) {
			this.field2254 = ParticleSystem.method9962(arg3, false);
		}
		if (this.field2254 != null) {
			this.field2254.method9936(arg0, (long) arg3, var5, var6, false);
		}
	}

	@ObfuscatedName("hf.y(Laom;Laok;I)Lsv;")
	public SkyBox method4012(SkyBoxTypeList arg0, SkyDecorTypeList arg1) {
		if (this.field2339 == -1) {
			return null;
		}
		long var3 = ((long) this.field2342 & 0xFFFFL) << 48 | ((long) this.field2343 & 0xFFFFL) << 32 | ((long) this.field2344 & 0xFFFFL) << 16 | (long) this.field2339 & 0xFFFFL;
		SkyBox var5 = (SkyBox) skyBoxCache.get(var3);
		if (var5 == null) {
			var5 = SkyBoxType.method305(this.field2339, this.field2342, this.field2343, this.field2344, arg0, arg1);
			skyBoxCache.put(var5, var3);
		}
		return var5;
	}

	@ObfuscatedName("ack.q(IB)V")
	public static void resetModelCache(int arg0) {
		field11802 = arg0;
		modelCache.reset();
	}

	@ObfuscatedName("lv.x(I)V")
	public static void cacheReset() {
		spriteCache.reset();
		modelCache.reset();
		graphicCache.reset();
		skyBoxCache.reset();
	}

	@ObfuscatedName("sp.b(II)V")
	public static void cacheClean(int arg0) {
		spriteCache.clean(arg0);
		modelCache.clean(arg0);
		graphicCache.clean(arg0);
		skyBoxCache.clean(arg0);
	}

	@ObfuscatedName("kh.h(I)V")
	public static void cacheRemoveSoftReferences() {
		spriteCache.clear();
		modelCache.clear();
		graphicCache.clear();
		skyBoxCache.clear();
	}

	@ObfuscatedName("jh.a(B)V")
	public static void method5075() {
		interfaces = new Interface[interfacesJs5.capacity()];
		field8424 = new boolean[interfacesJs5.capacity()];
	}

	@ObfuscatedName("hf.g(I)V")
	public void clearscripthooks() {
		this.onload = null;
		this.onclick = null;
		this.onclickrepeat = null;
		this.onrelease = null;
		this.onhold = null;
		this.onmouseover = null;
		this.onmouserepeat = null;
		this.onmouseleave = null;
		this.ondrag = null;
		this.ondragcomplete = null;
		this.ontargetenter = null;
		this.ontargetleave = null;
		this.onvartransmit = null;
		this.onvartransmitlist = null;
		this.field2353 = 0;
		this.oninvtransmit = null;
		this.oninvtransmitlist = null;
		this.field2354 = 0;
		this.onstattransmit = null;
		this.onstattransmitlist = null;
		this.field2160 = 0;
		this.onvarctransmit = null;
		this.onvarctransmitlist = null;
		this.field2289 = 0;
		this.onvarcstrtransmit = null;
		this.onvarcstrtransmitlist = null;
		this.field2357 = 0;
		this.onvarclantransmit = null;
		this.field2313 = null;
		this.field2358 = 0;
		this.ontimer = null;
		this.onop = null;
		this.onopt = null;
		this.onscrollwheel = null;
		this.onchattransmit = null;
		this.onkey = null;
		this.onfriendtransmit = null;
		this.onclantransmit = null;
		this.onclansettingstransmit = null;
		this.onclanchanneltransmit = null;
		this.onmisctransmit = null;
		this.onstocktransmit = null;
		this.ondialogabort = null;
		this.onsubchange = null;
		this.oncamfinished = null;
		this.onresize = null;
		this.onplayergrouptransmit = null;
		this.onplayergroupvarptransmit = null;
		this.oncameraupdatetransmit = null;
		this.lastRedrawCycle = -1;
	}

	@ObfuscatedName("hf.i(ILjava/lang/String;B)V")
	public void setop(int arg0, String arg1) {
		if (this.op == null || this.op.length <= arg0) {
			String[] var3 = new String[arg0 + 1];
			if (this.op != null) {
				for (int var4 = 0; var4 < this.op.length; var4++) {
					var3[var4] = this.op[var4];
				}
			}
			this.op = var3;
		}
		this.op[arg0] = arg1;
	}

	@ObfuscatedName("hf.j(III)V")
	public void setopcursor(int arg0, int arg1) {
		if (this.opcursor == null || this.opcursor.length <= arg0) {
			int[] var3 = new int[arg0 + 1];
			if (this.opcursor != null) {
				for (int var4 = 0; var4 < this.opcursor.length; var4++) {
					var3[var4] = this.opcursor[var4];
				}
				for (int var5 = this.opcursor.length; var5 < arg0; var5++) {
					var3[var5] = -1;
				}
			}
			this.opcursor = var3;
		}
		this.opcursor[arg0] = arg1;
	}

	@ObfuscatedName("hf.t(Ldh;B)Lhx;")
	public Graphic method3970(Toolkit arg0) {
		long var2 = (long) this.parentlayer << 32 | (long) this.id & 0xFFFFFFFFL;
		Graphic var4 = (Graphic) graphicCache.get(var2);
		if (var4 != null) {
			if (this.graphic != var4.field2148) {
				graphicCache.method2957(var2);
				var4 = null;
			}
			if (var4 != null) {
				return var4;
			}
		}
		SpriteData var5 = SpriteDataProvider.method1609(spritesJs5, this.graphic, 0);
		if (var5 == null) {
			return null;
		}
		int var6 = var5.method2596();
		int var7 = var5.method2597();
		int[] var8 = new int[var7];
		int[] var9 = new int[var7];
		for (int var10 = 0; var10 < var5.getHeight(); var10++) {
			int var11 = 0;
			int var12 = var5.getWidth();
			for (int var13 = 0; var13 < var5.getWidth(); var13++) {
				if (var5.method2617(var13, var10) != 0) {
					var11 = var13;
					break;
				}
			}
			for (int var14 = var5.getWidth() - 1; var14 >= var11; var14--) {
				if (var5.method2617(var14, var10) != 0) {
					var12 = var14 + 1;
					break;
				}
			}
			var8[var10 + var5.getPaddingTop()] = var11 + var5.getPaddingLeft();
			var9[var10 + var5.getPaddingTop()] = var12 - var11;
		}
		SpriteRelated var15 = arg0.method2205(var6, var7, var8, var9);
		if (var15 == null) {
			return null;
		} else {
			Graphic var16 = new Graphic(var6, var7, var9, var8, var15, this.graphic);
			graphicCache.put(var16, var2);
			return var16;
		}
	}

	@ObfuscatedName("hf.ae(III)I")
	public int getParam(int arg0, int arg1) {
		if (this.params == null) {
			return arg1;
		} else {
			IntNode var3 = (IntNode) this.params.get((long) arg0);
			return var3 == null ? arg1 : var3.value;
		}
	}

	@ObfuscatedName("hf.ag(ILjava/lang/String;I)Ljava/lang/String;")
	public String getParam(int arg0, String arg1) {
		if (this.params == null) {
			return arg1;
		} else {
			ObjectNode var3 = (ObjectNode) this.params.get((long) arg0);
			return var3 == null ? arg1 : (String) var3.value;
		}
	}

	@ObfuscatedName("hf.ah(III)V")
	public void method3952(int arg0, int arg1) {
		if (this.params == null) {
			this.params = new HashTable(16);
			this.params.put(new IntNode(arg1), (long) arg0);
			return;
		}
		IntNode var3 = (IntNode) this.params.get((long) arg0);
		if (var3 == null) {
			this.params.put(new IntNode(arg1), (long) arg0);
		} else {
			var3.value = arg1;
		}
	}

	@ObfuscatedName("hf.al(ILjava/lang/String;I)V")
	public void method4003(int arg0, String arg1) {
		if (this.params == null) {
			this.params = new HashTable(16);
			this.params.put(new ObjectNode(arg1), (long) arg0);
			return;
		}
		ObjectNode var3 = (ObjectNode) this.params.get((long) arg0);
		if (var3 != null) {
			var3.unlink();
		}
		this.params.put(new ObjectNode(arg1), (long) arg0);
	}

	@ObfuscatedName("hf.ac(II)V")
	public void method3954(int arg0) {
		if (this.params != null) {
			Node var2 = this.params.get((long) arg0);
			if (var2 != null) {
				var2.unlink();
			}
		}
	}

	@ObfuscatedName("hf.ai(ISSI)V")
	public void setrecol(int arg0, short arg1, short arg2) {
		if (arg0 >= 5) {
			return;
		}
		if (this.recol_s == null) {
			this.recol_s = new short[5];
			this.recol_d = new short[5];
		}
		this.recol_s[arg0] = arg1;
		this.recol_d[arg0] = arg2;
	}

	@ObfuscatedName("hf.aw(ISSI)V")
	public void setretex(int arg0, short arg1, short arg2) {
		if (arg0 >= 5) {
			return;
		}
		if (this.retex_s == null) {
			this.retex_s = new short[5];
			this.retex_d = new short[5];
		}
		this.retex_s[arg0] = arg1;
		this.retex_d[arg0] = arg2;
	}
}
