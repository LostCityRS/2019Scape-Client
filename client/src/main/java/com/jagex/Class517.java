package com.jagex;

import com.jagex.twitchtv.TwitchWebcamDevice;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qs")
public final class Class517 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!qs", name = "this$0", descriptor = "Lclient!ry;")
	final Class541 aClass541_1;

	@OriginalMember(owner = "client!qs", name = "t", descriptor = "Lclient!ald;")
	Class80_Sub36 aClass80_Sub36_15;

	@OriginalMember(owner = "client!qs", name = "f", descriptor = "Z")
	boolean aBoolean887;

	@OriginalMember(owner = "client!qs", name = "e", descriptor = "I")
	int anInt5055;

	@OriginalMember(owner = "client!qs", name = "u", descriptor = "I")
	int anInt5054;

	@OriginalMember(owner = "client!qs", name = "d", descriptor = "(Lclient!yp;I)V")
	static void method30579(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray46[(arg0.anInt5776 -= -825189621) * -2070619997];
		@Pc(17) TwitchWebcamDevice local17 = Class603.method32129(local13, (byte) -1);
		if (local17 == null) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = -1;
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = "";
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = "";
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local17.e * 1851409193;
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = local17.t;
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = local17.f;
		}
	}

	@OriginalMember(owner = "client!qs", name = "jy", descriptor = "(Lclient!yp;I)V")
	static void method30580(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= 2036747717;
	}

	@OriginalMember(owner = "client!qs", name = "he", descriptor = "(I)V")
	static void method30581(@OriginalArg(0) int arg0) {
		if (client.aFloat254 < 1077.0F) {
			client.aFloat254 = 1077.0F;
		}
		if (client.aFloat254 > 3064.0F) {
			client.aFloat254 = 3064.0F;
		}
		while (client.aFloat255 >= 16384.0F) {
			client.aFloat255 -= 16384.0F;
		}
		while (client.aFloat255 < 0.0F) {
			client.aFloat255 += 16384.0F;
		}
		@Pc(33) Class502 local33 = client.aClass539_1.method30903(-463929735);
		@Pc(37) Class570 local37 = client.aClass539_1.method30932(-1638462787);
		@Pc(43) int local43 = Class268.anInt3917 * 1368033245 >> 9;
		@Pc(49) int local49 = Class315.anInt4021 * -262576965 >> 9;
		@Pc(61) int local61 = Class439.method29150(Class268.anInt3917 * 1368033245, Class315.anInt4021 * -262576965, Class507.anInt5045 * -1170417853, 1037753497);
		@Pc(63) int local63 = 0;
		@Pc(87) int local87;
		if (local43 > 3 && local49 > 3 && local43 < client.aClass539_1.method30921(1913134518) - 4 && local49 < client.aClass539_1.method31011(-1857602811) - 4) {
			for (local87 = local43 - 4; local87 <= local43 + 4; local87++) {
				for (@Pc(96) int local96 = local49 - 4; local96 <= local49 + 4; local96++) {
					@Pc(105) int local105 = Class507.anInt5045 * -1170417853;
					if (local105 < 3 && local33.method30429(local87, local96, 701565918)) {
						local105++;
					}
					@Pc(117) int local117 = 0;
					@Pc(122) byte[][] local122 = client.aClass539_1.method30902(local105, -89564145);
					if (local122 != null) {
						local117 = (local122[local87][local96] & 0xFF) * 8 << 2;
					}
					if (local37.aClass100Array1 != null && local37.aClass100Array1[local105] != null) {
						@Pc(159) int local159 = local61 - (local37.aClass100Array1[local105].method2917(local87, local96, -1017175927) - local117);
						if (local159 > local63) {
							local63 = local159;
						}
					}
				}
			}
		}
		local87 = (local63 >> 2) * 1536;
		if (local87 > 786432) {
			local87 = 786432;
		}
		if (local87 < 262144) {
			local87 = 262144;
		}
		if (local87 > client.anInt3487 * 467081551) {
			client.anInt3487 += (local87 - client.anInt3487 * 467081551) / 24 * -151233105;
		} else if (local87 < client.anInt3487 * 467081551) {
			client.anInt3487 += (local87 - client.anInt3487 * 467081551) / 80 * -151233105;
		}
	}

	@OriginalMember(owner = "client!qs", name = "ug", descriptor = "(Lclient!yp;B)V")
	static void method30582(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2110495152);
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local16.anInt4112 * -2019977469;
	}

	@OriginalMember(owner = "client!qs", name = "el", descriptor = "(III)V")
	public static void method30583(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Class159_Sub1.anInt2026 = (arg0 - Class159_Sub1.anInt1991) * 1633656115;
		Class158.anInt2029 = (arg1 - Class159_Sub1.anInt1996) * -1296666553;
		Class159_Sub1.anInt2018 = -1806870975;
		Class159_Sub1.anInt2019 = -387547399;
		Class156.method15158(-2083593127);
	}

	@OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(Lclient!ry;Lclient!ald;Z)V")
	Class517(@OriginalArg(0) Class541 arg0, @OriginalArg(1) Class80_Sub36 arg1, @OriginalArg(2) boolean arg2) {
		this.aClass541_1 = arg0;
		this.aClass80_Sub36_15 = arg1;
		this.aBoolean887 = arg2;
		this.anInt5055 = -754724709;
		this.anInt5054 = -92498009;
	}

	@OriginalMember(owner = "client!qs", name = "e", descriptor = "()V")
	void method30576() {
		if (this.aClass80_Sub36_15 != null && !this.aBoolean887) {
			this.aClass80_Sub36_15.method23197((byte) 13);
		}
		this.anInt5055 = -754724709;
		this.anInt5054 = -92498009;
	}

	@OriginalMember(owner = "client!qs", name = "t", descriptor = "(I)V")
	void method30577(@OriginalArg(0) int arg0) {
		if (this.aClass80_Sub36_15 != null && !this.aBoolean887) {
			this.aClass80_Sub36_15.method23197((byte) -7);
		}
		this.anInt5055 = -754724709;
		this.anInt5054 = -92498009;
	}

	@OriginalMember(owner = "client!qs", name = "f", descriptor = "()V")
	void method30578() {
		if (this.aClass80_Sub36_15 != null && !this.aBoolean887) {
			this.aClass80_Sub36_15.method23197((byte) -2);
		}
		this.anInt5055 = -754724709;
		this.anInt5054 = -92498009;
	}
}
