package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wp")
public class Class643 implements Interface70 {

	@OriginalMember(owner = "client!wp", name = "n", descriptor = "Lclient!wl;")
	Class639 aClass639_5 = Class639.aClass639_4;

	@OriginalMember(owner = "client!wp", name = "k", descriptor = "Lclient!py;")
	Class497 aClass497_139;

	@OriginalMember(owner = "client!wp", name = "m", descriptor = "I")
	int anInt5758;

	@OriginalMember(owner = "client!wp", name = "e", descriptor = "Lclient!mt;")
	Class146 aClass146_5;

	@OriginalMember(owner = "client!wp", name = "f", descriptor = "Lclient!wj;")
	Interface68 anInterface68_2;

	@OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(Lclient!py;ILclient!mt;Lclient!wj;)V", line = 16)
	public Class643(@OriginalArg(0) Class497 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class146 arg2, @OriginalArg(3) Interface68 arg3) {
		this.aClass497_139 = arg0;
		this.anInt5758 = arg1 * 116772531;
		this.aClass146_5 = arg2;
		this.anInterface68_2 = arg3;
		this.aClass639_5 = Class639.aClass639_2;
	}

	@OriginalMember(owner = "client!wp", name = "e", descriptor = "(B)V", line = 25)
	@Override
	public void method32526(@OriginalArg(0) byte arg0) {
		if (Class639.aClass639_2 != this.aClass639_5) {
			return;
		}
		this.method32581(-1190684771);
		this.aClass639_5 = Class639.aClass639_3;
		if (this.anInterface68_2 != null) {
			this.anInterface68_2.method26239(this, 0, this.anInt5758 * 1851494523, true, (byte) 56);
		}
	}

