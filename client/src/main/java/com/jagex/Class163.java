package com.jagex;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xb")
public abstract class Class163 {

	@OriginalMember(owner = "client!xb", name = "lr", descriptor = "I")
	public static int anInt2002;

	@OriginalMember(owner = "client!xb", name = "wr", descriptor = "Lclient!x;")
	static Class653 aClass653_3;

	@OriginalMember(owner = "client!xb", name = "e", descriptor = "Lclient!aat;")
	final Class22 aClass22_31 = new Class22();

	@OriginalMember(owner = "client!xb", name = "n", descriptor = "J")
	long aLong105 = -8143831586271184505L;

	@OriginalMember(owner = "client!xb", name = "m", descriptor = "J")
	long aLong106 = -8115390464037108609L;

	@OriginalMember(owner = "client!xb", name = "k", descriptor = "I")
	int anInt2001 = -1335804931;

	@OriginalMember(owner = "client!xb", name = "f", descriptor = "I")
	int anInt2000 = 554087135;

	@OriginalMember(owner = "client!xb", name = "<init>", descriptor = "()V", line = 16)
	Class163() {
	}

	@OriginalMember(owner = "client!xb", name = "q", descriptor = "()V", line = 19)
	void method14900() {
		if (this.method14922(-697179527)) {
			@Pc(5) ClientMessage local5 = null;
			@Pc(7) int local7 = 0;
			@Pc(9) int local9 = 0;
			@Pc(11) int local11 = 0;
			@Pc(15) Iterator local15 = this.aClass22_31.iterator();
			label100: while (true) {
				while (true) {
					if (!local15.hasNext()) {
						break label100;
					}
					@Pc(22) Class93_Sub23 local22 = (Class93_Sub23) local15.next();
					if (local5 != null && local5.packet.pos * 212851357 - local7 >= 252 - (this.method14915(10946480) + 6)) {
						break label100;
					}
					local22.method23969(-987776147);
					@Pc(47) int local47 = local22.method22876((byte) -112);
					if (local47 < -1) {
						local47 = -1;
					} else if (local47 > 65534) {
						local47 = 65534;
					}
					@Pc(62) int local62 = local22.method22875(-1678286317);
					if (local62 < -1) {
						local62 = -1;
					} else if (local62 > 65534) {
						local62 = 65534;
					}
					if (local62 == this.anInt2001 * 1724450475 && local47 == this.anInt2000 * 1821800161) {
						local22.method22879((byte) -36);
					} else {
						if (local5 == null) {
							local5 = this.method14917((short) -26606);
							local5.packet.p1(0, (byte) -90);
							local7 = local5.packet.pos * 212851357;
							local5.packet.pos += 1403713386;
							local9 = 0;
							local11 = 0;
						}
						@Pc(132) int local132;
						@Pc(139) int local139;
						@Pc(151) int local151;
						if (this.aLong106 * -1130360274060180351L == -1L) {
							local132 = local62;
							local139 = local47;
							local151 = Integer.MAX_VALUE;
						} else {
							local132 = local62 - this.anInt2001 * 1724450475;
							local139 = local47 - this.anInt2000 * 1821800161;
							local151 = (int) ((local22.method22878((byte) 2) - this.aLong106 * -1130360274060180351L) / 20L);
							local9 = (int) ((long) local9 + (local22.method22878((byte) -54) - this.aLong106 * -1130360274060180351L) % 20L);
						}
						this.anInt2001 = local62 * 1335804931;
						this.anInt2000 = local47 * -554087135;
						if (local151 < 8 && local132 >= -32 && local132 <= 31 && local139 >= -32 && local139 <= 31) {
							local132 += 32;
							local139 += 32;
							local5.packet.p2((local132 << 6) + (local151 << 12) + local139, 2134548296);
						} else if (local151 < 32 && local132 >= -128 && local132 <= 127 && local139 >= -128 && local139 <= 127) {
							local132 += 128;
							local139 += 128;
							local5.packet.p1(local151 + 128, (byte) -44);
							local5.packet.p2((local132 << 8) + local139, 2145571769);
						} else if (local151 < 32) {
							local5.packet.p1(local151 + 192, (byte) -126);
							if (local62 == -1 || local47 == -1) {
								local5.packet.p4(Integer.MIN_VALUE, (byte) -86);
							} else {
								local5.packet.p4(local62 | local47 << 16, (byte) 54);
							}
						} else {
							local5.packet.p2((local151 & 0x1FFF) + 57344, 2131815629);
							if (local62 == -1 || local47 == -1) {
								local5.packet.p4(Integer.MIN_VALUE, (byte) 47);
							} else {
								local5.packet.p4(local62 | local47 << 16, (byte) -82);
							}
						}
						local11++;
						this.method14916(local5.packet, local22, 2065560015);
						this.aLong106 = local22.method22878((byte) 9) * 8115390464037108609L;
						local22.method22879((byte) -40);
					}
				}
			}
			if (local5 != null) {
				local5.packet.psize1(local5.packet.pos * 212851357 - local7, (byte) 67);
				@Pc(348) int local348 = local5.packet.pos * 212851357;
				local5.packet.pos = local7 * -1445626955;
				local5.packet.p1(local9 / local11, (byte) -23);
				local5.packet.p1(local9 % local11, (byte) 2);
				local5.packet.pos = local348 * -1445626955;
				client.aClass175_2.send(local5, -1597216232);
			}
		}
		this.method14920(-2008698108);
	}

