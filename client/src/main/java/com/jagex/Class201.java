package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ca")
public class Class201 {

	@OriginalMember(owner = "client!ca", name = "m", descriptor = "Lclient!eb;")
	final Class240 aClass240_65 = new Class240(10485760, 256);

	@OriginalMember(owner = "client!ca", name = "e", descriptor = "Lclient!afa;")
	final Class104_Sub1 aClass104_Sub1_44;

	@OriginalMember(owner = "client!ca", name = "n", descriptor = "Lclient!es;")
	final Interface24 anInterface24_7;

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Lclient!afa;Lclient!es;)V", line = 15)
	Class201(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) Interface24 arg1) {
		this.aClass104_Sub1_44 = arg0;
		this.anInterface24_7 = arg1;
	}

	@OriginalMember(owner = "client!ca", name = "u", descriptor = "(Lclient!dv;)Lclient!adt;", line = 21)
	Class88_Sub2 method24630(@OriginalArg(0) Class235 arg0) {
		return this.method24634(arg0, arg0.anInt3806 * -923926085);
	}

	@OriginalMember(owner = "client!ca", name = "w", descriptor = "(Lclient!dv;)Lclient!adt;", line = 21)
	Class88_Sub2 method24631(@OriginalArg(0) Class235 arg0) {
		return this.method24634(arg0, arg0.anInt3806 * -923926085);
	}

	@OriginalMember(owner = "client!ca", name = "l", descriptor = "(Lclient!dv;)Lclient!adt;", line = 21)
	Class88_Sub2 method24632(@OriginalArg(0) Class235 arg0) {
		return this.method24634(arg0, arg0.anInt3806 * -923926085);
	}

	@OriginalMember(owner = "client!ca", name = "e", descriptor = "(Lclient!dv;)Lclient!adt;", line = 21)
	Class88_Sub2 method24633(@OriginalArg(0) Class235 arg0) {
		return this.method24634(arg0, arg0.anInt3806 * -923926085);
	}

	@OriginalMember(owner = "client!ca", name = "n", descriptor = "(Lclient!dv;I)Lclient!adt;", line = 25)
	Class88_Sub2 method24634(@OriginalArg(0) Class235 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class88_Sub2 local9 = (Class88_Sub2) this.aClass240_65.method25829((long) (arg0.anInt3787 * 595186169));
		if (local9 != null) {
			return local9;
		} else if (this.method24637(Class616.aClass616_2, arg0, arg1)) {
			if (arg1 == -1) {
				arg1 = arg0.anInt3806 * -923926085;
			}
			@Pc(93) Class88_Sub2 local93;
			if (arg0.aBoolean655 && this.aClass104_Sub1_44.method20622()) {
				@Pc(112) float[] local112 = this.anInterface24_7.method6766(Class616.aClass616_2, arg0.anInt3788 * -1747960127, arg0.anInt3769 * -764718997, 0.7F, arg1, arg1, false, (byte) 1);
				local93 = new Class88_Sub2(this.aClass104_Sub1_44, 3553, Class206.aClass206_22, Class226.aClass226_24, arg1, arg1, arg0.aByte119 != 0, local112, Class206.aClass206_22);
			} else {
				@Pc(59) int[] local59;
				if (arg0.aClass618_2 == Class618.aClass618_5 && Class588.method31650(arg0.aByte114, (byte) 10)) {
					local59 = this.anInterface24_7.method6764(Class616.aClass616_2, arg0.anInt3788 * -1747960127, 0.7F, arg1, arg1, true, 1960845013);
				} else {
					local59 = this.anInterface24_7.method6780(Class616.aClass616_2, arg0.anInt3788 * -1747960127, 0.7F, arg1, arg1, false, (byte) -66);
				}
				local93 = new Class88_Sub2(this.aClass104_Sub1_44, 3553, arg1, arg1, arg0.aByte119 != 0, local59, 0, 0, false);
			}
			local93.method18079(arg0.aByte113 == 1, arg0.aByte120 == 1);
			this.aClass240_65.method25840(local93, (long) (arg0.anInt3787 * 595186169), arg1 * arg1, 348131315);
			return local93;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ca", name = "z", descriptor = "(Lclient!dv;I)Lclient!adt;", line = 25)
	Class88_Sub2 method24635(@OriginalArg(0) Class235 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class88_Sub2 local9 = (Class88_Sub2) this.aClass240_65.method25829((long) (arg0.anInt3787 * 595186169));
		if (local9 != null) {
			return local9;
		} else if (this.method24637(Class616.aClass616_2, arg0, arg1)) {
			if (arg1 == -1) {
				arg1 = arg0.anInt3806 * -923926085;
			}
			@Pc(93) Class88_Sub2 local93;
			if (arg0.aBoolean655 && this.aClass104_Sub1_44.method20622()) {
				@Pc(112) float[] local112 = this.anInterface24_7.method6766(Class616.aClass616_2, arg0.anInt3788 * -1747960127, arg0.anInt3769 * -764718997, 0.7F, arg1, arg1, false, (byte) 1);
				local93 = new Class88_Sub2(this.aClass104_Sub1_44, 3553, Class206.aClass206_22, Class226.aClass226_24, arg1, arg1, arg0.aByte119 != 0, local112, Class206.aClass206_22);
			} else {
				@Pc(59) int[] local59;
				if (arg0.aClass618_2 == Class618.aClass618_5 && Class588.method31650(arg0.aByte114, (byte) 10)) {
					local59 = this.anInterface24_7.method6764(Class616.aClass616_2, arg0.anInt3788 * -1747960127, 0.7F, arg1, arg1, true, -1566713326);
				} else {
					local59 = this.anInterface24_7.method6780(Class616.aClass616_2, arg0.anInt3788 * -1747960127, 0.7F, arg1, arg1, false, (byte) -110);
				}
				local93 = new Class88_Sub2(this.aClass104_Sub1_44, 3553, arg1, arg1, arg0.aByte119 != 0, local59, 0, 0, false);
			}
			local93.method18079(arg0.aByte113 == 1, arg0.aByte120 == 1);
			this.aClass240_65.method25840(local93, (long) (arg0.anInt3787 * 595186169), arg1 * arg1, -3709113);
			return local93;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ca", name = "p", descriptor = "(Lclient!vk;Lclient!dv;I)Z", line = 50)
	boolean method24636(@OriginalArg(0) Class616 arg0, @OriginalArg(1) Class235 arg1, @OriginalArg(2) int arg2) {
		if (arg2 == -1) {
			arg2 = arg1.anInt3806 * -923926085;
		}
		if (arg1.aBoolean655 && this.aClass104_Sub1_44.method20622()) {
			return this.anInterface24_7.method6765(arg0, arg1.anInt3788 * -1747960127, arg1.anInt3769 * -764718997, Class609.aClass609_3, 0.7F, arg2, arg2, false, -1630596103);
		} else if (arg1.aClass618_2 == Class618.aClass618_5 && Class588.method31650(arg1.aByte114, (byte) 10)) {
			return this.anInterface24_7.method6765(arg0, arg1.anInt3788 * -1747960127, -1, Class609.aClass609_1, 0.7F, arg2, arg2, true, -1630596103);
		} else {
			return this.anInterface24_7.method6765(arg0, arg1.anInt3788 * -1747960127, -1, Class609.aClass609_2, 0.7F, arg2, arg2, false, -1630596103);
		}
	}

	@OriginalMember(owner = "client!ca", name = "m", descriptor = "(Lclient!vk;Lclient!dv;I)Z", line = 50)
	boolean method24637(@OriginalArg(0) Class616 arg0, @OriginalArg(1) Class235 arg1, @OriginalArg(2) int arg2) {
		if (arg2 == -1) {
			arg2 = arg1.anInt3806 * -923926085;
		}
		if (arg1.aBoolean655 && this.aClass104_Sub1_44.method20622()) {
			return this.anInterface24_7.method6765(arg0, arg1.anInt3788 * -1747960127, arg1.anInt3769 * -764718997, Class609.aClass609_3, 0.7F, arg2, arg2, false, -1630596103);
		} else if (arg1.aClass618_2 == Class618.aClass618_5 && Class588.method31650(arg1.aByte114, (byte) 10)) {
			return this.anInterface24_7.method6765(arg0, arg1.anInt3788 * -1747960127, -1, Class609.aClass609_1, 0.7F, arg2, arg2, true, -1630596103);
		} else {
			return this.anInterface24_7.method6765(arg0, arg1.anInt3788 * -1747960127, -1, Class609.aClass609_2, 0.7F, arg2, arg2, false, -1630596103);
		}
	}

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "(Lclient!vk;Lclient!dv;I)Z", line = 50)
	boolean method24638(@OriginalArg(0) Class616 arg0, @OriginalArg(1) Class235 arg1, @OriginalArg(2) int arg2) {
		if (arg2 == -1) {
			arg2 = arg1.anInt3806 * -923926085;
		}
		if (arg1.aBoolean655 && this.aClass104_Sub1_44.method20622()) {
			return this.anInterface24_7.method6765(arg0, arg1.anInt3788 * -1747960127, arg1.anInt3769 * -764718997, Class609.aClass609_3, 0.7F, arg2, arg2, false, -1630596103);
		} else if (arg1.aClass618_2 == Class618.aClass618_5 && Class588.method31650(arg1.aByte114, (byte) 10)) {
			return this.anInterface24_7.method6765(arg0, arg1.anInt3788 * -1747960127, -1, Class609.aClass609_1, 0.7F, arg2, arg2, true, -1630596103);
		} else {
			return this.anInterface24_7.method6765(arg0, arg1.anInt3788 * -1747960127, -1, Class609.aClass609_2, 0.7F, arg2, arg2, false, -1630596103);
		}
	}

	@OriginalMember(owner = "client!ca", name = "k", descriptor = "()V", line = 61)
	void method24639() {
		this.aClass240_65.method25843(5, (byte) -27);
	}

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "()V", line = 61)
	void method24640() {
		this.aClass240_65.method25843(5, (byte) 26);
	}

	@OriginalMember(owner = "client!ca", name = "f", descriptor = "()V", line = 65)
	void method24641() {
		this.aClass240_65.method25847((byte) -74);
	}
}
