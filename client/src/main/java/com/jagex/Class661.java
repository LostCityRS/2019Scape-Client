package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xi")
public final class Class661 {

	@OriginalMember(owner = "client!xi", name = "t", descriptor = "I")
	static final int anInt5687 = 2000000000;

	@OriginalMember(owner = "client!xi", name = "u", descriptor = "I")
	int anInt5686 = 0;

	@OriginalMember(owner = "client!xi", name = "l", descriptor = "I")
	int anInt5685 = -197200483;

	@OriginalMember(owner = "client!xi", name = "g", descriptor = "I")
	int anInt5688 = 1779340057;

	@OriginalMember(owner = "client!xi", name = "f", descriptor = "Lclient!wv;")
	final Class649 aClass649_1;

	@OriginalMember(owner = "client!xi", name = "e", descriptor = "Z")
	final boolean aBoolean974;

	@OriginalMember(owner = "client!xi", name = "kw", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;I)V")
	static void method33316(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12 = arg2.anIntArray525[(arg2.anInt5778 -= 2036747717) * 1896589581];
		@Pc(25) int local25 = arg2.anIntArray525[(arg2.anInt5778 -= 2036747717) * 1896589581];
		if (local25 >= 1 && local25 <= 10) {
			arg0.method27642(local25 - 1, local12, (byte) 12);
		}
	}

	@OriginalMember(owner = "client!xi", name = "qi", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;I)V")
	static void method33317(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) int arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray46[(arg2.anInt5776 -= -825189621) * -2070619997];
		if (Class619.method32302(local13, arg2, -1791293874) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray9 = Class431.method29089(local13, arg2, 1067022033);
		arg0.aBoolean815 = true;
	}

	@OriginalMember(owner = "client!xi", name = "azw", descriptor = "(Lclient!yp;I)V")
	static void method33318(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class703.aClass80_Sub37_49.aClass165_Sub43_2.method16852(-339960860) && Class279.aClass102_9.method21081() ? 1 : 0;
	}

	@OriginalMember(owner = "client!xi", name = "b", descriptor = "(III)I")
	static int method33319(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) int local5 = arg0 + arg1 * 57;
		@Pc(11) int local11 = local5 << 13 ^ local5;
		@Pc(25) int local25 = local11 * (local11 * 15731 * local11 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return local25 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!xi", name = "e", descriptor = "(Lclient!ald;I)Lclient!lk;")
	public static Class130 method33320(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class130 local3 = Class364.method28214(arg0, (byte) 0);
		@Pc(7) int local7 = arg0.method23181((byte) 9);
		return new Class130_Sub1(local3.anInt1171 * -534993123, local3.aClass391_6, local3.aClass383_6, local3.anInt1172 * -1094014189, local3.anInt1173 * -23088371, local7);
	}

	@OriginalMember(owner = "client!xi", name = "hb", descriptor = "(Lclient!yp;I)V")
	static void method33321(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2092172248);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class519.method30606(local16, local22, arg0, Class322.aClass322_1, 1384765784);
	}

	@OriginalMember(owner = "client!xi", name = "<init>", descriptor = "(Lclient!wv;Z)V")
	public Class661(@OriginalArg(0) Class649 arg0, @OriginalArg(1) boolean arg1) {
		this.aClass649_1 = arg0;
		this.aBoolean974 = arg1;
	}

	@OriginalMember(owner = "client!xi", name = "h", descriptor = "()I")
	public int method33292() {
		return this.anInt5688 * -1068164823;
	}

	@OriginalMember(owner = "client!xi", name = "t", descriptor = "(I)I")
	public int method33293(@OriginalArg(0) int arg0) {
		return this.anInt5686 * 1710997031;
	}

	@OriginalMember(owner = "client!xi", name = "n", descriptor = "()V")
	void method33294() {
		if (this.aBoolean974) {
			this.anInt5685 = this.aClass649_1.method33092(this.anInt5686 * 1710997031, (byte) 0) * -197200483;
		} else {
			this.anInt5685 = this.aClass649_1.method33086(this.anInt5686 * 1710997031, 1199801613) * -197200483;
		}
	}

