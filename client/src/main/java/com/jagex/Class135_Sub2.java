package com.jagex;

import jagdx.IDirect3DDevice;
import jagdx.IUnknown;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aik")
public final class Class135_Sub2 extends Class135 {

	@OriginalMember(owner = "client!aik", name = "e", descriptor = "J")
	long aLong44 = 0L;

	@OriginalMember(owner = "client!aik", name = "f", descriptor = "Lclient!aqw;")
	Class102_Sub1_Sub2 aClass102_Sub1_Sub2_5;

	@OriginalMember(owner = "client!aik", name = "<init>", descriptor = "(Lclient!aqw;[Lclient!lf;)V")
	Class135_Sub2(@OriginalArg(0) Class102_Sub1_Sub2 arg0, @OriginalArg(1) Class397[] arg1) {
		super(arg1);
		this.aClass102_Sub1_Sub2_5 = arg0;
		@Pc(10) byte local10 = 0;
		@Pc(14) ByteBuffer local14 = this.aClass102_Sub1_Sub2_5.aByteBuffer7;
		local14.clear();
		for (@Pc(19) short local19 = 0; local19 < this.aClass397Array3.length; local19++) {
			@Pc(26) short local26 = 0;
			@Pc(31) Class397 local31 = this.aClass397Array3[local19];
			for (@Pc(33) int local33 = 0; local33 < local31.method28707(); local33++) {
				@Pc(41) Class400 local41 = local31.method28708(local33);
				if (local41 == Class400.aClass400_11) {
					this.method11103(local14, local19, local26, (byte) 2, (byte) 0, (byte) 0, (byte) 0);
				} else if (local41 == Class400.aClass400_2) {
					this.method11103(local14, local19, local26, (byte) 2, (byte) 0, (byte) 3, (byte) 0);
				} else if (local41 == Class400.aClass400_3) {
					this.method11103(local14, local19, local26, (byte) 4, (byte) 0, (byte) 10, (byte) 0);
				} else if (local41 == Class400.aClass400_4) {
					this.method11103(local14, local19, local26, (byte) 0, (byte) 0, (byte) 5, local10++);
				} else if (local41 == Class400.aClass400_1) {
					this.method11103(local14, local19, local26, (byte) 1, (byte) 0, (byte) 5, local10++);
				} else if (local41 == Class400.aClass400_5) {
					this.method11103(local14, local19, local26, (byte) 2, (byte) 0, (byte) 5, local10++);
				} else if (local41 == Class400.aClass400_6) {
					this.method11103(local14, local19, local26, (byte) 3, (byte) 0, (byte) 5, local10++);
				}
				local26 = (short) (local26 + local41.anInt4572);
			}
		}
		this.method11103(local14, (short) 255, (short) 0, (byte) 17, (byte) 0, (byte) 0, (byte) 0);
		this.aLong44 = IDirect3DDevice.CreateVertexDeclaration(this.aClass102_Sub1_Sub2_5.aLong173, this.aClass102_Sub1_Sub2_5.aLong168);
		this.aClass102_Sub1_Sub2_5.method21137(this);
	}

