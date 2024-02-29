package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wm")
public final class Class640 {

	@OriginalMember(owner = "client!wm", name = "aj", descriptor = "I")
	static int anInt5916;

	@OriginalMember(owner = "client!wm", name = "e", descriptor = "I")
	final int anInt5913;

	@OriginalMember(owner = "client!wm", name = "n", descriptor = "I")
	final int anInt5912;

	@OriginalMember(owner = "client!wm", name = "m", descriptor = "Z")
	boolean aBoolean864;

	@OriginalMember(owner = "client!wm", name = "w", descriptor = "Lclient!wd;")
	final Class634 aClass634_2;

	@OriginalMember(owner = "client!wm", name = "l", descriptor = "I")
	final int anInt5915;

	@OriginalMember(owner = "client!wm", name = "f", descriptor = "I")
	final int anInt5911;

	@OriginalMember(owner = "client!wm", name = "k", descriptor = "I")
	final int anInt5914;

	@OriginalMember(owner = "client!wm", name = "bz", descriptor = "(Lclient!yf;I)V")
	static void method32677(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aClass658_1 != null) {
			Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aClass658_1.method32942(local13, local23, -130712985);
		}
	}

	@OriginalMember(owner = "client!wm", name = "aaf", descriptor = "(Lclient!yf;I)V")
	static void method32678(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		if (client.aString146 == null) {
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
		} else {
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = Class93_Sub1_Sub2.method1787(client.aString146, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!wm", name = "agt", descriptor = "(Lclient!yf;I)V")
	static void method32679(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = ((Class47) Class277.aClass32_Sub12_1.method18273(local12, -909308048)).aBoolean21 ? 1 : 0;
	}

	@OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(IIZZILclient!wd;I)V")
	Class640(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class634 arg5, @OriginalArg(6) int arg6) {
		this.anInt5913 = arg0 * -1375140561;
		this.anInt5912 = arg1 * -1117524205;
		this.aBoolean864 = arg2;
		this.aClass634_2 = arg5;
		this.anInt5915 = arg6 * 1772540923;
		if (arg2) {
			this.anInt5911 = arg4 * 1248182811;
			this.anInt5914 = this.method32658(arg4, 1139625193) * -2085766573;
		} else {
			this.anInt5911 = -1248182811;
			this.anInt5914 = 2085766573;
		}
	}

	@OriginalMember(owner = "client!wm", name = "l", descriptor = "(IB)I")
	public int method32649(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 / 10;
		return this.method32655(local3, (byte) 112);
	}

	@OriginalMember(owner = "client!wm", name = "y", descriptor = "()I")
	public int method32650() {
		return this.anInt5911 * -381597677;
	}

	@OriginalMember(owner = "client!wm", name = "n", descriptor = "(B)Z")
	public boolean method32651(@OriginalArg(0) byte arg0) {
		return this.aBoolean864;
	}

	@OriginalMember(owner = "client!wm", name = "m", descriptor = "(I)I")
	public int method32652(@OriginalArg(0) int arg0) {
		return this.anInt5914 * 1025677787;
	}

	@OriginalMember(owner = "client!wm", name = "k", descriptor = "(I)I")
	public int method32653(@OriginalArg(0) int arg0) {
		return this.anInt5911 * -381597677;
	}

	@OriginalMember(owner = "client!wm", name = "q", descriptor = "()I")
	public int method32654() {
		return this.anInt5911 * -381597677;
	}

	@OriginalMember(owner = "client!wm", name = "w", descriptor = "(IB)I")
	public int method32655(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(10) int local10 = this.aClass634_2.method32493(arg0, 1801264511) + this.anInt5915 * 1685798707;
		return local10 > this.anInt5912 * -1804127461 ? this.anInt5912 * -1804127461 : local10;
	}

	@OriginalMember(owner = "client!wm", name = "o", descriptor = "()I")
	public int method32656() {
		return this.anInt5914 * 1025677787;
	}

	@OriginalMember(owner = "client!wm", name = "u", descriptor = "(IB)I")
	int method32657(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (arg0 > this.anInt5912 * -1804127461) {
			arg0 = this.anInt5912 * -1804127461;
		}
		return this.aClass634_2.method32497(arg0 - this.anInt5915 * 1685798707, 540048644);
	}

	@OriginalMember(owner = "client!wm", name = "z", descriptor = "(II)I")
	int method32658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method32657(arg0, (byte) 8) * 10;
	}

	@OriginalMember(owner = "client!wm", name = "p", descriptor = "()I")
	int method32659() {
		return this.anInt5913 * -1398644273;
	}

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "()I")
	public int method32660() {
		return this.anInt5911 * -381597677;
	}

	@OriginalMember(owner = "client!wm", name = "s", descriptor = "()I")
	public int method32661() {
		return this.anInt5911 * -381597677;
	}

	@OriginalMember(owner = "client!wm", name = "r", descriptor = "()I")
	int method32662() {
		return this.anInt5913 * -1398644273;
	}

	@OriginalMember(owner = "client!wm", name = "v", descriptor = "()I")
	public int method32663() {
		return this.anInt5914 * 1025677787;
	}

	@OriginalMember(owner = "client!wm", name = "e", descriptor = "(I)I")
	int method32664(@OriginalArg(0) int arg0) {
		return this.anInt5913 * -1398644273;
	}

	@OriginalMember(owner = "client!wm", name = "d", descriptor = "()I")
	int method32665() {
		return this.anInt5913 * -1398644273;
	}

	@OriginalMember(owner = "client!wm", name = "c", descriptor = "()I")
	int method32666() {
		return this.anInt5913 * -1398644273;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "()Z")
	public boolean method32667() {
		return this.anInt5914 * 1025677787 != -1;
	}

	@OriginalMember(owner = "client!wm", name = "f", descriptor = "(I)Z")
	public boolean method32668(@OriginalArg(0) int arg0) {
		return this.anInt5914 * 1025677787 != -1;
	}

	@OriginalMember(owner = "client!wm", name = "h", descriptor = "()Z")
	public boolean method32669() {
		return this.anInt5914 * 1025677787 != -1;
	}

	@OriginalMember(owner = "client!wm", name = "t", descriptor = "(I)I")
	public int method32670(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 / 10;
		return this.method32655(local3, (byte) 102);
	}

	@OriginalMember(owner = "client!wm", name = "g", descriptor = "(I)I")
	public int method32671(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = this.aClass634_2.method32493(arg0, 287768075) + this.anInt5915 * 1685798707;
		return local10 > this.anInt5912 * -1804127461 ? this.anInt5912 * -1804127461 : local10;
	}

	@OriginalMember(owner = "client!wm", name = "x", descriptor = "()I")
	public int method32672() {
		return this.anInt5911 * -381597677;
	}

	@OriginalMember(owner = "client!wm", name = "j", descriptor = "(I)I")
	public int method32673(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 / 10;
		return this.method32655(local3, (byte) 22);
	}

	@OriginalMember(owner = "client!wm", name = "i", descriptor = "(I)I")
	public int method32674(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = this.aClass634_2.method32493(arg0, -1596212169) + this.anInt5915 * 1685798707;
		return local10 > this.anInt5912 * -1804127461 ? this.anInt5912 * -1804127461 : local10;
	}

	@OriginalMember(owner = "client!wm", name = "ae", descriptor = "(I)I")
	int method32675(@OriginalArg(0) int arg0) {
		return this.method32657(arg0, (byte) 8) * 10;
	}

	@OriginalMember(owner = "client!wm", name = "ag", descriptor = "(I)I")
	int method32676(@OriginalArg(0) int arg0) {
		return this.method32657(arg0, (byte) 8) * 10;
	}
}
