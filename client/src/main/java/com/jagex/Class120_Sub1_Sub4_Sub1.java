package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ajf")
public final class Class120_Sub1_Sub4_Sub1 extends Class120_Sub1_Sub4 implements Interface60 {

	@OriginalMember(owner = "client!ajf", name = "x", descriptor = "Lclient!uc;")
	Class589 aClass589_4;

	@OriginalMember(owner = "client!ajf", name = "w", descriptor = "Z")
	boolean aBoolean312 = true;

	@OriginalMember(owner = "client!ajf", name = "s", descriptor = "Lclient!sf;")
	public Class548 aClass548_3;

	@OriginalMember(owner = "client!ajf", name = "k", descriptor = "Z")
	boolean aBoolean313;

	@OriginalMember(owner = "client!ajf", name = "f", descriptor = "(I)V")
	public static void method13026(@OriginalArg(0) int arg0) {
		@Pc(4) Class80_Sub21 local4;
		for (local4 = (Class80_Sub21) Class80_Sub21.aClass8_22.method247(129206984); local4 != null; local4 = (Class80_Sub21) Class80_Sub21.aClass8_22.method237(-158792352)) {
			if (local4.aBoolean368) {
				local4.method14186(2024703526);
			}
		}
		for (local4 = (Class80_Sub21) Class80_Sub21.aClass8_21.method247(129206984); local4 != null; local4 = (Class80_Sub21) Class80_Sub21.aClass8_21.method237(-1833529553)) {
			if (local4.aBoolean368) {
				local4.method14186(1919811427);
			}
		}
	}

