package com.jagex;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!adm")
public class Class79_Sub1_Sub2 extends Class79_Sub1 implements Interface11 {

	@OriginalMember(owner = "client!adm", name = "b", descriptor = "[[[S")
	public static short[][][] aShortArrayArrayArray1;

	@OriginalMember(owner = "client!adm", name = "m", descriptor = "Lclient!eb;")
	final Class240 aClass240_6 = new Class240(64);

	@OriginalMember(owner = "client!adm", name = "n", descriptor = "Lclient!py;")
	final Class497 aClass497_14;

	@OriginalMember(owner = "client!adm", name = "<init>", descriptor = "(Lclient!zd;Lclient!qe;Lclient!zt;Lclient!py;)V", line = 18)
	public Class79_Sub1_Sub2(@OriginalArg(0) Class702 arg0, @OriginalArg(1) Class138 arg1, @OriginalArg(2) Class717 arg2, @OriginalArg(3) Class497 arg3) {
		super(arg0, arg1, arg2, arg3 == null ? 0 : arg3.method30084(arg1.method11524((byte) 31).anInt5849 * -1772702343, 942596941));
		this.aClass497_14 = arg3;
	}

	@OriginalMember(owner = "client!adm", name = "e", descriptor = "(II)Lclient!ay;", line = 24)
	@Override
	public Interface13 get(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class240 local3 = this.aClass240_6;
		synchronized (this.aClass240_6) {
			@Pc(11) Class108_Sub2 local11 = (Class108_Sub2) this.aClass240_6.method25829((long) arg0);
			if (local11 == null) {
				local11 = this.method1474(arg0, (byte) 108);
				this.aClass240_6.method25838(local11, (long) arg0);
			}
			return local11;
		}
	}

	@OriginalMember(owner = "client!adm", name = "k", descriptor = "(I)Lclient!ay;", line = 24)
	@Override
	public Interface13 method18265(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_6;
		synchronized (this.aClass240_6) {
			@Pc(11) Class108_Sub2 local11 = (Class108_Sub2) this.aClass240_6.method25829((long) arg0);
			if (local11 == null) {
				local11 = this.method1474(arg0, (byte) 91);
				this.aClass240_6.method25838(local11, (long) arg0);
			}
			return local11;
		}
	}

	@OriginalMember(owner = "client!adm", name = "m", descriptor = "(I)Lclient!ay;", line = 24)
	@Override
	public Interface13 method18264(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_6;
		synchronized (this.aClass240_6) {
			@Pc(11) Class108_Sub2 local11 = (Class108_Sub2) this.aClass240_6.method25829((long) arg0);
			if (local11 == null) {
				local11 = this.method1474(arg0, (byte) 83);
				this.aClass240_6.method25838(local11, (long) arg0);
			}
			return local11;
		}
	}

