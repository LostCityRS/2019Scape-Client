package com.jagex.game.config.npctype;

import com.jagex.core.constants.ModeGame;
import com.jagex.core.constants.SerializableEnum;
import com.jagex.core.datastruct.HashTable;
import com.jagex.core.datastruct.IntNode;
import com.jagex.core.datastruct.Node;
import com.jagex.core.datastruct.SerializableEnums;
import com.jagex.core.datastruct.SoftLruHashTable;
import com.jagex.core.io.Packet;
import com.jagex.game.client.MoveSpeed;
import com.jagex.game.config.ConfigType;
import com.jagex.game.config.ConfigTypeList;
import com.jagex.game.config.bastype.BASType;
import com.jagex.game.config.bastype.BASTypeList;
import com.jagex.game.config.vartype.VarIntDomain;
import com.jagex.game.config.vartype.VarType;
import com.jagex.game.config.vartype.VariableTypeProvider;
import com.jagex.game.config.vartype.bit.VarBitType;
import com.jagex.game.config.vartype.constants.VarDomainType;
import com.jagex.game.world.entity.ObjectNode;
import com.jagex.graphics.AnimationNode;
import com.jagex.graphics.CompassPoint;
import com.jagex.graphics.Model;
import com.jagex.graphics.ModelUnlit;
import com.jagex.graphics.Toolkit;
import com.jagex.js5.Js5;
import com.jagex.math.Cuboid;
import com.jagex.math.IntMath;
import com.jagex.math.Matrix4x3;
import com.jagex.math.Trig1;
import deob.ObfuscatedName;
import java.util.Arrays;

@ObfuscatedName("if")
public class NPCType implements ConfigType {

	@ObfuscatedName("if.f")
	public static short[] clientpalette = new short[256];

	@ObfuscatedName("if.w")
	public NPCTypeFactory factory;

	@ObfuscatedName("if.l")
	public ConfigTypeList myList;

	@ObfuscatedName("if.u")
	public int id;

	@ObfuscatedName("if.z")
	public String name = "null";

	@ObfuscatedName("if.p")
	public int size = 1;

	@ObfuscatedName("if.d")
	public int[] models;

	@ObfuscatedName("if.c")
	public int[] heads;

	@ObfuscatedName("if.r")
	public int[][] modeloffset;

	@ObfuscatedName("if.v")
	public int bas = -1;

	@ObfuscatedName("if.o")
	public short[] recol_s;

	@ObfuscatedName("if.s")
	public short[] recol_d;

	@ObfuscatedName("if.y")
	public byte[] recol_d_palette;

	@ObfuscatedName("if.q")
	public short[] retex_s;

	@ObfuscatedName("if.x")
	public short[] retex_d;

	@ObfuscatedName("if.b")
	public byte[] recolindices;

	@ObfuscatedName("if.h")
	public byte[] retexindices;

	@ObfuscatedName("if.a")
	public byte tint_hue;

	@ObfuscatedName("if.g")
	public byte tint_saturation;

	@ObfuscatedName("if.i")
	public byte tint_luminence;

	@ObfuscatedName("if.j")
	public byte tint_weight = 0;

	@ObfuscatedName("if.t")
	public String[] op;

	@ObfuscatedName("if.ae")
	public int[] cursor;

	@ObfuscatedName("if.ag")
	public int cursorattack = -1;

	@ObfuscatedName("if.ah")
	public boolean minimap = true;

	@ObfuscatedName("if.al")
	public int vislevel = -1;

	@ObfuscatedName("if.ac")
	public int resizeh = 128;

	@ObfuscatedName("if.ai")
	public int resizev = 128;

	@ObfuscatedName("if.aw")
	public boolean drawabove = false;

	@ObfuscatedName("if.as")
	public boolean drawbelow = false;

	@ObfuscatedName("if.at")
	public boolean follower = false;

	@ObfuscatedName("if.ad")
	public int ambient = 0;

	@ObfuscatedName("if.am")
	public int contrast = 0;

	@ObfuscatedName("if.au")
	public int[] headicon_groupid = null;

	@ObfuscatedName("if.ar")
	public short[] headicon_id = null;

	@ObfuscatedName("if.ap")
	public int covermarker = -1;

	@ObfuscatedName("if.aq")
	public int turnspeed = 32;

	@ObfuscatedName("if.ax")
	public int[] multinpc;

	@ObfuscatedName("if.av")
	public int multivarbit = -1;

	@ObfuscatedName("if.ao")
	public int multivarp = -1;

