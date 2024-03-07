package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!akc")
public class Class93_Sub13 extends Class93 {

	@OriginalMember(owner = "client!akc", name = "h", descriptor = "I")
	static final int anInt1516 = 0;

	@OriginalMember(owner = "client!akc", name = "a", descriptor = "I")
	static final int anInt1517 = 1;

	@OriginalMember(owner = "client!akc", name = "g", descriptor = "I")
	static final int anInt1518 = 2;

	@OriginalMember(owner = "client!akc", name = "i", descriptor = "I")
	static final int anInt1519 = 3;

	@OriginalMember(owner = "client!akc", name = "k", descriptor = "I")
	static final int anInt1525 = 512;

	@OriginalMember(owner = "client!akc", name = "f", descriptor = "Lclient!aat;")
	static Class22 aClass22_21 = new Class22();

	@OriginalMember(owner = "client!akc", name = "w", descriptor = "Lclient!aat;")
	static Class22 aClass22_22 = new Class22();

	@OriginalMember(owner = "client!akc", name = "l", descriptor = "Lclient!aan;")
	static Class16 aClass16_11 = new Class16(16);

	@OriginalMember(owner = "client!akc", name = "x", descriptor = "Lclient!aqc;")
	Class132_Sub1_Sub1_Sub1_Sub1 aClass132_Sub1_Sub1_Sub1_Sub1_1;

	@OriginalMember(owner = "client!akc", name = "q", descriptor = "Lclient!vd;")
	Class610 aClass610_1;

	@OriginalMember(owner = "client!akc", name = "u", descriptor = "I")
	int anInt1506;

	@OriginalMember(owner = "client!akc", name = "d", descriptor = "I")
	int anInt1507;

	@OriginalMember(owner = "client!akc", name = "z", descriptor = "I")
	int anInt1508;

	@OriginalMember(owner = "client!akc", name = "c", descriptor = "I")
	int anInt1509;

	@OriginalMember(owner = "client!akc", name = "at", descriptor = "I")
	int anInt1510;

	@OriginalMember(owner = "client!akc", name = "o", descriptor = "I")
	int anInt1511;

	@OriginalMember(owner = "client!akc", name = "s", descriptor = "I")
	int anInt1512;

	@OriginalMember(owner = "client!akc", name = "p", descriptor = "I")
	int anInt1513;

	@OriginalMember(owner = "client!akc", name = "y", descriptor = "I")
	int anInt1514;

	@OriginalMember(owner = "client!akc", name = "b", descriptor = "Lclient!aqk;")
	Class132_Sub1_Sub1_Sub1_Sub2 aClass132_Sub1_Sub1_Sub1_Sub2_1;

	@OriginalMember(owner = "client!akc", name = "t", descriptor = "Z")
	boolean aBoolean336;

	@OriginalMember(owner = "client!akc", name = "ae", descriptor = "I")
	int anInt1520;

	@OriginalMember(owner = "client!akc", name = "ag", descriptor = "I")
	int anInt1521;

	@OriginalMember(owner = "client!akc", name = "ah", descriptor = "I")
	int anInt1522;

	@OriginalMember(owner = "client!akc", name = "al", descriptor = "Lclient!rw;")
	Class539 aClass539_3;

	@OriginalMember(owner = "client!akc", name = "ac", descriptor = "Lclient!rw;")
	Class539 aClass539_4;

	@OriginalMember(owner = "client!akc", name = "ai", descriptor = "I")
	int anInt1523;

	@OriginalMember(owner = "client!akc", name = "aw", descriptor = "I")
	int anInt1524;

	@OriginalMember(owner = "client!akc", name = "as", descriptor = "[I")
	int[] anIntArray175;

	@OriginalMember(owner = "client!akc", name = "r", descriptor = "Lclient!ox;")
	Class472 aClass472_45 = new Class472(0.0F, 0.0F, 0.0F);

	@OriginalMember(owner = "client!akc", name = "v", descriptor = "Lclient!ox;")
	Class472 aClass472_46 = new Class472(0.0F, 0.0F, 0.0F);

	@OriginalMember(owner = "client!akc", name = "j", descriptor = "I")
	int anInt1515 = 0;

	@OriginalMember(owner = "client!akc", name = "<init>", descriptor = "()V", line = 53)
	Class93_Sub13() {
	}

	@OriginalMember(owner = "client!akc", name = "r", descriptor = "(Z)V", line = 56)
	public static void method13463(@OriginalArg(0) boolean arg0) {
		@Pc(4) Class93_Sub13 local4;
		for (local4 = (Class93_Sub13) aClass22_21.method428((byte) 87); local4 != null; local4 = (Class93_Sub13) aClass22_21.method442(779677154)) {
			if (local4.aClass539_3 != null) {
				local4.aClass539_3.method30803(150, (byte) -56);
				Class274.aClass258_1.method26088(local4.aClass539_3, 2017727678);
				local4.aClass539_3 = null;
			}
			if (local4.aClass539_4 != null) {
				local4.aClass539_4.method30803(150, (byte) -106);
				Class274.aClass258_1.method26088(local4.aClass539_4, 1809207115);
				local4.aClass539_4 = null;
			}
			local4.method23969(1114005354);
		}
		if (!arg0) {
			return;
		}
		for (local4 = (Class93_Sub13) aClass22_22.method428((byte) 82); local4 != null; local4 = (Class93_Sub13) aClass22_22.method442(199000968)) {
			if (local4.aClass539_3 != null) {
				local4.aClass539_3.method30803(150, (byte) 0);
				Class274.aClass258_1.method26088(local4.aClass539_3, 1774279949);
				local4.aClass539_3 = null;
			}
			local4.method23969(-974476097);
		}
		for (local4 = (Class93_Sub13) aClass16_11.method227((byte) 34); local4 != null; local4 = (Class93_Sub13) aClass16_11.method229(1636778297)) {
			if (local4.aClass539_3 != null) {
				local4.aClass539_3.method30803(150, (byte) -83);
				Class274.aClass258_1.method26088(local4.aClass539_3, 1785585349);
				local4.aClass539_3 = null;
			}
			local4.method23969(1016264607);
		}
	}

	@OriginalMember(owner = "client!akc", name = "v", descriptor = "(Z)V", line = 56)
	public static void method13464(@OriginalArg(0) boolean arg0) {
		@Pc(4) Class93_Sub13 local4;
		for (local4 = (Class93_Sub13) aClass22_21.method428((byte) 15); local4 != null; local4 = (Class93_Sub13) aClass22_21.method442(399792551)) {
			if (local4.aClass539_3 != null) {
				local4.aClass539_3.method30803(150, (byte) -65);
				Class274.aClass258_1.method26088(local4.aClass539_3, 2056356025);
				local4.aClass539_3 = null;
			}
			if (local4.aClass539_4 != null) {
				local4.aClass539_4.method30803(150, (byte) -116);
				Class274.aClass258_1.method26088(local4.aClass539_4, 1839301540);
				local4.aClass539_4 = null;
			}
			local4.method23969(1681318004);
		}
		if (!arg0) {
			return;
		}
		for (local4 = (Class93_Sub13) aClass22_22.method428((byte) 97); local4 != null; local4 = (Class93_Sub13) aClass22_22.method442(2116874691)) {
			if (local4.aClass539_3 != null) {
				local4.aClass539_3.method30803(150, (byte) -128);
				Class274.aClass258_1.method26088(local4.aClass539_3, 1575936939);
				local4.aClass539_3 = null;
			}
			local4.method23969(-340120505);
		}
		for (local4 = (Class93_Sub13) aClass16_11.method227((byte) -20); local4 != null; local4 = (Class93_Sub13) aClass16_11.method229(1732437144)) {
			if (local4.aClass539_3 != null) {
				local4.aClass539_3.method30803(150, (byte) -33);
				Class274.aClass258_1.method26088(local4.aClass539_3, 1456174589);
				local4.aClass539_3 = null;
			}
			local4.method23969(-941116172);
		}
	}

	@OriginalMember(owner = "client!akc", name = "y", descriptor = "(Z)V", line = 56)
	public static void method13465(@OriginalArg(0) boolean arg0) {
		@Pc(4) Class93_Sub13 local4;
		for (local4 = (Class93_Sub13) aClass22_21.method428((byte) 22); local4 != null; local4 = (Class93_Sub13) aClass22_21.method442(1486251040)) {
			if (local4.aClass539_3 != null) {
				local4.aClass539_3.method30803(150, (byte) -93);
				Class274.aClass258_1.method26088(local4.aClass539_3, 1857708425);
				local4.aClass539_3 = null;
			}
			if (local4.aClass539_4 != null) {
				local4.aClass539_4.method30803(150, (byte) -93);
				Class274.aClass258_1.method26088(local4.aClass539_4, 2022384553);
				local4.aClass539_4 = null;
			}
			local4.method23969(1573922134);
		}
		if (!arg0) {
			return;
		}
		for (local4 = (Class93_Sub13) aClass22_22.method428((byte) 13); local4 != null; local4 = (Class93_Sub13) aClass22_22.method442(1868958927)) {
			if (local4.aClass539_3 != null) {
				local4.aClass539_3.method30803(150, (byte) -34);
				Class274.aClass258_1.method26088(local4.aClass539_3, 1537464945);
				local4.aClass539_3 = null;
			}
			local4.method23969(1907287176);
		}
		for (local4 = (Class93_Sub13) aClass16_11.method227((byte) 17); local4 != null; local4 = (Class93_Sub13) aClass16_11.method229(1798979929)) {
			if (local4.aClass539_3 != null) {
				local4.aClass539_3.method30803(150, (byte) -24);
				Class274.aClass258_1.method26088(local4.aClass539_3, 2015161381);
				local4.aClass539_3 = null;
			}
			local4.method23969(-1506863012);
		}
	}

	@OriginalMember(owner = "client!akc", name = "h", descriptor = "()V", line = 90)
	public static void method13466() {
		@Pc(4) Class93_Sub13 local4;
		for (local4 = (Class93_Sub13) aClass22_21.method428((byte) 125); local4 != null; local4 = (Class93_Sub13) aClass22_21.method442(1982273119)) {
			if (local4.aBoolean336) {
				local4.method13471((byte) -22);
			}
		}
		for (local4 = (Class93_Sub13) aClass22_22.method428((byte) 59); local4 != null; local4 = (Class93_Sub13) aClass22_22.method442(1674841828)) {
			if (local4.aBoolean336) {
				local4.method13471((byte) -6);
			}
		}
	}

