package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ze")
public final class Class704 {

	@OriginalMember(owner = "client!ze", name = "hw", descriptor = "Lclient!aog;")
	public static Class41_Sub6 aClass41_Sub6_3;

	@OriginalMember(owner = "client!ze", name = "g", descriptor = "(Lclient!oq;)F")
	public static float method37112(@OriginalArg(0) Class466 arg0) {
		@Pc(4) Class463 local4 = Class463.method29541(0.0F, 0.0F, 1.0F);
		local4.method29500(arg0);
		@Pc(14) double local14 = 1.5707963267948966D - Math.acos((double) local4.aFloat295);
		local4.method29557();
		return (float) local14;
	}

	@OriginalMember(owner = "client!ze", name = "h", descriptor = "(Lclient!oq;)I")
	public static int method37113(@OriginalArg(0) Class466 arg0) {
		@Pc(4) Class463 local4 = Class463.method29541(0.0F, 0.0F, 1.0F);
		local4.method29500(arg0);
		@Pc(15) double local15 = Math.atan2((double) local4.aFloat297, (double) local4.aFloat296);
		local4.method29557();
		if (local15 < 0.0D) {
			local15 = 3.141592653589793D + 3.141592653589793D + local15;
		}
		return (int) (local15 / 6.283185307179586D * 16384.0D) & 0x3FFF;
	}

	@OriginalMember(owner = "client!ze", name = "i", descriptor = "(Lclient!oq;)F")
	public static float method37114(@OriginalArg(0) Class466 arg0) {
		@Pc(4) Class463 local4 = Class463.method29541(0.0F, 0.0F, 1.0F);
		local4.method29500(arg0);
		@Pc(14) double local14 = 1.5707963267948966D - Math.acos((double) local4.aFloat295);
		local4.method29557();
		return (float) local14;
	}

	@OriginalMember(owner = "client!ze", name = "o", descriptor = "(Lclient!oq;)F")
	public static float method37115(@OriginalArg(0) Class466 arg0) {
		@Pc(4) Class463 local4 = Class463.method29541(0.0F, 0.0F, 1.0F);
		local4.method29500(arg0);
		@Pc(14) double local14 = 1.5707963267948966D - Math.acos((double) local4.aFloat295);
		local4.method29557();
		return (float) local14;
	}

	@OriginalMember(owner = "client!ze", name = "j", descriptor = "(Lclient!oq;)I")
	public static int method37116(@OriginalArg(0) Class466 arg0) {
		@Pc(4) Class463 local4 = Class463.method29541(0.0F, 0.0F, 1.0F);
		local4.method29500(arg0);
		@Pc(14) double local14 = 1.5707963267948966D - Math.acos((double) local4.aFloat295);
		local4.method29557();
		if (local14 < 0.0D) {
			local14 = local14 + 3.141592653589793D + 3.141592653589793D;
		}
		return (int) (local14 / 6.283185307179586D * 16384.0D) & 0x3FFF;
	}

	@OriginalMember(owner = "client!ze", name = "a", descriptor = "(Lclient!oq;)I")
	public static int method37117(@OriginalArg(0) Class466 arg0) {
		@Pc(4) Class463 local4 = Class463.method29541(0.0F, 0.0F, 1.0F);
		local4.method29500(arg0);
		@Pc(14) double local14 = 1.5707963267948966D - Math.acos((double) local4.aFloat295);
		local4.method29557();
		if (local14 < 0.0D) {
			local14 = local14 + 3.141592653589793D + 3.141592653589793D;
		}
		return (int) (local14 / 6.283185307179586D * 16384.0D) & 0x3FFF;
	}

	@OriginalMember(owner = "client!ze", name = "m", descriptor = "(Lclient!oq;)F")
	public static float method37118(@OriginalArg(0) Class466 arg0) {
		@Pc(4) Class463 local4 = Class463.method29541(0.0F, 0.0F, 1.0F);
		local4.method29500(arg0);
		@Pc(14) double local14 = 1.5707963267948966D - Math.acos((double) local4.aFloat295);
		local4.method29557();
		return (float) local14;
	}

