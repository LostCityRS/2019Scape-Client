package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aac")
public final class Class5 {

	@OriginalMember(owner = "client!aac", name = "hc", descriptor = "Lclient!aod;")
	public static Class41_Sub3 aClass41_Sub3_1;

	@OriginalMember(owner = "client!aac", name = "f", descriptor = "Lclient!th;")
	Class147 aClass147_2;

	@OriginalMember(owner = "client!aac", name = "t", descriptor = "Lclient!th;")
	Class147 aClass147_1 = new Class147();

	@OriginalMember(owner = "client!aac", name = "w", descriptor = "(Lclient!th;Lclient!th;)V")
	public static void method101(@OriginalArg(0) Class147 arg0, @OriginalArg(1) Class147 arg1) {
		if (arg0.aClass147_19 != null) {
			arg0.method23926(2010464729);
		}
		arg0.aClass147_19 = arg1;
		arg0.aClass147_20 = arg1.aClass147_20;
		arg0.aClass147_19.aClass147_20 = arg0;
		arg0.aClass147_20.aClass147_19 = arg0;
	}

	@OriginalMember(owner = "client!aac", name = "t", descriptor = "(I)Lclient!aku;")
	static Class80_Sub31 method115(@OriginalArg(0) int arg0) {
		return Class80_Sub31.anInt1649 * 1131535155 == 0 ? new Class80_Sub31() : Class80_Sub31.aClass80_Sub31Array1[(Class80_Sub31.anInt1649 -= -1264478213) * 1131535155];
	}

	@OriginalMember(owner = "client!aac", name = "acx", descriptor = "(Lclient!yp;S)V")
	static void method116(@OriginalArg(0) Class690 arg0, @OriginalArg(1) short arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = arg0.aClass378_3.aByte139;
	}

	@OriginalMember(owner = "client!aac", name = "<init>", descriptor = "()V")
	public Class5() {
		this.aClass147_1.aClass147_20 = this.aClass147_1;
		this.aClass147_1.aClass147_19 = this.aClass147_1;
	}

	@OriginalMember(owner = "client!aac", name = "ax", descriptor = "()Z")
	public boolean method88() {
		return this.aClass147_1 == this.aClass147_1.aClass147_20;
	}

	@OriginalMember(owner = "client!aac", name = "t", descriptor = "(I)V")
	public void method89(@OriginalArg(0) int arg0) {
		while (true) {
			@Pc(3) Class147 local3 = this.aClass147_1.aClass147_20;
			if (this.aClass147_1 == local3) {
				this.aClass147_2 = null;
				return;
			}
			local3.method23926(1861108464);
		}
	}

	@OriginalMember(owner = "client!aac", name = "f", descriptor = "(Lclient!th;I)V")
	public void method90(@OriginalArg(0) Class147 arg0, @OriginalArg(1) int arg1) {
		if (arg0.aClass147_19 != null) {
			arg0.method23926(336629493);
		}
		arg0.aClass147_19 = this.aClass147_1.aClass147_19;
		arg0.aClass147_20 = this.aClass147_1;
		arg0.aClass147_19.aClass147_20 = arg0;
		arg0.aClass147_20.aClass147_19 = arg0;
	}

	@OriginalMember(owner = "client!aac", name = "e", descriptor = "(Lclient!th;I)V")
	public void method91(@OriginalArg(0) Class147 arg0, @OriginalArg(1) int arg1) {
		if (arg0.aClass147_19 != null) {
			arg0.method23926(822026401);
		}
		arg0.aClass147_19 = this.aClass147_1;
		arg0.aClass147_20 = this.aClass147_1.aClass147_20;
		arg0.aClass147_19.aClass147_20 = arg0;
		arg0.aClass147_20.aClass147_19 = arg0;
	}

	@OriginalMember(owner = "client!aac", name = "c", descriptor = "()Z")
	public boolean method92() {
		return this.aClass147_1 == this.aClass147_1.aClass147_20;
	}

