package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!er")
public class Class250 {

	@OriginalMember(owner = "client!er", name = "e", descriptor = "I")
	static final int anInt3844 = 0;

	@OriginalMember(owner = "client!er", name = "n", descriptor = "I")
	static final int anInt3845 = 2;

	@OriginalMember(owner = "client!er", name = "m", descriptor = "[I")
	final int[] anIntArray355;

	@OriginalMember(owner = "client!er", name = "k", descriptor = "[I")
	final int[] anIntArray356;

	@OriginalMember(owner = "client!er", name = "e", descriptor = "(Lclient!yu;Lclient!ze;II)I", line = 11)
	public static int method25947(@OriginalArg(0) Class693 arg0, @OriginalArg(1) Class703 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return Class693.aClass693_8 == arg0 ? 43594 : arg2 + 40000;
	}

	@OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Lclient!alw;)V", line = 13)
	Class250(@OriginalArg(0) Packet arg0) {
		@Pc(5) int local5 = arg0.gSmart1or2((byte) -55);
		this.anIntArray355 = new int[local5];
		this.anIntArray356 = new int[local5];
		for (@Pc(15) int local15 = 0; local15 < local5; local15++) {
			@Pc(22) int local22 = arg0.g1((short) 16384);
			this.anIntArray355[local15] = local22;
			@Pc(31) int local31 = arg0.g2(-1434290800);
			@Pc(35) int local35 = arg0.g2(-1434290800);
			this.anIntArray356[local15] = (local31 << 16) + local35;
		}
	}

	@OriginalMember(owner = "client!er", name = "m", descriptor = "(Lclient!ea;I)V", line = 27)
	void method25948(@OriginalArg(0) Class239 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = this.anIntArray356[0];
		arg0.method25808(arg1, local4 >>> 16, local4 & 0xFFFF, -1020254641);
		@Pc(18) Class132_Sub1_Sub1_Sub1 local18 = arg0.method25813(1254220821);
		local18.anInt2763 = 0;
		for (@Pc(27) int local27 = this.anIntArray355.length - 1; local27 >= 0; local27--) {
			@Pc(34) int local34 = this.anIntArray355[local27];
			@Pc(39) int local39 = this.anIntArray356[local27];
			local18.anIntArray240[local18.anInt2763 * -846948133] = local39 >> 16;
			local18.anIntArray239[local18.anInt2763 * -846948133] = local39 & 0xFFFF;
			@Pc(62) byte local62 = Class707.aClass707_2.aByte176;
			if (local34 == 0) {
				local62 = Class707.aClass707_1.aByte176;
			} else if (local34 == 2) {
				local62 = Class707.aClass707_3.aByte176;
			}
			local18.aByteArray47[local18.anInt2763 * -846948133] = local62;
			local18.anInt2763 += 1975362387;
		}
	}

	@OriginalMember(owner = "client!er", name = "n", descriptor = "(Lclient!ea;I)V", line = 27)
	void method25949(@OriginalArg(0) Class239 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = this.anIntArray356[0];
		arg0.method25808(arg1, local4 >>> 16, local4 & 0xFFFF, 349463304);
		@Pc(18) Class132_Sub1_Sub1_Sub1 local18 = arg0.method25813(1919822049);
		local18.anInt2763 = 0;
		for (@Pc(27) int local27 = this.anIntArray355.length - 1; local27 >= 0; local27--) {
			@Pc(34) int local34 = this.anIntArray355[local27];
			@Pc(39) int local39 = this.anIntArray356[local27];
			local18.anIntArray240[local18.anInt2763 * -846948133] = local39 >> 16;
			local18.anIntArray239[local18.anInt2763 * -846948133] = local39 & 0xFFFF;
			@Pc(62) byte local62 = Class707.aClass707_2.aByte176;
			if (local34 == 0) {
				local62 = Class707.aClass707_1.aByte176;
			} else if (local34 == 2) {
				local62 = Class707.aClass707_3.aByte176;
			}
			local18.aByteArray47[local18.anInt2763 * -846948133] = local62;
			local18.anInt2763 += 1975362387;
		}
	}

	@OriginalMember(owner = "client!er", name = "k", descriptor = "(Lclient!ea;I)V", line = 27)
	void method25950(@OriginalArg(0) Class239 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = this.anIntArray356[0];
		arg0.method25808(arg1, local4 >>> 16, local4 & 0xFFFF, -939862014);
		@Pc(18) Class132_Sub1_Sub1_Sub1 local18 = arg0.method25813(-1290844368);
		local18.anInt2763 = 0;
		for (@Pc(27) int local27 = this.anIntArray355.length - 1; local27 >= 0; local27--) {
			@Pc(34) int local34 = this.anIntArray355[local27];
			@Pc(39) int local39 = this.anIntArray356[local27];
			local18.anIntArray240[local18.anInt2763 * -846948133] = local39 >> 16;
			local18.anIntArray239[local18.anInt2763 * -846948133] = local39 & 0xFFFF;
			@Pc(62) byte local62 = Class707.aClass707_2.aByte176;
			if (local34 == 0) {
				local62 = Class707.aClass707_1.aByte176;
			} else if (local34 == 2) {
				local62 = Class707.aClass707_3.aByte176;
			}
			local18.aByteArray47[local18.anInt2763 * -846948133] = local62;
			local18.anInt2763 += 1975362387;
		}
	}

	@OriginalMember(owner = "client!er", name = "e", descriptor = "(Lclient!ea;II)V", line = 27)
	void method25951(@OriginalArg(0) Class239 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = this.anIntArray356[0];
		arg0.method25808(arg1, local4 >>> 16, local4 & 0xFFFF, 1307858294);
		@Pc(18) Class132_Sub1_Sub1_Sub1 local18 = arg0.method25813(-582845844);
		local18.anInt2763 = 0;
		for (@Pc(27) int local27 = this.anIntArray355.length - 1; local27 >= 0; local27--) {
			@Pc(34) int local34 = this.anIntArray355[local27];
			@Pc(39) int local39 = this.anIntArray356[local27];
			local18.anIntArray240[local18.anInt2763 * -846948133] = local39 >> 16;
			local18.anIntArray239[local18.anInt2763 * -846948133] = local39 & 0xFFFF;
			@Pc(62) byte local62 = Class707.aClass707_2.aByte176;
			if (local34 == 0) {
				local62 = Class707.aClass707_1.aByte176;
			} else if (local34 == 2) {
				local62 = Class707.aClass707_3.aByte176;
			}
			local18.aByteArray47[local18.anInt2763 * -846948133] = local62;
			local18.anInt2763 += 1975362387;
		}
	}

	@OriginalMember(owner = "client!er", name = "au", descriptor = "(Lclient!yf;I)V", line = 4951)
	static final void method25952(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = arg0.anObjectArray44[arg0.anIntArray520[arg0.anInt5889 * -709694321]];
	}

	@OriginalMember(owner = "client!er", name = "cv", descriptor = "(Lclient!yf;I)V", line = 5343)
	static final void method25953(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, 1563000145);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class542.method30936(local16, local22, arg0, 1189701933);
	}

	@OriginalMember(owner = "client!er", name = "ajs", descriptor = "(Lclient!yf;B)V", line = 11410)
	static final void method25954(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		if (Class112_Sub2_Sub2.aClass158_2.method14313(82, 1406458180)) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 1;
		} else {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
		}
	}

	@OriginalMember(owner = "client!er", name = "aro", descriptor = "(Lclient!yf;B)V", line = 12922)
	static final void method25955(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = client.anInt3431 * 1723909759;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = client.anInt3430 * 1191340313;
	}

	@OriginalMember(owner = "client!er", name = "awq", descriptor = "(Lclient!yf;B)V", line = 13761)
	static final void method25956(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		if (Class166_Sub1.aClass320Array1[local12] == null) {
			arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = "";
			return;
		}
		@Pc(40) String local40 = Class166_Sub1.aClass320Array1[local12].aClass312Array3[0].aString162;
		if (local40 == null) {
			arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = "";
		} else {
			arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = local40.substring(0, local40.indexOf(58));
		}
	}
}
