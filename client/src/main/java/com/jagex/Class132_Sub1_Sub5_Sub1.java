package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aut")
public class Class132_Sub1_Sub5_Sub1 extends Class132_Sub1_Sub5 {

	@OriginalMember(owner = "client!aut", name = "x", descriptor = "Lclient!ou;")
	static Class470 aClass470_47 = new Class470();

	@OriginalMember(owner = "client!aut", name = "h", descriptor = "I")
	public int anInt3279;

	@OriginalMember(owner = "client!aut", name = "g", descriptor = "I")
	public int anInt3280;

	@OriginalMember(owner = "client!aut", name = "as", descriptor = "I")
	int anInt3282;

	@OriginalMember(owner = "client!aut", name = "at", descriptor = "I")
	int anInt3283;

	@OriginalMember(owner = "client!aut", name = "b", descriptor = "I")
	public int anInt3286;

	@OriginalMember(owner = "client!aut", name = "ai", descriptor = "I")
	int anInt3287;

	@OriginalMember(owner = "client!aut", name = "aw", descriptor = "I")
	int anInt3288;

	@OriginalMember(owner = "client!aut", name = "j", descriptor = "I")
	public int anInt3289;

	@OriginalMember(owner = "client!aut", name = "a", descriptor = "I")
	public int anInt3278 = 2136431393;

	@OriginalMember(owner = "client!aut", name = "i", descriptor = "I")
	public int anInt3281 = -185312629;

	@OriginalMember(owner = "client!aut", name = "t", descriptor = "Lclient!ou;")
	public Class470 aClass470_45 = null;

	@OriginalMember(owner = "client!aut", name = "ae", descriptor = "Lclient!ou;")
	public Class470 aClass470_44 = null;

	@OriginalMember(owner = "client!aut", name = "ag", descriptor = "Lclient!ou;")
	public Class470 aClass470_46 = null;

	@OriginalMember(owner = "client!aut", name = "ah", descriptor = "I")
	public int anInt3284 = 0;

	@OriginalMember(owner = "client!aut", name = "al", descriptor = "I")
	int anInt3285 = 0;

	@OriginalMember(owner = "client!aut", name = "ac", descriptor = "Z")
	boolean aBoolean557 = false;

	@OriginalMember(owner = "client!aut", name = "<init>", descriptor = "(Lclient!tx;IIIII)V", line = 41)
	public Class132_Sub1_Sub5_Sub1(@OriginalArg(0) Class585 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.method24274(3, -565917397);
		this.method24212((byte) -71);
	}

	@OriginalMember(owner = "client!aut", name = "e", descriptor = "(B)V", line = 47)
	void method24212(@OriginalArg(0) byte arg0) {
		this.anInt3287 = ((int) (Math.random() * 4.0D) + 32) * 633559013;
		this.anInt3288 = ((int) (Math.random() * 2.0D) + 3) * -1127649149;
		this.anInt3282 = ((int) (Math.random() * 3.0D) + 16) * 1718684555;
		if (Class51.aClass93_Sub36_1.aClass166_Sub14_1.method15656(470258637) == 1) {
			this.anInt3283 = (int) (Math.random() * 10.0D) * 1162224971;
		} else {
			this.anInt3283 = (int) (Math.random() * 20.0D) * 1162224971;
		}
	}

	@OriginalMember(owner = "client!aut", name = "m", descriptor = "()V", line = 47)
	void method24213() {
		this.anInt3287 = ((int) (Math.random() * 4.0D) + 32) * 633559013;
		this.anInt3288 = ((int) (Math.random() * 2.0D) + 3) * -1127649149;
		this.anInt3282 = ((int) (Math.random() * 3.0D) + 16) * 1718684555;
		if (Class51.aClass93_Sub36_1.aClass166_Sub14_1.method15656(440735077) == 1) {
			this.anInt3283 = (int) (Math.random() * 10.0D) * 1162224971;
		} else {
			this.anInt3283 = (int) (Math.random() * 20.0D) * 1162224971;
		}
	}

	@OriginalMember(owner = "client!aut", name = "cf", descriptor = "()Z", line = 55)
	@Override
	boolean method24312() {
		return false;
	}

	@OriginalMember(owner = "client!aut", name = "co", descriptor = "()Z", line = 55)
	@Override
	boolean method24296() {
		return false;
	}

