package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!atj")
public class Class93_Sub1_Sub17_Sub2 extends Class93_Sub1_Sub17 {

	@OriginalMember(owner = "client!atj", name = "u", descriptor = "F")
	float aFloat233 = 0.0F;

	@OriginalMember(owner = "client!atj", name = "<init>", descriptor = "(IF)V", line = 12)
	public Class93_Sub1_Sub17_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		super(arg0);
		this.aFloat233 = arg1;
	}

	@OriginalMember(owner = "client!atj", name = "<init>", descriptor = "(ILclient!alw;)V", line = 17)
	Class93_Sub1_Sub17_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub41 arg1) {
		super(arg0);
		this.aFloat233 = arg1.method22504(-969577221);
	}

	@OriginalMember(owner = "client!atj", name = "x", descriptor = "(F)V", line = 22)
	public void method23503(@OriginalArg(0) float arg0) {
		this.aFloat233 = arg0;
	}

	@OriginalMember(owner = "client!atj", name = "v", descriptor = "(F)V", line = 22)
	public void method23504(@OriginalArg(0) float arg0) {
		this.aFloat233 = arg0;
	}

	@OriginalMember(owner = "client!atj", name = "y", descriptor = "(F)V", line = 22)
	public void method23505(@OriginalArg(0) float arg0) {
		this.aFloat233 = arg0;
	}

	@OriginalMember(owner = "client!atj", name = "r", descriptor = "(FI)V", line = 22)
	public void method23506(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1) {
		this.aFloat233 = arg0;
	}

	@OriginalMember(owner = "client!atj", name = "n", descriptor = "(FI)V", line = 25)
	@Override
	public void method23493(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!atj", name = "f", descriptor = "(F)V", line = 25)
	@Override
	public void method23496(@OriginalArg(0) float arg0) {
	}

	@OriginalMember(owner = "client!atj", name = "w", descriptor = "(F)V", line = 25)
	@Override
	public void method23497(@OriginalArg(0) float arg0) {
	}

	@OriginalMember(owner = "client!atj", name = "l", descriptor = "(F)V", line = 25)
	@Override
	public void method23498(@OriginalArg(0) float arg0) {
	}

	@OriginalMember(owner = "client!atj", name = "z", descriptor = "(Lclient!ju;Lclient!ou;Lclient!pq;)V", line = 28)
	@Override
	public void method23500(@OriginalArg(0) Class368 arg0, @OriginalArg(1) Class470 arg1, @OriginalArg(2) Class489 arg2) {
		arg1.method29403(0.0F, 0.0F, 1.0F, this.aFloat233);
	}

	@OriginalMember(owner = "client!atj", name = "m", descriptor = "(Lclient!ju;Lclient!ou;Lclient!pq;I)V", line = 28)
	@Override
	public void method23501(@OriginalArg(0) Class368 arg0, @OriginalArg(1) Class470 arg1, @OriginalArg(2) Class489 arg2, @OriginalArg(3) int arg3) {
		arg1.method29403(0.0F, 0.0F, 1.0F, this.aFloat233);
	}

	@OriginalMember(owner = "client!atj", name = "u", descriptor = "(Lclient!ju;Lclient!ou;Lclient!pq;)V", line = 28)
	@Override
	public void method23494(@OriginalArg(0) Class368 arg0, @OriginalArg(1) Class470 arg1, @OriginalArg(2) Class489 arg2) {
		arg1.method29403(0.0F, 0.0F, 1.0F, this.aFloat233);
	}

	@OriginalMember(owner = "client!atj", name = "p", descriptor = "(Lclient!ju;Lclient!ou;Lclient!pq;)V", line = 28)
	@Override
	public void method23499(@OriginalArg(0) Class368 arg0, @OriginalArg(1) Class470 arg1, @OriginalArg(2) Class489 arg2) {
		arg1.method29403(0.0F, 0.0F, 1.0F, this.aFloat233);
	}

	@OriginalMember(owner = "client!atj", name = "k", descriptor = "(Lclient!alw;I)V", line = 32)
	@Override
	public void method23495(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		this.aFloat233 = arg0.method22504(-414420517);
	}

	@OriginalMember(owner = "client!atj", name = "d", descriptor = "(Lclient!alw;)V", line = 32)
	@Override
	public void method23502(@OriginalArg(0) Class93_Sub41 arg0) {
		this.aFloat233 = arg0.method22504(1650481479);
	}
}
