package com.jagex;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!acc")
final class Class54 implements Iterator {

	@OriginalMember(owner = "client!acc", name = "t", descriptor = "I")
	int anInt202;

	// $FF: synthetic field
	@OriginalMember(owner = "client!acc", name = "this$0", descriptor = "Lclient!abq;")
	final Class41 aClass41_1;

	@OriginalMember(owner = "client!acc", name = "f", descriptor = "(II)I")
	public static int method1096(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = (arg0 & 0x55555555) + (arg0 >>> 1 & 0x55555555);
		@Pc(19) int local19 = (local9 >>> 2 & 0x33333333) + (local9 & 0x33333333);
		@Pc(27) int local27 = (local19 >>> 4) + local19 & 0xF0F0F0F;
		@Pc(33) int local33 = local27 + (local27 >>> 8);
		@Pc(39) int local39 = local33 + (local33 >>> 16);
		return local39 & 0xFF;
	}

	@OriginalMember(owner = "client!acc", name = "asz", descriptor = "(Lclient!yp;B)V")
	static void method1097(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub11_1, arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581], (byte) 87);
		Class719.method37291(-245874356);
		client.aBoolean714 = false;
	}

	@OriginalMember(owner = "client!acc", name = "<init>", descriptor = "(Lclient!abq;)V")
	Class54(@OriginalArg(0) Class41 arg0) {
		this.aClass41_1 = arg0;
	}

	@OriginalMember(owner = "client!acc", name = "e", descriptor = "()V")
	public void method1092() {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!acc", name = "hasNext", descriptor = "()Z")
	@Override
	public boolean hasNext() {
		return this.anInt202 * 673482969 < this.aClass41_1.anInt2476 * 462823477;
	}

	@OriginalMember(owner = "client!acc", name = "next", descriptor = "()Ljava/lang/Object;")
	@Override
	public Object next() {
		@Pc(11) int local11 = (this.anInt202 += -532711575) * 673482969 - 1;
		@Pc(16) Class243 local16 = this.aClass41_1.aClass243_63;
		synchronized (this.aClass41_1.aClass243_63) {
			@Pc(25) Interface11 local25 = (Interface11) this.aClass41_1.aClass243_63.method26282((long) local11);
			if (local25 != null) {
				return local25;
			}
		}
		return this.aClass41_1.method17926(local11, (byte) -121);
	}

	@OriginalMember(owner = "client!acc", name = "u", descriptor = "()V")
	public void method1093() {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!acc", name = "t", descriptor = "()Z")
	public boolean method1094() {
		return this.anInt202 * 673482969 < this.aClass41_1.anInt2476 * 462823477;
	}

	@OriginalMember(owner = "client!acc", name = "f", descriptor = "()Ljava/lang/Object;")
	public Object method1095() {
		@Pc(11) int local11 = (this.anInt202 += -532711575) * 673482969 - 1;
		@Pc(16) Class243 local16 = this.aClass41_1.aClass243_63;
		synchronized (this.aClass41_1.aClass243_63) {
			@Pc(25) Interface11 local25 = (Interface11) this.aClass41_1.aClass243_63.method26282((long) local11);
			if (local25 != null) {
				return local25;
			}
		}
		return this.aClass41_1.method17926(local11, (byte) -100);
	}

	@OriginalMember(owner = "client!acc", name = "remove", descriptor = "()V")
	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}
}
