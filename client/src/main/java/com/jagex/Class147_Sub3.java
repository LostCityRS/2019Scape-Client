package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ajr")
public class Class147_Sub3 extends Class147 {

	@OriginalMember(owner = "client!ajr", name = "e", descriptor = "Lclient!ajr;")
	public Class147_Sub3 aClass147_Sub3_7;

	@OriginalMember(owner = "client!ajr", name = "u", descriptor = "Lclient!ajr;")
	public Class147_Sub3 aClass147_Sub3_8;

	@OriginalMember(owner = "client!ajr", name = "su", descriptor = "(Lclient!yp;I)V")
	static void method23935(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(24) int local24 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(25) int local25 = local24 - 1;
		if (local11.aStringArray24 == null || local25 >= local11.aStringArray24.length || local11.aStringArray24[local25] == null) {
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = "";
		} else {
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = local11.aStringArray24[local25];
		}
	}

	@OriginalMember(owner = "client!ajr", name = "ale", descriptor = "(Lclient!yp;I)V")
	static void method23936(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(28) boolean local28 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1] == 1;
		if (local13 == 0) {
			Class159_Sub1.aBoolean401 = local28;
		} else if (local13 == 1) {
			Class159_Sub1.aBoolean407 = local28;
		} else if (local13 == 2) {
			Class159_Sub1.aBoolean408 = local28;
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ajr", name = "qv", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;I)V")
	static void method23937(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) int arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray46[(arg2.anInt5776 -= -825189621) * -2070619997];
		if (Class619.method32302(local13, arg2, -1623183078) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray32 = Class431.method29089(local13, arg2, 1060309630);
		arg0.aBoolean815 = true;
	}

	@OriginalMember(owner = "client!ajr", name = "l", descriptor = "(B)V")
	public final void method23933(@OriginalArg(0) byte arg0) {
		if (this.aClass147_Sub3_8 != null) {
			this.aClass147_Sub3_8.aClass147_Sub3_7 = this.aClass147_Sub3_7;
			this.aClass147_Sub3_7.aClass147_Sub3_8 = this.aClass147_Sub3_8;
			this.aClass147_Sub3_7 = null;
			this.aClass147_Sub3_8 = null;
		}
	}

	@OriginalMember(owner = "client!ajr", name = "g", descriptor = "()V")
	public final void method23934() {
		if (this.aClass147_Sub3_8 != null) {
			this.aClass147_Sub3_8.aClass147_Sub3_7 = this.aClass147_Sub3_7;
			this.aClass147_Sub3_7.aClass147_Sub3_8 = this.aClass147_Sub3_8;
			this.aClass147_Sub3_7 = null;
			this.aClass147_Sub3_8 = null;
		}
	}
}
