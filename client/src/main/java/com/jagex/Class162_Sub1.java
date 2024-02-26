package com.jagex;

import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.util.LinkedList;
import java.util.Queue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!alv")
public final class Class162_Sub1 extends Class162 {

	@OriginalMember(owner = "client!alv", name = "g", descriptor = "Ljava/util/Queue;")
	final Queue aQueue1 = new LinkedList();

	@OriginalMember(owner = "client!alv", name = "q", descriptor = "(Lclient!ara;I)V")
	static void method15720(@OriginalArg(0) Class80_Sub1_Sub4 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) boolean local1 = false;
		arg0.method24406(-2147483643);
		for (@Pc(9) Class80_Sub1_Sub4 local9 = (Class80_Sub1_Sub4) Class630.aClass3_17.method50((byte) 27); local9 != null; local9 = (Class80_Sub1_Sub4) Class630.aClass3_17.method46((byte) -102)) {
			if (Class690.method36959(arg0.method21711((byte) 14), local9.method21711((byte) 35), -577765912)) {
				Class653.method33145(arg0, local9, -489801945);
				local1 = true;
				break;
			}
		}
		if (!local1) {
			Class630.aClass3_17.method42(arg0, 1599142138);
		}
	}

	@OriginalMember(owner = "client!alv", name = "e", descriptor = "(Ljava/lang/String;ZLjava/lang/String;ZB)V")
	public static void method15721(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte arg4) {
		if (!arg1) {
			Class333.method27807(arg0, 3, -214682127);
			return;
		}
		if (!arg3 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
			try {
				Desktop.getDesktop().browse(new URI(arg0));
				return;
			} catch (@Pc(17) Exception local17) {
			}
		}
		if (Class562.aString224.startsWith("win") && !arg3) {
			Class333.method27807(arg0, 0, -214682127);
			return;
		}
		if (Class562.aString224.startsWith("mac")) {
			Class498.method30361(arg0, 1, arg2, (byte) 19);
			return;
		}
		Class333.method27807(arg0, 2, -214682127);
	}

	@OriginalMember(owner = "client!alv", name = "km", descriptor = "([Lclient!hx;Lclient!hx;ZB)V")
	static void method15722(@OriginalArg(0) Class327[] arg0, @OriginalArg(1) Class327 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) byte arg3) {
		@Pc(15) int local15 = arg1.anInt4112 * -2019977469 == 0 ? arg1.anInt4103 * 1892149809 : arg1.anInt4112 * -2019977469;
		@Pc(30) int local30 = arg1.anInt4091 * -13185357 == 0 ? arg1.anInt4104 * 1990157877 : arg1.anInt4091 * -13185357;
		Class45.method17297(arg0, arg1.anInt4087 * -2053489901, local15, local30, arg2, (byte) 84);
		if (arg1.aClass327Array4 != null) {
			Class45.method17297(arg1.aClass327Array4, arg1.anInt4087 * -2053489901, local15, local30, arg2, (byte) -6);
		}
		@Pc(63) Class80_Sub40 local63 = (Class80_Sub40) client.aClass24_20.method560((long) (arg1.anInt4087 * -2053489901));
		if (local63 != null) {
			Class292.method26949(local63.anInt3156 * -151091669, local15, local30, arg2, -1143871924);
		}
		if (client.aClass327_7 != arg1) {
			return;
		}
		@Pc(81) int local81 = Class51.anInt191 * 44967471;
		@Pc(83) int[] local83 = Class51.anIntArray20;
		@Pc(85) int local85;
		for (local85 = 0; local85 < local81; local85++) {
			@Pc(94) Class120_Sub1_Sub1_Sub1_Sub2 local94 = client.aClass120_Sub1_Sub1_Sub1_Sub2Array1[local83[local85]];
			if (local94 != null) {
				local94.method19044(local15, local30, arg2, -2014870551);
			}
		}
		for (local85 = 0; local85 < client.anInt3453 * -1702559601; local85++) {
			@Pc(116) int local116 = client.anIntArray304[local85];
			@Pc(122) Class80_Sub19 local122 = (Class80_Sub19) client.aClass24_18.method560((long) local116);
			if (local122 != null) {
				((Class120_Sub1_Sub1_Sub1) local122.anObject5).method19044(local15, local30, arg2, -2115248400);
			}
		}
	}

	@OriginalMember(owner = "client!alv", name = "<init>", descriptor = "()V")
	Class162_Sub1() {
	}

	@OriginalMember(owner = "client!alv", name = "c", descriptor = "(Lclient!ald;Lclient!asz;I)V")
	void method15713(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) Class80_Sub17_Sub2 arg1, @OriginalArg(2) int arg2) {
		arg0.method23154(arg1.method23471(1092977885), 1275868335);
	}

	@OriginalMember(owner = "client!alv", name = "n", descriptor = "(Lclient!asz;I)V")
	void method15714(@OriginalArg(0) Class80_Sub17_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.aQueue1.add(arg0);
		if (this.aQueue1.size() > 10) {
			this.aQueue1.poll();
		}
	}

	@OriginalMember(owner = "client!alv", name = "i", descriptor = "(I)V")
	@Override
	void method15785(@OriginalArg(0) int arg0) {
		@Pc(4) Class80_Sub17_Sub2 local4 = (Class80_Sub17_Sub2) this.aQueue1.poll();
		if (local4 == null) {
			return;
		}
		@Pc(13) Class80_Sub31 local13 = Class623.method32440(Class443.aClass443_74, client.aClass75_1.aClass22_1, -191270971);
		local13.aClass80_Sub36_Sub1_2.method23220(this.method15777(local4, 65535, 1530367823), 2036747717);
		local13.aClass80_Sub36_Sub1_2.method23229(local4.method23451(1104430454) | local4.method23454(-358265751) << 16, 1350952348);
		local13.aClass80_Sub36_Sub1_2.method23209(local4.method23472(1364854779) << 1 | local4.method23471(-1700354675) & 0x1, -220005457);
		client.aClass75_1.method1325(local13, (byte) -4);
		local4.method23453(-454396966);
	}

	@OriginalMember(owner = "client!alv", name = "q", descriptor = "(Lclient!ald;Lclient!akg;)V")
	@Override
	void method15783(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) Class80_Sub17 arg1) {
		this.method15713(arg0, (Class80_Sub17_Sub2) arg1, 1306301075);
	}

	@OriginalMember(owner = "client!alv", name = "o", descriptor = "(I)Lclient!aku;")
	@Override
	Class80_Sub31 method15782(@OriginalArg(0) int arg0) {
		return Class623.method32440(Class443.aClass443_7, client.aClass75_1.aClass22_1, -191270971);
	}

	@OriginalMember(owner = "client!alv", name = "m", descriptor = "(I)Z")
	@Override
	boolean method15781(@OriginalArg(0) int arg0) {
		return !this.aQueue1.isEmpty() || this.aLong153 * 4888655562420521213L < Class303.method27111((byte) 121) - 2000L;
	}

	@OriginalMember(owner = "client!alv", name = "l", descriptor = "(I)I")
	@Override
	int method15778(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!alv", name = "g", descriptor = "(Lclient!ald;Lclient!akg;B)V")
	@Override
	void method15779(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) Class80_Sub17 arg1, @OriginalArg(2) byte arg2) {
		this.method15713(arg0, (Class80_Sub17_Sub2) arg1, 1835058222);
	}

	@OriginalMember(owner = "client!alv", name = "aq", descriptor = "(Lclient!ald;Lclient!asz;)V")
	void method15715(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) Class80_Sub17_Sub2 arg1) {
		arg0.method23154(arg1.method23471(-1762138318), 1275868335);
	}

	@OriginalMember(owner = "client!alv", name = "ax", descriptor = "(Lclient!asz;)V")
	void method15716(@OriginalArg(0) Class80_Sub17_Sub2 arg0) {
		this.aQueue1.add(arg0);
		if (this.aQueue1.size() > 10) {
			this.aQueue1.poll();
		}
	}

	@OriginalMember(owner = "client!alv", name = "j", descriptor = "()V")
	@Override
	void method15780() {
		@Pc(4) Class80_Sub17_Sub2 local4 = (Class80_Sub17_Sub2) this.aQueue1.poll();
		if (local4 == null) {
			return;
		}
		@Pc(13) Class80_Sub31 local13 = Class623.method32440(Class443.aClass443_74, client.aClass75_1.aClass22_1, -191270971);
		local13.aClass80_Sub36_Sub1_2.method23220(this.method15777(local4, 65535, 1530367823), 2036747717);
		local13.aClass80_Sub36_Sub1_2.method23229(local4.method23451(79378809) | local4.method23454(519251707) << 16, 601114679);
		local13.aClass80_Sub36_Sub1_2.method23209(local4.method23472(1364854779) << 1 | local4.method23471(-1364708224) & 0x1, -1295932843);
		client.aClass75_1.method1325(local13, (byte) -94);
		local4.method23453(-454396966);
	}

	@OriginalMember(owner = "client!alv", name = "s", descriptor = "()Lclient!aku;")
	@Override
	Class80_Sub31 method15794() {
		return Class623.method32440(Class443.aClass443_7, client.aClass75_1.aClass22_1, -191270971);
	}

	@OriginalMember(owner = "client!alv", name = "ay", descriptor = "(Lclient!ald;Lclient!asz;)V")
	void method15717(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) Class80_Sub17_Sub2 arg1) {
		arg0.method23154(arg1.method23471(13910069), 1275868335);
	}

	@OriginalMember(owner = "client!alv", name = "ai", descriptor = "(Lclient!ald;Lclient!asz;)V")
	void method15718(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) Class80_Sub17_Sub2 arg1) {
		arg0.method23154(arg1.method23471(-1682243529), 1275868335);
	}

	@OriginalMember(owner = "client!alv", name = "a", descriptor = "()Z")
	@Override
	boolean method15776() {
		return !this.aQueue1.isEmpty() || this.aLong153 * 4888655562420521213L < Class303.method27111((byte) 63) - 2000L;
	}

	@OriginalMember(owner = "client!alv", name = "k", descriptor = "()I")
	@Override
	int method15774() {
		return 1;
	}

	@OriginalMember(owner = "client!alv", name = "x", descriptor = "()I")
	@Override
	int method15786() {
		return 1;
	}

	@OriginalMember(owner = "client!alv", name = "w", descriptor = "(Lclient!ald;Lclient!akg;)V")
	@Override
	void method15787(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) Class80_Sub17 arg1) {
		this.method15713(arg0, (Class80_Sub17_Sub2) arg1, 226673042);
	}

	@OriginalMember(owner = "client!alv", name = "r", descriptor = "(Lclient!ald;Lclient!akg;)V")
	@Override
	void method15784(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) Class80_Sub17 arg1) {
		this.method15713(arg0, (Class80_Sub17_Sub2) arg1, 1341923232);
	}

	@OriginalMember(owner = "client!alv", name = "b", descriptor = "(Lclient!asz;)V")
	void method15719(@OriginalArg(0) Class80_Sub17_Sub2 arg0) {
		this.aQueue1.add(arg0);
		if (this.aQueue1.size() > 10) {
			this.aQueue1.poll();
		}
	}
}
