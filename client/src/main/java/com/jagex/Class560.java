package com.jagex;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!st")
public final class Class560 {

	@OriginalMember(owner = "client!st", name = "q", descriptor = "I")
	int anInt5186;

	@OriginalMember(owner = "client!st", name = "t", descriptor = "Lclient!rd;")
	Class527 aClass527_1 = new Class527();

	@OriginalMember(owner = "client!st", name = "f", descriptor = "Lclient!jc;")
	Class357 aClass357_1 = new Class357();

	@OriginalMember(owner = "client!st", name = "e", descriptor = "[S")
	short[] aShortArray131 = new short[192];

	@OriginalMember(owner = "client!st", name = "u", descriptor = "[S")
	short[] aShortArray136 = new short[12];

	@OriginalMember(owner = "client!st", name = "l", descriptor = "[S")
	short[] aShortArray135 = new short[12];

	@OriginalMember(owner = "client!st", name = "g", descriptor = "[S")
	short[] aShortArray132 = new short[12];

	@OriginalMember(owner = "client!st", name = "i", descriptor = "[S")
	short[] aShortArray130 = new short[12];

	@OriginalMember(owner = "client!st", name = "m", descriptor = "[S")
	short[] aShortArray133 = new short[192];

	@OriginalMember(owner = "client!st", name = "o", descriptor = "[Lclient!jf;")
	Class359[] aClass359Array1 = new Class359[4];

	@OriginalMember(owner = "client!st", name = "j", descriptor = "[S")
	short[] aShortArray134 = new short[114];

	@OriginalMember(owner = "client!st", name = "a", descriptor = "Lclient!jf;")
	Class359 aClass359_1 = new Class359(4);

	@OriginalMember(owner = "client!st", name = "s", descriptor = "Lclient!sx;")
	Class563 aClass563_1 = new Class563(this);

	@OriginalMember(owner = "client!st", name = "k", descriptor = "Lclient!sx;")
	Class563 aClass563_2 = new Class563(this);

	@OriginalMember(owner = "client!st", name = "x", descriptor = "Lclient!sk;")
	Class552 aClass552_1 = new Class552(this);

	@OriginalMember(owner = "client!st", name = "w", descriptor = "I")
	int anInt5187 = 1262719859;

	@OriginalMember(owner = "client!st", name = "r", descriptor = "I")
	int anInt5185 = -1332378921;

	@OriginalMember(owner = "client!st", name = "acd", descriptor = "(Lclient!yp;I)V")
	static void method31422(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[arg0.anInt5778 * 1896589581 - 1] = arg0.aClass378_3.method28485(1238937647)[arg0.anIntArray525[arg0.anInt5778 * 1896589581 - 1]];
	}

	@OriginalMember(owner = "client!st", name = "e", descriptor = "(Ljava/lang/String;I)Z")
	static boolean method31423(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (arg0 == null) {
			return false;
		}
		try {
			new URL(arg0);
			return true;
		} catch (@Pc(10) MalformedURLException local10) {
			return false;
		}
	}

	@OriginalMember(owner = "client!st", name = "jn", descriptor = "(Lclient!yp;B)V")
	static void method31424(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5778 -= 2036747717;
	}

	@OriginalMember(owner = "client!st", name = "<init>", descriptor = "()V")
	Class560() {
		for (@Pc(75) int local75 = 0; local75 < 4; local75++) {
			this.aClass359Array1[local75] = new Class359(6);
		}
	}

	@OriginalMember(owner = "client!st", name = "g", descriptor = "(I)Z")
	boolean method31411(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		if (this.anInt5187 * 1574254149 != arg0) {
			this.anInt5187 = arg0 * -1262719859;
			this.anInt5185 = Math.max(this.anInt5187 * 1574254149, 1) * 1332378921;
			this.aClass527_1.method30689(Math.max(this.anInt5185 * -1521651943, 4096), 167450924);
		}
		return true;
	}

	@OriginalMember(owner = "client!st", name = "j", descriptor = "([B)Z")
	boolean method31412(@OriginalArg(0) byte[] arg0) {
		if (arg0.length < 5) {
			return false;
		}
		@Pc(11) int local11 = arg0[0] & 0xFF;
		@Pc(15) int local15 = local11 % 9;
		@Pc(19) int local19 = local11 / 9;
		@Pc(23) int local23 = local19 % 5;
		@Pc(27) int local27 = local19 / 5;
		@Pc(29) int local29 = 0;
		for (@Pc(31) int local31 = 0; local31 < 4; local31++) {
			local29 += (arg0[local31 + 1] & 0xFF) << local31 * 8;
		}
		return this.method31414(local15, local23, local27, -164039396) ? this.method31413(local29, 146300114) : false;
	}

