package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.util.Map;

@OriginalClass("client!vn")
public abstract class Class161 {

	@OriginalMember(owner = "client!vn", name = "ig", descriptor = "Ljava/util/Map;")
	public static Map aMap13;

	@OriginalMember(owner = "client!vn", name = "l", descriptor = "I")
	int anInt2057;

	@OriginalMember(owner = "client!vn", name = "f", descriptor = "Lclient!ej;")
	final Class243 aClass243_38 = new Class243(500);

	@OriginalMember(owner = "client!vn", name = "e", descriptor = "Lclient!ej;")
	final Class243 aClass243_39 = new Class243(30);

	@OriginalMember(owner = "client!vn", name = "u", descriptor = "Lclient!ej;")
	final Class243 aClass243_40 = new Class243(50);

	@OriginalMember(owner = "client!vn", name = "i", descriptor = "[Lclient!dt;")
	Class232[] aClass232Array2 = new Class232[4];

	@OriginalMember(owner = "client!vn", name = "m", descriptor = "Lclient!abt;")
	Class44 aClass44_2 = new Class44(null, null);

	@OriginalMember(owner = "client!vn", name = "t", descriptor = "Z")
	boolean aBoolean413;

	@OriginalMember(owner = "client!vn", name = "g", descriptor = "[Ljava/lang/String;")
	final String[] aStringArray18;

	@OriginalMember(owner = "client!vn", name = "ia", descriptor = "(Lclient!ahb;IB)V")
	static void method15650(@OriginalArg(0) Class120_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (arg0.anIntArray240 == null) {
			return;
		}
		@Pc(10) Class712 local10 = (Class712) Class80_Sub39.method15030(Class712.method37173(1704565786), arg1, -1665677110);
		@Pc(17) int local17 = arg0.anIntArray240[local10.method37174(1657823275)];
		if (local17 != arg0.aClass6_3.method23582(1343769570)) {
			arg0.aClass6_3.method23583(local17, arg0.aClass6_3.method23665(1488115273), 7445868);
			arg0.anInt2702 = arg0.anInt2700 * 1953218201;
		}
	}

	@OriginalMember(owner = "client!vn", name = "v", descriptor = "(B)V")
	static void method15651(@OriginalArg(0) byte arg0) {
		client.aClass75_2.method1319((short) 468);
		if (Class499.anInt5034 * 1504780479 < 2) {
			Class47.aClass28_3.method656((byte) -105);
			Class499.anInt5033 = 0;
			Class499.anInt5034 += -516796609;
			Class499.aClass411_3 = Class411.aClass411_2;
		} else {
			Class499.aClass411_3 = null;
			Class499.aClass708_1 = Class708.aClass708_6;
			Class604.method32148(4, 1270817499);
		}
	}

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(ZLclient!zv;Lclient!zy;)V")
	Class161(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class719 arg1, @OriginalArg(2) Class722 arg2) {
		this.aBoolean413 = arg0;
		if (arg2 == Class722.aClass722_10) {
			this.aStringArray18 = new String[] { null, null, null, null, null, Class60.aClass60_9.method1180(arg1, 526013888) };
		} else {
			this.aStringArray18 = new String[] { null, null, null, null, null, null };
		}
	}

	@OriginalMember(owner = "client!vn", name = "n", descriptor = "()V")
	final void method15629() {
		@Pc(3) Class243 local3 = this.aClass243_38;
		synchronized (this.aClass243_38) {
			this.aClass243_38.method26256(1693912082);
		}
		local3 = this.aClass243_39;
		synchronized (this.aClass243_39) {
			this.aClass243_39.method26256(1693912082);
		}
		local3 = this.aClass243_40;
		synchronized (this.aClass243_40) {
			this.aClass243_40.method26256(1693912082);
		}
		this.aClass232Array2 = new Class232[4];
		this.aClass44_2 = new Class44(null, null);
	}

