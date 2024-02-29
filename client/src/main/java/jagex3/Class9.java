package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aag")
public final class Class9 {

	@OriginalMember(owner = "client!aag", name = "a", descriptor = "[Z")
	static boolean[] aBooleanArray1;

	@OriginalMember(owner = "client!aag", name = "e", descriptor = "I")
	int anInt22;

	@OriginalMember(owner = "client!aag", name = "n", descriptor = "I")
	int anInt23;

	@OriginalMember(owner = "client!aag", name = "m", descriptor = "Z")
	boolean aBoolean3;

	@OriginalMember(owner = "client!aag", name = "k", descriptor = "Z")
	boolean aBoolean4;

	@OriginalMember(owner = "client!aag", name = "f", descriptor = "Z")
	boolean aBoolean5;

	@OriginalMember(owner = "client!aag", name = "e", descriptor = "(B)[Lclient!adr;")
	static Class89[] method152(@OriginalArg(0) byte arg0) {
		return new Class89[] { Class89.aClass89_28, Class89.aClass89_30, Class89.aClass89_18, Class89.aClass89_21, Class89.aClass89_26, Class89.aClass89_24, Class89.aClass89_6, Class89.aClass89_4, Class89.aClass89_23, Class89.aClass89_15, Class89.aClass89_1, Class89.aClass89_29, Class89.aClass89_11, Class89.aClass89_27, Class89.aClass89_17, Class89.aClass89_14, Class89.aClass89_13, Class89.aClass89_5, Class89.aClass89_20, Class89.aClass89_25, Class89.aClass89_31, Class89.aClass89_8, Class89.aClass89_2, Class89.aClass89_3, Class89.aClass89_10, Class89.aClass89_7, Class89.aClass89_9, Class89.aClass89_16, Class89.aClass89_12, Class89.aClass89_19, Class89.aClass89_22 };
	}

	@OriginalMember(owner = "client!aag", name = "gp", descriptor = "(Lclient!yf;B)V")
	static void method153(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class30.method626(local11, local14, arg0, -1654773216);
	}

	@OriginalMember(owner = "client!aag", name = "<init>", descriptor = "(IIZZZ)V")
	Class9(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt22 = arg0 * 1883479437;
		this.anInt23 = arg1 * 13086757;
		this.aBoolean3 = arg2;
		this.aBoolean4 = arg3;
		this.aBoolean5 = arg4;
	}

	@OriginalMember(owner = "client!aag", name = "z", descriptor = "()Z")
	public boolean method137() {
		return this.aBoolean3;
	}

	@OriginalMember(owner = "client!aag", name = "e", descriptor = "(B)I")
	public int method138(@OriginalArg(0) byte arg0) {
		return this.anInt22 * -2108166843;
	}

	@OriginalMember(owner = "client!aag", name = "m", descriptor = "(I)Z")
	public boolean method139(@OriginalArg(0) int arg0) {
		return this.aBoolean3;
	}

	@OriginalMember(owner = "client!aag", name = "k", descriptor = "(I)Z")
	public boolean method140(@OriginalArg(0) int arg0) {
		return this.aBoolean4;
	}

	@OriginalMember(owner = "client!aag", name = "n", descriptor = "(I)I")
	public int method141(@OriginalArg(0) int arg0) {
		return this.anInt23 * 338488237;
	}

	@OriginalMember(owner = "client!aag", name = "d", descriptor = "()Z")
	public boolean method142() {
		return this.aBoolean4;
	}

	@OriginalMember(owner = "client!aag", name = "l", descriptor = "()I")
	public int method143() {
		return this.anInt22 * -2108166843;
	}

	@OriginalMember(owner = "client!aag", name = "u", descriptor = "()I")
	public int method144() {
		return this.anInt23 * 338488237;
	}

	@OriginalMember(owner = "client!aag", name = "o", descriptor = "()Z")
	public boolean method145() {
		return this.aBoolean5;
	}

	@OriginalMember(owner = "client!aag", name = "f", descriptor = "(I)Z")
	public boolean method146(@OriginalArg(0) int arg0) {
		return this.aBoolean5;
	}

	@OriginalMember(owner = "client!aag", name = "v", descriptor = "()Z")
	public boolean method147() {
		return this.aBoolean5;
	}

	@OriginalMember(owner = "client!aag", name = "c", descriptor = "()Z")
	public boolean method148() {
		return this.aBoolean4;
	}

	@OriginalMember(owner = "client!aag", name = "w", descriptor = "()I")
	public int method149() {
		return this.anInt22 * -2108166843;
	}

	@OriginalMember(owner = "client!aag", name = "p", descriptor = "()Z")
	public boolean method150() {
		return this.aBoolean3;
	}

	@OriginalMember(owner = "client!aag", name = "r", descriptor = "()Z")
	public boolean method151() {
		return this.aBoolean5;
	}
}