	@OriginalMember(owner = "client!aik", name = "g", descriptor = "(Ljava/nio/ByteBuffer;SSBBBB)V")
	void method11102(@OriginalArg(0) ByteBuffer arg0, @OriginalArg(1) short arg1, @OriginalArg(2) short arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) byte arg6) {
		arg0.putShort(arg1);
		arg0.putShort(arg2);
		arg0.put(arg3);
		arg0.put(arg4);
		arg0.put(arg5);
		arg0.put(arg6);
	}

	@OriginalMember(owner = "client!aik", name = "t", descriptor = "(Ljava/nio/ByteBuffer;SSBBBB)V")
	void method11103(@OriginalArg(0) ByteBuffer arg0, @OriginalArg(1) short arg1, @OriginalArg(2) short arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) byte arg6) {
		arg0.putShort(arg1);
		arg0.putShort(arg2);
		arg0.put(arg3);
		arg0.put(arg4);
		arg0.put(arg5);
		arg0.put(arg6);
	}

	@OriginalMember(owner = "client!aik", name = "e", descriptor = "()V")
	@Override
	public void method30837() {
		if (this.aLong44 != 0L) {
			IUnknown.Release(this.aLong44);
			this.aLong44 = 0L;
		}
		this.aClass102_Sub1_Sub2_5.method21133(this);
	}

	@OriginalMember(owner = "client!aik", name = "a", descriptor = "()V")
	void method11104() {
		if (this.aLong44 != 0L) {
			this.aClass102_Sub1_Sub2_5.method21556(this.aLong44);
			this.aLong44 = 0L;
		}
	}

	@OriginalMember(owner = "client!aik", name = "finalize", descriptor = "()V")
	@Override
	protected void finalize() {
		this.method11111();
	}

	@OriginalMember(owner = "client!aik", name = "m", descriptor = "()V")
	@Override
	public void method30835() {
		if (this.aLong44 != 0L) {
			IUnknown.Release(this.aLong44);
			this.aLong44 = 0L;
		}
		this.aClass102_Sub1_Sub2_5.method21133(this);
	}

	@OriginalMember(owner = "client!aik", name = "o", descriptor = "()V")
	@Override
	public void method30836() {
		if (this.aLong44 != 0L) {
			IUnknown.Release(this.aLong44);
			this.aLong44 = 0L;
		}
		this.aClass102_Sub1_Sub2_5.method21133(this);
	}

	@OriginalMember(owner = "client!aik", name = "j", descriptor = "()V")
	@Override
	public void method30834() {
		if (this.aLong44 != 0L) {
			IUnknown.Release(this.aLong44);
			this.aLong44 = 0L;
		}
		this.aClass102_Sub1_Sub2_5.method21133(this);
	}

	@OriginalMember(owner = "client!aik", name = "ht", descriptor = "()V")
	void method11105() {
		this.method11111();
	}

	@OriginalMember(owner = "client!aik", name = "u", descriptor = "(Ljava/nio/ByteBuffer;SSBBBB)V")
	void method11106(@OriginalArg(0) ByteBuffer arg0, @OriginalArg(1) short arg1, @OriginalArg(2) short arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) byte arg6) {
		arg0.putShort(arg1);
		arg0.putShort(arg2);
		arg0.put(arg3);
		arg0.put(arg4);
		arg0.put(arg5);
		arg0.put(arg6);
	}

	@OriginalMember(owner = "client!aik", name = "hj", descriptor = "()V")
	void method11107() {
		this.method11111();
	}

	@OriginalMember(owner = "client!aik", name = "l", descriptor = "(Ljava/nio/ByteBuffer;SSBBBB)V")
	void method11108(@OriginalArg(0) ByteBuffer arg0, @OriginalArg(1) short arg1, @OriginalArg(2) short arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) byte arg6) {
		arg0.putShort(arg1);
		arg0.putShort(arg2);
		arg0.put(arg3);
		arg0.put(arg4);
		arg0.put(arg5);
		arg0.put(arg6);
	}

	@OriginalMember(owner = "client!aik", name = "hy", descriptor = "()V")
	void method11109() {
		this.method11111();
	}

	@OriginalMember(owner = "client!aik", name = "i", descriptor = "()V")
	void method11110() {
		if (this.aLong44 != 0L) {
			this.aClass102_Sub1_Sub2_5.method21556(this.aLong44);
			this.aLong44 = 0L;
		}
	}

	@OriginalMember(owner = "client!aik", name = "f", descriptor = "()V")
	void method11111() {
		if (this.aLong44 != 0L) {
			this.aClass102_Sub1_Sub2_5.method21556(this.aLong44);
			this.aLong44 = 0L;
		}
	}
}
