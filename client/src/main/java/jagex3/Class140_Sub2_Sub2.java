package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aqu")
public final class Class140_Sub2_Sub2 extends Class140_Sub2 {

	@OriginalMember(owner = "client!aqu", name = "s", descriptor = "[B")
	byte[] aByteArray55;

	@OriginalMember(owner = "client!aqu", name = "<init>", descriptor = "()V")
	Class140_Sub2_Sub2() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!aqu", name = "t", descriptor = "(IB)V")
	@Override
	void method20420(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(12) byte local12 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(15) int local15 = local3;
		@Pc(16) int local16 = local3 + 1;
		this.aByteArray55[local15] = local12;
		this.aByteArray55[local16] = local12;
	}

	@OriginalMember(owner = "client!aqu", name = "ae", descriptor = "(III)[B")
	byte[] method20421(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray55 = new byte[arg0 * arg1 * arg2 * 2];
		this.method20397(arg0, arg1, arg2);
		return this.aByteArray55;
	}

	@OriginalMember(owner = "client!aqu", name = "j", descriptor = "(IB)V")
	@Override
	void method20419(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(12) byte local12 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(15) int local15 = local3;
		@Pc(16) int local16 = local3 + 1;
		this.aByteArray55[local15] = local12;
		this.aByteArray55[local16] = local12;
	}

	@OriginalMember(owner = "client!aqu", name = "ah", descriptor = "(III)[B")
	byte[] method20422(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray55 = new byte[arg0 * arg1 * arg2 * 2];
		this.method20397(arg0, arg1, arg2);
		return this.aByteArray55;
	}

	@OriginalMember(owner = "client!aqu", name = "ag", descriptor = "(III)[B")
	byte[] method20423(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray55 = new byte[arg0 * arg1 * arg2 * 2];
		this.method20397(arg0, arg1, arg2);
		return this.aByteArray55;
	}
}
