package com.jagex.game.config.objtype;

import com.jagex.core.constants.Language;
import com.jagex.core.datastruct.IntWrapper;
import com.jagex.core.datastruct.IterableMap;
import com.jagex.core.datastruct.Node;
import com.jagex.core.datastruct.WeightedCache;
import com.jagex.core.io.Packet;
import com.jagex.game.client.LocalisedText;
import com.jagex.game.config.ConfigType;
import com.jagex.game.config.ConfigTypeList;
import com.jagex.game.config.defaults.GraphicsDefaults;
import com.jagex.game.config.paramtype.ParamType;
import com.jagex.game.world.entity.ObjTypeCustomisation;
import com.jagex.game.world.entity.ObjectWrapper;
import com.jagex.game.world.entity.PlayerModel;
import com.jagex.graphics.*;
import com.jagex.math.IntMath;
import com.jagex.math.Matrix4x3;
import com.jagex.math.Matrix4x4;
import com.jagex.math.Trig1;
import deob.ObfuscatedName;

import java.util.Arrays;

@ObfuscatedName("abv")
public class ObjType implements ConfigType {

	@ObfuscatedName("abv.w")
	public static short[] clientpalette = new short[256];

	@ObfuscatedName("abv.l")
	public ConfigTypeList list;

	@ObfuscatedName("abv.u")
	public ObjTypeFactory factory;

	@ObfuscatedName("abv.z")
	public int id;

	@ObfuscatedName("abv.p")
	public int field8628 = -1;

	@ObfuscatedName("abv.d")
	public int model;

	@ObfuscatedName("abv.c")
	public String name = "null";

	@ObfuscatedName("abv.r")
	public short[] recol_s;

	@ObfuscatedName("abv.v")
	public short[] recol_d;

	@ObfuscatedName("abv.o")
	public byte[] field8633;

	@ObfuscatedName("abv.s")
	public short[] field8634;

	@ObfuscatedName("abv.y")
	public short[] field8635;

	@ObfuscatedName("abv.q")
	public byte[] field8661;

	@ObfuscatedName("abv.x")
	public byte[] field8637;

	@ObfuscatedName("abv.b")
	public int zoom2d = 2000;

	@ObfuscatedName("abv.h")
	public int xan2d = 0;

	@ObfuscatedName("abv.a")
	public int yan2d = 0;

	@ObfuscatedName("abv.g")
	public int field8641 = 0;

	@ObfuscatedName("abv.i")
	public int xof2d = 0;

	@ObfuscatedName("abv.j")
	public int yof2d = 0;

	@ObfuscatedName("abv.t")
	public int stackable = 0;

	@ObfuscatedName("abv.ae")
	public int cost = 1;

	@ObfuscatedName("abv.ag")
	public boolean members = false;

	@ObfuscatedName("abv.ah")
	public String[] ops;

	@ObfuscatedName("abv.al")
	public String[] iops;

	@ObfuscatedName("abv.ac")
	public int[] field8649;

	@ObfuscatedName("abv.ai")
	public int[] field8619;

	@ObfuscatedName("abv.aw")
	public int field8651 = -1;

	@ObfuscatedName("abv.as")
	public int field8652 = -1;

	@ObfuscatedName("abv.at")
	public int field8653 = -1;

	@ObfuscatedName("abv.ad")
	public int manwear = -1;

	@ObfuscatedName("abv.am")
	public int manwear2 = -1;

	@ObfuscatedName("abv.au")
	public int womanwear = -1;

	@ObfuscatedName("abv.ar")
	public int womanwear2 = -1;

	@ObfuscatedName("abv.ap")
	public int manwear3 = -1;

	@ObfuscatedName("abv.aq")
	public int womanwear3 = -1;

	@ObfuscatedName("abv.ax")
	public int field8632 = 0;

	@ObfuscatedName("abv.av")
	public int field8640 = 0;

	@ObfuscatedName("abv.ao")
	public int field8660 = 0;

	@ObfuscatedName("abv.aj")
	public int field8670 = 0;

	@ObfuscatedName("abv.ay")
	public int field8664 = 0;

	@ObfuscatedName("abv.ab")
	public int field8665 = 0;

	@ObfuscatedName("abv.az")
	public int manhead = -1;

	@ObfuscatedName("abv.aa")
	public int manhead2 = -1;

	@ObfuscatedName("abv.af")
	public int womanhead = -1;

	@ObfuscatedName("abv.ak")
	public int womanhead2 = -1;

	@ObfuscatedName("abv.an")
	public int[] countobj;

	@ObfuscatedName("abv.bf")
	public int[] countco;

	@ObfuscatedName("abv.bl")
	public int certtemplate = -1;

	@ObfuscatedName("abv.bk")
	public int certlink = -1;

	@ObfuscatedName("abv.bh")
	public int field8674 = -1;

	@ObfuscatedName("abv.bx")
	public int field8675 = -1;

	@ObfuscatedName("abv.bd")
	public int field8676 = -1;

	@ObfuscatedName("abv.bc")
	public int field8677 = -1;

	@ObfuscatedName("abv.bi")
	public String field8678 = "null";

	@ObfuscatedName("abv.bn")
	public int field8679 = 0;

	@ObfuscatedName("abv.bt")
	public int field8686 = 128;

	@ObfuscatedName("abv.bq")
	public int field8681 = 128;

