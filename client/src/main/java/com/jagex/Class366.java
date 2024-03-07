package com.jagex;

import java.awt.Container;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jr")
public class Class366 implements Interface30 {

	@OriginalMember(owner = "client!jr", name = "aa", descriptor = "I")
	static int anInt4584;

	@OriginalMember(owner = "client!jr", name = "hg", descriptor = "Lclient!aoj;")
	public static Class32_Sub8 aClass32_Sub8_1;

	@OriginalMember(owner = "client!jr", name = "um", descriptor = "I")
	static int anInt4585;

	@OriginalMember(owner = "client!jr", name = "e", descriptor = "[B")
	static final byte[] aByteArray86 = new byte[] { 31, -117, 8, 0, 0, 0, 0, 0, 0, 0, -5, 127, -29, -1, 109, 6, 103, 6, 14, 54, 54, 118, 54, 86, 14, 118, 118, 118, 78, 78, 14, 46, 30, 17, 94, 30, 110, 110, 30, 73, 33, 97, 126, 17, 89, 41, 121, 57, 89, 41, 25, 25, 5, 21, 61, 117, 5, 37, 29, 101, 25, 25, 13, 115, 77, 29, 3, 67, 19, 19, 19, 121, 117, 75, 91, 11, 35, 27, 61, 99, 19, 35, -112, 33, -116, -100, -100, -100, 60, -36, 60, 18, -68, -68, 18, 70, -118, 50, -118, 70, 36, -125, -1, 7, 24, 68, 56, 24, 24, 25, 24, 89, 24, -107, 24, -104, 4, 25, -103, 5, 25, 89, -108, 24, -2, 31, 97, -112, 103, 96, 96, 100, 101, 4, 3, 6, 40, 96, 100, 98, 102, 97, 101, 99, -25, -32, -28, -30, 6, 42, -40, 42, -64, -64, -60, -56, -52, -52, -60, -62, -52, -54, -54, -62, 2, -108, -83, 5, -54, 51, -80, 8, -78, 10, 41, 26, 58, -78, 9, 7, 38, -78, 43, 21, -118, 24, 53, 78, 92, -56, -95, -20, -76, -15, -96, 104, -48, -59, 15, 42, -58, 73, 69, 77, -100, 92, 98, -30, 18, -110, 82, -86, 106, -22, 26, -102, 90, 38, -90, 102, -26, 22, -106, 86, -50, 46, -82, 110, -18, 30, -98, 94, -63, 33, -95, 97, -31, 17, -111, 81, -55, 41, -87, 105, -23, 25, -103, 89, -59, 37, -91, 101, -27, 21, -107, 85, -51, 45, -83, 109, -19, 29, -99, 93, -109, 38, 79, -103, 58, 109, -6, -116, -103, -77, 22, 45, 94, -78, 116, -39, -14, 21, 43, 87, 109, -38, -68, 101, -21, -74, -19, 59, 118, -18, 58, 116, -8, -56, -47, 99, -57, 79, -100, 60, 117, -23, -14, -107, -85, -41, -82, -33, -72, 121, -21, -31, -93, -57, 79, -98, 62, 123, -2, -30, -27, -85, -113, -97, 62, 127, -7, -6, -19, -5, -113, -97, -65, 64, -2, 98, 100, 96, 102, -124, 1, -84, -2, 18, 4, -6, -117, -119, -123, -123, -103, -123, 29, -28, 47, 70, -90, 114, -112, 2, 65, 22, 86, 69, 67, 54, 33, -57, 64, -10, -60, 66, 97, 37, -93, 70, 14, 17, -89, -119, 11, 55, 30, -28, 84, 54, 14, -6, 32, -102, 84, 116, -111, 75, 76, -59, -28, -95, -22, 71, -112, -41, -64, 62, 35, -50, 99, 77, 100, -7, 12, -18, 49, -124, -65, 110, 49, -16, -79, 48, 2, -29, 15, -24, 78, 6, 6, 123, -122, -97, -1, -70, 52, 22, -16, -49, 127, -79, -88, -21, -1, 77, 0, 38, 27, -28, 10, 110, 2, 0, 0 };

