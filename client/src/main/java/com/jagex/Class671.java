package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xu")
public class Class671 {

	@OriginalMember(owner = "client!xu", name = "n", descriptor = "Lclient!dz;")
	static Class107 aClass107_1;

	@OriginalMember(owner = "client!xu", name = "m", descriptor = "Lclient!sv;")
	static Class562 aClass562_2;

	@OriginalMember(owner = "client!xu", name = "e", descriptor = "I")
	public static int anInt5859 = 1748294101;

	@OriginalMember(owner = "client!xu", name = "k", descriptor = "I")
	static int anInt5856 = 275040415;

	@OriginalMember(owner = "client!xu", name = "s", descriptor = "Lclient!yj;")
	Class684 aClass684_1;

	@OriginalMember(owner = "client!xu", name = "ah", descriptor = "F")
	float aFloat339;

	@OriginalMember(owner = "client!xu", name = "t", descriptor = "F")
	float aFloat340;

	@OriginalMember(owner = "client!xu", name = "o", descriptor = "Lclient!xv;")
	Class672 aClass672_4;

	@OriginalMember(owner = "client!xu", name = "ae", descriptor = "F")
	float aFloat341;

	@OriginalMember(owner = "client!xu", name = "ag", descriptor = "F")
	float aFloat342;

	@OriginalMember(owner = "client!xu", name = "al", descriptor = "F")
	float aFloat343;

	@OriginalMember(owner = "client!xu", name = "l", descriptor = "I")
	int anInt5857 = 0;

	@OriginalMember(owner = "client!xu", name = "u", descriptor = "I")
	int anInt5858 = -1162824399;

	@OriginalMember(owner = "client!xu", name = "z", descriptor = "J")
	long aLong304 = 0L;

	@OriginalMember(owner = "client!xu", name = "p", descriptor = "Z")
	boolean aBoolean866 = false;

	@OriginalMember(owner = "client!xu", name = "y", descriptor = "Lclient!ox;")
	final Class472 aClass472_64 = new Class472(-50.0F, -60.0F, -50.0F);

	@OriginalMember(owner = "client!xu", name = "q", descriptor = "Lclient!eb;")
	final Class240 aClass240_93 = new Class240(8);

	@OriginalMember(owner = "client!xu", name = "x", descriptor = "Lclient!eb;")
	final Class240 aClass240_94 = new Class240(8);

	@OriginalMember(owner = "client!xu", name = "b", descriptor = "Lclient!eb;")
	final Class240 aClass240_95 = new Class240(8);

	@OriginalMember(owner = "client!xu", name = "a", descriptor = "Z")
	boolean aBoolean867 = false;

	@OriginalMember(owner = "client!xu", name = "g", descriptor = "[I")
	int[] anIntArray514 = new int[] { -1, -1, -1 };

