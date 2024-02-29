package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hr")
public final class ComponentHook {

	@OriginalMember(owner = "client!hr", name = "ao", descriptor = "I")
	static int anInt4139;

	@OriginalMember(owner = "client!hr", name = "n", descriptor = "(Lclient!alw;)Lclient!hr;")
	public static ComponentHook method27334(@OriginalArg(0) Class93_Sub41 arg0) {
		@Pc(3) int local3 = arg0.method22425((short) 16384);
		if (local3 == 0) {
			return null;
		}
		local3--;
		arg0.anInt3070 += -1445626955;
		@Pc(18) int local18 = arg0.method22431(-118643075);
		@Pc(21) Object[] local21 = new Object[local3];
		for (@Pc(23) int local23 = 0; local23 < local3; local23++) {
			@Pc(30) int local30 = arg0.method22425((short) 16384);
			if (local30 == 0) {
				local21[local23] = BaseVarType.method30338(Integer.class, -47609621).decode(arg0);
			} else if (local30 == 1) {
				local21[local23] = BaseVarType.method30338(String.class, -47609621).decode(arg0);
			} else {
				throw new IllegalStateException("Unrecognised type ID in deserialise: " + local30);
			}
		}
		return new ComponentHook(local18, local21);
	}

	@OriginalMember(owner = "client!hr", name = "ajp", descriptor = "(Lclient!yf;B)V")
	static void method27335(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		Class155.anInt2066 = 0;
	}

	@OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(I[Ljava/lang/Object;)V")
	ComponentHook(@OriginalArg(0) int arg0, @OriginalArg(1) Object[] arg1) {
	}
}
