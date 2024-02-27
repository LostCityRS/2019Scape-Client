package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aky")
public final class Class80_Sub34 extends Class80 {

	@OriginalMember(owner = "client!aky", name = "bt", descriptor = "Lclient!cm;")
	public static Class99 aClass99_16;

	@OriginalMember(owner = "client!aky", name = "a", descriptor = "[F")
	static float[] aFloatArray42 = new float[3];

	@OriginalMember(owner = "client!aky", name = "i", descriptor = "I")
	int anInt1656;

	@OriginalMember(owner = "client!aky", name = "m", descriptor = "I")
	int anInt1657;

	@OriginalMember(owner = "client!aky", name = "g", descriptor = "I")
	int anInt1658;

	@OriginalMember(owner = "client!aky", name = "j", descriptor = "F")
	float aFloat145;

	@OriginalMember(owner = "client!aky", name = "o", descriptor = "F")
	float aFloat146;

	@OriginalMember(owner = "client!aky", name = "u", descriptor = "Lclient!cp;")
	final Class211 aClass211_1;

	@OriginalMember(owner = "client!aky", name = "l", descriptor = "Lclient!nc;")
	final Class433 aClass433_1;

	@OriginalMember(owner = "client!aky", name = "axt", descriptor = "(Lclient!yp;B)V")
	static void method14506(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = client.aBoolean728 ? 1 : 0;
	}

	@OriginalMember(owner = "client!aky", name = "<init>", descriptor = "(Lclient!cp;Lclient!xe;)V")
	Class80_Sub34(@OriginalArg(0) Class211 arg0, @OriginalArg(1) Class658 arg1) {
		this.aClass211_1 = arg0;
		this.aClass433_1 = this.aClass211_1.method25810(Js5MasterIndex.anInterface48_1, -1624047245);
		this.method14505(1764932608);
	}

	@OriginalMember(owner = "client!aky", name = "t", descriptor = "(I)V")
	void method14505(@OriginalArg(0) int arg0) {
		this.anInt1658 = this.aClass211_1.anInt3605 * 1364279885;
		this.anInt1656 = this.aClass211_1.anInt3606 * -1620516639;
		this.anInt1657 = this.aClass211_1.anInt3602 * -1703428945;
		if (this.aClass211_1.aClass487_96 != null) {
			this.aClass211_1.aClass487_96.method30171((float) (this.aClass433_1.anInt4730 * -1146755817), (float) (this.aClass433_1.anInt4731 * -1950447595), (float) (this.aClass433_1.anInt4732 * -476916787), aFloatArray42);
		}
		this.aFloat146 = aFloatArray42[0];
		this.aFloat145 = aFloatArray42[2];
	}
}
