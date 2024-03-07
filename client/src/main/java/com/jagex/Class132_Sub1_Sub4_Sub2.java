package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ajz")
public class Class132_Sub1_Sub4_Sub2 extends Class132_Sub1_Sub4 implements Interface61 {

	@OriginalMember(owner = "client!ajz", name = "o", descriptor = "Lclient!uq;")
	Class600 aClass600_8;

	@OriginalMember(owner = "client!ajz", name = "c", descriptor = "Lclient!aop;")
	Class32_Sub14 aClass32_Sub14_5;

	@OriginalMember(owner = "client!ajz", name = "s", descriptor = "I")
	final int anInt1497;

	@OriginalMember(owner = "client!ajz", name = "q", descriptor = "Z")
	final boolean aBoolean333;

	@OriginalMember(owner = "client!ajz", name = "y", descriptor = "B")
	final byte aByte54;

	@OriginalMember(owner = "client!ajz", name = "x", descriptor = "Z")
	boolean aBoolean334;

	@OriginalMember(owner = "client!ajz", name = "b", descriptor = "Z")
	boolean aBoolean332;

	@OriginalMember(owner = "client!ajz", name = "h", descriptor = "Z")
	boolean aBoolean335;

	@OriginalMember(owner = "client!ajz", name = "a", descriptor = "I")
	int anInt1498;

	@OriginalMember(owner = "client!ajz", name = "r", descriptor = "Lclient!do;")
	Class109 aClass109_4;

	@OriginalMember(owner = "client!ajz", name = "v", descriptor = "Lclient!ara;")
	Class93_Sub1_Sub4 aClass93_Sub1_Sub4_4;

