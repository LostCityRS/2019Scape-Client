package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class458 {

	@OriginalMember(owner = "client!oe", name = "z", descriptor = "I")
	static final int anInt5226 = 128;

	@OriginalMember(owner = "client!oe", name = "n", descriptor = "I")
	static final int anInt5227 = 1;

	@OriginalMember(owner = "client!oe", name = "m", descriptor = "I")
	static final int anInt5228 = 2;

	@OriginalMember(owner = "client!oe", name = "u", descriptor = "I")
	static final int anInt5229 = 64;

	@OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
	static final int anInt5230 = 8;

	@OriginalMember(owner = "client!oe", name = "w", descriptor = "I")
	static final int anInt5231 = 16;

	@OriginalMember(owner = "client!oe", name = "e", descriptor = "Z")
	public static final boolean aBoolean784 = true;

	@OriginalMember(owner = "client!oe", name = "l", descriptor = "I")
	static final int anInt5232 = 32;

	@OriginalMember(owner = "client!oe", name = "k", descriptor = "I")
	static final int anInt5233 = 4;

	@OriginalMember(owner = "client!oe", name = "p", descriptor = "Lclient!ov;")
	public Class471 aClass471_5;

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "Lclient!ox;")
	public Class472 aClass472_61;

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "Lclient!ox;")
	Class472 aClass472_62;

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V")
	public Class458() {
		this.aClass471_5 = new Class471();
		this.aClass472_61 = new Class472();
		this.aClass472_62 = new Class472(1.0F, 1.0F, 1.0F);
	}

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(Lclient!oe;)V")
	public Class458(@OriginalArg(0) Class458 arg0) {
		this();
		this.method29344(arg0);
	}

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(Lclient!alw;Z)V")
	public Class458(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) boolean arg1) {
		this.method29342(arg0, arg1);
	}

	@OriginalMember(owner = "client!oe", name = "p", descriptor = "(Lclient!oe;)V")
	public void method29341(@OriginalArg(0) Class458 arg0) {
		this.aClass471_5.method29645(arg0.aClass471_5);
		this.aClass472_61.method29719(arg0.aClass472_61);
		this.aClass472_62.method29719(arg0.aClass472_62);
	}

	@OriginalMember(owner = "client!oe", name = "e", descriptor = "(Lclient!alw;Z)V")
	void method29342(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			this.method29349(arg0);
		} else {
			this.aClass471_5 = new Class471(arg0);
			this.aClass472_61 = new Class472(arg0);
			this.aClass472_62 = new Class472(arg0);
		}
	}

	@OriginalMember(owner = "client!oe", name = "rj", descriptor = "()Ljava/lang/String;")
	public String method29343() {
		return "[" + this.aClass471_5.toString() + "|" + this.aClass472_61.toString() + "|" + this.aClass472_62.toString() + "]";
	}

	@OriginalMember(owner = "client!oe", name = "m", descriptor = "(Lclient!oe;)V")
	public void method29344(@OriginalArg(0) Class458 arg0) {
		this.aClass471_5.method29645(arg0.aClass471_5);
		this.aClass472_61.method29719(arg0.aClass472_61);
		this.aClass472_62.method29719(arg0.aClass472_62);
	}

	@OriginalMember(owner = "client!oe", name = "k", descriptor = "()V")
	public void method29345() {
		this.aClass471_5.method29651();
		this.aClass472_61.method29721();
		this.aClass472_61.method29753(this.aClass471_5);
		this.aClass472_62.aFloat325 = 1.0F / this.aClass472_62.aFloat325;
		this.aClass472_62.aFloat326 = 1.0F / this.aClass472_62.aFloat326;
		this.aClass472_62.aFloat327 = 1.0F / this.aClass472_62.aFloat327;
	}

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "()V")
	public void method29346() {
		this.aClass471_5.method29651();
		this.aClass472_61.method29721();
		this.aClass472_61.method29753(this.aClass471_5);
		this.aClass472_62.aFloat325 = 1.0F / this.aClass472_62.aFloat325;
		this.aClass472_62.aFloat326 = 1.0F / this.aClass472_62.aFloat326;
		this.aClass472_62.aFloat327 = 1.0F / this.aClass472_62.aFloat327;
	}

	@OriginalMember(owner = "client!oe", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "[" + this.aClass471_5.toString() + "|" + this.aClass472_61.toString() + "|" + this.aClass472_62.toString() + "]";
	}

	@OriginalMember(owner = "client!oe", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0 == this) {
			return true;
		} else if (arg0 instanceof Class458) {
			@Pc(14) Class458 local14 = (Class458) arg0;
			return this.aClass471_5.equals(local14.aClass471_5) && this.aClass472_61.method29715(local14.aClass472_61) && this.aClass472_62.method29715(local14.aClass472_62);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!oe", name = "rp", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method29347(@OriginalArg(0) Object arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0 == this) {
			return true;
		} else if (arg0 instanceof Class458) {
			@Pc(14) Class458 local14 = (Class458) arg0;
			return this.aClass471_5.equals(local14.aClass471_5) && this.aClass472_61.method29715(local14.aClass472_61) && this.aClass472_62.method29715(local14.aClass472_62);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!oe", name = "ro", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method29348(@OriginalArg(0) Object arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0 == this) {
			return true;
		} else if (arg0 instanceof Class458) {
			@Pc(14) Class458 local14 = (Class458) arg0;
			return this.aClass471_5.equals(local14.aClass471_5) && this.aClass472_61.method29715(local14.aClass472_61) && this.aClass472_62.method29715(local14.aClass472_62);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!oe", name = "n", descriptor = "(Lclient!alw;)V")
	void method29349(@OriginalArg(0) Class93_Sub41 arg0) {
		@Pc(3) int local3 = arg0.method22425((short) 16384);
		@Pc(5) float local5 = 0.0F;
		@Pc(7) float local7 = 0.0F;
		@Pc(9) float local9 = 0.0F;
		@Pc(11) float local11 = 1.0F;
		if ((local3 & 0x1) != 0) {
			local5 = (float) arg0.method22494((byte) -22) / 32768.0F;
			local7 = (float) arg0.method22494((byte) -94) / 32768.0F;
			local9 = (float) arg0.method22494((byte) -95) / 32768.0F;
			local11 = (float) arg0.method22494((byte) -108) / 32768.0F;
		}
		this.aClass471_5 = new Class471(local5, local7, local9, local11);
		@Pc(54) float local54 = 0.0F;
		@Pc(56) float local56 = 0.0F;
		@Pc(58) float local58 = 0.0F;
		if ((local3 & 0x2) != 0) {
			local54 = arg0.method22494((byte) -105);
		}
		if ((local3 & 0x4) != 0) {
			local56 = arg0.method22494((byte) -55);
		}
		if ((local3 & 0x8) != 0) {
			local58 = arg0.method22494((byte) -95);
		}
		this.aClass472_61 = new Class472(local54, local56, local58);
		@Pc(95) float local95 = 1.0F;
		@Pc(97) float local97 = 1.0F;
		@Pc(99) float local99 = 1.0F;
		if ((local3 & 0x10) == 0) {
			if ((local3 & 0x20) != 0) {
				local95 = (float) arg0.method22494((byte) -38) / 128.0F;
			}
			if ((local3 & 0x40) != 0) {
				local97 = (float) arg0.method22494((byte) -92) / 128.0F;
			}
			if ((local3 & 0x80) != 0) {
				local99 = (float) arg0.method22494((byte) -9) / 128.0F;
			}
		} else {
			@Pc(110) float local110 = (float) arg0.method22494((byte) -20) / 128.0F;
			local99 = local110;
			local97 = local110;
			local95 = local110;
		}
		this.aClass472_62 = new Class472(local95, local97, local99);
	}

	@OriginalMember(owner = "client!oe", name = "rs", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method29350(@OriginalArg(0) Object arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0 == this) {
			return true;
		} else if (arg0 instanceof Class458) {
			@Pc(14) Class458 local14 = (Class458) arg0;
			return this.aClass471_5.equals(local14.aClass471_5) && this.aClass472_61.method29715(local14.aClass472_61) && this.aClass472_62.method29715(local14.aClass472_62);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!oe", name = "l", descriptor = "(Lclient!alw;)V")
	void method29351(@OriginalArg(0) Class93_Sub41 arg0) {
		@Pc(3) int local3 = arg0.method22425((short) 16384);
		@Pc(5) float local5 = 0.0F;
		@Pc(7) float local7 = 0.0F;
		@Pc(9) float local9 = 0.0F;
		@Pc(11) float local11 = 1.0F;
		if ((local3 & 0x1) != 0) {
			local5 = (float) arg0.method22494((byte) -49) / 32768.0F;
			local7 = (float) arg0.method22494((byte) -35) / 32768.0F;
			local9 = (float) arg0.method22494((byte) -105) / 32768.0F;
			local11 = (float) arg0.method22494((byte) -25) / 32768.0F;
		}
		this.aClass471_5 = new Class471(local5, local7, local9, local11);
		@Pc(54) float local54 = 0.0F;
		@Pc(56) float local56 = 0.0F;
		@Pc(58) float local58 = 0.0F;
		if ((local3 & 0x2) != 0) {
			local54 = arg0.method22494((byte) -54);
		}
		if ((local3 & 0x4) != 0) {
			local56 = arg0.method22494((byte) -127);
		}
		if ((local3 & 0x8) != 0) {
			local58 = arg0.method22494((byte) -39);
		}
		this.aClass472_61 = new Class472(local54, local56, local58);
		@Pc(95) float local95 = 1.0F;
		@Pc(97) float local97 = 1.0F;
		@Pc(99) float local99 = 1.0F;
		if ((local3 & 0x10) == 0) {
			if ((local3 & 0x20) != 0) {
				local95 = (float) arg0.method22494((byte) -103) / 128.0F;
			}
			if ((local3 & 0x40) != 0) {
				local97 = (float) arg0.method22494((byte) -68) / 128.0F;
			}
			if ((local3 & 0x80) != 0) {
				local99 = (float) arg0.method22494((byte) -27) / 128.0F;
			}
		} else {
			@Pc(110) float local110 = (float) arg0.method22494((byte) -119) / 128.0F;
			local99 = local110;
			local97 = local110;
			local95 = local110;
		}
		this.aClass472_62 = new Class472(local95, local97, local99);
	}

	@OriginalMember(owner = "client!oe", name = "w", descriptor = "(Lclient!alw;Z)V")
	void method29352(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			this.method29349(arg0);
		} else {
			this.aClass471_5 = new Class471(arg0);
			this.aClass472_61 = new Class472(arg0);
			this.aClass472_62 = new Class472(arg0);
		}
	}

	@OriginalMember(owner = "client!oe", name = "rq", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method29353(@OriginalArg(0) Object arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0 == this) {
			return true;
		} else if (arg0 instanceof Class458) {
			@Pc(14) Class458 local14 = (Class458) arg0;
			return this.aClass471_5.equals(local14.aClass471_5) && this.aClass472_61.method29715(local14.aClass472_61) && this.aClass472_62.method29715(local14.aClass472_62);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!oe", name = "u", descriptor = "(Lclient!alw;)V")
	void method29354(@OriginalArg(0) Class93_Sub41 arg0) {
		@Pc(3) int local3 = arg0.method22425((short) 16384);
		@Pc(5) float local5 = 0.0F;
		@Pc(7) float local7 = 0.0F;
		@Pc(9) float local9 = 0.0F;
		@Pc(11) float local11 = 1.0F;
		if ((local3 & 0x1) != 0) {
			local5 = (float) arg0.method22494((byte) -91) / 32768.0F;
			local7 = (float) arg0.method22494((byte) -125) / 32768.0F;
			local9 = (float) arg0.method22494((byte) -19) / 32768.0F;
			local11 = (float) arg0.method22494((byte) -77) / 32768.0F;
		}
		this.aClass471_5 = new Class471(local5, local7, local9, local11);
		@Pc(54) float local54 = 0.0F;
		@Pc(56) float local56 = 0.0F;
		@Pc(58) float local58 = 0.0F;
		if ((local3 & 0x2) != 0) {
			local54 = arg0.method22494((byte) -53);
		}
		if ((local3 & 0x4) != 0) {
			local56 = arg0.method22494((byte) -86);
		}
		if ((local3 & 0x8) != 0) {
			local58 = arg0.method22494((byte) -117);
		}
		this.aClass472_61 = new Class472(local54, local56, local58);
		@Pc(95) float local95 = 1.0F;
		@Pc(97) float local97 = 1.0F;
		@Pc(99) float local99 = 1.0F;
		if ((local3 & 0x10) == 0) {
			if ((local3 & 0x20) != 0) {
				local95 = (float) arg0.method22494((byte) -70) / 128.0F;
			}
			if ((local3 & 0x40) != 0) {
				local97 = (float) arg0.method22494((byte) -54) / 128.0F;
			}
			if ((local3 & 0x80) != 0) {
				local99 = (float) arg0.method22494((byte) -104) / 128.0F;
			}
		} else {
			@Pc(110) float local110 = (float) arg0.method22494((byte) -57) / 128.0F;
			local99 = local110;
			local97 = local110;
			local95 = local110;
		}
		this.aClass472_62 = new Class472(local95, local97, local99);
	}

	@OriginalMember(owner = "client!oe", name = "z", descriptor = "(Lclient!alw;)V")
	void method29355(@OriginalArg(0) Class93_Sub41 arg0) {
		@Pc(3) int local3 = arg0.method22425((short) 16384);
		@Pc(5) float local5 = 0.0F;
		@Pc(7) float local7 = 0.0F;
		@Pc(9) float local9 = 0.0F;
		@Pc(11) float local11 = 1.0F;
		if ((local3 & 0x1) != 0) {
			local5 = (float) arg0.method22494((byte) -74) / 32768.0F;
			local7 = (float) arg0.method22494((byte) -78) / 32768.0F;
			local9 = (float) arg0.method22494((byte) -44) / 32768.0F;
			local11 = (float) arg0.method22494((byte) -101) / 32768.0F;
		}
		this.aClass471_5 = new Class471(local5, local7, local9, local11);
		@Pc(54) float local54 = 0.0F;
		@Pc(56) float local56 = 0.0F;
		@Pc(58) float local58 = 0.0F;
		if ((local3 & 0x2) != 0) {
			local54 = arg0.method22494((byte) -46);
		}
		if ((local3 & 0x4) != 0) {
			local56 = arg0.method22494((byte) -107);
		}
		if ((local3 & 0x8) != 0) {
			local58 = arg0.method22494((byte) -116);
		}
		this.aClass472_61 = new Class472(local54, local56, local58);
		@Pc(95) float local95 = 1.0F;
		@Pc(97) float local97 = 1.0F;
		@Pc(99) float local99 = 1.0F;
		if ((local3 & 0x10) == 0) {
			if ((local3 & 0x20) != 0) {
				local95 = (float) arg0.method22494((byte) -70) / 128.0F;
			}
			if ((local3 & 0x40) != 0) {
				local97 = (float) arg0.method22494((byte) -10) / 128.0F;
			}
			if ((local3 & 0x80) != 0) {
				local99 = (float) arg0.method22494((byte) -21) / 128.0F;
			}
		} else {
			@Pc(110) float local110 = (float) arg0.method22494((byte) -85) / 128.0F;
			local99 = local110;
			local97 = local110;
			local95 = local110;
		}
		this.aClass472_62 = new Class472(local95, local97, local99);
	}

	@OriginalMember(owner = "client!oe", name = "f", descriptor = "(Lclient!oe;)V")
	public void method29356(@OriginalArg(0) Class458 arg0) {
		this.aClass471_5.method29657(arg0.aClass471_5);
		this.aClass472_61.method29753(arg0.aClass471_5);
		this.aClass472_61.method29724(arg0.aClass472_61);
		this.aClass472_62.method29733(arg0.aClass472_62);
	}

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "()V")
	public void method29357() {
		this.aClass471_5.method29651();
		this.aClass472_61.method29721();
		this.aClass472_61.method29753(this.aClass471_5);
		this.aClass472_62.aFloat325 = 1.0F / this.aClass472_62.aFloat325;
		this.aClass472_62.aFloat326 = 1.0F / this.aClass472_62.aFloat326;
		this.aClass472_62.aFloat327 = 1.0F / this.aClass472_62.aFloat327;
	}

	@OriginalMember(owner = "client!oe", name = "v", descriptor = "(Lclient!oe;)V")
	public void method29358(@OriginalArg(0) Class458 arg0) {
		this.aClass471_5.method29657(arg0.aClass471_5);
		this.aClass472_61.method29753(arg0.aClass471_5);
		this.aClass472_61.method29724(arg0.aClass472_61);
		this.aClass472_62.method29733(arg0.aClass472_62);
	}

	@OriginalMember(owner = "client!oe", name = "r", descriptor = "()V")
	public void method29359() {
		this.aClass471_5.method29651();
		this.aClass472_61.method29721();
		this.aClass472_61.method29753(this.aClass471_5);
		this.aClass472_62.aFloat325 = 1.0F / this.aClass472_62.aFloat325;
		this.aClass472_62.aFloat326 = 1.0F / this.aClass472_62.aFloat326;
		this.aClass472_62.aFloat327 = 1.0F / this.aClass472_62.aFloat327;
	}

	@OriginalMember(owner = "client!oe", name = "o", descriptor = "(Lclient!oe;)V")
	public void method29360(@OriginalArg(0) Class458 arg0) {
		this.aClass471_5.method29657(arg0.aClass471_5);
		this.aClass472_61.method29753(arg0.aClass471_5);
		this.aClass472_61.method29724(arg0.aClass472_61);
		this.aClass472_62.method29733(arg0.aClass472_62);
	}
}
