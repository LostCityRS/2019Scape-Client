package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ara")
public final class Class80_Sub1_Sub4 extends Class80_Sub1 {

	@OriginalMember(owner = "client!ara", name = "o", descriptor = "I")
	int anInt3022;

	@OriginalMember(owner = "client!ara", name = "i", descriptor = "Ljava/lang/String;")
	final String aString95;

	@OriginalMember(owner = "client!ara", name = "m", descriptor = "Lclient!aaa;")
	final Class3 aClass3_10;

	@OriginalMember(owner = "client!ara", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	Class80_Sub1_Sub4(@OriginalArg(0) String arg0) {
		this.aString95 = arg0;
		this.aClass3_10 = new Class3();
	}

	@OriginalMember(owner = "client!ara", name = "g", descriptor = "()I")
	int method21705() {
		return this.aClass3_10.aClass80_Sub1_2 == this.aClass3_10.aClass80_Sub1_2.aClass80_Sub1_68 ? -1 : ((Class80_Sub1_Sub11) this.aClass3_10.aClass80_Sub1_2.aClass80_Sub1_68).anInt3079 * 1479399259;
	}

	@OriginalMember(owner = "client!ara", name = "f", descriptor = "(Lclient!arz;I)Z")
	boolean method21706(@OriginalArg(0) Class80_Sub1_Sub11 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) boolean local1 = true;
		arg0.method24406(-2147483643);
		@Pc(10) Class80_Sub1_Sub11 local10 = (Class80_Sub1_Sub11) this.aClass3_10.method50((byte) -40);
		while (local10 != null) {
			if (Class690.method36959(arg0.anInt3079 * 1479399259, local10.anInt3079 * 1479399259, -1865515917)) {
				Class331.method27786(arg0, local10, (byte) -95);
				this.anInt3022 += -1676985911;
				return !local1;
			}
			local10 = (Class80_Sub1_Sub11) this.aClass3_10.method46((byte) -102);
			local1 = false;
		}
		this.aClass3_10.method42(arg0, 1599142138);
		this.anInt3022 += -1676985911;
		return local1;
	}

	@OriginalMember(owner = "client!ara", name = "m", descriptor = "(Lclient!arz;)Z")
	boolean method21707(@OriginalArg(0) Class80_Sub1_Sub11 arg0) {
		@Pc(1) boolean local1 = true;
		arg0.method24406(-2147483647);
		@Pc(10) Class80_Sub1_Sub11 local10 = (Class80_Sub1_Sub11) this.aClass3_10.method50((byte) 5);
		while (local10 != null) {
			if (Class690.method36959(arg0.anInt3079 * 1479399259, local10.anInt3079 * 1479399259, -805965280)) {
				Class331.method27786(arg0, local10, (byte) -55);
				this.anInt3022 += -1676985911;
				return !local1;
			}
			local10 = (Class80_Sub1_Sub11) this.aClass3_10.method46((byte) -102);
			local1 = false;
		}
		this.aClass3_10.method42(arg0, 1599142138);
		this.anInt3022 += -1676985911;
		return local1;
	}

	@OriginalMember(owner = "client!ara", name = "u", descriptor = "()I")
	int method21708() {
		return this.aClass3_10.aClass80_Sub1_2 == this.aClass3_10.aClass80_Sub1_2.aClass80_Sub1_68 ? -1 : ((Class80_Sub1_Sub11) this.aClass3_10.aClass80_Sub1_2.aClass80_Sub1_68).anInt3079 * 1479399259;
	}

	@OriginalMember(owner = "client!ara", name = "e", descriptor = "(Lclient!arz;I)Z")
	boolean method21709(@OriginalArg(0) Class80_Sub1_Sub11 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = this.method21711((byte) 108);
		arg0.method24406(-2147483641);
		this.anInt3022 -= -1676985911;
		if (this.anInt3022 * 855388281 != 0) {
			return local3 != this.method21711((byte) 41);
		}
		this.method24395((byte) 119);
		this.method24406(-2147483643);
		Class630.anInt5554 -= -561979003;
		Class630.aClass243_89.method26253(this, arg0.aLong249 * -6321316696381466459L);
		return false;
	}

