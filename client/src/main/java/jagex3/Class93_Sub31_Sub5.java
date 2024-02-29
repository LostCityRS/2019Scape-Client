package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!arz")
public final class Class93_Sub31_Sub5 extends Class93_Sub31 {

	@OriginalMember(owner = "client!arz", name = "f", descriptor = "I")
	int anInt3054;

	@OriginalMember(owner = "client!arz", name = "w", descriptor = "B")
	byte aByte87;

	// $FF: synthetic field
	@OriginalMember(owner = "client!arz", name = "this$0", descriptor = "Lclient!kc;")
	final Class374 aClass374_5;

	@OriginalMember(owner = "client!arz", name = "k", descriptor = "Ljava/lang/String;")
	String aString105;

	@OriginalMember(owner = "client!arz", name = "<init>", descriptor = "(Lclient!kc;)V")
	Class93_Sub31_Sub5(@OriginalArg(0) Class374 arg0) {
		this.aClass374_5 = arg0;
		this.aString105 = null;
	}

	@OriginalMember(owner = "client!arz", name = "w", descriptor = "(Lclient!akr;)V")
	@Override
	void method22022(@OriginalArg(0) Class93_Sub28 arg0) {
		@Pc(3) Class373 local3 = new Class373();
		local3.aString200 = this.aString105;
		local3.anInt4758 = this.anInt3054 * 453974303;
		local3.aByte150 = this.aByte87;
		arg0.method13824(local3, -400805323);
	}

	@OriginalMember(owner = "client!arz", name = "e", descriptor = "(Lclient!alw;I)V")
	@Override
	void method22023(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg0.method22425((short) 16384) != 255) {
			arg0.anInt3070 -= -1445626955;
			arg0.method22435(-839464240);
		}
		this.aString105 = arg0.method22438((byte) 89);
		this.anInt3054 = arg0.method22427(-1434290800) * -2079533049;
		this.aByte87 = arg0.method22426(1794019770);
		arg0.method22435(-1139936111);
	}

	@OriginalMember(owner = "client!arz", name = "n", descriptor = "(Lclient!akr;S)V")
	@Override
	void method22019(@OriginalArg(0) Class93_Sub28 arg0, @OriginalArg(1) short arg1) {
		@Pc(3) Class373 local3 = new Class373();
		local3.aString200 = this.aString105;
		local3.anInt4758 = this.anInt3054 * 453974303;
		local3.aByte150 = this.aByte87;
		arg0.method13824(local3, -104772929);
	}

	@OriginalMember(owner = "client!arz", name = "m", descriptor = "(Lclient!alw;)V")
	@Override
	void method22018(@OriginalArg(0) Class93_Sub41 arg0) {
		if (arg0.method22425((short) 16384) != 255) {
			arg0.anInt3070 -= -1445626955;
			arg0.method22435(1200200775);
		}
		this.aString105 = arg0.method22438((byte) 82);
		this.anInt3054 = arg0.method22427(-1434290800) * -2079533049;
		this.aByte87 = arg0.method22426(1638872814);
		arg0.method22435(1247380056);
	}

	@OriginalMember(owner = "client!arz", name = "k", descriptor = "(Lclient!akr;)V")
	@Override
	void method22021(@OriginalArg(0) Class93_Sub28 arg0) {
		@Pc(3) Class373 local3 = new Class373();
		local3.aString200 = this.aString105;
		local3.anInt4758 = this.anInt3054 * 453974303;
		local3.aByte150 = this.aByte87;
		arg0.method13824(local3, 51626008);
	}

	@OriginalMember(owner = "client!arz", name = "f", descriptor = "(Lclient!akr;)V")
	@Override
	void method22020(@OriginalArg(0) Class93_Sub28 arg0) {
		@Pc(3) Class373 local3 = new Class373();
		local3.aString200 = this.aString105;
		local3.anInt4758 = this.anInt3054 * 453974303;
		local3.aByte150 = this.aByte87;
		arg0.method13824(local3, 421140685);
	}
}
