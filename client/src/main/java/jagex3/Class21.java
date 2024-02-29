package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aas")
public final class Class21 {

	@OriginalMember(owner = "client!aas", name = "ij", descriptor = "Lclient!adj;")
	public static Class79_Sub1_Sub1 aClass79_Sub1_Sub1_1;

	@OriginalMember(owner = "client!aas", name = "n", descriptor = "Lclient!tc;")
	Class149 aClass149_2;

	@OriginalMember(owner = "client!aas", name = "e", descriptor = "Lclient!tc;")
	Class149 aClass149_1 = new Class149();

	@OriginalMember(owner = "client!aas", name = "ahh", descriptor = "(Lclient!yf;S)V")
	static void method403(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		arg0.anInt6052 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		@Pc(28) Class93_Sub1_Sub15 local28 = BaseVarTypeComponentHook.method30438(local13, local23, 552647328);
		if (local28 != null) {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local28.anInt3090 * -565994431;
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = Class123_Sub1.method9095(local28.aLong190 * -9166377137725744335L, Class106.aClass717_8.anInt6124 * -1156137245, 304225723);
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local28.anInt3088 * 933094649;
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = local28.aString109 == null ? "" : local28.aString109;
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = local28.aString110 == null ? "" : local28.aString110;
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = local28.aString111 == null ? "" : local28.aString111;
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = local28.aString108 == null ? "" : local28.aString108;
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local28.anInt3089 * -92607533;
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = local28.aString112 == null ? "" : local28.aString112;
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local28.aClass443_1 == null ? -1 : local28.aClass443_1.getId();
			return;
		}
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = -1;
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = -1;
	}

	@OriginalMember(owner = "client!aas", name = "axc", descriptor = "(Lclient!yf;I)V")
	static void method404(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		Class334.method27496(5, local13, local23, "", (short) 25245);
	}

	@OriginalMember(owner = "client!aas", name = "<init>", descriptor = "()V")
	public Class21() {
		this.aClass149_1.aClass149_20 = this.aClass149_1;
		this.aClass149_1.aClass149_19 = this.aClass149_1;
	}

	@OriginalMember(owner = "client!aas", name = "l", descriptor = "(I)Lclient!tc;")
	public Class149 method377(@OriginalArg(0) int arg0) {
		@Pc(2) Class149 local2 = this.aClass149_2;
		if (local2 == this.aClass149_1) {
			this.aClass149_2 = null;
			return null;
		} else {
			this.aClass149_2 = local2.aClass149_20;
			return local2;
		}
	}

	@OriginalMember(owner = "client!aas", name = "e", descriptor = "(I)V")
	public void method378(@OriginalArg(0) int arg0) {
		while (true) {
			@Pc(3) Class149 local3 = this.aClass149_1.aClass149_20;
			if (local3 == this.aClass149_1) {
				this.aClass149_2 = null;
				return;
			}
			local3.method23778(-719770481);
		}
	}

	@OriginalMember(owner = "client!aas", name = "n", descriptor = "(Lclient!tc;B)V")
	public void method379(@OriginalArg(0) Class149 arg0, @OriginalArg(1) byte arg1) {
		if (arg0.aClass149_19 != null) {
			arg0.method23778(-719770481);
		}
		arg0.aClass149_19 = this.aClass149_1.aClass149_19;
		arg0.aClass149_20 = this.aClass149_1;
		arg0.aClass149_19.aClass149_20 = arg0;
		arg0.aClass149_20.aClass149_19 = arg0;
	}

	@OriginalMember(owner = "client!aas", name = "m", descriptor = "(Lclient!tc;I)V")
	public void method380(@OriginalArg(0) Class149 arg0, @OriginalArg(1) int arg1) {
		if (arg0.aClass149_19 != null) {
			arg0.method23778(-719770481);
		}
		arg0.aClass149_19 = this.aClass149_1;
		arg0.aClass149_20 = this.aClass149_1.aClass149_20;
		arg0.aClass149_19.aClass149_20 = arg0;
		arg0.aClass149_20.aClass149_19 = arg0;
	}

	@OriginalMember(owner = "client!aas", name = "f", descriptor = "(I)Lclient!tc;")
	public Class149 method381(@OriginalArg(0) int arg0) {
		@Pc(3) Class149 local3 = this.aClass149_1.aClass149_20;
		if (local3 == this.aClass149_1) {
			return null;
		} else {
			local3.method23778(-719770481);
			return local3;
		}
	}

	@OriginalMember(owner = "client!aas", name = "a", descriptor = "()Lclient!tc;")
	public Class149 method382() {
		@Pc(2) Class149 local2 = this.aClass149_2;
		if (local2 == this.aClass149_1) {
			this.aClass149_2 = null;
			return null;
		} else {
			this.aClass149_2 = local2.aClass149_20;
			return local2;
		}
	}

	@OriginalMember(owner = "client!aas", name = "g", descriptor = "()Lclient!tc;")
	public Class149 method383() {
		@Pc(2) Class149 local2 = this.aClass149_2;
		if (local2 == this.aClass149_1) {
			this.aClass149_2 = null;
			return null;
		} else {
			this.aClass149_2 = local2.aClass149_20;
			return local2;
		}
	}

	@OriginalMember(owner = "client!aas", name = "u", descriptor = "(B)Z")
	public boolean method384(@OriginalArg(0) byte arg0) {
		return this.aClass149_1.aClass149_20 == this.aClass149_1;
	}