	@OriginalMember(owner = "client!xu", name = "i", descriptor = "[F")
	float[] aFloatArray120 = new float[] { 0.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!xu", name = "j", descriptor = "Z")
	boolean aBoolean868 = false;

	@OriginalMember(owner = "client!xu", name = "f", descriptor = "Lclient!dh;")
	final Class104 aClass104_13;

	@OriginalMember(owner = "client!xu", name = "h", descriptor = "Lclient!py;")
	final Class497 aClass497_140;

	@OriginalMember(owner = "client!xu", name = "w", descriptor = "[[Lclient!xv;")
	final Class672[][] aClass672ArrayArray1;

	@OriginalMember(owner = "client!xu", name = "d", descriptor = "Lclient!xv;")
	final Class672 aClass672_5;

	@OriginalMember(owner = "client!xu", name = "c", descriptor = "Lclient!xv;")
	final Class672 aClass672_1;

	@OriginalMember(owner = "client!xu", name = "r", descriptor = "Lclient!xv;")
	final Class672 aClass672_2;

	@OriginalMember(owner = "client!xu", name = "v", descriptor = "Lclient!xv;")
	final Class672 aClass672_3;

	@OriginalMember(owner = "client!xu", name = "<init>", descriptor = "(Lclient!dh;Lclient!py;II)V", line = 54)
	public Class671(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class497 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass104_13 = arg0;
		this.aClass497_140 = arg1;
		this.aClass672ArrayArray1 = new Class672[arg2][arg3];
		if (anInt5859 * 933128323 != -1) {
			aClass107_1 = this.method32985(anInt5859 * 933128323, 1519682227);
		}
		aClass562_2 = null;
		this.aClass672_5 = new Class672();
		this.aClass672_1 = new Class672();
		this.aClass672_2 = new Class672();
		this.aClass672_3 = new Class672();
		this.method33015(-2082959795);
		this.method33038(1378705770);
		this.method33032((byte) 86);
	}

	@OriginalMember(owner = "client!xu", name = "al", descriptor = "(Lclient!rl;)V", line = 70)
	public void method32961(@OriginalArg(0) Class532 arg0) {
		@Pc(4) Class672 local4 = this.method33009(arg0, -3659365);
		if (this.aClass684_1 == null) {
			this.method33010(local4, anInt5856 * -1834375703, 2146172716);
		} else {
			this.aClass672_4.method33051(local4, (byte) -24);
			this.aClass672_4.method33072(this, this.aClass684_1, 1795184873);
			this.method33010(this.aClass672_4, this.aClass684_1.method33420(1204992034), 2146172716);
		}
		this.method33013(1689635280);
		this.method33017(1902274160);
		this.method33021(28630617);
	}

	@OriginalMember(owner = "client!xu", name = "e", descriptor = "(Lclient!rl;B)V", line = 70)
	public void method32962(@OriginalArg(0) Class532 arg0, @OriginalArg(1) byte arg1) {
		@Pc(4) Class672 local4 = this.method33009(arg0, 838237152);
		if (this.aClass684_1 == null) {
			this.method33010(local4, anInt5856 * -1834375703, 2146172716);
		} else {
			this.aClass672_4.method33051(local4, (byte) 57);
			this.aClass672_4.method33072(this, this.aClass684_1, 1795184873);
			this.method33010(this.aClass672_4, this.aClass684_1.method33420(1274431884), 2146172716);
		}
		this.method33013(-199616452);
		this.method33017(-197090970);
		this.method33021(1413467815);
	}

	@OriginalMember(owner = "client!xu", name = "ae", descriptor = "(Lclient!rl;)V", line = 70)
	public void method32963(@OriginalArg(0) Class532 arg0) {
		@Pc(4) Class672 local4 = this.method33009(arg0, 727720267);
		if (this.aClass684_1 == null) {
			this.method33010(local4, anInt5856 * -1834375703, 2146172716);
		} else {
			this.aClass672_4.method33051(local4, (byte) 3);
			this.aClass672_4.method33072(this, this.aClass684_1, 1795184873);
			this.method33010(this.aClass672_4, this.aClass684_1.method33420(1414241571), 2146172716);
		}
		this.method33013(1169680442);
		this.method33017(104147);
		this.method33021(958851152);
	}

	@OriginalMember(owner = "client!xu", name = "ag", descriptor = "(Lclient!rl;)V", line = 70)
	public void method32964(@OriginalArg(0) Class532 arg0) {
		@Pc(4) Class672 local4 = this.method33009(arg0, -567998592);
		if (this.aClass684_1 == null) {
			this.method33010(local4, anInt5856 * -1834375703, 2146172716);
		} else {
			this.aClass672_4.method33051(local4, (byte) 60);
			this.aClass672_4.method33072(this, this.aClass684_1, 1795184873);
			this.method33010(this.aClass672_4, this.aClass684_1.method33420(-1171360745), 2146172716);
		}
		this.method33013(482247636);
		this.method33017(-2135758414);
		this.method33021(-885111609);
	}

	@OriginalMember(owner = "client!xu", name = "ah", descriptor = "(Lclient!rl;)V", line = 70)
	public void method32965(@OriginalArg(0) Class532 arg0) {
		@Pc(4) Class672 local4 = this.method33009(arg0, -1981936495);
		if (this.aClass684_1 == null) {
			this.method33010(local4, anInt5856 * -1834375703, 2146172716);
		} else {
			this.aClass672_4.method33051(local4, (byte) 48);
			this.aClass672_4.method33072(this, this.aClass684_1, 1795184873);
			this.method33010(this.aClass672_4, this.aClass684_1.method33420(1164572716), 2146172716);
		}
		this.method33013(-1126187412);
		this.method33017(1215882651);
		this.method33021(-865399071);
	}

	@OriginalMember(owner = "client!xu", name = "n", descriptor = "(Lclient!rl;B)V", line = 83)
	public void method32966(@OriginalArg(0) Class532 arg0, @OriginalArg(1) byte arg1) {
		@Pc(4) Class672 local4 = this.method33009(arg0, 1099924204);
		if (this.aClass684_1 == null) {
			this.method33010(local4, anInt5856 * -1834375703, 2146172716);
		} else {
			this.aClass672_4.method33051(local4, (byte) 14);
			this.aClass672_4.method33072(this, this.aClass684_1, 1795184873);
			this.method33010(this.aClass672_4, this.aClass684_1.method33420(1009613677), 2146172716);
		}
		this.method33013(1598372657);
		this.method33027(-799862065);
		this.method33028(-1930484933);
		this.method33036((byte) -71);
	}

	@OriginalMember(owner = "client!xu", name = "ac", descriptor = "(Lclient!rl;)V", line = 83)
	public void method32967(@OriginalArg(0) Class532 arg0) {
		@Pc(4) Class672 local4 = this.method33009(arg0, -1660041769);
		if (this.aClass684_1 == null) {
			this.method33010(local4, anInt5856 * -1834375703, 2146172716);
		} else {
			this.aClass672_4.method33051(local4, (byte) -13);
			this.aClass672_4.method33072(this, this.aClass684_1, 1795184873);
			this.method33010(this.aClass672_4, this.aClass684_1.method33420(-1490668367), 2146172716);
		}
		this.method33013(1840264631);
		this.method33027(-1308516055);
		this.method33028(-893392277);
		this.method33036((byte) 25);
	}

	@OriginalMember(owner = "client!xu", name = "y", descriptor = "(Lclient!yf;I)V", line = 92)
	static void method32968(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class272.method26309(-192563376);
	}

	@OriginalMember(owner = "client!xu", name = "m", descriptor = "(Lclient!rl;Lclient!yj;II)V", line = 97)
	public void method32969(@OriginalArg(0) Class532 arg0, @OriginalArg(1) Class684 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass684_1 = arg1;
		@Pc(7) Class672 local7 = this.method33009(arg0, -1634058228);
		if (this.aClass684_1 == null) {
			this.method33010(local7, arg2, 2146172716);
			this.aClass672_4 = null;
			return;
		}
		if (this.aClass672_4 == null) {
			this.aClass672_4 = new Class672();
		}
		this.aClass672_4.method33051(local7, (byte) -67);
		this.aClass672_4.method33072(this, this.aClass684_1, 1795184873);
		this.method33010(this.aClass672_4, arg2, 2146172716);
	}

	@OriginalMember(owner = "client!xu", name = "ai", descriptor = "(Lclient!rl;Lclient!yj;I)V", line = 97)
	public void method32970(@OriginalArg(0) Class532 arg0, @OriginalArg(1) Class684 arg1, @OriginalArg(2) int arg2) {
		this.aClass684_1 = arg1;
		@Pc(7) Class672 local7 = this.method33009(arg0, -704688771);
		if (this.aClass684_1 == null) {
			this.method33010(local7, arg2, 2146172716);
			this.aClass672_4 = null;
			return;
		}
		if (this.aClass672_4 == null) {
			this.aClass672_4 = new Class672();
		}
		this.aClass672_4.method33051(local7, (byte) -28);
		this.aClass672_4.method33072(this, this.aClass684_1, 1795184873);
		this.method33010(this.aClass672_4, arg2, 2146172716);
	}

	@OriginalMember(owner = "client!xu", name = "aw", descriptor = "(Lclient!rl;Lclient!yj;I)V", line = 97)
	public void method32971(@OriginalArg(0) Class532 arg0, @OriginalArg(1) Class684 arg1, @OriginalArg(2) int arg2) {
		this.aClass684_1 = arg1;
		@Pc(7) Class672 local7 = this.method33009(arg0, -758829604);
		if (this.aClass684_1 == null) {
			this.method33010(local7, arg2, 2146172716);
			this.aClass672_4 = null;
			return;
		}
		if (this.aClass672_4 == null) {
			this.aClass672_4 = new Class672();
		}
		this.aClass672_4.method33051(local7, (byte) -1);
		this.aClass672_4.method33072(this, this.aClass684_1, 1795184873);
		this.method33010(this.aClass672_4, arg2, 2146172716);
	}

	@OriginalMember(owner = "client!xu", name = "k", descriptor = "(I)Lclient!yj;", line = 112)
	public Class684 method32972(@OriginalArg(0) int arg0) {
		return this.aClass684_1;
	}

	@OriginalMember(owner = "client!xu", name = "as", descriptor = "()Lclient!yj;", line = 112)
	public Class684 method32973() {
		return this.aClass684_1;
	}

	@OriginalMember(owner = "client!xu", name = "at", descriptor = "()Lclient!yj;", line = 112)
	public Class684 method32974() {
		return this.aClass684_1;
	}

	@OriginalMember(owner = "client!xu", name = "ad", descriptor = "()Lclient!yj;", line = 112)
	public Class684 method32975() {
		return this.aClass684_1;
	}

	@OriginalMember(owner = "client!xu", name = "f", descriptor = "(I)Lclient!xv;", line = 116)
	public Class672 method32976(@OriginalArg(0) int arg0) {
		return this.aClass672_1;
	}

	@OriginalMember(owner = "client!xu", name = "am", descriptor = "()Lclient!xv;", line = 116)
	public Class672 method32977() {
		return this.aClass672_1;
	}

	@OriginalMember(owner = "client!xu", name = "ar", descriptor = "()Lclient!xv;", line = 116)
	public Class672 method32978() {
		return this.aClass672_1;
	}

	@OriginalMember(owner = "client!xu", name = "au", descriptor = "()Lclient!xv;", line = 116)
	public Class672 method32979() {
		return this.aClass672_1;
	}

	@OriginalMember(owner = "client!xu", name = "w", descriptor = "(Lclient!xu;I)V", line = 120)
	public void method32980(@OriginalArg(0) Class671 arg0, @OriginalArg(1) int arg1) {
		this.aClass672_1.method33051(arg0.aClass672_1, (byte) 78);
		this.aClass672_2.method33051(arg0.aClass672_2, (byte) 90);
		this.aClass672_3.method33051(arg0.aClass672_3, (byte) -40);
		this.aLong304 = arg0.aLong304;
		this.anInt5857 = arg0.anInt5857;
		this.anInt5858 = arg0.anInt5858;
	}

	@OriginalMember(owner = "client!xu", name = "ap", descriptor = "(Lclient!xu;)V", line = 120)
	public void method32981(@OriginalArg(0) Class671 arg0) {
		this.aClass672_1.method33051(arg0.aClass672_1, (byte) -2);
		this.aClass672_2.method33051(arg0.aClass672_2, (byte) -47);
		this.aClass672_3.method33051(arg0.aClass672_3, (byte) -46);
		this.aLong304 = arg0.aLong304;
		this.anInt5857 = arg0.anInt5857;
		this.anInt5858 = arg0.anInt5858;
	}

	@OriginalMember(owner = "client!xu", name = "l", descriptor = "(I)V", line = 129)
	public void method32982(@OriginalArg(0) int arg0) {
		this.aClass240_93.method25847((byte) 0);
		this.aClass240_94.method25847((byte) -48);
		this.aClass240_95.method25847((byte) -109);
	}

	@OriginalMember(owner = "client!xu", name = "aq", descriptor = "()V", line = 129)
	public void method32983() {
		this.aClass240_93.method25847((byte) -49);
		this.aClass240_94.method25847((byte) -80);
		this.aClass240_95.method25847((byte) -2);
	}

	@OriginalMember(owner = "client!xu", name = "ax", descriptor = "()V", line = 129)
	public void method32984() {
		this.aClass240_93.method25847((byte) -27);
		this.aClass240_94.method25847((byte) -127);
		this.aClass240_95.method25847((byte) -86);
	}

	@OriginalMember(owner = "client!xu", name = "u", descriptor = "(II)Lclient!dz;", line = 135)
	Class107 method32985(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class107 local6 = (Class107) this.aClass240_93.method25829((long) arg0);
		if (local6 == null) {
			local6 = this.aClass104_13.method20612(arg0);
			this.aClass240_93.method25838(local6, (long) arg0);
			return local6;
		} else {
			return local6;
		}
	}

	@OriginalMember(owner = "client!xu", name = "av", descriptor = "(I)Lclient!dz;", line = 135)
	Class107 method32986(@OriginalArg(0) int arg0) {
		@Pc(6) Class107 local6 = (Class107) this.aClass240_93.method25829((long) arg0);
		if (local6 == null) {
			local6 = this.aClass104_13.method20612(arg0);
			this.aClass240_93.method25838(local6, (long) arg0);
			return local6;
		} else {
			return local6;
		}
	}

	@OriginalMember(owner = "client!xu", name = "ao", descriptor = "(I)Lclient!dz;", line = 135)
	Class107 method32987(@OriginalArg(0) int arg0) {
		@Pc(6) Class107 local6 = (Class107) this.aClass240_93.method25829((long) arg0);
		if (local6 == null) {
			local6 = this.aClass104_13.method20612(arg0);
			this.aClass240_93.method25838(local6, (long) arg0);
			return local6;
		} else {
			return local6;
		}
	}

	@OriginalMember(owner = "client!xu", name = "z", descriptor = "(IIIII)Lclient!sv;", line = 143)
	Class562 method32988(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(25) long local25 = ((long) arg1 & 0xFFFFL) << 48 | ((long) arg2 & 0xFFFFL) << 32 | ((long) arg3 & 0xFFFFL) << 16 | (long) arg0 & 0xFFFFL;
		@Pc(31) Class562 local31 = (Class562) this.aClass240_94.method25829(local25);
		if (local31 == null) {
			local31 = Class220.method25543(arg0, arg1, arg2, arg3, Class123.aClass32_Sub11_2, Class51.aClass32_Sub9_1, 212851357);
			this.aClass240_94.method25838(local31, local25);
		}
		return local31;
	}

	@OriginalMember(owner = "client!xu", name = "p", descriptor = "(IB)Lclient!cj;", line = 153)
	Class102 method32989(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(6) Class102 local6 = (Class102) this.aClass240_95.method25829((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(16) Class105 local16 = Class203.method24653(this.aClass497_140, arg0);
		if (local16 != null && local16.method7206() == 256 && local16.method7198() == 16) {
			@Pc(30) int[] local30 = local16.method7171(false);
			local6 = this.aClass104_13.method20618(local30);
			if (local6 != null) {
				this.aClass240_95.method25838(local6, (long) arg0);
			}
		}
		return local6;
	}

	@OriginalMember(owner = "client!xu", name = "ay", descriptor = "(I)Lclient!cj;", line = 153)
	Class102 method32990(@OriginalArg(0) int arg0) {
		@Pc(6) Class102 local6 = (Class102) this.aClass240_95.method25829((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(16) Class105 local16 = Class203.method24653(this.aClass497_140, arg0);
		if (local16 != null && local16.method7206() == 256 && local16.method7198() == 16) {
			@Pc(30) int[] local30 = local16.method7171(false);
			local6 = this.aClass104_13.method20618(local30);
			if (local6 != null) {
				this.aClass240_95.method25838(local6, (long) arg0);
			}
		}
		return local6;
	}

	@OriginalMember(owner = "client!xu", name = "aj", descriptor = "(I)Lclient!cj;", line = 153)
	Class102 method32991(@OriginalArg(0) int arg0) {
		@Pc(6) Class102 local6 = (Class102) this.aClass240_95.method25829((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(16) Class105 local16 = Class203.method24653(this.aClass497_140, arg0);
		if (local16 != null && local16.method7206() == 256 && local16.method7198() == 16) {
			@Pc(30) int[] local30 = local16.method7171(false);
			local6 = this.aClass104_13.method20618(local30);
			if (local6 != null) {
				this.aClass240_95.method25838(local6, (long) arg0);
			}
		}
		return local6;
	}

	@OriginalMember(owner = "client!xu", name = "ab", descriptor = "(IILclient!xv;)V", line = 172)
	public void method32992(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class672 arg2) {
		this.aClass672ArrayArray1[arg0][arg1] = arg2;
	}

	@OriginalMember(owner = "client!xu", name = "d", descriptor = "(IILclient!xv;I)V", line = 172)
	public void method32993(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class672 arg2, @OriginalArg(3) int arg3) {
		this.aClass672ArrayArray1[arg0][arg1] = arg2;
	}

	@OriginalMember(owner = "client!xu", name = "az", descriptor = "(IILclient!xv;)V", line = 172)
	public void method32994(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class672 arg2) {
		this.aClass672ArrayArray1[arg0][arg1] = arg2;
	}

	@OriginalMember(owner = "client!xu", name = "aa", descriptor = "(IILclient!xv;)V", line = 172)
	public void method32995(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class672 arg2) {
		this.aClass672ArrayArray1[arg0][arg1] = arg2;
	}

	@OriginalMember(owner = "client!xu", name = "c", descriptor = "(B)V", line = 176)
	public void method32996(@OriginalArg(0) byte arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass672ArrayArray1.length; local1++) {
			for (@Pc(8) int local8 = 0; local8 < this.aClass672ArrayArray1[local1].length; local8++) {
				this.aClass672ArrayArray1[local1][local8] = this.aClass672_5;
			}
		}
	}

	@OriginalMember(owner = "client!xu", name = "af", descriptor = "()V", line = 176)
	public void method32997() {
		for (@Pc(1) int local1 = 0; local1 < this.aClass672ArrayArray1.length; local1++) {
			for (@Pc(8) int local8 = 0; local8 < this.aClass672ArrayArray1[local1].length; local8++) {
				this.aClass672ArrayArray1[local1][local8] = this.aClass672_5;
			}
		}
	}

	@OriginalMember(owner = "client!xu", name = "ak", descriptor = "()V", line = 176)
	public void method32998() {
		for (@Pc(1) int local1 = 0; local1 < this.aClass672ArrayArray1.length; local1++) {
			for (@Pc(8) int local8 = 0; local8 < this.aClass672ArrayArray1[local1].length; local8++) {
				this.aClass672ArrayArray1[local1][local8] = this.aClass672_5;
			}
		}
	}

	@OriginalMember(owner = "client!xu", name = "an", descriptor = "()V", line = 176)
	public void method32999() {
		for (@Pc(1) int local1 = 0; local1 < this.aClass672ArrayArray1.length; local1++) {
			for (@Pc(8) int local8 = 0; local8 < this.aClass672ArrayArray1[local1].length; local8++) {
				this.aClass672ArrayArray1[local1][local8] = this.aClass672_5;
			}
		}
	}

	@OriginalMember(owner = "client!xu", name = "r", descriptor = "(III)V", line = 184)
	public void method33000(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class672 local6 = this.aClass672ArrayArray1[arg0][arg1];
		if (local6 != null) {
			this.aClass472_64.method29550(local6.aClass472_65);
		}
		this.method33017(1194687224);
	}

	@OriginalMember(owner = "client!xu", name = "bf", descriptor = "(II)V", line = 184)
	public void method33001(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class672 local6 = this.aClass672ArrayArray1[arg0][arg1];
		if (local6 != null) {
			this.aClass472_64.method29550(local6.aClass472_65);
		}
		this.method33017(1538329310);
	}

	@OriginalMember(owner = "client!xu", name = "bl", descriptor = "(II)V", line = 184)
	public void method33002(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class672 local6 = this.aClass672ArrayArray1[arg0][arg1];
		if (local6 != null) {
			this.aClass472_64.method29550(local6.aClass472_65);
		}
		this.method33017(489853180);
	}

	@OriginalMember(owner = "client!xu", name = "bk", descriptor = "(II)V", line = 184)
	public void method33003(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class672 local6 = this.aClass672ArrayArray1[arg0][arg1];
		if (local6 != null) {
			this.aClass472_64.method29550(local6.aClass472_65);
		}
		this.method33017(-88771964);
	}

	@OriginalMember(owner = "client!xu", name = "bh", descriptor = "(Lclient!rl;)Lclient!xv;", line = 190)
	Class672 method33004(@OriginalArg(0) Class532 arg0) {
		@Pc(1) Class672 local1 = null;
		@Pc(3) int local3 = -1;
		@Pc(5) int local5 = -1;
		if (Class1.method12(client.anInt3435 * -849002901, -1212653237) || Class56.method18036(client.anInt3435 * -849002901, -1497248091)) {
			local3 = Class163.anInt2002 * -1331168249 >> 12;
			local5 = Class270.anInt3884 * 466086187 >> 12;
		} else {
			if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 != null) {
				local3 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anIntArray240[0] >> 3;
				local5 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anIntArray239[0] >> 3;
			}
			if (local3 < 0 || local3 >= arg0.method30459(-485462668) >> 3 || local5 < 0 || local5 >= arg0.method30466((short) 128) >> 3) {
				local3 = arg0.method30459(-295129019) >> 4;
				local5 = arg0.method30466((short) 128) >> 4;
			}
		}
		local1 = this.aClass672ArrayArray1[local3][local5];
		if (local1 == null) {
			local1 = this.aClass672_5;
		}
		return local1;
	}

	@OriginalMember(owner = "client!xu", name = "bx", descriptor = "(Lclient!rl;)Lclient!xv;", line = 190)
	Class672 method33005(@OriginalArg(0) Class532 arg0) {
		@Pc(1) Class672 local1 = null;
		@Pc(3) int local3 = -1;
		@Pc(5) int local5 = -1;
		if (Class1.method12(client.anInt3435 * -849002901, 992364855) || Class56.method18036(client.anInt3435 * -849002901, -1497248091)) {
			local3 = Class163.anInt2002 * -1331168249 >> 12;
			local5 = Class270.anInt3884 * 466086187 >> 12;
		} else {
			if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 != null) {
				local3 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anIntArray240[0] >> 3;
				local5 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anIntArray239[0] >> 3;
			}
			if (local3 < 0 || local3 >= arg0.method30459(1771391415) >> 3 || local5 < 0 || local5 >= arg0.method30466((short) 128) >> 3) {
				local3 = arg0.method30459(-559947505) >> 4;
				local5 = arg0.method30466((short) 128) >> 4;
			}
		}
		local1 = this.aClass672ArrayArray1[local3][local5];
		if (local1 == null) {
			local1 = this.aClass672_5;
		}
		return local1;
	}

	@OriginalMember(owner = "client!xu", name = "bd", descriptor = "(Lclient!rl;)Lclient!xv;", line = 190)
	Class672 method33006(@OriginalArg(0) Class532 arg0) {
		@Pc(1) Class672 local1 = null;
		@Pc(3) int local3 = -1;
		@Pc(5) int local5 = -1;
		if (Class1.method12(client.anInt3435 * -849002901, -341826344) || Class56.method18036(client.anInt3435 * -849002901, -1497248091)) {
			local3 = Class163.anInt2002 * -1331168249 >> 12;
			local5 = Class270.anInt3884 * 466086187 >> 12;
		} else {
			if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 != null) {
				local3 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anIntArray240[0] >> 3;
				local5 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anIntArray239[0] >> 3;
			}
			if (local3 < 0 || local3 >= arg0.method30459(-576694170) >> 3 || local5 < 0 || local5 >= arg0.method30466((short) 128) >> 3) {
				local3 = arg0.method30459(684151797) >> 4;
				local5 = arg0.method30466((short) 128) >> 4;
			}
		}
		local1 = this.aClass672ArrayArray1[local3][local5];
		if (local1 == null) {
			local1 = this.aClass672_5;
		}
		return local1;
	}

	@OriginalMember(owner = "client!xu", name = "bc", descriptor = "(Lclient!rl;)Lclient!xv;", line = 190)
	Class672 method33007(@OriginalArg(0) Class532 arg0) {
		@Pc(1) Class672 local1 = null;
		@Pc(3) int local3 = -1;
		@Pc(5) int local5 = -1;
		if (Class1.method12(client.anInt3435 * -849002901, -98792332) || Class56.method18036(client.anInt3435 * -849002901, -1497248091)) {
			local3 = Class163.anInt2002 * -1331168249 >> 12;
			local5 = Class270.anInt3884 * 466086187 >> 12;
		} else {
			if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 != null) {
				local3 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anIntArray240[0] >> 3;
				local5 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anIntArray239[0] >> 3;
			}
			if (local3 < 0 || local3 >= arg0.method30459(99088898) >> 3 || local5 < 0 || local5 >= arg0.method30466((short) 128) >> 3) {
				local3 = arg0.method30459(48735057) >> 4;
				local5 = arg0.method30466((short) 128) >> 4;
			}
		}
		local1 = this.aClass672ArrayArray1[local3][local5];
		if (local1 == null) {
			local1 = this.aClass672_5;
		}
		return local1;
	}

	@OriginalMember(owner = "client!xu", name = "bi", descriptor = "(Lclient!rl;)Lclient!xv;", line = 190)
	Class672 method33008(@OriginalArg(0) Class532 arg0) {
		@Pc(1) Class672 local1 = null;
		@Pc(3) int local3 = -1;
		@Pc(5) int local5 = -1;
		if (Class1.method12(client.anInt3435 * -849002901, 461592936) || Class56.method18036(client.anInt3435 * -849002901, -1497248091)) {
			local3 = Class163.anInt2002 * -1331168249 >> 12;
			local5 = Class270.anInt3884 * 466086187 >> 12;
		} else {
			if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 != null) {
				local3 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anIntArray240[0] >> 3;
				local5 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anIntArray239[0] >> 3;
			}
			if (local3 < 0 || local3 >= arg0.method30459(1264651395) >> 3 || local5 < 0 || local5 >= arg0.method30466((short) 128) >> 3) {
				local3 = arg0.method30459(-1057908191) >> 4;
				local5 = arg0.method30466((short) 128) >> 4;
			}
		}
		local1 = this.aClass672ArrayArray1[local3][local5];
		if (local1 == null) {
			local1 = this.aClass672_5;
		}
		return local1;
	}

	@OriginalMember(owner = "client!xu", name = "v", descriptor = "(Lclient!rl;I)Lclient!xv;", line = 190)
	Class672 method33009(@OriginalArg(0) Class532 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) Class672 local1 = null;
		@Pc(3) int local3 = -1;
		@Pc(5) int local5 = -1;
		if (Class1.method12(client.anInt3435 * -849002901, 494650525) || Class56.method18036(client.anInt3435 * -849002901, -1497248091)) {
			local3 = Class163.anInt2002 * -1331168249 >> 12;
			local5 = Class270.anInt3884 * 466086187 >> 12;
		} else {
			if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 != null) {
				local3 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anIntArray240[0] >> 3;
				local5 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anIntArray239[0] >> 3;
			}
			if (local3 < 0 || local3 >= arg0.method30459(-797578492) >> 3 || local5 < 0 || local5 >= arg0.method30466((short) 128) >> 3) {
				local3 = arg0.method30459(-1767243829) >> 4;
				local5 = arg0.method30466((short) 128) >> 4;
			}
		}
		local1 = this.aClass672ArrayArray1[local3][local5];
		if (local1 == null) {
			local1 = this.aClass672_5;
		}
		return local1;
	}

	@OriginalMember(owner = "client!xu", name = "o", descriptor = "(Lclient!xv;II)V", line = 213)
	void method33010(@OriginalArg(0) Class672 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean866) {
			this.aBoolean866 = false;
			arg1 = 0;
		}
		if (this.aClass672_3.method33069(arg0, 60034890)) {
			return;
		}
		this.aClass672_3.method33051(arg0, (byte) 30);
		this.aLong304 = Class305.method26797(1773033538) * 3202058925841662635L;
		this.anInt5857 = (this.anInt5858 = arg1 * 1162824399) * 1573029247;
		if (this.anInt5857 * -4832943 == 0) {
			return;
		}
		this.aClass672_2.method33051(this.aClass672_1, (byte) 1);
		if (this.aClass672_1.aClass562_3 == null) {
			return;
		}
		if (this.aClass672_1.aClass562_3.method31167((byte) 39)) {
			this.aClass672_1.aClass562_3 = this.aClass672_2.aClass562_3 = this.aClass672_1.aClass562_3.method31169(-1722669835);
		}
		if (this.aClass672_1.aClass562_3 != null && this.aClass672_3.aClass562_3 != this.aClass672_1.aClass562_3) {
			this.aClass672_1.aClass562_3.method31161(this.aClass672_3.aClass562_3, 1867099837);
		}
	}

	@OriginalMember(owner = "client!xu", name = "bt", descriptor = "(Lclient!xv;I)V", line = 213)
	void method33011(@OriginalArg(0) Class672 arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean866) {
			this.aBoolean866 = false;
			arg1 = 0;
		}
		if (this.aClass672_3.method33069(arg0, 214172442)) {
			return;
		}
		this.aClass672_3.method33051(arg0, (byte) 16);
		this.aLong304 = Class305.method26797(1459124914) * 3202058925841662635L;
		this.anInt5857 = (this.anInt5858 = arg1 * 1162824399) * 1573029247;
		if (this.anInt5857 * -4832943 == 0) {
			return;
		}
		this.aClass672_2.method33051(this.aClass672_1, (byte) -30);
		if (this.aClass672_1.aClass562_3 == null) {
			return;
		}
		if (this.aClass672_1.aClass562_3.method31167((byte) -115)) {
			this.aClass672_1.aClass562_3 = this.aClass672_2.aClass562_3 = this.aClass672_1.aClass562_3.method31169(-1094091058);
		}
		if (this.aClass672_1.aClass562_3 != null && this.aClass672_3.aClass562_3 != this.aClass672_1.aClass562_3) {
			this.aClass672_1.aClass562_3.method31161(this.aClass672_3.aClass562_3, 1571712364);
		}
	}

	@OriginalMember(owner = "client!xu", name = "bn", descriptor = "(Lclient!xv;I)V", line = 213)
	void method33012(@OriginalArg(0) Class672 arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean866) {
			this.aBoolean866 = false;
			arg1 = 0;
		}
		if (this.aClass672_3.method33069(arg0, 2120079549)) {
			return;
		}
		this.aClass672_3.method33051(arg0, (byte) -94);
		this.aLong304 = Class305.method26797(1280896867) * 3202058925841662635L;
		this.anInt5857 = (this.anInt5858 = arg1 * 1162824399) * 1573029247;
		if (this.anInt5857 * -4832943 == 0) {
			return;
		}
		this.aClass672_2.method33051(this.aClass672_1, (byte) 55);
		if (this.aClass672_1.aClass562_3 == null) {
			return;
		}
		if (this.aClass672_1.aClass562_3.method31167((byte) 0)) {
			this.aClass672_1.aClass562_3 = this.aClass672_2.aClass562_3 = this.aClass672_1.aClass562_3.method31169(1028605865);
		}
		if (this.aClass672_1.aClass562_3 != null && this.aClass672_3.aClass562_3 != this.aClass672_1.aClass562_3) {
			this.aClass672_1.aClass562_3.method31161(this.aClass672_3.aClass562_3, 2009070702);
		}
	}

	@OriginalMember(owner = "client!xu", name = "s", descriptor = "(I)V", line = 236)
	void method33013(@OriginalArg(0) int arg0) {
		if (this.anInt5858 * 2008775727 < 0) {
			return;
		}
		@Pc(7) long local7 = Class305.method26797(585591057);
		this.anInt5858 = (int) ((long) this.anInt5858 - (local7 - this.aLong304 * 5957186404395821059L) * 1162824399L);
		if (this.anInt5858 * 2008775727 > 0) {
			this.aClass672_1.method33057(this.aClass104_13, this.aClass672_2, this.aClass672_3, (float) (this.anInt5857 * -4832943 - this.anInt5858 * 2008775727) / (float) (this.anInt5857 * -4832943), 2130343103);
		} else {
			this.aClass672_1.method33051(this.aClass672_3, (byte) 83);
			if (this.aClass672_1.aClass562_3 != null) {
				this.aClass672_1.aClass562_3.method31163(1796102726);
			}
			this.anInt5858 = -1162824399;
		}
		this.aLong304 = local7 * 3202058925841662635L;
	}

	@OriginalMember(owner = "client!xu", name = "bq", descriptor = "()V", line = 236)
	void method33014() {
		if (this.anInt5858 * 2008775727 < 0) {
			return;
		}
		@Pc(7) long local7 = Class305.method26797(-130808910);
		this.anInt5858 = (int) ((long) this.anInt5858 - (local7 - this.aLong304 * 5957186404395821059L) * 1162824399L);
		if (this.anInt5858 * 2008775727 > 0) {
			this.aClass672_1.method33057(this.aClass104_13, this.aClass672_2, this.aClass672_3, (float) (this.anInt5857 * -4832943 - this.anInt5858 * 2008775727) / (float) (this.anInt5857 * -4832943), 1672591171);
		} else {
			this.aClass672_1.method33051(this.aClass672_3, (byte) -66);
			if (this.aClass672_1.aClass562_3 != null) {
				this.aClass672_1.aClass562_3.method31163(1958909974);
			}
			this.anInt5858 = -1162824399;
		}
		this.aLong304 = local7 * 3202058925841662635L;
	}

	@OriginalMember(owner = "client!xu", name = "y", descriptor = "(I)V", line = 252)
	public void method33015(@OriginalArg(0) int arg0) {
		this.aBoolean866 = true;
	}

	@OriginalMember(owner = "client!xu", name = "bm", descriptor = "()V", line = 256)
	void method33016() {
		this.aClass104_13.method20606(((float) Class51.aClass93_Sub36_1.aClass166_Sub7_1.method15506((byte) -25) * 0.1F + 0.7F + client.aClass532_1.method30471(-1772387017)) * this.aClass672_1.aFloat349);
		this.aClass104_13.method20607(this.aClass672_1.anInt5862 * 1540075243, this.aClass672_1.aFloat344, this.aClass672_1.aFloat346, (float) ((int) this.aClass472_64.aFloat317 << 2), (float) ((int) this.aClass472_64.aFloat318 << 2), (float) ((int) this.aClass472_64.aFloat319 << 2));
		this.aClass104_13.method20860(this.aClass672_1.aClass107_2);
	}

	@OriginalMember(owner = "client!xu", name = "q", descriptor = "(I)V", line = 256)
	void method33017(@OriginalArg(0) int arg0) {
		this.aClass104_13.method20606(((float) Class51.aClass93_Sub36_1.aClass166_Sub7_1.method15506((byte) -49) * 0.1F + 0.7F + client.aClass532_1.method30471(-676345909)) * this.aClass672_1.aFloat349);
		this.aClass104_13.method20607(this.aClass672_1.anInt5862 * 1540075243, this.aClass672_1.aFloat344, this.aClass672_1.aFloat346, (float) ((int) this.aClass472_64.aFloat317 << 2), (float) ((int) this.aClass472_64.aFloat318 << 2), (float) ((int) this.aClass472_64.aFloat319 << 2));
		this.aClass104_13.method20860(this.aClass672_1.aClass107_2);
	}

	@OriginalMember(owner = "client!xu", name = "bb", descriptor = "()V", line = 256)
	void method33018() {
		this.aClass104_13.method20606(((float) Class51.aClass93_Sub36_1.aClass166_Sub7_1.method15506((byte) -106) * 0.1F + 0.7F + client.aClass532_1.method30471(-1764688948)) * this.aClass672_1.aFloat349);
		this.aClass104_13.method20607(this.aClass672_1.anInt5862 * 1540075243, this.aClass672_1.aFloat344, this.aClass672_1.aFloat346, (float) ((int) this.aClass472_64.aFloat317 << 2), (float) ((int) this.aClass472_64.aFloat318 << 2), (float) ((int) this.aClass472_64.aFloat319 << 2));
		this.aClass104_13.method20860(this.aClass672_1.aClass107_2);
	}

	@OriginalMember(owner = "client!xu", name = "x", descriptor = "(FFFIIIIII)V", line = 262)
	public void method33019(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.aClass104_13.method20606(((float) Class51.aClass93_Sub36_1.aClass166_Sub7_1.method15506((byte) -34) * 0.1F + 0.7F + client.aClass532_1.method30471(-374350000)) * arg0);
		this.aClass104_13.method20607(arg3, arg1, arg2, (float) (arg4 << 2), (float) (arg5 << 2), (float) (arg6 << 2));
		this.aClass104_13.method20860(this.method32985(arg7, 1094578849));
	}

	@OriginalMember(owner = "client!xu", name = "be", descriptor = "(FFFIIIII)V", line = 262)
	public void method33020(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass104_13.method20606(((float) Class51.aClass93_Sub36_1.aClass166_Sub7_1.method15506((byte) -66) * 0.1F + 0.7F + client.aClass532_1.method30471(365784513)) * arg0);
		this.aClass104_13.method20607(arg3, arg1, arg2, (float) (arg4 << 2), (float) (arg5 << 2), (float) (arg6 << 2));
		this.aClass104_13.method20860(this.method32985(arg7, 2126752395));
	}

	@OriginalMember(owner = "client!xu", name = "b", descriptor = "(I)V", line = 268)
	public void method33021(@OriginalArg(0) int arg0) {
		@Pc(1) byte local1 = 0;
		@Pc(13) int local13 = (this.aClass672_1.anInt5861 * -2139322713 + 256 << 2) + local1;
		this.aClass104_13.method20878(this.aClass672_1.anInt5860 * -2016142599, Class51.aClass93_Sub36_1.aClass166_Sub2_1.method15381(-1722659830) == 1 ? local13 : -1, 0);
	}

	@OriginalMember(owner = "client!xu", name = "by", descriptor = "()V", line = 268)
	public void method33022() {
		@Pc(1) byte local1 = 0;
		@Pc(13) int local13 = (this.aClass672_1.anInt5861 * -2139322713 + 256 << 2) + local1;
		this.aClass104_13.method20878(this.aClass672_1.anInt5860 * -2016142599, Class51.aClass93_Sub36_1.aClass166_Sub2_1.method15381(-1522894148) == 1 ? local13 : -1, 0);
	}

	@OriginalMember(owner = "client!xu", name = "bw", descriptor = "()V", line = 274)
	void method33023() {
		this.aClass104_13.method20509(this.aClass672_1.aFloat352, this.aClass672_1.aFloat345, this.aClass672_1.aFloat348, -1786220465);
	}

	@OriginalMember(owner = "client!xu", name = "bu", descriptor = "()V", line = 274)
	void method33024() {
		this.aClass104_13.method20509(this.aClass672_1.aFloat352, this.aClass672_1.aFloat345, this.aClass672_1.aFloat348, -1956409172);
	}

	@OriginalMember(owner = "client!xu", name = "bz", descriptor = "()V", line = 274)
	void method33025() {
		this.aClass104_13.method20509(this.aClass672_1.aFloat352, this.aClass672_1.aFloat345, this.aClass672_1.aFloat348, 1422197806);
	}

	@OriginalMember(owner = "client!xu", name = "bo", descriptor = "()V", line = 274)
	void method33026() {
		this.aClass104_13.method20509(this.aClass672_1.aFloat352, this.aClass672_1.aFloat345, this.aClass672_1.aFloat348, 1505562315);
	}

	@OriginalMember(owner = "client!xu", name = "h", descriptor = "(I)V", line = 274)
	void method33027(@OriginalArg(0) int arg0) {
		this.aClass104_13.method20509(this.aClass672_1.aFloat352, this.aClass672_1.aFloat345, this.aClass672_1.aFloat348, 1068596690);
	}

	@OriginalMember(owner = "client!xu", name = "a", descriptor = "(I)V", line = 278)
	void method33028(@OriginalArg(0) int arg0) {
		if (!this.aClass104_13.method20554()) {
			return;
		}
		if (this.aBoolean868) {
			this.aClass104_13.method20617(this.aFloat340, this.aFloat341, this.aFloat342, this.aFloat339, this.aFloat343);
		} else {
			this.aClass104_13.method20617(this.aClass672_1.aFloat351, this.aClass672_1.aFloat347, this.aClass672_1.aFloat353, this.aClass672_1.aFloat354, this.aClass672_1.aFloat350);
		}
	}

	@OriginalMember(owner = "client!xu", name = "br", descriptor = "()V", line = 278)
	void method33029() {
		if (!this.aClass104_13.method20554()) {
			return;
		}
		if (this.aBoolean868) {
			this.aClass104_13.method20617(this.aFloat340, this.aFloat341, this.aFloat342, this.aFloat339, this.aFloat343);
		} else {
			this.aClass104_13.method20617(this.aClass672_1.aFloat351, this.aClass672_1.aFloat347, this.aClass672_1.aFloat353, this.aClass672_1.aFloat354, this.aClass672_1.aFloat350);
		}
	}

	@OriginalMember(owner = "client!xu", name = "bv", descriptor = "()V", line = 278)
	void method33030() {
		if (!this.aClass104_13.method20554()) {
			return;
		}
		if (this.aBoolean868) {
			this.aClass104_13.method20617(this.aFloat340, this.aFloat341, this.aFloat342, this.aFloat339, this.aFloat343);
		} else {
			this.aClass104_13.method20617(this.aClass672_1.aFloat351, this.aClass672_1.aFloat347, this.aClass672_1.aFloat353, this.aClass672_1.aFloat354, this.aClass672_1.aFloat350);
		}
	}

	@OriginalMember(owner = "client!xu", name = "bg", descriptor = "()V", line = 284)
	void method33031() {
		this.aBoolean868 = false;
		this.aFloat340 = 1.0F;
		this.aFloat341 = 0.0F;
		this.aFloat342 = 1.0F;
		this.aFloat339 = 0.0F;
		this.aFloat343 = 1.0F;
	}

	@OriginalMember(owner = "client!xu", name = "g", descriptor = "(B)V", line = 284)
	void method33032(@OriginalArg(0) byte arg0) {
		this.aBoolean868 = false;
		this.aFloat340 = 1.0F;
		this.aFloat341 = 0.0F;
		this.aFloat342 = 1.0F;
		this.aFloat339 = 0.0F;
		this.aFloat343 = 1.0F;
	}

	@OriginalMember(owner = "client!xu", name = "ba", descriptor = "()V", line = 284)
	void method33033() {
		this.aBoolean868 = false;
		this.aFloat340 = 1.0F;
		this.aFloat341 = 0.0F;
		this.aFloat342 = 1.0F;
		this.aFloat339 = 0.0F;
		this.aFloat343 = 1.0F;
	}

	@OriginalMember(owner = "client!xu", name = "bp", descriptor = "()V", line = 284)
	void method33034() {
		this.aBoolean868 = false;
		this.aFloat340 = 1.0F;
		this.aFloat341 = 0.0F;
		this.aFloat342 = 1.0F;
		this.aFloat339 = 0.0F;
		this.aFloat343 = 1.0F;
	}

	@OriginalMember(owner = "client!xu", name = "bs", descriptor = "()V", line = 293)
	void method33035() {
		if (!this.aClass104_13.method20619()) {
			return;
		}
		@Pc(6) Class102 local6 = null;
		@Pc(8) Class102 local8 = null;
		@Pc(10) Class102 local10 = null;
		if (!this.aBoolean867) {
			if (this.aClass672_1.anIntArray515[0] > -1) {
				local6 = this.method32989(this.aClass672_1.anIntArray515[0], (byte) 92);
			}
			if (this.aClass672_1.anIntArray515[1] > -1) {
				local8 = this.method32989(this.aClass672_1.anIntArray515[1], (byte) 64);
			}
			if (this.aClass672_1.anIntArray515[2] > -1) {
				local10 = this.method32989(this.aClass672_1.anIntArray515[2], (byte) 7);
			}
			this.aClass104_13.method20620(local6, this.aClass672_1.aFloatArray121[0], local8, this.aClass672_1.aFloatArray121[1], local10, this.aClass672_1.aFloatArray121[2]);
			return;
		}
		if (this.anIntArray514[0] > -1) {
			local6 = this.method32989(this.anIntArray514[0], (byte) 6);
		}
		if (this.anIntArray514[1] > -1) {
			local8 = this.method32989(this.anIntArray514[1], (byte) 33);
		}
		if (this.anIntArray514[2] > -1) {
			local10 = this.method32989(this.anIntArray514[2], (byte) 76);
		}
		this.aClass104_13.method20620(local6, this.aFloatArray120[0], local8, this.aFloatArray120[1], local10, this.aFloatArray120[2]);
	}

	@OriginalMember(owner = "client!xu", name = "i", descriptor = "(B)V", line = 293)
	void method33036(@OriginalArg(0) byte arg0) {
		if (!this.aClass104_13.method20619()) {
			return;
		}
		@Pc(6) Class102 local6 = null;
		@Pc(8) Class102 local8 = null;
		@Pc(10) Class102 local10 = null;
		if (!this.aBoolean867) {
			if (this.aClass672_1.anIntArray515[0] > -1) {
				local6 = this.method32989(this.aClass672_1.anIntArray515[0], (byte) 100);
			}
			if (this.aClass672_1.anIntArray515[1] > -1) {
				local8 = this.method32989(this.aClass672_1.anIntArray515[1], (byte) 13);
			}
			if (this.aClass672_1.anIntArray515[2] > -1) {
				local10 = this.method32989(this.aClass672_1.anIntArray515[2], (byte) 82);
			}
			this.aClass104_13.method20620(local6, this.aClass672_1.aFloatArray121[0], local8, this.aClass672_1.aFloatArray121[1], local10, this.aClass672_1.aFloatArray121[2]);
			return;
		}
		if (this.anIntArray514[0] > -1) {
			local6 = this.method32989(this.anIntArray514[0], (byte) 58);
		}
		if (this.anIntArray514[1] > -1) {
			local8 = this.method32989(this.anIntArray514[1], (byte) 93);
		}
		if (this.anIntArray514[2] > -1) {
			local10 = this.method32989(this.anIntArray514[2], (byte) 25);
		}
		this.aClass104_13.method20620(local6, this.aFloatArray120[0], local8, this.aFloatArray120[1], local10, this.aFloatArray120[2]);
	}

	@OriginalMember(owner = "client!xu", name = "bj", descriptor = "()V", line = 293)
	void method33037() {
		if (!this.aClass104_13.method20619()) {
			return;
		}
		@Pc(6) Class102 local6 = null;
		@Pc(8) Class102 local8 = null;
		@Pc(10) Class102 local10 = null;
		if (!this.aBoolean867) {
			if (this.aClass672_1.anIntArray515[0] > -1) {
				local6 = this.method32989(this.aClass672_1.anIntArray515[0], (byte) 52);
			}
			if (this.aClass672_1.anIntArray515[1] > -1) {
				local8 = this.method32989(this.aClass672_1.anIntArray515[1], (byte) 56);
			}
			if (this.aClass672_1.anIntArray515[2] > -1) {
				local10 = this.method32989(this.aClass672_1.anIntArray515[2], (byte) 78);
			}
			this.aClass104_13.method20620(local6, this.aClass672_1.aFloatArray121[0], local8, this.aClass672_1.aFloatArray121[1], local10, this.aClass672_1.aFloatArray121[2]);
			return;
		}
		if (this.anIntArray514[0] > -1) {
			local6 = this.method32989(this.anIntArray514[0], (byte) 34);
		}
		if (this.anIntArray514[1] > -1) {
			local8 = this.method32989(this.anIntArray514[1], (byte) 102);
		}
		if (this.anIntArray514[2] > -1) {
			local10 = this.method32989(this.anIntArray514[2], (byte) 120);
		}
		this.aClass104_13.method20620(local6, this.aFloatArray120[0], local8, this.aFloatArray120[1], local10, this.aFloatArray120[2]);
	}

	@OriginalMember(owner = "client!xu", name = "j", descriptor = "(I)V", line = 312)
	void method33038(@OriginalArg(0) int arg0) {
		this.aBoolean867 = false;
		@Pc(5) int[] local5 = this.anIntArray514;
		@Pc(8) int[] local8 = this.anIntArray514;
		this.anIntArray514[2] = -1;
		local8[1] = -1;
		local5[0] = -1;
		@Pc(24) float[] local24 = this.aFloatArray120;
		@Pc(27) float[] local27 = this.aFloatArray120;
		this.aFloatArray120[2] = 0.0F;
		local27[1] = 0.0F;
		local24[0] = 0.0F;
	}

	@OriginalMember(owner = "client!xu", name = "cl", descriptor = "()V", line = 312)
	void method33039() {
		this.aBoolean867 = false;
		@Pc(5) int[] local5 = this.anIntArray514;
		@Pc(8) int[] local8 = this.anIntArray514;
		this.anIntArray514[2] = -1;
		local8[1] = -1;
		local5[0] = -1;
		@Pc(24) float[] local24 = this.aFloatArray120;
		@Pc(27) float[] local27 = this.aFloatArray120;
		this.aFloatArray120[2] = 0.0F;
		local27[1] = 0.0F;
		local24[0] = 0.0F;
	}

	@OriginalMember(owner = "client!xu", name = "cg", descriptor = "()V", line = 312)
	void method33040() {
		this.aBoolean867 = false;
		@Pc(5) int[] local5 = this.anIntArray514;
		@Pc(8) int[] local8 = this.anIntArray514;
		this.anIntArray514[2] = -1;
		local8[1] = -1;
		local5[0] = -1;
		@Pc(24) float[] local24 = this.aFloatArray120;
		@Pc(27) float[] local27 = this.aFloatArray120;
		this.aFloatArray120[2] = 0.0F;
		local27[1] = 0.0F;
		local24[0] = 0.0F;
	}

	@OriginalMember(owner = "client!xu", name = "t", descriptor = "(I)V", line = 326)
	public void method33041(@OriginalArg(0) int arg0) {
		this.aClass104_13.method20606(((float) Class51.aClass93_Sub36_1.aClass166_Sub7_1.method15506((byte) -125) * 0.1F + 0.7F + client.aClass532_1.method30471(-1769209909)) * 1.1523438F);
		this.aClass104_13.method20607(16777215, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
		this.aClass104_13.method20878(13156520, -1, 0);
		this.aClass104_13.method20860(aClass107_1);
	}

	@OriginalMember(owner = "client!xu", name = "ce", descriptor = "()V", line = 326)
	public void method33042() {
		this.aClass104_13.method20606(((float) Class51.aClass93_Sub36_1.aClass166_Sub7_1.method15506((byte) -1) * 0.1F + 0.7F + client.aClass532_1.method30471(715014192)) * 1.1523438F);
		this.aClass104_13.method20607(16777215, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
		this.aClass104_13.method20878(13156520, -1, 0);
		this.aClass104_13.method20860(aClass107_1);
	}

	@OriginalMember(owner = "client!xu", name = "cu", descriptor = "()V", line = 326)
	public void method33043() {
		this.aClass104_13.method20606(((float) Class51.aClass93_Sub36_1.aClass166_Sub7_1.method15506((byte) -127) * 0.1F + 0.7F + client.aClass532_1.method30471(648195851)) * 1.1523438F);
		this.aClass104_13.method20607(16777215, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
		this.aClass104_13.method20878(13156520, -1, 0);
		this.aClass104_13.method20860(aClass107_1);
	}

	@OriginalMember(owner = "client!xu", name = "nl", descriptor = "(Lclient!yf;I)V", line = 7412)
	static final void method33044(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class379.method28103(local11, local14, arg0, (byte) 33);
	}

	@OriginalMember(owner = "client!xu", name = "adf", descriptor = "(Lclient!yf;I)V", line = 10152)
	static final void method33045(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = client.aClass531ArrayArray1[local23][local13].anInt5235 * 108162093;
	}
}
