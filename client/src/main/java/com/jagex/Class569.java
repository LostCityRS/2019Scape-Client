package com.jagex;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tg")
public final class Class569 {

	@OriginalMember(owner = "client!tg", name = "fj", descriptor = "[Lclient!aij;")
	public static Class143_Sub1[] aClass143_Sub1Array2;

	@OriginalMember(owner = "client!tg", name = "e", descriptor = "Ljava/util/List;")
	public List aList22 = new LinkedList();

	@OriginalMember(owner = "client!tg", name = "n", descriptor = "Z")
	boolean aBoolean823 = false;

	@OriginalMember(owner = "client!tg", name = "m", descriptor = "I")
	int anInt5550 = 0;

	@OriginalMember(owner = "client!tg", name = "k", descriptor = "I")
	int anInt5551 = 0;

	@OriginalMember(owner = "client!tg", name = "jl", descriptor = "(Lclient!yf;I)V")
	static void method31485(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= 1189701933;
	}

	@OriginalMember(owner = "client!tg", name = "xg", descriptor = "(Lclient!yf;B)V")
	static void method31486(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method20000(353018298);
	}

	@OriginalMember(owner = "client!tg", name = "axl", descriptor = "(Lclient!yf;B)V")
	static void method31487(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = client.aBoolean623 && !client.aBoolean635 ? 1 : 0;
	}

	@OriginalMember(owner = "client!tg", name = "bdg", descriptor = "(Lclient!yf;I)V")
	static void method31488(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = client.aClass270_1.method26371(local13, 1999645105).method26459(local23, (byte) 68);
	}

