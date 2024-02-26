package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!asw")
public final class Class80_Sub1_Sub20 extends Class80_Sub1 {

	@OriginalMember(owner = "client!asw", name = "o", descriptor = "[Lclient!sp;")
	public Class557[] aClass557Array1;

	@OriginalMember(owner = "client!asw", name = "m", descriptor = "Ljava/lang/String;")
	public String aString116;

	@OriginalMember(owner = "client!asw", name = "i", descriptor = "Lclient!ub;")
	public Class158 aClass158_70;

	@OriginalMember(owner = "client!asw", name = "j", descriptor = "[I")
	public int[] anIntArray283;

	@OriginalMember(owner = "client!asw", name = "a", descriptor = "[Ljava/lang/Object;")
	public Object[] anObjectArray5;

	@OriginalMember(owner = "client!asw", name = "w", descriptor = "I")
	public int anInt3145;

	@OriginalMember(owner = "client!asw", name = "k", descriptor = "I")
	public int anInt3146;

	@OriginalMember(owner = "client!asw", name = "s", descriptor = "I")
	public int anInt3147;

	@OriginalMember(owner = "client!asw", name = "x", descriptor = "I")
	public int anInt3148;

	@OriginalMember(owner = "client!asw", name = "r", descriptor = "I")
	public int anInt3149;

	@OriginalMember(owner = "client!asw", name = "q", descriptor = "I")
	public int anInt3150;

	@OriginalMember(owner = "client!asw", name = "h", descriptor = "[Lclient!aax;")
	public Class24[] aClass24Array1;

	@OriginalMember(owner = "client!asw", name = "d", descriptor = "Lclient!el;")
	final Interface21 anInterface21_3;

	@OriginalMember(owner = "client!asw", name = "<init>", descriptor = "(Lclient!ald;Lclient!el;)V")
	public Class80_Sub1_Sub20(@OriginalArg(0) Packet arg0, @OriginalArg(1) Interface21 arg1) {
		this.anInterface21_3 = arg1;
		@Pc(9) int local9 = this.method23132(arg0, (byte) -31);
		@Pc(11) int local11 = 0;
		@Pc(14) Class557[] local14 = Class367.method28290(-562689630);
		while (arg0.pos * -1380987821 < local9) {
			@Pc(26) Class557 local26 = this.method23131(arg0, local14, (short) 3169);
			this.method23135(arg0, local11, local26, (byte) -35);
			local11++;
		}
	}

	@OriginalMember(owner = "client!asw", name = "o", descriptor = "(Lclient!ald;ILclient!sp;)V")
	void method23130(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class557 arg2) {
		@Pc(3) int local3 = this.aClass557Array1.length;
		if (Class557.aClass557_1132 == arg2 || Class557.aClass557_3 == arg2) {
			@Pc(18) Class143 local18 = (Class143) Class80_Sub39.method15030(Class143.method11832(2067152457), arg0.g1(), -1413232125);
			@Pc(22) int local22 = arg0.g2();
			if (this.anObjectArray5 == null) {
				this.anObjectArray5 = new Object[local3];
			}
			this.anObjectArray5[arg1] = this.anInterface21_3.method28382(local18, local22, 1886740036);
			if (this.anIntArray283 == null) {
				this.anIntArray283 = new int[local3];
			}
			this.anIntArray283[arg1] = arg0.g1();
		} else if (arg2 == Class557.aClass557_6) {
			@Pc(66) Class519 local66 = (Class519) Class80_Sub39.method15030(Class519.method30602(1255229366), arg0.g1(), -452892401);
			switch(local66.anInt5057 * -647640727) {
				case 0:
					if (this.anObjectArray5 == null) {
						this.anObjectArray5 = new Object[local3];
					}
					this.anObjectArray5[arg1] = arg0.gjstr().intern();
					break;
				case 1:
				default:
					throw new RuntimeException();
				case 2:
					if (this.anObjectArray5 == null) {
						this.anObjectArray5 = new Object[local3];
					}
					arg2 = Class557.aClass557_1395;
					this.anObjectArray5[arg1] = arg0.g8();
					break;
				case 3:
					if (this.anIntArray283 == null) {
						this.anIntArray283 = new int[local3];
					}
					arg2 = Class557.aClass557_1034;
					this.anIntArray283[arg1] = arg0.g4();
			}
		} else if (Class557.aClass557_945 == arg2 || Class557.aClass557_297 == arg2) {
			@Pc(137) int local137 = arg0.g2();
			if (this.anObjectArray5 == null) {
				this.anObjectArray5 = new Object[local3];
			}
			this.anObjectArray5[arg1] = this.anInterface21_3.method28381(local137, -1482607674);
			if (this.anIntArray283 == null) {
				this.anIntArray283 = new int[local3];
			}
			this.anIntArray283[arg1] = arg0.g1();
		} else {
			if (this.anIntArray283 == null) {
				this.anIntArray283 = new int[local3];
			}
			if (arg2 != null && arg2.aBoolean914) {
				this.anIntArray283[arg1] = arg0.g4();
			} else {
				this.anIntArray283[arg1] = arg0.g1();
			}
		}
		this.aClass557Array1[arg1] = arg2;
	}

