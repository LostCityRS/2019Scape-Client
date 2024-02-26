package com.jagex;

import jagdx.IDirect3DDevice;
import jagdx.IDirect3DTexture;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aiy")
public class Class128_Sub2 extends Class128 implements Interface34 {

	@OriginalMember(owner = "client!aiy", name = "j", descriptor = "Z")
	boolean aBoolean245;

	@OriginalMember(owner = "client!aiy", name = "a", descriptor = "Z")
	boolean aBoolean246;

	@OriginalMember(owner = "client!aiy", name = "g", descriptor = "I")
	final int anInt1321;

	@OriginalMember(owner = "client!aiy", name = "i", descriptor = "I")
	final int anInt1320;

	@OriginalMember(owner = "client!aiy", name = "m", descriptor = "F")
	final float aFloat137;

	@OriginalMember(owner = "client!aiy", name = "o", descriptor = "F")
	final float aFloat138;

	@OriginalMember(owner = "client!aiy", name = "<init>", descriptor = "(Lclient!aqw;Lclient!co;Lclient!dy;IIII)V")
	Class128_Sub2(@OriginalArg(0) Class102_Sub1_Sub2 arg0, @OriginalArg(1) Class210 arg1, @OriginalArg(2) Class236 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, arg1, arg2, false, arg3 * arg4);
		if (this.aClass102_Sub1_Sub2_9.aBoolean540) {
			this.anInt1321 = arg3;
			this.anInt1320 = arg4;
			this.aFloat137 = 1.0F;
			this.aFloat138 = 1.0F;
		} else {
			this.anInt1321 = Class700.method37081(arg3, (byte) 9);
			this.anInt1320 = Class700.method37081(arg4, (byte) 9);
			this.aFloat137 = (float) arg3 / (float) this.anInt1321;
			this.aFloat138 = (float) arg4 / (float) this.anInt1320;
		}
		this.aLong51 = IDirect3DDevice.CreateTexture(this.aClass102_Sub1_Sub2_9.aLong173, this.anInt1321, this.anInt1320, 0, arg5, Class102_Sub1_Sub2.method21553(this.aClass210_15, this.aClass236_16), arg6);
	}

	@OriginalMember(owner = "client!aiy", name = "<init>", descriptor = "(Lclient!aqw;IIZ[III)V")
	Class128_Sub2(@OriginalArg(0) Class102_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg0, Class210.aClass210_24, Class236.aClass236_21, arg3 && arg0.aBoolean541, arg1 * arg2);
		if (this.aClass102_Sub1_Sub2_9.aBoolean540) {
			this.anInt1321 = arg1;
			this.anInt1320 = arg2;
			this.aFloat137 = 1.0F;
			this.aFloat138 = 1.0F;
		} else {
			this.anInt1321 = Class700.method37081(arg1, (byte) 9);
			this.anInt1320 = Class700.method37081(arg2, (byte) 9);
			this.aFloat137 = (float) arg1 / (float) this.anInt1321;
			this.aFloat138 = (float) arg2 / (float) this.anInt1320;
			if (arg1 != this.anInt1321 || arg2 != this.anInt1320) {
				arg4 = this.aClass102_Sub1_Sub2_9.method20820(arg1, arg2, this.anInt1321, this.anInt1320, arg4, arg5, arg6, -1270512257);
				arg5 = 0;
				arg6 = this.anInt1321;
			}
		}
		if (arg3) {
			this.aLong51 = IDirect3DDevice.CreateTexture(this.aClass102_Sub1_Sub2_9.aLong173, this.anInt1321, this.anInt1320, 0, 1024, 21, 1);
		} else {
			this.aLong51 = IDirect3DDevice.CreateTexture(this.aClass102_Sub1_Sub2_9.aLong173, this.anInt1321, this.anInt1320, 1, 0, 21, 1);
		}
		if (arg6 == 0) {
			arg6 = this.anInt1321;
		}
		this.aClass102_Sub1_Sub2_9.method21292(arg6 * this.anInt1320 * this.aClass210_15.anInt3600 * 499559879);
		@Pc(138) ByteBuffer local138 = this.aClass102_Sub1_Sub2_9.aByteBuffer7;
		local138.clear();
		local138.asIntBuffer().put(arg4, arg5, arg6 * this.anInt1320);
		IDirect3DTexture.Upload(this.aLong51, 0, 0, 0, this.anInt1321, this.anInt1320, arg6 * this.aClass210_15.anInt3600 * 499559879, 0, this.aClass102_Sub1_Sub2_9.aLong168);
	}

	@OriginalMember(owner = "client!aiy", name = "<init>", descriptor = "(Lclient!aqw;Lclient!co;IIZ[FII)V")
	Class128_Sub2(@OriginalArg(0) Class102_Sub1_Sub2 arg0, @OriginalArg(1) Class210 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, Class236.aClass236_21, arg4 && arg0.aBoolean541, arg2 * arg3);
		if (this.aClass102_Sub1_Sub2_9.aBoolean540) {
			this.anInt1321 = arg2;
			this.anInt1320 = arg3;
			this.aFloat137 = 1.0F;
			this.aFloat138 = 1.0F;
		} else {
			this.anInt1321 = Class700.method37081(arg2, (byte) 9);
			this.anInt1320 = Class700.method37081(arg3, (byte) 9);
			this.aFloat137 = (float) arg2 / (float) this.anInt1321;
			this.aFloat138 = (float) arg3 / (float) this.anInt1320;
			if (arg2 != this.anInt1321 || arg3 != this.anInt1320) {
				arg5 = this.aClass102_Sub1_Sub2_9.method20793(arg2, arg3, this.anInt1321, this.anInt1320, arg5, arg6, arg7, arg1.anInt3600 * 499559879, 1539876680);
				arg6 = 0;
				arg7 = this.anInt1321;
			}
		}
		if (arg4) {
			this.aLong51 = IDirect3DDevice.CreateTexture(this.aClass102_Sub1_Sub2_9.aLong173, this.anInt1321, this.anInt1320, 0, 1024, Class102_Sub1_Sub2.method21553(this.aClass210_15, Class236.aClass236_26), 1);
		} else {
			this.aLong51 = IDirect3DDevice.CreateTexture(this.aClass102_Sub1_Sub2_9.aLong173, this.anInt1321, this.anInt1320, 1, 0, Class102_Sub1_Sub2.method21553(this.aClass210_15, Class236.aClass236_26), 1);
		}
		if (arg7 == 0) {
			arg7 = this.anInt1321;
		}
		this.aClass102_Sub1_Sub2_9.method21292(arg7 * this.anInt1320 * this.aClass210_15.anInt3600 * 499559879 * 4);
		@Pc(150) ByteBuffer local150 = this.aClass102_Sub1_Sub2_9.aByteBuffer7;
		local150.clear();
		local150.asFloatBuffer().put(arg5, arg6, arg7 * this.anInt1320 * this.aClass210_15.anInt3600 * 499559879);
		IDirect3DTexture.Upload(this.aLong51, 0, 0, 0, this.anInt1321, this.anInt1320, arg7 * this.aClass210_15.anInt3600 * 499559879 * 4, 0, this.aClass102_Sub1_Sub2_9.aLong168);
	}

	@OriginalMember(owner = "client!aiy", name = "<init>", descriptor = "(Lclient!aqw;Lclient!co;Lclient!dy;II)V")
	Class128_Sub2(@OriginalArg(0) Class102_Sub1_Sub2 arg0, @OriginalArg(1) Class210 arg1, @OriginalArg(2) Class236 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this(arg0, arg1, arg2, arg3, arg4, 0, 1);
	}

	@OriginalMember(owner = "client!aiy", name = "<init>", descriptor = "(Lclient!aqw;Lclient!co;IIZ[BII)V")
	Class128_Sub2(@OriginalArg(0) Class102_Sub1_Sub2 arg0, @OriginalArg(1) Class210 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, Class236.aClass236_21, arg4 && arg0.aBoolean541, arg2 * arg3);
		if (this.aClass102_Sub1_Sub2_9.aBoolean540) {
			this.anInt1321 = arg2;
			this.anInt1320 = arg3;
			this.aFloat137 = 1.0F;
			this.aFloat138 = 1.0F;
		} else {
			this.anInt1321 = Class700.method37081(arg2, (byte) 9);
			this.anInt1320 = Class700.method37081(arg3, (byte) 9);
			this.aFloat137 = (float) arg2 / (float) this.anInt1321;
			this.aFloat138 = (float) arg3 / (float) this.anInt1320;
			if (arg2 != this.anInt1321 || arg3 != this.anInt1320) {
				arg5 = this.aClass102_Sub1_Sub2_9.method20794(arg2, arg3, this.anInt1321, this.anInt1320, arg5, arg6, arg7, arg1.anInt3600 * 499559879, (byte) -20);
				arg6 = 0;
				arg7 = this.anInt1321;
			}
		}
		if (arg4) {
			this.aLong51 = IDirect3DDevice.CreateTexture(this.aClass102_Sub1_Sub2_9.aLong173, this.anInt1321, this.anInt1320, 0, 1024, Class102_Sub1_Sub2.method21553(this.aClass210_15, Class236.aClass236_21), 1);
		} else {
			this.aLong51 = IDirect3DDevice.CreateTexture(this.aClass102_Sub1_Sub2_9.aLong173, this.anInt1321, this.anInt1320, 1, 0, Class102_Sub1_Sub2.method21553(this.aClass210_15, Class236.aClass236_21), 1);
		}
		if (arg7 == 0) {
			arg7 = this.anInt1321;
		}
		this.aClass102_Sub1_Sub2_9.method21292(arg7 * this.anInt1320 * this.aClass210_15.anInt3600 * 499559879);
		@Pc(148) ByteBuffer local148 = this.aClass102_Sub1_Sub2_9.aByteBuffer7;
		local148.clear();
		if (this.aClass210_15 == Class210.aClass210_18) {
			local148.put(arg5, arg6, this.anInt1320 * this.anInt1321 / 2);
			IDirect3DTexture.Upload(this.aLong51, 0, 0, 0, this.anInt1321, this.anInt1320 / 4, this.anInt1321 / 4 * 8, 0, this.aClass102_Sub1_Sub2_9.aLong168);
		} else if (this.aClass210_15 == Class210.aClass210_23) {
			local148.put(arg5, arg6, this.anInt1320 * this.anInt1321);
			IDirect3DTexture.Upload(this.aLong51, 0, 0, 0, this.anInt1321, this.anInt1320 / 4, this.anInt1321 / 4 * 16, 0, this.aClass102_Sub1_Sub2_9.aLong168);
		} else {
			local148.put(arg5, arg6, arg7 * this.anInt1320);
			IDirect3DTexture.Upload(this.aLong51, 0, 0, 0, this.anInt1321, this.anInt1320, arg7 * this.aClass210_15.anInt3600 * 499559879, 0, this.aClass102_Sub1_Sub2_9.aLong168);
		}
	}

	@OriginalMember(owner = "client!aiy", name = "h", descriptor = "()Z")
	@Override
	public boolean method11713() {
		return false;
	}

	@OriginalMember(owner = "client!aiy", name = "k", descriptor = "(IIII[II)V")
	@Override
	public void method11659(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5) {
		if (this.aClass210_15 != Class210.aClass210_24 || this.aClass236_16 != Class236.aClass236_21) {
			throw new RuntimeException();
		}
		this.aClass102_Sub1_Sub2_9.method21292(arg2 * arg3 * 4);
		@Pc(23) ByteBuffer local23 = this.aClass102_Sub1_Sub2_9.aByteBuffer7;
		local23.clear();
		IDirect3DTexture.Download(this.aLong51, 0, arg0, arg1, arg2, arg3, arg2 * 4, 0, this.aClass102_Sub1_Sub2_9.aLong168);
		local23.asIntBuffer().get(arg4, arg5, arg2 * arg3);
	}

	@OriginalMember(owner = "client!aiy", name = "ar", descriptor = "()I")
	@Override
	public int method11694() {
		return this.anInt1320;
	}

	@OriginalMember(owner = "client!aiy", name = "au", descriptor = "()F")
	@Override
	public float method11695() {
		return this.aFloat138;
	}

	@OriginalMember(owner = "client!aiy", name = "f", descriptor = "()I")
	@Override
	public int method11652() {
		return this.anInt1320;
	}

	@OriginalMember(owner = "client!aiy", name = "l", descriptor = "(F)F")
	@Override
	public float method11667(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt1320;
	}

	@OriginalMember(owner = "client!aiy", name = "r", descriptor = "()F")
	@Override
	public float method11662() {
		return this.aFloat137;
	}

	@OriginalMember(owner = "client!aiy", name = "q", descriptor = "()F")
	@Override
	public float method11663() {
		return this.aFloat138;
	}

	@OriginalMember(owner = "client!aiy", name = "i", descriptor = "(ZZ)V")
	@Override
	public void method11656(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean245 = arg0;
		this.aBoolean246 = arg1;
	}

	@OriginalMember(owner = "client!aiy", name = "bk", descriptor = "()J")
	@Override
	final long method11806() {
		return this.aLong51;
	}

	@OriginalMember(owner = "client!aiy", name = "t", descriptor = "()I")
	@Override
	public int method11688() {
		return this.anInt1321;
	}

	@OriginalMember(owner = "client!aiy", name = "ab", descriptor = "(IIII[II)V")
	@Override
	public void method11668(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5) {
		if (this.aClass210_15 != Class210.aClass210_24 || this.aClass236_16 != Class236.aClass236_21) {
			throw new RuntimeException();
		}
		this.aClass102_Sub1_Sub2_9.method21292(arg2 * arg3 * 4);
		@Pc(23) ByteBuffer local23 = this.aClass102_Sub1_Sub2_9.aByteBuffer7;
		local23.clear();
		IDirect3DTexture.Download(this.aLong51, 0, arg0, arg1, arg2, arg3, arg2 * 4, 0, this.aClass102_Sub1_Sub2_9.aLong168);
		local23.asIntBuffer().get(arg4, arg5, arg2 * arg3);
	}

	@OriginalMember(owner = "client!aiy", name = "a", descriptor = "(IIII[III)V")
	@Override
	public void method11665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass210_15 != Class210.aClass210_24 || this.aClass236_16 != Class236.aClass236_21) {
			throw new RuntimeException();
		}
		if (arg6 == 0) {
			arg6 = arg2;
		}
		this.aClass102_Sub1_Sub2_9.method21292(arg6 * arg3 * this.aClass210_15.anInt3600 * 499559879);
		@Pc(31) ByteBuffer local31 = this.aClass102_Sub1_Sub2_9.aByteBuffer7;
		local31.clear();
		local31.asIntBuffer().put(arg4, arg5, arg6 * arg3);
		IDirect3DTexture.Upload(this.aLong51, 0, arg0, arg1, arg2, arg3, arg6 * this.aClass210_15.anInt3600 * 499559879, 0, this.aClass102_Sub1_Sub2_9.aLong168);
	}

	@OriginalMember(owner = "client!aiy", name = "bh", descriptor = "()J")
	@Override
	final long method11813() {
		return this.aLong51;
	}

	@OriginalMember(owner = "client!aiy", name = "y", descriptor = "(F)F")
	@Override
	public float method11681(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt1320;
	}

	@OriginalMember(owner = "client!aiy", name = "g", descriptor = "()Z")
	@Override
	public boolean method11655() {
		return true;
	}

	@OriginalMember(owner = "client!aiy", name = "w", descriptor = "(IIIIII)V")
	@Override
	public void method11661(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int[] local7 = this.aClass102_Sub1_Sub2_9.method20691(arg4, arg5, arg2, arg3);
		if (local7 != null) {
			for (@Pc(11) int local11 = 0; local11 < local7.length; local11++) {
				local7[local11] |= 0xFF000000;
			}
			this.method11665(arg0, arg1, arg2, arg3, local7, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!aiy", name = "aw", descriptor = "()V")
	@Override
	public void method11817() {
		this.aClass102_Sub1_Sub2_9.method21544(this);
	}

	@OriginalMember(owner = "client!aiy", name = "x", descriptor = "(IIII[I[II)V")
	@Override
	public void method11660(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6) {
		if (this.aClass210_15 != Class210.aClass210_24 || this.aClass236_16 != Class236.aClass236_21) {
			throw new RuntimeException();
		}
		this.method11660(arg0, arg1, arg2, arg3, arg4, null, arg6);
	}

	@OriginalMember(owner = "client!aiy", name = "e", descriptor = "()V")
	@Override
	public void method30837() {
		super.method30837();
	}

	@OriginalMember(owner = "client!aiy", name = "m", descriptor = "()V")
	@Override
	public void method30835() {
		super.method30837();
	}

	@OriginalMember(owner = "client!aiy", name = "al", descriptor = "(IIII[II)V")
	@Override
	public void method11680(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5) {
		if (this.aClass210_15 != Class210.aClass210_24 || this.aClass236_16 != Class236.aClass236_21) {
			throw new RuntimeException();
		}
		this.aClass102_Sub1_Sub2_9.method21292(arg2 * arg3 * 4);
		@Pc(23) ByteBuffer local23 = this.aClass102_Sub1_Sub2_9.aByteBuffer7;
		local23.clear();
		IDirect3DTexture.Download(this.aLong51, 0, arg0, arg1, arg2, arg3, arg2 * 4, 0, this.aClass102_Sub1_Sub2_9.aLong168);
		local23.asIntBuffer().get(arg4, arg5, arg2 * arg3);
	}

	@OriginalMember(owner = "client!aiy", name = "j", descriptor = "()V")
	@Override
	public void method30834() {
		super.method30837();
	}

	@OriginalMember(owner = "client!aiy", name = "d", descriptor = "()I")
	@Override
	public int method11664() {
		return this.anInt1321;
	}

	@OriginalMember(owner = "client!aiy", name = "z", descriptor = "(F)F")
	@Override
	public float method11666(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt1321;
	}

	@OriginalMember(owner = "client!aiy", name = "p", descriptor = "(F)F")
	@Override
	public float method11682(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt1321;
	}

	@OriginalMember(owner = "client!aiy", name = "v", descriptor = "(F)F")
	@Override
	public float method11678(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt1320;
	}

	@OriginalMember(owner = "client!aiy", name = "s", descriptor = "(IIII[BLclient!co;II)V")
	@Override
	public void method11669(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) Class210 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass210_15 != arg5 || this.aClass236_16 != Class236.aClass236_21) {
			throw new RuntimeException();
		}
		if (arg7 == 0) {
			arg7 = arg2;
		}
		this.aClass102_Sub1_Sub2_9.method21292(arg7 * arg3 * this.aClass210_15.anInt3600 * 499559879);
		@Pc(31) ByteBuffer local31 = this.aClass102_Sub1_Sub2_9.aByteBuffer7;
		local31.clear();
		local31.put(arg4, arg6, arg7 * arg3);
		IDirect3DTexture.Upload(this.aLong51, 0, arg0, arg1, arg2, arg3, arg7 * this.aClass210_15.anInt3600 * 499559879, 0, this.aClass102_Sub1_Sub2_9.aLong168);
	}

	@OriginalMember(owner = "client!aiy", name = "ag", descriptor = "(IIII[II)V")
	@Override
	public void method11689(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5) {
		if (this.aClass210_15 != Class210.aClass210_24 || this.aClass236_16 != Class236.aClass236_21) {
			throw new RuntimeException();
		}
		this.aClass102_Sub1_Sub2_9.method21292(arg2 * arg3 * 4);
		@Pc(23) ByteBuffer local23 = this.aClass102_Sub1_Sub2_9.aByteBuffer7;
		local23.clear();
		IDirect3DTexture.Download(this.aLong51, 0, arg0, arg1, arg2, arg3, arg2 * 4, 0, this.aClass102_Sub1_Sub2_9.aLong168);
		local23.asIntBuffer().get(arg4, arg5, arg2 * arg3);
	}

	@OriginalMember(owner = "client!aiy", name = "c", descriptor = "()Z")
	@Override
	public boolean method11671() {
		return true;
	}

	@OriginalMember(owner = "client!aiy", name = "b", descriptor = "()Z")
	@Override
	public boolean method11672() {
		return true;
	}

	@OriginalMember(owner = "client!aiy", name = "ax", descriptor = "(ZZ)V")
	@Override
	public void method11693(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean245 = arg0;
		this.aBoolean246 = arg1;
	}

	@OriginalMember(owner = "client!aiy", name = "ay", descriptor = "(ZZ)V")
	@Override
	public void method11658(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean245 = arg0;
		this.aBoolean246 = arg1;
	}

	@OriginalMember(owner = "client!aiy", name = "ai", descriptor = "(ZZ)V")
	@Override
	public void method11675(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean245 = arg0;
		this.aBoolean246 = arg1;
	}

	@OriginalMember(owner = "client!aiy", name = "n", descriptor = "()Z")
	@Override
	public boolean method11670() {
		return true;
	}

	@OriginalMember(owner = "client!aiy", name = "ao", descriptor = "(IIII[III)V")
	@Override
	public void method11677(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass210_15 != Class210.aClass210_24 || this.aClass236_16 != Class236.aClass236_21) {
			throw new RuntimeException();
		}
		if (arg6 == 0) {
			arg6 = arg2;
		}
		this.aClass102_Sub1_Sub2_9.method21292(arg6 * arg3 * this.aClass210_15.anInt3600 * 499559879);
		@Pc(31) ByteBuffer local31 = this.aClass102_Sub1_Sub2_9.aByteBuffer7;
		local31.clear();
		local31.asIntBuffer().put(arg4, arg5, arg6 * arg3);
		IDirect3DTexture.Upload(this.aLong51, 0, arg0, arg1, arg2, arg3, arg6 * this.aClass210_15.anInt3600 * 499559879, 0, this.aClass102_Sub1_Sub2_9.aLong168);
	}

	@OriginalMember(owner = "client!aiy", name = "aj", descriptor = "(IIII[BLclient!co;II)V")
	@Override
	public void method11673(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) Class210 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass210_15 != arg5 || this.aClass236_16 != Class236.aClass236_21) {
			throw new RuntimeException();
		}
		if (arg7 == 0) {
			arg7 = arg2;
		}
		this.aClass102_Sub1_Sub2_9.method21292(arg7 * arg3 * this.aClass210_15.anInt3600 * 499559879);
		@Pc(31) ByteBuffer local31 = this.aClass102_Sub1_Sub2_9.aByteBuffer7;
		local31.clear();
		local31.put(arg4, arg6, arg7 * arg3);
		IDirect3DTexture.Upload(this.aLong51, 0, arg0, arg1, arg2, arg3, arg7 * this.aClass210_15.anInt3600 * 499559879, 0, this.aClass102_Sub1_Sub2_9.aLong168);
	}

	@OriginalMember(owner = "client!aiy", name = "ac", descriptor = "(IIII[BLclient!co;II)V")
	@Override
	public void method11679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) Class210 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (this.aClass210_15 != arg5 || this.aClass236_16 != Class236.aClass236_21) {
			throw new RuntimeException();
		}
		if (arg7 == 0) {
			arg7 = arg2;
		}
		this.aClass102_Sub1_Sub2_9.method21292(arg7 * arg3 * this.aClass210_15.anInt3600 * 499559879);
		@Pc(31) ByteBuffer local31 = this.aClass102_Sub1_Sub2_9.aByteBuffer7;
		local31.clear();
		local31.put(arg4, arg6, arg7 * arg3);
		IDirect3DTexture.Upload(this.aLong51, 0, arg0, arg1, arg2, arg3, arg7 * this.aClass210_15.anInt3600 * 499559879, 0, this.aClass102_Sub1_Sub2_9.aLong168);
	}

	@OriginalMember(owner = "client!aiy", name = "as", descriptor = "()F")
	@Override
	public float method11697() {
		return this.aFloat138;
	}

	@OriginalMember(owner = "client!aiy", name = "ae", descriptor = "()I")
	@Override
	public int method11692() {
		return this.anInt1320;
	}

	@OriginalMember(owner = "client!aiy", name = "o", descriptor = "()V")
	@Override
	public void method30836() {
		super.method30837();
	}

	@OriginalMember(owner = "client!aiy", name = "ah", descriptor = "(IIII[II)V")
	@Override
	public void method11654(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5) {
		if (this.aClass210_15 != Class210.aClass210_24 || this.aClass236_16 != Class236.aClass236_21) {
			throw new RuntimeException();
		}
		this.aClass102_Sub1_Sub2_9.method21292(arg2 * arg3 * 4);
		@Pc(23) ByteBuffer local23 = this.aClass102_Sub1_Sub2_9.aByteBuffer7;
		local23.clear();
		IDirect3DTexture.Download(this.aLong51, 0, arg0, arg1, arg2, arg3, arg2 * 4, 0, this.aClass102_Sub1_Sub2_9.aLong168);
		local23.asIntBuffer().get(arg4, arg5, arg2 * arg3);
	}

	@OriginalMember(owner = "client!aiy", name = "af", descriptor = "(IIII[I[II)V")
	@Override
	public void method11684(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6) {
		if (this.aClass210_15 != Class210.aClass210_24 || this.aClass236_16 != Class236.aClass236_21) {
			throw new RuntimeException();
		}
		this.method11660(arg0, arg1, arg2, arg3, arg4, null, arg6);
	}

	@OriginalMember(owner = "client!aiy", name = "am", descriptor = "(IIII[I[II)V")
	@Override
	public void method11685(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6) {
		if (this.aClass210_15 != Class210.aClass210_24 || this.aClass236_16 != Class236.aClass236_21) {
			throw new RuntimeException();
		}
		this.method11660(arg0, arg1, arg2, arg3, arg4, null, arg6);
	}

	@OriginalMember(owner = "client!aiy", name = "ak", descriptor = "(IIII[I[II)V")
	@Override
	public void method11686(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6) {
		if (this.aClass210_15 != Class210.aClass210_24 || this.aClass236_16 != Class236.aClass236_21) {
			throw new RuntimeException();
		}
		this.method11660(arg0, arg1, arg2, arg3, arg4, null, arg6);
	}

	@OriginalMember(owner = "client!aiy", name = "at", descriptor = "(IIII[I[II)V")
	@Override
	public void method11683(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6) {
		if (this.aClass210_15 != Class210.aClass210_24 || this.aClass236_16 != Class236.aClass236_21) {
			throw new RuntimeException();
		}
		this.method11660(arg0, arg1, arg2, arg3, arg4, null, arg6);
	}

	@OriginalMember(owner = "client!aiy", name = "ad", descriptor = "(IIIIII)V")
	@Override
	public void method11674(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int[] local7 = this.aClass102_Sub1_Sub2_9.method20691(arg4, arg5, arg2, arg3);
		if (local7 != null) {
			for (@Pc(11) int local11 = 0; local11 < local7.length; local11++) {
				local7[local11] |= 0xFF000000;
			}
			this.method11665(arg0, arg1, arg2, arg3, local7, 0, arg2);
		}
	}

	@OriginalMember(owner = "client!aiy", name = "an", descriptor = "()Z")
	@Override
	public boolean method11724() {
		return false;
	}

	@OriginalMember(owner = "client!aiy", name = "aa", descriptor = "()Z")
	@Override
	public boolean method11725() {
		return false;
	}

	@OriginalMember(owner = "client!aiy", name = "aq", descriptor = "(IIII[III)V")
	@Override
	public void method11651(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass210_15 != Class210.aClass210_24 || this.aClass236_16 != Class236.aClass236_21) {
			throw new RuntimeException();
		}
		if (arg6 == 0) {
			arg6 = arg2;
		}
		this.aClass102_Sub1_Sub2_9.method21292(arg6 * arg3 * this.aClass210_15.anInt3600 * 499559879);
		@Pc(31) ByteBuffer local31 = this.aClass102_Sub1_Sub2_9.aByteBuffer7;
		local31.clear();
		local31.asIntBuffer().put(arg4, arg5, arg6 * arg3);
		IDirect3DTexture.Upload(this.aLong51, 0, arg0, arg1, arg2, arg3, arg6 * this.aClass210_15.anInt3600 * 499559879, 0, this.aClass102_Sub1_Sub2_9.aLong168);
	}

	@OriginalMember(owner = "client!aiy", name = "br", descriptor = "()V")
	@Override
	public void method11816() {
		this.aClass102_Sub1_Sub2_9.method21544(this);
	}

	@OriginalMember(owner = "client!aiy", name = "av", descriptor = "()F")
	@Override
	public float method11690() {
		return this.aFloat137;
	}

	@OriginalMember(owner = "client!aiy", name = "ba", descriptor = "(Lclient!le;)V")
	@Override
	public void method11812(@OriginalArg(0) Class396 arg0) {
		super.method11807(arg0);
	}

	@OriginalMember(owner = "client!aiy", name = "be", descriptor = "()J")
	@Override
	final long method11814() {
		return this.aLong51;
	}

	@OriginalMember(owner = "client!aiy", name = "bn", descriptor = "()V")
	@Override
	public void method11819() {
		this.aClass102_Sub1_Sub2_9.method21544(this);
	}

	@OriginalMember(owner = "client!aiy", name = "bl", descriptor = "()V")
	@Override
	public void method11818() {
		this.aClass102_Sub1_Sub2_9.method21544(this);
	}

	@OriginalMember(owner = "client!aiy", name = "ap", descriptor = "()I")
	@Override
	public int method11676() {
		return this.anInt1320;
	}

	@OriginalMember(owner = "client!aiy", name = "u", descriptor = "(F)F")
	@Override
	public float method11653(@OriginalArg(0) float arg0) {
		return arg0 / (float) this.anInt1321;
	}

	@OriginalMember(owner = "client!aiy", name = "az", descriptor = "()F")
	@Override
	public float method11696() {
		return this.aFloat138;
	}

	@OriginalMember(owner = "client!aiy", name = "bg", descriptor = "(Lclient!le;)V")
	@Override
	public void method11807(@OriginalArg(0) Class396 arg0) {
		super.method11807(arg0);
	}
}
