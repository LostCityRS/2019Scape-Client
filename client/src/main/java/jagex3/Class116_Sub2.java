package jagex3;

import jagdx.IDirect3DDevice;
import jagdx.IUnknown;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!agt")
public final class Class116_Sub2 extends Class116 {

	@OriginalMember(owner = "client!agt", name = "r", descriptor = "I")
	static final int anInt981 = 1;

	@OriginalMember(owner = "client!agt", name = "c", descriptor = "I")
	static final int anInt982 = 0;

	@OriginalMember(owner = "client!agt", name = "z", descriptor = "[F")
	static final float[] aFloatArray32 = new float[16];

	@OriginalMember(owner = "client!agt", name = "u", descriptor = "J")
	long aLong29;

	@OriginalMember(owner = "client!agt", name = "k", descriptor = "Lclient!agc;")
	Class115_Sub1 aClass115_Sub1_1;

	@OriginalMember(owner = "client!agt", name = "w", descriptor = "Lclient!aqd;")
	Class104_Sub2_Sub1 aClass104_Sub2_Sub1_2;

	@OriginalMember(owner = "client!agt", name = "l", descriptor = "J")
	long aLong30;

	@OriginalMember(owner = "client!agt", name = "f", descriptor = "Z")
	boolean aBoolean177;

	@OriginalMember(owner = "client!agt", name = "v", descriptor = "[[F")
	final float[][] aFloatArrayArray13;

	@OriginalMember(owner = "client!agt", name = "o", descriptor = "[Z")
	final boolean[] aBooleanArray8;

	@OriginalMember(owner = "client!agt", name = "p", descriptor = "[B")
	byte[] aByteArray28;

	@OriginalMember(owner = "client!agt", name = "d", descriptor = "[B")
	byte[] aByteArray27;

	@OriginalMember(owner = "client!agt", name = "<init>", descriptor = "(Lclient!aqd;Lclient!hn;)V")
	Class116_Sub2(@OriginalArg(0) Class104_Sub2_Sub1 arg0, @OriginalArg(1) Class318 arg1) {
		this.aBoolean177 = false;
		this.aFloatArrayArray13 = new float[2][];
		this.aBooleanArray8 = new boolean[2];
		this.aString40 = arg1.aString178;
		if (arg1.aString176 != null) {
			this.aString39 = arg1.aString176;
			this.aByteArray28 = arg0.method19544(this.aString39);
		}
		if (arg1.aString177 != null) {
			this.aString41 = arg1.aString177;
			this.aByteArray27 = arg0.method19544(this.aString41);
		}
		arg0.method20925(this);
	}

	@OriginalMember(owner = "client!agt", name = "<init>", descriptor = "(Lclient!aqd;Lclient!agc;Lclient!hn;)V")
	Class116_Sub2(@OriginalArg(0) Class104_Sub2_Sub1 arg0, @OriginalArg(1) Class115_Sub1 arg1, @OriginalArg(2) Class318 arg2) {
		this(arg0, arg2);
		this.aClass104_Sub2_Sub1_2 = arg0;
		this.aClass115_Sub1_1 = arg1;
	}

