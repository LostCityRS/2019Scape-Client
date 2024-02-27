package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.util.ArrayList;
import java.util.List;

@OriginalClass("client!fd")
public final class Class260 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!fd", name = "this$0", descriptor = "Lclient!fg;")
	final Class263 aClass263_4;

	@OriginalMember(owner = "client!fd", name = "t", descriptor = "Ljava/util/List;")
	List aList5;

	@OriginalMember(owner = "client!fd", name = "bw", descriptor = "(Lclient!yp;B)V")
	static void method26468(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		if (Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aClass672_1 != null) {
			Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aClass672_1.method33537(local13, local23, (byte) 121);
		}
	}

	@OriginalMember(owner = "client!fd", name = "gr", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;I)V")
	static void method26469(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) int arg3) {
		arg0.aBoolean819 = arg2.anIntArray525[(arg2.anInt5778 -= 2036747717) * 1896589581] == 1;
		Class296.method26998(arg0, 183725928);
	}

	@OriginalMember(owner = "client!fd", name = "anp", descriptor = "(Lclient!yp;I)V")
	static void method26470(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) throws Exception_Sub3 {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(21) Class463 local21 = Class463.method29541((float) local13, (float) local13, (float) local13);
		BufferedSocket.aClass121_Sub1_2.method9588(local21, (short) 255);
		local21.method29557();
	}

	@OriginalMember(owner = "client!fd", name = "bcq", descriptor = "(Lclient!yp;I)V")
	static void method26471(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		arg0.anInt5776 -= -1650379242;
		@Pc(27) String local27 = (String) arg0.anObjectArray46[arg0.anInt5776 * -2070619997];
		@Pc(38) String local38 = (String) arg0.anObjectArray46[arg0.anInt5776 * -2070619997 + 1];
		if (local27.length() <= 500 && local38.length() <= 500) {
			Class679.method33622(local12, local27, local38, (byte) -3);
		}
	}

	@OriginalMember(owner = "client!fd", name = "arl", descriptor = "(Lclient!yp;I)V")
	static void method26472(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = client.anInt3428 * 805324377;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = client.anInt3427 * 1329290145;
	}

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Lclient!fg;)V")
	Class260(@OriginalArg(0) Class263 arg0) {
		this.aClass263_4 = arg0;
		this.aList5 = new ArrayList();
	}

	@OriginalMember(owner = "client!fd", name = "h", descriptor = "(Lclient!rh;)Z")
	boolean method26450(@OriginalArg(0) Class529 arg0) {
		return this.aList5.contains(arg0);
	}

	@OriginalMember(owner = "client!fd", name = "t", descriptor = "(Lclient!rh;I)V")
	void method26451(@OriginalArg(0) Class529 arg0, @OriginalArg(1) int arg1) {
		this.aList5.add(arg0);
	}

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "(Lclient!rh;I)V")
	void method26452(@OriginalArg(0) Class529 arg0, @OriginalArg(1) int arg1) {
		this.aList5.remove(arg0);
	}

	@OriginalMember(owner = "client!fd", name = "r", descriptor = "(Lclient!rh;)Z")
	boolean method26453(@OriginalArg(0) Class529 arg0) {
		return this.aList5.contains(arg0);
	}

	@OriginalMember(owner = "client!fd", name = "u", descriptor = "(Lclient!rh;B)Z")
	boolean method26454(@OriginalArg(0) Class529 arg0, @OriginalArg(1) byte arg1) {
		return this.aList5.contains(arg0);
	}

	@OriginalMember(owner = "client!fd", name = "l", descriptor = "(Lclient!rh;)V")
	void method26455(@OriginalArg(0) Class529 arg0) {
		this.aList5.add(arg0);
	}

	@OriginalMember(owner = "client!fd", name = "g", descriptor = "(Lclient!rh;)V")
	void method26456(@OriginalArg(0) Class529 arg0) {
		this.aList5.add(arg0);
	}

	@OriginalMember(owner = "client!fd", name = "s", descriptor = "()Ljava/util/List;")
	List method26457() {
		return this.aList5;
	}

	@OriginalMember(owner = "client!fd", name = "m", descriptor = "(Lclient!rh;)V")
	void method26458(@OriginalArg(0) Class529 arg0) {
		this.aList5.add(arg0);
	}

	@OriginalMember(owner = "client!fd", name = "o", descriptor = "(Lclient!rh;)V")
	void method26459(@OriginalArg(0) Class529 arg0) {
		this.aList5.remove(arg0);
	}

	@OriginalMember(owner = "client!fd", name = "j", descriptor = "(Lclient!rh;)V")
	void method26460(@OriginalArg(0) Class529 arg0) {
		this.aList5.remove(arg0);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!rh;)V")
	void method26461(@OriginalArg(0) Class529 arg0) {
		this.aList5.remove(arg0);
	}

	@OriginalMember(owner = "client!fd", name = "i", descriptor = "(Lclient!rh;)V")
	void method26462(@OriginalArg(0) Class529 arg0) {
		this.aList5.add(arg0);
	}

	@OriginalMember(owner = "client!fd", name = "k", descriptor = "()Ljava/util/List;")
	List method26463() {
		return this.aList5;
	}

	@OriginalMember(owner = "client!fd", name = "x", descriptor = "()Ljava/util/List;")
	List method26464() {
		return this.aList5;
	}

	@OriginalMember(owner = "client!fd", name = "w", descriptor = "()Ljava/util/List;")
	List method26465() {
		return this.aList5;
	}

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "(I)Ljava/util/List;")
	List method26466(@OriginalArg(0) int arg0) {
		return this.aList5;
	}

	@OriginalMember(owner = "client!fd", name = "q", descriptor = "(Lclient!rh;)Z")
	boolean method26467(@OriginalArg(0) Class529 arg0) {
		return this.aList5.contains(arg0);
	}
}
