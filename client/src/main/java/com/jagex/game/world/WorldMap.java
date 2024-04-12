package com.jagex.game.world;

import com.jagex.core.datastruct.SecondaryLinkedList;
import com.jagex.core.datastruct.HashTable;
import com.jagex.core.datastruct.LinkList;
import com.jagex.core.datastruct.SoftLruHashTable;
import com.jagex.core.io.Packet;
import com.jagex.core.utils.ColourUtils;
import com.jagex.core.utils.MonotonicTime;
import com.jagex.game.config.ConfigTypeList;
import com.jagex.game.config.defaults.WorldMapDefaults;
import com.jagex.game.config.flotype.FloorOverlayType;
import com.jagex.game.config.flotype.FloorOverlayTypeList;
import com.jagex.game.config.flutype.FloorUnderlayType;
import com.jagex.game.config.flutype.FloorUnderlayTypeList;
import com.jagex.game.config.loctype.LocType;
import com.jagex.game.config.loctype.LocTypeList;
import com.jagex.game.config.meltype.MapElementType;
import com.jagex.game.config.meltype.MapElementTypeList;
import com.jagex.game.config.msitype.MSIType;
import com.jagex.game.config.msitype.MSITypeList;
import com.jagex.game.config.vartype.VarIntDomain;
import com.jagex.game.config.vartype.VariableTypeProvider;
import com.jagex.game.world.entity.LocShape;
import com.jagex.graphics.CompassPoint;
import com.jagex.graphics.MaterialList;
import com.jagex.graphics.Toolkit;
import com.jagex.graphics.Sprite;
import com.jagex.js5.Js5;
import com.jagex.js5.Js5WorldMapGroup;
import deob.ObfuscatedName;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;

@ObfuscatedName("tf")
public class WorldMap {

	@ObfuscatedName("tf.e")
	public static ConfigTypeList field6839 = null;

	@ObfuscatedName("tf.n")
	public static ConfigTypeList field6849 = null;

	@ObfuscatedName("tf.m")
	public static LocTypeList field6785;

	@ObfuscatedName("tf.k")
	public static MapElementTypeList field6788;

	@ObfuscatedName("tf.f")
	public static MSITypeList field6789;

	@ObfuscatedName("tf.w")
	public static VarIntDomain field6790;

	@ObfuscatedName("tf.l")
	public static VariableTypeProvider field6791;

	@ObfuscatedName("tf.u")
	public static WorldMapDefaults worldMapDefaults;

	@ObfuscatedName("tf.z")
	public static WorldMapAreaMetadata currentWorldMap;

	@ObfuscatedName("tf.p")
	public static Js5 field6794;

	@ObfuscatedName("tf.d")
	public static Js5 field6795;

	@ObfuscatedName("tf.c")
	public static HashTable field6796 = new HashTable(16);

	@ObfuscatedName("tf.r")
	public static int field6797 = (int) (Math.random() * 11.0D) - 5;

	@ObfuscatedName("tf.v")
	public static int field6798 = (int) (Math.random() * 17.0D) - 8;

	@ObfuscatedName("tf.o")
	public static byte[][][] field6799;

	@ObfuscatedName("tf.s")
	public static int field6840;

	@ObfuscatedName("tf.y")
	public static int[] field6816 = new int[1];

	@ObfuscatedName("tf.q")
	public static byte[] field6850 = new byte[1];

	@ObfuscatedName("tf.x")
	public static float field6803;

	@ObfuscatedName("tf.b")
	public static float field6804;

	@ObfuscatedName("tf.h")
	public static WorldMapRelated field6805;

	@ObfuscatedName("tf.a")
	public static LinkList field6806 = new LinkList();

	@ObfuscatedName("tf.g")
	public static int field6786;

	@ObfuscatedName("tf.i")
	public static int field6808;

	@ObfuscatedName("tf.j")
	public static int field6812;

	@ObfuscatedName("tf.t")
	public static int field6810;

	@ObfuscatedName("tf.ae")
	public static int[] field6854;

	@ObfuscatedName("tf.ag")
	public static short[] field6809;

	@ObfuscatedName("tf.ah")
	public static byte[] field6813;

	@ObfuscatedName("tf.al")
	public static short[] field6814;

	@ObfuscatedName("tf.ac")
	public static short[] field6815;

	@ObfuscatedName("tf.ai")
	public static byte[] field6802;

	@ObfuscatedName("tf.aw")
	public static Object[] field6817;

	@ObfuscatedName("tf.as")
	public static byte[] field6818;

	@ObfuscatedName("tf.at")
	public static boolean field6819 = true;

	@ObfuscatedName("tf.ad")
	public static boolean[][] field6820;

	@ObfuscatedName("tf.am")
	public static int[][] field6800 = new int[][] { { 2, 2, 0, 0, 0, 0 }, { 2, 2, 2, 0, 0, 0 }, { 1, 2, 2, 2, 0, 0 }, { 1, 1, 1, 2, 2, 0 }, { 1, 1, 1, 2, 2, 2 }, { 1, 1, 1, 1, 2, 2 } };

	@ObfuscatedName("tf.au")
	public static final int NORTH = CompassPoint.NORTH.getId();

	@ObfuscatedName("tf.ar")
	public static final int NORTHWEST = CompassPoint.NORTHWEST.getId();

	@ObfuscatedName("tf.ap")
	public static final int NORTHEAST = CompassPoint.NORTHEAST.getId();

	@ObfuscatedName("tf.aq")
	public static final int SOUTHWEST = CompassPoint.SOUTHWEST.getId();

	@ObfuscatedName("tf.ax")
	public static final int SOUTH = CompassPoint.SOUTH.getId();

	@ObfuscatedName("tf.av")
	public static final int WEST = CompassPoint.WEST.getId();

	@ObfuscatedName("tf.ao")
	public static final int EAST = CompassPoint.EAST.getId();

	@ObfuscatedName("tf.aj")
	public static final int SOUTHEAST = CompassPoint.SOUTHEAST.getId();

	@ObfuscatedName("tf.ay")
	public static java.util.HashMap[][][] field6830;

	@ObfuscatedName("tf.ab")
	public static SoftLruHashTable field6831 = new SoftLruHashTable(4096, 256);

	@ObfuscatedName("tf.az")
	public static SoftLruHashTable field6832 = new SoftLruHashTable(4096, 1024);

	@ObfuscatedName("tf.aa")
	public static SoftLruHashTable field6833 = field6831;

	@ObfuscatedName("tf.ak")
	public static ArrayList field6835 = new ArrayList();

	@ObfuscatedName("tf.an")
	public static int field6836 = 262144;

	@ObfuscatedName("tf.bf")
	public static int[] field6838;

	@ObfuscatedName("tf.bl")
	public static int field6793 = 0;

	@ObfuscatedName("tf.bk")
	public static int field6828 = 5;

	@ObfuscatedName("tf.bh")
	public static Packet field6821 = null;

	@ObfuscatedName("tf.bx")
	public static Packet field6841 = null;

	@ObfuscatedName("tf.bd")
	public static boolean field6842 = true;

	@ObfuscatedName("tf.bc")
	public static int[] field6787;

	@ObfuscatedName("tf.bi")
	public static int[] field6844;

	@ObfuscatedName("tf.bn")
	public static int field6845;

	@ObfuscatedName("tf.bt")
	public static int field6846;


	@ObfuscatedName("tf.bq")
	public static int field6847;

	@ObfuscatedName("tf.bm")
	public static int field6848;

	@ObfuscatedName("tf.bb")
	public static int field6801;

	@ObfuscatedName("tf.be")
	public static int field6837;

	@ObfuscatedName("tf.by")
	public static int field6851;

	@ObfuscatedName("tf.bu")
	public static int field6852;

	@ObfuscatedName("tf.bw")
	public static int field6853;

	@ObfuscatedName("tf.bo")
	public static int field6807;

	@ObfuscatedName("tf.bz")
	public static boolean[] field6855;

	static {
		new Date();
		field6853 = 0;
		field6807 = 0;
		field6855 = new boolean[8];
	}

