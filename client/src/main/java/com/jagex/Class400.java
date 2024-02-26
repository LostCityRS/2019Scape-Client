package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public final class Class400 {

	@OriginalMember(owner = "client!lo", name = "x", descriptor = "I")
	static final int anInt4569 = 16;

	@OriginalMember(owner = "client!lo", name = "t", descriptor = "Lclient!lo;")
	public static final Class400 aClass400_11 = new Class400(7, 0, 3, Class236.aClass236_26);

	@OriginalMember(owner = "client!lo", name = "f", descriptor = "Lclient!lo;")
	public static final Class400 aClass400_2 = new Class400(3, 1, 3, Class236.aClass236_26);

	@OriginalMember(owner = "client!lo", name = "e", descriptor = "Lclient!lo;")
	public static final Class400 aClass400_3 = new Class400(0, 2, 4, Class236.aClass236_21);

	@OriginalMember(owner = "client!lo", name = "u", descriptor = "Lclient!lo;")
	public static final Class400 aClass400_4 = new Class400(6, 3, 1, Class236.aClass236_26);

	@OriginalMember(owner = "client!lo", name = "l", descriptor = "Lclient!lo;")
	public static final Class400 aClass400_1 = new Class400(9, 4, 2, Class236.aClass236_26);

	@OriginalMember(owner = "client!lo", name = "g", descriptor = "Lclient!lo;")
	public static final Class400 aClass400_5 = new Class400(4, 5, 3, Class236.aClass236_26);

	@OriginalMember(owner = "client!lo", name = "i", descriptor = "Lclient!lo;")
	public static final Class400 aClass400_6 = new Class400(1, 6, 4, Class236.aClass236_26);

	@OriginalMember(owner = "client!lo", name = "m", descriptor = "Lclient!lo;")
	static final Class400 aClass400_12 = new Class400(5, 7, 4, Class236.aClass236_26);

	@OriginalMember(owner = "client!lo", name = "o", descriptor = "Lclient!lo;")
	static final Class400 aClass400_7 = new Class400(11, 8, 4, Class236.aClass236_26);

	@OriginalMember(owner = "client!lo", name = "j", descriptor = "Lclient!lo;")
	static final Class400 aClass400_8 = new Class400(2, 9, 4, Class236.aClass236_26);

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "Lclient!lo;")
	static final Class400 aClass400_9 = new Class400(8, 10, 3, Class236.aClass236_26);

	@OriginalMember(owner = "client!lo", name = "s", descriptor = "Lclient!lo;")
	static final Class400 aClass400_10 = new Class400(10, 11, 3, Class236.aClass236_26);

	@OriginalMember(owner = "client!lo", name = "w", descriptor = "I")
	static final int anInt4570 = Class702.method37107(16, 221154893);

	@OriginalMember(owner = "client!lo", name = "k", descriptor = "I")
	public final int anInt4567;

	@OriginalMember(owner = "client!lo", name = "r", descriptor = "I")
	final int anInt4571;

	@OriginalMember(owner = "client!lo", name = "h", descriptor = "I")
	final int anInt4568;

	@OriginalMember(owner = "client!lo", name = "d", descriptor = "Lclient!dy;")
	final Class236 aClass236_28;

	@OriginalMember(owner = "client!lo", name = "q", descriptor = "I")
	public final int anInt4572;

	@OriginalMember(owner = "client!lo", name = "t", descriptor = "(I)Lclient!lo;")
	static Class400 method28841(@OriginalArg(0) int arg0) {
		switch(arg0) {
			case 0:
				return aClass400_11;
			case 1:
				return aClass400_2;
			case 2:
				return aClass400_3;
			case 3:
				return aClass400_4;
			case 4:
				return aClass400_1;
			case 5:
				return aClass400_5;
			case 6:
				return aClass400_6;
			default:
				return null;
		}
	}

	@OriginalMember(owner = "client!lo", name = "f", descriptor = "(I)Lclient!lo;")
	static Class400 method28842(@OriginalArg(0) int arg0) {
		switch(arg0) {
			case 0:
				return aClass400_11;
			case 1:
				return aClass400_2;
			case 2:
				return aClass400_3;
			case 3:
				return aClass400_4;
			case 4:
				return aClass400_1;
			case 5:
				return aClass400_5;
			case 6:
				return aClass400_6;
			default:
				return null;
		}
	}

	@OriginalMember(owner = "client!lo", name = "e", descriptor = "(I)Lclient!lo;")
	static Class400 method28843(@OriginalArg(0) int arg0) {
		switch(arg0) {
			case 0:
				return aClass400_11;
			case 1:
				return aClass400_2;
			case 2:
				return aClass400_3;
			case 3:
				return aClass400_4;
			case 4:
				return aClass400_1;
			case 5:
				return aClass400_5;
			case 6:
				return aClass400_6;
			default:
				return null;
		}
	}

	@OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(IIILclient!dy;)V")
	Class400(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class236 arg3) {
		this.anInt4567 = arg0;
		this.anInt4571 = arg1;
		this.anInt4568 = arg2;
		this.aClass236_28 = arg3;
		this.anInt4572 = this.anInt4568 * this.aClass236_28.anInt3804 * -369125885;
		if (this.anInt4571 >= 16) {
			throw new RuntimeException();
		}
	}
}
