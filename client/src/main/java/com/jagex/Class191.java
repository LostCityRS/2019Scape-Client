package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bo")
public final class Class191 {

	@OriginalMember(owner = "client!bo", name = "f", descriptor = "I")
	int anInt3336 = 0;

	@OriginalMember(owner = "client!bo", name = "e", descriptor = "I")
	int anInt3337 = 0;

	@OriginalMember(owner = "client!bo", name = "u", descriptor = "I")
	int anInt3335 = 0;

	@OriginalMember(owner = "client!bo", name = "l", descriptor = "Lclient!afm;")
	final Class102_Sub3 aClass102_Sub3_42;

	@OriginalMember(owner = "client!bo", name = "g", descriptor = "Lclient!bf;")
	final Class182 aClass182_6;

	@OriginalMember(owner = "client!bo", name = "t", descriptor = "[Lclient!bp;")
	Class96[] aClass96Array1;

	@OriginalMember(owner = "client!bo", name = "i", descriptor = "Lclient!aeu;")
	final Class96_Sub7 aClass96_Sub7_1;

	@OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Lclient!afm;)V")
	Class191(@OriginalArg(0) Class102_Sub3 arg0) {
		this.aClass102_Sub3_42 = arg0;
		this.aClass182_6 = new Class182(arg0);
		this.aClass96Array1 = new Class96[16];
		this.aClass96Array1[1] = new Class96_Sub5(arg0);
		this.aClass96Array1[2] = new Class96_Sub9(arg0, this.aClass182_6);
		this.aClass96Array1[4] = new Class96_Sub8(arg0, this.aClass182_6);
		this.aClass96Array1[5] = new Class96_Sub2(arg0, this.aClass182_6);
		this.aClass96Array1[6] = new Class96_Sub4(arg0);
		this.aClass96Array1[7] = new Class96_Sub1(arg0);
		this.aClass96Array1[3] = this.aClass96_Sub7_1 = new Class96_Sub7(arg0);
		this.aClass96Array1[8] = new Class96_Sub3(arg0, this.aClass182_6);
		this.aClass96Array1[9] = new Class96_Sub6(arg0, this.aClass182_6);
		if (!this.aClass96Array1[8].method2897()) {
			this.aClass96Array1[8] = this.aClass96Array1[4];
		}
		if (!this.aClass96Array1[9].method2897()) {
			this.aClass96Array1[9] = this.aClass96Array1[8];
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lclient!bz;I)Z")
	boolean method24830(@OriginalArg(0) Class84 arg0, @OriginalArg(1) int arg1) {
		if (this.anInt3335 == 0) {
			return false;
		} else {
			this.aClass96Array1[this.anInt3335 & Integer.MAX_VALUE].method2891(arg0, arg1);
			return true;
		}
	}

	@OriginalMember(owner = "client!bo", name = "o", descriptor = "(Lclient!bz;I)Z")
	boolean method24831(@OriginalArg(0) Class84 arg0, @OriginalArg(1) int arg1) {
		if (this.anInt3335 == 0) {
			return false;
		} else {
			this.aClass96Array1[this.anInt3335 & Integer.MAX_VALUE].method2891(arg0, arg1);
			return true;
		}
	}

	@OriginalMember(owner = "client!bo", name = "f", descriptor = "(IIIZZ)V")
	void method24832(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		@Pc(5) boolean local5 = arg4 & this.aClass102_Sub3_42.method6332();
		if (!local5 && (arg0 == 4 || arg0 == 8 || arg0 == 9)) {
			if (arg0 == 4) {
				arg2 = arg1;
			}
			arg0 = 2;
		}
		if (arg0 != 0 && arg3) {
			arg0 |= Integer.MIN_VALUE;
		}
		if (this.anInt3335 != arg0) {
			if (this.anInt3335 != 0) {
				this.aClass96Array1[this.anInt3335 & Integer.MAX_VALUE].method2885();
			}
			if (arg0 != 0) {
				this.aClass96Array1[arg0 & Integer.MAX_VALUE].method2887(arg3);
				this.aClass96Array1[arg0 & Integer.MAX_VALUE].method2888(arg3);
				this.aClass96Array1[arg0 & Integer.MAX_VALUE].method2890(arg1, arg2);
			}
			this.anInt3335 = arg0;
			this.anInt3336 = arg1;
			this.anInt3337 = arg2;
		} else if (this.anInt3335 != 0) {
			this.aClass96Array1[this.anInt3335 & Integer.MAX_VALUE].method2888(arg3);
			if (this.anInt3336 != arg1 || this.anInt3337 != arg2) {
				this.aClass96Array1[this.anInt3335 & Integer.MAX_VALUE].method2890(arg1, arg2);
				this.anInt3336 = arg1;
				this.anInt3337 = arg2;
			}
		}
	}

	@OriginalMember(owner = "client!bo", name = "t", descriptor = "(I)Z")
	boolean method24833(@OriginalArg(0) int arg0) {
		return this.aClass96Array1[arg0].method2897();
	}

	@OriginalMember(owner = "client!bo", name = "u", descriptor = "(I)Z")
	boolean method24834(@OriginalArg(0) int arg0) {
		return this.aClass96Array1[arg0].method2897();
	}

	@OriginalMember(owner = "client!bo", name = "l", descriptor = "(I)Z")
	boolean method24835(@OriginalArg(0) int arg0) {
		return this.aClass96Array1[arg0].method2897();
	}

	@OriginalMember(owner = "client!bo", name = "g", descriptor = "(IIIZZ)V")
	void method24836(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		@Pc(5) boolean local5 = arg4 & this.aClass102_Sub3_42.method6332();
		if (!local5 && (arg0 == 4 || arg0 == 8 || arg0 == 9)) {
			if (arg0 == 4) {
				arg2 = arg1;
			}
			arg0 = 2;
		}
		if (arg0 != 0 && arg3) {
			arg0 |= Integer.MIN_VALUE;
		}
		if (this.anInt3335 != arg0) {
			if (this.anInt3335 != 0) {
				this.aClass96Array1[this.anInt3335 & Integer.MAX_VALUE].method2885();
			}
			if (arg0 != 0) {
				this.aClass96Array1[arg0 & Integer.MAX_VALUE].method2887(arg3);
				this.aClass96Array1[arg0 & Integer.MAX_VALUE].method2888(arg3);
				this.aClass96Array1[arg0 & Integer.MAX_VALUE].method2890(arg1, arg2);
			}
			this.anInt3335 = arg0;
			this.anInt3336 = arg1;
			this.anInt3337 = arg2;
		} else if (this.anInt3335 != 0) {
			this.aClass96Array1[this.anInt3335 & Integer.MAX_VALUE].method2888(arg3);
			if (this.anInt3336 != arg1 || this.anInt3337 != arg2) {
				this.aClass96Array1[this.anInt3335 & Integer.MAX_VALUE].method2890(arg1, arg2);
				this.anInt3336 = arg1;
				this.anInt3337 = arg2;
			}
		}
	}

	@OriginalMember(owner = "client!bo", name = "i", descriptor = "(IIIZZ)V")
	void method24837(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		@Pc(5) boolean local5 = arg4 & this.aClass102_Sub3_42.method6332();
		if (!local5 && (arg0 == 4 || arg0 == 8 || arg0 == 9)) {
			if (arg0 == 4) {
				arg2 = arg1;
			}
			arg0 = 2;
		}
		if (arg0 != 0 && arg3) {
			arg0 |= Integer.MIN_VALUE;
		}
		if (this.anInt3335 != arg0) {
			if (this.anInt3335 != 0) {
				this.aClass96Array1[this.anInt3335 & Integer.MAX_VALUE].method2885();
			}
			if (arg0 != 0) {
				this.aClass96Array1[arg0 & Integer.MAX_VALUE].method2887(arg3);
				this.aClass96Array1[arg0 & Integer.MAX_VALUE].method2888(arg3);
				this.aClass96Array1[arg0 & Integer.MAX_VALUE].method2890(arg1, arg2);
			}
			this.anInt3335 = arg0;
			this.anInt3336 = arg1;
			this.anInt3337 = arg2;
		} else if (this.anInt3335 != 0) {
			this.aClass96Array1[this.anInt3335 & Integer.MAX_VALUE].method2888(arg3);
			if (this.anInt3336 != arg1 || this.anInt3337 != arg2) {
				this.aClass96Array1[this.anInt3335 & Integer.MAX_VALUE].method2890(arg1, arg2);
				this.anInt3336 = arg1;
				this.anInt3337 = arg2;
			}
		}
	}

	@OriginalMember(owner = "client!bo", name = "m", descriptor = "(Lclient!bz;I)Z")
	boolean method24838(@OriginalArg(0) Class84 arg0, @OriginalArg(1) int arg1) {
		if (this.anInt3335 == 0) {
			return false;
		} else {
			this.aClass96Array1[this.anInt3335 & Integer.MAX_VALUE].method2891(arg0, arg1);
			return true;
		}
	}

	@OriginalMember(owner = "client!bo", name = "e", descriptor = "(Lclient!bz;I)Z")
	boolean method24839(@OriginalArg(0) Class84 arg0, @OriginalArg(1) int arg1) {
		if (this.anInt3335 == 0) {
			return false;
		} else {
			this.aClass96Array1[this.anInt3335 & Integer.MAX_VALUE].method2891(arg0, arg1);
			return true;
		}
	}

	@OriginalMember(owner = "client!bo", name = "j", descriptor = "(Lclient!bz;I)Z")
	boolean method24840(@OriginalArg(0) Class84 arg0, @OriginalArg(1) int arg1) {
		if (this.anInt3335 == 0) {
			return false;
		} else {
			this.aClass96Array1[this.anInt3335 & Integer.MAX_VALUE].method2891(arg0, arg1);
			return true;
		}
	}
}
