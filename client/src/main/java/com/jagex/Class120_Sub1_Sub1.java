package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ase")
public abstract class Class120_Sub1_Sub1 extends Class120_Sub1 {

	@OriginalMember(owner = "client!ase", name = "b", descriptor = "[Lclient!akb;")
	Class80_Sub12[] aClass80_Sub12Array22;

	@OriginalMember(owner = "client!ase", name = "z", descriptor = "S")
	public short aShort126;

	@OriginalMember(owner = "client!ase", name = "p", descriptor = "S")
	public short aShort127;

	@OriginalMember(owner = "client!ase", name = "n", descriptor = "B")
	byte aByte98;

	@OriginalMember(owner = "client!ase", name = "v", descriptor = "S")
	public short aShort128;

	@OriginalMember(owner = "client!ase", name = "y", descriptor = "Z")
	public boolean aBoolean669;

	@OriginalMember(owner = "client!ase", name = "c", descriptor = "I")
	int anInt3296;

	@OriginalMember(owner = "client!ase", name = "d", descriptor = "S")
	public short aShort129;

	@OriginalMember(owner = "client!ase", name = "<init>", descriptor = "(Lclient!te;IIIIIIIIIZB)V")
	Class120_Sub1_Sub1(@OriginalArg(0) Class570 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) byte arg11) {
		this(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, (Class457) null);
	}

	@OriginalMember(owner = "client!ase", name = "<init>", descriptor = "(Lclient!te;IIIIIIIIIZBLclient!oc;)V")
	Class120_Sub1_Sub1(@OriginalArg(0) Class570 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) byte arg11, @OriginalArg(12) Class457 arg12) {
		super(arg0, arg12);
		this.anInt3296 = 0;
		this.aClass80_Sub12Array22 = new Class80_Sub12[4];
		this.aByte99 = (byte) arg1;
		this.aByte100 = (byte) arg2;
		if (arg12 != null) {
			this.method24527(arg12);
		}
		this.method24530((float) arg3, (float) arg4, (float) arg5);
		this.aShort129 = (short) arg6;
		this.aShort126 = (short) arg7;
		this.aShort127 = (short) arg8;
		this.aShort128 = (short) arg9;
		this.aBoolean669 = arg10;
		this.aByte98 = arg11;
		for (@Pc(56) int local56 = 0; local56 < 4; local56++) {
			this.aClass80_Sub12Array22[local56] = null;
		}
	}

	@OriginalMember(owner = "client!ase", name = "gj", descriptor = "(S)Z")
	@Override
	final boolean method24576(@OriginalArg(0) short arg0) {
		for (@Pc(2) int local2 = this.aShort129; local2 <= this.aShort126; local2++) {
			for (@Pc(9) int local9 = this.aShort127; local9 <= this.aShort128; local9++) {
				@Pc(27) int local27 = local2 - this.aClass570_23.anInt5241 * 1611671173 + this.aClass570_23.anInt5244 * 1989483179;
				if (local27 >= 0 && local27 < this.aClass570_23.aBooleanArrayArray20.length) {
					@Pc(50) int local50 = this.aClass570_23.anInt5244 * 1989483179 + (local9 - this.aClass570_23.anInt5253 * 1105662773);
					if (local50 >= 0 && local50 < this.aClass570_23.aBooleanArrayArray20.length && this.aClass570_23.aBooleanArrayArray20[local27][local50]) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ase", name = "bw", descriptor = "(I)V")
	void method24518(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ase", name = "gd", descriptor = "([Lclient!akb;I)I")
	@Override
	final int method24574(@OriginalArg(0) Class80_Sub12[] arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10;
		if (this.aBoolean672) {
			this.anInt3296 = 0;
			local10 = Math.max(0, this.aShort129);
			@Pc(23) int local23 = Math.min(this.aClass570_23.aLongArrayArrayArray1[this.aByte99].length - 1, this.aShort126);
			@Pc(28) int local28 = Math.max(0, this.aShort127);
			@Pc(43) int local43 = Math.min(this.aClass570_23.aLongArrayArrayArray1[this.aByte99][local10].length - 1, this.aShort128);
			@Pc(45) int local45 = local28;
			@Pc(78) int local78;
			@Pc(90) int local90;
			label129: while (local10 <= local23) {
				label126: for (local28 = local45; local28 <= local43; local28++) {
					@Pc(64) long local64 = this.aClass570_23.aLongArrayArrayArray1[this.aByte99][local10][local28];
					@Pc(66) long local66 = 0L;
					while (true) {
						label121: while (true) {
							if (local66 > 48L) {
								continue label126;
							}
							local78 = (int) (local64 >>> (int) local66 & 0xFFFFL);
							if (local78 <= 0) {
								continue label126;
							}
							@Pc(88) Class595 local88 = this.aClass570_23.aClass595Array1[local78 - 1];
							for (local90 = 0; local90 < this.anInt3296 * 584025195; local90++) {
								if (local88.aClass80_Sub12_3 == this.aClass80_Sub12Array22[local90]) {
									local66 += 16L;
									continue label121;
								}
							}
							this.aClass80_Sub12Array22[(this.anInt3296 += -2115565501) * 584025195 - 1] = local88.aClass80_Sub12_3;
							if (this.anInt3296 * 584025195 == 4) {
								break label129;
							}
							local66 += 16L;
						}
					}
				}
				local10++;
			}
			for (@Pc(147) int local147 = this.anInt3296 * 584025195; local147 < 4; local147++) {
				this.aClass80_Sub12Array22[local147] = null;
			}
			if (this.aByte98 != 0) {
				local78 = this.aShort129 - this.aClass570_23.anInt5241 * 1611671173;
				@Pc(178) int local178 = this.aShort127 - this.aClass570_23.anInt5253 * 1105662773;
				@Pc(193) int local193;
				@Pc(201) short local201;
				@Pc(188) short local188;
				@Pc(198) int local198;
				if (this.aByte98 == 1) {
					if (local178 > local78) {
						local188 = this.aShort129;
						local193 = this.aShort127 - 1;
						local198 = this.aShort129 + 1;
						local201 = this.aShort127;
					} else {
						local188 = this.aShort129;
						local193 = this.aShort127 + 1;
						local198 = this.aShort129 - 1;
						local201 = this.aShort127;
					}
				} else if (local178 > -local78) {
					local188 = this.aShort129;
					local193 = this.aShort127 - 1;
					local198 = this.aShort129 - 1;
					local201 = this.aShort127;
				} else {
					local188 = this.aShort129;
					local193 = this.aShort127 + 1;
					local198 = this.aShort129 + 1;
					local201 = this.aShort127;
				}
				label92: for (local90 = 0; local90 < this.anInt3296 * 584025195; local90++) {
					@Pc(275) long local275 = this.aClass570_23.aLongArrayArrayArray1[this.aByte99][local188][local193];
					@Pc(290) Class595 local290;
					while (local275 != 0L) {
						local290 = this.aClass570_23.aClass595Array1[(int) ((local275 & 0xFFFFL) - 1L)];
						local275 >>>= 0x10;
						if (this.aClass80_Sub12Array22[local90] == local290.aClass80_Sub12_3) {
							continue label92;
						}
					}
					local275 = this.aClass570_23.aLongArrayArrayArray1[this.aByte99][local198][local201];
					while (local275 != 0L) {
						local290 = this.aClass570_23.aClass595Array1[(int) ((local275 & 0xFFFFL) - 1L)];
						local275 >>>= 0x10;
						if (local290.aClass80_Sub12_3 == this.aClass80_Sub12Array22[local90]) {
							continue label92;
						}
					}
					for (@Pc(344) int local344 = local90; local344 < this.anInt3296 * 584025195 - 1; local344++) {
						this.aClass80_Sub12Array22[local344] = this.aClass80_Sub12Array22[local344 + 1];
					}
					this.anInt3296 -= -2115565501;
				}
			}
			this.aBoolean672 = false;
		}
		for (local10 = 0; local10 < this.anInt3296 * 584025195; local10++) {
			arg0[local10] = this.aClass80_Sub12Array22[local10];
		}
		return this.anInt3296 * 584025195;
	}

	@OriginalMember(owner = "client!ase", name = "gc", descriptor = "(Lclient!di;I)Z")
	@Override
	final boolean method24575(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		return this.aClass570_23.aClass600_1.method32067(this.aByte100, this.aShort129, this.aShort126, this.aShort127, this.aShort128, this.method24573(arg0, 254160372));
	}

	@OriginalMember(owner = "client!ase", name = "da", descriptor = "()V")
	void method24519() {
	}

	@OriginalMember(owner = "client!ase", name = "dk", descriptor = "()V")
	void method24520() {
	}

	@OriginalMember(owner = "client!ase", name = "ec", descriptor = "()V")
	void method24521() {
	}

	@OriginalMember(owner = "client!ase", name = "hn", descriptor = "()Z")
	@Override
	final boolean method24586() {
		for (@Pc(2) int local2 = this.aShort129; local2 <= this.aShort126; local2++) {
			for (@Pc(9) int local9 = this.aShort127; local9 <= this.aShort128; local9++) {
				@Pc(27) int local27 = local2 - this.aClass570_23.anInt5241 * 1611671173 + this.aClass570_23.anInt5244 * 1989483179;
				if (local27 >= 0 && local27 < this.aClass570_23.aBooleanArrayArray20.length) {
					@Pc(50) int local50 = this.aClass570_23.anInt5244 * 1989483179 + (local9 - this.aClass570_23.anInt5253 * 1105662773);
					if (local50 >= 0 && local50 < this.aClass570_23.aBooleanArrayArray20.length && this.aClass570_23.aBooleanArrayArray20[local27][local50]) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ase", name = "hp", descriptor = "(Lclient!di;)Z")
	@Override
	final boolean method24617(@OriginalArg(0) Class102 arg0) {
		return this.aClass570_23.aClass600_1.method32067(this.aByte100, this.aShort129, this.aShort126, this.aShort127, this.aShort128, this.method24573(arg0, 171913495));
	}

	@OriginalMember(owner = "client!ase", name = "hf", descriptor = "()Z")
	@Override
	final boolean method24618() {
		for (@Pc(2) int local2 = this.aShort129; local2 <= this.aShort126; local2++) {
			for (@Pc(9) int local9 = this.aShort127; local9 <= this.aShort128; local9++) {
				@Pc(27) int local27 = local2 - this.aClass570_23.anInt5241 * 1611671173 + this.aClass570_23.anInt5244 * 1989483179;
				if (local27 >= 0 && local27 < this.aClass570_23.aBooleanArrayArray20.length) {
					@Pc(50) int local50 = this.aClass570_23.anInt5244 * 1989483179 + (local9 - this.aClass570_23.anInt5253 * 1105662773);
					if (local50 >= 0 && local50 < this.aClass570_23.aBooleanArrayArray20.length && this.aClass570_23.aBooleanArrayArray20[local27][local50]) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ase", name = "ha", descriptor = "()Z")
	@Override
	final boolean method24620() {
		for (@Pc(2) int local2 = this.aShort129; local2 <= this.aShort126; local2++) {
			for (@Pc(9) int local9 = this.aShort127; local9 <= this.aShort128; local9++) {
				@Pc(27) int local27 = local2 - this.aClass570_23.anInt5241 * 1611671173 + this.aClass570_23.anInt5244 * 1989483179;
				if (local27 >= 0 && local27 < this.aClass570_23.aBooleanArrayArray20.length) {
					@Pc(50) int local50 = this.aClass570_23.anInt5244 * 1989483179 + (local9 - this.aClass570_23.anInt5253 * 1105662773);
					if (local50 >= 0 && local50 < this.aClass570_23.aBooleanArrayArray20.length && this.aClass570_23.aBooleanArrayArray20[local27][local50]) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ase", name = "gs", descriptor = "([Lclient!akb;)I")
	@Override
	final int method24623(@OriginalArg(0) Class80_Sub12[] arg0) {
		@Pc(10) int local10;
		if (this.aBoolean672) {
			this.anInt3296 = 0;
			local10 = Math.max(0, this.aShort129);
			@Pc(23) int local23 = Math.min(this.aClass570_23.aLongArrayArrayArray1[this.aByte99].length - 1, this.aShort126);
			@Pc(28) int local28 = Math.max(0, this.aShort127);
			@Pc(43) int local43 = Math.min(this.aClass570_23.aLongArrayArrayArray1[this.aByte99][local10].length - 1, this.aShort128);
			@Pc(45) int local45 = local28;
			@Pc(78) int local78;
			@Pc(90) int local90;
			label129: while (local10 <= local23) {
				label126: for (local28 = local45; local28 <= local43; local28++) {
					@Pc(64) long local64 = this.aClass570_23.aLongArrayArrayArray1[this.aByte99][local10][local28];
					@Pc(66) long local66 = 0L;
					while (true) {
						label121: while (true) {
							if (local66 > 48L) {
								continue label126;
							}
							local78 = (int) (local64 >>> (int) local66 & 0xFFFFL);
							if (local78 <= 0) {
								continue label126;
							}
							@Pc(88) Class595 local88 = this.aClass570_23.aClass595Array1[local78 - 1];
							for (local90 = 0; local90 < this.anInt3296 * 584025195; local90++) {
								if (local88.aClass80_Sub12_3 == this.aClass80_Sub12Array22[local90]) {
									local66 += 16L;
									continue label121;
								}
							}
							this.aClass80_Sub12Array22[(this.anInt3296 += -2115565501) * 584025195 - 1] = local88.aClass80_Sub12_3;
							if (this.anInt3296 * 584025195 == 4) {
								break label129;
							}
							local66 += 16L;
						}
					}
				}
				local10++;
			}
			for (@Pc(147) int local147 = this.anInt3296 * 584025195; local147 < 4; local147++) {
				this.aClass80_Sub12Array22[local147] = null;
			}
			if (this.aByte98 != 0) {
				local78 = this.aShort129 - this.aClass570_23.anInt5241 * 1611671173;
				@Pc(178) int local178 = this.aShort127 - this.aClass570_23.anInt5253 * 1105662773;
				@Pc(193) int local193;
				@Pc(201) short local201;
				@Pc(188) short local188;
				@Pc(198) int local198;
				if (this.aByte98 == 1) {
					if (local178 > local78) {
						local188 = this.aShort129;
						local193 = this.aShort127 - 1;
						local198 = this.aShort129 + 1;
						local201 = this.aShort127;
					} else {
						local188 = this.aShort129;
						local193 = this.aShort127 + 1;
						local198 = this.aShort129 - 1;
						local201 = this.aShort127;
					}
				} else if (local178 > -local78) {
					local188 = this.aShort129;
					local193 = this.aShort127 - 1;
					local198 = this.aShort129 - 1;
					local201 = this.aShort127;
				} else {
					local188 = this.aShort129;
					local193 = this.aShort127 + 1;
					local198 = this.aShort129 + 1;
					local201 = this.aShort127;
				}
				label92: for (local90 = 0; local90 < this.anInt3296 * 584025195; local90++) {
					@Pc(275) long local275 = this.aClass570_23.aLongArrayArrayArray1[this.aByte99][local188][local193];
					@Pc(290) Class595 local290;
					while (local275 != 0L) {
						local290 = this.aClass570_23.aClass595Array1[(int) ((local275 & 0xFFFFL) - 1L)];
						local275 >>>= 0x10;
						if (this.aClass80_Sub12Array22[local90] == local290.aClass80_Sub12_3) {
							continue label92;
						}
					}
					local275 = this.aClass570_23.aLongArrayArrayArray1[this.aByte99][local198][local201];
					while (local275 != 0L) {
						local290 = this.aClass570_23.aClass595Array1[(int) ((local275 & 0xFFFFL) - 1L)];
						local275 >>>= 0x10;
						if (local290.aClass80_Sub12_3 == this.aClass80_Sub12Array22[local90]) {
							continue label92;
						}
					}
					for (@Pc(344) int local344 = local90; local344 < this.anInt3296 * 584025195 - 1; local344++) {
						this.aClass80_Sub12Array22[local344] = this.aClass80_Sub12Array22[local344 + 1];
					}
					this.anInt3296 -= -2115565501;
				}
			}
			this.aBoolean672 = false;
		}
		for (local10 = 0; local10 < this.anInt3296 * 584025195; local10++) {
			arg0[local10] = this.aClass80_Sub12Array22[local10];
		}
		return this.anInt3296 * 584025195;
	}
}
