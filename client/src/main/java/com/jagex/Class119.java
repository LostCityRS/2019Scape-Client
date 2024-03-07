package com.jagex;

import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ih")
public abstract class Class119 implements Interface4 {

	@OriginalMember(owner = "client!ih", name = "il", descriptor = "Lclient!wx;")
	public static Class650 aClass650_2;

	@OriginalMember(owner = "client!ih", name = "w", descriptor = "I")
	int anInt996;

	@OriginalMember(owner = "client!ih", name = "k", descriptor = "Lclient!eb;")
	final Class240 aClass240_18 = new Class240(50);

	@OriginalMember(owner = "client!ih", name = "f", descriptor = "Lclient!eb;")
	final Class240 aClass240_17 = new Class240(5);

	@OriginalMember(owner = "client!ih", name = "n", descriptor = "Z")
	boolean aBoolean178;

	@OriginalMember(owner = "client!ih", name = "m", descriptor = "Lclient!py;")
	final Class497 aClass497_27;

	@OriginalMember(owner = "client!ih", name = "e", descriptor = "Lclient!zd;")
	final Class702 aClass702_2;

	@OriginalMember(owner = "client!ih", name = "l", descriptor = "[Ljava/lang/String;")
	final String[] aStringArray14;

	@OriginalMember(owner = "client!ih", name = "e", descriptor = "(I)[Lclient!vf;", line = 17)
	public static Class612[] method8589(@OriginalArg(0) int arg0) {
		return new Class612[] { Class612.aClass612_1, Class612.aClass612_5, Class612.aClass612_6, Class612.aClass612_2, Class612.aClass612_3, Class612.aClass612_4 };
	}

	@OriginalMember(owner = "client!ih", name = "e", descriptor = "(I)V", line = 18)
	public static void method8590(@OriginalArg(0) int arg0) throws RuntimeException {
		if (!Class527.aString222.startsWith("win")) {
			return;
		}
		Class53_Sub1.method14953(-1593140386);
		@Pc(7) Object local7 = null;
		@Pc(9) String local9 = Class474.aString212;
		@Pc(14) File local14 = new File(local9);
		if (!local14.isFile()) {
			throw new RuntimeException();
		}
		if (!local14.canRead()) {
			throw new RuntimeException();
		}
		if (Class136.aClass136_2 == Class474.aClass136_5) {
			throw new RuntimeException();
		}
		try {
			Class474.aProcess1 = (new ProcessBuilder(new String[] { local9 })).start();
			Class474.aClass136_5 = Class136.aClass136_2;
		} catch (@Pc(50) IOException local50) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(ZLclient!py;Lclient!zt;Lclient!zd;)V", line = 706)
	Class119(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class497 arg1, @OriginalArg(2) Class717 arg2, @OriginalArg(3) Class702 arg3) {
		this.aBoolean178 = arg0;
		this.aClass497_27 = arg1;
		this.aClass702_2 = arg3;
		if (this.aClass702_2 == Class702.aClass702_6) {
			this.aStringArray14 = new String[] { null, null, null, null, null, Class74.aClass74_129.method1259(arg2, (byte) 23) };
		} else {
			this.aStringArray14 = new String[] { null, null, null, null, null, null };
		}
	}

	@OriginalMember(owner = "client!ih", name = "e", descriptor = "(ZI)V", line = 715)
	void method8591(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (arg0 != this.aBoolean178) {
			this.aBoolean178 = arg0;
			this.method8599((byte) 42);
		}
	}

	@OriginalMember(owner = "client!ih", name = "w", descriptor = "(Z)V", line = 715)
	void method8592(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean178) {
			this.aBoolean178 = arg0;
			this.method8599((byte) 32);
		}
	}

