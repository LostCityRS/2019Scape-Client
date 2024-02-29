package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!zy")
public class Class722 {

	@OriginalMember(owner = "client!zy", name = "u", descriptor = "Lclient!py;")
	static Class497 aClass497_144;

	@OriginalMember(owner = "client!zy", name = "<init>", descriptor = "()V", line = 8)
	Class722() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!zy", name = "w", descriptor = "(Lclient!ov;)F", line = 13)
	public static float method36922(@OriginalArg(0) Class471 arg0) {
		@Pc(4) Class472 local4 = Class472.method29535(0.0F, 0.0F, 1.0F);
		local4.method29623(arg0);
		@Pc(14) double local14 = 1.5707963267948966D - Math.acos((double) local4.aFloat318);
		local4.method29544();
		return (float) local14;
	}

	@OriginalMember(owner = "client!zy", name = "l", descriptor = "(Lclient!ov;)F", line = 13)
	public static float method36923(@OriginalArg(0) Class471 arg0) {
		@Pc(4) Class472 local4 = Class472.method29535(0.0F, 0.0F, 1.0F);
		local4.method29623(arg0);
		@Pc(14) double local14 = 1.5707963267948966D - Math.acos((double) local4.aFloat318);
		local4.method29544();
		return (float) local14;
	}

	@OriginalMember(owner = "client!zy", name = "u", descriptor = "(Lclient!ov;)I", line = 21)
	public static int method36924(@OriginalArg(0) Class471 arg0) {
		@Pc(4) Class472 local4 = Class472.method29535(0.0F, 0.0F, 1.0F);
		local4.method29623(arg0);
		@Pc(14) double local14 = 1.5707963267948966D - Math.acos((double) local4.aFloat318);
		local4.method29544();
		if (local14 < 0.0D) {
			local14 = local14 + 3.141592653589793D + 3.141592653589793D;
		}
		return (int) (local14 / 6.283185307179586D * 16384.0D) & 0x3FFF;
	}

	@OriginalMember(owner = "client!zy", name = "z", descriptor = "(Lclient!ov;)I", line = 21)
	public static int method36925(@OriginalArg(0) Class471 arg0) {
		@Pc(4) Class472 local4 = Class472.method29535(0.0F, 0.0F, 1.0F);
		local4.method29623(arg0);
		@Pc(14) double local14 = 1.5707963267948966D - Math.acos((double) local4.aFloat318);
		local4.method29544();
		if (local14 < 0.0D) {
			local14 = local14 + 3.141592653589793D + 3.141592653589793D;
		}
		return (int) (local14 / 6.283185307179586D * 16384.0D) & 0x3FFF;
	}

	@OriginalMember(owner = "client!zy", name = "d", descriptor = "(FF)F", line = 30)
	public static float method36926(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		@Pc(5) double local5 = Math.atan2((double) arg0, (double) arg1);
		if (local5 < 0.0D) {
			local5 = local5 + 3.141592653589793D + 3.141592653589793D;
		}
		return (float) local5;
	}

	@OriginalMember(owner = "client!zy", name = "c", descriptor = "(FF)F", line = 30)
	public static float method36927(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		@Pc(5) double local5 = Math.atan2((double) arg0, (double) arg1);
		if (local5 < 0.0D) {
			local5 = local5 + 3.141592653589793D + 3.141592653589793D;
		}
		return (float) local5;
	}

	@OriginalMember(owner = "client!zy", name = "p", descriptor = "(FF)F", line = 30)
	public static float method36928(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		@Pc(5) double local5 = Math.atan2((double) arg0, (double) arg1);
		if (local5 < 0.0D) {
			local5 = local5 + 3.141592653589793D + 3.141592653589793D;
		}
		return (float) local5;
	}

	@OriginalMember(owner = "client!zy", name = "r", descriptor = "(Lclient!ov;)F", line = 36)
	public static float method36929(@OriginalArg(0) Class471 arg0) {
		@Pc(4) Class472 local4 = Class472.method29535(0.0F, 0.0F, 1.0F);
		local4.method29623(arg0);
		@Pc(15) double local15 = Math.atan2((double) local4.aFloat317, (double) local4.aFloat319);
		local4.method29544();
		if (local15 < 0.0D) {
			local15 = local15 + 3.141592653589793D + 3.141592653589793D;
		}
		return (float) local15;
	}

	@OriginalMember(owner = "client!zy", name = "o", descriptor = "(Lclient!ov;)F", line = 36)
	public static float method36930(@OriginalArg(0) Class471 arg0) {
		@Pc(4) Class472 local4 = Class472.method29535(0.0F, 0.0F, 1.0F);
		local4.method29623(arg0);
		@Pc(15) double local15 = Math.atan2((double) local4.aFloat317, (double) local4.aFloat319);
		local4.method29544();
		if (local15 < 0.0D) {
			local15 = local15 + 3.141592653589793D + 3.141592653589793D;
		}
		return (float) local15;
	}

	@OriginalMember(owner = "client!zy", name = "v", descriptor = "(Lclient!ov;)F", line = 36)
	public static float method36931(@OriginalArg(0) Class471 arg0) {
		@Pc(4) Class472 local4 = Class472.method29535(0.0F, 0.0F, 1.0F);
		local4.method29623(arg0);
		@Pc(15) double local15 = Math.atan2((double) local4.aFloat317, (double) local4.aFloat319);
		local4.method29544();
		if (local15 < 0.0D) {
			local15 = local15 + 3.141592653589793D + 3.141592653589793D;
		}
		return (float) local15;
	}

	@OriginalMember(owner = "client!zy", name = "y", descriptor = "(Lclient!ov;)I", line = 45)
	public static int method36932(@OriginalArg(0) Class471 arg0) {
		@Pc(4) Class472 local4 = Class472.method29535(0.0F, 0.0F, 1.0F);
		local4.method29623(arg0);
		@Pc(15) double local15 = Math.atan2((double) local4.aFloat317, (double) local4.aFloat319);
		local4.method29544();
		if (local15 < 0.0D) {
			local15 = 3.141592653589793D + 3.141592653589793D + local15;
		}
		return (int) (local15 / 6.283185307179586D * 16384.0D) & 0x3FFF;
	}

	@OriginalMember(owner = "client!zy", name = "s", descriptor = "(Lclient!ov;)I", line = 45)
	public static int method36933(@OriginalArg(0) Class471 arg0) {
		@Pc(4) Class472 local4 = Class472.method29535(0.0F, 0.0F, 1.0F);
		local4.method29623(arg0);
		@Pc(15) double local15 = Math.atan2((double) local4.aFloat317, (double) local4.aFloat319);
		local4.method29544();
		if (local15 < 0.0D) {
			local15 = 3.141592653589793D + 3.141592653589793D + local15;
		}
		return (int) (local15 / 6.283185307179586D * 16384.0D) & 0x3FFF;
	}
}
