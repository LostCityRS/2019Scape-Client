package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!zs")
public final class Class716 implements Interface75 {

	@OriginalMember(owner = "client!zs", name = "ei", descriptor = "Lclient!ug;")
	static Class160 aClass160_4;

	@OriginalMember(owner = "client!zs", name = "t", descriptor = "Lclient!zs;")
	public static final Class716 aClass716_9 = new Class716(4, 0);

	@OriginalMember(owner = "client!zs", name = "f", descriptor = "Lclient!zs;")
	public static final Class716 aClass716_3 = new Class716(7, 1);

	@OriginalMember(owner = "client!zs", name = "e", descriptor = "Lclient!zs;")
	public static final Class716 aClass716_5 = new Class716(1, 2);

	@OriginalMember(owner = "client!zs", name = "u", descriptor = "Lclient!zs;")
	public static final Class716 aClass716_2 = new Class716(3, 3);

	@OriginalMember(owner = "client!zs", name = "l", descriptor = "Lclient!zs;")
	public static final Class716 aClass716_8 = new Class716(5, 4);

	@OriginalMember(owner = "client!zs", name = "g", descriptor = "Lclient!zs;")
	public static final Class716 aClass716_6 = new Class716(6, 5);

	@OriginalMember(owner = "client!zs", name = "i", descriptor = "Lclient!zs;")
	public static final Class716 aClass716_7 = new Class716(0, 6);

	@OriginalMember(owner = "client!zs", name = "m", descriptor = "Lclient!zs;")
	public static final Class716 aClass716_4 = new Class716(2, 7);

	@OriginalMember(owner = "client!zs", name = "o", descriptor = "I")
	public final int anInt5825;

	@OriginalMember(owner = "client!zs", name = "j", descriptor = "I")
	final int anInt5826;

	@OriginalMember(owner = "client!zs", name = "u", descriptor = "()[Lclient!zs;")
	public static Class716[] method37223() {
		return new Class716[] { aClass716_2, aClass716_4, aClass716_7, aClass716_3, aClass716_8, aClass716_5, aClass716_9, aClass716_6 };
	}

	@OriginalMember(owner = "client!zs", name = "l", descriptor = "()[Lclient!zs;")
	public static Class716[] method37224() {
		return new Class716[] { aClass716_2, aClass716_4, aClass716_7, aClass716_3, aClass716_8, aClass716_5, aClass716_9, aClass716_6 };
	}

	@OriginalMember(owner = "client!zs", name = "m", descriptor = "()[Lclient!zs;")
	public static Class716[] method37225() {
		return new Class716[] { aClass716_2, aClass716_4, aClass716_7, aClass716_3, aClass716_8, aClass716_5, aClass716_9, aClass716_6 };
	}

	@OriginalMember(owner = "client!zs", name = "acq", descriptor = "(Lclient!yp;I)V")
	static void method37227(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class134.aClass305_1.method27138(-637071631);
	}

	@OriginalMember(owner = "client!zs", name = "asl", descriptor = "(Lclient!yp;I)V")
	static void method37228(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub13_1, arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581] == 1 ? 2 : 0, (byte) 119);
		client.aClass539_1.method30938(846841870);
		Class719.method37291(-903073328);
		client.aBoolean714 = false;
	}

	@OriginalMember(owner = "client!zs", name = "l", descriptor = "(IIILclient!vv;S)V")
	public static void method37229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class625 arg3, @OriginalArg(4) short arg4) {
		for (@Pc(4) Class80_Sub21 local4 = (Class80_Sub21) Class80_Sub21.aClass8_22.method247(129206984); local4 != null; local4 = (Class80_Sub21) Class80_Sub21.aClass8_22.method237(9557533)) {
			if (arg0 == local4.anInt1591 * -1499016133 && arg1 << 9 == local4.anInt1602 * 1377576325 && arg2 << 9 == local4.anInt1599 * 1363501641 && arg3.anInt5499 * 324896623 == local4.aClass625_1.anInt5499 * 324896623) {
				if (local4.aClass529_3 != null) {
					local4.aClass529_3.method30788(100, 1706151307);
					Class490.aClass263_13.method26582(local4.aClass529_3, (byte) 62);
					local4.aClass529_3 = null;
				}
				local4.method24395((byte) 83);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!zs", name = "awx", descriptor = "(Lclient!yp;B)V")
	static void method37230(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = client.aClass24_20.method572(-2100525087);
		if (client.anInt3460 * 1849344509 != -1) {
			local3++;
		}
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local3;
	}

	@OriginalMember(owner = "client!zs", name = "aon", descriptor = "(Lclient!yp;B)V")
	static void method37231(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) throws Exception_Sub3 {
		Class160.aClass121_Sub1_2.method9680((float) arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581] / 1000.0F, (byte) 29);
	}

	@OriginalMember(owner = "client!zs", name = "<init>", descriptor = "(II)V")
	Class716(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5825 = arg0 * 1055572019;
		this.anInt5826 = arg1 * -420631367;
	}

	@OriginalMember(owner = "client!zs", name = "f", descriptor = "()I")
	@Override
	public int method37268() {
		return this.anInt5826 * 288659849;
	}

	@OriginalMember(owner = "client!zs", name = "e", descriptor = "(I)Lclient!zs;")
	public Class716 method37222(@OriginalArg(0) int arg0) {
		switch(this.anInt5825 * 1821260539) {
			case 0:
				return aClass716_5;
			case 1:
				return aClass716_7;
			case 2:
				return aClass716_2;
			case 3:
				return aClass716_4;
			case 4:
				return aClass716_8;
			case 5:
				return aClass716_9;
			case 6:
				return aClass716_3;
			case 7:
				return aClass716_6;
			default:
				throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!zs", name = "i", descriptor = "()I")
	@Override
	public int method37269() {
		return this.anInt5826 * 288659849;
	}

	@OriginalMember(owner = "client!zs", name = "g", descriptor = "()I")
	@Override
	public int method37267() {
		return this.anInt5826 * 288659849;
	}

	@OriginalMember(owner = "client!zs", name = "o", descriptor = "()Lclient!zs;")
	public Class716 method37226() {
		switch(this.anInt5825 * 1821260539) {
			case 0:
				return aClass716_5;
			case 1:
				return aClass716_7;
			case 2:
				return aClass716_2;
			case 3:
				return aClass716_4;
			case 4:
				return aClass716_8;
			case 5:
				return aClass716_9;
			case 6:
				return aClass716_3;
			case 7:
				return aClass716_6;
			default:
				throw new IllegalStateException();
		}
	}
}
