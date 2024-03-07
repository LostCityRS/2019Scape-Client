package com.jagex;

import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aek")
public class Class99_Sub2 extends Class99 {

	@OriginalMember(owner = "client!aek", name = "l", descriptor = "I")
	static final int anInt368 = 74;

	@OriginalMember(owner = "client!aek", name = "w", descriptor = "I")
	static final int anInt374 = 1;

	@OriginalMember(owner = "client!aek", name = "ar", descriptor = "[F")
	static final float[] aFloatArray2 = new float[16];

	@OriginalMember(owner = "client!aek", name = "ag", descriptor = "Lclient!bp;")
	Class193 aClass193_1;

	@OriginalMember(owner = "client!aek", name = "v", descriptor = "I")
	int anInt372;

	@OriginalMember(owner = "client!aek", name = "r", descriptor = "I")
	int anInt373;

	@OriginalMember(owner = "client!aek", name = "a", descriptor = "[[[I")
	int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!aek", name = "t", descriptor = "[Lclient!tj;")
	Class93[] aClass93Array2;

	@OriginalMember(owner = "client!aek", name = "ae", descriptor = "Lclient!bv;")
	Interface14 anInterface14_1;

	@OriginalMember(owner = "client!aek", name = "ah", descriptor = "Lclient!bp;")
	Class193 aClass193_2;

	@OriginalMember(owner = "client!aek", name = "ac", descriptor = "Lclient!bp;")
	Class193 aClass193_3;

	@OriginalMember(owner = "client!aek", name = "ai", descriptor = "I")
	int anInt375;

	@OriginalMember(owner = "client!aek", name = "aw", descriptor = "I")
	int anInt376;

	@OriginalMember(owner = "client!aek", name = "al", descriptor = "Lclient!bp;")
	Class193 aClass193_4;

	@OriginalMember(owner = "client!aek", name = "j", descriptor = "Lclient!aat;")
	Class22 aClass22_3 = new Class22();

	@OriginalMember(owner = "client!aek", name = "u", descriptor = "Lclient!afa;")
	final Class104_Sub1 aClass104_Sub1_12;

	@OriginalMember(owner = "client!aek", name = "z", descriptor = "I")
	int anInt369;

	@OriginalMember(owner = "client!aek", name = "p", descriptor = "I")
	int anInt370;

	@OriginalMember(owner = "client!aek", name = "d", descriptor = "I")
	int anInt377;

	@OriginalMember(owner = "client!aek", name = "c", descriptor = "I")
	final int anInt371;

	@OriginalMember(owner = "client!aek", name = "h", descriptor = "[[[I")
	int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!aek", name = "s", descriptor = "[[[Lclient!akn;")
	Class93_Sub24[][][] aClass93_Sub24ArrayArrayArray1;

	@OriginalMember(owner = "client!aek", name = "x", descriptor = "[[[I")
	int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!aek", name = "b", descriptor = "[[[I")
	int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!aek", name = "y", descriptor = "[[[I")
	int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!aek", name = "q", descriptor = "[[[I")
	int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!aek", name = "o", descriptor = "[[S")
	short[][] aShortArrayArray2;

	@OriginalMember(owner = "client!aek", name = "g", descriptor = "[[B")
	byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!aek", name = "as", descriptor = "[[B")
	byte[][] aByteArrayArray7;

	@OriginalMember(owner = "client!aek", name = "at", descriptor = "[[F")
	float[][] aFloatArrayArray2;

	@OriginalMember(owner = "client!aek", name = "ad", descriptor = "[[F")
	float[][] aFloatArrayArray1;

	@OriginalMember(owner = "client!aek", name = "am", descriptor = "[[F")
	float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!aek", name = "au", descriptor = "Lclient!aan;")
	Class16 aClass16_4;

	@OriginalMember(owner = "client!aek", name = "i", descriptor = "Lclient!ci;")
	Class205 aClass205_1;

	@OriginalMember(owner = "client!aek", name = "<init>", descriptor = "(Lclient!afa;IIII[[I[[II)V", line = 56)
	Class99_Sub2(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass104_Sub1_12 = arg0;
		this.anInt369 = this.anInt415 * -373302705 - 2;
		this.anInt370 = 0x1 << this.anInt369;
		this.anInt377 = arg1;
		this.anInt371 = arg2;
		this.anIntArrayArrayArray6 = new int[arg3][arg4][];
		this.aClass93_Sub24ArrayArrayArray1 = new Class93_Sub24[arg3][arg4][];
		this.anIntArrayArrayArray4 = new int[arg3][arg4][];
		this.anIntArrayArrayArray1 = new int[arg3][arg4][];
		this.anIntArrayArrayArray2 = new int[arg3][arg4][];
		this.anIntArrayArrayArray3 = new int[arg3][arg4][];
		this.aShortArrayArray2 = new short[arg3 * arg4][];
		this.aByteArrayArray6 = new byte[arg3][arg4];
		this.aByteArrayArray7 = new byte[arg3 + 1][arg4 + 1];
		this.aFloatArrayArray2 = new float[this.anInt414 * -1667858293 + 1][this.anInt413 * -143202029 + 1];
		this.aFloatArrayArray1 = new float[this.anInt414 * -1667858293 + 1][this.anInt413 * -143202029 + 1];
		this.aFloatArrayArray3 = new float[this.anInt414 * -1667858293 + 1][this.anInt413 * -143202029 + 1];
		for (@Pc(130) int local130 = 1; local130 < this.anInt413 * -143202029; local130++) {
			for (@Pc(138) int local138 = 1; local138 < this.anInt414 * -1667858293; local138++) {
				@Pc(160) int local160 = arg6[local138 + 1][local130] - arg6[local138 - 1][local130];
				@Pc(176) int local176 = arg6[local138][local130 + 1] - arg6[local138][local130 - 1];
				@Pc(195) float local195 = (float) (1.0D / Math.sqrt((double) (local160 * local160 + arg7 * 4 * arg7 + local176 * local176)));
				this.aFloatArrayArray2[local138][local130] = (float) local160 * local195;
				this.aFloatArrayArray1[local138][local130] = (float) (-arg7 * 2) * local195;
				this.aFloatArrayArray3[local138][local130] = (float) local176 * local195;
			}
		}
		this.aClass16_4 = new Class16(128);
		if ((this.anInt371 & 0x10) != 0) {
			this.aClass205_1 = new Class205(this.aClass104_Sub1_12, this);
		}
	}

	@OriginalMember(owner = "client!aek", name = "e", descriptor = "(III)V", line = 89)
	@Override
	public void method2486(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = Math.min(this.aByteArrayArray7.length - 1, Math.max(0, arg0));
		@Pc(21) int local21 = Math.min(this.aByteArrayArray7[local9].length - 1, Math.max(0, arg1));
		if ((this.aByteArrayArray7[local9][local21] & 0xFF) < arg2) {
			this.aByteArrayArray7[local9][local21] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!aek", name = "s", descriptor = "(III)V", line = 89)
	@Override
	public void method2511(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = Math.min(this.aByteArrayArray7.length - 1, Math.max(0, arg0));
		@Pc(21) int local21 = Math.min(this.aByteArrayArray7[local9].length - 1, Math.max(0, arg1));
		if ((this.aByteArrayArray7[local9][local21] & 0xFF) < arg2) {
			this.aByteArrayArray7[local9][local21] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!aek", name = "y", descriptor = "(III)V", line = 89)
	@Override
	public void method2494(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = Math.min(this.aByteArrayArray7.length - 1, Math.max(0, arg0));
		@Pc(21) int local21 = Math.min(this.aByteArrayArray7[local9].length - 1, Math.max(0, arg1));
		if ((this.aByteArrayArray7[local9][local21] & 0xFF) < arg2) {
			this.aByteArrayArray7[local9][local21] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!aek", name = "q", descriptor = "(II[I[I[I[I[I[I[I[ILclient!dy;Z)V", line = 95)
	@Override
	public void method2485(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) Class237 arg10, @OriginalArg(11) boolean arg11) {
		@Pc(3) Class225 local3 = this.aClass104_Sub1_12.aClass225_6;
		if (arg5 != null && this.anIntArrayArrayArray5 == null) {
			this.anIntArrayArrayArray5 = new int[this.anInt414 * -1667858293][this.anInt413 * -143202029][];
		}
		if (arg3 != null && this.anIntArrayArrayArray6 == null) {
			this.anIntArrayArrayArray6 = new int[this.anInt414 * -1667858293][this.anInt413 * -143202029][];
		}
		this.anIntArrayArrayArray4[arg0][arg1] = arg2;
		this.anIntArrayArrayArray1[arg0][arg1] = arg4;
		this.anIntArrayArrayArray2[arg0][arg1] = arg6;
		this.anIntArrayArrayArray3[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray5 != null) {
			this.anIntArrayArrayArray5[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray6 != null) {
			this.anIntArrayArrayArray6[arg0][arg1] = arg3;
		}
		@Pc(94) Class93_Sub24[] local94 = this.aClass93_Sub24ArrayArrayArray1[arg0][arg1] = new Class93_Sub24[arg6.length];
		for (@Pc(96) int local96 = 0; local96 < arg6.length; local96++) {
			@Pc(104) int local104 = arg8[local96];
			@Pc(108) int local108 = arg9[local96];
			if ((this.anInt371 & 0x20) != 0 && local104 != -1 && local3.method25597(local104, -91128412).aBoolean656) {
				local108 = 128;
				local104 = -1;
			}
			@Pc(158) long local158 = (long) (arg10.anInt3819 * -94478965) << 48 | (long) (arg10.anInt3815 * -2052057497) << 42 | (long) (arg10.anInt3817 * -1393096381) << 28 | (long) (local108 << 14) | (long) local104;
			@Pc(163) Class93 local163;
			for (local163 = this.aClass16_4.method214(local158); local163 != null; local163 = this.aClass16_4.method216(-1796956099)) {
				@Pc(168) Class93_Sub24 local168 = (Class93_Sub24) local163;
				if (local168.anInt1580 == local104 && local168.aFloat149 == (float) local108 && local168.aClass237_4.method25769(arg10, 828378821)) {
					break;
				}
			}
			if (local163 == null) {
				local94[local96] = new Class93_Sub24(this, local104, local108, arg10);
				this.aClass16_4.method220(local94[local96], local158);
			} else {
				local94[local96] = (Class93_Sub24) local163;
			}
		}
		if (arg11) {
			this.aByteArrayArray6[arg0][arg1] = (byte) (this.aByteArrayArray6[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt376) {
			this.anInt376 = arg6.length;
		}
		this.anInt375 += arg6.length;
	}

	@OriginalMember(owner = "client!aek", name = "n", descriptor = "(II[I[I[I[I[I[I[I[ILclient!dy;Z)V", line = 95)
	@Override
	public void method2515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) Class237 arg10, @OriginalArg(11) boolean arg11) {
		@Pc(3) Class225 local3 = this.aClass104_Sub1_12.aClass225_6;
		if (arg5 != null && this.anIntArrayArrayArray5 == null) {
			this.anIntArrayArrayArray5 = new int[this.anInt414 * -1667858293][this.anInt413 * -143202029][];
		}
		if (arg3 != null && this.anIntArrayArrayArray6 == null) {
			this.anIntArrayArrayArray6 = new int[this.anInt414 * -1667858293][this.anInt413 * -143202029][];
		}
		this.anIntArrayArrayArray4[arg0][arg1] = arg2;
		this.anIntArrayArrayArray1[arg0][arg1] = arg4;
		this.anIntArrayArrayArray2[arg0][arg1] = arg6;
		this.anIntArrayArrayArray3[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray5 != null) {
			this.anIntArrayArrayArray5[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray6 != null) {
			this.anIntArrayArrayArray6[arg0][arg1] = arg3;
		}
		@Pc(94) Class93_Sub24[] local94 = this.aClass93_Sub24ArrayArrayArray1[arg0][arg1] = new Class93_Sub24[arg6.length];
		for (@Pc(96) int local96 = 0; local96 < arg6.length; local96++) {
			@Pc(104) int local104 = arg8[local96];
			@Pc(108) int local108 = arg9[local96];
			if ((this.anInt371 & 0x20) != 0 && local104 != -1 && local3.method25597(local104, -700060366).aBoolean656) {
				local108 = 128;
				local104 = -1;
			}
			@Pc(158) long local158 = (long) (arg10.anInt3819 * -94478965) << 48 | (long) (arg10.anInt3815 * -2052057497) << 42 | (long) (arg10.anInt3817 * -1393096381) << 28 | (long) (local108 << 14) | (long) local104;
			@Pc(163) Class93 local163;
			for (local163 = this.aClass16_4.method214(local158); local163 != null; local163 = this.aClass16_4.method216(-1796956099)) {
				@Pc(168) Class93_Sub24 local168 = (Class93_Sub24) local163;
				if (local168.anInt1580 == local104 && local168.aFloat149 == (float) local108 && local168.aClass237_4.method25769(arg10, -1314162580)) {
					break;
				}
			}
			if (local163 == null) {
				local94[local96] = new Class93_Sub24(this, local104, local108, arg10);
				this.aClass16_4.method220(local94[local96], local158);
			} else {
				local94[local96] = (Class93_Sub24) local163;
			}
		}
		if (arg11) {
			this.aByteArrayArray6[arg0][arg1] = (byte) (this.aByteArrayArray6[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt376) {
			this.anInt376 = arg6.length;
		}
		this.anInt375 += arg6.length;
	}

	@OriginalMember(owner = "client!aek", name = "ah", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[ILclient!dy;Z)V", line = 131)
	@Override
	public void method2488(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) Class237 arg13, @OriginalArg(14) boolean arg14) {
		@Pc(2) int local2 = arg9.length;
		@Pc(7) int[] local7 = new int[local2 * 3];
		@Pc(12) int[] local12 = new int[local2 * 3];
		@Pc(17) int[] local17 = new int[local2 * 3];
		@Pc(26) int[] local26 = arg10 == null ? null : new int[local2 * 3];
		@Pc(31) int[] local31 = new int[local2 * 3];
		@Pc(36) int[] local36 = new int[local2 * 3];
		@Pc(45) int[] local45 = arg3 == null ? null : new int[local2 * 3];
		@Pc(54) int[] local54 = arg5 == null ? null : new int[local2 * 3];
		@Pc(56) int local56 = 0;
		for (@Pc(58) int local58 = 0; local58 < local2; local58++) {
			@Pc(65) int local65 = arg6[local58];
			@Pc(69) int local69 = arg7[local58];
			@Pc(73) int local73 = arg8[local58];
			local7[local56] = arg2[local65];
			local12[local56] = arg4[local65];
			local17[local56] = arg9[local58];
			local31[local56] = arg11[local58];
			local36[local56] = arg12[local58];
			if (arg10 != null) {
				local26[local56] = arg10[local58];
			}
			if (arg3 != null) {
				local45[local56] = arg3[local65];
			}
			if (arg5 != null) {
				local54[local56] = arg5[local65];
			}
			local56++;
			local7[local56] = arg2[local69];
			local12[local56] = arg4[local69];
			local17[local56] = arg9[local58];
			local31[local56] = arg11[local58];
			local36[local56] = arg12[local58];
			if (arg10 != null) {
				local26[local56] = arg10[local58];
			}
			if (arg3 != null) {
				local45[local56] = arg3[local69];
			}
			if (arg5 != null) {
				local54[local56] = arg5[local69];
			}
			local56++;
			local7[local56] = arg2[local73];
			local12[local56] = arg4[local73];
			local17[local56] = arg9[local58];
			local31[local56] = arg11[local58];
			local36[local56] = arg12[local58];
			if (arg10 != null) {
				local26[local56] = arg10[local58];
			}
			if (arg3 != null) {
				local45[local56] = arg3[local73];
			}
			if (arg5 != null) {
				local54[local56] = arg5[local73];
			}
			local56++;
		}
		this.method2515(arg0, arg1, local7, local45, local12, local54, local17, local26, local31, local36, arg13, arg14);
	}

	@OriginalMember(owner = "client!aek", name = "ag", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[ILclient!dy;Z)V", line = 131)
	@Override
	public void method2495(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) Class237 arg13, @OriginalArg(14) boolean arg14) {
		@Pc(2) int local2 = arg9.length;
		@Pc(7) int[] local7 = new int[local2 * 3];
		@Pc(12) int[] local12 = new int[local2 * 3];
		@Pc(17) int[] local17 = new int[local2 * 3];
		@Pc(26) int[] local26 = arg10 == null ? null : new int[local2 * 3];
		@Pc(31) int[] local31 = new int[local2 * 3];
		@Pc(36) int[] local36 = new int[local2 * 3];
		@Pc(45) int[] local45 = arg3 == null ? null : new int[local2 * 3];
		@Pc(54) int[] local54 = arg5 == null ? null : new int[local2 * 3];
		@Pc(56) int local56 = 0;
		for (@Pc(58) int local58 = 0; local58 < local2; local58++) {
			@Pc(65) int local65 = arg6[local58];
			@Pc(69) int local69 = arg7[local58];
			@Pc(73) int local73 = arg8[local58];
			local7[local56] = arg2[local65];
			local12[local56] = arg4[local65];
			local17[local56] = arg9[local58];
			local31[local56] = arg11[local58];
			local36[local56] = arg12[local58];
			if (arg10 != null) {
				local26[local56] = arg10[local58];
			}
			if (arg3 != null) {
				local45[local56] = arg3[local65];
			}
			if (arg5 != null) {
				local54[local56] = arg5[local65];
			}
			local56++;
			local7[local56] = arg2[local69];
			local12[local56] = arg4[local69];
			local17[local56] = arg9[local58];
			local31[local56] = arg11[local58];
			local36[local56] = arg12[local58];
			if (arg10 != null) {
				local26[local56] = arg10[local58];
			}
			if (arg3 != null) {
				local45[local56] = arg3[local69];
			}
			if (arg5 != null) {
				local54[local56] = arg5[local69];
			}
			local56++;
			local7[local56] = arg2[local73];
			local12[local56] = arg4[local73];
			local17[local56] = arg9[local58];
			local31[local56] = arg11[local58];
			local36[local56] = arg12[local58];
			if (arg10 != null) {
				local26[local56] = arg10[local58];
			}
			if (arg3 != null) {
				local45[local56] = arg3[local73];
			}
			if (arg5 != null) {
				local54[local56] = arg5[local73];
			}
			local56++;
		}
		this.method2515(arg0, arg1, local7, local45, local12, local54, local17, local26, local31, local36, arg13, arg14);
	}

	@OriginalMember(owner = "client!aek", name = "m", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[ILclient!dy;Z)V", line = 131)
	@Override
	public void method2490(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) Class237 arg13, @OriginalArg(14) boolean arg14) {
		@Pc(2) int local2 = arg9.length;
		@Pc(7) int[] local7 = new int[local2 * 3];
		@Pc(12) int[] local12 = new int[local2 * 3];
		@Pc(17) int[] local17 = new int[local2 * 3];
		@Pc(26) int[] local26 = arg10 == null ? null : new int[local2 * 3];
		@Pc(31) int[] local31 = new int[local2 * 3];
		@Pc(36) int[] local36 = new int[local2 * 3];
		@Pc(45) int[] local45 = arg3 == null ? null : new int[local2 * 3];
		@Pc(54) int[] local54 = arg5 == null ? null : new int[local2 * 3];
		@Pc(56) int local56 = 0;
		for (@Pc(58) int local58 = 0; local58 < local2; local58++) {
			@Pc(65) int local65 = arg6[local58];
			@Pc(69) int local69 = arg7[local58];
			@Pc(73) int local73 = arg8[local58];
			local7[local56] = arg2[local65];
			local12[local56] = arg4[local65];
			local17[local56] = arg9[local58];
			local31[local56] = arg11[local58];
			local36[local56] = arg12[local58];
			if (arg10 != null) {
				local26[local56] = arg10[local58];
			}
			if (arg3 != null) {
				local45[local56] = arg3[local65];
			}
			if (arg5 != null) {
				local54[local56] = arg5[local65];
			}
			local56++;
			local7[local56] = arg2[local69];
			local12[local56] = arg4[local69];
			local17[local56] = arg9[local58];
			local31[local56] = arg11[local58];
			local36[local56] = arg12[local58];
			if (arg10 != null) {
				local26[local56] = arg10[local58];
			}
			if (arg3 != null) {
				local45[local56] = arg3[local69];
			}
			if (arg5 != null) {
				local54[local56] = arg5[local69];
			}
			local56++;
			local7[local56] = arg2[local73];
			local12[local56] = arg4[local73];
			local17[local56] = arg9[local58];
			local31[local56] = arg11[local58];
			local36[local56] = arg12[local58];
			if (arg10 != null) {
				local26[local56] = arg10[local58];
			}
			if (arg3 != null) {
				local45[local56] = arg3[local73];
			}
			if (arg5 != null) {
				local54[local56] = arg5[local73];
			}
			local56++;
		}
		this.method2515(arg0, arg1, local7, local45, local12, local54, local17, local26, local31, local36, arg13, arg14);
	}

	@OriginalMember(owner = "client!aek", name = "al", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[ILclient!dy;Z)V", line = 131)
	@Override
	public void method2509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) Class237 arg13, @OriginalArg(14) boolean arg14) {
		@Pc(2) int local2 = arg9.length;
		@Pc(7) int[] local7 = new int[local2 * 3];
		@Pc(12) int[] local12 = new int[local2 * 3];
		@Pc(17) int[] local17 = new int[local2 * 3];
		@Pc(26) int[] local26 = arg10 == null ? null : new int[local2 * 3];
		@Pc(31) int[] local31 = new int[local2 * 3];
		@Pc(36) int[] local36 = new int[local2 * 3];
		@Pc(45) int[] local45 = arg3 == null ? null : new int[local2 * 3];
		@Pc(54) int[] local54 = arg5 == null ? null : new int[local2 * 3];
		@Pc(56) int local56 = 0;
		for (@Pc(58) int local58 = 0; local58 < local2; local58++) {
			@Pc(65) int local65 = arg6[local58];
			@Pc(69) int local69 = arg7[local58];
			@Pc(73) int local73 = arg8[local58];
			local7[local56] = arg2[local65];
			local12[local56] = arg4[local65];
			local17[local56] = arg9[local58];
			local31[local56] = arg11[local58];
			local36[local56] = arg12[local58];
			if (arg10 != null) {
				local26[local56] = arg10[local58];
			}
			if (arg3 != null) {
				local45[local56] = arg3[local65];
			}
			if (arg5 != null) {
				local54[local56] = arg5[local65];
			}
			local56++;
			local7[local56] = arg2[local69];
			local12[local56] = arg4[local69];
			local17[local56] = arg9[local58];
			local31[local56] = arg11[local58];
			local36[local56] = arg12[local58];
			if (arg10 != null) {
				local26[local56] = arg10[local58];
			}
			if (arg3 != null) {
				local45[local56] = arg3[local69];
			}
			if (arg5 != null) {
				local54[local56] = arg5[local69];
			}
			local56++;
			local7[local56] = arg2[local73];
			local12[local56] = arg4[local73];
			local17[local56] = arg9[local58];
			local31[local56] = arg11[local58];
			local36[local56] = arg12[local58];
			if (arg10 != null) {
				local26[local56] = arg10[local58];
			}
			if (arg3 != null) {
				local45[local56] = arg3[local73];
			}
			if (arg5 != null) {
				local54[local56] = arg5[local73];
			}
			local56++;
		}
		this.method2515(arg0, arg1, local7, local45, local12, local54, local17, local26, local31, local36, arg13, arg14);
	}

	@OriginalMember(owner = "client!aek", name = "k", descriptor = "()V", line = 177)
	@Override
	public void method2514() {
		if (this.anInt375 > 0) {
			@Pc(16) byte[][] local16 = new byte[this.anInt414 * -1667858293 + 1][this.anInt413 * -143202029 + 1];
			@Pc(18) int local18;
			for (local18 = 1; local18 < this.anInt414 * -1667858293; local18++) {
				for (@Pc(26) int local26 = 1; local26 < this.anInt413 * -143202029; local26++) {
					local16[local18][local26] = (byte) ((this.aByteArrayArray7[local18 - 1][local26] >> 2) + (this.aByteArrayArray7[local18 + 1][local26] >> 3) + (this.aByteArrayArray7[local18][local26 - 1] >> 2) + (this.aByteArrayArray7[local18][local26 + 1] >> 3) + (this.aByteArrayArray7[local18][local26] >> 1));
				}
			}
			this.aClass93Array2 = new Class93[this.aClass16_4.method219(9120952)];
			this.aClass16_4.method218(this.aClass93Array2, (byte) 0);
			for (local18 = 0; local18 < this.aClass93Array2.length; local18++) {
				((Class93_Sub24) this.aClass93Array2[local18]).method13758(this.anInt375);
			}
			local18 = 24;
			if (this.anIntArrayArrayArray5 != null) {
				local18 += 4;
			}
			if ((this.anInt371 & 0x7) != 0) {
				local18 += 12;
			}
			@Pc(147) NativeHeapBuffer local147 = this.aClass104_Sub1_12.aNativeHeap1.n(this.anInt375 * local18, false);
			@Pc(152) Stream local152 = new Stream(local147);
			@Pc(156) Class93_Sub24[] local156 = new Class93_Sub24[this.anInt375];
			@Pc(163) int local163 = Class278.method26363(this.anInt375 / 4, 423254006);
			if (local163 < 1) {
				local163 = 1;
			}
			@Pc(173) Class16 local173 = new Class16(local163);
			@Pc(177) Class93_Sub24[] local177 = new Class93_Sub24[this.anInt376];
			@Pc(179) int local179;
			@Pc(187) int local187;
			for (local179 = 0; local179 < this.anInt414 * -1667858293; local179++) {
				for (local187 = 0; local187 < this.anInt413 * -143202029; local187++) {
					if (this.anIntArrayArrayArray2[local179][local187] != null) {
						@Pc(208) Class93_Sub24[] local208 = this.aClass93_Sub24ArrayArrayArray1[local179][local187];
						@Pc(215) int[] local215 = this.anIntArrayArrayArray4[local179][local187];
						@Pc(222) int[] local222 = this.anIntArrayArrayArray1[local179][local187];
						@Pc(229) int[] local229 = this.anIntArrayArrayArray3[local179][local187];
						@Pc(236) int[] local236 = this.anIntArrayArrayArray2[local179][local187];
						@Pc(248) int[] local248 = this.anIntArrayArrayArray6 == null ? null : this.anIntArrayArrayArray6[local179][local187];
						@Pc(260) int[] local260 = this.anIntArrayArrayArray5 == null ? null : this.anIntArrayArrayArray5[local179][local187];
						if (local229 == null) {
							local229 = local236;
						}
						@Pc(271) float local271 = this.aFloatArrayArray2[local179][local187];
						@Pc(278) float local278 = this.aFloatArrayArray1[local179][local187];
						@Pc(285) float local285 = this.aFloatArrayArray3[local179][local187];
						@Pc(294) float local294 = this.aFloatArrayArray2[local179][local187 + 1];
						@Pc(303) float local303 = this.aFloatArrayArray1[local179][local187 + 1];
						@Pc(312) float local312 = this.aFloatArrayArray3[local179][local187 + 1];
						@Pc(323) float local323 = this.aFloatArrayArray2[local179 + 1][local187 + 1];
						@Pc(334) float local334 = this.aFloatArrayArray1[local179 + 1][local187 + 1];
						@Pc(345) float local345 = this.aFloatArrayArray3[local179 + 1][local187 + 1];
						@Pc(354) float local354 = this.aFloatArrayArray2[local179 + 1][local187];
						@Pc(363) float local363 = this.aFloatArrayArray1[local179 + 1][local187];
						@Pc(372) float local372 = this.aFloatArrayArray3[local179 + 1][local187];
						@Pc(380) int local380 = local16[local179][local187] & 0xFF;
						@Pc(390) int local390 = local16[local179][local187 + 1] & 0xFF;
						@Pc(402) int local402 = local16[local179 + 1][local187 + 1] & 0xFF;
						@Pc(412) int local412 = local16[local179 + 1][local187] & 0xFF;
						@Pc(414) int local414 = 0;
						@Pc(426) int local426;
						label346: for (@Pc(416) int local416 = 0; local416 < local236.length; local416++) {
							@Pc(424) Class93_Sub24 local424 = local208[local416];
							for (local426 = 0; local426 < local414; local426++) {
								if (local177[local426] == local424) {
									continue label346;
								}
							}
							local177[local414++] = local424;
						}
						@Pc(460) short[] local460 = this.aShortArrayArray2[local187 * this.anInt414 * -1667858293 + local179] = new short[local236.length];
						for (@Pc(462) int local462 = 0; local462 < local236.length; local462++) {
							@Pc(477) int local477 = (local179 << this.anInt415 * -373302705) + local215[local462];
							@Pc(488) int local488 = (local187 << this.anInt415 * -373302705) + local222[local462];
							@Pc(493) int local493 = local477 >> this.anInt369;
							@Pc(498) int local498 = local488 >> this.anInt369;
							@Pc(502) int local502 = local236[local462];
							@Pc(506) int local506 = local229[local462];
							@Pc(514) int local514 = local248 == null ? 0 : local248[local462];
							@Pc(532) long local532 = (long) local506 << 48 | (long) local502 << 32 | (long) (local493 << 16) | (long) local498;
							@Pc(536) int local536 = local215[local462];
							@Pc(540) int local540 = local222[local462];
							@Pc(542) byte local542 = 74;
							@Pc(544) int local544 = 0;
							@Pc(546) float local546 = 1.0F;
							@Pc(552) float local552;
							@Pc(554) float local554;
							@Pc(556) float local556;
							@Pc(656) float local656;
							@Pc(560) int local560;
							if (local536 == 0 && local540 == 0) {
								local552 = local271;
								local554 = local278;
								local556 = local285;
								local560 = local542 - local380;
							} else if (local536 == 0 && local540 == this.anInt412 * -1678286317) {
								local552 = local294;
								local554 = local303;
								local556 = local312;
								local560 = local542 - local390;
							} else if (local536 == this.anInt412 * -1678286317 && local540 == this.anInt412 * -1678286317) {
								local552 = local323;
								local554 = local334;
								local556 = local345;
								local560 = local542 - local402;
							} else if (local536 == this.anInt412 * -1678286317 && local540 == 0) {
								local552 = local354;
								local554 = local363;
								local556 = local372;
								local560 = local542 - local412;
							} else {
								@Pc(631) float local631 = (float) local536 / (float) (this.anInt412 * -1678286317);
								@Pc(640) float local640 = (float) local540 / (float) (this.anInt412 * -1678286317);
								@Pc(648) float local648 = local271 + (local354 - local271) * local631;
								local656 = local278 + (local363 - local278) * local631;
								@Pc(664) float local664 = local285 + (local372 - local285) * local631;
								@Pc(672) float local672 = local294 + (local323 - local294) * local631;
								@Pc(680) float local680 = local303 + (local334 - local303) * local631;
								@Pc(688) float local688 = local312 + (local345 - local312) * local631;
								local552 = local648 + (local672 - local648) * local640;
								local554 = local656 + (local680 - local656) * local640;
								local556 = local664 + (local688 - local664) * local640;
								@Pc(725) int local725 = local380 + ((local412 - local380) * local536 >> this.anInt415 * -373302705);
								@Pc(738) int local738 = local390 + ((local402 - local390) * local536 >> this.anInt415 * -373302705);
								local560 = local542 - (local725 + ((local738 - local725) * local540 >> this.anInt415 * -373302705));
							}
							if (local502 != -1) {
								@Pc(764) int local764 = (local502 & 0x7F) * local560 >> 7;
								if (local764 < 2) {
									local764 = 2;
								} else if (local764 > 126) {
									local764 = 126;
								}
								local544 = Class685.anIntArray524[local502 & 0xFF80 | local764];
								if ((this.anInt371 & 0x7) == 0) {
									local546 = this.aClass104_Sub1_12.aFloatArray9[0] * local552 + this.aClass104_Sub1_12.aFloatArray9[1] * local554 + this.aClass104_Sub1_12.aFloatArray9[2] * local556;
									local546 = this.aClass104_Sub1_12.aFloat42 + local546 * (local546 > 0.0F ? this.aClass104_Sub1_12.aFloat43 : this.aClass104_Sub1_12.aFloat44);
								}
							}
							@Pc(832) Class93 local832 = null;
							if ((local477 & this.anInt370 - 1) == 0 && (local488 & this.anInt370 - 1) == 0) {
								local832 = local173.method214(local532);
							}
							@Pc(882) int local882;
							if (local832 == null) {
								if (local506 == local502) {
									local882 = local544;
								} else {
									@Pc(863) int local863 = (local506 & 0x7F) * local560 >> 7;
									if (local863 < 2) {
										local863 = 2;
									} else if (local863 > 126) {
										local863 = 126;
									}
									local882 = Class685.anIntArray524[local506 & 0xFF80 | local863];
									if ((this.anInt371 & 0x7) == 0) {
										@Pc(910) float local910 = this.aClass104_Sub1_12.aFloatArray9[0] * local552 + this.aClass104_Sub1_12.aFloatArray9[1] * local554 + this.aClass104_Sub1_12.aFloatArray9[2] * local556;
										local656 = this.aClass104_Sub1_12.aFloat42 + local546 * (local546 > 0.0F ? this.aClass104_Sub1_12.aFloat43 : this.aClass104_Sub1_12.aFloat44);
										@Pc(935) int local935 = local882 >> 16 & 0xFF;
										@Pc(941) int local941 = local882 >> 8 & 0xFF;
										@Pc(945) int local945 = local882 & 0xFF;
										local935 = (int) ((float) local935 * local656);
										if (local935 < 0) {
											local935 = 0;
										} else if (local935 > 255) {
											local935 = 255;
										}
										local941 = (int) ((float) local941 * local656);
										if (local941 < 0) {
											local941 = 0;
										} else if (local941 > 255) {
											local941 = 255;
										}
										local945 = (int) ((float) local945 * local656);
										if (local945 < 0) {
											local945 = 0;
										} else if (local945 > 255) {
											local945 = 255;
										}
										local882 = local935 << 16 | local941 << 8 | local945;
									}
								}
								if (this.aClass104_Sub1_12.aBoolean106) {
									local152.f((float) local477);
									local152.f((float) (this.method2473(local477, local488, 1750322892) + local514));
									local152.f((float) local488);
									local152.k((byte) (local882 >> 16));
									local152.k((byte) (local882 >> 8));
									local152.k((byte) local882);
									local152.k(-1);
									local152.f((float) local477);
									local152.f((float) local488);
									if (this.anIntArrayArrayArray5 != null) {
										local152.f(local260 == null ? 0.0F : (float) (local260[local462] - 1));
									}
									if ((this.anInt371 & 0x7) != 0) {
										local152.f(local552);
										local152.f(local554);
										local152.f(local556);
									}
								} else {
									local152.w((float) local477);
									local152.w((float) (this.method2473(local477, local488, 259227285) + local514));
									local152.w((float) local488);
									local152.k((byte) (local882 >> 16));
									local152.k((byte) (local882 >> 8));
									local152.k((byte) local882);
									local152.k(-1);
									local152.w((float) local477);
									local152.w((float) local488);
									if (this.anIntArrayArrayArray5 != null) {
										local152.w(local260 == null ? 0.0F : (float) (local260[local462] - 1));
									}
									if ((this.anInt371 & 0x7) != 0) {
										local152.w(local552);
										local152.w(local554);
										local152.w(local556);
									}
								}
								local426 = this.anInt373++;
								local460[local462] = (short) local426;
								if (local502 != -1) {
									local156[local426] = local208[local462];
								}
								local173.method220(new Class93_Sub20(local460[local462]), local532);
							} else {
								local460[local462] = ((Class93_Sub20) local832).aShort98;
								local426 = local460[local462] & 0xFFFF;
								if (local502 != -1 && local208[local462].aLong232 * -3750704643647536275L < local156[local426].aLong232 * -3750704643647536275L) {
									local156[local426] = local208[local462];
								}
							}
							for (local882 = 0; local882 < local414; local882++) {
								local177[local882].method13766(local426, local544, local560, local546);
							}
							this.anInt372++;
						}
					}
				}
			}
			for (local179 = 0; local179 < this.anInt373; local179++) {
				@Pc(1263) Class93_Sub24 local1263 = local156[local179];
				if (local1263 != null) {
					local1263.method13759(local179);
				}
			}
			for (local179 = 0; local179 < this.anInt414 * -1667858293; local179++) {
				for (local187 = 0; local187 < this.anInt413 * -143202029; local187++) {
					@Pc(1298) short[] local1298 = this.aShortArrayArray2[local187 * this.anInt414 * -1667858293 + local179];
					if (local1298 != null) {
						@Pc(1302) int local1302 = 0;
						@Pc(1304) int local1304 = 0;
						while (local1304 < local1298.length) {
							@Pc(1315) int local1315 = local1298[local1304++] & 0xFFFF;
							@Pc(1322) int local1322 = local1298[local1304++] & 0xFFFF;
							@Pc(1329) int local1329 = local1298[local1304++] & 0xFFFF;
							@Pc(1333) Class93_Sub24 local1333 = local156[local1315];
							@Pc(1337) Class93_Sub24 local1337 = local156[local1322];
							@Pc(1341) Class93_Sub24 local1341 = local156[local1329];
							@Pc(1343) Class93_Sub24 local1343 = null;
							if (local1333 != null) {
								local1333.method13761(local179, local187, local1302);
								local1343 = local1333;
							}
							if (local1337 != null) {
								local1337.method13761(local179, local187, local1302);
								if (local1343 == null || local1337.aLong232 * -3750704643647536275L < local1343.aLong232 * -3750704643647536275L) {
									local1343 = local1337;
								}
							}
							if (local1341 != null) {
								local1341.method13761(local179, local187, local1302);
								if (local1343 == null || local1341.aLong232 * -3750704643647536275L < local1343.aLong232 * -3750704643647536275L) {
									local1343 = local1341;
								}
							}
							if (local1343 != null) {
								if (local1333 != null) {
									local1343.method13759(local1315);
								}
								if (local1337 != null) {
									local1343.method13759(local1322);
								}
								if (local1341 != null) {
									local1343.method13759(local1329);
								}
								local1343.method13761(local179, local187, local1302);
							}
							local1302++;
						}
					}
				}
			}
			local152.l();
			this.anInterface14_1 = this.aClass104_Sub1_12.method3848(local18, local147, local152.n(), false);
			if (this.anInterface14_1 instanceof Class98_Sub2) {
				local147.d();
			}
			this.aClass193_1 = new Class193(this.anInterface14_1, 5126, 3, 0);
			this.aClass193_2 = new Class193(this.anInterface14_1, 5121, 4, 12);
			@Pc(1475) byte local1475;
			if (this.anIntArrayArrayArray5 == null) {
				this.aClass193_3 = new Class193(this.anInterface14_1, 5126, 2, 16);
				local1475 = 24;
			} else {
				this.aClass193_3 = new Class193(this.anInterface14_1, 5126, 3, 16);
				local1475 = 28;
			}
			if ((this.anInt371 & 0x7) != 0) {
				this.aClass193_4 = new Class193(this.anInterface14_1, 5126, 3, local1475);
			}
			@Pc(1508) long[] local1508 = new long[this.aClass93Array2.length];
			for (@Pc(1510) int local1510 = 0; local1510 < this.aClass93Array2.length; local1510++) {
				@Pc(1521) Class93_Sub24 local1521 = (Class93_Sub24) this.aClass93Array2[local1510];
				local1508[local1510] = local1521.aLong232 * -3750704643647536275L;
				local1521.method13774(this.anInt373);
			}
			Class659.method32807(local1508, this.aClass93Array2, -918281734);
			if (this.aClass205_1 != null) {
				this.aClass205_1.method24674();
			}
		} else {
			this.aClass205_1 = null;
		}
		if ((this.anInt377 & 0x2) == 0) {
			this.anIntArrayArrayArray1 = null;
			this.anIntArrayArrayArray4 = null;
			this.anIntArrayArrayArray2 = null;
		}
		this.anIntArrayArrayArray5 = null;
		this.anIntArrayArrayArray3 = null;
		this.anIntArrayArrayArray6 = null;
		this.aClass93_Sub24ArrayArrayArray1 = null;
		this.aByteArrayArray7 = null;
		this.aClass16_4 = null;
		this.aFloatArrayArray3 = null;
		this.aFloatArrayArray1 = null;
		this.aFloatArrayArray2 = null;
	}

	@OriginalMember(owner = "client!aek", name = "b", descriptor = "()V", line = 177)
	@Override
	public void method2500() {
		if (this.anInt375 > 0) {
			@Pc(16) byte[][] local16 = new byte[this.anInt414 * -1667858293 + 1][this.anInt413 * -143202029 + 1];
			@Pc(18) int local18;
			for (local18 = 1; local18 < this.anInt414 * -1667858293; local18++) {
				for (@Pc(26) int local26 = 1; local26 < this.anInt413 * -143202029; local26++) {
					local16[local18][local26] = (byte) ((this.aByteArrayArray7[local18 - 1][local26] >> 2) + (this.aByteArrayArray7[local18 + 1][local26] >> 3) + (this.aByteArrayArray7[local18][local26 - 1] >> 2) + (this.aByteArrayArray7[local18][local26 + 1] >> 3) + (this.aByteArrayArray7[local18][local26] >> 1));
				}
			}
			this.aClass93Array2 = new Class93[this.aClass16_4.method219(-357268688)];
			this.aClass16_4.method218(this.aClass93Array2, (byte) 0);
			for (local18 = 0; local18 < this.aClass93Array2.length; local18++) {
				((Class93_Sub24) this.aClass93Array2[local18]).method13758(this.anInt375);
			}
			local18 = 24;
			if (this.anIntArrayArrayArray5 != null) {
				local18 += 4;
			}
			if ((this.anInt371 & 0x7) != 0) {
				local18 += 12;
			}
			@Pc(147) NativeHeapBuffer local147 = this.aClass104_Sub1_12.aNativeHeap1.n(this.anInt375 * local18, false);
			@Pc(152) Stream local152 = new Stream(local147);
			@Pc(156) Class93_Sub24[] local156 = new Class93_Sub24[this.anInt375];
			@Pc(163) int local163 = Class278.method26363(this.anInt375 / 4, 423254006);
			if (local163 < 1) {
				local163 = 1;
			}
			@Pc(173) Class16 local173 = new Class16(local163);
			@Pc(177) Class93_Sub24[] local177 = new Class93_Sub24[this.anInt376];
			@Pc(179) int local179;
			@Pc(187) int local187;
			for (local179 = 0; local179 < this.anInt414 * -1667858293; local179++) {
				for (local187 = 0; local187 < this.anInt413 * -143202029; local187++) {
					if (this.anIntArrayArrayArray2[local179][local187] != null) {
						@Pc(208) Class93_Sub24[] local208 = this.aClass93_Sub24ArrayArrayArray1[local179][local187];
						@Pc(215) int[] local215 = this.anIntArrayArrayArray4[local179][local187];
						@Pc(222) int[] local222 = this.anIntArrayArrayArray1[local179][local187];
						@Pc(229) int[] local229 = this.anIntArrayArrayArray3[local179][local187];
						@Pc(236) int[] local236 = this.anIntArrayArrayArray2[local179][local187];
						@Pc(248) int[] local248 = this.anIntArrayArrayArray6 == null ? null : this.anIntArrayArrayArray6[local179][local187];
						@Pc(260) int[] local260 = this.anIntArrayArrayArray5 == null ? null : this.anIntArrayArrayArray5[local179][local187];
						if (local229 == null) {
							local229 = local236;
						}
						@Pc(271) float local271 = this.aFloatArrayArray2[local179][local187];
						@Pc(278) float local278 = this.aFloatArrayArray1[local179][local187];
						@Pc(285) float local285 = this.aFloatArrayArray3[local179][local187];
						@Pc(294) float local294 = this.aFloatArrayArray2[local179][local187 + 1];
						@Pc(303) float local303 = this.aFloatArrayArray1[local179][local187 + 1];
						@Pc(312) float local312 = this.aFloatArrayArray3[local179][local187 + 1];
						@Pc(323) float local323 = this.aFloatArrayArray2[local179 + 1][local187 + 1];
						@Pc(334) float local334 = this.aFloatArrayArray1[local179 + 1][local187 + 1];
						@Pc(345) float local345 = this.aFloatArrayArray3[local179 + 1][local187 + 1];
						@Pc(354) float local354 = this.aFloatArrayArray2[local179 + 1][local187];
						@Pc(363) float local363 = this.aFloatArrayArray1[local179 + 1][local187];
						@Pc(372) float local372 = this.aFloatArrayArray3[local179 + 1][local187];
						@Pc(380) int local380 = local16[local179][local187] & 0xFF;
						@Pc(390) int local390 = local16[local179][local187 + 1] & 0xFF;
						@Pc(402) int local402 = local16[local179 + 1][local187 + 1] & 0xFF;
						@Pc(412) int local412 = local16[local179 + 1][local187] & 0xFF;
						@Pc(414) int local414 = 0;
						@Pc(426) int local426;
						label346: for (@Pc(416) int local416 = 0; local416 < local236.length; local416++) {
							@Pc(424) Class93_Sub24 local424 = local208[local416];
							for (local426 = 0; local426 < local414; local426++) {
								if (local177[local426] == local424) {
									continue label346;
								}
							}
							local177[local414++] = local424;
						}
						@Pc(460) short[] local460 = this.aShortArrayArray2[local187 * this.anInt414 * -1667858293 + local179] = new short[local236.length];
						for (@Pc(462) int local462 = 0; local462 < local236.length; local462++) {
							@Pc(477) int local477 = (local179 << this.anInt415 * -373302705) + local215[local462];
							@Pc(488) int local488 = (local187 << this.anInt415 * -373302705) + local222[local462];
							@Pc(493) int local493 = local477 >> this.anInt369;
							@Pc(498) int local498 = local488 >> this.anInt369;
							@Pc(502) int local502 = local236[local462];
							@Pc(506) int local506 = local229[local462];
							@Pc(514) int local514 = local248 == null ? 0 : local248[local462];
							@Pc(532) long local532 = (long) local506 << 48 | (long) local502 << 32 | (long) (local493 << 16) | (long) local498;
							@Pc(536) int local536 = local215[local462];
							@Pc(540) int local540 = local222[local462];
							@Pc(542) byte local542 = 74;
							@Pc(544) int local544 = 0;
							@Pc(546) float local546 = 1.0F;
							@Pc(552) float local552;
							@Pc(554) float local554;
							@Pc(556) float local556;
							@Pc(656) float local656;
							@Pc(560) int local560;
							if (local536 == 0 && local540 == 0) {
								local552 = local271;
								local554 = local278;
								local556 = local285;
								local560 = local542 - local380;
							} else if (local536 == 0 && local540 == this.anInt412 * -1678286317) {
								local552 = local294;
								local554 = local303;
								local556 = local312;
								local560 = local542 - local390;
							} else if (local536 == this.anInt412 * -1678286317 && local540 == this.anInt412 * -1678286317) {
								local552 = local323;
								local554 = local334;
								local556 = local345;
								local560 = local542 - local402;
							} else if (local536 == this.anInt412 * -1678286317 && local540 == 0) {
								local552 = local354;
								local554 = local363;
								local556 = local372;
								local560 = local542 - local412;
							} else {
								@Pc(631) float local631 = (float) local536 / (float) (this.anInt412 * -1678286317);
								@Pc(640) float local640 = (float) local540 / (float) (this.anInt412 * -1678286317);
								@Pc(648) float local648 = local271 + (local354 - local271) * local631;
								local656 = local278 + (local363 - local278) * local631;
								@Pc(664) float local664 = local285 + (local372 - local285) * local631;
								@Pc(672) float local672 = local294 + (local323 - local294) * local631;
								@Pc(680) float local680 = local303 + (local334 - local303) * local631;
								@Pc(688) float local688 = local312 + (local345 - local312) * local631;
								local552 = local648 + (local672 - local648) * local640;
								local554 = local656 + (local680 - local656) * local640;
								local556 = local664 + (local688 - local664) * local640;
								@Pc(725) int local725 = local380 + ((local412 - local380) * local536 >> this.anInt415 * -373302705);
								@Pc(738) int local738 = local390 + ((local402 - local390) * local536 >> this.anInt415 * -373302705);
								local560 = local542 - (local725 + ((local738 - local725) * local540 >> this.anInt415 * -373302705));
							}
							if (local502 != -1) {
								@Pc(764) int local764 = (local502 & 0x7F) * local560 >> 7;
								if (local764 < 2) {
									local764 = 2;
								} else if (local764 > 126) {
									local764 = 126;
								}
								local544 = Class685.anIntArray524[local502 & 0xFF80 | local764];
								if ((this.anInt371 & 0x7) == 0) {
									local546 = this.aClass104_Sub1_12.aFloatArray9[0] * local552 + this.aClass104_Sub1_12.aFloatArray9[1] * local554 + this.aClass104_Sub1_12.aFloatArray9[2] * local556;
									local546 = this.aClass104_Sub1_12.aFloat42 + local546 * (local546 > 0.0F ? this.aClass104_Sub1_12.aFloat43 : this.aClass104_Sub1_12.aFloat44);
								}
							}
							@Pc(832) Class93 local832 = null;
							if ((local477 & this.anInt370 - 1) == 0 && (local488 & this.anInt370 - 1) == 0) {
								local832 = local173.method214(local532);
							}
							@Pc(882) int local882;
							if (local832 == null) {
								if (local506 == local502) {
									local882 = local544;
								} else {
									@Pc(863) int local863 = (local506 & 0x7F) * local560 >> 7;
									if (local863 < 2) {
										local863 = 2;
									} else if (local863 > 126) {
										local863 = 126;
									}
									local882 = Class685.anIntArray524[local506 & 0xFF80 | local863];
									if ((this.anInt371 & 0x7) == 0) {
										@Pc(910) float local910 = this.aClass104_Sub1_12.aFloatArray9[0] * local552 + this.aClass104_Sub1_12.aFloatArray9[1] * local554 + this.aClass104_Sub1_12.aFloatArray9[2] * local556;
										local656 = this.aClass104_Sub1_12.aFloat42 + local546 * (local546 > 0.0F ? this.aClass104_Sub1_12.aFloat43 : this.aClass104_Sub1_12.aFloat44);
										@Pc(935) int local935 = local882 >> 16 & 0xFF;
										@Pc(941) int local941 = local882 >> 8 & 0xFF;
										@Pc(945) int local945 = local882 & 0xFF;
										local935 = (int) ((float) local935 * local656);
										if (local935 < 0) {
											local935 = 0;
										} else if (local935 > 255) {
											local935 = 255;
										}
										local941 = (int) ((float) local941 * local656);
										if (local941 < 0) {
											local941 = 0;
										} else if (local941 > 255) {
											local941 = 255;
										}
										local945 = (int) ((float) local945 * local656);
										if (local945 < 0) {
											local945 = 0;
										} else if (local945 > 255) {
											local945 = 255;
										}
										local882 = local935 << 16 | local941 << 8 | local945;
									}
								}
								if (this.aClass104_Sub1_12.aBoolean106) {
									local152.f((float) local477);
									local152.f((float) (this.method2473(local477, local488, 1865195099) + local514));
									local152.f((float) local488);
									local152.k((byte) (local882 >> 16));
									local152.k((byte) (local882 >> 8));
									local152.k((byte) local882);
									local152.k(-1);
									local152.f((float) local477);
									local152.f((float) local488);
									if (this.anIntArrayArrayArray5 != null) {
										local152.f(local260 == null ? 0.0F : (float) (local260[local462] - 1));
									}
									if ((this.anInt371 & 0x7) != 0) {
										local152.f(local552);
										local152.f(local554);
										local152.f(local556);
									}
								} else {
									local152.w((float) local477);
									local152.w((float) (this.method2473(local477, local488, 233266667) + local514));
									local152.w((float) local488);
									local152.k((byte) (local882 >> 16));
									local152.k((byte) (local882 >> 8));
									local152.k((byte) local882);
									local152.k(-1);
									local152.w((float) local477);
									local152.w((float) local488);
									if (this.anIntArrayArrayArray5 != null) {
										local152.w(local260 == null ? 0.0F : (float) (local260[local462] - 1));
									}
									if ((this.anInt371 & 0x7) != 0) {
										local152.w(local552);
										local152.w(local554);
										local152.w(local556);
									}
								}
								local426 = this.anInt373++;
								local460[local462] = (short) local426;
								if (local502 != -1) {
									local156[local426] = local208[local462];
								}
								local173.method220(new Class93_Sub20(local460[local462]), local532);
							} else {
								local460[local462] = ((Class93_Sub20) local832).aShort98;
								local426 = local460[local462] & 0xFFFF;
								if (local502 != -1 && local208[local462].aLong232 * -3750704643647536275L < local156[local426].aLong232 * -3750704643647536275L) {
									local156[local426] = local208[local462];
								}
							}
							for (local882 = 0; local882 < local414; local882++) {
								local177[local882].method13766(local426, local544, local560, local546);
							}
							this.anInt372++;
						}
					}
				}
			}
			for (local179 = 0; local179 < this.anInt373; local179++) {
				@Pc(1263) Class93_Sub24 local1263 = local156[local179];
				if (local1263 != null) {
					local1263.method13759(local179);
				}
			}
			for (local179 = 0; local179 < this.anInt414 * -1667858293; local179++) {
				for (local187 = 0; local187 < this.anInt413 * -143202029; local187++) {
					@Pc(1298) short[] local1298 = this.aShortArrayArray2[local187 * this.anInt414 * -1667858293 + local179];
					if (local1298 != null) {
						@Pc(1302) int local1302 = 0;
						@Pc(1304) int local1304 = 0;
						while (local1304 < local1298.length) {
							@Pc(1315) int local1315 = local1298[local1304++] & 0xFFFF;
							@Pc(1322) int local1322 = local1298[local1304++] & 0xFFFF;
							@Pc(1329) int local1329 = local1298[local1304++] & 0xFFFF;
							@Pc(1333) Class93_Sub24 local1333 = local156[local1315];
							@Pc(1337) Class93_Sub24 local1337 = local156[local1322];
							@Pc(1341) Class93_Sub24 local1341 = local156[local1329];
							@Pc(1343) Class93_Sub24 local1343 = null;
							if (local1333 != null) {
								local1333.method13761(local179, local187, local1302);
								local1343 = local1333;
							}
							if (local1337 != null) {
								local1337.method13761(local179, local187, local1302);
								if (local1343 == null || local1337.aLong232 * -3750704643647536275L < local1343.aLong232 * -3750704643647536275L) {
									local1343 = local1337;
								}
							}
							if (local1341 != null) {
								local1341.method13761(local179, local187, local1302);
								if (local1343 == null || local1341.aLong232 * -3750704643647536275L < local1343.aLong232 * -3750704643647536275L) {
									local1343 = local1341;
								}
							}
							if (local1343 != null) {
								if (local1333 != null) {
									local1343.method13759(local1315);
								}
								if (local1337 != null) {
									local1343.method13759(local1322);
								}
								if (local1341 != null) {
									local1343.method13759(local1329);
								}
								local1343.method13761(local179, local187, local1302);
							}
							local1302++;
						}
					}
				}
			}
			local152.l();
			this.anInterface14_1 = this.aClass104_Sub1_12.method3848(local18, local147, local152.n(), false);
			if (this.anInterface14_1 instanceof Class98_Sub2) {
				local147.d();
			}
			this.aClass193_1 = new Class193(this.anInterface14_1, 5126, 3, 0);
			this.aClass193_2 = new Class193(this.anInterface14_1, 5121, 4, 12);
			@Pc(1475) byte local1475;
			if (this.anIntArrayArrayArray5 == null) {
				this.aClass193_3 = new Class193(this.anInterface14_1, 5126, 2, 16);
				local1475 = 24;
			} else {
				this.aClass193_3 = new Class193(this.anInterface14_1, 5126, 3, 16);
				local1475 = 28;
			}
			if ((this.anInt371 & 0x7) != 0) {
				this.aClass193_4 = new Class193(this.anInterface14_1, 5126, 3, local1475);
			}
			@Pc(1508) long[] local1508 = new long[this.aClass93Array2.length];
			for (@Pc(1510) int local1510 = 0; local1510 < this.aClass93Array2.length; local1510++) {
				@Pc(1521) Class93_Sub24 local1521 = (Class93_Sub24) this.aClass93Array2[local1510];
				local1508[local1510] = local1521.aLong232 * -3750704643647536275L;
				local1521.method13774(this.anInt373);
			}
			Class659.method32807(local1508, this.aClass93Array2, 508634997);
			if (this.aClass205_1 != null) {
				this.aClass205_1.method24674();
			}
		} else {
			this.aClass205_1 = null;
		}
		if ((this.anInt377 & 0x2) == 0) {
			this.anIntArrayArrayArray1 = null;
			this.anIntArrayArrayArray4 = null;
			this.anIntArrayArrayArray2 = null;
		}
		this.anIntArrayArrayArray5 = null;
		this.anIntArrayArrayArray3 = null;
		this.anIntArrayArrayArray6 = null;
		this.aClass93_Sub24ArrayArrayArray1 = null;
		this.aByteArrayArray7 = null;
		this.aClass16_4 = null;
		this.aFloatArrayArray3 = null;
		this.aFloatArrayArray1 = null;
		this.aFloatArrayArray2 = null;
	}

	@OriginalMember(owner = "client!aek", name = "x", descriptor = "()V", line = 177)
	@Override
	public void method2499() {
		if (this.anInt375 > 0) {
			@Pc(16) byte[][] local16 = new byte[this.anInt414 * -1667858293 + 1][this.anInt413 * -143202029 + 1];
			@Pc(18) int local18;
			for (local18 = 1; local18 < this.anInt414 * -1667858293; local18++) {
				for (@Pc(26) int local26 = 1; local26 < this.anInt413 * -143202029; local26++) {
					local16[local18][local26] = (byte) ((this.aByteArrayArray7[local18 - 1][local26] >> 2) + (this.aByteArrayArray7[local18 + 1][local26] >> 3) + (this.aByteArrayArray7[local18][local26 - 1] >> 2) + (this.aByteArrayArray7[local18][local26 + 1] >> 3) + (this.aByteArrayArray7[local18][local26] >> 1));
				}
			}
			this.aClass93Array2 = new Class93[this.aClass16_4.method219(-410959358)];
			this.aClass16_4.method218(this.aClass93Array2, (byte) 0);
			for (local18 = 0; local18 < this.aClass93Array2.length; local18++) {
				((Class93_Sub24) this.aClass93Array2[local18]).method13758(this.anInt375);
			}
			local18 = 24;
			if (this.anIntArrayArrayArray5 != null) {
				local18 += 4;
			}
			if ((this.anInt371 & 0x7) != 0) {
				local18 += 12;
			}
			@Pc(147) NativeHeapBuffer local147 = this.aClass104_Sub1_12.aNativeHeap1.n(this.anInt375 * local18, false);
			@Pc(152) Stream local152 = new Stream(local147);
			@Pc(156) Class93_Sub24[] local156 = new Class93_Sub24[this.anInt375];
			@Pc(163) int local163 = Class278.method26363(this.anInt375 / 4, 423254006);
			if (local163 < 1) {
				local163 = 1;
			}
			@Pc(173) Class16 local173 = new Class16(local163);
			@Pc(177) Class93_Sub24[] local177 = new Class93_Sub24[this.anInt376];
			@Pc(179) int local179;
			@Pc(187) int local187;
			for (local179 = 0; local179 < this.anInt414 * -1667858293; local179++) {
				for (local187 = 0; local187 < this.anInt413 * -143202029; local187++) {
					if (this.anIntArrayArrayArray2[local179][local187] != null) {
						@Pc(208) Class93_Sub24[] local208 = this.aClass93_Sub24ArrayArrayArray1[local179][local187];
						@Pc(215) int[] local215 = this.anIntArrayArrayArray4[local179][local187];
						@Pc(222) int[] local222 = this.anIntArrayArrayArray1[local179][local187];
						@Pc(229) int[] local229 = this.anIntArrayArrayArray3[local179][local187];
						@Pc(236) int[] local236 = this.anIntArrayArrayArray2[local179][local187];
						@Pc(248) int[] local248 = this.anIntArrayArrayArray6 == null ? null : this.anIntArrayArrayArray6[local179][local187];
						@Pc(260) int[] local260 = this.anIntArrayArrayArray5 == null ? null : this.anIntArrayArrayArray5[local179][local187];
						if (local229 == null) {
							local229 = local236;
						}
						@Pc(271) float local271 = this.aFloatArrayArray2[local179][local187];
						@Pc(278) float local278 = this.aFloatArrayArray1[local179][local187];
						@Pc(285) float local285 = this.aFloatArrayArray3[local179][local187];
						@Pc(294) float local294 = this.aFloatArrayArray2[local179][local187 + 1];
						@Pc(303) float local303 = this.aFloatArrayArray1[local179][local187 + 1];
						@Pc(312) float local312 = this.aFloatArrayArray3[local179][local187 + 1];
						@Pc(323) float local323 = this.aFloatArrayArray2[local179 + 1][local187 + 1];
						@Pc(334) float local334 = this.aFloatArrayArray1[local179 + 1][local187 + 1];
						@Pc(345) float local345 = this.aFloatArrayArray3[local179 + 1][local187 + 1];
						@Pc(354) float local354 = this.aFloatArrayArray2[local179 + 1][local187];
						@Pc(363) float local363 = this.aFloatArrayArray1[local179 + 1][local187];
						@Pc(372) float local372 = this.aFloatArrayArray3[local179 + 1][local187];
						@Pc(380) int local380 = local16[local179][local187] & 0xFF;
						@Pc(390) int local390 = local16[local179][local187 + 1] & 0xFF;
						@Pc(402) int local402 = local16[local179 + 1][local187 + 1] & 0xFF;
						@Pc(412) int local412 = local16[local179 + 1][local187] & 0xFF;
						@Pc(414) int local414 = 0;
						@Pc(426) int local426;
						label346: for (@Pc(416) int local416 = 0; local416 < local236.length; local416++) {
							@Pc(424) Class93_Sub24 local424 = local208[local416];
							for (local426 = 0; local426 < local414; local426++) {
								if (local177[local426] == local424) {
									continue label346;
								}
							}
							local177[local414++] = local424;
						}
						@Pc(460) short[] local460 = this.aShortArrayArray2[local187 * this.anInt414 * -1667858293 + local179] = new short[local236.length];
						for (@Pc(462) int local462 = 0; local462 < local236.length; local462++) {
							@Pc(477) int local477 = (local179 << this.anInt415 * -373302705) + local215[local462];
							@Pc(488) int local488 = (local187 << this.anInt415 * -373302705) + local222[local462];
							@Pc(493) int local493 = local477 >> this.anInt369;
							@Pc(498) int local498 = local488 >> this.anInt369;
							@Pc(502) int local502 = local236[local462];
							@Pc(506) int local506 = local229[local462];
							@Pc(514) int local514 = local248 == null ? 0 : local248[local462];
							@Pc(532) long local532 = (long) local506 << 48 | (long) local502 << 32 | (long) (local493 << 16) | (long) local498;
							@Pc(536) int local536 = local215[local462];
							@Pc(540) int local540 = local222[local462];
							@Pc(542) byte local542 = 74;
							@Pc(544) int local544 = 0;
							@Pc(546) float local546 = 1.0F;
							@Pc(552) float local552;
							@Pc(554) float local554;
							@Pc(556) float local556;
							@Pc(656) float local656;
							@Pc(560) int local560;
							if (local536 == 0 && local540 == 0) {
								local552 = local271;
								local554 = local278;
								local556 = local285;
								local560 = local542 - local380;
							} else if (local536 == 0 && local540 == this.anInt412 * -1678286317) {
								local552 = local294;
								local554 = local303;
								local556 = local312;
								local560 = local542 - local390;
							} else if (local536 == this.anInt412 * -1678286317 && local540 == this.anInt412 * -1678286317) {
								local552 = local323;
								local554 = local334;
								local556 = local345;
								local560 = local542 - local402;
							} else if (local536 == this.anInt412 * -1678286317 && local540 == 0) {
								local552 = local354;
								local554 = local363;
								local556 = local372;
								local560 = local542 - local412;
							} else {
								@Pc(631) float local631 = (float) local536 / (float) (this.anInt412 * -1678286317);
								@Pc(640) float local640 = (float) local540 / (float) (this.anInt412 * -1678286317);
								@Pc(648) float local648 = local271 + (local354 - local271) * local631;
								local656 = local278 + (local363 - local278) * local631;
								@Pc(664) float local664 = local285 + (local372 - local285) * local631;
								@Pc(672) float local672 = local294 + (local323 - local294) * local631;
								@Pc(680) float local680 = local303 + (local334 - local303) * local631;
								@Pc(688) float local688 = local312 + (local345 - local312) * local631;
								local552 = local648 + (local672 - local648) * local640;
								local554 = local656 + (local680 - local656) * local640;
								local556 = local664 + (local688 - local664) * local640;
								@Pc(725) int local725 = local380 + ((local412 - local380) * local536 >> this.anInt415 * -373302705);
								@Pc(738) int local738 = local390 + ((local402 - local390) * local536 >> this.anInt415 * -373302705);
								local560 = local542 - (local725 + ((local738 - local725) * local540 >> this.anInt415 * -373302705));
							}
							if (local502 != -1) {
								@Pc(764) int local764 = (local502 & 0x7F) * local560 >> 7;
								if (local764 < 2) {
									local764 = 2;
								} else if (local764 > 126) {
									local764 = 126;
								}
								local544 = Class685.anIntArray524[local502 & 0xFF80 | local764];
								if ((this.anInt371 & 0x7) == 0) {
									local546 = this.aClass104_Sub1_12.aFloatArray9[0] * local552 + this.aClass104_Sub1_12.aFloatArray9[1] * local554 + this.aClass104_Sub1_12.aFloatArray9[2] * local556;
									local546 = this.aClass104_Sub1_12.aFloat42 + local546 * (local546 > 0.0F ? this.aClass104_Sub1_12.aFloat43 : this.aClass104_Sub1_12.aFloat44);
								}
							}
							@Pc(832) Class93 local832 = null;
							if ((local477 & this.anInt370 - 1) == 0 && (local488 & this.anInt370 - 1) == 0) {
								local832 = local173.method214(local532);
							}
							@Pc(882) int local882;
							if (local832 == null) {
								if (local506 == local502) {
									local882 = local544;
								} else {
									@Pc(863) int local863 = (local506 & 0x7F) * local560 >> 7;
									if (local863 < 2) {
										local863 = 2;
									} else if (local863 > 126) {
										local863 = 126;
									}
									local882 = Class685.anIntArray524[local506 & 0xFF80 | local863];
									if ((this.anInt371 & 0x7) == 0) {
										@Pc(910) float local910 = this.aClass104_Sub1_12.aFloatArray9[0] * local552 + this.aClass104_Sub1_12.aFloatArray9[1] * local554 + this.aClass104_Sub1_12.aFloatArray9[2] * local556;
										local656 = this.aClass104_Sub1_12.aFloat42 + local546 * (local546 > 0.0F ? this.aClass104_Sub1_12.aFloat43 : this.aClass104_Sub1_12.aFloat44);
										@Pc(935) int local935 = local882 >> 16 & 0xFF;
										@Pc(941) int local941 = local882 >> 8 & 0xFF;
										@Pc(945) int local945 = local882 & 0xFF;
										local935 = (int) ((float) local935 * local656);
										if (local935 < 0) {
											local935 = 0;
										} else if (local935 > 255) {
											local935 = 255;
										}
										local941 = (int) ((float) local941 * local656);
										if (local941 < 0) {
											local941 = 0;
										} else if (local941 > 255) {
											local941 = 255;
										}
										local945 = (int) ((float) local945 * local656);
										if (local945 < 0) {
											local945 = 0;
										} else if (local945 > 255) {
											local945 = 255;
										}
										local882 = local935 << 16 | local941 << 8 | local945;
									}
								}
								if (this.aClass104_Sub1_12.aBoolean106) {
									local152.f((float) local477);
									local152.f((float) (this.method2473(local477, local488, 463942841) + local514));
									local152.f((float) local488);
									local152.k((byte) (local882 >> 16));
									local152.k((byte) (local882 >> 8));
									local152.k((byte) local882);
									local152.k(-1);
									local152.f((float) local477);
									local152.f((float) local488);
									if (this.anIntArrayArrayArray5 != null) {
										local152.f(local260 == null ? 0.0F : (float) (local260[local462] - 1));
									}
									if ((this.anInt371 & 0x7) != 0) {
										local152.f(local552);
										local152.f(local554);
										local152.f(local556);
									}
								} else {
									local152.w((float) local477);
									local152.w((float) (this.method2473(local477, local488, 965784631) + local514));
									local152.w((float) local488);
									local152.k((byte) (local882 >> 16));
									local152.k((byte) (local882 >> 8));
									local152.k((byte) local882);
									local152.k(-1);
									local152.w((float) local477);
									local152.w((float) local488);
									if (this.anIntArrayArrayArray5 != null) {
										local152.w(local260 == null ? 0.0F : (float) (local260[local462] - 1));
									}
									if ((this.anInt371 & 0x7) != 0) {
										local152.w(local552);
										local152.w(local554);
										local152.w(local556);
									}
								}
								local426 = this.anInt373++;
								local460[local462] = (short) local426;
								if (local502 != -1) {
									local156[local426] = local208[local462];
								}
								local173.method220(new Class93_Sub20(local460[local462]), local532);
							} else {
								local460[local462] = ((Class93_Sub20) local832).aShort98;
								local426 = local460[local462] & 0xFFFF;
								if (local502 != -1 && local208[local462].aLong232 * -3750704643647536275L < local156[local426].aLong232 * -3750704643647536275L) {
									local156[local426] = local208[local462];
								}
							}
							for (local882 = 0; local882 < local414; local882++) {
								local177[local882].method13766(local426, local544, local560, local546);
							}
							this.anInt372++;
						}
					}
				}
			}
			for (local179 = 0; local179 < this.anInt373; local179++) {
				@Pc(1263) Class93_Sub24 local1263 = local156[local179];
				if (local1263 != null) {
					local1263.method13759(local179);
				}
			}
			for (local179 = 0; local179 < this.anInt414 * -1667858293; local179++) {
				for (local187 = 0; local187 < this.anInt413 * -143202029; local187++) {
					@Pc(1298) short[] local1298 = this.aShortArrayArray2[local187 * this.anInt414 * -1667858293 + local179];
					if (local1298 != null) {
						@Pc(1302) int local1302 = 0;
						@Pc(1304) int local1304 = 0;
						while (local1304 < local1298.length) {
							@Pc(1315) int local1315 = local1298[local1304++] & 0xFFFF;
							@Pc(1322) int local1322 = local1298[local1304++] & 0xFFFF;
							@Pc(1329) int local1329 = local1298[local1304++] & 0xFFFF;
							@Pc(1333) Class93_Sub24 local1333 = local156[local1315];
							@Pc(1337) Class93_Sub24 local1337 = local156[local1322];
							@Pc(1341) Class93_Sub24 local1341 = local156[local1329];
							@Pc(1343) Class93_Sub24 local1343 = null;
							if (local1333 != null) {
								local1333.method13761(local179, local187, local1302);
								local1343 = local1333;
							}
							if (local1337 != null) {
								local1337.method13761(local179, local187, local1302);
								if (local1343 == null || local1337.aLong232 * -3750704643647536275L < local1343.aLong232 * -3750704643647536275L) {
									local1343 = local1337;
								}
							}
							if (local1341 != null) {
								local1341.method13761(local179, local187, local1302);
								if (local1343 == null || local1341.aLong232 * -3750704643647536275L < local1343.aLong232 * -3750704643647536275L) {
									local1343 = local1341;
								}
							}
							if (local1343 != null) {
								if (local1333 != null) {
									local1343.method13759(local1315);
								}
								if (local1337 != null) {
									local1343.method13759(local1322);
								}
								if (local1341 != null) {
									local1343.method13759(local1329);
								}
								local1343.method13761(local179, local187, local1302);
							}
							local1302++;
						}
					}
				}
			}
			local152.l();
			this.anInterface14_1 = this.aClass104_Sub1_12.method3848(local18, local147, local152.n(), false);
			if (this.anInterface14_1 instanceof Class98_Sub2) {
				local147.d();
			}
			this.aClass193_1 = new Class193(this.anInterface14_1, 5126, 3, 0);
			this.aClass193_2 = new Class193(this.anInterface14_1, 5121, 4, 12);
			@Pc(1475) byte local1475;
			if (this.anIntArrayArrayArray5 == null) {
				this.aClass193_3 = new Class193(this.anInterface14_1, 5126, 2, 16);
				local1475 = 24;
			} else {
				this.aClass193_3 = new Class193(this.anInterface14_1, 5126, 3, 16);
				local1475 = 28;
			}
			if ((this.anInt371 & 0x7) != 0) {
				this.aClass193_4 = new Class193(this.anInterface14_1, 5126, 3, local1475);
			}
			@Pc(1508) long[] local1508 = new long[this.aClass93Array2.length];
			for (@Pc(1510) int local1510 = 0; local1510 < this.aClass93Array2.length; local1510++) {
				@Pc(1521) Class93_Sub24 local1521 = (Class93_Sub24) this.aClass93Array2[local1510];
				local1508[local1510] = local1521.aLong232 * -3750704643647536275L;
				local1521.method13774(this.anInt373);
			}
			Class659.method32807(local1508, this.aClass93Array2, -795209226);
			if (this.aClass205_1 != null) {
				this.aClass205_1.method24674();
			}
		} else {
			this.aClass205_1 = null;
		}
		if ((this.anInt377 & 0x2) == 0) {
			this.anIntArrayArrayArray1 = null;
			this.anIntArrayArrayArray4 = null;
			this.anIntArrayArrayArray2 = null;
		}
		this.anIntArrayArrayArray5 = null;
		this.anIntArrayArrayArray3 = null;
		this.anIntArrayArrayArray6 = null;
		this.aClass93_Sub24ArrayArrayArray1 = null;
		this.aByteArrayArray7 = null;
		this.aClass16_4 = null;
		this.aFloatArrayArray3 = null;
		this.aFloatArrayArray1 = null;
		this.aFloatArrayArray2 = null;
	}

	@OriginalMember(owner = "client!aek", name = "f", descriptor = "(III[[ZZI)V", line = 470)
	@Override
	public void method2507(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method2375(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!aek", name = "a", descriptor = "(III[[ZZI)V", line = 470)
	@Override
	public void method2502(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method2375(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!aek", name = "h", descriptor = "(III[[ZZI)V", line = 470)
	@Override
	public void method2501(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method2375(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!aek", name = "av", descriptor = "(III[[ZZI)V", line = 474)
	void method2375(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (this.aClass93Array2 == null) {
			return;
		}
		@Pc(8) int local8 = arg2 + arg2 + 1;
		@Pc(12) int local12 = local8 * local8;
		if (this.aClass104_Sub1_12.anIntArray41.length < local12) {
			this.aClass104_Sub1_12.anIntArray41 = new int[local12];
		}
		if (this.aClass104_Sub1_12.aClass93_Sub41_Sub1_1.data.length < this.anInt372 * 2) {
			this.aClass104_Sub1_12.aClass93_Sub41_Sub1_1 = new Class93_Sub41_Sub1(this.anInt372 * 2);
		}
		@Pc(47) int local47 = arg0 - arg2;
		@Pc(49) int local49 = local47;
		if (local47 < 0) {
			local47 = 0;
		}
		@Pc(57) int local57 = arg1 - arg2;
		@Pc(59) int local59 = local57;
		if (local57 < 0) {
			local57 = 0;
		}
		@Pc(67) int local67 = arg0 + arg2;
		if (local67 > this.anInt414 * -1667858293 - 1) {
			local67 = this.anInt414 * -1667858293 - 1;
		}
		@Pc(86) int local86 = arg1 + arg2;
		if (local86 > this.anInt413 * -143202029 - 1) {
			local86 = this.anInt413 * -143202029 - 1;
		}
		@Pc(103) int local103 = 0;
		@Pc(107) int[] local107 = this.aClass104_Sub1_12.anIntArray41;
		@Pc(109) int local109;
		for (local109 = local47; local109 <= local67; local109++) {
			@Pc(118) boolean[] local118 = arg3[local109 - local49];
			for (@Pc(120) int local120 = local57; local120 <= local86; local120++) {
				if (local118[local120 - local59]) {
					local107[local103++] = local120 * this.anInt414 * -1667858293 + local109;
				}
			}
		}
		this.aClass104_Sub1_12.method3870();
		this.aClass104_Sub1_12.method3921((this.anInt371 & 0x7) != 0);
		for (local109 = 0; local109 < this.aClass93Array2.length; local109++) {
			((Class93_Sub24) this.aClass93Array2[local109]).method13776(local107, local103);
		}
		if (!this.aClass22_3.method453(2030795427)) {
			local109 = this.aClass104_Sub1_12.anInt562;
			@Pc(191) int local191 = this.aClass104_Sub1_12.anInt563;
			this.aClass104_Sub1_12.method20878(0, local191, this.aClass104_Sub1_12.anInt564);
			this.aClass104_Sub1_12.method3921(false);
			this.aClass104_Sub1_12.method3931(false);
			this.aClass104_Sub1_12.method3938(128);
			this.aClass104_Sub1_12.method3873(-2);
			this.aClass104_Sub1_12.method3887(this.aClass104_Sub1_12.aClass88_Sub2_2);
			this.aClass104_Sub1_12.method3894(8448, 7681);
			this.aClass104_Sub1_12.method3898(0, 34166, 770);
			this.aClass104_Sub1_12.method3903(0, 34167, 770);
			for (@Pc(243) Class93 local243 = this.aClass22_3.method428((byte) 25); local243 != null; local243 = this.aClass22_3.method442(1743816892)) {
				@Pc(248) Class93_Sub7 local248 = (Class93_Sub7) local243;
				local248.method12733(arg0, arg1, arg2, arg3);
			}
			this.aClass104_Sub1_12.method3898(0, 5890, 768);
			this.aClass104_Sub1_12.method3903(0, 5890, 770);
			this.aClass104_Sub1_12.method3887(null);
			this.aClass104_Sub1_12.method20878(local109, local191, this.aClass104_Sub1_12.anInt564);
		}
		if (this.aClass205_1 == null) {
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
		this.aClass104_Sub1_12.method3855(this.aClass193_1, null, null, this.aClass193_3);
		this.aClass205_1.method24677(arg0, arg1, arg2, arg3, arg4);
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!aek", name = "w", descriptor = "(IIIIIII[[Z)V", line = 540)
	@Override
	public void method2491(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean[][] arg7) {
		@Pc(4) Class112 local4 = this.aClass104_Sub1_12.method20435((byte) -19);
		if (this.anInt375 <= 0 || local4 == null) {
			return;
		}
		this.aClass104_Sub1_12.method3800();
		this.aClass104_Sub1_12.method3918(false);
		this.aClass104_Sub1_12.method3921(false);
		this.aClass104_Sub1_12.method3928(false);
		this.aClass104_Sub1_12.method3931(false);
		this.aClass104_Sub1_12.method3938(0);
		this.aClass104_Sub1_12.method3873(-2);
		this.aClass104_Sub1_12.method3887(null);
		aFloatArray2[0] = (float) arg2 / ((float) (this.anInt412 * -1678286317) * 128.0F * (float) local4.method23737());
		aFloatArray2[1] = 0.0F;
		aFloatArray2[2] = 0.0F;
		aFloatArray2[3] = 0.0F;
		aFloatArray2[4] = 0.0F;
		aFloatArray2[5] = (float) arg2 / ((float) (this.anInt412 * -1678286317) * 128.0F * (float) local4.method23738());
		aFloatArray2[6] = 0.0F;
		aFloatArray2[7] = 0.0F;
		aFloatArray2[8] = 0.0F;
		aFloatArray2[9] = 0.0F;
		aFloatArray2[10] = 0.0F;
		aFloatArray2[11] = 0.0F;
		aFloatArray2[12] = -1.0F - ((float) (arg3 * arg2) / 128.0F - (float) (arg0 * 2)) / (float) local4.method23737();
		aFloatArray2[13] = 1.0F - ((float) (arg1 * 2) + (float) (arg6 * arg2) / 128.0F) / (float) local4.method23738();
		aFloatArray2[14] = 0.0F;
		aFloatArray2[15] = 1.0F;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(aFloatArray2, 0);
		aFloatArray2[0] = 1.0F;
		aFloatArray2[1] = 0.0F;
		aFloatArray2[2] = 0.0F;
		aFloatArray2[3] = 0.0F;
		aFloatArray2[4] = 0.0F;
		aFloatArray2[5] = 0.0F;
		aFloatArray2[6] = 1.0F;
		aFloatArray2[7] = 0.0F;
		aFloatArray2[8] = 0.0F;
		aFloatArray2[9] = 1.0F;
		aFloatArray2[10] = 0.0F;
		aFloatArray2[11] = 0.0F;
		aFloatArray2[12] = 0.0F;
		aFloatArray2[13] = 0.0F;
		aFloatArray2[14] = 0.0F;
		aFloatArray2[15] = 1.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aFloatArray2, 0);
		if ((this.anInt371 & 0x7) == 0) {
			this.aClass104_Sub1_12.method3921(false);
		} else {
			this.aClass104_Sub1_12.method3921(true);
			this.aClass104_Sub1_12.method3829();
		}
		this.aClass104_Sub1_12.method3855(this.aClass193_1, this.aClass193_4, this.aClass193_2, this.aClass193_3);
		if (this.aClass104_Sub1_12.aClass93_Sub41_Sub1_1.data.length < this.anInt372 * 2) {
			this.aClass104_Sub1_12.aClass93_Sub41_Sub1_1 = new Class93_Sub41_Sub1(this.anInt372 * 2);
		} else {
			this.aClass104_Sub1_12.aClass93_Sub41_Sub1_1.pos = 0;
		}
		@Pc(293) int local293 = 0;
		@Pc(297) Class93_Sub41_Sub1 local297 = this.aClass104_Sub1_12.aClass93_Sub41_Sub1_1;
		@Pc(303) int local303;
		@Pc(315) int local315;
		@Pc(317) int local317;
		@Pc(335) short[] local335;
		@Pc(339) int local339;
		if (this.aClass104_Sub1_12.aBoolean106) {
			for (local303 = arg4; local303 < arg6; local303++) {
				local315 = local303 * this.anInt414 * -1667858293 + arg3;
				for (local317 = arg3; local317 < arg5; local317++) {
					if (arg7[local317 - arg3][local303 - arg4]) {
						local335 = this.aShortArrayArray2[local315];
						if (local335 != null) {
							for (local339 = 0; local339 < local335.length; local339++) {
								local297.p2(local335[local339] & 0xFFFF, 2128220850);
								local293++;
							}
						}
					}
					local315++;
				}
			}
		} else {
			for (local303 = arg4; local303 < arg6; local303++) {
				local315 = local303 * this.anInt414 * -1667858293 + arg3;
				for (local317 = arg3; local317 < arg5; local317++) {
					if (arg7[local317 - arg3][local303 - arg4]) {
						local335 = this.aShortArrayArray2[local315];
						if (local335 != null) {
							for (local339 = 0; local339 < local335.length; local339++) {
								local297.ip2(local335[local339] & 0xFFFF, -1264950894);
								local293++;
							}
						}
					}
					local315++;
				}
			}
		}
		if (local293 > 0) {
			@Pc(433) Class101_Sub1 local433 = new Class101_Sub1(this.aClass104_Sub1_12, 5123, local297.data, local297.pos * 212851357);
			this.aClass104_Sub1_12.method3862(local433, 4, 0, local293);
		}
	}

	@OriginalMember(owner = "client!aek", name = "ac", descriptor = "(IIIIIII[[Z)V", line = 540)
	@Override
	public void method2498(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean[][] arg7) {
		@Pc(4) Class112 local4 = this.aClass104_Sub1_12.method20435((byte) -32);
		if (this.anInt375 <= 0 || local4 == null) {
			return;
		}
		this.aClass104_Sub1_12.method3800();
		this.aClass104_Sub1_12.method3918(false);
		this.aClass104_Sub1_12.method3921(false);
		this.aClass104_Sub1_12.method3928(false);
		this.aClass104_Sub1_12.method3931(false);
		this.aClass104_Sub1_12.method3938(0);
		this.aClass104_Sub1_12.method3873(-2);
		this.aClass104_Sub1_12.method3887(null);
		aFloatArray2[0] = (float) arg2 / ((float) (this.anInt412 * -1678286317) * 128.0F * (float) local4.method23737());
		aFloatArray2[1] = 0.0F;
		aFloatArray2[2] = 0.0F;
		aFloatArray2[3] = 0.0F;
		aFloatArray2[4] = 0.0F;
		aFloatArray2[5] = (float) arg2 / ((float) (this.anInt412 * -1678286317) * 128.0F * (float) local4.method23738());
		aFloatArray2[6] = 0.0F;
		aFloatArray2[7] = 0.0F;
		aFloatArray2[8] = 0.0F;
		aFloatArray2[9] = 0.0F;
		aFloatArray2[10] = 0.0F;
		aFloatArray2[11] = 0.0F;
		aFloatArray2[12] = -1.0F - ((float) (arg3 * arg2) / 128.0F - (float) (arg0 * 2)) / (float) local4.method23737();
		aFloatArray2[13] = 1.0F - ((float) (arg1 * 2) + (float) (arg6 * arg2) / 128.0F) / (float) local4.method23738();
		aFloatArray2[14] = 0.0F;
		aFloatArray2[15] = 1.0F;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(aFloatArray2, 0);
		aFloatArray2[0] = 1.0F;
		aFloatArray2[1] = 0.0F;
		aFloatArray2[2] = 0.0F;
		aFloatArray2[3] = 0.0F;
		aFloatArray2[4] = 0.0F;
		aFloatArray2[5] = 0.0F;
		aFloatArray2[6] = 1.0F;
		aFloatArray2[7] = 0.0F;
		aFloatArray2[8] = 0.0F;
		aFloatArray2[9] = 1.0F;
		aFloatArray2[10] = 0.0F;
		aFloatArray2[11] = 0.0F;
		aFloatArray2[12] = 0.0F;
		aFloatArray2[13] = 0.0F;
		aFloatArray2[14] = 0.0F;
		aFloatArray2[15] = 1.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aFloatArray2, 0);
		if ((this.anInt371 & 0x7) == 0) {
			this.aClass104_Sub1_12.method3921(false);
		} else {
			this.aClass104_Sub1_12.method3921(true);
			this.aClass104_Sub1_12.method3829();
		}
		this.aClass104_Sub1_12.method3855(this.aClass193_1, this.aClass193_4, this.aClass193_2, this.aClass193_3);
		if (this.aClass104_Sub1_12.aClass93_Sub41_Sub1_1.data.length < this.anInt372 * 2) {
			this.aClass104_Sub1_12.aClass93_Sub41_Sub1_1 = new Class93_Sub41_Sub1(this.anInt372 * 2);
		} else {
			this.aClass104_Sub1_12.aClass93_Sub41_Sub1_1.pos = 0;
		}
		@Pc(293) int local293 = 0;
		@Pc(297) Class93_Sub41_Sub1 local297 = this.aClass104_Sub1_12.aClass93_Sub41_Sub1_1;
		@Pc(303) int local303;
		@Pc(315) int local315;
		@Pc(317) int local317;
		@Pc(335) short[] local335;
		@Pc(339) int local339;
		if (this.aClass104_Sub1_12.aBoolean106) {
			for (local303 = arg4; local303 < arg6; local303++) {
				local315 = local303 * this.anInt414 * -1667858293 + arg3;
				for (local317 = arg3; local317 < arg5; local317++) {
					if (arg7[local317 - arg3][local303 - arg4]) {
						local335 = this.aShortArrayArray2[local315];
						if (local335 != null) {
							for (local339 = 0; local339 < local335.length; local339++) {
								local297.p2(local335[local339] & 0xFFFF, 2137778762);
								local293++;
							}
						}
					}
					local315++;
				}
			}
		} else {
			for (local303 = arg4; local303 < arg6; local303++) {
				local315 = local303 * this.anInt414 * -1667858293 + arg3;
				for (local317 = arg3; local317 < arg5; local317++) {
					if (arg7[local317 - arg3][local303 - arg4]) {
						local335 = this.aShortArrayArray2[local315];
						if (local335 != null) {
							for (local339 = 0; local339 < local335.length; local339++) {
								local297.ip2(local335[local339] & 0xFFFF, -1511005770);
								local293++;
							}
						}
					}
					local315++;
				}
			}
		}
		if (local293 > 0) {
			@Pc(433) Class101_Sub1 local433 = new Class101_Sub1(this.aClass104_Sub1_12, 5123, local297.data, local297.pos * 212851357);
			this.aClass104_Sub1_12.method3862(local433, 4, 0, local293);
		}
	}

	@OriginalMember(owner = "client!aek", name = "ai", descriptor = "(IIIIIII[[Z)V", line = 540)
	@Override
	public void method2510(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean[][] arg7) {
		@Pc(4) Class112 local4 = this.aClass104_Sub1_12.method20435((byte) -114);
		if (this.anInt375 <= 0 || local4 == null) {
			return;
		}
		this.aClass104_Sub1_12.method3800();
		this.aClass104_Sub1_12.method3918(false);
		this.aClass104_Sub1_12.method3921(false);
		this.aClass104_Sub1_12.method3928(false);
		this.aClass104_Sub1_12.method3931(false);
		this.aClass104_Sub1_12.method3938(0);
		this.aClass104_Sub1_12.method3873(-2);
		this.aClass104_Sub1_12.method3887(null);
		aFloatArray2[0] = (float) arg2 / ((float) (this.anInt412 * -1678286317) * 128.0F * (float) local4.method23737());
		aFloatArray2[1] = 0.0F;
		aFloatArray2[2] = 0.0F;
		aFloatArray2[3] = 0.0F;
		aFloatArray2[4] = 0.0F;
		aFloatArray2[5] = (float) arg2 / ((float) (this.anInt412 * -1678286317) * 128.0F * (float) local4.method23738());
		aFloatArray2[6] = 0.0F;
		aFloatArray2[7] = 0.0F;
		aFloatArray2[8] = 0.0F;
		aFloatArray2[9] = 0.0F;
		aFloatArray2[10] = 0.0F;
		aFloatArray2[11] = 0.0F;
		aFloatArray2[12] = -1.0F - ((float) (arg3 * arg2) / 128.0F - (float) (arg0 * 2)) / (float) local4.method23737();
		aFloatArray2[13] = 1.0F - ((float) (arg1 * 2) + (float) (arg6 * arg2) / 128.0F) / (float) local4.method23738();
		aFloatArray2[14] = 0.0F;
		aFloatArray2[15] = 1.0F;
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(aFloatArray2, 0);
		aFloatArray2[0] = 1.0F;
		aFloatArray2[1] = 0.0F;
		aFloatArray2[2] = 0.0F;
		aFloatArray2[3] = 0.0F;
		aFloatArray2[4] = 0.0F;
		aFloatArray2[5] = 0.0F;
		aFloatArray2[6] = 1.0F;
		aFloatArray2[7] = 0.0F;
		aFloatArray2[8] = 0.0F;
		aFloatArray2[9] = 1.0F;
		aFloatArray2[10] = 0.0F;
		aFloatArray2[11] = 0.0F;
		aFloatArray2[12] = 0.0F;
		aFloatArray2[13] = 0.0F;
		aFloatArray2[14] = 0.0F;
		aFloatArray2[15] = 1.0F;
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aFloatArray2, 0);
		if ((this.anInt371 & 0x7) == 0) {
			this.aClass104_Sub1_12.method3921(false);
		} else {
			this.aClass104_Sub1_12.method3921(true);
			this.aClass104_Sub1_12.method3829();
		}
		this.aClass104_Sub1_12.method3855(this.aClass193_1, this.aClass193_4, this.aClass193_2, this.aClass193_3);
		if (this.aClass104_Sub1_12.aClass93_Sub41_Sub1_1.data.length < this.anInt372 * 2) {
			this.aClass104_Sub1_12.aClass93_Sub41_Sub1_1 = new Class93_Sub41_Sub1(this.anInt372 * 2);
		} else {
			this.aClass104_Sub1_12.aClass93_Sub41_Sub1_1.pos = 0;
		}
		@Pc(293) int local293 = 0;
		@Pc(297) Class93_Sub41_Sub1 local297 = this.aClass104_Sub1_12.aClass93_Sub41_Sub1_1;
		@Pc(303) int local303;
		@Pc(315) int local315;
		@Pc(317) int local317;
		@Pc(335) short[] local335;
		@Pc(339) int local339;
		if (this.aClass104_Sub1_12.aBoolean106) {
			for (local303 = arg4; local303 < arg6; local303++) {
				local315 = local303 * this.anInt414 * -1667858293 + arg3;
				for (local317 = arg3; local317 < arg5; local317++) {
					if (arg7[local317 - arg3][local303 - arg4]) {
						local335 = this.aShortArrayArray2[local315];
						if (local335 != null) {
							for (local339 = 0; local339 < local335.length; local339++) {
								local297.p2(local335[local339] & 0xFFFF, 2147368472);
								local293++;
							}
						}
					}
					local315++;
				}
			}
		} else {
			for (local303 = arg4; local303 < arg6; local303++) {
				local315 = local303 * this.anInt414 * -1667858293 + arg3;
				for (local317 = arg3; local317 < arg5; local317++) {
					if (arg7[local317 - arg3][local303 - arg4]) {
						local335 = this.aShortArrayArray2[local315];
						if (local335 != null) {
							for (local339 = 0; local339 < local335.length; local339++) {
								local297.ip2(local335[local339] & 0xFFFF, -1813383815);
								local293++;
							}
						}
					}
					local315++;
				}
			}
		}
		if (local293 > 0) {
			@Pc(433) Class101_Sub1 local433 = new Class101_Sub1(this.aClass104_Sub1_12, 5123, local297.data, local297.pos * 212851357);
			this.aClass104_Sub1_12.method3862(local433, 4, 0, local293);
		}
	}

	@OriginalMember(owner = "client!aek", name = "d", descriptor = "(IILclient!ara;)Lclient!ara;", line = 637)
	@Override
	public Class93_Sub1_Sub4 method2492(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class93_Sub1_Sub4 arg2) {
		if ((this.aByteArrayArray6[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(19) int local19 = this.anInt412 * -1678286317 >> this.aClass104_Sub1_12.anInt532;
		@Pc(22) Class93_Sub1_Sub4_Sub2 local22 = (Class93_Sub1_Sub4_Sub2) arg2;
		@Pc(31) Class93_Sub1_Sub4_Sub2 local31;
		if (local22 != null && local22.method23521(local19, local19)) {
			local31 = local22;
			local22.method23523();
		} else {
			local31 = new Class93_Sub1_Sub4_Sub2(this.aClass104_Sub1_12, local19, local19);
		}
		local31.method23518(0, 0, local19, local19);
		this.method2378(local31, arg0, arg1);
		return local31;
	}

	@OriginalMember(owner = "client!aek", name = "g", descriptor = "(IILclient!ara;)Lclient!ara;", line = 637)
	@Override
	public Class93_Sub1_Sub4 method2487(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class93_Sub1_Sub4 arg2) {
		if ((this.aByteArrayArray6[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(19) int local19 = this.anInt412 * -1678286317 >> this.aClass104_Sub1_12.anInt532;
		@Pc(22) Class93_Sub1_Sub4_Sub2 local22 = (Class93_Sub1_Sub4_Sub2) arg2;
		@Pc(31) Class93_Sub1_Sub4_Sub2 local31;
		if (local22 != null && local22.method23521(local19, local19)) {
			local31 = local22;
			local22.method23523();
		} else {
			local31 = new Class93_Sub1_Sub4_Sub2(this.aClass104_Sub1_12, local19, local19);
		}
		local31.method23518(0, 0, local19, local19);
		this.method2378(local31, arg0, arg1);
		return local31;
	}

	@OriginalMember(owner = "client!aek", name = "i", descriptor = "(IILclient!ara;)Lclient!ara;", line = 637)
	@Override
	public Class93_Sub1_Sub4 method2504(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class93_Sub1_Sub4 arg2) {
		if ((this.aByteArrayArray6[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(19) int local19 = this.anInt412 * -1678286317 >> this.aClass104_Sub1_12.anInt532;
		@Pc(22) Class93_Sub1_Sub4_Sub2 local22 = (Class93_Sub1_Sub4_Sub2) arg2;
		@Pc(31) Class93_Sub1_Sub4_Sub2 local31;
		if (local22 != null && local22.method23521(local19, local19)) {
			local31 = local22;
			local22.method23523();
		} else {
			local31 = new Class93_Sub1_Sub4_Sub2(this.aClass104_Sub1_12, local19, local19);
		}
		local31.method23518(0, 0, local19, local19);
		this.method2378(local31, arg0, arg1);
		return local31;
	}

	@OriginalMember(owner = "client!aek", name = "aj", descriptor = "(Lclient!atk;II)V", line = 652)
	void method2376(@OriginalArg(0) Class93_Sub1_Sub4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) int[] local6 = this.anIntArrayArrayArray4[arg1][arg2];
		@Pc(13) int[] local13 = this.anIntArrayArrayArray1[arg1][arg2];
		@Pc(16) int local16 = local6.length;
		if (this.aClass104_Sub1_12.anIntArray40.length < local16) {
			this.aClass104_Sub1_12.anIntArray40 = new int[local16];
			this.aClass104_Sub1_12.anIntArray39 = new int[local16];
		}
		@Pc(36) int[] local36 = this.aClass104_Sub1_12.anIntArray40;
		@Pc(40) int[] local40 = this.aClass104_Sub1_12.anIntArray39;
		@Pc(42) int local42;
		for (local42 = 0; local42 < local16; local42++) {
			local36[local42] = local6[local42] >> this.aClass104_Sub1_12.anInt532;
			local40[local42] = local13[local42] >> this.aClass104_Sub1_12.anInt532;
		}
		local42 = 0;
		while (local42 < local16) {
			@Pc(76) int local76 = local36[local42];
			@Pc(81) int local81 = local40[local42++];
			@Pc(85) int local85 = local36[local42];
			@Pc(90) int local90 = local40[local42++];
			@Pc(94) int local94 = local36[local42];
			@Pc(99) int local99 = local40[local42++];
			if ((local76 - local85) * (local90 - local99) - (local90 - local81) * (local94 - local85) > 0) {
				arg0.method23526(local81, local90, local99, local76, local85, local94);
			}
		}
	}

	@OriginalMember(owner = "client!aek", name = "ay", descriptor = "(Lclient!atk;II)V", line = 652)
	void method2377(@OriginalArg(0) Class93_Sub1_Sub4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) int[] local6 = this.anIntArrayArrayArray4[arg1][arg2];
		@Pc(13) int[] local13 = this.anIntArrayArrayArray1[arg1][arg2];
		@Pc(16) int local16 = local6.length;
		if (this.aClass104_Sub1_12.anIntArray40.length < local16) {
			this.aClass104_Sub1_12.anIntArray40 = new int[local16];
			this.aClass104_Sub1_12.anIntArray39 = new int[local16];
		}
		@Pc(36) int[] local36 = this.aClass104_Sub1_12.anIntArray40;
		@Pc(40) int[] local40 = this.aClass104_Sub1_12.anIntArray39;
		@Pc(42) int local42;
		for (local42 = 0; local42 < local16; local42++) {
			local36[local42] = local6[local42] >> this.aClass104_Sub1_12.anInt532;
			local40[local42] = local13[local42] >> this.aClass104_Sub1_12.anInt532;
		}
		local42 = 0;
		while (local42 < local16) {
			@Pc(76) int local76 = local36[local42];
			@Pc(81) int local81 = local40[local42++];
			@Pc(85) int local85 = local36[local42];
			@Pc(90) int local90 = local40[local42++];
			@Pc(94) int local94 = local36[local42];
			@Pc(99) int local99 = local40[local42++];
			if ((local76 - local85) * (local90 - local99) - (local90 - local81) * (local94 - local85) > 0) {
				arg0.method23526(local81, local90, local99, local76, local85, local94);
			}
		}
	}

	@OriginalMember(owner = "client!aek", name = "ao", descriptor = "(Lclient!atk;II)V", line = 652)
	void method2378(@OriginalArg(0) Class93_Sub1_Sub4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) int[] local6 = this.anIntArrayArrayArray4[arg1][arg2];
		@Pc(13) int[] local13 = this.anIntArrayArrayArray1[arg1][arg2];
		@Pc(16) int local16 = local6.length;
		if (this.aClass104_Sub1_12.anIntArray40.length < local16) {
			this.aClass104_Sub1_12.anIntArray40 = new int[local16];
			this.aClass104_Sub1_12.anIntArray39 = new int[local16];
		}
		@Pc(36) int[] local36 = this.aClass104_Sub1_12.anIntArray40;
		@Pc(40) int[] local40 = this.aClass104_Sub1_12.anIntArray39;
		@Pc(42) int local42;
		for (local42 = 0; local42 < local16; local42++) {
			local36[local42] = local6[local42] >> this.aClass104_Sub1_12.anInt532;
			local40[local42] = local13[local42] >> this.aClass104_Sub1_12.anInt532;
		}
		local42 = 0;
		while (local42 < local16) {
			@Pc(76) int local76 = local36[local42];
			@Pc(81) int local81 = local40[local42++];
			@Pc(85) int local85 = local36[local42];
			@Pc(90) int local90 = local40[local42++];
			@Pc(94) int local94 = local36[local42];
			@Pc(99) int local99 = local40[local42++];
			if ((local76 - local85) * (local90 - local99) - (local90 - local81) * (local94 - local85) > 0) {
				arg0.method23526(local81, local90, local99, local76, local85, local94);
			}
		}
	}

	@OriginalMember(owner = "client!aek", name = "v", descriptor = "(Lclient!ara;IIIIZ)Z", line = 679)
	@Override
	public boolean method2496(@OriginalArg(0) Class93_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass205_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(20) int local20 = arg1 - (arg2 * this.aClass104_Sub1_12.anInt545 >> 8) >> this.aClass104_Sub1_12.anInt532;
			@Pc(34) int local34 = arg3 - (arg2 * this.aClass104_Sub1_12.anInt561 >> 8) >> this.aClass104_Sub1_12.anInt532;
			return this.aClass205_1.method24682(arg0, local20, local34);
		}
	}

	@OriginalMember(owner = "client!aek", name = "aw", descriptor = "(Lclient!ara;IIIIZ)Z", line = 679)
	@Override
	public boolean method2489(@OriginalArg(0) Class93_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass205_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(20) int local20 = arg1 - (arg2 * this.aClass104_Sub1_12.anInt545 >> 8) >> this.aClass104_Sub1_12.anInt532;
			@Pc(34) int local34 = arg3 - (arg2 * this.aClass104_Sub1_12.anInt561 >> 8) >> this.aClass104_Sub1_12.anInt532;
			return this.aClass205_1.method24682(arg0, local20, local34);
		}
	}

	@OriginalMember(owner = "client!aek", name = "as", descriptor = "(Lclient!ara;IIIIZ)Z", line = 679)
	@Override
	public boolean method2512(@OriginalArg(0) Class93_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass205_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(20) int local20 = arg1 - (arg2 * this.aClass104_Sub1_12.anInt545 >> 8) >> this.aClass104_Sub1_12.anInt532;
			@Pc(34) int local34 = arg3 - (arg2 * this.aClass104_Sub1_12.anInt561 >> 8) >> this.aClass104_Sub1_12.anInt532;
			return this.aClass205_1.method24682(arg0, local20, local34);
		}
	}

	@OriginalMember(owner = "client!aek", name = "c", descriptor = "(Lclient!ara;IIIIZ)V", line = 686)
	@Override
	public void method2493(@OriginalArg(0) Class93_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass205_1 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass104_Sub1_12.anInt545 >> 8) >> this.aClass104_Sub1_12.anInt532;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass104_Sub1_12.anInt561 >> 8) >> this.aClass104_Sub1_12.anInt532;
			this.aClass205_1.method24680(arg0, local19, local33);
		}
	}

	@OriginalMember(owner = "client!aek", name = "j", descriptor = "(Lclient!ara;IIIIZ)V", line = 686)
	@Override
	public void method2505(@OriginalArg(0) Class93_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass205_1 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass104_Sub1_12.anInt545 >> 8) >> this.aClass104_Sub1_12.anInt532;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass104_Sub1_12.anInt561 >> 8) >> this.aClass104_Sub1_12.anInt532;
			this.aClass205_1.method24680(arg0, local19, local33);
		}
	}

	@OriginalMember(owner = "client!aek", name = "t", descriptor = "(Lclient!ara;IIIIZ)V", line = 686)
	@Override
	public void method2506(@OriginalArg(0) Class93_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass205_1 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass104_Sub1_12.anInt545 >> 8) >> this.aClass104_Sub1_12.anInt532;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass104_Sub1_12.anInt561 >> 8) >> this.aClass104_Sub1_12.anInt532;
			this.aClass205_1.method24680(arg0, local19, local33);
		}
	}

	@OriginalMember(owner = "client!aek", name = "r", descriptor = "(Lclient!ara;IIIIZ)V", line = 693)
	@Override
	public void method2503(@OriginalArg(0) Class93_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass205_1 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass104_Sub1_12.anInt545 >> 8) >> this.aClass104_Sub1_12.anInt532;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass104_Sub1_12.anInt561 >> 8) >> this.aClass104_Sub1_12.anInt532;
			this.aClass205_1.method24681(arg0, local19, local33);
		}
	}

	@OriginalMember(owner = "client!aek", name = "at", descriptor = "(Lclient!ara;IIIIZ)V", line = 693)
	@Override
	public void method2513(@OriginalArg(0) Class93_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass205_1 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass104_Sub1_12.anInt545 >> 8) >> this.aClass104_Sub1_12.anInt532;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass104_Sub1_12.anInt561 >> 8) >> this.aClass104_Sub1_12.anInt532;
			this.aClass205_1.method24681(arg0, local19, local33);
		}
	}

	@OriginalMember(owner = "client!aek", name = "o", descriptor = "(Lclient!akf;[I)V", line = 700)
	@Override
	public void method2508(@OriginalArg(0) Class93_Sub16 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass22_3.method408(new Class93_Sub7(this.aClass104_Sub1_12, this, arg0, arg1), -1689919484);
	}

	@OriginalMember(owner = "client!aek", name = "ae", descriptor = "(Lclient!akf;[I)V", line = 700)
	@Override
	public void method2497(@OriginalArg(0) Class93_Sub16 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass22_3.method408(new Class93_Sub7(this.aClass104_Sub1_12, this, arg0, arg1), -920408881);
	}
}
