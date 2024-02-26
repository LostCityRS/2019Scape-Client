package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xy")
public final class Class674 implements Interface11 {

	@OriginalMember(owner = "client!xy", name = "e", descriptor = "I")
	public int anInt5733;

	@OriginalMember(owner = "client!xy", name = "f", descriptor = "I")
	int anInt5734;

	@OriginalMember(owner = "client!xy", name = "u", descriptor = "I")
	public int anInt5735;

	@OriginalMember(owner = "client!xy", name = "t", descriptor = "Lclient!xq;")
	final Class154 aClass154_1;

	@OriginalMember(owner = "client!xy", name = "xu", descriptor = "(Lclient!yp;I)V")
	static void method33582(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class667.method33473(local13, local23, true, 339591468);
	}

	@OriginalMember(owner = "client!xy", name = "auu", descriptor = "(Lclient!yp;I)V")
	static void method33583(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class703.aClass80_Sub37_49.aClass165_Sub27_5.method16402((byte) 57);
	}

	@OriginalMember(owner = "client!xy", name = "go", descriptor = "(Lclient!yp;I)V")
	static void method33584(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2089904231);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class103_Sub3.method7212(local16, local22, arg0, -1498017354);
	}

	@OriginalMember(owner = "client!xy", name = "<init>", descriptor = "(ILclient!xq;)V")
	Class674(@OriginalArg(0) int arg0, @OriginalArg(1) Class154 arg1) {
		this.aClass154_1 = arg1;
	}

	@OriginalMember(owner = "client!xy", name = "l", descriptor = "(Lclient!ald;II)V")
	void method33575(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 1) {
			this.anInt5734 = arg0.gSmart2or4null() * 1946994937;
		} else if (arg1 == 2) {
			this.anInt5733 = arg0.g1() * -38307391;
			this.anInt5735 = arg0.g1() * 1249811753;
		}
	}

	@OriginalMember(owner = "client!xy", name = "a", descriptor = "()Lclient!da;")
	public synchronized Class109 method33576() {
		@Pc(10) Class109 local10 = (Class109) this.aClass154_1.aClass243_24.method26282((long) (this.anInt5734 * 344291657));
		if (local10 != null) {
			return local10;
		}
		local10 = Class212.method25822(this.aClass154_1.aClass480_39, this.anInt5734 * 344291657, 0);
		if (local10 != null) {
			this.aClass154_1.aClass243_24.method26253(local10, (long) (this.anInt5734 * 344291657));
		}
		return local10;
	}

	@OriginalMember(owner = "client!xy", name = "g", descriptor = "(I)Lclient!da;")
	public synchronized Class109 method33577(@OriginalArg(0) int arg0) {
		@Pc(10) Class109 local10 = (Class109) this.aClass154_1.aClass243_24.method26282((long) (this.anInt5734 * 344291657));
		if (local10 != null) {
			return local10;
		}
		local10 = Class212.method25822(this.aClass154_1.aClass480_39, this.anInt5734 * 344291657, 0);
		if (local10 != null) {
			this.aClass154_1.aClass243_24.method26253(local10, (long) (this.anInt5734 * 344291657));
		}
		return local10;
	}

	@OriginalMember(owner = "client!xy", name = "o", descriptor = "(Lclient!ald;I)V")
	void method33578(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5734 = arg0.gSmart2or4null() * 1946994937;
		} else if (arg1 == 2) {
			this.anInt5733 = arg0.g1() * -38307391;
			this.anInt5735 = arg0.g1() * 1249811753;
		}
	}

	@OriginalMember(owner = "client!xy", name = "e", descriptor = "()V")
	@Override
	public void method37008() {
	}

	@OriginalMember(owner = "client!xy", name = "u", descriptor = "(Lclient!ald;)V")
	@Override
	public void method37009(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.g1();
			if (local3 == 0) {
				return;
			}
			this.method33575(arg0, local3, 688832605);
		}
	}

	@OriginalMember(owner = "client!xy", name = "i", descriptor = "(Lclient!ald;I)V")
	void method33579(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5734 = arg0.gSmart2or4null() * 1946994937;
		} else if (arg1 == 2) {
			this.anInt5733 = arg0.g1() * -38307391;
			this.anInt5735 = arg0.g1() * 1249811753;
		}
	}

	@OriginalMember(owner = "client!xy", name = "m", descriptor = "(Lclient!ald;I)V")
	void method33580(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5734 = arg0.gSmart2or4null() * 1946994937;
		} else if (arg1 == 2) {
			this.anInt5733 = arg0.g1() * -38307391;
			this.anInt5735 = arg0.g1() * 1249811753;
		}
	}

	@OriginalMember(owner = "client!xy", name = "t", descriptor = "(Lclient!ald;I)V")
	@Override
	public void method37006(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.g1();
			if (local3 == 0) {
				return;
			}
			this.method33575(arg0, local3, -2090837648);
		}
	}

	@OriginalMember(owner = "client!xy", name = "f", descriptor = "(B)V")
	@Override
	public void method37007(@OriginalArg(0) byte arg0) {
	}

	@OriginalMember(owner = "client!xy", name = "j", descriptor = "(Lclient!ald;I)V")
	void method33581(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5734 = arg0.gSmart2or4null() * 1946994937;
		} else if (arg1 == 2) {
			this.anInt5733 = arg0.g1() * -38307391;
			this.anInt5735 = arg0.g1() * 1249811753;
		}
	}
}
