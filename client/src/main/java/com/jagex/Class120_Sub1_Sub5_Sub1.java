package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!auu")
public final class Class120_Sub1_Sub5_Sub1 extends Class120_Sub1_Sub5 {

	@OriginalMember(owner = "client!auu", name = "d", descriptor = "Lclient!ov;")
	static Class471 aClass471_48 = new Class471();

	@OriginalMember(owner = "client!auu", name = "c", descriptor = "I")
	public int anInt3298;

	@OriginalMember(owner = "client!auu", name = "p", descriptor = "I")
	public int anInt3299;

	@OriginalMember(owner = "client!auu", name = "z", descriptor = "I")
	public int anInt3301;

	@OriginalMember(owner = "client!auu", name = "y", descriptor = "I")
	public int anInt3305;

	@OriginalMember(owner = "client!auu", name = "aj", descriptor = "I")
	int anInt3306;

	@OriginalMember(owner = "client!auu", name = "ac", descriptor = "I")
	int anInt3307;

	@OriginalMember(owner = "client!auu", name = "ag", descriptor = "I")
	int anInt3308;

	@OriginalMember(owner = "client!auu", name = "ab", descriptor = "I")
	int anInt3309;

	@OriginalMember(owner = "client!auu", name = "v", descriptor = "I")
	public int anInt3300 = 111439613;

	@OriginalMember(owner = "client!auu", name = "n", descriptor = "I")
	public int anInt3302 = -1094121023;

	@OriginalMember(owner = "client!auu", name = "b", descriptor = "Lclient!ov;")
	public Class471 aClass471_49 = null;

	@OriginalMember(owner = "client!auu", name = "ax", descriptor = "Lclient!ov;")
	public Class471 aClass471_50 = null;

	@OriginalMember(owner = "client!auu", name = "ay", descriptor = "Lclient!ov;")
	public Class471 aClass471_47 = null;

	@OriginalMember(owner = "client!auu", name = "ai", descriptor = "I")
	public int anInt3304 = 0;

	@OriginalMember(owner = "client!auu", name = "aq", descriptor = "I")
	int anInt3303 = 0;

	@OriginalMember(owner = "client!auu", name = "ao", descriptor = "Z")
	boolean aBoolean674 = false;

	@OriginalMember(owner = "client!auu", name = "l", descriptor = "()Lclient!ov;")
	public static Class471 method24628() {
		@Pc(3) Class471 local3 = new Class471();
		local3.method29769(0.0F, 1.0F, 0.0F, (float) (Math.random() * 3.141592653589793D * 2.0D));
		@Pc(23) float local23 = (float) (Math.random() * 0.5D + 0.5D) * 256.0F;
		local3.method29783(local23 - 128.0F, 0.0F, 0.0F);
		local3.method29774(0.0F, 1.0F, 0.0F, (float) (Math.random() * 3.141592653589793D * 2.0D));
		return local3;
	}

	@OriginalMember(owner = "client!auu", name = "u", descriptor = "()Lclient!ov;")
	public static Class471 method24629() {
		@Pc(3) Class471 local3 = new Class471();
		local3.method29769(0.0F, 1.0F, 0.0F, (float) (Math.random() * 3.141592653589793D * 2.0D));
		@Pc(23) float local23 = (float) (Math.random() * 0.5D + 0.5D) * 256.0F;
		local3.method29783(local23 - 128.0F, 0.0F, 0.0F);
		local3.method29774(0.0F, 1.0F, 0.0F, (float) (Math.random() * 3.141592653589793D * 2.0D));
		return local3;
	}

	@OriginalMember(owner = "client!auu", name = "g", descriptor = "()Lclient!ov;")
	public static Class471 method24630() {
		@Pc(3) Class471 local3 = new Class471();
		local3.method29769(0.0F, 1.0F, 0.0F, (float) (Math.random() * 3.141592653589793D * 2.0D));
		@Pc(23) float local23 = (float) (Math.random() * 0.5D + 0.5D) * 256.0F;
		local3.method29783(local23 - 128.0F, 0.0F, 0.0F);
		local3.method29774(0.0F, 1.0F, 0.0F, (float) (Math.random() * 3.141592653589793D * 2.0D));
		return local3;
	}

	@OriginalMember(owner = "client!auu", name = "<init>", descriptor = "(Lclient!te;IIIII)V")
	public Class120_Sub1_Sub5_Sub1(@OriginalArg(0) Class570 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.method24581(3, (byte) 14);
		this.method24627((short) -7895);
	}

