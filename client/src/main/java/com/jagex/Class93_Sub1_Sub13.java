package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!asc")
public class Class93_Sub1_Sub13 extends Class93_Sub1 {

	@OriginalMember(owner = "client!asc", name = "y", descriptor = "I")
	public int anInt3063;

	@OriginalMember(owner = "client!asc", name = "u", descriptor = "Ljava/lang/String;")
	public String aString106;

	@OriginalMember(owner = "client!asc", name = "d", descriptor = "[Ljava/lang/Object;")
	public Object[] anObjectArray5;

	@OriginalMember(owner = "client!asc", name = "p", descriptor = "[I")
	public int[] anIntArray259;

	@OriginalMember(owner = "client!asc", name = "r", descriptor = "I")
	public int anInt3064;

	@OriginalMember(owner = "client!asc", name = "z", descriptor = "[Lclient!ss;")
	public Class560[] aClass560Array1;

	@OriginalMember(owner = "client!asc", name = "c", descriptor = "I")
	public int anInt3065;

	@OriginalMember(owner = "client!asc", name = "v", descriptor = "I")
	public int anInt3066;

	@OriginalMember(owner = "client!asc", name = "o", descriptor = "I")
	public int anInt3067;

	@OriginalMember(owner = "client!asc", name = "l", descriptor = "Lclient!uh;")
	public Class155 aClass155_70;

	@OriginalMember(owner = "client!asc", name = "s", descriptor = "I")
	public int anInt3068;

	@OriginalMember(owner = "client!asc", name = "q", descriptor = "[Lclient!aan;")
	public Class16[] aClass16Array1;

	@OriginalMember(owner = "client!asc", name = "x", descriptor = "Lclient!em;")
	final Interface21 anInterface21_3;

