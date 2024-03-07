package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!arz")
public class Class93_Sub31_Sub5 extends Class93_Sub31 {

	@OriginalMember(owner = "client!arz", name = "f", descriptor = "I")
	int anInt3054;

	@OriginalMember(owner = "client!arz", name = "w", descriptor = "B")
	byte aByte87;

	// $FF: synthetic field
	@OriginalMember(owner = "client!arz", name = "this$0", descriptor = "Lclient!kc;")
	final Class374 this$0;

	@OriginalMember(owner = "client!arz", name = "k", descriptor = "Ljava/lang/String;")
	String aString105;

	@OriginalMember(owner = "client!arz", name = "<init>", descriptor = "(Lclient!kc;)V", line = 58)
	Class93_Sub31_Sub5(@OriginalArg(0) Class374 arg0) {
		this.this$0 = arg0;
		this.aString105 = null;
	}

	@OriginalMember(owner = "client!arz", name = "e", descriptor = "(Lclient!alw;I)V", line = 61)
	@Override
	void method22014(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		if (arg0.g1((short) 16384) != 255) {
			arg0.pos -= -1445626955;
			arg0.g8(-839464240);
		}
		this.aString105 = arg0.fastgstr((byte) 89);
		this.anInt3054 = arg0.g2(-1434290800) * -2079533049;
		this.aByte87 = arg0.g1b(1794019770);
		arg0.g8(-1139936111);
	}

	@OriginalMember(owner = "client!arz", name = "m", descriptor = "(Lclient!alw;)V", line = 61)
	@Override
	void method22009(@OriginalArg(0) Packet arg0) {
		if (arg0.g1((short) 16384) != 255) {
			arg0.pos -= -1445626955;
			arg0.g8(1200200775);
		}
		this.aString105 = arg0.fastgstr((byte) 82);
		this.anInt3054 = arg0.g2(-1434290800) * -2079533049;
		this.aByte87 = arg0.g1b(1638872814);
		arg0.g8(1247380056);
	}

	@OriginalMember(owner = "client!arz", name = "w", descriptor = "(Lclient!akr;)V", line = 72)
	@Override
	void method22013(@OriginalArg(0) Class93_Sub28 arg0) {
		@Pc(3) Class373 local3 = new Class373();
		local3.aString191 = this.aString105;
		local3.anInt4597 = this.anInt3054 * 453974303;
		local3.aByte150 = this.aByte87;
		arg0.method13828(local3, -400805323);
	}

	@OriginalMember(owner = "client!arz", name = "n", descriptor = "(Lclient!akr;S)V", line = 72)
	@Override
	void method22010(@OriginalArg(0) Class93_Sub28 arg0, @OriginalArg(1) short arg1) {
		@Pc(3) Class373 local3 = new Class373();
		local3.aString191 = this.aString105;
		local3.anInt4597 = this.anInt3054 * 453974303;
		local3.aByte150 = this.aByte87;
		arg0.method13828(local3, -104772929);
	}

	@OriginalMember(owner = "client!arz", name = "k", descriptor = "(Lclient!akr;)V", line = 72)
	@Override
	void method22012(@OriginalArg(0) Class93_Sub28 arg0) {
		@Pc(3) Class373 local3 = new Class373();
		local3.aString191 = this.aString105;
		local3.anInt4597 = this.anInt3054 * 453974303;
		local3.aByte150 = this.aByte87;
		arg0.method13828(local3, 51626008);
	}

	@OriginalMember(owner = "client!arz", name = "f", descriptor = "(Lclient!akr;)V", line = 72)
	@Override
	void method22011(@OriginalArg(0) Class93_Sub28 arg0) {
		@Pc(3) Class373 local3 = new Class373();
		local3.aString191 = this.aString105;
		local3.anInt4597 = this.anInt3054 * 453974303;
		local3.aByte150 = this.aByte87;
		arg0.method13828(local3, 421140685);
	}
}
