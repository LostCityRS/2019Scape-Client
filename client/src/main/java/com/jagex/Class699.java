package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.awt.*;

@OriginalClass("client!z")
public final class Class699 {

	@OriginalMember(owner = "client!z", name = "s", descriptor = "I")
	static int anInt5812;

	@OriginalMember(owner = "client!z", name = "uc", descriptor = "I")
	static int anInt5813;

	@OriginalMember(owner = "client!z", name = "u", descriptor = "Z")
	public boolean aBoolean992;

	@OriginalMember(owner = "client!z", name = "f", descriptor = "Ljava/lang/String;")
	public String aString242;

	@OriginalMember(owner = "client!z", name = "e", descriptor = "Ljava/lang/String;")
	public String aString243;

	@OriginalMember(owner = "client!z", name = "t", descriptor = "Ljava/lang/String;")
	public String aString244;

	@OriginalMember(owner = "client!z", name = "u", descriptor = "(I)V")
	static void method37064(@OriginalArg(0) int arg0) {
		if (Class365.aClass360_19 != null) {
			Class365.aClass369_1 = new Class369();
			Class365.aClass369_1.method28301(Exception_Sub7.aLong155 * -6524789075775222403L, Class365.aClass360_19.aClass60_177.method1180(Class512.aClass719_3, 201204932), Class365.aClass360_19.aClass60_177.method1180(Class512.aClass719_3, -27897224), Class365.aClass360_19.anInt4491 * 171081043, Class365.aClass360_19, 1942282348);
			Class365.aThread7 = new Thread(Class365.aClass369_1, "");
			Class365.aThread7.start();
		}
	}

	@OriginalMember(owner = "client!z", name = "aun", descriptor = "(Lclient!yp;I)V")
	static void method37065(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class703.aClass80_Sub37_49.aClass165_Sub36_1.method16605((byte) 3) == 1 ? 1 : 0;
	}

	@OriginalMember(owner = "client!z", name = "gh", descriptor = "(IIIIZI)V")
	static void method37066(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (Class13.aBoolean5 && Class411.aFrame2 != null && (arg1 != 3 || Class346.anInt4250 * 956969065 != arg2 || arg3 != Class269.anInt3918 * -1948970357)) {
			Class708.method37149(Js5MasterIndex.aClass14_1, Class411.aFrame2, -376247776);
			Class411.aFrame2 = null;
		}
		if (Class13.aBoolean5 && arg1 == 3 && Class411.aFrame2 == null) {
			Class411.aFrame2 = Class549.method31317(Js5MasterIndex.aClass14_1, arg2, arg3, 0, 0, -1794933958);
			if (Class411.aFrame2 != null) {
				Class346.anInt4250 = arg2 * 1584816089;
				Class269.anInt3918 = arg3 * -226671325;
				Class719.method37291(-873352820);
			}
		}
		if (arg1 == 3 && (!Class13.aBoolean5 || Class411.aFrame2 == null)) {
			method37066(arg0, Class703.aClass80_Sub37_49.aClass165_Sub18_1.method16183((short) 32767), -1, -1, true, 1404842049);
			return;
		}
		@Pc(73) Container local73 = Class60.method1187(-256055983);
		@Pc(89) Insets local89;
		if (Class411.aFrame2 != null) {
			Class334.anInt4196 = arg2 * -252102001;
			Class286.anInt3942 = arg3 * -1848246999;
		} else if (Class244.aFrame1 == null) {
			Class334.anInt4196 = local73.getSize().width * -252102001;
			Class286.anInt3942 = local73.getSize().height * -1848246999;
		} else {
			local89 = Class244.aFrame1.getInsets();
			@Pc(97) int local97 = local89.right + local89.left;
			Class334.anInt4196 = (Class244.aFrame1.getSize().width - local97) * -252102001;
			@Pc(109) int local109 = local89.top + local89.bottom;
			Class286.anInt3942 = (Class244.aFrame1.getSize().height - local109) * -1848246999;
		}
		if (Class334.anInt4196 * -455826321 <= 0) {
			Class334.anInt4196 = -252102001;
		}
		if (Class286.anInt3942 * -1411780839 <= 0) {
			Class286.anInt3942 = -1848246999;
		}
		if (arg1 == 1) {
			Class80_Sub1_Sub1.anInt254 = client.anInt3510 * -132253473;
			client.anInt3415 = (Class334.anInt4196 * -455826321 - client.anInt3510 * 1528239985) / 2 * 294043627;
			Class80_Sub25.anInt1627 = client.anInt3511 * -1378268535;
			client.anInt3417 = 0;
		} else {
			Class668.method33489(1711394824);
		}
		if (Class697.aClass697_4 != Class566.aClass697_1 && Class80_Sub1_Sub1.anInt254 * -255202897 < 1024 && Class80_Sub25.anInt1627 * 167687103 < 768) {
		}
		if (arg4) {
			Class686.method36803((byte) 5);
		} else {
			Class454.canvas.setSize(Class80_Sub1_Sub1.anInt254 * -255202897, Class80_Sub25.anInt1627 * 167687103);
			Class279.aClass102_9.method21008(Class454.canvas, Class80_Sub1_Sub1.anInt254 * -255202897, Class80_Sub25.anInt1627 * 167687103, (short) 255);
			if (local73 == Class244.aFrame1) {
				local89 = Class244.aFrame1.getInsets();
				Class454.canvas.setLocation(client.anInt3415 * 317681859 + local89.left, client.anInt3417 * -1044003729 + local89.top);
			} else {
				Class454.canvas.setLocation(client.anInt3415 * 317681859, client.anInt3417 * -1044003729);
			}
		}
		if (arg1 >= 2) {
			client.aBoolean729 = true;
		} else {
			client.aBoolean729 = false;
		}
		Class533.method30832((byte) 43);
		if (client.anInt3460 * 1849344509 != -1) {
			Class144_Sub1.method12033(true, 363257192);
		}
		if (Class52.method1074(16777215).method1321((byte) 2) != null && (Class123_Sub1.method9819(client.anInt3433 * 1994758437, -1245928732) || Class301.method27043(client.anInt3433 * 1994758437, (byte) -10))) {
			Class103_Sub23.method8699(Class52.method1074(16777215), 2019963393);
		}
		for (@Pc(272) int local272 = 0; local272 < 106; local272++) {
			client.aBooleanArray19[local272] = true;
		}
		client.aBoolean700 = true;
	}

	@OriginalMember(owner = "client!z", name = "bcc", descriptor = "(Lclient!kf;I)Lclient!em;")
	static Interface22 method37067(@OriginalArg(0) Class378 arg0, @OriginalArg(1) int arg1) {
		return new Class693(arg0);
	}

	@OriginalMember(owner = "client!z", name = "s", descriptor = "(II)V")
	public static void method37068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(8, (long) arg0);
		local4.method22078(-419716990);
	}

	@OriginalMember(owner = "client!z", name = "<init>", descriptor = "()V")
	Class699() {
	}
}
