package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aqv")
public abstract class Class80_Sub13_Sub1 extends Class80_Sub13 {

	@OriginalMember(owner = "client!aqv", name = "g", descriptor = "Lclient!hl;")
	Class317 aClass317_6;

	@OriginalMember(owner = "client!aqv", name = "i", descriptor = "Ljava/lang/String;")
	String aString122;

	@OriginalMember(owner = "client!aqv", name = "m", descriptor = "Ljava/lang/String;")
	String aString121;

	@OriginalMember(owner = "client!aqv", name = "o", descriptor = "I")
	int anInt3259;

	@OriginalMember(owner = "client!aqv", name = "j", descriptor = "Lclient!hl;")
	Class317 aClass317_5;

	@OriginalMember(owner = "client!aqv", name = "<init>", descriptor = "(Lclient!hi;)V")
	Class80_Sub13_Sub1(@OriginalArg(0) Class314 arg0) {
		this.aClass317_6 = arg0.aClass317_7;
		this.aString122 = arg0.aString173;
		this.aString121 = arg0.aString174;
		this.anInt3259 = arg0.anInt4020 * 543032981;
		this.aClass317_5 = arg0.aClass317_8;
	}

	@OriginalMember(owner = "client!aqv", name = "a", descriptor = "()Lclient!hl;")
	public final Class317 method23986() {
		return this.aClass317_5;
	}

	@OriginalMember(owner = "client!aqv", name = "o", descriptor = "()Ljava/lang/String;")
	final String method23987() {
		return this.aString122;
	}

	@OriginalMember(owner = "client!aqv", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public final String toString() {
		@Pc(13) String local13 = this.aClass317_6.toString() + " " + this.aString122;
		if (this.aString121 != null && !"".equals(this.aString121)) {
			local13 = local13 + " : " + this.aString121;
		}
		return local13;
	}

	@OriginalMember(owner = "client!aqv", name = "f", descriptor = "(B)Ljava/lang/String;")
	final String method23988(@OriginalArg(0) byte arg0) {
		return this.aString122;
	}

	@OriginalMember(owner = "client!aqv", name = "e", descriptor = "(I)Lclient!hl;")
	public final Class317 method23989(@OriginalArg(0) int arg0) {
		return this.aClass317_6;
	}

	@OriginalMember(owner = "client!aqv", name = "j", descriptor = "()Lclient!hl;")
	public final Class317 method23990() {
		return this.aClass317_5;
	}

	@OriginalMember(owner = "client!aqv", name = "l", descriptor = "(I)I")
	public final int method23991(@OriginalArg(0) int arg0) {
		if (Class317.aClass317_10 != this.aClass317_6) {
			throw new IllegalArgumentException_Sub1(this, this.aClass317_6.toString().toLowerCase());
		}
		return this.anInt3259 * 281139669;
	}

	@OriginalMember(owner = "client!aqv", name = "t", descriptor = "(I)Z")
	public abstract boolean method23992(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!aqv", name = "i", descriptor = "(I)Z")
	public abstract boolean method23993(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!aqv", name = "rx", descriptor = "()Ljava/lang/String;")
	public final String method23994() {
		@Pc(13) String local13 = this.aClass317_6.toString() + " " + this.aString122;
		if (this.aString121 != null && !"".equals(this.aString121)) {
			local13 = local13 + " : " + this.aString121;
		}
		return local13;
	}

	@OriginalMember(owner = "client!aqv", name = "ri", descriptor = "()Ljava/lang/String;")
	public final String method23995() {
		@Pc(13) String local13 = this.aClass317_6.toString() + " " + this.aString122;
		if (this.aString121 != null && !"".equals(this.aString121)) {
			local13 = local13 + " : " + this.aString121;
		}
		return local13;
	}

	@OriginalMember(owner = "client!aqv", name = "u", descriptor = "(I)Lclient!hl;")
	public final Class317 method23996(@OriginalArg(0) int arg0) {
		return this.aClass317_5;
	}

	@OriginalMember(owner = "client!aqv", name = "g", descriptor = "(I)I")
	public abstract int method23997(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!aqv", name = "m", descriptor = "()Ljava/lang/String;")
	final String method23998() {
		return this.aString122;
	}

	@OriginalMember(owner = "client!aqv", name = "s", descriptor = "()Lclient!hl;")
	public final Class317 method23999() {
		return this.aClass317_5;
	}

	@OriginalMember(owner = "client!aqv", name = "x", descriptor = "()Lclient!hl;")
	public final Class317 method24000() {
		return this.aClass317_5;
	}

	@OriginalMember(owner = "client!aqv", name = "z", descriptor = "()I")
	public final int method24001() {
		if (Class317.aClass317_10 != this.aClass317_6) {
			throw new IllegalArgumentException_Sub1(this, this.aClass317_6.toString().toLowerCase());
		}
		return this.anInt3259 * 281139669;
	}

	@OriginalMember(owner = "client!aqv", name = "p", descriptor = "()I")
	public final int method24002() {
		if (Class317.aClass317_10 != this.aClass317_6) {
			throw new IllegalArgumentException_Sub1(this, this.aClass317_6.toString().toLowerCase());
		}
		return this.anInt3259 * 281139669;
	}

	@OriginalMember(owner = "client!aqv", name = "v", descriptor = "(I)I")
	public abstract int method24003(@OriginalArg(0) int arg0);
}
