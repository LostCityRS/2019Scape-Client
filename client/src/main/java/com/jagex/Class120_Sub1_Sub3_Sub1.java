package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ajd")
public final class Class120_Sub1_Sub3_Sub1 extends Class120_Sub1_Sub3 implements Interface60 {

	@OriginalMember(owner = "client!ajd", name = "x", descriptor = "Lclient!uc;")
	Class589 aClass589_3;

	@OriginalMember(owner = "client!ajd", name = "w", descriptor = "Z")
	boolean aBoolean302 = true;

	@OriginalMember(owner = "client!ajd", name = "s", descriptor = "Lclient!sf;")
	public Class548 aClass548_2;

	@OriginalMember(owner = "client!ajd", name = "k", descriptor = "Z")
	boolean aBoolean301;

	@OriginalMember(owner = "client!ajd", name = "kk", descriptor = "(Lclient!hx;Lclient!hx;I)V")
	static void method12744(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class327 arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class80_Sub31 local5 = Class623.method32440(Class443.aClass443_58, client.aClass75_1.aClass22_1, -191270971);
		local5.aClass80_Sub36_Sub1_2.method23219(arg0.anInt4167 * 1052460537, 899608325);
		local5.aClass80_Sub36_Sub1_2.method23220(arg1.anInt4167 * 1052460537, 2036747717);
		local5.aClass80_Sub36_Sub1_2.method23250(arg0.anInt4087 * -2053489901, 763641541);
		local5.aClass80_Sub36_Sub1_2.method23155(arg1.anInt4094 * 2071556223, (byte) -76);
		local5.aClass80_Sub36_Sub1_2.method23220(arg0.anInt4094 * 2071556223, 2036747717);
		local5.aClass80_Sub36_Sub1_2.method23410(arg1.anInt4087 * -2053489901, (byte) -10);
		client.aClass75_1.method1325(local5, (byte) -66);
	}