	@ObfuscatedName("abv.bm")
	public int field8682 = 128;

	@ObfuscatedName("abv.bb")
	public int field8683 = 0;

	@ObfuscatedName("abv.be")
	public int field8624 = 0;

	@ObfuscatedName("abv.by")
	public int field8685 = 0;

	@ObfuscatedName("abv.bu")
	public boolean field8645 = false;

	@ObfuscatedName("abv.bw")
	public boolean field8687 = false;

	@ObfuscatedName("abv.bo")
	public boolean field8688 = false;

	@ObfuscatedName("abv.bz")
	public int field8689 = 0;

	@ObfuscatedName("abv.bv")
	public IterableMap params;

	@ObfuscatedName("abv.br")
	public int[] field8691;

	@ObfuscatedName("abv.bg")
	public int field8692 = 0;

	@ObfuscatedName("abv.ba")
	public int field8693 = -1;

	@ObfuscatedName("abv.bp")
	public int field8694 = -1;

	@ObfuscatedName("abv.bj")
	public boolean field8680 = false;

	@ObfuscatedName("abv.bs")
	public int field8696;

	@ObfuscatedName("abv.cl")
	public boolean field8697 = false;

	@ObfuscatedName("abv.cg")
	public boolean field8698 = true;

	@ObfuscatedName("abv.ce")
	public static String field8699 = "</col>";

	public ObjType(int id, ConfigTypeList list, ObjTypeFactory factory) {
		this.id = id;
		this.list = list;
		this.factory = factory;
		this.ops = (String[]) this.factory.defaultops.clone();
		this.iops = (String[]) this.factory.defaultiops.clone();
	}

	@ObfuscatedName("abv.n(I)V")
	public void postDecode() {
		if (this.certtemplate != -1) {
			this.toCertTemplate((ObjType) this.list.list(this.certtemplate), (ObjType) this.list.list(this.certlink), this.factory.languageId);
		} else if (this.field8675 != -1) {
			this.toLendTemplate((ObjType) this.list.list(this.field8675), (ObjType) this.list.list(this.field8674), this.factory.languageId);
		} else if (this.field8694 != -1) {
			this.toBoughtTemplate((ObjType) this.list.list(this.field8694), (ObjType) this.list.list(this.field8693), this.factory.languageId);
		} else if (this.field8677 != -1) {
			this.toShardTemplate((ObjType) this.list.list(this.field8677), (ObjType) this.list.list(this.field8676), this.factory.languageId);
		}
		if (this.field8689 != 0) {
			this.field8687 = false;
		}
		if (this.factory.allowMembers || !this.members) {
			return;
		}
		this.field8685 = 0;
		this.ops = this.factory.defaultops;
		this.iops = this.factory.defaultiops;
		this.field8645 = false;
		this.field8691 = null;
		this.field8687 = false;
		if (this.params == null) {
			return;
		}
		boolean var1 = false;
		for (Node var2 = this.params.method14500(); var2 != null; var2 = this.params.method14502()) {
			ParamType var3 = (ParamType) this.factory.paramTL.list((int) var2.field6760);
			if (var3.autodisable) {
				var2.method8440();
			} else {
				var1 = true;
			}
		}
		if (!var1) {
			this.params = null;
		}
	}

	@ObfuscatedName("abv.e(Lalw;B)V")
	public void decode(Packet buf) {
		this.field8687 = true;
		while (true) {
			int code = buf.g1();
			if (code == 0) {
				return;
			}
			this.decode(buf, code);
		}
	}

