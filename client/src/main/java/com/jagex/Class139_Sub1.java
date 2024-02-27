package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aid")
public final class Class139_Sub1 extends Class139 implements Interface40 {

	@OriginalMember(owner = "client!aid", name = "d", descriptor = "Lclient!dg;")
	Class226 aClass226_9;

	@OriginalMember(owner = "client!aid", name = "<init>", descriptor = "(Lclient!aqv;Lclient!dg;Z)V")
	Class139_Sub1(@OriginalArg(0) Class104_Sub2_Sub2 arg0, @OriginalArg(1) Class226 arg1, @OriginalArg(2) boolean arg2) {
		super(arg0, 34963, arg2);
		this.aClass226_9 = arg1;
	}

	@OriginalMember(owner = "client!aid", name = "f", descriptor = "(IIJ)Z")
	@Override
	public boolean method29514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		return super.method29514(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aid", name = "k", descriptor = "()I")
	@Override
	public int method29519() {
		return super.method29519();
	}

	@OriginalMember(owner = "client!aid", name = "e", descriptor = "()Lclient!dg;")
	@Override
	public Class226 method29533() {
		return this.aClass226_9;
	}

	@OriginalMember(owner = "client!aid", name = "a", descriptor = "(I)V")
	@Override
	public void method29532(@OriginalArg(0) int arg0) {
		super.method29532(arg0 * this.aClass226_9.anInt3687 * -1066472467);
	}

	@OriginalMember(owner = "client!aid", name = "w", descriptor = "(II)J")
	@Override
	public long method29513(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return super.method29513(arg0, arg1);
	}

	@OriginalMember(owner = "client!aid", name = "m", descriptor = "()V")
	@Override
	public void method31065() {
		super.method31065();
	}

	@OriginalMember(owner = "client!aid", name = "l", descriptor = "()V")
	@Override
	public void method29525() {
		super.method29525();
	}

	@OriginalMember(owner = "client!aid", name = "h", descriptor = "()V")
	@Override
	public void method29529() {
		super.method29525();
	}

	@OriginalMember(owner = "client!aid", name = "o", descriptor = "(II)J")
	@Override
	public long method29516(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return super.method29513(arg0, arg1);
	}

	@OriginalMember(owner = "client!aid", name = "z", descriptor = "()I")
	@Override
	public int method29517() {
		return super.method29519();
	}

	@OriginalMember(owner = "client!aid", name = "p", descriptor = "()I")
	@Override
	public int method29518() {
		return super.method29519();
	}

	@OriginalMember(owner = "client!aid", name = "d", descriptor = "()I")
	@Override
	public int method29520() {
		return super.method29519();
	}

	@OriginalMember(owner = "client!aid", name = "c", descriptor = "(IIJ)Z")
	@Override
	public boolean method29523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		return super.method29514(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aid", name = "r", descriptor = "(IIJ)Z")
	@Override
	public boolean method29521(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		return super.method29514(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!aid", name = "v", descriptor = "(II)J")
	@Override
	public long method29522(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return super.method29513(arg0, arg1);
	}

	@OriginalMember(owner = "client!aid", name = "s", descriptor = "(II)J")
	@Override
	public long method29524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return super.method29513(arg0, arg1);
	}

	@OriginalMember(owner = "client!aid", name = "y", descriptor = "(II)J")
	@Override
	public long method29515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return super.method29513(arg0, arg1);
	}

	@OriginalMember(owner = "client!aid", name = "u", descriptor = "()V")
	@Override
	public void method31066() {
		super.method31065();
	}

	@OriginalMember(owner = "client!aid", name = "x", descriptor = "()V")
	@Override
	public void method29527() {
		super.method29525();
	}

	@OriginalMember(owner = "client!aid", name = "b", descriptor = "()V")
	@Override
	public void method29528() {
		super.method29525();
	}

	@OriginalMember(owner = "client!aid", name = "i", descriptor = "(I)V")
	@Override
	public void method29536(@OriginalArg(0) int arg0) {
		super.method29532(arg0 * this.aClass226_9.anInt3687 * -1066472467);
	}

	@OriginalMember(owner = "client!aid", name = "n", descriptor = "()Lclient!dg;")
	@Override
	public Class226 method29534() {
		return this.aClass226_9;
	}

	@OriginalMember(owner = "client!aid", name = "g", descriptor = "(I)V")
	@Override
	public void method29535(@OriginalArg(0) int arg0) {
		super.method29532(arg0 * this.aClass226_9.anInt3687 * -1066472467);
	}

	@OriginalMember(owner = "client!aid", name = "q", descriptor = "()V")
	@Override
	public void method29526() {
		super.method29525();
	}
}
