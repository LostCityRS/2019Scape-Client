package com.jagex;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gm")
public final class Class293 implements Interface26 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!gm", name = "this$0", descriptor = "Lclient!gx;")
	final Class303 aClass303_9;

	@OriginalMember(owner = "client!gm", name = "e", descriptor = "I")
	final int anInt3956;

	@OriginalMember(owner = "client!gm", name = "n", descriptor = "I")
	final int anInt3955;

	@OriginalMember(owner = "client!gm", name = "lp", descriptor = "(Lclient!yf;I)V")
	static void method26680(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class210.method25510(local11, local14, arg0, -290566237);
	}

	@OriginalMember(owner = "client!gm", name = "ew", descriptor = "(ILjava/lang/String;ZI)V")
	public static void method26681(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		if (arg0 == 0) {
			Class694.aClass104_14 = Class5.method79(0, Class125_Sub3.aCanvas1, Class619.aClass225_8, Class636.anInterface24_10, Class81.aClass451_1, Class599.aClass438_1, Class283.aClass444_1, Class364.aClass497_105, Class51.aClass93_Sub36_1.aClass166_Sub39_1.method16355(1862789908) * 2, 636490669);
			if (arg1 != null) {
				Class694.aClass104_14.method20786(1, 0);
				@Pc(33) Class5 local33 = Class446.method29078(Class633.aClass497_137, Class393.anInt4814 * 545040483, 0, Class157.aClass462_2, -939272896);
				@Pc(44) Class106 local44 = Class694.aClass104_14.method20518(local33, Class203.method24664(Class110_Sub7.aClass497_22, Class393.anInt4814 * 545040483, 0), true);
				Class555.method31234(91836446);
				Class95.method1801(arg1, true, Class694.aClass104_14, local44, local33, (byte) -2);
			}
		} else {
			@Pc(56) Class104 local56 = null;
			if (arg1 != null) {
				local56 = Class5.method79(0, Class125_Sub3.aCanvas1, Class619.aClass225_8, Class636.anInterface24_10, Class81.aClass451_1, Class599.aClass438_1, Class283.aClass444_1, Class364.aClass497_105, 0, 636490669);
				local56.method20786(1, 0);
				@Pc(82) Class5 local82 = Class219.method25606(Class633.aClass497_137, Class393.anInt4814 * 545040483, 0, 1182820400);
				@Pc(93) Class106 local93 = local56.method20518(local82, Class203.method24664(Class110_Sub7.aClass497_22, Class393.anInt4814 * 545040483, 0), true);
				Class555.method31234(1431469370);
				Class95.method1801(arg1, true, local56, local93, local82, (byte) 28);
				try {
					local56.method20889(142255072);
					local56 = null;
				} catch (@Pc(109) Throwable local109) {
				}
			}
			boolean var18 = false;
			label260: {
				try {
					try {
						var18 = true;
						Class507.method30410(1707042915);
						System.gc();
						Class694.aClass104_14 = Class5.method79(arg0, Class125_Sub3.aCanvas1, Class619.aClass225_8, Class636.anInterface24_10, Class81.aClass451_1, Class599.aClass438_1, Class283.aClass444_1, Class364.aClass497_105, Class51.aClass93_Sub36_1.aClass166_Sub39_1.method16355(1148649642) * 2, 636490669);
						Class157.aClass462_2 = new Class462(Class694.aClass104_14, Class110_Sub7.aClass497_22, Class633.aClass497_137, Class173.method23812(-588930715));
						if (Class694.aClass104_14.method20505()) {
							@Pc(143) boolean local143 = true;
							try {
								local143 = Class125_Sub3.aClass93_Sub42_1.anInt2055 * 714183489 > 256;
							} catch (@Pc(155) Throwable local155) {
							}
							@Pc(161) Class93_Sub35 local161;
							if (local143) {
								local161 = Class694.aClass104_14.method20532(146800640);
							} else {
								local161 = Class694.aClass104_14.method20532(104857600);
							}
							Class694.aClass104_14.method20506(local161);
							var18 = false;
						} else {
							var18 = false;
						}
						break label260;
					} catch (@Pc(178) Throwable local178) {
						switch(arg0) {
							case 1:
								Class481.method29936(Class73.aClass73_12, -1579313767);
								break;
							case 3:
								Class481.method29936(Class73.aClass73_5, -1873162872);
						}
					}
					if (local178 instanceof RuntimeException_Sub2) {
						Class51.aClass93_Sub36_1.aClass166_Sub39_2.method16557(0, 1603572843);
						Class51.aClass93_Sub36_1.aClass166_Sub39_1.method16557(0, -162075972);
					}
					@Pc(205) int local205 = Class51.aClass93_Sub36_1.aClass166_Sub4_2.method15436((byte) 103);
					Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub4_2, 0, (byte) 61);
					if (local56 != null) {
						try {
							local56.method20889(-950398244);
							local56 = null;
						} catch (@Pc(220) Throwable local220) {
						}
					}
					Class507.method30410(1329967578);
					System.gc();
					method26681(local205, arg1, arg2, 822302939);
					var18 = false;
				} finally {
					if (var18 && local56 != null) {
						try {
							local56.method20889(14597038);
						} catch (@Pc(244) Throwable local244) {
						}
					}
				}
				if (local56 != null) {
					try {
						local56.method20889(-1174676046);
					} catch (@Pc(235) Throwable local235) {
					}
				}
				return;
			}
			if (local56 != null) {
				try {
					local56.method20889(-1887974608);
				} catch (@Pc(176) Throwable local176) {
				}
			}
		}
		if (arg2) {
			Class51.aClass93_Sub36_1.method14377(Class51.aClass93_Sub36_1.aClass166_Sub4_2, !arg2, -1748243435);
		}
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub4_2, arg0, (byte) 54);
		if (!arg2) {
			Class51.aClass93_Sub36_1.method14377(Class51.aClass93_Sub36_1.aClass166_Sub4_2, !arg2, 950520922);
		}
		Class93_Sub16.method13573(2119184065);
		Class694.aClass104_14.method20843(20000);
		Class694.aClass104_14.method20535(32);
		client.aClass532_1.method30717((byte) 60);
		if (Class694.aClass104_14.method20577()) {
			Class154.method14145(Class51.aClass93_Sub36_1.aClass166_Sub28_1.method16049((byte) -53) == 1, 1093255583);
		}
		client.aClass532_1.method30634(true, -1769293471);
		client.aClass532_1.method30713((byte) -14).method33184(838025276);
		Class165.method15331(-977306673);
		client.aBoolean603 = false;
		client.aBoolean604 = false;
		client.aBoolean611 = true;
		Class53.aClass14Array2 = null;
		Class694.aClass104_14.method20650(0.0F, 1.0F);
	}

	@OriginalMember(owner = "client!gm", name = "iq", descriptor = "(I)V")
	static void method26682(@OriginalArg(0) int arg0) {
		@Pc(2) Iterator local2 = client.aClass16_21.iterator();
		while (local2.hasNext()) {
			@Pc(9) Class93_Sub1_Sub9 local9 = (Class93_Sub1_Sub9) local2.next();
			@Pc(12) Class132_Sub1_Sub1_Sub5 local12 = local9.aClass132_Sub1_Sub1_Sub5_1;
			if (client.aClass532_1.method30640(-1497851924) != null && local12.method24110(382519706)) {
				client.aClass532_1.method30640(-2053196264).method31678(local12, true, -1906905266);
			}
		}
	}

	@OriginalMember(owner = "client!gm", name = "li", descriptor = "(Ljava/lang/String;I)I")
	public static int method26683(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (arg0 == null || arg0.length() == 0) {
			return -1;
		}
		for (@Pc(8) int local8 = 0; local8 < client.anInt3573 * 1882800101; local8++) {
			if (arg0.equalsIgnoreCase(client.aClass177Array1[local8].aString125)) {
				return local8;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!gm", name = "ato", descriptor = "(Lclient!yf;B)V")
	static void method26684(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt6052 -= 1189701933;
	}

	@OriginalMember(owner = "client!gm", name = "iw", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V")
	static void method26685(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12 = arg2.anIntArray521[(arg2.anInt6052 -= 1189701933) * -1497248091];
		if (local12 == Class312.anInt4049 * -184372205 || Class312.anInt4080 * 437976281 == local12 || local12 == Class312.anInt3993 * -837858879 || local12 == Class312.anInt4066 * 1165943799) {
			arg0.anInt4068 = local12 * -1554422429;
		}
	}

	@OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Lclient!gx;Lclient!alw;)V")
	Class293(@OriginalArg(0) Class303 arg0, @OriginalArg(1) Class93_Sub41 arg1) {
		this.aClass303_9 = arg0;
		this.anInt3956 = arg1.method22427(-1434290800) * 839503119;
		this.anInt3955 = arg1.method22425((short) 16384) * 2029142337;
	}

	@OriginalMember(owner = "client!gm", name = "n", descriptor = "(Lclient!gq;)V")
	@Override
	public void method26807(@OriginalArg(0) Class297 arg0) {
		arg0.method26704(this.anInt3956 * -1456766481, this.anInt3955 * -1749332287, (byte) 59);
		arg0.method26715(this.anInt3956 * -1456766481, -1810007965).method26849(-1942433304);
	}

	@OriginalMember(owner = "client!gm", name = "e", descriptor = "(Lclient!gq;B)V")
	@Override
	public void method26808(@OriginalArg(0) Class297 arg0, @OriginalArg(1) byte arg1) {
		arg0.method26704(this.anInt3956 * -1456766481, this.anInt3955 * -1749332287, (byte) 113);
		arg0.method26715(this.anInt3956 * -1456766481, -756857867).method26849(-1942433304);
	}

	@OriginalMember(owner = "client!gm", name = "m", descriptor = "(Lclient!gq;)V")
	@Override
	public void method26806(@OriginalArg(0) Class297 arg0) {
		arg0.method26704(this.anInt3956 * -1456766481, this.anInt3955 * -1749332287, (byte) 125);
		arg0.method26715(this.anInt3956 * -1456766481, 1589588354).method26849(-1942433304);
	}
}
