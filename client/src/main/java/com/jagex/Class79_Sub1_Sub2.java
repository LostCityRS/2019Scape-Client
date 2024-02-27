package com.jagex;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!adm")
public final class Class79_Sub1_Sub2 extends Class79_Sub1 implements Interface11 {

	@OriginalMember(owner = "client!adm", name = "b", descriptor = "[[[S")
	public static short[][][] aShortArrayArrayArray1;

	@OriginalMember(owner = "client!adm", name = "m", descriptor = "Lclient!eb;")
	final Class240 aClass240_6 = new Class240(64);

	@OriginalMember(owner = "client!adm", name = "n", descriptor = "Lclient!py;")
	final Class497 aClass497_14;

	@OriginalMember(owner = "client!adm", name = "jq", descriptor = "(I)V")
	static void method1489(@OriginalArg(0) int arg0) {
		Class642.aClass312Array5 = null;
		Class660.method33005(client.anInt3526 * -703563959, 0, 0, client.anInt3408 * -1378711501, client.anInt3416 * 2091353777, 0, 0, -1, 739901381);
		if (Class642.aClass312Array5 != null) {
			Class485.method29983(Class642.aClass312Array5, -1412584499, 0, 0, client.anInt3408 * -1378711501, client.anInt3416 * 2091353777, Class511.anInt5369 * 544640871, Exception_Sub4.anInt2489 * 729048639, client.aClass312_3 == Class255.aClass312_8 ? -1 : -2101991717 * client.aClass312_3.anInt4010, true, -1900803929);
			Class642.aClass312Array5 = null;
		}
	}

	@OriginalMember(owner = "client!adm", name = "<init>", descriptor = "(Lclient!zd;Lclient!qe;Lclient!zt;Lclient!py;)V")
	public Class79_Sub1_Sub2(@OriginalArg(0) Class702 arg0, @OriginalArg(1) Class138 arg1, @OriginalArg(2) Class717 arg2, @OriginalArg(3) Class497 arg3) {
		super(arg0, arg1, arg2, arg3 == null ? 0 : arg3.method30243(arg1.method11528((byte) 31).anInt6010 * -1772702343, 942596941));
		this.aClass497_14 = arg3;
	}

	@OriginalMember(owner = "client!adm", name = "e", descriptor = "(II)Lclient!ay;")
	@Override
	public Interface13 method18273(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class240 local3 = this.aClass240_6;
		synchronized (this.aClass240_6) {
			@Pc(11) Class108_Sub2 local11 = (Class108_Sub2) this.aClass240_6.method25932((long) arg0);
			if (local11 == null) {
				local11 = this.method1474(arg0, (byte) 108);
				this.aClass240_6.method25923(local11, (long) arg0);
			}
			return local11;
		}
	}

	@OriginalMember(owner = "client!adm", name = "k", descriptor = "(I)Lclient!ay;")
	@Override
	public Interface13 method18277(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_6;
		synchronized (this.aClass240_6) {
			@Pc(11) Class108_Sub2 local11 = (Class108_Sub2) this.aClass240_6.method25932((long) arg0);
			if (local11 == null) {
				local11 = this.method1474(arg0, (byte) 91);
				this.aClass240_6.method25923(local11, (long) arg0);
			}
			return local11;
		}
	}

