package com.jagex;

import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!amp")
public final class Class165_Sub16 extends Class165 {

	@OriginalMember(owner = "client!amp", name = "i", descriptor = "I")
	static final int anInt2193 = 0;

	@OriginalMember(owner = "client!amp", name = "g", descriptor = "I")
	static final int anInt2194 = -1;

	@OriginalMember(owner = "client!amp", name = "m", descriptor = "I")
	static final int anInt2195 = 1;

	@OriginalMember(owner = "client!amp", name = "o", descriptor = "I")
	static final int anInt2196 = 3;

	@OriginalMember(owner = "client!amp", name = "aws", descriptor = "(Lclient!yp;I)V")
	static void method16147(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Date local16 = Class296.method26977(local12, -1897234522);
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class296.method26976(local16, Class681.aTimeZone1, 762593442);
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class296.method26972(local16, Class681.aTimeZone1, -2053489901) - 1;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class296.method26991(local16, Class681.aTimeZone1, -1299026768);
	}

	@OriginalMember(owner = "client!amp", name = "asr", descriptor = "(Lclient!yp;S)V")
	static void method16148(@OriginalArg(0) Class690 arg0, @OriginalArg(1) short arg1) {
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub34_1, arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581], (byte) 55);
		Class719.method37291(-757462169);
	}

	@OriginalMember(owner = "client!amp", name = "<init>", descriptor = "(ILclient!ale;)V")
	public Class165_Sub16(@OriginalArg(0) int arg0, @OriginalArg(1) Class80_Sub37 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!amp", name = "<init>", descriptor = "(Lclient!ale;)V")
	public Class165_Sub16(@OriginalArg(0) Class80_Sub37 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!amp", name = "u", descriptor = "(II)V")
	@Override
	void method16952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!amp", name = "a", descriptor = "(I)V")
	public void method16139(@OriginalArg(0) int arg0) {
		if (!this.aClass80_Sub37_48.method14947(2068850359).method449(1075304501)) {
			this.anInt2398 = this.method16949((byte) -63) * 251097721;
		} else if (this.anInt2398 * -229615671 < -1 || this.anInt2398 * -229615671 > 3) {
			this.anInt2398 = this.method16949((byte) -30) * 251097721;
		}
	}

	@OriginalMember(owner = "client!amp", name = "m", descriptor = "(I)V")
	@Override
	void method16955(@OriginalArg(0) int arg0) {
		this.anInt2398 = arg0 * 251097721;
	}

	@OriginalMember(owner = "client!amp", name = "w", descriptor = "()V")
	public void method16140() {
		if (!this.aClass80_Sub37_48.method14947(762775167).method449(382149032)) {
			this.anInt2398 = this.method16949((byte) -23) * 251097721;
		} else if (this.anInt2398 * -229615671 < -1 || this.anInt2398 * -229615671 > 3) {
			this.anInt2398 = this.method16949((byte) 50) * 251097721;
		}
	}

	@OriginalMember(owner = "client!amp", name = "t", descriptor = "(B)I")
	@Override
	int method16949(@OriginalArg(0) byte arg0) {
		return this.aClass80_Sub37_48.method14947(-847784593).method449(-1351974733) ? 0 : 1;
	}

	@OriginalMember(owner = "client!amp", name = "s", descriptor = "(I)I")
	public int method16141(@OriginalArg(0) int arg0) {
		return this.anInt2398 * -229615671;
	}

	@OriginalMember(owner = "client!amp", name = "g", descriptor = "()I")
	@Override
	int method16948() {
		return this.aClass80_Sub37_48.method14947(-2144011325).method449(-1012914500) ? 0 : 1;
	}

	@OriginalMember(owner = "client!amp", name = "i", descriptor = "(I)I")
	@Override
	int method16954(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!amp", name = "f", descriptor = "(IB)I")
	@Override
	int method16950(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return 3;
	}

	@OriginalMember(owner = "client!amp", name = "k", descriptor = "()V")
	public void method16142() {
		if (!this.aClass80_Sub37_48.method14947(-702133507).method449(-74634746)) {
			this.anInt2398 = this.method16949((byte) 67) * 251097721;
		} else if (this.anInt2398 * -229615671 < -1 || this.anInt2398 * -229615671 > 3) {
			this.anInt2398 = this.method16949((byte) 63) * 251097721;
		}
	}

	@OriginalMember(owner = "client!amp", name = "x", descriptor = "()V")
	public void method16143() {
		if (!this.aClass80_Sub37_48.method14947(-1447048803).method449(-512479763)) {
			this.anInt2398 = this.method16949((byte) 52) * 251097721;
		} else if (this.anInt2398 * -229615671 < -1 || this.anInt2398 * -229615671 > 3) {
			this.anInt2398 = this.method16949((byte) -98) * 251097721;
		}
	}

	@OriginalMember(owner = "client!amp", name = "l", descriptor = "()I")
	@Override
	int method16953() {
		return this.aClass80_Sub37_48.method14947(688577940).method449(1241121951) ? 0 : 1;
	}

	@OriginalMember(owner = "client!amp", name = "r", descriptor = "()V")
	public void method16144() {
		if (!this.aClass80_Sub37_48.method14947(-1142162922).method449(1270816092)) {
			this.anInt2398 = this.method16949((byte) -79) * 251097721;
		} else if (this.anInt2398 * -229615671 < -1 || this.anInt2398 * -229615671 > 3) {
			this.anInt2398 = this.method16949((byte) 39) * 251097721;
		}
	}

	@OriginalMember(owner = "client!amp", name = "q", descriptor = "()V")
	public void method16145() {
		if (!this.aClass80_Sub37_48.method14947(-322320383).method449(-1733025642)) {
			this.anInt2398 = this.method16949((byte) 44) * 251097721;
		} else if (this.anInt2398 * -229615671 < -1 || this.anInt2398 * -229615671 > 3) {
			this.anInt2398 = this.method16949((byte) -61) * 251097721;
		}
	}

	@OriginalMember(owner = "client!amp", name = "h", descriptor = "()I")
	public int method16146() {
		return this.anInt2398 * -229615671;
	}
}