	@OriginalMember(owner = "client!jr", name = "n", descriptor = "Lclient!eb;")
	static Class240 aClass240_80 = new Class240(128, 4);

	@OriginalMember(owner = "client!jr", name = "u", descriptor = "Z")
	boolean aBoolean735;

	@OriginalMember(owner = "client!jr", name = "l", descriptor = "Lclient!dh;")
	Class104 aClass104_9;

	@OriginalMember(owner = "client!jr", name = "m", descriptor = "Lclient!adn;")
	final Class86 aClass86_1;

	@OriginalMember(owner = "client!jr", name = "f", descriptor = "I")
	final int anInt4582;

	@OriginalMember(owner = "client!jr", name = "w", descriptor = "I")
	final int anInt4583;

	@OriginalMember(owner = "client!jr", name = "k", descriptor = "[Lclient!kx;")
	final Interface33[] anInterface33Array1;

	@OriginalMember(owner = "client!jr", name = "d", descriptor = "()V", line = 30)
	static void method27937() {
		aClass240_80.method25847((byte) -81);
	}

	@OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(Lclient!adn;IILclient!kq;)V", line = 33)
	Class366(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class385 arg3) {
		this.aClass86_1 = arg0;
		this.anInt4582 = arg1 * 1044255561;
		this.anInt4583 = arg2 * 2125182441;
		this.anInterface33Array1 = new Interface33[this.aClass86_1.anInterface32Array1.length];
		for (@Pc(23) int local23 = 0; local23 < this.anInterface33Array1.length; local23++) {
			this.anInterface33Array1[local23] = arg3.method28158(this.aClass86_1.anInterface32Array1[local23], -1951974654);
		}
	}

	@OriginalMember(owner = "client!jr", name = "l", descriptor = "(S)V", line = 44)
	@Override
	public void method27923(@OriginalArg(0) short arg0) {
		if (this.aClass104_9 != Class694.aClass104_14) {
			this.aClass104_9 = Class694.aClass104_14;
			this.aBoolean735 = true;
		}
		this.aClass104_9.method20829(3, 0);
		@Pc(17) Interface33[] local17 = this.anInterface33Array1;
		for (@Pc(19) int local19 = 0; local19 < local17.length; local19++) {
			@Pc(27) Interface33 local27 = local17[local19];
			if (local27 != null) {
				local27.method28280(851032478);
			}
		}
	}

	@OriginalMember(owner = "client!jr", name = "j", descriptor = "()V", line = 44)
	@Override
	public void method27931() {
		if (this.aClass104_9 != Class694.aClass104_14) {
			this.aClass104_9 = Class694.aClass104_14;
			this.aBoolean735 = true;
		}
		this.aClass104_9.method20829(3, 0);
		@Pc(17) Interface33[] local17 = this.anInterface33Array1;
		for (@Pc(19) int local19 = 0; local19 < local17.length; local19++) {
			@Pc(27) Interface33 local27 = local17[local19];
			if (local27 != null) {
				local27.method28280(851032478);
			}
		}
	}

	@OriginalMember(owner = "client!jr", name = "ac", descriptor = "(Z)V", line = 59)
	@Override
	public void method27935(@OriginalArg(0) boolean arg0) {
		@Pc(1) boolean local1 = true;
		@Pc(4) Interface33[] local4 = this.anInterface33Array1;
		for (@Pc(6) int local6 = 0; local6 < local4.length; local6++) {
			@Pc(14) Interface33 local14 = local4[local6];
			if (local14 != null) {
				local14.method28285(local1 || this.aBoolean735, 391061364);
			}
		}
		this.aBoolean735 = false;
	}

