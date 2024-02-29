package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bz")
public final class Class199 {

	@OriginalMember(owner = "client!bz", name = "n", descriptor = "I")
	static final int anInt3371 = 128;

	@OriginalMember(owner = "client!bz", name = "k", descriptor = "I")
	static final int anInt3372 = 16;

	@OriginalMember(owner = "client!bz", name = "c", descriptor = "Ljava/lang/Object;")
	static Object anObject10;

	@OriginalMember(owner = "client!bz", name = "e", descriptor = "I")
	static final int anInt3373 = 4000;

	@OriginalMember(owner = "client!bz", name = "d", descriptor = "Ljava/lang/Object;")
	static Object anObject11;

	@OriginalMember(owner = "client!bz", name = "m", descriptor = "I")
	static final int anInt3374 = 128;

	@OriginalMember(owner = "client!bz", name = "r", descriptor = "Ljava/lang/Object;")
	static Object anObject12;

	@OriginalMember(owner = "client!bz", name = "w", descriptor = "[Lclient!adt;")
	Class88_Sub2[] aClass88_Sub2Array2 = null;

	@OriginalMember(owner = "client!bz", name = "l", descriptor = "Lclient!adu;")
	Class88_Sub3 aClass88_Sub3_2 = null;

	@OriginalMember(owner = "client!bz", name = "u", descriptor = "[Lclient!adt;")
	Class88_Sub2[] aClass88_Sub2Array3 = null;

	@OriginalMember(owner = "client!bz", name = "z", descriptor = "Lclient!adu;")
	Class88_Sub3 aClass88_Sub3_3 = null;

	@OriginalMember(owner = "client!bz", name = "p", descriptor = "Lclient!adu;")
	Class88_Sub3 aClass88_Sub3_1 = null;

	@OriginalMember(owner = "client!bz", name = "f", descriptor = "Z")
	boolean aBoolean579;

