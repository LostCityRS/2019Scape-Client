package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ur")
public final class Class601 implements Interface63 {

	@OriginalMember(owner = "client!ur", name = "e", descriptor = "Lclient!acw;")
	final Class72 aClass72_3;

	@OriginalMember(owner = "client!ur", name = "n", descriptor = "Ljava/lang/String;")
	final String aString240;

	@OriginalMember(owner = "client!ur", name = "m", descriptor = "I")
	final int anInt5710;

	@OriginalMember(owner = "client!ur", name = "k", descriptor = "Ljava/lang/String;")
	final String aString239;

	@OriginalMember(owner = "client!ur", name = "pd", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V")
	static void method32031(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt6049 -= 957530791) * 587908375];
		if (Class532.method30778(local13, arg2, 1518522314) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray40 = Class499.method30329(local13, arg2, -823657617);
		arg0.aBoolean684 = true;
	}

	@OriginalMember(owner = "client!ur", name = "aoq", descriptor = "(Lclient!yf;S)V")
	static void method32032(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) throws Exception_Sub3 {
		arg0.anInt6052 -= 463840436;
		@Pc(14) float local14 = (float) arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(25) float local25 = (float) arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		@Pc(36) float local36 = (float) arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 2];
		@Pc(49) float local49 = (float) arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 3] / 1000.0F;
		Class65.aClass123_Sub1_2.method8939(Class472.method29710(local14, local25, local36), local49, 933502888);
	}

	@OriginalMember(owner = "client!ur", name = "avv", descriptor = "(Lclient!yf;I)V")
	static void method32033(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
	}

	@OriginalMember(owner = "client!ur", name = "avn", descriptor = "(Lclient!yf;I)V")
	static void method32034(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
	}

	@OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(Lclient!acw;Ljava/lang/String;ILjava/lang/Throwable;)V")
	Class601(@OriginalArg(0) Class72 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Throwable arg3) {
		this.aClass72_3 = arg0;
		this.aString240 = arg1;
		this.anInt5710 = arg2 * 1989560637;
		this.aString239 = arg3 == null ? null : arg3.getMessage();
	}

	@OriginalMember(owner = "client!ur", name = "e", descriptor = "(I)V")
	@Override
	public void method32076(@OriginalArg(0) int arg0) {
		@Pc(5) Class93_Sub22 local5 = Class102.method2592(Class446.aClass446_48, client.aClass175_2.aClass24_2, (byte) 112);
		@Pc(16) int local16 = (local5.aClass93_Sub41_Sub2_1.anInt3070 += -1445626955) * 212851357;
		local5.aClass93_Sub41_Sub2_1.method22522(this.aClass72_3.method37101(), (byte) -109);
		local5.aClass93_Sub41_Sub2_1.method22414(this.aString240, 1785495722);
		local5.aClass93_Sub41_Sub2_1.method22466(this.anInt5710 * -1620060651, 2130770716);
		local5.aClass93_Sub41_Sub2_1.method22414(Class527.aString232, 1143402571);
		if (this.aString239 == null) {
			local5.aClass93_Sub41_Sub2_1.method22522(0, (byte) -115);
		} else {
			local5.aClass93_Sub41_Sub2_1.method22522(1, (byte) -111);
			@Pc(53) String local53 = this.aString239;
			if (local53.length() > 100) {
				local53 = local53.substring(0, 100);
			}
			local5.aClass93_Sub41_Sub2_1.method22414(local53, 157129624);
		}
		local5.aClass93_Sub41_Sub2_1.method22549(local5.aClass93_Sub41_Sub2_1.anInt3070 * 212851357 - local16, (byte) 64);
		client.aClass175_2.method24363(local5, -2098922188);
	}

	@OriginalMember(owner = "client!ur", name = "m", descriptor = "()V")
	@Override
	public void method32077() {
		@Pc(5) Class93_Sub22 local5 = Class102.method2592(Class446.aClass446_48, client.aClass175_2.aClass24_2, (byte) 84);
		@Pc(16) int local16 = (local5.aClass93_Sub41_Sub2_1.anInt3070 += -1445626955) * 212851357;
		local5.aClass93_Sub41_Sub2_1.method22522(this.aClass72_3.method37101(), (byte) -100);
		local5.aClass93_Sub41_Sub2_1.method22414(this.aString240, 1555231612);
		local5.aClass93_Sub41_Sub2_1.method22466(this.anInt5710 * -1620060651, 2131304719);
		local5.aClass93_Sub41_Sub2_1.method22414(Class527.aString232, -634106784);
		if (this.aString239 == null) {
			local5.aClass93_Sub41_Sub2_1.method22522(0, (byte) -112);
		} else {
			local5.aClass93_Sub41_Sub2_1.method22522(1, (byte) -118);
			@Pc(53) String local53 = this.aString239;
			if (local53.length() > 100) {
				local53 = local53.substring(0, 100);
			}
			local5.aClass93_Sub41_Sub2_1.method22414(local53, 1074521866);
		}
		local5.aClass93_Sub41_Sub2_1.method22549(local5.aClass93_Sub41_Sub2_1.anInt3070 * 212851357 - local16, (byte) 7);
		client.aClass175_2.method24363(local5, -2066726093);
	}

	@OriginalMember(owner = "client!ur", name = "n", descriptor = "()V")
	@Override
	public void method32075() {
		@Pc(5) Class93_Sub22 local5 = Class102.method2592(Class446.aClass446_48, client.aClass175_2.aClass24_2, (byte) 89);
		@Pc(16) int local16 = (local5.aClass93_Sub41_Sub2_1.anInt3070 += -1445626955) * 212851357;
		local5.aClass93_Sub41_Sub2_1.method22522(this.aClass72_3.method37101(), (byte) -88);
		local5.aClass93_Sub41_Sub2_1.method22414(this.aString240, 2035137442);
		local5.aClass93_Sub41_Sub2_1.method22466(this.anInt5710 * -1620060651, 2145038277);
		local5.aClass93_Sub41_Sub2_1.method22414(Class527.aString232, -2011882673);
		if (this.aString239 == null) {
			local5.aClass93_Sub41_Sub2_1.method22522(0, (byte) -97);
		} else {
			local5.aClass93_Sub41_Sub2_1.method22522(1, (byte) -109);
			@Pc(53) String local53 = this.aString239;
			if (local53.length() > 100) {
				local53 = local53.substring(0, 100);
			}
			local5.aClass93_Sub41_Sub2_1.method22414(local53, 1272818467);
		}
		local5.aClass93_Sub41_Sub2_1.method22549(local5.aClass93_Sub41_Sub2_1.anInt3070 * 212851357 - local16, (byte) 12);
		client.aClass175_2.method24363(local5, -2049922226);
	}

	@OriginalMember(owner = "client!ur", name = "f", descriptor = "()V")
	@Override
	public void method32079() {
		@Pc(5) Class93_Sub22 local5 = Class102.method2592(Class446.aClass446_48, client.aClass175_2.aClass24_2, (byte) 75);
		@Pc(16) int local16 = (local5.aClass93_Sub41_Sub2_1.anInt3070 += -1445626955) * 212851357;
		local5.aClass93_Sub41_Sub2_1.method22522(this.aClass72_3.method37101(), (byte) -32);
		local5.aClass93_Sub41_Sub2_1.method22414(this.aString240, -1285080766);
		local5.aClass93_Sub41_Sub2_1.method22466(this.anInt5710 * -1620060651, 2132714364);
		local5.aClass93_Sub41_Sub2_1.method22414(Class527.aString232, -1326473836);
		if (this.aString239 == null) {
			local5.aClass93_Sub41_Sub2_1.method22522(0, (byte) -33);
		} else {
			local5.aClass93_Sub41_Sub2_1.method22522(1, (byte) -121);
			@Pc(53) String local53 = this.aString239;
			if (local53.length() > 100) {
				local53 = local53.substring(0, 100);
			}
			local5.aClass93_Sub41_Sub2_1.method22414(local53, -1329152785);
		}
		local5.aClass93_Sub41_Sub2_1.method22549(local5.aClass93_Sub41_Sub2_1.anInt3070 * 212851357 - local16, (byte) 115);
		client.aClass175_2.method24363(local5, -1490431215);
	}

	@OriginalMember(owner = "client!ur", name = "k", descriptor = "()V")
	@Override
	public void method32078() {
		@Pc(5) Class93_Sub22 local5 = Class102.method2592(Class446.aClass446_48, client.aClass175_2.aClass24_2, (byte) 123);
		@Pc(16) int local16 = (local5.aClass93_Sub41_Sub2_1.anInt3070 += -1445626955) * 212851357;
		local5.aClass93_Sub41_Sub2_1.method22522(this.aClass72_3.method37101(), (byte) -84);
		local5.aClass93_Sub41_Sub2_1.method22414(this.aString240, -321854920);
		local5.aClass93_Sub41_Sub2_1.method22466(this.anInt5710 * -1620060651, 2146916514);
		local5.aClass93_Sub41_Sub2_1.method22414(Class527.aString232, 616372095);
		if (this.aString239 == null) {
			local5.aClass93_Sub41_Sub2_1.method22522(0, (byte) -19);
		} else {
			local5.aClass93_Sub41_Sub2_1.method22522(1, (byte) -77);
			@Pc(53) String local53 = this.aString239;
			if (local53.length() > 100) {
				local53 = local53.substring(0, 100);
			}
			local5.aClass93_Sub41_Sub2_1.method22414(local53, 250825895);
		}
		local5.aClass93_Sub41_Sub2_1.method22549(local5.aClass93_Sub41_Sub2_1.anInt3070 * 212851357 - local16, (byte) 90);
		client.aClass175_2.method24363(local5, -1602139032);
	}
}