	@OriginalMember(owner = "client!aut", name = "bu", descriptor = "(B)Z", line = 55)
	@Override
	boolean method24285(@OriginalArg(0) byte arg0) {
		return false;
	}

	@OriginalMember(owner = "client!aut", name = "bw", descriptor = "(S)Z", line = 59)
	@Override
	boolean method24286(@OriginalArg(0) short arg0) {
		return this.aBoolean557;
	}

	@OriginalMember(owner = "client!aut", name = "cm", descriptor = "()Z", line = 59)
	@Override
	boolean method24298() {
		return this.aBoolean557;
	}

	@OriginalMember(owner = "client!aut", name = "cq", descriptor = "()Z", line = 59)
	@Override
	boolean method24299() {
		return this.aBoolean557;
	}

	@OriginalMember(owner = "client!aut", name = "cr", descriptor = "()Z", line = 59)
	@Override
	boolean method24297() {
		return this.aBoolean557;
	}

	@OriginalMember(owner = "client!aut", name = "fb", descriptor = "(Lclient!dh;)Lclient!uq;", line = 63)
	@Override
	public Class600 method24302(@OriginalArg(0) Class104 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!aut", name = "fv", descriptor = "(Lclient!dh;B)Lclient!uq;", line = 63)
	@Override
	public Class600 method24311(@OriginalArg(0) Class104 arg0, @OriginalArg(1) byte arg1) {
		return null;
	}

	@OriginalMember(owner = "client!aut", name = "fl", descriptor = "(Lclient!dh;)Lclient!uq;", line = 63)
	@Override
	public Class600 method24301(@OriginalArg(0) Class104 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!aut", name = "by", descriptor = "(B)I", line = 67)
	@Override
	public int method24303(@OriginalArg(0) byte arg0) {
		return -10;
	}

	@OriginalMember(owner = "client!aut", name = "ch", descriptor = "()I", line = 67)
	@Override
	public int method24300() {
		return -10;
	}

	@OriginalMember(owner = "client!aut", name = "fc", descriptor = "(Lclient!dh;I)Lclient!tl;", line = 71)
	@Override
	Class573 method24293(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class472 local4 = Class472.method29537(this.method24220().aClass472_61);
		@Pc(21) Class590 local21 = this.aClass585_23.method31553(this.aByte100, (int) local4.aFloat317 >> 9, (int) local4.aFloat319 >> 9, (byte) 2);
		@Pc(38) Class132_Sub1_Sub4 local38 = this.aClass585_23.method31556(this.aByte100, (int) local4.aFloat317 >> 9, (int) local4.aFloat319 >> 9, -968156135);
		@Pc(40) int local40 = 0;
		while (local21 != null) {
			if (local21.aClass132_Sub1_Sub1_1.aBoolean562 && local21.aClass132_Sub1_Sub1_1.method24303((byte) -117) < local40) {
				local40 = local21.aClass132_Sub1_Sub1_1.method24303((byte) -123);
			}
			local21 = local21.aClass590_2;
		}
		if (local38 != null && local38.aShort97 > -local40) {
			local40 = -local38.aShort97;
		}
		if (local40 != this.anInt3284 * -1357685201) {
			local4.aFloat318 += local40 - this.anInt3284 * -1357685201;
			this.method24239(local4);
			this.anInt3284 = local40 * 1157146831;
		}
		@Pc(101) Class470 local101 = arg0.method20595();
		local101.method29371();
		if (this.anInt3284 * -1357685201 == 0) {
			@Pc(111) boolean local111 = false;
			@Pc(113) boolean local113 = false;
			@Pc(115) boolean local115 = false;
			@Pc(122) Class99 local122 = this.aClass585_23.aClass99Array1[this.aByte99];
			@Pc(129) int local129 = this.anInt3285 * -1222474429 << 1;
			@Pc(136) int local136 = -local129 / 2;
			@Pc(141) int local141 = -local129 / 2;
			@Pc(155) int local155 = local122.method2473(local136 + (int) local4.aFloat317, (int) local4.aFloat319 + local141, 1359339948);
			@Pc(159) int local159 = local129 / 2;
			@Pc(164) int local164 = -local129 / 2;
			@Pc(178) int local178 = local122.method2473(local159 + (int) local4.aFloat317, local164 + (int) local4.aFloat319, 419502255);
			@Pc(183) int local183 = -local129 / 2;
			@Pc(187) int local187 = local129 / 2;
			@Pc(201) int local201 = local122.method2473(local183 + (int) local4.aFloat317, local187 + (int) local4.aFloat319, 1475156301);
			@Pc(205) int local205 = local129 / 2;
			@Pc(209) int local209 = local129 / 2;
			@Pc(223) int local223 = local122.method2473((int) local4.aFloat317 + local205, (int) local4.aFloat319 + local209, 1999730054);
			@Pc(230) int local230 = local155 < local178 ? local155 : local178;
			@Pc(237) int local237 = local201 < local223 ? local201 : local223;
			@Pc(244) int local244 = local178 < local223 ? local178 : local223;
			@Pc(251) int local251 = local155 < local201 ? local155 : local201;
			if (local129 != 0) {
				@Pc(267) int local267 = (int) (Math.atan2((double) (local230 - local237), (double) local129) * 2607.5945876176133D) & 0x3FFF;
				if (local267 != 0) {
					local101.method29403(1.0F, 0.0F, 0.0F, Class464.method29281(local267));
				}
			}
			if (local129 != 0) {
				@Pc(291) int local291 = (int) (Math.atan2((double) (local251 - local244), (double) local129) * 2607.5945876176133D) & 0x3FFF;
				if (local291 != 0) {
					local101.method29403(0.0F, 0.0F, 1.0F, Class464.method29281(-local291));
				}
			}
			@Pc(305) int local305 = local155 + local223;
			if (local201 + local178 < local305) {
				local305 = local178 + local201;
			}
			local305 = (local305 >> 1) - (int) local4.aFloat318;
			if (local305 != 0) {
				local101.method29424(0.0F, (float) local305, 0.0F);
			}
		}
		local4.method29544();
		@Pc(337) Class472 local337 = this.method24220().aClass472_61;
		local101.method29424(local337.aFloat317, local337.aFloat318 - 10.0F, local337.aFloat319);
		@Pc(351) Class573 local351 = Class125_Sub1.method9212(true, 373147274);
		this.aBoolean557 = false;
		this.anInt3285 = 0;
		@Pc(398) Class109 local398;
		if (this.anInt3281 * 836911837 != -1) {
			local398 = ((Class47) Class277.aClass32_Sub12_1.method18261(this.anInt3281 * 836911837, 1170264031)).method924(arg0, 526336, this.anInt3289 * 1614376089, null, null, this.anInt3287 * 1725763053, this.anInt3288 * -157393365, this.anInt3282 * 532661283, this.anInt3283 * 874921059, -705264709);
			if (local398 != null) {
				if (this.aClass470_46 == null) {
					aClass470_47.method29371();
				} else {
					aClass470_47.method29362(this.aClass470_46);
				}
				aClass470_47.method29427(local101);
				local398.method6976(aClass470_47, this.aClass241Array21[2], 0);
				this.aBoolean557 |= local398.method6903();
				this.anInt3285 = local398.method6900() * -1974915221;
			}
		}
		if (this.anInt3278 * -272885985 != -1) {
			local398 = ((Class47) Class277.aClass32_Sub12_1.method18261(-272885985 * this.anInt3278, 396324217)).method924(arg0, 526336, this.anInt3280 * 804455733, null, null, this.anInt3287 * 1725763053, this.anInt3288 * -157393365, this.anInt3282 * 532661283, this.anInt3283 * 874921059, -705616565);
			if (local398 != null) {
				if (this.aClass470_44 == null) {
					aClass470_47.method29371();
				} else {
					aClass470_47.method29362(this.aClass470_44);
				}
				aClass470_47.method29427(local101);
				local398.method6976(aClass470_47, this.aClass241Array21[1], 0);
				this.aBoolean557 |= local398.method6903();
				if (local398.method6900() > this.anInt3285 * -1222474429) {
					this.anInt3285 = local398.method6900() * -1974915221;
				}
			}
		}
		local398 = ((Class47) Class277.aClass32_Sub12_1.method18261(this.anInt3286 * 1294558559, -136926747)).method924(arg0, 526336, this.anInt3279 * -1221246831, null, null, this.anInt3287 * 1725763053, this.anInt3288 * -157393365, this.anInt3282 * 532661283, this.anInt3283 * 874921059, -1238190017);
		if (local398 != null) {
			if (this.aClass470_45 == null) {
				aClass470_47.method29371();
			} else {
				aClass470_47.method29362(this.aClass470_45);
			}
			aClass470_47.method29427(local101);
			local398.method6976(aClass470_47, this.aClass241Array21[0], 0);
			this.aBoolean557 |= local398.method6903();
			if (local398.method6900() > this.anInt3285 * -1222474429) {
				this.anInt3285 = local398.method6900() * -1974915221;
			}
		}
		return local351;
	}

	@OriginalMember(owner = "client!aut", name = "fo", descriptor = "(Lclient!dh;)Lclient!tl;", line = 71)
	@Override
	Class573 method24289(@OriginalArg(0) Class104 arg0) {
		@Pc(4) Class472 local4 = Class472.method29537(this.method24220().aClass472_61);
		@Pc(21) Class590 local21 = this.aClass585_23.method31553(this.aByte100, (int) local4.aFloat317 >> 9, (int) local4.aFloat319 >> 9, (byte) 2);
		@Pc(38) Class132_Sub1_Sub4 local38 = this.aClass585_23.method31556(this.aByte100, (int) local4.aFloat317 >> 9, (int) local4.aFloat319 >> 9, -968156135);
		@Pc(40) int local40 = 0;
		while (local21 != null) {
			if (local21.aClass132_Sub1_Sub1_1.aBoolean562 && local21.aClass132_Sub1_Sub1_1.method24303((byte) -42) < local40) {
				local40 = local21.aClass132_Sub1_Sub1_1.method24303((byte) 12);
			}
			local21 = local21.aClass590_2;
		}
		if (local38 != null && local38.aShort97 > -local40) {
			local40 = -local38.aShort97;
		}
		if (local40 != this.anInt3284 * -1357685201) {
			local4.aFloat318 += local40 - this.anInt3284 * -1357685201;
			this.method24239(local4);
			this.anInt3284 = local40 * 1157146831;
		}
		@Pc(101) Class470 local101 = arg0.method20595();
		local101.method29371();
		if (this.anInt3284 * -1357685201 == 0) {
			@Pc(111) boolean local111 = false;
			@Pc(113) boolean local113 = false;
			@Pc(115) boolean local115 = false;
			@Pc(122) Class99 local122 = this.aClass585_23.aClass99Array1[this.aByte99];
			@Pc(129) int local129 = this.anInt3285 * -1222474429 << 1;
			@Pc(136) int local136 = -local129 / 2;
			@Pc(141) int local141 = -local129 / 2;
			@Pc(155) int local155 = local122.method2473(local136 + (int) local4.aFloat317, (int) local4.aFloat319 + local141, 632133410);
			@Pc(159) int local159 = local129 / 2;
			@Pc(164) int local164 = -local129 / 2;
			@Pc(178) int local178 = local122.method2473(local159 + (int) local4.aFloat317, local164 + (int) local4.aFloat319, 1692238824);
			@Pc(183) int local183 = -local129 / 2;
			@Pc(187) int local187 = local129 / 2;
			@Pc(201) int local201 = local122.method2473(local183 + (int) local4.aFloat317, local187 + (int) local4.aFloat319, 1119021722);
			@Pc(205) int local205 = local129 / 2;
			@Pc(209) int local209 = local129 / 2;
			@Pc(223) int local223 = local122.method2473((int) local4.aFloat317 + local205, (int) local4.aFloat319 + local209, 550638860);
			@Pc(230) int local230 = local155 < local178 ? local155 : local178;
			@Pc(237) int local237 = local201 < local223 ? local201 : local223;
			@Pc(244) int local244 = local178 < local223 ? local178 : local223;
			@Pc(251) int local251 = local155 < local201 ? local155 : local201;
			if (local129 != 0) {
				@Pc(267) int local267 = (int) (Math.atan2((double) (local230 - local237), (double) local129) * 2607.5945876176133D) & 0x3FFF;
				if (local267 != 0) {
					local101.method29403(1.0F, 0.0F, 0.0F, Class464.method29281(local267));
				}
			}
			if (local129 != 0) {
				@Pc(291) int local291 = (int) (Math.atan2((double) (local251 - local244), (double) local129) * 2607.5945876176133D) & 0x3FFF;
				if (local291 != 0) {
					local101.method29403(0.0F, 0.0F, 1.0F, Class464.method29281(-local291));
				}
			}
			@Pc(305) int local305 = local155 + local223;
			if (local201 + local178 < local305) {
				local305 = local178 + local201;
			}
			local305 = (local305 >> 1) - (int) local4.aFloat318;
			if (local305 != 0) {
				local101.method29424(0.0F, (float) local305, 0.0F);
			}
		}
		local4.method29544();
		@Pc(337) Class472 local337 = this.method24220().aClass472_61;
		local101.method29424(local337.aFloat317, local337.aFloat318 - 10.0F, local337.aFloat319);
		@Pc(351) Class573 local351 = Class125_Sub1.method9212(true, 373147274);
		this.aBoolean557 = false;
		this.anInt3285 = 0;
		@Pc(398) Class109 local398;
		if (this.anInt3281 * 836911837 != -1) {
			local398 = ((Class47) Class277.aClass32_Sub12_1.method18261(this.anInt3281 * 836911837, -366192300)).method924(arg0, 526336, this.anInt3289 * 1614376089, null, null, this.anInt3287 * 1725763053, this.anInt3288 * -157393365, this.anInt3282 * 532661283, this.anInt3283 * 874921059, 1448288678);
			if (local398 != null) {
				if (this.aClass470_46 == null) {
					aClass470_47.method29371();
				} else {
					aClass470_47.method29362(this.aClass470_46);
				}
				aClass470_47.method29427(local101);
				local398.method6976(aClass470_47, this.aClass241Array21[2], 0);
				this.aBoolean557 |= local398.method6903();
				this.anInt3285 = local398.method6900() * -1974915221;
			}
		}
		if (this.anInt3278 * -272885985 != -1) {
			local398 = ((Class47) Class277.aClass32_Sub12_1.method18261(-272885985 * this.anInt3278, 55101588)).method924(arg0, 526336, this.anInt3280 * 804455733, null, null, this.anInt3287 * 1725763053, this.anInt3288 * -157393365, this.anInt3282 * 532661283, this.anInt3283 * 874921059, -651245221);
			if (local398 != null) {
				if (this.aClass470_44 == null) {
					aClass470_47.method29371();
				} else {
					aClass470_47.method29362(this.aClass470_44);
				}
				aClass470_47.method29427(local101);
				local398.method6976(aClass470_47, this.aClass241Array21[1], 0);
				this.aBoolean557 |= local398.method6903();
				if (local398.method6900() > this.anInt3285 * -1222474429) {
					this.anInt3285 = local398.method6900() * -1974915221;
				}
			}
		}
		local398 = ((Class47) Class277.aClass32_Sub12_1.method18261(this.anInt3286 * 1294558559, 1397968311)).method924(arg0, 526336, this.anInt3279 * -1221246831, null, null, this.anInt3287 * 1725763053, this.anInt3288 * -157393365, this.anInt3282 * 532661283, this.anInt3283 * 874921059, 926424440);
		if (local398 != null) {
			if (this.aClass470_45 == null) {
				aClass470_47.method29371();
			} else {
				aClass470_47.method29362(this.aClass470_45);
			}
			aClass470_47.method29427(local101);
			local398.method6976(aClass470_47, this.aClass241Array21[0], 0);
			this.aBoolean557 |= local398.method6903();
			if (local398.method6900() > this.anInt3285 * -1222474429) {
				this.anInt3285 = local398.method6900() * -1974915221;
			}
		}
		return local351;
	}

	@OriginalMember(owner = "client!aut", name = "k", descriptor = "()Lclient!ou;", line = 170)
	public static Class470 method24214() {
		@Pc(3) Class470 local3 = new Class470();
		local3.method29385(0.0F, 1.0F, 0.0F, (float) (Math.random() * 3.141592653589793D * 2.0D));
		@Pc(23) float local23 = (float) (Math.random() * 0.5D + 0.5D) * 256.0F;
		local3.method29424(local23 - 128.0F, 0.0F, 0.0F);
		local3.method29403(0.0F, 1.0F, 0.0F, (float) (Math.random() * 3.141592653589793D * 2.0D));
		return local3;
	}

	@OriginalMember(owner = "client!aut", name = "w", descriptor = "()Lclient!ou;", line = 170)
	public static Class470 method24215() {
		@Pc(3) Class470 local3 = new Class470();
		local3.method29385(0.0F, 1.0F, 0.0F, (float) (Math.random() * 3.141592653589793D * 2.0D));
		@Pc(23) float local23 = (float) (Math.random() * 0.5D + 0.5D) * 256.0F;
		local3.method29424(local23 - 128.0F, 0.0F, 0.0F);
		local3.method29403(0.0F, 1.0F, 0.0F, (float) (Math.random() * 3.141592653589793D * 2.0D));
		return local3;
	}

	@OriginalMember(owner = "client!aut", name = "f", descriptor = "()Lclient!ou;", line = 170)
	public static Class470 method24216() {
		@Pc(3) Class470 local3 = new Class470();
		local3.method29385(0.0F, 1.0F, 0.0F, (float) (Math.random() * 3.141592653589793D * 2.0D));
		@Pc(23) float local23 = (float) (Math.random() * 0.5D + 0.5D) * 256.0F;
		local3.method29424(local23 - 128.0F, 0.0F, 0.0F);
		local3.method29403(0.0F, 1.0F, 0.0F, (float) (Math.random() * 3.141592653589793D * 2.0D));
		return local3;
	}

	@OriginalMember(owner = "client!aut", name = "fw", descriptor = "(Lclient!dh;I)V", line = 178)
	@Override
	void method24290(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aut", name = "fy", descriptor = "(Lclient!dh;)V", line = 178)
	@Override
	void method24307(@OriginalArg(0) Class104 arg0) {
	}

	@OriginalMember(owner = "client!aut", name = "fe", descriptor = "(Lclient!dh;)V", line = 178)
	@Override
	void method24314(@OriginalArg(0) Class104 arg0) {
	}

	@OriginalMember(owner = "client!aut", name = "gp", descriptor = "(I)I", line = 181)
	@Override
	int method24258(@OriginalArg(0) int arg0) {
		@Pc(8) Class47 local8 = (Class47) Class277.aClass32_Sub12_1.method18261(this.anInt3286 * 1294558559, -865385996);
		@Pc(13) int local13 = local8.anInt183 * -1604068579;
		@Pc(28) Class47 local28;
		if (this.anInt3278 * -272885985 != -1) {
			local28 = (Class47) Class277.aClass32_Sub12_1.method18261(this.anInt3278 * -272885985, -1977039899);
			if (local28.anInt183 * -1604068579 > local13) {
				local13 = local28.anInt183 * -1604068579;
			}
		}
		if (this.anInt3281 * 836911837 != -1) {
			local28 = (Class47) Class277.aClass32_Sub12_1.method18261(this.anInt3281 * 836911837, 881495503);
			if (local28.anInt183 * -1604068579 > local13) {
				local13 = local28.anInt183 * -1604068579;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!aut", name = "gr", descriptor = "()I", line = 181)
	@Override
	int method24257() {
		@Pc(8) Class47 local8 = (Class47) Class277.aClass32_Sub12_1.method18261(this.anInt3286 * 1294558559, -512873638);
		@Pc(13) int local13 = local8.anInt183 * -1604068579;
		@Pc(28) Class47 local28;
		if (this.anInt3278 * -272885985 != -1) {
			local28 = (Class47) Class277.aClass32_Sub12_1.method18261(this.anInt3278 * -272885985, -1966000368);
			if (local28.anInt183 * -1604068579 > local13) {
				local13 = local28.anInt183 * -1604068579;
			}
		}
		if (this.anInt3281 * 836911837 != -1) {
			local28 = (Class47) Class277.aClass32_Sub12_1.method18261(this.anInt3281 * 836911837, 1999754762);
			if (local28.anInt183 * -1604068579 > local13) {
				local13 = local28.anInt183 * -1604068579;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!aut", name = "fa", descriptor = "(Lclient!dh;IIB)Z", line = 195)
	@Override
	boolean method24283(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(2) Class470 local2 = arg0.method20595();
		local2.method29363(this.method24220());
		local2.method29424(0.0F, -10.0F, 0.0F);
		@Pc(34) Class109 local34 = ((Class47) Class277.aClass32_Sub12_1.method18261(this.anInt3286 * 1294558559, 2116876011)).method924(arg0, 131072, this.anInt3279 * -1221246831, null, null, 0, 0, 0, 0, 2124484040);
		if (local34 != null) {
			if (this.aClass470_45 == null) {
				aClass470_47.method29371();
			} else {
				aClass470_47.method29362(this.aClass470_45);
			}
			aClass470_47.method29427(local2);
			if (local34.method6897(arg1, arg2, aClass470_47, true, 0)) {
				return true;
			}
		}
		if (this.anInt3278 * -272885985 != -1) {
			local34 = ((Class47) Class277.aClass32_Sub12_1.method18261(-272885985 * this.anInt3278, 1816374062)).method924(arg0, 131072, this.anInt3280 * 804455733, null, null, 0, 0, 0, 0, -58235352);
			if (local34 != null) {
				if (this.aClass470_44 == null) {
					aClass470_47.method29371();
				} else {
					aClass470_47.method29362(this.aClass470_44);
				}
				aClass470_47.method29427(local2);
				if (local34.method6897(arg1, arg2, aClass470_47, true, 0)) {
					return true;
				}
			}
		}
		if (this.anInt3281 * 836911837 != -1) {
			local34 = ((Class47) Class277.aClass32_Sub12_1.method18261(this.anInt3281 * 836911837, -1599497737)).method924(arg0, 131072, this.anInt3289 * 1614376089, null, null, 0, 0, 0, 0, 906819999);
			if (local34 != null) {
				if (this.aClass470_46 == null) {
					aClass470_47.method29371();
				} else {
					aClass470_47.method29362(this.aClass470_46);
				}
				aClass470_47.method29427(local2);
				if (local34.method6897(arg1, arg2, aClass470_47, true, 0)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!aut", name = "fk", descriptor = "(Lclient!dh;II)Z", line = 195)
	@Override
	boolean method24304(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class470 local2 = arg0.method20595();
		local2.method29363(this.method24220());
		local2.method29424(0.0F, -10.0F, 0.0F);
		@Pc(34) Class109 local34 = ((Class47) Class277.aClass32_Sub12_1.method18261(this.anInt3286 * 1294558559, 1196393061)).method924(arg0, 131072, this.anInt3279 * -1221246831, null, null, 0, 0, 0, 0, 993779833);
		if (local34 != null) {
			if (this.aClass470_45 == null) {
				aClass470_47.method29371();
			} else {
				aClass470_47.method29362(this.aClass470_45);
			}
			aClass470_47.method29427(local2);
			if (local34.method6897(arg1, arg2, aClass470_47, true, 0)) {
				return true;
			}
		}
		if (this.anInt3278 * -272885985 != -1) {
			local34 = ((Class47) Class277.aClass32_Sub12_1.method18261(this.anInt3278 * -272885985, 1570227724)).method924(arg0, 131072, this.anInt3280 * 804455733, null, null, 0, 0, 0, 0, 1345385762);
			if (local34 != null) {
				if (this.aClass470_44 == null) {
					aClass470_47.method29371();
				} else {
					aClass470_47.method29362(this.aClass470_44);
				}
				aClass470_47.method29427(local2);
				if (local34.method6897(arg1, arg2, aClass470_47, true, 0)) {
					return true;
				}
			}
		}
		if (this.anInt3281 * 836911837 != -1) {
			local34 = ((Class47) Class277.aClass32_Sub12_1.method18261(this.anInt3281 * 836911837, -448973897)).method924(arg0, 131072, this.anInt3289 * 1614376089, null, null, 0, 0, 0, 0, 563628761);
			if (local34 != null) {
				if (this.aClass470_46 == null) {
					aClass470_47.method29371();
				} else {
					aClass470_47.method29362(this.aClass470_46);
				}
				aClass470_47.method29427(local2);
				if (local34.method6897(arg1, arg2, aClass470_47, true, 0)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!aut", name = "cy", descriptor = "()I", line = 227)
	@Override
	public int method24273() {
		return this.anInt3284 * -1357685201 - this.method24303((byte) -81);
	}

	@OriginalMember(owner = "client!aut", name = "bo", descriptor = "(I)I", line = 227)
	@Override
	public int method24270(@OriginalArg(0) int arg0) {
		return this.anInt3284 * -1357685201 - this.method24303((byte) -62);
	}

	@OriginalMember(owner = "client!aut", name = "cb", descriptor = "()I", line = 227)
	@Override
	public int method24271() {
		return this.anInt3284 * -1357685201 - this.method24303((byte) -13);
	}

	@OriginalMember(owner = "client!aut", name = "cs", descriptor = "()I", line = 227)
	@Override
	public int method24272() {
		return this.anInt3284 * -1357685201 - this.method24303((byte) 6);
	}
}
