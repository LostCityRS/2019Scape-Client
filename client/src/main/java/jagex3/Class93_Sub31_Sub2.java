package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!arh")
public final class Class93_Sub31_Sub2 extends Class93_Sub31 {

	@OriginalMember(owner = "client!arh", name = "w", descriptor = "I")
	int anInt3005;

	@OriginalMember(owner = "client!arh", name = "f", descriptor = "B")
	byte aByte80;

	@OriginalMember(owner = "client!arh", name = "l", descriptor = "Ljava/lang/String;")
	String aString96;

	// $FF: synthetic field
	@OriginalMember(owner = "client!arh", name = "this$0", descriptor = "Lclient!kc;")
	final Class374 aClass374_2;

	@OriginalMember(owner = "client!arh", name = "k", descriptor = "I")
	int anInt3006;

	@OriginalMember(owner = "client!arh", name = "<init>", descriptor = "(Lclient!kc;)V")
	Class93_Sub31_Sub2(@OriginalArg(0) Class374 arg0) {
		this.aClass374_2 = arg0;
		this.anInt3006 = 599208757;
	}

	@OriginalMember(owner = "client!arh", name = "e", descriptor = "(Lclient!alw;I)V")
	@Override
	void method22023(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		this.anInt3006 = arg0.method22427(-1434290800) * -599208757;
		this.aByte80 = arg0.method22426(1854919209);
		this.anInt3005 = arg0.method22427(-1434290800) * -1365295607;
		arg0.method22435(-1307679067);
		this.aString96 = arg0.method22439(-87979501);
	}

	@OriginalMember(owner = "client!arh", name = "k", descriptor = "(Lclient!akr;)V")
	@Override
	void method22021(@OriginalArg(0) Class93_Sub28 arg0) {
		@Pc(7) Class373 local7 = arg0.aClass373Array1[this.anInt3006 * 1563572451];
		local7.aByte150 = this.aByte80;
		local7.anInt4758 = this.anInt3005 * -1570685103;
		local7.aString200 = this.aString96;
	}

	@OriginalMember(owner = "client!arh", name = "n", descriptor = "(Lclient!akr;S)V")
	@Override
	void method22019(@OriginalArg(0) Class93_Sub28 arg0, @OriginalArg(1) short arg1) {
		@Pc(7) Class373 local7 = arg0.aClass373Array1[this.anInt3006 * 1563572451];
		local7.aByte150 = this.aByte80;
		local7.anInt4758 = this.anInt3005 * -1570685103;
		local7.aString200 = this.aString96;
	}

	@OriginalMember(owner = "client!arh", name = "m", descriptor = "(Lclient!alw;)V")
	@Override
	void method22018(@OriginalArg(0) Class93_Sub41 arg0) {
		this.anInt3006 = arg0.method22427(-1434290800) * -599208757;
		this.aByte80 = arg0.method22426(780829617);
		this.anInt3005 = arg0.method22427(-1434290800) * -1365295607;
		arg0.method22435(-1805681566);
		this.aString96 = arg0.method22439(61956661);
	}

	@OriginalMember(owner = "client!arh", name = "f", descriptor = "(Lclient!akr;)V")
	@Override
	void method22020(@OriginalArg(0) Class93_Sub28 arg0) {
		@Pc(7) Class373 local7 = arg0.aClass373Array1[this.anInt3006 * 1563572451];
		local7.aByte150 = this.aByte80;
		local7.anInt4758 = this.anInt3005 * -1570685103;
		local7.aString200 = this.aString96;
	}

	@OriginalMember(owner = "client!arh", name = "w", descriptor = "(Lclient!akr;)V")
	@Override
	void method22022(@OriginalArg(0) Class93_Sub28 arg0) {
		@Pc(7) Class373 local7 = arg0.aClass373Array1[this.anInt3006 * 1563572451];
		local7.aByte150 = this.aByte80;
		local7.anInt4758 = this.anInt3005 * -1570685103;
		local7.aString200 = this.aString96;
	}
}
