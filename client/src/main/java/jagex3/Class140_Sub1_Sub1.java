package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aqq")
public final class Class140_Sub1_Sub1 extends Class140_Sub1 {

	@OriginalMember(owner = "client!aqq", name = "h", descriptor = "[B")
	byte[] aByteArray49;

	@OriginalMember(owner = "client!aqq", name = "<init>", descriptor = "()V")
	Class140_Sub1_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!aqq", name = "ah", descriptor = "(IB)V")
	@Override
	void method20329(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(7) int local7 = arg1 & 0xFF;
		@Pc(10) int local10 = local3;
		@Pc(11) int local11 = local3 + 1;
		this.aByteArray49[local10] = (byte) (local7 * 3 >> 5);
		this.aByteArray49[local11] = (byte) (local7 * 3 >> 5);
	}

	@OriginalMember(owner = "client!aqq", name = "ac", descriptor = "(III)[B")
	byte[] method20271(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray49 = new byte[arg0 * arg1 * arg2 * 2];
		this.method20397(arg0, arg1, arg2);
		return this.aByteArray49;
	}

	@OriginalMember(owner = "client!aqq", name = "j", descriptor = "(IB)V")
	@Override
	void method20331(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(7) int local7 = arg1 & 0xFF;
		@Pc(10) int local10 = local3;
		@Pc(11) int local11 = local3 + 1;
		this.aByteArray49[local10] = (byte) (local7 * 3 >> 5);
		this.aByteArray49[local11] = (byte) (local7 * 3 >> 5);
	}

	@OriginalMember(owner = "client!aqq", name = "ag", descriptor = "(IB)V")
	@Override
	void method20333(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(7) int local7 = arg1 & 0xFF;
		@Pc(10) int local10 = local3;
		@Pc(11) int local11 = local3 + 1;
		this.aByteArray49[local10] = (byte) (local7 * 3 >> 5);
		this.aByteArray49[local11] = (byte) (local7 * 3 >> 5);
	}

	@OriginalMember(owner = "client!aqq", name = "as", descriptor = "(III)[B")
	byte[] method20272(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray49 = new byte[arg0 * arg1 * arg2 * 2];
		this.method20397(arg0, arg1, arg2);
		return this.aByteArray49;
	}

	@OriginalMember(owner = "client!aqq", name = "aw", descriptor = "(III)[B")
	byte[] method20273(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray49 = new byte[arg0 * arg1 * arg2 * 2];
		this.method20397(arg0, arg1, arg2);
		return this.aByteArray49;
	}

	@OriginalMember(owner = "client!aqq", name = "ai", descriptor = "(III)[B")
	byte[] method20274(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray49 = new byte[arg0 * arg1 * arg2 * 2];
		this.method20397(arg0, arg1, arg2);
		return this.aByteArray49;
	}

	@OriginalMember(owner = "client!aqq", name = "t", descriptor = "(IB)V")
	@Override
	void method20330(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(7) int local7 = arg1 & 0xFF;
		@Pc(10) int local10 = local3;
		@Pc(11) int local11 = local3 + 1;
		this.aByteArray49[local10] = (byte) (local7 * 3 >> 5);
		this.aByteArray49[local11] = (byte) (local7 * 3 >> 5);
	}

	@OriginalMember(owner = "client!aqq", name = "ae", descriptor = "(IB)V")
	@Override
	void method20332(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(7) int local7 = arg1 & 0xFF;
		@Pc(10) int local10 = local3;
		@Pc(11) int local11 = local3 + 1;
		this.aByteArray49[local10] = (byte) (local7 * 3 >> 5);
		this.aByteArray49[local11] = (byte) (local7 * 3 >> 5);
	}

	@OriginalMember(owner = "client!aqq", name = "ad", descriptor = "(III)[B")
	byte[] method20275(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray49 = new byte[arg0 * arg1 * arg2 * 2];
		this.method20397(arg0, arg1, arg2);
		return this.aByteArray49;
	}

	@OriginalMember(owner = "client!aqq", name = "at", descriptor = "(III)[B")
	byte[] method20276(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray49 = new byte[arg0 * arg1 * arg2 * 2];
		this.method20397(arg0, arg1, arg2);
		return this.aByteArray49;
	}

	@OriginalMember(owner = "client!aqq", name = "al", descriptor = "(IB)V")
	@Override
	void method20334(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(7) int local7 = arg1 & 0xFF;
		@Pc(10) int local10 = local3;
		@Pc(11) int local11 = local3 + 1;
		this.aByteArray49[local10] = (byte) (local7 * 3 >> 5);
		this.aByteArray49[local11] = (byte) (local7 * 3 >> 5);
	}
}
