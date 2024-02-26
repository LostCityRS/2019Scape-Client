package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!abv")
public final class Class46 {

	@OriginalMember(owner = "client!abv", name = "t", descriptor = "I")
	final int anInt179;

	@OriginalMember(owner = "client!abv", name = "f", descriptor = "I")
	final int anInt176;

	@OriginalMember(owner = "client!abv", name = "e", descriptor = "I")
	final int anInt177;

	@OriginalMember(owner = "client!abv", name = "u", descriptor = "I")
	final int anInt178;

	@OriginalMember(owner = "client!abv", name = "l", descriptor = "I")
	final int anInt175;

	@OriginalMember(owner = "client!abv", name = "amf", descriptor = "(Lclient!yp;I)V")
	static void method954(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5776 -= 1819398433;
		Class351.method28017((String) arg0.anObjectArray46[arg0.anInt5776 * -2070619997], (String) arg0.anObjectArray46[arg0.anInt5776 * -2070619997 + 1], (String) arg0.anObjectArray46[arg0.anInt5776 * -2070619997 + 2], arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581] == 1, true, -106604841);
	}

	@OriginalMember(owner = "client!abv", name = "<init>", descriptor = "(IIIII)V")
	Class46(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt179 = arg0 * -131535715;
		this.anInt176 = arg1 * 190744717;
		this.anInt177 = arg2 * 170164473;
		this.anInt178 = arg3 * 1398257063;
		this.anInt175 = arg4 * 928400853;
	}

	@OriginalMember(owner = "client!abv", name = "rm", descriptor = "()I")
	public int method953() {
		return this.anInt179 * 517798325;
	}

	@OriginalMember(owner = "client!abv", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		return this.anInt179 * 517798325;
	}
}
