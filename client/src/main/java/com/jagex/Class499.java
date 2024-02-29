package com.jagex;

import java.net.InetAddress;
import java.net.UnknownHostException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public class Class499 implements Runnable {

	@OriginalMember(owner = "client!q", name = "n", descriptor = "Ljava/lang/String;")
	volatile String aString219;

	@OriginalMember(owner = "client!q", name = "e", descriptor = "Ljava/net/InetAddress;")
	InetAddress anInetAddress2;

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "(I)V", line = 10)
	Class499(@OriginalArg(0) int arg0) throws UnknownHostException {
		this.anInetAddress2 = InetAddress.getByAddress(new byte[] { (byte) (arg0 >> 24 & 0xFF), (byte) (arg0 >> 16 & 0xFF), (byte) (arg0 >> 8 & 0xFF), (byte) (arg0 & 0xFF) });
	}

	@OriginalMember(owner = "client!q", name = "m", descriptor = "()Ljava/lang/String;", line = 15)
	public String method30139() {
		return this.aString219;
	}

	@OriginalMember(owner = "client!q", name = "e", descriptor = "(I)Ljava/lang/String;", line = 15)
	public String method30140(@OriginalArg(0) int arg0) {
		return this.aString219;
	}

	@OriginalMember(owner = "client!q", name = "n", descriptor = "()Ljava/lang/String;", line = 15)
	public String method30141() {
		return this.aString219;
	}

	@OriginalMember(owner = "client!q", name = "k", descriptor = "()Ljava/lang/String;", line = 15)
	public String method30142() {
		return this.aString219;
	}

	@OriginalMember(owner = "client!q", name = "run", descriptor = "()V", line = 19)
	@Override
	public void run() {
		this.aString219 = this.anInetAddress2.getHostName();
	}

	@OriginalMember(owner = "client!q", name = "c", descriptor = "()V", line = 19)
	public void method30143() {
		this.aString219 = this.anInetAddress2.getHostName();
	}

	@OriginalMember(owner = "client!q", name = "r", descriptor = "()V", line = 19)
	public void method30144() {
		this.aString219 = this.anInetAddress2.getHostName();
	}

	@OriginalMember(owner = "client!q", name = "o", descriptor = "()V", line = 19)
	public void method30145() {
		this.aString219 = this.anInetAddress2.getHostName();
	}

	@OriginalMember(owner = "client!q", name = "v", descriptor = "()V", line = 19)
	public void method30146() {
		this.aString219 = this.anInetAddress2.getHostName();
	}

	@OriginalMember(owner = "client!q", name = "k", descriptor = "(II)Z", line = 80)
	public static boolean method30147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 0 || arg0 == 2;
	}

	@OriginalMember(owner = "client!q", name = "at", descriptor = "(II)I", line = 479)
	public static int method30148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Class625.aTwitchWebcamFrameData1 = null;
		Class625.aClass100_51 = null;
		return arg0 >= 0 && arg0 < Class625.aTwitchWebcamDeviceArray1.length ? Class166_Sub13.aTwitchTV1.StopWebcamDevice(Class625.aTwitchWebcamDeviceArray1[arg0].k * -1975853991) : -1;
	}

	@OriginalMember(owner = "client!q", name = "lk", descriptor = "(Ljava/lang/String;Lclient!yf;I)[Ljava/lang/Object;", line = 7133)
	static final Object[] method30149(@OriginalArg(0) String arg0, @OriginalArg(1) Class681 arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Object[] local5 = new Object[arg0.length() + 1];
		@Pc(10) int local10;
		for (local10 = local5.length - 1; local10 >= 1; local10--) {
			if (arg0.charAt(local10 - 1) == 's') {
				local5[local10] = arg1.anObjectArray45[(arg1.anInt5888 -= 957530791) * 587908375];
			} else if (arg0.charAt(local10 - 1) == 'l') {
				local5[local10] = Long.valueOf(arg1.aLongArray27[(arg1.anInt5894 -= -1364417339) * -2000995827]);
			} else {
				local5[local10] = Integer.valueOf(arg1.anIntArray519[(arg1.anInt5891 -= 1189701933) * -1497248091]);
			}
		}
		local10 = arg1.anIntArray519[(arg1.anInt5891 -= 1189701933) * -1497248091];
		if (local10 == -1) {
			local5 = null;
		} else {
			local5[0] = Integer.valueOf(local10);
		}
		return local5;
	}

	@OriginalMember(owner = "client!q", name = "ua", descriptor = "(Lclient!yf;B)V", line = 8589)
	static final void method30150(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, 1745511088);
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local16.anInt3989 * 1868441863;
	}

	@OriginalMember(owner = "client!q", name = "adh", descriptor = "(Lclient!yf;I)V", line = 10098)
	static final void method30151(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = arg0.aClass93_Sub28_4.aByte55;
	}

	@OriginalMember(owner = "client!q", name = "aki", descriptor = "(Lclient!yf;B)V", line = 11582)
	static final void method30152(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(15) Class93_Sub1_Sub20 local15 = Class93_Sub12.method13453((byte) 1);
		if (local15 != null) {
			@Pc(35) boolean local35 = local15.method23174(local12 >> 28 & 0x3, local12 >> 14 & 0x3FFF, local12 & 0x3FFF, Class687.anIntArray525, -237230590);
			if (local35) {
				Class110_Sub5.method7655(Class687.anIntArray525[1], Class687.anIntArray525[2], 2114545008);
			}
		}
	}

	@OriginalMember(owner = "client!q", name = "bdl", descriptor = "(Lclient!yf;I)V", line = 14703)
	static final void method30153(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		Class78.method1315(local12, -33406833);
	}
}
