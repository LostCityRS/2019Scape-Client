package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aql")
public abstract class Class93_Sub33_Sub1 extends Class93_Sub33 {

	@OriginalMember(owner = "client!aql", name = "w", descriptor = "Lclient!ht;")
	Class323 aClass323_5;

	@OriginalMember(owner = "client!aql", name = "l", descriptor = "Ljava/lang/String;")
	String aString122;

	@OriginalMember(owner = "client!aql", name = "u", descriptor = "Ljava/lang/String;")
	String aString121;

	@OriginalMember(owner = "client!aql", name = "z", descriptor = "I")
	int anInt3227;

	@OriginalMember(owner = "client!aql", name = "p", descriptor = "Lclient!ht;")
	Class323 aClass323_6;

	@OriginalMember(owner = "client!aql", name = "<init>", descriptor = "(Lclient!hv;)V", line = 15)
	Class93_Sub33_Sub1(@OriginalArg(0) Class325 arg0) {
		this.aClass323_5 = arg0.aClass323_133;
		this.aString122 = arg0.aString176;
		this.aString121 = arg0.aString177;
		this.anInt3227 = arg0.anInt4138 * -1666310801;
		this.aClass323_6 = arg0.aClass323_132;
	}

	@OriginalMember(owner = "client!aql", name = "toString", descriptor = "()Ljava/lang/String;", line = 26)
	@Override
	public String toString() {
		@Pc(13) String local13 = this.aClass323_5.toString() + " " + this.aString122;
		if (this.aString121 != null && !"".equals(this.aString121)) {
			local13 = local13 + " : " + this.aString121;
		}
		return local13;
	}

	@OriginalMember(owner = "client!aql", name = "rj", descriptor = "()Ljava/lang/String;", line = 26)
	public String method23650() {
		@Pc(13) String local13 = this.aClass323_5.toString() + " " + this.aString122;
		if (this.aString121 != null && !"".equals(this.aString121)) {
			local13 = local13 + " : " + this.aString121;
		}
		return local13;
	}

	@OriginalMember(owner = "client!aql", name = "n", descriptor = "(I)Ljava/lang/String;", line = 34)
	String method23651(@OriginalArg(0) int arg0) {
		return this.aString122;
	}

	@OriginalMember(owner = "client!aql", name = "d", descriptor = "()Ljava/lang/String;", line = 34)
	String method23652() {
		return this.aString122;
	}

	@OriginalMember(owner = "client!aql", name = "p", descriptor = "()Ljava/lang/String;", line = 34)
	String method23653() {
		return this.aString122;
	}

	@OriginalMember(owner = "client!aql", name = "m", descriptor = "(I)Lclient!ht;", line = 38)
	public Class323 method23654(@OriginalArg(0) int arg0) {
		return this.aClass323_5;
	}

	@OriginalMember(owner = "client!aql", name = "c", descriptor = "()Lclient!ht;", line = 38)
	public Class323 method23655() {
		return this.aClass323_5;
	}

	@OriginalMember(owner = "client!aql", name = "r", descriptor = "()Lclient!ht;", line = 42)
	public Class323 method23656() {
		return this.aClass323_6;
	}

	@OriginalMember(owner = "client!aql", name = "k", descriptor = "(S)Lclient!ht;", line = 42)
	public Class323 method23657(@OriginalArg(0) short arg0) {
		return this.aClass323_6;
	}

	@OriginalMember(owner = "client!aql", name = "v", descriptor = "()Lclient!ht;", line = 42)
	public Class323 method23658() {
		return this.aClass323_6;
	}

	@OriginalMember(owner = "client!aql", name = "f", descriptor = "(I)I", line = 46)
	public int method23659(@OriginalArg(0) int arg0) {
		if (Class323.aClass323_9 != this.aClass323_5) {
			throw new IllegalArgumentException_Sub1(this, this.aClass323_5.toString().toLowerCase());
		}
		return this.anInt3227 * -2132066709;
	}

	@OriginalMember(owner = "client!aql", name = "y", descriptor = "()I", line = 46)
	public int method23660() {
		if (Class323.aClass323_9 != this.aClass323_5) {
			throw new IllegalArgumentException_Sub1(this, this.aClass323_5.toString().toLowerCase());
		}
		return this.anInt3227 * -2132066709;
	}

	@OriginalMember(owner = "client!aql", name = "e", descriptor = "(I)Z")
	public abstract boolean method23661(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!aql", name = "h", descriptor = "(I)I")
	public abstract int method23662(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!aql", name = "w", descriptor = "(I)I")
	public abstract int method23663(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!aql", name = "l", descriptor = "(I)Z")
	public abstract boolean method23664(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!aql", name = "u", descriptor = "(I)Z")
	public abstract boolean method23665(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!aql", name = "z", descriptor = "(I)Z")
	public abstract boolean method23666(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!aql", name = "x", descriptor = "(I)I")
	public abstract int method23667(@OriginalArg(0) int arg0);
}
