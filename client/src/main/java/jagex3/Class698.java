package jagex3;

import jaclib.ping.Ping;
import java.net.InetAddress;
import java.util.LinkedList;
import java.util.Queue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!yz")
public final class Class698 implements Runnable {

	@OriginalMember(owner = "client!yz", name = "o", descriptor = "I")
	public static int anInt6112;

	@OriginalMember(owner = "client!yz", name = "e", descriptor = "Ljava/lang/Object;")
	final Object anObject27 = new Object();

	@OriginalMember(owner = "client!yz", name = "m", descriptor = "Ljava/util/Queue;")
	final Queue aQueue4 = new LinkedList();

	@OriginalMember(owner = "client!yz", name = "n", descriptor = "Ljava/lang/Thread;")
	Thread aThread12 = new Thread(this);

	@OriginalMember(owner = "client!yz", name = "bej", descriptor = "(Lclient!yf;I)V")
	static void method36880(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= -725861497;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		@Pc(33) int local33 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 2];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = client.aClass270_1.method26371(local13, -1956499376).method26480(local23, local33, (byte) -73) == null ? 0 : 1;
	}

	@OriginalMember(owner = "client!yz", name = "bfk", descriptor = "(Lclient!yf;I)V")
	static void method36881(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= 1189701933;
	}

	@OriginalMember(owner = "client!yz", name = "je", descriptor = "(Lclient!hf;IIB)V")
	public static void method36882(@OriginalArg(0) Class312 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		if (arg0 == null) {
			return;
		}
		if (arg0.anObjectArray11 != null) {
			@Pc(11) Class93_Sub39 local11 = new Class93_Sub39();
			local11.aClass312_1 = arg0;
			local11.anObjectArray4 = arg0.anObjectArray11;
			Class211.method25522(local11, 937522854);
		}
		client.aBoolean627 = true;
		Class148.anInt1394 = arg0.anInt3994 * 664644211;
		client.anInt3523 = arg0.anInt4011 * -1454450261;
		Class253.anInt3892 = arg1 * 1642625757;
		Class650.anInt5958 = arg2 * 1110131489;
		client.anInt3524 = arg0.anInt4086 * 563589339;
		Class271.anInt3926 = arg0.anInt4027 * -1372374255;
		client.anInt3520 = arg0.anInt4067 * -793288463;
		Class354.method27789(arg0, -1174743804);
	}

	@OriginalMember(owner = "client!yz", name = "m", descriptor = "(Lclient!alw;I)V")
	static void method36883(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0.method22644((byte) -82);
		Class632.aClass648Array1 = new Class648[local3];
		@Pc(8) int local8;
		for (local8 = 0; local8 < local3; local8++) {
			Class632.aClass648Array1[local8] = new Class648();
			Class632.aClass648Array1[local8].anInt5955 = arg0.method22644((byte) -22) * -58277581;
			Class632.aClass648Array1[local8].aString246 = arg0.method22440(98739723);
		}
		Class607.anInt5721 = arg0.method22644((byte) -37) * -174531729;
		Class361.anInt4732 = arg0.method22644((byte) -127) * -1231507063;
		Class606.anInt5718 = arg0.method22644((byte) -121) * 470817221;
		Class632.aClass154_Sub1Array2 = new Class154_Sub1[Class361.anInt4732 * 977343673 - Class607.anInt5721 * 1855382415 + 1];
		for (local8 = 0; local8 < Class606.anInt5718 * 2035023117; local8++) {
			@Pc(75) int local75 = arg0.method22644((byte) -71);
			@Pc(83) Class154_Sub1 local83 = Class632.aClass154_Sub1Array2[local75] = new Class154_Sub1();
			local83.anInt1651 = arg0.method22425((short) 16384) * 88439695;
			local83.anInt1650 = arg0.method22431(-118643075) * 445350423;
			local83.anInt1653 = arg0.method22644((byte) -35) * -875570153;
			if (local83.anInt1653 * -2080957529 != 0) {
				local83.aString48 = arg0.method22440(-218643179);
			}
			local83.anInt1654 = (Class607.anInt5721 * 1855382415 + local75) * 142830605;
			local83.aString47 = arg0.method22440(-39955437);
			local83.aString46 = arg0.method22440(885791896);
		}
		Class632.anInt5881 = arg0.method22431(-118643075) * -537572227;
		Class632.aBoolean860 = true;
	}

	@OriginalMember(owner = "client!yz", name = "<init>", descriptor = "()V")
	public Class698() {
		this.aThread12.setDaemon(true);
		this.aThread12.start();
	}

	@OriginalMember(owner = "client!yz", name = "n", descriptor = "(I)V")
	public void method36862(@OriginalArg(0) int arg0) {
		if (this.aThread12 == null) {
			return;
		}
		this.method36865(this.anObject27, 1189646962);
		try {
			this.aThread12.join();
		} catch (@Pc(14) InterruptedException local14) {
		}
		this.aThread12 = null;
	}

	@OriginalMember(owner = "client!yz", name = "s", descriptor = "(Ljava/lang/Object;)V")
	void method36863(@OriginalArg(0) Object arg0) {
		@Pc(3) Queue local3 = this.aQueue4;
		synchronized (this.aQueue4) {
			this.aQueue4.add(arg0);
			this.aQueue4.notify();
		}
	}

	@OriginalMember(owner = "client!yz", name = "r", descriptor = "()V")
	public void method36864() {
		while (true) {
			@Pc(3) Queue local3 = this.aQueue4;
			@Pc(30) Class678 local30;
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
				local30 = (Class678) local8;
			}
			@Pc(58) int local58;
			try {
				@Pc(43) byte[] local43 = InetAddress.getByName(local30.aString248).getAddress();
				local58 = Ping.method27877(local43[0], local43[1], local43[2], local43[3], 1000L);
			} catch (@Pc(60) Throwable local60) {
				local58 = 1000;
			}
			local30.anInt6047 = local58 * -1127574683;
		}
	}

	@OriginalMember(owner = "client!yz", name = "m", descriptor = "(Ljava/lang/Object;I)V")
	void method36865(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Queue local3 = this.aQueue4;
		synchronized (this.aQueue4) {
			this.aQueue4.add(arg0);
			this.aQueue4.notify();
		}
	}

	@OriginalMember(owner = "client!yz", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(3) Queue local3 = this.aQueue4;
			@Pc(30) Class678 local30;
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
				local30 = (Class678) local8;
			}
			@Pc(58) int local58;
			try {
				@Pc(43) byte[] local43 = InetAddress.getByName(local30.aString248).getAddress();
				local58 = Ping.method27877(local43[0], local43[1], local43[2], local43[3], 1000L);
			} catch (@Pc(60) Throwable local60) {
				local58 = 1000;
			}
			local30.anInt6047 = local58 * -1127574683;
		}
	}

	@OriginalMember(owner = "client!yz", name = "c", descriptor = "()V")
	public void method36866() {
		while (true) {
			@Pc(3) Queue local3 = this.aQueue4;
			@Pc(30) Class678 local30;
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
				local30 = (Class678) local8;
			}
			@Pc(58) int local58;
			try {
				@Pc(43) byte[] local43 = InetAddress.getByName(local30.aString248).getAddress();
				local58 = Ping.method27877(local43[0], local43[1], local43[2], local43[3], 1000L);
			} catch (@Pc(60) Throwable local60) {
				local58 = 1000;
			}
			local30.anInt6047 = local58 * -1127574683;
		}
	}

	@OriginalMember(owner = "client!yz", name = "w", descriptor = "(Ljava/lang/String;)Lclient!yb;")
	public Class678 method36867(@OriginalArg(0) String arg0) {
		if (this.aThread12 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(19) Class678 local19 = new Class678(arg0);
			this.method36865(local19, 1236131769);
			return local19;
		}
	}

	@OriginalMember(owner = "client!yz", name = "o", descriptor = "()V")
	public void method36868() {
		while (true) {
			@Pc(3) Queue local3 = this.aQueue4;
			@Pc(30) Class678 local30;
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
				local30 = (Class678) local8;
			}
			@Pc(58) int local58;
			try {
				@Pc(43) byte[] local43 = InetAddress.getByName(local30.aString248).getAddress();
				local58 = Ping.method27877(local43[0], local43[1], local43[2], local43[3], 1000L);
			} catch (@Pc(60) Throwable local60) {
				local58 = 1000;
			}
			local30.anInt6047 = local58 * -1127574683;
		}
	}

	@OriginalMember(owner = "client!yz", name = "v", descriptor = "()V")
	public void method36869() {
		while (true) {
			@Pc(3) Queue local3 = this.aQueue4;
			@Pc(30) Class678 local30;
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
				local30 = (Class678) local8;
			}
			@Pc(58) int local58;
			try {
				@Pc(43) byte[] local43 = InetAddress.getByName(local30.aString248).getAddress();
				local58 = Ping.method27877(local43[0], local43[1], local43[2], local43[3], 1000L);
			} catch (@Pc(60) Throwable local60) {
				local58 = 1000;
			}
			local30.anInt6047 = local58 * -1127574683;
		}
	}

	@OriginalMember(owner = "client!yz", name = "f", descriptor = "(Ljava/lang/String;)Lclient!yb;")
	public Class678 method36870(@OriginalArg(0) String arg0) {
		if (this.aThread12 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(19) Class678 local19 = new Class678(arg0);
			this.method36865(local19, 1959341179);
			return local19;
		}
	}

	@OriginalMember(owner = "client!yz", name = "q", descriptor = "(Ljava/lang/Object;)V")
	void method36871(@OriginalArg(0) Object arg0) {
		@Pc(3) Queue local3 = this.aQueue4;
		synchronized (this.aQueue4) {
			this.aQueue4.add(arg0);
			this.aQueue4.notify();
		}
	}

	@OriginalMember(owner = "client!yz", name = "l", descriptor = "()V")
	public void method36872() {
		if (this.aThread12 == null) {
			return;
		}
		this.method36865(this.anObject27, 1911229661);
		try {
			this.aThread12.join();
		} catch (@Pc(14) InterruptedException local14) {
		}
		this.aThread12 = null;
	}

	@OriginalMember(owner = "client!yz", name = "u", descriptor = "()V")
	public void method36873() {
		if (this.aThread12 == null) {
			return;
		}
		this.method36865(this.anObject27, 1223502905);
		try {
			this.aThread12.join();
		} catch (@Pc(14) InterruptedException local14) {
		}
		this.aThread12 = null;
	}

	@OriginalMember(owner = "client!yz", name = "z", descriptor = "()V")
	public void method36874() {
		if (this.aThread12 == null) {
			return;
		}
		this.method36865(this.anObject27, 1690927532);
		try {
			this.aThread12.join();
		} catch (@Pc(14) InterruptedException local14) {
		}
		this.aThread12 = null;
	}

	@OriginalMember(owner = "client!yz", name = "p", descriptor = "(Ljava/lang/Object;)V")
	void method36875(@OriginalArg(0) Object arg0) {
		@Pc(3) Queue local3 = this.aQueue4;
		synchronized (this.aQueue4) {
			this.aQueue4.add(arg0);
			this.aQueue4.notify();
		}
	}

	@OriginalMember(owner = "client!yz", name = "d", descriptor = "(Ljava/lang/Object;)V")
	void method36876(@OriginalArg(0) Object arg0) {
		@Pc(3) Queue local3 = this.aQueue4;
		synchronized (this.aQueue4) {
			this.aQueue4.add(arg0);
			this.aQueue4.notify();
		}
	}

	@OriginalMember(owner = "client!yz", name = "k", descriptor = "(Ljava/lang/String;)Lclient!yb;")
	public Class678 method36877(@OriginalArg(0) String arg0) {
		if (this.aThread12 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(19) Class678 local19 = new Class678(arg0);
			this.method36865(local19, 1926002660);
			return local19;
		}
	}

	@OriginalMember(owner = "client!yz", name = "y", descriptor = "(Ljava/lang/Object;)V")
	void method36878(@OriginalArg(0) Object arg0) {
		@Pc(3) Queue local3 = this.aQueue4;
		synchronized (this.aQueue4) {
			this.aQueue4.add(arg0);
			this.aQueue4.notify();
		}
	}

	@OriginalMember(owner = "client!yz", name = "e", descriptor = "(Ljava/lang/String;B)Lclient!yb;")
	public Class678 method36879(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		if (this.aThread12 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(19) Class678 local19 = new Class678(arg0);
			this.method36865(local19, 1842308744);
			return local19;
		}
	}
}
