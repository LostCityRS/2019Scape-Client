package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!arp")
public class Class93_Sub26_Sub10 extends Class93_Sub26 {

	@OriginalMember(owner = "client!arp", name = "f", descriptor = "B")
	byte aByte85;

	// $FF: synthetic field
	@OriginalMember(owner = "client!arp", name = "this$0", descriptor = "Lclient!kd;")
	final Class375 this$0;

	@OriginalMember(owner = "client!arp", name = "k", descriptor = "I")
	int anInt3015;

	@OriginalMember(owner = "client!arp", name = "<init>", descriptor = "(Lclient!kd;)V", line = 129)
	Class93_Sub26_Sub10(@OriginalArg(0) Class375 arg0) {
		this.this$0 = arg0;
		this.anInt3015 = 1702211119;
	}

	@OriginalMember(owner = "client!arp", name = "m", descriptor = "(Lclient!alw;)V", line = 132)
	@Override
	void method21994(@OriginalArg(0) Packet arg0) {
		this.anInt3015 = arg0.g2(-1434290800) * -1702211119;
		this.aByte85 = arg0.g1b(1102006040);
	}

	@OriginalMember(owner = "client!arp", name = "e", descriptor = "(Lclient!alw;B)V", line = 132)
	@Override
	void method21992(@OriginalArg(0) Packet arg0, @OriginalArg(1) byte arg1) {
		this.anInt3015 = arg0.g2(-1434290800) * -1702211119;
		this.aByte85 = arg0.g1b(571496357);
	}

	@OriginalMember(owner = "client!arp", name = "n", descriptor = "(Lclient!kr;I)V", line = 137)
	@Override
	void method21993(@OriginalArg(0) Class386 arg0, @OriginalArg(1) int arg1) {
		arg0.method28203(this.anInt3015 * -1468553423, this.aByte85, (byte) 1);
	}

	@OriginalMember(owner = "client!arp", name = "k", descriptor = "(Lclient!kr;)V", line = 137)
	@Override
	void method21995(@OriginalArg(0) Class386 arg0) {
		arg0.method28203(this.anInt3015 * -1468553423, this.aByte85, (byte) 1);
	}

	@OriginalMember(owner = "client!arp", name = "w", descriptor = "(Lclient!kr;)V", line = 137)
	@Override
	void method21996(@OriginalArg(0) Class386 arg0) {
		arg0.method28203(this.anInt3015 * -1468553423, this.aByte85, (byte) 1);
	}

	@OriginalMember(owner = "client!arp", name = "f", descriptor = "(Lclient!kr;)V", line = 137)
	@Override
	void method21991(@OriginalArg(0) Class386 arg0) {
		arg0.method28203(this.anInt3015 * -1468553423, this.aByte85, (byte) 1);
	}
}
