package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aix")
public class Class139_Sub2 extends Class139 implements Interface37 {

	@OriginalMember(owner = "client!aix", name = "d", descriptor = "B")
	byte aByte23;

	@OriginalMember(owner = "client!aix", name = "<init>", descriptor = "(Lclient!aqv;Z)V", line = 11)
	Class139_Sub2(@OriginalArg(0) Class104_Sub2_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		super(arg0, 34962, arg1);
	}

	@OriginalMember(owner = "client!aix", name = "k", descriptor = "()I", line = 15)
	@Override
	public int method29338() {
		return super.method29338();
	}

	@OriginalMember(owner = "client!aix", name = "z", descriptor = "()I", line = 15)
	@Override
	public int method29336() {
		return super.method29338();
	}

	@OriginalMember(owner = "client!aix", name = "d", descriptor = "()I", line = 15)
	@Override
	public int method29339() {
		return super.method29338();
	}

	@OriginalMember(owner = "client!aix", name = "p", descriptor = "()I", line = 15)
	@Override
	public int method29337() {
		return super.method29338();
	}

	@OriginalMember(owner = "client!aix", name = "as", descriptor = "()I", line = 19)
	int method11668() {
		return this.aByte23;
	}

	@OriginalMember(owner = "client!aix", name = "n", descriptor = "(II)Z", line = 23)
	@Override
	public boolean method29314(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aByte23 = (byte) arg1;
		super.method29351(arg0);
		return true;
	}

	@OriginalMember(owner = "client!aix", name = "e", descriptor = "(II)Z", line = 23)
	@Override
	public boolean method29315(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aByte23 = (byte) arg1;
		super.method29351(arg0);
		return true;
	}

	@OriginalMember(owner = "client!aix", name = "u", descriptor = "()V", line = 29)
	@Override
	public void method30885() {
		super.method30884();
	}

	@OriginalMember(owner = "client!aix", name = "m", descriptor = "()V", line = 29)
	@Override
	public void method30884() {
		super.method30884();
	}

	@OriginalMember(owner = "client!aix", name = "f", descriptor = "(IIJ)Z", line = 33)
	@Override
	public boolean method29333(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		return super.method29333(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aix", name = "c", descriptor = "(IIJ)Z", line = 33)
	@Override
	public boolean method29342(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		return super.method29333(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aix", name = "r", descriptor = "(IIJ)Z", line = 33)
	@Override
	public boolean method29340(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		return super.method29333(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aix", name = "w", descriptor = "(II)J", line = 37)
	@Override
	public long method29332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return super.method29332(arg0, arg1);
	}

	@OriginalMember(owner = "client!aix", name = "v", descriptor = "(II)J", line = 37)
	@Override
	public long method29341(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return super.method29332(arg0, arg1);
	}

	@OriginalMember(owner = "client!aix", name = "o", descriptor = "(II)J", line = 37)
	@Override
	public long method29335(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return super.method29332(arg0, arg1);
	}

	@OriginalMember(owner = "client!aix", name = "s", descriptor = "(II)J", line = 37)
	@Override
	public long method29343(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return super.method29332(arg0, arg1);
	}

	@OriginalMember(owner = "client!aix", name = "y", descriptor = "(II)J", line = 37)
	@Override
	public long method29334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return super.method29332(arg0, arg1);
	}

	@OriginalMember(owner = "client!aix", name = "q", descriptor = "()V", line = 41)
	@Override
	public void method29345() {
		super.method29344();
	}

	@OriginalMember(owner = "client!aix", name = "x", descriptor = "()V", line = 41)
	@Override
	public void method29346() {
		super.method29344();
	}

	@OriginalMember(owner = "client!aix", name = "h", descriptor = "()V", line = 41)
	@Override
	public void method29348() {
		super.method29344();
	}

	@OriginalMember(owner = "client!aix", name = "l", descriptor = "()V", line = 41)
	@Override
	public void method29344() {
		super.method29344();
	}

	@OriginalMember(owner = "client!aix", name = "b", descriptor = "()V", line = 41)
	@Override
	public void method29347() {
		super.method29344();
	}
}