	@OriginalMember(owner = "client!vn", name = "t", descriptor = "(ZB)V")
	final void method15630(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte arg1) {
		if (this.aBoolean413 != arg0) {
			this.aBoolean413 = arg0;
			this.method15632(1102256837);
		}
	}

	@OriginalMember(owner = "client!vn", name = "f", descriptor = "(IB)V")
	final void method15631(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.anInt2057 = arg0 * 1918519679;
		@Pc(8) Class243 local8 = this.aClass243_38;
		synchronized (this.aClass243_38) {
			this.aClass243_38.method26256(1693912082);
		}
		local8 = this.aClass243_39;
		synchronized (this.aClass243_39) {
			this.aClass243_39.method26256(1693912082);
		}
		local8 = this.aClass243_40;
		synchronized (this.aClass243_40) {
			this.aClass243_40.method26256(1693912082);
		}
	}

	@OriginalMember(owner = "client!vn", name = "e", descriptor = "(I)V")
	final void method15632(@OriginalArg(0) int arg0) {
		@Pc(3) Class243 local3 = this.aClass243_38;
		synchronized (this.aClass243_38) {
			this.aClass243_38.method26256(1693912082);
		}
		local3 = this.aClass243_39;
		synchronized (this.aClass243_39) {
			this.aClass243_39.method26256(1693912082);
		}
		local3 = this.aClass243_40;
		synchronized (this.aClass243_40) {
			this.aClass243_40.method26256(1693912082);
		}
		this.aClass232Array2 = new Class232[4];
		this.aClass44_2 = new Class44(null, null);
	}

	@OriginalMember(owner = "client!vn", name = "u", descriptor = "(II)V")
	final void method15633(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class243 local3 = this.aClass243_38;
		synchronized (this.aClass243_38) {
			this.aClass243_38.method26247(arg0, (byte) 51);
		}
		local3 = this.aClass243_39;
		synchronized (this.aClass243_39) {
			this.aClass243_39.method26247(arg0, (byte) 41);
		}
		local3 = this.aClass243_40;
		synchronized (this.aClass243_40) {
			this.aClass243_40.method26247(arg0, (byte) 120);
		}
	}

	@OriginalMember(owner = "client!vn", name = "l", descriptor = "(I)V")
	final void method15634(@OriginalArg(0) int arg0) {
		@Pc(3) Class243 local3 = this.aClass243_38;
		synchronized (this.aClass243_38) {
			this.aClass243_38.method26259((byte) 3);
		}
		local3 = this.aClass243_39;
		synchronized (this.aClass243_39) {
			this.aClass243_39.method26259((byte) 3);
		}
		local3 = this.aClass243_40;
		synchronized (this.aClass243_40) {
			this.aClass243_40.method26259((byte) 3);
		}
	}

	@OriginalMember(owner = "client!vn", name = "i", descriptor = "(IB)Z")
	abstract boolean method15635(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1);

