package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pv")
public final class Class495 implements Runnable {

	@OriginalMember(owner = "client!pv", name = "t", descriptor = "I")
	static int anInt5032;

	@OriginalMember(owner = "client!pv", name = "f", descriptor = "Lclient!aaa;")
	SecondaryLinkedList aSecondaryLinkedList_16 = new SecondaryLinkedList();

	@OriginalMember(owner = "client!pv", name = "e", descriptor = "I")
	int anInt5031 = 0;

	@OriginalMember(owner = "client!pv", name = "u", descriptor = "Z")
	boolean aBoolean885 = false;

	@OriginalMember(owner = "client!pv", name = "l", descriptor = "Ljava/lang/Thread;")
	Thread aThread9 = new Thread(this);

	@OriginalMember(owner = "client!pv", name = "<init>", descriptor = "()V")
	public Class495() {
		this.aThread9.setDaemon(true);
		this.aThread9.start();
		this.aThread9.setPriority(1);
	}

	@OriginalMember(owner = "client!pv", name = "l", descriptor = "(I)I")
	public int method30298(@OriginalArg(0) int arg0) {
		@Pc(3) SecondaryLinkedList local3 = this.aSecondaryLinkedList_16;
		synchronized (this.aSecondaryLinkedList_16) {
			return this.anInt5031 * -672453825;
		}
	}

	@OriginalMember(owner = "client!pv", name = "q", descriptor = "()V")
	public void method30299() {
		while (!this.aBoolean885) {
			@Pc(6) SecondaryLinkedList local6 = this.aSecondaryLinkedList_16;
			@Pc(13) Js5WorkerRequest local13;
			synchronized (this.aSecondaryLinkedList_16) {
				local13 = (Js5WorkerRequest) this.aSecondaryLinkedList_16.method67(-824510309);
				if (local13 == null) {
					try {
						this.aSecondaryLinkedList_16.wait();
					} catch (@Pc(27) InterruptedException local27) {
					}
					continue;
				}
				this.anInt5031 -= 1383220415;
			}
			try {
				if (local13.anInt3256 * 786270235 == 2) {
					local13.aClass592_3.method31938((int) (local13.dualKey * 4203303297430504511L), local13.aByteArray63, local13.aByteArray63.length, (byte) -107);
				} else if (local13.anInt3256 * 786270235 == 3) {
					local13.aByteArray63 = local13.aClass592_3.method31942((int) (local13.dualKey * 4203303297430504511L), -11511322);
				}
			} catch (@Pc(79) Exception local79) {
				Class603.method32133(null, local79, 839300151);
			}
			local13.incomplete = false;
		}
	}

