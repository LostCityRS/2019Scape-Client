package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public class Class458 {

	@OriginalMember(owner = "client!oe", name = "z", descriptor = "I")
	static final int anInt5065 = 128;

	@OriginalMember(owner = "client!oe", name = "n", descriptor = "I")
	static final int anInt5066 = 1;

	@OriginalMember(owner = "client!oe", name = "m", descriptor = "I")
	static final int anInt5067 = 2;

	@OriginalMember(owner = "client!oe", name = "u", descriptor = "I")
	static final int anInt5068 = 64;

	@OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
	static final int anInt5069 = 8;

	@OriginalMember(owner = "client!oe", name = "w", descriptor = "I")
	static final int anInt5070 = 16;

	@OriginalMember(owner = "client!oe", name = "e", descriptor = "Z")
	public static final boolean aBoolean775 = true;

	@OriginalMember(owner = "client!oe", name = "l", descriptor = "I")
	static final int anInt5071 = 32;

	@OriginalMember(owner = "client!oe", name = "k", descriptor = "I")
	static final int anInt5072 = 4;

	@OriginalMember(owner = "client!oe", name = "p", descriptor = "Lclient!ov;")
	public Class471 aClass471_5;

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "Lclient!ox;")
	public Class472 aClass472_61;

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "Lclient!ox;")
	Class472 aClass472_62;

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(Lclient!alw;Z)V", line = 19)
	public Class458(@OriginalArg(0) Packet arg0, @OriginalArg(1) boolean arg1) {
		this.method29160(arg0, arg1);
	}

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V", line = 23)
	public Class458() {
		this.aClass471_5 = new Class471();
		this.aClass472_61 = new Class472();
		this.aClass472_62 = new Class472(1.0F, 1.0F, 1.0F);
	}

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(Lclient!oe;)V", line = 30)
	public Class458(@OriginalArg(0) Class458 arg0) {
		this();
		this.method29167(arg0);
	}

	@OriginalMember(owner = "client!oe", name = "e", descriptor = "(Lclient!alw;Z)V", line = 35)
	void method29160(@OriginalArg(0) Packet arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			this.method29162(arg0);
		} else {
			this.aClass471_5 = new Class471(arg0);
			this.aClass472_61 = new Class472(arg0);
			this.aClass472_62 = new Class472(arg0);
		}
	}

	@OriginalMember(owner = "client!oe", name = "w", descriptor = "(Lclient!alw;Z)V", line = 35)
	void method29161(@OriginalArg(0) Packet arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			this.method29162(arg0);
		} else {
			this.aClass471_5 = new Class471(arg0);
			this.aClass472_61 = new Class472(arg0);
			this.aClass472_62 = new Class472(arg0);
		}
	}

	@OriginalMember(owner = "client!oe", name = "n", descriptor = "(Lclient!alw;)V", line = 46)
	void method29162(@OriginalArg(0) Packet arg0) {
		@Pc(3) int local3 = arg0.g1((short) 16384);
		@Pc(5) float local5 = 0.0F;
		@Pc(7) float local7 = 0.0F;
		@Pc(9) float local9 = 0.0F;
		@Pc(11) float local11 = 1.0F;
		if ((local3 & 0x1) != 0) {
			local5 = (float) arg0.g2s((byte) -22) / 32768.0F;
			local7 = (float) arg0.g2s((byte) -94) / 32768.0F;
			local9 = (float) arg0.g2s((byte) -95) / 32768.0F;
			local11 = (float) arg0.g2s((byte) -108) / 32768.0F;
		}
		this.aClass471_5 = new Class471(local5, local7, local9, local11);
		@Pc(54) float local54 = 0.0F;
		@Pc(56) float local56 = 0.0F;
		@Pc(58) float local58 = 0.0F;
		if ((local3 & 0x2) != 0) {
			local54 = arg0.g2s((byte) -105);
		}
		if ((local3 & 0x4) != 0) {
			local56 = arg0.g2s((byte) -55);
		}
		if ((local3 & 0x8) != 0) {
			local58 = arg0.g2s((byte) -95);
		}
		this.aClass472_61 = new Class472(local54, local56, local58);
		@Pc(95) float local95 = 1.0F;
		@Pc(97) float local97 = 1.0F;
		@Pc(99) float local99 = 1.0F;
		if ((local3 & 0x10) == 0) {
			if ((local3 & 0x20) != 0) {
				local95 = (float) arg0.g2s((byte) -38) / 128.0F;
			}
			if ((local3 & 0x40) != 0) {
				local97 = (float) arg0.g2s((byte) -92) / 128.0F;
			}
			if ((local3 & 0x80) != 0) {
				local99 = (float) arg0.g2s((byte) -9) / 128.0F;
			}
		} else {
			@Pc(110) float local110 = (float) arg0.g2s((byte) -20) / 128.0F;
			local99 = local110;
			local97 = local110;
			local95 = local110;
		}
		this.aClass472_62 = new Class472(local95, local97, local99);
	}

	@OriginalMember(owner = "client!oe", name = "l", descriptor = "(Lclient!alw;)V", line = 46)
	void method29163(@OriginalArg(0) Packet arg0) {
		@Pc(3) int local3 = arg0.g1((short) 16384);
		@Pc(5) float local5 = 0.0F;
		@Pc(7) float local7 = 0.0F;
		@Pc(9) float local9 = 0.0F;
		@Pc(11) float local11 = 1.0F;
		if ((local3 & 0x1) != 0) {
			local5 = (float) arg0.g2s((byte) -49) / 32768.0F;
			local7 = (float) arg0.g2s((byte) -35) / 32768.0F;
			local9 = (float) arg0.g2s((byte) -105) / 32768.0F;
			local11 = (float) arg0.g2s((byte) -25) / 32768.0F;
		}
		this.aClass471_5 = new Class471(local5, local7, local9, local11);
		@Pc(54) float local54 = 0.0F;
		@Pc(56) float local56 = 0.0F;
		@Pc(58) float local58 = 0.0F;
		if ((local3 & 0x2) != 0) {
			local54 = arg0.g2s((byte) -54);
		}
		if ((local3 & 0x4) != 0) {
			local56 = arg0.g2s((byte) -127);
		}
		if ((local3 & 0x8) != 0) {
			local58 = arg0.g2s((byte) -39);
		}
		this.aClass472_61 = new Class472(local54, local56, local58);
		@Pc(95) float local95 = 1.0F;
		@Pc(97) float local97 = 1.0F;
		@Pc(99) float local99 = 1.0F;
		if ((local3 & 0x10) == 0) {
			if ((local3 & 0x20) != 0) {
				local95 = (float) arg0.g2s((byte) -103) / 128.0F;
			}
			if ((local3 & 0x40) != 0) {
				local97 = (float) arg0.g2s((byte) -68) / 128.0F;
			}
			if ((local3 & 0x80) != 0) {
				local99 = (float) arg0.g2s((byte) -27) / 128.0F;
			}
		} else {
			@Pc(110) float local110 = (float) arg0.g2s((byte) -119) / 128.0F;
			local99 = local110;
			local97 = local110;
			local95 = local110;
		}
		this.aClass472_62 = new Class472(local95, local97, local99);
	}

	@OriginalMember(owner = "client!oe", name = "u", descriptor = "(Lclient!alw;)V", line = 46)
	void method29164(@OriginalArg(0) Packet arg0) {
		@Pc(3) int local3 = arg0.g1((short) 16384);
		@Pc(5) float local5 = 0.0F;
		@Pc(7) float local7 = 0.0F;
		@Pc(9) float local9 = 0.0F;
		@Pc(11) float local11 = 1.0F;
		if ((local3 & 0x1) != 0) {
			local5 = (float) arg0.g2s((byte) -91) / 32768.0F;
			local7 = (float) arg0.g2s((byte) -125) / 32768.0F;
			local9 = (float) arg0.g2s((byte) -19) / 32768.0F;
			local11 = (float) arg0.g2s((byte) -77) / 32768.0F;
		}
		this.aClass471_5 = new Class471(local5, local7, local9, local11);
		@Pc(54) float local54 = 0.0F;
		@Pc(56) float local56 = 0.0F;
		@Pc(58) float local58 = 0.0F;
		if ((local3 & 0x2) != 0) {
			local54 = arg0.g2s((byte) -53);
		}
		if ((local3 & 0x4) != 0) {
			local56 = arg0.g2s((byte) -86);
		}
		if ((local3 & 0x8) != 0) {
			local58 = arg0.g2s((byte) -117);
		}
		this.aClass472_61 = new Class472(local54, local56, local58);
		@Pc(95) float local95 = 1.0F;
		@Pc(97) float local97 = 1.0F;
		@Pc(99) float local99 = 1.0F;
		if ((local3 & 0x10) == 0) {
			if ((local3 & 0x20) != 0) {
				local95 = (float) arg0.g2s((byte) -70) / 128.0F;
			}
			if ((local3 & 0x40) != 0) {
				local97 = (float) arg0.g2s((byte) -54) / 128.0F;
			}
			if ((local3 & 0x80) != 0) {
				local99 = (float) arg0.g2s((byte) -104) / 128.0F;
			}
		} else {
			@Pc(110) float local110 = (float) arg0.g2s((byte) -57) / 128.0F;
			local99 = local110;
			local97 = local110;
			local95 = local110;
		}
		this.aClass472_62 = new Class472(local95, local97, local99);
	}

	@OriginalMember(owner = "client!oe", name = "z", descriptor = "(Lclient!alw;)V", line = 46)
	void method29165(@OriginalArg(0) Packet arg0) {
		@Pc(3) int local3 = arg0.g1((short) 16384);
		@Pc(5) float local5 = 0.0F;
		@Pc(7) float local7 = 0.0F;
		@Pc(9) float local9 = 0.0F;
		@Pc(11) float local11 = 1.0F;
		if ((local3 & 0x1) != 0) {
			local5 = (float) arg0.g2s((byte) -74) / 32768.0F;
			local7 = (float) arg0.g2s((byte) -78) / 32768.0F;
			local9 = (float) arg0.g2s((byte) -44) / 32768.0F;
			local11 = (float) arg0.g2s((byte) -101) / 32768.0F;
		}
		this.aClass471_5 = new Class471(local5, local7, local9, local11);
		@Pc(54) float local54 = 0.0F;
		@Pc(56) float local56 = 0.0F;
		@Pc(58) float local58 = 0.0F;
		if ((local3 & 0x2) != 0) {
			local54 = arg0.g2s((byte) -46);
		}
		if ((local3 & 0x4) != 0) {
			local56 = arg0.g2s((byte) -107);
		}
		if ((local3 & 0x8) != 0) {
			local58 = arg0.g2s((byte) -116);
		}
		this.aClass472_61 = new Class472(local54, local56, local58);
		@Pc(95) float local95 = 1.0F;
		@Pc(97) float local97 = 1.0F;
		@Pc(99) float local99 = 1.0F;
		if ((local3 & 0x10) == 0) {
			if ((local3 & 0x20) != 0) {
				local95 = (float) arg0.g2s((byte) -70) / 128.0F;
			}
			if ((local3 & 0x40) != 0) {
				local97 = (float) arg0.g2s((byte) -10) / 128.0F;
			}
			if ((local3 & 0x80) != 0) {
				local99 = (float) arg0.g2s((byte) -21) / 128.0F;
			}
		} else {
			@Pc(110) float local110 = (float) arg0.g2s((byte) -85) / 128.0F;
			local99 = local110;
			local97 = local110;
			local95 = local110;
		}
		this.aClass472_62 = new Class472(local95, local97, local99);
	}

	@OriginalMember(owner = "client!oe", name = "p", descriptor = "(Lclient!oe;)V", line = 81)
	public void method29166(@OriginalArg(0) Class458 arg0) {
		this.aClass471_5.method29477(arg0.aClass471_5);
		this.aClass472_61.method29550(arg0.aClass472_61);
		this.aClass472_62.method29550(arg0.aClass472_62);
	}

	@OriginalMember(owner = "client!oe", name = "m", descriptor = "(Lclient!oe;)V", line = 81)
	public void method29167(@OriginalArg(0) Class458 arg0) {
		this.aClass471_5.method29477(arg0.aClass471_5);
		this.aClass472_61.method29550(arg0.aClass472_61);
		this.aClass472_62.method29550(arg0.aClass472_62);
	}

	@OriginalMember(owner = "client!oe", name = "k", descriptor = "()V", line = 87)
	public final void method29168() {
		this.aClass471_5.method29492();
		this.aClass472_61.method29561();
		this.aClass472_61.method29623(this.aClass471_5);
		this.aClass472_62.aFloat317 = 1.0F / this.aClass472_62.aFloat317;
		this.aClass472_62.aFloat318 = 1.0F / this.aClass472_62.aFloat318;
		this.aClass472_62.aFloat319 = 1.0F / this.aClass472_62.aFloat319;
	}

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "()V", line = 87)
	public final void method29169() {
		this.aClass471_5.method29492();
		this.aClass472_61.method29561();
		this.aClass472_61.method29623(this.aClass471_5);
		this.aClass472_62.aFloat317 = 1.0F / this.aClass472_62.aFloat317;
		this.aClass472_62.aFloat318 = 1.0F / this.aClass472_62.aFloat318;
		this.aClass472_62.aFloat319 = 1.0F / this.aClass472_62.aFloat319;
	}

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "()V", line = 87)
	public final void method29170() {
		this.aClass471_5.method29492();
		this.aClass472_61.method29561();
		this.aClass472_61.method29623(this.aClass471_5);
		this.aClass472_62.aFloat317 = 1.0F / this.aClass472_62.aFloat317;
		this.aClass472_62.aFloat318 = 1.0F / this.aClass472_62.aFloat318;
		this.aClass472_62.aFloat319 = 1.0F / this.aClass472_62.aFloat319;
	}

	@OriginalMember(owner = "client!oe", name = "r", descriptor = "()V", line = 87)
	public final void method29171() {
		this.aClass471_5.method29492();
		this.aClass472_61.method29561();
		this.aClass472_61.method29623(this.aClass471_5);
		this.aClass472_62.aFloat317 = 1.0F / this.aClass472_62.aFloat317;
		this.aClass472_62.aFloat318 = 1.0F / this.aClass472_62.aFloat318;
		this.aClass472_62.aFloat319 = 1.0F / this.aClass472_62.aFloat319;
	}

	@OriginalMember(owner = "client!oe", name = "f", descriptor = "(Lclient!oe;)V", line = 96)
	public final void method29172(@OriginalArg(0) Class458 arg0) {
		this.aClass471_5.method29510(arg0.aClass471_5);
		this.aClass472_61.method29623(arg0.aClass471_5);
		this.aClass472_61.method29567(arg0.aClass472_61);
		this.aClass472_62.method29596(arg0.aClass472_62);
	}

	@OriginalMember(owner = "client!oe", name = "v", descriptor = "(Lclient!oe;)V", line = 96)
	public final void method29173(@OriginalArg(0) Class458 arg0) {
		this.aClass471_5.method29510(arg0.aClass471_5);
		this.aClass472_61.method29623(arg0.aClass471_5);
		this.aClass472_61.method29567(arg0.aClass472_61);
		this.aClass472_62.method29596(arg0.aClass472_62);
	}

	@OriginalMember(owner = "client!oe", name = "o", descriptor = "(Lclient!oe;)V", line = 96)
	public final void method29174(@OriginalArg(0) Class458 arg0) {
		this.aClass471_5.method29510(arg0.aClass471_5);
		this.aClass472_61.method29623(arg0.aClass471_5);
		this.aClass472_61.method29567(arg0.aClass472_61);
		this.aClass472_62.method29596(arg0.aClass472_62);
	}

	@OriginalMember(owner = "client!oe", name = "rj", descriptor = "()Ljava/lang/String;", line = 104)
	public String method29175() {
		return "[" + this.aClass471_5.toString() + "|" + this.aClass472_61.toString() + "|" + this.aClass472_62.toString() + "]";
	}

	@OriginalMember(owner = "client!oe", name = "toString", descriptor = "()Ljava/lang/String;", line = 104)
	@Override
	public String toString() {
		return "[" + this.aClass471_5.toString() + "|" + this.aClass472_61.toString() + "|" + this.aClass472_62.toString() + "]";
	}

	@OriginalMember(owner = "client!oe", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 108)
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0 == this) {
			return true;
		} else if (arg0 instanceof Class458) {
			@Pc(14) Class458 local14 = (Class458) arg0;
			return this.aClass471_5.equals(local14.aClass471_5) && this.aClass472_61.method29558(local14.aClass472_61) && this.aClass472_62.method29558(local14.aClass472_62);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!oe", name = "rp", descriptor = "(Ljava/lang/Object;)Z", line = 108)
	public boolean method29176(@OriginalArg(0) Object arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0 == this) {
			return true;
		} else if (arg0 instanceof Class458) {
			@Pc(14) Class458 local14 = (Class458) arg0;
			return this.aClass471_5.equals(local14.aClass471_5) && this.aClass472_61.method29558(local14.aClass472_61) && this.aClass472_62.method29558(local14.aClass472_62);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!oe", name = "ro", descriptor = "(Ljava/lang/Object;)Z", line = 108)
	public boolean method29177(@OriginalArg(0) Object arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0 == this) {
			return true;
		} else if (arg0 instanceof Class458) {
			@Pc(14) Class458 local14 = (Class458) arg0;
			return this.aClass471_5.equals(local14.aClass471_5) && this.aClass472_61.method29558(local14.aClass472_61) && this.aClass472_62.method29558(local14.aClass472_62);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!oe", name = "rs", descriptor = "(Ljava/lang/Object;)Z", line = 108)
	public boolean method29178(@OriginalArg(0) Object arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0 == this) {
			return true;
		} else if (arg0 instanceof Class458) {
			@Pc(14) Class458 local14 = (Class458) arg0;
			return this.aClass471_5.equals(local14.aClass471_5) && this.aClass472_61.method29558(local14.aClass472_61) && this.aClass472_62.method29558(local14.aClass472_62);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!oe", name = "rq", descriptor = "(Ljava/lang/Object;)Z", line = 108)
	public boolean method29179(@OriginalArg(0) Object arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0 == this) {
			return true;
		} else if (arg0 instanceof Class458) {
			@Pc(14) Class458 local14 = (Class458) arg0;
			return this.aClass471_5.equals(local14.aClass471_5) && this.aClass472_61.method29558(local14.aClass472_61) && this.aClass472_62.method29558(local14.aClass472_62);
		} else {
			return false;
		}
	}
}
