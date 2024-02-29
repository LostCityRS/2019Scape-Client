package jagex3;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aar")
public final class Class20 implements Iterator {

	@OriginalMember(owner = "client!aar", name = "aw", descriptor = "Z")
	public static boolean aBoolean10;

	@OriginalMember(owner = "client!aar", name = "td", descriptor = "I")
	public static int anInt70;

	@OriginalMember(owner = "client!aar", name = "n", descriptor = "Lclient!tj;")
	Class93 aClass93_6;

	@OriginalMember(owner = "client!aar", name = "e", descriptor = "Lclient!aat;")
	Class22 aClass22_1;

	@OriginalMember(owner = "client!aar", name = "m", descriptor = "Lclient!tj;")
	Class93 aClass93_5 = null;

	@OriginalMember(owner = "client!aar", name = "vd", descriptor = "(Lclient!yf;S)V")
	static void method373(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		arg0.anInt6052 -= 1189701933;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(19) Class93_Sub40 local19 = (Class93_Sub40) client.aClass16_22.method215((long) local13);
		if (local19 != null && local19.anInt3171 * -256237711 == 3) {
			Class372.method28200(local19, true, true, 1891268550);
		}
	}

	@OriginalMember(owner = "client!aar", name = "gw", descriptor = "(Lclient!ahm;S)V")
	static void method374(@OriginalArg(0) Class132_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) short arg1) {
		@Pc(6) int local6 = arg0.anInt2780 * -2095106181 - client.anInt3485;
		@Pc(17) int local17 = arg0.anInt2775 * -1016506880 + arg0.method20009(-740153806) * 256;
		@Pc(28) int local28 = arg0.anInt2777 * -294398464 + arg0.method20009(1023538171) * 256;
		@Pc(37) int local37 = Class305.method26894(local17, local28, arg0.anInt2773 * -1628091145, (byte) -36);
		@Pc(41) Class472 local41 = arg0.method24241().aClass472_61;
		arg0.method24243((float) ((int) local41.aFloat325 + (local17 - (int) local41.aFloat325) / local6), (float) ((int) local41.aFloat326 + (local37 - (int) local41.aFloat326) / local6), (float) ((int) local41.aFloat327 + (local28 - (int) local41.aFloat327) / local6));
		arg0.anInt2791 = 0;
		arg0.method19963(arg0.anInt2782 * -1729677103, (byte) 85);
	}

	@OriginalMember(owner = "client!aar", name = "e", descriptor = "(I)V")
	public static void method375(@OriginalArg(0) int arg0) {
		Class625.anInt5858 = 2118100395;
	}

	@OriginalMember(owner = "client!aar", name = "md", descriptor = "(I)I")
	public static int method376(@OriginalArg(0) int arg0) {
		return Class93_Sub26.aClass645_15.aBoolean868 ? 3 : 2;
	}

	@OriginalMember(owner = "client!aar", name = "<init>", descriptor = "(Lclient!aat;)V")
	public Class20(@OriginalArg(0) Class22 arg0) {
		this.method361(arg0, -1402333191);
	}

	@OriginalMember(owner = "client!aar", name = "c", descriptor = "()V")
	void method360() {
		this.aClass93_6 = this.aClass22_1 == null ? null : this.aClass22_1.aClass93_8.aClass93_227;
		this.aClass93_5 = null;
	}

	@OriginalMember(owner = "client!aar", name = "l", descriptor = "(Lclient!aat;I)V")
	public void method361(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1) {
		this.aClass22_1 = arg0;
		this.method362((byte) 58);
	}

	@OriginalMember(owner = "client!aar", name = "u", descriptor = "(B)V")
	void method362(@OriginalArg(0) byte arg0) {
		this.aClass93_6 = this.aClass22_1 == null ? null : this.aClass22_1.aClass93_8.aClass93_227;
		this.aClass93_5 = null;
	}

	@OriginalMember(owner = "client!aar", name = "next", descriptor = "()Ljava/lang/Object;")
	@Override
	public Object next() {
		@Pc(2) Class93 local2 = this.aClass93_6;
		if (this.aClass22_1.aClass93_8 == local2) {
			local2 = null;
			this.aClass93_6 = null;
		} else {
			this.aClass93_6 = local2.aClass93_227;
		}
		this.aClass93_5 = local2;
		return local2;
	}

	@OriginalMember(owner = "client!aar", name = "hasNext", descriptor = "()Z")
	@Override
	public boolean hasNext() {
		return this.aClass93_6 != this.aClass22_1.aClass93_8;
	}

	@OriginalMember(owner = "client!aar", name = "n", descriptor = "()Z")
	public boolean method363() {
		return this.aClass93_6 != this.aClass22_1.aClass93_8;
	}

	@OriginalMember(owner = "client!aar", name = "e", descriptor = "()Z")
	public boolean method364() {
		return this.aClass93_6 != this.aClass22_1.aClass93_8;
	}

	@OriginalMember(owner = "client!aar", name = "remove", descriptor = "()V")
	@Override
	public void remove() {
		if (this.aClass93_5 == null) {
			throw new IllegalStateException();
		}
		this.aClass93_5.method23981(1819949083);
		this.aClass93_5 = null;
	}

	@OriginalMember(owner = "client!aar", name = "m", descriptor = "()Ljava/lang/Object;")
	public Object method365() {
		@Pc(2) Class93 local2 = this.aClass93_6;
		if (this.aClass22_1.aClass93_8 == local2) {
			local2 = null;
			this.aClass93_6 = null;
		} else {
			this.aClass93_6 = local2.aClass93_227;
		}
		this.aClass93_5 = local2;
		return local2;
	}

	@OriginalMember(owner = "client!aar", name = "k", descriptor = "()Ljava/lang/Object;")
	public Object method366() {
		@Pc(2) Class93 local2 = this.aClass93_6;
		if (this.aClass22_1.aClass93_8 == local2) {
			local2 = null;
			this.aClass93_6 = null;
		} else {
			this.aClass93_6 = local2.aClass93_227;
		}
		this.aClass93_5 = local2;
		return local2;
	}

	@OriginalMember(owner = "client!aar", name = "f", descriptor = "()V")
	public void method367() {
		if (this.aClass93_5 == null) {
			throw new IllegalStateException();
		}
		this.aClass93_5.method23981(1337945563);
		this.aClass93_5 = null;
	}

	@OriginalMember(owner = "client!aar", name = "w", descriptor = "()V")
	public void method368() {
		if (this.aClass93_5 == null) {
			throw new IllegalStateException();
		}
		this.aClass93_5.method23981(-1732040758);
		this.aClass93_5 = null;
	}

	@OriginalMember(owner = "client!aar", name = "p", descriptor = "(Lclient!aat;)V")
	public void method369(@OriginalArg(0) Class22 arg0) {
		this.aClass22_1 = arg0;
		this.method362((byte) 107);
	}

	@OriginalMember(owner = "client!aar", name = "r", descriptor = "()Lclient!tj;")
	public Class93 method370() {
		this.method362((byte) 122);
		return (Class93) this.next();
	}

	@OriginalMember(owner = "client!aar", name = "d", descriptor = "()V")
	void method371() {
		this.aClass93_6 = this.aClass22_1 == null ? null : this.aClass22_1.aClass93_8.aClass93_227;
		this.aClass93_5 = null;
	}

	@OriginalMember(owner = "client!aar", name = "z", descriptor = "(I)Lclient!tj;")
	public Class93 method372(@OriginalArg(0) int arg0) {
		this.method362((byte) 78);
		return (Class93) this.next();
	}
}
