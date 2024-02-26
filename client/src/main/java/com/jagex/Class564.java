package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.io.IOException;

@OriginalClass("client!sy")
public final class Class564 {

	@OriginalMember(owner = "client!sy", name = "dy", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!sy", name = "bc", descriptor = "Lclient!aao;")
	static Class16 aClass16_6;

	// $FF: synthetic field
	@OriginalMember(owner = "client!sy", name = "this$1", descriptor = "Lclient!sk;")
	final Class552 aClass552_2;

	@OriginalMember(owner = "client!sy", name = "t", descriptor = "[S")
	short[] aShortArray138;

	@OriginalMember(owner = "client!sy", name = "dl", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;B)V")
	static void method31472(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) byte arg3) {
		arg0.aBoolean804 = arg2.anIntArray525[(arg2.anInt5778 -= 2036747717) * 1896589581] == 1;
		Class296.method26998(arg0, -370192676);
	}

	@OriginalMember(owner = "client!sy", name = "ahl", descriptor = "(Lclient!yp;B)V")
	static void method31473(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		if (Class125_Sub2.aClass11_5 == null) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = -1;
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class125_Sub2.aClass11_5.anInt42 * 468896967;
		}
	}

	@OriginalMember(owner = "client!sy", name = "ef", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;I)V")
	static void method31474(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) int arg3) {
		arg0.anInt4148 = arg2.anIntArray525[(arg2.anInt5778 -= 2036747717) * 1896589581] * 352163065;
		Class296.method26998(arg0, -328104436);
		if (arg0.anInt4094 * 2071556223 == -1 && !arg1.aBoolean794) {
			Class116.method8759(arg0.anInt4087 * -2053489901, -1702141856);
		}
	}

	@OriginalMember(owner = "client!sy", name = "g", descriptor = "(II)Z")
	public static boolean method31475(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!sy", name = "jt", descriptor = "(Lclient!yp;I)V")
	static void method31476(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= 2036747717;
	}

	@OriginalMember(owner = "client!sy", name = "t", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Z")
	public static boolean method31477(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		if (arg0 == null || arg2 == null) {
			return false;
		} else if (arg0.startsWith("#") || arg2.startsWith("#")) {
			return arg0.equals(arg2);
		} else {
			return arg1.equals(arg3);
		}
	}

	@OriginalMember(owner = "client!sy", name = "l", descriptor = "(Lclient!ald;B)Lclient!vh;")
	static Class612 method31478(@OriginalArg(0) Packet arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0.g1();
		@Pc(7) int local7 = arg0.g1();
		return new Class612(local3, local7);
	}

	@OriginalMember(owner = "client!sy", name = "<init>", descriptor = "(Lclient!sk;)V")
	Class564(@OriginalArg(0) Class552 arg0) {
		this.aClass552_2 = arg0;
		this.aShortArray138 = new short[768];
	}

	@OriginalMember(owner = "client!sy", name = "g", descriptor = "(Lclient!jc;)B")
	byte method31460(@OriginalArg(0) Class357 arg0) throws IOException {
		@Pc(1) int local1 = 1;
		do {
			local1 = local1 << 1 | arg0.method28116(this.aShortArray138, local1, 672780807);
		} while (local1 < 256);
		return (byte) local1;
	}

	@OriginalMember(owner = "client!sy", name = "u", descriptor = "()V")
	void method31461() {
		Class584.method31847(this.aShortArray138, -551406263);
	}

	@OriginalMember(owner = "client!sy", name = "f", descriptor = "(Lclient!jc;B)B")
	byte method31462(@OriginalArg(0) Class357 arg0, @OriginalArg(1) byte arg1) throws IOException {
		@Pc(1) int local1 = 1;
		do {
			local1 = local1 << 1 | arg0.method28116(this.aShortArray138, local1, -606790976);
		} while (local1 < 256);
		return (byte) local1;
	}

	@OriginalMember(owner = "client!sy", name = "e", descriptor = "(Lclient!jc;BB)B")
	byte method31463(@OriginalArg(0) Class357 arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2) throws IOException {
		@Pc(1) int local1 = 1;
		do {
			@Pc(7) int local7 = arg1 >> 7 & 0x1;
			arg1 = (byte) (arg1 << 1);
			@Pc(25) int local25 = arg0.method28116(this.aShortArray138, (local7 + 1 << 8) + local1, 1099581257);
			local1 = local1 << 1 | local25;
			if (local7 != local25) {
				while (local1 < 256) {
					local1 = local1 << 1 | arg0.method28116(this.aShortArray138, local1, -309877826);
				}
				return (byte) local1;
			}
		} while (local1 < 256);
		return (byte) local1;
	}

	@OriginalMember(owner = "client!sy", name = "m", descriptor = "(Lclient!jc;)B")
	byte method31464(@OriginalArg(0) Class357 arg0) throws IOException {
		@Pc(1) int local1 = 1;
		do {
			local1 = local1 << 1 | arg0.method28116(this.aShortArray138, local1, 624454773);
		} while (local1 < 256);
		return (byte) local1;
	}

	@OriginalMember(owner = "client!sy", name = "l", descriptor = "()V")
	void method31465() {
		Class584.method31847(this.aShortArray138, 64429162);
	}

	@OriginalMember(owner = "client!sy", name = "s", descriptor = "(Lclient!jc;B)B")
	byte method31466(@OriginalArg(0) Class357 arg0, @OriginalArg(1) byte arg1) throws IOException {
		@Pc(1) int local1 = 1;
		do {
			@Pc(7) int local7 = arg1 >> 7 & 0x1;
			arg1 = (byte) (arg1 << 1);
			@Pc(25) int local25 = arg0.method28116(this.aShortArray138, (local7 + 1 << 8) + local1, -402396653);
			local1 = local1 << 1 | local25;
			if (local7 != local25) {
				while (local1 < 256) {
					local1 = local1 << 1 | arg0.method28116(this.aShortArray138, local1, -931641902);
				}
				return (byte) local1;
			}
		} while (local1 < 256);
		return (byte) local1;
	}

	@OriginalMember(owner = "client!sy", name = "i", descriptor = "(Lclient!jc;)B")
	byte method31467(@OriginalArg(0) Class357 arg0) throws IOException {
		@Pc(1) int local1 = 1;
		do {
			local1 = local1 << 1 | arg0.method28116(this.aShortArray138, local1, 1295979389);
		} while (local1 < 256);
		return (byte) local1;
	}

	@OriginalMember(owner = "client!sy", name = "o", descriptor = "(Lclient!jc;B)B")
	byte method31468(@OriginalArg(0) Class357 arg0, @OriginalArg(1) byte arg1) throws IOException {
		@Pc(1) int local1 = 1;
		do {
			@Pc(7) int local7 = arg1 >> 7 & 0x1;
			arg1 = (byte) (arg1 << 1);
			@Pc(25) int local25 = arg0.method28116(this.aShortArray138, (local7 + 1 << 8) + local1, 35960289);
			local1 = local1 << 1 | local25;
			if (local7 != local25) {
				while (local1 < 256) {
					local1 = local1 << 1 | arg0.method28116(this.aShortArray138, local1, 1769676068);
				}
				return (byte) local1;
			}
		} while (local1 < 256);
		return (byte) local1;
	}

	@OriginalMember(owner = "client!sy", name = "j", descriptor = "(Lclient!jc;B)B")
	byte method31469(@OriginalArg(0) Class357 arg0, @OriginalArg(1) byte arg1) throws IOException {
		@Pc(1) int local1 = 1;
		do {
			@Pc(7) int local7 = arg1 >> 7 & 0x1;
			arg1 = (byte) (arg1 << 1);
			@Pc(25) int local25 = arg0.method28116(this.aShortArray138, (local7 + 1 << 8) + local1, -1174937797);
			local1 = local1 << 1 | local25;
			if (local7 != local25) {
				while (local1 < 256) {
					local1 = local1 << 1 | arg0.method28116(this.aShortArray138, local1, 573874521);
				}
				return (byte) local1;
			}
		} while (local1 < 256);
		return (byte) local1;
	}

	@OriginalMember(owner = "client!sy", name = "a", descriptor = "(Lclient!jc;B)B")
	byte method31470(@OriginalArg(0) Class357 arg0, @OriginalArg(1) byte arg1) throws IOException {
		@Pc(1) int local1 = 1;
		do {
			@Pc(7) int local7 = arg1 >> 7 & 0x1;
			arg1 = (byte) (arg1 << 1);
			@Pc(25) int local25 = arg0.method28116(this.aShortArray138, (local7 + 1 << 8) + local1, -45423080);
			local1 = local1 << 1 | local25;
			if (local7 != local25) {
				while (local1 < 256) {
					local1 = local1 << 1 | arg0.method28116(this.aShortArray138, local1, 909771614);
				}
				return (byte) local1;
			}
		} while (local1 < 256);
		return (byte) local1;
	}

	@OriginalMember(owner = "client!sy", name = "t", descriptor = "(I)V")
	void method31471(@OriginalArg(0) int arg0) {
		Class584.method31847(this.aShortArray138, 226218850);
	}
}
