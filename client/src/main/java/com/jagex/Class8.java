package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aaf")
public final class Class8 {

	@OriginalMember(owner = "client!aaf", name = "n", descriptor = "Lclient!ajn;")
	Class149_Sub4 aClass149_Sub4_1;

	@OriginalMember(owner = "client!aaf", name = "e", descriptor = "Lclient!ajn;")
	public Class149_Sub4 aClass149_Sub4_2 = new Class149_Sub4();

	@OriginalMember(owner = "client!aaf", name = "<init>", descriptor = "()V", line = 9)
	public Class8() {
		this.aClass149_Sub4_2.aClass149_Sub4_8 = this.aClass149_Sub4_2;
		this.aClass149_Sub4_2.aClass149_Sub4_7 = this.aClass149_Sub4_2;
	}

	@OriginalMember(owner = "client!aaf", name = "w", descriptor = "(Lclient!ajn;)V", line = 15)
	public void method124(@OriginalArg(0) Class149_Sub4 arg0) {
		if (arg0.aClass149_Sub4_7 != null) {
			arg0.method23773(-880004945);
		}
		arg0.aClass149_Sub4_7 = this.aClass149_Sub4_2.aClass149_Sub4_7;
		arg0.aClass149_Sub4_8 = this.aClass149_Sub4_2;
		arg0.aClass149_Sub4_7.aClass149_Sub4_8 = arg0;
		arg0.aClass149_Sub4_8.aClass149_Sub4_7 = arg0;
	}

	@OriginalMember(owner = "client!aaf", name = "e", descriptor = "(Lclient!ajn;B)V", line = 15)
	public void method125(@OriginalArg(0) Class149_Sub4 arg0, @OriginalArg(1) byte arg1) {
		if (arg0.aClass149_Sub4_7 != null) {
			arg0.method23773(-309828112);
		}
		arg0.aClass149_Sub4_7 = this.aClass149_Sub4_2.aClass149_Sub4_7;
		arg0.aClass149_Sub4_8 = this.aClass149_Sub4_2;
		arg0.aClass149_Sub4_7.aClass149_Sub4_8 = arg0;
		arg0.aClass149_Sub4_8.aClass149_Sub4_7 = arg0;
	}

	@OriginalMember(owner = "client!aaf", name = "f", descriptor = "(Lclient!ajn;)V", line = 15)
	public void method126(@OriginalArg(0) Class149_Sub4 arg0) {
		if (arg0.aClass149_Sub4_7 != null) {
			arg0.method23773(-1390291234);
		}
		arg0.aClass149_Sub4_7 = this.aClass149_Sub4_2.aClass149_Sub4_7;
		arg0.aClass149_Sub4_8 = this.aClass149_Sub4_2;
		arg0.aClass149_Sub4_7.aClass149_Sub4_8 = arg0;
		arg0.aClass149_Sub4_8.aClass149_Sub4_7 = arg0;
	}

	@OriginalMember(owner = "client!aaf", name = "l", descriptor = "(Lclient!ajn;)V", line = 15)
	public void method127(@OriginalArg(0) Class149_Sub4 arg0) {
		if (arg0.aClass149_Sub4_7 != null) {
			arg0.method23773(213519415);
		}
		arg0.aClass149_Sub4_7 = this.aClass149_Sub4_2.aClass149_Sub4_7;
		arg0.aClass149_Sub4_8 = this.aClass149_Sub4_2;
		arg0.aClass149_Sub4_7.aClass149_Sub4_8 = arg0;
		arg0.aClass149_Sub4_8.aClass149_Sub4_7 = arg0;
	}

	@OriginalMember(owner = "client!aaf", name = "n", descriptor = "(I)Lclient!ajn;", line = 23)
	public Class149_Sub4 method128(@OriginalArg(0) int arg0) {
		@Pc(3) Class149_Sub4 local3 = this.aClass149_Sub4_2.aClass149_Sub4_8;
		if (local3 == this.aClass149_Sub4_2) {
			this.aClass149_Sub4_1 = null;
			return null;
		} else {
			this.aClass149_Sub4_1 = local3.aClass149_Sub4_8;
			return local3;
		}
	}