	@OriginalMember(owner = "client!akc", name = "a", descriptor = "()V", line = 90)
	public static void method13467() {
		@Pc(4) Class93_Sub13 local4;
		for (local4 = (Class93_Sub13) aClass22_21.method428((byte) 17); local4 != null; local4 = (Class93_Sub13) aClass22_21.method442(519099771)) {
			if (local4.aBoolean336) {
				local4.method13471((byte) 73);
			}
		}
		for (local4 = (Class93_Sub13) aClass22_22.method428((byte) 56); local4 != null; local4 = (Class93_Sub13) aClass22_22.method442(2138458238)) {
			if (local4.aBoolean336) {
				local4.method13471((byte) 100);
			}
		}
	}

	@OriginalMember(owner = "client!akc", name = "g", descriptor = "()V", line = 90)
	public static void method13468() {
		@Pc(4) Class93_Sub13 local4;
		for (local4 = (Class93_Sub13) aClass22_21.method428((byte) 59); local4 != null; local4 = (Class93_Sub13) aClass22_21.method442(2039149266)) {
			if (local4.aBoolean336) {
				local4.method13471((byte) 10);
			}
		}
		for (local4 = (Class93_Sub13) aClass22_22.method428((byte) 113); local4 != null; local4 = (Class93_Sub13) aClass22_22.method442(703842104)) {
			if (local4.aBoolean336) {
				local4.method13471((byte) 74);
			}
		}
	}

	@OriginalMember(owner = "client!akc", name = "i", descriptor = "()V", line = 90)
	public static void method13469() {
		@Pc(4) Class93_Sub13 local4;
		for (local4 = (Class93_Sub13) aClass22_21.method428((byte) 116); local4 != null; local4 = (Class93_Sub13) aClass22_21.method442(1796150002)) {
			if (local4.aBoolean336) {
				local4.method13471((byte) -38);
			}
		}
		for (local4 = (Class93_Sub13) aClass22_22.method428((byte) 110); local4 != null; local4 = (Class93_Sub13) aClass22_22.method442(433323067)) {
			if (local4.aBoolean336) {
				local4.method13471((byte) 15);
			}
		}
	}

	@OriginalMember(owner = "client!akc", name = "x", descriptor = "()V", line = 90)
	public static void method13470() {
		@Pc(4) Class93_Sub13 local4;
		for (local4 = (Class93_Sub13) aClass22_21.method428((byte) 59); local4 != null; local4 = (Class93_Sub13) aClass22_21.method442(1603893659)) {
			if (local4.aBoolean336) {
				local4.method13471((byte) -15);
			}
		}
		for (local4 = (Class93_Sub13) aClass22_22.method428((byte) 23); local4 != null; local4 = (Class93_Sub13) aClass22_22.method442(183036590)) {
			if (local4.aBoolean336) {
				local4.method13471((byte) -85);
			}
		}
	}

	@OriginalMember(owner = "client!akc", name = "m", descriptor = "(B)V", line = 99)
	void method13471(@OriginalArg(0) byte arg0) {
		@Pc(4) int local4 = this.anInt1522 * 486579173;
		if (this.aClass610_1 != null) {
			@Pc(20) Class610 local20 = this.aClass610_1.method31991(Class624.playerVariableManager, client.anInt3463 * 1819062465 == 0 ? Class249.anInterface23_3 : Class624.playerVariableManager, -115392112);
			if (local20 == null) {
				this.anInt1522 = 1340593683;
				this.anInt1512 = 0;
				this.anInt1514 = 0;
				this.anInt1523 = 0;
				this.anInt1524 = 0;
				this.anIntArray175 = null;
				this.anInt1521 = 256570624;
				this.anInt1520 = 778500352;
				this.anInt1511 = 0;
			} else {
				this.anInt1522 = local20.anInt5613 * -958108791;
				this.anInt1512 = (-732589877 * local20.anInt5614 << 9) * -1068725865;
				this.anInt1514 = local20.anInt5616 * -612368307;
				this.anInt1523 = local20.anInt5617 * -390370221;
				this.anInt1524 = local20.anInt5590 * 1075889437;
				this.anIntArray175 = local20.anIntArray493;
				this.anInt1521 = local20.anInt5620 * 2123601001;
				this.anInt1520 = local20.anInt5618 * -153315611;
			}
		} else if (this.aClass132_Sub1_Sub1_Sub1_Sub1_1 != null) {
			@Pc(110) int local110 = Class566.method31257(this.aClass132_Sub1_Sub1_Sub1_Sub1_1, -996503152);
			if (local4 != local110) {
				this.anInt1522 = local110 * -1340593683;
				@Pc(122) Class336 local122 = this.aClass132_Sub1_Sub1_Sub1_Sub1_1.aClass336_1;
				if (local122.anIntArray412 != null) {
					local122 = local122.method27435(Class624.playerVariableManager, Class624.playerVariableManager, (short) 26278);
				}
				if (local122 == null) {
					this.anInt1511 = 0;
					this.anInt1512 = 0;
					this.anInt1514 = 0;
					this.anInt1521 = 256570624;
					this.anInt1520 = 778500352;
				} else {
					this.anInt1512 = (-2098931717 * local122.anInt4174 << 9) * -1068725865;
					this.anInt1511 = (local122.anInt4175 * -1290378981 << 9) * -790717763;
					this.anInt1514 = local122.anInt4167 * 500628225;
					this.anInt1521 = local122.anInt4155 * -703671773;
					this.anInt1520 = local122.anInt4179 * -942130733;
				}
			}
		} else if (this.aClass132_Sub1_Sub1_Sub1_Sub2_1 != null) {
			this.anInt1522 = Class110_Sub18.method8431(this.aClass132_Sub1_Sub1_Sub1_Sub2_1, -2119467644) * -1340593683;
			this.anInt1512 = (-1513940767 * this.aClass132_Sub1_Sub1_Sub1_Sub2_1.anInt2807 << 9) * -1068725865;
			this.anInt1511 = 0;
			this.anInt1514 = this.aClass132_Sub1_Sub1_Sub1_Sub2_1.anInt2808 * 31129119;
			this.anInt1521 = 256570624;
			this.anInt1520 = 778500352;
		}
		if (this.anInt1522 * 486579173 != local4 && this.aClass539_3 != null && this.aClass539_3 != null) {
			this.aClass539_3.method30803(100, (byte) -105);
			Class274.aClass258_1.method26088(this.aClass539_3, 2036296864);
			this.aClass539_3 = null;
		}
	}

	@OriginalMember(owner = "client!akc", name = "j", descriptor = "()V", line = 99)
	void method13472() {
		@Pc(4) int local4 = this.anInt1522 * 486579173;
		if (this.aClass610_1 != null) {
			@Pc(20) Class610 local20 = this.aClass610_1.method31991(Class624.playerVariableManager, client.anInt3463 * 1819062465 == 0 ? Class249.anInterface23_3 : Class624.playerVariableManager, -80119828);
			if (local20 == null) {
				this.anInt1522 = 1340593683;
				this.anInt1512 = 0;
				this.anInt1514 = 0;
				this.anInt1523 = 0;
				this.anInt1524 = 0;
				this.anIntArray175 = null;
				this.anInt1521 = 256570624;
				this.anInt1520 = 778500352;
				this.anInt1511 = 0;
			} else {
				this.anInt1522 = local20.anInt5613 * -958108791;
				this.anInt1512 = (-732589877 * local20.anInt5614 << 9) * -1068725865;
				this.anInt1514 = local20.anInt5616 * -612368307;
				this.anInt1523 = local20.anInt5617 * -390370221;
				this.anInt1524 = local20.anInt5590 * 1075889437;
				this.anIntArray175 = local20.anIntArray493;
				this.anInt1521 = local20.anInt5620 * 2123601001;
				this.anInt1520 = local20.anInt5618 * -153315611;
			}
		} else if (this.aClass132_Sub1_Sub1_Sub1_Sub1_1 != null) {
			@Pc(110) int local110 = Class566.method31257(this.aClass132_Sub1_Sub1_Sub1_Sub1_1, -1328623395);
			if (local4 != local110) {
				this.anInt1522 = local110 * -1340593683;
				@Pc(122) Class336 local122 = this.aClass132_Sub1_Sub1_Sub1_Sub1_1.aClass336_1;
				if (local122.anIntArray412 != null) {
					local122 = local122.method27435(Class624.playerVariableManager, Class624.playerVariableManager, (short) 26303);
				}
				if (local122 == null) {
					this.anInt1511 = 0;
					this.anInt1512 = 0;
					this.anInt1514 = 0;
					this.anInt1521 = 256570624;
					this.anInt1520 = 778500352;
				} else {
					this.anInt1512 = (-2098931717 * local122.anInt4174 << 9) * -1068725865;
					this.anInt1511 = (local122.anInt4175 * -1290378981 << 9) * -790717763;
					this.anInt1514 = local122.anInt4167 * 500628225;
					this.anInt1521 = local122.anInt4155 * -703671773;
					this.anInt1520 = local122.anInt4179 * -942130733;
				}
			}
		} else if (this.aClass132_Sub1_Sub1_Sub1_Sub2_1 != null) {
			this.anInt1522 = Class110_Sub18.method8431(this.aClass132_Sub1_Sub1_Sub1_Sub2_1, -2101385372) * -1340593683;
			this.anInt1512 = (-1513940767 * this.aClass132_Sub1_Sub1_Sub1_Sub2_1.anInt2807 << 9) * -1068725865;
			this.anInt1511 = 0;
			this.anInt1514 = this.aClass132_Sub1_Sub1_Sub1_Sub2_1.anInt2808 * 31129119;
			this.anInt1521 = 256570624;
			this.anInt1520 = 778500352;
		}
		if (this.anInt1522 * 486579173 != local4 && this.aClass539_3 != null && this.aClass539_3 != null) {
			this.aClass539_3.method30803(100, (byte) -19);
			Class274.aClass258_1.method26088(this.aClass539_3, 1755239543);
			this.aClass539_3 = null;
		}
	}