	@OriginalMember(owner = "client!jr", name = "ai", descriptor = "(Z)V", line = 59)
	@Override
	public void method27929(@OriginalArg(0) boolean arg0) {
		@Pc(1) boolean local1 = true;
		@Pc(4) Interface33[] local4 = this.anInterface33Array1;
		for (@Pc(6) int local6 = 0; local6 < local4.length; local6++) {
			@Pc(14) Interface33 local14 = local4[local6];
			if (local14 != null) {
				local14.method28285(local1 || this.aBoolean735, -107676086);
			}
		}
		this.aBoolean735 = false;
	}

	@OriginalMember(owner = "client!jr", name = "m", descriptor = "(ZI)V", line = 59)
	@Override
	public void method27924(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(1) boolean local1 = true;
		@Pc(4) Interface33[] local4 = this.anInterface33Array1;
		for (@Pc(6) int local6 = 0; local6 < local4.length; local6++) {
			@Pc(14) Interface33 local14 = local4[local6];
			if (local14 != null) {
				local14.method28285(local1 || this.aBoolean735, -615987823);
			}
		}
		this.aBoolean735 = false;
	}

	@OriginalMember(owner = "client!jr", name = "ae", descriptor = "()I", line = 71)
	@Override
	public int method27927() {
		@Pc(1) int local1 = 0;
		@Pc(4) Interface33[] local4 = this.anInterface33Array1;
		for (@Pc(6) int local6 = 0; local6 < local4.length; local6++) {
			@Pc(14) Interface33 local14 = local4[local6];
			if (local14 == null || local14.method28279(-547429242)) {
				local1++;
			}
		}
		return local1 * 100 / this.anInterface33Array1.length;
	}

	@OriginalMember(owner = "client!jr", name = "u", descriptor = "(I)I", line = 71)
	@Override
	public int method27932(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(4) Interface33[] local4 = this.anInterface33Array1;
		for (@Pc(6) int local6 = 0; local6 < local4.length; local6++) {
			@Pc(14) Interface33 local14 = local4[local6];
			if (local14 == null || local14.method28279(-1895283544)) {
				local1++;
			}
		}
		return local1 * 100 / this.anInterface33Array1.length;
	}

	@OriginalMember(owner = "client!jr", name = "t", descriptor = "()I", line = 71)
	@Override
	public int method27928() {
		@Pc(1) int local1 = 0;
		@Pc(4) Interface33[] local4 = this.anInterface33Array1;
		for (@Pc(6) int local6 = 0; local6 < local4.length; local6++) {
			@Pc(14) Interface33 local14 = local4[local6];
			if (local14 == null || local14.method28279(-703366)) {
				local1++;
			}
		}
		return local1 * 100 / this.anInterface33Array1.length;
	}

	@OriginalMember(owner = "client!jr", name = "w", descriptor = "(B)V", line = 82)
	@Override
	public void method27925(@OriginalArg(0) byte arg0) {
	}

	@OriginalMember(owner = "client!jr", name = "i", descriptor = "()V", line = 82)
	@Override
	public void method27934() {
	}

	@OriginalMember(owner = "client!jr", name = "z", descriptor = "(J)Z", line = 85)
	@Override
	public boolean method27926(@OriginalArg(0) long arg0) {
		return Class305.method26797(-370456410) >= arg0 + (long) (this.anInt4582 * 516378361);
	}

	@OriginalMember(owner = "client!jr", name = "ag", descriptor = "(J)Z", line = 85)
	@Override
	public boolean method27930(@OriginalArg(0) long arg0) {
		return Class305.method26797(367667206) >= arg0 + (long) (this.anInt4582 * 516378361);
	}

	@OriginalMember(owner = "client!jr", name = "r", descriptor = "(Lclient!py;I)Lclient!cm;", line = 89)
	public static Class100 method27938(@OriginalArg(0) Class497 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class100 local5 = (Class100) aClass240_80.method25829((long) arg1);
		if (local5 == null) {
			if (Class362.aBoolean729) {
				local5 = Class694.aClass104_14.method20589(Class203.method24653(arg0, arg1), true);
			} else {
				local5 = Class288.method26547(arg0.method30079(arg1, (byte) 119), 1492785929);
			}
			aClass240_80.method25838(local5, (long) arg1);
		}
		return local5;
	}