	@OriginalMember(owner = "client!ajd", name = "<init>", descriptor = "(Lclient!te;Lclient!di;Lclient!aod;Lclient!vv;IIIIIZIIIIIILclient!oc;)V")
	public Class120_Sub1_Sub3_Sub1(@OriginalArg(0) Class570 arg0, @OriginalArg(1) Class102 arg1, @OriginalArg(2) Class41_Sub3 arg2, @OriginalArg(3) Class625 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) Class457 arg16) {
		super(arg0, arg6, arg7, arg8, arg4, arg5, arg10, arg11, arg16);
		this.aClass548_2 = new Class548(arg1, arg2, arg3, arg12, arg13, arg5, this, arg9, arg14, arg15);
		this.aBoolean301 = arg3.anInt5506 * 350558937 != 0 && !arg9;
		this.method24581(1, (byte) 14);
	}

	@OriginalMember(owner = "client!ajd", name = "e", descriptor = "(I)I")
	@Override
	public int method13820(@OriginalArg(0) int arg0) {
		return this.aClass548_2.anInt5130 * 1986737113;
	}

	@OriginalMember(owner = "client!ajd", name = "bo", descriptor = "(I)Z")
	@Override
	boolean method24567(@OriginalArg(0) int arg0) {
		return false;
	}

	@OriginalMember(owner = "client!ajd", name = "bc", descriptor = "(I)Z")
	@Override
	boolean method24565(@OriginalArg(0) int arg0) {
		return this.aBoolean302;
	}

	@OriginalMember(owner = "client!ajd", name = "bx", descriptor = "(Lclient!vj;)V")
	public void method12741(@OriginalArg(0) Class614 arg0) {
		this.aClass548_2.method31241(arg0, -1128047431);
	}

	@OriginalMember(owner = "client!ajd", name = "bb", descriptor = "(I)I")
	@Override
	public int method24578(@OriginalArg(0) int arg0) {
		return this.aClass548_2.method31249(-1816038697);
	}

	@OriginalMember(owner = "client!ajd", name = "bf", descriptor = "(I)I")
	@Override
	public int method24601(@OriginalArg(0) int arg0) {
		return this.aClass548_2.method31244(-941360593);
	}

	@OriginalMember(owner = "client!ajd", name = "bw", descriptor = "(Lclient!vj;I)V")
	public void method12742(@OriginalArg(0) Class614 arg0, @OriginalArg(1) int arg1) {
		this.aClass548_2.method31241(arg0, -1309918231);
	}

	@OriginalMember(owner = "client!ajd", name = "fn", descriptor = "(Lclient!di;I)Lclient!tj;")
	@Override
	Class573 method24571(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class105 local8 = this.aClass548_2.method31250(arg0, 2048, false, true, 398816998);
		if (local8 == null) {
			return null;
		}
		@Pc(15) Class471 local15 = arg0.method20813();
		local15.method29760(this.method24526());
		local15.method29783((float) this.aShort52, 0.0F, (float) this.aShort51);
		@Pc(31) Class457 local31 = this.method24552();
		@Pc(36) Class573 local36 = Class454.method29307(this.aBoolean301, 1224459436);
		@Pc(43) int local43 = (int) local31.aClass463_61.aFloat297 >> 9;
		@Pc(50) int local50 = (int) local31.aClass463_61.aFloat296 >> 9;
		this.aClass548_2.method31238(arg0, local8, local15, local43, local43, local50, local50, true, -631010957);
		@Pc(67) Class625 local67 = this.aClass548_2.method31243((byte) -54);
		if (local67.aClass472_2 == null) {
			local8.method7359(local15, this.aClass246Array21[0], 0);
		} else {
			local8.method7359(local15, null, 0);
			arg0.method20735(local15, this.aClass246Array21[0], local67.aClass472_2);
		}
		if (this.aClass548_2.aClass658_7 != null) {
			@Pc(104) Class221 local104 = this.aClass548_2.aClass658_7.method33244();
			arg0.method20964(local104);
		}
		this.aBoolean302 = local8.method7395() || this.aClass548_2.aClass658_7 != null;
		if (this.aClass589_3 == null) {
			this.aClass589_3 = Class67.method1243((int) local31.aClass463_61.aFloat297, (int) local31.aClass463_61.aFloat295, (int) local31.aClass463_61.aFloat296, local8, (byte) 39);
		} else {
			Class367.method28289(this.aClass589_3, (int) local31.aClass463_61.aFloat297, (int) local31.aClass463_61.aFloat295, (int) local31.aClass463_61.aFloat296, local8, 486419275);
		}
		return local36;
	}

	@OriginalMember(owner = "client!ajd", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method13823(@OriginalArg(0) int arg0) {
		return true;
	}

	@OriginalMember(owner = "client!ajd", name = "fw", descriptor = "(Lclient!di;III)Z")
	@Override
	boolean method24583(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class625 local4 = this.aClass548_2.method31243((byte) -28);
		if (local4.aClass472_2 == null) {
			@Pc(26) Class105 local26 = this.aClass548_2.method31250(arg0, 131072, false, false, 1728643999);
			return local26 == null ? false : local26.method7360(arg1, arg2, this.method24526(), false, 0);
		} else {
			return arg0.method20733(arg1, arg2, this.method24526(), local4.aClass472_2, 92868112);
		}
	}

	@OriginalMember(owner = "client!ajd", name = "t", descriptor = "(B)I")
	@Override
	public int method13834(@OriginalArg(0) byte arg0) {
		return this.aClass548_2.anInt5132 * -1004622293;
	}

	@OriginalMember(owner = "client!ajd", name = "f", descriptor = "(I)I")
	@Override
	public int method13819(@OriginalArg(0) int arg0) {
		return this.aClass548_2.anInt5133 * 1263148313;
	}

	@OriginalMember(owner = "client!ajd", name = "ck", descriptor = "()Z")
	@Override
	boolean method24595() {
		return false;
	}

	@OriginalMember(owner = "client!ajd", name = "u", descriptor = "(I)V")
	@Override
	public void method13821(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ajd", name = "i", descriptor = "(Lclient!di;I)V")
	@Override
	public void method13831(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		this.aClass548_2.method31247(arg0, -1020355763);
	}

	@OriginalMember(owner = "client!ajd", name = "l", descriptor = "(I)Z")
	@Override
	public boolean method13822(@OriginalArg(0) int arg0) {
		return this.aClass548_2.method31246(-2094021962);
	}

	@OriginalMember(owner = "client!ajd", name = "r", descriptor = "()Z")
	@Override
	public boolean method13833() {
		return this.aClass548_2.method31246(-1624913308);
	}

	@OriginalMember(owner = "client!ajd", name = "fh", descriptor = "(Lclient!di;B)V")
	@Override
	void method24572(@OriginalArg(0) Class102 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class105 local8 = this.aClass548_2.method31250(arg0, 262144, false, true, 409602673);
		if (local8 == null) {
			return;
		}
		@Pc(13) Class471 local13 = this.method24526();
		@Pc(16) Class457 local16 = this.method24552();
		@Pc(23) int local23 = (int) local16.aClass463_61.aFloat297 >> 9;
		@Pc(30) int local30 = (int) local16.aClass463_61.aFloat296 >> 9;
		this.aClass548_2.method31238(arg0, local8, local13, local23, local23, local30, local30, false, 1738193239);
	}

	@OriginalMember(owner = "client!ajd", name = "s", descriptor = "()I")
	@Override
	public int method13829() {
		return this.aClass548_2.anInt5132 * -1004622293;
	}

	@OriginalMember(owner = "client!ajd", name = "j", descriptor = "()I")
	@Override
	public int method13842() {
		return this.aClass548_2.anInt5132 * -1004622293;
	}

	@OriginalMember(owner = "client!ajd", name = "fz", descriptor = "(Lclient!di;I)Lclient!uc;")
	@Override
	public Class589 method24573(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		return this.aClass589_3;
	}

	@OriginalMember(owner = "client!ajd", name = "cp", descriptor = "()I")
	@Override
	public int method24587() {
		return this.aClass548_2.method31249(-667584798);
	}

	@OriginalMember(owner = "client!ajd", name = "x", descriptor = "()V")
	@Override
	public void method13832() {
	}

	@OriginalMember(owner = "client!ajd", name = "gp", descriptor = "(Lclient!di;)V")
	@Override
	void method24608(@OriginalArg(0) Class102 arg0) {
		@Pc(8) Class105 local8 = this.aClass548_2.method31250(arg0, 262144, false, true, 1360983827);
		if (local8 == null) {
			return;
		}
		@Pc(13) Class471 local13 = this.method24526();
		@Pc(16) Class457 local16 = this.method24552();
		@Pc(23) int local23 = (int) local16.aClass463_61.aFloat297 >> 9;
		@Pc(30) int local30 = (int) local16.aClass463_61.aFloat296 >> 9;
		this.aClass548_2.method31238(arg0, local8, local13, local23, local23, local30, local30, false, -544502916);
	}

	@OriginalMember(owner = "client!ajd", name = "fl", descriptor = "(Lclient!di;)Lclient!tj;")
	@Override
	Class573 method24597(@OriginalArg(0) Class102 arg0) {
		@Pc(8) Class105 local8 = this.aClass548_2.method31250(arg0, 2048, false, true, 552399285);
		if (local8 == null) {
			return null;
		}
		@Pc(15) Class471 local15 = arg0.method20813();
		local15.method29760(this.method24526());
		local15.method29783((float) this.aShort52, 0.0F, (float) this.aShort51);
		@Pc(31) Class457 local31 = this.method24552();
		@Pc(36) Class573 local36 = Class454.method29307(this.aBoolean301, -1576237674);
		@Pc(43) int local43 = (int) local31.aClass463_61.aFloat297 >> 9;
		@Pc(50) int local50 = (int) local31.aClass463_61.aFloat296 >> 9;
		this.aClass548_2.method31238(arg0, local8, local15, local43, local43, local50, local50, true, -186992115);
		@Pc(67) Class625 local67 = this.aClass548_2.method31243((byte) -13);
		if (local67.aClass472_2 == null) {
			local8.method7359(local15, this.aClass246Array21[0], 0);
		} else {
			local8.method7359(local15, null, 0);
			arg0.method20735(local15, this.aClass246Array21[0], local67.aClass472_2);
		}
		if (this.aClass548_2.aClass658_7 != null) {
			@Pc(104) Class221 local104 = this.aClass548_2.aClass658_7.method33244();
			arg0.method20964(local104);
		}
		this.aBoolean302 = local8.method7395() || this.aClass548_2.aClass658_7 != null;
		if (this.aClass589_3 == null) {
			this.aClass589_3 = Class67.method1243((int) local31.aClass463_61.aFloat297, (int) local31.aClass463_61.aFloat295, (int) local31.aClass463_61.aFloat296, local8, (byte) 12);
		} else {
			Class367.method28289(this.aClass589_3, (int) local31.aClass463_61.aFloat297, (int) local31.aClass463_61.aFloat295, (int) local31.aClass463_61.aFloat296, local8, -964912582);
		}
		return local36;
	}

	@OriginalMember(owner = "client!ajd", name = "q", descriptor = "()Z")
	@Override
	public boolean method13839() {
		return this.aClass548_2.method31246(-1770332485);
	}

	@OriginalMember(owner = "client!ajd", name = "h", descriptor = "()Z")
	@Override
	public boolean method13835() {
		return true;
	}

	@OriginalMember(owner = "client!ajd", name = "a", descriptor = "()I")
	@Override
	public int method13828() {
		return this.aClass548_2.anInt5132 * -1004622293;
	}

	@OriginalMember(owner = "client!ajd", name = "z", descriptor = "(Lclient!di;)V")
	@Override
	public void method13837(@OriginalArg(0) Class102 arg0) {
		this.aClass548_2.method31240(arg0, (byte) 8);
	}

	@OriginalMember(owner = "client!ajd", name = "p", descriptor = "(Lclient!di;)V")
	@Override
	public void method13838(@OriginalArg(0) Class102 arg0) {
		this.aClass548_2.method31240(arg0, (byte) 8);
	}

	@OriginalMember(owner = "client!ajd", name = "y", descriptor = "(Lclient!di;)V")
	@Override
	public void method13840(@OriginalArg(0) Class102 arg0) {
		this.aClass548_2.method31240(arg0, (byte) 8);
	}

	@OriginalMember(owner = "client!ajd", name = "k", descriptor = "()I")
	@Override
	public int method13818() {
		return this.aClass548_2.anInt5133 * 1263148313;
	}

	@OriginalMember(owner = "client!ajd", name = "n", descriptor = "(Lclient!di;)V")
	@Override
	public void method13841(@OriginalArg(0) Class102 arg0) {
		this.aClass548_2.method31240(arg0, (byte) 8);
	}

	@OriginalMember(owner = "client!ajd", name = "m", descriptor = "(Lclient!di;I)V")
	@Override
	public void method13825(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		this.aClass548_2.method31240(arg0, (byte) 8);
	}

	@OriginalMember(owner = "client!ajd", name = "ca", descriptor = "()Z")
	@Override
	boolean method24616() {
		return this.aBoolean302;
	}

	@OriginalMember(owner = "client!ajd", name = "cr", descriptor = "()Z")
	@Override
	boolean method24584() {
		return this.aBoolean302;
	}

	@OriginalMember(owner = "client!ajd", name = "cg", descriptor = "()I")
	@Override
	public int method24588() {
		return this.aClass548_2.method31249(1776072817);
	}

	@OriginalMember(owner = "client!ajd", name = "cm", descriptor = "()I")
	@Override
	public int method24622() {
		return this.aClass548_2.method31249(-1622711421);
	}

	@OriginalMember(owner = "client!ajd", name = "cb", descriptor = "()I")
	@Override
	public int method24577() {
		return this.aClass548_2.method31244(-843678559);
	}

	@OriginalMember(owner = "client!ajd", name = "o", descriptor = "()I")
	@Override
	public int method13824() {
		return this.aClass548_2.anInt5132 * -1004622293;
	}

	@OriginalMember(owner = "client!ajd", name = "v", descriptor = "(Lclient!di;)V")
	@Override
	public void method13827(@OriginalArg(0) Class102 arg0) {
		this.aClass548_2.method31240(arg0, (byte) 8);
	}

	@OriginalMember(owner = "client!ajd", name = "ci", descriptor = "()I")
	@Override
	public int method24585() {
		return this.aClass548_2.method31249(-1594448906);
	}

	@OriginalMember(owner = "client!ajd", name = "cw", descriptor = "()I")
	@Override
	public int method24591() {
		return this.aClass548_2.method31244(-1257827617);
	}

	@OriginalMember(owner = "client!ajd", name = "fc", descriptor = "(Lclient!di;)Lclient!tj;")
	@Override
	Class573 method24592(@OriginalArg(0) Class102 arg0) {
		@Pc(8) Class105 local8 = this.aClass548_2.method31250(arg0, 2048, false, true, 1794252510);
		if (local8 == null) {
			return null;
		}
		@Pc(15) Class471 local15 = arg0.method20813();
		local15.method29760(this.method24526());
		local15.method29783((float) this.aShort52, 0.0F, (float) this.aShort51);
		@Pc(31) Class457 local31 = this.method24552();
		@Pc(36) Class573 local36 = Class454.method29307(this.aBoolean301, 2023080217);
		@Pc(43) int local43 = (int) local31.aClass463_61.aFloat297 >> 9;
		@Pc(50) int local50 = (int) local31.aClass463_61.aFloat296 >> 9;
		this.aClass548_2.method31238(arg0, local8, local15, local43, local43, local50, local50, true, 1238675187);
		@Pc(67) Class625 local67 = this.aClass548_2.method31243((byte) 26);
		if (local67.aClass472_2 == null) {
			local8.method7359(local15, this.aClass246Array21[0], 0);
		} else {
			local8.method7359(local15, null, 0);
			arg0.method20735(local15, this.aClass246Array21[0], local67.aClass472_2);
		}
		if (this.aClass548_2.aClass658_7 != null) {
			@Pc(104) Class221 local104 = this.aClass548_2.aClass658_7.method33244();
			arg0.method20964(local104);
		}
		this.aBoolean302 = local8.method7395() || this.aClass548_2.aClass658_7 != null;
		if (this.aClass589_3 == null) {
			this.aClass589_3 = Class67.method1243((int) local31.aClass463_61.aFloat297, (int) local31.aClass463_61.aFloat295, (int) local31.aClass463_61.aFloat296, local8, (byte) -60);
		} else {
			Class367.method28289(this.aClass589_3, (int) local31.aClass463_61.aFloat297, (int) local31.aClass463_61.aFloat295, (int) local31.aClass463_61.aFloat296, local8, -1160098331);
		}
		return local36;
	}

	@OriginalMember(owner = "client!ajd", name = "fd", descriptor = "(Lclient!di;)Lclient!uc;")
	@Override
	public Class589 method24589(@OriginalArg(0) Class102 arg0) {
		return this.aClass589_3;
	}

	@OriginalMember(owner = "client!ajd", name = "fg", descriptor = "(Lclient!di;)Lclient!tj;")
	@Override
	Class573 method24594(@OriginalArg(0) Class102 arg0) {
		@Pc(8) Class105 local8 = this.aClass548_2.method31250(arg0, 2048, false, true, 870888801);
		if (local8 == null) {
			return null;
		}
		@Pc(15) Class471 local15 = arg0.method20813();
		local15.method29760(this.method24526());
		local15.method29783((float) this.aShort52, 0.0F, (float) this.aShort51);
		@Pc(31) Class457 local31 = this.method24552();
		@Pc(36) Class573 local36 = Class454.method29307(this.aBoolean301, -1054370550);
		@Pc(43) int local43 = (int) local31.aClass463_61.aFloat297 >> 9;
		@Pc(50) int local50 = (int) local31.aClass463_61.aFloat296 >> 9;
		this.aClass548_2.method31238(arg0, local8, local15, local43, local43, local50, local50, true, 859581749);
		@Pc(67) Class625 local67 = this.aClass548_2.method31243((byte) -65);
		if (local67.aClass472_2 == null) {
			local8.method7359(local15, this.aClass246Array21[0], 0);
		} else {
			local8.method7359(local15, null, 0);
			arg0.method20735(local15, this.aClass246Array21[0], local67.aClass472_2);
		}
		if (this.aClass548_2.aClass658_7 != null) {
			@Pc(104) Class221 local104 = this.aClass548_2.aClass658_7.method33244();
			arg0.method20964(local104);
		}
		this.aBoolean302 = local8.method7395() || this.aClass548_2.aClass658_7 != null;
		if (this.aClass589_3 == null) {
			this.aClass589_3 = Class67.method1243((int) local31.aClass463_61.aFloat297, (int) local31.aClass463_61.aFloat295, (int) local31.aClass463_61.aFloat296, local8, (byte) 11);
		} else {
			Class367.method28289(this.aClass589_3, (int) local31.aClass463_61.aFloat297, (int) local31.aClass463_61.aFloat295, (int) local31.aClass463_61.aFloat296, local8, 1509755367);
		}
		return local36;
	}

	@OriginalMember(owner = "client!ajd", name = "ft", descriptor = "(Lclient!di;II)Z")
	@Override
	boolean method24563(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class625 local4 = this.aClass548_2.method31243((byte) -9);
		if (local4.aClass472_2 == null) {
			@Pc(26) Class105 local26 = this.aClass548_2.method31250(arg0, 131072, false, false, 1937754101);
			return local26 == null ? false : local26.method7360(arg1, arg2, this.method24526(), false, 0);
		} else {
			return arg0.method20733(arg1, arg2, this.method24526(), local4.aClass472_2, 92868112);
		}
	}

	@OriginalMember(owner = "client!ajd", name = "c", descriptor = "()I")
	@Override
	public int method13826() {
		return this.aClass548_2.anInt5130 * 1986737113;
	}

	@OriginalMember(owner = "client!ajd", name = "b", descriptor = "()I")
	@Override
	public int method13843() {
		return this.aClass548_2.anInt5130 * 1986737113;
	}

	@OriginalMember(owner = "client!ajd", name = "ax", descriptor = "(Lclient!di;)V")
	@Override
	public void method13844(@OriginalArg(0) Class102 arg0) {
		this.aClass548_2.method31247(arg0, -1722373562);
	}

	@OriginalMember(owner = "client!ajd", name = "gb", descriptor = "(Lclient!di;)V")
	@Override
	void method24605(@OriginalArg(0) Class102 arg0) {
		@Pc(8) Class105 local8 = this.aClass548_2.method31250(arg0, 262144, false, true, 1484951732);
		if (local8 == null) {
			return;
		}
		@Pc(13) Class471 local13 = this.method24526();
		@Pc(16) Class457 local16 = this.method24552();
		@Pc(23) int local23 = (int) local16.aClass463_61.aFloat297 >> 9;
		@Pc(30) int local30 = (int) local16.aClass463_61.aFloat296 >> 9;
		this.aClass548_2.method31238(arg0, local8, local13, local23, local23, local30, local30, false, 1396775828);
	}

	@OriginalMember(owner = "client!ajd", name = "gw", descriptor = "(Lclient!di;)V")
	@Override
	void method24593(@OriginalArg(0) Class102 arg0) {
		@Pc(8) Class105 local8 = this.aClass548_2.method31250(arg0, 262144, false, true, 699894643);
		if (local8 == null) {
			return;
		}
		@Pc(13) Class471 local13 = this.method24526();
		@Pc(16) Class457 local16 = this.method24552();
		@Pc(23) int local23 = (int) local16.aClass463_61.aFloat297 >> 9;
		@Pc(30) int local30 = (int) local16.aClass463_61.aFloat296 >> 9;
		this.aClass548_2.method31238(arg0, local8, local13, local23, local23, local30, local30, false, -1219171776);
	}

	@OriginalMember(owner = "client!ajd", name = "w", descriptor = "()V")
	@Override
	public void method13830() {
	}

	@OriginalMember(owner = "client!ajd", name = "d", descriptor = "()Z")
	@Override
	public boolean method13836() {
		return true;
	}

	@OriginalMember(owner = "client!ajd", name = "gi", descriptor = "(Lclient!di;)V")
	@Override
	void method24607(@OriginalArg(0) Class102 arg0) {
		@Pc(8) Class105 local8 = this.aClass548_2.method31250(arg0, 262144, false, true, 2031716568);
		if (local8 == null) {
			return;
		}
		@Pc(13) Class471 local13 = this.method24526();
		@Pc(16) Class457 local16 = this.method24552();
		@Pc(23) int local23 = (int) local16.aClass463_61.aFloat297 >> 9;
		@Pc(30) int local30 = (int) local16.aClass463_61.aFloat296 >> 9;
		this.aClass548_2.method31238(arg0, local8, local13, local23, local23, local30, local30, false, 1985510770);
	}

	@OriginalMember(owner = "client!ajd", name = "bi", descriptor = "(Lclient!vj;)V")
	public void method12743(@OriginalArg(0) Class614 arg0) {
		this.aClass548_2.method31241(arg0, -839720135);
	}
}
