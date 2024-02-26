package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!abt")
public final class Class44 {

	@OriginalMember(owner = "client!abt", name = "t", descriptor = "Ljava/lang/Object;")
	public Object anObject1;

	@OriginalMember(owner = "client!abt", name = "f", descriptor = "Ljava/lang/Object;")
	public Object anObject2;

	@OriginalMember(owner = "client!abt", name = "<init>", descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)V")
	public Class44(@OriginalArg(0) Object arg0, @OriginalArg(1) Object arg1) {
		this.anObject1 = arg0;
		this.anObject2 = arg1;
	}

	@OriginalMember(owner = "client!abt", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (arg0 == null || !(arg0 instanceof Class44)) {
			return false;
		}
		@Pc(9) Class44 local9 = (Class44) arg0;
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

	@OriginalMember(owner = "client!abt", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return this.anObject1 + ", " + this.anObject2;
	}

	@OriginalMember(owner = "client!abt", name = "rm", descriptor = "()I")
	public int method932() {
		@Pc(1) int local1 = 0;
		if (this.anObject1 != null) {
			local1 += this.anObject1.hashCode();
		}
		if (this.anObject2 != null) {
			local1 += this.anObject2.hashCode() * 31;
		}
		return local1;
	}

	@OriginalMember(owner = "client!abt", name = "hashCode", descriptor = "()I")
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

	@OriginalMember(owner = "client!abt", name = "rn", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method933(@OriginalArg(0) Object arg0) {
		if (arg0 == null || !(arg0 instanceof Class44)) {
			return false;
		}
		@Pc(9) Class44 local9 = (Class44) arg0;
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

	@OriginalMember(owner = "client!abt", name = "rs", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method934(@OriginalArg(0) Object arg0) {
		if (arg0 == null || !(arg0 instanceof Class44)) {
			return false;
		}
		@Pc(9) Class44 local9 = (Class44) arg0;
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

	@OriginalMember(owner = "client!abt", name = "rx", descriptor = "()Ljava/lang/String;")
	public String method935() {
		return this.anObject1 + ", " + this.anObject2;
	}

	@OriginalMember(owner = "client!abt", name = "ri", descriptor = "()Ljava/lang/String;")
	public String method936() {
		return this.anObject1 + ", " + this.anObject2;
	}
}
