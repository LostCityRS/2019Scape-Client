package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!il")
public class Class341 implements Interface75 {

	@OriginalMember(owner = "client!il", name = "e", descriptor = "Lclient!il;")
	static final Class341 aClass341_3 = new Class341(0);

	@OriginalMember(owner = "client!il", name = "n", descriptor = "Lclient!il;")
	static final Class341 aClass341_1 = new Class341(1);

	@OriginalMember(owner = "client!il", name = "m", descriptor = "Lclient!il;")
	static final Class341 aClass341_2 = new Class341(2);

	@OriginalMember(owner = "client!il", name = "k", descriptor = "Lclient!il;")
	static final Class341 aClass341_4 = new Class341(3);

	@OriginalMember(owner = "client!il", name = "f", descriptor = "I")
	final int anInt4187;

	@OriginalMember(owner = "client!il", name = "<init>", descriptor = "(I)V", line = 53)
	Class341(@OriginalArg(0) int arg0) {
		this.anInt4187 = arg0 * -802604041;
	}

	@OriginalMember(owner = "client!il", name = "k", descriptor = "()I", line = 58)
	@Override
	public int method36919() {
		return this.anInt4187 * 422180295;
	}

	@OriginalMember(owner = "client!il", name = "n", descriptor = "()I", line = 58)
	@Override
	public int method36920() {
		return this.anInt4187 * 422180295;
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(ZI)V", line = 258)
	public static void method27496(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (arg0 != Class625.aBoolean850) {
			Class312.method26845(332588818);
			Class625.aBoolean850 = arg0;
		}
	}

	@OriginalMember(owner = "client!il", name = "ho", descriptor = "([[I[[IIIIIII)Z", line = 5436)
	static final boolean method27497(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		for (@Pc(1) int local1 = arg3; local1 <= arg5; local1++) {
			for (@Pc(6) int local6 = arg4; local6 <= arg6; local6++) {
				if (arg0[local1][local6] == arg2 && arg1[local1][local6] <= 1) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!il", name = "ff", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V", line = 5971)
	static final void method27498(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		arg2.anInt5891 -= -1915563430;
		arg0.anInt4041 = arg2.anIntArray519[arg2.anInt5891 * -1497248091] * 1431995055;
		arg0.anInt3992 = arg2.anIntArray519[-1497248091 * arg2.anInt5891 + 1] * -1671418485;
		Class354.method27694(arg0, -1174743804);
	}

	@OriginalMember(owner = "client!il", name = "jb", descriptor = "(Lclient!yf;B)V", line = 6653)
	static final void method27499(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5891 -= -1915563430;
	}

	@OriginalMember(owner = "client!il", name = "adn", descriptor = "(Lclient!yf;B)V", line = 10126)
	static final void method27500(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = arg0.aClass93_Sub28_4.method13833((String) arg0.anObjectArray45[(arg0.anInt5888 -= 957530791) * 587908375], (byte) -105);
	}

	@OriginalMember(owner = "client!il", name = "aqj", descriptor = "(Lclient!yf;I)V", line = 12896)
	static final void method27501(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5888 -= 957530791;
	}

	@OriginalMember(owner = "client!il", name = "axk", descriptor = "(Lclient!yf;I)V", line = 13872)
	static final void method27502(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -725861497;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		@Pc(33) int local33 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 2];
		Class266.method26229(local33, Class124_Sub2.method9308(local13, local23, (byte) -21), arg0, (byte) 120);
	}
}
