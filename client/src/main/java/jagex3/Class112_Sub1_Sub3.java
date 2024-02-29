package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!apz")
public abstract class Class112_Sub1_Sub3 extends Class112_Sub1 {

	@OriginalMember(owner = "client!apz", name = "n", descriptor = "Lclient!afc;")
	Class104_Sub2 aClass104_Sub2_33;

	@OriginalMember(owner = "client!apz", name = "<init>", descriptor = "(Lclient!afc;)V")
	Class112_Sub1_Sub3(@OriginalArg(0) Class104_Sub2 arg0) {
		this.aClass104_Sub2_33 = arg0;
	}

	@OriginalMember(owner = "client!apz", name = "ai", descriptor = "()V")
	final void method23457() {
		if (this.aClass104_Sub2_33.method20446((byte) -68) == this) {
			this.aClass104_Sub2_33.method20922();
		}
	}

	@OriginalMember(owner = "client!apz", name = "ac", descriptor = "()V")
	final void method23458() {
		if (this.aClass104_Sub2_33.method20446((byte) -96) == this) {
			this.aClass104_Sub2_33.method20922();
		}
	}

	@OriginalMember(owner = "client!apz", name = "o", descriptor = "()Z")
	@Override
	boolean method23754() {
		this.aClass104_Sub2_33.method20929();
		return true;
	}

	@OriginalMember(owner = "client!apz", name = "k", descriptor = "()Z")
	@Override
	boolean method23751() {
		this.aClass104_Sub2_33.method20929();
		return true;
	}

	@OriginalMember(owner = "client!apz", name = "v", descriptor = "()Z")
	@Override
	boolean method23760() {
		this.aClass104_Sub2_33.method20929();
		return true;
	}

	@OriginalMember(owner = "client!apz", name = "aw", descriptor = "()V")
	final void method23459() {
		if (this.aClass104_Sub2_33.method20446((byte) -44) == this) {
			this.aClass104_Sub2_33.method20922();
		}
	}
}
