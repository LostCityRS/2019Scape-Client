package com.jagex;

import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public abstract class Class104 {

	@OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
	public static final int anInt902 = 0;

	@OriginalMember(owner = "client!ed", name = "u", descriptor = "I")
	public static final int anInt903 = 1;

	@OriginalMember(owner = "client!ed", name = "l", descriptor = "I")
	public static final int anInt904 = 0;

	@OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
	static int anInt905 = 802464273;

	@OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
	static int anInt906 = -1289675291;

	@OriginalMember(owner = "client!ed", name = "m", descriptor = "I")
	static int anInt907 = 0;

	@OriginalMember(owner = "client!ed", name = "o", descriptor = "I")
	static int anInt908 = 0;

	@OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
	static int anInt909 = 0;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
	static int anInt910 = 0;

	@OriginalMember(owner = "client!ed", name = "s", descriptor = "I")
	static int anInt911 = 0;

	@OriginalMember(owner = "client!ed", name = "k", descriptor = "I")
	static int anInt912 = 0;

	@OriginalMember(owner = "client!ed", name = "x", descriptor = "[Ljava/lang/String;")
	static String[] aStringArray12 = new String[100];

	@OriginalMember(owner = "client!ed", name = "f", descriptor = "Lclient!di;")
	Class102 aClass102_7;

	@OriginalMember(owner = "client!ed", name = "t", descriptor = "Lclient!aan;")
	protected Class15 aClass15_8;

	@OriginalMember(owner = "client!ed", name = "x", descriptor = "(I)I")
	public static int method7687(@OriginalArg(0) int arg0) {
		return Class669.aTwitchTV1.GetStreamState();
	}

	@OriginalMember(owner = "client!ed", name = "m", descriptor = "(IIIILclient!vj;I)V")
	static void method7688(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class614 arg4, @OriginalArg(5) int arg5) {
		if (arg2 < 1 || arg3 < 1 || arg2 > client.aClass539_1.method30921(2138127878) - 2 || arg3 > client.aClass539_1.method31011(-532625515) - 2) {
			return;
		}
		if (client.aClass539_1.method30932(-1638462787) == null) {
			return;
		}
		@Pc(34) Interface60 local34 = client.aClass539_1.method30910((byte) -87).method12011(arg0, arg1, arg2, arg3, -16777216);
		if (local34 == null) {
			return;
		}
		if (local34 instanceof Class120_Sub1_Sub1_Sub2) {
			((Class120_Sub1_Sub1_Sub2) local34).method12203(arg4, (byte) -13);
		} else if (local34 instanceof Class120_Sub1_Sub4_Sub1) {
			((Class120_Sub1_Sub4_Sub1) local34).method13023(arg4, 1701695164);
		} else if (local34 instanceof Class120_Sub1_Sub2_Sub2) {
			((Class120_Sub1_Sub2_Sub2) local34).method13695(arg4, 1151169244);
		} else if (local34 instanceof Class120_Sub1_Sub3_Sub1) {
			((Class120_Sub1_Sub3_Sub1) local34).method12742(arg4, 892168160);
		}
	}

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Lclient!di;Lclient!aan;)V")
	Class104(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class15 arg1) {
		this.aClass102_7 = arg0;
		this.aClass15_8 = arg1;
	}

	@OriginalMember(owner = "client!ed", name = "l", descriptor = "(Ljava/lang/String;IIIIIIIIII[Lclient!cm;[ILclient!cg;IIB)I")
	public final int method7627(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) Class99[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) Class98 arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) byte arg16) {
		if (arg0 == null) {
			return 0;
		}
		this.method7638(arg5, arg6, -1875072166);
		if (arg9 == 0) {
			arg9 = this.aClass15_8.anInt44 * -1978818351;
		}
		@Pc(40) int[] local40;
		if (arg4 < arg9 + this.aClass15_8.anInt45 * 1190692343 + this.aClass15_8.anInt46 * -191270971 && arg4 < arg9 + arg9) {
			local40 = null;
		} else {
			local40 = new int[] { arg3 };
		}
		@Pc(57) int local57 = this.aClass15_8.method375(arg0, local40, aStringArray12, arg11, (short) 414);
		if (arg10 == -1) {
			arg10 = arg4 / arg9;
			if (arg10 <= 0) {
				arg10 = 1;
			}
		}
		if (arg10 > 0 && local57 >= arg10) {
			aStringArray12[arg10 - 1] = this.aClass15_8.method420(aStringArray12[arg10 - 1], arg3, arg11, 1555090471);
			local57 = arg10;
		}
		if (arg8 == 3 && local57 == 1) {
			arg8 = 1;
		}
		@Pc(110) int local110;
		@Pc(189) int local189;
		if (arg8 == 0) {
			local110 = this.aClass15_8.anInt45 * 1190692343 + arg2;
		} else if (arg8 == 1) {
			local110 = this.aClass15_8.anInt45 * 1190692343 + arg2 + (arg4 - this.aClass15_8.anInt45 * 1190692343 - this.aClass15_8.anInt46 * -191270971 - arg9 * (local57 - 1)) / 2;
		} else if (arg8 == 2) {
			local110 = arg4 + arg2 - this.aClass15_8.anInt46 * -191270971 - (local57 - 1) * arg9;
		} else {
			local189 = (arg4 - this.aClass15_8.anInt45 * 1190692343 - this.aClass15_8.anInt46 * -191270971 - (local57 - 1) * arg9) / (local57 + 1);
			if (local189 < 0) {
				local189 = 0;
			}
			local110 = arg2 + this.aClass15_8.anInt45 * 1190692343 + local189;
			arg9 += local189;
		}
		for (local189 = 0; local189 < local57; local189++) {
			if (arg7 == 0) {
				this.method7641(aStringArray12[local189], arg1, local110, arg11, arg12, arg13, arg14, arg15, 2046471609);
			} else if (arg7 == 1) {
				this.method7641(aStringArray12[local189], arg1 + (arg3 - this.aClass15_8.method373(aStringArray12[local189], -1636294444)) / 2, local110, arg11, arg12, arg13, arg14, arg15, 1602285024);
			} else if (arg7 == 2) {
				this.method7641(aStringArray12[local189], arg1 + arg3 - this.aClass15_8.method373(aStringArray12[local189], -664556535), local110, arg11, arg12, arg13, arg14, arg15, 1938005713);
			} else if (local57 - 1 == local189) {
				this.method7641(aStringArray12[local189], arg1, local110, arg11, arg12, arg13, arg14, arg15, 1503148934);
			} else {
				this.method7666(aStringArray12[local189], arg3, -313671033);
				this.method7641(aStringArray12[local189], arg1, local110, arg11, arg12, arg13, arg14, arg15, 2045230400);
				anInt911 = 0;
			}
			local110 += arg9;
		}
		return local57;
	}

	@OriginalMember(owner = "client!ed", name = "w", descriptor = "(Ljava/lang/String;II[Lclient!cm;[I[I[IB)V")
	final void method7628(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class99[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) byte arg7) {
		@Pc(7) int local7 = arg2 - this.aClass15_8.anInt44 * -1978818351;
		@Pc(9) int local9 = -1;
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = 0;
		@Pc(16) int local16 = arg0.length();
		for (@Pc(18) int local18 = 0; local18 < local16; local18++) {
			@Pc(30) char local30 = (char) (Class308.method27442(arg0.charAt(local18), (byte) 45) & 0xFF);
			if (local30 == '<') {
				local9 = local18;
			} else {
				@Pc(118) int local118;
				@Pc(127) int local127;
				if (local30 == '>' && local9 != -1) {
					@Pc(49) String local49 = arg0.substring(local9 + 1, local18);
					local9 = -1;
					if (local49.equals("lt")) {
						local30 = '<';
					} else if (local49.equals("gt")) {
						local30 = '>';
					} else if (local49.equals("nbsp")) {
						local30 = ' ';
					} else if (local49.equals("shy")) {
						local30 = '\u00ad';
					} else if (local49.equals("times")) {
						local30 = '×';
					} else if (local49.equals("euro")) {
						local30 = '\u0080';
					} else if (local49.equals("copy")) {
						local30 = '©';
					} else {
						if (!local49.equals("reg")) {
							@Pc(137) int local137;
							@Pc(151) int local151;
							if (local49.startsWith("img=")) {
								try {
									if (arg5 == null) {
										local118 = 0;
									} else {
										local118 = arg5[local13];
									}
									if (arg6 == null) {
										local127 = 0;
									} else {
										local127 = arg6[local13];
									}
									local13++;
									local137 = Class679.method33621(local49.substring(4), -1351674629);
									@Pc(141) Class99 local141 = arg3[local137];
									local151 = arg4 == null ? local141.method18288() : arg4[local137];
									local141.method18226(arg1 + local118, local7 + this.aClass15_8.anInt44 * -1978818351 - local151 + local127, 1, -1, 1);
									arg1 += arg3[local137].method18214();
									local11 = -1;
								} catch (@Pc(181) Exception local181) {
								}
							} else if (!local49.startsWith("sprite=")) {
								this.method7639(local49, (byte) 20);
							} else if (this.aClass15_8.anInterface1_1 != null) {
								try {
									@Pc(192) boolean local192 = true;
									local127 = 0;
									local137 = local49.indexOf(44);
									if (local137 == -1) {
										local118 = Class679.method33621(local49.substring(7), -2068850764);
									} else {
										local118 = Class679.method33621(local49.substring(7, local137), -1461164862);
										local127 = Class679.method33621(local49.substring(local137 + 1), -106980451);
									}
									@Pc(229) int local229;
									if (arg5 == null) {
										local229 = 0;
									} else {
										local229 = arg5[local13];
									}
									if (arg6 == null) {
										local151 = 0;
									} else {
										local151 = arg6[local13];
									}
									local13++;
									@Pc(251) Class99[] local251 = this.aClass15_8.anInterface1_1.method29582(this.aClass102_7, local118, (byte) 1);
									if (local251 != null) {
										@Pc(271) int local271 = Math.min(local251[local127].method18288(), this.aClass15_8.anInt46 * -191270971 + this.aClass15_8.anInt45 * 1190692343);
										local251[local127].method18226(local229 + arg1, local151 + (this.aClass15_8.anInt44 * -1978818351 + local7 + 3 - local271), 1, -1, 1);
										arg1 += local251[local127].method18214();
									}
									local11 = -1;
								} catch (@Pc(305) Exception local305) {
								}
							}
							continue;
						}
						local30 = '®';
					}
				}
				if (local9 == -1) {
					if (local11 != -1) {
						arg1 += this.aClass15_8.method368(local11, local30, -1874456506);
					}
					@Pc(332) int local332;
					if (arg5 == null) {
						local332 = 0;
					} else {
						local332 = arg5[local13];
					}
					if (arg6 == null) {
						local118 = 0;
					} else {
						local118 = arg6[local13];
					}
					local13++;
					if (local30 != ' ') {
						if ((anInt910 * -25197907 & 0xFF000000) != 0) {
							this.method7643(local30, local332 + arg1 + 1, local7 + 1 + local118, anInt910 * -25197907, true);
						}
						this.method7643(local30, arg1 + local332, local118 + local7, anInt908 * 1079177109, false);
					} else if (anInt911 * -1490254927 > 0) {
						anInt912 += anInt911 * 1411079879;
						arg1 += anInt912 * 1987080647 >> 8;
						anInt912 = (anInt912 * 1987080647 & 0xFF) * -2039742473;
					}
					local127 = this.aClass15_8.method369(local30, (short) -26130);
					if (anInt905 * 1978757391 != -1) {
						this.aClass102_7.method20893(arg1, local7 + (int) ((double) (this.aClass15_8.anInt44 * -1978818351) * 0.7D), local127, anInt905 * 1978757391, 821829100);
					}
					if (anInt906 * 309536787 != -1) {
						this.aClass102_7.method20893(arg1, this.aClass15_8.anInt44 * -1978818351 + local7, local127, anInt906 * 309536787, 1189284040);
					}
					arg1 += local127;
					local11 = local30;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ed", name = "f", descriptor = "(Ljava/lang/String;IIIII)V")
	public final void method7629(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 != null) {
			this.method7638(arg3, arg4, -2034431201);
			this.method7641(arg0, arg1 - this.aClass15_8.method373(arg0, -812910496), arg2, null, null, null, 0, 0, 1709924820);
		}
	}

	@OriginalMember(owner = "client!ed", name = "ae", descriptor = "(Ljava/lang/String;IIIILjava/util/Random;I[Lclient!cm;[I)I")
	public final int method7630(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Random arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class99[] arg7, @OriginalArg(8) int[] arg8) {
		if (arg0 == null) {
			return 0;
		}
		arg5.setSeed((long) arg6);
		@Pc(14) int local14 = (arg5.nextInt() & 0x1F) + 192;
		this.method7638(local14 << 24 | arg3 & 0xFFFFFF, local14 << 24 | arg4 & 0xFFFFFF, -1610705602);
		@Pc(34) int local34 = arg0.length();
		@Pc(37) int[] local37 = new int[local34];
		@Pc(39) int local39 = 0;
		for (@Pc(41) int local41 = 0; local41 < local34; local41++) {
			local37[local41] = local39;
			if ((arg5.nextInt() & 0x3) == 0) {
				local39++;
			}
		}
		this.method7628(arg0, arg1, arg2, arg7, arg8, local37, null, (byte) 8);
		return local39;
	}

	@OriginalMember(owner = "client!ed", name = "u", descriptor = "(Ljava/lang/String;IIIIIIIII[Lclient!cm;[ILclient!cg;IIB)I")
	public final int method7631(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class99[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) Class98 arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) byte arg15) {
		return this.method7627(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, 0, arg10, arg11, arg12, arg13, arg14, (byte) -49);
	}

	@OriginalMember(owner = "client!ed", name = "ax", descriptor = "(Ljava/lang/String;IIII)V")
	public final void method7632(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method7638(arg3, arg4, -1310077416);
			this.method7641(arg0, arg1 - this.aClass15_8.method373(arg0, -1045524041), arg2, null, null, null, 0, 0, 1550342161);
		}
	}

	@OriginalMember(owner = "client!ed", name = "g", descriptor = "(Ljava/lang/String;IIIIII)V")
	public final void method7633(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg0 == null) {
			return;
		}
		this.method7638(arg3, arg4, -987999158);
		@Pc(11) int local11 = arg0.length();
		@Pc(14) int[] local14 = new int[local11];
		for (@Pc(16) int local16 = 0; local16 < local11; local16++) {
			local14[local16] = (int) (Math.sin((double) local16 / 2.0D + (double) arg5 / 5.0D) * 5.0D);
		}
		this.method7628(arg0, arg1 - this.aClass15_8.method373(arg0, -505872478) / 2, arg2, null, null, null, local14, (byte) 8);
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(Ljava/lang/String;IIII)V")
	public final void method7634(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method7638(arg3, arg4, -1619267340);
			this.method7641(arg0, arg1 - this.aClass15_8.method373(arg0, 318216987), arg2, null, null, null, 0, 0, 1816025945);
		}
	}

	@OriginalMember(owner = "client!ed", name = "m", descriptor = "(Ljava/lang/String;IIIIIIS)V")
	public final void method7635(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) short arg7) {
		if (arg0 == null) {
			return;
		}
		this.method7638(arg3, arg4, -972734057);
		@Pc(15) double local15 = 7.0D - (double) arg6 / 8.0D;
		if (local15 < 0.0D) {
			local15 = 0.0D;
		}
		@Pc(24) int local24 = arg0.length();
		@Pc(27) int[] local27 = new int[local24];
		for (@Pc(29) int local29 = 0; local29 < local24; local29++) {
			local27[local29] = (int) (Math.sin((double) local29 / 1.5D + (double) arg5 / 1.0D) * local15);
		}
		this.method7628(arg0, arg1 - this.aClass15_8.method373(arg0, -1848482768) / 2, arg2, null, null, null, local27, (byte) 8);
	}

	@OriginalMember(owner = "client!ed", name = "o", descriptor = "(Ljava/lang/String;IIIILjava/util/Random;I[Lclient!cm;[II)I")
	public final int method7636(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Random arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class99[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int arg9) {
		if (arg0 == null) {
			return 0;
		}
		arg5.setSeed((long) arg6);
		@Pc(14) int local14 = (arg5.nextInt() & 0x1F) + 192;
		this.method7638(local14 << 24 | arg3 & 0xFFFFFF, local14 << 24 | arg4 & 0xFFFFFF, -1563586268);
		@Pc(34) int local34 = arg0.length();
		@Pc(37) int[] local37 = new int[local34];
		@Pc(39) int local39 = 0;
		for (@Pc(41) int local41 = 0; local41 < local34; local41++) {
			local37[local41] = local39;
			if ((arg5.nextInt() & 0x3) == 0) {
				local39++;
			}
		}
		this.method7628(arg0, arg1, arg2, arg7, arg8, local37, null, (byte) 8);
		return local39;
	}

	@OriginalMember(owner = "client!ed", name = "j", descriptor = "(Ljava/lang/String;IIIIIIIILjava/util/Random;I[I[Lclient!cm;[II)I")
	public final int method7637(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Random arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) Class99[] arg12, @OriginalArg(13) int[] arg13, @OriginalArg(14) int arg14) {
		if (arg0 == null) {
			return 0;
		}
		arg9.setSeed((long) arg10);
		@Pc(15) int local15 = (arg9.nextInt() & 0x1F) + 192;
		this.method7638(local15 << 24 | arg5 & 0xFFFFFF, arg6 == -1 ? 0 : local15 << 24 | arg6 & 0xFFFFFF, -1875243554);
		@Pc(40) int local40 = arg0.length();
		@Pc(43) int[] local43 = new int[local40];
		@Pc(45) int local45 = 0;
		@Pc(47) int local47;
		for (local47 = 0; local47 < local40; local47++) {
			local43[local47] = local45;
			if ((arg9.nextInt() & 0x3) == 0) {
				local45++;
			}
		}
		local47 = arg1;
		@Pc(72) int local72 = this.aClass15_8.anInt45 * 1190692343 + arg2;
		@Pc(74) int local74 = -1;
		if (arg8 == 1) {
			local72 += (arg4 - this.aClass15_8.anInt45 * 1190692343 - this.aClass15_8.anInt46 * -191270971) / 2;
		} else if (arg8 == 2) {
			local72 = arg2 + arg4 - this.aClass15_8.anInt46 * -191270971;
		}
		if (arg7 == 1) {
			local74 = this.aClass15_8.method373(arg0, -1654195610) + local45;
			local47 = arg1 + (arg3 - local74) / 2;
		} else if (arg7 == 2) {
			local74 = this.aClass15_8.method373(arg0, 316007373) + local45;
			local47 = arg1 + (arg3 - local74);
		}
		this.method7628(arg0, local47, local72, arg12, arg13, local43, null, (byte) 8);
		if (arg11 != null) {
			if (local74 == -1) {
				local74 = this.aClass15_8.method373(arg0, -1332922180) + local45;
			}
			arg11[0] = local47;
			arg11[1] = local72 - this.aClass15_8.anInt45 * 1190692343;
			arg11[2] = local74;
			arg11[3] = this.aClass15_8.anInt46 * -191270971 + this.aClass15_8.anInt45 * 1190692343;
		}
		return local45;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(III)V")
	final void method7638(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		anInt905 = 802464273;
		anInt906 = -1289675291;
		anInt908 = (anInt907 = arg0 * 98226065) * 1466356589;
		anInt911 = 0;
		anInt912 = 0;
		if (arg1 == -1) {
			arg1 = 0;
		}
		anInt910 = (anInt909 = arg1 * -362397593) * 1076910739;
	}

	@OriginalMember(owner = "client!ed", name = "s", descriptor = "(Ljava/lang/String;B)V")
	final void method7639(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		try {
			if (arg0.startsWith("col=")) {
				anInt908 = (anInt908 * 1079177109 & -16777216 | Class278.method26835(arg0.substring(4), 16, -1918926141) & 0xFFFFFF) * -771431491;
			} else if (arg0.equals("/col")) {
				anInt908 = (anInt908 * 1079177109 & -16777216 | -685387407 * anInt907 & 0xFFFFFF) * -771431491;
			}
			if (arg0.startsWith("argb=")) {
				anInt908 = Class278.method26835(arg0.substring(5), 16, -424457621) * -771431491;
			} else if (arg0.equals("/argb")) {
				anInt908 = anInt907 * 1466356589;
			} else if (arg0.startsWith("str=")) {
				anInt905 = (anInt908 * 1079177109 & -16777216 | Class278.method26835(arg0.substring(4), 16, -1322761849)) * -802464273;
			} else if (arg0.equals("str")) {
				anInt905 = (anInt908 * 1079177109 & -16777216 | 0x800000) * -802464273;
			} else if (arg0.equals("/str")) {
				anInt905 = 802464273;
			} else if (arg0.startsWith("u=")) {
				anInt906 = (anInt908 * 1079177109 & 0xFF000000 | Class278.method26835(arg0.substring(2), 16, -1944096019)) * 1289675291;
			} else if (arg0.equals("u")) {
				anInt906 = (anInt908 * 1079177109 & 0xFF000000) * 1289675291;
			} else if (arg0.equals("/u")) {
				anInt906 = -1289675291;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				anInt910 = 0;
			} else if (arg0.startsWith("shad=")) {
				anInt910 = (anInt908 * 1079177109 & 0xFF000000 | Class278.method26835(arg0.substring(5), 16, -2125371413)) * 1588277541;
			} else if (arg0.equals("shad")) {
				anInt910 = (anInt908 * 1079177109 & 0xFF000000) * 1588277541;
			} else if (arg0.equals("/shad")) {
				anInt910 = anInt909 * 1076910739;
			} else if (arg0.equals("br")) {
				this.method7638(anInt907 * -685387407, anInt909 * -1214719145, -1859835018);
			}
		} catch (@Pc(208) Exception local208) {
		}
	}

	@OriginalMember(owner = "client!ed", name = "ay", descriptor = "(Ljava/lang/String;IIII)V")
	public final void method7640(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method7638(arg3, arg4, -1694494282);
			this.method7641(arg0, arg1 - this.aClass15_8.method373(arg0, -1306486073) / 2, arg2, null, null, null, 0, 0, 1528406287);
		}
	}

	@OriginalMember(owner = "client!ed", name = "x", descriptor = "(Ljava/lang/String;II[Lclient!cm;[ILclient!cg;III)V")
	final void method7641(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class99[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) Class98 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(7) int local7 = arg2 - this.aClass15_8.anInt44 * -1978818351;
		@Pc(9) int local9 = -1;
		@Pc(11) int local11 = -1;
		@Pc(14) int local14 = arg0.length();
		for (@Pc(16) int local16 = 0; local16 < local14; local16++) {
			@Pc(28) char local28 = (char) (Class308.method27442(arg0.charAt(local16), (byte) 36) & 0xFF);
			if (local28 == '<') {
				local9 = local16;
			} else {
				if (local28 == '>' && local9 != -1) {
					@Pc(47) String local47 = arg0.substring(local9 + 1, local16);
					local9 = -1;
					if (local47.equals("lt")) {
						local28 = '<';
					} else if (local47.equals("gt")) {
						local28 = '>';
					} else if (local47.equals("nbsp")) {
						local28 = ' ';
					} else if (local47.equals("shy")) {
						local28 = '\u00ad';
					} else if (local47.equals("times")) {
						local28 = '×';
					} else if (local47.equals("euro")) {
						local28 = '\u0080';
					} else if (local47.equals("copy")) {
						local28 = '©';
					} else {
						if (!local47.equals("reg")) {
							@Pc(115) int local115;
							@Pc(129) int local129;
							if (local47.startsWith("img=")) {
								try {
									local115 = Class679.method33621(local47.substring(4), 2057514145);
									@Pc(119) Class99 local119 = arg3[local115];
									local129 = arg4 == null ? local119.method18288() : arg4[local115];
									if ((anInt908 * 1079177109 & -16777216) == -16777216) {
										local119.method18226(arg1, local7 + this.aClass15_8.anInt44 * -1978818351 - local129, 1, -1, 1);
									} else {
										local119.method18226(arg1, this.aClass15_8.anInt44 * -1978818351 + local7 - local129, 0, anInt908 * 1079177109 & 0xFF000000 | 0xFFFFFF, 1);
									}
									arg1 += arg3[local115].method18214();
									local11 = -1;
								} catch (@Pc(184) Exception local184) {
								}
							} else if (!local47.startsWith("sprite=")) {
								this.method7639(local47, (byte) 23);
							} else if (this.aClass15_8.anInterface1_1 != null) {
								try {
									@Pc(196) boolean local196 = true;
									@Pc(198) int local198 = 0;
									local129 = local47.indexOf(44);
									if (local129 == -1) {
										local115 = Class679.method33621(local47.substring(7), -1347385616);
									} else {
										local115 = Class679.method33621(local47.substring(7, local129), 677721617);
										local198 = Class679.method33621(local47.substring(local129 + 1), -2017293186);
									}
									@Pc(236) Class99[] local236 = this.aClass15_8.anInterface1_1.method29582(this.aClass102_7, local115, (byte) 1);
									if (local236 != null) {
										@Pc(255) int local255 = Math.min(local236[local198].method18288(), this.aClass15_8.anInt46 * -191270971 + this.aClass15_8.anInt45 * 1190692343);
										if ((anInt908 * 1079177109 & -16777216) == -16777216) {
											local236[local198].method18226(arg1, local7 + 2 + this.aClass15_8.anInt44 * -1978818351 - local255, 1, -1, 1);
										} else {
											local236[local198].method18226(arg1, local7 + 2 + this.aClass15_8.anInt44 * -1978818351 - local255, 0, anInt908 * 1079177109 & 0xFF000000 | 0xFFFFFF, 1);
										}
										arg1 += local236[local198].method18214();
									}
									local11 = -1;
								} catch (@Pc(318) Exception local318) {
								}
							}
							continue;
						}
						local28 = '®';
					}
				}
				if (local9 == -1) {
					if (local11 != -1) {
						arg1 += this.aClass15_8.method368(local11, local28, -1749667601);
					}
					if (local28 == ' ') {
						if (anInt911 * -1490254927 > 0) {
							anInt912 += anInt911 * 1411079879;
							arg1 += anInt912 * 1987080647 >> 8;
							anInt912 = (anInt912 * 1987080647 & 0xFF) * -2039742473;
						}
					} else if (arg5 == null) {
						if ((anInt910 * -25197907 & 0xFF000000) != 0) {
							this.method7643(local28, arg1 + 1, local7 + 1, anInt910 * -25197907, true);
						}
						this.method7643(local28, arg1, local7, anInt908 * 1079177109, false);
					} else {
						if ((anInt910 * -25197907 & 0xFF000000) != 0) {
							this.method7644(local28, arg1 + 1, local7 + 1, anInt910 * -25197907, true, arg5, arg6, arg7);
						}
						this.method7644(local28, arg1, local7, anInt908 * 1079177109, false, arg5, arg6, arg7);
					}
					@Pc(442) int local442 = this.aClass15_8.method369(local28, (short) 507);
					if (anInt905 * 1978757391 != -1) {
						this.aClass102_7.method20893(arg1, local7 + (int) ((double) (this.aClass15_8.anInt44 * -1978818351) * 0.7D), local442, anInt905 * 1978757391, -408505989);
					}
					if (anInt906 * 309536787 != -1) {
						this.aClass102_7.method20893(arg1, local7 + this.aClass15_8.anInt44 * -1978818351 + 1, local442, anInt906 * 309536787, 668807214);
					}
					arg1 += local442;
					local11 = local28;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ed", name = "e", descriptor = "(Ljava/lang/String;IIIII)V")
	public final void method7642(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 != null) {
			this.method7638(arg3, arg4, -2027312645);
			this.method7641(arg0, arg1 - this.aClass15_8.method373(arg0, -563677384) / 2, arg2, null, null, null, 0, 0, 1722263882);
		}
	}

	@OriginalMember(owner = "client!ed", name = "r", descriptor = "(CIIIZ)V")
	abstract void method7643(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ed", name = "q", descriptor = "(CIIIZLclient!cg;II)V")
	abstract void method7644(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class98 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!ed", name = "h", descriptor = "(CIIIZ)V")
	abstract void method7645(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "(CIIIZ)V")
	abstract void method7646(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ed", name = "z", descriptor = "(CIIIZ)V")
	abstract void method7647(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ed", name = "p", descriptor = "(CIIIZ)V")
	abstract void method7648(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!ed", name = "v", descriptor = "(CIIIZLclient!cg;II)V")
	abstract void method7649(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class98 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!ed", name = "y", descriptor = "(CIIIZLclient!cg;II)V")
	abstract void method7650(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class98 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!ed", name = "n", descriptor = "(CIIIZLclient!cg;II)V")
	abstract void method7651(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class98 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7);

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "(Ljava/lang/String;IIII)V")
	public final void method7652(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method7638(arg3, arg4, -1548432505);
			this.method7641(arg0, arg1, arg2, null, null, null, 0, 0, 1732515145);
		}
	}

	@OriginalMember(owner = "client!ed", name = "bg", descriptor = "(Ljava/lang/String;)V")
	final void method7653(@OriginalArg(0) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				anInt908 = (anInt908 * 1079177109 & -16777216 | Class278.method26835(arg0.substring(4), 16, 402723010) & 0xFFFFFF) * -771431491;
			} else if (arg0.equals("/col")) {
				anInt908 = (anInt908 * 1079177109 & -16777216 | -685387407 * anInt907 & 0xFFFFFF) * -771431491;
			}
			if (arg0.startsWith("argb=")) {
				anInt908 = Class278.method26835(arg0.substring(5), 16, 1958110690) * -771431491;
			} else if (arg0.equals("/argb")) {
				anInt908 = anInt907 * 1466356589;
			} else if (arg0.startsWith("str=")) {
				anInt905 = (anInt908 * 1079177109 & -16777216 | Class278.method26835(arg0.substring(4), 16, 33299034)) * -802464273;
			} else if (arg0.equals("str")) {
				anInt905 = (anInt908 * 1079177109 & -16777216 | 0x800000) * -802464273;
			} else if (arg0.equals("/str")) {
				anInt905 = 802464273;
			} else if (arg0.startsWith("u=")) {
				anInt906 = (anInt908 * 1079177109 & 0xFF000000 | Class278.method26835(arg0.substring(2), 16, 455657940)) * 1289675291;
			} else if (arg0.equals("u")) {
				anInt906 = (anInt908 * 1079177109 & 0xFF000000) * 1289675291;
			} else if (arg0.equals("/u")) {
				anInt906 = -1289675291;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				anInt910 = 0;
			} else if (arg0.startsWith("shad=")) {
				anInt910 = (anInt908 * 1079177109 & 0xFF000000 | Class278.method26835(arg0.substring(5), 16, -39337129)) * 1588277541;
			} else if (arg0.equals("shad")) {
				anInt910 = (anInt908 * 1079177109 & 0xFF000000) * 1588277541;
			} else if (arg0.equals("/shad")) {
				anInt910 = anInt909 * 1076910739;
			} else if (arg0.equals("br")) {
				this.method7638(anInt907 * -685387407, anInt909 * -1214719145, -1357677648);
			}
		} catch (@Pc(208) Exception local208) {
		}
	}

	@OriginalMember(owner = "client!ed", name = "bn", descriptor = "(Ljava/lang/String;I)V")
	final void method7654(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) boolean local3 = false;
		for (@Pc(5) int local5 = 0; local5 < arg0.length(); local5++) {
			@Pc(13) char local13 = arg0.charAt(local5);
			if (local13 == '<') {
				local3 = true;
			} else if (local13 == '>') {
				local3 = false;
			} else if (!local3 && local13 == ' ') {
				local1++;
			}
		}
		if (local1 > 0) {
			anInt911 = (arg1 - this.aClass15_8.method373(arg0, -954616396) << 8) / local1 * 321774929;
		}
	}

	@OriginalMember(owner = "client!ed", name = "t", descriptor = "(Ljava/lang/String;IIIII)V")
	public final void method7655(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 != null) {
			this.method7638(arg3, arg4, -1868370655);
			this.method7641(arg0, arg1, arg2, null, null, null, 0, 0, 1955611446);
		}
	}

	@OriginalMember(owner = "client!ed", name = "ai", descriptor = "(Ljava/lang/String;IIII)V")
	public final void method7656(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method7638(arg3, arg4, -1886151514);
			this.method7641(arg0, arg1 - this.aClass15_8.method373(arg0, -1987992497) / 2, arg2, null, null, null, 0, 0, 1394116293);
		}
	}

	@OriginalMember(owner = "client!ed", name = "am", descriptor = "(Ljava/lang/String;IIIII)V")
	public final void method7657(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method7638(arg3, arg4, -1044575981);
		@Pc(11) int local11 = arg0.length();
		@Pc(14) int[] local14 = new int[local11];
		@Pc(17) int[] local17 = new int[local11];
		for (@Pc(19) int local19 = 0; local19 < local11; local19++) {
			local14[local19] = (int) (Math.sin((double) local19 / 5.0D + (double) arg5 / 5.0D) * 5.0D);
			local17[local19] = (int) (Math.sin((double) arg5 / 5.0D + (double) local19 / 3.0D) * 5.0D);
		}
		this.method7628(arg0, arg1 - this.aClass15_8.method373(arg0, -2107049233) / 2, arg2, null, null, local14, local17, (byte) 8);
	}

	@OriginalMember(owner = "client!ed", name = "ao", descriptor = "(Ljava/lang/String;IIIIIIIII[Lclient!cm;[ILclient!cg;II)I")
	public final int method7658(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class99[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) Class98 arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		return this.method7627(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, 0, arg10, arg11, arg12, arg13, arg14, (byte) -127);
	}

	@OriginalMember(owner = "client!ed", name = "aj", descriptor = "(Ljava/lang/String;IIIIIIIII[Lclient!cm;[ILclient!cg;II)I")
	public final int method7659(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class99[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) Class98 arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		return this.method7627(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, 0, arg10, arg11, arg12, arg13, arg14, (byte) -71);
	}

	@OriginalMember(owner = "client!ed", name = "an", descriptor = "(Ljava/lang/String;IIIIII)V")
	public final void method7660(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg0 == null) {
			return;
		}
		this.method7638(arg3, arg4, -1881575179);
		@Pc(15) double local15 = 7.0D - (double) arg6 / 8.0D;
		if (local15 < 0.0D) {
			local15 = 0.0D;
		}
		@Pc(24) int local24 = arg0.length();
		@Pc(27) int[] local27 = new int[local24];
		for (@Pc(29) int local29 = 0; local29 < local24; local29++) {
			local27[local29] = (int) (Math.sin((double) local29 / 1.5D + (double) arg5 / 1.0D) * local15);
		}
		this.method7628(arg0, arg1 - this.aClass15_8.method373(arg0, -410466439) / 2, arg2, null, null, null, local27, (byte) 8);
	}

	@OriginalMember(owner = "client!ed", name = "ag", descriptor = "(Ljava/lang/String;IIIIIIIIII[Lclient!cm;[ILclient!cg;II)I")
	public final int method7661(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) Class99[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) Class98 arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		if (arg0 == null) {
			return 0;
		}
		this.method7638(arg5, arg6, -1676866293);
		if (arg9 == 0) {
			arg9 = this.aClass15_8.anInt44 * -1978818351;
		}
		@Pc(40) int[] local40;
		if (arg4 < arg9 + this.aClass15_8.anInt45 * 1190692343 + this.aClass15_8.anInt46 * -191270971 && arg4 < arg9 + arg9) {
			local40 = null;
		} else {
			local40 = new int[] { arg3 };
		}
		@Pc(57) int local57 = this.aClass15_8.method375(arg0, local40, aStringArray12, arg11, (short) 414);
		if (arg10 == -1) {
			arg10 = arg4 / arg9;
			if (arg10 <= 0) {
				arg10 = 1;
			}
		}
		if (arg10 > 0 && local57 >= arg10) {
			aStringArray12[arg10 - 1] = this.aClass15_8.method420(aStringArray12[arg10 - 1], arg3, arg11, 1840044330);
			local57 = arg10;
		}
		if (arg8 == 3 && local57 == 1) {
			arg8 = 1;
		}
		@Pc(110) int local110;
		@Pc(189) int local189;
		if (arg8 == 0) {
			local110 = this.aClass15_8.anInt45 * 1190692343 + arg2;
		} else if (arg8 == 1) {
			local110 = this.aClass15_8.anInt45 * 1190692343 + arg2 + (arg4 - this.aClass15_8.anInt45 * 1190692343 - this.aClass15_8.anInt46 * -191270971 - arg9 * (local57 - 1)) / 2;
		} else if (arg8 == 2) {
			local110 = arg4 + arg2 - this.aClass15_8.anInt46 * -191270971 - (local57 - 1) * arg9;
		} else {
			local189 = (arg4 - this.aClass15_8.anInt45 * 1190692343 - this.aClass15_8.anInt46 * -191270971 - (local57 - 1) * arg9) / (local57 + 1);
			if (local189 < 0) {
				local189 = 0;
			}
			local110 = arg2 + this.aClass15_8.anInt45 * 1190692343 + local189;
			arg9 += local189;
		}
		for (local189 = 0; local189 < local57; local189++) {
			if (arg7 == 0) {
				this.method7641(aStringArray12[local189], arg1, local110, arg11, arg12, arg13, arg14, arg15, 1925806145);
			} else if (arg7 == 1) {
				this.method7641(aStringArray12[local189], arg1 + (arg3 - this.aClass15_8.method373(aStringArray12[local189], -240534812)) / 2, local110, arg11, arg12, arg13, arg14, arg15, 1979618209);
			} else if (arg7 == 2) {
				this.method7641(aStringArray12[local189], arg1 + arg3 - this.aClass15_8.method373(aStringArray12[local189], -2068858880), local110, arg11, arg12, arg13, arg14, arg15, 2048965523);
			} else if (local57 - 1 == local189) {
				this.method7641(aStringArray12[local189], arg1, local110, arg11, arg12, arg13, arg14, arg15, 1506309516);
			} else {
				this.method7666(aStringArray12[local189], arg3, -313671033);
				this.method7641(aStringArray12[local189], arg1, local110, arg11, arg12, arg13, arg14, arg15, 1407536644);
				anInt911 = 0;
			}
			local110 += arg9;
		}
		return local57;
	}

	@OriginalMember(owner = "client!ed", name = "i", descriptor = "(Ljava/lang/String;IIIIII)V")
	public final void method7662(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg0 == null) {
			return;
		}
		this.method7638(arg3, arg4, -1432891020);
		@Pc(11) int local11 = arg0.length();
		@Pc(14) int[] local14 = new int[local11];
		@Pc(17) int[] local17 = new int[local11];
		for (@Pc(19) int local19 = 0; local19 < local11; local19++) {
			local14[local19] = (int) (Math.sin((double) local19 / 5.0D + (double) arg5 / 5.0D) * 5.0D);
			local17[local19] = (int) (Math.sin((double) arg5 / 5.0D + (double) local19 / 3.0D) * 5.0D);
		}
		this.method7628(arg0, arg1 - this.aClass15_8.method373(arg0, -278742554) / 2, arg2, null, null, local14, local17, (byte) 8);
	}

	@OriginalMember(owner = "client!ed", name = "al", descriptor = "(Ljava/lang/String;IIIII)V")
	public final void method7663(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method7638(arg3, arg4, -1891271352);
		@Pc(11) int local11 = arg0.length();
		@Pc(14) int[] local14 = new int[local11];
		for (@Pc(16) int local16 = 0; local16 < local11; local16++) {
			local14[local16] = (int) (Math.sin((double) local16 / 2.0D + (double) arg5 / 5.0D) * 5.0D);
		}
		this.method7628(arg0, arg1 - this.aClass15_8.method373(arg0, -637358297) / 2, arg2, null, null, null, local14, (byte) 8);
	}

	@OriginalMember(owner = "client!ed", name = "aq", descriptor = "(Ljava/lang/String;IIII)V")
	public final void method7664(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 != null) {
			this.method7638(arg3, arg4, -1685834574);
			this.method7641(arg0, arg1 - this.aClass15_8.method373(arg0, -522540406) / 2, arg2, null, null, null, 0, 0, 1616349499);
		}
	}

	@OriginalMember(owner = "client!ed", name = "af", descriptor = "(Ljava/lang/String;IIIII)V")
	public final void method7665(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method7638(arg3, arg4, -1712699995);
		@Pc(11) int local11 = arg0.length();
		@Pc(14) int[] local14 = new int[local11];
		for (@Pc(16) int local16 = 0; local16 < local11; local16++) {
			local14[local16] = (int) (Math.sin((double) local16 / 2.0D + (double) arg5 / 5.0D) * 5.0D);
		}
		this.method7628(arg0, arg1 - this.aClass15_8.method373(arg0, -1727893607) / 2, arg2, null, null, null, local14, (byte) 8);
	}

	@OriginalMember(owner = "client!ed", name = "k", descriptor = "(Ljava/lang/String;II)V")
	final void method7666(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(1) int local1 = 0;
		@Pc(3) boolean local3 = false;
		for (@Pc(5) int local5 = 0; local5 < arg0.length(); local5++) {
			@Pc(13) char local13 = arg0.charAt(local5);
			if (local13 == '<') {
				local3 = true;
			} else if (local13 == '>') {
				local3 = false;
			} else if (!local3 && local13 == ' ') {
				local1++;
			}
		}
		if (local1 > 0) {
			anInt911 = (arg1 - this.aClass15_8.method373(arg0, -869123131) << 8) / local1 * 321774929;
		}
	}

	@OriginalMember(owner = "client!ed", name = "ak", descriptor = "(Ljava/lang/String;IIIII)V")
	public final void method7667(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method7638(arg3, arg4, -1833366031);
		@Pc(11) int local11 = arg0.length();
		@Pc(14) int[] local14 = new int[local11];
		@Pc(17) int[] local17 = new int[local11];
		for (@Pc(19) int local19 = 0; local19 < local11; local19++) {
			local14[local19] = (int) (Math.sin((double) local19 / 5.0D + (double) arg5 / 5.0D) * 5.0D);
			local17[local19] = (int) (Math.sin((double) arg5 / 5.0D + (double) local19 / 3.0D) * 5.0D);
		}
		this.method7628(arg0, arg1 - this.aClass15_8.method373(arg0, -806219543) / 2, arg2, null, null, local14, local17, (byte) 8);
	}

	@OriginalMember(owner = "client!ed", name = "at", descriptor = "(Ljava/lang/String;IIIIII)V")
	public final void method7668(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg0 == null) {
			return;
		}
		this.method7638(arg3, arg4, -975540995);
		@Pc(15) double local15 = 7.0D - (double) arg6 / 8.0D;
		if (local15 < 0.0D) {
			local15 = 0.0D;
		}
		@Pc(24) int local24 = arg0.length();
		@Pc(27) int[] local27 = new int[local24];
		for (@Pc(29) int local29 = 0; local29 < local24; local29++) {
			local27[local29] = (int) (Math.sin((double) local29 / 1.5D + (double) arg5 / 1.0D) * local15);
		}
		this.method7628(arg0, arg1 - this.aClass15_8.method373(arg0, -461144190) / 2, arg2, null, null, null, local27, (byte) 8);
	}

	@OriginalMember(owner = "client!ed", name = "ad", descriptor = "(Ljava/lang/String;IIIIII)V")
	public final void method7669(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg0 == null) {
			return;
		}
		this.method7638(arg3, arg4, -1530176910);
		@Pc(15) double local15 = 7.0D - (double) arg6 / 8.0D;
		if (local15 < 0.0D) {
			local15 = 0.0D;
		}
		@Pc(24) int local24 = arg0.length();
		@Pc(27) int[] local27 = new int[local24];
		for (@Pc(29) int local29 = 0; local29 < local24; local29++) {
			local27[local29] = (int) (Math.sin((double) local29 / 1.5D + (double) arg5 / 1.0D) * local15);
		}
		this.method7628(arg0, arg1 - this.aClass15_8.method373(arg0, 182658008) / 2, arg2, null, null, null, local27, (byte) 8);
	}

	@OriginalMember(owner = "client!ed", name = "ab", descriptor = "(Ljava/lang/String;IIIIIIIIII[Lclient!cm;[ILclient!cg;II)I")
	public final int method7670(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) Class99[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) Class98 arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		if (arg0 == null) {
			return 0;
		}
		this.method7638(arg5, arg6, -1446361788);
		if (arg9 == 0) {
			arg9 = this.aClass15_8.anInt44 * -1978818351;
		}
		@Pc(40) int[] local40;
		if (arg4 < arg9 + this.aClass15_8.anInt45 * 1190692343 + this.aClass15_8.anInt46 * -191270971 && arg4 < arg9 + arg9) {
			local40 = null;
		} else {
			local40 = new int[] { arg3 };
		}
		@Pc(57) int local57 = this.aClass15_8.method375(arg0, local40, aStringArray12, arg11, (short) 414);
		if (arg10 == -1) {
			arg10 = arg4 / arg9;
			if (arg10 <= 0) {
				arg10 = 1;
			}
		}
		if (arg10 > 0 && local57 >= arg10) {
			aStringArray12[arg10 - 1] = this.aClass15_8.method420(aStringArray12[arg10 - 1], arg3, arg11, 2070521488);
			local57 = arg10;
		}
		if (arg8 == 3 && local57 == 1) {
			arg8 = 1;
		}
		@Pc(110) int local110;
		@Pc(189) int local189;
		if (arg8 == 0) {
			local110 = this.aClass15_8.anInt45 * 1190692343 + arg2;
		} else if (arg8 == 1) {
			local110 = this.aClass15_8.anInt45 * 1190692343 + arg2 + (arg4 - this.aClass15_8.anInt45 * 1190692343 - this.aClass15_8.anInt46 * -191270971 - arg9 * (local57 - 1)) / 2;
		} else if (arg8 == 2) {
			local110 = arg4 + arg2 - this.aClass15_8.anInt46 * -191270971 - (local57 - 1) * arg9;
		} else {
			local189 = (arg4 - this.aClass15_8.anInt45 * 1190692343 - this.aClass15_8.anInt46 * -191270971 - (local57 - 1) * arg9) / (local57 + 1);
			if (local189 < 0) {
				local189 = 0;
			}
			local110 = arg2 + this.aClass15_8.anInt45 * 1190692343 + local189;
			arg9 += local189;
		}
		for (local189 = 0; local189 < local57; local189++) {
			if (arg7 == 0) {
				this.method7641(aStringArray12[local189], arg1, local110, arg11, arg12, arg13, arg14, arg15, 1400890315);
			} else if (arg7 == 1) {
				this.method7641(aStringArray12[local189], arg1 + (arg3 - this.aClass15_8.method373(aStringArray12[local189], -1574237700)) / 2, local110, arg11, arg12, arg13, arg14, arg15, 2063251533);
			} else if (arg7 == 2) {
				this.method7641(aStringArray12[local189], arg1 + arg3 - this.aClass15_8.method373(aStringArray12[local189], -1970236161), local110, arg11, arg12, arg13, arg14, arg15, 2034972612);
			} else if (local57 - 1 == local189) {
				this.method7641(aStringArray12[local189], arg1, local110, arg11, arg12, arg13, arg14, arg15, 1802196777);
			} else {
				this.method7666(aStringArray12[local189], arg3, -313671033);
				this.method7641(aStringArray12[local189], arg1, local110, arg11, arg12, arg13, arg14, arg15, 1910035123);
				anInt911 = 0;
			}
			local110 += arg9;
		}
		return local57;
	}

	@OriginalMember(owner = "client!ed", name = "aa", descriptor = "(Ljava/lang/String;IIIILjava/util/Random;I[Lclient!cm;[I)I")
	public final int method7671(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Random arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class99[] arg7, @OriginalArg(8) int[] arg8) {
		if (arg0 == null) {
			return 0;
		}
		arg5.setSeed((long) arg6);
		@Pc(14) int local14 = (arg5.nextInt() & 0x1F) + 192;
		this.method7638(local14 << 24 | arg3 & 0xFFFFFF, local14 << 24 | arg4 & 0xFFFFFF, -1137417102);
		@Pc(34) int local34 = arg0.length();
		@Pc(37) int[] local37 = new int[local34];
		@Pc(39) int local39 = 0;
		for (@Pc(41) int local41 = 0; local41 < local34; local41++) {
			local37[local41] = local39;
			if ((arg5.nextInt() & 0x3) == 0) {
				local39++;
			}
		}
		this.method7628(arg0, arg1, arg2, arg7, arg8, local37, null, (byte) 8);
		return local39;
	}

	@OriginalMember(owner = "client!ed", name = "av", descriptor = "(Ljava/lang/String;IIIIII)V")
	public final void method7672(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg0 == null) {
			return;
		}
		this.method7638(arg3, arg4, -1619418386);
		@Pc(15) double local15 = 7.0D - (double) arg6 / 8.0D;
		if (local15 < 0.0D) {
			local15 = 0.0D;
		}
		@Pc(24) int local24 = arg0.length();
		@Pc(27) int[] local27 = new int[local24];
		for (@Pc(29) int local29 = 0; local29 < local24; local29++) {
			local27[local29] = (int) (Math.sin((double) local29 / 1.5D + (double) arg5 / 1.0D) * local15);
		}
		this.method7628(arg0, arg1 - this.aClass15_8.method373(arg0, -1994322549) / 2, arg2, null, null, null, local27, (byte) 8);
	}

	@OriginalMember(owner = "client!ed", name = "ap", descriptor = "(Ljava/lang/String;IIIILjava/util/Random;I[Lclient!cm;[I)I")
	public final int method7673(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Random arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class99[] arg7, @OriginalArg(8) int[] arg8) {
		if (arg0 == null) {
			return 0;
		}
		arg5.setSeed((long) arg6);
		@Pc(14) int local14 = (arg5.nextInt() & 0x1F) + 192;
		this.method7638(local14 << 24 | arg3 & 0xFFFFFF, local14 << 24 | arg4 & 0xFFFFFF, -1157481142);
		@Pc(34) int local34 = arg0.length();
		@Pc(37) int[] local37 = new int[local34];
		@Pc(39) int local39 = 0;
		for (@Pc(41) int local41 = 0; local41 < local34; local41++) {
			local37[local41] = local39;
			if ((arg5.nextInt() & 0x3) == 0) {
				local39++;
			}
		}
		this.method7628(arg0, arg1, arg2, arg7, arg8, local37, null, (byte) 8);
		return local39;
	}

	@OriginalMember(owner = "client!ed", name = "ar", descriptor = "(Ljava/lang/String;IIIIIIIILjava/util/Random;I[I[Lclient!cm;[I)I")
	public final int method7674(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Random arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) Class99[] arg12, @OriginalArg(13) int[] arg13) {
		if (arg0 == null) {
			return 0;
		}
		arg9.setSeed((long) arg10);
		@Pc(15) int local15 = (arg9.nextInt() & 0x1F) + 192;
		this.method7638(local15 << 24 | arg5 & 0xFFFFFF, arg6 == -1 ? 0 : local15 << 24 | arg6 & 0xFFFFFF, -1587292740);
		@Pc(40) int local40 = arg0.length();
		@Pc(43) int[] local43 = new int[local40];
		@Pc(45) int local45 = 0;
		@Pc(47) int local47;
		for (local47 = 0; local47 < local40; local47++) {
			local43[local47] = local45;
			if ((arg9.nextInt() & 0x3) == 0) {
				local45++;
			}
		}
		local47 = arg1;
		@Pc(72) int local72 = this.aClass15_8.anInt45 * 1190692343 + arg2;
		@Pc(74) int local74 = -1;
		if (arg8 == 1) {
			local72 += (arg4 - this.aClass15_8.anInt45 * 1190692343 - this.aClass15_8.anInt46 * -191270971) / 2;
		} else if (arg8 == 2) {
			local72 = arg2 + arg4 - this.aClass15_8.anInt46 * -191270971;
		}
		if (arg7 == 1) {
			local74 = this.aClass15_8.method373(arg0, -53418045) + local45;
			local47 = arg1 + (arg3 - local74) / 2;
		} else if (arg7 == 2) {
			local74 = this.aClass15_8.method373(arg0, -1641909399) + local45;
			local47 = arg1 + (arg3 - local74);
		}
		this.method7628(arg0, local47, local72, arg12, arg13, local43, null, (byte) 8);
		if (arg11 != null) {
			if (local74 == -1) {
				local74 = this.aClass15_8.method373(arg0, -1168452518) + local45;
			}
			arg11[0] = local47;
			arg11[1] = local72 - this.aClass15_8.anInt45 * 1190692343;
			arg11[2] = local74;
			arg11[3] = this.aClass15_8.anInt46 * -191270971 + this.aClass15_8.anInt45 * 1190692343;
		}
		return local45;
	}

	@OriginalMember(owner = "client!ed", name = "au", descriptor = "(Ljava/lang/String;IIIIIIIILjava/util/Random;I[I[Lclient!cm;[I)I")
	public final int method7675(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Random arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) Class99[] arg12, @OriginalArg(13) int[] arg13) {
		if (arg0 == null) {
			return 0;
		}
		arg9.setSeed((long) arg10);
		@Pc(15) int local15 = (arg9.nextInt() & 0x1F) + 192;
		this.method7638(local15 << 24 | arg5 & 0xFFFFFF, arg6 == -1 ? 0 : local15 << 24 | arg6 & 0xFFFFFF, -1875988200);
		@Pc(40) int local40 = arg0.length();
		@Pc(43) int[] local43 = new int[local40];
		@Pc(45) int local45 = 0;
		@Pc(47) int local47;
		for (local47 = 0; local47 < local40; local47++) {
			local43[local47] = local45;
			if ((arg9.nextInt() & 0x3) == 0) {
				local45++;
			}
		}
		local47 = arg1;
		@Pc(72) int local72 = this.aClass15_8.anInt45 * 1190692343 + arg2;
		@Pc(74) int local74 = -1;
		if (arg8 == 1) {
			local72 += (arg4 - this.aClass15_8.anInt45 * 1190692343 - this.aClass15_8.anInt46 * -191270971) / 2;
		} else if (arg8 == 2) {
			local72 = arg2 + arg4 - this.aClass15_8.anInt46 * -191270971;
		}
		if (arg7 == 1) {
			local74 = this.aClass15_8.method373(arg0, 80378713) + local45;
			local47 = arg1 + (arg3 - local74) / 2;
		} else if (arg7 == 2) {
			local74 = this.aClass15_8.method373(arg0, -1020372372) + local45;
			local47 = arg1 + (arg3 - local74);
		}
		this.method7628(arg0, local47, local72, arg12, arg13, local43, null, (byte) 8);
		if (arg11 != null) {
			if (local74 == -1) {
				local74 = this.aClass15_8.method373(arg0, -1618092213) + local45;
			}
			arg11[0] = local47;
			arg11[1] = local72 - this.aClass15_8.anInt45 * 1190692343;
			arg11[2] = local74;
			arg11[3] = this.aClass15_8.anInt46 * -191270971 + this.aClass15_8.anInt45 * 1190692343;
		}
		return local45;
	}

	@OriginalMember(owner = "client!ed", name = "ah", descriptor = "(Ljava/lang/String;IIIII)V")
	public final void method7676(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 == null) {
			return;
		}
		this.method7638(arg3, arg4, -1133220814);
		@Pc(11) int local11 = arg0.length();
		@Pc(14) int[] local14 = new int[local11];
		for (@Pc(16) int local16 = 0; local16 < local11; local16++) {
			local14[local16] = (int) (Math.sin((double) local16 / 2.0D + (double) arg5 / 5.0D) * 5.0D);
		}
		this.method7628(arg0, arg1 - this.aClass15_8.method373(arg0, -59689983) / 2, arg2, null, null, null, local14, (byte) 8);
	}

	@OriginalMember(owner = "client!ed", name = "as", descriptor = "(Ljava/lang/String;)V")
	final void method7677(@OriginalArg(0) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				anInt908 = (anInt908 * 1079177109 & -16777216 | Class278.method26835(arg0.substring(4), 16, -1903676965) & 0xFFFFFF) * -771431491;
			} else if (arg0.equals("/col")) {
				anInt908 = (anInt908 * 1079177109 & -16777216 | -685387407 * anInt907 & 0xFFFFFF) * -771431491;
			}
			if (arg0.startsWith("argb=")) {
				anInt908 = Class278.method26835(arg0.substring(5), 16, -1606594888) * -771431491;
			} else if (arg0.equals("/argb")) {
				anInt908 = anInt907 * 1466356589;
			} else if (arg0.startsWith("str=")) {
				anInt905 = (anInt908 * 1079177109 & -16777216 | Class278.method26835(arg0.substring(4), 16, 100262840)) * -802464273;
			} else if (arg0.equals("str")) {
				anInt905 = (anInt908 * 1079177109 & -16777216 | 0x800000) * -802464273;
			} else if (arg0.equals("/str")) {
				anInt905 = 802464273;
			} else if (arg0.startsWith("u=")) {
				anInt906 = (anInt908 * 1079177109 & 0xFF000000 | Class278.method26835(arg0.substring(2), 16, -968290784)) * 1289675291;
			} else if (arg0.equals("u")) {
				anInt906 = (anInt908 * 1079177109 & 0xFF000000) * 1289675291;
			} else if (arg0.equals("/u")) {
				anInt906 = -1289675291;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				anInt910 = 0;
			} else if (arg0.startsWith("shad=")) {
				anInt910 = (anInt908 * 1079177109 & 0xFF000000 | Class278.method26835(arg0.substring(5), 16, 1039357812)) * 1588277541;
			} else if (arg0.equals("shad")) {
				anInt910 = (anInt908 * 1079177109 & 0xFF000000) * 1588277541;
			} else if (arg0.equals("/shad")) {
				anInt910 = anInt909 * 1076910739;
			} else if (arg0.equals("br")) {
				this.method7638(anInt907 * -685387407, anInt909 * -1214719145, -1886134626);
			}
		} catch (@Pc(208) Exception local208) {
		}
	}

	@OriginalMember(owner = "client!ed", name = "ac", descriptor = "(Ljava/lang/String;IIIIIIIIII[Lclient!cm;[ILclient!cg;II)I")
	public final int method7678(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) Class99[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) Class98 arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		if (arg0 == null) {
			return 0;
		}
		this.method7638(arg5, arg6, -2111795551);
		if (arg9 == 0) {
			arg9 = this.aClass15_8.anInt44 * -1978818351;
		}
		@Pc(40) int[] local40;
		if (arg4 < arg9 + this.aClass15_8.anInt45 * 1190692343 + this.aClass15_8.anInt46 * -191270971 && arg4 < arg9 + arg9) {
			local40 = null;
		} else {
			local40 = new int[] { arg3 };
		}
		@Pc(57) int local57 = this.aClass15_8.method375(arg0, local40, aStringArray12, arg11, (short) 414);
		if (arg10 == -1) {
			arg10 = arg4 / arg9;
			if (arg10 <= 0) {
				arg10 = 1;
			}
		}
		if (arg10 > 0 && local57 >= arg10) {
			aStringArray12[arg10 - 1] = this.aClass15_8.method420(aStringArray12[arg10 - 1], arg3, arg11, 1498770960);
			local57 = arg10;
		}
		if (arg8 == 3 && local57 == 1) {
			arg8 = 1;
		}
		@Pc(110) int local110;
		@Pc(189) int local189;
		if (arg8 == 0) {
			local110 = this.aClass15_8.anInt45 * 1190692343 + arg2;
		} else if (arg8 == 1) {
			local110 = this.aClass15_8.anInt45 * 1190692343 + arg2 + (arg4 - this.aClass15_8.anInt45 * 1190692343 - this.aClass15_8.anInt46 * -191270971 - arg9 * (local57 - 1)) / 2;
		} else if (arg8 == 2) {
			local110 = arg4 + arg2 - this.aClass15_8.anInt46 * -191270971 - (local57 - 1) * arg9;
		} else {
			local189 = (arg4 - this.aClass15_8.anInt45 * 1190692343 - this.aClass15_8.anInt46 * -191270971 - (local57 - 1) * arg9) / (local57 + 1);
			if (local189 < 0) {
				local189 = 0;
			}
			local110 = arg2 + this.aClass15_8.anInt45 * 1190692343 + local189;
			arg9 += local189;
		}
		for (local189 = 0; local189 < local57; local189++) {
			if (arg7 == 0) {
				this.method7641(aStringArray12[local189], arg1, local110, arg11, arg12, arg13, arg14, arg15, 1905741060);
			} else if (arg7 == 1) {
				this.method7641(aStringArray12[local189], arg1 + (arg3 - this.aClass15_8.method373(aStringArray12[local189], -322789838)) / 2, local110, arg11, arg12, arg13, arg14, arg15, 1349302765);
			} else if (arg7 == 2) {
				this.method7641(aStringArray12[local189], arg1 + arg3 - this.aClass15_8.method373(aStringArray12[local189], -1098434008), local110, arg11, arg12, arg13, arg14, arg15, 1421188176);
			} else if (local57 - 1 == local189) {
				this.method7641(aStringArray12[local189], arg1, local110, arg11, arg12, arg13, arg14, arg15, 1525247901);
			} else {
				this.method7666(aStringArray12[local189], arg3, -313671033);
				this.method7641(aStringArray12[local189], arg1, local110, arg11, arg12, arg13, arg14, arg15, 2118178687);
				anInt911 = 0;
			}
			local110 += arg9;
		}
		return local57;
	}

	@OriginalMember(owner = "client!ed", name = "br", descriptor = "(Ljava/lang/String;I)V")
	final void method7679(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) boolean local3 = false;
		for (@Pc(5) int local5 = 0; local5 < arg0.length(); local5++) {
			@Pc(13) char local13 = arg0.charAt(local5);
			if (local13 == '<') {
				local3 = true;
			} else if (local13 == '>') {
				local3 = false;
			} else if (!local3 && local13 == ' ') {
				local1++;
			}
		}
		if (local1 > 0) {
			anInt911 = (arg1 - this.aClass15_8.method373(arg0, -602313902) << 8) / local1 * 321774929;
		}
	}

	@OriginalMember(owner = "client!ed", name = "bl", descriptor = "(Ljava/lang/String;I)V")
	final void method7680(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) boolean local3 = false;
		for (@Pc(5) int local5 = 0; local5 < arg0.length(); local5++) {
			@Pc(13) char local13 = arg0.charAt(local5);
			if (local13 == '<') {
				local3 = true;
			} else if (local13 == '>') {
				local3 = false;
			} else if (!local3 && local13 == ' ') {
				local1++;
			}
		}
		if (local1 > 0) {
			anInt911 = (arg1 - this.aClass15_8.method373(arg0, -72927929) << 8) / local1 * 321774929;
		}
	}

	@OriginalMember(owner = "client!ed", name = "bj", descriptor = "(Ljava/lang/String;II[Lclient!cm;[I[I[I)V")
	final void method7681(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class99[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6) {
		@Pc(7) int local7 = arg2 - this.aClass15_8.anInt44 * -1978818351;
		@Pc(9) int local9 = -1;
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = 0;
		@Pc(16) int local16 = arg0.length();
		for (@Pc(18) int local18 = 0; local18 < local16; local18++) {
			@Pc(30) char local30 = (char) (Class308.method27442(arg0.charAt(local18), (byte) 8) & 0xFF);
			if (local30 == '<') {
				local9 = local18;
			} else {
				@Pc(118) int local118;
				@Pc(127) int local127;
				if (local30 == '>' && local9 != -1) {
					@Pc(49) String local49 = arg0.substring(local9 + 1, local18);
					local9 = -1;
					if (local49.equals("lt")) {
						local30 = '<';
					} else if (local49.equals("gt")) {
						local30 = '>';
					} else if (local49.equals("nbsp")) {
						local30 = ' ';
					} else if (local49.equals("shy")) {
						local30 = '\u00ad';
					} else if (local49.equals("times")) {
						local30 = '×';
					} else if (local49.equals("euro")) {
						local30 = '\u0080';
					} else if (local49.equals("copy")) {
						local30 = '©';
					} else {
						if (!local49.equals("reg")) {
							@Pc(137) int local137;
							@Pc(151) int local151;
							if (local49.startsWith("img=")) {
								try {
									if (arg5 == null) {
										local118 = 0;
									} else {
										local118 = arg5[local13];
									}
									if (arg6 == null) {
										local127 = 0;
									} else {
										local127 = arg6[local13];
									}
									local13++;
									local137 = Class679.method33621(local49.substring(4), 822412870);
									@Pc(141) Class99 local141 = arg3[local137];
									local151 = arg4 == null ? local141.method18288() : arg4[local137];
									local141.method18226(arg1 + local118, local7 + this.aClass15_8.anInt44 * -1978818351 - local151 + local127, 1, -1, 1);
									arg1 += arg3[local137].method18214();
									local11 = -1;
								} catch (@Pc(181) Exception local181) {
								}
							} else if (!local49.startsWith("sprite=")) {
								this.method7639(local49, (byte) -24);
							} else if (this.aClass15_8.anInterface1_1 != null) {
								try {
									@Pc(192) boolean local192 = true;
									local127 = 0;
									local137 = local49.indexOf(44);
									if (local137 == -1) {
										local118 = Class679.method33621(local49.substring(7), -977269759);
									} else {
										local118 = Class679.method33621(local49.substring(7, local137), 1009543456);
										local127 = Class679.method33621(local49.substring(local137 + 1), -1876289423);
									}
									@Pc(229) int local229;
									if (arg5 == null) {
										local229 = 0;
									} else {
										local229 = arg5[local13];
									}
									if (arg6 == null) {
										local151 = 0;
									} else {
										local151 = arg6[local13];
									}
									local13++;
									@Pc(251) Class99[] local251 = this.aClass15_8.anInterface1_1.method29582(this.aClass102_7, local118, (byte) 1);
									if (local251 != null) {
										@Pc(271) int local271 = Math.min(local251[local127].method18288(), this.aClass15_8.anInt46 * -191270971 + this.aClass15_8.anInt45 * 1190692343);
										local251[local127].method18226(local229 + arg1, local151 + (this.aClass15_8.anInt44 * -1978818351 + local7 + 3 - local271), 1, -1, 1);
										arg1 += local251[local127].method18214();
									}
									local11 = -1;
								} catch (@Pc(305) Exception local305) {
								}
							}
							continue;
						}
						local30 = '®';
					}
				}
				if (local9 == -1) {
					if (local11 != -1) {
						arg1 += this.aClass15_8.method368(local11, local30, -2141178376);
					}
					@Pc(332) int local332;
					if (arg5 == null) {
						local332 = 0;
					} else {
						local332 = arg5[local13];
					}
					if (arg6 == null) {
						local118 = 0;
					} else {
						local118 = arg6[local13];
					}
					local13++;
					if (local30 != ' ') {
						if ((anInt910 * -25197907 & 0xFF000000) != 0) {
							this.method7643(local30, local332 + arg1 + 1, local7 + 1 + local118, anInt910 * -25197907, true);
						}
						this.method7643(local30, arg1 + local332, local118 + local7, anInt908 * 1079177109, false);
					} else if (anInt911 * -1490254927 > 0) {
						anInt912 += anInt911 * 1411079879;
						arg1 += anInt912 * 1987080647 >> 8;
						anInt912 = (anInt912 * 1987080647 & 0xFF) * -2039742473;
					}
					local127 = this.aClass15_8.method369(local30, (short) -17771);
					if (anInt905 * 1978757391 != -1) {
						this.aClass102_7.method20893(arg1, local7 + (int) ((double) (this.aClass15_8.anInt44 * -1978818351) * 0.7D), local127, anInt905 * 1978757391, 1270079500);
					}
					if (anInt906 * 309536787 != -1) {
						this.aClass102_7.method20893(arg1, this.aClass15_8.anInt44 * -1978818351 + local7, local127, anInt906 * 309536787, 1244355348);
					}
					arg1 += local127;
					local11 = local30;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ed", name = "az", descriptor = "(II)V")
	final void method7682(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		anInt905 = 802464273;
		anInt906 = -1289675291;
		anInt908 = (anInt907 = arg0 * 98226065) * 1466356589;
		anInt911 = 0;
		anInt912 = 0;
		if (arg1 == -1) {
			arg1 = 0;
		}
		anInt910 = (anInt909 = arg1 * -362397593) * 1076910739;
	}

	@OriginalMember(owner = "client!ed", name = "aw", descriptor = "(Ljava/lang/String;)V")
	final void method7683(@OriginalArg(0) String arg0) {
		try {
			if (arg0.startsWith("col=")) {
				anInt908 = (anInt908 * 1079177109 & -16777216 | Class278.method26835(arg0.substring(4), 16, -887427319) & 0xFFFFFF) * -771431491;
			} else if (arg0.equals("/col")) {
				anInt908 = (anInt908 * 1079177109 & -16777216 | -685387407 * anInt907 & 0xFFFFFF) * -771431491;
			}
			if (arg0.startsWith("argb=")) {
				anInt908 = Class278.method26835(arg0.substring(5), 16, -1161861058) * -771431491;
			} else if (arg0.equals("/argb")) {
				anInt908 = anInt907 * 1466356589;
			} else if (arg0.startsWith("str=")) {
				anInt905 = (anInt908 * 1079177109 & -16777216 | Class278.method26835(arg0.substring(4), 16, 1164222812)) * -802464273;
			} else if (arg0.equals("str")) {
				anInt905 = (anInt908 * 1079177109 & -16777216 | 0x800000) * -802464273;
			} else if (arg0.equals("/str")) {
				anInt905 = 802464273;
			} else if (arg0.startsWith("u=")) {
				anInt906 = (anInt908 * 1079177109 & 0xFF000000 | Class278.method26835(arg0.substring(2), 16, -197368752)) * 1289675291;
			} else if (arg0.equals("u")) {
				anInt906 = (anInt908 * 1079177109 & 0xFF000000) * 1289675291;
			} else if (arg0.equals("/u")) {
				anInt906 = -1289675291;
			} else if (arg0.equalsIgnoreCase("shad=-1")) {
				anInt910 = 0;
			} else if (arg0.startsWith("shad=")) {
				anInt910 = (anInt908 * 1079177109 & 0xFF000000 | Class278.method26835(arg0.substring(5), 16, -1095727272)) * 1588277541;
			} else if (arg0.equals("shad")) {
				anInt910 = (anInt908 * 1079177109 & 0xFF000000) * 1588277541;
			} else if (arg0.equals("/shad")) {
				anInt910 = anInt909 * 1076910739;
			} else if (arg0.equals("br")) {
				this.method7638(anInt907 * -685387407, anInt909 * -1214719145, -1230006276);
			}
		} catch (@Pc(208) Exception local208) {
		}
	}

	@OriginalMember(owner = "client!ed", name = "ba", descriptor = "(Ljava/lang/String;II[Lclient!cm;[ILclient!cg;II)V")
	final void method7684(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class99[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) Class98 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(7) int local7 = arg2 - this.aClass15_8.anInt44 * -1978818351;
		@Pc(9) int local9 = -1;
		@Pc(11) int local11 = -1;
		@Pc(14) int local14 = arg0.length();
		for (@Pc(16) int local16 = 0; local16 < local14; local16++) {
			@Pc(28) char local28 = (char) (Class308.method27442(arg0.charAt(local16), (byte) -8) & 0xFF);
			if (local28 == '<') {
				local9 = local16;
			} else {
				if (local28 == '>' && local9 != -1) {
					@Pc(47) String local47 = arg0.substring(local9 + 1, local16);
					local9 = -1;
					if (local47.equals("lt")) {
						local28 = '<';
					} else if (local47.equals("gt")) {
						local28 = '>';
					} else if (local47.equals("nbsp")) {
						local28 = ' ';
					} else if (local47.equals("shy")) {
						local28 = '\u00ad';
					} else if (local47.equals("times")) {
						local28 = '×';
					} else if (local47.equals("euro")) {
						local28 = '\u0080';
					} else if (local47.equals("copy")) {
						local28 = '©';
					} else {
						if (!local47.equals("reg")) {
							@Pc(115) int local115;
							@Pc(129) int local129;
							if (local47.startsWith("img=")) {
								try {
									local115 = Class679.method33621(local47.substring(4), -995002888);
									@Pc(119) Class99 local119 = arg3[local115];
									local129 = arg4 == null ? local119.method18288() : arg4[local115];
									if ((anInt908 * 1079177109 & -16777216) == -16777216) {
										local119.method18226(arg1, local7 + this.aClass15_8.anInt44 * -1978818351 - local129, 1, -1, 1);
									} else {
										local119.method18226(arg1, this.aClass15_8.anInt44 * -1978818351 + local7 - local129, 0, anInt908 * 1079177109 & 0xFF000000 | 0xFFFFFF, 1);
									}
									arg1 += arg3[local115].method18214();
									local11 = -1;
								} catch (@Pc(184) Exception local184) {
								}
							} else if (!local47.startsWith("sprite=")) {
								this.method7639(local47, (byte) 22);
							} else if (this.aClass15_8.anInterface1_1 != null) {
								try {
									@Pc(196) boolean local196 = true;
									@Pc(198) int local198 = 0;
									local129 = local47.indexOf(44);
									if (local129 == -1) {
										local115 = Class679.method33621(local47.substring(7), 1972757510);
									} else {
										local115 = Class679.method33621(local47.substring(7, local129), -934195472);
										local198 = Class679.method33621(local47.substring(local129 + 1), -870460726);
									}
									@Pc(236) Class99[] local236 = this.aClass15_8.anInterface1_1.method29582(this.aClass102_7, local115, (byte) 1);
									if (local236 != null) {
										@Pc(255) int local255 = Math.min(local236[local198].method18288(), this.aClass15_8.anInt46 * -191270971 + this.aClass15_8.anInt45 * 1190692343);
										if ((anInt908 * 1079177109 & -16777216) == -16777216) {
											local236[local198].method18226(arg1, local7 + 2 + this.aClass15_8.anInt44 * -1978818351 - local255, 1, -1, 1);
										} else {
											local236[local198].method18226(arg1, local7 + 2 + this.aClass15_8.anInt44 * -1978818351 - local255, 0, anInt908 * 1079177109 & 0xFF000000 | 0xFFFFFF, 1);
										}
										arg1 += local236[local198].method18214();
									}
									local11 = -1;
								} catch (@Pc(318) Exception local318) {
								}
							}
							continue;
						}
						local28 = '®';
					}
				}
				if (local9 == -1) {
					if (local11 != -1) {
						arg1 += this.aClass15_8.method368(local11, local28, -1106681891);
					}
					if (local28 == ' ') {
						if (anInt911 * -1490254927 > 0) {
							anInt912 += anInt911 * 1411079879;
							arg1 += anInt912 * 1987080647 >> 8;
							anInt912 = (anInt912 * 1987080647 & 0xFF) * -2039742473;
						}
					} else if (arg5 == null) {
						if ((anInt910 * -25197907 & 0xFF000000) != 0) {
							this.method7643(local28, arg1 + 1, local7 + 1, anInt910 * -25197907, true);
						}
						this.method7643(local28, arg1, local7, anInt908 * 1079177109, false);
					} else {
						if ((anInt910 * -25197907 & 0xFF000000) != 0) {
							this.method7644(local28, arg1 + 1, local7 + 1, anInt910 * -25197907, true, arg5, arg6, arg7);
						}
						this.method7644(local28, arg1, local7, anInt908 * 1079177109, false, arg5, arg6, arg7);
					}
					@Pc(442) int local442 = this.aClass15_8.method369(local28, (short) -18445);
					if (anInt905 * 1978757391 != -1) {
						this.aClass102_7.method20893(arg1, local7 + (int) ((double) (this.aClass15_8.anInt44 * -1978818351) * 0.7D), local442, anInt905 * 1978757391, 115120460);
					}
					if (anInt906 * 309536787 != -1) {
						this.aClass102_7.method20893(arg1, local7 + this.aClass15_8.anInt44 * -1978818351 + 1, local442, anInt906 * 309536787, -422040851);
					}
					arg1 += local442;
					local11 = local28;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ed", name = "bs", descriptor = "(Ljava/lang/String;II[Lclient!cm;[I[I[I)V")
	final void method7685(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class99[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6) {
		@Pc(7) int local7 = arg2 - this.aClass15_8.anInt44 * -1978818351;
		@Pc(9) int local9 = -1;
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = 0;
		@Pc(16) int local16 = arg0.length();
		for (@Pc(18) int local18 = 0; local18 < local16; local18++) {
			@Pc(30) char local30 = (char) (Class308.method27442(arg0.charAt(local18), (byte) 24) & 0xFF);
			if (local30 == '<') {
				local9 = local18;
			} else {
				@Pc(118) int local118;
				@Pc(127) int local127;
				if (local30 == '>' && local9 != -1) {
					@Pc(49) String local49 = arg0.substring(local9 + 1, local18);
					local9 = -1;
					if (local49.equals("lt")) {
						local30 = '<';
					} else if (local49.equals("gt")) {
						local30 = '>';
					} else if (local49.equals("nbsp")) {
						local30 = ' ';
					} else if (local49.equals("shy")) {
						local30 = '\u00ad';
					} else if (local49.equals("times")) {
						local30 = '×';
					} else if (local49.equals("euro")) {
						local30 = '\u0080';
					} else if (local49.equals("copy")) {
						local30 = '©';
					} else {
						if (!local49.equals("reg")) {
							@Pc(137) int local137;
							@Pc(151) int local151;
							if (local49.startsWith("img=")) {
								try {
									if (arg5 == null) {
										local118 = 0;
									} else {
										local118 = arg5[local13];
									}
									if (arg6 == null) {
										local127 = 0;
									} else {
										local127 = arg6[local13];
									}
									local13++;
									local137 = Class679.method33621(local49.substring(4), 1421858161);
									@Pc(141) Class99 local141 = arg3[local137];
									local151 = arg4 == null ? local141.method18288() : arg4[local137];
									local141.method18226(arg1 + local118, local7 + this.aClass15_8.anInt44 * -1978818351 - local151 + local127, 1, -1, 1);
									arg1 += arg3[local137].method18214();
									local11 = -1;
								} catch (@Pc(181) Exception local181) {
								}
							} else if (!local49.startsWith("sprite=")) {
								this.method7639(local49, (byte) -12);
							} else if (this.aClass15_8.anInterface1_1 != null) {
								try {
									@Pc(192) boolean local192 = true;
									local127 = 0;
									local137 = local49.indexOf(44);
									if (local137 == -1) {
										local118 = Class679.method33621(local49.substring(7), 231270733);
									} else {
										local118 = Class679.method33621(local49.substring(7, local137), 1385654468);
										local127 = Class679.method33621(local49.substring(local137 + 1), -1566588508);
									}
									@Pc(229) int local229;
									if (arg5 == null) {
										local229 = 0;
									} else {
										local229 = arg5[local13];
									}
									if (arg6 == null) {
										local151 = 0;
									} else {
										local151 = arg6[local13];
									}
									local13++;
									@Pc(251) Class99[] local251 = this.aClass15_8.anInterface1_1.method29582(this.aClass102_7, local118, (byte) 1);
									if (local251 != null) {
										@Pc(271) int local271 = Math.min(local251[local127].method18288(), this.aClass15_8.anInt46 * -191270971 + this.aClass15_8.anInt45 * 1190692343);
										local251[local127].method18226(local229 + arg1, local151 + (this.aClass15_8.anInt44 * -1978818351 + local7 + 3 - local271), 1, -1, 1);
										arg1 += local251[local127].method18214();
									}
									local11 = -1;
								} catch (@Pc(305) Exception local305) {
								}
							}
							continue;
						}
						local30 = '®';
					}
				}
				if (local9 == -1) {
					if (local11 != -1) {
						arg1 += this.aClass15_8.method368(local11, local30, -926376650);
					}
					@Pc(332) int local332;
					if (arg5 == null) {
						local332 = 0;
					} else {
						local332 = arg5[local13];
					}
					if (arg6 == null) {
						local118 = 0;
					} else {
						local118 = arg6[local13];
					}
					local13++;
					if (local30 != ' ') {
						if ((anInt910 * -25197907 & 0xFF000000) != 0) {
							this.method7643(local30, local332 + arg1 + 1, local7 + 1 + local118, anInt910 * -25197907, true);
						}
						this.method7643(local30, arg1 + local332, local118 + local7, anInt908 * 1079177109, false);
					} else if (anInt911 * -1490254927 > 0) {
						anInt912 += anInt911 * 1411079879;
						arg1 += anInt912 * 1987080647 >> 8;
						anInt912 = (anInt912 * 1987080647 & 0xFF) * -2039742473;
					}
					local127 = this.aClass15_8.method369(local30, (short) -16973);
					if (anInt905 * 1978757391 != -1) {
						this.aClass102_7.method20893(arg1, local7 + (int) ((double) (this.aClass15_8.anInt44 * -1978818351) * 0.7D), local127, anInt905 * 1978757391, 627229120);
					}
					if (anInt906 * 309536787 != -1) {
						this.aClass102_7.method20893(arg1, this.aClass15_8.anInt44 * -1978818351 + local7, local127, anInt906 * 309536787, 723487551);
					}
					arg1 += local127;
					local11 = local30;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ed", name = "bt", descriptor = "(Ljava/lang/String;II[Lclient!cm;[I[I[I)V")
	final void method7686(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class99[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6) {
		@Pc(7) int local7 = arg2 - this.aClass15_8.anInt44 * -1978818351;
		@Pc(9) int local9 = -1;
		@Pc(11) int local11 = -1;
		@Pc(13) int local13 = 0;
		@Pc(16) int local16 = arg0.length();
		for (@Pc(18) int local18 = 0; local18 < local16; local18++) {
			@Pc(30) char local30 = (char) (Class308.method27442(arg0.charAt(local18), (byte) -87) & 0xFF);
			if (local30 == '<') {
				local9 = local18;
			} else {
				@Pc(118) int local118;
				@Pc(127) int local127;
				if (local30 == '>' && local9 != -1) {
					@Pc(49) String local49 = arg0.substring(local9 + 1, local18);
					local9 = -1;
					if (local49.equals("lt")) {
						local30 = '<';
					} else if (local49.equals("gt")) {
						local30 = '>';
					} else if (local49.equals("nbsp")) {
						local30 = ' ';
					} else if (local49.equals("shy")) {
						local30 = '\u00ad';
					} else if (local49.equals("times")) {
						local30 = '×';
					} else if (local49.equals("euro")) {
						local30 = '\u0080';
					} else if (local49.equals("copy")) {
						local30 = '©';
					} else {
						if (!local49.equals("reg")) {
							@Pc(137) int local137;
							@Pc(151) int local151;
							if (local49.startsWith("img=")) {
								try {
									if (arg5 == null) {
										local118 = 0;
									} else {
										local118 = arg5[local13];
									}
									if (arg6 == null) {
										local127 = 0;
									} else {
										local127 = arg6[local13];
									}
									local13++;
									local137 = Class679.method33621(local49.substring(4), -1429885195);
									@Pc(141) Class99 local141 = arg3[local137];
									local151 = arg4 == null ? local141.method18288() : arg4[local137];
									local141.method18226(arg1 + local118, local7 + this.aClass15_8.anInt44 * -1978818351 - local151 + local127, 1, -1, 1);
									arg1 += arg3[local137].method18214();
									local11 = -1;
								} catch (@Pc(181) Exception local181) {
								}
							} else if (!local49.startsWith("sprite=")) {
								this.method7639(local49, (byte) 71);
							} else if (this.aClass15_8.anInterface1_1 != null) {
								try {
									@Pc(192) boolean local192 = true;
									local127 = 0;
									local137 = local49.indexOf(44);
									if (local137 == -1) {
										local118 = Class679.method33621(local49.substring(7), 1080656096);
									} else {
										local118 = Class679.method33621(local49.substring(7, local137), -1199251261);
										local127 = Class679.method33621(local49.substring(local137 + 1), -2053871596);
									}
									@Pc(229) int local229;
									if (arg5 == null) {
										local229 = 0;
									} else {
										local229 = arg5[local13];
									}
									if (arg6 == null) {
										local151 = 0;
									} else {
										local151 = arg6[local13];
									}
									local13++;
									@Pc(251) Class99[] local251 = this.aClass15_8.anInterface1_1.method29582(this.aClass102_7, local118, (byte) 1);
									if (local251 != null) {
										@Pc(271) int local271 = Math.min(local251[local127].method18288(), this.aClass15_8.anInt46 * -191270971 + this.aClass15_8.anInt45 * 1190692343);
										local251[local127].method18226(local229 + arg1, local151 + (this.aClass15_8.anInt44 * -1978818351 + local7 + 3 - local271), 1, -1, 1);
										arg1 += local251[local127].method18214();
									}
									local11 = -1;
								} catch (@Pc(305) Exception local305) {
								}
							}
							continue;
						}
						local30 = '®';
					}
				}
				if (local9 == -1) {
					if (local11 != -1) {
						arg1 += this.aClass15_8.method368(local11, local30, -1651634825);
					}
					@Pc(332) int local332;
					if (arg5 == null) {
						local332 = 0;
					} else {
						local332 = arg5[local13];
					}
					if (arg6 == null) {
						local118 = 0;
					} else {
						local118 = arg6[local13];
					}
					local13++;
					if (local30 != ' ') {
						if ((anInt910 * -25197907 & 0xFF000000) != 0) {
							this.method7643(local30, local332 + arg1 + 1, local7 + 1 + local118, anInt910 * -25197907, true);
						}
						this.method7643(local30, arg1 + local332, local118 + local7, anInt908 * 1079177109, false);
					} else if (anInt911 * -1490254927 > 0) {
						anInt912 += anInt911 * 1411079879;
						arg1 += anInt912 * 1987080647 >> 8;
						anInt912 = (anInt912 * 1987080647 & 0xFF) * -2039742473;
					}
					local127 = this.aClass15_8.method369(local30, (short) -2345);
					if (anInt905 * 1978757391 != -1) {
						this.aClass102_7.method20893(arg1, local7 + (int) ((double) (this.aClass15_8.anInt44 * -1978818351) * 0.7D), local127, anInt905 * 1978757391, 380472713);
					}
					if (anInt906 * 309536787 != -1) {
						this.aClass102_7.method20893(arg1, this.aClass15_8.anInt44 * -1978818351 + local7, local127, anInt906 * 309536787, 1957062682);
					}
					arg1 += local127;
					local11 = local30;
				}
			}
		}
	}
}
