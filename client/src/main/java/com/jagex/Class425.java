package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.lang.management.GarbageCollectorMXBean;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@OriginalClass("client!mt")
public final class Class425 {

	@OriginalMember(owner = "client!mt", name = "wk", descriptor = "Ljava/lang/management/GarbageCollectorMXBean;")
	static GarbageCollectorMXBean aGarbageCollectorMXBean1;

	@OriginalMember(owner = "client!mt", name = "t", descriptor = "Ljava/util/Map;")
	Map aMap19 = new HashMap();

	@OriginalMember(owner = "client!mt", name = "f", descriptor = "Lclient!mr;")
	Class138 aClass138_1;

	@OriginalMember(owner = "client!mt", name = "eg", descriptor = "(Lclient!yp;B)V")
	static void method29052(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class370.method28376(local11, local14, arg0, (short) 2181);
	}

	@OriginalMember(owner = "client!mt", name = "ml", descriptor = "(Lclient!yp;I)V")
	static void method29053(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class350.method28012(local11, local14, arg0, (byte) -10);
	}

	@OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(Lclient!mr;)V")
	public Class425(@OriginalArg(0) Class138 arg0) {
		this.aClass138_1 = arg0;
	}

	@OriginalMember(owner = "client!mt", name = "m", descriptor = "(I)Lclient!mb;")
	public Class413 method29044(@OriginalArg(0) int arg0) {
		return (Class413) this.aMap19.get(arg0);
	}

	@OriginalMember(owner = "client!mt", name = "e", descriptor = "(II)Lclient!mb;")
	public Class413 method29045(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Class413) this.aMap19.get(arg0);
	}

	@OriginalMember(owner = "client!mt", name = "f", descriptor = "(IIFLclient!ms;I)Lclient!mb;")
	public Class413 method29046(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Interface43 arg3, @OriginalArg(4) int arg4) {
		if (this.method29045(arg0, 1219755164) != null) {
			return null;
		}
		@Pc(8) Class413 local8 = null;
		if (arg1 != -1) {
			local8 = this.method29045(arg1, 323672921);
		}
		@Pc(22) Object local22 = this.aClass138_1.method11515(local8, -1408024756);
		@Pc(32) Class413 local32 = new Class413(arg0, arg2, local22, this, arg3, local8);
		this.aMap19.put(arg0, local32);
		return local32;
	}

	@OriginalMember(owner = "client!mt", name = "t", descriptor = "(I)V")
	public void method29047(@OriginalArg(0) int arg0) {
		@Pc(4) Iterator local4 = this.aMap19.values().iterator();
		while (local4.hasNext()) {
			@Pc(11) Class413 local11 = (Class413) local4.next();
			local11.method28985(-77668989);
		}
	}

	@OriginalMember(owner = "client!mt", name = "u", descriptor = "()V")
	public void method29048() {
		@Pc(4) Iterator local4 = this.aMap19.values().iterator();
		while (local4.hasNext()) {
			@Pc(11) Class413 local11 = (Class413) local4.next();
			local11.method28985(-1919598564);
		}
	}

	@OriginalMember(owner = "client!mt", name = "l", descriptor = "()V")
	public void method29049() {
		@Pc(4) Iterator local4 = this.aMap19.values().iterator();
		while (local4.hasNext()) {
			@Pc(11) Class413 local11 = (Class413) local4.next();
			local11.method28985(-1741031574);
		}
	}

	@OriginalMember(owner = "client!mt", name = "g", descriptor = "(IIFLclient!ms;)Lclient!mb;")
	public Class413 method29050(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Interface43 arg3) {
		if (this.method29045(arg0, 260523503) != null) {
			return null;
		}
		@Pc(8) Class413 local8 = null;
		if (arg1 != -1) {
			local8 = this.method29045(arg1, 1760295096);
		}
		@Pc(22) Object local22 = this.aClass138_1.method11515(local8, 409891039);
		@Pc(32) Class413 local32 = new Class413(arg0, arg2, local22, this, arg3, local8);
		this.aMap19.put(arg0, local32);
		return local32;
	}

	@OriginalMember(owner = "client!mt", name = "i", descriptor = "(IIFLclient!ms;)Lclient!mb;")
	public Class413 method29051(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Interface43 arg3) {
		if (this.method29045(arg0, -1731428890) != null) {
			return null;
		}
		@Pc(8) Class413 local8 = null;
		if (arg1 != -1) {
			local8 = this.method29045(arg1, -826718787);
		}
		@Pc(22) Object local22 = this.aClass138_1.method11515(local8, 2031783179);
		@Pc(32) Class413 local32 = new Class413(arg0, arg2, local22, this, arg3, local8);
		this.aMap19.put(arg0, local32);
		return local32;
	}
}
