package com.jagex;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fx")
public final class Class278 {

	@OriginalMember(owner = "client!fx", name = "cn", descriptor = "I")
	public static int anInt3927;

	@OriginalMember(owner = "client!fx", name = "t", descriptor = "Lclient!fx;")
	public static final Class278 aClass278_5 = new Class278(4);

	@OriginalMember(owner = "client!fx", name = "f", descriptor = "Lclient!fx;")
	static final Class278 aClass278_1 = new Class278(8);

	@OriginalMember(owner = "client!fx", name = "e", descriptor = "Lclient!fx;")
	public static final Class278 aClass278_3 = new Class278(7);

	@OriginalMember(owner = "client!fx", name = "u", descriptor = "Lclient!fx;")
	static final Class278 aClass278_6 = new Class278(0);

	@OriginalMember(owner = "client!fx", name = "l", descriptor = "Lclient!fx;")
	static final Class278 aClass278_10 = new Class278(3);

	@OriginalMember(owner = "client!fx", name = "g", descriptor = "Lclient!fx;")
	static final Class278 aClass278_2 = new Class278(1);

	@OriginalMember(owner = "client!fx", name = "i", descriptor = "Lclient!fx;")
	static final Class278 aClass278_7 = new Class278(2);

	@OriginalMember(owner = "client!fx", name = "m", descriptor = "Lclient!fx;")
	static final Class278 aClass278_8 = new Class278(5);

	@OriginalMember(owner = "client!fx", name = "o", descriptor = "Lclient!fx;")
	static final Class278 aClass278_9 = new Class278(9);

	@OriginalMember(owner = "client!fx", name = "j", descriptor = "Lclient!fx;")
	static final Class278 aClass278_4 = new Class278(6);

	@OriginalMember(owner = "client!fx", name = "a", descriptor = "I")
	final int anInt3926;

	@OriginalMember(owner = "client!fx", name = "te", descriptor = "(Lclient!yp;I)V")
	static void method26833(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2138430358);
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local16.anInt4160 * 104389345;
	}

	@OriginalMember(owner = "client!fx", name = "alv", descriptor = "(Lclient!yp;I)V")
	static void method26834(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		if (Class13.aBoolean5 && Class411.aFrame2 != null) {
			Class126.method20383(Class703.aClass80_Sub37_49.aClass165_Sub18_1.method16183((short) 32767), -1, -1, false, 1615516245);
		}
		if (Class651.method33131(1990321592) == Class544.aClass544_3) {
			Class706.method37137(-1413673503);
			System.exit(0);
		} else {
			Class542.method31173((byte) 97);
		}
	}

	@OriginalMember(owner = "client!fx", name = "g", descriptor = "(Ljava/lang/CharSequence;II)I")
	public static int method26835(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return Class508.method30527(arg0, arg1, true, (byte) -116);
	}

	@OriginalMember(owner = "client!fx", name = "g", descriptor = "(ZI)V")
	public static void method26836(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!fx", name = "alw", descriptor = "(Lclient!yp;B)V")
	static void method26837(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5776 -= -1650379242;
		Class351.method28017((String) arg0.anObjectArray46[arg0.anInt5776 * -2070619997], (String) arg0.anObjectArray46[arg0.anInt5776 * -2070619997 + 1], "", arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581] == 1, false, -106604841);
	}

	@OriginalMember(owner = "client!fx", name = "f", descriptor = "(Ljava/io/InputStream;II)[B")
	static byte[] method26838(@OriginalArg(0) InputStream arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		@Pc(2) byte[] local2 = new byte[5];
		if (arg0.read(local2, 0, 5) != 5) {
			throw new IOException("2");
		}
		@Pc(19) ByteArrayOutputStream local19 = new ByteArrayOutputStream(arg1);
		@Pc(22) Class560 local22 = Class559.aClass560_2;
		synchronized (Class559.aClass560_2) {
			if (!Class559.aClass560_2.method31416(local2, 1614908639)) {
				throw new IOException("3");
			}
			Class559.aClass560_2.method31415(arg0, local19, (long) arg1);
		}
		local19.flush();
		return local19.toByteArray();
	}

	@OriginalMember(owner = "client!fx", name = "g", descriptor = "(II)Z")
	static boolean method26839(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 < 7;
	}

	@OriginalMember(owner = "client!fx", name = "<init>", descriptor = "(I)V")
	Class278(@OriginalArg(0) int arg0) {
		this.anInt3926 = arg0 * -62412451;
	}

	@OriginalMember(owner = "client!fx", name = "t", descriptor = "(I)I")
	public int method26831(@OriginalArg(0) int arg0) {
		return this.anInt3926 * -460983563 | 0x2000000;
	}

	@OriginalMember(owner = "client!fx", name = "f", descriptor = "()I")
	public int method26832() {
		return this.anInt3926 * -460983563 | 0x2000000;
	}
}
