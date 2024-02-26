package com.jagex;

import jagdx.IDirect3DCubeTexture;
import jagdx.IDirect3DDevice;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aiw")
public final class Class128_Sub3 extends Class128 implements Interface42 {

	@OriginalMember(owner = "client!aiw", name = "g", descriptor = "I")
	final int anInt1347;

	@OriginalMember(owner = "client!aiw", name = "<init>", descriptor = "(Lclient!aqw;IZ[[I)V")
	Class128_Sub3(@OriginalArg(0) Class102_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, Class210.aClass210_24, Class236.aClass236_21, arg2 && arg0.aBoolean547, arg1 * arg1 * 6);
		this.anInt1347 = arg1;
		if (this.aBoolean248) {
			this.aLong51 = IDirect3DDevice.CreateCubeTexture(this.aClass102_Sub1_Sub2_9.aLong173, this.anInt1347, 0, 1024, 21, 1);
		} else {
			this.aLong51 = IDirect3DDevice.CreateCubeTexture(this.aClass102_Sub1_Sub2_9.aLong173, this.anInt1347, 1, 0, 21, 1);
		}
		@Pc(52) ByteBuffer local52 = this.aClass102_Sub1_Sub2_9.aByteBuffer7;
		this.aClass102_Sub1_Sub2_9.method21292(this.anInt1347 * this.anInt1347 * 4);
		for (@Pc(64) int local64 = 0; local64 < 6; local64++) {
			local52.clear();
			local52.asIntBuffer().put(arg3[local64]);
			IDirect3DCubeTexture.Upload(this.aLong51, local64, 0, 0, 0, this.anInt1347, this.anInt1347, this.anInt1347 * 4, 0, this.aClass102_Sub1_Sub2_9.aLong168);
		}
	}

	@OriginalMember(owner = "client!aiw", name = "ba", descriptor = "(Lclient!le;)V")
	@Override
	public void method11812(@OriginalArg(0) Class396 arg0) {
		super.method11807(arg0);
	}

	@OriginalMember(owner = "client!aiw", name = "aw", descriptor = "()V")
	@Override
	public void method11817() {
		this.aClass102_Sub1_Sub2_9.method21543(this);
	}

	@OriginalMember(owner = "client!aiw", name = "e", descriptor = "()V")
	@Override
	public void method30837() {
		super.method30837();
	}

	@OriginalMember(owner = "client!aiw", name = "bl", descriptor = "()V")
	@Override
	public void method11818() {
		this.aClass102_Sub1_Sub2_9.method21543(this);
	}

	@OriginalMember(owner = "client!aiw", name = "m", descriptor = "()V")
	@Override
	public void method30835() {
		super.method30837();
	}

	@OriginalMember(owner = "client!aiw", name = "o", descriptor = "()V")
	@Override
	public void method30836() {
		super.method30837();
	}

	@OriginalMember(owner = "client!aiw", name = "j", descriptor = "()V")
	@Override
	public void method30834() {
		super.method30837();
	}

	@OriginalMember(owner = "client!aiw", name = "bg", descriptor = "(Lclient!le;)V")
	@Override
	public void method11807(@OriginalArg(0) Class396 arg0) {
		super.method11807(arg0);
	}

	@OriginalMember(owner = "client!aiw", name = "br", descriptor = "()V")
	@Override
	public void method11816() {
		this.aClass102_Sub1_Sub2_9.method21543(this);
	}

	@OriginalMember(owner = "client!aiw", name = "bn", descriptor = "()V")
	@Override
	public void method11819() {
		this.aClass102_Sub1_Sub2_9.method21543(this);
	}
}
