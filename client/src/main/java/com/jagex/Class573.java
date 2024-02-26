package com.jagex;

import java.util.Stack;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tj")
public final class Class573 {

	@OriginalMember(owner = "client!tj", name = "t", descriptor = "Ljava/util/Stack;")
	static Stack aStack1 = new Stack();

	@OriginalMember(owner = "client!tj", name = "u", descriptor = "Lclient!tt;")
	Class582 aClass582_2;

	@OriginalMember(owner = "client!tj", name = "e", descriptor = "Z")
	boolean aBoolean919;

	@OriginalMember(owner = "client!tj", name = "f", descriptor = "Lclient!alf;")
	public Class120_Sub1 aClass120_Sub1_25;

	@OriginalMember(owner = "client!tj", name = "g", descriptor = "(Z)Lclient!tj;")
	public static Class573 method31740(@OriginalArg(0) boolean arg0) {
		@Pc(2) Stack local2 = aStack1;
		synchronized (aStack1) {
			@Pc(10) Class573 local10;
			if (aStack1.isEmpty()) {
				local10 = new Class573();
			} else {
				local10 = (Class573) aStack1.pop();
			}
			local10.aBoolean919 = arg0;
			return local10;
		}
	}

	@OriginalMember(owner = "client!tj", name = "l", descriptor = "(Z)Lclient!tj;")
	public static Class573 method31742(@OriginalArg(0) boolean arg0) {
		@Pc(2) Stack local2 = aStack1;
		synchronized (aStack1) {
			@Pc(10) Class573 local10;
			if (aStack1.isEmpty()) {
				local10 = new Class573();
			} else {
				local10 = (Class573) aStack1.pop();
			}
			local10.aBoolean919 = arg0;
			return local10;
		}
	}

	@OriginalMember(owner = "client!tj", name = "i", descriptor = "(Lclient!tj;)V")
	static void method31743(@OriginalArg(0) Class573 arg0) {
		arg0.aClass120_Sub1_25 = null;
		@Pc(5) Stack local5 = aStack1;
		synchronized (aStack1) {
			if (aStack1.size() < 200) {
				aStack1.push(arg0);
			}
		}
	}

	@OriginalMember(owner = "client!tj", name = "m", descriptor = "()V")
	public static void method31744() {
		@Pc(2) Stack local2 = aStack1;
		synchronized (aStack1) {
			aStack1 = new Stack();
		}
	}

	@OriginalMember(owner = "client!tj", name = "o", descriptor = "()V")
	public static void method31745() {
		@Pc(2) Stack local2 = aStack1;
		synchronized (aStack1) {
			aStack1 = new Stack();
		}
	}

	@OriginalMember(owner = "client!tj", name = "g", descriptor = "(I)Lclient!aly;")
	public static Class163_Sub1 method31747(@OriginalArg(0) int arg0) {
		Class47.anInt180 = 0;
		return Class549.method31315(647534603);
	}

	@OriginalMember(owner = "client!tj", name = "<init>", descriptor = "()V")
	Class573() {
	}

	@OriginalMember(owner = "client!tj", name = "u", descriptor = "(Lclient!di;IIB)Z")
	public boolean method31741(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(4) int local4 = this.aClass120_Sub1_25.method24613(1842761346);
		if (this.aClass120_Sub1_25.aClass246Array21 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.aClass120_Sub1_25.aClass246Array21.length; local10++) {
				this.aClass120_Sub1_25.aClass246Array21[local10].anInt3868 <<= local4;
				if (this.aClass120_Sub1_25.aClass246Array21[local10].method26324(this.aClass582_2.anInt5301 * 1497169793 + arg1, arg2 + this.aClass582_2.anInt5302 * -400288749) && this.aClass120_Sub1_25.method24583(arg0, arg1, arg2, -1859358033)) {
					this.aClass120_Sub1_25.aClass246Array21[local10].anInt3868 >>= local4;
					return true;
				}
				this.aClass120_Sub1_25.aClass246Array21[local10].anInt3868 >>= local4;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!tj", name = "j", descriptor = "(Lclient!di;II)Z")
	public boolean method31746(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = this.aClass120_Sub1_25.method24613(1987181493);
		if (this.aClass120_Sub1_25.aClass246Array21 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.aClass120_Sub1_25.aClass246Array21.length; local10++) {
				this.aClass120_Sub1_25.aClass246Array21[local10].anInt3868 <<= local4;
				if (this.aClass120_Sub1_25.aClass246Array21[local10].method26324(this.aClass582_2.anInt5301 * 1497169793 + arg1, arg2 + this.aClass582_2.anInt5302 * -400288749) && this.aClass120_Sub1_25.method24583(arg0, arg1, arg2, -1691230408)) {
					this.aClass120_Sub1_25.aClass246Array21[local10].anInt3868 >>= local4;
					return true;
				}
				this.aClass120_Sub1_25.aClass246Array21[local10].anInt3868 >>= local4;
			}
		}
		return false;
	}
}
