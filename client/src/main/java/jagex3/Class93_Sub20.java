package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!akj")
public final class Class93_Sub20 extends Class93 {

	@OriginalMember(owner = "client!akj", name = "k", descriptor = "S")
	public short aShort98;

	@OriginalMember(owner = "client!akj", name = "e", descriptor = "(IB)Lclient!ic;")
	public static Class333 method13658(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (arg0 == Class333.aClass333_4.anInt4190 * 1516832491) {
			return Class333.aClass333_4;
		} else if (arg0 == Class333.aClass333_5.anInt4190 * 1516832491) {
			return Class333.aClass333_5;
		} else if (arg0 == Class333.aClass333_3.anInt4190 * 1516832491) {
			return Class333.aClass333_3;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!akj", name = "<init>", descriptor = "(S)V")
	public Class93_Sub20(@OriginalArg(0) short arg0) {
		this.aShort98 = arg0;
	}
}
