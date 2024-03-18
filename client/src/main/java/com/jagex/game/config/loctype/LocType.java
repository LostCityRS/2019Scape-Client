package com.jagex.game.config.loctype;

import com.jagex.core.datastruct.*;
import com.jagex.core.io.Packet;
import com.jagex.game.client.HardShadow;
import com.jagex.game.config.ConfigType;
import com.jagex.game.config.ConfigTypeList;
import com.jagex.game.config.vartype.VarIntDomain;
import com.jagex.game.config.vartype.VarType;
import com.jagex.game.config.vartype.VariableTypeProvider;
import com.jagex.game.config.vartype.bit.VarBitType;
import com.jagex.game.config.vartype.constants.VarDomainType;
import com.jagex.game.world.entity.*;
import com.jagex.graphics.*;
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
	public byte field7469;

	@ObfuscatedName("vd.y")
	public byte field7464;

	@ObfuscatedName("vd.q")
	public byte field7465;

	@ObfuscatedName("vd.x")
	public byte field7493 = 0;

	@ObfuscatedName("vd.b")
	public int width = 1;

	@ObfuscatedName("vd.h")
	public int length = 1;

	@ObfuscatedName("vd.a")
	public int blockwalk = 2;

	@ObfuscatedName("vd.g")
	public int active2 = -1;

	@ObfuscatedName("vd.i")
	public byte hillskew = 0;

	@ObfuscatedName("vd.j")
	public int field7472 = -1;

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
	public int[] field7478 = null;

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
	public int[] field7497;

	@ObfuscatedName("vd.au")
	public int field7485 = -1;

	@ObfuscatedName("vd.ar")
	public int field7486 = -1;

	@ObfuscatedName("vd.ap")
	public boolean field7487 = false;

	@ObfuscatedName("vd.aq")
	public int field7488 = 0;

	@ObfuscatedName("vd.ax")
	public boolean field7504 = false;

	@ObfuscatedName("vd.av")
	public boolean mirror = false;

	@ObfuscatedName("vd.ao")
	public boolean shadow = true;

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
	public int field7522 = 0;

	@ObfuscatedName("vd.an")
	public int field7449 = 0;

	@ObfuscatedName("vd.bf")
	public int field7500 = 0;

	@ObfuscatedName("vd.bl")
	public boolean forcedecor = false;

	@ObfuscatedName("vd.bk")
	public boolean breakroutefinding = false;

	@ObfuscatedName("vd.bh")
	public int field7503 = -1;

	@ObfuscatedName("vd.bx")
	public int field7448 = 0;

	@ObfuscatedName("vd.bd")
	public int[] field7505;

	@ObfuscatedName("vd.bc")
	public int field7506 = -1;

	@ObfuscatedName("vd.bi")
	public int field7507 = -1;

	@ObfuscatedName("vd.bn")
	public int field7508 = -1;

	@ObfuscatedName("vd.bt")
	public int field7509 = 0;

	@ObfuscatedName("vd.bq")
	public int field7510 = 0;

	@ObfuscatedName("vd.bm")
	public int field7511 = 255;

	@ObfuscatedName("vd.bb")
	public int field7512 = 0;

	@ObfuscatedName("vd.be")
	public int field7466 = 0;

	@ObfuscatedName("vd.by")
	public int[] field7514;

	@ObfuscatedName("vd.bu")
	public boolean field7515 = true;

	@ObfuscatedName("vd.bw")
	public boolean field7516 = false;

	@ObfuscatedName("vd.bo")
	public boolean field7453 = true;

	@ObfuscatedName("vd.bz")
	public boolean field7518 = false;

	@ObfuscatedName("vd.bv")
	public IterableMap params;

	@ObfuscatedName("vd.br")
	public boolean field7520 = false;

	@ObfuscatedName("vd.bg")
	public int[] field7484;

	@ObfuscatedName("vd.ba")
	public int field7521 = 256;

	@ObfuscatedName("vd.bp")
	public int field7523 = 256;

	@ObfuscatedName("vd.bj")
	public boolean field7524 = false;

	@ObfuscatedName("vd.bs")
	public boolean field7525 = false;

	@ObfuscatedName("vd.cl")
	public LocTypeRelated field7526 = LocTypeRelated.field7439;

	@ObfuscatedName("vd.cg")
	public Cuboid field7468;

	public LocType(int id, LocTypeFactory factory, ConfigTypeList locs) {
		this.id = id;
		this.factory = factory;
		this.myList = locs;
		this.op = (String[]) this.factory.defaultOps.clone();
	}

	@ObfuscatedName("vd.e(Lalw;B)V")
	public void decode(Packet buf) {
		while (true) {
			int code = buf.g1();
			if (code == 0) {
				return;
			}
			this.decode(buf, code);
		}
	}

	@ObfuscatedName("vd.n(I)V")
	public void postDecode() {
		this.postDecodeActive();
		if (this.breakroutefinding) {
			this.blockwalk = 0;
		}
		if (!this.factory.allowMembers && this.field7518) {
			this.op = null;
			this.field7484 = null;
		}
	}

	@ObfuscatedName("vd.u(Lalw;II)V")
	public void decode(Packet buf, int code) {
		if (code == 1) {
			int shapes = buf.g1();
			this.shapes = new byte[shapes];
			this.models = new int[shapes][];
			for (int s = 0; s < shapes; s++) {
				this.shapes[s] = buf.g1b();
				int models = buf.g1();
				this.models[s] = new int[models];
				for (int m = 0; m < models; m++) {
					this.models[s][m] = buf.gSmart2or4null();
				}
			}
		} else if (code == 2) {
			this.name = buf.gjstr().intern();
		} else if (code == 14) {
			this.width = buf.g1();
		} else if (code == 15) {
			this.length = buf.g1();
		} else if (code == 17) {
			this.blockwalk = 0;
		} else if (code != 18) {
			if (code == 19) {
				this.active2 = buf.g1();
			} else if (code == 21) {
				this.hillskew = 1;
			} else if (code == 22) {
				this.sharelight = true;
			} else if (code == 23) {
				this.occlude = 1;
			} else if (code == 24) {
				int var7 = buf.gSmart2or4null();
				if (var7 != -1) {
					this.anim = new int[] { var7 };
				}
			} else if (code == 27) {
				this.blockwalk = 1;
			} else if (code == 28) {
				this.walloff = buf.g1() << 2;
			} else if (code == 29) {
				this.ambient = buf.g1b();
			} else if (code == 39) {
				this.contrast = buf.g1b();
			} else if (code >= 30 && code < 35) {
				this.op[code - 30] = buf.gjstr().intern();
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
			} else if (code == 44) {
				int var14 = buf.g2();
				int length = 0;
				for (int var16 = var14; var16 > 0; var16 >>= 0x1) {
					length++;
				}
				this.recolindices = new byte[length];
				byte var17 = 0;
				for (int index = 0; index < length; index++) {
					if ((var14 & 0x1 << index) > 0) {
						this.recolindices[index] = var17++;
					} else {
						this.recolindices[index] = -1;
					}
				}
			} else if (code == 45) {
				int var19 = buf.g2();
				int length = 0;
				for (int var21 = var19; var21 > 0; var21 >>= 0x1) {
					length++;
				}
				this.retexindices = new byte[length];
				byte var22 = 0;
				for (int index = 0; index < length; index++) {
					if ((var19 & 0x1 << index) > 0) {
						this.retexindices[index] = var22++;
					} else {
						this.retexindices[index] = -1;
					}
				}
			} else if (code == 62) {
				this.mirror = true;
			} else if (code == 64) {
				this.shadow = false;
			} else if (code == 65) {
				this.resizex = buf.g2();
			} else if (code == 66) {
				this.resizey = buf.g2();
			} else if (code == 67) {
				this.resizez = buf.g2();
			} else if (code == 69) {
				buf.g1();
			} else if (code == 70) {
				this.xoff = buf.g2s() << 2;
			} else if (code == 71) {
				this.yoff = buf.g2s() << 2;
			} else if (code == 72) {
				this.zoff = buf.g2s() << 2;
			} else if (code == 73) {
				this.forcedecor = true;
			} else if (code == 74) {
				this.breakroutefinding = true;
			} else if (code == 75) {
				this.field7503 = buf.g1();
			} else if (code == 77 || code == 92) {
				this.field7506 = buf.g2();
				if (this.field7506 == 65535) {
					this.field7506 = -1;
				}
				this.field7507 = buf.g2();
				if (this.field7507 == 65535) {
					this.field7507 = -1;
				}
				int var38 = -1;
				if (code == 92) {
					var38 = buf.gSmart2or4null();
				}
				int var39 = buf.gSmart1or2();
				this.field7505 = new int[var39 + 2];
				for (int var40 = 0; var40 <= var39; var40++) {
					this.field7505[var40] = buf.gSmart2or4null();
				}
				this.field7505[var39 + 1] = var38;
			} else if (code == 78) {
				this.field7508 = buf.g2();
				this.field7509 = buf.g1();
			} else if (code == 79) {
				this.field7512 = buf.g2();
				this.field7466 = buf.g2();
				this.field7509 = buf.g1();
				int var24 = buf.g1();
				this.field7514 = new int[var24];
				for (int var25 = 0; var25 < var24; var25++) {
					this.field7514[var25] = buf.g2();
				}
			} else if (code == 81) {
				this.hillskew = 2;
				this.field7472 = buf.g1() * 256;
			} else if (code == 82) {
				this.field7516 = true;
			} else if (code == 88) {
				this.field7453 = false;
			} else if (code == 89) {
				this.field7515 = false;
			} else if (code == 91) {
				this.field7518 = true;
			} else if (code == 93) {
				this.hillskew = 3;
				this.field7472 = buf.g2();
			} else if (code == 94) {
				this.hillskew = 4;
			} else if (code == 95) {
				this.hillskew = 5;
				this.field7472 = buf.g2s();
			} else if (code == 97) {
				this.field7487 = true;
			} else if (code == 98) {
				this.field7520 = true;
			} else if (code == 99 || code == 100) {
				buf.g1();
				buf.g2();
			} else if (code == 101) {
				this.field7488 = buf.g1();
			} else if (code == 102) {
				this.field7486 = buf.g2();
			} else if (code == 103) {
				this.occlude = 0;
			} else if (code == 104) {
				this.field7511 = buf.g1();
			} else if (code == 105) {
				this.field7504 = true;
			} else if (code == 106) {
				int var26 = buf.g1();
				int var27 = 0;
				this.anim = new int[var26];
				this.field7478 = new int[var26];
				for (int var28 = 0; var28 < var26; var28++) {
					this.anim[var28] = buf.gSmart2or4null();
					var27 += this.field7478[var28] = buf.g1();
				}
				for (int var29 = 0; var29 < var26; var29++) {
					this.field7478[var29] = this.field7478[var29] * 65535 / var27;
				}
			} else if (code == 107) {
				this.field7485 = buf.g2();
			} else if (code >= 150 && code < 155) {
				this.op[code - 150] = buf.gjstr().intern();
				if (!this.factory.allowMembers) {
					this.op[code - 150] = null;
				}
			} else if (code == 160) {
				int var30 = buf.g1();
				this.field7484 = new int[var30];
				for (int var31 = 0; var31 < var30; var31++) {
					this.field7484[var31] = buf.g2();
				}
			} else if (code == 162) {
				this.hillskew = 3;
				this.field7472 = buf.g4s();
			} else if (code == 163) {
				this.field7469 = buf.g1b();
				this.field7464 = buf.g1b();
				this.field7465 = buf.g1b();
				this.field7493 = buf.g1b();
			} else if (code == 164) {
				this.field7522 = buf.g2s();
			} else if (code == 165) {
				this.field7449 = buf.g2s();
			} else if (code == 166) {
				this.field7500 = buf.g2s();
			} else if (code == 167) {
				this.field7448 = buf.g2();
			} else if (code != 168 && code != 169) {
				if (code == 170) {
					this.field7475 = buf.gSmart1or2();
				} else if (code == 171) {
					this.field7476 = buf.gSmart1or2();
				} else if (code == 173) {
					this.field7521 = buf.g2();
					this.field7523 = buf.g2();
				} else if (code == 177) {
					this.field7524 = true;
				} else if (code == 178) {
					this.field7510 = buf.g1();
				} else if (code == 186) {
					this.field7526 = (LocTypeRelated) SerializableEnums.decode(LocTypeRelated.method9002(), buf.g1());
				} else if (code != 188) {
					if (code == 189) {
						this.field7525 = true;
					} else if (code >= 190 && code < 196) {
						if (this.field7497 == null) {
							this.field7497 = new int[6];
							Arrays.fill(this.field7497, -1);
						}
						this.field7497[code - 190] = buf.g2();
					} else if (code == 196) {
						SerializableEnums.decode(LocTypeRelated3.method208(), buf.g1());
					} else if (code == 197) {
						SerializableEnums.decode(LocTypeRelated2.method10203(), buf.g1());
					} else if (code != 198 && code != 199) {
						if (code == 200) {
							this.field7479 = true;
						} else if (code == 201) {
							this.field7468 = new Cuboid();
							this.field7468.field4252 = buf.gSmart1or2s();
							this.field7468.field4253 = buf.gSmart1or2s();
							this.field7468.field4248 = buf.gSmart1or2s();
							this.field7468.field4249 = buf.gSmart1or2s();
							this.field7468.field4250 = buf.gSmart1or2s();
							this.field7468.field4251 = buf.gSmart1or2s();
						} else if (code == 249) {
							int var32 = buf.g1();
							if (this.params == null) {
								int var33 = IntMath.bitceil(var32);
								this.params = new IterableMap(var33);
							}
							for (int var34 = 0; var34 < var32; var34++) {
								boolean var35 = buf.g1() == 1;
								int var36 = buf.g3();
								Node var37;
								if (var35) {
									var37 = new ObjectWrapper(buf.gjstr().intern());
								} else {
									var37 = new IntWrapper(buf.g4s());
								}
								this.params.method14501(var37, (long) var36);
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("vd.z(I)V")
	public void postDecodeActive() {
		if (this.active2 == -1) {
			this.active2 = 0;
			if (this.shapes != null && this.shapes.length == 1 && LocShape.CENTREPIECE_STRAIGHT.id == this.shapes[0]) {
				this.active2 = 1;
			}
			for (int var1 = 0; var1 < 5; var1++) {
				if (this.op[var1] != null) {
					this.active2 = 1;
					break;
				}
			}
		}
		if (this.field7503 == -1) {
			this.field7503 = this.blockwalk == 0 ? 0 : 1;
		}
		if (this.method9504() || this.field7520 || this.field7505 != null) {
			this.field7524 = true;
		}
		if (this.active2 <= 0 && LocTypeRelated.field7438 == this.field7526) {
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
					arg0.field7958 = this.models[var3][var4];
				}
			}
		}
		return var2;
	}

	@ObfuscatedName("vd.c(Ldh;IIILcb;Lcb;IIIZLvp;B)Labg;")
	public final synchronized Pair method9475(Renderer arg0, int arg1, int arg2, int arg3, FloorModel arg4, FloorModel arg5, int arg6, int arg7, int arg8, boolean arg9, LocTypeCustomisation arg10) {
		if (LocShape.isWallDecor(arg2)) {
			arg2 = LocShape.WALLDECOR_STRAIGHT_NOOFFSET.id;
		}
		long var12 = (long) ((this.id << 10) + (arg2 << 3) + arg3);
		long var14 = var12 | (long) (arg0.field1595 << 29);
		if (arg10 != null) {
			var14 |= arg10.field7444 << 32;
		}
		int var16 = arg1;
		if (this.hillskew == 3) {
			var16 = arg1 | 0x7;
		} else {
			if (this.hillskew != 0 || this.field7449 != 0) {
				var16 = arg1 | 0x2;
			}
			if (this.field7522 != 0) {
				var16 |= 0x1;
			}
			if (this.field7500 != 0) {
				var16 |= 0x4;
			}
		}
		if (arg9) {
			var16 |= 0x40000;
		}
		boolean var17 = this.hillskew != 0 && (arg4 != null || arg5 != null);
		boolean var18 = this.field7522 != 0 || this.field7449 != 0 || this.field7500 != 0;
		WeightedCache var19 = this.factory.modelCacheDynamic;
		Pair var20;
		synchronized (this.factory.modelCacheDynamic) {
			var20 = (Pair) this.factory.modelCacheDynamic.get(var14);
		}
		Model var22 = (Model) (var20 == null ? null : var20.field8737);
		HardShadow var23 = null;
		if (var22 != null && arg0.method2394(var22.method1691(), var16) == 0) {
			var23 = (HardShadow) var20.field8738;
			if (arg9 && var23 == null && !var17 && !var18) {
				var23 = (HardShadow) (var20.field8738 = var22.method1726(null));
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
			WeightedCache var26 = this.factory.modelCacheDynamic;
			synchronized (this.factory.modelCacheDynamic) {
				this.factory.modelCacheDynamic.put(var25, var14);
			}
		}
		Model var28;
		if (var17 || var18) {
			var28 = var22.method1773((byte) 0, var16, true);
			if (var17) {
				var28.method1700(this.hillskew, this.field7472, arg4, arg5, arg6, arg7, arg8);
			}
			if (var18) {
				var28.method1805(this.field7522, this.field7449, this.field7500);
			}
			if (arg9) {
				var23 = var28.method1726(null);
			}
			var28.method1690(arg1);
		} else {
			var28 = var22.method1773((byte) 0, arg1, true);
		}
		this.factory.field7529.field8737 = var28;
		this.factory.field7529.field8738 = var23;
		return this.factory.field7529;
	}

	@ObfuscatedName("vd.r(Ldh;IIILcb;Lcb;IIILaaq;Lvp;B)Ldo;")
	public final synchronized Model method9470(Renderer arg0, int arg1, int arg2, int arg3, FloorModel arg4, FloorModel arg5, int arg6, int arg7, int arg8, AnimationWrapper arg9, LocTypeCustomisation arg10) {
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
		if (this.hillskew == 3) {
			arg1 |= 0x7;
		} else {
			if (this.hillskew != 0 || this.field7449 != 0) {
				arg1 |= 0x2;
			}
			if (this.field7522 != 0) {
				arg1 |= 0x1;
			}
			if (this.field7500 != 0) {
				arg1 |= 0x4;
			}
		}
		if (LocShape.CENTREPIECE_STRAIGHT.id == arg2 && arg3 > 3) {
			arg1 |= 0x5;
		}
		WeightedCache var17 = this.factory.field7532;
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
			WeightedCache var20 = this.factory.field7532;
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
		if (this.hillskew != 0) {
			if (!var22) {
				var18 = var18.method1773((byte) 3, arg1, true);
				var22 = true;
			}
			var18.method1700(this.hillskew, this.field7472, arg4, arg5, arg6, arg7, arg8);
		}
		if (this.field7522 != 0 || this.field7449 != 0 || this.field7500 != 0) {
			if (!var22) {
				var18 = var18.method1773((byte) 3, arg1, true);
				var22 = true;
			}
			var18.method1805(this.field7522, this.field7449, this.field7500);
		}
		if (var22) {
			var18.method1690(var14);
		}
		return var18;
	}

	@ObfuscatedName("vd.v(Ldh;IIILvp;I)Ldo;")
	public Model method9476(Renderer arg0, int arg1, int arg2, int arg3, LocTypeCustomisation arg4) {
		int var6 = this.ambient + 64;
		int var7 = this.contrast * 5 + 850;
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
		if (this.field7493 != 0) {
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
				WeightedCache var18 = this.factory.modelCacheStatic;
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
							if (var21.field1372 < 13) {
								var21.method1947(2);
							}
							if (var14 > 1) {
								this.factory.field7535[var23] = var21;
							}
							var23++;
						}
					}
					var10 = arg0.createModel(var21, var20, this.factory.field7536, var6, var7);
					WeightedCache var26 = this.factory.modelCacheStatic;
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
			var28.method1805(180, 0, -180);
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
					var28.method1859(this.recol_s[var31], var30[var31]);
				} else {
					var28.method1859(this.recol_s[var31], clientpalette[this.recol_d_palette[var31] & 0xFF]);
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
				var28.method1744(this.retex_s[var33], var32[var33]);
			}
		}
		if (this.field7493 != 0) {
			var28.method1745(this.field7469, this.field7464, this.field7465, this.field7493 & 0xFF);
		}
		if (this.resizex != 128 || this.resizey != 128 || this.resizez != 128) {
			var28.method1699(this.resizex, this.resizey, this.resizez);
		}
		if (this.xoff != 0 || this.yoff != 0 || this.zoff != 0) {
			var28.method1805(this.xoff, this.yoff, this.zoff);
		}
		var28.method1690(var8);
		return var28;
	}

	@ObfuscatedName("vd.o(Lem;Lep;I)Lvd;")
	public final LocType method9477(VariableTypeProvider arg0, VarIntDomain arg1) {
		int var3 = -1;
		if (this.field7506 != -1) {
			VarBitType var4 = arg0.getVarBitType(this.field7506);
			if (var4 != null) {
				var3 = arg1.getVarBitValue(var4);
			}
		} else if (this.field7507 != -1) {
			VarType var5 = arg0.getVarType(VarDomainType.PLAYER, this.field7507);
			if (var5 != null) {
				var3 = arg1.getVarValueInt(var5);
			}
		}
		if (var3 >= 0 && var3 < this.field7505.length - 1) {
			return this.field7505[var3] == -1 ? null : (LocType) this.myList.list(this.field7505[var3]);
		} else {
			int var6 = this.field7505[this.field7505.length - 1];
			return var6 == -1 ? null : (LocType) this.myList.list(var6);
		}
	}

	@ObfuscatedName("vd.s(III)I")
	public int method9481(int arg0, int arg1) {
		if (this.params == null) {
			return arg1;
		} else {
			IntWrapper var3 = (IntWrapper) this.params.method14495((long) arg0);
			return var3 == null ? arg1 : var3.field11442;
		}
	}

	@ObfuscatedName("vd.y(ILjava/lang/String;B)Ljava/lang/String;")
	public String method9479(int arg0, String arg1) {
		if (this.params == null) {
			return arg1;
		} else {
			ObjectWrapper var3 = (ObjectWrapper) this.params.method14495((long) arg0);
			return var3 == null ? arg1 : (String) var3.field11436;
		}
	}

	@ObfuscatedName("vd.q(I)Z")
	public boolean method9480() {
		if (this.field7505 == null) {
			return this.field7508 != -1 || this.field7514 != null;
		}
		for (int var1 = 0; var1 < this.field7505.length; var1++) {
			if (this.field7505[var1] != -1) {
				LocType var2 = (LocType) this.myList.list(this.field7505[var1]);
				if (var2.field7508 != -1 || var2.field7514 != null) {
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
				if (var1 <= this.field7478[var2]) {
					return this.anim[var2];
				}
				var1 -= this.field7478[var2];
			}
		}
		return -1;
	}

	@ObfuscatedName("vd.a(I)[I")
	public int[] method9484() {
		return this.anim;
	}

	@ObfuscatedName("vd.g(IB)Z")
	public boolean method9493(int arg0) {
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
	public int method9486(int arg0) {
		return this.field7497 == null ? -1 : this.field7497[arg0];
	}
}
