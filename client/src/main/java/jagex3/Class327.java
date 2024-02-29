package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hx")
public final class Class327 {

	@OriginalMember(owner = "client!hx", name = "gq", descriptor = "Lclient!py;")
	public static Class497 aClass497_102;

	@OriginalMember(owner = "client!hx", name = "e", descriptor = "I")
	public final int anInt4181;

	@OriginalMember(owner = "client!hx", name = "n", descriptor = "I")
	public final int anInt4182;

	@OriginalMember(owner = "client!hx", name = "m", descriptor = "[I")
	public final int[] anIntArray409;

	@OriginalMember(owner = "client!hx", name = "k", descriptor = "[I")
	public final int[] anIntArray408;

	@OriginalMember(owner = "client!hx", name = "f", descriptor = "Lclient!ch;")
	public final Class96 aClass96_1;

	@OriginalMember(owner = "client!hx", name = "w", descriptor = "I")
	final int anInt4183;

	@OriginalMember(owner = "client!hx", name = "afm", descriptor = "(Lclient!yf;B)V")
	static void method27411(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = Class14.method192(Class41.method815(arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091], 424376929), Class106.aClass717_8.method37101(), -2123126678);
	}

	@OriginalMember(owner = "client!hx", name = "wv", descriptor = "(Lclient!yf;S)V")
	static void method27412(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		arg0.anInt6052 -= 1189701933;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		Class274.aClass258_11.method26129(local13, -1334453224);
	}

	@OriginalMember(owner = "client!hx", name = "agf", descriptor = "(Lclient!yf;S)V")
	static void method27413(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		arg0.anInt6052 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		@Pc(29) Class47 local29 = (Class47) Class277.aClass32_Sub12_1.method18273(local13, 1072665738);
		if (local23 < 1 || local23 > 5 || local29.aStringArray4[local23 - 1] == null) {
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
		} else {
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = local29.aStringArray4[local23 - 1];
		}
	}

	@OriginalMember(owner = "client!hx", name = "cy", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;B)V")
	static void method27414(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) byte arg3) {
		arg0.anInt4035 = arg2.anIntArray521[(arg2.anInt6052 -= 1189701933) * -1497248091] * 1952867347;
		Class354.method27789(arg0, -1174743804);
	}

	@OriginalMember(owner = "client!hx", name = "<init>", descriptor = "(II[I[ILclient!ch;I)V")
	Class327(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) Class96 arg4, @OriginalArg(5) int arg5) {
		this.anInt4181 = arg0 * -1438346399;
		this.anInt4182 = arg1 * -1311771989;
		this.anIntArray409 = arg2;
		this.anIntArray408 = arg3;
		this.aClass96_1 = arg4;
		this.anInt4183 = arg5 * -1913132541;
	}

	@OriginalMember(owner = "client!hx", name = "e", descriptor = "(IIB)Z")
	public boolean method27407(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (arg1 >= 0 && arg1 < this.anIntArray408.length) {
			@Pc(11) int local11 = this.anIntArray408[arg1];
			if (arg0 >= local11 && arg0 <= local11 + this.anIntArray409[arg1]) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hx", name = "n", descriptor = "(II)Z")
	public boolean method27408(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 >= 0 && arg1 < this.anIntArray408.length) {
			@Pc(11) int local11 = this.anIntArray408[arg1];
			if (arg0 >= local11 && arg0 <= local11 + this.anIntArray409[arg1]) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hx", name = "m", descriptor = "(II)Z")
	public boolean method27409(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 >= 0 && arg1 < this.anIntArray408.length) {
			@Pc(11) int local11 = this.anIntArray408[arg1];
			if (arg0 >= local11 && arg0 <= local11 + this.anIntArray409[arg1]) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hx", name = "k", descriptor = "(II)Z")
	public boolean method27410(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 >= 0 && arg1 < this.anIntArray408.length) {
			@Pc(11) int local11 = this.anIntArray408[arg1];
			if (arg0 >= local11 && arg0 <= local11 + this.anIntArray409[arg1]) {
				return true;
			}
		}
		return false;
	}
}
