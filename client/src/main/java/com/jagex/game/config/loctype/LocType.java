package com.jagex.game.config.loctype;

import com.jagex.core.constants.SerializableEnum;
import com.jagex.core.datastruct.HashTable;
import com.jagex.core.datastruct.IntNode;
import com.jagex.core.datastruct.IntegerBox;
import com.jagex.core.datastruct.Node;
import com.jagex.core.datastruct.Pair;
import com.jagex.core.datastruct.SerializableEnums;
import com.jagex.core.datastruct.SoftLruHashTable;
import com.jagex.core.io.Packet;
import com.jagex.game.client.HardShadow;
import com.jagex.game.config.ConfigType;
import com.jagex.game.config.ConfigTypeList;
import com.jagex.game.config.vartype.VarIntDomain;
import com.jagex.game.config.vartype.VarType;
import com.jagex.game.config.vartype.VariableTypeProvider;
import com.jagex.game.config.vartype.bit.VarBitType;
import com.jagex.game.config.vartype.constants.VarDomainType;
import com.jagex.game.world.entity.LocShape;
import com.jagex.game.world.entity.LocTypeCustomisation;
import com.jagex.game.world.entity.LocTypeRelated;
import com.jagex.game.world.entity.LocTypeRelated2;
import com.jagex.game.world.entity.LocTypeRelated3;
import com.jagex.game.world.entity.ObjectNode;
import com.jagex.graphics.AnimationNode;
import com.jagex.graphics.FloorModel;
import com.jagex.graphics.Model;
import com.jagex.graphics.ModelUnlit;
import com.jagex.graphics.Toolkit;
import com.jagex.math.Cuboid;
import com.jagex.math.IntMath;
import deob.ObfuscatedName;
import java.util.Arrays;

@ObfuscatedName("vd")
public class LocType implements ConfigType {

	@ObfuscatedName("vd.n")
	public static short[] clientpalette = new short[256];

	@ObfuscatedName("vd.m")
	public int id;

	@ObfuscatedName("vd.k")
	public LocTypeFactory factory;

	@ObfuscatedName("vd.f")
	public ConfigTypeList myList;

	@ObfuscatedName("vd.w")
	public byte[] shapes;

	@ObfuscatedName("vd.l")
	public int[][] models;

	@ObfuscatedName("vd.u")
	public String name = "null";

	@ObfuscatedName("vd.z")
	public short[] recol_s;

	@ObfuscatedName("vd.p")
	public short[] recol_d;

	@ObfuscatedName("vd.d")
	public byte[] recol_d_palette;

	@ObfuscatedName("vd.c")
	public short[] retex_s;

	@ObfuscatedName("vd.r")
	public short[] retex_d;

	@ObfuscatedName("vd.v")
	public byte[] recolindices;

	@ObfuscatedName("vd.o")
	public byte[] retexindices;

	@ObfuscatedName("vd.s")
	public byte tint_hue;

	@ObfuscatedName("vd.y")
	public byte tint_saturation;

	@ObfuscatedName("vd.q")
	public byte tint_luminence;

	@ObfuscatedName("vd.x")
	public byte tint_weight = 0;

	@ObfuscatedName("vd.b")
	public int width = 1;

	@ObfuscatedName("vd.h")
	public int length = 1;

	@ObfuscatedName("vd.a")
	public int blockwalk = 2;

	@ObfuscatedName("vd.g")
	public int active = -1;

	@ObfuscatedName("vd.i")
	public byte hillchange = 0;

	@ObfuscatedName("vd.j")
	public int hillchange_value = -1;

	@ObfuscatedName("vd.t")
	public boolean sharelight = false;

	@ObfuscatedName("vd.ae")
	public int occlude = -1;

	@ObfuscatedName("vd.ag")
	public int field7475 = 960;

	@ObfuscatedName("vd.ah")
	public int field7476 = 0;

	@ObfuscatedName("vd.al")
	public int[] anim = null;

	@ObfuscatedName("vd.ac")
	public int[] anim_weight = null;

	@ObfuscatedName("vd.ai")
	public boolean field7479 = false;

	@ObfuscatedName("vd.aw")
	public int walloff = 64;

	@ObfuscatedName("vd.as")
	public int ambient = 0;

	@ObfuscatedName("vd.at")
	public int contrast = 0;

	@ObfuscatedName("vd.ad")
	public String[] op;

	@ObfuscatedName("vd.am")
	public int[] cursor;

	@ObfuscatedName("vd.au")
	public int mapelement = -1;

	@ObfuscatedName("vd.ar")
	public int mapsceneicon = -1;

	@ObfuscatedName("vd.ap")
	public boolean mapsceneiconrotate = false;

