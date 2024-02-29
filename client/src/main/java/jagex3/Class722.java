package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!zy")
public final class Class722 {

	@OriginalMember(owner = "client!zy", name = "u", descriptor = "Lclient!py;")
	static Class497 aClass497_144;

	@OriginalMember(owner = "client!zy", name = "y", descriptor = "(Lclient!ov;)I")
	public static int method37103(@OriginalArg(0) Class471 arg0) {
		@Pc(4) Class472 local4 = Class472.method29710(0.0F, 0.0F, 1.0F);
		local4.method29753(arg0);
		@Pc(15) double local15 = Math.atan2((double) local4.aFloat325, (double) local4.aFloat327);
		local4.method29713();
		if (local15 < 0.0D) {
			local15 = 3.141592653589793D + 3.141592653589793D + local15;
		}
		return (int) (local15 / 6.283185307179586D * 16384.0D) & 0x3FFF;
	}

	@OriginalMember(owner = "client!zy", name = "w", descriptor = "(Lclient!ov;)F")
	public static float method37104(@OriginalArg(0) Class471 arg0) {
		@Pc(4) Class472 local4 = Class472.method29710(0.0F, 0.0F, 1.0F);
		local4.method29753(arg0);
		@Pc(14) double local14 = 1.5707963267948966D - Math.acos((double) local4.aFloat326);
		local4.method29713();
		return (float) local14;
	}

	@OriginalMember(owner = "client!zy", name = "u", descriptor = "(Lclient!ov;)I")
	public static int method37105(@OriginalArg(0) Class471 arg0) {
		@Pc(4) Class472 local4 = Class472.method29710(0.0F, 0.0F, 1.0F);
		local4.method29753(arg0);
		@Pc(14) double local14 = 1.5707963267948966D - Math.acos((double) local4.aFloat326);
		local4.method29713();
		if (local14 < 0.0D) {
			local14 = local14 + 3.141592653589793D + 3.141592653589793D;
		}
		return (int) (local14 / 6.283185307179586D * 16384.0D) & 0x3FFF;
	}

	@OriginalMember(owner = "client!zy", name = "s", descriptor = "(Lclient!ov;)I")
	public static int method37106(@OriginalArg(0) Class471 arg0) {
		@Pc(4) Class472 local4 = Class472.method29710(0.0F, 0.0F, 1.0F);
		local4.method29753(arg0);
		@Pc(15) double local15 = Math.atan2((double) local4.aFloat325, (double) local4.aFloat327);
		local4.method29713();
		if (local15 < 0.0D) {
			local15 = 3.141592653589793D + 3.141592653589793D + local15;
		}
		return (int) (local15 / 6.283185307179586D * 16384.0D) & 0x3FFF;
	}

	@OriginalMember(owner = "client!zy", name = "l", descriptor = "(Lclient!ov;)F")
	public static float method37107(@OriginalArg(0) Class471 arg0) {
		@Pc(4) Class472 local4 = Class472.method29710(0.0F, 0.0F, 1.0F);
		local4.method29753(arg0);
		@Pc(14) double local14 = 1.5707963267948966D - Math.acos((double) local4.aFloat326);
		local4.method29713();
		return (float) local14;
	}

	@OriginalMember(owner = "client!zy", name = "d", descriptor = "(FF)F")
	public static float method37108(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		@Pc(5) double local5 = Math.atan2((double) arg0, (double) arg1);
		if (local5 < 0.0D) {
			local5 = local5 + 3.141592653589793D + 3.141592653589793D;
		}
		return (float) local5;
	}

	@OriginalMember(owner = "client!zy", name = "c", descriptor = "(FF)F")
	public static float method37109(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		@Pc(5) double local5 = Math.atan2((double) arg0, (double) arg1);
		if (local5 < 0.0D) {
			local5 = local5 + 3.141592653589793D + 3.141592653589793D;
		}
		return (float) local5;
	}

	@OriginalMember(owner = "client!zy", name = "r", descriptor = "(Lclient!ov;)F")
	public static float method37110(@OriginalArg(0) Class471 arg0) {
		@Pc(4) Class472 local4 = Class472.method29710(0.0F, 0.0F, 1.0F);
		local4.method29753(arg0);
		@Pc(15) double local15 = Math.atan2((double) local4.aFloat325, (double) local4.aFloat327);
		local4.method29713();
		if (local15 < 0.0D) {
			local15 = local15 + 3.141592653589793D + 3.141592653589793D;
		}
		return (float) local15;
	}

	@OriginalMember(owner = "client!zy", name = "p", descriptor = "(FF)F")
	public static float method37111(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		@Pc(5) double local5 = Math.atan2((double) arg0, (double) arg1);
		if (local5 < 0.0D) {
			local5 = local5 + 3.141592653589793D + 3.141592653589793D;
		}
		return (float) local5;
	}

	@OriginalMember(owner = "client!zy", name = "o", descriptor = "(Lclient!ov;)F")
	public static float method37112(@OriginalArg(0) Class471 arg0) {
		@Pc(4) Class472 local4 = Class472.method29710(0.0F, 0.0F, 1.0F);
		local4.method29753(arg0);
		@Pc(15) double local15 = Math.atan2((double) local4.aFloat325, (double) local4.aFloat327);
		local4.method29713();
		if (local15 < 0.0D) {
			local15 = local15 + 3.141592653589793D + 3.141592653589793D;
		}
		return (float) local15;
	}

	@OriginalMember(owner = "client!zy", name = "v", descriptor = "(Lclient!ov;)F")
	public static float method37113(@OriginalArg(0) Class471 arg0) {
		@Pc(4) Class472 local4 = Class472.method29710(0.0F, 0.0F, 1.0F);
		local4.method29753(arg0);
		@Pc(15) double local15 = Math.atan2((double) local4.aFloat325, (double) local4.aFloat327);
		local4.method29713();
		if (local15 < 0.0D) {
			local15 = local15 + 3.141592653589793D + 3.141592653589793D;
		}
		return (float) local15;
	}

	@OriginalMember(owner = "client!zy", name = "z", descriptor = "(Lclient!ov;)I")
	public static int method37114(@OriginalArg(0) Class471 arg0) {
		@Pc(4) Class472 local4 = Class472.method29710(0.0F, 0.0F, 1.0F);
		local4.method29753(arg0);
		@Pc(14) double local14 = 1.5707963267948966D - Math.acos((double) local4.aFloat326);
		local4.method29713();
		if (local14 < 0.0D) {
			local14 = local14 + 3.141592653589793D + 3.141592653589793D;
		}
		return (int) (local14 / 6.283185307179586D * 16384.0D) & 0x3FFF;
	}

	@OriginalMember(owner = "client!zy", name = "<init>", descriptor = "()V")
	Class722() throws Throwable {
		throw new Error();
	}
}
