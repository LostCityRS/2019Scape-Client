package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wp")
public final class Class643 implements Interface70 {

	@OriginalMember(owner = "client!wp", name = "n", descriptor = "Lclient!wl;")
	Class639 aClass639_5 = Class639.aClass639_4;

	@OriginalMember(owner = "client!wp", name = "k", descriptor = "Lclient!py;")
	Class497 aClass497_139;

	@OriginalMember(owner = "client!wp", name = "m", descriptor = "I")
	int anInt5919;

	@OriginalMember(owner = "client!wp", name = "e", descriptor = "Lclient!mt;")
	Class146 aClass146_5;

	@OriginalMember(owner = "client!wp", name = "f", descriptor = "Lclient!wj;")
	Interface68 anInterface68_2;

	@OriginalMember(owner = "client!wp", name = "aug", descriptor = "(Lclient!yf;I)V")
	static void method32763(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = client.aBoolean608 ? 1 : 0;
	}

	@OriginalMember(owner = "client!wp", name = "k", descriptor = "(IIIILclient!vd;Lclient!aqc;Lclient!aqk;I)V")
	public static void method32764(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class610 arg4, @OriginalArg(5) Class132_Sub1_Sub1_Sub1_Sub1 arg5, @OriginalArg(6) Class132_Sub1_Sub1_Sub1_Sub2 arg6, @OriginalArg(7) int arg7) {
		@Pc(3) Class93_Sub13 local3 = new Class93_Sub13();
		local3.anInt1506 = arg0 * 1680099407;
		local3.anInt1513 = (arg1 << 9) * 1575742085;
		local3.anInt1507 = (arg2 << 9) * 1539129531;
		if (arg4 != null) {
			local3.aClass610_1 = arg4;
			@Pc(32) int local32 = arg4.anInt5769 * 427800467;
			@Pc(37) int local37 = arg4.anInt5764 * -774442965;
			if (arg3 == 1 || arg3 == 3) {
				local32 = arg4.anInt5764 * -774442965;
				local37 = arg4.anInt5769 * 427800467;
			}
			local3.anInt1508 = (local32 + arg1 << 9) * 440138643;
			local3.anInt1509 = (arg2 + local37 << 9) * -465070531;
			local3.anInt1522 = arg4.anInt5774 * -958108791;
			local3.anInt1512 = (arg4.anInt5775 * -732589877 << 9) * -1068725865;
			local3.anInt1514 = arg4.anInt5777 * -612368307;
			local3.anInt1523 = arg4.anInt5778 * -390370221;
			local3.anInt1524 = arg4.anInt5751 * 1075889437;
			local3.anIntArray175 = arg4.anIntArray495;
			local3.anInt1521 = arg4.anInt5781 * 2123601001;
			local3.anInt1520 = arg4.anInt5779 * -153315611;
			local3.anInt1511 = (arg4.anInt5776 * 1029443597 << 9) * -790717763;
			if (arg4.anIntArray494 != null) {
				local3.aBoolean337 = true;
				local3.method13464((byte) -96);
			}
			if (local3.anIntArray175 != null) {
				local3.anInt1510 = (local3.anInt1523 * 1676874203 + (int) (Math.random() * (double) (local3.anInt1524 * 1675476241 - local3.anInt1523 * 1676874203))) * 2090876833;
			}
			Class93_Sub13.aClass22_21.method407(local3, -1983917296);
			Class274.aClass258_11.method26176(local3.anInt1522 * 486579173, (byte) 3);
			Class274.aClass258_11.method26136(local3.anIntArray175, (byte) -64);
		} else if (arg5 != null) {
			local3.aClass132_Sub1_Sub1_Sub1_Sub1_1 = arg5;
			@Pc(191) Class336 local191 = arg5.aClass336_1;
			if (local191.anIntArray414 != null) {
				local3.aBoolean337 = true;
				local191 = local191.method27516(Class624.aClass120_1, Class624.aClass120_1, (short) 1984);
			}
			if (local191 != null) {
				local3.anInt1508 = (arg1 + local191.anInt4195 * 447008399 << 9) * 440138643;
				local3.anInt1509 = (arg2 + local191.anInt4195 * 447008399 << 9) * -465070531;
				local3.anInt1522 = Class566.method31439(arg5, 586339351) * -1340593683;
				local3.anInt1512 = (-2098931717 * local191.anInt4215 << 9) * -1068725865;
				local3.anInt1514 = local191.anInt4208 * 500628225;
				local3.anInt1521 = local191.anInt4196 * -703671773;
				local3.anInt1520 = local191.anInt4220 * -942130733;
				local3.anInt1511 = (-1290378981 * local191.anInt4216 << 9) * -790717763;
				Class274.aClass258_11.method26176(local191.anInt4211 * 1249212417, (byte) 3);
				Class274.aClass258_11.method26176(local191.anInt4212 * 965071225, (byte) 3);
				Class274.aClass258_11.method26176(local191.anInt4213 * -374268759, (byte) 3);
				Class274.aClass258_11.method26176(local191.anInt4214 * -2119958049, (byte) 3);
			}
			Class93_Sub13.aClass22_22.method407(local3, -2147127133);
		} else if (arg6 != null) {
			local3.aClass132_Sub1_Sub1_Sub1_Sub2_1 = arg6;
			local3.anInt1508 = (arg1 + arg6.method20009(1832763) << 9) * 440138643;
			local3.anInt1509 = (arg2 + arg6.method20009(1118149743) << 9) * -465070531;
			local3.anInt1522 = Class110_Sub18.method8431(arg6, -2099430835) * -1340593683;
			local3.anInt1512 = (-1513940767 * arg6.anInt2807 << 9) * -1068725865;
			local3.anInt1514 = arg6.anInt2808 * 31129119;
			local3.anInt1521 = 256570624;
			local3.anInt1520 = 778500352;
			local3.anInt1511 = 0;
			Class93_Sub13.aClass16_11.method221(local3, (long) (arg6.anInt2768 * -1688488127));
			Class274.aClass258_11.method26176(arg6.anInt2803 * 1706069295, (byte) 3);
			Class274.aClass258_11.method26176(arg6.anInt2797 * 479956847, (byte) 3);
			Class274.aClass258_11.method26176(arg6.anInt2805 * 1263335603, (byte) 3);
			Class274.aClass258_11.method26176(arg6.anInt2806 * -2115122027, (byte) 3);
		}
	}

