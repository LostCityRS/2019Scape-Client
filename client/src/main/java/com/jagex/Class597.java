package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

@OriginalClass("client!up")
public final class Class597 implements Runnable {

	@OriginalMember(owner = "client!up", name = "ac", descriptor = "Z")
	public static boolean aBoolean926;

	@OriginalMember(owner = "client!up", name = "ua", descriptor = "I")
	static int anInt5363;

	@OriginalMember(owner = "client!up", name = "i", descriptor = "Ljava/io/IOException;")
	IOException anIOException2;

	@OriginalMember(owner = "client!up", name = "l", descriptor = "I")
	int anInt5361 = 0;

	@OriginalMember(owner = "client!up", name = "g", descriptor = "I")
	int anInt5362 = 0;

	@OriginalMember(owner = "client!up", name = "f", descriptor = "Ljava/io/InputStream;")
	InputStream anInputStream2;

	@OriginalMember(owner = "client!up", name = "e", descriptor = "I")
	int anInt5360;

	@OriginalMember(owner = "client!up", name = "u", descriptor = "[B")
	byte[] aByteArray107;

	@OriginalMember(owner = "client!up", name = "t", descriptor = "Ljava/lang/Thread;")
	Thread aThread11;

	@OriginalMember(owner = "client!up", name = "aff", descriptor = "(Lclient!yp;I)V")
	static void method32018(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = Integer.toString(local12);
	}

	@OriginalMember(owner = "client!up", name = "bdg", descriptor = "(Lclient!yp;I)V")
	static void method32019(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class705.aClass80_Sub39_1.anInt1719 * 625439365;
	}

	@OriginalMember(owner = "client!up", name = "f", descriptor = "(I)Z")
	public static boolean method32020(@OriginalArg(0) int arg0) {
		@Pc(4) Class80_Sub41 local4 = (Class80_Sub41) Class56.aClass8_3.method247(129206984);
		return local4 != null;
	}

