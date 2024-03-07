package com.jagex;

import java.util.LinkedList;
import java.util.Queue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!alp")
public class Class163_Sub1 extends Class163 {

	@OriginalMember(owner = "client!alp", name = "w", descriptor = "Ljava/util/Queue;")
	final Queue aQueue1 = new LinkedList();

	@OriginalMember(owner = "client!alp", name = "<init>", descriptor = "()V", line = 15)
	Class163_Sub1() {
	}

	@OriginalMember(owner = "client!alp", name = "i", descriptor = "(Lclient!asp;B)V", line = 18)
	void method14845(@OriginalArg(0) Class93_Sub23_Sub2 arg0, @OriginalArg(1) byte arg1) {
		this.aQueue1.add(arg0);
		if (this.aQueue1.size() > 10) {
			this.aQueue1.poll();
		}
	}

	@OriginalMember(owner = "client!alp", name = "ag", descriptor = "(Lclient!asp;)V", line = 18)
	void method14846(@OriginalArg(0) Class93_Sub23_Sub2 arg0) {
		this.aQueue1.add(arg0);
		if (this.aQueue1.size() > 10) {
			this.aQueue1.poll();
		}
	}

	@OriginalMember(owner = "client!alp", name = "ae", descriptor = "(Lclient!asp;)V", line = 18)
	void method14847(@OriginalArg(0) Class93_Sub23_Sub2 arg0) {
		this.aQueue1.add(arg0);
		if (this.aQueue1.size() > 10) {
			this.aQueue1.poll();
		}
	}

	@OriginalMember(owner = "client!alp", name = "t", descriptor = "(Lclient!asp;)V", line = 18)
	void method14848(@OriginalArg(0) Class93_Sub23_Sub2 arg0) {
		this.aQueue1.add(arg0);
		if (this.aQueue1.size() > 10) {
			this.aQueue1.poll();
		}
	}

	@OriginalMember(owner = "client!alp", name = "p", descriptor = "()V", line = 23)
	@Override
	void method14918() {
		@Pc(4) Class93_Sub23_Sub2 local4 = (Class93_Sub23_Sub2) this.aQueue1.poll();
		if (local4 == null) {
			return;
		}
		@Pc(14) Class93_Sub22 local14 = Class102.method2588(Class446.aClass446_8, client.aClass175_2.aClass24_2, (byte) 92);
		local14.aPacketBit_1.p4(local4.method22875(-1678286317) | local4.method22876((byte) -36) << 16, (byte) -2);
		local14.aPacketBit_1.p2_alt1(this.method14908(local4, 65535, 1398211098), (byte) 27);
		local14.aPacketBit_1.p1_alt1(local4.method22896(181202022) << 1 | local4.method22894(1461818217) & 0x1, -1591808004);
		client.aClass175_2.method24356(local14, -1652879956);
		local4.method22879((byte) 21);
	}

	@OriginalMember(owner = "client!alp", name = "l", descriptor = "(I)V", line = 23)
	@Override
	void method14920(@OriginalArg(0) int arg0) {
		@Pc(4) Class93_Sub23_Sub2 local4 = (Class93_Sub23_Sub2) this.aQueue1.poll();
		if (local4 == null) {
			return;
		}
		@Pc(14) Class93_Sub22 local14 = Class102.method2588(Class446.aClass446_8, client.aClass175_2.aClass24_2, (byte) 22);
		local14.aPacketBit_1.p4(local4.method22875(-1678286317) | local4.method22876((byte) -101) << 16, (byte) 101);
		local14.aPacketBit_1.p2_alt1(this.method14908(local4, 65535, -226537743), (byte) -65);
		local14.aPacketBit_1.p1_alt1(local4.method22896(1235421580) << 1 | local4.method22894(1584031211) & 0x1, -1591808004);
		client.aClass175_2.method24356(local14, -1983532613);
		local4.method22879((byte) 76);
	}

