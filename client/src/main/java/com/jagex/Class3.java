package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

@OriginalClass("client!aaa")
public final class Class3 implements Iterable {

	@OriginalMember(owner = "client!aaa", name = "f", descriptor = "Lclient!akw;")
	Class80_Sub1 aClass80_Sub1_1;

	@OriginalMember(owner = "client!aaa", name = "t", descriptor = "Lclient!akw;")
	public Class80_Sub1 aClass80_Sub1_2 = new Class80_Sub1();

	@OriginalMember(owner = "client!aaa", name = "h", descriptor = "(Lclient!akw;Lclient!akw;)V")
	public static void method40(@OriginalArg(0) Class80_Sub1 arg0, @OriginalArg(1) Class80_Sub1 arg1) {
		if (arg0.aClass80_Sub1_67 != null) {
			arg0.method24406(-2147483644);
		}
		arg0.aClass80_Sub1_67 = arg1.aClass80_Sub1_67;
		arg0.aClass80_Sub1_68 = arg1;
		arg0.aClass80_Sub1_67.aClass80_Sub1_68 = arg0;
		arg0.aClass80_Sub1_68.aClass80_Sub1_67 = arg0;
	}

	@OriginalMember(owner = "client!aaa", name = "d", descriptor = "(Lclient!akw;Lclient!akw;)V")
	public static void method57(@OriginalArg(0) Class80_Sub1 arg0, @OriginalArg(1) Class80_Sub1 arg1) {
		if (arg0.aClass80_Sub1_67 != null) {
			arg0.method24406(-2147483640);
		}
		arg0.aClass80_Sub1_67 = arg1.aClass80_Sub1_67;
		arg0.aClass80_Sub1_68 = arg1;
		arg0.aClass80_Sub1_67.aClass80_Sub1_68 = arg0;
		arg0.aClass80_Sub1_68.aClass80_Sub1_67 = arg0;
	}

	@OriginalMember(owner = "client!aaa", name = "p", descriptor = "(Lclient!akw;Lclient!akw;)V")
	public static void method59(@OriginalArg(0) Class80_Sub1 arg0, @OriginalArg(1) Class80_Sub1 arg1) {
		if (arg0.aClass80_Sub1_67 != null) {
			arg0.method24406(-2147483647);
		}
		arg0.aClass80_Sub1_67 = arg1.aClass80_Sub1_67;
		arg0.aClass80_Sub1_68 = arg1;
		arg0.aClass80_Sub1_67.aClass80_Sub1_68 = arg0;
		arg0.aClass80_Sub1_68.aClass80_Sub1_67 = arg0;
	}

	@OriginalMember(owner = "client!aaa", name = "v", descriptor = "(Lclient!akw;Lclient!akw;)V")
	public static void method60(@OriginalArg(0) Class80_Sub1 arg0, @OriginalArg(1) Class80_Sub1 arg1) {
		if (arg0.aClass80_Sub1_67 != null) {
			arg0.method24406(-2147483642);
		}
		arg0.aClass80_Sub1_67 = arg1;
		arg0.aClass80_Sub1_68 = arg1.aClass80_Sub1_68;
		arg0.aClass80_Sub1_67.aClass80_Sub1_68 = arg0;
		arg0.aClass80_Sub1_68.aClass80_Sub1_67 = arg0;
	}

	@OriginalMember(owner = "client!aaa", name = "z", descriptor = "(Lclient!akw;Lclient!akw;)V")
	public static void method63(@OriginalArg(0) Class80_Sub1 arg0, @OriginalArg(1) Class80_Sub1 arg1) {
		if (arg0.aClass80_Sub1_67 != null) {
			arg0.method24406(-2147483643);
		}
		arg0.aClass80_Sub1_67 = arg1.aClass80_Sub1_67;
		arg0.aClass80_Sub1_68 = arg1;
		arg0.aClass80_Sub1_67.aClass80_Sub1_68 = arg0;
		arg0.aClass80_Sub1_68.aClass80_Sub1_67 = arg0;
	}

