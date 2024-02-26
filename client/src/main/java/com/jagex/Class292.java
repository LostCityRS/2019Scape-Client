package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.io.File;
import java.io.RandomAccessFile;

@OriginalClass("client!gm")
public final class Class292 implements Interface75 {

	@OriginalMember(owner = "client!gm", name = "ax", descriptor = "I")
	static int anInt3951;

	@OriginalMember(owner = "client!gm", name = "t", descriptor = "Lclient!gm;")
	static final Class292 aClass292_2 = new Class292(16, 100);

	@OriginalMember(owner = "client!gm", name = "f", descriptor = "Lclient!gm;")
	static final Class292 aClass292_14 = new Class292(1, 101);

	@OriginalMember(owner = "client!gm", name = "e", descriptor = "Lclient!gm;")
	static final Class292 aClass292_11 = new Class292(12, 102);

	@OriginalMember(owner = "client!gm", name = "u", descriptor = "Lclient!gm;")
	static final Class292 aClass292_3 = new Class292(6, 103);

	@OriginalMember(owner = "client!gm", name = "l", descriptor = "Lclient!gm;")
	static final Class292 aClass292_4 = new Class292(8, 104);

	@OriginalMember(owner = "client!gm", name = "g", descriptor = "Lclient!gm;")
	static final Class292 aClass292_5 = new Class292(10, 105);

	@OriginalMember(owner = "client!gm", name = "i", descriptor = "Lclient!gm;")
	static final Class292 aClass292_18 = new Class292(11, 106);

	@OriginalMember(owner = "client!gm", name = "m", descriptor = "Lclient!gm;")
	static final Class292 aClass292_7 = new Class292(0, 107);

	@OriginalMember(owner = "client!gm", name = "o", descriptor = "Lclient!gm;")
	static final Class292 aClass292_6 = new Class292(5, 108);

	@OriginalMember(owner = "client!gm", name = "j", descriptor = "Lclient!gm;")
	static final Class292 aClass292_9 = new Class292(2, 109);

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "Lclient!gm;")
	static final Class292 aClass292_10 = new Class292(9, 110);

	@OriginalMember(owner = "client!gm", name = "s", descriptor = "Lclient!gm;")
	static final Class292 aClass292_8 = new Class292(3, 111);

	@OriginalMember(owner = "client!gm", name = "k", descriptor = "Lclient!gm;")
	static final Class292 aClass292_12 = new Class292(14, 112);

	@OriginalMember(owner = "client!gm", name = "x", descriptor = "Lclient!gm;")
	static final Class292 aClass292_13 = new Class292(4, 113);

	@OriginalMember(owner = "client!gm", name = "w", descriptor = "Lclient!gm;")
	static final Class292 aClass292_1 = new Class292(15, 114);

	@OriginalMember(owner = "client!gm", name = "r", descriptor = "Lclient!gm;")
	static final Class292 aClass292_15 = new Class292(7, 115);

	@OriginalMember(owner = "client!gm", name = "q", descriptor = "Lclient!gm;")
	static final Class292 aClass292_16 = new Class292(17, 116);

	@OriginalMember(owner = "client!gm", name = "h", descriptor = "Lclient!gm;")
	static final Class292 aClass292_17 = new Class292(13, 117);

	@OriginalMember(owner = "client!gm", name = "d", descriptor = "I")
	final int anInt3950;

	@OriginalMember(owner = "client!gm", name = "z", descriptor = "I")
	final int anInt3949;

	@OriginalMember(owner = "client!gm", name = "e", descriptor = "(Ljava/lang/String;B)Ljava/io/File;")
	public static File method26945(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		if (!Class553.aBoolean913) {
			throw new RuntimeException("");
		}
		@Pc(11) File local11 = (File) Class553.aHashtable9.get(arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(22) File local22 = new File(Class553.aFile4, arg0);
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
			Class553.aHashtable9.put(arg0, local22);
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

	@OriginalMember(owner = "client!gm", name = "xm", descriptor = "(Lclient!yp;I)V")
	static void method26946(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local12 >> 28;
	}

	@OriginalMember(owner = "client!gm", name = "bbc", descriptor = "(Lclient!yp;I)V")
	static void method26947(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = ((Class120_Sub1_Sub1_Sub1_Sub2) arg0.aClass120_Sub1_Sub1_Sub1_4).method19057(true, -394962924);
	}

	@OriginalMember(owner = "client!gm", name = "bp", descriptor = "(III)Ljava/lang/String;")
	static String method26948(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg1 - arg0;
		if (local3 < -9) {
			return Class90.method1870(16711680, -1219169460);
		} else if (local3 < -6) {
			return Class90.method1870(16723968, -1961810624);
		} else if (local3 < -3) {
			return Class90.method1870(16740352, -2070910530);
		} else if (local3 < 0) {
			return Class90.method1870(16756736, -2106020291);
		} else if (local3 > 9) {
			return Class90.method1870(65280, -993861319);
		} else if (local3 > 6) {
			return Class90.method1870(4259584, -1467109098);
		} else if (local3 > 3) {
			return Class90.method1870(8453888, -1449766012);
		} else if (local3 > 0) {
			return Class90.method1870(12648192, -1658550433);
		} else {
			return Class90.method1870(16776960, -896984157);
		}
	}

	@OriginalMember(owner = "client!gm", name = "ko", descriptor = "(IIIZI)V")
	static void method26949(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		if (Class71.method18185(arg0, null, (byte) 100)) {
			Class45.method17297(Class709.aClass310Array1[arg0].aClass327Array2, -1, arg1, arg2, arg3, (byte) 94);
		}
	}

	@OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(II)V")
	Class292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3950 = arg0 * -1137818589;
		this.anInt3949 = arg1 * 323225283;
	}

	@OriginalMember(owner = "client!gm", name = "i", descriptor = "()I")
	@Override
	public int method37269() {
		return this.anInt3949 * 1371298283;
	}

	@OriginalMember(owner = "client!gm", name = "f", descriptor = "()I")
	@Override
	public int method37268() {
		return this.anInt3949 * 1371298283;
	}

	@OriginalMember(owner = "client!gm", name = "g", descriptor = "()I")
	@Override
	public int method37267() {
		return this.anInt3949 * 1371298283;
	}
}