	@ObfuscatedName("vd.aq")
	public int field7488 = 0;

	@ObfuscatedName("vd.ax")
	public boolean mapsceneiconmirror = false;

	@ObfuscatedName("vd.av")
	public boolean mirror = false;

	@ObfuscatedName("vd.ao")
	public boolean hasHardShadow = true;

	@ObfuscatedName("vd.aj")
	public int resizex = 128;

	@ObfuscatedName("vd.ay")
	public int resizey = 128;

	@ObfuscatedName("vd.ab")
	public int resizez = 128;

	@ObfuscatedName("vd.az")
	public int xoff = 0;

	@ObfuscatedName("vd.aa")
	public int yoff = 0;

	@ObfuscatedName("vd.af")
	public int zoff = 0;

	@ObfuscatedName("vd.ak")
	public int post_xoff = 0;

	@ObfuscatedName("vd.an")
	public int post_yoff = 0;

	@ObfuscatedName("vd.bf")
	public int post_zoff = 0;

	@ObfuscatedName("vd.bl")
	public boolean forcedecor = false;

	@ObfuscatedName("vd.bk")
	public boolean breakroutefinding = false;

	@ObfuscatedName("vd.bh")
	public int raiseobject = -1;

	@ObfuscatedName("vd.bx")
	public int field7448 = 0;

	@ObfuscatedName("vd.bd")
	public int[] multiloc;

	@ObfuscatedName("vd.bc")
	public int multivarbit = -1;

	@ObfuscatedName("vd.bi")
	public int multivarp = -1;

	@ObfuscatedName("vd.bn")
	public int bgsound_sound = -1;

	@ObfuscatedName("vd.bt")
	public int bgsound_range = 0;

	@ObfuscatedName("vd.bq")
	public int bgsound_dropoffrange = 0;

	@ObfuscatedName("vd.bm")
	public int bgsound_volume = 255;

	@ObfuscatedName("vd.bb")
	public int bgsound_mindelay = 0;

	@ObfuscatedName("vd.be")
	public int bgsound_maxdelay = 0;

	@ObfuscatedName("vd.by")
	public int[] bgsound_random;

	@ObfuscatedName("vd.bu")
	public boolean randomanimframe = true;

	@ObfuscatedName("vd.bw")
	public boolean istexture = false;

	@ObfuscatedName("vd.bo")
	public boolean hardshadow = true;

	@ObfuscatedName("vd.bz")
	public boolean members = false;

	@ObfuscatedName("vd.bv")
	public HashTable params;

	@ObfuscatedName("vd.br")
	public boolean field7520 = false;

	@ObfuscatedName("vd.bg")
	public int[] quests;

	@ObfuscatedName("vd.ba")
	public int bgsound_minrate = 256;

	@ObfuscatedName("vd.bp")
	public int bgsound_maxrate = 256;

	@ObfuscatedName("vd.bj")
	public boolean field7524 = false;

	@ObfuscatedName("vd.bs")
	public boolean antimacro = false;

	@ObfuscatedName("vd.cl")
	public LocTypeRelated field7526 = LocTypeRelated.field7439;

	@ObfuscatedName("vd.cg")
	public Cuboid clickbox;

	public LocType(int arg0, LocTypeFactory arg1, ConfigTypeList arg2) {
		this.id = arg0;
		this.factory = arg1;
		this.myList = arg2;
		this.op = (String[]) this.factory.defaultops.clone();
	}

