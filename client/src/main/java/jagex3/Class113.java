package jagex3;

import java.nio.ByteBuffer;
import java.util.Arrays;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ek")
public class Class113 implements Interface20 {

	@OriginalMember(owner = "client!ek", name = "ix", descriptor = "Lclient!wy;")
	public static Class651 aClass651_2;

	@OriginalMember(owner = "client!ek", name = "e", descriptor = "Lclient!abj;")
	public final Interface3 anInterface3_2;

	@OriginalMember(owner = "client!ek", name = "k", descriptor = "([BS)Lclient!asc;")
	static Class93_Sub1_Sub13 method7407(@OriginalArg(0) byte[] arg0, @OriginalArg(1) short arg1) {
		return new Class93_Sub1_Sub13(new Class93_Sub41(arg0), Class506.anInterface21_4);
	}

	@OriginalMember(owner = "client!ek", name = "mh", descriptor = "(Lclient!yf;I)V")
	static void method7408(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, 558428714);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class623.method32330(local16, local22, arg0, -1878678180);
	}

	@OriginalMember(owner = "client!ek", name = "aib", descriptor = "(Lclient!yf;I)V")
	static void method7409(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		arg0.aClass434_1.anIntArray447[local13] = local23;
	}

	@OriginalMember(owner = "client!ek", name = "apo", descriptor = "(Lclient!yf;I)V")
	static void method7410(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		if (!Class251.method26066(660486859)) {
			Class594.method31921(1789993859);
		}
	}

	@OriginalMember(owner = "client!ek", name = "e", descriptor = "([BZI)Ljava/lang/Object;")
	public static Object method7411(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (arg0 == null) {
			return null;
		} else if (arg0.length > 136) {
			@Pc(12) ByteBuffer local12 = ByteBuffer.allocateDirect(arg0.length);
			local12.position(0);
			local12.put(arg0);
			return local12;
		} else if (arg1) {
			return Arrays.copyOf(arg0, arg0.length);
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Lclient!add;)V")
	public Class113(@OriginalArg(0) Class79_Sub1 arg0) {
		this(arg0, new Class40(arg0));
	}

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Lclient!qe;Lclient!abn;)V")
	public Class113(@OriginalArg(0) Class138 arg0, @OriginalArg(1) Class40 arg1) {
		this.anInterface3_2 = arg1;
	}

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Lclient!add;Lclient!abn;)V")
	Class113(@OriginalArg(0) Class79_Sub1 arg0, @OriginalArg(1) Class40 arg1) {
		this(arg0.aClass138_3, arg1);
	}

	@OriginalMember(owner = "client!ek", name = "as", descriptor = "(Lclient!kh;)I")
	@Override
	public final int method33641(@OriginalArg(0) Class379 arg0) {
		return arg0.method28261(this.method33636(arg0.aClass108_1, 96794047), 1645126520);
	}

	@OriginalMember(owner = "client!ek", name = "y", descriptor = "(Lclient!kh;I)V")
	@Override
	public final void method33660(@OriginalArg(0) Class379 arg0, @OriginalArg(1) int arg1) throws Exception_Sub7 {
		this.method33645(arg0.aClass108_1, arg0.method28263(this.method33636(arg0.aClass108_1, 1916942414), arg1, -2002624152), 908369267);
	}

	@OriginalMember(owner = "client!ek", name = "r", descriptor = "(Lclient!ec;Ljava/lang/Object;)V")
	@Override
	public void method33657(@OriginalArg(0) Class108 arg0, @OriginalArg(1) Object arg1) {
		this.anInterface3_2.method776(arg0.anInt867 * -1284841473, arg1, (byte) 17);
	}

	@OriginalMember(owner = "client!ek", name = "u", descriptor = "(Lclient!ec;I)I")
	@Override
	public final int method33636(@OriginalArg(0) Class108 arg0, @OriginalArg(1) int arg1) {
		return this.anInterface3_2.method781(arg0.anInt867 * -1284841473, -1267242705);
	}

	@OriginalMember(owner = "client!ek", name = "e", descriptor = "(Lclient!ec;II)V")
	@Override
	public void method33645(@OriginalArg(0) Class108 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInterface3_2.method772(arg0.anInt867 * -1284841473, arg1, (byte) -1);
	}

	@OriginalMember(owner = "client!ek", name = "n", descriptor = "(Lclient!ec;I)J")
	@Override
	public final long method33646(@OriginalArg(0) Class108 arg0, @OriginalArg(1) int arg1) {
		return this.anInterface3_2.method779(arg0.anInt867 * -1284841473, 1308842198);
	}

	@OriginalMember(owner = "client!ek", name = "m", descriptor = "(Lclient!ec;J)V")
	@Override
	public void method33647(@OriginalArg(0) Class108 arg0, @OriginalArg(1) long arg1) {
		this.anInterface3_2.method787(arg0.anInt867 * -1284841473, arg1);
	}

	@OriginalMember(owner = "client!ek", name = "k", descriptor = "(Lclient!ec;B)Ljava/lang/Object;")
	@Override
	public final Object method33648(@OriginalArg(0) Class108 arg0, @OriginalArg(1) byte arg1) {
		return this.anInterface3_2.method775(arg0.anInt867 * -1284841473, 2007776752);
	}

	@OriginalMember(owner = "client!ek", name = "f", descriptor = "(Lclient!ec;Ljava/lang/Object;I)V")
	@Override
	public void method33649(@OriginalArg(0) Class108 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		this.anInterface3_2.method776(arg0.anInt867 * -1284841473, arg1, (byte) 74);
	}

	@OriginalMember(owner = "client!ek", name = "v", descriptor = "(Lclient!ec;Ljava/lang/Object;)V")
	@Override
	public void method33658(@OriginalArg(0) Class108 arg0, @OriginalArg(1) Object arg1) {
		this.anInterface3_2.method776(arg0.anInt867 * -1284841473, arg1, (byte) 101);
	}

	@OriginalMember(owner = "client!ek", name = "w", descriptor = "(Lclient!kh;II)V")
	@Override
	public final void method33650(@OriginalArg(0) Class379 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws Exception_Sub7 {
		this.method33645(arg0.aClass108_1, arg0.method28263(this.method33636(arg0.aClass108_1, -187351012), arg1, -2058420383), 908369267);
	}

	@OriginalMember(owner = "client!ek", name = "ah", descriptor = "(Lclient!ec;)I")
	@Override
	public final int method33637(@OriginalArg(0) Class108 arg0) {
		return this.anInterface3_2.method781(arg0.anInt867 * -1284841473, -1267242705);
	}

	@OriginalMember(owner = "client!ek", name = "al", descriptor = "(Lclient!ec;)I")
	@Override
	public final int method33638(@OriginalArg(0) Class108 arg0) {
		return this.anInterface3_2.method781(arg0.anInt867 * -1284841473, -1267242705);
	}

	@OriginalMember(owner = "client!ek", name = "ac", descriptor = "(Lclient!ec;)I")
	@Override
	public final int method33639(@OriginalArg(0) Class108 arg0) {
		return this.anInterface3_2.method781(arg0.anInt867 * -1284841473, -1267242705);
	}

	@OriginalMember(owner = "client!ek", name = "ai", descriptor = "(Lclient!ec;)I")
	@Override
	public final int method33640(@OriginalArg(0) Class108 arg0) {
		return this.anInterface3_2.method781(arg0.anInt867 * -1284841473, -1267242705);
	}

	@OriginalMember(owner = "client!ek", name = "aw", descriptor = "(Lclient!kh;)I")
	@Override
	public final int method33642(@OriginalArg(0) Class379 arg0) {
		return arg0.method28261(this.method33636(arg0.aClass108_1, 457508088), 106367721);
	}

	@OriginalMember(owner = "client!ek", name = "at", descriptor = "(Lclient!kh;)I")
	@Override
	public final int method33643(@OriginalArg(0) Class379 arg0) {
		return arg0.method28261(this.method33636(arg0.aClass108_1, 1838569600), 1316247786);
	}

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "(Lclient!ec;J)V")
	@Override
	public void method33656(@OriginalArg(0) Class108 arg0, @OriginalArg(1) long arg1) {
		this.anInterface3_2.method787(arg0.anInt867 * -1284841473, arg1);
	}

	@OriginalMember(owner = "client!ek", name = "p", descriptor = "(Lclient!ec;)J")
	@Override
	public final long method33654(@OriginalArg(0) Class108 arg0) {
		return this.anInterface3_2.method779(arg0.anInt867 * -1284841473, 1899499644);
	}

	@OriginalMember(owner = "client!ek", name = "d", descriptor = "(Lclient!ec;J)V")
	@Override
	public void method33655(@OriginalArg(0) Class108 arg0, @OriginalArg(1) long arg1) {
		this.anInterface3_2.method787(arg0.anInt867 * -1284841473, arg1);
	}

	@OriginalMember(owner = "client!ek", name = "s", descriptor = "(Lclient!ec;Ljava/lang/Object;)V")
	@Override
	public void method33664(@OriginalArg(0) Class108 arg0, @OriginalArg(1) Object arg1) {
		this.anInterface3_2.method776(arg0.anInt867 * -1284841473, arg1, (byte) 11);
	}

	@OriginalMember(owner = "client!ek", name = "l", descriptor = "(Lclient!ec;I)V")
	@Override
	public void method33651(@OriginalArg(0) Class108 arg0, @OriginalArg(1) int arg1) {
		this.anInterface3_2.method772(arg0.anInt867 * -1284841473, arg1, (byte) -1);
	}

	@OriginalMember(owner = "client!ek", name = "o", descriptor = "(Lclient!ec;Ljava/lang/Object;)V")
	@Override
	public void method33659(@OriginalArg(0) Class108 arg0, @OriginalArg(1) Object arg1) {
		this.anInterface3_2.method776(arg0.anInt867 * -1284841473, arg1, (byte) 122);
	}

	@OriginalMember(owner = "client!ek", name = "z", descriptor = "(Lclient!kh;I)I")
	@Override
	public final int method33635(@OriginalArg(0) Class379 arg0, @OriginalArg(1) int arg1) {
		return arg0.method28261(this.method33636(arg0.aClass108_1, -12187856), 774139946);
	}

	@OriginalMember(owner = "client!ek", name = "q", descriptor = "(Lclient!kh;I)V")
	@Override
	public final void method33644(@OriginalArg(0) Class379 arg0, @OriginalArg(1) int arg1) throws Exception_Sub7 {
		this.method33645(arg0.aClass108_1, arg0.method28263(this.method33636(arg0.aClass108_1, -1833851763), arg1, -2117347028), 908369267);
	}

	@OriginalMember(owner = "client!ek", name = "x", descriptor = "(Lclient!kh;I)V")
	@Override
	public final void method33653(@OriginalArg(0) Class379 arg0, @OriginalArg(1) int arg1) throws Exception_Sub7 {
		this.method33645(arg0.aClass108_1, arg0.method28263(this.method33636(arg0.aClass108_1, 2143845029), arg1, -2107677091), 908369267);
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(Lclient!ec;)Ljava/lang/Object;")
	@Override
	public final Object method33662(@OriginalArg(0) Class108 arg0) {
		return this.anInterface3_2.method775(arg0.anInt867 * -1284841473, -967718867);
	}

	@OriginalMember(owner = "client!ek", name = "h", descriptor = "(Lclient!ec;)Ljava/lang/Object;")
	@Override
	public final Object method33663(@OriginalArg(0) Class108 arg0) {
		return this.anInterface3_2.method775(arg0.anInt867 * -1284841473, -1479505925);
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lclient!ec;)Ljava/lang/Object;")
	@Override
	public final Object method33661(@OriginalArg(0) Class108 arg0) {
		return this.anInterface3_2.method775(arg0.anInt867 * -1284841473, -1346279048);
	}

	@OriginalMember(owner = "client!ek", name = "g", descriptor = "(Lclient!ec;)Ljava/lang/Object;")
	@Override
	public final Object method33652(@OriginalArg(0) Class108 arg0) {
		return this.anInterface3_2.method775(arg0.anInt867 * -1284841473, 925835624);
	}
}
