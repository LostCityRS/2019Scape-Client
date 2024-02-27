package com.jagex;

import java.io.IOException;
import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ack")
final class Class61 implements Iterator {

	@OriginalMember(owner = "client!ack", name = "e", descriptor = "I")
	int anInt229;

	// $FF: synthetic field
	@OriginalMember(owner = "client!ack", name = "this$0", descriptor = "Lclient!acd;")
	final Class55 aClass55_1;

	@OriginalMember(owner = "client!ack", name = "q", descriptor = "(IB)V")
	public static void method1130(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		Class166_Sub39.anInt2328 = arg0 * -1893474517;
		Class312.aClass240_77.method25926((byte) -68);
	}

	@OriginalMember(owner = "client!ack", name = "uq", descriptor = "(Lclient!yf;I)V")
	static void method1131(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, 1743635460);
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local16.anInt4026 * 897022795;
	}

	@OriginalMember(owner = "client!ack", name = "b", descriptor = "(I)V")
	static void method1132(@OriginalArg(0) int arg0) {
		if (Class588.aClass588_3 == null) {
			return;
		}
		try {
			@Pc(9) short local9;
			if (Class676.anInt6044 * -1667786339 == 0) {
				local9 = 250;
			} else {
				local9 = 2000;
			}
			Class676.anInt6046 += -2146389243;
			if (Class676.anInt6046 * -1394007603 > local9) {
				Class132_Sub1_Sub3_Sub1.method12304(-109098973);
			}
			@Pc(62) int local62;
			if (Class588.aClass588_1 == Class588.aClass588_3) {
				client.aClass175_1.method24365(Class516.method30470(Class50.aClass28_2.method599((byte) 1), 40000, (short) -5827), Class50.aClass28_2.aString4, 2126602668);
				client.aClass175_1.method24381(1778124812);
				@Pc(43) Class93_Sub22 local43 = Class720.method37099((byte) 31);
				local43.aClass93_Sub41_Sub2_1.method22522(Class449.aClass449_6.anInt5141 * 1690737369, (byte) -94);
				local43.aClass93_Sub41_Sub2_1.method22466(0, 2129088042);
				local62 = local43.aClass93_Sub41_Sub2_1.anInt3070 * 212851357;
				local43.aClass93_Sub41_Sub2_1.method22466(910, 2124806922);
				local43.aClass93_Sub41_Sub2_1.method22466(1, 2141744574);
				Class676.anIntArray518 = Class367.method28140(local43, (byte) 117);
				@Pc(82) int local82 = local43.aClass93_Sub41_Sub2_1.anInt3070 * 212851357;
				local43.aClass93_Sub41_Sub2_1.method22414(client.aString139, 802881230);
				local43.aClass93_Sub41_Sub2_1.method22466(client.anInt3426 * -1765120027, 2143561161);
				local43.aClass93_Sub41_Sub2_1.method22407(client.anInt3429 * 1672118199, (byte) 61);
				local43.aClass93_Sub41_Sub2_1.method22407(client.anInt3428 * -1830493323, (byte) 109);
				local43.aClass93_Sub41_Sub2_1.method22414(Class454.aString219, -569118241);
				local43.aClass93_Sub41_Sub2_1.method22522(Class106.aClass717_8.method37101(), (byte) -97);
				local43.aClass93_Sub41_Sub2_1.method22522(client.aClass702_4.anInt6114 * -1111983921, (byte) -80);
				Class314.method27033(local43.aClass93_Sub41_Sub2_1, 1822213152);
				@Pc(133) String local133 = client.aString138;
				local43.aClass93_Sub41_Sub2_1.method22522(local133 == null ? 0 : 1, (byte) -103);
				if (local133 != null) {
					local43.aClass93_Sub41_Sub2_1.method22414(local133, 1575484636);
				}
				Class125_Sub3.aClass93_Sub42_1.method15310(local43.aClass93_Sub41_Sub2_1, 1797123567);
				local43.aClass93_Sub41_Sub2_1.anInt3070 += -1529454093;
				local43.aClass93_Sub41_Sub2_1.method22453(Class676.anIntArray518, local82, local43.aClass93_Sub41_Sub2_1.anInt3070 * 212851357, (byte) -117);
				local43.aClass93_Sub41_Sub2_1.method22419(local43.aClass93_Sub41_Sub2_1.anInt3070 * 212851357 - local62, 1251011626);
				client.aClass175_1.method24363(local43, -1683542800);
				client.aClass175_1.method24362((byte) 15);
				Class588.aClass588_3 = Class588.aClass588_2;
			}
			if (Class588.aClass588_2 == Class588.aClass588_3) {
				if (client.aClass175_1.method24368((byte) 21) == null) {
					Class132_Sub1_Sub3_Sub1.method12304(-109098973);
					return;
				}
				if (!client.aClass175_1.method24368((byte) 41).method14720(1, 30631038)) {
					return;
				}
				client.aClass175_1.method24368((byte) 3).method14711(client.aClass175_1.aClass93_Sub41_Sub2_2.aByteArray58, 0, 1, (byte) -80);
				Class676.aClass709_1 = (Class709) Class107.method18131(Class124_Sub3.method21467(-1406618035), client.aClass175_1.aClass93_Sub41_Sub2_2.aByteArray58[0] & 0xFF, -1915563430);
				if (Class709.aClass709_7 == Class676.aClass709_1) {
					client.aClass175_1.aClass24_2 = new Class24(Class676.anIntArray518);
					@Pc(247) int[] local247 = new int[4];
					for (local62 = 0; local62 < 4; local62++) {
						local247[local62] = Class676.anIntArray518[local62] + 50;
					}
					client.aClass175_1.aClass24_3 = new Class24(local247);
					new Class24(local247);
					client.aClass175_1.aClass93_Sub41_Sub2_2.method22684(client.aClass175_1.aClass24_3, (byte) -60);
					Class481.method29937(0, 1823202236);
					client.aClass175_1.method24381(-62093601);
					client.aClass175_1.aClass93_Sub41_Sub2_2.anInt3070 = 0;
					client.aClass175_1.aClass453_1 = null;
					client.aClass175_1.aClass453_4 = null;
					client.aClass175_1.aClass453_3 = null;
					client.aClass175_1.anInt3298 = 0;
					Class624.aClass120_1.aClass647_1.method32823((byte) 119);
					Class151.method13981(-2015714483);
				} else {
					client.aClass175_1.method24367((byte) 34);
				}
				client.aClass175_1.aClass453_2 = null;
				Class588.aClass588_3 = null;
			}
		} catch (@Pc(318) IOException local318) {
			Class132_Sub1_Sub3_Sub1.method12304(-109098973);
		}
	}

	@OriginalMember(owner = "client!ack", name = "<init>", descriptor = "(Lclient!acd;)V")
	Class61(@OriginalArg(0) Class55 arg0) {
		this.aClass55_1 = arg0;
	}

	@OriginalMember(owner = "client!ack", name = "e", descriptor = "()Z")
	public boolean method1124() {
		return this.anInt229 * 339631723 < this.aClass55_1.anInterface13Array3.length;
	}

	@OriginalMember(owner = "client!ack", name = "next", descriptor = "()Ljava/lang/Object;")
	@Override
	public Object next() {
		return this.aClass55_1.anInterface13Array3[(this.anInt229 += 1669750339) * 339631723 - 1];
	}

	@OriginalMember(owner = "client!ack", name = "k", descriptor = "()Ljava/lang/Object;")
	public Object method1125() {
		return this.aClass55_1.anInterface13Array3[(this.anInt229 += 1669750339) * 339631723 - 1];
	}

	@OriginalMember(owner = "client!ack", name = "remove", descriptor = "()V")
	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!ack", name = "hasNext", descriptor = "()Z")
	@Override
	public boolean hasNext() {
		return this.anInt229 * 339631723 < this.aClass55_1.anInterface13Array3.length;
	}

	@OriginalMember(owner = "client!ack", name = "n", descriptor = "()Z")
	public boolean method1126() {
		return this.anInt229 * 339631723 < this.aClass55_1.anInterface13Array3.length;
	}

	@OriginalMember(owner = "client!ack", name = "m", descriptor = "()Ljava/lang/Object;")
	public Object method1127() {
		return this.aClass55_1.anInterface13Array3[(this.anInt229 += 1669750339) * 339631723 - 1];
	}

	@OriginalMember(owner = "client!ack", name = "f", descriptor = "()V")
	public void method1128() {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!ack", name = "w", descriptor = "()V")
	public void method1129() {
		throw new UnsupportedOperationException();
	}
}