	@OriginalMember(owner = "client!akc", name = "t", descriptor = "(IIIILclient!vd;Lclient!aqc;Lclient!aqk;)V", line = 166)
	public static void method13473(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class610 arg4, @OriginalArg(5) Class132_Sub1_Sub1_Sub1_Sub1 arg5, @OriginalArg(6) Class132_Sub1_Sub1_Sub1_Sub2 arg6) {
		@Pc(3) Class93_Sub13 local3 = new Class93_Sub13();
		local3.anInt1506 = arg0 * 1680099407;
		local3.anInt1513 = (arg1 << 9) * 1575742085;
		local3.anInt1507 = (arg2 << 9) * 1539129531;
		if (arg4 != null) {
			local3.aClass610_1 = arg4;
			@Pc(32) int local32 = arg4.anInt5608 * 427800467;
			@Pc(37) int local37 = arg4.anInt5603 * -774442965;
			if (arg3 == 1 || arg3 == 3) {
				local32 = arg4.anInt5603 * -774442965;
				local37 = arg4.anInt5608 * 427800467;
			}
			local3.anInt1508 = (local32 + arg1 << 9) * 440138643;
			local3.anInt1509 = (arg2 + local37 << 9) * -465070531;
			local3.anInt1522 = arg4.anInt5613 * -958108791;
			local3.anInt1512 = (arg4.anInt5614 * -732589877 << 9) * -1068725865;
			local3.anInt1514 = arg4.anInt5616 * -612368307;
			local3.anInt1523 = arg4.anInt5617 * -390370221;
			local3.anInt1524 = arg4.anInt5590 * 1075889437;
			local3.anIntArray175 = arg4.anIntArray493;
			local3.anInt1521 = arg4.anInt5620 * 2123601001;
			local3.anInt1520 = arg4.anInt5618 * -153315611;
			local3.anInt1511 = (arg4.anInt5615 * 1029443597 << 9) * -790717763;
			if (arg4.anIntArray492 != null) {
				local3.aBoolean336 = true;
				local3.method13471((byte) -56);
			}
			if (local3.anIntArray175 != null) {
				local3.anInt1510 = (local3.anInt1523 * 1676874203 + (int) (Math.random() * (double) (local3.anInt1524 * 1675476241 - local3.anInt1523 * 1676874203))) * 2090876833;
			}
			aClass22_21.method408(local3, -1251525923);
			Class274.aClass258_1.method26076(local3.anInt1522 * 486579173, (byte) 3);
			Class274.aClass258_1.method26074(local3.anIntArray175, (byte) -18);
		} else if (arg5 != null) {
			local3.aClass132_Sub1_Sub1_Sub1_Sub1_1 = arg5;
			@Pc(191) Class336 local191 = arg5.aClass336_1;
			if (local191.anIntArray412 != null) {
				local3.aBoolean336 = true;
				local191 = local191.method27435(Class624.playerVariableManager, Class624.playerVariableManager, (short) 4636);
			}
			if (local191 != null) {
				local3.anInt1508 = (arg1 + local191.anInt4154 * 447008399 << 9) * 440138643;
				local3.anInt1509 = (arg2 + local191.anInt4154 * 447008399 << 9) * -465070531;
				local3.anInt1522 = Class566.method31257(arg5, 604301821) * -1340593683;
				local3.anInt1512 = (-2098931717 * local191.anInt4174 << 9) * -1068725865;
				local3.anInt1514 = local191.anInt4167 * 500628225;
				local3.anInt1521 = local191.anInt4155 * -703671773;
				local3.anInt1520 = local191.anInt4179 * -942130733;
				local3.anInt1511 = (-1290378981 * local191.anInt4175 << 9) * -790717763;
				Class274.aClass258_1.method26076(local191.anInt4170 * 1249212417, (byte) 3);
				Class274.aClass258_1.method26076(local191.anInt4171 * 965071225, (byte) 3);
				Class274.aClass258_1.method26076(local191.anInt4172 * -374268759, (byte) 3);
				Class274.aClass258_1.method26076(local191.anInt4173 * -2119958049, (byte) 3);
			}
			aClass22_22.method408(local3, -915649186);
		} else if (arg6 != null) {
			local3.aClass132_Sub1_Sub1_Sub1_Sub2_1 = arg6;
			local3.anInt1508 = (arg1 + arg6.method19986(778102014) << 9) * 440138643;
			local3.anInt1509 = (arg2 + arg6.method19986(-650403028) << 9) * -465070531;
			local3.anInt1522 = Class110_Sub18.method8431(arg6, -2113305738) * -1340593683;
			local3.anInt1512 = (-1513940767 * arg6.anInt2807 << 9) * -1068725865;
			local3.anInt1514 = arg6.anInt2808 * 31129119;
			local3.anInt1521 = 256570624;
			local3.anInt1520 = 778500352;
			local3.anInt1511 = 0;
			aClass16_11.method220(local3, (long) (arg6.anInt2768 * -1688488127));
			Class274.aClass258_1.method26076(arg6.anInt2803 * 1706069295, (byte) 3);
			Class274.aClass258_1.method26076(arg6.anInt2797 * 479956847, (byte) 3);
			Class274.aClass258_1.method26076(arg6.anInt2805 * 1263335603, (byte) 3);
			Class274.aClass258_1.method26076(arg6.anInt2806 * -2115122027, (byte) 3);
		}
	}

	@OriginalMember(owner = "client!akc", name = "ae", descriptor = "(IIIILclient!vd;Lclient!aqc;Lclient!aqk;)V", line = 166)
	public static void method13474(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class610 arg4, @OriginalArg(5) Class132_Sub1_Sub1_Sub1_Sub1 arg5, @OriginalArg(6) Class132_Sub1_Sub1_Sub1_Sub2 arg6) {
		@Pc(3) Class93_Sub13 local3 = new Class93_Sub13();
		local3.anInt1506 = arg0 * 1680099407;
		local3.anInt1513 = (arg1 << 9) * 1575742085;
		local3.anInt1507 = (arg2 << 9) * 1539129531;
		if (arg4 != null) {
			local3.aClass610_1 = arg4;
			@Pc(32) int local32 = arg4.anInt5608 * 427800467;
			@Pc(37) int local37 = arg4.anInt5603 * -774442965;
			if (arg3 == 1 || arg3 == 3) {
				local32 = arg4.anInt5603 * -774442965;
				local37 = arg4.anInt5608 * 427800467;
			}
			local3.anInt1508 = (local32 + arg1 << 9) * 440138643;
			local3.anInt1509 = (arg2 + local37 << 9) * -465070531;
			local3.anInt1522 = arg4.anInt5613 * -958108791;
			local3.anInt1512 = (arg4.anInt5614 * -732589877 << 9) * -1068725865;
			local3.anInt1514 = arg4.anInt5616 * -612368307;
			local3.anInt1523 = arg4.anInt5617 * -390370221;
			local3.anInt1524 = arg4.anInt5590 * 1075889437;
			local3.anIntArray175 = arg4.anIntArray493;
			local3.anInt1521 = arg4.anInt5620 * 2123601001;
			local3.anInt1520 = arg4.anInt5618 * -153315611;
			local3.anInt1511 = (arg4.anInt5615 * 1029443597 << 9) * -790717763;
			if (arg4.anIntArray492 != null) {
				local3.aBoolean336 = true;
				local3.method13471((byte) 9);
			}
			if (local3.anIntArray175 != null) {
				local3.anInt1510 = (local3.anInt1523 * 1676874203 + (int) (Math.random() * (double) (local3.anInt1524 * 1675476241 - local3.anInt1523 * 1676874203))) * 2090876833;
			}
			aClass22_21.method408(local3, 191606333);
			Class274.aClass258_1.method26076(local3.anInt1522 * 486579173, (byte) 3);
			Class274.aClass258_1.method26074(local3.anIntArray175, (byte) -87);
		} else if (arg5 != null) {
			local3.aClass132_Sub1_Sub1_Sub1_Sub1_1 = arg5;
			@Pc(191) Class336 local191 = arg5.aClass336_1;
			if (local191.anIntArray412 != null) {
				local3.aBoolean336 = true;
				local191 = local191.method27435(Class624.playerVariableManager, Class624.playerVariableManager, (short) 7422);
			}
			if (local191 != null) {
				local3.anInt1508 = (arg1 + local191.anInt4154 * 447008399 << 9) * 440138643;
				local3.anInt1509 = (arg2 + local191.anInt4154 * 447008399 << 9) * -465070531;
				local3.anInt1522 = Class566.method31257(arg5, -1674452164) * -1340593683;
				local3.anInt1512 = (-2098931717 * local191.anInt4174 << 9) * -1068725865;
				local3.anInt1514 = local191.anInt4167 * 500628225;
				local3.anInt1521 = local191.anInt4155 * -703671773;
				local3.anInt1520 = local191.anInt4179 * -942130733;
				local3.anInt1511 = (-1290378981 * local191.anInt4175 << 9) * -790717763;
				Class274.aClass258_1.method26076(local191.anInt4170 * 1249212417, (byte) 3);
				Class274.aClass258_1.method26076(local191.anInt4171 * 965071225, (byte) 3);
				Class274.aClass258_1.method26076(local191.anInt4172 * -374268759, (byte) 3);
				Class274.aClass258_1.method26076(local191.anInt4173 * -2119958049, (byte) 3);
			}
			aClass22_22.method408(local3, 443383696);
		} else if (arg6 != null) {
			local3.aClass132_Sub1_Sub1_Sub1_Sub2_1 = arg6;
			local3.anInt1508 = (arg1 + arg6.method19986(-1113687253) << 9) * 440138643;
			local3.anInt1509 = (arg2 + arg6.method19986(-864941228) << 9) * -465070531;
			local3.anInt1522 = Class110_Sub18.method8431(arg6, -2142055740) * -1340593683;
			local3.anInt1512 = (-1513940767 * arg6.anInt2807 << 9) * -1068725865;
			local3.anInt1514 = arg6.anInt2808 * 31129119;
			local3.anInt1521 = 256570624;
			local3.anInt1520 = 778500352;
			local3.anInt1511 = 0;
			aClass16_11.method220(local3, (long) (arg6.anInt2768 * -1688488127));
			Class274.aClass258_1.method26076(arg6.anInt2803 * 1706069295, (byte) 3);
			Class274.aClass258_1.method26076(arg6.anInt2797 * 479956847, (byte) 3);
			Class274.aClass258_1.method26076(arg6.anInt2805 * 1263335603, (byte) 3);
			Class274.aClass258_1.method26076(arg6.anInt2806 * -2115122027, (byte) 3);
		}
	}

	@OriginalMember(owner = "client!akc", name = "y", descriptor = "(Ljava/lang/String;CLjava/lang/String;I)Ljava/lang/String;", line = 194)
	public static String method13475(@OriginalArg(0) String arg0, @OriginalArg(1) char arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) {
		@Pc(2) int local2 = arg0.length();
		@Pc(5) int local5 = arg2.length();
		@Pc(7) int local7 = local2;
		@Pc(11) int local11 = local5 - 1;
		if (local11 != 0) {
			@Pc(16) int local16 = 0;
			while (true) {
				local16 = arg0.indexOf(arg1, local16);
				if (local16 < 0) {
					break;
				}
				local16++;
				local7 += local11;
			}
		}
		@Pc(35) StringBuilder local35 = new StringBuilder(local7);
		@Pc(37) int local37 = 0;
		while (true) {
			@Pc(42) int local42 = arg0.indexOf(arg1, local37);
			if (local42 < 0) {
				local35.append(arg0.substring(local37));
				return local35.toString();
			}
			local35.append(arg0.substring(local37, local42));
			local35.append(arg2);
			local37 = local42 + 1;
		}
	}

