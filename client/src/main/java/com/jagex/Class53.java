package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

@OriginalClass("client!acb")
public final class Class53 {

	@OriginalMember(owner = "client!acb", name = "f", descriptor = "I")
	public static int anInt199;

	@OriginalMember(owner = "client!acb", name = "l", descriptor = "[I")
	public static int[] anIntArray23;

	@OriginalMember(owner = "client!acb", name = "e", descriptor = "I")
	static int anInt200;

	@OriginalMember(owner = "client!acb", name = "u", descriptor = "[I")
	public static int[] anIntArray24;

	@OriginalMember(owner = "client!acb", name = "t", descriptor = "I")
	static final int anInt201 = 12;

	@OriginalMember(owner = "client!acb", name = "g", descriptor = "Lclient!qh;")
	static Class506 aClass506_1 = new Class506(16, Class509.aClass509_2);

	@OriginalMember(owner = "client!acb", name = "g", descriptor = "(II)V")
	public static void method1075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9;
		if (arg0 != anInt199 * -249890311) {
			anIntArray24 = new int[arg0];
			for (local9 = 0; local9 < arg0; local9++) {
				anIntArray24[local9] = (local9 << 12) / arg0;
			}
			anInt199 = arg0 * -474843063;
		}
		if (anInt200 * -1674507627 == arg1) {
			return;
		}
		if (arg1 == anInt199 * -249890311) {
			anIntArray23 = anIntArray24;
		} else {
			anIntArray23 = new int[arg1];
			for (local9 = 0; local9 < arg1; local9++) {
				anIntArray23[local9] = (local9 << 12) / arg1;
			}
		}
		anInt200 = arg1 * 235040957;
	}

	@OriginalMember(owner = "client!acb", name = "f", descriptor = "(II)[B")
	public static byte[] method1076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) byte[] local7 = (byte[]) aClass506_1.method30474(arg0, (byte) 0);
		if (local7 == null) {
			local7 = new byte[512];
			@Pc(18) Random local18 = new Random((long) arg0);
			@Pc(20) int local20;
			for (local20 = 0; local20 < 255; local20++) {
				local7[local20] = (byte) local20;
			}
			for (local20 = 0; local20 < 255; local20++) {
				@Pc(39) int local39 = 255 - local20;
				@Pc(44) int local44 = Class169.method21690(local18, local39, -787895169);
				@Pc(48) byte local48 = local7[local44];
				local7[local44] = local7[local39];
				local7[local39] = local7[511 - local20] = local48;
			}
			aClass506_1.method30472(arg0, local7, 1562366700);
		}
		return local7;
	}

	@OriginalMember(owner = "client!acb", name = "bp", descriptor = "(Lclient!yp;I)V")
	static void method1077(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2005871525);
		Class675.method33585(local16, arg0, -644820301);
	}

	@OriginalMember(owner = "client!acb", name = "e", descriptor = "(II)V")
	public static void method1078(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9;
		if (arg0 != anInt199 * -249890311) {
			anIntArray24 = new int[arg0];
			for (local9 = 0; local9 < arg0; local9++) {
				anIntArray24[local9] = (local9 << 12) / arg0;
			}
			anInt199 = arg0 * -474843063;
		}
		if (anInt200 * -1674507627 == arg1) {
			return;
		}
		if (arg1 == anInt199 * -249890311) {
			anIntArray23 = anIntArray24;
		} else {
			anIntArray23 = new int[arg1];
			for (local9 = 0; local9 < arg1; local9++) {
				anIntArray23[local9] = (local9 << 12) / arg1;
			}
		}
		anInt200 = arg1 * 235040957;
	}

	@OriginalMember(owner = "client!acb", name = "u", descriptor = "(II)V")
	public static void method1079(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9;
		if (arg0 != anInt199 * -249890311) {
			anIntArray24 = new int[arg0];
			for (local9 = 0; local9 < arg0; local9++) {
				anIntArray24[local9] = (local9 << 12) / arg0;
			}
			anInt199 = arg0 * -474843063;
		}
		if (anInt200 * -1674507627 == arg1) {
			return;
		}
		if (arg1 == anInt199 * -249890311) {
			anIntArray23 = anIntArray24;
		} else {
			anIntArray23 = new int[arg1];
			for (local9 = 0; local9 < arg1; local9++) {
				anIntArray23[local9] = (local9 << 12) / arg1;
			}
		}
		anInt200 = arg1 * 235040957;
	}

	@OriginalMember(owner = "client!acb", name = "l", descriptor = "(II)V")
	public static void method1080(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9;
		if (arg0 != anInt199 * -249890311) {
			anIntArray24 = new int[arg0];
			for (local9 = 0; local9 < arg0; local9++) {
				anIntArray24[local9] = (local9 << 12) / arg0;
			}
			anInt199 = arg0 * -474843063;
		}
		if (anInt200 * -1674507627 == arg1) {
			return;
		}
		if (arg1 == anInt199 * -249890311) {
			anIntArray23 = anIntArray24;
		} else {
			anIntArray23 = new int[arg1];
			for (local9 = 0; local9 < arg1; local9++) {
				anIntArray23[local9] = (local9 << 12) / arg1;
			}
		}
		anInt200 = arg1 * 235040957;
	}

	@OriginalMember(owner = "client!acb", name = "t", descriptor = "(III)V")
	public static void method1081(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9;
		if (arg0 != anInt199 * -249890311) {
			anIntArray24 = new int[arg0];
			for (local9 = 0; local9 < arg0; local9++) {
				anIntArray24[local9] = (local9 << 12) / arg0;
			}
			anInt199 = arg0 * -474843063;
		}
		if (anInt200 * -1674507627 == arg1) {
			return;
		}
		if (arg1 == anInt199 * -249890311) {
			anIntArray23 = anIntArray24;
		} else {
			anIntArray23 = new int[arg1];
			for (local9 = 0; local9 < arg1; local9++) {
				anIntArray23[local9] = (local9 << 12) / arg1;
			}
		}
		anInt200 = arg1 * 235040957;
	}

	@OriginalMember(owner = "client!acb", name = "i", descriptor = "(II)V")
	public static void method1082(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9;
		if (arg0 != anInt199 * -249890311) {
			anIntArray24 = new int[arg0];
			for (local9 = 0; local9 < arg0; local9++) {
				anIntArray24[local9] = (local9 << 12) / arg0;
			}
			anInt199 = arg0 * -474843063;
		}
		if (anInt200 * -1674507627 == arg1) {
			return;
		}
		if (arg1 == anInt199 * -249890311) {
			anIntArray23 = anIntArray24;
		} else {
			anIntArray23 = new int[arg1];
			for (local9 = 0; local9 < arg1; local9++) {
				anIntArray23[local9] = (local9 << 12) / arg1;
			}
		}
		anInt200 = arg1 * 235040957;
	}

	@OriginalMember(owner = "client!acb", name = "aae", descriptor = "(Lclient!yp;I)V")
	static void method1083(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		if (client.aString148 == null || local12 >= Class274.anInt3924 * -912877411) {
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = "";
		} else {
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = Class14.aClass164Array1[local12].aString66;
		}
	}

	@OriginalMember(owner = "client!acb", name = "o", descriptor = "(I)[B")
	public static byte[] method1084(@OriginalArg(0) int arg0) {
		@Pc(7) byte[] local7 = (byte[]) aClass506_1.method30474(arg0, (byte) 0);
		if (local7 == null) {
			local7 = new byte[512];
			@Pc(18) Random local18 = new Random((long) arg0);
			@Pc(20) int local20;
			for (local20 = 0; local20 < 255; local20++) {
				local7[local20] = (byte) local20;
			}
			for (local20 = 0; local20 < 255; local20++) {
				@Pc(39) int local39 = 255 - local20;
				@Pc(44) int local44 = Class169.method21690(local18, local39, -787895169);
				@Pc(48) byte local48 = local7[local44];
				local7[local44] = local7[local39];
				local7[local39] = local7[511 - local20] = local48;
			}
			aClass506_1.method30472(arg0, local7, 1562366700);
		}
		return local7;
	}

	@OriginalMember(owner = "client!acb", name = "j", descriptor = "(I)[B")
	public static byte[] method1085(@OriginalArg(0) int arg0) {
		@Pc(7) byte[] local7 = (byte[]) aClass506_1.method30474(arg0, (byte) 0);
		if (local7 == null) {
			local7 = new byte[512];
			@Pc(18) Random local18 = new Random((long) arg0);
			@Pc(20) int local20;
			for (local20 = 0; local20 < 255; local20++) {
				local7[local20] = (byte) local20;
			}
			for (local20 = 0; local20 < 255; local20++) {
				@Pc(39) int local39 = 255 - local20;
				@Pc(44) int local44 = Class169.method21690(local18, local39, -787895169);
				@Pc(48) byte local48 = local7[local44];
				local7[local44] = local7[local39];
				local7[local39] = local7[511 - local20] = local48;
			}
			aClass506_1.method30472(arg0, local7, 1562366700);
		}
		return local7;
	}

	@OriginalMember(owner = "client!acb", name = "m", descriptor = "(I)[B")
	public static byte[] method1086(@OriginalArg(0) int arg0) {
		@Pc(7) byte[] local7 = (byte[]) aClass506_1.method30474(arg0, (byte) 0);
		if (local7 == null) {
			local7 = new byte[512];
			@Pc(18) Random local18 = new Random((long) arg0);
			@Pc(20) int local20;
			for (local20 = 0; local20 < 255; local20++) {
				local7[local20] = (byte) local20;
			}
			for (local20 = 0; local20 < 255; local20++) {
				@Pc(39) int local39 = 255 - local20;
				@Pc(44) int local44 = Class169.method21690(local18, local39, -787895169);
				@Pc(48) byte local48 = local7[local44];
				local7[local44] = local7[local39];
				local7[local39] = local7[511 - local20] = local48;
			}
			aClass506_1.method30472(arg0, local7, 1562366700);
		}
		return local7;
	}

	@OriginalMember(owner = "client!acb", name = "e", descriptor = "(Lclient!ec;FFFI)F")
	static float method1087(@OriginalArg(0) Class240 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4) {
		@Pc(9) float local9 = Class2.method1812(arg0.aFloatArray102, arg0.anInt3857 * 386091875, arg1, 899533227);
		if (Math.abs(local9) < Class223.aFloat259) {
			return arg1;
		}
		@Pc(26) float local26 = Class2.method1812(arg0.aFloatArray102, arg0.anInt3857 * 386091875, arg2, -749376314);
		if (Math.abs(local26) < Class223.aFloat259) {
			return arg2;
		}
		@Pc(35) float local35 = 0.0F;
		@Pc(37) float local37 = 0.0F;
		@Pc(39) float local39 = 0.0F;
		@Pc(41) float local41 = 0.0F;
		@Pc(43) boolean local43 = true;
		@Pc(45) boolean local45 = false;
		do {
			local45 = false;
			if (local43) {
				local35 = arg1;
				local41 = local9;
				local37 = arg2 - arg1;
				local39 = local37;
				local43 = false;
			}
			if (Math.abs(local41) < Math.abs(local26)) {
				arg1 = arg2;
				arg2 = local35;
				local35 = arg1;
				local9 = local26;
				local26 = local41;
				local41 = local9;
			}
			@Pc(88) float local88 = Class223.aFloat262 * Math.abs(arg2) + arg3 * 0.5F;
			@Pc(94) float local94 = (local35 - arg2) * 0.5F;
			@Pc(107) boolean local107 = Math.abs(local94) > local88 && local26 != 0.0F;
			if (local107) {
				if (Math.abs(local39) < local88 || Math.abs(local9) <= Math.abs(local26)) {
					local37 = local94;
					local39 = local94;
				} else {
					@Pc(129) float local129 = local26 / local9;
					@Pc(139) float local139;
					@Pc(143) float local143;
					if (arg1 == local35) {
						local139 = local94 * 2.0F * local129;
						local143 = 1.0F - local129;
					} else {
						local143 = local9 / local41;
						@Pc(152) float local152 = local26 / local41;
						local139 = ((local143 - local152) * local143 * local94 * 2.0F - (arg2 - arg1) * (local152 - 1.0F)) * local129;
						local143 = (local129 - 1.0F) * (local152 - 1.0F) * (local143 - 1.0F);
					}
					if ((double) local139 > 0.0D) {
						local143 = -local143;
					} else {
						local139 = -local139;
					}
					local129 = local39;
					local39 = local37;
					if (local139 * 2.0F < local143 * local94 * 3.0F - Math.abs(local88 * local143) && local139 < Math.abs(local143 * 0.5F * local129)) {
						local37 = local139 / local143;
					} else {
						local37 = local94;
						local39 = local94;
					}
				}
				arg1 = arg2;
				local9 = local26;
				if (Math.abs(local37) > local88) {
					arg2 += local37;
				} else if ((double) local94 > 0.0D) {
					arg2 += local88;
				} else {
					arg2 -= local88;
				}
				local26 = Class2.method1812(arg0.aFloatArray102, arg0.anInt3857 * 386091875, arg2, 2055143532);
				if ((double) (local26 * (local41 / Math.abs(local41))) > 0.0D) {
					local43 = true;
					local45 = true;
				} else {
					local45 = true;
				}
			}
		} while (local45);
		return arg2;
	}

	@OriginalMember(owner = "client!acb", name = "adc", descriptor = "(Lclient!yp;B)V")
	static void method1088(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[arg0.anInt5778 * 1896589581 - 1] = arg0.aClass80_Sub32_4.method14431(-1762703588)[arg0.anIntArray525[arg0.anInt5778 * 1896589581 - 1]];
	}

	@OriginalMember(owner = "client!acb", name = "mb", descriptor = "(Ljava/lang/String;ZI)I")
	public static int method1089(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(2) String local2 = arg0.toLowerCase();
		Js5MasterIndex.anIntArray466 = null;
		Class679.anInt5743 = 0;
		@Pc(10) LinkedList local10 = new LinkedList();
		@Pc(14) LinkedList local14 = new LinkedList();
		@Pc(16) int local16;
		for (local16 = 0; local16 < Class25.aClass41_Sub9_1.anInt2476 * 462823477; local16++) {
			@Pc(28) Class43 local28 = (Class43) Class25.aClass41_Sub9_1.method18054(local16, -1771554475);
			if ((!arg1 || local28.aBoolean27) && local28.anInt155 * 1882600249 == -1 && -1136915479 * local28.anInt128 == -1 && local28.anInt170 * -1639247307 == -1 && local28.anInt167 * -772359703 == 0 && local28.aString5.toLowerCase().indexOf(local2) != -1) {
				if (local10.size() >= 250) {
					return -1;
				}
				local10.add(local16);
				local14.add(local28.aString5);
			}
		}
		Js5MasterIndex.anIntArray466 = new int[local10.size()];
		local16 = 0;
		@Pc(93) Iterator local93 = local10.iterator();
		while (local93.hasNext()) {
			@Pc(100) Integer local100 = (Integer) local93.next();
			Js5MasterIndex.anIntArray466[local16++] = local100;
		}
		@Pc(115) String[] local115 = (String[]) local14.toArray(new String[Js5MasterIndex.anIntArray466.length]);
		Class602.method32125(local115, Js5MasterIndex.anIntArray466, -447506242);
		return local10.size();
	}

	@OriginalMember(owner = "client!acb", name = "l", descriptor = "(B)V")
	static void method1090(@OriginalArg(0) byte arg0) {
		@Pc(4) Class80_Sub8 local4;
		for (local4 = (Class80_Sub8) Class80_Sub8.aClass8_19.method247(129206984); local4 != null; local4 = (Class80_Sub8) Class80_Sub8.aClass8_19.method237(-2114120984)) {
			Class676.method33589(local4, false, 1395692716);
		}
		for (local4 = (Class80_Sub8) Class80_Sub8.aClass8_20.method247(129206984); local4 != null; local4 = (Class80_Sub8) Class80_Sub8.aClass8_20.method237(-1890005031)) {
			Class676.method33589(local4, true, 1053891354);
		}
	}

	@OriginalMember(owner = "client!acb", name = "qe", descriptor = "(Lclient!yp;B)V")
	static void method1091(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2057171405);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class665.method33452(local16, local22, arg0, -677873973);
	}

	@OriginalMember(owner = "client!acb", name = "<init>", descriptor = "()V")
	Class53() throws Throwable {
		throw new Error();
	}
}
