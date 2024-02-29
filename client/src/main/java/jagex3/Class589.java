package jagex3;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class589 implements Runnable {

	@OriginalMember(owner = "client!ua", name = "g", descriptor = "Lclient!py;")
	static Class497 aClass497_132;

	@OriginalMember(owner = "client!ua", name = "l", descriptor = "Ljava/io/IOException;")
	IOException anIOException1;

	@OriginalMember(owner = "client!ua", name = "f", descriptor = "I")
	int anInt5634 = 0;

	@OriginalMember(owner = "client!ua", name = "w", descriptor = "I")
	int anInt5635 = 0;

	@OriginalMember(owner = "client!ua", name = "n", descriptor = "Ljava/io/InputStream;")
	InputStream anInputStream2;

	@OriginalMember(owner = "client!ua", name = "m", descriptor = "I")
	int anInt5633;

	@OriginalMember(owner = "client!ua", name = "k", descriptor = "[B")
	byte[] aByteArray106;

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "Ljava/lang/Thread;")
	Thread aThread9;

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "(S)[Lclient!vg;")
	static Class613[] method31858(@OriginalArg(0) short arg0) {
		return new Class613[] { Class613.aClass613_4, Class613.aClass613_3, Class613.aClass613_2 };
	}

	@OriginalMember(owner = "client!ua", name = "ll", descriptor = "(Lclient!yf;I)V")
	static void method31859(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		Class430.method28943(local11, arg0, 28633010);
	}

	@OriginalMember(owner = "client!ua", name = "akx", descriptor = "(Lclient!yf;I)V")
	static void method31860(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		Class692.method36782(local12 >> 14 & 0x3FFF, local12 & 0x3FFF, (byte) 0);
	}

	@OriginalMember(owner = "client!ua", name = "amr", descriptor = "(Lclient!yf;I)V")
	static void method31861(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		Class322.method27367(Class20.method376(1143324731), -624053249);
	}

	@OriginalMember(owner = "client!ua", name = "apm", descriptor = "(Lclient!yf;I)V")
	static void method31862(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class429.anInt4942 * -1453926679 == 3 ? 1 : 0;
	}

	@OriginalMember(owner = "client!ua", name = "n", descriptor = "([Ljava/lang/Object;III)Ljava/lang/String;")
	public static String method31863(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 == 0) {
			return "";
		} else if (arg2 == 1) {
			@Pc(12) CharSequence local12 = (CharSequence) arg0[arg1];
			return local12 == null ? "null" : local12.toString();
		} else {
			@Pc(23) int local23 = arg1 + arg2;
			@Pc(25) int local25 = 0;
			for (@Pc(27) int local27 = arg1; local27 < local23; local27++) {
				@Pc(35) CharSequence local35 = (CharSequence) arg0[local27];
				if (local35 == null) {
					local25 += 4;
				} else {
					local25 += local35.length();
				}
			}
			@Pc(51) StringBuilder local51 = new StringBuilder(local25);
			for (@Pc(53) int local53 = arg1; local53 < local23; local53++) {
				@Pc(61) CharSequence local61 = (CharSequence) arg0[local53];
				if (local61 == null) {
					local51.append("null");
				} else {
					local51.append(local61);
				}
			}
			return local51.toString();
		}
	}

	@OriginalMember(owner = "client!ua", name = "h", descriptor = "(S)I")
	public static int method31864(@OriginalArg(0) short arg0) {
		return Class166_Sub13.aTwitchTV1.GetChatState();
	}

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
	Class589(@OriginalArg(0) InputStream arg0, @OriginalArg(1) int arg1) {
		this.anInputStream2 = arg0;
		this.anInt5633 = (arg1 + 1) * -1531603407;
		this.aByteArray106 = new byte[this.anInt5633 * 2094269137];
		this.aThread9 = new Thread(this);
		this.aThread9.setDaemon(true);
		this.aThread9.start();
	}

	@OriginalMember(owner = "client!ua", name = "u", descriptor = "(I)Z")
	boolean method31836(@OriginalArg(0) int arg0) throws IOException {
		if (arg0 == 0) {
			return true;
		} else if (arg0 > 0 && arg0 < this.anInt5633 * 2094269137) {
			synchronized (this) {
				@Pc(39) int local39;
				if (this.anInt5634 * -307665657 <= this.anInt5635 * -1004754881) {
					local39 = this.anInt5635 * -1004754881 - this.anInt5634 * -307665657;
				} else {
					local39 = this.anInt5633 * 2094269137 - this.anInt5634 * -307665657 + this.anInt5635 * -1004754881;
				}
				if (local39 >= arg0) {
					return true;
				} else if (this.anIOException1 == null) {
					this.notifyAll();
					return false;
				} else {
					throw new IOException(this.anIOException1.toString());
				}
			}
		} else {
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "([BII)I")
	int method31837(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(36) int local36;
			if (this.anInt5634 * -307665657 <= this.anInt5635 * -1004754881) {
				local36 = this.anInt5635 * -1004754881 - this.anInt5634 * -307665657;
			} else {
				local36 = this.anInt5633 * 2094269137 - this.anInt5634 * -307665657 + this.anInt5635 * -1004754881;
			}
			if (arg2 > local36) {
				arg2 = local36;
			}
			if (arg2 == 0 && this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			if (arg2 + this.anInt5634 * -307665657 <= this.anInt5633 * 2094269137) {
				System.arraycopy(this.aByteArray106, this.anInt5634 * -307665657, arg0, arg1, arg2);
			} else {
				@Pc(103) int local103 = this.anInt5633 * 2094269137 - this.anInt5634 * -307665657;
				System.arraycopy(this.aByteArray106, this.anInt5634 * -307665657, arg0, arg1, local103);
				System.arraycopy(this.aByteArray106, 0, arg0, arg1 + local103, arg2 - local103);
			}
			this.anInt5634 = (arg2 + this.anInt5634 * -307665657) % (this.anInt5633 * 2094269137) * 623311031;
			this.notifyAll();
			return arg2;
		}
	}

	@OriginalMember(owner = "client!ua", name = "h", descriptor = "()V")
	void method31838() {
		synchronized (this) {
			if (this.anIOException1 == null) {
				this.anIOException1 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread9.join();
		} catch (@Pc(28) InterruptedException local28) {
		}
	}

	@OriginalMember(owner = "client!ua", name = "n", descriptor = "(I)I")
	int method31839(@OriginalArg(0) int arg0) throws IOException {
		synchronized (this) {
			@Pc(22) int local22;
			if (this.anInt5634 * -307665657 <= this.anInt5635 * -1004754881) {
				local22 = this.anInt5635 * -1004754881 - this.anInt5634 * -307665657;
			} else {
				local22 = this.anInt5633 * 2094269137 - this.anInt5634 * -307665657 + this.anInt5635 * -1004754881;
			}
			if (local22 <= 0 && this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			this.notifyAll();
			return local22;
		}
	}

	@OriginalMember(owner = "client!ua", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(26) int local26;
			synchronized (this) {
				while (true) {
					if (this.anIOException1 != null) {
						return;
					}
					if (this.anInt5634 * -307665657 == 0) {
						local26 = this.anInt5633 * 2094269137 - this.anInt5635 * -1004754881 - 1;
					} else if (this.anInt5634 * -307665657 <= this.anInt5635 * -1004754881) {
						local26 = this.anInt5633 * 2094269137 - this.anInt5635 * -1004754881;
					} else {
						local26 = this.anInt5634 * -307665657 - this.anInt5635 * -1004754881 - 1;
					}
					if (local26 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(66) InterruptedException local66) {
					}
				}
			}
			@Pc(86) int local86;
			try {
				local86 = this.anInputStream2.read(this.aByteArray106, this.anInt5635 * -1004754881, local26);
				if (local86 == -1) {
					throw new EOFException();
				}
			} catch (@Pc(95) IOException local95x) {
				@Pc(95) IOException local95 = local95x;
				synchronized (this) {
					this.anIOException1 = local95;
					return;
				}
			}
			synchronized (this) {
				this.anInt5635 = (local86 + this.anInt5635 * -1004754881) % (this.anInt5633 * 2094269137) * 785074111;
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "k", descriptor = "(I)V")
	void method31840(@OriginalArg(0) int arg0) {
		synchronized (this) {
			if (this.anIOException1 == null) {
				this.anIOException1 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread9.join();
		} catch (@Pc(28) InterruptedException local28) {
		}
	}

	@OriginalMember(owner = "client!ua", name = "o", descriptor = "()V")
	public void method31841() {
		while (true) {
			@Pc(26) int local26;
			synchronized (this) {
				while (true) {
					if (this.anIOException1 != null) {
						return;
					}
					if (this.anInt5634 * -307665657 == 0) {
						local26 = this.anInt5633 * 2094269137 - this.anInt5635 * -1004754881 - 1;
					} else if (this.anInt5634 * -307665657 <= this.anInt5635 * -1004754881) {
						local26 = this.anInt5633 * 2094269137 - this.anInt5635 * -1004754881;
					} else {
						local26 = this.anInt5634 * -307665657 - this.anInt5635 * -1004754881 - 1;
					}
					if (local26 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(66) InterruptedException local66) {
					}
				}
			}
			@Pc(86) int local86;
			try {
				local86 = this.anInputStream2.read(this.aByteArray106, this.anInt5635 * -1004754881, local26);
				if (local86 == -1) {
					throw new EOFException();
				}
			} catch (@Pc(95) IOException local95x) {
				@Pc(95) IOException local95 = local95x;
				synchronized (this) {
					this.anIOException1 = local95;
					return;
				}
			}
			synchronized (this) {
				this.anInt5635 = (local86 + this.anInt5635 * -1004754881) % (this.anInt5633 * 2094269137) * 785074111;
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "r", descriptor = "()V")
	public void method31842() {
		while (true) {
			@Pc(26) int local26;
			synchronized (this) {
				while (true) {
					if (this.anIOException1 != null) {
						return;
					}
					if (this.anInt5634 * -307665657 == 0) {
						local26 = this.anInt5633 * 2094269137 - this.anInt5635 * -1004754881 - 1;
					} else if (this.anInt5634 * -307665657 <= this.anInt5635 * -1004754881) {
						local26 = this.anInt5633 * 2094269137 - this.anInt5635 * -1004754881;
					} else {
						local26 = this.anInt5634 * -307665657 - this.anInt5635 * -1004754881 - 1;
					}
					if (local26 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(66) InterruptedException local66) {
					}
				}
			}
			@Pc(86) int local86;
			try {
				local86 = this.anInputStream2.read(this.aByteArray106, this.anInt5635 * -1004754881, local26);
				if (local86 == -1) {
					throw new EOFException();
				}
			} catch (@Pc(95) IOException local95x) {
				@Pc(95) IOException local95 = local95x;
				synchronized (this) {
					this.anIOException1 = local95;
					return;
				}
			}
			synchronized (this) {
				this.anInt5635 = (local86 + this.anInt5635 * -1004754881) % (this.anInt5633 * 2094269137) * 785074111;
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "v", descriptor = "()V")
	public void method31843() {
		while (true) {
			@Pc(26) int local26;
			synchronized (this) {
				while (true) {
					if (this.anIOException1 != null) {
						return;
					}
					if (this.anInt5634 * -307665657 == 0) {
						local26 = this.anInt5633 * 2094269137 - this.anInt5635 * -1004754881 - 1;
					} else if (this.anInt5634 * -307665657 <= this.anInt5635 * -1004754881) {
						local26 = this.anInt5633 * 2094269137 - this.anInt5635 * -1004754881;
					} else {
						local26 = this.anInt5634 * -307665657 - this.anInt5635 * -1004754881 - 1;
					}
					if (local26 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(66) InterruptedException local66) {
					}
				}
			}
			@Pc(86) int local86;
			try {
				local86 = this.anInputStream2.read(this.aByteArray106, this.anInt5635 * -1004754881, local26);
				if (local86 == -1) {
					throw new EOFException();
				}
			} catch (@Pc(95) IOException local95x) {
				@Pc(95) IOException local95 = local95x;
				synchronized (this) {
					this.anIOException1 = local95;
					return;
				}
			}
			synchronized (this) {
				this.anInt5635 = (local86 + this.anInt5635 * -1004754881) % (this.anInt5633 * 2094269137) * 785074111;
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "m", descriptor = "([BIII)I")
	int method31844(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws IOException {
		if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(36) int local36;
			if (this.anInt5634 * -307665657 <= this.anInt5635 * -1004754881) {
				local36 = this.anInt5635 * -1004754881 - this.anInt5634 * -307665657;
			} else {
				local36 = this.anInt5633 * 2094269137 - this.anInt5634 * -307665657 + this.anInt5635 * -1004754881;
			}
			if (arg2 > local36) {
				arg2 = local36;
			}
			if (arg2 == 0 && this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			if (arg2 + this.anInt5634 * -307665657 <= this.anInt5633 * 2094269137) {
				System.arraycopy(this.aByteArray106, this.anInt5634 * -307665657, arg0, arg1, arg2);
			} else {
				@Pc(103) int local103 = this.anInt5633 * 2094269137 - this.anInt5634 * -307665657;
				System.arraycopy(this.aByteArray106, this.anInt5634 * -307665657, arg0, arg1, local103);
				System.arraycopy(this.aByteArray106, 0, arg0, arg1 + local103, arg2 - local103);
			}
			this.anInt5634 = (arg2 + this.anInt5634 * -307665657) % (this.anInt5633 * 2094269137) * 623311031;
			this.notifyAll();
			return arg2;
		}
	}

	@OriginalMember(owner = "client!ua", name = "w", descriptor = "(I)Z")
	boolean method31845(@OriginalArg(0) int arg0) throws IOException {
		if (arg0 == 0) {
			return true;
		} else if (arg0 > 0 && arg0 < this.anInt5633 * 2094269137) {
			synchronized (this) {
				@Pc(39) int local39;
				if (this.anInt5634 * -307665657 <= this.anInt5635 * -1004754881) {
					local39 = this.anInt5635 * -1004754881 - this.anInt5634 * -307665657;
				} else {
					local39 = this.anInt5633 * 2094269137 - this.anInt5634 * -307665657 + this.anInt5635 * -1004754881;
				}
				if (local39 >= arg0) {
					return true;
				} else if (this.anIOException1 == null) {
					this.notifyAll();
					return false;
				} else {
					throw new IOException(this.anIOException1.toString());
				}
			}
		} else {
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!ua", name = "l", descriptor = "(I)Z")
	boolean method31846(@OriginalArg(0) int arg0) throws IOException {
		if (arg0 == 0) {
			return true;
		} else if (arg0 > 0 && arg0 < this.anInt5633 * 2094269137) {
			synchronized (this) {
				@Pc(39) int local39;
				if (this.anInt5634 * -307665657 <= this.anInt5635 * -1004754881) {
					local39 = this.anInt5635 * -1004754881 - this.anInt5634 * -307665657;
				} else {
					local39 = this.anInt5633 * 2094269137 - this.anInt5634 * -307665657 + this.anInt5635 * -1004754881;
				}
				if (local39 >= arg0) {
					return true;
				} else if (this.anIOException1 == null) {
					this.notifyAll();
					return false;
				} else {
					throw new IOException(this.anIOException1.toString());
				}
			}
		} else {
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "(II)Z")
	boolean method31847(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws IOException {
		if (arg0 == 0) {
			return true;
		} else if (arg0 > 0 && arg0 < this.anInt5633 * 2094269137) {
			synchronized (this) {
				@Pc(39) int local39;
				if (this.anInt5634 * -307665657 <= this.anInt5635 * -1004754881) {
					local39 = this.anInt5635 * -1004754881 - this.anInt5634 * -307665657;
				} else {
					local39 = this.anInt5633 * 2094269137 - this.anInt5634 * -307665657 + this.anInt5635 * -1004754881;
				}
				if (local39 >= arg0) {
					return true;
				} else if (this.anIOException1 == null) {
					this.notifyAll();
					return false;
				} else {
					throw new IOException(this.anIOException1.toString());
				}
			}
		} else {
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!ua", name = "z", descriptor = "(I)Z")
	boolean method31848(@OriginalArg(0) int arg0) throws IOException {
		if (arg0 == 0) {
			return true;
		} else if (arg0 > 0 && arg0 < this.anInt5633 * 2094269137) {
			synchronized (this) {
				@Pc(39) int local39;
				if (this.anInt5634 * -307665657 <= this.anInt5635 * -1004754881) {
					local39 = this.anInt5635 * -1004754881 - this.anInt5634 * -307665657;
				} else {
					local39 = this.anInt5633 * 2094269137 - this.anInt5634 * -307665657 + this.anInt5635 * -1004754881;
				}
				if (local39 >= arg0) {
					return true;
				} else if (this.anIOException1 == null) {
					this.notifyAll();
					return false;
				} else {
					throw new IOException(this.anIOException1.toString());
				}
			}
		} else {
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!ua", name = "p", descriptor = "(I)Z")
	boolean method31849(@OriginalArg(0) int arg0) throws IOException {
		if (arg0 == 0) {
			return true;
		} else if (arg0 > 0 && arg0 < this.anInt5633 * 2094269137) {
			synchronized (this) {
				@Pc(39) int local39;
				if (this.anInt5634 * -307665657 <= this.anInt5635 * -1004754881) {
					local39 = this.anInt5635 * -1004754881 - this.anInt5634 * -307665657;
				} else {
					local39 = this.anInt5633 * 2094269137 - this.anInt5634 * -307665657 + this.anInt5635 * -1004754881;
				}
				if (local39 >= arg0) {
					return true;
				} else if (this.anIOException1 == null) {
					this.notifyAll();
					return false;
				} else {
					throw new IOException(this.anIOException1.toString());
				}
			}
		} else {
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "()I")
	int method31850() throws IOException {
		synchronized (this) {
			@Pc(22) int local22;
			if (this.anInt5634 * -307665657 <= this.anInt5635 * -1004754881) {
				local22 = this.anInt5635 * -1004754881 - this.anInt5634 * -307665657;
			} else {
				local22 = this.anInt5633 * 2094269137 - this.anInt5634 * -307665657 + this.anInt5635 * -1004754881;
			}
			if (local22 <= 0 && this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			this.notifyAll();
			return local22;
		}
	}

	@OriginalMember(owner = "client!ua", name = "s", descriptor = "()I")
	int method31851() throws IOException {
		synchronized (this) {
			@Pc(22) int local22;
			if (this.anInt5634 * -307665657 <= this.anInt5635 * -1004754881) {
				local22 = this.anInt5635 * -1004754881 - this.anInt5634 * -307665657;
			} else {
				local22 = this.anInt5633 * 2094269137 - this.anInt5634 * -307665657 + this.anInt5635 * -1004754881;
			}
			if (local22 <= 0 && this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			this.notifyAll();
			return local22;
		}
	}

	@OriginalMember(owner = "client!ua", name = "y", descriptor = "([BII)I")
	int method31852(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(36) int local36;
			if (this.anInt5634 * -307665657 <= this.anInt5635 * -1004754881) {
				local36 = this.anInt5635 * -1004754881 - this.anInt5634 * -307665657;
			} else {
				local36 = this.anInt5633 * 2094269137 - this.anInt5634 * -307665657 + this.anInt5635 * -1004754881;
			}
			if (arg2 > local36) {
				arg2 = local36;
			}
			if (arg2 == 0 && this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			if (arg2 + this.anInt5634 * -307665657 <= this.anInt5633 * 2094269137) {
				System.arraycopy(this.aByteArray106, this.anInt5634 * -307665657, arg0, arg1, arg2);
			} else {
				@Pc(103) int local103 = this.anInt5633 * 2094269137 - this.anInt5634 * -307665657;
				System.arraycopy(this.aByteArray106, this.anInt5634 * -307665657, arg0, arg1, local103);
				System.arraycopy(this.aByteArray106, 0, arg0, arg1 + local103, arg2 - local103);
			}
			this.anInt5634 = (arg2 + this.anInt5634 * -307665657) % (this.anInt5633 * 2094269137) * 623311031;
			this.notifyAll();
			return arg2;
		}
	}

	@OriginalMember(owner = "client!ua", name = "q", descriptor = "([BII)I")
	int method31853(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(36) int local36;
			if (this.anInt5634 * -307665657 <= this.anInt5635 * -1004754881) {
				local36 = this.anInt5635 * -1004754881 - this.anInt5634 * -307665657;
			} else {
				local36 = this.anInt5633 * 2094269137 - this.anInt5634 * -307665657 + this.anInt5635 * -1004754881;
			}
			if (arg2 > local36) {
				arg2 = local36;
			}
			if (arg2 == 0 && this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			if (arg2 + this.anInt5634 * -307665657 <= this.anInt5633 * 2094269137) {
				System.arraycopy(this.aByteArray106, this.anInt5634 * -307665657, arg0, arg1, arg2);
			} else {
				@Pc(103) int local103 = this.anInt5633 * 2094269137 - this.anInt5634 * -307665657;
				System.arraycopy(this.aByteArray106, this.anInt5634 * -307665657, arg0, arg1, local103);
				System.arraycopy(this.aByteArray106, 0, arg0, arg1 + local103, arg2 - local103);
			}
			this.anInt5634 = (arg2 + this.anInt5634 * -307665657) % (this.anInt5633 * 2094269137) * 623311031;
			this.notifyAll();
			return arg2;
		}
	}

	@OriginalMember(owner = "client!ua", name = "x", descriptor = "([BII)I")
	int method31854(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(36) int local36;
			if (this.anInt5634 * -307665657 <= this.anInt5635 * -1004754881) {
				local36 = this.anInt5635 * -1004754881 - this.anInt5634 * -307665657;
			} else {
				local36 = this.anInt5633 * 2094269137 - this.anInt5634 * -307665657 + this.anInt5635 * -1004754881;
			}
			if (arg2 > local36) {
				arg2 = local36;
			}
			if (arg2 == 0 && this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			if (arg2 + this.anInt5634 * -307665657 <= this.anInt5633 * 2094269137) {
				System.arraycopy(this.aByteArray106, this.anInt5634 * -307665657, arg0, arg1, arg2);
			} else {
				@Pc(103) int local103 = this.anInt5633 * 2094269137 - this.anInt5634 * -307665657;
				System.arraycopy(this.aByteArray106, this.anInt5634 * -307665657, arg0, arg1, local103);
				System.arraycopy(this.aByteArray106, 0, arg0, arg1 + local103, arg2 - local103);
			}
			this.anInt5634 = (arg2 + this.anInt5634 * -307665657) % (this.anInt5633 * 2094269137) * 623311031;
			this.notifyAll();
			return arg2;
		}
	}

	@OriginalMember(owner = "client!ua", name = "f", descriptor = "(I)V")
	void method31855(@OriginalArg(0) int arg0) {
		this.anInputStream2 = new InputStream_Sub1();
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "()V")
	void method31856() {
		this.anInputStream2 = new InputStream_Sub1();
	}

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "()V")
	public void method31857() {
		while (true) {
			@Pc(26) int local26;
			synchronized (this) {
				while (true) {
					if (this.anIOException1 != null) {
						return;
					}
					if (this.anInt5634 * -307665657 == 0) {
						local26 = this.anInt5633 * 2094269137 - this.anInt5635 * -1004754881 - 1;
					} else if (this.anInt5634 * -307665657 <= this.anInt5635 * -1004754881) {
						local26 = this.anInt5633 * 2094269137 - this.anInt5635 * -1004754881;
					} else {
						local26 = this.anInt5634 * -307665657 - this.anInt5635 * -1004754881 - 1;
					}
					if (local26 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(66) InterruptedException local66) {
					}
				}
			}
			@Pc(86) int local86;
			try {
				local86 = this.anInputStream2.read(this.aByteArray106, this.anInt5635 * -1004754881, local26);
				if (local86 == -1) {
					throw new EOFException();
				}
			} catch (@Pc(95) IOException local95x) {
				@Pc(95) IOException local95 = local95x;
				synchronized (this) {
					this.anIOException1 = local95;
					return;
				}
			}
			synchronized (this) {
				this.anInt5635 = (local86 + this.anInt5635 * -1004754881) % (this.anInt5633 * 2094269137) * 785074111;
			}
		}
	}
}