	@OriginalMember(owner = "client!ih", name = "l", descriptor = "(Z)V", line = 715)
	void method8593(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean178) {
			this.aBoolean178 = arg0;
			this.method8599((byte) 67);
		}
	}

	@OriginalMember(owner = "client!ih", name = "u", descriptor = "(Z)V", line = 715)
	void method8594(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean178) {
			this.aBoolean178 = arg0;
			this.method8599((byte) 88);
		}
	}

	@OriginalMember(owner = "client!ih", name = "n", descriptor = "(II)V", line = 721)
	void method8595(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt996 = arg0 * -1239030717;
		@Pc(8) Class240 local8 = this.aClass240_18;
		synchronized (this.aClass240_18) {
			this.aClass240_18.method25847((byte) -60);
		}
		local8 = this.aClass240_17;
		synchronized (this.aClass240_17) {
			this.aClass240_17.method25847((byte) -37);
		}
	}

	@OriginalMember(owner = "client!ih", name = "p", descriptor = "(I)V", line = 721)
	void method8596(@OriginalArg(0) int arg0) {
		this.anInt996 = arg0 * -1239030717;
		@Pc(8) Class240 local8 = this.aClass240_18;
		synchronized (this.aClass240_18) {
			this.aClass240_18.method25847((byte) -1);
		}
		local8 = this.aClass240_17;
		synchronized (this.aClass240_17) {
			this.aClass240_17.method25847((byte) -12);
		}
	}

	@OriginalMember(owner = "client!ih", name = "z", descriptor = "(I)V", line = 721)
	void method8597(@OriginalArg(0) int arg0) {
		this.anInt996 = arg0 * -1239030717;
		@Pc(8) Class240 local8 = this.aClass240_18;
		synchronized (this.aClass240_18) {
			this.aClass240_18.method25847((byte) -76);
		}
		local8 = this.aClass240_17;
		synchronized (this.aClass240_17) {
			this.aClass240_17.method25847((byte) -25);
		}
	}

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "(I)V", line = 721)
	void method8598(@OriginalArg(0) int arg0) {
		this.anInt996 = arg0 * -1239030717;
		@Pc(8) Class240 local8 = this.aClass240_18;
		synchronized (this.aClass240_18) {
			this.aClass240_18.method25847((byte) -124);
		}
		local8 = this.aClass240_17;
		synchronized (this.aClass240_17) {
			this.aClass240_17.method25847((byte) -38);
		}
	}

	@OriginalMember(owner = "client!ih", name = "m", descriptor = "(B)V", line = 731)
	void method8599(@OriginalArg(0) byte arg0) {
		@Pc(3) Class240 local3 = this.aClass240_18;
		synchronized (this.aClass240_18) {
			this.aClass240_18.method25847((byte) -125);
		}
		local3 = this.aClass240_17;
		synchronized (this.aClass240_17) {
			this.aClass240_17.method25847((byte) -88);
		}
	}

	@OriginalMember(owner = "client!ih", name = "k", descriptor = "(II)V", line = 740)
	void method8600(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class240 local3 = this.aClass240_18;
		synchronized (this.aClass240_18) {
			this.aClass240_18.method25843(arg0, (byte) -13);
		}
		local3 = this.aClass240_17;
		synchronized (this.aClass240_17) {
			this.aClass240_17.method25843(arg0, (byte) 25);
		}
	}

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "(I)V", line = 740)
	void method8601(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_18;
		synchronized (this.aClass240_18) {
			this.aClass240_18.method25843(arg0, (byte) -28);
		}
		local3 = this.aClass240_17;
		synchronized (this.aClass240_17) {
			this.aClass240_17.method25843(arg0, (byte) -80);
		}
	}

	@OriginalMember(owner = "client!ih", name = "f", descriptor = "(I)V", line = 749)
	void method8602(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_18;
		synchronized (this.aClass240_18) {
			this.aClass240_18.method25860(1161602830);
		}
		local3 = this.aClass240_17;
		synchronized (this.aClass240_17) {
			this.aClass240_17.method25860(1161602830);
		}
	}

	@OriginalMember(owner = "client!ih", name = "r", descriptor = "()V", line = 749)
	void method8603() {
		@Pc(3) Class240 local3 = this.aClass240_18;
		synchronized (this.aClass240_18) {
			this.aClass240_18.method25860(1161602830);
		}
		local3 = this.aClass240_17;
		synchronized (this.aClass240_17) {
			this.aClass240_17.method25860(1161602830);
		}
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "()V", line = 749)
	void method8604() {
		@Pc(3) Class240 local3 = this.aClass240_18;
		synchronized (this.aClass240_18) {
			this.aClass240_18.method25860(1161602830);
		}
		local3 = this.aClass240_17;
		synchronized (this.aClass240_17) {
			this.aClass240_17.method25860(1161602830);
		}
	}

	@OriginalMember(owner = "client!ih", name = "mv", descriptor = "(Ljava/lang/String;ZI)Ljava/lang/String;", line = 12429)
	static String method8605(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(5) String local5 = arg1 ? "https://" : "http://";
		if (Class280.modeWhere == ModeWhere.aModeWhere_5) {
			arg0 = arg0 + "-wtrc";
		} else if (ModeWhere.WTQA == Class280.modeWhere) {
			arg0 = arg0 + "-wtqa";
		} else if (ModeWhere.aModeWhere_3 == Class280.modeWhere) {
			arg0 = arg0 + "-wtwip";
		} else if (Class280.modeWhere == ModeWhere.aModeWhere_7) {
			arg0 = arg0 + "-wti";
		} else if (Class280.modeWhere == ModeWhere.aModeWhere_11) {
			arg0 = arg0 + "-demo";
		} else if (ModeWhere.LOCAL == Class280.modeWhere) {
			arg0 = "local";
		}
		@Pc(77) String local77 = "";
		if (client.settings != null) {
			local77 = "/p=" + client.settings;
		}
		@Pc(98) String local98 = client.modeGame.aString241 + ".com";
		return local5 + arg0 + "." + local98 + "/l=" + Class106.lang.anInt5963 * -1156137245 + "/a=" + client.affiliate * -1765120027 + local77 + "/";
	}
}
