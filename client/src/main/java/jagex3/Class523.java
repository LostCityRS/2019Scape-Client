package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public final class Class523 {

	@OriginalMember(owner = "client!r", name = "rm", descriptor = "I")
	static int anInt5386;

	@OriginalMember(owner = "client!r", name = "e", descriptor = "I")
	public int anInt5384;

	@OriginalMember(owner = "client!r", name = "n", descriptor = "I")
	int anInt5385;

	@OriginalMember(owner = "client!r", name = "v", descriptor = "(I)I")
	public static int method30549(@OriginalArg(0) int arg0) {
		return Class166_Sub13.aTwitchTV1.GetStreamState();
	}

	@OriginalMember(owner = "client!r", name = "pn", descriptor = "(Lclient!yf;I)V")
	static void method30550(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, 180833039);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class601.method32031(local16, local22, arg0, -736466200);
	}

	@OriginalMember(owner = "client!r", name = "fq", descriptor = "(I)V")
	static void method30551(@OriginalArg(0) int arg0) {
		Class682.aClass32_Sub1_3.method17820(5, -1312417448);
		Class692.aClass32_Sub4_3.method17820(5, -1233337353);
		Class343.aClass32_Sub19_1.method17820(5, -1795925862);
		client.aClass532_1.method30647(1631537682).method17820(5, -1004848175);
		Class162.aClass32_Sub3_2.method17820(5, -2024153195);
		Class277.aClass32_Sub12_1.method17820(5, -1835658016);
		Class32.aClass32_Sub17_23.method17820(5, -1151565447);
		Class501.aClass32_Sub18_1.method17820(5, -1718353166);
		Class30.aClass32_Sub16_1.method17820(5, -1031774923);
		Class21.aClass79_Sub1_Sub1_1.method1423(5, -111955687);
		Class684.aClass79_Sub1_Sub2_7.method1482(5, -1616506229);
		Class39.aClass79_Sub1_Sub2_1.method1482(5, -1523319173);
		Class93_Sub26_Sub6.aClass79_Sub1_Sub2_3.method1482(5, -1189746683);
		Class429.aClass79_Sub1_Sub2_5.method1482(5, -1924158118);
		Class265.aClass79_Sub1_Sub2_4.method1482(5, -1104177768);
		Class166_Sub6.aClass32_Sub5_1.method17820(5, -2030403937);
		Class542.aClass32_Sub2_3.method17820(5, -1801999068);
		Class466.aClass32_Sub20_3.method17820(5, -1978691333);
		Class124.aClass32_Sub21_7.method17820(5, -1316724517);
		Class123.aClass32_Sub11_2.method17820(5, -1808468459);
		Class51.aClass32_Sub9_1.method17820(5, -1451543680);
		Class668.aClass32_Sub15_1.method17820(5, -1704764360);
		Class311.aClass32_Sub6_1.method17820(5, -2134877179);
		Class366.aClass32_Sub8_1.method17820(5, -1154107576);
		Class534.aClass32_Sub10_1.method17820(5, -1373316933);
		Class673.method33270(5, (byte) 75);
		Class558.method31289(50, 1458579343);
		Class157.aClass462_2.method29425(50, 1075961377);
		Class656.method32928(5, 1584778006);
		Class613.method32246(5, (byte) 6);
		client.aClass240_66.method25925(5, (byte) 6);
		client.aClass240_69.method25925(5, (byte) 14);
		Class687.aClass240_96.method25925(5, (byte) -5);
		client.aClass240_70.method25925(5, (byte) 12);
		Class74.aClass32_2.method17820(5, -1592302955);
		Class276.aClass32_3.method17820(5, -1944128075);
		client.aClass240_67.method25925(5, (byte) -5);
	}

	@OriginalMember(owner = "client!r", name = "azu", descriptor = "(Lclient!yf;I)V")
	static void method30552(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub17_1.method15723(1213114059) ? 1 : 0;
	}

	@OriginalMember(owner = "client!r", name = "n", descriptor = "(IB)V")
	public void method30542(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.anInt5384 = arg0 * 1188353625;
		this.anInt5385 = 0;
	}

	@OriginalMember(owner = "client!r", name = "e", descriptor = "(IIIB)Z")
	public boolean method30543(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(4) int local4 = this.anInt5385 * 861434827;
		if (this.anInt5384 * -1093332503 == arg0 && this.anInt5385 * 861434827 == 0) {
			return false;
		}
		@Pc(59) boolean local59;
		@Pc(85) int local85;
		if (this.anInt5385 * 861434827 == 0) {
			if (arg0 > this.anInt5384 * -1093332503 && arg0 <= arg1 + this.anInt5384 * -1093332503 || arg0 < this.anInt5384 * -1093332503 && arg0 >= this.anInt5384 * -1093332503 - arg1) {
				this.anInt5384 = arg0 * 1188353625;
				return false;
			}
			local59 = true;
		} else {
			@Pc(92) int local92;
			if (this.anInt5385 * 861434827 > 0 && arg0 > this.anInt5384 * -1093332503) {
				local85 = this.anInt5385 * 861434827 * 861434827 * this.anInt5385 / (arg1 * 2);
				local92 = local85 + this.anInt5384 * -1093332503;
				if (local92 < arg0 && local92 >= this.anInt5384 * -1093332503) {
					local59 = true;
				} else {
					local59 = false;
				}
			} else if (this.anInt5385 * 861434827 < 0 && arg0 < this.anInt5384 * -1093332503) {
				local85 = this.anInt5385 * 861434827 * 861434827 * this.anInt5385 / (arg1 * 2);
				local92 = this.anInt5384 * -1093332503 - local85;
				if (local92 > arg0 && local92 <= this.anInt5384 * -1093332503) {
					local59 = true;
				} else {
					local59 = false;
				}
			} else {
				local59 = false;
			}
		}
		if (local59) {
			if (arg0 > this.anInt5384 * -1093332503) {
				this.anInt5385 += arg1 * 1484233187;
				if (arg2 != 0 && this.anInt5385 * 861434827 > arg2) {
					this.anInt5385 = arg2 * 1484233187;
				}
			} else {
				this.anInt5385 -= arg1 * 1484233187;
				if (arg2 != 0 && this.anInt5385 * 861434827 < -arg2) {
					this.anInt5385 = -arg2 * 1484233187;
				}
			}
			if (local4 != this.anInt5385 * 861434827) {
				local85 = this.anInt5385 * 861434827 * 861434827 * this.anInt5385 / (arg1 * 2);
				if (arg0 > this.anInt5384 * -1093332503) {
					if (this.anInt5384 * -1093332503 + local85 > arg0) {
						this.anInt5385 = local4 * 1484233187;
					}
				} else if (arg0 < this.anInt5384 * -1093332503 && this.anInt5384 * -1093332503 - local85 < arg0) {
					this.anInt5385 = local4 * 1484233187;
				}
			}
		} else if (this.anInt5385 * 861434827 > 0) {
			this.anInt5385 -= arg1 * 1484233187;
			if (this.anInt5385 * 861434827 < 0) {
				this.anInt5385 = 0;
			}
		} else {
			this.anInt5385 += arg1 * 1484233187;
			if (this.anInt5385 * 861434827 > 0) {
				this.anInt5385 = 0;
			}
		}
		this.anInt5384 += (this.anInt5385 * 861434827 + local4 >> 1) * 1188353625;
		return local59;
	}

	@OriginalMember(owner = "client!r", name = "m", descriptor = "(I)I")
	public int method30544(@OriginalArg(0) int arg0) {
		return this.anInt5384 * -1093332503 & 0x3FFF;
	}

	@OriginalMember(owner = "client!r", name = "k", descriptor = "(I)V")
	public void method30545(@OriginalArg(0) int arg0) {
		this.anInt5384 = (this.anInt5384 * -1093332503 & 0x3FFF) * 1188353625;
	}

	@OriginalMember(owner = "client!r", name = "f", descriptor = "(III)Z")
	public boolean method30546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = this.anInt5385 * 861434827;
		if (this.anInt5384 * -1093332503 == arg0 && this.anInt5385 * 861434827 == 0) {
			return false;
		}
		@Pc(59) boolean local59;
		@Pc(85) int local85;
		if (this.anInt5385 * 861434827 == 0) {
			if (arg0 > this.anInt5384 * -1093332503 && arg0 <= arg1 + this.anInt5384 * -1093332503 || arg0 < this.anInt5384 * -1093332503 && arg0 >= this.anInt5384 * -1093332503 - arg1) {
				this.anInt5384 = arg0 * 1188353625;
				return false;
			}
			local59 = true;
		} else {
			@Pc(92) int local92;
			if (this.anInt5385 * 861434827 > 0 && arg0 > this.anInt5384 * -1093332503) {
				local85 = this.anInt5385 * 861434827 * 861434827 * this.anInt5385 / (arg1 * 2);
				local92 = local85 + this.anInt5384 * -1093332503;
				if (local92 < arg0 && local92 >= this.anInt5384 * -1093332503) {
					local59 = true;
				} else {
					local59 = false;
				}
			} else if (this.anInt5385 * 861434827 < 0 && arg0 < this.anInt5384 * -1093332503) {
				local85 = this.anInt5385 * 861434827 * 861434827 * this.anInt5385 / (arg1 * 2);
				local92 = this.anInt5384 * -1093332503 - local85;
				if (local92 > arg0 && local92 <= this.anInt5384 * -1093332503) {
					local59 = true;
				} else {
					local59 = false;
				}
			} else {
				local59 = false;
			}
		}
		if (local59) {
			if (arg0 > this.anInt5384 * -1093332503) {
				this.anInt5385 += arg1 * 1484233187;
				if (arg2 != 0 && this.anInt5385 * 861434827 > arg2) {
					this.anInt5385 = arg2 * 1484233187;
				}
			} else {
				this.anInt5385 -= arg1 * 1484233187;
				if (arg2 != 0 && this.anInt5385 * 861434827 < -arg2) {
					this.anInt5385 = -arg2 * 1484233187;
				}
			}
			if (local4 != this.anInt5385 * 861434827) {
				local85 = this.anInt5385 * 861434827 * 861434827 * this.anInt5385 / (arg1 * 2);
				if (arg0 > this.anInt5384 * -1093332503) {
					if (this.anInt5384 * -1093332503 + local85 > arg0) {
						this.anInt5385 = local4 * 1484233187;
					}
				} else if (arg0 < this.anInt5384 * -1093332503 && this.anInt5384 * -1093332503 - local85 < arg0) {
					this.anInt5385 = local4 * 1484233187;
				}
			}
		} else if (this.anInt5385 * 861434827 > 0) {
			this.anInt5385 -= arg1 * 1484233187;
			if (this.anInt5385 * 861434827 < 0) {
				this.anInt5385 = 0;
			}
		} else {
			this.anInt5385 += arg1 * 1484233187;
			if (this.anInt5385 * 861434827 > 0) {
				this.anInt5385 = 0;
			}
		}
		this.anInt5384 += (this.anInt5385 * 861434827 + local4 >> 1) * 1188353625;
		return local59;
	}

	@OriginalMember(owner = "client!r", name = "w", descriptor = "(I)V")
	public void method30547(@OriginalArg(0) int arg0) {
		this.anInt5384 = arg0 * 1188353625;
		this.anInt5385 = 0;
	}

	@OriginalMember(owner = "client!r", name = "l", descriptor = "()V")
	public void method30548() {
		this.anInt5384 = (this.anInt5384 * -1093332503 & 0x3FFF) * 1188353625;
	}
}
