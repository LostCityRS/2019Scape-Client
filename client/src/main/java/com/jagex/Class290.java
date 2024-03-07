package com.jagex;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gj")
class Class290 implements Iterator {

	@OriginalMember(owner = "client!gj", name = "ua", descriptor = "I")
	static int anInt3911;

	@OriginalMember(owner = "client!gj", name = "e", descriptor = "I")
	int anInt3910;

	// $FF: synthetic field
	@OriginalMember(owner = "client!gj", name = "this$0", descriptor = "Lclient!adj;")
	final Class79_Sub1_Sub1 this$0;

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(Lclient!adj;)V", line = 60)
	Class290(@OriginalArg(0) Class79_Sub1_Sub1 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!gj", name = "hasNext", descriptor = "()Z", line = 64)
	@Override
	public boolean hasNext() {
		return this.anInt3910 * 1001134045 < this.this$0.method18262(1957922455);
	}

	@OriginalMember(owner = "client!gj", name = "n", descriptor = "()Z", line = 64)
	public boolean method26557() {
		return this.anInt3910 * 1001134045 < this.this$0.method18262(1852923904);
	}

	@OriginalMember(owner = "client!gj", name = "e", descriptor = "()Z", line = 64)
	public boolean method26558() {
		return this.anInt3910 * 1001134045 < this.this$0.method18262(1489512930);
	}

	@OriginalMember(owner = "client!gj", name = "next", descriptor = "()Ljava/lang/Object;", line = 68)
	@Override
	public Object next() {
		@Pc(11) int local11 = (this.anInt3910 += -1577584523) * 1001134045 - 1;
		@Pc(19) Class108_Sub1 local19 = (Class108_Sub1) this.this$0.aClass240_5.method25829((long) local11);
		return local19 == null ? this.this$0.method1419(local11, -1922638820) : local19;
	}

	@OriginalMember(owner = "client!gj", name = "m", descriptor = "()Ljava/lang/Object;", line = 68)
	public Object method26559() {
		@Pc(11) int local11 = (this.anInt3910 += -1577584523) * 1001134045 - 1;
		@Pc(19) Class108_Sub1 local19 = (Class108_Sub1) this.this$0.aClass240_5.method25829((long) local11);
		return local19 == null ? this.this$0.method1419(local11, -1956622138) : local19;
	}

	@OriginalMember(owner = "client!gj", name = "k", descriptor = "()Ljava/lang/Object;", line = 68)
	public Object method26560() {
		@Pc(11) int local11 = (this.anInt3910 += -1577584523) * 1001134045 - 1;
		@Pc(19) Class108_Sub1 local19 = (Class108_Sub1) this.this$0.aClass240_5.method25829((long) local11);
		return local19 == null ? this.this$0.method1419(local11, -2084386048) : local19;
	}

	@OriginalMember(owner = "client!gj", name = "remove", descriptor = "()V", line = 75)
	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!gj", name = "f", descriptor = "()V", line = 75)
	public void method26561() {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!gj", name = "w", descriptor = "()V", line = 75)
	public void method26562() {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!gj", name = "f", descriptor = "(I)V", line = 221)
	static void method26563(@OriginalArg(0) int arg0) {
		Class288.anIntArray370 = Class122_Sub3.method10156(2048, 35, 8, 8, 4, 0.4F, true, 2085440513);
	}

	@OriginalMember(owner = "client!gj", name = "zo", descriptor = "(Lclient!yf;I)V", line = 9457)
	static final void method26564(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(26) String local26 = (String) arg0.anObjectArray45[(arg0.anInt5888 -= 957530791) * 587908375];
		if (local12 == -1) {
			throw new RuntimeException();
		}
		@Pc(39) Class39 local39 = (Class39) Class19.aClass32_Sub7_5.method18261(local12, 1819008273);
		if (local39.aClass519_1 != Class519.aClass519_7) {
			throw new RuntimeException();
		}
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local39.method757(local26, (byte) 0) ? 1 : 0;
	}

	@OriginalMember(owner = "client!gj", name = "aga", descriptor = "(Lclient!yf;I)V", line = 10641)
	static final void method26565(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Character.toLowerCase((char) local12);
	}

	@OriginalMember(owner = "client!gj", name = "auk", descriptor = "(Lclient!yf;I)V", line = 13389)
	static final void method26566(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class51.options.aClass166_Sub4_1.method15426((byte) 78);
	}
}
