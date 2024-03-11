package com.jagex;

import com.jagex.game.config.vartype.VarType;
import com.jagex.game.config.vartype.bit.VarBitType;
import com.jagex.game.config.vartype.constants.VarDomainType;
import deob.ObfuscatedName;

import java.util.Arrays;

@ObfuscatedName("if")
public class NPCType implements ConfigType {

	@ObfuscatedName("if.f")
	public static short[] field2694 = new short[256];

	@ObfuscatedName("if.w")
	public NPCTypeFactory field2695;

	@ObfuscatedName("if.l")
	public ConfigTypeList field2696;

	@ObfuscatedName("if.u")
	public int field2732;

	@ObfuscatedName("if.z")
	public String field2703 = "null";

	@ObfuscatedName("if.p")
	public int field2699 = 1;

	@ObfuscatedName("if.d")
	public int[] field2752;

	@ObfuscatedName("if.c")
	public int[] field2701;

	@ObfuscatedName("if.r")
	public int[][] field2709;

	@ObfuscatedName("if.v")
	public int field2762 = -1;

	@ObfuscatedName("if.o")
	public short[] field2704;

	@ObfuscatedName("if.s")
	public short[] field2705;

	@ObfuscatedName("if.y")
	public byte[] field2733;

	@ObfuscatedName("if.q")
	public short[] field2707;

	@ObfuscatedName("if.x")
	public short[] field2708;

	@ObfuscatedName("if.b")
	public byte[] field2760;

	@ObfuscatedName("if.h")
	public byte[] field2715;

	@ObfuscatedName("if.a")
	public byte field2711;

	@ObfuscatedName("if.g")
	public byte field2712;

	@ObfuscatedName("if.i")
	public byte field2698;

	@ObfuscatedName("if.j")
	public byte field2714 = 0;

	@ObfuscatedName("if.t")
	public String[] field2692;

	@ObfuscatedName("if.ae")
	public int[] field2716;

	@ObfuscatedName("if.ag")
	public int field2717 = -1;

	@ObfuscatedName("if.ah")
	public boolean field2718 = true;

	@ObfuscatedName("if.al")
	public int field2719 = -1;

	@ObfuscatedName("if.ac")
	public int field2720 = 128;

	@ObfuscatedName("if.ai")
	public int field2721 = 128;

	@ObfuscatedName("if.aw")
	public boolean field2722 = false;

	@ObfuscatedName("if.as")
	public boolean field2723 = false;

	@ObfuscatedName("if.at")
	public boolean field2756 = false;

	@ObfuscatedName("if.ad")
	public int field2725 = 0;

	@ObfuscatedName("if.am")
	public int field2726 = 0;

	@ObfuscatedName("if.au")
	public int[] field2738 = null;

	@ObfuscatedName("if.ar")
	public short[] field2728 = null;

	@ObfuscatedName("if.ap")
	public int field2706 = -1;

	@ObfuscatedName("if.aq")
	public int field2731 = 32;

	@ObfuscatedName("if.ax")
	public int[] field2735;

	@ObfuscatedName("if.av")
	public int field2730 = -1;

	@ObfuscatedName("if.ao")
	public int field2755 = -1;

	@ObfuscatedName("if.aj")
	public boolean field2734 = true;

	@ObfuscatedName("if.ay")
	public boolean field2736 = true;

	@ObfuscatedName("if.ab")
	public boolean field2710 = true;

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
	public int field2751 = 0;

	@ObfuscatedName("if.bq")
	public int field2742 = 255;

	@ObfuscatedName("if.bm")
	public IterableMap field2753;

	@ObfuscatedName("if.bb")
	public int field2754 = -1;

	@ObfuscatedName("if.be")
	public CompassPoint field2727 = CompassPoint.field8307;

	@ObfuscatedName("if.by")
	public int field2763 = -1;

	@ObfuscatedName("if.bu")
	public int[] field2757;

	@ObfuscatedName("if.bw")
	public byte field2758 = -1;

	@ObfuscatedName("if.bo")
	public int field2759 = -1;

	@ObfuscatedName("if.bz")
	public Cuboid field2724;

	@ObfuscatedName("if.bv")
	public int field2761 = 256;

	@ObfuscatedName("if.br")
	public int field2700 = 256;

	@ObfuscatedName("if.bg")
	public int field2713 = 0;

	@ObfuscatedName("if.ba")
	public boolean field2766 = true;

	@ObfuscatedName("if.bp")
	public int field2765 = 0;

