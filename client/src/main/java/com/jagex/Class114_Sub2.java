package com.jagex;

import jagdx.IDirect3DDevice;
import jagdx.IUnknown;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!agu")
public final class Class114_Sub2 extends Class114 {

	@OriginalMember(owner = "client!agu", name = "k", descriptor = "I")
	static final int anInt1012 = 1;

	@OriginalMember(owner = "client!agu", name = "s", descriptor = "I")
	static final int anInt1013 = 0;

	@OriginalMember(owner = "client!agu", name = "o", descriptor = "[F")
	static final float[] aFloatArray32 = new float[16];

	@OriginalMember(owner = "client!agu", name = "m", descriptor = "J")
	long aLong31;

	@OriginalMember(owner = "client!agu", name = "u", descriptor = "Lclient!agj;")
	Class113_Sub1 aClass113_Sub1_1;

	@OriginalMember(owner = "client!agu", name = "g", descriptor = "Lclient!aqw;")
	Class102_Sub1_Sub2 aClass102_Sub1_Sub2_2;

	@OriginalMember(owner = "client!agu", name = "i", descriptor = "J")
	long aLong32;

	@OriginalMember(owner = "client!agu", name = "l", descriptor = "Z")
	boolean aBoolean185;

	@OriginalMember(owner = "client!agu", name = "x", descriptor = "[[F")
	final float[][] aFloatArrayArray13;

	@OriginalMember(owner = "client!agu", name = "w", descriptor = "[Z")
	final boolean[] aBooleanArray7;

	@OriginalMember(owner = "client!agu", name = "j", descriptor = "[B")
	byte[] aByteArray30;

	@OriginalMember(owner = "client!agu", name = "a", descriptor = "[B")
	byte[] aByteArray29;

	@OriginalMember(owner = "client!agu", name = "<init>", descriptor = "(Lclient!aqw;Lclient!hj;)V")
	Class114_Sub2(@OriginalArg(0) Class102_Sub1_Sub2 arg0, @OriginalArg(1) Class315 arg1) {
		this.aBoolean185 = false;
		this.aFloatArrayArray13 = new float[2][];
		this.aBooleanArray7 = new boolean[2];
		this.aString40 = arg1.aString175;
		if (arg1.aString176 != null) {
			this.aString41 = arg1.aString176;
			this.aByteArray30 = arg0.method21552(this.aString41);
		}
		if (arg1.aString177 != null) {
			this.aString42 = arg1.aString177;
			this.aByteArray29 = arg0.method21552(this.aString42);
		}
		arg0.method21137(this);
	}

	@OriginalMember(owner = "client!agu", name = "<init>", descriptor = "(Lclient!aqw;Lclient!agj;Lclient!hj;)V")
	Class114_Sub2(@OriginalArg(0) Class102_Sub1_Sub2 arg0, @OriginalArg(1) Class113_Sub1 arg1, @OriginalArg(2) Class315 arg2) {
		this(arg0, arg2);
		this.aClass102_Sub1_Sub2_2 = arg0;
		this.aClass113_Sub1_1 = arg1;
	}

	@OriginalMember(owner = "client!agu", name = "bh", descriptor = "()V")
	void method8630() {
		if (this.aBooleanArray7[0]) {
			this.aClass102_Sub1_Sub2_2.aByteBuffer7.clear();
			this.aClass102_Sub1_Sub2_2.aByteBuffer7.asFloatBuffer().put(this.aFloatArrayArray13[0]);
			IDirect3DDevice.SetVertexShaderConstantF(this.aClass102_Sub1_Sub2_2.aLong173, 0, this.aClass102_Sub1_Sub2_2.aLong168, this.aFloatArrayArray13[0].length / 4);
			this.aBooleanArray7[0] = false;
		}
		if (this.aBooleanArray7[1]) {
			this.aClass102_Sub1_Sub2_2.aByteBuffer7.clear();
			this.aClass102_Sub1_Sub2_2.aByteBuffer7.asFloatBuffer().put(this.aFloatArrayArray13[1]);
			IDirect3DDevice.SetPixelShaderConstantF(this.aClass102_Sub1_Sub2_2.aLong173, 0, this.aClass102_Sub1_Sub2_2.aLong168, this.aFloatArrayArray13[1].length / 4);
			this.aBooleanArray7[1] = false;
		}
	}

