package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ann")
public final class Class165_Sub37 extends Class165 {

	@OriginalMember(owner = "client!ann", name = "m", descriptor = "I")
	static final int anInt2330 = 70;

	@OriginalMember(owner = "client!ann", name = "g", descriptor = "I")
	static final int anInt2331 = 5;

	@OriginalMember(owner = "client!ann", name = "i", descriptor = "I")
	static final int anInt2332 = 300;

	@OriginalMember(owner = "client!ann", name = "z", descriptor = "(Lclient!di;I)V")
	static void method16684(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		if (Class630.aClass487_99 != null) {
			arg0.method20933(Class630.aClass487_99);
			arg0.method20759(Class630.aClass471_54);
			arg0.method20986(Class630.anInt5560 * -1460567703, Class630.anInt5562 * 73602969, Class630.anInt5560 * -1460567703 + Class630.anInt5545 * -1228226275, Class630.anInt5562 * 73602969 + Class630.anInt5561 * -1036781733);
			arg0.method20706(Class630.anInt5560 * -1460567703, Class630.anInt5562 * 73602969, Class630.anInt5545 * -1228226275, Class630.anInt5561 * -1036781733);
		}
	}

	@OriginalMember(owner = "client!ann", name = "<init>", descriptor = "(ILclient!ale;)V")
	public Class165_Sub37(@OriginalArg(0) int arg0, @OriginalArg(1) Class80_Sub37 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ann", name = "<init>", descriptor = "(Lclient!ale;)V")
	public Class165_Sub37(@OriginalArg(0) Class80_Sub37 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ann", name = "t", descriptor = "(B)I")
	@Override
	int method16949(@OriginalArg(0) byte arg0) {
		return 70;
	}

	@OriginalMember(owner = "client!ann", name = "a", descriptor = "(I)V")
	public void method16676(@OriginalArg(0) int arg0) {
		this.anInt2398 = Math.min(Math.max(this.anInt2398 * -229615671, 5), 300) * 251097721;
	}

	@OriginalMember(owner = "client!ann", name = "f", descriptor = "(IB)I")
	@Override
	int method16950(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return 3;
	}

	@OriginalMember(owner = "client!ann", name = "u", descriptor = "(II)V")
	@Override
	void method16952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!ann", name = "r", descriptor = "()I")
	public int method16677() {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!ann", name = "l", descriptor = "()I")
	@Override
	int method16953() {
		return 70;
	}

	@OriginalMember(owner = "client!ann", name = "g", descriptor = "()I")
	@Override
	int method16948() {
		return 70;
	}

	@OriginalMember(owner = "client!ann", name = "i", descriptor = "(I)I")
	@Override
	int method16954(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!ann", name = "m", descriptor = "(I)V")
	@Override
	void method16955(@OriginalArg(0) int arg0) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!ann", name = "k", descriptor = "()V")
	public void method16678() {
		this.anInt2398 = Math.min(Math.max(this.anInt2398 * -229615671, 5), 300) * 251097721;
	}

	@OriginalMember(owner = "client!ann", name = "x", descriptor = "()I")
	public int method16679() {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!ann", name = "w", descriptor = "()I")
	public int method16680() {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!ann", name = "h", descriptor = "()I")
	public int method16681() {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!ann", name = "s", descriptor = "(I)I")
	public int method16682(@OriginalArg(0) int arg0) {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!ann", name = "q", descriptor = "()I")
	public int method16683() {
		return this.anInt2398 * -229615671;
	}
}
