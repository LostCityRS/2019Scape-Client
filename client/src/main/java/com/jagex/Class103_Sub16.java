package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!agm")
public final class Class103_Sub16 extends Class103 {

	@OriginalMember(owner = "client!agm", name = "e", descriptor = "I")
	static final int anInt973 = 1;

	@OriginalMember(owner = "client!agm", name = "f", descriptor = "I")
	static final int anInt984 = 0;

	@OriginalMember(owner = "client!agm", name = "g", descriptor = "I")
	final int anInt972;

	@OriginalMember(owner = "client!agm", name = "i", descriptor = "I")
	final int anInt982;

	@OriginalMember(owner = "client!agm", name = "l", descriptor = "I")
	final int anInt983;

	@OriginalMember(owner = "client!agm", name = "j", descriptor = "I")
	final int anInt980;

	@OriginalMember(owner = "client!agm", name = "a", descriptor = "I")
	final int anInt981;

	@OriginalMember(owner = "client!agm", name = "o", descriptor = "I")
	final int anInt979;

	@OriginalMember(owner = "client!agm", name = "u", descriptor = "I")
	final int anInt974;

	@OriginalMember(owner = "client!agm", name = "k", descriptor = "I")
	final int anInt975;

	@OriginalMember(owner = "client!agm", name = "m", descriptor = "I")
	final int anInt978;

	@OriginalMember(owner = "client!agm", name = "s", descriptor = "I")
	final int anInt976;

	@OriginalMember(owner = "client!agm", name = "x", descriptor = "I")
	final int anInt977;

	@OriginalMember(owner = "client!agm", name = "w", descriptor = "I")
	final int anInt985;

	@OriginalMember(owner = "client!agm", name = "r", descriptor = "I")
	final int anInt986;

