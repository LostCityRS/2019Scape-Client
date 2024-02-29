package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pp")
public abstract class Class144 {

	@OriginalMember(owner = "client!pp", name = "n", descriptor = "I")
	static final int anInt1332 = 500;

	@OriginalMember(owner = "client!pp", name = "k", descriptor = "I")
	static final int anInt1333 = 102400;

	@OriginalMember(owner = "client!pp", name = "f", descriptor = "I")
	static final int anInt1334 = 5;

	@OriginalMember(owner = "client!pp", name = "w", descriptor = "I")
	static final int anInt1335 = 5;

	@OriginalMember(owner = "client!pp", name = "m", descriptor = "I")
	static final int anInt1336 = 500;

	@OriginalMember(owner = "client!pp", name = "e", descriptor = "I")
	static final int anInt1341 = 4;

	@OriginalMember(owner = "client!pp", name = "d", descriptor = "I")
	int anInt1331;

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "J")
	long aLong45;

	@OriginalMember(owner = "client!pp", name = "l", descriptor = "Lclient!aap;")
	Class18 aClass18_7 = new Class18();

	@OriginalMember(owner = "client!pp", name = "u", descriptor = "Lclient!aap;")
	Class18 aClass18_9 = new Class18();

	@OriginalMember(owner = "client!pp", name = "z", descriptor = "Lclient!aap;")
	Class18 aClass18_8 = new Class18();

	@OriginalMember(owner = "client!pp", name = "p", descriptor = "Lclient!aap;")
	Class18 aClass18_6 = new Class18();

	@OriginalMember(owner = "client!pp", name = "r", descriptor = "Lclient!alw;")
	Class93_Sub41 aClass93_Sub41_5 = new Class93_Sub41(6);

	@OriginalMember(owner = "client!pp", name = "v", descriptor = "B")
	byte aByte22 = 0;

	@OriginalMember(owner = "client!pp", name = "o", descriptor = "I")
	public volatile int anInt1338 = 0;

	@OriginalMember(owner = "client!pp", name = "s", descriptor = "I")
	public volatile int anInt1337 = 0;

	@OriginalMember(owner = "client!pp", name = "y", descriptor = "I")
	public volatile int anInt1340 = 2057883105;

	@OriginalMember(owner = "client!pp", name = "q", descriptor = "I")
	public volatile int anInt1339 = 1058402615;

	@OriginalMember(owner = "client!pp", name = "x", descriptor = "Lclient!alw;")
	Class93_Sub41 aClass93_Sub41_6 = new Class93_Sub41(5);

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "Lclient!alw;")
	Class93_Sub41 aClass93_Sub41_7 = new Class93_Sub41(5);

	@OriginalMember(owner = "client!pp", name = "h", descriptor = "I")
	int anInt1342 = 0;

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "Lclient!auq;")
	Class93_Sub1_Sub16_Sub3 aClass93_Sub1_Sub16_Sub3_2 = null;

	@OriginalMember(owner = "client!pp", name = "ju", descriptor = "(Lclient!yf;I)V")
	static void method11174(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= 1189701933;
	}

	@OriginalMember(owner = "client!pp", name = "ls", descriptor = "(Lclient!yf;I)V")
	static void method11175(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		Class336.method27537(local11, arg0, -2125532282);
	}

	@OriginalMember(owner = "client!pp", name = "avt", descriptor = "(Lclient!yf;I)V")
	static void method11176(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= -1915563430;
		client.aShort149 = (short) arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		if (client.aShort149 <= 0) {
			client.aShort149 = 256;
		}
		client.aShort154 = (short) arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		if (client.aShort154 <= 0) {
			client.aShort154 = 320;
		}
	}

	@OriginalMember(owner = "client!pp", name = "axt", descriptor = "(Lclient!yf;I)V")
	static void method11177(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		Class624.method32341(682408472);
	}

	@OriginalMember(owner = "client!pp", name = "tj", descriptor = "(Lclient!yf;I)V")
	static void method11178(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		Class229.method25712(local11, arg0, (byte) 115);
	}

	@OriginalMember(owner = "client!pp", name = "lq", descriptor = "(IZB)V")
	public static void method11179(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte arg2) {
		if (Class121.aClass93_Sub28_2 == null || (arg0 < 0 || arg0 >= Class121.aClass93_Sub28_2.anInt1602 * -1052058559)) {
			return;
		}
		@Pc(16) Class373 local16 = Class121.aClass93_Sub28_2.aClass373Array1[arg0];
		@Pc(19) Class175 local19 = Class330.method27465(-1785088084);
		@Pc(25) Class93_Sub22 local25 = Class102.method2592(Class446.aClass446_26, local19.aClass24_2, (byte) 45);
		local25.aClass93_Sub41_Sub2_1.method22522(Class46.method894(local16.aString200, -2040713700) + 3, (byte) -119);
		local25.aClass93_Sub41_Sub2_1.method22466(arg0, 2134676113);
		local25.aClass93_Sub41_Sub2_1.method22522(arg1 ? 1 : 0, (byte) -122);
		local25.aClass93_Sub41_Sub2_1.method22414(local16.aString200, 847251325);
		local19.method24363(local25, -2002556899);
	}

	@OriginalMember(owner = "client!pp", name = "oe", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V")
	static void method11180(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt6049 -= 957530791) * 587908375];
		if (Class532.method30778(local13, arg2, 1518522314) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray17 = Class499.method30329(local13, arg2, 1122272746);
		arg0.aBoolean684 = true;
	}

	@OriginalMember(owner = "client!pp", name = "<init>", descriptor = "()V")
	Class144() {
	}

	@OriginalMember(owner = "client!pp", name = "z", descriptor = "(ZI)V")
	public abstract void method11144(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!pp", name = "e", descriptor = "(IIBZI)Lclient!auq;")
	final Class93_Sub1_Sub16_Sub3 method11145(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		@Pc(7) long local7 = (long) arg1 + ((long) arg0 << 32);
		@Pc(11) Class93_Sub1_Sub16_Sub3 local11 = new Class93_Sub1_Sub16_Sub3();
		local11.aLong233 = local7 * -5463674641158180937L;
		local11.aByte93 = arg2;
		local11.aBoolean545 = arg3;
		if (arg3) {
			if (this.method11155(2134235145) >= 500) {
				throw new RuntimeException();
			}
			this.aClass18_7.method268(local11, -134847015);
		} else if (this.method11147(299866863) < 500) {
			this.aClass18_8.method268(local11, -88650003);
		} else {
			throw new RuntimeException();
		}
		return local11;
	}

	@OriginalMember(owner = "client!pp", name = "m", descriptor = "(I)Z")
	public final boolean method11146(@OriginalArg(0) int arg0) {
		return this.method11155(2085251621) >= 500;
	}

	@OriginalMember(owner = "client!pp", name = "k", descriptor = "(I)I")
	final int method11147(@OriginalArg(0) int arg0) {
		return this.aClass18_8.method249(-2056881757) + this.aClass18_6.method249(1092862163);
	}

	@OriginalMember(owner = "client!pp", name = "p", descriptor = "(I)V")
	public abstract void method11148(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!pp", name = "w", descriptor = "(IIB)V")
	abstract void method11149(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2);

	@OriginalMember(owner = "client!pp", name = "l", descriptor = "(I)Z")
	public abstract boolean method11150(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!pp", name = "u", descriptor = "(Ljava/lang/Object;ZI)V")
	public abstract void method11151(@OriginalArg(0) Object arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!pp", name = "s", descriptor = "()I")
	public final int method11152() {
		return this.aClass18_7.method249(778651134) + this.aClass18_9.method249(1634507341);
	}

	@OriginalMember(owner = "client!pp", name = "x", descriptor = "(II)V")
	abstract void method11153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!pp", name = "d", descriptor = "(I)V")
	public abstract void method11154(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!pp", name = "f", descriptor = "(I)I")
	public final int method11155(@OriginalArg(0) int arg0) {
		return this.aClass18_7.method249(-1708049465) + this.aClass18_9.method249(398137185);
	}

	@OriginalMember(owner = "client!pp", name = "r", descriptor = "()Z")
	public final boolean method11156() {
		return this.method11147(299866863) >= 500;
	}

	@OriginalMember(owner = "client!pp", name = "v", descriptor = "()Z")
	public final boolean method11157() {
		return this.method11155(2119360815) >= 500;
	}

	@OriginalMember(owner = "client!pp", name = "o", descriptor = "()Z")
	public final boolean method11158() {
		return this.method11155(2035963185) >= 500;
	}

	@OriginalMember(owner = "client!pp", name = "t", descriptor = "()V")
	public abstract void method11159();

	@OriginalMember(owner = "client!pp", name = "y", descriptor = "()I")
	public final int method11160() {
		return this.aClass18_7.method249(-845474440) + this.aClass18_9.method249(474581694);
	}

	@OriginalMember(owner = "client!pp", name = "q", descriptor = "(II)V")
	abstract void method11161(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!pp", name = "n", descriptor = "(I)Z")
	public final boolean method11162(@OriginalArg(0) int arg0) {
		return this.method11147(299866863) >= 500;
	}

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "()Z")
	public abstract boolean method11163();

	@OriginalMember(owner = "client!pp", name = "h", descriptor = "(Ljava/lang/Object;Z)V")
	public abstract void method11164(@OriginalArg(0) Object arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(Z)V")
	public abstract void method11165(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!pp", name = "g", descriptor = "()V")
	public abstract void method11166();

	@OriginalMember(owner = "client!pp", name = "i", descriptor = "()V")
	public abstract void method11167();

	@OriginalMember(owner = "client!pp", name = "j", descriptor = "()V")
	public abstract void method11168();

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "(I)V")
	public abstract void method11169(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!pp", name = "ae", descriptor = "()V")
	public abstract void method11170();

	@OriginalMember(owner = "client!pp", name = "ag", descriptor = "()V")
	public abstract void method11171();

	@OriginalMember(owner = "client!pp", name = "ah", descriptor = "()V")
	public abstract void method11172();

	@OriginalMember(owner = "client!pp", name = "al", descriptor = "()V")
	public abstract void method11173();
}
