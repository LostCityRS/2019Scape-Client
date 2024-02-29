package jagex3;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.URL;
import java.net.URLConnection;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!abx")
public abstract class Class49 {

	@OriginalMember(owner = "client!abx", name = "be", descriptor = "Lclient!aac;")
	static Class5 aClass5_12;

	@OriginalMember(owner = "client!abx", name = "n", descriptor = "I")
	int anInt2384;

	@OriginalMember(owner = "client!abx", name = "e", descriptor = "Ljava/lang/String;")
	String aString58;

	@OriginalMember(owner = "client!abx", name = "p", descriptor = "(Ljava/lang/String;I)Lclient!abx;")
	public static Class49 method16606(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class49_Sub1 local3 = new Class49_Sub1();
		local3.aString58 = arg0;
		local3.anInt2384 = arg1 * -381473519;
		return local3;
	}

	@OriginalMember(owner = "client!abx", name = "u", descriptor = "(Ljava/lang/String;I)Lclient!abx;")
	public static Class49 method16612(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class49_Sub1 local3 = new Class49_Sub1();
		local3.aString58 = arg0;
		local3.anInt2384 = arg1 * -381473519;
		return local3;
	}

	@OriginalMember(owner = "client!abx", name = "z", descriptor = "(Ljava/lang/String;I)Lclient!abx;")
	public static Class49 method16613(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class49_Sub1 local3 = new Class49_Sub1();
		local3.aString58 = arg0;
		local3.anInt2384 = arg1 * -381473519;
		return local3;
	}

	@OriginalMember(owner = "client!abx", name = "d", descriptor = "(Ljava/lang/String;I)Lclient!abx;")
	public static Class49 method16615(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class49_Sub1 local3 = new Class49_Sub1();
		local3.aString58 = arg0;
		local3.anInt2384 = arg1 * -381473519;
		return local3;
	}

	@OriginalMember(owner = "client!abx", name = "ge", descriptor = "(B)V")
	static void method16619(@OriginalArg(0) byte arg0) {
		if (client.aFloat256 < 1077.0F) {
			client.aFloat256 = 1077.0F;
		}
		if (client.aFloat256 > 2787.0F) {
			client.aFloat256 = 2787.0F;
		}
		while (client.aFloat253 >= 16384.0F) {
			client.aFloat253 -= 16384.0F;
		}
		while (client.aFloat253 < 0.0F) {
			client.aFloat253 += 16384.0F;
		}
		@Pc(33) Class520 local33 = client.aClass532_1.method30690(494969536);
		@Pc(37) Class585 local37 = client.aClass532_1.method30640(-1038565011);
		@Pc(43) int local43 = Class72.anInt241 * -1022856553 >> 9;
		@Pc(49) int local49 = Class441.anInt5047 * -953396699 >> 9;
		@Pc(61) int local61 = Class305.method26894(Class72.anInt241 * -1022856553, Class441.anInt5047 * -953396699, Class512.anInt5370 * 1177442423, (byte) -91);
		@Pc(63) int local63 = 0;
		@Pc(87) int local87;
		if (local43 > 3 && local49 > 3 && local43 < client.aClass532_1.method30625(-247853602) - 4 && local49 < client.aClass532_1.method30655((short) 128) - 4) {
			for (local87 = local43 - 4; local87 <= local43 + 4; local87++) {
				for (@Pc(96) int local96 = local49 - 4; local96 <= local49 + 4; local96++) {
					@Pc(105) int local105 = Class512.anInt5370 * 1177442423;
					if (local105 < 3 && local33.method30511(local87, local96, -662808309)) {
						local105++;
					}
					@Pc(117) int local117 = 0;
					@Pc(122) byte[][] local122 = client.aClass532_1.method30633(local105, 796728889);
					if (local122 != null) {
						local117 = (local122[local87][local96] & 0xFF) * 8 << 2;
					}
					if (local37.aClass99Array1 != null && local37.aClass99Array1[local105] != null) {
						@Pc(159) int local159 = local61 - (local37.aClass99Array1[local105].method2482(local87, local96, -1288991563) - local117);
						if (local159 > local63) {
							local63 = local159;
						}
					}
				}
			}
		}
		local87 = (local63 >> 2) * 1536;
		if (local87 > 786432) {
			local87 = 786432;
		}
		if (local87 < 262144) {
			local87 = 262144;
		}
		if (local87 > client.anInt3443 * 182292977) {
			client.anInt3443 += (local87 - client.anInt3443 * 182292977) / 24 * 659504913;
		} else if (local87 < client.anInt3443 * 182292977) {
			client.anInt3443 += (local87 - client.anInt3443 * 182292977) / 80 * 659504913;
		}
	}