	@ObfuscatedName("abv.u(Lalw;II)V")
	public void decode(Packet buf, int code) {
		if (code == 1) {
			this.model = buf.gSmart2or4null();
		} else if (code == 2) {
			this.name = buf.gjstr();
		} else if (code == 4) {
			this.zoom2d = buf.g2();
		} else if (code == 5) {
			this.xan2d = buf.g2();
		} else if (code == 6) {
			this.yan2d = buf.g2();
		} else if (code == 7) {
			this.xof2d = buf.g2();
			if (this.xof2d > 32767) {
				this.xof2d -= 65536;
			}
		} else if (code == 8) {
			this.yof2d = buf.g2();
			if (this.yof2d > 32767) {
				this.yof2d -= 65536;
			}
		} else if (code == 11) {
			this.stackable = 1;
		} else if (code == 12) {
			this.cost = buf.g4s();
		} else if (code == 13) {
			this.field8651 = buf.g1();
		} else if (code == 14) {
			this.field8652 = buf.g1();
		} else if (code == 15) {
			this.field8687 = false;
		} else if (code == 16) {
			this.members = true;
		} else if (code == 23) {
			this.manwear = buf.gSmart2or4null();
		} else if (code == 24) {
			this.manwear2 = buf.gSmart2or4null();
		} else if (code == 25) {
			this.womanwear = buf.gSmart2or4null();
		} else if (code == 26) {
			this.womanwear2 = buf.gSmart2or4null();
		} else if (code == 27) {
			this.field8653 = buf.g1();
		} else if (code >= 30 && code < 35) {
			this.ops[code - 30] = buf.gjstr();
		} else if (code >= 35 && code < 40) {
			this.iops[code - 35] = buf.gjstr();
		} else if (code == 40) {
			int var3 = buf.g1();
			this.recol_s = new short[var3];
			this.recol_d = new short[var3];
			for (int var4 = 0; var4 < var3; var4++) {
				this.recol_s[var4] = (short) buf.g2();
				this.recol_d[var4] = (short) buf.g2();
			}
		} else if (code == 41) {
			int var5 = buf.g1();
			this.field8634 = new short[var5];
			this.field8635 = new short[var5];
			for (int var6 = 0; var6 < var5; var6++) {
				this.field8634[var6] = (short) buf.g2();
				this.field8635[var6] = (short) buf.g2();
			}
		} else if (code == 42) {
			int var7 = buf.g1();
			this.field8633 = new byte[var7];
			for (int var8 = 0; var8 < var7; var8++) {
				this.field8633[var8] = buf.g1b();
			}
		} else if (code == 43) {
			this.field8696 = buf.g4s();
			this.field8680 = true;
		} else if (code == 44) {
			int var9 = buf.g2();
			int var10 = 0;
			for (int var11 = var9; var11 > 0; var11 >>= 0x1) {
				var10++;
			}
			this.field8661 = new byte[var10];
			byte var12 = 0;
			for (int var13 = 0; var13 < var10; var13++) {
				if ((var9 & 0x1 << var13) > 0) {
					this.field8661[var13] = var12++;
				} else {
					this.field8661[var13] = -1;
				}
			}
		} else if (code == 45) {
			int var14 = buf.g2();
			int var15 = 0;
			for (int var16 = var14; var16 > 0; var16 >>= 0x1) {
				var15++;
			}
			this.field8637 = new byte[var15];
			byte var17 = 0;
			for (int var18 = 0; var18 < var15; var18++) {
				if ((var14 & 0x1 << var18) > 0) {
					this.field8637[var18] = var17++;
				} else {
					this.field8637[var18] = -1;
				}
			}
		} else if (code == 65) {
			this.field8645 = true;
		} else if (code == 78) {
			this.manwear3 = buf.gSmart2or4null();
		} else if (code == 79) {
			this.womanwear3 = buf.gSmart2or4null();
		} else if (code == 90) {
			this.manhead = buf.gSmart2or4null();
		} else if (code == 91) {
			this.womanhead = buf.gSmart2or4null();
		} else if (code == 92) {
			this.manhead2 = buf.gSmart2or4null();
		} else if (code == 93) {
			this.womanhead2 = buf.gSmart2or4null();
		} else if (code == 94) {
			this.field8628 = buf.g2();
		} else if (code == 95) {
			this.field8641 = buf.g2();
		} else if (code == 96) {
			this.field8689 = buf.g1();
		} else if (code == 97) {
			this.certlink = buf.g2();
		} else if (code == 98) {
			this.certtemplate = buf.g2();
		} else if (code >= 100 && code < 110) {
			if (this.countobj == null) {
				this.countobj = new int[10];
				this.countco = new int[10];
			}
			this.countobj[code - 100] = buf.g2();
			this.countco[code - 100] = buf.g2();
		} else if (code == 110) {
			this.field8686 = buf.g2();
		} else if (code == 111) {
			this.field8681 = buf.g2();
		} else if (code == 112) {
			this.field8682 = buf.g2();
		} else if (code == 113) {
			this.field8683 = buf.g1b();
		} else if (code == 114) {
			this.field8624 = buf.g1b() * 5;
		} else if (code == 115) {
			this.field8685 = buf.g1();
		} else if (code == 121) {
			this.field8674 = buf.g2();
		} else if (code == 122) {
			this.field8675 = buf.g2();
		} else if (code == 125) {
			this.field8632 = buf.g1b() << 2;
			this.field8660 = buf.g1b() << 2;
			this.field8664 = buf.g1b() << 2;
		} else if (code == 126) {
			this.field8640 = buf.g1b() << 2;
			this.field8670 = buf.g1b() << 2;
			this.field8665 = buf.g1b() << 2;
		} else if (code == 127 || code == 128 || code == 129 || code == 130) {
			buf.g1();
			buf.g2();
		} else if (code == 132) {
			int var19 = buf.g1();
			this.field8691 = new int[var19];
			for (int var20 = 0; var20 < var19; var20++) {
				this.field8691[var20] = buf.g2();
			}
		} else if (code == 134) {
			this.field8692 = buf.g1();
		} else if (code == 139) {
			this.field8693 = buf.g2();
		} else if (code == 140) {
			this.field8694 = buf.g2();
		} else if (code >= 142 && code < 147) {
			if (this.field8649 == null) {
				this.field8649 = new int[6];
				Arrays.fill(this.field8649, -1);
			}
			this.field8649[code - 142] = buf.g2();
		} else if (code >= 150 && code < 155) {
			if (this.field8619 == null) {
				this.field8619 = new int[5];
				Arrays.fill(this.field8619, -1);
			}
			this.field8619[code - 150] = buf.g2();
		} else if (code != 156) {
			if (code == 157) {
				this.field8697 = true;
			} else if (code == 161) {
				this.field8676 = buf.g2();
			} else if (code == 162) {
				this.field8677 = buf.g2();
			} else if (code == 163) {
				this.field8679 = buf.g2();
			} else if (code == 164) {
				this.field8678 = buf.gjstr();
			} else if (code == 165) {
				this.stackable = 2;
			} else if (code == 167) {
				this.field8688 = true;
			} else if (code == 168) {
				this.field8698 = false;
			} else if (code == 249) {
				int var21 = buf.g1();
				if (this.params == null) {
					int var22 = IntMath.bitceil(var21);
					this.params = new IterableMap(var22);
				}
				for (int var23 = 0; var23 < var21; var23++) {
					boolean var24 = buf.g1() == 1;
					int var25 = buf.g3();
					Node var26;
					if (var24) {
						var26 = new ObjectWrapper(buf.gjstr());
					} else {
						var26 = new IntWrapper(buf.g4s());
					}
					this.params.method14501(var26, (long) var25);
				}
			}
		}
	}

