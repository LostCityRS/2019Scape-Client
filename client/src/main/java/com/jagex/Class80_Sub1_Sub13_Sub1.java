package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!atg")
public final class Class80_Sub1_Sub13_Sub1 extends Class80_Sub1_Sub13 {

	@OriginalMember(owner = "client!atg", name = "m", descriptor = "F")
	float aFloat240 = 0.0F;

	@OriginalMember(owner = "client!atg", name = "<init>", descriptor = "(ILclient!ald;)V")
	Class80_Sub1_Sub13_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Packet arg1) {
		super(arg0);
		this.aFloat240 = arg1.gFloat();
	}

	@OriginalMember(owner = "client!atg", name = "<init>", descriptor = "(IF)V")
	public Class80_Sub1_Sub13_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		super(arg0);
		this.aFloat240 = arg1;
	}

	@OriginalMember(owner = "client!atg", name = "m", descriptor = "(Lclient!jl;Lclient!ov;Lclient!pm;)V")
	@Override
	public void method23755(@OriginalArg(0) Class363 arg0, @OriginalArg(1) Class471 arg1, @OriginalArg(2) Class487 arg2) {
		arg1.method29774(0.0F, 0.0F, 1.0F, this.aFloat240);
	}

	@OriginalMember(owner = "client!atg", name = "s", descriptor = "(FI)V")
	public void method23695(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1) {
		this.aFloat240 = arg0;
	}

	@OriginalMember(owner = "client!atg", name = "g", descriptor = "(F)V")
	@Override
	public void method23748(@OriginalArg(0) float arg0) {
	}

	@OriginalMember(owner = "client!atg", name = "e", descriptor = "(Lclient!jl;Lclient!ov;Lclient!pm;B)V")
	@Override
	public void method23751(@OriginalArg(0) Class363 arg0, @OriginalArg(1) Class471 arg1, @OriginalArg(2) Class487 arg2, @OriginalArg(3) byte arg3) {
		arg1.method29774(0.0F, 0.0F, 1.0F, this.aFloat240);
	}

	@OriginalMember(owner = "client!atg", name = "u", descriptor = "(Lclient!ald;I)V")
	@Override
	public void method23749(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		this.aFloat240 = arg0.gFloat();
	}

	@OriginalMember(owner = "client!atg", name = "f", descriptor = "(FI)V")
	@Override
	public void method23753(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!atg", name = "z", descriptor = "(F)V")
	public void method23696(@OriginalArg(0) float arg0) {
		this.aFloat240 = arg0;
	}

	@OriginalMember(owner = "client!atg", name = "p", descriptor = "(F)V")
	public void method23697(@OriginalArg(0) float arg0) {
		this.aFloat240 = arg0;
	}

	@OriginalMember(owner = "client!atg", name = "l", descriptor = "(F)V")
	@Override
	public void method23750(@OriginalArg(0) float arg0) {
	}

	@OriginalMember(owner = "client!atg", name = "i", descriptor = "(Lclient!jl;Lclient!ov;Lclient!pm;)V")
	@Override
	public void method23752(@OriginalArg(0) Class363 arg0, @OriginalArg(1) Class471 arg1, @OriginalArg(2) Class487 arg2) {
		arg1.method29774(0.0F, 0.0F, 1.0F, this.aFloat240);
	}

	@OriginalMember(owner = "client!atg", name = "x", descriptor = "(F)V")
	public void method23698(@OriginalArg(0) float arg0) {
		this.aFloat240 = arg0;
	}

	@OriginalMember(owner = "client!atg", name = "o", descriptor = "(Lclient!ald;)V")
	@Override
	public void method23754(@OriginalArg(0) Packet arg0) {
		this.aFloat240 = arg0.gFloat();
	}

	@OriginalMember(owner = "client!atg", name = "j", descriptor = "(Lclient!ald;)V")
	@Override
	public void method23747(@OriginalArg(0) Packet arg0) {
		this.aFloat240 = arg0.gFloat();
	}

	@OriginalMember(owner = "client!atg", name = "a", descriptor = "(Lclient!ald;)V")
	@Override
	public void method23756(@OriginalArg(0) Packet arg0) {
		this.aFloat240 = arg0.gFloat();
	}
}
