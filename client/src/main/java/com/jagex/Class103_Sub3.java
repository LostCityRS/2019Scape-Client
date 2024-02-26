package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afu")
public final class Class103_Sub3 extends Class103 {

	@OriginalMember(owner = "client!afu", name = "f", descriptor = "I")
	final int anInt871;

	@OriginalMember(owner = "client!afu", name = "e", descriptor = "I")
	final int anInt868;

	@OriginalMember(owner = "client!afu", name = "u", descriptor = "I")
	final int anInt869;

	@OriginalMember(owner = "client!afu", name = "l", descriptor = "I")
	final int anInt867;

	@OriginalMember(owner = "client!afu", name = "g", descriptor = "I")
	final int anInt870;

	@OriginalMember(owner = "client!afu", name = "adm", descriptor = "(Lclient!yp;S)V")
	static void method7211(@OriginalArg(0) Class690 arg0, @OriginalArg(1) short arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local13 * local23;
	}

	@OriginalMember(owner = "client!afu", name = "gf", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;I)V")
	static void method7212(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) int arg3) {
		arg0.aBoolean820 = arg2.anIntArray525[(arg2.anInt5778 -= 2036747717) * 1896589581] == 1;
		Class296.method26998(arg0, 1516260939);
		if (arg0.anInt4094 * 2071556223 == -1 && !arg1.aBoolean794) {
			Class299.method27027(arg0.anInt4087 * -2053489901, 906625895);
		}
	}

	@OriginalMember(owner = "client!afu", name = "<init>", descriptor = "(Lclient!ald;)V")
	Class103_Sub3(@OriginalArg(0) Class80_Sub36 arg0) {
		super(arg0);
		this.anInt871 = arg0.method23178((byte) -60) * 1197114595;
		@Pc(13) int local13 = arg0.method23182(1451855435);
		this.anInt868 = (local13 >>> 16) * -56377339;
		this.anInt869 = (local13 & 0xFFFF) * -1107228731;
		this.anInt867 = arg0.method23362(-538938126) * -2064002775;
		this.anInt870 = arg0.method23194(35000) * -1165530193;
	}

	@OriginalMember(owner = "client!afu", name = "l", descriptor = "()V")
	@Override
	public void method19198() {
		Class251.aClass254Array1[this.anInt871 * 1374085323].method26385(this.anInt868 * -1919742771, this.anInt869 * -128524531, this.anInt867 * 1733909273, this.anInt870 * -909194417, -914007459);
	}

	@OriginalMember(owner = "client!afu", name = "f", descriptor = "(I)V")
	@Override
	public void method19206(@OriginalArg(0) int arg0) {
		Class251.aClass254Array1[this.anInt871 * 1374085323].method26385(this.anInt868 * -1919742771, this.anInt869 * -128524531, this.anInt867 * 1733909273, this.anInt870 * -909194417, -251442702);
	}

	@OriginalMember(owner = "client!afu", name = "g", descriptor = "()V")
	@Override
	public void method19202() {
		Class251.aClass254Array1[this.anInt871 * 1374085323].method26385(this.anInt868 * -1919742771, this.anInt869 * -128524531, this.anInt867 * 1733909273, this.anInt870 * -909194417, -1835642983);
	}
}
