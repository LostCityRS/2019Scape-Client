package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aas")
public class Class21 {

	@OriginalMember(owner = "client!aas", name = "ij", descriptor = "Lclient!adj;")
	public static Class79_Sub1_Sub1 varPlayerTypes;

	@OriginalMember(owner = "client!aas", name = "n", descriptor = "Lclient!tc;")
	Class149 aClass149_2;

	@OriginalMember(owner = "client!aas", name = "e", descriptor = "Lclient!tc;")
	Class149 aClass149_1 = new Class149();

	@OriginalMember(owner = "client!aas", name = "<init>", descriptor = "()V", line = 9)
	public Class21() {
		this.aClass149_1.aClass149_20 = this.aClass149_1;
		this.aClass149_1.aClass149_19 = this.aClass149_1;
	}

	@OriginalMember(owner = "client!aas", name = "e", descriptor = "(I)V", line = 16)
	public void method377(@OriginalArg(0) int arg0) {
		while (true) {
			@Pc(3) Class149 local3 = this.aClass149_1.aClass149_20;
			if (local3 == this.aClass149_1) {
				this.aClass149_2 = null;
				return;
			}
			local3.method23766(-719770481);
		}
	}

	@OriginalMember(owner = "client!aas", name = "z", descriptor = "()V", line = 16)
	public void method378() {
		while (true) {
			@Pc(3) Class149 local3 = this.aClass149_1.aClass149_20;
			if (local3 == this.aClass149_1) {
				this.aClass149_2 = null;
				return;
			}
			local3.method23766(-719770481);
		}
	}

	@OriginalMember(owner = "client!aas", name = "p", descriptor = "()V", line = 16)
	public void method379() {
		while (true) {
			@Pc(3) Class149 local3 = this.aClass149_1.aClass149_20;
			if (local3 == this.aClass149_1) {
				this.aClass149_2 = null;
				return;
			}
			local3.method23766(-719770481);
		}
	}

	@OriginalMember(owner = "client!aas", name = "n", descriptor = "(Lclient!tc;B)V", line = 24)
	public void method380(@OriginalArg(0) Class149 arg0, @OriginalArg(1) byte arg1) {
		if (arg0.aClass149_19 != null) {
			arg0.method23766(-719770481);
		}
		arg0.aClass149_19 = this.aClass149_1.aClass149_19;
		arg0.aClass149_20 = this.aClass149_1;
		arg0.aClass149_19.aClass149_20 = arg0;
		arg0.aClass149_20.aClass149_19 = arg0;
	}

	@OriginalMember(owner = "client!aas", name = "d", descriptor = "(Lclient!tc;)V", line = 24)
	public void method381(@OriginalArg(0) Class149 arg0) {
		if (arg0.aClass149_19 != null) {
			arg0.method23766(-719770481);
		}
		arg0.aClass149_19 = this.aClass149_1.aClass149_19;
		arg0.aClass149_20 = this.aClass149_1;
		arg0.aClass149_19.aClass149_20 = arg0;
		arg0.aClass149_20.aClass149_19 = arg0;
	}

	@OriginalMember(owner = "client!aas", name = "m", descriptor = "(Lclient!tc;I)V", line = 32)
	public void method382(@OriginalArg(0) Class149 arg0, @OriginalArg(1) int arg1) {
		if (arg0.aClass149_19 != null) {
			arg0.method23766(-719770481);
		}
		arg0.aClass149_19 = this.aClass149_1;
		arg0.aClass149_20 = this.aClass149_1.aClass149_20;
		arg0.aClass149_19.aClass149_20 = arg0;
		arg0.aClass149_20.aClass149_19 = arg0;
	}

	@OriginalMember(owner = "client!aas", name = "c", descriptor = "(Lclient!tc;)V", line = 32)
	public void method383(@OriginalArg(0) Class149 arg0) {
		if (arg0.aClass149_19 != null) {
			arg0.method23766(-719770481);
		}
		arg0.aClass149_19 = this.aClass149_1;
		arg0.aClass149_20 = this.aClass149_1.aClass149_20;
		arg0.aClass149_19.aClass149_20 = arg0;
		arg0.aClass149_20.aClass149_19 = arg0;
	}

