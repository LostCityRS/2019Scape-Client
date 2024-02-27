package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ahn")
public abstract class Class124_Sub3 extends Class124 {

	@OriginalMember(owner = "client!ahn", name = "bd", descriptor = "Lclient!cm;")
	public static Class100 aClass100_36;

	@OriginalMember(owner = "client!ahn", name = "m", descriptor = "[F")
	float[] aFloatArray70;

	@OriginalMember(owner = "client!ahn", name = "n", descriptor = "[Lclient!pe;")
	Class479[] aClass479Array5;

	@OriginalMember(owner = "client!ahn", name = "l", descriptor = "[I")
	int[] anIntArray257;

	@OriginalMember(owner = "client!ahn", name = "k", descriptor = "I")
	int anInt2979 = 0;

	@OriginalMember(owner = "client!ahn", name = "f", descriptor = "F")
	float aFloat219 = 0.0F;

	@OriginalMember(owner = "client!ahn", name = "w", descriptor = "F")
	float aFloat220 = 0.0F;

	@OriginalMember(owner = "client!ahn", name = "gq", descriptor = "(I)[Lclient!aal;")
	public static Class14[] method21465(@OriginalArg(0) int arg0) {
		if (Class53.aClass14Array2 == null) {
			@Pc(6) Class14[] local6 = Class629.method32442(Class556.aClass7_1, -1574654625);
			@Pc(10) Class14[] local10 = new Class14[local6.length];
			@Pc(12) int local12 = 0;
			@Pc(17) int local17 = Class51.aClass93_Sub36_1.aClass166_Sub24_1.method15877(64980131);
			label71: for (@Pc(19) int local19 = 0; local19 < local6.length; local19++) {
				@Pc(27) Class14 local27 = local6[local19];
				if ((local27.anInt51 * -787109915 <= 0 || local27.anInt51 * -787109915 >= 24) && local27.anInt49 * -1362482655 >= 800 && local27.anInt50 * 72041005 >= 600 && (local17 != 2 || local27.anInt49 * -1362482655 <= 800 && local27.anInt50 * 72041005 <= 600) && (local17 != 1 || local27.anInt49 * -1362482655 <= 1024 && local27.anInt50 * 72041005 <= 768)) {
					for (@Pc(86) int local86 = 0; local86 < local12; local86++) {
						@Pc(93) Class14 local93 = local10[local86];
						if (local93.anInt49 * -1362482655 == local27.anInt49 * -1362482655 && local93.anInt50 * 72041005 == local27.anInt50 * 72041005) {
							if (local27.anInt51 * -787109915 > local93.anInt51 * -787109915) {
								local10[local86] = local27;
							}
							continue label71;
						}
					}
					local10[local12] = local27;
					local12++;
				}
			}
			Class53.aClass14Array2 = new Class14[local12];
			System.arraycopy(local10, 0, Class53.aClass14Array2, 0, local12);
			@Pc(147) int[] local147 = new int[Class53.aClass14Array2.length];
			for (@Pc(149) int local149 = 0; local149 < Class53.aClass14Array2.length; local149++) {
				@Pc(157) Class14 local157 = Class53.aClass14Array2[local149];
				local147[local149] = local157.anInt50 * 72041005 * -1362482655 * local157.anInt49;
			}
			Class107.method18135(local147, Class53.aClass14Array2, 343012351);
		}
		return Class53.aClass14Array2;
	}

	@OriginalMember(owner = "client!ahn", name = "r", descriptor = "(B)Lclient!zg;")
	public static Class704 method21466(@OriginalArg(0) byte arg0) {
		return Class676.aClass704_1 == null ? Class704.aClass704_5 : Class676.aClass704_1;
	}

	@OriginalMember(owner = "client!ahn", name = "e", descriptor = "(I)[Lclient!zl;")
	public static Class709[] method21467(@OriginalArg(0) int arg0) {
		return new Class709[] { Class709.aClass709_8, Class709.aClass709_2, Class709.aClass709_3, Class709.aClass709_9, Class709.aClass709_11, Class709.aClass709_4, Class709.aClass709_10, Class709.aClass709_5, Class709.aClass709_6, Class709.aClass709_7 };
	}