	@OriginalMember(owner = "client!agt", name = "ah", descriptor = "(Lclient!aql;Lclient!pq;)V")
	@Override
	void method8453(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) Class489 arg1) {
		@Pc(3) int local3 = ((Class93_Sub33_Sub1_Sub1) arg0).method23420();
		@Pc(7) int local7 = ((Class93_Sub33_Sub1_Sub1) arg0).method23421();
		if (arg0.method23665(-713336010) != Class323.aClass323_48) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			this.method8489(local3, arg1.method30051(aFloatArray32), 8);
		}
		if (local7 >= 0) {
			this.method8490(local7, arg1.method30051(aFloatArray32), 8);
		}
	}

	@OriginalMember(owner = "client!agt", name = "n", descriptor = "()Z")
	@Override
	public boolean method8438() {
		if (this.aBoolean177) {
			return true;
		}
		this.aLong30 = this.aByteArray28 == null ? 0L : IDirect3DDevice.CreateVertexShader(this.aClass104_Sub2_Sub1_2.aLong121, this.aByteArray28);
		this.aLong29 = this.aByteArray27 == null ? 0L : IDirect3DDevice.CreatePixelShader(this.aClass104_Sub2_Sub1_2.aLong121, this.aByteArray27);
		if (this.aLong30 == 0L && this.aLong29 == 0L) {
			return false;
		}
		@Pc(44) int local44 = -1;
		@Pc(46) int local46;
		for (local46 = 0; local46 < this.aClass115_Sub1_1.method8199((byte) -25); local46++) {
			if (this.aClass115_Sub1_1.method8200(local46, -1334314065) == this) {
				local44 = local46;
				break;
			}
		}
		local46 = this.aClass115_Sub1_1.method8230(-2080443305);
		@Pc(74) int local74 = this.aClass115_Sub1_1.method8231(-97055131);
		@Pc(76) int local76;
		@Pc(85) Class93_Sub33_Sub1 local85;
		for (local76 = 0; local76 < local46; local76++) {
			local85 = this.aClass115_Sub1_1.method8201(local76, 1888077567);
			local85.method23663(local44);
		}
		for (local76 = 0; local76 < local74; local76++) {
			local85 = this.aClass115_Sub1_1.method8228(local76, (byte) 6);
			local85.method23663(local44);
		}
		local76 = 0;
		@Pc(112) int local112 = 0;
		@Pc(118) int local118 = this.aClass115_Sub1_1.method8241(this, 1946541000);
		for (@Pc(120) int local120 = 0; local120 < local46 + local74; local120++) {
			@Pc(143) Class93_Sub33_Sub1_Sub1 local143 = (Class93_Sub33_Sub1_Sub1) (local120 < local46 ? this.aClass115_Sub1_1.method8201(local120, -472193436) : this.aClass115_Sub1_1.method8228(local120 - local46, (byte) 6));
			@Pc(147) Class323 local147 = local143.method23665(-112959287);
			@Pc(149) int local149 = 1;
			if (local147 == Class323.aClass323_9) {
				local147 = local143.method23666((short) 17615);
				local149 = local143.method23674(885955409);
			}
			switch(local147.anInt4174 * -757868253) {
				case 17:
				case 35:
				case 52:
				case 103:
					local149 *= 4;
				case 20:
				case 81:
				case 89:
				case 104:
				case 121:
					break;
				case 33:
				case 48:
				case 55:
				case 119:
					local149 *= 2;
					break;
				case 36:
				case 71:
				case 75:
				case 87:
					local149 *= 3;
					break;
				default:
					local149 = 0;
			}
			@Pc(195) int local195;
			if (local143.anIntArray273[local118] >= 0) {
				local195 = local143.anIntArray273[local118] + local149;
				if (local76 < local195) {
					local76 = local195;
				}
			}
			if (local143.anIntArray274[local118] >= 0) {
				local195 = local143.anIntArray274[local118] + local149;
				if (local112 < local195) {
					local112 = local195;
				}
			}
		}
		this.aFloatArrayArray13[0] = new float[local76 * 4];
		this.aFloatArrayArray13[1] = new float[local112 * 4];
		this.aBoolean177 = true;
		return true;
	}

	@OriginalMember(owner = "client!agt", name = "bf", descriptor = "()V")
	void method8487() {
		if (this.aLong30 != 0L) {
			this.aClass104_Sub2_Sub1_2.method19558(this.aLong30);
			this.aLong30 = 0L;
		}
		if (this.aLong29 != 0L) {
			this.aClass104_Sub2_Sub1_2.method19558(this.aLong29);
			this.aLong29 = 0L;
		}
	}

	@OriginalMember(owner = "client!agt", name = "f", descriptor = "(Lclient!aql;FF)V")
	@Override
	void method8440(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(3) int local3 = ((Class93_Sub33_Sub1_Sub1) arg0).method23420();
		@Pc(7) int local7 = ((Class93_Sub33_Sub1_Sub1) arg0).method23421();
		if (arg0.method23665(1930086829) != Class323.aClass323_63) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			local3 *= 4;
			this.aFloatArrayArray13[0][local3] = arg1;
			this.aFloatArrayArray13[0][local3 + 1] = arg2;
			this.aBooleanArray8[0] = true;
		}
		if (local7 >= 0) {
			local7 *= 4;
			this.aFloatArrayArray13[1][local7] = arg1;
			this.aFloatArrayArray13[1][local7 + 1] = arg2;
			this.aBooleanArray8[1] = true;
		}
	}

	@OriginalMember(owner = "client!agt", name = "ao", descriptor = "(IILclient!mq;)V")
	@Override
	void method8447(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface43 arg2) {
		this.aClass104_Sub2_Sub1_2.method20978(arg1);
		this.aClass104_Sub2_Sub1_2.method21032(arg2);
	}

	@OriginalMember(owner = "client!agt", name = "l", descriptor = "(Lclient!aql;FFFF)V")
	@Override
	void method8442(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		@Pc(3) int local3 = ((Class93_Sub33_Sub1_Sub1) arg0).method23420();
		@Pc(7) int local7 = ((Class93_Sub33_Sub1_Sub1) arg0).method23421();
		if (arg0.method23665(-955082614) != Class323.aClass323_34) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			local3 *= 4;
			this.aFloatArrayArray13[0][local3] = arg1;
			this.aFloatArrayArray13[0][local3 + 1] = arg2;
			this.aFloatArrayArray13[0][local3 + 2] = arg3;
			this.aFloatArrayArray13[0][local3 + 3] = arg4;
			this.aBooleanArray8[0] = true;
		}
		if (local7 < 0) {
			return;
		}
		local7 *= 4;
		this.aFloatArrayArray13[1][local7] = arg1;
		this.aFloatArrayArray13[1][local7 + 1] = arg2;
		this.aFloatArrayArray13[1][local7 + 2] = arg3;
		this.aFloatArrayArray13[1][local7 + 3] = arg4;
		this.aBooleanArray8[1] = true;
	}

	@OriginalMember(owner = "client!agt", name = "p", descriptor = "(Lclient!aql;Lclient!pq;)V")
	@Override
	void method8444(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) Class489 arg1) {
		@Pc(3) int local3 = ((Class93_Sub33_Sub1_Sub1) arg0).method23420();
		@Pc(7) int local7 = ((Class93_Sub33_Sub1_Sub1) arg0).method23421();
		if (arg0.method23665(-368198648) != Class323.aClass323_48) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			this.method8489(local3, arg1.method30051(aFloatArray32), 8);
		}
		if (local7 >= 0) {
			this.method8490(local7, arg1.method30051(aFloatArray32), 8);
		}
	}

	@OriginalMember(owner = "client!agt", name = "d", descriptor = "(Lclient!aql;Lclient!pq;)V")
	@Override
	void method8456(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) Class489 arg1) {
		@Pc(3) int local3 = ((Class93_Sub33_Sub1_Sub1) arg0).method23420();
		@Pc(7) int local7 = ((Class93_Sub33_Sub1_Sub1) arg0).method23421();
		if (arg0.method23665(-1672265129) != Class323.aClass323_50) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			this.method8489(local3, arg1.method30034(aFloatArray32), 16);
		}
		if (local7 >= 0) {
			this.method8490(local7, arg1.method30034(aFloatArray32), 16);
		}
	}

	@OriginalMember(owner = "client!agt", name = "z", descriptor = "(Lclient!aql;[FI)V")
	@Override
	void method8441(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = ((Class93_Sub33_Sub1_Sub1) arg0).method23420();
		@Pc(7) int local7 = ((Class93_Sub33_Sub1_Sub1) arg0).method23421();
		if (arg0.method23665(1778097105) != Class323.aClass323_9) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			this.method8489(local3, arg1, arg2);
		}
		if (local7 >= 0) {
			this.method8490(local7, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!agt", name = "y", descriptor = "(ILclient!pq;)V")
	@Override
	void method8450(@OriginalArg(0) int arg0, @OriginalArg(1) Class489 arg1) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1.method30051(aFloatArray32), 0, this.aFloatArrayArray13[local3], local9, 8);
		this.aBooleanArray8[local3] = true;
	}

	@OriginalMember(owner = "client!agt", name = "bl", descriptor = "(I[FI)V")
	void method8488(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		Class713.method37038(arg1, 0, this.aFloatArrayArray13[0], arg0 * 4, arg2);
		this.aBooleanArray8[0] = true;
	}

	@OriginalMember(owner = "client!agt", name = "v", descriptor = "(IFFFF)V")
	@Override
	void method8478(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		this.aFloatArrayArray13[local3][local9] = arg1;
		this.aFloatArrayArray13[local3][local9 + 1] = arg2;
		this.aFloatArrayArray13[local3][local9 + 2] = arg3;
		this.aFloatArrayArray13[local3][local9 + 3] = arg4;
		this.aBooleanArray8[local3] = true;
	}

	@OriginalMember(owner = "client!agt", name = "s", descriptor = "(ILclient!pq;)V")
	@Override
	void method8449(@OriginalArg(0) int arg0, @OriginalArg(1) Class489 arg1) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1.method30034(aFloatArray32), 0, this.aFloatArrayArray13[local3], local9, 12);
		this.aBooleanArray8[local3] = true;
	}

	@OriginalMember(owner = "client!agt", name = "ag", descriptor = "(Lclient!aql;[FI)V")
	@Override
	void method8474(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = ((Class93_Sub33_Sub1_Sub1) arg0).method23420();
		@Pc(7) int local7 = ((Class93_Sub33_Sub1_Sub1) arg0).method23421();
		if (arg0.method23665(295158996) != Class323.aClass323_9) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			this.method8489(local3, arg1, arg2);
		}
		if (local7 >= 0) {
			this.method8490(local7, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!agt", name = "q", descriptor = "(ILclient!pq;)V")
	@Override
	void method8451(@OriginalArg(0) int arg0, @OriginalArg(1) Class489 arg1) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1.method30034(aFloatArray32), 0, this.aFloatArrayArray13[local3], local9, 16);
		this.aBooleanArray8[local3] = true;
	}

	@OriginalMember(owner = "client!agt", name = "o", descriptor = "(I[FI)V")
	@Override
	void method8448(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1, 0, this.aFloatArrayArray13[local3], local9, arg2);
		this.aBooleanArray8[local3] = true;
	}

	@OriginalMember(owner = "client!agt", name = "af", descriptor = "(I[FI)V")
	void method8489(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		Class713.method37038(arg1, 0, this.aFloatArrayArray13[0], arg0 * 4, arg2);
		this.aBooleanArray8[0] = true;
	}

	@OriginalMember(owner = "client!agt", name = "ak", descriptor = "(I[FI)V")
	void method8490(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		Class713.method37038(arg1, 0, this.aFloatArrayArray13[1], arg0 * 4, arg2);
		this.aBooleanArray8[1] = true;
	}

	@OriginalMember(owner = "client!agt", name = "x", descriptor = "(IILclient!mq;)V")
	@Override
	void method8452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface43 arg2) {
		this.aClass104_Sub2_Sub1_2.method20978(arg1);
		this.aClass104_Sub2_Sub1_2.method21032(arg2);
	}

	@OriginalMember(owner = "client!agt", name = "aa", descriptor = "(ILclient!pq;)V")
	@Override
	void method8482(@OriginalArg(0) int arg0, @OriginalArg(1) Class489 arg1) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1.method30034(aFloatArray32), 0, this.aFloatArrayArray13[local3], local9, 12);
		this.aBooleanArray8[local3] = true;
	}

	@OriginalMember(owner = "client!agt", name = "m", descriptor = "()V")
	@Override
	public void method31065() {
		if (this.aLong30 != 0L) {
			IUnknown.Release(this.aLong30);
			this.aLong30 = 0L;
		}
		if (this.aLong29 != 0L) {
			IUnknown.Release(this.aLong29);
			this.aLong29 = 0L;
		}
		this.aClass104_Sub2_Sub1_2.method21139(this);
	}

	@OriginalMember(owner = "client!agt", name = "t", descriptor = "(Lclient!aql;FF)V")
	@Override
	void method8467(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(3) int local3 = ((Class93_Sub33_Sub1_Sub1) arg0).method23420();
		@Pc(7) int local7 = ((Class93_Sub33_Sub1_Sub1) arg0).method23421();
		if (arg0.method23665(281878442) != Class323.aClass323_63) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			local3 *= 4;
			this.aFloatArrayArray13[0][local3] = arg1;
			this.aFloatArrayArray13[0][local3 + 1] = arg2;
			this.aBooleanArray8[0] = true;
		}
		if (local7 >= 0) {
			local7 *= 4;
			this.aFloatArrayArray13[1][local7] = arg1;
			this.aFloatArrayArray13[1][local7 + 1] = arg2;
			this.aBooleanArray8[1] = true;
		}
	}

	@OriginalMember(owner = "client!agt", name = "finalize", descriptor = "()V")
	@Override
	protected void finalize() {
		this.method8487();
	}

	@OriginalMember(owner = "client!agt", name = "u", descriptor = "()V")
	@Override
	public void method31066() {
		if (this.aLong30 != 0L) {
			IUnknown.Release(this.aLong30);
			this.aLong30 = 0L;
		}
		if (this.aLong29 != 0L) {
			IUnknown.Release(this.aLong29);
			this.aLong29 = 0L;
		}
		this.aClass104_Sub2_Sub1_2.method21139(this);
	}

	@OriginalMember(owner = "client!agt", name = "hl", descriptor = "()V")
	void method8491() {
		this.method8487();
	}

	@OriginalMember(owner = "client!agt", name = "a", descriptor = "()Z")
	@Override
	public boolean method8455() {
		if (this.aBoolean177) {
			return true;
		}
		this.aLong30 = this.aByteArray28 == null ? 0L : IDirect3DDevice.CreateVertexShader(this.aClass104_Sub2_Sub1_2.aLong121, this.aByteArray28);
		this.aLong29 = this.aByteArray27 == null ? 0L : IDirect3DDevice.CreatePixelShader(this.aClass104_Sub2_Sub1_2.aLong121, this.aByteArray27);
		if (this.aLong30 == 0L && this.aLong29 == 0L) {
			return false;
		}
		@Pc(44) int local44 = -1;
		@Pc(46) int local46;
		for (local46 = 0; local46 < this.aClass115_Sub1_1.method8199((byte) -72); local46++) {
			if (this.aClass115_Sub1_1.method8200(local46, -1171649851) == this) {
				local44 = local46;
				break;
			}
		}
		local46 = this.aClass115_Sub1_1.method8230(-1064879622);
		@Pc(74) int local74 = this.aClass115_Sub1_1.method8231(-1298893290);
		@Pc(76) int local76;
		@Pc(85) Class93_Sub33_Sub1 local85;
		for (local76 = 0; local76 < local46; local76++) {
			local85 = this.aClass115_Sub1_1.method8201(local76, 1229834946);
			local85.method23663(local44);
		}
		for (local76 = 0; local76 < local74; local76++) {
			local85 = this.aClass115_Sub1_1.method8228(local76, (byte) 6);
			local85.method23663(local44);
		}
		local76 = 0;
		@Pc(112) int local112 = 0;
		@Pc(118) int local118 = this.aClass115_Sub1_1.method8241(this, 1363827234);
		for (@Pc(120) int local120 = 0; local120 < local46 + local74; local120++) {
			@Pc(143) Class93_Sub33_Sub1_Sub1 local143 = (Class93_Sub33_Sub1_Sub1) (local120 < local46 ? this.aClass115_Sub1_1.method8201(local120, -1709360862) : this.aClass115_Sub1_1.method8228(local120 - local46, (byte) 6));
			@Pc(147) Class323 local147 = local143.method23665(-1744169620);
			@Pc(149) int local149 = 1;
			if (local147 == Class323.aClass323_9) {
				local147 = local143.method23666((short) 20299);
				local149 = local143.method23674(404707620);
			}
			switch(local147.anInt4174 * -757868253) {
				case 17:
				case 35:
				case 52:
				case 103:
					local149 *= 4;
				case 20:
				case 81:
				case 89:
				case 104:
				case 121:
					break;
				case 33:
				case 48:
				case 55:
				case 119:
					local149 *= 2;
					break;
				case 36:
				case 71:
				case 75:
				case 87:
					local149 *= 3;
					break;
				default:
					local149 = 0;
			}
			@Pc(195) int local195;
			if (local143.anIntArray273[local118] >= 0) {
				local195 = local143.anIntArray273[local118] + local149;
				if (local76 < local195) {
					local76 = local195;
				}
			}
			if (local143.anIntArray274[local118] >= 0) {
				local195 = local143.anIntArray274[local118] + local149;
				if (local112 < local195) {
					local112 = local195;
				}
			}
		}
		this.aFloatArrayArray13[0] = new float[local76 * 4];
		this.aFloatArrayArray13[1] = new float[local112 * 4];
		this.aBoolean177 = true;
		return true;
	}

	@OriginalMember(owner = "client!agt", name = "g", descriptor = "(Lclient!aql;F)V")
	@Override
	void method8477(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) float arg1) {
		@Pc(3) int local3 = ((Class93_Sub33_Sub1_Sub1) arg0).method23420();
		@Pc(7) int local7 = ((Class93_Sub33_Sub1_Sub1) arg0).method23421();
		if (arg0.method23665(1080727028) != Class323.aClass323_92 && arg0.method23665(-833059831) != Class323.aClass323_77) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			local3 *= 4;
			this.aFloatArrayArray13[0][local3] = arg1;
			this.aBooleanArray8[0] = true;
		}
		if (local7 >= 0) {
			local7 *= 4;
			this.aFloatArrayArray13[1][local7] = arg1;
			this.aBooleanArray8[1] = true;
		}
	}

	@OriginalMember(owner = "client!agt", name = "ai", descriptor = "(Lclient!aql;Lclient!pq;)V")
	@Override
	void method8459(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) Class489 arg1) {
		@Pc(3) int local3 = ((Class93_Sub33_Sub1_Sub1) arg0).method23420();
		@Pc(7) int local7 = ((Class93_Sub33_Sub1_Sub1) arg0).method23421();
		if (arg0.method23665(1131109730) != Class323.aClass323_50) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			this.method8489(local3, arg1.method30034(aFloatArray32), 16);
		}
		if (local7 >= 0) {
			this.method8490(local7, arg1.method30034(aFloatArray32), 16);
		}
	}

	@OriginalMember(owner = "client!agt", name = "j", descriptor = "(Lclient!aql;F)V")
	@Override
	void method8458(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) float arg1) {
		@Pc(3) int local3 = ((Class93_Sub33_Sub1_Sub1) arg0).method23420();
		@Pc(7) int local7 = ((Class93_Sub33_Sub1_Sub1) arg0).method23421();
		if (arg0.method23665(589450827) != Class323.aClass323_92 && arg0.method23665(649902795) != Class323.aClass323_77) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			local3 *= 4;
			this.aFloatArrayArray13[0][local3] = arg1;
			this.aBooleanArray8[0] = true;
		}
		if (local7 >= 0) {
			local7 *= 4;
			this.aFloatArrayArray13[1][local7] = arg1;
			this.aBooleanArray8[1] = true;
		}
	}

	@OriginalMember(owner = "client!agt", name = "ae", descriptor = "(Lclient!aql;FFF)V")
	@Override
	void method8460(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(3) int local3 = ((Class93_Sub33_Sub1_Sub1) arg0).method23420();
		@Pc(7) int local7 = ((Class93_Sub33_Sub1_Sub1) arg0).method23421();
		if (arg0.method23665(-1464337906) != Class323.aClass323_107) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			local3 *= 4;
			this.aFloatArrayArray13[0][local3] = arg1;
			this.aFloatArrayArray13[0][local3 + 1] = arg2;
			this.aFloatArrayArray13[0][local3 + 2] = arg3;
			this.aBooleanArray8[0] = true;
		}
		if (local7 < 0) {
			return;
		}
		local7 *= 4;
		this.aFloatArrayArray13[1][local7] = arg1;
		this.aFloatArrayArray13[1][local7 + 1] = arg2;
		this.aFloatArrayArray13[1][local7 + 2] = arg3;
		this.aBooleanArray8[1] = true;
	}

	@OriginalMember(owner = "client!agt", name = "ay", descriptor = "(ILclient!pq;)V")
	@Override
	void method8479(@OriginalArg(0) int arg0, @OriginalArg(1) Class489 arg1) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1.method30034(aFloatArray32), 0, this.aFloatArrayArray13[local3], local9, 12);
		this.aBooleanArray8[local3] = true;
	}

	@OriginalMember(owner = "client!agt", name = "c", descriptor = "(Lclient!aql;ILclient!mq;)V")
	@Override
	void method8436(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface43 arg2) {
		this.aClass104_Sub2_Sub1_2.method20978(arg1);
		this.aClass104_Sub2_Sub1_2.method21032(arg2);
	}

	@OriginalMember(owner = "client!agt", name = "al", descriptor = "(Lclient!aql;Lclient!pq;)V")
	@Override
	void method8480(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) Class489 arg1) {
		@Pc(3) int local3 = ((Class93_Sub33_Sub1_Sub1) arg0).method23420();
		@Pc(7) int local7 = ((Class93_Sub33_Sub1_Sub1) arg0).method23421();
		if (arg0.method23665(1598463175) != Class323.aClass323_50) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			this.method8489(local3, arg1.method30034(aFloatArray32), 16);
		}
		if (local7 >= 0) {
			this.method8490(local7, arg1.method30034(aFloatArray32), 16);
		}
	}

	@OriginalMember(owner = "client!agt", name = "ac", descriptor = "(Lclient!aql;Lclient!pq;)V")
	@Override
	void method8464(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) Class489 arg1) {
		@Pc(3) int local3 = ((Class93_Sub33_Sub1_Sub1) arg0).method23420();
		@Pc(7) int local7 = ((Class93_Sub33_Sub1_Sub1) arg0).method23421();
		if (arg0.method23665(19778431) != Class323.aClass323_50) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			this.method8489(local3, arg1.method30034(aFloatArray32), 16);
		}
		if (local7 >= 0) {
			this.method8490(local7, arg1.method30034(aFloatArray32), 16);
		}
	}

	@OriginalMember(owner = "client!agt", name = "k", descriptor = "(Lclient!aql;F)V")
	@Override
	void method8439(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) float arg1) {
		@Pc(3) int local3 = ((Class93_Sub33_Sub1_Sub1) arg0).method23420();
		@Pc(7) int local7 = ((Class93_Sub33_Sub1_Sub1) arg0).method23421();
		if (arg0.method23665(1480732353) != Class323.aClass323_92 && arg0.method23665(-1288424747) != Class323.aClass323_77) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			local3 *= 4;
			this.aFloatArrayArray13[0][local3] = arg1;
			this.aBooleanArray8[0] = true;
		}
		if (local7 >= 0) {
			local7 *= 4;
			this.aFloatArrayArray13[1][local7] = arg1;
			this.aBooleanArray8[1] = true;
		}
	}

	@OriginalMember(owner = "client!agt", name = "aw", descriptor = "(Lclient!aql;Lclient!pq;)V")
	@Override
	void method8466(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) Class489 arg1) {
		@Pc(3) int local3 = ((Class93_Sub33_Sub1_Sub1) arg0).method23420();
		@Pc(7) int local7 = ((Class93_Sub33_Sub1_Sub1) arg0).method23421();
		if (arg0.method23665(-923556751) != Class323.aClass323_50) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			this.method8489(local3, arg1.method30034(aFloatArray32), 16);
		}
		if (local7 >= 0) {
			this.method8490(local7, arg1.method30034(aFloatArray32), 16);
		}
	}

	@OriginalMember(owner = "client!agt", name = "as", descriptor = "(Lclient!aql;ILclient!mq;)V")
	@Override
	void method8476(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface43 arg2) {
		this.aClass104_Sub2_Sub1_2.method20978(arg1);
		this.aClass104_Sub2_Sub1_2.method21032(arg2);
	}

	@OriginalMember(owner = "client!agt", name = "at", descriptor = "(IFFF)V")
	@Override
	void method8468(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		this.aFloatArrayArray13[local3][local9] = arg1;
		this.aFloatArrayArray13[local3][local9 + 1] = arg2;
		this.aFloatArrayArray13[local3][local9 + 2] = arg3;
		this.aBooleanArray8[local3] = true;
	}

	@OriginalMember(owner = "client!agt", name = "ad", descriptor = "(I[FI)V")
	@Override
	void method8446(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1, 0, this.aFloatArrayArray13[local3], local9, arg2);
		this.aBooleanArray8[local3] = true;
	}

	@OriginalMember(owner = "client!agt", name = "bk", descriptor = "(I[FI)V")
	void method8492(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		Class713.method37038(arg1, 0, this.aFloatArrayArray13[0], arg0 * 4, arg2);
		this.aBooleanArray8[0] = true;
	}

	@OriginalMember(owner = "client!agt", name = "au", descriptor = "(ILclient!pq;)V")
	@Override
	void method8471(@OriginalArg(0) int arg0, @OriginalArg(1) Class489 arg1) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1.method30051(aFloatArray32), 0, this.aFloatArrayArray13[local3], local9, 8);
		this.aBooleanArray8[local3] = true;
	}

	@OriginalMember(owner = "client!agt", name = "aq", descriptor = "(ILclient!pq;)V")
	@Override
	void method8465(@OriginalArg(0) int arg0, @OriginalArg(1) Class489 arg1) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1.method30034(aFloatArray32), 0, this.aFloatArrayArray13[local3], local9, 16);
		this.aBooleanArray8[local3] = true;
	}

	@OriginalMember(owner = "client!agt", name = "ap", descriptor = "(ILclient!pq;)V")
	@Override
	void method8473(@OriginalArg(0) int arg0, @OriginalArg(1) Class489 arg1) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1.method30034(aFloatArray32), 0, this.aFloatArrayArray13[local3], local9, 16);
		this.aBooleanArray8[local3] = true;
	}

	@OriginalMember(owner = "client!agt", name = "az", descriptor = "(ILclient!pq;)V")
	@Override
	void method8481(@OriginalArg(0) int arg0, @OriginalArg(1) Class489 arg1) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1.method30034(aFloatArray32), 0, this.aFloatArrayArray13[local3], local9, 12);
		this.aBooleanArray8[local3] = true;
	}

	@OriginalMember(owner = "client!agt", name = "ax", descriptor = "(Lclient!aql;FFFF)V")
	@Override
	void method8475(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		@Pc(3) int local3 = ((Class93_Sub33_Sub1_Sub1) arg0).method23420();
		@Pc(7) int local7 = ((Class93_Sub33_Sub1_Sub1) arg0).method23421();
		if (arg0.method23665(-853278600) != Class323.aClass323_34) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			local3 *= 4;
			this.aFloatArrayArray13[0][local3] = arg1;
			this.aFloatArrayArray13[0][local3 + 1] = arg2;
			this.aFloatArrayArray13[0][local3 + 2] = arg3;
			this.aFloatArrayArray13[0][local3 + 3] = arg4;
			this.aBooleanArray8[0] = true;
		}
		if (local7 < 0) {
			return;
		}
		local7 *= 4;
		this.aFloatArrayArray13[1][local7] = arg1;
		this.aFloatArrayArray13[1][local7 + 1] = arg2;
		this.aFloatArrayArray13[1][local7 + 2] = arg3;
		this.aFloatArrayArray13[1][local7 + 3] = arg4;
		this.aBooleanArray8[1] = true;
	}

	@OriginalMember(owner = "client!agt", name = "i", descriptor = "(Lclient!aql;F)V")
	@Override
	void method8457(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) float arg1) {
		@Pc(3) int local3 = ((Class93_Sub33_Sub1_Sub1) arg0).method23420();
		@Pc(7) int local7 = ((Class93_Sub33_Sub1_Sub1) arg0).method23421();
		if (arg0.method23665(989793416) != Class323.aClass323_92 && arg0.method23665(-723133976) != Class323.aClass323_77) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			local3 *= 4;
			this.aFloatArrayArray13[0][local3] = arg1;
			this.aBooleanArray8[0] = true;
		}
		if (local7 >= 0) {
			local7 *= 4;
			this.aFloatArrayArray13[1][local7] = arg1;
			this.aBooleanArray8[1] = true;
		}
	}

	@OriginalMember(owner = "client!agt", name = "am", descriptor = "(ILclient!pq;)V")
	@Override
	void method8470(@OriginalArg(0) int arg0, @OriginalArg(1) Class489 arg1) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1.method30051(aFloatArray32), 0, this.aFloatArrayArray13[local3], local9, 8);
		this.aBooleanArray8[local3] = true;
	}

	@OriginalMember(owner = "client!agt", name = "bh", descriptor = "(I[FI)V")
	void method8493(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		Class713.method37038(arg1, 0, this.aFloatArrayArray13[1], arg0 * 4, arg2);
		this.aBooleanArray8[1] = true;
	}

	@OriginalMember(owner = "client!agt", name = "av", descriptor = "(IILclient!mq;)V")
	@Override
	void method8462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface43 arg2) {
		this.aClass104_Sub2_Sub1_2.method20978(arg1);
		this.aClass104_Sub2_Sub1_2.method21032(arg2);
	}

	@OriginalMember(owner = "client!agt", name = "bc", descriptor = "()V")
	void method8494() {
		if (this.aLong30 != 0L) {
			this.aClass104_Sub2_Sub1_2.method19558(this.aLong30);
			this.aLong30 = 0L;
		}
		if (this.aLong29 != 0L) {
			this.aClass104_Sub2_Sub1_2.method19558(this.aLong29);
			this.aLong29 = 0L;
		}
	}

	@OriginalMember(owner = "client!agt", name = "bx", descriptor = "()V")
	void method8495() {
		if (this.aBooleanArray8[0]) {
			this.aClass104_Sub2_Sub1_2.aByteBuffer7.clear();
			this.aClass104_Sub2_Sub1_2.aByteBuffer7.asFloatBuffer().put(this.aFloatArrayArray13[0]);
			IDirect3DDevice.SetVertexShaderConstantF(this.aClass104_Sub2_Sub1_2.aLong121, 0, this.aClass104_Sub2_Sub1_2.aLong132, this.aFloatArrayArray13[0].length / 4);
			this.aBooleanArray8[0] = false;
		}
		if (this.aBooleanArray8[1]) {
			this.aClass104_Sub2_Sub1_2.aByteBuffer7.clear();
			this.aClass104_Sub2_Sub1_2.aByteBuffer7.asFloatBuffer().put(this.aFloatArrayArray13[1]);
			IDirect3DDevice.SetPixelShaderConstantF(this.aClass104_Sub2_Sub1_2.aLong121, 0, this.aClass104_Sub2_Sub1_2.aLong132, this.aFloatArrayArray13[1].length / 4);
			this.aBooleanArray8[1] = false;
		}
	}

	@OriginalMember(owner = "client!agt", name = "bd", descriptor = "()V")
	void method8496() {
		if (this.aLong30 != 0L) {
			this.aClass104_Sub2_Sub1_2.method19558(this.aLong30);
			this.aLong30 = 0L;
		}
		if (this.aLong29 != 0L) {
			this.aClass104_Sub2_Sub1_2.method19558(this.aLong29);
			this.aLong29 = 0L;
		}
	}

	@OriginalMember(owner = "client!agt", name = "an", descriptor = "()V")
	void method8497() {
		if (this.aBooleanArray8[0]) {
			this.aClass104_Sub2_Sub1_2.aByteBuffer7.clear();
			this.aClass104_Sub2_Sub1_2.aByteBuffer7.asFloatBuffer().put(this.aFloatArrayArray13[0]);
			IDirect3DDevice.SetVertexShaderConstantF(this.aClass104_Sub2_Sub1_2.aLong121, 0, this.aClass104_Sub2_Sub1_2.aLong132, this.aFloatArrayArray13[0].length / 4);
			this.aBooleanArray8[0] = false;
		}
		if (this.aBooleanArray8[1]) {
			this.aClass104_Sub2_Sub1_2.aByteBuffer7.clear();
			this.aClass104_Sub2_Sub1_2.aByteBuffer7.asFloatBuffer().put(this.aFloatArrayArray13[1]);
			IDirect3DDevice.SetPixelShaderConstantF(this.aClass104_Sub2_Sub1_2.aLong121, 0, this.aClass104_Sub2_Sub1_2.aLong132, this.aFloatArrayArray13[1].length / 4);
			this.aBooleanArray8[1] = false;
		}
	}

	@OriginalMember(owner = "client!agt", name = "bi", descriptor = "()V")
	void method8498() {
		if (this.aLong30 != 0L) {
			this.aClass104_Sub2_Sub1_2.method19558(this.aLong30);
			this.aLong30 = 0L;
		}
		if (this.aLong29 != 0L) {
			this.aClass104_Sub2_Sub1_2.method19558(this.aLong29);
			this.aLong29 = 0L;
		}
	}

	@OriginalMember(owner = "client!agt", name = "aj", descriptor = "(IFFFF)V")
	@Override
	void method8472(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		this.aFloatArrayArray13[local3][local9] = arg1;
		this.aFloatArrayArray13[local3][local9 + 1] = arg2;
		this.aFloatArrayArray13[local3][local9 + 2] = arg3;
		this.aFloatArrayArray13[local3][local9 + 3] = arg4;
		this.aBooleanArray8[local3] = true;
	}

	@OriginalMember(owner = "client!agt", name = "ar", descriptor = "(ILclient!pq;)V")
	@Override
	void method8469(@OriginalArg(0) int arg0, @OriginalArg(1) Class489 arg1) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1.method30034(aFloatArray32), 0, this.aFloatArrayArray13[local3], local9, 16);
		this.aBooleanArray8[local3] = true;
	}

	@OriginalMember(owner = "client!agt", name = "ab", descriptor = "(ILclient!pq;)V")
	@Override
	void method8445(@OriginalArg(0) int arg0, @OriginalArg(1) Class489 arg1) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1.method30034(aFloatArray32), 0, this.aFloatArrayArray13[local3], local9, 12);
		this.aBooleanArray8[local3] = true;
	}

	@OriginalMember(owner = "client!agt", name = "r", descriptor = "(IFFF)V")
	@Override
	void method8443(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(9) int local9 = (arg0 & 0xFFFF) * 4;
		this.aFloatArrayArray13[local3][local9] = arg1;
		this.aFloatArrayArray13[local3][local9 + 1] = arg2;
		this.aFloatArrayArray13[local3][local9 + 2] = arg3;
		this.aBooleanArray8[local3] = true;
	}

	@OriginalMember(owner = "client!agt", name = "w", descriptor = "(Lclient!aql;FFF)V")
	@Override
	void method8463(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(3) int local3 = ((Class93_Sub33_Sub1_Sub1) arg0).method23420();
		@Pc(7) int local7 = ((Class93_Sub33_Sub1_Sub1) arg0).method23421();
		if (arg0.method23665(-1554618100) != Class323.aClass323_107) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		if (local3 >= 0) {
			local3 *= 4;
			this.aFloatArrayArray13[0][local3] = arg1;
			this.aFloatArrayArray13[0][local3 + 1] = arg2;
			this.aFloatArrayArray13[0][local3 + 2] = arg3;
			this.aBooleanArray8[0] = true;
		}
		if (local7 < 0) {
			return;
		}
		local7 *= 4;
		this.aFloatArrayArray13[1][local7] = arg1;
		this.aFloatArrayArray13[1][local7 + 1] = arg2;
		this.aFloatArrayArray13[1][local7 + 2] = arg3;
		this.aBooleanArray8[1] = true;
	}
}
