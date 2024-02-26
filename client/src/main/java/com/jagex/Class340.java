package com.jagex;

import java.awt.Point;
import java.util.Queue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ij")
public final class Class340 {

	@OriginalMember(owner = "client!ij", name = "t", descriptor = "Lclient!ij;")
	public static final Class340 aClass340_5 = new Class340(0, false);

	@OriginalMember(owner = "client!ij", name = "f", descriptor = "Lclient!ij;")
	public static final Class340 aClass340_7 = new Class340(1, false);

	@OriginalMember(owner = "client!ij", name = "e", descriptor = "Lclient!ij;")
	static final Class340 aClass340_4 = new Class340(2, true);

	@OriginalMember(owner = "client!ij", name = "u", descriptor = "Lclient!ij;")
	static final Class340 aClass340_3 = new Class340(3, true);

	@OriginalMember(owner = "client!ij", name = "l", descriptor = "Lclient!ij;")
	static final Class340 aClass340_6 = new Class340(4, true);

	@OriginalMember(owner = "client!ij", name = "g", descriptor = "I")
	public final int anInt4242;

	@OriginalMember(owner = "client!ij", name = "i", descriptor = "Z")
	final boolean aBoolean831;

	@OriginalMember(owner = "client!ij", name = "e", descriptor = "(I)Lclient!ij;")
	public static Class340 method27900(@OriginalArg(0) int arg0) {
		if (arg0 == aClass340_5.anInt4242 * -1796689509) {
			return aClass340_5;
		} else if (arg0 == aClass340_7.anInt4242 * -1796689509) {
			return aClass340_7;
		} else if (arg0 == aClass340_4.anInt4242 * -1796689509) {
			return aClass340_4;
		} else if (arg0 == aClass340_3.anInt4242 * -1796689509) {
			return aClass340_3;
		} else if (aClass340_6.anInt4242 * -1796689509 == arg0) {
			return aClass340_6;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ij", name = "u", descriptor = "(I)Lclient!ij;")
	public static Class340 method27903(@OriginalArg(0) int arg0) {
		if (arg0 == aClass340_5.anInt4242 * -1796689509) {
			return aClass340_5;
		} else if (arg0 == aClass340_7.anInt4242 * -1796689509) {
			return aClass340_7;
		} else if (arg0 == aClass340_4.anInt4242 * -1796689509) {
			return aClass340_4;
		} else if (arg0 == aClass340_3.anInt4242 * -1796689509) {
			return aClass340_3;
		} else if (aClass340_6.anInt4242 * -1796689509 == arg0) {
			return aClass340_6;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ij", name = "ad", descriptor = "(I)I")
	public static int method27905(@OriginalArg(0) int arg0) {
		return Class669.aTwitchTV1.GetViewerCount();
	}

	@OriginalMember(owner = "client!ij", name = "jx", descriptor = "(Lclient!yp;B)V")
	static void method27906(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5778 -= -221471862;
	}

	@OriginalMember(owner = "client!ij", name = "agf", descriptor = "(Lclient!yp;I)V")
	static void method27907(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = ((Class43) Class25.aClass41_Sub9_1.method18054(local12, 264870876)).anInt151 * -331223913 == 1 ? 1 : 0;
	}

	@OriginalMember(owner = "client!ij", name = "l", descriptor = "(I)V")
	static void method27908(@OriginalArg(0) int arg0) {
		@Pc(2) Queue local2 = Class662.aQueue3;
		synchronized (Class662.aQueue3) {
			@Pc(9) Point local9;
			if (Class454.aCanvas6.isShowing()) {
				local9 = Class454.aCanvas6.getLocationOnScreen();
			} else {
				local9 = null;
			}
			while (true) {
				while (true) {
					@Pc(16) Class80_Sub17_Sub2 local16 = (Class80_Sub17_Sub2) Class662.aQueue3.poll();
					if (local16 == null) {
						return;
					}
					if (local9 != null && Class454.aCanvas6.isShowing() && Class597.aBoolean926) {
						local16.method23478(local9, -2055904621);
						if (!local16.method23475(-2064827578) && local16.method23451(472309609) < Class80_Sub1_Sub1.anInt254 * -255202897 && local16.method23454(-14417928) < Class80_Sub25.anInt1627 * 167687103 && local16.method23451(350790872) >= 0 && local16.method23454(183264799) >= 0) {
							@Pc(66) int local66 = local16.method23452((byte) 3);
							if (local16.method23452((byte) 3) == -1) {
								Class662.aClass162_Sub1_1.method15789(local16, 192252603);
							} else if (Class564.method31475(local66, 2065750256)) {
								Class662.aClass162_Sub1_1.method15714(local16, 1687803107);
							}
						}
					} else {
						local16.method23453(-454396966);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(IZ)V")
	Class340(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.anInt4242 = arg0 * -1955050349;
		this.aBoolean831 = arg1;
	}

	@OriginalMember(owner = "client!ij", name = "f", descriptor = "(I)Z")
	public boolean method27901(@OriginalArg(0) int arg0) {
		return this.aBoolean831;
	}

	@OriginalMember(owner = "client!ij", name = "l", descriptor = "()Z")
	public boolean method27902() {
		return this.aBoolean831;
	}

	@OriginalMember(owner = "client!ij", name = "g", descriptor = "()Z")
	public boolean method27904() {
		return this.aBoolean831;
	}
}
