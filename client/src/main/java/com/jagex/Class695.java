package com.jagex;

import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!yu")
public final class Class695 {

	@OriginalMember(owner = "client!yu", name = "t", descriptor = "Lclient!vw;")
	final Class626 aClass626_3;

	@OriginalMember(owner = "client!yu", name = "f", descriptor = "I")
	final int anInt5797;

	@OriginalMember(owner = "client!yu", name = "e", descriptor = "I")
	final int anInt5798;

	@OriginalMember(owner = "client!yu", name = "ahe", descriptor = "(Lclient!yp;I)V")
	static void method37031(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(29) Class79 local29 = (Class79) Class370.aClass41_Sub10_1.method18054(local23, -461820374);
		if (local29.method1428(1129969654)) {
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = ((Class261) Class125.aClass41_Sub1_6.method18054(local13, 854211081)).method26482(local23, local29.aString11, -1696013128);
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = ((Class261) Class125.aClass41_Sub1_6.method18054(local13, -161185723)).method26486(local23, local29.anInt253 * 680817871, 637223663);
		}
	}

	@OriginalMember(owner = "client!yu", name = "akk", descriptor = "(Lclient!yp;I)V")
	static void method37032(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(15) Class80_Sub1_Sub12 local15 = Class146.method13874(-1555812527);
		if (local15 != null) {
			@Pc(36) boolean local36 = local15.method22596(local12 >> 28 & 0x3, local12 >> 14 & 0x3FFF, local12 & 0x3FFF, Class681.anIntArray521, (byte) -33);
			if (local36) {
				Class618.method32299(Class681.anIntArray521[1], Class681.anIntArray521[2], -671912698);
			}
		}
	}

	@OriginalMember(owner = "client!yu", name = "md", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;I)V")
	static void method37033(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) int arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray46[(arg2.anInt5776 -= -825189621) * -2070619997];
		if (Class619.method32302(local13, arg2, -1877229613) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray15 = Class431.method29089(local13, arg2, 1032523035);
		arg0.aBoolean815 = true;
	}

