package com.jagex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public class Class258 {

	@OriginalMember(owner = "client!fb", name = "n", descriptor = "I")
	static final int anInt3855 = 8192;

	@OriginalMember(owner = "client!fb", name = "m", descriptor = "I")
	static final int anInt3856 = 16384;

	@OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
	static final int anInt3857 = 0;

	@OriginalMember(owner = "client!fb", name = "k", descriptor = "I")
	static final int anInt3858 = 8192;

	@OriginalMember(owner = "client!fb", name = "l", descriptor = "I")
	static final int anInt3859 = 4096;

	@OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
	static final int anInt3860 = 16384;

	@OriginalMember(owner = "client!fb", name = "w", descriptor = "I")
	static final int anInt3863 = 4096;

	@OriginalMember(owner = "client!fb", name = "v", descriptor = "Lclient!eb;")
	Class240 aClass240_71;

	@OriginalMember(owner = "client!fb", name = "t", descriptor = "Z")
	boolean aBoolean665;

	@OriginalMember(owner = "client!fb", name = "u", descriptor = "Z")
	boolean aBoolean666;

	@OriginalMember(owner = "client!fb", name = "j", descriptor = "I")
	int anInt3861;

	@OriginalMember(owner = "client!fb", name = "o", descriptor = "Lclient!eb;")
	Class240 aClass240_72;

	@OriginalMember(owner = "client!fb", name = "s", descriptor = "Lclient!eb;")
	Class240 aClass240_73;

	@OriginalMember(owner = "client!fb", name = "y", descriptor = "I")
	int anInt3862;

	@OriginalMember(owner = "client!fb", name = "h", descriptor = "Lclient!rw;")
	Class539 aClass539_5;

	@OriginalMember(owner = "client!fb", name = "i", descriptor = "I")
	int anInt3864;

	@OriginalMember(owner = "client!fb", name = "q", descriptor = "Lclient!ox;")
	Class472 aClass472_60;

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
	int anInt3865;

	@OriginalMember(owner = "client!fb", name = "z", descriptor = "Ljava/util/List;")
	List aList5 = new ArrayList();

	@OriginalMember(owner = "client!fb", name = "p", descriptor = "Ljava/util/List;")
	List aList6 = new ArrayList();

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "Ljava/util/HashMap;")
	HashMap aHashMap7 = new HashMap();

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "Ljava/util/HashMap;")
	HashMap aHashMap8 = new HashMap();

	@OriginalMember(owner = "client!fb", name = "r", descriptor = "Ljava/util/List;")
	List aList7 = new ArrayList();

	@OriginalMember(owner = "client!fb", name = "x", descriptor = "Ljava/util/HashMap;")
	HashMap aHashMap6 = new HashMap();

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "Lclient!rw;")
	Class539 aClass539_6 = null;

	@OriginalMember(owner = "client!fb", name = "g", descriptor = "Z")
	boolean aBoolean667 = false;

	@OriginalMember(owner = "client!fb", name = "ae", descriptor = "Lclient!ro;")
	Interface58 anInterface58_2 = new Class269(this);

	@OriginalMember(owner = "client!fb", name = "ag", descriptor = "Lclient!ro;")
	Interface58 anInterface58_1 = new Class260(this);

	@OriginalMember(owner = "client!fb", name = "ah", descriptor = "Lclient!ro;")
	Interface58 anInterface58_3 = new Class277(this);

	@OriginalMember(owner = "client!fb", name = "al", descriptor = "Lclient!ro;")
	Interface58 anInterface58_4 = new Class264(this);

	@OriginalMember(owner = "client!fb", name = "e", descriptor = "(II)Lclient!ii;", line = 20)
	public static Class338 method26026(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == Class338.aClass338_6.anInt4184 * -210852351) {
			return Class338.aClass338_6;
		} else if (Class338.aClass338_4.anInt4184 * -210852351 == arg0) {
			return Class338.aClass338_4;
		} else if (arg0 == Class338.aClass338_5.anInt4184 * -210852351) {
			return Class338.aClass338_5;
		} else if (Class338.aClass338_7.anInt4184 * -210852351 == arg0) {
			return Class338.aClass338_7;
		} else if (Class338.aClass338_9.anInt4184 * -210852351 == arg0) {
			return Class338.aClass338_9;
		} else if (arg0 == Class338.aClass338_8.anInt4184 * -210852351) {
			return Class338.aClass338_8;
		} else if (arg0 == Class338.aClass338_3.anInt4184 * -210852351) {
			return Class338.aClass338_3;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!fb", name = "k", descriptor = "(IIII)I", line = 43)
	public static int method26027(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7 = Class8.method132(arg2 - arg1 + 1, -901952151);
		@Pc(11) int local11 = local7 << arg1;
		return arg0 | local11;
	}

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "(Lclient!yf;B)V", line = 71)
	static void method26028(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class662.method32848(-567231501);
	}

	@OriginalMember(owner = "client!fb", name = "e", descriptor = "(I)Ljava/util/List;", line = 241)
	List method26029(@OriginalArg(0) int arg0) {
		return this.aList6;
	}

	@OriginalMember(owner = "client!fb", name = "ap", descriptor = "()Ljava/util/List;", line = 241)
	List method26030() {
		return this.aList6;
	}

	@OriginalMember(owner = "client!fb", name = "aq", descriptor = "()Ljava/util/List;", line = 241)
	List method26031() {
		return this.aList6;
	}

	@OriginalMember(owner = "client!fb", name = "ax", descriptor = "()Ljava/util/List;", line = 245)
	List method26032() {
		return this.aList7;
	}

	@OriginalMember(owner = "client!fb", name = "n", descriptor = "(I)Ljava/util/List;", line = 245)
	List method26033(@OriginalArg(0) int arg0) {
		return this.aList7;
	}

	@OriginalMember(owner = "client!fb", name = "m", descriptor = "(I)Lclient!eb;", line = 249)
	Class240 method26034(@OriginalArg(0) int arg0) {
		return this.aClass240_71;
	}

	@OriginalMember(owner = "client!fb", name = "av", descriptor = "()Lclient!eb;", line = 249)
	Class240 method26035() {
		return this.aClass240_71;
	}

	@OriginalMember(owner = "client!fb", name = "k", descriptor = "(I)Lclient!eb;", line = 253)
	Class240 method26036(@OriginalArg(0) int arg0) {
		return this.aClass240_72;
	}

	@OriginalMember(owner = "client!fb", name = "f", descriptor = "(I)Lclient!ox;", line = 257)
	Class472 method26037(@OriginalArg(0) int arg0) {
		return this.aClass472_60;
	}

	@OriginalMember(owner = "client!fb", name = "ao", descriptor = "()Lclient!ox;", line = 257)
	Class472 method26038() {
		return this.aClass472_60;
	}

	@OriginalMember(owner = "client!fb", name = "w", descriptor = "(III)V", line = 263)
	public void method26039(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean666) {
			return;
		}
		this.anInt3862 = arg0 * -450558187;
		this.aClass240_71 = new Class240(arg1, 100);
		this.aClass240_72 = new Class240(10);
		this.aClass240_71.method25828(new Class274(this), (byte) 73);
		@Pc(34) Class657 local34 = new Class657(Class429.aClass429_1);
		Class550.method31028(local34, -1969954871);
		this.method26060(1670214498);
		this.anInt3865 = -1053037625;
		this.aBoolean666 = true;
	}

	@OriginalMember(owner = "client!fb", name = "l", descriptor = "(S)V", line = 291)
	public void method26040(@OriginalArg(0) short arg0) {
		if (!this.aBoolean666) {
			return;
		}
		Class220.method25541((byte) 91);
		if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 != null && Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method24220() != null) {
			if (this.aClass472_60 == null) {
				this.aClass472_60 = new Class472();
			}
			this.aClass472_60.aFloat317 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method24220().aClass472_61.aFloat317;
			this.aClass472_60.aFloat318 = 0.0F;
			this.aClass472_60.aFloat319 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method24220().aClass472_61.aFloat319;
		}
		@Pc(42) Iterator local42 = this.aHashMap7.values().iterator();
		@Pc(49) Interface70 local49;
		while (local42.hasNext()) {
			local49 = (Interface70) local42.next();
			local49.method32526((byte) 110);
		}
		local42 = this.aHashMap8.values().iterator();
		while (local42.hasNext()) {
			local49 = (Interface70) local42.next();
			local49.method32526((byte) 3);
		}
		local42 = this.aList7.iterator();
		while (local42.hasNext()) {
			local49 = (Interface70) local42.next();
			if (local49.method32527(-1367378675)) {
				this.aHashMap8.remove(local49.method32558((byte) -34));
			} else {
				this.aHashMap7.remove(local49.method32558((byte) -18));
			}
		}
		this.aList7.clear();
		if (this.aClass539_6 != null && this.aClass539_6.method30821(-164470200) == Class536.aClass536_4 && !this.aBoolean667 && client.aClass175_2.aClass24_2 != null && Class106.method7570(client.anInt3435 * -849002901, -665799784)) {
			@Pc(134) Class93_Sub22 local134 = Class102.method2588(Class446.aClass446_32, client.aClass175_2.aClass24_2, (byte) 104);
			local134.aClass93_Sub41_Sub2_1.method22406(this.aClass539_6.method30846(1915560699).method32558((byte) 1), (byte) 9);
			client.aClass175_2.method24356(local134, -1501156940);
			this.aBoolean667 = true;
		}
		local42 = this.aList5.iterator();
		while (true) {
			label162: while (true) {
				@Pc(172) Class536 local172;
				@Pc(162) Class539 local162;
				do {
					if (!local42.hasNext()) {
						return;
					}
					local162 = (Class539) local42.next();
					local162.method30872((byte) -7);
					local162.method30817((byte) 63);
					local172 = local162.method30821(4391038);
				} while (local162.method30828(-741803853) != this);
				if (Class536.aClass536_2 == local172 || local172 == Class536.aClass536_8) {
					if (local162.method30835(-1973513122) != Class275.aClass275_5 && local162.method30835(-1973513122) != Class275.aClass275_7) {
						@Pc(382) Iterator local382 = this.aHashMap6.keySet().iterator();
						while (local382.hasNext()) {
							@Pc(390) int local390 = (Integer) local382.next();
							@Pc(397) Class272 local397 = (Class272) this.aHashMap6.get(local390);
							if (local397.method26317((byte) 0).contains(local162)) {
								local397.method26315(local162, 1533041130);
								break;
							}
						}
						local162.method30794(-2132718265);
						this.aList6.remove(local162);
					} else if (this.aClass539_6 == local162) {
						this.aBoolean667 = false;
						this.aClass539_6 = null;
						local162.method30794(-2132718265);
						this.aList6.remove(local162);
					} else {
						@Pc(218) int local218 = local162.method30846(-646596175).method32558((byte) -5);
						@Pc(231) boolean local231 = this.method26069(Class280.aClass280_2.method26450(-1043996060), 1485259192) > 0.0F;
						if (!this.aBoolean665 && local231) {
							if (this.anInt3865 * -2005296631 == local218) {
								this.method26113(local218, 1377457187);
								this.anInt3865 = -1053037625;
							}
							local162.method30794(-2132718265);
							this.aList6.remove(local162);
						} else if (local218 == this.anInt3861 * -1023303443) {
							this.anInt3861 = 802046747;
							this.aBoolean665 = false;
							local162.method30794(-2132718265);
							this.aList6.remove(local162);
							@Pc(282) Iterator local282 = this.aList5.iterator();
							@Pc(289) Class539 local289;
							@Pc(300) int local300;
							do {
								do {
									if (!local282.hasNext()) {
										continue label162;
									}
									local289 = (Class539) local282.next();
								} while (local289.method30835(-1973513122) != Class275.aClass275_5);
								local300 = local289.method30846(1639249933).method32558((byte) 117);
							} while ((this.anInt3865 * -2005296631 != local300 || local289.method30821(-2076416018) != Class536.aClass536_2) && local289.method30821(-831120379) != Class536.aClass536_1 && local289.method30821(1602220473) != Class536.aClass536_3 && local289.method30821(-314527518) != Class536.aClass536_4);
							if (local289.method30821(-192705305) == Class536.aClass536_2) {
								local289.method30812(-1780622732);
							} else {
								local289.method30802(-583845547);
							}
						} else if (local231) {
							if (!this.aBoolean665 || local218 != this.anInt3865 * -2005296631) {
								local162.method30794(-2132718265);
								this.aList6.remove(local162);
							}
							if (!this.aBoolean665 && this.anInt3865 * -2005296631 == local218) {
								this.anInt3865 = -1053037625;
								this.aClass539_5 = null;
							}
						}
					}
				} else if (local162.method30821(-1411041586) != Class536.aClass536_6 && local162.method30837(1624358805) == Class280.aClass280_2.method26450(-267292511)) {
					@Pc(443) boolean local443 = this.method26069(Class280.aClass280_2.method26450(-522191470), 1918774722) > 1.0E-4F;
					if (!local443) {
						local162.method30803(150, (byte) -55);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "aj", descriptor = "()V", line = 291)
	public void method26041() {
		if (!this.aBoolean666) {
			return;
		}
		Class220.method25541((byte) 87);
		if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 != null && Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method24220() != null) {
			if (this.aClass472_60 == null) {
				this.aClass472_60 = new Class472();
			}
			this.aClass472_60.aFloat317 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method24220().aClass472_61.aFloat317;
			this.aClass472_60.aFloat318 = 0.0F;
			this.aClass472_60.aFloat319 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method24220().aClass472_61.aFloat319;
		}
		@Pc(42) Iterator local42 = this.aHashMap7.values().iterator();
		@Pc(49) Interface70 local49;
		while (local42.hasNext()) {
			local49 = (Interface70) local42.next();
			local49.method32526((byte) 30);
		}
		local42 = this.aHashMap8.values().iterator();
		while (local42.hasNext()) {
			local49 = (Interface70) local42.next();
			local49.method32526((byte) 74);
		}
		local42 = this.aList7.iterator();
		while (local42.hasNext()) {
			local49 = (Interface70) local42.next();
			if (local49.method32527(1315257598)) {
				this.aHashMap8.remove(local49.method32558((byte) 102));
			} else {
				this.aHashMap7.remove(local49.method32558((byte) 11));
			}
		}
		this.aList7.clear();
		if (this.aClass539_6 != null && this.aClass539_6.method30821(-1642355702) == Class536.aClass536_4 && !this.aBoolean667 && client.aClass175_2.aClass24_2 != null && Class106.method7570(client.anInt3435 * -849002901, 1896266931)) {
			@Pc(134) Class93_Sub22 local134 = Class102.method2588(Class446.aClass446_32, client.aClass175_2.aClass24_2, (byte) 121);
			local134.aClass93_Sub41_Sub2_1.method22406(this.aClass539_6.method30846(641077404).method32558((byte) -69), (byte) 118);
			client.aClass175_2.method24356(local134, -1662428912);
			this.aBoolean667 = true;
		}
		local42 = this.aList5.iterator();
		while (true) {
			label162: while (true) {
				@Pc(172) Class536 local172;
				@Pc(162) Class539 local162;
				do {
					if (!local42.hasNext()) {
						return;
					}
					local162 = (Class539) local42.next();
					local162.method30872((byte) -28);
					local162.method30817((byte) 19);
					local172 = local162.method30821(222012362);
				} while (local162.method30828(1553070138) != this);
				if (Class536.aClass536_2 == local172 || local172 == Class536.aClass536_8) {
					if (local162.method30835(-1973513122) != Class275.aClass275_5 && local162.method30835(-1973513122) != Class275.aClass275_7) {
						@Pc(382) Iterator local382 = this.aHashMap6.keySet().iterator();
						while (local382.hasNext()) {
							@Pc(390) int local390 = (Integer) local382.next();
							@Pc(397) Class272 local397 = (Class272) this.aHashMap6.get(local390);
							if (local397.method26317((byte) 0).contains(local162)) {
								local397.method26315(local162, 485643979);
								break;
							}
						}
						local162.method30794(-2132718265);
						this.aList6.remove(local162);
					} else if (this.aClass539_6 == local162) {
						this.aBoolean667 = false;
						this.aClass539_6 = null;
						local162.method30794(-2132718265);
						this.aList6.remove(local162);
					} else {
						@Pc(218) int local218 = local162.method30846(2081803468).method32558((byte) 9);
						@Pc(231) boolean local231 = this.method26069(Class280.aClass280_2.method26450(-2017787160), 1275227382) > 0.0F;
						if (!this.aBoolean665 && local231) {
							if (this.anInt3865 * -2005296631 == local218) {
								this.method26113(local218, 605583567);
								this.anInt3865 = -1053037625;
							}
							local162.method30794(-2132718265);
							this.aList6.remove(local162);
						} else if (local218 == this.anInt3861 * -1023303443) {
							this.anInt3861 = 802046747;
							this.aBoolean665 = false;
							local162.method30794(-2132718265);
							this.aList6.remove(local162);
							@Pc(282) Iterator local282 = this.aList5.iterator();
							@Pc(289) Class539 local289;
							@Pc(300) int local300;
							do {
								do {
									if (!local282.hasNext()) {
										continue label162;
									}
									local289 = (Class539) local282.next();
								} while (local289.method30835(-1973513122) != Class275.aClass275_5);
								local300 = local289.method30846(-972162147).method32558((byte) -26);
							} while ((this.anInt3865 * -2005296631 != local300 || local289.method30821(-2120031970) != Class536.aClass536_2) && local289.method30821(149280263) != Class536.aClass536_1 && local289.method30821(1864462437) != Class536.aClass536_3 && local289.method30821(-317806144) != Class536.aClass536_4);
							if (local289.method30821(-634785584) == Class536.aClass536_2) {
								local289.method30812(-1353542638);
							} else {
								local289.method30802(1155566695);
							}
						} else if (local231) {
							if (!this.aBoolean665 || local218 != this.anInt3865 * -2005296631) {
								local162.method30794(-2132718265);
								this.aList6.remove(local162);
							}
							if (!this.aBoolean665 && this.anInt3865 * -2005296631 == local218) {
								this.anInt3865 = -1053037625;
								this.aClass539_5 = null;
							}
						}
					}
				} else if (local162.method30821(78421460) != Class536.aClass536_6 && local162.method30837(1624358805) == Class280.aClass280_2.method26450(-896139035)) {
					@Pc(443) boolean local443 = this.method26069(Class280.aClass280_2.method26450(-1529747117), 1199644082) > 1.0E-4F;
					if (!local443) {
						local162.method30803(150, (byte) -4);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "ay", descriptor = "()V", line = 291)
	public void method26042() {
		if (!this.aBoolean666) {
			return;
		}
		Class220.method25541((byte) 4);
		if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 != null && Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method24220() != null) {
			if (this.aClass472_60 == null) {
				this.aClass472_60 = new Class472();
			}
			this.aClass472_60.aFloat317 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method24220().aClass472_61.aFloat317;
			this.aClass472_60.aFloat318 = 0.0F;
			this.aClass472_60.aFloat319 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method24220().aClass472_61.aFloat319;
		}
		@Pc(42) Iterator local42 = this.aHashMap7.values().iterator();
		@Pc(49) Interface70 local49;
		while (local42.hasNext()) {
			local49 = (Interface70) local42.next();
			local49.method32526((byte) 72);
		}
		local42 = this.aHashMap8.values().iterator();
		while (local42.hasNext()) {
			local49 = (Interface70) local42.next();
			local49.method32526((byte) 89);
		}
		local42 = this.aList7.iterator();
		while (local42.hasNext()) {
			local49 = (Interface70) local42.next();
			if (local49.method32527(1289139381)) {
				this.aHashMap8.remove(local49.method32558((byte) -95));
			} else {
				this.aHashMap7.remove(local49.method32558((byte) 37));
			}
		}
		this.aList7.clear();
		if (this.aClass539_6 != null && this.aClass539_6.method30821(1620647905) == Class536.aClass536_4 && !this.aBoolean667 && client.aClass175_2.aClass24_2 != null && Class106.method7570(client.anInt3435 * -849002901, 136992136)) {
			@Pc(134) Class93_Sub22 local134 = Class102.method2588(Class446.aClass446_32, client.aClass175_2.aClass24_2, (byte) 53);
			local134.aClass93_Sub41_Sub2_1.method22406(this.aClass539_6.method30846(1476839658).method32558((byte) 72), (byte) -35);
			client.aClass175_2.method24356(local134, -1694921473);
			this.aBoolean667 = true;
		}
		local42 = this.aList5.iterator();
		while (true) {
			label162: while (true) {
				@Pc(172) Class536 local172;
				@Pc(162) Class539 local162;
				do {
					if (!local42.hasNext()) {
						return;
					}
					local162 = (Class539) local42.next();
					local162.method30872((byte) 2);
					local162.method30817((byte) 113);
					local172 = local162.method30821(338595390);
				} while (local162.method30828(-1966953840) != this);
				if (Class536.aClass536_2 == local172 || local172 == Class536.aClass536_8) {
					if (local162.method30835(-1973513122) != Class275.aClass275_5 && local162.method30835(-1973513122) != Class275.aClass275_7) {
						@Pc(382) Iterator local382 = this.aHashMap6.keySet().iterator();
						while (local382.hasNext()) {
							@Pc(390) int local390 = (Integer) local382.next();
							@Pc(397) Class272 local397 = (Class272) this.aHashMap6.get(local390);
							if (local397.method26317((byte) 0).contains(local162)) {
								local397.method26315(local162, 1212521254);
								break;
							}
						}
						local162.method30794(-2132718265);
						this.aList6.remove(local162);
					} else if (this.aClass539_6 == local162) {
						this.aBoolean667 = false;
						this.aClass539_6 = null;
						local162.method30794(-2132718265);
						this.aList6.remove(local162);
					} else {
						@Pc(218) int local218 = local162.method30846(1662812140).method32558((byte) 6);
						@Pc(231) boolean local231 = this.method26069(Class280.aClass280_2.method26450(-138673184), 2059284348) > 0.0F;
						if (!this.aBoolean665 && local231) {
							if (this.anInt3865 * -2005296631 == local218) {
								this.method26113(local218, -1471343370);
								this.anInt3865 = -1053037625;
							}
							local162.method30794(-2132718265);
							this.aList6.remove(local162);
						} else if (local218 == this.anInt3861 * -1023303443) {
							this.anInt3861 = 802046747;
							this.aBoolean665 = false;
							local162.method30794(-2132718265);
							this.aList6.remove(local162);
							@Pc(282) Iterator local282 = this.aList5.iterator();
							@Pc(289) Class539 local289;
							@Pc(300) int local300;
							do {
								do {
									if (!local282.hasNext()) {
										continue label162;
									}
									local289 = (Class539) local282.next();
								} while (local289.method30835(-1973513122) != Class275.aClass275_5);
								local300 = local289.method30846(726403815).method32558((byte) 26);
							} while ((this.anInt3865 * -2005296631 != local300 || local289.method30821(1965886975) != Class536.aClass536_2) && local289.method30821(395004136) != Class536.aClass536_1 && local289.method30821(-38189111) != Class536.aClass536_3 && local289.method30821(-314335371) != Class536.aClass536_4);
							if (local289.method30821(2041726049) == Class536.aClass536_2) {
								local289.method30812(-1798881984);
							} else {
								local289.method30802(-268899375);
							}
						} else if (local231) {
							if (!this.aBoolean665 || local218 != this.anInt3865 * -2005296631) {
								local162.method30794(-2132718265);
								this.aList6.remove(local162);
							}
							if (!this.aBoolean665 && this.anInt3865 * -2005296631 == local218) {
								this.anInt3865 = -1053037625;
								this.aClass539_5 = null;
							}
						}
					}
				} else if (local162.method30821(903988764) != Class536.aClass536_6 && local162.method30837(1624358805) == Class280.aClass280_2.method26450(-119557881)) {
					@Pc(443) boolean local443 = this.method26069(Class280.aClass280_2.method26450(-453546902), 1611488077) > 1.0E-4F;
					if (!local443) {
						local162.method30803(150, (byte) -18);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "ab", descriptor = "()V", line = 291)
	public void method26043() {
		if (!this.aBoolean666) {
			return;
		}
		Class220.method25541((byte) 59);
		if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 != null && Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method24220() != null) {
			if (this.aClass472_60 == null) {
				this.aClass472_60 = new Class472();
			}
			this.aClass472_60.aFloat317 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method24220().aClass472_61.aFloat317;
			this.aClass472_60.aFloat318 = 0.0F;
			this.aClass472_60.aFloat319 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method24220().aClass472_61.aFloat319;
		}
		@Pc(42) Iterator local42 = this.aHashMap7.values().iterator();
		@Pc(49) Interface70 local49;
		while (local42.hasNext()) {
			local49 = (Interface70) local42.next();
			local49.method32526((byte) 126);
		}
		local42 = this.aHashMap8.values().iterator();
		while (local42.hasNext()) {
			local49 = (Interface70) local42.next();
			local49.method32526((byte) 72);
		}
		local42 = this.aList7.iterator();
		while (local42.hasNext()) {
			local49 = (Interface70) local42.next();
			if (local49.method32527(-146461654)) {
				this.aHashMap8.remove(local49.method32558((byte) 23));
			} else {
				this.aHashMap7.remove(local49.method32558((byte) -63));
			}
		}
		this.aList7.clear();
		if (this.aClass539_6 != null && this.aClass539_6.method30821(1964992702) == Class536.aClass536_4 && !this.aBoolean667 && client.aClass175_2.aClass24_2 != null && Class106.method7570(client.anInt3435 * -849002901, 1212476275)) {
			@Pc(134) Class93_Sub22 local134 = Class102.method2588(Class446.aClass446_32, client.aClass175_2.aClass24_2, (byte) 6);
			local134.aClass93_Sub41_Sub2_1.method22406(this.aClass539_6.method30846(-1197486227).method32558((byte) 46), (byte) 62);
			client.aClass175_2.method24356(local134, -2097717401);
			this.aBoolean667 = true;
		}
		local42 = this.aList5.iterator();
		while (true) {
			label162: while (true) {
				@Pc(172) Class536 local172;
				@Pc(162) Class539 local162;
				do {
					if (!local42.hasNext()) {
						return;
					}
					local162 = (Class539) local42.next();
					local162.method30872((byte) -106);
					local162.method30817((byte) 96);
					local172 = local162.method30821(1801310057);
				} while (local162.method30828(1670278910) != this);
				if (Class536.aClass536_2 == local172 || local172 == Class536.aClass536_8) {
					if (local162.method30835(-1973513122) != Class275.aClass275_5 && local162.method30835(-1973513122) != Class275.aClass275_7) {
						@Pc(382) Iterator local382 = this.aHashMap6.keySet().iterator();
						while (local382.hasNext()) {
							@Pc(390) int local390 = (Integer) local382.next();
							@Pc(397) Class272 local397 = (Class272) this.aHashMap6.get(local390);
							if (local397.method26317((byte) 0).contains(local162)) {
								local397.method26315(local162, 1873514396);
								break;
							}
						}
						local162.method30794(-2132718265);
						this.aList6.remove(local162);
					} else if (this.aClass539_6 == local162) {
						this.aBoolean667 = false;
						this.aClass539_6 = null;
						local162.method30794(-2132718265);
						this.aList6.remove(local162);
					} else {
						@Pc(218) int local218 = local162.method30846(1092678128).method32558((byte) -91);
						@Pc(231) boolean local231 = this.method26069(Class280.aClass280_2.method26450(-1840453811), 1973055435) > 0.0F;
						if (!this.aBoolean665 && local231) {
							if (this.anInt3865 * -2005296631 == local218) {
								this.method26113(local218, 1917382521);
								this.anInt3865 = -1053037625;
							}
							local162.method30794(-2132718265);
							this.aList6.remove(local162);
						} else if (local218 == this.anInt3861 * -1023303443) {
							this.anInt3861 = 802046747;
							this.aBoolean665 = false;
							local162.method30794(-2132718265);
							this.aList6.remove(local162);
							@Pc(282) Iterator local282 = this.aList5.iterator();
							@Pc(289) Class539 local289;
							@Pc(300) int local300;
							do {
								do {
									if (!local282.hasNext()) {
										continue label162;
									}
									local289 = (Class539) local282.next();
								} while (local289.method30835(-1973513122) != Class275.aClass275_5);
								local300 = local289.method30846(-1864393676).method32558((byte) 12);
							} while ((this.anInt3865 * -2005296631 != local300 || local289.method30821(-1146621956) != Class536.aClass536_2) && local289.method30821(-1334045413) != Class536.aClass536_1 && local289.method30821(-1536948050) != Class536.aClass536_3 && local289.method30821(1387748844) != Class536.aClass536_4);
							if (local289.method30821(-295667929) == Class536.aClass536_2) {
								local289.method30812(-1723502012);
							} else {
								local289.method30802(602381370);
							}
						} else if (local231) {
							if (!this.aBoolean665 || local218 != this.anInt3865 * -2005296631) {
								local162.method30794(-2132718265);
								this.aList6.remove(local162);
							}
							if (!this.aBoolean665 && this.anInt3865 * -2005296631 == local218) {
								this.anInt3865 = -1053037625;
								this.aClass539_5 = null;
							}
						}
					}
				} else if (local162.method30821(2123731041) != Class536.aClass536_6 && local162.method30837(1624358805) == Class280.aClass280_2.method26450(-1178072844)) {
					@Pc(443) boolean local443 = this.method26069(Class280.aClass280_2.method26450(-2121253544), 1308263491) > 1.0E-4F;
					if (!local443) {
						local162.method30803(150, (byte) -49);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "u", descriptor = "(B)V", line = 411)
	public void method26044(@OriginalArg(0) byte arg0) {
		Class536.method30758(-310841590);
	}

	@OriginalMember(owner = "client!fb", name = "az", descriptor = "()V", line = 411)
	public void method26045() {
		Class536.method30758(-1889243985);
	}

	@OriginalMember(owner = "client!fb", name = "aa", descriptor = "()V", line = 411)
	public void method26046() {
		Class536.method30758(-2056736686);
	}

	@OriginalMember(owner = "client!fb", name = "af", descriptor = "(Lclient!rw;II)V", line = 415)
	public void method26047(@OriginalArg(0) Class539 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == null) {
			return;
		}
		@Pc(9) Class272 local9 = (Class272) this.aHashMap6.get(arg1);
		if (local9 == null) {
			local9 = new Class272(this);
			this.aHashMap6.put(arg1, local9);
		}
		if (!local9.method26318(arg0, -1821389069)) {
			arg0.method30868(arg2, true, (byte) 3);
			local9.method26310(arg0, -621510697);
		}
	}

	@OriginalMember(owner = "client!fb", name = "ak", descriptor = "(Lclient!rw;II)V", line = 415)
	public void method26048(@OriginalArg(0) Class539 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == null) {
			return;
		}
		@Pc(9) Class272 local9 = (Class272) this.aHashMap6.get(arg1);
		if (local9 == null) {
			local9 = new Class272(this);
			this.aHashMap6.put(arg1, local9);
		}
		if (!local9.method26318(arg0, -1677905037)) {
			arg0.method30868(arg2, true, (byte) 3);
			local9.method26310(arg0, -621510697);
		}
	}

	@OriginalMember(owner = "client!fb", name = "z", descriptor = "(Lclient!rw;III)V", line = 415)
	public void method26049(@OriginalArg(0) Class539 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 == null) {
			return;
		}
		@Pc(9) Class272 local9 = (Class272) this.aHashMap6.get(arg1);
		if (local9 == null) {
			local9 = new Class272(this);
			this.aHashMap6.put(arg1, local9);
		}
		if (!local9.method26318(arg0, -1887217953)) {
			arg0.method30868(arg2, true, (byte) 3);
			local9.method26310(arg0, -621510697);
		}
	}

	@OriginalMember(owner = "client!fb", name = "an", descriptor = "(I)V", line = 428)
	public void method26050(@OriginalArg(0) int arg0) {
		@Pc(6) Class272 local6 = (Class272) this.aHashMap6.get(arg0);
		if (local6 == null) {
			return;
		}
		@Pc(14) List local14 = local6.method26317((byte) 0);
		@Pc(17) Iterator local17 = local14.iterator();
		while (local17.hasNext()) {
			@Pc(24) Class539 local24 = (Class539) local17.next();
			if (!local24.method30869((byte) 9)) {
				local24.method30802(399391789);
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "bf", descriptor = "(I)V", line = 428)
	public void method26051(@OriginalArg(0) int arg0) {
		@Pc(6) Class272 local6 = (Class272) this.aHashMap6.get(arg0);
		if (local6 == null) {
			return;
		}
		@Pc(14) List local14 = local6.method26317((byte) 0);
		@Pc(17) Iterator local17 = local14.iterator();
		while (local17.hasNext()) {
			@Pc(24) Class539 local24 = (Class539) local17.next();
			if (!local24.method30869((byte) 9)) {
				local24.method30802(-1291842175);
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "bl", descriptor = "(I)V", line = 428)
	public void method26052(@OriginalArg(0) int arg0) {
		@Pc(6) Class272 local6 = (Class272) this.aHashMap6.get(arg0);
		if (local6 == null) {
			return;
		}
		@Pc(14) List local14 = local6.method26317((byte) 0);
		@Pc(17) Iterator local17 = local14.iterator();
		while (local17.hasNext()) {
			@Pc(24) Class539 local24 = (Class539) local17.next();
			if (!local24.method30869((byte) 9)) {
				local24.method30802(611268141);
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "p", descriptor = "(IB)V", line = 428)
	public void method26053(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(6) Class272 local6 = (Class272) this.aHashMap6.get(arg0);
		if (local6 == null) {
			return;
		}
		@Pc(14) List local14 = local6.method26317((byte) 0);
		@Pc(17) Iterator local17 = local14.iterator();
		while (local17.hasNext()) {
			@Pc(24) Class539 local24 = (Class539) local17.next();
			if (!local24.method30869((byte) 9)) {
				local24.method30802(-1690916430);
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "(II)V", line = 442)
	public void method26054(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class272 local6 = (Class272) this.aHashMap6.get(arg0);
		if (local6 == null) {
			return;
		}
		@Pc(14) List local14 = local6.method26317((byte) 0);
		@Pc(17) Iterator local17 = local14.iterator();
		while (local17.hasNext()) {
			@Pc(24) Class539 local24 = (Class539) local17.next();
			local24.method30803(50, (byte) -33);
		}
	}

	@OriginalMember(owner = "client!fb", name = "bk", descriptor = "(I)V", line = 442)
	public void method26055(@OriginalArg(0) int arg0) {
		@Pc(6) Class272 local6 = (Class272) this.aHashMap6.get(arg0);
		if (local6 == null) {
			return;
		}
		@Pc(14) List local14 = local6.method26317((byte) 0);
		@Pc(17) Iterator local17 = local14.iterator();
		while (local17.hasNext()) {
			@Pc(24) Class539 local24 = (Class539) local17.next();
			local24.method30803(50, (byte) -120);
		}
	}

	@OriginalMember(owner = "client!fb", name = "bh", descriptor = "(I)V", line = 442)
	public void method26056(@OriginalArg(0) int arg0) {
		@Pc(6) Class272 local6 = (Class272) this.aHashMap6.get(arg0);
		if (local6 == null) {
			return;
		}
		@Pc(14) List local14 = local6.method26317((byte) 0);
		@Pc(17) Iterator local17 = local14.iterator();
		while (local17.hasNext()) {
			@Pc(24) Class539 local24 = (Class539) local17.next();
			local24.method30803(50, (byte) -19);
		}
	}

	@OriginalMember(owner = "client!fb", name = "bx", descriptor = "(I)V", line = 456)
	public void method26057(@OriginalArg(0) int arg0) {
		@Pc(6) Class272 local6 = (Class272) this.aHashMap6.get(arg0);
		if (local6 == null) {
			return;
		}
		@Pc(14) List local14 = local6.method26317((byte) 0);
		@Pc(17) Iterator local17 = local14.iterator();
		while (local17.hasNext()) {
			@Pc(24) Class539 local24 = (Class539) local17.next();
			local24.method30797(-846646943);
		}
	}

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "(IB)V", line = 456)
	public void method26058(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(6) Class272 local6 = (Class272) this.aHashMap6.get(arg0);
		if (local6 == null) {
			return;
		}
		@Pc(14) List local14 = local6.method26317((byte) 0);
		@Pc(17) Iterator local17 = local14.iterator();
		while (local17.hasNext()) {
			@Pc(24) Class539 local24 = (Class539) local17.next();
			local24.method30797(-774403107);
		}
	}

	@OriginalMember(owner = "client!fb", name = "bd", descriptor = "()V", line = 470)
	void method26059() {
		@Pc(4) Class276 local4 = new Class276(this);
		@Pc(9) Class259 local9 = new Class259(this);
		@Pc(14) Class271 local14 = new Class271(this);
		@Pc(19) Class262 local19 = new Class262(this);
		@Pc(24) Class257 local24 = new Class257(this);
		Class110_Sub1.method6370(Class265.aClass265_1.method26217(-879372832), Class265.aClass265_4.method26217(1020398179), 0.2F, local4, -1378543260);
		Class110_Sub1.method6370(Class265.aClass265_3.method26217(-60685749), Class265.aClass265_4.method26217(-1894146554), 1.0F, local9, 520618924);
		Class110_Sub1.method6370(Class265.aClass265_6.method26217(603455115), Class265.aClass265_4.method26217(-1190469618), 1.0F, local14, -169611191);
		Class110_Sub1.method6370(Class265.aClass265_5.method26217(-94295270), Class265.aClass265_4.method26217(-1041882363), 0.8F, local19, 1977277881);
		Class110_Sub1.method6370(Class265.aClass265_2.method26217(1522528578), Class265.aClass265_4.method26217(1178619353), 1.0F, local24, -87250760);
		Class110_Sub1.method6370(Class280.aClass280_2.method26450(-1134965504), Class265.aClass265_3.method26217(-526628180), 1.0F, null, -433410474);
		Class110_Sub1.method6370(Class280.aClass280_3.method26450(-1805516749), Class265.aClass265_2.method26217(-711420561), 1.0F, null, 40899573);
		Class110_Sub1.method6370(Class280.aClass280_7.method26450(-1808510479), Class265.aClass265_1.method26217(-289584922), 1.0F, null, 1629288366);
		Class110_Sub1.method6370(Class280.aClass280_4.method26450(-392978252), Class265.aClass265_1.method26217(-929184924), 1.0F, null, 1783689295);
		Class110_Sub1.method6370(Class280.aClass280_5.method26450(-778762080), Class265.aClass265_1.method26217(-1958088783), 1.0F, null, -866063594);
		Class110_Sub1.method6370(Class280.aClass280_6.method26450(-1941381945), Class265.aClass265_1.method26217(-1926543781), 1.0F, null, -1198165835);
		Class110_Sub1.method6370(Class280.aClass280_10.method26450(-1341075363), Class265.aClass265_1.method26217(503050909), 1.0F, null, -1617187622);
		Class110_Sub1.method6370(Class280.aClass280_8.method26450(-79455744), Class265.aClass265_5.method26217(-157439684), 1.0F, null, 334926960);
		Class110_Sub1.method6370(Class280.aClass280_9.method26450(-1074442745), Class280.aClass280_8.method26450(-1156203953), 1.0F, null, -1124419262);
		Class110_Sub1.method6370(Class280.aClass280_1.method26450(-1263509935), Class280.aClass280_8.method26450(-1875399962), 1.0F, null, -827795156);
		Class407.method28581(Class280.aClass280_2.method26450(-698047389), 2067632416).method28731(0.75F, -201902882);
	}

	@OriginalMember(owner = "client!fb", name = "r", descriptor = "(I)V", line = 470)
	void method26060(@OriginalArg(0) int arg0) {
		@Pc(4) Class276 local4 = new Class276(this);
		@Pc(9) Class259 local9 = new Class259(this);
		@Pc(14) Class271 local14 = new Class271(this);
		@Pc(19) Class262 local19 = new Class262(this);
		@Pc(24) Class257 local24 = new Class257(this);
		Class110_Sub1.method6370(Class265.aClass265_1.method26217(1485246956), Class265.aClass265_4.method26217(-1525517239), 0.2F, local4, 1562660549);
		Class110_Sub1.method6370(Class265.aClass265_3.method26217(-1311764556), Class265.aClass265_4.method26217(409405508), 1.0F, local9, 1364211785);
		Class110_Sub1.method6370(Class265.aClass265_6.method26217(1268454266), Class265.aClass265_4.method26217(-1819603476), 1.0F, local14, -486540775);
		Class110_Sub1.method6370(Class265.aClass265_5.method26217(-2002399529), Class265.aClass265_4.method26217(-791718622), 0.8F, local19, -77235444);
		Class110_Sub1.method6370(Class265.aClass265_2.method26217(947991789), Class265.aClass265_4.method26217(-1440476594), 1.0F, local24, -35935069);
		Class110_Sub1.method6370(Class280.aClass280_2.method26450(-1030128795), Class265.aClass265_3.method26217(-193879680), 1.0F, null, 121837468);
		Class110_Sub1.method6370(Class280.aClass280_3.method26450(-646220567), Class265.aClass265_2.method26217(1466658115), 1.0F, null, -449850342);
		Class110_Sub1.method6370(Class280.aClass280_7.method26450(-326674320), Class265.aClass265_1.method26217(-2011036476), 1.0F, null, -783171262);
		Class110_Sub1.method6370(Class280.aClass280_4.method26450(-752021314), Class265.aClass265_1.method26217(338633667), 1.0F, null, -569132159);
		Class110_Sub1.method6370(Class280.aClass280_5.method26450(-1361357073), Class265.aClass265_1.method26217(-207452847), 1.0F, null, 602929483);
		Class110_Sub1.method6370(Class280.aClass280_6.method26450(-13617037), Class265.aClass265_1.method26217(-888550763), 1.0F, null, -1135482855);
		Class110_Sub1.method6370(Class280.aClass280_10.method26450(-1372594480), Class265.aClass265_1.method26217(681402945), 1.0F, null, 1616000167);
		Class110_Sub1.method6370(Class280.aClass280_8.method26450(-1240704634), Class265.aClass265_5.method26217(368797792), 1.0F, null, 285044209);
		Class110_Sub1.method6370(Class280.aClass280_9.method26450(-766184352), Class280.aClass280_8.method26450(-1176292723), 1.0F, null, -589198612);
		Class110_Sub1.method6370(Class280.aClass280_1.method26450(-1987058547), Class280.aClass280_8.method26450(-664386962), 1.0F, null, 989101374);
		Class407.method28581(Class280.aClass280_2.method26450(-1292045734), 2079015815).method28731(0.75F, -235765683);
	}

	@OriginalMember(owner = "client!fb", name = "v", descriptor = "(IIIB)V", line = 514)
	public void method26061(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(3) int local3 = Class265.aClass265_4.method26217(-1974972422);
		if (Class407.method28581(arg0, 1734893111) == null && (arg1 == local3 || Class407.method28581(arg1, 2028468516) != null)) {
			@Pc(20) float local20 = (float) arg2 * 1.5258789E-5F;
			Class110_Sub1.method6370(arg0, local3 == arg1 ? -1 : arg1, local20, null, -1624456552);
		}
	}

	@OriginalMember(owner = "client!fb", name = "bc", descriptor = "(III)V", line = 514)
	public void method26062(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = Class265.aClass265_4.method26217(-443075683);
		if (Class407.method28581(arg0, 1860950006) == null && (arg1 == local3 || Class407.method28581(arg1, 1974999396) != null)) {
			@Pc(20) float local20 = (float) arg2 * 1.5258789E-5F;
			Class110_Sub1.method6370(arg0, local3 == arg1 ? -1 : arg1, local20, null, -1573901474);
		}
	}

	@OriginalMember(owner = "client!fb", name = "bi", descriptor = "(III)V", line = 514)
	public void method26063(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = Class265.aClass265_4.method26217(661133128);
		if (Class407.method28581(arg0, 2132870763) == null && (arg1 == local3 || Class407.method28581(arg1, 1896199459) != null)) {
			@Pc(20) float local20 = (float) arg2 * 1.5258789E-5F;
			Class110_Sub1.method6370(arg0, local3 == arg1 ? -1 : arg1, local20, null, -851124445);
		}
	}

	@OriginalMember(owner = "client!fb", name = "o", descriptor = "(III)V", line = 523)
	public void method26064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class420 local3 = Class407.method28581(arg0, 2147061319);
		if (local3 != null) {
			@Pc(11) float local11 = (float) arg1 * 1.5258789E-5F;
			local3.method28731(local11, 456550569);
		}
	}

	@OriginalMember(owner = "client!fb", name = "bt", descriptor = "(II)V", line = 523)
	public void method26065(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class420 local3 = Class407.method28581(arg0, 2097881724);
		if (local3 != null) {
			@Pc(11) float local11 = (float) arg1 * 1.5258789E-5F;
			local3.method28731(local11, -1261579310);
		}
	}

	@OriginalMember(owner = "client!fb", name = "bq", descriptor = "(II)V", line = 523)
	public void method26066(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class420 local3 = Class407.method28581(arg0, 1751673759);
		if (local3 != null) {
			@Pc(11) float local11 = (float) arg1 * 1.5258789E-5F;
			local3.method28731(local11, -1185567996);
		}
	}

	@OriginalMember(owner = "client!fb", name = "bn", descriptor = "(II)V", line = 523)
	public void method26067(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class420 local3 = Class407.method28581(arg0, 2099850255);
		if (local3 != null) {
			@Pc(11) float local11 = (float) arg1 * 1.5258789E-5F;
			local3.method28731(local11, -1440991439);
		}
	}

	@OriginalMember(owner = "client!fb", name = "bb", descriptor = "(I)F", line = 531)
	float method26068(@OriginalArg(0) int arg0) {
		@Pc(3) Class420 local3 = Class407.method28581(arg0, 1966938198);
		@Pc(5) float local5 = 1.0F;
		while (local3 != null) {
			local5 *= local3.method28729(-2147117776);
			local3 = local3.method28735(-1515566640);
		}
		return local5;
	}

	@OriginalMember(owner = "client!fb", name = "s", descriptor = "(II)F", line = 531)
	float method26069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class420 local3 = Class407.method28581(arg0, 1831830354);
		@Pc(5) float local5 = 1.0F;
		while (local3 != null) {
			local5 *= local3.method28729(-2147425009);
			local3 = local3.method28735(-820727811);
		}
		return local5;
	}

	@OriginalMember(owner = "client!fb", name = "bm", descriptor = "(I)F", line = 531)
	float method26070(@OriginalArg(0) int arg0) {
		@Pc(3) Class420 local3 = Class407.method28581(arg0, 1916770109);
		@Pc(5) float local5 = 1.0F;
		while (local3 != null) {
			local5 *= local3.method28729(-2145189047);
			local3 = local3.method28735(1121784022);
		}
		return local5;
	}

	@OriginalMember(owner = "client!fb", name = "be", descriptor = "(I)V", line = 541)
	public void method26071(@OriginalArg(0) int arg0) {
		@Pc(3) Iterator local3 = this.aList6.iterator();
		while (local3.hasNext()) {
			@Pc(10) Class539 local10 = (Class539) local3.next();
			@Pc(14) int local14 = local10.method30837(1624358805);
			@Pc(19) boolean local19 = Class667.method32906(local14, arg0, 443959715);
			if (local19) {
				local10.method30803(50, (byte) -113);
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "y", descriptor = "(IB)V", line = 541)
	public void method26072(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) Iterator local3 = this.aList6.iterator();
		while (local3.hasNext()) {
			@Pc(10) Class539 local10 = (Class539) local3.next();
			@Pc(14) int local14 = local10.method30837(1624358805);
			@Pc(19) boolean local19 = Class667.method32906(local14, arg0, 1355395617);
			if (local19) {
				local10.method30803(50, (byte) -24);
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "by", descriptor = "(I)V", line = 541)
	public void method26073(@OriginalArg(0) int arg0) {
		@Pc(3) Iterator local3 = this.aList6.iterator();
		while (local3.hasNext()) {
			@Pc(10) Class539 local10 = (Class539) local3.next();
			@Pc(14) int local14 = local10.method30837(1624358805);
			@Pc(19) boolean local19 = Class667.method32906(local14, arg0, -1176237185);
			if (local19) {
				local10.method30803(50, (byte) -47);
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "q", descriptor = "([IB)V", line = 553)
	void method26074(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte arg1) {
		if (!this.aBoolean666 || arg0 == null) {
			return;
		}
		@Pc(8) int[] local8 = arg0;
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(18) int local18 = local8[local10];
			this.method26076(local18, (byte) 3);
		}
	}

	@OriginalMember(owner = "client!fb", name = "bu", descriptor = "([I)V", line = 553)
	void method26075(@OriginalArg(0) int[] arg0) {
		if (!this.aBoolean666 || arg0 == null) {
			return;
		}
		@Pc(8) int[] local8 = arg0;
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(18) int local18 = local8[local10];
			this.method26076(local18, (byte) 3);
		}
	}

	@OriginalMember(owner = "client!fb", name = "x", descriptor = "(IB)V", line = 567)
	public void method26076(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (this.aBoolean666 && arg0 >= 0) {
			this.method26082(arg0, false, 1166237895);
		}
	}

	@OriginalMember(owner = "client!fb", name = "bw", descriptor = "(I)V", line = 567)
	public void method26077(@OriginalArg(0) int arg0) {
		if (this.aBoolean666 && arg0 >= 0) {
			this.method26082(arg0, false, 1093410224);
		}
	}

	@OriginalMember(owner = "client!fb", name = "bo", descriptor = "(I)V", line = 567)
	public void method26078(@OriginalArg(0) int arg0) {
		if (this.aBoolean666 && arg0 >= 0) {
			this.method26082(arg0, false, 1551381003);
		}
	}

	@OriginalMember(owner = "client!fb", name = "bz", descriptor = "(I)V", line = 567)
	public void method26079(@OriginalArg(0) int arg0) {
		if (this.aBoolean666 && arg0 >= 0) {
			this.method26082(arg0, false, 656515277);
		}
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(IZI)Lclient!wr;", line = 573)
	Interface70 method26080(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (!this.aBoolean666) {
			return null;
		}
		@Pc(19) Interface70 local19 = (Interface70) (arg1 ? this.aClass240_72.method25829((long) arg0) : this.aClass240_71.method25829((long) arg0));
		if (local19 == null) {
			if (arg1) {
				local19 = (Interface70) this.aHashMap8.get(arg0);
			} else {
				local19 = (Interface70) this.aHashMap7.get(arg0);
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!fb", name = "bv", descriptor = "(IZ)Lclient!wr;", line = 573)
	Interface70 method26081(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (!this.aBoolean666) {
			return null;
		}
		@Pc(19) Interface70 local19 = (Interface70) (arg1 ? this.aClass240_72.method25829((long) arg0) : this.aClass240_71.method25829((long) arg0));
		if (local19 == null) {
			if (arg1) {
				local19 = (Interface70) this.aHashMap8.get(arg0);
			} else {
				local19 = (Interface70) this.aHashMap7.get(arg0);
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!fb", name = "h", descriptor = "(IZI)Lclient!wr;", line = 583)
	Interface70 method26082(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (!this.aBoolean666) {
			return null;
		}
		@Pc(10) Interface70 local10 = this.method26080(arg0, arg1, -1919110769);
		if (local10 == null) {
			@Pc(17) Class267 local17 = new Class267(this);
			local10 = Class445.method28889(arg1 ? Class124.aClass497_93 : Class337.aClass497_103, arg0, local17, arg1, this.aClass240_73, 2137068217);
			if (arg1) {
				this.aHashMap8.put(arg0, local10);
			} else {
				this.aHashMap7.put(arg0, local10);
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!wr;I)Lclient!rw;", line = 610)
	Class539 method26083(@OriginalArg(0) Interface70 arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean666) {
			return null;
		}
		@Pc(6) int local6 = 0;
		@Pc(10) Iterator local10 = this.aList5.iterator();
		@Pc(17) Class539 local17;
		do {
			if (!local10.hasNext()) {
				if (local6 >= this.anInt3862 * -305393603) {
					return null;
				}
				@Pc(42) Class539 local42 = arg0.method32540((byte) 9);
				this.aList5.add(local42);
				return local42;
			}
			local17 = (Class539) local10.next();
			local6++;
		} while (local17.method30821(-1099601928) != Class536.aClass536_10);
		local17.method30788(arg0, 1390505140);
		return local17;
	}

	@OriginalMember(owner = "client!fb", name = "br", descriptor = "(Lclient!wr;)Lclient!rw;", line = 610)
	Class539 method26084(@OriginalArg(0) Interface70 arg0) {
		if (!this.aBoolean666) {
			return null;
		}
		@Pc(6) int local6 = 0;
		@Pc(10) Iterator local10 = this.aList5.iterator();
		@Pc(17) Class539 local17;
		do {
			if (!local10.hasNext()) {
				if (local6 >= this.anInt3862 * -305393603) {
					return null;
				}
				@Pc(42) Class539 local42 = arg0.method32540((byte) 9);
				this.aList5.add(local42);
				return local42;
			}
			local17 = (Class539) local10.next();
			local6++;
		} while (local17.method30821(1415056598) != Class536.aClass536_10);
		local17.method30788(arg0, 1902655868);
		return local17;
	}

	@OriginalMember(owner = "client!fb", name = "bg", descriptor = "(Lclient!wr;)Lclient!rw;", line = 610)
	Class539 method26085(@OriginalArg(0) Interface70 arg0) {
		if (!this.aBoolean666) {
			return null;
		}
		@Pc(6) int local6 = 0;
		@Pc(10) Iterator local10 = this.aList5.iterator();
		@Pc(17) Class539 local17;
		do {
			if (!local10.hasNext()) {
				if (local6 >= this.anInt3862 * -305393603) {
					return null;
				}
				@Pc(42) Class539 local42 = arg0.method32540((byte) 9);
				this.aList5.add(local42);
				return local42;
			}
			local17 = (Class539) local10.next();
			local6++;
		} while (local17.method30821(325239455) != Class536.aClass536_10);
		local17.method30788(arg0, 1385734754);
		return local17;
	}

	@OriginalMember(owner = "client!fb", name = "bp", descriptor = "(Lclient!wr;)Lclient!rw;", line = 610)
	Class539 method26086(@OriginalArg(0) Interface70 arg0) {
		if (!this.aBoolean666) {
			return null;
		}
		@Pc(6) int local6 = 0;
		@Pc(10) Iterator local10 = this.aList5.iterator();
		@Pc(17) Class539 local17;
		do {
			if (!local10.hasNext()) {
				if (local6 >= this.anInt3862 * -305393603) {
					return null;
				}
				@Pc(42) Class539 local42 = arg0.method32540((byte) 9);
				this.aList5.add(local42);
				return local42;
			}
			local17 = (Class539) local10.next();
			local6++;
		} while (local17.method30821(-2059700425) != Class536.aClass536_10);
		local17.method30788(arg0, 1236710652);
		return local17;
	}

	@OriginalMember(owner = "client!fb", name = "ba", descriptor = "(Lclient!wr;)Lclient!rw;", line = 610)
	Class539 method26087(@OriginalArg(0) Interface70 arg0) {
		if (!this.aBoolean666) {
			return null;
		}
		@Pc(6) int local6 = 0;
		@Pc(10) Iterator local10 = this.aList5.iterator();
		@Pc(17) Class539 local17;
		do {
			if (!local10.hasNext()) {
				if (local6 >= this.anInt3862 * -305393603) {
					return null;
				}
				@Pc(42) Class539 local42 = arg0.method32540((byte) 9);
				this.aList5.add(local42);
				return local42;
			}
			local17 = (Class539) local10.next();
			local6++;
		} while (local17.method30821(-519355255) != Class536.aClass536_10);
		local17.method30788(arg0, 1934567319);
		return local17;
	}

	@OriginalMember(owner = "client!fb", name = "g", descriptor = "(Lclient!rw;I)V", line = 631)
	public void method26088(@OriginalArg(0) Class539 arg0, @OriginalArg(1) int arg1) {
		arg0.method30826(this, (byte) 104);
		this.aList6.add(arg0);
	}

	@OriginalMember(owner = "client!fb", name = "bj", descriptor = "(Lclient!rw;)V", line = 631)
	public void method26089(@OriginalArg(0) Class539 arg0) {
		arg0.method30826(this, (byte) 123);
		this.aList6.add(arg0);
	}

	@OriginalMember(owner = "client!fb", name = "bs", descriptor = "(Lclient!rw;)V", line = 631)
	public void method26090(@OriginalArg(0) Class539 arg0) {
		arg0.method30826(this, (byte) 66);
		this.aList6.add(arg0);
	}

	@OriginalMember(owner = "client!fb", name = "cl", descriptor = "(Lclient!ox;Lclient!ox;F)Z", line = 636)
	boolean method26091(@OriginalArg(0) Class472 arg0, @OriginalArg(1) Class472 arg1, @OriginalArg(2) float arg2) {
		@Pc(3) Class472 local3 = Class472.method29579(arg1, arg0);
		return !(local3.method29593() >= arg2);
	}

	@OriginalMember(owner = "client!fb", name = "cg", descriptor = "(Lclient!ox;Lclient!ox;F)Z", line = 636)
	boolean method26092(@OriginalArg(0) Class472 arg0, @OriginalArg(1) Class472 arg1, @OriginalArg(2) float arg2) {
		@Pc(3) Class472 local3 = Class472.method29579(arg1, arg0);
		return !(local3.method29593() >= arg2);
	}

	@OriginalMember(owner = "client!fb", name = "i", descriptor = "(Lclient!ox;Lclient!ox;FI)Z", line = 636)
	boolean method26093(@OriginalArg(0) Class472 arg0, @OriginalArg(1) Class472 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class472 local3 = Class472.method29579(arg1, arg0);
		return !(local3.method29593() >= arg2);
	}

	@OriginalMember(owner = "client!fb", name = "ce", descriptor = "(Lclient!ft;Ljava/lang/Object;IIIILclient!fx;FFLclient!ox;IIZ)Lclient!rw;", line = 642)
	public Class539 method26094(@OriginalArg(0) Class275 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class278 arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) Class472 arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12) {
		if (!this.aBoolean666) {
			return null;
		} else if (arg1 == null) {
			return null;
		} else {
			@Pc(15) int local15 = Math.max(0, Math.min(arg4, 255));
			arg11 = Math.max(0, arg11);
			if (arg6 != Class278.aClass278_2 && !this.method26093(this.aClass472_60, arg9, arg8, 2032723054)) {
				return null;
			}
			if (arg11 <= 0) {
				arg11 = 255;
			}
			@Pc(41) float local41 = (float) local15 / 255.0F;
			@Pc(46) float local46 = (float) arg11 / 255.0F;
			@Pc(52) Interface70 local52 = this.method26082(arg2, arg12, 1290961836);
			@Pc(57) Class539 local57 = this.method26083(local52, -1407185086);
			if (local57 == null) {
				return null;
			}
			local57.method30826(arg1, (byte) 119);
			local57.method30839(arg5, (byte) 114);
			if (Class278.aClass278_2 != arg6) {
				local57.method30842(true, (byte) -29);
				local57.method30849(arg9, -1437671745);
				local57.method30862(arg7, (byte) -113);
				local57.method30867(arg8, (byte) 120);
				if (Class278.aClass278_3 == arg6) {
					local57.method30816(this.anInterface58_1, 421444097);
				} else if (Class278.aClass278_4 == arg6) {
					local57.method30816(this.anInterface58_4, 421444097);
				} else if (Class278.aClass278_5 == arg6) {
					local57.method30816(this.anInterface58_2, 421444097);
				} else if (arg6 == Class278.aClass278_1) {
					local57.method30816(this.anInterface58_3, 421444097);
				} else {
					local57.method30842(false, (byte) -38);
				}
			}
			local57.method30873(local41, 0, -879395823);
			local57.method30879(arg3 > 1 || arg3 < 0, arg3 > 0 ? arg3 - 1 : arg3, (byte) -21);
			local57.method30881(local46, -1785017539);
			local57.method30831(arg0, 1500597812);
			return local57;
		}
	}

	@OriginalMember(owner = "client!fb", name = "cu", descriptor = "(Lclient!ft;Ljava/lang/Object;IIIILclient!fx;FFLclient!ox;IIZ)Lclient!rw;", line = 642)
	public Class539 method26095(@OriginalArg(0) Class275 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class278 arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) Class472 arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12) {
		if (!this.aBoolean666) {
			return null;
		} else if (arg1 == null) {
			return null;
		} else {
			@Pc(15) int local15 = Math.max(0, Math.min(arg4, 255));
			arg11 = Math.max(0, arg11);
			if (arg6 != Class278.aClass278_2 && !this.method26093(this.aClass472_60, arg9, arg8, 1921488655)) {
				return null;
			}
			if (arg11 <= 0) {
				arg11 = 255;
			}
			@Pc(41) float local41 = (float) local15 / 255.0F;
			@Pc(46) float local46 = (float) arg11 / 255.0F;
			@Pc(52) Interface70 local52 = this.method26082(arg2, arg12, 937259086);
			@Pc(57) Class539 local57 = this.method26083(local52, -2040543401);
			if (local57 == null) {
				return null;
			}
			local57.method30826(arg1, (byte) 121);
			local57.method30839(arg5, (byte) 114);
			if (Class278.aClass278_2 != arg6) {
				local57.method30842(true, (byte) -65);
				local57.method30849(arg9, -1400972552);
				local57.method30862(arg7, (byte) -7);
				local57.method30867(arg8, (byte) 66);
				if (Class278.aClass278_3 == arg6) {
					local57.method30816(this.anInterface58_1, 421444097);
				} else if (Class278.aClass278_4 == arg6) {
					local57.method30816(this.anInterface58_4, 421444097);
				} else if (Class278.aClass278_5 == arg6) {
					local57.method30816(this.anInterface58_2, 421444097);
				} else if (arg6 == Class278.aClass278_1) {
					local57.method30816(this.anInterface58_3, 421444097);
				} else {
					local57.method30842(false, (byte) -21);
				}
			}
			local57.method30873(local41, 0, 556354125);
			local57.method30879(arg3 > 1 || arg3 < 0, arg3 > 0 ? arg3 - 1 : arg3, (byte) 93);
			local57.method30881(local46, -1894452056);
			local57.method30831(arg0, 928929362);
			return local57;
		}
	}

	@OriginalMember(owner = "client!fb", name = "ci", descriptor = "(Lclient!ft;Ljava/lang/Object;IIIILclient!fx;FFLclient!ox;IIZ)Lclient!rw;", line = 642)
	public Class539 method26096(@OriginalArg(0) Class275 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class278 arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) Class472 arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12) {
		if (!this.aBoolean666) {
			return null;
		} else if (arg1 == null) {
			return null;
		} else {
			@Pc(15) int local15 = Math.max(0, Math.min(arg4, 255));
			arg11 = Math.max(0, arg11);
			if (arg6 != Class278.aClass278_2 && !this.method26093(this.aClass472_60, arg9, arg8, 2030728190)) {
				return null;
			}
			if (arg11 <= 0) {
				arg11 = 255;
			}
			@Pc(41) float local41 = (float) local15 / 255.0F;
			@Pc(46) float local46 = (float) arg11 / 255.0F;
			@Pc(52) Interface70 local52 = this.method26082(arg2, arg12, 2094042022);
			@Pc(57) Class539 local57 = this.method26083(local52, -1985800628);
			if (local57 == null) {
				return null;
			}
			local57.method30826(arg1, (byte) 38);
			local57.method30839(arg5, (byte) 114);
			if (Class278.aClass278_2 != arg6) {
				local57.method30842(true, (byte) -9);
				local57.method30849(arg9, -2080707623);
				local57.method30862(arg7, (byte) -62);
				local57.method30867(arg8, (byte) 29);
				if (Class278.aClass278_3 == arg6) {
					local57.method30816(this.anInterface58_1, 421444097);
				} else if (Class278.aClass278_4 == arg6) {
					local57.method30816(this.anInterface58_4, 421444097);
				} else if (Class278.aClass278_5 == arg6) {
					local57.method30816(this.anInterface58_2, 421444097);
				} else if (arg6 == Class278.aClass278_1) {
					local57.method30816(this.anInterface58_3, 421444097);
				} else {
					local57.method30842(false, (byte) -1);
				}
			}
			local57.method30873(local41, 0, -1140679393);
			local57.method30879(arg3 > 1 || arg3 < 0, arg3 > 0 ? arg3 - 1 : arg3, (byte) 36);
			local57.method30881(local46, -1482286011);
			local57.method30831(arg0, 1365461884);
			return local57;
		}
	}

	@OriginalMember(owner = "client!fb", name = "j", descriptor = "(Lclient!ft;Ljava/lang/Object;IIIILclient!fx;FFLclient!ox;IIZI)Lclient!rw;", line = 642)
	public Class539 method26097(@OriginalArg(0) Class275 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class278 arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) Class472 arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12, @OriginalArg(13) int arg13) {
		if (!this.aBoolean666) {
			return null;
		} else if (arg1 == null) {
			return null;
		} else {
			@Pc(15) int local15 = Math.max(0, Math.min(arg4, 255));
			arg11 = Math.max(0, arg11);
			if (arg6 != Class278.aClass278_2 && !this.method26093(this.aClass472_60, arg9, arg8, 2040093943)) {
				return null;
			}
			if (arg11 <= 0) {
				arg11 = 255;
			}
			@Pc(41) float local41 = (float) local15 / 255.0F;
			@Pc(46) float local46 = (float) arg11 / 255.0F;
			@Pc(52) Interface70 local52 = this.method26082(arg2, arg12, 1466946962);
			@Pc(57) Class539 local57 = this.method26083(local52, -1974486593);
			if (local57 == null) {
				return null;
			}
			local57.method30826(arg1, (byte) 118);
			local57.method30839(arg5, (byte) 114);
			if (Class278.aClass278_2 != arg6) {
				local57.method30842(true, (byte) -64);
				local57.method30849(arg9, -1516845918);
				local57.method30862(arg7, (byte) -91);
				local57.method30867(arg8, (byte) 43);
				if (Class278.aClass278_3 == arg6) {
					local57.method30816(this.anInterface58_1, 421444097);
				} else if (Class278.aClass278_4 == arg6) {
					local57.method30816(this.anInterface58_4, 421444097);
				} else if (Class278.aClass278_5 == arg6) {
					local57.method30816(this.anInterface58_2, 421444097);
				} else if (arg6 == Class278.aClass278_1) {
					local57.method30816(this.anInterface58_3, 421444097);
				} else {
					local57.method30842(false, (byte) -35);
				}
			}
			local57.method30873(local41, 0, -819469739);
			local57.method30879(arg3 > 1 || arg3 < 0, arg3 > 0 ? arg3 - 1 : arg3, (byte) -39);
			local57.method30881(local46, -340884951);
			local57.method30831(arg0, 1533623912);
			return local57;
		}
	}

	@OriginalMember(owner = "client!fb", name = "t", descriptor = "(Lclient!ft;IIIILclient!fx;FFLclient!ox;IIII)V", line = 690)
	public void method26098(@OriginalArg(0) Class275 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class278 arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) Class472 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		if (!this.aBoolean666) {
			return;
		}
		@Pc(20) Class539 local20 = this.method26097(arg0, this, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, false, -1836777819);
		if (local20 == null) {
			return;
		}
		if (arg11 == 0) {
			local20.method30802(-272219624);
		} else {
			local20.method30868(arg11, false, (byte) 3);
		}
		this.method26088(local20, 1701047418);
	}

	@OriginalMember(owner = "client!fb", name = "cp", descriptor = "(Lclient!ft;IIIILclient!fx;FFLclient!ox;III)V", line = 690)
	public void method26099(@OriginalArg(0) Class275 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class278 arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) Class472 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		if (!this.aBoolean666) {
			return;
		}
		@Pc(20) Class539 local20 = this.method26097(arg0, this, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, false, -1303451193);
		if (local20 == null) {
			return;
		}
		if (arg11 == 0) {
			local20.method30802(-974795371);
		} else {
			local20.method30868(arg11, false, (byte) 3);
		}
		this.method26088(local20, 1585831552);
	}

	@OriginalMember(owner = "client!fb", name = "cv", descriptor = "(Lclient!ft;IIIILclient!fx;FFLclient!ox;III)V", line = 690)
	public void method26100(@OriginalArg(0) Class275 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class278 arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) Class472 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		if (!this.aBoolean666) {
			return;
		}
		@Pc(20) Class539 local20 = this.method26097(arg0, this, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, false, -1181624960);
		if (local20 == null) {
			return;
		}
		if (arg11 == 0) {
			local20.method30802(1521224324);
		} else {
			local20.method30868(arg11, false, (byte) 3);
		}
		this.method26088(local20, 1741638187);
	}

	@OriginalMember(owner = "client!fb", name = "cn", descriptor = "(Lclient!ft;IIIILclient!fx;FFLclient!ox;III)V", line = 690)
	public void method26101(@OriginalArg(0) Class275 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class278 arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) Class472 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		if (!this.aBoolean666) {
			return;
		}
		@Pc(20) Class539 local20 = this.method26097(arg0, this, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, false, 1117075252);
		if (local20 == null) {
			return;
		}
		if (arg11 == 0) {
			local20.method30802(-1552717415);
		} else {
			local20.method30868(arg11, false, (byte) 3);
		}
		this.method26088(local20, 1951379077);
	}

	@OriginalMember(owner = "client!fb", name = "ca", descriptor = "(II)V", line = 700)
	public void method26102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anInt3865 * -2005296631 == arg0) {
			return;
		}
		if (this.aClass539_6 != null) {
			this.aClass539_6.method30803(0, (byte) -74);
			this.method26088(this.aClass539_6, 2019983426);
			this.aClass539_6 = null;
		}
		@Pc(42) Class539 local42 = this.method26097(Class275.aClass275_5, this, arg0, 0, arg1, Class280.aClass280_2.method26450(-444322763), Class278.aClass278_2, 0.0F, 0.0F, null, 0, 255, true, 618482186);
		if (local42 != null) {
			local42.method30797(-1489776424);
			this.aClass539_6 = local42;
		}
		this.aBoolean667 = false;
	}

	@OriginalMember(owner = "client!fb", name = "ae", descriptor = "(III)V", line = 700)
	public void method26103(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt3865 * -2005296631 == arg0) {
			return;
		}
		if (this.aClass539_6 != null) {
			this.aClass539_6.method30803(0, (byte) -82);
			this.method26088(this.aClass539_6, 1835644617);
			this.aClass539_6 = null;
		}
		@Pc(42) Class539 local42 = this.method26097(Class275.aClass275_5, this, arg0, 0, arg1, Class280.aClass280_2.method26450(-51391168), Class278.aClass278_2, 0.0F, 0.0F, null, 0, 255, true, 477590747);
		if (local42 != null) {
			local42.method30797(-981878988);
			this.aClass539_6 = local42;
		}
		this.aBoolean667 = false;
	}

	@OriginalMember(owner = "client!fb", name = "cw", descriptor = "()I", line = 717)
	public int method26104() {
		return this.anInt3865 * -2005296631;
	}

	@OriginalMember(owner = "client!fb", name = "ag", descriptor = "(I)I", line = 717)
	public int method26105(@OriginalArg(0) int arg0) {
		return this.anInt3865 * -2005296631;
	}

	@OriginalMember(owner = "client!fb", name = "cx", descriptor = "()I", line = 717)
	public int method26106() {
		return this.anInt3865 * -2005296631;
	}

	@OriginalMember(owner = "client!fb", name = "ah", descriptor = "(II)V", line = 721)
	public void method26107(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3864 = arg0 * 624068757;
	}

	@OriginalMember(owner = "client!fb", name = "cf", descriptor = "(I)V", line = 721)
	public void method26108(@OriginalArg(0) int arg0) {
		this.anInt3864 = arg0 * 624068757;
	}

	@OriginalMember(owner = "client!fb", name = "cr", descriptor = "(I)V", line = 721)
	public void method26109(@OriginalArg(0) int arg0) {
		this.anInt3864 = arg0 * 624068757;
	}

	@OriginalMember(owner = "client!fb", name = "ct", descriptor = "(I)V", line = 721)
	public void method26110(@OriginalArg(0) int arg0) {
		this.anInt3864 = arg0 * 624068757;
	}

	@OriginalMember(owner = "client!fb", name = "co", descriptor = "(I)V", line = 721)
	public void method26111(@OriginalArg(0) int arg0) {
		this.anInt3864 = arg0 * 624068757;
	}

	@OriginalMember(owner = "client!fb", name = "al", descriptor = "(I)I", line = 725)
	public int method26112(@OriginalArg(0) int arg0) {
		return this.anInt3864 * 1243611837;
	}

	@OriginalMember(owner = "client!fb", name = "ac", descriptor = "(II)V", line = 729)
	void method26113(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (client.aClass175_2.aClass24_2 != null && Class106.method7570(client.anInt3435 * -849002901, 685006130)) {
			@Pc(16) Class93_Sub22 local16 = Class102.method2588(Class446.aClass446_16, client.aClass175_2.aClass24_2, (byte) 68);
			local16.aClass93_Sub41_Sub2_1.method22406(arg0, (byte) -19);
			client.aClass175_2.method24356(local16, -1451410802);
		}
	}

	@OriginalMember(owner = "client!fb", name = "cm", descriptor = "(I)V", line = 729)
	void method26114(@OriginalArg(0) int arg0) {
		if (client.aClass175_2.aClass24_2 != null && Class106.method7570(client.anInt3435 * -849002901, -655128025)) {
			@Pc(16) Class93_Sub22 local16 = Class102.method2588(Class446.aClass446_16, client.aClass175_2.aClass24_2, (byte) 20);
			local16.aClass93_Sub41_Sub2_1.method22406(arg0, (byte) 31);
			client.aClass175_2.method24356(local16, -1869845611);
		}
	}

	@OriginalMember(owner = "client!fb", name = "cq", descriptor = "(I)V", line = 729)
	void method26115(@OriginalArg(0) int arg0) {
		if (client.aClass175_2.aClass24_2 != null && Class106.method7570(client.anInt3435 * -849002901, 1843442190)) {
			@Pc(16) Class93_Sub22 local16 = Class102.method2588(Class446.aClass446_16, client.aClass175_2.aClass24_2, (byte) 45);
			local16.aClass93_Sub41_Sub2_1.method22406(arg0, (byte) -19);
			client.aClass175_2.method24356(local16, -1763428739);
		}
	}

	@OriginalMember(owner = "client!fb", name = "ch", descriptor = "(I)V", line = 729)
	void method26116(@OriginalArg(0) int arg0) {
		if (client.aClass175_2.aClass24_2 != null && Class106.method7570(client.anInt3435 * -849002901, 1662055344)) {
			@Pc(16) Class93_Sub22 local16 = Class102.method2588(Class446.aClass446_16, client.aClass175_2.aClass24_2, (byte) 78);
			local16.aClass93_Sub41_Sub2_1.method22406(arg0, (byte) -4);
			client.aClass175_2.method24356(local16, -1869789087);
		}
	}

	@OriginalMember(owner = "client!fb", name = "cb", descriptor = "(I)V", line = 737)
	public void method26117(@OriginalArg(0) int arg0) {
		this.method26119(arg0, 255, (byte) 0);
	}

	@OriginalMember(owner = "client!fb", name = "ai", descriptor = "(II)V", line = 737)
	public void method26118(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.method26119(arg0, 255, (byte) 0);
	}

	@OriginalMember(owner = "client!fb", name = "aw", descriptor = "(IIB)V", line = 741)
	public void method26119(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		this.method26120(arg0, arg1, false, 0, 0, 0, 0, 0, (byte) 60);
	}

	@OriginalMember(owner = "client!fb", name = "as", descriptor = "(IIZIIIIIB)V", line = 745)
	public void method26120(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) byte arg8) {
		if (!this.aBoolean666 || arg0 == this.anInt3865 * -2005296631) {
			return;
		}
		if (this.aBoolean665 && this.aClass539_5 != null && this.anInt3865 * -2005296631 != arg0) {
			this.aClass539_5.method30812(-1332580930);
			this.aClass539_5.method30794(-2132718265);
			this.aList6.remove(this.aClass539_5);
		}
		@Pc(41) Class539 local41 = this.method26124(-412964737);
		if (local41 != null && local41.method30846(1445253043).method32558((byte) 23) == arg0) {
			this.aClass539_5 = local41;
			this.anInt3865 = local41.method30846(1672841860).method32558((byte) -117) * 1053037625;
			return;
		}
		@Pc(65) boolean local65 = false;
		if (this.anInt3865 * -2005296631 >= 0) {
			@Pc(74) Iterator local74 = this.aList6.iterator();
			while (local74.hasNext()) {
				@Pc(81) Class539 local81 = (Class539) local74.next();
				if (local81.method30835(-1973513122) == Class275.aClass275_5) {
					local81.method30803(2000, (byte) -15);
					local65 = true;
				}
			}
		}
		this.aClass539_5 = null;
		this.anInt3865 = -1053037625;
		@Pc(101) Class539 local101 = null;
		if (this.aClass539_6 != null && this.aClass539_6.method30846(-1134953563) != null && this.aClass539_6.method30846(2141314084).method32558((byte) -58) == arg0 && this.aClass539_6.method30821(1133750656) == Class536.aClass536_4) {
			local101 = this.aClass539_6;
			this.aClass539_6 = null;
			this.aBoolean667 = false;
		}
		@Pc(140) float local140;
		if (local101 == null) {
			if (arg2) {
				local140 = arg6;
				@Pc(143) float local143 = (float) arg7;
				@Pc(152) Class472 local152 = new Class472((float) arg4, 0.0F, (float) arg5);
				local101 = this.method26097(Class275.aClass275_5, this, arg0, 0, local65 ? 0 : arg1, arg0 == this.anInt3864 * 1243611837 ? Class265.aClass265_6.method26217(-1253987631) : Class280.aClass280_2.method26450(-1924302423), Class278.aClass278_1, local140, local143, local152, arg3, 255, true, -1091239599);
			} else {
				local101 = this.method26097(Class275.aClass275_5, this, arg0, 0, local65 ? 0 : arg1, this.anInt3864 * 1243611837 == arg0 ? Class265.aClass265_6.method26217(-56191413) : Class280.aClass280_2.method26450(-31405732), Class278.aClass278_2, 0.0F, 0.0F, null, 0, 255, true, -1774886873);
			}
		}
		if (local101 == null) {
			return;
		}
		if (local65) {
			local140 = (float) arg1 / 255.0F;
			local101.method30873(local140, 2000, -1607230486);
		}
		local101.method30802(-329297020);
		this.method26088(local101, 1542381495);
		this.aClass539_5 = local101;
		this.anInt3865 = arg0 * 1053037625;
		if (this.aBoolean665) {
			this.aClass539_5.method30807((byte) 48);
		}
		if (client.aClass175_2.aClass24_2 != null && Class106.method7570(client.anInt3435 * -849002901, 82706327)) {
			@Pc(270) Class93_Sub22 local270 = Class102.method2588(Class446.aClass446_32, client.aClass175_2.aClass24_2, (byte) 97);
			local270.aClass93_Sub41_Sub2_1.method22406(this.anInt3865 * -2005296631, (byte) 59);
			client.aClass175_2.method24356(local270, -1653271315);
		}
	}

	@OriginalMember(owner = "client!fb", name = "cs", descriptor = "(IIZIIIII)V", line = 745)
	public void method26121(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (!this.aBoolean666 || arg0 == this.anInt3865 * -2005296631) {
			return;
		}
		if (this.aBoolean665 && this.aClass539_5 != null && this.anInt3865 * -2005296631 != arg0) {
			this.aClass539_5.method30812(-1254018984);
			this.aClass539_5.method30794(-2132718265);
			this.aList6.remove(this.aClass539_5);
		}
		@Pc(41) Class539 local41 = this.method26124(-412964737);
		if (local41 != null && local41.method30846(-184001721).method32558((byte) 28) == arg0) {
			this.aClass539_5 = local41;
			this.anInt3865 = local41.method30846(197347992).method32558((byte) -63) * 1053037625;
			return;
		}
		@Pc(65) boolean local65 = false;
		if (this.anInt3865 * -2005296631 >= 0) {
			@Pc(74) Iterator local74 = this.aList6.iterator();
			while (local74.hasNext()) {
				@Pc(81) Class539 local81 = (Class539) local74.next();
				if (local81.method30835(-1973513122) == Class275.aClass275_5) {
					local81.method30803(2000, (byte) -106);
					local65 = true;
				}
			}
		}
		this.aClass539_5 = null;
		this.anInt3865 = -1053037625;
		@Pc(101) Class539 local101 = null;
		if (this.aClass539_6 != null && this.aClass539_6.method30846(-1973695784) != null && this.aClass539_6.method30846(371143743).method32558((byte) 16) == arg0 && this.aClass539_6.method30821(433279941) == Class536.aClass536_4) {
			local101 = this.aClass539_6;
			this.aClass539_6 = null;
			this.aBoolean667 = false;
		}
		@Pc(140) float local140;
		if (local101 == null) {
			if (arg2) {
				local140 = arg6;
				@Pc(143) float local143 = (float) arg7;
				@Pc(152) Class472 local152 = new Class472((float) arg4, 0.0F, (float) arg5);
				local101 = this.method26097(Class275.aClass275_5, this, arg0, 0, local65 ? 0 : arg1, arg0 == this.anInt3864 * 1243611837 ? Class265.aClass265_6.method26217(1537945755) : Class280.aClass280_2.method26450(-279098808), Class278.aClass278_1, local140, local143, local152, arg3, 255, true, 1904354218);
			} else {
				local101 = this.method26097(Class275.aClass275_5, this, arg0, 0, local65 ? 0 : arg1, this.anInt3864 * 1243611837 == arg0 ? Class265.aClass265_6.method26217(97439672) : Class280.aClass280_2.method26450(-1329855208), Class278.aClass278_2, 0.0F, 0.0F, null, 0, 255, true, 1174024700);
			}
		}
		if (local101 == null) {
			return;
		}
		if (local65) {
			local140 = (float) arg1 / 255.0F;
			local101.method30873(local140, 2000, -751499390);
		}
		local101.method30802(-434149700);
		this.method26088(local101, 1753340185);
		this.aClass539_5 = local101;
		this.anInt3865 = arg0 * 1053037625;
		if (this.aBoolean665) {
			this.aClass539_5.method30807((byte) -15);
		}
		if (client.aClass175_2.aClass24_2 != null && Class106.method7570(client.anInt3435 * -849002901, 785427904)) {
			@Pc(270) Class93_Sub22 local270 = Class102.method2588(Class446.aClass446_32, client.aClass175_2.aClass24_2, (byte) 78);
			local270.aClass93_Sub41_Sub2_1.method22406(this.anInt3865 * -2005296631, (byte) -21);
			client.aClass175_2.method24356(local270, -1594166914);
		}
	}

	@OriginalMember(owner = "client!fb", name = "cy", descriptor = "(IIZIIIII)V", line = 745)
	public void method26122(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (!this.aBoolean666 || arg0 == this.anInt3865 * -2005296631) {
			return;
		}
		if (this.aBoolean665 && this.aClass539_5 != null && this.anInt3865 * -2005296631 != arg0) {
			this.aClass539_5.method30812(-1521017288);
			this.aClass539_5.method30794(-2132718265);
			this.aList6.remove(this.aClass539_5);
		}
		@Pc(41) Class539 local41 = this.method26124(-412964737);
		if (local41 != null && local41.method30846(-2053468982).method32558((byte) 64) == arg0) {
			this.aClass539_5 = local41;
			this.anInt3865 = local41.method30846(-126284751).method32558((byte) 114) * 1053037625;
			return;
		}
		@Pc(65) boolean local65 = false;
		if (this.anInt3865 * -2005296631 >= 0) {
			@Pc(74) Iterator local74 = this.aList6.iterator();
			while (local74.hasNext()) {
				@Pc(81) Class539 local81 = (Class539) local74.next();
				if (local81.method30835(-1973513122) == Class275.aClass275_5) {
					local81.method30803(2000, (byte) -66);
					local65 = true;
				}
			}
		}
		this.aClass539_5 = null;
		this.anInt3865 = -1053037625;
		@Pc(101) Class539 local101 = null;
		if (this.aClass539_6 != null && this.aClass539_6.method30846(-1394647028) != null && this.aClass539_6.method30846(1442083817).method32558((byte) 33) == arg0 && this.aClass539_6.method30821(-804530442) == Class536.aClass536_4) {
			local101 = this.aClass539_6;
			this.aClass539_6 = null;
			this.aBoolean667 = false;
		}
		@Pc(140) float local140;
		if (local101 == null) {
			if (arg2) {
				local140 = arg6;
				@Pc(143) float local143 = (float) arg7;
				@Pc(152) Class472 local152 = new Class472((float) arg4, 0.0F, (float) arg5);
				local101 = this.method26097(Class275.aClass275_5, this, arg0, 0, local65 ? 0 : arg1, arg0 == this.anInt3864 * 1243611837 ? Class265.aClass265_6.method26217(-592509842) : Class280.aClass280_2.method26450(-1098341044), Class278.aClass278_1, local140, local143, local152, arg3, 255, true, 540588717);
			} else {
				local101 = this.method26097(Class275.aClass275_5, this, arg0, 0, local65 ? 0 : arg1, this.anInt3864 * 1243611837 == arg0 ? Class265.aClass265_6.method26217(1254597459) : Class280.aClass280_2.method26450(-623388845), Class278.aClass278_2, 0.0F, 0.0F, null, 0, 255, true, -615520877);
			}
		}
		if (local101 == null) {
			return;
		}
		if (local65) {
			local140 = (float) arg1 / 255.0F;
			local101.method30873(local140, 2000, -1943707772);
		}
		local101.method30802(-317877931);
		this.method26088(local101, 2005762434);
		this.aClass539_5 = local101;
		this.anInt3865 = arg0 * 1053037625;
		if (this.aBoolean665) {
			this.aClass539_5.method30807((byte) 32);
		}
		if (client.aClass175_2.aClass24_2 != null && Class106.method7570(client.anInt3435 * -849002901, 194209893)) {
			@Pc(270) Class93_Sub22 local270 = Class102.method2588(Class446.aClass446_32, client.aClass175_2.aClass24_2, (byte) 125);
			local270.aClass93_Sub41_Sub2_1.method22406(this.anInt3865 * -2005296631, (byte) 14);
			client.aClass175_2.method24356(local270, -2039493224);
		}
	}

	@OriginalMember(owner = "client!fb", name = "cc", descriptor = "(IIZIIIII)V", line = 745)
	public void method26123(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (!this.aBoolean666 || arg0 == this.anInt3865 * -2005296631) {
			return;
		}
		if (this.aBoolean665 && this.aClass539_5 != null && this.anInt3865 * -2005296631 != arg0) {
			this.aClass539_5.method30812(-1902992628);
			this.aClass539_5.method30794(-2132718265);
			this.aList6.remove(this.aClass539_5);
		}
		@Pc(41) Class539 local41 = this.method26124(-412964737);
		if (local41 != null && local41.method30846(-88327708).method32558((byte) -102) == arg0) {
			this.aClass539_5 = local41;
			this.anInt3865 = local41.method30846(-199634593).method32558((byte) 29) * 1053037625;
			return;
		}
		@Pc(65) boolean local65 = false;
		if (this.anInt3865 * -2005296631 >= 0) {
			@Pc(74) Iterator local74 = this.aList6.iterator();
			while (local74.hasNext()) {
				@Pc(81) Class539 local81 = (Class539) local74.next();
				if (local81.method30835(-1973513122) == Class275.aClass275_5) {
					local81.method30803(2000, (byte) -124);
					local65 = true;
				}
			}
		}
		this.aClass539_5 = null;
		this.anInt3865 = -1053037625;
		@Pc(101) Class539 local101 = null;
		if (this.aClass539_6 != null && this.aClass539_6.method30846(-651906429) != null && this.aClass539_6.method30846(54162975).method32558((byte) -32) == arg0 && this.aClass539_6.method30821(-1886191338) == Class536.aClass536_4) {
			local101 = this.aClass539_6;
			this.aClass539_6 = null;
			this.aBoolean667 = false;
		}
		@Pc(140) float local140;
		if (local101 == null) {
			if (arg2) {
				local140 = arg6;
				@Pc(143) float local143 = (float) arg7;
				@Pc(152) Class472 local152 = new Class472((float) arg4, 0.0F, (float) arg5);
				local101 = this.method26097(Class275.aClass275_5, this, arg0, 0, local65 ? 0 : arg1, arg0 == this.anInt3864 * 1243611837 ? Class265.aClass265_6.method26217(-1121441313) : Class280.aClass280_2.method26450(-362343553), Class278.aClass278_1, local140, local143, local152, arg3, 255, true, -1047014929);
			} else {
				local101 = this.method26097(Class275.aClass275_5, this, arg0, 0, local65 ? 0 : arg1, this.anInt3864 * 1243611837 == arg0 ? Class265.aClass265_6.method26217(-1916159937) : Class280.aClass280_2.method26450(-1392461095), Class278.aClass278_2, 0.0F, 0.0F, null, 0, 255, true, 613463150);
			}
		}
		if (local101 == null) {
			return;
		}
		if (local65) {
			local140 = (float) arg1 / 255.0F;
			local101.method30873(local140, 2000, -2037269339);
		}
		local101.method30802(1192481778);
		this.method26088(local101, 2097142215);
		this.aClass539_5 = local101;
		this.anInt3865 = arg0 * 1053037625;
		if (this.aBoolean665) {
			this.aClass539_5.method30807((byte) -22);
		}
		if (client.aClass175_2.aClass24_2 != null && Class106.method7570(client.anInt3435 * -849002901, -846112395)) {
			@Pc(270) Class93_Sub22 local270 = Class102.method2588(Class446.aClass446_32, client.aClass175_2.aClass24_2, (byte) 5);
			local270.aClass93_Sub41_Sub2_1.method22406(this.anInt3865 * -2005296631, (byte) 64);
			client.aClass175_2.method24356(local270, -1738844842);
		}
	}

	@OriginalMember(owner = "client!fb", name = "at", descriptor = "(I)Lclient!rw;", line = 811)
	Class539 method26124(@OriginalArg(0) int arg0) {
		@Pc(3) Iterator local3 = this.aList6.iterator();
		@Pc(10) Class539 local10;
		do {
			if (!local3.hasNext()) {
				return null;
			}
			local10 = (Class539) local3.next();
		} while (local10.method30835(-1973513122) != Class275.aClass275_5 || local10.method30821(2012678519) != Class536.aClass536_5);
		return local10;
	}

	@OriginalMember(owner = "client!fb", name = "ck", descriptor = "()Lclient!rw;", line = 811)
	Class539 method26125() {
		@Pc(3) Iterator local3 = this.aList6.iterator();
		@Pc(10) Class539 local10;
		do {
			if (!local3.hasNext()) {
				return null;
			}
			local10 = (Class539) local3.next();
		} while (local10.method30835(-1973513122) != Class275.aClass275_5 || local10.method30821(-469987492) != Class536.aClass536_5);
		return local10;
	}

	@OriginalMember(owner = "client!fb", name = "cz", descriptor = "()Lclient!rw;", line = 811)
	Class539 method26126() {
		@Pc(3) Iterator local3 = this.aList6.iterator();
		@Pc(10) Class539 local10;
		do {
			if (!local3.hasNext()) {
				return null;
			}
			local10 = (Class539) local3.next();
		} while (local10.method30835(-1973513122) != Class275.aClass275_5 || local10.method30821(-256460872) != Class536.aClass536_5);
		return local10;
	}

	@OriginalMember(owner = "client!fb", name = "ad", descriptor = "(I)V", line = 822)
	public void method26127(@OriginalArg(0) int arg0) {
		@Pc(3) Iterator local3 = this.aList6.iterator();
		while (local3.hasNext()) {
			@Pc(10) Class539 local10 = (Class539) local3.next();
			if (local10.method30835(-1973513122) == Class275.aClass275_5) {
				local10.method30803(500, (byte) -99);
				if (local10.method30846(1268282861).method32558((byte) 28) == this.anInt3865 * -2005296631) {
					this.method26113(this.anInt3865 * -2005296631, 429691323);
					break;
				}
			}
		}
		this.aClass539_5 = null;
		this.anInt3865 = -1053037625;
	}

	@OriginalMember(owner = "client!fb", name = "dd", descriptor = "()V", line = 822)
	public void method26128() {
		@Pc(3) Iterator local3 = this.aList6.iterator();
		while (local3.hasNext()) {
			@Pc(10) Class539 local10 = (Class539) local3.next();
			if (local10.method30835(-1973513122) == Class275.aClass275_5) {
				local10.method30803(500, (byte) -95);
				if (local10.method30846(-238437947).method32558((byte) -59) == this.anInt3865 * -2005296631) {
					this.method26113(this.anInt3865 * -2005296631, 1872299608);
					break;
				}
			}
		}
		this.aClass539_5 = null;
		this.anInt3865 = -1053037625;
	}

	@OriginalMember(owner = "client!fb", name = "cj", descriptor = "()V", line = 822)
	public void method26129() {
		@Pc(3) Iterator local3 = this.aList6.iterator();
		while (local3.hasNext()) {
			@Pc(10) Class539 local10 = (Class539) local3.next();
			if (local10.method30835(-1973513122) == Class275.aClass275_5) {
				local10.method30803(500, (byte) -27);
				if (local10.method30846(-1576490350).method32558((byte) -3) == this.anInt3865 * -2005296631) {
					this.method26113(this.anInt3865 * -2005296631, 882311494);
					break;
				}
			}
		}
		this.aClass539_5 = null;
		this.anInt3865 = -1053037625;
	}

	@OriginalMember(owner = "client!fb", name = "cd", descriptor = "()V", line = 822)
	public void method26130() {
		@Pc(3) Iterator local3 = this.aList6.iterator();
		while (local3.hasNext()) {
			@Pc(10) Class539 local10 = (Class539) local3.next();
			if (local10.method30835(-1973513122) == Class275.aClass275_5) {
				local10.method30803(500, (byte) -49);
				if (local10.method30846(1045833557).method32558((byte) -99) == this.anInt3865 * -2005296631) {
					this.method26113(this.anInt3865 * -2005296631, -733665406);
					break;
				}
			}
		}
		this.aClass539_5 = null;
		this.anInt3865 = -1053037625;
	}

	@OriginalMember(owner = "client!fb", name = "dt", descriptor = "(II)V", line = 838)
	public void method26131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean666 || this.aBoolean665 && arg0 == this.anInt3861 * -1023303443) {
			return;
		}
		if (this.aBoolean665 && arg0 != this.anInt3861 * -1023303443) {
			@Pc(26) Iterator local26 = this.aList5.iterator();
			while (local26.hasNext()) {
				@Pc(33) Class539 local33 = (Class539) local26.next();
				if (local33.method30835(-1973513122) == Class275.aClass275_7) {
					local33.method30794(-2132718265);
					this.aList6.remove(local33);
					this.aBoolean665 = false;
					break;
				}
			}
		}
		if (arg1 == 0 || arg0 == -1) {
			return;
		}
		if (!this.aBoolean665 && this.aClass539_5 != null) {
			this.aClass539_5.method30807((byte) 32);
		}
		@Pc(87) Class539 local87 = this.method26097(Class275.aClass275_7, this, arg0, 0, arg1, Class280.aClass280_2.method26450(-1798409093), Class278.aClass278_2, 0.0F, 0.0F, null, 0, 255, true, 205639109);
		if (local87 != null) {
			local87.method30802(-1546480605);
			this.method26088(local87, 1631163800);
			this.aBoolean665 = true;
			this.anInt3861 = arg0 * -802046747;
		}
	}

	@OriginalMember(owner = "client!fb", name = "am", descriptor = "(III)V", line = 838)
	public void method26132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.aBoolean666 || this.aBoolean665 && arg0 == this.anInt3861 * -1023303443) {
			return;
		}
		if (this.aBoolean665 && arg0 != this.anInt3861 * -1023303443) {
			@Pc(26) Iterator local26 = this.aList5.iterator();
			while (local26.hasNext()) {
				@Pc(33) Class539 local33 = (Class539) local26.next();
				if (local33.method30835(-1973513122) == Class275.aClass275_7) {
					local33.method30794(-2132718265);
					this.aList6.remove(local33);
					this.aBoolean665 = false;
					break;
				}
			}
		}
		if (arg1 == 0 || arg0 == -1) {
			return;
		}
		if (!this.aBoolean665 && this.aClass539_5 != null) {
			this.aClass539_5.method30807((byte) -98);
		}
		@Pc(87) Class539 local87 = this.method26097(Class275.aClass275_7, this, arg0, 0, arg1, Class280.aClass280_2.method26450(-1956264270), Class278.aClass278_2, 0.0F, 0.0F, null, 0, 255, true, 1660601453);
		if (local87 != null) {
			local87.method30802(216938236);
			this.method26088(local87, 2114236699);
			this.aBoolean665 = true;
			this.anInt3861 = arg0 * -802046747;
		}
	}

	@OriginalMember(owner = "client!fb", name = "dr", descriptor = "(II)V", line = 838)
	public void method26133(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean666 || this.aBoolean665 && arg0 == this.anInt3861 * -1023303443) {
			return;
		}
		if (this.aBoolean665 && arg0 != this.anInt3861 * -1023303443) {
			@Pc(26) Iterator local26 = this.aList5.iterator();
			while (local26.hasNext()) {
				@Pc(33) Class539 local33 = (Class539) local26.next();
				if (local33.method30835(-1973513122) == Class275.aClass275_7) {
					local33.method30794(-2132718265);
					this.aList6.remove(local33);
					this.aBoolean665 = false;
					break;
				}
			}
		}
		if (arg1 == 0 || arg0 == -1) {
			return;
		}
		if (!this.aBoolean665 && this.aClass539_5 != null) {
			this.aClass539_5.method30807((byte) -93);
		}
		@Pc(87) Class539 local87 = this.method26097(Class275.aClass275_7, this, arg0, 0, arg1, Class280.aClass280_2.method26450(-1819747332), Class278.aClass278_2, 0.0F, 0.0F, null, 0, 255, true, -1454507395);
		if (local87 != null) {
			local87.method30802(-1290360331);
			this.method26088(local87, 1480879833);
			this.aBoolean665 = true;
			this.anInt3861 = arg0 * -802046747;
		}
	}

	@OriginalMember(owner = "client!fb", name = "da", descriptor = "(II)V", line = 838)
	public void method26134(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean666 || this.aBoolean665 && arg0 == this.anInt3861 * -1023303443) {
			return;
		}
		if (this.aBoolean665 && arg0 != this.anInt3861 * -1023303443) {
			@Pc(26) Iterator local26 = this.aList5.iterator();
			while (local26.hasNext()) {
				@Pc(33) Class539 local33 = (Class539) local26.next();
				if (local33.method30835(-1973513122) == Class275.aClass275_7) {
					local33.method30794(-2132718265);
					this.aList6.remove(local33);
					this.aBoolean665 = false;
					break;
				}
			}
		}
		if (arg1 == 0 || arg0 == -1) {
			return;
		}
		if (!this.aBoolean665 && this.aClass539_5 != null) {
			this.aClass539_5.method30807((byte) 18);
		}
		@Pc(87) Class539 local87 = this.method26097(Class275.aClass275_7, this, arg0, 0, arg1, Class280.aClass280_2.method26450(-1148233884), Class278.aClass278_2, 0.0F, 0.0F, null, 0, 255, true, 936058226);
		if (local87 != null) {
			local87.method30802(382507602);
			this.method26088(local87, 1471424179);
			this.aBoolean665 = true;
			this.anInt3861 = arg0 * -802046747;
		}
	}

	@OriginalMember(owner = "client!fb", name = "au", descriptor = "(Lclient!fg;ILclient!alh;B)V", line = 866)
	public void method26135(@OriginalArg(0) Class263 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class132_Sub1 arg2, @OriginalArg(3) byte arg3) {
		if (arg0 == null || arg0.anIntArrayArray47 == null || arg1 >= arg0.anIntArrayArray47.length || arg0.anIntArrayArray47[arg1] == null || (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100 != arg2.aByte100 || !arg2.method24259(1463600065))) {
			return;
		}
		@Pc(34) int local34 = arg0.anIntArrayArray47[arg1][0];
		@Pc(38) int local38 = local34 >> 8;
		@Pc(44) int local44 = local34 >> 5 & 0x7;
		@Pc(48) int local48 = local34 & 0x1F;
		@Pc(65) int local65;
		if (arg0.anIntArrayArray47[arg1].length > 1) {
			local65 = (int) (Math.random() * (double) arg0.anIntArrayArray47[arg1].length);
			if (local65 > 0) {
				local38 = arg0.anIntArrayArray47[arg1][local65];
			}
		}
		local65 = 256;
		if (arg0.anIntArray367 != null && arg0.anIntArray368 != null) {
			local65 = (int) (Math.random() * (double) (arg0.anIntArray368[arg1] - arg0.anIntArray367[arg1])) + arg0.anIntArray367[arg1];
		}
		@Pc(111) int local111 = arg0.anIntArray366 == null ? 255 : arg0.anIntArray366[arg1];
		if (local48 != 0) {
			if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 == arg2) {
				if (Class51.aClass93_Sub36_1.aClass166_Sub35_2.method16226(702597552) == 0) {
					return;
				}
			} else if (Class51.aClass93_Sub36_1.aClass166_Sub35_1.method16226(-1288959692) == 0) {
				return;
			}
			if (arg0.anInt3877 * 432350475 != -1) {
				@Pc(158) int local158 = 0;
				if (arg2 instanceof Class132_Sub1_Sub1_Sub1) {
					local158 = ((Class132_Sub1_Sub1_Sub1) arg2).method20043(514771931);
				} else if (arg2 instanceof Class132_Sub1_Sub1_Sub5) {
					local158 = ((Class132_Sub1_Sub1_Sub5) arg2).method24091(103465883);
				} else if (arg2 instanceof Class132_Sub1_Sub1_Sub4) {
					local158 = ((Class132_Sub1_Sub1_Sub4) arg2).method23911(-1210544208);
				}
				if (local158 != 0 && local158 != Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method20043(1864978156) && client.anInt3433 * -914512487 != local158) {
					local111 = arg0.anInt3877 * 432350475 * local111 / 100;
					if (local111 < 0) {
						local111 = 0;
					} else if (local111 > 255) {
						local111 = 255;
					}
				}
			}
			@Pc(220) Class472 local220 = arg2.method24220().aClass472_61;
			@Pc(228) int local228 = (int) local220.aFloat317 - 256 >> 9;
			@Pc(236) int local236 = (int) local220.aFloat319 - 256 >> 9;
			@Pc(249) Class472 local249 = new Class472((float) (local228 << 9), 0.0F, (float) (local236 << 9));
			@Pc(254) int local254 = arg2.aByte100 << 24;
			this.method26098(Class275.aClass275_1, local38, local44, local111, Class280.aClass280_5.method26450(-1504563824), arg2 == Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 ? Class278.aClass278_2 : Class278.aClass278_5, 0.0F, (float) (local48 << 9), local249, local254, local65, 0, 280411367);
		} else if (arg2 == Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3) {
			this.method26098(Class275.aClass275_6, local38, local44, local111, Class280.aClass280_4.method26450(-1647607350), Class278.aClass278_2, 0.0F, 0.0F, null, arg2.aByte100, local65, 0, 560379812);
		}
	}

	@OriginalMember(owner = "client!fb", name = "do", descriptor = "(Lclient!fg;ILclient!alh;)V", line = 866)
	public void method26136(@OriginalArg(0) Class263 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class132_Sub1 arg2) {
		if (arg0 == null || arg0.anIntArrayArray47 == null || arg1 >= arg0.anIntArrayArray47.length || arg0.anIntArrayArray47[arg1] == null || (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100 != arg2.aByte100 || !arg2.method24259(1520598196))) {
			return;
		}
		@Pc(34) int local34 = arg0.anIntArrayArray47[arg1][0];
		@Pc(38) int local38 = local34 >> 8;
		@Pc(44) int local44 = local34 >> 5 & 0x7;
		@Pc(48) int local48 = local34 & 0x1F;
		@Pc(65) int local65;
		if (arg0.anIntArrayArray47[arg1].length > 1) {
			local65 = (int) (Math.random() * (double) arg0.anIntArrayArray47[arg1].length);
			if (local65 > 0) {
				local38 = arg0.anIntArrayArray47[arg1][local65];
			}
		}
		local65 = 256;
		if (arg0.anIntArray367 != null && arg0.anIntArray368 != null) {
			local65 = (int) (Math.random() * (double) (arg0.anIntArray368[arg1] - arg0.anIntArray367[arg1])) + arg0.anIntArray367[arg1];
		}
		@Pc(111) int local111 = arg0.anIntArray366 == null ? 255 : arg0.anIntArray366[arg1];
		if (local48 != 0) {
			if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 == arg2) {
				if (Class51.aClass93_Sub36_1.aClass166_Sub35_2.method16226(1697536285) == 0) {
					return;
				}
			} else if (Class51.aClass93_Sub36_1.aClass166_Sub35_1.method16226(-1894463157) == 0) {
				return;
			}
			if (arg0.anInt3877 * 432350475 != -1) {
				@Pc(158) int local158 = 0;
				if (arg2 instanceof Class132_Sub1_Sub1_Sub1) {
					local158 = ((Class132_Sub1_Sub1_Sub1) arg2).method20043(655076450);
				} else if (arg2 instanceof Class132_Sub1_Sub1_Sub5) {
					local158 = ((Class132_Sub1_Sub1_Sub5) arg2).method24091(1177722251);
				} else if (arg2 instanceof Class132_Sub1_Sub1_Sub4) {
					local158 = ((Class132_Sub1_Sub1_Sub4) arg2).method23911(-1210544208);
				}
				if (local158 != 0 && local158 != Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method20043(298864541) && client.anInt3433 * -914512487 != local158) {
					local111 = arg0.anInt3877 * 432350475 * local111 / 100;
					if (local111 < 0) {
						local111 = 0;
					} else if (local111 > 255) {
						local111 = 255;
					}
				}
			}
			@Pc(220) Class472 local220 = arg2.method24220().aClass472_61;
			@Pc(228) int local228 = (int) local220.aFloat317 - 256 >> 9;
			@Pc(236) int local236 = (int) local220.aFloat319 - 256 >> 9;
			@Pc(249) Class472 local249 = new Class472((float) (local228 << 9), 0.0F, (float) (local236 << 9));
			@Pc(254) int local254 = arg2.aByte100 << 24;
			this.method26098(Class275.aClass275_1, local38, local44, local111, Class280.aClass280_5.method26450(-1454991825), arg2 == Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 ? Class278.aClass278_2 : Class278.aClass278_5, 0.0F, (float) (local48 << 9), local249, local254, local65, 0, 1033298347);
		} else if (arg2 == Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3) {
			this.method26098(Class275.aClass275_6, local38, local44, local111, Class280.aClass280_4.method26450(-217725629), Class278.aClass278_2, 0.0F, 0.0F, null, arg2.aByte100, local65, 0, 571232128);
		}
	}

	@OriginalMember(owner = "client!fb", name = "dz", descriptor = "(Lclient!fg;ILclient!alh;)V", line = 866)
	public void method26137(@OriginalArg(0) Class263 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class132_Sub1 arg2) {
		if (arg0 == null || arg0.anIntArrayArray47 == null || arg1 >= arg0.anIntArrayArray47.length || arg0.anIntArrayArray47[arg1] == null || (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100 != arg2.aByte100 || !arg2.method24259(1725593301))) {
			return;
		}
		@Pc(34) int local34 = arg0.anIntArrayArray47[arg1][0];
		@Pc(38) int local38 = local34 >> 8;
		@Pc(44) int local44 = local34 >> 5 & 0x7;
		@Pc(48) int local48 = local34 & 0x1F;
		@Pc(65) int local65;
		if (arg0.anIntArrayArray47[arg1].length > 1) {
			local65 = (int) (Math.random() * (double) arg0.anIntArrayArray47[arg1].length);
			if (local65 > 0) {
				local38 = arg0.anIntArrayArray47[arg1][local65];
			}
		}
		local65 = 256;
		if (arg0.anIntArray367 != null && arg0.anIntArray368 != null) {
			local65 = (int) (Math.random() * (double) (arg0.anIntArray368[arg1] - arg0.anIntArray367[arg1])) + arg0.anIntArray367[arg1];
		}
		@Pc(111) int local111 = arg0.anIntArray366 == null ? 255 : arg0.anIntArray366[arg1];
		if (local48 != 0) {
			if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 == arg2) {
				if (Class51.aClass93_Sub36_1.aClass166_Sub35_2.method16226(855596178) == 0) {
					return;
				}
			} else if (Class51.aClass93_Sub36_1.aClass166_Sub35_1.method16226(257091496) == 0) {
				return;
			}
			if (arg0.anInt3877 * 432350475 != -1) {
				@Pc(158) int local158 = 0;
				if (arg2 instanceof Class132_Sub1_Sub1_Sub1) {
					local158 = ((Class132_Sub1_Sub1_Sub1) arg2).method20043(1245087663);
				} else if (arg2 instanceof Class132_Sub1_Sub1_Sub5) {
					local158 = ((Class132_Sub1_Sub1_Sub5) arg2).method24091(-455932112);
				} else if (arg2 instanceof Class132_Sub1_Sub1_Sub4) {
					local158 = ((Class132_Sub1_Sub1_Sub4) arg2).method23911(-1210544208);
				}
				if (local158 != 0 && local158 != Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method20043(1065137840) && client.anInt3433 * -914512487 != local158) {
					local111 = arg0.anInt3877 * 432350475 * local111 / 100;
					if (local111 < 0) {
						local111 = 0;
					} else if (local111 > 255) {
						local111 = 255;
					}
				}
			}
			@Pc(220) Class472 local220 = arg2.method24220().aClass472_61;
			@Pc(228) int local228 = (int) local220.aFloat317 - 256 >> 9;
			@Pc(236) int local236 = (int) local220.aFloat319 - 256 >> 9;
			@Pc(249) Class472 local249 = new Class472((float) (local228 << 9), 0.0F, (float) (local236 << 9));
			@Pc(254) int local254 = arg2.aByte100 << 24;
			this.method26098(Class275.aClass275_1, local38, local44, local111, Class280.aClass280_5.method26450(-288668607), arg2 == Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 ? Class278.aClass278_2 : Class278.aClass278_5, 0.0F, (float) (local48 << 9), local249, local254, local65, 0, -1631892270);
		} else if (arg2 == Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3) {
			this.method26098(Class275.aClass275_6, local38, local44, local111, Class280.aClass280_4.method26450(-2062585540), Class278.aClass278_2, 0.0F, 0.0F, null, arg2.aByte100, local65, 0, 293586391);
		}
	}

	@OriginalMember(owner = "client!fb", name = "dv", descriptor = "(Lclient!fg;ILclient!alh;)V", line = 866)
	public void method26138(@OriginalArg(0) Class263 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class132_Sub1 arg2) {
		if (arg0 == null || arg0.anIntArrayArray47 == null || arg1 >= arg0.anIntArrayArray47.length || arg0.anIntArrayArray47[arg1] == null || (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100 != arg2.aByte100 || !arg2.method24259(1863177917))) {
			return;
		}
		@Pc(34) int local34 = arg0.anIntArrayArray47[arg1][0];
		@Pc(38) int local38 = local34 >> 8;
		@Pc(44) int local44 = local34 >> 5 & 0x7;
		@Pc(48) int local48 = local34 & 0x1F;
		@Pc(65) int local65;
		if (arg0.anIntArrayArray47[arg1].length > 1) {
			local65 = (int) (Math.random() * (double) arg0.anIntArrayArray47[arg1].length);
			if (local65 > 0) {
				local38 = arg0.anIntArrayArray47[arg1][local65];
			}
		}
		local65 = 256;
		if (arg0.anIntArray367 != null && arg0.anIntArray368 != null) {
			local65 = (int) (Math.random() * (double) (arg0.anIntArray368[arg1] - arg0.anIntArray367[arg1])) + arg0.anIntArray367[arg1];
		}
		@Pc(111) int local111 = arg0.anIntArray366 == null ? 255 : arg0.anIntArray366[arg1];
		if (local48 != 0) {
			if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 == arg2) {
				if (Class51.aClass93_Sub36_1.aClass166_Sub35_2.method16226(-30058829) == 0) {
					return;
				}
			} else if (Class51.aClass93_Sub36_1.aClass166_Sub35_1.method16226(1112625760) == 0) {
				return;
			}
			if (arg0.anInt3877 * 432350475 != -1) {
				@Pc(158) int local158 = 0;
				if (arg2 instanceof Class132_Sub1_Sub1_Sub1) {
					local158 = ((Class132_Sub1_Sub1_Sub1) arg2).method20043(1591421756);
				} else if (arg2 instanceof Class132_Sub1_Sub1_Sub5) {
					local158 = ((Class132_Sub1_Sub1_Sub5) arg2).method24091(-493932598);
				} else if (arg2 instanceof Class132_Sub1_Sub1_Sub4) {
					local158 = ((Class132_Sub1_Sub1_Sub4) arg2).method23911(-1210544208);
				}
				if (local158 != 0 && local158 != Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method20043(407163237) && client.anInt3433 * -914512487 != local158) {
					local111 = arg0.anInt3877 * 432350475 * local111 / 100;
					if (local111 < 0) {
						local111 = 0;
					} else if (local111 > 255) {
						local111 = 255;
					}
				}
			}
			@Pc(220) Class472 local220 = arg2.method24220().aClass472_61;
			@Pc(228) int local228 = (int) local220.aFloat317 - 256 >> 9;
			@Pc(236) int local236 = (int) local220.aFloat319 - 256 >> 9;
			@Pc(249) Class472 local249 = new Class472((float) (local228 << 9), 0.0F, (float) (local236 << 9));
			@Pc(254) int local254 = arg2.aByte100 << 24;
			this.method26098(Class275.aClass275_1, local38, local44, local111, Class280.aClass280_5.method26450(-1026535816), arg2 == Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 ? Class278.aClass278_2 : Class278.aClass278_5, 0.0F, (float) (local48 << 9), local249, local254, local65, 0, 1935999195);
		} else if (arg2 == Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3) {
			this.method26098(Class275.aClass275_6, local38, local44, local111, Class280.aClass280_4.method26450(-1050688753), Class278.aClass278_2, 0.0F, 0.0F, null, arg2.aByte100, local65, 0, 245660232);
		}
	}

	@OriginalMember(owner = "client!fb", name = "ar", descriptor = "(Lclient!fg;II)V", line = 916)
	public void method26139(@OriginalArg(0) Class263 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == null || arg0.anIntArrayArray47 == null || arg1 >= arg0.anIntArrayArray47.length || arg0.anIntArrayArray47[arg1] == null) {
			return;
		}
		@Pc(23) int local23 = arg0.anIntArrayArray47[arg1][0];
		@Pc(27) int local27 = local23 >> 8;
		@Pc(33) int local33 = local23 >> 5 & 0x7;
		@Pc(50) int local50;
		if (arg0.anIntArrayArray47[arg1].length > 1) {
			local50 = (int) (Math.random() * (double) arg0.anIntArrayArray47[arg1].length);
			if (local50 > 0) {
				local27 = arg0.anIntArrayArray47[arg1][local50];
			}
		}
		local50 = 256;
		if (arg0.anIntArray367 != null && arg0.anIntArray368 != null) {
			local50 = (int) ((double) arg0.anIntArray367[arg1] + Math.random() * (double) (arg0.anIntArray368[arg1] - arg0.anIntArray367[arg1]));
		}
		@Pc(99) int local99 = arg0.anIntArray366 == null ? 255 : arg0.anIntArray366[arg1];
		this.method26098(Class275.aClass275_13, local27, local33, local99, Class280.aClass280_5.method26450(-85011194), Class278.aClass278_2, 0.0F, 0.0F, null, 0, local50, 0, -791022393);
	}

	@OriginalMember(owner = "client!fb", name = "dm", descriptor = "(Lclient!fg;I)V", line = 916)
	public void method26140(@OriginalArg(0) Class263 arg0, @OriginalArg(1) int arg1) {
		if (arg0 == null || arg0.anIntArrayArray47 == null || arg1 >= arg0.anIntArrayArray47.length || arg0.anIntArrayArray47[arg1] == null) {
			return;
		}
		@Pc(23) int local23 = arg0.anIntArrayArray47[arg1][0];
		@Pc(27) int local27 = local23 >> 8;
		@Pc(33) int local33 = local23 >> 5 & 0x7;
		@Pc(50) int local50;
		if (arg0.anIntArrayArray47[arg1].length > 1) {
			local50 = (int) (Math.random() * (double) arg0.anIntArrayArray47[arg1].length);
			if (local50 > 0) {
				local27 = arg0.anIntArrayArray47[arg1][local50];
			}
		}
		local50 = 256;
		if (arg0.anIntArray367 != null && arg0.anIntArray368 != null) {
			local50 = (int) ((double) arg0.anIntArray367[arg1] + Math.random() * (double) (arg0.anIntArray368[arg1] - arg0.anIntArray367[arg1]));
		}
		@Pc(99) int local99 = arg0.anIntArray366 == null ? 255 : arg0.anIntArray366[arg1];
		this.method26098(Class275.aClass275_13, local27, local33, local99, Class280.aClass280_5.method26450(-1239652367), Class278.aClass278_2, 0.0F, 0.0F, null, 0, local50, 0, -385067467);
	}

	@OriginalMember(owner = "client!fb", name = "ee", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V", line = 5710)
	static final void method26141(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt5888 -= 957530791) * 587908375];
		if (!local13.equals(arg0.aString164)) {
			arg0.aString164 = local13;
			Class354.method27694(arg0, -1174743804);
		}
		if (arg0.anInt3970 * 532402067 == -1 && !arg1.aBoolean708) {
			Class117_Sub1.method8385(arg0.anInt3953 * -1549590237, 1522686975);
		}
	}

	@OriginalMember(owner = "client!fb", name = "iz", descriptor = "(Lclient!yf;B)V", line = 6606)
	static final void method26142(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class222.method25583(local11, local14, arg0, -1794548241);
	}
}
