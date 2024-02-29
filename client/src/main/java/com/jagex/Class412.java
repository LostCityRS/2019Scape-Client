package com.jagex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public class Class412 {

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "Ljava/util/Map;")
	Map aMap22 = new HashMap();

	@OriginalMember(owner = "client!mb", name = "n", descriptor = "Lclient!mt;")
	Class146 aClass146_1;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Lclient!mt;)V", line = 10)
	public Class412(@OriginalArg(0) Class146 arg0) {
		this.aClass146_1 = arg0;
	}

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "(I)V", line = 15)
	public void method28657(@OriginalArg(0) int arg0) {
		@Pc(4) Iterator local4 = this.aMap22.values().iterator();
		while (local4.hasNext()) {
			@Pc(11) Class420 local11 = (Class420) local4.next();
			local11.method28721(-1676533101);
		}
	}

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "()V", line = 15)
	public void method28658() {
		@Pc(4) Iterator local4 = this.aMap22.values().iterator();
		while (local4.hasNext()) {
			@Pc(11) Class420 local11 = (Class420) local4.next();
			local11.method28721(-879778635);
		}
	}

	@OriginalMember(owner = "client!mb", name = "k", descriptor = "()V", line = 15)
	public void method28659() {
		@Pc(4) Iterator local4 = this.aMap22.values().iterator();
		while (local4.hasNext()) {
			@Pc(11) Class420 local11 = (Class420) local4.next();
			local11.method28721(-1468121467);
		}
	}

	@OriginalMember(owner = "client!mb", name = "n", descriptor = "(IIFLclient!ma;I)Lclient!mj;", line = 22)
	public Class420 method28660(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Interface39 arg3, @OriginalArg(4) int arg4) {
		if (this.method28664(arg0, (byte) 78) != null) {
			return null;
		}
		@Pc(8) Class420 local8 = null;
		if (arg1 != -1) {
			local8 = this.method28664(arg1, (byte) 114);
		}
		@Pc(22) Object local22 = this.aClass146_1.method11678(local8, -484338455);
		@Pc(32) Class420 local32 = new Class420(arg0, arg2, local22, this, arg3, local8);
		this.aMap22.put(arg0, local32);
		return local32;
	}

	@OriginalMember(owner = "client!mb", name = "w", descriptor = "(IIFLclient!ma;)Lclient!mj;", line = 22)
	public Class420 method28661(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Interface39 arg3) {
		if (this.method28664(arg0, (byte) 68) != null) {
			return null;
		}
		@Pc(8) Class420 local8 = null;
		if (arg1 != -1) {
			local8 = this.method28664(arg1, (byte) 93);
		}
		@Pc(22) Object local22 = this.aClass146_1.method11678(local8, -2056684033);
		@Pc(32) Class420 local32 = new Class420(arg0, arg2, local22, this, arg3, local8);
		this.aMap22.put(arg0, local32);
		return local32;
	}

	@OriginalMember(owner = "client!mb", name = "u", descriptor = "(IIFLclient!ma;)Lclient!mj;", line = 22)
	public Class420 method28662(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Interface39 arg3) {
		if (this.method28664(arg0, (byte) 85) != null) {
			return null;
		}
		@Pc(8) Class420 local8 = null;
		if (arg1 != -1) {
			local8 = this.method28664(arg1, (byte) 107);
		}
		@Pc(22) Object local22 = this.aClass146_1.method11678(local8, 322522034);
		@Pc(32) Class420 local32 = new Class420(arg0, arg2, local22, this, arg3, local8);
		this.aMap22.put(arg0, local32);
		return local32;
	}

	@OriginalMember(owner = "client!mb", name = "l", descriptor = "(IIFLclient!ma;)Lclient!mj;", line = 22)
	public Class420 method28663(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Interface39 arg3) {
		if (this.method28664(arg0, (byte) 81) != null) {
			return null;
		}
		@Pc(8) Class420 local8 = null;
		if (arg1 != -1) {
			local8 = this.method28664(arg1, (byte) 91);
		}
		@Pc(22) Object local22 = this.aClass146_1.method11678(local8, -1446356297);
		@Pc(32) Class420 local32 = new Class420(arg0, arg2, local22, this, arg3, local8);
		this.aMap22.put(arg0, local32);
		return local32;
	}

	@OriginalMember(owner = "client!mb", name = "m", descriptor = "(IB)Lclient!mj;", line = 34)
	public Class420 method28664(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return (Class420) this.aMap22.get(arg0);
	}

	@OriginalMember(owner = "client!mb", name = "z", descriptor = "(I)Lclient!mj;", line = 34)
	public Class420 method28665(@OriginalArg(0) int arg0) {
		return (Class420) this.aMap22.get(arg0);
	}

	@OriginalMember(owner = "client!mb", name = "p", descriptor = "(I)Lclient!mj;", line = 34)
	public Class420 method28666(@OriginalArg(0) int arg0) {
		return (Class420) this.aMap22.get(arg0);
	}

	@OriginalMember(owner = "client!mb", name = "p", descriptor = "(Lclient!yf;I)V", line = 52)
	static void method28667(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[arg0.anInt5891 * -1497248091 - 1] = ((Class347) Class288.aClass55_Sub2_1.method18261(arg0.anIntArray519[arg0.anInt5891 * -1497248091 - 1], 548441272)).anInt4196 * -643441633;
	}

	@OriginalMember(owner = "client!mb", name = "l", descriptor = "(III)I", line = 167)
	public static int method28668(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg1 >>> 24;
		@Pc(7) int local7 = 255 - local3;
		@Pc(25) int local25 = (local3 * (arg1 & 0xFF00FF) & 0xFF00FF00 | local3 * (arg1 & 0xFF00) & 0xFF0000) >>> 8;
		return ((local7 * (arg0 & 0xFF00FF) & 0xFF00FF00 | local7 * (arg0 & 0xFF00) & 0xFF0000) >>> 8) + local25;
	}
}
