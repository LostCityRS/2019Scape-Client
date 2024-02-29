package jagex3;

import java.awt.Frame;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ho")
public abstract class Class115 {

	@OriginalMember(owner = "client!ho", name = "t", descriptor = "Ljava/awt/Image;")
	public static Image anImage3;

	@OriginalMember(owner = "client!ho", name = "ah", descriptor = "I")
	static int anInt972;

	@OriginalMember(owner = "client!ho", name = "u", descriptor = "Lclient!it;")
	static final Interface28 anInterface28_3 = new Class311();

	@OriginalMember(owner = "client!ho", name = "l", descriptor = "I")
	protected int anInt971 = -571593063;

	@OriginalMember(owner = "client!ho", name = "e", descriptor = "Ljava/lang/String;")
	String aString38;

	@OriginalMember(owner = "client!ho", name = "f", descriptor = "I")
	int anInt969;

	@OriginalMember(owner = "client!ho", name = "m", descriptor = "Lclient!ix;")
	Class352 aClass352_6;

	@OriginalMember(owner = "client!ho", name = "w", descriptor = "I")
	int anInt970;

	@OriginalMember(owner = "client!ho", name = "k", descriptor = "Lclient!ix;")
	Class352 aClass352_5;

	@OriginalMember(owner = "client!ho", name = "n", descriptor = "[Lclient!hi;")
	Class116[] aClass116Array3;

