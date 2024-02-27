package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hi")
public abstract class Class116 implements Interface34 {

	@OriginalMember(owner = "client!hi", name = "n", descriptor = "Ljava/lang/String;")
	protected String aString39;

	@OriginalMember(owner = "client!hi", name = "m", descriptor = "Ljava/lang/String;")
	protected String aString41;

	@OriginalMember(owner = "client!hi", name = "e", descriptor = "Ljava/lang/String;")
	protected String aString40 = null;

	@OriginalMember(owner = "client!hi", name = "ih", descriptor = "(Lclient!yf;I)V")
	static void method8483(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class617.method32272(local11, local14, arg0, -1736982677);
	}

	@OriginalMember(owner = "client!hi", name = "ajm", descriptor = "(Lclient!yf;I)V")
	static void method8484(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		Class267.method26341(arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091], -1, -1, false, 765756756);
	}

	@OriginalMember(owner = "client!hi", name = "sx", descriptor = "(Lclient!yf;I)V")
	static void method8485(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local11.anInt4047 * 1332164047;
	}

	@OriginalMember(owner = "client!hi", name = "aih", descriptor = "(Lclient!yf;I)V")
	static void method8486(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class372.aClass58_2.method1097(local12, -737304293).method22929(-154953554);
	}

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "()V")
	Class116() {
	}

	@OriginalMember(owner = "client!hi", name = "c", descriptor = "(Lclient!aql;ILclient!mq;)V")
	abstract void method8436(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface43 arg2);

	@OriginalMember(owner = "client!hi", name = "e", descriptor = "(S)Ljava/lang/String;")
	final String method8437(@OriginalArg(0) short arg0) {
		return this.aString40;
	}

	@OriginalMember(owner = "client!hi", name = "n", descriptor = "()Z")
	public abstract boolean method8438();

	@OriginalMember(owner = "client!hi", name = "k", descriptor = "(Lclient!aql;F)V")
	abstract void method8439(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!hi", name = "f", descriptor = "(Lclient!aql;FF)V")
	abstract void method8440(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!hi", name = "z", descriptor = "(Lclient!aql;[FI)V")
	abstract void method8441(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!hi", name = "l", descriptor = "(Lclient!aql;FFFF)V")
	abstract void method8442(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4);

	@OriginalMember(owner = "client!hi", name = "r", descriptor = "(IFFF)V")
	abstract void method8443(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3);

	@OriginalMember(owner = "client!hi", name = "p", descriptor = "(Lclient!aql;Lclient!pq;)V")
	abstract void method8444(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) Class489 arg1);

	@OriginalMember(owner = "client!hi", name = "ab", descriptor = "(ILclient!pq;)V")
	abstract void method8445(@OriginalArg(0) int arg0, @OriginalArg(1) Class489 arg1);

	@OriginalMember(owner = "client!hi", name = "ad", descriptor = "(I[FI)V")
	abstract void method8446(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!hi", name = "ao", descriptor = "(IILclient!mq;)V")
	abstract void method8447(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface43 arg2);

	@OriginalMember(owner = "client!hi", name = "o", descriptor = "(I[FI)V")
	abstract void method8448(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!hi", name = "s", descriptor = "(ILclient!pq;)V")
	abstract void method8449(@OriginalArg(0) int arg0, @OriginalArg(1) Class489 arg1);

	@OriginalMember(owner = "client!hi", name = "y", descriptor = "(ILclient!pq;)V")
	abstract void method8450(@OriginalArg(0) int arg0, @OriginalArg(1) Class489 arg1);

	@OriginalMember(owner = "client!hi", name = "q", descriptor = "(ILclient!pq;)V")
	abstract void method8451(@OriginalArg(0) int arg0, @OriginalArg(1) Class489 arg1);

	@OriginalMember(owner = "client!hi", name = "x", descriptor = "(IILclient!mq;)V")
	abstract void method8452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface43 arg2);

	@OriginalMember(owner = "client!hi", name = "ah", descriptor = "(Lclient!aql;Lclient!pq;)V")
	abstract void method8453(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) Class489 arg1);

	@OriginalMember(owner = "client!hi", name = "h", descriptor = "()Ljava/lang/String;")
	final String method8454() {
		return this.aString40;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "()Z")
	public abstract boolean method8455();

	@OriginalMember(owner = "client!hi", name = "d", descriptor = "(Lclient!aql;Lclient!pq;)V")
	abstract void method8456(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) Class489 arg1);

	@OriginalMember(owner = "client!hi", name = "i", descriptor = "(Lclient!aql;F)V")
	abstract void method8457(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!hi", name = "j", descriptor = "(Lclient!aql;F)V")
	abstract void method8458(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!hi", name = "ai", descriptor = "(Lclient!aql;Lclient!pq;)V")
	abstract void method8459(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) Class489 arg1);

	@OriginalMember(owner = "client!hi", name = "ae", descriptor = "(Lclient!aql;FFF)V")
	abstract void method8460(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3);

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "()Ljava/lang/String;")
	final String method8461() {
		return this.aString40;
	}

	@OriginalMember(owner = "client!hi", name = "av", descriptor = "(IILclient!mq;)V")
	abstract void method8462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface43 arg2);

	@OriginalMember(owner = "client!hi", name = "w", descriptor = "(Lclient!aql;FFF)V")
	abstract void method8463(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3);

	@OriginalMember(owner = "client!hi", name = "ac", descriptor = "(Lclient!aql;Lclient!pq;)V")
	abstract void method8464(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) Class489 arg1);

	@OriginalMember(owner = "client!hi", name = "aq", descriptor = "(ILclient!pq;)V")
	abstract void method8465(@OriginalArg(0) int arg0, @OriginalArg(1) Class489 arg1);

	@OriginalMember(owner = "client!hi", name = "aw", descriptor = "(Lclient!aql;Lclient!pq;)V")
	abstract void method8466(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) Class489 arg1);

	@OriginalMember(owner = "client!hi", name = "t", descriptor = "(Lclient!aql;FF)V")
	abstract void method8467(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2);

	@OriginalMember(owner = "client!hi", name = "at", descriptor = "(IFFF)V")
	abstract void method8468(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3);

	@OriginalMember(owner = "client!hi", name = "ar", descriptor = "(ILclient!pq;)V")
	abstract void method8469(@OriginalArg(0) int arg0, @OriginalArg(1) Class489 arg1);

	@OriginalMember(owner = "client!hi", name = "am", descriptor = "(ILclient!pq;)V")
	abstract void method8470(@OriginalArg(0) int arg0, @OriginalArg(1) Class489 arg1);

	@OriginalMember(owner = "client!hi", name = "au", descriptor = "(ILclient!pq;)V")
	abstract void method8471(@OriginalArg(0) int arg0, @OriginalArg(1) Class489 arg1);

	@OriginalMember(owner = "client!hi", name = "aj", descriptor = "(IFFFF)V")
	abstract void method8472(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4);

	@OriginalMember(owner = "client!hi", name = "ap", descriptor = "(ILclient!pq;)V")
	abstract void method8473(@OriginalArg(0) int arg0, @OriginalArg(1) Class489 arg1);

	@OriginalMember(owner = "client!hi", name = "ag", descriptor = "(Lclient!aql;[FI)V")
	abstract void method8474(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!hi", name = "ax", descriptor = "(Lclient!aql;FFFF)V")
	abstract void method8475(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4);

	@OriginalMember(owner = "client!hi", name = "as", descriptor = "(Lclient!aql;ILclient!mq;)V")
	abstract void method8476(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface43 arg2);

	@OriginalMember(owner = "client!hi", name = "g", descriptor = "(Lclient!aql;F)V")
	abstract void method8477(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) float arg1);

	@OriginalMember(owner = "client!hi", name = "v", descriptor = "(IFFFF)V")
	abstract void method8478(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4);

	@OriginalMember(owner = "client!hi", name = "ay", descriptor = "(ILclient!pq;)V")
	abstract void method8479(@OriginalArg(0) int arg0, @OriginalArg(1) Class489 arg1);

	@OriginalMember(owner = "client!hi", name = "al", descriptor = "(Lclient!aql;Lclient!pq;)V")
	abstract void method8480(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) Class489 arg1);

	@OriginalMember(owner = "client!hi", name = "az", descriptor = "(ILclient!pq;)V")
	abstract void method8481(@OriginalArg(0) int arg0, @OriginalArg(1) Class489 arg1);

	@OriginalMember(owner = "client!hi", name = "aa", descriptor = "(ILclient!pq;)V")
	abstract void method8482(@OriginalArg(0) int arg0, @OriginalArg(1) Class489 arg1);
}
