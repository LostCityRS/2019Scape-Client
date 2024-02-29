package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qr")
public final class Class514 {

	@OriginalMember(owner = "client!qr", name = "k", descriptor = "I")
	static final int anInt5371 = 0;

	@OriginalMember(owner = "client!qr", name = "f", descriptor = "I")
	static final int anInt5372 = 32768;

	@OriginalMember(owner = "client!qr", name = "fh", descriptor = "Lclient!py;")
	public static Class497 aClass497_128;

	@OriginalMember(owner = "client!qr", name = "m", descriptor = "Lclient!eb;")
	final Class240 aClass240_89 = new Class240(64);

	@OriginalMember(owner = "client!qr", name = "e", descriptor = "Lclient!py;")
	final Class497 aClass497_127;

	@OriginalMember(owner = "client!qr", name = "n", descriptor = "Lclient!py;")
	final Class497 aClass497_126;

	@OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(Lclient!zt;Lclient!py;Lclient!py;)V")
	public Class514(@OriginalArg(0) Class717 arg0, @OriginalArg(1) Class497 arg1, @OriginalArg(2) Class497 arg2) {
		this.aClass497_127 = arg1;
		this.aClass497_126 = arg2;
		if (this.aClass497_127 != null) {
			this.aClass497_127.method30243(0, 146628982);
		}
		if (this.aClass497_126 != null) {
			this.aClass497_126.method30243(0, 950007617);
		}
	}

	@OriginalMember(owner = "client!qr", name = "n", descriptor = "(I)Lclient!asd;")
	public Class93_Sub1_Sub14 method30447(@OriginalArg(0) int arg0) {
		@Pc(6) Class93_Sub1_Sub14 local6 = (Class93_Sub1_Sub14) this.aClass240_89.method25932((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(22) byte[] local22;
		if (arg0 >= 32768) {
			local22 = this.aClass497_126.method30225(0, arg0 & 0x7FFF, (byte) 0);
		} else {
			local22 = this.aClass497_127.method30225(0, arg0, (byte) 0);
		}
		local6 = new Class93_Sub1_Sub14();
		if (local22 != null) {
			local6.method22372(new Class93_Sub41(local22), 304505924);
		}
		if (arg0 >= 32768) {
			local6.method22375(685493737);
		}
		this.aClass240_89.method25923(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!qr", name = "e", descriptor = "(IB)Lclient!asd;")
	public Class93_Sub1_Sub14 method30448(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(6) Class93_Sub1_Sub14 local6 = (Class93_Sub1_Sub14) this.aClass240_89.method25932((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(22) byte[] local22;
		if (arg0 >= 32768) {
			local22 = this.aClass497_126.method30225(0, arg0 & 0x7FFF, (byte) 0);
		} else {
			local22 = this.aClass497_127.method30225(0, arg0, (byte) 0);
		}
		local6 = new Class93_Sub1_Sub14();
		if (local22 != null) {
			local6.method22372(new Class93_Sub41(local22), -999951845);
		}
		if (arg0 >= 32768) {
			local6.method22375(-2021337560);
		}
		this.aClass240_89.method25923(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!qr", name = "m", descriptor = "(I)Lclient!asd;")
	public Class93_Sub1_Sub14 method30449(@OriginalArg(0) int arg0) {
		@Pc(6) Class93_Sub1_Sub14 local6 = (Class93_Sub1_Sub14) this.aClass240_89.method25932((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(22) byte[] local22;
		if (arg0 >= 32768) {
			local22 = this.aClass497_126.method30225(0, arg0 & 0x7FFF, (byte) 0);
		} else {
			local22 = this.aClass497_127.method30225(0, arg0, (byte) 0);
		}
		local6 = new Class93_Sub1_Sub14();
		if (local22 != null) {
			local6.method22372(new Class93_Sub41(local22), 110736450);
		}
		if (arg0 >= 32768) {
			local6.method22375(801520252);
		}
		this.aClass240_89.method25923(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!qr", name = "k", descriptor = "(I)Lclient!asd;")
	public Class93_Sub1_Sub14 method30450(@OriginalArg(0) int arg0) {
		@Pc(6) Class93_Sub1_Sub14 local6 = (Class93_Sub1_Sub14) this.aClass240_89.method25932((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(22) byte[] local22;
		if (arg0 >= 32768) {
			local22 = this.aClass497_126.method30225(0, arg0 & 0x7FFF, (byte) 0);
		} else {
			local22 = this.aClass497_127.method30225(0, arg0, (byte) 0);
		}
		local6 = new Class93_Sub1_Sub14();
		if (local22 != null) {
			local6.method22372(new Class93_Sub41(local22), -396632467);
		}
		if (arg0 >= 32768) {
			local6.method22375(1250336655);
		}
		this.aClass240_89.method25923(local6, (long) arg0);
		return local6;
	}
}