	@OriginalMember(owner = "client!aas", name = "r", descriptor = "(Lclient!tc;)V", line = 32)
	public void method384(@OriginalArg(0) Class149 arg0) {
		if (arg0.aClass149_19 != null) {
			arg0.method23766(-719770481);
		}
		arg0.aClass149_19 = this.aClass149_1;
		arg0.aClass149_20 = this.aClass149_1.aClass149_20;
		arg0.aClass149_19.aClass149_20 = arg0;
		arg0.aClass149_20.aClass149_19 = arg0;
	}

	@OriginalMember(owner = "client!aas", name = "v", descriptor = "(Lclient!tc;)V", line = 32)
	public void method385(@OriginalArg(0) Class149 arg0) {
		if (arg0.aClass149_19 != null) {
			arg0.method23766(-719770481);
		}
		arg0.aClass149_19 = this.aClass149_1;
		arg0.aClass149_20 = this.aClass149_1.aClass149_20;
		arg0.aClass149_19.aClass149_20 = arg0;
		arg0.aClass149_20.aClass149_19 = arg0;
	}

	@OriginalMember(owner = "client!aas", name = "f", descriptor = "(I)Lclient!tc;", line = 48)
	public Class149 method386(@OriginalArg(0) int arg0) {
		@Pc(3) Class149 local3 = this.aClass149_1.aClass149_20;
		if (local3 == this.aClass149_1) {
			return null;
		} else {
			local3.method23766(-719770481);
			return local3;
		}
	}

	@OriginalMember(owner = "client!aas", name = "s", descriptor = "()Lclient!tc;", line = 48)
	public Class149 method387() {
		@Pc(3) Class149 local3 = this.aClass149_1.aClass149_20;
		if (local3 == this.aClass149_1) {
			return null;
		} else {
			local3.method23766(-719770481);
			return local3;
		}
	}

	@OriginalMember(owner = "client!aas", name = "o", descriptor = "()Lclient!tc;", line = 48)
	public Class149 method388() {
		@Pc(3) Class149 local3 = this.aClass149_1.aClass149_20;
		if (local3 == this.aClass149_1) {
			return null;
		} else {
			local3.method23766(-719770481);
			return local3;
		}
	}

	@OriginalMember(owner = "client!aas", name = "y", descriptor = "()Lclient!tc;", line = 55)
	public Class149 method389() {
		@Pc(3) Class149 local3 = this.aClass149_1.aClass149_20;
		if (this.aClass149_1 == local3) {
			this.aClass149_2 = null;
			return null;
		} else {
			this.aClass149_2 = local3.aClass149_20;
			return local3;
		}
	}

	@OriginalMember(owner = "client!aas", name = "w", descriptor = "(S)Lclient!tc;", line = 55)
	public Class149 method390(@OriginalArg(0) short arg0) {
		@Pc(3) Class149 local3 = this.aClass149_1.aClass149_20;
		if (this.aClass149_1 == local3) {
			this.aClass149_2 = null;
			return null;
		} else {
			this.aClass149_2 = local3.aClass149_20;
			return local3;
		}
	}

	@OriginalMember(owner = "client!aas", name = "q", descriptor = "()Lclient!tc;", line = 55)
	public Class149 method391() {
		@Pc(3) Class149 local3 = this.aClass149_1.aClass149_20;
		if (this.aClass149_1 == local3) {
			this.aClass149_2 = null;
			return null;
		} else {
			this.aClass149_2 = local3.aClass149_20;
			return local3;
		}
	}

	@OriginalMember(owner = "client!aas", name = "l", descriptor = "(I)Lclient!tc;", line = 65)
	public Class149 method392(@OriginalArg(0) int arg0) {
		@Pc(2) Class149 local2 = this.aClass149_2;
		if (local2 == this.aClass149_1) {
			this.aClass149_2 = null;
			return null;
		} else {
			this.aClass149_2 = local2.aClass149_20;
			return local2;
		}
	}

	@OriginalMember(owner = "client!aas", name = "a", descriptor = "()Lclient!tc;", line = 65)
	public Class149 method393() {
		@Pc(2) Class149 local2 = this.aClass149_2;
		if (local2 == this.aClass149_1) {
			this.aClass149_2 = null;
			return null;
		} else {
			this.aClass149_2 = local2.aClass149_20;
			return local2;
		}
	}