	@OriginalMember(owner = "client!agm", name = "<init>", descriptor = "(Lclient!ald;II)V")
	Class103_Sub16(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0);
		@Pc(8) int local8;
		if (arg1 == 0) {
			local8 = arg0.method23182(-1111874328);
			this.anInt972 = (local8 >>> 16) * 2017956127;
			this.anInt982 = (local8 & 0xFFFF) * -1212266899;
			this.anInt983 = 442471813;
		} else {
			this.anInt972 = -2017956127;
			this.anInt982 = 1212266899;
			this.anInt983 = arg0.method23178((byte) -121) * -442471813;
		}
		if (arg2 == 0) {
			local8 = arg0.method23182(547266708);
			this.anInt980 = (local8 >>> 16) * -262104243;
			this.anInt981 = (local8 & 0xFFFF) * 359743959;
			this.anInt979 = 1506510667;
		} else {
			this.anInt980 = 262104243;
			this.anInt981 = -359743959;
			this.anInt979 = arg0.method23178((byte) -4) * -1506510667;
		}
		if (arg1 == 0 && arg2 == 0) {
			this.anInt974 = arg0.method23362(-646522830) * 632313999;
		} else {
			this.anInt974 = -632313999;
		}
		this.anInt975 = arg0.method23178((byte) -15) * 2063479091;
		this.anInt978 = arg0.method23362(-1848021133) * -2089706313;
		this.anInt976 = arg0.method23362(121664524) * 1815983345;
		this.anInt977 = arg0.method23180(1710327153) * 1957820963;
		this.anInt985 = arg0.method23178((byte) -97) * -907579529;
		this.anInt986 = arg0.method23362(-99074495) * 1387033951;
	}

	@OriginalMember(owner = "client!agm", name = "f", descriptor = "(I)V")
	@Override
	public void method19206(@OriginalArg(0) int arg0) {
		@Pc(11) int local11;
		@Pc(18) int local18;
		@Pc(23) int local23;
		@Pc(33) Class120_Sub1_Sub1_Sub1 local33;
		@Pc(37) Class463 local37;
		if (this.anInt972 * 1366731487 >= 0) {
			local11 = this.anInt972 * -313147904 + 256;
			local18 = this.anInt982 * -513357312 + 256;
			local23 = this.anInt974 * 46515823;
		} else {
			local33 = Class251.aClass254Array1[this.anInt983 * 369157299].method26399((byte) -25);
			local37 = local33.method24552().aClass463_61;
			local11 = (int) local37.aFloat297;
			local18 = (int) local37.aFloat296;
			local23 = local33.aByte99;
		}
		@Pc(60) int local60;
		@Pc(67) int local67;
		if (this.anInt982 * -479153307 >= 0) {
			local60 = this.anInt980 * -1272247808 + 256;
			local67 = this.anInt981 * -1266430464 + 256;
		} else {
			local33 = Class251.aClass254Array1[this.anInt979 * -1529694819].method26399((byte) -66);
			local37 = local33.method24552().aClass463_61;
			local60 = (int) local37.aFloat297;
			local67 = (int) local37.aFloat296;
			if (local23 < 0) {
				local23 = local33.aByte99;
			}
		}
		@Pc(101) int local101 = this.anInt986 * 115943071 << 2;
		@Pc(155) Class120_Sub1_Sub1_Sub4 local155 = new Class120_Sub1_Sub1_Sub4(client.aClass539_1.method30932(-1638462787), this.anInt975 * -13028869, local23, local23, local11, local18, this.anInt978 * 66584839 << 2, client.anInt3436, client.anInt3436 + this.anInt977 * -1442609781, this.anInt985 * 670177863, local101, this.anInt983 * 369157299 + 1, this.anInt979 * -1529694819 + 1, this.anInt976 * -681133039 << 2, false, 0, 0);
		local155.method24204(local60, local67, this.anInt976 * -681133039 << 2, this.anInt977 * -1442609781 + client.anInt3436, 1796500373);
		client.aClass8_49.method232(new Class80_Sub1_Sub6(local155), 1607625107);
	}

	@OriginalMember(owner = "client!agm", name = "i", descriptor = "()Z")
	@Override
	boolean method19199() {
		@Pc(8) Class684 local8 = (Class684) Class104_Sub2.aClass41_Sub16_1.method18054(this.anInt975 * -13028869, 1341948930);
		@Pc(12) boolean local12 = local8.method36785(-479664214);
		@Pc(21) Class261 local21 = (Class261) Class125.aClass41_Sub1_6.method18054(local8.anInt5764 * 319211597, -1898283354);
		return local12 & local21.method26480(1740709047);
	}

	@OriginalMember(owner = "client!agm", name = "u", descriptor = "(I)Z")
	@Override
	boolean method19201(@OriginalArg(0) int arg0) {
		@Pc(8) Class684 local8 = (Class684) Class104_Sub2.aClass41_Sub16_1.method18054(this.anInt975 * -13028869, -182324150);
		@Pc(12) boolean local12 = local8.method36785(-1951250765);
		@Pc(21) Class261 local21 = (Class261) Class125.aClass41_Sub1_6.method18054(local8.anInt5764 * 319211597, -992264426);
		return local12 & local21.method26480(1740709047);
	}

	@OriginalMember(owner = "client!agm", name = "l", descriptor = "()V")
	@Override
	public void method19198() {
		@Pc(11) int local11;
		@Pc(18) int local18;
		@Pc(23) int local23;
		@Pc(33) Class120_Sub1_Sub1_Sub1 local33;
		@Pc(37) Class463 local37;
		if (this.anInt972 * 1366731487 >= 0) {
			local11 = this.anInt972 * -313147904 + 256;
			local18 = this.anInt982 * -513357312 + 256;
			local23 = this.anInt974 * 46515823;
		} else {
			local33 = Class251.aClass254Array1[this.anInt983 * 369157299].method26399((byte) -14);
			local37 = local33.method24552().aClass463_61;
			local11 = (int) local37.aFloat297;
			local18 = (int) local37.aFloat296;
			local23 = local33.aByte99;
		}
		@Pc(60) int local60;
		@Pc(67) int local67;
		if (this.anInt982 * -479153307 >= 0) {
			local60 = this.anInt980 * -1272247808 + 256;
			local67 = this.anInt981 * -1266430464 + 256;
		} else {
			local33 = Class251.aClass254Array1[this.anInt979 * -1529694819].method26399((byte) 31);
			local37 = local33.method24552().aClass463_61;
			local60 = (int) local37.aFloat297;
			local67 = (int) local37.aFloat296;
			if (local23 < 0) {
				local23 = local33.aByte99;
			}
		}
		@Pc(101) int local101 = this.anInt986 * 115943071 << 2;
		@Pc(155) Class120_Sub1_Sub1_Sub4 local155 = new Class120_Sub1_Sub1_Sub4(client.aClass539_1.method30932(-1638462787), this.anInt975 * -13028869, local23, local23, local11, local18, this.anInt978 * 66584839 << 2, client.anInt3436, client.anInt3436 + this.anInt977 * -1442609781, this.anInt985 * 670177863, local101, this.anInt983 * 369157299 + 1, this.anInt979 * -1529694819 + 1, this.anInt976 * -681133039 << 2, false, 0, 0);
		local155.method24204(local60, local67, this.anInt976 * -681133039 << 2, this.anInt977 * -1442609781 + client.anInt3436, 2089421561);
		client.aClass8_49.method232(new Class80_Sub1_Sub6(local155), 2247769);
	}

	@OriginalMember(owner = "client!agm", name = "g", descriptor = "()V")
	@Override
	public void method19202() {
		@Pc(11) int local11;
		@Pc(18) int local18;
		@Pc(23) int local23;
		@Pc(33) Class120_Sub1_Sub1_Sub1 local33;
		@Pc(37) Class463 local37;
		if (this.anInt972 * 1366731487 >= 0) {
			local11 = this.anInt972 * -313147904 + 256;
			local18 = this.anInt982 * -513357312 + 256;
			local23 = this.anInt974 * 46515823;
		} else {
			local33 = Class251.aClass254Array1[this.anInt983 * 369157299].method26399((byte) -5);
			local37 = local33.method24552().aClass463_61;
			local11 = (int) local37.aFloat297;
			local18 = (int) local37.aFloat296;
			local23 = local33.aByte99;
		}
		@Pc(60) int local60;
		@Pc(67) int local67;
		if (this.anInt982 * -479153307 >= 0) {
			local60 = this.anInt980 * -1272247808 + 256;
			local67 = this.anInt981 * -1266430464 + 256;
		} else {
			local33 = Class251.aClass254Array1[this.anInt979 * -1529694819].method26399((byte) 60);
			local37 = local33.method24552().aClass463_61;
			local60 = (int) local37.aFloat297;
			local67 = (int) local37.aFloat296;
			if (local23 < 0) {
				local23 = local33.aByte99;
			}
		}
		@Pc(101) int local101 = this.anInt986 * 115943071 << 2;
		@Pc(155) Class120_Sub1_Sub1_Sub4 local155 = new Class120_Sub1_Sub1_Sub4(client.aClass539_1.method30932(-1638462787), this.anInt975 * -13028869, local23, local23, local11, local18, this.anInt978 * 66584839 << 2, client.anInt3436, client.anInt3436 + this.anInt977 * -1442609781, this.anInt985 * 670177863, local101, this.anInt983 * 369157299 + 1, this.anInt979 * -1529694819 + 1, this.anInt976 * -681133039 << 2, false, 0, 0);
		local155.method24204(local60, local67, this.anInt976 * -681133039 << 2, this.anInt977 * -1442609781 + client.anInt3436, 1946768887);
		client.aClass8_49.method232(new Class80_Sub1_Sub6(local155), 85960962);
	}

	@OriginalMember(owner = "client!agm", name = "m", descriptor = "()Z")
	@Override
	boolean method19204() {
		@Pc(8) Class684 local8 = (Class684) Class104_Sub2.aClass41_Sub16_1.method18054(this.anInt975 * -13028869, 1866060972);
		@Pc(12) boolean local12 = local8.method36785(-1961118991);
		@Pc(21) Class261 local21 = (Class261) Class125.aClass41_Sub1_6.method18054(local8.anInt5764 * 319211597, 1171309191);
		return local12 & local21.method26480(1740709047);
	}
}
