package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!agu")
public class Class110_Sub19 extends Class110 {

	@OriginalMember(owner = "client!agu", name = "n", descriptor = "I")
	final int anInt984;

	@OriginalMember(owner = "client!agu", name = "m", descriptor = "I")
	final int anInt985;

	@OriginalMember(owner = "client!agu", name = "k", descriptor = "I")
	final int anInt986;

	@OriginalMember(owner = "client!agu", name = "f", descriptor = "I")
	final int anInt987;

	@OriginalMember(owner = "client!agu", name = "w", descriptor = "Lclient!rw;")
	Class539 aClass539_1;

	@OriginalMember(owner = "client!agu", name = "<init>", descriptor = "(Lclient!alw;)V", line = 18)
	Class110_Sub19(@OriginalArg(0) Class93_Sub41 arg0) {
		super(arg0);
		this.anInt984 = arg0.method22472(-1434290800) * 315047603;
		this.anInt985 = arg0.method22465((short) 16384) * -1372698155;
		this.anInt986 = arg0.method22465((short) 16384) * 757590547;
		this.anInt987 = arg0.method22465((short) 16384) * 1568885987;
		this.aClass539_1 = Class274.aClass258_1.method26097(Class275.aClass275_9, this, this.anInt984 * 1796710523, this.anInt987 * -1912842037, this.anInt985 * 2118952829, Class280.aClass280_7.method26450(-736590218), Class278.aClass278_2, 0.0F, 0.0F, null, 0, this.anInt986 * -866750437, false, -326087739);
		if (this.aClass539_1 != null) {
			this.aClass539_1.method30797(-1386242522);
		}
	}

	@OriginalMember(owner = "client!agu", name = "f", descriptor = "()V", line = 30)
	@Override
	public void method20150() {
		if (this.aClass539_1 != null) {
			this.aClass539_1.method30802(-681730823);
		}
	}

	@OriginalMember(owner = "client!agu", name = "n", descriptor = "(I)V", line = 30)
	@Override
	public void method20149(@OriginalArg(0) int arg0) {
		if (this.aClass539_1 != null) {
			this.aClass539_1.method30802(-1987665584);
		}
	}

	@OriginalMember(owner = "client!agu", name = "m", descriptor = "(I)V", line = 36)
	@Override
	void method20140(@OriginalArg(0) int arg0) {
		if (this.aClass539_1 != null) {
			this.aClass539_1.method30803(50, (byte) -104);
			Class274.aClass258_1.method26088(this.aClass539_1, 1864134024);
			this.aClass539_1 = null;
		}
	}

	@OriginalMember(owner = "client!agu", name = "u", descriptor = "()V", line = 36)
	@Override
	void method20139() {
		if (this.aClass539_1 != null) {
			this.aClass539_1.method30803(50, (byte) -18);
			Class274.aClass258_1.method26088(this.aClass539_1, 1734959958);
			this.aClass539_1 = null;
		}
	}

	@OriginalMember(owner = "client!agu", name = "dy", descriptor = "(Lclient!yf;B)V", line = 5623)
	static final void method8513(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, 1036688524);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class222.method25582(local16, local22, arg0, (short) 24683);
	}

	@OriginalMember(owner = "client!agu", name = "kb", descriptor = "(Lclient!yf;I)V", line = 6824)
	static final void method8514(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, 1775525253);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class35.method687(local16, local22, arg0, (short) 29406);
	}

	@OriginalMember(owner = "client!agu", name = "aiv", descriptor = "(Lclient!yf;I)V", line = 11390)
	static final void method8515(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt5888 -= 957530791) * 587908375];
		@Pc(31) boolean local31 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091] == 1;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class325.method27303(local13, local31, (byte) -71);
	}
}
