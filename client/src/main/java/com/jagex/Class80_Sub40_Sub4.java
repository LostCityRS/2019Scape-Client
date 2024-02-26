package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!asy")
public final class Class80_Sub40_Sub4 extends Class80_Sub40 {

	@OriginalMember(owner = "client!asy", name = "g", descriptor = "Lclient!yu;")
	final Class695 aClass695_1;

	@OriginalMember(owner = "client!asy", name = "<init>", descriptor = "(IILclient!yu;)V")
	public Class80_Sub40_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class695 arg2) {
		super(arg0, arg1);
		this.aClass695_1 = arg2;
	}

	@OriginalMember(owner = "client!asy", name = "t", descriptor = "(S)Z")
	@Override
	public boolean method23437(@OriginalArg(0) short arg0) {
		@Pc(4) Interface60 local4 = this.aClass695_1.method37030((byte) 1);
		if (local4 == null) {
			return false;
		} else {
			Class566.method31503(Class158.aClass158_63, this.anInt3156 * -151091669, -1, local4, (byte) 1);
			return true;
		}
	}

	@OriginalMember(owner = "client!asy", name = "f", descriptor = "()Z")
	@Override
	public boolean method23436() {
		@Pc(4) Interface60 local4 = this.aClass695_1.method37030((byte) 1);
		if (local4 == null) {
			return false;
		} else {
			Class566.method31503(Class158.aClass158_63, this.anInt3156 * -151091669, -1, local4, (byte) 1);
			return true;
		}
	}

	@OriginalMember(owner = "client!asy", name = "e", descriptor = "()Z")
	@Override
	public boolean method23438() {
		@Pc(4) Interface60 local4 = this.aClass695_1.method37030((byte) 1);
		if (local4 == null) {
			return false;
		} else {
			Class566.method31503(Class158.aClass158_63, this.anInt3156 * -151091669, -1, local4, (byte) 1);
			return true;
		}
	}
}