	@OriginalMember(owner = "client!yu", name = "f", descriptor = "(Ljava/io/File;II)[B")
	static byte[] method37034(@OriginalArg(0) File arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(2) byte[] local2 = new byte[arg1];
			Class354.method28081(arg0, local2, arg1, (byte) -64);
			return local2;
		} catch (@Pc(10) IOException local10) {
			return null;
		}
	}

	@OriginalMember(owner = "client!yu", name = "bcf", descriptor = "(Lclient!yp;S)V")
	static void method37035(@OriginalArg(0) Class690 arg0, @OriginalArg(1) short arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
	}

	@OriginalMember(owner = "client!yu", name = "<init>", descriptor = "(Lclient!vw;III)V")
	public Class695(@OriginalArg(0) Class626 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass626_3 = arg0;
		this.anInt5797 = arg1 * 1058320675;
		this.anInt5798 = arg3 * -1708008617;
	}

	@OriginalMember(owner = "client!yu", name = "l", descriptor = "()Lclient!sc;")
	Interface60 method37025() {
		@Pc(5) int local5 = this.aClass626_3.anInt5538 * -990975809;
		@Pc(9) Class626 local9 = client.aClass539_1.method30893((byte) -127);
		@Pc(20) int local20 = this.aClass626_3.anInt5540 * -390642507 - local9.anInt5540 * -390642507;
		@Pc(31) int local31 = this.aClass626_3.anInt5537 * -894305615 - local9.anInt5537 * -894305615;
		if (local20 < 0 || local31 < 0 || local20 >= client.aClass539_1.method30921(2040615183) || local31 >= client.aClass539_1.method31011(-391973478) || client.aClass539_1.method30932(-1638462787) == null) {
			return null;
		}
		switch(this.method37026((byte) 0)) {
			case 0:
				return (Interface60) client.aClass539_1.method30932(-1638462787).method31570(local5, local20, local31, (byte) -7);
			case 1:
				return (Interface60) client.aClass539_1.method30932(-1638462787).method31572(local5, local20, local31, (byte) -5);
			case 2:
				return (Interface60) client.aClass539_1.method30932(-1638462787).method31574(local5, local20, local31, client.anInterface62_1, (byte) -99);
			case 3:
				return (Interface60) client.aClass539_1.method30932(-1638462787).method31558(local5, local20, local31, -183275717);
			default:
				return null;
		}
	}

	@OriginalMember(owner = "client!yu", name = "t", descriptor = "(B)I")
	int method37026(@OriginalArg(0) byte arg0) {
		return client.anIntArray306[this.anInt5797 * 1681852043];
	}

	@OriginalMember(owner = "client!yu", name = "g", descriptor = "()Lclient!sc;")
	Interface60 method37027() {
		@Pc(5) int local5 = this.aClass626_3.anInt5538 * -990975809;
		@Pc(9) Class626 local9 = client.aClass539_1.method30893((byte) -50);
		@Pc(20) int local20 = this.aClass626_3.anInt5540 * -390642507 - local9.anInt5540 * -390642507;
		@Pc(31) int local31 = this.aClass626_3.anInt5537 * -894305615 - local9.anInt5537 * -894305615;
		if (local20 < 0 || local31 < 0 || local20 >= client.aClass539_1.method30921(1880417133) || local31 >= client.aClass539_1.method31011(-167065941) || client.aClass539_1.method30932(-1638462787) == null) {
			return null;
		}
		switch(this.method37026((byte) 0)) {
			case 0:
				return (Interface60) client.aClass539_1.method30932(-1638462787).method31570(local5, local20, local31, (byte) -41);
			case 1:
				return (Interface60) client.aClass539_1.method30932(-1638462787).method31572(local5, local20, local31, (byte) -79);
			case 2:
				return (Interface60) client.aClass539_1.method30932(-1638462787).method31574(local5, local20, local31, client.anInterface62_1, (byte) -17);
			case 3:
				return (Interface60) client.aClass539_1.method30932(-1638462787).method31558(local5, local20, local31, -47585243);
			default:
				return null;
		}
	}

	@OriginalMember(owner = "client!yu", name = "u", descriptor = "()I")
	int method37028() {
		return client.anIntArray306[this.anInt5797 * 1681852043];
	}

	@OriginalMember(owner = "client!yu", name = "e", descriptor = "(S)Lclient!sc;")
	Interface60 method37029(@OriginalArg(0) short arg0) {
		@Pc(5) int local5 = this.aClass626_3.anInt5538 * -990975809;
		@Pc(9) Class626 local9 = client.aClass539_1.method30893((byte) -29);
		@Pc(20) int local20 = this.aClass626_3.anInt5540 * -390642507 - local9.anInt5540 * -390642507;
		@Pc(31) int local31 = this.aClass626_3.anInt5537 * -894305615 - local9.anInt5537 * -894305615;
		if (local20 < 0 || local31 < 0 || local20 >= client.aClass539_1.method30921(1956705511) || local31 >= client.aClass539_1.method31011(428812650) || client.aClass539_1.method30932(-1638462787) == null) {
			return null;
		}
		switch(this.method37026((byte) 0)) {
			case 0:
				return (Interface60) client.aClass539_1.method30932(-1638462787).method31570(local5, local20, local31, (byte) -20);
			case 1:
				return (Interface60) client.aClass539_1.method30932(-1638462787).method31572(local5, local20, local31, (byte) 28);
			case 2:
				return (Interface60) client.aClass539_1.method30932(-1638462787).method31574(local5, local20, local31, client.anInterface62_1, (byte) -56);
			case 3:
				return (Interface60) client.aClass539_1.method30932(-1638462787).method31558(local5, local20, local31, 1346739456);
			default:
				return null;
		}
	}

	@OriginalMember(owner = "client!yu", name = "f", descriptor = "(B)Lclient!sc;")
	public Interface60 method37030(@OriginalArg(0) byte arg0) {
		@Pc(3) Interface60 local3 = this.method37029((short) 21040);
		if (local3 == null) {
			return null;
		} else if (local3.method13834((byte) -39) == this.anInt5798 * -472039321) {
			return local3;
		} else {
			return null;
		}
	}
}
