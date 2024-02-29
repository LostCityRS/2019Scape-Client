package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public final class Class216 {

	@OriginalMember(owner = "client!cw", name = "k", descriptor = "I")
	final int anInt3654;

	@OriginalMember(owner = "client!cw", name = "e", descriptor = "I")
	final int anInt3657;

	@OriginalMember(owner = "client!cw", name = "n", descriptor = "I")
	final int anInt3655;

	@OriginalMember(owner = "client!cw", name = "m", descriptor = "I")
	final int anInt3656;

	@OriginalMember(owner = "client!cw", name = "f", descriptor = "S")
	final short aShort159;

	@OriginalMember(owner = "client!cw", name = "w", descriptor = "S")
	final short aShort158;

	@OriginalMember(owner = "client!cw", name = "l", descriptor = "S")
	final short aShort157;

	@OriginalMember(owner = "client!cw", name = "u", descriptor = "B")
	final byte aByte109;

	@OriginalMember(owner = "client!cw", name = "z", descriptor = "Z")
	final boolean aBoolean649;

	@OriginalMember(owner = "client!cw", name = "p", descriptor = "I")
	final int anInt3658;

	@OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	Class216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.anInt3654 = arg0;
		this.anInt3657 = arg1;
		this.anInt3655 = arg2;
		this.anInt3656 = arg3;
		this.aShort159 = (short) arg4;
		this.aShort158 = (short) arg5;
		this.aShort157 = (short) arg6;
		this.aByte109 = (byte) arg8;
		this.aBoolean649 = arg10;
		this.anInt3658 = arg11;
	}
}
