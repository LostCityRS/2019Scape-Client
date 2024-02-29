package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!atd")
public final class Class93_Sub1_Sub17_Sub1 extends Class93_Sub1_Sub17 {

	@OriginalMember(owner = "client!atd", name = "d", descriptor = "F")
	float aFloat230;

	@OriginalMember(owner = "client!atd", name = "u", descriptor = "Lclient!iu;")
	Class349 aClass349_1;

	@OriginalMember(owner = "client!atd", name = "z", descriptor = "F")
	float aFloat232;

	@OriginalMember(owner = "client!atd", name = "p", descriptor = "F")
	float aFloat231;

	@OriginalMember(owner = "client!atd", name = "<init>", descriptor = "(ILclient!alw;)V")
	Class93_Sub1_Sub17_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub41 arg1) {
		super(arg0);
		this.aClass349_1 = Class102.method2587(arg1.method22425((short) 16384), -1837196080);
		this.aFloat232 = arg1.method22437(-1158908159);
		this.aFloat231 = arg1.method22437(-1080326059);
	}

	@OriginalMember(owner = "client!atd", name = "<init>", descriptor = "(ILclient!iu;FF)V")
	public Class93_Sub1_Sub17_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class349 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		super(arg0);
		this.aClass349_1 = arg1;
		this.aFloat232 = arg2;
		this.aFloat231 = arg3;
	}

	@OriginalMember(owner = "client!atd", name = "m", descriptor = "(Lclient!ju;Lclient!ou;Lclient!pq;I)V")
	@Override
	public void method23513(@OriginalArg(0) Class368 arg0, @OriginalArg(1) Class470 arg1, @OriginalArg(2) Class489 arg2, @OriginalArg(3) int arg3) {
		@Pc(5) float local5 = (float) Math.sin((double) this.aFloat230);
		@Pc(10) float local10 = this.aFloat232 * local5;
		if (this.aClass349_1 == Class349.aClass349_7) {
			arg0.anInt4747 = (int) ((float) (arg0.anInt4747 * -1774271657) + local10) * -255666073;
			arg1.method29568(local10, 0.0F, 0.0F);
		} else if (Class349.aClass349_3 == this.aClass349_1) {
			arg0.anInt4748 = (int) ((float) (arg0.anInt4748 * -754001767) + local10) * -543294551;
			arg1.method29568(0.0F, local10, 0.0F);
		} else if (Class349.aClass349_2 == this.aClass349_1) {
			arg0.anInt4749 = (int) ((float) (arg0.anInt4749 * 1179660263) + local10) * -513444905;
			arg1.method29568(0.0F, 0.0F, local10);
		} else if (this.aClass349_1 == Class349.aClass349_4) {
			arg1.method29560(1.0F, 0.0F, 0.0F, local10);
		} else if (this.aClass349_1 == Class349.aClass349_5) {
			arg1.method29560(0.0F, 1.0F, 0.0F, local10);
		} else if (Class349.aClass349_6 == this.aClass349_1) {
			arg1.method29560(0.0F, 0.0F, 1.0F, local10);
		}
	}

	@OriginalMember(owner = "client!atd", name = "n", descriptor = "(FI)V")
	@Override
	public void method23504(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1) {
		this.aFloat230 += this.aFloat231 * arg0;
	}

	@OriginalMember(owner = "client!atd", name = "z", descriptor = "(Lclient!ju;Lclient!ou;Lclient!pq;)V")
	@Override
	public void method23512(@OriginalArg(0) Class368 arg0, @OriginalArg(1) Class470 arg1, @OriginalArg(2) Class489 arg2) {
		@Pc(5) float local5 = (float) Math.sin((double) this.aFloat230);
		@Pc(10) float local10 = this.aFloat232 * local5;
		if (this.aClass349_1 == Class349.aClass349_7) {
			arg0.anInt4747 = (int) ((float) (arg0.anInt4747 * -1774271657) + local10) * -255666073;
			arg1.method29568(local10, 0.0F, 0.0F);
		} else if (Class349.aClass349_3 == this.aClass349_1) {
			arg0.anInt4748 = (int) ((float) (arg0.anInt4748 * -754001767) + local10) * -543294551;
			arg1.method29568(0.0F, local10, 0.0F);
		} else if (Class349.aClass349_2 == this.aClass349_1) {
			arg0.anInt4749 = (int) ((float) (arg0.anInt4749 * 1179660263) + local10) * -513444905;
			arg1.method29568(0.0F, 0.0F, local10);
		} else if (this.aClass349_1 == Class349.aClass349_4) {
			arg1.method29560(1.0F, 0.0F, 0.0F, local10);
		} else if (this.aClass349_1 == Class349.aClass349_5) {
			arg1.method29560(0.0F, 1.0F, 0.0F, local10);
		} else if (Class349.aClass349_6 == this.aClass349_1) {
			arg1.method29560(0.0F, 0.0F, 1.0F, local10);
		}
	}

	@OriginalMember(owner = "client!atd", name = "k", descriptor = "(Lclient!alw;I)V")
	@Override
	public void method23507(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		this.aClass349_1 = Class102.method2587(arg0.method22425((short) 16384), 1309578759);
		this.aFloat232 = arg0.method22437(2039470482);
		this.aFloat231 = arg0.method22437(601987057);
	}

	@OriginalMember(owner = "client!atd", name = "f", descriptor = "(F)V")
	@Override
	public void method23508(@OriginalArg(0) float arg0) {
		this.aFloat230 += this.aFloat231 * arg0;
	}

	@OriginalMember(owner = "client!atd", name = "w", descriptor = "(F)V")
	@Override
	public void method23509(@OriginalArg(0) float arg0) {
		this.aFloat230 += this.aFloat231 * arg0;
	}

	@OriginalMember(owner = "client!atd", name = "l", descriptor = "(F)V")
	@Override
	public void method23510(@OriginalArg(0) float arg0) {
		this.aFloat230 += this.aFloat231 * arg0;
	}

	@OriginalMember(owner = "client!atd", name = "d", descriptor = "(Lclient!alw;)V")
	@Override
	public void method23514(@OriginalArg(0) Class93_Sub41 arg0) {
		this.aClass349_1 = Class102.method2587(arg0.method22425((short) 16384), -793354180);
		this.aFloat232 = arg0.method22437(-1802420104);
		this.aFloat231 = arg0.method22437(1757158791);
	}

	@OriginalMember(owner = "client!atd", name = "p", descriptor = "(Lclient!ju;Lclient!ou;Lclient!pq;)V")
	@Override
	public void method23511(@OriginalArg(0) Class368 arg0, @OriginalArg(1) Class470 arg1, @OriginalArg(2) Class489 arg2) {
		@Pc(5) float local5 = (float) Math.sin((double) this.aFloat230);
		@Pc(10) float local10 = this.aFloat232 * local5;
		if (this.aClass349_1 == Class349.aClass349_7) {
			arg0.anInt4747 = (int) ((float) (arg0.anInt4747 * -1774271657) + local10) * -255666073;
			arg1.method29568(local10, 0.0F, 0.0F);
		} else if (Class349.aClass349_3 == this.aClass349_1) {
			arg0.anInt4748 = (int) ((float) (arg0.anInt4748 * -754001767) + local10) * -543294551;
			arg1.method29568(0.0F, local10, 0.0F);
		} else if (Class349.aClass349_2 == this.aClass349_1) {
			arg0.anInt4749 = (int) ((float) (arg0.anInt4749 * 1179660263) + local10) * -513444905;
			arg1.method29568(0.0F, 0.0F, local10);
		} else if (this.aClass349_1 == Class349.aClass349_4) {
			arg1.method29560(1.0F, 0.0F, 0.0F, local10);
		} else if (this.aClass349_1 == Class349.aClass349_5) {
			arg1.method29560(0.0F, 1.0F, 0.0F, local10);
		} else if (Class349.aClass349_6 == this.aClass349_1) {
			arg1.method29560(0.0F, 0.0F, 1.0F, local10);
		}
	}

	@OriginalMember(owner = "client!atd", name = "u", descriptor = "(Lclient!ju;Lclient!ou;Lclient!pq;)V")
	@Override
	public void method23505(@OriginalArg(0) Class368 arg0, @OriginalArg(1) Class470 arg1, @OriginalArg(2) Class489 arg2) {
		@Pc(5) float local5 = (float) Math.sin((double) this.aFloat230);
		@Pc(10) float local10 = this.aFloat232 * local5;
		if (this.aClass349_1 == Class349.aClass349_7) {
			arg0.anInt4747 = (int) ((float) (arg0.anInt4747 * -1774271657) + local10) * -255666073;
			arg1.method29568(local10, 0.0F, 0.0F);
		} else if (Class349.aClass349_3 == this.aClass349_1) {
			arg0.anInt4748 = (int) ((float) (arg0.anInt4748 * -754001767) + local10) * -543294551;
			arg1.method29568(0.0F, local10, 0.0F);
		} else if (Class349.aClass349_2 == this.aClass349_1) {
			arg0.anInt4749 = (int) ((float) (arg0.anInt4749 * 1179660263) + local10) * -513444905;
			arg1.method29568(0.0F, 0.0F, local10);
		} else if (this.aClass349_1 == Class349.aClass349_4) {
			arg1.method29560(1.0F, 0.0F, 0.0F, local10);
		} else if (this.aClass349_1 == Class349.aClass349_5) {
			arg1.method29560(0.0F, 1.0F, 0.0F, local10);
		} else if (Class349.aClass349_6 == this.aClass349_1) {
			arg1.method29560(0.0F, 0.0F, 1.0F, local10);
		}
	}
}