	@OriginalMember(owner = "client!adm", name = "r", descriptor = "(IB)Lclient!afv;", line = 35)
	Class108_Sub2 method1474(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) byte[] local12 = this.aClass497_14.method30064(this.aClass138_3.method11524((byte) 106).anInt5849 * -1772702343, arg0, (byte) 0);
		@Pc(19) Class108_Sub2 local19 = new Class108_Sub2(this.aClass138_3, arg0);
		if (local12 != null) {
			local19.method36654(new Packet(local12), (byte) 10);
		}
		return local19;
	}

	@OriginalMember(owner = "client!adm", name = "y", descriptor = "(I)Lclient!afv;", line = 35)
	Class108_Sub2 method1475(@OriginalArg(0) int arg0) {
		@Pc(12) byte[] local12 = this.aClass497_14.method30064(this.aClass138_3.method11524((byte) 35).anInt5849 * -1772702343, arg0, (byte) 0);
		@Pc(19) Class108_Sub2 local19 = new Class108_Sub2(this.aClass138_3, arg0);
		if (local12 != null) {
			local19.method36654(new Packet(local12), (byte) -10);
		}
		return local19;
	}

	@OriginalMember(owner = "client!adm", name = "q", descriptor = "(I)Lclient!afv;", line = 35)
	Class108_Sub2 method1476(@OriginalArg(0) int arg0) {
		@Pc(12) byte[] local12 = this.aClass497_14.method30064(this.aClass138_3.method11524((byte) 108).anInt5849 * -1772702343, arg0, (byte) 0);
		@Pc(19) Class108_Sub2 local19 = new Class108_Sub2(this.aClass138_3, arg0);
		if (local12 != null) {
			local19.method36654(new Packet(local12), (byte) -39);
		}
		return local19;
	}

	@OriginalMember(owner = "client!adm", name = "x", descriptor = "(I)Lclient!afv;", line = 35)
	Class108_Sub2 method1477(@OriginalArg(0) int arg0) {
		@Pc(12) byte[] local12 = this.aClass497_14.method30064(this.aClass138_3.method11524((byte) 68).anInt5849 * -1772702343, arg0, (byte) 0);
		@Pc(19) Class108_Sub2 local19 = new Class108_Sub2(this.aClass138_3, arg0);
		if (local12 != null) {
			local19.method36654(new Packet(local12), (byte) 17);
		}
		return local19;
	}

	@OriginalMember(owner = "client!adm", name = "b", descriptor = "()V", line = 42)
	public void method1478() {
		@Pc(3) Class240 local3 = this.aClass240_6;
		synchronized (this.aClass240_6) {
			this.aClass240_6.method25847((byte) -23);
		}
	}

	@OriginalMember(owner = "client!adm", name = "v", descriptor = "(I)V", line = 42)
	public void method1479(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_6;
		synchronized (this.aClass240_6) {
			this.aClass240_6.method25847((byte) -70);
		}
	}

	@OriginalMember(owner = "client!adm", name = "o", descriptor = "(II)V", line = 48)
	public void method1480(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class240 local3 = this.aClass240_6;
		synchronized (this.aClass240_6) {
			this.aClass240_6.method25843(arg0, (byte) 30);
		}
	}

	@OriginalMember(owner = "client!adm", name = "h", descriptor = "(I)V", line = 48)
	public void method1481(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_6;
		synchronized (this.aClass240_6) {
			this.aClass240_6.method25843(arg0, (byte) 12);
		}
	}

	@OriginalMember(owner = "client!adm", name = "i", descriptor = "()V", line = 54)
	public void method1482() {
		@Pc(3) Class240 local3 = this.aClass240_6;
		synchronized (this.aClass240_6) {
			this.aClass240_6.method25860(1161602830);
		}
	}

	@OriginalMember(owner = "client!adm", name = "s", descriptor = "(I)V", line = 54)
	public void method1483(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_6;
		synchronized (this.aClass240_6) {
			this.aClass240_6.method25860(1161602830);
		}
	}

	@OriginalMember(owner = "client!adm", name = "a", descriptor = "()V", line = 54)
	public void method1484() {
		@Pc(3) Class240 local3 = this.aClass240_6;
		synchronized (this.aClass240_6) {
			this.aClass240_6.method25860(1161602830);
		}
	}

	@OriginalMember(owner = "client!adm", name = "g", descriptor = "()V", line = 54)
	public void method1485() {
		@Pc(3) Class240 local3 = this.aClass240_6;
		synchronized (this.aClass240_6) {
			this.aClass240_6.method25860(1161602830);
		}
	}

	@OriginalMember(owner = "client!adm", name = "iterator", descriptor = "()Ljava/util/Iterator;", line = 60)
	@Override
	public Iterator iterator() {
		return new Class665(this);
	}

	@OriginalMember(owner = "client!adm", name = "p", descriptor = "()Ljava/util/Iterator;", line = 60)
	public Iterator method1486() {
		return new Class665(this);
	}

	@OriginalMember(owner = "client!adm", name = "d", descriptor = "()Ljava/util/Iterator;", line = 60)
	public Iterator method1487() {
		return new Class665(this);
	}

	@OriginalMember(owner = "client!adm", name = "c", descriptor = "()Ljava/util/Iterator;", line = 60)
	public Iterator method1488() {
		return new Class665(this);
	}

	@OriginalMember(owner = "client!adm", name = "n", descriptor = "(I)I", line = 81)
	@Override
	public int method18262(@OriginalArg(0) int arg0) {
		return super.method18262(715455253);
	}

	@OriginalMember(owner = "client!adm", name = "w", descriptor = "()I", line = 81)
	@Override
	public int method18266() {
		return super.method18262(1618522222);
	}

	@OriginalMember(owner = "client!adm", name = "f", descriptor = "()I", line = 81)
	@Override
	public int method18263() {
		return super.method18262(1720960861);
	}

	@OriginalMember(owner = "client!adm", name = "l", descriptor = "()I", line = 81)
	@Override
	public int method18267() {
		return super.method18262(458417122);
	}

	@OriginalMember(owner = "client!adm", name = "jq", descriptor = "(I)V", line = 10308)
	static final void method1489(@OriginalArg(0) int arg0) {
		Class642.aClass312Array5 = null;
		Class660.method32824(client.topLevelInterface * -703563959, 0, 0, client.width * -1378711501, client.height * 2091353777, 0, 0, -1, 739901381);
		if (Class642.aClass312Array5 != null) {
			Class485.method29802(Class642.aClass312Array5, -1412584499, 0, 0, client.width * -1378711501, client.height * 2091353777, Class511.anInt5208 * 544640871, Exception_Sub4.anInt2489 * 729048639, client.aClass312_3 == Class255.aClass312_8 ? -1 : -2101991717 * client.aClass312_3.anInt3969, true, -1900803929);
			Class642.aClass312Array5 = null;
		}
	}
}
