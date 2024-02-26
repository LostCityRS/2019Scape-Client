package com.jagex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xv")
public final class Class671 {

	@OriginalMember(owner = "client!xv", name = "f", descriptor = "Ljava/util/HashMap;")
	public HashMap aHashMap13;

	@OriginalMember(owner = "client!xv", name = "t", descriptor = "Lclient!mw;")
	Class427 aClass427_3;

	@OriginalMember(owner = "client!xv", name = "er", descriptor = "(Lclient!yp;I)V")
	static void method33519(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class664.method33364(local11, local14, arg0, (byte) 13);
	}

	@OriginalMember(owner = "client!xv", name = "alp", descriptor = "(Lclient!yp;B)V")
	static void method33520(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		if (Class13.aBoolean5) {
			@Pc(4) Class26[] local4 = Class596.method31996(2079471516);
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local4.length;
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
		}
	}

	@OriginalMember(owner = "client!xv", name = "do", descriptor = "(III)V")
	static void method33521(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Class159_Sub1.aFloat151 < Class159_Sub1.aFloat150) {
			Class159_Sub1.aFloat151 = (float) ((double) Class159_Sub1.aFloat151 + (double) Class159_Sub1.aFloat151 / 30.0D);
			if (Class159_Sub1.aFloat151 > Class159_Sub1.aFloat150) {
				Class159_Sub1.aFloat151 = Class159_Sub1.aFloat150;
			}
			Class156.method15158(1800230248);
			Class159_Sub1.anInt1986 = (int) Class159_Sub1.aFloat150 >> 1;
			Class159_Sub1.aByteArrayArrayArray11 = Class121.method9718(Class159_Sub1.anInt1986, -319091122);
		} else if (Class159_Sub1.aFloat151 > Class159_Sub1.aFloat150) {
			Class159_Sub1.aFloat151 = (float) ((double) Class159_Sub1.aFloat151 - (double) Class159_Sub1.aFloat151 / 30.0D);
			if (Class159_Sub1.aFloat151 < Class159_Sub1.aFloat150) {
				Class159_Sub1.aFloat151 = Class159_Sub1.aFloat150;
			}
			Class156.method15158(-869194574);
			Class159_Sub1.anInt1986 = (int) Class159_Sub1.aFloat150 >> 1;
			Class159_Sub1.aByteArrayArrayArray11 = Class121.method9718(Class159_Sub1.anInt1986, 315478613);
		}
		if (Class159_Sub1.anInt2018 * -1226684865 != -1 && Class159_Sub1.anInt2019 * 370678967 != -1) {
			@Pc(78) int local78 = Class159_Sub1.anInt2018 * -1226684865 - Class159_Sub1.anInt2026 * 2002101755;
			if (local78 != 0) {
				local78 /= Math.min(Class159_Sub1.anInt2015 * -1766595015, Math.abs(local78));
			}
			@Pc(98) int local98 = Class159_Sub1.anInt2019 * 370678967 - Class158.anInt2029 * 2067675511;
			if (local98 != 0) {
				local98 /= Math.min(Class159_Sub1.anInt2015 * -1766595015, Math.abs(local98));
			}
			Class159_Sub1.anInt2026 = (Class159_Sub1.anInt2026 * 2002101755 + local78) * 1633656115;
			Class158.anInt2029 = (local98 + Class158.anInt2029 * 2067675511) * -1296666553;
			if (local78 == 0 && local98 == 0) {
				Class159_Sub1.anInt2018 = -1806870975;
				Class159_Sub1.anInt2019 = -387547399;
			}
			Class156.method15158(-1341812415);
		}
		@Pc(141) Iterator local141 = Class159_Sub1.aHashMap4.entrySet().iterator();
		while (true) {
			while (true) {
				@Pc(150) Class200 local150;
				do {
					if (!local141.hasNext()) {
						local141 = Class159_Sub1.aHashMap5.entrySet().iterator();
						while (true) {
							while (true) {
								do {
									if (!local141.hasNext()) {
										if (Class159_Sub1.aBoolean400 && Class391.aClass8_53 != null) {
											for (@Pc(242) Class80_Sub7 local242 = (Class80_Sub7) Class391.aClass8_53.method247(129206984); local242 != null; local242 = (Class80_Sub7) Class391.aClass8_53.method237(419141851)) {
												@Pc(255) Class320 local255 = (Class320) Class159_Sub1.aClass41_Sub13_4.method18054(local242.aClass80_Sub18_1.anInt1587 * 1945594581, 1565500153);
												if (local242.method13450(arg0, arg1, (byte) -97)) {
													if (local255.aStringArray23 != null) {
														if (local255.aStringArray23[4] != null) {
															Class360.method28144(local255.aStringArray23[4], local255.aString179, -1, 1012, -1, (long) (local242.aClass80_Sub18_1.anInt1587 * 1945594581), local255.anInt4061 * -1976811059, 0, true, false, (long) (local242.aClass80_Sub18_1.anInt1587 * 1945594581), false, (byte) 99);
														}
														if (local255.aStringArray23[3] != null) {
															Class360.method28144(local255.aStringArray23[3], local255.aString179, -1, 1011, -1, (long) (local242.aClass80_Sub18_1.anInt1587 * 1945594581), local255.anInt4061 * -1976811059, 0, true, false, (long) (local242.aClass80_Sub18_1.anInt1587 * 1945594581), false, (byte) 49);
														}
														if (local255.aStringArray23[2] != null) {
															Class360.method28144(local255.aStringArray23[2], local255.aString179, -1, 1010, -1, (long) (local242.aClass80_Sub18_1.anInt1587 * 1945594581), local255.anInt4061 * -1976811059, 0, true, false, (long) (local242.aClass80_Sub18_1.anInt1587 * 1945594581), false, (byte) 44);
														}
														if (local255.aStringArray23[1] != null) {
															Class360.method28144(local255.aStringArray23[1], local255.aString179, -1, 1009, -1, (long) (local242.aClass80_Sub18_1.anInt1587 * 1945594581), local255.anInt4061 * -1976811059, 0, true, false, (long) (local242.aClass80_Sub18_1.anInt1587 * 1945594581), false, (byte) 114);
														}
														if (local255.aStringArray23[0] != null) {
															Class360.method28144(local255.aStringArray23[0], local255.aString179, -1, 1008, -1, (long) (local242.aClass80_Sub18_1.anInt1587 * 1945594581), local255.anInt4061 * -1976811059, 0, true, false, (long) (local242.aClass80_Sub18_1.anInt1587 * 1945594581), false, (byte) 111);
														}
													}
													if (!local242.aClass80_Sub18_1.aBoolean364) {
														local242.aClass80_Sub18_1.aBoolean364 = true;
														Class107.method7196(Class158.aClass158_52, local242.aClass80_Sub18_1.anInt1587 * 1945594581, local255.anInt4061 * -1976811059, -381003227);
													}
													if (local242.aClass80_Sub18_1.aBoolean364) {
														Class107.method7196(Class158.aClass158_51, local242.aClass80_Sub18_1.anInt1587 * 1945594581, local255.anInt4061 * -1976811059, -677837219);
													}
												} else if (local242.aClass80_Sub18_1.aBoolean364) {
													local242.aClass80_Sub18_1.aBoolean364 = false;
													Class107.method7196(Class158.aClass158_49, local242.aClass80_Sub18_1.anInt1587 * 1945594581, local255.anInt4061 * -1976811059, 1185956832);
												}
											}
										}
										return;
									}
									local150 = (Class200) ((Entry) local141.next()).getValue();
									local150.anInt3373 -= -1674385283;
								} while (local150.anInt3373 * -353644331 != 0);
								if (local150.anInt3372 * -929623047 > 1 || Class159_Sub1.aBoolean405) {
									local150.anInt3372 -= -2114109879;
									local150.anInt3373 = Class159_Sub1.anInt2024 * -2071666767;
								} else {
									local141.remove();
								}
							}
						}
					}
					local150 = (Class200) ((Entry) local141.next()).getValue();
					local150.anInt3373 -= -1674385283;
				} while (local150.anInt3373 * -353644331 != 0);
				if (local150.anInt3372 * -929623047 > 1 || Class159_Sub1.aBoolean405) {
					local150.anInt3372 -= -2114109879;
					local150.anInt3373 = Class159_Sub1.anInt2024 * -2071666767;
				} else {
					local141.remove();
				}
			}
		}
	}

	@OriginalMember(owner = "client!xv", name = "<init>", descriptor = "(Lclient!mw;)V")
	public Class671(@OriginalArg(0) Class427 arg0) {
		this.method33516(1838024041);
		this.aClass427_3 = arg0;
	}

	@OriginalMember(owner = "client!xv", name = "u", descriptor = "()V")
	void method33515() {
		this.aHashMap13 = new HashMap();
		this.aHashMap13.put(Class516.aClass516_2, 50);
	}

	@OriginalMember(owner = "client!xv", name = "t", descriptor = "(I)V")
	void method33516(@OriginalArg(0) int arg0) {
		this.aHashMap13 = new HashMap();
		this.aHashMap13.put(Class516.aClass516_2, 50);
	}

	@OriginalMember(owner = "client!xv", name = "e", descriptor = "()V")
	void method33517() {
		this.aHashMap13 = new HashMap();
		this.aHashMap13.put(Class516.aClass516_2, 50);
	}

	@OriginalMember(owner = "client!xv", name = "f", descriptor = "()V")
	void method33518() {
		this.aHashMap13 = new HashMap();
		this.aHashMap13.put(Class516.aClass516_2, 50);
	}
}