	@ObfuscatedName("if.aj")
	public boolean active = true;

	@ObfuscatedName("if.ay")
	public boolean walksmoothing = true;

	@ObfuscatedName("if.ab")
	public boolean spotshadow = true;

	@ObfuscatedName("if.az")
	public short spotshadowcolour_1 = 0;

	@ObfuscatedName("if.aa")
	public short spotshadowcolour_2 = 0;

	@ObfuscatedName("if.af")
	public byte spotshadowtrans_1 = -96;

	@ObfuscatedName("if.ak")
	public byte spotshadowtrans_2 = -16;

	@ObfuscatedName("if.an")
	public short spotshadowtexture = -1;

	@ObfuscatedName("if.bf")
	public byte spotshadowtexture_alpha = 0;

	@ObfuscatedName("if.bl")
	public byte walkflags = 0;

	@ObfuscatedName("if.bx")
	public int bgsound = -1;

	@ObfuscatedName("if.bd")
	public int bgsound_crawl = -1;

	@ObfuscatedName("if.bc")
	public int bgsound_walk = -1;

	@ObfuscatedName("if.bi")
	public int bgsound_run = -1;

	@ObfuscatedName("if.bn")
	public int bgsound_range = 0;

	@ObfuscatedName("if.bt")
	public int bgsound_dropoffrange = 0;

	@ObfuscatedName("if.bq")
	public int bgsound_volume = 255;

	@ObfuscatedName("if.bm")
	public HashTable params;

	@ObfuscatedName("if.bb")
	public int overlayheight = -1;

	@ObfuscatedName("if.be")
	public CompassPoint respawndir = CompassPoint.SOUTH;

	@ObfuscatedName("if.by")
	public int mapelement = -1;

	@ObfuscatedName("if.bu")
	public int[] quests;

	@ObfuscatedName("if.bw")
	public byte reprioritiseattackop = -1;

	@ObfuscatedName("if.bo")
	public int picksize = -1;

	@ObfuscatedName("if.bz")
	public Cuboid clickbox;

	@ObfuscatedName("if.bv")
	public int bgsound_minrate = 256;

	@ObfuscatedName("if.br")
	public int bgsound_maxrate = 256;

	@ObfuscatedName("if.bg")
	public int picksizeshift = 0;

	@ObfuscatedName("if.ba")
	public boolean antimacro = true;

	@ObfuscatedName("if.bp")
	public int fadeInDuration = 0;

	@ObfuscatedName("if.bj")
	public boolean transmogfakenpc = false;

	public NPCType(int arg0, NPCTypeFactory arg1, ConfigTypeList arg2) {
		this.id = arg0;
		this.factory = arg1;
		this.myList = arg2;
		this.op = (String[]) this.factory.defaultops.clone();
	}