	@ObfuscatedName("abv.z(Labq;Labv;Labv;Lacz;Lzt;I)V")
	public void toTemplate(DerivedObjType arg0, ObjType arg1, ObjType arg2, LocalisedText arg3, Language arg4) {
		this.model = arg1.model;
		this.zoom2d = arg1.zoom2d;
		this.xan2d = arg1.xan2d;
		this.yan2d = arg1.yan2d;
		this.field8641 = arg1.field8641;
		this.xof2d = arg1.xof2d;
		this.yof2d = arg1.yof2d;
		ObjType var6 = DerivedObjType.CERT == arg0 ? arg1 : arg2;
		this.recol_s = var6.recol_s;
		this.recol_d = var6.recol_d;
		this.field8633 = var6.field8633;
		this.field8634 = var6.field8634;
		this.field8635 = var6.field8635;
		this.name = arg2.name;
		this.members = arg2.members;
		if (DerivedObjType.CERT == arg0) {
			this.cost = arg2.cost;
			this.stackable = 1;
			if (arg2.field8688) {
				this.field8687 = false;
			} else {
				this.field8687 = arg2.field8687;
			}
		} else if (DerivedObjType.SHARD == arg0) {
			this.name = arg2.field8678;
			this.cost = (int) Math.floor((double) (arg2.cost / arg2.field8679));
			this.stackable = 1;
			this.field8645 = arg2.field8645;
			this.field8687 = arg2.field8687;
			this.field8628 = arg1.field8628;
			this.field8649 = arg1.field8649;
			this.field8619 = arg1.field8619;
			this.iops = new String[5];
			this.iops[0] = LocalisedText.field8958.method15021(arg4);
			this.iops[4] = arg3.method15021(arg4);
		} else {
			this.cost = 0;
			this.stackable = arg2.stackable;
			this.field8687 = false;
			this.field8651 = arg2.field8651;
			this.field8652 = arg2.field8652;
			this.field8653 = arg2.field8653;
			this.manwear = arg2.manwear;
			this.manwear2 = arg2.manwear2;
			this.manwear3 = arg2.manwear3;
			this.womanwear = arg2.womanwear;
			this.womanwear2 = arg2.womanwear2;
			this.womanwear3 = arg2.womanwear3;
			this.field8632 = arg2.field8632;
			this.field8640 = arg2.field8640;
			this.field8660 = arg2.field8660;
			this.field8670 = arg2.field8670;
			this.field8664 = arg2.field8664;
			this.field8665 = arg2.field8665;
			this.manhead = arg2.manhead;
			this.manhead2 = arg2.manhead2;
			this.womanhead = arg2.womanhead;
			this.womanhead2 = arg2.womanhead2;
			this.field8628 = arg2.field8628;
			this.field8685 = arg2.field8685;
			this.ops = arg2.ops;
			this.params = arg2.params;
			this.iops = new String[5];
			if (arg2.iops != null) {
				for (int var7 = 0; var7 < 4; var7++) {
					this.iops[var7] = arg2.iops[var7];
				}
			}
			this.iops[4] = arg3.method15021(arg4);
			this.field8698 = false;
		}
	}

	@ObfuscatedName("abv.p(Labv;Labv;Lzt;S)V")
	public void toCertTemplate(ObjType from, ObjType to, Language language) {
		this.toTemplate(DerivedObjType.CERT, from, to, null, language);
	}

	@ObfuscatedName("abv.d(Labv;Labv;Lzt;I)V")
	public void toLendTemplate(ObjType from, ObjType to, Language language) {
		this.toTemplate(DerivedObjType.LEND, from, to, LocalisedText.LENT_ITEM_RETURN, language);
	}

	@ObfuscatedName("abv.c(Labv;Labv;Lzt;I)V")
	public void toBoughtTemplate(ObjType from, ObjType to, Language language) {
		this.toTemplate(DerivedObjType.BOUGHT, from, to, LocalisedText.BOUGHT_ITEM_DISCARD, language);
	}

	@ObfuscatedName("abv.r(Labv;Labv;Lzt;I)V")
	public void toShardTemplate(ObjType from, ObjType to, Language language) {
		this.toTemplate(DerivedObjType.SHARD, from, to, LocalisedText.DROP, language);
	}

