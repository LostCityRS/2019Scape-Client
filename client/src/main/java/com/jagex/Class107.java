package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public abstract class Class107 implements Interface13 {

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "Lclient!qy;")
	public Class521 aClass521_6;

	@OriginalMember(owner = "client!ea", name = "u", descriptor = "Lclient!qn;")
	public Class512 aClass512_3 = Class512.aClass512_6;

	@OriginalMember(owner = "client!ea", name = "l", descriptor = "Z")
	public boolean aBoolean170 = true;

	@OriginalMember(owner = "client!ea", name = "t", descriptor = "Lclient!qt;")
	public final Class143 aClass143_6;

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
	public int anInt862;

	@OriginalMember(owner = "client!ea", name = "dy", descriptor = "(Lclient!yp;I)V")
	static void method7192(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class80_Sub17.method23470(local11, local14, arg0, 714976686);
	}

	@OriginalMember(owner = "client!ea", name = "aoi", descriptor = "(Lclient!yp;B)V")
	static void method7193(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		Class160.aClass121_Sub1_2.method9599((byte) 11);
	}

	@OriginalMember(owner = "client!ea", name = "atq", descriptor = "(Lclient!yp;I)V")
	static void method7194(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class703.aClass80_Sub37_49.aClass165_Sub10_1.method16018(-1327993838);
	}

	@OriginalMember(owner = "client!ea", name = "k", descriptor = "(I)V")
	static void method7195(@OriginalArg(0) int arg0) {
		Class238.aString153 = "";
		Class238.aString155 = "";
		Class238.aString154 = "";
		Class238.aBoolean770 = true;
	}

	@OriginalMember(owner = "client!ea", name = "j", descriptor = "(Lclient!ub;III)V")
	public static void method7196(@OriginalArg(0) Class158 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class690 local2 = Class677.method33596(-1813853255);
		Class388.method28635(arg0, arg1, arg2, local2, (short) 2903);
	}

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lclient!qt;I)V")
	Class107(@OriginalArg(0) Class143 arg0, @OriginalArg(1) int arg1) {
		this.aClass143_6 = arg0;
		this.anInt862 = arg1 * 290391561;
	}

	@OriginalMember(owner = "client!ea", name = "k", descriptor = "()Ljava/lang/Object;")
	public final Object method7183() {
		return this.aClass143_6.method11824(this, 2007955305);
	}

	@OriginalMember(owner = "client!ea", name = "t", descriptor = "(Lclient!ald;I)V")
	@Override
	public final void method37006(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.g1();
			if (local3 == 0) {
				return;
			}
			@Pc(14) Class244 local14 = (Class244) Class80_Sub39.method15030(Class420.method29002(1686784185), local3, -834385860);
			if (local14 == null) {
				this.method7186(arg0, local3, (byte) -11);
			} else {
				switch(local14.anInt3862 * -1270493543) {
					case 1:
						this.aClass512_3 = (Class512) Class80_Sub39.method15030(Class217.method25865(-1832288224), arg0.g1(), -1874444948);
						break;
					case 2:
						arg0.gjstr2();
						break;
					case 3:
						this.aBoolean170 = false;
						break;
					case 4:
						@Pc(30) int local30 = arg0.g1();
						this.aClass521_6 = (Class521) Class80_Sub39.method15030(Class521.method30628(2050322046), local30, -1343025271);
						if (this.aClass521_6 == null) {
							throw new IllegalStateException("");
						}
					case 5:
						break;
					case 6:
						Class80_Sub39.method15030(Class433.method29104(-568512511), arg0.g1(), -587014535);
						break;
					default:
						throw new IllegalStateException("");
				}
			}
		}
	}

	@OriginalMember(owner = "client!ea", name = "i", descriptor = "(B)Ljava/lang/Object;")
	public final Object method7184(@OriginalArg(0) byte arg0) {
		return this.aClass143_6.method11824(this, -220042000);
	}

	@OriginalMember(owner = "client!ea", name = "g", descriptor = "(I)Z")
	final boolean method7185(@OriginalArg(0) int arg0) {
		return this.aClass143_6 != null && this.aClass521_6 != null;
	}

	@OriginalMember(owner = "client!ea", name = "u", descriptor = "(Lclient!ald;)V")
	@Override
	public final void method37009(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.g1();
			if (local3 == 0) {
				return;
			}
			@Pc(14) Class244 local14 = (Class244) Class80_Sub39.method15030(Class420.method29002(1686784185), local3, -450353548);
			if (local14 == null) {
				this.method7186(arg0, local3, (byte) -17);
			} else {
				switch(local14.anInt3862 * -1270493543) {
					case 1:
						this.aClass512_3 = (Class512) Class80_Sub39.method15030(Class217.method25865(1316406206), arg0.g1(), -1890817414);
						break;
					case 2:
						arg0.gjstr2();
						break;
					case 3:
						this.aBoolean170 = false;
						break;
					case 4:
						@Pc(30) int local30 = arg0.g1();
						this.aClass521_6 = (Class521) Class80_Sub39.method15030(Class521.method30628(1343032044), local30, -1831085660);
						if (this.aClass521_6 == null) {
							throw new IllegalStateException("");
						}
					case 5:
						break;
					case 6:
						Class80_Sub39.method15030(Class433.method29104(651836638), arg0.g1(), -1636086755);
						break;
					default:
						throw new IllegalStateException("");
				}
			}
		}
	}

	@OriginalMember(owner = "client!ea", name = "l", descriptor = "(Lclient!ald;IB)V")
	abstract void method7186(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2);

	@OriginalMember(owner = "client!ea", name = "m", descriptor = "(Lclient!ald;I)V")
	abstract void method7187(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ea", name = "o", descriptor = "(Lclient!ald;I)V")
	abstract void method7188(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ea", name = "j", descriptor = "()Z")
	final boolean method7189() {
		return this.aClass143_6 != null && this.aClass521_6 != null;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "()Z")
	final boolean method7190() {
		return this.aClass143_6 != null && this.aClass521_6 != null;
	}

	@OriginalMember(owner = "client!ea", name = "s", descriptor = "()Ljava/lang/Object;")
	public final Object method7191() {
		return this.aClass143_6.method11824(this, -866393444);
	}
}
