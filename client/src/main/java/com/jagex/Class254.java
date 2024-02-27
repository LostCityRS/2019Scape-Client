package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ex")
public final class Class254 {

	@OriginalMember(owner = "client!ex", name = "t", descriptor = "I")
	static final int anInt3884 = 25;

	@OriginalMember(owner = "client!ex", name = "k", descriptor = "I")
	public static int anInt3885;

	@OriginalMember(owner = "client!ex", name = "i", descriptor = "[I")
	int[] anIntArray367;

	@OriginalMember(owner = "client!ex", name = "u", descriptor = "Z")
	public boolean aBoolean775 = false;

	@OriginalMember(owner = "client!ex", name = "l", descriptor = "Lclient!aqb;")
	Class120_Sub1_Sub1_Sub1_Sub1 aClass120_Sub1_Sub1_Sub1_Sub1_2 = null;

	@OriginalMember(owner = "client!ex", name = "g", descriptor = "Lclient!aqc;")
	Class120_Sub1_Sub1_Sub1_Sub2 aClass120_Sub1_Sub1_Sub1_Sub2_2 = null;

	@OriginalMember(owner = "client!ex", name = "f", descriptor = "I")
	final int anInt3882;

	@OriginalMember(owner = "client!ex", name = "e", descriptor = "I")
	public final int anInt3883;

