package com.jagex;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sz")
public class Class565 {

	@OriginalMember(owner = "client!sz", name = "y", descriptor = "I")
	int anInt5384;

	@OriginalMember(owner = "client!sz", name = "e", descriptor = "Lclient!ru;")
	Class538 aClass538_1 = new Class538();

	@OriginalMember(owner = "client!sz", name = "n", descriptor = "Lclient!jp;")
	Class365 aClass365_1 = new Class365();

	@OriginalMember(owner = "client!sz", name = "m", descriptor = "[S")
	short[] aShortArray138 = new short[192];

	@OriginalMember(owner = "client!sz", name = "k", descriptor = "[S")
	short[] aShortArray132 = new short[12];

	@OriginalMember(owner = "client!sz", name = "f", descriptor = "[S")
	short[] aShortArray133 = new short[12];

	@OriginalMember(owner = "client!sz", name = "w", descriptor = "[S")
	short[] aShortArray136 = new short[12];

	@OriginalMember(owner = "client!sz", name = "l", descriptor = "[S")
	short[] aShortArray134 = new short[12];

	@OriginalMember(owner = "client!sz", name = "u", descriptor = "[S")
	short[] aShortArray135 = new short[192];

	@OriginalMember(owner = "client!sz", name = "z", descriptor = "[Lclient!jg;")
	Class360[] aClass360Array3 = new Class360[4];

	@OriginalMember(owner = "client!sz", name = "p", descriptor = "[S")
	short[] aShortArray137 = new short[114];

	@OriginalMember(owner = "client!sz", name = "d", descriptor = "Lclient!jg;")
	Class360 aClass360_2 = new Class360(4);

	@OriginalMember(owner = "client!sz", name = "c", descriptor = "Lclient!sc;")
	Class546 aClass546_2 = new Class546(this);

	@OriginalMember(owner = "client!sz", name = "r", descriptor = "Lclient!sc;")
	Class546 aClass546_1 = new Class546(this);

	@OriginalMember(owner = "client!sz", name = "v", descriptor = "Lclient!sj;")
	Class552 aClass552_1 = new Class552(this);

	@OriginalMember(owner = "client!sz", name = "o", descriptor = "I")
	int anInt5382 = 1955288547;

	@OriginalMember(owner = "client!sz", name = "s", descriptor = "I")
	int anInt5383 = -1434808789;

	@OriginalMember(owner = "client!sz", name = "<init>", descriptor = "()V", line = 26)
	Class565() {
		for (@Pc(75) int local75 = 0; local75 < 4; local75++) {
			this.aClass360Array3[local75] = new Class360(6);
		}
	}

	@OriginalMember(owner = "client!sz", name = "w", descriptor = "(I)Z", line = 31)
	boolean method31233(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		if (arg0 != this.anInt5382 * -1507760075) {
			this.anInt5382 = arg0 * -1955288547;
			this.anInt5383 = Math.max(this.anInt5382 * -1507760075, 1) * 1434808789;
			this.aClass538_1.method30762(Math.max(this.anInt5383 * 1636056957, 4096), 462433228);
		}
		return true;
	}

	@OriginalMember(owner = "client!sz", name = "l", descriptor = "(I)Z", line = 31)
	boolean method31234(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		if (arg0 != this.anInt5382 * -1507760075) {
			this.anInt5382 = arg0 * -1955288547;
			this.anInt5383 = Math.max(this.anInt5382 * -1507760075, 1) * 1434808789;
			this.aClass538_1.method30762(Math.max(this.anInt5383 * 1636056957, 4096), 1528749719);
		}
		return true;
	}

	@OriginalMember(owner = "client!sz", name = "u", descriptor = "(I)Z", line = 31)
	boolean method31235(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		if (arg0 != this.anInt5382 * -1507760075) {
			this.anInt5382 = arg0 * -1955288547;
			this.anInt5383 = Math.max(this.anInt5382 * -1507760075, 1) * 1434808789;
			this.aClass538_1.method30762(Math.max(this.anInt5383 * 1636056957, 4096), 391669992);
		}
		return true;
	}

	@OriginalMember(owner = "client!sz", name = "e", descriptor = "(IB)Z", line = 31)
	boolean method31236(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (arg0 < 0) {
			return false;
		}
		if (arg0 != this.anInt5382 * -1507760075) {
			this.anInt5382 = arg0 * -1955288547;
			this.anInt5383 = Math.max(this.anInt5382 * -1507760075, 1) * 1434808789;
			this.aClass538_1.method30762(Math.max(this.anInt5383 * 1636056957, 4096), 1865510685);
		}
		return true;
	}