	@OriginalMember(owner = "client!aas", name = "z", descriptor = "()V")
	public void method385() {
		while (true) {
			@Pc(3) Class149 local3 = this.aClass149_1.aClass149_20;
			if (local3 == this.aClass149_1) {
				this.aClass149_2 = null;
				return;
			}
			local3.method23778(-719770481);
		}
	}

	@OriginalMember(owner = "client!aas", name = "p", descriptor = "()V")
	public void method386() {
		while (true) {
			@Pc(3) Class149 local3 = this.aClass149_1.aClass149_20;
			if (local3 == this.aClass149_1) {
				this.aClass149_2 = null;
				return;
			}
			local3.method23778(-719770481);
		}
	}

	@OriginalMember(owner = "client!aas", name = "d", descriptor = "(Lclient!tc;)V")
	public void method387(@OriginalArg(0) Class149 arg0) {
		if (arg0.aClass149_19 != null) {
			arg0.method23778(-719770481);
		}
		arg0.aClass149_19 = this.aClass149_1.aClass149_19;
		arg0.aClass149_20 = this.aClass149_1;
		arg0.aClass149_19.aClass149_20 = arg0;
		arg0.aClass149_20.aClass149_19 = arg0;
	}

	@OriginalMember(owner = "client!aas", name = "c", descriptor = "(Lclient!tc;)V")
	public void method388(@OriginalArg(0) Class149 arg0) {
		if (arg0.aClass149_19 != null) {
			arg0.method23778(-719770481);
		}
		arg0.aClass149_19 = this.aClass149_1;
		arg0.aClass149_20 = this.aClass149_1.aClass149_20;
		arg0.aClass149_19.aClass149_20 = arg0;
		arg0.aClass149_20.aClass149_19 = arg0;
	}

	@OriginalMember(owner = "client!aas", name = "y", descriptor = "()Lclient!tc;")
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

	@OriginalMember(owner = "client!aas", name = "w", descriptor = "(S)Lclient!tc;")
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

	@OriginalMember(owner = "client!aas", name = "ae", descriptor = "()Z")
	public boolean method391() {
		return this.aClass149_1.aClass149_20 == this.aClass149_1;
	}

	@OriginalMember(owner = "client!aas", name = "s", descriptor = "()Lclient!tc;")
	public Class149 method392() {
		@Pc(3) Class149 local3 = this.aClass149_1.aClass149_20;
		if (local3 == this.aClass149_1) {
			return null;
		} else {
			local3.method23778(-719770481);
			return local3;
		}
	}

	@OriginalMember(owner = "client!aas", name = "o", descriptor = "()Lclient!tc;")
	public Class149 method393() {
		@Pc(3) Class149 local3 = this.aClass149_1.aClass149_20;
		if (local3 == this.aClass149_1) {
			return null;
		} else {
			local3.method23778(-719770481);
			return local3;
		}
	}

	@OriginalMember(owner = "client!aas", name = "q", descriptor = "()Lclient!tc;")
	public Class149 method394() {
		@Pc(3) Class149 local3 = this.aClass149_1.aClass149_20;
		if (this.aClass149_1 == local3) {
			this.aClass149_2 = null;
			return null;
		} else {
			this.aClass149_2 = local3.aClass149_20;
			return local3;
		}
	}

	@OriginalMember(owner = "client!aas", name = "x", descriptor = "()Lclient!tc;")
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

	@OriginalMember(owner = "client!aas", name = "h", descriptor = "()Lclient!tc;")
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

	@OriginalMember(owner = "client!aas", name = "b", descriptor = "()Lclient!tc;")
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

	@OriginalMember(owner = "client!aas", name = "r", descriptor = "(Lclient!tc;)V")
	public void method398(@OriginalArg(0) Class149 arg0) {
		if (arg0.aClass149_19 != null) {
			arg0.method23778(-719770481);
		}
		arg0.aClass149_19 = this.aClass149_1;
		arg0.aClass149_20 = this.aClass149_1.aClass149_20;
		arg0.aClass149_19.aClass149_20 = arg0;
		arg0.aClass149_20.aClass149_19 = arg0;
	}

	@OriginalMember(owner = "client!aas", name = "i", descriptor = "()Z")
	public boolean method399() {
		return this.aClass149_1.aClass149_20 == this.aClass149_1;
	}

	@OriginalMember(owner = "client!aas", name = "j", descriptor = "()Z")
	public boolean method400() {
		return this.aClass149_1.aClass149_20 == this.aClass149_1;
	}

	@OriginalMember(owner = "client!aas", name = "t", descriptor = "()Z")
	public boolean method401() {
		return this.aClass149_1.aClass149_20 == this.aClass149_1;
	}

	@OriginalMember(owner = "client!aas", name = "v", descriptor = "(Lclient!tc;)V")
	public void method402(@OriginalArg(0) Class149 arg0) {
		if (arg0.aClass149_19 != null) {
			arg0.method23778(-719770481);
		}
		arg0.aClass149_19 = this.aClass149_1;
		arg0.aClass149_20 = this.aClass149_1.aClass149_20;
		arg0.aClass149_19.aClass149_20 = arg0;
		arg0.aClass149_20.aClass149_19 = arg0;
	}
}
