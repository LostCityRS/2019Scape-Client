package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.math.BigInteger;

@OriginalClass("client!pr")
public final class Class491 {

	@OriginalMember(owner = "client!pr", name = "x", descriptor = "[Ljava/lang/String;")
	static String[] aStringArray30;

	@OriginalMember(owner = "client!pr", name = "o", descriptor = "Lclient!qu;")
	Js5MasterIndex aJs5MasterIndex_1;

	@OriginalMember(owner = "client!pr", name = "m", descriptor = "Lclient!qu;")
	Js5MasterIndex masterIndex;

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "[Lclient!aih;")
	Class141_Sub1[] resourceProviders;

	@OriginalMember(owner = "client!pr", name = "j", descriptor = "Z")
	boolean aBoolean882 = false;

	@OriginalMember(owner = "client!pr", name = "t", descriptor = "Lclient!pz;")
	Js5NetQueue aJs5NetQueue_9;

	@OriginalMember(owner = "client!pr", name = "f", descriptor = "Lclient!pq;")
	Class490 aClass490_5;

	@OriginalMember(owner = "client!pr", name = "e", descriptor = "Lclient!pv;")
	Class495 aClass495_2;

	@OriginalMember(owner = "client!pr", name = "u", descriptor = "Ljava/math/BigInteger;")
	BigInteger aBigInteger7;

	@OriginalMember(owner = "client!pr", name = "l", descriptor = "Ljava/math/BigInteger;")
	BigInteger aBigInteger8;

	@OriginalMember(owner = "client!pr", name = "g", descriptor = "Lclient!aun;")
	Js5NetRequest masterIndexRequest;

	@OriginalMember(owner = "client!pr", name = "i", descriptor = "Lclient!atl;")
	Class80_Sub1_Sub15_Sub1 aClass80_Sub1_Sub15_Sub1_2;

	@OriginalMember(owner = "client!pr", name = "kz", descriptor = "(Lclient!hx;I[B[BLclient!yp;I)V")
	static void method30253(@OriginalArg(0) Class327 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) Class690 arg4, @OriginalArg(5) int arg5) {
		if (arg0.aByteArrayArray15 == null) {
			if (arg2 == null) {
				return;
			}
			arg0.aByteArrayArray15 = new byte[11][];
			arg0.aByteArrayArray14 = new byte[11][];
			arg0.anIntArray410 = new int[11];
			arg0.anIntArray401 = new int[11];
			arg0.anIntArray403 = new int[11];
		}
		arg0.aByteArrayArray15[arg1] = arg2;
		if (arg2 == null) {
			arg0.aBoolean813 = false;
			for (@Pc(43) int local43 = 0; local43 < arg0.aByteArrayArray15.length; local43++) {
				if (arg0.aByteArrayArray15[local43] != null || arg0.anIntArray403[local43] > 0) {
					arg0.aBoolean813 = true;
					break;
				}
			}
		} else {
			arg0.aBoolean813 = true;
		}
		arg0.aByteArrayArray14[arg1] = arg3;
	}

	@OriginalMember(owner = "client!pr", name = "rq", descriptor = "(Lclient!yp;I)V")
	static void method30254(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local11.anInt4111 * 458112843;
	}

	@OriginalMember(owner = "client!pr", name = "ys", descriptor = "(Lclient!yp;I)V")
	static void method30255(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
	}

	@OriginalMember(owner = "client!pr", name = "bfv", descriptor = "(Lclient!yp;I)V")
	static void method30256(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
	}

	@OriginalMember(owner = "client!pr", name = "ng", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;I)V")
	static void method30257(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) int arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray46[(arg2.anInt5776 -= -825189621) * -2070619997];
		if (Class619.method32302(local13, arg2, -1749597957) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		Class431.method29089(local13, arg2, 923736358);
	}

	@OriginalMember(owner = "client!pr", name = "al", descriptor = "(I)Lclient!arz;")
	public static Class80_Sub1_Sub11 method30258(@OriginalArg(0) int arg0) {
		return Class630.aClass80_Sub1_Sub11_4;
	}

	@OriginalMember(owner = "client!pr", name = "w", descriptor = "(Lclient!yp;I)V")
	static void method30259(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = LoginProt.method29130((byte) 1);
	}

	@OriginalMember(owner = "client!pr", name = "axf", descriptor = "(Lclient!yp;B)V")
	static void method30260(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		Class665.method33454(6, local13, local23, "", 2070121721);
	}

	@OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(Lclient!pz;Lclient!pq;Lclient!pv;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
	public Class491(@OriginalArg(0) Js5NetQueue arg0, @OriginalArg(1) Class490 arg1, @OriginalArg(2) Class495 arg2, @OriginalArg(3) BigInteger arg3, @OriginalArg(4) BigInteger arg4) {
		this.aJs5NetQueue_9 = arg0;
		this.aClass490_5 = arg1;
		this.aClass495_2 = arg2;
		this.aBigInteger7 = arg3;
		this.aBigInteger8 = arg4;
		if (!this.aJs5NetQueue_9.isRequestQueueFull((short) 23951)) {
			this.masterIndexRequest = this.aJs5NetQueue_9.requestGroup(255, 255, (byte) 0, true, 1922892898);
		}
		if (this.aClass490_5 != null) {
			this.aClass80_Sub1_Sub15_Sub1_2 = this.aClass490_5.requestMasterIndex((byte) 4);
		}
	}

	@OriginalMember(owner = "client!pr", name = "o", descriptor = "(ILclient!uf;Lclient!uf;ZZ)Lclient!aih;")
	Class141_Sub1 method30243(@OriginalArg(0) int arg0, @OriginalArg(1) Class592 arg1, @OriginalArg(2) Class592 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		if (this.masterIndex == null) {
			throw new RuntimeException();
		} else if (arg0 < 0 || arg0 >= this.resourceProviders.length) {
			throw new RuntimeException();
		} else if (this.resourceProviders[arg0] == null) {
			@Pc(35) Js5MasterIndexArchiveData local35 = this.masterIndex.archiveData[arg0];
			@Pc(67) Class141_Sub1 local67 = new Class141_Sub1(arg0, arg1, arg2, this.aJs5NetQueue_9, arg4 ? this.aClass490_5 : null, this.aClass495_2, local35.crc * -537553445, local35.whirlpool, local35.version * 12510669, arg3, local35.groupCount * -759106401);
			this.resourceProviders[arg0] = local67;
			if (this.aJs5MasterIndex_1 != null && arg4) {
				@Pc(83) Js5MasterIndexArchiveData local83 = this.aJs5MasterIndex_1.archiveData[arg0];
				this.resourceProviders[arg0].method10919(this.resourceProviders[arg0].method10909(local83.crc * -537553445, local83.whirlpool, local83.version * 12510669, local83.groupCount * -759106401, (byte) 8), -221271920);
			}
			return local67;
		} else {
			return this.resourceProviders[arg0];
		}
	}

	@OriginalMember(owner = "client!pr", name = "t", descriptor = "(I)Z")
	public boolean loadMasterIndex(@OriginalArg(0) int arg0) {
		if (this.masterIndex != null) {
			return true;
		}
		if (this.masterIndexRequest == null) {
			if (this.aJs5NetQueue_9.isRequestQueueFull((short) -16469)) {
				return false;
			}
			this.masterIndexRequest = this.aJs5NetQueue_9.requestGroup(255, 255, (byte) 0, true, 1916919868);
		}
		if (this.masterIndexRequest.incomplete) {
			return false;
		}
		@Pc(39) Packet local39 = new Packet(this.masterIndexRequest.getData(-2133825886));
		this.masterIndex = new Js5MasterIndex(local39, this.aBigInteger7, this.aBigInteger8);
		if (this.resourceProviders == null) {
			System.out.println("Master index has " + this.masterIndex.archiveData.length + " archives");
			this.resourceProviders = new Class141_Sub1[this.masterIndex.archiveData.length];
		} else {
			for (@Pc(62) int i = 0; i < this.resourceProviders.length; i++) {
				if (this.resourceProviders[i] != null) {
					@Pc(80) Js5MasterIndexArchiveData archive = this.masterIndex.archiveData[i];
					this.resourceProviders[i].method10908(archive.crc * -537553445, archive.whirlpool, archive.version * 12510669, archive.groupCount * -759106401, 1916946974);
					if (this.resourceProviders[i].method10920((byte) -111)) {
						this.resourceProviders[i].method10919(false, -2121091106);
					}
				}
			}
		}
		this.aBoolean882 = false;
		return true;
	}

	@OriginalMember(owner = "client!pr", name = "f", descriptor = "(ILclient!uf;Lclient!uf;ZI)Lclient!aih;")
	public Class141_Sub1 method30245(@OriginalArg(0) int arg0, @OriginalArg(1) Class592 arg1, @OriginalArg(2) Class592 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method30246(arg0, arg1, arg2, true, arg3, (byte) -35);
	}

	@OriginalMember(owner = "client!pr", name = "e", descriptor = "(ILclient!uf;Lclient!uf;ZZB)Lclient!aih;")
	Class141_Sub1 method30246(@OriginalArg(0) int arg0, @OriginalArg(1) Class592 arg1, @OriginalArg(2) Class592 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) byte arg5) {
		if (this.masterIndex == null) {
			throw new RuntimeException();
		} else if (arg0 < 0 || arg0 >= this.resourceProviders.length) {
			throw new RuntimeException();
		} else if (this.resourceProviders[arg0] == null) {
			@Pc(35) Js5MasterIndexArchiveData local35 = this.masterIndex.archiveData[arg0];
			@Pc(67) Class141_Sub1 local67 = new Class141_Sub1(arg0, arg1, arg2, this.aJs5NetQueue_9, arg4 ? this.aClass490_5 : null, this.aClass495_2, local35.crc * -537553445, local35.whirlpool, local35.version * 12510669, arg3, local35.groupCount * -759106401);
			this.resourceProviders[arg0] = local67;
			if (this.aJs5MasterIndex_1 != null && arg4) {
				@Pc(83) Js5MasterIndexArchiveData local83 = this.aJs5MasterIndex_1.archiveData[arg0];
				this.resourceProviders[arg0].method10919(this.resourceProviders[arg0].method10909(local83.crc * -537553445, local83.whirlpool, local83.version * 12510669, local83.groupCount * -759106401, (byte) 8), -391562653);
			}
			return local67;
		} else {
			return this.resourceProviders[arg0];
		}
	}

	@OriginalMember(owner = "client!pr", name = "l", descriptor = "()Z")
	public boolean method30247() {
		if (this.masterIndex != null) {
			return true;
		}
		if (this.masterIndexRequest == null) {
			if (this.aJs5NetQueue_9.isRequestQueueFull((short) 15245)) {
				return false;
			}
			this.masterIndexRequest = this.aJs5NetQueue_9.requestGroup(255, 255, (byte) 0, true, 1507877235);
		}
		if (this.masterIndexRequest.incomplete) {
			return false;
		}
		@Pc(39) Packet local39 = new Packet(this.masterIndexRequest.getData(-2133825886));
		this.masterIndex = new Js5MasterIndex(local39, this.aBigInteger7, this.aBigInteger8);
		if (this.resourceProviders == null) {
			this.resourceProviders = new Class141_Sub1[this.masterIndex.archiveData.length];
		} else {
			for (@Pc(62) int local62 = 0; local62 < this.resourceProviders.length; local62++) {
				if (this.resourceProviders[local62] != null) {
					@Pc(80) Js5MasterIndexArchiveData local80 = this.masterIndex.archiveData[local62];
					this.resourceProviders[local62].method10908(local80.crc * -537553445, local80.whirlpool, local80.version * 12510669, local80.groupCount * -759106401, 1552140105);
					if (this.resourceProviders[local62].method10920((byte) 36)) {
						this.resourceProviders[local62].method10919(false, 103561520);
					}
				}
			}
		}
		this.aBoolean882 = false;
		return true;
	}

	@OriginalMember(owner = "client!pr", name = "u", descriptor = "(B)V")
	public void cycle(@OriginalArg(0) byte arg0) {
		if (this.resourceProviders == null) {
			return;
		}
		@Pc(5) int local5;
		for (local5 = 0; local5 < this.resourceProviders.length; local5++) {
			if (this.resourceProviders[local5] != null) {
				this.resourceProviders[local5].updateLoad(-1258714269);
			}
		}
		for (local5 = 0; local5 < this.resourceProviders.length; local5++) {
			if (this.resourceProviders[local5] != null) {
				this.resourceProviders[local5].updatePreload((byte) 0);
			}
		}
		if (this.masterIndex == null) {
			this.loadMasterIndex(-1752282390);
		} else if (this.aClass490_5 != null && !this.aBoolean882) {
			if (this.aClass80_Sub1_Sub15_Sub1_2 == null) {
				this.aClass80_Sub1_Sub15_Sub1_2 = this.aClass490_5.requestMasterIndex((byte) 4);
			} else if (!this.aClass80_Sub1_Sub15_Sub1_2.incomplete) {
				@Pc(77) byte[] local77 = this.aClass80_Sub1_Sub15_Sub1_2.getData(-2133825886);
				try {
					this.aJs5MasterIndex_1 = new Js5MasterIndex(new Packet(local77), this.aBigInteger7, this.aBigInteger8);
					for (@Pc(92) int local92 = 0; local92 < this.resourceProviders.length; local92++) {
						if (this.resourceProviders[local92] != null && this.resourceProviders[local92].method10920((byte) 9)) {
							@Pc(116) Js5MasterIndexArchiveData local116 = this.aJs5MasterIndex_1.archiveData[local92];
							this.resourceProviders[local92].method10919(this.resourceProviders[local92].method10909(local116.crc * -537553445, local116.whirlpool, local116.version * 12510669, local116.groupCount * -759106401, (byte) 8), -1737671525);
						}
					}
				} catch (@Pc(146) Exception local146) {
					for (@Pc(148) int local148 = 0; local148 < this.resourceProviders.length; local148++) {
						if (this.resourceProviders[local148] != null && this.resourceProviders[local148].method10920((byte) -22)) {
							this.resourceProviders[local148].method10919(false, 1951560295);
						}
					}
				}
				this.aClass80_Sub1_Sub15_Sub1_2 = null;
				this.aBoolean882 = true;
			}
		}
	}

	@OriginalMember(owner = "client!pr", name = "g", descriptor = "(ILclient!uf;Lclient!uf;Z)Lclient!aih;")
	public Class141_Sub1 method30249(@OriginalArg(0) int arg0, @OriginalArg(1) Class592 arg1, @OriginalArg(2) Class592 arg2, @OriginalArg(3) boolean arg3) {
		return this.method30246(arg0, arg1, arg2, true, arg3, (byte) -42);
	}

	@OriginalMember(owner = "client!pr", name = "i", descriptor = "(ILclient!uf;Lclient!uf;Z)Lclient!aih;")
	public Class141_Sub1 method30250(@OriginalArg(0) int arg0, @OriginalArg(1) Class592 arg1, @OriginalArg(2) Class592 arg2, @OriginalArg(3) boolean arg3) {
		return this.method30246(arg0, arg1, arg2, true, arg3, (byte) 95);
	}

	@OriginalMember(owner = "client!pr", name = "m", descriptor = "(ILclient!uf;Lclient!uf;Z)Lclient!aih;")
	public Class141_Sub1 method30251(@OriginalArg(0) int arg0, @OriginalArg(1) Class592 arg1, @OriginalArg(2) Class592 arg2, @OriginalArg(3) boolean arg3) {
		return this.method30246(arg0, arg1, arg2, true, arg3, (byte) -79);
	}

	@OriginalMember(owner = "client!pr", name = "j", descriptor = "()V")
	public void method30252() {
		if (this.resourceProviders == null) {
			return;
		}
		@Pc(5) int local5;
		for (local5 = 0; local5 < this.resourceProviders.length; local5++) {
			if (this.resourceProviders[local5] != null) {
				this.resourceProviders[local5].updateLoad(-1234145457);
			}
		}
		for (local5 = 0; local5 < this.resourceProviders.length; local5++) {
			if (this.resourceProviders[local5] != null) {
				this.resourceProviders[local5].updatePreload((byte) 0);
			}
		}
		if (this.masterIndex == null) {
			this.loadMasterIndex(1240865512);
		} else if (this.aClass490_5 != null && !this.aBoolean882) {
			if (this.aClass80_Sub1_Sub15_Sub1_2 == null) {
				this.aClass80_Sub1_Sub15_Sub1_2 = this.aClass490_5.requestMasterIndex((byte) 4);
			} else if (!this.aClass80_Sub1_Sub15_Sub1_2.incomplete) {
				@Pc(77) byte[] local77 = this.aClass80_Sub1_Sub15_Sub1_2.getData(-2133825886);
				try {
					this.aJs5MasterIndex_1 = new Js5MasterIndex(new Packet(local77), this.aBigInteger7, this.aBigInteger8);
					for (@Pc(92) int local92 = 0; local92 < this.resourceProviders.length; local92++) {
						if (this.resourceProviders[local92] != null && this.resourceProviders[local92].method10920((byte) -3)) {
							@Pc(116) Js5MasterIndexArchiveData local116 = this.aJs5MasterIndex_1.archiveData[local92];
							this.resourceProviders[local92].method10919(this.resourceProviders[local92].method10909(local116.crc * -537553445, local116.whirlpool, local116.version * 12510669, local116.groupCount * -759106401, (byte) 8), 413350632);
						}
					}
				} catch (@Pc(146) Exception local146) {
					for (@Pc(148) int local148 = 0; local148 < this.resourceProviders.length; local148++) {
						if (this.resourceProviders[local148] != null && this.resourceProviders[local148].method10920((byte) 16)) {
							this.resourceProviders[local148].method10919(false, -300897676);
						}
					}
				}
				this.aClass80_Sub1_Sub15_Sub1_2 = null;
				this.aBoolean882 = true;
			}
		}
	}
}
