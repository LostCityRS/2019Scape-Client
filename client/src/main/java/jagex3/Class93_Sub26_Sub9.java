package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aro")
public final class Class93_Sub26_Sub9 extends Class93_Sub26 {

	@OriginalMember(owner = "client!aro", name = "f", descriptor = "Ljava/lang/String;")
	String aString102;

	@OriginalMember(owner = "client!aro", name = "k", descriptor = "I")
	int anInt3014;

	// $FF: synthetic field
	@OriginalMember(owner = "client!aro", name = "this$0", descriptor = "Lclient!kd;")
	final Class375 aClass375_9;

	@OriginalMember(owner = "client!aro", name = "<init>", descriptor = "(Lclient!kd;)V")
	Class93_Sub26_Sub9(@OriginalArg(0) Class375 arg0) {
		this.aClass375_9 = arg0;
	}

	@OriginalMember(owner = "client!aro", name = "f", descriptor = "(Lclient!kr;)V")
	@Override
	void method22002(@OriginalArg(0) Class386 arg0) {
		arg0.method28363(this.anInt3014 * 578122687, this.aString102, 1509242154);
	}

	@OriginalMember(owner = "client!aro", name = "e", descriptor = "(Lclient!alw;B)V")
	@Override
	void method22003(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) byte arg1) {
		this.anInt3014 = arg0.method22431(-118643075) * -2131198913;
		this.aString102 = arg0.method22439(736951303);
	}

	@OriginalMember(owner = "client!aro", name = "n", descriptor = "(Lclient!kr;I)V")
	@Override
	void method22004(@OriginalArg(0) Class386 arg0, @OriginalArg(1) int arg1) {
		arg0.method28363(this.anInt3014 * 578122687, this.aString102, 1145107619);
	}

	@OriginalMember(owner = "client!aro", name = "w", descriptor = "(Lclient!kr;)V")
	@Override
	void method22007(@OriginalArg(0) Class386 arg0) {
		arg0.method28363(this.anInt3014 * 578122687, this.aString102, 427956740);
	}

	@OriginalMember(owner = "client!aro", name = "k", descriptor = "(Lclient!kr;)V")
	@Override
	void method22006(@OriginalArg(0) Class386 arg0) {
		arg0.method28363(this.anInt3014 * 578122687, this.aString102, 186604697);
	}

	@OriginalMember(owner = "client!aro", name = "m", descriptor = "(Lclient!alw;)V")
	@Override
	void method22005(@OriginalArg(0) Class93_Sub41 arg0) {
		this.anInt3014 = arg0.method22431(-118643075) * -2131198913;
		this.aString102 = arg0.method22439(938954467);
	}
}