	@OriginalMember(owner = "client!aac", name = "g", descriptor = "(B)Lclient!th;")
	public Class147 method93(@OriginalArg(0) byte arg0) {
		@Pc(3) Class147 local3 = this.aClass147_1.aClass147_20;
		if (this.aClass147_1 == local3) {
			this.aClass147_2 = null;
			return null;
		} else {
			this.aClass147_2 = local3.aClass147_20;
			return local3;
		}
	}

	@OriginalMember(owner = "client!aac", name = "n", descriptor = "()Z")
	public boolean method94() {
		return this.aClass147_1 == this.aClass147_1.aClass147_20;
	}

	@OriginalMember(owner = "client!aac", name = "m", descriptor = "(I)Z")
	public boolean method95(@OriginalArg(0) int arg0) {
		return this.aClass147_1 == this.aClass147_1.aClass147_20;
	}

	@OriginalMember(owner = "client!aac", name = "x", descriptor = "(Lclient!th;)V")
	public void method96(@OriginalArg(0) Class147 arg0) {
		if (arg0.aClass147_19 != null) {
			arg0.method23926(1883359998);
		}
		arg0.aClass147_19 = this.aClass147_1;
		arg0.aClass147_20 = this.aClass147_1.aClass147_20;
		arg0.aClass147_19.aClass147_20 = arg0;
		arg0.aClass147_20.aClass147_19 = arg0;
	}

	@OriginalMember(owner = "client!aac", name = "a", descriptor = "()V")
	public void method97() {
		while (true) {
			@Pc(3) Class147 local3 = this.aClass147_1.aClass147_20;
			if (this.aClass147_1 == local3) {
				this.aClass147_2 = null;
				return;
			}
			local3.method23926(1186982921);
		}
	}

	@OriginalMember(owner = "client!aac", name = "z", descriptor = "()Lclient!th;")
	public Class147 method98() {
		@Pc(2) Class147 local2 = this.aClass147_2;
		if (local2 == this.aClass147_1) {
			this.aClass147_2 = null;
			return null;
		} else {
			this.aClass147_2 = local2.aClass147_20;
			return local2;
		}
	}

	@OriginalMember(owner = "client!aac", name = "k", descriptor = "(Lclient!th;)V")
	public void method99(@OriginalArg(0) Class147 arg0) {
		if (arg0.aClass147_19 != null) {
			arg0.method23926(2024851830);
		}
		arg0.aClass147_19 = this.aClass147_1;
		arg0.aClass147_20 = this.aClass147_1.aClass147_20;
		arg0.aClass147_19.aClass147_20 = arg0;
		arg0.aClass147_20.aClass147_19 = arg0;
	}

	@OriginalMember(owner = "client!aac", name = "j", descriptor = "()V")
	public void method100() {
		while (true) {
			@Pc(3) Class147 local3 = this.aClass147_1.aClass147_20;
			if (this.aClass147_1 == local3) {
				this.aClass147_2 = null;
				return;
			}
			local3.method23926(1419129080);
		}
	}

	@OriginalMember(owner = "client!aac", name = "r", descriptor = "()Lclient!th;")
	public Class147 method102() {
		@Pc(3) Class147 local3 = this.aClass147_1.aClass147_20;
		if (local3 == this.aClass147_1) {
			return null;
		} else {
			local3.method23926(823556790);
			return local3;
		}
	}

	@OriginalMember(owner = "client!aac", name = "q", descriptor = "()Lclient!th;")
	public Class147 method103() {
		@Pc(3) Class147 local3 = this.aClass147_1.aClass147_20;
		if (local3 == this.aClass147_1) {
			return null;
		} else {
			local3.method23926(2038295312);
			return local3;
		}
	}

