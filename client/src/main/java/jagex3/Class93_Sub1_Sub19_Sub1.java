package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!auf")
public final class Class93_Sub1_Sub19_Sub1 extends Class93_Sub1_Sub19 {

	@OriginalMember(owner = "client!auf", name = "z", descriptor = "Ljava/lang/Object;")
	Object anObject9;

	@OriginalMember(owner = "client!auf", name = "<init>", descriptor = "(Lclient!wk;Ljava/lang/Object;I)V")
	Class93_Sub1_Sub19_Sub1(@OriginalArg(0) Interface69 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		super(arg0, arg2);
		this.anObject9 = arg1;
	}

	@OriginalMember(owner = "client!auf", name = "m", descriptor = "()Ljava/lang/Object;")
	@Override
	Object method23979() {
		return this.anObject9;
	}

	@OriginalMember(owner = "client!auf", name = "e", descriptor = "()Ljava/lang/Object;")
	@Override
	Object method23974() {
		return this.anObject9;
	}

	@OriginalMember(owner = "client!auf", name = "n", descriptor = "()Z")
	@Override
	boolean method23975() {
		return false;
	}

	@OriginalMember(owner = "client!auf", name = "k", descriptor = "()Ljava/lang/Object;")
	@Override
	Object method23976() {
		return this.anObject9;
	}

	@OriginalMember(owner = "client!auf", name = "f", descriptor = "()Ljava/lang/Object;")
	@Override
	Object method23977() {
		return this.anObject9;
	}

	@OriginalMember(owner = "client!auf", name = "w", descriptor = "()Z")
	@Override
	boolean method23973() {
		return false;
	}

	@OriginalMember(owner = "client!auf", name = "l", descriptor = "()Z")
	@Override
	boolean method23978() {
		return false;
	}
}