	@OriginalMember(owner = "client!wp", name = "x", descriptor = "()V", line = 25)
	@Override
	public void method32553() {
		if (Class639.aClass639_2 != this.aClass639_5) {
			return;
		}
		this.method32581(-1947105121);
		this.aClass639_5 = Class639.aClass639_3;
		if (this.anInterface68_2 != null) {
			this.anInterface68_2.method26239(this, 0, this.anInt5758 * 1851494523, true, (byte) 76);
		}
	}

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "()V", line = 25)
	@Override
	public void method32541() {
		if (Class639.aClass639_2 != this.aClass639_5) {
			return;
		}
		this.method32581(-1367056571);
		this.aClass639_5 = Class639.aClass639_3;
		if (this.anInterface68_2 != null) {
			this.anInterface68_2.method26239(this, 0, this.anInt5758 * 1851494523, true, (byte) 71);
		}
	}

	@OriginalMember(owner = "client!wp", name = "n", descriptor = "(B)Lclient!rw;", line = 35)
	@Override
	public Class539 method32540(@OriginalArg(0) byte arg0) {
		@Pc(5) Class539 local5 = new Class539(this.aClass146_5);
		local5.method30788(this, 2085956518);
		return local5;
	}

	@OriginalMember(owner = "client!wp", name = "h", descriptor = "()Lclient!rw;", line = 35)
	@Override
	public Class539 method32542() {
		@Pc(5) Class539 local5 = new Class539(this.aClass146_5);
		local5.method30788(this, 1340705134);
		return local5;
	}

	@OriginalMember(owner = "client!wp", name = "g", descriptor = "()Lclient!rw;", line = 35)
	@Override
	public Class539 method32544() {
		@Pc(5) Class539 local5 = new Class539(this.aClass146_5);
		local5.method30788(this, 1362272487);
		return local5;
	}

	@OriginalMember(owner = "client!wp", name = "i", descriptor = "()Lclient!rw;", line = 35)
	@Override
	public Class539 method32545() {
		@Pc(5) Class539 local5 = new Class539(this.aClass146_5);
		local5.method30788(this, 1846192886);
		return local5;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "()Lclient!rw;", line = 35)
	@Override
	public Class539 method32543() {
		@Pc(5) Class539 local5 = new Class539(this.aClass146_5);
		local5.method30788(this, 2010119771);
		return local5;
	}

	@OriginalMember(owner = "client!wp", name = "m", descriptor = "(I)Lclient!wl;", line = 41)
	@Override
	public Class639 method32567(@OriginalArg(0) int arg0) {
		return this.aClass639_5;
	}

	@OriginalMember(owner = "client!wp", name = "bi", descriptor = "()Lclient!wl;", line = 41)
	@Override
	public Class639 method32551() {
		return this.aClass639_5;
	}

	@OriginalMember(owner = "client!wp", name = "bc", descriptor = "()Lclient!wl;", line = 41)
	@Override
	public Class639 method32578() {
		return this.aClass639_5;
	}

	@OriginalMember(owner = "client!wp", name = "bn", descriptor = "()Lclient!wl;", line = 41)
	@Override
	public Class639 method32576() {
		return this.aClass639_5;
	}

	@OriginalMember(owner = "client!wp", name = "k", descriptor = "(I)Z", line = 45)
	@Override
	public boolean method32527(@OriginalArg(0) int arg0) {
		return true;
	}

	@OriginalMember(owner = "client!wp", name = "bx", descriptor = "()Z", line = 45)
	@Override
	public boolean method32570() {
		return true;
	}

	@OriginalMember(owner = "client!wp", name = "bd", descriptor = "()Z", line = 45)
	@Override
	public boolean method32532() {
		return true;
	}

	@OriginalMember(owner = "client!wp", name = "bh", descriptor = "()Z", line = 45)
	@Override
	public boolean method32575() {
		return true;
	}

	@OriginalMember(owner = "client!wp", name = "f", descriptor = "(I)V", line = 48)
	void method32581(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!wp", name = "ae", descriptor = "()I", line = 51)
	@Override
	public int method32539() {
		return 0;
	}

	@OriginalMember(owner = "client!wp", name = "ag", descriptor = "()I", line = 51)
	@Override
	public int method32548() {
		return 0;
	}

	@OriginalMember(owner = "client!wp", name = "l", descriptor = "(I)I", line = 51)
	@Override
	public int method32530(@OriginalArg(0) int arg0) {
		return 0;
	}

	@OriginalMember(owner = "client!wp", name = "u", descriptor = "(I)Lclient!qk;", line = 55)
	@Override
	public Class508 method32531(@OriginalArg(0) int arg0) {
		return Class508.aClass508_6;
	}

	@OriginalMember(owner = "client!wp", name = "ah", descriptor = "()Lclient!qk;", line = 55)
	@Override
	public Class508 method32559() {
		return Class508.aClass508_6;
	}

	@OriginalMember(owner = "client!wp", name = "al", descriptor = "()Lclient!qk;", line = 55)
	@Override
	public Class508 method32550() {
		return Class508.aClass508_6;
	}

	@OriginalMember(owner = "client!wp", name = "ac", descriptor = "()Lclient!qk;", line = 55)
	@Override
	public Class508 method32549() {
		return Class508.aClass508_6;
	}

	@OriginalMember(owner = "client!wp", name = "z", descriptor = "(B)I", line = 59)
	@Override
	public int method32558(@OriginalArg(0) byte arg0) {
		return this.anInt5758 * 1851494523;
	}

	@OriginalMember(owner = "client!wp", name = "aw", descriptor = "()I", line = 59)
	@Override
	public int method32565() {
		return this.anInt5758 * 1851494523;
	}

	@OriginalMember(owner = "client!wp", name = "as", descriptor = "()I", line = 59)
	@Override
	public int method32554() {
		return this.anInt5758 * 1851494523;
	}

	@OriginalMember(owner = "client!wp", name = "ai", descriptor = "()I", line = 59)
	@Override
	public int method32552() {
		return this.anInt5758 * 1851494523;
	}

	@OriginalMember(owner = "client!wp", name = "w", descriptor = "(II)[B", line = 63)
	@Override
	public byte[] method32529(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = arg0;
		if (arg0 == 0) {
			local1 = this.anInt5758 * 1851494523;
		}
		return this.aClass497_139.method30079(local1, (byte) 48);
	}

	@OriginalMember(owner = "client!wp", name = "t", descriptor = "(I)[B", line = 63)
	@Override
	public byte[] method32546(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = arg0;
		if (arg0 == 0) {
			local1 = this.anInt5758 * 1851494523;
		}
		return this.aClass497_139.method30079(local1, (byte) 47);
	}

	@OriginalMember(owner = "client!wp", name = "p", descriptor = "(Lclient!alw;B)V", line = 68)
	@Override
	public void method32533(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) byte arg1) {
	}

	@OriginalMember(owner = "client!wp", name = "at", descriptor = "(Lclient!alw;)V", line = 68)
	@Override
	public void method32555(@OriginalArg(0) Class93_Sub41 arg0) {
	}

	@OriginalMember(owner = "client!wp", name = "d", descriptor = "(II)Lclient!alw;", line = 71)
	@Override
	public Class93_Sub41 method32534(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!wp", name = "ad", descriptor = "(I)Lclient!alw;", line = 71)
	@Override
	public Class93_Sub41 method32569(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!wp", name = "ar", descriptor = "(I)Lclient!alw;", line = 71)
	@Override
	public Class93_Sub41 method32528(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!wp", name = "au", descriptor = "(I)Lclient!alw;", line = 71)
	@Override
	public Class93_Sub41 method32571(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!wp", name = "am", descriptor = "(I)Lclient!alw;", line = 71)
	@Override
	public Class93_Sub41 method32557(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!wp", name = "c", descriptor = "(II)Z", line = 75)
	@Override
	public boolean method32536(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!wp", name = "aq", descriptor = "(I)Z", line = 75)
	@Override
	public boolean method32561(@OriginalArg(0) int arg0) {
		return false;
	}

	@OriginalMember(owner = "client!wp", name = "ax", descriptor = "(I)Z", line = 75)
	@Override
	public boolean method32562(@OriginalArg(0) int arg0) {
		return false;
	}

	@OriginalMember(owner = "client!wp", name = "ap", descriptor = "(I)Z", line = 75)
	@Override
	public boolean method32560(@OriginalArg(0) int arg0) {
		return false;
	}

	@OriginalMember(owner = "client!wp", name = "av", descriptor = "(I)Z", line = 75)
	@Override
	public boolean method32563(@OriginalArg(0) int arg0) {
		return false;
	}

	@OriginalMember(owner = "client!wp", name = "r", descriptor = "(I)Z", line = 79)
	@Override
	public boolean method32535(@OriginalArg(0) int arg0) {
		return false;
	}

	@OriginalMember(owner = "client!wp", name = "ao", descriptor = "()Z", line = 79)
	@Override
	public boolean method32564() {
		return false;
	}

	@OriginalMember(owner = "client!wp", name = "aj", descriptor = "()Z", line = 79)
	@Override
	public boolean method32556() {
		return false;
	}

	@OriginalMember(owner = "client!wp", name = "v", descriptor = "(B)I", line = 83)
	@Override
	public int method32537(@OriginalArg(0) byte arg0) {
		return 0;
	}

	@OriginalMember(owner = "client!wp", name = "ay", descriptor = "()I", line = 83)
	@Override
	public int method32566() {
		return 0;
	}

	@OriginalMember(owner = "client!wp", name = "ab", descriptor = "()I", line = 83)
	@Override
	public int method32525() {
		return 0;
	}

	@OriginalMember(owner = "client!wp", name = "az", descriptor = "()I", line = 83)
	@Override
	public int method32580() {
		return 0;
	}

	@OriginalMember(owner = "client!wp", name = "af", descriptor = "(Z)V", line = 86)
	@Override
	public void method32577(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!wp", name = "ak", descriptor = "(Z)V", line = 86)
	@Override
	public void method32568(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!wp", name = "o", descriptor = "(ZB)V", line = 86)
	@Override
	public void method32538(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte arg1) {
	}

	@OriginalMember(owner = "client!wp", name = "aa", descriptor = "(Z)V", line = 86)
	@Override
	public void method32579(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!wp", name = "bf", descriptor = "()Z", line = 89)
	@Override
	public boolean method32573() {
		return false;
	}

	@OriginalMember(owner = "client!wp", name = "s", descriptor = "(S)Z", line = 89)
	@Override
	public boolean method32547(@OriginalArg(0) short arg0) {
		return false;
	}

	@OriginalMember(owner = "client!wp", name = "an", descriptor = "()Z", line = 89)
	@Override
	public boolean method32572() {
		return false;
	}

	@OriginalMember(owner = "client!wp", name = "bl", descriptor = "()Z", line = 89)
	@Override
	public boolean method32574() {
		return false;
	}

	@OriginalMember(owner = "client!wp", name = "k", descriptor = "(IIIILclient!vd;Lclient!aqc;Lclient!aqk;I)V", line = 166)
	public static void method32582(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class610 arg4, @OriginalArg(5) Class132_Sub1_Sub1_Sub1_Sub1 arg5, @OriginalArg(6) Class132_Sub1_Sub1_Sub1_Sub2 arg6, @OriginalArg(7) int arg7) {
		@Pc(3) Class93_Sub13 local3 = new Class93_Sub13();
		local3.anInt1506 = arg0 * 1680099407;
		local3.anInt1513 = (arg1 << 9) * 1575742085;
		local3.anInt1507 = (arg2 << 9) * 1539129531;
		if (arg4 != null) {
			local3.aClass610_1 = arg4;
			@Pc(32) int local32 = arg4.anInt5608 * 427800467;
			@Pc(37) int local37 = arg4.anInt5603 * -774442965;
			if (arg3 == 1 || arg3 == 3) {
				local32 = arg4.anInt5603 * -774442965;
				local37 = arg4.anInt5608 * 427800467;
			}
			local3.anInt1508 = (local32 + arg1 << 9) * 440138643;
			local3.anInt1509 = (arg2 + local37 << 9) * -465070531;
			local3.anInt1522 = arg4.anInt5613 * -958108791;
			local3.anInt1512 = (arg4.anInt5614 * -732589877 << 9) * -1068725865;
			local3.anInt1514 = arg4.anInt5616 * -612368307;
			local3.anInt1523 = arg4.anInt5617 * -390370221;
			local3.anInt1524 = arg4.anInt5590 * 1075889437;
			local3.anIntArray175 = arg4.anIntArray493;
			local3.anInt1521 = arg4.anInt5620 * 2123601001;
			local3.anInt1520 = arg4.anInt5618 * -153315611;
			local3.anInt1511 = (arg4.anInt5615 * 1029443597 << 9) * -790717763;
			if (arg4.anIntArray492 != null) {
				local3.aBoolean336 = true;
				local3.method13471((byte) -96);
			}
			if (local3.anIntArray175 != null) {
				local3.anInt1510 = (local3.anInt1523 * 1676874203 + (int) (Math.random() * (double) (local3.anInt1524 * 1675476241 - local3.anInt1523 * 1676874203))) * 2090876833;
			}
			Class93_Sub13.aClass22_21.method408(local3, -1983917296);
			Class274.aClass258_1.method26076(local3.anInt1522 * 486579173, (byte) 3);
			Class274.aClass258_1.method26074(local3.anIntArray175, (byte) -64);
		} else if (arg5 != null) {
			local3.aClass132_Sub1_Sub1_Sub1_Sub1_1 = arg5;
			@Pc(191) Class336 local191 = arg5.aClass336_1;
			if (local191.anIntArray412 != null) {
				local3.aBoolean336 = true;
				local191 = local191.method27435(Class624.aClass120_1, Class624.aClass120_1, (short) 1984);
			}
			if (local191 != null) {
				local3.anInt1508 = (arg1 + local191.anInt4154 * 447008399 << 9) * 440138643;
				local3.anInt1509 = (arg2 + local191.anInt4154 * 447008399 << 9) * -465070531;
				local3.anInt1522 = Class566.method31257(arg5, 586339351) * -1340593683;
				local3.anInt1512 = (-2098931717 * local191.anInt4174 << 9) * -1068725865;
				local3.anInt1514 = local191.anInt4167 * 500628225;
				local3.anInt1521 = local191.anInt4155 * -703671773;
				local3.anInt1520 = local191.anInt4179 * -942130733;
				local3.anInt1511 = (-1290378981 * local191.anInt4175 << 9) * -790717763;
				Class274.aClass258_1.method26076(local191.anInt4170 * 1249212417, (byte) 3);
				Class274.aClass258_1.method26076(local191.anInt4171 * 965071225, (byte) 3);
				Class274.aClass258_1.method26076(local191.anInt4172 * -374268759, (byte) 3);
				Class274.aClass258_1.method26076(local191.anInt4173 * -2119958049, (byte) 3);
			}
			Class93_Sub13.aClass22_22.method408(local3, -2147127133);
		} else if (arg6 != null) {
			local3.aClass132_Sub1_Sub1_Sub1_Sub2_1 = arg6;
			local3.anInt1508 = (arg1 + arg6.method19986(1832763) << 9) * 440138643;
			local3.anInt1509 = (arg2 + arg6.method19986(1118149743) << 9) * -465070531;
			local3.anInt1522 = Class110_Sub18.method8431(arg6, -2099430835) * -1340593683;
			local3.anInt1512 = (-1513940767 * arg6.anInt2807 << 9) * -1068725865;
			local3.anInt1514 = arg6.anInt2808 * 31129119;
			local3.anInt1521 = 256570624;
			local3.anInt1520 = 778500352;
			local3.anInt1511 = 0;
			Class93_Sub13.aClass16_11.method220(local3, (long) (arg6.anInt2768 * -1688488127));
			Class274.aClass258_1.method26076(arg6.anInt2803 * 1706069295, (byte) 3);
			Class274.aClass258_1.method26076(arg6.anInt2797 * 479956847, (byte) 3);
			Class274.aClass258_1.method26076(arg6.anInt2805 * 1263335603, (byte) 3);
			Class274.aClass258_1.method26076(arg6.anInt2806 * -2115122027, (byte) 3);
		}
	}

	@OriginalMember(owner = "client!wp", name = "aug", descriptor = "(Lclient!yf;I)V", line = 13433)
	static final void method32583(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = client.aBoolean606 ? 1 : 0;
	}
}