	@ObfuscatedName("abv.v(Ldh;IILxg;Laaq;IIIII)Ldo;")
	public final Model method14644(Renderer arg0, int arg1, int arg2, PlayerModel arg3, AnimationWrapper arg4, int arg5, int arg6, int arg7, int arg8) {
		if (this.countobj != null && arg2 > 1) {
			int var10 = -1;
			for (int var11 = 0; var11 < 10; var11++) {
				if (arg2 >= this.countco[var11] && this.countco[var11] != 0) {
					var10 = this.countobj[var11];
				}
			}
			if (var10 != -1) {
				return ((ObjType) this.list.list(var10)).method14644(arg0, arg1, 1, arg3, arg4, arg5, arg6, arg7, arg8);
			}
		}
		int var12 = arg1;
		if (arg4 != null) {
			var12 = arg1 | arg4.method14358();
		}
		WeightedCache var13 = this.factory.modelCache;
		Model var14;
		synchronized (this.factory.modelCache) {
			var14 = (Model) this.factory.modelCache.method2930((long) (this.id | arg0.field1595 << 29));
		}
		if (var14 == null || arg0.method2394(var14.method1691(), var12) != 0) {
			if (var14 != null) {
				var12 = arg0.method2213(var12, var14.method1691());
			}
			int var16 = var12;
			if (this.field8634 != null) {
				var16 = var12 | 0x8000;
			}
			if (this.recol_s != null || arg3 != null) {
				var16 |= 0x4000;
			}
			if (this.field8686 != 128) {
				var16 |= 0x1;
			}
			if (this.field8681 != 128) {
				var16 |= 0x2;
			}
			if (this.field8682 != 128) {
				var16 |= 0x4;
			}
			ModelUnlit var17 = ModelUnlit.method1931(this.factory.js5, this.model, 0);
			if (var17 == null) {
				return null;
			}
			if (var17.field1372 < 13) {
				var17.method1947(2);
			}
			var14 = arg0.method2211(var17, var16, this.factory.field8611, this.field8683 + 64, this.field8624 + 850);
			if (this.field8686 != 128 || this.field8681 != 128 || this.field8682 != 128) {
				var14.method1699(this.field8686, this.field8681, this.field8682);
			}
			if (this.recol_s != null) {
				for (int var18 = 0; var18 < this.recol_s.length; var18++) {
					if (this.field8633 == null || var18 >= this.field8633.length) {
						var14.method1859(this.recol_s[var18], this.recol_d[var18]);
					} else {
						var14.method1859(this.recol_s[var18], clientpalette[this.field8633[var18] & 0xFF]);
					}
				}
			}
			if (this.field8634 != null) {
				for (int var19 = 0; var19 < this.field8634.length; var19++) {
					var14.method1744(this.field8634[var19], this.field8635[var19]);
				}
			}
			if (arg3 != null) {
				int var20 = 0;
				label133: while (true) {
					if (var20 >= 10) {
						int var22 = 0;
						while (true) {
							if (var22 >= 10) {
								break label133;
							}
							for (int var23 = 0; var23 < PlayerModel.field10766[var22].length; var23++) {
								if (arg3.field7895[var22] < PlayerModel.field9259[var22][var23].length) {
									var14.method1744(PlayerModel.field10766[var22][var23], PlayerModel.field9259[var22][var23][arg3.field7895[var22]]);
								}
							}
							var22++;
						}
					}
					for (int var21 = 0; var21 < PlayerModel.field7577[var20].length; var21++) {
						if (arg3.field7894[var20] < PlayerModel.field1434[var20][var21].length) {
							var14.method1859(PlayerModel.field7577[var20][var21], PlayerModel.field1434[var20][var21][arg3.field7894[var20]]);
						}
					}
					var20++;
				}
			}
			var14.method1690(var12);
			WeightedCache var24 = this.factory.modelCache;
			synchronized (this.factory.modelCache) {
				this.factory.modelCache.method2921(var14, (long) (this.id | arg0.field1595 << 29));
			}
		}
		if (arg4 != null || arg8 != 0) {
			var14 = var14.method1773((byte) 1, var12, true);
			if (arg4 != null) {
				arg4.method14359(var14, 0);
			}
			if (arg8 != 0) {
				var14.method1745(arg5, arg6, arg7, arg8);
			}
		}
		var14.method1690(arg1);
		return var14;
	}

