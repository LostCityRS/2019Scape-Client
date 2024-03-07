package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!zx")
public class Class721 implements Interface75 {

	@OriginalMember(owner = "client!zx", name = "e", descriptor = "Lclient!zx;")
	public static final Class721 aClass721_2 = new Class721(-2);

	@OriginalMember(owner = "client!zx", name = "n", descriptor = "Lclient!zx;")
	public static final Class721 aClass721_5 = new Class721(-3);

	@OriginalMember(owner = "client!zx", name = "m", descriptor = "Lclient!zx;")
	static final Class721 aClass721_4 = new Class721(2);

	@OriginalMember(owner = "client!zx", name = "k", descriptor = "Lclient!zx;")
	public static final Class721 aClass721_7 = new Class721(3);

	@OriginalMember(owner = "client!zx", name = "f", descriptor = "Lclient!zx;")
	static final Class721 aClass721_6 = new Class721(21);

	@OriginalMember(owner = "client!zx", name = "w", descriptor = "Lclient!zx;")
	static final Class721 aClass721_3 = new Class721(20);

	@OriginalMember(owner = "client!zx", name = "l", descriptor = "I")
	final int anInt5965;

	@OriginalMember(owner = "client!zx", name = "<init>", descriptor = "(I)V", line = 20)
	Class721(@OriginalArg(0) int arg0) {
		this.anInt5965 = arg0 * 361621603;
	}

	@OriginalMember(owner = "client!zx", name = "k", descriptor = "()I", line = 25)
	@Override
	public int method36919() {
		return this.anInt5965 * -2128881333;
	}

	@OriginalMember(owner = "client!zx", name = "n", descriptor = "()I", line = 25)
	@Override
	public int getId() {
		return this.anInt5965 * -2128881333;
	}

	@OriginalMember(owner = "client!zx", name = "gb", descriptor = "(Lclient!ahm;B)I", line = 4080)
	static final int method36921(@OriginalArg(0) Class132_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) byte arg1) {
		if (arg0.anInt2788 * -846020455 == 0) {
			return 0;
		}
		@Pc(71) int local71;
		@Pc(63) Class472 local63;
		if (arg0.anInt2772 * -583289569 != -1) {
			@Pc(15) Class132_Sub1_Sub1_Sub1 local15 = null;
			if (arg0.anInt2772 * -583289569 < 32768) {
				@Pc(30) Class93_Sub15 local30 = (Class93_Sub15) client.aClass16_18.method214((long) (arg0.anInt2772 * -583289569));
				if (local30 != null) {
					local15 = (Class132_Sub1_Sub1_Sub1) local30.anObject5;
				}
			} else if (arg0.anInt2772 * -583289569 >= 32768) {
				local15 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[arg0.anInt2772 * -583289569 - 32768];
			}
			if (local15 != null) {
				local63 = Class472.method29579(arg0.method24220().aClass472_61, local15.method24220().aClass472_61);
				@Pc(67) int local67 = (int) local63.aFloat317;
				local71 = (int) local63.aFloat319;
				if (local67 != 0 || local71 != 0) {
					arg0.method19951((int) (Math.atan2((double) local67, (double) local71) * 2607.5945876176133D) & 0x3FFF, (byte) 111);
				}
			}
		}
		if (arg0 instanceof Class132_Sub1_Sub1_Sub1_Sub2) {
			@Pc(95) Class132_Sub1_Sub1_Sub1_Sub2 local95 = (Class132_Sub1_Sub1_Sub1_Sub2) arg0;
			if (local95.anInt2799 * 1643784853 != -1 && (local95.anInt2763 * -846948133 == 0 || local95.anInt2791 * 938318279 > 0)) {
				local95.method19951(local95.anInt2799 * 1643784853, (byte) 118);
				local95.anInt2799 = -1224757437;
			}
		} else if (arg0 instanceof Class132_Sub1_Sub1_Sub1_Sub1) {
			@Pc(129) Class132_Sub1_Sub1_Sub1_Sub1 local129 = (Class132_Sub1_Sub1_Sub1_Sub1) arg0;
			if (local129.anInt2642 * 310344423 != -1 && (local129.anInt2763 * -846948133 == 0 || local129.anInt2791 * 938318279 > 0)) {
				local63 = local129.method24220().aClass472_61;
				@Pc(154) Class611 local154 = client.world.method30455(2005556280);
				local71 = (int) local63.aFloat317 - (local129.anInt2642 * 2138760960 - local154.anInt5623 * 557113600 - local154.anInt5623 * 557113600);
				@Pc(192) int local192 = (int) local63.aFloat319 - (local129.anInt2643 * -1914292992 - local154.anInt5624 * 558353664 - local154.anInt5624 * 558353664);
				if (local71 != 0 || local192 != 0) {
					local129.method19951((int) (Math.atan2((double) local71, (double) local192) * 2607.5945876176133D) & 0x3FFF, (byte) 79);
				}
				local129.anInt2642 = -757135575;
			}
		}
		return arg0.method19956(-2027137981);
	}
}
