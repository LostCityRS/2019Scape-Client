package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!adi")
public final class Class81 implements Interface11, Interface5 {

	@OriginalMember(owner = "client!adi", name = "r", descriptor = "I")
	static int anInt256;

	@OriginalMember(owner = "client!adi", name = "t", descriptor = "[[Lclient!qy;")
	public Class521[][] aClass521ArrayArray2;

	@OriginalMember(owner = "client!adi", name = "f", descriptor = "[[Ljava/lang/Object;")
	public Object[][] anObjectArrayArray2;

	@OriginalMember(owner = "client!adi", name = "hz", descriptor = "(Lclient!ahb;S)V")
	static void method1552(@OriginalArg(0) Class120_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) short arg1) {
		if (arg0.anIntArray239 == null && arg0.anIntArray235 == null) {
			return;
		}
		@Pc(9) boolean local9 = true;
		@Pc(13) Class626 local13 = client.aClass539_1.method30893((byte) -113);
		for (@Pc(15) int local15 = 0; local15 < arg0.anIntArray239.length; local15++) {
			@Pc(22) int local22 = -1;
			if (arg0.anIntArray239 != null) {
				local22 = arg0.anIntArray239[local15];
			}
			if (local22 != -1) {
				local9 = false;
				@Pc(46) boolean local46 = false;
				@Pc(48) boolean local48 = false;
				@Pc(52) Class463 local52 = arg0.method24552().aClass463_61;
				@Pc(61) int local61;
				@Pc(84) int local84;
				@Pc(99) int local99;
				if ((local22 & -1073741824) == -1073741824) {
					local61 = local22 & 0xFFFFFFF;
					@Pc(65) int local65 = local61 >> 14;
					@Pc(69) int local69 = local61 & 0x3FFF;
					local84 = (int) local52.aFloat297 - ((local65 - local13.anInt5540 * -390642507) * 512 + 256);
					local99 = (int) local52.aFloat296 - ((local69 - local13.anInt5537 * -894305615) * 512 + 256);
				} else {
					@Pc(119) Class463 local119;
					if ((local22 & 0x8000) == 0) {
						@Pc(150) Class80_Sub19 local150 = (Class80_Sub19) client.aClass24_18.method560((long) local22);
						if (local150 == null) {
							arg0.method18958(local15, -1, (byte) 73);
							continue;
						}
						@Pc(156) Class120_Sub1_Sub1_Sub1_Sub1 local156 = (Class120_Sub1_Sub1_Sub1_Sub1) local150.anObject5;
						local119 = local156.method24552().aClass463_61;
						local84 = (int) local52.aFloat297 - (int) local119.aFloat297;
						local99 = (int) local52.aFloat296 - (int) local119.aFloat296;
					} else {
						local61 = local22 & 0x7FFF;
						@Pc(113) Class120_Sub1_Sub1_Sub1_Sub2 local113 = client.aClass120_Sub1_Sub1_Sub1_Sub2Array1[local61];
						if (local113 == null) {
							arg0.method18958(local15, -1, (byte) 65);
							continue;
						}
						local119 = local113.method24552().aClass463_61;
						local84 = (int) local52.aFloat297 - (int) local119.aFloat297;
						local99 = (int) local52.aFloat296 - (int) local119.aFloat296;
					}
				}
				if (local84 != 0 || local99 != 0) {
					arg0.method18958(local15, (int) (Math.atan2((double) local84, (double) local99) * 2607.5945876176133D) & 0x3FFF, (byte) 6);
				}
			} else if (!arg0.method18958(local15, -1, (byte) 48)) {
				local9 = false;
			}
		}
		if (local9) {
			arg0.anIntArray239 = null;
			arg0.anIntArray235 = null;
		}
	}

	@OriginalMember(owner = "client!adi", name = "<init>", descriptor = "()V")
	Class81() {
	}

	@OriginalMember(owner = "client!adi", name = "m", descriptor = "(Lclient!ald;I)V")
	void method1547(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 1) {
			return;
		}
		@Pc(6) int local6 = arg0.method23362(-1765580807);
		if (this.aClass521ArrayArray2 == null) {
			this.aClass521ArrayArray2 = new Class521[local6][];
		}
		for (@Pc(18) int local18 = arg0.method23362(892460664); local18 != 255; local18 = arg0.method23362(-1719920637)) {
			@Pc(25) int local25 = local18 & 0x7F;
			@Pc(33) boolean local33 = (local18 & 0x80) != 0;
			@Pc(38) Class521[] local38 = new Class521[arg0.method23362(-2023041115)];
			for (@Pc(40) int local40 = 0; local40 < local38.length; local40++) {
				local38[local40] = (Class521) Class80_Sub39.method15030(Class521.method30628(1915096332), arg0.method23195(2093322626), -2099186978);
			}
			this.aClass521ArrayArray2[local25] = local38;
			if (local33) {
				if (this.anObjectArrayArray2 == null) {
					this.anObjectArrayArray2 = new Object[this.aClass521ArrayArray2.length][];
				}
				this.anObjectArrayArray2[local25] = Class328.method27723(arg0, local38, -2037123270);
			}
		}
	}

	@OriginalMember(owner = "client!adi", name = "t", descriptor = "(Lclient!ald;I)V")
	@Override
	public void method37006(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.method23362(645096567);
			if (local3 == 0) {
				return;
			}
			this.method1551(arg0, local3, -1748581494);
		}
	}

	@OriginalMember(owner = "client!adi", name = "f", descriptor = "(B)V")
	@Override
	public void method37007(@OriginalArg(0) byte arg0) {
	}

	@OriginalMember(owner = "client!adi", name = "g", descriptor = "(IS)V")
	@Override
	public void method37014(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1) {
	}

	@OriginalMember(owner = "client!adi", name = "e", descriptor = "()V")
	@Override
	public void method37008() {
	}

	@OriginalMember(owner = "client!adi", name = "u", descriptor = "(Lclient!ald;)V")
	@Override
	public void method37009(@OriginalArg(0) Class80_Sub36 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method23362(-1224443726);
			if (local3 == 0) {
				return;
			}
			this.method1551(arg0, local3, 1041894451);
		}
	}

	@OriginalMember(owner = "client!adi", name = "o", descriptor = "(I)V")
	@Override
	public void method37010(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!adi", name = "j", descriptor = "(I)V")
	@Override
	public void method37012(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!adi", name = "a", descriptor = "(I)V")
	@Override
	public void method37013(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!adi", name = "s", descriptor = "(I)V")
	@Override
	public void method37011(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!adi", name = "x", descriptor = "(Lclient!ald;I)V")
	void method1548(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 1) {
			return;
		}
		@Pc(6) int local6 = arg0.method23362(-284096105);
		if (this.aClass521ArrayArray2 == null) {
			this.aClass521ArrayArray2 = new Class521[local6][];
		}
		for (@Pc(18) int local18 = arg0.method23362(398061983); local18 != 255; local18 = arg0.method23362(-142090642)) {
			@Pc(25) int local25 = local18 & 0x7F;
			@Pc(33) boolean local33 = (local18 & 0x80) != 0;
			@Pc(38) Class521[] local38 = new Class521[arg0.method23362(-855127752)];
			for (@Pc(40) int local40 = 0; local40 < local38.length; local40++) {
				local38[local40] = (Class521) Class80_Sub39.method15030(Class521.method30628(1923170807), arg0.method23195(1517040266), -1544222803);
			}
			this.aClass521ArrayArray2[local25] = local38;
			if (local33) {
				if (this.anObjectArrayArray2 == null) {
					this.anObjectArrayArray2 = new Object[this.aClass521ArrayArray2.length][];
				}
				this.anObjectArrayArray2[local25] = Class328.method27723(arg0, local38, -2107956776);
			}
		}
	}

	@OriginalMember(owner = "client!adi", name = "i", descriptor = "(Lclient!ald;I)V")
	void method1549(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 1) {
			return;
		}
		@Pc(6) int local6 = arg0.method23362(-1968272759);
		if (this.aClass521ArrayArray2 == null) {
			this.aClass521ArrayArray2 = new Class521[local6][];
		}
		for (@Pc(18) int local18 = arg0.method23362(-819800621); local18 != 255; local18 = arg0.method23362(-2117115153)) {
			@Pc(25) int local25 = local18 & 0x7F;
			@Pc(33) boolean local33 = (local18 & 0x80) != 0;
			@Pc(38) Class521[] local38 = new Class521[arg0.method23362(1041440368)];
			for (@Pc(40) int local40 = 0; local40 < local38.length; local40++) {
				local38[local40] = (Class521) Class80_Sub39.method15030(Class521.method30628(1298247514), arg0.method23195(1873832349), -1187844917);
			}
			this.aClass521ArrayArray2[local25] = local38;
			if (local33) {
				if (this.anObjectArrayArray2 == null) {
					this.anObjectArrayArray2 = new Object[this.aClass521ArrayArray2.length][];
				}
				this.anObjectArrayArray2[local25] = Class328.method27723(arg0, local38, -2060310624);
			}
		}
	}

	@OriginalMember(owner = "client!adi", name = "k", descriptor = "(Lclient!ald;I)V")
	void method1550(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 1) {
			return;
		}
		@Pc(6) int local6 = arg0.method23362(-637663119);
		if (this.aClass521ArrayArray2 == null) {
			this.aClass521ArrayArray2 = new Class521[local6][];
		}
		for (@Pc(18) int local18 = arg0.method23362(935821204); local18 != 255; local18 = arg0.method23362(-1099518157)) {
			@Pc(25) int local25 = local18 & 0x7F;
			@Pc(33) boolean local33 = (local18 & 0x80) != 0;
			@Pc(38) Class521[] local38 = new Class521[arg0.method23362(-1373721317)];
			for (@Pc(40) int local40 = 0; local40 < local38.length; local40++) {
				local38[local40] = (Class521) Class80_Sub39.method15030(Class521.method30628(1440513376), arg0.method23195(1394237077), -1345364402);
			}
			this.aClass521ArrayArray2[local25] = local38;
			if (local33) {
				if (this.anObjectArrayArray2 == null) {
					this.anObjectArrayArray2 = new Object[this.aClass521ArrayArray2.length][];
				}
				this.anObjectArrayArray2[local25] = Class328.method27723(arg0, local38, -2145194057);
			}
		}
	}

	@OriginalMember(owner = "client!adi", name = "l", descriptor = "(Lclient!ald;II)V")
	void method1551(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 != 1) {
			return;
		}
		@Pc(6) int local6 = arg0.method23362(-197517003);
		if (this.aClass521ArrayArray2 == null) {
			this.aClass521ArrayArray2 = new Class521[local6][];
		}
		for (@Pc(18) int local18 = arg0.method23362(709284004); local18 != 255; local18 = arg0.method23362(-1458235443)) {
			@Pc(25) int local25 = local18 & 0x7F;
			@Pc(33) boolean local33 = (local18 & 0x80) != 0;
			@Pc(38) Class521[] local38 = new Class521[arg0.method23362(791512065)];
			for (@Pc(40) int local40 = 0; local40 < local38.length; local40++) {
				local38[local40] = (Class521) Class80_Sub39.method15030(Class521.method30628(1760484879), arg0.method23195(1398856077), -1218468485);
			}
			this.aClass521ArrayArray2[local25] = local38;
			if (local33) {
				if (this.anObjectArrayArray2 == null) {
					this.anObjectArrayArray2 = new Object[this.aClass521ArrayArray2.length][];
				}
				this.anObjectArrayArray2[local25] = Class328.method27723(arg0, local38, -2099054677);
			}
		}
	}
}
