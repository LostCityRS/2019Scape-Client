package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aur")
public class Class132_Sub1_Sub1_Sub5 extends Class132_Sub1_Sub1 {

	@OriginalMember(owner = "client!aur", name = "ai", descriptor = "Lclient!xy;")
	Class674 aClass674_5;

	@OriginalMember(owner = "client!aur", name = "ag", descriptor = "I")
	int anInt3274 = 0;

	@OriginalMember(owner = "client!aur", name = "al", descriptor = "I")
	int anInt3275 = 0;

	@OriginalMember(owner = "client!aur", name = "ac", descriptor = "Z")
	boolean aBoolean552 = true;

	@OriginalMember(owner = "client!aur", name = "aw", descriptor = "I")
	int anInt3273 = 0;

	@OriginalMember(owner = "client!aur", name = "ae", descriptor = "I")
	int anInt3276;

	@OriginalMember(owner = "client!aur", name = "ah", descriptor = "Lclient!aaq;")
	Class19 aClass19_5;

	@OriginalMember(owner = "client!aur", name = "<init>", descriptor = "(Lclient!tx;IIIIIIIIIIIIZI)V", line = 33)
	public Class132_Sub1_Sub1_Sub5(@OriginalArg(0) Class585 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13, @OriginalArg(14) int arg14) {
		super(arg0, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.anInt3276 = arg1 * -1258371209;
		this.anInt3274 = arg12 * 449841739;
		this.anInt3273 = arg14 * 199968911;
		@Pc(49) Class697 local49 = (Class697) Class501.aClass32_Sub18_1.method18261(this.anInt3276 * -1612299705, 1137944685);
		@Pc(54) int local54 = local49.anInt5949 * 1477426425;
		if (local54 != -1) {
			this.aClass19_5 = new Class19_Sub1(this, false);
			@Pc(71) int local71 = local49.aBoolean881 ? 0 : 2;
			if (arg13) {
				local71 = 1;
			}
			this.aClass19_5.method23572(local54, arg2, local71, false, (short) -7862);
		}
		this.method24274(1, 371646378);
	}

	@OriginalMember(owner = "client!aur", name = "cf", descriptor = "()Z", line = 49)
	@Override
	boolean method24312() {
		return false;
	}

	@OriginalMember(owner = "client!aur", name = "co", descriptor = "()Z", line = 49)
	@Override
	boolean method24296() {
		return false;
	}

	@OriginalMember(owner = "client!aur", name = "bu", descriptor = "(B)Z", line = 49)
	@Override
	boolean method24285(@OriginalArg(0) byte arg0) {
		return false;
	}

	@OriginalMember(owner = "client!aur", name = "cm", descriptor = "()Z", line = 53)
	@Override
	boolean method24298() {
		return this.aBoolean552;
	}

	@OriginalMember(owner = "client!aur", name = "cr", descriptor = "()Z", line = 53)
	@Override
	boolean method24297() {
		return this.aBoolean552;
	}

	@OriginalMember(owner = "client!aur", name = "bw", descriptor = "(S)Z", line = 53)
	@Override
	boolean method24286(@OriginalArg(0) short arg0) {
		return this.aBoolean552;
	}

	@OriginalMember(owner = "client!aur", name = "cq", descriptor = "()Z", line = 53)
	@Override
	boolean method24299() {
		return this.aBoolean552;
	}

	@OriginalMember(owner = "client!aur", name = "by", descriptor = "(B)I", line = 57)
	@Override
	public int method24303(@OriginalArg(0) byte arg0) {
		return this.anInt3275 * 58371971;
	}

	@OriginalMember(owner = "client!aur", name = "ch", descriptor = "()I", line = 57)
	@Override
	public int method24300() {
		return this.anInt3275 * 58371971;
	}

	@OriginalMember(owner = "client!aur", name = "e", descriptor = "(I)I", line = 61)
	public int method24091(@OriginalArg(0) int arg0) {
		return this.anInt3273 * -697510289;
	}

	@OriginalMember(owner = "client!aur", name = "u", descriptor = "()I", line = 61)
	public int method24092() {
		return this.anInt3273 * -697510289;
	}

	@OriginalMember(owner = "client!aur", name = "fv", descriptor = "(Lclient!dh;B)Lclient!uq;", line = 65)
	@Override
	public Class600 method24311(@OriginalArg(0) Class104 arg0, @OriginalArg(1) byte arg1) {
		return null;
	}

	@OriginalMember(owner = "client!aur", name = "fl", descriptor = "(Lclient!dh;)Lclient!uq;", line = 65)
	@Override
	public Class600 method24301(@OriginalArg(0) Class104 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!aur", name = "fb", descriptor = "(Lclient!dh;)Lclient!uq;", line = 65)
	@Override
	public Class600 method24302(@OriginalArg(0) Class104 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!aur", name = "n", descriptor = "(II)V", line = 69)
	public final void method24093(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass19_5 != null && !this.aClass19_5.method23598(-1228609165)) {
			this.aClass19_5.method23618(arg0, -1000778064);
		}
	}

	@OriginalMember(owner = "client!aur", name = "m", descriptor = "(I)Z", line = 73)
	public final boolean method24094(@OriginalArg(0) int arg0) {
		return this.aClass19_5 != null && !this.aClass19_5.method23578((byte) 0);
	}

	@OriginalMember(owner = "client!aur", name = "p", descriptor = "()Z", line = 73)
	public final boolean method24095() {
		return this.aClass19_5 != null && !this.aClass19_5.method23578((byte) 0);
	}

	@OriginalMember(owner = "client!aur", name = "z", descriptor = "()Z", line = 73)
	public final boolean method24096() {
		return this.aClass19_5 != null && !this.aClass19_5.method23578((byte) 0);
	}

	@OriginalMember(owner = "client!aur", name = "k", descriptor = "(I)Z", line = 77)
	public final boolean method24097(@OriginalArg(0) int arg0) {
		return this.aClass19_5 == null || this.aClass19_5.method23598(-1228609165);
	}

	@OriginalMember(owner = "client!aur", name = "r", descriptor = "()Z", line = 77)
	public final boolean method24098() {
		return this.aClass19_5 == null || this.aClass19_5.method23598(-1228609165);
	}

	@OriginalMember(owner = "client!aur", name = "c", descriptor = "()Z", line = 77)
	public final boolean method24099() {
		return this.aClass19_5 == null || this.aClass19_5.method23598(-1228609165);
	}

	@OriginalMember(owner = "client!aur", name = "d", descriptor = "()Z", line = 77)
	public final boolean method24100() {
		return this.aClass19_5 == null || this.aClass19_5.method23598(-1228609165);
	}

	@OriginalMember(owner = "client!aur", name = "v", descriptor = "(Lclient!dh;II)Lclient!do;", line = 81)
	Class109 method24101(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class697 local5 = (Class697) Class501.aClass32_Sub18_1.method18261(arg2, -1422442268);
		@Pc(12) Class99 local12 = this.aClass585_23.aClass99Array2[this.aByte100];
		@Pc(27) Class99 local27 = this.aByte99 < 3 ? this.aClass585_23.aClass99Array2[this.aByte99 + 1] : null;
		@Pc(31) Class472 local31 = this.method24220().aClass472_61;
		return this.aClass19_5 == null || this.aClass19_5.method23598(-1228609165) ? local5.method36669(arg0, arg1, this.anInt3274 * -2021976064, local12, local27, (int) local31.aFloat317, (int) local31.aFloat318, (int) local31.aFloat319, null, (byte) 2, (byte) -35) : local5.method36669(arg0, arg1, this.anInt3274 * -2021976064, local12, local27, (int) local31.aFloat317, (int) local31.aFloat318, (int) local31.aFloat319, this.aClass19_5, (byte) 2, (byte) 13);
	}

	@OriginalMember(owner = "client!aur", name = "f", descriptor = "(Lclient!dh;IIB)Lclient!do;", line = 81)
	Class109 method24102(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(5) Class697 local5 = (Class697) Class501.aClass32_Sub18_1.method18261(arg2, 926486655);
		@Pc(12) Class99 local12 = this.aClass585_23.aClass99Array2[this.aByte100];
		@Pc(27) Class99 local27 = this.aByte99 < 3 ? this.aClass585_23.aClass99Array2[this.aByte99 + 1] : null;
		@Pc(31) Class472 local31 = this.method24220().aClass472_61;
		return this.aClass19_5 == null || this.aClass19_5.method23598(-1228609165) ? local5.method36669(arg0, arg1, this.anInt3274 * -2021976064, local12, local27, (int) local31.aFloat317, (int) local31.aFloat318, (int) local31.aFloat319, null, (byte) 2, (byte) 90) : local5.method36669(arg0, arg1, this.anInt3274 * -2021976064, local12, local27, (int) local31.aFloat317, (int) local31.aFloat318, (int) local31.aFloat319, this.aClass19_5, (byte) 2, (byte) -12);
	}

	@OriginalMember(owner = "client!aur", name = "o", descriptor = "(Lclient!dh;II)Lclient!do;", line = 81)
	Class109 method24103(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class697 local5 = (Class697) Class501.aClass32_Sub18_1.method18261(arg2, -1700464429);
		@Pc(12) Class99 local12 = this.aClass585_23.aClass99Array2[this.aByte100];
		@Pc(27) Class99 local27 = this.aByte99 < 3 ? this.aClass585_23.aClass99Array2[this.aByte99 + 1] : null;
		@Pc(31) Class472 local31 = this.method24220().aClass472_61;
		return this.aClass19_5 == null || this.aClass19_5.method23598(-1228609165) ? local5.method36669(arg0, arg1, this.anInt3274 * -2021976064, local12, local27, (int) local31.aFloat317, (int) local31.aFloat318, (int) local31.aFloat319, null, (byte) 2, (byte) -93) : local5.method36669(arg0, arg1, this.anInt3274 * -2021976064, local12, local27, (int) local31.aFloat317, (int) local31.aFloat318, (int) local31.aFloat319, this.aClass19_5, (byte) 2, (byte) 1);
	}

	@OriginalMember(owner = "client!aur", name = "s", descriptor = "(Lclient!dh;II)Lclient!do;", line = 81)
	Class109 method24104(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class697 local5 = (Class697) Class501.aClass32_Sub18_1.method18261(arg2, -1034388816);
		@Pc(12) Class99 local12 = this.aClass585_23.aClass99Array2[this.aByte100];
		@Pc(27) Class99 local27 = this.aByte99 < 3 ? this.aClass585_23.aClass99Array2[this.aByte99 + 1] : null;
		@Pc(31) Class472 local31 = this.method24220().aClass472_61;
		return this.aClass19_5 == null || this.aClass19_5.method23598(-1228609165) ? local5.method36669(arg0, arg1, this.anInt3274 * -2021976064, local12, local27, (int) local31.aFloat317, (int) local31.aFloat318, (int) local31.aFloat319, null, (byte) 2, (byte) 86) : local5.method36669(arg0, arg1, this.anInt3274 * -2021976064, local12, local27, (int) local31.aFloat317, (int) local31.aFloat318, (int) local31.aFloat319, this.aClass19_5, (byte) 2, (byte) 19);
	}

	@OriginalMember(owner = "client!aur", name = "y", descriptor = "(Lclient!dh;II)Lclient!do;", line = 81)
	Class109 method24105(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class697 local5 = (Class697) Class501.aClass32_Sub18_1.method18261(arg2, -1014317714);
		@Pc(12) Class99 local12 = this.aClass585_23.aClass99Array2[this.aByte100];
		@Pc(27) Class99 local27 = this.aByte99 < 3 ? this.aClass585_23.aClass99Array2[this.aByte99 + 1] : null;
		@Pc(31) Class472 local31 = this.method24220().aClass472_61;
		return this.aClass19_5 == null || this.aClass19_5.method23598(-1228609165) ? local5.method36669(arg0, arg1, this.anInt3274 * -2021976064, local12, local27, (int) local31.aFloat317, (int) local31.aFloat318, (int) local31.aFloat319, null, (byte) 2, (byte) 30) : local5.method36669(arg0, arg1, this.anInt3274 * -2021976064, local12, local27, (int) local31.aFloat317, (int) local31.aFloat318, (int) local31.aFloat319, this.aClass19_5, (byte) 2, (byte) 71);
	}

	@OriginalMember(owner = "client!aur", name = "fc", descriptor = "(Lclient!dh;I)Lclient!tl;", line = 89)
	@Override
	Class573 method24293(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		@Pc(19) Class109 local19 = this.method24102(arg0, (this.anInt3274 * 1104211811 == 0 ? 0 : 5) | 0x800, this.anInt3276 * -1612299705, (byte) -40);
		if (local19 == null) {
			return null;
		}
		@Pc(26) Class470 local26 = this.method24227();
		this.method24106(arg0, local19, local26, (byte) 100);
		@Pc(36) Class573 local36 = Class125_Sub1.method9212(false, 373147274);
		local19.method6976(local26, this.aClass241Array21[0], 0);
		if (this.aClass674_5 != null) {
			@Pc(52) Class229 local52 = this.aClass674_5.method33132();
			arg0.method20588(local52);
		}
		this.aBoolean552 = local19.method6903();
		this.anInt3275 = local19.method6917() * -250259669;
		local19.method6900();
		return local36;
	}

	@OriginalMember(owner = "client!aur", name = "fo", descriptor = "(Lclient!dh;)Lclient!tl;", line = 89)
	@Override
	Class573 method24289(@OriginalArg(0) Class104 arg0) {
		@Pc(19) Class109 local19 = this.method24102(arg0, (this.anInt3274 * 1104211811 == 0 ? 0 : 5) | 0x800, this.anInt3276 * -1612299705, (byte) -74);
		if (local19 == null) {
			return null;
		}
		@Pc(26) Class470 local26 = this.method24227();
		this.method24106(arg0, local19, local26, (byte) 65);
		@Pc(36) Class573 local36 = Class125_Sub1.method9212(false, 373147274);
		local19.method6976(local26, this.aClass241Array21[0], 0);
		if (this.aClass674_5 != null) {
			@Pc(52) Class229 local52 = this.aClass674_5.method33132();
			arg0.method20588(local52);
		}
		this.aBoolean552 = local19.method6903();
		this.anInt3275 = local19.method6917() * -250259669;
		local19.method6900();
		return local36;
	}

	@OriginalMember(owner = "client!aur", name = "fw", descriptor = "(Lclient!dh;I)V", line = 106)
	@Override
	void method24290(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class109 local9 = this.method24102(arg0, 0, this.anInt3276 * -1612299705, (byte) -109);
		if (local9 != null) {
			this.method24106(arg0, local9, this.method24227(), (byte) 49);
		}
	}

	@OriginalMember(owner = "client!aur", name = "fy", descriptor = "(Lclient!dh;)V", line = 106)
	@Override
	void method24307(@OriginalArg(0) Class104 arg0) {
		@Pc(9) Class109 local9 = this.method24102(arg0, 0, this.anInt3276 * -1612299705, (byte) -31);
		if (local9 != null) {
			this.method24106(arg0, local9, this.method24227(), (byte) 125);
		}
	}

	@OriginalMember(owner = "client!aur", name = "fe", descriptor = "(Lclient!dh;)V", line = 106)
	@Override
	void method24314(@OriginalArg(0) Class104 arg0) {
		@Pc(9) Class109 local9 = this.method24102(arg0, 0, this.anInt3276 * -1612299705, (byte) -23);
		if (local9 != null) {
			this.method24106(arg0, local9, this.method24227(), (byte) 43);
		}
	}

	@OriginalMember(owner = "client!aur", name = "w", descriptor = "(Lclient!dh;Lclient!do;Lclient!ou;B)V", line = 113)
	void method24106(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class109 arg1, @OriginalArg(2) Class470 arg2, @OriginalArg(3) byte arg3) {
		arg1.method6873(arg2);
		@Pc(5) Class234[] local5 = arg1.method6919();
		@Pc(8) Class210[] local8 = arg1.method6931();
		if ((this.aClass674_5 == null || this.aClass674_5.aBoolean870) && (local5 != null || local8 != null)) {
			this.aClass674_5 = Class674.method33091(client.anInt3485, true);
		}
		if (this.aClass674_5 != null) {
			this.aClass674_5.method33113(arg0, (long) client.anInt3485, local5, local8, false);
			this.aClass674_5.method33127(this.aByte100, this.aShort129, this.aShort130, this.aShort128, this.aShort127);
		}
	}

	@OriginalMember(owner = "client!aur", name = "x", descriptor = "(Lclient!dh;Lclient!do;Lclient!ou;)V", line = 113)
	void method24107(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class109 arg1, @OriginalArg(2) Class470 arg2) {
		arg1.method6873(arg2);
		@Pc(5) Class234[] local5 = arg1.method6919();
		@Pc(8) Class210[] local8 = arg1.method6931();
		if ((this.aClass674_5 == null || this.aClass674_5.aBoolean870) && (local5 != null || local8 != null)) {
			this.aClass674_5 = Class674.method33091(client.anInt3485, true);
		}
		if (this.aClass674_5 != null) {
			this.aClass674_5.method33113(arg0, (long) client.anInt3485, local5, local8, false);
			this.aClass674_5.method33127(this.aByte100, this.aShort129, this.aShort130, this.aShort128, this.aShort127);
		}
	}

	@OriginalMember(owner = "client!aur", name = "q", descriptor = "(Lclient!dh;Lclient!do;Lclient!ou;)V", line = 113)
	void method24108(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class109 arg1, @OriginalArg(2) Class470 arg2) {
		arg1.method6873(arg2);
		@Pc(5) Class234[] local5 = arg1.method6919();
		@Pc(8) Class210[] local8 = arg1.method6931();
		if ((this.aClass674_5 == null || this.aClass674_5.aBoolean870) && (local5 != null || local8 != null)) {
			this.aClass674_5 = Class674.method33091(client.anInt3485, true);
		}
		if (this.aClass674_5 != null) {
			this.aClass674_5.method33113(arg0, (long) client.anInt3485, local5, local8, false);
			this.aClass674_5.method33127(this.aByte100, this.aShort129, this.aShort130, this.aShort128, this.aShort127);
		}
	}

	@OriginalMember(owner = "client!aur", name = "l", descriptor = "(B)V", line = 124)
	public void method24109(@OriginalArg(0) byte arg0) {
		if (this.aClass674_5 != null) {
			this.aClass674_5.method33102();
		}
	}

	@OriginalMember(owner = "client!aur", name = "b", descriptor = "()V", line = 124)
	public void method24110() {
		if (this.aClass674_5 != null) {
			this.aClass674_5.method33102();
		}
	}

	@OriginalMember(owner = "client!aur", name = "h", descriptor = "()V", line = 124)
	public void method24111() {
		if (this.aClass674_5 != null) {
			this.aClass674_5.method33102();
		}
	}

	@OriginalMember(owner = "client!aur", name = "fk", descriptor = "(Lclient!dh;II)Z", line = 128)
	@Override
	boolean method24304(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!aur", name = "fa", descriptor = "(Lclient!dh;IIB)Z", line = 128)
	@Override
	boolean method24283(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		return false;
	}

	@OriginalMember(owner = "client!aur", name = "fr", descriptor = "()Z", line = 132)
	@Override
	final boolean method24305() {
		return false;
	}

	@OriginalMember(owner = "client!aur", name = "fh", descriptor = "()Z", line = 132)
	@Override
	final boolean method24294() {
		return false;
	}

	@OriginalMember(owner = "client!aur", name = "fp", descriptor = "(I)Z", line = 132)
	@Override
	final boolean method24284(@OriginalArg(0) int arg0) {
		return false;
	}

	@OriginalMember(owner = "client!aur", name = "gu", descriptor = "(Lclient!dh;Lclient!alh;IIIZ)V", line = 136)
	@Override
	final void method24306(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aur", name = "fq", descriptor = "(Lclient!dh;Lclient!alh;IIIZB)V", line = 136)
	@Override
	final void method24291(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte arg6) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aur", name = "gq", descriptor = "(Lclient!dh;Lclient!alh;IIIZ)V", line = 136)
	@Override
	final void method24309(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aur", name = "gl", descriptor = "(Lclient!dh;Lclient!alh;IIIZ)V", line = 136)
	@Override
	final void method24308(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class132_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aur", name = "go", descriptor = "()V", line = 140)
	@Override
	final void method24281() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aur", name = "ff", descriptor = "(B)V", line = 140)
	@Override
	final void method24288(@OriginalArg(0) byte arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aur", name = "gk", descriptor = "()V", line = 140)
	@Override
	final void method24310() {
		throw new IllegalStateException();
	}
}
