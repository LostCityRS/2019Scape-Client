package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!li")
public final class Class398 implements Interface32 {

	@OriginalMember(owner = "client!li", name = "e", descriptor = "I")
	public final int anInt4833;

	@OriginalMember(owner = "client!li", name = "k", descriptor = "(Lclient!alw;)Lclient!li;")
	public static Class398 method28672(@OriginalArg(0) Class93_Sub41 arg0) {
		@Pc(3) int local3 = arg0.method22448(-786810799);
		return new Class398(local3);
	}

	@OriginalMember(owner = "client!li", name = "m", descriptor = "(Lclient!alw;)Lclient!li;")
	public static Class398 method28673(@OriginalArg(0) Class93_Sub41 arg0) {
		@Pc(3) int local3 = arg0.method22448(-652502672);
		return new Class398(local3);
	}

	@OriginalMember(owner = "client!li", name = "ayg", descriptor = "(Lclient!yf;B)V")
	static void method28674(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class659.anInt5983 * 1565516845;
	}

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "(I)V")
	Class398(@OriginalArg(0) int arg0) {
		this.anInt4833 = arg0 * 917257497;
	}

	@OriginalMember(owner = "client!li", name = "n", descriptor = "(S)Lclient!kt;")
	@Override
	public Class388 method28759(@OriginalArg(0) short arg0) {
		return Class388.aClass388_9;
	}

	@OriginalMember(owner = "client!li", name = "l", descriptor = "()Lclient!kt;")
	@Override
	public Class388 method28760() {
		return Class388.aClass388_9;
	}
}