	@OriginalMember(owner = "client!aas", name = "g", descriptor = "()Lclient!tc;", line = 65)
	public Class149 method394() {
		@Pc(2) Class149 local2 = this.aClass149_2;
		if (local2 == this.aClass149_1) {
			this.aClass149_2 = null;
			return null;
		} else {
			this.aClass149_2 = local2.aClass149_20;
			return local2;
		}
	}

	@OriginalMember(owner = "client!aas", name = "x", descriptor = "()Lclient!tc;", line = 65)
	public Class149 method395() {
		@Pc(2) Class149 local2 = this.aClass149_2;
		if (local2 == this.aClass149_1) {
			this.aClass149_2 = null;
			return null;
		} else {
			this.aClass149_2 = local2.aClass149_20;
			return local2;
		}
	}

	@OriginalMember(owner = "client!aas", name = "h", descriptor = "()Lclient!tc;", line = 65)
	public Class149 method396() {
		@Pc(2) Class149 local2 = this.aClass149_2;
		if (local2 == this.aClass149_1) {
			this.aClass149_2 = null;
			return null;
		} else {
			this.aClass149_2 = local2.aClass149_20;
			return local2;
		}
	}

	@OriginalMember(owner = "client!aas", name = "b", descriptor = "()Lclient!tc;", line = 65)
	public Class149 method397() {
		@Pc(2) Class149 local2 = this.aClass149_2;
		if (local2 == this.aClass149_1) {
			this.aClass149_2 = null;
			return null;
		} else {
			this.aClass149_2 = local2.aClass149_20;
			return local2;
		}
	}

	@OriginalMember(owner = "client!aas", name = "u", descriptor = "(B)Z", line = 75)
	public boolean method398(@OriginalArg(0) byte arg0) {
		return this.aClass149_1.aClass149_20 == this.aClass149_1;
	}

	@OriginalMember(owner = "client!aas", name = "ae", descriptor = "()Z", line = 75)
	public boolean method399() {
		return this.aClass149_1.aClass149_20 == this.aClass149_1;
	}

	@OriginalMember(owner = "client!aas", name = "i", descriptor = "()Z", line = 75)
	public boolean method400() {
		return this.aClass149_1.aClass149_20 == this.aClass149_1;
	}

	@OriginalMember(owner = "client!aas", name = "j", descriptor = "()Z", line = 75)
	public boolean method401() {
		return this.aClass149_1.aClass149_20 == this.aClass149_1;
	}

	@OriginalMember(owner = "client!aas", name = "t", descriptor = "()Z", line = 75)
	public boolean method402() {
		return this.aClass149_1.aClass149_20 == this.aClass149_1;
	}

	@OriginalMember(owner = "client!aas", name = "ahh", descriptor = "(Lclient!yf;S)V", line = 10941)
	static final void method403(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		@Pc(28) Class93_Sub1_Sub15 local28 = Class512.method30256(local13, local23, 552647328);
		if (local28 != null) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local28.anInt3090 * -565994431;
			arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = Class123_Sub1.method9093(local28.aLong190 * -9166377137725744335L, Class106.lang.anInt5963 * -1156137245, 304225723);
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local28.anInt3088 * 933094649;
			arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = local28.aString109 == null ? "" : local28.aString109;
			arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = local28.aString110 == null ? "" : local28.aString110;
			arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = local28.aString111 == null ? "" : local28.aString111;
			arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = local28.aString108 == null ? "" : local28.aString108;
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local28.anInt3089 * -92607533;
			arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = local28.aString112 == null ? "" : local28.aString112;
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local28.aClass443_1 == null ? -1 : local28.aClass443_1.getId();
			return;
		}
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = -1;
		arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = "";
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
		arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = "";
		arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = "";
		arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = "";
		arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = "";
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
		arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = "";
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = -1;
	}

	@OriginalMember(owner = "client!aas", name = "axc", descriptor = "(Lclient!yf;I)V", line = 13823)
	static final void method404(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		Class334.method27403(5, local13, local23, "", (short) 25245);
	}
}