	@OriginalMember(owner = "client!ze", name = "k", descriptor = "(Lclient!oq;)I")
	public static int method37119(@OriginalArg(0) Class466 arg0) {
		@Pc(4) Class463 local4 = Class463.method29541(0.0F, 0.0F, 1.0F);
		local4.method29500(arg0);
		@Pc(14) double local14 = 1.5707963267948966D - Math.acos((double) local4.aFloat295);
		local4.method29557();
		if (local14 < 0.0D) {
			local14 = local14 + 3.141592653589793D + 3.141592653589793D;
		}
		return (int) (local14 / 6.283185307179586D * 16384.0D) & 0x3FFF;
	}

	@OriginalMember(owner = "client!ze", name = "x", descriptor = "(Lclient!oq;)F")
	public static float method37120(@OriginalArg(0) Class466 arg0) {
		@Pc(4) Class463 local4 = Class463.method29541(0.0F, 0.0F, 1.0F);
		local4.method29500(arg0);
		@Pc(15) double local15 = Math.atan2((double) local4.aFloat297, (double) local4.aFloat296);
		local4.method29557();
		if (local15 < 0.0D) {
			local15 = local15 + 3.141592653589793D + 3.141592653589793D;
		}
		return (float) local15;
	}

	@OriginalMember(owner = "client!ze", name = "w", descriptor = "(Lclient!oq;)F")
	public static float method37121(@OriginalArg(0) Class466 arg0) {
		@Pc(4) Class463 local4 = Class463.method29541(0.0F, 0.0F, 1.0F);
		local4.method29500(arg0);
		@Pc(15) double local15 = Math.atan2((double) local4.aFloat297, (double) local4.aFloat296);
		local4.method29557();
		if (local15 < 0.0D) {
			local15 = local15 + 3.141592653589793D + 3.141592653589793D;
		}
		return (float) local15;
	}

	@OriginalMember(owner = "client!ze", name = "r", descriptor = "(Lclient!oq;)I")
	public static int method37122(@OriginalArg(0) Class466 arg0) {
		@Pc(4) Class463 local4 = Class463.method29541(0.0F, 0.0F, 1.0F);
		local4.method29500(arg0);
		@Pc(15) double local15 = Math.atan2((double) local4.aFloat297, (double) local4.aFloat296);
		local4.method29557();
		if (local15 < 0.0D) {
			local15 = 3.141592653589793D + 3.141592653589793D + local15;
		}
		return (int) (local15 / 6.283185307179586D * 16384.0D) & 0x3FFF;
	}

	@OriginalMember(owner = "client!ze", name = "q", descriptor = "(Lclient!oq;)I")
	public static int method37123(@OriginalArg(0) Class466 arg0) {
		@Pc(4) Class463 local4 = Class463.method29541(0.0F, 0.0F, 1.0F);
		local4.method29500(arg0);
		@Pc(15) double local15 = Math.atan2((double) local4.aFloat297, (double) local4.aFloat296);
		local4.method29557();
		if (local15 < 0.0D) {
			local15 = 3.141592653589793D + 3.141592653589793D + local15;
		}
		return (int) (local15 / 6.283185307179586D * 16384.0D) & 0x3FFF;
	}

	@OriginalMember(owner = "client!ze", name = "s", descriptor = "(Lclient!oq;)I")
	public static int method37124(@OriginalArg(0) Class466 arg0) {
		@Pc(4) Class463 local4 = Class463.method29541(0.0F, 0.0F, 1.0F);
		local4.method29500(arg0);
		@Pc(14) double local14 = 1.5707963267948966D - Math.acos((double) local4.aFloat295);
		local4.method29557();
		if (local14 < 0.0D) {
			local14 = local14 + 3.141592653589793D + 3.141592653589793D;
		}
		return (int) (local14 / 6.283185307179586D * 16384.0D) & 0x3FFF;
	}

	@OriginalMember(owner = "client!ze", name = "oh", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;I)V")
	static void method37125(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) int arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray46[(arg2.anInt5776 -= -825189621) * -2070619997];
		if (Class619.method32302(local13, arg2, -2008916949) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray20 = Class431.method29089(local13, arg2, 888512650);
		arg0.aBoolean815 = true;
	}

	@OriginalMember(owner = "client!ze", name = "<init>", descriptor = "()V")
	Class704() throws Throwable {
		throw new Error();
	}
}
