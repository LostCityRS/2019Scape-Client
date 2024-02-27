package com.jagex;

import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aab")
public final class Class4 {

	@OriginalMember(owner = "client!aab", name = "e", descriptor = "Z")
	public static boolean aBoolean2 = true;

	@OriginalMember(owner = "client!aab", name = "f", descriptor = "(Lclient!aae;)[Lclient!aal;")
	public static Class14[] method24(@OriginalArg(0) Class7 arg0) {
		@Pc(3) int[] local3 = arg0.method107(-994301534);
		@Pc(9) Class14[] local9 = new Class14[local3.length >> 2];
		for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
			@Pc(19) Class14 local19 = new Class14();
			local9[local11] = local19;
			local19.anInt49 = local3[local11 << 2] * -1388586527;
			local19.anInt50 = local3[(local11 << 2) + 1] * 1657036197;
			local19.anInt51 = local3[(local11 << 2) + 2] * 1795833325;
			local19.anInt48 = local3[(local11 << 2) + 3] * 607772171;
		}
		return local9;
	}

	@OriginalMember(owner = "client!aab", name = "k", descriptor = "(Lclient!aae;)[Lclient!aal;")
	public static Class14[] method25(@OriginalArg(0) Class7 arg0) {
		@Pc(3) int[] local3 = arg0.method107(-1899968755);
		@Pc(9) Class14[] local9 = new Class14[local3.length >> 2];
		for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
			@Pc(19) Class14 local19 = new Class14();
			local9[local11] = local19;
			local19.anInt49 = local3[local11 << 2] * -1388586527;
			local19.anInt50 = local3[(local11 << 2) + 1] * 1657036197;
			local19.anInt51 = local3[(local11 << 2) + 2] * 1795833325;
			local19.anInt48 = local3[(local11 << 2) + 3] * 607772171;
		}
		return local9;
	}

	@OriginalMember(owner = "client!aab", name = "u", descriptor = "(Lclient!aae;Ljava/awt/Frame;)V")
	public static void method26(@OriginalArg(0) Class7 arg0, @OriginalArg(1) Frame arg1) {
		arg0.method109(444741782);
		arg1.setVisible(false);
		arg1.dispose();
	}

	@OriginalMember(owner = "client!aab", name = "w", descriptor = "(Lclient!aae;IIII)Ljava/awt/Frame;")
	public static Frame method27(@OriginalArg(0) Class7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg3 == 0) {
			@Pc(6) Class14[] local6 = Class629.method32442(arg0, -1574654625);
			if (local6 == null) {
				return null;
			}
			@Pc(13) boolean local13 = false;
			for (@Pc(15) int local15 = 0; local15 < local6.length; local15++) {
				if (arg1 == local6[local15].anInt49 * -1362482655 && arg2 == local6[local15].anInt50 * 72041005 && (arg4 == 0 || local6[local15].anInt48 * -1172488797 == arg4) && (!local13 || local6[local15].anInt51 * -787109915 > arg3)) {
					arg3 = local6[local15].anInt51 * -787109915;
					local13 = true;
				}
			}
			if (!local13) {
				return null;
			}
		}
		@Pc(76) Frame local76 = new Frame("Jagex Full Screen");
		local76.setResizable(false);
		arg0.method116(local76, arg1, arg2, arg3, arg4, 1893367929);
		return local76;
	}

	@OriginalMember(owner = "client!aab", name = "l", descriptor = "(Lclient!aae;IIII)Ljava/awt/Frame;")
	public static Frame method28(@OriginalArg(0) Class7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg3 == 0) {
			@Pc(6) Class14[] local6 = Class629.method32442(arg0, -1574654625);
			if (local6 == null) {
				return null;
			}
			@Pc(13) boolean local13 = false;
			for (@Pc(15) int local15 = 0; local15 < local6.length; local15++) {
				if (arg1 == local6[local15].anInt49 * -1362482655 && arg2 == local6[local15].anInt50 * 72041005 && (arg4 == 0 || local6[local15].anInt48 * -1172488797 == arg4) && (!local13 || local6[local15].anInt51 * -787109915 > arg3)) {
					arg3 = local6[local15].anInt51 * -787109915;
					local13 = true;
				}
			}
			if (!local13) {
				return null;
			}
		}
		@Pc(76) Frame local76 = new Frame("Jagex Full Screen");
		local76.setResizable(false);
		arg0.method116(local76, arg1, arg2, arg3, arg4, 1423552522);
		return local76;
	}

	@OriginalMember(owner = "client!aab", name = "z", descriptor = "(Lclient!aae;Ljava/awt/Frame;)V")
	public static void method29(@OriginalArg(0) Class7 arg0, @OriginalArg(1) Frame arg1) {
		arg0.method109(1001892276);
		arg1.setVisible(false);
		arg1.dispose();
	}

	@OriginalMember(owner = "client!aab", name = "ae", descriptor = "(Lclient!ase;I)V")
	static void method30(@OriginalArg(0) Class93_Sub41_Sub2 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Class31[] local2 = Class286.method26623((byte) 12);
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class31 local12 = local2[local4];
			if (Class31.aClass31_7 != local12) {
				@Pc(21) Class497 local21 = (Class497) Class14.aMap1.get(local12);
				if (local21 == null) {
					arg0.method22407(0, (byte) 75);
				} else {
					arg0.method22407(local21.method30227((short) -23469), (byte) -33);
				}
			}
		}
	}

	@OriginalMember(owner = "client!aab", name = "<init>", descriptor = "()V")
	Class4() throws Throwable {
		throw new Error();
	}
}
