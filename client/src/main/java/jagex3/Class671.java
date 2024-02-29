package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xu")
public final class Class671 {

	@OriginalMember(owner = "client!xu", name = "n", descriptor = "Lclient!dz;")
	static Class107 aClass107_1;

	@OriginalMember(owner = "client!xu", name = "m", descriptor = "Lclient!sv;")
	static Class562 aClass562_2;

	@OriginalMember(owner = "client!xu", name = "e", descriptor = "I")
	public static int anInt6020 = 1748294101;

	@OriginalMember(owner = "client!xu", name = "k", descriptor = "I")
	static int anInt6017 = 275040415;

	@OriginalMember(owner = "client!xu", name = "s", descriptor = "Lclient!yj;")
	Class684 aClass684_1;

	@OriginalMember(owner = "client!xu", name = "ah", descriptor = "F")
	float aFloat347;

	@OriginalMember(owner = "client!xu", name = "t", descriptor = "F")
	float aFloat348;

	@OriginalMember(owner = "client!xu", name = "o", descriptor = "Lclient!xv;")
	Class672 aClass672_4;

	@OriginalMember(owner = "client!xu", name = "ae", descriptor = "F")
	float aFloat349;

	@OriginalMember(owner = "client!xu", name = "ag", descriptor = "F")
	float aFloat350;

	@OriginalMember(owner = "client!xu", name = "al", descriptor = "F")
	float aFloat351;

	@OriginalMember(owner = "client!xu", name = "l", descriptor = "I")
	int anInt6018 = 0;

	@OriginalMember(owner = "client!xu", name = "u", descriptor = "I")
	int anInt6019 = -1162824399;

	@OriginalMember(owner = "client!xu", name = "z", descriptor = "J")
	long aLong307 = 0L;

	@OriginalMember(owner = "client!xu", name = "p", descriptor = "Z")
	boolean aBoolean875 = false;

	@OriginalMember(owner = "client!xu", name = "y", descriptor = "Lclient!ox;")
	final Class472 aClass472_64 = new Class472(-50.0F, -60.0F, -50.0F);

	@OriginalMember(owner = "client!xu", name = "q", descriptor = "Lclient!eb;")
	final Class240 aClass240_93 = new Class240(8);

	@OriginalMember(owner = "client!xu", name = "x", descriptor = "Lclient!eb;")
	final Class240 aClass240_94 = new Class240(8);

	@OriginalMember(owner = "client!xu", name = "b", descriptor = "Lclient!eb;")
	final Class240 aClass240_95 = new Class240(8);

	@OriginalMember(owner = "client!xu", name = "a", descriptor = "Z")
	boolean aBoolean876 = false;

	@OriginalMember(owner = "client!xu", name = "g", descriptor = "[I")
	int[] anIntArray516 = new int[] { -1, -1, -1 };

	@OriginalMember(owner = "client!xu", name = "i", descriptor = "[F")
	float[] aFloatArray120 = new float[] { 0.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!xu", name = "j", descriptor = "Z")
	boolean aBoolean877 = false;

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

	@OriginalMember(owner = "client!xu", name = "nl", descriptor = "(Lclient!yf;I)V")
	static void method33224(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class379.method28286(local11, local14, arg0, (byte) 33);
	}

	@OriginalMember(owner = "client!xu", name = "adf", descriptor = "(Lclient!yf;I)V")
	static void method33225(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = client.aClass531ArrayArray1[local23][local13].anInt5396 * 108162093;
	}

	@OriginalMember(owner = "client!xu", name = "y", descriptor = "(Lclient!yf;I)V")
	static void method33226(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class272.method26414(-192563376);
	}

	@OriginalMember(owner = "client!xu", name = "<init>", descriptor = "(Lclient!dh;Lclient!py;II)V")
	public Class671(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class497 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass104_13 = arg0;
		this.aClass497_140 = arg1;
		this.aClass672ArrayArray1 = new Class672[arg2][arg3];
		if (anInt6020 * 933128323 != -1) {
			aClass107_1 = this.method33150(anInt6020 * 933128323, 1519682227);
		}
		aClass562_2 = null;
		this.aClass672_5 = new Class672();
		this.aClass672_1 = new Class672();
		this.aClass672_2 = new Class672();
		this.aClass672_3 = new Class672();
		this.method33184(-2082959795);
		this.method33167(1378705770);
		this.method33165((byte) 86);
	}

	@OriginalMember(owner = "client!xu", name = "bw", descriptor = "()V")
	void method33142() {
		this.aClass104_13.method20554(this.aClass672_1.aFloat360, this.aClass672_1.aFloat353, this.aClass672_1.aFloat356, -1786220465);
	}

	@OriginalMember(owner = "client!xu", name = "al", descriptor = "(Lclient!rl;)V")
	public void method33143(@OriginalArg(0) Class532 arg0) {
		@Pc(4) Class672 local4 = this.method33214(arg0, -3659365);
		if (this.aClass684_1 == null) {
			this.method33172(local4, anInt6017 * -1834375703, 2146172716);
		} else {
			this.aClass672_4.method33248(local4, (byte) -24);
			this.aClass672_4.method33228(this, this.aClass684_1, 1795184873);
			this.method33172(this.aClass672_4, this.aClass684_1.method33540(1204992034), 2146172716);
		}
		this.method33155(1689635280);
		this.method33173(1902274160);
		this.method33162(28630617);
	}

	@OriginalMember(owner = "client!xu", name = "n", descriptor = "(Lclient!rl;B)V")
	public void method33144(@OriginalArg(0) Class532 arg0, @OriginalArg(1) byte arg1) {
		@Pc(4) Class672 local4 = this.method33214(arg0, 1099924204);
		if (this.aClass684_1 == null) {
			this.method33172(local4, anInt6017 * -1834375703, 2146172716);
		} else {
			this.aClass672_4.method33248(local4, (byte) 14);
			this.aClass672_4.method33228(this, this.aClass684_1, 1795184873);
			this.method33172(this.aClass672_4, this.aClass684_1.method33540(1009613677), 2146172716);
		}
		this.method33155(1598372657);
		this.method33219(-799862065);
		this.method33202(-1930484933);
		this.method33166((byte) -71);
	}

	@OriginalMember(owner = "client!xu", name = "m", descriptor = "(Lclient!rl;Lclient!yj;II)V")
	public void method33145(@OriginalArg(0) Class532 arg0, @OriginalArg(1) Class684 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass684_1 = arg1;
		@Pc(7) Class672 local7 = this.method33214(arg0, -1634058228);
		if (this.aClass684_1 == null) {
			this.method33172(local7, arg2, 2146172716);
			this.aClass672_4 = null;
			return;
		}
		if (this.aClass672_4 == null) {
			this.aClass672_4 = new Class672();
		}
		this.aClass672_4.method33248(local7, (byte) -67);
		this.aClass672_4.method33228(this, this.aClass684_1, 1795184873);
		this.method33172(this.aClass672_4, arg2, 2146172716);
	}

	@OriginalMember(owner = "client!xu", name = "k", descriptor = "(I)Lclient!yj;")
	public Class684 method33146(@OriginalArg(0) int arg0) {
		return this.aClass684_1;
	}

	@OriginalMember(owner = "client!xu", name = "f", descriptor = "(I)Lclient!xv;")
	public Class672 method33147(@OriginalArg(0) int arg0) {
		return this.aClass672_1;
	}

	@OriginalMember(owner = "client!xu", name = "t", descriptor = "(I)V")
	public void method33148(@OriginalArg(0) int arg0) {
		this.aClass104_13.method20533(((float) Class51.aClass93_Sub36_1.aClass166_Sub7_1.method15514((byte) -125) * 0.1F + 0.7F + client.aClass532_1.method30629(-1769209909)) * 1.1523438F);
		this.aClass104_13.method20534(16777215, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
		this.aClass104_13.method20883(13156520, -1, 0);
		this.aClass104_13.method20827(aClass107_1);
	}

	@OriginalMember(owner = "client!xu", name = "l", descriptor = "(I)V")
	public void method33149(@OriginalArg(0) int arg0) {
		this.aClass240_93.method25926((byte) 0);
		this.aClass240_94.method25926((byte) -48);
		this.aClass240_95.method25926((byte) -109);
	}

	@OriginalMember(owner = "client!xu", name = "u", descriptor = "(II)Lclient!dz;")
	Class107 method33150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class107 local6 = (Class107) this.aClass240_93.method25932((long) arg0);
		if (local6 == null) {
			local6 = this.aClass104_13.method20540(arg0);
			this.aClass240_93.method25923(local6, (long) arg0);
			return local6;
		} else {
			return local6;
		}
	}

	@OriginalMember(owner = "client!xu", name = "z", descriptor = "(IIIII)Lclient!sv;")
	Class562 method33151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(25) long local25 = ((long) arg1 & 0xFFFFL) << 48 | ((long) arg2 & 0xFFFFL) << 32 | ((long) arg3 & 0xFFFFL) << 16 | (long) arg0 & 0xFFFFL;
		@Pc(31) Class562 local31 = (Class562) this.aClass240_94.method25932(local25);
		if (local31 == null) {
			local31 = Class220.method25635(arg0, arg1, arg2, arg3, Class123.aClass32_Sub11_2, Class51.aClass32_Sub9_1, 212851357);
			this.aClass240_94.method25923(local31, local25);
		}
		return local31;
	}