	@OriginalMember(owner = "client!xb", name = "y", descriptor = "()V", line = 19)
	void method14901() {
		if (this.method14922(1652579313)) {
			@Pc(5) ClientMessage local5 = null;
			@Pc(7) int local7 = 0;
			@Pc(9) int local9 = 0;
			@Pc(11) int local11 = 0;
			@Pc(15) Iterator local15 = this.aClass22_31.iterator();
			label100: while (true) {
				while (true) {
					if (!local15.hasNext()) {
						break label100;
					}
					@Pc(22) Class93_Sub23 local22 = (Class93_Sub23) local15.next();
					if (local5 != null && local5.packet.pos * 212851357 - local7 >= 252 - (this.method14915(903701835) + 6)) {
						break label100;
					}
					local22.method23969(-970643158);
					@Pc(47) int local47 = local22.method22876((byte) -74);
					if (local47 < -1) {
						local47 = -1;
					} else if (local47 > 65534) {
						local47 = 65534;
					}
					@Pc(62) int local62 = local22.method22875(-1678286317);
					if (local62 < -1) {
						local62 = -1;
					} else if (local62 > 65534) {
						local62 = 65534;
					}
					if (local62 == this.anInt2001 * 1724450475 && local47 == this.anInt2000 * 1821800161) {
						local22.method22879((byte) -69);
					} else {
						if (local5 == null) {
							local5 = this.method14917((short) -15748);
							local5.packet.p1(0, (byte) -69);
							local7 = local5.packet.pos * 212851357;
							local5.packet.pos += 1403713386;
							local9 = 0;
							local11 = 0;
						}
						@Pc(132) int local132;
						@Pc(139) int local139;
						@Pc(151) int local151;
						if (this.aLong106 * -1130360274060180351L == -1L) {
							local132 = local62;
							local139 = local47;
							local151 = Integer.MAX_VALUE;
						} else {
							local132 = local62 - this.anInt2001 * 1724450475;
							local139 = local47 - this.anInt2000 * 1821800161;
							local151 = (int) ((local22.method22878((byte) -14) - this.aLong106 * -1130360274060180351L) / 20L);
							local9 = (int) ((long) local9 + (local22.method22878((byte) 60) - this.aLong106 * -1130360274060180351L) % 20L);
						}
						this.anInt2001 = local62 * 1335804931;
						this.anInt2000 = local47 * -554087135;
						if (local151 < 8 && local132 >= -32 && local132 <= 31 && local139 >= -32 && local139 <= 31) {
							local132 += 32;
							local139 += 32;
							local5.packet.p2((local132 << 6) + (local151 << 12) + local139, 2131566822);
						} else if (local151 < 32 && local132 >= -128 && local132 <= 127 && local139 >= -128 && local139 <= 127) {
							local132 += 128;
							local139 += 128;
							local5.packet.p1(local151 + 128, (byte) -77);
							local5.packet.p2((local132 << 8) + local139, 2129865038);
						} else if (local151 < 32) {
							local5.packet.p1(local151 + 192, (byte) -62);
							if (local62 == -1 || local47 == -1) {
								local5.packet.p4(Integer.MIN_VALUE, (byte) 45);
							} else {
								local5.packet.p4(local62 | local47 << 16, (byte) -53);
							}
						} else {
							local5.packet.p2((local151 & 0x1FFF) + 57344, 2143788256);
							if (local62 == -1 || local47 == -1) {
								local5.packet.p4(Integer.MIN_VALUE, (byte) 17);
							} else {
								local5.packet.p4(local62 | local47 << 16, (byte) 70);
							}
						}
						local11++;
						this.method14916(local5.packet, local22, 1997788463);
						this.aLong106 = local22.method22878((byte) -84) * 8115390464037108609L;
						local22.method22879((byte) 56);
					}
				}
			}
			if (local5 != null) {
				local5.packet.psize1(local5.packet.pos * 212851357 - local7, (byte) 33);
				@Pc(348) int local348 = local5.packet.pos * 212851357;
				local5.packet.pos = local7 * -1445626955;
				local5.packet.p1(local9 / local11, (byte) -114);
				local5.packet.p1(local9 % local11, (byte) -9);
				local5.packet.pos = local348 * -1445626955;
				client.aClass175_2.send(local5, -1619612291);
			}
		}
		this.method14920(-1489347993);
	}

