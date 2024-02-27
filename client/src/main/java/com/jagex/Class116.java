package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.net.Socket;

@OriginalClass("client!ik")
public abstract class Class116 implements Interface3 {

	@OriginalMember(owner = "client!ik", name = "eb", descriptor = "Ljava/net/Socket;")
	static Socket js5SocketRequest;

	@OriginalMember(owner = "client!ik", name = "g", descriptor = "I")
	int anInt1026;

	@OriginalMember(owner = "client!ik", name = "u", descriptor = "Lclient!ej;")
	final Class243 aClass243_15 = new Class243(50);

	@OriginalMember(owner = "client!ik", name = "l", descriptor = "Lclient!ej;")
	final Class243 aClass243_14 = new Class243(5);

	@OriginalMember(owner = "client!ik", name = "f", descriptor = "Z")
	boolean aBoolean187;

	@OriginalMember(owner = "client!ik", name = "e", descriptor = "Lclient!pf;")
	final Class480 aClass480_23;

	@OriginalMember(owner = "client!ik", name = "t", descriptor = "Lclient!zy;")
	final Class722 aClass722_2;

	@OriginalMember(owner = "client!ik", name = "i", descriptor = "[Ljava/lang/String;")
	final String[] aStringArray15;

	@OriginalMember(owner = "client!ik", name = "f", descriptor = "(CLclient!zv;I)C")
	static char method8756(@OriginalArg(0) char arg0, @OriginalArg(1) Class719 arg1, @OriginalArg(2) int arg2) {
		if (arg0 >= 'À' && arg0 <= 'ÿ') {
			if (arg0 >= 'À' && arg0 <= 'Æ') {
				return 'A';
			}
			if (arg0 == 'Ç') {
				return 'C';
			}
			if (arg0 >= 'È' && arg0 <= 'Ë') {
				return 'E';
			}
			if (arg0 >= 'Ì' && arg0 <= 'Ï') {
				return 'I';
			}
			if (arg0 == 'Ñ' && Class719.aClass719_7 != arg1) {
				return 'N';
			}
			if (arg0 >= 'Ò' && arg0 <= 'Ö') {
				return 'O';
			}
			if (arg0 >= 'Ù' && arg0 <= 'Ü') {
				return 'U';
			}
			if (arg0 == 'Ý') {
				return 'Y';
			}
			if (arg0 == 'ß') {
				return 's';
			}
			if (arg0 >= 'à' && arg0 <= 'æ') {
				return 'a';
			}
			if (arg0 == 'ç') {
				return 'c';
			}
			if (arg0 >= 'è' && arg0 <= 'ë') {
				return 'e';
			}
			if (arg0 >= 'ì' && arg0 <= 'ï') {
				return 'i';
			}
			if (arg0 == 'ñ' && Class719.aClass719_7 != arg1) {
				return 'n';
			}
			if (arg0 >= 'ò' && arg0 <= 'ö') {
				return 'o';
			}
			if (arg0 >= 'ù' && arg0 <= 'ü') {
				return 'u';
			}
			if (arg0 == 'ý' || arg0 == 'ÿ') {
				return 'y';
			}
		}
		if (arg0 == 'Œ') {
			return 'O';
		} else if (arg0 == 'œ') {
			return 'o';
		} else if (arg0 == 'Ÿ') {
			return 'Y';
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!ik", name = "ang", descriptor = "(Lclient!yp;I)V")
	static void method8757(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		Class175.method24651(arg0, Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3, (byte) 102);
	}

	@OriginalMember(owner = "client!ik", name = "f", descriptor = "(I)Z")
	static boolean method8758(@OriginalArg(0) int arg0) {
		return Class238.anInt3815 * -2038590069 == -1 ? Class290.method26929(Class238.aString154, Class238.aString155, -1083497909) : Class290.method26932(196949193);
	}

	@OriginalMember(owner = "client!ik", name = "n", descriptor = "(II)V")
	public static void method8759(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(15, (long) arg0);
		local4.method22078(-2085695515);
	}

	@OriginalMember(owner = "client!ik", name = "vc", descriptor = "(Lclient!yp;I)V")
	static void method8760(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(26) String local26 = (String) arg0.anObjectArray46[(arg0.anInt5776 -= -825189621) * -2070619997];
		Class567.method31522(local12, local26, -1993429197);
	}

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(ZLclient!pf;Lclient!zv;Lclient!zy;)V")
	Class116(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class480 arg1, @OriginalArg(2) Class719 arg2, @OriginalArg(3) Class722 arg3) {
		this.aBoolean187 = arg0;
		this.aClass480_23 = arg1;
		this.aClass722_2 = arg3;
		if (this.aClass722_2 == Class722.aClass722_10) {
			this.aStringArray15 = new String[] { null, null, null, null, null, Class60.aClass60_9.method1180(arg2, 1878994238) };
		} else {
			this.aStringArray15 = new String[] { null, null, null, null, null, null };
		}
	}

	@OriginalMember(owner = "client!ik", name = "n", descriptor = "()V")
	final void method8740() {
		@Pc(3) Class243 local3 = this.aClass243_15;
		synchronized (this.aClass243_15) {
			this.aClass243_15.method26259((byte) 3);
		}
		local3 = this.aClass243_14;
		synchronized (this.aClass243_14) {
			this.aClass243_14.method26259((byte) 3);
		}
	}

	@OriginalMember(owner = "client!ik", name = "g", descriptor = "(I)V")
	final void method8741(@OriginalArg(0) int arg0) {
		this.anInt1026 = arg0 * -1690885855;
		@Pc(8) Class243 local8 = this.aClass243_15;
		synchronized (this.aClass243_15) {
			this.aClass243_15.method26256(1693912082);
		}
		local8 = this.aClass243_14;
		synchronized (this.aClass243_14) {
			this.aClass243_14.method26256(1693912082);
		}
	}

	@OriginalMember(owner = "client!ik", name = "f", descriptor = "(II)V")
	final void method8742(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1026 = arg0 * -1690885855;
		@Pc(8) Class243 local8 = this.aClass243_15;
		synchronized (this.aClass243_15) {
			this.aClass243_15.method26256(1693912082);
		}
		local8 = this.aClass243_14;
		synchronized (this.aClass243_14) {
			this.aClass243_14.method26256(1693912082);
		}
	}

	@OriginalMember(owner = "client!ik", name = "e", descriptor = "(I)V")
	final void method8743(@OriginalArg(0) int arg0) {
		@Pc(3) Class243 local3 = this.aClass243_15;
		synchronized (this.aClass243_15) {
			this.aClass243_15.method26256(1693912082);
		}
		local3 = this.aClass243_14;
		synchronized (this.aClass243_14) {
			this.aClass243_14.method26256(1693912082);
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V")
	final void method8744(@OriginalArg(0) int arg0) {
		this.anInt1026 = arg0 * -1690885855;
		@Pc(8) Class243 local8 = this.aClass243_15;
		synchronized (this.aClass243_15) {
			this.aClass243_15.method26256(1693912082);
		}
		local8 = this.aClass243_14;
		synchronized (this.aClass243_14) {
			this.aClass243_14.method26256(1693912082);
		}
	}

	@OriginalMember(owner = "client!ik", name = "l", descriptor = "(I)V")
	final void method8745(@OriginalArg(0) int arg0) {
		@Pc(3) Class243 local3 = this.aClass243_15;
		synchronized (this.aClass243_15) {
			this.aClass243_15.method26259((byte) 3);
		}
		local3 = this.aClass243_14;
		synchronized (this.aClass243_14) {
			this.aClass243_14.method26259((byte) 3);
		}
	}

	@OriginalMember(owner = "client!ik", name = "u", descriptor = "(II)V")
	final void method8746(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class243 local3 = this.aClass243_15;
		synchronized (this.aClass243_15) {
			this.aClass243_15.method26247(arg0, (byte) 122);
		}
		local3 = this.aClass243_14;
		synchronized (this.aClass243_14) {
			this.aClass243_14.method26247(arg0, (byte) 94);
		}
	}

	@OriginalMember(owner = "client!ik", name = "k", descriptor = "()V")
	final void method8747() {
		@Pc(3) Class243 local3 = this.aClass243_15;
		synchronized (this.aClass243_15) {
			this.aClass243_15.method26256(1693912082);
		}
		local3 = this.aClass243_14;
		synchronized (this.aClass243_14) {
			this.aClass243_14.method26256(1693912082);
		}
	}

	@OriginalMember(owner = "client!ik", name = "m", descriptor = "(I)V")
	final void method8748(@OriginalArg(0) int arg0) {
		this.anInt1026 = arg0 * -1690885855;
		@Pc(8) Class243 local8 = this.aClass243_15;
		synchronized (this.aClass243_15) {
			this.aClass243_15.method26256(1693912082);
		}
		local8 = this.aClass243_14;
		synchronized (this.aClass243_14) {
			this.aClass243_14.method26256(1693912082);
		}
	}

	@OriginalMember(owner = "client!ik", name = "o", descriptor = "(I)V")
	final void method8749(@OriginalArg(0) int arg0) {
		this.anInt1026 = arg0 * -1690885855;
		@Pc(8) Class243 local8 = this.aClass243_15;
		synchronized (this.aClass243_15) {
			this.aClass243_15.method26256(1693912082);
		}
		local8 = this.aClass243_14;
		synchronized (this.aClass243_14) {
			this.aClass243_14.method26256(1693912082);
		}
	}

	@OriginalMember(owner = "client!ik", name = "j", descriptor = "(I)V")
	final void method8750(@OriginalArg(0) int arg0) {
		this.anInt1026 = arg0 * -1690885855;
		@Pc(8) Class243 local8 = this.aClass243_15;
		synchronized (this.aClass243_15) {
			this.aClass243_15.method26256(1693912082);
		}
		local8 = this.aClass243_14;
		synchronized (this.aClass243_14) {
			this.aClass243_14.method26256(1693912082);
		}
	}

	@OriginalMember(owner = "client!ik", name = "s", descriptor = "(I)V")
	final void method8751(@OriginalArg(0) int arg0) {
		this.anInt1026 = arg0 * -1690885855;
		@Pc(8) Class243 local8 = this.aClass243_15;
		synchronized (this.aClass243_15) {
			this.aClass243_15.method26256(1693912082);
		}
		local8 = this.aClass243_14;
		synchronized (this.aClass243_14) {
			this.aClass243_14.method26256(1693912082);
		}
	}

	@OriginalMember(owner = "client!ik", name = "t", descriptor = "(ZI)V")
	final void method8752(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (arg0 != this.aBoolean187) {
			this.aBoolean187 = arg0;
			this.method8743(-588133459);
		}
	}

	@OriginalMember(owner = "client!ik", name = "x", descriptor = "()V")
	final void method8753() {
		@Pc(3) Class243 local3 = this.aClass243_15;
		synchronized (this.aClass243_15) {
			this.aClass243_15.method26256(1693912082);
		}
		local3 = this.aClass243_14;
		synchronized (this.aClass243_14) {
			this.aClass243_14.method26256(1693912082);
		}
	}

	@OriginalMember(owner = "client!ik", name = "w", descriptor = "(I)V")
	final void method8754(@OriginalArg(0) int arg0) {
		@Pc(3) Class243 local3 = this.aClass243_15;
		synchronized (this.aClass243_15) {
			this.aClass243_15.method26247(arg0, (byte) 57);
		}
		local3 = this.aClass243_14;
		synchronized (this.aClass243_14) {
			this.aClass243_14.method26247(arg0, (byte) 83);
		}
	}

	@OriginalMember(owner = "client!ik", name = "i", descriptor = "(I)V")
	final void method8755(@OriginalArg(0) int arg0) {
		this.anInt1026 = arg0 * -1690885855;
		@Pc(8) Class243 local8 = this.aClass243_15;
		synchronized (this.aClass243_15) {
			this.aClass243_15.method26256(1693912082);
		}
		local8 = this.aClass243_14;
		synchronized (this.aClass243_14) {
			this.aClass243_14.method26256(1693912082);
		}
	}
}