	@OriginalMember(owner = "client!jr", name = "c", descriptor = "(Lclient!py;I)Lclient!cm;", line = 89)
	public static Class100 method27939(@OriginalArg(0) Class497 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class100 local5 = (Class100) aClass240_80.method25829((long) arg1);
		if (local5 == null) {
			if (Class362.aBoolean729) {
				local5 = Class694.aClass104_14.method20589(Class203.method24653(arg0, arg1), true);
			} else {
				local5 = Class288.method26547(arg0.method30079(arg1, (byte) 27), 1068195550);
			}
			aClass240_80.method25838(local5, (long) arg1);
		}
		return local5;
	}

	@OriginalMember(owner = "client!jr", name = "v", descriptor = "(Lclient!py;I)Lclient!cm;", line = 89)
	public static Class100 method27940(@OriginalArg(0) Class497 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class100 local5 = (Class100) aClass240_80.method25829((long) arg1);
		if (local5 == null) {
			if (Class362.aBoolean729) {
				local5 = Class694.aClass104_14.method20589(Class203.method24653(arg0, arg1), true);
			} else {
				local5 = Class288.method26547(arg0.method30079(arg1, (byte) 72), -129582697);
			}
			aClass240_80.method25838(local5, (long) arg1);
		}
		return local5;
	}

	@OriginalMember(owner = "client!jr", name = "s", descriptor = "()Z", line = 100)
	static boolean method27941() {
		try {
			@Pc(3) Class91 local3 = new Class91();
			@Pc(8) byte[] local8 = local3.method1703(aByteArray86, -1260067008);
			Class288.method26547(local8, -96259959);
			return true;
		} catch (@Pc(15) Exception local15) {
			return false;
		}
	}

	@OriginalMember(owner = "client!jr", name = "o", descriptor = "()Z", line = 100)
	static boolean method27942() {
		try {
			@Pc(3) Class91 local3 = new Class91();
			@Pc(8) byte[] local8 = local3.method1703(aByteArray86, 887838131);
			Class288.method26547(local8, -974850973);
			return true;
		} catch (@Pc(15) Exception local15) {
			return false;
		}
	}

	@OriginalMember(owner = "client!jr", name = "y", descriptor = "()Z", line = 100)
	static boolean method27943() {
		try {
			@Pc(3) Class91 local3 = new Class91();
			@Pc(8) byte[] local8 = local3.method1703(aByteArray86, 1366940594);
			Class288.method26547(local8, -400960712);
			return true;
		} catch (@Pc(15) Exception local15) {
			return false;
		}
	}

	@OriginalMember(owner = "client!jr", name = "q", descriptor = "()Z", line = 100)
	static boolean method27944() {
		try {
			@Pc(3) Class91 local3 = new Class91();
			@Pc(8) byte[] local8 = local3.method1703(aByteArray86, -1441451908);
			Class288.method26547(local8, 349835396);
			return true;
		} catch (@Pc(15) Exception local15) {
			return false;
		}
	}

