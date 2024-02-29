package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oo")
public final class Class467 {

	@OriginalMember(owner = "client!oo", name = "m", descriptor = "I")
	public static final int anInt5254 = 29;

	@OriginalMember(owner = "client!oo", name = "n", descriptor = "I")
	public static final int anInt5255 = 2;

	@OriginalMember(owner = "client!oo", name = "v", descriptor = "I")
	public static final int anInt5256 = 26;

	@OriginalMember(owner = "client!oo", name = "k", descriptor = "I")
	public static final int anInt5257 = 11;

	@OriginalMember(owner = "client!oo", name = "e", descriptor = "I")
	public static final int anInt5258 = 28;

	@OriginalMember(owner = "client!oo", name = "w", descriptor = "I")
	public static final int anInt5259 = 25;

	@OriginalMember(owner = "client!oo", name = "l", descriptor = "I")
	public static final int anInt5260 = 21;

	@OriginalMember(owner = "client!oo", name = "t", descriptor = "I")
	public static final int anInt5261 = 15;

	@OriginalMember(owner = "client!oo", name = "z", descriptor = "I")
	public static final int anInt5262 = 5;

	@OriginalMember(owner = "client!oo", name = "p", descriptor = "I")
	public static final int anInt5263 = 20;

	@OriginalMember(owner = "client!oo", name = "d", descriptor = "I")
	public static final int anInt5264 = 9;

	@OriginalMember(owner = "client!oo", name = "c", descriptor = "I")
	public static final int anInt5265 = 23;

	@OriginalMember(owner = "client!oo", name = "u", descriptor = "I")
	public static final int anInt5266 = 10;

	@OriginalMember(owner = "client!oo", name = "r", descriptor = "I")
	public static final int anInt5267 = 14;

	@OriginalMember(owner = "client!oo", name = "o", descriptor = "I")
	public static final int anInt5268 = 22;

	@OriginalMember(owner = "client!oo", name = "s", descriptor = "I")
	public static final int anInt5269 = 6;

	@OriginalMember(owner = "client!oo", name = "f", descriptor = "I")
	public static final int anInt5270 = 24;

	@OriginalMember(owner = "client!oo", name = "q", descriptor = "I")
	public static final int anInt5271 = 17;

	@OriginalMember(owner = "client!oo", name = "x", descriptor = "I")
	public static final int anInt5272 = 19;

	@OriginalMember(owner = "client!oo", name = "b", descriptor = "I")
	public static final int anInt5273 = 16;

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "I")
	public static final int anInt5274 = 13;

	@OriginalMember(owner = "client!oo", name = "h", descriptor = "I")
	public static final int anInt5275 = 27;

	@OriginalMember(owner = "client!oo", name = "g", descriptor = "I")
	public static final int anInt5276 = 8;

	@OriginalMember(owner = "client!oo", name = "i", descriptor = "I")
	public static final int anInt5277 = 1;

	@OriginalMember(owner = "client!oo", name = "j", descriptor = "I")
	public static final int anInt5278 = 3;

	@OriginalMember(owner = "client!oo", name = "y", descriptor = "I")
	public static final int anInt5279 = 4;

	@OriginalMember(owner = "client!oo", name = "agm", descriptor = "(Lclient!yf;I)V")
	static void method29510(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = ((Class47) Class277.aClass32_Sub12_1.method18273(local12, -1822892454)).aString6;
	}

	@OriginalMember(owner = "client!oo", name = "arh", descriptor = "(Lclient!yf;B)V")
	static void method29511(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt6052 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(27) String local27 = (String) arg0.anObjectArray45[(arg0.anInt6049 -= 957530791) * 587908375];
		@Pc(42) boolean local42 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1] == 1;
		Class225.method25697(local13, local27, local42, 2128534619);
	}

	@OriginalMember(owner = "client!oo", name = "asd", descriptor = "(Lclient!yf;I)V")
	static void method29512(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub33_1, arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091] == 1 ? 1 : 0, (byte) 123);
		Class106_Sub1.method5148(-553042424);
		client.aBoolean603 = false;
	}

	@OriginalMember(owner = "client!oo", name = "<init>", descriptor = "()V")
	Class467() throws Throwable {
		throw new Error();
	}
}