	@OriginalMember(owner = "client!aaf", name = "p", descriptor = "()Lclient!ajn;", line = 23)
	public Class149_Sub4 method129() {
		@Pc(3) Class149_Sub4 local3 = this.aClass149_Sub4_2.aClass149_Sub4_8;
		if (local3 == this.aClass149_Sub4_2) {
			this.aClass149_Sub4_1 = null;
			return null;
		} else {
			this.aClass149_Sub4_1 = local3.aClass149_Sub4_8;
			return local3;
		}
	}

	@OriginalMember(owner = "client!aaf", name = "u", descriptor = "()Lclient!ajn;", line = 23)
	public Class149_Sub4 method130() {
		@Pc(3) Class149_Sub4 local3 = this.aClass149_Sub4_2.aClass149_Sub4_8;
		if (local3 == this.aClass149_Sub4_2) {
			this.aClass149_Sub4_1 = null;
			return null;
		} else {
			this.aClass149_Sub4_1 = local3.aClass149_Sub4_8;
			return local3;
		}
	}

	@OriginalMember(owner = "client!aaf", name = "z", descriptor = "()Lclient!ajn;", line = 23)
	public Class149_Sub4 method131() {
		@Pc(3) Class149_Sub4 local3 = this.aClass149_Sub4_2.aClass149_Sub4_8;
		if (local3 == this.aClass149_Sub4_2) {
			this.aClass149_Sub4_1 = null;
			return null;
		} else {
			this.aClass149_Sub4_1 = local3.aClass149_Sub4_8;
			return local3;
		}
	}

	@OriginalMember(owner = "client!aaf", name = "e", descriptor = "(II)I", line = 24)
	public static int method132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Class62.anIntArray16[arg0];
	}

	@OriginalMember(owner = "client!aaf", name = "m", descriptor = "(I)Lclient!ajn;", line = 33)
	public Class149_Sub4 method133(@OriginalArg(0) int arg0) {
		@Pc(2) Class149_Sub4 local2 = this.aClass149_Sub4_1;
		if (local2 == this.aClass149_Sub4_2) {
			this.aClass149_Sub4_1 = null;
			return null;
		} else {
			this.aClass149_Sub4_1 = local2.aClass149_Sub4_8;
			return local2;
		}
	}

	@OriginalMember(owner = "client!aaf", name = "d", descriptor = "()V", line = 44)
	public void method134() {
		while (true) {
			@Pc(3) Class149_Sub4 local3 = this.aClass149_Sub4_2.aClass149_Sub4_8;
			if (this.aClass149_Sub4_2 == local3) {
				this.aClass149_Sub4_1 = null;
				return;
			}
			local3.method23773(-655345481);
		}
	}

	@OriginalMember(owner = "client!aaf", name = "k", descriptor = "(I)V", line = 44)
	public void method135(@OriginalArg(0) int arg0) {
		while (true) {
			@Pc(3) Class149_Sub4 local3 = this.aClass149_Sub4_2.aClass149_Sub4_8;
			if (this.aClass149_Sub4_2 == local3) {
				this.aClass149_Sub4_1 = null;
				return;
			}
			local3.method23773(-371079240);
		}
	}

	@OriginalMember(owner = "client!aaf", name = "c", descriptor = "()V", line = 44)
	public void method136() {
		while (true) {
			@Pc(3) Class149_Sub4 local3 = this.aClass149_Sub4_2.aClass149_Sub4_8;
			if (this.aClass149_Sub4_2 == local3) {
				this.aClass149_Sub4_1 = null;
				return;
			}
			local3.method23773(-1023080337);
		}
	}
}
