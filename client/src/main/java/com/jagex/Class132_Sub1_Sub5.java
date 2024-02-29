package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ast")
public abstract class Class132_Sub1_Sub5 extends Class132_Sub1 {

	@OriginalMember(owner = "client!ast", name = "<init>", descriptor = "(Lclient!tx;IIIII)V", line = 8)
	Class132_Sub1_Sub5(@OriginalArg(0) Class585 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0);
		this.aByte100 = (byte) arg4;
		this.aByte99 = (byte) arg5;
		this.method24239(new Class472((float) arg1, (float) arg2, (float) arg3));
	}

	@OriginalMember(owner = "client!ast", name = "gy", descriptor = "([Lclient!akf;S)I", line = 15)
	@Override
	int method24316(@OriginalArg(0) Class93_Sub16[] arg0, @OriginalArg(1) short arg1) {
		@Pc(3) Class472 local3 = this.method24220().aClass472_61;
		return this.method24263((int) local3.aFloat317 >> this.aClass585_23.anInt5438 * -358186793, (int) local3.aFloat319 >> this.aClass585_23.anInt5438 * -358186793, arg0, 1893437740);
	}

	@OriginalMember(owner = "client!ast", name = "gm", descriptor = "([Lclient!akf;)I", line = 15)
	@Override
	int method24313(@OriginalArg(0) Class93_Sub16[] arg0) {
		@Pc(3) Class472 local3 = this.method24220().aClass472_61;
		return this.method24263((int) local3.aFloat317 >> this.aClass585_23.anInt5438 * -358186793, (int) local3.aFloat319 >> this.aClass585_23.anInt5438 * -358186793, arg0, 2039049964);
	}

	@OriginalMember(owner = "client!ast", name = "gv", descriptor = "([Lclient!akf;)I", line = 15)
	@Override
	int method24287(@OriginalArg(0) Class93_Sub16[] arg0) {
		@Pc(3) Class472 local3 = this.method24220().aClass472_61;
		return this.method24263((int) local3.aFloat317 >> this.aClass585_23.anInt5438 * -358186793, (int) local3.aFloat319 >> this.aClass585_23.anInt5438 * -358186793, arg0, 2050504553);
	}

	@OriginalMember(owner = "client!ast", name = "ga", descriptor = "(Lclient!dh;S)Z", line = 20)
	@Override
	boolean method24292(@OriginalArg(0) Class104 arg0, @OriginalArg(1) short arg1) {
		@Pc(3) Class472 local3 = this.method24220().aClass472_61;
		@Pc(28) Class590 local28 = this.aClass585_23.method31553(this.aByte99, (int) local3.aFloat317 >> this.aClass585_23.anInt5438 * -358186793, (int) local3.aFloat319 >> this.aClass585_23.anInt5438 * -358186793, (byte) 2);
		return local28 != null && local28.aClass132_Sub1_Sub1_1.aBoolean562 ? this.aClass585_23.aClass598_2.method31816(this.aByte99, (int) local3.aFloat317 >> this.aClass585_23.anInt5438 * -358186793, (int) local3.aFloat319 >> this.aClass585_23.anInt5438 * -358186793, local28.aClass132_Sub1_Sub1_1.method24303((byte) -29) + this.method24303((byte) -73)) : this.aClass585_23.aClass598_2.method31806(this.aByte99, (int) local3.aFloat317 >> this.aClass585_23.anInt5438 * -358186793, (int) local3.aFloat319 >> this.aClass585_23.anInt5438 * -358186793);
	}

	@OriginalMember(owner = "client!ast", name = "gj", descriptor = "(Lclient!dh;)Z", line = 20)
	@Override
	boolean method24315(@OriginalArg(0) Class104 arg0) {
		@Pc(3) Class472 local3 = this.method24220().aClass472_61;
		@Pc(28) Class590 local28 = this.aClass585_23.method31553(this.aByte99, (int) local3.aFloat317 >> this.aClass585_23.anInt5438 * -358186793, (int) local3.aFloat319 >> this.aClass585_23.anInt5438 * -358186793, (byte) 2);
		return local28 != null && local28.aClass132_Sub1_Sub1_1.aBoolean562 ? this.aClass585_23.aClass598_2.method31816(this.aByte99, (int) local3.aFloat317 >> this.aClass585_23.anInt5438 * -358186793, (int) local3.aFloat319 >> this.aClass585_23.anInt5438 * -358186793, local28.aClass132_Sub1_Sub1_1.method24303((byte) -29) + this.method24303((byte) -76)) : this.aClass585_23.aClass598_2.method31806(this.aByte99, (int) local3.aFloat317 >> this.aClass585_23.anInt5438 * -358186793, (int) local3.aFloat319 >> this.aClass585_23.anInt5438 * -358186793);
	}

	@OriginalMember(owner = "client!ast", name = "gn", descriptor = "(I)Z", line = 27)
	@Override
	boolean method24295(@OriginalArg(0) int arg0) {
		@Pc(3) Class472 local3 = this.method24220().aClass472_61;
		return this.aClass585_23.aBooleanArrayArray14[this.aClass585_23.anInt5455 * -93916925 + (((int) local3.aFloat317 >> this.aClass585_23.anInt5438 * -358186793) - this.aClass585_23.anInt5440 * 1602382659)][((int) local3.aFloat319 >> this.aClass585_23.anInt5438 * -358186793) - this.aClass585_23.anInt5459 * 1547517939 + this.aClass585_23.anInt5455 * -93916925];
	}

	@OriginalMember(owner = "client!ast", name = "gw", descriptor = "()Z", line = 27)
	@Override
	boolean method24282() {
		@Pc(3) Class472 local3 = this.method24220().aClass472_61;
		return this.aClass585_23.aBooleanArrayArray14[this.aClass585_23.anInt5455 * -93916925 + (((int) local3.aFloat317 >> this.aClass585_23.anInt5438 * -358186793) - this.aClass585_23.anInt5440 * 1602382659)][((int) local3.aFloat319 >> this.aClass585_23.anInt5438 * -358186793) - this.aClass585_23.anInt5459 * 1547517939 + this.aClass585_23.anInt5455 * -93916925];
	}

	@OriginalMember(owner = "client!ast", name = "fp", descriptor = "(I)Z", line = 32)
	@Override
	final boolean method24284(@OriginalArg(0) int arg0) {
		return false;
	}

	@OriginalMember(owner = "client!ast", name = "fh", descriptor = "()Z", line = 32)
	@Override
	final boolean method24294() {
		return false;
	}

	@OriginalMember(owner = "client!ast", name = "fr", descriptor = "()Z", line = 32)
	@Override
	final boolean method24305() {
		return false;
	}

	@OriginalMember(owner = "client!ast", name = "gq", descriptor = "(Lclient!dh;Lclient!alh;IIIZ)V", line = 36)
	@Override
	final void method24309(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ast", name = "gu", descriptor = "(Lclient!dh;Lclient!alh;IIIZ)V", line = 36)
	@Override
	final void method24306(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ast", name = "gl", descriptor = "(Lclient!dh;Lclient!alh;IIIZ)V", line = 36)
	@Override
	final void method24308(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ast", name = "fq", descriptor = "(Lclient!dh;Lclient!alh;IIIZB)V", line = 36)
	@Override
	final void method24291(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ast", name = "ff", descriptor = "(B)V", line = 40)
	@Override
	final void method24288(@OriginalArg(0) byte arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ast", name = "go", descriptor = "()V", line = 40)
	@Override
	final void method24281() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ast", name = "gk", descriptor = "()V", line = 40)
	@Override
	final void method24310() {
		throw new IllegalStateException();
	}
}
