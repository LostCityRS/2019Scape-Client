package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!agl")
public final class Class103_Sub15 extends Class103 {

	@OriginalMember(owner = "client!agl", name = "ax", descriptor = "I")
	static int anInt970;

	@OriginalMember(owner = "client!agl", name = "f", descriptor = "I")
	final int anInt969;

	@OriginalMember(owner = "client!agl", name = "e", descriptor = "I")
	final int anInt967;

	@OriginalMember(owner = "client!agl", name = "u", descriptor = "I")
	final int anInt968;

	@OriginalMember(owner = "client!agl", name = "l", descriptor = "I")
	final int anInt966;

	@OriginalMember(owner = "client!agl", name = "g", descriptor = "Lclient!rh;")
	Class529 aClass529_2;

	@OriginalMember(owner = "client!agl", name = "awk", descriptor = "(Lclient!yp;I)V")
	static void method8227(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		if (client.anInt3433 * 1994758437 == 13) {
			Class47.aBoolean29 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581] == 1;
		}
	}

	@OriginalMember(owner = "client!agl", name = "<init>", descriptor = "(Lclient!ald;)V")
	Class103_Sub15(@OriginalArg(0) Class80_Sub36 arg0) {
		super(arg0);
		this.anInt969 = arg0.method23178((byte) -75) * -895742535;
		this.anInt967 = arg0.method23362(-760184940) * -900566719;
		this.anInt968 = arg0.method23362(343828471) * 1240601289;
		this.anInt966 = arg0.method23362(-978592854) * 1405346305;
		this.aClass529_2 = Class490.aClass263_13.method26536(Class280.aClass280_9, this, this.anInt969 * 620095625, this.anInt966 * 935337473, this.anInt967 * -153936191, Class278.aClass278_5.method26831(1944621597), Class269.aClass269_5, 0.0F, 0.0F, null, 0, this.anInt968 * 95725433, false, -129037277);
		if (this.aClass529_2 != null) {
			this.aClass529_2.method30768((byte) 49);
		}
	}

	@OriginalMember(owner = "client!agl", name = "f", descriptor = "(I)V")
	@Override
	public void method19206(@OriginalArg(0) int arg0) {
		if (this.aClass529_2 != null) {
			this.aClass529_2.method30726(-1315078515);
		}
	}

	@OriginalMember(owner = "client!agl", name = "e", descriptor = "(I)V")
	@Override
	void method19200(@OriginalArg(0) int arg0) {
		if (this.aClass529_2 != null) {
			this.aClass529_2.method30788(50, -1925336586);
			Class490.aClass263_13.method26582(this.aClass529_2, (byte) -26);
			this.aClass529_2 = null;
		}
	}

	@OriginalMember(owner = "client!agl", name = "l", descriptor = "()V")
	@Override
	public void method19198() {
		if (this.aClass529_2 != null) {
			this.aClass529_2.method30726(-1042037346);
		}
	}

	@OriginalMember(owner = "client!agl", name = "g", descriptor = "()V")
	@Override
	public void method19202() {
		if (this.aClass529_2 != null) {
			this.aClass529_2.method30726(-1569394944);
		}
	}

	@OriginalMember(owner = "client!agl", name = "j", descriptor = "()V")
	@Override
	void method19203() {
		if (this.aClass529_2 != null) {
			this.aClass529_2.method30788(50, -1607267191);
			Class490.aClass263_13.method26582(this.aClass529_2, (byte) 11);
			this.aClass529_2 = null;
		}
	}
}
