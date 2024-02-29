package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aod")
public final class Class32_Sub3 extends Class32 {

	@OriginalMember(owner = "client!aod", name = "kz", descriptor = "(Lclient!hf;III)V")
	static void method16707(@OriginalArg(0) Class312 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0.aByte126 == 0) {
			arg0.anInt4020 = arg0.anInt4016 * 557709685;
		} else if (arg0.aByte126 == 1) {
			arg0.anInt4020 = ((arg1 - arg0.anInt4022 * 1215292027) / 2 + arg0.anInt4016 * 744903821) * 876618377;
		} else if (arg0.aByte126 == 2) {
			arg0.anInt4020 = (arg1 - arg0.anInt4022 * 1215292027 - arg0.anInt4016 * 744903821) * 876618377;
		} else if (arg0.aByte126 == 3) {
			arg0.anInt4020 = (arg1 * 744903821 * arg0.anInt4016 >> 14) * 876618377;
		} else if (arg0.aByte126 == 4) {
			arg0.anInt4020 = ((arg1 - arg0.anInt4022 * 1215292027) / 2 + (arg1 * 744903821 * arg0.anInt4016 >> 14)) * 876618377;
		} else {
			arg0.anInt4020 = (arg1 - arg0.anInt4022 * 1215292027 - (arg1 * arg0.anInt4016 * 744903821 >> 14)) * 876618377;
		}
		if (arg0.aByte127 == 0) {
			arg0.anInt4021 = arg0.anInt4017 * -1138027155;
		} else if (arg0.aByte127 == 1) {
			arg0.anInt4021 = ((arg2 - arg0.anInt4023 * -1490598249) / 2 + arg0.anInt4017 * -1966095725) * 807979007;
		} else if (arg0.aByte127 == 2) {
			arg0.anInt4021 = (arg2 - arg0.anInt4023 * -1490598249 - arg0.anInt4017 * -1966095725) * 807979007;
		} else if (arg0.aByte127 == 3) {
			arg0.anInt4021 = (arg2 * -1966095725 * arg0.anInt4017 >> 14) * 807979007;
		} else if (arg0.aByte127 == 4) {
			arg0.anInt4021 = ((arg2 - arg0.anInt4023 * -1490598249) / 2 + (arg2 * -1966095725 * arg0.anInt4017 >> 14)) * 807979007;
		} else {
			arg0.anInt4021 = (arg2 - arg0.anInt4023 * -1490598249 - (arg2 * arg0.anInt4017 * -1966095725 >> 14)) * 807979007;
		}
		if (!client.aBoolean617 || client.method25250(arg0).anInt1550 * -622772683 == 0 && arg0.anInt4012 * -158526639 != 0) {
			return;
		}
		if (arg0.anInt4020 * -903351367 < 0) {
			arg0.anInt4020 = 0;
		} else if (arg0.anInt4020 * -903351367 + arg0.anInt4022 * 1215292027 > arg1) {
			arg0.anInt4020 = (arg1 - arg0.anInt4022 * 1215292027) * 876618377;
		}
		if (arg0.anInt4021 * -1281935361 < 0) {
			arg0.anInt4021 = 0;
		} else if (arg0.anInt4021 * -1281935361 + arg0.anInt4023 * -1490598249 > arg2) {
			arg0.anInt4021 = (arg2 - arg0.anInt4023 * -1490598249) * 807979007;
		}
	}

	@OriginalMember(owner = "client!aod", name = "<init>", descriptor = "(Lclient!zd;Lclient!zt;ZLclient!py;Lclient!py;)V")
	public Class32_Sub3(@OriginalArg(0) Class702 arg0, @OriginalArg(1) Class717 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class497 arg3, @OriginalArg(4) Class497 arg4) {
		super(arg0, arg1, arg3, Class667.aClass667_41, 64, new Class119_Sub1(arg2, arg4, arg1, arg0));
	}

	@OriginalMember(owner = "client!aod", name = "al", descriptor = "(ZI)V")
	public void method16700(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		((Class119) this.anInterface4_25).method8593(arg0, -1640263275);
		super.method17819(588967175);
	}

	@OriginalMember(owner = "client!aod", name = "r", descriptor = "(I)V")
	@Override
	public void method17819(@OriginalArg(0) int arg0) {
		super.method17819(1837654223);
		((Class119) this.anInterface4_25).method8591((byte) 101);
	}

	@OriginalMember(owner = "client!aod", name = "ac", descriptor = "(II)V")
	public void method16701(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		((Class119) this.anInterface4_25).method8589(arg0, -130025275);
	}

	@OriginalMember(owner = "client!aod", name = "aw", descriptor = "(I)V")
	public void method16702(@OriginalArg(0) int arg0) {
		((Class119) this.anInterface4_25).method8589(arg0, 1451423172);
	}

	@OriginalMember(owner = "client!aod", name = "g", descriptor = "(I)V")
	@Override
	public void method17829(@OriginalArg(0) int arg0) {
		super.method17820(arg0, -1504857750);
		((Class119) this.anInterface4_25).method8592(arg0, -926571473);
	}

	@OriginalMember(owner = "client!aod", name = "t", descriptor = "()V")
	@Override
	public void method17832() {
		super.method17823(776549262);
		((Class119) this.anInterface4_25).method8598(1408271474);
	}

	@OriginalMember(owner = "client!aod", name = "s", descriptor = "()V")
	@Override
	public void method17822() {
		super.method17819(-744382828);
		((Class119) this.anInterface4_25).method8591((byte) 88);
	}

	@OriginalMember(owner = "client!aod", name = "a", descriptor = "(I)V")
	@Override
	public void method17837(@OriginalArg(0) int arg0) {
		super.method17820(arg0, -1883971144);
		((Class119) this.anInterface4_25).method8592(arg0, -1980851925);
	}

	@OriginalMember(owner = "client!aod", name = "x", descriptor = "()V")
	@Override
	public void method17826() {
		super.method17819(-784623478);
		((Class119) this.anInterface4_25).method8591((byte) 90);
	}

	@OriginalMember(owner = "client!aod", name = "v", descriptor = "(II)V")
	@Override
	public void method17820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.method17820(arg0, -1837768318);
		((Class119) this.anInterface4_25).method8592(arg0, 46811599);
	}

	@OriginalMember(owner = "client!aod", name = "o", descriptor = "(I)V")
	@Override
	public void method17823(@OriginalArg(0) int arg0) {
		super.method17823(-1771769934);
		((Class119) this.anInterface4_25).method8598(1972715972);
	}

	@OriginalMember(owner = "client!aod", name = "b", descriptor = "()V")
	@Override
	public void method17818() {
		super.method17819(-1187100443);
		((Class119) this.anInterface4_25).method8591((byte) 14);
	}

	@OriginalMember(owner = "client!aod", name = "h", descriptor = "()V")
	@Override
	public void method17827() {
		super.method17819(972542880);
		((Class119) this.anInterface4_25).method8591((byte) 106);
	}

	@OriginalMember(owner = "client!aod", name = "i", descriptor = "(I)V")
	@Override
	public void method17830(@OriginalArg(0) int arg0) {
		super.method17820(arg0, -1210143391);
		((Class119) this.anInterface4_25).method8592(arg0, -720722814);
	}

	@OriginalMember(owner = "client!aod", name = "j", descriptor = "(I)V")
	@Override
	public void method17831(@OriginalArg(0) int arg0) {
		super.method17820(arg0, -1298803411);
		((Class119) this.anInterface4_25).method8592(arg0, 1248618857);
	}

	@OriginalMember(owner = "client!aod", name = "q", descriptor = "()V")
	@Override
	public void method17825() {
		super.method17819(-667308823);
		((Class119) this.anInterface4_25).method8591((byte) 97);
	}

	@OriginalMember(owner = "client!aod", name = "ai", descriptor = "(Z)V")
	public void method16703(@OriginalArg(0) boolean arg0) {
		((Class119) this.anInterface4_25).method8593(arg0, -1200391267);
		super.method17819(581384264);
	}

	@OriginalMember(owner = "client!aod", name = "y", descriptor = "()V")
	@Override
	public void method17824() {
		super.method17819(-987210333);
		((Class119) this.anInterface4_25).method8591((byte) 43);
	}

	@OriginalMember(owner = "client!aod", name = "as", descriptor = "(I)V")
	public void method16704(@OriginalArg(0) int arg0) {
		((Class119) this.anInterface4_25).method8589(arg0, -1329331060);
	}

	@OriginalMember(owner = "client!aod", name = "at", descriptor = "(I)V")
	public void method16705(@OriginalArg(0) int arg0) {
		((Class119) this.anInterface4_25).method8589(arg0, 882894737);
	}

	@OriginalMember(owner = "client!aod", name = "ad", descriptor = "(I)V")
	public void method16706(@OriginalArg(0) int arg0) {
		((Class119) this.anInterface4_25).method8589(arg0, 1219038068);
	}
}
