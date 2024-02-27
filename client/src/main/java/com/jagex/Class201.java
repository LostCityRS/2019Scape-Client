package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ca")
public final class Class201 {

	@OriginalMember(owner = "client!ca", name = "m", descriptor = "Lclient!eb;")
	final Class240 aClass240_65 = new Class240(10485760, 256);

	@OriginalMember(owner = "client!ca", name = "e", descriptor = "Lclient!afa;")
	final Class104_Sub1 aClass104_Sub1_44;

	@OriginalMember(owner = "client!ca", name = "n", descriptor = "Lclient!es;")
	final Interface24 anInterface24_7;

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Lclient!afa;Lclient!es;)V")
	Class201(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) Interface24 arg1) {
		this.aClass104_Sub1_44 = arg0;
		this.anInterface24_7 = arg1;
	}

	@OriginalMember(owner = "client!ca", name = "p", descriptor = "(Lclient!vk;Lclient!dv;I)Z")
	boolean method24642(@OriginalArg(0) Class616 arg0, @OriginalArg(1) Class235 arg1, @OriginalArg(2) int arg2) {
		if (arg2 == -1) {
			arg2 = arg1.anInt3847 * -923926085;
		}
		if (arg1.aBoolean659 && this.aClass104_Sub1_44.method20553()) {
			return this.anInterface24_7.method6765(arg0, arg1.anInt3829 * -1747960127, arg1.anInt3810 * -764718997, Class609.aClass609_3, 0.7F, arg2, arg2, false, -1630596103);
		} else if (arg1.aClass618_2 == Class618.aClass618_5 && Class588.method31830(arg1.aByte114, (byte) 10)) {
			return this.anInterface24_7.method6765(arg0, arg1.anInt3829 * -1747960127, -1, Class609.aClass609_1, 0.7F, arg2, arg2, true, -1630596103);
		} else {
			return this.anInterface24_7.method6765(arg0, arg1.anInt3829 * -1747960127, -1, Class609.aClass609_2, 0.7F, arg2, arg2, false, -1630596103);
		}
	}

	@OriginalMember(owner = "client!ca", name = "u", descriptor = "(Lclient!dv;)Lclient!adt;")
	Class88_Sub2 method24643(@OriginalArg(0) Class235 arg0) {
		return this.method24645(arg0, arg0.anInt3847 * -923926085);
	}

	@OriginalMember(owner = "client!ca", name = "m", descriptor = "(Lclient!vk;Lclient!dv;I)Z")
	boolean method24644(@OriginalArg(0) Class616 arg0, @OriginalArg(1) Class235 arg1, @OriginalArg(2) int arg2) {
		if (arg2 == -1) {
			arg2 = arg1.anInt3847 * -923926085;
		}
		if (arg1.aBoolean659 && this.aClass104_Sub1_44.method20553()) {
			return this.anInterface24_7.method6765(arg0, arg1.anInt3829 * -1747960127, arg1.anInt3810 * -764718997, Class609.aClass609_3, 0.7F, arg2, arg2, false, -1630596103);
		} else if (arg1.aClass618_2 == Class618.aClass618_5 && Class588.method31830(arg1.aByte114, (byte) 10)) {
			return this.anInterface24_7.method6765(arg0, arg1.anInt3829 * -1747960127, -1, Class609.aClass609_1, 0.7F, arg2, arg2, true, -1630596103);
		} else {
			return this.anInterface24_7.method6765(arg0, arg1.anInt3829 * -1747960127, -1, Class609.aClass609_2, 0.7F, arg2, arg2, false, -1630596103);
		}
	}

	@OriginalMember(owner = "client!ca", name = "n", descriptor = "(Lclient!dv;I)Lclient!adt;")
	Class88_Sub2 method24645(@OriginalArg(0) Class235 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class88_Sub2 local9 = (Class88_Sub2) this.aClass240_65.method25932((long) (arg0.anInt3828 * 595186169));
		if (local9 != null) {
			return local9;
		} else if (this.method24644(Class616.aClass616_2, arg0, arg1)) {
			if (arg1 == -1) {
				arg1 = arg0.anInt3847 * -923926085;
			}
			@Pc(93) Class88_Sub2 local93;
			if (arg0.aBoolean659 && this.aClass104_Sub1_44.method20553()) {
				@Pc(112) float[] local112 = this.anInterface24_7.method6766(Class616.aClass616_2, arg0.anInt3829 * -1747960127, arg0.anInt3810 * -764718997, 0.7F, arg1, arg1, false, (byte) 1);
				local93 = new Class88_Sub2(this.aClass104_Sub1_44, 3553, Class206.aClass206_22, Class226.aClass226_24, arg1, arg1, arg0.aByte119 != 0, local112, Class206.aClass206_22);
			} else {
				@Pc(59) int[] local59;
				if (arg0.aClass618_2 == Class618.aClass618_5 && Class588.method31830(arg0.aByte114, (byte) 10)) {
					local59 = this.anInterface24_7.method6764(Class616.aClass616_2, arg0.anInt3829 * -1747960127, 0.7F, arg1, arg1, true, 1960845013);
				} else {
					local59 = this.anInterface24_7.method6780(Class616.aClass616_2, arg0.anInt3829 * -1747960127, 0.7F, arg1, arg1, false, (byte) -66);
				}
				local93 = new Class88_Sub2(this.aClass104_Sub1_44, 3553, arg1, arg1, arg0.aByte119 != 0, local59, 0, 0, false);
			}
			local93.method18092(arg0.aByte113 == 1, arg0.aByte120 == 1);
			this.aClass240_65.method25924(local93, (long) (arg0.anInt3828 * 595186169), arg1 * arg1, 348131315);
			return local93;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ca", name = "f", descriptor = "()V")
	void method24646() {
		this.aClass240_65.method25926((byte) -74);
	}

	@OriginalMember(owner = "client!ca", name = "w", descriptor = "(Lclient!dv;)Lclient!adt;")
	Class88_Sub2 method24647(@OriginalArg(0) Class235 arg0) {
		return this.method24645(arg0, arg0.anInt3847 * -923926085);
	}

	@OriginalMember(owner = "client!ca", name = "l", descriptor = "(Lclient!dv;)Lclient!adt;")
	Class88_Sub2 method24648(@OriginalArg(0) Class235 arg0) {
		return this.method24645(arg0, arg0.anInt3847 * -923926085);
	}

	@OriginalMember(owner = "client!ca", name = "k", descriptor = "()V")
	void method24649() {
		this.aClass240_65.method25925(5, (byte) -27);
	}

	@OriginalMember(owner = "client!ca", name = "z", descriptor = "(Lclient!dv;I)Lclient!adt;")
	Class88_Sub2 method24650(@OriginalArg(0) Class235 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class88_Sub2 local9 = (Class88_Sub2) this.aClass240_65.method25932((long) (arg0.anInt3828 * 595186169));
		if (local9 != null) {
			return local9;
		} else if (this.method24644(Class616.aClass616_2, arg0, arg1)) {
			if (arg1 == -1) {
				arg1 = arg0.anInt3847 * -923926085;
			}
			@Pc(93) Class88_Sub2 local93;
			if (arg0.aBoolean659 && this.aClass104_Sub1_44.method20553()) {
				@Pc(112) float[] local112 = this.anInterface24_7.method6766(Class616.aClass616_2, arg0.anInt3829 * -1747960127, arg0.anInt3810 * -764718997, 0.7F, arg1, arg1, false, (byte) 1);
				local93 = new Class88_Sub2(this.aClass104_Sub1_44, 3553, Class206.aClass206_22, Class226.aClass226_24, arg1, arg1, arg0.aByte119 != 0, local112, Class206.aClass206_22);
			} else {
				@Pc(59) int[] local59;
				if (arg0.aClass618_2 == Class618.aClass618_5 && Class588.method31830(arg0.aByte114, (byte) 10)) {
					local59 = this.anInterface24_7.method6764(Class616.aClass616_2, arg0.anInt3829 * -1747960127, 0.7F, arg1, arg1, true, -1566713326);
				} else {
					local59 = this.anInterface24_7.method6780(Class616.aClass616_2, arg0.anInt3829 * -1747960127, 0.7F, arg1, arg1, false, (byte) -110);
				}
				local93 = new Class88_Sub2(this.aClass104_Sub1_44, 3553, arg1, arg1, arg0.aByte119 != 0, local59, 0, 0, false);
			}
			local93.method18092(arg0.aByte113 == 1, arg0.aByte120 == 1);
			this.aClass240_65.method25924(local93, (long) (arg0.anInt3828 * 595186169), arg1 * arg1, -3709113);
			return local93;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ca", name = "e", descriptor = "(Lclient!dv;)Lclient!adt;")
	Class88_Sub2 method24651(@OriginalArg(0) Class235 arg0) {
		return this.method24645(arg0, arg0.anInt3847 * -923926085);
	}

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "(Lclient!vk;Lclient!dv;I)Z")
	boolean method24652(@OriginalArg(0) Class616 arg0, @OriginalArg(1) Class235 arg1, @OriginalArg(2) int arg2) {
		if (arg2 == -1) {
			arg2 = arg1.anInt3847 * -923926085;
		}
		if (arg1.aBoolean659 && this.aClass104_Sub1_44.method20553()) {
			return this.anInterface24_7.method6765(arg0, arg1.anInt3829 * -1747960127, arg1.anInt3810 * -764718997, Class609.aClass609_3, 0.7F, arg2, arg2, false, -1630596103);
		} else if (arg1.aClass618_2 == Class618.aClass618_5 && Class588.method31830(arg1.aByte114, (byte) 10)) {
			return this.anInterface24_7.method6765(arg0, arg1.anInt3829 * -1747960127, -1, Class609.aClass609_1, 0.7F, arg2, arg2, true, -1630596103);
		} else {
			return this.anInterface24_7.method6765(arg0, arg1.anInt3829 * -1747960127, -1, Class609.aClass609_2, 0.7F, arg2, arg2, false, -1630596103);
		}
	}

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "()V")
	void method24653() {
		this.aClass240_65.method25925(5, (byte) 26);
	}
}