	@OriginalMember(owner = "client!agu", name = "f", descriptor = "()Z")
	@Override
	public boolean method8577() {
		if (this.aBoolean185) {
			return true;
		}
		this.aLong32 = this.aByteArray30 == null ? 0L : IDirect3DDevice.CreateVertexShader(this.aClass102_Sub1_Sub2_2.aLong173, this.aByteArray30);
		this.aLong31 = this.aByteArray29 == null ? 0L : IDirect3DDevice.CreatePixelShader(this.aClass102_Sub1_Sub2_2.aLong173, this.aByteArray29);
		if (this.aLong32 == 0L && this.aLong31 == 0L) {
			return false;
		}
		@Pc(44) int local44 = -1;
		@Pc(46) int local46;
		for (local46 = 0; local46 < this.aClass113_Sub1_1.method8262((byte) 0); local46++) {
			if (this.aClass113_Sub1_1.method8263(local46, (byte) 1) == this) {
				local44 = local46;
				break;
			}
		}
		local46 = this.aClass113_Sub1_1.method8344((byte) -15);
		@Pc(74) int local74 = this.aClass113_Sub1_1.method8364(-2145775667);
		@Pc(76) int local76;
		@Pc(85) Class80_Sub13_Sub1 local85;
		for (local76 = 0; local76 < local46; local76++) {
			local85 = this.aClass113_Sub1_1.method8294(local76, -1479226415);
			local85.method23992(local44);
		}
		for (local76 = 0; local76 < local74; local76++) {
			local85 = this.aClass113_Sub1_1.method8291(local76, 1739363165);
			local85.method23992(local44);
		}
		local76 = 0;
		@Pc(112) int local112 = 0;
		@Pc(118) int local118 = this.aClass113_Sub1_1.method8264(this, 1899566687);
		for (@Pc(120) int local120 = 0; local120 < local46 + local74; local120++) {
			@Pc(143) Class80_Sub13_Sub1_Sub1 local143 = (Class80_Sub13_Sub1_Sub1) (local120 < local46 ? this.aClass113_Sub1_1.method8294(local120, -1759864197) : this.aClass113_Sub1_1.method8291(local120 - local46, 1531056329));
			@Pc(147) Class317 local147 = local143.method23989(36064);
			@Pc(149) int local149 = 1;
			if (local147 == Class317.aClass317_10) {
				local147 = local143.method23996(-1754069915);
				local149 = local143.method23991(-494952893);
			}
			switch(local147.anInt4024 * -975768375) {
				case 5:
				case 15:
				case 78:
				case 94:
					local149 *= 4;
				case 6:
				case 40:
				case 86:
				case 87:
				case 102:
					break;
				case 8:
				case 35:
				case 45:
				case 82:
					local149 *= 3;
					break;
				case 33:
				case 42:
				case 47:
				case 75:
					local149 *= 2;
					break;
				default:
					local149 = 0;
			}
			@Pc(195) int local195;
			if (local143.anIntArray285[local118] >= 0) {
				local195 = local143.anIntArray285[local118] + local149;
				if (local76 < local195) {
					local76 = local195;
				}
			}
			if (local143.anIntArray286[local118] >= 0) {
				local195 = local143.anIntArray286[local118] + local149;
				if (local112 < local195) {
					local112 = local195;
				}
			}
		}
		this.aFloatArrayArray13[0] = new float[local76 * 4];
		this.aFloatArrayArray13[1] = new float[local112 * 4];
		this.aBoolean185 = true;
		return true;
	}

	@OriginalMember(owner = "client!agu", name = "bj", descriptor = "(I[FI)V")
	void method8631(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		Class718.method37245(arg1, 0, this.aFloatArrayArray13[0], arg0 * 4, arg2);
		this.aBooleanArray7[0] = true;
	}

	@OriginalMember(owner = "client!agu", name = "bn", descriptor = "(I[FI)V")
	void method8632(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		Class718.method37245(arg1, 0, this.aFloatArrayArray13[0], arg0 * 4, arg2);
		this.aBooleanArray7[0] = true;
	}