	@OriginalMember(owner = "client!auu", name = "fl", descriptor = "(Lclient!di;)Lclient!tj;")
	@Override
	Class573 method24597(@OriginalArg(0) Class102 arg0) {
		@Pc(4) Class463 local4 = Class463.method29472(this.method24552().aClass463_61);
		@Pc(21) Class594 local21 = this.aClass570_23.method31575(this.aByte99, (int) local4.aFloat297 >> 9, (int) local4.aFloat296 >> 9, 35632);
		@Pc(38) Class120_Sub1_Sub4 local38 = this.aClass570_23.method31558(this.aByte99, (int) local4.aFloat297 >> 9, (int) local4.aFloat296 >> 9, 39452766);
		@Pc(40) int local40 = 0;
		while (local21 != null) {
			if (local21.aClass120_Sub1_Sub1_1.aBoolean669 && local21.aClass120_Sub1_Sub1_1.method24578(1724868257) < local40) {
				local40 = local21.aClass120_Sub1_Sub1_1.method24578(935740927);
			}
			local21 = local21.aClass594_3;
		}
		if (local38 != null && local38.aShort48 > -local40) {
			local40 = -local38.aShort48;
		}
		if (this.anInt3304 * 801210349 != local40) {
			local4.aFloat295 += local40 - this.anInt3304 * 801210349;
			this.method24542(local4);
			this.anInt3304 = local40 * 797881829;
		}
		@Pc(102) Class471 local102 = arg0.method20813();
		local102.method29763();
		if (this.anInt3304 * 801210349 == 0) {
			@Pc(112) boolean local112 = false;
			@Pc(114) boolean local114 = false;
			@Pc(116) boolean local116 = false;
			@Pc(123) Class100 local123 = this.aClass570_23.aClass100Array1[this.aByte100];
			@Pc(130) int local130 = this.anInt3303 * -935341873 << 1;
			@Pc(137) int local137 = -local130 / 2;
			@Pc(142) int local142 = -local130 / 2;
			@Pc(156) int local156 = local123.method2915(local137 + (int) local4.aFloat297, local142 + (int) local4.aFloat296, (byte) -84);
			@Pc(160) int local160 = local130 / 2;
			@Pc(165) int local165 = -local130 / 2;
			@Pc(179) int local179 = local123.method2915((int) local4.aFloat297 + local160, (int) local4.aFloat296 + local165, (byte) -2);
			@Pc(184) int local184 = -local130 / 2;
			@Pc(188) int local188 = local130 / 2;
			@Pc(202) int local202 = local123.method2915((int) local4.aFloat297 + local184, (int) local4.aFloat296 + local188, (byte) -38);
			@Pc(206) int local206 = local130 / 2;
			@Pc(210) int local210 = local130 / 2;
			@Pc(224) int local224 = local123.method2915(local206 + (int) local4.aFloat297, (int) local4.aFloat296 + local210, (byte) -22);
			@Pc(231) int local231 = local156 < local179 ? local156 : local179;
			@Pc(238) int local238 = local202 < local224 ? local202 : local224;
			@Pc(245) int local245 = local179 < local224 ? local179 : local224;
			@Pc(252) int local252 = local156 < local202 ? local156 : local202;
			if (local130 != 0) {
				@Pc(267) int local267 = (int) (Math.atan2((double) (local231 - local238), (double) local130) * 2607.5945876176133D) & 0x3FFF;
				if (local267 != 0) {
					local102.method29774(1.0F, 0.0F, 0.0F, Class467.method29716(local267));
				}
			}
			if (local130 != 0) {
				@Pc(292) int local292 = (int) (Math.atan2((double) (local252 - local245), (double) local130) * 2607.5945876176133D) & 0x3FFF;
				if (local292 != 0) {
					local102.method29774(0.0F, 0.0F, 1.0F, Class467.method29716(-local292));
				}
			}
			@Pc(307) int local307 = local224 + local156;
			if (local202 + local179 < local307) {
				local307 = local202 + local179;
			}
			local307 = (local307 >> 1) - (int) local4.aFloat295;
			if (local307 != 0) {
				local102.method29783(0.0F, (float) local307, 0.0F);
			}
		}
		local4.method29557();
		@Pc(338) Class463 local338 = this.method24552().aClass463_61;
		local102.method29783(local338.aFloat297, local338.aFloat295 - 10.0F, local338.aFloat296);
		@Pc(352) Class573 local352 = Class454.method29307(true, 1034419199);
		this.aBoolean674 = false;
		this.anInt3303 = 0;
		@Pc(399) Class105 local399;
		if (this.anInt3302 * -1664747073 != -1) {
			local399 = ((Class43) Class25.aClass41_Sub9_1.method18054(this.anInt3302 * -1664747073, 1341292776)).method881(arg0, 526336, this.anInt3298 * 271483591, null, null, this.anInt3306 * 1681114677, this.anInt3307 * -1343681129, this.anInt3308 * -1599343761, this.anInt3309 * 266198487, -1778431586);
			if (local399 != null) {
				if (this.aClass471_47 == null) {
					aClass471_48.method29763();
				} else {
					aClass471_48.method29760(this.aClass471_47);
				}
				aClass471_48.method29766(local102);
				local399.method7359(aClass471_48, this.aClass246Array21[2], 0);
				this.aBoolean674 |= local399.method7395();
				this.anInt3303 = local399.method7501() * 1127429679;
			}
		}
		if (this.anInt3300 * 994861483 != -1) {
			local399 = ((Class43) Class25.aClass41_Sub9_1.method18054(this.anInt3300 * 994861483, 5862000)).method881(arg0, 526336, this.anInt3305 * 451722231, null, null, this.anInt3306 * 1681114677, this.anInt3307 * -1343681129, this.anInt3308 * -1599343761, this.anInt3309 * 266198487, 375685206);
			if (local399 != null) {
				if (this.aClass471_50 == null) {
					aClass471_48.method29763();
				} else {
					aClass471_48.method29760(this.aClass471_50);
				}
				aClass471_48.method29766(local102);
				local399.method7359(aClass471_48, this.aClass246Array21[1], 0);
				this.aBoolean674 |= local399.method7395();
				if (local399.method7501() > this.anInt3303 * -935341873) {
					this.anInt3303 = local399.method7501() * 1127429679;
				}
			}
		}
		local399 = ((Class43) Class25.aClass41_Sub9_1.method18054(this.anInt3301 * -1131018903, -1692867403)).method881(arg0, 526336, this.anInt3299 * 1777147609, null, null, this.anInt3306 * 1681114677, this.anInt3307 * -1343681129, this.anInt3308 * -1599343761, this.anInt3309 * 266198487, 460591587);
		if (local399 != null) {
			if (this.aClass471_49 == null) {
				aClass471_48.method29763();
			} else {
				aClass471_48.method29760(this.aClass471_49);
			}
			aClass471_48.method29766(local102);
			local399.method7359(aClass471_48, this.aClass246Array21[0], 0);
			this.aBoolean674 |= local399.method7395();
			if (local399.method7501() > this.anInt3303 * -935341873) {
				this.anInt3303 = local399.method7501() * 1127429679;
			}
		}
		return local352;
	}

