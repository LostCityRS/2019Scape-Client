package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xw")
public final class Class673 {

	@OriginalMember(owner = "client!xw", name = "p", descriptor = "I")
	int anInt6024;

	@OriginalMember(owner = "client!xw", name = "n", descriptor = "I")
	int anInt6025;

	@OriginalMember(owner = "client!xw", name = "m", descriptor = "I")
	int anInt6026;

	@OriginalMember(owner = "client!xw", name = "k", descriptor = "I")
	int anInt6027;

	@OriginalMember(owner = "client!xw", name = "f", descriptor = "I")
	int anInt6028;

	@OriginalMember(owner = "client!xw", name = "d", descriptor = "I")
	int anInt6029;

	@OriginalMember(owner = "client!xw", name = "l", descriptor = "I")
	int anInt6030;

	@OriginalMember(owner = "client!xw", name = "e", descriptor = "I")
	int anInt6031;

	@OriginalMember(owner = "client!xw", name = "z", descriptor = "I")
	int anInt6032;

	@OriginalMember(owner = "client!xw", name = "c", descriptor = "I")
	int anInt6033;

	@OriginalMember(owner = "client!xw", name = "w", descriptor = "I")
	int anInt6034;

	@OriginalMember(owner = "client!xw", name = "u", descriptor = "I")
	int anInt6035;

	@OriginalMember(owner = "client!xw", name = "v", descriptor = "(IB)V")
	public static void method33270(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(2) Class240 local2 = Class658.aClass240_91;
		synchronized (Class658.aClass240_91) {
			Class658.aClass240_91.method25925(arg0, (byte) -22);
		}
		local2 = Class658.aClass240_92;
		synchronized (Class658.aClass240_92) {
			Class658.aClass240_92.method25925(arg0, (byte) 13);
		}
	}

	@OriginalMember(owner = "client!xw", name = "<init>", descriptor = "()V")
	Class673() {
	}

	@OriginalMember(owner = "client!xw", name = "m", descriptor = "(Lclient!xw;)Z")
	boolean method33266(@OriginalArg(0) Class673 arg0) {
		return arg0.anInt6024 * 976933385 == this.anInt6024 * 976933385 && this.anInt6029 * -29624619 == arg0.anInt6029 * -29624619 && arg0.anInt6033 * 667123649 == this.anInt6033 * 667123649;
	}

	@OriginalMember(owner = "client!xw", name = "e", descriptor = "(Lclient!xw;I)Z")
	boolean method33267(@OriginalArg(0) Class673 arg0, @OriginalArg(1) int arg1) {
		return arg0.anInt6024 * 976933385 == this.anInt6024 * 976933385 && this.anInt6029 * -29624619 == arg0.anInt6029 * -29624619 && arg0.anInt6033 * 667123649 == this.anInt6033 * 667123649;
	}

	@OriginalMember(owner = "client!xw", name = "k", descriptor = "(Lclient!xw;)Z")
	boolean method33268(@OriginalArg(0) Class673 arg0) {
		return arg0.anInt6024 * 976933385 == this.anInt6024 * 976933385 && this.anInt6029 * -29624619 == arg0.anInt6029 * -29624619 && arg0.anInt6033 * 667123649 == this.anInt6033 * 667123649;
	}

	@OriginalMember(owner = "client!xw", name = "n", descriptor = "(Lclient!xw;)Z")
	boolean method33269(@OriginalArg(0) Class673 arg0) {
		return arg0.anInt6024 * 976933385 == this.anInt6024 * 976933385 && this.anInt6029 * -29624619 == arg0.anInt6029 * -29624619 && arg0.anInt6033 * 667123649 == this.anInt6033 * 667123649;
	}
}