	@OriginalMember(owner = "client!up", name = "k", descriptor = "(Lclient!di;Lclient!vv;IIII)V")
	static void method32021(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class625 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) Class57 local8 = (Class57) Class265.aClass41_Sub12_3.method18054(arg1.anInt5500 * -71198285, -810960378);
		if (-782006561 * local8.anInt204 == -1) {
			return;
		}
		if (arg1.aBoolean940) {
			@Pc(25) int local25 = arg2 + arg1.anInt5513 * 476252417;
			arg2 = local25 & 0x3;
		} else {
			arg2 = 0;
		}
		@Pc(40) Class99 local40 = local8.method1148(arg0, arg2, arg1.aBoolean945, 2102345429);
		if (local40 == null) {
			return;
		}
		@Pc(49) int local49 = arg1.anInt5503 * 1462300569;
		@Pc(54) int local54 = arg1.anInt5504 * -1951356049;
		if ((arg2 & 0x1) == 1) {
			local49 = arg1.anInt5504 * -1951356049;
			local54 = arg1.anInt5503 * 1462300569;
		}
		@Pc(72) int local72 = local40.method18214();
		@Pc(75) int local75 = local40.method18288();
		if (local8.aBoolean31) {
			local72 = local49 * 4;
			local75 = local54 * 4;
		}
		if (local8.anInt203 * -567332909 == 0) {
			local40.method18228(arg3, arg4 - (local54 - 1) * 4, local72, local75);
		} else {
			local40.method18229(arg3, arg4 - (local54 - 1) * 4, local72, local75, 0, local8.anInt203 * -567332909 | 0xFF000000, 1);
		}
	}

	@OriginalMember(owner = "client!up", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
	Class597(@OriginalArg(0) InputStream arg0, @OriginalArg(1) int arg1) {
		this.anInputStream2 = arg0;
		this.anInt5360 = (arg1 + 1) * -162432477;
		this.aByteArray107 = new byte[this.anInt5360 * 1646265739];
		this.aThread11 = new Thread(this);
		this.aThread11.setDaemon(true);
		this.aThread11.start();
	}

	@OriginalMember(owner = "client!up", name = "g", descriptor = "(I)Z")
	boolean method31999(@OriginalArg(0) int arg0) throws IOException {
		if (arg0 == 0) {
			return true;
		} else if (arg0 > 0 && arg0 < this.anInt5360 * 1646265739) {
			synchronized (this) {
				@Pc(39) int local39;
				if (this.anInt5361 * 314536849 <= this.anInt5362 * 1564388367) {
					local39 = this.anInt5362 * 1564388367 - this.anInt5361 * 314536849;
				} else {
					local39 = this.anInt5360 * 1646265739 - this.anInt5361 * 314536849 + this.anInt5362 * 1564388367;
				}
				if (local39 >= arg0) {
					return true;
				} else if (this.anIOException2 == null) {
					this.notifyAll();
					return false;
				} else {
					throw new IOException(this.anIOException2.toString());
				}
			}
		} else {
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!up", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(27) int local27;
			synchronized (this) {
				while (true) {
					if (this.anIOException2 != null) {
						return;
					}
					if (this.anInt5361 * 314536849 == 0) {
						local27 = this.anInt5360 * 1646265739 - this.anInt5362 * 1564388367 - 1;
					} else if (this.anInt5361 * 314536849 <= this.anInt5362 * 1564388367) {
						local27 = this.anInt5360 * 1646265739 - this.anInt5362 * 1564388367;
					} else {
						local27 = this.anInt5361 * 314536849 - this.anInt5362 * 1564388367 - 1;
					}
					if (local27 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(67) InterruptedException local67) {
					}
				}
			}
			@Pc(87) int local87;
			try {
				local87 = this.anInputStream2.read(this.aByteArray107, this.anInt5362 * 1564388367, local27);
				if (local87 == -1) {
					throw new EOFException();
				}
			} catch (@Pc(96) IOException local96x) {
				@Pc(96) IOException local96 = local96x;
				synchronized (this) {
					this.anIOException2 = local96;
					return;
				}
			}
			synchronized (this) {
				this.anInt5362 = (local87 + this.anInt5362 * 1564388367) % (this.anInt5360 * 1646265739) * 407290607;
			}
		}
	}

	@OriginalMember(owner = "client!up", name = "t", descriptor = "(II)Z")
	boolean method32000(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws IOException {
		if (arg0 == 0) {
			return true;
		} else if (arg0 > 0 && arg0 < this.anInt5360 * 1646265739) {
			synchronized (this) {
				@Pc(39) int local39;
				if (this.anInt5361 * 314536849 <= this.anInt5362 * 1564388367) {
					local39 = this.anInt5362 * 1564388367 - this.anInt5361 * 314536849;
				} else {
					local39 = this.anInt5360 * 1646265739 - this.anInt5361 * 314536849 + this.anInt5362 * 1564388367;
				}
				if (local39 >= arg0) {
					return true;
				} else if (this.anIOException2 == null) {
					this.notifyAll();
					return false;
				} else {
					throw new IOException(this.anIOException2.toString());
				}
			}
		} else {
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!up", name = "f", descriptor = "(I)I")
	int method32001(@OriginalArg(0) int arg0) throws IOException {
		synchronized (this) {
			@Pc(22) int local22;
			if (this.anInt5361 * 314536849 <= this.anInt5362 * 1564388367) {
				local22 = this.anInt5362 * 1564388367 - this.anInt5361 * 314536849;
			} else {
				local22 = this.anInt5360 * 1646265739 - this.anInt5361 * 314536849 + this.anInt5362 * 1564388367;
			}
			if (local22 <= 0 && this.anIOException2 != null) {
				throw new IOException(this.anIOException2.toString());
			}
			this.notifyAll();
			return local22;
		}
	}

	@OriginalMember(owner = "client!up", name = "e", descriptor = "([BIII)I")
	int method32002(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws IOException {
		if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(36) int local36;
			if (this.anInt5361 * 314536849 <= this.anInt5362 * 1564388367) {
				local36 = this.anInt5362 * 1564388367 - this.anInt5361 * 314536849;
			} else {
				local36 = this.anInt5360 * 1646265739 - this.anInt5361 * 314536849 + this.anInt5362 * 1564388367;
			}
			if (arg2 > local36) {
				arg2 = local36;
			}
			if (arg2 == 0 && this.anIOException2 != null) {
				throw new IOException(this.anIOException2.toString());
			}
			if (this.anInt5361 * 314536849 + arg2 <= this.anInt5360 * 1646265739) {
				System.arraycopy(this.aByteArray107, this.anInt5361 * 314536849, arg0, arg1, arg2);
			} else {
				@Pc(101) int local101 = this.anInt5360 * 1646265739 - this.anInt5361 * 314536849;
				System.arraycopy(this.aByteArray107, this.anInt5361 * 314536849, arg0, arg1, local101);
				System.arraycopy(this.aByteArray107, 0, arg0, arg1 + local101, arg2 - local101);
			}
			this.anInt5361 = (this.anInt5361 * 314536849 + arg2) % (this.anInt5360 * 1646265739) * 1167437169;
			this.notifyAll();
			return arg2;
		}
	}

	@OriginalMember(owner = "client!up", name = "u", descriptor = "(S)V")
	void method32003(@OriginalArg(0) short arg0) {
		synchronized (this) {
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread11.join();
		} catch (@Pc(28) InterruptedException local28) {
		}
	}

	@OriginalMember(owner = "client!up", name = "l", descriptor = "(B)V")
	void method32004(@OriginalArg(0) byte arg0) {
		this.anInputStream2 = new InputStream_Sub1();
	}

	@OriginalMember(owner = "client!up", name = "q", descriptor = "()V")
	public void method32005() {
		while (true) {
			@Pc(27) int local27;
			synchronized (this) {
				while (true) {
					if (this.anIOException2 != null) {
						return;
					}
					if (this.anInt5361 * 314536849 == 0) {
						local27 = this.anInt5360 * 1646265739 - this.anInt5362 * 1564388367 - 1;
					} else if (this.anInt5361 * 314536849 <= this.anInt5362 * 1564388367) {
						local27 = this.anInt5360 * 1646265739 - this.anInt5362 * 1564388367;
					} else {
						local27 = this.anInt5361 * 314536849 - this.anInt5362 * 1564388367 - 1;
					}
					if (local27 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(67) InterruptedException local67) {
					}
				}
			}
			@Pc(87) int local87;
			try {
				local87 = this.anInputStream2.read(this.aByteArray107, this.anInt5362 * 1564388367, local27);
				if (local87 == -1) {
					throw new EOFException();
				}
			} catch (@Pc(96) IOException local96x) {
				@Pc(96) IOException local96 = local96x;
				synchronized (this) {
					this.anIOException2 = local96;
					return;
				}
			}
			synchronized (this) {
				this.anInt5362 = (local87 + this.anInt5362 * 1564388367) % (this.anInt5360 * 1646265739) * 407290607;
			}
		}
	}

	@OriginalMember(owner = "client!up", name = "j", descriptor = "()I")
	int method32006() throws IOException {
		synchronized (this) {
			@Pc(22) int local22;
			if (this.anInt5361 * 314536849 <= this.anInt5362 * 1564388367) {
				local22 = this.anInt5362 * 1564388367 - this.anInt5361 * 314536849;
			} else {
				local22 = this.anInt5360 * 1646265739 - this.anInt5361 * 314536849 + this.anInt5362 * 1564388367;
			}
			if (local22 <= 0 && this.anIOException2 != null) {
				throw new IOException(this.anIOException2.toString());
			}
			this.notifyAll();
			return local22;
		}
	}

	@OriginalMember(owner = "client!up", name = "x", descriptor = "([BII)I")
	int method32007(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(36) int local36;
			if (this.anInt5361 * 314536849 <= this.anInt5362 * 1564388367) {
				local36 = this.anInt5362 * 1564388367 - this.anInt5361 * 314536849;
			} else {
				local36 = this.anInt5360 * 1646265739 - this.anInt5361 * 314536849 + this.anInt5362 * 1564388367;
			}
			if (arg2 > local36) {
				arg2 = local36;
			}
			if (arg2 == 0 && this.anIOException2 != null) {
				throw new IOException(this.anIOException2.toString());
			}
			if (this.anInt5361 * 314536849 + arg2 <= this.anInt5360 * 1646265739) {
				System.arraycopy(this.aByteArray107, this.anInt5361 * 314536849, arg0, arg1, arg2);
			} else {
				@Pc(101) int local101 = this.anInt5360 * 1646265739 - this.anInt5361 * 314536849;
				System.arraycopy(this.aByteArray107, this.anInt5361 * 314536849, arg0, arg1, local101);
				System.arraycopy(this.aByteArray107, 0, arg0, arg1 + local101, arg2 - local101);
			}
			this.anInt5361 = (this.anInt5361 * 314536849 + arg2) % (this.anInt5360 * 1646265739) * 1167437169;
			this.notifyAll();
			return arg2;
		}
	}

	@OriginalMember(owner = "client!up", name = "m", descriptor = "(I)Z")
	boolean method32008(@OriginalArg(0) int arg0) throws IOException {
		if (arg0 == 0) {
			return true;
		} else if (arg0 > 0 && arg0 < this.anInt5360 * 1646265739) {
			synchronized (this) {
				@Pc(39) int local39;
				if (this.anInt5361 * 314536849 <= this.anInt5362 * 1564388367) {
					local39 = this.anInt5362 * 1564388367 - this.anInt5361 * 314536849;
				} else {
					local39 = this.anInt5360 * 1646265739 - this.anInt5361 * 314536849 + this.anInt5362 * 1564388367;
				}
				if (local39 >= arg0) {
					return true;
				} else if (this.anIOException2 == null) {
					this.notifyAll();
					return false;
				} else {
					throw new IOException(this.anIOException2.toString());
				}
			}
		} else {
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!up", name = "o", descriptor = "()I")
	int method32009() throws IOException {
		synchronized (this) {
			@Pc(22) int local22;
			if (this.anInt5361 * 314536849 <= this.anInt5362 * 1564388367) {
				local22 = this.anInt5362 * 1564388367 - this.anInt5361 * 314536849;
			} else {
				local22 = this.anInt5360 * 1646265739 - this.anInt5361 * 314536849 + this.anInt5362 * 1564388367;
			}
			if (local22 <= 0 && this.anIOException2 != null) {
				throw new IOException(this.anIOException2.toString());
			}
			this.notifyAll();
			return local22;
		}
	}

	@OriginalMember(owner = "client!up", name = "w", descriptor = "()V")
	void method32010() {
		synchronized (this) {
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread11.join();
		} catch (@Pc(28) InterruptedException local28) {
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "()I")
	int method32011() throws IOException {
		synchronized (this) {
			@Pc(22) int local22;
			if (this.anInt5361 * 314536849 <= this.anInt5362 * 1564388367) {
				local22 = this.anInt5362 * 1564388367 - this.anInt5361 * 314536849;
			} else {
				local22 = this.anInt5360 * 1646265739 - this.anInt5361 * 314536849 + this.anInt5362 * 1564388367;
			}
			if (local22 <= 0 && this.anIOException2 != null) {
				throw new IOException(this.anIOException2.toString());
			}
			this.notifyAll();
			return local22;
		}
	}

	@OriginalMember(owner = "client!up", name = "s", descriptor = "()I")
	int method32012() throws IOException {
		synchronized (this) {
			@Pc(22) int local22;
			if (this.anInt5361 * 314536849 <= this.anInt5362 * 1564388367) {
				local22 = this.anInt5362 * 1564388367 - this.anInt5361 * 314536849;
			} else {
				local22 = this.anInt5360 * 1646265739 - this.anInt5361 * 314536849 + this.anInt5362 * 1564388367;
			}
			if (local22 <= 0 && this.anIOException2 != null) {
				throw new IOException(this.anIOException2.toString());
			}
			this.notifyAll();
			return local22;
		}
	}

	@OriginalMember(owner = "client!up", name = "k", descriptor = "([BII)I")
	int method32013(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(36) int local36;
			if (this.anInt5361 * 314536849 <= this.anInt5362 * 1564388367) {
				local36 = this.anInt5362 * 1564388367 - this.anInt5361 * 314536849;
			} else {
				local36 = this.anInt5360 * 1646265739 - this.anInt5361 * 314536849 + this.anInt5362 * 1564388367;
			}
			if (arg2 > local36) {
				arg2 = local36;
			}
			if (arg2 == 0 && this.anIOException2 != null) {
				throw new IOException(this.anIOException2.toString());
			}
			if (this.anInt5361 * 314536849 + arg2 <= this.anInt5360 * 1646265739) {
				System.arraycopy(this.aByteArray107, this.anInt5361 * 314536849, arg0, arg1, arg2);
			} else {
				@Pc(101) int local101 = this.anInt5360 * 1646265739 - this.anInt5361 * 314536849;
				System.arraycopy(this.aByteArray107, this.anInt5361 * 314536849, arg0, arg1, local101);
				System.arraycopy(this.aByteArray107, 0, arg0, arg1 + local101, arg2 - local101);
			}
			this.anInt5361 = (this.anInt5361 * 314536849 + arg2) % (this.anInt5360 * 1646265739) * 1167437169;
			this.notifyAll();
			return arg2;
		}
	}

	@OriginalMember(owner = "client!up", name = "h", descriptor = "()V")
	public void method32014() {
		while (true) {
			@Pc(27) int local27;
			synchronized (this) {
				while (true) {
					if (this.anIOException2 != null) {
						return;
					}
					if (this.anInt5361 * 314536849 == 0) {
						local27 = this.anInt5360 * 1646265739 - this.anInt5362 * 1564388367 - 1;
					} else if (this.anInt5361 * 314536849 <= this.anInt5362 * 1564388367) {
						local27 = this.anInt5360 * 1646265739 - this.anInt5362 * 1564388367;
					} else {
						local27 = this.anInt5361 * 314536849 - this.anInt5362 * 1564388367 - 1;
					}
					if (local27 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(67) InterruptedException local67) {
					}
				}
			}
			@Pc(87) int local87;
			try {
				local87 = this.anInputStream2.read(this.aByteArray107, this.anInt5362 * 1564388367, local27);
				if (local87 == -1) {
					throw new EOFException();
				}
			} catch (@Pc(96) IOException local96x) {
				@Pc(96) IOException local96 = local96x;
				synchronized (this) {
					this.anIOException2 = local96;
					return;
				}
			}
			synchronized (this) {
				this.anInt5362 = (local87 + this.anInt5362 * 1564388367) % (this.anInt5360 * 1646265739) * 407290607;
			}
		}
	}

	@OriginalMember(owner = "client!up", name = "i", descriptor = "(I)Z")
	boolean method32015(@OriginalArg(0) int arg0) throws IOException {
		if (arg0 == 0) {
			return true;
		} else if (arg0 > 0 && arg0 < this.anInt5360 * 1646265739) {
			synchronized (this) {
				@Pc(39) int local39;
				if (this.anInt5361 * 314536849 <= this.anInt5362 * 1564388367) {
					local39 = this.anInt5362 * 1564388367 - this.anInt5361 * 314536849;
				} else {
					local39 = this.anInt5360 * 1646265739 - this.anInt5361 * 314536849 + this.anInt5362 * 1564388367;
				}
				if (local39 >= arg0) {
					return true;
				} else if (this.anIOException2 == null) {
					this.notifyAll();
					return false;
				} else {
					throw new IOException(this.anIOException2.toString());
				}
			}
		} else {
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!up", name = "r", descriptor = "()V")
	void method32016() {
		synchronized (this) {
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread11.join();
		} catch (@Pc(28) InterruptedException local28) {
		}
	}

	@OriginalMember(owner = "client!up", name = "d", descriptor = "()V")
	void method32017() {
		this.anInputStream2 = new InputStream_Sub1();
	}
}