	@OriginalMember(owner = "client!asc", name = "<init>", descriptor = "(Lclient!alw;Lclient!em;)V", line = 30)
	public Class93_Sub1_Sub13(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) Interface21 arg1) {
		this.anInterface21_3 = arg1;
		@Pc(9) int local9 = this.method22340(arg0, -859237659);
		@Pc(11) int local11 = 0;
		@Pc(14) Class560[] local14 = Class527.method30389(876646170);
		while (arg0.anInt3070 * 212851357 < local9) {
			@Pc(26) Class560 local26 = this.method22338(arg0, local14, 1162488305);
			this.method22344(arg0, local11, local26, 86309278);
			local11++;
		}
	}

	@OriginalMember(owner = "client!asc", name = "e", descriptor = "(Lclient!alw;[Lclient!ss;I)Lclient!ss;", line = 43)
	Class560 method22338(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) Class560[] arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0.method22472(-1434290800);
		if (local3 < 0 || local3 >= arg1.length) {
			throw new RuntimeException("");
		}
		return arg1[local3];
	}

	@OriginalMember(owner = "client!asc", name = "k", descriptor = "(Lclient!alw;[Lclient!ss;)Lclient!ss;", line = 43)
	Class560 method22339(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) Class560[] arg1) {
		@Pc(3) int local3 = arg0.method22472(-1434290800);
		if (local3 < 0 || local3 >= arg1.length) {
			throw new RuntimeException("");
		}
		return arg1[local3];
	}

	@OriginalMember(owner = "client!asc", name = "n", descriptor = "(Lclient!alw;I)I", line = 52)
	int method22340(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt3070 = (arg0.aByteArray58.length - 2) * -1445626955;
		@Pc(12) int local12 = arg0.method22472(-1434290800);
		@Pc(22) int local22 = arg0.aByteArray58.length - 2 - local12 - 16;
		arg0.anInt3070 = local22 * -1445626955;
		@Pc(31) int local31 = arg0.method22483(-118643075);
		this.anInt3065 = arg0.method22472(-1434290800) * 1021108073;
		this.anInt3064 = arg0.method22472(-1434290800) * 1216778353;
		this.anInt3066 = arg0.method22472(-1434290800) * 2025161781;
		this.anInt3067 = arg0.method22472(-1434290800) * 1141903489;
		this.anInt3068 = arg0.method22472(-1434290800) * -116941733;
		this.anInt3063 = arg0.method22472(-1434290800) * -14211277;
		@Pc(77) int local77 = arg0.method22465((short) 16384);
		if (local77 > 0) {
			this.aClass16Array1 = new Class16[local77];
			for (@Pc(85) int local85 = 0; local85 < local77; local85++) {
				@Pc(92) int local92 = arg0.method22472(-1434290800);
				@Pc(103) Class16 local103 = new Class16(local92 > 0 ? Class134_Sub2.method10207(local92, (byte) 121) : 1);
				this.aClass16Array1[local85] = local103;
				while (local92-- > 0) {
					@Pc(115) int local115 = arg0.method22483(-118643075);
					@Pc(119) int local119 = arg0.method22483(-118643075);
					local103.method220(new Class93_Sub14(local119), (long) local115);
				}
			}
		}
		arg0.anInt3070 = 0;
		this.aString106 = arg0.method22507((byte) 15);
		this.aClass560Array1 = new Class560[local31];
		return local22;
	}

	@OriginalMember(owner = "client!asc", name = "f", descriptor = "(Lclient!alw;)I", line = 52)
	int method22341(@OriginalArg(0) Class93_Sub41 arg0) {
		arg0.anInt3070 = (arg0.aByteArray58.length - 2) * -1445626955;
		@Pc(12) int local12 = arg0.method22472(-1434290800);
		@Pc(22) int local22 = arg0.aByteArray58.length - 2 - local12 - 16;
		arg0.anInt3070 = local22 * -1445626955;
		@Pc(31) int local31 = arg0.method22483(-118643075);
		this.anInt3065 = arg0.method22472(-1434290800) * 1021108073;
		this.anInt3064 = arg0.method22472(-1434290800) * 1216778353;
		this.anInt3066 = arg0.method22472(-1434290800) * 2025161781;
		this.anInt3067 = arg0.method22472(-1434290800) * 1141903489;
		this.anInt3068 = arg0.method22472(-1434290800) * -116941733;
		this.anInt3063 = arg0.method22472(-1434290800) * -14211277;
		@Pc(77) int local77 = arg0.method22465((short) 16384);
		if (local77 > 0) {
			this.aClass16Array1 = new Class16[local77];
			for (@Pc(85) int local85 = 0; local85 < local77; local85++) {
				@Pc(92) int local92 = arg0.method22472(-1434290800);
				@Pc(103) Class16 local103 = new Class16(local92 > 0 ? Class134_Sub2.method10207(local92, (byte) 75) : 1);
				this.aClass16Array1[local85] = local103;
				while (local92-- > 0) {
					@Pc(115) int local115 = arg0.method22483(-118643075);
					@Pc(119) int local119 = arg0.method22483(-118643075);
					local103.method220(new Class93_Sub14(local119), (long) local115);
				}
			}
		}
		arg0.anInt3070 = 0;
		this.aString106 = arg0.method22507((byte) 15);
		this.aClass560Array1 = new Class560[local31];
		return local22;
	}

	@OriginalMember(owner = "client!asc", name = "w", descriptor = "(Lclient!alw;)I", line = 52)
	int method22342(@OriginalArg(0) Class93_Sub41 arg0) {
		arg0.anInt3070 = (arg0.aByteArray58.length - 2) * -1445626955;
		@Pc(12) int local12 = arg0.method22472(-1434290800);
		@Pc(22) int local22 = arg0.aByteArray58.length - 2 - local12 - 16;
		arg0.anInt3070 = local22 * -1445626955;
		@Pc(31) int local31 = arg0.method22483(-118643075);
		this.anInt3065 = arg0.method22472(-1434290800) * 1021108073;
		this.anInt3064 = arg0.method22472(-1434290800) * 1216778353;
		this.anInt3066 = arg0.method22472(-1434290800) * 2025161781;
		this.anInt3067 = arg0.method22472(-1434290800) * 1141903489;
		this.anInt3068 = arg0.method22472(-1434290800) * -116941733;
		this.anInt3063 = arg0.method22472(-1434290800) * -14211277;
		@Pc(77) int local77 = arg0.method22465((short) 16384);
		if (local77 > 0) {
			this.aClass16Array1 = new Class16[local77];
			for (@Pc(85) int local85 = 0; local85 < local77; local85++) {
				@Pc(92) int local92 = arg0.method22472(-1434290800);
				@Pc(103) Class16 local103 = new Class16(local92 > 0 ? Class134_Sub2.method10207(local92, (byte) 96) : 1);
				this.aClass16Array1[local85] = local103;
				while (local92-- > 0) {
					@Pc(115) int local115 = arg0.method22483(-118643075);
					@Pc(119) int local119 = arg0.method22483(-118643075);
					local103.method220(new Class93_Sub14(local119), (long) local115);
				}
			}
		}
		arg0.anInt3070 = 0;
		this.aString106 = arg0.method22507((byte) 85);
		this.aClass560Array1 = new Class560[local31];
		return local22;
	}

	@OriginalMember(owner = "client!asc", name = "l", descriptor = "(Lclient!alw;)I", line = 52)
	int method22343(@OriginalArg(0) Class93_Sub41 arg0) {
		arg0.anInt3070 = (arg0.aByteArray58.length - 2) * -1445626955;
		@Pc(12) int local12 = arg0.method22472(-1434290800);
		@Pc(22) int local22 = arg0.aByteArray58.length - 2 - local12 - 16;
		arg0.anInt3070 = local22 * -1445626955;
		@Pc(31) int local31 = arg0.method22483(-118643075);
		this.anInt3065 = arg0.method22472(-1434290800) * 1021108073;
		this.anInt3064 = arg0.method22472(-1434290800) * 1216778353;
		this.anInt3066 = arg0.method22472(-1434290800) * 2025161781;
		this.anInt3067 = arg0.method22472(-1434290800) * 1141903489;
		this.anInt3068 = arg0.method22472(-1434290800) * -116941733;
		this.anInt3063 = arg0.method22472(-1434290800) * -14211277;
		@Pc(77) int local77 = arg0.method22465((short) 16384);
		if (local77 > 0) {
			this.aClass16Array1 = new Class16[local77];
			for (@Pc(85) int local85 = 0; local85 < local77; local85++) {
				@Pc(92) int local92 = arg0.method22472(-1434290800);
				@Pc(103) Class16 local103 = new Class16(local92 > 0 ? Class134_Sub2.method10207(local92, (byte) 20) : 1);
				this.aClass16Array1[local85] = local103;
				while (local92-- > 0) {
					@Pc(115) int local115 = arg0.method22483(-118643075);
					@Pc(119) int local119 = arg0.method22483(-118643075);
					local103.method220(new Class93_Sub14(local119), (long) local115);
				}
			}
		}
		arg0.anInt3070 = 0;
		this.aString106 = arg0.method22507((byte) 55);
		this.aClass560Array1 = new Class560[local31];
		return local22;
	}

	@OriginalMember(owner = "client!asc", name = "m", descriptor = "(Lclient!alw;ILclient!ss;I)V", line = 84)
	void method22344(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class560 arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3 = this.aClass560Array1.length;
		if (arg2 == Class560.aClass560_799 || arg2 == Class560.aClass560_513) {
			@Pc(18) Class138 local18 = (Class138) Class107.method18116(Class138.method11522(700594235), arg0.method22465((short) 16384), -1915563430);
			@Pc(22) int local22 = arg0.method22472(-1434290800);
			if (this.anObjectArray5 == null) {
				this.anObjectArray5 = new Object[local3];
			}
			this.anObjectArray5[arg1] = this.anInterface21_3.method27954(local18, local22, -1497248091);
			if (this.anIntArray259 == null) {
				this.anIntArray259 = new int[local3];
			}
			this.anIntArray259[arg1] = arg0.method22465((short) 16384);
		} else if (Class560.aClass560_6 == arg2) {
			@Pc(68) Class500 local68 = (Class500) Class107.method18116(Class500.method30156(-1706625330), arg0.method22465((short) 16384), -1915563430);
			switch(local68.anInt5196 * -1217885029) {
				case 1:
					if (this.anObjectArray5 == null) {
						this.anObjectArray5 = new Object[local3];
					}
					this.anObjectArray5[arg1] = arg0.method22509(2127243193).intern();
					break;
				case 2:
					if (this.anIntArray259 == null) {
						this.anIntArray259 = new int[local3];
					}
					arg2 = Class560.aClass560_325;
					this.anIntArray259[arg1] = arg0.method22483(-118643075);
					break;
				case 3:
				default:
					throw new RuntimeException();
				case 4:
					if (this.anObjectArray5 == null) {
						this.anObjectArray5 = new Object[local3];
					}
					arg2 = Class560.aClass560_26;
					this.anObjectArray5[arg1] = arg0.method22495(199402262);
			}
		} else if (arg2 == Class560.aClass560_4 || Class560.aClass560_5 == arg2) {
			@Pc(139) int local139 = arg0.method22472(-1434290800);
			if (this.anObjectArray5 == null) {
				this.anObjectArray5 = new Object[local3];
			}
			this.anObjectArray5[arg1] = this.anInterface21_3.method27953(local139, (byte) -51);
			if (this.anIntArray259 == null) {
				this.anIntArray259 = new int[local3];
			}
			this.anIntArray259[arg1] = arg0.method22465((short) 16384);
		} else {
			if (this.anIntArray259 == null) {
				this.anIntArray259 = new int[local3];
			}
			if (arg2 != null && arg2.aBoolean809) {
				this.anIntArray259[arg1] = arg0.method22483(-118643075);
			} else {
				this.anIntArray259[arg1] = arg0.method22465((short) 16384);
			}
		}
		this.aClass560Array1[arg1] = arg2;
	}

	@OriginalMember(owner = "client!asc", name = "u", descriptor = "(Lclient!alw;ILclient!ss;)V", line = 84)
	void method22345(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class560 arg2) {
		@Pc(3) int local3 = this.aClass560Array1.length;
		if (arg2 == Class560.aClass560_799 || arg2 == Class560.aClass560_513) {
			@Pc(18) Class138 local18 = (Class138) Class107.method18116(Class138.method11522(1850021684), arg0.method22465((short) 16384), -1915563430);
			@Pc(22) int local22 = arg0.method22472(-1434290800);
			if (this.anObjectArray5 == null) {
				this.anObjectArray5 = new Object[local3];
			}
			this.anObjectArray5[arg1] = this.anInterface21_3.method27954(local18, local22, -1497248091);
			if (this.anIntArray259 == null) {
				this.anIntArray259 = new int[local3];
			}
			this.anIntArray259[arg1] = arg0.method22465((short) 16384);
		} else if (Class560.aClass560_6 == arg2) {
			@Pc(68) Class500 local68 = (Class500) Class107.method18116(Class500.method30156(-1731000292), arg0.method22465((short) 16384), -1915563430);
			switch(local68.anInt5196 * -1217885029) {
				case 1:
					if (this.anObjectArray5 == null) {
						this.anObjectArray5 = new Object[local3];
					}
					this.anObjectArray5[arg1] = arg0.method22509(1650714087).intern();
					break;
				case 2:
					if (this.anIntArray259 == null) {
						this.anIntArray259 = new int[local3];
					}
					arg2 = Class560.aClass560_325;
					this.anIntArray259[arg1] = arg0.method22483(-118643075);
					break;
				case 3:
				default:
					throw new RuntimeException();
				case 4:
					if (this.anObjectArray5 == null) {
						this.anObjectArray5 = new Object[local3];
					}
					arg2 = Class560.aClass560_26;
					this.anObjectArray5[arg1] = arg0.method22495(-69510889);
			}
		} else if (arg2 == Class560.aClass560_4 || Class560.aClass560_5 == arg2) {
			@Pc(139) int local139 = arg0.method22472(-1434290800);
			if (this.anObjectArray5 == null) {
				this.anObjectArray5 = new Object[local3];
			}
			this.anObjectArray5[arg1] = this.anInterface21_3.method27953(local139, (byte) -124);
			if (this.anIntArray259 == null) {
				this.anIntArray259 = new int[local3];
			}
			this.anIntArray259[arg1] = arg0.method22465((short) 16384);
		} else {
			if (this.anIntArray259 == null) {
				this.anIntArray259 = new int[local3];
			}
			if (arg2 != null && arg2.aBoolean809) {
				this.anIntArray259[arg1] = arg0.method22483(-118643075);
			} else {
				this.anIntArray259[arg1] = arg0.method22465((short) 16384);
			}
		}
		this.aClass560Array1[arg1] = arg2;
	}

	@OriginalMember(owner = "client!asc", name = "z", descriptor = "(Lclient!alw;ILclient!ss;)V", line = 84)
	void method22346(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class560 arg2) {
		@Pc(3) int local3 = this.aClass560Array1.length;
		if (arg2 == Class560.aClass560_799 || arg2 == Class560.aClass560_513) {
			@Pc(18) Class138 local18 = (Class138) Class107.method18116(Class138.method11522(727415029), arg0.method22465((short) 16384), -1915563430);
			@Pc(22) int local22 = arg0.method22472(-1434290800);
			if (this.anObjectArray5 == null) {
				this.anObjectArray5 = new Object[local3];
			}
			this.anObjectArray5[arg1] = this.anInterface21_3.method27954(local18, local22, -1497248091);
			if (this.anIntArray259 == null) {
				this.anIntArray259 = new int[local3];
			}
			this.anIntArray259[arg1] = arg0.method22465((short) 16384);
		} else if (Class560.aClass560_6 == arg2) {
			@Pc(68) Class500 local68 = (Class500) Class107.method18116(Class500.method30156(-2066490338), arg0.method22465((short) 16384), -1915563430);
			switch(local68.anInt5196 * -1217885029) {
				case 1:
					if (this.anObjectArray5 == null) {
						this.anObjectArray5 = new Object[local3];
					}
					this.anObjectArray5[arg1] = arg0.method22509(257452899).intern();
					break;
				case 2:
					if (this.anIntArray259 == null) {
						this.anIntArray259 = new int[local3];
					}
					arg2 = Class560.aClass560_325;
					this.anIntArray259[arg1] = arg0.method22483(-118643075);
					break;
				case 3:
				default:
					throw new RuntimeException();
				case 4:
					if (this.anObjectArray5 == null) {
						this.anObjectArray5 = new Object[local3];
					}
					arg2 = Class560.aClass560_26;
					this.anObjectArray5[arg1] = arg0.method22495(1140699309);
			}
		} else if (arg2 == Class560.aClass560_4 || Class560.aClass560_5 == arg2) {
			@Pc(139) int local139 = arg0.method22472(-1434290800);
			if (this.anObjectArray5 == null) {
				this.anObjectArray5 = new Object[local3];
			}
			this.anObjectArray5[arg1] = this.anInterface21_3.method27953(local139, (byte) -46);
			if (this.anIntArray259 == null) {
				this.anIntArray259 = new int[local3];
			}
			this.anIntArray259[arg1] = arg0.method22465((short) 16384);
		} else {
			if (this.anIntArray259 == null) {
				this.anIntArray259 = new int[local3];
			}
			if (arg2 != null && arg2.aBoolean809) {
				this.anIntArray259[arg1] = arg0.method22483(-118643075);
			} else {
				this.anIntArray259[arg1] = arg0.method22465((short) 16384);
			}
		}
		this.aClass560Array1[arg1] = arg2;
	}

	@OriginalMember(owner = "client!asc", name = "p", descriptor = "(Lclient!alw;ILclient!ss;)V", line = 84)
	void method22347(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class560 arg2) {
		@Pc(3) int local3 = this.aClass560Array1.length;
		if (arg2 == Class560.aClass560_799 || arg2 == Class560.aClass560_513) {
			@Pc(18) Class138 local18 = (Class138) Class107.method18116(Class138.method11522(1185339558), arg0.method22465((short) 16384), -1915563430);
			@Pc(22) int local22 = arg0.method22472(-1434290800);
			if (this.anObjectArray5 == null) {
				this.anObjectArray5 = new Object[local3];
			}
			this.anObjectArray5[arg1] = this.anInterface21_3.method27954(local18, local22, -1497248091);
			if (this.anIntArray259 == null) {
				this.anIntArray259 = new int[local3];
			}
			this.anIntArray259[arg1] = arg0.method22465((short) 16384);
		} else if (Class560.aClass560_6 == arg2) {
			@Pc(68) Class500 local68 = (Class500) Class107.method18116(Class500.method30156(-1916976035), arg0.method22465((short) 16384), -1915563430);
			switch(local68.anInt5196 * -1217885029) {
				case 1:
					if (this.anObjectArray5 == null) {
						this.anObjectArray5 = new Object[local3];
					}
					this.anObjectArray5[arg1] = arg0.method22509(1010229395).intern();
					break;
				case 2:
					if (this.anIntArray259 == null) {
						this.anIntArray259 = new int[local3];
					}
					arg2 = Class560.aClass560_325;
					this.anIntArray259[arg1] = arg0.method22483(-118643075);
					break;
				case 3:
				default:
					throw new RuntimeException();
				case 4:
					if (this.anObjectArray5 == null) {
						this.anObjectArray5 = new Object[local3];
					}
					arg2 = Class560.aClass560_26;
					this.anObjectArray5[arg1] = arg0.method22495(-743358261);
			}
		} else if (arg2 == Class560.aClass560_4 || Class560.aClass560_5 == arg2) {
			@Pc(139) int local139 = arg0.method22472(-1434290800);
			if (this.anObjectArray5 == null) {
				this.anObjectArray5 = new Object[local3];
			}
			this.anObjectArray5[arg1] = this.anInterface21_3.method27953(local139, (byte) -35);
			if (this.anIntArray259 == null) {
				this.anIntArray259 = new int[local3];
			}
			this.anIntArray259[arg1] = arg0.method22465((short) 16384);
		} else {
			if (this.anIntArray259 == null) {
				this.anIntArray259 = new int[local3];
			}
			if (arg2 != null && arg2.aBoolean809) {
				this.anIntArray259[arg1] = arg0.method22483(-118643075);
			} else {
				this.anIntArray259[arg1] = arg0.method22465((short) 16384);
			}
		}
		this.aClass560Array1[arg1] = arg2;
	}
}
