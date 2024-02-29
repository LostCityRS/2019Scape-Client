package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class239 {

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
	static final int anInt3865 = 25;

	@OriginalMember(owner = "client!ea", name = "ak", descriptor = "I")
	public static int anInt3866;

	@OriginalMember(owner = "client!ea", name = "gs", descriptor = "Lclient!uf;")
	static Class593 aClass593_4;

	@OriginalMember(owner = "client!ea", name = "l", descriptor = "[I")
	int[] anIntArray353;

	@OriginalMember(owner = "client!ea", name = "k", descriptor = "Z")
	public boolean aBoolean666 = false;

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "Lclient!aqc;")
	Class132_Sub1_Sub1_Sub1_Sub1 aClass132_Sub1_Sub1_Sub1_Sub1_2 = null;

	@OriginalMember(owner = "client!ea", name = "w", descriptor = "Lclient!aqk;")
	Class132_Sub1_Sub1_Sub1_Sub2 aClass132_Sub1_Sub1_Sub1_Sub2_2 = null;

	@OriginalMember(owner = "client!ea", name = "n", descriptor = "I")
	final int anInt3863;

	@OriginalMember(owner = "client!ea", name = "m", descriptor = "I")
	public final int anInt3864;

	@OriginalMember(owner = "client!ea", name = "ap", descriptor = "(Lclient!yf;B)V")
	static void method25911(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(7) int local7 = arg0.anIntArray522[arg0.anInt6050 * -709694321];
		arg0.anInt6049 -= local7 * 957530791;
		@Pc(25) String local25 = Class589.method31863(arg0.anObjectArray45, arg0.anInt6049 * 587908375, local7, 1260677187);
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = local25;
	}

	@OriginalMember(owner = "client!ea", name = "ci", descriptor = "(Lclient!yf;I)V")
	static void method25912(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class368.method28147(local11, local14, arg0, 215351404);
	}

	@OriginalMember(owner = "client!ea", name = "s", descriptor = "(CI)Z")
	public static boolean method25913(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!ea", name = "mm", descriptor = "(Lclient!yf;B)V")
	static void method25914(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, 1889653856);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class220.method25637(local16, local22, arg0, 1990969109);
	}

	@OriginalMember(owner = "client!ea", name = "apf", descriptor = "(Lclient!yf;I)V")
	static void method25915(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class411.anInt4918 * 873638739;
	}

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(II)V")
	public static void method25916(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class93_Sub1_Sub11 local4 = Class371.method28187(8, (long) arg0);
		local4.method21877(2144120903);
	}

	@OriginalMember(owner = "client!ea", name = "ai", descriptor = "(ILjava/lang/String;B)V")
	static void method25917(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) byte arg2) {
		@Pc(4) Class93_Sub1_Sub11 local4 = Class371.method28187(3, (long) arg0);
		local4.method21813(-133651056);
		local4.aString103 = arg1;
	}

	@OriginalMember(owner = "client!ea", name = "afb", descriptor = "(Lclient!yf;B)V")
	static void method25918(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt6049 -= 957530791) * 587908375];
		arg0.anInt6052 -= -1915563430;
		@Pc(27) int local27 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(37) int local37 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		@Pc(43) Class5 local43 = Class157.aClass462_2.method29422(client.anInterface50_1, local37, 199081760);
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local43.method42(local13, local27, Class110_Sub14.aClass100Array4, -143202029);
	}

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lclient!alw;I)V")
	Class239(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		this.anInt3863 = arg1 * -2003746383;
		@Pc(19) int local19 = arg0.method22425((short) 16384);
		switch(local19) {
			case 0:
				this.anInt3864 = arg0.method22448(-1189822852) * 1774798603;
				break;
			case 1:
				this.anInt3864 = -1774798603;
				break;
			default:
				this.anInt3864 = -1774798603;
		}
		arg0.method22439(2141727607);
	}

	@OriginalMember(owner = "client!ea", name = "m", descriptor = "(IIII)V")
	void method25896(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass132_Sub1_Sub1_Sub1_Sub1_2 == null) {
			this.aClass132_Sub1_Sub1_Sub1_Sub2_2.aByte100 = this.aClass132_Sub1_Sub1_Sub1_Sub2_2.aByte99 = (byte) arg0;
			this.aClass132_Sub1_Sub1_Sub1_Sub2_2.method20067(arg1, arg2, (byte) 1);
		} else {
			this.aClass132_Sub1_Sub1_Sub1_Sub1_2.method18604(arg0, arg1, arg2, true, this.aClass132_Sub1_Sub1_Sub1_Sub1_2.method20009(-469683545), (byte) -48);
		}
	}

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "(IIIII)V")
	void method25897(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (!this.aBoolean666) {
			this.aBoolean666 = true;
			if (this.anInt3864 * -376320861 >= 0) {
				this.aClass132_Sub1_Sub1_Sub1_Sub1_2 = new Class132_Sub1_Sub1_Sub1_Sub1(client.aClass532_1.method30640(-1677262342), 25);
				this.aClass132_Sub1_Sub1_Sub1_Sub1_2.anInt2768 = this.anInt3863 * 718421009;
				this.aClass132_Sub1_Sub1_Sub1_Sub1_2.anInt2786 = client.anInt3485 * 632844529;
				this.aClass132_Sub1_Sub1_Sub1_Sub1_2.method18601((Class336) Class162.aClass32_Sub3_2.method18273(this.anInt3864 * -376320861, -487793701), 1486115803);
				this.aClass132_Sub1_Sub1_Sub1_Sub1_2.method19973(this.aClass132_Sub1_Sub1_Sub1_Sub1_2.aClass336_1.anInt4195 * 447008399, -2142170693);
				this.aClass132_Sub1_Sub1_Sub1_Sub1_2.anInt2788 = (this.aClass132_Sub1_Sub1_Sub1_Sub1_2.aClass336_1.anInt4206 * 295553787 << 3) * 723489705;
				this.aClass132_Sub1_Sub1_Sub1_Sub1_2.anInt2766 = ((Class249.anInt3881 += -1432082549) * -1421948893 - 1) * 1501413983;
			} else {
				this.aClass132_Sub1_Sub1_Sub1_Sub2_2 = new Class132_Sub1_Sub1_Sub1_Sub2(client.aClass532_1.method30640(-1436025319), 25);
				this.aClass132_Sub1_Sub1_Sub1_Sub2_2.method20078(Class36.aClass93_Sub41_1, 2031771916);
				this.aClass132_Sub1_Sub1_Sub1_Sub2_2.anInt2768 = this.anInt3863 * 718421009;
				this.aClass132_Sub1_Sub1_Sub1_Sub2_2.anInt2786 = client.anInt3485 * 632844529;
				this.aClass132_Sub1_Sub1_Sub1_Sub2_2.anInt2766 = ((Class249.anInt3881 += -1432082549) * -1421948893 - 1) * 1501413983;
			}
		}
		if (this.anInt3864 * -376320861 >= 0) {
			this.aClass132_Sub1_Sub1_Sub1_Sub1_2.method18604(arg2, arg0, arg1, true, this.aClass132_Sub1_Sub1_Sub1_Sub1_2.method20009(-255802500), (byte) -90);
			this.aClass132_Sub1_Sub1_Sub1_Sub1_2.method19964(arg3, true, -539133931);
		} else {
			this.aClass132_Sub1_Sub1_Sub1_Sub2_2.aByte100 = this.aClass132_Sub1_Sub1_Sub1_Sub2_2.aByte99 = (byte) arg2;
			this.aClass132_Sub1_Sub1_Sub1_Sub2_2.method20067(arg0, arg1, (byte) 1);
			this.aClass132_Sub1_Sub1_Sub1_Sub2_2.method19964(arg3, true, -506293409);
		}
	}

	@OriginalMember(owner = "client!ea", name = "n", descriptor = "(B)V")
	void method25898(@OriginalArg(0) byte arg0) {
		this.aClass132_Sub1_Sub1_Sub1_Sub1_2 = null;
		this.aClass132_Sub1_Sub1_Sub1_Sub2_2 = null;
		this.aBoolean666 = false;
	}

	@OriginalMember(owner = "client!ea", name = "p", descriptor = "(III)V")
	void method25899(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass132_Sub1_Sub1_Sub1_Sub1_2 == null) {
			this.aClass132_Sub1_Sub1_Sub1_Sub2_2.aByte100 = this.aClass132_Sub1_Sub1_Sub1_Sub2_2.aByte99 = (byte) arg0;
			this.aClass132_Sub1_Sub1_Sub1_Sub2_2.method20067(arg1, arg2, (byte) 1);
		} else {
			this.aClass132_Sub1_Sub1_Sub1_Sub1_2.method18604(arg0, arg1, arg2, true, this.aClass132_Sub1_Sub1_Sub1_Sub1_2.method20009(1755245551), (byte) -43);
		}
	}

	@OriginalMember(owner = "client!ea", name = "k", descriptor = "(I)Lclient!ahm;")
	public Class132_Sub1_Sub1_Sub1 method25900(@OriginalArg(0) int arg0) {
		return this.aClass132_Sub1_Sub1_Sub1_Sub1_2 == null ? this.aClass132_Sub1_Sub1_Sub1_Sub2_2 : this.aClass132_Sub1_Sub1_Sub1_Sub1_2;
	}

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "(I)Z")
	boolean method25901(@OriginalArg(0) int arg0) {
		if (this.anInt3864 * -376320861 < 0) {
			return true;
		}
		@Pc(13) Class336 local13 = (Class336) Class162.aClass32_Sub3_2.method18273(this.anInt3864 * -376320861, 782353494);
		@Pc(17) boolean local17 = local13.method27514(963759028);
		if (this.anIntArray353 == null) {
			@Pc(29) Class622 local29 = (Class622) Class166_Sub6.aClass32_Sub5_1.method18273(local13.anInt4221 * 1511832251, 260946625);
			this.anIntArray353 = local29.method32313(90247885);
		}
		@Pc(37) int[] local37 = this.anIntArray353;
		for (@Pc(39) int local39 = 0; local39 < local37.length; local39++) {
			@Pc(47) int local47 = local37[local39];
			local17 &= ((Class263) Class32.aClass32_Sub17_23.method18273(local47, 1670326610)).method26287((byte) -15);
		}
		return local17;
	}

	@OriginalMember(owner = "client!ea", name = "o", descriptor = "()Z")
	boolean method25902() {
		if (this.anInt3864 * -376320861 < 0) {
			return true;
		}
		@Pc(13) Class336 local13 = (Class336) Class162.aClass32_Sub3_2.method18273(this.anInt3864 * -376320861, 1713058412);
		@Pc(17) boolean local17 = local13.method27514(-582551112);
		if (this.anIntArray353 == null) {
			@Pc(29) Class622 local29 = (Class622) Class166_Sub6.aClass32_Sub5_1.method18273(local13.anInt4221 * 1511832251, -1004464103);
			this.anIntArray353 = local29.method32313(736902923);
		}
		@Pc(37) int[] local37 = this.anIntArray353;
		for (@Pc(39) int local39 = 0; local39 < local37.length; local39++) {
			@Pc(47) int local47 = local37[local39];
			local17 &= ((Class263) Class32.aClass32_Sub17_23.method18273(local47, -141478669)).method26287((byte) -79);
		}
		return local17;
	}

	@OriginalMember(owner = "client!ea", name = "l", descriptor = "(IIII)V")
	void method25903(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean666) {
			this.aBoolean666 = true;
			if (this.anInt3864 * -376320861 >= 0) {
				this.aClass132_Sub1_Sub1_Sub1_Sub1_2 = new Class132_Sub1_Sub1_Sub1_Sub1(client.aClass532_1.method30640(-1748089856), 25);
				this.aClass132_Sub1_Sub1_Sub1_Sub1_2.anInt2768 = this.anInt3863 * 718421009;
				this.aClass132_Sub1_Sub1_Sub1_Sub1_2.anInt2786 = client.anInt3485 * 632844529;
				this.aClass132_Sub1_Sub1_Sub1_Sub1_2.method18601((Class336) Class162.aClass32_Sub3_2.method18273(this.anInt3864 * -376320861, -1194506055), -454667111);
				this.aClass132_Sub1_Sub1_Sub1_Sub1_2.method19973(this.aClass132_Sub1_Sub1_Sub1_Sub1_2.aClass336_1.anInt4195 * 447008399, -2142170693);
				this.aClass132_Sub1_Sub1_Sub1_Sub1_2.anInt2788 = (this.aClass132_Sub1_Sub1_Sub1_Sub1_2.aClass336_1.anInt4206 * 295553787 << 3) * 723489705;
				this.aClass132_Sub1_Sub1_Sub1_Sub1_2.anInt2766 = ((Class249.anInt3881 += -1432082549) * -1421948893 - 1) * 1501413983;
			} else {
				this.aClass132_Sub1_Sub1_Sub1_Sub2_2 = new Class132_Sub1_Sub1_Sub1_Sub2(client.aClass532_1.method30640(-1551032622), 25);
				this.aClass132_Sub1_Sub1_Sub1_Sub2_2.method20078(Class36.aClass93_Sub41_1, 2125155458);
				this.aClass132_Sub1_Sub1_Sub1_Sub2_2.anInt2768 = this.anInt3863 * 718421009;
				this.aClass132_Sub1_Sub1_Sub1_Sub2_2.anInt2786 = client.anInt3485 * 632844529;
				this.aClass132_Sub1_Sub1_Sub1_Sub2_2.anInt2766 = ((Class249.anInt3881 += -1432082549) * -1421948893 - 1) * 1501413983;
			}
		}
		if (this.anInt3864 * -376320861 >= 0) {
			this.aClass132_Sub1_Sub1_Sub1_Sub1_2.method18604(arg2, arg0, arg1, true, this.aClass132_Sub1_Sub1_Sub1_Sub1_2.method20009(-102761042), (byte) -25);
			this.aClass132_Sub1_Sub1_Sub1_Sub1_2.method19964(arg3, true, 1543713327);
		} else {
			this.aClass132_Sub1_Sub1_Sub1_Sub2_2.aByte100 = this.aClass132_Sub1_Sub1_Sub1_Sub2_2.aByte99 = (byte) arg2;
			this.aClass132_Sub1_Sub1_Sub1_Sub2_2.method20067(arg0, arg1, (byte) 1);
			this.aClass132_Sub1_Sub1_Sub1_Sub2_2.method19964(arg3, true, -964624382);
		}
	}

	@OriginalMember(owner = "client!ea", name = "u", descriptor = "()V")
	void method25904() {
		this.aClass132_Sub1_Sub1_Sub1_Sub1_2 = null;
		this.aClass132_Sub1_Sub1_Sub1_Sub2_2 = null;
		this.aBoolean666 = false;
	}

	@OriginalMember(owner = "client!ea", name = "w", descriptor = "(IIII)V")
	void method25905(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean666) {
			this.aBoolean666 = true;
			if (this.anInt3864 * -376320861 >= 0) {
				this.aClass132_Sub1_Sub1_Sub1_Sub1_2 = new Class132_Sub1_Sub1_Sub1_Sub1(client.aClass532_1.method30640(-944034311), 25);
				this.aClass132_Sub1_Sub1_Sub1_Sub1_2.anInt2768 = this.anInt3863 * 718421009;
				this.aClass132_Sub1_Sub1_Sub1_Sub1_2.anInt2786 = client.anInt3485 * 632844529;
				this.aClass132_Sub1_Sub1_Sub1_Sub1_2.method18601((Class336) Class162.aClass32_Sub3_2.method18273(this.anInt3864 * -376320861, -1809746076), -945067991);
				this.aClass132_Sub1_Sub1_Sub1_Sub1_2.method19973(this.aClass132_Sub1_Sub1_Sub1_Sub1_2.aClass336_1.anInt4195 * 447008399, -2142170693);
				this.aClass132_Sub1_Sub1_Sub1_Sub1_2.anInt2788 = (this.aClass132_Sub1_Sub1_Sub1_Sub1_2.aClass336_1.anInt4206 * 295553787 << 3) * 723489705;
				this.aClass132_Sub1_Sub1_Sub1_Sub1_2.anInt2766 = ((Class249.anInt3881 += -1432082549) * -1421948893 - 1) * 1501413983;
			} else {
				this.aClass132_Sub1_Sub1_Sub1_Sub2_2 = new Class132_Sub1_Sub1_Sub1_Sub2(client.aClass532_1.method30640(-1678184848), 25);
				this.aClass132_Sub1_Sub1_Sub1_Sub2_2.method20078(Class36.aClass93_Sub41_1, 1881477473);
				this.aClass132_Sub1_Sub1_Sub1_Sub2_2.anInt2768 = this.anInt3863 * 718421009;
				this.aClass132_Sub1_Sub1_Sub1_Sub2_2.anInt2786 = client.anInt3485 * 632844529;
				this.aClass132_Sub1_Sub1_Sub1_Sub2_2.anInt2766 = ((Class249.anInt3881 += -1432082549) * -1421948893 - 1) * 1501413983;
			}
		}
		if (this.anInt3864 * -376320861 >= 0) {
			this.aClass132_Sub1_Sub1_Sub1_Sub1_2.method18604(arg2, arg0, arg1, true, this.aClass132_Sub1_Sub1_Sub1_Sub1_2.method20009(-319274456), (byte) -111);
			this.aClass132_Sub1_Sub1_Sub1_Sub1_2.method19964(arg3, true, -1075345764);
		} else {
			this.aClass132_Sub1_Sub1_Sub1_Sub2_2.aByte100 = this.aClass132_Sub1_Sub1_Sub1_Sub2_2.aByte99 = (byte) arg2;
			this.aClass132_Sub1_Sub1_Sub1_Sub2_2.method20067(arg0, arg1, (byte) 1);
			this.aClass132_Sub1_Sub1_Sub1_Sub2_2.method19964(arg3, true, -1769724098);
		}
	}

	@OriginalMember(owner = "client!ea", name = "z", descriptor = "(III)V")
	void method25906(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass132_Sub1_Sub1_Sub1_Sub1_2 == null) {
			this.aClass132_Sub1_Sub1_Sub1_Sub2_2.aByte100 = this.aClass132_Sub1_Sub1_Sub1_Sub2_2.aByte99 = (byte) arg0;
			this.aClass132_Sub1_Sub1_Sub1_Sub2_2.method20067(arg1, arg2, (byte) 1);
		} else {
			this.aClass132_Sub1_Sub1_Sub1_Sub1_2.method18604(arg0, arg1, arg2, true, this.aClass132_Sub1_Sub1_Sub1_Sub1_2.method20009(-727437810), (byte) -74);
		}
	}

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "(III)V")
	void method25907(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass132_Sub1_Sub1_Sub1_Sub1_2 == null) {
			this.aClass132_Sub1_Sub1_Sub1_Sub2_2.aByte100 = this.aClass132_Sub1_Sub1_Sub1_Sub2_2.aByte99 = (byte) arg0;
			this.aClass132_Sub1_Sub1_Sub1_Sub2_2.method20067(arg1, arg2, (byte) 1);
		} else {
			this.aClass132_Sub1_Sub1_Sub1_Sub1_2.method18604(arg0, arg1, arg2, true, this.aClass132_Sub1_Sub1_Sub1_Sub1_2.method20009(-131222312), (byte) -27);
		}
	}

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(III)V")
	void method25908(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass132_Sub1_Sub1_Sub1_Sub1_2 == null) {
			this.aClass132_Sub1_Sub1_Sub1_Sub2_2.aByte100 = this.aClass132_Sub1_Sub1_Sub1_Sub2_2.aByte99 = (byte) arg0;
			this.aClass132_Sub1_Sub1_Sub1_Sub2_2.method20067(arg1, arg2, (byte) 1);
		} else {
			this.aClass132_Sub1_Sub1_Sub1_Sub1_2.method18604(arg0, arg1, arg2, true, this.aClass132_Sub1_Sub1_Sub1_Sub1_2.method20009(-357696768), (byte) -85);
		}
	}

	@OriginalMember(owner = "client!ea", name = "r", descriptor = "()Lclient!ahm;")
	public Class132_Sub1_Sub1_Sub1 method25909() {
		return this.aClass132_Sub1_Sub1_Sub1_Sub1_2 == null ? this.aClass132_Sub1_Sub1_Sub1_Sub2_2 : this.aClass132_Sub1_Sub1_Sub1_Sub1_2;
	}

	@OriginalMember(owner = "client!ea", name = "v", descriptor = "()Lclient!ahm;")
	public Class132_Sub1_Sub1_Sub1 method25910() {
		return this.aClass132_Sub1_Sub1_Sub1_Sub1_2 == null ? this.aClass132_Sub1_Sub1_Sub1_Sub2_2 : this.aClass132_Sub1_Sub1_Sub1_Sub1_2;
	}
}
