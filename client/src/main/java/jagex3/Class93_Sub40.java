package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!alu")
public class Class93_Sub40 extends Class93 {

	@OriginalMember(owner = "client!alu", name = "k", descriptor = "I")
	public final int anInt3172;

	@OriginalMember(owner = "client!alu", name = "f", descriptor = "I")
	public final int anInt3171;

	@OriginalMember(owner = "client!alu", name = "<init>", descriptor = "(II)V")
	public Class93_Sub40(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3172 = arg0 * 1371691223;
		this.anInt3171 = arg1 * -220151407;
	}

	@OriginalMember(owner = "client!alu", name = "n", descriptor = "()Z")
	public boolean method23204() {
		return true;
	}

	@OriginalMember(owner = "client!alu", name = "e", descriptor = "(B)Z")
	public boolean method23205(@OriginalArg(0) byte arg0) {
		return true;
	}

	@OriginalMember(owner = "client!alu", name = "m", descriptor = "()Z")
	public boolean method23206() {
		return true;
	}

	@OriginalMember(owner = "client!alu", name = "k", descriptor = "()Z")
	public boolean method23207() {
		return true;
	}
}
