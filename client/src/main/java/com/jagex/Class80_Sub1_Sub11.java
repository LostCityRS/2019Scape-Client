package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!arz")
public final class Class80_Sub1_Sub11 extends Class80_Sub1 {

	@OriginalMember(owner = "client!arz", name = "d", descriptor = "Ljava/lang/String;")
	String aString107;

	@OriginalMember(owner = "client!arz", name = "i", descriptor = "Ljava/lang/String;")
	final String aString105;

	@OriginalMember(owner = "client!arz", name = "m", descriptor = "Ljava/lang/String;")
	final String aString106;

	@OriginalMember(owner = "client!arz", name = "o", descriptor = "I")
	final int anInt3075;

	@OriginalMember(owner = "client!arz", name = "h", descriptor = "I")
	int anInt3079;

	@OriginalMember(owner = "client!arz", name = "j", descriptor = "I")
	final int anInt3077;

	@OriginalMember(owner = "client!arz", name = "a", descriptor = "J")
	final long aLong248;

	@OriginalMember(owner = "client!arz", name = "s", descriptor = "I")
	final int anInt3076;

	@OriginalMember(owner = "client!arz", name = "k", descriptor = "I")
	final int anInt3078;

	@OriginalMember(owner = "client!arz", name = "x", descriptor = "Z")
	final boolean aBoolean587;

	@OriginalMember(owner = "client!arz", name = "w", descriptor = "Z")
	final boolean aBoolean588;

	@OriginalMember(owner = "client!arz", name = "r", descriptor = "J")
	final long aLong249;

	@OriginalMember(owner = "client!arz", name = "q", descriptor = "Z")
	final boolean aBoolean589;

	@OriginalMember(owner = "client!arz", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZJZ)V")
	Class80_Sub1_Sub11(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) long arg10, @OriginalArg(11) boolean arg11) {
		this.aString105 = arg1;
		this.aString106 = arg0;
		this.anInt3075 = arg2 * 1148126409;
		this.anInt3079 = arg3 * -2084667181;
		this.anInt3077 = arg4 * 277020331;
		this.aLong248 = arg5 * -8939152156391275249L;
		this.anInt3076 = arg6 * -2030934409;
		this.anInt3078 = arg7 * -1990908305;
		this.aBoolean587 = arg8;
		this.aBoolean588 = arg9;
		this.aLong249 = arg10 * 2873523022781501229L;
		this.aBoolean589 = arg11;
	}

	@OriginalMember(owner = "client!arz", name = "t", descriptor = "(I)J")
	public long method22271(@OriginalArg(0) int arg0) {
		return this.aLong248 * 7780148905970551279L;
	}

	@OriginalMember(owner = "client!arz", name = "l", descriptor = "()J")
	public long method22272() {
		return this.aLong249 * -6321316696381466459L;
	}

	@OriginalMember(owner = "client!arz", name = "f", descriptor = "(I)J")
	public long method22273(@OriginalArg(0) int arg0) {
		return this.aLong249 * -6321316696381466459L;
	}

	@OriginalMember(owner = "client!arz", name = "e", descriptor = "()J")
	public long method22274() {
		return this.aLong248 * 7780148905970551279L;
	}

	@OriginalMember(owner = "client!arz", name = "u", descriptor = "()J")
	public long method22275() {
		return this.aLong248 * 7780148905970551279L;
	}
}