	@OriginalMember(owner = "client!xu", name = "p", descriptor = "(IB)Lclient!cj;")
	Class102 method33152(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(6) Class102 local6 = (Class102) this.aClass240_95.method25932((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(16) Class105 local16 = Class203.method24662(this.aClass497_140, arg0);
		if (local16 != null && local16.method7206() == 256 && local16.method7198() == 16) {
			@Pc(30) int[] local30 = local16.method7171(false);
			local6 = this.aClass104_13.method20548(local30);
			if (local6 != null) {
				this.aClass240_95.method25923(local6, (long) arg0);
			}
		}
		return local6;
	}

	@OriginalMember(owner = "client!xu", name = "bg", descriptor = "()V")
	void method33153() {
		this.aBoolean877 = false;
		this.aFloat348 = 1.0F;
		this.aFloat349 = 0.0F;
		this.aFloat350 = 1.0F;
		this.aFloat347 = 0.0F;
		this.aFloat351 = 1.0F;
	}

	@OriginalMember(owner = "client!xu", name = "av", descriptor = "(I)Lclient!dz;")
	Class107 method33154(@OriginalArg(0) int arg0) {
		@Pc(6) Class107 local6 = (Class107) this.aClass240_93.method25932((long) arg0);
		if (local6 == null) {
			local6 = this.aClass104_13.method20540(arg0);
			this.aClass240_93.method25923(local6, (long) arg0);
			return local6;
		} else {
			return local6;
		}
	}

	@OriginalMember(owner = "client!xu", name = "s", descriptor = "(I)V")
	void method33155(@OriginalArg(0) int arg0) {
		if (this.anInt6019 * 2008775727 < 0) {
			return;
		}
		@Pc(7) long local7 = Class305.method26889(585591057);
		this.anInt6019 = (int) ((long) this.anInt6019 - (local7 - this.aLong307 * 5957186404395821059L) * 1162824399L);
		if (this.anInt6019 * 2008775727 > 0) {
			this.aClass672_1.method33259(this.aClass104_13, this.aClass672_2, this.aClass672_3, (float) (this.anInt6018 * -4832943 - this.anInt6019 * 2008775727) / (float) (this.anInt6018 * -4832943), 2130343103);
		} else {
			this.aClass672_1.method33248(this.aClass672_3, (byte) 83);
			if (this.aClass672_1.aClass562_3 != null) {
				this.aClass672_1.aClass562_3.method31355(1796102726);
			}
			this.anInt6019 = -1162824399;
		}
		this.aLong307 = local7 * 3202058925841662635L;
	}

	@OriginalMember(owner = "client!xu", name = "r", descriptor = "(III)V")
	public void method33156(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) Class672 local6 = this.aClass672ArrayArray1[arg0][arg1];
		if (local6 != null) {
			this.aClass472_64.method29719(local6.aClass472_65);
		}
		this.method33173(1194687224);
	}

	@OriginalMember(owner = "client!xu", name = "w", descriptor = "(Lclient!xu;I)V")
	public void method33157(@OriginalArg(0) Class671 arg0, @OriginalArg(1) int arg1) {
		this.aClass672_1.method33248(arg0.aClass672_1, (byte) 78);
		this.aClass672_2.method33248(arg0.aClass672_2, (byte) 90);
		this.aClass672_3.method33248(arg0.aClass672_3, (byte) -40);
		this.aLong307 = arg0.aLong307;
		this.anInt6018 = arg0.anInt6018;
		this.anInt6019 = arg0.anInt6019;
	}

	@OriginalMember(owner = "client!xu", name = "bs", descriptor = "()V")
	void method33158() {
		if (!this.aClass104_13.method20549()) {
			return;
		}
		@Pc(6) Class102 local6 = null;
		@Pc(8) Class102 local8 = null;
		@Pc(10) Class102 local10 = null;
		if (!this.aBoolean876) {
			if (this.aClass672_1.anIntArray517[0] > -1) {
				local6 = this.method33152(this.aClass672_1.anIntArray517[0], (byte) 92);
			}
			if (this.aClass672_1.anIntArray517[1] > -1) {
				local8 = this.method33152(this.aClass672_1.anIntArray517[1], (byte) 64);
			}
			if (this.aClass672_1.anIntArray517[2] > -1) {
				local10 = this.method33152(this.aClass672_1.anIntArray517[2], (byte) 7);
			}
			this.aClass104_13.method20550(local6, this.aClass672_1.aFloatArray121[0], local8, this.aClass672_1.aFloatArray121[1], local10, this.aClass672_1.aFloatArray121[2]);
			return;
		}
		if (this.anIntArray516[0] > -1) {
			local6 = this.method33152(this.anIntArray516[0], (byte) 6);
		}
		if (this.anIntArray516[1] > -1) {
			local8 = this.method33152(this.anIntArray516[1], (byte) 33);
		}
		if (this.anIntArray516[2] > -1) {
			local10 = this.method33152(this.anIntArray516[2], (byte) 76);
		}
		this.aClass104_13.method20550(local6, this.aFloatArray120[0], local8, this.aFloatArray120[1], local10, this.aFloatArray120[2]);
	}

	@OriginalMember(owner = "client!xu", name = "ab", descriptor = "(IILclient!xv;)V")
	public void method33159(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class672 arg2) {
		this.aClass672ArrayArray1[arg0][arg1] = arg2;
	}

	@OriginalMember(owner = "client!xu", name = "bm", descriptor = "()V")
	void method33160() {
		this.aClass104_13.method20533(((float) Class51.aClass93_Sub36_1.aClass166_Sub7_1.method15514((byte) -25) * 0.1F + 0.7F + client.aClass532_1.method30629(-1772387017)) * this.aClass672_1.aFloat357);
		this.aClass104_13.method20534(this.aClass672_1.anInt6023 * 1540075243, this.aClass672_1.aFloat352, this.aClass672_1.aFloat354, (float) ((int) this.aClass472_64.aFloat325 << 2), (float) ((int) this.aClass472_64.aFloat326 << 2), (float) ((int) this.aClass472_64.aFloat327 << 2));
		this.aClass104_13.method20827(this.aClass672_1.aClass107_2);
	}

	@OriginalMember(owner = "client!xu", name = "x", descriptor = "(FFFIIIIII)V")
	public void method33161(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.aClass104_13.method20533(((float) Class51.aClass93_Sub36_1.aClass166_Sub7_1.method15514((byte) -34) * 0.1F + 0.7F + client.aClass532_1.method30629(-374350000)) * arg0);
		this.aClass104_13.method20534(arg3, arg1, arg2, (float) (arg4 << 2), (float) (arg5 << 2), (float) (arg6 << 2));
		this.aClass104_13.method20827(this.method33150(arg7, 1094578849));
	}

	@OriginalMember(owner = "client!xu", name = "b", descriptor = "(I)V")
	public void method33162(@OriginalArg(0) int arg0) {
		@Pc(1) byte local1 = 0;
		@Pc(13) int local13 = (this.aClass672_1.anInt6022 * -2139322713 + 256 << 2) + local1;
		this.aClass104_13.method20883(this.aClass672_1.anInt6021 * -2016142599, Class51.aClass93_Sub36_1.aClass166_Sub2_1.method15388(-1722659830) == 1 ? local13 : -1, 0);
	}

	@OriginalMember(owner = "client!xu", name = "c", descriptor = "(B)V")
	public void method33163(@OriginalArg(0) byte arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass672ArrayArray1.length; local1++) {
			for (@Pc(8) int local8 = 0; local8 < this.aClass672ArrayArray1[local1].length; local8++) {
				this.aClass672ArrayArray1[local1][local8] = this.aClass672_5;
			}
		}
	}

