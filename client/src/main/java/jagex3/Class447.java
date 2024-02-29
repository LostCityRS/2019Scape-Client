package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ns")
public final class Class447 {

	@OriginalMember(owner = "client!ns", name = "i", descriptor = "I")
	static int anInt5115;

	@OriginalMember(owner = "client!ns", name = "e", descriptor = "Lclient!ns;")
	public static final Class447 aClass447_13 = new Class447(3);

	@OriginalMember(owner = "client!ns", name = "n", descriptor = "Lclient!ns;")
	public static final Class447 aClass447_2 = new Class447(7);

	@OriginalMember(owner = "client!ns", name = "m", descriptor = "Lclient!ns;")
	public static final Class447 aClass447_1 = new Class447(9);

	@OriginalMember(owner = "client!ns", name = "k", descriptor = "Lclient!ns;")
	public static final Class447 aClass447_5 = new Class447(11);

	@OriginalMember(owner = "client!ns", name = "f", descriptor = "Lclient!ns;")
	public static final Class447 aClass447_4 = new Class447(1);

	@OriginalMember(owner = "client!ns", name = "w", descriptor = "Lclient!ns;")
	public static final Class447 aClass447_3 = new Class447(6);

	@OriginalMember(owner = "client!ns", name = "l", descriptor = "Lclient!ns;")
	public static final Class447 aClass447_6 = new Class447(5);

	@OriginalMember(owner = "client!ns", name = "u", descriptor = "Lclient!ns;")
	public static final Class447 aClass447_7 = new Class447(2);

	@OriginalMember(owner = "client!ns", name = "z", descriptor = "Lclient!ns;")
	public static final Class447 aClass447_8 = new Class447(4);

	@OriginalMember(owner = "client!ns", name = "p", descriptor = "Lclient!ns;")
	public static final Class447 aClass447_9 = new Class447(8);

	@OriginalMember(owner = "client!ns", name = "d", descriptor = "Lclient!ns;")
	public static final Class447 aClass447_10 = new Class447(13);

	@OriginalMember(owner = "client!ns", name = "c", descriptor = "Lclient!ns;")
	static final Class447 aClass447_11 = new Class447(10);

	@OriginalMember(owner = "client!ns", name = "r", descriptor = "Lclient!ns;")
	static final Class447 aClass447_12 = new Class447(12);

	@OriginalMember(owner = "client!ns", name = "v", descriptor = "I")
	final int anInt5114;

	@OriginalMember(owner = "client!ns", name = "avk", descriptor = "(Lclient!yf;I)V")
	static void method29097(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
	}

	@OriginalMember(owner = "client!ns", name = "s", descriptor = "(Lclient!yf;I)V")
	static void method29098(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class353.method27778((byte) 35) ? 1 : 0;
	}

	@OriginalMember(owner = "client!ns", name = "sn", descriptor = "(Lclient!yf;I)V")
	static void method29099(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local11.anInt4083 * 1502707537;
	}

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(I)V")
	Class447(@OriginalArg(0) int arg0) {
		this.anInt5114 = arg0 * -1876733335;
	}

	@OriginalMember(owner = "client!ns", name = "c", descriptor = "([Ljava/lang/Object;)V")
	public void method29081(@OriginalArg(0) Object[] arg0) {
		try {
			this.method29092(arg0, 1075418221);
		} catch (@Pc(6) Throwable local6) {
		}
	}

	@OriginalMember(owner = "client!ns", name = "e", descriptor = "(B)Ljava/lang/String;")
	public String method29082(@OriginalArg(0) byte arg0) {
		return "_" + this.anInt5114 * -767074855;
	}

	@OriginalMember(owner = "client!ns", name = "m", descriptor = "(S)Ljava/lang/Object;")
	public Object method29083(@OriginalArg(0) short arg0) throws Throwable {
		return Class70.method1239(Class32_Sub10.anApplet2, this.method29082((byte) -42), 2105786931);
	}

	@OriginalMember(owner = "client!ns", name = "k", descriptor = "([Ljava/lang/Object;I)V")
	public void method29084(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int arg1) {
		try {
			this.method29092(arg0, 1546713970);
		} catch (@Pc(6) Throwable local6) {
		}
	}

	@OriginalMember(owner = "client!ns", name = "f", descriptor = "(I)V")
	public void method29085(@OriginalArg(0) int arg0) {
		try {
			this.method29083((short) 255);
		} catch (@Pc(5) Throwable local5) {
		}
	}

	@OriginalMember(owner = "client!ns", name = "w", descriptor = "()Ljava/lang/String;")
	public String method29086() {
		return "_" + this.anInt5114 * -767074855;
	}

	@OriginalMember(owner = "client!ns", name = "p", descriptor = "()Ljava/lang/Object;")
	public Object method29087() throws Throwable {
		return Class70.method1239(Class32_Sub10.anApplet2, this.method29082((byte) -57), 1992977010);
	}

	@OriginalMember(owner = "client!ns", name = "u", descriptor = "([Ljava/lang/Object;)Ljava/lang/Object;")
	public Object method29088(@OriginalArg(0) Object[] arg0) throws Throwable {
		return Class70.method1230(Class32_Sub10.anApplet2, this.method29082((byte) -58), arg0, -946348026);
	}

	@OriginalMember(owner = "client!ns", name = "z", descriptor = "([Ljava/lang/Object;)Ljava/lang/Object;")
	public Object method29089(@OriginalArg(0) Object[] arg0) throws Throwable {
		return Class70.method1230(Class32_Sub10.anApplet2, this.method29082((byte) -18), arg0, -1421675881);
	}

	@OriginalMember(owner = "client!ns", name = "v", descriptor = "([Ljava/lang/Object;)V")
	public void method29090(@OriginalArg(0) Object[] arg0) {
		try {
			this.method29092(arg0, -1412600140);
		} catch (@Pc(6) Throwable local6) {
		}
	}

	@OriginalMember(owner = "client!ns", name = "d", descriptor = "()Ljava/lang/Object;")
	public Object method29091() throws Throwable {
		return Class70.method1239(Class32_Sub10.anApplet2, this.method29082((byte) -71), 1770799661);
	}

	@OriginalMember(owner = "client!ns", name = "n", descriptor = "([Ljava/lang/Object;I)Ljava/lang/Object;")
	public Object method29092(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int arg1) throws Throwable {
		return Class70.method1230(Class32_Sub10.anApplet2, this.method29082((byte) -26), arg0, -477969301);
	}

	@OriginalMember(owner = "client!ns", name = "r", descriptor = "([Ljava/lang/Object;)V")
	public void method29093(@OriginalArg(0) Object[] arg0) {
		try {
			this.method29092(arg0, -1482318139);
		} catch (@Pc(6) Throwable local6) {
		}
	}

	@OriginalMember(owner = "client!ns", name = "l", descriptor = "([Ljava/lang/Object;)Ljava/lang/Object;")
	public Object method29094(@OriginalArg(0) Object[] arg0) throws Throwable {
		return Class70.method1230(Class32_Sub10.anApplet2, this.method29082((byte) -26), arg0, -1552428073);
	}

	@OriginalMember(owner = "client!ns", name = "o", descriptor = "()V")
	public void method29095() {
		try {
			this.method29083((short) 255);
		} catch (@Pc(5) Throwable local5) {
		}
	}

	@OriginalMember(owner = "client!ns", name = "s", descriptor = "()V")
	public void method29096() {
		try {
			this.method29083((short) 255);
		} catch (@Pc(5) Throwable local5) {
		}
	}
}
