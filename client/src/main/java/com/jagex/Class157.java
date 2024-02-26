package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!yv")
public abstract class Class157 implements Interface3 {

	@OriginalMember(owner = "client!yv", name = "ho", descriptor = "Lclient!aoq;")
	public static Class41_Sub13 aClass41_Sub13_2;

	@OriginalMember(owner = "client!yv", name = "e", descriptor = "I")
	int anInt1947;

	@OriginalMember(owner = "client!yv", name = "f", descriptor = "Lclient!ej;")
	final Class243 aClass243_28 = new Class243(60);

	@OriginalMember(owner = "client!yv", name = "t", descriptor = "Lclient!pf;")
	final Class480 aClass480_45;

	@OriginalMember(owner = "client!yv", name = "kv", descriptor = "(IIIIIILclient!oc;IIB)V")
	public static void method15209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class457 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) byte arg9) {
		if (arg1 < 0 || arg2 < 0 || arg1 >= client.aClass539_1.method30921(2056159528) - 1 || arg2 >= client.aClass539_1.method31011(-1167136558) - 1) {
			return;
		}
		if (client.aClass539_1.method30932(-1638462787) == null) {
			return;
		}
		@Pc(35) Interface60 local35;
		if (arg3 == 0) {
			local35 = (Interface60) client.aClass539_1.method30932(-1638462787).method31570(arg0, arg1, arg2, (byte) -75);
			@Pc(45) Interface60 local45 = (Interface60) client.aClass539_1.method30932(-1638462787).method31713(arg0, arg1, arg2, -16777216);
			if (local35 != null && arg4 != 2) {
				if (local35 instanceof Class120_Sub1_Sub2_Sub2) {
					((Class120_Sub1_Sub2_Sub2) local35).aClass548_4.method31248(arg7, arg8, 2006975126);
				} else {
					Class689.method36956(arg0, arg3, arg1, arg2, local35.method13834((byte) -101), arg5, arg4, arg6, arg7, arg8, 632956154);
				}
			}
			if (local45 != null) {
				if (local45 instanceof Class120_Sub1_Sub2_Sub2) {
					((Class120_Sub1_Sub2_Sub2) local45).aClass548_4.method31248(arg7, arg8, 1622748972);
				} else {
					Class689.method36956(arg0, arg3, arg1, arg2, local45.method13834((byte) -73), arg5, arg4, arg6, arg7, arg8, 632956154);
				}
			}
		} else if (arg3 == 1) {
			local35 = (Interface60) client.aClass539_1.method30932(-1638462787).method31572(arg0, arg1, arg2, (byte) 68);
			if (local35 != null) {
				if (local35 instanceof Class120_Sub1_Sub3_Sub1) {
					((Class120_Sub1_Sub3_Sub1) local35).aClass548_2.method31248(arg7, arg8, 682766771);
				} else {
					@Pc(135) int local135 = local35.method13834((byte) -50);
					if (arg4 == 4 || arg4 == 5) {
						Class689.method36956(arg0, arg3, arg1, arg2, local135, arg5, 4, arg6, arg7, arg8, 632956154);
					} else if (arg4 == 6) {
						Class689.method36956(arg0, arg3, arg1, arg2, local135, arg5 + 4, 4, arg6, arg7, arg8, 632956154);
					} else if (arg4 == 7) {
						Class689.method36956(arg0, arg3, arg1, arg2, local135, (arg5 + 2 & 0x3) + 4, 4, arg6, arg7, arg8, 632956154);
					} else if (arg4 == 8) {
						Class689.method36956(arg0, arg3, arg1, arg2, local135, arg5 + 4, 4, arg6, arg7, arg8, 632956154);
						Class689.method36956(arg0, arg3, arg1, arg2, local135, (arg5 + 2 & 0x3) + 4, 4, arg6, arg7, arg8, 632956154);
					}
				}
			}
		} else if (arg3 == 2) {
			local35 = (Interface60) client.aClass539_1.method30932(-1638462787).method31574(arg0, arg1, arg2, client.anInterface62_1, (byte) -102);
			if (local35 != null) {
				if (arg4 == 11) {
					arg4 = 10;
				}
				if (local35 instanceof Class120_Sub1_Sub1_Sub2) {
					((Class120_Sub1_Sub1_Sub2) local35).aClass548_1.method31248(arg7, arg8, 12301131);
				} else {
					Class689.method36956(arg0, arg3, arg1, arg2, local35.method13834((byte) -20), arg5, arg4, arg6, arg7, arg8, 632956154);
				}
			}
		} else if (arg3 == 3) {
			local35 = (Interface60) client.aClass539_1.method30932(-1638462787).method31558(arg0, arg1, arg2, 339428270);
			if (local35 != null) {
				if (local35 instanceof Class120_Sub1_Sub4_Sub1) {
					((Class120_Sub1_Sub4_Sub1) local35).aClass548_3.method31248(arg7, arg8, 1914106779);
				} else {
					Class689.method36956(arg0, arg3, arg1, arg2, local35.method13834((byte) 39), arg5, arg4, arg6, arg7, arg8, 632956154);
				}
			}
		}
	}

	@OriginalMember(owner = "client!yv", name = "<init>", descriptor = "(Lclient!pf;)V")
	Class157(@OriginalArg(0) Class480 arg0) {
		this.aClass480_45 = arg0;
	}

	@OriginalMember(owner = "client!yv", name = "m", descriptor = "()V")
	final void method15197() {
		@Pc(3) Class243 local3 = this.aClass243_28;
		synchronized (this.aClass243_28) {
			this.aClass243_28.method26256(1693912082);
		}
	}

	@OriginalMember(owner = "client!yv", name = "g", descriptor = "()V")
	final void method15198() {
		@Pc(3) Class243 local3 = this.aClass243_28;
		synchronized (this.aClass243_28) {
			this.aClass243_28.method26256(1693912082);
		}
	}

	@OriginalMember(owner = "client!yv", name = "f", descriptor = "(B)V")
	final void method15199(@OriginalArg(0) byte arg0) {
		@Pc(3) Class243 local3 = this.aClass243_28;
		synchronized (this.aClass243_28) {
			this.aClass243_28.method26256(1693912082);
		}
	}

	@OriginalMember(owner = "client!yv", name = "t", descriptor = "(II)V")
	final void method15200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1947 = arg0 * 1341072111;
		@Pc(8) Class243 local8 = this.aClass243_28;
		synchronized (this.aClass243_28) {
			this.aClass243_28.method26256(1693912082);
		}
	}

	@OriginalMember(owner = "client!yv", name = "u", descriptor = "(I)V")
	final void method15201(@OriginalArg(0) int arg0) {
		@Pc(3) Class243 local3 = this.aClass243_28;
		synchronized (this.aClass243_28) {
			this.aClass243_28.method26259((byte) 3);
		}
	}

	@OriginalMember(owner = "client!yv", name = "l", descriptor = "(I)V")
	final void method15202(@OriginalArg(0) int arg0) {
		this.anInt1947 = arg0 * 1341072111;
		@Pc(8) Class243 local8 = this.aClass243_28;
		synchronized (this.aClass243_28) {
			this.aClass243_28.method26256(1693912082);
		}
	}

	@OriginalMember(owner = "client!yv", name = "o", descriptor = "()V")
	final void method15203() {
		@Pc(3) Class243 local3 = this.aClass243_28;
		synchronized (this.aClass243_28) {
			this.aClass243_28.method26256(1693912082);
		}
	}

	@OriginalMember(owner = "client!yv", name = "i", descriptor = "()V")
	final void method15204() {
		@Pc(3) Class243 local3 = this.aClass243_28;
		synchronized (this.aClass243_28) {
			this.aClass243_28.method26256(1693912082);
		}
	}

	@OriginalMember(owner = "client!yv", name = "e", descriptor = "(IB)V")
	final void method15205(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) Class243 local3 = this.aClass243_28;
		synchronized (this.aClass243_28) {
			this.aClass243_28.method26247(arg0, (byte) 14);
		}
	}

	@OriginalMember(owner = "client!yv", name = "j", descriptor = "(I)V")
	final void method15206(@OriginalArg(0) int arg0) {
		@Pc(3) Class243 local3 = this.aClass243_28;
		synchronized (this.aClass243_28) {
			this.aClass243_28.method26247(arg0, (byte) 10);
		}
	}

	@OriginalMember(owner = "client!yv", name = "a", descriptor = "(I)V")
	final void method15207(@OriginalArg(0) int arg0) {
		@Pc(3) Class243 local3 = this.aClass243_28;
		synchronized (this.aClass243_28) {
			this.aClass243_28.method26247(arg0, (byte) 74);
		}
	}

	@OriginalMember(owner = "client!yv", name = "s", descriptor = "()V")
	final void method15208() {
		@Pc(3) Class243 local3 = this.aClass243_28;
		synchronized (this.aClass243_28) {
			this.aClass243_28.method26259((byte) 3);
		}
	}
}
