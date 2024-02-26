package com.jagex;

import jagdx.IDirect3DDevice;
import jagdx.IDirect3DSurface;
import jagdx.IDirect3DTexture;
import jagdx.IUnknown;
import jagdx.t;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ais")
public final class Class128_Sub2_Sub1 extends Class128_Sub2 implements Interface40 {

	@OriginalMember(owner = "client!ais", name = "<init>", descriptor = "(Lclient!aqw;Lclient!co;Lclient!dy;II)V")
	Class128_Sub2_Sub1(@OriginalArg(0) Class102_Sub1_Sub2 arg0, @OriginalArg(1) Class210 arg1, @OriginalArg(2) Class236 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4, 1025, 0);
	}

	@OriginalMember(owner = "client!ais", name = "d", descriptor = "()I")
	@Override
	public int method11664() {
		return super.method11688();
	}

	@OriginalMember(owner = "client!ais", name = "bt", descriptor = "(I)Lclient!do;")
	@Override
	public Interface18 method11698(@OriginalArg(0) int arg0) {
		return new Class462(this, arg0);
	}

	@OriginalMember(owner = "client!ais", name = "k", descriptor = "(IIII[II)V")
	@Override
	public void method11659(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5) {
		@Pc(4) long local4 = IDirect3DTexture.GetSurfaceLevel(this.aLong51, 0);
		@Pc(15) long local15 = IDirect3DDevice.CreateRenderTarget(this.aClass102_Sub1_Sub2_9.aLong173, arg2, arg3, 21, 0, 0, true);
		this.aClass102_Sub1_Sub2_9.method21292(arg3 * arg2 * 4);
		if (t.f(IDirect3DDevice.StretchRect(this.aClass102_Sub1_Sub2_9.aLong173, local4, arg0, arg1, arg2, arg3, local15, 0, 0, arg2, arg3, 1))) {
			IDirect3DSurface.Download(local15, 0, 0, arg2, arg3, arg2 * 4, 16, this.aClass102_Sub1_Sub2_9.aLong168);
			this.aClass102_Sub1_Sub2_9.aByteBuffer7.clear();
			this.aClass102_Sub1_Sub2_9.aByteBuffer7.asIntBuffer().get(arg4);
		}
		IUnknown.Release(local4);
		IUnknown.Release(local15);
	}

	@OriginalMember(owner = "client!ais", name = "e", descriptor = "()V")
	@Override
	public void method30837() {
		super.method30837();
	}

	@OriginalMember(owner = "client!ais", name = "t", descriptor = "()I")
	@Override
	public int method11688() {
		return super.method11688();
	}

	@OriginalMember(owner = "client!ais", name = "f", descriptor = "()I")
	@Override
	public int method11652() {
		return super.method11652();
	}

	@OriginalMember(owner = "client!ais", name = "u", descriptor = "(F)F")
	@Override
	public float method11653(@OriginalArg(0) float arg0) {
		return super.method11653(arg0);
	}

	@OriginalMember(owner = "client!ais", name = "l", descriptor = "(F)F")
	@Override
	public float method11667(@OriginalArg(0) float arg0) {
		return super.method11667(arg0);
	}

	@OriginalMember(owner = "client!ais", name = "g", descriptor = "()Z")
	@Override
	public boolean method11655() {
		return super.method11655();
	}

	@OriginalMember(owner = "client!ais", name = "i", descriptor = "(ZZ)V")
	@Override
	public void method11656(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		super.method11656(arg0, arg1);
	}

	@OriginalMember(owner = "client!ais", name = "a", descriptor = "(IIII[III)V")
	@Override
	public void method11665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super.method11665(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!ais", name = "y", descriptor = "(F)F")
	@Override
	public float method11681(@OriginalArg(0) float arg0) {
		return super.method11667(arg0);
	}

	@OriginalMember(owner = "client!ais", name = "r", descriptor = "()F")
	@Override
	public float method11662() {
		return super.method11662();
	}

	@OriginalMember(owner = "client!ais", name = "w", descriptor = "(IIIIII)V")
	@Override
	public void method11661(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super.method11661(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!ais", name = "ah", descriptor = "(IIII[II)V")
	@Override
	public void method11654(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5) {
		@Pc(4) long local4 = IDirect3DTexture.GetSurfaceLevel(this.aLong51, 0);
		@Pc(15) long local15 = IDirect3DDevice.CreateRenderTarget(this.aClass102_Sub1_Sub2_9.aLong173, arg2, arg3, 21, 0, 0, true);
		this.aClass102_Sub1_Sub2_9.method21292(arg3 * arg2 * 4);
		if (t.f(IDirect3DDevice.StretchRect(this.aClass102_Sub1_Sub2_9.aLong173, local4, arg0, arg1, arg2, arg3, local15, 0, 0, arg2, arg3, 1))) {
			IDirect3DSurface.Download(local15, 0, 0, arg2, arg3, arg2 * 4, 16, this.aClass102_Sub1_Sub2_9.aLong168);
			this.aClass102_Sub1_Sub2_9.aByteBuffer7.clear();
			this.aClass102_Sub1_Sub2_9.aByteBuffer7.asIntBuffer().get(arg4);
		}
		IUnknown.Release(local4);
		IUnknown.Release(local15);
	}

	@OriginalMember(owner = "client!ais", name = "q", descriptor = "()F")
	@Override
	public float method11663() {
		return super.method11663();
	}

	@OriginalMember(owner = "client!ais", name = "h", descriptor = "()Z")
	@Override
	public boolean method11713() {
		return super.method11713();
	}

	@OriginalMember(owner = "client!ais", name = "aw", descriptor = "()V")
	@Override
	public void method11817() {
		super.method11817();
	}

	@OriginalMember(owner = "client!ais", name = "bg", descriptor = "(Lclient!le;)V")
	@Override
	public void method11807(@OriginalArg(0) Class396 arg0) {
		super.method11807(arg0);
	}

	@OriginalMember(owner = "client!ais", name = "m", descriptor = "()V")
	@Override
	public void method30835() {
		super.method30837();
	}

	@OriginalMember(owner = "client!ais", name = "o", descriptor = "()V")
	@Override
	public void method30836() {
		super.method30837();
	}

	@OriginalMember(owner = "client!ais", name = "br", descriptor = "()V")
	@Override
	public void method11816() {
		super.method11817();
	}

	@OriginalMember(owner = "client!ais", name = "n", descriptor = "()Z")
	@Override
	public boolean method11670() {
		return super.method11655();
	}

	@OriginalMember(owner = "client!ais", name = "z", descriptor = "(F)F")
	@Override
	public float method11666(@OriginalArg(0) float arg0) {
		return super.method11653(arg0);
	}

	@OriginalMember(owner = "client!ais", name = "p", descriptor = "(F)F")
	@Override
	public float method11682(@OriginalArg(0) float arg0) {
		return super.method11653(arg0);
	}

	@OriginalMember(owner = "client!ais", name = "v", descriptor = "(F)F")
	@Override
	public float method11678(@OriginalArg(0) float arg0) {
		return super.method11667(arg0);
	}

	@OriginalMember(owner = "client!ais", name = "j", descriptor = "()V")
	@Override
	public void method30834() {
		super.method30837();
	}

	@OriginalMember(owner = "client!ais", name = "x", descriptor = "(IIII[I[II)V")
	@Override
	public void method11660(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6) {
		super.method11660(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!ais", name = "ba", descriptor = "(Lclient!le;)V")
	@Override
	public void method11812(@OriginalArg(0) Class396 arg0) {
		super.method11807(arg0);
	}

	@OriginalMember(owner = "client!ais", name = "b", descriptor = "()Z")
	@Override
	public boolean method11672() {
		return super.method11655();
	}

	@OriginalMember(owner = "client!ais", name = "ax", descriptor = "(ZZ)V")
	@Override
	public void method11693(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		super.method11656(arg0, arg1);
	}

	@OriginalMember(owner = "client!ais", name = "ay", descriptor = "(ZZ)V")
	@Override
	public void method11658(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		super.method11656(arg0, arg1);
	}

	@OriginalMember(owner = "client!ais", name = "av", descriptor = "()F")
	@Override
	public float method11690() {
		return super.method11662();
	}

	@OriginalMember(owner = "client!ais", name = "aq", descriptor = "(IIII[III)V")
	@Override
	public void method11651(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super.method11665(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!ais", name = "ao", descriptor = "(IIII[III)V")
	@Override
	public void method11677(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super.method11665(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!ais", name = "aj", descriptor = "(IIII[BLclient!co;II)V")
	@Override
	public void method11673(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) Class210 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super.method11669(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!ais", name = "ac", descriptor = "(IIII[BLclient!co;II)V")
	@Override
	public void method11679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) Class210 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super.method11669(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!ais", name = "ag", descriptor = "(IIII[II)V")
	@Override
	public void method11689(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5) {
		@Pc(4) long local4 = IDirect3DTexture.GetSurfaceLevel(this.aLong51, 0);
		@Pc(15) long local15 = IDirect3DDevice.CreateRenderTarget(this.aClass102_Sub1_Sub2_9.aLong173, arg2, arg3, 21, 0, 0, true);
		this.aClass102_Sub1_Sub2_9.method21292(arg3 * arg2 * 4);
		if (t.f(IDirect3DDevice.StretchRect(this.aClass102_Sub1_Sub2_9.aLong173, local4, arg0, arg1, arg2, arg3, local15, 0, 0, arg2, arg3, 1))) {
			IDirect3DSurface.Download(local15, 0, 0, arg2, arg3, arg2 * 4, 16, this.aClass102_Sub1_Sub2_9.aLong168);
			this.aClass102_Sub1_Sub2_9.aByteBuffer7.clear();
			this.aClass102_Sub1_Sub2_9.aByteBuffer7.asIntBuffer().get(arg4);
		}
		IUnknown.Release(local4);
		IUnknown.Release(local15);
	}

	@OriginalMember(owner = "client!ais", name = "as", descriptor = "()F")
	@Override
	public float method11697() {
		return super.method11663();
	}

	@OriginalMember(owner = "client!ais", name = "ab", descriptor = "(IIII[II)V")
	@Override
	public void method11668(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5) {
		@Pc(4) long local4 = IDirect3DTexture.GetSurfaceLevel(this.aLong51, 0);
		@Pc(15) long local15 = IDirect3DDevice.CreateRenderTarget(this.aClass102_Sub1_Sub2_9.aLong173, arg2, arg3, 21, 0, 0, true);
		this.aClass102_Sub1_Sub2_9.method21292(arg3 * arg2 * 4);
		if (t.f(IDirect3DDevice.StretchRect(this.aClass102_Sub1_Sub2_9.aLong173, local4, arg0, arg1, arg2, arg3, local15, 0, 0, arg2, arg3, 1))) {
			IDirect3DSurface.Download(local15, 0, 0, arg2, arg3, arg2 * 4, 16, this.aClass102_Sub1_Sub2_9.aLong168);
			this.aClass102_Sub1_Sub2_9.aByteBuffer7.clear();
			this.aClass102_Sub1_Sub2_9.aByteBuffer7.asIntBuffer().get(arg4);
		}
		IUnknown.Release(local4);
		IUnknown.Release(local15);
	}

	@OriginalMember(owner = "client!ais", name = "bs", descriptor = "(I)Lclient!do;")
	@Override
	public Interface18 method11699(@OriginalArg(0) int arg0) {
		return new Class462(this, arg0);
	}

	@OriginalMember(owner = "client!ais", name = "am", descriptor = "(IIII[I[II)V")
	@Override
	public void method11685(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6) {
		super.method11660(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!ais", name = "ak", descriptor = "(IIII[I[II)V")
	@Override
	public void method11686(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6) {
		super.method11660(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!ais", name = "at", descriptor = "(IIII[I[II)V")
	@Override
	public void method11683(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6) {
		super.method11660(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!ais", name = "al", descriptor = "(IIII[II)V")
	@Override
	public void method11680(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5) {
		@Pc(4) long local4 = IDirect3DTexture.GetSurfaceLevel(this.aLong51, 0);
		@Pc(15) long local15 = IDirect3DDevice.CreateRenderTarget(this.aClass102_Sub1_Sub2_9.aLong173, arg2, arg3, 21, 0, 0, true);
		this.aClass102_Sub1_Sub2_9.method21292(arg3 * arg2 * 4);
		if (t.f(IDirect3DDevice.StretchRect(this.aClass102_Sub1_Sub2_9.aLong173, local4, arg0, arg1, arg2, arg3, local15, 0, 0, arg2, arg3, 1))) {
			IDirect3DSurface.Download(local15, 0, 0, arg2, arg3, arg2 * 4, 16, this.aClass102_Sub1_Sub2_9.aLong168);
			this.aClass102_Sub1_Sub2_9.aByteBuffer7.clear();
			this.aClass102_Sub1_Sub2_9.aByteBuffer7.asIntBuffer().get(arg4);
		}
		IUnknown.Release(local4);
		IUnknown.Release(local15);
	}

	@OriginalMember(owner = "client!ais", name = "c", descriptor = "()Z")
	@Override
	public boolean method11671() {
		return super.method11655();
	}

	@OriginalMember(owner = "client!ais", name = "an", descriptor = "()Z")
	@Override
	public boolean method11724() {
		return super.method11713();
	}

	@OriginalMember(owner = "client!ais", name = "aa", descriptor = "()Z")
	@Override
	public boolean method11725() {
		return super.method11713();
	}

	@OriginalMember(owner = "client!ais", name = "bl", descriptor = "()V")
	@Override
	public void method11818() {
		super.method11817();
	}

	@OriginalMember(owner = "client!ais", name = "bj", descriptor = "(I)Lclient!do;")
	@Override
	public Interface18 method11700(@OriginalArg(0) int arg0) {
		return new Class462(this, arg0);
	}

	@OriginalMember(owner = "client!ais", name = "bn", descriptor = "()V")
	@Override
	public void method11819() {
		super.method11817();
	}

	@OriginalMember(owner = "client!ais", name = "s", descriptor = "(IIII[BLclient!co;II)V")
	@Override
	public void method11669(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) Class210 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super.method11669(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!ais", name = "ad", descriptor = "(IIIIII)V")
	@Override
	public void method11674(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super.method11661(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!ais", name = "af", descriptor = "(IIII[I[II)V")
	@Override
	public void method11684(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6) {
		super.method11660(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@OriginalMember(owner = "client!ais", name = "au", descriptor = "()F")
	@Override
	public float method11695() {
		return super.method11663();
	}

	@OriginalMember(owner = "client!ais", name = "ar", descriptor = "()I")
	@Override
	public int method11694() {
		return super.method11652();
	}

	@OriginalMember(owner = "client!ais", name = "ap", descriptor = "()I")
	@Override
	public int method11676() {
		return super.method11652();
	}

	@OriginalMember(owner = "client!ais", name = "by", descriptor = "(I)Lclient!do;")
	@Override
	public Interface18 method11701(@OriginalArg(0) int arg0) {
		return new Class462(this, arg0);
	}

	@OriginalMember(owner = "client!ais", name = "ai", descriptor = "(ZZ)V")
	@Override
	public void method11675(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		super.method11656(arg0, arg1);
	}

	@OriginalMember(owner = "client!ais", name = "az", descriptor = "()F")
	@Override
	public float method11696() {
		return super.method11663();
	}

	@OriginalMember(owner = "client!ais", name = "ae", descriptor = "()I")
	@Override
	public int method11692() {
		return super.method11652();
	}
}
