package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aja")
public final class Class120_Sub1_Sub1_Sub2 extends Class120_Sub1_Sub1 implements Interface60 {

	@OriginalMember(owner = "client!aja", name = "x", descriptor = "Lclient!uc;")
	Class589 aClass589_1;

	@OriginalMember(owner = "client!aja", name = "w", descriptor = "Z")
	boolean aBoolean277 = true;

	@OriginalMember(owner = "client!aja", name = "s", descriptor = "Lclient!sf;")
	public Class548 aClass548_1;

	@OriginalMember(owner = "client!aja", name = "k", descriptor = "Z")
	boolean aBoolean276;

	@OriginalMember(owner = "client!aja", name = "r", descriptor = "Z")
	final boolean aBoolean278;

	@OriginalMember(owner = "client!aja", name = "bu", descriptor = "(II)B")
	static byte method12204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Class607.aClass607_20.anInt5396 * 1323580581 == arg0) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!aja", name = "bm", descriptor = "(II)B")
	static byte method12205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Class607.aClass607_20.anInt5396 * 1323580581 == arg0) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!aja", name = "bq", descriptor = "(II)B")
	static byte method12206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Class607.aClass607_20.anInt5396 * 1323580581 == arg0) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!aja", name = "zh", descriptor = "(Lclient!yp;I)V")
	static void method12208(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5776 -= -825189621;
		arg0.anInt5778 -= 1815275855;
		@Pc(20) String local20 = (String) arg0.anObjectArray46[arg0.anInt5776 * -2070619997];
		@Pc(33) boolean local33 = arg0.anIntArray525[arg0.anInt5778 * 1896589581] == 1;
		@Pc(48) boolean local48 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1] == 1;
		@Pc(63) boolean local63 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 2] == 1;
		@Pc(69) Class80_Sub31 local69 = Class623.method32440(Class443.aClass443_66, client.aClass75_2.aClass22_1, -191270971);
		local69.aPacketBit_2.p2(Class350.method28013(local20, (short) 16383) + 1);
		local69.aPacketBit_2.pjstr(local20);
		@Pc(85) int local85 = 0;
		if (local33) {
			local85 |= 0x1;
		}
		if (local48) {
			local85 |= 0x2;
		}
		if (local63) {
			local85 |= 0x4;
		}
		local69.aPacketBit_2.p1(local85);
		client.aClass75_2.method1325(local69, (byte) -25);
	}

	@OriginalMember(owner = "client!aja", name = "ak", descriptor = "(ZZB)V")
	public static void method12209(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte arg2) {
		Class622.aBoolean938 = arg0;
		Class622.aBoolean939 = arg1;
	}

	@OriginalMember(owner = "client!aja", name = "<init>", descriptor = "(Lclient!te;Lclient!di;Lclient!aod;Lclient!vv;IIIIIZIIIIIIIIZLclient!oc;)V")
	public Class120_Sub1_Sub1_Sub2(@OriginalArg(0) Class570 arg0, @OriginalArg(1) Class102 arg1, @OriginalArg(2) Class41_Sub3 arg2, @OriginalArg(3) Class625 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) boolean arg18, @OriginalArg(19) Class457 arg19) {
		super(arg0, arg4, arg5, arg6, arg7, arg8, arg10, arg11, arg12, arg13, arg3.anInt5526 * -1859673749 == 1, Class535.method30856(arg14, arg15, (short) 255), arg19);
		this.aClass548_1 = new Class548(arg1, arg2, arg3, arg14, arg15, arg5, this, arg9, arg16, arg17);
		this.aBoolean276 = arg3.anInt5506 * 350558937 != 0 && !arg9;
		this.aBoolean278 = arg18;
		this.method24581(1, (byte) 14);
	}

	@OriginalMember(owner = "client!aja", name = "ck", descriptor = "()Z")
	@Override
	boolean method24595() {
		return false;
	}

	@OriginalMember(owner = "client!aja", name = "bc", descriptor = "(I)Z")
	@Override
	boolean method24565(@OriginalArg(0) int arg0) {
		return this.aBoolean277;
	}

	@OriginalMember(owner = "client!aja", name = "c", descriptor = "()I")
	@Override
	public int method13826() {
		return this.aClass548_1.anInt5130 * 1986737113;
	}

	@OriginalMember(owner = "client!aja", name = "y", descriptor = "(Lclient!di;)V")
	@Override
	public void method13840(@OriginalArg(0) Class102 arg0) {
		this.aClass548_1.method31240(arg0, (byte) 8);
	}

	@OriginalMember(owner = "client!aja", name = "fz", descriptor = "(Lclient!di;I)Lclient!uc;")
	@Override
	public Class589 method24573(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		return this.aClass589_1;
	}

	@OriginalMember(owner = "client!aja", name = "bf", descriptor = "(I)I")
	@Override
	public int method24601(@OriginalArg(0) int arg0) {
		return this.aClass548_1.method31244(-375350186);
	}

	@OriginalMember(owner = "client!aja", name = "fn", descriptor = "(Lclient!di;I)Lclient!tj;")
	@Override
	Class573 method24571(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class105 local8 = this.aClass548_1.method31250(arg0, 2048, false, true, 1685978368);
		if (local8 == null) {
			return null;
		}
		@Pc(16) Class471 local16 = this.method24526();
		@Pc(21) Class573 local21 = Class454.method29307(this.aBoolean276, -943030951);
		this.aClass548_1.method31238(arg0, local8, local16, this.aShort129, this.aShort126, this.aShort127, this.aShort128, true, -2024610885);
		@Pc(42) Class625 local42 = this.aClass548_1.method31243((byte) 2);
		if (local42.aClass472_2 == null) {
			local8.method7359(local16, this.aClass246Array21[0], 0);
		} else {
			local8.method7359(local16, null, 0);
			arg0.method20735(local16, this.aClass246Array21[0], local42.aClass472_2);
		}
		if (this.aClass548_1.aClass658_7 != null) {
			@Pc(78) Class221 local78 = this.aClass548_1.aClass658_7.method33244();
			arg0.method20964(local78);
		}
		this.aBoolean277 = local8.method7395() || this.aClass548_1.aClass658_7 != null;
		@Pc(96) Class457 local96 = this.method24552();
		if (this.aClass589_1 == null) {
			this.aClass589_1 = Class67.method1243((int) local96.aClass463_61.aFloat297, (int) local96.aClass463_61.aFloat295, (int) local96.aClass463_61.aFloat296, local8, (byte) 6);
		} else {
			Class367.method28289(this.aClass589_1, (int) local96.aClass463_61.aFloat297, (int) local96.aClass463_61.aFloat295, (int) local96.aClass463_61.aFloat296, local8, 249095608);
		}
		return local21;
	}

	@OriginalMember(owner = "client!aja", name = "fh", descriptor = "(Lclient!di;B)V")
	@Override
	void method24572(@OriginalArg(0) Class102 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class105 local8 = this.aClass548_1.method31250(arg0, 262144, true, true, 451544888);
		if (local8 != null) {
			this.aClass548_1.method31238(arg0, local8, this.method24526(), this.aShort129, this.aShort126, this.aShort127, this.aShort128, false, -1842438838);
		}
	}

	@OriginalMember(owner = "client!aja", name = "bi", descriptor = "(Lclient!vj;B)V")
	public void method12203(@OriginalArg(0) Class614 arg0, @OriginalArg(1) byte arg1) {
		this.aClass548_1.method31241(arg0, 865652778);
	}

	@OriginalMember(owner = "client!aja", name = "fw", descriptor = "(Lclient!di;III)Z")
	@Override
	boolean method24583(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class625 local4 = this.aClass548_1.method31243((byte) -16);
		if (local4.aClass472_2 == null) {
			@Pc(27) Class105 local27 = this.aClass548_1.method31250(arg0, 131072, false, false, 1282109201);
			return local27 == null ? false : local27.method7360(arg1, arg2, this.method24526(), false, 0);
		} else {
			return arg0.method20733(arg1, arg2, this.method24526(), local4.aClass472_2, 92868112);
		}
	}

	@OriginalMember(owner = "client!aja", name = "ax", descriptor = "(Lclient!di;)V")
	@Override
	public void method13844(@OriginalArg(0) Class102 arg0) {
		this.aClass548_1.method31247(arg0, -2070240462);
	}

	@OriginalMember(owner = "client!aja", name = "fy", descriptor = "(Lclient!di;Lclient!alf;IIIZI)V")
	@Override
	void method24569(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aja", name = "fb", descriptor = "(I)V")
	@Override
	void method24570(@OriginalArg(0) int arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aja", name = "d", descriptor = "()Z")
	@Override
	public boolean method13836() {
		return this.aBoolean278;
	}

	@OriginalMember(owner = "client!aja", name = "f", descriptor = "(I)I")
	@Override
	public int method13819(@OriginalArg(0) int arg0) {
		return this.aClass548_1.anInt5133 * 1263148313;
	}

	@OriginalMember(owner = "client!aja", name = "e", descriptor = "(I)I")
	@Override
	public int method13820(@OriginalArg(0) int arg0) {
		return this.aClass548_1.anInt5130 * 1986737113;
	}

	@OriginalMember(owner = "client!aja", name = "p", descriptor = "(Lclient!di;)V")
	@Override
	public void method13838(@OriginalArg(0) Class102 arg0) {
		this.aClass548_1.method31240(arg0, (byte) 8);
	}

	@OriginalMember(owner = "client!aja", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method13823(@OriginalArg(0) int arg0) {
		return this.aBoolean278;
	}

	@OriginalMember(owner = "client!aja", name = "gg", descriptor = "()V")
	@Override
	void method24603() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aja", name = "m", descriptor = "(Lclient!di;I)V")
	@Override
	public void method13825(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		this.aClass548_1.method31240(arg0, (byte) 8);
	}

	@OriginalMember(owner = "client!aja", name = "bo", descriptor = "(I)Z")
	@Override
	boolean method24567(@OriginalArg(0) int arg0) {
		return false;
	}

	@OriginalMember(owner = "client!aja", name = "j", descriptor = "()I")
	@Override
	public int method13842() {
		return this.aClass548_1.anInt5132 * -1004622293;
	}

	@OriginalMember(owner = "client!aja", name = "ft", descriptor = "(Lclient!di;II)Z")
	@Override
	boolean method24563(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class625 local4 = this.aClass548_1.method31243((byte) 17);
		if (local4.aClass472_2 == null) {
			@Pc(27) Class105 local27 = this.aClass548_1.method31250(arg0, 131072, false, false, 1532534676);
			return local27 == null ? false : local27.method7360(arg1, arg2, this.method24526(), false, 0);
		} else {
			return arg0.method20733(arg1, arg2, this.method24526(), local4.aClass472_2, 92868112);
		}
	}

	@OriginalMember(owner = "client!aja", name = "s", descriptor = "()I")
	@Override
	public int method13829() {
		return this.aClass548_1.anInt5132 * -1004622293;
	}

	@OriginalMember(owner = "client!aja", name = "l", descriptor = "(I)Z")
	@Override
	public boolean method13822(@OriginalArg(0) int arg0) {
		return this.aClass548_1.method31246(-904427837);
	}

	@OriginalMember(owner = "client!aja", name = "x", descriptor = "()V")
	@Override
	public void method13832() {
	}

	@OriginalMember(owner = "client!aja", name = "w", descriptor = "()V")
	@Override
	public void method13830() {
	}

	@OriginalMember(owner = "client!aja", name = "v", descriptor = "(Lclient!di;)V")
	@Override
	public void method13827(@OriginalArg(0) Class102 arg0) {
		this.aClass548_1.method31240(arg0, (byte) 8);
	}

	@OriginalMember(owner = "client!aja", name = "q", descriptor = "()Z")
	@Override
	public boolean method13839() {
		return this.aClass548_1.method31246(-840749054);
	}

	@OriginalMember(owner = "client!aja", name = "h", descriptor = "()Z")
	@Override
	public boolean method13835() {
		return this.aBoolean278;
	}

	@OriginalMember(owner = "client!aja", name = "ci", descriptor = "()I")
	@Override
	public int method24585() {
		return this.aClass548_1.method31249(78829915);
	}

	@OriginalMember(owner = "client!aja", name = "z", descriptor = "(Lclient!di;)V")
	@Override
	public void method13837(@OriginalArg(0) Class102 arg0) {
		this.aClass548_1.method31240(arg0, (byte) 8);
	}

	@OriginalMember(owner = "client!aja", name = "r", descriptor = "()Z")
	@Override
	public boolean method13833() {
		return this.aClass548_1.method31246(-1862601080);
	}

	@OriginalMember(owner = "client!aja", name = "k", descriptor = "()I")
	@Override
	public int method13818() {
		return this.aClass548_1.anInt5133 * 1263148313;
	}

	@OriginalMember(owner = "client!aja", name = "fo", descriptor = "(B)Z")
	@Override
	boolean method24566(@OriginalArg(0) byte arg0) {
		return false;
	}

	@OriginalMember(owner = "client!aja", name = "n", descriptor = "(Lclient!di;)V")
	@Override
	public void method13841(@OriginalArg(0) Class102 arg0) {
		this.aClass548_1.method31240(arg0, (byte) 8);
	}

	@OriginalMember(owner = "client!aja", name = "bb", descriptor = "(I)I")
	@Override
	public int method24578(@OriginalArg(0) int arg0) {
		return this.aClass548_1.method31249(-1356347205);
	}

	@OriginalMember(owner = "client!aja", name = "o", descriptor = "()I")
	@Override
	public int method13824() {
		return this.aClass548_1.anInt5132 * -1004622293;
	}

	@OriginalMember(owner = "client!aja", name = "t", descriptor = "(B)I")
	@Override
	public int method13834(@OriginalArg(0) byte arg0) {
		return this.aClass548_1.anInt5132 * -1004622293;
	}

	@OriginalMember(owner = "client!aja", name = "gk", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	void method24602(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aja", name = "cm", descriptor = "()I")
	@Override
	public int method24622() {
		return this.aClass548_1.method31249(-924849273);
	}

	@OriginalMember(owner = "client!aja", name = "cp", descriptor = "()I")
	@Override
	public int method24587() {
		return this.aClass548_1.method31249(885671990);
	}

	@OriginalMember(owner = "client!aja", name = "cg", descriptor = "()I")
	@Override
	public int method24588() {
		return this.aClass548_1.method31249(-1781368584);
	}

	@OriginalMember(owner = "client!aja", name = "fd", descriptor = "(Lclient!di;)Lclient!uc;")
	@Override
	public Class589 method24589(@OriginalArg(0) Class102 arg0) {
		return this.aClass589_1;
	}

	@OriginalMember(owner = "client!aja", name = "cb", descriptor = "()I")
	@Override
	public int method24577() {
		return this.aClass548_1.method31244(-980896900);
	}

	@OriginalMember(owner = "client!aja", name = "cw", descriptor = "()I")
	@Override
	public int method24591() {
		return this.aClass548_1.method31244(-1436981382);
	}

	@OriginalMember(owner = "client!aja", name = "fc", descriptor = "(Lclient!di;)Lclient!tj;")
	@Override
	Class573 method24592(@OriginalArg(0) Class102 arg0) {
		@Pc(8) Class105 local8 = this.aClass548_1.method31250(arg0, 2048, false, true, 1450295635);
		if (local8 == null) {
			return null;
		}
		@Pc(16) Class471 local16 = this.method24526();
		@Pc(21) Class573 local21 = Class454.method29307(this.aBoolean276, -441973615);
		this.aClass548_1.method31238(arg0, local8, local16, this.aShort129, this.aShort126, this.aShort127, this.aShort128, true, 538297101);
		@Pc(42) Class625 local42 = this.aClass548_1.method31243((byte) -8);
		if (local42.aClass472_2 == null) {
			local8.method7359(local16, this.aClass246Array21[0], 0);
		} else {
			local8.method7359(local16, null, 0);
			arg0.method20735(local16, this.aClass246Array21[0], local42.aClass472_2);
		}
		if (this.aClass548_1.aClass658_7 != null) {
			@Pc(78) Class221 local78 = this.aClass548_1.aClass658_7.method33244();
			arg0.method20964(local78);
		}
		this.aBoolean277 = local8.method7395() || this.aClass548_1.aClass658_7 != null;
		@Pc(96) Class457 local96 = this.method24552();
		if (this.aClass589_1 == null) {
			this.aClass589_1 = Class67.method1243((int) local96.aClass463_61.aFloat297, (int) local96.aClass463_61.aFloat295, (int) local96.aClass463_61.aFloat296, local8, (byte) -52);
		} else {
			Class367.method28289(this.aClass589_1, (int) local96.aClass463_61.aFloat297, (int) local96.aClass463_61.aFloat295, (int) local96.aClass463_61.aFloat296, local8, -1957146308);
		}
		return local21;
	}

	@OriginalMember(owner = "client!aja", name = "fl", descriptor = "(Lclient!di;)Lclient!tj;")
	@Override
	Class573 method24597(@OriginalArg(0) Class102 arg0) {
		@Pc(8) Class105 local8 = this.aClass548_1.method31250(arg0, 2048, false, true, 987199056);
		if (local8 == null) {
			return null;
		}
		@Pc(16) Class471 local16 = this.method24526();
		@Pc(21) Class573 local21 = Class454.method29307(this.aBoolean276, -48348423);
		this.aClass548_1.method31238(arg0, local8, local16, this.aShort129, this.aShort126, this.aShort127, this.aShort128, true, -1409504251);
		@Pc(42) Class625 local42 = this.aClass548_1.method31243((byte) -5);
		if (local42.aClass472_2 == null) {
			local8.method7359(local16, this.aClass246Array21[0], 0);
		} else {
			local8.method7359(local16, null, 0);
			arg0.method20735(local16, this.aClass246Array21[0], local42.aClass472_2);
		}
		if (this.aClass548_1.aClass658_7 != null) {
			@Pc(78) Class221 local78 = this.aClass548_1.aClass658_7.method33244();
			arg0.method20964(local78);
		}
		this.aBoolean277 = local8.method7395() || this.aClass548_1.aClass658_7 != null;
		@Pc(96) Class457 local96 = this.method24552();
		if (this.aClass589_1 == null) {
			this.aClass589_1 = Class67.method1243((int) local96.aClass463_61.aFloat297, (int) local96.aClass463_61.aFloat295, (int) local96.aClass463_61.aFloat296, local8, (byte) 17);
		} else {
			Class367.method28289(this.aClass589_1, (int) local96.aClass463_61.aFloat297, (int) local96.aClass463_61.aFloat295, (int) local96.aClass463_61.aFloat296, local8, -984488061);
		}
		return local21;
	}

	@OriginalMember(owner = "client!aja", name = "fg", descriptor = "(Lclient!di;)Lclient!tj;")
	@Override
	Class573 method24594(@OriginalArg(0) Class102 arg0) {
		@Pc(8) Class105 local8 = this.aClass548_1.method31250(arg0, 2048, false, true, 452896769);
		if (local8 == null) {
			return null;
		}
		@Pc(16) Class471 local16 = this.method24526();
		@Pc(21) Class573 local21 = Class454.method29307(this.aBoolean276, -591518041);
		this.aClass548_1.method31238(arg0, local8, local16, this.aShort129, this.aShort126, this.aShort127, this.aShort128, true, -133901153);
		@Pc(42) Class625 local42 = this.aClass548_1.method31243((byte) -29);
		if (local42.aClass472_2 == null) {
			local8.method7359(local16, this.aClass246Array21[0], 0);
		} else {
			local8.method7359(local16, null, 0);
			arg0.method20735(local16, this.aClass246Array21[0], local42.aClass472_2);
		}
		if (this.aClass548_1.aClass658_7 != null) {
			@Pc(78) Class221 local78 = this.aClass548_1.aClass658_7.method33244();
			arg0.method20964(local78);
		}
		this.aBoolean277 = local8.method7395() || this.aClass548_1.aClass658_7 != null;
		@Pc(96) Class457 local96 = this.method24552();
		if (this.aClass589_1 == null) {
			this.aClass589_1 = Class67.method1243((int) local96.aClass463_61.aFloat297, (int) local96.aClass463_61.aFloat295, (int) local96.aClass463_61.aFloat296, local8, (byte) -87);
		} else {
			Class367.method28289(this.aClass589_1, (int) local96.aClass463_61.aFloat297, (int) local96.aClass463_61.aFloat295, (int) local96.aClass463_61.aFloat296, local8, 178936361);
		}
		return local21;
	}

	@OriginalMember(owner = "client!aja", name = "bd", descriptor = "(Lclient!vj;)V")
	public void method12207(@OriginalArg(0) Class614 arg0) {
		this.aClass548_1.method31241(arg0, -2126634410);
	}

	@OriginalMember(owner = "client!aja", name = "ca", descriptor = "()Z")
	@Override
	boolean method24616() {
		return this.aBoolean277;
	}

	@OriginalMember(owner = "client!aja", name = "fs", descriptor = "()Z")
	@Override
	boolean method24596() {
		return false;
	}

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "()I")
	@Override
	public int method13828() {
		return this.aClass548_1.anInt5132 * -1004622293;
	}

	@OriginalMember(owner = "client!aja", name = "ff", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	void method24598(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aja", name = "fr", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	void method24562(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aja", name = "u", descriptor = "(I)V")
	@Override
	public void method13821(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!aja", name = "gh", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	void method24600(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aja", name = "gz", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	void method24580(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aja", name = "cr", descriptor = "()Z")
	@Override
	boolean method24584() {
		return this.aBoolean277;
	}

	@OriginalMember(owner = "client!aja", name = "b", descriptor = "()I")
	@Override
	public int method13843() {
		return this.aClass548_1.anInt5130 * 1986737113;
	}

	@OriginalMember(owner = "client!aja", name = "ge", descriptor = "()V")
	@Override
	void method24590() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aja", name = "fu", descriptor = "()Z")
	@Override
	boolean method24606() {
		return false;
	}

	@OriginalMember(owner = "client!aja", name = "i", descriptor = "(Lclient!di;I)V")
	@Override
	public void method13831(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		this.aClass548_1.method31247(arg0, -2038360484);
	}

	@OriginalMember(owner = "client!aja", name = "fi", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	void method24599(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aja", name = "gb", descriptor = "(Lclient!di;)V")
	@Override
	void method24605(@OriginalArg(0) Class102 arg0) {
		@Pc(8) Class105 local8 = this.aClass548_1.method31250(arg0, 262144, true, true, 933953391);
		if (local8 != null) {
			this.aClass548_1.method31238(arg0, local8, this.method24526(), this.aShort129, this.aShort126, this.aShort127, this.aShort128, false, 1448097381);
		}
	}

	@OriginalMember(owner = "client!aja", name = "gw", descriptor = "(Lclient!di;)V")
	@Override
	void method24593(@OriginalArg(0) Class102 arg0) {
		@Pc(8) Class105 local8 = this.aClass548_1.method31250(arg0, 262144, true, true, 1687336803);
		if (local8 != null) {
			this.aClass548_1.method31238(arg0, local8, this.method24526(), this.aShort129, this.aShort126, this.aShort127, this.aShort128, false, -7511330);
		}
	}

	@OriginalMember(owner = "client!aja", name = "gi", descriptor = "(Lclient!di;)V")
	@Override
	void method24607(@OriginalArg(0) Class102 arg0) {
		@Pc(8) Class105 local8 = this.aClass548_1.method31250(arg0, 262144, true, true, 397408052);
		if (local8 != null) {
			this.aClass548_1.method31238(arg0, local8, this.method24526(), this.aShort129, this.aShort126, this.aShort127, this.aShort128, false, -1083502548);
		}
	}

	@OriginalMember(owner = "client!aja", name = "gp", descriptor = "(Lclient!di;)V")
	@Override
	void method24608(@OriginalArg(0) Class102 arg0) {
		@Pc(8) Class105 local8 = this.aClass548_1.method31250(arg0, 262144, true, true, 773805468);
		if (local8 != null) {
			this.aClass548_1.method31238(arg0, local8, this.method24526(), this.aShort129, this.aShort126, this.aShort127, this.aShort128, false, 1626011403);
		}
	}
}
