package com.jagex;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ul")
public final class Class596 implements Runnable {

	@OriginalMember(owner = "client!ul", name = "i", descriptor = "Ljava/io/IOException;")
	IOException anIOException1;

	@OriginalMember(owner = "client!ul", name = "m", descriptor = "Z")
	boolean aBoolean925;

	@OriginalMember(owner = "client!ul", name = "l", descriptor = "I")
	int anInt5358 = 0;

	@OriginalMember(owner = "client!ul", name = "g", descriptor = "I")
	int anInt5357 = 0;

	@OriginalMember(owner = "client!ul", name = "f", descriptor = "Ljava/io/OutputStream;")
	OutputStream anOutputStream2;

	@OriginalMember(owner = "client!ul", name = "e", descriptor = "I")
	int anInt5359;

	@OriginalMember(owner = "client!ul", name = "u", descriptor = "[B")
	byte[] aByteArray106;

	@OriginalMember(owner = "client!ul", name = "t", descriptor = "Ljava/lang/Thread;")
	Thread aThread10;

	@OriginalMember(owner = "client!ul", name = "s", descriptor = "(I)V")
	static void method31993(@OriginalArg(0) int arg0) {
		@Pc(6) Class40 local6 = Class3.method70("2", client.aClass722_4.aString247, false, -2121077095);
		Class120_Sub1_Sub1_Sub4.aClass110_Sub1_1.method7298(local6, (short) 11067);
	}

	@OriginalMember(owner = "client!ul", name = "ej", descriptor = "(Lclient!yp;B)V")
	static void method31994(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class152.method14627(local11, local14, arg0, (byte) -99);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lclient!aly;Lclient!aly;IZIZI)I")
	static int method31995(@OriginalArg(0) Class163_Sub1 arg0, @OriginalArg(1) Class163_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		@Pc(6) int local6 = Class546.method31207(arg0, arg1, arg2, arg3, -1612874740);
		if (local6 != 0) {
			return arg3 ? -local6 : local6;
		} else if (arg4 == -1) {
			return 0;
		} else {
			@Pc(28) int local28 = Class546.method31207(arg0, arg1, arg4, arg5, -1992499195);
			return arg5 ? -local28 : local28;
		}
	}

	@OriginalMember(owner = "client!ul", name = "gn", descriptor = "(I)[Lclient!aaz;")
	public static Class26[] method31996(@OriginalArg(0) int arg0) {
		if (Class413.aClass26Array1 == null) {
			@Pc(5) Class26[] local5 = Class152.method14626(Class518.aClass14_1, -1537318013);
			@Pc(9) Class26[] local9 = new Class26[local5.length];
			@Pc(11) int local11 = 0;
			@Pc(16) int local16 = Class703.aClass80_Sub37_49.aClass165_Sub8_1.method15974(-1166750209);
			label71: for (@Pc(18) int local18 = 0; local18 < local5.length; local18++) {
				@Pc(26) Class26 local26 = local5[local18];
				if ((local26.anInt79 * 1710030443 <= 0 || local26.anInt79 * 1710030443 >= 24) && local26.anInt81 * -1249901293 >= 800 && local26.anInt80 * -2004120797 >= 600 && (local16 != 2 || local26.anInt81 * -1249901293 <= 800 && local26.anInt80 * -2004120797 <= 600) && (local16 != 1 || local26.anInt81 * -1249901293 <= 1024 && local26.anInt80 * -2004120797 <= 768)) {
					for (@Pc(85) int local85 = 0; local85 < local11; local85++) {
						@Pc(92) Class26 local92 = local9[local85];
						if (local26.anInt81 * -1249901293 == local92.anInt81 * -1249901293 && local26.anInt80 * -2004120797 == local92.anInt80 * -2004120797) {
							if (local26.anInt79 * 1710030443 > local92.anInt79 * 1710030443) {
								local9[local85] = local26;
							}
							continue label71;
						}
					}
					local9[local11] = local26;
					local11++;
				}
			}
			Class413.aClass26Array1 = new Class26[local11];
			System.arraycopy(local9, 0, Class413.aClass26Array1, 0, local11);
			@Pc(146) int[] local146 = new int[Class413.aClass26Array1.length];
			for (@Pc(148) int local148 = 0; local148 < Class413.aClass26Array1.length; local148++) {
				@Pc(156) Class26 local156 = Class413.aClass26Array1[local148];
				local146[local148] = local156.anInt80 * -2004120797 * local156.anInt81 * -1249901293;
			}
			Class106.method18203(local146, Class413.aClass26Array1, 822380513);
		}
		return Class413.aClass26Array1;
	}

