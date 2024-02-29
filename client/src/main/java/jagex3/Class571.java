package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ti")
public final class Class571 {

	@OriginalMember(owner = "client!ti", name = "m", descriptor = "(IIIILclient!te;FFFFF[BI)V")
	static void method31504(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class161 arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) byte[] arg10, @OriginalArg(11) int arg11) {
		for (@Pc(1) int local1 = 0; local1 < arg2; local1++) {
			method31513(local1, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11);
			arg11 += arg0 * arg1;
		}
	}

	@OriginalMember(owner = "client!ti", name = "n", descriptor = "(IIIILclient!te;FFFFF)[B")
	public static byte[] method31505(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class161 arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9) {
		@Pc(6) byte[] local6 = new byte[arg0 * arg1 * arg2];
		method31504(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, local6, 0);
		return local6;
	}

	@OriginalMember(owner = "client!ti", name = "f", descriptor = "(IIIILclient!te;FFFFF)[B")
	public static byte[] method31506(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class161 arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9) {
		@Pc(6) byte[] local6 = new byte[arg0 * arg1 * arg2];
		method31504(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, local6, 0);
		return local6;
	}

	@OriginalMember(owner = "client!ti", name = "p", descriptor = "(IIIILclient!te;FFFFF[BI)V")
	static void method31507(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class161 arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) byte[] arg10, @OriginalArg(11) int arg11) {
		for (@Pc(1) int local1 = 0; local1 < arg2; local1++) {
			method31513(local1, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11);
			arg11 += arg0 * arg1;
		}
	}

	@OriginalMember(owner = "client!ti", name = "k", descriptor = "(IIIIILclient!te;FFFFF[BI)V")
	static void method31508(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class161 arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) byte[] arg11, @OriginalArg(12) int arg12) {
		@Pc(3) int local3 = arg1 * arg2;
		@Pc(6) float[] local6 = new float[local3];
		@Pc(8) int local8;
		@Pc(13) int local13;
		for (local8 = 0; local8 < arg4; local8++) {
			local13 = arg12;
			arg5.method14747(arg0, arg1, arg2, arg3, arg6 / (float) arg1, arg7 / (float) arg2, arg8 / (float) arg3, arg9 * 127.0F, local6, 0);
			for (@Pc(38) int local38 = 0; local38 < local3; local38++) {
				arg11[local13] = (byte) ((float) arg11[local13] + local6[local38]);
				local13++;
			}
			arg6 *= 2.0F;
			arg7 *= 2.0F;
			arg8 *= 2.0F;
			arg9 *= arg10;
		}
		local8 = arg12;
		for (local13 = 0; local13 < local3; local13++) {
			arg11[local8] = (byte) (arg11[local8] + 127);
			local8++;
		}
	}

	@OriginalMember(owner = "client!ti", name = "w", descriptor = "(IIIILclient!te;FFFFF)[B")
	public static byte[] method31509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class161 arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9) {
		@Pc(6) byte[] local6 = new byte[arg0 * arg1 * arg2];
		method31504(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, local6, 0);
		return local6;
	}

	@OriginalMember(owner = "client!ti", name = "l", descriptor = "(IIIILclient!te;FFFFF)[B")
	public static byte[] method31510(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class161 arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9) {
		@Pc(6) byte[] local6 = new byte[arg0 * arg1 * arg2];
		method31504(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, local6, 0);
		return local6;
	}

	@OriginalMember(owner = "client!ti", name = "u", descriptor = "(IIIILclient!te;FFFFF)[B")
	public static byte[] method31511(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class161 arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9) {
		@Pc(6) byte[] local6 = new byte[arg0 * arg1 * arg2];
		method31504(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, local6, 0);
		return local6;
	}

	@OriginalMember(owner = "client!ti", name = "z", descriptor = "(IIIILclient!te;FFFFF)[B")
	public static byte[] method31512(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class161 arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9) {
		@Pc(6) byte[] local6 = new byte[arg0 * arg1 * arg2];
		method31504(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, local6, 0);
		return local6;
	}

	@OriginalMember(owner = "client!ti", name = "e", descriptor = "(IIIIILclient!te;FFFFF[BI)V")
	static void method31513(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class161 arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) byte[] arg11, @OriginalArg(12) int arg12) {
		@Pc(3) int local3 = arg1 * arg2;
		@Pc(6) float[] local6 = new float[local3];
		@Pc(8) int local8;
		@Pc(13) int local13;
		for (local8 = 0; local8 < arg4; local8++) {
			local13 = arg12;
			arg5.method14747(arg0, arg1, arg2, arg3, arg6 / (float) arg1, arg7 / (float) arg2, arg8 / (float) arg3, arg9 * 127.0F, local6, 0);
			for (@Pc(38) int local38 = 0; local38 < local3; local38++) {
				arg11[local13] = (byte) ((float) arg11[local13] + local6[local38]);
				local13++;
			}
			arg6 *= 2.0F;
			arg7 *= 2.0F;
			arg8 *= 2.0F;
			arg9 *= arg10;
		}
		local8 = arg12;
		for (local13 = 0; local13 < local3; local13++) {
			arg11[local8] = (byte) (arg11[local8] + 127);
			local8++;
		}
	}

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "()V")
	Class571() throws Throwable {
		throw new Error();
	}
}
