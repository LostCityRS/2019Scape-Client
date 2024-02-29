package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!arn")
public class Class93_Sub1_Sub8 extends Class93_Sub1 {

	@OriginalMember(owner = "client!arn", name = "z", descriptor = "I")
	int anInt3013;

	@OriginalMember(owner = "client!arn", name = "l", descriptor = "Ljava/lang/String;")
	final String aString101;

	@OriginalMember(owner = "client!arn", name = "u", descriptor = "Lclient!aap;")
	final Class18 aClass18_10;

	@OriginalMember(owner = "client!arn", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 1962)
	Class93_Sub1_Sub8(@OriginalArg(0) String arg0) {
		this.aString101 = arg0;
		this.aClass18_10 = new Class18();
	}

	@OriginalMember(owner = "client!arn", name = "k", descriptor = "()I", line = 1968)
	int method21715() {
		return this.aClass18_10.aClass93_Sub1_4 == this.aClass18_10.aClass93_Sub1_4.aClass93_Sub1_68 ? -1 : ((Class93_Sub1_Sub7) this.aClass18_10.aClass93_Sub1_4.aClass93_Sub1_68).anInt3012 * -92627949;
	}

	@OriginalMember(owner = "client!arn", name = "e", descriptor = "(I)I", line = 1968)
	int method21716(@OriginalArg(0) int arg0) {
		return this.aClass18_10.aClass93_Sub1_4 == this.aClass18_10.aClass93_Sub1_4.aClass93_Sub1_68 ? -1 : ((Class93_Sub1_Sub7) this.aClass18_10.aClass93_Sub1_4.aClass93_Sub1_68).anInt3012 * -92627949;
	}

	@OriginalMember(owner = "client!arn", name = "w", descriptor = "()I", line = 1968)
	int method21717() {
		return this.aClass18_10.aClass93_Sub1_4 == this.aClass18_10.aClass93_Sub1_4.aClass93_Sub1_68 ? -1 : ((Class93_Sub1_Sub7) this.aClass18_10.aClass93_Sub1_4.aClass93_Sub1_68).anInt3012 * -92627949;
	}

	@OriginalMember(owner = "client!arn", name = "f", descriptor = "()I", line = 1968)
	int method21718() {
		return this.aClass18_10.aClass93_Sub1_4 == this.aClass18_10.aClass93_Sub1_4.aClass93_Sub1_68 ? -1 : ((Class93_Sub1_Sub7) this.aClass18_10.aClass93_Sub1_4.aClass93_Sub1_68).anInt3012 * -92627949;
	}

	@OriginalMember(owner = "client!arn", name = "l", descriptor = "(Lclient!arm;)Z", line = 1973)
	boolean method21719(@OriginalArg(0) Class93_Sub1_Sub7 arg0) {
		@Pc(1) boolean local1 = true;
		arg0.method23976((short) 5146);
		@Pc(10) Class93_Sub1_Sub7 local10 = (Class93_Sub1_Sub7) this.aClass18_10.method256(-1771149327);
		while (local10 != null) {
			if (Class19_Sub3.method17555(arg0.anInt3012 * -92627949, local10.anInt3012 * -92627949, 1385938362)) {
				Class615.method32073(arg0, local10, -1869149186);
				this.anInt3013 += -280530287;
				return !local1;
			}
			local10 = (Class93_Sub1_Sub7) this.aClass18_10.method264(765782647);
			local1 = false;
		}
		this.aClass18_10.method250(arg0, 1675024292);
		this.anInt3013 += -280530287;
		return local1;
	}

	@OriginalMember(owner = "client!arn", name = "n", descriptor = "(Lclient!arm;I)Z", line = 1973)
	boolean method21720(@OriginalArg(0) Class93_Sub1_Sub7 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) boolean local1 = true;
		arg0.method23976((short) -3927);
		@Pc(10) Class93_Sub1_Sub7 local10 = (Class93_Sub1_Sub7) this.aClass18_10.method256(1597596279);
		while (local10 != null) {
			if (Class19_Sub3.method17555(arg0.anInt3012 * -92627949, local10.anInt3012 * -92627949, 1385938362)) {
				Class615.method32073(arg0, local10, -2032140513);
				this.anInt3013 += -280530287;
				return !local1;
			}
			local10 = (Class93_Sub1_Sub7) this.aClass18_10.method264(-313381855);
			local1 = false;
		}
		this.aClass18_10.method250(arg0, 1986683831);
		this.anInt3013 += -280530287;
		return local1;
	}

	@OriginalMember(owner = "client!arn", name = "m", descriptor = "(Lclient!arm;S)Z", line = 1988)
	boolean method21721(@OriginalArg(0) Class93_Sub1_Sub7 arg0, @OriginalArg(1) short arg1) {
		@Pc(3) int local3 = this.method21716(2057192320);
		arg0.method23976((short) 21114);
		this.anInt3013 -= -280530287;
		if (this.anInt3013 * -2109043087 != 0) {
			return local3 != this.method21716(-2315352);
		}
		this.method23969(-2099318946);
		this.method23976((short) -10176);
		Class454.anInt5039 -= 1842152815;
		Class454.aClass240_85.method25838(this, arg0.aLong155 * 7070093341456026777L);
		return false;
	}

	@OriginalMember(owner = "client!arn", name = "u", descriptor = "(Lclient!arm;)Z", line = 1988)
	boolean method21722(@OriginalArg(0) Class93_Sub1_Sub7 arg0) {
		@Pc(3) int local3 = this.method21716(1246044113);
		arg0.method23976((short) -4317);
		this.anInt3013 -= -280530287;
		if (this.anInt3013 * -2109043087 != 0) {
			return local3 != this.method21716(712876979);
		}
		this.method23969(998860844);
		this.method23976((short) 12981);
		Class454.anInt5039 -= 1842152815;
		Class454.aClass240_85.method25838(this, arg0.aLong155 * 7070093341456026777L);
		return false;
	}
}
