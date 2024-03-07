package com.jagex;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aap")
public class Class18 implements Iterable {

	@OriginalMember(owner = "client!aap", name = "n", descriptor = "Lclient!aky;")
	Class93_Sub1 aClass93_Sub1_3;

	@OriginalMember(owner = "client!aap", name = "e", descriptor = "Lclient!aky;")
	public Class93_Sub1 aClass93_Sub1_4 = new Class93_Sub1();

	@OriginalMember(owner = "client!aap", name = "<init>", descriptor = "()V", line = 10)
	public Class18() {
		this.aClass93_Sub1_4.aClass93_Sub1_68 = this.aClass93_Sub1_4;
		this.aClass93_Sub1_4.aClass93_Sub1_67 = this.aClass93_Sub1_4;
	}

	@OriginalMember(owner = "client!aap", name = "e", descriptor = "(Lclient!alw;I)Lclient!ew;", line = 14)
	static Class110 method242(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0.g1((short) 16384);
		@Pc(7) Class89 local7 = Class271.method26302(local3, (byte) 80);
		@Pc(9) Class110 local9 = null;
		switch(local7.anInt291 * -380728599) {
			case 0:
				local9 = new Class110_Sub12(arg0);
				break;
			case 1:
				local9 = new Class110_Sub3(arg0);
				break;
			case 2:
				local9 = new Class110_Sub1(arg0);
				break;
			case 3:
				local9 = new Class110_Sub23(arg0);
				break;
			case 4:
				local9 = new Class110_Sub22(arg0, true);
				break;
			case 5:
				local9 = new Class110_Sub16(arg0);
				break;
			case 6:
				local9 = new Class110_Sub17(arg0);
			case 7:
			case 17:
			case 18:
			default:
				break;
			case 8:
				local9 = new Class110_Sub7(arg0);
				break;
			case 9:
				local9 = new Class110_Sub2(arg0);
				break;
			case 10:
				local9 = new Class110_Sub11(arg0, 1, 1);
				break;
			case 11:
				local9 = new Class110_Sub10(arg0);
				break;
			case 12:
				local9 = new Class110_Sub14(arg0);
				break;
			case 13:
				local9 = new Class110_Sub13(arg0);
				break;
			case 14:
				local9 = new Class110_Sub9(arg0);
				break;
			case 15:
				local9 = new Class110_Sub11(arg0, 0, 0);
				break;
			case 16:
				local9 = new Class110_Sub22(arg0, false);
				break;
			case 19:
				local9 = new Class110_Sub18(arg0);
				break;
			case 20:
				local9 = new Class110_Sub21(arg0);
				break;
			case 21:
				local9 = new Class110_Sub20(arg0);
				break;
			case 22:
				local9 = new Class110_Sub19(arg0);
				break;
			case 23:
				local9 = new Class110_Sub4(arg0);
				break;
			case 24:
				local9 = new Class110_Sub15_Sub1(arg0);
				break;
			case 25:
				local9 = new Class110_Sub6(arg0);
				break;
			case 26:
				local9 = new Class110_Sub11(arg0, 0, 1);
				break;
			case 27:
				local9 = new Class110_Sub11(arg0, 1, 0);
				break;
			case 28:
				local9 = new Class110_Sub15_Sub2(arg0);
				break;
			case 29:
				local9 = new Class110_Sub8(arg0);
				break;
			case 30:
				local9 = new Class110_Sub5(arg0);
		}
		return local9;
	}

	@OriginalMember(owner = "client!aap", name = "r", descriptor = "()V", line = 16)
	public void method243() {
		while (this.aClass93_Sub1_4.aClass93_Sub1_68 != this.aClass93_Sub1_4) {
			this.aClass93_Sub1_4.aClass93_Sub1_68.method23976((short) 289);
		}
	}

	@OriginalMember(owner = "client!aap", name = "e", descriptor = "(I)V", line = 16)
	public void method244(@OriginalArg(0) int arg0) {
		while (this.aClass93_Sub1_4.aClass93_Sub1_68 != this.aClass93_Sub1_4) {
			this.aClass93_Sub1_4.aClass93_Sub1_68.method23976((short) 1220);
		}
	}

