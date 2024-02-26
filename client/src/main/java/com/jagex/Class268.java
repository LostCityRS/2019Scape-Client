package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
final class Class268 implements Interface70 {

	@OriginalMember(owner = "client!fl", name = "ln", descriptor = "I")
	public static int anInt3917;

	// $FF: synthetic field
	@OriginalMember(owner = "client!fl", name = "this$0", descriptor = "Lclient!fg;")
	final Class263 aClass263_7;

	@OriginalMember(owner = "client!fl", name = "bcl", descriptor = "(Lclient!yp;I)V")
	static void method26680(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		Class697.method37055(arg0.aClass120_Sub1_Sub5_Sub1_1, arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581], true, -191057983);
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = (int) client.aFloatArray95[0];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = (int) client.aFloatArray95[1];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = (int) client.aFloatArray95[2];
	}

	@OriginalMember(owner = "client!fl", name = "yd", descriptor = "(Lclient!yp;B)V")
	static void method26681(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = client.anInt3531 * -1699536667;
	}

	@OriginalMember(owner = "client!fl", name = "t", descriptor = "(Lclient!adx;B)I")
	static int method26682(@OriginalArg(0) Class91 arg0, @OriginalArg(1) byte arg1) {
		if (arg0 == null) {
			return 12;
		} else {
			switch(arg0.anInt325 * 1902015615) {
				case 3:
					return 20;
				default:
					return 12;
			}
		}
	}

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(Lclient!fg;)V")
	Class268(@OriginalArg(0) Class263 arg0) {
		this.aClass263_7 = arg0;
	}

	@OriginalMember(owner = "client!fl", name = "t", descriptor = "(Lclient!wc;IIZB)V")
	@Override
	public void method26676(@OriginalArg(0) Interface68 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte arg4) {
		this.aClass263_7.method26513((byte) 107).add(arg0);
		if (arg3) {
			this.aClass263_7.method26515(1980399352).method26253(arg0, (long) arg2);
		} else {
			this.aClass263_7.method26618(1570542061).method26254(arg0, (long) arg2, arg0.method32970((byte) 100), (byte) -18);
		}
	}

	@OriginalMember(owner = "client!fl", name = "f", descriptor = "(Lclient!wc;I)V")
	@Override
	public void method26675(@OriginalArg(0) Interface68 arg0, @OriginalArg(1) int arg1) {
		if (arg0 != null) {
			this.aClass263_7.method26618(1598916486).method26282((long) arg0.method32994((byte) -12));
		}
	}

	@OriginalMember(owner = "client!fl", name = "e", descriptor = "(Lclient!wc;IIZ)V")
	@Override
	public void method26674(@OriginalArg(0) Interface68 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aClass263_7.method26513((byte) 3).add(arg0);
		if (arg3) {
			this.aClass263_7.method26515(1980399352).method26253(arg0, (long) arg2);
		} else {
			this.aClass263_7.method26618(2088892011).method26254(arg0, (long) arg2, arg0.method32970((byte) 63), (byte) -66);
		}
	}

	@OriginalMember(owner = "client!fl", name = "u", descriptor = "(Lclient!wc;IIZ)V")
	@Override
	public void method26678(@OriginalArg(0) Interface68 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aClass263_7.method26513((byte) 84).add(arg0);
		if (arg3) {
			this.aClass263_7.method26515(1980399352).method26253(arg0, (long) arg2);
		} else {
			this.aClass263_7.method26618(2033495817).method26254(arg0, (long) arg2, arg0.method32970((byte) 13), (byte) -113);
		}
	}

	@OriginalMember(owner = "client!fl", name = "l", descriptor = "(Lclient!wc;)V")
	@Override
	public void method26677(@OriginalArg(0) Interface68 arg0) {
		if (arg0 != null) {
			this.aClass263_7.method26618(1775241437).method26282((long) arg0.method32994((byte) -100));
		}
	}

	@OriginalMember(owner = "client!fl", name = "g", descriptor = "(Lclient!wc;)V")
	@Override
	public void method26679(@OriginalArg(0) Interface68 arg0) {
		if (arg0 != null) {
			this.aClass263_7.method26618(1393940788).method26282((long) arg0.method32994((byte) -59));
		}
	}
}
