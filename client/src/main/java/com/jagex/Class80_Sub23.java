package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!akm")
public final class Class80_Sub23 extends Class80 {

	@OriginalMember(owner = "client!akm", name = "l", descriptor = "I")
	public static final int anInt1610 = 0;

	@OriginalMember(owner = "client!akm", name = "g", descriptor = "I")
	public static final int anInt1611 = 1;

	@OriginalMember(owner = "client!akm", name = "m", descriptor = "I")
	public static final int anInt1612 = 3;

	@OriginalMember(owner = "client!akm", name = "o", descriptor = "I")
	public static final int anInt1613 = 5;

	@OriginalMember(owner = "client!akm", name = "u", descriptor = "Z")
	static final boolean aBoolean371 = false;

	@OriginalMember(owner = "client!akm", name = "i", descriptor = "I")
	public static final int anInt1614 = 2;

	@OriginalMember(owner = "client!akm", name = "a", descriptor = "I")
	public static final int anInt1615 = 7;

	@OriginalMember(owner = "client!akm", name = "k", descriptor = "I")
	public static final int anInt1616 = 9;

	@OriginalMember(owner = "client!akm", name = "x", descriptor = "I")
	public static final int anInt1617 = 10;

	@OriginalMember(owner = "client!akm", name = "s", descriptor = "I")
	public static final int anInt1620 = 8;

	@OriginalMember(owner = "client!akm", name = "j", descriptor = "I")
	static final int anInt1621 = 6;

	@OriginalMember(owner = "client!akm", name = "w", descriptor = "I")
	int anInt1618;

	@OriginalMember(owner = "client!akm", name = "r", descriptor = "I")
	int anInt1619;

	@OriginalMember(owner = "client!akm", name = "q", descriptor = "[I")
	int[] anIntArray188;

	@OriginalMember(owner = "client!akm", name = "h", descriptor = "[[I")
	int[][] anIntArrayArray41;

	@OriginalMember(owner = "client!akm", name = "d", descriptor = "[Z")
	boolean[] aBooleanArray8;

	@OriginalMember(owner = "client!akm", name = "z", descriptor = "[I")
	int[] anIntArray187;

	@OriginalMember(owner = "client!akm", name = "v", descriptor = "[Lclient!cw;")
	Class217[] aClass217Array1;

	@OriginalMember(owner = "client!akm", name = "p", descriptor = "[I")
	int[] anIntArray189;

	@OriginalMember(owner = "client!akm", name = "<init>", descriptor = "(I[B)V")
	Class80_Sub23(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt1618 = arg0 * -450281439;
		@Pc(11) Packet local11 = new Packet(arg1);
		this.anInt1619 = local11.g2() * 967488945;
		this.anIntArray188 = new int[this.anInt1619 * -1195478191];
		this.anIntArrayArray41 = new int[this.anInt1619 * -1195478191][];
		this.aBooleanArray8 = new boolean[this.anInt1619 * -1195478191];
		this.anIntArray187 = new int[this.anInt1619 * -1195478191];
		@Pc(48) int local48;
		for (local48 = 0; local48 < this.anInt1619 * -1195478191; local48++) {
			this.anIntArray188[local48] = local11.g1();
			if (this.anIntArray188[local48] == 6) {
				this.anIntArray188[local48] = 2;
			}
		}
		for (local48 = 0; local48 < this.anInt1619 * -1195478191; local48++) {
			this.aBooleanArray8[local48] = local11.g1() == 1;
		}
		for (local48 = 0; local48 < this.anInt1619 * -1195478191; local48++) {
			this.anIntArray187[local48] = local11.g2();
		}
		for (local48 = 0; local48 < this.anInt1619 * -1195478191; local48++) {
			this.anIntArrayArray41[local48] = new int[local11.gSmart1or2()];
		}
		@Pc(141) int local141;
		for (local48 = 0; local48 < this.anInt1619 * -1195478191; local48++) {
			for (local141 = 0; local141 < this.anIntArrayArray41[local48].length; local141++) {
				this.anIntArrayArray41[local48][local141] = local11.gSmart1or2();
			}
		}
		local48 = local11.g2();
		this.aClass217Array1 = new Class217[local48];
		local141 = local11.g1();
		@Pc(175) int local175;
		for (local175 = 0; local175 < local48; local175++) {
			this.aClass217Array1[local175] = new Class217(local141, local11, false);
		}
		local175 = local11.g2s();
		this.anIntArray189 = new int[local175];
		for (@Pc(200) int local200 = 0; local200 < this.anIntArray189.length; local200++) {
			this.anIntArray189[local200] = local11.g2s();
		}
		this.method14243(-848568447);
	}

	@OriginalMember(owner = "client!akm", name = "f", descriptor = "()V")
	void method14242() {
		@Pc(2) Class217[] local2 = this.aClass217Array1;
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class217 local12 = local2[local4];
			if (local12.anInt3612 * 809974957 >= 0) {
				local12.aClass217_1 = this.aClass217Array1[local12.anInt3612 * 809974957];
			}
		}
	}

	@OriginalMember(owner = "client!akm", name = "t", descriptor = "(I)V")
	void method14243(@OriginalArg(0) int arg0) {
		@Pc(2) Class217[] local2 = this.aClass217Array1;
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class217 local12 = local2[local4];
			if (local12.anInt3612 * 809974957 >= 0) {
				local12.aClass217_1 = this.aClass217Array1[local12.anInt3612 * 809974957];
			}
		}
	}
}