	@OriginalMember(owner = "client!aaa", name = "ahv", descriptor = "(Lclient!yp;I)V")
	static void method68(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = ((Class261) Class125.aClass41_Sub1_6.method18054(local12, 1393849156)).anInt3899 * 536414001;
	}

	@OriginalMember(owner = "client!aaa", name = "bco", descriptor = "(Lclient!yp;I)V")
	static void method69(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
	}

	@OriginalMember(owner = "client!aaa", name = "i", descriptor = "(Ljava/lang/String;Ljava/lang/String;ZI)Lclient!abp;")
	public static Class40 method70(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		@Pc(14) File local14 = new File(Class554.aFile3, "preferences" + arg0 + ".dat");
		if (local14.exists()) {
			try {
				return new Class40(local14, "rw", 10000L);
			} catch (@Pc(27) IOException local27) {
			}
		}
		@Pc(29) String local29 = "";
		if (Class93.anInt329 * 1095457647 == 33) {
			local29 = "_rc";
		} else if (Class93.anInt329 * 1095457647 == 34) {
			local29 = "_wip";
		}
		@Pc(65) File local65 = new File(Class588.aString227, "jagex_" + arg1 + "_preferences" + arg0 + local29 + ".dat");
		if (!arg2 && local65.exists()) {
			try {
				return new Class40(local65, "rw", 10000L);
			} catch (@Pc(80) IOException local80) {
			}
		}
		try {
			return new Class40(local14, "rw", 10000L);
		} catch (@Pc(90) IOException local90) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "()V")
	public Class3() {
		this.aClass80_Sub1_2.aClass80_Sub1_68 = this.aClass80_Sub1_2;
		this.aClass80_Sub1_2.aClass80_Sub1_67 = this.aClass80_Sub1_2;
	}

	@OriginalMember(owner = "client!aaa", name = "t", descriptor = "(I)V")
	public void method41(@OriginalArg(0) int arg0) {
		while (this.aClass80_Sub1_2 != this.aClass80_Sub1_2.aClass80_Sub1_68) {
			this.aClass80_Sub1_2.aClass80_Sub1_68.method24406(-2147483645);
		}
	}

	@OriginalMember(owner = "client!aaa", name = "f", descriptor = "(Lclient!akw;I)V")
	public void method42(@OriginalArg(0) Class80_Sub1 arg0, @OriginalArg(1) int arg1) {
		if (arg0.aClass80_Sub1_67 != null) {
			arg0.method24406(-2147483643);
		}
		arg0.aClass80_Sub1_67 = this.aClass80_Sub1_2.aClass80_Sub1_67;
		arg0.aClass80_Sub1_68 = this.aClass80_Sub1_2;
		arg0.aClass80_Sub1_67.aClass80_Sub1_68 = arg0;
		arg0.aClass80_Sub1_68.aClass80_Sub1_67 = arg0;
	}

	@OriginalMember(owner = "client!aaa", name = "b", descriptor = "(Lclient!akw;)Lclient!akw;")
	Class80_Sub1 method43(@OriginalArg(0) Class80_Sub1 arg0) {
		@Pc(6) Class80_Sub1 local6;
		if (arg0 == null) {
			local6 = this.aClass80_Sub1_2.aClass80_Sub1_68;
		} else {
			local6 = arg0;
		}
		if (this.aClass80_Sub1_2 == local6) {
			this.aClass80_Sub1_1 = null;
			return null;
		} else {
			this.aClass80_Sub1_1 = local6.aClass80_Sub1_68;
			return local6;
		}
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "()Ljava/util/Iterator;")
	public Iterator method44() {
		return new Class12(this);
	}

