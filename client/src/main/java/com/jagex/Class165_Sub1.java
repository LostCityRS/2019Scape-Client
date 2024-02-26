package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ama")
public final class Class165_Sub1 extends Class165 {

	@OriginalMember(owner = "client!ama", name = "g", descriptor = "Z")
	boolean aBoolean416 = true;

	@OriginalMember(owner = "client!ama", name = "i", descriptor = "Z")
	public boolean aBoolean417 = false;

	@OriginalMember(owner = "client!ama", name = "<init>", descriptor = "(ILclient!ale;)V")
	public Class165_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class80_Sub37 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ama", name = "<init>", descriptor = "(Lclient!ale;)V")
	public Class165_Sub1(@OriginalArg(0) Class80_Sub37 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ama", name = "g", descriptor = "()I")
	@Override
	int method16948() {
		this.aBoolean417 = true;
		return this.aClass80_Sub37_48.method14947(-1924236893).method444(1829499267) ? 3 : 1;
	}

	@OriginalMember(owner = "client!ama", name = "d", descriptor = "()I")
	public int method15832() {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!ama", name = "t", descriptor = "(B)I")
	@Override
	int method16949(@OriginalArg(0) byte arg0) {
		this.aBoolean417 = true;
		return this.aClass80_Sub37_48.method14947(2124904321).method444(257663770) ? 3 : 1;
	}

	@OriginalMember(owner = "client!ama", name = "s", descriptor = "(I)Z")
	public boolean method15833(@OriginalArg(0) int arg0) {
		return true;
	}

	@OriginalMember(owner = "client!ama", name = "f", descriptor = "(IB)I")
	@Override
	public int method16950(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return arg0 == 3 && !Class588.method31902(350319923).method31862("jagdx", 530117796) ? 3 : 2;
	}

	@OriginalMember(owner = "client!ama", name = "u", descriptor = "(II)V")
	@Override
	void method16952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aBoolean417 = false;
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!ama", name = "k", descriptor = "(I)I")
	public int method15834(@OriginalArg(0) int arg0) {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!ama", name = "v", descriptor = "(Z)V")
	public void method15835(@OriginalArg(0) boolean arg0) {
		this.aBoolean416 = arg0;
	}

	@OriginalMember(owner = "client!ama", name = "w", descriptor = "(ZI)V")
	public void method15836(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		this.aBoolean416 = arg0;
	}

	@OriginalMember(owner = "client!ama", name = "a", descriptor = "(I)V")
	public void method15837(@OriginalArg(0) int arg0) {
		if (this.anInt2398 * -229615671 < 0 || this.anInt2398 * -229615671 > 5 || this.anInt2398 * -229615671 == 2) {
			this.anInt2398 = this.method16949((byte) 43) * 251097721;
		}
	}

	@OriginalMember(owner = "client!ama", name = "p", descriptor = "(Z)V")
	public void method15838(@OriginalArg(0) boolean arg0) {
		this.aBoolean416 = arg0;
	}

	@OriginalMember(owner = "client!ama", name = "m", descriptor = "(I)V")
	@Override
	void method16955(@OriginalArg(0) int arg0) {
		this.aBoolean417 = false;
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!ama", name = "r", descriptor = "()Z")
	public boolean method15839() {
		return true;
	}

	@OriginalMember(owner = "client!ama", name = "q", descriptor = "()Z")
	public boolean method15840() {
		return true;
	}

	@OriginalMember(owner = "client!ama", name = "h", descriptor = "()Z")
	public boolean method15841() {
		return true;
	}

	@OriginalMember(owner = "client!ama", name = "i", descriptor = "(I)I")
	@Override
	public int method16954(@OriginalArg(0) int arg0) {
		return arg0 == 3 && !Class588.method31902(350319923).method31862("jagdx", 628961242) ? 3 : 2;
	}

	@OriginalMember(owner = "client!ama", name = "z", descriptor = "()Z")
	boolean method15842() {
		return this.aBoolean416;
	}

	@OriginalMember(owner = "client!ama", name = "x", descriptor = "(I)Z")
	boolean method15843(@OriginalArg(0) int arg0) {
		return this.aBoolean416;
	}

	@OriginalMember(owner = "client!ama", name = "l", descriptor = "()I")
	@Override
	int method16953() {
		this.aBoolean417 = true;
		return this.aClass80_Sub37_48.method14947(-1478452023).method444(-153509562) ? 3 : 1;
	}

	@OriginalMember(owner = "client!ama", name = "y", descriptor = "(Z)V")
	public void method15844(@OriginalArg(0) boolean arg0) {
		this.aBoolean416 = arg0;
	}
}
