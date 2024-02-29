package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ags")
public final class Class110_Sub18 extends Class110 {

	@OriginalMember(owner = "client!ags", name = "n", descriptor = "I")
	final int anInt980;

	@OriginalMember(owner = "client!ags", name = "m", descriptor = "I")
	final int anInt979;

	@OriginalMember(owner = "client!ags", name = "p", descriptor = "(Lclient!aqk;I)I")
	static int method8431(@OriginalArg(0) Class132_Sub1_Sub1_Sub1_Sub2 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0.anInt2805 * 1263335603;
		@Pc(8) Class622 local8 = arg0.method19978(992167915);
		@Pc(13) int local13 = arg0.aClass19_Sub3_3.method23566((byte) 59);
		if (local13 == -1 || arg0.aClass19_Sub3_3.aBoolean380) {
			local4 = arg0.anInt2803 * 1706069295;
		} else if (local8.anInt5841 * 1046628773 == local13 || local8.anInt5815 * 884977547 == local13 || local13 == local8.anInt5817 * 1632091583 || local8.anInt5816 * 1798234475 == local13) {
			local4 = arg0.anInt2806 * -2115122027;
		} else if (local13 == local8.anInt5818 * -2077928117 || local13 == local8.anInt5819 * 1363226867 || local13 == local8.anInt5806 * 285037349 || local8.anInt5814 * -2038961455 == local13) {
			local4 = arg0.anInt2797 * 479956847;
		}
		return local4;
	}

	@OriginalMember(owner = "client!ags", name = "aee", descriptor = "(Lclient!yf;I)V")
	static void method8432(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 - 1];
		arg0.anIntArray521[arg0.anInt6052 * -1497248091 - 1] = (int) Math.sqrt((double) local9);
	}

	@OriginalMember(owner = "client!ags", name = "apz", descriptor = "(Lclient!yf;I)V")
	static void method8433(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6049 -= -1422374923;
		arg0.anInt6052 -= -1915563430;
		Class93_Sub31_Sub4.method21962((String) arg0.anObjectArray45[arg0.anInt6049 * 587908375], (String) arg0.anObjectArray45[arg0.anInt6049 * 587908375 + 1], arg0.anIntArray521[arg0.anInt6052 * -1497248091], arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1] == 1, (String) arg0.anObjectArray45[arg0.anInt6049 * 587908375 + 2], 1301498783);
	}

	@OriginalMember(owner = "client!ags", name = "<init>", descriptor = "(Lclient!alw;)V")
	Class110_Sub18(@OriginalArg(0) Class93_Sub41 arg0) {
		super(arg0);
		this.anInt980 = arg0.method22427(-1434290800) * 442969213;
		this.anInt979 = arg0.method22431(-118643075) * -1483085689;
	}

	@OriginalMember(owner = "client!ags", name = "n", descriptor = "(I)V")
	@Override
	public void method20150(@OriginalArg(0) int arg0) {
		client.anInt3467 = client.anInt3485 * -392014799;
		client.anInt3468 = (this.anInt980 * 1452584149 + client.anInt3485) * 746976163;
		Class655.anInt5970 = client.anInt3534 * -1909087255;
		Class110_Sub8.anInt917 = client.anInt3470 * 646788021;
		Class23.anInt74 = client.anInt3471 * -2100619023;
		Class257.anInt3895 = client.anInt3442 * 1458278769;
		client.anInt3534 = (this.anInt979 * 1129995575 >>> 24) * -1962143233;
		client.anInt3470 = (this.anInt979 * 1129995575 >>> 16 & 0xFF) * 2081185855;
		client.anInt3471 = (this.anInt979 * 1129995575 >>> 8 & 0xFF) * 2079590111;
		client.anInt3442 = (this.anInt979 * 1129995575 & 0xFF) * 674404021;
	}

	@OriginalMember(owner = "client!ags", name = "f", descriptor = "()V")
	@Override
	public void method20152() {
		client.anInt3467 = client.anInt3485 * -392014799;
		client.anInt3468 = (this.anInt980 * 1452584149 + client.anInt3485) * 746976163;
		Class655.anInt5970 = client.anInt3534 * -1909087255;
		Class110_Sub8.anInt917 = client.anInt3470 * 646788021;
		Class23.anInt74 = client.anInt3471 * -2100619023;
		Class257.anInt3895 = client.anInt3442 * 1458278769;
		client.anInt3534 = (this.anInt979 * 1129995575 >>> 24) * -1962143233;
		client.anInt3470 = (this.anInt979 * 1129995575 >>> 16 & 0xFF) * 2081185855;
		client.anInt3471 = (this.anInt979 * 1129995575 >>> 8 & 0xFF) * 2079590111;
		client.anInt3442 = (this.anInt979 * 1129995575 & 0xFF) * 674404021;
	}
}
