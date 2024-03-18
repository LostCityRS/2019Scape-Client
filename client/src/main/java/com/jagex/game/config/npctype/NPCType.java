package com.jagex.game.config.npctype;

import com.jagex.core.constants.ModeGame;
import com.jagex.core.datastruct.*;
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
import com.jagex.game.world.entity.ObjectWrapper;
import com.jagex.graphics.*;
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
	public byte field2711;

	@ObfuscatedName("if.g")
	public byte field2712;

	@ObfuscatedName("if.i")
	public byte field2698;

	@ObfuscatedName("if.j")
	public byte field2714 = 0;

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
	public int[] field2738 = null;

	@ObfuscatedName("if.ar")
	public short[] field2728 = null;

	@ObfuscatedName("if.ap")
	public int covermarker = -1;

	@ObfuscatedName("if.aq")
	public int turnspeed = 32;

	@ObfuscatedName("if.ax")
	public int[] field2735;

	@ObfuscatedName("if.av")
	public int field2730 = -1;

	@ObfuscatedName("if.ao")
	public int field2755 = -1;

	@ObfuscatedName("if.aj")
	public boolean active = true;

	@ObfuscatedName("if.ay")
	public boolean walksmoothing = true;

	@ObfuscatedName("if.ab")
	public boolean spotshadow = true;

	@ObfuscatedName("if.az")
	public short field2737 = 0;

	@ObfuscatedName("if.aa")
	public short field2729 = 0;

	@ObfuscatedName("if.af")
	public byte field2739 = -96;

	@ObfuscatedName("if.ak")
	public byte field2740 = -16;

	@ObfuscatedName("if.an")
	public short field2741 = -1;

	@ObfuscatedName("if.bf")
	public byte field2702 = 0;

	@ObfuscatedName("if.bl")
	public byte field2743 = 0;

	@ObfuscatedName("if.bx")
	public int field2746 = -1;

	@ObfuscatedName("if.bd")
	public int field2747 = -1;

	@ObfuscatedName("if.bc")
	public int field2748 = -1;

	@ObfuscatedName("if.bi")
	public int field2749 = -1;

	@ObfuscatedName("if.bn")
	public int field2750 = 0;

	@ObfuscatedName("if.bt")
	public int bgsoundsize = 0;

	@ObfuscatedName("if.bq")
	public int bgsoundvolume = 255;

	@ObfuscatedName("if.bm")
	public IterableMap params;

	@ObfuscatedName("if.bb")
	public int overlayheight = -1;

	@ObfuscatedName("if.be")
	public CompassPoint respawndir = CompassPoint.field8307;

	@ObfuscatedName("if.by")
	public int mapelement = -1;

	@ObfuscatedName("if.bu")
	public int[] field2757;

	@ObfuscatedName("if.bw")
	public byte reprioritiseattackop = -1;

	@ObfuscatedName("if.bo")
	public int picksize = -1;

	@ObfuscatedName("if.bz")
	public Cuboid clickbox;

	@ObfuscatedName("if.bv")
	public int field2761 = 256;

	@ObfuscatedName("if.br")
	public int field2700 = 256;

	@ObfuscatedName("if.bg")
	public int picksizeshift = 0;

	@ObfuscatedName("if.ba")
	public boolean antimacro = true;

	@ObfuscatedName("if.bp")
	public int field2765 = 0;

	@ObfuscatedName("if.bj")
	public boolean transmogfakenpc = false;

	public NPCType(int id, NPCTypeFactory factory, ConfigTypeList npcs) {
		this.id = id;
		this.factory = factory;
		this.myList = npcs;
		this.op = (String[]) this.factory.defaultOps.clone();
	}

	@ObfuscatedName("if.e(Lalw;B)V")
	public void decode(Packet buf) {
		while (true) {
			int code = buf.g1();
			if (code == 0) {
				return;
			}
			this.decode(buf, code);
		}
	}

	@ObfuscatedName("if.u(Lalw;II)V")
	public void decode(Packet buf, int code) {
		if (code == 1) {
			int length = buf.g1();
			this.models = new int[length];
			for (int index = 0; index < length; index++) {
				this.models[index] = buf.gSmart2or4null();
			}
		} else if (code == 2) {
			this.name = buf.gjstr();
		} else if (code == 12) {
			this.size = buf.g1();
		} else if (code >= 30 && code < 35) {
			this.op[code - 30] = buf.gjstr();
		} else if (code == 40) {
			int length = buf.g1();
			this.recol_s = new short[length];
			this.recol_d = new short[length];
			for (int index = 0; index < length; index++) {
				this.recol_s[index] = (short) buf.g2();
				this.recol_d[index] = (short) buf.g2();
			}
		} else if (code == 41) {
			int length = buf.g1();
			this.retex_s = new short[length];
			this.retex_d = new short[length];
			for (int var8 = 0; var8 < length; var8++) {
				this.retex_s[var8] = (short) buf.g2();
				this.retex_d[var8] = (short) buf.g2();
			}
		} else if (code == 42) {
			int length = buf.g1();
			this.recol_d_palette = new byte[length];
			for (int index = 0; index < length; index++) {
				this.recol_d_palette[index] = buf.g1b();
			}
		} else if (code == 44) {
			int var11 = buf.g2();
			int length = 0;
			for (int var13 = var11; var13 > 0; var13 >>= 0x1) {
				length++;
			}
			this.recolindices = new byte[length];
			byte var14 = 0;
			for (int index = 0; index < length; index++) {
				if ((var11 & 0x1 << index) > 0) {
					this.recolindices[index] = var14++;
				} else {
					this.recolindices[index] = -1;
				}
			}
		} else if (code == 45) {
			int var16 = buf.g2();
			int length = 0;
			for (int var18 = var16; var18 > 0; var18 >>= 0x1) {
				length++;
			}
			this.retexindices = new byte[length];
			byte var19 = 0;
			for (int index = 0; index < length; index++) {
				if ((var16 & 0x1 << index) > 0) {
					this.retexindices[index] = var19++;
				} else {
					this.retexindices[index] = -1;
				}
			}
		} else if (code == 60) {
			int length = buf.g1();
			this.heads = new int[length];
			for (int var22 = 0; var22 < length; var22++) {
				this.heads[var22] = buf.gSmart2or4null();
			}
		} else if (code == 93) {
			this.minimap = false;
		} else if (code == 95) {
			this.vislevel = buf.g2();
		} else if (code == 97) {
			this.resizeh = buf.g2();
		} else if (code == 98) {
			this.resizev = buf.g2();
		} else if (code == 99) {
			this.drawabove = true;
		} else if (code == 100) {
			this.ambient = buf.g1b();
		} else if (code == 101) {
			this.contrast = buf.g1b() * 5;
		} else if (code == 102) {
			int var23 = buf.g1();
			int var24 = 0;
			for (int var25 = var23; var25 != 0; var25 >>= 0x1) {
				var24++;
			}
			this.field2738 = new int[var24];
			this.field2728 = new short[var24];
			for (int var26 = 0; var26 < var24; var26++) {
				if ((var23 & 0x1 << var26) == 0) {
					this.field2738[var26] = -1;
					this.field2728[var26] = -1;
				} else {
					this.field2738[var26] = buf.gSmart2or4null();
					this.field2728[var26] = (short) buf.gSmart1or2null();
				}
			}
		} else if (code == 103) {
			this.turnspeed = buf.g2();
		} else if (code == 106 || code == 118) {
			this.field2730 = buf.g2();
			if (this.field2730 == 65535) {
				this.field2730 = -1;
			}
			this.field2755 = buf.g2();
			if (this.field2755 == 65535) {
				this.field2755 = -1;
			}
			int var40 = -1;
			if (code == 118) {
				var40 = buf.g2();
				if (var40 == 65535) {
					var40 = -1;
				}
			}
			int var41 = buf.gSmart1or2();
			this.field2735 = new int[var41 + 2];
			for (int var42 = 0; var42 <= var41; var42++) {
				this.field2735[var42] = buf.g2();
				if (this.field2735[var42] == 65535) {
					this.field2735[var42] = -1;
				}
			}
			this.field2735[var41 + 1] = var40;
		} else if (code == 107) {
			this.active = false;
		} else if (code == 109) {
			this.walksmoothing = false;
		} else if (code == 111) {
			this.spotshadow = false;
		} else if (code == 113) {
			this.field2737 = (short) buf.g2();
			this.field2729 = (short) buf.g2();
		} else if (code == 114) {
			this.field2739 = buf.g1b();
			this.field2740 = buf.g1b();
		} else if (code == 119) {
			this.field2743 = buf.g1b();
		} else if (code == 121) {
			this.modeloffset = new int[this.models.length][];
			int length = buf.g1();
			for (int index = 0; index < length; index++) {
				int var29 = buf.g1();
				int[] var30 = this.modeloffset[var29] = new int[3];
				var30[0] = buf.g1b();
				var30[1] = buf.g1b();
				var30[2] = buf.g1b();
			}
		} else if (code == 123) {
			this.overlayheight = buf.g2();
		} else if (code == 125) {
			this.respawndir = (CompassPoint) SerializableEnums.decode(CompassPoint.values(), buf.g1b());
		} else if (code == 127) {
			this.bas = buf.g2();
		} else if (code == 128) {
			SerializableEnums.decode(MoveSpeed.values(), buf.g1());
		} else if (code == 134) {
			this.field2746 = buf.g2();
			if (this.field2746 == 65535) {
				this.field2746 = -1;
			}
			this.field2747 = buf.g2();
			if (this.field2747 == 65535) {
				this.field2747 = -1;
			}
			this.field2748 = buf.g2();
			if (this.field2748 == 65535) {
				this.field2748 = -1;
			}
			this.field2749 = buf.g2();
			if (this.field2749 == 65535) {
				this.field2749 = -1;
			}
			this.field2750 = buf.g1();
		} else if (code == 135 || code == 136) {
			buf.g1();
			buf.g2();
		} else if (code == 137) {
			this.cursorattack = buf.g2();
		} else if (code == 138) {
			this.covermarker = buf.gSmart2or4null();
		} else if (code == 140) {
			this.bgsoundvolume = buf.g1();
		} else if (code == 141) {
			this.follower = true;
		} else if (code == 142) {
			this.mapelement = buf.g2();
		} else if (code == 143) {
			this.drawbelow = true;
		} else if (code >= 150 && code < 155) {
			this.op[code - 150] = buf.gjstr();
			if (!this.factory.allowMembers) {
				this.op[code - 150] = null;
			}
		} else if (code == 155) {
			this.field2711 = buf.g1b();
			this.field2712 = buf.g1b();
			this.field2698 = buf.g1b();
			this.field2714 = buf.g1b();
		} else if (code == 158) {
			this.reprioritiseattackop = 1;
		} else if (code == 159) {
			this.reprioritiseattackop = 0;
		} else if (code == 160) {
			int var31 = buf.g1();
			this.field2757 = new int[var31];
			for (int var32 = 0; var32 < var31; var32++) {
				this.field2757[var32] = buf.g2();
			}
		} else if (code != 162) {
			if (code == 163) {
				this.picksize = buf.g1();
			} else if (code == 164) {
				this.field2761 = buf.g2();
				this.field2700 = buf.g2();
			} else if (code == 165) {
				this.picksizeshift = buf.g1();
			} else if (code == 168) {
				this.bgsoundsize = buf.g1();
			} else if (code == 169) {
				this.antimacro = false;
			} else if (code >= 170 && code < 176) {
				if (this.cursor == null) {
					this.cursor = new int[6];
					Arrays.fill(this.cursor, -1);
				}
				int cursor = buf.g2();
				if (cursor == 65535) {
					cursor = -1;
				}
				this.cursor[code - 170] = cursor;
			} else if (code != 178) {
				if (code == 179) {
					this.clickbox = new Cuboid();
					this.clickbox.field4252 = buf.gSmart1or2s();
					this.clickbox.field4253 = buf.gSmart1or2s();
					this.clickbox.field4248 = buf.gSmart1or2s();
					this.clickbox.field4249 = buf.gSmart1or2s();
					this.clickbox.field4250 = buf.gSmart1or2s();
					this.clickbox.field4251 = buf.gSmart1or2s();
				} else if (code == 180) {
					this.field2765 = buf.g1() & 0xFF;
				} else if (code == 181) {
					this.field2741 = (short) buf.g2();
					this.field2702 = (byte) buf.g1();
				} else if (code == 182) {
					this.transmogfakenpc = true;
				} else if (code == 249) {
					int var34 = buf.g1();
					if (this.params == null) {
						int var35 = IntMath.bitceil(var34);
						this.params = new IterableMap(var35);
					}
					for (int var36 = 0; var36 < var34; var36++) {
						boolean var37 = buf.g1() == 1;
						int var38 = buf.g3();
						Node var39;
						if (var37) {
							var39 = new ObjectWrapper(buf.gjstr());
						} else {
							var39 = new IntWrapper(buf.g4s());
						}
						this.params.pushNode(var39, (long) var38);
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
	public final Model method4542(Renderer arg0, int arg1, BASTypeList arg2, VariableTypeProvider arg3, VarIntDomain arg4, AnimationWrapper arg5, AnimationWrapper arg6, AnimationWrapper[] arg7, int[] arg8, int arg9, NPCTypeCustomisation arg10) {
		return this.getSequencedModel(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, this.bas, true);
	}

	@ObfuscatedName("if.p(Ldh;ILaof;Lem;Lep;Laaq;Laaq;[Laaq;[IILia;IZB)Ldo;")
	public final Model getSequencedModel(Renderer arg0, int arg1, BASTypeList arg2, VariableTypeProvider arg3, VarIntDomain arg4, AnimationWrapper arg5, AnimationWrapper arg6, AnimationWrapper[] arg7, int[] arg8, int arg9, NPCTypeCustomisation arg10, int arg11, boolean arg12) {
		if (this.field2735 != null) {
			NPCType var14 = this.getVisible(arg3, arg4);
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
		WeightedCache var21 = this.factory.modelCache;
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
			if (this.field2714 != 0) {
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
						if (var31[var32].field1372 < 13) {
							var31[var32].method1947(2);
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
			var22 = arg0.createModel(var43, var25, this.factory.field2773, this.ambient + 64, this.contrast + 850);
			if (this.recol_s != null) {
				short[] var44;
				if (arg10 == null || arg10.field2684 == null) {
					var44 = this.recol_d;
				} else {
					var44 = arg10.field2684;
				}
				for (int var45 = 0; var45 < this.recol_s.length; var45++) {
					if (this.recol_d_palette == null || var45 >= this.recol_d_palette.length) {
						var22.method1859(this.recol_s[var45], var44[var45]);
					} else {
						var22.method1859(this.recol_s[var45], clientpalette[this.recol_d_palette[var45] & 0xFF]);
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
					var22.method1744(this.retex_s[var47], var46[var47]);
				}
			}
			if (this.field2714 != 0) {
				var22.method1745(this.field2711, this.field2712, this.field2698, this.field2714 & 0xFF);
			}
			var22.method1736();
			var22.method1690(var15);
			WeightedCache var48 = this.factory.modelCache;
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
					var60.method6372(0.0F, 1.0F, 0.0F, Trig1.method6277(var59));
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
			AnimationWrapper.method2099(var50, arg5, arg6);
		} else if (arg5 != null) {
			arg5.method14359(var50, 0);
		} else if (arg6 != null) {
			arg6.method14359(var50, 0);
		}
		if (this.resizeh != 128 || this.resizev != 128) {
			var50.method1699(this.resizeh, this.resizev, this.resizeh);
		}
		var50.method1690(arg1);
		return var50;
	}

	@ObfuscatedName("if.d(Ldh;ILem;Lep;Laaq;Lia;S)Ldo;")
	public final Model getHeadModel(Renderer arg0, int arg1, VariableTypeProvider arg2, VarIntDomain arg3, AnimationWrapper arg4, NPCTypeCustomisation arg5) {
		if (this.field2735 != null) {
			NPCType var7 = this.getVisible(arg2, arg3);
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
			WeightedCache var11 = this.factory.field2768;
			Model var12;
			synchronized (this.factory.field2768) {
				var12 = (Model) this.factory.field2768.get(var9);
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
				if (this.field2714 != 0) {
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
					if (var20[var24] != null && var20[var24].field1372 < 13) {
						var20[var24].method1947(2);
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
							var12.method1859(this.recol_s[var27], var26[var27]);
						} else {
							var12.method1859(this.recol_s[var27], clientpalette[this.recol_d_palette[var27] & 0xFF]);
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
						var12.method1744(this.retex_s[var29], var28[var29]);
					}
				}
				if (this.field2714 != 0) {
					var12.method1745(this.field2711, this.field2712, this.field2698, this.field2714 & 0xFF);
				}
				var12.method1690(var8);
				WeightedCache var30 = this.factory.field2768;
				synchronized (this.factory.field2768) {
					this.factory.field2768.put(var12, var9);
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
	public final boolean method4545() {
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
	public int method4551(int arg0, int arg1) {
		if (this.params == null) {
			return arg1;
		} else {
			IntWrapper var3 = (IntWrapper) this.params.getNode((long) arg0);
			return var3 == null ? arg1 : var3.intValue;
		}
	}

	@ObfuscatedName("if.v(ILjava/lang/String;I)Ljava/lang/String;")
	public String method4548(int arg0, String arg1) {
		if (this.params == null) {
			return arg1;
		} else {
			ObjectWrapper var3 = (ObjectWrapper) this.params.getNode((long) arg0);
			return var3 == null ? arg1 : (String) var3.field11436;
		}
	}

	@ObfuscatedName("if.o(Lem;Lep;S)Lif;")
	public final NPCType getVisible(VariableTypeProvider arg0, VarIntDomain arg1) {
		int var3 = -1;
		if (this.field2730 != -1) {
			VarBitType var4 = arg0.getVarBitType(this.field2730);
			if (var4 != null) {
				var3 = arg1.getVarBitValue(var4);
			}
		} else if (this.field2755 != -1) {
			VarType var5 = arg0.getVarType(VarDomainType.PLAYER, this.field2755);
			if (var5 != null) {
				var3 = arg1.getVarValueInt(var5);
			}
		}
		if (var3 >= 0 && var3 < this.field2735.length - 1) {
			return this.field2735[var3] == -1 ? null : (NPCType) this.myList.list(this.field2735[var3]);
		} else {
			int var6 = this.field2735[this.field2735.length - 1];
			return var6 == -1 ? null : (NPCType) this.myList.list(var6);
		}
	}

	@ObfuscatedName("if.s(Lem;Lep;I)Z")
	public boolean method4567(VariableTypeProvider arg0, VarIntDomain arg1) {
		if (this.field2735 == null) {
			return true;
		}
		int var3 = -1;
		if (this.field2730 != -1) {
			VarBitType var4 = arg0.getVarBitType(this.field2730);
			if (var4 != null) {
				var3 = arg1.getVarBitValue(var4);
			}
		} else if (this.field2755 != -1) {
			VarType var5 = arg0.getVarType(VarDomainType.PLAYER, this.field2755);
			if (var5 != null) {
				var3 = arg1.getVarValueInt(var5);
			}
		}
		if (var3 >= 0 && var3 < this.field2735.length - 1) {
			return this.field2735[var3] != -1;
		} else {
			int var6 = this.field2735[this.field2735.length - 1];
			return var6 != -1;
		}
	}

	@ObfuscatedName("if.y(S)Z")
	public boolean method4556() {
		if (this.field2735 == null) {
			return this.field2746 != -1 || this.field2748 != -1 || this.field2749 != -1;
		}
		for (int var1 = 0; var1 < this.field2735.length; var1++) {
			if (this.field2735[var1] != -1) {
				NPCType var2 = (NPCType) this.myList.list(this.field2735[var1]);
				if (var2.field2746 != -1 || var2.field2748 != -1 || var2.field2749 != -1) {
					return true;
				}
			}
		}
		return false;
	}

	@ObfuscatedName("if.q(II)I")
	public int method4563(int arg0) {
		return this.cursor == null ? -1 : this.cursor[arg0];
	}
}
