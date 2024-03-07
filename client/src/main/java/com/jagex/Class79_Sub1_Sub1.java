package com.jagex;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!adj")
public class Class79_Sub1_Sub1 extends Class79_Sub1 implements Interface11 {

	@OriginalMember(owner = "client!adj", name = "s", descriptor = "I")
	public static int anInt255;

	@OriginalMember(owner = "client!adj", name = "m", descriptor = "Lclient!eb;")
	final Class240 aClass240_5 = new Class240(64);

	@OriginalMember(owner = "client!adj", name = "n", descriptor = "Lclient!py;")
	final Class497 aClass497_13;

	@OriginalMember(owner = "client!adj", name = "<init>", descriptor = "(Lclient!zd;Lclient!qe;Lclient!zt;Lclient!py;)V", line = 18)
	public Class79_Sub1_Sub1(@OriginalArg(0) Class702 arg0, @OriginalArg(1) Class138 arg1, @OriginalArg(2) Class717 arg2, @OriginalArg(3) Class497 arg3) {
		super(arg0, arg1, arg2, arg3 == null ? 0 : arg3.method30084(arg1.method11524((byte) 98).anInt5849 * -1772702343, 184745896));
		this.aClass497_13 = arg3;
	}

	@OriginalMember(owner = "client!adj", name = "k", descriptor = "(I)Lclient!ay;", line = 24)
	@Override
	public Interface13 method18265(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_5;
		synchronized (this.aClass240_5) {
			@Pc(11) Class108_Sub1 local11 = (Class108_Sub1) this.aClass240_5.method25829((long) arg0);
			if (local11 == null) {
				local11 = this.method1419(arg0, -2138706370);
				this.aClass240_5.method25838(local11, (long) arg0);
			}
			return local11;
		}
	}

	@OriginalMember(owner = "client!adj", name = "e", descriptor = "(II)Lclient!ay;", line = 24)
	@Override
	public Interface13 get(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class240 local3 = this.aClass240_5;
		synchronized (this.aClass240_5) {
			@Pc(11) Class108_Sub1 local11 = (Class108_Sub1) this.aClass240_5.method25829((long) arg0);
			if (local11 == null) {
				local11 = this.method1419(arg0, -1727528637);
				this.aClass240_5.method25838(local11, (long) arg0);
			}
			return local11;
		}
	}

	@OriginalMember(owner = "client!adj", name = "m", descriptor = "(I)Lclient!ay;", line = 24)
	@Override
	public Interface13 method18264(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_5;
		synchronized (this.aClass240_5) {
			@Pc(11) Class108_Sub1 local11 = (Class108_Sub1) this.aClass240_5.method25829((long) arg0);
			if (local11 == null) {
				local11 = this.method1419(arg0, -1736739708);
				this.aClass240_5.method25838(local11, (long) arg0);
			}
			return local11;
		}
	}

	@OriginalMember(owner = "client!adj", name = "q", descriptor = "(I)Lclient!aff;", line = 35)
	Class108_Sub1 method1418(@OriginalArg(0) int arg0) {
		@Pc(12) byte[] local12 = this.aClass497_13.method30064(this.aClass138_3.method11524((byte) 122).anInt5849 * -1772702343, arg0, (byte) 0);
		@Pc(19) Class108_Sub1 local19 = new Class108_Sub1(this.aClass138_3, arg0);
		if (local12 != null) {
			local19.method36654(new Packet(local12), (byte) -74);
		}
		return local19;
	}