	@OriginalMember(owner = "client!xi", name = "s", descriptor = "()I")
	public int method33295() {
		return this.anInt5685 * -701876043;
	}

	@OriginalMember(owner = "client!xi", name = "u", descriptor = "(I)I")
	public int method33296(@OriginalArg(0) int arg0) {
		return this.anInt5685 * -701876043;
	}

	@OriginalMember(owner = "client!xi", name = "k", descriptor = "()I")
	public int method33297() {
		return this.anInt5685 * -701876043;
	}

	@OriginalMember(owner = "client!xi", name = "g", descriptor = "(I)I")
	public int method33298(@OriginalArg(0) int arg0) {
		return this.anInt5688 * -1068164823;
	}

	@OriginalMember(owner = "client!xi", name = "i", descriptor = "(II)V")
	public void method33299(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5688 = arg0 * 1779340057;
	}

	@OriginalMember(owner = "client!xi", name = "m", descriptor = "(I)V")
	void method33300(@OriginalArg(0) int arg0) {
		if (this.aBoolean974) {
			this.anInt5685 = this.aClass649_1.method33092(this.anInt5686 * 1710997031, (byte) 0) * -197200483;
		} else {
			this.anInt5685 = this.aClass649_1.method33086(this.anInt5686 * 1710997031, 1650743865) * -197200483;
		}
	}

	@OriginalMember(owner = "client!xi", name = "o", descriptor = "(Lclient!zf;)I")
	public int method33301(@OriginalArg(0) Class705 arg0) {
		if (Class705.aClass705_2 == arg0 && this.aClass649_1.method33082((byte) 42) && this.aClass649_1.method33085(751077600)) {
			@Pc(17) int local17 = this.aClass649_1.method33080(-1438665784);
			if (!this.aBoolean974) {
				local17 /= 10;
			}
			if (this.anInt5686 * 1710997031 > local17) {
				return local17;
			}
		}
		return this.anInt5686 * 1710997031;
	}

	@OriginalMember(owner = "client!xi", name = "j", descriptor = "(I)V")
	public void method33302(@OriginalArg(0) int arg0) {
		this.anInt5686 = arg0 * -608972393;
		if (this.anInt5686 * 1710997031 < 0) {
			this.anInt5686 = 0;
		} else if (this.aBoolean974 && this.anInt5686 * 1710997031 > 2000000000) {
			this.anInt5686 = -1972483072;
		} else if (!this.aBoolean974 && this.anInt5686 * 1710997031 > 200000000) {
			this.anInt5686 = 661745152;
		}
		this.method33300(-1952103169);
	}

	@OriginalMember(owner = "client!xi", name = "a", descriptor = "(I)V")
	public void method33303(@OriginalArg(0) int arg0) {
		this.anInt5686 = arg0 * -608972393;
		if (this.anInt5686 * 1710997031 < 0) {
			this.anInt5686 = 0;
		} else if (this.aBoolean974 && this.anInt5686 * 1710997031 > 2000000000) {
			this.anInt5686 = -1972483072;
		} else if (!this.aBoolean974 && this.anInt5686 * 1710997031 > 200000000) {
			this.anInt5686 = 661745152;
		}
		this.method33300(-748427090);
	}

	@OriginalMember(owner = "client!xi", name = "x", descriptor = "(Lclient!zf;)I")
	public int method33304(@OriginalArg(0) Class705 arg0) {
		if (Class705.aClass705_2 == arg0 && this.aClass649_1.method33082((byte) -77) && this.aClass649_1.method33085(1504174915)) {
			@Pc(17) int local17 = this.aClass649_1.method33084(-543106290);
			if (this.anInt5685 * -701876043 > local17) {
				return local17;
			}
		}
		return this.anInt5685 * -701876043;
	}

	@OriginalMember(owner = "client!xi", name = "y", descriptor = "()V")
	void method33305() {
		if (this.aBoolean974) {
			this.anInt5685 = this.aClass649_1.method33092(this.anInt5686 * 1710997031, (byte) 0) * -197200483;
		} else {
			this.anInt5685 = this.aClass649_1.method33086(this.anInt5686 * 1710997031, 2007739862) * -197200483;
		}
	}

