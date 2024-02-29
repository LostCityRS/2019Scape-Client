package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ey")
public final class Class254 {

	@OriginalMember(owner = "client!ey", name = "n", descriptor = "F")
	float aFloat281;

	@OriginalMember(owner = "client!ey", name = "e", descriptor = "I")
	int anInt3893;

	@OriginalMember(owner = "client!ey", name = "l", descriptor = "Lclient!ey;")
	Class254 aClass254_1;

	@OriginalMember(owner = "client!ey", name = "m", descriptor = "F")
	float aFloat282 = Float.MAX_VALUE;

	@OriginalMember(owner = "client!ey", name = "k", descriptor = "F")
	float aFloat283 = Float.MAX_VALUE;

	@OriginalMember(owner = "client!ey", name = "f", descriptor = "F")
	float aFloat284 = Float.MAX_VALUE;

	@OriginalMember(owner = "client!ey", name = "w", descriptor = "F")
	float aFloat280 = Float.MAX_VALUE;

	@OriginalMember(owner = "client!ey", name = "e", descriptor = "(B)[Lclient!vs;")
	static Class623[] method26091(@OriginalArg(0) byte arg0) {
		return new Class623[] { Class623.aClass623_2, Class623.aClass623_1, Class623.aClass623_3 };
	}

	@OriginalMember(owner = "client!ey", name = "wm", descriptor = "(Lclient!yf;I)V")
	static void method26092(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = client.anInt3485;
	}

	@OriginalMember(owner = "client!ey", name = "abo", descriptor = "(Lclient!yf;I)V")
	static void method26093(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt6049 -= 957530791) * 587908375];
		if (local13.startsWith(Class346.method27663(0, -1614681388)) || local13.startsWith(Class346.method27663(1, -1614681388))) {
			local13 = local13.substring(7);
		}
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class293.method26683(local13, 1534163482);
	}

	@OriginalMember(owner = "client!ey", name = "eo", descriptor = "(II)V")
	static void method26094(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) byte local4;
		if (arg0 == 0) {
			local4 = 0;
		} else if (arg0 == 1) {
			local4 = 1;
		} else if (arg0 == 2) {
			local4 = 2;
		} else {
			return;
		}
		@Pc(25) byte local25;
		if ((double) Class159_Sub1.aFloat153 == 2.0D) {
			local25 = 0;
		} else if ((double) Class159_Sub1.aFloat153 == 3.0D) {
			local25 = 1;
		} else if ((double) Class159_Sub1.aFloat153 == 4.0D) {
			local25 = 2;
		} else if ((double) Class159_Sub1.aFloat153 == 6.0D) {
			local25 = 3;
		} else if ((double) Class159_Sub1.aFloat153 >= 8.0D) {
			local25 = 4;
		} else {
			return;
		}
		Class171.aClass106_9 = Class159_Sub1.aClass106ArrayArray1[local4][local25];
		Class129_Sub2.aClass5_13 = Class159_Sub1.aClass5ArrayArray1[local4][local25];
	}

	@OriginalMember(owner = "client!ey", name = "e", descriptor = "(Lclient!alw;I)Lclient!hr;")
	public static Class321 method26095(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
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
				local21[local23] = Class500.method30338(Integer.class, -47609621).method30453(arg0, -1187347627);
			} else if (local30 == 1) {
				local21[local23] = Class500.method30338(String.class, -47609621).method30453(arg0, -1187347627);
			} else {
				throw new IllegalStateException("Unrecognised type ID in deserialise: " + local30);
			}
		}
		return new Class321(local18, local21);
	}

	@OriginalMember(owner = "client!ey", name = "<init>", descriptor = "()V")
	Class254() {
	}

	@OriginalMember(owner = "client!ey", name = "e", descriptor = "(Lclient!alw;II)V")
	void method26089(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3893 = arg0.method22494((byte) -97) * 1655674161;
		this.aFloat281 = arg0.method22437(-58104609);
		this.aFloat282 = arg0.method22437(1068792815);
		this.aFloat283 = arg0.method22437(-805718494);
		this.aFloat284 = arg0.method22437(48844432);
		this.aFloat280 = arg0.method22437(1350052354);
	}

	@OriginalMember(owner = "client!ey", name = "n", descriptor = "(Lclient!alw;I)V")
	void method26090(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		this.anInt3893 = arg0.method22494((byte) -11) * 1655674161;
		this.aFloat281 = arg0.method22437(521915274);
		this.aFloat282 = arg0.method22437(1270832534);
		this.aFloat283 = arg0.method22437(-1173402327);
		this.aFloat284 = arg0.method22437(-813941282);
		this.aFloat280 = arg0.method22437(1986596422);
	}
}