	@OriginalMember(owner = "client!asw", name = "t", descriptor = "(Lclient!ald;[Lclient!sp;S)Lclient!sp;")
	Class557 method23131(@OriginalArg(0) Packet arg0, @OriginalArg(1) Class557[] arg1, @OriginalArg(2) short arg2) {
		@Pc(3) int local3 = arg0.g2();
		if (local3 < 0 || local3 >= arg1.length) {
			throw new RuntimeException("");
		}
		return arg1[local3];
	}

	@OriginalMember(owner = "client!asw", name = "f", descriptor = "(Lclient!ald;B)I")
	int method23132(@OriginalArg(0) Packet arg0, @OriginalArg(1) byte arg1) {
		arg0.pos = (arg0.data.length - 2) * 1034180571;
		@Pc(12) int local12 = arg0.g2();
		@Pc(22) int local22 = arg0.data.length - 2 - local12 - 16;
		arg0.pos = local22 * 1034180571;
		@Pc(31) int local31 = arg0.g4();
		this.anInt3147 = arg0.g2() * 976627951;
		this.anInt3146 = arg0.g2() * -342494155;
		this.anInt3148 = arg0.g2() * -1933563403;
		this.anInt3145 = arg0.g2() * -1062253659;
		this.anInt3149 = arg0.g2() * 110736415;
		this.anInt3150 = arg0.g2() * -1842918437;
		@Pc(77) int local77 = arg0.g1();
		if (local77 > 0) {
			this.aClass24Array1 = new Class24[local77];
			for (@Pc(85) int local85 = 0; local85 < local77; local85++) {
				@Pc(92) int local92 = arg0.g2();
				@Pc(103) Class24 local103 = new Class24(local92 > 0 ? Class700.method37081(local92, (byte) 9) : 1);
				this.aClass24Array1[local85] = local103;
				while (local92-- > 0) {
					@Pc(115) int local115 = arg0.g4();
					@Pc(119) int local119 = arg0.g4();
					local103.method563(new Class80_Sub20(local119), (long) local115);
				}
			}
		}
		arg0.pos = 0;
		this.aString116 = arg0.fastgstr();
		this.aClass557Array1 = new Class557[local31];
		return local22;
	}

	@OriginalMember(owner = "client!asw", name = "j", descriptor = "(Lclient!ald;ILclient!sp;)V")
	void method23133(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class557 arg2) {
		@Pc(3) int local3 = this.aClass557Array1.length;
		if (Class557.aClass557_1132 == arg2 || Class557.aClass557_3 == arg2) {
			@Pc(18) Class143 local18 = (Class143) Class80_Sub39.method15030(Class143.method11832(1563921586), arg0.g1(), -1256264571);
			@Pc(22) int local22 = arg0.g2();
			if (this.anObjectArray5 == null) {
				this.anObjectArray5 = new Object[local3];
			}
			this.anObjectArray5[arg1] = this.anInterface21_3.method28382(local18, local22, 554509745);
			if (this.anIntArray283 == null) {
				this.anIntArray283 = new int[local3];
			}
			this.anIntArray283[arg1] = arg0.g1();
		} else if (arg2 == Class557.aClass557_6) {
			@Pc(66) Class519 local66 = (Class519) Class80_Sub39.method15030(Class519.method30602(1255229366), arg0.g1(), -2036903788);
			switch(local66.anInt5057 * -647640727) {
				case 0:
					if (this.anObjectArray5 == null) {
						this.anObjectArray5 = new Object[local3];
					}
					this.anObjectArray5[arg1] = arg0.gjstr().intern();
					break;
				case 1:
				default:
					throw new RuntimeException();
				case 2:
					if (this.anObjectArray5 == null) {
						this.anObjectArray5 = new Object[local3];
					}
					arg2 = Class557.aClass557_1395;
					this.anObjectArray5[arg1] = arg0.g8();
					break;
				case 3:
					if (this.anIntArray283 == null) {
						this.anIntArray283 = new int[local3];
					}
					arg2 = Class557.aClass557_1034;
					this.anIntArray283[arg1] = arg0.g4();
			}
		} else if (Class557.aClass557_945 == arg2 || Class557.aClass557_297 == arg2) {
			@Pc(137) int local137 = arg0.g2();
			if (this.anObjectArray5 == null) {
				this.anObjectArray5 = new Object[local3];
			}
			this.anObjectArray5[arg1] = this.anInterface21_3.method28381(local137, -1482607674);
			if (this.anIntArray283 == null) {
				this.anIntArray283 = new int[local3];
			}
			this.anIntArray283[arg1] = arg0.g1();
		} else {
			if (this.anIntArray283 == null) {
				this.anIntArray283 = new int[local3];
			}
			if (arg2 != null && arg2.aBoolean914) {
				this.anIntArray283[arg1] = arg0.g4();
			} else {
				this.anIntArray283[arg1] = arg0.g1();
			}
		}
		this.aClass557Array1[arg1] = arg2;
	}

