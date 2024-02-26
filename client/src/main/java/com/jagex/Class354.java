package com.jagex;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iz")
public final class Class354 {

	@OriginalMember(owner = "client!iz", name = "ar", descriptor = "I")
	public static int anInt4264;

	@OriginalMember(owner = "client!iz", name = "t", descriptor = "Lclient!iz;")
	static final Class354 aClass354_3 = new Class354(0, true);

	@OriginalMember(owner = "client!iz", name = "f", descriptor = "Lclient!iz;")
	static final Class354 aClass354_5 = new Class354(1, true);

	@OriginalMember(owner = "client!iz", name = "e", descriptor = "Lclient!iz;")
	static final Class354 aClass354_4 = new Class354(2, false);

	@OriginalMember(owner = "client!iz", name = "u", descriptor = "I")
	int anInt4263;

	@OriginalMember(owner = "client!iz", name = "l", descriptor = "Z")
	boolean aBoolean835;

	@OriginalMember(owner = "client!iz", name = "e", descriptor = "(I)V")
	static void method28073(@OriginalArg(0) int arg0) {
		if (Class125.method20589(-1391275404)) {
			Class355.aClass145_5 = Class355.aProcess1.exitValue() == 0 ? Class145.aClass145_3 : Class145.aClass145_4;
			Class355.aProcess1 = null;
		}
	}

	@OriginalMember(owner = "client!iz", name = "f", descriptor = "(IB)I")
	static int method28074(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (arg0 < 4) {
			return 0;
		} else if (arg0 < 10) {
			return arg0 - 3;
		} else {
			return arg0 - 6;
		}
	}

	@OriginalMember(owner = "client!iz", name = "mu", descriptor = "(Lclient!yp;B)V")
	static void method28075(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2099008867);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class695.method37033(local16, local22, arg0, 488541542);
	}

	@OriginalMember(owner = "client!iz", name = "ui", descriptor = "(Lclient!yp;I)V")
	static void method28076(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2129768258);
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local16.anInt4148 * -965284535;
	}

	@OriginalMember(owner = "client!iz", name = "afm", descriptor = "(Lclient!yp;B)V")
	static void method28077(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5776 -= -1650379242;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class374.method28437((String) arg0.anObjectArray46[arg0.anInt5776 * -2070619997], (String) arg0.anObjectArray46[arg0.anInt5776 * -2070619997 + 1], Class512.aClass719_3, (byte) 1);
	}

	@OriginalMember(owner = "client!iz", name = "bfg", descriptor = "(Lclient!yp;I)V")
	static void method28078(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 1;
	}

	@OriginalMember(owner = "client!iz", name = "agm", descriptor = "(Lclient!yp;I)V")
	static void method28079(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = ((Class43) Class25.aClass41_Sub9_1.method18054(local12, -455734191)).anInt137 * 1150451795;
	}

	@OriginalMember(owner = "client!iz", name = "ake", descriptor = "(Lclient!yp;I)V")
	static void method28080(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		if (Class159_Sub1.aClass24_16 == null) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
		} else {
			@Pc(20) Class80 local20 = Class159_Sub1.aClass24_16.method560((long) local12);
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local20 == null ? 0 : 1;
		}
	}

	@OriginalMember(owner = "client!iz", name = "t", descriptor = "(Ljava/io/File;[BIB)V")
	static void method28081(@OriginalArg(0) File arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) throws IOException {
		@Pc(10) DataInputStream local10 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
		try {
			local10.readFully(arg1, 0, arg2);
		} catch (@Pc(17) EOFException local17) {
		}
		local10.close();
	}

	@OriginalMember(owner = "client!iz", name = "akj", descriptor = "(Lclient!yp;B)V")
	static void method28082(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		Class159_Sub1.aBoolean406 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581] == 1;
	}

	@OriginalMember(owner = "client!iz", name = "aiz", descriptor = "(Lclient!yp;B)V")
	static void method28083(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(34) int local34 = Class610.aClass52_2.method1073(local13, 1942974745).method23052(local23, 1709162310).anInt5697 * 809932323;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local34;
	}

	@OriginalMember(owner = "client!iz", name = "h", descriptor = "(I)V")
	static void method28084(@OriginalArg(0) int arg0) {
		if (Class703.aClass80_Sub37_49.aClass165_Sub42_1.method16835(1804388149) == 1) {
			Class39.aClass540_1.method31039(new Class542(Class536.aClass536_6, null), -331631667);
		} else {
			client.aClass539_1.method30938(696655299);
			Class494.method30297(-500726862);
		}
	}

	@OriginalMember(owner = "client!iz", name = "ja", descriptor = "(Lclient!yp;B)V")
	static void method28085(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5778 -= 2036747717;
	}

	@OriginalMember(owner = "client!iz", name = "bba", descriptor = "(Lclient!yp;I)V")
	static void method28086(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = ((Class120_Sub1_Sub1_Sub1_Sub1) arg0.aClass120_Sub1_Sub1_Sub1_4).aClass335_1.anInt4201 * 6289515;
	}

	@OriginalMember(owner = "client!iz", name = "aji", descriptor = "(Lclient!yp;B)V")
	static void method28087(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = -1;
	}

	@OriginalMember(owner = "client!iz", name = "<init>", descriptor = "(IZ)V")
	Class354(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.anInt4263 = arg0 * 798447605;
		this.aBoolean835 = arg1;
	}
}