	@ObfuscatedName("if.e(Lalw;B)V")
	public void decode(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.decode(arg0, var2);
		}
	}

	@ObfuscatedName("if.u(Lalw;II)V")
	public void decode(Packet arg0, int arg1) {
		if (arg1 == 1) {
			int var3 = arg0.g1();
			this.models = new int[var3];
			for (int var4 = 0; var4 < var3; var4++) {
				this.models[var4] = arg0.gSmart2or4s();
			}
		} else if (arg1 == 2) {
			this.name = arg0.gjstr();
		} else if (arg1 == 12) {
			this.size = arg0.g1();
		} else if (arg1 >= 30 && arg1 < 35) {
			this.op[arg1 - 30] = arg0.gjstr();
		} else if (arg1 == 40) {
			int var5 = arg0.g1();
			this.recol_s = new short[var5];
			this.recol_d = new short[var5];
			for (int var6 = 0; var6 < var5; var6++) {
				this.recol_s[var6] = (short) arg0.g2();
				this.recol_d[var6] = (short) arg0.g2();
			}
		} else if (arg1 == 41) {
			int var7 = arg0.g1();
			this.retex_s = new short[var7];
			this.retex_d = new short[var7];
			for (int var8 = 0; var8 < var7; var8++) {
				this.retex_s[var8] = (short) arg0.g2();
				this.retex_d[var8] = (short) arg0.g2();
			}
		} else if (arg1 == 42) {
			int var9 = arg0.g1();
			this.recol_d_palette = new byte[var9];
			for (int var10 = 0; var10 < var9; var10++) {
				this.recol_d_palette[var10] = arg0.g1b();
			}
		} else if (arg1 == 44) {
			int var11 = arg0.g2();
			int var12 = 0;
			for (int var13 = var11; var13 > 0; var13 >>= 0x1) {
				var12++;
			}
			this.recolindices = new byte[var12];
			byte var14 = 0;
			for (int var15 = 0; var15 < var12; var15++) {
				if ((var11 & 0x1 << var15) > 0) {
					this.recolindices[var15] = var14++;
				} else {
					this.recolindices[var15] = -1;
				}
			}
		} else if (arg1 == 45) {
			int var16 = arg0.g2();
			int var17 = 0;
			for (int var18 = var16; var18 > 0; var18 >>= 0x1) {
				var17++;
			}
			this.retexindices = new byte[var17];
			byte var19 = 0;
			for (int var20 = 0; var20 < var17; var20++) {
				if ((var16 & 0x1 << var20) > 0) {
					this.retexindices[var20] = var19++;
				} else {
					this.retexindices[var20] = -1;
				}
			}
		} else if (arg1 == 60) {
			int var21 = arg0.g1();
			this.heads = new int[var21];
			for (int var22 = 0; var22 < var21; var22++) {
				this.heads[var22] = arg0.gSmart2or4s();
			}
		} else if (arg1 == 93) {
			this.minimap = false;
		} else if (arg1 == 95) {
			this.vislevel = arg0.g2();
		} else if (arg1 == 97) {
			this.resizeh = arg0.g2();
		} else if (arg1 == 98) {
			this.resizev = arg0.g2();
		} else if (arg1 == 99) {
			this.drawabove = true;
		} else if (arg1 == 100) {
			this.ambient = arg0.g1b();
		} else if (arg1 == 101) {
			this.contrast = arg0.g1b();
		} else if (arg1 == 102) {
			int var23 = arg0.g1();
			int var24 = 0;
			for (int var25 = var23; var25 != 0; var25 >>= 0x1) {
				var24++;
			}
			this.headicon_groupid = new int[var24];
			this.headicon_id = new short[var24];
			for (int var26 = 0; var26 < var24; var26++) {
				if ((var23 & 0x1 << var26) == 0) {
					this.headicon_groupid[var26] = -1;
					this.headicon_id[var26] = -1;
				} else {
					this.headicon_groupid[var26] = arg0.gSmart2or4s();
					this.headicon_id[var26] = (short) arg0.gSmart1or2null();
				}
			}
		} else if (arg1 == 103) {
			this.turnspeed = arg0.g2();
		} else if (arg1 == 106 || arg1 == 118) {
			this.multivarbit = arg0.g2();
			if (this.multivarbit == 65535) {
				this.multivarbit = -1;
			}
			this.multivarp = arg0.g2();
			if (this.multivarp == 65535) {
				this.multivarp = -1;
			}
			int var40 = -1;
			if (arg1 == 118) {
				var40 = arg0.g2();
				if (var40 == 65535) {
					var40 = -1;
				}
			}
			int var41 = arg0.gSmart1or2();
			this.multinpc = new int[var41 + 2];
			for (int var42 = 0; var42 <= var41; var42++) {
				this.multinpc[var42] = arg0.g2();
				if (this.multinpc[var42] == 65535) {
					this.multinpc[var42] = -1;
				}
			}
			this.multinpc[var41 + 1] = var40;
		} else if (arg1 == 107) {
			this.active = false;
		} else if (arg1 == 109) {
			this.walksmoothing = false;
		} else if (arg1 == 111) {
			this.spotshadow = false;
		} else if (arg1 == 113) {
			this.spotshadowcolour_1 = (short) arg0.g2();
			this.spotshadowcolour_2 = (short) arg0.g2();
		} else if (arg1 == 114) {
			this.spotshadowtrans_1 = arg0.g1b();
			this.spotshadowtrans_2 = arg0.g1b();
		} else if (arg1 == 119) {
			this.walkflags = arg0.g1b();
		} else if (arg1 == 121) {
			this.modeloffset = new int[this.models.length][];
			int var27 = arg0.g1();
			for (int var28 = 0; var28 < var27; var28++) {
				int var29 = arg0.g1();
				int[] var30 = this.modeloffset[var29] = new int[3];
				var30[0] = arg0.g1b();
				var30[1] = arg0.g1b();
				var30[2] = arg0.g1b();
			}
		} else if (arg1 == 123) {
			this.overlayheight = arg0.g2();
		} else if (arg1 == 125) {
			this.respawndir = (CompassPoint) SerializableEnums.decode((SerializableEnum[]) CompassPoint.values(), arg0.g1b());
		} else if (arg1 == 127) {
			this.bas = arg0.g2();
		} else if (arg1 == 128) {
			SerializableEnums.decode((SerializableEnum[]) MoveSpeed.values(), arg0.g1());
		} else if (arg1 == 134) {
			this.bgsound = arg0.g2();
			if (this.bgsound == 65535) {
				this.bgsound = -1;
			}
			this.bgsound_crawl = arg0.g2();
			if (this.bgsound_crawl == 65535) {
				this.bgsound_crawl = -1;
			}
			this.bgsound_walk = arg0.g2();
			if (this.bgsound_walk == 65535) {
				this.bgsound_walk = -1;
			}
			this.bgsound_run = arg0.g2();
			if (this.bgsound_run == 65535) {
				this.bgsound_run = -1;
			}
			this.bgsound_range = arg0.g1();
		} else if (arg1 == 135 || arg1 == 136) {
			arg0.g1();
			arg0.g2();
		} else if (arg1 == 137) {
			this.cursorattack = arg0.g2();
		} else if (arg1 == 138) {
			this.covermarker = arg0.gSmart2or4s();
		} else if (arg1 == 140) {
			this.bgsound_volume = arg0.g1();
		} else if (arg1 == 141) {
			this.follower = true;
		} else if (arg1 == 142) {
			this.mapelement = arg0.g2();
		} else if (arg1 == 143) {
			this.drawbelow = true;
		} else if (arg1 >= 150 && arg1 < 155) {
			this.op[arg1 - 150] = arg0.gjstr();
			if (!this.factory.allowMembers) {
				this.op[arg1 - 150] = null;
			}
		} else if (arg1 == 155) {
			this.tint_hue = arg0.g1b();
			this.tint_saturation = arg0.g1b();
			this.tint_luminence = arg0.g1b();
			this.tint_weight = arg0.g1b();
		} else if (arg1 == 158) {
			this.reprioritiseattackop = 1;
		} else if (arg1 == 159) {
			this.reprioritiseattackop = 0;
		} else if (arg1 == 160) {
			int var31 = arg0.g1();
			this.quests = new int[var31];
			for (int var32 = 0; var32 < var31; var32++) {
				this.quests[var32] = arg0.g2();
			}
		} else if (arg1 != 162) {
			if (arg1 == 163) {
				this.picksize = arg0.g1();
			} else if (arg1 == 164) {
				this.bgsound_minrate = arg0.g2();
				this.bgsound_maxrate = arg0.g2();
			} else if (arg1 == 165) {
				this.picksizeshift = arg0.g1();
			} else if (arg1 == 168) {
				this.bgsound_dropoffrange = arg0.g1();
			} else if (arg1 == 169) {
				this.antimacro = false;
			} else if (arg1 >= 170 && arg1 < 176) {
				if (this.cursor == null) {
					this.cursor = new int[6];
					Arrays.fill(this.cursor, -1);
				}
				int var33 = arg0.g2();
				if (var33 == 65535) {
					var33 = -1;
				}
				this.cursor[arg1 - 170] = var33;
			} else if (arg1 != 178) {
				if (arg1 == 179) {
					this.clickbox = new Cuboid();
					this.clickbox.minX = arg0.gSmart1or2s();
					this.clickbox.minY = arg0.gSmart1or2s();
					this.clickbox.minZ = arg0.gSmart1or2s();
					this.clickbox.maxX = arg0.gSmart1or2s();
					this.clickbox.maxY = arg0.gSmart1or2s();
					this.clickbox.maxZ = arg0.gSmart1or2s();
				} else if (arg1 == 180) {
					this.fadeInDuration = arg0.g1() & 0xFF;
				} else if (arg1 == 181) {
					this.spotshadowtexture = (short) arg0.g2();
					this.spotshadowtexture_alpha = (byte) arg0.g1();
				} else if (arg1 == 182) {
					this.transmogfakenpc = true;
				} else if (arg1 == 249) {
					int var34 = arg0.g1();
					if (this.params == null) {
						int var35 = IntMath.bitceil(var34);
						this.params = new HashTable(var35);
					}
					for (int var36 = 0; var36 < var34; var36++) {
						boolean var37 = arg0.g1() == 1;
						int var38 = arg0.g3();
						Node var39;
						if (var37) {
							var39 = new ObjectNode(arg0.gjstr());
						} else {
							var39 = new IntNode(arg0.g4s());
						}
						this.params.put(var39, (long) var38);
					}
				}
			}
		}
	}

	@ObfuscatedName("if.n(I)V")
	public void postDecode() {
		if (this.models == null) {
			this.models = new int[0];
		}
		if (this.reprioritiseattackop != -1) {
			return;
		}
		if (this.factory == null || ModeGame.RUNESCAPE == this.factory.modeGame) {
			this.reprioritiseattackop = 1;
		} else {
			this.reprioritiseattackop = 0;
		}
	}

	@ObfuscatedName("if.z(Ldh;ILaof;Lem;Lep;Laaq;Laaq;[Laaq;[IILia;I)Ldo;")
	public final Model getSequencedModel(Toolkit arg0, int arg1, BASTypeList arg2, VariableTypeProvider arg3, VarIntDomain arg4, AnimationNode arg5, AnimationNode arg6, AnimationNode[] arg7, int[] arg8, int arg9, NPCTypeCustomisation arg10) {
		return this.getSequencedModel(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, this.bas, true);
	}

	@ObfuscatedName("if.p(Ldh;ILaof;Lem;Lep;Laaq;Laaq;[Laaq;[IILia;IZB)Ldo;")
	public final Model getSequencedModel(Toolkit arg0, int arg1, BASTypeList arg2, VariableTypeProvider arg3, VarIntDomain arg4, AnimationNode arg5, AnimationNode arg6, AnimationNode[] arg7, int[] arg8, int arg9, NPCTypeCustomisation arg10, int arg11, boolean arg12) {
		if (this.multinpc != null) {
			NPCType var14 = this.getMultiNPC(arg3, arg4);
			return var14 == null ? null : var14.getSequencedModel(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12);
		}
		int var15 = arg1;
		if (this.resizev != 128) {
			var15 = arg1 | 0x2;
		}
		if (this.resizeh != 128) {
			var15 |= 0x5;
		}
		boolean var16 = false;
		int var17 = arg7 == null ? 0 : arg7.length;
		for (int var18 = 0; var18 < var17; var18++) {
			if (arg7[var18] != null) {
				var15 |= arg7[var18].method14358();
				var16 = true;
			}
		}
		if (arg5 != null) {
			var15 |= arg5.method14358();
			var16 = true;
		}
		if (arg6 != null) {
			var15 |= arg6.method14358();
			var16 = true;
		}
		long var19 = (long) (this.id | arg0.field1595 << 16);
		if (arg10 != null) {
			var19 |= arg10.field2688 << 24;
		}
		SoftLruHashTable var21 = this.factory.modelCache;
		Model var22;
		synchronized (this.factory.modelCache) {
			var22 = (Model) this.factory.modelCache.get(var19);
		}
		BASType var24 = null;
		if (!arg12 && arg11 != -1) {
			var24 = (BASType) arg2.list(arg11);
		} else if (this.bas != -1) {
			var24 = (BASType) arg2.list(this.bas);
		}
		if (var22 == null || (var22.method1691() & var15) != var15) {
			if (var22 != null) {
				var15 |= var22.method1691();
			}
			int var25 = var15;
			if (this.recol_s != null) {
				var25 = var15 | 0x4000;
			}
			if (this.retex_s != null) {
				var25 |= 0x8000;
			}
			if (this.tint_weight != 0) {
				var25 |= 0x80000;
			}
			int[] var26 = arg10 == null || arg10.field2689 == null ? this.models : arg10.field2689;
			boolean var27 = false;
			Js5 var28 = this.factory.configClient;
			synchronized (this.factory.configClient) {
				for (int var29 = 0; var29 < var26.length; var29++) {
					if (var26[var29] != -1 && !this.factory.configClient.requestdownload(var26[var29], 0)) {
						var27 = true;
					}
				}
			}
			if (var27) {
				return null;
			}
			ModelUnlit[] var31 = new ModelUnlit[var26.length];
			for (int var32 = 0; var32 < var26.length; var32++) {
				if (var26[var32] != -1) {
					Js5 var33 = this.factory.configClient;
					synchronized (this.factory.configClient) {
						var31[var32] = ModelUnlit.get(this.factory.configClient, var26[var32], 0);
					}
					if (var31[var32] != null) {
						if (var31[var32].version < 13) {
							var31[var32].scaleByPowerOfTwo(2);
						}
						if (this.modeloffset != null && this.modeloffset[var32] != null) {
							var31[var32].method1945(this.modeloffset[var32][0], this.modeloffset[var32][1], this.modeloffset[var32][2]);
						}
					}
				}
			}
			if (arg10 != null) {
				for (int var35 = 0; var35 < var31.length; var35++) {
					if (var31[var35] != null) {
						if (arg10.field2683 != null && arg10.field2683[var35] != 0.0F) {
							var31[var35].method1948(arg10.field2683[var35]);
						}
						if (arg10.field2686 != null) {
							var31[var35].method1946(arg10.field2686[var35][0], arg10.field2686[var35][1], arg10.field2686[var35][2]);
						}
						if (arg10.field2687 != null) {
							var31[var35].method1945(arg10.field2687[var35][0], arg10.field2687[var35][1], arg10.field2687[var35][2]);
						}
					}
				}
			}
			if (var24 != null && var24.field7357 != null) {
				for (int var36 = 0; var36 < var24.field7357.length; var36++) {
					if (var36 < var31.length && var31[var36] != null) {
						int var37 = 0;
						int var38 = 0;
						int var39 = 0;
						int var40 = 0;
						int var41 = 0;
						int var42 = 0;
						if (var24.field7357[var36] != null) {
							var37 = var24.field7357[var36][0];
							var38 = var24.field7357[var36][1];
							var39 = var24.field7357[var36][2];
							var40 = var24.field7357[var36][3] << 3;
							var41 = var24.field7357[var36][4] << 3;
							var42 = var24.field7357[var36][5] << 3;
						}
						if (var40 != 0 || var41 != 0 || var42 != 0) {
							var31[var36].method1946(var40, var41, var42);
						}
						if (var37 != 0 || var38 != 0 || var39 != 0) {
							var31[var36].method1945(var37, var38, var39);
						}
					}
				}
			}
			ModelUnlit var43;
			if (var31.length == 1) {
				var43 = var31[0];
			} else {
				var43 = new ModelUnlit(var31, var31.length);
			}
			var22 = arg0.createModel(var43, var25, this.factory.field2773, this.ambient + 64, this.contrast * 5 + 850);
			if (this.recol_s != null) {
				short[] var44;
				if (arg10 == null || arg10.field2684 == null) {
					var44 = this.recol_d;
				} else {
					var44 = arg10.field2684;
				}
				for (int var45 = 0; var45 < this.recol_s.length; var45++) {
					if (this.recol_d_palette == null || var45 >= this.recol_d_palette.length) {
						var22.recolor(this.recol_s[var45], var44[var45]);
					} else {
						var22.recolor(this.recol_s[var45], clientpalette[this.recol_d_palette[var45] & 0xFF]);
					}
				}
			}
			if (this.retex_s != null) {
				short[] var46;
				if (arg10 == null || arg10.field2685 == null) {
					var46 = this.retex_d;
				} else {
					var46 = arg10.field2685;
				}
				for (int var47 = 0; var47 < this.retex_s.length; var47++) {
					var22.retexture(this.retex_s[var47], var46[var47]);
				}
			}
			if (this.tint_weight != 0) {
				var22.method1745(this.tint_hue, this.tint_saturation, this.tint_luminence, this.tint_weight & 0xFF);
			}
			var22.method1736();
			var22.method1690(var15);
			SoftLruHashTable var48 = this.factory.modelCache;
			synchronized (this.factory.modelCache) {
				this.factory.modelCache.put(var22, var19);
			}
		}
		Model var50 = var22.method1773((byte) 4, var15, true);
		boolean var51 = false;
		if (arg8 != null) {
			for (int var52 = 0; var52 < 12; var52++) {
				if (arg8[var52] != -1) {
					var51 = true;
				}
			}
		}
		if (!var16 && !var51) {
			return var50;
		}
		Matrix4x3[] var53 = null;
		if (var24 != null) {
			var53 = var24.method9291();
		}
		if (var51 && var53 != null) {
			for (int var54 = 0; var54 < 12; var54++) {
				if (var53[var54] != null) {
					var50.method1771(var53[var54], 0x1 << var54, true);
				}
			}
		}
		int var55 = 0;
		int var56 = 1;
		while (var55 < var17) {
			if (arg7[var55] != null) {
				arg7[var55].method14360(var50, 0, var56);
			}
			var55++;
			var56 <<= 0x1;
		}
		if (var51) {
			for (int var57 = 0; var57 < 12; var57++) {
				if (arg8[var57] != -1) {
					int var58 = arg8[var57] - arg9;
					int var59 = var58 & 0x3FFF;
					Matrix4x3 var60 = new Matrix4x3();
					var60.setToRotation(0.0F, 1.0F, 0.0F, Trig1.radians(var59));
					var50.method1771(var60, 0x1 << var57, false);
				}
			}
		}
		if (var51 && var53 != null) {
			for (int var61 = 0; var61 < 12; var61++) {
				if (var53[var61] != null) {
					var50.method1771(var53[var61], 0x1 << var61, false);
				}
			}
		}
		if (arg5 != null && arg6 != null) {
			AnimationNode.method2099(var50, arg5, arg6);
		} else if (arg5 != null) {
			arg5.method14359(var50, 0);
		} else if (arg6 != null) {
			arg6.method14359(var50, 0);
		}
		if (this.resizeh != 128 || this.resizev != 128) {
			var50.scale(this.resizeh, this.resizev, this.resizeh);
		}
		var50.method1690(arg1);
		return var50;
	}

	@ObfuscatedName("if.d(Ldh;ILem;Lep;Laaq;Lia;S)Ldo;")
	public final Model getHeadModel(Toolkit arg0, int arg1, VariableTypeProvider arg2, VarIntDomain arg3, AnimationNode arg4, NPCTypeCustomisation arg5) {
		if (this.multinpc != null) {
			NPCType var7 = this.getMultiNPC(arg2, arg3);
			return var7 == null ? null : var7.getHeadModel(arg0, arg1, arg2, arg3, arg4, arg5);
		} else if (this.heads == null && (arg5 == null || arg5.field2689 == null)) {
			return null;
		} else {
			int var8 = arg1;
			if (arg4 != null) {
				var8 = arg1 | arg4.method14358();
			}
			long var9 = (long) (this.id | arg0.field1595 << 16);
			if (arg5 != null) {
				var9 |= arg5.field2688 << 24;
			}
			SoftLruHashTable var11 = this.factory.headModelCache;
			Model var12;
			synchronized (this.factory.headModelCache) {
				var12 = (Model) this.factory.headModelCache.get(var9);
			}
			if (var12 == null || (var12.method1691() & var8) != var8) {
				if (var12 != null) {
					var8 |= var12.method1691();
				}
				int var14 = var8;
				if (this.recol_s != null) {
					var14 = var8 | 0x4000;
				}
				if (this.retex_s != null) {
					var14 |= 0x8000;
				}
				if (this.tint_weight != 0) {
					var14 |= 0x80000;
				}
				int[] var15 = arg5 == null || arg5.field2689 == null ? this.heads : arg5.field2689;
				boolean var16 = false;
				Js5 var17 = this.factory.configClient;
				synchronized (this.factory.configClient) {
					int var18 = 0;
					while (true) {
						if (var18 >= var15.length) {
							break;
						}
						if (!this.factory.configClient.requestdownload(var15[var18], 0)) {
							var16 = true;
						}
						var18++;
					}
				}
				if (var16) {
					return null;
				}
				ModelUnlit[] var20 = new ModelUnlit[var15.length];
				Js5 var21 = this.factory.configClient;
				synchronized (this.factory.configClient) {
					for (int var22 = 0; var22 < var15.length; var22++) {
						var20[var22] = ModelUnlit.get(this.factory.configClient, var15[var22], 0);
					}
				}
				for (int var24 = 0; var24 < var15.length; var24++) {
					if (var20[var24] != null && var20[var24].version < 13) {
						var20[var24].scaleByPowerOfTwo(2);
					}
				}
				ModelUnlit var25;
				if (var20.length == 1) {
					var25 = var20[0];
				} else {
					var25 = new ModelUnlit(var20, var20.length);
				}
				var12 = arg0.createModel(var25, var14, this.factory.field2773, 64, 768);
				if (this.recol_s != null) {
					short[] var26;
					if (arg5 == null || arg5.field2684 == null) {
						var26 = this.recol_d;
					} else {
						var26 = arg5.field2684;
					}
					for (int var27 = 0; var27 < this.recol_s.length; var27++) {
						if (this.recol_d_palette == null || var27 >= this.recol_d_palette.length) {
							var12.recolor(this.recol_s[var27], var26[var27]);
						} else {
							var12.recolor(this.recol_s[var27], clientpalette[this.recol_d_palette[var27] & 0xFF]);
						}
					}
				}
				if (this.retex_s != null) {
					short[] var28;
					if (arg5 == null || arg5.field2685 == null) {
						var28 = this.retex_d;
					} else {
						var28 = arg5.field2685;
					}
					for (int var29 = 0; var29 < this.retex_s.length; var29++) {
						var12.retexture(this.retex_s[var29], var28[var29]);
					}
				}
				if (this.tint_weight != 0) {
					var12.method1745(this.tint_hue, this.tint_saturation, this.tint_luminence, this.tint_weight & 0xFF);
				}
				var12.method1690(var8);
				SoftLruHashTable var30 = this.factory.headModelCache;
				synchronized (this.factory.headModelCache) {
					this.factory.headModelCache.put(var12, var9);
				}
			}
			if (arg4 != null) {
				var12 = var12.method1773((byte) 1, var8, true);
				arg4.method14359(var12, 0);
			}
			var12.method1690(arg1);
			return var12;
		}
	}

	@ObfuscatedName("if.c(I)Z")
	public final boolean hasReadyModels() {
		if (this.models == null) {
			return true;
		}
		boolean var1 = true;
		int[] var2 = this.models;
		for (int var3 = 0; var3 < var2.length; var3++) {
			int var4 = var2[var3];
			if (!this.factory.configClient.requestdownload(var4, 0)) {
				var1 = false;
			}
		}
		return var1;
	}

	@ObfuscatedName("if.r(IIB)I")
	public int getParam(int arg0, int arg1) {
		if (this.params == null) {
			return arg1;
		} else {
			IntNode var3 = (IntNode) this.params.get((long) arg0);
			return var3 == null ? arg1 : var3.value;
		}
	}

	@ObfuscatedName("if.v(ILjava/lang/String;I)Ljava/lang/String;")
	public String getParam(int arg0, String arg1) {
		if (this.params == null) {
			return arg1;
		} else {
			ObjectNode var3 = (ObjectNode) this.params.get((long) arg0);
			return var3 == null ? arg1 : (String) var3.value;
		}
	}

	@ObfuscatedName("if.o(Lem;Lep;S)Lif;")
	public final NPCType getMultiNPC(VariableTypeProvider arg0, VarIntDomain arg1) {
		int var3 = -1;
		if (this.multivarbit != -1) {
			VarBitType var4 = arg0.getVarBitType(this.multivarbit);
			if (var4 != null) {
				var3 = arg1.getVarBitValue(var4);
			}
		} else if (this.multivarp != -1) {
			VarType var5 = arg0.getVarType(VarDomainType.PLAYER, this.multivarp);
			if (var5 != null) {
				var3 = arg1.getVarValueInt(var5);
			}
		}
		if (var3 >= 0 && var3 < this.multinpc.length - 1) {
			return this.multinpc[var3] == -1 ? null : (NPCType) this.myList.list(this.multinpc[var3]);
		} else {
			int var6 = this.multinpc[this.multinpc.length - 1];
			return var6 == -1 ? null : (NPCType) this.myList.list(var6);
		}
	}

	@ObfuscatedName("if.s(Lem;Lep;I)Z")
	public boolean isVisible(VariableTypeProvider arg0, VarIntDomain arg1) {
		if (this.multinpc == null) {
			return true;
		}
		int var3 = -1;
		if (this.multivarbit != -1) {
			VarBitType var4 = arg0.getVarBitType(this.multivarbit);
			if (var4 != null) {
				var3 = arg1.getVarBitValue(var4);
			}
		} else if (this.multivarp != -1) {
			VarType var5 = arg0.getVarType(VarDomainType.PLAYER, this.multivarp);
			if (var5 != null) {
				var3 = arg1.getVarValueInt(var5);
			}
		}
		if (var3 >= 0 && var3 < this.multinpc.length - 1) {
			return this.multinpc[var3] != -1;
		} else {
			int var6 = this.multinpc[this.multinpc.length - 1];
			return var6 != -1;
		}
	}

	@ObfuscatedName("if.y(S)Z")
	public boolean hasBackgroundSound() {
		if (this.multinpc == null) {
			return this.bgsound != -1 || this.bgsound_walk != -1 || this.bgsound_run != -1;
		}
		for (int var1 = 0; var1 < this.multinpc.length; var1++) {
			if (this.multinpc[var1] != -1) {
				NPCType var2 = (NPCType) this.myList.list(this.multinpc[var1]);
				if (var2.bgsound != -1 || var2.bgsound_walk != -1 || var2.bgsound_run != -1) {
					return true;
				}
			}
		}
		return false;
	}

	@ObfuscatedName("if.q(II)I")
	public int getCursor(int arg0) {
		return this.cursor == null ? -1 : this.cursor[arg0];
	}
}
