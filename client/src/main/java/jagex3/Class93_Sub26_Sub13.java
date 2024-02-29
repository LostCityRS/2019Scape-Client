package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!arx")
public final class Class93_Sub26_Sub13 extends Class93_Sub26 {

	@OriginalMember(owner = "client!arx", name = "f", descriptor = "Z")
	boolean aBoolean508;

	// $FF: synthetic field
	@OriginalMember(owner = "client!arx", name = "this$0", descriptor = "Lclient!kd;")
	final Class375 aClass375_13;

	@OriginalMember(owner = "client!arx", name = "k", descriptor = "I")
	int anInt3049;

	@OriginalMember(owner = "client!arx", name = "<init>", descriptor = "(Lclient!kd;)V")
	Class93_Sub26_Sub13(@OriginalArg(0) Class375 arg0) {
		this.aClass375_13 = arg0;
		this.anInt3049 = 1415942809;
	}

	@OriginalMember(owner = "client!arx", name = "k", descriptor = "(Lclient!kr;)V")
	@Override
	void method22006(@OriginalArg(0) Class386 arg0) {
		arg0.method28393(this.anInt3049 * -1036034473, this.aBoolean508, (byte) -16);
	}

	@OriginalMember(owner = "client!arx", name = "w", descriptor = "(Lclient!kr;)V")
	@Override
	void method22007(@OriginalArg(0) Class386 arg0) {
		arg0.method28393(this.anInt3049 * -1036034473, this.aBoolean508, (byte) -4);
	}

	@OriginalMember(owner = "client!arx", name = "n", descriptor = "(Lclient!kr;I)V")
	@Override
	void method22004(@OriginalArg(0) Class386 arg0, @OriginalArg(1) int arg1) {
		arg0.method28393(this.anInt3049 * -1036034473, this.aBoolean508, (byte) 6);
	}

	@OriginalMember(owner = "client!arx", name = "m", descriptor = "(Lclient!alw;)V")
	@Override
	void method22005(@OriginalArg(0) Class93_Sub41 arg0) {
		this.anInt3049 = arg0.method22427(-1434290800) * -1415942809;
		this.aBoolean508 = arg0.method22425((short) 16384) == 1;
	}

	@OriginalMember(owner = "client!arx", name = "e", descriptor = "(Lclient!alw;B)V")
	@Override
	void method22003(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) byte arg1) {
		this.anInt3049 = arg0.method22427(-1434290800) * -1415942809;
		this.aBoolean508 = arg0.method22425((short) 16384) == 1;
	}

	@OriginalMember(owner = "client!arx", name = "f", descriptor = "(Lclient!kr;)V")
	@Override
	void method22002(@OriginalArg(0) Class386 arg0) {
		arg0.method28393(this.anInt3049 * -1036034473, this.aBoolean508, (byte) -11);
	}
}
