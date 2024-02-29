package jagex3;

import java.awt.Frame;
import java.util.LinkedList;
import java.util.List;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vy")
public final class Class628 implements Interface67 {

	@OriginalMember(owner = "client!vy", name = "z", descriptor = "I")
	static int anInt5868;

	@OriginalMember(owner = "client!vy", name = "h", descriptor = "Ljava/awt/Frame;")
	protected static Frame aFrame2;

	@OriginalMember(owner = "client!vy", name = "e", descriptor = "[I")
	final int[] anIntArray502;

	@OriginalMember(owner = "client!vy", name = "f", descriptor = "(Lclient!alw;)Lclient!vy;")
	public static Class628 method32435(@OriginalArg(0) Class93_Sub41 arg0) {
		@Pc(3) int local3 = arg0.method22425((short) 16384);
		@Pc(6) int[] local6 = new int[local3];
		for (@Pc(8) int local8 = 0; local8 < local3; local8++) {
			local6[local8] = arg0.method22425((short) 16384);
		}
		return new Class628(local6);
	}

	@OriginalMember(owner = "client!vy", name = "amp", descriptor = "(Lclient!yf;B)V")
	static void method32436(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		Class285.method26611((byte) 0);
	}

	@OriginalMember(owner = "client!vy", name = "bcm", descriptor = "(Lclient!yf;I)V")
	static void method32437(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		Class688.method36701(arg0.aClass132_Sub1_Sub1_Sub1_4, arg0, -147160992);
	}

	@OriginalMember(owner = "client!vy", name = "bep", descriptor = "(Lclient!yf;I)V")
	static void method32438(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		@Pc(27) Class82 local27 = Class430.method28945(local13, 1040813347);
		if (local27 == null) {
			throw new RuntimeException();
		} else if (Class174.method24356(local13, (byte) -78) != client.anInt3424 * 2022627475) {
			throw new RuntimeException();
		} else if (Class173.aList3 == null && Class173.aList3.isEmpty()) {
			throw new RuntimeException();
		} else {
			@Pc(59) List local59 = local27.method1381(local23, 267023917);
			Class173.aList3 = new LinkedList(Class173.aList3);
			if (local59 == null) {
				Class173.aList3.clear();
			} else {
				Class173.aList3.retainAll(local59);
			}
			Class59.anIterator1 = Class173.aList3.iterator();
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class173.aList3.size();
		}
	}

	@OriginalMember(owner = "client!vy", name = "<init>", descriptor = "([I)V")
	Class628(@OriginalArg(0) int[] arg0) {
		this.anIntArray502 = arg0;
	}

	@OriginalMember(owner = "client!vy", name = "e", descriptor = "(Lclient!akm;[Lclient!ut;ILclient!ub;I)Z")
	@Override
	public boolean method32434(@OriginalArg(0) Class93_Sub23 arg0, @OriginalArg(1) Interface66[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class158 arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int[] local2 = this.anIntArray502;
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) int local12 = local2[local4];
			if (!arg3.method14308(local12, -310982969)) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!vy", name = "n", descriptor = "(Lclient!akm;[Lclient!ut;ILclient!ub;)Z")
	@Override
	public boolean method32433(@OriginalArg(0) Class93_Sub23 arg0, @OriginalArg(1) Interface66[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class158 arg3) {
		@Pc(2) int[] local2 = this.anIntArray502;
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) int local12 = local2[local4];
			if (!arg3.method14308(local12, 232050071)) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!vy", name = "m", descriptor = "(Lclient!akm;[Lclient!ut;ILclient!ub;)Z")
	@Override
	public boolean method32432(@OriginalArg(0) Class93_Sub23 arg0, @OriginalArg(1) Interface66[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class158 arg3) {
		@Pc(2) int[] local2 = this.anIntArray502;
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) int local12 = local2[local4];
			if (!arg3.method14308(local12, 699388049)) {
				return false;
			}
		}
		return true;
	}
}
