package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.util.zip.CRC32;

@OriginalClass("client!aih")
public final class Class141_Sub1 extends Class141 {

	@OriginalMember(owner = "client!aih", name = "s", descriptor = "B")
	static final byte aByte20 = 0;

	@OriginalMember(owner = "client!aih", name = "ax", descriptor = "I")
	static final int anInt1276 = 250;

	@OriginalMember(owner = "client!aih", name = "ai", descriptor = "I")
	static final int anInt1277 = 0;

	@OriginalMember(owner = "client!aih", name = "k", descriptor = "B")
	static final byte aByte21 = 1;

	@OriginalMember(owner = "client!aih", name = "x", descriptor = "B")
	static final byte aByte22 = -1;

	@OriginalMember(owner = "client!aih", name = "b", descriptor = "I")
	static final int anInt1279 = 1000;

	@OriginalMember(owner = "client!aih", name = "aq", descriptor = "I")
	static final int anInt1280 = 1;

	@OriginalMember(owner = "client!aih", name = "ao", descriptor = "I")
	static final int anInt1281 = 2;

	@OriginalMember(owner = "client!aih", name = "pm", descriptor = "I")
	public static int anInt1282;

	@OriginalMember(owner = "client!aih", name = "ay", descriptor = "Ljava/util/zip/CRC32;")
	static CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!aih", name = "h", descriptor = "Z")
	boolean aBoolean228;

	@OriginalMember(owner = "client!aih", name = "d", descriptor = "Z")
	boolean aBoolean229;

	@OriginalMember(owner = "client!aih", name = "a", descriptor = "Lclient!ps;")
	Js5ArchiveIndex index;

	@OriginalMember(owner = "client!aih", name = "w", descriptor = "[B")
	byte[] aByteArray35;

	@OriginalMember(owner = "client!aih", name = "r", descriptor = "I")
	int anInt1278 = 0;

	@OriginalMember(owner = "client!aih", name = "q", descriptor = "Lclient!aax;")
	Class24 aClass24_8 = new Class24(16);

	@OriginalMember(owner = "client!aih", name = "p", descriptor = "I")
	int anInt1275 = 0;

	@OriginalMember(owner = "client!aih", name = "y", descriptor = "Lclient!aag;")
	Class8 aClass8_17 = new Class8();

	@OriginalMember(owner = "client!aih", name = "c", descriptor = "J")
	long aLong43 = 0L;

	@OriginalMember(owner = "client!aih", name = "t", descriptor = "I")
	int id;

	@OriginalMember(owner = "client!aih", name = "l", descriptor = "Lclient!uf;")
	Class592 indexFileSystem;

	@OriginalMember(owner = "client!aih", name = "z", descriptor = "Z")
	boolean aBoolean230;

	@OriginalMember(owner = "client!aih", name = "v", descriptor = "Lclient!aag;")
	Class8 aClass8_16;

	@OriginalMember(owner = "client!aih", name = "g", descriptor = "Lclient!uf;")
	Class592 fileSystem;

	@OriginalMember(owner = "client!aih", name = "f", descriptor = "Lclient!pz;")
	Js5NetQueue js5ClientTcp;

	@OriginalMember(owner = "client!aih", name = "e", descriptor = "Lclient!pq;")
	Class490 aClass490_1;

	@OriginalMember(owner = "client!aih", name = "u", descriptor = "Lclient!pv;")
	Class495 aClass495_1;

	@OriginalMember(owner = "client!aih", name = "m", descriptor = "I")
	int anInt1274;

	@OriginalMember(owner = "client!aih", name = "o", descriptor = "[B")
	byte[] aByteArray34;

	@OriginalMember(owner = "client!aih", name = "j", descriptor = "I")
	int version;

	@OriginalMember(owner = "client!aih", name = "n", descriptor = "Z")
	boolean aBoolean231;

	@OriginalMember(owner = "client!aih", name = "i", descriptor = "Lclient!asj;")
	Class80_Sub1_Sub15 groupContainer;