	@OriginalMember(owner = "client!xi", name = "w", descriptor = "(Lclient!zf;)I")
	public int method33306(@OriginalArg(0) Class705 arg0) {
		if (Class705.aClass705_2 == arg0 && this.aClass649_1.method33082((byte) -3) && this.aClass649_1.method33085(-2034677593)) {
			@Pc(17) int local17 = this.aClass649_1.method33084(-959905748);
			if (this.anInt5685 * -701876043 > local17) {
				return local17;
			}
		}
		return this.anInt5685 * -701876043;
	}

	@OriginalMember(owner = "client!xi", name = "r", descriptor = "(Lclient!zf;)I")
	public int method33307(@OriginalArg(0) Class705 arg0) {
		if (Class705.aClass705_2 == arg0 && this.aClass649_1.method33082((byte) 41) && this.aClass649_1.method33085(-12172828)) {
			@Pc(17) int local17 = this.aClass649_1.method33084(-211279464);
			if (this.anInt5685 * -701876043 > local17) {
				return local17;
			}
		}
		return this.anInt5685 * -701876043;
	}

	@OriginalMember(owner = "client!xi", name = "q", descriptor = "()I")
	public int method33308() {
		return this.anInt5688 * -1068164823;
	}

	@OriginalMember(owner = "client!xi", name = "l", descriptor = "(Lclient!zf;I)I")
	public int method33309(@OriginalArg(0) Class705 arg0, @OriginalArg(1) int arg1) {
		if (Class705.aClass705_2 == arg0 && this.aClass649_1.method33082((byte) 66) && this.aClass649_1.method33085(-993939199)) {
			@Pc(17) int local17 = this.aClass649_1.method33084(480170688);
			if (this.anInt5685 * -701876043 > local17) {
				return local17;
			}
		}
		return this.anInt5685 * -701876043;
	}

	@OriginalMember(owner = "client!xi", name = "d", descriptor = "()I")
	public int method33310() {
		return this.anInt5688 * -1068164823;
	}

	@OriginalMember(owner = "client!xi", name = "z", descriptor = "(I)V")
	public void method33311(@OriginalArg(0) int arg0) {
		this.anInt5688 = arg0 * 1779340057;
	}

	@OriginalMember(owner = "client!xi", name = "p", descriptor = "(I)V")
	public void method33312(@OriginalArg(0) int arg0) {
		this.anInt5688 = arg0 * 1779340057;
	}

	@OriginalMember(owner = "client!xi", name = "e", descriptor = "(II)V")
	public void method33313(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5686 = arg0 * -608972393;
		if (this.anInt5686 * 1710997031 < 0) {
			this.anInt5686 = 0;
		} else if (this.aBoolean974 && this.anInt5686 * 1710997031 > 2000000000) {
			this.anInt5686 = -1972483072;
		} else if (!this.aBoolean974 && this.anInt5686 * 1710997031 > 200000000) {
			this.anInt5686 = 661745152;
		}
		this.method33300(-551214500);
	}

	@OriginalMember(owner = "client!xi", name = "f", descriptor = "(Lclient!zf;I)I")
	public int method33314(@OriginalArg(0) Class705 arg0, @OriginalArg(1) int arg1) {
		if (Class705.aClass705_2 == arg0 && this.aClass649_1.method33082((byte) -36) && this.aClass649_1.method33085(767190760)) {
			@Pc(17) int local17 = this.aClass649_1.method33080(-1879950893);
			if (!this.aBoolean974) {
				local17 /= 10;
			}
			if (this.anInt5686 * 1710997031 > local17) {
				return local17;
			}
		}
		return this.anInt5686 * 1710997031;
	}

	@OriginalMember(owner = "client!xi", name = "v", descriptor = "(I)V")
	public void method33315(@OriginalArg(0) int arg0) {
		this.anInt5688 = arg0 * 1779340057;
	}
}
