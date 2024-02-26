package com.jagex;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ahd")
public final class Class121_Sub1 extends Class121 {

	@OriginalMember(owner = "client!ahd", name = "af", descriptor = "I")
	int anInt1118 = 0;

	@OriginalMember(owner = "client!ahd", name = "nd", descriptor = "(Lclient!yp;I)V")
	static void method9725(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class565.method31480(local11, local14, arg0, 432242286);
	}

	@OriginalMember(owner = "client!ahd", name = "ax", descriptor = "(II)V")
	public static void method9726(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(21, (long) arg0);
		local4.method22078(2145117915);
	}

	@OriginalMember(owner = "client!ahd", name = "<init>", descriptor = "(Lclient!jj;)V")
	public Class121_Sub1(@OriginalArg(0) Interface29 arg0) {
		super(Class342.aClass342_4, arg0);
	}

	@OriginalMember(owner = "client!ahd", name = "en", descriptor = "(Lclient!ald;I)V")
	public void method9721(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0.pos * -1380987821;
		@Pc(8) int local8 = arg0.g1();
		this.method9576(RuntimeException_Sub2.method23508(local8 & 0x1, (byte) 9), 369293023);
		if ((local8 & 0x8) != 0) {
			@Pc(27) Class347 local27 = Class169.method21691(arg0.g1(), (byte) 45);
			if (this.aClass347_2 != local27) {
				try {
					this.method9577(local27, true, -198044824);
				} catch (@Pc(39) Exception_Sub3 local39) {
					local39.printStackTrace();
				}
			}
		}
		if ((local8 & 0x10) != 0) {
			@Pc(52) Class340 local52 = Class567.method31516(arg0.g1(), (byte) 1);
			if (this.aClass340_2 != local52) {
				try {
					this.method9647(local52, true, 234665263);
				} catch (@Pc(64) Exception_Sub3 local64) {
					local64.printStackTrace();
				}
			}
		}
		if ((local8 >> 7 & 0x1) == 1) {
			@Pc(77) int local77 = arg0.g2();
			if ((local77 >> Class333.aClass333_10.anInt4195 * 1426057729 & 0x1) == 1) {
				this.aClass463_30.method29476(arg0);
			}
			if ((local77 >> Class333.aClass333_2.anInt4195 * 1426057729 & 0x1) == 1) {
				this.aClass463_31.method29476(arg0);
			}
			if ((local77 >> Class333.aClass333_3.anInt4195 * 1426057729 & 0x1) == 1) {
				this.aClass463_29.method29476(arg0);
			}
			if ((local77 >> Class333.aClass333_4.anInt4195 * 1426057729 & 0x1) == 1) {
				this.aClass463_32.method29476(arg0);
			}
			if ((local77 >> Class333.aClass333_14.anInt4195 * 1426057729 & 0x1) == 1) {
				this.aFloat113 = arg0.gFloat();
				this.aFloat110 = arg0.gFloat();
			}
			if ((local77 >> Class333.aClass333_6.anInt4195 * 1426057729 & 0x1) == 1) {
				this.aFloat111 = arg0.gFloat();
				this.aFloat112 = arg0.gFloat();
			}
			if ((local77 >> Class333.aClass333_8.anInt4195 * 1426057729 & 0x1) == 1) {
				this.aClass368_2 = Class220.method25903(arg0.g1(), -2138464744);
			}
			if ((local77 >> Class333.aClass333_12.anInt4195 * 1426057729 & 0x1) == 1) {
				this.anInt1114 = arg0.g3() * -1615738847;
				arg0.g1();
			}
			@Pc(225) int local225;
			if ((local77 >> Class333.aClass333_9.anInt4195 * 1426057729 & 0x1) == 1) {
				local225 = arg0.g1();
				this.aBoolean213 = (local225 & 0x1) == 1;
				this.aBoolean214 = (local225 & 0x2) == 2;
			}
			if ((local77 >> Class333.aClass333_5.anInt4195 * 1426057729 & 0x1) == 1) {
				local225 = arg0.g1();
				for (@Pc(261) int local261 = 0; local261 < local225; local261++) {
					@Pc(268) int local268 = arg0.g1();
					@Pc(272) int local272 = arg0.g1();
					if (local268 == 0) {
						this.method9639(local272, 2092162482);
					} else {
						@Pc(286) Class344 local286 = Class200.method24930(arg0.g1(), (byte) 0);
						@Pc(288) boolean local288 = true;
						@Pc(292) Iterator local292 = this.aClass24_7.iterator();
						while (local292.hasNext()) {
							@Pc(299) Class80_Sub1_Sub13 local299 = (Class80_Sub1_Sub13) local292.next();
							if (local299.anInt3226 * 393755111 == local272) {
								local299.method23749(arg0, -1524728118);
								local288 = false;
								break;
							}
						}
						if (local288) {
							this.method9596(Class120_Sub1_Sub1_Sub1_Sub2.method19081(local272, local286, arg0, 1896589581), (byte) 1);
						}
					}
				}
			}
			if ((local77 >> Class333.aClass333_11.anInt4195 * 1426057729 & 0x1) == 1) {
				this.anInt1117 = arg0.g2() * 92314831;
				this.aFloat109 = arg0.gFloat();
			}
			if ((local77 >> Class333.aClass333_7.anInt4195 * 1426057729 & 0x1) == 1) {
				this.aClass354_2 = Class389.method28648(arg0.g1(), 2136729899);
			}
			if ((local77 >> Class333.aClass333_13.anInt4195 * 1426057729 & 0x1) == 1) {
				this.aClass463_33.method29476(arg0);
				this.aClass463_34.method29476(arg0);
				this.aFloat108 = arg0.gFloat();
				this.aFloat102 = arg0.gFloat();
			}
			if ((local77 >> Class333.aClass333_1.anInt4195 * 1426057729 & 0x1) == 1) {
				arg0.gFloat();
			}
			if ((local77 >> Class333.aClass333_15.anInt4195 * 1426057729 & 0x1) == 1) {
				this.aFloat101 = arg0.gFloat();
			}
		}
		if (this.aClass20_2 != null && (local8 >> 5 & 0x1) == 1) {
			this.aClass20_2.method23094(arg0, -1876949520);
		}
		if (this.aClass123_2 != null && (local8 >> 6 & 0x1) == 1) {
			this.aClass123_2.method20506(arg0, -363306965);
		}
		if (arg1 != arg0.pos * -1380987821 - local4) {
			throw new RuntimeException(arg0.pos * -1380987821 - local4 + "," + arg1);
		}
	}

