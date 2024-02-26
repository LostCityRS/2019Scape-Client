package com.jagex;

import jaclib.ping.Ping;
import java.awt.Container;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import java.net.InetAddress;
import java.util.LinkedList;
import java.util.Queue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ye")
public final class Class680 implements Runnable {

	@OriginalMember(owner = "client!ye", name = "f", descriptor = "Ljava/lang/Object;")
	final Object anObject27 = new Object();

	@OriginalMember(owner = "client!ye", name = "t", descriptor = "Ljava/util/Queue;")
	final Queue aQueue4 = new LinkedList();

	@OriginalMember(owner = "client!ye", name = "e", descriptor = "Ljava/lang/Thread;")
	Thread aThread12 = new Thread(this);

	@OriginalMember(owner = "client!ye", name = "bt", descriptor = "(Lclient!yp;I)V")
	static void method33636(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		if (arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581] == 1) {
			arg0.anInt5780 += arg0.anIntArray526[arg0.anInt5780 * -1336568839] * -1216954807;
		}
	}

	@OriginalMember(owner = "client!ye", name = "aoz", descriptor = "(Lclient!yp;I)V")
	static void method33637(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(24) float local24 = Class467.method29716(arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1]);
		@Pc(29) Class80_Sub1_Sub13 local29 = Class160.aClass121_Sub1_2.method9598(local13, 531254025);
		if (local29 == null) {
			throw new RuntimeException("");
		} else if (local29 instanceof Class80_Sub1_Sub13_Sub1) {
			((Class80_Sub1_Sub13_Sub1) local29).method23695(local24, 2111231319);
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!ye", name = "h", descriptor = "(Lclient!zl;I)V")
	static void method33638(@OriginalArg(0) Class710 arg0, @OriginalArg(1) int arg1) {
		Class138.aClass710_3 = arg0;
		Class2_Sub1.aString13 = null;
	}

	@OriginalMember(owner = "client!ye", name = "l", descriptor = "([BI)Lclient!cm;")
	static Class99 method33639(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		if (arg0 == null) {
			throw new RuntimeException("");
		}
		while (true) {
			try {
				@Pc(10) Image local10 = Toolkit.getDefaultToolkit().createImage(arg0);
				@Pc(13) Container local13 = Class60.method1187(557862145);
				@Pc(18) MediaTracker local18 = new MediaTracker(local13);
				local18.addImage(local10, 0);
				local18.waitForAll();
				@Pc(28) int local28 = local10.getWidth(local13);
				@Pc(32) int local32 = local10.getHeight(local13);
				if (!local18.isErrorAny() && local28 >= 0 && local32 >= 0) {
					@Pc(49) int[] local49 = new int[local32 * local28];
					@Pc(61) PixelGrabber local61 = new PixelGrabber(local10, 0, 0, local28, local32, local49, 0, local28);
					local61.grabPixels();
					return Class279.aClass102_9.method20741(local49, 0, local28, local28, local32, -1657536790);
				}
				throw new RuntimeException("");
			} catch (@Pc(74) InterruptedException local74) {
			}
		}
	}

	@OriginalMember(owner = "client!ye", name = "ahw", descriptor = "(Lclient!yp;I)V")
	static void method33640(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5776 -= -1650379242;
		@Pc(14) String local14 = (String) arg0.anObjectArray46[arg0.anInt5776 * -2070619997];
		@Pc(25) String local25 = (String) arg0.anObjectArray46[arg0.anInt5776 * -2070619997 + 1];
		arg0.anInt5778 -= -221471862;
		@Pc(39) int local39 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(49) int local49 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		if (local25 == null) {
			local25 = "";
		}
		if (local25.length() > 80) {
			local25 = local25.substring(0, 80);
		}
		@Pc(66) Class75 local66 = Class52.method1074(16777215);
		@Pc(72) Class80_Sub31 local72 = Class623.method32440(Class443.aClass443_13, local66.aClass22_1, -191270971);
		local72.aPacketBit_2.p1(Class350.method28013(local14, (short) 16383) + 2 + Class350.method28013(local25, (short) 16383));
		local72.aPacketBit_2.pjstr(local14);
		local72.aPacketBit_2.p1(local39 - 1);
		local72.aPacketBit_2.p1(local49);
		local72.aPacketBit_2.pjstr(local25);
		local66.method1325(local72, (byte) -97);
	}

	@OriginalMember(owner = "client!ye", name = "r", descriptor = "(Lclient!ey;Lclient!an;I)I")
	static int method33641(@OriginalArg(0) Interface24 arg0, @OriginalArg(1) Interface12 arg1, @OriginalArg(2) int arg2) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < arg1.method18051(645600483); local3++) {
			@Pc(14) Class352 local14 = (Class352) arg1.method18054(local3, -1894808821);
			if (local14.method28032(arg0, -124718032)) {
				local1 += local14.anInt4260 * 1673510067;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!ye", name = "<init>", descriptor = "()V")
	public Class680() {
		this.aThread12.setDaemon(true);
		this.aThread12.start();
	}

	@OriginalMember(owner = "client!ye", name = "l", descriptor = "(Ljava/lang/String;)Lclient!yr;")
	public Class692 method33625(@OriginalArg(0) String arg0) {
		if (this.aThread12 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(19) Class692 local19 = new Class692(arg0);
			this.method33628(local19, -1827464541);
			return local19;
		}
	}

	@OriginalMember(owner = "client!ye", name = "t", descriptor = "(Ljava/lang/String;B)Lclient!yr;")
	public Class692 method33626(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		if (this.aThread12 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(19) Class692 local19 = new Class692(arg0);
			this.method33628(local19, -1268686832);
			return local19;
		}
	}

	@OriginalMember(owner = "client!ye", name = "f", descriptor = "(I)V")
	public void method33627(@OriginalArg(0) int arg0) {
		if (this.aThread12 == null) {
			return;
		}
		this.method33628(this.anObject27, -1977611746);
		try {
			this.aThread12.join();
		} catch (@Pc(14) InterruptedException local14) {
		}
		this.aThread12 = null;
	}

	@OriginalMember(owner = "client!ye", name = "e", descriptor = "(Ljava/lang/Object;I)V")
	void method33628(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Queue local3 = this.aQueue4;
		synchronized (this.aQueue4) {
			this.aQueue4.add(arg0);
			this.aQueue4.notify();
		}
	}

	@OriginalMember(owner = "client!ye", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(3) Queue local3 = this.aQueue4;
			@Pc(30) Class692 local30;
			synchronized (this.aQueue4) {
				@Pc(8) Object local8;
				for (local8 = this.aQueue4.poll(); local8 == null; local8 = this.aQueue4.poll()) {
					try {
						this.aQueue4.wait();
					} catch (@Pc(15) InterruptedException local15) {
					}
				}
				if (this.anObject27 == local8) {
					return;
				}
				local30 = (Class692) local8;
			}
			@Pc(58) int local58;
			try {
				@Pc(43) byte[] local43 = InetAddress.getByName(local30.aString241).getAddress();
				local58 = Ping.t(local43[0], local43[1], local43[2], local43[3], 1000L);
			} catch (@Pc(60) Throwable local60) {
				local58 = 1000;
			}
			local30.anInt5782 = local58 * -1135211701;
		}
	}

	@OriginalMember(owner = "client!ye", name = "q", descriptor = "()V")
	public void method33629() {
		while (true) {
			@Pc(3) Queue local3 = this.aQueue4;
			@Pc(30) Class692 local30;
			synchronized (this.aQueue4) {
				@Pc(8) Object local8;
				for (local8 = this.aQueue4.poll(); local8 == null; local8 = this.aQueue4.poll()) {
					try {
						this.aQueue4.wait();
					} catch (@Pc(15) InterruptedException local15) {
					}
				}
				if (this.anObject27 == local8) {
					return;
				}
				local30 = (Class692) local8;
			}
			@Pc(58) int local58;
			try {
				@Pc(43) byte[] local43 = InetAddress.getByName(local30.aString241).getAddress();
				local58 = Ping.t(local43[0], local43[1], local43[2], local43[3], 1000L);
			} catch (@Pc(60) Throwable local60) {
				local58 = 1000;
			}
			local30.anInt5782 = local58 * -1135211701;
		}
	}

	@OriginalMember(owner = "client!ye", name = "h", descriptor = "()V")
	public void method33630() {
		while (true) {
			@Pc(3) Queue local3 = this.aQueue4;
			@Pc(30) Class692 local30;
			synchronized (this.aQueue4) {
				@Pc(8) Object local8;
				for (local8 = this.aQueue4.poll(); local8 == null; local8 = this.aQueue4.poll()) {
					try {
						this.aQueue4.wait();
					} catch (@Pc(15) InterruptedException local15) {
					}
				}
				if (this.anObject27 == local8) {
					return;
				}
				local30 = (Class692) local8;
			}
			@Pc(58) int local58;
			try {
				@Pc(43) byte[] local43 = InetAddress.getByName(local30.aString241).getAddress();
				local58 = Ping.t(local43[0], local43[1], local43[2], local43[3], 1000L);
			} catch (@Pc(60) Throwable local60) {
				local58 = 1000;
			}
			local30.anInt5782 = local58 * -1135211701;
		}
	}

	@OriginalMember(owner = "client!ye", name = "o", descriptor = "(Ljava/lang/Object;)V")
	void method33631(@OriginalArg(0) Object arg0) {
		@Pc(3) Queue local3 = this.aQueue4;
		synchronized (this.aQueue4) {
			this.aQueue4.add(arg0);
			this.aQueue4.notify();
		}
	}

	@OriginalMember(owner = "client!ye", name = "g", descriptor = "(Ljava/lang/String;)Lclient!yr;")
	public Class692 method33632(@OriginalArg(0) String arg0) {
		if (this.aThread12 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(19) Class692 local19 = new Class692(arg0);
			this.method33628(local19, -1052489752);
			return local19;
		}
	}

	@OriginalMember(owner = "client!ye", name = "i", descriptor = "()V")
	public void method33633() {
		if (this.aThread12 == null) {
			return;
		}
		this.method33628(this.anObject27, -1362919653);
		try {
			this.aThread12.join();
		} catch (@Pc(14) InterruptedException local14) {
		}
		this.aThread12 = null;
	}

	@OriginalMember(owner = "client!ye", name = "m", descriptor = "()V")
	public void method33634() {
		if (this.aThread12 == null) {
			return;
		}
		this.method33628(this.anObject27, -1619750542);
		try {
			this.aThread12.join();
		} catch (@Pc(14) InterruptedException local14) {
		}
		this.aThread12 = null;
	}

	@OriginalMember(owner = "client!ye", name = "u", descriptor = "(Ljava/lang/String;)Lclient!yr;")
	public Class692 method33635(@OriginalArg(0) String arg0) {
		if (this.aThread12 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(19) Class692 local19 = new Class692(arg0);
			this.method33628(local19, -815779449);
			return local19;
		}
	}
}
