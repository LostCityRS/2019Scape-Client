package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ix")
public final class Class352 implements Interface11 {

	@OriginalMember(owner = "client!ix", name = "fr", descriptor = "Lclient!pf;")
	public static Class480 aClass480_97;

	@OriginalMember(owner = "client!ix", name = "kh", descriptor = "I")
	public static int anInt4261;

	@OriginalMember(owner = "client!ix", name = "f", descriptor = "Ljava/lang/String;")
	public String aString193;

	@OriginalMember(owner = "client!ix", name = "e", descriptor = "Ljava/lang/String;")
	public String aString194;

	@OriginalMember(owner = "client!ix", name = "q", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray26;

	@OriginalMember(owner = "client!ix", name = "l", descriptor = "[[I")
	int[][] anIntArrayArray55;

	@OriginalMember(owner = "client!ix", name = "k", descriptor = "I")
	public int anInt4258;

	@OriginalMember(owner = "client!ix", name = "j", descriptor = "[I")
	int[] anIntArray424;

	@OriginalMember(owner = "client!ix", name = "a", descriptor = "[I")
	public int[] anIntArray425;

	@OriginalMember(owner = "client!ix", name = "p", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray27;

	@OriginalMember(owner = "client!ix", name = "u", descriptor = "[[I")
	int[][] anIntArrayArray56;

	@OriginalMember(owner = "client!ix", name = "o", descriptor = "I")
	public int anInt4260;

	@OriginalMember(owner = "client!ix", name = "w", descriptor = "[I")
	int[] anIntArray426;

	@OriginalMember(owner = "client!ix", name = "r", descriptor = "[I")
	int[] anIntArray427;

	@OriginalMember(owner = "client!ix", name = "h", descriptor = "[I")
	public int[] anIntArray428;

	@OriginalMember(owner = "client!ix", name = "d", descriptor = "[I")
	int[] anIntArray429;

	@OriginalMember(owner = "client!ix", name = "z", descriptor = "[I")
	int[] anIntArray430;

	@OriginalMember(owner = "client!ix", name = "x", descriptor = "[I")
	public int[] anIntArray431;

	@OriginalMember(owner = "client!ix", name = "v", descriptor = "Lclient!aax;")
	Class24 aClass24_32;

	@OriginalMember(owner = "client!ix", name = "s", descriptor = "[[I")
	public int[][] anIntArrayArray57;

	@OriginalMember(owner = "client!ix", name = "g", descriptor = "I")
	public int anInt4257 = 0;

	@OriginalMember(owner = "client!ix", name = "i", descriptor = "I")
	public int anInt4256 = 0;

	@OriginalMember(owner = "client!ix", name = "m", descriptor = "Z")
	public boolean aBoolean834 = false;

	@OriginalMember(owner = "client!ix", name = "y", descriptor = "I")
	public int anInt4259 = 1534964091;

	@OriginalMember(owner = "client!ix", name = "t", descriptor = "Lclient!an;")
	Interface12 anInterface12_12;

	@OriginalMember(owner = "client!ix", name = "ak", descriptor = "(Lclient!ey;Lclient!an;)I")
	static int method28061(@OriginalArg(0) Interface24 arg0, @OriginalArg(1) Interface12 arg1) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg1.method18051(-455541225); local3++) {
			@Pc(14) Class352 local14 = (Class352) arg1.method18054(local3, -1634040677);
			if (local14.method28032(arg0, 21544693)) {
				local1 += local14.anInt4260 * 1673510067;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!ix", name = "f", descriptor = "([BB)Z")
	public static boolean method28062(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte arg1) {
		@Pc(4) Class80_Sub36 local4 = new Class80_Sub36(arg0);
		@Pc(8) int local8 = local4.method23362(27951433);
		if (local8 != 2) {
			return false;
		}
		@Pc(22) boolean local22 = local4.method23362(-533841618) == 1;
		if (local22) {
			Class499.method30401(local4, (byte) -25);
		}
		Class266.method26655(local4, (byte) -121);
		return true;
	}

	@OriginalMember(owner = "client!ix", name = "el", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;B)V")
	static void method28063(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) byte arg3) {
		arg0.aBoolean811 = arg2.anIntArray525[(arg2.anInt5778 -= 2036747717) * 1896589581] == 1;
		Class296.method26998(arg0, -614492668);
	}

	@OriginalMember(owner = "client!ix", name = "mo", descriptor = "(Ljava/lang/String;B)V")
	public static void method28064(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		if (arg0.equals("")) {
			return;
		}
		@Pc(7) Class75 local7 = Class52.method1074(16777215);
		@Pc(13) Class80_Sub31 local13 = Class623.method32440(Class443.aClass443_94, local7.aClass22_1, -191270971);
		local13.aClass80_Sub36_Sub1_2.method23154(Class350.method28013(arg0, (short) 16383), 1275868335);
		local13.aClass80_Sub36_Sub1_2.method23165(arg0, 1936929756);
		local7.method1325(local13, (byte) -88);
	}

	@OriginalMember(owner = "client!ix", name = "<init>", descriptor = "(ILclient!an;)V")
	Class352(@OriginalArg(0) int arg0, @OriginalArg(1) Interface12 arg1) {
		this.anInterface12_12 = arg1;
	}

	@OriginalMember(owner = "client!ix", name = "w", descriptor = "(Lclient!ey;II)Z")
	public boolean method28027(@OriginalArg(0) Interface24 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anIntArray428 == null || arg1 < 0 || arg1 >= this.anIntArray428.length) {
			return false;
		} else {
			@Pc(20) Class374 local20 = ((Interface21) arg0).method28381(this.anIntArray428[arg1], -1482607674);
			@Pc(25) int local25 = arg0.method36978(local20, (byte) -109);
			return local25 >= this.anIntArray429[arg1] && local25 <= this.anIntArray430[arg1];
		}
	}

	@OriginalMember(owner = "client!ix", name = "t", descriptor = "(Lclient!ald;I)V")
	@Override
	public void method37006(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.method23362(74932867);
			if (local3 == 0) {
				return;
			}
			this.method28041(arg0, local3, -336452240);
		}
	}

	@OriginalMember(owner = "client!ix", name = "b", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public String method28028(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (this.aClass24_32 == null) {
			return arg1;
		} else {
			@Pc(12) Class80_Sub19 local12 = (Class80_Sub19) this.aClass24_32.method560((long) arg0);
			return local12 == null ? arg1 : (String) local12.anObject5;
		}
	}

	@OriginalMember(owner = "client!ix", name = "f", descriptor = "(B)V")
	@Override
	public void method37007(@OriginalArg(0) byte arg0) {
		if (this.aString194 == null) {
			this.aString194 = this.aString193;
		}
	}

	@OriginalMember(owner = "client!ix", name = "g", descriptor = "(III)I")
	public int method28029(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass24_32 == null) {
			return arg1;
		} else {
			@Pc(11) Class80_Sub20 local11 = (Class80_Sub20) this.aClass24_32.method560((long) arg0);
			return local11 == null ? arg1 : local11.anInt1588 * 701000167;
		}
	}

	@OriginalMember(owner = "client!ix", name = "p", descriptor = "(Lclient!ald;I)V")
	void method28030(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aString193 = arg0.method23186((byte) 12);
		} else if (arg1 == 2) {
			this.aString194 = arg0.method23186((byte) 12);
		} else {
			@Pc(24) int local24;
			@Pc(31) int local31;
			if (arg1 == 3) {
				local24 = arg0.method23362(-1332962703);
				this.anIntArrayArray56 = new int[local24][3];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArrayArray56[local31][0] = arg0.method23178((byte) -59);
					this.anIntArrayArray56[local31][1] = arg0.method23182(-1097396470);
					this.anIntArrayArray56[local31][2] = arg0.method23182(803591713);
				}
			} else if (arg1 == 4) {
				local24 = arg0.method23362(-1346333046);
				this.anIntArrayArray55 = new int[local24][3];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArrayArray55[local31][0] = arg0.method23178((byte) -123);
					this.anIntArrayArray55[local31][1] = arg0.method23182(-1541072868);
					this.anIntArrayArray55[local31][2] = arg0.method23182(1364879882);
				}
			} else if (arg1 == 5) {
				arg0.method23178((byte) -40);
			} else if (arg1 == 6) {
				this.anInt4257 = arg0.method23362(505035011) * 1455628633;
			} else if (arg1 == 7) {
				this.anInt4256 = arg0.method23362(981142714) * -1936987933;
			} else if (arg1 == 8) {
				this.aBoolean834 = true;
			} else if (arg1 == 9) {
				this.anInt4260 = arg0.method23362(-699835481) * 2069189243;
			} else if (arg1 == 10) {
				local24 = arg0.method23362(-1359026285);
				this.anIntArray424 = new int[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray424[local31] = arg0.method23182(-1450365678);
				}
			} else if (arg1 == 12) {
				arg0.method23182(1079547162);
			} else if (arg1 == 13) {
				local24 = arg0.method23362(714475951);
				this.anIntArray425 = new int[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray425[local31] = arg0.method23178((byte) -79);
				}
			} else if (arg1 == 14) {
				local24 = arg0.method23362(833264882);
				this.anIntArrayArray57 = new int[local24][2];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArrayArray57[local31][0] = arg0.method23362(-1767987582);
					this.anIntArrayArray57[local31][1] = arg0.method23362(-1648926053);
				}
			} else if (arg1 == 15) {
				this.anInt4258 = arg0.method23178((byte) -48) * 514088645;
			} else if (arg1 == 17) {
				this.anInt4259 = arg0.method23210((byte) 72) * -1534964091;
			} else if (arg1 == 18) {
				local24 = arg0.method23362(442315339);
				this.anIntArray431 = new int[local24];
				this.anIntArray426 = new int[local24];
				this.anIntArray427 = new int[local24];
				this.aStringArray26 = new String[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray431[local31] = arg0.method23182(-29186662);
					this.anIntArray426[local31] = arg0.method23182(-822464063);
					this.anIntArray427[local31] = arg0.method23182(234258970);
					this.aStringArray26[local31] = arg0.method23376((short) 448);
				}
			} else if (arg1 == 19) {
				local24 = arg0.method23362(-599902876);
				this.anIntArray428 = new int[local24];
				this.anIntArray429 = new int[local24];
				this.anIntArray430 = new int[local24];
				this.aStringArray27 = new String[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray428[local31] = arg0.method23182(1964662447);
					this.anIntArray429[local31] = arg0.method23182(1210655228);
					this.anIntArray430[local31] = arg0.method23182(2050516380);
					this.aStringArray27[local31] = arg0.method23376((short) 25197);
				}
			} else if (arg1 == 249) {
				local24 = arg0.method23362(832297053);
				if (this.aClass24_32 == null) {
					local31 = Class700.method37081(local24, (byte) 9);
					this.aClass24_32 = new Class24(local31);
				}
				for (local31 = 0; local31 < local24; local31++) {
					@Pc(432) boolean local432 = arg0.method23362(997954831) == 1;
					@Pc(436) int local436 = arg0.method23180(1710327153);
					@Pc(445) Class80 local445;
					if (local432) {
						local445 = new Class80_Sub19(arg0.method23376((short) 32481));
					} else {
						local445 = new Class80_Sub20(arg0.method23182(-113307904));
					}
					this.aClass24_32.method563(local445, (long) local436);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ix", name = "ag", descriptor = "(Lclient!ey;I)Z")
	public boolean method28031(@OriginalArg(0) Interface24 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray425 == null || arg1 < 0 || arg1 >= this.anIntArray425.length) {
			return false;
		} else {
			return ((Class352) this.anInterface12_12.method18054(this.anIntArray425[arg1], -477051864)).method28032(arg0, -944108431);
		}
	}

	@OriginalMember(owner = "client!ix", name = "o", descriptor = "(Lclient!ey;I)Z")
	public boolean method28032(@OriginalArg(0) Interface24 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4;
		if (this.anIntArrayArray56 != null) {
			for (local4 = 0; local4 < this.anIntArrayArray56.length; local4++) {
				@Pc(21) Class107 local21 = ((Interface21) arg0).method28382(Class143.aClass143_71, this.anIntArrayArray56[local4][0], 535516741);
				if (arg0.method36980(local21, 660947118) >= this.anIntArrayArray56[local4][2]) {
					return true;
				}
			}
		}
		if (this.anIntArrayArray55 != null) {
			for (local4 = 0; local4 < this.anIntArrayArray55.length; local4++) {
				@Pc(58) Class374 local58 = ((Interface21) arg0).method28381(this.anIntArrayArray55[local4][0], -1482607674);
				if (arg0.method36978(local58, (byte) -118) >= this.anIntArrayArray55[local4][2]) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ix", name = "i", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;")
	public String method28033(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		if (this.aClass24_32 == null) {
			return arg1;
		} else {
			@Pc(12) Class80_Sub19 local12 = (Class80_Sub19) this.aClass24_32.method560((long) arg0);
			return local12 == null ? arg1 : (String) local12.anObject5;
		}
	}

	@OriginalMember(owner = "client!ix", name = "a", descriptor = "(Lclient!ey;B)Z")
	public boolean method28034(@OriginalArg(0) Interface24 arg0, @OriginalArg(1) byte arg1) {
		return Class680.method33641(arg0, this.anInterface12_12, 541073104) >= this.anInt4258 * 1518170125;
	}

	@OriginalMember(owner = "client!ix", name = "m", descriptor = "(Lclient!ey;S)Z")
	public boolean method28035(@OriginalArg(0) Interface24 arg0, @OriginalArg(1) short arg1) {
		@Pc(5) int local5;
		if (this.anIntArrayArray56 != null) {
			for (local5 = 0; local5 < this.anIntArrayArray56.length; local5++) {
				@Pc(22) Class107 local22 = ((Interface21) arg0).method28382(Class143.aClass143_71, this.anIntArrayArray56[local5][0], 1990750572);
				if (arg0.method36980(local22, 1139629023) >= this.anIntArrayArray56[local5][1]) {
					return true;
				}
			}
		}
		if (this.anIntArrayArray55 != null) {
			for (local5 = 0; local5 < this.anIntArrayArray55.length; local5++) {
				@Pc(59) Class374 local59 = ((Interface21) arg0).method28381(this.anIntArrayArray55[local5][0], -1482607674);
				if (arg0.method36978(local59, (byte) -23) >= this.anIntArrayArray55[local5][1]) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ix", name = "k", descriptor = "(Lclient!ey;II)Z")
	public boolean method28036(@OriginalArg(0) Interface24 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anIntArray425 == null || arg1 < 0 || arg1 >= this.anIntArray425.length) {
			return false;
		} else {
			return ((Class352) this.anInterface12_12.method18054(this.anIntArray425[arg1], 1137489749)).method28032(arg0, -1919183258);
		}
	}

	@OriginalMember(owner = "client!ix", name = "x", descriptor = "(Lclient!ey;II)Z")
	public boolean method28037(@OriginalArg(0) Interface24 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anIntArray431 == null || arg1 < 0 || arg1 >= this.anIntArray431.length) {
			return false;
		} else {
			@Pc(21) Class107 local21 = ((Interface21) arg0).method28382(Class143.aClass143_71, this.anIntArray431[arg1], 1612109309);
			@Pc(26) int local26 = arg0.method36980(local21, -1808446580);
			return local26 >= this.anIntArray426[arg1] && local26 <= this.anIntArray427[arg1];
		}
	}

	@OriginalMember(owner = "client!ix", name = "h", descriptor = "(Lclient!ald;I)V")
	void method28038(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aString193 = arg0.method23186((byte) 12);
		} else if (arg1 == 2) {
			this.aString194 = arg0.method23186((byte) 12);
		} else {
			@Pc(24) int local24;
			@Pc(31) int local31;
			if (arg1 == 3) {
				local24 = arg0.method23362(-1451893578);
				this.anIntArrayArray56 = new int[local24][3];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArrayArray56[local31][0] = arg0.method23178((byte) -17);
					this.anIntArrayArray56[local31][1] = arg0.method23182(789583521);
					this.anIntArrayArray56[local31][2] = arg0.method23182(-349947587);
				}
			} else if (arg1 == 4) {
				local24 = arg0.method23362(45177686);
				this.anIntArrayArray55 = new int[local24][3];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArrayArray55[local31][0] = arg0.method23178((byte) -26);
					this.anIntArrayArray55[local31][1] = arg0.method23182(-1488180792);
					this.anIntArrayArray55[local31][2] = arg0.method23182(-1358273547);
				}
			} else if (arg1 == 5) {
				arg0.method23178((byte) -65);
			} else if (arg1 == 6) {
				this.anInt4257 = arg0.method23362(-40467577) * 1455628633;
			} else if (arg1 == 7) {
				this.anInt4256 = arg0.method23362(-1629073677) * -1936987933;
			} else if (arg1 == 8) {
				this.aBoolean834 = true;
			} else if (arg1 == 9) {
				this.anInt4260 = arg0.method23362(-423701756) * 2069189243;
			} else if (arg1 == 10) {
				local24 = arg0.method23362(652120921);
				this.anIntArray424 = new int[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray424[local31] = arg0.method23182(974216463);
				}
			} else if (arg1 == 12) {
				arg0.method23182(1259266608);
			} else if (arg1 == 13) {
				local24 = arg0.method23362(662962983);
				this.anIntArray425 = new int[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray425[local31] = arg0.method23178((byte) -8);
				}
			} else if (arg1 == 14) {
				local24 = arg0.method23362(-444509302);
				this.anIntArrayArray57 = new int[local24][2];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArrayArray57[local31][0] = arg0.method23362(-791244266);
					this.anIntArrayArray57[local31][1] = arg0.method23362(-2084601513);
				}
			} else if (arg1 == 15) {
				this.anInt4258 = arg0.method23178((byte) -127) * 514088645;
			} else if (arg1 == 17) {
				this.anInt4259 = arg0.method23210((byte) 69) * -1534964091;
			} else if (arg1 == 18) {
				local24 = arg0.method23362(-806951824);
				this.anIntArray431 = new int[local24];
				this.anIntArray426 = new int[local24];
				this.anIntArray427 = new int[local24];
				this.aStringArray26 = new String[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray431[local31] = arg0.method23182(1081329860);
					this.anIntArray426[local31] = arg0.method23182(812690318);
					this.anIntArray427[local31] = arg0.method23182(-340702416);
					this.aStringArray26[local31] = arg0.method23376((short) 16075);
				}
			} else if (arg1 == 19) {
				local24 = arg0.method23362(-796536115);
				this.anIntArray428 = new int[local24];
				this.anIntArray429 = new int[local24];
				this.anIntArray430 = new int[local24];
				this.aStringArray27 = new String[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray428[local31] = arg0.method23182(1043123830);
					this.anIntArray429[local31] = arg0.method23182(-356332695);
					this.anIntArray430[local31] = arg0.method23182(-1540425885);
					this.aStringArray27[local31] = arg0.method23376((short) 29488);
				}
			} else if (arg1 == 249) {
				local24 = arg0.method23362(314273889);
				if (this.aClass24_32 == null) {
					local31 = Class700.method37081(local24, (byte) 9);
					this.aClass24_32 = new Class24(local31);
				}
				for (local31 = 0; local31 < local24; local31++) {
					@Pc(432) boolean local432 = arg0.method23362(-1930676830) == 1;
					@Pc(436) int local436 = arg0.method23180(1710327153);
					@Pc(445) Class80 local445;
					if (local432) {
						local445 = new Class80_Sub19(arg0.method23376((short) 19655));
					} else {
						local445 = new Class80_Sub20(arg0.method23182(2089605414));
					}
					this.aClass24_32.method563(local445, (long) local436);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ix", name = "e", descriptor = "()V")
	@Override
	public void method37008() {
		if (this.aString194 == null) {
			this.aString194 = this.aString193;
		}
	}

	@OriginalMember(owner = "client!ix", name = "j", descriptor = "(Lclient!ey;S)Z")
	public boolean method28039(@OriginalArg(0) Interface24 arg0, @OriginalArg(1) short arg1) {
		if (Class680.method33641(arg0, this.anInterface12_12, -1264889413) < this.anInt4258 * 1518170125) {
			return false;
		}
		@Pc(17) int local17;
		if (this.anIntArrayArray57 != null) {
			for (local17 = 0; local17 < this.anIntArrayArray57.length; local17++) {
				if (((Interface72) arg0).method10433(this.anIntArrayArray57[local17][0], 1328580491) < this.anIntArrayArray57[local17][1]) {
					return false;
				}
			}
		}
		if (this.anIntArray425 != null) {
			for (local17 = 0; local17 < this.anIntArray425.length; local17++) {
				if (!((Class352) this.anInterface12_12.method18054(this.anIntArray425[local17], 1063273137)).method28032(arg0, 90395255)) {
					return false;
				}
			}
		}
		@Pc(96) int local96;
		if (this.anIntArray431 != null) {
			for (local17 = 0; local17 < this.anIntArray431.length; local17++) {
				@Pc(91) Class107 local91 = ((Interface21) arg0).method28382(Class143.aClass143_71, this.anIntArray431[local17], 1890760707);
				local96 = arg0.method36980(local91, 451614564);
				if (local96 < this.anIntArray426[local17] || local96 > this.anIntArray427[local17]) {
					return false;
				}
			}
		}
		if (this.anIntArray428 != null) {
			for (local17 = 0; local17 < this.anIntArray428.length; local17++) {
				@Pc(131) Class374 local131 = ((Interface21) arg0).method28381(this.anIntArray428[local17], -1482607674);
				local96 = arg0.method36978(local131, (byte) -47);
				if (local96 < this.anIntArray429[local17] || local96 > this.anIntArray430[local17]) {
					return false;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ix", name = "q", descriptor = "(Lclient!ald;I)V")
	void method28040(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aString193 = arg0.method23186((byte) 12);
		} else if (arg1 == 2) {
			this.aString194 = arg0.method23186((byte) 12);
		} else {
			@Pc(24) int local24;
			@Pc(31) int local31;
			if (arg1 == 3) {
				local24 = arg0.method23362(-32120468);
				this.anIntArrayArray56 = new int[local24][3];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArrayArray56[local31][0] = arg0.method23178((byte) -29);
					this.anIntArrayArray56[local31][1] = arg0.method23182(-2078296380);
					this.anIntArrayArray56[local31][2] = arg0.method23182(-1267402401);
				}
			} else if (arg1 == 4) {
				local24 = arg0.method23362(-575289573);
				this.anIntArrayArray55 = new int[local24][3];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArrayArray55[local31][0] = arg0.method23178((byte) -21);
					this.anIntArrayArray55[local31][1] = arg0.method23182(2038968203);
					this.anIntArrayArray55[local31][2] = arg0.method23182(-795102953);
				}
			} else if (arg1 == 5) {
				arg0.method23178((byte) -116);
			} else if (arg1 == 6) {
				this.anInt4257 = arg0.method23362(-794671126) * 1455628633;
			} else if (arg1 == 7) {
				this.anInt4256 = arg0.method23362(-1624723721) * -1936987933;
			} else if (arg1 == 8) {
				this.aBoolean834 = true;
			} else if (arg1 == 9) {
				this.anInt4260 = arg0.method23362(267568772) * 2069189243;
			} else if (arg1 == 10) {
				local24 = arg0.method23362(-795211929);
				this.anIntArray424 = new int[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray424[local31] = arg0.method23182(-762951751);
				}
			} else if (arg1 == 12) {
				arg0.method23182(747806051);
			} else if (arg1 == 13) {
				local24 = arg0.method23362(-859236184);
				this.anIntArray425 = new int[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray425[local31] = arg0.method23178((byte) -58);
				}
			} else if (arg1 == 14) {
				local24 = arg0.method23362(-1111362854);
				this.anIntArrayArray57 = new int[local24][2];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArrayArray57[local31][0] = arg0.method23362(-1639643434);
					this.anIntArrayArray57[local31][1] = arg0.method23362(-166005335);
				}
			} else if (arg1 == 15) {
				this.anInt4258 = arg0.method23178((byte) -122) * 514088645;
			} else if (arg1 == 17) {
				this.anInt4259 = arg0.method23210((byte) 81) * -1534964091;
			} else if (arg1 == 18) {
				local24 = arg0.method23362(-478357015);
				this.anIntArray431 = new int[local24];
				this.anIntArray426 = new int[local24];
				this.anIntArray427 = new int[local24];
				this.aStringArray26 = new String[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray431[local31] = arg0.method23182(1721933898);
					this.anIntArray426[local31] = arg0.method23182(-1253329484);
					this.anIntArray427[local31] = arg0.method23182(-1936455215);
					this.aStringArray26[local31] = arg0.method23376((short) 10861);
				}
			} else if (arg1 == 19) {
				local24 = arg0.method23362(968865488);
				this.anIntArray428 = new int[local24];
				this.anIntArray429 = new int[local24];
				this.anIntArray430 = new int[local24];
				this.aStringArray27 = new String[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray428[local31] = arg0.method23182(-345618540);
					this.anIntArray429[local31] = arg0.method23182(-1587099449);
					this.anIntArray430[local31] = arg0.method23182(-1191896197);
					this.aStringArray27[local31] = arg0.method23376((short) 12688);
				}
			} else if (arg1 == 249) {
				local24 = arg0.method23362(-1216114602);
				if (this.aClass24_32 == null) {
					local31 = Class700.method37081(local24, (byte) 9);
					this.aClass24_32 = new Class24(local31);
				}
				for (local31 = 0; local31 < local24; local31++) {
					@Pc(432) boolean local432 = arg0.method23362(-569826620) == 1;
					@Pc(436) int local436 = arg0.method23180(1710327153);
					@Pc(445) Class80 local445;
					if (local432) {
						local445 = new Class80_Sub19(arg0.method23376((short) 25056));
					} else {
						local445 = new Class80_Sub20(arg0.method23182(-2110664997));
					}
					this.aClass24_32.method563(local445, (long) local436);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ix", name = "l", descriptor = "(Lclient!ald;II)V")
	void method28041(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 1) {
			this.aString193 = arg0.method23186((byte) 12);
		} else if (arg1 == 2) {
			this.aString194 = arg0.method23186((byte) 12);
		} else {
			@Pc(24) int local24;
			@Pc(31) int local31;
			if (arg1 == 3) {
				local24 = arg0.method23362(-1743122649);
				this.anIntArrayArray56 = new int[local24][3];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArrayArray56[local31][0] = arg0.method23178((byte) -49);
					this.anIntArrayArray56[local31][1] = arg0.method23182(-738417751);
					this.anIntArrayArray56[local31][2] = arg0.method23182(1109364822);
				}
			} else if (arg1 == 4) {
				local24 = arg0.method23362(-302597811);
				this.anIntArrayArray55 = new int[local24][3];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArrayArray55[local31][0] = arg0.method23178((byte) -47);
					this.anIntArrayArray55[local31][1] = arg0.method23182(682235532);
					this.anIntArrayArray55[local31][2] = arg0.method23182(436989027);
				}
			} else if (arg1 == 5) {
				arg0.method23178((byte) -24);
			} else if (arg1 == 6) {
				this.anInt4257 = arg0.method23362(717744635) * 1455628633;
			} else if (arg1 == 7) {
				this.anInt4256 = arg0.method23362(-1278969087) * -1936987933;
			} else if (arg1 == 8) {
				this.aBoolean834 = true;
			} else if (arg1 == 9) {
				this.anInt4260 = arg0.method23362(-368953253) * 2069189243;
			} else if (arg1 == 10) {
				local24 = arg0.method23362(-332480163);
				this.anIntArray424 = new int[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray424[local31] = arg0.method23182(-1955562778);
				}
			} else if (arg1 == 12) {
				arg0.method23182(-30741096);
			} else if (arg1 == 13) {
				local24 = arg0.method23362(357395707);
				this.anIntArray425 = new int[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray425[local31] = arg0.method23178((byte) -41);
				}
			} else if (arg1 == 14) {
				local24 = arg0.method23362(-680139850);
				this.anIntArrayArray57 = new int[local24][2];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArrayArray57[local31][0] = arg0.method23362(-156740978);
					this.anIntArrayArray57[local31][1] = arg0.method23362(-1045547695);
				}
			} else if (arg1 == 15) {
				this.anInt4258 = arg0.method23178((byte) -33) * 514088645;
			} else if (arg1 == 17) {
				this.anInt4259 = arg0.method23210((byte) 70) * -1534964091;
			} else if (arg1 == 18) {
				local24 = arg0.method23362(-1116282491);
				this.anIntArray431 = new int[local24];
				this.anIntArray426 = new int[local24];
				this.anIntArray427 = new int[local24];
				this.aStringArray26 = new String[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray431[local31] = arg0.method23182(-732688354);
					this.anIntArray426[local31] = arg0.method23182(-1503495673);
					this.anIntArray427[local31] = arg0.method23182(704304642);
					this.aStringArray26[local31] = arg0.method23376((short) 28275);
				}
			} else if (arg1 == 19) {
				local24 = arg0.method23362(1081707644);
				this.anIntArray428 = new int[local24];
				this.anIntArray429 = new int[local24];
				this.anIntArray430 = new int[local24];
				this.aStringArray27 = new String[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray428[local31] = arg0.method23182(693413491);
					this.anIntArray429[local31] = arg0.method23182(-1343420765);
					this.anIntArray430[local31] = arg0.method23182(-409744216);
					this.aStringArray27[local31] = arg0.method23376((short) 5031);
				}
			} else if (arg1 == 249) {
				local24 = arg0.method23362(-691149558);
				if (this.aClass24_32 == null) {
					local31 = Class700.method37081(local24, (byte) 9);
					this.aClass24_32 = new Class24(local31);
				}
				for (local31 = 0; local31 < local24; local31++) {
					@Pc(432) boolean local432 = arg0.method23362(-1941579117) == 1;
					@Pc(436) int local436 = arg0.method23180(1710327153);
					@Pc(445) Class80 local445;
					if (local432) {
						local445 = new Class80_Sub19(arg0.method23376((short) 22790));
					} else {
						local445 = new Class80_Sub20(arg0.method23182(-1513005798));
					}
					this.aClass24_32.method563(local445, (long) local436);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ix", name = "d", descriptor = "(Lclient!ald;I)V")
	void method28042(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aString193 = arg0.method23186((byte) 12);
		} else if (arg1 == 2) {
			this.aString194 = arg0.method23186((byte) 12);
		} else {
			@Pc(24) int local24;
			@Pc(31) int local31;
			if (arg1 == 3) {
				local24 = arg0.method23362(-156700192);
				this.anIntArrayArray56 = new int[local24][3];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArrayArray56[local31][0] = arg0.method23178((byte) -105);
					this.anIntArrayArray56[local31][1] = arg0.method23182(1837178166);
					this.anIntArrayArray56[local31][2] = arg0.method23182(-668436092);
				}
			} else if (arg1 == 4) {
				local24 = arg0.method23362(-701342548);
				this.anIntArrayArray55 = new int[local24][3];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArrayArray55[local31][0] = arg0.method23178((byte) -12);
					this.anIntArrayArray55[local31][1] = arg0.method23182(740795012);
					this.anIntArrayArray55[local31][2] = arg0.method23182(24768739);
				}
			} else if (arg1 == 5) {
				arg0.method23178((byte) -102);
			} else if (arg1 == 6) {
				this.anInt4257 = arg0.method23362(266112777) * 1455628633;
			} else if (arg1 == 7) {
				this.anInt4256 = arg0.method23362(563828901) * -1936987933;
			} else if (arg1 == 8) {
				this.aBoolean834 = true;
			} else if (arg1 == 9) {
				this.anInt4260 = arg0.method23362(-775344193) * 2069189243;
			} else if (arg1 == 10) {
				local24 = arg0.method23362(-1814697089);
				this.anIntArray424 = new int[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray424[local31] = arg0.method23182(-52675609);
				}
			} else if (arg1 == 12) {
				arg0.method23182(1004034477);
			} else if (arg1 == 13) {
				local24 = arg0.method23362(-1500322956);
				this.anIntArray425 = new int[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray425[local31] = arg0.method23178((byte) -34);
				}
			} else if (arg1 == 14) {
				local24 = arg0.method23362(-1897166582);
				this.anIntArrayArray57 = new int[local24][2];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArrayArray57[local31][0] = arg0.method23362(-1838046510);
					this.anIntArrayArray57[local31][1] = arg0.method23362(-119946199);
				}
			} else if (arg1 == 15) {
				this.anInt4258 = arg0.method23178((byte) -67) * 514088645;
			} else if (arg1 == 17) {
				this.anInt4259 = arg0.method23210((byte) 77) * -1534964091;
			} else if (arg1 == 18) {
				local24 = arg0.method23362(-426988195);
				this.anIntArray431 = new int[local24];
				this.anIntArray426 = new int[local24];
				this.anIntArray427 = new int[local24];
				this.aStringArray26 = new String[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray431[local31] = arg0.method23182(-407966897);
					this.anIntArray426[local31] = arg0.method23182(1944442922);
					this.anIntArray427[local31] = arg0.method23182(1773756496);
					this.aStringArray26[local31] = arg0.method23376((short) 29555);
				}
			} else if (arg1 == 19) {
				local24 = arg0.method23362(885619866);
				this.anIntArray428 = new int[local24];
				this.anIntArray429 = new int[local24];
				this.anIntArray430 = new int[local24];
				this.aStringArray27 = new String[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray428[local31] = arg0.method23182(434453327);
					this.anIntArray429[local31] = arg0.method23182(-393867917);
					this.anIntArray430[local31] = arg0.method23182(-1143547249);
					this.aStringArray27[local31] = arg0.method23376((short) 19480);
				}
			} else if (arg1 == 249) {
				local24 = arg0.method23362(-2031314518);
				if (this.aClass24_32 == null) {
					local31 = Class700.method37081(local24, (byte) 9);
					this.aClass24_32 = new Class24(local31);
				}
				for (local31 = 0; local31 < local24; local31++) {
					@Pc(432) boolean local432 = arg0.method23362(892378067) == 1;
					@Pc(436) int local436 = arg0.method23180(1710327153);
					@Pc(445) Class80 local445;
					if (local432) {
						local445 = new Class80_Sub19(arg0.method23376((short) 8232));
					} else {
						local445 = new Class80_Sub20(arg0.method23182(1989231238));
					}
					this.aClass24_32.method563(local445, (long) local436);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ix", name = "z", descriptor = "(Lclient!ald;I)V")
	void method28043(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aString193 = arg0.method23186((byte) 12);
		} else if (arg1 == 2) {
			this.aString194 = arg0.method23186((byte) 12);
		} else {
			@Pc(24) int local24;
			@Pc(31) int local31;
			if (arg1 == 3) {
				local24 = arg0.method23362(809482734);
				this.anIntArrayArray56 = new int[local24][3];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArrayArray56[local31][0] = arg0.method23178((byte) -80);
					this.anIntArrayArray56[local31][1] = arg0.method23182(-948731738);
					this.anIntArrayArray56[local31][2] = arg0.method23182(2120195053);
				}
			} else if (arg1 == 4) {
				local24 = arg0.method23362(-1663551347);
				this.anIntArrayArray55 = new int[local24][3];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArrayArray55[local31][0] = arg0.method23178((byte) -117);
					this.anIntArrayArray55[local31][1] = arg0.method23182(-1799801998);
					this.anIntArrayArray55[local31][2] = arg0.method23182(-1005971727);
				}
			} else if (arg1 == 5) {
				arg0.method23178((byte) -79);
			} else if (arg1 == 6) {
				this.anInt4257 = arg0.method23362(991914871) * 1455628633;
			} else if (arg1 == 7) {
				this.anInt4256 = arg0.method23362(65223631) * -1936987933;
			} else if (arg1 == 8) {
				this.aBoolean834 = true;
			} else if (arg1 == 9) {
				this.anInt4260 = arg0.method23362(-1852449518) * 2069189243;
			} else if (arg1 == 10) {
				local24 = arg0.method23362(-479384044);
				this.anIntArray424 = new int[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray424[local31] = arg0.method23182(1596631227);
				}
			} else if (arg1 == 12) {
				arg0.method23182(685054734);
			} else if (arg1 == 13) {
				local24 = arg0.method23362(-1409962536);
				this.anIntArray425 = new int[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray425[local31] = arg0.method23178((byte) -17);
				}
			} else if (arg1 == 14) {
				local24 = arg0.method23362(1117674611);
				this.anIntArrayArray57 = new int[local24][2];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArrayArray57[local31][0] = arg0.method23362(-1254324650);
					this.anIntArrayArray57[local31][1] = arg0.method23362(-90643354);
				}
			} else if (arg1 == 15) {
				this.anInt4258 = arg0.method23178((byte) -86) * 514088645;
			} else if (arg1 == 17) {
				this.anInt4259 = arg0.method23210((byte) 116) * -1534964091;
			} else if (arg1 == 18) {
				local24 = arg0.method23362(-1627145409);
				this.anIntArray431 = new int[local24];
				this.anIntArray426 = new int[local24];
				this.anIntArray427 = new int[local24];
				this.aStringArray26 = new String[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray431[local31] = arg0.method23182(589248519);
					this.anIntArray426[local31] = arg0.method23182(2121058374);
					this.anIntArray427[local31] = arg0.method23182(982391145);
					this.aStringArray26[local31] = arg0.method23376((short) 16683);
				}
			} else if (arg1 == 19) {
				local24 = arg0.method23362(-1876345238);
				this.anIntArray428 = new int[local24];
				this.anIntArray429 = new int[local24];
				this.anIntArray430 = new int[local24];
				this.aStringArray27 = new String[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray428[local31] = arg0.method23182(-1800021389);
					this.anIntArray429[local31] = arg0.method23182(-1365458607);
					this.anIntArray430[local31] = arg0.method23182(-356028018);
					this.aStringArray27[local31] = arg0.method23376((short) 8794);
				}
			} else if (arg1 == 249) {
				local24 = arg0.method23362(-925069134);
				if (this.aClass24_32 == null) {
					local31 = Class700.method37081(local24, (byte) 9);
					this.aClass24_32 = new Class24(local31);
				}
				for (local31 = 0; local31 < local24; local31++) {
					@Pc(432) boolean local432 = arg0.method23362(-1381263372) == 1;
					@Pc(436) int local436 = arg0.method23180(1710327153);
					@Pc(445) Class80 local445;
					if (local432) {
						local445 = new Class80_Sub19(arg0.method23376((short) 17216));
					} else {
						local445 = new Class80_Sub20(arg0.method23182(-303748773));
					}
					this.aClass24_32.method563(local445, (long) local436);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ix", name = "s", descriptor = "(Lclient!ey;II)Z")
	public boolean method28044(@OriginalArg(0) Interface24 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anIntArrayArray57 == null || arg1 < 0 || arg1 >= this.anIntArrayArray57.length) {
			return false;
		} else {
			return ((Interface72) arg0).method10433(this.anIntArrayArray57[arg1][0], 2060650884) >= this.anIntArrayArray57[arg1][1];
		}
	}

	@OriginalMember(owner = "client!ix", name = "ab", descriptor = "(Lclient!ey;I)Z")
	public boolean method28045(@OriginalArg(0) Interface24 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray425 == null || arg1 < 0 || arg1 >= this.anIntArray425.length) {
			return false;
		} else {
			return ((Class352) this.anInterface12_12.method18054(this.anIntArray425[arg1], -35633916)).method28032(arg0, 370395735);
		}
	}

	@OriginalMember(owner = "client!ix", name = "y", descriptor = "(II)I")
	public int method28046(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass24_32 == null) {
			return arg1;
		} else {
			@Pc(11) Class80_Sub20 local11 = (Class80_Sub20) this.aClass24_32.method560((long) arg0);
			return local11 == null ? arg1 : local11.anInt1588 * 701000167;
		}
	}

	@OriginalMember(owner = "client!ix", name = "n", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public String method28047(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (this.aClass24_32 == null) {
			return arg1;
		} else {
			@Pc(12) Class80_Sub19 local12 = (Class80_Sub19) this.aClass24_32.method560((long) arg0);
			return local12 == null ? arg1 : (String) local12.anObject5;
		}
	}

	@OriginalMember(owner = "client!ix", name = "c", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public String method28048(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (this.aClass24_32 == null) {
			return arg1;
		} else {
			@Pc(12) Class80_Sub19 local12 = (Class80_Sub19) this.aClass24_32.method560((long) arg0);
			return local12 == null ? arg1 : (String) local12.anObject5;
		}
	}

	@OriginalMember(owner = "client!ix", name = "aq", descriptor = "(Lclient!ey;)Z")
	public boolean method28049(@OriginalArg(0) Interface24 arg0) {
		if (Class680.method33641(arg0, this.anInterface12_12, -32968404) < this.anInt4258 * 1518170125) {
			return false;
		}
		@Pc(17) int local17;
		if (this.anIntArrayArray57 != null) {
			for (local17 = 0; local17 < this.anIntArrayArray57.length; local17++) {
				if (((Interface72) arg0).method10433(this.anIntArrayArray57[local17][0], 1536226447) < this.anIntArrayArray57[local17][1]) {
					return false;
				}
			}
		}
		if (this.anIntArray425 != null) {
			for (local17 = 0; local17 < this.anIntArray425.length; local17++) {
				if (!((Class352) this.anInterface12_12.method18054(this.anIntArray425[local17], 1681052024)).method28032(arg0, 266154998)) {
					return false;
				}
			}
		}
		@Pc(96) int local96;
		if (this.anIntArray431 != null) {
			for (local17 = 0; local17 < this.anIntArray431.length; local17++) {
				@Pc(91) Class107 local91 = ((Interface21) arg0).method28382(Class143.aClass143_71, this.anIntArray431[local17], 648723716);
				local96 = arg0.method36980(local91, -1695741441);
				if (local96 < this.anIntArray426[local17] || local96 > this.anIntArray427[local17]) {
					return false;
				}
			}
		}
		if (this.anIntArray428 != null) {
			for (local17 = 0; local17 < this.anIntArray428.length; local17++) {
				@Pc(131) Class374 local131 = ((Interface21) arg0).method28381(this.anIntArray428[local17], -1482607674);
				local96 = arg0.method36978(local131, (byte) -114);
				if (local96 < this.anIntArray429[local17] || local96 > this.anIntArray430[local17]) {
					return false;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ix", name = "ax", descriptor = "(Lclient!ey;)Z")
	public boolean method28050(@OriginalArg(0) Interface24 arg0) {
		@Pc(5) int local5;
		if (this.anIntArrayArray56 != null) {
			for (local5 = 0; local5 < this.anIntArrayArray56.length; local5++) {
				@Pc(22) Class107 local22 = ((Interface21) arg0).method28382(Class143.aClass143_71, this.anIntArrayArray56[local5][0], 697230504);
				if (arg0.method36980(local22, 639966663) >= this.anIntArrayArray56[local5][1]) {
					return true;
				}
			}
		}
		if (this.anIntArrayArray55 != null) {
			for (local5 = 0; local5 < this.anIntArrayArray55.length; local5++) {
				@Pc(59) Class374 local59 = ((Interface21) arg0).method28381(this.anIntArrayArray55[local5][0], -1482607674);
				if (arg0.method36978(local59, (byte) -115) >= this.anIntArrayArray55[local5][1]) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ix", name = "ay", descriptor = "(Lclient!ey;)Z")
	public boolean method28051(@OriginalArg(0) Interface24 arg0) {
		@Pc(5) int local5;
		if (this.anIntArrayArray56 != null) {
			for (local5 = 0; local5 < this.anIntArrayArray56.length; local5++) {
				@Pc(22) Class107 local22 = ((Interface21) arg0).method28382(Class143.aClass143_71, this.anIntArrayArray56[local5][0], 686108548);
				if (arg0.method36980(local22, -1282306871) >= this.anIntArrayArray56[local5][1]) {
					return true;
				}
			}
		}
		if (this.anIntArrayArray55 != null) {
			for (local5 = 0; local5 < this.anIntArrayArray55.length; local5++) {
				@Pc(59) Class374 local59 = ((Interface21) arg0).method28381(this.anIntArrayArray55[local5][0], -1482607674);
				if (arg0.method36978(local59, (byte) -31) >= this.anIntArrayArray55[local5][1]) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ix", name = "ai", descriptor = "(Lclient!ey;)Z")
	public boolean method28052(@OriginalArg(0) Interface24 arg0) {
		@Pc(4) int local4;
		if (this.anIntArrayArray56 != null) {
			for (local4 = 0; local4 < this.anIntArrayArray56.length; local4++) {
				@Pc(21) Class107 local21 = ((Interface21) arg0).method28382(Class143.aClass143_71, this.anIntArrayArray56[local4][0], 1618348374);
				if (arg0.method36980(local21, 1067255812) >= this.anIntArrayArray56[local4][2]) {
					return true;
				}
			}
		}
		if (this.anIntArrayArray55 != null) {
			for (local4 = 0; local4 < this.anIntArrayArray55.length; local4++) {
				@Pc(58) Class374 local58 = ((Interface21) arg0).method28381(this.anIntArrayArray55[local4][0], -1482607674);
				if (arg0.method36978(local58, (byte) -21) >= this.anIntArrayArray55[local4][2]) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ix", name = "u", descriptor = "(Lclient!ald;)V")
	@Override
	public void method37009(@OriginalArg(0) Class80_Sub36 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method23362(308606430);
			if (local3 == 0) {
				return;
			}
			this.method28041(arg0, local3, 2120567743);
		}
	}

	@OriginalMember(owner = "client!ix", name = "ao", descriptor = "(Lclient!ey;)Z")
	public boolean method28053(@OriginalArg(0) Interface24 arg0) {
		return Class680.method33641(arg0, this.anInterface12_12, 1786286489) >= this.anInt4258 * 1518170125;
	}

	@OriginalMember(owner = "client!ix", name = "aj", descriptor = "(Lclient!ey;)Z")
	public boolean method28054(@OriginalArg(0) Interface24 arg0) {
		return Class680.method33641(arg0, this.anInterface12_12, -1219822067) >= this.anInt4258 * 1518170125;
	}

	@OriginalMember(owner = "client!ix", name = "ac", descriptor = "(Lclient!ey;)Z")
	public boolean method28055(@OriginalArg(0) Interface24 arg0) {
		return Class680.method33641(arg0, this.anInterface12_12, 2116858311) >= this.anInt4258 * 1518170125;
	}

	@OriginalMember(owner = "client!ix", name = "v", descriptor = "(II)I")
	public int method28056(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass24_32 == null) {
			return arg1;
		} else {
			@Pc(11) Class80_Sub20 local11 = (Class80_Sub20) this.aClass24_32.method560((long) arg0);
			return local11 == null ? arg1 : local11.anInt1588 * 701000167;
		}
	}

	@OriginalMember(owner = "client!ix", name = "af", descriptor = "(Lclient!ey;I)Z")
	public boolean method28057(@OriginalArg(0) Interface24 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray428 == null || arg1 < 0 || arg1 >= this.anIntArray428.length) {
			return false;
		} else {
			@Pc(20) Class374 local20 = ((Interface21) arg0).method28381(this.anIntArray428[arg1], -1482607674);
			@Pc(25) int local25 = arg0.method36978(local20, (byte) -36);
			return local25 >= this.anIntArray429[arg1] && local25 <= this.anIntArray430[arg1];
		}
	}

	@OriginalMember(owner = "client!ix", name = "al", descriptor = "(Lclient!ey;I)Z")
	public boolean method28058(@OriginalArg(0) Interface24 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray425 == null || arg1 < 0 || arg1 >= this.anIntArray425.length) {
			return false;
		} else {
			return ((Class352) this.anInterface12_12.method18054(this.anIntArray425[arg1], -1264573550)).method28032(arg0, -1913133920);
		}
	}

	@OriginalMember(owner = "client!ix", name = "ah", descriptor = "(Lclient!ey;I)Z")
	public boolean method28059(@OriginalArg(0) Interface24 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray431 == null || arg1 < 0 || arg1 >= this.anIntArray431.length) {
			return false;
		} else {
			@Pc(21) Class107 local21 = ((Interface21) arg0).method28382(Class143.aClass143_71, this.anIntArray431[arg1], 318436283);
			@Pc(26) int local26 = arg0.method36980(local21, 471693805);
			return local26 >= this.anIntArray426[arg1] && local26 <= this.anIntArray427[arg1];
		}
	}

	@OriginalMember(owner = "client!ix", name = "am", descriptor = "(Lclient!ey;I)Z")
	public boolean method28060(@OriginalArg(0) Interface24 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray428 == null || arg1 < 0 || arg1 >= this.anIntArray428.length) {
			return false;
		} else {
			@Pc(20) Class374 local20 = ((Interface21) arg0).method28381(this.anIntArray428[arg1], -1482607674);
			@Pc(25) int local25 = arg0.method36978(local20, (byte) -123);
			return local25 >= this.anIntArray429[arg1] && local25 <= this.anIntArray430[arg1];
		}
	}
}
