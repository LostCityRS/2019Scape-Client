package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public class Class149 {

	@OriginalMember(owner = "client!tc", name = "n", descriptor = "Lclient!tc;")
	public Class149 aClass149_19;

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "Lclient!tc;")
	public Class149 aClass149_20;

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "(I)V", line = 8)
	public void method23766(@OriginalArg(0) int arg0) {
		if (this.aClass149_19 != null) {
			this.aClass149_19.aClass149_20 = this.aClass149_20;
			this.aClass149_20.aClass149_19 = this.aClass149_19;
			this.aClass149_20 = null;
			this.aClass149_19 = null;
		}
	}

	@OriginalMember(owner = "client!tc", name = "ae", descriptor = "(IIIJII)Lclient!asf;", line = 188)
	static Class93_Sub23_Sub1 method23767(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(2) Class93_Sub23_Sub1[] local2 = Class93_Sub23_Sub1.aClass93_Sub23_Sub1Array1;
		synchronized (Class93_Sub23_Sub1.aClass93_Sub23_Sub1Array1) {
			@Pc(11) Class93_Sub23_Sub1 local11;
			if (Class93_Sub23_Sub1.anInt3083 * -1013944113 == 0) {
				local11 = new Class93_Sub23_Sub1();
			} else {
				local11 = Class93_Sub23_Sub1.aClass93_Sub23_Sub1Array1[(Class93_Sub23_Sub1.anInt3083 -= 670996015) * -1013944113];
			}
			local11.anInt3084 = arg0 * -1830716981;
			local11.anInt3085 = arg1 * -168537755;
			local11.anInt3086 = arg2 * 1792395113;
			local11.aLong187 = arg3 * -7980680412925647795L;
			local11.anInt3082 = arg4 * -932221455;
			return local11;
		}
	}

	@OriginalMember(owner = "client!tc", name = "abh", descriptor = "(Lclient!yf;I)V", line = 9825)
	static final void method23768(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		if (client.anInt3572 * 825168203 == 0 || local12 >= client.anInt3573 * 1882800101) {
			arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = "";
		} else {
			arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = client.aClass177Array1[local12].aString125;
		}
	}

	@OriginalMember(owner = "client!tc", name = "ajh", descriptor = "(Lclient!yf;I)V", line = 11427)
	static final void method23769(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
	}

	@OriginalMember(owner = "client!tc", name = "akk", descriptor = "(Lclient!yf;I)V", line = 11727)
	static final void method23770(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(28) boolean local28 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1] == 1;
		if (Class159_Sub1.aClass16_16 == null) {
			return;
		}
		@Pc(35) Class93 local35 = Class159_Sub1.aClass16_16.method214((long) local13);
		if (local35 != null && !local28) {
			local35.method23969(63085692);
		} else if (local35 == null && local28) {
			local35 = new Class93();
			Class159_Sub1.aClass16_16.method220(local35, (long) local13);
		}
	}

	@OriginalMember(owner = "client!tc", name = "asi", descriptor = "(Lclient!yf;B)V", line = 13204)
	static final void method23771(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		if (local12 > 255 || local12 < 0) {
			local12 = 0;
		}
		if (local12 != Class51.aClass93_Sub36_1.aClass166_Sub38_1.method16324(-98785499)) {
			Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub38_1, local12, (byte) 45);
			Class106_Sub1.method5135(-26762461);
			client.aBoolean601 = false;
		}
	}
}
