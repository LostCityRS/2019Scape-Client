package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!asy")
public class Class93_Sub1_Sub20 extends Class93_Sub1 {

	@OriginalMember(owner = "client!asy", name = "c", descriptor = "I")
	int anInt3164 = -1546080893;

	@OriginalMember(owner = "client!asy", name = "r", descriptor = "I")
	public int anInt3165 = -950294695;

	@OriginalMember(owner = "client!asy", name = "v", descriptor = "I")
	public int anInt3166 = -1387184128;

	@OriginalMember(owner = "client!asy", name = "o", descriptor = "I")
	public int anInt3167 = 0;

	@OriginalMember(owner = "client!asy", name = "s", descriptor = "I")
	public int anInt3170 = 571916288;

	@OriginalMember(owner = "client!asy", name = "y", descriptor = "I")
	public int anInt3169 = 0;

	@OriginalMember(owner = "client!asy", name = "q", descriptor = "Z")
	boolean aBoolean518 = true;

	@OriginalMember(owner = "client!asy", name = "l", descriptor = "I")
	public int anInt3168;

	@OriginalMember(owner = "client!asy", name = "u", descriptor = "Ljava/lang/String;")
	public String aString113;

	@OriginalMember(owner = "client!asy", name = "z", descriptor = "Ljava/lang/String;")
	public String aString114;

	@OriginalMember(owner = "client!asy", name = "d", descriptor = "I")
	public int anInt3163;

	@OriginalMember(owner = "client!asy", name = "p", descriptor = "Lclient!aat;")
	Class22 aClass22_42;