	@ObfuscatedName("if.bj")
	public boolean field2690 = false;

	public NPCType(int arg0, NPCTypeFactory arg1, ConfigTypeList arg2) {
		this.field2732 = arg0;
		this.field2695 = arg1;
		this.field2696 = arg2;
		this.field2692 = (String[]) this.field2695.field2774.clone();
	}

	@ObfuscatedName("if.e(Lalw;B)V")
	public void decode(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.method4541(arg0, var2);
		}
	}

	@ObfuscatedName("if.u(Lalw;II)V")
	public void method4541(Packet arg0, int arg1) {
		if (arg1 == 1) {
			int var3 = arg0.g1();
			this.field2752 = new int[var3];
			for (int var4 = 0; var4 < var3; var4++) {
				this.field2752[var4] = arg0.gSmart2or4null();
			}
		} else if (arg1 == 2) {
			this.field2703 = arg0.gjstr();
		} else if (arg1 == 12) {
			this.field2699 = arg0.g1();
		} else if (arg1 >= 30 && arg1 < 35) {
			this.field2692[arg1 - 30] = arg0.gjstr();
		} else if (arg1 == 40) {
			int var5 = arg0.g1();
			this.field2704 = new short[var5];
			this.field2705 = new short[var5];
			for (int var6 = 0; var6 < var5; var6++) {
				this.field2704[var6] = (short) arg0.g2();
				this.field2705[var6] = (short) arg0.g2();
			}
		} else if (arg1 == 41) {
			int var7 = arg0.g1();
			this.field2707 = new short[var7];
			this.field2708 = new short[var7];
			for (int var8 = 0; var8 < var7; var8++) {
				this.field2707[var8] = (short) arg0.g2();
				this.field2708[var8] = (short) arg0.g2();
			}
		} else if (arg1 == 42) {
			int var9 = arg0.g1();
			this.field2733 = new byte[var9];
			for (int var10 = 0; var10 < var9; var10++) {
				this.field2733[var10] = arg0.g1b();
			}
		} else if (arg1 == 44) {
			int var11 = arg0.g2();
			int var12 = 0;
			for (int var13 = var11; var13 > 0; var13 >>= 0x1) {
				var12++;
			}
			this.field2760 = new byte[var12];
			byte var14 = 0;
			for (int var15 = 0; var15 < var12; var15++) {
				if ((var11 & 0x1 << var15) > 0) {
					this.field2760[var15] = var14++;
				} else {
					this.field2760[var15] = -1;
				}
			}
		} else if (arg1 == 45) {
			int var16 = arg0.g2();
			int var17 = 0;
			for (int var18 = var16; var18 > 0; var18 >>= 0x1) {
				var17++;
			}
			this.field2715 = new byte[var17];
			byte var19 = 0;
			for (int var20 = 0; var20 < var17; var20++) {
				if ((var16 & 0x1 << var20) > 0) {
					this.field2715[var20] = var19++;
				} else {
					this.field2715[var20] = -1;
				}
			}
		} else if (arg1 == 60) {
			int var21 = arg0.g1();
			this.field2701 = new int[var21];
			for (int var22 = 0; var22 < var21; var22++) {
				this.field2701[var22] = arg0.gSmart2or4null();
			}
		} else if (arg1 == 93) {
			this.field2718 = false;
		} else if (arg1 == 95) {
			this.field2719 = arg0.g2();
		} else if (arg1 == 97) {
			this.field2720 = arg0.g2();
		} else if (arg1 == 98) {
			this.field2721 = arg0.g2();
		} else if (arg1 == 99) {
			this.field2722 = true;
		} else if (arg1 == 100) {
			this.field2725 = arg0.g1b();
		} else if (arg1 == 101) {
			this.field2726 = arg0.g1b() * 5;
		} else if (arg1 == 102) {
			int var23 = arg0.g1();
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
					this.field2738[var26] = arg0.gSmart2or4null();
					this.field2728[var26] = (short) arg0.gSmart1or2null();
				}
			}
		} else if (arg1 == 103) {
			this.field2731 = arg0.g2();
		} else if (arg1 == 106 || arg1 == 118) {
			this.field2730 = arg0.g2();
			if (this.field2730 == 65535) {
				this.field2730 = -1;
			}
			this.field2755 = arg0.g2();
			if (this.field2755 == 65535) {
				this.field2755 = -1;
			}
			int var40 = -1;
			if (arg1 == 118) {
				var40 = arg0.g2();
				if (var40 == 65535) {
					var40 = -1;
				}
			}
			int var41 = arg0.gSmart1or2();
			this.field2735 = new int[var41 + 2];
			for (int var42 = 0; var42 <= var41; var42++) {
				this.field2735[var42] = arg0.g2();
				if (this.field2735[var42] == 65535) {
					this.field2735[var42] = -1;
				}
			}
			this.field2735[var41 + 1] = var40;
		} else if (arg1 == 107) {
			this.field2734 = false;
		} else if (arg1 == 109) {
			this.field2736 = false;
		} else if (arg1 == 111) {
			this.field2710 = false;
		} else if (arg1 == 113) {
			this.field2737 = (short) arg0.g2();
			this.field2729 = (short) arg0.g2();
		} else if (arg1 == 114) {
			this.field2739 = arg0.g1b();
			this.field2740 = arg0.g1b();
		} else if (arg1 == 119) {
			this.field2743 = arg0.g1b();
		} else if (arg1 == 121) {
			this.field2709 = new int[this.field2752.length][];
			int var27 = arg0.g1();
			for (int var28 = 0; var28 < var27; var28++) {
				int var29 = arg0.g1();
				int[] var30 = this.field2709[var29] = new int[3];
				var30[0] = arg0.g1b();
				var30[1] = arg0.g1b();
				var30[2] = arg0.g1b();
			}
		} else if (arg1 == 123) {
			this.field2754 = arg0.g2();
		} else if (arg1 == 125) {
			this.field2727 = (CompassPoint) SerializableEnums.decode(CompassPoint.method9573(), arg0.g1b());
		} else if (arg1 == 127) {
			this.field2762 = arg0.g2();
		} else if (arg1 == 128) {
			SerializableEnums.decode(MoveSpeed.method13901(), arg0.g1());
		} else if (arg1 == 134) {
			this.field2746 = arg0.g2();
			if (this.field2746 == 65535) {
				this.field2746 = -1;
			}
			this.field2747 = arg0.g2();
			if (this.field2747 == 65535) {
				this.field2747 = -1;
			}
			this.field2748 = arg0.g2();
			if (this.field2748 == 65535) {
				this.field2748 = -1;
			}
			this.field2749 = arg0.g2();
			if (this.field2749 == 65535) {
				this.field2749 = -1;
			}
			this.field2750 = arg0.g1();
		} else if (arg1 == 135 || arg1 == 136) {
			arg0.g1();
			arg0.g2();
		} else if (arg1 == 137) {
			this.field2717 = arg0.g2();
		} else if (arg1 == 138) {
			this.field2706 = arg0.gSmart2or4null();
		} else if (arg1 == 140) {
			this.field2742 = arg0.g1();
		} else if (arg1 == 141) {
			this.field2756 = true;
		} else if (arg1 == 142) {
			this.field2763 = arg0.g2();
		} else if (arg1 == 143) {
			this.field2723 = true;
		} else if (arg1 >= 150 && arg1 < 155) {
			this.field2692[arg1 - 150] = arg0.gjstr();
			if (!this.field2695.field2769) {
				this.field2692[arg1 - 150] = null;
			}
		} else if (arg1 == 155) {
			this.field2711 = arg0.g1b();
			this.field2712 = arg0.g1b();
			this.field2698 = arg0.g1b();
			this.field2714 = arg0.g1b();
		} else if (arg1 == 158) {
			this.field2758 = 1;
		} else if (arg1 == 159) {
			this.field2758 = 0;
		} else if (arg1 == 160) {
			int var31 = arg0.g1();
			this.field2757 = new int[var31];
			for (int var32 = 0; var32 < var31; var32++) {
				this.field2757[var32] = arg0.g2();
			}
		} else if (arg1 != 162) {
			if (arg1 == 163) {
				this.field2759 = arg0.g1();
			} else if (arg1 == 164) {
				this.field2761 = arg0.g2();
				this.field2700 = arg0.g2();
			} else if (arg1 == 165) {
				this.field2713 = arg0.g1();
			} else if (arg1 == 168) {
				this.field2751 = arg0.g1();
			} else if (arg1 == 169) {
				this.field2766 = false;
			} else if (arg1 >= 170 && arg1 < 176) {
				if (this.field2716 == null) {
					this.field2716 = new int[6];
					Arrays.fill(this.field2716, -1);
				}
				int var33 = arg0.g2();
				if (var33 == 65535) {
					var33 = -1;
				}
				this.field2716[arg1 - 170] = var33;
			} else if (arg1 != 178) {
				if (arg1 == 179) {
					this.field2724 = new Cuboid();
					this.field2724.field4252 = arg0.gSmart1or2s();
					this.field2724.field4253 = arg0.gSmart1or2s();
					this.field2724.field4248 = arg0.gSmart1or2s();
					this.field2724.field4249 = arg0.gSmart1or2s();
					this.field2724.field4250 = arg0.gSmart1or2s();
					this.field2724.field4251 = arg0.gSmart1or2s();
				} else if (arg1 == 180) {
					this.field2765 = arg0.g1() & 0xFF;
				} else if (arg1 == 181) {
					this.field2741 = (short) arg0.g2();
					this.field2702 = (byte) arg0.g1();
				} else if (arg1 == 182) {
					this.field2690 = true;
				} else if (arg1 == 249) {
					int var34 = arg0.g1();
					if (this.field2753 == null) {
						int var35 = IntMath.bitceil(var34);
						this.field2753 = new IterableMap(var35);
					}
					for (int var36 = 0; var36 < var34; var36++) {
						boolean var37 = arg0.g1() == 1;
						int var38 = arg0.g3();
						Node var39;
						if (var37) {
							var39 = new ObjectWrapper(arg0.gjstr());
						} else {
							var39 = new IntWrapper(arg0.g4s());
						}
						this.field2753.method14501(var39, (long) var38);
					}
				}
			}
		}
	}

	@ObfuscatedName("if.n(I)V")
	public void postDecode() {
		if (this.field2752 == null) {
			this.field2752 = new int[0];
		}
		if (this.field2758 != -1) {
			return;
		}
		if (this.field2695 == null || ModeGame.RUNESCAPE == this.field2695.field2772) {
			this.field2758 = 1;
		} else {
			this.field2758 = 0;
		}
	}

	@ObfuscatedName("if.z(Ldh;ILaof;Lem;Lep;Laaq;Laaq;[Laaq;[IILia;I)Ldo;")
	public final Model method4542(Renderer arg0, int arg1, BASTypeList arg2, VariableTypeProvider arg3, VarIntDomain arg4, AnimationWrapper arg5, AnimationWrapper arg6, AnimationWrapper[] arg7, int[] arg8, int arg9, NpcTypeCustomization arg10) {
		return this.method4543(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, this.field2762, true);
	}

	@ObfuscatedName("if.p(Ldh;ILaof;Lem;Lep;Laaq;Laaq;[Laaq;[IILia;IZB)Ldo;")
	public final Model method4543(Renderer arg0, int arg1, BASTypeList arg2, VariableTypeProvider arg3, VarIntDomain arg4, AnimationWrapper arg5, AnimationWrapper arg6, AnimationWrapper[] arg7, int[] arg8, int arg9, NpcTypeCustomization arg10, int arg11, boolean arg12) {
		if (this.field2735 != null) {
			NPCType var14 = this.method4547(arg3, arg4);
			return var14 == null ? null : var14.method4543(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12);
		}
		int var15 = arg1;
		if (this.field2721 != 128) {
			var15 = arg1 | 0x2;
		}
		if (this.field2720 != 128) {
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
		long var19 = (long) (this.field2732 | arg0.field1595 << 16);
		if (arg10 != null) {
			var19 |= arg10.field2688 << 24;
		}
		WeightedCache var21 = this.field2695.field2771;
		Model var22;
		synchronized (this.field2695.field2771) {
			var22 = (Model) this.field2695.field2771.method2930(var19);
		}
		BASType var24 = null;
		if (!arg12 && arg11 != -1) {
			var24 = (BASType) arg2.get(arg11);
		} else if (this.field2762 != -1) {
			var24 = (BASType) arg2.get(this.field2762);
		}
		if (var22 == null || (var22.method1691() & var15) != var15) {
			if (var22 != null) {
				var15 |= var22.method1691();
			}
			int var25 = var15;
			if (this.field2704 != null) {
				var25 = var15 | 0x4000;
			}
			if (this.field2707 != null) {
				var25 |= 0x8000;
			}
			if (this.field2714 != 0) {
				var25 |= 0x80000;
			}
			int[] var26 = arg10 == null || arg10.field2689 == null ? this.field2752 : arg10.field2689;
			boolean var27 = false;
			Js5 var28 = this.field2695.field2770;
			synchronized (this.field2695.field2770) {
				for (int var29 = 0; var29 < var26.length; var29++) {
					if (var26[var29] != -1 && !this.field2695.field2770.method6888(var26[var29], 0)) {
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
					Js5 var33 = this.field2695.field2770;
					synchronized (this.field2695.field2770) {
						var31[var32] = ModelUnlit.method1931(this.field2695.field2770, var26[var32], 0);
					}
					if (var31[var32] != null) {
						if (var31[var32].field1372 < 13) {
							var31[var32].method1947(2);
						}
						if (this.field2709 != null && this.field2709[var32] != null) {
							var31[var32].method1945(this.field2709[var32][0], this.field2709[var32][1], this.field2709[var32][2]);
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
			var22 = arg0.method2211(var43, var25, this.field2695.field2773, this.field2725 + 64, this.field2726 + 850);
			if (this.field2704 != null) {
				short[] var44;
				if (arg10 == null || arg10.field2684 == null) {
					var44 = this.field2705;
				} else {
					var44 = arg10.field2684;
				}
				for (int var45 = 0; var45 < this.field2704.length; var45++) {
					if (this.field2733 == null || var45 >= this.field2733.length) {
						var22.method1859(this.field2704[var45], var44[var45]);
					} else {
						var22.method1859(this.field2704[var45], field2694[this.field2733[var45] & 0xFF]);
					}
				}
			}
			if (this.field2707 != null) {
				short[] var46;
				if (arg10 == null || arg10.field2685 == null) {
					var46 = this.field2708;
				} else {
					var46 = arg10.field2685;
				}
				for (int var47 = 0; var47 < this.field2707.length; var47++) {
					var22.method1744(this.field2707[var47], var46[var47]);
				}
			}
			if (this.field2714 != 0) {
				var22.method1745(this.field2711, this.field2712, this.field2698, this.field2714 & 0xFF);
			}
			var22.method1736();
			var22.method1690(var15);
			WeightedCache var48 = this.field2695.field2771;
			synchronized (this.field2695.field2771) {
				this.field2695.field2771.method2921(var22, var19);
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
		if (this.field2720 != 128 || this.field2721 != 128) {
			var50.method1699(this.field2720, this.field2721, this.field2720);
		}
		var50.method1690(arg1);
		return var50;
	}

	@ObfuscatedName("if.d(Ldh;ILem;Lep;Laaq;Lia;S)Ldo;")
	public final Model method4544(Renderer arg0, int arg1, VariableTypeProvider arg2, VarIntDomain arg3, AnimationWrapper arg4, NpcTypeCustomization arg5) {
		if (this.field2735 != null) {
			NPCType var7 = this.method4547(arg2, arg3);
			return var7 == null ? null : var7.method4544(arg0, arg1, arg2, arg3, arg4, arg5);
		} else if (this.field2701 == null && (arg5 == null || arg5.field2689 == null)) {
			return null;
		} else {
			int var8 = arg1;
			if (arg4 != null) {
				var8 = arg1 | arg4.method14358();
			}
			long var9 = (long) (this.field2732 | arg0.field1595 << 16);
			if (arg5 != null) {
				var9 |= arg5.field2688 << 24;
			}
			WeightedCache var11 = this.field2695.field2768;
			Model var12;
			synchronized (this.field2695.field2768) {
				var12 = (Model) this.field2695.field2768.method2930(var9);
			}
			if (var12 == null || (var12.method1691() & var8) != var8) {
				if (var12 != null) {
					var8 |= var12.method1691();
				}
				int var14 = var8;
				if (this.field2704 != null) {
					var14 = var8 | 0x4000;
				}
				if (this.field2707 != null) {
					var14 |= 0x8000;
				}
				if (this.field2714 != 0) {
					var14 |= 0x80000;
				}
				int[] var15 = arg5 == null || arg5.field2689 == null ? this.field2701 : arg5.field2689;
				boolean var16 = false;
				Js5 var17 = this.field2695.field2770;
				synchronized (this.field2695.field2770) {
					int var18 = 0;
					while (true) {
						if (var18 >= var15.length) {
							break;
						}
						if (!this.field2695.field2770.method6888(var15[var18], 0)) {
							var16 = true;
						}
						var18++;
					}
				}
				if (var16) {
					return null;
				}
				ModelUnlit[] var20 = new ModelUnlit[var15.length];
				Js5 var21 = this.field2695.field2770;
				synchronized (this.field2695.field2770) {
					for (int var22 = 0; var22 < var15.length; var22++) {
						var20[var22] = ModelUnlit.method1931(this.field2695.field2770, var15[var22], 0);
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
				var12 = arg0.method2211(var25, var14, this.field2695.field2773, 64, 768);
				if (this.field2704 != null) {
					short[] var26;
					if (arg5 == null || arg5.field2684 == null) {
						var26 = this.field2705;
					} else {
						var26 = arg5.field2684;
					}
					for (int var27 = 0; var27 < this.field2704.length; var27++) {
						if (this.field2733 == null || var27 >= this.field2733.length) {
							var12.method1859(this.field2704[var27], var26[var27]);
						} else {
							var12.method1859(this.field2704[var27], field2694[this.field2733[var27] & 0xFF]);
						}
					}
				}
				if (this.field2707 != null) {
					short[] var28;
					if (arg5 == null || arg5.field2685 == null) {
						var28 = this.field2708;
					} else {
						var28 = arg5.field2685;
					}
					for (int var29 = 0; var29 < this.field2707.length; var29++) {
						var12.method1744(this.field2707[var29], var28[var29]);
					}
				}
				if (this.field2714 != 0) {
					var12.method1745(this.field2711, this.field2712, this.field2698, this.field2714 & 0xFF);
				}
				var12.method1690(var8);
				WeightedCache var30 = this.field2695.field2768;
				synchronized (this.field2695.field2768) {
					this.field2695.field2768.method2921(var12, var9);
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
		if (this.field2752 == null) {
			return true;
		}
		boolean var1 = true;
		int[] var2 = this.field2752;
		for (int var3 = 0; var3 < var2.length; var3++) {
			int var4 = var2[var3];
			if (!this.field2695.field2770.method6888(var4, 0)) {
				var1 = false;
			}
		}
		return var1;
	}

	@ObfuscatedName("if.r(IIB)I")
	public int method4551(int arg0, int arg1) {
		if (this.field2753 == null) {
			return arg1;
		} else {
			IntWrapper var3 = (IntWrapper) this.field2753.method14495((long) arg0);
			return var3 == null ? arg1 : var3.field11442;
		}
	}

	@ObfuscatedName("if.v(ILjava/lang/String;I)Ljava/lang/String;")
	public String method4548(int arg0, String arg1) {
		if (this.field2753 == null) {
			return arg1;
		} else {
			ObjectWrapper var3 = (ObjectWrapper) this.field2753.method14495((long) arg0);
			return var3 == null ? arg1 : (String) var3.field11436;
		}
	}

	@ObfuscatedName("if.o(Lem;Lep;S)Lif;")
	public final NPCType method4547(VariableTypeProvider arg0, VarIntDomain arg1) {
		int var3 = -1;
		if (this.field2730 != -1) {
			VarBitType var4 = arg0.method694(this.field2730);
			if (var4 != null) {
				var3 = arg1.method678(var4);
			}
		} else if (this.field2755 != -1) {
			VarType var5 = arg0.method695(VarDomainType.PLAYER, this.field2755);
			if (var5 != null) {
				var3 = arg1.method679(var5);
			}
		}
		if (var3 >= 0 && var3 < this.field2735.length - 1) {
			return this.field2735[var3] == -1 ? null : (NPCType) this.field2696.get(this.field2735[var3]);
		} else {
			int var6 = this.field2735[this.field2735.length - 1];
			return var6 == -1 ? null : (NPCType) this.field2696.get(var6);
		}
	}

	@ObfuscatedName("if.s(Lem;Lep;I)Z")
	public boolean method4567(VariableTypeProvider arg0, VarIntDomain arg1) {
		if (this.field2735 == null) {
			return true;
		}
		int var3 = -1;
		if (this.field2730 != -1) {
			VarBitType var4 = arg0.method694(this.field2730);
			if (var4 != null) {
				var3 = arg1.method678(var4);
			}
		} else if (this.field2755 != -1) {
			VarType var5 = arg0.method695(VarDomainType.PLAYER, this.field2755);
			if (var5 != null) {
				var3 = arg1.method679(var5);
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
				NPCType var2 = (NPCType) this.field2696.get(this.field2735[var1]);
				if (var2.field2746 != -1 || var2.field2748 != -1 || var2.field2749 != -1) {
					return true;
				}
			}
		}
		return false;
	}

	@ObfuscatedName("if.q(II)I")
	public int method4563(int arg0) {
		return this.field2716 == null ? -1 : this.field2716[arg0];
	}
}