	@OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(Lclient!py;ILclient!mt;Lclient!wj;)V")
	public Class643(@OriginalArg(0) Class497 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class146 arg2, @OriginalArg(3) Interface68 arg3) {
		this.aClass497_139 = arg0;
		this.anInt5919 = arg1 * 116772531;
		this.aClass146_5 = arg2;
		this.anInterface68_2 = arg3;
		this.aClass639_5 = Class639.aClass639_2;
	}

	@OriginalMember(owner = "client!wp", name = "af", descriptor = "(Z)V")
	@Override
	public void method32758(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!wp", name = "e", descriptor = "(B)V")
	@Override
	public void method32707(@OriginalArg(0) byte arg0) {
		if (Class639.aClass639_2 != this.aClass639_5) {
			return;
		}
		this.method32762(-1190684771);
		this.aClass639_5 = Class639.aClass639_3;
		if (this.anInterface68_2 != null) {
			this.anInterface68_2.method26332(this, 0, this.anInt5919 * 1851494523, true, (byte) 56);
		}
	}

	@OriginalMember(owner = "client!wp", name = "n", descriptor = "(B)Lclient!rw;")
	@Override
	public Class539 method32721(@OriginalArg(0) byte arg0) {
		@Pc(5) Class539 local5 = new Class539(this.aClass146_5);
		local5.method30968(this, 2085956518);
		return local5;
	}

	@OriginalMember(owner = "client!wp", name = "m", descriptor = "(I)Lclient!wl;")
	@Override
	public Class639 method32748(@OriginalArg(0) int arg0) {
		return this.aClass639_5;
	}

	@OriginalMember(owner = "client!wp", name = "bi", descriptor = "()Lclient!wl;")
	@Override
	public Class639 method32732() {
		return this.aClass639_5;
	}

	@OriginalMember(owner = "client!wp", name = "f", descriptor = "(I)V")
	void method32762(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!wp", name = "w", descriptor = "(II)[B")
	@Override
	public byte[] method32710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = arg0;
		if (arg0 == 0) {
			local1 = this.anInt5919 * 1851494523;
		}
		return this.aClass497_139.method30240(local1, (byte) 48);
	}

	@OriginalMember(owner = "client!wp", name = "u", descriptor = "(I)Lclient!qk;")
	@Override
	public Class508 method32712(@OriginalArg(0) int arg0) {
		return Class508.aClass508_6;
	}

	@OriginalMember(owner = "client!wp", name = "z", descriptor = "(B)I")
	@Override
	public int method32739(@OriginalArg(0) byte arg0) {
		return this.anInt5919 * 1851494523;
	}

	@OriginalMember(owner = "client!wp", name = "ak", descriptor = "(Z)V")
	@Override
	public void method32749(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!wp", name = "p", descriptor = "(Lclient!alw;B)V")
	@Override
	public void method32714(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) byte arg1) {
	}

	@OriginalMember(owner = "client!wp", name = "bf", descriptor = "()Z")
	@Override
	public boolean method32754() {
		return false;
	}

	@OriginalMember(owner = "client!wp", name = "c", descriptor = "(II)Z")
	@Override
	public boolean method32717(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!wp", name = "r", descriptor = "(I)Z")
	@Override
	public boolean method32716(@OriginalArg(0) int arg0) {
		return false;
	}

	@OriginalMember(owner = "client!wp", name = "v", descriptor = "(B)I")
	@Override
	public int method32718(@OriginalArg(0) byte arg0) {
		return 0;
	}

	@OriginalMember(owner = "client!wp", name = "o", descriptor = "(ZB)V")
	@Override
	public void method32719(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte arg1) {
	}

	@OriginalMember(owner = "client!wp", name = "s", descriptor = "(S)Z")
	@Override
	public boolean method32728(@OriginalArg(0) short arg0) {
		return false;
	}

	@OriginalMember(owner = "client!wp", name = "x", descriptor = "()V")
	@Override
	public void method32734() {
		if (Class639.aClass639_2 != this.aClass639_5) {
			return;
		}
		this.method32762(-1947105121);
		this.aClass639_5 = Class639.aClass639_3;
		if (this.anInterface68_2 != null) {
			this.anInterface68_2.method26332(this, 0, this.anInt5919 * 1851494523, true, (byte) 76);
		}
	}

	@OriginalMember(owner = "client!wp", name = "aw", descriptor = "()I")
	@Override
	public int method32746() {
		return this.anInt5919 * 1851494523;
	}

	@OriginalMember(owner = "client!wp", name = "h", descriptor = "()Lclient!rw;")
	@Override
	public Class539 method32723() {
		@Pc(5) Class539 local5 = new Class539(this.aClass146_5);
		local5.method30968(this, 1340705134);
		return local5;
	}

	@OriginalMember(owner = "client!wp", name = "aq", descriptor = "(I)Z")
	@Override
	public boolean method32742(@OriginalArg(0) int arg0) {
		return false;
	}

	@OriginalMember(owner = "client!wp", name = "g", descriptor = "()Lclient!rw;")
	@Override
	public Class539 method32725() {
		@Pc(5) Class539 local5 = new Class539(this.aClass146_5);
		local5.method30968(this, 1362272487);
		return local5;
	}

	@OriginalMember(owner = "client!wp", name = "i", descriptor = "()Lclient!rw;")
	@Override
	public Class539 method32726() {
		@Pc(5) Class539 local5 = new Class539(this.aClass146_5);
		local5.method30968(this, 1846192886);
		return local5;
	}

	@OriginalMember(owner = "client!wp", name = "t", descriptor = "(I)[B")
	@Override
	public byte[] method32727(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = arg0;
		if (arg0 == 0) {
			local1 = this.anInt5919 * 1851494523;
		}
		return this.aClass497_139.method30240(local1, (byte) 47);
	}

	@OriginalMember(owner = "client!wp", name = "ae", descriptor = "()I")
	@Override
	public int method32720() {
		return 0;
	}

	@OriginalMember(owner = "client!wp", name = "ag", descriptor = "()I")
	@Override
	public int method32729() {
		return 0;
	}

	@OriginalMember(owner = "client!wp", name = "ah", descriptor = "()Lclient!qk;")
	@Override
	public Class508 method32740() {
		return Class508.aClass508_6;
	}

	@OriginalMember(owner = "client!wp", name = "al", descriptor = "()Lclient!qk;")
	@Override
	public Class508 method32731() {
		return Class508.aClass508_6;
	}

	@OriginalMember(owner = "client!wp", name = "ac", descriptor = "()Lclient!qk;")
	@Override
	public Class508 method32730() {
		return Class508.aClass508_6;
	}

	@OriginalMember(owner = "client!wp", name = "d", descriptor = "(II)Lclient!alw;")
	@Override
	public Class93_Sub41 method32715(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!wp", name = "as", descriptor = "()I")
	@Override
	public int method32735() {
		return this.anInt5919 * 1851494523;
	}

	@OriginalMember(owner = "client!wp", name = "at", descriptor = "(Lclient!alw;)V")
	@Override
	public void method32736(@OriginalArg(0) Class93_Sub41 arg0) {
	}

	@OriginalMember(owner = "client!wp", name = "ad", descriptor = "(I)Lclient!alw;")
	@Override
	public Class93_Sub41 method32750(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!wp", name = "ax", descriptor = "(I)Z")
	@Override
	public boolean method32743(@OriginalArg(0) int arg0) {
		return false;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "()Lclient!rw;")
	@Override
	public Class539 method32724() {
		@Pc(5) Class539 local5 = new Class539(this.aClass146_5);
		local5.method30968(this, 2010119771);
		return local5;
	}

	@OriginalMember(owner = "client!wp", name = "ar", descriptor = "(I)Lclient!alw;")
	@Override
	public Class93_Sub41 method32709(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!wp", name = "an", descriptor = "()Z")
	@Override
	public boolean method32753() {
		return false;
	}

	@OriginalMember(owner = "client!wp", name = "k", descriptor = "(I)Z")
	@Override
	public boolean method32708(@OriginalArg(0) int arg0) {
		return true;
	}

	@OriginalMember(owner = "client!wp", name = "ap", descriptor = "(I)Z")
	@Override
	public boolean method32741(@OriginalArg(0) int arg0) {
		return false;
	}

	@OriginalMember(owner = "client!wp", name = "av", descriptor = "(I)Z")
	@Override
	public boolean method32744(@OriginalArg(0) int arg0) {
		return false;
	}

	@OriginalMember(owner = "client!wp", name = "ao", descriptor = "()Z")
	@Override
	public boolean method32745() {
		return false;
	}

	@OriginalMember(owner = "client!wp", name = "aj", descriptor = "()Z")
	@Override
	public boolean method32737() {
		return false;
	}

	@OriginalMember(owner = "client!wp", name = "ay", descriptor = "()I")
	@Override
	public int method32747() {
		return 0;
	}

	@OriginalMember(owner = "client!wp", name = "ab", descriptor = "()I")
	@Override
	public int method32706() {
		return 0;
	}

	@OriginalMember(owner = "client!wp", name = "az", descriptor = "()I")
	@Override
	public int method32761() {
		return 0;
	}

	@OriginalMember(owner = "client!wp", name = "aa", descriptor = "(Z)V")
	@Override
	public void method32760(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!wp", name = "au", descriptor = "(I)Lclient!alw;")
	@Override
	public Class93_Sub41 method32752(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!wp", name = "bx", descriptor = "()Z")
	@Override
	public boolean method32751() {
		return true;
	}

	@OriginalMember(owner = "client!wp", name = "l", descriptor = "(I)I")
	@Override
	public int method32711(@OriginalArg(0) int arg0) {
		return 0;
	}

	@OriginalMember(owner = "client!wp", name = "bl", descriptor = "()Z")
	@Override
	public boolean method32755() {
		return false;
	}

	@OriginalMember(owner = "client!wp", name = "bd", descriptor = "()Z")
	@Override
	public boolean method32713() {
		return true;
	}

	@OriginalMember(owner = "client!wp", name = "bh", descriptor = "()Z")
	@Override
	public boolean method32756() {
		return true;
	}

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "()V")
	@Override
	public void method32722() {
		if (Class639.aClass639_2 != this.aClass639_5) {
			return;
		}
		this.method32762(-1367056571);
		this.aClass639_5 = Class639.aClass639_3;
		if (this.anInterface68_2 != null) {
			this.anInterface68_2.method26332(this, 0, this.anInt5919 * 1851494523, true, (byte) 71);
		}
	}

	@OriginalMember(owner = "client!wp", name = "am", descriptor = "(I)Lclient!alw;")
	@Override
	public Class93_Sub41 method32738(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!wp", name = "ai", descriptor = "()I")
	@Override
	public int method32733() {
		return this.anInt5919 * 1851494523;
	}

	@OriginalMember(owner = "client!wp", name = "bc", descriptor = "()Lclient!wl;")
	@Override
	public Class639 method32759() {
		return this.aClass639_5;
	}

	@OriginalMember(owner = "client!wp", name = "bn", descriptor = "()Lclient!wl;")
	@Override
	public Class639 method32757() {
		return this.aClass639_5;
	}
}
