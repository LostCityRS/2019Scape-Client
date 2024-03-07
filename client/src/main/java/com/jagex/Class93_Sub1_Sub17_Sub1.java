package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!atd")
public class Class93_Sub1_Sub17_Sub1 extends Class93_Sub1_Sub17 {

	@OriginalMember(owner = "client!atd", name = "d", descriptor = "F")
	float aFloat230;

	@OriginalMember(owner = "client!atd", name = "u", descriptor = "Lclient!iu;")
	Class349 aClass349_1;

	@OriginalMember(owner = "client!atd", name = "z", descriptor = "F")
	float aFloat232;

	@OriginalMember(owner = "client!atd", name = "p", descriptor = "F")
	float aFloat231;

	@OriginalMember(owner = "client!atd", name = "<init>", descriptor = "(ILclient!iu;FF)V", line = 15)
	public Class93_Sub1_Sub17_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class349 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		super(arg0);
		this.aClass349_1 = arg1;
		this.aFloat232 = arg2;
		this.aFloat231 = arg3;
	}

	@OriginalMember(owner = "client!atd", name = "<init>", descriptor = "(ILclient!alw;)V", line = 22)
	Class93_Sub1_Sub17_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Packet arg1) {
		super(arg0);
		this.aClass349_1 = Class102.method2587(arg1.g1((short) 16384), -1837196080);
		this.aFloat232 = arg1.gFloat(-1158908159);
		this.aFloat231 = arg1.gFloat(-1080326059);
	}

	@OriginalMember(owner = "client!atd", name = "n", descriptor = "(FI)V", line = 29)
	@Override
	public void method23493(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1) {
		this.aFloat230 += this.aFloat231 * arg0;
	}

	@OriginalMember(owner = "client!atd", name = "f", descriptor = "(F)V", line = 29)
	@Override
	public void method23496(@OriginalArg(0) float arg0) {
		this.aFloat230 += this.aFloat231 * arg0;
	}

	@OriginalMember(owner = "client!atd", name = "w", descriptor = "(F)V", line = 29)
	@Override
	public void method23497(@OriginalArg(0) float arg0) {
		this.aFloat230 += this.aFloat231 * arg0;
	}

	@OriginalMember(owner = "client!atd", name = "l", descriptor = "(F)V", line = 29)
	@Override
	public void method23498(@OriginalArg(0) float arg0) {
		this.aFloat230 += this.aFloat231 * arg0;
	}

	@OriginalMember(owner = "client!atd", name = "m", descriptor = "(Lclient!ju;Lclient!ou;Lclient!pq;I)V", line = 33)
	@Override
	public void method23501(@OriginalArg(0) Class368 arg0, @OriginalArg(1) Class470 arg1, @OriginalArg(2) Class489 arg2, @OriginalArg(3) int arg3) {
		@Pc(5) float local5 = (float) Math.sin((double) this.aFloat230);
		@Pc(10) float local10 = this.aFloat232 * local5;
		if (this.aClass349_1 == Class349.aClass349_7) {
			arg0.anInt4586 = (int) ((float) (arg0.anInt4586 * -1774271657) + local10) * -255666073;
			arg1.method29424(local10, 0.0F, 0.0F);
		} else if (Class349.aClass349_3 == this.aClass349_1) {
			arg0.anInt4587 = (int) ((float) (arg0.anInt4587 * -754001767) + local10) * -543294551;
			arg1.method29424(0.0F, local10, 0.0F);
		} else if (Class349.aClass349_2 == this.aClass349_1) {
			arg0.anInt4588 = (int) ((float) (arg0.anInt4588 * 1179660263) + local10) * -513444905;
			arg1.method29424(0.0F, 0.0F, local10);
		} else if (this.aClass349_1 == Class349.aClass349_4) {
			arg1.method29403(1.0F, 0.0F, 0.0F, local10);
		} else if (this.aClass349_1 == Class349.aClass349_5) {
			arg1.method29403(0.0F, 1.0F, 0.0F, local10);
		} else if (Class349.aClass349_6 == this.aClass349_1) {
			arg1.method29403(0.0F, 0.0F, 1.0F, local10);
		}
	}

	@OriginalMember(owner = "client!atd", name = "z", descriptor = "(Lclient!ju;Lclient!ou;Lclient!pq;)V", line = 33)
	@Override
	public void method23500(@OriginalArg(0) Class368 arg0, @OriginalArg(1) Class470 arg1, @OriginalArg(2) Class489 arg2) {
		@Pc(5) float local5 = (float) Math.sin((double) this.aFloat230);
		@Pc(10) float local10 = this.aFloat232 * local5;
		if (this.aClass349_1 == Class349.aClass349_7) {
			arg0.anInt4586 = (int) ((float) (arg0.anInt4586 * -1774271657) + local10) * -255666073;
			arg1.method29424(local10, 0.0F, 0.0F);
		} else if (Class349.aClass349_3 == this.aClass349_1) {
			arg0.anInt4587 = (int) ((float) (arg0.anInt4587 * -754001767) + local10) * -543294551;
			arg1.method29424(0.0F, local10, 0.0F);
		} else if (Class349.aClass349_2 == this.aClass349_1) {
			arg0.anInt4588 = (int) ((float) (arg0.anInt4588 * 1179660263) + local10) * -513444905;
			arg1.method29424(0.0F, 0.0F, local10);
		} else if (this.aClass349_1 == Class349.aClass349_4) {
			arg1.method29403(1.0F, 0.0F, 0.0F, local10);
		} else if (this.aClass349_1 == Class349.aClass349_5) {
			arg1.method29403(0.0F, 1.0F, 0.0F, local10);
		} else if (Class349.aClass349_6 == this.aClass349_1) {
			arg1.method29403(0.0F, 0.0F, 1.0F, local10);
		}
	}

	@OriginalMember(owner = "client!atd", name = "p", descriptor = "(Lclient!ju;Lclient!ou;Lclient!pq;)V", line = 33)
	@Override
	public void method23499(@OriginalArg(0) Class368 arg0, @OriginalArg(1) Class470 arg1, @OriginalArg(2) Class489 arg2) {
		@Pc(5) float local5 = (float) Math.sin((double) this.aFloat230);
		@Pc(10) float local10 = this.aFloat232 * local5;
		if (this.aClass349_1 == Class349.aClass349_7) {
			arg0.anInt4586 = (int) ((float) (arg0.anInt4586 * -1774271657) + local10) * -255666073;
			arg1.method29424(local10, 0.0F, 0.0F);
		} else if (Class349.aClass349_3 == this.aClass349_1) {
			arg0.anInt4587 = (int) ((float) (arg0.anInt4587 * -754001767) + local10) * -543294551;
			arg1.method29424(0.0F, local10, 0.0F);
		} else if (Class349.aClass349_2 == this.aClass349_1) {
			arg0.anInt4588 = (int) ((float) (arg0.anInt4588 * 1179660263) + local10) * -513444905;
			arg1.method29424(0.0F, 0.0F, local10);
		} else if (this.aClass349_1 == Class349.aClass349_4) {
			arg1.method29403(1.0F, 0.0F, 0.0F, local10);
		} else if (this.aClass349_1 == Class349.aClass349_5) {
			arg1.method29403(0.0F, 1.0F, 0.0F, local10);
		} else if (Class349.aClass349_6 == this.aClass349_1) {
			arg1.method29403(0.0F, 0.0F, 1.0F, local10);
		}
	}

	@OriginalMember(owner = "client!atd", name = "u", descriptor = "(Lclient!ju;Lclient!ou;Lclient!pq;)V", line = 33)
	@Override
	public void method23494(@OriginalArg(0) Class368 arg0, @OriginalArg(1) Class470 arg1, @OriginalArg(2) Class489 arg2) {
		@Pc(5) float local5 = (float) Math.sin((double) this.aFloat230);
		@Pc(10) float local10 = this.aFloat232 * local5;
		if (this.aClass349_1 == Class349.aClass349_7) {
			arg0.anInt4586 = (int) ((float) (arg0.anInt4586 * -1774271657) + local10) * -255666073;
			arg1.method29424(local10, 0.0F, 0.0F);
		} else if (Class349.aClass349_3 == this.aClass349_1) {
			arg0.anInt4587 = (int) ((float) (arg0.anInt4587 * -754001767) + local10) * -543294551;
			arg1.method29424(0.0F, local10, 0.0F);
		} else if (Class349.aClass349_2 == this.aClass349_1) {
			arg0.anInt4588 = (int) ((float) (arg0.anInt4588 * 1179660263) + local10) * -513444905;
			arg1.method29424(0.0F, 0.0F, local10);
		} else if (this.aClass349_1 == Class349.aClass349_4) {
			arg1.method29403(1.0F, 0.0F, 0.0F, local10);
		} else if (this.aClass349_1 == Class349.aClass349_5) {
			arg1.method29403(0.0F, 1.0F, 0.0F, local10);
		} else if (Class349.aClass349_6 == this.aClass349_1) {
			arg1.method29403(0.0F, 0.0F, 1.0F, local10);
		}
	}

	@OriginalMember(owner = "client!atd", name = "k", descriptor = "(Lclient!alw;I)V", line = 62)
	@Override
	public void method23495(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		this.aClass349_1 = Class102.method2587(arg0.g1((short) 16384), 1309578759);
		this.aFloat232 = arg0.gFloat(2039470482);
		this.aFloat231 = arg0.gFloat(601987057);
	}

	@OriginalMember(owner = "client!atd", name = "d", descriptor = "(Lclient!alw;)V", line = 62)
	@Override
	public void method23502(@OriginalArg(0) Packet arg0) {
		this.aClass349_1 = Class102.method2587(arg0.g1((short) 16384), -793354180);
		this.aFloat232 = arg0.gFloat(-1802420104);
		this.aFloat231 = arg0.gFloat(1757158791);
	}
}
