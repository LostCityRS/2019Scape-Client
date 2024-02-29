package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!su")
public final class Class561 {

	@OriginalMember(owner = "client!su", name = "e", descriptor = "Ljava/lang/String;")
	String aString236;

	@OriginalMember(owner = "client!su", name = "f", descriptor = "I")
	int anInt5495;

	@OriginalMember(owner = "client!su", name = "m", descriptor = "I")
	int anInt5496;

	@OriginalMember(owner = "client!su", name = "k", descriptor = "I")
	int anInt5497;

	@OriginalMember(owner = "client!su", name = "n", descriptor = "I")
	int anInt5498;

	@OriginalMember(owner = "client!su", name = "qk", descriptor = "(Lclient!yf;I)V")
	static void method31331(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class57.method1088(local11, local14, arg0, 65534);
	}

	@OriginalMember(owner = "client!su", name = "wd", descriptor = "(Lclient!yf;I)V")
	static void method31332(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= -1915563430;
		@Pc(17) Class93_Sub1_Sub2 local17 = (Class93_Sub1_Sub2) Class638.aClass32_Sub22_1.method18273(arg0.anIntArray521[arg0.anInt6052 * -1497248091], -1949164151);
		@Pc(27) int local27 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		@Pc(29) int local29 = -1;
		for (@Pc(31) int local31 = 0; local31 < local17.anInt317 * 795395889; local31++) {
			if (local17.anIntArray25[local31] == local27) {
				local29 = local17.anIntArray24[local31];
				break;
			}
		}
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local29;
	}

	@OriginalMember(owner = "client!su", name = "kd", descriptor = "(Lclient!hf;IILclient!yf;I)V")
	static void method31333(@OriginalArg(0) Class312 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class681 arg3, @OriginalArg(4) int arg4) {
		if (arg0.anIntArray379 == null) {
			if (arg2 <= 0) {
				return;
			}
			arg0.aByteArrayArray14 = new byte[11][];
			arg0.aByteArrayArray15 = new byte[11][];
			arg0.anIntArray375 = new int[11];
			arg0.anIntArray377 = new int[11];
			arg0.anIntArray379 = new int[11];
		}
		arg0.anIntArray379[arg1] = arg2;
		if (arg2 > 0) {
			arg0.aBoolean702 = true;
			return;
		}
		arg0.aBoolean702 = false;
		for (@Pc(43) int local43 = 0; local43 < arg0.aByteArrayArray14.length; local43++) {
			if (arg0.aByteArrayArray14[local43] != null || arg0.anIntArray379[local43] > 0) {
				arg0.aBoolean702 = true;
				break;
			}
		}
	}

	@OriginalMember(owner = "client!su", name = "<init>", descriptor = "()V")
	Class561() {
	}

	@OriginalMember(owner = "client!su", name = "k", descriptor = "(B)I")
	public int method31318(@OriginalArg(0) byte arg0) {
		return this.anInt5497 * 257860031;
	}

	@OriginalMember(owner = "client!su", name = "e", descriptor = "(I)Ljava/lang/String;")
	public String method31319(@OriginalArg(0) int arg0) {
		return this.aString236;
	}

	@OriginalMember(owner = "client!su", name = "w", descriptor = "()Ljava/lang/String;")
	public String method31320() {
		return this.aString236;
	}

	@OriginalMember(owner = "client!su", name = "m", descriptor = "(B)I")
	public int method31321(@OriginalArg(0) byte arg0) {
		return this.anInt5496 * 1277858807;
	}

	@OriginalMember(owner = "client!su", name = "n", descriptor = "(B)I")
	public int method31322(@OriginalArg(0) byte arg0) {
		return this.anInt5498 * 1333148365;
	}

	@OriginalMember(owner = "client!su", name = "f", descriptor = "(I)I")
	public int method31323(@OriginalArg(0) int arg0) {
		return this.anInt5495 * -1747829505;
	}

	@OriginalMember(owner = "client!su", name = "l", descriptor = "()Ljava/lang/String;")
	public String method31324() {
		return this.aString236;
	}

	@OriginalMember(owner = "client!su", name = "u", descriptor = "()I")
	public int method31325() {
		return this.anInt5498 * 1333148365;
	}

	@OriginalMember(owner = "client!su", name = "z", descriptor = "()I")
	public int method31326() {
		return this.anInt5498 * 1333148365;
	}

	@OriginalMember(owner = "client!su", name = "p", descriptor = "()I")
	public int method31327() {
		return this.anInt5496 * 1277858807;
	}

	@OriginalMember(owner = "client!su", name = "d", descriptor = "()I")
	public int method31328() {
		return this.anInt5496 * 1277858807;
	}

	@OriginalMember(owner = "client!su", name = "c", descriptor = "()I")
	public int method31329() {
		return this.anInt5497 * 257860031;
	}

	@OriginalMember(owner = "client!su", name = "r", descriptor = "()I")
	public int method31330() {
		return this.anInt5497 * 257860031;
	}
}
