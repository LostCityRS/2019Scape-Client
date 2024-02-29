package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kq")
public class Class385 {

	@OriginalMember(owner = "client!kq", name = "m", descriptor = "Lclient!kf;")
	Class377 aClass377_1;

	@OriginalMember(owner = "client!kq", name = "e", descriptor = "Lclient!py;")
	final Class497 aClass497_111;

	@OriginalMember(owner = "client!kq", name = "n", descriptor = "Lclient!py;")
	final Class497 aClass497_112;

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(Lclient!py;Lclient!py;)V", line = 23)
	public Class385(@OriginalArg(0) Class497 arg0, @OriginalArg(1) Class497 arg1) {
		this.aClass497_111 = arg0;
		this.aClass497_112 = arg1;
	}

	@OriginalMember(owner = "client!kq", name = "e", descriptor = "(Lclient!kk;I)Lclient!kx;", line = 29)
	public Interface33 method28158(@OriginalArg(0) Interface32 arg0, @OriginalArg(1) int arg1) {
		if (arg0 == null) {
			return null;
		}
		@Pc(7) Class388 local7 = arg0.method28578((short) 1039);
		if (local7 == Class388.aClass388_4) {
			return new Class384((Class381) arg0);
		} else if (local7 == Class388.aClass388_5) {
			return new Class391(this.method28161(2083137947), (Class383) arg0);
		} else if (local7 == Class388.aClass388_8) {
			return new Class121(this.aClass497_111, (Class133) arg0);
		} else if (Class388.aClass388_6 == local7) {
			return new Class121_Sub1(this.aClass497_111, (Class133_Sub1) arg0);
		} else if (Class388.aClass388_2 == local7) {
			return new Class122_Sub3(this.aClass497_111, this.aClass497_112, (Class125_Sub3) arg0);
		} else if (Class388.aClass388_3 == local7) {
			return new Class122_Sub2(this.aClass497_111, this.aClass497_112, (Class125_Sub1) arg0);
		} else if (local7 == Class388.aClass388_7) {
			return new Class122_Sub1(this.aClass497_111, this.aClass497_112, (Class125_Sub2) arg0);
		} else if (Class388.aClass388_1 == local7) {
			return new Class380(this.aClass497_111, this.aClass497_112, (Class407) arg0);
		} else if (local7 == Class388.aClass388_9) {
			return new Class389(this.aClass497_111, (Class398) arg0);
		} else if (Class388.aClass388_10 == local7) {
			return new Class122_Sub1_Sub1(this.aClass497_111, this.aClass497_112, (Class125_Sub2_Sub1) arg0);
		} else if (Class388.aClass388_11 == local7) {
			return new Class378(this.aClass497_111, this.aClass497_112, (Class382) arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!kq", name = "m", descriptor = "(Lclient!kk;)Lclient!kx;", line = 29)
	public Interface33 method28159(@OriginalArg(0) Interface32 arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(7) Class388 local7 = arg0.method28578((short) 1039);
		if (local7 == Class388.aClass388_4) {
			return new Class384((Class381) arg0);
		} else if (local7 == Class388.aClass388_5) {
			return new Class391(this.method28161(2083137947), (Class383) arg0);
		} else if (local7 == Class388.aClass388_8) {
			return new Class121(this.aClass497_111, (Class133) arg0);
		} else if (Class388.aClass388_6 == local7) {
			return new Class121_Sub1(this.aClass497_111, (Class133_Sub1) arg0);
		} else if (Class388.aClass388_2 == local7) {
			return new Class122_Sub3(this.aClass497_111, this.aClass497_112, (Class125_Sub3) arg0);
		} else if (Class388.aClass388_3 == local7) {
			return new Class122_Sub2(this.aClass497_111, this.aClass497_112, (Class125_Sub1) arg0);
		} else if (local7 == Class388.aClass388_7) {
			return new Class122_Sub1(this.aClass497_111, this.aClass497_112, (Class125_Sub2) arg0);
		} else if (Class388.aClass388_1 == local7) {
			return new Class380(this.aClass497_111, this.aClass497_112, (Class407) arg0);
		} else if (local7 == Class388.aClass388_9) {
			return new Class389(this.aClass497_111, (Class398) arg0);
		} else if (Class388.aClass388_10 == local7) {
			return new Class122_Sub1_Sub1(this.aClass497_111, this.aClass497_112, (Class125_Sub2_Sub1) arg0);
		} else if (Class388.aClass388_11 == local7) {
			return new Class378(this.aClass497_111, this.aClass497_112, (Class382) arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!kq", name = "k", descriptor = "()Lclient!kf;", line = 46)
	Class377 method28160() {
		if (this.aClass377_1 == null) {
			this.aClass377_1 = new Class377();
		}
		return this.aClass377_1;
	}

	@OriginalMember(owner = "client!kq", name = "n", descriptor = "(I)Lclient!kf;", line = 46)
	Class377 method28161(@OriginalArg(0) int arg0) {
		if (this.aClass377_1 == null) {
			this.aClass377_1 = new Class377();
		}
		return this.aClass377_1;
	}
}
