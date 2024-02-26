package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sk")
public final class Class552 {

	@OriginalMember(owner = "client!sk", name = "e", descriptor = "I")
	int anInt5175;

	@OriginalMember(owner = "client!sk", name = "f", descriptor = "I")
	int anInt5176;

	@OriginalMember(owner = "client!sk", name = "u", descriptor = "I")
	int anInt5177;

	@OriginalMember(owner = "client!sk", name = "t", descriptor = "[Lclient!sy;")
	Class564[] aClass564Array1;

	// $FF: synthetic field
	@OriginalMember(owner = "client!sk", name = "this$0", descriptor = "Lclient!st;")
	final Class560 aClass560_1;

	@OriginalMember(owner = "client!sk", name = "ke", descriptor = "(Lclient!yp;I)V")
	static void method31353(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2090991753);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class558.method31400(local16, local22, arg0, (byte) 0);
	}

	@OriginalMember(owner = "client!sk", name = "fc", descriptor = "(ILjava/lang/String;ZB)V")
	static void method31354(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) byte arg3) {
		Class571.method31734(-1940120537);
		Class230.method26005(-672164049);
		Class78.method1375(1856545868);
		Class430.method29085(arg0, arg1, arg2, (byte) 0);
		Class317.aClass464_1.method29590(-948625048);
		Class317.aClass464_1.method29589(client.anInterface49_1, 442406258);
		Class317.aClass464_1.method29596(-1742510579);
		Class440.method29165(Class279.aClass102_9, -148161080);
		Class430.method29086(Class279.aClass102_9, Class708.aClass480_136, 436181573);
		Class1.method21(373260280);
		Class138_Sub1.method10718((byte) 62);
		Class522.method30640(-630154288);
		if (client.anInt3433 * 1994758437 == 4) {
			Class604.method32148(10, -72266479);
		} else if (client.anInt3433 * 1994758437 == 13) {
			Class604.method32148(6, -668341253);
		} else if (client.anInt3433 * 1994758437 == 15) {
			Class604.method32148(16, -1765521585);
		} else if (client.anInt3433 * 1994758437 == 18) {
			Class604.method32148(3, 789393962);
		} else if (client.anInt3433 * 1994758437 == 11 || client.anInt3433 * 1994758437 == 1) {
			Class503.method30447((byte) 47);
		} else if (client.anInt3433 * 1994758437 == 0) {
			Class604.method32148(8, -178254062);
		} else if (client.anInt3433 * 1994758437 == 3) {
			Class236.method26135(false, (short) 778);
		}
	}

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Lclient!st;)V")
	Class552(@OriginalArg(0) Class560 arg0) {
		this.aClass560_1 = arg0;
	}

	@OriginalMember(owner = "client!sk", name = "u", descriptor = "()V")
	void method31348() {
		@Pc(11) int local11 = 0x1 << this.anInt5176 * 2094704535 + this.anInt5175 * -210883481;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			this.aClass564Array1[local13].method31471(-1867895641);
		}
	}

	@OriginalMember(owner = "client!sk", name = "t", descriptor = "(III)V")
	void method31349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass564Array1 != null && arg1 == this.anInt5176 * 2094704535 && this.anInt5175 * -210883481 == arg0) {
			return;
		}
		this.anInt5175 = arg0 * -128438441;
		this.anInt5177 = ((0x1 << arg0) - 1) * 1588807999;
		this.anInt5176 = arg1 * -1029552089;
		@Pc(47) int local47 = 0x1 << this.anInt5176 * 2094704535 + this.anInt5175 * -210883481;
		this.aClass564Array1 = new Class564[local47];
		for (@Pc(53) int local53 = 0; local53 < local47; local53++) {
			this.aClass564Array1[local53] = new Class564(this);
		}
	}

	@OriginalMember(owner = "client!sk", name = "f", descriptor = "(I)V")
	void method31350(@OriginalArg(0) int arg0) {
		@Pc(11) int local11 = 0x1 << this.anInt5176 * 2094704535 + this.anInt5175 * -210883481;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			this.aClass564Array1[local13].method31471(-26531464);
		}
	}

	@OriginalMember(owner = "client!sk", name = "e", descriptor = "(IBS)Lclient!sy;")
	Class564 method31351(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) short arg2) {
		return this.aClass564Array1[((arg0 & this.anInt5177 * -1738332481) << this.anInt5176 * 2094704535) + ((arg1 & 0xFF) >>> 8 - this.anInt5176 * 2094704535)];
	}

	@OriginalMember(owner = "client!sk", name = "l", descriptor = "(IB)Lclient!sy;")
	Class564 method31352(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return this.aClass564Array1[((arg0 & this.anInt5177 * -1738332481) << this.anInt5176 * 2094704535) + ((arg1 & 0xFF) >>> 8 - this.anInt5176 * 2094704535)];
	}
}
