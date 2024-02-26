package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ki")
public final class Class381 {

	@OriginalMember(owner = "client!ki", name = "e", descriptor = "Lclient!kp;")
	Class384 aClass384_1;

	@OriginalMember(owner = "client!ki", name = "t", descriptor = "Lclient!pf;")
	final Class480 aClass480_106;

	@OriginalMember(owner = "client!ki", name = "f", descriptor = "Lclient!pf;")
	final Class480 aClass480_107;

	@OriginalMember(owner = "client!ki", name = "zl", descriptor = "(Lclient!yp;I)V")
	static void method28566(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		if (client.anInt3577 * 740205413 == 2 && local12 < client.anInt3573 * 975306769) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = client.aClass676Array1[local12].anInt5741 * -34276535;
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
		}
	}

	@OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(Lclient!pf;Lclient!pf;)V")
	public Class381(@OriginalArg(0) Class480 arg0, @OriginalArg(1) Class480 arg1) {
		this.aClass480_106 = arg0;
		this.aClass480_107 = arg1;
	}

	@OriginalMember(owner = "client!ki", name = "e", descriptor = "(Lclient!ko;)Lclient!kk;")
	public Interface32 method28560(@OriginalArg(0) Interface33 arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(7) Class392 local7 = arg0.method28942(-1726577656);
		if (Class392.aClass392_11 == local7) {
			return new Class380((Class373) arg0);
		} else if (local7 == Class392.aClass392_5) {
			return new Class388(this.method28562((byte) 7), (Class376) arg0);
		} else if (local7 == Class392.aClass392_6) {
			return new Class133(this.aClass480_106, (Class130) arg0);
		} else if (local7 == Class392.aClass392_1) {
			return new Class133_Sub1(this.aClass480_106, (Class130_Sub1) arg0);
		} else if (Class392.aClass392_2 == local7) {
			return new Class129_Sub1(this.aClass480_106, this.aClass480_107, (Class125_Sub3) arg0);
		} else if (Class392.aClass392_3 == local7) {
			return new Class129_Sub3(this.aClass480_106, this.aClass480_107, (Class125_Sub1) arg0);
		} else if (local7 == Class392.aClass392_4) {
			return new Class129_Sub2(this.aClass480_106, this.aClass480_107, (Class125_Sub2) arg0);
		} else if (local7 == Class392.aClass392_8) {
			return new Class389(this.aClass480_106, this.aClass480_107, (Class407) arg0);
		} else if (local7 == Class392.aClass392_7) {
			return new Class390(this.aClass480_106, (Class405) arg0);
		} else if (Class392.aClass392_10 == local7) {
			return new Class129_Sub2_Sub1(this.aClass480_106, this.aClass480_107, (Class125_Sub2_Sub1) arg0);
		} else if (local7 == Class392.aClass392_9) {
			return new Class377(this.aClass480_106, this.aClass480_107, (Class375) arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ki", name = "t", descriptor = "(Lclient!ko;I)Lclient!kk;")
	public Interface32 method28561(@OriginalArg(0) Interface33 arg0, @OriginalArg(1) int arg1) {
		if (arg0 == null) {
			return null;
		}
		@Pc(7) Class392 local7 = arg0.method28942(-1726577656);
		if (Class392.aClass392_11 == local7) {
			return new Class380((Class373) arg0);
		} else if (local7 == Class392.aClass392_5) {
			return new Class388(this.method28562((byte) 7), (Class376) arg0);
		} else if (local7 == Class392.aClass392_6) {
			return new Class133(this.aClass480_106, (Class130) arg0);
		} else if (local7 == Class392.aClass392_1) {
			return new Class133_Sub1(this.aClass480_106, (Class130_Sub1) arg0);
		} else if (Class392.aClass392_2 == local7) {
			return new Class129_Sub1(this.aClass480_106, this.aClass480_107, (Class125_Sub3) arg0);
		} else if (Class392.aClass392_3 == local7) {
			return new Class129_Sub3(this.aClass480_106, this.aClass480_107, (Class125_Sub1) arg0);
		} else if (local7 == Class392.aClass392_4) {
			return new Class129_Sub2(this.aClass480_106, this.aClass480_107, (Class125_Sub2) arg0);
		} else if (local7 == Class392.aClass392_8) {
			return new Class389(this.aClass480_106, this.aClass480_107, (Class407) arg0);
		} else if (local7 == Class392.aClass392_7) {
			return new Class390(this.aClass480_106, (Class405) arg0);
		} else if (Class392.aClass392_10 == local7) {
			return new Class129_Sub2_Sub1(this.aClass480_106, this.aClass480_107, (Class125_Sub2_Sub1) arg0);
		} else if (local7 == Class392.aClass392_9) {
			return new Class377(this.aClass480_106, this.aClass480_107, (Class375) arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ki", name = "f", descriptor = "(B)Lclient!kp;")
	Class384 method28562(@OriginalArg(0) byte arg0) {
		if (this.aClass384_1 == null) {
			this.aClass384_1 = new Class384();
		}
		return this.aClass384_1;
	}

	@OriginalMember(owner = "client!ki", name = "g", descriptor = "()Lclient!kp;")
	Class384 method28563() {
		if (this.aClass384_1 == null) {
			this.aClass384_1 = new Class384();
		}
		return this.aClass384_1;
	}

	@OriginalMember(owner = "client!ki", name = "l", descriptor = "()Lclient!kp;")
	Class384 method28564() {
		if (this.aClass384_1 == null) {
			this.aClass384_1 = new Class384();
		}
		return this.aClass384_1;
	}

	@OriginalMember(owner = "client!ki", name = "u", descriptor = "(Lclient!ko;)Lclient!kk;")
	public Interface32 method28565(@OriginalArg(0) Interface33 arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(7) Class392 local7 = arg0.method28942(-1726577656);
		if (Class392.aClass392_11 == local7) {
			return new Class380((Class373) arg0);
		} else if (local7 == Class392.aClass392_5) {
			return new Class388(this.method28562((byte) 7), (Class376) arg0);
		} else if (local7 == Class392.aClass392_6) {
			return new Class133(this.aClass480_106, (Class130) arg0);
		} else if (local7 == Class392.aClass392_1) {
			return new Class133_Sub1(this.aClass480_106, (Class130_Sub1) arg0);
		} else if (Class392.aClass392_2 == local7) {
			return new Class129_Sub1(this.aClass480_106, this.aClass480_107, (Class125_Sub3) arg0);
		} else if (Class392.aClass392_3 == local7) {
			return new Class129_Sub3(this.aClass480_106, this.aClass480_107, (Class125_Sub1) arg0);
		} else if (local7 == Class392.aClass392_4) {
			return new Class129_Sub2(this.aClass480_106, this.aClass480_107, (Class125_Sub2) arg0);
		} else if (local7 == Class392.aClass392_8) {
			return new Class389(this.aClass480_106, this.aClass480_107, (Class407) arg0);
		} else if (local7 == Class392.aClass392_7) {
			return new Class390(this.aClass480_106, (Class405) arg0);
		} else if (Class392.aClass392_10 == local7) {
			return new Class129_Sub2_Sub1(this.aClass480_106, this.aClass480_107, (Class125_Sub2_Sub1) arg0);
		} else if (local7 == Class392.aClass392_9) {
			return new Class377(this.aClass480_106, this.aClass480_107, (Class375) arg0);
		} else {
			return null;
		}
	}
}
