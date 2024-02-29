package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sv")
public class Class562 {

	@OriginalMember(owner = "client!sv", name = "e", descriptor = "I")
	static final int anInt5348 = 512;

	@OriginalMember(owner = "client!sv", name = "rj", descriptor = "I")
	static int anInt5352;

	@OriginalMember(owner = "client!sv", name = "m", descriptor = "I")
	int anInt5340;

	@OriginalMember(owner = "client!sv", name = "l", descriptor = "I")
	int anInt5341;

	@OriginalMember(owner = "client!sv", name = "i", descriptor = "Lclient!sv;")
	Class562 aClass562_1;

	@OriginalMember(owner = "client!sv", name = "c", descriptor = "Lclient!cm;")
	Class100 aClass100_46;

	@OriginalMember(owner = "client!sv", name = "v", descriptor = "I")
	int anInt5346;

	@OriginalMember(owner = "client!sv", name = "o", descriptor = "I")
	int anInt5347;

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "[B")
	byte[] aByteArray99;

	@OriginalMember(owner = "client!sv", name = "g", descriptor = "Z")
	boolean aBoolean811;

	@OriginalMember(owner = "client!sv", name = "h", descriptor = "Lclient!do;")
	Class109 aClass109_6;

	@OriginalMember(owner = "client!sv", name = "j", descriptor = "I")
	int anInt5349;

	@OriginalMember(owner = "client!sv", name = "t", descriptor = "I")
	int anInt5350;

	@OriginalMember(owner = "client!sv", name = "ae", descriptor = "I")
	int anInt5351;

	@OriginalMember(owner = "client!sv", name = "u", descriptor = "I")
	int anInt5338 = -2080735533;

	@OriginalMember(owner = "client!sv", name = "s", descriptor = "Z")
	boolean aBoolean810 = true;

	@OriginalMember(owner = "client!sv", name = "z", descriptor = "I")
	final int anInt5342;

	@OriginalMember(owner = "client!sv", name = "p", descriptor = "I")
	final int anInt5343;

	@OriginalMember(owner = "client!sv", name = "d", descriptor = "I")
	final int anInt5344;

	@OriginalMember(owner = "client!sv", name = "n", descriptor = "I")
	final int anInt5339;

	@OriginalMember(owner = "client!sv", name = "f", descriptor = "[Lclient!sw;")
	Class563[] aClass563Array2;

	@OriginalMember(owner = "client!sv", name = "r", descriptor = "Lclient!uw;")
	Class604 aClass604_1;

	@OriginalMember(owner = "client!sv", name = "w", descriptor = "[Lclient!sw;")
	Class563[] aClass563Array1;

	@OriginalMember(owner = "client!sv", name = "k", descriptor = "Lclient!sw;")
	Class563 aClass563_1;

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "I")
	int anInt5345;

	@OriginalMember(owner = "client!sv", name = "v", descriptor = "(Lclient!py;Lclient!df;Lclient!es;)V", line = 52)
	public static void method31153(@OriginalArg(0) Class497 arg0, @OriginalArg(1) Class225 arg1, @OriginalArg(2) Interface24 arg2) {
		Class280.aClass497_100 = arg0;
		Class388.aClass225_7 = arg1;
		Class319.anInterface24_8 = arg2;
	}

	@OriginalMember(owner = "client!sv", name = "o", descriptor = "()V", line = 58)
	public static void method31154() {
		Class563.method31193();
	}

	@OriginalMember(owner = "client!sv", name = "s", descriptor = "()V", line = 58)
	public static void method31155() {
		Class563.method31193();
	}

	@OriginalMember(owner = "client!sv", name = "y", descriptor = "()V", line = 58)
	public static void method31156() {
		Class563.method31193();
	}

	@OriginalMember(owner = "client!sv", name = "<init>", descriptor = "(I[Lclient!sw;IIIILclient!uw;I)V", line = 61)
	public Class562(@OriginalArg(0) int arg0, @OriginalArg(1) Class563[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class604 arg6, @OriginalArg(7) int arg7) {
		this.anInt5342 = arg3 * -297793145;
		this.anInt5343 = arg4 * 1540142085;
		this.anInt5344 = arg5 * 696803317;
		this.anInt5339 = arg0 * -1427522121;
		this.aClass563Array2 = arg1;
		this.aClass604_1 = arg6;
		if (arg1 == null) {
			this.aClass563Array1 = null;
			this.aClass563_1 = null;
		} else {
			this.aClass563Array1 = new Class563[arg1.length];
			this.aClass563_1 = arg2 >= 0 ? arg1[arg2] : null;
		}
		this.anInt5345 = arg7 * 718916829;
	}

	@OriginalMember(owner = "client!sv", name = "m", descriptor = "(III)V", line = 80)
	public void method31157(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.aBoolean811) {
		}
		this.anInt5349 = ((arg1 - this.anInt5351 * 1477186659) * arg0 / 255 + this.anInt5351 * 1477186659) * 562197507;
	}

	@OriginalMember(owner = "client!sv", name = "q", descriptor = "(II)V", line = 80)
	public void method31158(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean811) {
		}
		this.anInt5349 = ((arg1 - this.anInt5351 * 1477186659) * arg0 / 255 + this.anInt5351 * 1477186659) * 562197507;
	}

	@OriginalMember(owner = "client!sv", name = "x", descriptor = "(Lclient!sv;)V", line = 85)
	public void method31159(@OriginalArg(0) Class562 arg0) {
		if (this.aBoolean811) {
			this.anInt5351 = this.anInt5349 * 1474073369;
		} else if (arg0 != null && arg0.aBoolean811) {
			this.anInt5351 = 152976821 - arg0.anInt5349 * 1474073369;
		} else {
			this.anInt5351 = 0;
		}
		this.aBoolean811 = true;
		this.aClass562_1 = arg0;
		this.anInt5349 = 0;
	}

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "(Lclient!sv;)V", line = 85)
	public void method31160(@OriginalArg(0) Class562 arg0) {
		if (this.aBoolean811) {
			this.anInt5351 = this.anInt5349 * 1474073369;
		} else if (arg0 != null && arg0.aBoolean811) {
			this.anInt5351 = 152976821 - arg0.anInt5349 * 1474073369;
		} else {
			this.anInt5351 = 0;
		}
		this.aBoolean811 = true;
		this.aClass562_1 = arg0;
		this.anInt5349 = 0;
	}

	@OriginalMember(owner = "client!sv", name = "k", descriptor = "(Lclient!sv;I)V", line = 85)
	public void method31161(@OriginalArg(0) Class562 arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean811) {
			this.anInt5351 = this.anInt5349 * 1474073369;
		} else if (arg0 != null && arg0.aBoolean811) {
			this.anInt5351 = 152976821 - arg0.anInt5349 * 1474073369;
		} else {
			this.anInt5351 = 0;
		}
		this.aBoolean811 = true;
		this.aClass562_1 = arg0;
		this.anInt5349 = 0;
	}

	@OriginalMember(owner = "client!sv", name = "h", descriptor = "()V", line = 100)
	public void method31162() {
		this.aBoolean811 = false;
		this.aClass562_1 = null;
		this.anInt5349 = 0;
	}

	@OriginalMember(owner = "client!sv", name = "f", descriptor = "(I)V", line = 100)
	public void method31163(@OriginalArg(0) int arg0) {
		this.aBoolean811 = false;
		this.aClass562_1 = null;
		this.anInt5349 = 0;
	}

	@OriginalMember(owner = "client!sv", name = "g", descriptor = "()Z", line = 106)
	public boolean method31164() {
		return this.aBoolean811;
	}

	@OriginalMember(owner = "client!sv", name = "i", descriptor = "()Z", line = 106)
	public boolean method31165() {
		return this.aBoolean811;
	}

	@OriginalMember(owner = "client!sv", name = "j", descriptor = "()Z", line = 106)
	public boolean method31166() {
		return this.aBoolean811;
	}

	@OriginalMember(owner = "client!sv", name = "w", descriptor = "(B)Z", line = 106)
	public boolean method31167(@OriginalArg(0) byte arg0) {
		return this.aBoolean811;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "()Z", line = 106)
	public boolean method31168() {
		return this.aBoolean811;
	}

	@OriginalMember(owner = "client!sv", name = "l", descriptor = "(I)Lclient!sv;", line = 110)
	public Class562 method31169(@OriginalArg(0) int arg0) {
		return this.aClass562_1;
	}

	@OriginalMember(owner = "client!sv", name = "t", descriptor = "()Lclient!sv;", line = 110)
	public Class562 method31170() {
		return this.aClass562_1;
	}

	@OriginalMember(owner = "client!sv", name = "u", descriptor = "(Lclient!dh;III)Z", line = 114)
	public boolean method31171(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 != this.anInt5338 * 1512928933) {
			this.anInt5338 = arg1 * 2080735533;
			@Pc(14) int local14 = Class278.method26363(arg1, 423254006);
			if (local14 > 512) {
				local14 = 512;
			}
			if (local14 <= 0) {
				local14 = 1;
			}
			if (local14 != this.anInt5340 * -773000899) {
				this.anInt5340 = local14 * 101215765;
				this.aClass100_46 = null;
			}
			if (this.aClass563Array2 != null) {
				this.anInt5341 = 0;
				@Pc(49) int[] local49 = new int[this.aClass563Array2.length];
				for (@Pc(51) int local51 = 0; local51 < this.aClass563Array2.length; local51++) {
					@Pc(61) Class563 local61 = this.aClass563Array2[local51];
					if (local61.method31196(this.anInt5342 * -331387849, this.anInt5343 * -366741299, this.anInt5344 * 777917533, this.anInt5338 * 1512928933)) {
						local49[this.anInt5341 * -1069112057] = local61.anInt5365;
						this.aClass563Array1[(this.anInt5341 += 1413855415) * -1069112057 - 1] = local61;
					}
				}
				Class350.method27635(local49, this.aClass563Array1, 0, this.anInt5341 * -1069112057 - 1, 1597934566);
			}
			this.aBoolean810 = true;
		}
		@Pc(122) boolean local122 = false;
		if (this.aBoolean810) {
			this.aBoolean810 = false;
			for (@Pc(135) int local135 = this.anInt5341 * -1069112057 - 1; local135 >= 0; local135--) {
				@Pc(146) boolean local146 = this.aClass563Array1[local135].method31197(arg0, this.aClass563_1);
				this.aBoolean810 |= !local146;
				local122 |= local146;
			}
		}
		if (arg2 == 0 || !arg0.method20537()) {
			this.aClass109_6 = null;
		} else if (this.aClass109_6 == null && this.anInt5345 * -1118213259 >= 0) {
			this.method31173(arg0, -2106744281);
		}
		if (this.aClass562_1 != null && this.aClass562_1 != this) {
			this.aClass562_1.method31163(2116530090);
			local122 |= this.aClass562_1.method31171(arg0, arg1, arg2, 1974574634);
		}
		return local122;
	}

	@OriginalMember(owner = "client!sv", name = "ae", descriptor = "(Lclient!dh;II)Z", line = 114)
	public boolean method31172(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 != this.anInt5338 * 1512928933) {
			this.anInt5338 = arg1 * 2080735533;
			@Pc(14) int local14 = Class278.method26363(arg1, 423254006);
			if (local14 > 512) {
				local14 = 512;
			}
			if (local14 <= 0) {
				local14 = 1;
			}
			if (local14 != this.anInt5340 * -773000899) {
				this.anInt5340 = local14 * 101215765;
				this.aClass100_46 = null;
			}
			if (this.aClass563Array2 != null) {
				this.anInt5341 = 0;
				@Pc(49) int[] local49 = new int[this.aClass563Array2.length];
				for (@Pc(51) int local51 = 0; local51 < this.aClass563Array2.length; local51++) {
					@Pc(61) Class563 local61 = this.aClass563Array2[local51];
					if (local61.method31196(this.anInt5342 * -331387849, this.anInt5343 * -366741299, this.anInt5344 * 777917533, this.anInt5338 * 1512928933)) {
						local49[this.anInt5341 * -1069112057] = local61.anInt5365;
						this.aClass563Array1[(this.anInt5341 += 1413855415) * -1069112057 - 1] = local61;
					}
				}
				Class350.method27635(local49, this.aClass563Array1, 0, this.anInt5341 * -1069112057 - 1, 1596871668);
			}
			this.aBoolean810 = true;
		}
		@Pc(122) boolean local122 = false;
		if (this.aBoolean810) {
			this.aBoolean810 = false;
			for (@Pc(135) int local135 = this.anInt5341 * -1069112057 - 1; local135 >= 0; local135--) {
				@Pc(146) boolean local146 = this.aClass563Array1[local135].method31197(arg0, this.aClass563_1);
				this.aBoolean810 |= !local146;
				local122 |= local146;
			}
		}
		if (arg2 == 0 || !arg0.method20537()) {
			this.aClass109_6 = null;
		} else if (this.aClass109_6 == null && this.anInt5345 * -1118213259 >= 0) {
			this.method31173(arg0, -2042885960);
		}
		if (this.aClass562_1 != null && this.aClass562_1 != this) {
			this.aClass562_1.method31163(1164072402);
			local122 |= this.aClass562_1.method31171(arg0, arg1, arg2, 129379937);
		}
		return local122;
	}

	@OriginalMember(owner = "client!sv", name = "z", descriptor = "(Lclient!dh;I)V", line = 161)
	void method31173(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(7) boolean local7 = Class280.aClass497_100.method30073(this.anInt5345 * -1118213259, 1404366259);
			if (local7) {
				arg0.method20607(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
				@Pc(25) Class231 local25 = Class231.method25655(Class280.aClass497_100, this.anInt5345 * -1118213259, 0);
				this.aClass109_6 = arg0.method20597(local25, 1099776, 0, 255, 1);
				@Pc(38) byte[] local38 = this.aClass109_6.method6912();
				if (local38 == null) {
					this.aByteArray99 = null;
				} else {
					this.aByteArray99 = new byte[local38.length];
					System.arraycopy(local38, 0, this.aByteArray99, 0, local38.length);
				}
			}
		} catch (@Pc(59) Exception local59) {
		}
	}

	@OriginalMember(owner = "client!sv", name = "ag", descriptor = "(Lclient!dh;)V", line = 161)
	void method31174(@OriginalArg(0) Class104 arg0) {
		try {
			@Pc(7) boolean local7 = Class280.aClass497_100.method30073(this.anInt5345 * -1118213259, -310545360);
			if (local7) {
				arg0.method20607(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
				@Pc(25) Class231 local25 = Class231.method25655(Class280.aClass497_100, this.anInt5345 * -1118213259, 0);
				this.aClass109_6 = arg0.method20597(local25, 1099776, 0, 255, 1);
				@Pc(38) byte[] local38 = this.aClass109_6.method6912();
				if (local38 == null) {
					this.aByteArray99 = null;
				} else {
					this.aByteArray99 = new byte[local38.length];
					System.arraycopy(local38, 0, this.aByteArray99, 0, local38.length);
				}
			}
		} catch (@Pc(59) Exception local59) {
		}
	}

	@OriginalMember(owner = "client!sv", name = "ah", descriptor = "(Lclient!dh;IIIIIIIII)V", line = 184)
	public void method31175(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.method31178(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, 0, arg9, true, false, -2137165835);
	}

	@OriginalMember(owner = "client!sv", name = "p", descriptor = "(Lclient!dh;IIIIIIIIII)V", line = 184)
	public void method31176(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.method31178(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, 0, arg9, true, false, -2056367908);
	}

	@OriginalMember(owner = "client!sv", name = "ac", descriptor = "(Lclient!dh;IIIIIIIIIZZ)V", line = 188)
	public void method31177(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) boolean arg11) {
		@Pc(1) int local1 = 0;
		if (this.aBoolean811) {
			local1 = this.anInt5349 * -1292446037;
		}
		if (this.aClass562_1 == null) {
			if (this.anInt5339 * 138588167 == -1) {
				arg0.method20721(arg2, arg3, arg4, arg5, arg9 | 0xFF000000, 0);
			}
			this.method31180(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, local1, -45831260);
			return;
		}
		@Pc(15) Class562 local15 = this;
		@Pc(18) Class562 local18 = this.aClass562_1;
		if (this.hashCode() > local18.hashCode()) {
			local15 = this.aClass562_1;
			local18 = this;
			local1 = 255 - local1;
		}
		local15.method31180(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, local1, -1668040909);
		local18.method31180(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, false, arg11, 255 - local1, 767712563);
	}

	@OriginalMember(owner = "client!sv", name = "d", descriptor = "(Lclient!dh;IIIIIIIIIZZI)V", line = 188)
	public void method31178(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) int arg12) {
		@Pc(1) int local1 = 0;
		if (this.aBoolean811) {
			local1 = this.anInt5349 * -1292446037;
		}
		if (this.aClass562_1 == null) {
			if (this.anInt5339 * 138588167 == -1) {
				arg0.method20721(arg2, arg3, arg4, arg5, arg9 | 0xFF000000, 0);
			}
			this.method31180(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, local1, -766352119);
			return;
		}
		@Pc(15) Class562 local15 = this;
		@Pc(18) Class562 local18 = this.aClass562_1;
		if (this.hashCode() > local18.hashCode()) {
			local15 = this.aClass562_1;
			local18 = this;
			local1 = 255 - local1;
		}
		local15.method31180(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, local1, -1090467293);
		local18.method31180(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, false, arg11, 255 - local1, -1735144959);
	}

	@OriginalMember(owner = "client!sv", name = "al", descriptor = "(Lclient!dh;IIIIIIIIIZZ)V", line = 188)
	public void method31179(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) boolean arg11) {
		@Pc(1) int local1 = 0;
		if (this.aBoolean811) {
			local1 = this.anInt5349 * -1292446037;
		}
		if (this.aClass562_1 == null) {
			if (this.anInt5339 * 138588167 == -1) {
				arg0.method20721(arg2, arg3, arg4, arg5, arg9 | 0xFF000000, 0);
			}
			this.method31180(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, local1, 2071582048);
			return;
		}
		@Pc(15) Class562 local15 = this;
		@Pc(18) Class562 local18 = this.aClass562_1;
		if (this.hashCode() > local18.hashCode()) {
			local15 = this.aClass562_1;
			local18 = this;
			local1 = 255 - local1;
		}
		local15.method31180(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, local1, -1879839639);
		local18.method31180(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, false, arg11, 255 - local1, 1087065941);
	}

	@OriginalMember(owner = "client!sv", name = "c", descriptor = "(Lclient!dh;IIIIIIIIIZZII)V", line = 210)
	void method31180(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		@Pc(3) int local3 = 255 - arg12;
		arg0.method20489();
		arg0.method20492();
		if (this.aClass109_6 == null) {
			arg0.method20829(2, 0);
			arg7 = arg1 + arg7 & 0x3FFF;
			if (this.anInt5339 * 138588167 == -1 || this.anInt5340 * -773000899 == 0) {
				arg0.method20721(arg2, arg3, arg4, arg5, local3 << 24 | arg9, arg10 ? 0 : 1);
			} else {
				@Pc(40) Class235 local40 = Class388.aClass225_7.method25597(this.anInt5339 * 138588167, -371240932);
				if (this.aClass100_46 == null && Class319.anInterface24_8.method6765(Class616.aClass616_2, local40.anInt3788 * -1747960127, -1, Class618.aClass618_3 == local40.aClass618_2 ? Class609.aClass609_2 : Class609.aClass609_1, 0.7F, this.anInt5340 * -773000899, this.anInt5340 * -773000899, false, -1630596103)) {
					@Pc(112) int[] local112 = local40.aClass618_2 == Class618.aClass618_3 ? Class319.anInterface24_8.method6780(Class616.aClass616_2, local40.anInt3788 * -1747960127, 0.7F, this.anInt5340 * -773000899, this.anInt5340 * -773000899, false, (byte) -49) : Class319.anInterface24_8.method6764(Class616.aClass616_2, local40.anInt3788 * -1747960127, 0.7F, this.anInt5340 * -773000899, this.anInt5340 * -773000899, false, -183044511);
					this.anInt5346 = local112[0] * 947814753;
					this.anInt5347 = local112[local112.length - 1] * 693908015;
					this.aClass100_46 = arg0.method20487(local112, 0, local40.anInt3806 * -923926085, local40.anInt3806 * -923926085, local40.anInt3806 * -923926085, 438797212);
				}
				@Pc(161) int local161 = local3 == 255 ? (Class618.aClass618_3 == local40.aClass618_2 ? 1 : 0) : 1;
				if (local161 == 1 && arg10) {
					arg0.method20721(arg2, arg3, arg4, arg5, arg9, 0);
				}
				if (this.aClass100_46 != null) {
					@Pc(183) int local183 = arg5 * arg6 / -4096;
					@Pc(195) int local195;
					for (local195 = arg7 * arg5 / 4096 + (arg4 - arg5) / 2; local195 > arg5; local195 -= arg5) {
					}
					while (local195 < 0) {
						local195 += arg5;
					}
					@Pc(218) int local218;
					if (this.aClass604_1 == Class604.aClass604_3) {
						for (local218 = local195 - arg5; local218 < arg4; local218 += arg5) {
							this.aClass100_46.method18166(arg2 + local218, arg3 + local183, arg5, arg5, 0, local3 << 24 | 0xFFFFFF, local161);
						}
						if ((this.anInt5346 * 2144985761 & 0xFF000000) != 0) {
							arg0.method20469(0, 0, arg4, arg3 + local183 + 1, this.anInt5346 * 2144985761, (byte) 15);
						}
						if ((this.anInt5347 * -1094429489 & 0xFF000000) != 0) {
							arg0.method20469(0, local183 + arg3 + arg5, arg4, arg5 - (arg5 + local183 + arg3), this.anInt5347 * -1094429489, (byte) 46);
						}
					} else {
						while (local183 > arg5) {
							local183 -= arg5;
						}
						while (local183 < 0) {
							local183 += arg5;
						}
						for (local218 = local195 - arg5; local218 < arg4; local218 += arg5) {
							for (@Pc(321) int local321 = local183 - arg5; local321 < arg5; local321 += arg5) {
								this.aClass100_46.method18166(arg2 + local218, local321 + arg3, arg5, arg5, 0, local3 << 24 | 0xFFFFFF, local161);
							}
						}
					}
				}
			}
		} else if (arg11) {
			@Pc(375) Class489 local375 = arg0.method20722();
			@Pc(378) Class489 local378 = arg0.method20722();
			local375.aFloatArray116[2] = local375.aFloatArray116[3];
			local375.aFloatArray116[6] = local375.aFloatArray116[7];
			local375.aFloatArray116[10] = local375.aFloatArray116[11];
			local375.aFloatArray116[14] = local375.aFloatArray116[15];
			arg0.method20604(local375);
			this.method31185(arg0, arg6, arg7, arg8, arg12, 755766171);
			arg0.method20604(local378);
		} else {
			if (arg10) {
				arg0.method20829(3, arg9);
			}
			this.method31185(arg0, arg6, arg7, arg8, arg12, 802733869);
		}
		for (@Pc(446) int local446 = this.anInt5341 * -1069112057 - 1; local446 >= 0; local446--) {
			this.aClass563Array1[local446].method31199(arg0, arg2, arg3, arg4, arg5, arg6, arg7, this.anInt5342 * -331387849, this.anInt5343 * -366741299, this.anInt5344 * 777917533, local3);
		}
		arg0.method20829(2, 0);
		arg0.method20497();
	}

	@OriginalMember(owner = "client!sv", name = "aw", descriptor = "(Lclient!dh;IIIIIIIIIZZI)V", line = 210)
	void method31181(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) int arg12) {
		@Pc(3) int local3 = 255 - arg12;
		arg0.method20489();
		arg0.method20492();
		if (this.aClass109_6 == null) {
			arg0.method20829(2, 0);
			arg7 = arg1 + arg7 & 0x3FFF;
			if (this.anInt5339 * 138588167 == -1 || this.anInt5340 * -773000899 == 0) {
				arg0.method20721(arg2, arg3, arg4, arg5, local3 << 24 | arg9, arg10 ? 0 : 1);
			} else {
				@Pc(40) Class235 local40 = Class388.aClass225_7.method25597(this.anInt5339 * 138588167, -1409801055);
				if (this.aClass100_46 == null && Class319.anInterface24_8.method6765(Class616.aClass616_2, local40.anInt3788 * -1747960127, -1, Class618.aClass618_3 == local40.aClass618_2 ? Class609.aClass609_2 : Class609.aClass609_1, 0.7F, this.anInt5340 * -773000899, this.anInt5340 * -773000899, false, -1630596103)) {
					@Pc(112) int[] local112 = local40.aClass618_2 == Class618.aClass618_3 ? Class319.anInterface24_8.method6780(Class616.aClass616_2, local40.anInt3788 * -1747960127, 0.7F, this.anInt5340 * -773000899, this.anInt5340 * -773000899, false, (byte) -117) : Class319.anInterface24_8.method6764(Class616.aClass616_2, local40.anInt3788 * -1747960127, 0.7F, this.anInt5340 * -773000899, this.anInt5340 * -773000899, false, -1695534783);
					this.anInt5346 = local112[0] * 947814753;
					this.anInt5347 = local112[local112.length - 1] * 693908015;
					this.aClass100_46 = arg0.method20487(local112, 0, local40.anInt3806 * -923926085, local40.anInt3806 * -923926085, local40.anInt3806 * -923926085, 438797212);
				}
				@Pc(161) int local161 = local3 == 255 ? (Class618.aClass618_3 == local40.aClass618_2 ? 1 : 0) : 1;
				if (local161 == 1 && arg10) {
					arg0.method20721(arg2, arg3, arg4, arg5, arg9, 0);
				}
				if (this.aClass100_46 != null) {
					@Pc(183) int local183 = arg5 * arg6 / -4096;
					@Pc(195) int local195;
					for (local195 = arg7 * arg5 / 4096 + (arg4 - arg5) / 2; local195 > arg5; local195 -= arg5) {
					}
					while (local195 < 0) {
						local195 += arg5;
					}
					@Pc(218) int local218;
					if (this.aClass604_1 == Class604.aClass604_3) {
						for (local218 = local195 - arg5; local218 < arg4; local218 += arg5) {
							this.aClass100_46.method18166(arg2 + local218, arg3 + local183, arg5, arg5, 0, local3 << 24 | 0xFFFFFF, local161);
						}
						if ((this.anInt5346 * 2144985761 & 0xFF000000) != 0) {
							arg0.method20469(0, 0, arg4, arg3 + local183 + 1, this.anInt5346 * 2144985761, (byte) 63);
						}
						if ((this.anInt5347 * -1094429489 & 0xFF000000) != 0) {
							arg0.method20469(0, local183 + arg3 + arg5, arg4, arg5 - (arg5 + local183 + arg3), this.anInt5347 * -1094429489, (byte) 110);
						}
					} else {
						while (local183 > arg5) {
							local183 -= arg5;
						}
						while (local183 < 0) {
							local183 += arg5;
						}
						for (local218 = local195 - arg5; local218 < arg4; local218 += arg5) {
							for (@Pc(321) int local321 = local183 - arg5; local321 < arg5; local321 += arg5) {
								this.aClass100_46.method18166(arg2 + local218, local321 + arg3, arg5, arg5, 0, local3 << 24 | 0xFFFFFF, local161);
							}
						}
					}
				}
			}
		} else if (arg11) {
			@Pc(375) Class489 local375 = arg0.method20722();
			@Pc(378) Class489 local378 = arg0.method20722();
			local375.aFloatArray116[2] = local375.aFloatArray116[3];
			local375.aFloatArray116[6] = local375.aFloatArray116[7];
			local375.aFloatArray116[10] = local375.aFloatArray116[11];
			local375.aFloatArray116[14] = local375.aFloatArray116[15];
			arg0.method20604(local375);
			this.method31185(arg0, arg6, arg7, arg8, arg12, 1059574030);
			arg0.method20604(local378);
		} else {
			if (arg10) {
				arg0.method20829(3, arg9);
			}
			this.method31185(arg0, arg6, arg7, arg8, arg12, 1804757812);
		}
		for (@Pc(446) int local446 = this.anInt5341 * -1069112057 - 1; local446 >= 0; local446--) {
			this.aClass563Array1[local446].method31199(arg0, arg2, arg3, arg4, arg5, arg6, arg7, this.anInt5342 * -331387849, this.anInt5343 * -366741299, this.anInt5344 * 777917533, local3);
		}
		arg0.method20829(2, 0);
		arg0.method20497();
	}

	@OriginalMember(owner = "client!sv", name = "ai", descriptor = "(Lclient!dh;IIIIIIIIIZZI)V", line = 210)
	void method31182(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) int arg12) {
		@Pc(3) int local3 = 255 - arg12;
		arg0.method20489();
		arg0.method20492();
		if (this.aClass109_6 == null) {
			arg0.method20829(2, 0);
			arg7 = arg1 + arg7 & 0x3FFF;
			if (this.anInt5339 * 138588167 == -1 || this.anInt5340 * -773000899 == 0) {
				arg0.method20721(arg2, arg3, arg4, arg5, local3 << 24 | arg9, arg10 ? 0 : 1);
			} else {
				@Pc(40) Class235 local40 = Class388.aClass225_7.method25597(this.anInt5339 * 138588167, -464869256);
				if (this.aClass100_46 == null && Class319.anInterface24_8.method6765(Class616.aClass616_2, local40.anInt3788 * -1747960127, -1, Class618.aClass618_3 == local40.aClass618_2 ? Class609.aClass609_2 : Class609.aClass609_1, 0.7F, this.anInt5340 * -773000899, this.anInt5340 * -773000899, false, -1630596103)) {
					@Pc(112) int[] local112 = local40.aClass618_2 == Class618.aClass618_3 ? Class319.anInterface24_8.method6780(Class616.aClass616_2, local40.anInt3788 * -1747960127, 0.7F, this.anInt5340 * -773000899, this.anInt5340 * -773000899, false, (byte) -14) : Class319.anInterface24_8.method6764(Class616.aClass616_2, local40.anInt3788 * -1747960127, 0.7F, this.anInt5340 * -773000899, this.anInt5340 * -773000899, false, 1218750590);
					this.anInt5346 = local112[0] * 947814753;
					this.anInt5347 = local112[local112.length - 1] * 693908015;
					this.aClass100_46 = arg0.method20487(local112, 0, local40.anInt3806 * -923926085, local40.anInt3806 * -923926085, local40.anInt3806 * -923926085, 438797212);
				}
				@Pc(161) int local161 = local3 == 255 ? (Class618.aClass618_3 == local40.aClass618_2 ? 1 : 0) : 1;
				if (local161 == 1 && arg10) {
					arg0.method20721(arg2, arg3, arg4, arg5, arg9, 0);
				}
				if (this.aClass100_46 != null) {
					@Pc(183) int local183 = arg5 * arg6 / -4096;
					@Pc(195) int local195;
					for (local195 = arg7 * arg5 / 4096 + (arg4 - arg5) / 2; local195 > arg5; local195 -= arg5) {
					}
					while (local195 < 0) {
						local195 += arg5;
					}
					@Pc(218) int local218;
					if (this.aClass604_1 == Class604.aClass604_3) {
						for (local218 = local195 - arg5; local218 < arg4; local218 += arg5) {
							this.aClass100_46.method18166(arg2 + local218, arg3 + local183, arg5, arg5, 0, local3 << 24 | 0xFFFFFF, local161);
						}
						if ((this.anInt5346 * 2144985761 & 0xFF000000) != 0) {
							arg0.method20469(0, 0, arg4, arg3 + local183 + 1, this.anInt5346 * 2144985761, (byte) 77);
						}
						if ((this.anInt5347 * -1094429489 & 0xFF000000) != 0) {
							arg0.method20469(0, local183 + arg3 + arg5, arg4, arg5 - (arg5 + local183 + arg3), this.anInt5347 * -1094429489, (byte) 3);
						}
					} else {
						while (local183 > arg5) {
							local183 -= arg5;
						}
						while (local183 < 0) {
							local183 += arg5;
						}
						for (local218 = local195 - arg5; local218 < arg4; local218 += arg5) {
							for (@Pc(321) int local321 = local183 - arg5; local321 < arg5; local321 += arg5) {
								this.aClass100_46.method18166(arg2 + local218, local321 + arg3, arg5, arg5, 0, local3 << 24 | 0xFFFFFF, local161);
							}
						}
					}
				}
			}
		} else if (arg11) {
			@Pc(375) Class489 local375 = arg0.method20722();
			@Pc(378) Class489 local378 = arg0.method20722();
			local375.aFloatArray116[2] = local375.aFloatArray116[3];
			local375.aFloatArray116[6] = local375.aFloatArray116[7];
			local375.aFloatArray116[10] = local375.aFloatArray116[11];
			local375.aFloatArray116[14] = local375.aFloatArray116[15];
			arg0.method20604(local375);
			this.method31185(arg0, arg6, arg7, arg8, arg12, 1240139022);
			arg0.method20604(local378);
		} else {
			if (arg10) {
				arg0.method20829(3, arg9);
			}
			this.method31185(arg0, arg6, arg7, arg8, arg12, 1508206001);
		}
		for (@Pc(446) int local446 = this.anInt5341 * -1069112057 - 1; local446 >= 0; local446--) {
			this.aClass563Array1[local446].method31199(arg0, arg2, arg3, arg4, arg5, arg6, arg7, this.anInt5342 * -331387849, this.anInt5343 * -366741299, this.anInt5344 * 777917533, local3);
		}
		arg0.method20829(2, 0);
		arg0.method20497();
	}

	@OriginalMember(owner = "client!sv", name = "as", descriptor = "(Lclient!dh;IIIIIIIIIZZI)V", line = 210)
	void method31183(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) boolean arg11, @OriginalArg(12) int arg12) {
		@Pc(3) int local3 = 255 - arg12;
		arg0.method20489();
		arg0.method20492();
		if (this.aClass109_6 == null) {
			arg0.method20829(2, 0);
			arg7 = arg1 + arg7 & 0x3FFF;
			if (this.anInt5339 * 138588167 == -1 || this.anInt5340 * -773000899 == 0) {
				arg0.method20721(arg2, arg3, arg4, arg5, local3 << 24 | arg9, arg10 ? 0 : 1);
			} else {
				@Pc(40) Class235 local40 = Class388.aClass225_7.method25597(this.anInt5339 * 138588167, -403511438);
				if (this.aClass100_46 == null && Class319.anInterface24_8.method6765(Class616.aClass616_2, local40.anInt3788 * -1747960127, -1, Class618.aClass618_3 == local40.aClass618_2 ? Class609.aClass609_2 : Class609.aClass609_1, 0.7F, this.anInt5340 * -773000899, this.anInt5340 * -773000899, false, -1630596103)) {
					@Pc(112) int[] local112 = local40.aClass618_2 == Class618.aClass618_3 ? Class319.anInterface24_8.method6780(Class616.aClass616_2, local40.anInt3788 * -1747960127, 0.7F, this.anInt5340 * -773000899, this.anInt5340 * -773000899, false, (byte) -92) : Class319.anInterface24_8.method6764(Class616.aClass616_2, local40.anInt3788 * -1747960127, 0.7F, this.anInt5340 * -773000899, this.anInt5340 * -773000899, false, 1573164314);
					this.anInt5346 = local112[0] * 947814753;
					this.anInt5347 = local112[local112.length - 1] * 693908015;
					this.aClass100_46 = arg0.method20487(local112, 0, local40.anInt3806 * -923926085, local40.anInt3806 * -923926085, local40.anInt3806 * -923926085, 438797212);
				}
				@Pc(161) int local161 = local3 == 255 ? (Class618.aClass618_3 == local40.aClass618_2 ? 1 : 0) : 1;
				if (local161 == 1 && arg10) {
					arg0.method20721(arg2, arg3, arg4, arg5, arg9, 0);
				}
				if (this.aClass100_46 != null) {
					@Pc(183) int local183 = arg5 * arg6 / -4096;
					@Pc(195) int local195;
					for (local195 = arg7 * arg5 / 4096 + (arg4 - arg5) / 2; local195 > arg5; local195 -= arg5) {
					}
					while (local195 < 0) {
						local195 += arg5;
					}
					@Pc(218) int local218;
					if (this.aClass604_1 == Class604.aClass604_3) {
						for (local218 = local195 - arg5; local218 < arg4; local218 += arg5) {
							this.aClass100_46.method18166(arg2 + local218, arg3 + local183, arg5, arg5, 0, local3 << 24 | 0xFFFFFF, local161);
						}
						if ((this.anInt5346 * 2144985761 & 0xFF000000) != 0) {
							arg0.method20469(0, 0, arg4, arg3 + local183 + 1, this.anInt5346 * 2144985761, (byte) 18);
						}
						if ((this.anInt5347 * -1094429489 & 0xFF000000) != 0) {
							arg0.method20469(0, local183 + arg3 + arg5, arg4, arg5 - (arg5 + local183 + arg3), this.anInt5347 * -1094429489, (byte) 63);
						}
					} else {
						while (local183 > arg5) {
							local183 -= arg5;
						}
						while (local183 < 0) {
							local183 += arg5;
						}
						for (local218 = local195 - arg5; local218 < arg4; local218 += arg5) {
							for (@Pc(321) int local321 = local183 - arg5; local321 < arg5; local321 += arg5) {
								this.aClass100_46.method18166(arg2 + local218, local321 + arg3, arg5, arg5, 0, local3 << 24 | 0xFFFFFF, local161);
							}
						}
					}
				}
			}
		} else if (arg11) {
			@Pc(375) Class489 local375 = arg0.method20722();
			@Pc(378) Class489 local378 = arg0.method20722();
			local375.aFloatArray116[2] = local375.aFloatArray116[3];
			local375.aFloatArray116[6] = local375.aFloatArray116[7];
			local375.aFloatArray116[10] = local375.aFloatArray116[11];
			local375.aFloatArray116[14] = local375.aFloatArray116[15];
			arg0.method20604(local375);
			this.method31185(arg0, arg6, arg7, arg8, arg12, 1333300451);
			arg0.method20604(local378);
		} else {
			if (arg10) {
				arg0.method20829(3, arg9);
			}
			this.method31185(arg0, arg6, arg7, arg8, arg12, 1999729007);
		}
		for (@Pc(446) int local446 = this.anInt5341 * -1069112057 - 1; local446 >= 0; local446--) {
			this.aClass563Array1[local446].method31199(arg0, arg2, arg3, arg4, arg5, arg6, arg7, this.anInt5342 * -331387849, this.anInt5343 * -366741299, this.anInt5344 * 777917533, local3);
		}
		arg0.method20829(2, 0);
		arg0.method20497();
	}

	@OriginalMember(owner = "client!sv", name = "am", descriptor = "(Lclient!dh;IIII)V", line = 282)
	void method31184(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) Class470 local2 = arg0.method20602();
		@Pc(6) Class470 local6 = new Class470();
		local6.method29419(0.0F, 0.0F, 0.0F);
		local6.method29403(0.0F, -1.0F, 0.0F, Class464.method29281(-arg2 & 0x3FFF));
		local6.method29403(-1.0F, 0.0F, 0.0F, Class464.method29281(-arg1 & 0x3FFF));
		local6.method29403(0.0F, 0.0F, -1.0F, Class464.method29281(-arg3 & 0x3FFF));
		arg0.method20601(local6);
		@Pc(48) Class470 local48 = new Class470();
		if (this.anInt5350 * 775061697 != arg4) {
			this.aClass109_6.method6916((byte) arg4, this.aByteArray99);
			this.anInt5350 = arg4 * -1239281855;
		}
		this.aClass109_6.method6976(local48, null, 0);
		arg0.method20601(local2);
	}

	@OriginalMember(owner = "client!sv", name = "r", descriptor = "(Lclient!dh;IIIII)V", line = 282)
	void method31185(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(2) Class470 local2 = arg0.method20602();
		@Pc(6) Class470 local6 = new Class470();
		local6.method29419(0.0F, 0.0F, 0.0F);
		local6.method29403(0.0F, -1.0F, 0.0F, Class464.method29281(-arg2 & 0x3FFF));
		local6.method29403(-1.0F, 0.0F, 0.0F, Class464.method29281(-arg1 & 0x3FFF));
		local6.method29403(0.0F, 0.0F, -1.0F, Class464.method29281(-arg3 & 0x3FFF));
		arg0.method20601(local6);
		@Pc(48) Class470 local48 = new Class470();
		if (this.anInt5350 * 775061697 != arg4) {
			this.aClass109_6.method6916((byte) arg4, this.aByteArray99);
			this.anInt5350 = arg4 * -1239281855;
		}
		this.aClass109_6.method6976(local48, null, 0);
		arg0.method20601(local2);
	}

	@OriginalMember(owner = "client!sv", name = "at", descriptor = "(Lclient!dh;IIII)V", line = 282)
	void method31186(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) Class470 local2 = arg0.method20602();
		@Pc(6) Class470 local6 = new Class470();
		local6.method29419(0.0F, 0.0F, 0.0F);
		local6.method29403(0.0F, -1.0F, 0.0F, Class464.method29281(-arg2 & 0x3FFF));
		local6.method29403(-1.0F, 0.0F, 0.0F, Class464.method29281(-arg1 & 0x3FFF));
		local6.method29403(0.0F, 0.0F, -1.0F, Class464.method29281(-arg3 & 0x3FFF));
		arg0.method20601(local6);
		@Pc(48) Class470 local48 = new Class470();
		if (this.anInt5350 * 775061697 != arg4) {
			this.aClass109_6.method6916((byte) arg4, this.aByteArray99);
			this.anInt5350 = arg4 * -1239281855;
		}
		this.aClass109_6.method6976(local48, null, 0);
		arg0.method20601(local2);
	}

	@OriginalMember(owner = "client!sv", name = "ad", descriptor = "(Lclient!dh;IIII)V", line = 282)
	void method31187(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) Class470 local2 = arg0.method20602();
		@Pc(6) Class470 local6 = new Class470();
		local6.method29419(0.0F, 0.0F, 0.0F);
		local6.method29403(0.0F, -1.0F, 0.0F, Class464.method29281(-arg2 & 0x3FFF));
		local6.method29403(-1.0F, 0.0F, 0.0F, Class464.method29281(-arg1 & 0x3FFF));
		local6.method29403(0.0F, 0.0F, -1.0F, Class464.method29281(-arg3 & 0x3FFF));
		arg0.method20601(local6);
		@Pc(48) Class470 local48 = new Class470();
		if (this.anInt5350 * 775061697 != arg4) {
			this.aClass109_6.method6916((byte) arg4, this.aByteArray99);
			this.anInt5350 = arg4 * -1239281855;
		}
		this.aClass109_6.method6976(local48, null, 0);
		arg0.method20601(local2);
	}

	@OriginalMember(owner = "client!sv", name = "ck", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;B)V", line = 5459)
	static final void method31188(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) byte arg3) {
		arg0.anInt3951 = arg2.anIntArray519[(arg2.anInt5891 -= 1189701933) * -1497248091] * -1059281523;
		Class354.method27694(arg0, -1174743804);
	}

	@OriginalMember(owner = "client!sv", name = "acd", descriptor = "(Lclient!yf;B)V", line = 9952)
	static final void method31189(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class557.aClass297_1.method26627(-1639881512) ? 1 : 0;
	}

	@OriginalMember(owner = "client!sv", name = "aif", descriptor = "(Lclient!yf;B)V", line = 11274)
	static final void method31190(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(17) Class93_Sub1_Sub18 local17 = Class372.aClass58_2.method1094(local12, -737304293);
		if (local17.anIntArray266 == null) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
		} else {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local17.anIntArray266.length;
		}
	}

	@OriginalMember(owner = "client!sv", name = "aji", descriptor = "(Lclient!yf;S)V", line = 11457)
	static final void method31191(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		throw new RuntimeException("");
	}

	@OriginalMember(owner = "client!sv", name = "akb", descriptor = "(Lclient!yf;I)V", line = 11764)
	static final void method31192(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		if (Class159_Sub1.aClass16_15 == null) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
		} else {
			@Pc(20) Class93 local20 = Class159_Sub1.aClass16_15.method214((long) local12);
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local20 == null ? 0 : 1;
		}
	}
}