	@OriginalMember(owner = "client!jr", name = "x", descriptor = "()Z", line = 100)
	static boolean method27945() {
		try {
			@Pc(3) Class91 local3 = new Class91();
			@Pc(8) byte[] local8 = local3.method1703(aByteArray86, -714356314);
			Class288.method26547(local8, 1168319153);
			return true;
		} catch (@Pc(15) Exception local15) {
			return false;
		}
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "([B)Lclient!cm;", line = 111)
	static Class100 method27946(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			throw new RuntimeException("");
		}
		while (true) {
			try {
				@Pc(11) Image local11 = Toolkit.getDefaultToolkit().createImage(arg0);
				@Pc(14) Container local14 = Class504.method30196(-283088421);
				@Pc(19) MediaTracker local19 = new MediaTracker(local14);
				local19.addImage(local11, 0);
				local19.waitForAll();
				@Pc(29) int local29 = local11.getWidth(local14);
				@Pc(33) int local33 = local11.getHeight(local14);
				if (!local19.isErrorAny() && local29 >= 0 && local33 >= 0) {
					@Pc(50) int[] local50 = new int[local33 * local29];
					@Pc(62) PixelGrabber local62 = new PixelGrabber(local11, 0, 0, local29, local33, local50, 0, local29);
					local62.grabPixels();
					return Class694.aClass104_14.method20487(local50, 0, local29, local29, local33, 438797212);
				}
				throw new RuntimeException("");
			} catch (@Pc(75) InterruptedException local75) {
			}
		}
	}

	@OriginalMember(owner = "client!jr", name = "ah", descriptor = "()I", line = 132)
	@Override
	public int method27933() {
		return this.anInt4583 * 426537561;
	}

	@OriginalMember(owner = "client!jr", name = "p", descriptor = "(B)I", line = 132)
	@Override
	public int method27922(@OriginalArg(0) byte arg0) {
		return this.anInt4583 * 426537561;
	}

	@OriginalMember(owner = "client!jr", name = "al", descriptor = "()I", line = 132)
	@Override
	public int method27936() {
		return this.anInt4583 * 426537561;
	}

	@OriginalMember(owner = "client!jr", name = "f", descriptor = "(II)S", line = 147)
	public static short method27947(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) int local5 = arg0 >> 10 & 0x3F;
		@Pc(11) int local11 = arg0 >> 3 & 0x70;
		@Pc(15) int local15 = arg0 & 0x7F;
		@Pc(32) int local32 = local15 <= 64 ? local11 * local15 >> 7 : (127 - local15) * local11 >> 7;
		@Pc(36) int local36 = local15 + local32;
		@Pc(45) int local45;
		if (local36 == 0) {
			local45 = local32 << 1;
		} else {
			local45 = (local32 << 8) / local36;
		}
		return (short) (local5 << 10 | local45 >> 4 << 7 | local36);
	}

	@OriginalMember(owner = "client!jr", name = "fl", descriptor = "(Lclient!yf;I)V", line = 5978)
	static final void method27948(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, 1080859204);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class341.method27498(local16, local22, arg0, -757503877);
	}

	@OriginalMember(owner = "client!jr", name = "qp", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;B)V", line = 7867)
	static final void method27949(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) byte arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt5888 -= 957530791) * 587908375];
		if (Class532.method30597(local13, arg2, 1518522314) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray35 = Class499.method30149(local13, arg2, 2116949236);
		arg0.aBoolean680 = true;
	}

	@OriginalMember(owner = "client!jr", name = "aiz", descriptor = "(Lclient!yf;I)V", line = 11295)
	static final void method27950(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(15) Class175 local15 = Class330.method27371(-1899288836);
		@Pc(21) ClientMessage local21 = Class102.createGameMessage(ClientProt.aClientProt_31, local15.clientIsaac, (byte) 7);
		local21.packet.p1(0, (byte) -6);
		@Pc(32) int local32 = local21.packet.pos * 212851357;
		local21.packet.p1(local12, (byte) -55);
		local21.packet.p2(arg0.aClass434_1.anInt4807 * 526894191, 2143091659);
		arg0.aClass434_1.aClass93_Sub1_Sub18_1.method22924(local21.packet, arg0.aClass434_1.anIntArray445, -1891254382);
		local21.packet.psize1(local21.packet.pos * 212851357 - local32, (byte) 70);
		local15.send(local21, -1659915406);
	}

	@OriginalMember(owner = "client!jr", name = "baf", descriptor = "(Lclient!yf;S)V", line = 14249)
	static final void method27951(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
	}
}
