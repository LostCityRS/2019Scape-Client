package com.jagex;

import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVolumeTexture;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.nio.ByteBuffer;

@OriginalClass("client!ahn")
public final class Class128_Sub1 extends Class128 implements Interface36 {

	@OriginalMember(owner = "client!ahn", name = "g", descriptor = "I")
	final int anInt1163;

	@OriginalMember(owner = "client!ahn", name = "i", descriptor = "I")
	final int anInt1162;

	@OriginalMember(owner = "client!ahn", name = "m", descriptor = "I")
	final int anInt1161;

	@OriginalMember(owner = "client!ahn", name = "<init>", descriptor = "(Lclient!aqw;Lclient!co;IIIZ[B)V")
	Class128_Sub1(@OriginalArg(0) Class102_Sub1_Sub2 arg0, @OriginalArg(1) Class210 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6) {
		super(arg0, arg1, Class236.aClass236_21, false, arg2 * arg3 * arg4);
		this.anInt1163 = arg2;
		this.anInt1162 = arg3;
		this.anInt1161 = arg4;
		this.aLong51 = IDirect3DDevice.CreateVolumeTexture(this.aClass102_Sub1_Sub2_9.aLong173, arg2, arg3, arg4, 1, 0, Class102_Sub1_Sub2.method21553(arg1, this.aClass236_16), 1);
		this.aClass102_Sub1_Sub2_9.method21292(this.anInt1163 * this.anInt1162 * arg1.anInt3600 * 499559879);
		@Pc(52) ByteBuffer local52 = this.aClass102_Sub1_Sub2_9.aByteBuffer7;
		local52.clear();
		local52.put(arg6);
		IDirect3DVolumeTexture.Upload(this.aLong51, 0, 0, 0, 0, this.anInt1163, this.anInt1162, this.anInt1161, this.anInt1163 * arg1.anInt3600 * 499559879, 0, this.aClass102_Sub1_Sub2_9.aLong168);
	}

	@OriginalMember(owner = "client!ahn", name = "e", descriptor = "()V")
	@Override
	public void method30837() {
		super.method30837();
	}

	@OriginalMember(owner = "client!ahn", name = "bh", descriptor = "()J")
	@Override
	long method11813() {
		return this.aLong51;
	}

	@OriginalMember(owner = "client!ahn", name = "bg", descriptor = "(Lclient!le;)V")
	@Override
	public void method11807(@OriginalArg(0) Class396 arg0) {
		super.method11807(arg0);
	}

	@OriginalMember(owner = "client!ahn", name = "j", descriptor = "()V")
	@Override
	public void method30834() {
		super.method30837();
	}

	@OriginalMember(owner = "client!ahn", name = "m", descriptor = "()V")
	@Override
	public void method30835() {
		super.method30837();
	}

	@OriginalMember(owner = "client!ahn", name = "o", descriptor = "()V")
	@Override
	public void method30836() {
		super.method30837();
	}

	@OriginalMember(owner = "client!ahn", name = "aw", descriptor = "()V")
	@Override
	public void method11817() {
		this.aClass102_Sub1_Sub2_9.method21579(this);
	}

	@OriginalMember(owner = "client!ahn", name = "bl", descriptor = "()V")
	@Override
	public void method11818() {
		this.aClass102_Sub1_Sub2_9.method21579(this);
	}

	@OriginalMember(owner = "client!ahn", name = "br", descriptor = "()V")
	@Override
	public void method11816() {
		this.aClass102_Sub1_Sub2_9.method21579(this);
	}

	@OriginalMember(owner = "client!ahn", name = "bn", descriptor = "()V")
	@Override
	public void method11819() {
		this.aClass102_Sub1_Sub2_9.method21579(this);
	}

	@OriginalMember(owner = "client!ahn", name = "ba", descriptor = "(Lclient!le;)V")
	@Override
	public void method11812(@OriginalArg(0) Class396 arg0) {
		super.method11807(arg0);
	}

	@OriginalMember(owner = "client!ahn", name = "be", descriptor = "()J")
	@Override
	long method11814() {
		return this.aLong51;
	}

	@OriginalMember(owner = "client!ahn", name = "bk", descriptor = "()J")
	@Override
	long method11806() {
		return this.aLong51;
	}
}