	@OriginalMember(owner = "client!aap", name = "v", descriptor = "()V", line = 16)
	public void method245() {
		while (this.aClass93_Sub1_4.aClass93_Sub1_68 != this.aClass93_Sub1_4) {
			this.aClass93_Sub1_4.aClass93_Sub1_68.method23976((short) -17249);
		}
	}

	@OriginalMember(owner = "client!aap", name = "o", descriptor = "()V", line = 16)
	public void method246() {
		while (this.aClass93_Sub1_4.aClass93_Sub1_68 != this.aClass93_Sub1_4) {
			this.aClass93_Sub1_4.aClass93_Sub1_68.method23976((short) -8559);
		}
	}

	@OriginalMember(owner = "client!aap", name = "s", descriptor = "(Lclient!aky;)V", line = 22)
	public void method247(@OriginalArg(0) Class93_Sub1 arg0) {
		if (arg0.aClass93_Sub1_67 != null) {
			arg0.method23976((short) -4459);
		}
		arg0.aClass93_Sub1_67 = this.aClass93_Sub1_4.aClass93_Sub1_67;
		arg0.aClass93_Sub1_68 = this.aClass93_Sub1_4;
		arg0.aClass93_Sub1_67.aClass93_Sub1_68 = arg0;
		arg0.aClass93_Sub1_68.aClass93_Sub1_67 = arg0;
	}

	@OriginalMember(owner = "client!aap", name = "y", descriptor = "(Lclient!aky;)V", line = 22)
	public void method248(@OriginalArg(0) Class93_Sub1 arg0) {
		if (arg0.aClass93_Sub1_67 != null) {
			arg0.method23976((short) -16064);
		}
		arg0.aClass93_Sub1_67 = this.aClass93_Sub1_4.aClass93_Sub1_67;
		arg0.aClass93_Sub1_68 = this.aClass93_Sub1_4;
		arg0.aClass93_Sub1_67.aClass93_Sub1_68 = arg0;
		arg0.aClass93_Sub1_68.aClass93_Sub1_67 = arg0;
	}

	@OriginalMember(owner = "client!aap", name = "q", descriptor = "(Lclient!aky;)V", line = 22)
	public void method249(@OriginalArg(0) Class93_Sub1 arg0) {
		if (arg0.aClass93_Sub1_67 != null) {
			arg0.method23976((short) -10216);
		}
		arg0.aClass93_Sub1_67 = this.aClass93_Sub1_4.aClass93_Sub1_67;
		arg0.aClass93_Sub1_68 = this.aClass93_Sub1_4;
		arg0.aClass93_Sub1_67.aClass93_Sub1_68 = arg0;
		arg0.aClass93_Sub1_68.aClass93_Sub1_67 = arg0;
	}

	@OriginalMember(owner = "client!aap", name = "n", descriptor = "(Lclient!aky;I)V", line = 22)
	public void method250(@OriginalArg(0) Class93_Sub1 arg0, @OriginalArg(1) int arg1) {
		if (arg0.aClass93_Sub1_67 != null) {
			arg0.method23976((short) 18814);
		}
		arg0.aClass93_Sub1_67 = this.aClass93_Sub1_4.aClass93_Sub1_67;
		arg0.aClass93_Sub1_68 = this.aClass93_Sub1_4;
		arg0.aClass93_Sub1_67.aClass93_Sub1_68 = arg0;
		arg0.aClass93_Sub1_68.aClass93_Sub1_67 = arg0;
	}

	@OriginalMember(owner = "client!aap", name = "x", descriptor = "(Lclient!aky;Lclient!aky;)V", line = 38)
	public static void method251(@OriginalArg(0) Class93_Sub1 arg0, @OriginalArg(1) Class93_Sub1 arg1) {
		if (arg0.aClass93_Sub1_67 != null) {
			arg0.method23976((short) -13877);
		}
		arg0.aClass93_Sub1_67 = arg1;
		arg0.aClass93_Sub1_68 = arg1.aClass93_Sub1_68;
		arg0.aClass93_Sub1_67.aClass93_Sub1_68 = arg0;
		arg0.aClass93_Sub1_68.aClass93_Sub1_67 = arg0;
	}

