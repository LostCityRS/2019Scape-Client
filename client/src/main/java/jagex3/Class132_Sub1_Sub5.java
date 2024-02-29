package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ast")
public abstract class Class132_Sub1_Sub5 extends Class132_Sub1 {

	@OriginalMember(owner = "client!ast", name = "<init>", descriptor = "(Lclient!tx;IIIII)V")
	Class132_Sub1_Sub5(@OriginalArg(0) Class585 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0);
		this.aByte100 = (byte) arg4;
		this.aByte99 = (byte) arg5;
		this.method24236(new Class472((float) arg1, (float) arg2, (float) arg3));
	}

	@OriginalMember(owner = "client!ast", name = "gy", descriptor = "([Lclient!akf;S)I")
	@Override
	final int method24321(@OriginalArg(0) Class93_Sub16[] arg0, @OriginalArg(1) short arg1) {
		@Pc(3) Class472 local3 = this.method24241().aClass472_61;
		return this.method24286((int) local3.aFloat325 >> this.aClass585_23.anInt5599 * -358186793, (int) local3.aFloat327 >> this.aClass585_23.anInt5599 * -358186793, arg0, 1893437740);
	}

	@OriginalMember(owner = "client!ast", name = "ga", descriptor = "(Lclient!dh;S)Z")
	@Override
	final boolean method24282(@OriginalArg(0) Class104 arg0, @OriginalArg(1) short arg1) {
		@Pc(3) Class472 local3 = this.method24241().aClass472_61;
		@Pc(28) Class590 local28 = this.aClass585_23.method31648(this.aByte99, (int) local3.aFloat325 >> this.aClass585_23.anInt5599 * -358186793, (int) local3.aFloat327 >> this.aClass585_23.anInt5599 * -358186793, (byte) 2);
		return local28 != null && local28.aClass132_Sub1_Sub1_1.aBoolean563 ? this.aClass585_23.aClass598_2.method31999(this.aByte99, (int) local3.aFloat325 >> this.aClass585_23.anInt5599 * -358186793, (int) local3.aFloat327 >> this.aClass585_23.anInt5599 * -358186793, local28.aClass132_Sub1_Sub1_1.method24301((byte) -29) + this.method24301((byte) -73)) : this.aClass585_23.aClass598_2.method31976(this.aByte99, (int) local3.aFloat325 >> this.aClass585_23.anInt5599 * -358186793, (int) local3.aFloat327 >> this.aClass585_23.anInt5599 * -358186793);
	}

	@OriginalMember(owner = "client!ast", name = "gn", descriptor = "(I)Z")
	@Override
	final boolean method24285(@OriginalArg(0) int arg0) {
		@Pc(3) Class472 local3 = this.method24241().aClass472_61;
		return this.aClass585_23.aBooleanArrayArray14[this.aClass585_23.anInt5616 * -93916925 + (((int) local3.aFloat325 >> this.aClass585_23.anInt5599 * -358186793) - this.aClass585_23.anInt5601 * 1602382659)][((int) local3.aFloat327 >> this.aClass585_23.anInt5599 * -358186793) - this.aClass585_23.anInt5620 * 1547517939 + this.aClass585_23.anInt5616 * -93916925];
	}

	@OriginalMember(owner = "client!ast", name = "fp", descriptor = "(I)Z")
	@Override
	final boolean method24273(@OriginalArg(0) int arg0) {
		return false;
	}

	@OriginalMember(owner = "client!ast", name = "gq", descriptor = "(Lclient!dh;Lclient!alh;IIIZ)V")
	@Override
	final void method24308(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ast", name = "ff", descriptor = "(B)V")
	@Override
	final void method24277(@OriginalArg(0) byte arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ast", name = "fh", descriptor = "()Z")
	@Override
	final boolean method24284() {
		return false;
	}

	@OriginalMember(owner = "client!ast", name = "gm", descriptor = "([Lclient!akf;)I")
	@Override
	final int method24314(@OriginalArg(0) Class93_Sub16[] arg0) {
		@Pc(3) Class472 local3 = this.method24241().aClass472_61;
		return this.method24286((int) local3.aFloat325 >> this.aClass585_23.anInt5599 * -358186793, (int) local3.aFloat327 >> this.aClass585_23.anInt5599 * -358186793, arg0, 2039049964);
	}

	@OriginalMember(owner = "client!ast", name = "gu", descriptor = "(Lclient!dh;Lclient!alh;IIIZ)V")
	@Override
	final void method24305(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ast", name = "gv", descriptor = "([Lclient!akf;)I")
	@Override
	final int method24276(@OriginalArg(0) Class93_Sub16[] arg0) {
		@Pc(3) Class472 local3 = this.method24241().aClass472_61;
		return this.method24286((int) local3.aFloat325 >> this.aClass585_23.anInt5599 * -358186793, (int) local3.aFloat327 >> this.aClass585_23.anInt5599 * -358186793, arg0, 2050504553);
	}

	@OriginalMember(owner = "client!ast", name = "fr", descriptor = "()Z")
	@Override
	final boolean method24304() {
		return false;
	}

	@OriginalMember(owner = "client!ast", name = "go", descriptor = "()V")
	@Override
	final void method24269() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ast", name = "gk", descriptor = "()V")
	@Override
	final void method24309() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ast", name = "gw", descriptor = "()Z")
	@Override
	final boolean method24270() {
		@Pc(3) Class472 local3 = this.method24241().aClass472_61;
		return this.aClass585_23.aBooleanArrayArray14[this.aClass585_23.anInt5616 * -93916925 + (((int) local3.aFloat325 >> this.aClass585_23.anInt5599 * -358186793) - this.aClass585_23.anInt5601 * 1602382659)][((int) local3.aFloat327 >> this.aClass585_23.anInt5599 * -358186793) - this.aClass585_23.anInt5620 * 1547517939 + this.aClass585_23.anInt5616 * -93916925];
	}

	@OriginalMember(owner = "client!ast", name = "gl", descriptor = "(Lclient!dh;Lclient!alh;IIIZ)V")
	@Override
	final void method24307(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ast", name = "gj", descriptor = "(Lclient!dh;)Z")
	@Override
	final boolean method24316(@OriginalArg(0) Class104 arg0) {
		@Pc(3) Class472 local3 = this.method24241().aClass472_61;
		@Pc(28) Class590 local28 = this.aClass585_23.method31648(this.aByte99, (int) local3.aFloat325 >> this.aClass585_23.anInt5599 * -358186793, (int) local3.aFloat327 >> this.aClass585_23.anInt5599 * -358186793, (byte) 2);
		return local28 != null && local28.aClass132_Sub1_Sub1_1.aBoolean563 ? this.aClass585_23.aClass598_2.method31999(this.aByte99, (int) local3.aFloat325 >> this.aClass585_23.anInt5599 * -358186793, (int) local3.aFloat327 >> this.aClass585_23.anInt5599 * -358186793, local28.aClass132_Sub1_Sub1_1.method24301((byte) -29) + this.method24301((byte) -76)) : this.aClass585_23.aClass598_2.method31976(this.aByte99, (int) local3.aFloat325 >> this.aClass585_23.anInt5599 * -358186793, (int) local3.aFloat327 >> this.aClass585_23.anInt5599 * -358186793);
	}

	@OriginalMember(owner = "client!ast", name = "fq", descriptor = "(Lclient!dh;Lclient!alh;IIIZB)V")
	@Override
	final void method24281(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6) {
		throw new IllegalStateException();
	}
}
