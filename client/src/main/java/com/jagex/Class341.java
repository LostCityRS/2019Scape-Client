package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!il")
public final class Class341 implements Interface75 {

	@OriginalMember(owner = "client!il", name = "e", descriptor = "Lclient!il;")
	static final Class341 aClass341_3 = new Class341(0);

	@OriginalMember(owner = "client!il", name = "n", descriptor = "Lclient!il;")
	static final Class341 aClass341_1 = new Class341(1);

	@OriginalMember(owner = "client!il", name = "m", descriptor = "Lclient!il;")
	static final Class341 aClass341_2 = new Class341(2);

	@OriginalMember(owner = "client!il", name = "k", descriptor = "Lclient!il;")
	static final Class341 aClass341_4 = new Class341(3);

	@OriginalMember(owner = "client!il", name = "f", descriptor = "I")
	final int anInt4228;

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(ZI)V")
	public static void method27589(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (arg0 != Class625.aBoolean859) {
			Class312.method27015(332588818);
			Class625.aBoolean859 = arg0;
		}
	}

	@OriginalMember(owner = "client!il", name = "aqj", descriptor = "(Lclient!yf;I)V")
	static void method27590(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6049 -= 957530791;
	}

	@OriginalMember(owner = "client!il", name = "axk", descriptor = "(Lclient!yf;I)V")
	static void method27591(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= -725861497;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		@Pc(33) int local33 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 2];
		Class266.method26322(local33, Class124_Sub2.method9308(local13, local23, (byte) -21), arg0, (byte) 120);
	}

	@OriginalMember(owner = "client!il", name = "adn", descriptor = "(Lclient!yf;B)V")
	static void method27592(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = arg0.aClass93_Sub28_4.method13826((String) arg0.anObjectArray45[(arg0.anInt6049 -= 957530791) * 587908375], (byte) -105);
	}

	@OriginalMember(owner = "client!il", name = "jb", descriptor = "(Lclient!yf;B)V")
	static void method27593(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt6052 -= -1915563430;
	}

	@OriginalMember(owner = "client!il", name = "ff", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V")
	static void method27594(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		arg2.anInt6052 -= -1915563430;
		arg0.anInt4082 = arg2.anIntArray521[arg2.anInt6052 * -1497248091] * 1431995055;
		arg0.anInt4033 = arg2.anIntArray521[-1497248091 * arg2.anInt6052 + 1] * -1671418485;
		Class354.method27789(arg0, -1174743804);
	}

	@OriginalMember(owner = "client!il", name = "ho", descriptor = "([[I[[IIIIIII)Z")
	static boolean method27595(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		for (@Pc(1) int local1 = arg3; local1 <= arg5; local1++) {
			for (@Pc(6) int local6 = arg4; local6 <= arg6; local6++) {
				if (arg0[local1][local6] == arg2 && arg1[local1][local6] <= 1) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!il", name = "<init>", descriptor = "(I)V")
	Class341(@OriginalArg(0) int arg0) {
		this.anInt4228 = arg0 * -802604041;
	}

	@OriginalMember(owner = "client!il", name = "k", descriptor = "()I")
	@Override
	public int method37100() {
		return this.anInt4228 * 422180295;
	}

	@OriginalMember(owner = "client!il", name = "n", descriptor = "()I")
	@Override
	public int method37101() {
		return this.anInt4228 * 422180295;
	}
}
