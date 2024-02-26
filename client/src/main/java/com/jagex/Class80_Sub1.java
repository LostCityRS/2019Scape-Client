package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!akw")
public class Class80_Sub1 extends Class80 {

	@OriginalMember(owner = "client!akw", name = "g", descriptor = "Lclient!akw;")
	public Class80_Sub1 aClass80_Sub1_67;

	@OriginalMember(owner = "client!akw", name = "l", descriptor = "Lclient!akw;")
	public Class80_Sub1 aClass80_Sub1_68;

	@OriginalMember(owner = "client!akw", name = "u", descriptor = "J")
	public long aLong340;

	@OriginalMember(owner = "client!akw", name = "b", descriptor = "()V")
	public final void method24405() {
		if (this.aClass80_Sub1_67 != null) {
			this.aClass80_Sub1_67.aClass80_Sub1_68 = this.aClass80_Sub1_68;
			this.aClass80_Sub1_68.aClass80_Sub1_67 = this.aClass80_Sub1_67;
			this.aClass80_Sub1_68 = null;
			this.aClass80_Sub1_67 = null;
		}
	}

	@OriginalMember(owner = "client!akw", name = "c", descriptor = "(I)V")
	public final void method24406(@OriginalArg(0) int arg0) {
		if (this.aClass80_Sub1_67 != null) {
			this.aClass80_Sub1_67.aClass80_Sub1_68 = this.aClass80_Sub1_68;
			this.aClass80_Sub1_68.aClass80_Sub1_67 = this.aClass80_Sub1_67;
			this.aClass80_Sub1_68 = null;
			this.aClass80_Sub1_67 = null;
		}
	}
}