	@OriginalMember(owner = "client!alp", name = "d", descriptor = "()V", line = 23)
	@Override
	void method14919() {
		@Pc(4) Class93_Sub23_Sub2 local4 = (Class93_Sub23_Sub2) this.aQueue1.poll();
		if (local4 == null) {
			return;
		}
		@Pc(14) Class93_Sub22 local14 = Class102.method2588(Class446.aClass446_8, client.aClass175_2.aClass24_2, (byte) 7);
		local14.aPacketBit_1.p4(local4.method22875(-1678286317) | local4.method22876((byte) -26) << 16, (byte) -40);
		local14.aPacketBit_1.p2_alt1(this.method14908(local4, 65535, 1718512283), (byte) 33);
		local14.aPacketBit_1.p1_alt1(local4.method22896(-1693652945) << 1 | local4.method22894(886727591) & 0x1, -1591808004);
		client.aClass175_2.method24356(local14, -1444338590);
		local4.method22879((byte) 39);
	}

	@OriginalMember(owner = "client!alp", name = "u", descriptor = "(I)Z", line = 34)
	@Override
	boolean method14922(@OriginalArg(0) int arg0) {
		return !this.aQueue1.isEmpty() || this.aLong106 * -1130360274060180351L < Class305.method26797(-182242105) - 2000L;
	}

	@OriginalMember(owner = "client!alp", name = "c", descriptor = "()Z", line = 34)
	@Override
	boolean method14913() {
		return !this.aQueue1.isEmpty() || this.aLong106 * -1130360274060180351L < Class305.method26797(844713006) - 2000L;
	}

	@OriginalMember(owner = "client!alp", name = "z", descriptor = "(S)Lclient!akl;", line = 38)
	@Override
	Class93_Sub22 method14917(@OriginalArg(0) short arg0) {
		return Class102.method2588(Class446.aClass446_7, client.aClass175_2.aClass24_2, (byte) 58);
	}

	@OriginalMember(owner = "client!alp", name = "r", descriptor = "()Lclient!akl;", line = 38)
	@Override
	Class93_Sub22 method14921() {
		return Class102.method2588(Class446.aClass446_7, client.aClass175_2.aClass24_2, (byte) 22);
	}

	@OriginalMember(owner = "client!alp", name = "j", descriptor = "(Lclient!alw;Lclient!asp;I)V", line = 42)
	void method14849(@OriginalArg(0) Packet arg0, @OriginalArg(1) Class93_Sub23_Sub2 arg1, @OriginalArg(2) int arg2) {
		arg0.p1(arg1.method22894(-1037468677), (byte) -37);
	}

	@OriginalMember(owner = "client!alp", name = "ah", descriptor = "(Lclient!alw;Lclient!asp;)V", line = 42)
	void method14850(@OriginalArg(0) Packet arg0, @OriginalArg(1) Class93_Sub23_Sub2 arg1) {
		arg0.p1(arg1.method22894(-823045085), (byte) -64);
	}

	@OriginalMember(owner = "client!alp", name = "al", descriptor = "(Lclient!alw;Lclient!asp;)V", line = 42)
	void method14851(@OriginalArg(0) Packet arg0, @OriginalArg(1) Class93_Sub23_Sub2 arg1) {
		arg0.p1(arg1.method22894(-136914149), (byte) -90);
	}

	@OriginalMember(owner = "client!alp", name = "v", descriptor = "()I", line = 46)
	@Override
	int method14914() {
		return 1;
	}

	@OriginalMember(owner = "client!alp", name = "f", descriptor = "(I)I", line = 46)
	@Override
	int method14915(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!alp", name = "w", descriptor = "(Lclient!alw;Lclient!akm;I)V", line = 50)
	@Override
	void method14916(@OriginalArg(0) Packet arg0, @OriginalArg(1) Class93_Sub23 arg1, @OriginalArg(2) int arg2) {
		this.method14849(arg0, (Class93_Sub23_Sub2) arg1, 258136908);
	}

	@OriginalMember(owner = "client!alp", name = "s", descriptor = "(Lclient!alw;Lclient!akm;)V", line = 50)
	@Override
	void method14924(@OriginalArg(0) Packet arg0, @OriginalArg(1) Class93_Sub23 arg1) {
		this.method14849(arg0, (Class93_Sub23_Sub2) arg1, 1898270035);
	}

	@OriginalMember(owner = "client!alp", name = "o", descriptor = "(Lclient!alw;Lclient!akm;)V", line = 50)
	@Override
	void method14923(@OriginalArg(0) Packet arg0, @OriginalArg(1) Class93_Sub23 arg1) {
		this.method14849(arg0, (Class93_Sub23_Sub2) arg1, 722028013);
	}
}