	@OriginalMember(owner = "client!st", name = "t", descriptor = "(II)Z")
	boolean method31413(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 < 0) {
			return false;
		}
		if (this.anInt5187 * 1574254149 != arg0) {
			this.anInt5187 = arg0 * -1262719859;
			this.anInt5185 = Math.max(this.anInt5187 * 1574254149, 1) * 1332378921;
			this.aClass527_1.method30689(Math.max(this.anInt5185 * -1521651943, 4096), 1848887944);
		}
		return true;
	}

	@OriginalMember(owner = "client!st", name = "f", descriptor = "(IIII)Z")
	boolean method31414(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 > 8 || arg1 > 4 || arg2 > 4) {
			return false;
		}
		this.aClass552_1.method31349(arg1, arg0, -518844201);
		@Pc(20) int local20 = 0x1 << arg2;
		this.aClass563_1.method31446(local20, 1478342793);
		this.aClass563_2.method31446(local20, -638420223);
		this.anInt5186 = (local20 - 1) * 2003184739;
		return true;
	}

	@OriginalMember(owner = "client!st", name = "u", descriptor = "(Ljava/io/InputStream;Ljava/io/OutputStream;J)Z")
	boolean method31415(@OriginalArg(0) InputStream arg0, @OriginalArg(1) OutputStream arg1, @OriginalArg(2) long arg2) throws IOException {
		this.aClass357_1.method28104(arg0, 193534718);
		this.aClass527_1.method30690(arg1, 1231799506);
		this.method31417((byte) 1);
		@Pc(15) int local15 = Class293.method26957(1234780958);
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		@Pc(23) int local23 = 0;
		@Pc(25) long local25 = 0L;
		@Pc(27) byte local27 = 0;
		while (arg2 < 0L || local25 < arg2) {
			@Pc(43) int local43 = (int) local25 & this.anInt5186 * 994424139;
			if (this.aClass357_1.method28116(this.aShortArray131, (local15 << 4) + local43, -1368252999) == 0) {
				@Pc(63) Class564 local63 = this.aClass552_1.method31351((int) local25, local27, (short) -13440);
				if (Class278.method26839(local15, 1823981843)) {
					local27 = local63.method31462(this.aClass357_1, (byte) -15);
				} else {
					local27 = local63.method31463(this.aClass357_1, this.aClass527_1.method30696(local17, -2119632546), (byte) 0);
				}
				this.aClass527_1.method30693(local27, -1582234808);
				local15 = Class354.method28074(local15, (byte) 62);
				local25++;
			} else {
				@Pc(110) int local110;
				@Pc(147) int local147;
				if (this.aClass357_1.method28116(this.aShortArray136, local15, -1130025062) == 1) {
					local110 = 0;
					if (this.aClass357_1.method28116(this.aShortArray135, local15, -1037371463) != 0) {
						if (this.aClass357_1.method28116(this.aShortArray132, local15, 682113084) == 0) {
							local147 = local19;
						} else {
							if (this.aClass357_1.method28116(this.aShortArray130, local15, 1493674769) == 0) {
								local147 = local21;
							} else {
								local147 = local23;
								local23 = local21;
							}
							local21 = local19;
						}
						local19 = local17;
						local17 = local147;
					} else if (this.aClass357_1.method28116(this.aShortArray133, local43 + (local15 << 4), 1840211271) == 0) {
						local15 = Class164.method15804(local15, 1492264964);
						local110 = 1;
					}
					if (local110 == 0) {
						local110 = this.aClass563_2.method31448(this.aClass357_1, local43, 795476915) + 2;
						local15 = Class452.method29287(local15, (short) -17666);
					}
				} else {
					local23 = local21;
					local21 = local19;
					local19 = local17;
					local110 = this.aClass563_1.method31448(this.aClass357_1, local43, 1369626162) + 2;
					local15 = Class256.method26414(local15, 858618966);
					local147 = this.aClass359Array1[Class643.method33025(local110, 1004656153)].method28133(this.aClass357_1, (byte) -10);
					if (local147 >= 4) {
						@Pc(226) int local226 = (local147 >> 1) - 1;
						local17 = (local147 & 0x1 | 0x2) << local226;
						if (local147 < 14) {
							local17 += Class506.method30495(this.aShortArray134, local17 - local147 - 1, this.aClass357_1, local226, 1782075874);
						} else {
							local17 += this.aClass357_1.method28107(local226 - 4, (byte) -64) << 4;
							local17 += this.aClass359_1.method28134(this.aClass357_1, -916490354);
							if (local17 < 0) {
								if (local17 != -1) {
									return false;
								}
								break;
							}
						}
					} else {
						local17 = local147;
					}
				}
				if ((long) local17 >= local25 || local17 >= this.anInt5185 * -1521651943) {
					return false;
				}
				this.aClass527_1.method30694(local17, local110, 2028792132);
				local25 += local110;
				local27 = this.aClass527_1.method30696(0, -479432707);
			}
		}
		this.aClass527_1.method30704(8607184);
		this.aClass527_1.method30705(1758319366);
		this.aClass357_1.method28105(-490473985);
		return true;
	}

	@OriginalMember(owner = "client!st", name = "l", descriptor = "([BI)Z")
	boolean method31416(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (arg0.length < 5) {
			return false;
		}
		@Pc(11) int local11 = arg0[0] & 0xFF;
		@Pc(15) int local15 = local11 % 9;
		@Pc(19) int local19 = local11 / 9;
		@Pc(23) int local23 = local19 % 5;
		@Pc(27) int local27 = local19 / 5;
		@Pc(29) int local29 = 0;
		for (@Pc(31) int local31 = 0; local31 < 4; local31++) {
			local29 += (arg0[local31 + 1] & 0xFF) << local31 * 8;
		}
		return this.method31414(local15, local23, local27, 1934394763) ? this.method31413(local29, 146300114) : false;
	}

	@OriginalMember(owner = "client!st", name = "e", descriptor = "(B)V")
	void method31417(@OriginalArg(0) byte arg0) throws IOException {
		this.aClass527_1.method30692(false, 532231894);
		Class584.method31847(this.aShortArray131, -25685211);
		Class584.method31847(this.aShortArray133, 901773338);
		Class584.method31847(this.aShortArray136, 33647511);
		Class584.method31847(this.aShortArray135, -614443771);
		Class584.method31847(this.aShortArray132, 580617447);
		Class584.method31847(this.aShortArray130, 779377113);
		Class584.method31847(this.aShortArray134, 299070146);
		this.aClass552_1.method31350(-352441662);
		for (@Pc(38) int local38 = 0; local38 < 4; local38++) {
			this.aClass359Array1[local38].method28132(-2072378538);
		}
		this.aClass563_1.method31447((byte) -27);
		this.aClass563_2.method31447((byte) -67);
		this.aClass359_1.method28132(-1881780153);
		this.aClass357_1.method28106(-516625049);
	}

	@OriginalMember(owner = "client!st", name = "i", descriptor = "(I)Z")
	boolean method31418(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		if (this.anInt5187 * 1574254149 != arg0) {
			this.anInt5187 = arg0 * -1262719859;
			this.anInt5185 = Math.max(this.anInt5187 * 1574254149, 1) * 1332378921;
			this.aClass527_1.method30689(Math.max(this.anInt5185 * -1521651943, 4096), 107772626);
		}
		return true;
	}

	@OriginalMember(owner = "client!st", name = "m", descriptor = "(III)Z")
	boolean method31419(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 > 8 || arg1 > 4 || arg2 > 4) {
			return false;
		}
		this.aClass552_1.method31349(arg1, arg0, -1167075192);
		@Pc(20) int local20 = 0x1 << arg2;
		this.aClass563_1.method31446(local20, -1294791718);
		this.aClass563_2.method31446(local20, -1465428431);
		this.anInt5186 = (local20 - 1) * 2003184739;
		return true;
	}

	@OriginalMember(owner = "client!st", name = "o", descriptor = "(III)Z")
	boolean method31420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 > 8 || arg1 > 4 || arg2 > 4) {
			return false;
		}
		this.aClass552_1.method31349(arg1, arg0, -1797458818);
		@Pc(20) int local20 = 0x1 << arg2;
		this.aClass563_1.method31446(local20, 769950874);
		this.aClass563_2.method31446(local20, -358108878);
		this.anInt5186 = (local20 - 1) * 2003184739;
		return true;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "([B)Z")
	boolean method31421(@OriginalArg(0) byte[] arg0) {
		if (arg0.length < 5) {
			return false;
		}
		@Pc(11) int local11 = arg0[0] & 0xFF;
		@Pc(15) int local15 = local11 % 9;
		@Pc(19) int local19 = local11 / 9;
		@Pc(23) int local23 = local19 % 5;
		@Pc(27) int local27 = local19 / 5;
		@Pc(29) int local29 = 0;
		for (@Pc(31) int local31 = 0; local31 < 4; local31++) {
			local29 += (arg0[local31 + 1] & 0xFF) << local31 * 8;
		}
		return this.method31414(local15, local23, local27, 1824438645) ? this.method31413(local29, 146300114) : false;
	}
}