	@OriginalMember(owner = "client!aap", name = "b", descriptor = "(Lclient!aky;Lclient!aky;)V", line = 38)
	public static void method252(@OriginalArg(0) Class93_Sub1 arg0, @OriginalArg(1) Class93_Sub1 arg1) {
		if (arg0.aClass93_Sub1_67 != null) {
			arg0.method23976((short) -14024);
		}
		arg0.aClass93_Sub1_67 = arg1;
		arg0.aClass93_Sub1_68 = arg1.aClass93_Sub1_68;
		arg0.aClass93_Sub1_67.aClass93_Sub1_68 = arg0;
		arg0.aClass93_Sub1_68.aClass93_Sub1_67 = arg0;
	}

	@OriginalMember(owner = "client!aap", name = "h", descriptor = "(Lclient!aky;Lclient!aky;)V", line = 38)
	public static void method253(@OriginalArg(0) Class93_Sub1 arg0, @OriginalArg(1) Class93_Sub1 arg1) {
		if (arg0.aClass93_Sub1_67 != null) {
			arg0.method23976((short) 4480);
		}
		arg0.aClass93_Sub1_67 = arg1;
		arg0.aClass93_Sub1_68 = arg1.aClass93_Sub1_68;
		arg0.aClass93_Sub1_67.aClass93_Sub1_68 = arg0;
		arg0.aClass93_Sub1_68.aClass93_Sub1_67 = arg0;
	}

	@OriginalMember(owner = "client!aap", name = "f", descriptor = "(B)Lclient!aky;", line = 46)
	public Class93_Sub1 method254(@OriginalArg(0) byte arg0) {
		@Pc(3) Class93_Sub1 local3 = this.aClass93_Sub1_4.aClass93_Sub1_68;
		if (this.aClass93_Sub1_4 == local3) {
			return null;
		} else {
			local3.method23976((short) 2465);
			return local3;
		}
	}

	@OriginalMember(owner = "client!aap", name = "a", descriptor = "()Lclient!aky;", line = 46)
	public Class93_Sub1 method255() {
		@Pc(3) Class93_Sub1 local3 = this.aClass93_Sub1_4.aClass93_Sub1_68;
		if (this.aClass93_Sub1_4 == local3) {
			return null;
		} else {
			local3.method23976((short) -9154);
			return local3;
		}
	}

	@OriginalMember(owner = "client!aap", name = "w", descriptor = "(I)Lclient!aky;", line = 53)
	public Class93_Sub1 method256(@OriginalArg(0) int arg0) {
		return this.method259(null, -580144460);
	}

	@OriginalMember(owner = "client!aap", name = "i", descriptor = "()Lclient!aky;", line = 53)
	public Class93_Sub1 method257() {
		return this.method259(null, -580144460);
	}

	@OriginalMember(owner = "client!aap", name = "g", descriptor = "()Lclient!aky;", line = 53)
	public Class93_Sub1 method258() {
		return this.method259(null, -580144460);
	}

	@OriginalMember(owner = "client!aap", name = "l", descriptor = "(Lclient!aky;I)Lclient!aky;", line = 58)
	Class93_Sub1 method259(@OriginalArg(0) Class93_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class93_Sub1 local5;
		if (arg0 == null) {
			local5 = this.aClass93_Sub1_4.aClass93_Sub1_68;
		} else {
			local5 = arg0;
		}
		if (local5 == this.aClass93_Sub1_4) {
			this.aClass93_Sub1_3 = null;
			return null;
		} else {
			this.aClass93_Sub1_3 = local5.aClass93_Sub1_68;
			return local5;
		}
	}

	@OriginalMember(owner = "client!aap", name = "ag", descriptor = "(Lclient!aky;)Lclient!aky;", line = 58)
	Class93_Sub1 method260(@OriginalArg(0) Class93_Sub1 arg0) {
		@Pc(5) Class93_Sub1 local5;
		if (arg0 == null) {
			local5 = this.aClass93_Sub1_4.aClass93_Sub1_68;
		} else {
			local5 = arg0;
		}
		if (local5 == this.aClass93_Sub1_4) {
			this.aClass93_Sub1_3 = null;
			return null;
		} else {
			this.aClass93_Sub1_3 = local5.aClass93_Sub1_68;
			return local5;
		}
	}

	@OriginalMember(owner = "client!aap", name = "j", descriptor = "(Lclient!aky;)Lclient!aky;", line = 58)
	Class93_Sub1 method261(@OriginalArg(0) Class93_Sub1 arg0) {
		@Pc(5) Class93_Sub1 local5;
		if (arg0 == null) {
			local5 = this.aClass93_Sub1_4.aClass93_Sub1_68;
		} else {
			local5 = arg0;
		}
		if (local5 == this.aClass93_Sub1_4) {
			this.aClass93_Sub1_3 = null;
			return null;
		} else {
			this.aClass93_Sub1_3 = local5.aClass93_Sub1_68;
			return local5;
		}
	}

