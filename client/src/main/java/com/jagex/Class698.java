package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!yz")
public final class Class698 {

	@OriginalMember(owner = "client!yz", name = "iq", descriptor = "Lclient!wi;")
	public static Class638 aClass638_1;

	@OriginalMember(owner = "client!yz", name = "t", descriptor = "Lclient!vw;")
	final Class626 aClass626_4;

	@OriginalMember(owner = "client!yz", name = "f", descriptor = "I")
	final int anInt5811;

	@OriginalMember(owner = "client!yz", name = "e", descriptor = "(Ljava/lang/CharSequence;S)Z")
	public static boolean method37062(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) short arg1) {
		return Class547.method31237(arg0, 10, true, -1174710433);
	}

	@OriginalMember(owner = "client!yz", name = "gh", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;S)V")
	static void method37063(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) short arg3) {
		@Pc(12) int local12 = arg2.anIntArray525[(arg2.anInt5778 -= 2036747717) * 1896589581];
		@Pc(26) String local26 = (String) arg2.anObjectArray46[(arg2.anInt5776 -= -825189621) * -2070619997];
		@Pc(32) Class79 local32 = (Class79) Class370.aClass41_Sub10_1.method18054(local12, -1798990382);
		if (local32.aString11.equals(local26)) {
			arg0.method27652(local12, 1529953993);
		} else {
			arg0.method27647(local12, local26, 1205496594);
		}
	}

	@OriginalMember(owner = "client!yz", name = "<init>", descriptor = "(Lclient!vw;I)V")
	public Class698(@OriginalArg(0) Class626 arg0, @OriginalArg(1) int arg1) {
		this.aClass626_4 = arg0;
		this.anInt5811 = arg1 * 564365393;
	}

	@OriginalMember(owner = "client!yz", name = "f", descriptor = "()Lclient!auu;")
	public Class120_Sub1_Sub5_Sub1 method37058() {
		@Pc(25) Class80_Sub4 local25 = (Class80_Sub4) client.aClass24_22.method560((long) (this.aClass626_4.anInt5538 * -990975809 << 28 | this.aClass626_4.anInt5537 * -894305615 << 14 | this.aClass626_4.anInt5540 * -390642507));
		if (local25 == null) {
			return null;
		}
		@Pc(33) Class626 local33 = client.aClass539_1.method30893((byte) -63);
		@Pc(44) int local44 = this.aClass626_4.anInt5540 * -390642507 - local33.anInt5540 * -390642507;
		@Pc(55) int local55 = this.aClass626_4.anInt5537 * -894305615 - local33.anInt5537 * -894305615;
		if (local44 >= 0 && local55 >= 0 && local44 < client.aClass539_1.method30921(1948008108) && local55 < client.aClass539_1.method31011(363770647) && client.aClass539_1.method30932(-1638462787) != null) {
			for (@Pc(79) Class80_Sub9 local79 = (Class80_Sub9) local25.aClass8_18.method247(129206984); local79 != null; local79 = (Class80_Sub9) local25.aClass8_18.method237(-904692412)) {
				if (local79.anInt1498 * 959158013 == this.anInt5811 * -502087503) {
					return (Class120_Sub1_Sub5_Sub1) client.aClass539_1.method30932(-1638462787).method31637(this.aClass626_4.anInt5538 * -990975809, local44, local55, -1427706250);
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!yz", name = "u", descriptor = "()Lclient!auu;")
	public Class120_Sub1_Sub5_Sub1 method37059() {
		@Pc(25) Class80_Sub4 local25 = (Class80_Sub4) client.aClass24_22.method560((long) (this.aClass626_4.anInt5538 * -990975809 << 28 | this.aClass626_4.anInt5537 * -894305615 << 14 | this.aClass626_4.anInt5540 * -390642507));
		if (local25 == null) {
			return null;
		}
		@Pc(33) Class626 local33 = client.aClass539_1.method30893((byte) -61);
		@Pc(44) int local44 = this.aClass626_4.anInt5540 * -390642507 - local33.anInt5540 * -390642507;
		@Pc(55) int local55 = this.aClass626_4.anInt5537 * -894305615 - local33.anInt5537 * -894305615;
		if (local44 >= 0 && local55 >= 0 && local44 < client.aClass539_1.method30921(1881677828) && local55 < client.aClass539_1.method31011(-640346061) && client.aClass539_1.method30932(-1638462787) != null) {
			for (@Pc(79) Class80_Sub9 local79 = (Class80_Sub9) local25.aClass8_18.method247(129206984); local79 != null; local79 = (Class80_Sub9) local25.aClass8_18.method237(-622969956)) {
				if (local79.anInt1498 * 959158013 == this.anInt5811 * -502087503) {
					return (Class120_Sub1_Sub5_Sub1) client.aClass539_1.method30932(-1638462787).method31637(this.aClass626_4.anInt5538 * -990975809, local44, local55, -1643283693);
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!yz", name = "t", descriptor = "(B)Lclient!auu;")
	public Class120_Sub1_Sub5_Sub1 method37060(@OriginalArg(0) byte arg0) {
		@Pc(25) Class80_Sub4 local25 = (Class80_Sub4) client.aClass24_22.method560((long) (this.aClass626_4.anInt5538 * -990975809 << 28 | this.aClass626_4.anInt5537 * -894305615 << 14 | this.aClass626_4.anInt5540 * -390642507));
		if (local25 == null) {
			return null;
		}
		@Pc(33) Class626 local33 = client.aClass539_1.method30893((byte) -113);
		@Pc(44) int local44 = this.aClass626_4.anInt5540 * -390642507 - local33.anInt5540 * -390642507;
		@Pc(55) int local55 = this.aClass626_4.anInt5537 * -894305615 - local33.anInt5537 * -894305615;
		if (local44 >= 0 && local55 >= 0 && local44 < client.aClass539_1.method30921(2007503284) && local55 < client.aClass539_1.method31011(-1624808429) && client.aClass539_1.method30932(-1638462787) != null) {
			for (@Pc(79) Class80_Sub9 local79 = (Class80_Sub9) local25.aClass8_18.method247(129206984); local79 != null; local79 = (Class80_Sub9) local25.aClass8_18.method237(360010645)) {
				if (local79.anInt1498 * 959158013 == this.anInt5811 * -502087503) {
					return (Class120_Sub1_Sub5_Sub1) client.aClass539_1.method30932(-1638462787).method31637(this.aClass626_4.anInt5538 * -990975809, local44, local55, -2027382230);
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!yz", name = "e", descriptor = "()Lclient!auu;")
	public Class120_Sub1_Sub5_Sub1 method37061() {
		@Pc(25) Class80_Sub4 local25 = (Class80_Sub4) client.aClass24_22.method560((long) (this.aClass626_4.anInt5538 * -990975809 << 28 | this.aClass626_4.anInt5537 * -894305615 << 14 | this.aClass626_4.anInt5540 * -390642507));
		if (local25 == null) {
			return null;
		}
		@Pc(33) Class626 local33 = client.aClass539_1.method30893((byte) -105);
		@Pc(44) int local44 = this.aClass626_4.anInt5540 * -390642507 - local33.anInt5540 * -390642507;
		@Pc(55) int local55 = this.aClass626_4.anInt5537 * -894305615 - local33.anInt5537 * -894305615;
		if (local44 >= 0 && local55 >= 0 && local44 < client.aClass539_1.method30921(1907808383) && local55 < client.aClass539_1.method31011(222841343) && client.aClass539_1.method30932(-1638462787) != null) {
			for (@Pc(79) Class80_Sub9 local79 = (Class80_Sub9) local25.aClass8_18.method247(129206984); local79 != null; local79 = (Class80_Sub9) local25.aClass8_18.method237(484923479)) {
				if (local79.anInt1498 * 959158013 == this.anInt5811 * -502087503) {
					return (Class120_Sub1_Sub5_Sub1) client.aClass539_1.method30932(-1638462787).method31637(this.aClass626_4.anInt5538 * -990975809, local44, local55, -2098016561);
				}
			}
		}
		return null;
	}
}
