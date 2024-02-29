package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public final class Class183 implements Interface18 {

	@OriginalMember(owner = "client!bf", name = "al", descriptor = "[I")
	static int[] anIntArray293;

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
	final int anInt3332;

	@OriginalMember(owner = "client!bf", name = "n", descriptor = "I")
	final int anInt3331;

	@OriginalMember(owner = "client!bf", name = "m", descriptor = "[I")
	final int[] anIntArray292;

	@OriginalMember(owner = "client!bf", name = "pk", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V")
	static void method24585(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt6049 -= 957530791) * 587908375];
		if (Class532.method30778(local13, arg2, 1518522314) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		Class499.method30329(local13, arg2, 1706007643);
	}

	@OriginalMember(owner = "client!bf", name = "ani", descriptor = "(Lclient!yf;B)V")
	static void method24586(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		Class295.method26694(arg0, Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3, 1744525210);
	}

	@OriginalMember(owner = "client!bf", name = "fn", descriptor = "(I)V")
	static void method24587(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = client.anInt3408 * -1378711501;
		@Pc(7) int local7 = client.anInt3416 * 2091353777;
		if (client.anInt3413 * -108363597 < local3) {
			local3 = client.anInt3413 * -108363597;
		}
		if (BaseVarTypeString.anInt5362 * 2090134413 < local7) {
			local7 = BaseVarTypeString.anInt5362 * 2090134413;
		}
		try {
			if (Class51.aClass93_Sub36_1 != null) {
				Class447.aClass447_4.method29084(new Object[] { local3, local7, Class255.method26101(1796947708), Class51.aClass93_Sub36_1.aClass166_Sub24_1.method15877(-509783612) }, -1473067086);
			}
		} catch (@Pc(59) Throwable local59) {
		}
	}

	@OriginalMember(owner = "client!bf", name = "aup", descriptor = "(Lclient!yf;I)V")
	static void method24588(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub46_1.method16541(396043493) == 1 ? 1 : 0;
	}

	@OriginalMember(owner = "client!bf", name = "iq", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V")
	static void method24589(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		arg0.aString173 = null;
		arg0.aClass310_7 = null;
	}

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(II[I)V")
	Class183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		this.anInt3332 = arg0 * -1415554075;
		this.anInt3331 = arg1 * -4857121;
		this.anIntArray292 = arg2;
	}

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(II)V")
	Class183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this(arg0, arg1, new int[arg1 * arg0]);
	}

	@OriginalMember(owner = "client!bf", name = "k", descriptor = "()I")
	@Override
	public int method31070() {
		return this.anInt3332 * -774739475;
	}

	@OriginalMember(owner = "client!bf", name = "n", descriptor = "()I")
	@Override
	public int method31069() {
		return this.anInt3331 * -534357729;
	}

	@OriginalMember(owner = "client!bf", name = "m", descriptor = "()V")
	@Override
	public void method31065() {
	}

	@OriginalMember(owner = "client!bf", name = "u", descriptor = "()V")
	@Override
	public void method31066() {
	}

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "()I")
	@Override
	public int method31067() {
		return this.anInt3332 * -774739475;
	}

	@OriginalMember(owner = "client!bf", name = "w", descriptor = "()I")
	@Override
	public int method31068() {
		return this.anInt3331 * -534357729;
	}

	@OriginalMember(owner = "client!bf", name = "l", descriptor = "()I")
	@Override
	public int method31072() {
		return this.anInt3331 * -534357729;
	}

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "()I")
	@Override
	public int method31071() {
		return this.anInt3332 * -774739475;
	}
}
