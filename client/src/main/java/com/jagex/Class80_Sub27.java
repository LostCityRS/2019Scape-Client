package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!akq")
public final class Class80_Sub27 extends Class80 {

	@OriginalMember(owner = "client!akq", name = "g", descriptor = "I")
	public static final int anInt1628 = 4;

	@OriginalMember(owner = "client!akq", name = "l", descriptor = "I")
	public static final int anInt1629 = 2;

	@OriginalMember(owner = "client!akq", name = "j", descriptor = "I")
	public static final int anInt1630 = 64;

	@OriginalMember(owner = "client!akq", name = "u", descriptor = "I")
	public static final int anInt1631 = 1;

	@OriginalMember(owner = "client!akq", name = "i", descriptor = "I")
	public static final int anInt1632 = 8;

	@OriginalMember(owner = "client!akq", name = "o", descriptor = "I")
	public static final int anInt1633 = 32;

	@OriginalMember(owner = "client!akq", name = "m", descriptor = "I")
	public static final int anInt1634 = 16;

	@OriginalMember(owner = "client!akq", name = "a", descriptor = "Lclient!akq;")
	static final Class80_Sub27 aClass80_Sub27_1 = new Class80_Sub27(0, -1);

	@OriginalMember(owner = "client!akq", name = "s", descriptor = "I")
	public final int anInt1635;

	@OriginalMember(owner = "client!akq", name = "k", descriptor = "I")
	public final int anInt1636;

	@OriginalMember(owner = "client!akq", name = "p", descriptor = "(I)I")
	static int method14311(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!akq", name = "v", descriptor = "(I)I")
	static int method14326(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!akq", name = "bcp", descriptor = "(Lclient!yp;S)V")
	static void method14334(@OriginalArg(0) Class690 arg0, @OriginalArg(1) short arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = client.anInt3431 * -1402260617 == arg0.aClass120_Sub1_Sub1_Sub1_4.method18987((byte) 0) ? 1 : 0;
	}

	@OriginalMember(owner = "client!akq", name = "ap", descriptor = "(III)V")
	static void method14335(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(15, (long) arg0);
		local4.method22135(-457826299);
		local4.anInt3064 = arg1 * -1221031713;
	}

	@OriginalMember(owner = "client!akq", name = "<init>", descriptor = "(II)V")
	public Class80_Sub27(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1635 = arg0 * -1327702409;
		this.anInt1636 = arg1 * -1552913669;
	}

	@OriginalMember(owner = "client!akq", name = "t", descriptor = "(I)Z")
	public boolean method14312(@OriginalArg(0) int arg0) {
		return (this.anInt1635 * 1713789767 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!akq", name = "f", descriptor = "(IB)Z")
	public boolean method14313(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return (this.anInt1635 * 1713789767 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!akq", name = "g", descriptor = "(I)Z")
	public boolean method14314(@OriginalArg(0) int arg0) {
		return (this.anInt1635 * 1713789767 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!akq", name = "l", descriptor = "(I)I")
	public int method14315(@OriginalArg(0) int arg0) {
		return this.anInt1635 * 1713789767 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!akq", name = "i", descriptor = "(B)Z")
	public boolean method14316(@OriginalArg(0) byte arg0) {
		return (this.anInt1635 * 1713789767 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!akq", name = "m", descriptor = "(I)Z")
	public boolean method14317(@OriginalArg(0) int arg0) {
		return (this.anInt1635 * 1713789767 >> 23 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!akq", name = "ax", descriptor = "()Z")
	public boolean method14318() {
		return (this.anInt1635 * 1713789767 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!akq", name = "o", descriptor = "()Z")
	public boolean method14319() {
		return (this.anInt1635 * 1713789767 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!akq", name = "j", descriptor = "()Z")
	public boolean method14320() {
		return (this.anInt1635 * 1713789767 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!akq", name = "a", descriptor = "(I)Z")
	public boolean method14321(@OriginalArg(0) int arg0) {
		return (this.anInt1635 * 1713789767 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!akq", name = "s", descriptor = "(I)Z")
	public boolean method14322(@OriginalArg(0) int arg0) {
		return (this.anInt1635 * 1713789767 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!akq", name = "x", descriptor = "()I")
	public int method14323() {
		return Class255.method26407(this.anInt1635 * 1713789767, -1163369577);
	}

	@OriginalMember(owner = "client!akq", name = "z", descriptor = "()I")
	public int method14324() {
		return Class255.method26407(this.anInt1635 * 1713789767, 2133093069);
	}

	@OriginalMember(owner = "client!akq", name = "e", descriptor = "(I)I")
	public int method14325(@OriginalArg(0) int arg0) {
		return Class255.method26407(this.anInt1635 * 1713789767, 703263284);
	}

	@OriginalMember(owner = "client!akq", name = "n", descriptor = "()Z")
	public boolean method14327() {
		return (this.anInt1635 * 1713789767 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!akq", name = "c", descriptor = "()Z")
	public boolean method14328() {
		return (this.anInt1635 * 1713789767 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!akq", name = "b", descriptor = "()Z")
	public boolean method14329() {
		return (this.anInt1635 * 1713789767 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!akq", name = "y", descriptor = "()I")
	public int method14330() {
		return this.anInt1635 * 1713789767 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!akq", name = "ay", descriptor = "()Z")
	public boolean method14331() {
		return (this.anInt1635 * 1713789767 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!akq", name = "ai", descriptor = "()Z")
	public boolean method14332() {
		return (this.anInt1635 * 1713789767 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!akq", name = "aq", descriptor = "()Z")
	public boolean method14333() {
		return (this.anInt1635 * 1713789767 >> 23 & 0x1) != 0;
	}
}
