package com.jagex;

import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!abu")
public abstract class Class45 {

	@OriginalMember(owner = "client!abu", name = "qz", descriptor = "Lclient!hx;")
	static Class327 aClass327_5;

	@OriginalMember(owner = "client!abu", name = "k", descriptor = "I")
	static int anInt2423;

	@OriginalMember(owner = "client!abu", name = "f", descriptor = "I")
	int anInt2422;

	@OriginalMember(owner = "client!abu", name = "t", descriptor = "Ljava/lang/String;")
	String aString68;

	@OriginalMember(owner = "client!abu", name = "o", descriptor = "(Ljava/lang/String;I)Lclient!abu;")
	public static Class45 method17284(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class45_Sub1 local3 = new Class45_Sub1();
		local3.aString68 = arg0;
		local3.anInt2422 = arg1 * -1767699301;
		return local3;
	}

	@OriginalMember(owner = "client!abu", name = "m", descriptor = "(Ljava/lang/String;I)Lclient!abu;")
	public static Class45 method17290(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class45_Sub1 local3 = new Class45_Sub1();
		local3.aString68 = arg0;
		local3.anInt2422 = arg1 * -1767699301;
		return local3;
	}

	@OriginalMember(owner = "client!abu", name = "j", descriptor = "(Ljava/lang/String;I)Lclient!abu;")
	public static Class45 method17291(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class45_Sub1 local3 = new Class45_Sub1();
		local3.aString68 = arg0;
		local3.anInt2422 = arg1 * -1767699301;
		return local3;
	}

	@OriginalMember(owner = "client!abu", name = "g", descriptor = "(Ljava/lang/String;I)Lclient!abu;")
	public static Class45 method17293(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class45_Sub1 local3 = new Class45_Sub1();
		local3.aString68 = arg0;
		local3.anInt2422 = arg1 * -1767699301;
		return local3;
	}

	@OriginalMember(owner = "client!abu", name = "i", descriptor = "(Ljava/lang/String;I)Lclient!abu;")
	public static Class45 method17294(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class45_Sub1 local3 = new Class45_Sub1();
		local3.aString68 = arg0;
		local3.anInt2422 = arg1 * -1767699301;
		return local3;
	}

	@OriginalMember(owner = "client!abu", name = "hw", descriptor = "(I)V")
	public static void method17296(@OriginalArg(0) int arg0) {
		if (!client.aBoolean725) {
			client.aFloat256 += (12.0F - client.aFloat256) / 2.0F;
			client.aBoolean726 = true;
			client.aBoolean725 = true;
		}
	}

	@OriginalMember(owner = "client!abu", name = "ky", descriptor = "([Lclient!hx;IIIZB)V")
	public static void method17297(@OriginalArg(0) Class327[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte arg5) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(9) Class327 local9 = arg0[local1];
			if (local9 != null && arg1 == local9.anInt4082 * 254495303) {
				Class541.method31170(local9, arg2, arg3, arg4, -2112172485);
				Class13.method353(local9, arg2, arg3, (byte) -123);
				if (local9.anInt4110 * -1652867993 > local9.anInt4112 * -2019977469 - local9.anInt4103 * 1892149809) {
					local9.anInt4110 = local9.anInt4112 * 1250012933 - local9.anInt4103 * -1213299289;
				}
				if (local9.anInt4110 * -1652867993 < 0) {
					local9.anInt4110 = 0;
				}
				if (local9.anInt4111 * 458112843 > local9.anInt4091 * -13185357 - local9.anInt4104 * 1990157877) {
					local9.anInt4111 = local9.anInt4091 * -1333607111 - local9.anInt4104 * -911605633;
				}
				if (local9.anInt4111 * 458112843 < 0) {
					local9.anInt4111 = 0;
				}
				if (local9.anInt4135 * 710314345 == 0) {
					Class162_Sub1.method15722(arg0, local9, arg4, (byte) 9);
				}
			}
		}
	}

	@OriginalMember(owner = "client!abu", name = "afy", descriptor = "(Lclient!yp;I)V")
	static void method17298(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray46[(arg0.anInt5776 -= -825189621) * -2070619997];
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = Class413.method28989(local13, (byte) -120);
	}

	@OriginalMember(owner = "client!abu", name = "<init>", descriptor = "()V")
	Class45() {
	}

	@OriginalMember(owner = "client!abu", name = "k", descriptor = "()Ljava/net/Socket;")
	final Socket method17283() throws IOException {
		return new Socket(this.aString68, this.anInt2422 * 279443859);
	}

	@OriginalMember(owner = "client!abu", name = "e", descriptor = "(B)Ljava/net/Socket;")
	final Socket method17285(@OriginalArg(0) byte arg0) throws IOException {
		return new Socket(this.aString68, this.anInt2422 * 279443859);
	}

	@OriginalMember(owner = "client!abu", name = "f", descriptor = "(I)Ljava/net/Socket;")
	public abstract Socket method17286(@OriginalArg(0) int arg0) throws IOException;

	@OriginalMember(owner = "client!abu", name = "l", descriptor = "()Ljava/net/Socket;")
	public abstract Socket method17287() throws IOException;

	@OriginalMember(owner = "client!abu", name = "u", descriptor = "()Ljava/net/Socket;")
	public abstract Socket method17288() throws IOException;

	@OriginalMember(owner = "client!abu", name = "s", descriptor = "()Ljava/net/Socket;")
	final Socket method17289() throws IOException {
		return new Socket(this.aString68, this.anInt2422 * 279443859);
	}

	@OriginalMember(owner = "client!abu", name = "a", descriptor = "()Ljava/net/Socket;")
	final Socket method17292() throws IOException {
		return new Socket(this.aString68, this.anInt2422 * 279443859);
	}

	@OriginalMember(owner = "client!abu", name = "x", descriptor = "()Ljava/net/Socket;")
	final Socket method17295() throws IOException {
		return new Socket(this.aString68, this.anInt2422 * 279443859);
	}
}