	@OriginalMember(owner = "client!aih", name = "<init>", descriptor = "(ILclient!uf;Lclient!uf;Lclient!pz;Lclient!pq;Lclient!pv;I[BIZI)V")
	Class141_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class592 arg1, @OriginalArg(2) Class592 arg2, @OriginalArg(3) Js5NetQueue arg3, @OriginalArg(4) Class490 arg4, @OriginalArg(5) Class495 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10) {
		this.id = arg0 * -1524126695;
		this.indexFileSystem = arg1;
		if (this.indexFileSystem == null) {
			this.aBoolean230 = false;
		} else {
			this.aBoolean230 = true;
			this.aClass8_16 = new Class8();
		}
		this.fileSystem = arg2;
		this.js5ClientTcp = arg3;
		this.aClass490_1 = arg4;
		this.aClass495_1 = arg5;
		this.anInt1274 = arg6 * -1811804807;
		this.aByteArray34 = arg7;
		this.version = arg8 * 1882074037;
		this.aBoolean231 = arg9;
		if (this.fileSystem != null) {
			this.groupContainer = this.aClass495_1.method30322(this.id * -1082200023, this.fileSystem, -599053745);
		}
	}

	@OriginalMember(owner = "client!aih", name = "ag", descriptor = "()I")
	public int method10907() {
		if (this.getIndex(170372401) == null) {
			return this.groupContainer == null ? 0 : this.groupContainer.method24391(303395675);
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!aih", name = "w", descriptor = "(I[BIII)V")
	void method10908(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.method10909(arg0, arg1, arg2, arg3, (byte) 8)) {
			return;
		}
		this.anInt1274 = arg0 * -1811804807;
		this.aByteArray34 = arg1;
		this.version = arg2 * 1882074037;
		this.index = null;
		this.groupContainer = null;
		if (!this.js5ClientTcp.isRequestQueueFull((short) 14833)) {
			this.groupContainer = this.js5ClientTcp.requestGroup(255, this.id * -1082200023, (byte) 0, true, 1007267469);
		}
	}

	@OriginalMember(owner = "client!aih", name = "r", descriptor = "(I[BIIB)Z")
	boolean method10909(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		if (arg0 == this.anInt1274 * 908053705 && arg2 == this.version * 1134930589) {
			@Pc(13) boolean local13 = true;
			for (@Pc(15) int local15 = 0; local15 < this.aByteArray34.length; local15++) {
				if (this.aByteArray34[local15] != arg1[local15]) {
					local13 = false;
					break;
				}
			}
			if (local13) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!aih", name = "q", descriptor = "(B)I")
	public int method10910(@OriginalArg(0) byte arg0) {
		if (this.getIndex(-530351256) == null) {
			return this.groupContainer == null ? 0 : this.groupContainer.method24391(984871097);
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!aih", name = "t", descriptor = "(I)Lclient!ps;")
	@Override
	Js5ArchiveIndex getIndex(@OriginalArg(0) int arg0) {
		if (this.index != null) {
			return this.index;
		}
		if (this.groupContainer == null) {
			if (this.js5ClientTcp.isRequestQueueFull((short) -9919)) {
				return null;
			}
			this.groupContainer = this.js5ClientTcp.requestGroup(255, this.id * -1082200023, (byte) 0, true, 319190053);
		}
		if (this.groupContainer.incomplete) {
			return null;
		}
		@Pc(41) byte[] local41 = this.groupContainer.getData(-2133825886);
		if (this.groupContainer instanceof Js5WorkerRequest) {
			try {
				if (local41 == null) {
					throw new RuntimeException();
				}
				this.index = new Js5ArchiveIndex(local41, this.anInt1274 * 908053705, this.aByteArray34);
				if (this.index.version * -1723675051 != this.version * 1134930589) {
					throw new RuntimeException();
				}
			} catch (@Pc(80) RuntimeException local80) {
				this.index = null;
				if (this.js5ClientTcp.isRequestQueueFull((short) 19636)) {
					this.groupContainer = null;
				} else {
					this.groupContainer = this.js5ClientTcp.requestGroup(255, this.id * -1082200023, (byte) 0, true, -273486495);
				}
				return null;
			}
		} else {
			try {
				if (local41 == null) {
					throw new RuntimeException();
				}
				this.index = new Js5ArchiveIndex(local41, this.anInt1274 * 908053705, this.aByteArray34);
			} catch (@Pc(127) RuntimeException local127) {
				this.js5ClientTcp.rekey(255, this.id * -1082200023, -1292157617);
				this.index = null;
				if (this.js5ClientTcp.isRequestQueueFull((short) 3326)) {
					this.groupContainer = null;
				} else {
					this.groupContainer = this.js5ClientTcp.requestGroup(255, this.id * -1082200023, (byte) 0, true, 165652648);
				}
				return null;
			}
			if (this.fileSystem != null) {
				this.aClass495_1.method30300(this.id * -1082200023, local41, this.fileSystem, -1781442356);
			}
		}
		this.groupContainer = null;
		if (this.indexFileSystem != null) {
			this.aByteArray35 = new byte[this.index.groupArraySize * 183068259];
			this.anInt1278 = 0;
		}
		return this.index;
	}

	@OriginalMember(owner = "client!aih", name = "f", descriptor = "(IB)[B")
	@Override
	byte[] method10891(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(5) Class80_Sub1_Sub15 local5 = this.method10934(arg0, 0, (byte) -31);
		if (local5 == null) {
			return null;
		} else {
			@Pc(14) byte[] local14 = local5.getData(-2133825886);
			local5.method24395((byte) 42);
			return local14;
		}
	}

	@OriginalMember(owner = "client!aih", name = "a", descriptor = "(I)[B")
	@Override
	byte[] method10900(@OriginalArg(0) int arg0) {
		@Pc(5) Class80_Sub1_Sub15 local5 = this.method10934(arg0, 0, (byte) -126);
		if (local5 == null) {
			return null;
		} else {
			@Pc(14) byte[] local14 = local5.getData(-2133825886);
			local5.method24395((byte) 86);
			return local14;
		}
	}

	@OriginalMember(owner = "client!aih", name = "d", descriptor = "(I)V")
	void updateLoad(@OriginalArg(0) int arg0) {
		if (this.aClass8_16 == null || this.getIndex(392681118) == null) {
			return;
		}
		for (@Pc(14) Class80 local14 = this.aClass8_17.method247(129206984); local14 != null; local14 = this.aClass8_17.method237(-1650179354)) {
			@Pc(23) int local23 = (int) (local14.aLong338 * 3209506792906532031L);
			if (local23 < 0 || local23 >= this.index.groupArraySize * 183068259 || this.index.anIntArray462[local23] == 0) {
				local14.method24395((byte) 6);
			} else {
				if (this.aByteArray35[local23] == 0) {
					this.method10934(local23, 1, (byte) -76);
				}
				if (this.aByteArray35[local23] == -1) {
					this.method10934(local23, 2, (byte) -115);
				}
				if (this.aByteArray35[local23] == 1) {
					local14.method24395((byte) 78);
				}
			}
		}
	}

	@OriginalMember(owner = "client!aih", name = "z", descriptor = "(B)V")
	void updatePreload(@OriginalArg(0) byte arg0) {
		if (this.aClass8_16 != null) {
			if (this.getIndex(-664763865) == null) {
				return;
			}
			@Pc(12) boolean local12;
			@Pc(17) Class80 local17;
			@Pc(25) int local25;
			if (this.aBoolean230) {
				local12 = true;
				for (local17 = this.aClass8_16.method247(129206984); local17 != null; local17 = this.aClass8_16.method237(-395874719)) {
					local25 = (int) (local17.aLong338 * 3209506792906532031L);
					if (this.aByteArray35[local25] == 0) {
						this.method10934(local25, 1, (byte) -61);
					}
					if (this.aByteArray35[local25] == 0) {
						local12 = false;
					} else {
						local17.method24395((byte) 30);
					}
				}
				while (this.anInt1275 * -282057065 < this.index.anIntArray462.length) {
					if (this.index.anIntArray462[this.anInt1275 * -282057065] == 0) {
						this.anInt1275 += -1571702489;
					} else {
						if (this.aClass495_1.anInt5031 * -672453825 >= 250) {
							local12 = false;
							break;
						}
						if (this.aByteArray35[this.anInt1275 * -282057065] == 0) {
							this.method10934(this.anInt1275 * -282057065, 1, (byte) -6);
						}
						if (this.aByteArray35[this.anInt1275 * -282057065] == 0) {
							local17 = new Class80();
							local17.aLong338 = (long) this.anInt1275 * -5003607921532847063L;
							this.aClass8_16.method232(local17, 1445139154);
							local12 = false;
						}
						this.anInt1275 += -1571702489;
					}
				}
				if (local12) {
					this.aBoolean230 = false;
					this.anInt1275 = 0;
				}
			} else if (this.aBoolean228) {
				local12 = true;
				for (local17 = this.aClass8_16.method247(129206984); local17 != null; local17 = this.aClass8_16.method237(-2104707835)) {
					local25 = (int) (local17.aLong338 * 3209506792906532031L);
					if (this.aByteArray35[local25] != 1) {
						this.method10934(local25, 2, (byte) -1);
					}
					if (this.aByteArray35[local25] == 1) {
						local17.method24395((byte) 36);
					} else {
						local12 = false;
					}
				}
				while (this.anInt1275 * -282057065 < this.index.anIntArray462.length) {
					if (this.index.anIntArray462[this.anInt1275 * -282057065] == 0) {
						this.anInt1275 += -1571702489;
					} else {
						if (this.js5ClientTcp.method10764((byte) 66)) {
							local12 = false;
							break;
						}
						if (this.aByteArray35[this.anInt1275 * -282057065] != 1) {
							this.method10934(this.anInt1275 * -282057065, 2, (byte) -112);
						}
						if (this.aByteArray35[this.anInt1275 * -282057065] != 1) {
							local17 = new Class80();
							local17.aLong338 = (long) this.anInt1275 * -5003607921532847063L;
							this.aClass8_16.method232(local17, 1299200033);
							local12 = false;
						}
						this.anInt1275 += -1571702489;
					}
				}
				if (local12) {
					this.aBoolean228 = false;
					this.anInt1275 = 0;
				}
			} else {
				this.aClass8_16 = null;
			}
		}
		if (!this.aBoolean231 || Class303.currentTimeMillis((byte) 25) < this.aLong43 * -3907920030764178305L) {
			return;
		}
		for (@Pc(312) Class80_Sub1_Sub15 local312 = (Class80_Sub1_Sub15) this.aClass24_8.method580((byte) -102); local312 != null; local312 = (Class80_Sub1_Sub15) this.aClass24_8.method566((byte) 7)) {
			if (!local312.incomplete) {
				if (local312.aBoolean662) {
					if (!local312.aBoolean663) {
						throw new RuntimeException();
					}
					local312.method24395((byte) 6);
				} else {
					local312.aBoolean662 = true;
				}
			}
		}
		this.aLong43 = (Class303.currentTimeMillis((byte) 53) + 1000L) * 3319804436531960703L;
	}

	@OriginalMember(owner = "client!aih", name = "az", descriptor = "()Z")
	boolean method10913() {
		return this.aClass490_1 != null;
	}

	@OriginalMember(owner = "client!aih", name = "v", descriptor = "(I)I")
	public int method10914(@OriginalArg(0) int arg0) {
		return this.anInt1278 * -261096903;
	}

	@OriginalMember(owner = "client!aih", name = "ap", descriptor = "(Z)V")
	void method10915(@OriginalArg(0) boolean arg0) {
		this.aClass490_1.method30225(arg0, -308599689);
	}

	@OriginalMember(owner = "client!aih", name = "af", descriptor = "()V")
	void method10916() {
		if (this.aClass8_16 != null) {
			if (this.getIndex(152352796) == null) {
				return;
			}
			@Pc(12) boolean local12;
			@Pc(17) Class80 local17;
			@Pc(25) int local25;
			if (this.aBoolean230) {
				local12 = true;
				for (local17 = this.aClass8_16.method247(129206984); local17 != null; local17 = this.aClass8_16.method237(603338303)) {
					local25 = (int) (local17.aLong338 * 3209506792906532031L);
					if (this.aByteArray35[local25] == 0) {
						this.method10934(local25, 1, (byte) -116);
					}
					if (this.aByteArray35[local25] == 0) {
						local12 = false;
					} else {
						local17.method24395((byte) 79);
					}
				}
				while (this.anInt1275 * -282057065 < this.index.anIntArray462.length) {
					if (this.index.anIntArray462[this.anInt1275 * -282057065] == 0) {
						this.anInt1275 += -1571702489;
					} else {
						if (this.aClass495_1.anInt5031 * -672453825 >= 250) {
							local12 = false;
							break;
						}
						if (this.aByteArray35[this.anInt1275 * -282057065] == 0) {
							this.method10934(this.anInt1275 * -282057065, 1, (byte) -27);
						}
						if (this.aByteArray35[this.anInt1275 * -282057065] == 0) {
							local17 = new Class80();
							local17.aLong338 = (long) this.anInt1275 * -5003607921532847063L;
							this.aClass8_16.method232(local17, 1566365900);
							local12 = false;
						}
						this.anInt1275 += -1571702489;
					}
				}
				if (local12) {
					this.aBoolean230 = false;
					this.anInt1275 = 0;
				}
			} else if (this.aBoolean228) {
				local12 = true;
				for (local17 = this.aClass8_16.method247(129206984); local17 != null; local17 = this.aClass8_16.method237(-1735019981)) {
					local25 = (int) (local17.aLong338 * 3209506792906532031L);
					if (this.aByteArray35[local25] != 1) {
						this.method10934(local25, 2, (byte) -57);
					}
					if (this.aByteArray35[local25] == 1) {
						local17.method24395((byte) 40);
					} else {
						local12 = false;
					}
				}
				while (this.anInt1275 * -282057065 < this.index.anIntArray462.length) {
					if (this.index.anIntArray462[this.anInt1275 * -282057065] == 0) {
						this.anInt1275 += -1571702489;
					} else {
						if (this.js5ClientTcp.method10764((byte) 78)) {
							local12 = false;
							break;
						}
						if (this.aByteArray35[this.anInt1275 * -282057065] != 1) {
							this.method10934(this.anInt1275 * -282057065, 2, (byte) -107);
						}
						if (this.aByteArray35[this.anInt1275 * -282057065] != 1) {
							local17 = new Class80();
							local17.aLong338 = (long) this.anInt1275 * -5003607921532847063L;
							this.aClass8_16.method232(local17, 1350148784);
							local12 = false;
						}
						this.anInt1275 += -1571702489;
					}
				}
				if (local12) {
					this.aBoolean228 = false;
					this.anInt1275 = 0;
				}
			} else {
				this.aClass8_16 = null;
			}
		}
		if (!this.aBoolean231 || Class303.currentTimeMillis((byte) 41) < this.aLong43 * -3907920030764178305L) {
			return;
		}
		for (@Pc(312) Class80_Sub1_Sub15 local312 = (Class80_Sub1_Sub15) this.aClass24_8.method580((byte) -38); local312 != null; local312 = (Class80_Sub1_Sub15) this.aClass24_8.method566((byte) 7)) {
			if (!local312.incomplete) {
				if (local312.aBoolean662) {
					if (!local312.aBoolean663) {
						throw new RuntimeException();
					}
					local312.method24395((byte) 24);
				} else {
					local312.aBoolean662 = true;
				}
			}
		}
		this.aLong43 = (Class303.currentTimeMillis((byte) 107) + 1000L) * 3319804436531960703L;
	}

	@OriginalMember(owner = "client!aih", name = "n", descriptor = "(B)V")
	public void method10917(@OriginalArg(0) byte arg0) {
		if (this.aClass490_1 != null || this.indexFileSystem == null) {
			return;
		}
		this.aBoolean228 = true;
		this.aBoolean229 = true;
		if (this.aClass8_16 == null) {
			this.aClass8_16 = new Class8();
		}
	}

	@OriginalMember(owner = "client!aih", name = "u", descriptor = "(IB)I")
	@Override
	int method10893(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(6) Class80_Sub1_Sub15 local6 = (Class80_Sub1_Sub15) this.aClass24_8.method560((long) arg0);
		return local6 == null ? 0 : local6.method24391(619591746);
	}

	@OriginalMember(owner = "client!aih", name = "c", descriptor = "(I)Z")
	public boolean method10918(@OriginalArg(0) int arg0) {
		return this.aBoolean229;
	}

	@OriginalMember(owner = "client!aih", name = "b", descriptor = "(ZI)V")
	void method10919(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		this.aClass490_1.method30225(arg0, -308599689);
	}

	@OriginalMember(owner = "client!aih", name = "ax", descriptor = "(B)Z")
	boolean method10920(@OriginalArg(0) byte arg0) {
		return this.aClass490_1 != null;
	}

	@OriginalMember(owner = "client!aih", name = "ad", descriptor = "()I")
	public int method10921() {
		if (this.index == null) {
			return 0;
		} else if (this.aBoolean230) {
			@Pc(18) Class80 local18 = this.aClass8_16.method247(129206984);
			return local18 == null ? 0 : (int) (local18.aLong338 * 3209506792906532031L);
		} else {
			return this.index.anInt5024 * 2028811351;
		}
	}

	@OriginalMember(owner = "client!aih", name = "g", descriptor = "()Lclient!ps;")
	@Override
	Js5ArchiveIndex method10895() {
		if (this.index != null) {
			return this.index;
		}
		if (this.groupContainer == null) {
			if (this.js5ClientTcp.isRequestQueueFull((short) -11819)) {
				return null;
			}
			this.groupContainer = this.js5ClientTcp.requestGroup(255, this.id * -1082200023, (byte) 0, true, 1045708008);
		}
		if (this.groupContainer.incomplete) {
			return null;
		}
		@Pc(41) byte[] local41 = this.groupContainer.getData(-2133825886);
		if (this.groupContainer instanceof Js5WorkerRequest) {
			try {
				if (local41 == null) {
					throw new RuntimeException();
				}
				this.index = new Js5ArchiveIndex(local41, this.anInt1274 * 908053705, this.aByteArray34);
				if (this.index.version * -1723675051 != this.version * 1134930589) {
					throw new RuntimeException();
				}
			} catch (@Pc(80) RuntimeException local80) {
				this.index = null;
				if (this.js5ClientTcp.isRequestQueueFull((short) 3965)) {
					this.groupContainer = null;
				} else {
					this.groupContainer = this.js5ClientTcp.requestGroup(255, this.id * -1082200023, (byte) 0, true, 1067188394);
				}
				return null;
			}
		} else {
			try {
				if (local41 == null) {
					throw new RuntimeException();
				}
				this.index = new Js5ArchiveIndex(local41, this.anInt1274 * 908053705, this.aByteArray34);
			} catch (@Pc(127) RuntimeException local127) {
				this.js5ClientTcp.rekey(255, this.id * -1082200023, 1183402309);
				this.index = null;
				if (this.js5ClientTcp.isRequestQueueFull((short) 21715)) {
					this.groupContainer = null;
				} else {
					this.groupContainer = this.js5ClientTcp.requestGroup(255, this.id * -1082200023, (byte) 0, true, 326900159);
				}
				return null;
			}
			if (this.fileSystem != null) {
				this.aClass495_1.method30300(this.id * -1082200023, local41, this.fileSystem, -1808544587);
			}
		}
		this.groupContainer = null;
		if (this.indexFileSystem != null) {
			this.aByteArray35 = new byte[this.index.groupArraySize * 183068259];
			this.anInt1278 = 0;
		}
		return this.index;
	}

	@OriginalMember(owner = "client!aih", name = "i", descriptor = "()Lclient!ps;")
	@Override
	Js5ArchiveIndex method10890() {
		if (this.index != null) {
			return this.index;
		}
		if (this.groupContainer == null) {
			if (this.js5ClientTcp.isRequestQueueFull((short) -7274)) {
				return null;
			}
			this.groupContainer = this.js5ClientTcp.requestGroup(255, this.id * -1082200023, (byte) 0, true, -71030944);
		}
		if (this.groupContainer.incomplete) {
			return null;
		}
		@Pc(41) byte[] local41 = this.groupContainer.getData(-2133825886);
		if (this.groupContainer instanceof Js5WorkerRequest) {
			try {
				if (local41 == null) {
					throw new RuntimeException();
				}
				this.index = new Js5ArchiveIndex(local41, this.anInt1274 * 908053705, this.aByteArray34);
				if (this.index.version * -1723675051 != this.version * 1134930589) {
					throw new RuntimeException();
				}
			} catch (@Pc(80) RuntimeException local80) {
				this.index = null;
				if (this.js5ClientTcp.isRequestQueueFull((short) 14159)) {
					this.groupContainer = null;
				} else {
					this.groupContainer = this.js5ClientTcp.requestGroup(255, this.id * -1082200023, (byte) 0, true, -334677734);
				}
				return null;
			}
		} else {
			try {
				if (local41 == null) {
					throw new RuntimeException();
				}
				this.index = new Js5ArchiveIndex(local41, this.anInt1274 * 908053705, this.aByteArray34);
			} catch (@Pc(127) RuntimeException local127) {
				this.js5ClientTcp.rekey(255, this.id * -1082200023, -1855391201);
				this.index = null;
				if (this.js5ClientTcp.isRequestQueueFull((short) 17268)) {
					this.groupContainer = null;
				} else {
					this.groupContainer = this.js5ClientTcp.requestGroup(255, this.id * -1082200023, (byte) 0, true, -1145104926);
				}
				return null;
			}
			if (this.fileSystem != null) {
				this.aClass495_1.method30300(this.id * -1082200023, local41, this.fileSystem, -1978061821);
			}
		}
		this.groupContainer = null;
		if (this.indexFileSystem != null) {
			this.aByteArray35 = new byte[this.index.groupArraySize * 183068259];
			this.anInt1278 = 0;
		}
		return this.index;
	}

	@OriginalMember(owner = "client!aih", name = "p", descriptor = "(B)I")
	public int method10922(@OriginalArg(0) byte arg0) {
		return this.index == null ? 0 : this.index.anInt5024 * 2028811351;
	}

	@OriginalMember(owner = "client!aih", name = "o", descriptor = "(I)[B")
	@Override
	byte[] method10898(@OriginalArg(0) int arg0) {
		@Pc(5) Class80_Sub1_Sub15 local5 = this.method10934(arg0, 0, (byte) -112);
		if (local5 == null) {
			return null;
		} else {
			@Pc(14) byte[] local14 = local5.getData(-2133825886);
			local5.method24395((byte) 102);
			return local14;
		}
	}

	@OriginalMember(owner = "client!aih", name = "j", descriptor = "(I)[B")
	@Override
	byte[] method10899(@OriginalArg(0) int arg0) {
		@Pc(5) Class80_Sub1_Sub15 local5 = this.method10934(arg0, 0, (byte) -86);
		if (local5 == null) {
			return null;
		} else {
			@Pc(14) byte[] local14 = local5.getData(-2133825886);
			local5.method24395((byte) 17);
			return local14;
		}
	}

	@OriginalMember(owner = "client!aih", name = "ai", descriptor = "(I[BII)V")
	void method10923(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.method10909(arg0, arg1, arg2, arg3, (byte) 8)) {
			return;
		}
		this.anInt1274 = arg0 * -1811804807;
		this.aByteArray34 = arg1;
		this.version = arg2 * 1882074037;
		this.index = null;
		this.groupContainer = null;
		if (!this.js5ClientTcp.isRequestQueueFull((short) 26883)) {
			this.groupContainer = this.js5ClientTcp.requestGroup(255, this.id * -1082200023, (byte) 0, true, 776818924);
		}
	}

	@OriginalMember(owner = "client!aih", name = "m", descriptor = "(I)[B")
	@Override
	byte[] method10892(@OriginalArg(0) int arg0) {
		@Pc(5) Class80_Sub1_Sub15 local5 = this.method10934(arg0, 0, (byte) -95);
		if (local5 == null) {
			return null;
		} else {
			@Pc(14) byte[] local14 = local5.getData(-2133825886);
			local5.method24395((byte) 120);
			return local14;
		}
	}

	@OriginalMember(owner = "client!aih", name = "k", descriptor = "(I)I")
	@Override
	int method10896(@OriginalArg(0) int arg0) {
		@Pc(6) Class80_Sub1_Sub15 local6 = (Class80_Sub1_Sub15) this.aClass24_8.method560((long) arg0);
		return local6 == null ? 0 : local6.method24391(-1022343295);
	}

	@OriginalMember(owner = "client!aih", name = "x", descriptor = "(I)I")
	@Override
	int method10897(@OriginalArg(0) int arg0) {
		@Pc(6) Class80_Sub1_Sub15 local6 = (Class80_Sub1_Sub15) this.aClass24_8.method560((long) arg0);
		return local6 == null ? 0 : local6.method24391(622266400);
	}

	@OriginalMember(owner = "client!aih", name = "ao", descriptor = "(I[BII)Z")
	boolean method10924(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 == this.anInt1274 * 908053705 && arg2 == this.version * 1134930589) {
			@Pc(13) boolean local13 = true;
			for (@Pc(15) int local15 = 0; local15 < this.aByteArray34.length; local15++) {
				if (this.aByteArray34[local15] != arg1[local15]) {
					local13 = false;
					break;
				}
			}
			if (local13) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!aih", name = "ay", descriptor = "(I[BII)V")
	void method10925(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.method10909(arg0, arg1, arg2, arg3, (byte) 8)) {
			return;
		}
		this.anInt1274 = arg0 * -1811804807;
		this.aByteArray34 = arg1;
		this.version = arg2 * 1882074037;
		this.index = null;
		this.groupContainer = null;
		if (!this.js5ClientTcp.isRequestQueueFull((short) -8225)) {
			this.groupContainer = this.js5ClientTcp.requestGroup(255, this.id * -1082200023, (byte) 0, true, -406642914);
		}
	}

	@OriginalMember(owner = "client!aih", name = "aq", descriptor = "(I[BII)V")
	void method10926(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.method10909(arg0, arg1, arg2, arg3, (byte) 8)) {
			return;
		}
		this.anInt1274 = arg0 * -1811804807;
		this.aByteArray34 = arg1;
		this.version = arg2 * 1882074037;
		this.index = null;
		this.groupContainer = null;
		if (!this.js5ClientTcp.isRequestQueueFull((short) 28574)) {
			this.groupContainer = this.js5ClientTcp.requestGroup(255, this.id * -1082200023, (byte) 0, true, 117052133);
		}
	}

	@OriginalMember(owner = "client!aih", name = "ae", descriptor = "()V")
	public void method10927() {
		if (this.aClass490_1 != null || this.indexFileSystem == null) {
			return;
		}
		this.aBoolean228 = true;
		this.aBoolean229 = true;
		if (this.aClass8_16 == null) {
			this.aClass8_16 = new Class8();
		}
	}

	@OriginalMember(owner = "client!aih", name = "aj", descriptor = "(I[BII)Z")
	boolean method10928(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 == this.anInt1274 * 908053705 && arg2 == this.version * 1134930589) {
			@Pc(13) boolean local13 = true;
			for (@Pc(15) int local15 = 0; local15 < this.aByteArray34.length; local15++) {
				if (this.aByteArray34[local15] != arg1[local15]) {
					local13 = false;
					break;
				}
			}
			if (local13) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!aih", name = "ac", descriptor = "(I[BII)Z")
	boolean method10929(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 == this.anInt1274 * 908053705 && arg2 == this.version * 1134930589) {
			@Pc(13) boolean local13 = true;
			for (@Pc(15) int local15 = 0; local15 < this.aByteArray34.length; local15++) {
				if (this.aByteArray34[local15] != arg1[local15]) {
					local13 = false;
					break;
				}
			}
			if (local13) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!aih", name = "an", descriptor = "()V")
	public void method10930() {
		if (this.aClass490_1 != null || this.indexFileSystem == null) {
			return;
		}
		this.aBoolean228 = true;
		this.aBoolean229 = true;
		if (this.aClass8_16 == null) {
			this.aClass8_16 = new Class8();
		}
	}

	@OriginalMember(owner = "client!aih", name = "ab", descriptor = "()I")
	public int method10931() {
		if (this.getIndex(72274940) == null) {
			return this.groupContainer == null ? 0 : this.groupContainer.method24391(-1866285954);
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!aih", name = "al", descriptor = "(II)Lclient!asj;")
	Class80_Sub1_Sub15 method10932(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class80_Sub1_Sub15 local6 = (Class80_Sub1_Sub15) this.aClass24_8.method560((long) arg0);
		if (local6 != null && arg1 == 0 && !local6.aBoolean663 && local6.incomplete) {
			local6.method24395((byte) 46);
			local6 = null;
		}
		if (local6 == null) {
			if (arg1 == 0) {
				if (this.indexFileSystem != null && this.aByteArray35[arg0] != -1) {
					local6 = this.aClass495_1.method30322(arg0, this.indexFileSystem, -1677861061);
				} else if (this.aClass490_1 == null) {
					if (this.js5ClientTcp.isRequestQueueFull((short) 19826)) {
						return null;
					}
					local6 = this.js5ClientTcp.requestGroup(this.id * -1082200023, arg0, (byte) 2, true, 1262998327);
				} else {
					local6 = this.aClass490_1.request(this.id * -1082200023, arg0, (byte) 2, true, this.index.anIntArray455[arg0], this.index.anIntArray458[arg0], -42247531);
					if (local6 == null) {
						return null;
					}
				}
			} else if (arg1 == 1) {
				if (this.indexFileSystem == null) {
					throw new RuntimeException();
				}
				local6 = this.aClass495_1.method30301(arg0, this.indexFileSystem, 169599857);
			} else if (arg1 == 2) {
				if (this.indexFileSystem == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray35[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass490_1 != null) {
					return null;
				}
				if (this.js5ClientTcp.method10764((byte) 54)) {
					return null;
				}
				local6 = this.js5ClientTcp.requestGroup(this.id * -1082200023, arg0, (byte) 2, false, -250069837);
			} else {
				throw new RuntimeException();
			}
			this.aClass24_8.method563(local6, (long) arg0);
		}
		if (local6.incomplete) {
			return null;
		}
		@Pc(182) byte[] local182 = local6.getData(-2133825886);
		@Pc(209) int local209;
		@Pc(238) byte[] local238;
		@Pc(247) byte[] local247;
		@Pc(249) int local249;
		@Pc(370) Class80_Sub1_Sub15_Sub1 local370;
		@Pc(396) Js5NetRequest local396;
		if (!(local6 instanceof Js5WorkerRequest)) {
			try {
				if (local182 == null || local182.length <= 2) {
					if (this.aClass490_1 != null) {
						local6.method24395((byte) 75);
						return null;
					}
					throw new RuntimeException();
				}
				aCRC32_1.reset();
				aCRC32_1.update(local182, 0, local182.length - 2);
				local209 = (int) aCRC32_1.getValue();
				if (this.index.anIntArray455[arg0] != local209) {
					throw new RuntimeException();
				}
				if (this.index.aByteArrayArray16 != null && this.index.aByteArrayArray16[arg0] != null) {
					local238 = this.index.aByteArrayArray16[arg0];
					local247 = Class130_Sub1.compute(local182, 0, local182.length - 2, -1133576821);
					for (local249 = 0; local249 < 64; local249++) {
						if (local238[local249] != local247[local249]) {
							throw new RuntimeException();
						}
					}
				}
				if (this.aClass490_1 != null) {
					this.js5ClientTcp.errorCount = 0;
					this.js5ClientTcp.errorCode = 0;
				}
			} catch (@Pc(505) RuntimeException local505) {
				this.js5ClientTcp.rekey(this.id * -1082200023, arg0, -2065009239);
				local6.method24395((byte) 32);
				if (local6.aBoolean663) {
					if (this.aClass490_1 == null) {
						if (!this.js5ClientTcp.isRequestQueueFull((short) -24119)) {
							local396 = this.js5ClientTcp.requestGroup(this.id * -1082200023, arg0, (byte) 2, true, 282344710);
							this.aClass24_8.method563(local396, (long) arg0);
						}
					} else if (!this.aClass490_1.method30221(1392262948)) {
						local370 = this.aClass490_1.request(this.id * -1082200023, arg0, (byte) 2, true, this.index.anIntArray455[arg0], this.index.anIntArray458[arg0], 1621519758);
						if (local370 != null) {
							this.aClass24_8.method563(local370, (long) arg0);
						}
					}
				}
				return null;
			}
			local182[local182.length - 2] = (byte) (this.index.anIntArray458[arg0] >>> 8);
			local182[local182.length - 1] = (byte) this.index.anIntArray458[arg0];
			if (this.indexFileSystem != null) {
				this.aClass495_1.method30300(arg0, local182, this.indexFileSystem, -1938919263);
				if (this.aByteArray35[arg0] != 1) {
					this.anInt1278 += 195154953;
					this.aByteArray35[arg0] = 1;
				}
			}
			if (!local6.aBoolean663) {
				local6.method24395((byte) 98);
			}
			return local6;
		}
		try {
			if (local182 == null || local182.length <= 2) {
				throw new RuntimeException();
			}
			aCRC32_1.reset();
			aCRC32_1.update(local182, 0, local182.length - 2);
			local209 = (int) aCRC32_1.getValue();
			if (this.index.anIntArray455[arg0] != local209) {
				throw new RuntimeException();
			}
			if (this.index.aByteArrayArray16 != null && this.index.aByteArrayArray16[arg0] != null) {
				local238 = this.index.aByteArrayArray16[arg0];
				local247 = Class130_Sub1.compute(local182, 0, local182.length - 2, -106622466);
				for (local249 = 0; local249 < 64; local249++) {
					if (local247[local249] != local238[local249]) {
						throw new RuntimeException();
					}
				}
			}
			@Pc(285) int local285 = (local182[local182.length - 1] & 0xFF) + ((local182[local182.length - 2] & 0xFF) << 8);
			if ((this.index.anIntArray458[arg0] & 0xFFFF) != local285) {
				throw new RuntimeException();
			}
			if (this.aByteArray35[arg0] != 1) {
				if (this.aByteArray35[arg0] == 0) {
				}
				this.anInt1278 += 195154953;
				this.aByteArray35[arg0] = 1;
			}
			if (!local6.aBoolean663) {
				local6.method24395((byte) 53);
			}
			return local6;
		} catch (@Pc(329) Exception local329) {
			this.aByteArray35[arg0] = -1;
			local6.method24395((byte) 102);
			if (local6.aBoolean663) {
				if (this.aClass490_1 == null) {
					if (!this.js5ClientTcp.isRequestQueueFull((short) 8754)) {
						local396 = this.js5ClientTcp.requestGroup(this.id * -1082200023, arg0, (byte) 2, true, 2066809999);
						this.aClass24_8.method563(local396, (long) arg0);
					}
				} else if (!this.aClass490_1.method30221(1392262948)) {
					local370 = this.aClass490_1.request(this.id * -1082200023, arg0, (byte) 2, true, this.index.anIntArray455[arg0], this.index.anIntArray458[arg0], 1464602254);
					if (local370 != null) {
						this.aClass24_8.method563(local370, (long) arg0);
					}
				}
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!aih", name = "ah", descriptor = "()V")
	void method10933() {
		if (this.aClass8_16 != null) {
			if (this.getIndex(1458416170) == null) {
				return;
			}
			@Pc(12) boolean local12;
			@Pc(17) Class80 local17;
			@Pc(25) int local25;
			if (this.aBoolean230) {
				local12 = true;
				for (local17 = this.aClass8_16.method247(129206984); local17 != null; local17 = this.aClass8_16.method237(-1045119413)) {
					local25 = (int) (local17.aLong338 * 3209506792906532031L);
					if (this.aByteArray35[local25] == 0) {
						this.method10934(local25, 1, (byte) -45);
					}
					if (this.aByteArray35[local25] == 0) {
						local12 = false;
					} else {
						local17.method24395((byte) 42);
					}
				}
				while (this.anInt1275 * -282057065 < this.index.anIntArray462.length) {
					if (this.index.anIntArray462[this.anInt1275 * -282057065] == 0) {
						this.anInt1275 += -1571702489;
					} else {
						if (this.aClass495_1.anInt5031 * -672453825 >= 250) {
							local12 = false;
							break;
						}
						if (this.aByteArray35[this.anInt1275 * -282057065] == 0) {
							this.method10934(this.anInt1275 * -282057065, 1, (byte) -125);
						}
						if (this.aByteArray35[this.anInt1275 * -282057065] == 0) {
							local17 = new Class80();
							local17.aLong338 = (long) this.anInt1275 * -5003607921532847063L;
							this.aClass8_16.method232(local17, 527457342);
							local12 = false;
						}
						this.anInt1275 += -1571702489;
					}
				}
				if (local12) {
					this.aBoolean230 = false;
					this.anInt1275 = 0;
				}
			} else if (this.aBoolean228) {
				local12 = true;
				for (local17 = this.aClass8_16.method247(129206984); local17 != null; local17 = this.aClass8_16.method237(11429422)) {
					local25 = (int) (local17.aLong338 * 3209506792906532031L);
					if (this.aByteArray35[local25] != 1) {
						this.method10934(local25, 2, (byte) -37);
					}
					if (this.aByteArray35[local25] == 1) {
						local17.method24395((byte) 67);
					} else {
						local12 = false;
					}
				}
				while (this.anInt1275 * -282057065 < this.index.anIntArray462.length) {
					if (this.index.anIntArray462[this.anInt1275 * -282057065] == 0) {
						this.anInt1275 += -1571702489;
					} else {
						if (this.js5ClientTcp.method10764((byte) 107)) {
							local12 = false;
							break;
						}
						if (this.aByteArray35[this.anInt1275 * -282057065] != 1) {
							this.method10934(this.anInt1275 * -282057065, 2, (byte) -6);
						}
						if (this.aByteArray35[this.anInt1275 * -282057065] != 1) {
							local17 = new Class80();
							local17.aLong338 = (long) this.anInt1275 * -5003607921532847063L;
							this.aClass8_16.method232(local17, -99005182);
							local12 = false;
						}
						this.anInt1275 += -1571702489;
					}
				}
				if (local12) {
					this.aBoolean228 = false;
					this.anInt1275 = 0;
				}
			} else {
				this.aClass8_16 = null;
			}
		}
		if (!this.aBoolean231 || Class303.currentTimeMillis((byte) 66) < this.aLong43 * -3907920030764178305L) {
			return;
		}
		for (@Pc(312) Class80_Sub1_Sub15 local312 = (Class80_Sub1_Sub15) this.aClass24_8.method580((byte) -126); local312 != null; local312 = (Class80_Sub1_Sub15) this.aClass24_8.method566((byte) 7)) {
			if (!local312.incomplete) {
				if (local312.aBoolean662) {
					if (!local312.aBoolean663) {
						throw new RuntimeException();
					}
					local312.method24395((byte) 37);
				} else {
					local312.aBoolean662 = true;
				}
			}
		}
		this.aLong43 = (Class303.currentTimeMillis((byte) 110) + 1000L) * 3319804436531960703L;
	}

	@OriginalMember(owner = "client!aih", name = "h", descriptor = "(IIB)Lclient!asj;")
	Class80_Sub1_Sub15 method10934(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		@Pc(6) Class80_Sub1_Sub15 local6 = (Class80_Sub1_Sub15) this.aClass24_8.method560((long) arg0);
		if (local6 != null && arg1 == 0 && !local6.aBoolean663 && local6.incomplete) {
			local6.method24395((byte) 33);
			local6 = null;
		}
		if (local6 == null) {
			if (arg1 == 0) {
				if (this.indexFileSystem != null && this.aByteArray35[arg0] != -1) {
					local6 = this.aClass495_1.method30322(arg0, this.indexFileSystem, -293384215);
				} else if (this.aClass490_1 == null) {
					if (this.js5ClientTcp.isRequestQueueFull((short) 113)) {
						return null;
					}
					local6 = this.js5ClientTcp.requestGroup(this.id * -1082200023, arg0, (byte) 2, true, -900569542);
				} else {
					local6 = this.aClass490_1.request(this.id * -1082200023, arg0, (byte) 2, true, this.index.anIntArray455[arg0], this.index.anIntArray458[arg0], 1488254745);
					if (local6 == null) {
						return null;
					}
				}
			} else if (arg1 == 1) {
				if (this.indexFileSystem == null) {
					throw new RuntimeException();
				}
				local6 = this.aClass495_1.method30301(arg0, this.indexFileSystem, -67088390);
			} else if (arg1 == 2) {
				if (this.indexFileSystem == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray35[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass490_1 != null) {
					return null;
				}
				if (this.js5ClientTcp.method10764((byte) 80)) {
					return null;
				}
				local6 = this.js5ClientTcp.requestGroup(this.id * -1082200023, arg0, (byte) 2, false, -579338903);
			} else {
				throw new RuntimeException();
			}
			this.aClass24_8.method563(local6, (long) arg0);
		}
		if (local6.incomplete) {
			return null;
		}
		@Pc(182) byte[] local182 = local6.getData(-2133825886);
		@Pc(209) int local209;
		@Pc(238) byte[] local238;
		@Pc(247) byte[] local247;
		@Pc(249) int local249;
		@Pc(370) Class80_Sub1_Sub15_Sub1 local370;
		@Pc(396) Js5NetRequest local396;
		if (!(local6 instanceof Js5WorkerRequest)) {
			try {
				if (local182 == null || local182.length <= 2) {
					if (this.aClass490_1 != null) {
						local6.method24395((byte) 6);
						return null;
					}
					throw new RuntimeException();
				}
				aCRC32_1.reset();
				aCRC32_1.update(local182, 0, local182.length - 2);
				local209 = (int) aCRC32_1.getValue();
				if (this.index.anIntArray455[arg0] != local209) {
					throw new RuntimeException();
				}
				if (this.index.aByteArrayArray16 != null && this.index.aByteArrayArray16[arg0] != null) {
					local238 = this.index.aByteArrayArray16[arg0];
					local247 = Class130_Sub1.compute(local182, 0, local182.length - 2, -426014345);
					for (local249 = 0; local249 < 64; local249++) {
						if (local238[local249] != local247[local249]) {
							throw new RuntimeException();
						}
					}
				}
				if (this.aClass490_1 != null) {
					this.js5ClientTcp.errorCount = 0;
					this.js5ClientTcp.errorCode = 0;
				}
			} catch (@Pc(505) RuntimeException local505) {
				this.js5ClientTcp.rekey(this.id * -1082200023, arg0, 1840614634);
				local6.method24395((byte) 112);
				if (local6.aBoolean663) {
					if (this.aClass490_1 == null) {
						if (!this.js5ClientTcp.isRequestQueueFull((short) 10520)) {
							local396 = this.js5ClientTcp.requestGroup(this.id * -1082200023, arg0, (byte) 2, true, -484845173);
							this.aClass24_8.method563(local396, (long) arg0);
						}
					} else if (!this.aClass490_1.method30221(1392262948)) {
						local370 = this.aClass490_1.request(this.id * -1082200023, arg0, (byte) 2, true, this.index.anIntArray455[arg0], this.index.anIntArray458[arg0], -818833059);
						if (local370 != null) {
							this.aClass24_8.method563(local370, (long) arg0);
						}
					}
				}
				return null;
			}
			local182[local182.length - 2] = (byte) (this.index.anIntArray458[arg0] >>> 8);
			local182[local182.length - 1] = (byte) this.index.anIntArray458[arg0];
			if (this.indexFileSystem != null) {
				this.aClass495_1.method30300(arg0, local182, this.indexFileSystem, -1983932012);
				if (this.aByteArray35[arg0] != 1) {
					this.anInt1278 += 195154953;
					this.aByteArray35[arg0] = 1;
				}
			}
			if (!local6.aBoolean663) {
				local6.method24395((byte) 26);
			}
			return local6;
		}
		try {
			if (local182 == null || local182.length <= 2) {
				throw new RuntimeException();
			}
			aCRC32_1.reset();
			aCRC32_1.update(local182, 0, local182.length - 2);
			local209 = (int) aCRC32_1.getValue();
			if (this.index.anIntArray455[arg0] != local209) {
				throw new RuntimeException();
			}
			if (this.index.aByteArrayArray16 != null && this.index.aByteArrayArray16[arg0] != null) {
				local238 = this.index.aByteArrayArray16[arg0];
				local247 = Class130_Sub1.compute(local182, 0, local182.length - 2, 121786017);
				for (local249 = 0; local249 < 64; local249++) {
					if (local247[local249] != local238[local249]) {
						throw new RuntimeException();
					}
				}
			}
			@Pc(285) int local285 = (local182[local182.length - 1] & 0xFF) + ((local182[local182.length - 2] & 0xFF) << 8);
			if ((this.index.anIntArray458[arg0] & 0xFFFF) != local285) {
				throw new RuntimeException();
			}
			if (this.aByteArray35[arg0] != 1) {
				if (this.aByteArray35[arg0] == 0) {
				}
				this.anInt1278 += 195154953;
				this.aByteArray35[arg0] = 1;
			}
			if (!local6.aBoolean663) {
				local6.method24395((byte) 38);
			}
			return local6;
		} catch (@Pc(329) Exception local329) {
			this.aByteArray35[arg0] = -1;
			local6.method24395((byte) 60);
			if (local6.aBoolean663) {
				if (this.aClass490_1 == null) {
					if (!this.js5ClientTcp.isRequestQueueFull((short) -301)) {
						local396 = this.js5ClientTcp.requestGroup(this.id * -1082200023, arg0, (byte) 2, true, 604032159);
						this.aClass24_8.method563(local396, (long) arg0);
					}
				} else if (!this.aClass490_1.method30221(1392262948)) {
					local370 = this.aClass490_1.request(this.id * -1082200023, arg0, (byte) 2, true, this.index.anIntArray455[arg0], this.index.anIntArray458[arg0], -256161571);
					if (local370 != null) {
						this.aClass24_8.method563(local370, (long) arg0);
					}
				}
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!aih", name = "am", descriptor = "()I")
	public int method10935() {
		return this.index == null ? 0 : this.index.anInt5024 * 2028811351;
	}

	@OriginalMember(owner = "client!aih", name = "ak", descriptor = "()I")
	public int method10936() {
		return this.anInt1278 * -261096903;
	}

	@OriginalMember(owner = "client!aih", name = "at", descriptor = "()I")
	public int method10937() {
		if (this.index == null) {
			return 0;
		} else if (this.aBoolean230) {
			@Pc(18) Class80 local18 = this.aClass8_16.method247(129206984);
			return local18 == null ? 0 : (int) (local18.aLong338 * 3209506792906532031L);
		} else {
			return this.index.anInt5024 * 2028811351;
		}
	}

	@OriginalMember(owner = "client!aih", name = "s", descriptor = "(I)V")
	@Override
	void method10901(@OriginalArg(0) int arg0) {
		if (this.indexFileSystem == null) {
			return;
		}
		@Pc(9) Class80 local9;
		for (local9 = this.aClass8_17.method247(129206984); local9 != null; local9 = this.aClass8_17.method237(415332428)) {
			if ((long) arg0 == local9.aLong338 * 3209506792906532031L) {
				return;
			}
		}
		local9 = new Class80();
		local9.aLong338 = (long) arg0 * 6850079459805481791L;
		this.aClass8_17.method232(local9, 89016235);
	}

	@OriginalMember(owner = "client!aih", name = "aw", descriptor = "()Z")
	boolean method10938() {
		return this.aClass490_1 != null;
	}

	@OriginalMember(owner = "client!aih", name = "aa", descriptor = "()V")
	public void method10939() {
		if (this.aClass490_1 != null || this.indexFileSystem == null) {
			return;
		}
		this.aBoolean228 = true;
		this.aBoolean229 = true;
		if (this.aClass8_16 == null) {
			this.aClass8_16 = new Class8();
		}
	}

	@OriginalMember(owner = "client!aih", name = "e", descriptor = "(IB)V")
	@Override
	void method10902(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (this.indexFileSystem == null) {
			return;
		}
		@Pc(9) Class80 local9;
		for (local9 = this.aClass8_17.method247(129206984); local9 != null; local9 = this.aClass8_17.method237(-1527604790)) {
			if ((long) arg0 == local9.aLong338 * 3209506792906532031L) {
				return;
			}
		}
		local9 = new Class80();
		local9.aLong338 = (long) arg0 * 6850079459805481791L;
		this.aClass8_17.method232(local9, 1168177755);
	}

	@OriginalMember(owner = "client!aih", name = "y", descriptor = "(I)I")
	public int method10940(@OriginalArg(0) int arg0) {
		if (this.index == null) {
			return 0;
		} else if (this.aBoolean230) {
			@Pc(18) Class80 local18 = this.aClass8_16.method247(129206984);
			return local18 == null ? 0 : (int) (local18.aLong338 * 3209506792906532031L);
		} else {
			return this.index.anInt5024 * 2028811351;
		}
	}

	@OriginalMember(owner = "client!aih", name = "ar", descriptor = "(Z)V")
	void method10941(@OriginalArg(0) boolean arg0) {
		this.aClass490_1.method30225(arg0, -308599689);
	}

	@OriginalMember(owner = "client!aih", name = "au", descriptor = "(Z)V")
	void method10942(@OriginalArg(0) boolean arg0) {
		this.aClass490_1.method30225(arg0, -308599689);
	}

	@OriginalMember(owner = "client!aih", name = "av", descriptor = "()V")
	public void method10943() {
		if (this.aClass490_1 != null || this.indexFileSystem == null) {
			return;
		}
		this.aBoolean228 = true;
		this.aBoolean229 = true;
		if (this.aClass8_16 == null) {
			this.aClass8_16 = new Class8();
		}
	}

	@OriginalMember(owner = "client!aih", name = "as", descriptor = "()Z")
	boolean method10944() {
		return this.aClass490_1 != null;
	}

	@OriginalMember(owner = "client!aih", name = "l", descriptor = "()Lclient!ps;")
	@Override
	Js5ArchiveIndex method10903() {
		if (this.index != null) {
			return this.index;
		}
		if (this.groupContainer == null) {
			if (this.js5ClientTcp.isRequestQueueFull((short) 1604)) {
				return null;
			}
			this.groupContainer = this.js5ClientTcp.requestGroup(255, this.id * -1082200023, (byte) 0, true, 1974190534);
		}
		if (this.groupContainer.incomplete) {
			return null;
		}
		@Pc(41) byte[] local41 = this.groupContainer.getData(-2133825886);
		if (this.groupContainer instanceof Js5WorkerRequest) {
			try {
				if (local41 == null) {
					throw new RuntimeException();
				}
				this.index = new Js5ArchiveIndex(local41, this.anInt1274 * 908053705, this.aByteArray34);
				if (this.index.version * -1723675051 != this.version * 1134930589) {
					throw new RuntimeException();
				}
			} catch (@Pc(80) RuntimeException local80) {
				this.index = null;
				if (this.js5ClientTcp.isRequestQueueFull((short) 5004)) {
					this.groupContainer = null;
				} else {
					this.groupContainer = this.js5ClientTcp.requestGroup(255, this.id * -1082200023, (byte) 0, true, 1997725410);
				}
				return null;
			}
		} else {
			try {
				if (local41 == null) {
					throw new RuntimeException();
				}
				this.index = new Js5ArchiveIndex(local41, this.anInt1274 * 908053705, this.aByteArray34);
			} catch (@Pc(127) RuntimeException local127) {
				this.js5ClientTcp.rekey(255, this.id * -1082200023, 1703526768);
				this.index = null;
				if (this.js5ClientTcp.isRequestQueueFull((short) -272)) {
					this.groupContainer = null;
				} else {
					this.groupContainer = this.js5ClientTcp.requestGroup(255, this.id * -1082200023, (byte) 0, true, 2028375943);
				}
				return null;
			}
			if (this.fileSystem != null) {
				this.aClass495_1.method30300(this.id * -1082200023, local41, this.fileSystem, -2003636523);
			}
		}
		this.groupContainer = null;
		if (this.indexFileSystem != null) {
			this.aByteArray35 = new byte[this.index.groupArraySize * 183068259];
			this.anInt1278 = 0;
		}
		return this.index;
	}
}
