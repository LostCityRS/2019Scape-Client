package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public final class Class150 {

	@OriginalMember(owner = "client!ak", name = "e", descriptor = "I")
	int anInt1501;

	@OriginalMember(owner = "client!ak", name = "n", descriptor = "I")
	int anInt1500;

	@OriginalMember(owner = "client!ak", name = "m", descriptor = "I")
	int anInt1499;

	@OriginalMember(owner = "client!ak", name = "k", descriptor = "I")
	int anInt1502;

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(Lclient!ak;)V")
	Class150(@OriginalArg(0) Class150 arg0) {
		this.anInt1501 = arg0.anInt1501;
		this.anInt1500 = arg0.anInt1500;
		this.anInt1499 = arg0.anInt1499;
		this.anInt1502 = arg0.anInt1502;
	}

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "()V")
	Class150() {
	}
}
