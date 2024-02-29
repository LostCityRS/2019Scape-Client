package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!arm")
public final class Class93_Sub1_Sub7 extends Class93_Sub1 {

	@OriginalMember(owner = "client!arm", name = "x", descriptor = "Ljava/lang/String;")
	String aString98;

	@OriginalMember(owner = "client!arm", name = "l", descriptor = "Ljava/lang/String;")
	final String aString100;

	@OriginalMember(owner = "client!arm", name = "u", descriptor = "Ljava/lang/String;")
	final String aString99;

	@OriginalMember(owner = "client!arm", name = "p", descriptor = "I")
	final int anInt3008;

	@OriginalMember(owner = "client!arm", name = "q", descriptor = "I")
	int anInt3012;

	@OriginalMember(owner = "client!arm", name = "d", descriptor = "I")
	final int anInt3010;

	@OriginalMember(owner = "client!arm", name = "c", descriptor = "J")
	final long aLong154;

	@OriginalMember(owner = "client!arm", name = "r", descriptor = "I")
	final int anInt3011;

	@OriginalMember(owner = "client!arm", name = "v", descriptor = "I")
	final int anInt3009;

	@OriginalMember(owner = "client!arm", name = "z", descriptor = "Z")
	final boolean aBoolean506;

	@OriginalMember(owner = "client!arm", name = "o", descriptor = "Z")
	final boolean aBoolean504;

	@OriginalMember(owner = "client!arm", name = "s", descriptor = "J")
	final long aLong155;

	@OriginalMember(owner = "client!arm", name = "y", descriptor = "Z")
	final boolean aBoolean505;

	@OriginalMember(owner = "client!arm", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZJZ)V")
	Class93_Sub1_Sub7(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) long arg10, @OriginalArg(11) boolean arg11) {
		this.aString100 = arg1;
		this.aString99 = arg0;
		this.anInt3008 = arg2 * -1082183835;
		this.anInt3012 = arg3 * -446329317;
		this.anInt3010 = arg4 * 437109713;
		this.aLong154 = arg5 * 3653707612477404349L;
		this.anInt3011 = arg6 * -438621403;
		this.anInt3009 = arg7 * -1390933639;
		this.aBoolean506 = arg8;
		this.aBoolean504 = arg9;
		this.aLong155 = arg10 * -6942167405982365783L;
		this.aBoolean505 = arg11;
	}

	@OriginalMember(owner = "client!arm", name = "n", descriptor = "(I)J")
	public long method21713(@OriginalArg(0) int arg0) {
		return this.aLong155 * 7070093341456026777L;
	}

	@OriginalMember(owner = "client!arm", name = "m", descriptor = "()J")
	public long method21714() {
		return this.aLong154 * 3050087486000948885L;
	}

	@OriginalMember(owner = "client!arm", name = "e", descriptor = "(I)J")
	public long method21715(@OriginalArg(0) int arg0) {
		return this.aLong154 * 3050087486000948885L;
	}
}
