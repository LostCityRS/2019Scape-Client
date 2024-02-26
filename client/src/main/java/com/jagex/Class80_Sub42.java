package com.jagex;

import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!alt")
public final class Class80_Sub42 extends Class80 {

	@OriginalMember(owner = "client!alt", name = "sq", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard1;

	@OriginalMember(owner = "client!alt", name = "k", descriptor = "Ljava/lang/String;")
	public String aString60;

	@OriginalMember(owner = "client!alt", name = "i", descriptor = "I")
	public int anInt2050;

	@OriginalMember(owner = "client!alt", name = "g", descriptor = "Lclient!hx;")
	public Class327 aClass327_3;

	@OriginalMember(owner = "client!alt", name = "m", descriptor = "I")
	public int anInt2051;

	@OriginalMember(owner = "client!alt", name = "s", descriptor = "I")
	public int anInt2052;

	@OriginalMember(owner = "client!alt", name = "o", descriptor = "I")
	public int anInt2053;

	@OriginalMember(owner = "client!alt", name = "j", descriptor = "Lclient!hx;")
	public Class327 aClass327_4;

	@OriginalMember(owner = "client!alt", name = "a", descriptor = "I")
	public int anInt2054;

	@OriginalMember(owner = "client!alt", name = "l", descriptor = "Z")
	public boolean aBoolean411;

	@OriginalMember(owner = "client!alt", name = "u", descriptor = "[Ljava/lang/Object;")
	public Object[] anObjectArray4;

	@OriginalMember(owner = "client!alt", name = "x", descriptor = "I")
	int anInt2055;

	@OriginalMember(owner = "client!alt", name = "wd", descriptor = "(Lclient!yp;I)V")
	static void method15604(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class672.aClass134_1.method10437(local12, -808179502);
	}

	@OriginalMember(owner = "client!alt", name = "ln", descriptor = "(Lclient!alk;ZZB)V")
	public static void method15605(@OriginalArg(0) Class80_Sub40 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) byte arg3) {
		@Pc(4) int local4 = arg0.anInt3156 * -151091669;
		@Pc(10) int local10 = (int) (arg0.aLong338 * 3209506792906532031L);
		arg0.method24395((byte) 106);
		if (arg1) {
			Class123.method20527(local4, (byte) 4);
		}
		Class436.method29135(local4, -2047878608);
		@Pc(25) Class327 local25 = Class301.method27041(local10, 2089748918);
		if (local25 != null) {
			Class296.method26998(local25, -96980808);
		}
		Class223.method25942(local4, -13606983);
		if (!arg2 && client.anInt3460 * 1849344509 != -1) {
			Class2_Sub1_Sub2.method1852(client.anInt3460 * 1849344509, 1, -1694105499);
		}
		@Pc(52) Class17 local52 = new Class17(client.aClass24_20);
		for (@Pc(57) Class80_Sub40 local57 = (Class80_Sub40) local52.method427(-593696426); local57 != null; local57 = (Class80_Sub40) local52.next()) {
			if (!local57.method24399(1235311610)) {
				local57 = (Class80_Sub40) local52.method427(-1067378822);
				if (local57 == null) {
					break;
				}
			}
			if (local57.anInt3155 * 1092245243 == 3) {
				@Pc(85) int local85 = (int) (local57.aLong338 * 3209506792906532031L);
				if (local85 >>> 16 == local4) {
					method15605(local57, true, arg2, (byte) -38);
				}
			}
		}
	}
}
