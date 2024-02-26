package com.jagex;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!adh")
public final class Class2_Sub1_Sub1 extends Class2_Sub1 implements Interface12 {

	@OriginalMember(owner = "client!adh", name = "e", descriptor = "Lclient!ej;")
	final Class243 aClass243_5 = new Class243(64);

	@OriginalMember(owner = "client!adh", name = "f", descriptor = "Lclient!pf;")
	final Class480 aClass480_11;

	@OriginalMember(owner = "client!adh", name = "t", descriptor = "(Lclient!di;Lclient!hx;I)V")
	static void method1537(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class327 arg1, @OriginalArg(2) int arg2) {
		@Pc(37) boolean local37 = Class25.aClass41_Sub9_1.method17334(arg0, arg1.anInt4167 * 1052460537, arg1.anInt4141 * 857016887, arg1.anInt4118 * -971113929, arg1.anInt4096 * -449602255 | 0xFF000000, arg1.anInt4134 * -555154585, arg1.aBoolean816 ? Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aClass672_1 : null, 2023198737) == null;
		if (local37) {
			Class175.aClass8_43.method232(new Class80_Sub10(arg1.anInt4167 * 1052460537, arg1.anInt4141 * 857016887, arg1.anInt4118 * -971113929, arg1.anInt4096 * -449602255 | 0xFF000000, arg1.anInt4134 * -555154585, arg1.aBoolean816), 1720895619);
			Class296.method26998(arg1, -2103003616);
		}
	}

	@OriginalMember(owner = "client!adh", name = "<init>", descriptor = "(Lclient!zy;Lclient!qt;Lclient!zv;Lclient!pf;)V")
	public Class2_Sub1_Sub1(@OriginalArg(0) Class722 arg0, @OriginalArg(1) Class143 arg1, @OriginalArg(2) Class719 arg2, @OriginalArg(3) Class480 arg3) {
		super(arg0, arg1, arg2, arg3 == null ? 0 : arg3.method29929(arg1.method11823((byte) -24).anInt5690 * -1975739137, -561697017));
		this.aClass480_11 = arg3;
	}

	@OriginalMember(owner = "client!adh", name = "s", descriptor = "(IB)Lclient!aft;")
	Class107_Sub2 method1526(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) byte[] local12 = this.aClass480_11.method29918(this.aClass143_3.method11823((byte) -10).anInt5690 * -1975739137, arg0, 1896589581);
		@Pc(19) Class107_Sub2 local19 = new Class107_Sub2(this.aClass143_3, arg0);
		if (local12 != null) {
			local19.method37006(new Class80_Sub36(local12), 1896589581);
		}
		return local19;
	}

	@OriginalMember(owner = "client!adh", name = "t", descriptor = "(II)Lclient!ae;")
	@Override
	public Interface11 method18054(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class243 local3 = this.aClass243_5;
		synchronized (this.aClass243_5) {
			@Pc(11) Class107_Sub2 local11 = (Class107_Sub2) this.aClass243_5.method26282((long) arg0);
			if (local11 == null) {
				local11 = this.method1526(arg0, (byte) 21);
				this.aClass243_5.method26253(local11, (long) arg0);
			}
			return local11;
		}
	}

	@OriginalMember(owner = "client!adh", name = "d", descriptor = "(I)V")
	public void method1527(@OriginalArg(0) int arg0) {
		@Pc(3) Class243 local3 = this.aClass243_5;
		synchronized (this.aClass243_5) {
			this.aClass243_5.method26247(arg0, (byte) 97);
		}
	}

	@OriginalMember(owner = "client!adh", name = "k", descriptor = "(I)V")
	public void method1528(@OriginalArg(0) int arg0) {
		@Pc(3) Class243 local3 = this.aClass243_5;
		synchronized (this.aClass243_5) {
			this.aClass243_5.method26256(1693912082);
		}
	}

	@OriginalMember(owner = "client!adh", name = "x", descriptor = "(II)V")
	public void method1529(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class243 local3 = this.aClass243_5;
		synchronized (this.aClass243_5) {
			this.aClass243_5.method26247(arg0, (byte) 54);
		}
	}

	@OriginalMember(owner = "client!adh", name = "iterator", descriptor = "()Ljava/util/Iterator;")
	@Override
	public Iterator iterator() {
		return new Class291(this);
	}

	@OriginalMember(owner = "client!adh", name = "q", descriptor = "(I)V")
	public void method1530(@OriginalArg(0) int arg0) {
		@Pc(3) Class243 local3 = this.aClass243_5;
		synchronized (this.aClass243_5) {
			this.aClass243_5.method26247(arg0, (byte) 95);
		}
	}

	@OriginalMember(owner = "client!adh", name = "e", descriptor = "(I)Lclient!ae;")
	@Override
	public Interface11 method18053(@OriginalArg(0) int arg0) {
		@Pc(3) Class243 local3 = this.aClass243_5;
		synchronized (this.aClass243_5) {
			@Pc(11) Class107_Sub2 local11 = (Class107_Sub2) this.aClass243_5.method26282((long) arg0);
			if (local11 == null) {
				local11 = this.method1526(arg0, (byte) 23);
				this.aClass243_5.method26253(local11, (long) arg0);
			}
			return local11;
		}
	}

	@OriginalMember(owner = "client!adh", name = "u", descriptor = "(I)Lclient!ae;")
	@Override
	public Interface11 method18055(@OriginalArg(0) int arg0) {
		@Pc(3) Class243 local3 = this.aClass243_5;
		synchronized (this.aClass243_5) {
			@Pc(11) Class107_Sub2 local11 = (Class107_Sub2) this.aClass243_5.method26282((long) arg0);
			if (local11 == null) {
				local11 = this.method1526(arg0, (byte) 18);
				this.aClass243_5.method26253(local11, (long) arg0);
			}
			return local11;
		}
	}

	@OriginalMember(owner = "client!adh", name = "l", descriptor = "()I")
	@Override
	public int method18052() {
		return super.method18051(-589966876);
	}

	@OriginalMember(owner = "client!adh", name = "o", descriptor = "()Ljava/util/Iterator;")
	public Iterator method1531() {
		return new Class291(this);
	}

	@OriginalMember(owner = "client!adh", name = "a", descriptor = "()Ljava/util/Iterator;")
	public Iterator method1532() {
		return new Class291(this);
	}

	@OriginalMember(owner = "client!adh", name = "h", descriptor = "(I)V")
	public void method1533(@OriginalArg(0) int arg0) {
		@Pc(3) Class243 local3 = this.aClass243_5;
		synchronized (this.aClass243_5) {
			this.aClass243_5.method26247(arg0, (byte) 116);
		}
	}

	@OriginalMember(owner = "client!adh", name = "f", descriptor = "(I)I")
	@Override
	public int method18051(@OriginalArg(0) int arg0) {
		return super.method18051(-1452307810);
	}

	@OriginalMember(owner = "client!adh", name = "r", descriptor = "()V")
	public void method1534() {
		@Pc(3) Class243 local3 = this.aClass243_5;
		synchronized (this.aClass243_5) {
			this.aClass243_5.method26256(1693912082);
		}
	}

	@OriginalMember(owner = "client!adh", name = "j", descriptor = "()Ljava/util/Iterator;")
	public Iterator method1535() {
		return new Class291(this);
	}

	@OriginalMember(owner = "client!adh", name = "w", descriptor = "(I)V")
	public void method1536(@OriginalArg(0) int arg0) {
		@Pc(3) Class243 local3 = this.aClass243_5;
		synchronized (this.aClass243_5) {
			this.aClass243_5.method26259((byte) 3);
		}
	}
}
