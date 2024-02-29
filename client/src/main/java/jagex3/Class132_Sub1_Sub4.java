package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!asv")
public abstract class Class132_Sub1_Sub4 extends Class132_Sub1 {

	@OriginalMember(owner = "client!asv", name = "b", descriptor = "I")
	int anInt1496 = 0;

	@OriginalMember(owner = "client!asv", name = "h", descriptor = "[Lclient!akf;")
	Class93_Sub16[] aClass93_Sub16Array15 = new Class93_Sub16[4];

	@OriginalMember(owner = "client!asv", name = "x", descriptor = "S")
	public short aShort97;

	@OriginalMember(owner = "client!asv", name = "<init>", descriptor = "(Lclient!tx;IIIIIILclient!oe;)V")
	Class132_Sub1_Sub4(@OriginalArg(0) Class585 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class458 arg7) {
		super(arg0, arg7);
		this.aByte100 = (byte) arg4;
		this.aByte99 = (byte) arg5;
		this.aShort97 = (short) arg6;
		if (arg7 != null) {
			this.method24234(arg7);
		}
		this.method24237((float) arg1, (float) arg2, (float) arg3);
		for (@Pc(38) int local38 = 0; local38 < 4; local38++) {
			this.aClass93_Sub16Array15[local38] = null;
		}
	}

	@OriginalMember(owner = "client!asv", name = "ga", descriptor = "(Lclient!dh;S)Z")
	@Override
	final boolean method24282(@OriginalArg(0) Class104 arg0, @OriginalArg(1) short arg1) {
		@Pc(3) Class472 local3 = this.method24241().aClass472_61;
		return this.aClass585_23.aClass598_2.method31976(this.aByte99, (int) local3.aFloat325 >> this.aClass585_23.anInt5599 * -358186793, (int) local3.aFloat327 >> this.aClass585_23.anInt5599 * -358186793);
	}

	@OriginalMember(owner = "client!asv", name = "gy", descriptor = "([Lclient!akf;S)I")
	@Override
	final int method24321(@OriginalArg(0) Class93_Sub16[] arg0, @OriginalArg(1) short arg1) {
		if (this.aBoolean561) {
			@Pc(6) Class472 local6 = this.method24241().aClass472_61;
			this.anInt1496 = this.method24286((int) local6.aFloat325 >> this.aClass585_23.anInt5599 * -358186793, (int) local6.aFloat327 >> this.aClass585_23.anInt5599 * -358186793, this.aClass93_Sub16Array15, 2108716433) * 1467316381;
			this.aBoolean561 = false;
		}
		for (@Pc(38) int local38 = 0; local38 < this.anInt1496 * -452145739; local38++) {
			arg0[local38] = this.aClass93_Sub16Array15[local38];
		}
		return this.anInt1496 * -452145739;
	}

	@OriginalMember(owner = "client!asv", name = "gn", descriptor = "(I)Z")
	@Override
	final boolean method24285(@OriginalArg(0) int arg0) {
		@Pc(3) Class472 local3 = this.method24241().aClass472_61;
		return this.aClass585_23.aBooleanArrayArray14[this.aClass585_23.anInt5616 * -93916925 + (((int) local3.aFloat325 >> this.aClass585_23.anInt5599 * -358186793) - this.aClass585_23.anInt5601 * 1602382659)][((int) local3.aFloat327 >> this.aClass585_23.anInt5599 * -358186793) - this.aClass585_23.anInt5620 * 1547517939 + this.aClass585_23.anInt5616 * -93916925];
	}

	@OriginalMember(owner = "client!asv", name = "gj", descriptor = "(Lclient!dh;)Z")
	@Override
	final boolean method24316(@OriginalArg(0) Class104 arg0) {
		@Pc(3) Class472 local3 = this.method24241().aClass472_61;
		return this.aClass585_23.aClass598_2.method31976(this.aByte99, (int) local3.aFloat325 >> this.aClass585_23.anInt5599 * -358186793, (int) local3.aFloat327 >> this.aClass585_23.anInt5599 * -358186793);
	}

	@OriginalMember(owner = "client!asv", name = "gv", descriptor = "([Lclient!akf;)I")
	@Override
	final int method24276(@OriginalArg(0) Class93_Sub16[] arg0) {
		if (this.aBoolean561) {
			@Pc(6) Class472 local6 = this.method24241().aClass472_61;
			this.anInt1496 = this.method24286((int) local6.aFloat325 >> this.aClass585_23.anInt5599 * -358186793, (int) local6.aFloat327 >> this.aClass585_23.anInt5599 * -358186793, this.aClass93_Sub16Array15, 1657491468) * 1467316381;
			this.aBoolean561 = false;
		}
		for (@Pc(38) int local38 = 0; local38 < this.anInt1496 * -452145739; local38++) {
			arg0[local38] = this.aClass93_Sub16Array15[local38];
		}
		return this.anInt1496 * -452145739;
	}

	@OriginalMember(owner = "client!asv", name = "gm", descriptor = "([Lclient!akf;)I")
	@Override
	final int method24314(@OriginalArg(0) Class93_Sub16[] arg0) {
		if (this.aBoolean561) {
			@Pc(6) Class472 local6 = this.method24241().aClass472_61;
			this.anInt1496 = this.method24286((int) local6.aFloat325 >> this.aClass585_23.anInt5599 * -358186793, (int) local6.aFloat327 >> this.aClass585_23.anInt5599 * -358186793, this.aClass93_Sub16Array15, 2124642463) * 1467316381;
			this.aBoolean561 = false;
		}
		for (@Pc(38) int local38 = 0; local38 < this.anInt1496 * -452145739; local38++) {
			arg0[local38] = this.aClass93_Sub16Array15[local38];
		}
		return this.anInt1496 * -452145739;
	}

	@OriginalMember(owner = "client!asv", name = "gw", descriptor = "()Z")
	@Override
	final boolean method24270() {
		@Pc(3) Class472 local3 = this.method24241().aClass472_61;
		return this.aClass585_23.aBooleanArrayArray14[this.aClass585_23.anInt5616 * -93916925 + (((int) local3.aFloat325 >> this.aClass585_23.anInt5599 * -358186793) - this.aClass585_23.anInt5601 * 1602382659)][((int) local3.aFloat327 >> this.aClass585_23.anInt5599 * -358186793) - this.aClass585_23.anInt5620 * 1547517939 + this.aClass585_23.anInt5616 * -93916925];
	}
}
