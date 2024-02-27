package com.jagex;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!abe")
public class Class32 implements Interface11 {

	@OriginalMember(owner = "client!abe", name = "hw", descriptor = "Lclient!aos;")
	public static Class32_Sub17 aClass32_Sub17_23;

	@OriginalMember(owner = "client!abe", name = "e", descriptor = "Lclient!py;")
	final Class497 aClass497_84;

	@OriginalMember(owner = "client!abe", name = "n", descriptor = "Lclient!xq;")
	final Class667 aClass667_31;

	@OriginalMember(owner = "client!abe", name = "f", descriptor = "Lclient!abs;")
	protected final Interface4 anInterface4_25;

	@OriginalMember(owner = "client!abe", name = "m", descriptor = "I")
	public int anInt2487;

	@OriginalMember(owner = "client!abe", name = "k", descriptor = "Lclient!eb;")
	Class240 aClass240_62;

	@OriginalMember(owner = "client!abe", name = "f", descriptor = "(IIZI)I")
	public static int method17838(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		@Pc(1) int local1 = 0;
		@Pc(6) Class93_Sub6 local6 = Class557.method31246(arg0, arg2, (short) 255);
		if (local6 == null) {
			return 0;
		}
		for (@Pc(13) int local13 = 0; local13 < local6.anIntArray173.length; local13++) {
			if (local6.anIntArray173[local13] >= 0 && ((Class47) Class277.aClass32_Sub12_1.method18273(local6.anIntArray173[local13], 1574977583)).anInt140 * 352108515 == arg1) {
				local1 += Class14.method193(arg0, local13, arg2, -109844901);
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!abe", name = "t", descriptor = "(II)V")
	static void method17839(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Class665.anInt6009 = arg0 * 1917335355;
		Class93_Sub23_Sub1.aClass93_Sub23_Sub1Array1 = new Class93_Sub23_Sub1[arg0];
		Class93_Sub23_Sub1.anInt3083 = 0;
	}

	@OriginalMember(owner = "client!abe", name = "<init>", descriptor = "(Lclient!zd;Lclient!zt;Lclient!py;Lclient!xq;ILclient!abs;)V")
	public Class32(@OriginalArg(0) Class702 arg0, @OriginalArg(1) Class717 arg1, @OriginalArg(2) Class497 arg2, @OriginalArg(3) Class667 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Interface4 arg5) {
		this.aClass497_84 = arg2;
		this.aClass667_31 = arg3;
		this.anInterface4_25 = arg5;
		this.anInt2487 = Class546.method31154(this.aClass497_84, this.aClass667_31, (byte) -63) * 418600949;
		this.aClass240_62 = new Class240(arg4);
	}

	@OriginalMember(owner = "client!abe", name = "c", descriptor = "()Ljava/util/Iterator;")
	public final Iterator method17816() {
		return new Class63(this);
	}

	@OriginalMember(owner = "client!abe", name = "e", descriptor = "(II)Lclient!ay;")
	@Override
	public final Interface13 method18273(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class240 local3 = this.aClass240_62;
		@Pc(11) Interface13 local11;
		synchronized (this.aClass240_62) {
			local11 = (Interface13) this.aClass240_62.method25932((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		local11 = this.method17833(arg0, -1291147084);
		local3 = this.aClass240_62;
		synchronized (this.aClass240_62) {
			this.aClass240_62.method25923(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!abe", name = "ah", descriptor = "(I)V")
	public final void method17817(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_62;
		synchronized (this.aClass240_62) {
			this.aClass240_62.method25926((byte) -35);
			this.aClass240_62 = new Class240(arg0);
		}
	}

	@OriginalMember(owner = "client!abe", name = "b", descriptor = "()V")
	public void method17818() {
		@Pc(3) Class240 local3 = this.aClass240_62;
		synchronized (this.aClass240_62) {
			this.aClass240_62.method25926((byte) -122);
		}
	}

	@OriginalMember(owner = "client!abe", name = "l", descriptor = "()I")
	@Override
	public final int method18279() {
		return this.anInt2487 * -152478627;
	}

	@OriginalMember(owner = "client!abe", name = "r", descriptor = "(I)V")
	public void method17819(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_62;
		synchronized (this.aClass240_62) {
			this.aClass240_62.method25926((byte) -45);
		}
	}

	@OriginalMember(owner = "client!abe", name = "v", descriptor = "(II)V")
	public void method17820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class240 local3 = this.aClass240_62;
		synchronized (this.aClass240_62) {
			this.aClass240_62.method25925(arg0, (byte) 12);
		}
	}

	@OriginalMember(owner = "client!abe", name = "d", descriptor = "()Ljava/util/Iterator;")
	public final Iterator method17821() {
		return new Class63(this);
	}

	@OriginalMember(owner = "client!abe", name = "iterator", descriptor = "()Ljava/util/Iterator;")
	@Override
	public final Iterator iterator() {
		return new Class63(this);
	}

	@OriginalMember(owner = "client!abe", name = "m", descriptor = "(I)Lclient!ay;")
	@Override
	public final Interface13 method18276(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_62;
		@Pc(11) Interface13 local11;
		synchronized (this.aClass240_62) {
			local11 = (Interface13) this.aClass240_62.method25932((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		local11 = this.method17833(arg0, -853962308);
		local3 = this.aClass240_62;
		synchronized (this.aClass240_62) {
			this.aClass240_62.method25923(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!abe", name = "s", descriptor = "()V")
	public void method17822() {
		@Pc(3) Class240 local3 = this.aClass240_62;
		synchronized (this.aClass240_62) {
			this.aClass240_62.method25926((byte) -44);
		}
	}

	@OriginalMember(owner = "client!abe", name = "w", descriptor = "()I")
	@Override
	public final int method18278() {
		return this.anInt2487 * -152478627;
	}

	@OriginalMember(owner = "client!abe", name = "o", descriptor = "(I)V")
	public void method17823(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_62;
		synchronized (this.aClass240_62) {
			this.aClass240_62.method25930(1161602830);
		}
	}

	@OriginalMember(owner = "client!abe", name = "k", descriptor = "(I)Lclient!ay;")
	@Override
	public final Interface13 method18277(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_62;
		@Pc(11) Interface13 local11;
		synchronized (this.aClass240_62) {
			local11 = (Interface13) this.aClass240_62.method25932((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		local11 = this.method17833(arg0, 822516821);
		local3 = this.aClass240_62;
		synchronized (this.aClass240_62) {
			this.aClass240_62.method25923(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!abe", name = "y", descriptor = "()V")
	public void method17824() {
		@Pc(3) Class240 local3 = this.aClass240_62;
		synchronized (this.aClass240_62) {
			this.aClass240_62.method25926((byte) -33);
		}
	}

	@OriginalMember(owner = "client!abe", name = "q", descriptor = "()V")
	public void method17825() {
		@Pc(3) Class240 local3 = this.aClass240_62;
		synchronized (this.aClass240_62) {
			this.aClass240_62.method25926((byte) -20);
		}
	}

	@OriginalMember(owner = "client!abe", name = "x", descriptor = "()V")
	public void method17826() {
		@Pc(3) Class240 local3 = this.aClass240_62;
		synchronized (this.aClass240_62) {
			this.aClass240_62.method25926((byte) -87);
		}
	}

	@OriginalMember(owner = "client!abe", name = "n", descriptor = "(I)I")
	@Override
	public final int method18274(@OriginalArg(0) int arg0) {
		return this.anInt2487 * -152478627;
	}

	@OriginalMember(owner = "client!abe", name = "h", descriptor = "()V")
	public void method17827() {
		@Pc(3) Class240 local3 = this.aClass240_62;
		synchronized (this.aClass240_62) {
			this.aClass240_62.method25926((byte) -123);
		}
	}

	@OriginalMember(owner = "client!abe", name = "p", descriptor = "()Ljava/util/Iterator;")
	public final Iterator method17828() {
		return new Class63(this);
	}

	@OriginalMember(owner = "client!abe", name = "g", descriptor = "(I)V")
	public void method17829(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_62;
		synchronized (this.aClass240_62) {
			this.aClass240_62.method25925(arg0, (byte) 61);
		}
	}

	@OriginalMember(owner = "client!abe", name = "i", descriptor = "(I)V")
	public void method17830(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_62;
		synchronized (this.aClass240_62) {
			this.aClass240_62.method25925(arg0, (byte) 34);
		}
	}

	@OriginalMember(owner = "client!abe", name = "j", descriptor = "(I)V")
	public void method17831(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_62;
		synchronized (this.aClass240_62) {
			this.aClass240_62.method25925(arg0, (byte) -63);
		}
	}

	@OriginalMember(owner = "client!abe", name = "t", descriptor = "()V")
	public void method17832() {
		@Pc(3) Class240 local3 = this.aClass240_62;
		synchronized (this.aClass240_62) {
			this.aClass240_62.method25930(1161602830);
		}
	}

	@OriginalMember(owner = "client!abe", name = "u", descriptor = "(II)Lclient!ay;")
	final Interface13 method17833(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class497 local3 = this.aClass497_84;
		@Pc(12) byte[] local12;
		synchronized (this.aClass497_84) {
			local12 = Class650.method32850(this.aClass497_84, this.aClass667_31, arg0, -1497248091);
		}
		@Pc(27) Interface13 local27 = this.anInterface4_25.method27796(arg0, this, -1900283161);
		if (local12 != null) {
			local27.method36835(new Class93_Sub41(local12), (byte) -20);
		}
		local27.method36834(-1193796337);
		return local27;
	}

	@OriginalMember(owner = "client!abe", name = "f", descriptor = "()I")
	@Override
	public final int method18275() {
		return this.anInt2487 * -152478627;
	}

	@OriginalMember(owner = "client!abe", name = "z", descriptor = "(II)V")
	public final void method17834(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class240 local3 = this.aClass240_62;
		synchronized (this.aClass240_62) {
			this.aClass240_62.method25926((byte) -8);
			this.aClass240_62 = new Class240(arg0);
		}
	}

	@OriginalMember(owner = "client!abe", name = "ae", descriptor = "(I)Lclient!ay;")
	final Interface13 method17835(@OriginalArg(0) int arg0) {
		@Pc(3) Class497 local3 = this.aClass497_84;
		@Pc(12) byte[] local12;
		synchronized (this.aClass497_84) {
			local12 = Class650.method32850(this.aClass497_84, this.aClass667_31, arg0, -1497248091);
		}
		@Pc(27) Interface13 local27 = this.anInterface4_25.method27796(arg0, this, -1914216139);
		if (local12 != null) {
			local27.method36835(new Class93_Sub41(local12), (byte) 58);
		}
		local27.method36834(216909128);
		return local27;
	}

	@OriginalMember(owner = "client!abe", name = "ag", descriptor = "(I)Lclient!ay;")
	final Interface13 method17836(@OriginalArg(0) int arg0) {
		@Pc(3) Class497 local3 = this.aClass497_84;
		@Pc(12) byte[] local12;
		synchronized (this.aClass497_84) {
			local12 = Class650.method32850(this.aClass497_84, this.aClass667_31, arg0, -1497248091);
		}
		@Pc(27) Interface13 local27 = this.anInterface4_25.method27796(arg0, this, -1544200888);
		if (local12 != null) {
			local27.method36835(new Class93_Sub41(local12), (byte) 19);
		}
		local27.method36834(-1766963711);
		return local27;
	}

	@OriginalMember(owner = "client!abe", name = "a", descriptor = "(I)V")
	public void method17837(@OriginalArg(0) int arg0) {
		@Pc(3) Class240 local3 = this.aClass240_62;
		synchronized (this.aClass240_62) {
			this.aClass240_62.method25925(arg0, (byte) -23);
		}
	}
}