	@OriginalMember(owner = "client!akc", name = "ah", descriptor = "(IIILclient!vd;)V", line = 240)
	public static void method13476(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class610 arg3) {
		for (@Pc(4) Class93_Sub13 local4 = (Class93_Sub13) aClass22_21.method428((byte) 77); local4 != null; local4 = (Class93_Sub13) aClass22_21.method442(299359838)) {
			if (local4.anInt1506 * 1124978351 == arg0 && local4.anInt1513 * 792297037 == arg1 << 9 && arg2 << 9 == local4.anInt1507 * -1881471885 && arg3.anInt5587 * 365009633 == local4.aClass610_1.anInt5587 * 365009633) {
				if (local4.aClass539_3 != null) {
					local4.aClass539_3.method30803(100, (byte) -38);
					Class274.aClass258_1.method26088(local4.aClass539_3, 1766396716);
					local4.aClass539_3 = null;
				}
				local4.method23969(509894117);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!akc", name = "ag", descriptor = "(IIILclient!vd;)V", line = 240)
	public static void method13477(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class610 arg3) {
		for (@Pc(4) Class93_Sub13 local4 = (Class93_Sub13) aClass22_21.method428((byte) 35); local4 != null; local4 = (Class93_Sub13) aClass22_21.method442(1495705193)) {
			if (local4.anInt1506 * 1124978351 == arg0 && local4.anInt1513 * 792297037 == arg1 << 9 && arg2 << 9 == local4.anInt1507 * -1881471885 && arg3.anInt5587 * 365009633 == local4.aClass610_1.anInt5587 * 365009633) {
				if (local4.aClass539_3 != null) {
					local4.aClass539_3.method30803(100, (byte) -8);
					Class274.aClass258_1.method26088(local4.aClass539_3, 1841794342);
					local4.aClass539_3 = null;
				}
				local4.method23969(931279906);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!akc", name = "al", descriptor = "(IIILclient!vd;)V", line = 240)
	public static void method13478(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class610 arg3) {
		for (@Pc(4) Class93_Sub13 local4 = (Class93_Sub13) aClass22_21.method428((byte) 80); local4 != null; local4 = (Class93_Sub13) aClass22_21.method442(630974650)) {
			if (local4.anInt1506 * 1124978351 == arg0 && local4.anInt1513 * 792297037 == arg1 << 9 && arg2 << 9 == local4.anInt1507 * -1881471885 && arg3.anInt5587 * 365009633 == local4.aClass610_1.anInt5587 * 365009633) {
				if (local4.aClass539_3 != null) {
					local4.aClass539_3.method30803(100, (byte) -93);
					Class274.aClass258_1.method26088(local4.aClass539_3, 1608695560);
					local4.aClass539_3 = null;
				}
				local4.method23969(428757304);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!akc", name = "ac", descriptor = "(Lclient!aqc;)V", line = 254)
	public static void method13479(@OriginalArg(0) Class132_Sub1_Sub1_Sub1_Sub1 arg0) {
		for (@Pc(4) Class93_Sub13 local4 = (Class93_Sub13) aClass22_22.method428((byte) 50); local4 != null; local4 = (Class93_Sub13) aClass22_22.method442(1241351242)) {
			if (arg0 == local4.aClass132_Sub1_Sub1_Sub1_Sub1_1) {
				if (local4.aClass539_3 != null) {
					local4.aClass539_3.method30803(100, (byte) -67);
					Class274.aClass258_1.method26088(local4.aClass539_3, 2085518181);
					local4.aClass539_3 = null;
				}
				local4.method23969(-1468560449);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!akc", name = "ai", descriptor = "(Lclient!aqc;)V", line = 254)
	public static void method13480(@OriginalArg(0) Class132_Sub1_Sub1_Sub1_Sub1 arg0) {
		for (@Pc(4) Class93_Sub13 local4 = (Class93_Sub13) aClass22_22.method428((byte) 102); local4 != null; local4 = (Class93_Sub13) aClass22_22.method442(1012475581)) {
			if (arg0 == local4.aClass132_Sub1_Sub1_Sub1_Sub1_1) {
				if (local4.aClass539_3 != null) {
					local4.aClass539_3.method30803(100, (byte) -121);
					Class274.aClass258_1.method26088(local4.aClass539_3, 1484615704);
					local4.aClass539_3 = null;
				}
				local4.method23969(1449639045);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!akc", name = "aw", descriptor = "(Lclient!aqk;)V", line = 280)
	public static void method13481(@OriginalArg(0) Class132_Sub1_Sub1_Sub1_Sub2 arg0) {
		@Pc(8) Class93_Sub13 local8 = (Class93_Sub13) aClass16_11.method214((long) (arg0.anInt2768 * -1688488127));
		if (local8 == null) {
			Class643.method32582(arg0.aByte100, arg0.anIntArray240[0], arg0.anIntArray239[0], 0, null, null, arg0, 694869299);
		} else {
			local8.method13471((byte) -78);
		}
	}

	@OriginalMember(owner = "client!akc", name = "at", descriptor = "(Lclient!aqc;)I", line = 286)
	static int method13482(@OriginalArg(0) Class132_Sub1_Sub1_Sub1_Sub1 arg0) {
		@Pc(2) Class336 local2 = arg0.aClass336_1;
		if (local2.anIntArray412 != null) {
			local2 = local2.method27435(Class624.playerVariableManager, Class624.playerVariableManager, (short) 22846);
			if (local2 == null) {
				return -1;
			}
		}
		@Pc(22) int local22 = local2.anInt4172 * -374268759;
		@Pc(26) Class622 local26 = arg0.method19997(-860802133);
		@Pc(31) int local31 = arg0.aClass19_Sub3_3.method23564((byte) 37);
		if (local31 == -1 || arg0.aClass19_Sub3_3.aBoolean379) {
			local22 = local2.anInt4170 * 1249212417;
		} else if (local31 == local26.anInt5680 * 1046628773 || local31 == local26.anInt5654 * 884977547 || local31 == local26.anInt5656 * 1632091583 || local26.anInt5655 * 1798234475 == local31) {
			local22 = local2.anInt4173 * -2119958049;
		} else if (local26.anInt5657 * -2077928117 == local31 || local31 == local26.anInt5658 * 1363226867 || local26.anInt5645 * 285037349 == local31 || local31 == local26.anInt5653 * -2038961455) {
			local22 = local2.anInt4171 * 965071225;
		}
		return local22;
	}

	@OriginalMember(owner = "client!akc", name = "as", descriptor = "(Lclient!aqc;)I", line = 286)
	static int method13483(@OriginalArg(0) Class132_Sub1_Sub1_Sub1_Sub1 arg0) {
		@Pc(2) Class336 local2 = arg0.aClass336_1;
		if (local2.anIntArray412 != null) {
			local2 = local2.method27435(Class624.playerVariableManager, Class624.playerVariableManager, (short) 26957);
			if (local2 == null) {
				return -1;
			}
		}
		@Pc(22) int local22 = local2.anInt4172 * -374268759;
		@Pc(26) Class622 local26 = arg0.method19997(303017706);
		@Pc(31) int local31 = arg0.aClass19_Sub3_3.method23564((byte) 68);
		if (local31 == -1 || arg0.aClass19_Sub3_3.aBoolean379) {
			local22 = local2.anInt4170 * 1249212417;
		} else if (local31 == local26.anInt5680 * 1046628773 || local31 == local26.anInt5654 * 884977547 || local31 == local26.anInt5656 * 1632091583 || local26.anInt5655 * 1798234475 == local31) {
			local22 = local2.anInt4173 * -2119958049;
		} else if (local26.anInt5657 * -2077928117 == local31 || local31 == local26.anInt5658 * 1363226867 || local26.anInt5645 * 285037349 == local31 || local31 == local26.anInt5653 * -2038961455) {
			local22 = local2.anInt4171 * 965071225;
		}
		return local22;
	}

	@OriginalMember(owner = "client!akc", name = "ad", descriptor = "(Lclient!aqk;)I", line = 301)
	static int method13484(@OriginalArg(0) Class132_Sub1_Sub1_Sub1_Sub2 arg0) {
		@Pc(4) int local4 = arg0.anInt2805 * 1263335603;
		@Pc(8) Class622 local8 = arg0.method19997(-1180218776);
		@Pc(13) int local13 = arg0.aClass19_Sub3_3.method23564((byte) 116);
		if (local13 == -1 || arg0.aClass19_Sub3_3.aBoolean379) {
			local4 = arg0.anInt2803 * 1706069295;
		} else if (local8.anInt5680 * 1046628773 == local13 || local8.anInt5654 * 884977547 == local13 || local13 == local8.anInt5656 * 1632091583 || local8.anInt5655 * 1798234475 == local13) {
			local4 = arg0.anInt2806 * -2115122027;
		} else if (local13 == local8.anInt5657 * -2077928117 || local13 == local8.anInt5658 * 1363226867 || local13 == local8.anInt5645 * 285037349 || local8.anInt5653 * -2038961455 == local13) {
			local4 = arg0.anInt2797 * 479956847;
		}
		return local4;
	}

	@OriginalMember(owner = "client!akc", name = "am", descriptor = "(Lclient!aqk;)I", line = 301)
	static int method13485(@OriginalArg(0) Class132_Sub1_Sub1_Sub1_Sub2 arg0) {
		@Pc(4) int local4 = arg0.anInt2805 * 1263335603;
		@Pc(8) Class622 local8 = arg0.method19997(-1098333166);
		@Pc(13) int local13 = arg0.aClass19_Sub3_3.method23564((byte) 41);
		if (local13 == -1 || arg0.aClass19_Sub3_3.aBoolean379) {
			local4 = arg0.anInt2803 * 1706069295;
		} else if (local8.anInt5680 * 1046628773 == local13 || local8.anInt5654 * 884977547 == local13 || local13 == local8.anInt5656 * 1632091583 || local8.anInt5655 * 1798234475 == local13) {
			local4 = arg0.anInt2806 * -2115122027;
		} else if (local13 == local8.anInt5657 * -2077928117 || local13 == local8.anInt5658 * 1363226867 || local13 == local8.anInt5645 * 285037349 || local8.anInt5653 * -2038961455 == local13) {
			local4 = arg0.anInt2797 * 479956847;
		}
		return local4;
	}

	@OriginalMember(owner = "client!akc", name = "aq", descriptor = "(IIII)V", line = 311)
	public static void method13486(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class93_Sub13 local4;
		for (local4 = (Class93_Sub13) aClass22_21.method428((byte) 79); local4 != null; local4 = (Class93_Sub13) aClass22_21.method442(1543575139)) {
			Class527.method30388(local4, arg0, arg1, arg2, arg3, -735811045);
		}
		@Pc(29) byte local29;
		@Pc(34) Class622 local34;
		@Pc(40) int local40;
		@Pc(115) int local115;
		@Pc(218) Class472 local218;
		for (local4 = (Class93_Sub13) aClass22_22.method428((byte) 118); local4 != null; local4 = (Class93_Sub13) aClass22_22.method442(299686773)) {
			local29 = 1;
			local34 = local4.aClass132_Sub1_Sub1_Sub1_Sub1_1.method19997(359236661);
			local40 = local4.aClass132_Sub1_Sub1_Sub1_Sub1_1.aClass19_Sub3_3.method23564((byte) 69);
			if (local40 == -1 || local4.aClass132_Sub1_Sub1_Sub1_Sub1_1.aClass19_Sub3_3.aBoolean379) {
				local29 = 0;
			} else if (local40 == local34.anInt5680 * 1046628773 || local34.anInt5654 * 884977547 == local40 || local40 == local34.anInt5656 * 1632091583 || local40 == local34.anInt5655 * 1798234475) {
				local29 = 2;
			} else if (local40 == local34.anInt5657 * -2077928117 || local40 == local34.anInt5658 * 1363226867 || local34.anInt5645 * 285037349 == local40 || local34.anInt5653 * -2038961455 == local40) {
				local29 = 3;
			}
			if (local4.anInt1515 * 1201626885 != local29) {
				local115 = Class566.method31257(local4.aClass132_Sub1_Sub1_Sub1_Sub1_1, 530261123);
				@Pc(119) Class336 local119 = local4.aClass132_Sub1_Sub1_Sub1_Sub1_1.aClass336_1;
				if (local119.anIntArray412 != null) {
					local119 = local119.method27435(Class624.playerVariableManager, Class624.playerVariableManager, (short) 11066);
				}
				if (local119 == null || local115 == -1) {
					local4.anInt1522 = 1340593683;
					local4.anInt1515 = local29 * -449342003;
				} else if (local115 == local4.anInt1522 * 486579173) {
					local4.anInt1515 = local29 * -449342003;
					local4.anInt1514 = local119.anInt4167 * 500628225;
				} else {
					@Pc(151) boolean local151 = false;
					if (local4.aClass539_3 == null) {
						local151 = true;
					} else {
						local4.anInt1514 -= 1825123840;
						if (local4.anInt1514 * 1666407207 <= 0) {
							local4.aClass539_3.method30803(100, (byte) -12);
							Class274.aClass258_1.method26088(local4.aClass539_3, 1667315143);
							local4.aClass539_3 = null;
							local151 = true;
						}
					}
					if (local151) {
						local4.anInt1514 = local119.anInt4167 * 500628225;
						local4.anInt1522 = local115 * -1340593683;
						local4.anInt1515 = local29 * -449342003;
					}
				}
			}
			local218 = local4.aClass132_Sub1_Sub1_Sub1_Sub1_1.method24220().aClass472_61;
			local4.anInt1513 = (int) local218.aFloat317 * 1575742085;
			local4.anInt1508 = ((int) local218.aFloat317 + (local4.aClass132_Sub1_Sub1_Sub1_Sub1_1.method19986(12841787) << 8)) * 440138643;
			local4.anInt1507 = (int) local218.aFloat319 * 1539129531;
			local4.anInt1509 = ((int) local218.aFloat319 + (local4.aClass132_Sub1_Sub1_Sub1_Sub1_1.method19986(178966718) << 8)) * -465070531;
			local4.anInt1506 = local4.aClass132_Sub1_Sub1_Sub1_Sub1_1.aByte100 * 1680099407;
			Class527.method30388(local4, arg0, arg1, arg2, arg3, -735811045);
		}
		for (local4 = (Class93_Sub13) aClass16_11.method227((byte) -29); local4 != null; local4 = (Class93_Sub13) aClass16_11.method229(1699039800)) {
			local29 = 1;
			local34 = local4.aClass132_Sub1_Sub1_Sub1_Sub2_1.method19997(1725596905);
			local40 = local4.aClass132_Sub1_Sub1_Sub1_Sub2_1.aClass19_Sub3_3.method23564((byte) 105);
			if (local40 == -1 || local4.aClass132_Sub1_Sub1_Sub1_Sub2_1.aClass19_Sub3_3.aBoolean379) {
				local29 = 0;
			} else if (local34.anInt5680 * 1046628773 == local40 || local34.anInt5654 * 884977547 == local40 || local34.anInt5656 * 1632091583 == local40 || local34.anInt5655 * 1798234475 == local40) {
				local29 = 2;
			} else if (local40 == local34.anInt5657 * -2077928117 || local34.anInt5658 * 1363226867 == local40 || local40 == local34.anInt5645 * 285037349 || local40 == local34.anInt5653 * -2038961455) {
				local29 = 3;
			}
			if (local29 != local4.anInt1515 * 1201626885) {
				local115 = Class110_Sub18.method8431(local4.aClass132_Sub1_Sub1_Sub1_Sub2_1, -2134844190);
				if (local4.anInt1522 * 486579173 == local115) {
					local4.anInt1514 = local4.aClass132_Sub1_Sub1_Sub1_Sub2_1.anInt2808 * 31129119;
					local4.anInt1515 = local29 * -449342003;
				} else {
					@Pc(384) boolean local384 = false;
					if (local4.aClass539_3 == null) {
						local384 = true;
					} else {
						local4.anInt1514 -= 1825123840;
						if (local4.anInt1514 * 1666407207 <= 0) {
							local4.aClass539_3.method30803(100, (byte) -80);
							Class274.aClass258_1.method26088(local4.aClass539_3, 1882403063);
							local4.aClass539_3 = null;
							local384 = true;
						}
					}
					if (local384) {
						local4.anInt1514 = local4.aClass132_Sub1_Sub1_Sub1_Sub2_1.anInt2808 * 31129119;
						local4.anInt1522 = local115 * -1340593683;
						local4.anInt1515 = local29 * -449342003;
					}
				}
			}
			local218 = local4.aClass132_Sub1_Sub1_Sub1_Sub2_1.method24220().aClass472_61;
			local4.anInt1513 = (int) local218.aFloat317 * 1575742085;
			local4.anInt1508 = ((int) local218.aFloat317 + (local4.aClass132_Sub1_Sub1_Sub1_Sub2_1.method19986(1623716227) << 8)) * 440138643;
			local4.anInt1507 = (int) local218.aFloat319 * 1539129531;
			local4.anInt1509 = ((int) local218.aFloat319 + (local4.aClass132_Sub1_Sub1_Sub1_Sub2_1.method19986(-1465689865) << 8)) * -465070531;
			local4.anInt1506 = local4.aClass132_Sub1_Sub1_Sub1_Sub2_1.aByte100 * 1680099407;
			Class527.method30388(local4, arg0, arg1, arg2, arg3, -735811045);
		}
	}

	@OriginalMember(owner = "client!akc", name = "ap", descriptor = "(IIII)V", line = 311)
	public static void method13487(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class93_Sub13 local4;
		for (local4 = (Class93_Sub13) aClass22_21.method428((byte) 60); local4 != null; local4 = (Class93_Sub13) aClass22_21.method442(486112565)) {
			Class527.method30388(local4, arg0, arg1, arg2, arg3, -735811045);
		}
		@Pc(29) byte local29;
		@Pc(34) Class622 local34;
		@Pc(40) int local40;
		@Pc(115) int local115;
		@Pc(218) Class472 local218;
		for (local4 = (Class93_Sub13) aClass22_22.method428((byte) 66); local4 != null; local4 = (Class93_Sub13) aClass22_22.method442(529325733)) {
			local29 = 1;
			local34 = local4.aClass132_Sub1_Sub1_Sub1_Sub1_1.method19997(100618283);
			local40 = local4.aClass132_Sub1_Sub1_Sub1_Sub1_1.aClass19_Sub3_3.method23564((byte) 49);
			if (local40 == -1 || local4.aClass132_Sub1_Sub1_Sub1_Sub1_1.aClass19_Sub3_3.aBoolean379) {
				local29 = 0;
			} else if (local40 == local34.anInt5680 * 1046628773 || local34.anInt5654 * 884977547 == local40 || local40 == local34.anInt5656 * 1632091583 || local40 == local34.anInt5655 * 1798234475) {
				local29 = 2;
			} else if (local40 == local34.anInt5657 * -2077928117 || local40 == local34.anInt5658 * 1363226867 || local34.anInt5645 * 285037349 == local40 || local34.anInt5653 * -2038961455 == local40) {
				local29 = 3;
			}
			if (local4.anInt1515 * 1201626885 != local29) {
				local115 = Class566.method31257(local4.aClass132_Sub1_Sub1_Sub1_Sub1_1, -1103739151);
				@Pc(119) Class336 local119 = local4.aClass132_Sub1_Sub1_Sub1_Sub1_1.aClass336_1;
				if (local119.anIntArray412 != null) {
					local119 = local119.method27435(Class624.playerVariableManager, Class624.playerVariableManager, (short) 11447);
				}
				if (local119 == null || local115 == -1) {
					local4.anInt1522 = 1340593683;
					local4.anInt1515 = local29 * -449342003;
				} else if (local115 == local4.anInt1522 * 486579173) {
					local4.anInt1515 = local29 * -449342003;
					local4.anInt1514 = local119.anInt4167 * 500628225;
				} else {
					@Pc(151) boolean local151 = false;
					if (local4.aClass539_3 == null) {
						local151 = true;
					} else {
						local4.anInt1514 -= 1825123840;
						if (local4.anInt1514 * 1666407207 <= 0) {
							local4.aClass539_3.method30803(100, (byte) -1);
							Class274.aClass258_1.method26088(local4.aClass539_3, 1938681226);
							local4.aClass539_3 = null;
							local151 = true;
						}
					}
					if (local151) {
						local4.anInt1514 = local119.anInt4167 * 500628225;
						local4.anInt1522 = local115 * -1340593683;
						local4.anInt1515 = local29 * -449342003;
					}
				}
			}
			local218 = local4.aClass132_Sub1_Sub1_Sub1_Sub1_1.method24220().aClass472_61;
			local4.anInt1513 = (int) local218.aFloat317 * 1575742085;
			local4.anInt1508 = ((int) local218.aFloat317 + (local4.aClass132_Sub1_Sub1_Sub1_Sub1_1.method19986(-1796295363) << 8)) * 440138643;
			local4.anInt1507 = (int) local218.aFloat319 * 1539129531;
			local4.anInt1509 = ((int) local218.aFloat319 + (local4.aClass132_Sub1_Sub1_Sub1_Sub1_1.method19986(1446555958) << 8)) * -465070531;
			local4.anInt1506 = local4.aClass132_Sub1_Sub1_Sub1_Sub1_1.aByte100 * 1680099407;
			Class527.method30388(local4, arg0, arg1, arg2, arg3, -735811045);
		}
		for (local4 = (Class93_Sub13) aClass16_11.method227((byte) -23); local4 != null; local4 = (Class93_Sub13) aClass16_11.method229(1714418594)) {
			local29 = 1;
			local34 = local4.aClass132_Sub1_Sub1_Sub1_Sub2_1.method19997(-558033482);
			local40 = local4.aClass132_Sub1_Sub1_Sub1_Sub2_1.aClass19_Sub3_3.method23564((byte) 9);
			if (local40 == -1 || local4.aClass132_Sub1_Sub1_Sub1_Sub2_1.aClass19_Sub3_3.aBoolean379) {
				local29 = 0;
			} else if (local34.anInt5680 * 1046628773 == local40 || local34.anInt5654 * 884977547 == local40 || local34.anInt5656 * 1632091583 == local40 || local34.anInt5655 * 1798234475 == local40) {
				local29 = 2;
			} else if (local40 == local34.anInt5657 * -2077928117 || local34.anInt5658 * 1363226867 == local40 || local40 == local34.anInt5645 * 285037349 || local40 == local34.anInt5653 * -2038961455) {
				local29 = 3;
			}
			if (local29 != local4.anInt1515 * 1201626885) {
				local115 = Class110_Sub18.method8431(local4.aClass132_Sub1_Sub1_Sub1_Sub2_1, -2109190538);
				if (local4.anInt1522 * 486579173 == local115) {
					local4.anInt1514 = local4.aClass132_Sub1_Sub1_Sub1_Sub2_1.anInt2808 * 31129119;
					local4.anInt1515 = local29 * -449342003;
				} else {
					@Pc(384) boolean local384 = false;
					if (local4.aClass539_3 == null) {
						local384 = true;
					} else {
						local4.anInt1514 -= 1825123840;
						if (local4.anInt1514 * 1666407207 <= 0) {
							local4.aClass539_3.method30803(100, (byte) -16);
							Class274.aClass258_1.method26088(local4.aClass539_3, 1871373875);
							local4.aClass539_3 = null;
							local384 = true;
						}
					}
					if (local384) {
						local4.anInt1514 = local4.aClass132_Sub1_Sub1_Sub1_Sub2_1.anInt2808 * 31129119;
						local4.anInt1522 = local115 * -1340593683;
						local4.anInt1515 = local29 * -449342003;
					}
				}
			}
			local218 = local4.aClass132_Sub1_Sub1_Sub1_Sub2_1.method24220().aClass472_61;
			local4.anInt1513 = (int) local218.aFloat317 * 1575742085;
			local4.anInt1508 = ((int) local218.aFloat317 + (local4.aClass132_Sub1_Sub1_Sub1_Sub2_1.method19986(-656197375) << 8)) * 440138643;
			local4.anInt1507 = (int) local218.aFloat319 * 1539129531;
			local4.anInt1509 = ((int) local218.aFloat319 + (local4.aClass132_Sub1_Sub1_Sub1_Sub2_1.method19986(-279139258) << 8)) * -465070531;
			local4.anInt1506 = local4.aClass132_Sub1_Sub1_Sub1_Sub2_1.aByte100 * 1680099407;
			Class527.method30388(local4, arg0, arg1, arg2, arg3, -735811045);
		}
	}

	@OriginalMember(owner = "client!akc", name = "ar", descriptor = "(IIII)V", line = 311)
	public static void method13488(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class93_Sub13 local4;
		for (local4 = (Class93_Sub13) aClass22_21.method428((byte) 76); local4 != null; local4 = (Class93_Sub13) aClass22_21.method442(1579241360)) {
			Class527.method30388(local4, arg0, arg1, arg2, arg3, -735811045);
		}
		@Pc(29) byte local29;
		@Pc(34) Class622 local34;
		@Pc(40) int local40;
		@Pc(115) int local115;
		@Pc(218) Class472 local218;
		for (local4 = (Class93_Sub13) aClass22_22.method428((byte) 44); local4 != null; local4 = (Class93_Sub13) aClass22_22.method442(228999397)) {
			local29 = 1;
			local34 = local4.aClass132_Sub1_Sub1_Sub1_Sub1_1.method19997(1045476296);
			local40 = local4.aClass132_Sub1_Sub1_Sub1_Sub1_1.aClass19_Sub3_3.method23564((byte) 42);
			if (local40 == -1 || local4.aClass132_Sub1_Sub1_Sub1_Sub1_1.aClass19_Sub3_3.aBoolean379) {
				local29 = 0;
			} else if (local40 == local34.anInt5680 * 1046628773 || local34.anInt5654 * 884977547 == local40 || local40 == local34.anInt5656 * 1632091583 || local40 == local34.anInt5655 * 1798234475) {
				local29 = 2;
			} else if (local40 == local34.anInt5657 * -2077928117 || local40 == local34.anInt5658 * 1363226867 || local34.anInt5645 * 285037349 == local40 || local34.anInt5653 * -2038961455 == local40) {
				local29 = 3;
			}
			if (local4.anInt1515 * 1201626885 != local29) {
				local115 = Class566.method31257(local4.aClass132_Sub1_Sub1_Sub1_Sub1_1, 571250632);
				@Pc(119) Class336 local119 = local4.aClass132_Sub1_Sub1_Sub1_Sub1_1.aClass336_1;
				if (local119.anIntArray412 != null) {
					local119 = local119.method27435(Class624.playerVariableManager, Class624.playerVariableManager, (short) 13499);
				}
				if (local119 == null || local115 == -1) {
					local4.anInt1522 = 1340593683;
					local4.anInt1515 = local29 * -449342003;
				} else if (local115 == local4.anInt1522 * 486579173) {
					local4.anInt1515 = local29 * -449342003;
					local4.anInt1514 = local119.anInt4167 * 500628225;
				} else {
					@Pc(151) boolean local151 = false;
					if (local4.aClass539_3 == null) {
						local151 = true;
					} else {
						local4.anInt1514 -= 1825123840;
						if (local4.anInt1514 * 1666407207 <= 0) {
							local4.aClass539_3.method30803(100, (byte) -12);
							Class274.aClass258_1.method26088(local4.aClass539_3, 1911157233);
							local4.aClass539_3 = null;
							local151 = true;
						}
					}
					if (local151) {
						local4.anInt1514 = local119.anInt4167 * 500628225;
						local4.anInt1522 = local115 * -1340593683;
						local4.anInt1515 = local29 * -449342003;
					}
				}
			}
			local218 = local4.aClass132_Sub1_Sub1_Sub1_Sub1_1.method24220().aClass472_61;
			local4.anInt1513 = (int) local218.aFloat317 * 1575742085;
			local4.anInt1508 = ((int) local218.aFloat317 + (local4.aClass132_Sub1_Sub1_Sub1_Sub1_1.method19986(90859102) << 8)) * 440138643;
			local4.anInt1507 = (int) local218.aFloat319 * 1539129531;
			local4.anInt1509 = ((int) local218.aFloat319 + (local4.aClass132_Sub1_Sub1_Sub1_Sub1_1.method19986(-84867506) << 8)) * -465070531;
			local4.anInt1506 = local4.aClass132_Sub1_Sub1_Sub1_Sub1_1.aByte100 * 1680099407;
			Class527.method30388(local4, arg0, arg1, arg2, arg3, -735811045);
		}
		for (local4 = (Class93_Sub13) aClass16_11.method227((byte) -27); local4 != null; local4 = (Class93_Sub13) aClass16_11.method229(1853609570)) {
			local29 = 1;
			local34 = local4.aClass132_Sub1_Sub1_Sub1_Sub2_1.method19997(-462807267);
			local40 = local4.aClass132_Sub1_Sub1_Sub1_Sub2_1.aClass19_Sub3_3.method23564((byte) 116);
			if (local40 == -1 || local4.aClass132_Sub1_Sub1_Sub1_Sub2_1.aClass19_Sub3_3.aBoolean379) {
				local29 = 0;
			} else if (local34.anInt5680 * 1046628773 == local40 || local34.anInt5654 * 884977547 == local40 || local34.anInt5656 * 1632091583 == local40 || local34.anInt5655 * 1798234475 == local40) {
				local29 = 2;
			} else if (local40 == local34.anInt5657 * -2077928117 || local34.anInt5658 * 1363226867 == local40 || local40 == local34.anInt5645 * 285037349 || local40 == local34.anInt5653 * -2038961455) {
				local29 = 3;
			}
			if (local29 != local4.anInt1515 * 1201626885) {
				local115 = Class110_Sub18.method8431(local4.aClass132_Sub1_Sub1_Sub1_Sub2_1, -2108027674);
				if (local4.anInt1522 * 486579173 == local115) {
					local4.anInt1514 = local4.aClass132_Sub1_Sub1_Sub1_Sub2_1.anInt2808 * 31129119;
					local4.anInt1515 = local29 * -449342003;
				} else {
					@Pc(384) boolean local384 = false;
					if (local4.aClass539_3 == null) {
						local384 = true;
					} else {
						local4.anInt1514 -= 1825123840;
						if (local4.anInt1514 * 1666407207 <= 0) {
							local4.aClass539_3.method30803(100, (byte) -118);
							Class274.aClass258_1.method26088(local4.aClass539_3, 1959243072);
							local4.aClass539_3 = null;
							local384 = true;
						}
					}
					if (local384) {
						local4.anInt1514 = local4.aClass132_Sub1_Sub1_Sub1_Sub2_1.anInt2808 * 31129119;
						local4.anInt1522 = local115 * -1340593683;
						local4.anInt1515 = local29 * -449342003;
					}
				}
			}
			local218 = local4.aClass132_Sub1_Sub1_Sub1_Sub2_1.method24220().aClass472_61;
			local4.anInt1513 = (int) local218.aFloat317 * 1575742085;
			local4.anInt1508 = ((int) local218.aFloat317 + (local4.aClass132_Sub1_Sub1_Sub1_Sub2_1.method19986(-1199014831) << 8)) * 440138643;
			local4.anInt1507 = (int) local218.aFloat319 * 1539129531;
			local4.anInt1509 = ((int) local218.aFloat319 + (local4.aClass132_Sub1_Sub1_Sub1_Sub2_1.method19986(-210326670) << 8)) * -465070531;
			local4.anInt1506 = local4.aClass132_Sub1_Sub1_Sub1_Sub2_1.aByte100 * 1680099407;
			Class527.method30388(local4, arg0, arg1, arg2, arg3, -735811045);
		}
	}

	@OriginalMember(owner = "client!akc", name = "au", descriptor = "(IIII)V", line = 311)
	public static void method13489(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class93_Sub13 local4;
		for (local4 = (Class93_Sub13) aClass22_21.method428((byte) 93); local4 != null; local4 = (Class93_Sub13) aClass22_21.method442(998790458)) {
			Class527.method30388(local4, arg0, arg1, arg2, arg3, -735811045);
		}
		@Pc(29) byte local29;
		@Pc(34) Class622 local34;
		@Pc(40) int local40;
		@Pc(115) int local115;
		@Pc(218) Class472 local218;
		for (local4 = (Class93_Sub13) aClass22_22.method428((byte) 123); local4 != null; local4 = (Class93_Sub13) aClass22_22.method442(1858572574)) {
			local29 = 1;
			local34 = local4.aClass132_Sub1_Sub1_Sub1_Sub1_1.method19997(-1474588803);
			local40 = local4.aClass132_Sub1_Sub1_Sub1_Sub1_1.aClass19_Sub3_3.method23564((byte) 100);
			if (local40 == -1 || local4.aClass132_Sub1_Sub1_Sub1_Sub1_1.aClass19_Sub3_3.aBoolean379) {
				local29 = 0;
			} else if (local40 == local34.anInt5680 * 1046628773 || local34.anInt5654 * 884977547 == local40 || local40 == local34.anInt5656 * 1632091583 || local40 == local34.anInt5655 * 1798234475) {
				local29 = 2;
			} else if (local40 == local34.anInt5657 * -2077928117 || local40 == local34.anInt5658 * 1363226867 || local34.anInt5645 * 285037349 == local40 || local34.anInt5653 * -2038961455 == local40) {
				local29 = 3;
			}
			if (local4.anInt1515 * 1201626885 != local29) {
				local115 = Class566.method31257(local4.aClass132_Sub1_Sub1_Sub1_Sub1_1, -2025861728);
				@Pc(119) Class336 local119 = local4.aClass132_Sub1_Sub1_Sub1_Sub1_1.aClass336_1;
				if (local119.anIntArray412 != null) {
					local119 = local119.method27435(Class624.playerVariableManager, Class624.playerVariableManager, (short) 23956);
				}
				if (local119 == null || local115 == -1) {
					local4.anInt1522 = 1340593683;
					local4.anInt1515 = local29 * -449342003;
				} else if (local115 == local4.anInt1522 * 486579173) {
					local4.anInt1515 = local29 * -449342003;
					local4.anInt1514 = local119.anInt4167 * 500628225;
				} else {
					@Pc(151) boolean local151 = false;
					if (local4.aClass539_3 == null) {
						local151 = true;
					} else {
						local4.anInt1514 -= 1825123840;
						if (local4.anInt1514 * 1666407207 <= 0) {
							local4.aClass539_3.method30803(100, (byte) -25);
							Class274.aClass258_1.method26088(local4.aClass539_3, 2083651544);
							local4.aClass539_3 = null;
							local151 = true;
						}
					}
					if (local151) {
						local4.anInt1514 = local119.anInt4167 * 500628225;
						local4.anInt1522 = local115 * -1340593683;
						local4.anInt1515 = local29 * -449342003;
					}
				}
			}
			local218 = local4.aClass132_Sub1_Sub1_Sub1_Sub1_1.method24220().aClass472_61;
			local4.anInt1513 = (int) local218.aFloat317 * 1575742085;
			local4.anInt1508 = ((int) local218.aFloat317 + (local4.aClass132_Sub1_Sub1_Sub1_Sub1_1.method19986(1766718492) << 8)) * 440138643;
			local4.anInt1507 = (int) local218.aFloat319 * 1539129531;
			local4.anInt1509 = ((int) local218.aFloat319 + (local4.aClass132_Sub1_Sub1_Sub1_Sub1_1.method19986(1759736873) << 8)) * -465070531;
			local4.anInt1506 = local4.aClass132_Sub1_Sub1_Sub1_Sub1_1.aByte100 * 1680099407;
			Class527.method30388(local4, arg0, arg1, arg2, arg3, -735811045);
		}
		for (local4 = (Class93_Sub13) aClass16_11.method227((byte) -67); local4 != null; local4 = (Class93_Sub13) aClass16_11.method229(1817852950)) {
			local29 = 1;
			local34 = local4.aClass132_Sub1_Sub1_Sub1_Sub2_1.method19997(1424902991);
			local40 = local4.aClass132_Sub1_Sub1_Sub1_Sub2_1.aClass19_Sub3_3.method23564((byte) 25);
			if (local40 == -1 || local4.aClass132_Sub1_Sub1_Sub1_Sub2_1.aClass19_Sub3_3.aBoolean379) {
				local29 = 0;
			} else if (local34.anInt5680 * 1046628773 == local40 || local34.anInt5654 * 884977547 == local40 || local34.anInt5656 * 1632091583 == local40 || local34.anInt5655 * 1798234475 == local40) {
				local29 = 2;
			} else if (local40 == local34.anInt5657 * -2077928117 || local34.anInt5658 * 1363226867 == local40 || local40 == local34.anInt5645 * 285037349 || local40 == local34.anInt5653 * -2038961455) {
				local29 = 3;
			}
			if (local29 != local4.anInt1515 * 1201626885) {
				local115 = Class110_Sub18.method8431(local4.aClass132_Sub1_Sub1_Sub1_Sub2_1, -2102205747);
				if (local4.anInt1522 * 486579173 == local115) {
					local4.anInt1514 = local4.aClass132_Sub1_Sub1_Sub1_Sub2_1.anInt2808 * 31129119;
					local4.anInt1515 = local29 * -449342003;
				} else {
					@Pc(384) boolean local384 = false;
					if (local4.aClass539_3 == null) {
						local384 = true;
					} else {
						local4.anInt1514 -= 1825123840;
						if (local4.anInt1514 * 1666407207 <= 0) {
							local4.aClass539_3.method30803(100, (byte) -107);
							Class274.aClass258_1.method26088(local4.aClass539_3, 1866096181);
							local4.aClass539_3 = null;
							local384 = true;
						}
					}
					if (local384) {
						local4.anInt1514 = local4.aClass132_Sub1_Sub1_Sub1_Sub2_1.anInt2808 * 31129119;
						local4.anInt1522 = local115 * -1340593683;
						local4.anInt1515 = local29 * -449342003;
					}
				}
			}
			local218 = local4.aClass132_Sub1_Sub1_Sub1_Sub2_1.method24220().aClass472_61;
			local4.anInt1513 = (int) local218.aFloat317 * 1575742085;
			local4.anInt1508 = ((int) local218.aFloat317 + (local4.aClass132_Sub1_Sub1_Sub1_Sub2_1.method19986(-1439501029) << 8)) * 440138643;
			local4.anInt1507 = (int) local218.aFloat319 * 1539129531;
			local4.anInt1509 = ((int) local218.aFloat319 + (local4.aClass132_Sub1_Sub1_Sub1_Sub2_1.method19986(1272803835) << 8)) * -465070531;
			local4.anInt1506 = local4.aClass132_Sub1_Sub1_Sub1_Sub2_1.aByte100 * 1680099407;
			Class527.method30388(local4, arg0, arg1, arg2, arg3, -735811045);
		}
	}

	@OriginalMember(owner = "client!akc", name = "ax", descriptor = "(IIII)V", line = 311)
	public static void method13490(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class93_Sub13 local4;
		for (local4 = (Class93_Sub13) aClass22_21.method428((byte) 59); local4 != null; local4 = (Class93_Sub13) aClass22_21.method442(1187729422)) {
			Class527.method30388(local4, arg0, arg1, arg2, arg3, -735811045);
		}
		@Pc(29) byte local29;
		@Pc(34) Class622 local34;
		@Pc(40) int local40;
		@Pc(115) int local115;
		@Pc(218) Class472 local218;
		for (local4 = (Class93_Sub13) aClass22_22.method428((byte) 119); local4 != null; local4 = (Class93_Sub13) aClass22_22.method442(-14792670)) {
			local29 = 1;
			local34 = local4.aClass132_Sub1_Sub1_Sub1_Sub1_1.method19997(-618176325);
			local40 = local4.aClass132_Sub1_Sub1_Sub1_Sub1_1.aClass19_Sub3_3.method23564((byte) 35);
			if (local40 == -1 || local4.aClass132_Sub1_Sub1_Sub1_Sub1_1.aClass19_Sub3_3.aBoolean379) {
				local29 = 0;
			} else if (local40 == local34.anInt5680 * 1046628773 || local34.anInt5654 * 884977547 == local40 || local40 == local34.anInt5656 * 1632091583 || local40 == local34.anInt5655 * 1798234475) {
				local29 = 2;
			} else if (local40 == local34.anInt5657 * -2077928117 || local40 == local34.anInt5658 * 1363226867 || local34.anInt5645 * 285037349 == local40 || local34.anInt5653 * -2038961455 == local40) {
				local29 = 3;
			}
			if (local4.anInt1515 * 1201626885 != local29) {
				local115 = Class566.method31257(local4.aClass132_Sub1_Sub1_Sub1_Sub1_1, -659494931);
				@Pc(119) Class336 local119 = local4.aClass132_Sub1_Sub1_Sub1_Sub1_1.aClass336_1;
				if (local119.anIntArray412 != null) {
					local119 = local119.method27435(Class624.playerVariableManager, Class624.playerVariableManager, (short) 14861);
				}
				if (local119 == null || local115 == -1) {
					local4.anInt1522 = 1340593683;
					local4.anInt1515 = local29 * -449342003;
				} else if (local115 == local4.anInt1522 * 486579173) {
					local4.anInt1515 = local29 * -449342003;
					local4.anInt1514 = local119.anInt4167 * 500628225;
				} else {
					@Pc(151) boolean local151 = false;
					if (local4.aClass539_3 == null) {
						local151 = true;
					} else {
						local4.anInt1514 -= 1825123840;
						if (local4.anInt1514 * 1666407207 <= 0) {
							local4.aClass539_3.method30803(100, (byte) -12);
							Class274.aClass258_1.method26088(local4.aClass539_3, 1525559371);
							local4.aClass539_3 = null;
							local151 = true;
						}
					}
					if (local151) {
						local4.anInt1514 = local119.anInt4167 * 500628225;
						local4.anInt1522 = local115 * -1340593683;
						local4.anInt1515 = local29 * -449342003;
					}
				}
			}
			local218 = local4.aClass132_Sub1_Sub1_Sub1_Sub1_1.method24220().aClass472_61;
			local4.anInt1513 = (int) local218.aFloat317 * 1575742085;
			local4.anInt1508 = ((int) local218.aFloat317 + (local4.aClass132_Sub1_Sub1_Sub1_Sub1_1.method19986(1224737897) << 8)) * 440138643;
			local4.anInt1507 = (int) local218.aFloat319 * 1539129531;
			local4.anInt1509 = ((int) local218.aFloat319 + (local4.aClass132_Sub1_Sub1_Sub1_Sub1_1.method19986(-1903128278) << 8)) * -465070531;
			local4.anInt1506 = local4.aClass132_Sub1_Sub1_Sub1_Sub1_1.aByte100 * 1680099407;
			Class527.method30388(local4, arg0, arg1, arg2, arg3, -735811045);
		}
		for (local4 = (Class93_Sub13) aClass16_11.method227((byte) 42); local4 != null; local4 = (Class93_Sub13) aClass16_11.method229(1665410931)) {
			local29 = 1;
			local34 = local4.aClass132_Sub1_Sub1_Sub1_Sub2_1.method19997(-1398777710);
			local40 = local4.aClass132_Sub1_Sub1_Sub1_Sub2_1.aClass19_Sub3_3.method23564((byte) 94);
			if (local40 == -1 || local4.aClass132_Sub1_Sub1_Sub1_Sub2_1.aClass19_Sub3_3.aBoolean379) {
				local29 = 0;
			} else if (local34.anInt5680 * 1046628773 == local40 || local34.anInt5654 * 884977547 == local40 || local34.anInt5656 * 1632091583 == local40 || local34.anInt5655 * 1798234475 == local40) {
				local29 = 2;
			} else if (local40 == local34.anInt5657 * -2077928117 || local34.anInt5658 * 1363226867 == local40 || local40 == local34.anInt5645 * 285037349 || local40 == local34.anInt5653 * -2038961455) {
				local29 = 3;
			}
			if (local29 != local4.anInt1515 * 1201626885) {
				local115 = Class110_Sub18.method8431(local4.aClass132_Sub1_Sub1_Sub1_Sub2_1, -2106084418);
				if (local4.anInt1522 * 486579173 == local115) {
					local4.anInt1514 = local4.aClass132_Sub1_Sub1_Sub1_Sub2_1.anInt2808 * 31129119;
					local4.anInt1515 = local29 * -449342003;
				} else {
					@Pc(384) boolean local384 = false;
					if (local4.aClass539_3 == null) {
						local384 = true;
					} else {
						local4.anInt1514 -= 1825123840;
						if (local4.anInt1514 * 1666407207 <= 0) {
							local4.aClass539_3.method30803(100, (byte) -109);
							Class274.aClass258_1.method26088(local4.aClass539_3, 1509543163);
							local4.aClass539_3 = null;
							local384 = true;
						}
					}
					if (local384) {
						local4.anInt1514 = local4.aClass132_Sub1_Sub1_Sub1_Sub2_1.anInt2808 * 31129119;
						local4.anInt1522 = local115 * -1340593683;
						local4.anInt1515 = local29 * -449342003;
					}
				}
			}
			local218 = local4.aClass132_Sub1_Sub1_Sub1_Sub2_1.method24220().aClass472_61;
			local4.anInt1513 = (int) local218.aFloat317 * 1575742085;
			local4.anInt1508 = ((int) local218.aFloat317 + (local4.aClass132_Sub1_Sub1_Sub1_Sub2_1.method19986(2021584145) << 8)) * 440138643;
			local4.anInt1507 = (int) local218.aFloat319 * 1539129531;
			local4.anInt1509 = ((int) local218.aFloat319 + (local4.aClass132_Sub1_Sub1_Sub1_Sub2_1.method19986(880584720) << 8)) * -465070531;
			local4.anInt1506 = local4.aClass132_Sub1_Sub1_Sub1_Sub2_1.aByte100 * 1680099407;
			Class527.method30388(local4, arg0, arg1, arg2, arg3, -735811045);
		}
	}

	@OriginalMember(owner = "client!akc", name = "av", descriptor = "(Lclient!akc;IIII)V", line = 405)
	static void method13491(@OriginalArg(0) Class93_Sub13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0.anInt1522 * 486579173 == -1 && arg0.anIntArray175 == null) {
			return;
		}
		@Pc(14) int local14 = arg0.anInt1514 * 1666407207;
		if (arg0.anInt1512 * -193034713 != 0 && Class51.options.aClass166_Sub35_1.method16226(-1493456746) != 0 && arg0.anInt1506 * 1124978351 == arg1) {
			if (arg0.aClass539_3 != null && (arg0.aClass539_3.method30821(408099178) == Class536.aClass536_8 || arg0.aClass539_3.method30821(600194851) == Class536.aClass536_2)) {
				Class274.aClass258_1.method26088(arg0.aClass539_3, 1972260705);
				arg0.aClass539_3 = null;
			}
			@Pc(102) int local102;
			@Pc(122) int local122;
			@Pc(204) int local204;
			if (arg0.aClass539_3 != null) {
				local204 = (int) ((float) (arg0.anInt1513 * 792297037) + (float) (arg0.anInt1508 * -739288421 - arg0.anInt1513 * 792297037) * 0.5F);
				local102 = (int) ((float) (arg0.anInt1509 * 818622741 - arg0.anInt1507 * -1881471885) * 0.5F + (float) (arg0.anInt1507 * -1881471885));
				arg0.aClass472_45.aFloat317 = local204;
				arg0.aClass472_45.aFloat319 = local102;
			} else if (arg0.anInt1522 * 486579173 >= 0) {
				@Pc(82) short local82 = 256;
				local102 = (int) ((float) (arg0.anInt1513 * 792297037) + (float) (arg0.anInt1508 * -739288421 - arg0.anInt1513 * 792297037) * 0.5F);
				local122 = (int) ((float) (arg0.anInt1507 * -1881471885) + (float) (arg0.anInt1509 * 818622741 - arg0.anInt1507 * -1881471885) * 0.5F);
				arg0.aClass472_45.aFloat317 = local102;
				arg0.aClass472_45.aFloat319 = local122;
				arg0.aClass539_3 = Class274.aClass258_1.method26097(Class275.aClass275_2, arg0, arg0.anInt1522 * 486579173, -1, 0, Class280.aClass280_9.method26450(-730107541), Class278.aClass278_5, (float) (arg0.anInt1511 * -601444203), (float) (arg0.anInt1512 * -193034713), arg0.aClass472_45, 0, local82, false, 1780547590);
				if (arg0.aClass539_3 != null) {
					@Pc(173) float local173 = (float) local14 / 255.0F;
					arg0.aClass539_3.method30873(local173, 150, 1937980939);
					arg0.aClass539_3.method30802(-1897040200);
				}
			}
			if (arg0.aClass539_4 != null) {
				local204 = (int) ((float) (arg0.anInt1508 * -739288421 - arg0.anInt1513 * 792297037) * 0.5F + (float) (arg0.anInt1513 * 792297037));
				local102 = (int) ((float) (arg0.anInt1507 * -1881471885) + (float) (arg0.anInt1509 * 818622741 - arg0.anInt1507 * -1881471885) * 0.5F);
				arg0.aClass472_46.aFloat317 = local204;
				arg0.aClass472_46.aFloat319 = local102;
				if (arg0.aClass539_4.method30821(1013507125) == Class536.aClass536_8 || arg0.aClass539_4.method30821(-557995900) == Class536.aClass536_2) {
					Class274.aClass258_1.method26088(arg0.aClass539_4, 1535334263);
					arg0.aClass539_4 = null;
				}
			} else if (arg0.anIntArray175 != null && (arg0.anInt1510 -= arg4 * 2090876833) * 726492257 <= 0) {
				local204 = arg0.anInt1521 * -1679191715 == 256 && arg0.anInt1520 * -1738310839 == 256 ? 256 : (int) (Math.random() * (double) (arg0.anInt1521 * -1679191715 - arg0.anInt1520 * -1738310839)) + arg0.anInt1520 * -1738310839;
				local102 = (int) (Math.random() * (double) arg0.anIntArray175.length);
				local122 = (int) ((float) (arg0.anInt1508 * -739288421 - arg0.anInt1513 * 792297037) * 0.5F + (float) (arg0.anInt1513 * 792297037));
				@Pc(333) int local333 = (int) ((float) (arg0.anInt1507 * -1881471885) + (float) (arg0.anInt1509 * 818622741 - arg0.anInt1507 * -1881471885) * 0.5F);
				arg0.aClass472_46.aFloat317 = local122;
				arg0.aClass472_46.aFloat319 = local333;
				arg0.aClass539_4 = Class274.aClass258_1.method26097(Class275.aClass275_3, arg0, arg0.anIntArray175[local102], 0, local14, Class280.aClass280_1.method26450(-762135983), Class278.aClass278_5, (float) (arg0.anInt1511 * -601444203), (float) (arg0.anInt1511 * -601444203 + arg0.anInt1512 * -193034713), arg0.aClass472_46, 0, local204, false, -544007033);
				if (arg0.aClass539_4 != null) {
					arg0.aClass539_4.method30802(-1201682010);
				}
				arg0.anInt1510 = (arg0.anInt1523 * 1676874203 + (int) (Math.random() * (double) (arg0.anInt1524 * 1675476241 - arg0.anInt1523 * 1676874203))) * 2090876833;
			}
		} else if (arg0.aClass539_3 != null) {
			arg0.aClass539_3.method30803(100, (byte) -1);
			Class274.aClass258_1.method26088(arg0.aClass539_3, 2098990912);
			arg0.aClass539_3 = null;
		}
	}
}
