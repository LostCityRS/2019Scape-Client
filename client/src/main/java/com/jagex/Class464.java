package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.util.HashMap;
import java.util.Map;

@OriginalClass("client!oo")
public final class Class464 implements Interface1 {

	@OriginalMember(owner = "client!oo", name = "e", descriptor = "Lclient!ej;")
	final Class243 aClass243_86 = new Class243(20);

	@OriginalMember(owner = "client!oo", name = "u", descriptor = "Lclient!ej;")
	final Class243 aClass243_87 = new Class243(20);

	@OriginalMember(owner = "client!oo", name = "i", descriptor = "Lclient!di;")
	Class102 aClass102_11 = null;

	@OriginalMember(owner = "client!oo", name = "m", descriptor = "Ljava/util/Map;")
	Map aMap20 = null;

	@OriginalMember(owner = "client!oo", name = "t", descriptor = "Lclient!pf;")
	final Class480 aClass480_117;

	@OriginalMember(owner = "client!oo", name = "f", descriptor = "Lclient!pf;")
	final Class480 aClass480_116;

	@OriginalMember(owner = "client!oo", name = "l", descriptor = "[I")
	final int[] anIntArray452;

	@OriginalMember(owner = "client!oo", name = "g", descriptor = "Lclient!ej;")
	Class243 aClass243_85;

	@OriginalMember(owner = "client!oo", name = "xj", descriptor = "(Lclient!yp;I)V")
	static void method29618(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 100;
	}

	@OriginalMember(owner = "client!oo", name = "ij", descriptor = "(Lclient!yp;I)V")
	static void method29619(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class146.method13873(local11, local14, arg0, -1387441100);
	}

	@OriginalMember(owner = "client!oo", name = "p", descriptor = "(Lclient!aku;I)[I")
	static int[] method29620(@OriginalArg(0) Class80_Sub31 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Packet local4 = new Packet(518);
		@Pc(7) int[] local7 = new int[4];
		@Pc(9) int local9;
		for (local9 = 0; local9 < 4; local9++) {
			local7[local9] = (int) (Math.random() * 9.9999999E7D);
		}
		local4.p1(10);
		local4.p4(local7[0]);
		local4.p4(local7[1]);
		local4.p4(local7[2]);
		local4.p4(local7[3]);
		for (local9 = 0; local9 < 10; local9++) {
			local4.p4((int) (Math.random() * 9.9999999E7D));
		}
		local4.p2((int) (Math.random() * 9.9999999E7D));
		local4.rsaenc(Class174.aBigInteger1, Class174.aBigInteger2);
		arg0.aPacketBit_2.pdata(local4.data, 0, local4.pos * -1380987821);
		return local7;
	}

	@OriginalMember(owner = "client!oo", name = "adg", descriptor = "(Lclient!yp;B)V")
	static void method29621(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(31) int local31 = client.aClass533ArrayArray1[local23][local13].method30824((byte) 68);
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local31 == 5 ? 1 : 0;
	}