	@OriginalMember(owner = "client!pv", name = "f", descriptor = "(I[BLclient!uf;I)Lclient!atr;")
	Js5WorkerRequest method30300(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) Class592 arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Js5WorkerRequest local3 = new Js5WorkerRequest();
		local3.anInt3256 = 2140021798;
		local3.dualKey = (long) arg0 * -4191731634426926145L;
		local3.aByteArray63 = arg1;
		local3.aClass592_3 = arg2;
		local3.aBoolean663 = false;
		this.method30302(local3, -280901797);
		return local3;
	}

	@OriginalMember(owner = "client!pv", name = "e", descriptor = "(ILclient!uf;I)Lclient!atr;")
	Js5WorkerRequest method30301(@OriginalArg(0) int arg0, @OriginalArg(1) Class592 arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Js5WorkerRequest local3 = new Js5WorkerRequest();
		local3.anInt3256 = 1062549049;
		local3.dualKey = (long) arg0 * -4191731634426926145L;
		local3.aClass592_3 = arg1;
		local3.aBoolean663 = false;
		this.method30302(local3, -948335029);
		return local3;
	}

	@OriginalMember(owner = "client!pv", name = "u", descriptor = "(Lclient!atr;I)V")
	void method30302(@OriginalArg(0) Js5WorkerRequest arg0, @OriginalArg(1) int arg1) {
		@Pc(3) SecondaryLinkedList local3 = this.aSecondaryLinkedList_16;
		synchronized (this.aSecondaryLinkedList_16) {
			this.aSecondaryLinkedList_16.addTail(arg0, 1599142138);
			this.anInt5031 += 1383220415;
			this.aSecondaryLinkedList_16.notifyAll();
		}
	}

	@OriginalMember(owner = "client!pv", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (!this.aBoolean885) {
			@Pc(6) SecondaryLinkedList local6 = this.aSecondaryLinkedList_16;
			@Pc(13) Js5WorkerRequest local13;
			synchronized (this.aSecondaryLinkedList_16) {
				local13 = (Js5WorkerRequest) this.aSecondaryLinkedList_16.method67(-1344617203);
				if (local13 == null) {
					try {
						this.aSecondaryLinkedList_16.wait();
					} catch (@Pc(27) InterruptedException local27) {
					}
					continue;
				}
				this.anInt5031 -= 1383220415;
			}
			try {
				if (local13.anInt3256 * 786270235 == 2) {
					local13.aClass592_3.method31938((int) (local13.dualKey * 4203303297430504511L), local13.aByteArray63, local13.aByteArray63.length, (byte) -61);
				} else if (local13.anInt3256 * 786270235 == 3) {
					local13.aByteArray63 = local13.aClass592_3.method31942((int) (local13.dualKey * 4203303297430504511L), 895040346);
				}
			} catch (@Pc(79) Exception local79) {
				Class603.method32133(null, local79, 839300151);
			}
			local13.incomplete = false;
		}
	}

	@OriginalMember(owner = "client!pv", name = "v", descriptor = "()I")
	public int method30303() {
		@Pc(3) SecondaryLinkedList local3 = this.aSecondaryLinkedList_16;
		synchronized (this.aSecondaryLinkedList_16) {
			return this.anInt5031 * -672453825;
		}
	}

	@OriginalMember(owner = "client!pv", name = "n", descriptor = "()V")
	public void method30304() {
		this.aBoolean885 = true;
		@Pc(6) SecondaryLinkedList local6 = this.aSecondaryLinkedList_16;
		synchronized (this.aSecondaryLinkedList_16) {
			this.aSecondaryLinkedList_16.notifyAll();
		}
		try {
			this.aThread9.join();
		} catch (@Pc(23) InterruptedException local23) {
		}
		this.aThread9 = null;
	}

	@OriginalMember(owner = "client!pv", name = "z", descriptor = "(Lclient!atr;)V")
	void method30305(@OriginalArg(0) Js5WorkerRequest arg0) {
		@Pc(3) SecondaryLinkedList local3 = this.aSecondaryLinkedList_16;
		synchronized (this.aSecondaryLinkedList_16) {
			this.aSecondaryLinkedList_16.addTail(arg0, 1599142138);
			this.anInt5031 += 1383220415;
			this.aSecondaryLinkedList_16.notifyAll();
		}
	}

	@OriginalMember(owner = "client!pv", name = "i", descriptor = "(ILclient!uf;)Lclient!atr;")
	Js5WorkerRequest method30306(@OriginalArg(0) int arg0, @OriginalArg(1) Class592 arg1) {
		@Pc(3) Js5WorkerRequest local3 = new Js5WorkerRequest();
		local3.anInt3256 = -1077472749;
		@Pc(10) SecondaryLinkedList local10 = this.aSecondaryLinkedList_16;
		synchronized (this.aSecondaryLinkedList_16) {
			@Pc(17) Js5WorkerRequest local17 = (Js5WorkerRequest) this.aSecondaryLinkedList_16.head((byte) 71);
			while (true) {
				if (local17 == null) {
					break;
				}
				if (local17.dualKey * 4203303297430504511L == (long) arg0 && local17.aClass592_3 == arg1 && local17.anInt3256 * 786270235 == 2) {
					local3.aByteArray63 = local17.aByteArray63;
					local3.incomplete = false;
					return local3;
				}
				local17 = (Js5WorkerRequest) this.aSecondaryLinkedList_16.next((byte) -102);
			}
		}
		local3.aByteArray63 = arg1.method31942(arg0, 394178350);
		local3.incomplete = false;
		local3.aBoolean663 = true;
		return local3;
	}

	@OriginalMember(owner = "client!pv", name = "m", descriptor = "(ILclient!uf;)Lclient!atr;")
	Js5WorkerRequest method30307(@OriginalArg(0) int arg0, @OriginalArg(1) Class592 arg1) {
		@Pc(3) Js5WorkerRequest local3 = new Js5WorkerRequest();
		local3.anInt3256 = -1077472749;
		@Pc(10) SecondaryLinkedList local10 = this.aSecondaryLinkedList_16;
		synchronized (this.aSecondaryLinkedList_16) {
			@Pc(17) Js5WorkerRequest local17 = (Js5WorkerRequest) this.aSecondaryLinkedList_16.head((byte) 95);
			while (true) {
				if (local17 == null) {
					break;
				}
				if (local17.dualKey * 4203303297430504511L == (long) arg0 && local17.aClass592_3 == arg1 && local17.anInt3256 * 786270235 == 2) {
					local3.aByteArray63 = local17.aByteArray63;
					local3.incomplete = false;
					return local3;
				}
				local17 = (Js5WorkerRequest) this.aSecondaryLinkedList_16.next((byte) -102);
			}
		}
		local3.aByteArray63 = arg1.method31942(arg0, -707352554);
		local3.incomplete = false;
		local3.aBoolean663 = true;
		return local3;
	}

	@OriginalMember(owner = "client!pv", name = "o", descriptor = "(ILclient!uf;)Lclient!atr;")
	Js5WorkerRequest method30308(@OriginalArg(0) int arg0, @OriginalArg(1) Class592 arg1) {
		@Pc(3) Js5WorkerRequest local3 = new Js5WorkerRequest();
		local3.anInt3256 = -1077472749;
		@Pc(10) SecondaryLinkedList local10 = this.aSecondaryLinkedList_16;
		synchronized (this.aSecondaryLinkedList_16) {
			@Pc(17) Js5WorkerRequest local17 = (Js5WorkerRequest) this.aSecondaryLinkedList_16.head((byte) 9);
			while (true) {
				if (local17 == null) {
					break;
				}
				if (local17.dualKey * 4203303297430504511L == (long) arg0 && local17.aClass592_3 == arg1 && local17.anInt3256 * 786270235 == 2) {
					local3.aByteArray63 = local17.aByteArray63;
					local3.incomplete = false;
					return local3;
				}
				local17 = (Js5WorkerRequest) this.aSecondaryLinkedList_16.next((byte) -102);
			}
		}
		local3.aByteArray63 = arg1.method31942(arg0, 2031924132);
		local3.incomplete = false;
		local3.aBoolean663 = true;
		return local3;
	}

	@OriginalMember(owner = "client!pv", name = "j", descriptor = "(ILclient!uf;)Lclient!atr;")
	Js5WorkerRequest method30309(@OriginalArg(0) int arg0, @OriginalArg(1) Class592 arg1) {
		@Pc(3) Js5WorkerRequest local3 = new Js5WorkerRequest();
		local3.anInt3256 = -1077472749;
		@Pc(10) SecondaryLinkedList local10 = this.aSecondaryLinkedList_16;
		synchronized (this.aSecondaryLinkedList_16) {
			@Pc(17) Js5WorkerRequest local17 = (Js5WorkerRequest) this.aSecondaryLinkedList_16.head((byte) 46);
			while (true) {
				if (local17 == null) {
					break;
				}
				if (local17.dualKey * 4203303297430504511L == (long) arg0 && local17.aClass592_3 == arg1 && local17.anInt3256 * 786270235 == 2) {
					local3.aByteArray63 = local17.aByteArray63;
					local3.incomplete = false;
					return local3;
				}
				local17 = (Js5WorkerRequest) this.aSecondaryLinkedList_16.next((byte) -102);
			}
		}
		local3.aByteArray63 = arg1.method31942(arg0, 908814638);
		local3.incomplete = false;
		local3.aBoolean663 = true;
		return local3;
	}

	@OriginalMember(owner = "client!pv", name = "c", descriptor = "()V")
	public void method30310() {
		this.aBoolean885 = true;
		@Pc(6) SecondaryLinkedList local6 = this.aSecondaryLinkedList_16;
		synchronized (this.aSecondaryLinkedList_16) {
			this.aSecondaryLinkedList_16.notifyAll();
		}
		try {
			this.aThread9.join();
		} catch (@Pc(23) InterruptedException local23) {
		}
		this.aThread9 = null;
	}

	@OriginalMember(owner = "client!pv", name = "s", descriptor = "(I[BLclient!uf;)Lclient!atr;")
	Js5WorkerRequest method30311(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) Class592 arg2) {
		@Pc(3) Js5WorkerRequest local3 = new Js5WorkerRequest();
		local3.anInt3256 = 2140021798;
		local3.dualKey = (long) arg0 * -4191731634426926145L;
		local3.aByteArray63 = arg1;
		local3.aClass592_3 = arg2;
		local3.aBoolean663 = false;
		this.method30302(local3, -1561973470);
		return local3;
	}

	@OriginalMember(owner = "client!pv", name = "k", descriptor = "(I[BLclient!uf;)Lclient!atr;")
	Js5WorkerRequest method30312(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) Class592 arg2) {
		@Pc(3) Js5WorkerRequest local3 = new Js5WorkerRequest();
		local3.anInt3256 = 2140021798;
		local3.dualKey = (long) arg0 * -4191731634426926145L;
		local3.aByteArray63 = arg1;
		local3.aClass592_3 = arg2;
		local3.aBoolean663 = false;
		this.method30302(local3, -1462071004);
		return local3;
	}

	@OriginalMember(owner = "client!pv", name = "x", descriptor = "(I[BLclient!uf;)Lclient!atr;")
	Js5WorkerRequest method30313(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) Class592 arg2) {
		@Pc(3) Js5WorkerRequest local3 = new Js5WorkerRequest();
		local3.anInt3256 = 2140021798;
		local3.dualKey = (long) arg0 * -4191731634426926145L;
		local3.aByteArray63 = arg1;
		local3.aClass592_3 = arg2;
		local3.aBoolean663 = false;
		this.method30302(local3, -1003935076);
		return local3;
	}

	@OriginalMember(owner = "client!pv", name = "w", descriptor = "(ILclient!uf;)Lclient!atr;")
	Js5WorkerRequest method30314(@OriginalArg(0) int arg0, @OriginalArg(1) Class592 arg1) {
		@Pc(3) Js5WorkerRequest local3 = new Js5WorkerRequest();
		local3.anInt3256 = 1062549049;
		local3.dualKey = (long) arg0 * -4191731634426926145L;
		local3.aClass592_3 = arg1;
		local3.aBoolean663 = false;
		this.method30302(local3, 652405943);
		return local3;
	}

	@OriginalMember(owner = "client!pv", name = "r", descriptor = "(ILclient!uf;)Lclient!atr;")
	Js5WorkerRequest method30315(@OriginalArg(0) int arg0, @OriginalArg(1) Class592 arg1) {
		@Pc(3) Js5WorkerRequest local3 = new Js5WorkerRequest();
		local3.anInt3256 = 1062549049;
		local3.dualKey = (long) arg0 * -4191731634426926145L;
		local3.aClass592_3 = arg1;
		local3.aBoolean663 = false;
		this.method30302(local3, 219562649);
		return local3;
	}

	@OriginalMember(owner = "client!pv", name = "d", descriptor = "(Lclient!atr;)V")
	void method30316(@OriginalArg(0) Js5WorkerRequest arg0) {
		@Pc(3) SecondaryLinkedList local3 = this.aSecondaryLinkedList_16;
		synchronized (this.aSecondaryLinkedList_16) {
			this.aSecondaryLinkedList_16.addTail(arg0, 1599142138);
			this.anInt5031 += 1383220415;
			this.aSecondaryLinkedList_16.notifyAll();
		}
	}

	@OriginalMember(owner = "client!pv", name = "g", descriptor = "(B)V")
	public void method30317(@OriginalArg(0) byte arg0) {
		this.aBoolean885 = true;
		@Pc(6) SecondaryLinkedList local6 = this.aSecondaryLinkedList_16;
		synchronized (this.aSecondaryLinkedList_16) {
			this.aSecondaryLinkedList_16.notifyAll();
		}
		try {
			this.aThread9.join();
		} catch (@Pc(23) InterruptedException local23) {
		}
		this.aThread9 = null;
	}

	@OriginalMember(owner = "client!pv", name = "b", descriptor = "()V")
	public void method30318() {
		this.aBoolean885 = true;
		@Pc(6) SecondaryLinkedList local6 = this.aSecondaryLinkedList_16;
		synchronized (this.aSecondaryLinkedList_16) {
			this.aSecondaryLinkedList_16.notifyAll();
		}
		try {
			this.aThread9.join();
		} catch (@Pc(23) InterruptedException local23) {
		}
		this.aThread9 = null;
	}

	@OriginalMember(owner = "client!pv", name = "p", descriptor = "(Lclient!atr;)V")
	void method30319(@OriginalArg(0) Js5WorkerRequest arg0) {
		@Pc(3) SecondaryLinkedList local3 = this.aSecondaryLinkedList_16;
		synchronized (this.aSecondaryLinkedList_16) {
			this.aSecondaryLinkedList_16.addTail(arg0, 1599142138);
			this.anInt5031 += 1383220415;
			this.aSecondaryLinkedList_16.notifyAll();
		}
	}

	@OriginalMember(owner = "client!pv", name = "y", descriptor = "()I")
	public int method30320() {
		@Pc(3) SecondaryLinkedList local3 = this.aSecondaryLinkedList_16;
		synchronized (this.aSecondaryLinkedList_16) {
			return this.anInt5031 * -672453825;
		}
	}

	@OriginalMember(owner = "client!pv", name = "h", descriptor = "()V")
	public void method30321() {
		while (!this.aBoolean885) {
			@Pc(6) SecondaryLinkedList local6 = this.aSecondaryLinkedList_16;
			@Pc(13) Js5WorkerRequest local13;
			synchronized (this.aSecondaryLinkedList_16) {
				local13 = (Js5WorkerRequest) this.aSecondaryLinkedList_16.method67(1619482679);
				if (local13 == null) {
					try {
						this.aSecondaryLinkedList_16.wait();
					} catch (@Pc(27) InterruptedException local27) {
					}
					continue;
				}
				this.anInt5031 -= 1383220415;
			}
			try {
				if (local13.anInt3256 * 786270235 == 2) {
					local13.aClass592_3.method31938((int) (local13.dualKey * 4203303297430504511L), local13.aByteArray63, local13.aByteArray63.length, (byte) -63);
				} else if (local13.anInt3256 * 786270235 == 3) {
					local13.aByteArray63 = local13.aClass592_3.method31942((int) (local13.dualKey * 4203303297430504511L), -396236295);
				}
			} catch (@Pc(79) Exception local79) {
				Class603.method32133(null, local79, 839300151);
			}
			local13.incomplete = false;
		}
	}

	@OriginalMember(owner = "client!pv", name = "t", descriptor = "(ILclient!uf;I)Lclient!atr;")
	Js5WorkerRequest method30322(@OriginalArg(0) int arg0, @OriginalArg(1) Class592 arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Js5WorkerRequest local3 = new Js5WorkerRequest();
		local3.anInt3256 = -1077472749;
		@Pc(10) SecondaryLinkedList local10 = this.aSecondaryLinkedList_16;
		synchronized (this.aSecondaryLinkedList_16) {
			@Pc(17) Js5WorkerRequest local17 = (Js5WorkerRequest) this.aSecondaryLinkedList_16.head((byte) 0);
			while (true) {
				if (local17 == null) {
					break;
				}
				if (local17.dualKey * 4203303297430504511L == (long) arg0 && local17.aClass592_3 == arg1 && local17.anInt3256 * 786270235 == 2) {
					local3.aByteArray63 = local17.aByteArray63;
					local3.incomplete = false;
					return local3;
				}
				local17 = (Js5WorkerRequest) this.aSecondaryLinkedList_16.next((byte) -102);
			}
		}
		local3.aByteArray63 = arg1.method31942(arg0, 1553269074);
		local3.incomplete = false;
		local3.aBoolean663 = true;
		return local3;
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(I[BLclient!uf;)Lclient!atr;")
	Js5WorkerRequest method30323(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) Class592 arg2) {
		@Pc(3) Js5WorkerRequest local3 = new Js5WorkerRequest();
		local3.anInt3256 = 2140021798;
		local3.dualKey = (long) arg0 * -4191731634426926145L;
		local3.aByteArray63 = arg1;
		local3.aClass592_3 = arg2;
		local3.aBoolean663 = false;
		this.method30302(local3, -846245468);
		return local3;
	}
}
