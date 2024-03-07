package com.jagex;

import java.util.Iterator;
import java.util.LinkedList;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!im")
public class Class342 {

	@OriginalMember(owner = "client!im", name = "e", descriptor = "Lclient!im;")
	public static final Class342 aClass342_4 = new Class342(0, false);

	@OriginalMember(owner = "client!im", name = "n", descriptor = "Lclient!im;")
	public static final Class342 aClass342_3 = new Class342(1, false);

	@OriginalMember(owner = "client!im", name = "m", descriptor = "Lclient!im;")
	static final Class342 aClass342_7 = new Class342(2, true);

	@OriginalMember(owner = "client!im", name = "k", descriptor = "Lclient!im;")
	static final Class342 aClass342_5 = new Class342(3, true);

	@OriginalMember(owner = "client!im", name = "f", descriptor = "Lclient!im;")
	static final Class342 aClass342_6 = new Class342(4, true);

	@OriginalMember(owner = "client!im", name = "w", descriptor = "I")
	public final int anInt4188;

	@OriginalMember(owner = "client!im", name = "l", descriptor = "Z")
	final boolean aBoolean723;

	@OriginalMember(owner = "client!im", name = "<init>", descriptor = "(IZ)V", line = 12)
	Class342(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.anInt4188 = arg0 * 908369267;
		this.aBoolean723 = arg1;
	}