	@OriginalMember(owner = "client!ul", name = "nz", descriptor = "(J)Ljava/lang/String;")
	static String method31997(@OriginalArg(0) long arg0) {
		return Class296.method26971(new Date(arg0), "EEE dd-MMM-yyyy HH:mm:ss zzz", (byte) 8);
	}

	@OriginalMember(owner = "client!ul", name = "ah", descriptor = "(IIIII)V")
	static void method31998(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(4, (long) arg0);
		local4.method22135(-457826299);
		local4.anInt3064 = arg1 * -1221031713;
		local4.anInt3047 = arg2 * 673180539;
		local4.anInt3063 = arg3 * 1039565185;
	}

	@OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
	Class596(@OriginalArg(0) OutputStream arg0, @OriginalArg(1) int arg1) {
		this.anOutputStream2 = arg0;
		this.anInt5359 = (arg1 + 1) * 1403820513;
		this.aByteArray106 = new byte[this.anInt5359 * 1512663585];
		this.aThread10 = new Thread(this);
		this.aThread10.setDaemon(true);
		this.aThread10.start();
	}

	@OriginalMember(owner = "client!ul", name = "q", descriptor = "()V")
	public void method31978() {
		do {
			@Pc(29) int local29;
			synchronized (this) {
				while (true) {
					if (this.anIOException1 != null) {
						return;
					}
					if (this.anInt5358 * -593718053 <= this.anInt5357 * 1082561915) {
						local29 = this.anInt5357 * 1082561915 - this.anInt5358 * -593718053;
					} else {
						local29 = this.anInt5357 * 1082561915 + (this.anInt5359 * 1512663585 - this.anInt5358 * -593718053);
					}
					if (local29 > 0) {
						break;
					}
					try {
						this.anOutputStream2.flush();
					} catch (@Pc(53) IOException local53) {
						this.anIOException1 = local53;
						return;
					}
					if (this.method31979(-242617167)) {
						return;
					}
					try {
						this.wait();
					} catch (@Pc(70) InterruptedException local70) {
					}
				}
			}
			try {
				if (this.anInt5358 * -593718053 + local29 <= this.anInt5359 * 1512663585) {
					this.anOutputStream2.write(this.aByteArray106, this.anInt5358 * -593718053, local29);
				} else {
					@Pc(111) int local111 = this.anInt5359 * 1512663585 - this.anInt5358 * -593718053;
					this.anOutputStream2.write(this.aByteArray106, this.anInt5358 * -593718053, local111);
					this.anOutputStream2.write(this.aByteArray106, 0, local29 - local111);
				}
			} catch (@Pc(132) IOException local132x) {
				@Pc(132) IOException local132 = local132x;
				synchronized (this) {
					this.anIOException1 = local132;
					return;
				}
			}
			synchronized (this) {
				this.anInt5358 = (this.anInt5358 * -593718053 + local29) % (this.anInt5359 * 1512663585) * 1154041683;
			}
		} while (!this.method31979(191286665));
	}

