package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!arr")
public final class Class93_Sub1_Sub10 extends Class93_Sub1 {

	@OriginalMember(owner = "client!arr", name = "l", descriptor = "Lclient!py;")
	static Class497 aClass497_94;

	@OriginalMember(owner = "client!arr", name = "u", descriptor = "Lclient!py;")
	static Class497 aClass497_95;

	@OriginalMember(owner = "client!arr", name = "p", descriptor = "[[B")
	byte[][] aByteArrayArray13;

	@OriginalMember(owner = "client!arr", name = "d", descriptor = "[Lclient!dx;")
	Class236[] aClass236Array1;

	@OriginalMember(owner = "client!arr", name = "z", descriptor = "I")
	int anInt3016;

	@OriginalMember(owner = "client!arr", name = "w", descriptor = "(Lclient!py;Lclient!py;I)V")
	public static void method21792(@OriginalArg(0) Class497 arg0, @OriginalArg(1) Class497 arg1, @OriginalArg(2) int arg2) {
		aClass497_94 = arg0;
		aClass497_95 = arg1;
	}

	@OriginalMember(owner = "client!arr", name = "l", descriptor = "(Lclient!py;Lclient!py;I)V")
	public static void method21793(@OriginalArg(0) Class497 arg0, @OriginalArg(1) Class497 arg1, @OriginalArg(2) int arg2) {
		aClass497_94 = arg0;
		aClass497_95 = arg1;
	}

	@OriginalMember(owner = "client!arr", name = "<init>", descriptor = "(I)V")
	public Class93_Sub1_Sub10(@OriginalArg(0) int arg0) {
		this.anInt3016 = arg0 * -1219731127;
	}

	@OriginalMember(owner = "client!arr", name = "f", descriptor = "(II)Z")
	public boolean method21787(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aClass236Array1[arg0].aBoolean664;
	}

	@OriginalMember(owner = "client!arr", name = "n", descriptor = "(I)Z")
	public boolean method21788(@OriginalArg(0) int arg0) {
		if (this.aClass236Array1 != null) {
			return true;
		}
		if (this.aByteArrayArray13 == null) {
			@Pc(11) Class497 local11 = aClass497_94;
			synchronized (aClass497_94) {
				if (!aClass497_94.method30273(this.anInt3016 * 2053791993, 1017926793)) {
					return false;
				}
				@Pc(32) int[] local32 = aClass497_94.method30241(this.anInt3016 * 2053791993, (byte) 6);
				this.aByteArrayArray13 = new byte[local32.length][];
				for (@Pc(39) int local39 = 0; local39 < local32.length; local39++) {
					this.aByteArrayArray13[local39] = aClass497_94.method30225(this.anInt3016 * 2053791993, local32[local39], (byte) 0);
				}
			}
		}
		@Pc(69) boolean local69 = true;
		@Pc(93) int local93;
		for (@Pc(71) int local71 = 0; local71 < this.aByteArrayArray13.length; local71++) {
			@Pc(81) byte[] local81 = this.aByteArrayArray13[local71];
			@Pc(86) Class93_Sub41 local86 = new Class93_Sub41(local81);
			local86.anInt3070 = -1445626955;
			local93 = local86.method22427(-1434290800);
			@Pc(96) Class497 local96 = aClass497_95;
			synchronized (aClass497_95) {
				local69 &= aClass497_95.method30235(local93, -512225963);
			}
		}
		if (!local69) {
			return false;
		}
		@Pc(122) Class22 local122 = new Class22();
		@Pc(125) Class497 local125 = aClass497_94;
		@Pc(146) int[] local146;
		synchronized (aClass497_94) {
			local93 = aClass497_94.method30243(this.anInt3016 * 2053791993, 1723838491);
			this.aClass236Array1 = new Class236[local93];
			local146 = aClass497_94.method30241(this.anInt3016 * 2053791993, (byte) 25);
		}
		for (@Pc(156) int local156 = 0; local156 < local146.length; local156++) {
			@Pc(165) byte[] local165 = this.aByteArrayArray13[local156];
			@Pc(170) Class93_Sub41 local170 = new Class93_Sub41(local165);
			local170.anInt3070 = -1445626955;
			@Pc(177) int local177 = local170.method22427(-1434290800);
			@Pc(179) Class93_Sub25 local179 = null;
			for (@Pc(184) Class93_Sub25 local184 = (Class93_Sub25) local122.method445((byte) 111); local184 != null; local184 = (Class93_Sub25) local122.method415(354409596)) {
				if (local184.anInt1589 * -1647955937 == local177) {
					local179 = local184;
					break;
				}
			}
			if (local179 == null) {
				@Pc(208) Class497 local208 = aClass497_95;
				synchronized (aClass497_95) {
					local179 = new Class93_Sub25(local177, aClass497_95.method30240(local177, (byte) 108));
				}
				local122.method407(local179, -2047652372);
			}
			this.aClass236Array1[local146[local156]] = new Class236(local165, local179);
		}
		this.aByteArrayArray13 = null;
		return true;
	}