	@OriginalMember(owner = "client!ahn", name = "<init>", descriptor = "(Lclient!je;)V")
	Class124_Sub3(@OriginalArg(0) Class123 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ahn", name = "ab", descriptor = "(Lclient!pe;IF)V")
	public final void method21443(@OriginalArg(0) Class479 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		if (this.aClass479Array5 == null) {
			this.aClass479Array5 = new Class479[] { arg0 };
			this.aFloatArray70 = new float[] { arg2 };
			this.anIntArray257 = new int[] { arg1 };
			return;
		}
		@Pc(35) Class479[] local35 = new Class479[this.aClass479Array5.length + 1];
		@Pc(42) float[] local42 = new float[this.aClass479Array5.length + 1];
		@Pc(49) int[] local49 = new int[this.aClass479Array5.length + 1];
		System.arraycopy(this.aClass479Array5, 0, local35, 0, this.aClass479Array5.length);
		System.arraycopy(this.aFloatArray70, 0, local42, 0, this.aClass479Array5.length);
		System.arraycopy(this.anIntArray257, 0, local49, 0, this.aClass479Array5.length);
		this.aClass479Array5 = local35;
		this.aFloatArray70 = local42;
		this.anIntArray257 = local49;
		this.aClass479Array5[this.aClass479Array5.length - 1] = arg0;
		this.aFloatArray70[this.aFloatArray70.length - 1] = arg2;
		this.anIntArray257[this.anIntArray257.length - 1] = arg1;
	}

	@OriginalMember(owner = "client!ahn", name = "t", descriptor = "(Lclient!pe;IFI)V")
	public final void method21444(@OriginalArg(0) Class479 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3) {
		if (this.aClass479Array5 == null) {
			this.aClass479Array5 = new Class479[] { arg0 };
			this.aFloatArray70 = new float[] { arg2 };
			this.anIntArray257 = new int[] { arg1 };
			return;
		}
		@Pc(35) Class479[] local35 = new Class479[this.aClass479Array5.length + 1];
		@Pc(42) float[] local42 = new float[this.aClass479Array5.length + 1];
		@Pc(49) int[] local49 = new int[this.aClass479Array5.length + 1];
		System.arraycopy(this.aClass479Array5, 0, local35, 0, this.aClass479Array5.length);
		System.arraycopy(this.aFloatArray70, 0, local42, 0, this.aClass479Array5.length);
		System.arraycopy(this.anIntArray257, 0, local49, 0, this.aClass479Array5.length);
		this.aClass479Array5 = local35;
		this.aFloatArray70 = local42;
		this.anIntArray257 = local49;
		this.aClass479Array5[this.aClass479Array5.length - 1] = arg0;
		this.aFloatArray70[this.aFloatArray70.length - 1] = arg2;
		this.anIntArray257[this.anIntArray257.length - 1] = arg1;
	}

	@OriginalMember(owner = "client!ahn", name = "h", descriptor = "(F[[[ILclient!qx;II)V")
	@Override
	public final void method21426(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class520 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) Class479 local7 = this.aClass479Array5[this.anInt2979 * -1041839613];
		if (this.aFloatArray70[this.anInt2979 * -1041839613] > 0.0F) {
			if (this.aFloatArray70[this.anInt2979 * -1041839613] >= arg0) {
				this.aFloatArray70[this.anInt2979 * -1041839613] -= arg0;
				return;
			}
			arg0 -= this.aFloatArray70[this.anInt2979 * -1041839613];
			this.aFloatArray70[this.anInt2979 * -1041839613] = 0.0F;
		}
		@Pc(63) float local63 = 1.0F / (float) Class451.method29129((byte) 3);
		while (arg0 > 0.0F) {
			@Pc(70) float local70 = local7.method29894();
			if (this.aFloat219 >= local70) {
				if (this.aClass479Array5.length == this.anInt2979 * -1041839613 + 1) {
					return;
				}
				if (this.aFloatArray70[this.anInt2979 * -1041839613 + 1] >= arg0) {
					this.aFloatArray70[this.anInt2979 * -1041839613 + 1] -= arg0;
					return;
				}
				this.anInt2979 += 1487384747;
				arg0 -= this.aFloatArray70[this.anInt2979 * -1041839613];
				this.aFloatArray70[this.anInt2979 * -1041839613] = 0.0F;
				this.method21447(705522026);
				this.aFloat219 = 0.0F;
				this.aFloat220 = 0.0F;
				local7 = this.aClass479Array5[this.anInt2979 * -1041839613];
				local70 = local7.method29894();
			}
			while (arg0 > 0.0F && this.aFloat219 < local70) {
				this.aFloat220 = this.method21446(local70, this.aFloat220, Math.min(arg0, local63), (byte) -45);
				arg0 -= local63;
				this.method21445(this.aFloat220, local70, 31361810);
			}
		}
	}