	@OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(Lclient!di;Lclient!pf;Lclient!pf;[I)V")
	public Class464(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class480 arg1, @OriginalArg(2) Class480 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass102_11 = arg0;
		this.aClass480_117 = arg1;
		this.aClass480_116 = arg2;
		this.anIntArray452 = arg3;
		this.aClass243_85 = new Class243(20);
	}

	@OriginalMember(owner = "client!oo", name = "n", descriptor = "()I")
	public int method29588() {
		return this.anIntArray452 == null ? 0 : this.anIntArray452.length * 2;
	}

	@OriginalMember(owner = "client!oo", name = "t", descriptor = "(Lclient!od;I)V")
	public void method29589(@OriginalArg(0) Interface49 arg0, @OriginalArg(1) int arg1) {
		this.aMap20 = new HashMap(this.anIntArray452.length);
		for (@Pc(9) int local9 = 0; local9 < this.anIntArray452.length; local9++) {
			@Pc(19) int local19 = this.anIntArray452[local9];
			@Pc(26) Class15 local26 = Class218.method25878(this.aClass480_116, local19, this, 1049746483);
			@Pc(32) byte[] local32 = this.aClass480_117.method29926(local19, 1472047355);
			@Pc(39) Object local39 = arg0.method31897(local32, local26, true, -739358597);
			this.aMap20.put(local9, new Class44(local39, local26));
		}
	}

	@OriginalMember(owner = "client!oo", name = "f", descriptor = "(I)V")
	public void method29590(@OriginalArg(0) int arg0) {
		this.aMap20 = null;
	}

	@OriginalMember(owner = "client!oo", name = "ab", descriptor = "(I)I")
	@Override
	public int method29586(@OriginalArg(0) int arg0) {
		@Pc(6) Class99[] local6 = this.method29582(this.aClass102_11, arg0, (byte) 1);
		return local6 == null ? 0 : local6[0].method18214();
	}

	@OriginalMember(owner = "client!oo", name = "u", descriptor = "(ZB)I")
	public int method29591(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte arg1) {
		if (this.anIntArray452 == null) {
			return 0;
		} else if (arg0 || this.aMap20 == null) {
			@Pc(18) int local18 = 0;
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray452.length; local20++) {
				@Pc(30) int local30 = this.anIntArray452[local20];
				if (this.aClass480_117.method29945(local30, (byte) 1)) {
					local18++;
				}
				if (this.aClass480_116.method29945(local30, (byte) 1)) {
					local18++;
				}
			}
			return local18;
		} else {
			return this.anIntArray452.length * 2;
		}
	}

	@OriginalMember(owner = "client!oo", name = "l", descriptor = "(I)I")
	public int method29592(@OriginalArg(0) int arg0) {
		return this.anIntArray452 == null ? 0 : this.anIntArray452.length * 2;
	}

	@OriginalMember(owner = "client!oo", name = "c", descriptor = "()I")
	public int method29593() {
		return this.anIntArray452 == null ? 0 : this.anIntArray452.length * 2;
	}

	@OriginalMember(owner = "client!oo", name = "i", descriptor = "(Lclient!od;IB)Lclient!aan;")
	public Class15 method29594(@OriginalArg(0) Interface49 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		return this.method29595(arg0, arg1, true, true, (byte) 78);
	}

