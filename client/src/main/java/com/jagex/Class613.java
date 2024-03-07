package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vg")
public class Class613 implements Interface75 {

	@OriginalMember(owner = "client!vg", name = "e", descriptor = "Lclient!vg;")
	static final Class613 aClass613_2 = new Class613(0);

	@OriginalMember(owner = "client!vg", name = "n", descriptor = "Lclient!vg;")
	static final Class613 aClass613_3 = new Class613(1);

	@OriginalMember(owner = "client!vg", name = "m", descriptor = "Lclient!vg;")
	public static final Class613 aClass613_4 = new Class613(2);

	@OriginalMember(owner = "client!vg", name = "k", descriptor = "I")
	final int anInt5627;

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(I)V", line = 17)
	Class613(@OriginalArg(0) int arg0) {
		this.anInt5627 = arg0 * 1474616659;
	}

	@OriginalMember(owner = "client!vg", name = "k", descriptor = "()I", line = 22)
	@Override
	public int method36919() {
		return this.anInt5627 * 919563995;
	}

	@OriginalMember(owner = "client!vg", name = "n", descriptor = "()I", line = 22)
	@Override
	public int getId() {
		return this.anInt5627 * 919563995;
	}

	@OriginalMember(owner = "client!vg", name = "f", descriptor = "(IB)V", line = 153)
	static void method32059(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(2) Class240 local2 = Class330.aClass240_79;
		synchronized (Class330.aClass240_79) {
			Class330.aClass240_79.method25843(arg0, (byte) 40);
		}
	}

	@OriginalMember(owner = "client!vg", name = "uu", descriptor = "(Lclient!yf;I)V", line = 8699)
	static final void method32060(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, 891652010);
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local16.anInt4035 * -220894753;
	}

	@OriginalMember(owner = "client!vg", name = "ahq", descriptor = "(Lclient!yf;B)V", line = 10853)
	static final void method32061(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		@Pc(29) Class87 local29 = (Class87) Class124.aClass32_Sub21_7.get(local23, -1030967057);
		if (local29.method1511(1429228259)) {
			arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = ((Class610) client.world.method30496(1139320094).get(local13, -1722652423)).method32000(local23, local29.aString11, (byte) 79);
		} else {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = ((Class610) client.world.method30496(2034848841).get(local13, 334707401)).method31997(local23, local29.anInt265 * 951920133, 1072417041);
		}
	}

	@OriginalMember(owner = "client!vg", name = "and", descriptor = "(Lclient!yf;I)V", line = 12186)
	static final void method32062(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		if (local12 < 0) {
			local12 = 0;
		}
		client.anInt3484 = (client.anInt3576 * 522759457 + local12) * 1541774401;
	}

	@OriginalMember(owner = "client!vg", name = "azh", descriptor = "(Lclient!yf;B)V", line = 14189)
	static final void method32063(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class51.options.aClass166_Sub4_1.method15424((byte) 0) ? 1 : 0;
	}

	@OriginalMember(owner = "client!vg", name = "bcr", descriptor = "(Lclient!yf;I)V", line = 14663)
	static final void method32064(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
	}

	@OriginalMember(owner = "client!vg", name = "bel", descriptor = "(Lclient!yf;I)V", line = 14836)
	static final void method32065(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = client.aClass270_1.method26280(local13, 1570649000).method26384(local23, 1443246446);
	}
}
