package jagex3;

import java.util.LinkedList;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vw")
public final class Class626 {

	@OriginalMember(owner = "client!vw", name = "oh", descriptor = "I")
	public static int anInt5865;

	@OriginalMember(owner = "client!vw", name = "e", descriptor = "I")
	final int anInt5862;

	@OriginalMember(owner = "client!vw", name = "f", descriptor = "Ljava/util/LinkedList;")
	final LinkedList aLinkedList9;

	@OriginalMember(owner = "client!vw", name = "n", descriptor = "I")
	final int anInt5864;

	@OriginalMember(owner = "client!vw", name = "m", descriptor = "I")
	final int anInt5863;

	@OriginalMember(owner = "client!vw", name = "k", descriptor = "F")
	final float aFloat346;

	@OriginalMember(owner = "client!vw", name = "aoo", descriptor = "(Lclient!yf;I)V")
	static void method32424(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class65.aClass123_Sub1_2.method8986((byte) -35) == null ? -1 : Class65.aClass123_Sub1_2.method8986((byte) -58).anInt4225 * -210852351;
	}

	@OriginalMember(owner = "client!vw", name = "e", descriptor = "(Lclient!py;Lclient!py;II)V")
	public static void method32425(@OriginalArg(0) Class497 arg0, @OriginalArg(1) Class497 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Class93_Sub1_Sub10.aClass497_94 = arg0;
		Class93_Sub1_Sub10.aClass497_95 = arg1;
	}

	@OriginalMember(owner = "client!vw", name = "<init>", descriptor = "(ILjava/util/LinkedList;IIF)V")
	Class626(@OriginalArg(0) int arg0, @OriginalArg(1) LinkedList arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4) {
		this.anInt5862 = arg0 * -9922527;
		this.aLinkedList9 = arg1;
		this.anInt5864 = arg2 * -965967917;
		this.anInt5863 = arg3 * -742829027;
		this.aFloat346 = arg4;
	}
}
