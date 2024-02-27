package com.jagex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rw")
public final class Class539 {

	@OriginalMember(owner = "client!rw", name = "v", descriptor = "F")
	float aFloat338;

	@OriginalMember(owner = "client!rw", name = "p", descriptor = "I")
	int anInt5442;

	@OriginalMember(owner = "client!rw", name = "l", descriptor = "Lclient!ox;")
	Class472 aClass472_63;

	@OriginalMember(owner = "client!rw", name = "z", descriptor = "Z")
	boolean aBoolean810;

	@OriginalMember(owner = "client!rw", name = "o", descriptor = "I")
	int anInt5443;

	@OriginalMember(owner = "client!rw", name = "s", descriptor = "Z")
	boolean aBoolean811;

	@OriginalMember(owner = "client!rw", name = "d", descriptor = "F")
	float aFloat339;

	@OriginalMember(owner = "client!rw", name = "c", descriptor = "Lclient!ro;")
	Interface58 anInterface58_6;

	@OriginalMember(owner = "client!rw", name = "r", descriptor = "F")
	float aFloat340;

	@OriginalMember(owner = "client!rw", name = "x", descriptor = "F")
	float aFloat341;

	@OriginalMember(owner = "client!rw", name = "n", descriptor = "Lclient!wr;")
	Interface70 anInterface70_1;

	@OriginalMember(owner = "client!rw", name = "u", descriptor = "I")
	int anInt5444;

	@OriginalMember(owner = "client!rw", name = "y", descriptor = "Ljava/lang/Object;")
	Object anObject25;

	@OriginalMember(owner = "client!rw", name = "w", descriptor = "Ljava/lang/Object;")
	Object anObject26;

	@OriginalMember(owner = "client!rw", name = "m", descriptor = "Lclient!rs;")
	Class536 aClass536_11 = Class536.aClass536_7;

	@OriginalMember(owner = "client!rw", name = "k", descriptor = "Z")
	boolean aBoolean809 = false;

	@OriginalMember(owner = "client!rw", name = "q", descriptor = "I")
	int anInt5445 = 0;

	@OriginalMember(owner = "client!rw", name = "e", descriptor = "Lclient!mt;")
	Class146 aClass146_3;

	@OriginalMember(owner = "client!rw", name = "f", descriptor = "Ljava/util/List;")
	List aList21;

	@OriginalMember(owner = "client!rw", name = "e", descriptor = "(I)[Lclient!gw;")
	static Class302[] method31063(@OriginalArg(0) int arg0) {
		return new Class302[] { Class302.aClass302_16, Class302.aClass302_5, Class302.aClass302_1, Class302.aClass302_14, Class302.aClass302_10, Class302.aClass302_2, Class302.aClass302_18, Class302.aClass302_17, Class302.aClass302_4, Class302.aClass302_7, Class302.aClass302_9, Class302.aClass302_6, Class302.aClass302_3, Class302.aClass302_13, Class302.aClass302_15, Class302.aClass302_12, Class302.aClass302_8, Class302.aClass302_11 };
	}

