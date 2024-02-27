package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class608 implements Interface75 {

	@OriginalMember(owner = "client!vb", name = "t", descriptor = "Lclient!vb;")
	public static final Class608 aClass608_5 = new Class608(0);

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "Lclient!vb;")
	public static final Class608 aClass608_3 = new Class608(1);

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "Lclient!vb;")
	public static final Class608 aClass608_4 = new Class608(2);

	@OriginalMember(owner = "client!vb", name = "u", descriptor = "I")
	final int anInt5398;

	@OriginalMember(owner = "client!vb", name = "abk", descriptor = "(Lclient!yp;I)V")
	static void method32186(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray46[(arg0.anInt5776 -= -825189621) * -2070619997];
		Class103_Sub7.method7849(local13, true, 530071467);
	}

	@OriginalMember(owner = "client!vb", name = "pr", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;I)V")
	static void method32187(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) int arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray46[(arg2.anInt5776 -= -825189621) * -2070619997];
		if (Class619.method32302(local13, arg2, -1753408640) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray38 = Class431.method29089(local13, arg2, 1581626777);
		arg0.aBoolean815 = true;
	}

	@OriginalMember(owner = "client!vb", name = "h", descriptor = "(II)V")
	public static void method32188(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Class678.anInt5742 = arg0 * -1621203235;
		Class327.aClass243_78.method26256(1693912082);
	}

	@OriginalMember(owner = "client!vb", name = "ar", descriptor = "(IZI)V")
	static void method32189(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(22, (long) arg0);
		local4.method22135(-457826299);
		local4.anInt3064 = (arg1 ? 1 : 0) * -1221031713;
	}

	@OriginalMember(owner = "client!vb", name = "azc", descriptor = "(Lclient!yp;I)V")
	static void method32190(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class703.aClass80_Sub37_49.aClass165_Sub15_1.method16122((byte) -1) ? 1 : 0;
	}

	@OriginalMember(owner = "client!vb", name = "ol", descriptor = "(Lclient!yp;I)V")
	static void method32191(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class80_Sub1_Sub1.anInt254 * -255202897;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class80_Sub25.anInt1627 * 167687103;
	}

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(I)V")
	Class608(@OriginalArg(0) int arg0) {
		this.anInt5398 = arg0 * -1771392329;
	}

	@OriginalMember(owner = "client!vb", name = "g", descriptor = "()I")
	@Override
	public int method37267() {
		return this.anInt5398 * 2106772231;
	}

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "()I")
	@Override
	public int getId() {
		return this.anInt5398 * 2106772231;
	}

	@OriginalMember(owner = "client!vb", name = "i", descriptor = "()I")
	@Override
	public int method37269() {
		return this.anInt5398 * 2106772231;
	}
}