	@OriginalMember(owner = "client!asw", name = "u", descriptor = "(Lclient!ald;[Lclient!sp;)Lclient!sp;")
	Class557 method23134(@OriginalArg(0) Packet arg0, @OriginalArg(1) Class557[] arg1) {
		@Pc(3) int local3 = arg0.g2();
		if (local3 < 0 || local3 >= arg1.length) {
			throw new RuntimeException("");
		}
		return arg1[local3];
	}

	@OriginalMember(owner = "client!asw", name = "e", descriptor = "(Lclient!ald;ILclient!sp;B)V")
	void method23135(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class557 arg2, @OriginalArg(3) byte arg3) {
		@Pc(3) int local3 = this.aClass557Array1.length;
		if (Class557.aClass557_1132 == arg2 || Class557.aClass557_3 == arg2) {
			@Pc(18) Class143 local18 = (Class143) Class80_Sub39.method15030(Class143.method11832(1480812558), arg0.g1(), -1804385216);
			@Pc(22) int local22 = arg0.g2();
			if (this.anObjectArray5 == null) {
				this.anObjectArray5 = new Object[local3];
			}
			this.anObjectArray5[arg1] = this.anInterface21_3.method28382(local18, local22, 443242596);
			if (this.anIntArray283 == null) {
				this.anIntArray283 = new int[local3];
			}
			this.anIntArray283[arg1] = arg0.g1();
		} else if (arg2 == Class557.aClass557_6) {
			@Pc(66) Class519 local66 = (Class519) Class80_Sub39.method15030(Class519.method30602(1255229366), arg0.g1(), -1407456739);
			switch(local66.anInt5057 * -647640727) {
				case 0:
					if (this.anObjectArray5 == null) {
						this.anObjectArray5 = new Object[local3];
					}
					this.anObjectArray5[arg1] = arg0.gjstr().intern();
					break;
				case 1:
				default:
					throw new RuntimeException();
				case 2:
					if (this.anObjectArray5 == null) {
						this.anObjectArray5 = new Object[local3];
					}
					arg2 = Class557.aClass557_1395;
					this.anObjectArray5[arg1] = arg0.g8();
					break;
				case 3:
					if (this.anIntArray283 == null) {
						this.anIntArray283 = new int[local3];
					}
					arg2 = Class557.aClass557_1034;
					this.anIntArray283[arg1] = arg0.g4();
			}
		} else if (Class557.aClass557_945 == arg2 || Class557.aClass557_297 == arg2) {
			@Pc(137) int local137 = arg0.g2();
			if (this.anObjectArray5 == null) {
				this.anObjectArray5 = new Object[local3];
			}
			this.anObjectArray5[arg1] = this.anInterface21_3.method28381(local137, -1482607674);
			if (this.anIntArray283 == null) {
				this.anIntArray283 = new int[local3];
			}
			this.anIntArray283[arg1] = arg0.g1();
		} else {
			if (this.anIntArray283 == null) {
				this.anIntArray283 = new int[local3];
			}
			if (arg2 != null && arg2.aBoolean914) {
				this.anIntArray283[arg1] = arg0.g4();
			} else {
				this.anIntArray283[arg1] = arg0.g1();
			}
		}
		this.aClass557Array1[arg1] = arg2;
	}