	@OriginalMember(owner = "client!asy", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V", line = 24)
	Class93_Sub1_Sub20(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt3168 = arg0 * -1697597639;
		this.aString113 = arg1;
		this.aString114 = arg2;
		this.anInt3163 = arg3 * 286349503;
		this.anInt3164 = arg4 * 1546080893;
		this.aBoolean518 = arg5;
		this.anInt3165 = arg6 * 950294695;
		if (this.anInt3165 * -2102669545 == 255) {
			this.anInt3165 = 0;
		}
		Class260.method26153(arg7, (byte) -1);
		this.aClass22_42 = new Class22();
	}

	@OriginalMember(owner = "client!asy", name = "p", descriptor = "(II)Z", line = 38)
	boolean method23166(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(5) Class93_Sub32 local5 = (Class93_Sub32) this.aClass22_42.method428((byte) 6); local5 != null; local5 = (Class93_Sub32) this.aClass22_42.method442(849528044)) {
			if (local5.method13914(arg0, arg1, 868039118)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!asy", name = "e", descriptor = "(III)Z", line = 38)
	boolean method23167(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) Class93_Sub32 local5 = (Class93_Sub32) this.aClass22_42.method428((byte) 125); local5 != null; local5 = (Class93_Sub32) this.aClass22_42.method442(1564665623)) {
			if (local5.method13914(arg0, arg1, -548011508)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!asy", name = "u", descriptor = "(II)Z", line = 38)
	boolean method23168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(5) Class93_Sub32 local5 = (Class93_Sub32) this.aClass22_42.method428((byte) 27); local5 != null; local5 = (Class93_Sub32) this.aClass22_42.method442(188897686)) {
			if (local5.method13914(arg0, arg1, 1381030361)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!asy", name = "z", descriptor = "(II)Z", line = 38)
	boolean method23169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(5) Class93_Sub32 local5 = (Class93_Sub32) this.aClass22_42.method428((byte) 109); local5 != null; local5 = (Class93_Sub32) this.aClass22_42.method442(2018137315)) {
			if (local5.method13914(arg0, arg1, -263616282)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!asy", name = "n", descriptor = "(II[II)Z", line = 45)
	public boolean method23170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(5) Class93_Sub32 local5 = (Class93_Sub32) this.aClass22_42.method428((byte) 88); local5 != null; local5 = (Class93_Sub32) this.aClass22_42.method442(1613735463)) {
			if (local5.method13919(arg0, arg1, 1961525195)) {
				local5.method13921(arg0, arg1, arg2, 1273764509);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!asy", name = "m", descriptor = "(II[II)Z", line = 55)
	public boolean method23171(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3) {
		for (@Pc(5) Class93_Sub32 local5 = (Class93_Sub32) this.aClass22_42.method428((byte) 53); local5 != null; local5 = (Class93_Sub32) this.aClass22_42.method442(529916399)) {
			if (local5.method13914(arg0, arg1, -695094618)) {
				local5.method13926(arg0, arg1, arg2, (byte) 1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!asy", name = "d", descriptor = "(II[I)Z", line = 55)
	public boolean method23172(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		for (@Pc(5) Class93_Sub32 local5 = (Class93_Sub32) this.aClass22_42.method428((byte) 18); local5 != null; local5 = (Class93_Sub32) this.aClass22_42.method442(210839797)) {
			if (local5.method13914(arg0, arg1, 394784624)) {
				local5.method13926(arg0, arg1, arg2, (byte) 1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!asy", name = "c", descriptor = "(II[I)Z", line = 55)
	public boolean method23173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		for (@Pc(5) Class93_Sub32 local5 = (Class93_Sub32) this.aClass22_42.method428((byte) 8); local5 != null; local5 = (Class93_Sub32) this.aClass22_42.method442(624951919)) {
			if (local5.method13914(arg0, arg1, 843128057)) {
				local5.method13926(arg0, arg1, arg2, (byte) 1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!asy", name = "k", descriptor = "(III[II)Z", line = 65)
	public boolean method23174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4) {
		for (@Pc(5) Class93_Sub32 local5 = (Class93_Sub32) this.aClass22_42.method428((byte) 40); local5 != null; local5 = (Class93_Sub32) this.aClass22_42.method442(213204438)) {
			if (local5.method13915(arg0, arg1, arg2, -222887776)) {
				local5.method13926(arg1, arg2, arg3, (byte) 1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!asy", name = "r", descriptor = "(III[I)Z", line = 65)
	public boolean method23175(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		for (@Pc(5) Class93_Sub32 local5 = (Class93_Sub32) this.aClass22_42.method428((byte) 92); local5 != null; local5 = (Class93_Sub32) this.aClass22_42.method442(67760734)) {
			if (local5.method13915(arg0, arg1, arg2, 1098769640)) {
				local5.method13926(arg1, arg2, arg3, (byte) 1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!asy", name = "v", descriptor = "(III[I)Z", line = 65)
	public boolean method23176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		for (@Pc(5) Class93_Sub32 local5 = (Class93_Sub32) this.aClass22_42.method428((byte) 102); local5 != null; local5 = (Class93_Sub32) this.aClass22_42.method442(2017114598)) {
			if (local5.method13915(arg0, arg1, arg2, 405568737)) {
				local5.method13926(arg1, arg2, arg3, (byte) 1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!asy", name = "f", descriptor = "(S)V", line = 75)
	void method23177(@OriginalArg(0) short arg0) {
		this.anInt3166 = -1387184128;
		this.anInt3167 = 0;
		this.anInt3170 = 571916288;
		this.anInt3169 = 0;
		for (@Pc(17) Class93_Sub32 local17 = (Class93_Sub32) this.aClass22_42.method428((byte) 94); local17 != null; local17 = (Class93_Sub32) this.aClass22_42.method442(456816631)) {
			if (local17.anInt1616 * -1215398805 < this.anInt3166 * -332819059) {
				this.anInt3166 = local17.anInt1616 * 320942039;
			}
			if (local17.anInt1620 * 447541607 > this.anInt3167 * -1863527503) {
				this.anInt3167 = local17.anInt1620 * -513387369;
			}
			if (local17.anInt1619 * -144202293 < this.anInt3170 * 598304723) {
				this.anInt3170 = local17.anInt1619 * -963918039;
			}
			if (local17.anInt1621 * 71730399 > this.anInt3169 * -1436122155) {
				this.anInt3169 = local17.anInt1621 * -634149917;
			}
		}
	}

	@OriginalMember(owner = "client!asy", name = "y", descriptor = "()V", line = 75)
	void method23178() {
		this.anInt3166 = -1387184128;
		this.anInt3167 = 0;
		this.anInt3170 = 571916288;
		this.anInt3169 = 0;
		for (@Pc(17) Class93_Sub32 local17 = (Class93_Sub32) this.aClass22_42.method428((byte) 24); local17 != null; local17 = (Class93_Sub32) this.aClass22_42.method442(2045309715)) {
			if (local17.anInt1616 * -1215398805 < this.anInt3166 * -332819059) {
				this.anInt3166 = local17.anInt1616 * 320942039;
			}
			if (local17.anInt1620 * 447541607 > this.anInt3167 * -1863527503) {
				this.anInt3167 = local17.anInt1620 * -513387369;
			}
			if (local17.anInt1619 * -144202293 < this.anInt3170 * 598304723) {
				this.anInt3170 = local17.anInt1619 * -963918039;
			}
			if (local17.anInt1621 * 71730399 > this.anInt3169 * -1436122155) {
				this.anInt3169 = local17.anInt1621 * -634149917;
			}
		}
	}

	@OriginalMember(owner = "client!asy", name = "x", descriptor = "()V", line = 75)
	void method23179() {
		this.anInt3166 = -1387184128;
		this.anInt3167 = 0;
		this.anInt3170 = 571916288;
		this.anInt3169 = 0;
		for (@Pc(17) Class93_Sub32 local17 = (Class93_Sub32) this.aClass22_42.method428((byte) 33); local17 != null; local17 = (Class93_Sub32) this.aClass22_42.method442(578979314)) {
			if (local17.anInt1616 * -1215398805 < this.anInt3166 * -332819059) {
				this.anInt3166 = local17.anInt1616 * 320942039;
			}
			if (local17.anInt1620 * 447541607 > this.anInt3167 * -1863527503) {
				this.anInt3167 = local17.anInt1620 * -513387369;
			}
			if (local17.anInt1619 * -144202293 < this.anInt3170 * 598304723) {
				this.anInt3170 = local17.anInt1619 * -963918039;
			}
			if (local17.anInt1621 * 71730399 > this.anInt3169 * -1436122155) {
				this.anInt3169 = local17.anInt1621 * -634149917;
			}
		}
	}

	@OriginalMember(owner = "client!asy", name = "h", descriptor = "()V", line = 75)
	void method23180() {
		this.anInt3166 = -1387184128;
		this.anInt3167 = 0;
		this.anInt3170 = 571916288;
		this.anInt3169 = 0;
		for (@Pc(17) Class93_Sub32 local17 = (Class93_Sub32) this.aClass22_42.method428((byte) 40); local17 != null; local17 = (Class93_Sub32) this.aClass22_42.method442(1847672287)) {
			if (local17.anInt1616 * -1215398805 < this.anInt3166 * -332819059) {
				this.anInt3166 = local17.anInt1616 * 320942039;
			}
			if (local17.anInt1620 * 447541607 > this.anInt3167 * -1863527503) {
				this.anInt3167 = local17.anInt1620 * -513387369;
			}
			if (local17.anInt1619 * -144202293 < this.anInt3170 * 598304723) {
				this.anInt3170 = local17.anInt1619 * -963918039;
			}
			if (local17.anInt1621 * 71730399 > this.anInt3169 * -1436122155) {
				this.anInt3169 = local17.anInt1621 * -634149917;
			}
		}
	}

	@OriginalMember(owner = "client!asy", name = "g", descriptor = "(Lclient!py;I)Lclient!asy;", line = 88)
	static Class93_Sub1_Sub20 method23181(@OriginalArg(0) Class497 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Packet local8 = new Packet(arg0.method30064(0, arg1, (byte) 0));
		return Class44_Sub1.method17432(local8, arg1, -2079476285);
	}

	@OriginalMember(owner = "client!asy", name = "a", descriptor = "(Lclient!py;I)Lclient!asy;", line = 88)
	static Class93_Sub1_Sub20 method23182(@OriginalArg(0) Class497 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Packet local8 = new Packet(arg0.method30064(0, arg1, (byte) 0));
		return Class44_Sub1.method17432(local8, arg1, -1937823645);
	}

	@OriginalMember(owner = "client!asy", name = "i", descriptor = "(Lclient!alw;I)Lclient!asy;", line = 93)
	static Class93_Sub1_Sub20 method23183(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		@Pc(30) Class93_Sub1_Sub20 local30 = new Class93_Sub1_Sub20(arg1, arg0.gjstr(1686205357), arg0.gjstr(-226592148), arg0.g4(-118643075), arg0.g4(-118643075), arg0.g1((short) 16384) == 1, arg0.g1((short) 16384), arg0.g1((short) 16384));
		@Pc(34) int local34 = arg0.g1((short) 16384);
		for (@Pc(36) int local36 = 0; local36 < local34; local36++) {
			local30.aClass22_42.method408(new Class93_Sub32(arg0.g1((short) 16384), arg0.g2(-1434290800), arg0.g2(-1434290800), arg0.g2(-1434290800), arg0.g2(-1434290800), arg0.g2(-1434290800), arg0.g2(-1434290800), arg0.g2(-1434290800), arg0.g2(-1434290800)), -1324477167);
		}
		local30.method23177((short) -17799);
		return local30;
	}
}
