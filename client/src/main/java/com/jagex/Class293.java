package com.jagex;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gm")
public class Class293 implements Interface26 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!gm", name = "this$0", descriptor = "Lclient!gx;")
	final Class303 this$0;

	@OriginalMember(owner = "client!gm", name = "e", descriptor = "I")
	final int anInt3915;

	@OriginalMember(owner = "client!gm", name = "n", descriptor = "I")
	final int anInt3914;

	@OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Lclient!gx;Lclient!alw;)V", line = 247)
	Class293(@OriginalArg(0) Class303 arg0, @OriginalArg(1) Packet arg1) {
		this.this$0 = arg0;
		this.anInt3915 = arg1.g2(-1434290800) * 839503119;
		this.anInt3914 = arg1.g1((short) 16384) * 2029142337;
	}

	@OriginalMember(owner = "client!gm", name = "n", descriptor = "(Lclient!gq;)V", line = 253)
	@Override
	public void method26714(@OriginalArg(0) Class297 arg0) {
		arg0.method26682(this.anInt3915 * -1456766481, this.anInt3914 * -1749332287, (byte) 59);
		arg0.method26646(this.anInt3915 * -1456766481, -1810007965).method26776(-1942433304);
	}

	@OriginalMember(owner = "client!gm", name = "e", descriptor = "(Lclient!gq;B)V", line = 253)
	@Override
	public void method26715(@OriginalArg(0) Class297 arg0, @OriginalArg(1) byte arg1) {
		arg0.method26682(this.anInt3915 * -1456766481, this.anInt3914 * -1749332287, (byte) 113);
		arg0.method26646(this.anInt3915 * -1456766481, -756857867).method26776(-1942433304);
	}

	@OriginalMember(owner = "client!gm", name = "m", descriptor = "(Lclient!gq;)V", line = 253)
	@Override
	public void method26713(@OriginalArg(0) Class297 arg0) {
		arg0.method26682(this.anInt3915 * -1456766481, this.anInt3914 * -1749332287, (byte) 125);
		arg0.method26646(this.anInt3915 * -1456766481, 1589588354).method26776(-1942433304);
	}

	@OriginalMember(owner = "client!gm", name = "ew", descriptor = "(ILjava/lang/String;ZI)V", line = 2041)
	public static void method26587(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		if (arg0 == 0) {
			Class694.aClass104_14 = Class5.method40(0, Class125_Sub3.aCanvas1, Class619.aClass225_8, Class636.anInterface24_10, Class81.aClass451_1, Class599.aClass438_1, Class283.aClass444_1, Class364.aClass497_105, Class51.options.antialiasing.getValue(1862789908) * 2, 636490669);
			if (arg1 != null) {
				Class694.aClass104_14.method20829(1, 0);
				@Pc(33) Class5 local33 = ClientProt.method28894(Class633.aClass497_137, Class393.anInt4653 * 545040483, 0, Class157.aClass462_2, -939272896);
				@Pc(44) Class106 local44 = Class694.aClass104_14.method20593(local33, Class203.method24648(Class110_Sub7.aClass497_22, Class393.anInt4653 * 545040483, 0), true);
				Class555.method31054(91836446);
				Class95.method1801(arg1, true, Class694.aClass104_14, local44, local33, (byte) -2);
			}
		} else {
			@Pc(56) Class104 local56 = null;
			if (arg1 != null) {
				local56 = Class5.method40(0, Class125_Sub3.aCanvas1, Class619.aClass225_8, Class636.anInterface24_10, Class81.aClass451_1, Class599.aClass438_1, Class283.aClass444_1, Class364.aClass497_105, 0, 636490669);
				local56.method20829(1, 0);
				@Pc(82) Class5 local82 = Class219.method25509(Class633.aClass497_137, Class393.anInt4653 * 545040483, 0, 1182820400);
				@Pc(93) Class106 local93 = local56.method20593(local82, Class203.method24648(Class110_Sub7.aClass497_22, Class393.anInt4653 * 545040483, 0), true);
				Class555.method31054(1431469370);
				Class95.method1801(arg1, true, local56, local93, local82, (byte) 28);
				try {
					local56.method20429(142255072);
					local56 = null;
				} catch (@Pc(109) Throwable local109) {
				}
			}
			boolean var18 = false;
			label260: {
				try {
					try {
						var18 = true;
						Class507.method30230(1707042915);
						System.gc();
						Class694.aClass104_14 = Class5.method40(arg0, Class125_Sub3.aCanvas1, Class619.aClass225_8, Class636.anInterface24_10, Class81.aClass451_1, Class599.aClass438_1, Class283.aClass444_1, Class364.aClass497_105, Class51.options.antialiasing.getValue(1148649642) * 2, 636490669);
						Class157.aClass462_2 = new Class462(Class694.aClass104_14, Class110_Sub7.aClass497_22, Class633.aClass497_137, Class173.method23799(-588930715));
						if (Class694.aClass104_14.method20584()) {
							@Pc(143) boolean local143 = true;
							try {
								local143 = Class125_Sub3.platformStats.anInt2055 * 714183489 > 256;
							} catch (@Pc(155) Throwable local155) {
							}
							@Pc(161) Class93_Sub35 local161;
							if (local143) {
								local161 = Class694.aClass104_14.method20605(146800640);
							} else {
								local161 = Class694.aClass104_14.method20605(104857600);
							}
							Class694.aClass104_14.method20585(local161);
							var18 = false;
						} else {
							var18 = false;
						}
						break label260;
					} catch (@Pc(178) Throwable local178) {
						switch(arg0) {
							case 1:
								Class481.method29754(Class73.aClass73_12, -1579313767);
								break;
							case 3:
								Class481.method29754(Class73.aClass73_5, -1873162872);
                                break;
						}
                        if (local178 instanceof RuntimeException_Sub2) {
                            Class51.options.aClass166_Sub39_2.method16547(0, 1603572843);
                            Class51.options.antialiasing.method16547(0, -162075972);
                        }
                        @Pc(205) int local205 = Class51.options.aClass166_Sub4_2.method15426((byte) 103);
                        Class51.options.method14363(Class51.options.aClass166_Sub4_2, 0, (byte) 61);
                        if (local56 != null) {
                            try {
                                local56.method20429(-950398244);
                                local56 = null;
                            } catch (@Pc(220) Throwable local220) {
                            }
                        }
                        Class507.method30230(1329967578);
                        System.gc();
                        method26587(local205, arg1, arg2, 822302939);
                        var18 = false;
                    }
				} finally {
					if (var18 && local56 != null) {
						try {
							local56.method20429(14597038);
						} catch (@Pc(244) Throwable local244) {
						}
					}
				}
				if (local56 != null) {
					try {
						local56.method20429(-1174676046);
					} catch (@Pc(235) Throwable local235) {
					}
				}
				return;
			}
			if (local56 != null) {
				try {
					local56.method20429(-1887974608);
				} catch (@Pc(176) Throwable local176) {
				}
			}
		}
		if (arg2) {
			Class51.options.method14366(Class51.options.aClass166_Sub4_2, !arg2, -1748243435);
		}
		Class51.options.method14363(Class51.options.aClass166_Sub4_2, arg0, (byte) 54);
		if (!arg2) {
			Class51.options.method14366(Class51.options.aClass166_Sub4_2, !arg2, 950520922);
		}
		Class93_Sub16.method13527(2119184065);
		Class694.aClass104_14.method20865(20000);
		Class694.aClass104_14.method20608(32);
		client.world.method30526((byte) 60);
		if (Class694.aClass104_14.method20639()) {
			Class154.method14144(Class51.options.aClass166_Sub28_1.method16041((byte) -53) == 1, 1093255583);
		}
		client.world.method30522(true, -1769293471);
		client.world.method30494((byte) -14).method33015(838025276);
		Class165.method15315(-977306673);
		client.aBoolean601 = false;
		client.aBoolean602 = false;
		client.aBoolean609 = true;
		Class53.aClass14Array2 = null;
		Class694.aClass104_14.method20707(0.0F, 1.0F);
	}

	@OriginalMember(owner = "client!gm", name = "iq", descriptor = "(I)V", line = 5593)
	static final void method26588(@OriginalArg(0) int arg0) {
		@Pc(2) Iterator local2 = client.aClass16_21.iterator();
		while (local2.hasNext()) {
			@Pc(9) Class93_Sub1_Sub9 local9 = (Class93_Sub1_Sub9) local2.next();
			@Pc(12) Class132_Sub1_Sub1_Sub5 local12 = local9.aClass132_Sub1_Sub1_Sub5_1;
			if (client.world.method30481(-1497851924) != null && local12.method24094(382519706)) {
				client.world.method30481(-2053196264).method31495(local12, true, -1906905266);
			}
		}
	}

	@OriginalMember(owner = "client!gm", name = "iw", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V", line = 6557)
	static final void method26589(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12 = arg2.anIntArray519[(arg2.anInt5891 -= 1189701933) * -1497248091];
		if (local12 == Class312.anInt4008 * -184372205 || Class312.anInt4039 * 437976281 == local12 || local12 == Class312.anInt3952 * -837858879 || local12 == Class312.anInt4025 * 1165943799) {
			arg0.anInt4027 = local12 * -1554422429;
		}
	}

	@OriginalMember(owner = "client!gm", name = "lp", descriptor = "(Lclient!yf;I)V", line = 6980)
	static final void method26590(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class210.method25417(local11, local14, arg0, -290566237);
	}

	@OriginalMember(owner = "client!gm", name = "li", descriptor = "(Ljava/lang/String;I)I", line = 11982)
	public static final int method26591(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!gm", name = "ato", descriptor = "(Lclient!yf;B)V", line = 13233)
	static final void method26592(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5891 -= 1189701933;
	}
}