	public WorldMap() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("tf.e(Lpy;Lpy;Laoa;Laoe;Laop;Laoc;Laox;Lem;Lep;)V")
	public static void method8506(Js5 arg0, Js5 arg1, FloorOverlayTypeList arg2, FloorUnderlayTypeList arg3, LocTypeList arg4, MapElementTypeList arg5, MSITypeList arg6, VariableTypeProvider arg7, VarIntDomain arg8) {
		field6794 = arg0;
		field6795 = arg1;
		field6839 = arg2;
		field6849 = arg3;
		field6785 = arg4;
		field6788 = arg5;
		field6789 = arg6;
		field6791 = arg7;
		field6790 = arg8;
		field6796.removeAll();
		int[] var9 = field6794.getFileIds(Js5WorldMapGroup.field7968.getId());
		if (var9 != null) {
			for (int var10 = 0; var10 < var9.length; var10++) {
				WorldMapAreaMetadata var11 = WorldMapAreaMetadata.method3468(field6794, var9[var10]);
				field6796.put(var11, (long) var11.id);
			}
		}
		ColourUtils.method10156(true, false);
	}

	@ObfuscatedName("tf.n()V")
	public static void method8619() {
		field6809 = new short[field6812 * field6810];
		field6815 = new short[field6812 * field6810];
		field6802 = new byte[field6812 * field6810];
		field6817 = new Object[field6812 * field6810];
		field6818 = new byte[field6812 * field6810];
		field6830 = new java.util.HashMap[3][field6812 >> 6][field6810 >> 6];
		field6854 = new int[field6839.length() + 1];
		field6820 = new boolean[field6812 / 8][field6810 / 8];
	}

	@ObfuscatedName("tf.m()V")
	public static void method8508() {
		field6809 = null;
		field6813 = null;
		field6814 = null;
		field6815 = null;
		field6802 = null;
		field6817 = null;
		field6818 = null;
		field6830 = null;
		field6854 = null;
		field6820 = null;
	}

	@ObfuscatedName("tf.k(I)V")
	public static void method8521(int arg0) {
		WorldMapAreaMetadata var1 = (WorldMapAreaMetadata) field6796.get((long) arg0);
		if (var1 != null && currentWorldMap != var1) {
			currentWorldMap = var1;
			field6819 = worldMapDefaults.field7690 == currentWorldMap.id;
		}
	}

	@ObfuscatedName("tf.f(Lasy;)Z")
	public static boolean method8510(WorldMapAreaMetadata arg0) {
		if (arg0 == null || currentWorldMap == arg0) {
			return false;
		} else {
			currentWorldMap = arg0;
			field6819 = worldMapDefaults.field7690 == currentWorldMap.id;
			return true;
		}
	}

	@ObfuscatedName("tf.w(II)Lasy;")
	public static WorldMapAreaMetadata getMap(int arg0, int arg1) {
		for (WorldMapAreaMetadata var2 = (WorldMapAreaMetadata) field6796.head(); var2 != null; var2 = (WorldMapAreaMetadata) field6796.next()) {
			if (var2.field12350 && var2.method19469(arg0, arg1)) {
				return var2;
			}
		}
		return null;
	}

	@ObfuscatedName("tf.l(I)Lasy;")
	public static WorldMapAreaMetadata getMapByName(int arg0) {
		return (WorldMapAreaMetadata) field6796.get((long) arg0);
	}

	@ObfuscatedName("tf.u(II)Laap;")
	public static SecondaryLinkedList method8513(int arg0, int arg1) {
		SecondaryLinkedList var2 = new SecondaryLinkedList();
		for (WorldMapAreaMetadata var3 = (WorldMapAreaMetadata) field6796.head(); var3 != null; var3 = (WorldMapAreaMetadata) field6796.next()) {
			if (var3.field12350 && var3.method19469(arg0, arg1)) {
				var2.pushBack(var3);
			}
		}
		return var2;
	}

	@ObfuscatedName("tf.z(Ldf;II)V")
	public static void method8514(MaterialList arg0, int arg1, int arg2) {
		for (int var3 = 0; var3 < field6839.length(); var3++) {
			field6854[var3 + 1] = method8515(arg0, var3, arg1, arg2);
		}
	}