	@OriginalMember(owner = "client!sz", name = "p", descriptor = "(III)Z", line = 41)
	boolean method31237(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 > 8 || arg1 > 4 || arg2 > 4) {
			return false;
		}
		this.aClass552_1.method31038(arg1, arg0, 1820913992);
		@Pc(20) int local20 = 0x1 << arg2;
		this.aClass546_2.method30963(local20, 338920743);
		this.aClass546_1.method30963(local20, 1851403565);
		this.anInt5384 = (local20 - 1) * 579102611;
		return true;
	}

	@OriginalMember(owner = "client!sz", name = "z", descriptor = "(III)Z", line = 41)
	boolean method31238(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 > 8 || arg1 > 4 || arg2 > 4) {
			return false;
		}
		this.aClass552_1.method31038(arg1, arg0, 1820913992);
		@Pc(20) int local20 = 0x1 << arg2;
		this.aClass546_2.method30963(local20, 860635942);
		this.aClass546_1.method30963(local20, 500488623);
		this.anInt5384 = (local20 - 1) * 579102611;
		return true;
	}

	@OriginalMember(owner = "client!sz", name = "d", descriptor = "(III)Z", line = 41)
	boolean method31239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 > 8 || arg1 > 4 || arg2 > 4) {
			return false;
		}
		this.aClass552_1.method31038(arg1, arg0, 1820913992);
		@Pc(20) int local20 = 0x1 << arg2;
		this.aClass546_2.method30963(local20, 851890389);
		this.aClass546_1.method30963(local20, 961387428);
		this.anInt5384 = (local20 - 1) * 579102611;
		return true;
	}

	@OriginalMember(owner = "client!sz", name = "n", descriptor = "(IIII)Z", line = 41)
	boolean method31240(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 > 8 || arg1 > 4 || arg2 > 4) {
			return false;
		}
		this.aClass552_1.method31038(arg1, arg0, 1820913992);
		@Pc(20) int local20 = 0x1 << arg2;
		this.aClass546_2.method30963(local20, -294065885);
		this.aClass546_1.method30963(local20, -68094838);
		this.anInt5384 = (local20 - 1) * 579102611;
		return true;
	}

	@OriginalMember(owner = "client!sz", name = "m", descriptor = "(I)V", line = 51)
	void method31241(@OriginalArg(0) int arg0) throws IOException {
		this.aClass538_1.method30770(false, -1490598249);
		Class294.method26597(this.aShortArray138, 1829225675);
		Class294.method26597(this.aShortArray135, -655995033);
		Class294.method26597(this.aShortArray132, -1088876009);
		Class294.method26597(this.aShortArray133, -777057281);
		Class294.method26597(this.aShortArray136, 1224825367);
		Class294.method26597(this.aShortArray134, 1706752141);
		Class294.method26597(this.aShortArray137, 1094122445);
		this.aClass552_1.method31043(-1830166081);
		for (@Pc(38) int local38 = 0; local38 < 4; local38++) {
			this.aClass360Array3[local38].method27793((byte) 31);
		}
		this.aClass546_2.method30965((byte) -68);
		this.aClass546_1.method30965((byte) -62);
		this.aClass360_2.method27793((byte) 109);
		this.aClass365_1.method27906(287819103);
	}

	@OriginalMember(owner = "client!sz", name = "v", descriptor = "()V", line = 51)
	void method31242() throws IOException {
		this.aClass538_1.method30770(false, -1490598249);
		Class294.method26597(this.aShortArray138, 1483507626);
		Class294.method26597(this.aShortArray135, -1090625714);
		Class294.method26597(this.aShortArray132, 923980918);
		Class294.method26597(this.aShortArray133, -1611125205);
		Class294.method26597(this.aShortArray136, -1053355366);
		Class294.method26597(this.aShortArray134, -874926948);
		Class294.method26597(this.aShortArray137, -1918879427);
		this.aClass552_1.method31043(-1128144223);
		for (@Pc(38) int local38 = 0; local38 < 4; local38++) {
			this.aClass360Array3[local38].method27793((byte) 64);
		}
		this.aClass546_2.method30965((byte) -41);
		this.aClass546_1.method30965((byte) -82);
		this.aClass360_2.method27793((byte) 8);
		this.aClass365_1.method27906(287819103);
	}

	@OriginalMember(owner = "client!sz", name = "c", descriptor = "()V", line = 51)
	void method31243() throws IOException {
		this.aClass538_1.method30770(false, -1490598249);
		Class294.method26597(this.aShortArray138, -120699725);
		Class294.method26597(this.aShortArray135, -981492217);
		Class294.method26597(this.aShortArray132, -840260816);
		Class294.method26597(this.aShortArray133, -1511863418);
		Class294.method26597(this.aShortArray136, 1558606999);
		Class294.method26597(this.aShortArray134, -1927820973);
		Class294.method26597(this.aShortArray137, -14646857);
		this.aClass552_1.method31043(-21194254);
		for (@Pc(38) int local38 = 0; local38 < 4; local38++) {
			this.aClass360Array3[local38].method27793((byte) 25);
		}
		this.aClass546_2.method30965((byte) -34);
		this.aClass546_1.method30965((byte) -13);
		this.aClass360_2.method27793((byte) 3);
		this.aClass365_1.method27906(287819103);
	}

	@OriginalMember(owner = "client!sz", name = "r", descriptor = "()V", line = 51)
	void method31244() throws IOException {
		this.aClass538_1.method30770(false, -1490598249);
		Class294.method26597(this.aShortArray138, -439337593);
		Class294.method26597(this.aShortArray135, 1284836746);
		Class294.method26597(this.aShortArray132, 1718191811);
		Class294.method26597(this.aShortArray133, -595894149);
		Class294.method26597(this.aShortArray136, -201426553);
		Class294.method26597(this.aShortArray134, -911014591);
		Class294.method26597(this.aShortArray137, -212935119);
		this.aClass552_1.method31043(-573324287);
		for (@Pc(38) int local38 = 0; local38 < 4; local38++) {
			this.aClass360Array3[local38].method27793((byte) 23);
		}
		this.aClass546_2.method30965((byte) -103);
		this.aClass546_1.method30965((byte) -32);
		this.aClass360_2.method27793((byte) 112);
		this.aClass365_1.method27906(287819103);
	}

	@OriginalMember(owner = "client!sz", name = "o", descriptor = "()V", line = 51)
	void method31245() throws IOException {
		this.aClass538_1.method30770(false, -1490598249);
		Class294.method26597(this.aShortArray138, 305045938);
		Class294.method26597(this.aShortArray135, -706750216);
		Class294.method26597(this.aShortArray132, -1721933563);
		Class294.method26597(this.aShortArray133, -1381715654);
		Class294.method26597(this.aShortArray136, -1960009776);
		Class294.method26597(this.aShortArray134, -235731858);
		Class294.method26597(this.aShortArray137, -414227533);
		this.aClass552_1.method31043(790392292);
		for (@Pc(38) int local38 = 0; local38 < 4; local38++) {
			this.aClass360Array3[local38].method27793((byte) 6);
		}
		this.aClass546_2.method30965((byte) -15);
		this.aClass546_1.method30965((byte) -9);
		this.aClass360_2.method27793((byte) 96);
		this.aClass365_1.method27906(287819103);
	}

	@OriginalMember(owner = "client!sz", name = "k", descriptor = "(Ljava/io/InputStream;Ljava/io/OutputStream;J)Z", line = 69)
	boolean method31246(@OriginalArg(0) InputStream arg0, @OriginalArg(1) OutputStream arg1, @OriginalArg(2) long arg2) throws IOException {
		this.aClass365_1.method27902(arg0, (byte) 14);
		this.aClass538_1.method30767(arg1, (short) 23776);
		this.method31241(-609597670);
		@Pc(15) int local15 = Class607.method31921(-50031778);
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		@Pc(23) int local23 = 0;
		@Pc(25) long local25 = 0L;
		@Pc(27) byte local27 = 0;
		while (arg2 < 0L || local25 < arg2) {
			@Pc(43) int local43 = (int) local25 & this.anInt5384 * -609235301;
			if (this.aClass365_1.method27912(this.aShortArray138, local43 + (local15 << 4), 291964485) == 0) {
				@Pc(63) Class544 local63 = this.aClass552_1.method31045((int) local25, local27, -1268206425);
				if (Class334.method27401(local15, (byte) 8)) {
					local27 = local63.method30953(this.aClass365_1, 1192084809);
				} else {
					local27 = local63.method30955(this.aClass365_1, this.aClass538_1.method30777(local17, 1006535154), -1493559391);
				}
				this.aClass538_1.method30775(local27, (byte) -34);
				local15 = Class625.method32161(local15, (byte) -123);
				local25++;
			} else {
				@Pc(110) int local110;
				@Pc(147) int local147;
				if (this.aClass365_1.method27912(this.aShortArray132, local15, 291964485) == 1) {
					local110 = 0;
					if (this.aClass365_1.method27912(this.aShortArray133, local15, 291964485) != 0) {
						if (this.aClass365_1.method27912(this.aShortArray136, local15, 291964485) == 0) {
							local147 = local19;
						} else {
							if (this.aClass365_1.method27912(this.aShortArray134, local15, 291964485) == 0) {
								local147 = local21;
							} else {
								local147 = local23;
								local23 = local21;
							}
							local21 = local19;
						}
						local19 = local17;
						local17 = local147;
					} else if (this.aClass365_1.method27912(this.aShortArray135, (local15 << 4) + local43, 291964485) == 0) {
						local15 = Class291.method26570(local15, (short) 6049);
						local110 = 1;
					}
					if (local110 == 0) {
						local110 = this.aClass546_1.method30969(this.aClass365_1, local43, (byte) 0) + 2;
						local15 = Class529.method30399(local15, (short) 21262);
					}
				} else {
					local23 = local21;
					local21 = local19;
					local19 = local17;
					local110 = this.aClass546_2.method30969(this.aClass365_1, local43, (byte) 0) + 2;
					local15 = Class655.method32721(local15, 1776389515);
					local147 = this.aClass360Array3[Class507.method30228(local110, -213051625)].method27794(this.aClass365_1, (byte) -6);
					if (local147 >= 4) {
						@Pc(226) int local226 = (local147 >> 1) - 1;
						local17 = (local147 & 0x1 | 0x2) << local226;
						if (local147 < 14) {
							local17 += Class432.method28787(this.aShortArray137, local17 - local147 - 1, this.aClass365_1, local226, -1460729276);
						} else {
							local17 += this.aClass365_1.method27908(local226 - 4, -1531762291) << 4;
							local17 += this.aClass360_2.method27797(this.aClass365_1, -1994553596);
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
				if ((long) local17 >= local25 || local17 >= this.anInt5383 * 1636056957) {
					return false;
				}
				this.aClass538_1.method30774(local17, local110, (byte) 44);
				local25 += local110;
				local27 = this.aClass538_1.method30777(0, -390086293);
			}
		}
		this.aClass538_1.method30773((byte) -61);
		this.aClass538_1.method30768((byte) -65);
		this.aClass365_1.method27904((byte) -22);
		return true;
	}

	@OriginalMember(owner = "client!sz", name = "y", descriptor = "(Ljava/io/InputStream;Ljava/io/OutputStream;J)Z", line = 69)
	boolean method31247(@OriginalArg(0) InputStream arg0, @OriginalArg(1) OutputStream arg1, @OriginalArg(2) long arg2) throws IOException {
		this.aClass365_1.method27902(arg0, (byte) 79);
		this.aClass538_1.method30767(arg1, (short) 10524);
		this.method31241(-760334178);
		@Pc(15) int local15 = Class607.method31921(483562011);
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		@Pc(23) int local23 = 0;
		@Pc(25) long local25 = 0L;
		@Pc(27) byte local27 = 0;
		while (arg2 < 0L || local25 < arg2) {
			@Pc(43) int local43 = (int) local25 & this.anInt5384 * -609235301;
			if (this.aClass365_1.method27912(this.aShortArray138, local43 + (local15 << 4), 291964485) == 0) {
				@Pc(63) Class544 local63 = this.aClass552_1.method31045((int) local25, local27, -47495073);
				if (Class334.method27401(local15, (byte) 8)) {
					local27 = local63.method30953(this.aClass365_1, 1192084809);
				} else {
					local27 = local63.method30955(this.aClass365_1, this.aClass538_1.method30777(local17, 771778951), -1042462788);
				}
				this.aClass538_1.method30775(local27, (byte) -16);
				local15 = Class625.method32161(local15, (byte) -62);
				local25++;
			} else {
				@Pc(110) int local110;
				@Pc(147) int local147;
				if (this.aClass365_1.method27912(this.aShortArray132, local15, 291964485) == 1) {
					local110 = 0;
					if (this.aClass365_1.method27912(this.aShortArray133, local15, 291964485) != 0) {
						if (this.aClass365_1.method27912(this.aShortArray136, local15, 291964485) == 0) {
							local147 = local19;
						} else {
							if (this.aClass365_1.method27912(this.aShortArray134, local15, 291964485) == 0) {
								local147 = local21;
							} else {
								local147 = local23;
								local23 = local21;
							}
							local21 = local19;
						}
						local19 = local17;
						local17 = local147;
					} else if (this.aClass365_1.method27912(this.aShortArray135, (local15 << 4) + local43, 291964485) == 0) {
						local15 = Class291.method26570(local15, (short) 18846);
						local110 = 1;
					}
					if (local110 == 0) {
						local110 = this.aClass546_1.method30969(this.aClass365_1, local43, (byte) 0) + 2;
						local15 = Class529.method30399(local15, (short) 26696);
					}
				} else {
					local23 = local21;
					local21 = local19;
					local19 = local17;
					local110 = this.aClass546_2.method30969(this.aClass365_1, local43, (byte) 0) + 2;
					local15 = Class655.method32721(local15, 2021173959);
					local147 = this.aClass360Array3[Class507.method30228(local110, -2009787938)].method27794(this.aClass365_1, (byte) -83);
					if (local147 >= 4) {
						@Pc(226) int local226 = (local147 >> 1) - 1;
						local17 = (local147 & 0x1 | 0x2) << local226;
						if (local147 < 14) {
							local17 += Class432.method28787(this.aShortArray137, local17 - local147 - 1, this.aClass365_1, local226, -1552902641);
						} else {
							local17 += this.aClass365_1.method27908(local226 - 4, -1840190341) << 4;
							local17 += this.aClass360_2.method27797(this.aClass365_1, -2040265950);
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
				if ((long) local17 >= local25 || local17 >= this.anInt5383 * 1636056957) {
					return false;
				}
				this.aClass538_1.method30774(local17, local110, (byte) 77);
				local25 += local110;
				local27 = this.aClass538_1.method30777(0, -1675016031);
			}
		}
		this.aClass538_1.method30773((byte) -30);
		this.aClass538_1.method30768((byte) -43);
		this.aClass365_1.method27904((byte) 52);
		return true;
	}

	@OriginalMember(owner = "client!sz", name = "s", descriptor = "(Ljava/io/InputStream;Ljava/io/OutputStream;J)Z", line = 69)
	boolean method31248(@OriginalArg(0) InputStream arg0, @OriginalArg(1) OutputStream arg1, @OriginalArg(2) long arg2) throws IOException {
		this.aClass365_1.method27902(arg0, (byte) 18);
		this.aClass538_1.method30767(arg1, (short) 31551);
		this.method31241(-217989290);
		@Pc(15) int local15 = Class607.method31921(1369083673);
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		@Pc(23) int local23 = 0;
		@Pc(25) long local25 = 0L;
		@Pc(27) byte local27 = 0;
		while (arg2 < 0L || local25 < arg2) {
			@Pc(43) int local43 = (int) local25 & this.anInt5384 * -609235301;
			if (this.aClass365_1.method27912(this.aShortArray138, local43 + (local15 << 4), 291964485) == 0) {
				@Pc(63) Class544 local63 = this.aClass552_1.method31045((int) local25, local27, -1685208210);
				if (Class334.method27401(local15, (byte) 8)) {
					local27 = local63.method30953(this.aClass365_1, 1192084809);
				} else {
					local27 = local63.method30955(this.aClass365_1, this.aClass538_1.method30777(local17, -72238589), -1143937005);
				}
				this.aClass538_1.method30775(local27, (byte) -12);
				local15 = Class625.method32161(local15, (byte) -93);
				local25++;
			} else {
				@Pc(110) int local110;
				@Pc(147) int local147;
				if (this.aClass365_1.method27912(this.aShortArray132, local15, 291964485) == 1) {
					local110 = 0;
					if (this.aClass365_1.method27912(this.aShortArray133, local15, 291964485) != 0) {
						if (this.aClass365_1.method27912(this.aShortArray136, local15, 291964485) == 0) {
							local147 = local19;
						} else {
							if (this.aClass365_1.method27912(this.aShortArray134, local15, 291964485) == 0) {
								local147 = local21;
							} else {
								local147 = local23;
								local23 = local21;
							}
							local21 = local19;
						}
						local19 = local17;
						local17 = local147;
					} else if (this.aClass365_1.method27912(this.aShortArray135, (local15 << 4) + local43, 291964485) == 0) {
						local15 = Class291.method26570(local15, (short) 14971);
						local110 = 1;
					}
					if (local110 == 0) {
						local110 = this.aClass546_1.method30969(this.aClass365_1, local43, (byte) 0) + 2;
						local15 = Class529.method30399(local15, (short) 20030);
					}
				} else {
					local23 = local21;
					local21 = local19;
					local19 = local17;
					local110 = this.aClass546_2.method30969(this.aClass365_1, local43, (byte) 0) + 2;
					local15 = Class655.method32721(local15, 1732328888);
					local147 = this.aClass360Array3[Class507.method30228(local110, -288359952)].method27794(this.aClass365_1, (byte) -81);
					if (local147 >= 4) {
						@Pc(226) int local226 = (local147 >> 1) - 1;
						local17 = (local147 & 0x1 | 0x2) << local226;
						if (local147 < 14) {
							local17 += Class432.method28787(this.aShortArray137, local17 - local147 - 1, this.aClass365_1, local226, -1316272715);
						} else {
							local17 += this.aClass365_1.method27908(local226 - 4, -1541353610) << 4;
							local17 += this.aClass360_2.method27797(this.aClass365_1, -1836581696);
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
				if ((long) local17 >= local25 || local17 >= this.anInt5383 * 1636056957) {
					return false;
				}
				this.aClass538_1.method30774(local17, local110, (byte) 26);
				local25 += local110;
				local27 = this.aClass538_1.method30777(0, -1755259269);
			}
		}
		this.aClass538_1.method30773((byte) -50);
		this.aClass538_1.method30768((byte) -67);
		this.aClass365_1.method27904((byte) 5);
		return true;
	}

	@OriginalMember(owner = "client!sz", name = "f", descriptor = "([BI)Z", line = 155)
	boolean method31249(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
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
		return this.method31240(local15, local23, local27, 1175627307) ? this.method31236(local29, (byte) 2) : false;
	}

	@OriginalMember(owner = "client!sz", name = "q", descriptor = "([B)Z", line = 155)
	boolean method31250(@OriginalArg(0) byte[] arg0) {
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
		return this.method31240(local15, local23, local27, 1175627307) ? this.method31236(local29, (byte) 2) : false;
	}

	@OriginalMember(owner = "client!sz", name = "x", descriptor = "([B)Z", line = 155)
	boolean method31251(@OriginalArg(0) byte[] arg0) {
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
		return this.method31240(local15, local23, local27, 1175627307) ? this.method31236(local29, (byte) 2) : false;
	}

	@OriginalMember(owner = "client!sz", name = "fb", descriptor = "(I)V", line = 2726)
	static final void method31252(@OriginalArg(0) int arg0) {
		if (Class56.method18036(client.anInt3435 * -849002901, -1497248091) || Class1.method12(client.anInt3435 * -849002901, 314071452)) {
			client.aClass67_15 = Class67.aClass67_5;
			Class642.method32520(false, (short) 23401);
		} else {
			client.aClass67_15 = Class67.aClass67_11;
			Class166_Sub20.aClass160_2 = client.aClass175_2.method24372((byte) -45);
			client.aClass175_2.method24368((byte) 44);
			Class481.method29756(14, 1823202236);
		}
	}

	@OriginalMember(owner = "client!sz", name = "asb", descriptor = "(Lclient!yf;B)V", line = 13125)
	static final void method31253(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub12_1, arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091], (byte) 48);
		Class106_Sub1.method5135(-1302342410);
		client.aBoolean601 = false;
	}

	@OriginalMember(owner = "client!sz", name = "azl", descriptor = "(Lclient!yf;I)V", line = 14193)
	static final void method31254(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub29_1.method16061(-819614202) ? 1 : 0;
	}

	@OriginalMember(owner = "client!sz", name = "bdw", descriptor = "(Lclient!yf;I)V", line = 14798)
	static final void method31255(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = client.aClass270_1.method26280(local12, -1972642690).method26370(-166394459);
	}
}