	@OriginalMember(owner = "client!ara", name = "l", descriptor = "()I")
	int method21710() {
		return this.aClass3_10.aClass80_Sub1_2 == this.aClass3_10.aClass80_Sub1_2.aClass80_Sub1_68 ? -1 : ((Class80_Sub1_Sub11) this.aClass3_10.aClass80_Sub1_2.aClass80_Sub1_68).anInt3079 * 1479399259;
	}

	@OriginalMember(owner = "client!ara", name = "t", descriptor = "(B)I")
	int method21711(@OriginalArg(0) byte arg0) {
		return this.aClass3_10.aClass80_Sub1_2 == this.aClass3_10.aClass80_Sub1_2.aClass80_Sub1_68 ? -1 : ((Class80_Sub1_Sub11) this.aClass3_10.aClass80_Sub1_2.aClass80_Sub1_68).anInt3079 * 1479399259;
	}

	@OriginalMember(owner = "client!ara", name = "i", descriptor = "(Lclient!arz;)Z")
	boolean method21712(@OriginalArg(0) Class80_Sub1_Sub11 arg0) {
		@Pc(1) boolean local1 = true;
		arg0.method24406(-2147483642);
		@Pc(10) Class80_Sub1_Sub11 local10 = (Class80_Sub1_Sub11) this.aClass3_10.method50((byte) 64);
		while (local10 != null) {
			if (Class690.method36959(arg0.anInt3079 * 1479399259, local10.anInt3079 * 1479399259, 1983232696)) {
				Class331.method27786(arg0, local10, (byte) -93);
				this.anInt3022 += -1676985911;
				return !local1;
			}
			local10 = (Class80_Sub1_Sub11) this.aClass3_10.method46((byte) -102);
			local1 = false;
		}
		this.aClass3_10.method42(arg0, 1599142138);
		this.anInt3022 += -1676985911;
		return local1;
	}

	@OriginalMember(owner = "client!ara", name = "o", descriptor = "(Lclient!arz;)Z")
	boolean method21713(@OriginalArg(0) Class80_Sub1_Sub11 arg0) {
		@Pc(3) int local3 = this.method21711((byte) 125);
		arg0.method24406(-2147483643);
		this.anInt3022 -= -1676985911;
		if (this.anInt3022 * 855388281 != 0) {
			return local3 != this.method21711((byte) 97);
		}
		this.method24395((byte) 62);
		this.method24406(-2147483646);
		Class630.anInt5554 -= -561979003;
		Class630.aClass243_89.method26253(this, arg0.aLong249 * -6321316696381466459L);
		return false;
	}

	@OriginalMember(owner = "client!ara", name = "j", descriptor = "(Lclient!arz;)Z")
	boolean method21714(@OriginalArg(0) Class80_Sub1_Sub11 arg0) {
		@Pc(3) int local3 = this.method21711((byte) 23);
		arg0.method24406(-2147483645);
		this.anInt3022 -= -1676985911;
		if (this.anInt3022 * 855388281 != 0) {
			return local3 != this.method21711((byte) 16);
		}
		this.method24395((byte) 64);
		this.method24406(-2147483645);
		Class630.anInt5554 -= -561979003;
		Class630.aClass243_89.method26253(this, arg0.aLong249 * -6321316696381466459L);
		return false;
	}

	@OriginalMember(owner = "client!ara", name = "a", descriptor = "(Lclient!arz;)Z")
	boolean method21715(@OriginalArg(0) Class80_Sub1_Sub11 arg0) {
		@Pc(3) int local3 = this.method21711((byte) 78);
		arg0.method24406(-2147483640);
		this.anInt3022 -= -1676985911;
		if (this.anInt3022 * 855388281 != 0) {
			return local3 != this.method21711((byte) 33);
		}
		this.method24395((byte) 106);
		this.method24406(-2147483642);
		Class630.anInt5554 -= -561979003;
		Class630.aClass243_89.method26253(this, arg0.aLong249 * -6321316696381466459L);
		return false;
	}
}