	@OriginalMember(owner = "client!adj", name = "r", descriptor = "(II)Lclient!aff;", line = 35)
	Class108_Sub1 method1419(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) byte[] local12 = this.aClass497_13.method30064(this.aClass138_3.method11524((byte) 11).anInt5849 * -1772702343, arg0, (byte) 0);
		@Pc(19) Class108_Sub1 local19 = new Class108_Sub1(this.aClass138_3, arg0);
		if (local12 != null) {
			local19.method36654(new Packet(local12), (byte) -24);
		}
		return local19;
	}

	@OriginalMember(owner = "client!adj", name = "y", descriptor = "(I)Lclient!aff;", line = 35)
	Class108_Sub1 method1420(@OriginalArg(0) int arg0) {
		@Pc(12) byte[] local12 = this.aClass497_13.method30064(this.aClass138_3.method11524((byte) 25).anInt5849 * -1772702343, arg0, (byte) 0);
		@Pc(19) Class108_Sub1 local19 = new Class108_Sub1(this.aClass138_3, arg0);
		if (local12 != null) {
			local19.method36654(new Packet(local12), (byte) -98);
		}
		return local19;
	}

	@OriginalMember(owner = "client!adj", name = "v", descriptor = "(I)V", line = 42)
	public void method1421(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_5;
		synchronized (this.aClass240_5) {
			this.aClass240_5.method25847((byte) -62);
		}
	}

	@OriginalMember(owner = "client!adj", name = "x", descriptor = "()V", line = 42)
	public void method1422() {
		@Pc(3) Class240 local3 = this.aClass240_5;
		synchronized (this.aClass240_5) {
			this.aClass240_5.method25847((byte) -125);
		}
	}

	@OriginalMember(owner = "client!adj", name = "o", descriptor = "(II)V", line = 48)
	public void method1423(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class240 local3 = this.aClass240_5;
		synchronized (this.aClass240_5) {
			this.aClass240_5.method25843(arg0, (byte) -22);
		}
	}

	@OriginalMember(owner = "client!adj", name = "b", descriptor = "(I)V", line = 48)
	public void method1424(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_5;
		synchronized (this.aClass240_5) {
			this.aClass240_5.method25843(arg0, (byte) -88);
		}
	}

	@OriginalMember(owner = "client!adj", name = "s", descriptor = "(B)V", line = 54)
	public void method1425(@OriginalArg(0) byte arg0) {
		@Pc(3) Class240 local3 = this.aClass240_5;
		synchronized (this.aClass240_5) {
			this.aClass240_5.method25860(1161602830);
		}
	}

	@OriginalMember(owner = "client!adj", name = "iterator", descriptor = "()Ljava/util/Iterator;", line = 60)
	@Override
	public Iterator iterator() {
		return new Class290(this);
	}

	@OriginalMember(owner = "client!adj", name = "p", descriptor = "()Ljava/util/Iterator;", line = 60)
	public Iterator method1426() {
		return new Class290(this);
	}

	@OriginalMember(owner = "client!adj", name = "d", descriptor = "()Ljava/util/Iterator;", line = 60)
	public Iterator method1427() {
		return new Class290(this);
	}

	@OriginalMember(owner = "client!adj", name = "c", descriptor = "()Ljava/util/Iterator;", line = 60)
	public Iterator method1428() {
		return new Class290(this);
	}

	@OriginalMember(owner = "client!adj", name = "f", descriptor = "()I", line = 81)
	@Override
	public int method18263() {
		return super.method18262(1908817157);
	}

	@OriginalMember(owner = "client!adj", name = "w", descriptor = "()I", line = 81)
	@Override
	public int method18266() {
		return super.method18262(1280317949);
	}

	@OriginalMember(owner = "client!adj", name = "l", descriptor = "()I", line = 81)
	@Override
	public int method18267() {
		return super.method18262(1160620233);
	}

	@OriginalMember(owner = "client!adj", name = "n", descriptor = "(I)I", line = 81)
	@Override
	public int method18262(@OriginalArg(0) int arg0) {
		return super.method18262(32957796);
	}

	@OriginalMember(owner = "client!adj", name = "bdc", descriptor = "(Lclient!yf;I)V", line = 14750)
	static final void method1429(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class125_Sub3.platformStats.anInt2055 * 714183489;
	}
}
