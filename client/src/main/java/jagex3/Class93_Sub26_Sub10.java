package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!arp")
public final class Class93_Sub26_Sub10 extends Class93_Sub26 {

	@OriginalMember(owner = "client!arp", name = "f", descriptor = "B")
	byte aByte85;

	// $FF: synthetic field
	@OriginalMember(owner = "client!arp", name = "this$0", descriptor = "Lclient!kd;")
	final Class375 aClass375_10;

	@OriginalMember(owner = "client!arp", name = "k", descriptor = "I")
	int anInt3015;

	@OriginalMember(owner = "client!arp", name = "<init>", descriptor = "(Lclient!kd;)V")
	Class93_Sub26_Sub10(@OriginalArg(0) Class375 arg0) {
		this.aClass375_10 = arg0;
		this.anInt3015 = 1702211119;
	}

	@OriginalMember(owner = "client!arp", name = "m", descriptor = "(Lclient!alw;)V")
	@Override
	void method22005(@OriginalArg(0) Class93_Sub41 arg0) {
		this.anInt3015 = arg0.method22427(-1434290800) * -1702211119;
		this.aByte85 = arg0.method22426(1102006040);
	}

	@OriginalMember(owner = "client!arp", name = "e", descriptor = "(Lclient!alw;B)V")
	@Override
	void method22003(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) byte arg1) {
		this.anInt3015 = arg0.method22427(-1434290800) * -1702211119;
		this.aByte85 = arg0.method22426(571496357);
	}

	@OriginalMember(owner = "client!arp", name = "n", descriptor = "(Lclient!kr;I)V")
	@Override
	void method22004(@OriginalArg(0) Class386 arg0, @OriginalArg(1) int arg1) {
		arg0.method28357(this.anInt3015 * -1468553423, this.aByte85, (byte) 1);
	}

	@OriginalMember(owner = "client!arp", name = "k", descriptor = "(Lclient!kr;)V")
	@Override
	void method22006(@OriginalArg(0) Class386 arg0) {
		arg0.method28357(this.anInt3015 * -1468553423, this.aByte85, (byte) 1);
	}

	@OriginalMember(owner = "client!arp", name = "w", descriptor = "(Lclient!kr;)V")
	@Override
	void method22007(@OriginalArg(0) Class386 arg0) {
		arg0.method28357(this.anInt3015 * -1468553423, this.aByte85, (byte) 1);
	}

	@OriginalMember(owner = "client!arp", name = "f", descriptor = "(Lclient!kr;)V")
	@Override
	void method22002(@OriginalArg(0) Class386 arg0) {
		arg0.method28357(this.anInt3015 * -1468553423, this.aByte85, (byte) 1);
	}
}
