package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ako")
public final class Class93_Sub25 extends Class93 {

	@OriginalMember(owner = "client!ako", name = "v", descriptor = "I")
	public static final int anInt1581 = 10;

	@OriginalMember(owner = "client!ako", name = "w", descriptor = "I")
	public static final int anInt1582 = 1;

	@OriginalMember(owner = "client!ako", name = "l", descriptor = "I")
	public static final int anInt1583 = 2;

	@OriginalMember(owner = "client!ako", name = "u", descriptor = "I")
	public static final int anInt1584 = 3;

	@OriginalMember(owner = "client!ako", name = "d", descriptor = "I")
	public static final int anInt1585 = 7;

	@OriginalMember(owner = "client!ako", name = "p", descriptor = "I")
	static final int anInt1586 = 6;

	@OriginalMember(owner = "client!ako", name = "c", descriptor = "I")
	public static final int anInt1587 = 8;

	@OriginalMember(owner = "client!ako", name = "r", descriptor = "I")
	public static final int anInt1588 = 9;

	@OriginalMember(owner = "client!ako", name = "f", descriptor = "I")
	public static final int anInt1591 = 0;

	@OriginalMember(owner = "client!ako", name = "z", descriptor = "I")
	public static final int anInt1592 = 5;

	@OriginalMember(owner = "client!ako", name = "k", descriptor = "Z")
	static final boolean aBoolean338 = false;

	@OriginalMember(owner = "client!ako", name = "o", descriptor = "I")
	int anInt1589;

	@OriginalMember(owner = "client!ako", name = "s", descriptor = "I")
	int anInt1590;

	@OriginalMember(owner = "client!ako", name = "y", descriptor = "[I")
	int[] anIntArray180;

	@OriginalMember(owner = "client!ako", name = "q", descriptor = "[[I")
	int[][] anIntArrayArray41;

	@OriginalMember(owner = "client!ako", name = "x", descriptor = "[Z")
	boolean[] aBooleanArray9;

	@OriginalMember(owner = "client!ako", name = "b", descriptor = "[I")
	int[] anIntArray181;

	@OriginalMember(owner = "client!ako", name = "a", descriptor = "[Lclient!cs;")
	Class212[] aClass212Array1;

	@OriginalMember(owner = "client!ako", name = "h", descriptor = "[I")
	int[] anIntArray179;

	@OriginalMember(owner = "client!ako", name = "<init>", descriptor = "(I[B)V")
	Class93_Sub25(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.anInt1589 = arg0 * 1532840927;
		@Pc(11) Class93_Sub41 local11 = new Class93_Sub41(arg1);
		this.anInt1590 = local11.method22427(-1434290800) * 460052471;
		this.anIntArray180 = new int[this.anInt1590 * 1418467783];
		this.anIntArrayArray41 = new int[this.anInt1590 * 1418467783][];
		this.aBooleanArray9 = new boolean[this.anInt1590 * 1418467783];
		this.anIntArray181 = new int[this.anInt1590 * 1418467783];
		@Pc(48) int local48;
		for (local48 = 0; local48 < this.anInt1590 * 1418467783; local48++) {
			this.anIntArray180[local48] = local11.method22425((short) 16384);
			if (this.anIntArray180[local48] == 6) {
				this.anIntArray180[local48] = 2;
			}
		}
		for (local48 = 0; local48 < this.anInt1590 * 1418467783; local48++) {
			this.aBooleanArray9[local48] = local11.method22425((short) 16384) == 1;
		}
		for (local48 = 0; local48 < this.anInt1590 * 1418467783; local48++) {
			this.anIntArray181[local48] = local11.method22427(-1434290800);
		}
		for (local48 = 0; local48 < this.anInt1590 * 1418467783; local48++) {
			this.anIntArrayArray41[local48] = new int[local11.method22644((byte) -32)];
		}
		@Pc(141) int local141;
		for (local48 = 0; local48 < this.anInt1590 * 1418467783; local48++) {
			for (local141 = 0; local141 < this.anIntArrayArray41[local48].length; local141++) {
				this.anIntArrayArray41[local48][local141] = local11.method22644((byte) -93);
			}
		}
		local48 = local11.method22427(-1434290800);
		this.aClass212Array1 = new Class212[local48];
		local141 = local11.method22425((short) 16384);
		@Pc(175) int local175;
		for (local175 = 0; local175 < local48; local175++) {
			this.aClass212Array1[local175] = new Class212(local141, local11, false);
		}
		local175 = local11.method22494((byte) -34);
		this.anIntArray179 = new int[local175];
		for (@Pc(200) int local200 = 0; local200 < this.anIntArray179.length; local200++) {
			this.anIntArray179[local200] = local11.method22494((byte) -101);
		}
		this.method13788(-1497248091);
	}

	@OriginalMember(owner = "client!ako", name = "m", descriptor = "()V")
	void method13787() {
		@Pc(2) Class212[] local2 = this.aClass212Array1;
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class212 local12 = local2[local4];
			if (local12.anInt3641 * 703780279 >= 0) {
				local12.aClass212_1 = this.aClass212Array1[local12.anInt3641 * 703780279];
			}
		}
	}

	@OriginalMember(owner = "client!ako", name = "e", descriptor = "(I)V")
	void method13788(@OriginalArg(0) int arg0) {
		@Pc(2) Class212[] local2 = this.aClass212Array1;
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class212 local12 = local2[local4];
			if (local12.anInt3641 * 703780279 >= 0) {
				local12.aClass212_1 = this.aClass212Array1[local12.anInt3641 * 703780279];
			}
		}
	}

	@OriginalMember(owner = "client!ako", name = "n", descriptor = "()V")
	void method13789() {
		@Pc(2) Class212[] local2 = this.aClass212Array1;
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class212 local12 = local2[local4];
			if (local12.anInt3641 * 703780279 >= 0) {
				local12.aClass212_1 = this.aClass212Array1[local12.anInt3641 * 703780279];
			}
		}
	}

	@OriginalMember(owner = "client!ako", name = "k", descriptor = "()V")
	void method13790() {
		@Pc(2) Class212[] local2 = this.aClass212Array1;
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class212 local12 = local2[local4];
			if (local12.anInt3641 * 703780279 >= 0) {
				local12.aClass212_1 = this.aClass212Array1[local12.anInt3641 * 703780279];
			}
		}
	}
}