	@OriginalMember(owner = "client!arr", name = "m", descriptor = "(II)Z")
	public boolean method21789(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aClass236Array1[arg0].aBoolean662;
	}

	@OriginalMember(owner = "client!arr", name = "k", descriptor = "(II)Z")
	public boolean method21790(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aClass236Array1[arg0].aBoolean663;
	}

	@OriginalMember(owner = "client!arr", name = "r", descriptor = "(I)Z")
	public boolean method21791(@OriginalArg(0) int arg0) {
		return this.aClass236Array1[arg0].aBoolean664;
	}

	@OriginalMember(owner = "client!arr", name = "u", descriptor = "()Z")
	public boolean method21794() {
		if (this.aClass236Array1 != null) {
			return true;
		}
		if (this.aByteArrayArray13 == null) {
			@Pc(11) Class497 local11 = aClass497_94;
			synchronized (aClass497_94) {
				if (!aClass497_94.method30273(this.anInt3016 * 2053791993, -849220141)) {
					return false;
				}
				@Pc(32) int[] local32 = aClass497_94.method30241(this.anInt3016 * 2053791993, (byte) 118);
				this.aByteArrayArray13 = new byte[local32.length][];
				for (@Pc(39) int local39 = 0; local39 < local32.length; local39++) {
					this.aByteArrayArray13[local39] = aClass497_94.method30225(this.anInt3016 * 2053791993, local32[local39], (byte) 0);
				}
			}
		}
		@Pc(69) boolean local69 = true;
		@Pc(93) int local93;
		for (@Pc(71) int local71 = 0; local71 < this.aByteArrayArray13.length; local71++) {
			@Pc(81) byte[] local81 = this.aByteArrayArray13[local71];
			@Pc(86) Class93_Sub41 local86 = new Class93_Sub41(local81);
			local86.anInt3070 = -1445626955;
			local93 = local86.method22427(-1434290800);
			@Pc(96) Class497 local96 = aClass497_95;
			synchronized (aClass497_95) {
				local69 &= aClass497_95.method30235(local93, -512225963);
			}
		}
		if (!local69) {
			return false;
		}
		@Pc(122) Class22 local122 = new Class22();
		@Pc(125) Class497 local125 = aClass497_94;
		@Pc(146) int[] local146;
		synchronized (aClass497_94) {
			local93 = aClass497_94.method30243(this.anInt3016 * 2053791993, -54099617);
			this.aClass236Array1 = new Class236[local93];
			local146 = aClass497_94.method30241(this.anInt3016 * 2053791993, (byte) 64);
		}
		for (@Pc(156) int local156 = 0; local156 < local146.length; local156++) {
			@Pc(165) byte[] local165 = this.aByteArrayArray13[local156];
			@Pc(170) Class93_Sub41 local170 = new Class93_Sub41(local165);
			local170.anInt3070 = -1445626955;
			@Pc(177) int local177 = local170.method22427(-1434290800);
			@Pc(179) Class93_Sub25 local179 = null;
			for (@Pc(184) Class93_Sub25 local184 = (Class93_Sub25) local122.method445((byte) 25); local184 != null; local184 = (Class93_Sub25) local122.method415(1830552074)) {
				if (local184.anInt1589 * -1647955937 == local177) {
					local179 = local184;
					break;
				}
			}
			if (local179 == null) {
				@Pc(208) Class497 local208 = aClass497_95;
				synchronized (aClass497_95) {
					local179 = new Class93_Sub25(local177, aClass497_95.method30240(local177, (byte) 59));
				}
				local122.method407(local179, -403951963);
			}
			this.aClass236Array1[local146[local156]] = new Class236(local165, local179);
		}
		this.aByteArrayArray13 = null;
		return true;
	}

	@OriginalMember(owner = "client!arr", name = "z", descriptor = "(I)Z")
	public boolean method21795(@OriginalArg(0) int arg0) {
		return this.aClass236Array1[arg0].aBoolean662;
	}

	@OriginalMember(owner = "client!arr", name = "v", descriptor = "(I)Z")
	public boolean method21796(@OriginalArg(0) int arg0) {
		return this.aClass236Array1[arg0].aBoolean664;
	}

	@OriginalMember(owner = "client!arr", name = "d", descriptor = "(I)Z")
	public boolean method21797(@OriginalArg(0) int arg0) {
		return this.aClass236Array1[arg0].aBoolean663;
	}

	@OriginalMember(owner = "client!arr", name = "c", descriptor = "(I)Z")
	public boolean method21798(@OriginalArg(0) int arg0) {
		return this.aClass236Array1[arg0].aBoolean664;
	}

	@OriginalMember(owner = "client!arr", name = "p", descriptor = "(I)Z")
	public boolean method21799(@OriginalArg(0) int arg0) {
		return this.aClass236Array1[arg0].aBoolean662;
	}
}
