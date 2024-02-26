package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aly")
public final class Class163_Sub1 extends Class163 {

	@OriginalMember(owner = "client!aly", name = "s", descriptor = "I")
	int anInt2085;

	@OriginalMember(owner = "client!aly", name = "m", descriptor = "I")
	public int anInt2086;

	@OriginalMember(owner = "client!aly", name = "o", descriptor = "Ljava/lang/String;")
	public String aString61;

	@OriginalMember(owner = "client!aly", name = "k", descriptor = "Ljava/lang/String;")
	String aString62;

	@OriginalMember(owner = "client!aly", name = "j", descriptor = "Ljava/lang/String;")
	public String aString63;

	@OriginalMember(owner = "client!aly", name = "a", descriptor = "I")
	public int anInt2087 = 965253749;

	@OriginalMember(owner = "client!aly", name = "ayv", descriptor = "(Lclient!yp;I)V")
	static void method15772(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class123_Sub3.anInt1160 * 1481907007;
	}

	@OriginalMember(owner = "client!aly", name = "<init>", descriptor = "()V")
	Class163_Sub1() {
	}

	@OriginalMember(owner = "client!aly", name = "s", descriptor = "(I)Lclient!wq;")
	Class644 method15765(@OriginalArg(0) int arg0) {
		return Class90.aClass644Array1[this.anInt2080 * 1179636855];
	}

	@OriginalMember(owner = "client!aly", name = "k", descriptor = "(I)I")
	public int method15766(@OriginalArg(0) int arg0) {
		return this.anInt2085 * 1899036717 == 0 ? this.method15765(118552340).anInt5644 * 1638139689 : this.anInt2085 * 1899036717;
	}

	@OriginalMember(owner = "client!aly", name = "x", descriptor = "(B)Ljava/lang/String;")
	public String method15767(@OriginalArg(0) byte arg0) {
		return this.anInt2085 * 1899036717 == 0 ? this.method15765(-752257201).aString234 : this.aString62;
	}

	@OriginalMember(owner = "client!aly", name = "h", descriptor = "()Ljava/lang/String;")
	public String method15768() {
		return this.anInt2085 * 1899036717 == 0 ? this.method15765(-1736359052).aString234 : this.aString62;
	}

	@OriginalMember(owner = "client!aly", name = "r", descriptor = "()Ljava/lang/String;")
	public String method15769() {
		return this.anInt2085 * 1899036717 == 0 ? this.method15765(-1187309646).aString234 : this.aString62;
	}

	@OriginalMember(owner = "client!aly", name = "q", descriptor = "()Ljava/lang/String;")
	public String method15770() {
		return this.anInt2085 * 1899036717 == 0 ? this.method15765(-1661865955).aString234 : this.aString62;
	}

	@OriginalMember(owner = "client!aly", name = "w", descriptor = "()Lclient!wq;")
	Class644 method15771() {
		return Class90.aClass644Array1[this.anInt2080 * 1179636855];
	}
}