	@OriginalMember(owner = "client!asw", name = "g", descriptor = "(Lclient!ald;[Lclient!sp;)Lclient!sp;")
	Class557 method23136(@OriginalArg(0) Packet arg0, @OriginalArg(1) Class557[] arg1) {
		@Pc(3) int local3 = arg0.g2();
		if (local3 < 0 || local3 >= arg1.length) {
			throw new RuntimeException("");
		}
		return arg1[local3];
	}

	@OriginalMember(owner = "client!asw", name = "i", descriptor = "(Lclient!ald;)I")
	int method23137(@OriginalArg(0) Packet arg0) {
		arg0.pos = (arg0.data.length - 2) * 1034180571;
		@Pc(12) int local12 = arg0.g2();
		@Pc(22) int local22 = arg0.data.length - 2 - local12 - 16;
		arg0.pos = local22 * 1034180571;
		@Pc(31) int local31 = arg0.g4();
		this.anInt3147 = arg0.g2() * 976627951;
		this.anInt3146 = arg0.g2() * -342494155;
		this.anInt3148 = arg0.g2() * -1933563403;
		this.anInt3145 = arg0.g2() * -1062253659;
		this.anInt3149 = arg0.g2() * 110736415;
		this.anInt3150 = arg0.g2() * -1842918437;
		@Pc(77) int local77 = arg0.g1();
		if (local77 > 0) {
			this.aClass24Array1 = new Class24[local77];
			for (@Pc(85) int local85 = 0; local85 < local77; local85++) {
				@Pc(92) int local92 = arg0.g2();
				@Pc(103) Class24 local103 = new Class24(local92 > 0 ? Class700.method37081(local92, (byte) 9) : 1);
				this.aClass24Array1[local85] = local103;
				while (local92-- > 0) {
					@Pc(115) int local115 = arg0.g4();
					@Pc(119) int local119 = arg0.g4();
					local103.method563(new Class80_Sub20(local119), (long) local115);
				}
			}
		}
		arg0.pos = 0;
		this.aString116 = arg0.fastgstr();
		this.aClass557Array1 = new Class557[local31];
		return local22;
	}

	@OriginalMember(owner = "client!asw", name = "l", descriptor = "(Lclient!ald;[Lclient!sp;)Lclient!sp;")
	Class557 method23138(@OriginalArg(0) Packet arg0, @OriginalArg(1) Class557[] arg1) {
		@Pc(3) int local3 = arg0.g2();
		if (local3 < 0 || local3 >= arg1.length) {
			throw new RuntimeException("");
		}
		return arg1[local3];
	}

	@OriginalMember(owner = "client!asw", name = "m", descriptor = "(Lclient!ald;)I")
	int method23139(@OriginalArg(0) Packet arg0) {
		arg0.pos = (arg0.data.length - 2) * 1034180571;
		@Pc(12) int local12 = arg0.g2();
		@Pc(22) int local22 = arg0.data.length - 2 - local12 - 16;
		arg0.pos = local22 * 1034180571;
		@Pc(31) int local31 = arg0.g4();
		this.anInt3147 = arg0.g2() * 976627951;
		this.anInt3146 = arg0.g2() * -342494155;
		this.anInt3148 = arg0.g2() * -1933563403;
		this.anInt3145 = arg0.g2() * -1062253659;
		this.anInt3149 = arg0.g2() * 110736415;
		this.anInt3150 = arg0.g2() * -1842918437;
		@Pc(77) int local77 = arg0.g1();
		if (local77 > 0) {
			this.aClass24Array1 = new Class24[local77];
			for (@Pc(85) int local85 = 0; local85 < local77; local85++) {
				@Pc(92) int local92 = arg0.g2();
				@Pc(103) Class24 local103 = new Class24(local92 > 0 ? Class700.method37081(local92, (byte) 9) : 1);
				this.aClass24Array1[local85] = local103;
				while (local92-- > 0) {
					@Pc(115) int local115 = arg0.g4();
					@Pc(119) int local119 = arg0.g4();
					local103.method563(new Class80_Sub20(local119), (long) local115);
				}
			}
		}
		arg0.pos = 0;
		this.aString116 = arg0.fastgstr();
		this.aClass557Array1 = new Class557[local31];
		return local22;
	}
}