	@OriginalMember(owner = "client!auu", name = "gx", descriptor = "()I")
	@Override
	int method24614() {
		@Pc(8) Class43 local8 = (Class43) Class25.aClass41_Sub9_1.method18054(this.anInt3301 * -1131018903, -1080189025);
		@Pc(13) int local13 = local8.anInt168 * 1614508089;
		@Pc(28) Class43 local28;
		if (this.anInt3300 * 994861483 != -1) {
			local28 = (Class43) Class25.aClass41_Sub9_1.method18054(this.anInt3300 * 994861483, -468617325);
			if (local28.anInt168 * 1614508089 > local13) {
				local13 = local28.anInt168 * 1614508089;
			}
		}
		if (this.anInt3302 * -1664747073 != -1) {
			local28 = (Class43) Class25.aClass41_Sub9_1.method18054(this.anInt3302 * -1664747073, -393156784);
			if (local28.anInt168 * 1614508089 > local13) {
				local13 = local28.anInt168 * 1614508089;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!auu", name = "bo", descriptor = "(I)Z")
	@Override
	boolean method24567(@OriginalArg(0) int arg0) {
		return false;
	}

	@OriginalMember(owner = "client!auu", name = "fz", descriptor = "(Lclient!di;I)Lclient!uc;")
	@Override
	public Class589 method24573(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!auu", name = "fh", descriptor = "(Lclient!di;B)V")
	@Override
	void method24572(@OriginalArg(0) Class102 arg0, @OriginalArg(1) byte arg1) {
	}

	@OriginalMember(owner = "client!auu", name = "fc", descriptor = "(Lclient!di;)Lclient!tj;")
	@Override
	Class573 method24592(@OriginalArg(0) Class102 arg0) {
		@Pc(4) Class463 local4 = Class463.method29472(this.method24552().aClass463_61);
		@Pc(21) Class594 local21 = this.aClass570_23.method31575(this.aByte99, (int) local4.aFloat297 >> 9, (int) local4.aFloat296 >> 9, 35632);
		@Pc(38) Class120_Sub1_Sub4 local38 = this.aClass570_23.method31558(this.aByte99, (int) local4.aFloat297 >> 9, (int) local4.aFloat296 >> 9, 1338975906);
		@Pc(40) int local40 = 0;
		while (local21 != null) {
			if (local21.aClass120_Sub1_Sub1_1.aBoolean669 && local21.aClass120_Sub1_Sub1_1.method24578(615022360) < local40) {
				local40 = local21.aClass120_Sub1_Sub1_1.method24578(1955013104);
			}
			local21 = local21.aClass594_3;
		}
		if (local38 != null && local38.aShort48 > -local40) {
			local40 = -local38.aShort48;
		}
		if (this.anInt3304 * 801210349 != local40) {
			local4.aFloat295 += local40 - this.anInt3304 * 801210349;
			this.method24542(local4);
			this.anInt3304 = local40 * 797881829;
		}
		@Pc(102) Class471 local102 = arg0.method20813();
		local102.method29763();
		if (this.anInt3304 * 801210349 == 0) {
			@Pc(112) boolean local112 = false;
			@Pc(114) boolean local114 = false;
			@Pc(116) boolean local116 = false;
			@Pc(123) Class100 local123 = this.aClass570_23.aClass100Array1[this.aByte100];
			@Pc(130) int local130 = this.anInt3303 * -935341873 << 1;
			@Pc(137) int local137 = -local130 / 2;
			@Pc(142) int local142 = -local130 / 2;
			@Pc(156) int local156 = local123.method2915(local137 + (int) local4.aFloat297, local142 + (int) local4.aFloat296, (byte) -88);
			@Pc(160) int local160 = local130 / 2;
			@Pc(165) int local165 = -local130 / 2;
			@Pc(179) int local179 = local123.method2915((int) local4.aFloat297 + local160, (int) local4.aFloat296 + local165, (byte) -67);
			@Pc(184) int local184 = -local130 / 2;
			@Pc(188) int local188 = local130 / 2;
			@Pc(202) int local202 = local123.method2915((int) local4.aFloat297 + local184, (int) local4.aFloat296 + local188, (byte) -61);
			@Pc(206) int local206 = local130 / 2;
			@Pc(210) int local210 = local130 / 2;
			@Pc(224) int local224 = local123.method2915(local206 + (int) local4.aFloat297, (int) local4.aFloat296 + local210, (byte) -98);
			@Pc(231) int local231 = local156 < local179 ? local156 : local179;
			@Pc(238) int local238 = local202 < local224 ? local202 : local224;
			@Pc(245) int local245 = local179 < local224 ? local179 : local224;
			@Pc(252) int local252 = local156 < local202 ? local156 : local202;
			if (local130 != 0) {
				@Pc(267) int local267 = (int) (Math.atan2((double) (local231 - local238), (double) local130) * 2607.5945876176133D) & 0x3FFF;
				if (local267 != 0) {
					local102.method29774(1.0F, 0.0F, 0.0F, Class467.method29716(local267));
				}
			}
			if (local130 != 0) {
				@Pc(292) int local292 = (int) (Math.atan2((double) (local252 - local245), (double) local130) * 2607.5945876176133D) & 0x3FFF;
				if (local292 != 0) {
					local102.method29774(0.0F, 0.0F, 1.0F, Class467.method29716(-local292));
				}
			}
			@Pc(307) int local307 = local224 + local156;
			if (local202 + local179 < local307) {
				local307 = local202 + local179;
			}
			local307 = (local307 >> 1) - (int) local4.aFloat295;
			if (local307 != 0) {
				local102.method29783(0.0F, (float) local307, 0.0F);
			}
		}
		local4.method29557();
		@Pc(338) Class463 local338 = this.method24552().aClass463_61;
		local102.method29783(local338.aFloat297, local338.aFloat295 - 10.0F, local338.aFloat296);
		@Pc(352) Class573 local352 = Class454.method29307(true, 68870766);
		this.aBoolean674 = false;
		this.anInt3303 = 0;
		@Pc(399) Class105 local399;
		if (this.anInt3302 * -1664747073 != -1) {
			local399 = ((Class43) Class25.aClass41_Sub9_1.method18054(this.anInt3302 * -1664747073, 1227647817)).method881(arg0, 526336, this.anInt3298 * 271483591, null, null, this.anInt3306 * 1681114677, this.anInt3307 * -1343681129, this.anInt3308 * -1599343761, this.anInt3309 * 266198487, 2007591646);
			if (local399 != null) {
				if (this.aClass471_47 == null) {
					aClass471_48.method29763();
				} else {
					aClass471_48.method29760(this.aClass471_47);
				}
				aClass471_48.method29766(local102);
				local399.method7359(aClass471_48, this.aClass246Array21[2], 0);
				this.aBoolean674 |= local399.method7395();
				this.anInt3303 = local399.method7501() * 1127429679;
			}
		}
		if (this.anInt3300 * 994861483 != -1) {
			local399 = ((Class43) Class25.aClass41_Sub9_1.method18054(this.anInt3300 * 994861483, 1215185606)).method881(arg0, 526336, this.anInt3305 * 451722231, null, null, this.anInt3306 * 1681114677, this.anInt3307 * -1343681129, this.anInt3308 * -1599343761, this.anInt3309 * 266198487, 820085990);
			if (local399 != null) {
				if (this.aClass471_50 == null) {
					aClass471_48.method29763();
				} else {
					aClass471_48.method29760(this.aClass471_50);
				}
				aClass471_48.method29766(local102);
				local399.method7359(aClass471_48, this.aClass246Array21[1], 0);
				this.aBoolean674 |= local399.method7395();
				if (local399.method7501() > this.anInt3303 * -935341873) {
					this.anInt3303 = local399.method7501() * 1127429679;
				}
			}
		}
		local399 = ((Class43) Class25.aClass41_Sub9_1.method18054(-1131018903 * this.anInt3301, -1868315739)).method881(arg0, 526336, this.anInt3299 * 1777147609, null, null, this.anInt3306 * 1681114677, this.anInt3307 * -1343681129, this.anInt3308 * -1599343761, this.anInt3309 * 266198487, -1804048082);
		if (local399 != null) {
			if (this.aClass471_49 == null) {
				aClass471_48.method29763();
			} else {
				aClass471_48.method29760(this.aClass471_49);
			}
			aClass471_48.method29766(local102);
			local399.method7359(aClass471_48, this.aClass246Array21[0], 0);
			this.aBoolean674 |= local399.method7395();
			if (local399.method7501() > this.anInt3303 * -935341873) {
				this.anInt3303 = local399.method7501() * 1127429679;
			}
		}
		return local352;
	}

	@OriginalMember(owner = "client!auu", name = "cw", descriptor = "()I")
	@Override
	public int method24591() {
		return this.anInt3304 * 801210349 - this.method24578(1589029243);
	}

	@OriginalMember(owner = "client!auu", name = "ga", descriptor = "(I)I")
	@Override
	int method24613(@OriginalArg(0) int arg0) {
		@Pc(8) Class43 local8 = (Class43) Class25.aClass41_Sub9_1.method18054(this.anInt3301 * -1131018903, -26260880);
		@Pc(13) int local13 = local8.anInt168 * 1614508089;
		@Pc(28) Class43 local28;
		if (this.anInt3300 * 994861483 != -1) {
			local28 = (Class43) Class25.aClass41_Sub9_1.method18054(this.anInt3300 * 994861483, 880894597);
			if (local28.anInt168 * 1614508089 > local13) {
				local13 = local28.anInt168 * 1614508089;
			}
		}
		if (this.anInt3302 * -1664747073 != -1) {
			local28 = (Class43) Class25.aClass41_Sub9_1.method18054(this.anInt3302 * -1664747073, -135725730);
			if (local28.anInt168 * 1614508089 > local13) {
				local13 = local28.anInt168 * 1614508089;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!auu", name = "fw", descriptor = "(Lclient!di;III)Z")
	@Override
	boolean method24583(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class471 local2 = arg0.method20813();
		local2.method29761(this.method24552());
		local2.method29783(0.0F, -10.0F, 0.0F);
		@Pc(34) Class105 local34 = ((Class43) Class25.aClass41_Sub9_1.method18054(this.anInt3301 * -1131018903, -2070328627)).method881(arg0, 131072, this.anInt3299 * 1777147609, null, null, 0, 0, 0, 0, 674496806);
		if (local34 != null) {
			if (this.aClass471_49 == null) {
				aClass471_48.method29763();
			} else {
				aClass471_48.method29760(this.aClass471_49);
			}
			aClass471_48.method29766(local2);
			if (local34.method7360(arg1, arg2, aClass471_48, true, 0)) {
				return true;
			}
		}
		if (this.anInt3300 * 994861483 != -1) {
			local34 = ((Class43) Class25.aClass41_Sub9_1.method18054(this.anInt3300 * 994861483, -1823290845)).method881(arg0, 131072, this.anInt3305 * 451722231, null, null, 0, 0, 0, 0, 1479306340);
			if (local34 != null) {
				if (this.aClass471_50 == null) {
					aClass471_48.method29763();
				} else {
					aClass471_48.method29760(this.aClass471_50);
				}
				aClass471_48.method29766(local2);
				if (local34.method7360(arg1, arg2, aClass471_48, true, 0)) {
					return true;
				}
			}
		}
		if (this.anInt3302 * -1664747073 != -1) {
			local34 = ((Class43) Class25.aClass41_Sub9_1.method18054(this.anInt3302 * -1664747073, 1445768110)).method881(arg0, 131072, this.anInt3298 * 271483591, null, null, 0, 0, 0, 0, 1016948755);
			if (local34 != null) {
				if (this.aClass471_47 == null) {
					aClass471_48.method29763();
				} else {
					aClass471_48.method29760(this.aClass471_47);
				}
				aClass471_48.method29766(local2);
				if (local34.method7360(arg1, arg2, aClass471_48, true, 0)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!auu", name = "bf", descriptor = "(I)I")
	@Override
	public int method24601(@OriginalArg(0) int arg0) {
		return this.anInt3304 * 801210349 - this.method24578(645131057);
	}

	@OriginalMember(owner = "client!auu", name = "ck", descriptor = "()Z")
	@Override
	boolean method24595() {
		return false;
	}

	@OriginalMember(owner = "client!auu", name = "ca", descriptor = "()Z")
	@Override
	boolean method24616() {
		return this.aBoolean674;
	}

	@OriginalMember(owner = "client!auu", name = "cr", descriptor = "()Z")
	@Override
	boolean method24584() {
		return this.aBoolean674;
	}

	@OriginalMember(owner = "client!auu", name = "ci", descriptor = "()I")
	@Override
	public int method24585() {
		return -10;
	}

	@OriginalMember(owner = "client!auu", name = "cm", descriptor = "()I")
	@Override
	public int method24622() {
		return -10;
	}

	@OriginalMember(owner = "client!auu", name = "cp", descriptor = "()I")
	@Override
	public int method24587() {
		return -10;
	}

	@OriginalMember(owner = "client!auu", name = "cg", descriptor = "()I")
	@Override
	public int method24588() {
		return -10;
	}

	@OriginalMember(owner = "client!auu", name = "fd", descriptor = "(Lclient!di;)Lclient!uc;")
	@Override
	public Class589 method24589(@OriginalArg(0) Class102 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!auu", name = "cb", descriptor = "()I")
	@Override
	public int method24577() {
		return this.anInt3304 * 801210349 - this.method24578(507687973);
	}

	@OriginalMember(owner = "client!auu", name = "ft", descriptor = "(Lclient!di;II)Z")
	@Override
	boolean method24563(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) Class471 local2 = arg0.method20813();
		local2.method29761(this.method24552());
		local2.method29783(0.0F, -10.0F, 0.0F);
		@Pc(34) Class105 local34 = ((Class43) Class25.aClass41_Sub9_1.method18054(this.anInt3301 * -1131018903, 338279188)).method881(arg0, 131072, this.anInt3299 * 1777147609, null, null, 0, 0, 0, 0, 1896118698);
		if (local34 != null) {
			if (this.aClass471_49 == null) {
				aClass471_48.method29763();
			} else {
				aClass471_48.method29760(this.aClass471_49);
			}
			aClass471_48.method29766(local2);
			if (local34.method7360(arg1, arg2, aClass471_48, true, 0)) {
				return true;
			}
		}
		if (this.anInt3300 * 994861483 != -1) {
			local34 = ((Class43) Class25.aClass41_Sub9_1.method18054(this.anInt3300 * 994861483, 1269483672)).method881(arg0, 131072, this.anInt3305 * 451722231, null, null, 0, 0, 0, 0, -175519919);
			if (local34 != null) {
				if (this.aClass471_50 == null) {
					aClass471_48.method29763();
				} else {
					aClass471_48.method29760(this.aClass471_50);
				}
				aClass471_48.method29766(local2);
				if (local34.method7360(arg1, arg2, aClass471_48, true, 0)) {
					return true;
				}
			}
		}
		if (this.anInt3302 * -1664747073 != -1) {
			local34 = ((Class43) Class25.aClass41_Sub9_1.method18054(this.anInt3302 * -1664747073, 1840930016)).method881(arg0, 131072, this.anInt3298 * 271483591, null, null, 0, 0, 0, 0, 335765640);
			if (local34 != null) {
				if (this.aClass471_47 == null) {
					aClass471_48.method29763();
				} else {
					aClass471_48.method29760(this.aClass471_47);
				}
				aClass471_48.method29766(local2);
				if (local34.method7360(arg1, arg2, aClass471_48, true, 0)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!auu", name = "t", descriptor = "(S)V")
	void method24627(@OriginalArg(0) short arg0) {
		this.anInt3306 = ((int) (Math.random() * 4.0D) + 32) * -1371939811;
		this.anInt3307 = ((int) (Math.random() * 2.0D) + 3) * 229786151;
		this.anInt3308 = ((int) (Math.random() * 3.0D) + 16) * -71906417;
		if (Class703.aClass80_Sub37_49.aClass165_Sub2_1.method15861(1423795933) == 1) {
			this.anInt3309 = (int) (Math.random() * 10.0D) * -1928239641;
		} else {
			this.anInt3309 = (int) (Math.random() * 20.0D) * -1928239641;
		}
	}

	@OriginalMember(owner = "client!auu", name = "bc", descriptor = "(I)Z")
	@Override
	boolean method24565(@OriginalArg(0) int arg0) {
		return this.aBoolean674;
	}

	@OriginalMember(owner = "client!auu", name = "fg", descriptor = "(Lclient!di;)Lclient!tj;")
	@Override
	Class573 method24594(@OriginalArg(0) Class102 arg0) {
		@Pc(4) Class463 local4 = Class463.method29472(this.method24552().aClass463_61);
		@Pc(21) Class594 local21 = this.aClass570_23.method31575(this.aByte99, (int) local4.aFloat297 >> 9, (int) local4.aFloat296 >> 9, 35632);
		@Pc(38) Class120_Sub1_Sub4 local38 = this.aClass570_23.method31558(this.aByte99, (int) local4.aFloat297 >> 9, (int) local4.aFloat296 >> 9, 474576341);
		@Pc(40) int local40 = 0;
		while (local21 != null) {
			if (local21.aClass120_Sub1_Sub1_1.aBoolean669 && local21.aClass120_Sub1_Sub1_1.method24578(1611430186) < local40) {
				local40 = local21.aClass120_Sub1_Sub1_1.method24578(1220560055);
			}
			local21 = local21.aClass594_3;
		}
		if (local38 != null && local38.aShort48 > -local40) {
			local40 = -local38.aShort48;
		}
		if (this.anInt3304 * 801210349 != local40) {
			local4.aFloat295 += local40 - this.anInt3304 * 801210349;
			this.method24542(local4);
			this.anInt3304 = local40 * 797881829;
		}
		@Pc(102) Class471 local102 = arg0.method20813();
		local102.method29763();
		if (this.anInt3304 * 801210349 == 0) {
			@Pc(112) boolean local112 = false;
			@Pc(114) boolean local114 = false;
			@Pc(116) boolean local116 = false;
			@Pc(123) Class100 local123 = this.aClass570_23.aClass100Array1[this.aByte100];
			@Pc(130) int local130 = this.anInt3303 * -935341873 << 1;
			@Pc(137) int local137 = -local130 / 2;
			@Pc(142) int local142 = -local130 / 2;
			@Pc(156) int local156 = local123.method2915(local137 + (int) local4.aFloat297, local142 + (int) local4.aFloat296, (byte) -4);
			@Pc(160) int local160 = local130 / 2;
			@Pc(165) int local165 = -local130 / 2;
			@Pc(179) int local179 = local123.method2915((int) local4.aFloat297 + local160, (int) local4.aFloat296 + local165, (byte) -90);
			@Pc(184) int local184 = -local130 / 2;
			@Pc(188) int local188 = local130 / 2;
			@Pc(202) int local202 = local123.method2915((int) local4.aFloat297 + local184, (int) local4.aFloat296 + local188, (byte) -65);
			@Pc(206) int local206 = local130 / 2;
			@Pc(210) int local210 = local130 / 2;
			@Pc(224) int local224 = local123.method2915(local206 + (int) local4.aFloat297, (int) local4.aFloat296 + local210, (byte) -85);
			@Pc(231) int local231 = local156 < local179 ? local156 : local179;
			@Pc(238) int local238 = local202 < local224 ? local202 : local224;
			@Pc(245) int local245 = local179 < local224 ? local179 : local224;
			@Pc(252) int local252 = local156 < local202 ? local156 : local202;
			if (local130 != 0) {
				@Pc(267) int local267 = (int) (Math.atan2((double) (local231 - local238), (double) local130) * 2607.5945876176133D) & 0x3FFF;
				if (local267 != 0) {
					local102.method29774(1.0F, 0.0F, 0.0F, Class467.method29716(local267));
				}
			}
			if (local130 != 0) {
				@Pc(292) int local292 = (int) (Math.atan2((double) (local252 - local245), (double) local130) * 2607.5945876176133D) & 0x3FFF;
				if (local292 != 0) {
					local102.method29774(0.0F, 0.0F, 1.0F, Class467.method29716(-local292));
				}
			}
			@Pc(307) int local307 = local224 + local156;
			if (local202 + local179 < local307) {
				local307 = local202 + local179;
			}
			local307 = (local307 >> 1) - (int) local4.aFloat295;
			if (local307 != 0) {
				local102.method29783(0.0F, (float) local307, 0.0F);
			}
		}
		local4.method29557();
		@Pc(338) Class463 local338 = this.method24552().aClass463_61;
		local102.method29783(local338.aFloat297, local338.aFloat295 - 10.0F, local338.aFloat296);
		@Pc(352) Class573 local352 = Class454.method29307(true, 1353571003);
		this.aBoolean674 = false;
		this.anInt3303 = 0;
		@Pc(399) Class105 local399;
		if (this.anInt3302 * -1664747073 != -1) {
			local399 = ((Class43) Class25.aClass41_Sub9_1.method18054(this.anInt3302 * -1664747073, 1361090642)).method881(arg0, 526336, this.anInt3298 * 271483591, null, null, this.anInt3306 * 1681114677, this.anInt3307 * -1343681129, this.anInt3308 * -1599343761, this.anInt3309 * 266198487, -309129998);
			if (local399 != null) {
				if (this.aClass471_47 == null) {
					aClass471_48.method29763();
				} else {
					aClass471_48.method29760(this.aClass471_47);
				}
				aClass471_48.method29766(local102);
				local399.method7359(aClass471_48, this.aClass246Array21[2], 0);
				this.aBoolean674 |= local399.method7395();
				this.anInt3303 = local399.method7501() * 1127429679;
			}
		}
		if (this.anInt3300 * 994861483 != -1) {
			local399 = ((Class43) Class25.aClass41_Sub9_1.method18054(this.anInt3300 * 994861483, 1449553443)).method881(arg0, 526336, this.anInt3305 * 451722231, null, null, this.anInt3306 * 1681114677, this.anInt3307 * -1343681129, this.anInt3308 * -1599343761, this.anInt3309 * 266198487, -775492312);
			if (local399 != null) {
				if (this.aClass471_50 == null) {
					aClass471_48.method29763();
				} else {
					aClass471_48.method29760(this.aClass471_50);
				}
				aClass471_48.method29766(local102);
				local399.method7359(aClass471_48, this.aClass246Array21[1], 0);
				this.aBoolean674 |= local399.method7395();
				if (local399.method7501() > this.anInt3303 * -935341873) {
					this.anInt3303 = local399.method7501() * 1127429679;
				}
			}
		}
		local399 = ((Class43) Class25.aClass41_Sub9_1.method18054(this.anInt3301 * -1131018903, 94100855)).method881(arg0, 526336, this.anInt3299 * 1777147609, null, null, this.anInt3306 * 1681114677, this.anInt3307 * -1343681129, this.anInt3308 * -1599343761, this.anInt3309 * 266198487, 1418309575);
		if (local399 != null) {
			if (this.aClass471_49 == null) {
				aClass471_48.method29763();
			} else {
				aClass471_48.method29760(this.aClass471_49);
			}
			aClass471_48.method29766(local102);
			local399.method7359(aClass471_48, this.aClass246Array21[0], 0);
			this.aBoolean674 |= local399.method7395();
			if (local399.method7501() > this.anInt3303 * -935341873) {
				this.anInt3303 = local399.method7501() * 1127429679;
			}
		}
		return local352;
	}

	@OriginalMember(owner = "client!auu", name = "gb", descriptor = "(Lclient!di;)V")
	@Override
	void method24605(@OriginalArg(0) Class102 arg0) {
	}

	@OriginalMember(owner = "client!auu", name = "gw", descriptor = "(Lclient!di;)V")
	@Override
	void method24593(@OriginalArg(0) Class102 arg0) {
	}

	@OriginalMember(owner = "client!auu", name = "gi", descriptor = "(Lclient!di;)V")
	@Override
	void method24607(@OriginalArg(0) Class102 arg0) {
	}

	@OriginalMember(owner = "client!auu", name = "gp", descriptor = "(Lclient!di;)V")
	@Override
	void method24608(@OriginalArg(0) Class102 arg0) {
	}

	@OriginalMember(owner = "client!auu", name = "fn", descriptor = "(Lclient!di;I)Lclient!tj;")
	@Override
	Class573 method24571(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class463 local4 = Class463.method29472(this.method24552().aClass463_61);
		@Pc(21) Class594 local21 = this.aClass570_23.method31575(this.aByte99, (int) local4.aFloat297 >> 9, (int) local4.aFloat296 >> 9, 35632);
		@Pc(38) Class120_Sub1_Sub4 local38 = this.aClass570_23.method31558(this.aByte99, (int) local4.aFloat297 >> 9, (int) local4.aFloat296 >> 9, 387720684);
		@Pc(40) int local40 = 0;
		while (local21 != null) {
			if (local21.aClass120_Sub1_Sub1_1.aBoolean669 && local21.aClass120_Sub1_Sub1_1.method24578(1792421560) < local40) {
				local40 = local21.aClass120_Sub1_Sub1_1.method24578(1905739123);
			}
			local21 = local21.aClass594_3;
		}
		if (local38 != null && local38.aShort48 > -local40) {
			local40 = -local38.aShort48;
		}
		if (this.anInt3304 * 801210349 != local40) {
			local4.aFloat295 += local40 - this.anInt3304 * 801210349;
			this.method24542(local4);
			this.anInt3304 = local40 * 797881829;
		}
		@Pc(102) Class471 local102 = arg0.method20813();
		local102.method29763();
		if (this.anInt3304 * 801210349 == 0) {
			@Pc(112) boolean local112 = false;
			@Pc(114) boolean local114 = false;
			@Pc(116) boolean local116 = false;
			@Pc(123) Class100 local123 = this.aClass570_23.aClass100Array1[this.aByte100];
			@Pc(130) int local130 = this.anInt3303 * -935341873 << 1;
			@Pc(137) int local137 = -local130 / 2;
			@Pc(142) int local142 = -local130 / 2;
			@Pc(156) int local156 = local123.method2915(local137 + (int) local4.aFloat297, local142 + (int) local4.aFloat296, (byte) -4);
			@Pc(160) int local160 = local130 / 2;
			@Pc(165) int local165 = -local130 / 2;
			@Pc(179) int local179 = local123.method2915((int) local4.aFloat297 + local160, (int) local4.aFloat296 + local165, (byte) -14);
			@Pc(184) int local184 = -local130 / 2;
			@Pc(188) int local188 = local130 / 2;
			@Pc(202) int local202 = local123.method2915((int) local4.aFloat297 + local184, (int) local4.aFloat296 + local188, (byte) -79);
			@Pc(206) int local206 = local130 / 2;
			@Pc(210) int local210 = local130 / 2;
			@Pc(224) int local224 = local123.method2915(local206 + (int) local4.aFloat297, (int) local4.aFloat296 + local210, (byte) -25);
			@Pc(231) int local231 = local156 < local179 ? local156 : local179;
			@Pc(238) int local238 = local202 < local224 ? local202 : local224;
			@Pc(245) int local245 = local179 < local224 ? local179 : local224;
			@Pc(252) int local252 = local156 < local202 ? local156 : local202;
			if (local130 != 0) {
				@Pc(267) int local267 = (int) (Math.atan2((double) (local231 - local238), (double) local130) * 2607.5945876176133D) & 0x3FFF;
				if (local267 != 0) {
					local102.method29774(1.0F, 0.0F, 0.0F, Class467.method29716(local267));
				}
			}
			if (local130 != 0) {
				@Pc(292) int local292 = (int) (Math.atan2((double) (local252 - local245), (double) local130) * 2607.5945876176133D) & 0x3FFF;
				if (local292 != 0) {
					local102.method29774(0.0F, 0.0F, 1.0F, Class467.method29716(-local292));
				}
			}
			@Pc(307) int local307 = local224 + local156;
			if (local202 + local179 < local307) {
				local307 = local202 + local179;
			}
			local307 = (local307 >> 1) - (int) local4.aFloat295;
			if (local307 != 0) {
				local102.method29783(0.0F, (float) local307, 0.0F);
			}
		}
		local4.method29557();
		@Pc(338) Class463 local338 = this.method24552().aClass463_61;
		local102.method29783(local338.aFloat297, local338.aFloat295 - 10.0F, local338.aFloat296);
		@Pc(352) Class573 local352 = Class454.method29307(true, 1212861059);
		this.aBoolean674 = false;
		this.anInt3303 = 0;
		@Pc(399) Class105 local399;
		if (this.anInt3302 * -1664747073 != -1) {
			local399 = ((Class43) Class25.aClass41_Sub9_1.method18054(this.anInt3302 * -1664747073, 224236811)).method881(arg0, 526336, this.anInt3298 * 271483591, null, null, this.anInt3306 * 1681114677, this.anInt3307 * -1343681129, this.anInt3308 * -1599343761, this.anInt3309 * 266198487, -1199691645);
			if (local399 != null) {
				if (this.aClass471_47 == null) {
					aClass471_48.method29763();
				} else {
					aClass471_48.method29760(this.aClass471_47);
				}
				aClass471_48.method29766(local102);
				local399.method7359(aClass471_48, this.aClass246Array21[2], 0);
				this.aBoolean674 |= local399.method7395();
				this.anInt3303 = local399.method7501() * 1127429679;
			}
		}
		if (this.anInt3300 * 994861483 != -1) {
			local399 = ((Class43) Class25.aClass41_Sub9_1.method18054(this.anInt3300 * 994861483, 1852419096)).method881(arg0, 526336, this.anInt3305 * 451722231, null, null, this.anInt3306 * 1681114677, this.anInt3307 * -1343681129, this.anInt3308 * -1599343761, this.anInt3309 * 266198487, 1746075332);
			if (local399 != null) {
				if (this.aClass471_50 == null) {
					aClass471_48.method29763();
				} else {
					aClass471_48.method29760(this.aClass471_50);
				}
				aClass471_48.method29766(local102);
				local399.method7359(aClass471_48, this.aClass246Array21[1], 0);
				this.aBoolean674 |= local399.method7395();
				if (local399.method7501() > this.anInt3303 * -935341873) {
					this.anInt3303 = local399.method7501() * 1127429679;
				}
			}
		}
		local399 = ((Class43) Class25.aClass41_Sub9_1.method18054(-1131018903 * this.anInt3301, -643033374)).method881(arg0, 526336, this.anInt3299 * 1777147609, null, null, this.anInt3306 * 1681114677, this.anInt3307 * -1343681129, this.anInt3308 * -1599343761, this.anInt3309 * 266198487, -1234534203);
		if (local399 != null) {
			if (this.aClass471_49 == null) {
				aClass471_48.method29763();
			} else {
				aClass471_48.method29760(this.aClass471_49);
			}
			aClass471_48.method29766(local102);
			local399.method7359(aClass471_48, this.aClass246Array21[0], 0);
			this.aBoolean674 |= local399.method7395();
			if (local399.method7501() > this.anInt3303 * -935341873) {
				this.anInt3303 = local399.method7501() * 1127429679;
			}
		}
		return local352;
	}

	@OriginalMember(owner = "client!auu", name = "gt", descriptor = "()I")
	@Override
	int method24609() {
		@Pc(8) Class43 local8 = (Class43) Class25.aClass41_Sub9_1.method18054(this.anInt3301 * -1131018903, -289704174);
		@Pc(13) int local13 = local8.anInt168 * 1614508089;
		@Pc(28) Class43 local28;
		if (this.anInt3300 * 994861483 != -1) {
			local28 = (Class43) Class25.aClass41_Sub9_1.method18054(this.anInt3300 * 994861483, -567413013);
			if (local28.anInt168 * 1614508089 > local13) {
				local13 = local28.anInt168 * 1614508089;
			}
		}
		if (this.anInt3302 * -1664747073 != -1) {
			local28 = (Class43) Class25.aClass41_Sub9_1.method18054(this.anInt3302 * -1664747073, -716847630);
			if (local28.anInt168 * 1614508089 > local13) {
				local13 = local28.anInt168 * 1614508089;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!auu", name = "e", descriptor = "()V")
	void method24631() {
		this.anInt3306 = ((int) (Math.random() * 4.0D) + 32) * -1371939811;
		this.anInt3307 = ((int) (Math.random() * 2.0D) + 3) * 229786151;
		this.anInt3308 = ((int) (Math.random() * 3.0D) + 16) * -71906417;
		if (Class703.aClass80_Sub37_49.aClass165_Sub2_1.method15861(1423795933) == 1) {
			this.anInt3309 = (int) (Math.random() * 10.0D) * -1928239641;
		} else {
			this.anInt3309 = (int) (Math.random() * 20.0D) * -1928239641;
		}
	}

	@OriginalMember(owner = "client!auu", name = "gy", descriptor = "()I")
	@Override
	int method24626() {
		@Pc(8) Class43 local8 = (Class43) Class25.aClass41_Sub9_1.method18054(this.anInt3301 * -1131018903, -1351174609);
		@Pc(13) int local13 = local8.anInt168 * 1614508089;
		@Pc(28) Class43 local28;
		if (this.anInt3300 * 994861483 != -1) {
			local28 = (Class43) Class25.aClass41_Sub9_1.method18054(this.anInt3300 * 994861483, -1997145082);
			if (local28.anInt168 * 1614508089 > local13) {
				local13 = local28.anInt168 * 1614508089;
			}
		}
		if (this.anInt3302 * -1664747073 != -1) {
			local28 = (Class43) Class25.aClass41_Sub9_1.method18054(this.anInt3302 * -1664747073, -2071481901);
			if (local28.anInt168 * 1614508089 > local13) {
				local13 = local28.anInt168 * 1614508089;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!auu", name = "gl", descriptor = "()I")
	@Override
	int method24611() {
		@Pc(8) Class43 local8 = (Class43) Class25.aClass41_Sub9_1.method18054(this.anInt3301 * -1131018903, -1050802963);
		@Pc(13) int local13 = local8.anInt168 * 1614508089;
		@Pc(28) Class43 local28;
		if (this.anInt3300 * 994861483 != -1) {
			local28 = (Class43) Class25.aClass41_Sub9_1.method18054(this.anInt3300 * 994861483, -1907047247);
			if (local28.anInt168 * 1614508089 > local13) {
				local13 = local28.anInt168 * 1614508089;
			}
		}
		if (this.anInt3302 * -1664747073 != -1) {
			local28 = (Class43) Class25.aClass41_Sub9_1.method18054(this.anInt3302 * -1664747073, -177910489);
			if (local28.anInt168 * 1614508089 > local13) {
				local13 = local28.anInt168 * 1614508089;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!auu", name = "gm", descriptor = "()I")
	@Override
	int method24612() {
		@Pc(8) Class43 local8 = (Class43) Class25.aClass41_Sub9_1.method18054(this.anInt3301 * -1131018903, 1464627187);
		@Pc(13) int local13 = local8.anInt168 * 1614508089;
		@Pc(28) Class43 local28;
		if (this.anInt3300 * 994861483 != -1) {
			local28 = (Class43) Class25.aClass41_Sub9_1.method18054(this.anInt3300 * 994861483, -920629467);
			if (local28.anInt168 * 1614508089 > local13) {
				local13 = local28.anInt168 * 1614508089;
			}
		}
		if (this.anInt3302 * -1664747073 != -1) {
			local28 = (Class43) Class25.aClass41_Sub9_1.method18054(this.anInt3302 * -1664747073, 1648580246);
			if (local28.anInt168 * 1614508089 > local13) {
				local13 = local28.anInt168 * 1614508089;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!auu", name = "gq", descriptor = "()I")
	@Override
	int method24564() {
		@Pc(8) Class43 local8 = (Class43) Class25.aClass41_Sub9_1.method18054(this.anInt3301 * -1131018903, 87679323);
		@Pc(13) int local13 = local8.anInt168 * 1614508089;
		@Pc(28) Class43 local28;
		if (this.anInt3300 * 994861483 != -1) {
			local28 = (Class43) Class25.aClass41_Sub9_1.method18054(this.anInt3300 * 994861483, 1202840069);
			if (local28.anInt168 * 1614508089 > local13) {
				local13 = local28.anInt168 * 1614508089;
			}
		}
		if (this.anInt3302 * -1664747073 != -1) {
			local28 = (Class43) Class25.aClass41_Sub9_1.method18054(this.anInt3302 * -1664747073, -207006392);
			if (local28.anInt168 * 1614508089 > local13) {
				local13 = local28.anInt168 * 1614508089;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!auu", name = "bb", descriptor = "(I)I")
	@Override
	public int method24578(@OriginalArg(0) int arg0) {
		return -10;
	}
}
