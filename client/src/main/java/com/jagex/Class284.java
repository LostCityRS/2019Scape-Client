package com.jagex;

import java.util.Iterator;
import java.util.LinkedList;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gc")
public final class Class284 {

	@OriginalMember(owner = "client!gc", name = "on", descriptor = "I")
	static int anInt3939;

	@OriginalMember(owner = "client!gc", name = "e", descriptor = "I")
	int anInt3938 = 2035957275;

	@OriginalMember(owner = "client!gc", name = "u", descriptor = "Ljava/util/LinkedList;")
	LinkedList aLinkedList1 = new LinkedList();

	@OriginalMember(owner = "client!gc", name = "f", descriptor = "Lclient!gh;")
	final Interface27 anInterface27_2;

	@OriginalMember(owner = "client!gc", name = "t", descriptor = "J")
	final long aLong359;

	@OriginalMember(owner = "client!gc", name = "s", descriptor = "(II)V")
	public static void method26883(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Class120_Sub1_Sub3_Sub2.anInt1518 = arg0 * 1966760067;
		@Pc(6) Class243 local6 = Class672.aClass243_94;
		synchronized (Class672.aClass243_94) {
			Class672.aClass243_94.method26256(1693912082);
		}
		local6 = Class672.aClass243_95;
		synchronized (Class672.aClass243_95) {
			Class672.aClass243_95.method26256(1693912082);
		}
	}

	@OriginalMember(owner = "client!gc", name = "f", descriptor = "(II)Lclient!xn;")
	public static Class666 method26884(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Class666[] local2 = Class171.method23506(-1400184476);
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			if (local2[local4].anInt5697 * 809932323 == arg0) {
				return local2[local4];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!gc", name = "a", descriptor = "(Lclient!yp;B)V")
	static void method26885(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray46[(arg0.anInt5776 -= -825189621) * -2070619997];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class226.method25964(local13, (byte) 2);
	}

	@OriginalMember(owner = "client!gc", name = "bcz", descriptor = "(Lclient!yp;I)V")
	static void method26886(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = ((Class120_Sub1) arg0.anInterface60_1).method24601(1395682299);
	}

	@OriginalMember(owner = "client!gc", name = "u", descriptor = "(BI)C")
	public static char method26887(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 & 0xFF;
		if (local3 == 0) {
			throw new IllegalArgumentException("" + Integer.toString(local3, 16));
		}
		if (local3 >= 128 && local3 < 160) {
			@Pc(32) char local32 = Class714.aCharArray5[local3 - 128];
			if (local32 == '\u0000') {
				local32 = '?';
			}
			local3 = local32;
		}
		return (char) local3;
	}

	@OriginalMember(owner = "client!gc", name = "ala", descriptor = "(Lclient!yp;I)V")
	static void method26888(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		if (local12 >= 1 && local12 <= 2) {
			Class126.method20383(local12, -1, -1, false, 1615516245);
		}
	}

	@OriginalMember(owner = "client!gc", name = "mx", descriptor = "(Lclient!hx;IB)I")
	static int method26889(@OriginalArg(0) Class327 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (!client.method25326(arg0).method14313(arg1, (byte) 6) && arg0.anObjectArray26 == null) {
			return -1;
		} else if (arg0.anIntArray404 == null || arg0.anIntArray404.length <= arg1) {
			return -1;
		} else {
			return arg0.anIntArray404[arg1];
		}
	}

	@OriginalMember(owner = "client!gc", name = "<init>", descriptor = "(Lclient!ald;Lclient!gh;)V")
	public Class284(@OriginalArg(0) Packet arg0, @OriginalArg(1) Interface27 arg1) {
		this.anInterface27_2 = arg1;
		this.aLong359 = arg0.g8() * 1212377931605653285L;
		this.anInt3938 = arg0.g4() * -2035957275;
		for (@Pc(30) int local30 = arg0.g1(); local30 != 0; local30 = arg0.g1()) {
			@Pc(40) Class301 local40 = (Class301) Class80_Sub39.method15030(Class301.method27036(1126249958), local30, -1003461753);
			@Pc(51) Object local51;
			switch(local40.anInt3966 * -1370387001) {
				case 0:
					local51 = new Class294(this);
					break;
				case 1:
					local51 = new Class300(this, arg0);
					break;
				case 2:
					local51 = new Class265(this, arg0);
					break;
				case 3:
					local51 = new Class282(this, arg0);
					break;
				case 4:
					local51 = new Class295(this, arg0);
					break;
				case 5:
					local51 = new Class275(this, arg0);
					break;
				case 6:
					local51 = new Class297(this, arg0);
					break;
				case 7:
					local51 = new Class299(this, arg0);
					break;
				case 8:
					local51 = new Class283(this, arg0);
					break;
				case 9:
					local51 = new Class290(this, arg0);
					break;
				case 10:
					local51 = new Class287(this, arg0);
					break;
				case 11:
					local51 = new Class285(this, arg0);
					break;
				case 12:
					local51 = new Class262(this, arg0);
					break;
				case 13:
					local51 = new Class286(this);
					break;
				default:
					throw new IllegalStateException("");
			}
			this.aLinkedList1.add(local51);
		}
	}

	@OriginalMember(owner = "client!gc", name = "t", descriptor = "(Lclient!gz;B)V")
	public void method26881(@OriginalArg(0) Class305 arg0, @OriginalArg(1) byte arg1) {
		if (this.aLong359 * -9118945719094571859L != arg0.aLong367 * -6266481680064399209L || arg0.method27132(-679640864) != this.anInt3938 * -2112777235) {
			throw new IllegalStateException("");
		}
		@Pc(26) Iterator local26 = this.aLinkedList1.iterator();
		while (local26.hasNext()) {
			@Pc(33) Interface26 local33 = (Interface26) local26.next();
			local33.method27029(arg0, 1896589581);
		}
		arg0.method27163(-938472085);
	}

	@OriginalMember(owner = "client!gc", name = "f", descriptor = "(Lclient!gz;)V")
	public void method26882(@OriginalArg(0) Class305 arg0) {
		if (this.aLong359 * -9118945719094571859L != arg0.aLong367 * -6266481680064399209L || arg0.method27132(1833156820) != this.anInt3938 * -2112777235) {
			throw new IllegalStateException("");
		}
		@Pc(26) Iterator local26 = this.aLinkedList1.iterator();
		while (local26.hasNext()) {
			@Pc(33) Interface26 local33 = (Interface26) local26.next();
			local33.method27029(arg0, 1896589581);
		}
		arg0.method27163(-953362148);
	}
}
