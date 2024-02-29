package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!abk")
public class Class37 {

	@OriginalMember(owner = "client!abk", name = "e", descriptor = "I")
	final int anInt120;

	@OriginalMember(owner = "client!abk", name = "n", descriptor = "I")
	final int anInt118;

	@OriginalMember(owner = "client!abk", name = "m", descriptor = "I")
	final int anInt119;

	@OriginalMember(owner = "client!abk", name = "k", descriptor = "I")
	final int anInt121;

	@OriginalMember(owner = "client!abk", name = "f", descriptor = "I")
	final int anInt122;

	@OriginalMember(owner = "client!abk", name = "<init>", descriptor = "(IIIII)V", line = 309)
	Class37(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt120 = arg0 * 1102796227;
		this.anInt118 = arg1 * 1754445833;
		this.anInt119 = arg2 * -423475337;
		this.anInt121 = arg3 * 837538211;
		this.anInt122 = arg4 * -688741333;
	}

	@OriginalMember(owner = "client!abk", name = "rm", descriptor = "()I", line = 318)
	public int method717() {
		return this.anInt120 * 614744811;
	}

	@OriginalMember(owner = "client!abk", name = "hashCode", descriptor = "()I", line = 318)
	@Override
	public int hashCode() {
		return this.anInt120 * 614744811;
	}

	@OriginalMember(owner = "client!abk", name = "rk", descriptor = "()I", line = 318)
	public int method718() {
		return this.anInt120 * 614744811;
	}

	@OriginalMember(owner = "client!abk", name = "ri", descriptor = "()I", line = 318)
	public int method719() {
		return this.anInt120 * 614744811;
	}
}