	@OriginalMember(owner = "client!xb", name = "x", descriptor = "()V", line = 19)
	void method14902() {
		if (this.method14922(-1669249716)) {
			@Pc(5) ClientMessage local5 = null;
			@Pc(7) int local7 = 0;
			@Pc(9) int local9 = 0;
			@Pc(11) int local11 = 0;
			@Pc(15) Iterator local15 = this.aClass22_31.iterator();
			label100: while (true) {
				while (true) {
					if (!local15.hasNext()) {
						break label100;
					}
					@Pc(22) Class93_Sub23 local22 = (Class93_Sub23) local15.next();
					if (local5 != null && local5.packet.pos * 212851357 - local7 >= 252 - (this.method14915(-201788473) + 6)) {
						break label100;
					}
					local22.method23969(1370177943);
					@Pc(47) int local47 = local22.method22876((byte) -1);
					if (local47 < -1) {
						local47 = -1;
					} else if (local47 > 65534) {
						local47 = 65534;
					}
					@Pc(62) int local62 = local22.method22875(-1678286317);
					if (local62 < -1) {
						local62 = -1;
					} else if (local62 > 65534) {
						local62 = 65534;
					}
					if (local62 == this.anInt2001 * 1724450475 && local47 == this.anInt2000 * 1821800161) {
						local22.method22879((byte) 17);
					} else {
						if (local5 == null) {
							local5 = this.method14917((short) -24523);
							local5.packet.p1(0, (byte) -68);
							local7 = local5.packet.pos * 212851357;
							local5.packet.pos += 1403713386;
							local9 = 0;
							local11 = 0;
						}
						@Pc(132) int local132;
						@Pc(139) int local139;
						@Pc(151) int local151;
						if (this.aLong106 * -1130360274060180351L == -1L) {
							local132 = local62;
							local139 = local47;
							local151 = Integer.MAX_VALUE;
						} else {
							local132 = local62 - this.anInt2001 * 1724450475;
							local139 = local47 - this.anInt2000 * 1821800161;
							local151 = (int) ((local22.method22878((byte) 33) - this.aLong106 * -1130360274060180351L) / 20L);
							local9 = (int) ((long) local9 + (local22.method22878((byte) 69) - this.aLong106 * -1130360274060180351L) % 20L);
						}
						this.anInt2001 = local62 * 1335804931;
						this.anInt2000 = local47 * -554087135;
						if (local151 < 8 && local132 >= -32 && local132 <= 31 && local139 >= -32 && local139 <= 31) {
							local132 += 32;
							local139 += 32;
							local5.packet.p2((local132 << 6) + (local151 << 12) + local139, 2126404920);
						} else if (local151 < 32 && local132 >= -128 && local132 <= 127 && local139 >= -128 && local139 <= 127) {
							local132 += 128;
							local139 += 128;
							local5.packet.p1(local151 + 128, (byte) -9);
							local5.packet.p2((local132 << 8) + local139, 2132093201);
						} else if (local151 < 32) {
							local5.packet.p1(local151 + 192, (byte) -4);
							if (local62 == -1 || local47 == -1) {
								local5.packet.p4(Integer.MIN_VALUE, (byte) 31);
							} else {
								local5.packet.p4(local62 | local47 << 16, (byte) -22);
							}
						} else {
							local5.packet.p2((local151 & 0x1FFF) + 57344, 2131978540);
							if (local62 == -1 || local47 == -1) {
								local5.packet.p4(Integer.MIN_VALUE, (byte) 98);
							} else {
								local5.packet.p4(local62 | local47 << 16, (byte) 43);
							}
						}
						local11++;
						this.method14916(local5.packet, local22, 1621188789);
						this.aLong106 = local22.method22878((byte) 19) * 8115390464037108609L;
						local22.method22879((byte) 48);
					}
				}
			}
			if (local5 != null) {
				local5.packet.psize1(local5.packet.pos * 212851357 - local7, (byte) 39);
				@Pc(348) int local348 = local5.packet.pos * 212851357;
				local5.packet.pos = local7 * -1445626955;
				local5.packet.p1(local9 / local11, (byte) -10);
				local5.packet.p1(local9 % local11, (byte) -70);
				local5.packet.pos = local348 * -1445626955;
				client.aClass175_2.send(local5, -2096770119);
			}
		}
		this.method14920(694464096);
	}

