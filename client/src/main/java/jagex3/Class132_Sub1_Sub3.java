package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!asm")
public abstract class Class132_Sub1_Sub3 extends Class132_Sub1 {

	@OriginalMember(owner = "client!asm", name = "h", descriptor = "I")
	int anInt1441 = 0;

	@OriginalMember(owner = "client!asm", name = "a", descriptor = "[Lclient!akf;")
	Class93_Sub16[] aClass93_Sub16Array10 = new Class93_Sub16[4];

	@OriginalMember(owner = "client!asm", name = "x", descriptor = "S")
	protected short aShort86;

	@OriginalMember(owner = "client!asm", name = "b", descriptor = "S")
	protected short aShort85;

	@OriginalMember(owner = "client!asm", name = "<init>", descriptor = "(Lclient!tx;IIIIIIILclient!oe;)V")
	Class132_Sub1_Sub3(@OriginalArg(0) Class585 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class458 arg8) {
		super(arg0, arg8);
		this.aByte100 = (byte) arg4;
		this.aByte99 = (byte) arg5;
		this.aShort86 = (short) arg6;
		this.aShort85 = (short) arg7;
		if (arg8 != null) {
			this.method24234(arg8);
		}
		this.method24237((float) arg1, (float) arg2, (float) arg3);
		for (@Pc(42) int local42 = 0; local42 < 4; local42++) {
			this.aClass93_Sub16Array10[local42] = null;
		}
	}

	@OriginalMember(owner = "client!asm", name = "gm", descriptor = "([Lclient!akf;)I")
	@Override
	final int method24314(@OriginalArg(0) Class93_Sub16[] arg0) {
		if (this.aBoolean561) {
			@Pc(6) Class472 local6 = this.method24241().aClass472_61;
			this.anInt1441 = this.method24286((int) local6.aFloat325 >> this.aClass585_23.anInt5599 * -358186793, (int) local6.aFloat327 >> this.aClass585_23.anInt5599 * -358186793, this.aClass93_Sub16Array10, 1640818693) * -1538873379;
			this.aBoolean561 = false;
		}
		for (@Pc(38) int local38 = 0; local38 < this.anInt1441 * 186247285; local38++) {
			arg0[local38] = this.aClass93_Sub16Array10[local38];
		}
		return this.anInt1441 * 186247285;
	}