	@OriginalMember(owner = "client!adm", name = "r", descriptor = "(IB)Lclient!afv;")
	Class108_Sub2 method1474(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) byte[] local12 = this.aClass497_14.method30225(this.aClass138_3.method11528((byte) 106).anInt6010 * -1772702343, arg0, (byte) 0);
		@Pc(19) Class108_Sub2 local19 = new Class108_Sub2(this.aClass138_3, arg0);
		if (local12 != null) {
			local19.method36835(new Class93_Sub41(local12), (byte) 10);
		}
		return local19;
	}

	@OriginalMember(owner = "client!adm", name = "iterator", descriptor = "()Ljava/util/Iterator;")
	@Override
	public Iterator iterator() {
		return new Class665(this);
	}

	@OriginalMember(owner = "client!adm", name = "i", descriptor = "()V")
	public void method1475() {
		@Pc(3) Class240 local3 = this.aClass240_6;
		synchronized (this.aClass240_6) {
			this.aClass240_6.method25930(1161602830);
		}
	}

	@OriginalMember(owner = "client!adm", name = "s", descriptor = "(I)V")
	public void method1476(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_6;
		synchronized (this.aClass240_6) {
			this.aClass240_6.method25930(1161602830);
		}
	}

	@OriginalMember(owner = "client!adm", name = "n", descriptor = "(I)I")
	@Override
	public int method18274(@OriginalArg(0) int arg0) {
		return super.method18274(715455253);
	}

	@OriginalMember(owner = "client!adm", name = "b", descriptor = "()V")
	public void method1477() {
		@Pc(3) Class240 local3 = this.aClass240_6;
		synchronized (this.aClass240_6) {
			this.aClass240_6.method25926((byte) -23);
		}
	}

	@OriginalMember(owner = "client!adm", name = "w", descriptor = "()I")
	@Override
	public int method18278() {
		return super.method18274(1618522222);
	}

	@OriginalMember(owner = "client!adm", name = "f", descriptor = "()I")
	@Override
	public int method18275() {
		return super.method18274(1720960861);
	}

	@OriginalMember(owner = "client!adm", name = "y", descriptor = "(I)Lclient!afv;")
	Class108_Sub2 method1478(@OriginalArg(0) int arg0) {
		@Pc(12) byte[] local12 = this.aClass497_14.method30225(this.aClass138_3.method11528((byte) 35).anInt6010 * -1772702343, arg0, (byte) 0);
		@Pc(19) Class108_Sub2 local19 = new Class108_Sub2(this.aClass138_3, arg0);
		if (local12 != null) {
			local19.method36835(new Class93_Sub41(local12), (byte) -10);
		}
		return local19;
	}

	@OriginalMember(owner = "client!adm", name = "m", descriptor = "(I)Lclient!ay;")
	@Override
	public Interface13 method18276(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_6;
		synchronized (this.aClass240_6) {
			@Pc(11) Class108_Sub2 local11 = (Class108_Sub2) this.aClass240_6.method25932((long) arg0);
			if (local11 == null) {
				local11 = this.method1474(arg0, (byte) 83);
				this.aClass240_6.method25923(local11, (long) arg0);
			}
			return local11;
		}
	}

	@OriginalMember(owner = "client!adm", name = "p", descriptor = "()Ljava/util/Iterator;")
	public Iterator method1479() {
		return new Class665(this);
	}

	@OriginalMember(owner = "client!adm", name = "d", descriptor = "()Ljava/util/Iterator;")
	public Iterator method1480() {
		return new Class665(this);
	}

	@OriginalMember(owner = "client!adm", name = "c", descriptor = "()Ljava/util/Iterator;")
	public Iterator method1481() {
		return new Class665(this);
	}

	@OriginalMember(owner = "client!adm", name = "o", descriptor = "(II)V")
	public void method1482(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class240 local3 = this.aClass240_6;
		synchronized (this.aClass240_6) {
			this.aClass240_6.method25925(arg0, (byte) 30);
		}
	}

	@OriginalMember(owner = "client!adm", name = "q", descriptor = "(I)Lclient!afv;")
	Class108_Sub2 method1483(@OriginalArg(0) int arg0) {
		@Pc(12) byte[] local12 = this.aClass497_14.method30225(this.aClass138_3.method11528((byte) 108).anInt6010 * -1772702343, arg0, (byte) 0);
		@Pc(19) Class108_Sub2 local19 = new Class108_Sub2(this.aClass138_3, arg0);
		if (local12 != null) {
			local19.method36835(new Class93_Sub41(local12), (byte) -39);
		}
		return local19;
	}

	@OriginalMember(owner = "client!adm", name = "x", descriptor = "(I)Lclient!afv;")
	Class108_Sub2 method1484(@OriginalArg(0) int arg0) {
		@Pc(12) byte[] local12 = this.aClass497_14.method30225(this.aClass138_3.method11528((byte) 68).anInt6010 * -1772702343, arg0, (byte) 0);
		@Pc(19) Class108_Sub2 local19 = new Class108_Sub2(this.aClass138_3, arg0);
		if (local12 != null) {
			local19.method36835(new Class93_Sub41(local12), (byte) 17);
		}
		return local19;
	}

	@OriginalMember(owner = "client!adm", name = "v", descriptor = "(I)V")
	public void method1485(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_6;
		synchronized (this.aClass240_6) {
			this.aClass240_6.method25926((byte) -70);
		}
	}

	@OriginalMember(owner = "client!adm", name = "h", descriptor = "(I)V")
	public void method1486(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_6;
		synchronized (this.aClass240_6) {
			this.aClass240_6.method25925(arg0, (byte) 12);
		}
	}

	@OriginalMember(owner = "client!adm", name = "a", descriptor = "()V")
	public void method1487() {
		@Pc(3) Class240 local3 = this.aClass240_6;
		synchronized (this.aClass240_6) {
			this.aClass240_6.method25930(1161602830);
		}
	}

	@OriginalMember(owner = "client!adm", name = "g", descriptor = "()V")
	public void method1488() {
		@Pc(3) Class240 local3 = this.aClass240_6;
		synchronized (this.aClass240_6) {
			this.aClass240_6.method25930(1161602830);
		}
	}

	@OriginalMember(owner = "client!adm", name = "l", descriptor = "()I")
	@Override
	public int method18279() {
		return super.method18274(458417122);
	}
}
