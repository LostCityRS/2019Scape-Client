package com.jagex;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!adv")
public final class Class2_Sub1_Sub2 extends Class2_Sub1 implements Interface12 {

	@OriginalMember(owner = "client!adv", name = "e", descriptor = "Lclient!ej;")
	final Class243 aClass243_6 = new Class243(64);

	@OriginalMember(owner = "client!adv", name = "f", descriptor = "Lclient!pf;")
	final Class480 aClass480_13;

	@OriginalMember(owner = "client!adv", name = "lm", descriptor = "(III)V")
	static void method1852(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Class71.method18185(arg0, null, (byte) 100)) {
			Class286.method26901(Class709.aClass310Array1[arg0].aClass327Array2, arg1, 1559739494);
		}
	}

	@OriginalMember(owner = "client!adv", name = "mq", descriptor = "(B)V")
	public static void method1853(@OriginalArg(0) byte arg0) {
		@Pc(2) Class75 local2 = Class52.method1074(16777215);
		@Pc(8) Class80_Sub31 local8 = Class623.method32440(Class443.aClass443_94, local2.aClass22_1, -191270971);
		local8.aClass80_Sub36_Sub1_2.method23154(0, 1275868335);
		local2.method1325(local8, (byte) -87);
	}

	@OriginalMember(owner = "client!adv", name = "au", descriptor = "(IIB)V")
	static void method1854(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		@Pc(3) Class80_Sub1_Sub9 local3 = Class22.method545(14, 0L);
		local3.method22135(-457826299);
		local3.anInt3064 = arg0 * -1221031713;
		local3.anInt3047 = arg1 * 673180539;
	}

	@OriginalMember(owner = "client!adv", name = "<init>", descriptor = "(Lclient!zy;Lclient!qt;Lclient!zv;Lclient!pf;)V")
	public Class2_Sub1_Sub2(@OriginalArg(0) Class722 arg0, @OriginalArg(1) Class143 arg1, @OriginalArg(2) Class719 arg2, @OriginalArg(3) Class480 arg3) {
		super(arg0, arg1, arg2, arg3 == null ? 0 : arg3.method29929(arg1.method11823((byte) -83).anInt5690 * -1975739137, -561697017));
		this.aClass480_13 = arg3;
	}

	@OriginalMember(owner = "client!adv", name = "e", descriptor = "(I)Lclient!ae;")
	@Override
	public Interface11 method18053(@OriginalArg(0) int arg0) {
		@Pc(3) Class243 local3 = this.aClass243_6;
		synchronized (this.aClass243_6) {
			@Pc(11) Class107_Sub1 local11 = (Class107_Sub1) this.aClass243_6.method26282((long) arg0);
			if (local11 == null) {
				local11 = this.method1840(arg0, -1905544805);
				this.aClass243_6.method26253(local11, (long) arg0);
			}
			return local11;
		}
	}

	@OriginalMember(owner = "client!adv", name = "s", descriptor = "(II)Lclient!afi;")
	Class107_Sub1 method1840(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) byte[] local12 = this.aClass480_13.method29918(this.aClass143_3.method11823((byte) -128).anInt5690 * -1975739137, arg0, 1896589581);
		@Pc(19) Class107_Sub1 local19 = new Class107_Sub1(this.aClass143_3, arg0);
		if (local12 != null) {
			local19.method37006(new Class80_Sub36(local12), 1896589581);
		}
		return local19;
	}

	@OriginalMember(owner = "client!adv", name = "k", descriptor = "(S)V")
	public void method1841(@OriginalArg(0) short arg0) {
		@Pc(3) Class243 local3 = this.aClass243_6;
		synchronized (this.aClass243_6) {
			this.aClass243_6.method26256(1693912082);
		}
	}

	@OriginalMember(owner = "client!adv", name = "f", descriptor = "(I)I")
	@Override
	public int method18051(@OriginalArg(0) int arg0) {
		return super.method18051(-1439403572);
	}

	@OriginalMember(owner = "client!adv", name = "w", descriptor = "(I)V")
	public void method1842(@OriginalArg(0) int arg0) {
		@Pc(3) Class243 local3 = this.aClass243_6;
		synchronized (this.aClass243_6) {
			this.aClass243_6.method26259((byte) 3);
		}
	}

	@OriginalMember(owner = "client!adv", name = "iterator", descriptor = "()Ljava/util/Iterator;")
	@Override
	public Iterator iterator() {
		return new Class657(this);
	}

	@OriginalMember(owner = "client!adv", name = "r", descriptor = "(I)Lclient!afi;")
	Class107_Sub1 method1843(@OriginalArg(0) int arg0) {
		@Pc(12) byte[] local12 = this.aClass480_13.method29918(this.aClass143_3.method11823((byte) -72).anInt5690 * -1975739137, arg0, 1896589581);
		@Pc(19) Class107_Sub1 local19 = new Class107_Sub1(this.aClass143_3, arg0);
		if (local12 != null) {
			local19.method37006(new Class80_Sub36(local12), 1896589581);
		}
		return local19;
	}

	@OriginalMember(owner = "client!adv", name = "q", descriptor = "(I)Lclient!afi;")
	Class107_Sub1 method1844(@OriginalArg(0) int arg0) {
		@Pc(12) byte[] local12 = this.aClass480_13.method29918(this.aClass143_3.method11823((byte) -70).anInt5690 * -1975739137, arg0, 1896589581);
		@Pc(19) Class107_Sub1 local19 = new Class107_Sub1(this.aClass143_3, arg0);
		if (local12 != null) {
			local19.method37006(new Class80_Sub36(local12), 1896589581);
		}
		return local19;
	}

	@OriginalMember(owner = "client!adv", name = "u", descriptor = "(I)Lclient!ae;")
	@Override
	public Interface11 method18055(@OriginalArg(0) int arg0) {
		@Pc(3) Class243 local3 = this.aClass243_6;
		synchronized (this.aClass243_6) {
			@Pc(11) Class107_Sub1 local11 = (Class107_Sub1) this.aClass243_6.method26282((long) arg0);
			if (local11 == null) {
				local11 = this.method1840(arg0, 334498572);
				this.aClass243_6.method26253(local11, (long) arg0);
			}
			return local11;
		}
	}

	@OriginalMember(owner = "client!adv", name = "l", descriptor = "()I")
	@Override
	public int method18052() {
		return super.method18051(56209060);
	}

	@OriginalMember(owner = "client!adv", name = "o", descriptor = "()Ljava/util/Iterator;")
	public Iterator method1845() {
		return new Class657(this);
	}

	@OriginalMember(owner = "client!adv", name = "t", descriptor = "(II)Lclient!ae;")
	@Override
	public Interface11 method18054(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class243 local3 = this.aClass243_6;
		synchronized (this.aClass243_6) {
			@Pc(11) Class107_Sub1 local11 = (Class107_Sub1) this.aClass243_6.method26282((long) arg0);
			if (local11 == null) {
				local11 = this.method1840(arg0, 999074376);
				this.aClass243_6.method26253(local11, (long) arg0);
			}
			return local11;
		}
	}

	@OriginalMember(owner = "client!adv", name = "a", descriptor = "()Ljava/util/Iterator;")
	public Iterator method1846() {
		return new Class657(this);
	}

	@OriginalMember(owner = "client!adv", name = "j", descriptor = "()Ljava/util/Iterator;")
	public Iterator method1847() {
		return new Class657(this);
	}

	@OriginalMember(owner = "client!adv", name = "x", descriptor = "(II)V")
	public void method1848(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class243 local3 = this.aClass243_6;
		synchronized (this.aClass243_6) {
			this.aClass243_6.method26247(arg0, (byte) 103);
		}
	}

	@OriginalMember(owner = "client!adv", name = "h", descriptor = "()V")
	public void method1849() {
		@Pc(3) Class243 local3 = this.aClass243_6;
		synchronized (this.aClass243_6) {
			this.aClass243_6.method26256(1693912082);
		}
	}

	@OriginalMember(owner = "client!adv", name = "d", descriptor = "()V")
	public void method1850() {
		@Pc(3) Class243 local3 = this.aClass243_6;
		synchronized (this.aClass243_6) {
			this.aClass243_6.method26256(1693912082);
		}
	}

	@OriginalMember(owner = "client!adv", name = "z", descriptor = "()V")
	public void method1851() {
		@Pc(3) Class243 local3 = this.aClass243_6;
		synchronized (this.aClass243_6) {
			this.aClass243_6.method26259((byte) 3);
		}
	}
}
