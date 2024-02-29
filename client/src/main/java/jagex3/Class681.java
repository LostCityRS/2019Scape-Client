package jagex3;

import java.util.HashMap;
import java.util.Map;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!yf")
public final class Class681 {

	@OriginalMember(owner = "client!yf", name = "n", descriptor = "[Ljava/lang/Object;")
	Object[] anObjectArray44;

	@OriginalMember(owner = "client!yf", name = "e", descriptor = "[I")
	int[] anIntArray519;

	@OriginalMember(owner = "client!yf", name = "m", descriptor = "[J")
	long[] aLongArray26;

	@OriginalMember(owner = "client!yf", name = "b", descriptor = "Lclient!ahm;")
	Class132_Sub1_Sub1_Sub1 aClass132_Sub1_Sub1_Sub1_4;

	@OriginalMember(owner = "client!yf", name = "q", descriptor = "Lclient!kr;")
	Class386 aClass386_3;

	@OriginalMember(owner = "client!yf", name = "x", descriptor = "Lclient!akr;")
	Class93_Sub28 aClass93_Sub28_4;

	@OriginalMember(owner = "client!yf", name = "h", descriptor = "Lclient!st;")
	Interface61 anInterface61_1;

	@OriginalMember(owner = "client!yf", name = "t", descriptor = "I")
	int anInt6054;

	@OriginalMember(owner = "client!yf", name = "a", descriptor = "Lclient!aut;")
	Class132_Sub1_Sub5_Sub1 aClass132_Sub1_Sub5_Sub1_1;

	@OriginalMember(owner = "client!yf", name = "s", descriptor = "Z")
	boolean aBoolean884;

	@OriginalMember(owner = "client!yf", name = "ae", descriptor = "[I")
	int[] anIntArray522;

	@OriginalMember(owner = "client!yf", name = "ag", descriptor = "[Lclient!ss;")
	Class560[] aClass560Array2;

	@OriginalMember(owner = "client!yf", name = "al", descriptor = "Lclient!asc;")
	Class93_Sub1_Sub13 aClass93_Sub1_Sub13_1;

	@OriginalMember(owner = "client!yf", name = "y", descriptor = "Lclient!ne;")
	Class434 aClass434_1;

	@OriginalMember(owner = "client!yf", name = "k", descriptor = "[I")
	int[] anIntArray520 = new int[5];

	@OriginalMember(owner = "client!yf", name = "f", descriptor = "[[I")
	int[][] anIntArrayArray67 = new int[5][5000];

	@OriginalMember(owner = "client!yf", name = "w", descriptor = "[I")
	int[] anIntArray521 = new int[1000];

	@OriginalMember(owner = "client!yf", name = "l", descriptor = "I")
	int anInt6052 = 0;

	@OriginalMember(owner = "client!yf", name = "u", descriptor = "[Ljava/lang/Object;")
	Object[] anObjectArray45 = new Object[1000];

	@OriginalMember(owner = "client!yf", name = "z", descriptor = "I")
	int anInt6049 = 0;

	@OriginalMember(owner = "client!yf", name = "p", descriptor = "[J")
	long[] aLongArray27 = new long[1000];

	@OriginalMember(owner = "client!yf", name = "d", descriptor = "I")
	int anInt6055 = 0;

	@OriginalMember(owner = "client!yf", name = "c", descriptor = "I")
	int anInt6051 = 0;

	@OriginalMember(owner = "client!yf", name = "r", descriptor = "[Lclient!yx;")
	Class696[] aClass696Array1 = new Class696[50];

	@OriginalMember(owner = "client!yf", name = "v", descriptor = "Lclient!ya;")
	Class677 aClass677_1 = new Class677();

	@OriginalMember(owner = "client!yf", name = "o", descriptor = "Lclient!ya;")
	Class677 aClass677_2 = new Class677();

	@OriginalMember(owner = "client!yf", name = "g", descriptor = "Ljava/util/Map;")
	Map aMap26 = new HashMap();

	@OriginalMember(owner = "client!yf", name = "i", descriptor = "Ljava/util/Map;")
	Map aMap25 = new HashMap();

	@OriginalMember(owner = "client!yf", name = "j", descriptor = "I")
	int anInt6053 = 0;

	@OriginalMember(owner = "client!yf", name = "ah", descriptor = "I")
	int anInt6050 = -2047914607;

	@OriginalMember(owner = "client!yf", name = "c", descriptor = "([J[Ljava/lang/Object;III)V")
	static void method33426(@OriginalArg(0) long[] arg0, @OriginalArg(1) Object[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(8) int local8 = (arg3 + arg2) / 2;
		@Pc(10) int local10 = arg2;
		@Pc(14) long local14 = arg0[local8];
		arg0[local8] = arg0[arg3];
		arg0[arg3] = local14;
		@Pc(28) Object local28 = arg1[local8];
		arg1[local8] = arg1[arg3];
		arg1[arg3] = local28;
		@Pc(46) int local46 = Long.MAX_VALUE == local14 ? 0 : 1;
		for (@Pc(48) int local48 = arg2; local48 < arg3; local48++) {
			if (arg0[local48] < local14 + (long) (local48 & local46)) {
				@Pc(66) long local66 = arg0[local48];
				arg0[local48] = arg0[local10];
				arg0[local10] = local66;
				@Pc(80) Object local80 = arg1[local48];
				arg1[local48] = arg1[local10];
				arg1[local10++] = local80;
			}
		}
		arg0[arg3] = arg0[local10];
		arg0[local10] = local14;
		arg1[arg3] = arg1[local10];
		arg1[local10] = local28;
		method33426(arg0, arg1, arg2, local10 - 1, -1942541066);
		method33426(arg0, arg1, local10 + 1, arg3, -1028044048);
	}

	@OriginalMember(owner = "client!yf", name = "<init>", descriptor = "()V")
	Class681() {
	}
}
