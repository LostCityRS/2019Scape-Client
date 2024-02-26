package com.jagex;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.LinkedList;
import java.util.Queue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!d")
public final class Class220 implements Runnable {

	@OriginalMember(owner = "client!d", name = "f", descriptor = "Z")
	volatile boolean aBoolean751;

	@OriginalMember(owner = "client!d", name = "e", descriptor = "Ljava/util/Queue;")
	Queue aQueue2 = new LinkedList();

	@OriginalMember(owner = "client!d", name = "t", descriptor = "Ljava/lang/Thread;")
	final Thread aThread5 = new Thread(this);

	@OriginalMember(owner = "client!d", name = "e", descriptor = "(II)Lclient!dc;")
	static Class222 method25902(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class222 local6 = (Class222) Class80_Sub39.method15030(Class287.method26906(-1961523904), arg0, -2090261299);
		if (local6 == null) {
			local6 = Class222.aClass222_1;
		}
		return local6;
	}

	@OriginalMember(owner = "client!d", name = "t", descriptor = "(II)Lclient!jv;")
	static Class368 method25903(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Class368.aClass368_4.anInt4501 * -803963017 == arg0) {
			return Class368.aClass368_4;
		} else if (arg0 == Class368.aClass368_3.anInt4501 * -803963017) {
			return Class368.aClass368_3;
		} else if (arg0 == Class368.aClass368_5.anInt4501 * -803963017) {
			return Class368.aClass368_5;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!d", name = "afg", descriptor = "(Lclient!yp;B)V")
	static void method25904(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5776 -= -1650379242;
		@Pc(14) String local14 = (String) arg0.anObjectArray46[arg0.anInt5776 * -2070619997];
		@Pc(25) String local25 = (String) arg0.anObjectArray46[arg0.anInt5776 * -2070619997 + 1];
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = local14 + local25;
	}

	@OriginalMember(owner = "client!d", name = "af", descriptor = "(Lclient!yp;I)V")
	static void method25905(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = arg0.anObjectArray45[arg0.anIntArray526[arg0.anInt5780 * -1336568839]];
	}

	@OriginalMember(owner = "client!d", name = "f", descriptor = "(IIZI)I")
	public static int method25906(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class80_Sub3 local4 = Class565.method31482(arg0, arg2, -1960448636);
		if (local4 == null) {
			return 0;
		} else if (arg1 >= 0 && arg1 < local4.anIntArray178.length) {
			return local4.anIntArray178[arg1];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!d", name = "m", descriptor = "(J)V")
	static void method25907(@OriginalArg(0) long arg0) {
		Class62.aCalendar1.setTime(new Date(arg0));
	}

	@OriginalMember(owner = "client!d", name = "<init>", descriptor = "()V")
	Class220() {
		this.aThread5.setPriority(1);
		this.aThread5.start();
	}

	@OriginalMember(owner = "client!d", name = "f", descriptor = "(I)V")
	void method25895(@OriginalArg(0) int arg0) {
		this.aBoolean751 = true;
		try {
			synchronized (this) {
				this.notify();
			}
			this.aThread5.join();
		} catch (@Pc(21) InterruptedException local21) {
		}
	}

	@OriginalMember(owner = "client!d", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean751) {
			try {
				@Pc(11) Class118 local11;
				synchronized (this) {
					local11 = (Class118) this.aQueue2.poll();
					if (local11 == null) {
						try {
							this.wait();
						} catch (@Pc(18) InterruptedException local18) {
						}
						continue;
					}
				}
				try {
					@Pc(33) URLConnection local33 = local11.anURL1.openConnection();
					local33.setConnectTimeout(30000);
					@Pc(39) int local39 = local33.getContentLength();
					if (local39 >= 0) {
						@Pc(44) byte[] local44 = new byte[local39];
						(new DataInputStream(local33.getInputStream())).readFully(local44);
						local11.aByteArray31 = local44;
					}
					local11.aBoolean188 = true;
				} catch (@Pc(59) IOException local59) {
					local11.aBoolean188 = true;
				}
			} catch (@Pc(64) Exception local64) {
				Class603.method32133(null, local64, 839300151);
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "h", descriptor = "()V")
	public void method25896() {
		while (!this.aBoolean751) {
			try {
				@Pc(11) Class118 local11;
				synchronized (this) {
					local11 = (Class118) this.aQueue2.poll();
					if (local11 == null) {
						try {
							this.wait();
						} catch (@Pc(18) InterruptedException local18) {
						}
						continue;
					}
				}
				try {
					@Pc(33) URLConnection local33 = local11.anURL1.openConnection();
					local33.setConnectTimeout(30000);
					@Pc(39) int local39 = local33.getContentLength();
					if (local39 >= 0) {
						@Pc(44) byte[] local44 = new byte[local39];
						(new DataInputStream(local33.getInputStream())).readFully(local44);
						local11.aByteArray31 = local44;
					}
					local11.aBoolean188 = true;
				} catch (@Pc(59) IOException local59) {
					local11.aBoolean188 = true;
				}
			} catch (@Pc(64) Exception local64) {
				Class603.method32133(null, local64, 839300151);
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "t", descriptor = "(Ljava/net/URL;I)Lclient!ah;")
	Class118 method25897(@OriginalArg(0) URL arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class118 local4 = new Class118(arg0);
		synchronized (this) {
			this.aQueue2.add(local4);
			this.notify();
			return local4;
		}
	}

	@OriginalMember(owner = "client!d", name = "q", descriptor = "()V")
	public void method25898() {
		while (!this.aBoolean751) {
			try {
				@Pc(11) Class118 local11;
				synchronized (this) {
					local11 = (Class118) this.aQueue2.poll();
					if (local11 == null) {
						try {
							this.wait();
						} catch (@Pc(18) InterruptedException local18) {
						}
						continue;
					}
				}
				try {
					@Pc(33) URLConnection local33 = local11.anURL1.openConnection();
					local33.setConnectTimeout(30000);
					@Pc(39) int local39 = local33.getContentLength();
					if (local39 >= 0) {
						@Pc(44) byte[] local44 = new byte[local39];
						(new DataInputStream(local33.getInputStream())).readFully(local44);
						local11.aByteArray31 = local44;
					}
					local11.aBoolean188 = true;
				} catch (@Pc(59) IOException local59) {
					local11.aBoolean188 = true;
				}
			} catch (@Pc(64) Exception local64) {
				Class603.method32133(null, local64, 839300151);
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "e", descriptor = "(Ljava/net/URL;)Lclient!ah;")
	Class118 method25899(@OriginalArg(0) URL arg0) {
		@Pc(4) Class118 local4 = new Class118(arg0);
		synchronized (this) {
			this.aQueue2.add(local4);
			this.notify();
			return local4;
		}
	}

	@OriginalMember(owner = "client!d", name = "u", descriptor = "(Ljava/net/URL;)Lclient!ah;")
	Class118 method25900(@OriginalArg(0) URL arg0) {
		@Pc(4) Class118 local4 = new Class118(arg0);
		synchronized (this) {
			this.aQueue2.add(local4);
			this.notify();
			return local4;
		}
	}

	@OriginalMember(owner = "client!d", name = "l", descriptor = "()V")
	void method25901() {
		this.aBoolean751 = true;
		try {
			synchronized (this) {
				this.notify();
			}
			this.aThread5.join();
		} catch (@Pc(21) InterruptedException local21) {
		}
	}
}
