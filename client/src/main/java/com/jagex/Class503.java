package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class503 implements Comparable {

	@OriginalMember(owner = "client!qd", name = "k", descriptor = "J")
	long aLong283;

	@OriginalMember(owner = "client!qd", name = "m", descriptor = "J")
	long aLong284;

	@OriginalMember(owner = "client!qd", name = "e", descriptor = "Ljava/lang/Object;")
	Object anObject21;

	@OriginalMember(owner = "client!qd", name = "n", descriptor = "Ljava/lang/Object;")
	Object anObject20;

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)V", line = 9)
	Class503(@OriginalArg(0) Object arg0, @OriginalArg(1) Object arg1) {
		this.anObject21 = arg0;
		this.anObject20 = arg1;
	}

	@OriginalMember(owner = "client!qd", name = "e", descriptor = "(Lclient!qd;B)I", line = 15)
	int method30176(@OriginalArg(0) Class503 arg0, @OriginalArg(1) byte arg1) {
		if (this.aLong283 * 3216089845001939409L < arg0.aLong283 * 3216089845001939409L) {
			return -1;
		} else if (this.aLong283 * 3216089845001939409L > arg0.aLong283 * 3216089845001939409L) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!qd", name = "n", descriptor = "(Lclient!qd;)I", line = 15)
	int method30177(@OriginalArg(0) Class503 arg0) {
		if (this.aLong283 * 3216089845001939409L < arg0.aLong283 * 3216089845001939409L) {
			return -1;
		} else if (this.aLong283 * 3216089845001939409L > arg0.aLong283 * 3216089845001939409L) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!qd", name = "rp", descriptor = "(Ljava/lang/Object;)Z", line = 21)
	public boolean method30178(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class503)) {
			throw new IllegalArgumentException();
		}
		return this.anObject20.equals(((Class503) arg0).anObject20);
	}

	@OriginalMember(owner = "client!qd", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 21)
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class503)) {
			throw new IllegalArgumentException();
		}
		return this.anObject20.equals(((Class503) arg0).anObject20);
	}

	@OriginalMember(owner = "client!qd", name = "rs", descriptor = "(Ljava/lang/Object;)Z", line = 21)
	public boolean method30179(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class503)) {
			throw new IllegalArgumentException();
		}
		return this.anObject20.equals(((Class503) arg0).anObject20);
	}

	@OriginalMember(owner = "client!qd", name = "rq", descriptor = "(Ljava/lang/Object;)Z", line = 21)
	public boolean method30180(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class503)) {
			throw new IllegalArgumentException();
		}
		return this.anObject20.equals(((Class503) arg0).anObject20);
	}

	@OriginalMember(owner = "client!qd", name = "ro", descriptor = "(Ljava/lang/Object;)Z", line = 21)
	public boolean method30181(@OriginalArg(0) Object arg0) {
		if (!(arg0 instanceof Class503)) {
			throw new IllegalArgumentException();
		}
		return this.anObject20.equals(((Class503) arg0).anObject20);
	}

	@OriginalMember(owner = "client!qd", name = "hashCode", descriptor = "()I", line = 26)
	@Override
	public int hashCode() {
		return this.anObject20.hashCode();
	}

	@OriginalMember(owner = "client!qd", name = "rk", descriptor = "()I", line = 26)
	public int method30182() {
		return this.anObject20.hashCode();
	}

	@OriginalMember(owner = "client!qd", name = "rm", descriptor = "()I", line = 26)
	public int method30183() {
		return this.anObject20.hashCode();
	}

	@OriginalMember(owner = "client!qd", name = "ri", descriptor = "()I", line = 26)
	public int method30184() {
		return this.anObject20.hashCode();
	}

	@OriginalMember(owner = "client!qd", name = "m", descriptor = "(Ljava/lang/Object;)I", line = 30)
	public int method30185(@OriginalArg(0) Object arg0) {
		return this.method30176((Class503) arg0, (byte) 1);
	}

	@OriginalMember(owner = "client!qd", name = "compareTo", descriptor = "(Ljava/lang/Object;)I", line = 30)
	@Override
	public int compareTo(@OriginalArg(0) Object arg0) {
		return this.method30176((Class503) arg0, (byte) 1);
	}

	@OriginalMember(owner = "client!qd", name = "k", descriptor = "(Ljava/lang/Object;)I", line = 30)
	public int method30186(@OriginalArg(0) Object arg0) {
		return this.method30176((Class503) arg0, (byte) 1);
	}

	@OriginalMember(owner = "client!qd", name = "ah", descriptor = "(Lclient!dh;J)V", line = 408)
	public static void method30187(@OriginalArg(0) Class104 arg0, @OriginalArg(1) long arg1) {
		arg0.method20536();
		Class625.aLinkedList7.clear();
		Class625.aLinkedList6.clear();
		Class625.aLong292 = (arg1 + (long) (Class625.anInt5691 * -712869369)) * -341548231186129331L;
	}

	@OriginalMember(owner = "client!qd", name = "fi", descriptor = "(I)V", line = 2408)
	static void method30188(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		if (Class51.aClass93_Sub36_1 != null) {
			local1 = Class51.aClass93_Sub36_1.aClass166_Sub24_1.method15870(692665550);
		}
		@Pc(23) int local23;
		@Pc(34) int local34;
		if (local1 == 2) {
			local23 = client.anInt3413 * -108363597 > 800 ? 800 : client.anInt3413 * -108363597;
			local34 = Class504.anInt5201 * 2090134413 > 600 ? 600 : Class504.anInt5201 * 2090134413;
			client.anInt3408 = local23 * 1671148283;
			client.anInt3414 = (client.anInt3413 * -108363597 - local23) / 2 * 1405880713;
			client.anInt3416 = local34 * 490799697;
			client.anInt3415 = 0;
		} else if (local1 == 1) {
			local23 = client.anInt3413 * -108363597 > 1024 ? 1024 : client.anInt3413 * -108363597;
			local34 = Class504.anInt5201 * 2090134413 > 768 ? 768 : Class504.anInt5201 * 2090134413;
			client.anInt3408 = local23 * 1671148283;
			client.anInt3414 = (client.anInt3413 * -108363597 - local23) / 2 * 1405880713;
			client.anInt3416 = local34 * 490799697;
			client.anInt3415 = 0;
		} else {
			client.anInt3408 = client.anInt3413 * 497657217;
			client.anInt3414 = 0;
			client.anInt3416 = Class504.anInt5201 * 1556259229;
			client.anInt3415 = 0;
		}
	}

	@OriginalMember(owner = "client!qd", name = "qf", descriptor = "(Lclient!yf;I)V", line = 7990)
	static final void method30189(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class389.method28269(local11, local14, arg0, 1298505453);
	}

	@OriginalMember(owner = "client!qd", name = "aoz", descriptor = "(Lclient!yf;I)V", line = 12640)
	static final void method30190(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) throws Exception_Sub3 {
		Class65.aClass123_Sub1_2.method8945((float) arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091] / 1000.0F, (byte) 8);
	}

	@OriginalMember(owner = "client!qd", name = "arx", descriptor = "(Lclient!yf;B)V", line = 12900)
	static final void method30191(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
	}
}