	@ObfuscatedName("abv.o(II)Labv;")
	public ObjType method14645(int arg0) {
		if (this.countobj != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= this.countco[var3] && this.countco[var3] != 0) {
					var2 = this.countobj[var3];
				}
			}
			if (var2 != -1) {
				return (ObjType) this.list.list(var2);
			}
		}
		return this;
	}

	@ObfuscatedName("abv.s(Ldh;Ldh;IIIZILeu;Lxg;Lws;B)[I")
	public int[] method14646(Renderer arg0, Renderer arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, Font arg7, PlayerModel arg8, GraphicsDefaults arg9) {
		ModelUnlit var11 = ModelUnlit.method1931(this.factory.js5, this.model, 0);
		if (var11 == null) {
			return null;
		}
		if (var11.field1372 < 13) {
			var11.method1947(2);
		}
		if (this.recol_s != null) {
			for (int var12 = 0; var12 < this.recol_s.length; var12++) {
				if (this.field8633 == null || var12 >= this.field8633.length) {
					var11.method1943(this.recol_s[var12], this.recol_d[var12]);
				} else {
					var11.method1943(this.recol_s[var12], clientpalette[this.field8633[var12] & 0xFF]);
				}
			}
		}
		if (this.field8634 != null) {
			for (int var13 = 0; var13 < this.field8634.length; var13++) {
				var11.method1937(this.field8634[var13], this.field8635[var13]);
			}
		}
		if (arg8 != null) {
			for (int var14 = 0; var14 < 10; var14++) {
				for (int var15 = 0; var15 < PlayerModel.field7577[var14].length; var15++) {
					if (arg8.field7894[var14] < PlayerModel.field1434[var14][var15].length) {
						var11.method1943(PlayerModel.field7577[var14][var15], PlayerModel.field1434[var14][var15][arg8.field7894[var14]]);
					}
				}
			}
			for (int var16 = 0; var16 < 10; var16++) {
				for (int var17 = 0; var17 < PlayerModel.field10766[var16].length; var17++) {
					if (arg8.field7895[var16] < PlayerModel.field9259[var16][var17].length) {
						var11.method1937(PlayerModel.field10766[var16][var17], PlayerModel.field9259[var16][var17][arg8.field7895[var16]]);
					}
				}
			}
		}
		int var18 = 2048;
		boolean var19 = false;
		if (this.field8686 != 128 || this.field8681 != 128 || this.field8682 != 128) {
			var19 = true;
			var18 |= 0x7;
		}
		Model var20 = arg0.method2211(var11, var18, 64, this.field8683 + 64, this.field8624 + 768);
		if (!var20.method1746()) {
			return null;
		}
		if (var19) {
			var20.method1699(this.field8686, this.field8681, this.field8682);
		}
		Sprite var21 = null;
		if (this.certtemplate != -1) {
			var21 = this.factory.method14617(arg0, arg1, this.certlink, 10, 1, 0, true, true, 0, arg7, arg8, arg9, this.list);
			if (var21 == null) {
				return null;
			}
		} else if (this.field8675 != -1) {
			var21 = this.factory.method14617(arg0, arg1, this.field8674, arg2, arg3, arg4, false, true, 0, arg7, arg8, arg9, this.list);
			if (var21 == null) {
				return null;
			}
		} else if (this.field8694 != -1) {
			var21 = this.factory.method14617(arg0, arg1, this.field8693, arg2, arg3, arg4, false, true, 0, arg7, arg8, arg9, this.list);
			if (var21 == null) {
				return null;
			}
		} else if (this.field8677 != -1) {
			var21 = this.factory.method14617(arg0, arg1, this.field8676, 10, 1, 0, true, true, 0, arg7, arg8, arg9, this.list);
			if (var21 == null) {
				return null;
			}
		}
		int var22;
		if (arg5) {
			var22 = (int) ((double) this.zoom2d * 1.5D) << 2;
		} else if (arg3 == 2) {
			var22 = (int) ((double) this.zoom2d * 1.04D) << 2;
		} else {
			var22 = this.zoom2d << 2;
		}
		Matrix4x4 var23 = arg0.method2355();
		Matrix4x4 var24 = arg0.method2208();
		var24.method6703(16.0F, 16.0F, 512.0F, 512.0F, 50.0F, 2.14748365E9F, (float) arg0.method2135().method1627(), (float) arg0.method2135().method1628());
		arg0.method2220(var24);
		arg0.method2164(0, 0, arg0.method2135().method1627(), arg0.method2135().method1628());
		Matrix4x3 var25 = new Matrix4x3();
		arg0.method2217(var25);
		arg0.method2222((float) (Math.random() / 10.0D) + 0.95F);
		arg0.method2223(16777215, (float) (Math.random() / 10.0D) + 0.95F, (float) (Math.random() / 10.0D) + 0.95F, -50.0F, -10.0F, -50.0F);
		Matrix4x3 var26 = arg0.method2209();
		var26.method6372(0.0F, 0.0F, 1.0F, Trig1.method6277(-this.field8641 << 3));
		var26.method6307(0.0F, 1.0F, 0.0F, Trig1.method6277(this.yan2d << 3));
		var26.method6315((float) (this.xof2d << 2), (float) ((Trig1.field4270[this.xan2d << 3] * var22 >> 14) - var20.method1748() / 2 + (this.yof2d << 2)), (float) ((this.yof2d << 2) + (Trig1.field4272[this.xan2d << 3] * var22 >> 14)));
		var26.method6307(1.0F, 0.0F, 0.0F, Trig1.method6277(this.xan2d << 3));
		arg0.method2168(0, 0, 36, 32);
		arg0.method2475(2, 0);
		arg0.method2354(0, 0, 36, 32, 0, 0);
		arg0.method2572(0, -1, 0);
		var20.method1813(var26, null, 1);
		arg0.method2220(var23);
		int[] var27 = arg0.method2149(0, 0, 36, 32);
		if (arg3 >= 1) {
			var27 = this.method14636(var27, -16777214);
			if (arg3 >= 2) {
				var27 = this.method14636(var27, -1);
			}
		}
		if (arg4 != 0) {
			this.method14648(var27, arg4);
		}
		if (this.field8675 != -1) {
			var21.method1439(0, 0);
		} else if (this.field8694 != -1) {
			var21.method1439(0, 0);
		}
		arg0.method2199(var27, 0, 36, 36, 32).method1439(0, 0);
		if (this.certtemplate != -1) {
			var21.method1439(0, 0);
		}
		if (this.field8677 != -1) {
			var21.method1439(0, 0);
		}
		if (arg6 == 1 || arg6 == 2 && (this.stackable == 1 || arg2 != 1) && arg2 != -1) {
			arg7.method2681(method4655(arg2, this.factory.languageId, arg9), 0, 9, -256, -16777215);
		}
		int[] var28 = arg0.method2149(0, 0, 36, 32);
		for (int var29 = 0; var29 < var28.length; var29++) {
			if ((var28[var29] & 0xFFFFFF) == 0) {
				var28[var29] = 0;
			} else {
				var28[var29] |= 0xFF000000;
			}
		}
		return var28;
	}

	@ObfuscatedName("abv.y([III)[I")
	public int[] method14636(int[] arg0, int arg1) {
		int[] var3 = new int[1152];
		int var4 = 0;
		for (int var5 = 0; var5 < 32; var5++) {
			for (int var6 = 0; var6 < 36; var6++) {
				int var7 = arg0[var4];
				if (var7 == 0) {
					if (var6 > 0 && arg0[var4 - 1] != 0) {
						var7 = arg1;
					} else if (var5 > 0 && arg0[var4 - 36] != 0) {
						var7 = arg1;
					} else if (var6 < 35 && arg0[var4 + 1] != 0) {
						var7 = arg1;
					} else if (var5 < 31 && arg0[var4 + 36] != 0) {
						var7 = arg1;
					}
				}
				var3[var4++] = var7;
			}
		}
		return var3;
	}

	@ObfuscatedName("abv.q([III)V")
	public void method14648(int[] arg0, int arg1) {
		for (int var3 = 31; var3 > 0; var3--) {
			int var4 = var3 * 36;
			for (int var5 = 35; var5 > 0; var5--) {
				if (arg0[var4 + var5] == 0 && arg0[var4 + var5 - 1 - 36] != 0) {
					arg0[var4 + var5] = arg1;
				}
			}
		}
	}

	@ObfuscatedName("jf.x(ILzt;Lws;I)Ljava/lang/String;")
	public static String method4655(int arg0, Language arg1, GraphicsDefaults arg2) {
		if (arg0 < 100000) {
			return method5153(arg2.field7742) + arg0 + field8699;
		} else if (arg0 < 10000000) {
			return method5153(arg2.field7743) + arg0 / 1000 + LocalisedText.THOUSAND_SHORT.method15021(arg1) + field8699;
		} else {
			return method5153(arg2.field7744) + arg0 / 1000000 + LocalisedText.MILLION_SHORT.method15021(arg1) + field8699;
		}
	}

	@ObfuscatedName("ku.b(IB)Ljava/lang/String;")
	public static String method5153(int arg0) {
		return "<col=" + Integer.toHexString(arg0) + ">";
	}

	@ObfuscatedName("abv.h(ZLabw;I)Z")
	public final boolean method14649(boolean arg0, ObjTypeCustomisation arg1) {
		int var3;
		int var4;
		int var5;
		if (arg0) {
			if (arg1 == null || arg1.field8708 == null) {
				var3 = this.womanwear;
				var4 = this.womanwear2;
				var5 = this.womanwear3;
			} else {
				var3 = arg1.field8708[0];
				var4 = arg1.field8708[1];
				var5 = arg1.field8708[2];
			}
		} else if (arg1 == null || arg1.field8710 == null) {
			var3 = this.manwear;
			var4 = this.manwear2;
			var5 = this.manwear3;
		} else {
			var3 = arg1.field8710[0];
			var4 = arg1.field8710[1];
			var5 = arg1.field8710[2];
		}
		if (var3 == -1) {
			return true;
		}
		boolean var6 = true;
		if (!this.factory.js5.requestdownload(var3, 0)) {
			var6 = false;
		}
		if (var4 != -1 && !this.factory.js5.requestdownload(var4, 0)) {
			var6 = false;
		}
		if (var5 != -1 && !this.factory.js5.requestdownload(var5, 0)) {
			var6 = false;
		}
		return var6;
	}

	@ObfuscatedName("abv.a(ZLabw;I)Ldq;")
	public final ModelUnlit method14650(boolean arg0, ObjTypeCustomisation arg1) {
		int var3;
		int var4;
		int var5;
		if (arg0) {
			if (arg1 == null || arg1.field8708 == null) {
				var3 = this.womanwear;
				var4 = this.womanwear2;
				var5 = this.womanwear3;
			} else {
				var3 = arg1.field8708[0];
				var4 = arg1.field8708[1];
				var5 = arg1.field8708[2];
			}
		} else if (arg1 == null || arg1.field8710 == null) {
			var3 = this.manwear;
			var4 = this.manwear2;
			var5 = this.manwear3;
		} else {
			var3 = arg1.field8710[0];
			var4 = arg1.field8710[1];
			var5 = arg1.field8710[2];
		}
		if (var3 == -1) {
			return null;
		}
		ModelUnlit var6 = ModelUnlit.method1931(this.factory.js5, var3, 0);
		if (var6 == null) {
			return null;
		}
		if (var6.field1372 < 13) {
			var6.method1947(2);
		}
		if (var4 != -1) {
			ModelUnlit var7 = ModelUnlit.method1931(this.factory.js5, var4, 0);
			if (var7.field1372 < 13) {
				var7.method1947(2);
			}
			if (var5 == -1) {
				ModelUnlit[] var10 = new ModelUnlit[] { var6, var7 };
				var6 = new ModelUnlit(var10, 2);
			} else {
				ModelUnlit var8 = ModelUnlit.method1931(this.factory.js5, var5, 0);
				if (var8.field1372 < 13) {
					var8.method1947(2);
				}
				ModelUnlit[] var9 = new ModelUnlit[] { var6, var7, var8 };
				var6 = new ModelUnlit(var9, 3);
			}
		}
		if (!arg0 && (this.field8632 != 0 || this.field8660 != 0 || this.field8664 != 0)) {
			var6.method1945(this.field8632, this.field8660, this.field8664);
		}
		if (arg0 && (this.field8640 != 0 || this.field8670 != 0 || this.field8665 != 0)) {
			var6.method1945(this.field8640, this.field8670, this.field8665);
		}
		if (this.recol_s != null) {
			short[] var11;
			if (arg1 == null || arg1.field8714 == null) {
				var11 = this.recol_d;
			} else {
				var11 = arg1.field8714;
			}
			for (int var12 = 0; var12 < this.recol_s.length; var12++) {
				var6.method1943(this.recol_s[var12], var11[var12]);
			}
		}
		if (this.field8634 != null) {
			short[] var13;
			if (arg1 == null || arg1.field8715 == null) {
				var13 = this.field8635;
			} else {
				var13 = arg1.field8715;
			}
			for (int var14 = 0; var14 < this.field8634.length; var14++) {
				var6.method1937(this.field8634[var14], var13[var14]);
			}
		}
		return var6;
	}

	@ObfuscatedName("abv.g(ZLabw;I)Z")
	public final boolean method14651(boolean arg0, ObjTypeCustomisation arg1) {
		int var3;
		int var4;
		if (arg0) {
			if (arg1 == null || arg1.field8713 == null) {
				var3 = this.womanhead;
				var4 = this.womanhead2;
			} else {
				var3 = arg1.field8713[0];
				var4 = arg1.field8713[1];
			}
		} else if (arg1 == null || arg1.field8709 == null) {
			var3 = this.manhead;
			var4 = this.manhead2;
		} else {
			var3 = arg1.field8709[0];
			var4 = arg1.field8709[1];
		}
		if (var3 == -1) {
			return true;
		}
		boolean var5 = true;
		if (!this.factory.js5.requestdownload(var3, 0)) {
			var5 = false;
		}
		if (var4 != -1 && !this.factory.js5.requestdownload(var4, 0)) {
			var5 = false;
		}
		return var5;
	}

	@ObfuscatedName("abv.i(ZLabw;B)Ldq;")
	public final ModelUnlit method14652(boolean arg0, ObjTypeCustomisation arg1) {
		int var3;
		int var4;
		if (arg0) {
			if (arg1 == null || arg1.field8713 == null) {
				var3 = this.womanhead;
				var4 = this.womanhead2;
			} else {
				var3 = arg1.field8713[0];
				var4 = arg1.field8713[1];
			}
		} else if (arg1 == null || arg1.field8709 == null) {
			var3 = this.manhead;
			var4 = this.manhead2;
		} else {
			var3 = arg1.field8709[0];
			var4 = arg1.field8709[1];
		}
		if (var3 == -1) {
			return null;
		}
		ModelUnlit var5 = ModelUnlit.method1931(this.factory.js5, var3, 0);
		if (var5.field1372 < 13) {
			var5.method1947(2);
		}
		if (var4 != -1) {
			ModelUnlit var6 = ModelUnlit.method1931(this.factory.js5, var4, 0);
			if (var6.field1372 < 13) {
				var6.method1947(2);
			}
			ModelUnlit[] var7 = new ModelUnlit[] { var5, var6 };
			var5 = new ModelUnlit(var7, 2);
		}
		if (this.recol_s != null) {
			short[] var8;
			if (arg1 == null || arg1.field8714 == null) {
				var8 = this.recol_d;
			} else {
				var8 = arg1.field8714;
			}
			for (int var9 = 0; var9 < this.recol_s.length; var9++) {
				var5.method1943(this.recol_s[var9], var8[var9]);
			}
		}
		if (this.field8634 != null) {
			short[] var10;
			if (arg1 == null || arg1.field8715 == null) {
				var10 = this.field8635;
			} else {
				var10 = arg1.field8715;
			}
			for (int var11 = 0; var11 < this.field8634.length; var11++) {
				var5.method1937(this.field8634[var11], var10[var11]);
			}
		}
		return var5;
	}

	@ObfuscatedName("abv.j(III)I")
	public int method14677(int arg0, int arg1) {
		if (this.params == null) {
			return arg1;
		} else {
			IntWrapper var3 = (IntWrapper) this.params.method14495((long) arg0);
			return var3 == null ? arg1 : var3.field11442;
		}
	}

	@ObfuscatedName("abv.t(ILjava/lang/String;B)Ljava/lang/String;")
	public String method14654(int arg0, String arg1) {
		if (this.params == null) {
			return arg1;
		} else {
			ObjectWrapper var3 = (ObjectWrapper) this.params.method14495((long) arg0);
			return var3 == null ? arg1 : (String) var3.field11436;
		}
	}

	@ObfuscatedName("abv.ae(II)I")
	public int method14642(int arg0) {
		return this.field8649 == null ? -1 : this.field8649[arg0];
	}

	@ObfuscatedName("abv.ag(II)I")
	public int method14684(int arg0) {
		return this.field8619 == null ? -1 : this.field8619[arg0];
	}
}
