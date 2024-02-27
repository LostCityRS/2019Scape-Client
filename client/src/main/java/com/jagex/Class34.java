package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!abg")
public final class Class34 {

	@OriginalMember(owner = "client!abg", name = "e", descriptor = "Ljava/lang/Object;")
	public Object anObject1;

	@OriginalMember(owner = "client!abg", name = "n", descriptor = "Ljava/lang/Object;")
	public Object anObject2;

	@OriginalMember(owner = "client!abg", name = "<init>", descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)V")
	public Class34(@OriginalArg(0) Object arg0, @OriginalArg(1) Object arg1) {
		this.anObject1 = arg0;
		this.anObject2 = arg1;
	}

	@OriginalMember(owner = "client!abg", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return this.anObject1 + ", " + this.anObject2;
	}

	@OriginalMember(owner = "client!abg", name = "rq", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method678(@OriginalArg(0) Object arg0) {
		if (arg0 == null || !(arg0 instanceof Class34)) {
			return false;
		}
		@Pc(9) Class34 local9 = (Class34) arg0;
		if (this.anObject1 == null) {
			if (local9.anObject1 != null) {
				return false;
			}
		} else if (!this.anObject1.equals(local9.anObject1)) {
			return false;
		}
		if (this.anObject2 == null) {
			if (local9.anObject2 != null) {
				return false;
			}
		} else if (!this.anObject2.equals(local9.anObject2)) {
			return false;
		}
		return true;
	}

	@OriginalMember(owner = "client!abg", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (arg0 == null || !(arg0 instanceof Class34)) {
			return false;
		}
		@Pc(9) Class34 local9 = (Class34) arg0;
		if (this.anObject1 == null) {
			if (local9.anObject1 != null) {
				return false;
			}
		} else if (!this.anObject1.equals(local9.anObject1)) {
			return false;
		}
		if (this.anObject2 == null) {
			if (local9.anObject2 != null) {
				return false;
			}
		} else if (!this.anObject2.equals(local9.anObject2)) {
			return false;
		}
		return true;
	}

	@OriginalMember(owner = "client!abg", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		@Pc(1) int local1 = 0;
		if (this.anObject1 != null) {
			local1 += this.anObject1.hashCode();
		}
		if (this.anObject2 != null) {
			local1 += this.anObject2.hashCode() * 31;
		}
		return local1;
	}

	@OriginalMember(owner = "client!abg", name = "rp", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method679(@OriginalArg(0) Object arg0) {
		if (arg0 == null || !(arg0 instanceof Class34)) {
			return false;
		}
		@Pc(9) Class34 local9 = (Class34) arg0;
		if (this.anObject1 == null) {
			if (local9.anObject1 != null) {
				return false;
			}
		} else if (!this.anObject1.equals(local9.anObject1)) {
			return false;
		}
		if (this.anObject2 == null) {
			if (local9.anObject2 != null) {
				return false;
			}
		} else if (!this.anObject2.equals(local9.anObject2)) {
			return false;
		}
		return true;
	}

	@OriginalMember(owner = "client!abg", name = "ri", descriptor = "()I")
	public int method680() {
		@Pc(1) int local1 = 0;
		if (this.anObject1 != null) {
			local1 += this.anObject1.hashCode();
		}
		if (this.anObject2 != null) {
			local1 += this.anObject2.hashCode() * 31;
		}
		return local1;
	}

	@OriginalMember(owner = "client!abg", name = "ro", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method681(@OriginalArg(0) Object arg0) {
		if (arg0 == null || !(arg0 instanceof Class34)) {
			return false;
		}
		@Pc(9) Class34 local9 = (Class34) arg0;
		if (this.anObject1 == null) {
			if (local9.anObject1 != null) {
				return false;
			}
		} else if (!this.anObject1.equals(local9.anObject1)) {
			return false;
		}
		if (this.anObject2 == null) {
			if (local9.anObject2 != null) {
				return false;
			}
		} else if (!this.anObject2.equals(local9.anObject2)) {
			return false;
		}
		return true;
	}

	@OriginalMember(owner = "client!abg", name = "rs", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method682(@OriginalArg(0) Object arg0) {
		if (arg0 == null || !(arg0 instanceof Class34)) {
			return false;
		}
		@Pc(9) Class34 local9 = (Class34) arg0;
		if (this.anObject1 == null) {
			if (local9.anObject1 != null) {
				return false;
			}
		} else if (!this.anObject1.equals(local9.anObject1)) {
			return false;
		}
		if (this.anObject2 == null) {
			if (local9.anObject2 != null) {
				return false;
			}
		} else if (!this.anObject2.equals(local9.anObject2)) {
			return false;
		}
		return true;
	}

	@OriginalMember(owner = "client!abg", name = "rk", descriptor = "()I")
	public int method683() {
		@Pc(1) int local1 = 0;
		if (this.anObject1 != null) {
			local1 += this.anObject1.hashCode();
		}
		if (this.anObject2 != null) {
			local1 += this.anObject2.hashCode() * 31;
		}
		return local1;
	}

	@OriginalMember(owner = "client!abg", name = "rm", descriptor = "()I")
	public int method684() {
		@Pc(1) int local1 = 0;
		if (this.anObject1 != null) {
			local1 += this.anObject1.hashCode();
		}
		if (this.anObject2 != null) {
			local1 += this.anObject2.hashCode() * 31;
		}
		return local1;
	}

	@OriginalMember(owner = "client!abg", name = "rj", descriptor = "()Ljava/lang/String;")
	public String method685() {
		return this.anObject1 + ", " + this.anObject2;
	}
}