	@OriginalMember(owner = "client!ex", name = "ih", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;B)V")
	static void method26400(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) byte arg3) {
		arg0.aString187 = null;
		arg0.aClass322_7 = null;
	}

	@OriginalMember(owner = "client!ex", name = "ns", descriptor = "(Lclient!yp;B)V")
	static void method26401(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class60.method1185(local11, local14, arg0, (byte) 0);
	}

	@OriginalMember(owner = "client!ex", name = "zy", descriptor = "(Lclient!yp;I)V")
	static void method26402(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= 1593803993;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(33) int local33 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 2];
		@Pc(43) int local43 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 3];
		@Pc(53) int local53 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 4];
		if (local33 == -1) {
			throw new RuntimeException();
		}
		@Pc(66) Class50 local66 = (Class50) Class111_Sub1.aClass41_Sub20_1.method18054(local33, -1399514700);
		if (local66.aClass521_2.getId() != local23) {
			throw new RuntimeException();
		} else if (local66.aClass521_1.getId() == local13) {
			@Pc(90) int[] local90 = local66.method1019(local43, 1896589581);
			if (local53 < 0 || local90 == null || local90.length <= local53) {
				throw new RuntimeException();
			}
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local90[local53];
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ex", name = "zd", descriptor = "(Lclient!yp;I)V")
	static void method26403(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		if (client.anInt3577 * 740205413 == 2 && local12 < client.anInt3573 * 975306769) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = client.aClass676Array1[local12].anInt5740 * 922507867;
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
		}
	}

	@OriginalMember(owner = "client!ex", name = "<init>", descriptor = "(Lclient!ald;I)V")
	Class254(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		this.anInt3882 = arg1 * 983242283;
		@Pc(19) int local19 = arg0.g1();
		switch(local19) {
			case 0:
				this.anInt3883 = arg0.gSmart2or4null() * -1986175849;
				break;
			case 1:
				this.anInt3883 = 1986175849;
				break;
			default:
				this.anInt3883 = 1986175849;
		}
		arg0.gjstr();
	}

	@OriginalMember(owner = "client!ex", name = "r", descriptor = "()Z")
	boolean method26384() {
		if (this.anInt3883 * -1541676249 < 0) {
			return true;
		}
		@Pc(13) Class335 local13 = (Class335) Class460.aClass41_Sub2_1.method18054(this.anInt3883 * -1541676249, 1902701118);
		@Pc(17) boolean local17 = local13.method27831(503090107);
		if (this.anIntArray367 == null) {
			@Pc(30) Class621 local30 = (Class621) Class533.aClass41_Sub18_1.method18054(local13.anInt4203 * -1645868939, 1553512654);
			this.anIntArray367 = local30.method32337((byte) -100);
		}
		@Pc(38) int[] local38 = this.anIntArray367;
		for (@Pc(40) int local40 = 0; local40 < local38.length; local40++) {
			@Pc(48) int local48 = local38[local40];
			local17 &= ((Class261) Class125.aClass41_Sub1_6.method18054(local48, 1584183038)).method26480(1740709047);
		}
		return local17;
	}

	@OriginalMember(owner = "client!ex", name = "t", descriptor = "(IIIII)V")
	void method26385(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (!this.aBoolean775) {
			this.aBoolean775 = true;
			if (this.anInt3883 * -1541676249 >= 0) {
				this.aClass120_Sub1_Sub1_Sub1_Sub1_2 = new Class120_Sub1_Sub1_Sub1_Sub1(client.aClass539_1.method30932(-1638462787), 25);
				this.aClass120_Sub1_Sub1_Sub1_Sub1_2.anInt2671 = this.anInt3882 * -630432575;
				this.aClass120_Sub1_Sub1_Sub1_Sub1_2.anInt2694 = client.currentCycle * -265248265;
				this.aClass120_Sub1_Sub1_Sub1_Sub1_2.method18794((Class335) Class460.aClass41_Sub2_1.method18054(this.anInt3883 * -1541676249, -1305241340), -1649956653);
				this.aClass120_Sub1_Sub1_Sub1_Sub1_2.method18984(this.aClass120_Sub1_Sub1_Sub1_Sub1_2.aClass335_1.anInt4212 * 1573297955, (byte) 17);
				this.aClass120_Sub1_Sub1_Sub1_Sub1_2.anInt2697 = (this.aClass120_Sub1_Sub1_Sub1_Sub1_2.aClass335_1.anInt4209 * -2090808675 << 3) * 77355267;
				this.aClass120_Sub1_Sub1_Sub1_Sub1_2.anInt2673 = ((Class251.anInt3876 += -878712665) * -38322409 - 1) * -1242583405;
			} else {
				this.aClass120_Sub1_Sub1_Sub1_Sub2_2 = new Class120_Sub1_Sub1_Sub1_Sub2(client.aClass539_1.method30932(-1638462787), 25);
				this.aClass120_Sub1_Sub1_Sub1_Sub2_2.method19053(Class548.aPacket_16, 2119648537);
				this.aClass120_Sub1_Sub1_Sub1_Sub2_2.anInt2671 = this.anInt3882 * -630432575;
				this.aClass120_Sub1_Sub1_Sub1_Sub2_2.anInt2694 = client.currentCycle * -265248265;
				this.aClass120_Sub1_Sub1_Sub1_Sub2_2.anInt2673 = ((Class251.anInt3876 += -878712665) * -38322409 - 1) * -1242583405;
			}
		}
		if (this.anInt3883 * -1541676249 >= 0) {
			this.aClass120_Sub1_Sub1_Sub1_Sub1_2.method18792(arg2, arg0, arg1, true, this.aClass120_Sub1_Sub1_Sub1_Sub1_2.method18966((byte) -105), 170299349);
			this.aClass120_Sub1_Sub1_Sub1_Sub1_2.method18986(arg3, true, (byte) -65);
		} else {
			this.aClass120_Sub1_Sub1_Sub1_Sub2_2.aByte99 = this.aClass120_Sub1_Sub1_Sub1_Sub2_2.aByte100 = (byte) arg2;
			this.aClass120_Sub1_Sub1_Sub1_Sub2_2.method19063(arg0, arg1, (byte) 3);
			this.aClass120_Sub1_Sub1_Sub1_Sub2_2.method18986(arg3, true, (byte) -89);
		}
	}

	@OriginalMember(owner = "client!ex", name = "f", descriptor = "(I)V")
	void method26386(@OriginalArg(0) int arg0) {
		this.aClass120_Sub1_Sub1_Sub1_Sub1_2 = null;
		this.aClass120_Sub1_Sub1_Sub1_Sub2_2 = null;
		this.aBoolean775 = false;
	}

	@OriginalMember(owner = "client!ex", name = "e", descriptor = "(IIIB)V")
	void method26387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		if (this.aClass120_Sub1_Sub1_Sub1_Sub1_2 == null) {
			this.aClass120_Sub1_Sub1_Sub1_Sub2_2.aByte99 = this.aClass120_Sub1_Sub1_Sub1_Sub2_2.aByte100 = (byte) arg0;
			this.aClass120_Sub1_Sub1_Sub1_Sub2_2.method19063(arg1, arg2, (byte) 3);
		} else {
			this.aClass120_Sub1_Sub1_Sub1_Sub1_2.method18792(arg0, arg1, arg2, true, this.aClass120_Sub1_Sub1_Sub1_Sub1_2.method18966((byte) -15), 1453968894);
		}
	}

	@OriginalMember(owner = "client!ex", name = "x", descriptor = "()Z")
	boolean method26388() {
		if (this.anInt3883 * -1541676249 < 0) {
			return true;
		}
		@Pc(13) Class335 local13 = (Class335) Class460.aClass41_Sub2_1.method18054(this.anInt3883 * -1541676249, -1096195476);
		@Pc(17) boolean local17 = local13.method27831(208866373);
		if (this.anIntArray367 == null) {
			@Pc(30) Class621 local30 = (Class621) Class533.aClass41_Sub18_1.method18054(local13.anInt4203 * -1645868939, 1741720352);
			this.anIntArray367 = local30.method32337((byte) -27);
		}
		@Pc(38) int[] local38 = this.anIntArray367;
		for (@Pc(40) int local40 = 0; local40 < local38.length; local40++) {
			@Pc(48) int local48 = local38[local40];
			local17 &= ((Class261) Class125.aClass41_Sub1_6.method18054(local48, 1836521093)).method26480(1740709047);
		}
		return local17;
	}

	@OriginalMember(owner = "client!ex", name = "l", descriptor = "(I)Z")
	boolean method26389(@OriginalArg(0) int arg0) {
		if (this.anInt3883 * -1541676249 < 0) {
			return true;
		}
		@Pc(13) Class335 local13 = (Class335) Class460.aClass41_Sub2_1.method18054(this.anInt3883 * -1541676249, 870905413);
		@Pc(17) boolean local17 = local13.method27831(83516542);
		if (this.anIntArray367 == null) {
			@Pc(30) Class621 local30 = (Class621) Class533.aClass41_Sub18_1.method18054(local13.anInt4203 * -1645868939, 52161217);
			this.anIntArray367 = local30.method32337((byte) -75);
		}
		@Pc(38) int[] local38 = this.anIntArray367;
		for (@Pc(40) int local40 = 0; local40 < local38.length; local40++) {
			@Pc(48) int local48 = local38[local40];
			local17 &= ((Class261) Class125.aClass41_Sub1_6.method18054(local48, 1400157154)).method26480(1740709047);
		}
		return local17;
	}

	@OriginalMember(owner = "client!ex", name = "g", descriptor = "(IIII)V")
	void method26390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean775) {
			this.aBoolean775 = true;
			if (this.anInt3883 * -1541676249 >= 0) {
				this.aClass120_Sub1_Sub1_Sub1_Sub1_2 = new Class120_Sub1_Sub1_Sub1_Sub1(client.aClass539_1.method30932(-1638462787), 25);
				this.aClass120_Sub1_Sub1_Sub1_Sub1_2.anInt2671 = this.anInt3882 * -630432575;
				this.aClass120_Sub1_Sub1_Sub1_Sub1_2.anInt2694 = client.currentCycle * -265248265;
				this.aClass120_Sub1_Sub1_Sub1_Sub1_2.method18794((Class335) Class460.aClass41_Sub2_1.method18054(this.anInt3883 * -1541676249, -48724039), -1761583878);
				this.aClass120_Sub1_Sub1_Sub1_Sub1_2.method18984(this.aClass120_Sub1_Sub1_Sub1_Sub1_2.aClass335_1.anInt4212 * 1573297955, (byte) 51);
				this.aClass120_Sub1_Sub1_Sub1_Sub1_2.anInt2697 = (this.aClass120_Sub1_Sub1_Sub1_Sub1_2.aClass335_1.anInt4209 * -2090808675 << 3) * 77355267;
				this.aClass120_Sub1_Sub1_Sub1_Sub1_2.anInt2673 = ((Class251.anInt3876 += -878712665) * -38322409 - 1) * -1242583405;
			} else {
				this.aClass120_Sub1_Sub1_Sub1_Sub2_2 = new Class120_Sub1_Sub1_Sub1_Sub2(client.aClass539_1.method30932(-1638462787), 25);
				this.aClass120_Sub1_Sub1_Sub1_Sub2_2.method19053(Class548.aPacket_16, 2039008165);
				this.aClass120_Sub1_Sub1_Sub1_Sub2_2.anInt2671 = this.anInt3882 * -630432575;
				this.aClass120_Sub1_Sub1_Sub1_Sub2_2.anInt2694 = client.currentCycle * -265248265;
				this.aClass120_Sub1_Sub1_Sub1_Sub2_2.anInt2673 = ((Class251.anInt3876 += -878712665) * -38322409 - 1) * -1242583405;
			}
		}
		if (this.anInt3883 * -1541676249 >= 0) {
			this.aClass120_Sub1_Sub1_Sub1_Sub1_2.method18792(arg2, arg0, arg1, true, this.aClass120_Sub1_Sub1_Sub1_Sub1_2.method18966((byte) -76), -451090208);
			this.aClass120_Sub1_Sub1_Sub1_Sub1_2.method18986(arg3, true, (byte) -76);
		} else {
			this.aClass120_Sub1_Sub1_Sub1_Sub2_2.aByte99 = this.aClass120_Sub1_Sub1_Sub1_Sub2_2.aByte100 = (byte) arg2;
			this.aClass120_Sub1_Sub1_Sub1_Sub2_2.method19063(arg0, arg1, (byte) 3);
			this.aClass120_Sub1_Sub1_Sub1_Sub2_2.method18986(arg3, true, (byte) -88);
		}
	}

	@OriginalMember(owner = "client!ex", name = "s", descriptor = "()Lclient!ahb;")
	public Class120_Sub1_Sub1_Sub1 method26391() {
		return this.aClass120_Sub1_Sub1_Sub1_Sub1_2 == null ? this.aClass120_Sub1_Sub1_Sub1_Sub2_2 : this.aClass120_Sub1_Sub1_Sub1_Sub1_2;
	}

	@OriginalMember(owner = "client!ex", name = "m", descriptor = "(IIII)V")
	void method26392(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean775) {
			this.aBoolean775 = true;
			if (this.anInt3883 * -1541676249 >= 0) {
				this.aClass120_Sub1_Sub1_Sub1_Sub1_2 = new Class120_Sub1_Sub1_Sub1_Sub1(client.aClass539_1.method30932(-1638462787), 25);
				this.aClass120_Sub1_Sub1_Sub1_Sub1_2.anInt2671 = this.anInt3882 * -630432575;
				this.aClass120_Sub1_Sub1_Sub1_Sub1_2.anInt2694 = client.currentCycle * -265248265;
				this.aClass120_Sub1_Sub1_Sub1_Sub1_2.method18794((Class335) Class460.aClass41_Sub2_1.method18054(this.anInt3883 * -1541676249, 1538103283), -1008575323);
				this.aClass120_Sub1_Sub1_Sub1_Sub1_2.method18984(this.aClass120_Sub1_Sub1_Sub1_Sub1_2.aClass335_1.anInt4212 * 1573297955, (byte) 57);
				this.aClass120_Sub1_Sub1_Sub1_Sub1_2.anInt2697 = (this.aClass120_Sub1_Sub1_Sub1_Sub1_2.aClass335_1.anInt4209 * -2090808675 << 3) * 77355267;
				this.aClass120_Sub1_Sub1_Sub1_Sub1_2.anInt2673 = ((Class251.anInt3876 += -878712665) * -38322409 - 1) * -1242583405;
			} else {
				this.aClass120_Sub1_Sub1_Sub1_Sub2_2 = new Class120_Sub1_Sub1_Sub1_Sub2(client.aClass539_1.method30932(-1638462787), 25);
				this.aClass120_Sub1_Sub1_Sub1_Sub2_2.method19053(Class548.aPacket_16, 1871825370);
				this.aClass120_Sub1_Sub1_Sub1_Sub2_2.anInt2671 = this.anInt3882 * -630432575;
				this.aClass120_Sub1_Sub1_Sub1_Sub2_2.anInt2694 = client.currentCycle * -265248265;
				this.aClass120_Sub1_Sub1_Sub1_Sub2_2.anInt2673 = ((Class251.anInt3876 += -878712665) * -38322409 - 1) * -1242583405;
			}
		}
		if (this.anInt3883 * -1541676249 >= 0) {
			this.aClass120_Sub1_Sub1_Sub1_Sub1_2.method18792(arg2, arg0, arg1, true, this.aClass120_Sub1_Sub1_Sub1_Sub1_2.method18966((byte) -32), 1178553993);
			this.aClass120_Sub1_Sub1_Sub1_Sub1_2.method18986(arg3, true, (byte) -107);
		} else {
			this.aClass120_Sub1_Sub1_Sub1_Sub2_2.aByte99 = this.aClass120_Sub1_Sub1_Sub1_Sub2_2.aByte100 = (byte) arg2;
			this.aClass120_Sub1_Sub1_Sub1_Sub2_2.method19063(arg0, arg1, (byte) 3);
			this.aClass120_Sub1_Sub1_Sub1_Sub2_2.method18986(arg3, true, (byte) -98);
		}
	}

	@OriginalMember(owner = "client!ex", name = "o", descriptor = "()V")
	void method26393() {
		this.aClass120_Sub1_Sub1_Sub1_Sub1_2 = null;
		this.aClass120_Sub1_Sub1_Sub1_Sub2_2 = null;
		this.aBoolean775 = false;
	}

	@OriginalMember(owner = "client!ex", name = "j", descriptor = "(III)V")
	void method26394(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass120_Sub1_Sub1_Sub1_Sub1_2 == null) {
			this.aClass120_Sub1_Sub1_Sub1_Sub2_2.aByte99 = this.aClass120_Sub1_Sub1_Sub1_Sub2_2.aByte100 = (byte) arg0;
			this.aClass120_Sub1_Sub1_Sub1_Sub2_2.method19063(arg1, arg2, (byte) 3);
		} else {
			this.aClass120_Sub1_Sub1_Sub1_Sub1_2.method18792(arg0, arg1, arg2, true, this.aClass120_Sub1_Sub1_Sub1_Sub1_2.method18966((byte) -90), 1034641586);
		}
	}

	@OriginalMember(owner = "client!ex", name = "a", descriptor = "()Lclient!ahb;")
	public Class120_Sub1_Sub1_Sub1 method26395() {
		return this.aClass120_Sub1_Sub1_Sub1_Sub1_2 == null ? this.aClass120_Sub1_Sub1_Sub1_Sub2_2 : this.aClass120_Sub1_Sub1_Sub1_Sub1_2;
	}

	@OriginalMember(owner = "client!ex", name = "i", descriptor = "(IIII)V")
	void method26396(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean775) {
			this.aBoolean775 = true;
			if (this.anInt3883 * -1541676249 >= 0) {
				this.aClass120_Sub1_Sub1_Sub1_Sub1_2 = new Class120_Sub1_Sub1_Sub1_Sub1(client.aClass539_1.method30932(-1638462787), 25);
				this.aClass120_Sub1_Sub1_Sub1_Sub1_2.anInt2671 = this.anInt3882 * -630432575;
				this.aClass120_Sub1_Sub1_Sub1_Sub1_2.anInt2694 = client.currentCycle * -265248265;
				this.aClass120_Sub1_Sub1_Sub1_Sub1_2.method18794((Class335) Class460.aClass41_Sub2_1.method18054(this.anInt3883 * -1541676249, 1874524941), 1187211888);
				this.aClass120_Sub1_Sub1_Sub1_Sub1_2.method18984(this.aClass120_Sub1_Sub1_Sub1_Sub1_2.aClass335_1.anInt4212 * 1573297955, (byte) 42);
				this.aClass120_Sub1_Sub1_Sub1_Sub1_2.anInt2697 = (this.aClass120_Sub1_Sub1_Sub1_Sub1_2.aClass335_1.anInt4209 * -2090808675 << 3) * 77355267;
				this.aClass120_Sub1_Sub1_Sub1_Sub1_2.anInt2673 = ((Class251.anInt3876 += -878712665) * -38322409 - 1) * -1242583405;
			} else {
				this.aClass120_Sub1_Sub1_Sub1_Sub2_2 = new Class120_Sub1_Sub1_Sub1_Sub2(client.aClass539_1.method30932(-1638462787), 25);
				this.aClass120_Sub1_Sub1_Sub1_Sub2_2.method19053(Class548.aPacket_16, 1798968436);
				this.aClass120_Sub1_Sub1_Sub1_Sub2_2.anInt2671 = this.anInt3882 * -630432575;
				this.aClass120_Sub1_Sub1_Sub1_Sub2_2.anInt2694 = client.currentCycle * -265248265;
				this.aClass120_Sub1_Sub1_Sub1_Sub2_2.anInt2673 = ((Class251.anInt3876 += -878712665) * -38322409 - 1) * -1242583405;
			}
		}
		if (this.anInt3883 * -1541676249 >= 0) {
			this.aClass120_Sub1_Sub1_Sub1_Sub1_2.method18792(arg2, arg0, arg1, true, this.aClass120_Sub1_Sub1_Sub1_Sub1_2.method18966((byte) -26), -610796175);
			this.aClass120_Sub1_Sub1_Sub1_Sub1_2.method18986(arg3, true, (byte) -29);
		} else {
			this.aClass120_Sub1_Sub1_Sub1_Sub2_2.aByte99 = this.aClass120_Sub1_Sub1_Sub1_Sub2_2.aByte100 = (byte) arg2;
			this.aClass120_Sub1_Sub1_Sub1_Sub2_2.method19063(arg0, arg1, (byte) 3);
			this.aClass120_Sub1_Sub1_Sub1_Sub2_2.method18986(arg3, true, (byte) -36);
		}
	}

	@OriginalMember(owner = "client!ex", name = "k", descriptor = "()Z")
	boolean method26397() {
		if (this.anInt3883 * -1541676249 < 0) {
			return true;
		}
		@Pc(13) Class335 local13 = (Class335) Class460.aClass41_Sub2_1.method18054(this.anInt3883 * -1541676249, -275348860);
		@Pc(17) boolean local17 = local13.method27831(-357668668);
		if (this.anIntArray367 == null) {
			@Pc(30) Class621 local30 = (Class621) Class533.aClass41_Sub18_1.method18054(local13.anInt4203 * -1645868939, 851006049);
			this.anIntArray367 = local30.method32337((byte) -36);
		}
		@Pc(38) int[] local38 = this.anIntArray367;
		for (@Pc(40) int local40 = 0; local40 < local38.length; local40++) {
			@Pc(48) int local48 = local38[local40];
			local17 &= ((Class261) Class125.aClass41_Sub1_6.method18054(local48, 1724332177)).method26480(1740709047);
		}
		return local17;
	}

	@OriginalMember(owner = "client!ex", name = "w", descriptor = "()Z")
	boolean method26398() {
		if (this.anInt3883 * -1541676249 < 0) {
			return true;
		}
		@Pc(13) Class335 local13 = (Class335) Class460.aClass41_Sub2_1.method18054(this.anInt3883 * -1541676249, -1019600691);
		@Pc(17) boolean local17 = local13.method27831(-1362170896);
		if (this.anIntArray367 == null) {
			@Pc(30) Class621 local30 = (Class621) Class533.aClass41_Sub18_1.method18054(local13.anInt4203 * -1645868939, -43128902);
			this.anIntArray367 = local30.method32337((byte) 17);
		}
		@Pc(38) int[] local38 = this.anIntArray367;
		for (@Pc(40) int local40 = 0; local40 < local38.length; local40++) {
			@Pc(48) int local48 = local38[local40];
			local17 &= ((Class261) Class125.aClass41_Sub1_6.method18054(local48, -28765448)).method26480(1740709047);
		}
		return local17;
	}

	@OriginalMember(owner = "client!ex", name = "u", descriptor = "(B)Lclient!ahb;")
	public Class120_Sub1_Sub1_Sub1 method26399(@OriginalArg(0) byte arg0) {
		return this.aClass120_Sub1_Sub1_Sub1_Sub1_2 == null ? this.aClass120_Sub1_Sub1_Sub1_Sub2_2 : this.aClass120_Sub1_Sub1_Sub1_Sub1_2;
	}
}
