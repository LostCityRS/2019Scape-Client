package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ur")
public class Class601 implements Interface63 {

	@OriginalMember(owner = "client!ur", name = "e", descriptor = "Lclient!acw;")
	final Class72 aClass72_3;

	@OriginalMember(owner = "client!ur", name = "n", descriptor = "Ljava/lang/String;")
	final String aString231;

	@OriginalMember(owner = "client!ur", name = "m", descriptor = "I")
	final int anInt5549;

	@OriginalMember(owner = "client!ur", name = "k", descriptor = "Ljava/lang/String;")
	final String aString230;

	@OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(Lclient!acw;Ljava/lang/String;ILjava/lang/Throwable;)V", line = 87)
	Class601(@OriginalArg(0) Class72 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Throwable arg3) {
		this.aClass72_3 = arg0;
		this.aString231 = arg1;
		this.anInt5549 = arg2 * 1989560637;
		this.aString230 = arg3 == null ? null : arg3.getMessage();
	}

	@OriginalMember(owner = "client!ur", name = "e", descriptor = "(I)V", line = 95)
	@Override
	public void method31895(@OriginalArg(0) int arg0) {
		@Pc(5) Class93_Sub22 local5 = Class102.method2588(Class446.aClass446_48, client.aClass175_2.aClass24_2, (byte) 112);
		@Pc(16) int local16 = (local5.aPacketBit_1.pos += -1445626955) * 212851357;
		local5.aPacketBit_1.p1(this.aClass72_3.method36920(), (byte) -109);
		local5.aPacketBit_1.pjstr(this.aString231, 1785495722);
		local5.aPacketBit_1.p2(this.anInt5549 * -1620060651, 2130770716);
		local5.aPacketBit_1.pjstr(Class527.aString223, 1143402571);
		if (this.aString230 == null) {
			local5.aPacketBit_1.p1(0, (byte) -115);
		} else {
			local5.aPacketBit_1.p1(1, (byte) -111);
			@Pc(53) String local53 = this.aString230;
			if (local53.length() > 100) {
				local53 = local53.substring(0, 100);
			}
			local5.aPacketBit_1.pjstr(local53, 157129624);
		}
		local5.aPacketBit_1.psize1(local5.aPacketBit_1.pos * 212851357 - local16, (byte) 64);
		client.aClass175_2.method24356(local5, -2098922188);
	}

	@OriginalMember(owner = "client!ur", name = "m", descriptor = "()V", line = 95)
	@Override
	public void method31896() {
		@Pc(5) Class93_Sub22 local5 = Class102.method2588(Class446.aClass446_48, client.aClass175_2.aClass24_2, (byte) 84);
		@Pc(16) int local16 = (local5.aPacketBit_1.pos += -1445626955) * 212851357;
		local5.aPacketBit_1.p1(this.aClass72_3.method36920(), (byte) -100);
		local5.aPacketBit_1.pjstr(this.aString231, 1555231612);
		local5.aPacketBit_1.p2(this.anInt5549 * -1620060651, 2131304719);
		local5.aPacketBit_1.pjstr(Class527.aString223, -634106784);
		if (this.aString230 == null) {
			local5.aPacketBit_1.p1(0, (byte) -112);
		} else {
			local5.aPacketBit_1.p1(1, (byte) -118);
			@Pc(53) String local53 = this.aString230;
			if (local53.length() > 100) {
				local53 = local53.substring(0, 100);
			}
			local5.aPacketBit_1.pjstr(local53, 1074521866);
		}
		local5.aPacketBit_1.psize1(local5.aPacketBit_1.pos * 212851357 - local16, (byte) 7);
		client.aClass175_2.method24356(local5, -2066726093);
	}

	@OriginalMember(owner = "client!ur", name = "n", descriptor = "()V", line = 95)
	@Override
	public void method31894() {
		@Pc(5) Class93_Sub22 local5 = Class102.method2588(Class446.aClass446_48, client.aClass175_2.aClass24_2, (byte) 89);
		@Pc(16) int local16 = (local5.aPacketBit_1.pos += -1445626955) * 212851357;
		local5.aPacketBit_1.p1(this.aClass72_3.method36920(), (byte) -88);
		local5.aPacketBit_1.pjstr(this.aString231, 2035137442);
		local5.aPacketBit_1.p2(this.anInt5549 * -1620060651, 2145038277);
		local5.aPacketBit_1.pjstr(Class527.aString223, -2011882673);
		if (this.aString230 == null) {
			local5.aPacketBit_1.p1(0, (byte) -97);
		} else {
			local5.aPacketBit_1.p1(1, (byte) -109);
			@Pc(53) String local53 = this.aString230;
			if (local53.length() > 100) {
				local53 = local53.substring(0, 100);
			}
			local5.aPacketBit_1.pjstr(local53, 1272818467);
		}
		local5.aPacketBit_1.psize1(local5.aPacketBit_1.pos * 212851357 - local16, (byte) 12);
		client.aClass175_2.method24356(local5, -2049922226);
	}