	@OriginalMember(owner = "client!aaa", name = "i", descriptor = "(Lclient!akw;B)Lclient!akw;")
	Class80_Sub1 method45(@OriginalArg(0) Class80_Sub1 arg0, @OriginalArg(1) byte arg1) {
		@Pc(6) Class80_Sub1 local6;
		if (arg0 == null) {
			local6 = this.aClass80_Sub1_2.aClass80_Sub1_68;
		} else {
			local6 = arg0;
		}
		if (this.aClass80_Sub1_2 == local6) {
			this.aClass80_Sub1_1 = null;
			return null;
		} else {
			this.aClass80_Sub1_1 = local6.aClass80_Sub1_68;
			return local6;
		}
	}

	@OriginalMember(owner = "client!aaa", name = "m", descriptor = "(B)Lclient!akw;")
	public Class80_Sub1 method46(@OriginalArg(0) byte arg0) {
		@Pc(2) Class80_Sub1 local2 = this.aClass80_Sub1_1;
		if (this.aClass80_Sub1_2 == local2) {
			this.aClass80_Sub1_1 = null;
			return null;
		} else {
			this.aClass80_Sub1_1 = local2.aClass80_Sub1_68;
			return local2;
		}
	}

	@OriginalMember(owner = "client!aaa", name = "s", descriptor = "(I)I")
	public int method47(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class80_Sub1 local5 = this.aClass80_Sub1_2.aClass80_Sub1_68; local5 != this.aClass80_Sub1_2; local5 = local5.aClass80_Sub1_68) {
			local1++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!aaa", name = "iterator", descriptor = "()Ljava/util/Iterator;")
	@Override
	public Iterator iterator() {
		return new Class12(this);
	}

	@OriginalMember(owner = "client!aaa", name = "o", descriptor = "()Ljava/util/Iterator;")
	public Iterator method48() {
		return new Class12(this);
	}

	@OriginalMember(owner = "client!aaa", name = "j", descriptor = "()Ljava/util/Iterator;")
	public Iterator method49() {
		return new Class12(this);
	}

	@OriginalMember(owner = "client!aaa", name = "g", descriptor = "(B)Lclient!akw;")
	public Class80_Sub1 method50(@OriginalArg(0) byte arg0) {
		return this.method45(null, (byte) 0);
	}

	@OriginalMember(owner = "client!aaa", name = "q", descriptor = "(Lclient!akw;)V")
	public void method51(@OriginalArg(0) Class80_Sub1 arg0) {
		if (arg0.aClass80_Sub1_67 != null) {
			arg0.method24406(-2147483645);
		}
		arg0.aClass80_Sub1_67 = this.aClass80_Sub1_2.aClass80_Sub1_67;
		arg0.aClass80_Sub1_68 = this.aClass80_Sub1_2;
		arg0.aClass80_Sub1_67.aClass80_Sub1_68 = arg0;
		arg0.aClass80_Sub1_68.aClass80_Sub1_67 = arg0;
	}

	@OriginalMember(owner = "client!aaa", name = "x", descriptor = "()V")
	public void method52() {
		while (this.aClass80_Sub1_2 != this.aClass80_Sub1_2.aClass80_Sub1_68) {
			this.aClass80_Sub1_2.aClass80_Sub1_68.method24406(-2147483640);
		}
	}

	@OriginalMember(owner = "client!aaa", name = "w", descriptor = "(Lclient!akw;)V")
	public void method53(@OriginalArg(0) Class80_Sub1 arg0) {
		if (arg0.aClass80_Sub1_67 != null) {
			arg0.method24406(-2147483645);
		}
		arg0.aClass80_Sub1_67 = this.aClass80_Sub1_2.aClass80_Sub1_67;
		arg0.aClass80_Sub1_68 = this.aClass80_Sub1_2;
		arg0.aClass80_Sub1_67.aClass80_Sub1_68 = arg0;
		arg0.aClass80_Sub1_68.aClass80_Sub1_67 = arg0;
	}

	@OriginalMember(owner = "client!aaa", name = "r", descriptor = "(Lclient!akw;)V")
	public void method54(@OriginalArg(0) Class80_Sub1 arg0) {
		if (arg0.aClass80_Sub1_67 != null) {
			arg0.method24406(-2147483643);
		}
		arg0.aClass80_Sub1_67 = this.aClass80_Sub1_2.aClass80_Sub1_67;
		arg0.aClass80_Sub1_68 = this.aClass80_Sub1_2;
		arg0.aClass80_Sub1_67.aClass80_Sub1_68 = arg0;
		arg0.aClass80_Sub1_68.aClass80_Sub1_67 = arg0;
	}

	@OriginalMember(owner = "client!aaa", name = "aq", descriptor = "()I")
	public int method55() {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class80_Sub1 local5 = this.aClass80_Sub1_2.aClass80_Sub1_68; local5 != this.aClass80_Sub1_2; local5 = local5.aClass80_Sub1_68) {
			local1++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!aaa", name = "k", descriptor = "()V")
	public void method56() {
		while (this.aClass80_Sub1_2 != this.aClass80_Sub1_2.aClass80_Sub1_68) {
			this.aClass80_Sub1_2.aClass80_Sub1_68.method24406(-2147483642);
		}
	}

	@OriginalMember(owner = "client!aaa", name = "y", descriptor = "()Lclient!akw;")
	public Class80_Sub1 method58() {
		@Pc(3) Class80_Sub1 local3 = this.aClass80_Sub1_2.aClass80_Sub1_68;
		if (this.aClass80_Sub1_2 == local3) {
			return null;
		} else {
			local3.method24406(-2147483643);
			return local3;
		}
	}

	@OriginalMember(owner = "client!aaa", name = "n", descriptor = "()Lclient!akw;")
	public Class80_Sub1 method61() {
		@Pc(3) Class80_Sub1 local3 = this.aClass80_Sub1_2.aClass80_Sub1_68;
		if (this.aClass80_Sub1_2 == local3) {
			return null;
		} else {
			local3.method24406(-2147483642);
			return local3;
		}
	}

	@OriginalMember(owner = "client!aaa", name = "c", descriptor = "()Lclient!akw;")
	public Class80_Sub1 method62() {
		@Pc(3) Class80_Sub1 local3 = this.aClass80_Sub1_2.aClass80_Sub1_68;
		if (this.aClass80_Sub1_2 == local3) {
			return null;
		} else {
			local3.method24406(Integer.MIN_VALUE);
			return local3;
		}
	}

	@OriginalMember(owner = "client!aaa", name = "ax", descriptor = "()Lclient!akw;")
	public Class80_Sub1 method64() {
		@Pc(2) Class80_Sub1 local2 = this.aClass80_Sub1_1;
		if (this.aClass80_Sub1_2 == local2) {
			this.aClass80_Sub1_1 = null;
			return null;
		} else {
			this.aClass80_Sub1_1 = local2.aClass80_Sub1_68;
			return local2;
		}
	}

	@OriginalMember(owner = "client!aaa", name = "ay", descriptor = "()Lclient!akw;")
	public Class80_Sub1 method65() {
		@Pc(2) Class80_Sub1 local2 = this.aClass80_Sub1_1;
		if (this.aClass80_Sub1_2 == local2) {
			this.aClass80_Sub1_1 = null;
			return null;
		} else {
			this.aClass80_Sub1_1 = local2.aClass80_Sub1_68;
			return local2;
		}
	}

	@OriginalMember(owner = "client!aaa", name = "ai", descriptor = "()I")
	public int method66() {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class80_Sub1 local5 = this.aClass80_Sub1_2.aClass80_Sub1_68; local5 != this.aClass80_Sub1_2; local5 = local5.aClass80_Sub1_68) {
			local1++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!aaa", name = "l", descriptor = "(I)Lclient!akw;")
	public Class80_Sub1 method67(@OriginalArg(0) int arg0) {
		@Pc(3) Class80_Sub1 local3 = this.aClass80_Sub1_2.aClass80_Sub1_68;
		if (this.aClass80_Sub1_2 == local3) {
			return null;
		} else {
			local3.method24406(-2147483643);
			return local3;
		}
	}
}
