package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aau")
public final class Class23 {

	@OriginalMember(owner = "client!aau", name = "kf", descriptor = "I")
	public static int anInt74;

	@OriginalMember(owner = "client!aau", name = "e", descriptor = "I")
	int anInt71;

	@OriginalMember(owner = "client!aau", name = "n", descriptor = "I")
	int anInt72;

	@OriginalMember(owner = "client!aau", name = "m", descriptor = "I")
	int anInt73;

	@OriginalMember(owner = "client!aau", name = "f", descriptor = "Lclient!arr;")
	Class93_Sub1_Sub10 aClass93_Sub1_Sub10_1;

	@OriginalMember(owner = "client!aau", name = "k", descriptor = "Lclient!arr;")
	Class93_Sub1_Sub10 aClass93_Sub1_Sub10_2;

	@OriginalMember(owner = "client!aau", name = "w", descriptor = "Z")
	boolean aBoolean11 = false;

	@OriginalMember(owner = "client!aau", name = "ee", descriptor = "(IB)Z")
	static boolean method501(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return arg0 == 15 || arg0 == 16;
	}

	@OriginalMember(owner = "client!aau", name = "vt", descriptor = "(Lclient!yf;I)V")
	static void method502(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		Class558.method31291(true, 1990574348);
	}

	@OriginalMember(owner = "client!aau", name = "e", descriptor = "(IIZI)I")
	public static int method503(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class93_Sub6 local4 = Class557.method31246(arg0, arg2, (short) 255);
		if (local4 == null) {
			return -1;
		} else if (arg1 >= 0 && arg1 < local4.anIntArray173.length) {
			return local4.anIntArray173[arg1];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!aau", name = "<init>", descriptor = "()V")
	Class23() {
	}

	@OriginalMember(owner = "client!aau", name = "e", descriptor = "(Lclient!aos;Lclient!fg;II[II)Z")
	boolean method495(@OriginalArg(0) Class32_Sub17 arg0, @OriginalArg(1) Class263 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5) {
		if (this.aBoolean11) {
			return true;
		} else if (arg2 >= arg4.length) {
			return false;
		} else {
			this.anInt72 = arg4[arg2] * 1338501659;
			this.aClass93_Sub1_Sub10_2 = arg0.method17256(this.anInt72 * -1424564205 >> 16, -988168750);
			this.anInt72 = (this.anInt72 * -1424564205 & 0xFFFF) * 1338501659;
			if (this.aClass93_Sub1_Sub10_2 == null) {
				return false;
			}
			if (arg1.aBoolean673 && arg3 != -1 && arg3 < arg4.length) {
				this.anInt73 = arg4[arg3] * -1462611387;
				this.aClass93_Sub1_Sub10_1 = arg0.method17256(this.anInt73 * -278335347 >> 16, -1311558229);
				this.anInt73 = (this.anInt73 * -278335347 & 0xFFFF) * -1462611387;
			}
			if (arg1.aBoolean675) {
				this.anInt71 = (this.anInt71 * 2023242135 | 0x200) * -1408379353;
			}
			if (this.aClass93_Sub1_Sub10_2.method21790(this.anInt72 * -1424564205, 1369391285)) {
				this.anInt71 = (this.anInt71 * 2023242135 | 0x80) * -1408379353;
			}
			if (this.aClass93_Sub1_Sub10_2.method21789(this.anInt72 * -1424564205, -1422539724)) {
				this.anInt71 = (this.anInt71 * 2023242135 | 0x100) * -1408379353;
			}
			if (this.aClass93_Sub1_Sub10_2.method21787(this.anInt72 * -1424564205, 142244928)) {
				this.anInt71 = (this.anInt71 * 2023242135 | 0x400) * -1408379353;
			}
			if (this.aClass93_Sub1_Sub10_1 != null) {
				if (this.aClass93_Sub1_Sub10_1.method21790(this.anInt73 * -278335347, -1149009743)) {
					this.anInt71 = (this.anInt71 * 2023242135 | 0x80) * -1408379353;
				}
				if (this.aClass93_Sub1_Sub10_1.method21789(this.anInt73 * -278335347, 312888356)) {
					this.anInt71 = (this.anInt71 * 2023242135 | 0x100) * -1408379353;
				}
				if (this.aClass93_Sub1_Sub10_1.method21787(this.anInt73 * -278335347, -265974186)) {
					this.anInt71 = (this.anInt71 * 2023242135 | 0x400) * -1408379353;
				}
			}
			this.anInt71 = (this.anInt71 * 2023242135 | 0x20) * -1408379353;
			this.aBoolean11 = true;
			return true;
		}
	}

	@OriginalMember(owner = "client!aau", name = "n", descriptor = "(I)V")
	void method496(@OriginalArg(0) int arg0) {
		this.aBoolean11 = false;
		this.anInt71 = 0;
		this.aClass93_Sub1_Sub10_1 = null;
		this.aClass93_Sub1_Sub10_2 = null;
	}

	@OriginalMember(owner = "client!aau", name = "k", descriptor = "(Lclient!aos;Lclient!fg;II[I)Z")
	boolean method497(@OriginalArg(0) Class32_Sub17 arg0, @OriginalArg(1) Class263 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (this.aBoolean11) {
			return true;
		} else if (arg2 >= arg4.length) {
			return false;
		} else {
			this.anInt72 = arg4[arg2] * 1338501659;
			this.aClass93_Sub1_Sub10_2 = arg0.method17256(this.anInt72 * -1424564205 >> 16, 161191402);
			this.anInt72 = (this.anInt72 * -1424564205 & 0xFFFF) * 1338501659;
			if (this.aClass93_Sub1_Sub10_2 == null) {
				return false;
			}
			if (arg1.aBoolean673 && arg3 != -1 && arg3 < arg4.length) {
				this.anInt73 = arg4[arg3] * -1462611387;
				this.aClass93_Sub1_Sub10_1 = arg0.method17256(this.anInt73 * -278335347 >> 16, -1906853040);
				this.anInt73 = (this.anInt73 * -278335347 & 0xFFFF) * -1462611387;
			}
			if (arg1.aBoolean675) {
				this.anInt71 = (this.anInt71 * 2023242135 | 0x200) * -1408379353;
			}
			if (this.aClass93_Sub1_Sub10_2.method21790(this.anInt72 * -1424564205, 69459753)) {
				this.anInt71 = (this.anInt71 * 2023242135 | 0x80) * -1408379353;
			}
			if (this.aClass93_Sub1_Sub10_2.method21789(this.anInt72 * -1424564205, 1133250883)) {
				this.anInt71 = (this.anInt71 * 2023242135 | 0x100) * -1408379353;
			}
			if (this.aClass93_Sub1_Sub10_2.method21787(this.anInt72 * -1424564205, -250513480)) {
				this.anInt71 = (this.anInt71 * 2023242135 | 0x400) * -1408379353;
			}
			if (this.aClass93_Sub1_Sub10_1 != null) {
				if (this.aClass93_Sub1_Sub10_1.method21790(this.anInt73 * -278335347, -170699448)) {
					this.anInt71 = (this.anInt71 * 2023242135 | 0x80) * -1408379353;
				}
				if (this.aClass93_Sub1_Sub10_1.method21789(this.anInt73 * -278335347, 1577748118)) {
					this.anInt71 = (this.anInt71 * 2023242135 | 0x100) * -1408379353;
				}
				if (this.aClass93_Sub1_Sub10_1.method21787(this.anInt73 * -278335347, 1554409823)) {
					this.anInt71 = (this.anInt71 * 2023242135 | 0x400) * -1408379353;
				}
			}
			this.anInt71 = (this.anInt71 * 2023242135 | 0x20) * -1408379353;
			this.aBoolean11 = true;
			return true;
		}
	}

	@OriginalMember(owner = "client!aau", name = "m", descriptor = "(Lclient!aos;Lclient!fg;II[I)Z")
	boolean method498(@OriginalArg(0) Class32_Sub17 arg0, @OriginalArg(1) Class263 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (this.aBoolean11) {
			return true;
		} else if (arg2 >= arg4.length) {
			return false;
		} else {
			this.anInt72 = arg4[arg2] * 1338501659;
			this.aClass93_Sub1_Sub10_2 = arg0.method17256(this.anInt72 * -1424564205 >> 16, 113906593);
			this.anInt72 = (this.anInt72 * -1424564205 & 0xFFFF) * 1338501659;
			if (this.aClass93_Sub1_Sub10_2 == null) {
				return false;
			}
			if (arg1.aBoolean673 && arg3 != -1 && arg3 < arg4.length) {
				this.anInt73 = arg4[arg3] * -1462611387;
				this.aClass93_Sub1_Sub10_1 = arg0.method17256(this.anInt73 * -278335347 >> 16, -1242085307);
				this.anInt73 = (this.anInt73 * -278335347 & 0xFFFF) * -1462611387;
			}
			if (arg1.aBoolean675) {
				this.anInt71 = (this.anInt71 * 2023242135 | 0x200) * -1408379353;
			}
			if (this.aClass93_Sub1_Sub10_2.method21790(this.anInt72 * -1424564205, -894352649)) {
				this.anInt71 = (this.anInt71 * 2023242135 | 0x80) * -1408379353;
			}
			if (this.aClass93_Sub1_Sub10_2.method21789(this.anInt72 * -1424564205, -1244437133)) {
				this.anInt71 = (this.anInt71 * 2023242135 | 0x100) * -1408379353;
			}
			if (this.aClass93_Sub1_Sub10_2.method21787(this.anInt72 * -1424564205, 420418019)) {
				this.anInt71 = (this.anInt71 * 2023242135 | 0x400) * -1408379353;
			}
			if (this.aClass93_Sub1_Sub10_1 != null) {
				if (this.aClass93_Sub1_Sub10_1.method21790(this.anInt73 * -278335347, -1219397272)) {
					this.anInt71 = (this.anInt71 * 2023242135 | 0x80) * -1408379353;
				}
				if (this.aClass93_Sub1_Sub10_1.method21789(this.anInt73 * -278335347, -1136335801)) {
					this.anInt71 = (this.anInt71 * 2023242135 | 0x100) * -1408379353;
				}
				if (this.aClass93_Sub1_Sub10_1.method21787(this.anInt73 * -278335347, -675076851)) {
					this.anInt71 = (this.anInt71 * 2023242135 | 0x400) * -1408379353;
				}
			}
			this.anInt71 = (this.anInt71 * 2023242135 | 0x20) * -1408379353;
			this.aBoolean11 = true;
			return true;
		}
	}

	@OriginalMember(owner = "client!aau", name = "f", descriptor = "()V")
	void method499() {
		this.aBoolean11 = false;
		this.anInt71 = 0;
		this.aClass93_Sub1_Sub10_1 = null;
		this.aClass93_Sub1_Sub10_2 = null;
	}

	@OriginalMember(owner = "client!aau", name = "w", descriptor = "()V")
	void method500() {
		this.aBoolean11 = false;
		this.anInt71 = 0;
		this.aClass93_Sub1_Sub10_1 = null;
		this.aClass93_Sub1_Sub10_2 = null;
	}
}
