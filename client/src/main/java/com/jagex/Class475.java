package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pa")
public class Class475 implements Interface7 {

	@OriginalMember(owner = "client!pa", name = "m", descriptor = "Z")
	boolean aBoolean779;

	@OriginalMember(owner = "client!pa", name = "e", descriptor = "Ljava/lang/String;")
	final String aString213;

	@OriginalMember(owner = "client!pa", name = "n", descriptor = "Z")
	final boolean aBoolean778;

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(Ljava/lang/String;Z)V", line = 15)
	Class475(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		this.aString213 = arg0;
		this.aBoolean778 = arg1;
	}

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 21)
	Class475(@OriginalArg(0) String arg0) {
		this(arg0, false);
	}

	@OriginalMember(owner = "client!pa", name = "e", descriptor = "(I)I", line = 25)
	@Override
	public int method30020(@OriginalArg(0) int arg0) {
		if (this.aBoolean779) {
			return 100;
		}
		try {
			return Class125_Sub1.aClass586_1.method31627(this.aString213, this.aBoolean778, 484684735);
		} catch (@Pc(13) Exception_Sub5 local13) {
			Class166_Sub6.method15480(Class72.aClass72_1, local13.aString65, local13.anInt2491 * 1562390493, local13.getCause(), 1352442392);
			this.aBoolean779 = true;
			return 100;
		}
	}

	@OriginalMember(owner = "client!pa", name = "m", descriptor = "()I", line = 25)
	@Override
	public int method30026() {
		if (this.aBoolean779) {
			return 100;
		}
		try {
			return Class125_Sub1.aClass586_1.method31627(this.aString213, this.aBoolean778, -2059312980);
		} catch (@Pc(13) Exception_Sub5 local13) {
			Class166_Sub6.method15480(Class72.aClass72_1, local13.aString65, local13.anInt2491 * 1562390493, local13.getCause(), -1505586098);
			this.aBoolean779 = true;
			return 100;
		}
	}

	@OriginalMember(owner = "client!pa", name = "k", descriptor = "()I", line = 25)
	@Override
	public int method30023() {
		if (this.aBoolean779) {
			return 100;
		}
		try {
			return Class125_Sub1.aClass586_1.method31627(this.aString213, this.aBoolean778, -9442516);
		} catch (@Pc(13) Exception_Sub5 local13) {
			Class166_Sub6.method15480(Class72.aClass72_1, local13.aString65, local13.anInt2491 * 1562390493, local13.getCause(), 491178534);
			this.aBoolean779 = true;
			return 100;
		}
	}

	@OriginalMember(owner = "client!pa", name = "u", descriptor = "(B)Z", line = 37)
	boolean method29674(@OriginalArg(0) byte arg0) {
		return this.aBoolean779;
	}

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "()Z", line = 37)
	boolean method29675() {
		return this.aBoolean779;
	}

	@OriginalMember(owner = "client!pa", name = "p", descriptor = "()Z", line = 37)
	boolean method29676() {
		return this.aBoolean779;
	}

	@OriginalMember(owner = "client!pa", name = "z", descriptor = "(B)V", line = 41)
	void method29677(@OriginalArg(0) byte arg0) {
		this.aBoolean779 = true;
	}

	@OriginalMember(owner = "client!pa", name = "f", descriptor = "()Lclient!acv;", line = 45)
	@Override
	public Class71 method30024() {
		return Class71.aClass71_5;
	}

	@OriginalMember(owner = "client!pa", name = "n", descriptor = "(B)Lclient!acv;", line = 45)
	@Override
	public Class71 method30021(@OriginalArg(0) byte arg0) {
		return Class71.aClass71_5;
	}

	@OriginalMember(owner = "client!pa", name = "l", descriptor = "()Lclient!acv;", line = 45)
	@Override
	public Class71 method30022() {
		return Class71.aClass71_5;
	}

	@OriginalMember(owner = "client!pa", name = "w", descriptor = "()Lclient!acv;", line = 45)
	@Override
	public Class71 method30025() {
		return Class71.aClass71_5;
	}

	@OriginalMember(owner = "client!pa", name = "n", descriptor = "(IIIIIILclient!vp;B)V", line = 68)
	static void method29678(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class620 arg6, @OriginalArg(7) byte arg7) {
		@Pc(1) Class93_Sub8 local1 = null;
		for (@Pc(6) Class93_Sub8 local6 = (Class93_Sub8) Class93_Sub8.aClass22_19.method428((byte) 52); local6 != null; local6 = (Class93_Sub8) Class93_Sub8.aClass22_19.method442(1251850675)) {
			if (arg0 == local6.anInt1471 * -960255437 && local6.anInt1462 * -1824529811 == arg1 && local6.anInt1464 * 275343381 == arg2 && arg3 == local6.anInt1465 * -408185941) {
				local1 = local6;
				break;
			}
		}
		if (local1 == null) {
			local1 = new Class93_Sub8();
			local1.anInt1471 = arg0 * 2102878459;
			local1.anInt1465 = arg3 * -272445693;
			local1.anInt1462 = arg1 * -1126729883;
			local1.anInt1464 = arg2 * -89446595;
			Class93_Sub8.aClass22_19.method408(local1, -1087331411);
		}
		local1.anInt1468 = arg4 * -911028101;
		local1.anInt1470 = arg5 * -498027109;
		local1.aClass620_1 = arg6;
		local1.aBoolean308 = true;
		local1.aBoolean309 = false;
	}
}