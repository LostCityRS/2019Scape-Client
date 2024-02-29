package com.jagex;

import java.nio.ByteBuffer;
import java.util.Arrays;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public class Class331 {

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "J")
	public long aLong259;

	@OriginalMember(owner = "client!ia", name = "n", descriptor = "[I")
	int[] anIntArray408;

	@OriginalMember(owner = "client!ia", name = "m", descriptor = "[F")
	float[] aFloatArray105;

	@OriginalMember(owner = "client!ia", name = "k", descriptor = "[[I")
	int[][] anIntArrayArray52;

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "[[I")
	int[][] anIntArrayArray53;

	@OriginalMember(owner = "client!ia", name = "w", descriptor = "[S")
	public short[] aShortArray113;

	@OriginalMember(owner = "client!ia", name = "l", descriptor = "[S")
	public short[] aShortArray114;

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(J[I[F[[I[[I[S[S)V", line = 12)
	public Class331(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int[][] arg4, @OriginalArg(5) short[] arg5, @OriginalArg(6) short[] arg6) {
		this.aLong259 = arg0 * 6591543353939106377L;
		this.anIntArray408 = arg1;
		this.aFloatArray105 = arg2;
		this.anIntArrayArray52 = arg3;
		this.anIntArrayArray53 = arg4;
		this.aShortArray113 = arg5;
		this.aShortArray114 = arg6;
	}

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lclient!if;Z)V", line = 22)
	public Class331(@OriginalArg(0) Class336 arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			this.anIntArray408 = new int[arg0.anIntArray414.length];
			this.aFloatArray105 = new float[arg0.anIntArray414.length];
			this.anIntArrayArray52 = new int[arg0.anIntArray414.length][3];
			this.anIntArrayArray53 = new int[arg0.anIntArray414.length][3];
			System.arraycopy(arg0.anIntArray414, 0, this.anIntArray408, 0, this.anIntArray408.length);
		} else {
			this.anIntArray408 = new int[arg0.anIntArray410.length];
			this.aFloatArray105 = new float[arg0.anIntArray410.length];
			this.anIntArrayArray52 = new int[arg0.anIntArray410.length][3];
			this.anIntArrayArray53 = new int[arg0.anIntArray410.length][3];
			System.arraycopy(arg0.anIntArray410, 0, this.anIntArray408, 0, this.anIntArray408.length);
		}
		if (arg0.aShortArray118 != null) {
			this.aShortArray113 = new short[arg0.aShortArray118.length];
			System.arraycopy(arg0.aShortArray118, 0, this.aShortArray113, 0, this.aShortArray113.length);
		}
		if (arg0.aShortArray120 != null) {
			this.aShortArray114 = new short[arg0.aShortArray120.length];
			System.arraycopy(arg0.aShortArray120, 0, this.aShortArray114, 0, this.aShortArray114.length);
		}
	}

	@OriginalMember(owner = "client!ia", name = "n", descriptor = "(Ljava/lang/Object;ZI)[B", line = 25)
	public static byte[] method27374(@OriginalArg(0) Object arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(11) byte[] local11 = (byte[]) arg0;
			return arg1 ? Arrays.copyOf(local11, local11.length) : local11;
		} else if (arg0 instanceof ByteBuffer) {
			@Pc(26) ByteBuffer local26 = (ByteBuffer) arg0;
			@Pc(30) byte[] local30 = new byte[local26.capacity()];
			local26.position(0);
			local26.get(local30);
			return local30;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ia", name = "e", descriptor = "(IIFIIIIIIB)V", line = 48)
	public void method27375(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) byte arg9) {
		this.method27380(arg0, 2047970158);
		this.anIntArray408[arg0] = arg1;
		this.aFloatArray105[arg0] = arg2;
		this.anIntArrayArray52[arg0][0] = arg3;
		this.anIntArrayArray52[arg0][1] = arg4;
		this.anIntArrayArray52[arg0][2] = arg5;
		this.anIntArrayArray53[arg0][0] = arg6;
		this.anIntArrayArray53[arg0][1] = arg7;
		this.anIntArrayArray53[arg0][2] = arg8;
	}

	@OriginalMember(owner = "client!ia", name = "k", descriptor = "(IIFIIIIII)V", line = 48)
	public void method27376(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.method27380(arg0, 2047970158);
		this.anIntArray408[arg0] = arg1;
		this.aFloatArray105[arg0] = arg2;
		this.anIntArrayArray52[arg0][0] = arg3;
		this.anIntArrayArray52[arg0][1] = arg4;
		this.anIntArrayArray52[arg0][2] = arg5;
		this.anIntArrayArray53[arg0][0] = arg6;
		this.anIntArrayArray53[arg0][1] = arg7;
		this.anIntArrayArray53[arg0][2] = arg8;
	}

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "(IIFIIIIII)V", line = 48)
	public void method27377(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.method27380(arg0, 2047970158);
		this.anIntArray408[arg0] = arg1;
		this.aFloatArray105[arg0] = arg2;
		this.anIntArrayArray52[arg0][0] = arg3;
		this.anIntArrayArray52[arg0][1] = arg4;
		this.anIntArrayArray52[arg0][2] = arg5;
		this.anIntArrayArray53[arg0][0] = arg6;
		this.anIntArrayArray53[arg0][1] = arg7;
		this.anIntArrayArray53[arg0][2] = arg8;
	}

	@OriginalMember(owner = "client!ia", name = "n", descriptor = "(III)V", line = 60)
	public void method27378(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method27380(arg0, 2047970158);
		this.anIntArray408[arg0] = arg1;
	}

	@OriginalMember(owner = "client!ia", name = "w", descriptor = "(II)V", line = 60)
	public void method27379(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method27380(arg0, 2047970158);
		this.anIntArray408[arg0] = arg1;
	}

	@OriginalMember(owner = "client!ia", name = "m", descriptor = "(II)V", line = 65)
	void method27380(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 < this.anIntArray408.length) {
			return;
		}
		@Pc(9) int[] local9 = new int[arg0 + 1];
		@Pc(14) float[] local14 = new float[arg0 + 1];
		@Pc(20) int[][] local20 = new int[arg0 + 1][3];
		@Pc(26) int[][] local26 = new int[arg0 + 1][3];
		System.arraycopy(this.anIntArray408, 0, local9, 0, this.anIntArray408.length);
		System.arraycopy(this.aFloatArray105, 0, local14, 0, this.aFloatArray105.length);
		@Pc(46) int local46;
		for (local46 = 0; local46 < this.anIntArray408.length; local46++) {
			System.arraycopy(this.anIntArrayArray52[local46], 0, local20[local46], 0, 3);
			System.arraycopy(this.anIntArrayArray53[local46], 0, local26[local46], 0, 3);
		}
		for (local46 = this.anIntArray408.length; local46 <= arg0; local46++) {
			local9[local46] = -1;
		}
		this.anIntArray408 = local9;
		this.aFloatArray105 = local14;
		this.anIntArrayArray52 = local20;
		this.anIntArrayArray53 = local26;
	}

	@OriginalMember(owner = "client!ia", name = "u", descriptor = "(I)V", line = 65)
	void method27381(@OriginalArg(0) int arg0) {
		if (arg0 < this.anIntArray408.length) {
			return;
		}
		@Pc(9) int[] local9 = new int[arg0 + 1];
		@Pc(14) float[] local14 = new float[arg0 + 1];
		@Pc(20) int[][] local20 = new int[arg0 + 1][3];
		@Pc(26) int[][] local26 = new int[arg0 + 1][3];
		System.arraycopy(this.anIntArray408, 0, local9, 0, this.anIntArray408.length);
		System.arraycopy(this.aFloatArray105, 0, local14, 0, this.aFloatArray105.length);
		@Pc(46) int local46;
		for (local46 = 0; local46 < this.anIntArray408.length; local46++) {
			System.arraycopy(this.anIntArrayArray52[local46], 0, local20[local46], 0, 3);
			System.arraycopy(this.anIntArrayArray53[local46], 0, local26[local46], 0, 3);
		}
		for (local46 = this.anIntArray408.length; local46 <= arg0; local46++) {
			local9[local46] = -1;
		}
		this.anIntArray408 = local9;
		this.aFloatArray105 = local14;
		this.anIntArrayArray52 = local20;
		this.anIntArrayArray53 = local26;
	}

	@OriginalMember(owner = "client!ia", name = "l", descriptor = "(I)V", line = 65)
	void method27382(@OriginalArg(0) int arg0) {
		if (arg0 < this.anIntArray408.length) {
			return;
		}
		@Pc(9) int[] local9 = new int[arg0 + 1];
		@Pc(14) float[] local14 = new float[arg0 + 1];
		@Pc(20) int[][] local20 = new int[arg0 + 1][3];
		@Pc(26) int[][] local26 = new int[arg0 + 1][3];
		System.arraycopy(this.anIntArray408, 0, local9, 0, this.anIntArray408.length);
		System.arraycopy(this.aFloatArray105, 0, local14, 0, this.aFloatArray105.length);
		@Pc(46) int local46;
		for (local46 = 0; local46 < this.anIntArray408.length; local46++) {
			System.arraycopy(this.anIntArrayArray52[local46], 0, local20[local46], 0, 3);
			System.arraycopy(this.anIntArrayArray53[local46], 0, local26[local46], 0, 3);
		}
		for (local46 = this.anIntArray408.length; local46 <= arg0; local46++) {
			local9[local46] = -1;
		}
		this.anIntArray408 = local9;
		this.aFloatArray105 = local14;
		this.anIntArrayArray52 = local20;
		this.anIntArrayArray53 = local26;
	}

	@OriginalMember(owner = "client!ia", name = "p", descriptor = "(I)V", line = 65)
	void method27383(@OriginalArg(0) int arg0) {
		if (arg0 < this.anIntArray408.length) {
			return;
		}
		@Pc(9) int[] local9 = new int[arg0 + 1];
		@Pc(14) float[] local14 = new float[arg0 + 1];
		@Pc(20) int[][] local20 = new int[arg0 + 1][3];
		@Pc(26) int[][] local26 = new int[arg0 + 1][3];
		System.arraycopy(this.anIntArray408, 0, local9, 0, this.anIntArray408.length);
		System.arraycopy(this.aFloatArray105, 0, local14, 0, this.aFloatArray105.length);
		@Pc(46) int local46;
		for (local46 = 0; local46 < this.anIntArray408.length; local46++) {
			System.arraycopy(this.anIntArrayArray52[local46], 0, local20[local46], 0, 3);
			System.arraycopy(this.anIntArrayArray53[local46], 0, local26[local46], 0, 3);
		}
		for (local46 = this.anIntArray408.length; local46 <= arg0; local46++) {
			local9[local46] = -1;
		}
		this.anIntArray408 = local9;
		this.aFloatArray105 = local14;
		this.anIntArrayArray52 = local20;
		this.anIntArrayArray53 = local26;
	}

	@OriginalMember(owner = "client!ia", name = "z", descriptor = "(I)V", line = 65)
	void method27384(@OriginalArg(0) int arg0) {
		if (arg0 < this.anIntArray408.length) {
			return;
		}
		@Pc(9) int[] local9 = new int[arg0 + 1];
		@Pc(14) float[] local14 = new float[arg0 + 1];
		@Pc(20) int[][] local20 = new int[arg0 + 1][3];
		@Pc(26) int[][] local26 = new int[arg0 + 1][3];
		System.arraycopy(this.anIntArray408, 0, local9, 0, this.anIntArray408.length);
		System.arraycopy(this.aFloatArray105, 0, local14, 0, this.aFloatArray105.length);
		@Pc(46) int local46;
		for (local46 = 0; local46 < this.anIntArray408.length; local46++) {
			System.arraycopy(this.anIntArrayArray52[local46], 0, local20[local46], 0, 3);
			System.arraycopy(this.anIntArrayArray53[local46], 0, local26[local46], 0, 3);
		}
		for (local46 = this.anIntArray408.length; local46 <= arg0; local46++) {
			local9[local46] = -1;
		}
		this.anIntArray408 = local9;
		this.aFloatArray105 = local14;
		this.anIntArrayArray52 = local20;
		this.anIntArrayArray53 = local26;
	}

	@OriginalMember(owner = "client!ia", name = "y", descriptor = "(IILclient!hf;Lclient!hx;IIS)V", line = 578)
	static void method27385(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class312 arg2, @OriginalArg(3) Class327 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) short arg6) {
		@Pc(1) Class173[] local1 = client.aClass173Array1;
		for (@Pc(3) int local3 = 0; local3 < local1.length; local3++) {
			@Pc(11) Class173 local11 = local1[local3];
			if (local11 != null && local11.anInt3247 * 1661685955 != 0 && client.anInt3485 % 20 < 10) {
				@Pc(59) int local59;
				if (local11.anInt3247 * 1661685955 == 1) {
					@Pc(39) Class93_Sub15 local39 = (Class93_Sub15) client.aClass16_18.method214((long) (local11.anInt3246 * -1095042687));
					if (local39 != null) {
						@Pc(45) Class132_Sub1_Sub1_Sub1_Sub1 local45 = (Class132_Sub1_Sub1_Sub1_Sub1) local39.anObject5;
						@Pc(49) Class472 local49 = local45.method24220().aClass472_61;
						local59 = (int) local49.aFloat317 / 128 - arg0 / 128;
						@Pc(69) int local69 = (int) local49.aFloat319 / 128 - arg1 / 128;
						Class66.method1197(arg2, arg3, arg4, arg5, local59, local69, local11.anInt3253 * -2053428357, 360000L);
					}
				}
				if (local11.anInt3247 * 1661685955 == 2) {
					@Pc(98) int local98 = local11.anInt3248 * 846615897 / 128 - arg0 / 128;
					@Pc(109) int local109 = local11.anInt3249 * 166908561 / 128 - arg1 / 128;
					@Pc(117) long local117 = (long) (local11.anInt3250 * -1294740227 << 7);
					@Pc(121) long local121 = local117 * local117;
					Class66.method1197(arg2, arg3, arg4, arg5, local98, local109, local11.anInt3253 * -2053428357, local121);
				}
				if (local11.anInt3247 * 1661685955 == 10 && local11.anInt3246 * -1095042687 >= 0 && local11.anInt3246 * -1095042687 < client.aClass132_Sub1_Sub1_Sub1_Sub2Array1.length) {
					@Pc(158) Class132_Sub1_Sub1_Sub1_Sub2 local158 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[local11.anInt3246 * -1095042687];
					if (local158 != null) {
						@Pc(164) Class472 local164 = local158.method24220().aClass472_61;
						@Pc(174) int local174 = (int) local164.aFloat317 / 128 - arg0 / 128;
						local59 = (int) local164.aFloat319 / 128 - arg1 / 128;
						Class66.method1197(arg2, arg3, arg4, arg5, local174, local59, local11.anInt3253 * -2053428357, 360000L);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ia", name = "bah", descriptor = "(Lclient!yf;I)V", line = 14268)
	static final void method27386(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub17_1.method16546(local12, -2095582490);
	}
}
