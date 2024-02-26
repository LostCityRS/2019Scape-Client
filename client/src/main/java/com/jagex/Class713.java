package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!zo")
public final class Class713 implements Interface75 {

	@OriginalMember(owner = "client!zo", name = "t", descriptor = "Lclient!zo;")
	public static final Class713 aClass713_5 = new Class713(-2);

	@OriginalMember(owner = "client!zo", name = "f", descriptor = "Lclient!zo;")
	public static final Class713 aClass713_3 = new Class713(-3);

	@OriginalMember(owner = "client!zo", name = "e", descriptor = "Lclient!zo;")
	static final Class713 aClass713_6 = new Class713(2);

	@OriginalMember(owner = "client!zo", name = "u", descriptor = "Lclient!zo;")
	public static final Class713 aClass713_4 = new Class713(3);

	@OriginalMember(owner = "client!zo", name = "l", descriptor = "Lclient!zo;")
	static final Class713 aClass713_10 = new Class713(4);

	@OriginalMember(owner = "client!zo", name = "g", descriptor = "Lclient!zo;")
	static final Class713 aClass713_2 = new Class713(5);

	@OriginalMember(owner = "client!zo", name = "i", descriptor = "Lclient!zo;")
	static final Class713 aClass713_7 = new Class713(6);

	@OriginalMember(owner = "client!zo", name = "m", descriptor = "Lclient!zo;")
	static final Class713 aClass713_8 = new Class713(7);

	@OriginalMember(owner = "client!zo", name = "o", descriptor = "Lclient!zo;")
	static final Class713 aClass713_9 = new Class713(8);

	@OriginalMember(owner = "client!zo", name = "j", descriptor = "I")
	final int anInt5824;

	@OriginalMember(owner = "client!zo", name = "l", descriptor = "()[Lclient!zo;")
	public static Class713[] method37184() {
		return new Class713[] { aClass713_2, aClass713_3, aClass713_6, aClass713_7, aClass713_5, aClass713_10, aClass713_9, aClass713_8, aClass713_4 };
	}

	@OriginalMember(owner = "client!zo", name = "e", descriptor = "()[Lclient!zo;")
	public static Class713[] method37185() {
		return new Class713[] { aClass713_2, aClass713_3, aClass713_6, aClass713_7, aClass713_5, aClass713_10, aClass713_9, aClass713_8, aClass713_4 };
	}

	@OriginalMember(owner = "client!zo", name = "u", descriptor = "()[Lclient!zo;")
	public static Class713[] method37186() {
		return new Class713[] { aClass713_2, aClass713_3, aClass713_6, aClass713_7, aClass713_5, aClass713_10, aClass713_9, aClass713_8, aClass713_4 };
	}

	@OriginalMember(owner = "client!zo", name = "m", descriptor = "()[Lclient!zo;")
	public static Class713[] method37187() {
		return new Class713[] { aClass713_2, aClass713_3, aClass713_6, aClass713_7, aClass713_5, aClass713_10, aClass713_9, aClass713_8, aClass713_4 };
	}

	@OriginalMember(owner = "client!zo", name = "<init>", descriptor = "(I)V")
	Class713(@OriginalArg(0) int arg0) {
		this.anInt5824 = arg0 * 1879906121;
	}

	@OriginalMember(owner = "client!zo", name = "i", descriptor = "()I")
	@Override
	public int method37269() {
		return this.anInt5824 * -1409316103;
	}

	@OriginalMember(owner = "client!zo", name = "g", descriptor = "()I")
	@Override
	public int method37267() {
		return this.anInt5824 * -1409316103;
	}

	@OriginalMember(owner = "client!zo", name = "f", descriptor = "()I")
	@Override
	public int method37268() {
		return this.anInt5824 * -1409316103;
	}
}
