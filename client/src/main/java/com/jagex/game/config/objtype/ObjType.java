package com.jagex.game.config.objtype;

import com.jagex.core.constants.Language;
import com.jagex.core.datastruct.IntNode;
import com.jagex.core.datastruct.HashTable;
import com.jagex.core.datastruct.Node;
import com.jagex.core.datastruct.SoftLruHashTable;
import com.jagex.core.io.Packet;
import com.jagex.game.client.LocalisedText;
import com.jagex.game.config.ConfigType;
import com.jagex.game.config.ConfigTypeList;
import com.jagex.game.config.defaults.GraphicsDefaults;
import com.jagex.game.config.paramtype.ParamType;
import com.jagex.game.world.entity.ObjTypeCustomisation;
import com.jagex.game.world.entity.ObjectNode;
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
	public ConfigTypeList myList;

	@ObfuscatedName("abv.u")
	public ObjTypeFactory factory;

	@ObfuscatedName("abv.z")
	public int id;

	@ObfuscatedName("abv.p")
	public int category = -1;

	@ObfuscatedName("abv.d")
	public int mesh;

	@ObfuscatedName("abv.c")
	public String name = "null";

	@ObfuscatedName("abv.r")
	public short[] recol_s;

	@ObfuscatedName("abv.v")
	public short[] recol_d;

	@ObfuscatedName("abv.o")
	public byte[] recol_d_palette;

	@ObfuscatedName("abv.s")
	public short[] retex_s;

	@ObfuscatedName("abv.y")
	public short[] retex_d;

	@ObfuscatedName("abv.q")
	public byte[] recolindices;

	@ObfuscatedName("abv.x")
	public byte[] retexindices;

	@ObfuscatedName("abv.b")
	public int zoom2d = 2000;

	@ObfuscatedName("abv.h")
	public int xan2d = 0;

	@ObfuscatedName("abv.a")
	public int yan2d = 0;

	@ObfuscatedName("abv.g")
	public int zan2d = 0;

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
	public String[] op;

	@ObfuscatedName("abv.al")
	public String[] iop;

	@ObfuscatedName("abv.ac")
	public int[] cursor;

	@ObfuscatedName("abv.ai")
	public int[] icursor;

	@ObfuscatedName("abv.aw")
	public int wearpos = -1;

	@ObfuscatedName("abv.as")
	public int wearpos2 = -1;

	@ObfuscatedName("abv.at")
	public int wearpos3 = -1;

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
	public int manwearxoff = 0;

	@ObfuscatedName("abv.av")
	public int womanwearxoff = 0;

	@ObfuscatedName("abv.ao")
	public int manwearyoff = 0;

	@ObfuscatedName("abv.aj")
	public int womanwearyoff = 0;

	@ObfuscatedName("abv.ay")
	public int manwearzoff = 0;

	@ObfuscatedName("abv.ab")
	public int womanwearzoff = 0;

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
	public int lentlink = -1;

	@ObfuscatedName("abv.bx")
	public int lenttemplate = -1;

	@ObfuscatedName("abv.bd")
	public int shardlink = -1;

	@ObfuscatedName("abv.bc")
	public int shardtemplate = -1;

	@ObfuscatedName("abv.bi")
	public String shardname = "null";

	@ObfuscatedName("abv.bn")
	public int shardcount = 0;

	@ObfuscatedName("abv.bt")
	public int resizex = 128;

	@ObfuscatedName("abv.bq")
	public int resizey = 128;

	@ObfuscatedName("abv.bm")
	public int resizez = 128;

	@ObfuscatedName("abv.bb")
	public int ambient = 0;

	@ObfuscatedName("abv.be")
	public int contrast = 0;

	@ObfuscatedName("abv.by")
	public int team = 0;

	@ObfuscatedName("abv.bu")
	public boolean stockmarket = false;

	@ObfuscatedName("abv.bw")
	public boolean tradeable = false;

	@ObfuscatedName("abv.bo")
	public boolean cert_not_tradeable = false;

	@ObfuscatedName("abv.bz")
	public int dummyitem = 0;

	@ObfuscatedName("abv.bv")
	public HashTable params;

	@ObfuscatedName("abv.br")
	public int[] quests;

	@ObfuscatedName("abv.bg")
	public int picksizeshift = 0;

	@ObfuscatedName("abv.ba")
	public int boughtlink = -1;

	@ObfuscatedName("abv.bp")
	public int boughttemplate = -1;

	@ObfuscatedName("abv.bj")
	public boolean minimenu_colour_overridden = false;

	@ObfuscatedName("abv.bs")
	public int minimenu_colour;

	@ObfuscatedName("abv.cl")
	public boolean field8697 = false;

	@ObfuscatedName("abv.cg")
	public boolean placeholder = true;

	@ObfuscatedName("abv.ce")
	public static String COL_TAG_END = "</col>";

	public ObjType(int id, ConfigTypeList objs, ObjTypeFactory factory) {
		this.id = id;
		this.myList = objs;
		this.factory = factory;
		this.op = (String[]) this.factory.defaultops.clone();
		this.iop = (String[]) this.factory.defaultiops.clone();
	}

	@ObfuscatedName("abv.n(I)V")
	public void postDecode() {
		if (this.certtemplate != -1) {
			this.genCert((ObjType) this.myList.list(this.certtemplate), (ObjType) this.myList.list(this.certlink), this.factory.languageId);
		} else if (this.lenttemplate != -1) {
			this.genLent((ObjType) this.myList.list(this.lenttemplate), (ObjType) this.myList.list(this.lentlink), this.factory.languageId);
		} else if (this.boughttemplate != -1) {
			this.genBought((ObjType) this.myList.list(this.boughttemplate), (ObjType) this.myList.list(this.boughtlink), this.factory.languageId);
		} else if (this.shardtemplate != -1) {
			this.genShard((ObjType) this.myList.list(this.shardtemplate), (ObjType) this.myList.list(this.shardlink), this.factory.languageId);
		}
		if (this.dummyitem != 0) {
			this.tradeable = false;
		}
		if (this.factory.allowMembers || !this.members) {
			return;
		}
		this.team = 0;
		this.op = this.factory.defaultops;
		this.iop = this.factory.defaultiops;
		this.stockmarket = false;
		this.quests = null;
		this.tradeable = false;
		if (this.params == null) {
			return;
		}
		boolean var1 = false;
		for (Node param = this.params.head(); param != null; param = this.params.next()) {
			ParamType paramType = (ParamType) this.factory.paramTL.list((int) param.nodeId);
			if (paramType.autodisable) {
				param.unlink();
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
		this.tradeable = true;
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
			this.mesh = buf.gSmart2or4null();
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
			this.stackable = 1; // always
		} else if (code == 12) {
			this.cost = buf.g4s();
		} else if (code == 13) {
			this.wearpos = buf.g1();
		} else if (code == 14) {
			this.wearpos2 = buf.g1();
		} else if (code == 15) {
			this.tradeable = false;
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
			this.wearpos3 = buf.g1();
		} else if (code >= 30 && code < 35) {
			this.op[code - 30] = buf.gjstr();
		} else if (code >= 35 && code < 40) {
			this.iop[code - 35] = buf.gjstr();
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
			for (int index = 0; index < length; index++) {
				this.retex_s[index] = (short) buf.g2();
				this.retex_d[index] = (short) buf.g2();
			}
		} else if (code == 42) {
			int length = buf.g1();
			this.recol_d_palette = new byte[length];
			for (int index = 0; index < length; index++) {
				this.recol_d_palette[index] = buf.g1b();
			}
		} else if (code == 43) {
			this.minimenu_colour = buf.g4s();
			this.minimenu_colour_overridden = true;
		} else if (code == 44) {
			int var9 = buf.g2();
			int length = 0;
			for (int var11 = var9; var11 > 0; var11 >>= 0x1) {
				length++;
			}
			this.recolindices = new byte[length];
			byte var12 = 0;
			for (int index = 0; index < length; index++) {
				if ((var9 & 0x1 << index) > 0) {
					this.recolindices[index] = var12++;
				} else {
					this.recolindices[index] = -1;
				}
			}
		} else if (code == 45) {
			int var14 = buf.g2();
			int length = 0;
			for (int var16 = var14; var16 > 0; var16 >>= 0x1) {
				length++;
			}
			this.retexindices = new byte[length];
			byte var17 = 0;
			for (int index = 0; index < length; index++) {
				if ((var14 & 0x1 << index) > 0) {
					this.retexindices[index] = var17++;
				} else {
					this.retexindices[index] = -1;
				}
			}
		} else if (code == 65) {
			this.stockmarket = true;
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
			this.category = buf.g2();
		} else if (code == 95) {
			this.zan2d = buf.g2();
		} else if (code == 96) {
			this.dummyitem = buf.g1();
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
			this.resizex = buf.g2();
		} else if (code == 111) {
			this.resizey = buf.g2();
		} else if (code == 112) {
			this.resizez = buf.g2();
		} else if (code == 113) {
			this.ambient = buf.g1b();
		} else if (code == 114) {
			this.contrast = buf.g1b() * 5;
		} else if (code == 115) {
			this.team = buf.g1();
		} else if (code == 121) {
			this.lentlink = buf.g2();
		} else if (code == 122) {
			this.lenttemplate = buf.g2();
		} else if (code == 125) {
			this.manwearxoff = buf.g1b() << 2;
			this.manwearyoff = buf.g1b() << 2;
			this.manwearzoff = buf.g1b() << 2;
		} else if (code == 126) {
			this.womanwearxoff = buf.g1b() << 2;
			this.womanwearyoff = buf.g1b() << 2;
			this.womanwearzoff = buf.g1b() << 2;
		} else if (code == 127 || code == 128 || code == 129 || code == 130) {
			buf.g1();
			buf.g2();
		} else if (code == 132) {
			int length = buf.g1();
			this.quests = new int[length];
			for (int index = 0; index < length; index++) {
				this.quests[index] = buf.g2();
			}
		} else if (code == 134) {
			this.picksizeshift = buf.g1();
		} else if (code == 139) {
			this.boughtlink = buf.g2();
		} else if (code == 140) {
			this.boughttemplate = buf.g2();
		} else if (code >= 142 && code < 147) {
			if (this.cursor == null) {
				this.cursor = new int[6];
				Arrays.fill(this.cursor, -1);
			}
			this.cursor[code - 142] = buf.g2();
		} else if (code >= 150 && code < 155) {
			if (this.icursor == null) {
				this.icursor = new int[5];
				Arrays.fill(this.icursor, -1);
			}
			this.icursor[code - 150] = buf.g2();
		} else if (code != 156) {
			if (code == 157) {
				this.field8697 = true;
			} else if (code == 161) {
				this.shardlink = buf.g2();
			} else if (code == 162) {
				this.shardtemplate = buf.g2();
			} else if (code == 163) {
				this.shardcount = buf.g2();
			} else if (code == 164) {
				this.shardname = buf.gjstr();
			} else if (code == 165) {
				this.stackable = 2; // never
			} else if (code == 167) {
				this.cert_not_tradeable = true;
			} else if (code == 168) {
				this.placeholder = false;
			} else if (code == 249) {
				int length = buf.g1();
				if (this.params == null) {
					int var22 = IntMath.bitceil(length);
					this.params = new HashTable(var22);
				}
				for (int index = 0; index < length; index++) {
					boolean isString = buf.g1() == 1;
					int var25 = buf.g3();
					Node var26;
					if (isString) {
						var26 = new ObjectNode(buf.gjstr());
					} else {
						var26 = new IntNode(buf.g4s());
					}
					this.params.put(var26, (long) var25);
				}
			}
		}
	}

	@ObfuscatedName("abv.z(Labq;Labv;Labv;Lacz;Lzt;I)V")
	public void gen(DerivedObjType derived, ObjType from, ObjType to, LocalisedText localisedText, Language language) {
		this.mesh = from.mesh;
		this.zoom2d = from.zoom2d;
		this.xan2d = from.xan2d;
		this.yan2d = from.yan2d;
		this.zan2d = from.zan2d;
		this.xof2d = from.xof2d;
		this.yof2d = from.yof2d;
		ObjType objType = DerivedObjType.CERT == derived ? from : to;
		this.recol_s = objType.recol_s;
		this.recol_d = objType.recol_d;
		this.recol_d_palette = objType.recol_d_palette;
		this.retex_s = objType.retex_s;
		this.retex_d = objType.retex_d;
		this.name = to.name;
		this.members = to.members;
		if (DerivedObjType.CERT == derived) {
			this.cost = to.cost;
			this.stackable = 1;
			if (to.cert_not_tradeable) {
				this.tradeable = false;
			} else {
				this.tradeable = to.tradeable;
			}
		} else if (DerivedObjType.SHARD == derived) {
			this.name = to.shardname;
			this.cost = (int) Math.floor((double) (to.cost / to.shardcount));
			this.stackable = 1;
			this.stockmarket = to.stockmarket;
			this.tradeable = to.tradeable;
			this.category = from.category;
			this.cursor = from.cursor;
			this.icursor = from.icursor;
			this.iop = new String[5];
			this.iop[0] = LocalisedText.SHARD_ITEM_COMBINE.forLang(language);
			this.iop[4] = localisedText.forLang(language);
		} else {
			this.cost = 0;
			this.stackable = to.stackable;
			this.tradeable = false;
			this.wearpos = to.wearpos;
			this.wearpos2 = to.wearpos2;
			this.wearpos3 = to.wearpos3;
			this.manwear = to.manwear;
			this.manwear2 = to.manwear2;
			this.manwear3 = to.manwear3;
			this.womanwear = to.womanwear;
			this.womanwear2 = to.womanwear2;
			this.womanwear3 = to.womanwear3;
			this.manwearxoff = to.manwearxoff;
			this.womanwearxoff = to.womanwearxoff;
			this.manwearyoff = to.manwearyoff;
			this.womanwearyoff = to.womanwearyoff;
			this.manwearzoff = to.manwearzoff;
			this.womanwearzoff = to.womanwearzoff;
			this.manhead = to.manhead;
			this.manhead2 = to.manhead2;
			this.womanhead = to.womanhead;
			this.womanhead2 = to.womanhead2;
			this.category = to.category;
			this.team = to.team;
			this.op = to.op;
			this.params = to.params;
			this.iop = new String[5];
			if (to.iop != null) {
				for (int index = 0; index < 4; index++) {
					this.iop[index] = to.iop[index];
				}
			}
			this.iop[4] = localisedText.forLang(language);
			this.placeholder = false;
		}
	}

	@ObfuscatedName("abv.p(Labv;Labv;Lzt;S)V")
	public void genCert(ObjType from, ObjType to, Language language) {
		this.gen(DerivedObjType.CERT, from, to, null, language);
	}

	@ObfuscatedName("abv.d(Labv;Labv;Lzt;I)V")
	public void genLent(ObjType from, ObjType to, Language language) {
		this.gen(DerivedObjType.LENT, from, to, LocalisedText.LENT_ITEM_RETURN, language);
	}

	@ObfuscatedName("abv.c(Labv;Labv;Lzt;I)V")
	public void genBought(ObjType from, ObjType to, Language language) {
		this.gen(DerivedObjType.BOUGHT, from, to, LocalisedText.BOUGHT_ITEM_DISCARD, language);
	}

	@ObfuscatedName("abv.r(Labv;Labv;Lzt;I)V")
	public void genShard(ObjType from, ObjType to, Language language) {
		this.gen(DerivedObjType.SHARD, from, to, LocalisedText.DROP, language);
	}

	@ObfuscatedName("abv.v(Ldh;IILxg;Laaq;IIIII)Ldo;")
	public final Model method14644(Toolkit arg0, int arg1, int arg2, PlayerModel arg3, AnimationNode arg4, int arg5, int arg6, int arg7, int arg8) {
		if (this.countobj != null && arg2 > 1) {
			int var10 = -1;
			for (int var11 = 0; var11 < 10; var11++) {
				if (arg2 >= this.countco[var11] && this.countco[var11] != 0) {
					var10 = this.countobj[var11];
				}
			}
			if (var10 != -1) {
				return ((ObjType) this.myList.list(var10)).method14644(arg0, arg1, 1, arg3, arg4, arg5, arg6, arg7, arg8);
			}
		}
		int var12 = arg1;
		if (arg4 != null) {
			var12 = arg1 | arg4.method14358();
		}
		SoftLruHashTable var13 = this.factory.modelCache;
		Model var14;
		synchronized (this.factory.modelCache) {
			var14 = (Model) this.factory.modelCache.get((long) (this.id | arg0.field1595 << 29));
		}
		if (var14 == null || arg0.method2394(var14.method1691(), var12) != 0) {
			if (var14 != null) {
				var12 = arg0.method2213(var12, var14.method1691());
			}
			int var16 = var12;
			if (this.retex_s != null) {
				var16 = var12 | 0x8000;
			}
			if (this.recol_s != null || arg3 != null) {
				var16 |= 0x4000;
			}
			if (this.resizex != 128) {
				var16 |= 0x1;
			}
			if (this.resizey != 128) {
				var16 |= 0x2;
			}
			if (this.resizez != 128) {
				var16 |= 0x4;
			}
			ModelUnlit var17 = ModelUnlit.get(this.factory.configClient, this.mesh, 0);
			if (var17 == null) {
				return null;
			}
			if (var17.version < 13) {
				var17.scaleByPowerOfTwo(2);
			}
			var14 = arg0.createModel(var17, var16, this.factory.field8611, this.ambient + 64, this.contrast + 850);
			if (this.resizex != 128 || this.resizey != 128 || this.resizez != 128) {
				var14.scale(this.resizex, this.resizey, this.resizez);
			}
			if (this.recol_s != null) {
				for (int var18 = 0; var18 < this.recol_s.length; var18++) {
					if (this.recol_d_palette == null || var18 >= this.recol_d_palette.length) {
						var14.recolor(this.recol_s[var18], this.recol_d[var18]);
					} else {
						var14.recolor(this.recol_s[var18], clientpalette[this.recol_d_palette[var18] & 0xFF]);
					}
				}
			}
			if (this.retex_s != null) {
				for (int var19 = 0; var19 < this.retex_s.length; var19++) {
					var14.retexture(this.retex_s[var19], this.retex_d[var19]);
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
									var14.retexture(PlayerModel.field10766[var22][var23], PlayerModel.field9259[var22][var23][arg3.field7895[var22]]);
								}
							}
							var22++;
						}
					}
					for (int var21 = 0; var21 < PlayerModel.field7577[var20].length; var21++) {
						if (arg3.field7894[var20] < PlayerModel.field1434[var20][var21].length) {
							var14.recolor(PlayerModel.field7577[var20][var21], PlayerModel.field1434[var20][var21][arg3.field7894[var20]]);
						}
					}
					var20++;
				}
			}
			var14.method1690(var12);
			SoftLruHashTable var24 = this.factory.modelCache;
			synchronized (this.factory.modelCache) {
				this.factory.modelCache.put(var14, (long) (this.id | arg0.field1595 << 29));
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
	public ObjType getMeshAddress(int n) {
		if (this.countobj != null && n > 1) {
			int id = -1;
			for (int index = 0; index < 10; index++) {
				if (n >= this.countco[index] && this.countco[index] != 0) {
					id = this.countobj[index];
				}
			}
			if (id != -1) {
				return (ObjType) this.myList.list(id);
			}
		}
		return this;
	}

	@ObfuscatedName("abv.s(Ldh;Ldh;IIIZILeu;Lxg;Lws;B)[I")
	public int[] method14646(Toolkit arg0, Toolkit arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, Font arg7, PlayerModel arg8, GraphicsDefaults arg9) {
		ModelUnlit var11 = ModelUnlit.get(this.factory.configClient, this.mesh, 0);
		if (var11 == null) {
			return null;
		}
		if (var11.version < 13) {
			var11.scaleByPowerOfTwo(2);
		}
		if (this.recol_s != null) {
			for (int var12 = 0; var12 < this.recol_s.length; var12++) {
				if (this.recol_d_palette == null || var12 >= this.recol_d_palette.length) {
					var11.method1943(this.recol_s[var12], this.recol_d[var12]);
				} else {
					var11.method1943(this.recol_s[var12], clientpalette[this.recol_d_palette[var12] & 0xFF]);
				}
			}
		}
		if (this.retex_s != null) {
			for (int var13 = 0; var13 < this.retex_s.length; var13++) {
				var11.method1937(this.retex_s[var13], this.retex_d[var13]);
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
		if (this.resizex != 128 || this.resizey != 128 || this.resizez != 128) {
			var19 = true;
			var18 |= 0x7;
		}
		Model var20 = arg0.createModel(var11, var18, 64, this.ambient + 64, this.contrast + 768);
		if (!var20.method1746()) {
			return null;
		}
		if (var19) {
			var20.scale(this.resizex, this.resizey, this.resizez);
		}
		Sprite var21 = null;
		if (this.certtemplate != -1) {
			var21 = this.factory.method14617(arg0, arg1, this.certlink, 10, 1, 0, true, true, 0, arg7, arg8, arg9, this.myList);
			if (var21 == null) {
				return null;
			}
		} else if (this.lenttemplate != -1) {
			var21 = this.factory.method14617(arg0, arg1, this.lentlink, arg2, arg3, arg4, false, true, 0, arg7, arg8, arg9, this.myList);
			if (var21 == null) {
				return null;
			}
		} else if (this.boughttemplate != -1) {
			var21 = this.factory.method14617(arg0, arg1, this.boughtlink, arg2, arg3, arg4, false, true, 0, arg7, arg8, arg9, this.myList);
			if (var21 == null) {
				return null;
			}
		} else if (this.shardtemplate != -1) {
			var21 = this.factory.method14617(arg0, arg1, this.shardlink, 10, 1, 0, true, true, 0, arg7, arg8, arg9, this.myList);
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
		var24.method6703(16.0F, 16.0F, 512.0F, 512.0F, 50.0F, 2.14748365E9F, (float) arg0.getRenderTarget().getWidth(), (float) arg0.getRenderTarget().getHeight());
		arg0.method2220(var24);
		arg0.method2164(0, 0, arg0.getRenderTarget().getWidth(), arg0.getRenderTarget().getHeight());
		Matrix4x3 var25 = new Matrix4x3();
		arg0.method2217(var25);
		arg0.setSunAmbientIntensity((float) (Math.random() / 10.0D) + 0.95F);
		arg0.setSun(16777215, (float) (Math.random() / 10.0D) + 0.95F, (float) (Math.random() / 10.0D) + 0.95F, -50.0F, -10.0F, -50.0F);
		Matrix4x3 var26 = arg0.method2209();
		var26.setToRotation(0.0F, 0.0F, 1.0F, Trig1.radians(-this.zan2d << 3));
		var26.rotateAroundAxis(0.0F, 1.0F, 0.0F, Trig1.radians(this.yan2d << 3));
		var26.translate((float) (this.xof2d << 2), (float) ((Trig1.sin[this.xan2d << 3] * var22 >> 14) - var20.getMinY() / 2 + (this.yof2d << 2)), (float) ((this.yof2d << 2) + (Trig1.cos[this.xan2d << 3] * var22 >> 14)));
		var26.rotateAroundAxis(1.0F, 0.0F, 0.0F, Trig1.radians(this.xan2d << 3));
		arg0.resetBounds(0, 0, 36, 32);
		arg0.method2475(2, 0);
		arg0.fillRectangle(0, 0, 36, 32, 0, 0);
		arg0.setFog(0, -1, 0);
		var20.draw(var26, null, 1);
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
		if (this.lenttemplate != -1) {
			var21.drawSprite(0, 0);
		} else if (this.boughttemplate != -1) {
			var21.drawSprite(0, 0);
		}
		arg0.createSprite(var27, 0, 36, 36, 32).drawSprite(0, 0);
		if (this.certtemplate != -1) {
			var21.drawSprite(0, 0);
		}
		if (this.shardtemplate != -1) {
			var21.drawSprite(0, 0);
		}
		if (arg6 == 1 || arg6 == 2 && (this.stackable == 1 || arg2 != 1) && arg2 != -1) {
			arg7.drawString(formatObjCount(arg2, this.factory.languageId, arg9), 0, 9, -256, -16777215);
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
	public static String formatObjCount(int amount, Language language, GraphicsDefaults graphics) {
		if (amount < 100000) {
			return formatObjCountTagged(graphics.invHundredColor) + amount + COL_TAG_END;
		} else if (amount < 10000000) {
			return formatObjCountTagged(graphics.invThousandColor) + amount / 1000 + LocalisedText.THOUSAND_SHORT.forLang(language) + COL_TAG_END;
		} else {
			return formatObjCountTagged(graphics.invMillionColor) + amount / 1000000 + LocalisedText.MILLION_SHORT.forLang(language) + COL_TAG_END;
		}
	}

	@ObfuscatedName("ku.b(IB)Ljava/lang/String;")
	public static String formatObjCountTagged(int rgb) {
		return "<col=" + Integer.toHexString(rgb) + ">";
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
		if (!this.factory.configClient.requestdownload(var3, 0)) {
			var6 = false;
		}
		if (var4 != -1 && !this.factory.configClient.requestdownload(var4, 0)) {
			var6 = false;
		}
		if (var5 != -1 && !this.factory.configClient.requestdownload(var5, 0)) {
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
		ModelUnlit var6 = ModelUnlit.get(this.factory.configClient, var3, 0);
		if (var6 == null) {
			return null;
		}
		if (var6.version < 13) {
			var6.scaleByPowerOfTwo(2);
		}
		if (var4 != -1) {
			ModelUnlit var7 = ModelUnlit.get(this.factory.configClient, var4, 0);
			if (var7.version < 13) {
				var7.scaleByPowerOfTwo(2);
			}
			if (var5 == -1) {
				ModelUnlit[] var10 = new ModelUnlit[] { var6, var7 };
				var6 = new ModelUnlit(var10, 2);
			} else {
				ModelUnlit var8 = ModelUnlit.get(this.factory.configClient, var5, 0);
				if (var8.version < 13) {
					var8.scaleByPowerOfTwo(2);
				}
				ModelUnlit[] var9 = new ModelUnlit[] { var6, var7, var8 };
				var6 = new ModelUnlit(var9, 3);
			}
		}
		if (!arg0 && (this.manwearxoff != 0 || this.manwearyoff != 0 || this.manwearzoff != 0)) {
			var6.method1945(this.manwearxoff, this.manwearyoff, this.manwearzoff);
		}
		if (arg0 && (this.womanwearxoff != 0 || this.womanwearyoff != 0 || this.womanwearzoff != 0)) {
			var6.method1945(this.womanwearxoff, this.womanwearyoff, this.womanwearzoff);
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
		if (this.retex_s != null) {
			short[] var13;
			if (arg1 == null || arg1.field8715 == null) {
				var13 = this.retex_d;
			} else {
				var13 = arg1.field8715;
			}
			for (int var14 = 0; var14 < this.retex_s.length; var14++) {
				var6.method1937(this.retex_s[var14], var13[var14]);
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
		if (!this.factory.configClient.requestdownload(var3, 0)) {
			var5 = false;
		}
		if (var4 != -1 && !this.factory.configClient.requestdownload(var4, 0)) {
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
		ModelUnlit var5 = ModelUnlit.get(this.factory.configClient, var3, 0);
		if (var5.version < 13) {
			var5.scaleByPowerOfTwo(2);
		}
		if (var4 != -1) {
			ModelUnlit var6 = ModelUnlit.get(this.factory.configClient, var4, 0);
			if (var6.version < 13) {
				var6.scaleByPowerOfTwo(2);
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
		if (this.retex_s != null) {
			short[] var10;
			if (arg1 == null || arg1.field8715 == null) {
				var10 = this.retex_d;
			} else {
				var10 = arg1.field8715;
			}
			for (int var11 = 0; var11 < this.retex_s.length; var11++) {
				var5.method1937(this.retex_s[var11], var10[var11]);
			}
		}
		return var5;
	}

	@ObfuscatedName("abv.j(III)I")
	public int getParam(int arg0, int arg1) {
		if (this.params == null) {
			return arg1;
		} else {
			IntNode var3 = (IntNode) this.params.get((long) arg0);
			return var3 == null ? arg1 : var3.value;
		}
	}

	@ObfuscatedName("abv.t(ILjava/lang/String;B)Ljava/lang/String;")
	public String getParam(int arg0, String arg1) {
		if (this.params == null) {
			return arg1;
		} else {
			ObjectNode var3 = (ObjectNode) this.params.get((long) arg0);
			return var3 == null ? arg1 : (String) var3.value;
		}
	}

	@ObfuscatedName("abv.ae(II)I")
	public int getCursor(int op) {
		return this.cursor == null ? -1 : this.cursor[op];
	}

	@ObfuscatedName("abv.ag(II)I")
	public int getICursor(int op) {
		return this.icursor == null ? -1 : this.icursor[op];
	}
}
