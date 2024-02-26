package com.jagex;

import java.applet.Applet;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public final class Class306 implements Runnable {

	@OriginalMember(owner = "client!h", name = "n", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet1;

	@OriginalMember(owner = "client!h", name = "f", descriptor = "Ljava/lang/String;")
	volatile String aString170;

	@OriginalMember(owner = "client!h", name = "t", descriptor = "Ljava/net/InetAddress;")
	InetAddress anInetAddress1;

	@OriginalMember(owner = "client!h", name = "aj", descriptor = "([BI)[B")
	static byte[] method27214(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class80_Sub36 local4 = new Class80_Sub36(arg0);
		@Pc(9) Class489 local9 = new Class489(local4);
		@Pc(13) Class486 local13 = local9.method30214((byte) 0);
		@Pc(17) int local17 = local9.method30216(-2017496269);
		if (local17 < 0 || Class480.anInt4993 * -214443435 != 0 && local17 > Class480.anInt4993 * -214443435) {
			throw new RuntimeException();
		} else if (local13 == Class486.aClass486_4) {
			@Pc(38) byte[] local38 = new byte[local17];
			local4.method23399(local38, 0, local17, -1610247708);
			return local38;
		} else {
			@Pc(50) int local50 = local9.method30215(-1506503231);
			if (local50 < 0 || Class480.anInt4993 * -214443435 != 0 && local50 > Class480.anInt4993 * -214443435) {
				throw new RuntimeException();
			}
			@Pc(72) byte[] local72;
			if (Class486.aClass486_1 == local13) {
				local72 = new byte[local50];
				Class19.method462(local72, local50, arg0, local17, 9);
			} else if (Class486.aClass486_3 == local13) {
				local72 = new byte[local50];
				@Pc(89) Class83 local89 = Class480.aClass83_1;
				synchronized (Class480.aClass83_1) {
					Class480.aClass83_1.method1562(local4, local72, -905146406);
				}
			} else if (Class486.aClass486_2 == local13) {
				try {
					local72 = Class169.method21687(local4, local50, 1001035218);
				} catch (@Pc(114) IOException local114) {
					throw new RuntimeException(local114);
				}
			} else {
				throw new RuntimeException();
			}
			return local72;
		}
	}

	@OriginalMember(owner = "client!h", name = "at", descriptor = "(B)I")
	public static int method27215(@OriginalArg(0) byte arg0) {
		Class506.aTwitchEventLiveStreams1 = null;
		return Class669.aTwitchTV1.RequestLiveStreams(client.aClass722_4.aString248);
	}

	@OriginalMember(owner = "client!h", name = "ru", descriptor = "(Lclient!yp;I)V")
	static void method27216(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2141279822);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class528.method30716(local16, local22, arg0, -1042010761);
	}

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "(I)V")
	Class306(@OriginalArg(0) int arg0) throws UnknownHostException {
		this.anInetAddress1 = InetAddress.getByAddress(new byte[] { (byte) (arg0 >> 24 & 0xFF), (byte) (arg0 >> 16 & 0xFF), (byte) (arg0 >> 8 & 0xFF), (byte) (arg0 & 0xFF) });
	}

	@OriginalMember(owner = "client!h", name = "t", descriptor = "(I)Ljava/lang/String;")
	public String method27208(@OriginalArg(0) int arg0) {
		return this.aString170;
	}

	@OriginalMember(owner = "client!h", name = "e", descriptor = "()Ljava/lang/String;")
	public String method27209() {
		return this.aString170;
	}

	@OriginalMember(owner = "client!h", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aString170 = this.anInetAddress1.getHostName();
	}

	@OriginalMember(owner = "client!h", name = "f", descriptor = "()Ljava/lang/String;")
	public String method27210() {
		return this.aString170;
	}

	@OriginalMember(owner = "client!h", name = "h", descriptor = "()V")
	public void method27211() {
		this.aString170 = this.anInetAddress1.getHostName();
	}

	@OriginalMember(owner = "client!h", name = "q", descriptor = "()V")
	public void method27212() {
		this.aString170 = this.anInetAddress1.getHostName();
	}

	@OriginalMember(owner = "client!h", name = "u", descriptor = "()Ljava/lang/String;")
	public String method27213() {
		return this.aString170;
	}
}