	@OriginalMember(owner = "client!tg", name = "wz", descriptor = "(Lclient!yf;B)V")
	static void method31489(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt6052 -= 463840436;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		@Pc(33) int local33 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 2];
		@Pc(43) int local43 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 3];
		@Pc(45) short local45 = 256;
		Class274.aClass258_11.method26167(Class275.aClass275_9, local13, local23, local43, Class280.aClass280_7.method26543(-1006787270), Class278.aClass278_2, 0.0F, 0.0F, null, 0, local45, local33, 574439781);
	}

	@OriginalMember(owner = "client!tg", name = "bck", descriptor = "(Lclient!yf;I)V")
	static void method31490(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
	}

	@OriginalMember(owner = "client!tg", name = "hd", descriptor = "(Lclient!yf;I)V")
	static void method31491(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, 225700157);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class12.method188(local16, local22, true, 0, arg0, 1691862116);
	}

	@OriginalMember(owner = "client!tg", name = "z", descriptor = "(IIIIIII)J")
	public static long method31492(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		Class69.aCalendar2.clear();
		Class69.aCalendar2.set(arg5, arg4, arg3, arg2, arg1, arg0);
		return Class69.aCalendar2.getTime().getTime();
	}

	@OriginalMember(owner = "client!tg", name = "wx", descriptor = "(Lclient!yf;S)V")
	static void method31493(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		arg0.anInt6052 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class32.method17838(local13, local23, false, -1942720199);
	}

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(Z)V")
	Class569(@OriginalArg(0) boolean arg0) {
		this.aBoolean823 = arg0;
	}

	@OriginalMember(owner = "client!tg", name = "m", descriptor = "()V")
	public void method31480() {
		@Pc(3) Iterator local3 = this.aList22.iterator();
		while (local3.hasNext()) {
			@Pc(10) Class573 local10 = (Class573) local3.next();
			local3.remove();
			Class305.method26891(local10, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!tg", name = "e", descriptor = "(I)V")
	public void method31481(@OriginalArg(0) int arg0) {
		@Pc(3) Iterator local3 = this.aList22.iterator();
		while (local3.hasNext()) {
			@Pc(10) Class573 local10 = (Class573) local3.next();
			local3.remove();
			Class305.method26891(local10, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!tg", name = "f", descriptor = "(Lclient!tl;)V")
	void method31482(@OriginalArg(0) Class573 arg0) {
		@Pc(2) Class132_Sub1 local2 = arg0.aClass132_Sub1_25;
		@Pc(4) boolean local4 = true;
		@Pc(8) Class241[] local8 = arg0.aClass132_Sub1_25.aClass241Array21;
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			if (local8[local10].aBoolean667) {
				local4 = false;
				break;
			}
		}
		if (local4) {
			return;
		}
		arg0.aClass569_1 = this;
		@Pc(44) Class573 local44;
		if (this.aBoolean823) {
			@Pc(37) Iterator local37 = this.aList22.iterator();
			while (local37.hasNext()) {
				local44 = (Class573) local37.next();
				if (local2 == local44.aClass132_Sub1_25) {
					local37.remove();
					Class305.method26891(local44, (byte) 0);
				}
			}
		}
		@Pc(58) ListIterator local58 = this.aList22.listIterator();
		do {
			if (!local58.hasNext()) {
				this.aList22.add(arg0);
				return;
			}
			local44 = (Class573) local58.next();
		} while (local2.anInt3290 * 1998180051 < local44.aClass132_Sub1_25.anInt3290 * 1998180051);
		local58.previous();
		local58.add(arg0);
	}

	@OriginalMember(owner = "client!tg", name = "k", descriptor = "(Lclient!tl;)V")
	void method31483(@OriginalArg(0) Class573 arg0) {
		@Pc(2) Class132_Sub1 local2 = arg0.aClass132_Sub1_25;
		@Pc(4) boolean local4 = true;
		@Pc(8) Class241[] local8 = arg0.aClass132_Sub1_25.aClass241Array21;
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			if (local8[local10].aBoolean667) {
				local4 = false;
				break;
			}
		}
		if (local4) {
			return;
		}
		arg0.aClass569_1 = this;
		@Pc(44) Class573 local44;
		if (this.aBoolean823) {
			@Pc(37) Iterator local37 = this.aList22.iterator();
			while (local37.hasNext()) {
				local44 = (Class573) local37.next();
				if (local2 == local44.aClass132_Sub1_25) {
					local37.remove();
					Class305.method26891(local44, (byte) 0);
				}
			}
		}
		@Pc(58) ListIterator local58 = this.aList22.listIterator();
		do {
			if (!local58.hasNext()) {
				this.aList22.add(arg0);
				return;
			}
			local44 = (Class573) local58.next();
		} while (local2.anInt3290 * 1998180051 < local44.aClass132_Sub1_25.anInt3290 * 1998180051);
		local58.previous();
		local58.add(arg0);
	}

	@OriginalMember(owner = "client!tg", name = "n", descriptor = "(Lclient!tl;B)V")
	void method31484(@OriginalArg(0) Class573 arg0, @OriginalArg(1) byte arg1) {
		@Pc(2) Class132_Sub1 local2 = arg0.aClass132_Sub1_25;
		@Pc(4) boolean local4 = true;
		@Pc(8) Class241[] local8 = arg0.aClass132_Sub1_25.aClass241Array21;
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			if (local8[local10].aBoolean667) {
				local4 = false;
				break;
			}
		}
		if (local4) {
			return;
		}
		arg0.aClass569_1 = this;
		@Pc(44) Class573 local44;
		if (this.aBoolean823) {
			@Pc(37) Iterator local37 = this.aList22.iterator();
			while (local37.hasNext()) {
				local44 = (Class573) local37.next();
				if (local2 == local44.aClass132_Sub1_25) {
					local37.remove();
					Class305.method26891(local44, (byte) 0);
				}
			}
		}
		@Pc(58) ListIterator local58 = this.aList22.listIterator();
		do {
			if (!local58.hasNext()) {
				this.aList22.add(arg0);
				return;
			}
			local44 = (Class573) local58.next();
		} while (local2.anInt3290 * 1998180051 < local44.aClass132_Sub1_25.anInt3290 * 1998180051);
		local58.previous();
		local58.add(arg0);
	}
}
