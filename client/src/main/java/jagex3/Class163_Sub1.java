package jagex3;

import java.util.LinkedList;
import java.util.Queue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!alp")
public final class Class163_Sub1 extends Class163 {

	@OriginalMember(owner = "client!alp", name = "w", descriptor = "Ljava/util/Queue;")
	final Queue aQueue1 = new LinkedList();

	@OriginalMember(owner = "client!alp", name = "<init>", descriptor = "()V")
	Class163_Sub1() {
	}

	@OriginalMember(owner = "client!alp", name = "v", descriptor = "()I")
	@Override
	int method14913() {
		return 1;
	}

	@OriginalMember(owner = "client!alp", name = "i", descriptor = "(Lclient!asp;B)V")
	void method14845(@OriginalArg(0) Class93_Sub23_Sub2 arg0, @OriginalArg(1) byte arg1) {
		this.aQueue1.add(arg0);
		if (this.aQueue1.size() > 10) {
			this.aQueue1.poll();
		}
	}

	@OriginalMember(owner = "client!alp", name = "ag", descriptor = "(Lclient!asp;)V")
	void method14846(@OriginalArg(0) Class93_Sub23_Sub2 arg0) {
		this.aQueue1.add(arg0);
		if (this.aQueue1.size() > 10) {
			this.aQueue1.poll();
		}
	}

	@OriginalMember(owner = "client!alp", name = "u", descriptor = "(I)Z")
	@Override
	boolean method14926(@OriginalArg(0) int arg0) {
		return !this.aQueue1.isEmpty() || this.aLong106 * -1130360274060180351L < Class305.method26889(-182242105) - 2000L;
	}

	@OriginalMember(owner = "client!alp", name = "z", descriptor = "(S)Lclient!akl;")
	@Override
	Class93_Sub22 method14921(@OriginalArg(0) short arg0) {
		return Class102.method2592(Class446.aClass446_7, client.aClass175_2.aClass24_2, (byte) 58);
	}