	@OriginalMember(owner = "client!aap", name = "t", descriptor = "(Lclient!aky;)Lclient!aky;", line = 58)
	Class93_Sub1 method262(@OriginalArg(0) Class93_Sub1 arg0) {
		@Pc(5) Class93_Sub1 local5;
		if (arg0 == null) {
			local5 = this.aClass93_Sub1_4.aClass93_Sub1_68;
		} else {
			local5 = arg0;
		}
		if (local5 == this.aClass93_Sub1_4) {
			this.aClass93_Sub1_3 = null;
			return null;
		} else {
			this.aClass93_Sub1_3 = local5.aClass93_Sub1_68;
			return local5;
		}
	}

	@OriginalMember(owner = "client!aap", name = "ae", descriptor = "(Lclient!aky;)Lclient!aky;", line = 58)
	Class93_Sub1 method263(@OriginalArg(0) Class93_Sub1 arg0) {
		@Pc(5) Class93_Sub1 local5;
		if (arg0 == null) {
			local5 = this.aClass93_Sub1_4.aClass93_Sub1_68;
		} else {
			local5 = arg0;
		}
		if (local5 == this.aClass93_Sub1_4) {
			this.aClass93_Sub1_3 = null;
			return null;
		} else {
			this.aClass93_Sub1_3 = local5.aClass93_Sub1_68;
			return local5;
		}
	}

	@OriginalMember(owner = "client!aap", name = "u", descriptor = "(I)Lclient!aky;", line = 69)
	public Class93_Sub1 method264(@OriginalArg(0) int arg0) {
		@Pc(2) Class93_Sub1 local2 = this.aClass93_Sub1_3;
		if (local2 == this.aClass93_Sub1_4) {
			this.aClass93_Sub1_3 = null;
			return null;
		} else {
			this.aClass93_Sub1_3 = local2.aClass93_Sub1_68;
			return local2;
		}
	}

	@OriginalMember(owner = "client!aap", name = "ah", descriptor = "()Lclient!aky;", line = 69)
	public Class93_Sub1 method265() {
		@Pc(2) Class93_Sub1 local2 = this.aClass93_Sub1_3;
		if (local2 == this.aClass93_Sub1_4) {
			this.aClass93_Sub1_3 = null;
			return null;
		} else {
			this.aClass93_Sub1_3 = local2.aClass93_Sub1_68;
			return local2;
		}
	}

	@OriginalMember(owner = "client!aap", name = "z", descriptor = "(I)I", line = 79)
	public int method266(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class93_Sub1 local5 = this.aClass93_Sub1_4.aClass93_Sub1_68; local5 != this.aClass93_Sub1_4; local5 = local5.aClass93_Sub1_68) {
			local1++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!aap", name = "ac", descriptor = "()I", line = 79)
	public int method267() {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class93_Sub1 local5 = this.aClass93_Sub1_4.aClass93_Sub1_68; local5 != this.aClass93_Sub1_4; local5 = local5.aClass93_Sub1_68) {
			local1++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!aap", name = "al", descriptor = "()I", line = 79)
	public int method268() {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class93_Sub1 local5 = this.aClass93_Sub1_4.aClass93_Sub1_68; local5 != this.aClass93_Sub1_4; local5 = local5.aClass93_Sub1_68) {
			local1++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!aap", name = "p", descriptor = "()Ljava/util/Iterator;", line = 89)
	public Iterator method269() {
		return new Class11(this);
	}

	@OriginalMember(owner = "client!aap", name = "iterator", descriptor = "()Ljava/util/Iterator;", line = 89)
	@Override
	public Iterator iterator() {
		return new Class11(this);
	}

	@OriginalMember(owner = "client!aap", name = "d", descriptor = "()Ljava/util/Iterator;", line = 89)
	public Iterator method270() {
		return new Class11(this);
	}

	@OriginalMember(owner = "client!aap", name = "c", descriptor = "()Ljava/util/Iterator;", line = 89)
	public Iterator method271() {
		return new Class11(this);
	}

}