	@OriginalMember(owner = "client!ajz", name = "<init>", descriptor = "(Lclient!tx;Lclient!dh;Lclient!aop;Lclient!vd;IIIIIZIZLclient!oe;)V", line = 39)
	public Class132_Sub1_Sub4_Sub2(@OriginalArg(0) Class585 arg0, @OriginalArg(1) Class104 arg1, @OriginalArg(2) Class32_Sub14 arg2, @OriginalArg(3) Class610 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) Class458 arg12) {
		super(arg0, arg6, arg7, arg8, arg4, arg5, arg3.anInt5585 * -2089585703, arg12);
		this.aClass32_Sub14_5 = arg2;
		this.anInt1497 = arg3.anInt5587 * 217635333;
		this.aBoolean333 = arg9;
		this.aByte54 = (byte) arg10;
		this.aBoolean334 = arg3.anInt5592 * 1067969079 != 0 && !arg9;
		this.aBoolean332 = arg11;
		this.aBoolean335 = arg1.method20535() && arg3.aBoolean828 && !this.aBoolean333 && Class51.options.aClass166_Sub8_1.method15531((short) 15248) != 0;
		this.anInt1498 = arg7 * -1969282401;
		@Pc(69) int local69 = 2048;
		if (this.aBoolean332) {
			local69 |= 0x10000;
		}
		if (arg3.aBoolean842) {
			local69 |= 0x80000;
		}
		@Pc(91) Class34 local91 = this.method13430(arg1, local69, this.aBoolean335, -1708733736);
		if (local91 != null) {
			this.aClass109_4 = (Class109) local91.anObject1;
			this.aClass93_Sub1_Sub4_4 = (Class93_Sub1_Sub4) local91.anObject2;
			if (this.aBoolean332 || arg3.aBoolean842) {
				this.aClass109_4 = this.aClass109_4.method6938((byte) 0, local69, false);
				if (arg3.aBoolean842) {
					@Pc(124) Class528 local124 = client.world.method30468((byte) -57);
					this.aClass109_4.method6914(local124.anInt5229 * 1660167749, local124.anInt5227 * -831110151, local124.anInt5228 * 1060946059, local124.anInt5226 * -1883995863);
				}
			}
		}
		this.method24274(1, 748330274);
	}

	@OriginalMember(owner = "client!ajz", name = "bu", descriptor = "(B)Z", line = 67)
	@Override
	boolean method24285(@OriginalArg(0) byte arg0) {
		if (this.aClass109_4 == null) {
			return true;
		} else {
			return !this.aClass109_4.method6975();
		}
	}

	@OriginalMember(owner = "client!ajz", name = "cf", descriptor = "()Z", line = 67)
	@Override
	boolean method24312() {
		if (this.aClass109_4 == null) {
			return true;
		} else {
			return !this.aClass109_4.method6975();
		}
	}

	@OriginalMember(owner = "client!ajz", name = "co", descriptor = "()Z", line = 67)
	@Override
	boolean method24296() {
		if (this.aClass109_4 == null) {
			return true;
		} else {
			return !this.aClass109_4.method6975();
		}
	}

	@OriginalMember(owner = "client!ajz", name = "bw", descriptor = "(S)Z", line = 72)
	@Override
	boolean method24286(@OriginalArg(0) short arg0) {
		return this.aClass109_4 == null ? false : this.aClass109_4.method6903();
	}

	@OriginalMember(owner = "client!ajz", name = "cq", descriptor = "()Z", line = 72)
	@Override
	boolean method24299() {
		return this.aClass109_4 == null ? false : this.aClass109_4.method6903();
	}

	@OriginalMember(owner = "client!ajz", name = "cr", descriptor = "()Z", line = 72)
	@Override
	boolean method24297() {
		return this.aClass109_4 == null ? false : this.aClass109_4.method6903();
	}

	@OriginalMember(owner = "client!ajz", name = "cm", descriptor = "()Z", line = 72)
	@Override
	boolean method24298() {
		return this.aClass109_4 == null ? false : this.aClass109_4.method6903();
	}

	@OriginalMember(owner = "client!ajz", name = "by", descriptor = "(B)I", line = 77)
	@Override
	public int method24303(@OriginalArg(0) byte arg0) {
		return this.aClass109_4 == null ? 0 : this.aClass109_4.method6917();
	}

	@OriginalMember(owner = "client!ajz", name = "ch", descriptor = "()I", line = 77)
	@Override
	public int method24300() {
		return this.aClass109_4 == null ? 0 : this.aClass109_4.method6917();
	}

	@OriginalMember(owner = "client!ajz", name = "bz", descriptor = "(Lclient!dh;IB)Lclient!do;", line = 81)
	Class109 method13428(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (this.aClass109_4 != null && arg0.method20759(this.aClass109_4.method6875(), arg1) == 0) {
			return this.aClass109_4;
		} else {
			@Pc(19) Class34 local19 = this.method13430(arg0, arg1, false, -1963669008);
			return local19 == null ? null : (Class109) local19.anObject1;
		}
	}

	@OriginalMember(owner = "client!ajz", name = "br", descriptor = "(Lclient!dh;I)Lclient!do;", line = 81)
	Class109 method13429(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass109_4 != null && arg0.method20759(this.aClass109_4.method6875(), arg1) == 0) {
			return this.aClass109_4;
		} else {
			@Pc(19) Class34 local19 = this.method13430(arg0, arg1, false, -1322467336);
			return local19 == null ? null : (Class109) local19.anObject1;
		}
	}

	@OriginalMember(owner = "client!ajz", name = "bv", descriptor = "(Lclient!dh;IZI)Lclient!abg;", line = 88)
	Class34 method13430(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		@Pc(9) Class610 local9 = (Class610) this.aClass32_Sub14_5.get(this.anInt1497 * -2043631571, -2136843153);
		@Pc(19) Class99 local19;
		@Pc(25) Class99 local25;
		if (this.aBoolean333) {
			local19 = this.aClass585_23.aClass99Array3[this.aByte99];
			local25 = this.aClass585_23.aClass99Array2[0];
		} else {
			local19 = this.aClass585_23.aClass99Array2[this.aByte99];
			if (this.aByte99 < 3) {
				local25 = this.aClass585_23.aClass99Array2[this.aByte99 + 1];
			} else {
				local25 = null;
			}
		}
		@Pc(53) Class472 local53 = this.method24220().aClass472_61;
		return local9.method31984(arg0, arg1, Class615.aClass615_24.anInt5628 * 948246811, this.aByte54, local19, local25, (int) local53.aFloat317, this.anInt1498 * -313820833, (int) local53.aFloat319, arg2, null, (byte) 24);
	}

	@OriginalMember(owner = "client!ajz", name = "bg", descriptor = "(Lclient!dh;IZ)Lclient!abg;", line = 88)
	Class34 method13431(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(9) Class610 local9 = (Class610) this.aClass32_Sub14_5.get(this.anInt1497 * -2043631571, -1635690562);
		@Pc(19) Class99 local19;
		@Pc(25) Class99 local25;
		if (this.aBoolean333) {
			local19 = this.aClass585_23.aClass99Array3[this.aByte99];
			local25 = this.aClass585_23.aClass99Array2[0];
		} else {
			local19 = this.aClass585_23.aClass99Array2[this.aByte99];
			if (this.aByte99 < 3) {
				local25 = this.aClass585_23.aClass99Array2[this.aByte99 + 1];
			} else {
				local25 = null;
			}
		}
		@Pc(53) Class472 local53 = this.method24220().aClass472_61;
		return local9.method31984(arg0, arg1, Class615.aClass615_24.anInt5628 * 948246811, this.aByte54, local19, local25, (int) local53.aFloat317, this.anInt1498 * -313820833, (int) local53.aFloat319, arg2, null, (byte) 24);
	}

	@OriginalMember(owner = "client!ajz", name = "fv", descriptor = "(Lclient!dh;B)Lclient!uq;", line = 105)
	@Override
	public Class600 method24311(@OriginalArg(0) Class104 arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) Class472 local3 = this.method24220().aClass472_61;
		if (this.aClass600_8 == null) {
			this.aClass600_8 = Class62.method1143((int) local3.aFloat317, (int) local3.aFloat318, (int) local3.aFloat319, this.method13428(arg0, 0, (byte) -100), 2099229965);
		}
		return this.aClass600_8;
	}

	@OriginalMember(owner = "client!ajz", name = "fl", descriptor = "(Lclient!dh;)Lclient!uq;", line = 105)
	@Override
	public Class600 method24301(@OriginalArg(0) Class104 arg0) {
		@Pc(3) Class472 local3 = this.method24220().aClass472_61;
		if (this.aClass600_8 == null) {
			this.aClass600_8 = Class62.method1143((int) local3.aFloat317, (int) local3.aFloat318, (int) local3.aFloat319, this.method13428(arg0, 0, (byte) 36), 1741342781);
		}
		return this.aClass600_8;
	}

	@OriginalMember(owner = "client!ajz", name = "fb", descriptor = "(Lclient!dh;)Lclient!uq;", line = 105)
	@Override
	public Class600 method24302(@OriginalArg(0) Class104 arg0) {
		@Pc(3) Class472 local3 = this.method24220().aClass472_61;
		if (this.aClass600_8 == null) {
			this.aClass600_8 = Class62.method1143((int) local3.aFloat317, (int) local3.aFloat318, (int) local3.aFloat319, this.method13428(arg0, 0, (byte) 21), 1751829088);
		}
		return this.aClass600_8;
	}

	@OriginalMember(owner = "client!ajz", name = "fc", descriptor = "(Lclient!dh;I)Lclient!tl;", line = 111)
	@Override
	Class573 method24293(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass109_4 == null) {
			return null;
		}
		@Pc(8) Class470 local8 = this.method24227();
		@Pc(13) Class573 local13 = Class125_Sub1.method9212(this.aBoolean334, 373147274);
		@Pc(24) Class463 local24 = ((Class610) this.aClass32_Sub14_5.get(this.anInt1497 * -2043631571, -1270120272)).aClass463_2;
		if (local24 == null) {
			this.aClass109_4.method6976(local8, this.aClass241Array21[0], 0);
		} else {
			this.aClass109_4.method6976(local8, null, 0);
			arg0.method20583(local8, this.aClass241Array21[0], local24);
		}
		return local13;
	}

	@OriginalMember(owner = "client!ajz", name = "fo", descriptor = "(Lclient!dh;)Lclient!tl;", line = 111)
	@Override
	Class573 method24289(@OriginalArg(0) Class104 arg0) {
		if (this.aClass109_4 == null) {
			return null;
		}
		@Pc(8) Class470 local8 = this.method24227();
		@Pc(13) Class573 local13 = Class125_Sub1.method9212(this.aBoolean334, 373147274);
		@Pc(24) Class463 local24 = ((Class610) this.aClass32_Sub14_5.get(this.anInt1497 * -2043631571, 1120917848)).aClass463_2;
		if (local24 == null) {
			this.aClass109_4.method6976(local8, this.aClass241Array21[0], 0);
		} else {
			this.aClass109_4.method6976(local8, null, 0);
			arg0.method20583(local8, this.aClass241Array21[0], local24);
		}
		return local13;
	}

	@OriginalMember(owner = "client!ajz", name = "fw", descriptor = "(Lclient!dh;I)V", line = 123)
	@Override
	void method24290(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ajz", name = "fy", descriptor = "(Lclient!dh;)V", line = 123)
	@Override
	void method24307(@OriginalArg(0) Class104 arg0) {
	}

	@OriginalMember(owner = "client!ajz", name = "fe", descriptor = "(Lclient!dh;)V", line = 123)
	@Override
	void method24314(@OriginalArg(0) Class104 arg0) {
	}

	@OriginalMember(owner = "client!ajz", name = "fk", descriptor = "(Lclient!dh;II)Z", line = 126)
	@Override
	boolean method24304(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) Class463 local10 = ((Class610) this.aClass32_Sub14_5.get(this.anInt1497 * -2043631571, 477233153)).aClass463_2;
		if (local10 != null) {
			return arg0.method20482(arg1, arg2, this.method24227(), local10, -301337288);
		}
		@Pc(27) Class109 local27 = this.method13428(arg0, 131072, (byte) -84);
		if (local27 == null) {
			return false;
		} else {
			@Pc(33) Class470 local33 = this.method24227();
			return local27.method6897(arg1, arg2, local33, false, 0);
		}
	}

	@OriginalMember(owner = "client!ajz", name = "fa", descriptor = "(Lclient!dh;IIB)Z", line = 126)
	@Override
	boolean method24283(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(10) Class463 local10 = ((Class610) this.aClass32_Sub14_5.get(this.anInt1497 * -2043631571, -975711667)).aClass463_2;
		if (local10 != null) {
			return arg0.method20482(arg1, arg2, this.method24227(), local10, -670689451);
		}
		@Pc(27) Class109 local27 = this.method13428(arg0, 131072, (byte) 83);
		if (local27 == null) {
			return false;
		} else {
			@Pc(33) Class470 local33 = this.method24227();
			return local27.method6897(arg1, arg2, local33, false, 0);
		}
	}

	@OriginalMember(owner = "client!ajz", name = "fp", descriptor = "(I)Z", line = 137)
	@Override
	boolean method24284(@OriginalArg(0) int arg0) {
		return this.aBoolean332;
	}

	@OriginalMember(owner = "client!ajz", name = "fh", descriptor = "()Z", line = 137)
	@Override
	boolean method24294() {
		return this.aBoolean332;
	}

	@OriginalMember(owner = "client!ajz", name = "fr", descriptor = "()Z", line = 137)
	@Override
	boolean method24305() {
		return this.aBoolean332;
	}

	@OriginalMember(owner = "client!ajz", name = "gu", descriptor = "(Lclient!dh;Lclient!alh;IIIZ)V", line = 141)
	@Override
	void method24306(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (arg1 instanceof Class132_Sub1_Sub4_Sub2) {
			@Pc(5) Class132_Sub1_Sub4_Sub2 local5 = (Class132_Sub1_Sub4_Sub2) arg1;
			if (this.aClass109_4 != null && local5.aClass109_4 != null) {
				this.aClass109_4.method6872(local5.aClass109_4, arg2, arg3, arg4, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!ajz", name = "gq", descriptor = "(Lclient!dh;Lclient!alh;IIIZ)V", line = 141)
	@Override
	void method24309(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (arg1 instanceof Class132_Sub1_Sub4_Sub2) {
			@Pc(5) Class132_Sub1_Sub4_Sub2 local5 = (Class132_Sub1_Sub4_Sub2) arg1;
			if (this.aClass109_4 != null && local5.aClass109_4 != null) {
				this.aClass109_4.method6872(local5.aClass109_4, arg2, arg3, arg4, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!ajz", name = "gl", descriptor = "(Lclient!dh;Lclient!alh;IIIZ)V", line = 141)
	@Override
	void method24308(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (arg1 instanceof Class132_Sub1_Sub4_Sub2) {
			@Pc(5) Class132_Sub1_Sub4_Sub2 local5 = (Class132_Sub1_Sub4_Sub2) arg1;
			if (this.aClass109_4 != null && local5.aClass109_4 != null) {
				this.aClass109_4.method6872(local5.aClass109_4, arg2, arg3, arg4, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!ajz", name = "fq", descriptor = "(Lclient!dh;Lclient!alh;IIIZB)V", line = 141)
	@Override
	void method24291(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6) {
		if (arg1 instanceof Class132_Sub1_Sub4_Sub2) {
			@Pc(5) Class132_Sub1_Sub4_Sub2 local5 = (Class132_Sub1_Sub4_Sub2) arg1;
			if (this.aClass109_4 != null && local5.aClass109_4 != null) {
				this.aClass109_4.method6872(local5.aClass109_4, arg2, arg3, arg4, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!ajz", name = "ff", descriptor = "(B)V", line = 148)
	@Override
	void method24288(@OriginalArg(0) byte arg0) {
		this.aBoolean332 = false;
		if (this.aClass109_4 != null) {
			this.aClass109_4.method6874(this.aClass109_4.method6875() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!ajz", name = "gk", descriptor = "()V", line = 148)
	@Override
	void method24310() {
		this.aBoolean332 = false;
		if (this.aClass109_4 != null) {
			this.aClass109_4.method6874(this.aClass109_4.method6875() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!ajz", name = "go", descriptor = "()V", line = 148)
	@Override
	void method24281() {
		this.aBoolean332 = false;
		if (this.aClass109_4 != null) {
			this.aClass109_4.method6874(this.aClass109_4.method6875() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!ajz", name = "z", descriptor = "()I", line = 153)
	@Override
	public int method13410() {
		return this.anInt1497 * -2043631571;
	}

	@OriginalMember(owner = "client!ajz", name = "p", descriptor = "()I", line = 153)
	@Override
	public int method13411() {
		return this.anInt1497 * -2043631571;
	}

	@OriginalMember(owner = "client!ajz", name = "e", descriptor = "(I)I", line = 153)
	@Override
	public int method13423(@OriginalArg(0) int arg0) {
		return this.anInt1497 * -2043631571;
	}

	@OriginalMember(owner = "client!ajz", name = "n", descriptor = "(I)I", line = 157)
	@Override
	public int method13420(@OriginalArg(0) int arg0) {
		return Class615.aClass615_24.anInt5628 * 948246811;
	}

	@OriginalMember(owner = "client!ajz", name = "d", descriptor = "()I", line = 157)
	@Override
	public int method13403() {
		return Class615.aClass615_24.anInt5628 * 948246811;
	}

	@OriginalMember(owner = "client!ajz", name = "r", descriptor = "()I", line = 161)
	@Override
	public int method13416() {
		return this.aByte54;
	}

	@OriginalMember(owner = "client!ajz", name = "c", descriptor = "()I", line = 161)
	@Override
	public int method13413() {
		return this.aByte54;
	}

	@OriginalMember(owner = "client!ajz", name = "m", descriptor = "(I)I", line = 161)
	@Override
	public int method13404(@OriginalArg(0) int arg0) {
		return this.aByte54;
	}

	@OriginalMember(owner = "client!ajz", name = "v", descriptor = "()I", line = 161)
	@Override
	public int method13412() {
		return this.aByte54;
	}

	@OriginalMember(owner = "client!ajz", name = "o", descriptor = "()I", line = 161)
	@Override
	public int method13414() {
		return this.aByte54;
	}

	@OriginalMember(owner = "client!ajz", name = "k", descriptor = "(I)V", line = 165)
	@Override
	public void method13405(@OriginalArg(0) int arg0) {
		if (this.aClass109_4 != null) {
			this.aClass109_4.method6979();
		}
	}

	@OriginalMember(owner = "client!ajz", name = "j", descriptor = "()V", line = 165)
	@Override
	public void method13426() {
		if (this.aClass109_4 != null) {
			this.aClass109_4.method6979();
		}
	}

	@OriginalMember(owner = "client!ajz", name = "i", descriptor = "()V", line = 165)
	@Override
	public void method13425() {
		if (this.aClass109_4 != null) {
			this.aClass109_4.method6979();
		}
	}

	@OriginalMember(owner = "client!ajz", name = "w", descriptor = "(B)Z", line = 169)
	@Override
	public boolean method13407(@OriginalArg(0) byte arg0) {
		return true;
	}

	@OriginalMember(owner = "client!ajz", name = "t", descriptor = "()Z", line = 169)
	@Override
	public boolean method13427() {
		return true;
	}

	@OriginalMember(owner = "client!ajz", name = "f", descriptor = "(I)Z", line = 173)
	@Override
	public boolean method13406(@OriginalArg(0) int arg0) {
		return this.aBoolean335;
	}

	@OriginalMember(owner = "client!ajz", name = "s", descriptor = "()Z", line = 173)
	@Override
	public boolean method13415() {
		return this.aBoolean335;
	}

	@OriginalMember(owner = "client!ajz", name = "q", descriptor = "(Lclient!dh;)V", line = 177)
	@Override
	public void method13419(@OriginalArg(0) Class104 arg0) {
		@Pc(1) Class93_Sub1_Sub4 local1 = null;
		if (this.aClass93_Sub1_Sub4_4 == null && this.aBoolean335) {
			@Pc(15) Class34 local15 = this.method13430(arg0, 262144, true, -2123111483);
			local1 = (Class93_Sub1_Sub4) (local15 == null ? null : local15.anObject2);
		} else {
			local1 = this.aClass93_Sub1_Sub4_4;
			this.aClass93_Sub1_Sub4_4 = null;
		}
		@Pc(34) Class472 local34 = this.method24220().aClass472_61;
		if (local1 != null) {
			this.aClass585_23.method31591(local1, this.aByte99, (int) local34.aFloat317, (int) local34.aFloat319, null, 367449974);
		}
	}

	@OriginalMember(owner = "client!ajz", name = "x", descriptor = "(Lclient!dh;)V", line = 177)
	@Override
	public void method13408(@OriginalArg(0) Class104 arg0) {
		@Pc(1) Class93_Sub1_Sub4 local1 = null;
		if (this.aClass93_Sub1_Sub4_4 == null && this.aBoolean335) {
			@Pc(15) Class34 local15 = this.method13430(arg0, 262144, true, 2026902562);
			local1 = (Class93_Sub1_Sub4) (local15 == null ? null : local15.anObject2);
		} else {
			local1 = this.aClass93_Sub1_Sub4_4;
			this.aClass93_Sub1_Sub4_4 = null;
		}
		@Pc(34) Class472 local34 = this.method24220().aClass472_61;
		if (local1 != null) {
			this.aClass585_23.method31591(local1, this.aByte99, (int) local34.aFloat317, (int) local34.aFloat319, null, 781738076);
		}
	}

	@OriginalMember(owner = "client!ajz", name = "b", descriptor = "(Lclient!dh;)V", line = 177)
	@Override
	public void method13421(@OriginalArg(0) Class104 arg0) {
		@Pc(1) Class93_Sub1_Sub4 local1 = null;
		if (this.aClass93_Sub1_Sub4_4 == null && this.aBoolean335) {
			@Pc(15) Class34 local15 = this.method13430(arg0, 262144, true, -563263177);
			local1 = (Class93_Sub1_Sub4) (local15 == null ? null : local15.anObject2);
		} else {
			local1 = this.aClass93_Sub1_Sub4_4;
			this.aClass93_Sub1_Sub4_4 = null;
		}
		@Pc(34) Class472 local34 = this.method24220().aClass472_61;
		if (local1 != null) {
			this.aClass585_23.method31591(local1, this.aByte99, (int) local34.aFloat317, (int) local34.aFloat319, null, 1983955680);
		}
	}

	@OriginalMember(owner = "client!ajz", name = "l", descriptor = "(Lclient!dh;B)V", line = 177)
	@Override
	public void method13417(@OriginalArg(0) Class104 arg0, @OriginalArg(1) byte arg1) {
		@Pc(1) Class93_Sub1_Sub4 local1 = null;
		if (this.aClass93_Sub1_Sub4_4 == null && this.aBoolean335) {
			@Pc(15) Class34 local15 = this.method13430(arg0, 262144, true, 2070694828);
			local1 = (Class93_Sub1_Sub4) (local15 == null ? null : local15.anObject2);
		} else {
			local1 = this.aClass93_Sub1_Sub4_4;
			this.aClass93_Sub1_Sub4_4 = null;
		}
		@Pc(34) Class472 local34 = this.method24220().aClass472_61;
		if (local1 != null) {
			this.aClass585_23.method31591(local1, this.aByte99, (int) local34.aFloat317, (int) local34.aFloat319, null, 1216070691);
		}
	}

	@OriginalMember(owner = "client!ajz", name = "y", descriptor = "(Lclient!dh;)V", line = 177)
	@Override
	public void method13418(@OriginalArg(0) Class104 arg0) {
		@Pc(1) Class93_Sub1_Sub4 local1 = null;
		if (this.aClass93_Sub1_Sub4_4 == null && this.aBoolean335) {
			@Pc(15) Class34 local15 = this.method13430(arg0, 262144, true, 1153211078);
			local1 = (Class93_Sub1_Sub4) (local15 == null ? null : local15.anObject2);
		} else {
			local1 = this.aClass93_Sub1_Sub4_4;
			this.aClass93_Sub1_Sub4_4 = null;
		}
		@Pc(34) Class472 local34 = this.method24220().aClass472_61;
		if (local1 != null) {
			this.aClass585_23.method31591(local1, this.aByte99, (int) local34.aFloat317, (int) local34.aFloat319, null, 1802275552);
		}
	}

	@OriginalMember(owner = "client!ajz", name = "u", descriptor = "(Lclient!dh;B)V", line = 191)
	@Override
	public void method13409(@OriginalArg(0) Class104 arg0, @OriginalArg(1) byte arg1) {
		@Pc(1) Class93_Sub1_Sub4 local1 = null;
		if (this.aClass93_Sub1_Sub4_4 == null && this.aBoolean335) {
			@Pc(15) Class34 local15 = this.method13430(arg0, 262144, true, 635581543);
			local1 = (Class93_Sub1_Sub4) (local15 == null ? null : local15.anObject2);
		} else {
			local1 = this.aClass93_Sub1_Sub4_4;
			this.aClass93_Sub1_Sub4_4 = null;
		}
		@Pc(35) Class472 local35 = this.method24220().aClass472_61;
		if (local1 != null) {
			this.aClass585_23.method31595(local1, this.aByte99, (int) local35.aFloat317, (int) local35.aFloat319, null, -1509518304);
		}
	}

	@OriginalMember(owner = "client!ajz", name = "h", descriptor = "(Lclient!dh;)V", line = 191)
	@Override
	public void method13402(@OriginalArg(0) Class104 arg0) {
		@Pc(1) Class93_Sub1_Sub4 local1 = null;
		if (this.aClass93_Sub1_Sub4_4 == null && this.aBoolean335) {
			@Pc(15) Class34 local15 = this.method13430(arg0, 262144, true, -1753618317);
			local1 = (Class93_Sub1_Sub4) (local15 == null ? null : local15.anObject2);
		} else {
			local1 = this.aClass93_Sub1_Sub4_4;
			this.aClass93_Sub1_Sub4_4 = null;
		}
		@Pc(35) Class472 local35 = this.method24220().aClass472_61;
		if (local1 != null) {
			this.aClass585_23.method31595(local1, this.aByte99, (int) local35.aFloat317, (int) local35.aFloat319, null, -1580519074);
		}
	}

	@OriginalMember(owner = "client!ajz", name = "a", descriptor = "(Lclient!dh;)V", line = 191)
	@Override
	public void method13422(@OriginalArg(0) Class104 arg0) {
		@Pc(1) Class93_Sub1_Sub4 local1 = null;
		if (this.aClass93_Sub1_Sub4_4 == null && this.aBoolean335) {
			@Pc(15) Class34 local15 = this.method13430(arg0, 262144, true, 79853938);
			local1 = (Class93_Sub1_Sub4) (local15 == null ? null : local15.anObject2);
		} else {
			local1 = this.aClass93_Sub1_Sub4_4;
			this.aClass93_Sub1_Sub4_4 = null;
		}
		@Pc(35) Class472 local35 = this.method24220().aClass472_61;
		if (local1 != null) {
			this.aClass585_23.method31595(local1, this.aByte99, (int) local35.aFloat317, (int) local35.aFloat319, null, 1463172271);
		}
	}

	@OriginalMember(owner = "client!ajz", name = "g", descriptor = "(Lclient!dh;)V", line = 191)
	@Override
	public void method13424(@OriginalArg(0) Class104 arg0) {
		@Pc(1) Class93_Sub1_Sub4 local1 = null;
		if (this.aClass93_Sub1_Sub4_4 == null && this.aBoolean335) {
			@Pc(15) Class34 local15 = this.method13430(arg0, 262144, true, 1338215421);
			local1 = (Class93_Sub1_Sub4) (local15 == null ? null : local15.anObject2);
		} else {
			local1 = this.aClass93_Sub1_Sub4_4;
			this.aClass93_Sub1_Sub4_4 = null;
		}
		@Pc(35) Class472 local35 = this.method24220().aClass472_61;
		if (local1 != null) {
			this.aClass585_23.method31595(local1, this.aByte99, (int) local35.aFloat317, (int) local35.aFloat319, null, -1586666015);
		}
	}

	@OriginalMember(owner = "client!ajz", name = "as", descriptor = "(IIIII)V", line = 219)
	static void method13432(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(4) Class93_Sub1_Sub11 local4 = Class371.method28000(4, (long) arg0);
		local4.method21886(1366022412);
		local4.anInt3020 = arg1 * 1415359557;
		local4.anInt3025 = arg2 * -302789657;
		local4.anInt3019 = arg3 * 1929524779;
	}
}
