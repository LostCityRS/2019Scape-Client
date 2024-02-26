package com.jagex;

import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!adl")
public final class Class83 {

	@OriginalMember(owner = "client!adl", name = "gz", descriptor = "Lclient!pf;")
	public static Class480 aClass480_12;

	@OriginalMember(owner = "client!adl", name = "t", descriptor = "Ljava/util/zip/Inflater;")
	Inflater anInflater1;

	@OriginalMember(owner = "client!adl", name = "bfe", descriptor = "(Lclient!yp;I)V")
	static void method1566(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
	}

	@OriginalMember(owner = "client!adl", name = "<init>", descriptor = "(III)V")
	Class83(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!adl", name = "<init>", descriptor = "()V")
	public Class83() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!adl", name = "e", descriptor = "([B)[B")
	public byte[] method1560(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class80_Sub36 local4 = new Class80_Sub36(arg0);
		local4.anInt3152 = (arg0.length - 4) * 1034180571;
		@Pc(16) int local16 = local4.method23183(581931609);
		@Pc(19) byte[] local19 = new byte[local16];
		local4.anInt3152 = 0;
		this.method1562(local4, local19, 1429363153);
		return local19;
	}

	@OriginalMember(owner = "client!adl", name = "t", descriptor = "([BI)[B")
	public byte[] method1561(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class80_Sub36 local4 = new Class80_Sub36(arg0);
		local4.anInt3152 = (arg0.length - 4) * 1034180571;
		@Pc(16) int local16 = local4.method23183(1865886848);
		@Pc(19) byte[] local19 = new byte[local16];
		local4.anInt3152 = 0;
		this.method1562(local4, local19, -1979372574);
		return local19;
	}

	@OriginalMember(owner = "client!adl", name = "f", descriptor = "(Lclient!ald;[BI)V")
	public void method1562(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		if (arg0.aByteArray61[arg0.anInt3152 * -1380987821] != 31 || arg0.aByteArray61[arg0.anInt3152 * -1380987821 + 1] != -117) {
			throw new RuntimeException("");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray61, arg0.anInt3152 * -1380987821 + 10, arg0.aByteArray61.length - (arg0.anInt3152 * -1380987821 + 8 + 10));
			this.anInflater1.inflate(arg1);
		} catch (@Pc(63) Exception local63) {
			this.anInflater1.reset();
			throw new RuntimeException("");
		}
		this.anInflater1.reset();
	}

	@OriginalMember(owner = "client!adl", name = "u", descriptor = "([B)[B")
	public byte[] method1563(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class80_Sub36 local4 = new Class80_Sub36(arg0);
		local4.anInt3152 = (arg0.length - 4) * 1034180571;
		@Pc(16) int local16 = local4.method23183(-102107891);
		@Pc(19) byte[] local19 = new byte[local16];
		local4.anInt3152 = 0;
		this.method1562(local4, local19, 759292457);
		return local19;
	}

	@OriginalMember(owner = "client!adl", name = "l", descriptor = "([B)[B")
	public byte[] method1564(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class80_Sub36 local4 = new Class80_Sub36(arg0);
		local4.anInt3152 = (arg0.length - 4) * 1034180571;
		@Pc(16) int local16 = local4.method23183(208663109);
		@Pc(19) byte[] local19 = new byte[local16];
		local4.anInt3152 = 0;
		this.method1562(local4, local19, 493898588);
		return local19;
	}

	@OriginalMember(owner = "client!adl", name = "g", descriptor = "(Lclient!ald;[B)V")
	public void method1565(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) byte[] arg1) {
		if (arg0.aByteArray61[arg0.anInt3152 * -1380987821] != 31 || arg0.aByteArray61[arg0.anInt3152 * -1380987821 + 1] != -117) {
			throw new RuntimeException("");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray61, arg0.anInt3152 * -1380987821 + 10, arg0.aByteArray61.length - (arg0.anInt3152 * -1380987821 + 8 + 10));
			this.anInflater1.inflate(arg1);
		} catch (@Pc(63) Exception local63) {
			this.anInflater1.reset();
			throw new RuntimeException("");
		}
		this.anInflater1.reset();
	}
}
