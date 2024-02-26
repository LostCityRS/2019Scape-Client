package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ajw")
public final class Class120_Sub1_Sub2_Sub2 extends Class120_Sub1_Sub2 implements Interface60 {

	@OriginalMember(owner = "client!ajw", name = "w", descriptor = "[I")
	static final int[] anIntArray184 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ajw", name = "r", descriptor = "[I")
	static final int[] anIntArray183 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!ajw", name = "x", descriptor = "Lclient!uc;")
	Class589 aClass589_7;

	@OriginalMember(owner = "client!ajw", name = "q", descriptor = "Z")
	boolean aBoolean345 = true;

	@OriginalMember(owner = "client!ajw", name = "s", descriptor = "Lclient!sf;")
	public Class548 aClass548_4;

	@OriginalMember(owner = "client!ajw", name = "k", descriptor = "Z")
	boolean aBoolean344;

	@OriginalMember(owner = "client!ajw", name = "bu", descriptor = "(II)I")
	static int method13696(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == Class607.aClass607_3.anInt5396 * 1323580581 || Class607.aClass607_5.anInt5396 * 1323580581 == arg0 ? anIntArray183[arg1 & 0x3] : anIntArray184[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!ajw", name = "bi", descriptor = "(II)I")
	static int method13698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == Class607.aClass607_3.anInt5396 * 1323580581 || Class607.aClass607_5.anInt5396 * 1323580581 == arg0 ? anIntArray183[arg1 & 0x3] : anIntArray184[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!ajw", name = "amb", descriptor = "(Lclient!yp;I)V")
	static void method13701(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		Class442.aClass442_2.method29194(55737213);
	}

	@OriginalMember(owner = "client!ajw", name = "<init>", descriptor = "(Lclient!te;Lclient!di;Lclient!aod;Lclient!vv;IIIIIZIIIILclient!oc;)V")
	public Class120_Sub1_Sub2_Sub2(@OriginalArg(0) Class570 arg0, @OriginalArg(1) Class102 arg1, @OriginalArg(2) Class41_Sub3 arg2, @OriginalArg(3) Class625 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) Class457 arg14) {
		super(arg0, arg6, arg7, arg8, arg4, arg5, Class143.method11839(arg10, arg11, -1887961115), arg14);
		this.aClass548_4 = new Class548(arg1, arg2, arg3, arg10, arg11, arg5, this, arg9, arg12, arg13);
		this.aBoolean344 = arg3.anInt5506 * 350558937 != 0 && !arg9;
		this.method24581(1, (byte) 14);
	}

	@OriginalMember(owner = "client!ajw", name = "gp", descriptor = "(Lclient!di;)V")
	@Override
	void method24608(@OriginalArg(0) Class102 arg0) {
		@Pc(8) Class105 local8 = this.aClass548_4.method31250(arg0, 262144, true, true, 1705346089);
		if (local8 == null) {
			return;
		}
		@Pc(13) Class471 local13 = this.method24526();
		@Pc(16) Class457 local16 = this.method24552();
		@Pc(23) int local23 = (int) local16.aClass463_61.aFloat297 >> 9;
		@Pc(30) int local30 = (int) local16.aClass463_61.aFloat296 >> 9;
		this.aClass548_4.method31238(arg0, local8, local13, local23, local23, local30, local30, false, -2126387824);
	}

	@OriginalMember(owner = "client!ajw", name = "gi", descriptor = "(Lclient!di;)V")
	@Override
	void method24607(@OriginalArg(0) Class102 arg0) {
		@Pc(8) Class105 local8 = this.aClass548_4.method31250(arg0, 262144, true, true, 1347990342);
		if (local8 == null) {
			return;
		}
		@Pc(13) Class471 local13 = this.method24526();
		@Pc(16) Class457 local16 = this.method24552();
		@Pc(23) int local23 = (int) local16.aClass463_61.aFloat297 >> 9;
		@Pc(30) int local30 = (int) local16.aClass463_61.aFloat296 >> 9;
		this.aClass548_4.method31238(arg0, local8, local13, local23, local23, local30, local30, false, 1332824134);
	}

	@OriginalMember(owner = "client!ajw", name = "bc", descriptor = "(I)Z")
	@Override
	boolean method24565(@OriginalArg(0) int arg0) {
		return this.aBoolean345;
	}

	@OriginalMember(owner = "client!ajw", name = "ff", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	void method24598(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ajw", name = "bb", descriptor = "(I)I")
	@Override
	public int method24578(@OriginalArg(0) int arg0) {
		return this.aClass548_4.method31249(-824191554);
	}

	@OriginalMember(owner = "client!ajw", name = "bf", descriptor = "(I)I")
	@Override
	public int method24601(@OriginalArg(0) int arg0) {
		return this.aClass548_4.method31244(-352689904);
	}

	@OriginalMember(owner = "client!ajw", name = "bx", descriptor = "(Lclient!vj;I)V")
	public void method13695(@OriginalArg(0) Class614 arg0, @OriginalArg(1) int arg1) {
		this.aClass548_4.method31241(arg0, 1481491430);
	}

	@OriginalMember(owner = "client!ajw", name = "bo", descriptor = "(I)Z")
	@Override
	boolean method24567(@OriginalArg(0) int arg0) {
		return false;
	}

	@OriginalMember(owner = "client!ajw", name = "fh", descriptor = "(Lclient!di;B)V")
	@Override
	void method24572(@OriginalArg(0) Class102 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class105 local8 = this.aClass548_4.method31250(arg0, 262144, true, true, 2047567373);
		if (local8 == null) {
			return;
		}
		@Pc(13) Class471 local13 = this.method24526();
		@Pc(16) Class457 local16 = this.method24552();
		@Pc(23) int local23 = (int) local16.aClass463_61.aFloat297 >> 9;
		@Pc(30) int local30 = (int) local16.aClass463_61.aFloat296 >> 9;
		this.aClass548_4.method31238(arg0, local8, local13, local23, local23, local30, local30, false, 449538756);
	}

	@OriginalMember(owner = "client!ajw", name = "fi", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	void method24599(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ajw", name = "cb", descriptor = "()I")
	@Override
	public int method24577() {
		return this.aClass548_4.method31244(-148461245);
	}

	@OriginalMember(owner = "client!ajw", name = "fn", descriptor = "(Lclient!di;I)Lclient!tj;")
	@Override
	Class573 method24571(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class105 local8 = this.aClass548_4.method31250(arg0, 2048, false, true, 2036518021);
		if (local8 == null) {
			return null;
		}
		@Pc(16) Class471 local16 = this.method24526();
		@Pc(19) Class457 local19 = this.method24552();
		@Pc(24) Class573 local24 = Class454.method29307(this.aBoolean344, 1242456257);
		@Pc(31) int local31 = (int) local19.aClass463_61.aFloat297 >> 9;
		@Pc(38) int local38 = (int) local19.aClass463_61.aFloat296 >> 9;
		this.aClass548_4.method31238(arg0, local8, local16, local31, local31, local38, local38, true, -1402157067);
		@Pc(55) Class625 local55 = this.aClass548_4.method31243((byte) -32);
		if (local55.aClass472_2 == null) {
			local8.method7359(local16, this.aClass246Array21[0], 0);
		} else {
			local8.method7359(local16, null, 0);
			arg0.method20735(local16, this.aClass246Array21[0], local55.aClass472_2);
		}
		if (this.aClass548_4.aClass658_7 != null) {
			@Pc(90) Class221 local90 = this.aClass548_4.aClass658_7.method33244();
			arg0.method20964(local90);
		}
		this.aBoolean345 = local8.method7395() || this.aClass548_4.aClass658_7 != null;
		if (this.aClass589_7 == null) {
			this.aClass589_7 = Class67.method1243((int) local19.aClass463_61.aFloat297, (int) local19.aClass463_61.aFloat295, (int) local19.aClass463_61.aFloat296, local8, (byte) -81);
		} else {
			Class367.method28289(this.aClass589_7, (int) local19.aClass463_61.aFloat297, (int) local19.aClass463_61.aFloat295, (int) local19.aClass463_61.aFloat296, local8, 1307828159);
		}
		return local24;
	}

	@OriginalMember(owner = "client!ajw", name = "t", descriptor = "(B)I")
	@Override
	public int method13834(@OriginalArg(0) byte arg0) {
		return this.aClass548_4.anInt5132 * -1004622293;
	}

	@OriginalMember(owner = "client!ajw", name = "f", descriptor = "(I)I")
	@Override
	public int method13819(@OriginalArg(0) int arg0) {
		return this.aClass548_4.anInt5133 * 1263148313;
	}

	@OriginalMember(owner = "client!ajw", name = "e", descriptor = "(I)I")
	@Override
	public int method13820(@OriginalArg(0) int arg0) {
		return this.aClass548_4.anInt5130 * 1986737113;
	}

	@OriginalMember(owner = "client!ajw", name = "u", descriptor = "(I)V")
	@Override
	public void method13821(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ajw", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method13823(@OriginalArg(0) int arg0) {
		return true;
	}

	@OriginalMember(owner = "client!ajw", name = "l", descriptor = "(I)Z")
	@Override
	public boolean method13822(@OriginalArg(0) int arg0) {
		return this.aClass548_4.method31246(-910055186);
	}

	@OriginalMember(owner = "client!ajw", name = "m", descriptor = "(Lclient!di;I)V")
	@Override
	public void method13825(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		this.aClass548_4.method31240(arg0, (byte) 8);
	}

	@OriginalMember(owner = "client!ajw", name = "z", descriptor = "(Lclient!di;)V")
	@Override
	public void method13837(@OriginalArg(0) Class102 arg0) {
		this.aClass548_4.method31240(arg0, (byte) 8);
	}

	@OriginalMember(owner = "client!ajw", name = "gz", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	void method24580(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ajw", name = "a", descriptor = "()I")
	@Override
	public int method13828() {
		return this.aClass548_4.anInt5132 * -1004622293;
	}

	@OriginalMember(owner = "client!ajw", name = "s", descriptor = "()I")
	@Override
	public int method13829() {
		return this.aClass548_4.anInt5132 * -1004622293;
	}

	@OriginalMember(owner = "client!ajw", name = "y", descriptor = "(Lclient!di;)V")
	@Override
	public void method13840(@OriginalArg(0) Class102 arg0) {
		this.aClass548_4.method31240(arg0, (byte) 8);
	}

	@OriginalMember(owner = "client!ajw", name = "x", descriptor = "()V")
	@Override
	public void method13832() {
	}

	@OriginalMember(owner = "client!ajw", name = "w", descriptor = "()V")
	@Override
	public void method13830() {
	}

	@OriginalMember(owner = "client!ajw", name = "r", descriptor = "()Z")
	@Override
	public boolean method13833() {
		return this.aClass548_4.method31246(-2004235983);
	}

	@OriginalMember(owner = "client!ajw", name = "q", descriptor = "()Z")
	@Override
	public boolean method13839() {
		return this.aClass548_4.method31246(-1016294577);
	}

	@OriginalMember(owner = "client!ajw", name = "h", descriptor = "()Z")
	@Override
	public boolean method13835() {
		return true;
	}

	@OriginalMember(owner = "client!ajw", name = "fo", descriptor = "(B)Z")
	@Override
	boolean method24566(@OriginalArg(0) byte arg0) {
		return false;
	}

	@OriginalMember(owner = "client!ajw", name = "fw", descriptor = "(Lclient!di;III)Z")
	@Override
	boolean method24583(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class625 local4 = this.aClass548_4.method31243((byte) 87);
		if (local4.aClass472_2 == null) {
			@Pc(26) Class105 local26 = this.aClass548_4.method31250(arg0, 131072, false, false, 1172213410);
			return local26 == null ? false : local26.method7360(arg1, arg2, this.method24526(), false, 0);
		} else {
			return arg0.method20733(arg1, arg2, this.method24526(), local4.aClass472_2, 92868112);
		}
	}

	@OriginalMember(owner = "client!ajw", name = "j", descriptor = "()I")
	@Override
	public int method13842() {
		return this.aClass548_4.anInt5132 * -1004622293;
	}

	@OriginalMember(owner = "client!ajw", name = "fg", descriptor = "(Lclient!di;)Lclient!tj;")
	@Override
	Class573 method24594(@OriginalArg(0) Class102 arg0) {
		@Pc(8) Class105 local8 = this.aClass548_4.method31250(arg0, 2048, false, true, 1200979328);
		if (local8 == null) {
			return null;
		}
		@Pc(16) Class471 local16 = this.method24526();
		@Pc(19) Class457 local19 = this.method24552();
		@Pc(24) Class573 local24 = Class454.method29307(this.aBoolean344, 2024626611);
		@Pc(31) int local31 = (int) local19.aClass463_61.aFloat297 >> 9;
		@Pc(38) int local38 = (int) local19.aClass463_61.aFloat296 >> 9;
		this.aClass548_4.method31238(arg0, local8, local16, local31, local31, local38, local38, true, 1870242416);
		@Pc(55) Class625 local55 = this.aClass548_4.method31243((byte) -7);
		if (local55.aClass472_2 == null) {
			local8.method7359(local16, this.aClass246Array21[0], 0);
		} else {
			local8.method7359(local16, null, 0);
			arg0.method20735(local16, this.aClass246Array21[0], local55.aClass472_2);
		}
		if (this.aClass548_4.aClass658_7 != null) {
			@Pc(90) Class221 local90 = this.aClass548_4.aClass658_7.method33244();
			arg0.method20964(local90);
		}
		this.aBoolean345 = local8.method7395() || this.aClass548_4.aClass658_7 != null;
		if (this.aClass589_7 == null) {
			this.aClass589_7 = Class67.method1243((int) local19.aClass463_61.aFloat297, (int) local19.aClass463_61.aFloat295, (int) local19.aClass463_61.aFloat296, local8, (byte) -48);
		} else {
			Class367.method28289(this.aClass589_7, (int) local19.aClass463_61.aFloat297, (int) local19.aClass463_61.aFloat295, (int) local19.aClass463_61.aFloat296, local8, -1768921150);
		}
		return local24;
	}

	@OriginalMember(owner = "client!ajw", name = "fr", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	void method24562(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ajw", name = "o", descriptor = "()I")
	@Override
	public int method13824() {
		return this.aClass548_4.anInt5132 * -1004622293;
	}

	@OriginalMember(owner = "client!ajw", name = "v", descriptor = "(Lclient!di;)V")
	@Override
	public void method13827(@OriginalArg(0) Class102 arg0) {
		this.aClass548_4.method31240(arg0, (byte) 8);
	}

	@OriginalMember(owner = "client!ajw", name = "ca", descriptor = "()Z")
	@Override
	boolean method24616() {
		return this.aBoolean345;
	}

	@OriginalMember(owner = "client!ajw", name = "cr", descriptor = "()Z")
	@Override
	boolean method24584() {
		return this.aBoolean345;
	}

	@OriginalMember(owner = "client!ajw", name = "ci", descriptor = "()I")
	@Override
	public int method24585() {
		return this.aClass548_4.method31249(145691826);
	}

	@OriginalMember(owner = "client!ajw", name = "cm", descriptor = "()I")
	@Override
	public int method24622() {
		return this.aClass548_4.method31249(-1580146417);
	}

	@OriginalMember(owner = "client!ajw", name = "cp", descriptor = "()I")
	@Override
	public int method24587() {
		return this.aClass548_4.method31249(1916211783);
	}

	@OriginalMember(owner = "client!ajw", name = "cg", descriptor = "()I")
	@Override
	public int method24588() {
		return this.aClass548_4.method31249(-207359463);
	}

	@OriginalMember(owner = "client!ajw", name = "fd", descriptor = "(Lclient!di;)Lclient!uc;")
	@Override
	public Class589 method24589(@OriginalArg(0) Class102 arg0) {
		return this.aClass589_7;
	}

	@OriginalMember(owner = "client!ajw", name = "fb", descriptor = "(I)V")
	@Override
	void method24570(@OriginalArg(0) int arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ajw", name = "cw", descriptor = "()I")
	@Override
	public int method24591() {
		return this.aClass548_4.method31244(-1556924939);
	}

	@OriginalMember(owner = "client!ajw", name = "fc", descriptor = "(Lclient!di;)Lclient!tj;")
	@Override
	Class573 method24592(@OriginalArg(0) Class102 arg0) {
		@Pc(8) Class105 local8 = this.aClass548_4.method31250(arg0, 2048, false, true, 1709660235);
		if (local8 == null) {
			return null;
		}
		@Pc(16) Class471 local16 = this.method24526();
		@Pc(19) Class457 local19 = this.method24552();
		@Pc(24) Class573 local24 = Class454.method29307(this.aBoolean344, -1629021874);
		@Pc(31) int local31 = (int) local19.aClass463_61.aFloat297 >> 9;
		@Pc(38) int local38 = (int) local19.aClass463_61.aFloat296 >> 9;
		this.aClass548_4.method31238(arg0, local8, local16, local31, local31, local38, local38, true, -164737084);
		@Pc(55) Class625 local55 = this.aClass548_4.method31243((byte) -1);
		if (local55.aClass472_2 == null) {
			local8.method7359(local16, this.aClass246Array21[0], 0);
		} else {
			local8.method7359(local16, null, 0);
			arg0.method20735(local16, this.aClass246Array21[0], local55.aClass472_2);
		}
		if (this.aClass548_4.aClass658_7 != null) {
			@Pc(90) Class221 local90 = this.aClass548_4.aClass658_7.method33244();
			arg0.method20964(local90);
		}
		this.aBoolean345 = local8.method7395() || this.aClass548_4.aClass658_7 != null;
		if (this.aClass589_7 == null) {
			this.aClass589_7 = Class67.method1243((int) local19.aClass463_61.aFloat297, (int) local19.aClass463_61.aFloat295, (int) local19.aClass463_61.aFloat296, local8, (byte) -84);
		} else {
			Class367.method28289(this.aClass589_7, (int) local19.aClass463_61.aFloat297, (int) local19.aClass463_61.aFloat295, (int) local19.aClass463_61.aFloat296, local8, 1158776062);
		}
		return local24;
	}

	@OriginalMember(owner = "client!ajw", name = "fl", descriptor = "(Lclient!di;)Lclient!tj;")
	@Override
	Class573 method24597(@OriginalArg(0) Class102 arg0) {
		@Pc(8) Class105 local8 = this.aClass548_4.method31250(arg0, 2048, false, true, 625642418);
		if (local8 == null) {
			return null;
		}
		@Pc(16) Class471 local16 = this.method24526();
		@Pc(19) Class457 local19 = this.method24552();
		@Pc(24) Class573 local24 = Class454.method29307(this.aBoolean344, 420689013);
		@Pc(31) int local31 = (int) local19.aClass463_61.aFloat297 >> 9;
		@Pc(38) int local38 = (int) local19.aClass463_61.aFloat296 >> 9;
		this.aClass548_4.method31238(arg0, local8, local16, local31, local31, local38, local38, true, 617335921);
		@Pc(55) Class625 local55 = this.aClass548_4.method31243((byte) 7);
		if (local55.aClass472_2 == null) {
			local8.method7359(local16, this.aClass246Array21[0], 0);
		} else {
			local8.method7359(local16, null, 0);
			arg0.method20735(local16, this.aClass246Array21[0], local55.aClass472_2);
		}
		if (this.aClass548_4.aClass658_7 != null) {
			@Pc(90) Class221 local90 = this.aClass548_4.aClass658_7.method33244();
			arg0.method20964(local90);
		}
		this.aBoolean345 = local8.method7395() || this.aClass548_4.aClass658_7 != null;
		if (this.aClass589_7 == null) {
			this.aClass589_7 = Class67.method1243((int) local19.aClass463_61.aFloat297, (int) local19.aClass463_61.aFloat295, (int) local19.aClass463_61.aFloat296, local8, (byte) -67);
		} else {
			Class367.method28289(this.aClass589_7, (int) local19.aClass463_61.aFloat297, (int) local19.aClass463_61.aFloat295, (int) local19.aClass463_61.aFloat296, local8, 1748772646);
		}
		return local24;
	}

	@OriginalMember(owner = "client!ajw", name = "gw", descriptor = "(Lclient!di;)V")
	@Override
	void method24593(@OriginalArg(0) Class102 arg0) {
		@Pc(8) Class105 local8 = this.aClass548_4.method31250(arg0, 262144, true, true, 1272878790);
		if (local8 == null) {
			return;
		}
		@Pc(13) Class471 local13 = this.method24526();
		@Pc(16) Class457 local16 = this.method24552();
		@Pc(23) int local23 = (int) local16.aClass463_61.aFloat297 >> 9;
		@Pc(30) int local30 = (int) local16.aClass463_61.aFloat296 >> 9;
		this.aClass548_4.method31238(arg0, local8, local13, local23, local23, local30, local30, false, -2109371388);
	}

	@OriginalMember(owner = "client!ajw", name = "ft", descriptor = "(Lclient!di;II)Z")
	@Override
	boolean method24563(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class625 local4 = this.aClass548_4.method31243((byte) 44);
		if (local4.aClass472_2 == null) {
			@Pc(26) Class105 local26 = this.aClass548_4.method31250(arg0, 131072, false, false, 513250842);
			return local26 == null ? false : local26.method7360(arg1, arg2, this.method24526(), false, 0);
		} else {
			return arg0.method20733(arg1, arg2, this.method24526(), local4.aClass472_2, 92868112);
		}
	}

	@OriginalMember(owner = "client!ajw", name = "fs", descriptor = "()Z")
	@Override
	boolean method24596() {
		return false;
	}

	@OriginalMember(owner = "client!ajw", name = "fu", descriptor = "()Z")
	@Override
	boolean method24606() {
		return false;
	}

	@OriginalMember(owner = "client!ajw", name = "gh", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	void method24600(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ajw", name = "k", descriptor = "()I")
	@Override
	public int method13818() {
		return this.aClass548_4.anInt5133 * 1263148313;
	}

	@OriginalMember(owner = "client!ajw", name = "bm", descriptor = "(Lclient!vj;)V")
	public void method13697(@OriginalArg(0) Class614 arg0) {
		this.aClass548_4.method31241(arg0, -1964913968);
	}

	@OriginalMember(owner = "client!ajw", name = "n", descriptor = "(Lclient!di;)V")
	@Override
	public void method13841(@OriginalArg(0) Class102 arg0) {
		this.aClass548_4.method31240(arg0, (byte) 8);
	}

	@OriginalMember(owner = "client!ajw", name = "d", descriptor = "()Z")
	@Override
	public boolean method13836() {
		return true;
	}

	@OriginalMember(owner = "client!ajw", name = "gk", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	void method24602(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ajw", name = "gg", descriptor = "()V")
	@Override
	void method24603() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ajw", name = "ge", descriptor = "()V")
	@Override
	void method24590() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ajw", name = "c", descriptor = "()I")
	@Override
	public int method13826() {
		return this.aClass548_4.anInt5130 * 1986737113;
	}

	@OriginalMember(owner = "client!ajw", name = "p", descriptor = "(Lclient!di;)V")
	@Override
	public void method13838(@OriginalArg(0) Class102 arg0) {
		this.aClass548_4.method31240(arg0, (byte) 8);
	}

	@OriginalMember(owner = "client!ajw", name = "ax", descriptor = "(Lclient!di;)V")
	@Override
	public void method13844(@OriginalArg(0) Class102 arg0) {
		this.aClass548_4.method31247(arg0, -1198410823);
	}

	@OriginalMember(owner = "client!ajw", name = "fy", descriptor = "(Lclient!di;Lclient!alf;IIIZI)V")
	@Override
	void method24569(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ajw", name = "i", descriptor = "(Lclient!di;I)V")
	@Override
	public void method13831(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		this.aClass548_4.method31247(arg0, -2079337544);
	}

	@OriginalMember(owner = "client!ajw", name = "b", descriptor = "()I")
	@Override
	public int method13843() {
		return this.aClass548_4.anInt5130 * 1986737113;
	}

	@OriginalMember(owner = "client!ajw", name = "ck", descriptor = "()Z")
	@Override
	boolean method24595() {
		return false;
	}

	@OriginalMember(owner = "client!ajw", name = "fz", descriptor = "(Lclient!di;I)Lclient!uc;")
	@Override
	public Class589 method24573(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		return this.aClass589_7;
	}

	@OriginalMember(owner = "client!ajw", name = "gb", descriptor = "(Lclient!di;)V")
	@Override
	void method24605(@OriginalArg(0) Class102 arg0) {
		@Pc(8) Class105 local8 = this.aClass548_4.method31250(arg0, 262144, true, true, 439178410);
		if (local8 == null) {
			return;
		}
		@Pc(13) Class471 local13 = this.method24526();
		@Pc(16) Class457 local16 = this.method24552();
		@Pc(23) int local23 = (int) local16.aClass463_61.aFloat297 >> 9;
		@Pc(30) int local30 = (int) local16.aClass463_61.aFloat296 >> 9;
		this.aClass548_4.method31238(arg0, local8, local13, local23, local23, local30, local30, false, -1006606739);
	}

	@OriginalMember(owner = "client!ajw", name = "bq", descriptor = "(Lclient!vj;)V")
	public void method13699(@OriginalArg(0) Class614 arg0) {
		this.aClass548_4.method31241(arg0, 111748261);
	}

	@OriginalMember(owner = "client!ajw", name = "bd", descriptor = "(Lclient!vj;)V")
	public void method13700(@OriginalArg(0) Class614 arg0) {
		this.aClass548_4.method31241(arg0, 233149658);
	}
}