	@ObfuscatedName("tf.p(Ldf;III)I")
	public static int method8515(MaterialList arg0, int arg1, int arg2, int arg3) {
		return method8587(field6839, arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("tf.d(Lao;Ldf;III)I")
	public static int method8587(ConfigTypeList arg0, MaterialList arg1, int arg2, int arg3, int arg4) {
		FloorOverlayType var5 = (FloorOverlayType) arg0.list(arg2);
		if (var5 == null) {
			return 0;
		}
		int var6 = var5.material;
		if (var6 >= 0 && arg1.get(var6).highDetail) {
			var6 = -1;
		}
		int var10;
		if (var5.averagecolour >= 0) {
			int var7 = var5.averagecolour;
			int var8 = (var7 & 0x7F) + arg4;
			if (var8 < 0) {
				var8 = 0;
			} else if (var8 > 127) {
				var8 = 127;
			}
			int var9 = (arg3 + var7 & 0xFC00) + (var7 & 0x380) + var8;
			var10 = ColourUtils.field8149[ColourUtils.method4937(ColourUtils.adjustLightness(var9, 96)) & 0xFFFF] | 0xFF000000;
		} else if (var6 >= 0) {
			var10 = ColourUtils.field8149[ColourUtils.method4937(ColourUtils.adjustLightness(arg1.get(var6).averageColour, 96)) & 0xFFFF] | 0xFF000000;
		} else if (var5.rgb == -1) {
			var10 = 0;
		} else {
			int var11 = var5.rgb;
			int var12 = (var11 & 0x7F) + arg4;
			if (var12 < 0) {
				var12 = 0;
			} else if (var12 > 127) {
				var12 = 127;
			}
			int var13 = (arg3 + var11 & 0xFC00) + (var11 & 0x380) + var12;
			var10 = ColourUtils.field8149[ColourUtils.method4937(ColourUtils.adjustLightness(var13, 96)) & 0xFFFF] | 0xFF000000;
		}
		return var10;
	}

	@ObfuscatedName("tf.c(Ldh;IIZ)Z")
	public static boolean method8542(Toolkit arg0, int arg1, int arg2, boolean arg3) {
		long var4 = MonotonicTime.get();
		if (field6793 == 0) {
			if (worldMapDefaults.field7695 == currentWorldMap.id) {
				int var6 = field6795.getgroupid(currentWorldMap.field12351);
				if (field6841 == null) {
					field6841 = new Packet(field6795.getfile(var6, 0));
				}
				field6821 = field6841;
				field6821.pos = 0;
			} else {
				int var7 = field6795.getgroupid(currentWorldMap.field12351);
				field6821 = new Packet(field6795.getfile(var7, 0));
			}
			int var8 = field6821.g1();
			field6787 = new int[var8];
			for (int var9 = 0; var9 < var8; var9++) {
				field6787[var9] = field6821.gSmart1or2();
			}
			int var10 = field6821.g1();
			field6844 = new int[var10];
			for (int var11 = 0; var11 < var10; var11++) {
				field6844[var11] = field6821.gSmart1or2();
			}
		}
		while (field6821 != null && field6821.pos < field6821.data.length && (!arg3 || MonotonicTime.get() < (long) field6828 + var4)) {
			if (field6821.g1() == 0) {
				int var12 = field6821.g1();
				int var13 = field6821.g1();
				for (int var14 = 0; var14 < 8; var14++) {
					int var15 = field6821.g1();
					int var16 = var12 * 8 + var14 - field6786 / 8;
					for (int var17 = 0; var17 < 8; var17++) {
						int var18 = var13 * 8 + var17 - field6808 / 8;
						field6820[var16][var18] = (var15 & 0x1 << var17) != 0;
					}
				}
				for (int var19 = 0; var19 < 64; var19++) {
					for (int var20 = 0; var20 < 64; var20++) {
						int var21 = var12 * 64 + var19 - field6786;
						int var22 = var13 * 64 + var20 - field6808;
						method8518(arg0, field6821, var12, var13, var21, var22, field6787, field6844);
					}
				}
			} else {
				int var23 = field6821.g1();
				int var24 = field6821.g1();
				int var25 = field6821.g1();
				int var26 = field6821.g1();
				field6820[var23 * 8 + var25 - field6786 / 8][var24 * 8 + var26 - field6808 / 8] = field6821.g1() != 0;
				for (int var27 = 0; var27 < 8; var27++) {
					for (int var28 = 0; var28 < 8; var28++) {
						int var29 = var23 * 64 + var25 * 8 + var27 - field6786;
						int var30 = var24 * 64 + var26 * 8 + var28 - field6808;
						method8518(arg0, field6821, var23, var24, var29, var30, field6787, field6844);
					}
				}
			}
		}
		if (field6821 != null) {
			field6793 = field6821.pos;
			if (field6821.pos < field6821.data.length) {
				return false;
			}
		}
		field6821 = null;
		field6844 = null;
		field6787 = null;
		if (field6809 != null) {
			field6813 = new byte[field6812 * field6810];
			field6814 = new short[field6812 * field6810];
			for (int var31 = 0; var31 < 3; var31++) {
				short[] var32 = new short[field6812 * field6810];
				for (int var33 = 0; var33 < field6830[var31].length; var33++) {
					for (int var34 = 0; var34 < field6830[var31][0].length; var34++) {
						java.util.HashMap var35 = field6830[var31][var33][var34];
						if (var35 != null) {
							java.util.Iterator var36 = var35.values().iterator();
							while (var36.hasNext()) {
								WorldMapUpperLevelTileData var37 = (WorldMapUpperLevelTileData) var36.next();
								var32[(var34 * 64 + var37.field6769) * field6812 + var33 * 64 + var37.field6774] = (short) var37.field6770;
							}
						}
					}
				}
				method8509(var32, field6813, field6814, arg1, arg2);
				for (int var38 = 0; var38 < field6830[var31].length; var38++) {
					for (int var39 = 0; var39 < field6830[var31][0].length; var39++) {
						java.util.HashMap var40 = field6830[var31][var38][var39];
						if (var40 != null) {
							java.util.Iterator var41 = var40.values().iterator();
							while (var41.hasNext()) {
								WorldMapUpperLevelTileData var42 = (WorldMapUpperLevelTileData) var41.next();
								int var43 = (var39 * 64 + var42.field6769) * field6812 + var38 * 64 + var42.field6774;
								var42.field6770 = (field6813[var43] & 0xFF) << 16 | field6814[var43] & 0xFFFF;
								if (var42.field6770 != 0) {
									var42.field6770 |= 0xFF000000;
								}
							}
						}
					}
				}
			}
			method8509(field6809, field6813, field6814, arg1, arg2);
			field6809 = null;
		}
		if (arg3 && MonotonicTime.get() >= (long) field6828 + var4) {
			return false;
		} else {
			method8519();
			return true;
		}
	}

	@ObfuscatedName("tf.r(Ldh;Lalw;IIII[I[I)V")
	public static void method8518(Toolkit arg0, Packet arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
		int var8 = arg1.g1();
		if ((var8 & 0x1) == 0) {
			boolean var9 = (var8 & 0x2) == 0;
			int var10 = var8 >> 2 & 0x3F;
			if (var10 == 62) {
				return;
			}
			int var11;
			if (var10 == 63) {
				var11 = arg1.gSmart1or2();
			} else if (var9) {
				var11 = arg6[var10];
			} else {
				var11 = arg7[var10];
			}
			if (var9) {
				field6809[field6812 * arg5 + arg4] = (short) var11;
				field6815[field6812 * arg5 + arg4] = 0;
			} else {
				field6815[field6812 * arg5 + arg4] = (short) var11;
				field6802[field6812 * arg5 + arg4] = 0;
				field6809[field6812 * arg5 + arg4] = (short) arg1.gSmart1or2();
			}
			return;
		}
		int var12 = (var8 >> 1 & 0x3) + 1;
		boolean var13 = (var8 & 0x8) != 0;
		boolean var14 = (var8 & 0x10) != 0;
		for (int var15 = 0; var15 < var12; var15++) {
			int var16 = arg1.gSmart1or2();
			int var17 = 0;
			int var18 = 0;
			if (var13) {
				var17 = arg1.gSmart1or2();
				var18 = arg1.g1();
			}
			int var19 = 0;
			if (var14) {
				var19 = arg1.g1();
			}
			if (var15 == 0) {
				field6809[field6812 * arg5 + arg4] = (short) var16;
				field6815[field6812 * arg5 + arg4] = (short) var17;
				field6802[field6812 * arg5 + arg4] = (byte) var18;
				if (var19 == 1) {
					field6817[field6812 * arg5 + arg4] = Integer.valueOf(arg1.gSmart2or4null());
					field6818[field6812 * arg5 + arg4] = arg1.g1b();
				} else if (var19 > 1) {
					int[] var20 = new int[var19];
					byte[] var21 = new byte[var19];
					for (int var22 = 0; var22 < var19; var22++) {
						var20[var22] = arg1.gSmart2or4null();
						var21[var22] = arg1.g1b();
					}
					field6817[field6812 * arg5 + arg4] = new WorldMapNode(var20, var21);
				}
			} else {
				int[] var23 = null;
				byte[] var24 = null;
				if (var19 > 0) {
					var23 = new int[var19];
					var24 = new byte[var19];
					for (int var25 = 0; var25 < var19; var25++) {
						var23[var25] = arg1.gSmart2or4null();
						var24[var25] = arg1.g1b();
					}
				}
				if (field6830[var15 - 1][arg2 - (field6786 >> 6)][arg3 - (field6808 >> 6)] == null) {
					field6830[var15 - 1][arg2 - (field6786 >> 6)][arg3 - (field6808 >> 6)] = new java.util.HashMap();
				}
				int var26 = ((arg4 & 0x3F) << 8) + (arg5 & 0x3F);
				WorldMapUpperLevelTileData var27 = new WorldMapUpperLevelTileData(arg4 & 0x3F, arg5 & 0x3F, var16, var17, var18, var23, var24);
				field6830[var15 - 1][arg2 - (field6786 >> 6)][arg3 - (field6808 >> 6)].put(var26, var27);
			}
		}
	}

	@ObfuscatedName("tf.v()V")
	public static void method8519() {
		for (int var0 = 0; var0 < field6812; var0++) {
			for (int var1 = 0; var1 < field6810; var1++) {
				Object var2 = field6817[field6812 * var1 + var0];
				if (var2 != null) {
					if (var2 instanceof WorldMapNode) {
						WorldMapNode var3 = (WorldMapNode) var2;
						if (var3 != null) {
							for (int var4 = 0; var4 < var3.field11444.length; var4++) {
								LocType var5 = (LocType) field6785.list(var3.field11444[var4]);
								int var6 = var5.mapelement;
								if (var5.multiloc != null) {
									LocType var7 = var5.getMultiLoc(field6791, field6790);
									if (var7 != null) {
										var6 = var7.mapelement;
									}
								}
								if (var6 != -1) {
									WorldMapElement var8 = new WorldMapElement(var6);
									var8.field11448 = var0;
									var8.field11452 = var1;
									field6806.addTail(var8);
								}
							}
						}
					} else {
						Integer var9 = (Integer) var2;
						LocType var10 = (LocType) field6785.list(var9);
						int var11 = var10.mapelement;
						if (var10.multiloc != null) {
							LocType var12 = var10.getMultiLoc(field6791, field6790);
							if (var12 != null) {
								var11 = var12.mapelement;
							}
						}
						if (var11 != -1) {
							WorldMapElement var13 = new WorldMapElement(var11);
							var13.field11448 = var0;
							var13.field11452 = var1;
							field6806.addTail(var13);
						}
					}
				}
			}
		}
		for (int var14 = 0; var14 < 3; var14++) {
			for (int var15 = 0; var15 < field6830[0].length; var15++) {
				label89: for (int var16 = 0; var16 < field6830[0][0].length; var16++) {
					java.util.HashMap var17 = field6830[var14][var15][var16];
					if (var17 != null) {
						java.util.Iterator var18 = var17.values().iterator();
						while (true) {
							WorldMapUpperLevelTileData var19;
							do {
								if (!var18.hasNext()) {
									continue label89;
								}
								var19 = (WorldMapUpperLevelTileData) var18.next();
							} while (var19.field6773 == null);
							for (int var20 = 0; var20 < var19.field6773.length; var20++) {
								LocType var21 = (LocType) field6785.list(var19.field6773[var20]);
								int var22 = var21.mapelement;
								if (var21.multiloc != null) {
									LocType var23 = var21.getMultiLoc(field6791, field6790);
									if (var23 != null) {
										var22 = var23.mapelement;
									}
								}
								if (var22 != -1) {
									WorldMapElement var24 = new WorldMapElement(var22);
									var24.field11448 = ((field6786 >> 6) + var15) * 64 + var19.field6774 - field6786;
									var24.field11452 = ((field6808 >> 6) + var16) * 64 + var19.field6769 - field6808;
									field6806.addTail(var24);
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("tf.o([S[B[SII)V")
	public static void method8509(short[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4) {
		int[] var5 = new int[field6810];
		int[] var6 = new int[field6810];
		int[] var7 = new int[field6810];
		int[] var8 = new int[field6810];
		int[] var9 = new int[field6810];
		for (int var10 = -5; var10 < field6812; var10++) {
			int var11 = var10 + 5;
			int var12 = var10 - 5;
			for (int var13 = 0; var13 < field6810; var13++) {
				int var10002;
				if (var11 < field6812) {
					short var14 = arg0[field6812 * var13 + var11];
					if (var14 > 0) {
						FloorUnderlayType var15 = (FloorUnderlayType) field6849.list(var14 - 1);
						var5[var13] += var15.hue;
						var6[var13] += var15.saturation;
						var7[var13] += var15.lightness;
						var8[var13] += var15.chroma;
						var10002 = var9[var13]++;
					}
				}
				if (var12 >= 0) {
					short var16 = arg0[field6812 * var13 + var12];
					if (var16 > 0) {
						FloorUnderlayType var17 = (FloorUnderlayType) field6849.list(var16 - 1);
						var5[var13] -= var17.hue;
						var6[var13] -= var17.saturation;
						var7[var13] -= var17.lightness;
						var8[var13] -= var17.chroma;
						var10002 = var9[var13]--;
					}
				}
			}
			if (var10 >= 0) {
				int var18 = 0;
				int var19 = 0;
				int var20 = 0;
				int var21 = 0;
				int var22 = 0;
				for (int var23 = -5; var23 < field6810; var23++) {
					int var24 = var23 + 5;
					if (var24 < field6810) {
						var18 += var5[var24];
						var19 += var6[var24];
						var20 += var7[var24];
						var21 += var8[var24];
						var22 += var9[var24];
					}
					int var25 = var23 - 5;
					if (var25 >= 0) {
						var18 -= var5[var25];
						var19 -= var6[var25];
						var20 -= var7[var25];
						var21 -= var8[var25];
						var22 -= var9[var25];
					}
					if (var23 >= 0 && var22 > 0) {
						if (arg0[field6812 * var23 + var10] == 0) {
							int var26 = field6812 * var23 + var10;
							arg1[var26] = 0;
							arg2[var26] = 0;
						} else {
							int var27 = var21 == 0 ? 0 : ColourUtils.hsl24to16(var18 * 256 / var21, var19 / var22, var20 / var22);
							int var28 = (var27 & 0x7F) + arg4;
							if (var28 < 0) {
								var28 = 0;
							} else if (var28 > 127) {
								var28 = 127;
							}
							int var29 = (arg3 + var27 & 0xFC00) + (var27 & 0x380) + var28;
							int var30 = field6812 * var23 + var10;
							int var31 = ColourUtils.field8149[ColourUtils.method4937(ColourUtils.mulHSL(var29, 96)) & 0xFFFF];
							arg1[var30] = (byte) (var31 >> 16 & 0xFF);
							arg2[var30] = (short) (var31 & 0xFFFF);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("tf.s()V")
	public static void method8505() {
		int[] var0 = new int[3];
		for (int var1 = 0; var1 < field6805.field6777; var1++) {
			boolean var2 = currentWorldMap.method19471(field6805.field6776[var1] >> 28 & 0x3, field6805.field6776[var1] >> 14 & 0x3FFF, field6805.field6776[var1] & 0x3FFF, var0);
			if (var2) {
				WorldMapElement var3 = new WorldMapElement(field6805.field6775[var1]);
				var3.field11448 = var0[1] - field6786;
				var3.field11452 = var0[2] - field6808;
				field6806.addTail(var3);
			}
		}
	}

	@ObfuscatedName("tf.y(IIIIIIII)V")
	public static void method8620(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		field6845 = arg0 - field6786;
		field6846 = arg1 - field6808;
		field6847 = arg2 - field6786;
		field6848 = arg3 - field6808;
		field6801 = arg4;
		field6837 = arg5;
		field6851 = arg6;
		field6852 = arg7;
	}

	@ObfuscatedName("tf.q(Ldh;ZZZZ)V")
	public static void method8523(Toolkit arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
		int var5 = field6847 - field6845;
		int var6 = field6846 - field6848;
		int var7 = (field6851 - field6801 << 16) / var5;
		int var8 = (field6852 - field6837 << 16) / var6;
		method8524(arg0, arg1, arg2, var7, var8, 0, 0, arg3, arg4);
	}

	@ObfuscatedName("tf.x(Ldh;ZZIIIIZZ)V")
	public static void method8524(Toolkit arg0, boolean arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
		int var9 = field6847 - field6845;
		int var10 = field6846 - field6848;
		if (field6847 < field6812) {
			var9++;
		}
		if (field6846 < field6810) {
			var10++;
		}
		int var11 = field6845 / 64;
		int var12 = field6848 / 64;
		int var13 = (field6845 + var9) / 64;
		int var14 = (field6848 + var10) / 64;
		int var15;
		int var16;
		if (arg8) {
			var15 = (field6851 - field6801) / ((field6847 - field6845) / 64);
			var16 = var15;
		} else {
			var15 = method8535();
			var16 = (int) Math.ceil((double) (field6803 * 64.0F / 2.0F));
		}
		field6835.clear();
		int var17 = 0;
		int var18 = var15 * var15;
		for (int var19 = var11; var19 <= var13; var19++) {
			for (int var20 = var12; var20 <= var14; var20++) {
				int var21 = (var19 << 16) + var20;
				int var22 = method8588((long) var21);
				if (var15 != var22) {
					if (var19 < 0 || var19 * 64 >= field6812 || var20 < 0 || var20 * 64 >= field6810) {
						method8536(arg0, var19, var20, var15, var21);
					} else if (var22 == -1) {
						method8526(var19, var20, var15, var21, arg1, arg2, arg7, arg0);
						var17 += var18;
					} else {
						field6835.add(var21);
					}
				}
			}
		}
		if (!field6835.isEmpty() && var17 < field6836) {
			Iterator var23 = field6835.iterator();
			while (var17 < field6836 && var23.hasNext()) {
				int var24 = (Integer) var23.next();
				int var25 = var24 >> 16 & 0xFFFF;
				int var26 = var24 & 0xFFFF;
				method8526(var25, var26, var15, var24, arg1, arg2, arg7, arg0);
				var17 += var18;
			}
		}
		for (int var27 = var11; var27 <= var13; var27++) {
			int var28 = var27 * 64;
			int var29 = var28 - field6845;
			int var30 = var16;
			int var31 = (arg3 * var29 + arg5 >> 16) + field6801;
			int var32 = ((var29 + 64) * arg3 + arg5 >> 16) + field6801;
			if (var16 + var31 != var32) {
				var30 = var32 - var31;
			}
			for (int var33 = var12; var33 <= var14; var33++) {
				int var34 = var33 * 64;
				int var35 = var34 - field6848;
				int var36 = (var27 << 16) + var33;
				int var37 = var16;
				int var38 = field6852 - (arg4 * var35 + arg6 >> 16);
				int var39 = field6852 - ((var35 + 64) * arg4 + arg6 >> 16);
				if (var38 - var16 != var39) {
					var37 = var38 - var39;
				}
				int var40 = var38 - var37;
				Sprite var41 = (Sprite) field6833.get((long) var36);
				if (var41 == null) {
					throw new RuntimeException();
				}
				if (var41.getWidth() == var30 && var41.getHeight() == var37) {
					var41.drawSprite(var31, var40);
				} else {
					var41.drawTintedScaled(var31, var40, var30, var37);
				}
			}
		}
	}

	@ObfuscatedName("tf.b(Ldh;IIII)V")
	public static void method8536(Toolkit arg0, int arg1, int arg2, int arg3, int arg4) {
		Sprite var5 = (Sprite) field6833.get(-1L);
		if (var5 == null || var5.getWidth() != arg3) {
			int var6;
			if (currentWorldMap.field12355 == -1) {
				var6 = -16777216;
			} else {
				var6 = currentWorldMap.field12355 | 0xFF000000;
			}
			if (field6838 == null || arg3 * arg3 != field6838.length) {
				field6838 = new int[arg3 * arg3];
			}
			Arrays.fill(field6838, var6);
			var5 = arg0.createSprite(field6838, 0, arg3, arg3, arg3, true);
			field6833.put(var5, -1L);
		}
		field6833.put(var5, (long) arg4);
	}

	@ObfuscatedName("tf.h(IIIIZZZLdh;)V")
	public static void method8526(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5, boolean arg6, Toolkit arg7) {
		int var8 = arg0 * 64;
		int var9 = arg1 * 64;
		if (field6838 == null || arg2 * arg2 != field6838.length) {
			field6838 = new int[arg2 * arg2];
		}
		boolean var10 = field6819 && !arg6;
		int var11 = currentWorldMap.field12355 | 0xFF000000;
		for (int var12 = 0; var12 < 64; var12++) {
			int var13 = var8 + var12;
			int var14 = arg2 * var12 / 64;
			int var15 = (var12 + 1) * arg2 / 64 - 1;
			if (var15 < var14) {
				var15 = var14;
			}
			for (int var16 = 0; var16 < 64; var16++) {
				int var17 = var9 + var16;
				boolean var18 = arg4;
				if (var10 && !method8534(var13, var17)) {
					var18 = false;
				}
				int var19 = field6812 * var17 + var13;
				boolean var20 = false;
				boolean var21 = false;
				Object var22 = null;
				int var23 = (field6813[var19] & 0xFF) << 16 | field6814[var19] & 0xFFFF;
				int var24;
				if (var23 == 0) {
					var24 = var11;
				} else {
					var24 = var23 | 0xFF000000;
				}
				short var25 = field6815[var19];
				Object var26 = field6817[var19];
				int var27 = arg2 * var16 / 64;
				int var28 = (var16 + 1) * arg2 / 64 - 1;
				if (var28 < var27) {
					var28 = var27;
				}
				if (var26 == null) {
					method8612(field6838, var14, var15, var27, var28, arg2, var18, var24, var25, field6802[var19], null, null, true);
				} else if (var26 instanceof WorldMapNode) {
					WorldMapNode var29 = (WorldMapNode) var26;
					if (var29 != null) {
						method8612(field6838, var14, var15, var27, var28, arg2, var18, var24, var25, field6802[var19], var29.field11444, var29.field11445, true);
					}
				} else {
					Integer var30 = (Integer) var26;
					field6816[0] = var30;
					field6850[0] = field6818[var19];
					method8612(field6838, var14, var15, var27, var28, arg2, var18, var24, var25, field6802[var19], field6816, field6850, true);
				}
			}
		}
		if (arg5) {
			for (int var31 = 0; var31 < 64; var31++) {
				int var32 = var8 + var31;
				boolean var33 = var31 == 0 && var32 != 0;
				for (int var34 = 0; var34 < 64; var34++) {
					int var35 = var9 + var34;
					if (!var10 || method8534(var32, var35)) {
						boolean var36 = var34 == 0 && var35 != 0;
						int var37 = field6812 * var35 + var32;
						if (var33 && var36) {
							method8528(arg7, field6838, arg2, -1, -1, var32 - 1, var35 - 1, var37 - 1 - field6812);
						}
						if (var33) {
							method8528(arg7, field6838, arg2, -1, var34, var32 - 1, var35, var37 - 1);
						}
						if (var36) {
							method8528(arg7, field6838, arg2, var31, -1, var32, var35 - 1, var37 - field6812);
						}
						method8528(arg7, field6838, arg2, var31, var34, var32, var35, var37);
					}
				}
			}
		}
		int var38 = arg0 * 64 / 64;
		int var39 = arg1 * 64 / 64;
		for (int var40 = 0; var40 < 3; var40++) {
			for (int var41 = 0; var41 < 64; var41++) {
				int var42 = var8 + var41;
				int var43 = var42 & 0x3F;
				int var44 = arg2 * var41 / 64;
				int var45 = (var41 + 1) * arg2 / 64 - 1;
				if (var45 < var44) {
					var45 = var44;
				}
				for (int var46 = 0; var46 < 64; var46++) {
					int var47 = var9 + var46;
					boolean var48 = arg4;
					if (var10 && !method8534(var42, var47)) {
						var48 = false;
					}
					int var49 = var47 & 0x3F;
					int var50 = arg2 * var46 / 64;
					int var51 = (var46 + 1) * arg2 / 64 - 1;
					if (var51 < var50) {
						var51 = var50;
					}
					java.util.HashMap var52 = field6830[var40][var38][var39];
					if (var52 != null) {
						WorldMapUpperLevelTileData var53 = (WorldMapUpperLevelTileData) var52.get((var43 << 8) + var49);
						if (var53 != null) {
							method8612(field6838, var44, var45, var50, var51, arg2, var48, var53.field6770, var53.field6768, var53.field6772, var53.field6773, var53.field6771, false);
						}
					}
				}
			}
			for (int var54 = 0; var54 < 64; var54++) {
				int var55 = var8 + var54;
				int var56 = var55 & 0x3F;
				for (int var57 = 0; var57 < 64; var57++) {
					int var58 = var9 + var57;
					if (!var10 || method8534(var55, var58)) {
						int var59 = var58 & 0x3F;
						java.util.HashMap var60 = field6830[var40][var38][var39];
						if (var60 != null) {
							WorldMapUpperLevelTileData var61 = (WorldMapUpperLevelTileData) var60.get((var56 << 8) + var59);
							if (var61 != null) {
								method8529(arg7, field6838, arg2, var54, var57, var61.field6773, var61.field6771);
							}
						}
					}
				}
			}
		}
		if (var10) {
			byte var62 = 8;
			for (int var63 = 0; var63 < var62; var63++) {
				int var64 = var63 * 8 + var8;
				int var65 = arg2 * var63 / var62;
				int var66 = (var63 + 1) * arg2 / var62 - 1;
				for (int var67 = 0; var67 < var62; var67++) {
					int var68 = var67 * 8 + var9;
					if (!method8534(var64, var68)) {
						int var69 = arg2 * var67 / var62;
						int var70 = (var67 + 1) * arg2 / var62 - 1;
						if (arg2 < 64) {
							method8522(field6838, var65, var66, var69, var70, arg2);
						} else {
							field6855[NORTH] = method8534(var64, var68 + 8);
							field6855[NORTHWEST] = method8534(var64 + 8, var68 + 8);
							field6855[NORTHEAST] = method8534(var64 + 8, var68);
							field6855[SOUTHWEST] = method8534(var64 + 8, var68 - 8);
							field6855[SOUTH] = method8534(var64, var68 - 8);
							field6855[WEST] = method8534(var64 - 8, var68 - 8);
							field6855[EAST] = method8534(var64 - 8, var68);
							field6855[SOUTHEAST] = method8534(var64 - 8, var68 + 8);
							method8538(field6838, var65, var66, var69, var70, arg2);
						}
					}
				}
			}
		}
		field6833.put(arg7.createSprite(field6838, 0, arg2, arg2, arg2, true), (long) arg3);
	}

	@ObfuscatedName("tf.a([IIIIIIZIII[I[BZ)V")
	public static void method8612(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int[] arg10, byte[] arg11, boolean arg12) {
		if (arg12 || arg7 != 0 || arg8 > 0) {
			if (arg8 == 0) {
				method8537(arg0, arg1, arg2, arg3, arg4, arg5, arg5, arg7 | 0xFF000000);
			} else {
				int var13 = arg9 & 0x3F;
				if (var13 == 0 || field6840 == 0) {
					int var17 = field6854[arg8];
					if (arg12 || var17 != 0) {
						method8537(arg0, arg1, arg2, arg3, arg4, arg5, arg5, var17 | 0xFF000000);
					}
				} else {
					int var14 = arg12 ? 0 : 1;
					int var15 = WorldMapTileShapes.method16462(arg9 >> 6 & 0x3, var13);
					int var16 = WorldMapTileShapes.method9049(var13);
					method8585(arg0, arg1, arg2, arg3, arg4, arg5, arg5, arg7, field6854[arg8], field6799[var16 - 1][var15], field6840, var14);
				}
			}
		}
		if (!arg6 || arg10 == null) {
			return;
		}
		int var18 = arg2 - arg1 + 1;
		int var19 = arg4 - arg3 + 1;
		for (int var20 = 0; var20 < arg10.length; var20++) {
			int var21 = arg11[var20] & 0x3F;
			if (LocShape.WALL_STRAIGHT.id == var21 || LocShape.WALL_L.id == var21 || LocShape.WALL_SQUARE_CORNER.id == var21 || LocShape.WALL_DIAGONAL.id == var21) {
				LocType var22 = (LocType) field6785.list(arg10[var20]);
				if (var22.mapsceneicon == -1) {
					int var23 = -3355444;
					if (var22.active == 1) {
						var23 = -3407872;
					}
					int var24 = arg11[var20] >> 6 & 0x3;
					if (LocShape.WALL_STRAIGHT.id == var21) {
						if (var24 == 0) {
							method8544(arg0, arg1, arg4, var19, arg5, var23);
						} else if (var24 == 1) {
							method8543(arg0, arg1, arg4, var18, arg5, var23);
						} else if (var24 == 2) {
							method8544(arg0, arg2, arg4, var19, arg5, var23);
						} else {
							method8543(arg0, arg1, arg3, var18, arg5, var23);
						}
					} else if (LocShape.WALL_L.id == var21) {
						if (var24 == 0) {
							method8544(arg0, arg1, arg4, var19, arg5, -1);
							method8543(arg0, arg1, arg4, var18, arg5, var23);
						} else if (var24 == 1) {
							method8544(arg0, arg2, arg4, var19, arg5, -1);
							method8543(arg0, arg1, arg4, var18, arg5, var23);
						} else if (var24 == 2) {
							method8544(arg0, arg2, arg4, var19, arg5, -1);
							method8543(arg0, arg1, arg3, var18, arg5, var23);
						} else {
							method8544(arg0, arg1, arg4, var19, arg5, -1);
							method8543(arg0, arg1, arg3, var18, arg5, var23);
						}
					} else if (LocShape.WALL_SQUARE_CORNER.id == var21) {
						if (var24 == 0) {
							method8543(arg0, arg1, arg4, 1, arg5, var23);
						} else if (var24 == 1) {
							method8543(arg0, arg2, arg4, 1, arg5, var23);
						} else if (var24 == 2) {
							method8543(arg0, arg2, arg3, 1, arg5, var23);
						} else {
							method8543(arg0, arg1, arg3, 1, arg5, var23);
						}
					} else if (LocShape.WALL_DIAGONAL.id == var21) {
						if (var24 == 0 || var24 == 2) {
							for (int var26 = 0; var26 < var19; var26++) {
								method8543(arg0, arg1 + var26, arg3 + var26, 1, arg5, var23);
							}
						} else {
							for (int var25 = 0; var25 < var19; var25++) {
								method8543(arg0, arg1 + var25, arg4 - var25, 1, arg5, var23);
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("tf.g(Ldh;[IIIIIII)V")
	public static void method8528(Toolkit arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		Object var8 = field6817[arg7];
		if (var8 == null) {
			return;
		}
		if (var8 instanceof WorldMapNode) {
			WorldMapNode var9 = (WorldMapNode) var8;
			if (var9 != null) {
				method8529(arg0, arg1, arg2, arg3, arg4, var9.field11444, var9.field11445);
			}
		} else {
			Integer var10 = (Integer) var8;
			field6816[0] = var10;
			field6850[0] = field6818[field6812 * arg6 + arg5];
			method8529(arg0, arg1, arg2, arg3, arg4, field6816, field6850);
		}
	}

	@ObfuscatedName("tf.i(Ldh;[IIII[I[B)V")
	public static void method8529(Toolkit arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, byte[] arg6) {
		if (arg5 == null) {
			return;
		}
		for (int var7 = 0; var7 < arg5.length; var7++) {
			LocType var8 = (LocType) field6785.list(arg5[var7]);
			int var9 = var8.mapsceneicon;
			if (var9 != -1) {
				MSIType var10 = (MSIType) field6789.list(var9);
				Sprite var11 = var10.method15057(arg0, var8.mapsceneiconrotate ? arg6[var7] >> 6 & 0x3 : 0, var8.mapsceneiconmirror ? var8.mirror : false);
				int[] var12 = var10.method15058(arg0, var8.mapsceneiconrotate ? arg6[var7] >> 6 & 0x3 : 0, var8.mapsceneiconmirror ? var8.mirror : false);
				if (var11 != null) {
					int var13 = var11.getX();
					int var14 = var11.getY();
					int var15 = arg2 * var13 / 64 >> 2;
					int var16 = arg2 * var14 / 64 >> 2;
					if (var10.field9152) {
						int var17 = var8.width;
						int var18 = var8.length;
						if ((arg6[var7] >> 6 & 0x1) == 1) {
							int var19 = var17;
							var17 = var18;
							var18 = var19;
						}
						var15 = arg2 * var17 / 64;
						var16 = arg2 * var18 / 64;
					}
					if (var15 != 0 && var16 != 0) {
						int var20 = arg2 * arg3 / 64;
						int var21 = (64 - arg4) * arg2 / 64 - var16 + 1;
						for (int var22 = 0; var22 < var15; var22++) {
							int var23 = var20 + var22;
							if (var23 >= 0) {
								if (var23 >= arg2) {
									break;
								}
								for (int var24 = 0; var24 < var16; var24++) {
									int var25 = var21 + var24;
									if (var25 >= 0) {
										if (var25 >= arg2) {
											break;
										}
										int var26 = var12[var13 * var22 / var15 + var14 * var24 / var16 * var13];
										int var27 = var26 >> 24 & 0xFF;
										if (var27 != 0) {
											arg1[arg2 * var25 + var23] = var26;
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("tf.j(Ldh;)Laat;")
	public static LinkList method8602(Toolkit arg0) {
		int var1 = field6847 - field6845;
		int var2 = field6846 - field6848;
		int var3 = (field6851 - field6801 << 16) / var1;
		int var4 = (field6852 - field6837 << 16) / var2;
		return method8531(arg0, var3, var4, 0, 0);
	}

	@ObfuscatedName("tf.t(Ldh;IIII)Laat;")
	public static LinkList method8531(Toolkit arg0, int arg1, int arg2, int arg3, int arg4) {
		for (WorldMapElement var5 = (WorldMapElement) field6806.head(); var5 != null; var5 = (WorldMapElement) field6806.next()) {
			method8525(arg0, var5, arg1, arg2, arg3, arg4);
		}
		return field6806;
	}

	@ObfuscatedName("tf.ae(Ldh;Laks;IIII)V")
	public static void method8525(Toolkit arg0, WorldMapElement arg1, int arg2, int arg3, int arg4, int arg5) {
		arg1.field11449 = ((arg1.field11448 - field6845) * arg2 + arg4 >> 16) + field6801;
		arg1.field11451 = field6852 - ((arg1.field11452 - field6848) * arg3 + arg5 >> 16);
	}

	@ObfuscatedName("tf.ag(Ldh;Laks;Lhs;)V")
	public static void method8533(Toolkit arg0, WorldMapElement arg1, MapElementType arg2) {
		if (arg2.field2393 == null) {
			return;
		}
		int[] var3 = new int[arg2.field2393.length];
		for (int var4 = 0; var4 < var3.length / 2; var4++) {
			int var5 = arg1.field11448 + arg2.field2393[var4 * 2];
			int var6 = arg1.field11452 + arg2.field2393[var4 * 2 + 1];
			var3[var4 * 2] = (field6851 - field6801) * (var5 - field6845) / (field6847 - field6845) + field6801;
			var3[var4 * 2 + 1] = field6852 - (field6852 - field6837) * (var6 - field6848) / (field6846 - field6848);
		}
		WorldMapRelated2.method2053(arg0, var3, arg2.field2398);
		if (arg2.field2399 <= 0) {
			for (int var22 = 0; var22 < var3.length / 2 - 1; var22++) {
				arg0.drawLine(var3[var22 * 2], var3[var22 * 2 + 1], var3[(var22 + 1) * 2], var3[(var22 + 1) * 2 + 1], arg2.field2406[arg2.field2407[var22] & 0xFF]);
			}
			arg0.drawLine(var3[var3.length - 2], var3[var3.length - 1], var3[0], var3[1], arg2.field2406[arg2.field2407[arg2.field2407.length - 1] & 0xFF]);
			return;
		}
		for (int var7 = 0; var7 < var3.length / 2 - 1; var7++) {
			int var8 = var3[var7 * 2];
			int var9 = var3[var7 * 2 + 1];
			int var10 = var3[(var7 + 1) * 2];
			int var11 = var3[(var7 + 1) * 2 + 1];
			if (var10 < var8) {
				int var12 = var8;
				int var13 = var9;
				var8 = var10;
				var9 = var11;
				var10 = var12;
				var11 = var13;
			} else if (var8 == var10 && var11 < var9) {
				int var14 = var9;
				var9 = var11;
				var11 = var14;
			}
			arg0.method2187(var8, var9, var10, var11, arg2.field2406[arg2.field2407[var7] & 0xFF], 1, arg2.field2399, arg2.field2369, arg2.field2401);
		}
		int var15 = var3[var3.length - 2];
		int var16 = var3[var3.length - 1];
		int var17 = var3[0];
		int var18 = var3[1];
		if (var17 < var15) {
			int var19 = var15;
			int var20 = var16;
			var15 = var17;
			var16 = var18;
			var17 = var19;
			var18 = var20;
		} else if (var15 == var17 && var18 < var16) {
			int var21 = var16;
			var16 = var18;
			var18 = var21;
		}
		arg0.method2187(var15, var16, var17, var18, arg2.field2406[arg2.field2407[arg2.field2407.length - 1] & 0xFF], 1, arg2.field2399, arg2.field2369, arg2.field2401);
	}

	@ObfuscatedName("tf.ah(II)Z")
	public static boolean method8534(int arg0, int arg1) {
		int var2 = arg0 >> 3;
		int var3 = arg1 >> 3;
		return var2 >= 0 && var3 >= 0 && var2 < field6820.length && var3 < field6820[var2].length ? field6820[var2][var3] : false;
	}

	@ObfuscatedName("tf.al()I")
	public static int method8535() {
		return (int) (field6804 * 64.0F / 2.0F);
	}

	@ObfuscatedName("tf.ac(J)I")
	public static int method8588(long arg0) {
		Sprite var2 = (Sprite) field6833.get(arg0);
		return var2 == null ? -1 : var2.getWidth();
	}

	@ObfuscatedName("tf.ai([IIIIIIII)V")
	public static void method8537(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		for (int var8 = arg1; var8 <= arg2; var8++) {
			for (int var9 = arg3; var9 <= arg4; var9++) {
				arg0[(arg6 - var9 - 1) * arg5 + var8] = arg7;
			}
		}
	}

	@ObfuscatedName("tf.aw([IIIIII)V")
	public static void method8538(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var6 = worldMapDefaults.field7691 >> 24 & 0xFF;
		int var7 = 255 - var6;
		if ((!field6855[NORTH] || !field6855[NORTHEAST] && !field6855[EAST]) && (!field6855[SOUTH] || !field6855[NORTHEAST] && !field6855[EAST])) {
			method8539(arg0, arg1, arg2, arg3, arg4, arg5, var6, var7, true, true, true, true);
			if (field6855[NORTHWEST]) {
				arg0[(arg5 - arg4 - 1) * arg5 + arg2] = worldMapDefaults.field7692;
				arg0[(arg5 - arg4) * arg5 + arg2] = worldMapDefaults.field7692;
				arg0[(arg5 - arg4 - 1) * arg5 + arg2 - 1] = worldMapDefaults.field7692;
			}
			if (field6855[SOUTHWEST]) {
				arg0[(arg5 - arg3 - 1) * arg5 + arg2] = worldMapDefaults.field7692;
				arg0[(arg5 - arg3 - 2) * arg5 + arg2] = worldMapDefaults.field7692;
				arg0[(arg5 - arg3 - 1) * arg5 + arg2 - 1] = worldMapDefaults.field7692;
			}
			if (field6855[WEST]) {
				arg0[(arg5 - arg3 - 1) * arg5 + arg1] = worldMapDefaults.field7692;
				arg0[(arg5 - arg3 - 2) * arg5 + arg1] = worldMapDefaults.field7692;
				arg0[(arg5 - arg3 - 1) * arg5 + arg1 + 1] = worldMapDefaults.field7692;
			}
			if (field6855[SOUTHEAST]) {
				arg0[(arg5 - arg4 - 1) * arg5 + arg1] = worldMapDefaults.field7692;
				arg0[(arg5 - arg4) * arg5 + arg1] = worldMapDefaults.field7692;
				arg0[(arg5 - arg4 - 1) * arg5 + arg1 + 1] = worldMapDefaults.field7692;
			}
			return;
		}
		if (field6855[NORTH] && field6855[NORTHEAST]) {
			method8541(arg0, arg2 - worldMapDefaults.field7694 + 1, arg4 - worldMapDefaults.field7694 + 1, arg5, var6, var7, NORTHWEST);
		} else {
			method8539(arg0, arg2 - worldMapDefaults.field7694 + 1, arg2, arg4 - worldMapDefaults.field7694 + 1, arg4, arg5, var6, var7, true, true, false, false);
			if (field6855[NORTHWEST]) {
				arg0[(arg5 - arg4 - 1) * arg5 + arg2] = worldMapDefaults.field7692;
				arg0[(arg5 - arg4) * arg5 + arg2] = worldMapDefaults.field7692;
				arg0[(arg5 - arg4 - 1) * arg5 + arg2 - 1] = worldMapDefaults.field7692;
			}
		}
		if (field6855[SOUTH] && field6855[NORTHEAST]) {
			method8541(arg0, arg2 - worldMapDefaults.field7694 + 1, arg3, arg5, var6, var7, SOUTHWEST);
		} else {
			method8539(arg0, arg2 - worldMapDefaults.field7694 + 1, arg2, arg3, worldMapDefaults.field7694 + arg3 - 1, arg5, var6, var7, false, true, true, false);
			if (field6855[SOUTHWEST]) {
				arg0[(arg5 - arg3 - 1) * arg5 + arg2] = worldMapDefaults.field7692;
				arg0[(arg5 - arg3 - 2) * arg5 + arg2] = worldMapDefaults.field7692;
				arg0[(arg5 - arg3 - 1) * arg5 + arg2 - 1] = worldMapDefaults.field7692;
			}
		}
		if (field6855[SOUTH] && field6855[EAST]) {
			method8541(arg0, arg1, arg3, arg5, var6, var7, WEST);
		} else {
			method8539(arg0, arg1, worldMapDefaults.field7694 + arg1 - 1, arg3, worldMapDefaults.field7694 + arg3 - 1, arg5, var6, var7, false, false, true, true);
			if (field6855[WEST]) {
				arg0[(arg5 - arg3 - 1) * arg5 + arg1] = worldMapDefaults.field7692;
				arg0[(arg5 - arg3 - 2) * arg5 + arg1] = worldMapDefaults.field7692;
				arg0[(arg5 - arg3 - 1) * arg5 + arg1 + 1] = worldMapDefaults.field7692;
			}
		}
		if (field6855[NORTH] && field6855[EAST]) {
			method8541(arg0, arg1, arg4 - worldMapDefaults.field7694 + 1, arg5, var6, var7, SOUTHEAST);
		} else {
			method8539(arg0, arg1, worldMapDefaults.field7694 + arg1 - 1, arg4 - worldMapDefaults.field7694 + 1, arg4, arg5, var6, var7, true, false, false, true);
			if (field6855[SOUTHEAST]) {
				arg0[(arg5 - arg4 - 1) * arg5 + arg1] = worldMapDefaults.field7692;
				arg0[(arg5 - arg4) * arg5 + arg1] = worldMapDefaults.field7692;
				arg0[(arg5 - arg4 - 1) * arg5 + arg1 + 1] = worldMapDefaults.field7692;
			}
		}
		if (worldMapDefaults.field7694 + arg1 < arg2 - worldMapDefaults.field7694) {
			method8539(arg0, worldMapDefaults.field7694 + arg1, arg2 - worldMapDefaults.field7694, arg3, arg4, arg5, var6, var7, true, false, true, false);
		}
		if (worldMapDefaults.field7694 + arg3 + 1 < arg4 - worldMapDefaults.field7694 - 1) {
			method8539(arg0, arg1, worldMapDefaults.field7694 + arg1 - 1, worldMapDefaults.field7694 + arg3, arg4 - worldMapDefaults.field7694, arg5, var6, var7, false, false, false, true);
			method8539(arg0, arg2 - worldMapDefaults.field7694 + 1, arg2, worldMapDefaults.field7694 + arg3, arg4 - worldMapDefaults.field7694, arg5, var6, var7, false, true, false, false);
		}
	}

	@ObfuscatedName("tf.as([IIIIII)V")
	public static void method8522(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var6 = worldMapDefaults.field7691 >> 24 & 0xFF;
		int var7 = 255 - var6;
		for (int var8 = arg1; var8 <= arg2; var8++) {
			for (int var9 = arg3; var9 <= arg4; var9++) {
				int var10 = arg0[(arg5 - var9 - 1) * arg5 + var8];
				if (field6853 != var10) {
					field6853 = var10;
					field6807 = ((worldMapDefaults.field7691 & 0xFF00FF) * var6 + (var10 & 0xFF00FF) * var7 & -16711936) + ((worldMapDefaults.field7691 & 0xFF00) * var6 + (var10 & 0xFF00) * var7 & 0xFF0000) >> 8 | 0xFF000000;
				}
				arg0[(arg5 - var9 - 1) * arg5 + var8] = field6807;
			}
		}
	}

	@ObfuscatedName("tf.at([IIIIIIIIZZZZ)V")
	public static void method8539(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, boolean arg9, boolean arg10, boolean arg11) {
		for (int var12 = arg1; var12 <= arg2; var12++) {
			boolean var13 = arg9 ? field6855[NORTHEAST] && arg2 - var12 < worldMapDefaults.field7693 : false;
			boolean var14 = arg11 ? field6855[EAST] && var12 - arg1 < worldMapDefaults.field7693 : false;
			for (int var15 = arg3; var15 <= arg4; var15++) {
				if (var13 || var14) {
					arg0[(arg5 - var15 - 1) * arg5 + var12] = worldMapDefaults.field7692;
				} else {
					boolean var16 = arg8 ? field6855[NORTH] && arg4 - var15 < worldMapDefaults.field7693 : false;
					boolean var17 = arg10 ? field6855[SOUTH] && var15 - arg3 < worldMapDefaults.field7693 : false;
					if (var16 || var17) {
						arg0[(arg5 - var15 - 1) * arg5 + var12] = worldMapDefaults.field7692;
					} else {
						int var18 = arg0[(arg5 - var15 - 1) * arg5 + var12];
						if (field6853 != var18) {
							field6853 = var18;
							field6807 = ((worldMapDefaults.field7691 & 0xFF00FF) * arg6 + (var18 & 0xFF00FF) * arg7 & -16711936) + ((worldMapDefaults.field7691 & 0xFF00) * arg6 + (var18 & 0xFF00) * arg7 & 0xFF0000) >> 8 | 0xFF000000;
						}
						arg0[(arg5 - var15 - 1) * arg5 + var12] = field6807;
					}
				}
			}
		}
	}

	@ObfuscatedName("tf.ad([IIIIIII)V")
	public static void method8541(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		for (int var7 = 0; var7 < worldMapDefaults.field7694; var7++) {
			int var8 = var7;
			if (NORTHWEST == arg6 || SOUTHWEST == arg6) {
				var8 = worldMapDefaults.field7694 - var7 - 1;
			}
			for (int var9 = 0; var9 < worldMapDefaults.field7694; var9++) {
				int var10 = var9;
				if (SOUTHWEST == arg6 || WEST == arg6) {
					var10 = worldMapDefaults.field7694 - var9 - 1;
				}
				int var11 = field6800[var8][var10];
				if (var11 != 0) {
					if (var11 == 1) {
						int var12 = arg0[(arg3 - arg2 - var9 - 1) * arg3 + arg1 + var7];
						if (field6853 != var12) {
							field6853 = var12;
							field6807 = ((worldMapDefaults.field7691 & 0xFF00FF) * arg4 + (var12 & 0xFF00FF) * arg5 & -16711936) + ((worldMapDefaults.field7691 & 0xFF00) * arg4 + (var12 & 0xFF00) * arg5 & 0xFF0000) >> 8 | 0xFF000000;
						}
						arg0[(arg3 - arg2 - var9 - 1) * arg3 + arg1 + var7] = field6807;
					} else if (var11 == 2) {
						arg0[(arg3 - arg2 - var9 - 1) * arg3 + arg1 + var7] = worldMapDefaults.field7692;
					}
				}
			}
		}
	}

	@ObfuscatedName("tf.am([IIIIIIIII[BII)V")
	public static void method8585(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte[] arg9, int arg10, int arg11) {
		int var12 = 0;
		int var13 = 0;
		int var14 = arg2 - arg1 + 1;
		int var15 = arg4 - arg3 + 1;
		int var16 = (arg10 << 16) / var14;
		int var17 = (arg9.length / arg10 << 16) / var15;
		int var18 = (arg6 - arg4 - 1) * arg5 + arg1;
		int var19 = arg7 >> 24;
		int var20 = arg8 >> 24;
		if (arg11 == 0 || arg11 == 1 && var19 == 255 && var20 == 255) {
			int var29 = var12;
			for (int var30 = -var15; var30 < 0; var30++) {
				int var31 = (var13 >> 16) * arg10;
				for (int var32 = -var14; var32 < 0; var32++) {
					if (arg9[(var12 >> 16) + var31] == 0) {
						arg0[var18++] = arg7;
					} else {
						arg0[var18++] = arg8;
					}
					var12 += var16;
				}
				var13 += var17;
				var12 = var29;
				var18 += arg5 - var14;
			}
		} else if (arg11 == 1) {
			int var21 = var12;
			for (int var22 = -var15; var22 < 0; var22++) {
				int var23 = (var13 >> 16) * arg10;
				for (int var24 = -var14; var24 < 0; var24++) {
					int var25 = arg7;
					if (arg9[(var12 >> 16) + var23] != 0) {
						var25 = arg8;
					}
					int var26 = var25 >>> 24;
					int var27 = 255 - var26;
					int var28 = arg0[var18];
					arg0[var18++] = ((var25 & 0xFF00FF) * var26 + (var28 & 0xFF00FF) * var27 & -16711936) + ((var25 & 0xFF00) * var26 + (var28 & 0xFF00) * var27 & 0xFF0000) >> 8 | 0xFF000000;
					var12 += var16;
				}
				var13 += var17;
				var12 = var21;
				var18 += arg5 - var14;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("tf.au([IIIIII)V")
	public static void method8543(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var6 = (arg4 - arg2 - 1) * arg4 + arg1;
		for (int var7 = 0; var7 < arg3; var7++) {
			arg0[var6 + var7] = arg5;
		}
	}

	@ObfuscatedName("tf.ar([IIIIII)V")
	public static void method8544(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var6 = (arg4 - arg2 - 1) * arg4 + arg1;
		for (int var7 = 0; var7 < arg3; var7++) {
			arg0[arg4 * var7 + var6] = arg5;
		}
	}
}