	@OriginalMember(owner = "client!im", name = "m", descriptor = "(I)Lclient!im;", line = 18)
	public static Class342 method27503(@OriginalArg(0) int arg0) {
		if (aClass342_4.anInt4188 * -1676947525 == arg0) {
			return aClass342_4;
		} else if (aClass342_3.anInt4188 * -1676947525 == arg0) {
			return aClass342_3;
		} else if (aClass342_7.anInt4188 * -1676947525 == arg0) {
			return aClass342_7;
		} else if (arg0 == aClass342_5.anInt4188 * -1676947525) {
			return aClass342_5;
		} else if (aClass342_6.anInt4188 * -1676947525 == arg0) {
			return aClass342_6;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!im", name = "f", descriptor = "(I)Lclient!im;", line = 18)
	public static Class342 method27504(@OriginalArg(0) int arg0) {
		if (aClass342_4.anInt4188 * -1676947525 == arg0) {
			return aClass342_4;
		} else if (aClass342_3.anInt4188 * -1676947525 == arg0) {
			return aClass342_3;
		} else if (aClass342_7.anInt4188 * -1676947525 == arg0) {
			return aClass342_7;
		} else if (arg0 == aClass342_5.anInt4188 * -1676947525) {
			return aClass342_5;
		} else if (aClass342_6.anInt4188 * -1676947525 == arg0) {
			return aClass342_6;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!im", name = "k", descriptor = "(I)Lclient!im;", line = 18)
	public static Class342 method27505(@OriginalArg(0) int arg0) {
		if (aClass342_4.anInt4188 * -1676947525 == arg0) {
			return aClass342_4;
		} else if (aClass342_3.anInt4188 * -1676947525 == arg0) {
			return aClass342_3;
		} else if (aClass342_7.anInt4188 * -1676947525 == arg0) {
			return aClass342_7;
		} else if (arg0 == aClass342_5.anInt4188 * -1676947525) {
			return aClass342_5;
		} else if (aClass342_6.anInt4188 * -1676947525 == arg0) {
			return aClass342_6;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!im", name = "w", descriptor = "()Z", line = 27)
	public boolean method27506() {
		return this.aBoolean723;
	}

	@OriginalMember(owner = "client!im", name = "n", descriptor = "(I)Z", line = 27)
	public boolean method27507(@OriginalArg(0) int arg0) {
		return this.aBoolean723;
	}

	@OriginalMember(owner = "client!im", name = "u", descriptor = "(Ljava/lang/Float;Ljava/lang/Float;B)V", line = 307)
	static void method27508(@OriginalArg(0) Float arg0, @OriginalArg(1) Float arg1, @OriginalArg(2) byte arg2) {
		arg1 = 1.0F - arg1;
		if (arg0 < 0.0F) {
			arg0 = 0.0F;
		}
		if (arg1 < 0.0F) {
			arg1 = 0.0F;
		}
		if (arg0 > 1.0F || arg1 > 1.0F) {
			@Pc(56) float local56 = (float) ((double) (arg0 * (arg0 - 2.0F + arg1)) + (double) arg1 * ((double) arg1 - 2.0D) + 1.0D);
			if (Class221.aFloat261 + local56 > 0.0F) {
				Class248.method25930(arg0, arg1, 1472772350);
			}
		}
		@Pc(72) Float local72 = 1.0F - arg1;
	}

	@OriginalMember(owner = "client!im", name = "d", descriptor = "(Lclient!arn;IB)V", line = 436)
	static void method27509(@OriginalArg(0) Class93_Sub1_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (!Class454.aBoolean773) {
			return;
		}
		@Pc(5) Class5 local5 = Class142_Sub1.method10971((byte) 10);
		@Pc(7) int local7 = 0;
		@Pc(21) int local21;
		for (@Pc(13) Class93_Sub1_Sub7 local13 = (Class93_Sub1_Sub7) arg0.aClass18_10.method256(1550983515); local13 != null; local13 = (Class93_Sub1_Sub7) arg0.aClass18_10.method264(1024498697)) {
			local21 = Class338.method27468(local13, local5, 948224087);
			if (local21 > local7) {
				local7 = local21;
			}
		}
		local7 += 8;
		@Pc(45) int local45 = arg0.anInt3013 * -2109043087 * Class454.anInt5036 * -875883057 + 21;
		Class360.anInt4570 = (-875883057 * Class454.anInt5036 * arg0.anInt3013 * -2109043087 + (Class454.aBoolean774 ? 26 : 22)) * -1989460377;
		local21 = Class166_Sub17.anInt2179 * 1703853389 + Class221.anInt3629 * 1555894759;
		if (local21 + local7 > Class553.width * -1378711501) {
			local21 = Class166_Sub17.anInt2179 * 1703853389 - local7;
		}
		if (local21 < 0) {
			local21 = 0;
		}
		@Pc(100) int local100 = Class454.aBoolean774 ? 1 + 20 + local5.anInt6 * -8978697 : 31;
		@Pc(111) int local111 = arg1 + 1 - local100 + local5.anInt6 * -8978697;
		if (local45 + local111 > Class553.height * 2091353777) {
			local111 = Class553.height * 2091353777 - local45;
		}
		if (local111 < 0) {
			local111 = 0;
		}
		Class301.anInt3931 = local21 * 157625413;
		Class318.anInt4095 = local111 * -670937767;
		Class454.anInt5046 = local7 * -1735296459;
		Class454.aClass93_Sub1_Sub8_1 = arg0;
	}

	@OriginalMember(owner = "client!im", name = "ajf", descriptor = "(Lclient!yf;I)V", line = 11484)
	static final void method27510(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class149_Sub3.method12319((short) 255);
	}

	@OriginalMember(owner = "client!im", name = "ld", descriptor = "(Ljava/lang/String;ZS)I", line = 12326)
	public static int method27511(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) short arg2) {
		@Pc(2) String local2 = arg0.toLowerCase();
		Class657.anIntArray509 = null;
		Class36.anInt117 = 0;
		@Pc(10) LinkedList local10 = new LinkedList();
		@Pc(14) LinkedList local14 = new LinkedList();
		@Pc(16) int local16;
		for (local16 = 0; local16 < Class277.aClass32_Sub12_1.anInt2487 * -152478627; local16++) {
			@Pc(28) Class47 local28 = (Class47) Class277.aClass32_Sub12_1.method18261(local16, -121945858);
			if ((!arg1 || local28.aBoolean19) && local28.anInt163 * 1265448031 == -1 && local28.anInt173 * -1291515553 == -1 && -143668583 * local28.anInt185 == -1 && local28.anInt182 * 1212305741 == 0 && local28.aString6.toLowerCase().indexOf(local2) != -1) {
				if (local10.size() >= 250) {
					return -1;
				}
				local10.add(local16);
				local14.add(local28.aString6);
			}
		}
		Class657.anIntArray509 = new int[local10.size()];
		local16 = 0;
		@Pc(94) Iterator local94 = local10.iterator();
		while (local94.hasNext()) {
			@Pc(101) Integer local101 = (Integer) local94.next();
			Class657.anIntArray509[local16++] = local101;
		}
		@Pc(116) String[] local116 = (String[]) local14.toArray(new String[Class657.anIntArray509.length]);
		Class118.method8407(local116, Class657.anIntArray509, 5665102);
		return local10.size();
	}
}
