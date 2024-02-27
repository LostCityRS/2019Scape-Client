package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ny")
public final class Class452 implements Interface75 {

	@OriginalMember(owner = "client!ny", name = "t", descriptor = "Lclient!ny;")
	static final Class452 aClass452_4 = new Class452(0, -1, true, false, true);

	@OriginalMember(owner = "client!ny", name = "f", descriptor = "Lclient!ny;")
	static final Class452 aClass452_2 = new Class452(1, 0, true, true, true);

	@OriginalMember(owner = "client!ny", name = "e", descriptor = "Lclient!ny;")
	static final Class452 aClass452_3 = new Class452(2, 1, true, true, false);

	@OriginalMember(owner = "client!ny", name = "u", descriptor = "Lclient!ny;")
	static final Class452 aClass452_9 = new Class452(3, 8, false, true, true);

	@OriginalMember(owner = "client!ny", name = "l", descriptor = "Lclient!ny;")
	static final Class452 aClass452_5 = new Class452(4, 9, false, false, true);

	@OriginalMember(owner = "client!ny", name = "g", descriptor = "Lclient!ny;")
	static final Class452 aClass452_10 = new Class452(5, 10, false, true, true);

	@OriginalMember(owner = "client!ny", name = "i", descriptor = "Lclient!ny;")
	static final Class452 aClass452_6 = new Class452(6, 11, false, false, true);

	@OriginalMember(owner = "client!ny", name = "m", descriptor = "Lclient!ny;")
	static final Class452 aClass452_8 = new Class452(7, 12, false, false, true);

	@OriginalMember(owner = "client!ny", name = "o", descriptor = "Lclient!ny;")
	static final Class452 aClass452_7 = new Class452(8, 13, false, false, true);

	@OriginalMember(owner = "client!ny", name = "j", descriptor = "I")
	final int anInt4892;

	@OriginalMember(owner = "client!ny", name = "a", descriptor = "I")
	public final int anInt4893;

	@OriginalMember(owner = "client!ny", name = "s", descriptor = "Z")
	public final boolean aBoolean874;

	@OriginalMember(owner = "client!ny", name = "k", descriptor = "Z")
	public final boolean aBoolean875;

	@OriginalMember(owner = "client!ny", name = "t", descriptor = "(I)[Lclient!ny;")
	public static Class452[] method29284(@OriginalArg(0) int arg0) {
		return new Class452[] { aClass452_2, aClass452_5, aClass452_3, aClass452_7, aClass452_6, aClass452_4, aClass452_8, aClass452_10, aClass452_9 };
	}

	@OriginalMember(owner = "client!ny", name = "e", descriptor = "()[Lclient!ny;")
	public static Class452[] method29285() {
		return new Class452[] { aClass452_2, aClass452_5, aClass452_3, aClass452_7, aClass452_6, aClass452_4, aClass452_8, aClass452_10, aClass452_9 };
	}

	@OriginalMember(owner = "client!ny", name = "u", descriptor = "()[Lclient!ny;")
	public static Class452[] method29286() {
		return new Class452[] { aClass452_2, aClass452_5, aClass452_3, aClass452_7, aClass452_6, aClass452_4, aClass452_8, aClass452_10, aClass452_9 };
	}

	@OriginalMember(owner = "client!ny", name = "u", descriptor = "(IS)I")
	static int method29287(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1) {
		return arg0 < 7 ? 8 : 11;
	}

	@OriginalMember(owner = "client!ny", name = "ip", descriptor = "(Lclient!yp;I)V")
	static void method29288(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class615.method32283(local11, local14, arg0, 2100912231);
	}

	@OriginalMember(owner = "client!ny", name = "<init>", descriptor = "(IIZZZ)V")
	Class452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt4892 = arg0 * -1804736617;
		this.anInt4893 = arg1 * 2099087497;
		this.aBoolean874 = arg3;
		this.aBoolean875 = arg4;
	}

	@OriginalMember(owner = "client!ny", name = "f", descriptor = "()I")
	@Override
	public int getId() {
		return this.anInt4892 * 1422067751;
	}

	@OriginalMember(owner = "client!ny", name = "g", descriptor = "()I")
	@Override
	public int method37267() {
		return this.anInt4892 * 1422067751;
	}

	@OriginalMember(owner = "client!ny", name = "i", descriptor = "()I")
	@Override
	public int method37269() {
		return this.anInt4892 * 1422067751;
	}
}