	@OriginalMember(owner = "client!ajf", name = "avt", descriptor = "(Lclient!yp;I)V")
	static void method13027(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) long local2 = Class303.method27111((byte) 99);
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = (int) (local2 / 60000L);
	}

	@OriginalMember(owner = "client!ajf", name = "gj", descriptor = "(Lclient!yp;I)V")
	static void method13028(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		arg0.anInt5778 -= -221471862;
		@Pc(25) int local25 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(35) int local35 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(41) Class79 local41 = (Class79) Class370.aClass41_Sub10_1.method18054(local25, 90707231);
		if (local35 == local41.anInt253 * 680817871) {
			local11.method27652(local25, -928163933);
		} else {
			local11.method27646(local25, local35, -255893355);
		}
	}

	@OriginalMember(owner = "client!ajf", name = "<init>", descriptor = "(Lclient!te;Lclient!di;Lclient!aod;Lclient!vv;IIIIIZIIILclient!oc;)V")
	public Class120_Sub1_Sub4_Sub1(@OriginalArg(0) Class570 arg0, @OriginalArg(1) Class102 arg1, @OriginalArg(2) Class41_Sub3 arg2, @OriginalArg(3) Class625 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) Class457 arg13) {
		super(arg0, arg6, arg7, arg8, arg4, arg5, arg3.anInt5527 * 494278413, arg13);
		this.aClass548_3 = new Class548(arg1, arg2, arg3, Class607.aClass607_10.anInt5396 * 1323580581, arg10, arg5, this, arg9, arg11, arg12);
		this.aBoolean313 = arg3.anInt5506 * 350558937 != 0 && !arg9;
		this.method24581(1, (byte) 14);
	}

	@OriginalMember(owner = "client!ajf", name = "fy", descriptor = "(Lclient!di;Lclient!alf;IIIZI)V")
	@Override
	void method24569(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ajf", name = "bo", descriptor = "(I)Z")
	@Override
	boolean method24567(@OriginalArg(0) int arg0) {
		return false;
	}

	@OriginalMember(owner = "client!ajf", name = "bc", descriptor = "(I)Z")
	@Override
	boolean method24565(@OriginalArg(0) int arg0) {
		return this.aBoolean312;
	}

	@OriginalMember(owner = "client!ajf", name = "fn", descriptor = "(Lclient!di;I)Lclient!tj;")
	@Override
	Class573 method24571(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class105 local8 = this.aClass548_3.method31250(arg0, 2048, false, true, 1000387867);
		if (local8 == null) {
			return null;
		}
		@Pc(16) Class471 local16 = this.method24526();
		@Pc(19) Class457 local19 = this.method24552();
		@Pc(24) Class573 local24 = Class454.method29307(this.aBoolean313, -1482432471);
		@Pc(31) int local31 = (int) local19.aClass463_61.aFloat297 >> 9;
		@Pc(38) int local38 = (int) local19.aClass463_61.aFloat296 >> 9;
		this.aClass548_3.method31238(arg0, local8, local16, local31, local31, local38, local38, true, 1543174873);
		@Pc(55) Class625 local55 = this.aClass548_3.method31243((byte) -43);
		if (local55.aClass472_2 == null) {
			local8.method7359(local16, this.aClass246Array21[0], 0);
		} else {
			local8.method7359(local16, null, 0);
			arg0.method20735(local16, this.aClass246Array21[0], local55.aClass472_2);
		}
		if (this.aClass548_3.aClass658_7 != null) {
			@Pc(90) Class221 local90 = this.aClass548_3.aClass658_7.method33244();
			arg0.method20964(local90);
		}
		this.aBoolean312 = local8.method7395() || this.aClass548_3.aClass658_7 != null;
		if (this.aClass589_4 == null) {
			this.aClass589_4 = Class67.method1243((int) local19.aClass463_61.aFloat297, (int) local19.aClass463_61.aFloat295, (int) local19.aClass463_61.aFloat296, local8, (byte) 91);
		} else {
			Class367.method28289(this.aClass589_4, (int) local19.aClass463_61.aFloat297, (int) local19.aClass463_61.aFloat295, (int) local19.aClass463_61.aFloat296, local8, 401694413);
		}
		return local24;
	}

	@OriginalMember(owner = "client!ajf", name = "bb", descriptor = "(I)I")
	@Override
	public int method24578(@OriginalArg(0) int arg0) {
		return this.aClass548_3.method31249(1223251344);
	}

	@OriginalMember(owner = "client!ajf", name = "bf", descriptor = "(I)I")
	@Override
	public int method24601(@OriginalArg(0) int arg0) {
		return this.aClass548_3.method31244(-2134853753);
	}

	@OriginalMember(owner = "client!ajf", name = "ax", descriptor = "(Lclient!di;)V")
	@Override
	public void method13844(@OriginalArg(0) Class102 arg0) {
		this.aClass548_3.method31247(arg0, -1744674654);
	}

	@OriginalMember(owner = "client!ajf", name = "fh", descriptor = "(Lclient!di;B)V")
	@Override
	void method24572(@OriginalArg(0) Class102 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class105 local8 = this.aClass548_3.method31250(arg0, 262144, true, true, 1776835980);
		if (local8 != null) {
			@Pc(14) Class463 local14 = this.method24552().aClass463_61;
			@Pc(20) int local20 = (int) local14.aFloat297 >> 9;
			@Pc(26) int local26 = (int) local14.aFloat296 >> 9;
			this.aClass548_3.method31238(arg0, local8, this.method24526(), local20, local20, local26, local26, false, -1723411131);
		}
	}

	@OriginalMember(owner = "client!ajf", name = "fw", descriptor = "(Lclient!di;III)Z")
	@Override
	boolean method24583(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class625 local4 = this.aClass548_3.method31243((byte) 50);
		if (local4.aClass472_2 == null) {
			@Pc(26) Class105 local26 = this.aClass548_3.method31250(arg0, 131072, false, false, 1461976314);
			return local26 == null ? false : local26.method7360(arg1, arg2, this.method24526(), false, 0);
		} else {
			return arg0.method20733(arg1, arg2, this.method24526(), local4.aClass472_2, 92868112);
		}
	}

	@OriginalMember(owner = "client!ajf", name = "fo", descriptor = "(B)Z")
	@Override
	boolean method24566(@OriginalArg(0) byte arg0) {
		return false;
	}

	@OriginalMember(owner = "client!ajf", name = "fz", descriptor = "(Lclient!di;I)Lclient!uc;")
	@Override
	public Class589 method24573(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		return this.aClass589_4;
	}

	@OriginalMember(owner = "client!ajf", name = "c", descriptor = "()I")
	@Override
	public int method13826() {
		return this.aClass548_3.anInt5130 * 1986737113;
	}

	@OriginalMember(owner = "client!ajf", name = "x", descriptor = "()V")
	@Override
	public void method13832() {
	}

	@OriginalMember(owner = "client!ajf", name = "bu", descriptor = "(Lclient!vj;)V")
	public void method13022(@OriginalArg(0) Class614 arg0) {
		this.aClass548_3.method31241(arg0, -1413992453);
	}

	@OriginalMember(owner = "client!ajf", name = "gw", descriptor = "(Lclient!di;)V")
	@Override
	void method24593(@OriginalArg(0) Class102 arg0) {
		@Pc(8) Class105 local8 = this.aClass548_3.method31250(arg0, 262144, true, true, 1994847576);
		if (local8 != null) {
			@Pc(14) Class463 local14 = this.method24552().aClass463_61;
			@Pc(20) int local20 = (int) local14.aFloat297 >> 9;
			@Pc(26) int local26 = (int) local14.aFloat296 >> 9;
			this.aClass548_3.method31238(arg0, local8, this.method24526(), local20, local20, local26, local26, false, -360967724);
		}
	}

	@OriginalMember(owner = "client!ajf", name = "bw", descriptor = "(Lclient!vj;I)V")
	public void method13023(@OriginalArg(0) Class614 arg0, @OriginalArg(1) int arg1) {
		this.aClass548_3.method31241(arg0, -1628770095);
	}

	@OriginalMember(owner = "client!ajf", name = "u", descriptor = "(I)V")
	@Override
	public void method13821(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ajf", name = "s", descriptor = "()I")
	@Override
	public int method13829() {
		return this.aClass548_3.anInt5132 * -1004622293;
	}

	@OriginalMember(owner = "client!ajf", name = "l", descriptor = "(I)Z")
	@Override
	public boolean method13822(@OriginalArg(0) int arg0) {
		return this.aClass548_3.method31246(-1858304903);
	}

	@OriginalMember(owner = "client!ajf", name = "i", descriptor = "(Lclient!di;I)V")
	@Override
	public void method13831(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		this.aClass548_3.method31247(arg0, -1779383220);
	}

	@OriginalMember(owner = "client!ajf", name = "m", descriptor = "(Lclient!di;I)V")
	@Override
	public void method13825(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		this.aClass548_3.method31240(arg0, (byte) 8);
	}

	@OriginalMember(owner = "client!ajf", name = "o", descriptor = "()I")
	@Override
	public int method13824() {
		return this.aClass548_3.anInt5132 * -1004622293;
	}

	@OriginalMember(owner = "client!ajf", name = "j", descriptor = "()I")
	@Override
	public int method13842() {
		return this.aClass548_3.anInt5132 * -1004622293;
	}

	@OriginalMember(owner = "client!ajf", name = "a", descriptor = "()I")
	@Override
	public int method13828() {
		return this.aClass548_3.anInt5132 * -1004622293;
	}

	@OriginalMember(owner = "client!ajf", name = "fl", descriptor = "(Lclient!di;)Lclient!tj;")
	@Override
	Class573 method24597(@OriginalArg(0) Class102 arg0) {
		@Pc(8) Class105 local8 = this.aClass548_3.method31250(arg0, 2048, false, true, 1259350854);
		if (local8 == null) {
			return null;
		}
		@Pc(16) Class471 local16 = this.method24526();
		@Pc(19) Class457 local19 = this.method24552();
		@Pc(24) Class573 local24 = Class454.method29307(this.aBoolean313, -1728185143);
		@Pc(31) int local31 = (int) local19.aClass463_61.aFloat297 >> 9;
		@Pc(38) int local38 = (int) local19.aClass463_61.aFloat296 >> 9;
		this.aClass548_3.method31238(arg0, local8, local16, local31, local31, local38, local38, true, -1785124452);
		@Pc(55) Class625 local55 = this.aClass548_3.method31243((byte) -52);
		if (local55.aClass472_2 == null) {
			local8.method7359(local16, this.aClass246Array21[0], 0);
		} else {
			local8.method7359(local16, null, 0);
			arg0.method20735(local16, this.aClass246Array21[0], local55.aClass472_2);
		}
		if (this.aClass548_3.aClass658_7 != null) {
			@Pc(90) Class221 local90 = this.aClass548_3.aClass658_7.method33244();
			arg0.method20964(local90);
		}
		this.aBoolean312 = local8.method7395() || this.aClass548_3.aClass658_7 != null;
		if (this.aClass589_4 == null) {
			this.aClass589_4 = Class67.method1243((int) local19.aClass463_61.aFloat297, (int) local19.aClass463_61.aFloat295, (int) local19.aClass463_61.aFloat296, local8, (byte) -17);
		} else {
			Class367.method28289(this.aClass589_4, (int) local19.aClass463_61.aFloat297, (int) local19.aClass463_61.aFloat295, (int) local19.aClass463_61.aFloat296, local8, 1302512811);
		}
		return local24;
	}

	@OriginalMember(owner = "client!ajf", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method13823(@OriginalArg(0) int arg0) {
		return true;
	}

	@OriginalMember(owner = "client!ajf", name = "w", descriptor = "()V")
	@Override
	public void method13830() {
	}

	@OriginalMember(owner = "client!ajf", name = "r", descriptor = "()Z")
	@Override
	public boolean method13833() {
		return this.aClass548_3.method31246(-2023783592);
	}

	@OriginalMember(owner = "client!ajf", name = "q", descriptor = "()Z")
	@Override
	public boolean method13839() {
		return this.aClass548_3.method31246(-1288284501);
	}

	@OriginalMember(owner = "client!ajf", name = "fb", descriptor = "(I)V")
	@Override
	void method24570(@OriginalArg(0) int arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ajf", name = "d", descriptor = "()Z")
	@Override
	public boolean method13836() {
		return true;
	}

	@OriginalMember(owner = "client!ajf", name = "z", descriptor = "(Lclient!di;)V")
	@Override
	public void method13837(@OriginalArg(0) Class102 arg0) {
		this.aClass548_3.method31240(arg0, (byte) 8);
	}

	@OriginalMember(owner = "client!ajf", name = "p", descriptor = "(Lclient!di;)V")
	@Override
	public void method13838(@OriginalArg(0) Class102 arg0) {
		this.aClass548_3.method31240(arg0, (byte) 8);
	}

	@OriginalMember(owner = "client!ajf", name = "bx", descriptor = "(Lclient!vj;)V")
	public void method13024(@OriginalArg(0) Class614 arg0) {
		this.aClass548_3.method31241(arg0, 1791690221);
	}

	@OriginalMember(owner = "client!ajf", name = "y", descriptor = "(Lclient!di;)V")
	@Override
	public void method13840(@OriginalArg(0) Class102 arg0) {
		this.aClass548_3.method31240(arg0, (byte) 8);
	}

	@OriginalMember(owner = "client!ajf", name = "n", descriptor = "(Lclient!di;)V")
	@Override
	public void method13841(@OriginalArg(0) Class102 arg0) {
		this.aClass548_3.method31240(arg0, (byte) 8);
	}

	@OriginalMember(owner = "client!ajf", name = "t", descriptor = "(B)I")
	@Override
	public int method13834(@OriginalArg(0) byte arg0) {
		return this.aClass548_3.anInt5132 * -1004622293;
	}

	@OriginalMember(owner = "client!ajf", name = "ca", descriptor = "()Z")
	@Override
	boolean method24616() {
		return this.aBoolean312;
	}

	@OriginalMember(owner = "client!ajf", name = "cr", descriptor = "()Z")
	@Override
	boolean method24584() {
		return this.aBoolean312;
	}

	@OriginalMember(owner = "client!ajf", name = "ci", descriptor = "()I")
	@Override
	public int method24585() {
		return this.aClass548_3.method31249(1113808093);
	}

	@OriginalMember(owner = "client!ajf", name = "cb", descriptor = "()I")
	@Override
	public int method24577() {
		return this.aClass548_3.method31244(-1188456582);
	}

	@OriginalMember(owner = "client!ajf", name = "cp", descriptor = "()I")
	@Override
	public int method24587() {
		return this.aClass548_3.method31249(1074515358);
	}

	@OriginalMember(owner = "client!ajf", name = "cg", descriptor = "()I")
	@Override
	public int method24588() {
		return this.aClass548_3.method31249(-505978899);
	}

	@OriginalMember(owner = "client!ajf", name = "fd", descriptor = "(Lclient!di;)Lclient!uc;")
	@Override
	public Class589 method24589(@OriginalArg(0) Class102 arg0) {
		return this.aClass589_4;
	}

	@OriginalMember(owner = "client!ajf", name = "fu", descriptor = "()Z")
	@Override
	boolean method24606() {
		return false;
	}

	@OriginalMember(owner = "client!ajf", name = "cw", descriptor = "()I")
	@Override
	public int method24591() {
		return this.aClass548_3.method31244(-506413335);
	}

	@OriginalMember(owner = "client!ajf", name = "fc", descriptor = "(Lclient!di;)Lclient!tj;")
	@Override
	Class573 method24592(@OriginalArg(0) Class102 arg0) {
		@Pc(8) Class105 local8 = this.aClass548_3.method31250(arg0, 2048, false, true, 367485882);
		if (local8 == null) {
			return null;
		}
		@Pc(16) Class471 local16 = this.method24526();
		@Pc(19) Class457 local19 = this.method24552();
		@Pc(24) Class573 local24 = Class454.method29307(this.aBoolean313, 1849210975);
		@Pc(31) int local31 = (int) local19.aClass463_61.aFloat297 >> 9;
		@Pc(38) int local38 = (int) local19.aClass463_61.aFloat296 >> 9;
		this.aClass548_3.method31238(arg0, local8, local16, local31, local31, local38, local38, true, 903620660);
		@Pc(55) Class625 local55 = this.aClass548_3.method31243((byte) 21);
		if (local55.aClass472_2 == null) {
			local8.method7359(local16, this.aClass246Array21[0], 0);
		} else {
			local8.method7359(local16, null, 0);
			arg0.method20735(local16, this.aClass246Array21[0], local55.aClass472_2);
		}
		if (this.aClass548_3.aClass658_7 != null) {
			@Pc(90) Class221 local90 = this.aClass548_3.aClass658_7.method33244();
			arg0.method20964(local90);
		}
		this.aBoolean312 = local8.method7395() || this.aClass548_3.aClass658_7 != null;
		if (this.aClass589_4 == null) {
			this.aClass589_4 = Class67.method1243((int) local19.aClass463_61.aFloat297, (int) local19.aClass463_61.aFloat295, (int) local19.aClass463_61.aFloat296, local8, (byte) -37);
		} else {
			Class367.method28289(this.aClass589_4, (int) local19.aClass463_61.aFloat297, (int) local19.aClass463_61.aFloat295, (int) local19.aClass463_61.aFloat296, local8, -585013472);
		}
		return local24;
	}

	@OriginalMember(owner = "client!ajf", name = "v", descriptor = "(Lclient!di;)V")
	@Override
	public void method13827(@OriginalArg(0) Class102 arg0) {
		this.aClass548_3.method31240(arg0, (byte) 8);
	}

	@OriginalMember(owner = "client!ajf", name = "fg", descriptor = "(Lclient!di;)Lclient!tj;")
	@Override
	Class573 method24594(@OriginalArg(0) Class102 arg0) {
		@Pc(8) Class105 local8 = this.aClass548_3.method31250(arg0, 2048, false, true, 1857033689);
		if (local8 == null) {
			return null;
		}
		@Pc(16) Class471 local16 = this.method24526();
		@Pc(19) Class457 local19 = this.method24552();
		@Pc(24) Class573 local24 = Class454.method29307(this.aBoolean313, 359878667);
		@Pc(31) int local31 = (int) local19.aClass463_61.aFloat297 >> 9;
		@Pc(38) int local38 = (int) local19.aClass463_61.aFloat296 >> 9;
		this.aClass548_3.method31238(arg0, local8, local16, local31, local31, local38, local38, true, -1237887526);
		@Pc(55) Class625 local55 = this.aClass548_3.method31243((byte) 34);
		if (local55.aClass472_2 == null) {
			local8.method7359(local16, this.aClass246Array21[0], 0);
		} else {
			local8.method7359(local16, null, 0);
			arg0.method20735(local16, this.aClass246Array21[0], local55.aClass472_2);
		}
		if (this.aClass548_3.aClass658_7 != null) {
			@Pc(90) Class221 local90 = this.aClass548_3.aClass658_7.method33244();
			arg0.method20964(local90);
		}
		this.aBoolean312 = local8.method7395() || this.aClass548_3.aClass658_7 != null;
		if (this.aClass589_4 == null) {
			this.aClass589_4 = Class67.method1243((int) local19.aClass463_61.aFloat297, (int) local19.aClass463_61.aFloat295, (int) local19.aClass463_61.aFloat296, local8, (byte) 54);
		} else {
			Class367.method28289(this.aClass589_4, (int) local19.aClass463_61.aFloat297, (int) local19.aClass463_61.aFloat295, (int) local19.aClass463_61.aFloat296, local8, 1688928615);
		}
		return local24;
	}

	@OriginalMember(owner = "client!ajf", name = "f", descriptor = "(I)I")
	@Override
	public int method13819(@OriginalArg(0) int arg0) {
		return this.aClass548_3.anInt5133 * 1263148313;
	}

	@OriginalMember(owner = "client!ajf", name = "fs", descriptor = "()Z")
	@Override
	boolean method24596() {
		return false;
	}

	@OriginalMember(owner = "client!ajf", name = "h", descriptor = "()Z")
	@Override
	public boolean method13835() {
		return true;
	}

	@OriginalMember(owner = "client!ajf", name = "ff", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	void method24598(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ajf", name = "fr", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	void method24562(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ajf", name = "fi", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	void method24599(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ajf", name = "gk", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	void method24602(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ajf", name = "gz", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	void method24580(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ajf", name = "k", descriptor = "()I")
	@Override
	public int method13818() {
		return this.aClass548_3.anInt5133 * 1263148313;
	}

	@OriginalMember(owner = "client!ajf", name = "gg", descriptor = "()V")
	@Override
	void method24603() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ajf", name = "ge", descriptor = "()V")
	@Override
	void method24590() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ajf", name = "ft", descriptor = "(Lclient!di;II)Z")
	@Override
	boolean method24563(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class625 local4 = this.aClass548_3.method31243((byte) -56);
		if (local4.aClass472_2 == null) {
			@Pc(26) Class105 local26 = this.aClass548_3.method31250(arg0, 131072, false, false, 1234569294);
			return local26 == null ? false : local26.method7360(arg1, arg2, this.method24526(), false, 0);
		} else {
			return arg0.method20733(arg1, arg2, this.method24526(), local4.aClass472_2, 92868112);
		}
	}

	@OriginalMember(owner = "client!ajf", name = "b", descriptor = "()I")
	@Override
	public int method13843() {
		return this.aClass548_3.anInt5130 * 1986737113;
	}

	@OriginalMember(owner = "client!ajf", name = "gh", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	void method24600(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ajf", name = "gb", descriptor = "(Lclient!di;)V")
	@Override
	void method24605(@OriginalArg(0) Class102 arg0) {
		@Pc(8) Class105 local8 = this.aClass548_3.method31250(arg0, 262144, true, true, 1833354828);
		if (local8 != null) {
			@Pc(14) Class463 local14 = this.method24552().aClass463_61;
			@Pc(20) int local20 = (int) local14.aFloat297 >> 9;
			@Pc(26) int local26 = (int) local14.aFloat296 >> 9;
			this.aClass548_3.method31238(arg0, local8, this.method24526(), local20, local20, local26, local26, false, 1544943141);
		}
	}

	@OriginalMember(owner = "client!ajf", name = "ck", descriptor = "()Z")
	@Override
	boolean method24595() {
		return false;
	}

	@OriginalMember(owner = "client!ajf", name = "gi", descriptor = "(Lclient!di;)V")
	@Override
	void method24607(@OriginalArg(0) Class102 arg0) {
		@Pc(8) Class105 local8 = this.aClass548_3.method31250(arg0, 262144, true, true, 947197114);
		if (local8 != null) {
			@Pc(14) Class463 local14 = this.method24552().aClass463_61;
			@Pc(20) int local20 = (int) local14.aFloat297 >> 9;
			@Pc(26) int local26 = (int) local14.aFloat296 >> 9;
			this.aClass548_3.method31238(arg0, local8, this.method24526(), local20, local20, local26, local26, false, 327209472);
		}
	}

	@OriginalMember(owner = "client!ajf", name = "gp", descriptor = "(Lclient!di;)V")
	@Override
	void method24608(@OriginalArg(0) Class102 arg0) {
		@Pc(8) Class105 local8 = this.aClass548_3.method31250(arg0, 262144, true, true, 618514015);
		if (local8 != null) {
			@Pc(14) Class463 local14 = this.method24552().aClass463_61;
			@Pc(20) int local20 = (int) local14.aFloat297 >> 9;
			@Pc(26) int local26 = (int) local14.aFloat296 >> 9;
			this.aClass548_3.method31238(arg0, local8, this.method24526(), local20, local20, local26, local26, false, -1322207195);
		}
	}

	@OriginalMember(owner = "client!ajf", name = "e", descriptor = "(I)I")
	@Override
	public int method13820(@OriginalArg(0) int arg0) {
		return this.aClass548_3.anInt5130 * 1986737113;
	}

	@OriginalMember(owner = "client!ajf", name = "bi", descriptor = "(Lclient!vj;)V")
	public void method13025(@OriginalArg(0) Class614 arg0) {
		this.aClass548_3.method31241(arg0, 359815638);
	}

	@OriginalMember(owner = "client!ajf", name = "cm", descriptor = "()I")
	@Override
	public int method24622() {
		return this.aClass548_3.method31249(1761564622);
	}
}