	@OriginalMember(owner = "client!xb", name = "e", descriptor = "(S)V", line = 19)
	void method14903(@OriginalArg(0) short arg0) {
		if (this.method14922(-2081945665)) {
			@Pc(5) ClientMessage local5 = null;
			@Pc(7) int local7 = 0;
			@Pc(9) int local9 = 0;
			@Pc(11) int local11 = 0;
			@Pc(15) Iterator local15 = this.aClass22_31.iterator();
			label100: while (true) {
				while (true) {
					if (!local15.hasNext()) {
						break label100;
					}
					@Pc(22) Class93_Sub23 local22 = (Class93_Sub23) local15.next();
					if (local5 != null && local5.packet.pos * 212851357 - local7 >= 252 - (this.method14915(77459241) + 6)) {
						break label100;
					}
					local22.method23969(-168416406);
					@Pc(47) int local47 = local22.method22876((byte) -3);
					if (local47 < -1) {
						local47 = -1;
					} else if (local47 > 65534) {
						local47 = 65534;
					}
					@Pc(62) int local62 = local22.method22875(-1678286317);
					if (local62 < -1) {
						local62 = -1;
					} else if (local62 > 65534) {
						local62 = 65534;
					}
					if (local62 == this.anInt2001 * 1724450475 && local47 == this.anInt2000 * 1821800161) {
						local22.method22879((byte) 71);
					} else {
						if (local5 == null) {
							local5 = this.method14917((short) -13916);
							local5.packet.p1(0, (byte) -49);
							local7 = local5.packet.pos * 212851357;
							local5.packet.pos += 1403713386;
							local9 = 0;
							local11 = 0;
						}
						@Pc(132) int local132;
						@Pc(139) int local139;
						@Pc(151) int local151;
						if (this.aLong106 * -1130360274060180351L == -1L) {
							local132 = local62;
							local139 = local47;
							local151 = Integer.MAX_VALUE;
						} else {
							local132 = local62 - this.anInt2001 * 1724450475;
							local139 = local47 - this.anInt2000 * 1821800161;
							local151 = (int) ((local22.method22878((byte) -61) - this.aLong106 * -1130360274060180351L) / 20L);
							local9 = (int) ((long) local9 + (local22.method22878((byte) -45) - this.aLong106 * -1130360274060180351L) % 20L);
						}
						this.anInt2001 = local62 * 1335804931;
						this.anInt2000 = local47 * -554087135;
						if (local151 < 8 && local132 >= -32 && local132 <= 31 && local139 >= -32 && local139 <= 31) {
							local132 += 32;
							local139 += 32;
							local5.packet.p2((local132 << 6) + (local151 << 12) + local139, 2146630706);
						} else if (local151 < 32 && local132 >= -128 && local132 <= 127 && local139 >= -128 && local139 <= 127) {
							local132 += 128;
							local139 += 128;
							local5.packet.p1(local151 + 128, (byte) -4);
							local5.packet.p2((local132 << 8) + local139, 2129594825);
						} else if (local151 < 32) {
							local5.packet.p1(local151 + 192, (byte) -70);
							if (local62 == -1 || local47 == -1) {
								local5.packet.p4(Integer.MIN_VALUE, (byte) 32);
							} else {
								local5.packet.p4(local62 | local47 << 16, (byte) -16);
							}
						} else {
							local5.packet.p2((local151 & 0x1FFF) + 57344, 2133659708);
							if (local62 == -1 || local47 == -1) {
								local5.packet.p4(Integer.MIN_VALUE, (byte) -83);
							} else {
								local5.packet.p4(local62 | local47 << 16, (byte) -20);
							}
						}
						local11++;
						this.method14916(local5.packet, local22, 1992593646);
						this.aLong106 = local22.method22878((byte) -89) * 8115390464037108609L;
						local22.method22879((byte) -10);
					}
				}
			}
			if (local5 != null) {
				local5.packet.psize1(local5.packet.pos * 212851357 - local7, (byte) 109);
				@Pc(348) int local348 = local5.packet.pos * 212851357;
				local5.packet.pos = local7 * -1445626955;
				local5.packet.p1(local9 / local11, (byte) -111);
				local5.packet.p1(local9 % local11, (byte) -124);
				local5.packet.pos = local348 * -1445626955;
				client.aClass175_2.send(local5, -1840062322);
			}
		}
		this.method14920(399625203);
	}