	@OriginalMember(owner = "client!alp", name = "j", descriptor = "(Lclient!alw;Lclient!asp;I)V")
	void method14847(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) Class93_Sub23_Sub2 arg1, @OriginalArg(2) int arg2) {
		arg0.method22522(arg1.method22905(-1037468677), (byte) -37);
	}

	@OriginalMember(owner = "client!alp", name = "f", descriptor = "(I)I")
	@Override
	int method14917(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!alp", name = "w", descriptor = "(Lclient!alw;Lclient!akm;I)V")
	@Override
	void method14918(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) Class93_Sub23 arg1, @OriginalArg(2) int arg2) {
		this.method14847(arg0, (Class93_Sub23_Sub2) arg1, 258136908);
	}

	@OriginalMember(owner = "client!alp", name = "ae", descriptor = "(Lclient!asp;)V")
	void method14848(@OriginalArg(0) Class93_Sub23_Sub2 arg0) {
		this.aQueue1.add(arg0);
		if (this.aQueue1.size() > 10) {
			this.aQueue1.poll();
		}
	}

	@OriginalMember(owner = "client!alp", name = "s", descriptor = "(Lclient!alw;Lclient!akm;)V")
	@Override
	void method14928(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) Class93_Sub23 arg1) {
		this.method14847(arg0, (Class93_Sub23_Sub2) arg1, 1898270035);
	}

	@OriginalMember(owner = "client!alp", name = "p", descriptor = "()V")
	@Override
	void method14922() {
		@Pc(4) Class93_Sub23_Sub2 local4 = (Class93_Sub23_Sub2) this.aQueue1.poll();
		if (local4 == null) {
			return;
		}
		@Pc(14) Class93_Sub22 local14 = Class102.method2592(Class446.aClass446_8, client.aClass175_2.aClass24_2, (byte) 92);
		local14.aClass93_Sub41_Sub2_1.method22407(local4.method22885(-1678286317) | local4.method22886((byte) -36) << 16, (byte) -2);
		local14.aClass93_Sub41_Sub2_1.method22602(this.method14916(local4, 65535, 1398211098), (byte) 27);
		local14.aClass93_Sub41_Sub2_1.method22458(local4.method22907(181202022) << 1 | local4.method22905(1461818217) & 0x1, -1591808004);
		client.aClass175_2.method24363(local14, -1652879956);
		local4.method22889((byte) 21);
	}

	@OriginalMember(owner = "client!alp", name = "l", descriptor = "(I)V")
	@Override
	void method14924(@OriginalArg(0) int arg0) {
		@Pc(4) Class93_Sub23_Sub2 local4 = (Class93_Sub23_Sub2) this.aQueue1.poll();
		if (local4 == null) {
			return;
		}
		@Pc(14) Class93_Sub22 local14 = Class102.method2592(Class446.aClass446_8, client.aClass175_2.aClass24_2, (byte) 22);
		local14.aClass93_Sub41_Sub2_1.method22407(local4.method22885(-1678286317) | local4.method22886((byte) -101) << 16, (byte) 101);
		local14.aClass93_Sub41_Sub2_1.method22602(this.method14916(local4, 65535, -226537743), (byte) -65);
		local14.aClass93_Sub41_Sub2_1.method22458(local4.method22907(1235421580) << 1 | local4.method22905(1584031211) & 0x1, -1591808004);
		client.aClass175_2.method24363(local14, -1983532613);
		local4.method22889((byte) 76);
	}

	@OriginalMember(owner = "client!alp", name = "c", descriptor = "()Z")
	@Override
	boolean method14912() {
		return !this.aQueue1.isEmpty() || this.aLong106 * -1130360274060180351L < Class305.method26889(844713006) - 2000L;
	}

	@OriginalMember(owner = "client!alp", name = "r", descriptor = "()Lclient!akl;")
	@Override
	Class93_Sub22 method14925() {
		return Class102.method2592(Class446.aClass446_7, client.aClass175_2.aClass24_2, (byte) 22);
	}

	@OriginalMember(owner = "client!alp", name = "ah", descriptor = "(Lclient!alw;Lclient!asp;)V")
	void method14849(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) Class93_Sub23_Sub2 arg1) {
		arg0.method22522(arg1.method22905(-823045085), (byte) -64);
	}

	@OriginalMember(owner = "client!alp", name = "al", descriptor = "(Lclient!alw;Lclient!asp;)V")
	void method14850(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) Class93_Sub23_Sub2 arg1) {
		arg0.method22522(arg1.method22905(-136914149), (byte) -90);
	}

	@OriginalMember(owner = "client!alp", name = "d", descriptor = "()V")
	@Override
	void method14923() {
		@Pc(4) Class93_Sub23_Sub2 local4 = (Class93_Sub23_Sub2) this.aQueue1.poll();
		if (local4 == null) {
			return;
		}
		@Pc(14) Class93_Sub22 local14 = Class102.method2592(Class446.aClass446_8, client.aClass175_2.aClass24_2, (byte) 7);
		local14.aClass93_Sub41_Sub2_1.method22407(local4.method22885(-1678286317) | local4.method22886((byte) -26) << 16, (byte) -40);
		local14.aClass93_Sub41_Sub2_1.method22602(this.method14916(local4, 65535, 1718512283), (byte) 33);
		local14.aClass93_Sub41_Sub2_1.method22458(local4.method22907(-1693652945) << 1 | local4.method22905(886727591) & 0x1, -1591808004);
		client.aClass175_2.method24363(local14, -1444338590);
		local4.method22889((byte) 39);
	}

	@OriginalMember(owner = "client!alp", name = "o", descriptor = "(Lclient!alw;Lclient!akm;)V")
	@Override
	void method14927(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) Class93_Sub23 arg1) {
		this.method14847(arg0, (Class93_Sub23_Sub2) arg1, 722028013);
	}

	@OriginalMember(owner = "client!alp", name = "t", descriptor = "(Lclient!asp;)V")
	void method14851(@OriginalArg(0) Class93_Sub23_Sub2 arg0) {
		this.aQueue1.add(arg0);
		if (this.aQueue1.size() > 10) {
			this.aQueue1.poll();
		}
	}
}
