package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!adx")
public final class Class93_Sub1_Sub1 extends Class93_Sub1 implements Interface13, Interface5 {

	@OriginalMember(owner = "client!adx", name = "y", descriptor = "Z")
	static boolean aBoolean42;

	@OriginalMember(owner = "client!adx", name = "k", descriptor = "Lclient!aan;")
	Class16 aClass16_3;

	@OriginalMember(owner = "client!adx", name = "<init>", descriptor = "()V")
	Class93_Sub1_Sub1() {
	}

	@OriginalMember(owner = "client!adx", name = "u", descriptor = "(Lclient!alw;IS)V")
	void method1752(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) short arg2) {
		if (arg1 != 249) {
			return;
		}
		@Pc(6) int local6 = arg0.method22425((short) 16384);
		@Pc(14) int local14;
		if (this.aClass16_3 == null) {
			local14 = Class134_Sub2.method10212(local6, (byte) 70);
			this.aClass16_3 = new Class16(local14);
		}
		for (local14 = 0; local14 < local6; local14++) {
			@Pc(34) boolean local34 = arg0.method22425((short) 16384) == 1;
			@Pc(38) int local38 = arg0.method22429((short) 1139);
			@Pc(47) Class93 local47;
			if (local34) {
				local47 = new Class93_Sub15(arg0.method22439(1930457749));
			} else {
				local47 = new Class93_Sub14(arg0.method22431(-118643075));
			}
			this.aClass16_3.method221(local47, (long) local38);
		}
	}

	@OriginalMember(owner = "client!adx", name = "w", descriptor = "(Lclient!alw;)V")
	@Override
	public void method36839(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method1752(arg0, local3, (short) -17927);
		}
	}

	@OriginalMember(owner = "client!adx", name = "p", descriptor = "(IIB)I")
	public int method1753(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (this.aClass16_3 == null) {
			return arg1;
		} else {
			@Pc(11) Class93_Sub14 local11 = (Class93_Sub14) this.aClass16_3.method215((long) arg0);
			return local11 == null ? arg1 : local11.anInt1526 * 1279598251;
		}
	}

	@OriginalMember(owner = "client!adx", name = "d", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;")
	public String method1754(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		if (this.aClass16_3 == null) {
			return arg1;
		} else {
			@Pc(12) Class93_Sub15 local12 = (Class93_Sub15) this.aClass16_3.method215((long) arg0);
			return local12 == null ? arg1 : (String) local12.anObject5;
		}
	}

	@OriginalMember(owner = "client!adx", name = "z", descriptor = "(IB)V")
	@Override
	public void method36694(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
	}

	@OriginalMember(owner = "client!adx", name = "m", descriptor = "(Lclient!alw;)V")
	@Override
	public void method36836(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method1752(arg0, local3, (short) -8926);
		}
	}

	@OriginalMember(owner = "client!adx", name = "a", descriptor = "(II)I")
	public int method1755(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass16_3 == null) {
			return arg1;
		} else {
			@Pc(11) Class93_Sub14 local11 = (Class93_Sub14) this.aClass16_3.method215((long) arg0);
			return local11 == null ? arg1 : local11.anInt1526 * 1279598251;
		}
	}

	@OriginalMember(owner = "client!adx", name = "k", descriptor = "(Lclient!alw;)V")
	@Override
	public void method36837(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method1752(arg0, local3, (short) 22749);
		}
	}

	@OriginalMember(owner = "client!adx", name = "n", descriptor = "(I)V")
	@Override
	public void method36834(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!adx", name = "f", descriptor = "(Lclient!alw;)V")
	@Override
	public void method36838(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method1752(arg0, local3, (short) -1984);
		}
	}

	@OriginalMember(owner = "client!adx", name = "l", descriptor = "()V")
	@Override
	public void method36840() {
	}

	@OriginalMember(owner = "client!adx", name = "r", descriptor = "(I)V")
	@Override
	public void method36693(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!adx", name = "e", descriptor = "(Lclient!alw;B)V")
	@Override
	public void method36835(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) byte arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method1752(arg0, local3, (short) 6396);
		}
	}

	@OriginalMember(owner = "client!adx", name = "c", descriptor = "(Lclient!alw;I)V")
	void method1756(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(6) int local6 = arg0.method22425((short) 16384);
		@Pc(14) int local14;
		if (this.aClass16_3 == null) {
			local14 = Class134_Sub2.method10212(local6, (byte) 85);
			this.aClass16_3 = new Class16(local14);
		}
		for (local14 = 0; local14 < local6; local14++) {
			@Pc(34) boolean local34 = arg0.method22425((short) 16384) == 1;
			@Pc(38) int local38 = arg0.method22429((short) 16098);
			@Pc(47) Class93 local47;
			if (local34) {
				local47 = new Class93_Sub15(arg0.method22439(1239019579));
			} else {
				local47 = new Class93_Sub14(arg0.method22431(-118643075));
			}
			this.aClass16_3.method221(local47, (long) local38);
		}
	}

	@OriginalMember(owner = "client!adx", name = "y", descriptor = "(Lclient!alw;I)V")
	void method1757(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(6) int local6 = arg0.method22425((short) 16384);
		@Pc(14) int local14;
		if (this.aClass16_3 == null) {
			local14 = Class134_Sub2.method10212(local6, (byte) 84);
			this.aClass16_3 = new Class16(local14);
		}
		for (local14 = 0; local14 < local6; local14++) {
			@Pc(34) boolean local34 = arg0.method22425((short) 16384) == 1;
			@Pc(38) int local38 = arg0.method22429((short) 23020);
			@Pc(47) Class93 local47;
			if (local34) {
				local47 = new Class93_Sub15(arg0.method22439(384517872));
			} else {
				local47 = new Class93_Sub14(arg0.method22431(-118643075));
			}
			this.aClass16_3.method221(local47, (long) local38);
		}
	}

	@OriginalMember(owner = "client!adx", name = "x", descriptor = "(Lclient!alw;I)V")
	void method1758(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(6) int local6 = arg0.method22425((short) 16384);
		@Pc(14) int local14;
		if (this.aClass16_3 == null) {
			local14 = Class134_Sub2.method10212(local6, (byte) 100);
			this.aClass16_3 = new Class16(local14);
		}
		for (local14 = 0; local14 < local6; local14++) {
			@Pc(34) boolean local34 = arg0.method22425((short) 16384) == 1;
			@Pc(38) int local38 = arg0.method22429((short) 21711);
			@Pc(47) Class93 local47;
			if (local34) {
				local47 = new Class93_Sub15(arg0.method22439(1153649975));
			} else {
				local47 = new Class93_Sub14(arg0.method22431(-118643075));
			}
			this.aClass16_3.method221(local47, (long) local38);
		}
	}

	@OriginalMember(owner = "client!adx", name = "h", descriptor = "(II)I")
	public int method1759(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass16_3 == null) {
			return arg1;
		} else {
			@Pc(11) Class93_Sub14 local11 = (Class93_Sub14) this.aClass16_3.method215((long) arg0);
			return local11 == null ? arg1 : local11.anInt1526 * 1279598251;
		}
	}

	@OriginalMember(owner = "client!adx", name = "v", descriptor = "(I)V")
	@Override
	public void method36692(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!adx", name = "g", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public String method1760(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (this.aClass16_3 == null) {
			return arg1;
		} else {
			@Pc(12) Class93_Sub15 local12 = (Class93_Sub15) this.aClass16_3.method215((long) arg0);
			return local12 == null ? arg1 : (String) local12.anObject5;
		}
	}

	@OriginalMember(owner = "client!adx", name = "i", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public String method1761(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (this.aClass16_3 == null) {
			return arg1;
		} else {
			@Pc(12) Class93_Sub15 local12 = (Class93_Sub15) this.aClass16_3.method215((long) arg0);
			return local12 == null ? arg1 : (String) local12.anObject5;
		}
	}

	@OriginalMember(owner = "client!adx", name = "j", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public String method1762(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (this.aClass16_3 == null) {
			return arg1;
		} else {
			@Pc(12) Class93_Sub15 local12 = (Class93_Sub15) this.aClass16_3.method215((long) arg0);
			return local12 == null ? arg1 : (String) local12.anObject5;
		}
	}
}
