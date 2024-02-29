package com.jagex;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ahc")
public class Class123_Sub1 extends Class123 {

	@OriginalMember(owner = "client!ahc", name = "au", descriptor = "I")
	int anInt1015 = 0;

	@OriginalMember(owner = "client!ahc", name = "<init>", descriptor = "(Lclient!jy;)V", line = 26)
	public Class123_Sub1(@OriginalArg(0) Interface31 arg0) {
		super(Class340.aClass340_4, arg0);
	}

	@OriginalMember(owner = "client!ahc", name = "fs", descriptor = "(B)I", line = 30)
	public int method9088(@OriginalArg(0) byte arg0) {
		this.anInt1015 += 91526439;
		if (this.anInt1015 * 1218677399 == 126) {
			this.anInt1015 = 0;
		}
		return this.anInt1015 * 1218677399;
	}

	@OriginalMember(owner = "client!ahc", name = "fj", descriptor = "()I", line = 30)
	public int method9089() {
		this.anInt1015 += 91526439;
		if (this.anInt1015 * 1218677399 == 126) {
			this.anInt1015 = 0;
		}
		return this.anInt1015 * 1218677399;
	}

	@OriginalMember(owner = "client!ahc", name = "fd", descriptor = "()I", line = 30)
	public int method9090() {
		this.anInt1015 += 91526439;
		if (this.anInt1015 * 1218677399 == 126) {
			this.anInt1015 = 0;
		}
		return this.anInt1015 * 1218677399;
	}

	@OriginalMember(owner = "client!ahc", name = "fn", descriptor = "()I", line = 30)
	public int method9091() {
		this.anInt1015 += 91526439;
		if (this.anInt1015 * 1218677399 == 126) {
			this.anInt1015 = 0;
		}
		return this.anInt1015 * 1218677399;
	}