	@OriginalMember(owner = "client!aac", name = "h", descriptor = "()Lclient!th;")
	public Class147 method104() {
		@Pc(3) Class147 local3 = this.aClass147_1.aClass147_20;
		if (this.aClass147_1 == local3) {
			this.aClass147_2 = null;
			return null;
		} else {
			this.aClass147_2 = local3.aClass147_20;
			return local3;
		}
	}

	@OriginalMember(owner = "client!aac", name = "d", descriptor = "()Lclient!th;")
	public Class147 method105() {
		@Pc(3) Class147 local3 = this.aClass147_1.aClass147_20;
		if (this.aClass147_1 == local3) {
			this.aClass147_2 = null;
			return null;
		} else {
			this.aClass147_2 = local3.aClass147_20;
			return local3;
		}
	}

	@OriginalMember(owner = "client!aac", name = "p", descriptor = "()Lclient!th;")
	public Class147 method106() {
		@Pc(2) Class147 local2 = this.aClass147_2;
		if (local2 == this.aClass147_1) {
			this.aClass147_2 = null;
			return null;
		} else {
			this.aClass147_2 = local2.aClass147_20;
			return local2;
		}
	}

	@OriginalMember(owner = "client!aac", name = "v", descriptor = "()Lclient!th;")
	public Class147 method107() {
		@Pc(2) Class147 local2 = this.aClass147_2;
		if (local2 == this.aClass147_1) {
			this.aClass147_2 = null;
			return null;
		} else {
			this.aClass147_2 = local2.aClass147_20;
			return local2;
		}
	}

	@OriginalMember(owner = "client!aac", name = "o", descriptor = "()V")
	public void method108() {
		while (true) {
			@Pc(3) Class147 local3 = this.aClass147_1.aClass147_20;
			if (this.aClass147_1 == local3) {
				this.aClass147_2 = null;
				return;
			}
			local3.method23926(493955615);
		}
	}

	@OriginalMember(owner = "client!aac", name = "y", descriptor = "()Lclient!th;")
	public Class147 method109() {
		@Pc(2) Class147 local2 = this.aClass147_2;
		if (local2 == this.aClass147_1) {
			this.aClass147_2 = null;
			return null;
		} else {
			this.aClass147_2 = local2.aClass147_20;
			return local2;
		}
	}

	@OriginalMember(owner = "client!aac", name = "i", descriptor = "(I)Lclient!th;")
	public Class147 method110(@OriginalArg(0) int arg0) {
		@Pc(2) Class147 local2 = this.aClass147_2;
		if (local2 == this.aClass147_1) {
			this.aClass147_2 = null;
			return null;
		} else {
			this.aClass147_2 = local2.aClass147_20;
			return local2;
		}
	}

	@OriginalMember(owner = "client!aac", name = "s", descriptor = "(Lclient!th;)V")
	public void method111(@OriginalArg(0) Class147 arg0) {
		if (arg0.aClass147_19 != null) {
			arg0.method23926(1649043242);
		}
		arg0.aClass147_19 = this.aClass147_1.aClass147_19;
		arg0.aClass147_20 = this.aClass147_1;
		arg0.aClass147_19.aClass147_20 = arg0;
		arg0.aClass147_20.aClass147_19 = arg0;
	}

	@OriginalMember(owner = "client!aac", name = "b", descriptor = "()Z")
	public boolean method112() {
		return this.aClass147_1 == this.aClass147_1.aClass147_20;
	}

	@OriginalMember(owner = "client!aac", name = "l", descriptor = "(B)Lclient!th;")
	public Class147 method113(@OriginalArg(0) byte arg0) {
		@Pc(3) Class147 local3 = this.aClass147_1.aClass147_20;
		if (local3 == this.aClass147_1) {
			return null;
		} else {
			local3.method23926(680511526);
			return local3;
		}
	}

	@OriginalMember(owner = "client!aac", name = "ay", descriptor = "()Z")
	public boolean method114() {
		return this.aClass147_1 == this.aClass147_1.aClass147_20;
	}
}
