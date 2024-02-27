package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!atj")
public final class Class93_Sub1_Sub17_Sub2 extends Class93_Sub1_Sub17 {

	@OriginalMember(owner = "client!atj", name = "u", descriptor = "F")
	float aFloat233 = 0.0F;

	@OriginalMember(owner = "client!atj", name = "<init>", descriptor = "(ILclient!alw;)V")
	Class93_Sub1_Sub17_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub41 arg1) {
		super(arg0);
		this.aFloat233 = arg1.method22437(-969577221);
	}

	@OriginalMember(owner = "client!atj", name = "<init>", descriptor = "(IF)V")
	public Class93_Sub1_Sub17_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		super(arg0);
		this.aFloat233 = arg1;
	}

	@OriginalMember(owner = "client!atj", name = "z", descriptor = "(Lclient!ju;Lclient!ou;Lclient!pq;)V")
	@Override
	public void method23512(@OriginalArg(0) Class368 arg0, @OriginalArg(1) Class470 arg1, @OriginalArg(2) Class489 arg2) {
		arg1.method29560(0.0F, 0.0F, 1.0F, this.aFloat233);
	}

	@OriginalMember(owner = "client!atj", name = "x", descriptor = "(F)V")
	public void method23515(@OriginalArg(0) float arg0) {
		this.aFloat233 = arg0;
	}

	@OriginalMember(owner = "client!atj", name = "n", descriptor = "(FI)V")
	@Override
	public void method23504(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!atj", name = "m", descriptor = "(Lclient!ju;Lclient!ou;Lclient!pq;I)V")
	@Override
	public void method23513(@OriginalArg(0) Class368 arg0, @OriginalArg(1) Class470 arg1, @OriginalArg(2) Class489 arg2, @OriginalArg(3) int arg3) {
		arg1.method29560(0.0F, 0.0F, 1.0F, this.aFloat233);
	}

	@OriginalMember(owner = "client!atj", name = "v", descriptor = "(F)V")
	public void method23516(@OriginalArg(0) float arg0) {
		this.aFloat233 = arg0;
	}

	@OriginalMember(owner = "client!atj", name = "k", descriptor = "(Lclient!alw;I)V")
	@Override
	public void method23507(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		this.aFloat233 = arg0.method22437(-414420517);
	}

	@OriginalMember(owner = "client!atj", name = "y", descriptor = "(F)V")
	public void method23517(@OriginalArg(0) float arg0) {
		this.aFloat233 = arg0;
	}

	@OriginalMember(owner = "client!atj", name = "f", descriptor = "(F)V")
	@Override
	public void method23508(@OriginalArg(0) float arg0) {
	}

	@OriginalMember(owner = "client!atj", name = "w", descriptor = "(F)V")
	@Override
	public void method23509(@OriginalArg(0) float arg0) {
	}

	@OriginalMember(owner = "client!atj", name = "l", descriptor = "(F)V")
	@Override
	public void method23510(@OriginalArg(0) float arg0) {
	}

	@OriginalMember(owner = "client!atj", name = "u", descriptor = "(Lclient!ju;Lclient!ou;Lclient!pq;)V")
	@Override
	public void method23505(@OriginalArg(0) Class368 arg0, @OriginalArg(1) Class470 arg1, @OriginalArg(2) Class489 arg2) {
		arg1.method29560(0.0F, 0.0F, 1.0F, this.aFloat233);
	}

	@OriginalMember(owner = "client!atj", name = "r", descriptor = "(FI)V")
	public void method23518(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1) {
		this.aFloat233 = arg0;
	}

	@OriginalMember(owner = "client!atj", name = "p", descriptor = "(Lclient!ju;Lclient!ou;Lclient!pq;)V")
	@Override
	public void method23511(@OriginalArg(0) Class368 arg0, @OriginalArg(1) Class470 arg1, @OriginalArg(2) Class489 arg2) {
		arg1.method29560(0.0F, 0.0F, 1.0F, this.aFloat233);
	}

	@OriginalMember(owner = "client!atj", name = "d", descriptor = "(Lclient!alw;)V")
	@Override
	public void method23514(@OriginalArg(0) Class93_Sub41 arg0) {
		this.aFloat233 = arg0.method22437(1650481479);
	}
}
