package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vp")
public final class Class619 {

	@OriginalMember(owner = "client!vp", name = "x", descriptor = "Lclient!aan;")
	static Class15 aClass15_12;

	@OriginalMember(owner = "client!vp", name = "f", descriptor = "I")
	public int anInt5434;

	@OriginalMember(owner = "client!vp", name = "t", descriptor = "I")
	public int anInt5435;

	@OriginalMember(owner = "client!vp", name = "e", descriptor = "Lclient!oc;")
	public Class457 aClass457_90;

	@OriginalMember(owner = "client!vp", name = "mc", descriptor = "(Ljava/lang/String;Lclient!yp;I)[I")
	static int[] method32302(@OriginalArg(0) String arg0, @OriginalArg(1) Class690 arg1, @OriginalArg(2) int arg2) {
		@Pc(1) int[] local1 = null;
		if (arg0.length() > 0 && arg0.charAt(arg0.length() - 1) == 'Y') {
			@Pc(25) int local25 = arg1.anIntArray525[(arg1.anInt5778 -= 2036747717) * 1896589581];
			if (local25 > 0) {
				local1 = new int[local25];
				while (local25-- > 0) {
					local1[local25] = arg1.anIntArray525[(arg1.anInt5778 -= 2036747717) * 1896589581];
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!vp", name = "si", descriptor = "(Lclient!yp;B)V")
	static void method32303(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = client.method25326(local11).method14325(740995489);
	}

	@OriginalMember(owner = "client!vp", name = "atc", descriptor = "(Lclient!yp;B)V")
	static void method32304(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class703.aClass80_Sub37_49.aClass165_Sub7_1.method15953(-1582526878) == 1 ? 1 : 0;
	}

	@OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(Lclient!ald;IZZ)V")
	Class619(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		@Pc(9) boolean local9 = (arg1 & 0x80) != 0;
		if (arg2) {
			@Pc(32) int local32 = arg0.method23362(396367307);
			this.anInt5434 = (arg1 & 0x7F) * -1565526897;
			this.anInt5435 = local32 * -650192397;
		} else {
			this.anInt5434 = (arg1 >> 2 & 0x1F) * -1565526897;
			this.anInt5435 = (arg1 & 0x3) * -650192397;
		}
		this.aClass457_90 = null;
		if (local9) {
			this.aClass457_90 = new Class457(arg0, arg3);
		}
	}

	@OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(Lclient!ald;Z)V")
	Class619(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) boolean arg1) {
		this(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(Lclient!ald;IZ)V")
	public Class619(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		this(arg0, arg1, arg2, true);
	}

	@OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(Lclient!ald;ZZ)V")
	Class619(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		this(arg0, arg0.method23362(-1502509808), arg1, arg2);
	}

	@OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(Lclient!ald;)V")
	public Class619(@OriginalArg(0) Class80_Sub36 arg0) {
		this(arg0, false);
	}
}