	@OriginalMember(owner = "client!ahn", name = "ae", descriptor = "(FFI)V")
	void method21445(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2) {
		this.aFloat219 += arg0;
		if (this.aFloat219 > arg1) {
			this.aFloat219 = arg1;
		}
	}

	@OriginalMember(owner = "client!ahn", name = "ag", descriptor = "(FFFB)F")
	abstract float method21446(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) byte arg3);

	@OriginalMember(owner = "client!ahn", name = "ah", descriptor = "(I)V")
	abstract void method21447(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ahn", name = "v", descriptor = "()Lclient!akt;")
	@Override
	public final Class93_Sub30 method21424() {
		@Pc(3) Class472 local3 = this.method21414((byte) 41);
		return new Class93_Sub30(0, (int) local3.aFloat325, (int) local3.aFloat326, (int) local3.aFloat327);
	}

	@OriginalMember(owner = "client!ahn", name = "m", descriptor = "(B)Lclient!ox;")
	@Override
	public Class472 method21414(@OriginalArg(0) byte arg0) {
		@Pc(1) Class472 local1 = Class472.method29709();
		@Pc(12) double[] local12 = this.aClass479Array5[this.anInt2979 * -1041839613].method29895(this.aFloat219);
		local1.aFloat325 = (float) local12[0];
		local1.aFloat326 = (float) local12[1];
		local1.aFloat327 = (float) local12[2];
		return local1;
	}

	@OriginalMember(owner = "client!ahn", name = "k", descriptor = "(I)[D")
	@Override
	public double[] method21425(@OriginalArg(0) int arg0) {
		return this.aClass479Array5[this.anInt2979 * -1041839613].method29895(this.aFloat219);
	}

	@OriginalMember(owner = "client!ahn", name = "f", descriptor = "(B)Lclient!akt;")
	@Override
	public final Class93_Sub30 method21416(@OriginalArg(0) byte arg0) {
		@Pc(3) Class472 local3 = this.method21414((byte) 61);
		return new Class93_Sub30(0, (int) local3.aFloat325, (int) local3.aFloat326, (int) local3.aFloat327);
	}

	@OriginalMember(owner = "client!ahn", name = "y", descriptor = "()F")
	@Override
	public float method21428() {
		return this.aClass479Array5[this.anInt2979 * -1041839613].method29892(this.aFloat219);
	}

	@OriginalMember(owner = "client!ahn", name = "w", descriptor = "(I)F")
	@Override
	public float method21417(@OriginalArg(0) int arg0) {
		return this.aClass479Array5[this.anInt2979 * -1041839613].method29892(this.aFloat219);
	}

	@OriginalMember(owner = "client!ahn", name = "l", descriptor = "(Lclient!ju;IIB)V")
	@Override
	public final void method21418(@OriginalArg(0) Class368 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(3) Class472 local3 = this.method21414((byte) 121);
		arg0.anInt4747 = ((int) local3.aFloat325 - arg1) * -255666073;
		arg0.anInt4748 = (int) -local3.aFloat326 * -543294551;
		arg0.anInt4749 = ((int) local3.aFloat327 - arg2) * -513444905;
	}

	@OriginalMember(owner = "client!ahn", name = "u", descriptor = "(Lclient!alw;I)V")
	@Override
	public final void method21419(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		this.aFloat219 = 0.0F;
		this.aFloat220 = 0.0F;
		this.anInt2979 = 0;
		@Pc(12) int local12 = arg0.method22425((short) 16384);
		this.aClass479Array5 = new Class479[local12];
		this.aFloatArray70 = new float[local12];
		for (@Pc(22) int local22 = 0; local22 < local12; local22++) {
			this.aClass479Array5[local22] = new Class479(arg0);
			this.aFloatArray70[local22] = arg0.method22437(-1895027303);
		}
		this.method21448(arg0, local12, (short) -8989);
	}

	@OriginalMember(owner = "client!ahn", name = "ac", descriptor = "(Lclient!alw;IS)V")
	abstract void method21448(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) short arg2);

	@OriginalMember(owner = "client!ahn", name = "ai", descriptor = "(FFF)F")
	abstract float method21449(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!ahn", name = "aw", descriptor = "(FFF)F")
	abstract float method21450(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!ahn", name = "as", descriptor = "(FFF)F")
	abstract float method21451(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!ahn", name = "at", descriptor = "()V")
	abstract void method21452();

	@OriginalMember(owner = "client!ahn", name = "d", descriptor = "()[D")
	@Override
	public double[] method21415() {
		return this.aClass479Array5[this.anInt2979 * -1041839613].method29895(this.aFloat219);
	}

	@OriginalMember(owner = "client!ahn", name = "am", descriptor = "()V")
	abstract void method21453();

	@OriginalMember(owner = "client!ahn", name = "au", descriptor = "()V")
	abstract void method21454();

	@OriginalMember(owner = "client!ahn", name = "b", descriptor = "(F[[[ILclient!qx;II)V")
	@Override
	public final void method21431(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class520 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) Class479 local7 = this.aClass479Array5[this.anInt2979 * -1041839613];
		if (this.aFloatArray70[this.anInt2979 * -1041839613] > 0.0F) {
			if (this.aFloatArray70[this.anInt2979 * -1041839613] >= arg0) {
				this.aFloatArray70[this.anInt2979 * -1041839613] -= arg0;
				return;
			}
			arg0 -= this.aFloatArray70[this.anInt2979 * -1041839613];
			this.aFloatArray70[this.anInt2979 * -1041839613] = 0.0F;
		}
		@Pc(63) float local63 = 1.0F / (float) Class451.method29129((byte) 3);
		while (arg0 > 0.0F) {
			@Pc(70) float local70 = local7.method29894();
			if (this.aFloat219 >= local70) {
				if (this.aClass479Array5.length == this.anInt2979 * -1041839613 + 1) {
					return;
				}
				if (this.aFloatArray70[this.anInt2979 * -1041839613 + 1] >= arg0) {
					this.aFloatArray70[this.anInt2979 * -1041839613 + 1] -= arg0;
					return;
				}
				this.anInt2979 += 1487384747;
				arg0 -= this.aFloatArray70[this.anInt2979 * -1041839613];
				this.aFloatArray70[this.anInt2979 * -1041839613] = 0.0F;
				this.method21447(845728298);
				this.aFloat219 = 0.0F;
				this.aFloat220 = 0.0F;
				local7 = this.aClass479Array5[this.anInt2979 * -1041839613];
				local70 = local7.method29894();
			}
			while (arg0 > 0.0F && this.aFloat219 < local70) {
				this.aFloat220 = this.method21446(local70, this.aFloat220, Math.min(arg0, local63), (byte) -38);
				arg0 -= local63;
				this.method21445(this.aFloat220, local70, 517440481);
			}
		}
	}

	@OriginalMember(owner = "client!ahn", name = "ad", descriptor = "()V")
	abstract void method21455();

	@OriginalMember(owner = "client!ahn", name = "a", descriptor = "(F[[[ILclient!qx;II)V")
	@Override
	public final void method21434(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class520 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) Class479 local7 = this.aClass479Array5[this.anInt2979 * -1041839613];
		if (this.aFloatArray70[this.anInt2979 * -1041839613] > 0.0F) {
			if (this.aFloatArray70[this.anInt2979 * -1041839613] >= arg0) {
				this.aFloatArray70[this.anInt2979 * -1041839613] -= arg0;
				return;
			}
			arg0 -= this.aFloatArray70[this.anInt2979 * -1041839613];
			this.aFloatArray70[this.anInt2979 * -1041839613] = 0.0F;
		}
		@Pc(63) float local63 = 1.0F / (float) Class451.method29129((byte) 3);
		while (arg0 > 0.0F) {
			@Pc(70) float local70 = local7.method29894();
			if (this.aFloat219 >= local70) {
				if (this.aClass479Array5.length == this.anInt2979 * -1041839613 + 1) {
					return;
				}
				if (this.aFloatArray70[this.anInt2979 * -1041839613 + 1] >= arg0) {
					this.aFloatArray70[this.anInt2979 * -1041839613 + 1] -= arg0;
					return;
				}
				this.anInt2979 += 1487384747;
				arg0 -= this.aFloatArray70[this.anInt2979 * -1041839613];
				this.aFloatArray70[this.anInt2979 * -1041839613] = 0.0F;
				this.method21447(1997505388);
				this.aFloat219 = 0.0F;
				this.aFloat220 = 0.0F;
				local7 = this.aClass479Array5[this.anInt2979 * -1041839613];
				local70 = local7.method29894();
			}
			while (arg0 > 0.0F && this.aFloat219 < local70) {
				this.aFloat220 = this.method21446(local70, this.aFloat220, Math.min(arg0, local63), (byte) -19);
				arg0 -= local63;
				this.method21445(this.aFloat220, local70, 1314729891);
			}
		}
	}

	@OriginalMember(owner = "client!ahn", name = "e", descriptor = "(F[[[ILclient!qx;IIB)V")
	@Override
	public final void method21433(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class520 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5) {
		@Pc(7) Class479 local7 = this.aClass479Array5[this.anInt2979 * -1041839613];
		if (this.aFloatArray70[this.anInt2979 * -1041839613] > 0.0F) {
			if (this.aFloatArray70[this.anInt2979 * -1041839613] >= arg0) {
				this.aFloatArray70[this.anInt2979 * -1041839613] -= arg0;
				return;
			}
			arg0 -= this.aFloatArray70[this.anInt2979 * -1041839613];
			this.aFloatArray70[this.anInt2979 * -1041839613] = 0.0F;
		}
		@Pc(63) float local63 = 1.0F / (float) Class451.method29129((byte) 3);
		while (arg0 > 0.0F) {
			@Pc(70) float local70 = local7.method29894();
			if (this.aFloat219 >= local70) {
				if (this.aClass479Array5.length == this.anInt2979 * -1041839613 + 1) {
					return;
				}
				if (this.aFloatArray70[this.anInt2979 * -1041839613 + 1] >= arg0) {
					this.aFloatArray70[this.anInt2979 * -1041839613 + 1] -= arg0;
					return;
				}
				this.anInt2979 += 1487384747;
				arg0 -= this.aFloatArray70[this.anInt2979 * -1041839613];
				this.aFloatArray70[this.anInt2979 * -1041839613] = 0.0F;
				this.method21447(1849017786);
				this.aFloat219 = 0.0F;
				this.aFloat220 = 0.0F;
				local7 = this.aClass479Array5[this.anInt2979 * -1041839613];
				local70 = local7.method29894();
			}
			while (arg0 > 0.0F && this.aFloat219 < local70) {
				this.aFloat220 = this.method21446(local70, this.aFloat220, Math.min(arg0, local63), (byte) -16);
				arg0 -= local63;
				this.method21445(this.aFloat220, local70, 320129103);
			}
		}
	}

	@OriginalMember(owner = "client!ahn", name = "p", descriptor = "()Z")
	@Override
	public final boolean method21421() {
		return this.aClass479Array5 != null;
	}

	@OriginalMember(owner = "client!ahn", name = "ao", descriptor = "()F")
	public float method21456() {
		return this.aClass479Array5[this.anInt2979 * -1041839613].method29901(this.aFloat219);
	}

	@OriginalMember(owner = "client!ahn", name = "r", descriptor = "()Lclient!akt;")
	@Override
	public final Class93_Sub30 method21432() {
		@Pc(3) Class472 local3 = this.method21414((byte) 105);
		return new Class93_Sub30(0, (int) local3.aFloat325, (int) local3.aFloat326, (int) local3.aFloat327);
	}

	@OriginalMember(owner = "client!ahn", name = "q", descriptor = "(Lclient!alw;)V")
	@Override
	public final void method21429(@OriginalArg(0) Class93_Sub41 arg0) {
		this.aFloat219 = 0.0F;
		this.aFloat220 = 0.0F;
		this.anInt2979 = 0;
		@Pc(12) int local12 = arg0.method22425((short) 16384);
		this.aClass479Array5 = new Class479[local12];
		this.aFloatArray70 = new float[local12];
		for (@Pc(22) int local22 = 0; local22 < local12; local22++) {
			this.aClass479Array5[local22] = new Class479(arg0);
			this.aFloatArray70[local22] = arg0.method22437(694032064);
		}
		this.method21448(arg0, local12, (short) -6904);
	}

	@OriginalMember(owner = "client!ahn", name = "o", descriptor = "()Lclient!akt;")
	@Override
	public final Class93_Sub30 method21422() {
		@Pc(3) Class472 local3 = this.method21414((byte) 70);
		return new Class93_Sub30(0, (int) local3.aFloat325, (int) local3.aFloat326, (int) local3.aFloat327);
	}

	@OriginalMember(owner = "client!ahn", name = "s", descriptor = "()F")
	@Override
	public float method21427() {
		return this.aClass479Array5[this.anInt2979 * -1041839613].method29892(this.aFloat219);
	}

	@OriginalMember(owner = "client!ahn", name = "n", descriptor = "(I)Z")
	@Override
	public final boolean method21413(@OriginalArg(0) int arg0) {
		return this.aClass479Array5 != null;
	}

	@OriginalMember(owner = "client!ahn", name = "al", descriptor = "(I)F")
	public float method21457(@OriginalArg(0) int arg0) {
		return this.aClass479Array5[this.anInt2979 * -1041839613].method29901(this.aFloat219);
	}

	@OriginalMember(owner = "client!ahn", name = "x", descriptor = "(Lclient!alw;)V")
	@Override
	public final void method21430(@OriginalArg(0) Class93_Sub41 arg0) {
		this.aFloat219 = 0.0F;
		this.aFloat220 = 0.0F;
		this.anInt2979 = 0;
		@Pc(12) int local12 = arg0.method22425((short) 16384);
		this.aClass479Array5 = new Class479[local12];
		this.aFloatArray70 = new float[local12];
		for (@Pc(22) int local22 = 0; local22 < local12; local22++) {
			this.aClass479Array5[local22] = new Class479(arg0);
			this.aFloatArray70[local22] = arg0.method22437(190811027);
		}
		this.method21448(arg0, local12, (short) -26503);
	}

	@OriginalMember(owner = "client!ahn", name = "c", descriptor = "()Lclient!akt;")
	@Override
	public final Class93_Sub30 method21423() {
		@Pc(3) Class472 local3 = this.method21414((byte) 14);
		return new Class93_Sub30(0, (int) local3.aFloat325, (int) local3.aFloat326, (int) local3.aFloat327);
	}

	@OriginalMember(owner = "client!ahn", name = "ar", descriptor = "(Lclient!alw;I)V")
	abstract void method21458(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ahn", name = "ap", descriptor = "(Lclient!alw;I)V")
	abstract void method21459(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ahn", name = "g", descriptor = "()Lclient!ox;")
	@Override
	public Class472 method21435() {
		@Pc(1) Class472 local1 = Class472.method29709();
		@Pc(12) double[] local12 = this.aClass479Array5[this.anInt2979 * -1041839613].method29895(this.aFloat219);
		local1.aFloat325 = (float) local12[0];
		local1.aFloat326 = (float) local12[1];
		local1.aFloat327 = (float) local12[2];
		return local1;
	}

	@OriginalMember(owner = "client!ahn", name = "i", descriptor = "(Lclient!ju;II)V")
	@Override
	public final void method21412(@OriginalArg(0) Class368 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class472 local3 = this.method21414((byte) 81);
		arg0.anInt4747 = ((int) local3.aFloat325 - arg1) * -255666073;
		arg0.anInt4748 = (int) -local3.aFloat326 * -543294551;
		arg0.anInt4749 = ((int) local3.aFloat327 - arg2) * -513444905;
	}

	@OriginalMember(owner = "client!ahn", name = "j", descriptor = "(Lclient!ju;II)V")
	@Override
	public final void method21436(@OriginalArg(0) Class368 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class472 local3 = this.method21414((byte) 80);
		arg0.anInt4747 = ((int) local3.aFloat325 - arg1) * -255666073;
		arg0.anInt4748 = (int) -local3.aFloat326 * -543294551;
		arg0.anInt4749 = ((int) local3.aFloat327 - arg2) * -513444905;
	}

	@OriginalMember(owner = "client!ahn", name = "aq", descriptor = "(FF)V")
	void method21460(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat219 += arg0;
		if (this.aFloat219 > arg1) {
			this.aFloat219 = arg1;
		}
	}

	@OriginalMember(owner = "client!ahn", name = "ax", descriptor = "(FF)V")
	void method21461(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat219 += arg0;
		if (this.aFloat219 > arg1) {
			this.aFloat219 = arg1;
		}
	}

	@OriginalMember(owner = "client!ahn", name = "av", descriptor = "()F")
	public float method21462() {
		return this.aClass479Array5[this.anInt2979 * -1041839613].method29901(this.aFloat219);
	}

	@OriginalMember(owner = "client!ahn", name = "aj", descriptor = "()F")
	public float method21463() {
		return this.aClass479Array5[this.anInt2979 * -1041839613].method29901(this.aFloat219);
	}

	@OriginalMember(owner = "client!ahn", name = "ay", descriptor = "()F")
	public float method21464() {
		return this.aClass479Array5[this.anInt2979 * -1041839613].method29901(this.aFloat219);
	}

	@OriginalMember(owner = "client!ahn", name = "z", descriptor = "()Z")
	@Override
	public final boolean method21420() {
		return this.aClass479Array5 != null;
	}
}
