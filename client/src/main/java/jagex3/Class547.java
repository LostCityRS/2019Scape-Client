package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class547 implements Interface20 {

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "Lclient!ahm;")
	Class132_Sub1_Sub1_Sub1 aClass132_Sub1_Sub1_Sub1_3;

	@OriginalMember(owner = "client!sd", name = "dj", descriptor = "(Lclient!yf;B)V")
	static void method31187(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, -674309509);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class81.method1378(local16, local22, arg0, 759834328);
	}

	@OriginalMember(owner = "client!sd", name = "yi", descriptor = "(Lclient!yf;I)V")
	static void method31188(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
	}

	@OriginalMember(owner = "client!sd", name = "zq", descriptor = "(Lclient!yf;I)V")
	static void method31189(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= -725861497;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		@Pc(33) int local33 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 2];
		if (local23 == -1) {
			throw new RuntimeException();
		}
		@Pc(46) Class39 local46 = (Class39) Class19.aClass32_Sub7_5.method18273(local23, -313640571);
		if (local46.aClass519_1.method37101() != local13) {
			throw new RuntimeException();
		}
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local46.method751(local33, (byte) 0) ? 1 : 0;
	}

	@OriginalMember(owner = "client!sd", name = "dn", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V")
	static void method31190(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		arg2.anInt6052 -= -1451722994;
		arg0.anInt4045 = arg2.anIntArray521[arg2.anInt6052 * -1497248091] * 1374942797;
		arg0.anInt4083 = arg2.anIntArray521[arg2.anInt6052 * -1497248091 + 1] * -1307366991;
		arg0.anInt4047 = arg2.anIntArray521[arg2.anInt6052 * -1497248091 + 2] * -237522641;
		arg0.anInt4048 = arg2.anIntArray521[arg2.anInt6052 * -1497248091 + 3] * 1060356621;
		arg0.anInt4085 = arg2.anIntArray521[arg2.anInt6052 * -1497248091 + 4] * 448638937;
		arg0.anInt4069 = arg2.anIntArray521[arg2.anInt6052 * -1497248091 + 5] * -1283265423;
		Class354.method27789(arg0, -1174743804);
		if (arg0.anInt4011 * 532402067 == -1 && !arg1.aBoolean712) {
			Class239.method25916(arg0.anInt3994 * -1549590237, -156727306);
			Class50.method1006(arg0.anInt3994 * -1549590237, 961338414);
		}
	}

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(Lclient!ahm;)V")
	Class547(@OriginalArg(0) Class132_Sub1_Sub1_Sub1 arg0) {
		this.aClass132_Sub1_Sub1_Sub1_3 = arg0;
	}

	@OriginalMember(owner = "client!sd", name = "r", descriptor = "(Lclient!ec;Ljava/lang/Object;)V")
	@Override
	public void method33657(@OriginalArg(0) Class108 arg0, @OriginalArg(1) Object arg1) {
		this.aClass132_Sub1_Sub1_Sub1_3.anInterface3_5.method776(arg0.anInt867 * -1284841473, arg1, (byte) 76);
	}

	@OriginalMember(owner = "client!sd", name = "u", descriptor = "(Lclient!ec;I)I")
	@Override
	public int method33636(@OriginalArg(0) Class108 arg0, @OriginalArg(1) int arg1) {
		return this.aClass132_Sub1_Sub1_Sub1_3.anInterface3_5.method781(arg0.anInt867 * -1284841473, -1267242705);
	}

	@OriginalMember(owner = "client!sd", name = "n", descriptor = "(Lclient!ec;I)J")
	@Override
	public long method33646(@OriginalArg(0) Class108 arg0, @OriginalArg(1) int arg1) {
		return this.aClass132_Sub1_Sub1_Sub1_3.anInterface3_5.method779(arg0.anInt867 * -1284841473, 531176081);
	}

	@OriginalMember(owner = "client!sd", name = "k", descriptor = "(Lclient!ec;B)Ljava/lang/Object;")
	@Override
	public Object method33648(@OriginalArg(0) Class108 arg0, @OriginalArg(1) byte arg1) {
		return this.aClass132_Sub1_Sub1_Sub1_3.anInterface3_5.method775(arg0.anInt867 * -1284841473, -164345361);
	}

	@OriginalMember(owner = "client!sd", name = "z", descriptor = "(Lclient!kh;I)I")
	@Override
	public int method33635(@OriginalArg(0) Class379 arg0, @OriginalArg(1) int arg1) {
		return arg0.method28261(this.method33636(arg0.aClass108_1, -1796463572), 1138619772);
	}

	@OriginalMember(owner = "client!sd", name = "p", descriptor = "(Lclient!ec;)J")
	@Override
	public long method33654(@OriginalArg(0) Class108 arg0) {
		return this.aClass132_Sub1_Sub1_Sub1_3.anInterface3_5.method779(arg0.anInt867 * -1284841473, 403052242);
	}

	@OriginalMember(owner = "client!sd", name = "al", descriptor = "(Lclient!ec;)I")
	@Override
	public int method33638(@OriginalArg(0) Class108 arg0) {
		return this.aClass132_Sub1_Sub1_Sub1_3.anInterface3_5.method781(arg0.anInt867 * -1284841473, -1267242705);
	}

	@OriginalMember(owner = "client!sd", name = "at", descriptor = "(Lclient!kh;)I")
	@Override
	public int method33643(@OriginalArg(0) Class379 arg0) {
		return arg0.method28261(this.method33636(arg0.aClass108_1, 1217151911), 1509207713);
	}

	@OriginalMember(owner = "client!sd", name = "w", descriptor = "(Lclient!kh;II)V")
	@Override
	public void method33650(@OriginalArg(0) Class379 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws Exception_Sub7 {
		this.method33645(arg0.aClass108_1, arg0.method28263(this.method33636(arg0.aClass108_1, -333663556), arg1, -2041684909), 908369267);
	}

	@OriginalMember(owner = "client!sd", name = "ah", descriptor = "(Lclient!ec;)I")
	@Override
	public int method33637(@OriginalArg(0) Class108 arg0) {
		return this.aClass132_Sub1_Sub1_Sub1_3.anInterface3_5.method781(arg0.anInt867 * -1284841473, -1267242705);
	}

	@OriginalMember(owner = "client!sd", name = "l", descriptor = "(Lclient!ec;I)V")
	@Override
	public void method33651(@OriginalArg(0) Class108 arg0, @OriginalArg(1) int arg1) {
		this.aClass132_Sub1_Sub1_Sub1_3.anInterface3_5.method772(arg0.anInt867 * -1284841473, arg1, (byte) -1);
	}

	@OriginalMember(owner = "client!sd", name = "ac", descriptor = "(Lclient!ec;)I")
	@Override
	public int method33639(@OriginalArg(0) Class108 arg0) {
		return this.aClass132_Sub1_Sub1_Sub1_3.anInterface3_5.method781(arg0.anInt867 * -1284841473, -1267242705);
	}

	@OriginalMember(owner = "client!sd", name = "ai", descriptor = "(Lclient!ec;)I")
	@Override
	public int method33640(@OriginalArg(0) Class108 arg0) {
		return this.aClass132_Sub1_Sub1_Sub1_3.anInterface3_5.method781(arg0.anInt867 * -1284841473, -1267242705);
	}

	@OriginalMember(owner = "client!sd", name = "aw", descriptor = "(Lclient!kh;)I")
	@Override
	public int method33642(@OriginalArg(0) Class379 arg0) {
		return arg0.method28261(this.method33636(arg0.aClass108_1, -111435251), 209448755);
	}

	@OriginalMember(owner = "client!sd", name = "as", descriptor = "(Lclient!kh;)I")
	@Override
	public int method33641(@OriginalArg(0) Class379 arg0) {
		return arg0.method28261(this.method33636(arg0.aClass108_1, -302070107), 1144367445);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!ec;)Ljava/lang/Object;")
	@Override
	public Object method33661(@OriginalArg(0) Class108 arg0) {
		return this.aClass132_Sub1_Sub1_Sub1_3.anInterface3_5.method775(arg0.anInt867 * -1284841473, 1233770201);
	}

	@OriginalMember(owner = "client!sd", name = "v", descriptor = "(Lclient!ec;Ljava/lang/Object;)V")
	@Override
	public void method33658(@OriginalArg(0) Class108 arg0, @OriginalArg(1) Object arg1) {
		this.aClass132_Sub1_Sub1_Sub1_3.anInterface3_5.method776(arg0.anInt867 * -1284841473, arg1, (byte) 122);
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(Lclient!ec;J)V")
	@Override
	public void method33656(@OriginalArg(0) Class108 arg0, @OriginalArg(1) long arg1) {
		this.aClass132_Sub1_Sub1_Sub1_3.anInterface3_5.method787(arg0.anInt867 * -1284841473, arg1);
	}

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "(Lclient!ec;J)V")
	@Override
	public void method33655(@OriginalArg(0) Class108 arg0, @OriginalArg(1) long arg1) {
		this.aClass132_Sub1_Sub1_Sub1_3.anInterface3_5.method787(arg0.anInt867 * -1284841473, arg1);
	}

	@OriginalMember(owner = "client!sd", name = "f", descriptor = "(Lclient!ec;Ljava/lang/Object;I)V")
	@Override
	public void method33649(@OriginalArg(0) Class108 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		this.aClass132_Sub1_Sub1_Sub1_3.anInterface3_5.method776(arg0.anInt867 * -1284841473, arg1, (byte) 106);
	}

	@OriginalMember(owner = "client!sd", name = "m", descriptor = "(Lclient!ec;J)V")
	@Override
	public void method33647(@OriginalArg(0) Class108 arg0, @OriginalArg(1) long arg1) {
		this.aClass132_Sub1_Sub1_Sub1_3.anInterface3_5.method787(arg0.anInt867 * -1284841473, arg1);
	}

	@OriginalMember(owner = "client!sd", name = "o", descriptor = "(Lclient!ec;Ljava/lang/Object;)V")
	@Override
	public void method33659(@OriginalArg(0) Class108 arg0, @OriginalArg(1) Object arg1) {
		this.aClass132_Sub1_Sub1_Sub1_3.anInterface3_5.method776(arg0.anInt867 * -1284841473, arg1, (byte) 126);
	}

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "(Lclient!ec;II)V")
	@Override
	public void method33645(@OriginalArg(0) Class108 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass132_Sub1_Sub1_Sub1_3.anInterface3_5.method772(arg0.anInt867 * -1284841473, arg1, (byte) -1);
	}

	@OriginalMember(owner = "client!sd", name = "s", descriptor = "(Lclient!ec;Ljava/lang/Object;)V")
	@Override
	public void method33664(@OriginalArg(0) Class108 arg0, @OriginalArg(1) Object arg1) {
		this.aClass132_Sub1_Sub1_Sub1_3.anInterface3_5.method776(arg0.anInt867 * -1284841473, arg1, (byte) 81);
	}

	@OriginalMember(owner = "client!sd", name = "y", descriptor = "(Lclient!kh;I)V")
	@Override
	public void method33660(@OriginalArg(0) Class379 arg0, @OriginalArg(1) int arg1) throws Exception_Sub7 {
		this.method33645(arg0.aClass108_1, arg0.method28263(this.method33636(arg0.aClass108_1, -2066045678), arg1, -2030753914), 908369267);
	}

	@OriginalMember(owner = "client!sd", name = "q", descriptor = "(Lclient!kh;I)V")
	@Override
	public void method33644(@OriginalArg(0) Class379 arg0, @OriginalArg(1) int arg1) throws Exception_Sub7 {
		this.method33645(arg0.aClass108_1, arg0.method28263(this.method33636(arg0.aClass108_1, -84803698), arg1, -2007199535), 908369267);
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(Lclient!ec;)Ljava/lang/Object;")
	@Override
	public Object method33662(@OriginalArg(0) Class108 arg0) {
		return this.aClass132_Sub1_Sub1_Sub1_3.anInterface3_5.method775(arg0.anInt867 * -1284841473, -526109292);
	}

	@OriginalMember(owner = "client!sd", name = "h", descriptor = "(Lclient!ec;)Ljava/lang/Object;")
	@Override
	public Object method33663(@OriginalArg(0) Class108 arg0) {
		return this.aClass132_Sub1_Sub1_Sub1_3.anInterface3_5.method775(arg0.anInt867 * -1284841473, 1555550915);
	}

	@OriginalMember(owner = "client!sd", name = "g", descriptor = "(Lclient!ec;)Ljava/lang/Object;")
	@Override
	public Object method33652(@OriginalArg(0) Class108 arg0) {
		return this.aClass132_Sub1_Sub1_Sub1_3.anInterface3_5.method775(arg0.anInt867 * -1284841473, 1105399017);
	}

	@OriginalMember(owner = "client!sd", name = "x", descriptor = "(Lclient!kh;I)V")
	@Override
	public void method33653(@OriginalArg(0) Class379 arg0, @OriginalArg(1) int arg1) throws Exception_Sub7 {
		this.method33645(arg0.aClass108_1, arg0.method28263(this.method33636(arg0.aClass108_1, -1664081423), arg1, -2058294189), 908369267);
	}
}