	@OriginalMember(owner = "client!asm", name = "ff", descriptor = "(B)V")
	@Override
	final void method24277(@OriginalArg(0) byte arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!asm", name = "ga", descriptor = "(Lclient!dh;S)Z")
	@Override
	final boolean method24282(@OriginalArg(0) Class104 arg0, @OriginalArg(1) short arg1) {
		@Pc(3) Class472 local3 = this.method24241().aClass472_61;
		return this.aClass585_23.aClass598_2.method31999(this.aByte99, (int) local3.aFloat325 >> this.aClass585_23.anInt5599 * -358186793, (int) local3.aFloat327 >> this.aClass585_23.anInt5599 * -358186793, this.method24301((byte) 7));
	}

	@OriginalMember(owner = "client!asm", name = "gn", descriptor = "(I)Z")
	@Override
	final boolean method24285(@OriginalArg(0) int arg0) {
		@Pc(3) Class472 local3 = this.method24241().aClass472_61;
		return this.aClass585_23.aBooleanArrayArray14[((int) local3.aFloat325 >> this.aClass585_23.anInt5599 * -358186793) - this.aClass585_23.anInt5601 * 1602382659 + this.aClass585_23.anInt5616 * -93916925][((int) local3.aFloat327 >> this.aClass585_23.anInt5599 * -358186793) - this.aClass585_23.anInt5620 * 1547517939 + this.aClass585_23.anInt5616 * -93916925];
	}

	@OriginalMember(owner = "client!asm", name = "fp", descriptor = "(I)Z")
	@Override
	final boolean method24273(@OriginalArg(0) int arg0) {
		return false;
	}

	@OriginalMember(owner = "client!asm", name = "gw", descriptor = "()Z")
	@Override
	final boolean method24270() {
		@Pc(3) Class472 local3 = this.method24241().aClass472_61;
		return this.aClass585_23.aBooleanArrayArray14[((int) local3.aFloat325 >> this.aClass585_23.anInt5599 * -358186793) - this.aClass585_23.anInt5601 * 1602382659 + this.aClass585_23.anInt5616 * -93916925][((int) local3.aFloat327 >> this.aClass585_23.anInt5599 * -358186793) - this.aClass585_23.anInt5620 * 1547517939 + this.aClass585_23.anInt5616 * -93916925];
	}

	@OriginalMember(owner = "client!asm", name = "gy", descriptor = "([Lclient!akf;S)I")
	@Override
	final int method24321(@OriginalArg(0) Class93_Sub16[] arg0, @OriginalArg(1) short arg1) {
		if (this.aBoolean561) {
			@Pc(6) Class472 local6 = this.method24241().aClass472_61;
			this.anInt1441 = this.method24286((int) local6.aFloat325 >> this.aClass585_23.anInt5599 * -358186793, (int) local6.aFloat327 >> this.aClass585_23.anInt5599 * -358186793, this.aClass93_Sub16Array10, 2072930422) * -1538873379;
			this.aBoolean561 = false;
		}
		for (@Pc(38) int local38 = 0; local38 < this.anInt1441 * 186247285; local38++) {
			arg0[local38] = this.aClass93_Sub16Array10[local38];
		}
		return this.anInt1441 * 186247285;
	}

	@OriginalMember(owner = "client!asm", name = "fh", descriptor = "()Z")
	@Override
	final boolean method24284() {
		return false;
	}

	@OriginalMember(owner = "client!asm", name = "fq", descriptor = "(Lclient!dh;Lclient!alh;IIIZB)V")
	@Override
	final void method24281(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!asm", name = "gu", descriptor = "(Lclient!dh;Lclient!alh;IIIZ)V")
	@Override
	final void method24305(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!asm", name = "gq", descriptor = "(Lclient!dh;Lclient!alh;IIIZ)V")
	@Override
	final void method24308(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!asm", name = "gl", descriptor = "(Lclient!dh;Lclient!alh;IIIZ)V")
	@Override
	final void method24307(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!asm", name = "fr", descriptor = "()Z")
	@Override
	final boolean method24304() {
		return false;
	}

	@OriginalMember(owner = "client!asm", name = "gk", descriptor = "()V")
	@Override
	final void method24309() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!asm", name = "go", descriptor = "()V")
	@Override
	final void method24269() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!asm", name = "gv", descriptor = "([Lclient!akf;)I")
	@Override
	final int method24276(@OriginalArg(0) Class93_Sub16[] arg0) {
		if (this.aBoolean561) {
			@Pc(6) Class472 local6 = this.method24241().aClass472_61;
			this.anInt1441 = this.method24286((int) local6.aFloat325 >> this.aClass585_23.anInt5599 * -358186793, (int) local6.aFloat327 >> this.aClass585_23.anInt5599 * -358186793, this.aClass93_Sub16Array10, 2024191788) * -1538873379;
			this.aBoolean561 = false;
		}
		for (@Pc(38) int local38 = 0; local38 < this.anInt1441 * 186247285; local38++) {
			arg0[local38] = this.aClass93_Sub16Array10[local38];
		}
		return this.anInt1441 * 186247285;
	}

	@OriginalMember(owner = "client!asm", name = "gj", descriptor = "(Lclient!dh;)Z")
	@Override
	final boolean method24316(@OriginalArg(0) Class104 arg0) {
		@Pc(3) Class472 local3 = this.method24241().aClass472_61;
		return this.aClass585_23.aClass598_2.method31999(this.aByte99, (int) local3.aFloat325 >> this.aClass585_23.anInt5599 * -358186793, (int) local3.aFloat327 >> this.aClass585_23.anInt5599 * -358186793, this.method24301((byte) -124));
	}
}