	@OriginalMember(owner = "client!ho", name = "apy", descriptor = "(Lclient!yf;I)V")
	static void method8312(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) throws Exception_Sub3 {
		arg0.anInt6052 -= -725861497;
		Class65.aClass123_Sub1_2.method9025((float) arg0.anIntArray521[arg0.anInt6052 * -1497248091], (float) arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1], (float) arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 2], (byte) 0);
	}

	@OriginalMember(owner = "client!ho", name = "bex", descriptor = "(Lclient!yf;B)V")
	static void method8313(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		Class146.aClass344_3.method27623(65280);
	}

	@OriginalMember(owner = "client!ho", name = "n", descriptor = "(Lclient!abv;Lclient!alw;II)Lclient!abw;")
	static Class48 method8314(@OriginalArg(0) Class47 arg0, @OriginalArg(1) Class93_Sub41 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class48 local4 = new Class48(arg0);
		@Pc(8) int local8 = arg1.method22425((short) 16384);
		@Pc(16) boolean local16 = (local8 & 0x1) != 0;
		@Pc(24) boolean local24 = (local8 & 0x2) != 0;
		@Pc(32) boolean local32 = (local8 & 0x4) != 0;
		@Pc(41) boolean local41 = (local8 & 0x8) != 0;
		if (local16) {
			if (arg2 <= 1) {
				local4.anIntArray14[0] = arg1.method22427(-1434290800);
				local4.anIntArray12[0] = arg1.method22427(-1434290800);
			} else {
				local4.anIntArray14[0] = arg1.method22448(-776001146);
				local4.anIntArray12[0] = arg1.method22448(-497046281);
			}
			if (arg0.anInt143 * 876926327 != -1 || arg0.anInt158 * 61740559 != -1) {
				if (arg2 <= 1) {
					local4.anIntArray14[1] = arg1.method22427(-1434290800);
					local4.anIntArray12[1] = arg1.method22427(-1434290800);
				} else {
					local4.anIntArray14[1] = arg1.method22448(-1520765468);
					local4.anIntArray12[1] = arg1.method22448(-548476675);
				}
			}
			if (arg0.anInt159 * -606200001 != -1 || arg0.anInt160 * -492567931 != -1) {
				if (arg2 <= 1) {
					local4.anIntArray14[2] = arg1.method22427(-1434290800);
					local4.anIntArray12[2] = arg1.method22427(-1434290800);
				} else {
					local4.anIntArray14[2] = arg1.method22448(-256435210);
					local4.anIntArray12[2] = arg1.method22448(-1341653095);
				}
			}
		}
		if (local24) {
			if (arg2 <= 1) {
				local4.anIntArray13[0] = arg1.method22427(-1434290800);
				local4.anIntArray15[0] = arg1.method22427(-1434290800);
			} else {
				local4.anIntArray13[0] = arg1.method22448(-1405354356);
				local4.anIntArray15[0] = arg1.method22448(-872500586);
			}
			if (arg0.anInt141 * 1052917305 != -1 || arg0.anInt168 * -1920351591 != -1) {
				if (arg2 <= 1) {
					local4.anIntArray13[1] = arg1.method22427(-1434290800);
					local4.anIntArray15[1] = arg1.method22427(-1434290800);
				} else {
					local4.anIntArray13[1] = arg1.method22448(-1817063843);
					local4.anIntArray15[1] = arg1.method22448(-1454531620);
				}
			}
		}
		@Pc(247) int local247;
		@Pc(250) int[] local250;
		@Pc(282) int local282;
		if (local32) {
			local247 = arg1.method22427(-1434290800);
			local250 = new int[] { local247 & 0xF, local247 >> 4 & 0xF, local247 >> 8 & 0xF, local247 >> 12 & 0xF };
			for (local282 = 0; local282 < 4; local282++) {
				if (local250[local282] != 15) {
					local4.aShortArray6[local250[local282]] = (short) arg1.method22427(-1434290800);
				}
			}
		}
		if (local41) {
			local247 = arg1.method22425((short) 16384);
			local250 = new int[] { local247 & 0xF, local247 >> 4 & 0xF };
			for (local282 = 0; local282 < 2; local282++) {
				if (local250[local282] != 15) {
					local4.aShortArray7[local250[local282]] = (short) arg1.method22427(-1434290800);
				}
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!ho", name = "ay", descriptor = "(Lclient!yf;ZI)V")
	static void method8315(@OriginalArg(0) Class681 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg0.anIntArray522[arg0.anInt6050 * -709694321];
		arg0.anInt6052 -= -1915563430;
		@Pc(21) int local21 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(31) int local31 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		if (local21 < 0 || local21 >= arg0.anIntArray520[local7]) {
			throw new RuntimeException();
		}
		arg0.anIntArrayArray67[local7][local21] = local31;
		if (arg1) {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local31;
		}
	}

	@OriginalMember(owner = "client!ho", name = "acl", descriptor = "(Lclient!yf;I)V")
	static void method8316(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = arg0.aClass386_3.method28346((String) arg0.anObjectArray45[(arg0.anInt6049 -= 957530791) * 587908375], (byte) 26);
	}

	@OriginalMember(owner = "client!ho", name = "aid", descriptor = "(Lclient!yf;S)V")
	static void method8317(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = Class372.aClass58_2.method1097(local12, -737304293).method22959(-1491104235);
	}

	@OriginalMember(owner = "client!ho", name = "m", descriptor = "(Lclient!aae;Ljava/awt/Frame;I)V")
	public static void method8318(@OriginalArg(0) Class7 arg0, @OriginalArg(1) Frame arg1, @OriginalArg(2) int arg2) {
		arg0.method109(1128822054);
		arg1.setVisible(false);
		arg1.dispose();
	}

	@OriginalMember(owner = "client!ho", name = "tb", descriptor = "(Lclient!yf;I)V")
	static void method8319(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, 1121503173);
		Class202.method24657(local16, arg0, 211290235);
	}

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(Lclient!afc;Lclient!hj;)V")
	Class115(@OriginalArg(0) Class104_Sub2 arg0, @OriginalArg(1) Class314 arg1) {
		this.aString38 = arg1.aString175;
		this.anInt969 = arg1.aClass325Array1.length * 630083593;
		this.aClass352_6 = new Class352(this.anInt969 * 1811824185, anInterface28_3);
		@Pc(27) int local27;
		for (local27 = 0; local27 < this.anInt969 * 1811824185; local27++) {
			this.aClass352_6.method27757(local27, arg1.aClass325Array1[local27].aString182, this.method8206(arg1.aClass325Array1[local27]), (byte) 58);
		}
		this.anInt970 = arg1.aClass325Array2.length * 1160678747;
		this.aClass352_5 = new Class352(this.anInt970 * 1281809107, anInterface28_3);
		for (local27 = 0; local27 < this.anInt970 * 1281809107; local27++) {
			this.aClass352_5.method27757(local27, arg1.aClass325Array2[local27].aString182, this.method8206(arg1.aClass325Array2[local27]), (byte) 95);
		}
		this.aClass116Array3 = new Class116[arg1.aClass318Array1.length];
		for (local27 = 0; local27 < arg1.aClass318Array1.length; local27++) {
			this.aClass116Array3[local27] = this.method8197(arg0, arg1.aClass318Array1[local27]);
		}
	}

	@OriginalMember(owner = "client!ho", name = "cs", descriptor = "(I[FI)V")
	public final void method8192(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8448(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ho", name = "ab", descriptor = "()Ljava/lang/String;")
	public final String method8193() {
		return this.aString38;
	}

	@OriginalMember(owner = "client!ho", name = "bm", descriptor = "()Lclient!hi;")
	public final Class116 method8194() {
		return this.anInt971 * 1454094935 >= 0 ? this.aClass116Array3[this.anInt971 * 1454094935] : null;
	}

	@OriginalMember(owner = "client!ho", name = "cr", descriptor = "(IFFF)V")
	public final void method8195(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8443(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ho", name = "bp", descriptor = "(Lclient!aql;Lclient!ox;)V")
	public final void method8196(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) Class472 arg1) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8463(arg0, arg1.aFloat325, arg1.aFloat326, arg1.aFloat327);
	}

	@OriginalMember(owner = "client!ho", name = "f", descriptor = "(Lclient!afc;Lclient!hn;)Lclient!hi;")
	abstract Class116 method8197(@OriginalArg(0) Class104_Sub2 arg0, @OriginalArg(1) Class318 arg1);

	@OriginalMember(owner = "client!ho", name = "as", descriptor = "(Ljava/lang/String;B)Lclient!aql;")
	public final Class93_Sub33_Sub1 method8198(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) throws Exception_Sub2_Sub1 {
		@Pc(6) Class93_Sub33_Sub1 local6 = (Class93_Sub33_Sub1) this.aClass352_6.method27746(arg0, (byte) 45);
		if (local6 == null) {
			throw new Exception_Sub2_Sub1(arg0);
		}
		return local6;
	}

	@OriginalMember(owner = "client!ho", name = "l", descriptor = "(B)I")
	public final int method8199(@OriginalArg(0) byte arg0) {
		return this.aClass116Array3.length;
	}

	@OriginalMember(owner = "client!ho", name = "u", descriptor = "(II)Lclient!hi;")
	public final Class116 method8200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aClass116Array3[arg0];
	}

	@OriginalMember(owner = "client!ho", name = "ar", descriptor = "(II)Lclient!aql;")
	public final Class93_Sub33_Sub1 method8201(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Class93_Sub33_Sub1) this.aClass352_6.method27752(arg0, -803804167);
	}

	@OriginalMember(owner = "client!ho", name = "bn", descriptor = "(Lclient!hi;)Z")
	public abstract boolean method8202(@OriginalArg(0) Class116 arg0);

	@OriginalMember(owner = "client!ho", name = "d", descriptor = "(Lclient!hi;)Z")
	public abstract boolean method8203(@OriginalArg(0) Class116 arg0);

	@OriginalMember(owner = "client!ho", name = "c", descriptor = "(B)Lclient!hi;")
	public final Class116 method8204(@OriginalArg(0) byte arg0) {
		return this.anInt971 * 1454094935 >= 0 ? this.aClass116Array3[this.anInt971 * 1454094935] : null;
	}

	@OriginalMember(owner = "client!ho", name = "cj", descriptor = "(ILclient!pq;)V")
	public final void method8205(@OriginalArg(0) int arg0, @OriginalArg(1) Class489 arg1) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8450(arg0, arg1);
	}

	@OriginalMember(owner = "client!ho", name = "v", descriptor = "(Lclient!hv;)Lclient!aql;")
	abstract Class93_Sub33_Sub1 method8206(@OriginalArg(0) Class325 arg0);

	@OriginalMember(owner = "client!ho", name = "i", descriptor = "(Lclient!aql;Lclient!pq;I)V")
	public final void method8207(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) Class489 arg1, @OriginalArg(2) int arg2) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8456(arg0, arg1);
	}

	@OriginalMember(owner = "client!ho", name = "s", descriptor = "(Lclient!aql;FFB)V")
	public final void method8208(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) byte arg3) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8440(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ho", name = "an", descriptor = "(Ljava/lang/String;)Lclient!hi;")
	public final Class116 method8209(@OriginalArg(0) String arg0) throws Exception_Sub2_Sub2 {
		@Pc(2) Class116[] local2 = this.aClass116Array3;
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class116 local12 = local2[local4];
			@Pc(16) String local16 = local12.method8437((short) 256);
			if (local16 != null && local16.equals(arg0)) {
				if (!local12.method8438()) {
					throw new Exception_Sub2_Sub2(arg0);
				}
				return local12;
			}
		}
		throw new Exception_Sub2_Sub2(arg0);
	}

	@OriginalMember(owner = "client!ho", name = "q", descriptor = "(Lclient!aql;FFFFI)V")
	public final void method8210(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) int arg5) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8442(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!ho", name = "df", descriptor = "()V")
	void method8211() {
	}

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "(Lclient!aql;Lclient!og;I)V")
	public final void method8212(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) Class460 arg1, @OriginalArg(2) int arg2) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8442(arg0, arg1.aFloat301, arg1.aFloat300, arg1.aFloat299, arg1.aFloat302);
	}

	@OriginalMember(owner = "client!ho", name = "h", descriptor = "(Lclient!aql;[FI)V")
	public final void method8213(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8441(arg0, arg1, arg1.length);
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(Lclient!aql;IB)V")
	public final void method8214(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		@Pc(8) float local8 = (float) (arg1 >> 16 & 0xFF) / 255.0F;
		@Pc(17) float local17 = (float) (arg1 >> 8 & 0xFF) / 255.0F;
		@Pc(24) float local24 = (float) (arg1 & 0xFF) / 255.0F;
		@Pc(33) float local33 = (float) (arg1 >> 24 & 0xFF) / 255.0F;
		this.method8210(arg0, local8, local17, local24, local33, 961483772);
	}

	@OriginalMember(owner = "client!ho", name = "co", descriptor = "(IFFF)V")
	public final void method8215(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8443(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ho", name = "by", descriptor = "()I")
	public final int method8216() {
		return this.anInt971 * 1454094935;
	}

	@OriginalMember(owner = "client!ho", name = "dd", descriptor = "(ILclient!pq;)V")
	public final void method8217(@OriginalArg(0) int arg0, @OriginalArg(1) Class489 arg1) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8451(arg0, arg1);
	}

	@OriginalMember(owner = "client!ho", name = "t", descriptor = "(IFFFI)V")
	public final void method8218(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8443(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ho", name = "ae", descriptor = "(IFFFFI)V")
	public final void method8219(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) int arg5) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8478(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!ho", name = "ag", descriptor = "(ILclient!ox;B)V")
	public final void method8220(@OriginalArg(0) int arg0, @OriginalArg(1) Class472 arg1, @OriginalArg(2) byte arg2) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8443(arg0, arg1.aFloat325, arg1.aFloat326, arg1.aFloat327);
	}

	@OriginalMember(owner = "client!ho", name = "ah", descriptor = "(I[FII)V")
	public final void method8221(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8448(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ho", name = "al", descriptor = "(ILclient!pq;I)V")
	public final void method8222(@OriginalArg(0) int arg0, @OriginalArg(1) Class489 arg1, @OriginalArg(2) int arg2) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8449(arg0, arg1);
	}

	@OriginalMember(owner = "client!ho", name = "ac", descriptor = "(ILclient!pq;I)V")
	public final void method8223(@OriginalArg(0) int arg0, @OriginalArg(1) Class489 arg1, @OriginalArg(2) int arg2) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8450(arg0, arg1);
	}

	@OriginalMember(owner = "client!ho", name = "ai", descriptor = "(ILclient!pq;I)V")
	public final void method8224(@OriginalArg(0) int arg0, @OriginalArg(1) Class489 arg1, @OriginalArg(2) int arg2) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8451(arg0, arg1);
	}

	@OriginalMember(owner = "client!ho", name = "m", descriptor = "()Z")
	public abstract boolean method8225();

	@OriginalMember(owner = "client!ho", name = "cz", descriptor = "(ILclient!pq;)V")
	public final void method8226(@OriginalArg(0) int arg0, @OriginalArg(1) Class489 arg1) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8449(arg0, arg1);
	}

	@OriginalMember(owner = "client!ho", name = "k", descriptor = "(I)Ljava/lang/String;")
	public final String method8227(@OriginalArg(0) int arg0) {
		return this.aString38;
	}

	@OriginalMember(owner = "client!ho", name = "ad", descriptor = "(IB)Lclient!aql;")
	public final Class93_Sub33_Sub1 method8228(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return (Class93_Sub33_Sub1) this.aClass352_5.method27752(arg0, 306803012);
	}

	@OriginalMember(owner = "client!ho", name = "am", descriptor = "(Ljava/lang/String;S)Lclient!aql;")
	public final Class93_Sub33_Sub1 method8229(@OriginalArg(0) String arg0, @OriginalArg(1) short arg1) {
		return (Class93_Sub33_Sub1) this.aClass352_5.method27746(arg0, (byte) 104);
	}

	@OriginalMember(owner = "client!ho", name = "au", descriptor = "(I)I")
	public final int method8230(@OriginalArg(0) int arg0) {
		return this.anInt969 * 1811824185;
	}

	@OriginalMember(owner = "client!ho", name = "at", descriptor = "(I)I")
	public final int method8231(@OriginalArg(0) int arg0) {
		return this.anInt970 * 1281809107;
	}

	@OriginalMember(owner = "client!ho", name = "ap", descriptor = "()V")
	void method8232() {
	}

	@OriginalMember(owner = "client!ho", name = "aq", descriptor = "()V")
	public abstract void method8233();

	@OriginalMember(owner = "client!ho", name = "ax", descriptor = "()V")
	public abstract void method8234();

	@OriginalMember(owner = "client!ho", name = "av", descriptor = "()V")
	public abstract void method8235();

	@OriginalMember(owner = "client!ho", name = "ao", descriptor = "()V")
	public abstract void method8236();

	@OriginalMember(owner = "client!ho", name = "aj", descriptor = "()V")
	public abstract void method8237();

	@OriginalMember(owner = "client!ho", name = "cu", descriptor = "(Lclient!aql;I)V")
	public final void method8238(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) float local8 = (float) (arg1 >> 16 & 0xFF) / 255.0F;
		@Pc(17) float local17 = (float) (arg1 >> 8 & 0xFF) / 255.0F;
		@Pc(24) float local24 = (float) (arg1 & 0xFF) / 255.0F;
		@Pc(33) float local33 = (float) (arg1 >> 24 & 0xFF) / 255.0F;
		this.method8210(arg0, local8, local17, local24, local33, -239304559);
	}

	@OriginalMember(owner = "client!ho", name = "cq", descriptor = "(ILclient!ox;)V")
	public final void method8239(@OriginalArg(0) int arg0, @OriginalArg(1) Class472 arg1) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8443(arg0, arg1.aFloat325, arg1.aFloat326, arg1.aFloat327);
	}

	@OriginalMember(owner = "client!ho", name = "az", descriptor = "()Ljava/lang/String;")
	public final String method8240() {
		return this.aString38;
	}

	@OriginalMember(owner = "client!ho", name = "z", descriptor = "(Lclient!hi;I)I")
	public final int method8241(@OriginalArg(0) Class116 arg0, @OriginalArg(1) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass116Array3.length; local1++) {
			if (arg0 == this.aClass116Array3[local1]) {
				return local1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ho", name = "g", descriptor = "(Lclient!aql;Lclient!pq;I)V")
	public final void method8242(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) Class489 arg1, @OriginalArg(2) int arg2) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8444(arg0, arg1);
	}

	@OriginalMember(owner = "client!ho", name = "ak", descriptor = "(Lclient!afc;Lclient!hn;)Lclient!hi;")
	abstract Class116 method8243(@OriginalArg(0) Class104_Sub2 arg0, @OriginalArg(1) Class318 arg1);

	@OriginalMember(owner = "client!ho", name = "bf", descriptor = "()I")
	public final int method8244() {
		return this.aClass116Array3.length;
	}

	@OriginalMember(owner = "client!ho", name = "cy", descriptor = "(I[FI)V")
	public final void method8245(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8448(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ho", name = "bl", descriptor = "()I")
	public final int method8246() {
		return this.aClass116Array3.length;
	}

	@OriginalMember(owner = "client!ho", name = "bk", descriptor = "(I)Lclient!hi;")
	public final Class116 method8247(@OriginalArg(0) int arg0) {
		return this.aClass116Array3[arg0];
	}

	@OriginalMember(owner = "client!ho", name = "bh", descriptor = "(Lclient!hi;)I")
	public final int method8248(@OriginalArg(0) Class116 arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass116Array3.length; local1++) {
			if (arg0 == this.aClass116Array3[local1]) {
				return local1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ho", name = "bx", descriptor = "(Lclient!hi;)I")
	public final int method8249(@OriginalArg(0) Class116 arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass116Array3.length; local1++) {
			if (arg0 == this.aClass116Array3[local1]) {
				return local1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ho", name = "bd", descriptor = "()Lclient!hi;")
	public final Class116 method8250() {
		@Pc(2) Class116[] local2 = this.aClass116Array3;
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class116 local12 = local2[local4];
			if (local12.method8438()) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ho", name = "bc", descriptor = "()Lclient!hi;")
	public final Class116 method8251() {
		@Pc(2) Class116[] local2 = this.aClass116Array3;
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class116 local12 = local2[local4];
			if (local12.method8438()) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ho", name = "bi", descriptor = "()Lclient!hi;")
	public final Class116 method8252() {
		@Pc(2) Class116[] local2 = this.aClass116Array3;
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class116 local12 = local2[local4];
			if (local12.method8438()) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ho", name = "r", descriptor = "(I)I")
	public final int method8253(@OriginalArg(0) int arg0) {
		return this.anInt971 * 1454094935;
	}

	@OriginalMember(owner = "client!ho", name = "ca", descriptor = "(Lclient!aql;Lclient!pq;)V")
	public final void method8254(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) Class489 arg1) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8456(arg0, arg1);
	}

	@OriginalMember(owner = "client!ho", name = "n", descriptor = "()V")
	public abstract void method8255();

	@OriginalMember(owner = "client!ho", name = "aw", descriptor = "(IILclient!mq;B)V")
	public final void method8256(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface43 arg2, @OriginalArg(3) byte arg3) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8452(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ho", name = "aa", descriptor = "()Ljava/lang/String;")
	public final String method8257() {
		return this.aString38;
	}

	@OriginalMember(owner = "client!ho", name = "p", descriptor = "(I)Lclient!hi;")
	public final Class116 method8258(@OriginalArg(0) int arg0) {
		@Pc(2) Class116[] local2 = this.aClass116Array3;
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class116 local12 = local2[local4];
			if (local12.method8438()) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ho", name = "y", descriptor = "(Lclient!aql;FFFI)V")
	public final void method8259(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8463(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ho", name = "bu", descriptor = "(Lclient!hv;)Lclient!aql;")
	abstract Class93_Sub33_Sub1 method8260(@OriginalArg(0) Class325 arg0);

	@OriginalMember(owner = "client!ho", name = "bw", descriptor = "(Lclient!hv;)Lclient!aql;")
	abstract Class93_Sub33_Sub1 method8261(@OriginalArg(0) Class325 arg0);

	@OriginalMember(owner = "client!ho", name = "bo", descriptor = "(Lclient!aql;F)V")
	public final void method8262(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) float arg1) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8439(arg0, arg1);
	}

	@OriginalMember(owner = "client!ho", name = "bz", descriptor = "(Lclient!aql;F)V")
	public final void method8263(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) float arg1) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8439(arg0, arg1);
	}

	@OriginalMember(owner = "client!ho", name = "bv", descriptor = "(Lclient!aql;FFF)V")
	public final void method8264(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8463(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ho", name = "br", descriptor = "(Lclient!aql;FFF)V")
	public final void method8265(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8463(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ho", name = "bg", descriptor = "(Lclient!aql;FFF)V")
	public final void method8266(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8463(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ho", name = "ba", descriptor = "(Lclient!aql;FFFF)V")
	public final void method8267(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8442(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!ho", name = "w", descriptor = "(Ljava/lang/String;I)Lclient!hi;")
	public final Class116 method8268(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) throws Exception_Sub2_Sub2 {
		@Pc(2) Class116[] local2 = this.aClass116Array3;
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class116 local12 = local2[local4];
			@Pc(16) String local16 = local12.method8437((short) 256);
			if (local16 != null && local16.equals(arg0)) {
				if (!local12.method8438()) {
					throw new Exception_Sub2_Sub2(arg0);
				}
				return local12;
			}
		}
		throw new Exception_Sub2_Sub2(arg0);
	}

	@OriginalMember(owner = "client!ho", name = "cv", descriptor = "(Lclient!aql;Lclient!pq;)V")
	public final void method8269(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) Class489 arg1) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8444(arg0, arg1);
	}

	@OriginalMember(owner = "client!ho", name = "bs", descriptor = "(Lclient!aql;Lclient!og;)V")
	public final void method8270(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) Class460 arg1) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8442(arg0, arg1.aFloat301, arg1.aFloat300, arg1.aFloat299, arg1.aFloat302);
	}

	@OriginalMember(owner = "client!ho", name = "cl", descriptor = "(Lclient!aql;[F)V")
	public final void method8271(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) float[] arg1) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8441(arg0, arg1, arg1.length);
	}

	@OriginalMember(owner = "client!ho", name = "cg", descriptor = "(Lclient!aql;[F)V")
	public final void method8272(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) float[] arg1) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8441(arg0, arg1, arg1.length);
	}

	@OriginalMember(owner = "client!ho", name = "ce", descriptor = "(Lclient!aql;[F)V")
	public final void method8273(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) float[] arg1) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8441(arg0, arg1, arg1.length);
	}

	@OriginalMember(owner = "client!ho", name = "da", descriptor = "(ILclient!pq;)V")
	public final void method8274(@OriginalArg(0) int arg0, @OriginalArg(1) Class489 arg1) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8451(arg0, arg1);
	}

	@OriginalMember(owner = "client!ho", name = "ci", descriptor = "(Lclient!aql;I)V")
	public final void method8275(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) float local8 = (float) (arg1 >> 16 & 0xFF) / 255.0F;
		@Pc(17) float local17 = (float) (arg1 >> 8 & 0xFF) / 255.0F;
		@Pc(24) float local24 = (float) (arg1 & 0xFF) / 255.0F;
		@Pc(33) float local33 = (float) (arg1 >> 24 & 0xFF) / 255.0F;
		this.method8210(arg0, local8, local17, local24, local33, 87818938);
	}

	@OriginalMember(owner = "client!ho", name = "cn", descriptor = "(Lclient!aql;Lclient!pq;)V")
	public final void method8276(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) Class489 arg1) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8444(arg0, arg1);
	}

	@OriginalMember(owner = "client!ho", name = "ck", descriptor = "(ILclient!pq;)V")
	public final void method8277(@OriginalArg(0) int arg0, @OriginalArg(1) Class489 arg1) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8450(arg0, arg1);
	}

	@OriginalMember(owner = "client!ho", name = "cp", descriptor = "(Lclient!aql;Lclient!pq;)V")
	public final void method8278(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) Class489 arg1) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8456(arg0, arg1);
	}

	@OriginalMember(owner = "client!ho", name = "cm", descriptor = "(IFFF)V")
	public final void method8279(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8443(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ho", name = "cx", descriptor = "(Lclient!aql;Lclient!pq;)V")
	public final void method8280(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) Class489 arg1) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8456(arg0, arg1);
	}

	@OriginalMember(owner = "client!ho", name = "cw", descriptor = "(Lclient!aql;ILclient!mq;)V")
	public final void method8281(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface43 arg2) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8436(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ho", name = "ay", descriptor = "()V")
	public abstract void method8282();

	@OriginalMember(owner = "client!ho", name = "cf", descriptor = "(IFFF)V")
	public final void method8283(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8443(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ho", name = "af", descriptor = "(Lclient!afc;Lclient!hn;)Lclient!hi;")
	abstract Class116 method8284(@OriginalArg(0) Class104_Sub2 arg0, @OriginalArg(1) Class318 arg1);

	@OriginalMember(owner = "client!ho", name = "e", descriptor = "()V")
	public abstract void method8285();

	@OriginalMember(owner = "client!ho", name = "dz", descriptor = "()I")
	public final int method8286() {
		return this.anInt970 * 1281809107;
	}

	@OriginalMember(owner = "client!ho", name = "x", descriptor = "(Lclient!aql;Lclient!ox;I)V")
	public final void method8287(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) Class472 arg1, @OriginalArg(2) int arg2) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8463(arg0, arg1.aFloat325, arg1.aFloat326, arg1.aFloat327);
	}

	@OriginalMember(owner = "client!ho", name = "ch", descriptor = "(ILclient!ox;)V")
	public final void method8288(@OriginalArg(0) int arg0, @OriginalArg(1) Class472 arg1) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8443(arg0, arg1.aFloat325, arg1.aFloat326, arg1.aFloat327);
	}

	@OriginalMember(owner = "client!ho", name = "cb", descriptor = "(ILclient!ox;)V")
	public final void method8289(@OriginalArg(0) int arg0, @OriginalArg(1) Class472 arg1) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8443(arg0, arg1.aFloat325, arg1.aFloat326, arg1.aFloat327);
	}

	@OriginalMember(owner = "client!ho", name = "bq", descriptor = "(Lclient!hi;)Z")
	public abstract boolean method8290(@OriginalArg(0) Class116 arg0);

	@OriginalMember(owner = "client!ho", name = "dc", descriptor = "()I")
	public final int method8291() {
		return this.anInt969 * 1811824185;
	}

	@OriginalMember(owner = "client!ho", name = "cc", descriptor = "(ILclient!pq;)V")
	public final void method8292(@OriginalArg(0) int arg0, @OriginalArg(1) Class489 arg1) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8449(arg0, arg1);
	}

	@OriginalMember(owner = "client!ho", name = "j", descriptor = "(Lclient!aql;ILclient!mq;I)V")
	public final void method8293(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface43 arg2, @OriginalArg(3) int arg3) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8436(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ho", name = "bt", descriptor = "(Lclient!hi;)Z")
	public abstract boolean method8294(@OriginalArg(0) Class116 arg0);

	@OriginalMember(owner = "client!ho", name = "cd", descriptor = "(ILclient!pq;)V")
	public final void method8295(@OriginalArg(0) int arg0, @OriginalArg(1) Class489 arg1) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8451(arg0, arg1);
	}

	@OriginalMember(owner = "client!ho", name = "bj", descriptor = "(Lclient!aql;Lclient!og;)V")
	public final void method8296(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) Class460 arg1) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8442(arg0, arg1.aFloat301, arg1.aFloat300, arg1.aFloat299, arg1.aFloat302);
	}

	@OriginalMember(owner = "client!ho", name = "dr", descriptor = "(ILclient!pq;)V")
	public final void method8297(@OriginalArg(0) int arg0, @OriginalArg(1) Class489 arg1) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8451(arg0, arg1);
	}

	@OriginalMember(owner = "client!ho", name = "bb", descriptor = "()Lclient!hi;")
	public final Class116 method8298() {
		return this.anInt971 * 1454094935 >= 0 ? this.aClass116Array3[this.anInt971 * 1454094935] : null;
	}

	@OriginalMember(owner = "client!ho", name = "dt", descriptor = "(IILclient!mq;)V")
	public final void method8299(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface43 arg2) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8452(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ho", name = "do", descriptor = "()I")
	public final int method8300() {
		return this.anInt970 * 1281809107;
	}

	@OriginalMember(owner = "client!ho", name = "ds", descriptor = "()Z")
	public abstract boolean method8301();

	@OriginalMember(owner = "client!ho", name = "dv", descriptor = "()I")
	public final int method8302() {
		return this.anInt970 * 1281809107;
	}

	@OriginalMember(owner = "client!ho", name = "dm", descriptor = "()I")
	public final int method8303() {
		return this.anInt970 * 1281809107;
	}

	@OriginalMember(owner = "client!ho", name = "dq", descriptor = "(I)Lclient!aql;")
	public final Class93_Sub33_Sub1 method8304(@OriginalArg(0) int arg0) {
		return (Class93_Sub33_Sub1) this.aClass352_5.method27752(arg0, 541698169);
	}

	@OriginalMember(owner = "client!ho", name = "ct", descriptor = "(Lclient!aql;ILclient!mq;)V")
	public final void method8305(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface43 arg2) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8436(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ho", name = "di", descriptor = "()I")
	public final int method8306() {
		return this.anInt969 * 1811824185;
	}

	@OriginalMember(owner = "client!ho", name = "dk", descriptor = "(I)Lclient!aql;")
	public final Class93_Sub33_Sub1 method8307(@OriginalArg(0) int arg0) {
		return (Class93_Sub33_Sub1) this.aClass352_6.method27752(arg0, -518017370);
	}

	@OriginalMember(owner = "client!ho", name = "dn", descriptor = "(I)Lclient!aql;")
	public final Class93_Sub33_Sub1 method8308(@OriginalArg(0) int arg0) {
		return (Class93_Sub33_Sub1) this.aClass352_6.method27752(arg0, -1147879684);
	}

	@OriginalMember(owner = "client!ho", name = "o", descriptor = "(Lclient!aql;FB)V")
	public final void method8309(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) byte arg2) {
		this.aClass116Array3[this.anInt971 * 1454094935].method8439(arg0, arg1);
	}

	@OriginalMember(owner = "client!ho", name = "dw", descriptor = "()Z")
	public abstract boolean method8310();

	@OriginalMember(owner = "client!ho", name = "be", descriptor = "()I")
	public final int method8311() {
		return this.anInt971 * 1454094935;
	}
}
