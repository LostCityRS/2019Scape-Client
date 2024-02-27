package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aix")
public final class Class139_Sub2 extends Class139 implements Interface37 {

	@OriginalMember(owner = "client!aix", name = "d", descriptor = "B")
	byte aByte23;

	@OriginalMember(owner = "client!aix", name = "<init>", descriptor = "(Lclient!aqv;Z)V")
	Class139_Sub2(@OriginalArg(0) Class104_Sub2_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		super(arg0, 34962, arg1);
	}

	@OriginalMember(owner = "client!aix", name = "q", descriptor = "()V")
	@Override
	public void method29526() {
		super.method29525();
	}

	@OriginalMember(owner = "client!aix", name = "k", descriptor = "()I")
	@Override
	public int method29519() {
		return super.method29519();
	}

	@OriginalMember(owner = "client!aix", name = "x", descriptor = "()V")
	@Override
	public void method29527() {
		super.method29525();
	}

	@OriginalMember(owner = "client!aix", name = "h", descriptor = "()V")
	@Override
	public void method29529() {
		super.method29525();
	}

	@OriginalMember(owner = "client!aix", name = "f", descriptor = "(IIJ)Z")
	@Override
	public boolean method29514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		return super.method29514(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aix", name = "c", descriptor = "(IIJ)Z")
	@Override
	public boolean method29523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		return super.method29514(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aix", name = "w", descriptor = "(II)J")
	@Override
	public long method29513(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return super.method29513(arg0, arg1);
	}

	@OriginalMember(owner = "client!aix", name = "l", descriptor = "()V")
	@Override
	public void method29525() {
		super.method29525();
	}

	@OriginalMember(owner = "client!aix", name = "u", descriptor = "()V")
	@Override
	public void method31066() {
		super.method31065();
	}

	@OriginalMember(owner = "client!aix", name = "n", descriptor = "(II)Z")
	@Override
	public boolean method29495(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aByte23 = (byte) arg1;
		super.method29532(arg0);
		return true;
	}

	@OriginalMember(owner = "client!aix", name = "z", descriptor = "()I")
	@Override
	public int method29517() {
		return super.method29519();
	}

	@OriginalMember(owner = "client!aix", name = "d", descriptor = "()I")
	@Override
	public int method29520() {
		return super.method29519();
	}

	@OriginalMember(owner = "client!aix", name = "e", descriptor = "(II)Z")
	@Override
	public boolean method29496(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aByte23 = (byte) arg1;
		super.method29532(arg0);
		return true;
	}

	@OriginalMember(owner = "client!aix", name = "r", descriptor = "(IIJ)Z")
	@Override
	public boolean method29521(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		return super.method29514(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aix", name = "v", descriptor = "(II)J")
	@Override
	public long method29522(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return super.method29513(arg0, arg1);
	}

	@OriginalMember(owner = "client!aix", name = "o", descriptor = "(II)J")
	@Override
	public long method29516(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return super.method29513(arg0, arg1);
	}

	@OriginalMember(owner = "client!aix", name = "s", descriptor = "(II)J")
	@Override
	public long method29524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return super.method29513(arg0, arg1);
	}

	@OriginalMember(owner = "client!aix", name = "y", descriptor = "(II)J")
	@Override
	public long method29515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return super.method29513(arg0, arg1);
	}

	@OriginalMember(owner = "client!aix", name = "m", descriptor = "()V")
	@Override
	public void method31065() {
		super.method31065();
	}

	@OriginalMember(owner = "client!aix", name = "p", descriptor = "()I")
	@Override
	public int method29518() {
		return super.method29519();
	}

	@OriginalMember(owner = "client!aix", name = "b", descriptor = "()V")
	@Override
	public void method29528() {
		super.method29525();
	}

	@OriginalMember(owner = "client!aix", name = "as", descriptor = "()I")
	int method11668() {
		return this.aByte23;
	}
}
