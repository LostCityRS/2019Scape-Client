package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!agx")
public final class Class110_Sub22 extends Class110 {

	@OriginalMember(owner = "client!agx", name = "n", descriptor = "J")
	final long aLong31;

	@OriginalMember(owner = "client!agx", name = "m", descriptor = "I")
	final int anInt994;

	@OriginalMember(owner = "client!agx", name = "<init>", descriptor = "(Lclient!alw;Z)V")
	Class110_Sub22(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) boolean arg1) {
		super(arg0);
		@Pc(6) int local6 = arg0.method22427(-1434290800);
		if (arg1) {
			this.aLong31 = ((long) local6 | 0x100000000L) * 8573495380564488061L;
		} else {
			this.aLong31 = (long) local6 * 8573495380564488061L;
		}
		this.anInt994 = arg0.method22431(-118643075) * 1601868325;
	}

	@OriginalMember(owner = "client!agx", name = "f", descriptor = "()V")
	@Override
	public void method20152() {
		@Pc(7) Class93_Sub14 local7 = (Class93_Sub14) Class249.aClass16_24.method215(this.aLong31 * 6175084791180394965L);
		if (local7 == null) {
			Class249.aClass16_24.method221(new Class93_Sub14(this.anInt994 * 147667373), this.aLong31 * 6175084791180394965L);
		} else {
			local7.anInt1526 = this.anInt994 * -1560270585;
		}
	}

	@OriginalMember(owner = "client!agx", name = "n", descriptor = "(I)V")
	@Override
	public void method20150(@OriginalArg(0) int arg0) {
		@Pc(7) Class93_Sub14 local7 = (Class93_Sub14) Class249.aClass16_24.method215(this.aLong31 * 6175084791180394965L);
		if (local7 == null) {
			Class249.aClass16_24.method221(new Class93_Sub14(this.anInt994 * 147667373), this.aLong31 * 6175084791180394965L);
		} else {
			local7.anInt1526 = this.anInt994 * -1560270585;
		}
	}
}
