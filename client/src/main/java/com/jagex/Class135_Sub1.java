package com.jagex;

import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVolumeTexture;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ahy")
public final class Class135_Sub1 extends Class135 implements Interface35 {

	@OriginalMember(owner = "client!ahy", name = "w", descriptor = "I")
	final int anInt1171;

	@OriginalMember(owner = "client!ahy", name = "l", descriptor = "I")
	final int anInt1172;

	@OriginalMember(owner = "client!ahy", name = "u", descriptor = "I")
	final int anInt1173;

	@OriginalMember(owner = "client!ahy", name = "<init>", descriptor = "(Lclient!aqd;Lclient!ck;IIIZ[B)V")
	Class135_Sub1(@OriginalArg(0) Class104_Sub2_Sub1 arg0, @OriginalArg(1) Class206 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6) {
		super(arg0, arg1, Class226.aClass226_22, false, arg2 * arg3 * arg4);
		this.anInt1171 = arg2;
		this.anInt1172 = arg3;
		this.anInt1173 = arg4;
		this.aLong47 = IDirect3DDevice.CreateVolumeTexture(this.aClass104_Sub2_Sub1_8.aLong121, arg2, arg3, arg4, 1, 0, Class104_Sub2_Sub1.method19546(arg1, this.aClass226_15), 1);
		this.aClass104_Sub2_Sub1_8.method20901(this.anInt1171 * this.anInt1172 * arg1.anInt3389 * -1639868421);
		@Pc(52) ByteBuffer local52 = this.aClass104_Sub2_Sub1_8.aByteBuffer7;
		local52.clear();
		local52.put(arg6);
		IDirect3DVolumeTexture.Upload(this.aLong47, 0, 0, 0, 0, this.anInt1171, this.anInt1172, this.anInt1173, this.anInt1171 * arg1.anInt3389 * -1639868421, 0, this.aClass104_Sub2_Sub1_8.aLong132);
	}

	@OriginalMember(owner = "client!ahy", name = "ab", descriptor = "(Lclient!lt;)V")
	@Override
	public void method11415(@OriginalArg(0) Class405 arg0) {
		super.method11414(arg0);
	}

	@OriginalMember(owner = "client!ahy", name = "m", descriptor = "()V")
	@Override
	public void method31065() {
		super.method31065();
	}

	@OriginalMember(owner = "client!ahy", name = "aj", descriptor = "()V")
	@Override
	public void method11412() {
		this.aClass104_Sub2_Sub1_8.method19538(this);
	}

	@OriginalMember(owner = "client!ahy", name = "az", descriptor = "(Lclient!lt;)V")
	@Override
	public void method11416(@OriginalArg(0) Class405 arg0) {
		super.method11414(arg0);
	}

	@OriginalMember(owner = "client!ahy", name = "u", descriptor = "()V")
	@Override
	public void method31066() {
		super.method31065();
	}

	@OriginalMember(owner = "client!ahy", name = "bl", descriptor = "()J")
	@Override
	long method11329() {
		return this.aLong47;
	}

	@OriginalMember(owner = "client!ahy", name = "ay", descriptor = "(Lclient!lt;)V")
	@Override
	public void method11414(@OriginalArg(0) Class405 arg0) {
		super.method11414(arg0);
	}

	@OriginalMember(owner = "client!ahy", name = "bh", descriptor = "()J")
	@Override
	long method11335() {
		return this.aLong47;
	}

	@OriginalMember(owner = "client!ahy", name = "aa", descriptor = "()V")
	@Override
	public void method11417() {
		this.aClass104_Sub2_Sub1_8.method19538(this);
	}

	@OriginalMember(owner = "client!ahy", name = "af", descriptor = "()V")
	@Override
	public void method11411() {
		this.aClass104_Sub2_Sub1_8.method19538(this);
	}
}