	@OriginalMember(owner = "client!ul", name = "t", descriptor = "(I)Z")
	boolean method31979(@OriginalArg(0) int arg0) {
		if (!this.aBoolean925) {
			return false;
		}
		try {
			this.anOutputStream2.close();
			if (this.anIOException1 == null) {
				this.anIOException1 = new IOException("");
			}
		} catch (@Pc(16) IOException local16) {
			if (this.anIOException1 == null) {
				this.anIOException1 = new IOException(local16);
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ul", name = "run", descriptor = "()V")
	@Override
	public void run() {
		do {
			@Pc(29) int local29;
			synchronized (this) {
				while (true) {
					if (this.anIOException1 != null) {
						return;
					}
					if (this.anInt5358 * -593718053 <= this.anInt5357 * 1082561915) {
						local29 = this.anInt5357 * 1082561915 - this.anInt5358 * -593718053;
					} else {
						local29 = this.anInt5357 * 1082561915 + (this.anInt5359 * 1512663585 - this.anInt5358 * -593718053);
					}
					if (local29 > 0) {
						break;
					}
					try {
						this.anOutputStream2.flush();
					} catch (@Pc(53) IOException local53) {
						this.anIOException1 = local53;
						return;
					}
					if (this.method31979(247823467)) {
						return;
					}
					try {
						this.wait();
					} catch (@Pc(70) InterruptedException local70) {
					}
				}
			}
			try {
				if (this.anInt5358 * -593718053 + local29 <= this.anInt5359 * 1512663585) {
					this.anOutputStream2.write(this.aByteArray106, this.anInt5358 * -593718053, local29);
				} else {
					@Pc(111) int local111 = this.anInt5359 * 1512663585 - this.anInt5358 * -593718053;
					this.anOutputStream2.write(this.aByteArray106, this.anInt5358 * -593718053, local111);
					this.anOutputStream2.write(this.aByteArray106, 0, local29 - local111);
				}
			} catch (@Pc(132) IOException local132x) {
				@Pc(132) IOException local132 = local132x;
				synchronized (this) {
					this.anIOException1 = local132;
					return;
				}
			}
			synchronized (this) {
				this.anInt5358 = (this.anInt5358 * -593718053 + local29) % (this.anInt5359 * 1512663585) * 1154041683;
			}
		} while (!this.method31979(1894240734));
	}

	@OriginalMember(owner = "client!ul", name = "f", descriptor = "([BIIB)V")
	void method31980(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) throws IOException {
		if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
			throw new IOException();
		}
		synchronized (this) {
			if (this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			@Pc(53) int local53;
			if (this.anInt5358 * -593718053 <= this.anInt5357 * 1082561915) {
				local53 = this.anInt5359 * 1512663585 - this.anInt5357 * 1082561915 + this.anInt5358 * -593718053 - 1;
			} else {
				local53 = this.anInt5358 * -593718053 - this.anInt5357 * 1082561915 - 1;
			}
			if (local53 < arg2) {
				throw new IOException("");
			}
			if (arg2 + this.anInt5357 * 1082561915 <= this.anInt5359 * 1512663585) {
				System.arraycopy(arg0, arg1, this.aByteArray106, this.anInt5357 * 1082561915, arg2);
			} else {
				@Pc(106) int local106 = this.anInt5359 * 1512663585 - this.anInt5357 * 1082561915;
				System.arraycopy(arg0, arg1, this.aByteArray106, this.anInt5357 * 1082561915, local106);
				System.arraycopy(arg0, local106 + arg1, this.aByteArray106, 0, arg2 - local106);
			}
			this.anInt5357 = (this.anInt5357 * 1082561915 + arg2) % (this.anInt5359 * 1512663585) * 686817715;
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!ul", name = "e", descriptor = "(I)V")
	void method31981(@OriginalArg(0) int arg0) {
		synchronized (this) {
			this.aBoolean925 = true;
			this.notifyAll();
		}
		try {
			this.aThread10.join();
		} catch (@Pc(21) InterruptedException local21) {
		}
	}

	@OriginalMember(owner = "client!ul", name = "u", descriptor = "(I)V")
	void method31982(@OriginalArg(0) int arg0) {
		this.anOutputStream2 = new OutputStream_Sub1();
	}

	@OriginalMember(owner = "client!ul", name = "s", descriptor = "()V")
	void method31983() {
		this.anOutputStream2 = new OutputStream_Sub1();
	}

	@OriginalMember(owner = "client!ul", name = "l", descriptor = "()Z")
	boolean method31984() {
		if (!this.aBoolean925) {
			return false;
		}
		try {
			this.anOutputStream2.close();
			if (this.anIOException1 == null) {
				this.anIOException1 = new IOException("");
			}
		} catch (@Pc(16) IOException local16) {
			if (this.anIOException1 == null) {
				this.anIOException1 = new IOException(local16);
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ul", name = "o", descriptor = "([BII)V")
	void method31985(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
			throw new IOException();
		}
		synchronized (this) {
			if (this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			@Pc(53) int local53;
			if (this.anInt5358 * -593718053 <= this.anInt5357 * 1082561915) {
				local53 = this.anInt5359 * 1512663585 - this.anInt5357 * 1082561915 + this.anInt5358 * -593718053 - 1;
			} else {
				local53 = this.anInt5358 * -593718053 - this.anInt5357 * 1082561915 - 1;
			}
			if (local53 < arg2) {
				throw new IOException("");
			}
			if (arg2 + this.anInt5357 * 1082561915 <= this.anInt5359 * 1512663585) {
				System.arraycopy(arg0, arg1, this.aByteArray106, this.anInt5357 * 1082561915, arg2);
			} else {
				@Pc(106) int local106 = this.anInt5359 * 1512663585 - this.anInt5357 * 1082561915;
				System.arraycopy(arg0, arg1, this.aByteArray106, this.anInt5357 * 1082561915, local106);
				System.arraycopy(arg0, local106 + arg1, this.aByteArray106, 0, arg2 - local106);
			}
			this.anInt5357 = (this.anInt5357 * 1082561915 + arg2) % (this.anInt5359 * 1512663585) * 686817715;
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!ul", name = "i", descriptor = "()Z")
	boolean method31986() {
		if (!this.aBoolean925) {
			return false;
		}
		try {
			this.anOutputStream2.close();
			if (this.anIOException1 == null) {
				this.anIOException1 = new IOException("");
			}
		} catch (@Pc(16) IOException local16) {
			if (this.anIOException1 == null) {
				this.anIOException1 = new IOException(local16);
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ul", name = "m", descriptor = "([BII)V")
	void method31987(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
			throw new IOException();
		}
		synchronized (this) {
			if (this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			@Pc(53) int local53;
			if (this.anInt5358 * -593718053 <= this.anInt5357 * 1082561915) {
				local53 = this.anInt5359 * 1512663585 - this.anInt5357 * 1082561915 + this.anInt5358 * -593718053 - 1;
			} else {
				local53 = this.anInt5358 * -593718053 - this.anInt5357 * 1082561915 - 1;
			}
			if (local53 < arg2) {
				throw new IOException("");
			}
			if (arg2 + this.anInt5357 * 1082561915 <= this.anInt5359 * 1512663585) {
				System.arraycopy(arg0, arg1, this.aByteArray106, this.anInt5357 * 1082561915, arg2);
			} else {
				@Pc(106) int local106 = this.anInt5359 * 1512663585 - this.anInt5357 * 1082561915;
				System.arraycopy(arg0, arg1, this.aByteArray106, this.anInt5357 * 1082561915, local106);
				System.arraycopy(arg0, local106 + arg1, this.aByteArray106, 0, arg2 - local106);
			}
			this.anInt5357 = (this.anInt5357 * 1082561915 + arg2) % (this.anInt5359 * 1512663585) * 686817715;
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!ul", name = "k", descriptor = "()V")
	void method31988() {
		this.anOutputStream2 = new OutputStream_Sub1();
	}

	@OriginalMember(owner = "client!ul", name = "j", descriptor = "()V")
	void method31989() {
		synchronized (this) {
			this.aBoolean925 = true;
			this.notifyAll();
		}
		try {
			this.aThread10.join();
		} catch (@Pc(21) InterruptedException local21) {
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "()V")
	void method31990() {
		this.anOutputStream2 = new OutputStream_Sub1();
	}

	@OriginalMember(owner = "client!ul", name = "g", descriptor = "()Z")
	boolean method31991() {
		if (!this.aBoolean925) {
			return false;
		}
		try {
			this.anOutputStream2.close();
			if (this.anIOException1 == null) {
				this.anIOException1 = new IOException("");
			}
		} catch (@Pc(16) IOException local16) {
			if (this.anIOException1 == null) {
				this.anIOException1 = new IOException(local16);
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ul", name = "h", descriptor = "()V")
	public void method31992() {
		do {
			@Pc(29) int local29;
			synchronized (this) {
				while (true) {
					if (this.anIOException1 != null) {
						return;
					}
					if (this.anInt5358 * -593718053 <= this.anInt5357 * 1082561915) {
						local29 = this.anInt5357 * 1082561915 - this.anInt5358 * -593718053;
					} else {
						local29 = this.anInt5357 * 1082561915 + (this.anInt5359 * 1512663585 - this.anInt5358 * -593718053);
					}
					if (local29 > 0) {
						break;
					}
					try {
						this.anOutputStream2.flush();
					} catch (@Pc(53) IOException local53) {
						this.anIOException1 = local53;
						return;
					}
					if (this.method31979(-486268745)) {
						return;
					}
					try {
						this.wait();
					} catch (@Pc(70) InterruptedException local70) {
					}
				}
			}
			try {
				if (this.anInt5358 * -593718053 + local29 <= this.anInt5359 * 1512663585) {
					this.anOutputStream2.write(this.aByteArray106, this.anInt5358 * -593718053, local29);
				} else {
					@Pc(111) int local111 = this.anInt5359 * 1512663585 - this.anInt5358 * -593718053;
					this.anOutputStream2.write(this.aByteArray106, this.anInt5358 * -593718053, local111);
					this.anOutputStream2.write(this.aByteArray106, 0, local29 - local111);
				}
			} catch (@Pc(132) IOException local132x) {
				@Pc(132) IOException local132 = local132x;
				synchronized (this) {
					this.anIOException1 = local132;
					return;
				}
			}
			synchronized (this) {
				this.anInt5358 = (this.anInt5358 * -593718053 + local29) % (this.anInt5359 * 1512663585) * 1154041683;
			}
		} while (!this.method31979(-334743628));
	}
}
