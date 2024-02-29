package jagex3;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sn")
public final class Class556 {

	@OriginalMember(owner = "client!sn", name = "n", descriptor = "Ljava/io/File;")
	static File aFile3;

	@OriginalMember(owner = "client!sn", name = "al", descriptor = "Lclient!aae;")
	protected static Class7 aClass7_1;

	@OriginalMember(owner = "client!sn", name = "e", descriptor = "Z")
	static boolean aBoolean813 = false;

	@OriginalMember(owner = "client!sn", name = "m", descriptor = "Ljava/util/Hashtable;")
	static Hashtable aHashtable9 = new Hashtable(16);

	@OriginalMember(owner = "client!sn", name = "u", descriptor = "(Ljava/lang/String;)Ljava/io/File;")
	public static File method31236(@OriginalArg(0) String arg0) {
		if (!aBoolean813) {
			throw new RuntimeException("");
		}
		@Pc(11) File local11 = (File) aHashtable9.get(arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(22) File local22 = new File(aFile3, arg0);
		@Pc(24) RandomAccessFile local24 = null;
		try {
			@Pc(30) File local30 = new File(local22.getParent());
			if (!local30.exists()) {
				throw new RuntimeException("");
			}
			local24 = new RandomAccessFile(local22, "rw");
			@Pc(47) int local47 = local24.read();
			local24.seek(0L);
			local24.write(local47);
			local24.seek(0L);
			local24.close();
			aHashtable9.put(arg0, local22);
			return local22;
		} catch (@Pc(66) Exception local66) {
			try {
				if (local24 != null) {
					local24.close();
					local24 = null;
				}
			} catch (@Pc(75) Exception local75) {
			}
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sn", name = "k", descriptor = "(Ljava/io/File;)V")
	static void method31237(@OriginalArg(0) File arg0) {
		aFile3 = arg0;
		if (!aFile3.exists()) {
			throw new RuntimeException("");
		}
		aBoolean813 = true;
	}

	@OriginalMember(owner = "client!sn", name = "f", descriptor = "(Ljava/io/File;)V")
	static void method31238(@OriginalArg(0) File arg0) {
		aFile3 = arg0;
		if (!aFile3.exists()) {
			throw new RuntimeException("");
		}
		aBoolean813 = true;
	}

	@OriginalMember(owner = "client!sn", name = "w", descriptor = "(Ljava/io/File;)V")
	static void method31239(@OriginalArg(0) File arg0) {
		aFile3 = arg0;
		if (!aFile3.exists()) {
			throw new RuntimeException("");
		}
		aBoolean813 = true;
	}

	@OriginalMember(owner = "client!sn", name = "l", descriptor = "()Ljava/lang/String;")
	public static String method31240() {
		return aFile3.getAbsolutePath();
	}

	@OriginalMember(owner = "client!sn", name = "mu", descriptor = "(Lclient!yf;I)V")
	static void method31241(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, -248992131);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class433.method28972(local16, local22, arg0, (byte) 25);
	}

	@OriginalMember(owner = "client!sn", name = "sc", descriptor = "(Lclient!yf;I)V")
	static void method31242(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		Class119_Sub1.method8607(local11, arg0, -1660588574);
	}

	@OriginalMember(owner = "client!sn", name = "zt", descriptor = "(Lclient!yf;B)V")
	static void method31243(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class82.aClass153_1.method14073((byte) -8) ? 1 : 0;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class82.aClass153_1.method14093(449861682) ? 1 : 0;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class82.aClass153_1.method14097(-1500840171) ? 1 : 0;
	}

	@OriginalMember(owner = "client!sn", name = "aov", descriptor = "(Lclient!yf;B)V")
	static void method31244(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		Class65.aClass123_Sub1_2.method8948((byte) 84);
	}

	@OriginalMember(owner = "client!sn", name = "<init>", descriptor = "()V")
	Class556() throws Throwable {
		throw new Error();
	}
}
