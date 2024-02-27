package com.jagex;

import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public final class Class594 implements Runnable {

	@OriginalMember(owner = "client!ug", name = "s", descriptor = "Lclient!arm;")
	static Class93_Sub1_Sub7 aClass93_Sub1_Sub7_6;

	@OriginalMember(owner = "client!ug", name = "u", descriptor = "Z")
	boolean aBoolean829;

	@OriginalMember(owner = "client!ug", name = "l", descriptor = "Ljava/io/IOException;")
	IOException anIOException2;

	@OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
	int anInt5642 = 0;

	@OriginalMember(owner = "client!ug", name = "w", descriptor = "I")
	int anInt5641 = 0;

	@OriginalMember(owner = "client!ug", name = "n", descriptor = "Ljava/io/OutputStream;")
	OutputStream anOutputStream2;

	@OriginalMember(owner = "client!ug", name = "m", descriptor = "I")
	int anInt5640;

	@OriginalMember(owner = "client!ug", name = "k", descriptor = "[B")
	byte[] aByteArray108;

	@OriginalMember(owner = "client!ug", name = "e", descriptor = "Ljava/lang/Thread;")
	Thread aThread10;

	@OriginalMember(owner = "client!ug", name = "m", descriptor = "(I)V")
	public static void method31921(@OriginalArg(0) int arg0) {
		Class411.anInt4882 = -522138941;
		Class411.anInt4911 = -898365362;
		Class411.anInt4910 = 1954204370;
	}

	@OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V")
	Class594(@OriginalArg(0) OutputStream arg0, @OriginalArg(1) int arg1) {
		this.anOutputStream2 = arg0;
		this.anInt5640 = (arg1 + 1) * -908772593;
		this.aByteArray108 = new byte[this.anInt5640 * 867718127];
		this.aThread10 = new Thread(this);
		this.aThread10.setDaemon(true);
		this.aThread10.start();
	}

	@OriginalMember(owner = "client!ug", name = "e", descriptor = "(B)Z")
	boolean method31905(@OriginalArg(0) byte arg0) {
		if (!this.aBoolean829) {
			return false;
		}
		try {
			this.anOutputStream2.close();
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException("");
			}
		} catch (@Pc(17) IOException local17) {
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException(local17);
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "()V")
	void method31906() {
		synchronized (this) {
			this.aBoolean829 = true;
			this.notifyAll();
		}
		try {
			this.aThread10.join();
		} catch (@Pc(21) InterruptedException local21) {
		}
	}

	@OriginalMember(owner = "client!ug", name = "u", descriptor = "()V")
	void method31907() {
		synchronized (this) {
			this.aBoolean829 = true;
			this.notifyAll();
		}
		try {
			this.aThread10.join();
		} catch (@Pc(21) InterruptedException local21) {
		}
	}

	@OriginalMember(owner = "client!ug", name = "n", descriptor = "([BIIB)V")
	void method31908(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) throws IOException {
		if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
			throw new IOException();
		}
		synchronized (this) {
			if (this.anIOException2 != null) {
				throw new IOException(this.anIOException2.toString());
			}
			@Pc(54) int local54;
			if (this.anInt5642 * 1068932297 <= this.anInt5641 * 1276035995) {
				local54 = this.anInt5642 * 1068932297 + (this.anInt5640 * 867718127 - this.anInt5641 * 1276035995) - 1;
			} else {
				local54 = this.anInt5642 * 1068932297 - this.anInt5641 * 1276035995 - 1;
			}
			if (local54 < arg2) {
				throw new IOException("");
			}
			if (this.anInt5641 * 1276035995 + arg2 <= this.anInt5640 * 867718127) {
				System.arraycopy(arg0, arg1, this.aByteArray108, this.anInt5641 * 1276035995, arg2);
			} else {
				@Pc(107) int local107 = this.anInt5640 * 867718127 - this.anInt5641 * 1276035995;
				System.arraycopy(arg0, arg1, this.aByteArray108, this.anInt5641 * 1276035995, local107);
				System.arraycopy(arg0, arg1 + local107, this.aByteArray108, 0, arg2 - local107);
			}
			this.anInt5641 = (arg2 + this.anInt5641 * 1276035995) % (this.anInt5640 * 867718127) * 718203539;
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!ug", name = "m", descriptor = "(B)V")
	void method31909(@OriginalArg(0) byte arg0) {
		synchronized (this) {
			this.aBoolean829 = true;
			this.notifyAll();
		}
		try {
			this.aThread10.join();
		} catch (@Pc(21) InterruptedException local21) {
		}
	}

	@OriginalMember(owner = "client!ug", name = "k", descriptor = "(I)V")
	void method31910(@OriginalArg(0) int arg0) {
		this.anOutputStream2 = new OutputStream_Sub1();
	}

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "()V")
	public void method31911() {
		do {
			@Pc(29) int local29;
			synchronized (this) {
				while (true) {
					if (this.anIOException2 != null) {
						return;
					}
					if (this.anInt5642 * 1068932297 <= this.anInt5641 * 1276035995) {
						local29 = this.anInt5641 * 1276035995 - this.anInt5642 * 1068932297;
					} else {
						local29 = this.anInt5640 * 867718127 - this.anInt5642 * 1068932297 + this.anInt5641 * 1276035995;
					}
					if (local29 > 0) {
						break;
					}
					try {
						this.anOutputStream2.flush();
					} catch (@Pc(53) IOException local53) {
						this.anIOException2 = local53;
						return;
					}
					if (this.method31905((byte) 44)) {
						return;
					}
					try {
						this.wait();
					} catch (@Pc(70) InterruptedException local70) {
					}
				}
			}
			try {
				if (local29 + this.anInt5642 * 1068932297 <= this.anInt5640 * 867718127) {
					this.anOutputStream2.write(this.aByteArray108, this.anInt5642 * 1068932297, local29);
				} else {
					@Pc(111) int local111 = this.anInt5640 * 867718127 - this.anInt5642 * 1068932297;
					this.anOutputStream2.write(this.aByteArray108, this.anInt5642 * 1068932297, local111);
					this.anOutputStream2.write(this.aByteArray108, 0, local29 - local111);
				}
			} catch (@Pc(132) IOException local132x) {
				@Pc(132) IOException local132 = local132x;
				synchronized (this) {
					this.anIOException2 = local132;
					return;
				}
			}
			synchronized (this) {
				this.anInt5642 = (this.anInt5642 * 1068932297 + local29) % (this.anInt5640 * 867718127) * 313802105;
			}
		} while (!this.method31905((byte) 80));
	}

	@OriginalMember(owner = "client!ug", name = "r", descriptor = "()V")
	public void method31912() {
		do {
			@Pc(29) int local29;
			synchronized (this) {
				while (true) {
					if (this.anIOException2 != null) {
						return;
					}
					if (this.anInt5642 * 1068932297 <= this.anInt5641 * 1276035995) {
						local29 = this.anInt5641 * 1276035995 - this.anInt5642 * 1068932297;
					} else {
						local29 = this.anInt5640 * 867718127 - this.anInt5642 * 1068932297 + this.anInt5641 * 1276035995;
					}
					if (local29 > 0) {
						break;
					}
					try {
						this.anOutputStream2.flush();
					} catch (@Pc(53) IOException local53) {
						this.anIOException2 = local53;
						return;
					}
					if (this.method31905((byte) 69)) {
						return;
					}
					try {
						this.wait();
					} catch (@Pc(70) InterruptedException local70) {
					}
				}
			}
			try {
				if (local29 + this.anInt5642 * 1068932297 <= this.anInt5640 * 867718127) {
					this.anOutputStream2.write(this.aByteArray108, this.anInt5642 * 1068932297, local29);
				} else {
					@Pc(111) int local111 = this.anInt5640 * 867718127 - this.anInt5642 * 1068932297;
					this.anOutputStream2.write(this.aByteArray108, this.anInt5642 * 1068932297, local111);
					this.anOutputStream2.write(this.aByteArray108, 0, local29 - local111);
				}
			} catch (@Pc(132) IOException local132x) {
				@Pc(132) IOException local132 = local132x;
				synchronized (this) {
					this.anIOException2 = local132;
					return;
				}
			}
			synchronized (this) {
				this.anInt5642 = (this.anInt5642 * 1068932297 + local29) % (this.anInt5640 * 867718127) * 313802105;
			}
		} while (!this.method31905((byte) 54));
	}

	@OriginalMember(owner = "client!ug", name = "o", descriptor = "()V")
	public void method31913() {
		do {
			@Pc(29) int local29;
			synchronized (this) {
				while (true) {
					if (this.anIOException2 != null) {
						return;
					}
					if (this.anInt5642 * 1068932297 <= this.anInt5641 * 1276035995) {
						local29 = this.anInt5641 * 1276035995 - this.anInt5642 * 1068932297;
					} else {
						local29 = this.anInt5640 * 867718127 - this.anInt5642 * 1068932297 + this.anInt5641 * 1276035995;
					}
					if (local29 > 0) {
						break;
					}
					try {
						this.anOutputStream2.flush();
					} catch (@Pc(53) IOException local53) {
						this.anIOException2 = local53;
						return;
					}
					if (this.method31905((byte) 45)) {
						return;
					}
					try {
						this.wait();
					} catch (@Pc(70) InterruptedException local70) {
					}
				}
			}
			try {
				if (local29 + this.anInt5642 * 1068932297 <= this.anInt5640 * 867718127) {
					this.anOutputStream2.write(this.aByteArray108, this.anInt5642 * 1068932297, local29);
				} else {
					@Pc(111) int local111 = this.anInt5640 * 867718127 - this.anInt5642 * 1068932297;
					this.anOutputStream2.write(this.aByteArray108, this.anInt5642 * 1068932297, local111);
					this.anOutputStream2.write(this.aByteArray108, 0, local29 - local111);
				}
			} catch (@Pc(132) IOException local132x) {
				@Pc(132) IOException local132 = local132x;
				synchronized (this) {
					this.anIOException2 = local132;
					return;
				}
			}
			synchronized (this) {
				this.anInt5642 = (this.anInt5642 * 1068932297 + local29) % (this.anInt5640 * 867718127) * 313802105;
			}
		} while (!this.method31905((byte) 64));
	}

	@OriginalMember(owner = "client!ug", name = "f", descriptor = "()Z")
	boolean method31914() {
		if (!this.aBoolean829) {
			return false;
		}
		try {
			this.anOutputStream2.close();
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException("");
			}
		} catch (@Pc(17) IOException local17) {
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException(local17);
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ug", name = "w", descriptor = "([BII)V")
	void method31915(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
			throw new IOException();
		}
		synchronized (this) {
			if (this.anIOException2 != null) {
				throw new IOException(this.anIOException2.toString());
			}
			@Pc(54) int local54;
			if (this.anInt5642 * 1068932297 <= this.anInt5641 * 1276035995) {
				local54 = this.anInt5642 * 1068932297 + (this.anInt5640 * 867718127 - this.anInt5641 * 1276035995) - 1;
			} else {
				local54 = this.anInt5642 * 1068932297 - this.anInt5641 * 1276035995 - 1;
			}
			if (local54 < arg2) {
				throw new IOException("");
			}
			if (this.anInt5641 * 1276035995 + arg2 <= this.anInt5640 * 867718127) {
				System.arraycopy(arg0, arg1, this.aByteArray108, this.anInt5641 * 1276035995, arg2);
			} else {
				@Pc(107) int local107 = this.anInt5640 * 867718127 - this.anInt5641 * 1276035995;
				System.arraycopy(arg0, arg1, this.aByteArray108, this.anInt5641 * 1276035995, local107);
				System.arraycopy(arg0, arg1 + local107, this.aByteArray108, 0, arg2 - local107);
			}
			this.anInt5641 = (arg2 + this.anInt5641 * 1276035995) % (this.anInt5640 * 867718127) * 718203539;
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!ug", name = "l", descriptor = "([BII)V")
	void method31916(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
			throw new IOException();
		}
		synchronized (this) {
			if (this.anIOException2 != null) {
				throw new IOException(this.anIOException2.toString());
			}
			@Pc(54) int local54;
			if (this.anInt5642 * 1068932297 <= this.anInt5641 * 1276035995) {
				local54 = this.anInt5642 * 1068932297 + (this.anInt5640 * 867718127 - this.anInt5641 * 1276035995) - 1;
			} else {
				local54 = this.anInt5642 * 1068932297 - this.anInt5641 * 1276035995 - 1;
			}
			if (local54 < arg2) {
				throw new IOException("");
			}
			if (this.anInt5641 * 1276035995 + arg2 <= this.anInt5640 * 867718127) {
				System.arraycopy(arg0, arg1, this.aByteArray108, this.anInt5641 * 1276035995, arg2);
			} else {
				@Pc(107) int local107 = this.anInt5640 * 867718127 - this.anInt5641 * 1276035995;
				System.arraycopy(arg0, arg1, this.aByteArray108, this.anInt5641 * 1276035995, local107);
				System.arraycopy(arg0, arg1 + local107, this.aByteArray108, 0, arg2 - local107);
			}
			this.anInt5641 = (arg2 + this.anInt5641 * 1276035995) % (this.anInt5640 * 867718127) * 718203539;
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!ug", name = "z", descriptor = "()V")
	void method31917() {
		synchronized (this) {
			this.aBoolean829 = true;
			this.notifyAll();
		}
		try {
			this.aThread10.join();
		} catch (@Pc(21) InterruptedException local21) {
		}
	}

	@OriginalMember(owner = "client!ug", name = "v", descriptor = "()V")
	public void method31918() {
		do {
			@Pc(29) int local29;
			synchronized (this) {
				while (true) {
					if (this.anIOException2 != null) {
						return;
					}
					if (this.anInt5642 * 1068932297 <= this.anInt5641 * 1276035995) {
						local29 = this.anInt5641 * 1276035995 - this.anInt5642 * 1068932297;
					} else {
						local29 = this.anInt5640 * 867718127 - this.anInt5642 * 1068932297 + this.anInt5641 * 1276035995;
					}
					if (local29 > 0) {
						break;
					}
					try {
						this.anOutputStream2.flush();
					} catch (@Pc(53) IOException local53) {
						this.anIOException2 = local53;
						return;
					}
					if (this.method31905((byte) 81)) {
						return;
					}
					try {
						this.wait();
					} catch (@Pc(70) InterruptedException local70) {
					}
				}
			}
			try {
				if (local29 + this.anInt5642 * 1068932297 <= this.anInt5640 * 867718127) {
					this.anOutputStream2.write(this.aByteArray108, this.anInt5642 * 1068932297, local29);
				} else {
					@Pc(111) int local111 = this.anInt5640 * 867718127 - this.anInt5642 * 1068932297;
					this.anOutputStream2.write(this.aByteArray108, this.anInt5642 * 1068932297, local111);
					this.anOutputStream2.write(this.aByteArray108, 0, local29 - local111);
				}
			} catch (@Pc(132) IOException local132x) {
				@Pc(132) IOException local132 = local132x;
				synchronized (this) {
					this.anIOException2 = local132;
					return;
				}
			}
			synchronized (this) {
				this.anInt5642 = (this.anInt5642 * 1068932297 + local29) % (this.anInt5640 * 867718127) * 313802105;
			}
		} while (!this.method31905((byte) 33));
	}

	@OriginalMember(owner = "client!ug", name = "p", descriptor = "()V")
	void method31919() {
		synchronized (this) {
			this.aBoolean829 = true;
			this.notifyAll();
		}
		try {
			this.aThread10.join();
		} catch (@Pc(21) InterruptedException local21) {
		}
	}

	@OriginalMember(owner = "client!ug", name = "run", descriptor = "()V")
	@Override
	public void run() {
		do {
			@Pc(29) int local29;
			synchronized (this) {
				while (true) {
					if (this.anIOException2 != null) {
						return;
					}
					if (this.anInt5642 * 1068932297 <= this.anInt5641 * 1276035995) {
						local29 = this.anInt5641 * 1276035995 - this.anInt5642 * 1068932297;
					} else {
						local29 = this.anInt5640 * 867718127 - this.anInt5642 * 1068932297 + this.anInt5641 * 1276035995;
					}
					if (local29 > 0) {
						break;
					}
					try {
						this.anOutputStream2.flush();
					} catch (@Pc(53) IOException local53) {
						this.anIOException2 = local53;
						return;
					}
					if (this.method31905((byte) 98)) {
						return;
					}
					try {
						this.wait();
					} catch (@Pc(70) InterruptedException local70) {
					}
				}
			}
			try {
				if (local29 + this.anInt5642 * 1068932297 <= this.anInt5640 * 867718127) {
					this.anOutputStream2.write(this.aByteArray108, this.anInt5642 * 1068932297, local29);
				} else {
					@Pc(111) int local111 = this.anInt5640 * 867718127 - this.anInt5642 * 1068932297;
					this.anOutputStream2.write(this.aByteArray108, this.anInt5642 * 1068932297, local111);
					this.anOutputStream2.write(this.aByteArray108, 0, local29 - local111);
				}
			} catch (@Pc(132) IOException local132x) {
				@Pc(132) IOException local132 = local132x;
				synchronized (this) {
					this.anIOException2 = local132;
					return;
				}
			}
			synchronized (this) {
				this.anInt5642 = (this.anInt5642 * 1068932297 + local29) % (this.anInt5640 * 867718127) * 313802105;
			}
		} while (!this.method31905((byte) 74));
	}

	@OriginalMember(owner = "client!ug", name = "s", descriptor = "()V")
	void method31920() {
		this.anOutputStream2 = new OutputStream_Sub1();
	}
}