	@OriginalMember(owner = "client!xu", name = "d", descriptor = "(IILclient!xv;I)V")
	public void method33164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class672 arg2, @OriginalArg(3) int arg3) {
		this.aClass672ArrayArray1[arg0][arg1] = arg2;
	}

	@OriginalMember(owner = "client!xu", name = "g", descriptor = "(B)V")
	void method33165(@OriginalArg(0) byte arg0) {
		this.aBoolean877 = false;
		this.aFloat348 = 1.0F;
		this.aFloat349 = 0.0F;
		this.aFloat350 = 1.0F;
		this.aFloat347 = 0.0F;
		this.aFloat351 = 1.0F;
	}

	@OriginalMember(owner = "client!xu", name = "i", descriptor = "(B)V")
	void method33166(@OriginalArg(0) byte arg0) {
		if (!this.aClass104_13.method20549()) {
			return;
		}
		@Pc(6) Class102 local6 = null;
		@Pc(8) Class102 local8 = null;
		@Pc(10) Class102 local10 = null;
		if (!this.aBoolean876) {
			if (this.aClass672_1.anIntArray517[0] > -1) {
				local6 = this.method33152(this.aClass672_1.anIntArray517[0], (byte) 100);
			}
			if (this.aClass672_1.anIntArray517[1] > -1) {
				local8 = this.method33152(this.aClass672_1.anIntArray517[1], (byte) 13);
			}
			if (this.aClass672_1.anIntArray517[2] > -1) {
				local10 = this.method33152(this.aClass672_1.anIntArray517[2], (byte) 82);
			}
			this.aClass104_13.method20550(local6, this.aClass672_1.aFloatArray121[0], local8, this.aClass672_1.aFloatArray121[1], local10, this.aClass672_1.aFloatArray121[2]);
			return;
		}
		if (this.anIntArray516[0] > -1) {
			local6 = this.method33152(this.anIntArray516[0], (byte) 58);
		}
		if (this.anIntArray516[1] > -1) {
			local8 = this.method33152(this.anIntArray516[1], (byte) 93);
		}
		if (this.anIntArray516[2] > -1) {
			local10 = this.method33152(this.anIntArray516[2], (byte) 25);
		}
		this.aClass104_13.method20550(local6, this.aFloatArray120[0], local8, this.aFloatArray120[1], local10, this.aFloatArray120[2]);
	}

	@OriginalMember(owner = "client!xu", name = "j", descriptor = "(I)V")
	void method33167(@OriginalArg(0) int arg0) {
		this.aBoolean876 = false;
		@Pc(5) int[] local5 = this.anIntArray516;
		@Pc(8) int[] local8 = this.anIntArray516;
		this.anIntArray516[2] = -1;
		local8[1] = -1;
		local5[0] = -1;
		@Pc(24) float[] local24 = this.aFloatArray120;
		@Pc(27) float[] local27 = this.aFloatArray120;
		this.aFloatArray120[2] = 0.0F;
		local27[1] = 0.0F;
		local24[0] = 0.0F;
	}

	@OriginalMember(owner = "client!xu", name = "e", descriptor = "(Lclient!rl;B)V")
	public void method33168(@OriginalArg(0) Class532 arg0, @OriginalArg(1) byte arg1) {
		@Pc(4) Class672 local4 = this.method33214(arg0, 838237152);
		if (this.aClass684_1 == null) {
			this.method33172(local4, anInt6017 * -1834375703, 2146172716);
		} else {
			this.aClass672_4.method33248(local4, (byte) 57);
			this.aClass672_4.method33228(this, this.aClass684_1, 1795184873);
			this.method33172(this.aClass672_4, this.aClass684_1.method33540(1274431884), 2146172716);
		}
		this.method33155(-199616452);
		this.method33173(-197090970);
		this.method33162(1413467815);
	}

	@OriginalMember(owner = "client!xu", name = "ae", descriptor = "(Lclient!rl;)V")
	public void method33169(@OriginalArg(0) Class532 arg0) {
		@Pc(4) Class672 local4 = this.method33214(arg0, 727720267);
		if (this.aClass684_1 == null) {
			this.method33172(local4, anInt6017 * -1834375703, 2146172716);
		} else {
			this.aClass672_4.method33248(local4, (byte) 3);
			this.aClass672_4.method33228(this, this.aClass684_1, 1795184873);
			this.method33172(this.aClass672_4, this.aClass684_1.method33540(1414241571), 2146172716);
		}
		this.method33155(1169680442);
		this.method33173(104147);
		this.method33162(958851152);
	}

	@OriginalMember(owner = "client!xu", name = "ag", descriptor = "(Lclient!rl;)V")
	public void method33170(@OriginalArg(0) Class532 arg0) {
		@Pc(4) Class672 local4 = this.method33214(arg0, -567998592);
		if (this.aClass684_1 == null) {
			this.method33172(local4, anInt6017 * -1834375703, 2146172716);
		} else {
			this.aClass672_4.method33248(local4, (byte) 60);
			this.aClass672_4.method33228(this, this.aClass684_1, 1795184873);
			this.method33172(this.aClass672_4, this.aClass684_1.method33540(-1171360745), 2146172716);
		}
		this.method33155(482247636);
		this.method33173(-2135758414);
		this.method33162(-885111609);
	}

	@OriginalMember(owner = "client!xu", name = "ah", descriptor = "(Lclient!rl;)V")
	public void method33171(@OriginalArg(0) Class532 arg0) {
		@Pc(4) Class672 local4 = this.method33214(arg0, -1981936495);
		if (this.aClass684_1 == null) {
			this.method33172(local4, anInt6017 * -1834375703, 2146172716);
		} else {
			this.aClass672_4.method33248(local4, (byte) 48);
			this.aClass672_4.method33228(this, this.aClass684_1, 1795184873);
			this.method33172(this.aClass672_4, this.aClass684_1.method33540(1164572716), 2146172716);
		}
		this.method33155(-1126187412);
		this.method33173(1215882651);
		this.method33162(-865399071);
	}

	@OriginalMember(owner = "client!xu", name = "o", descriptor = "(Lclient!xv;II)V")
	void method33172(@OriginalArg(0) Class672 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean875) {
			this.aBoolean875 = false;
			arg1 = 0;
		}
		if (this.aClass672_3.method33236(arg0, 60034890)) {
			return;
		}
		this.aClass672_3.method33248(arg0, (byte) 30);
		this.aLong307 = Class305.method26889(1773033538) * 3202058925841662635L;
		this.anInt6018 = (this.anInt6019 = arg1 * 1162824399) * 1573029247;
		if (this.anInt6018 * -4832943 == 0) {
			return;
		}
		this.aClass672_2.method33248(this.aClass672_1, (byte) 1);
		if (this.aClass672_1.aClass562_3 == null) {
			return;
		}
		if (this.aClass672_1.aClass562_3.method31357((byte) 39)) {
			this.aClass672_1.aClass562_3 = this.aClass672_2.aClass562_3 = this.aClass672_1.aClass562_3.method31339(-1722669835);
		}
		if (this.aClass672_1.aClass562_3 != null && this.aClass672_3.aClass562_3 != this.aClass672_1.aClass562_3) {
			this.aClass672_1.aClass562_3.method31359(this.aClass672_3.aClass562_3, 1867099837);
		}
	}

	@OriginalMember(owner = "client!xu", name = "q", descriptor = "(I)V")
	void method33173(@OriginalArg(0) int arg0) {
		this.aClass104_13.method20533(((float) Class51.aClass93_Sub36_1.aClass166_Sub7_1.method15514((byte) -49) * 0.1F + 0.7F + client.aClass532_1.method30629(-676345909)) * this.aClass672_1.aFloat357);
		this.aClass104_13.method20534(this.aClass672_1.anInt6023 * 1540075243, this.aClass672_1.aFloat352, this.aClass672_1.aFloat354, (float) ((int) this.aClass472_64.aFloat325 << 2), (float) ((int) this.aClass472_64.aFloat326 << 2), (float) ((int) this.aClass472_64.aFloat327 << 2));
		this.aClass104_13.method20827(this.aClass672_1.aClass107_2);
	}

	@OriginalMember(owner = "client!xu", name = "ai", descriptor = "(Lclient!rl;Lclient!yj;I)V")
	public void method33174(@OriginalArg(0) Class532 arg0, @OriginalArg(1) Class684 arg1, @OriginalArg(2) int arg2) {
		this.aClass684_1 = arg1;
		@Pc(7) Class672 local7 = this.method33214(arg0, -704688771);
		if (this.aClass684_1 == null) {
			this.method33172(local7, arg2, 2146172716);
			this.aClass672_4 = null;
			return;
		}
		if (this.aClass672_4 == null) {
			this.aClass672_4 = new Class672();
		}
		this.aClass672_4.method33248(local7, (byte) -28);
		this.aClass672_4.method33228(this, this.aClass684_1, 1795184873);
		this.method33172(this.aClass672_4, arg2, 2146172716);
	}

	@OriginalMember(owner = "client!xu", name = "aw", descriptor = "(Lclient!rl;Lclient!yj;I)V")
	public void method33175(@OriginalArg(0) Class532 arg0, @OriginalArg(1) Class684 arg1, @OriginalArg(2) int arg2) {
		this.aClass684_1 = arg1;
		@Pc(7) Class672 local7 = this.method33214(arg0, -758829604);
		if (this.aClass684_1 == null) {
			this.method33172(local7, arg2, 2146172716);
			this.aClass672_4 = null;
			return;
		}
		if (this.aClass672_4 == null) {
			this.aClass672_4 = new Class672();
		}
		this.aClass672_4.method33248(local7, (byte) -1);
		this.aClass672_4.method33228(this, this.aClass684_1, 1795184873);
		this.method33172(this.aClass672_4, arg2, 2146172716);
	}

	@OriginalMember(owner = "client!xu", name = "as", descriptor = "()Lclient!yj;")
	public Class684 method33176() {
		return this.aClass684_1;
	}

	@OriginalMember(owner = "client!xu", name = "at", descriptor = "()Lclient!yj;")
	public Class684 method33177() {
		return this.aClass684_1;
	}

	@OriginalMember(owner = "client!xu", name = "ad", descriptor = "()Lclient!yj;")
	public Class684 method33178() {
		return this.aClass684_1;
	}

	@OriginalMember(owner = "client!xu", name = "am", descriptor = "()Lclient!xv;")
	public Class672 method33179() {
		return this.aClass672_1;
	}

	@OriginalMember(owner = "client!xu", name = "ce", descriptor = "()V")
	public void method33180() {
		this.aClass104_13.method20533(((float) Class51.aClass93_Sub36_1.aClass166_Sub7_1.method15514((byte) -1) * 0.1F + 0.7F + client.aClass532_1.method30629(715014192)) * 1.1523438F);
		this.aClass104_13.method20534(16777215, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
		this.aClass104_13.method20883(13156520, -1, 0);
		this.aClass104_13.method20827(aClass107_1);
	}

	@OriginalMember(owner = "client!xu", name = "bh", descriptor = "(Lclient!rl;)Lclient!xv;")
	Class672 method33181(@OriginalArg(0) Class532 arg0) {
		@Pc(1) Class672 local1 = null;
		@Pc(3) int local3 = -1;
		@Pc(5) int local5 = -1;
		if (Class1.method15(client.anInt3435 * -849002901, -1212653237) || Class56.method18046(client.anInt3435 * -849002901, -1497248091)) {
			local3 = Class163.anInt2002 * -1331168249 >> 12;
			local5 = Class270.anInt3925 * 466086187 >> 12;
		} else {
			if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 != null) {
				local3 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anIntArray240[0] >> 3;
				local5 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anIntArray239[0] >> 3;
			}
			if (local3 < 0 || local3 >= arg0.method30625(-485462668) >> 3 || local5 < 0 || local5 >= arg0.method30655((short) 128) >> 3) {
				local3 = arg0.method30625(-295129019) >> 4;
				local5 = arg0.method30655((short) 128) >> 4;
			}
		}
		local1 = this.aClass672ArrayArray1[local3][local5];
		if (local1 == null) {
			local1 = this.aClass672_5;
		}
		return local1;
	}

	@OriginalMember(owner = "client!xu", name = "aq", descriptor = "()V")
	public void method33182() {
		this.aClass240_93.method25926((byte) -49);
		this.aClass240_94.method25926((byte) -80);
		this.aClass240_95.method25926((byte) -2);
	}

	@OriginalMember(owner = "client!xu", name = "ax", descriptor = "()V")
	public void method33183() {
		this.aClass240_93.method25926((byte) -27);
		this.aClass240_94.method25926((byte) -127);
		this.aClass240_95.method25926((byte) -86);
	}

	@OriginalMember(owner = "client!xu", name = "y", descriptor = "(I)V")
	public void method33184(@OriginalArg(0) int arg0) {
		this.aBoolean875 = true;
	}

	@OriginalMember(owner = "client!xu", name = "ao", descriptor = "(I)Lclient!dz;")
	Class107 method33185(@OriginalArg(0) int arg0) {
		@Pc(6) Class107 local6 = (Class107) this.aClass240_93.method25932((long) arg0);
		if (local6 == null) {
			local6 = this.aClass104_13.method20540(arg0);
			this.aClass240_93.method25923(local6, (long) arg0);
			return local6;
		} else {
			return local6;
		}
	}

	@OriginalMember(owner = "client!xu", name = "ba", descriptor = "()V")
	void method33186() {
		this.aBoolean877 = false;
		this.aFloat348 = 1.0F;
		this.aFloat349 = 0.0F;
		this.aFloat350 = 1.0F;
		this.aFloat347 = 0.0F;
		this.aFloat351 = 1.0F;
	}

	@OriginalMember(owner = "client!xu", name = "ay", descriptor = "(I)Lclient!cj;")
	Class102 method33187(@OriginalArg(0) int arg0) {
		@Pc(6) Class102 local6 = (Class102) this.aClass240_95.method25932((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(16) Class105 local16 = Class203.method24662(this.aClass497_140, arg0);
		if (local16 != null && local16.method7206() == 256 && local16.method7198() == 16) {
			@Pc(30) int[] local30 = local16.method7171(false);
			local6 = this.aClass104_13.method20548(local30);
			if (local6 != null) {
				this.aClass240_95.method25923(local6, (long) arg0);
			}
		}
		return local6;
	}

	@OriginalMember(owner = "client!xu", name = "ac", descriptor = "(Lclient!rl;)V")
	public void method33188(@OriginalArg(0) Class532 arg0) {
		@Pc(4) Class672 local4 = this.method33214(arg0, -1660041769);
		if (this.aClass684_1 == null) {
			this.method33172(local4, anInt6017 * -1834375703, 2146172716);
		} else {
			this.aClass672_4.method33248(local4, (byte) -13);
			this.aClass672_4.method33228(this, this.aClass684_1, 1795184873);
			this.method33172(this.aClass672_4, this.aClass684_1.method33540(-1490668367), 2146172716);
		}
		this.method33155(1840264631);
		this.method33219(-1308516055);
		this.method33202(-893392277);
		this.method33166((byte) 25);
	}

	@OriginalMember(owner = "client!xu", name = "az", descriptor = "(IILclient!xv;)V")
	public void method33189(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class672 arg2) {
		this.aClass672ArrayArray1[arg0][arg1] = arg2;
	}

	@OriginalMember(owner = "client!xu", name = "aa", descriptor = "(IILclient!xv;)V")
	public void method33190(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class672 arg2) {
		this.aClass672ArrayArray1[arg0][arg1] = arg2;
	}

	@OriginalMember(owner = "client!xu", name = "af", descriptor = "()V")
	public void method33191() {
		for (@Pc(1) int local1 = 0; local1 < this.aClass672ArrayArray1.length; local1++) {
			for (@Pc(8) int local8 = 0; local8 < this.aClass672ArrayArray1[local1].length; local8++) {
				this.aClass672ArrayArray1[local1][local8] = this.aClass672_5;
			}
		}
	}

	@OriginalMember(owner = "client!xu", name = "ak", descriptor = "()V")
	public void method33192() {
		for (@Pc(1) int local1 = 0; local1 < this.aClass672ArrayArray1.length; local1++) {
			for (@Pc(8) int local8 = 0; local8 < this.aClass672ArrayArray1[local1].length; local8++) {
				this.aClass672ArrayArray1[local1][local8] = this.aClass672_5;
			}
		}
	}

	@OriginalMember(owner = "client!xu", name = "an", descriptor = "()V")
	public void method33193() {
		for (@Pc(1) int local1 = 0; local1 < this.aClass672ArrayArray1.length; local1++) {
			for (@Pc(8) int local8 = 0; local8 < this.aClass672ArrayArray1[local1].length; local8++) {
				this.aClass672ArrayArray1[local1][local8] = this.aClass672_5;
			}
		}
	}

	@OriginalMember(owner = "client!xu", name = "bf", descriptor = "(II)V")
	public void method33194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class672 local6 = this.aClass672ArrayArray1[arg0][arg1];
		if (local6 != null) {
			this.aClass472_64.method29719(local6.aClass472_65);
		}
		this.method33173(1538329310);
	}

	@OriginalMember(owner = "client!xu", name = "ar", descriptor = "()Lclient!xv;")
	public Class672 method33195() {
		return this.aClass672_1;
	}

	@OriginalMember(owner = "client!xu", name = "aj", descriptor = "(I)Lclient!cj;")
	Class102 method33196(@OriginalArg(0) int arg0) {
		@Pc(6) Class102 local6 = (Class102) this.aClass240_95.method25932((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(16) Class105 local16 = Class203.method24662(this.aClass497_140, arg0);
		if (local16 != null && local16.method7206() == 256 && local16.method7198() == 16) {
			@Pc(30) int[] local30 = local16.method7171(false);
			local6 = this.aClass104_13.method20548(local30);
			if (local6 != null) {
				this.aClass240_95.method25923(local6, (long) arg0);
			}
		}
		return local6;
	}

	@OriginalMember(owner = "client!xu", name = "bl", descriptor = "(II)V")
	public void method33197(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class672 local6 = this.aClass672ArrayArray1[arg0][arg1];
		if (local6 != null) {
			this.aClass472_64.method29719(local6.aClass472_65);
		}
		this.method33173(489853180);
	}

	@OriginalMember(owner = "client!xu", name = "bx", descriptor = "(Lclient!rl;)Lclient!xv;")
	Class672 method33198(@OriginalArg(0) Class532 arg0) {
		@Pc(1) Class672 local1 = null;
		@Pc(3) int local3 = -1;
		@Pc(5) int local5 = -1;
		if (Class1.method15(client.anInt3435 * -849002901, 992364855) || Class56.method18046(client.anInt3435 * -849002901, -1497248091)) {
			local3 = Class163.anInt2002 * -1331168249 >> 12;
			local5 = Class270.anInt3925 * 466086187 >> 12;
		} else {
			if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 != null) {
				local3 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anIntArray240[0] >> 3;
				local5 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anIntArray239[0] >> 3;
			}
			if (local3 < 0 || local3 >= arg0.method30625(1771391415) >> 3 || local5 < 0 || local5 >= arg0.method30655((short) 128) >> 3) {
				local3 = arg0.method30625(-559947505) >> 4;
				local5 = arg0.method30655((short) 128) >> 4;
			}
		}
		local1 = this.aClass672ArrayArray1[local3][local5];
		if (local1 == null) {
			local1 = this.aClass672_5;
		}
		return local1;
	}

	@OriginalMember(owner = "client!xu", name = "bd", descriptor = "(Lclient!rl;)Lclient!xv;")
	Class672 method33199(@OriginalArg(0) Class532 arg0) {
		@Pc(1) Class672 local1 = null;
		@Pc(3) int local3 = -1;
		@Pc(5) int local5 = -1;
		if (Class1.method15(client.anInt3435 * -849002901, -341826344) || Class56.method18046(client.anInt3435 * -849002901, -1497248091)) {
			local3 = Class163.anInt2002 * -1331168249 >> 12;
			local5 = Class270.anInt3925 * 466086187 >> 12;
		} else {
			if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 != null) {
				local3 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anIntArray240[0] >> 3;
				local5 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anIntArray239[0] >> 3;
			}
			if (local3 < 0 || local3 >= arg0.method30625(-576694170) >> 3 || local5 < 0 || local5 >= arg0.method30655((short) 128) >> 3) {
				local3 = arg0.method30625(684151797) >> 4;
				local5 = arg0.method30655((short) 128) >> 4;
			}
		}
		local1 = this.aClass672ArrayArray1[local3][local5];
		if (local1 == null) {
			local1 = this.aClass672_5;
		}
		return local1;
	}

	@OriginalMember(owner = "client!xu", name = "bc", descriptor = "(Lclient!rl;)Lclient!xv;")
	Class672 method33200(@OriginalArg(0) Class532 arg0) {
		@Pc(1) Class672 local1 = null;
		@Pc(3) int local3 = -1;
		@Pc(5) int local5 = -1;
		if (Class1.method15(client.anInt3435 * -849002901, -98792332) || Class56.method18046(client.anInt3435 * -849002901, -1497248091)) {
			local3 = Class163.anInt2002 * -1331168249 >> 12;
			local5 = Class270.anInt3925 * 466086187 >> 12;
		} else {
			if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 != null) {
				local3 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anIntArray240[0] >> 3;
				local5 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anIntArray239[0] >> 3;
			}
			if (local3 < 0 || local3 >= arg0.method30625(99088898) >> 3 || local5 < 0 || local5 >= arg0.method30655((short) 128) >> 3) {
				local3 = arg0.method30625(48735057) >> 4;
				local5 = arg0.method30655((short) 128) >> 4;
			}
		}
		local1 = this.aClass672ArrayArray1[local3][local5];
		if (local1 == null) {
			local1 = this.aClass672_5;
		}
		return local1;
	}

	@OriginalMember(owner = "client!xu", name = "bi", descriptor = "(Lclient!rl;)Lclient!xv;")
	Class672 method33201(@OriginalArg(0) Class532 arg0) {
		@Pc(1) Class672 local1 = null;
		@Pc(3) int local3 = -1;
		@Pc(5) int local5 = -1;
		if (Class1.method15(client.anInt3435 * -849002901, 461592936) || Class56.method18046(client.anInt3435 * -849002901, -1497248091)) {
			local3 = Class163.anInt2002 * -1331168249 >> 12;
			local5 = Class270.anInt3925 * 466086187 >> 12;
		} else {
			if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 != null) {
				local3 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anIntArray240[0] >> 3;
				local5 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anIntArray239[0] >> 3;
			}
			if (local3 < 0 || local3 >= arg0.method30625(1264651395) >> 3 || local5 < 0 || local5 >= arg0.method30655((short) 128) >> 3) {
				local3 = arg0.method30625(-1057908191) >> 4;
				local5 = arg0.method30655((short) 128) >> 4;
			}
		}
		local1 = this.aClass672ArrayArray1[local3][local5];
		if (local1 == null) {
			local1 = this.aClass672_5;
		}
		return local1;
	}

	@OriginalMember(owner = "client!xu", name = "a", descriptor = "(I)V")
	void method33202(@OriginalArg(0) int arg0) {
		if (!this.aClass104_13.method20463()) {
			return;
		}
		if (this.aBoolean877) {
			this.aClass104_13.method20547(this.aFloat348, this.aFloat349, this.aFloat350, this.aFloat347, this.aFloat351);
		} else {
			this.aClass104_13.method20547(this.aClass672_1.aFloat359, this.aClass672_1.aFloat355, this.aClass672_1.aFloat361, this.aClass672_1.aFloat362, this.aClass672_1.aFloat358);
		}
	}

	@OriginalMember(owner = "client!xu", name = "bt", descriptor = "(Lclient!xv;I)V")
	void method33203(@OriginalArg(0) Class672 arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean875) {
			this.aBoolean875 = false;
			arg1 = 0;
		}
		if (this.aClass672_3.method33236(arg0, 214172442)) {
			return;
		}
		this.aClass672_3.method33248(arg0, (byte) 16);
		this.aLong307 = Class305.method26889(1459124914) * 3202058925841662635L;
		this.anInt6018 = (this.anInt6019 = arg1 * 1162824399) * 1573029247;
		if (this.anInt6018 * -4832943 == 0) {
			return;
		}
		this.aClass672_2.method33248(this.aClass672_1, (byte) -30);
		if (this.aClass672_1.aClass562_3 == null) {
			return;
		}
		if (this.aClass672_1.aClass562_3.method31357((byte) -115)) {
			this.aClass672_1.aClass562_3 = this.aClass672_2.aClass562_3 = this.aClass672_1.aClass562_3.method31339(-1094091058);
		}
		if (this.aClass672_1.aClass562_3 != null && this.aClass672_3.aClass562_3 != this.aClass672_1.aClass562_3) {
			this.aClass672_1.aClass562_3.method31359(this.aClass672_3.aClass562_3, 1571712364);
		}
	}

	@OriginalMember(owner = "client!xu", name = "bq", descriptor = "()V")
	void method33204() {
		if (this.anInt6019 * 2008775727 < 0) {
			return;
		}
		@Pc(7) long local7 = Class305.method26889(-130808910);
		this.anInt6019 = (int) ((long) this.anInt6019 - (local7 - this.aLong307 * 5957186404395821059L) * 1162824399L);
		if (this.anInt6019 * 2008775727 > 0) {
			this.aClass672_1.method33259(this.aClass104_13, this.aClass672_2, this.aClass672_3, (float) (this.anInt6018 * -4832943 - this.anInt6019 * 2008775727) / (float) (this.anInt6018 * -4832943), 1672591171);
		} else {
			this.aClass672_1.method33248(this.aClass672_3, (byte) -66);
			if (this.aClass672_1.aClass562_3 != null) {
				this.aClass672_1.aClass562_3.method31355(1958909974);
			}
			this.anInt6019 = -1162824399;
		}
		this.aLong307 = local7 * 3202058925841662635L;
	}

	@OriginalMember(owner = "client!xu", name = "bn", descriptor = "(Lclient!xv;I)V")
	void method33205(@OriginalArg(0) Class672 arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean875) {
			this.aBoolean875 = false;
			arg1 = 0;
		}
		if (this.aClass672_3.method33236(arg0, 2120079549)) {
			return;
		}
		this.aClass672_3.method33248(arg0, (byte) -94);
		this.aLong307 = Class305.method26889(1280896867) * 3202058925841662635L;
		this.anInt6018 = (this.anInt6019 = arg1 * 1162824399) * 1573029247;
		if (this.anInt6018 * -4832943 == 0) {
			return;
		}
		this.aClass672_2.method33248(this.aClass672_1, (byte) 55);
		if (this.aClass672_1.aClass562_3 == null) {
			return;
		}
		if (this.aClass672_1.aClass562_3.method31357((byte) 0)) {
			this.aClass672_1.aClass562_3 = this.aClass672_2.aClass562_3 = this.aClass672_1.aClass562_3.method31339(1028605865);
		}
		if (this.aClass672_1.aClass562_3 != null && this.aClass672_3.aClass562_3 != this.aClass672_1.aClass562_3) {
			this.aClass672_1.aClass562_3.method31359(this.aClass672_3.aClass562_3, 2009070702);
		}
	}

	@OriginalMember(owner = "client!xu", name = "bb", descriptor = "()V")
	void method33206() {
		this.aClass104_13.method20533(((float) Class51.aClass93_Sub36_1.aClass166_Sub7_1.method15514((byte) -106) * 0.1F + 0.7F + client.aClass532_1.method30629(-1764688948)) * this.aClass672_1.aFloat357);
		this.aClass104_13.method20534(this.aClass672_1.anInt6023 * 1540075243, this.aClass672_1.aFloat352, this.aClass672_1.aFloat354, (float) ((int) this.aClass472_64.aFloat325 << 2), (float) ((int) this.aClass472_64.aFloat326 << 2), (float) ((int) this.aClass472_64.aFloat327 << 2));
		this.aClass104_13.method20827(this.aClass672_1.aClass107_2);
	}

	@OriginalMember(owner = "client!xu", name = "be", descriptor = "(FFFIIIII)V")
	public void method33207(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass104_13.method20533(((float) Class51.aClass93_Sub36_1.aClass166_Sub7_1.method15514((byte) -66) * 0.1F + 0.7F + client.aClass532_1.method30629(365784513)) * arg0);
		this.aClass104_13.method20534(arg3, arg1, arg2, (float) (arg4 << 2), (float) (arg5 << 2), (float) (arg6 << 2));
		this.aClass104_13.method20827(this.method33150(arg7, 2126752395));
	}

	@OriginalMember(owner = "client!xu", name = "by", descriptor = "()V")
	public void method33208() {
		@Pc(1) byte local1 = 0;
		@Pc(13) int local13 = (this.aClass672_1.anInt6022 * -2139322713 + 256 << 2) + local1;
		this.aClass104_13.method20883(this.aClass672_1.anInt6021 * -2016142599, Class51.aClass93_Sub36_1.aClass166_Sub2_1.method15388(-1522894148) == 1 ? local13 : -1, 0);
	}

	@OriginalMember(owner = "client!xu", name = "bu", descriptor = "()V")
	void method33209() {
		this.aClass104_13.method20554(this.aClass672_1.aFloat360, this.aClass672_1.aFloat353, this.aClass672_1.aFloat356, -1956409172);
	}

	@OriginalMember(owner = "client!xu", name = "bz", descriptor = "()V")
	void method33210() {
		this.aClass104_13.method20554(this.aClass672_1.aFloat360, this.aClass672_1.aFloat353, this.aClass672_1.aFloat356, 1422197806);
	}

	@OriginalMember(owner = "client!xu", name = "bo", descriptor = "()V")
	void method33211() {
		this.aClass104_13.method20554(this.aClass672_1.aFloat360, this.aClass672_1.aFloat353, this.aClass672_1.aFloat356, 1505562315);
	}

	@OriginalMember(owner = "client!xu", name = "br", descriptor = "()V")
	void method33212() {
		if (!this.aClass104_13.method20463()) {
			return;
		}
		if (this.aBoolean877) {
			this.aClass104_13.method20547(this.aFloat348, this.aFloat349, this.aFloat350, this.aFloat347, this.aFloat351);
		} else {
			this.aClass104_13.method20547(this.aClass672_1.aFloat359, this.aClass672_1.aFloat355, this.aClass672_1.aFloat361, this.aClass672_1.aFloat362, this.aClass672_1.aFloat358);
		}
	}

	@OriginalMember(owner = "client!xu", name = "bv", descriptor = "()V")
	void method33213() {
		if (!this.aClass104_13.method20463()) {
			return;
		}
		if (this.aBoolean877) {
			this.aClass104_13.method20547(this.aFloat348, this.aFloat349, this.aFloat350, this.aFloat347, this.aFloat351);
		} else {
			this.aClass104_13.method20547(this.aClass672_1.aFloat359, this.aClass672_1.aFloat355, this.aClass672_1.aFloat361, this.aClass672_1.aFloat362, this.aClass672_1.aFloat358);
		}
	}

	@OriginalMember(owner = "client!xu", name = "v", descriptor = "(Lclient!rl;I)Lclient!xv;")
	Class672 method33214(@OriginalArg(0) Class532 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) Class672 local1 = null;
		@Pc(3) int local3 = -1;
		@Pc(5) int local5 = -1;
		if (Class1.method15(client.anInt3435 * -849002901, 494650525) || Class56.method18046(client.anInt3435 * -849002901, -1497248091)) {
			local3 = Class163.anInt2002 * -1331168249 >> 12;
			local5 = Class270.anInt3925 * 466086187 >> 12;
		} else {
			if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 != null) {
				local3 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anIntArray240[0] >> 3;
				local5 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anIntArray239[0] >> 3;
			}
			if (local3 < 0 || local3 >= arg0.method30625(-797578492) >> 3 || local5 < 0 || local5 >= arg0.method30655((short) 128) >> 3) {
				local3 = arg0.method30625(-1767243829) >> 4;
				local5 = arg0.method30655((short) 128) >> 4;
			}
		}
		local1 = this.aClass672ArrayArray1[local3][local5];
		if (local1 == null) {
			local1 = this.aClass672_5;
		}
		return local1;
	}

	@OriginalMember(owner = "client!xu", name = "ap", descriptor = "(Lclient!xu;)V")
	public void method33215(@OriginalArg(0) Class671 arg0) {
		this.aClass672_1.method33248(arg0.aClass672_1, (byte) -2);
		this.aClass672_2.method33248(arg0.aClass672_2, (byte) -47);
		this.aClass672_3.method33248(arg0.aClass672_3, (byte) -46);
		this.aLong307 = arg0.aLong307;
		this.anInt6018 = arg0.anInt6018;
		this.anInt6019 = arg0.anInt6019;
	}

	@OriginalMember(owner = "client!xu", name = "au", descriptor = "()Lclient!xv;")
	public Class672 method33216() {
		return this.aClass672_1;
	}

	@OriginalMember(owner = "client!xu", name = "bp", descriptor = "()V")
	void method33217() {
		this.aBoolean877 = false;
		this.aFloat348 = 1.0F;
		this.aFloat349 = 0.0F;
		this.aFloat350 = 1.0F;
		this.aFloat347 = 0.0F;
		this.aFloat351 = 1.0F;
	}

	@OriginalMember(owner = "client!xu", name = "bj", descriptor = "()V")
	void method33218() {
		if (!this.aClass104_13.method20549()) {
			return;
		}
		@Pc(6) Class102 local6 = null;
		@Pc(8) Class102 local8 = null;
		@Pc(10) Class102 local10 = null;
		if (!this.aBoolean876) {
			if (this.aClass672_1.anIntArray517[0] > -1) {
				local6 = this.method33152(this.aClass672_1.anIntArray517[0], (byte) 52);
			}
			if (this.aClass672_1.anIntArray517[1] > -1) {
				local8 = this.method33152(this.aClass672_1.anIntArray517[1], (byte) 56);
			}
			if (this.aClass672_1.anIntArray517[2] > -1) {
				local10 = this.method33152(this.aClass672_1.anIntArray517[2], (byte) 78);
			}
			this.aClass104_13.method20550(local6, this.aClass672_1.aFloatArray121[0], local8, this.aClass672_1.aFloatArray121[1], local10, this.aClass672_1.aFloatArray121[2]);
			return;
		}
		if (this.anIntArray516[0] > -1) {
			local6 = this.method33152(this.anIntArray516[0], (byte) 34);
		}
		if (this.anIntArray516[1] > -1) {
			local8 = this.method33152(this.anIntArray516[1], (byte) 102);
		}
		if (this.anIntArray516[2] > -1) {
			local10 = this.method33152(this.anIntArray516[2], (byte) 120);
		}
		this.aClass104_13.method20550(local6, this.aFloatArray120[0], local8, this.aFloatArray120[1], local10, this.aFloatArray120[2]);
	}

	@OriginalMember(owner = "client!xu", name = "h", descriptor = "(I)V")
	void method33219(@OriginalArg(0) int arg0) {
		this.aClass104_13.method20554(this.aClass672_1.aFloat360, this.aClass672_1.aFloat353, this.aClass672_1.aFloat356, 1068596690);
	}

	@OriginalMember(owner = "client!xu", name = "cl", descriptor = "()V")
	void method33220() {
		this.aBoolean876 = false;
		@Pc(5) int[] local5 = this.anIntArray516;
		@Pc(8) int[] local8 = this.anIntArray516;
		this.anIntArray516[2] = -1;
		local8[1] = -1;
		local5[0] = -1;
		@Pc(24) float[] local24 = this.aFloatArray120;
		@Pc(27) float[] local27 = this.aFloatArray120;
		this.aFloatArray120[2] = 0.0F;
		local27[1] = 0.0F;
		local24[0] = 0.0F;
	}

	@OriginalMember(owner = "client!xu", name = "cg", descriptor = "()V")
	void method33221() {
		this.aBoolean876 = false;
		@Pc(5) int[] local5 = this.anIntArray516;
		@Pc(8) int[] local8 = this.anIntArray516;
		this.anIntArray516[2] = -1;
		local8[1] = -1;
		local5[0] = -1;
		@Pc(24) float[] local24 = this.aFloatArray120;
		@Pc(27) float[] local27 = this.aFloatArray120;
		this.aFloatArray120[2] = 0.0F;
		local27[1] = 0.0F;
		local24[0] = 0.0F;
	}

	@OriginalMember(owner = "client!xu", name = "bk", descriptor = "(II)V")
	public void method33222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class672 local6 = this.aClass672ArrayArray1[arg0][arg1];
		if (local6 != null) {
			this.aClass472_64.method29719(local6.aClass472_65);
		}
		this.method33173(-88771964);
	}

	@OriginalMember(owner = "client!xu", name = "cu", descriptor = "()V")
	public void method33223() {
		this.aClass104_13.method20533(((float) Class51.aClass93_Sub36_1.aClass166_Sub7_1.method15514((byte) -127) * 0.1F + 0.7F + client.aClass532_1.method30629(648195851)) * 1.1523438F);
		this.aClass104_13.method20534(16777215, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
		this.aClass104_13.method20883(13156520, -1, 0);
		this.aClass104_13.method20827(aClass107_1);
	}
}
