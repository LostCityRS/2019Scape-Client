package com.jagex;

import jagdx.IDirect3DDevice;
import jagdx.IDirect3DSurface;
import jagdx.IDirect3DTexture;
import jagdx.IUnknown;
import jagdx.e;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aio")
public final class Class135_Sub3_Sub1 extends Class135_Sub3 implements Interface42 {

	@OriginalMember(owner = "client!aio", name = "<init>", descriptor = "(Lclient!aqd;Lclient!ck;Lclient!dg;II)V")
	Class135_Sub3_Sub1(@OriginalArg(0) Class104_Sub2_Sub1 arg0, @OriginalArg(1) Class206 arg1, @OriginalArg(2) Class226 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4, 1025, 0);
	}

	@OriginalMember(owner = "client!aio", name = "am", descriptor = "()F")
	@Override
	public float method11373() {
		return super.method11351();
	}

	@OriginalMember(owner = "client!aio", name = "ak", descriptor = "(I)Lclient!dp;")
	@Override
	public Interface18 method11381(@OriginalArg(0) int arg0) {
		return new Class456(this, arg0);
	}

	@OriginalMember(owner = "client!aio", name = "x", descriptor = "(F)F")
	@Override
	public float method11355(@OriginalArg(0) float arg0) {
		return super.method11341(arg0);
	}

	@OriginalMember(owner = "client!aio", name = "m", descriptor = "()V")
	@Override
	public void method31065() {
		super.method31065();
	}

	@OriginalMember(owner = "client!aio", name = "e", descriptor = "()I")
	@Override
	public int method11362() {
		return super.method11362();
	}

	@OriginalMember(owner = "client!aio", name = "n", descriptor = "()I")
	@Override
	public int method11340() {
		return super.method11340();
	}

	@OriginalMember(owner = "client!aio", name = "k", descriptor = "(F)F")
	@Override
	public float method11341(@OriginalArg(0) float arg0) {
		return super.method11341(arg0);
	}

	@OriginalMember(owner = "client!aio", name = "ao", descriptor = "(ZZ)V")
	@Override
	public void method11380(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		super.method11344(arg0, arg1);
	}

	@OriginalMember(owner = "client!aio", name = "w", descriptor = "()Z")
	@Override
	public boolean method11376() {
		return super.method11376();
	}

	@OriginalMember(owner = "client!aio", name = "h", descriptor = "(F)F")
	@Override
	public float method11357(@OriginalArg(0) float arg0) {
		return super.method11342(arg0);
	}

	@OriginalMember(owner = "client!aio", name = "z", descriptor = "(IIII[III)V")
	@Override
	public void method11345(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super.method11345(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!aio", name = "ac", descriptor = "(IIIIII)V")
	@Override
	public void method11367(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super.method11363(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!aio", name = "c", descriptor = "(IIII[I[II)V")
	@Override
	public void method11348(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6) {
		super.method11348(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!aio", name = "ae", descriptor = "(IIII[BLclient!ck;II)V")
	@Override
	public void method11343(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) Class206 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super.method11356(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!aio", name = "p", descriptor = "(IIII[BLclient!ck;II)V")
	@Override
	public void method11356(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) Class206 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super.method11356(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!aio", name = "o", descriptor = "()F")
	@Override
	public float method11351() {
		return super.method11351();
	}

	@OriginalMember(owner = "client!aio", name = "s", descriptor = "()Z")
	@Override
	public boolean method11422() {
		return super.method11422();
	}

	@OriginalMember(owner = "client!aio", name = "aj", descriptor = "()V")
	@Override
	public void method11412() {
		super.method11412();
	}

	@OriginalMember(owner = "client!aio", name = "ay", descriptor = "(Lclient!lt;)V")
	@Override
	public void method11414(@OriginalArg(0) Class405 arg0) {
		super.method11414(arg0);
	}

	@OriginalMember(owner = "client!aio", name = "u", descriptor = "()V")
	@Override
	public void method31066() {
		super.method31065();
	}

	@OriginalMember(owner = "client!aio", name = "y", descriptor = "()I")
	@Override
	public int method11353() {
		return super.method11362();
	}

	@OriginalMember(owner = "client!aio", name = "q", descriptor = "(F)F")
	@Override
	public float method11354(@OriginalArg(0) float arg0) {
		return super.method11341(arg0);
	}

	@OriginalMember(owner = "client!aio", name = "d", descriptor = "(IIII[II)V")
	@Override
	public void method11347(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5) {
		@Pc(4) long local4 = IDirect3DTexture.GetSurfaceLevel(this.aLong47, 0);
		@Pc(15) long local15 = IDirect3DDevice.CreateRenderTarget(this.aClass104_Sub2_Sub1_8.aLong121, arg2, arg3, 21, 0, 0, true);
		this.aClass104_Sub2_Sub1_8.method20901(arg3 * arg2 * 4);
		if (e.method27888(IDirect3DDevice.StretchRect(this.aClass104_Sub2_Sub1_8.aLong121, local4, arg0, arg1, arg2, arg3, local15, 0, 0, arg2, arg3, 1))) {
			IDirect3DSurface.Download(local15, 0, 0, arg2, arg3, arg2 * 4, 16, this.aClass104_Sub2_Sub1_8.aLong132);
			this.aClass104_Sub2_Sub1_8.aByteBuffer7.clear();
			this.aClass104_Sub2_Sub1_8.aByteBuffer7.asIntBuffer().get(arg4);
		}
		IUnknown.Release(local4);
		IUnknown.Release(local15);
	}

	@OriginalMember(owner = "client!aio", name = "b", descriptor = "(F)F")
	@Override
	public float method11350(@OriginalArg(0) float arg0) {
		return super.method11342(arg0);
	}

	@OriginalMember(owner = "client!aio", name = "ag", descriptor = "(IIII[II)V")
	@Override
	public void method11364(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5) {
		@Pc(4) long local4 = IDirect3DTexture.GetSurfaceLevel(this.aLong47, 0);
		@Pc(15) long local15 = IDirect3DDevice.CreateRenderTarget(this.aClass104_Sub2_Sub1_8.aLong121, arg2, arg3, 21, 0, 0, true);
		this.aClass104_Sub2_Sub1_8.method20901(arg3 * arg2 * 4);
		if (e.method27888(IDirect3DDevice.StretchRect(this.aClass104_Sub2_Sub1_8.aLong121, local4, arg0, arg1, arg2, arg3, local15, 0, 0, arg2, arg3, 1))) {
			IDirect3DSurface.Download(local15, 0, 0, arg2, arg3, arg2 * 4, 16, this.aClass104_Sub2_Sub1_8.aLong132);
			this.aClass104_Sub2_Sub1_8.aByteBuffer7.clear();
			this.aClass104_Sub2_Sub1_8.aByteBuffer7.asIntBuffer().get(arg4);
		}
		IUnknown.Release(local4);
		IUnknown.Release(local15);
	}

	@OriginalMember(owner = "client!aio", name = "a", descriptor = "(F)F")
	@Override
	public float method11358(@OriginalArg(0) float arg0) {
		return super.method11342(arg0);
	}

	@OriginalMember(owner = "client!aio", name = "g", descriptor = "(F)F")
	@Override
	public float method11339(@OriginalArg(0) float arg0) {
		return super.method11342(arg0);
	}

	@OriginalMember(owner = "client!aio", name = "i", descriptor = "()Z")
	@Override
	public boolean method11346() {
		return super.method11376();
	}

	@OriginalMember(owner = "client!aio", name = "f", descriptor = "(F)F")
	@Override
	public float method11342(@OriginalArg(0) float arg0) {
		return super.method11342(arg0);
	}

	@OriginalMember(owner = "client!aio", name = "t", descriptor = "(IIII[III)V")
	@Override
	public void method11360(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super.method11345(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!aio", name = "l", descriptor = "(ZZ)V")
	@Override
	public void method11344(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		super.method11344(arg0, arg1);
	}

	@OriginalMember(owner = "client!aio", name = "v", descriptor = "()F")
	@Override
	public float method11378() {
		return super.method11378();
	}

	@OriginalMember(owner = "client!aio", name = "ah", descriptor = "(IIII[I[II)V")
	@Override
	public void method11365(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6) {
		super.method11348(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!aio", name = "al", descriptor = "(IIII[I[II)V")
	@Override
	public void method11366(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6) {
		super.method11348(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!aio", name = "ai", descriptor = "()F")
	@Override
	public float method11368() {
		return super.method11378();
	}

	@OriginalMember(owner = "client!aio", name = "aw", descriptor = "()F")
	@Override
	public float method11369() {
		return super.method11378();
	}

	@OriginalMember(owner = "client!aio", name = "as", descriptor = "()F")
	@Override
	public float method11370() {
		return super.method11378();
	}

	@OriginalMember(owner = "client!aio", name = "at", descriptor = "()F")
	@Override
	public float method11371() {
		return super.method11351();
	}

	@OriginalMember(owner = "client!aio", name = "ad", descriptor = "()F")
	@Override
	public float method11372() {
		return super.method11351();
	}

	@OriginalMember(owner = "client!aio", name = "ax", descriptor = "()I")
	@Override
	public int method11359() {
		return super.method11340();
	}

	@OriginalMember(owner = "client!aio", name = "au", descriptor = "()Z")
	@Override
	public boolean method11430() {
		return super.method11422();
	}

	@OriginalMember(owner = "client!aio", name = "j", descriptor = "()Z")
	@Override
	public boolean method11361() {
		return super.method11376();
	}

	@OriginalMember(owner = "client!aio", name = "ap", descriptor = "()Z")
	@Override
	public boolean method11431() {
		return super.method11422();
	}

	@OriginalMember(owner = "client!aio", name = "ab", descriptor = "(Lclient!lt;)V")
	@Override
	public void method11415(@OriginalArg(0) Class405 arg0) {
		super.method11414(arg0);
	}

	@OriginalMember(owner = "client!aio", name = "az", descriptor = "(Lclient!lt;)V")
	@Override
	public void method11416(@OriginalArg(0) Class405 arg0) {
		super.method11414(arg0);
	}

	@OriginalMember(owner = "client!aio", name = "an", descriptor = "(I)Lclient!dp;")
	@Override
	public Interface18 method11382(@OriginalArg(0) int arg0) {
		return new Class456(this, arg0);
	}

	@OriginalMember(owner = "client!aio", name = "bf", descriptor = "(I)Lclient!dp;")
	@Override
	public Interface18 method11383(@OriginalArg(0) int arg0) {
		return new Class456(this, arg0);
	}

	@OriginalMember(owner = "client!aio", name = "aq", descriptor = "()I")
	@Override
	public int method11377() {
		return super.method11340();
	}

	@OriginalMember(owner = "client!aio", name = "ar", descriptor = "()Z")
	@Override
	public boolean method11423() {
		return super.method11422();
	}

	@OriginalMember(owner = "client!aio", name = "r", descriptor = "(IIIIII)V")
	@Override
	public void method11363(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super.method11363(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!aio", name = "av", descriptor = "(ZZ)V")
	@Override
	public void method11379(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		super.method11344(arg0, arg1);
	}

	@OriginalMember(owner = "client!aio", name = "aa", descriptor = "()V")
	@Override
	public void method11417() {
		super.method11412();
	}

	@OriginalMember(owner = "client!aio", name = "af", descriptor = "()V")
	@Override
	public void method11411() {
		super.method11412();
	}
}
