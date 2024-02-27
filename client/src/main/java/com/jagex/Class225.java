package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dj")
public final class Class225 implements Interface75 {

	@OriginalMember(owner = "client!dj", name = "t", descriptor = "Lclient!dj;")
	static final Class225 aClass225_5 = new Class225(0, 0);

	@OriginalMember(owner = "client!dj", name = "f", descriptor = "Lclient!dj;")
	static final Class225 aClass225_2 = new Class225(1, 1);

	@OriginalMember(owner = "client!dj", name = "e", descriptor = "Lclient!dj;")
	static final Class225 aClass225_3 = new Class225(2, 2);

	@OriginalMember(owner = "client!dj", name = "u", descriptor = "Lclient!dj;")
	static final Class225 aClass225_4 = new Class225(3, 3);

	@OriginalMember(owner = "client!dj", name = "l", descriptor = "Lclient!dj;")
	static final Class225 aClass225_1 = new Class225(4, 4);

	@OriginalMember(owner = "client!dj", name = "g", descriptor = "I")
	final int anInt3623;

	@OriginalMember(owner = "client!dj", name = "i", descriptor = "I")
	final int anInt3622;

	@OriginalMember(owner = "client!dj", name = "o", descriptor = "(I)Lclient!dj;")
	static Class225 method25951(@OriginalArg(0) int arg0) {
		@Pc(6) Class225 local6 = (Class225) Class80_Sub39.method15030(Class331.method27784(1280255261), arg0, -1647126571);
		if (local6 == null) {
			local6 = aClass225_5;
		}
		return local6;
	}

	@OriginalMember(owner = "client!dj", name = "m", descriptor = "(I)Lclient!dj;")
	static Class225 method25952(@OriginalArg(0) int arg0) {
		@Pc(6) Class225 local6 = (Class225) Class80_Sub39.method15030(Class331.method27784(684682359), arg0, -1928022583);
		if (local6 == null) {
			local6 = aClass225_5;
		}
		return local6;
	}

	@OriginalMember(owner = "client!dj", name = "l", descriptor = "()[Lclient!dj;")
	static Class225[] method25953() {
		return new Class225[] { aClass225_5, aClass225_2, aClass225_3, aClass225_4, aClass225_1 };
	}

	@OriginalMember(owner = "client!dj", name = "j", descriptor = "(I)Lclient!dj;")
	static Class225 method25954(@OriginalArg(0) int arg0) {
		@Pc(6) Class225 local6 = (Class225) Class80_Sub39.method15030(Class331.method27784(2105748060), arg0, -1888040111);
		if (local6 == null) {
			local6 = aClass225_5;
		}
		return local6;
	}

	@OriginalMember(owner = "client!dj", name = "u", descriptor = "()[Lclient!dj;")
	static Class225[] method25955() {
		return new Class225[] { aClass225_5, aClass225_2, aClass225_3, aClass225_4, aClass225_1 };
	}

	@OriginalMember(owner = "client!dj", name = "ayi", descriptor = "(Lclient!yp;B)V")
	static void method25956(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(1) boolean local1 = false;
		if (client.aBoolean705) {
			try {
				@Pc(43) Object local43 = Class442.aClass442_5.method29203(new Object[] { Class595.anInt5356 * -1459733811, Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte74 == 1, arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581] }, (byte) 35);
				if (local43 != null) {
					local1 = (Boolean) local43;
				}
			} catch (@Pc(51) Throwable local51) {
			}
		}
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local1 ? 1 : 0;
	}

	@OriginalMember(owner = "client!dj", name = "bae", descriptor = "(Lclient!yp;S)V")
	static void method25957(@OriginalArg(0) Class690 arg0, @OriginalArg(1) short arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
	}

	@OriginalMember(owner = "client!dj", name = "ajb", descriptor = "(Lclient!yp;B)V")
	static void method25958(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class290.anInt3947 * 1225644585;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class278.anInt3927 * -871755821;
	}

	@OriginalMember(owner = "client!dj", name = "sb", descriptor = "(Lclient!yp;B)V")
	static void method25959(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local11.anInt4166 * -1038533243;
	}

	@OriginalMember(owner = "client!dj", name = "bbt", descriptor = "(Lclient!yp;I)V")
	static void method25960(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		Class697.method37055(arg0.aClass120_Sub1_Sub1_Sub1_4, arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581], true, -448092962);
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = (int) client.aFloatArray95[0];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = (int) client.aFloatArray95[1];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = (int) client.aFloatArray95[2];
	}

	@OriginalMember(owner = "client!dj", name = "al", descriptor = "(IZI)V")
	static void method25961(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(23, (long) arg0);
		local4.method22135(-457826299);
		local4.anInt3064 = (arg1 ? 1 : 0) * -1221031713;
	}

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(II)V")
	Class225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3623 = arg0 * -882950597;
		this.anInt3622 = arg1 * 2040071963;
	}

	@OriginalMember(owner = "client!dj", name = "i", descriptor = "()I")
	@Override
	public int method37269() {
		return this.anInt3622 * 1758984979;
	}

	@OriginalMember(owner = "client!dj", name = "f", descriptor = "()I")
	@Override
	public int getId() {
		return this.anInt3622 * 1758984979;
	}

	@OriginalMember(owner = "client!dj", name = "g", descriptor = "()I")
	@Override
	public int method37267() {
		return this.anInt3622 * 1758984979;
	}
}
