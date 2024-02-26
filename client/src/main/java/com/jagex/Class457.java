package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public final class Class457 {

	@OriginalMember(owner = "client!oc", name = "m", descriptor = "I")
	static final int anInt4897 = 64;

	@OriginalMember(owner = "client!oc", name = "u", descriptor = "I")
	static final int anInt4898 = 4;

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "I")
	static final int anInt4899 = 2;

	@OriginalMember(owner = "client!oc", name = "l", descriptor = "I")
	static final int anInt4900 = 8;

	@OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
	static final int anInt4901 = 16;

	@OriginalMember(owner = "client!oc", name = "i", descriptor = "I")
	static final int anInt4902 = 32;

	@OriginalMember(owner = "client!oc", name = "o", descriptor = "I")
	static final int anInt4903 = 128;

	@OriginalMember(owner = "client!oc", name = "t", descriptor = "Z")
	public static final boolean aBoolean877 = true;

	@OriginalMember(owner = "client!oc", name = "f", descriptor = "I")
	static final int anInt4904 = 1;

	@OriginalMember(owner = "client!oc", name = "j", descriptor = "Lclient!oq;")
	public Class466 aClass466_5;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "Lclient!on;")
	public Class463 aClass463_61;

	@OriginalMember(owner = "client!oc", name = "s", descriptor = "Lclient!on;")
	Class463 aClass463_62;

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V")
	public Class457() {
		this.aClass466_5 = new Class466();
		this.aClass463_61 = new Class463();
		this.aClass463_62 = new Class463(1.0F, 1.0F, 1.0F);
	}

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Lclient!oc;)V")
	public Class457(@OriginalArg(0) Class457 arg0) {
		this();
		this.method29363(arg0);
	}

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Lclient!ald;Z)V")
	public Class457(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) boolean arg1) {
		this.method29361(arg0, arg1);
	}

	@OriginalMember(owner = "client!oc", name = "j", descriptor = "()V")
	public void method29359() {
		this.aClass466_5.method29701();
		this.aClass463_61.method29475();
		this.aClass463_61.method29500(this.aClass466_5);
		this.aClass463_62.aFloat297 = 1.0F / this.aClass463_62.aFloat297;
		this.aClass463_62.aFloat295 = 1.0F / this.aClass463_62.aFloat295;
		this.aClass463_62.aFloat296 = 1.0F / this.aClass463_62.aFloat296;
	}

	@OriginalMember(owner = "client!oc", name = "rs", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method29360(@OriginalArg(0) Object arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0 == this) {
			return true;
		} else if (arg0 instanceof Class457) {
			@Pc(14) Class457 local14 = (Class457) arg0;
			return this.aClass466_5.equals(local14.aClass466_5) && this.aClass463_61.method29480(local14.aClass463_61) && this.aClass463_62.method29480(local14.aClass463_62);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!oc", name = "t", descriptor = "(Lclient!ald;Z)V")
	void method29361(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			this.method29362(arg0);
		} else {
			this.aClass466_5 = new Class466(arg0);
			this.aClass463_61 = new Class463(arg0);
			this.aClass463_62 = new Class463(arg0);
		}
	}

	@OriginalMember(owner = "client!oc", name = "f", descriptor = "(Lclient!ald;)V")
	void method29362(@OriginalArg(0) Class80_Sub36 arg0) {
		@Pc(3) int local3 = arg0.method23362(-653899091);
		@Pc(5) float local5 = 0.0F;
		@Pc(7) float local7 = 0.0F;
		@Pc(9) float local9 = 0.0F;
		@Pc(11) float local11 = 1.0F;
		if ((local3 & 0x1) != 0) {
			local5 = (float) arg0.method23179(-499612462) / 32768.0F;
			local7 = (float) arg0.method23179(320392058) / 32768.0F;
			local9 = (float) arg0.method23179(126480631) / 32768.0F;
			local11 = (float) arg0.method23179(1060354238) / 32768.0F;
		}
		this.aClass466_5 = new Class466(local5, local7, local9, local11);
		@Pc(54) float local54 = 0.0F;
		@Pc(56) float local56 = 0.0F;
		@Pc(58) float local58 = 0.0F;
		if ((local3 & 0x2) != 0) {
			local54 = arg0.method23179(252138514);
		}
		if ((local3 & 0x4) != 0) {
			local56 = arg0.method23179(-756581201);
		}
		if ((local3 & 0x8) != 0) {
			local58 = arg0.method23179(-295998078);
		}
		this.aClass463_61 = new Class463(local54, local56, local58);
		@Pc(95) float local95 = 1.0F;
		@Pc(97) float local97 = 1.0F;
		@Pc(99) float local99 = 1.0F;
		if ((local3 & 0x10) == 0) {
			if ((local3 & 0x20) != 0) {
				local95 = (float) arg0.method23179(-591053720) / 128.0F;
			}
			if ((local3 & 0x40) != 0) {
				local97 = (float) arg0.method23179(1104506843) / 128.0F;
			}
			if ((local3 & 0x80) != 0) {
				local99 = (float) arg0.method23179(931495839) / 128.0F;
			}
		} else {
			@Pc(110) float local110 = (float) arg0.method23179(1732830581) / 128.0F;
			local99 = local110;
			local97 = local110;
			local95 = local110;
		}
		this.aClass463_62 = new Class463(local95, local97, local99);
	}

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "(Lclient!oc;)V")
	public void method29363(@OriginalArg(0) Class457 arg0) {
		this.aClass466_5.method29647(arg0.aClass466_5);
		this.aClass463_61.method29478(arg0.aClass463_61);
		this.aClass463_62.method29478(arg0.aClass463_62);
	}

	@OriginalMember(owner = "client!oc", name = "u", descriptor = "()V")
	public void method29364() {
		this.aClass466_5.method29701();
		this.aClass463_61.method29475();
		this.aClass463_61.method29500(this.aClass466_5);
		this.aClass463_62.aFloat297 = 1.0F / this.aClass463_62.aFloat297;
		this.aClass463_62.aFloat295 = 1.0F / this.aClass463_62.aFloat295;
		this.aClass463_62.aFloat296 = 1.0F / this.aClass463_62.aFloat296;
	}

	@OriginalMember(owner = "client!oc", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return "[" + this.aClass466_5.toString() + "|" + this.aClass463_61.toString() + "|" + this.aClass463_62.toString() + "]";
	}

	@OriginalMember(owner = "client!oc", name = "s", descriptor = "(Lclient!oc;)V")
	public void method29365(@OriginalArg(0) Class457 arg0) {
		this.aClass466_5.method29660(arg0.aClass466_5);
		this.aClass463_61.method29500(arg0.aClass466_5);
		this.aClass463_61.method29483(arg0.aClass463_61);
		this.aClass463_62.method29494(arg0.aClass463_62);
	}

	@OriginalMember(owner = "client!oc", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0 == this) {
			return true;
		} else if (arg0 instanceof Class457) {
			@Pc(14) Class457 local14 = (Class457) arg0;
			return this.aClass466_5.equals(local14.aClass466_5) && this.aClass463_61.method29480(local14.aClass463_61) && this.aClass463_62.method29480(local14.aClass463_62);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!oc", name = "rn", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method29366(@OriginalArg(0) Object arg0) {
		if (arg0 == null) {
			return false;
		} else if (arg0 == this) {
			return true;
		} else if (arg0 instanceof Class457) {
			@Pc(14) Class457 local14 = (Class457) arg0;
			return this.aClass466_5.equals(local14.aClass466_5) && this.aClass463_61.method29480(local14.aClass463_61) && this.aClass463_62.method29480(local14.aClass463_62);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!oc", name = "ri", descriptor = "()Ljava/lang/String;")
	public String method29367() {
		return "[" + this.aClass466_5.toString() + "|" + this.aClass463_61.toString() + "|" + this.aClass463_62.toString() + "]";
	}

	@OriginalMember(owner = "client!oc", name = "rx", descriptor = "()Ljava/lang/String;")
	public String method29368() {
		return "[" + this.aClass466_5.toString() + "|" + this.aClass463_61.toString() + "|" + this.aClass463_62.toString() + "]";
	}

	@OriginalMember(owner = "client!oc", name = "l", descriptor = "(Lclient!oc;)V")
	public void method29369(@OriginalArg(0) Class457 arg0) {
		this.aClass466_5.method29660(arg0.aClass466_5);
		this.aClass463_61.method29500(arg0.aClass466_5);
		this.aClass463_61.method29483(arg0.aClass463_61);
		this.aClass463_62.method29494(arg0.aClass463_62);
	}

	@OriginalMember(owner = "client!oc", name = "g", descriptor = "(Lclient!ald;Z)V")
	void method29370(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			this.method29362(arg0);
		} else {
			this.aClass466_5 = new Class466(arg0);
			this.aClass463_61 = new Class463(arg0);
			this.aClass463_62 = new Class463(arg0);
		}
	}

	@OriginalMember(owner = "client!oc", name = "m", descriptor = "(Lclient!ald;)V")
	void method29371(@OriginalArg(0) Class80_Sub36 arg0) {
		@Pc(3) int local3 = arg0.method23362(869772863);
		@Pc(5) float local5 = 0.0F;
		@Pc(7) float local7 = 0.0F;
		@Pc(9) float local9 = 0.0F;
		@Pc(11) float local11 = 1.0F;
		if ((local3 & 0x1) != 0) {
			local5 = (float) arg0.method23179(1626450485) / 32768.0F;
			local7 = (float) arg0.method23179(782075471) / 32768.0F;
			local9 = (float) arg0.method23179(-544458000) / 32768.0F;
			local11 = (float) arg0.method23179(-202924614) / 32768.0F;
		}
		this.aClass466_5 = new Class466(local5, local7, local9, local11);
		@Pc(54) float local54 = 0.0F;
		@Pc(56) float local56 = 0.0F;
		@Pc(58) float local58 = 0.0F;
		if ((local3 & 0x2) != 0) {
			local54 = arg0.method23179(292783816);
		}
		if ((local3 & 0x4) != 0) {
			local56 = arg0.method23179(549458788);
		}
		if ((local3 & 0x8) != 0) {
			local58 = arg0.method23179(-791577205);
		}
		this.aClass463_61 = new Class463(local54, local56, local58);
		@Pc(95) float local95 = 1.0F;
		@Pc(97) float local97 = 1.0F;
		@Pc(99) float local99 = 1.0F;
		if ((local3 & 0x10) == 0) {
			if ((local3 & 0x20) != 0) {
				local95 = (float) arg0.method23179(1275890612) / 128.0F;
			}
			if ((local3 & 0x40) != 0) {
				local97 = (float) arg0.method23179(-396767441) / 128.0F;
			}
			if ((local3 & 0x80) != 0) {
				local99 = (float) arg0.method23179(560081766) / 128.0F;
			}
		} else {
			@Pc(110) float local110 = (float) arg0.method23179(1122342587) / 128.0F;
			local99 = local110;
			local97 = local110;
			local95 = local110;
		}
		this.aClass463_62 = new Class463(local95, local97, local99);
	}

	@OriginalMember(owner = "client!oc", name = "o", descriptor = "(Lclient!ald;)V")
	void method29372(@OriginalArg(0) Class80_Sub36 arg0) {
		@Pc(3) int local3 = arg0.method23362(472571413);
		@Pc(5) float local5 = 0.0F;
		@Pc(7) float local7 = 0.0F;
		@Pc(9) float local9 = 0.0F;
		@Pc(11) float local11 = 1.0F;
		if ((local3 & 0x1) != 0) {
			local5 = (float) arg0.method23179(-283867968) / 32768.0F;
			local7 = (float) arg0.method23179(-448787693) / 32768.0F;
			local9 = (float) arg0.method23179(-222715272) / 32768.0F;
			local11 = (float) arg0.method23179(1578875199) / 32768.0F;
		}
		this.aClass466_5 = new Class466(local5, local7, local9, local11);
		@Pc(54) float local54 = 0.0F;
		@Pc(56) float local56 = 0.0F;
		@Pc(58) float local58 = 0.0F;
		if ((local3 & 0x2) != 0) {
			local54 = arg0.method23179(-576757202);
		}
		if ((local3 & 0x4) != 0) {
			local56 = arg0.method23179(85459859);
		}
		if ((local3 & 0x8) != 0) {
			local58 = arg0.method23179(276236446);
		}
		this.aClass463_61 = new Class463(local54, local56, local58);
		@Pc(95) float local95 = 1.0F;
		@Pc(97) float local97 = 1.0F;
		@Pc(99) float local99 = 1.0F;
		if ((local3 & 0x10) == 0) {
			if ((local3 & 0x20) != 0) {
				local95 = (float) arg0.method23179(-78774994) / 128.0F;
			}
			if ((local3 & 0x40) != 0) {
				local97 = (float) arg0.method23179(-112831719) / 128.0F;
			}
			if ((local3 & 0x80) != 0) {
				local99 = (float) arg0.method23179(1069906874) / 128.0F;
			}
		} else {
			@Pc(110) float local110 = (float) arg0.method23179(1394859968) / 128.0F;
			local99 = local110;
			local97 = local110;
			local95 = local110;
		}
		this.aClass463_62 = new Class463(local95, local97, local99);
	}

	@OriginalMember(owner = "client!oc", name = "i", descriptor = "(Lclient!ald;Z)V")
	void method29373(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			this.method29362(arg0);
		} else {
			this.aClass466_5 = new Class466(arg0);
			this.aClass463_61 = new Class463(arg0);
			this.aClass463_62 = new Class463(arg0);
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "()V")
	public void method29374() {
		this.aClass466_5.method29701();
		this.aClass463_61.method29475();
		this.aClass463_61.method29500(this.aClass466_5);
		this.aClass463_62.aFloat297 = 1.0F / this.aClass463_62.aFloat297;
		this.aClass463_62.aFloat295 = 1.0F / this.aClass463_62.aFloat295;
		this.aClass463_62.aFloat296 = 1.0F / this.aClass463_62.aFloat296;
	}

	@OriginalMember(owner = "client!oc", name = "k", descriptor = "(Lclient!oc;)V")
	public void method29375(@OriginalArg(0) Class457 arg0) {
		this.aClass466_5.method29660(arg0.aClass466_5);
		this.aClass463_61.method29500(arg0.aClass466_5);
		this.aClass463_61.method29483(arg0.aClass463_61);
		this.aClass463_62.method29494(arg0.aClass463_62);
	}
}