	@OriginalMember(owner = "client!oo", name = "m", descriptor = "(Lclient!od;IZZB)Lclient!aan;")
	Class15 method29595(@OriginalArg(0) Interface49 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte arg4) {
		if (arg1 == -1) {
			return null;
		}
		if (this.anIntArray452 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.anIntArray452.length; local10++) {
				if (arg1 == this.anIntArray452[local10]) {
					return (Class15) ((Class44) this.aMap20.get(local10)).anObject2;
				}
			}
		}
		if (arg3) {
			this.aClass480_117.method29945(arg1, (byte) 1);
		}
		@Pc(47) Class15 local47 = (Class15) this.aClass243_87.method26282((long) arg1);
		if (local47 != null) {
			return local47;
		}
		local47 = Class218.method25878(this.aClass480_116, arg1, this, 745304648);
		if (local47 == null) {
			return null;
		} else {
			if (arg2) {
				this.aClass243_87.method26253(local47, (long) arg1);
			}
			return local47;
		}
	}

	@OriginalMember(owner = "client!oo", name = "o", descriptor = "(I)V")
	public void method29596(@OriginalArg(0) int arg0) {
		this.aClass243_87.method26256(1693912082);
		this.aClass243_86.method26256(1693912082);
		if (this.aClass243_85 != null) {
			this.aClass243_85.method26256(1693912082);
		}
	}

	@OriginalMember(owner = "client!oo", name = "v", descriptor = "()I")
	public int method29597() {
		return this.method29591(false, (byte) 1);
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(I)V")
	public void method29598(@OriginalArg(0) int arg0) {
		this.aClass243_87.method26259((byte) 3);
		this.aClass243_86.method26259((byte) 3);
		if (this.aClass243_85 != null) {
			this.aClass243_85.method26259((byte) 3);
		}
	}

	@OriginalMember(owner = "client!oo", name = "s", descriptor = "(Lclient!di;IB)[Lclient!cm;")
	@Override
	public Class99[] method29582(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (this.aClass243_85 == null) {
			return null;
		}
		if (arg0 == null) {
			arg0 = this.aClass102_11;
		} else {
			if (this.aClass102_11 != arg0) {
				this.aClass243_85.method26256(1693912082);
			}
			this.aClass102_11 = arg0;
		}
		if (arg0 == null) {
			return null;
		}
		@Pc(32) Class99[] local32 = (Class99[]) this.aClass243_85.method26282((long) arg1);
		if (local32 == null) {
			@Pc(41) Class109[] local41 = Class212.method25824(this.aClass480_117, arg1, 0);
			if (local41 != null && local41.length > 0) {
				local32 = new Class99[local41.length];
				for (@Pc(52) int local52 = 0; local52 < local41.length; local52++) {
					local32[local52] = arg0.method20906(local41[local52], true);
				}
				this.aClass243_85.method26253(local32, (long) arg1);
			}
		}
		return local32;
	}

	@OriginalMember(owner = "client!oo", name = "k", descriptor = "(II)I")
	@Override
	public int method29584(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class99[] local6 = this.method29582(this.aClass102_11, arg0, (byte) 1);
		return local6 == null ? 0 : local6[0].method18214();
	}

	@OriginalMember(owner = "client!oo", name = "x", descriptor = "(Lclient!od;)V")
	public void method29599(@OriginalArg(0) Interface49 arg0) {
		this.aMap20 = new HashMap(this.anIntArray452.length);
		for (@Pc(9) int local9 = 0; local9 < this.anIntArray452.length; local9++) {
			@Pc(19) int local19 = this.anIntArray452[local9];
			@Pc(26) Class15 local26 = Class218.method25878(this.aClass480_116, local19, this, 1274408694);
			@Pc(32) byte[] local32 = this.aClass480_117.method29926(local19, 1472047355);
			@Pc(39) Object local39 = arg0.method31897(local32, local26, true, -1055715587);
			this.aMap20.put(local9, new Class44(local39, local26));
		}
	}

	@OriginalMember(owner = "client!oo", name = "w", descriptor = "(Lclient!od;)V")
	public void method29600(@OriginalArg(0) Interface49 arg0) {
		this.aMap20 = new HashMap(this.anIntArray452.length);
		for (@Pc(9) int local9 = 0; local9 < this.anIntArray452.length; local9++) {
			@Pc(19) int local19 = this.anIntArray452[local9];
			@Pc(26) Class15 local26 = Class218.method25878(this.aClass480_116, local19, this, 1214906229);
			@Pc(32) byte[] local32 = this.aClass480_117.method29926(local19, 1472047355);
			@Pc(39) Object local39 = arg0.method31897(local32, local26, true, -1119190562);
			this.aMap20.put(local9, new Class44(local39, local26));
		}
	}

	@OriginalMember(owner = "client!oo", name = "r", descriptor = "()V")
	public void method29601() {
		this.aMap20 = null;
	}

	@OriginalMember(owner = "client!oo", name = "g", descriptor = "(Lclient!od;IZZI)Ljava/lang/Object;")
	public Object method29602(@OriginalArg(0) Interface49 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		if (arg1 == -1) {
			return null;
		}
		if (this.anIntArray452 != null) {
			for (@Pc(9) int local9 = 0; local9 < this.anIntArray452.length; local9++) {
				if (this.anIntArray452[local9] == arg1) {
					return ((Class44) this.aMap20.get(local9)).anObject1;
				}
			}
		}
		@Pc(44) Object local44 = this.aClass243_86.method26282((long) (arg1 << 1 | (arg3 ? 1 : 0)));
		if (local44 != null) {
			return local44;
		}
		@Pc(54) byte[] local54 = this.aClass480_117.method29926(arg1, 1472047355);
		if (local54 == null) {
			return null;
		}
		@Pc(66) Class15 local66 = this.method29595(arg0, arg1, arg2, false, (byte) 116);
		if (local66 == null) {
			return null;
		} else {
			local44 = arg0.method31897(local54, local66, arg3, 330847094);
			this.aClass243_86.method26253(local44, (long) (arg1 << 1 | (arg3 ? 1 : 0)));
			return local44;
		}
	}

	@OriginalMember(owner = "client!oo", name = "h", descriptor = "()V")
	public void method29603() {
		this.aMap20 = null;
	}

	@OriginalMember(owner = "client!oo", name = "j", descriptor = "(II)V")
	public void method29604(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass243_87.method26247(arg0, (byte) 63);
		this.aClass243_86.method26247(arg0, (byte) 7);
		if (this.aClass243_85 != null) {
			this.aClass243_85.method26247(arg0, (byte) 72);
		}
	}

	@OriginalMember(owner = "client!oo", name = "z", descriptor = "()I")
	public int method29605() {
		return this.method29591(false, (byte) 1);
	}

	@OriginalMember(owner = "client!oo", name = "q", descriptor = "()V")
	public void method29606() {
		this.aMap20 = null;
	}

	@OriginalMember(owner = "client!oo", name = "y", descriptor = "(Z)I")
	public int method29607(@OriginalArg(0) boolean arg0) {
		if (this.anIntArray452 == null) {
			return 0;
		} else if (arg0 || this.aMap20 == null) {
			@Pc(18) int local18 = 0;
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray452.length; local20++) {
				@Pc(30) int local30 = this.anIntArray452[local20];
				if (this.aClass480_117.method29945(local30, (byte) 1)) {
					local18++;
				}
				if (this.aClass480_116.method29945(local30, (byte) 1)) {
					local18++;
				}
			}
			return local18;
		} else {
			return this.anIntArray452.length * 2;
		}
	}

	@OriginalMember(owner = "client!oo", name = "e", descriptor = "(B)I")
	public int method29608(@OriginalArg(0) byte arg0) {
		return this.method29591(false, (byte) 1);
	}

	@OriginalMember(owner = "client!oo", name = "al", descriptor = "(I)I")
	@Override
	public int method29587(@OriginalArg(0) int arg0) {
		@Pc(6) Class99[] local6 = this.method29582(this.aClass102_11, arg0, (byte) 1);
		return local6 == null ? 0 : local6[0].method18214();
	}

	@OriginalMember(owner = "client!oo", name = "b", descriptor = "(Lclient!od;IZZ)Ljava/lang/Object;")
	public Object method29609(@OriginalArg(0) Interface49 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		if (arg1 == -1) {
			return null;
		}
		if (this.anIntArray452 != null) {
			for (@Pc(9) int local9 = 0; local9 < this.anIntArray452.length; local9++) {
				if (this.anIntArray452[local9] == arg1) {
					return ((Class44) this.aMap20.get(local9)).anObject1;
				}
			}
		}
		@Pc(44) Object local44 = this.aClass243_86.method26282((long) (arg1 << 1 | (arg3 ? 1 : 0)));
		if (local44 != null) {
			return local44;
		}
		@Pc(54) byte[] local54 = this.aClass480_117.method29926(arg1, 1472047355);
		if (local54 == null) {
			return null;
		}
		@Pc(66) Class15 local66 = this.method29595(arg0, arg1, arg2, false, (byte) 10);
		if (local66 == null) {
			return null;
		} else {
			local44 = arg0.method31897(local54, local66, arg3, -1411404498);
			this.aClass243_86.method26253(local44, (long) (arg1 << 1 | (arg3 ? 1 : 0)));
			return local44;
		}
	}

	@OriginalMember(owner = "client!oo", name = "ax", descriptor = "(Lclient!od;IZZ)Ljava/lang/Object;")
	public Object method29610(@OriginalArg(0) Interface49 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		if (arg1 == -1) {
			return null;
		}
		if (this.anIntArray452 != null) {
			for (@Pc(9) int local9 = 0; local9 < this.anIntArray452.length; local9++) {
				if (this.anIntArray452[local9] == arg1) {
					return ((Class44) this.aMap20.get(local9)).anObject1;
				}
			}
		}
		@Pc(44) Object local44 = this.aClass243_86.method26282((long) (arg1 << 1 | (arg3 ? 1 : 0)));
		if (local44 != null) {
			return local44;
		}
		@Pc(54) byte[] local54 = this.aClass480_117.method29926(arg1, 1472047355);
		if (local54 == null) {
			return null;
		}
		@Pc(66) Class15 local66 = this.method29595(arg0, arg1, arg2, false, (byte) 93);
		if (local66 == null) {
			return null;
		} else {
			local44 = arg0.method31897(local54, local66, arg3, -1284022697);
			this.aClass243_86.method26253(local44, (long) (arg1 << 1 | (arg3 ? 1 : 0)));
			return local44;
		}
	}

	@OriginalMember(owner = "client!oo", name = "ay", descriptor = "(Lclient!od;I)Lclient!aan;")
	public Class15 method29611(@OriginalArg(0) Interface49 arg0, @OriginalArg(1) int arg1) {
		return this.method29595(arg0, arg1, true, true, (byte) 44);
	}

	@OriginalMember(owner = "client!oo", name = "ai", descriptor = "(Lclient!od;IZZ)Lclient!aan;")
	Class15 method29612(@OriginalArg(0) Interface49 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		if (arg1 == -1) {
			return null;
		}
		if (this.anIntArray452 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.anIntArray452.length; local10++) {
				if (arg1 == this.anIntArray452[local10]) {
					return (Class15) ((Class44) this.aMap20.get(local10)).anObject2;
				}
			}
		}
		if (arg3) {
			this.aClass480_117.method29945(arg1, (byte) 1);
		}
		@Pc(47) Class15 local47 = (Class15) this.aClass243_87.method26282((long) arg1);
		if (local47 != null) {
			return local47;
		}
		local47 = Class218.method25878(this.aClass480_116, arg1, this, 1527702772);
		if (local47 == null) {
			return null;
		} else {
			if (arg2) {
				this.aClass243_87.method26253(local47, (long) arg1);
			}
			return local47;
		}
	}

	@OriginalMember(owner = "client!oo", name = "p", descriptor = "()I")
	public int method29613() {
		return this.method29591(false, (byte) 1);
	}

	@OriginalMember(owner = "client!oo", name = "ao", descriptor = "()V")
	public void method29614() {
		this.aClass243_87.method26259((byte) 3);
		this.aClass243_86.method26259((byte) 3);
		if (this.aClass243_85 != null) {
			this.aClass243_85.method26259((byte) 3);
		}
	}

	@OriginalMember(owner = "client!oo", name = "aj", descriptor = "()V")
	public void method29615() {
		this.aClass243_87.method26259((byte) 3);
		this.aClass243_86.method26259((byte) 3);
		if (this.aClass243_85 != null) {
			this.aClass243_85.method26259((byte) 3);
		}
	}

	@OriginalMember(owner = "client!oo", name = "d", descriptor = "()V")
	public void method29616() {
		this.aMap20 = null;
	}

	@OriginalMember(owner = "client!oo", name = "ag", descriptor = "(I)I")
	@Override
	public int method29585(@OriginalArg(0) int arg0) {
		@Pc(6) Class99[] local6 = this.method29582(this.aClass102_11, arg0, (byte) 1);
		return local6 == null ? 0 : local6[0].method18214();
	}

	@OriginalMember(owner = "client!oo", name = "aq", descriptor = "(I)V")
	public void method29617(@OriginalArg(0) int arg0) {
		this.aClass243_87.method26247(arg0, (byte) 21);
		this.aClass243_86.method26247(arg0, (byte) 64);
		if (this.aClass243_85 != null) {
			this.aClass243_85.method26247(arg0, (byte) 120);
		}
	}

	@OriginalMember(owner = "client!oo", name = "ac", descriptor = "(Lclient!di;I)[Lclient!cm;")
	@Override
	public Class99[] method29583(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass243_85 == null) {
			return null;
		}
		if (arg0 == null) {
			arg0 = this.aClass102_11;
		} else {
			if (this.aClass102_11 != arg0) {
				this.aClass243_85.method26256(1693912082);
			}
			this.aClass102_11 = arg0;
		}
		if (arg0 == null) {
			return null;
		}
		@Pc(32) Class99[] local32 = (Class99[]) this.aClass243_85.method26282((long) arg1);
		if (local32 == null) {
			@Pc(41) Class109[] local41 = Class212.method25824(this.aClass480_117, arg1, 0);
			if (local41 != null && local41.length > 0) {
				local32 = new Class99[local41.length];
				for (@Pc(52) int local52 = 0; local52 < local41.length; local52++) {
					local32[local52] = arg0.method20906(local41[local52], true);
				}
				this.aClass243_85.method26253(local32, (long) arg1);
			}
		}
		return local32;
	}
}