	@OriginalMember(owner = "client!ahc", name = "fz", descriptor = "(Lclient!alw;II)V", line = 36)
	public void method9092(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = arg0.anInt3070 * 212851357;
		@Pc(8) int local8 = arg0.method22465((short) 16384);
		this.method8932(Class347.method27579(local8 & 0x1, -541651080), (byte) -11);
		if ((local8 & 0x8) != 0) {
			@Pc(27) Class338 local27 = Class258.method26026(arg0.method22465((short) 16384), -2125535153);
			if (this.aClass338_2 != local27) {
				try {
					this.method8935(local27, true, 1252966408);
				} catch (@Pc(39) Exception_Sub3 local39) {
					local39.printStackTrace();
				}
			}
		}
		if ((local8 & 0x10) != 0) {
			@Pc(51) Class342 local51 = Class180.method24518(arg0.method22465((short) 16384), (byte) 38);
			if (local51 != this.aClass342_2) {
				try {
					this.method8937(local51, true, -1436778339);
				} catch (@Pc(63) Exception_Sub3 local63) {
					local63.printStackTrace();
				}
			}
		}
		if ((local8 >> 7 & 0x1) == 1) {
			@Pc(76) int local76 = arg0.method22472(-1434290800);
			if ((local76 >> Class354.aClass354_14.anInt4216 * -1416639217 & 0x1) == 1) {
				this.aClass472_8.method29546(arg0);
			}
			if ((local76 >> Class354.aClass354_2.anInt4216 * -1416639217 & 0x1) == 1) {
				this.aClass472_9.method29546(arg0);
			}
			if ((local76 >> Class354.aClass354_13.anInt4216 * -1416639217 & 0x1) == 1) {
				this.aClass472_10.method29546(arg0);
			}
			if ((local76 >> Class354.aClass354_4.anInt4216 * -1416639217 & 0x1) == 1) {
				this.aClass472_13.method29546(arg0);
			}
			if ((local76 >> Class354.aClass354_3.anInt4216 * -1416639217 & 0x1) == 1) {
				this.aFloat102 = arg0.method22504(-570252963);
				this.aFloat104 = arg0.method22504(-1046680913);
			}
			if ((local76 >> Class354.aClass354_6.anInt4216 * -1416639217 & 0x1) == 1) {
				this.aFloat110 = arg0.method22504(-1384550254);
				this.aFloat108 = arg0.method22504(-1250770883);
			}
			if ((local76 >> Class354.aClass354_7.anInt4216 * -1416639217 & 0x1) == 1) {
				this.aClass359_2 = Class138_Sub4.method11516(arg0.method22465((short) 16384), -1964954149);
			}
			if ((local76 >> Class354.aClass354_10.anInt4216 * -1416639217 & 0x1) == 1) {
				this.anInt1011 = arg0.method22478((short) 26249) * -1665495249;
				arg0.method22465((short) 16384);
			}
			@Pc(224) int local224;
			if ((local76 >> Class354.aClass354_8.anInt4216 * -1416639217 & 0x1) == 1) {
				local224 = arg0.method22465((short) 16384);
				this.aBoolean181 = (local224 & 0x1) == 1;
				this.aBoolean182 = (local224 & 0x2) == 2;
			}
			if ((local76 >> Class354.aClass354_9.anInt4216 * -1416639217 & 0x1) == 1) {
				local224 = arg0.method22465((short) 16384);
				for (@Pc(260) int local260 = 0; local260 < local224; local260++) {
					@Pc(267) int local267 = arg0.method22465((short) 16384);
					@Pc(271) int local271 = arg0.method22465((short) 16384);
					if (local267 == 0) {
						this.method8995(local271, -1507823127);
					} else {
						@Pc(284) Class335 local284 = Class365.method27901(arg0.method22465((short) 16384), (byte) -95);
						@Pc(286) boolean local286 = true;
						@Pc(290) Iterator local290 = this.aClass16_7.iterator();
						while (local290.hasNext()) {
							@Pc(297) Class93_Sub1_Sub17 local297 = (Class93_Sub1_Sub17) local290.next();
							if (local271 == local297.anInt3208 * 1923037877) {
								local297.method23495(arg0, 2099946550);
								local286 = false;
								break;
							}
						}
						if (local286) {
							this.method8994(Class93_Sub26_Sub14.method21997(local271, local284, arg0, -1586262405), 1901554443);
						}
					}
				}
			}
			if ((local76 >> Class354.aClass354_15.anInt4216 * -1416639217 & 0x1) == 1) {
				this.anInt1014 = arg0.method22472(-1434290800) * -1956959367;
				this.aFloat112 = arg0.method22504(1600440394);
			}
			if ((local76 >> Class354.aClass354_11.anInt4216 * -1416639217 & 0x1) == 1) {
				this.aClass333_2 = Class93_Sub20.method13658(arg0.method22465((short) 16384), (byte) 1);
			}
			if ((local76 >> Class354.aClass354_12.anInt4216 * -1416639217 & 0x1) == 1) {
				this.aClass472_11.method29546(arg0);
				this.aClass472_12.method29546(arg0);
				this.aFloat107 = arg0.method22504(-1475341436);
				this.aFloat98 = arg0.method22504(-955692056);
			}
			if ((local76 >> Class354.aClass354_1.anInt4216 * -1416639217 & 0x1) == 1) {
				arg0.method22504(654556253);
			}
			if ((local76 >> Class354.aClass354_5.anInt4216 * -1416639217 & 0x1) == 1) {
				this.aFloat101 = arg0.method22504(-1092486947);
			}
		}
		if (this.aClass25_2 != null && (local8 >> 5 & 0x1) == 1) {
			this.aClass25_2.method23123(arg0, -42294119);
		}
		if (this.aClass124_2 != null && (local8 >> 6 & 0x1) == 1) {
			this.aClass124_2.method21413(arg0, -2023846741);
		}
		if (arg1 != arg0.anInt3070 * 212851357 - local4) {
			throw new RuntimeException(arg0.anInt3070 * 212851357 - local4 + "," + arg1);
		}
	}

	@OriginalMember(owner = "client!ahc", name = "f", descriptor = "(JII)Ljava/lang/String;", line = 84)
	public static String method9093(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Class337.method27454(arg0);
		@Pc(5) int local5 = Class69.aCalendar1.get(11);
		@Pc(9) int local9 = Class69.aCalendar1.get(12);
		@Pc(13) int local13 = Class69.aCalendar1.get(13);
		return Integer.toString(local5 / 10) + local5 % 10 + ":" + local9 / 10 + local9 % 10 + ":" + local13 / 10 + local13 % 10;
	}

	@OriginalMember(owner = "client!ahc", name = "mc", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;B)V", line = 7293)
	static final void method9094(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) byte arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt5888 -= 957530791) * 587908375];
		@Pc(18) int[] local18 = Class532.method30597(local13, arg2, 1518522314);
		if (local18 != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray30 = Class499.method30149(local13, arg2, -1381929761);
		arg0.anIntArray378 = local18;
		arg0.aBoolean680 = true;
	}

	@OriginalMember(owner = "client!ahc", name = "bbp", descriptor = "(Lclient!yf;S)V", line = 14376)
	static final void method9095(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
	}
}
