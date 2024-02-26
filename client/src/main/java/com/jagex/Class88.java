package com.jagex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!adt")
public final class Class88 {

	@OriginalMember(owner = "client!adt", name = "f", descriptor = "I")
	public static final int anInt313 = 0;

	@OriginalMember(owner = "client!adt", name = "t", descriptor = "I")
	static final int anInt314 = 0;

	@OriginalMember(owner = "client!adt", name = "e", descriptor = "Lclient!qv;")
	Class519 aClass519_1;

	@OriginalMember(owner = "client!adt", name = "u", descriptor = "Ljava/util/Map;")
	Map aMap4;

	@OriginalMember(owner = "client!adt", name = "bz", descriptor = "(II)Z")
	static boolean method1790(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 3 || arg0 == 4 || arg0 == 5 || arg0 == 6 || arg0 == 1001 || arg0 == 1002) {
			return true;
		} else {
			return arg0 == 2;
		}
	}

	@OriginalMember(owner = "client!adt", name = "awb", descriptor = "(Lclient!yp;B)V")
	static void method1791(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(26) String local26 = (String) arg0.anObjectArray46[(arg0.anInt5776 -= -825189621) * -2070619997];
		@Pc(32) int local32 = Class231.method26036(Class566.aClass697_1, Class720.aClass720_3, local12, (byte) 3);
		@Pc(38) int local38 = Class351.method28019(Class566.aClass697_1, Class720.aClass720_3, local12, -410898174);
		if (client.anInt3433 * 1994758437 == 13 && !Class353.method28071(1145378033)) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class503.method30451(local12, local26, local32, local38, -1333568038) ? 1 : 0;
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
		}
	}

	@OriginalMember(owner = "client!adt", name = "<init>", descriptor = "(Lclient!pf;I)V")
	public Class88(@OriginalArg(0) Class480 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) byte[] local7 = arg0.method29918(arg1, 0, 1896589581);
		this.method1782(new Packet(local7), (byte) 81);
	}

	@OriginalMember(owner = "client!adt", name = "<init>", descriptor = "(Lclient!pf;II)V")
	public Class88(@OriginalArg(0) Class480 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) byte[] local9 = arg0.method29918(arg1, arg2 + 1, 1896589581);
		this.method1782(new Packet(local9), (byte) 98);
	}

	@OriginalMember(owner = "client!adt", name = "e", descriptor = "(Lclient!ald;)V")
	void method1781(@OriginalArg(0) Packet arg0) {
		this.aClass519_1 = (Class519) Class80_Sub39.method15030(Class519.method30602(1255229366), arg0.g1(), -1009473959);
		@Pc(13) int local13 = arg0.gVarInt2();
		this.aMap4 = new HashMap(local13);
		while (local13-- > 0) {
			@Pc(28) Object local28 = this.aClass519_1.method30595(arg0, 16711935);
			@Pc(32) int local32 = arg0.gVarInt2();
			@Pc(36) ArrayList local36 = new ArrayList();
			while (local32-- > 0) {
				@Pc(43) int local43 = arg0.gVarInt2();
				local36.add(local43);
			}
			this.aMap4.put(local28, local36);
		}
	}

	@OriginalMember(owner = "client!adt", name = "t", descriptor = "(Lclient!ald;B)V")
	void method1782(@OriginalArg(0) Packet arg0, @OriginalArg(1) byte arg1) {
		this.aClass519_1 = (Class519) Class80_Sub39.method15030(Class519.method30602(1255229366), arg0.g1(), -448178244);
		@Pc(13) int local13 = arg0.gVarInt2();
		this.aMap4 = new HashMap(local13);
		while (local13-- > 0) {
			@Pc(28) Object local28 = this.aClass519_1.method30595(arg0, 16711935);
			@Pc(32) int local32 = arg0.gVarInt2();
			@Pc(36) ArrayList local36 = new ArrayList();
			while (local32-- > 0) {
				@Pc(43) int local43 = arg0.gVarInt2();
				local36.add(local43);
			}
			this.aMap4.put(local28, local36);
		}
	}

	@OriginalMember(owner = "client!adt", name = "f", descriptor = "(Ljava/lang/Object;I)Ljava/util/List;")
	public List method1783(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		return (List) this.aMap4.get(arg0);
	}

	@OriginalMember(owner = "client!adt", name = "i", descriptor = "(Ljava/lang/Object;)Ljava/util/List;")
	public List method1784(@OriginalArg(0) Object arg0) {
		return (List) this.aMap4.get(arg0);
	}

	@OriginalMember(owner = "client!adt", name = "u", descriptor = "(Lclient!ald;)V")
	void method1785(@OriginalArg(0) Packet arg0) {
		this.aClass519_1 = (Class519) Class80_Sub39.method15030(Class519.method30602(1255229366), arg0.g1(), -374940707);
		@Pc(13) int local13 = arg0.gVarInt2();
		this.aMap4 = new HashMap(local13);
		while (local13-- > 0) {
			@Pc(28) Object local28 = this.aClass519_1.method30595(arg0, 16711935);
			@Pc(32) int local32 = arg0.gVarInt2();
			@Pc(36) ArrayList local36 = new ArrayList();
			while (local32-- > 0) {
				@Pc(43) int local43 = arg0.gVarInt2();
				local36.add(local43);
			}
			this.aMap4.put(local28, local36);
		}
	}

	@OriginalMember(owner = "client!adt", name = "l", descriptor = "(Lclient!ald;)V")
	void method1786(@OriginalArg(0) Packet arg0) {
		this.aClass519_1 = (Class519) Class80_Sub39.method15030(Class519.method30602(1255229366), arg0.g1(), -1970983136);
		@Pc(13) int local13 = arg0.gVarInt2();
		this.aMap4 = new HashMap(local13);
		while (local13-- > 0) {
			@Pc(28) Object local28 = this.aClass519_1.method30595(arg0, 16711935);
			@Pc(32) int local32 = arg0.gVarInt2();
			@Pc(36) ArrayList local36 = new ArrayList();
			while (local32-- > 0) {
				@Pc(43) int local43 = arg0.gVarInt2();
				local36.add(local43);
			}
			this.aMap4.put(local28, local36);
		}
	}

	@OriginalMember(owner = "client!adt", name = "g", descriptor = "(Lclient!ald;)V")
	void method1787(@OriginalArg(0) Packet arg0) {
		this.aClass519_1 = (Class519) Class80_Sub39.method15030(Class519.method30602(1255229366), arg0.g1(), -1703101840);
		@Pc(13) int local13 = arg0.gVarInt2();
		this.aMap4 = new HashMap(local13);
		while (local13-- > 0) {
			@Pc(28) Object local28 = this.aClass519_1.method30595(arg0, 16711935);
			@Pc(32) int local32 = arg0.gVarInt2();
			@Pc(36) ArrayList local36 = new ArrayList();
			while (local32-- > 0) {
				@Pc(43) int local43 = arg0.gVarInt2();
				local36.add(local43);
			}
			this.aMap4.put(local28, local36);
		}
	}

	@OriginalMember(owner = "client!adt", name = "m", descriptor = "(Ljava/lang/Object;)Ljava/util/List;")
	public List method1788(@OriginalArg(0) Object arg0) {
		return (List) this.aMap4.get(arg0);
	}

	@OriginalMember(owner = "client!adt", name = "o", descriptor = "(Ljava/lang/Object;)Ljava/util/List;")
	public List method1789(@OriginalArg(0) Object arg0) {
		return (List) this.aMap4.get(arg0);
	}
}
