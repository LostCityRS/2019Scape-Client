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
		@Pc(4) Packet local4 = new Packet(arg0);
		@Pc(8) int local8 = local4.g1();
		if (local8 != 2) {
			return false;
		}
		@Pc(22) boolean local22 = local4.g1() == 1;
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
		local13.aPacketBit_2.p1(Class350.method28013(arg0, (short) 16383));
		local13.aPacketBit_2.pjstr(arg0);
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
	public void method37006(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.g1();
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
	void method28030(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aString193 = arg0.gjstr2();
		} else if (arg1 == 2) {
			this.aString194 = arg0.gjstr2();
		} else {
			@Pc(24) int local24;
			@Pc(31) int local31;
			if (arg1 == 3) {
				local24 = arg0.g1();
				this.anIntArrayArray56 = new int[local24][3];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArrayArray56[local31][0] = arg0.g2();
					this.anIntArrayArray56[local31][1] = arg0.g4();
					this.anIntArrayArray56[local31][2] = arg0.g4();
				}
			} else if (arg1 == 4) {
				local24 = arg0.g1();
				this.anIntArrayArray55 = new int[local24][3];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArrayArray55[local31][0] = arg0.g2();
					this.anIntArrayArray55[local31][1] = arg0.g4();
					this.anIntArrayArray55[local31][2] = arg0.g4();
				}
			} else if (arg1 == 5) {
				arg0.g2();
			} else if (arg1 == 6) {
				this.anInt4257 = arg0.g1() * 1455628633;
			} else if (arg1 == 7) {
				this.anInt4256 = arg0.g1() * -1936987933;
			} else if (arg1 == 8) {
				this.aBoolean834 = true;
			} else if (arg1 == 9) {
				this.anInt4260 = arg0.g1() * 2069189243;
			} else if (arg1 == 10) {
				local24 = arg0.g1();
				this.anIntArray424 = new int[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray424[local31] = arg0.g4();
				}
			} else if (arg1 == 12) {
				arg0.g4();
			} else if (arg1 == 13) {
				local24 = arg0.g1();
				this.anIntArray425 = new int[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray425[local31] = arg0.g2();
				}
			} else if (arg1 == 14) {
				local24 = arg0.g1();
				this.anIntArrayArray57 = new int[local24][2];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArrayArray57[local31][0] = arg0.g1();
					this.anIntArrayArray57[local31][1] = arg0.g1();
				}
			} else if (arg1 == 15) {
				this.anInt4258 = arg0.g2() * 514088645;
			} else if (arg1 == 17) {
				this.anInt4259 = arg0.gSmart2or4null() * -1534964091;
			} else if (arg1 == 18) {
				local24 = arg0.g1();
				this.anIntArray431 = new int[local24];
				this.anIntArray426 = new int[local24];
				this.anIntArray427 = new int[local24];
				this.aStringArray26 = new String[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray431[local31] = arg0.g4();
					this.anIntArray426[local31] = arg0.g4();
					this.anIntArray427[local31] = arg0.g4();
					this.aStringArray26[local31] = arg0.gjstr();
				}
			} else if (arg1 == 19) {
				local24 = arg0.g1();
				this.anIntArray428 = new int[local24];
				this.anIntArray429 = new int[local24];
				this.anIntArray430 = new int[local24];
				this.aStringArray27 = new String[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray428[local31] = arg0.g4();
					this.anIntArray429[local31] = arg0.g4();
					this.anIntArray430[local31] = arg0.g4();
					this.aStringArray27[local31] = arg0.gjstr();
				}
			} else if (arg1 == 249) {
				local24 = arg0.g1();
				if (this.aClass24_32 == null) {
					local31 = Class700.method37081(local24, (byte) 9);
					this.aClass24_32 = new Class24(local31);
				}
				for (local31 = 0; local31 < local24; local31++) {
					@Pc(432) boolean local432 = arg0.g1() == 1;
					@Pc(436) int local436 = arg0.g3();
					@Pc(445) Class80 local445;
					if (local432) {
						local445 = new Class80_Sub19(arg0.gjstr());
					} else {
						local445 = new Class80_Sub20(arg0.g4());
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
	void method28038(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aString193 = arg0.gjstr2();
		} else if (arg1 == 2) {
			this.aString194 = arg0.gjstr2();
		} else {
			@Pc(24) int local24;
			@Pc(31) int local31;
			if (arg1 == 3) {
				local24 = arg0.g1();
				this.anIntArrayArray56 = new int[local24][3];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArrayArray56[local31][0] = arg0.g2();
					this.anIntArrayArray56[local31][1] = arg0.g4();
					this.anIntArrayArray56[local31][2] = arg0.g4();
				}
			} else if (arg1 == 4) {
				local24 = arg0.g1();
				this.anIntArrayArray55 = new int[local24][3];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArrayArray55[local31][0] = arg0.g2();
					this.anIntArrayArray55[local31][1] = arg0.g4();
					this.anIntArrayArray55[local31][2] = arg0.g4();
				}
			} else if (arg1 == 5) {
				arg0.g2();
			} else if (arg1 == 6) {
				this.anInt4257 = arg0.g1() * 1455628633;
			} else if (arg1 == 7) {
				this.anInt4256 = arg0.g1() * -1936987933;
			} else if (arg1 == 8) {
				this.aBoolean834 = true;
			} else if (arg1 == 9) {
				this.anInt4260 = arg0.g1() * 2069189243;
			} else if (arg1 == 10) {
				local24 = arg0.g1();
				this.anIntArray424 = new int[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray424[local31] = arg0.g4();
				}
			} else if (arg1 == 12) {
				arg0.g4();
			} else if (arg1 == 13) {
				local24 = arg0.g1();
				this.anIntArray425 = new int[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray425[local31] = arg0.g2();
				}
			} else if (arg1 == 14) {
				local24 = arg0.g1();
				this.anIntArrayArray57 = new int[local24][2];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArrayArray57[local31][0] = arg0.g1();
					this.anIntArrayArray57[local31][1] = arg0.g1();
				}
			} else if (arg1 == 15) {
				this.anInt4258 = arg0.g2() * 514088645;
			} else if (arg1 == 17) {
				this.anInt4259 = arg0.gSmart2or4null() * -1534964091;
			} else if (arg1 == 18) {
				local24 = arg0.g1();
				this.anIntArray431 = new int[local24];
				this.anIntArray426 = new int[local24];
				this.anIntArray427 = new int[local24];
				this.aStringArray26 = new String[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray431[local31] = arg0.g4();
					this.anIntArray426[local31] = arg0.g4();
					this.anIntArray427[local31] = arg0.g4();
					this.aStringArray26[local31] = arg0.gjstr();
				}
			} else if (arg1 == 19) {
				local24 = arg0.g1();
				this.anIntArray428 = new int[local24];
				this.anIntArray429 = new int[local24];
				this.anIntArray430 = new int[local24];
				this.aStringArray27 = new String[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray428[local31] = arg0.g4();
					this.anIntArray429[local31] = arg0.g4();
					this.anIntArray430[local31] = arg0.g4();
					this.aStringArray27[local31] = arg0.gjstr();
				}
			} else if (arg1 == 249) {
				local24 = arg0.g1();
				if (this.aClass24_32 == null) {
					local31 = Class700.method37081(local24, (byte) 9);
					this.aClass24_32 = new Class24(local31);
				}
				for (local31 = 0; local31 < local24; local31++) {
					@Pc(432) boolean local432 = arg0.g1() == 1;
					@Pc(436) int local436 = arg0.g3();
					@Pc(445) Class80 local445;
					if (local432) {
						local445 = new Class80_Sub19(arg0.gjstr());
					} else {
						local445 = new Class80_Sub20(arg0.g4());
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
	void method28040(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aString193 = arg0.gjstr2();
		} else if (arg1 == 2) {
			this.aString194 = arg0.gjstr2();
		} else {
			@Pc(24) int local24;
			@Pc(31) int local31;
			if (arg1 == 3) {
				local24 = arg0.g1();
				this.anIntArrayArray56 = new int[local24][3];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArrayArray56[local31][0] = arg0.g2();
					this.anIntArrayArray56[local31][1] = arg0.g4();
					this.anIntArrayArray56[local31][2] = arg0.g4();
				}
			} else if (arg1 == 4) {
				local24 = arg0.g1();
				this.anIntArrayArray55 = new int[local24][3];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArrayArray55[local31][0] = arg0.g2();
					this.anIntArrayArray55[local31][1] = arg0.g4();
					this.anIntArrayArray55[local31][2] = arg0.g4();
				}
			} else if (arg1 == 5) {
				arg0.g2();
			} else if (arg1 == 6) {
				this.anInt4257 = arg0.g1() * 1455628633;
			} else if (arg1 == 7) {
				this.anInt4256 = arg0.g1() * -1936987933;
			} else if (arg1 == 8) {
				this.aBoolean834 = true;
			} else if (arg1 == 9) {
				this.anInt4260 = arg0.g1() * 2069189243;
			} else if (arg1 == 10) {
				local24 = arg0.g1();
				this.anIntArray424 = new int[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray424[local31] = arg0.g4();
				}
			} else if (arg1 == 12) {
				arg0.g4();
			} else if (arg1 == 13) {
				local24 = arg0.g1();
				this.anIntArray425 = new int[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray425[local31] = arg0.g2();
				}
			} else if (arg1 == 14) {
				local24 = arg0.g1();
				this.anIntArrayArray57 = new int[local24][2];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArrayArray57[local31][0] = arg0.g1();
					this.anIntArrayArray57[local31][1] = arg0.g1();
				}
			} else if (arg1 == 15) {
				this.anInt4258 = arg0.g2() * 514088645;
			} else if (arg1 == 17) {
				this.anInt4259 = arg0.gSmart2or4null() * -1534964091;
			} else if (arg1 == 18) {
				local24 = arg0.g1();
				this.anIntArray431 = new int[local24];
				this.anIntArray426 = new int[local24];
				this.anIntArray427 = new int[local24];
				this.aStringArray26 = new String[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray431[local31] = arg0.g4();
					this.anIntArray426[local31] = arg0.g4();
					this.anIntArray427[local31] = arg0.g4();
					this.aStringArray26[local31] = arg0.gjstr();
				}
			} else if (arg1 == 19) {
				local24 = arg0.g1();
				this.anIntArray428 = new int[local24];
				this.anIntArray429 = new int[local24];
				this.anIntArray430 = new int[local24];
				this.aStringArray27 = new String[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray428[local31] = arg0.g4();
					this.anIntArray429[local31] = arg0.g4();
					this.anIntArray430[local31] = arg0.g4();
					this.aStringArray27[local31] = arg0.gjstr();
				}
			} else if (arg1 == 249) {
				local24 = arg0.g1();
				if (this.aClass24_32 == null) {
					local31 = Class700.method37081(local24, (byte) 9);
					this.aClass24_32 = new Class24(local31);
				}
				for (local31 = 0; local31 < local24; local31++) {
					@Pc(432) boolean local432 = arg0.g1() == 1;
					@Pc(436) int local436 = arg0.g3();
					@Pc(445) Class80 local445;
					if (local432) {
						local445 = new Class80_Sub19(arg0.gjstr());
					} else {
						local445 = new Class80_Sub20(arg0.g4());
					}
					this.aClass24_32.method563(local445, (long) local436);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ix", name = "l", descriptor = "(Lclient!ald;II)V")
	void method28041(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 1) {
			this.aString193 = arg0.gjstr2();
		} else if (arg1 == 2) {
			this.aString194 = arg0.gjstr2();
		} else {
			@Pc(24) int local24;
			@Pc(31) int local31;
			if (arg1 == 3) {
				local24 = arg0.g1();
				this.anIntArrayArray56 = new int[local24][3];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArrayArray56[local31][0] = arg0.g2();
					this.anIntArrayArray56[local31][1] = arg0.g4();
					this.anIntArrayArray56[local31][2] = arg0.g4();
				}
			} else if (arg1 == 4) {
				local24 = arg0.g1();
				this.anIntArrayArray55 = new int[local24][3];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArrayArray55[local31][0] = arg0.g2();
					this.anIntArrayArray55[local31][1] = arg0.g4();
					this.anIntArrayArray55[local31][2] = arg0.g4();
				}
			} else if (arg1 == 5) {
				arg0.g2();
			} else if (arg1 == 6) {
				this.anInt4257 = arg0.g1() * 1455628633;
			} else if (arg1 == 7) {
				this.anInt4256 = arg0.g1() * -1936987933;
			} else if (arg1 == 8) {
				this.aBoolean834 = true;
			} else if (arg1 == 9) {
				this.anInt4260 = arg0.g1() * 2069189243;
			} else if (arg1 == 10) {
				local24 = arg0.g1();
				this.anIntArray424 = new int[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray424[local31] = arg0.g4();
				}
			} else if (arg1 == 12) {
				arg0.g4();
			} else if (arg1 == 13) {
				local24 = arg0.g1();
				this.anIntArray425 = new int[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray425[local31] = arg0.g2();
				}
			} else if (arg1 == 14) {
				local24 = arg0.g1();
				this.anIntArrayArray57 = new int[local24][2];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArrayArray57[local31][0] = arg0.g1();
					this.anIntArrayArray57[local31][1] = arg0.g1();
				}
			} else if (arg1 == 15) {
				this.anInt4258 = arg0.g2() * 514088645;
			} else if (arg1 == 17) {
				this.anInt4259 = arg0.gSmart2or4null() * -1534964091;
			} else if (arg1 == 18) {
				local24 = arg0.g1();
				this.anIntArray431 = new int[local24];
				this.anIntArray426 = new int[local24];
				this.anIntArray427 = new int[local24];
				this.aStringArray26 = new String[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray431[local31] = arg0.g4();
					this.anIntArray426[local31] = arg0.g4();
					this.anIntArray427[local31] = arg0.g4();
					this.aStringArray26[local31] = arg0.gjstr();
				}
			} else if (arg1 == 19) {
				local24 = arg0.g1();
				this.anIntArray428 = new int[local24];
				this.anIntArray429 = new int[local24];
				this.anIntArray430 = new int[local24];
				this.aStringArray27 = new String[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray428[local31] = arg0.g4();
					this.anIntArray429[local31] = arg0.g4();
					this.anIntArray430[local31] = arg0.g4();
					this.aStringArray27[local31] = arg0.gjstr();
				}
			} else if (arg1 == 249) {
				local24 = arg0.g1();
				if (this.aClass24_32 == null) {
					local31 = Class700.method37081(local24, (byte) 9);
					this.aClass24_32 = new Class24(local31);
				}
				for (local31 = 0; local31 < local24; local31++) {
					@Pc(432) boolean local432 = arg0.g1() == 1;
					@Pc(436) int local436 = arg0.g3();
					@Pc(445) Class80 local445;
					if (local432) {
						local445 = new Class80_Sub19(arg0.gjstr());
					} else {
						local445 = new Class80_Sub20(arg0.g4());
					}
					this.aClass24_32.method563(local445, (long) local436);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ix", name = "d", descriptor = "(Lclient!ald;I)V")
	void method28042(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aString193 = arg0.gjstr2();
		} else if (arg1 == 2) {
			this.aString194 = arg0.gjstr2();
		} else {
			@Pc(24) int local24;
			@Pc(31) int local31;
			if (arg1 == 3) {
				local24 = arg0.g1();
				this.anIntArrayArray56 = new int[local24][3];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArrayArray56[local31][0] = arg0.g2();
					this.anIntArrayArray56[local31][1] = arg0.g4();
					this.anIntArrayArray56[local31][2] = arg0.g4();
				}
			} else if (arg1 == 4) {
				local24 = arg0.g1();
				this.anIntArrayArray55 = new int[local24][3];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArrayArray55[local31][0] = arg0.g2();
					this.anIntArrayArray55[local31][1] = arg0.g4();
					this.anIntArrayArray55[local31][2] = arg0.g4();
				}
			} else if (arg1 == 5) {
				arg0.g2();
			} else if (arg1 == 6) {
				this.anInt4257 = arg0.g1() * 1455628633;
			} else if (arg1 == 7) {
				this.anInt4256 = arg0.g1() * -1936987933;
			} else if (arg1 == 8) {
				this.aBoolean834 = true;
			} else if (arg1 == 9) {
				this.anInt4260 = arg0.g1() * 2069189243;
			} else if (arg1 == 10) {
				local24 = arg0.g1();
				this.anIntArray424 = new int[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray424[local31] = arg0.g4();
				}
			} else if (arg1 == 12) {
				arg0.g4();
			} else if (arg1 == 13) {
				local24 = arg0.g1();
				this.anIntArray425 = new int[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray425[local31] = arg0.g2();
				}
			} else if (arg1 == 14) {
				local24 = arg0.g1();
				this.anIntArrayArray57 = new int[local24][2];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArrayArray57[local31][0] = arg0.g1();
					this.anIntArrayArray57[local31][1] = arg0.g1();
				}
			} else if (arg1 == 15) {
				this.anInt4258 = arg0.g2() * 514088645;
			} else if (arg1 == 17) {
				this.anInt4259 = arg0.gSmart2or4null() * -1534964091;
			} else if (arg1 == 18) {
				local24 = arg0.g1();
				this.anIntArray431 = new int[local24];
				this.anIntArray426 = new int[local24];
				this.anIntArray427 = new int[local24];
				this.aStringArray26 = new String[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray431[local31] = arg0.g4();
					this.anIntArray426[local31] = arg0.g4();
					this.anIntArray427[local31] = arg0.g4();
					this.aStringArray26[local31] = arg0.gjstr();
				}
			} else if (arg1 == 19) {
				local24 = arg0.g1();
				this.anIntArray428 = new int[local24];
				this.anIntArray429 = new int[local24];
				this.anIntArray430 = new int[local24];
				this.aStringArray27 = new String[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray428[local31] = arg0.g4();
					this.anIntArray429[local31] = arg0.g4();
					this.anIntArray430[local31] = arg0.g4();
					this.aStringArray27[local31] = arg0.gjstr();
				}
			} else if (arg1 == 249) {
				local24 = arg0.g1();
				if (this.aClass24_32 == null) {
					local31 = Class700.method37081(local24, (byte) 9);
					this.aClass24_32 = new Class24(local31);
				}
				for (local31 = 0; local31 < local24; local31++) {
					@Pc(432) boolean local432 = arg0.g1() == 1;
					@Pc(436) int local436 = arg0.g3();
					@Pc(445) Class80 local445;
					if (local432) {
						local445 = new Class80_Sub19(arg0.gjstr());
					} else {
						local445 = new Class80_Sub20(arg0.g4());
					}
					this.aClass24_32.method563(local445, (long) local436);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ix", name = "z", descriptor = "(Lclient!ald;I)V")
	void method28043(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aString193 = arg0.gjstr2();
		} else if (arg1 == 2) {
			this.aString194 = arg0.gjstr2();
		} else {
			@Pc(24) int local24;
			@Pc(31) int local31;
			if (arg1 == 3) {
				local24 = arg0.g1();
				this.anIntArrayArray56 = new int[local24][3];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArrayArray56[local31][0] = arg0.g2();
					this.anIntArrayArray56[local31][1] = arg0.g4();
					this.anIntArrayArray56[local31][2] = arg0.g4();
				}
			} else if (arg1 == 4) {
				local24 = arg0.g1();
				this.anIntArrayArray55 = new int[local24][3];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArrayArray55[local31][0] = arg0.g2();
					this.anIntArrayArray55[local31][1] = arg0.g4();
					this.anIntArrayArray55[local31][2] = arg0.g4();
				}
			} else if (arg1 == 5) {
				arg0.g2();
			} else if (arg1 == 6) {
				this.anInt4257 = arg0.g1() * 1455628633;
			} else if (arg1 == 7) {
				this.anInt4256 = arg0.g1() * -1936987933;
			} else if (arg1 == 8) {
				this.aBoolean834 = true;
			} else if (arg1 == 9) {
				this.anInt4260 = arg0.g1() * 2069189243;
			} else if (arg1 == 10) {
				local24 = arg0.g1();
				this.anIntArray424 = new int[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray424[local31] = arg0.g4();
				}
			} else if (arg1 == 12) {
				arg0.g4();
			} else if (arg1 == 13) {
				local24 = arg0.g1();
				this.anIntArray425 = new int[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray425[local31] = arg0.g2();
				}
			} else if (arg1 == 14) {
				local24 = arg0.g1();
				this.anIntArrayArray57 = new int[local24][2];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArrayArray57[local31][0] = arg0.g1();
					this.anIntArrayArray57[local31][1] = arg0.g1();
				}
			} else if (arg1 == 15) {
				this.anInt4258 = arg0.g2() * 514088645;
			} else if (arg1 == 17) {
				this.anInt4259 = arg0.gSmart2or4null() * -1534964091;
			} else if (arg1 == 18) {
				local24 = arg0.g1();
				this.anIntArray431 = new int[local24];
				this.anIntArray426 = new int[local24];
				this.anIntArray427 = new int[local24];
				this.aStringArray26 = new String[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray431[local31] = arg0.g4();
					this.anIntArray426[local31] = arg0.g4();
					this.anIntArray427[local31] = arg0.g4();
					this.aStringArray26[local31] = arg0.gjstr();
				}
			} else if (arg1 == 19) {
				local24 = arg0.g1();
				this.anIntArray428 = new int[local24];
				this.anIntArray429 = new int[local24];
				this.anIntArray430 = new int[local24];
				this.aStringArray27 = new String[local24];
				for (local31 = 0; local31 < local24; local31++) {
					this.anIntArray428[local31] = arg0.g4();
					this.anIntArray429[local31] = arg0.g4();
					this.anIntArray430[local31] = arg0.g4();
					this.aStringArray27[local31] = arg0.gjstr();
				}
			} else if (arg1 == 249) {
				local24 = arg0.g1();
				if (this.aClass24_32 == null) {
					local31 = Class700.method37081(local24, (byte) 9);
					this.aClass24_32 = new Class24(local31);
				}
				for (local31 = 0; local31 < local24; local31++) {
					@Pc(432) boolean local432 = arg0.g1() == 1;
					@Pc(436) int local436 = arg0.g3();
					@Pc(445) Class80 local445;
					if (local432) {
						local445 = new Class80_Sub19(arg0.gjstr());
					} else {
						local445 = new Class80_Sub20(arg0.g4());
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
	public void method37009(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.g1();
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