	@OriginalMember(owner = "client!vn", name = "s", descriptor = "(Z)V")
	final void method15636(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean413 != arg0) {
			this.aBoolean413 = arg0;
			this.method15632(1102256837);
		}
	}

	@OriginalMember(owner = "client!vn", name = "m", descriptor = "(I)[B")
	abstract byte[] method15637(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!vn", name = "g", descriptor = "(II)[B")
	abstract byte[] method15638(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!vn", name = "j", descriptor = "(I)Z")
	abstract boolean method15639(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!vn", name = "o", descriptor = "(I)[B")
	abstract byte[] method15640(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!vn", name = "ay", descriptor = "()V")
	final void method15641() {
		@Pc(3) Class243 local3 = this.aClass243_38;
		synchronized (this.aClass243_38) {
			this.aClass243_38.method26259((byte) 3);
		}
		local3 = this.aClass243_39;
		synchronized (this.aClass243_39) {
			this.aClass243_39.method26259((byte) 3);
		}
		local3 = this.aClass243_40;
		synchronized (this.aClass243_40) {
			this.aClass243_40.method26259((byte) 3);
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)Z")
	abstract boolean method15642(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!vn", name = "x", descriptor = "(I)V")
	final void method15643(@OriginalArg(0) int arg0) {
		this.anInt2057 = arg0 * 1918519679;
		@Pc(8) Class243 local8 = this.aClass243_38;
		synchronized (this.aClass243_38) {
			this.aClass243_38.method26256(1693912082);
		}
		local8 = this.aClass243_39;
		synchronized (this.aClass243_39) {
			this.aClass243_39.method26256(1693912082);
		}
		local8 = this.aClass243_40;
		synchronized (this.aClass243_40) {
			this.aClass243_40.method26256(1693912082);
		}
	}

	@OriginalMember(owner = "client!vn", name = "w", descriptor = "(I)V")
	final void method15644(@OriginalArg(0) int arg0) {
		this.anInt2057 = arg0 * 1918519679;
		@Pc(8) Class243 local8 = this.aClass243_38;
		synchronized (this.aClass243_38) {
			this.aClass243_38.method26256(1693912082);
		}
		local8 = this.aClass243_39;
		synchronized (this.aClass243_39) {
			this.aClass243_39.method26256(1693912082);
		}
		local8 = this.aClass243_40;
		synchronized (this.aClass243_40) {
			this.aClass243_40.method26256(1693912082);
		}
	}

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "()V")
	final void method15645() {
		@Pc(3) Class243 local3 = this.aClass243_38;
		synchronized (this.aClass243_38) {
			this.aClass243_38.method26256(1693912082);
		}
		local3 = this.aClass243_39;
		synchronized (this.aClass243_39) {
			this.aClass243_39.method26256(1693912082);
		}
		local3 = this.aClass243_40;
		synchronized (this.aClass243_40) {
			this.aClass243_40.method26256(1693912082);
		}
		this.aClass232Array2 = new Class232[4];
		this.aClass44_2 = new Class44(null, null);
	}

	@OriginalMember(owner = "client!vn", name = "k", descriptor = "(Z)V")
	final void method15646(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean413 != arg0) {
			this.aBoolean413 = arg0;
			this.method15632(1102256837);
		}
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(I)V")
	final void method15647(@OriginalArg(0) int arg0) {
		@Pc(3) Class243 local3 = this.aClass243_38;
		synchronized (this.aClass243_38) {
			this.aClass243_38.method26247(arg0, (byte) 16);
		}
		local3 = this.aClass243_39;
		synchronized (this.aClass243_39) {
			this.aClass243_39.method26247(arg0, (byte) 37);
		}
		local3 = this.aClass243_40;
		synchronized (this.aClass243_40) {
			this.aClass243_40.method26247(arg0, (byte) 98);
		}
	}

	@OriginalMember(owner = "client!vn", name = "ax", descriptor = "()V")
	final void method15648() {
		@Pc(3) Class243 local3 = this.aClass243_38;
		synchronized (this.aClass243_38) {
			this.aClass243_38.method26259((byte) 3);
		}
		local3 = this.aClass243_39;
		synchronized (this.aClass243_39) {
			this.aClass243_39.method26259((byte) 3);
		}
		local3 = this.aClass243_40;
		synchronized (this.aClass243_40) {
			this.aClass243_40.method26259((byte) 3);
		}
	}

	@OriginalMember(owner = "client!vn", name = "ai", descriptor = "()V")
	final void method15649() {
		@Pc(3) Class243 local3 = this.aClass243_38;
		synchronized (this.aClass243_38) {
			this.aClass243_38.method26259((byte) 3);
		}
		local3 = this.aClass243_39;
		synchronized (this.aClass243_39) {
			this.aClass243_39.method26259((byte) 3);
		}
		local3 = this.aClass243_40;
		synchronized (this.aClass243_40) {
			this.aClass243_40.method26259((byte) 3);
		}
	}
}