	@OriginalMember(owner = "client!agu", name = "g", descriptor = "(Lclient!aqv;FFF)V")
	@Override
	void method8580(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(3) int local3 = ((Class80_Sub13_Sub1_Sub1) arg0).method23571();
		@Pc(7) int local7 = ((Class80_Sub13_Sub1_Sub1) arg0).method23570();
		if (arg0.method23989(36064) != Class317.aClass317_106) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			local3 *= 4;
			this.aFloatArrayArray13[0][local3] = arg1;
			this.aFloatArrayArray13[0][local3 + 1] = arg2;
			this.aFloatArrayArray13[0][local3 + 2] = arg3;
			this.aBooleanArray7[0] = true;
		}
		if (local7 < 0) {
			return;
		}
		local7 *= 4;
		this.aFloatArrayArray13[1][local7] = arg1;
		this.aFloatArrayArray13[1][local7 + 1] = arg2;
		this.aFloatArrayArray13[1][local7 + 2] = arg3;
		this.aBooleanArray7[1] = true;
	}

	@OriginalMember(owner = "client!agu", name = "i", descriptor = "(Lclient!aqv;FFFF)V")
	@Override
	void method8611(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		@Pc(3) int local3 = ((Class80_Sub13_Sub1_Sub1) arg0).method23571();
		@Pc(7) int local7 = ((Class80_Sub13_Sub1_Sub1) arg0).method23570();
		if (arg0.method23989(36064) != Class317.aClass317_91) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			local3 *= 4;
			this.aFloatArrayArray13[0][local3] = arg1;
			this.aFloatArrayArray13[0][local3 + 1] = arg2;
			this.aFloatArrayArray13[0][local3 + 2] = arg3;
			this.aFloatArrayArray13[0][local3 + 3] = arg4;
			this.aBooleanArray7[0] = true;
		}
		if (local7 < 0) {
			return;
		}
		local7 *= 4;
		this.aFloatArrayArray13[1][local7] = arg1;
		this.aFloatArrayArray13[1][local7 + 1] = arg2;
		this.aFloatArrayArray13[1][local7 + 2] = arg3;
		this.aFloatArrayArray13[1][local7 + 3] = arg4;
		this.aBooleanArray7[1] = true;
	}

	@OriginalMember(owner = "client!agu", name = "s", descriptor = "(Lclient!aqv;Lclient!pm;)V")
	@Override
	void method8582(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) Class487 arg1) {
		@Pc(3) int local3 = ((Class80_Sub13_Sub1_Sub1) arg0).method23571();
		@Pc(7) int local7 = ((Class80_Sub13_Sub1_Sub1) arg0).method23570();
		if (arg0.method23989(36064) != Class317.aClass317_49) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			this.method8632(local3, arg1.method30073(aFloatArray32), 8);
		}
		if (local7 >= 0) {
			this.method8635(local7, arg1.method30073(aFloatArray32), 8);
		}
	}

	@OriginalMember(owner = "client!agu", name = "o", descriptor = "()V")
	@Override
	public void method30836() {
		if (this.aLong32 != 0L) {
			IUnknown.Release(this.aLong32);
			this.aLong32 = 0L;
		}
		if (this.aLong31 != 0L) {
			IUnknown.Release(this.aLong31);
			this.aLong31 = 0L;
		}
		this.aClass102_Sub1_Sub2_2.method21133(this);
	}

	@OriginalMember(owner = "client!agu", name = "a", descriptor = "(Lclient!aqv;[FI)V")
	@Override
	void method8604(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = ((Class80_Sub13_Sub1_Sub1) arg0).method23571();
		@Pc(7) int local7 = ((Class80_Sub13_Sub1_Sub1) arg0).method23570();
		if (arg0.method23989(36064) != Class317.aClass317_10) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			this.method8632(local3, arg1, arg2);
		}
		if (local7 >= 0) {
			this.method8635(local7, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!agu", name = "x", descriptor = "(Lclient!aqv;ILclient!mf;)V")
	@Override
	void method8581(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface39 arg2) {
		this.aClass102_Sub1_Sub2_2.method21217(arg1);
		this.aClass102_Sub1_Sub2_2.method21429(arg2);
	}

	@OriginalMember(owner = "client!agu", name = "w", descriptor = "(IFFF)V")
	@Override
	void method8585(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		this.aFloatArrayArray13[local3][local9] = arg1;
		this.aFloatArrayArray13[local3][local9 + 1] = arg2;
		this.aFloatArrayArray13[local3][local9 + 2] = arg3;
		this.aBooleanArray7[local3] = true;
	}

	@OriginalMember(owner = "client!agu", name = "bp", descriptor = "()V")
	void method8633() {
		if (this.aBooleanArray7[0]) {
			this.aClass102_Sub1_Sub2_2.aByteBuffer7.clear();
			this.aClass102_Sub1_Sub2_2.aByteBuffer7.asFloatBuffer().put(this.aFloatArrayArray13[0]);
			IDirect3DDevice.SetVertexShaderConstantF(this.aClass102_Sub1_Sub2_2.aLong173, 0, this.aClass102_Sub1_Sub2_2.aLong168, this.aFloatArrayArray13[0].length / 4);
			this.aBooleanArray7[0] = false;
		}
		if (this.aBooleanArray7[1]) {
			this.aClass102_Sub1_Sub2_2.aByteBuffer7.clear();
			this.aClass102_Sub1_Sub2_2.aByteBuffer7.asFloatBuffer().put(this.aFloatArrayArray13[1]);
			IDirect3DDevice.SetPixelShaderConstantF(this.aClass102_Sub1_Sub2_2.aLong173, 0, this.aClass102_Sub1_Sub2_2.aLong168, this.aFloatArrayArray13[1].length / 4);
			this.aBooleanArray7[1] = false;
		}
	}

	@OriginalMember(owner = "client!agu", name = "h", descriptor = "(ILclient!pm;)V")
	@Override
	void method8608(@OriginalArg(0) int arg0, @OriginalArg(1) Class487 arg1) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1.method30135(aFloatArray32), 0, this.aFloatArrayArray13[local3], local9, 12);
		this.aBooleanArray7[local3] = true;
	}

	@OriginalMember(owner = "client!agu", name = "am", descriptor = "(ILclient!pm;)V")
	@Override
	void method8609(@OriginalArg(0) int arg0, @OriginalArg(1) Class487 arg1) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1.method30073(aFloatArray32), 0, this.aFloatArrayArray13[local3], local9, 8);
		this.aBooleanArray7[local3] = true;
	}

	@OriginalMember(owner = "client!agu", name = "k", descriptor = "(Lclient!aqv;Lclient!pm;)V")
	@Override
	void method8583(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) Class487 arg1) {
		@Pc(3) int local3 = ((Class80_Sub13_Sub1_Sub1) arg0).method23571();
		@Pc(7) int local7 = ((Class80_Sub13_Sub1_Sub1) arg0).method23570();
		if (arg0.method23989(36064) != Class317.aClass317_130) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			this.method8632(local3, arg1.method30135(aFloatArray32), 16);
		}
		if (local7 >= 0) {
			this.method8635(local7, arg1.method30135(aFloatArray32), 16);
		}
	}

	@OriginalMember(owner = "client!agu", name = "q", descriptor = "(I[FI)V")
	@Override
	void method8587(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1, 0, this.aFloatArrayArray13[local3], local9, arg2);
		this.aBooleanArray7[local3] = true;
	}

	@OriginalMember(owner = "client!agu", name = "bk", descriptor = "(I[FI)V")
	void method8634(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		Class718.method37245(arg1, 0, this.aFloatArrayArray13[1], arg0 * 4, arg2);
		this.aBooleanArray7[1] = true;
	}

	@OriginalMember(owner = "client!agu", name = "ba", descriptor = "(I[FI)V")
	void method8635(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		Class718.method37245(arg1, 0, this.aFloatArrayArray13[1], arg0 * 4, arg2);
		this.aBooleanArray7[1] = true;
	}

	@OriginalMember(owner = "client!agu", name = "p", descriptor = "(IILclient!mf;)V")
	@Override
	void method8591(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface39 arg2) {
		this.aClass102_Sub1_Sub2_2.method21217(arg1);
		this.aClass102_Sub1_Sub2_2.method21429(arg2);
	}

	@OriginalMember(owner = "client!agu", name = "z", descriptor = "(ILclient!pm;)V")
	@Override
	void method8618(@OriginalArg(0) int arg0, @OriginalArg(1) Class487 arg1) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1.method30135(aFloatArray32), 0, this.aFloatArrayArray13[local3], local9, 16);
		this.aBooleanArray7[local3] = true;
	}

	@OriginalMember(owner = "client!agu", name = "e", descriptor = "()V")
	@Override
	public void method30837() {
		if (this.aLong32 != 0L) {
			IUnknown.Release(this.aLong32);
			this.aLong32 = 0L;
		}
		if (this.aLong31 != 0L) {
			IUnknown.Release(this.aLong31);
			this.aLong31 = 0L;
		}
		this.aClass102_Sub1_Sub2_2.method21133(this);
	}

	@OriginalMember(owner = "client!agu", name = "n", descriptor = "(Lclient!aqv;F)V")
	@Override
	void method8584(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) float arg1) {
		@Pc(3) int local3 = ((Class80_Sub13_Sub1_Sub1) arg0).method23571();
		@Pc(7) int local7 = ((Class80_Sub13_Sub1_Sub1) arg0).method23570();
		if (arg0.method23989(36064) != Class317.aClass317_32 && arg0.method23989(36064) != Class317.aClass317_78) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			local3 *= 4;
			this.aFloatArrayArray13[0][local3] = arg1;
			this.aBooleanArray7[0] = true;
		}
		if (local7 >= 0) {
			local7 *= 4;
			this.aFloatArrayArray13[1][local7] = arg1;
			this.aBooleanArray7[1] = true;
		}
	}

	@OriginalMember(owner = "client!agu", name = "at", descriptor = "(ILclient!pm;)V")
	@Override
	void method8575(@OriginalArg(0) int arg0, @OriginalArg(1) Class487 arg1) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1.method30135(aFloatArray32), 0, this.aFloatArrayArray13[local3], local9, 16);
		this.aBooleanArray7[local3] = true;
	}

	@OriginalMember(owner = "client!agu", name = "d", descriptor = "(ILclient!pm;)V")
	@Override
	void method8589(@OriginalArg(0) int arg0, @OriginalArg(1) Class487 arg1) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1.method30073(aFloatArray32), 0, this.aFloatArrayArray13[local3], local9, 8);
		this.aBooleanArray7[local3] = true;
	}

	@OriginalMember(owner = "client!agu", name = "r", descriptor = "(IFFFF)V")
	@Override
	void method8586(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		this.aFloatArrayArray13[local3][local9] = arg1;
		this.aFloatArrayArray13[local3][local9 + 1] = arg2;
		this.aFloatArrayArray13[local3][local9 + 2] = arg3;
		this.aFloatArrayArray13[local3][local9 + 3] = arg4;
		this.aBooleanArray7[local3] = true;
	}

	@OriginalMember(owner = "client!agu", name = "aj", descriptor = "(Lclient!aqv;Lclient!pm;)V")
	@Override
	void method8602(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) Class487 arg1) {
		@Pc(3) int local3 = ((Class80_Sub13_Sub1_Sub1) arg0).method23571();
		@Pc(7) int local7 = ((Class80_Sub13_Sub1_Sub1) arg0).method23570();
		if (arg0.method23989(36064) != Class317.aClass317_130) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			this.method8632(local3, arg1.method30135(aFloatArray32), 16);
		}
		if (local7 >= 0) {
			this.method8635(local7, arg1.method30135(aFloatArray32), 16);
		}
	}

	@OriginalMember(owner = "client!agu", name = "hy", descriptor = "()V")
	void method8636() {
		this.method8641();
	}

	@OriginalMember(owner = "client!agu", name = "aq", descriptor = "(Lclient!aqv;FFFF)V")
	@Override
	void method8600(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		@Pc(3) int local3 = ((Class80_Sub13_Sub1_Sub1) arg0).method23571();
		@Pc(7) int local7 = ((Class80_Sub13_Sub1_Sub1) arg0).method23570();
		if (arg0.method23989(36064) != Class317.aClass317_91) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			local3 *= 4;
			this.aFloatArrayArray13[0][local3] = arg1;
			this.aFloatArrayArray13[0][local3 + 1] = arg2;
			this.aFloatArrayArray13[0][local3 + 2] = arg3;
			this.aFloatArrayArray13[0][local3 + 3] = arg4;
			this.aBooleanArray7[0] = true;
		}
		if (local7 < 0) {
			return;
		}
		local7 *= 4;
		this.aFloatArrayArray13[1][local7] = arg1;
		this.aFloatArrayArray13[1][local7 + 1] = arg2;
		this.aFloatArrayArray13[1][local7 + 2] = arg3;
		this.aFloatArrayArray13[1][local7 + 3] = arg4;
		this.aBooleanArray7[1] = true;
	}

	@OriginalMember(owner = "client!agu", name = "ht", descriptor = "()V")
	void method8637() {
		this.method8641();
	}

	@OriginalMember(owner = "client!agu", name = "hj", descriptor = "()V")
	void method8638() {
		this.method8641();
	}

	@OriginalMember(owner = "client!agu", name = "finalize", descriptor = "()V")
	@Override
	void finalize() {
		this.method8641();
	}

	@OriginalMember(owner = "client!agu", name = "ao", descriptor = "(Lclient!aqv;Lclient!pm;)V")
	@Override
	void method8601(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) Class487 arg1) {
		@Pc(3) int local3 = ((Class80_Sub13_Sub1_Sub1) arg0).method23571();
		@Pc(7) int local7 = ((Class80_Sub13_Sub1_Sub1) arg0).method23570();
		if (arg0.method23989(36064) != Class317.aClass317_49) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			this.method8632(local3, arg1.method30073(aFloatArray32), 8);
		}
		if (local7 >= 0) {
			this.method8635(local7, arg1.method30073(aFloatArray32), 8);
		}
	}

	@OriginalMember(owner = "client!agu", name = "b", descriptor = "(Lclient!aqv;F)V")
	@Override
	void method8596(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) float arg1) {
		@Pc(3) int local3 = ((Class80_Sub13_Sub1_Sub1) arg0).method23571();
		@Pc(7) int local7 = ((Class80_Sub13_Sub1_Sub1) arg0).method23570();
		if (arg0.method23989(36064) != Class317.aClass317_32 && arg0.method23989(36064) != Class317.aClass317_78) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			local3 *= 4;
			this.aFloatArrayArray13[0][local3] = arg1;
			this.aBooleanArray7[0] = true;
		}
		if (local7 >= 0) {
			local7 *= 4;
			this.aFloatArrayArray13[1][local7] = arg1;
			this.aBooleanArray7[1] = true;
		}
	}

	@OriginalMember(owner = "client!agu", name = "ax", descriptor = "(Lclient!aqv;FFF)V")
	@Override
	void method8597(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(3) int local3 = ((Class80_Sub13_Sub1_Sub1) arg0).method23571();
		@Pc(7) int local7 = ((Class80_Sub13_Sub1_Sub1) arg0).method23570();
		if (arg0.method23989(36064) != Class317.aClass317_106) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			local3 *= 4;
			this.aFloatArrayArray13[0][local3] = arg1;
			this.aFloatArrayArray13[0][local3 + 1] = arg2;
			this.aFloatArrayArray13[0][local3 + 2] = arg3;
			this.aBooleanArray7[0] = true;
		}
		if (local7 < 0) {
			return;
		}
		local7 *= 4;
		this.aFloatArrayArray13[1][local7] = arg1;
		this.aFloatArrayArray13[1][local7 + 1] = arg2;
		this.aFloatArrayArray13[1][local7 + 2] = arg3;
		this.aBooleanArray7[1] = true;
	}

	@OriginalMember(owner = "client!agu", name = "ay", descriptor = "(Lclient!aqv;FFFF)V")
	@Override
	void method8598(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		@Pc(3) int local3 = ((Class80_Sub13_Sub1_Sub1) arg0).method23571();
		@Pc(7) int local7 = ((Class80_Sub13_Sub1_Sub1) arg0).method23570();
		if (arg0.method23989(36064) != Class317.aClass317_91) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			local3 *= 4;
			this.aFloatArrayArray13[0][local3] = arg1;
			this.aFloatArrayArray13[0][local3 + 1] = arg2;
			this.aFloatArrayArray13[0][local3 + 2] = arg3;
			this.aFloatArrayArray13[0][local3 + 3] = arg4;
			this.aBooleanArray7[0] = true;
		}
		if (local7 < 0) {
			return;
		}
		local7 *= 4;
		this.aFloatArrayArray13[1][local7] = arg1;
		this.aFloatArrayArray13[1][local7 + 1] = arg2;
		this.aFloatArrayArray13[1][local7 + 2] = arg3;
		this.aFloatArrayArray13[1][local7 + 3] = arg4;
		this.aBooleanArray7[1] = true;
	}

	@OriginalMember(owner = "client!agu", name = "ai", descriptor = "(Lclient!aqv;FFFF)V")
	@Override
	void method8599(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		@Pc(3) int local3 = ((Class80_Sub13_Sub1_Sub1) arg0).method23571();
		@Pc(7) int local7 = ((Class80_Sub13_Sub1_Sub1) arg0).method23570();
		if (arg0.method23989(36064) != Class317.aClass317_91) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			local3 *= 4;
			this.aFloatArrayArray13[0][local3] = arg1;
			this.aFloatArrayArray13[0][local3 + 1] = arg2;
			this.aFloatArrayArray13[0][local3 + 2] = arg3;
			this.aFloatArrayArray13[0][local3 + 3] = arg4;
			this.aBooleanArray7[0] = true;
		}
		if (local7 < 0) {
			return;
		}
		local7 *= 4;
		this.aFloatArrayArray13[1][local7] = arg1;
		this.aFloatArrayArray13[1][local7 + 1] = arg2;
		this.aFloatArrayArray13[1][local7 + 2] = arg3;
		this.aFloatArrayArray13[1][local7 + 3] = arg4;
		this.aBooleanArray7[1] = true;
	}

	@OriginalMember(owner = "client!agu", name = "bt", descriptor = "()V")
	void method8639() {
		if (this.aBooleanArray7[0]) {
			this.aClass102_Sub1_Sub2_2.aByteBuffer7.clear();
			this.aClass102_Sub1_Sub2_2.aByteBuffer7.asFloatBuffer().put(this.aFloatArrayArray13[0]);
			IDirect3DDevice.SetVertexShaderConstantF(this.aClass102_Sub1_Sub2_2.aLong173, 0, this.aClass102_Sub1_Sub2_2.aLong168, this.aFloatArrayArray13[0].length / 4);
			this.aBooleanArray7[0] = false;
		}
		if (this.aBooleanArray7[1]) {
			this.aClass102_Sub1_Sub2_2.aByteBuffer7.clear();
			this.aClass102_Sub1_Sub2_2.aByteBuffer7.asFloatBuffer().put(this.aFloatArrayArray13[1]);
			IDirect3DDevice.SetPixelShaderConstantF(this.aClass102_Sub1_Sub2_2.aLong173, 0, this.aClass102_Sub1_Sub2_2.aLong168, this.aFloatArrayArray13[1].length / 4);
			this.aBooleanArray7[1] = false;
		}
	}

	@OriginalMember(owner = "client!agu", name = "u", descriptor = "(Lclient!aqv;F)V")
	@Override
	void method8578(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) float arg1) {
		@Pc(3) int local3 = ((Class80_Sub13_Sub1_Sub1) arg0).method23571();
		@Pc(7) int local7 = ((Class80_Sub13_Sub1_Sub1) arg0).method23570();
		if (arg0.method23989(36064) != Class317.aClass317_32 && arg0.method23989(36064) != Class317.aClass317_78) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			local3 *= 4;
			this.aFloatArrayArray13[0][local3] = arg1;
			this.aBooleanArray7[0] = true;
		}
		if (local7 >= 0) {
			local7 *= 4;
			this.aFloatArrayArray13[1][local7] = arg1;
			this.aBooleanArray7[1] = true;
		}
	}

	@OriginalMember(owner = "client!agu", name = "m", descriptor = "()V")
	@Override
	public void method30835() {
		if (this.aLong32 != 0L) {
			IUnknown.Release(this.aLong32);
			this.aLong32 = 0L;
		}
		if (this.aLong31 != 0L) {
			IUnknown.Release(this.aLong31);
			this.aLong31 = 0L;
		}
		this.aClass102_Sub1_Sub2_2.method21133(this);
	}

	@OriginalMember(owner = "client!agu", name = "ac", descriptor = "(Lclient!aqv;ILclient!mf;)V")
	@Override
	void method8603(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface39 arg2) {
		this.aClass102_Sub1_Sub2_2.method21217(arg1);
		this.aClass102_Sub1_Sub2_2.method21429(arg2);
	}

	@OriginalMember(owner = "client!agu", name = "ag", descriptor = "(IFFFF)V")
	@Override
	void method8624(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		this.aFloatArrayArray13[local3][local9] = arg1;
		this.aFloatArrayArray13[local3][local9 + 1] = arg2;
		this.aFloatArrayArray13[local3][local9 + 2] = arg3;
		this.aFloatArrayArray13[local3][local9 + 3] = arg4;
		this.aBooleanArray7[local3] = true;
	}

	@OriginalMember(owner = "client!agu", name = "ab", descriptor = "(IFFFF)V")
	@Override
	void method8579(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		this.aFloatArrayArray13[local3][local9] = arg1;
		this.aFloatArrayArray13[local3][local9 + 1] = arg2;
		this.aFloatArrayArray13[local3][local9 + 2] = arg3;
		this.aFloatArrayArray13[local3][local9 + 3] = arg4;
		this.aBooleanArray7[local3] = true;
	}

	@OriginalMember(owner = "client!agu", name = "al", descriptor = "(I[FI)V")
	@Override
	void method8606(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1, 0, this.aFloatArrayArray13[local3], local9, arg2);
		this.aBooleanArray7[local3] = true;
	}

	@OriginalMember(owner = "client!agu", name = "ah", descriptor = "(ILclient!pm;)V")
	@Override
	void method8607(@OriginalArg(0) int arg0, @OriginalArg(1) Class487 arg1) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1.method30135(aFloatArray32), 0, this.aFloatArrayArray13[local3], local9, 12);
		this.aBooleanArray7[local3] = true;
	}

	@OriginalMember(owner = "client!agu", name = "af", descriptor = "(ILclient!pm;)V")
	@Override
	void method8623(@OriginalArg(0) int arg0, @OriginalArg(1) Class487 arg1) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1.method30135(aFloatArray32), 0, this.aFloatArrayArray13[local3], local9, 12);
		this.aBooleanArray7[local3] = true;
	}

	@OriginalMember(owner = "client!agu", name = "y", descriptor = "()Z")
	@Override
	public boolean method8593() {
		if (this.aBoolean185) {
			return true;
		}
		this.aLong32 = this.aByteArray30 == null ? 0L : IDirect3DDevice.CreateVertexShader(this.aClass102_Sub1_Sub2_2.aLong173, this.aByteArray30);
		this.aLong31 = this.aByteArray29 == null ? 0L : IDirect3DDevice.CreatePixelShader(this.aClass102_Sub1_Sub2_2.aLong173, this.aByteArray29);
		if (this.aLong32 == 0L && this.aLong31 == 0L) {
			return false;
		}
		@Pc(44) int local44 = -1;
		@Pc(46) int local46;
		for (local46 = 0; local46 < this.aClass113_Sub1_1.method8262((byte) 0); local46++) {
			if (this.aClass113_Sub1_1.method8263(local46, (byte) 1) == this) {
				local44 = local46;
				break;
			}
		}
		local46 = this.aClass113_Sub1_1.method8344((byte) -28);
		@Pc(74) int local74 = this.aClass113_Sub1_1.method8364(-2139000896);
		@Pc(76) int local76;
		@Pc(85) Class80_Sub13_Sub1 local85;
		for (local76 = 0; local76 < local46; local76++) {
			local85 = this.aClass113_Sub1_1.method8294(local76, -1531559628);
			local85.method23992(local44);
		}
		for (local76 = 0; local76 < local74; local76++) {
			local85 = this.aClass113_Sub1_1.method8291(local76, -1602480888);
			local85.method23992(local44);
		}
		local76 = 0;
		@Pc(112) int local112 = 0;
		@Pc(118) int local118 = this.aClass113_Sub1_1.method8264(this, 1830894395);
		for (@Pc(120) int local120 = 0; local120 < local46 + local74; local120++) {
			@Pc(143) Class80_Sub13_Sub1_Sub1 local143 = (Class80_Sub13_Sub1_Sub1) (local120 < local46 ? this.aClass113_Sub1_1.method8294(local120, -1889631312) : this.aClass113_Sub1_1.method8291(local120 - local46, -2102139632));
			@Pc(147) Class317 local147 = local143.method23989(36064);
			@Pc(149) int local149 = 1;
			if (local147 == Class317.aClass317_10) {
				local147 = local143.method23996(-350134365);
				local149 = local143.method23991(1697321500);
			}
			switch(local147.anInt4024 * -975768375) {
				case 5:
				case 15:
				case 78:
				case 94:
					local149 *= 4;
				case 6:
				case 40:
				case 86:
				case 87:
				case 102:
					break;
				case 8:
				case 35:
				case 45:
				case 82:
					local149 *= 3;
					break;
				case 33:
				case 42:
				case 47:
				case 75:
					local149 *= 2;
					break;
				default:
					local149 = 0;
			}
			@Pc(195) int local195;
			if (local143.anIntArray285[local118] >= 0) {
				local195 = local143.anIntArray285[local118] + local149;
				if (local76 < local195) {
					local76 = local195;
				}
			}
			if (local143.anIntArray286[local118] >= 0) {
				local195 = local143.anIntArray286[local118] + local149;
				if (local112 < local195) {
					local112 = local195;
				}
			}
		}
		this.aFloatArrayArray13[0] = new float[local76 * 4];
		this.aFloatArrayArray13[1] = new float[local112 * 4];
		this.aBoolean185 = true;
		return true;
	}

	@OriginalMember(owner = "client!agu", name = "ak", descriptor = "(ILclient!pm;)V")
	@Override
	void method8610(@OriginalArg(0) int arg0, @OriginalArg(1) Class487 arg1) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1.method30073(aFloatArray32), 0, this.aFloatArrayArray13[local3], local9, 8);
		this.aBooleanArray7[local3] = true;
	}

	@OriginalMember(owner = "client!agu", name = "j", descriptor = "()V")
	@Override
	public void method30834() {
		if (this.aLong32 != 0L) {
			IUnknown.Release(this.aLong32);
			this.aLong32 = 0L;
		}
		if (this.aLong31 != 0L) {
			IUnknown.Release(this.aLong31);
			this.aLong31 = 0L;
		}
		this.aClass102_Sub1_Sub2_2.method21133(this);
	}

	@OriginalMember(owner = "client!agu", name = "ad", descriptor = "(ILclient!pm;)V")
	@Override
	void method8612(@OriginalArg(0) int arg0, @OriginalArg(1) Class487 arg1) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1.method30135(aFloatArray32), 0, this.aFloatArrayArray13[local3], local9, 16);
		this.aBooleanArray7[local3] = true;
	}

	@OriginalMember(owner = "client!agu", name = "av", descriptor = "(IILclient!mf;)V")
	@Override
	void method8625(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface39 arg2) {
		this.aClass102_Sub1_Sub2_2.method21217(arg1);
		this.aClass102_Sub1_Sub2_2.method21429(arg2);
	}

	@OriginalMember(owner = "client!agu", name = "an", descriptor = "(IILclient!mf;)V")
	@Override
	void method8614(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface39 arg2) {
		this.aClass102_Sub1_Sub2_2.method21217(arg1);
		this.aClass102_Sub1_Sub2_2.method21429(arg2);
	}

	@OriginalMember(owner = "client!agu", name = "aa", descriptor = "(IILclient!mf;)V")
	@Override
	void method8615(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface39 arg2) {
		this.aClass102_Sub1_Sub2_2.method21217(arg1);
		this.aClass102_Sub1_Sub2_2.method21429(arg2);
	}

	@OriginalMember(owner = "client!agu", name = "c", descriptor = "(Lclient!aqv;F)V")
	@Override
	void method8595(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) float arg1) {
		@Pc(3) int local3 = ((Class80_Sub13_Sub1_Sub1) arg0).method23571();
		@Pc(7) int local7 = ((Class80_Sub13_Sub1_Sub1) arg0).method23570();
		if (arg0.method23989(36064) != Class317.aClass317_32 && arg0.method23989(36064) != Class317.aClass317_78) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			local3 *= 4;
			this.aFloatArrayArray13[0][local3] = arg1;
			this.aBooleanArray7[0] = true;
		}
		if (local7 >= 0) {
			local7 *= 4;
			this.aFloatArrayArray13[1][local7] = arg1;
			this.aBooleanArray7[1] = true;
		}
	}

	@OriginalMember(owner = "client!agu", name = "ap", descriptor = "(Lclient!aqv;FF)V")
	@Override
	void method8613(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(3) int local3 = ((Class80_Sub13_Sub1_Sub1) arg0).method23571();
		@Pc(7) int local7 = ((Class80_Sub13_Sub1_Sub1) arg0).method23570();
		if (arg0.method23989(36064) != Class317.aClass317_34) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			local3 *= 4;
			this.aFloatArrayArray13[0][local3] = arg1;
			this.aFloatArrayArray13[0][local3 + 1] = arg2;
			this.aBooleanArray7[0] = true;
		}
		if (local7 >= 0) {
			local7 *= 4;
			this.aFloatArrayArray13[1][local7] = arg1;
			this.aFloatArrayArray13[1][local7 + 1] = arg2;
			this.aBooleanArray7[1] = true;
		}
	}

	@OriginalMember(owner = "client!agu", name = "ar", descriptor = "(Lclient!aqv;FF)V")
	@Override
	void method8594(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(3) int local3 = ((Class80_Sub13_Sub1_Sub1) arg0).method23571();
		@Pc(7) int local7 = ((Class80_Sub13_Sub1_Sub1) arg0).method23570();
		if (arg0.method23989(36064) != Class317.aClass317_34) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			local3 *= 4;
			this.aFloatArrayArray13[0][local3] = arg1;
			this.aFloatArrayArray13[0][local3 + 1] = arg2;
			this.aBooleanArray7[0] = true;
		}
		if (local7 >= 0) {
			local7 *= 4;
			this.aFloatArrayArray13[1][local7] = arg1;
			this.aFloatArrayArray13[1][local7 + 1] = arg2;
			this.aBooleanArray7[1] = true;
		}
	}

	@OriginalMember(owner = "client!agu", name = "au", descriptor = "(Lclient!aqv;[FI)V")
	@Override
	void method8616(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = ((Class80_Sub13_Sub1_Sub1) arg0).method23571();
		@Pc(7) int local7 = ((Class80_Sub13_Sub1_Sub1) arg0).method23570();
		if (arg0.method23989(36064) != Class317.aClass317_10) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			this.method8632(local3, arg1, arg2);
		}
		if (local7 >= 0) {
			this.method8635(local7, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!agu", name = "az", descriptor = "(Lclient!aqv;[FI)V")
	@Override
	void method8620(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = ((Class80_Sub13_Sub1_Sub1) arg0).method23571();
		@Pc(7) int local7 = ((Class80_Sub13_Sub1_Sub1) arg0).method23570();
		if (arg0.method23989(36064) != Class317.aClass317_10) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			this.method8632(local3, arg1, arg2);
		}
		if (local7 >= 0) {
			this.method8635(local7, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!agu", name = "as", descriptor = "(Lclient!aqv;[FI)V")
	@Override
	void method8621(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = ((Class80_Sub13_Sub1_Sub1) arg0).method23571();
		@Pc(7) int local7 = ((Class80_Sub13_Sub1_Sub1) arg0).method23570();
		if (arg0.method23989(36064) != Class317.aClass317_10) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			this.method8632(local3, arg1, arg2);
		}
		if (local7 >= 0) {
			this.method8635(local7, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!agu", name = "aw", descriptor = "(Lclient!aqv;[FI)V")
	@Override
	void method8622(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = ((Class80_Sub13_Sub1_Sub1) arg0).method23571();
		@Pc(7) int local7 = ((Class80_Sub13_Sub1_Sub1) arg0).method23570();
		if (arg0.method23989(36064) != Class317.aClass317_10) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			this.method8632(local3, arg1, arg2);
		}
		if (local7 >= 0) {
			this.method8635(local7, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!agu", name = "bg", descriptor = "(IFFF)V")
	@Override
	void method8619(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		this.aFloatArrayArray13[local3][local9] = arg1;
		this.aFloatArrayArray13[local3][local9 + 1] = arg2;
		this.aFloatArrayArray13[local3][local9 + 2] = arg3;
		this.aBooleanArray7[local3] = true;
	}

	@OriginalMember(owner = "client!agu", name = "bl", descriptor = "(IFFF)V")
	@Override
	void method8588(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		this.aFloatArrayArray13[local3][local9] = arg1;
		this.aFloatArrayArray13[local3][local9 + 1] = arg2;
		this.aFloatArrayArray13[local3][local9 + 2] = arg3;
		this.aBooleanArray7[local3] = true;
	}

	@OriginalMember(owner = "client!agu", name = "br", descriptor = "(IFFF)V")
	@Override
	void method8617(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		this.aFloatArrayArray13[local3][local9] = arg1;
		this.aFloatArrayArray13[local3][local9 + 1] = arg2;
		this.aFloatArrayArray13[local3][local9 + 2] = arg3;
		this.aBooleanArray7[local3] = true;
	}

	@OriginalMember(owner = "client!agu", name = "l", descriptor = "(Lclient!aqv;FF)V")
	@Override
	void method8592(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(3) int local3 = ((Class80_Sub13_Sub1_Sub1) arg0).method23571();
		@Pc(7) int local7 = ((Class80_Sub13_Sub1_Sub1) arg0).method23570();
		if (arg0.method23989(36064) != Class317.aClass317_34) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			local3 *= 4;
			this.aFloatArrayArray13[0][local3] = arg1;
			this.aFloatArrayArray13[0][local3 + 1] = arg2;
			this.aBooleanArray7[0] = true;
		}
		if (local7 >= 0) {
			local7 *= 4;
			this.aFloatArrayArray13[1][local7] = arg1;
			this.aFloatArrayArray13[1][local7 + 1] = arg2;
			this.aBooleanArray7[1] = true;
		}
	}

	@OriginalMember(owner = "client!agu", name = "by", descriptor = "(I[FI)V")
	void method8640(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		Class718.method37245(arg1, 0, this.aFloatArrayArray13[1], arg0 * 4, arg2);
		this.aBooleanArray7[1] = true;
	}

	@OriginalMember(owner = "client!agu", name = "bs", descriptor = "()V")
	void method8641() {
		if (this.aLong32 != 0L) {
			this.aClass102_Sub1_Sub2_2.method21556(this.aLong32);
			this.aLong32 = 0L;
		}
		if (this.aLong31 != 0L) {
			this.aClass102_Sub1_Sub2_2.method21556(this.aLong31);
			this.aLong31 = 0L;
		}
	}

	@OriginalMember(owner = "client!agu", name = "bz", descriptor = "(I[FI)V")
	void method8642(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		Class718.method37245(arg1, 0, this.aFloatArrayArray13[1], arg0 * 4, arg2);
		this.aBooleanArray7[1] = true;
	}

	@OriginalMember(owner = "client!agu", name = "be", descriptor = "(I[FI)V")
	void method8643(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		Class718.method37245(arg1, 0, this.aFloatArrayArray13[1], arg0 * 4, arg2);
		this.aBooleanArray7[1] = true;
	}

	@OriginalMember(owner = "client!agu", name = "ae", descriptor = "(Lclient!aqv;FF)V")
	@Override
	void method8605(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(3) int local3 = ((Class80_Sub13_Sub1_Sub1) arg0).method23571();
		@Pc(7) int local7 = ((Class80_Sub13_Sub1_Sub1) arg0).method23570();
		if (arg0.method23989(36064) != Class317.aClass317_34) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			local3 *= 4;
			this.aFloatArrayArray13[0][local3] = arg1;
			this.aFloatArrayArray13[0][local3 + 1] = arg2;
			this.aBooleanArray7[0] = true;
		}
		if (local7 >= 0) {
			local7 *= 4;
			this.aFloatArrayArray13[1][local7] = arg1;
			this.aFloatArrayArray13[1][local7 + 1] = arg2;
			this.aBooleanArray7[1] = true;
		}
	}

	@OriginalMember(owner = "client!agu", name = "bv", descriptor = "()V")
	void method8644() {
		if (this.aBooleanArray7[0]) {
			this.aClass102_Sub1_Sub2_2.aByteBuffer7.clear();
			this.aClass102_Sub1_Sub2_2.aByteBuffer7.asFloatBuffer().put(this.aFloatArrayArray13[0]);
			IDirect3DDevice.SetVertexShaderConstantF(this.aClass102_Sub1_Sub2_2.aLong173, 0, this.aClass102_Sub1_Sub2_2.aLong168, this.aFloatArrayArray13[0].length / 4);
			this.aBooleanArray7[0] = false;
		}
		if (this.aBooleanArray7[1]) {
			this.aClass102_Sub1_Sub2_2.aByteBuffer7.clear();
			this.aClass102_Sub1_Sub2_2.aByteBuffer7.asFloatBuffer().put(this.aFloatArrayArray13[1]);
			IDirect3DDevice.SetPixelShaderConstantF(this.aClass102_Sub1_Sub2_2.aLong173, 0, this.aClass102_Sub1_Sub2_2.aLong168, this.aFloatArrayArray13[1].length / 4);
			this.aBooleanArray7[1] = false;
		}
	}

	@OriginalMember(owner = "client!agu", name = "bb", descriptor = "()V")
	void method8645() {
		if (this.aLong32 != 0L) {
			this.aClass102_Sub1_Sub2_2.method21556(this.aLong32);
			this.aLong32 = 0L;
		}
		if (this.aLong31 != 0L) {
			this.aClass102_Sub1_Sub2_2.method21556(this.aLong31);
			this.aLong31 = 0L;
		}
	}

	@OriginalMember(owner = "client!agu", name = "bo", descriptor = "()V")
	void method8646() {
		if (this.aLong32 != 0L) {
			this.aClass102_Sub1_Sub2_2.method21556(this.aLong32);
			this.aLong32 = 0L;
		}
		if (this.aLong31 != 0L) {
			this.aClass102_Sub1_Sub2_2.method21556(this.aLong31);
			this.aLong31 = 0L;
		}
	}
}
