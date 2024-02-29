package com.jagex;

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

	@OriginalMember(owner = "client!asm", name = "<init>", descriptor = "(Lclient!tx;IIIIIIILclient!oe;)V", line = 14)
	Class132_Sub1_Sub3(@OriginalArg(0) Class585 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class458 arg8) {
		super(arg0, arg8);
		this.aByte100 = (byte) arg4;
		this.aByte99 = (byte) arg5;
		this.aShort86 = (short) arg6;
		this.aShort85 = (short) arg7;
		if (arg8 != null) {
			this.method24231(arg8);
		}
		this.method24242((float) arg1, (float) arg2, (float) arg3);
		for (@Pc(42) int local42 = 0; local42 < 4; local42++) {
			this.aClass93_Sub16Array10[local42] = null;
		}
	}

	@OriginalMember(owner = "client!asm", name = "gm", descriptor = "([Lclient!akf;)I", line = 27)
	@Override
	int method24313(@OriginalArg(0) Class93_Sub16[] arg0) {
		if (this.aBoolean560) {
			@Pc(6) Class472 local6 = this.method24220().aClass472_61;
			this.anInt1441 = this.method24263((int) local6.aFloat317 >> this.aClass585_23.anInt5438 * -358186793, (int) local6.aFloat319 >> this.aClass585_23.anInt5438 * -358186793, this.aClass93_Sub16Array10, 1640818693) * -1538873379;
			this.aBoolean560 = false;
		}
		for (@Pc(38) int local38 = 0; local38 < this.anInt1441 * 186247285; local38++) {
			arg0[local38] = this.aClass93_Sub16Array10[local38];
		}
		return this.anInt1441 * 186247285;
	}

	@OriginalMember(owner = "client!asm", name = "gy", descriptor = "([Lclient!akf;S)I", line = 27)
	@Override
	int method24316(@OriginalArg(0) Class93_Sub16[] arg0, @OriginalArg(1) short arg1) {
		if (this.aBoolean560) {
			@Pc(6) Class472 local6 = this.method24220().aClass472_61;
			this.anInt1441 = this.method24263((int) local6.aFloat317 >> this.aClass585_23.anInt5438 * -358186793, (int) local6.aFloat319 >> this.aClass585_23.anInt5438 * -358186793, this.aClass93_Sub16Array10, 2072930422) * -1538873379;
			this.aBoolean560 = false;
		}
		for (@Pc(38) int local38 = 0; local38 < this.anInt1441 * 186247285; local38++) {
			arg0[local38] = this.aClass93_Sub16Array10[local38];
		}
		return this.anInt1441 * 186247285;
	}

	@OriginalMember(owner = "client!asm", name = "gv", descriptor = "([Lclient!akf;)I", line = 27)
	@Override
	int method24287(@OriginalArg(0) Class93_Sub16[] arg0) {
		if (this.aBoolean560) {
			@Pc(6) Class472 local6 = this.method24220().aClass472_61;
			this.anInt1441 = this.method24263((int) local6.aFloat317 >> this.aClass585_23.anInt5438 * -358186793, (int) local6.aFloat319 >> this.aClass585_23.anInt5438 * -358186793, this.aClass93_Sub16Array10, 2024191788) * -1538873379;
			this.aBoolean560 = false;
		}
		for (@Pc(38) int local38 = 0; local38 < this.anInt1441 * 186247285; local38++) {
			arg0[local38] = this.aClass93_Sub16Array10[local38];
		}
		return this.anInt1441 * 186247285;
	}

	@OriginalMember(owner = "client!asm", name = "ga", descriptor = "(Lclient!dh;S)Z", line = 37)
	@Override
	boolean method24292(@OriginalArg(0) Class104 arg0, @OriginalArg(1) short arg1) {
		@Pc(3) Class472 local3 = this.method24220().aClass472_61;
		return this.aClass585_23.aClass598_2.method31816(this.aByte99, (int) local3.aFloat317 >> this.aClass585_23.anInt5438 * -358186793, (int) local3.aFloat319 >> this.aClass585_23.anInt5438 * -358186793, this.method24303((byte) 7));
	}

	@OriginalMember(owner = "client!asm", name = "gj", descriptor = "(Lclient!dh;)Z", line = 37)
	@Override
	boolean method24315(@OriginalArg(0) Class104 arg0) {
		@Pc(3) Class472 local3 = this.method24220().aClass472_61;
		return this.aClass585_23.aClass598_2.method31816(this.aByte99, (int) local3.aFloat317 >> this.aClass585_23.anInt5438 * -358186793, (int) local3.aFloat319 >> this.aClass585_23.anInt5438 * -358186793, this.method24303((byte) -124));
	}

	@OriginalMember(owner = "client!asm", name = "gn", descriptor = "(I)Z", line = 42)
	@Override
	boolean method24295(@OriginalArg(0) int arg0) {
		@Pc(3) Class472 local3 = this.method24220().aClass472_61;
		return this.aClass585_23.aBooleanArrayArray14[((int) local3.aFloat317 >> this.aClass585_23.anInt5438 * -358186793) - this.aClass585_23.anInt5440 * 1602382659 + this.aClass585_23.anInt5455 * -93916925][((int) local3.aFloat319 >> this.aClass585_23.anInt5438 * -358186793) - this.aClass585_23.anInt5459 * 1547517939 + this.aClass585_23.anInt5455 * -93916925];
	}

	@OriginalMember(owner = "client!asm", name = "gw", descriptor = "()Z", line = 42)
	@Override
	boolean method24282() {
		@Pc(3) Class472 local3 = this.method24220().aClass472_61;
		return this.aClass585_23.aBooleanArrayArray14[((int) local3.aFloat317 >> this.aClass585_23.anInt5438 * -358186793) - this.aClass585_23.anInt5440 * 1602382659 + this.aClass585_23.anInt5455 * -93916925][((int) local3.aFloat319 >> this.aClass585_23.anInt5438 * -358186793) - this.aClass585_23.anInt5459 * 1547517939 + this.aClass585_23.anInt5455 * -93916925];
	}

	@OriginalMember(owner = "client!asm", name = "fp", descriptor = "(I)Z", line = 47)
	@Override
	final boolean method24284(@OriginalArg(0) int arg0) {
		return false;
	}

	@OriginalMember(owner = "client!asm", name = "fh", descriptor = "()Z", line = 47)
	@Override
	final boolean method24294() {
		return false;
	}

	@OriginalMember(owner = "client!asm", name = "fr", descriptor = "()Z", line = 47)
	@Override
	final boolean method24305() {
		return false;
	}

	@OriginalMember(owner = "client!asm", name = "fq", descriptor = "(Lclient!dh;Lclient!alh;IIIZB)V", line = 51)
	@Override
	final void method24291(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!asm", name = "gu", descriptor = "(Lclient!dh;Lclient!alh;IIIZ)V", line = 51)
	@Override
	final void method24306(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!asm", name = "gq", descriptor = "(Lclient!dh;Lclient!alh;IIIZ)V", line = 51)
	@Override
	final void method24309(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!asm", name = "gl", descriptor = "(Lclient!dh;Lclient!alh;IIIZ)V", line = 51)
	@Override
	final void method24308(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!asm", name = "ff", descriptor = "(B)V", line = 55)
	@Override
	final void method24288(@OriginalArg(0) byte arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!asm", name = "gk", descriptor = "()V", line = 55)
	@Override
	final void method24310() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!asm", name = "go", descriptor = "()V", line = 55)
	@Override
	final void method24281() {
		throw new IllegalStateException();
	}
}