	@OriginalMember(owner = "client!abx", name = "bbf", descriptor = "(Lclient!yf;B)V")
	static void method16620(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = ((Class132_Sub1_Sub1_Sub1_Sub2) arg0.aClass132_Sub1_Sub1_Sub1_4).method20064(true, (byte) 91);
	}

	@OriginalMember(owner = "client!abx", name = "e", descriptor = "(I)J")
	public static long method16621(@OriginalArg(0) int arg0) {
		try {
			@Pc(14) URL local14 = new URL(Class119.method8605("services", false, -1204737034) + "m=accountappeal/login.ws");
			@Pc(17) URLConnection local17 = local14.openConnection();
			local17.setRequestProperty("connection", "close");
			local17.setDoInput(true);
			local17.setDoOutput(true);
			local17.setConnectTimeout(5000);
			@Pc(36) OutputStreamWriter local36 = new OutputStreamWriter(local17.getOutputStream());
			local36.write("data1=req");
			local36.flush();
			@Pc(44) InputStream local44 = local17.getInputStream();
			@Pc(50) Class93_Sub41 local50 = new Class93_Sub41(new byte[1000]);
			do {
				@Pc(65) int local65 = local44.read(local50.aByteArray58, local50.anInt3070 * 212851357, 1000 - local50.anInt3070 * 212851357);
				if (local65 == -1) {
					local50.anInt3070 = 0;
					return local50.method22435(-2118205838);
				}
				local50.anInt3070 += local65 * -1445626955;
			} while (local50.anInt3070 * 212851357 < 1000);
			return 0L;
		} catch (@Pc(96) Exception local96) {
			return 0L;
		}
	}

	@OriginalMember(owner = "client!abx", name = "avq", descriptor = "(Lclient!yf;B)V")
	static void method16622(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt6052 -= -1915563430;
		client.aShort153 = (short) arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		if (client.aShort153 <= 0) {
			client.aShort153 = 256;
		}
		client.aShort152 = (short) arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		if (client.aShort152 <= 0) {
			client.aShort152 = 205;
		}
	}

	@OriginalMember(owner = "client!abx", name = "e", descriptor = "(IIII)I")
	public static int method16623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return arg1;
		} else if (local3 == 2) {
			return 7 - arg0;
		} else {
			return 7 - arg1;
		}
	}

	@OriginalMember(owner = "client!abx", name = "<init>", descriptor = "()V")
	Class49() {
	}

	@OriginalMember(owner = "client!abx", name = "l", descriptor = "()Ljava/net/Socket;")
	public abstract Socket method16607() throws IOException;

	@OriginalMember(owner = "client!abx", name = "m", descriptor = "(I)Ljava/net/Socket;")
	final Socket method16608(@OriginalArg(0) int arg0) throws IOException {
		return new Socket(this.aString58, this.anInt2384 * -872061967);
	}

	@OriginalMember(owner = "client!abx", name = "k", descriptor = "()Ljava/net/Socket;")
	public abstract Socket method16609() throws IOException;

	@OriginalMember(owner = "client!abx", name = "w", descriptor = "()Ljava/net/Socket;")
	public abstract Socket method16610() throws IOException;

	@OriginalMember(owner = "client!abx", name = "n", descriptor = "(I)Ljava/net/Socket;")
	public abstract Socket method16611(@OriginalArg(0) int arg0) throws IOException;

	@OriginalMember(owner = "client!abx", name = "f", descriptor = "()Ljava/net/Socket;")
	public abstract Socket method16614() throws IOException;

	@OriginalMember(owner = "client!abx", name = "c", descriptor = "()Ljava/net/Socket;")
	final Socket method16616() throws IOException {
		return new Socket(this.aString58, this.anInt2384 * -872061967);
	}

	@OriginalMember(owner = "client!abx", name = "r", descriptor = "()Ljava/net/Socket;")
	final Socket method16617() throws IOException {
		return new Socket(this.aString58, this.anInt2384 * -872061967);
	}

	@OriginalMember(owner = "client!abx", name = "v", descriptor = "()Ljava/net/Socket;")
	final Socket method16618() throws IOException {
		return new Socket(this.aString58, this.anInt2384 * -872061967);
	}
}
