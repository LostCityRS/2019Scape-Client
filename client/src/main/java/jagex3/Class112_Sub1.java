package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afq")
public abstract class Class112_Sub1 extends Class112 {

	@OriginalMember(owner = "client!afq", name = "e", descriptor = "I")
	protected static final int anInt3198 = 4;

	@OriginalMember(owner = "client!afq", name = "aap", descriptor = "(Lclient!yf;I)V")
	static void method23456(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		if (client.aString146 == null || local12 >= Class623.anInt5843 * 1581594575) {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
		} else {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class93_Sub1_Sub2.aClass170Array1[local12].anInt2996 * -1529840147;
		}
	}

	@OriginalMember(owner = "client!afq", name = "<init>", descriptor = "()V")
	Class112_Sub1() {
	}

	@OriginalMember(owner = "client!afq", name = "g", descriptor = "(ILclient!dp;)V")
	public abstract void method23444(@OriginalArg(0) int arg0, @OriginalArg(1) Interface18 arg1);

	@OriginalMember(owner = "client!afq", name = "ag", descriptor = "(IIIIIIZZ)V")
	public abstract void method23445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7);

	@OriginalMember(owner = "client!afq", name = "b", descriptor = "(ILclient!dp;)V")
	public abstract void method23446(@OriginalArg(0) int arg0, @OriginalArg(1) Interface18 arg1);

	@OriginalMember(owner = "client!afq", name = "a", descriptor = "(IIIIIIZZ)V")
	public abstract void method23447(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7);

	@OriginalMember(owner = "client!afq", name = "x", descriptor = "(Lclient!dw;)V")
	public abstract void method23448(@OriginalArg(0) Interface19 arg0);

	@OriginalMember(owner = "client!afq", name = "j", descriptor = "(ILclient!dp;)V")
	public abstract void method23449(@OriginalArg(0) int arg0, @OriginalArg(1) Interface18 arg1);

	@OriginalMember(owner = "client!afq", name = "i", descriptor = "(ILclient!dp;)V")
	public abstract void method23450(@OriginalArg(0) int arg0, @OriginalArg(1) Interface18 arg1);

	@OriginalMember(owner = "client!afq", name = "t", descriptor = "(Lclient!dw;)V")
	public abstract void method23451(@OriginalArg(0) Interface19 arg0);

	@OriginalMember(owner = "client!afq", name = "ae", descriptor = "(IIIIIIZZ)V")
	public abstract void method23452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) boolean arg7);

	@OriginalMember(owner = "client!afq", name = "h", descriptor = "()Z")
	public abstract boolean method23453();

	@OriginalMember(owner = "client!afq", name = "ah", descriptor = "()Z")
	public abstract boolean method23454();

	@OriginalMember(owner = "client!afq", name = "al", descriptor = "()Z")
	public abstract boolean method23455();
}
