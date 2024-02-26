package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!yq")
public final class Class691 {

	@OriginalMember(owner = "client!yq", name = "jb", descriptor = "I")
	static int anInt5781;

	@OriginalMember(owner = "client!yq", name = "t", descriptor = "Lclient!hx;")
	Class327 aClass327_14;

	@OriginalMember(owner = "client!yq", name = "f", descriptor = "Lclient!he;")
	Class310 aClass310_4;

	@OriginalMember(owner = "client!yq", name = "ev", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;I)V")
	static void method36970(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) int arg3) {
		arg0.aBoolean809 = false;
		Class296.method26998(arg0, -126971371);
	}

	@OriginalMember(owner = "client!yq", name = "f", descriptor = "(I)I")
	public static int method36971(@OriginalArg(0) int arg0) {
		Class354.method28073(1824898204);
		return Class355.aClass145_5.anInt1410 * 85122777;
	}

	@OriginalMember(owner = "client!yq", name = "<init>", descriptor = "()V")
	Class691() {
	}

	@OriginalMember(owner = "client!yq", name = "j", descriptor = "()V")
	void method36960() {
		this.aClass310_4 = null;
		this.aClass327_14 = null;
	}

	@OriginalMember(owner = "client!yq", name = "t", descriptor = "(B)Lclient!hx;")
	Class327 method36961(@OriginalArg(0) byte arg0) {
		return this.aClass310_4.method27456(this.aClass327_14.anInt4087 * -2053489901, 2036747717);
	}

	@OriginalMember(owner = "client!yq", name = "i", descriptor = "(II)Z")
	boolean method36962(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class327 local4 = Class369.method28340(arg0, arg1, 1111784834);
		if (local4 == null) {
			this.method36963(1641756950);
			return false;
		} else {
			this.aClass310_4 = Class709.aClass310Array1[arg0 >> 16];
			this.aClass327_14 = local4;
			return true;
		}
	}

	@OriginalMember(owner = "client!yq", name = "e", descriptor = "(I)V")
	void method36963(@OriginalArg(0) int arg0) {
		this.aClass310_4 = null;
		this.aClass327_14 = null;
	}

	@OriginalMember(owner = "client!yq", name = "u", descriptor = "()Lclient!hx;")
	Class327 method36964() {
		return this.aClass310_4.method27456(this.aClass327_14.anInt4087 * -2053489901, 2036747717);
	}

	@OriginalMember(owner = "client!yq", name = "l", descriptor = "()Lclient!hx;")
	Class327 method36965() {
		return this.aClass310_4.method27456(this.aClass327_14.anInt4087 * -2053489901, 2036747717);
	}

	@OriginalMember(owner = "client!yq", name = "g", descriptor = "()Lclient!hx;")
	Class327 method36966() {
		return this.aClass310_4.method27456(this.aClass327_14.anInt4087 * -2053489901, 2036747717);
	}

	@OriginalMember(owner = "client!yq", name = "f", descriptor = "(III)Z")
	boolean method36967(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class327 local4 = Class369.method28340(arg0, arg1, 1426411801);
		if (local4 == null) {
			this.method36963(1641756950);
			return false;
		} else {
			this.aClass310_4 = Class709.aClass310Array1[arg0 >> 16];
			this.aClass327_14 = local4;
			return true;
		}
	}

	@OriginalMember(owner = "client!yq", name = "o", descriptor = "()V")
	void method36968() {
		this.aClass310_4 = null;
		this.aClass327_14 = null;
	}

	@OriginalMember(owner = "client!yq", name = "m", descriptor = "()V")
	void method36969() {
		this.aClass310_4 = null;
		this.aClass327_14 = null;
	}
}