	@OriginalMember(owner = "client!xb", name = "n", descriptor = "(I)V", line = 104)
	void method14904(@OriginalArg(0) int arg0) {
		this.aClass22_31.method405(-2037259486);
		this.aLong105 = -8143831586271184505L;
		this.aLong106 = -8115390464037108609L;
		this.anInt2001 = -1335804931;
		this.anInt2000 = 554087135;
	}

	@OriginalMember(owner = "client!xb", name = "m", descriptor = "(Lclient!akm;I)V", line = 112)
	void method14905(@OriginalArg(0) Class93_Sub23 arg0, @OriginalArg(1) int arg1) {
		this.aClass22_31.method408(arg0, -974724382);
	}

	@OriginalMember(owner = "client!xb", name = "h", descriptor = "(Lclient!akm;)V", line = 112)
	void method14906(@OriginalArg(0) Class93_Sub23 arg0) {
		this.aClass22_31.method408(arg0, -710345079);
	}

	@OriginalMember(owner = "client!xb", name = "b", descriptor = "(Lclient!akm;)V", line = 112)
	void method14907(@OriginalArg(0) Class93_Sub23 arg0) {
		this.aClass22_31.method408(arg0, -194313345);
	}

	@OriginalMember(owner = "client!xb", name = "k", descriptor = "(Lclient!akm;II)I", line = 117)
	int method14908(@OriginalArg(0) Class93_Sub23 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) long local9;
		if (this.aLong105 * -3676464144319855671L == -1L) {
			local9 = arg1;
		} else {
			local9 = arg0.method22878((byte) 23) - this.aLong105 * -3676464144319855671L;
			if (local9 > (long) arg1) {
				local9 = arg1;
			}
		}
		this.aLong105 = arg0.method22878((byte) 23) * 8143831586271184505L;
		return (int) local9;
	}

	@OriginalMember(owner = "client!xb", name = "a", descriptor = "(Lclient!akm;I)I", line = 117)
	int method14909(@OriginalArg(0) Class93_Sub23 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) long local9;
		if (this.aLong105 * -3676464144319855671L == -1L) {
			local9 = arg1;
		} else {
			local9 = arg0.method22878((byte) -8) - this.aLong105 * -3676464144319855671L;
			if (local9 > (long) arg1) {
				local9 = arg1;
			}
		}
		this.aLong105 = arg0.method22878((byte) -79) * 8143831586271184505L;
		return (int) local9;
	}

	@OriginalMember(owner = "client!xb", name = "g", descriptor = "(Lclient!akm;I)I", line = 117)
	int method14910(@OriginalArg(0) Class93_Sub23 arg0, @OriginalArg(1) int arg1) {
		@Pc(9) long local9;
		if (this.aLong105 * -3676464144319855671L == -1L) {
			local9 = arg1;
		} else {
			local9 = arg0.method22878((byte) -29) - this.aLong105 * -3676464144319855671L;
			if (local9 > (long) arg1) {
				local9 = arg1;
			}
		}
		this.aLong105 = arg0.method22878((byte) 61) * 8143831586271184505L;
		return (int) local9;
	}

	@OriginalMember(owner = "client!xb", name = "ah", descriptor = "(I)V", line = 1046)
	static void method14911(@OriginalArg(0) int arg0) {
		Class63.method1162((byte) 26);
	}

	@OriginalMember(owner = "client!xb", name = "kn", descriptor = "(Lclient!yf;S)V", line = 6878)
	static final void method14912(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		Class266.method26228(local11, arg0, (byte) 0);
	}

	@OriginalMember(owner = "client!xb", name = "c", descriptor = "()Z")
	abstract boolean method14913();

	@OriginalMember(owner = "client!xb", name = "v", descriptor = "()I")
	abstract int method14914();

	@OriginalMember(owner = "client!xb", name = "f", descriptor = "(I)I")
	abstract int method14915(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!xb", name = "w", descriptor = "(Lclient!alw;Lclient!akm;I)V")
	abstract void method14916(@OriginalArg(0) Packet arg0, @OriginalArg(1) Class93_Sub23 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!xb", name = "z", descriptor = "(S)Lclient!akl;")
	abstract ClientMessage method14917(@OriginalArg(0) short arg0);

	@OriginalMember(owner = "client!xb", name = "p", descriptor = "()V")
	abstract void method14918();

	@OriginalMember(owner = "client!xb", name = "d", descriptor = "()V")
	abstract void method14919();

	@OriginalMember(owner = "client!xb", name = "l", descriptor = "(I)V")
	abstract void method14920(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!xb", name = "r", descriptor = "()Lclient!akl;")
	abstract ClientMessage method14921();

	@OriginalMember(owner = "client!xb", name = "u", descriptor = "(I)Z")
	abstract boolean method14922(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!xb", name = "o", descriptor = "(Lclient!alw;Lclient!akm;)V")
	abstract void method14923(@OriginalArg(0) Packet arg0, @OriginalArg(1) Class93_Sub23 arg1);

	@OriginalMember(owner = "client!xb", name = "s", descriptor = "(Lclient!alw;Lclient!akm;)V")
	abstract void method14924(@OriginalArg(0) Packet arg0, @OriginalArg(1) Class93_Sub23 arg1);
}