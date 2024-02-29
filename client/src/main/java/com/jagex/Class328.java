package com.jagex;

import com.jagex.twitchtv.TwitchEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hy")
public class Class328 implements Interface75 {

	@OriginalMember(owner = "client!hy", name = "e", descriptor = "Lclient!hy;")
	public static final Class328 aClass328_4 = new Class328(1, 0);

	@OriginalMember(owner = "client!hy", name = "n", descriptor = "Lclient!hy;")
	public static final Class328 aClass328_3 = new Class328(2, 1);

	@OriginalMember(owner = "client!hy", name = "m", descriptor = "Lclient!hy;")
	static final Class328 aClass328_2 = new Class328(0, 2);

	@OriginalMember(owner = "client!hy", name = "k", descriptor = "I")
	public final int anInt4144;

	@OriginalMember(owner = "client!hy", name = "f", descriptor = "I")
	final int anInt4143;

	@OriginalMember(owner = "client!hy", name = "<init>", descriptor = "(II)V", line = 17)
	Class328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4144 = arg0 * 1000589023;
		this.anInt4143 = arg1 * 729181307;
	}

	@OriginalMember(owner = "client!hy", name = "k", descriptor = "()I", line = 23)
	@Override
	public int method36919() {
		return this.anInt4143 * -1195601229;
	}

	@OriginalMember(owner = "client!hy", name = "n", descriptor = "()I", line = 23)
	@Override
	public int method36920() {
		return this.anInt4143 * -1195601229;
	}

	@OriginalMember(owner = "client!hy", name = "j", descriptor = "(Lclient!dh;J)V", line = 282)
	public static void method27324(@OriginalArg(0) Class104 arg0, @OriginalArg(1) long arg1) {
		if (Class625.anInt5696 * 908241389 == 3 || Class625.anInt5696 * 908241389 == 0) {
			return;
		}
		@Pc(29) int local29;
		if (Class625.anInt5696 * 908241389 == 1) {
			if (Class625.aStringArray33 == null || Class625.aStringArray33.length == 0) {
				throw new RuntimeException("");
			}
			@Pc(27) int local27 = 0;
			for (local29 = 0; local29 < Class625.aStringArray33.length; local29++) {
				if (Class625.aStringArray33[local29] == null) {
					local27 += 100;
				} else {
					try {
						local27 += Class125_Sub1.aClass586_1.method31627(Class625.aStringArray33[local29], false, 1460409597);
					} catch (@Pc(49) Exception_Sub5 local49) {
						Class166_Sub6.method15480(Class72.aClass72_1, local49.aString65, local49.anInt2491 * 1562390493, local49.getCause(), 1053905725);
						Class625.anInt5696 = -2024909905;
						return;
					}
				}
			}
			Class625.anInt5693 = local27 / Class625.aStringArray33.length * 279167647;
			if (Class625.anInt5693 * 662624607 != 100) {
				return;
			}
			Class625.anInt5696 = Class535.method30657(-709694321) * 756685797;
			if (Class625.anInt5696 * 908241389 != 2) {
				return;
			}
		}
		@Pc(93) TwitchEvent[] local93 = Class166_Sub13.aTwitchTV1.Service();
		if (local93 != null) {
			for (local29 = 0; local29 < local93.length; local29++) {
				@Pc(106) TwitchEvent local106 = local93[local29];
				if (local106 != null && Class490.method29976(local106, arg1)) {
					@Pc(116) Class591 local116 = local106.n();
					if (local116 != null) {
						Class707.method36751(local116.method36920(), local106, (byte) -47);
					}
				}
			}
		}
		if (Class166_Sub13.aTwitchTV1.IsStreaming() && arg1 - Class625.aLong292 * 8183709841810229893L > Class314.aLong258 * 4248725778911820789L) {
			Class625.aLong292 = arg1 * -341548231186129331L;
			if (arg0.method20586()) {
				Class625.aBoolean849 = true;
			}
		}
		if (!Class166_Sub13.aTwitchTV1.IsStreaming()) {
			Class625.anInt5694 = 0;
		} else if (arg1 - Class625.aLong293 * 3747471808327889673L < (long) (Class625.anInt5695 * -545714855)) {
			Class625.anInt5694 = -563900998;
		} else if (arg1 - Class625.aLong294 * 3642944995064872967L < (long) (Class625.anInt5695 * -545714855)) {
			Class625.anInt5694 = -281950499;
		} else {
			Class625.anInt5694 = 0;
		}
		if (arg1 - Class625.aLong291 * -3414142973785400119L > (long) (Class625.anInt5692 * 163263969) && Class166_Sub13.aTwitchTV1.GetWebcamState() == 5) {
			Class166_Sub13.aTwitchTV1.RestartWebcamDevice();
			Class625.aLong291 = arg1 * 273097735325007225L;
		}
	}

	@OriginalMember(owner = "client!hy", name = "kw", descriptor = "(Lclient!yf;I)V", line = 6738)
	static final void method27325(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class124_Sub1.method9191(local11, local14, arg0, 787869855);
	}

	@OriginalMember(owner = "client!hy", name = "vx", descriptor = "(Lclient!yf;I)V", line = 8739)
	static final void method27326(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		@Pc(29) Class93_Sub40 local29 = (Class93_Sub40) client.aClass16_22.method214((long) local13);
		if (local29 != null && local29.anInt3172 * 1220811495 == local23) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 1;
		} else {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
		}
	}

	@OriginalMember(owner = "client!hy", name = "acu", descriptor = "(Lclient!yf;I)V", line = 10006)
	static final void method27327(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = arg0.aClass386_3.anInt4642 * 849728367;
	}
}