	@OriginalMember(owner = "client!ahd", name = "eu", descriptor = "(I)I")
	public int method9722(@OriginalArg(0) int arg0) {
		this.anInt1118 += 107182511;
		if (this.anInt1118 * -384991921 == 126) {
			this.anInt1118 = 0;
		}
		return this.anInt1118 * -384991921;
	}

	@OriginalMember(owner = "client!ahd", name = "es", descriptor = "(Lclient!ald;II)V")
	public void method9723(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = arg0.pos * -1380987821;
		@Pc(8) int local8 = arg0.g1();
		this.method9576(RuntimeException_Sub2.method23508(local8 & 0x1, (byte) 9), -1256297138);
		if ((local8 & 0x8) != 0) {
			@Pc(27) Class347 local27 = Class169.method21691(arg0.g1(), (byte) 24);
			if (this.aClass347_2 != local27) {
				try {
					this.method9577(local27, true, 1047709703);
				} catch (@Pc(39) Exception_Sub3 local39) {
					local39.printStackTrace();
				}
			}
		}
		if ((local8 & 0x10) != 0) {
			@Pc(52) Class340 local52 = Class567.method31516(arg0.g1(), (byte) 1);
			if (this.aClass340_2 != local52) {
				try {
					this.method9647(local52, true, 278838595);
				} catch (@Pc(64) Exception_Sub3 local64) {
					local64.printStackTrace();
				}
			}
		}
		if ((local8 >> 7 & 0x1) == 1) {
			@Pc(77) int local77 = arg0.g2();
			if ((local77 >> Class333.aClass333_10.anInt4195 * 1426057729 & 0x1) == 1) {
				this.aClass463_30.method29476(arg0);
			}
			if ((local77 >> Class333.aClass333_2.anInt4195 * 1426057729 & 0x1) == 1) {
				this.aClass463_31.method29476(arg0);
			}
			if ((local77 >> Class333.aClass333_3.anInt4195 * 1426057729 & 0x1) == 1) {
				this.aClass463_29.method29476(arg0);
			}
			if ((local77 >> Class333.aClass333_4.anInt4195 * 1426057729 & 0x1) == 1) {
				this.aClass463_32.method29476(arg0);
			}
			if ((local77 >> Class333.aClass333_14.anInt4195 * 1426057729 & 0x1) == 1) {
				this.aFloat113 = arg0.gFloat();
				this.aFloat110 = arg0.gFloat();
			}
			if ((local77 >> Class333.aClass333_6.anInt4195 * 1426057729 & 0x1) == 1) {
				this.aFloat111 = arg0.gFloat();
				this.aFloat112 = arg0.gFloat();
			}
			if ((local77 >> Class333.aClass333_8.anInt4195 * 1426057729 & 0x1) == 1) {
				this.aClass368_2 = Class220.method25903(arg0.g1(), -2138464744);
			}
			if ((local77 >> Class333.aClass333_12.anInt4195 * 1426057729 & 0x1) == 1) {
				this.anInt1114 = arg0.g3() * -1615738847;
				arg0.g1();
			}
			@Pc(225) int local225;
			if ((local77 >> Class333.aClass333_9.anInt4195 * 1426057729 & 0x1) == 1) {
				local225 = arg0.g1();
				this.aBoolean213 = (local225 & 0x1) == 1;
				this.aBoolean214 = (local225 & 0x2) == 2;
			}
			if ((local77 >> Class333.aClass333_5.anInt4195 * 1426057729 & 0x1) == 1) {
				local225 = arg0.g1();
				for (@Pc(261) int local261 = 0; local261 < local225; local261++) {
					@Pc(268) int local268 = arg0.g1();
					@Pc(272) int local272 = arg0.g1();
					if (local268 == 0) {
						this.method9639(local272, 1960812991);
					} else {
						@Pc(286) Class344 local286 = Class200.method24930(arg0.g1(), (byte) 0);
						@Pc(288) boolean local288 = true;
						@Pc(292) Iterator local292 = this.aClass24_7.iterator();
						while (local292.hasNext()) {
							@Pc(299) Class80_Sub1_Sub13 local299 = (Class80_Sub1_Sub13) local292.next();
							if (local299.anInt3226 * 393755111 == local272) {
								local299.method23749(arg0, -942986636);
								local288 = false;
								break;
							}
						}
						if (local288) {
							this.method9596(Class120_Sub1_Sub1_Sub1_Sub2.method19081(local272, local286, arg0, 1896589581), (byte) 1);
						}
					}
				}
			}
			if ((local77 >> Class333.aClass333_11.anInt4195 * 1426057729 & 0x1) == 1) {
				this.anInt1117 = arg0.g2() * 92314831;
				this.aFloat109 = arg0.gFloat();
			}
			if ((local77 >> Class333.aClass333_7.anInt4195 * 1426057729 & 0x1) == 1) {
				this.aClass354_2 = Class389.method28648(arg0.g1(), 2136729899);
			}
			if ((local77 >> Class333.aClass333_13.anInt4195 * 1426057729 & 0x1) == 1) {
				this.aClass463_33.method29476(arg0);
				this.aClass463_34.method29476(arg0);
				this.aFloat108 = arg0.gFloat();
				this.aFloat102 = arg0.gFloat();
			}
			if ((local77 >> Class333.aClass333_1.anInt4195 * 1426057729 & 0x1) == 1) {
				arg0.gFloat();
			}
			if ((local77 >> Class333.aClass333_15.anInt4195 * 1426057729 & 0x1) == 1) {
				this.aFloat101 = arg0.gFloat();
			}
		}
		if (this.aClass20_2 != null && (local8 >> 5 & 0x1) == 1) {
			this.aClass20_2.method23094(arg0, -1876949520);
		}
		if (this.aClass123_2 != null && (local8 >> 6 & 0x1) == 1) {
			this.aClass123_2.method20506(arg0, -363306965);
		}
		if (arg1 != arg0.pos * -1380987821 - local4) {
			throw new RuntimeException(arg0.pos * -1380987821 - local4 + "," + arg1);
		}
	}

	@OriginalMember(owner = "client!ahd", name = "er", descriptor = "()I")
	public int method9724() {
		this.anInt1118 += 107182511;
		if (this.anInt1118 * -384991921 == 126) {
			this.anInt1118 = 0;
		}
		return this.anInt1118 * -384991921;
	}
}