	@OriginalMember(owner = "client!ur", name = "f", descriptor = "()V", line = 95)
	@Override
	public void method31898() {
		@Pc(5) Class93_Sub22 local5 = Class102.method2588(Class446.aClass446_48, client.aClass175_2.aClass24_2, (byte) 75);
		@Pc(16) int local16 = (local5.aPacketBit_1.pos += -1445626955) * 212851357;
		local5.aPacketBit_1.p1(this.aClass72_3.method36920(), (byte) -32);
		local5.aPacketBit_1.pjstr(this.aString231, -1285080766);
		local5.aPacketBit_1.p2(this.anInt5549 * -1620060651, 2132714364);
		local5.aPacketBit_1.pjstr(Class527.aString223, -1326473836);
		if (this.aString230 == null) {
			local5.aPacketBit_1.p1(0, (byte) -33);
		} else {
			local5.aPacketBit_1.p1(1, (byte) -121);
			@Pc(53) String local53 = this.aString230;
			if (local53.length() > 100) {
				local53 = local53.substring(0, 100);
			}
			local5.aPacketBit_1.pjstr(local53, -1329152785);
		}
		local5.aPacketBit_1.psize1(local5.aPacketBit_1.pos * 212851357 - local16, (byte) 115);
		client.aClass175_2.method24356(local5, -1490431215);
	}

	@OriginalMember(owner = "client!ur", name = "k", descriptor = "()V", line = 95)
	@Override
	public void method31897() {
		@Pc(5) Class93_Sub22 local5 = Class102.method2588(Class446.aClass446_48, client.aClass175_2.aClass24_2, (byte) 123);
		@Pc(16) int local16 = (local5.aPacketBit_1.pos += -1445626955) * 212851357;
		local5.aPacketBit_1.p1(this.aClass72_3.method36920(), (byte) -84);
		local5.aPacketBit_1.pjstr(this.aString231, -321854920);
		local5.aPacketBit_1.p2(this.anInt5549 * -1620060651, 2146916514);
		local5.aPacketBit_1.pjstr(Class527.aString223, 616372095);
		if (this.aString230 == null) {
			local5.aPacketBit_1.p1(0, (byte) -19);
		} else {
			local5.aPacketBit_1.p1(1, (byte) -77);
			@Pc(53) String local53 = this.aString230;
			if (local53.length() > 100) {
				local53 = local53.substring(0, 100);
			}
			local5.aPacketBit_1.pjstr(local53, 250825895);
		}
		local5.aPacketBit_1.psize1(local5.aPacketBit_1.pos * 212851357 - local16, (byte) 90);
		client.aClass175_2.method24356(local5, -1602139032);
	}

	@OriginalMember(owner = "client!ur", name = "pd", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V", line = 7762)
	static final void method31850(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt5888 -= 957530791) * 587908375];
		if (Class532.method30597(local13, arg2, 1518522314) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray40 = Class499.method30149(local13, arg2, -823657617);
		arg0.aBoolean680 = true;
	}

	@OriginalMember(owner = "client!ur", name = "aoq", descriptor = "(Lclient!yf;S)V", line = 12631)
	static final void method31851(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) throws Exception_Sub3 {
		arg0.anInt5891 -= 463840436;
		@Pc(14) float local14 = (float) arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(25) float local25 = (float) arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		@Pc(36) float local36 = (float) arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 2];
		@Pc(49) float local49 = (float) arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 3] / 1000.0F;
		Class65.aClass123_Sub1_2.method8973(Class472.method29535(local14, local25, local36), local49, 933502888);
	}

	@OriginalMember(owner = "client!ur", name = "avn", descriptor = "(Lclient!yf;I)V", line = 13449)
	static final void method31852(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
	}

	@OriginalMember(owner = "client!ur", name = "avv", descriptor = "(Lclient!yf;I)V", line = 13497)
	static final void method31853(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
	}
}