	@OriginalMember(owner = "client!rw", name = "hy", descriptor = "([[[Lclient!tk;IIIZI)Z")
	static boolean method31064(@OriginalArg(0) Class572[][][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		@Pc(3) byte[][][] local3 = client.aClass532_1.method30639((byte) -98);
		@Pc(14) byte local14 = arg4 ? 1 : (byte) (client.anInt3495 * 1815175593 & 0xFF);
		if (local14 == local3[Class512.anInt5370 * 1177442423][arg2][arg3]) {
			return false;
		}
		@Pc(31) Class520 local31 = client.aClass532_1.method30690(-1466943068);
		if ((local31.aByteArrayArrayArray12[Class512.anInt5370 * 1177442423][arg2][arg3] & 0x4) == 0) {
			return false;
		}
		@Pc(49) byte local49 = 0;
		@Pc(51) int local51 = 0;
		client.anIntArray331[local49] = arg2;
		@Pc(58) int local58 = local49 + 1;
		client.anIntArray317[local49] = arg3;
		local3[Class512.anInt5370 * 1177442423][arg2][arg3] = local14;
		while (local51 != local58) {
			@Pc(79) int local79 = client.anIntArray331[local51] & 0xFFFF;
			@Pc(87) int local87 = client.anIntArray331[local51] >> 16 & 0xFF;
			@Pc(95) int local95 = client.anIntArray331[local51] >> 24 & 0xFF;
			@Pc(101) int local101 = client.anIntArray317[local51] & 0xFFFF;
			@Pc(109) int local109 = client.anIntArray317[local51] >> 16 & 0xFF;
			local51 = local51 + 1 & 0xFFF;
			@Pc(117) boolean local117 = false;
			if ((local31.aByteArrayArrayArray12[Class512.anInt5370 * 1177442423][local79][local101] & 0x4) == 0) {
				local117 = true;
			}
			@Pc(134) boolean local134 = false;
			@Pc(143) int local143;
			@Pc(186) int local186;
			@Pc(226) int local226;
			if (arg0 != null) {
				label240: for (local143 = Class512.anInt5370 * 1177442423 + 1; local143 <= 3; local143++) {
					if (arg0[local143] != null && (local31.aByteArrayArrayArray12[local143][local79][local101] & 0x8) == 0) {
						@Pc(318) Class132_Sub1_Sub1 local318;
						@Pc(328) int local328;
						@Pc(332) int local332;
						@Pc(343) int local343;
						@Pc(306) Class572 local306;
						@Pc(312) Class590 local312;
						if (local117 && arg0[local143][local79][local101] != null) {
							if (arg0[local143][local79][local101].aClass132_Sub1_Sub2_1 != null) {
								local186 = Class111.method6801(local87, -1392619295);
								if (arg0[local143][local79][local101].aClass132_Sub1_Sub2_1.aShort84 == local186 || arg0[local143][local79][local101].aClass132_Sub1_Sub2_2 != null && local186 == arg0[local143][local79][local101].aClass132_Sub1_Sub2_2.aShort84) {
									continue;
								}
								if (local95 != 0) {
									local226 = Class111.method6801(local95, -989909894);
									if (arg0[local143][local79][local101].aClass132_Sub1_Sub2_1.aShort84 == local226 || arg0[local143][local79][local101].aClass132_Sub1_Sub2_2 != null && local226 == arg0[local143][local79][local101].aClass132_Sub1_Sub2_2.aShort84) {
										continue;
									}
								}
								if (local109 != 0) {
									local226 = Class111.method6801(local109, 842116572);
									if (arg0[local143][local79][local101].aClass132_Sub1_Sub2_1.aShort84 == local226 || arg0[local143][local79][local101].aClass132_Sub1_Sub2_2 != null && arg0[local143][local79][local101].aClass132_Sub1_Sub2_2.aShort84 == local226) {
										continue;
									}
								}
							}
							local306 = arg0[local143][local79][local101];
							if (local306.aClass590_1 != null) {
								for (local312 = local306.aClass590_1; local312 != null; local312 = local312.aClass590_2) {
									local318 = local312.aClass132_Sub1_Sub1_1;
									if (local318 instanceof Interface61) {
										@Pc(324) Interface61 local324 = (Interface61) local318;
										local328 = local324.method13420(1354922283);
										local332 = local324.method13404(2145629535);
										if (local328 == 21) {
											local328 = 19;
										}
										local343 = local328 | local332 << 6;
										if (local343 == local87 || local95 != 0 && local95 == local343 || local109 != 0 && local109 == local343) {
											continue label240;
										}
									}
								}
							}
						}
						local306 = arg0[local143][local79][local101];
						if (local306 != null && local306.aClass590_1 != null) {
							for (local312 = local306.aClass590_1; local312 != null; local312 = local312.aClass590_2) {
								local318 = local312.aClass132_Sub1_Sub1_1;
								if (local318.aShort130 != local318.aShort129 || local318.aShort127 != local318.aShort128) {
									@Pc(399) short local399 = local318.aShort129;
									@Pc(402) short local402 = local318.aShort130;
									@Pc(405) short local405 = local318.aShort128;
									@Pc(408) short local408 = local318.aShort127;
									@Pc(419) int local419 = Math.max(0, Math.min(local399, local3[local143].length - 1));
									local332 = Math.max(0, Math.min(local405, local3[local143][0].length - 1));
									local328 = Math.max(0, Math.min(local402, local3[local143].length - 1));
									local343 = Math.max(0, Math.min(local408, local3[local143][0].length - 1));
									while (local419 <= local328) {
										while (local332 <= local343) {
											local3[local143][local419][local332] = local14;
											local332++;
										}
										local419++;
									}
								}
							}
						}
						local3[local143][local79][local101] = local14;
						local134 = true;
					}
				}
			}
			if (local134) {
				local143 = client.aClass532_1.method30640(-1948542630).aClass99Array1[Class512.anInt5370 * 1177442423 + 1].method2482(local79, local101, -1740548441);
				if (client.anIntArray327[arg1] < local143) {
					client.anIntArray327[arg1] = local143;
				}
				local186 = local79 << 9;
				local226 = local101 << 9;
				if (client.anIntArray312[arg1] > local186) {
					client.anIntArray312[arg1] = local186;
				} else if (client.anIntArray313[arg1] < local186) {
					client.anIntArray313[arg1] = local186;
				}
				if (client.anIntArray302[arg1] > local226) {
					client.anIntArray302[arg1] = local226;
				} else if (client.anIntArray314[arg1] < local226) {
					client.anIntArray314[arg1] = local226;
				}
			}
			if (!local117) {
				if (local79 >= 1 && local14 != local3[Class512.anInt5370 * 1177442423][local79 - 1][local101]) {
					client.anIntArray331[local58] = local79 - 1 | 0x120000 | 0xD3000000;
					client.anIntArray317[local58] = local101 | 0x130000;
					local58 = local58 + 1 & 0xFFF;
					local3[Class512.anInt5370 * 1177442423][local79 - 1][local101] = local14;
				}
				local101++;
				if (local101 < client.aClass532_1.method30655((short) 128)) {
					if (local79 - 1 >= 0 && local14 != local3[Class512.anInt5370 * 1177442423][local79 - 1][local101] && (local31.aByteArrayArrayArray12[Class512.anInt5370 * 1177442423][local79][local101] & 0x4) == 0 && (local31.aByteArrayArrayArray12[Class512.anInt5370 * 1177442423][local79 - 1][local101 - 1] & 0x4) == 0) {
						client.anIntArray331[local58] = local79 - 1 | 0x120000 | 0x52000000;
						client.anIntArray317[local58] = local101 | 0x130000;
						local58 = local58 + 1 & 0xFFF;
						local3[Class512.anInt5370 * 1177442423][local79 - 1][local101] = local14;
					}
					if (local3[Class512.anInt5370 * 1177442423][local79][local101] != local14) {
						client.anIntArray331[local58] = local79 | 0x520000 | 0x13000000;
						client.anIntArray317[local58] = local101 | 0x530000;
						local58 = local58 + 1 & 0xFFF;
						local3[Class512.anInt5370 * 1177442423][local79][local101] = local14;
					}
					if (local79 + 1 < client.aClass532_1.method30625(1277779931) && local14 != local3[Class512.anInt5370 * 1177442423][local79 + 1][local101] && (local31.aByteArrayArrayArray12[Class512.anInt5370 * 1177442423][local79][local101] & 0x4) == 0 && (local31.aByteArrayArrayArray12[Class512.anInt5370 * 1177442423][local79 + 1][local101 - 1] & 0x4) == 0) {
						client.anIntArray331[local58] = local79 + 1 | 0x520000 | 0x92000000;
						client.anIntArray317[local58] = local101 | 0x530000;
						local58 = local58 + 1 & 0xFFF;
						local3[Class512.anInt5370 * 1177442423][local79 + 1][local101] = local14;
					}
				}
				local101--;
				if (local79 + 1 < client.aClass532_1.method30625(139032878) && local14 != local3[Class512.anInt5370 * 1177442423][local79 + 1][local101]) {
					client.anIntArray331[local58] = local79 + 1 | 0x920000 | 0x53000000;
					client.anIntArray317[local58] = local101 | 0x930000;
					local58 = local58 + 1 & 0xFFF;
					local3[Class512.anInt5370 * 1177442423][local79 + 1][local101] = local14;
				}
				local101--;
				if (local101 >= 0) {
					if (local79 - 1 >= 0 && local14 != local3[Class512.anInt5370 * 1177442423][local79 - 1][local101] && (local31.aByteArrayArrayArray12[Class512.anInt5370 * 1177442423][local79][local101] & 0x4) == 0 && (local31.aByteArrayArrayArray12[Class512.anInt5370 * 1177442423][local79 - 1][local101 + 1] & 0x4) == 0) {
						client.anIntArray331[local58] = local79 - 1 | 0xD20000 | 0x12000000;
						client.anIntArray317[local58] = local101 | 0xD30000;
						local58 = local58 + 1 & 0xFFF;
						local3[Class512.anInt5370 * 1177442423][local79 - 1][local101] = local14;
					}
					if (local14 != local3[Class512.anInt5370 * 1177442423][local79][local101]) {
						client.anIntArray331[local58] = local79 | 0xD20000 | 0x93000000;
						client.anIntArray317[local58] = local101 | 0xD30000;
						local58 = local58 + 1 & 0xFFF;
						local3[Class512.anInt5370 * 1177442423][local79][local101] = local14;
					}
					if (local79 + 1 < client.aClass532_1.method30625(330584158) && local3[Class512.anInt5370 * 1177442423][local79 + 1][local101] != local14 && (local31.aByteArrayArrayArray12[Class512.anInt5370 * 1177442423][local79][local101] & 0x4) == 0 && (local31.aByteArrayArrayArray12[Class512.anInt5370 * 1177442423][local79 + 1][local101 + 1] & 0x4) == 0) {
						client.anIntArray331[local58] = local79 + 1 | 0x920000 | 0xD2000000;
						client.anIntArray317[local58] = local101 | 0x930000;
						local58 = local58 + 1 & 0xFFF;
						local3[Class512.anInt5370 * 1177442423][local79 + 1][local101] = local14;
					}
				}
			}
		}
		if (client.anIntArray327[arg1] != -1000000) {
			client.anIntArray327[arg1] += 40;
			client.anIntArray312[arg1] -= 512;
			client.anIntArray313[arg1] += 512;
			client.anIntArray314[arg1] += 512;
			client.anIntArray302[arg1] -= 512;
		}
		return true;
	}

	@OriginalMember(owner = "client!rw", name = "<init>", descriptor = "(Lclient!mt;)V")
	public Class539(@OriginalArg(0) Class146 arg0) {
		this.aClass146_3 = arg0;
		this.aList21 = new ArrayList();
	}

	@OriginalMember(owner = "client!rw", name = "bt", descriptor = "()Ljava/lang/Object;")
	public Object method30966() {
		return this.anObject26;
	}

	@OriginalMember(owner = "client!rw", name = "e", descriptor = "(I)V")
	void method30967(@OriginalArg(0) int arg0) {
		this.anInterface70_1 = null;
		this.aClass536_11 = Class536.aClass536_7;
		this.aBoolean809 = false;
		this.aList21.clear();
		this.anObject26 = null;
		this.aClass472_63 = null;
		this.anInt5444 = -1720273925;
		this.aBoolean810 = false;
		this.anInt5442 = 0;
		this.aFloat339 = 0.0F;
		this.anInterface58_6 = null;
		this.aFloat340 = 0.0F;
		this.aFloat338 = 0.0F;
		this.anInt5443 = 0;
		this.aBoolean811 = false;
		this.anObject25 = null;
		this.anInt5445 = 0;
		this.aFloat341 = 1.0F;
	}

	@OriginalMember(owner = "client!rw", name = "n", descriptor = "(Lclient!wr;I)V")
	public void method30968(@OriginalArg(0) Interface70 arg0, @OriginalArg(1) int arg1) {
		this.anInterface70_1 = arg0;
		this.aFloat339 = 0.0F;
		this.aClass536_11 = Class536.aClass536_1;
	}

	@OriginalMember(owner = "client!rw", name = "m", descriptor = "(I)V")
	public void method30969(@OriginalArg(0) int arg0) {
		if (this.aClass536_11 != Class536.aClass536_2 && this.aClass536_11 != Class536.aClass536_8) {
			this.method30972(0, (byte) -44);
		}
		@Pc(15) Iterator local15 = this.aList21.iterator();
		while (local15.hasNext()) {
			@Pc(22) Class535 local22 = (Class535) local15.next();
			if (local22.method30848(-2087611449) == this) {
				local22.method30816((byte) 8);
			} else {
				local15.remove();
			}
		}
		this.method30967(806406106);
		this.aClass536_11 = Class536.aClass536_10;
	}

	@OriginalMember(owner = "client!rw", name = "bi", descriptor = "(Ljava/lang/Object;)V")
	public void method30970(@OriginalArg(0) Object arg0) {
		this.anObject26 = arg0;
	}

	@OriginalMember(owner = "client!rw", name = "bc", descriptor = "(Ljava/lang/Object;)V")
	public void method30971(@OriginalArg(0) Object arg0) {
		this.anObject26 = arg0;
	}

	@OriginalMember(owner = "client!rw", name = "w", descriptor = "(IB)V")
	public void method30972(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (this.aClass536_11.anInt5438 * -621510697 >= Class536.aClass536_2.anInt5438 * -621510697) {
			return;
		}
		if (this.aClass536_11.anInt5438 * -621510697 < Class536.aClass536_5.anInt5438 * -621510697) {
			this.aClass536_11 = Class536.aClass536_2;
			this.aBoolean809 = false;
			return;
		}
		@Pc(33) Iterator local33;
		@Pc(40) Class535 local40;
		if (arg0 > 0) {
			this.aClass536_11 = Class536.aClass536_6;
			local33 = this.aList21.iterator();
			while (local33.hasNext()) {
				local40 = (Class535) local33.next();
				if (local40.method30848(-2087611449) == this) {
					local40.method30817(0.0F, arg0, -37570847);
				} else {
					local33.remove();
				}
			}
			return;
		}
		local33 = this.aList21.iterator();
		while (local33.hasNext()) {
			local40 = (Class535) local33.next();
			if (local40.method30848(-2087611449) == this) {
				local40.method30821(-735234476);
			} else {
				local33.remove();
			}
		}
		this.aClass536_11 = Class536.aClass536_2;
		this.aBoolean809 = false;
	}

	@OriginalMember(owner = "client!rw", name = "l", descriptor = "(B)V")
	public void method30973(@OriginalArg(0) byte arg0) {
		@Pc(3) Iterator local3 = this.aList21.iterator();
		this.aClass536_11 = Class536.aClass536_2;
		while (local3.hasNext()) {
			@Pc(13) Class535 local13 = (Class535) local3.next();
			if (local13.method30848(-2087611449) == this) {
				local13.method30834(1484348792);
			}
		}
	}

	@OriginalMember(owner = "client!rw", name = "u", descriptor = "(I)V")
	public void method30974(@OriginalArg(0) int arg0) {
		@Pc(3) Iterator local3 = this.aList21.iterator();
		this.aClass536_11 = Class536.aClass536_3;
		while (local3.hasNext()) {
			@Pc(13) Class535 local13 = (Class535) local3.next();
			if (local13.method30848(-2087611449) == this) {
				local13.method30916(-764271943);
			}
		}
	}

	@OriginalMember(owner = "client!rw", name = "z", descriptor = "(Lclient!ro;I)V")
	public void method30975(@OriginalArg(0) Interface58 arg0, @OriginalArg(1) int arg1) {
		this.anInterface58_6 = arg0;
	}

	@OriginalMember(owner = "client!rw", name = "p", descriptor = "(B)V")
	public void method30976(@OriginalArg(0) byte arg0) {
		if (this.aClass536_11 == Class536.aClass536_3) {
			@Pc(8) Class639 local8 = this.anInterface70_1.method32748(248045642);
			if (Class639.aClass639_3 == local8) {
				this.aClass536_11 = Class536.aClass536_4;
			}
		}
		@Pc(38) boolean local38;
		if (this.aClass536_11 == Class536.aClass536_4 && this.aBoolean809) {
			@Pc(31) Class535 local31 = this.aClass146_3.method11674(this.anInterface70_1.method32712(859157841), (byte) 19);
			if (local31 != null) {
				local38 = this.anInterface70_1.method32708(827202555);
				@Pc(43) Class518 local43 = new Class518(this);
				@Pc(84) boolean local84 = local31.method30819(local38 ? null : this.anInterface70_1.method32710(0, 1643894185), local38 ? local43 : null, this.anInt5444 * 1397727437, this.anInt5445 * 1084945595 > 0 ? 0.0F : this.aFloat339, false, this.aBoolean810, this.anInt5442 * 722478837, this.aFloat341, this, 1221408403);
				if (local84) {
					this.aClass536_11 = Class536.aClass536_5;
					local31.method30868(this.anInterface58_6, -1540719604);
					local31.method30817(this.aFloat339, this.anInt5445 * 1084945595, -37570847);
					local31.method30820(55935924);
					this.aList21.add(local31);
					this.aBoolean809 = false;
				} else {
					if (local31.method30882(-1945830439) == Class511.aClass511_8) {
						this.aClass536_11 = Class536.aClass536_8;
					}
					local31.method30816((byte) 8);
				}
			}
		}
		@Pc(131) Iterator local131 = this.aList21.iterator();
		local38 = true;
		while (true) {
			while (local131.hasNext()) {
				@Pc(140) Class535 local140 = (Class535) local131.next();
				if (local140.method30848(-2087611449) == this) {
					if (Class536.aClass536_6 == this.aClass536_11) {
						if (local140.method30818(700480837) == 0.0F) {
							local140.method30821(-26842720);
						} else {
							local38 = false;
						}
					}
					if (local140.method30814((byte) -12) || local140.method30913(-511245246)) {
						local140.method30816((byte) 8);
						local131.remove();
					} else {
						local38 = false;
					}
				} else {
					local131.remove();
				}
			}
			if (local38 && this.aClass536_11.anInt5438 * -621510697 >= Class536.aClass536_5.anInt5438 * -621510697 && this.aClass536_11.anInt5438 * -621510697 < Class536.aClass536_2.anInt5438 * -621510697) {
				if (Class536.aClass536_6 == this.aClass536_11) {
					this.aClass536_11 = Class536.aClass536_2;
				} else {
					this.aClass536_11 = Class536.aClass536_8;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!rw", name = "d", descriptor = "(I)Lclient!rs;")
	public Class536 method30977(@OriginalArg(0) int arg0) {
		return this.aClass536_11;
	}

	@OriginalMember(owner = "client!rw", name = "x", descriptor = "(I)Lclient!wr;")
	public Interface70 method30978(@OriginalArg(0) int arg0) {
		return this.anInterface70_1;
	}

	@OriginalMember(owner = "client!rw", name = "r", descriptor = "(I)Ljava/lang/Object;")
	public Object method30979(@OriginalArg(0) int arg0) {
		return this.anObject26;
	}

	@OriginalMember(owner = "client!rw", name = "v", descriptor = "(Ljava/lang/Object;I)V")
	public void method30980(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		this.anObject25 = arg0;
	}

	@OriginalMember(owner = "client!rw", name = "ch", descriptor = "(ZI)V")
	public void method30981(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		this.aBoolean810 = arg0;
		this.anInt5442 = arg1 * 1557714269;
	}

	@OriginalMember(owner = "client!rw", name = "ae", descriptor = "(B)Z")
	public boolean method30982(@OriginalArg(0) byte arg0) {
		this.aBoolean811 = false;
		return this.anInt5443 * 1064024733 != 0;
	}

	@OriginalMember(owner = "client!rw", name = "y", descriptor = "(IB)V")
	public void method30983(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.anInt5444 = arg0 * 1720273925;
	}

	@OriginalMember(owner = "client!rw", name = "k", descriptor = "(I)V")
	public void method30984(@OriginalArg(0) int arg0) {
		if (!this.aBoolean809 && (this.aClass536_11 != Class536.aClass536_9 && Class536.aClass536_10 != this.aClass536_11 && Class536.aClass536_7 != this.aClass536_11 && this.aClass536_11 != Class536.aClass536_6 && (this.aClass536_11.anInt5438 * -621510697 <= Class536.aClass536_1.anInt5438 * -621510697 || this.aClass536_11.anInt5438 * -621510697 >= Class536.aClass536_2.anInt5438 * -621510697))) {
			this.aClass536_11 = Class536.aClass536_3;
		}
	}

	@OriginalMember(owner = "client!rw", name = "bn", descriptor = "()Ljava/lang/Object;")
	public Object method30985() {
		return this.anObject26;
	}

	@OriginalMember(owner = "client!rw", name = "b", descriptor = "(Lclient!ox;I)V")
	public void method30986(@OriginalArg(0) Class472 arg0, @OriginalArg(1) int arg1) {
		this.aClass472_63 = arg0;
	}

	@OriginalMember(owner = "client!rw", name = "h", descriptor = "(S)Lclient!ox;")
	public Class472 method30987(@OriginalArg(0) short arg0) {
		return this.aClass472_63;
	}

	@OriginalMember(owner = "client!rw", name = "aw", descriptor = "(Lclient!wr;)V")
	public void method30988(@OriginalArg(0) Interface70 arg0) {
		this.anInterface70_1 = arg0;
		this.aFloat339 = 0.0F;
		this.aClass536_11 = Class536.aClass536_1;
	}

	@OriginalMember(owner = "client!rw", name = "g", descriptor = "(B)F")
	public float method30989(@OriginalArg(0) byte arg0) {
		return this.aFloat338;
	}

	@OriginalMember(owner = "client!rw", name = "i", descriptor = "(FB)V")
	public void method30990(@OriginalArg(0) float arg0, @OriginalArg(1) byte arg1) {
		this.aFloat340 = arg0;
	}

	@OriginalMember(owner = "client!rw", name = "au", descriptor = "()V")
	public void method30991() {
		if (this.aClass536_11 != Class536.aClass536_2 && this.aClass536_11 != Class536.aClass536_8) {
			this.method30972(0, (byte) -30);
		}
		@Pc(15) Iterator local15 = this.aList21.iterator();
		while (local15.hasNext()) {
			@Pc(22) Class535 local22 = (Class535) local15.next();
			if (local22.method30848(-2087611449) == this) {
				local22.method30816((byte) 8);
			} else {
				local15.remove();
			}
		}
		this.method30967(512272026);
		this.aClass536_11 = Class536.aClass536_10;
	}

	@OriginalMember(owner = "client!rw", name = "t", descriptor = "(IZB)V")
	public void method30992(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte arg2) {
		this.aBoolean811 = arg1;
		this.anInt5443 = arg0 * -1497850955;
	}

	@OriginalMember(owner = "client!rw", name = "cm", descriptor = "(ZI)V")
	public void method30993(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		this.aBoolean810 = arg0;
		this.anInt5442 = arg1 * 1557714269;
	}

	@OriginalMember(owner = "client!rw", name = "ag", descriptor = "(B)V")
	public void method30994(@OriginalArg(0) byte arg0) {
		if (this.anInt5443 * 1064024733 > -1 && !this.aBoolean811) {
			this.anInt5443 -= -1497850955;
		}
		if (this.anInt5443 * 1064024733 == 0) {
			this.method31033(-892311472);
		}
	}

	@OriginalMember(owner = "client!rw", name = "ah", descriptor = "(FII)V")
	public void method30995(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat339 = arg0;
		@Pc(4) int local4 = 0;
		@Pc(8) Iterator local8 = this.aList21.iterator();
		while (local8.hasNext()) {
			@Pc(15) Class535 local15 = (Class535) local8.next();
			if (local15.method30848(-2087611449) == this) {
				local15.method30817(this.aFloat339, arg1, -37570847);
				local4++;
			} else {
				this.aList21.remove(local15);
			}
		}
		if (local4 == 0) {
			this.anInt5445 = arg1 * 862138483;
		}
	}

	@OriginalMember(owner = "client!rw", name = "al", descriptor = "(ZIB)V")
	public void method30996(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		this.aBoolean810 = arg0;
		this.anInt5442 = arg1 * 1557714269;
	}

	@OriginalMember(owner = "client!rw", name = "ac", descriptor = "(FI)V")
	public void method30997(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1) {
		if (!(arg0 < 0.0F)) {
			this.aFloat341 = arg0;
		}
	}

	@OriginalMember(owner = "client!rw", name = "ai", descriptor = "()V")
	void method30998() {
		this.anInterface70_1 = null;
		this.aClass536_11 = Class536.aClass536_7;
		this.aBoolean809 = false;
		this.aList21.clear();
		this.anObject26 = null;
		this.aClass472_63 = null;
		this.anInt5444 = -1720273925;
		this.aBoolean810 = false;
		this.anInt5442 = 0;
		this.aFloat339 = 0.0F;
		this.anInterface58_6 = null;
		this.aFloat340 = 0.0F;
		this.aFloat338 = 0.0F;
		this.anInt5443 = 0;
		this.aBoolean811 = false;
		this.anObject25 = null;
		this.anInt5445 = 0;
		this.aFloat341 = 1.0F;
	}

	@OriginalMember(owner = "client!rw", name = "as", descriptor = "(Lclient!wr;)V")
	public void method30999(@OriginalArg(0) Interface70 arg0) {
		this.anInterface70_1 = arg0;
		this.aFloat339 = 0.0F;
		this.aClass536_11 = Class536.aClass536_1;
	}

	@OriginalMember(owner = "client!rw", name = "at", descriptor = "(Lclient!wr;)V")
	public void method31000(@OriginalArg(0) Interface70 arg0) {
		this.anInterface70_1 = arg0;
		this.aFloat339 = 0.0F;
		this.aClass536_11 = Class536.aClass536_1;
	}

	@OriginalMember(owner = "client!rw", name = "cp", descriptor = "(F)V")
	public void method31001(@OriginalArg(0) float arg0) {
		this.aFloat340 = arg0;
	}

	@OriginalMember(owner = "client!rw", name = "ay", descriptor = "(I)V")
	public void method31002(@OriginalArg(0) int arg0) {
		if (this.aClass536_11.anInt5438 * -621510697 >= Class536.aClass536_2.anInt5438 * -621510697) {
			return;
		}
		if (this.aClass536_11.anInt5438 * -621510697 < Class536.aClass536_5.anInt5438 * -621510697) {
			this.aClass536_11 = Class536.aClass536_2;
			this.aBoolean809 = false;
			return;
		}
		@Pc(33) Iterator local33;
		@Pc(40) Class535 local40;
		if (arg0 > 0) {
			this.aClass536_11 = Class536.aClass536_6;
			local33 = this.aList21.iterator();
			while (local33.hasNext()) {
				local40 = (Class535) local33.next();
				if (local40.method30848(-2087611449) == this) {
					local40.method30817(0.0F, arg0, -37570847);
				} else {
					local33.remove();
				}
			}
			return;
		}
		local33 = this.aList21.iterator();
		while (local33.hasNext()) {
			local40 = (Class535) local33.next();
			if (local40.method30848(-2087611449) == this) {
				local40.method30821(63813566);
			} else {
				local33.remove();
			}
		}
		this.aClass536_11 = Class536.aClass536_2;
		this.aBoolean809 = false;
	}

	@OriginalMember(owner = "client!rw", name = "cu", descriptor = "()F")
	public float method31003() {
		return this.aFloat340;
	}

	@OriginalMember(owner = "client!rw", name = "ar", descriptor = "()V")
	public void method31004() {
		if (this.aClass536_11 != Class536.aClass536_2 && this.aClass536_11 != Class536.aClass536_8) {
			this.method30972(0, (byte) -118);
		}
		@Pc(15) Iterator local15 = this.aList21.iterator();
		while (local15.hasNext()) {
			@Pc(22) Class535 local22 = (Class535) local15.next();
			if (local22.method30848(-2087611449) == this) {
				local22.method30816((byte) 8);
			} else {
				local15.remove();
			}
		}
		this.method30967(-649314036);
		this.aClass536_11 = Class536.aClass536_10;
	}

	@OriginalMember(owner = "client!rw", name = "ba", descriptor = "()Lclient!wr;")
	public Interface70 method31005() {
		return this.anInterface70_1;
	}

	@OriginalMember(owner = "client!rw", name = "bu", descriptor = "()I")
	public int method31006() {
		return this.anInt5444 * 1397727437;
	}

	@OriginalMember(owner = "client!rw", name = "ax", descriptor = "()V")
	public void method31007() {
		if (Class536.aClass536_9 == this.aClass536_11 || this.aClass536_11 == Class536.aClass536_10 || Class536.aClass536_7 == this.aClass536_11 || this.aClass536_11 == Class536.aClass536_6) {
			return;
		}
		if ((Class536.aClass536_3 == this.aClass536_11 || Class536.aClass536_4 == this.aClass536_11) && !this.aBoolean809) {
			this.aBoolean809 = true;
		} else if (this.aClass536_11.anInt5438 * -621510697 < Class536.aClass536_3.anInt5438 * -621510697 || this.aClass536_11.anInt5438 * -621510697 >= Class536.aClass536_2.anInt5438 * -621510697) {
			this.aClass536_11 = Class536.aClass536_3;
			this.aBoolean809 = true;
		}
	}

	@OriginalMember(owner = "client!rw", name = "av", descriptor = "()V")
	public void method31008() {
		if (Class536.aClass536_9 == this.aClass536_11 || this.aClass536_11 == Class536.aClass536_10 || Class536.aClass536_7 == this.aClass536_11 || this.aClass536_11 == Class536.aClass536_6) {
			return;
		}
		if ((Class536.aClass536_3 == this.aClass536_11 || Class536.aClass536_4 == this.aClass536_11) && !this.aBoolean809) {
			this.aBoolean809 = true;
		} else if (this.aClass536_11.anInt5438 * -621510697 < Class536.aClass536_3.anInt5438 * -621510697 || this.aClass536_11.anInt5438 * -621510697 >= Class536.aClass536_2.anInt5438 * -621510697) {
			this.aClass536_11 = Class536.aClass536_3;
			this.aBoolean809 = true;
		}
	}

	@OriginalMember(owner = "client!rw", name = "ao", descriptor = "(I)V")
	public void method31009(@OriginalArg(0) int arg0) {
		if (this.aClass536_11.anInt5438 * -621510697 >= Class536.aClass536_2.anInt5438 * -621510697) {
			return;
		}
		if (this.aClass536_11.anInt5438 * -621510697 < Class536.aClass536_5.anInt5438 * -621510697) {
			this.aClass536_11 = Class536.aClass536_2;
			this.aBoolean809 = false;
			return;
		}
		@Pc(33) Iterator local33;
		@Pc(40) Class535 local40;
		if (arg0 > 0) {
			this.aClass536_11 = Class536.aClass536_6;
			local33 = this.aList21.iterator();
			while (local33.hasNext()) {
				local40 = (Class535) local33.next();
				if (local40.method30848(-2087611449) == this) {
					local40.method30817(0.0F, arg0, -37570847);
				} else {
					local33.remove();
				}
			}
			return;
		}
		local33 = this.aList21.iterator();
		while (local33.hasNext()) {
			local40 = (Class535) local33.next();
			if (local40.method30848(-2087611449) == this) {
				local40.method30821(-934112303);
			} else {
				local33.remove();
			}
		}
		this.aClass536_11 = Class536.aClass536_2;
		this.aBoolean809 = false;
	}

	@OriginalMember(owner = "client!rw", name = "aj", descriptor = "(I)V")
	public void method31010(@OriginalArg(0) int arg0) {
		if (this.aClass536_11.anInt5438 * -621510697 >= Class536.aClass536_2.anInt5438 * -621510697) {
			return;
		}
		if (this.aClass536_11.anInt5438 * -621510697 < Class536.aClass536_5.anInt5438 * -621510697) {
			this.aClass536_11 = Class536.aClass536_2;
			this.aBoolean809 = false;
			return;
		}
		@Pc(33) Iterator local33;
		@Pc(40) Class535 local40;
		if (arg0 > 0) {
			this.aClass536_11 = Class536.aClass536_6;
			local33 = this.aList21.iterator();
			while (local33.hasNext()) {
				local40 = (Class535) local33.next();
				if (local40.method30848(-2087611449) == this) {
					local40.method30817(0.0F, arg0, -37570847);
				} else {
					local33.remove();
				}
			}
			return;
		}
		local33 = this.aList21.iterator();
		while (local33.hasNext()) {
			local40 = (Class535) local33.next();
			if (local40.method30848(-2087611449) == this) {
				local40.method30821(-29123957);
			} else {
				local33.remove();
			}
		}
		this.aClass536_11 = Class536.aClass536_2;
		this.aBoolean809 = false;
	}

	@OriginalMember(owner = "client!rw", name = "s", descriptor = "(I)I")
	public int method31011(@OriginalArg(0) int arg0) {
		return this.anInt5444 * 1397727437;
	}

	@OriginalMember(owner = "client!rw", name = "ab", descriptor = "()V")
	public void method31012() {
		@Pc(3) Iterator local3 = this.aList21.iterator();
		this.aClass536_11 = Class536.aClass536_2;
		while (local3.hasNext()) {
			@Pc(13) Class535 local13 = (Class535) local3.next();
			if (local13.method30848(-2087611449) == this) {
				local13.method30834(-2112218984);
			}
		}
	}

	@OriginalMember(owner = "client!rw", name = "q", descriptor = "(ZB)V")
	public void method31013(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte arg1) {
	}

	@OriginalMember(owner = "client!rw", name = "aa", descriptor = "()V")
	public void method31014() {
		@Pc(3) Iterator local3 = this.aList21.iterator();
		this.aClass536_11 = Class536.aClass536_2;
		while (local3.hasNext()) {
			@Pc(13) Class535 local13 = (Class535) local3.next();
			if (local13.method30848(-2087611449) == this) {
				local13.method30834(-509844590);
			}
		}
	}

	@OriginalMember(owner = "client!rw", name = "af", descriptor = "()V")
	public void method31015() {
		@Pc(3) Iterator local3 = this.aList21.iterator();
		this.aClass536_11 = Class536.aClass536_2;
		while (local3.hasNext()) {
			@Pc(13) Class535 local13 = (Class535) local3.next();
			if (local13.method30848(-2087611449) == this) {
				local13.method30834(1213150922);
			}
		}
	}

	@OriginalMember(owner = "client!rw", name = "ak", descriptor = "()V")
	public void method31016() {
		@Pc(3) Iterator local3 = this.aList21.iterator();
		this.aClass536_11 = Class536.aClass536_3;
		while (local3.hasNext()) {
			@Pc(13) Class535 local13 = (Class535) local3.next();
			if (local13.method30848(-2087611449) == this) {
				local13.method30916(-290048945);
			}
		}
	}

	@OriginalMember(owner = "client!rw", name = "an", descriptor = "()V")
	public void method31017() {
		@Pc(3) Iterator local3 = this.aList21.iterator();
		this.aClass536_11 = Class536.aClass536_3;
		while (local3.hasNext()) {
			@Pc(13) Class535 local13 = (Class535) local3.next();
			if (local13.method30848(-2087611449) == this) {
				local13.method30916(-1475096021);
			}
		}
	}

	@OriginalMember(owner = "client!rw", name = "bf", descriptor = "()V")
	public void method31018() {
		@Pc(3) Iterator local3 = this.aList21.iterator();
		this.aClass536_11 = Class536.aClass536_3;
		while (local3.hasNext()) {
			@Pc(13) Class535 local13 = (Class535) local3.next();
			if (local13.method30848(-2087611449) == this) {
				local13.method30916(-638183776);
			}
		}
	}

	@OriginalMember(owner = "client!rw", name = "bl", descriptor = "()V")
	public void method31019() {
		if (this.aClass536_11 == Class536.aClass536_3) {
			@Pc(8) Class639 local8 = this.anInterface70_1.method32748(1583897237);
			if (Class639.aClass639_3 == local8) {
				this.aClass536_11 = Class536.aClass536_4;
			}
		}
		@Pc(38) boolean local38;
		if (this.aClass536_11 == Class536.aClass536_4 && this.aBoolean809) {
			@Pc(31) Class535 local31 = this.aClass146_3.method11674(this.anInterface70_1.method32712(-873763613), (byte) 4);
			if (local31 != null) {
				local38 = this.anInterface70_1.method32708(1143490218);
				@Pc(43) Class518 local43 = new Class518(this);
				@Pc(84) boolean local84 = local31.method30819(local38 ? null : this.anInterface70_1.method32710(0, 751327781), local38 ? local43 : null, this.anInt5444 * 1397727437, this.anInt5445 * 1084945595 > 0 ? 0.0F : this.aFloat339, false, this.aBoolean810, this.anInt5442 * 722478837, this.aFloat341, this, 900697747);
				if (local84) {
					this.aClass536_11 = Class536.aClass536_5;
					local31.method30868(this.anInterface58_6, 389589187);
					local31.method30817(this.aFloat339, this.anInt5445 * 1084945595, -37570847);
					local31.method30820(-217573438);
					this.aList21.add(local31);
					this.aBoolean809 = false;
				} else {
					if (local31.method30882(-1697507842) == Class511.aClass511_8) {
						this.aClass536_11 = Class536.aClass536_8;
					}
					local31.method30816((byte) 8);
				}
			}
		}
		@Pc(131) Iterator local131 = this.aList21.iterator();
		local38 = true;
		while (true) {
			while (local131.hasNext()) {
				@Pc(140) Class535 local140 = (Class535) local131.next();
				if (local140.method30848(-2087611449) == this) {
					if (Class536.aClass536_6 == this.aClass536_11) {
						if (local140.method30818(-743503147) == 0.0F) {
							local140.method30821(-392961540);
						} else {
							local38 = false;
						}
					}
					if (local140.method30814((byte) 46) || local140.method30913(-511245246)) {
						local140.method30816((byte) 8);
						local131.remove();
					} else {
						local38 = false;
					}
				} else {
					local131.remove();
				}
			}
			if (local38 && this.aClass536_11.anInt5438 * -621510697 >= Class536.aClass536_5.anInt5438 * -621510697 && this.aClass536_11.anInt5438 * -621510697 < Class536.aClass536_2.anInt5438 * -621510697) {
				if (Class536.aClass536_6 == this.aClass536_11) {
					this.aClass536_11 = Class536.aClass536_2;
				} else {
					this.aClass536_11 = Class536.aClass536_8;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!rw", name = "bk", descriptor = "()V")
	public void method31020() {
		if (this.aClass536_11 == Class536.aClass536_3) {
			@Pc(8) Class639 local8 = this.anInterface70_1.method32748(-965905303);
			if (Class639.aClass639_3 == local8) {
				this.aClass536_11 = Class536.aClass536_4;
			}
		}
		@Pc(38) boolean local38;
		if (this.aClass536_11 == Class536.aClass536_4 && this.aBoolean809) {
			@Pc(31) Class535 local31 = this.aClass146_3.method11674(this.anInterface70_1.method32712(1009769798), (byte) 116);
			if (local31 != null) {
				local38 = this.anInterface70_1.method32708(2045886865);
				@Pc(43) Class518 local43 = new Class518(this);
				@Pc(84) boolean local84 = local31.method30819(local38 ? null : this.anInterface70_1.method32710(0, 536926244), local38 ? local43 : null, this.anInt5444 * 1397727437, this.anInt5445 * 1084945595 > 0 ? 0.0F : this.aFloat339, false, this.aBoolean810, this.anInt5442 * 722478837, this.aFloat341, this, 1980668717);
				if (local84) {
					this.aClass536_11 = Class536.aClass536_5;
					local31.method30868(this.anInterface58_6, -1661705536);
					local31.method30817(this.aFloat339, this.anInt5445 * 1084945595, -37570847);
					local31.method30820(2102025745);
					this.aList21.add(local31);
					this.aBoolean809 = false;
				} else {
					if (local31.method30882(-1999226342) == Class511.aClass511_8) {
						this.aClass536_11 = Class536.aClass536_8;
					}
					local31.method30816((byte) 8);
				}
			}
		}
		@Pc(131) Iterator local131 = this.aList21.iterator();
		local38 = true;
		while (true) {
			while (local131.hasNext()) {
				@Pc(140) Class535 local140 = (Class535) local131.next();
				if (local140.method30848(-2087611449) == this) {
					if (Class536.aClass536_6 == this.aClass536_11) {
						if (local140.method30818(-2007417145) == 0.0F) {
							local140.method30821(-1094787234);
						} else {
							local38 = false;
						}
					}
					if (local140.method30814((byte) -25) || local140.method30913(-511245246)) {
						local140.method30816((byte) 8);
						local131.remove();
					} else {
						local38 = false;
					}
				} else {
					local131.remove();
				}
			}
			if (local38 && this.aClass536_11.anInt5438 * -621510697 >= Class536.aClass536_5.anInt5438 * -621510697 && this.aClass536_11.anInt5438 * -621510697 < Class536.aClass536_2.anInt5438 * -621510697) {
				if (Class536.aClass536_6 == this.aClass536_11) {
					this.aClass536_11 = Class536.aClass536_2;
				} else {
					this.aClass536_11 = Class536.aClass536_8;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!rw", name = "bh", descriptor = "()V")
	public void method31021() {
		if (this.aClass536_11 == Class536.aClass536_3) {
			@Pc(8) Class639 local8 = this.anInterface70_1.method32748(-1867497882);
			if (Class639.aClass639_3 == local8) {
				this.aClass536_11 = Class536.aClass536_4;
			}
		}
		@Pc(38) boolean local38;
		if (this.aClass536_11 == Class536.aClass536_4 && this.aBoolean809) {
			@Pc(31) Class535 local31 = this.aClass146_3.method11674(this.anInterface70_1.method32712(1217178029), (byte) 57);
			if (local31 != null) {
				local38 = this.anInterface70_1.method32708(93896837);
				@Pc(43) Class518 local43 = new Class518(this);
				@Pc(84) boolean local84 = local31.method30819(local38 ? null : this.anInterface70_1.method32710(0, 750174722), local38 ? local43 : null, this.anInt5444 * 1397727437, this.anInt5445 * 1084945595 > 0 ? 0.0F : this.aFloat339, false, this.aBoolean810, this.anInt5442 * 722478837, this.aFloat341, this, 1325443871);
				if (local84) {
					this.aClass536_11 = Class536.aClass536_5;
					local31.method30868(this.anInterface58_6, -668552746);
					local31.method30817(this.aFloat339, this.anInt5445 * 1084945595, -37570847);
					local31.method30820(268925977);
					this.aList21.add(local31);
					this.aBoolean809 = false;
				} else {
					if (local31.method30882(-2020195530) == Class511.aClass511_8) {
						this.aClass536_11 = Class536.aClass536_8;
					}
					local31.method30816((byte) 8);
				}
			}
		}
		@Pc(131) Iterator local131 = this.aList21.iterator();
		local38 = true;
		while (true) {
			while (local131.hasNext()) {
				@Pc(140) Class535 local140 = (Class535) local131.next();
				if (local140.method30848(-2087611449) == this) {
					if (Class536.aClass536_6 == this.aClass536_11) {
						if (local140.method30818(-437375755) == 0.0F) {
							local140.method30821(-56427456);
						} else {
							local38 = false;
						}
					}
					if (local140.method30814((byte) 16) || local140.method30913(-511245246)) {
						local140.method30816((byte) 8);
						local131.remove();
					} else {
						local38 = false;
					}
				} else {
					local131.remove();
				}
			}
			if (local38 && this.aClass536_11.anInt5438 * -621510697 >= Class536.aClass536_5.anInt5438 * -621510697 && this.aClass536_11.anInt5438 * -621510697 < Class536.aClass536_2.anInt5438 * -621510697) {
				if (Class536.aClass536_6 == this.aClass536_11) {
					this.aClass536_11 = Class536.aClass536_2;
				} else {
					this.aClass536_11 = Class536.aClass536_8;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!rw", name = "bx", descriptor = "()Lclient!rs;")
	public Class536 method31022() {
		return this.aClass536_11;
	}

	@OriginalMember(owner = "client!rw", name = "bd", descriptor = "()Lclient!rs;")
	public Class536 method31023() {
		return this.aClass536_11;
	}

	@OriginalMember(owner = "client!rw", name = "cw", descriptor = "()Z")
	public boolean method31024() {
		this.aBoolean811 = false;
		return this.anInt5443 * 1064024733 != 0;
	}

	@OriginalMember(owner = "client!rw", name = "ap", descriptor = "()V")
	public void method31025() {
		if (!this.aBoolean809 && (this.aClass536_11 != Class536.aClass536_9 && Class536.aClass536_10 != this.aClass536_11 && Class536.aClass536_7 != this.aClass536_11 && this.aClass536_11 != Class536.aClass536_6 && (this.aClass536_11.anInt5438 * -621510697 <= Class536.aClass536_1.anInt5438 * -621510697 || this.aClass536_11.anInt5438 * -621510697 >= Class536.aClass536_2.anInt5438 * -621510697))) {
			this.aClass536_11 = Class536.aClass536_3;
		}
	}

	@OriginalMember(owner = "client!rw", name = "az", descriptor = "()V")
	public void method31026() {
		@Pc(3) Iterator local3 = this.aList21.iterator();
		this.aClass536_11 = Class536.aClass536_2;
		while (local3.hasNext()) {
			@Pc(13) Class535 local13 = (Class535) local3.next();
			if (local13.method30848(-2087611449) == this) {
				local13.method30834(516326134);
			}
		}
	}

	@OriginalMember(owner = "client!rw", name = "am", descriptor = "(Lclient!wr;)V")
	public void method31027(@OriginalArg(0) Interface70 arg0) {
		this.anInterface70_1 = arg0;
		this.aFloat339 = 0.0F;
		this.aClass536_11 = Class536.aClass536_1;
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(I)F")
	public float method31028(@OriginalArg(0) int arg0) {
		return this.aFloat340;
	}

	@OriginalMember(owner = "client!rw", name = "bm", descriptor = "(Ljava/lang/Object;)V")
	public void method31029(@OriginalArg(0) Object arg0) {
		this.anObject25 = arg0;
	}

	@OriginalMember(owner = "client!rw", name = "bb", descriptor = "(Ljava/lang/Object;)V")
	public void method31030(@OriginalArg(0) Object arg0) {
		this.anObject25 = arg0;
	}

	@OriginalMember(owner = "client!rw", name = "be", descriptor = "()Ljava/lang/Object;")
	public Object method31031() {
		return this.anObject25;
	}

	@OriginalMember(owner = "client!rw", name = "cv", descriptor = "(F)V")
	public void method31032(@OriginalArg(0) float arg0) {
		this.aFloat340 = arg0;
	}

	@OriginalMember(owner = "client!rw", name = "f", descriptor = "(I)V")
	public void method31033(@OriginalArg(0) int arg0) {
		if (Class536.aClass536_9 == this.aClass536_11 || this.aClass536_11 == Class536.aClass536_10 || Class536.aClass536_7 == this.aClass536_11 || this.aClass536_11 == Class536.aClass536_6) {
			return;
		}
		if ((Class536.aClass536_3 == this.aClass536_11 || Class536.aClass536_4 == this.aClass536_11) && !this.aBoolean809) {
			this.aBoolean809 = true;
		} else if (this.aClass536_11.anInt5438 * -621510697 < Class536.aClass536_3.anInt5438 * -621510697 || this.aClass536_11.anInt5438 * -621510697 >= Class536.aClass536_2.anInt5438 * -621510697) {
			this.aClass536_11 = Class536.aClass536_3;
			this.aBoolean809 = true;
		}
	}

	@OriginalMember(owner = "client!rw", name = "bw", descriptor = "(I)V")
	public void method31034(@OriginalArg(0) int arg0) {
		this.anInt5444 = arg0 * 1720273925;
	}

	@OriginalMember(owner = "client!rw", name = "bo", descriptor = "(I)V")
	public void method31035(@OriginalArg(0) int arg0) {
		this.anInt5444 = arg0 * 1720273925;
	}

	@OriginalMember(owner = "client!rw", name = "bz", descriptor = "(Z)V")
	public void method31036(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!rw", name = "aq", descriptor = "()V")
	public void method31037() {
		if (!this.aBoolean809 && (this.aClass536_11 != Class536.aClass536_9 && Class536.aClass536_10 != this.aClass536_11 && Class536.aClass536_7 != this.aClass536_11 && this.aClass536_11 != Class536.aClass536_6 && (this.aClass536_11.anInt5438 * -621510697 <= Class536.aClass536_1.anInt5438 * -621510697 || this.aClass536_11.anInt5438 * -621510697 >= Class536.aClass536_2.anInt5438 * -621510697))) {
			this.aClass536_11 = Class536.aClass536_3;
		}
	}

	@OriginalMember(owner = "client!rw", name = "br", descriptor = "(Z)V")
	public void method31038(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!rw", name = "by", descriptor = "()I")
	public int method31039() {
		return this.anInt5444 * 1397727437;
	}

	@OriginalMember(owner = "client!rw", name = "c", descriptor = "(Ljava/lang/Object;B)V")
	public void method31040(@OriginalArg(0) Object arg0, @OriginalArg(1) byte arg1) {
		this.anObject26 = arg0;
	}

	@OriginalMember(owner = "client!rw", name = "cf", descriptor = "(FI)V")
	public void method31041(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1) {
		this.aFloat339 = arg0;
		@Pc(4) int local4 = 0;
		@Pc(8) Iterator local8 = this.aList21.iterator();
		while (local8.hasNext()) {
			@Pc(15) Class535 local15 = (Class535) local8.next();
			if (local15.method30848(-2087611449) == this) {
				local15.method30817(this.aFloat339, arg1, -37570847);
				local4++;
			} else {
				this.aList21.remove(local15);
			}
		}
		if (local4 == 0) {
			this.anInt5445 = arg1 * 862138483;
		}
	}

	@OriginalMember(owner = "client!rw", name = "bj", descriptor = "(Lclient!ox;)V")
	public void method31042(@OriginalArg(0) Class472 arg0) {
		this.aClass472_63 = arg0;
	}

	@OriginalMember(owner = "client!rw", name = "bs", descriptor = "(Lclient!ox;)V")
	public void method31043(@OriginalArg(0) Class472 arg0) {
		this.aClass472_63 = arg0;
	}

	@OriginalMember(owner = "client!rw", name = "cl", descriptor = "(Lclient!ox;)V")
	public void method31044(@OriginalArg(0) Class472 arg0) {
		this.aClass472_63 = arg0;
	}

	@OriginalMember(owner = "client!rw", name = "cg", descriptor = "()Lclient!ox;")
	public Class472 method31045() {
		return this.aClass472_63;
	}

	@OriginalMember(owner = "client!rw", name = "ce", descriptor = "()Lclient!ox;")
	public Class472 method31046() {
		return this.aClass472_63;
	}

	@OriginalMember(owner = "client!rw", name = "ad", descriptor = "(Lclient!wr;)V")
	public void method31047(@OriginalArg(0) Interface70 arg0) {
		this.anInterface70_1 = arg0;
		this.aFloat339 = 0.0F;
		this.aClass536_11 = Class536.aClass536_1;
	}

	@OriginalMember(owner = "client!rw", name = "ci", descriptor = "()F")
	public float method31048() {
		return this.aFloat340;
	}

	@OriginalMember(owner = "client!rw", name = "cn", descriptor = "()F")
	public float method31049() {
		return this.aFloat338;
	}

	@OriginalMember(owner = "client!rw", name = "o", descriptor = "(I)Ljava/lang/Object;")
	public Object method31050(@OriginalArg(0) int arg0) {
		return this.anObject25;
	}

	@OriginalMember(owner = "client!rw", name = "ca", descriptor = "(F)V")
	public void method31051(@OriginalArg(0) float arg0) {
		this.aFloat338 = arg0;
	}

	@OriginalMember(owner = "client!rw", name = "bp", descriptor = "(Lclient!ox;)V")
	public void method31052(@OriginalArg(0) Class472 arg0) {
		this.aClass472_63 = arg0;
	}

	@OriginalMember(owner = "client!rw", name = "cx", descriptor = "(F)V")
	public void method31053(@OriginalArg(0) float arg0) {
		this.aFloat338 = arg0;
	}

	@OriginalMember(owner = "client!rw", name = "bg", descriptor = "()Lclient!wr;")
	public Interface70 method31054() {
		return this.anInterface70_1;
	}

	@OriginalMember(owner = "client!rw", name = "ct", descriptor = "()Z")
	public boolean method31055() {
		this.aBoolean811 = false;
		return this.anInt5443 * 1064024733 != 0;
	}

	@OriginalMember(owner = "client!rw", name = "j", descriptor = "(FB)V")
	public void method31056(@OriginalArg(0) float arg0, @OriginalArg(1) byte arg1) {
		this.aFloat338 = arg0;
	}

	@OriginalMember(owner = "client!rw", name = "co", descriptor = "(FI)V")
	public void method31057(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1) {
		this.aFloat339 = arg0;
		@Pc(4) int local4 = 0;
		@Pc(8) Iterator local8 = this.aList21.iterator();
		while (local8.hasNext()) {
			@Pc(15) Class535 local15 = (Class535) local8.next();
			if (local15.method30848(-2087611449) == this) {
				local15.method30817(this.aFloat339, arg1, -37570847);
				local4++;
			} else {
				this.aList21.remove(local15);
			}
		}
		if (local4 == 0) {
			this.anInt5445 = arg1 * 862138483;
		}
	}

	@OriginalMember(owner = "client!rw", name = "cr", descriptor = "(FI)V")
	public void method31058(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1) {
		this.aFloat339 = arg0;
		@Pc(4) int local4 = 0;
		@Pc(8) Iterator local8 = this.aList21.iterator();
		while (local8.hasNext()) {
			@Pc(15) Class535 local15 = (Class535) local8.next();
			if (local15.method30848(-2087611449) == this) {
				local15.method30817(this.aFloat339, arg1, -37570847);
				local4++;
			} else {
				this.aList21.remove(local15);
			}
		}
		if (local4 == 0) {
			this.anInt5445 = arg1 * 862138483;
		}
	}

	@OriginalMember(owner = "client!rw", name = "bq", descriptor = "()Ljava/lang/Object;")
	public Object method31059() {
		return this.anObject26;
	}

	@OriginalMember(owner = "client!rw", name = "cq", descriptor = "(ZI)V")
	public void method31060(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		this.aBoolean810 = arg0;
		this.anInt5442 = arg1 * 1557714269;
	}

	@OriginalMember(owner = "client!rw", name = "bv", descriptor = "(Z)V")
	public void method31061(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!rw", name = "cb", descriptor = "(F)V")
	public void method31062(@OriginalArg(0) float arg0) {
		if (!(arg0 < 0.0F)) {
			this.aFloat341 = arg0;
		}
	}
}