	@OriginalMember(owner = "client!bz", name = "e", descriptor = "(Lclient!afa;)V")
	static void method24638(@OriginalArg(0) Class104_Sub1 arg0) {
		@Pc(11) byte[] local11;
		if (anObject11 == null) {
			@Pc(5) Class140_Sub1_Sub1 local5 = new Class140_Sub1_Sub1();
			local11 = local5.method20271(128, 128, 16);
			anObject11 = Class113.method7411(local11, false, 1215292027);
		}
		if (anObject10 == null) {
			@Pc(22) Class140_Sub2_Sub1 local22 = new Class140_Sub2_Sub1();
			local11 = local22.method20303(128, 128, 16);
			anObject10 = Class113.method7411(local11, false, 1215292027);
		}
		@Pc(36) Class209 local36 = arg0.aClass209_1;
		if (local36.method25499() && anObject12 == null) {
			local11 = Class571.method31505(128, 128, 16, 8, new Class161_Sub1(419684), 4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
			anObject12 = Class113.method7411(local11, false, 1215292027);
		}
	}

	@OriginalMember(owner = "client!bz", name = "m", descriptor = "(Lclient!afa;)V")
	static void method24639(@OriginalArg(0) Class104_Sub1 arg0) {
		@Pc(11) byte[] local11;
		if (anObject11 == null) {
			@Pc(5) Class140_Sub1_Sub1 local5 = new Class140_Sub1_Sub1();
			local11 = local5.method20271(128, 128, 16);
			anObject11 = Class113.method7411(local11, false, 1215292027);
		}
		if (anObject10 == null) {
			@Pc(22) Class140_Sub2_Sub1 local22 = new Class140_Sub2_Sub1();
			local11 = local22.method20303(128, 128, 16);
			anObject10 = Class113.method7411(local11, false, 1215292027);
		}
		@Pc(36) Class209 local36 = arg0.aClass209_1;
		if (local36.method25499() && anObject12 == null) {
			local11 = Class571.method31505(128, 128, 16, 8, new Class161_Sub1(419684), 4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
			anObject12 = Class113.method7411(local11, false, 1215292027);
		}
	}

	@OriginalMember(owner = "client!bz", name = "n", descriptor = "(Lclient!afa;)V")
	static void method24640(@OriginalArg(0) Class104_Sub1 arg0) {
		@Pc(11) byte[] local11;
		if (anObject11 == null) {
			@Pc(5) Class140_Sub1_Sub1 local5 = new Class140_Sub1_Sub1();
			local11 = local5.method20271(128, 128, 16);
			anObject11 = Class113.method7411(local11, false, 1215292027);
		}
		if (anObject10 == null) {
			@Pc(22) Class140_Sub2_Sub1 local22 = new Class140_Sub2_Sub1();
			local11 = local22.method20303(128, 128, 16);
			anObject10 = Class113.method7411(local11, false, 1215292027);
		}
		@Pc(36) Class209 local36 = arg0.aClass209_1;
		if (local36.method25499() && anObject12 == null) {
			local11 = Class571.method31505(128, 128, 16, 8, new Class161_Sub1(419684), 4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
			anObject12 = Class113.method7411(local11, false, 1215292027);
		}
	}

	@OriginalMember(owner = "client!bz", name = "<init>", descriptor = "(Lclient!afa;)V")
	Class199(@OriginalArg(0) Class104_Sub1 arg0) {
		this.aBoolean579 = arg0.aBoolean75;
		method24638(arg0);
		if (this.aBoolean579) {
			@Pc(103) byte[] local103 = Class331.method27479(anObject11, false, 479524276);
			this.aClass88_Sub3_2 = new Class88_Sub3(arg0, Class206.aClass206_21, Class226.aClass226_22, 128, 128, 16, local103, Class206.aClass206_21);
			@Pc(121) byte[] local121 = Class331.method27479(anObject10, false, -207172829);
			this.aClass88_Sub3_3 = new Class88_Sub3(arg0, Class206.aClass206_21, Class226.aClass226_22, 128, 128, 16, local121, Class206.aClass206_21);
			@Pc(137) Class209 local137 = arg0.aClass209_1;
			if (local137.method25499()) {
				local103 = Class331.method27479(anObject12, false, -1609051994);
				this.aClass88_Sub3_1 = new Class88_Sub3(arg0, Class206.aClass206_22, Class226.aClass226_22, 128, 128, 16);
				@Pc(168) Class88_Sub3 local168 = new Class88_Sub3(arg0, Class206.aClass206_24, Class226.aClass226_22, 128, 128, 16, local103, Class206.aClass206_24);
				if (local137.method25498(this.aClass88_Sub3_1, local168, 2.0F)) {
					this.aClass88_Sub3_1.method18055();
				} else {
					this.aClass88_Sub3_1.method18058();
					this.aClass88_Sub3_1 = null;
				}
				local168.method18058();
			}
		} else {
			this.aClass88_Sub2Array2 = new Class88_Sub2[16];
			@Pc(31) int local31;
			@Pc(42) byte[] local42;
			for (local31 = 0; local31 < 16; local31++) {
				local42 = SortedQueueEntry.method29037(anObject11, local31 * 32768, 32768, 1048575);
				this.aClass88_Sub2Array2[local31] = new Class88_Sub2(arg0, 3553, Class206.aClass206_21, Class226.aClass226_22, 128, 128, true, local42, Class206.aClass206_21, false);
			}
			this.aClass88_Sub2Array3 = new Class88_Sub2[16];
			for (local31 = 0; local31 < 16; local31++) {
				local42 = SortedQueueEntry.method29037(anObject10, local31 * 32768, 32768, 1048575);
				this.aClass88_Sub2Array3[local31] = new Class88_Sub2(arg0, 3553, Class206.aClass206_21, Class226.aClass226_22, 128, 128, true, local42, Class206.aClass206_21, false);
			}
		}
	}
}