	@ObfuscatedName("vd.e(Lalw;B)V")
	public void decode(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.decode(arg0, var2);
		}
	}

	@ObfuscatedName("vd.n(I)V")
	public void postDecode() {
		this.postDecodeActive();
		if (this.breakroutefinding) {
			this.blockwalk = 0;
		}
		if (!this.factory.allowMembers && this.members) {
			this.op = null;
			this.quests = null;
		}
	}

	@ObfuscatedName("vd.u(Lalw;II)V")
	public void decode(Packet arg0, int arg1) {
		if (arg1 == 1) {
			int var3 = arg0.g1();
			this.shapes = new byte[var3];
			this.models = new int[var3][];
			for (int var4 = 0; var4 < var3; var4++) {
				this.shapes[var4] = arg0.g1b();
				int var5 = arg0.g1();
				this.models[var4] = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					this.models[var4][var6] = arg0.gSmart2or4s();
				}
			}
		} else if (arg1 == 2) {
			this.name = arg0.gjstr().intern();
		} else if (arg1 == 14) {
			this.width = arg0.g1();
		} else if (arg1 == 15) {
			this.length = arg0.g1();
		} else if (arg1 == 17) {
			this.blockwalk = 0;
		} else if (arg1 != 18) {
			if (arg1 == 19) {
				this.active = arg0.g1();
			} else if (arg1 == 21) {
				this.hillchange = 1;
			} else if (arg1 == 22) {
				this.sharelight = true;
			} else if (arg1 == 23) {
				this.occlude = 1;
			} else if (arg1 == 24) {
				int var7 = arg0.gSmart2or4s();
				if (var7 != -1) {
					this.anim = new int[] { var7 };
				}
			} else if (arg1 == 27) {
				this.blockwalk = 1;
			} else if (arg1 == 28) {
				this.walloff = arg0.g1() << 2;
			} else if (arg1 == 29) {
				this.ambient = arg0.g1b();
			} else if (arg1 == 39) {
				this.contrast = arg0.g1b() * 5;
			} else if (arg1 >= 30 && arg1 < 35) {
				this.op[arg1 - 30] = arg0.gjstr().intern();
			} else if (arg1 == 40) {
				int var8 = arg0.g1();
				this.recol_s = new short[var8];
				this.recol_d = new short[var8];
				for (int var9 = 0; var9 < var8; var9++) {
					this.recol_s[var9] = (short) arg0.g2();
					this.recol_d[var9] = (short) arg0.g2();
				}
			} else if (arg1 == 41) {
				int var10 = arg0.g1();
				this.retex_s = new short[var10];
				this.retex_d = new short[var10];
				for (int var11 = 0; var11 < var10; var11++) {
					this.retex_s[var11] = (short) arg0.g2();
					this.retex_d[var11] = (short) arg0.g2();
				}
			} else if (arg1 == 42) {
				int var12 = arg0.g1();
				this.recol_d_palette = new byte[var12];
				for (int var13 = 0; var13 < var12; var13++) {
					this.recol_d_palette[var13] = arg0.g1b();
				}
			} else if (arg1 == 44) {
				int var14 = arg0.g2();
				int var15 = 0;
				for (int var16 = var14; var16 > 0; var16 >>= 0x1) {
					var15++;
				}
				this.recolindices = new byte[var15];
				byte var17 = 0;
				for (int var18 = 0; var18 < var15; var18++) {
					if ((var14 & 0x1 << var18) > 0) {
						this.recolindices[var18] = var17++;
					} else {
						this.recolindices[var18] = -1;
					}
				}
			} else if (arg1 == 45) {
				int var19 = arg0.g2();
				int var20 = 0;
				for (int var21 = var19; var21 > 0; var21 >>= 0x1) {
					var20++;
				}
				this.retexindices = new byte[var20];
				byte var22 = 0;
				for (int var23 = 0; var23 < var20; var23++) {
					if ((var19 & 0x1 << var23) > 0) {
						this.retexindices[var23] = var22++;
					} else {
						this.retexindices[var23] = -1;
					}
				}
			} else if (arg1 == 62) {
				this.mirror = true;
			} else if (arg1 == 64) {
				this.hasHardShadow = false;
			} else if (arg1 == 65) {
				this.resizex = arg0.g2();
			} else if (arg1 == 66) {
				this.resizey = arg0.g2();
			} else if (arg1 == 67) {
				this.resizez = arg0.g2();
			} else if (arg1 == 69) {
				arg0.g1();
			} else if (arg1 == 70) {
				this.xoff = arg0.g2s() << 2;
			} else if (arg1 == 71) {
				this.yoff = arg0.g2s() << 2;
			} else if (arg1 == 72) {
				this.zoff = arg0.g2s() << 2;
			} else if (arg1 == 73) {
				this.forcedecor = true;
			} else if (arg1 == 74) {
				this.breakroutefinding = true;
			} else if (arg1 == 75) {
				this.raiseobject = arg0.g1();
			} else if (arg1 == 77 || arg1 == 92) {
				this.multivarbit = arg0.g2();
				if (this.multivarbit == 65535) {
					this.multivarbit = -1;
				}
				this.multivarp = arg0.g2();
				if (this.multivarp == 65535) {
					this.multivarp = -1;
				}
				int var38 = -1;
				if (arg1 == 92) {
					var38 = arg0.gSmart2or4s();
				}
				int var39 = arg0.gSmart1or2();
				this.multiloc = new int[var39 + 2];
				for (int var40 = 0; var40 <= var39; var40++) {
					this.multiloc[var40] = arg0.gSmart2or4s();
				}
				this.multiloc[var39 + 1] = var38;
			} else if (arg1 == 78) {
				this.bgsound_sound = arg0.g2();
				this.bgsound_range = arg0.g1();
			} else if (arg1 == 79) {
				this.bgsound_mindelay = arg0.g2();
				this.bgsound_maxdelay = arg0.g2();
				this.bgsound_range = arg0.g1();
				int var24 = arg0.g1();
				this.bgsound_random = new int[var24];
				for (int var25 = 0; var25 < var24; var25++) {
					this.bgsound_random[var25] = arg0.g2();
				}
			} else if (arg1 == 81) {
				this.hillchange = 2;
				this.hillchange_value = arg0.g1() * 256;
			} else if (arg1 == 82) {
				this.istexture = true;
			} else if (arg1 == 88) {
				this.hardshadow = false;
			} else if (arg1 == 89) {
				this.randomanimframe = false;
			} else if (arg1 == 91) {
				this.members = true;
			} else if (arg1 == 93) {
				this.hillchange = 3;
				this.hillchange_value = arg0.g2();
			} else if (arg1 == 94) {
				this.hillchange = 4;
			} else if (arg1 == 95) {
				this.hillchange = 5;
				this.hillchange_value = arg0.g2s();
			} else if (arg1 == 97) {
				this.mapsceneiconrotate = true;
			} else if (arg1 == 98) {
				this.field7520 = true;
			} else if (arg1 == 99 || arg1 == 100) {
				arg0.g1();
				arg0.g2();
			} else if (arg1 == 101) {
				this.field7488 = arg0.g1();
			} else if (arg1 == 102) {
				this.mapsceneicon = arg0.g2();
			} else if (arg1 == 103) {
				this.occlude = 0;
			} else if (arg1 == 104) {
				this.bgsound_volume = arg0.g1();
			} else if (arg1 == 105) {
				this.mapsceneiconmirror = true;
			} else if (arg1 == 106) {
				int var26 = arg0.g1();
				int var27 = 0;
				this.anim = new int[var26];
				this.anim_weight = new int[var26];
				for (int var28 = 0; var28 < var26; var28++) {
					this.anim[var28] = arg0.gSmart2or4s();
					var27 += this.anim_weight[var28] = arg0.g1();
				}
				for (int var29 = 0; var29 < var26; var29++) {
					this.anim_weight[var29] = this.anim_weight[var29] * 65535 / var27;
				}
			} else if (arg1 == 107) {
				this.mapelement = arg0.g2();
			} else if (arg1 >= 150 && arg1 < 155) {
				this.op[arg1 - 150] = arg0.gjstr().intern();
				if (!this.factory.allowMembers) {
					this.op[arg1 - 150] = null;
				}
			} else if (arg1 == 160) {
				int var30 = arg0.g1();
				this.quests = new int[var30];
				for (int var31 = 0; var31 < var30; var31++) {
					this.quests[var31] = arg0.g2();
				}
			} else if (arg1 == 162) {
				this.hillchange = 3;
				this.hillchange_value = arg0.g4s();
			} else if (arg1 == 163) {
				this.tint_hue = arg0.g1b();
				this.tint_saturation = arg0.g1b();
				this.tint_luminence = arg0.g1b();
				this.tint_weight = arg0.g1b();
			} else if (arg1 == 164) {
				this.post_xoff = arg0.g2s();
			} else if (arg1 == 165) {
				this.post_yoff = arg0.g2s();
			} else if (arg1 == 166) {
				this.post_zoff = arg0.g2s();
			} else if (arg1 == 167) {
				this.field7448 = arg0.g2();
			} else if (arg1 != 168 && arg1 != 169) {
				if (arg1 == 170) {
					this.field7475 = arg0.gSmart1or2();
				} else if (arg1 == 171) {
					this.field7476 = arg0.gSmart1or2();
				} else if (arg1 == 173) {
					this.bgsound_minrate = arg0.g2();
					this.bgsound_maxrate = arg0.g2();
				} else if (arg1 == 177) {
					this.field7524 = true;
				} else if (arg1 == 178) {
					this.bgsound_dropoffrange = arg0.g1();
				} else if (arg1 == 186) {
					this.field7526 = (LocTypeRelated) SerializableEnums.decode((SerializableEnum[]) LocTypeRelated.method9002(), arg0.g1());
				} else if (arg1 != 188) {
					if (arg1 == 189) {
						this.antimacro = true;
					} else if (arg1 >= 190 && arg1 < 196) {
						if (this.cursor == null) {
							this.cursor = new int[6];
							Arrays.fill(this.cursor, -1);
						}
						this.cursor[arg1 - 190] = arg0.g2();
					} else if (arg1 == 196) {
						SerializableEnums.decode((SerializableEnum[]) LocTypeRelated3.method208(), arg0.g1());
					} else if (arg1 == 197) {
						SerializableEnums.decode((SerializableEnum[]) LocTypeRelated2.method10203(), arg0.g1());
					} else if (arg1 != 198 && arg1 != 199) {
						if (arg1 == 200) {
							this.field7479 = true;
						} else if (arg1 == 201) {
							this.clickbox = new Cuboid();
							this.clickbox.minX = arg0.gSmart1or2s();
							this.clickbox.minY = arg0.gSmart1or2s();
							this.clickbox.minZ = arg0.gSmart1or2s();
							this.clickbox.maxX = arg0.gSmart1or2s();
							this.clickbox.maxY = arg0.gSmart1or2s();
							this.clickbox.maxZ = arg0.gSmart1or2s();
						} else if (arg1 == 249) {
							int var32 = arg0.g1();
							if (this.params == null) {
								int var33 = IntMath.bitceil(var32);
								this.params = new HashTable(var33);
							}
							for (int var34 = 0; var34 < var32; var34++) {
								boolean var35 = arg0.g1() == 1;
								int var36 = arg0.g3();
								Node var37;
								if (var35) {
									var37 = new ObjectNode(arg0.gjstr().intern());
								} else {
									var37 = new IntNode(arg0.g4s());
								}
								this.params.put(var37, (long) var36);
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("vd.z(I)V")
	public void postDecodeActive() {
		if (this.active == -1) {
			this.active = 0;
			if (this.shapes != null && this.shapes.length == 1 && LocShape.CENTREPIECE_STRAIGHT.id == this.shapes[0]) {
				this.active = 1;
			}
			for (int var1 = 0; var1 < 5; var1++) {
				if (this.op[var1] != null) {
					this.active = 1;
					break;
				}
			}
		}
		if (this.raiseobject == -1) {
			this.raiseobject = this.blockwalk == 0 ? 0 : 1;
		}
		if (this.method9504() || this.field7520 || this.multiloc != null) {
			this.field7524 = true;
		}
		if (this.active <= 0 && LocTypeRelated.field7438 == this.field7526) {
		}
	}

	@ObfuscatedName("vd.p(IB)Z")
	public final boolean method9473(int arg0) {
		if (this.models == null) {
			return true;
		}
		boolean var2 = true;
		for (int var3 = 0; var3 < this.shapes.length; var3++) {
			if (this.shapes[var3] == arg0) {
				for (int var4 = 0; var4 < this.models[var3].length; var4++) {
					if (!this.factory.method9525(this.models[var3][var4])) {
						var2 = false;
					}
				}
			}
		}
		return var2;
	}

	@ObfuscatedName("vd.d(Lxe;S)Z")
	public final boolean method9489(IntegerBox arg0) {
		if (this.models == null) {
			return true;
		}
		boolean var2 = true;
		for (int var3 = 0; var3 < this.models.length; var3++) {
			for (int var4 = 0; var4 < this.models[var3].length; var4++) {
				boolean var5 = this.factory.method9525(this.models[var3][var4]);
				var2 &= var5;
				if (!var5) {
					arg0.intValue = this.models[var3][var4];
				}
			}
		}
		return var2;
	}

	@ObfuscatedName("vd.c(Ldh;IIILcb;Lcb;IIIZLvp;B)Labg;")
	public final synchronized Pair method9475(Toolkit arg0, int arg1, int arg2, int arg3, FloorModel arg4, FloorModel arg5, int arg6, int arg7, int arg8, boolean arg9, LocTypeCustomisation arg10) {
		if (LocShape.isWallDecor(arg2)) {
			arg2 = LocShape.WALLDECOR_STRAIGHT_NOOFFSET.id;
		}
		long var12 = (long) ((this.id << 10) + (arg2 << 3) + arg3);
		long var14 = var12 | (long) (arg0.field1595 << 29);
		if (arg10 != null) {
			var14 |= arg10.field7444 << 32;
		}
		int var16 = arg1;
		if (this.hillchange == 3) {
			var16 = arg1 | 0x7;
		} else {
			if (this.hillchange != 0 || this.post_yoff != 0) {
				var16 = arg1 | 0x2;
			}
			if (this.post_xoff != 0) {
				var16 |= 0x1;
			}
			if (this.post_zoff != 0) {
				var16 |= 0x4;
			}
		}
		if (arg9) {
			var16 |= 0x40000;
		}
		boolean var17 = this.hillchange != 0 && (arg4 != null || arg5 != null);
		boolean var18 = this.post_xoff != 0 || this.post_yoff != 0 || this.post_zoff != 0;
		SoftLruHashTable var19 = this.factory.modelCacheDynamic;
		Pair var20;
		synchronized (this.factory.modelCacheDynamic) {
			var20 = (Pair) this.factory.modelCacheDynamic.get(var14);
		}
		Model var22 = (Model) (var20 == null ? null : var20.first);
		HardShadow var23 = null;
		if (var22 != null && arg0.method2394(var22.method1691(), var16) == 0) {
			var23 = (HardShadow) var20.second;
			if (arg9 && var23 == null && !var17 && !var18) {
				var23 = (HardShadow) (var20.second = var22.method1726(null));
			}
		} else {
			if (var22 != null) {
				var16 = arg0.method2213(var16, var22.method1691());
			}
			int var24 = var16;
			if (LocShape.CENTREPIECE_STRAIGHT.id == arg2 && arg3 > 3) {
				var24 = var16 | 0x5;
			}
			var22 = this.method9476(arg0, var24, arg2, arg3, arg10);
			if (var22 == null) {
				return null;
			}
			if (LocShape.CENTREPIECE_STRAIGHT.id == arg2 && arg3 > 3) {
				var22.method1693(2048);
			}
			if (arg9 && !var17 && !var18) {
				var23 = var22.method1726(null);
			}
			var22.method1690(var16);
			Pair var25 = new Pair(var22, var23);
			SoftLruHashTable var26 = this.factory.modelCacheDynamic;
			synchronized (this.factory.modelCacheDynamic) {
				this.factory.modelCacheDynamic.put(var25, var14);
			}
		}
		Model var28;
		if (var17 || var18) {
			var28 = var22.method1773((byte) 0, var16, true);
			if (var17) {
				var28.method1700(this.hillchange, this.hillchange_value, arg4, arg5, arg6, arg7, arg8);
			}
			if (var18) {
				var28.translate(this.post_xoff, this.post_yoff, this.post_zoff);
			}
			if (arg9) {
				var23 = var28.method1726(null);
			}
			var28.method1690(arg1);
		} else {
			var28 = var22.method1773((byte) 0, arg1, true);
		}
		this.factory.field7529.first = var28;
		this.factory.field7529.second = var23;
		return this.factory.field7529;
	}

	@ObfuscatedName("vd.r(Ldh;IIILcb;Lcb;IIILaaq;Lvp;B)Ldo;")
	public final synchronized Model method9470(Toolkit arg0, int arg1, int arg2, int arg3, FloorModel arg4, FloorModel arg5, int arg6, int arg7, int arg8, AnimationNode arg9, LocTypeCustomisation arg10) {
		if (LocShape.isWallDecor(arg2)) {
			arg2 = LocShape.WALLDECOR_STRAIGHT_NOOFFSET.id;
		}
		long var12 = (long) ((this.id << 10) + (arg2 << 3) + arg3);
		int var14 = arg1;
		long var15 = var12 | (long) (arg0.field1595 << 29);
		if (arg10 != null) {
			var15 |= arg10.field7444 << 32;
		}
		if (arg9 != null) {
			arg1 |= arg9.method14358();
		}
		if (this.hillchange == 3) {
			arg1 |= 0x7;
		} else {
			if (this.hillchange != 0 || this.post_yoff != 0) {
				arg1 |= 0x2;
			}
			if (this.post_xoff != 0) {
				arg1 |= 0x1;
			}
			if (this.post_zoff != 0) {
				arg1 |= 0x4;
			}
		}
		if (LocShape.CENTREPIECE_STRAIGHT.id == arg2 && arg3 > 3) {
			arg1 |= 0x5;
		}
		SoftLruHashTable var17 = this.factory.field7532;
		Model var18;
		synchronized (this.factory.field7532) {
			var18 = (Model) this.factory.field7532.get(var15);
		}
		if (var18 == null || arg0.method2394(var18.method1691(), arg1) != 0) {
			if (var18 != null) {
				arg1 = arg0.method2213(arg1, var18.method1691());
			}
			var18 = this.method9476(arg0, arg1, arg2, arg3, arg10);
			if (var18 == null) {
				return null;
			}
			SoftLruHashTable var20 = this.factory.field7532;
			synchronized (this.factory.field7532) {
				this.factory.field7532.put(var18, var15);
			}
		}
		boolean var22 = false;
		if (arg9 != null) {
			var18 = var18.method1773((byte) 1, arg1, true);
			var22 = true;
			arg9.method14359(var18, arg3 & 0x3);
		}
		if (LocShape.CENTREPIECE_STRAIGHT.id == arg2 && arg3 > 3) {
			if (!var22) {
				var18 = var18.method1773((byte) 3, arg1, true);
				var22 = true;
			}
			var18.method1693(2048);
		}
		if (this.hillchange != 0) {
			if (!var22) {
				var18 = var18.method1773((byte) 3, arg1, true);
				var22 = true;
			}
			var18.method1700(this.hillchange, this.hillchange_value, arg4, arg5, arg6, arg7, arg8);
		}
		if (this.post_xoff != 0 || this.post_yoff != 0 || this.post_zoff != 0) {
			if (!var22) {
				var18 = var18.method1773((byte) 3, arg1, true);
				var22 = true;
			}
			var18.translate(this.post_xoff, this.post_yoff, this.post_zoff);
		}
		if (var22) {
			var18.method1690(var14);
		}
		return var18;
	}

	@ObfuscatedName("vd.v(Ldh;IIILvp;I)Ldo;")
	public Model method9476(Toolkit arg0, int arg1, int arg2, int arg3, LocTypeCustomisation arg4) {
		int var6 = this.ambient + 64;
		int var7 = this.contrast + 850;
		int var8 = arg1;
		boolean var9 = this.mirror || LocShape.WALL_L.id == arg2 && arg3 > 3;
		if (var9) {
			arg1 |= 0x10;
		}
		if (arg3 == 0) {
			if (this.resizex != 128 || this.xoff != 0) {
				arg1 |= 0x1;
			}
			if (this.resizez != 128 || this.zoff != 0) {
				arg1 |= 0x4;
			}
		} else {
			arg1 |= 0xD;
		}
		if (this.resizey != 128 || this.yoff != 0) {
			arg1 |= 0x2;
		}
		if (this.recol_s != null) {
			arg1 |= 0x4000;
		}
		if (this.retex_s != null) {
			arg1 |= 0x8000;
		}
		if (this.tint_weight != 0) {
			arg1 |= 0x80000;
		}
		Model var10 = null;
		if (this.shapes != null) {
			int var11 = -1;
			for (int var12 = 0; var12 < this.shapes.length; var12++) {
				if (this.shapes[var12] == arg2) {
					var11 = var12;
					break;
				}
			}
			if (var11 == -1) {
				return null;
			}
			int[] var13 = arg4 == null || arg4.field7443 == null ? this.models[var11] : arg4.field7443;
			int var14 = var13.length;
			if (var14 > 0) {
				long var15 = (long) arg0.field1595;
				for (int var17 = 0; var17 < var14; var17++) {
					var15 = var15 * 67783L + (long) var13[var17];
				}
				SoftLruHashTable var18 = this.factory.modelCacheStatic;
				synchronized (this.factory.modelCacheStatic) {
					var10 = (Model) this.factory.modelCacheStatic.get(var15);
				}
				if (var10 != null) {
					if (var6 != var10.method1862()) {
						arg1 |= 0x1000;
					}
					if (var7 != var10.method1740()) {
						arg1 |= 0x2000;
					}
				}
				if (var10 == null || arg0.method2394(var10.method1691(), arg1) != 0) {
					int var20 = arg1 | 0x1F01F;
					if (var10 != null) {
						var20 = arg0.method2213(var20, var10.method1691());
					}
					ModelUnlit var21 = null;
					ModelUnlit[] var22 = this.factory.field7535;
					synchronized (this.factory.field7535) {
						int var23 = 0;
						while (true) {
							if (var23 >= var14) {
								if (var14 > 1) {
									var21 = new ModelUnlit(this.factory.field7535, var14);
								}
								break;
							}
							byte[] var24 = this.factory.method9530(var13[var23]);
							if (var24 == null) {
								return null;
							}
							var21 = new ModelUnlit(var24);
							if (var21.version < 13) {
								var21.scaleByPowerOfTwo(2);
							}
							if (var14 > 1) {
								this.factory.field7535[var23] = var21;
							}
							var23++;
						}
					}
					var10 = arg0.createModel(var21, var20, this.factory.field7536, var6, var7);
					SoftLruHashTable var26 = this.factory.modelCacheStatic;
					synchronized (this.factory.modelCacheStatic) {
						this.factory.modelCacheStatic.put(var10, var15);
					}
				}
			}
		}
		if (var10 == null) {
			return null;
		}
		Model var28 = var10.method1773((byte) 0, arg1, true);
		if (var6 != var10.method1862()) {
			var28.method1893(var6);
		}
		if (var7 != var10.method1740()) {
			var28.method1738(var7);
		}
		if (var9) {
			var28.method1698();
		}
		if (LocShape.WALLDECOR_STRAIGHT_NOOFFSET.id == arg2 && arg3 > 3) {
			var28.method1694(2048);
			var28.translate(180, 0, -180);
		}
		int var29 = arg3 & 0x3;
		if (var29 == 1) {
			var28.method1694(4096);
		} else if (var29 == 2) {
			var28.method1694(8192);
		} else if (var29 == 3) {
			var28.method1694(12288);
		}
		if (this.recol_s != null) {
			short[] var30;
			if (arg4 == null || arg4.field7442 == null) {
				var30 = this.recol_d;
			} else {
				var30 = arg4.field7442;
			}
			for (int var31 = 0; var31 < this.recol_s.length; var31++) {
				if (this.recol_d_palette == null || var31 >= this.recol_d_palette.length) {
					var28.recolor(this.recol_s[var31], var30[var31]);
				} else {
					var28.recolor(this.recol_s[var31], clientpalette[this.recol_d_palette[var31] & 0xFF]);
				}
			}
		}
		if (this.retex_s != null) {
			short[] var32;
			if (arg4 == null || arg4.field7445 == null) {
				var32 = this.retex_d;
			} else {
				var32 = arg4.field7445;
			}
			for (int var33 = 0; var33 < this.retex_s.length; var33++) {
				var28.retexture(this.retex_s[var33], var32[var33]);
			}
		}
		if (this.tint_weight != 0) {
			var28.method1745(this.tint_hue, this.tint_saturation, this.tint_luminence, this.tint_weight & 0xFF);
		}
		if (this.resizex != 128 || this.resizey != 128 || this.resizez != 128) {
			var28.scale(this.resizex, this.resizey, this.resizez);
		}
		if (this.xoff != 0 || this.yoff != 0 || this.zoff != 0) {
			var28.translate(this.xoff, this.yoff, this.zoff);
		}
		var28.method1690(var8);
		return var28;
	}

	@ObfuscatedName("vd.o(Lem;Lep;I)Lvd;")
	public final LocType getMultiLoc(VariableTypeProvider arg0, VarIntDomain arg1) {
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
		if (var3 >= 0 && var3 < this.multiloc.length - 1) {
			return this.multiloc[var3] == -1 ? null : (LocType) this.myList.list(this.multiloc[var3]);
		} else {
			int var6 = this.multiloc[this.multiloc.length - 1];
			return var6 == -1 ? null : (LocType) this.myList.list(var6);
		}
	}

	@ObfuscatedName("vd.s(III)I")
	public int getParam(int arg0, int arg1) {
		if (this.params == null) {
			return arg1;
		} else {
			IntNode var3 = (IntNode) this.params.get((long) arg0);
			return var3 == null ? arg1 : var3.value;
		}
	}

	@ObfuscatedName("vd.y(ILjava/lang/String;B)Ljava/lang/String;")
	public String getParam(int arg0, String arg1) {
		if (this.params == null) {
			return arg1;
		} else {
			ObjectNode var3 = (ObjectNode) this.params.get((long) arg0);
			return var3 == null ? arg1 : (String) var3.value;
		}
	}

	@ObfuscatedName("vd.q(I)Z")
	public boolean method9480() {
		if (this.multiloc == null) {
			return this.bgsound_sound != -1 || this.bgsound_random != null;
		}
		for (int var1 = 0; var1 < this.multiloc.length; var1++) {
			if (this.multiloc[var1] != -1) {
				LocType var2 = (LocType) this.myList.list(this.multiloc[var1]);
				if (var2.bgsound_sound != -1 || var2.bgsound_random != null) {
					return true;
				}
			}
		}
		return false;
	}

	@ObfuscatedName("vd.x(B)Z")
	public boolean method9504() {
		return this.anim != null;
	}

	@ObfuscatedName("vd.b(I)Z")
	public boolean method9514() {
		return this.anim != null && this.anim.length > 1;
	}

	@ObfuscatedName("vd.h(S)I")
	public int method9483() {
		if (this.anim != null) {
			if (this.anim.length <= 1) {
				return this.anim[0];
			}
			int var1 = (int) (Math.random() * 65535.0D);
			for (int var2 = 0; var2 < this.anim.length; var2++) {
				if (var1 <= this.anim_weight[var2]) {
					return this.anim[var2];
				}
				var1 -= this.anim_weight[var2];
			}
		}
		return -1;
	}

	@ObfuscatedName("vd.a(I)[I")
	public int[] getAnim() {
		return this.anim;
	}

	@ObfuscatedName("vd.g(IB)Z")
	public boolean hasAnim(int arg0) {
		if (this.anim != null && arg0 != -1) {
			for (int var2 = 0; var2 < this.anim.length; var2++) {
				if (this.anim[var2] == arg0) {
					return true;
				}
			}
		}
		return false;
	}

	@ObfuscatedName("vd.i(IS)I")
	public int getCursor(int arg0) {
		return this.cursor == null ? -1 : this.cursor[arg0];
	}
}
