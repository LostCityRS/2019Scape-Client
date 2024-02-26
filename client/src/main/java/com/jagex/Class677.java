package com.jagex;

import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ya")
final class Class677 implements Runnable {

	@OriginalMember(owner = "client!ya", name = "w", descriptor = "Ljava/io/FileOutputStream;")
	static FileOutputStream aFileOutputStream1;

	@OriginalMember(owner = "client!ya", name = "cc", descriptor = "(Lclient!yp;I)V")
	static void method33593(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2120949341);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class291.method26939(local16, local22, arg0, -1920317968);
	}

	@OriginalMember(owner = "client!ya", name = "ky", descriptor = "(Lclient!yp;B)V")
	static void method33594(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		Class175.method24654(local11, arg0, 1354356515);
	}

	@OriginalMember(owner = "client!ya", name = "aot", descriptor = "(Lclient!yp;B)V")
	static void method33595(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		if (Class160.aClass121_Sub1_2.method9607(-1217651876) != Class340.aClass340_7 || Class160.aClass121_Sub1_2.method9702(1915818124) != Class347.aClass347_3) {
			throw new RuntimeException();
		}
		@Pc(31) Class123_Sub3 local31 = (Class123_Sub3) Class160.aClass121_Sub1_2.method9603(-1967615480);
		@Pc(36) Class20_Sub5 local36 = (Class20_Sub5) Class160.aClass121_Sub1_2.method9693(2053835332);
		@Pc(40) Class463 local40 = local31.method10019(1578321902);
		@Pc(43) Class463 local43 = Class463.method29472(local40);
		local43.aFloat295 += local12;
		@Pc(56) Class463 local56 = Class463.method29487(local36.method23080(-1952458419), local43);
		local56.method29482();
		@Pc(63) float local63 = local31.method10006(-600816538).method29481();
		Class496.method30325(local36.method23080(-1850660925), local56, local40, local63, Class681.aClass463Array3);
		@Pc(73) Class463 local73 = null;
		if (Class681.aClass463Array3[0] == null) {
			throw new RuntimeException("");
		}
		if (Class681.aClass463Array3[1] == null) {
			local73 = Class681.aClass463Array3[0];
		} else if (Class463.method29487(local36.method23080(-897967505), Class681.aClass463Array3[0]).method29481() < Class463.method29487(local36.method23080(-855912798), Class681.aClass463Array3[1]).method29481()) {
			local73 = Class681.aClass463Array3[1];
		} else {
			local73 = Class681.aClass463Array3[0];
		}
		@Pc(132) float local132 = Class490.method30239(local40.aFloat297 - local73.aFloat297, local40.aFloat296 - local73.aFloat296, (byte) 73);
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = (int) ((double) local132 * 2607.5945876176133D) & 0x3FFF;
	}

	@OriginalMember(owner = "client!ya", name = "t", descriptor = "(I)Lclient!yp;")
	static Class690 method33596(@OriginalArg(0) int arg0) {
		if (Class681.anInt5747 * -1771402987 == Class681.anArrayList5.size()) {
			Class681.anArrayList5.add(new Class690());
		}
		@Pc(18) Class690 local18 = (Class690) Class681.anArrayList5.get(Class681.anInt5747 * -1771402987);
		Class681.anInt5747 += 1406238269;
		return local18;
	}

	@OriginalMember(owner = "client!ya", name = "ai", descriptor = "(S)V")
	static void method33597(@OriginalArg(0) short arg0) {
		@Pc(3) Class80_Sub1_Sub9 local3 = Class22.method545(14, 0L);
		local3.method22078(-1490256237);
	}

	@OriginalMember(owner = "client!ya", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			IcmpService_Sub1.anIcmpService_Sub1_1.run();
		} catch (@Pc(3) Throwable local3) {
		}
		IcmpService_Sub1.anIcmpService_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!ya", name = "q", descriptor = "()V")
	public void method33591() {
		try {
			IcmpService_Sub1.anIcmpService_Sub1_1.run();
		} catch (@Pc(3) Throwable local3) {
		}
		IcmpService_Sub1.anIcmpService_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!ya", name = "h", descriptor = "()V")
	public void method33592() {
		try {
			IcmpService_Sub1.anIcmpService_Sub1_1.run();
		} catch (@Pc(3) Throwable local3) {
		}
		IcmpService_Sub1.anIcmpService_Sub1_1 = null;
	}
}
