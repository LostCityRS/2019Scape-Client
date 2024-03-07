package com.jagex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hk")
public class Class315 implements Interface45 {

	@OriginalMember(owner = "client!hk", name = "bq", descriptor = "Ljava/util/List;")
	static List aList15 = new ArrayList();

	@OriginalMember(owner = "client!hk", name = "bm", descriptor = "Lclient!eb;")
	static Class240 aClass240_78 = new Class240(524288, 1024);

	@OriginalMember(owner = "client!hk", name = "ax", descriptor = "Z")
	boolean aBoolean702;

	@OriginalMember(owner = "client!hk", name = "n", descriptor = "I")
	int anInt4064;

	@OriginalMember(owner = "client!hk", name = "m", descriptor = "I")
	int anInt4065;

	@OriginalMember(owner = "client!hk", name = "f", descriptor = "I")
	int anInt4066;

	@OriginalMember(owner = "client!hk", name = "w", descriptor = "Lclient!mm;")
	Interface41 anInterface41_1;

	@OriginalMember(owner = "client!hk", name = "s", descriptor = "I")
	int anInt4067;

	@OriginalMember(owner = "client!hk", name = "i", descriptor = "I")
	int anInt4068;

	@OriginalMember(owner = "client!hk", name = "k", descriptor = "I")
	int anInt4069;

	@OriginalMember(owner = "client!hk", name = "r", descriptor = "I")
	int anInt4070;

	@OriginalMember(owner = "client!hk", name = "o", descriptor = "I")
	int anInt4071;

	@OriginalMember(owner = "client!hk", name = "y", descriptor = "[Lclient!hu;")
	Class324[] aClass324Array2;

	@OriginalMember(owner = "client!hk", name = "q", descriptor = "[Lclient!hm;")
	Class317[] aClass317Array1;

	@OriginalMember(owner = "client!hk", name = "x", descriptor = "[Lclient!gi;")
	Class289[] aClass289Array1;

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "[Lclient!hl;")
	Class316[] aClass316Array1;

	@OriginalMember(owner = "client!hk", name = "h", descriptor = "[Z")
	boolean[] aBooleanArray25;

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "[I")
	int[] anIntArray384;

	@OriginalMember(owner = "client!hk", name = "g", descriptor = "[Lclient!hb;")
	Class308[] aClass308Array1;

	@OriginalMember(owner = "client!hk", name = "j", descriptor = "I")
	int anInt4072;

	@OriginalMember(owner = "client!hk", name = "aw", descriptor = "Lclient!hb;")
	Class308 aClass308_1;

	@OriginalMember(owner = "client!hk", name = "ae", descriptor = "[Lclient!hb;")
	Class308[] aClass308Array2;

	@OriginalMember(owner = "client!hk", name = "ag", descriptor = "Lclient!hb;")
	Class308 aClass308_2;

	@OriginalMember(owner = "client!hk", name = "ah", descriptor = "Lclient!hb;")
	Class308 aClass308_3;

	@OriginalMember(owner = "client!hk", name = "al", descriptor = "Lclient!hb;")
	Class308 aClass308_4;

	@OriginalMember(owner = "client!hk", name = "ac", descriptor = "Lclient!hb;")
	Class308 aClass308_5;

	@OriginalMember(owner = "client!hk", name = "ai", descriptor = "Lclient!hb;")
	Class308 aClass308_6;

	@OriginalMember(owner = "client!hk", name = "e", descriptor = "I")
	int anInt4073;

	@OriginalMember(owner = "client!hk", name = "as", descriptor = "[I")
	int[] anIntArray385;

	@OriginalMember(owner = "client!hk", name = "ay", descriptor = "I")
	int anInt4074;

	@OriginalMember(owner = "client!hk", name = "d", descriptor = "I")
	int anInt4075;

	@OriginalMember(owner = "client!hk", name = "az", descriptor = "I")
	int anInt4077;

	@OriginalMember(owner = "client!hk", name = "av", descriptor = "Z")
	boolean aBoolean703;

	@OriginalMember(owner = "client!hk", name = "ao", descriptor = "Z")
	boolean aBoolean704;

	@OriginalMember(owner = "client!hk", name = "aj", descriptor = "I")
	int anInt4079;

	@OriginalMember(owner = "client!hk", name = "t", descriptor = "[Z")
	boolean[] aBooleanArray27;

	@OriginalMember(owner = "client!hk", name = "ad", descriptor = "Z")
	boolean aBoolean705;

	@OriginalMember(owner = "client!hk", name = "at", descriptor = "[I")
	int[] anIntArray386;

	@OriginalMember(owner = "client!hk", name = "aa", descriptor = "Z")
	boolean aBoolean706;

	@OriginalMember(owner = "client!hk", name = "af", descriptor = "I")
	int anInt4080;

	@OriginalMember(owner = "client!hk", name = "ak", descriptor = "I")
	int anInt4081;

	@OriginalMember(owner = "client!hk", name = "an", descriptor = "I")
	int anInt4082;

	@OriginalMember(owner = "client!hk", name = "bf", descriptor = "I")
	int anInt4083;

	@OriginalMember(owner = "client!hk", name = "bl", descriptor = "I")
	int anInt4084;

	@OriginalMember(owner = "client!hk", name = "bd", descriptor = "I")
	int anInt4085;

	@OriginalMember(owner = "client!hk", name = "bi", descriptor = "[Lclient!hb;")
	Class308[] aClass308Array3;

	@OriginalMember(owner = "client!hk", name = "ab", descriptor = "I")
	int anInt4088;

	@OriginalMember(owner = "client!hk", name = "bb", descriptor = "[B")
	byte[] aByteArray79;

	@OriginalMember(owner = "client!hk", name = "be", descriptor = "I")
	int anInt4089;

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "I")
	int anInt4090;

	@OriginalMember(owner = "client!hk", name = "by", descriptor = "I")
	int anInt4091;

	@OriginalMember(owner = "client!hk", name = "l", descriptor = "Ljava/util/List;")
	List aList14 = new ArrayList();

	@OriginalMember(owner = "client!hk", name = "u", descriptor = "Lclient!mc;")
	Class413 aClass413_1 = Class413.aClass413_8;

	@OriginalMember(owner = "client!hk", name = "am", descriptor = "Ljava/util/List;")
	List aList17 = new ArrayList();

	@OriginalMember(owner = "client!hk", name = "au", descriptor = "Lclient!alw;")
    Packet aPacket_15 = null;

	@OriginalMember(owner = "client!hk", name = "ar", descriptor = "I")
	int anInt4076 = 0;

	@OriginalMember(owner = "client!hk", name = "ap", descriptor = "I")
	int anInt4078 = 0;

	@OriginalMember(owner = "client!hk", name = "aq", descriptor = "Ljava/util/List;")
	List aList16 = new ArrayList();

	@OriginalMember(owner = "client!hk", name = "bk", descriptor = "Ljava/util/List;")
	List aList18 = new ArrayList();

	@OriginalMember(owner = "client!hk", name = "bh", descriptor = "Ljava/util/List;")
	List aList19 = new ArrayList();

	@OriginalMember(owner = "client!hk", name = "bx", descriptor = "Ljava/util/concurrent/atomic/AtomicReference;")
	AtomicReference anAtomicReference1 = new AtomicReference(null);

	@OriginalMember(owner = "client!hk", name = "bc", descriptor = "I")
	int anInt4086 = 0;

	@OriginalMember(owner = "client!hk", name = "bn", descriptor = "Z")
	boolean aBoolean707 = false;

	@OriginalMember(owner = "client!hk", name = "bt", descriptor = "I")
	int anInt4087 = 0;

	@OriginalMember(owner = "client!hk", name = "bu", descriptor = "[Z")
	boolean[] aBooleanArray28 = null;

	@OriginalMember(owner = "client!hk", name = "bw", descriptor = "[Z")
	boolean[] aBooleanArray24 = null;

	@OriginalMember(owner = "client!hk", name = "bo", descriptor = "[Z")
	boolean[] aBooleanArray26 = null;

	@OriginalMember(owner = "client!hk", name = "v", descriptor = "F")
	final float aFloat285;

	@OriginalMember(owner = "client!hk", name = "z", descriptor = "Lclient!nd;")
	Class433 aClass433_1;

	@OriginalMember(owner = "client!hk", name = "p", descriptor = "Lclient!mw;")
	Class426 aClass426_1;

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(F)V", line = 84)
	public Class315(@OriginalArg(0) float arg0) {
		this.aFloat285 = arg0;
		this.aClass433_1 = Class433.aClass433_3;
		this.aClass426_1 = Class426.aClass426_3;
		this.method27084(false);
	}

	@OriginalMember(owner = "client!hk", name = "e", descriptor = "(Z)V", line = 92)
	@Override
	public void method27012(@OriginalArg(0) boolean arg0) {
		if (!arg0) {
			this.method27051();
		} else if (this.method27041() == Class413.aClass413_7) {
			this.method27084(true);
			this.method27054(Class413.aClass413_3);
		}
	}

	@OriginalMember(owner = "client!hk", name = "bf", descriptor = "(Z)V", line = 92)
	@Override
	public void method27009(@OriginalArg(0) boolean arg0) {
		if (!arg0) {
			this.method27051();
		} else if (this.method27041() == Class413.aClass413_7) {
			this.method27084(true);
			this.method27054(Class413.aClass413_3);
		}
	}

	@OriginalMember(owner = "client!hk", name = "bl", descriptor = "(Z)V", line = 92)
	@Override
	public void method27015(@OriginalArg(0) boolean arg0) {
		if (!arg0) {
			this.method27051();
		} else if (this.method27041() == Class413.aClass413_7) {
			this.method27084(true);
			this.method27054(Class413.aClass413_3);
		}
	}

	@OriginalMember(owner = "client!hk", name = "bk", descriptor = "(Z)V", line = 92)
	@Override
	public void method27016(@OriginalArg(0) boolean arg0) {
		if (!arg0) {
			this.method27051();
		} else if (this.method27041() == Class413.aClass413_7) {
			this.method27084(true);
			this.method27054(Class413.aClass413_3);
		}
	}

	@OriginalMember(owner = "client!hk", name = "n", descriptor = "()V", line = 102)
	@Override
	public void method27051() {
		if (this.method27041() == Class413.aClass413_4) {
			this.method27084(false);
			this.method27054(Class413.aClass413_2);
		} else {
			this.method27084(false);
			this.method27054(Class413.aClass413_8);
		}
	}

	@OriginalMember(owner = "client!hk", name = "bh", descriptor = "()V", line = 102)
	@Override
	public void method27017() {
		if (this.method27041() == Class413.aClass413_4) {
			this.method27084(false);
			this.method27054(Class413.aClass413_2);
		} else {
			this.method27084(false);
			this.method27054(Class413.aClass413_8);
		}
	}

	@OriginalMember(owner = "client!hk", name = "bd", descriptor = "()V", line = 102)
	@Override
	public void method27019() {
		if (this.method27041() == Class413.aClass413_4) {
			this.method27084(false);
			this.method27054(Class413.aClass413_2);
		} else {
			this.method27084(false);
			this.method27054(Class413.aClass413_8);
		}
	}

	@OriginalMember(owner = "client!hk", name = "bx", descriptor = "()V", line = 102)
	@Override
	public void method27018() {
		if (this.method27041() == Class413.aClass413_4) {
			this.method27084(false);
			this.method27054(Class413.aClass413_2);
		} else {
			this.method27084(false);
			this.method27054(Class413.aClass413_8);
		}
	}

	@OriginalMember(owner = "client!hk", name = "bc", descriptor = "()Lclient!mc;", line = 113)
	@Override
	public Class413 method27000() {
		return this.aClass413_1;
	}

	@OriginalMember(owner = "client!hk", name = "m", descriptor = "()Lclient!mc;", line = 113)
	@Override
	public Class413 method27041() {
		return this.aClass413_1;
	}

	@OriginalMember(owner = "client!hk", name = "bn", descriptor = "(Lclient!mc;)V", line = 117)
	void method27052(@OriginalArg(0) Class413 arg0) {
		this.aClass413_1 = arg0;
	}

	@OriginalMember(owner = "client!hk", name = "bi", descriptor = "(Lclient!mc;)V", line = 117)
	void method27053(@OriginalArg(0) Class413 arg0) {
		this.aClass413_1 = arg0;
	}

	@OriginalMember(owner = "client!hk", name = "k", descriptor = "(Lclient!mc;)V", line = 117)
	void method27054(@OriginalArg(0) Class413 arg0) {
		this.aClass413_1 = arg0;
	}

	@OriginalMember(owner = "client!hk", name = "f", descriptor = "(Lclient!mm;)V", line = 121)
	@Override
	public void method27007(@OriginalArg(0) Interface41 arg0) {
		this.anInterface41_1 = arg0;
	}

	@OriginalMember(owner = "client!hk", name = "bt", descriptor = "(Lclient!mm;)V", line = 121)
	@Override
	public void method27021(@OriginalArg(0) Interface41 arg0) {
		this.anInterface41_1 = arg0;
	}

	@OriginalMember(owner = "client!hk", name = "w", descriptor = "(Lclient!alw;)V", line = 125)
	@Override
	public void method27001(@OriginalArg(0) Packet arg0) {
		if (this.method27041() == Class413.aClass413_6 || this.method27041() == Class413.aClass413_7) {
			if (arg0 != null) {
				arg0.release((byte) 1);
			}
		} else if (arg0 == null) {
			@Pc(33) boolean local33 = this.aBoolean707 && (this.anInt4083 > 0 && this.anInt4084 < this.anInt4083 || this.anInt4083 < 0);
			if (this.aList16.isEmpty()) {
				if (!local33) {
					this.method27117();
					this.method27054(Class413.aClass413_7);
				}
			} else if (!local33) {
				this.method27117();
				this.method27054(Class413.aClass413_6);
			}
			if (local33) {
				this.method27084(true);
			}
		} else {
			this.method27137(arg0);
		}
	}

	@OriginalMember(owner = "client!hk", name = "bb", descriptor = "(Lclient!alw;)V", line = 125)
	@Override
	public void method27024(@OriginalArg(0) Packet arg0) {
		if (this.method27041() == Class413.aClass413_6 || this.method27041() == Class413.aClass413_7) {
			if (arg0 != null) {
				arg0.release((byte) 1);
			}
		} else if (arg0 == null) {
			@Pc(33) boolean local33 = this.aBoolean707 && (this.anInt4083 > 0 && this.anInt4084 < this.anInt4083 || this.anInt4083 < 0);
			if (this.aList16.isEmpty()) {
				if (!local33) {
					this.method27117();
					this.method27054(Class413.aClass413_7);
				}
			} else if (!local33) {
				this.method27117();
				this.method27054(Class413.aClass413_6);
			}
			if (local33) {
				this.method27084(true);
			}
		} else {
			this.method27137(arg0);
		}
	}

	@OriginalMember(owner = "client!hk", name = "bq", descriptor = "(Lclient!alw;)V", line = 125)
	@Override
	public void method27020(@OriginalArg(0) Packet arg0) {
		if (this.method27041() == Class413.aClass413_6 || this.method27041() == Class413.aClass413_7) {
			if (arg0 != null) {
				arg0.release((byte) 1);
			}
		} else if (arg0 == null) {
			@Pc(33) boolean local33 = this.aBoolean707 && (this.anInt4083 > 0 && this.anInt4084 < this.anInt4083 || this.anInt4083 < 0);
			if (this.aList16.isEmpty()) {
				if (!local33) {
					this.method27117();
					this.method27054(Class413.aClass413_7);
				}
			} else if (!local33) {
				this.method27117();
				this.method27054(Class413.aClass413_6);
			}
			if (local33) {
				this.method27084(true);
			}
		} else {
			this.method27137(arg0);
		}
	}

	@OriginalMember(owner = "client!hk", name = "bm", descriptor = "(Lclient!alw;)V", line = 125)
	@Override
	public void method27023(@OriginalArg(0) Packet arg0) {
		if (this.method27041() == Class413.aClass413_6 || this.method27041() == Class413.aClass413_7) {
			if (arg0 != null) {
				arg0.release((byte) 1);
			}
		} else if (arg0 == null) {
			@Pc(33) boolean local33 = this.aBoolean707 && (this.anInt4083 > 0 && this.anInt4084 < this.anInt4083 || this.anInt4083 < 0);
			if (this.aList16.isEmpty()) {
				if (!local33) {
					this.method27117();
					this.method27054(Class413.aClass413_7);
				}
			} else if (!local33) {
				this.method27117();
				this.method27054(Class413.aClass413_6);
			}
			if (local33) {
				this.method27084(true);
			}
		} else {
			this.method27137(arg0);
		}
	}

	@OriginalMember(owner = "client!hk", name = "l", descriptor = "()V", line = 150)
	@Override
	public void method27028() {
		if (this.method27041() == Class413.aClass413_2 || this.method27041() == Class413.aClass413_8 || this.method27041() == Class413.aClass413_3) {
			this.method27054(Class413.aClass413_4);
			this.method27089();
		}
	}

	@OriginalMember(owner = "client!hk", name = "be", descriptor = "()V", line = 150)
	@Override
	public void method27025() {
		if (this.method27041() == Class413.aClass413_2 || this.method27041() == Class413.aClass413_8 || this.method27041() == Class413.aClass413_3) {
			this.method27054(Class413.aClass413_4);
			this.method27089();
		}
	}

	@OriginalMember(owner = "client!hk", name = "by", descriptor = "()V", line = 150)
	@Override
	public void method27026() {
		if (this.method27041() == Class413.aClass413_2 || this.method27041() == Class413.aClass413_8 || this.method27041() == Class413.aClass413_3) {
			this.method27054(Class413.aClass413_4);
			this.method27089();
		}
	}

	@OriginalMember(owner = "client!hk", name = "u", descriptor = "(I)Lclient!alw;", line = 158)
	@Override
	public Packet method27008(@OriginalArg(0) int arg0) {
		return this.method27151(arg0);
	}

	@OriginalMember(owner = "client!hk", name = "bu", descriptor = "(I)Lclient!alw;", line = 158)
	@Override
	public Packet method27027(@OriginalArg(0) int arg0) {
		return this.method27151(arg0);
	}

	@OriginalMember(owner = "client!hk", name = "z", descriptor = "()I", line = 163)
	@Override
	public int method27022() {
		return this.method27157();
	}

	@OriginalMember(owner = "client!hk", name = "bw", descriptor = "()I", line = 163)
	@Override
	public int method27031() {
		return this.method27157();
	}

	@OriginalMember(owner = "client!hk", name = "bo", descriptor = "()I", line = 163)
	@Override
	public int method27029() {
		return this.method27157();
	}

	@OriginalMember(owner = "client!hk", name = "bz", descriptor = "()I", line = 163)
	@Override
	public int method26998() {
		return this.method27157();
	}

	@OriginalMember(owner = "client!hk", name = "p", descriptor = "(I)I", line = 167)
	@Override
	public int method27050(@OriginalArg(0) int arg0) {
		return arg0 / (this.method27003().anInt4806 * -150999407 / 8);
	}

	@OriginalMember(owner = "client!hk", name = "fu", descriptor = "(I)I", line = 167)
	@Override
	public int method27030(@OriginalArg(0) int arg0) {
		return arg0 / (this.method27003().anInt4806 * -150999407 / 8);
	}

	@OriginalMember(owner = "client!hk", name = "fs", descriptor = "(I)I", line = 167)
	@Override
	public int method27010(@OriginalArg(0) int arg0) {
		return arg0 / (this.method27003().anInt4806 * -150999407 / 8);
	}

	@OriginalMember(owner = "client!hk", name = "fm", descriptor = "(I)I", line = 167)
	@Override
	public int method27049(@OriginalArg(0) int arg0) {
		return arg0 / (this.method27003().anInt4806 * -150999407 / 8);
	}

	@OriginalMember(owner = "client!hk", name = "d", descriptor = "(I)I", line = 171)
	@Override
	public int method27006(@OriginalArg(0) int arg0) {
		return arg0 * (this.method27003().anInt4806 * -150999407 / 8);
	}

	@OriginalMember(owner = "client!hk", name = "bv", descriptor = "(I)I", line = 171)
	@Override
	public int method27014(@OriginalArg(0) int arg0) {
		return arg0 * (this.method27003().anInt4806 * -150999407 / 8);
	}

	@OriginalMember(owner = "client!hk", name = "br", descriptor = "(I)I", line = 171)
	@Override
	public int method27032(@OriginalArg(0) int arg0) {
		return arg0 * (this.method27003().anInt4806 * -150999407 / 8);
	}

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "()I", line = 175)
	int method27055() {
		if (!this.method27011()) {
			throw new RuntimeException("");
		}
		return this.anInt4073;
	}

	@OriginalMember(owner = "client!hk", name = "bg", descriptor = "()I", line = 175)
	int method27056() {
		if (!this.method27011()) {
			throw new RuntimeException("");
		}
		return this.anInt4073;
	}

	@OriginalMember(owner = "client!hk", name = "ba", descriptor = "()I", line = 175)
	int method27057() {
		if (!this.method27011()) {
			throw new RuntimeException("");
		}
		return this.anInt4073;
	}

	@OriginalMember(owner = "client!hk", name = "r", descriptor = "()Lclient!nd;", line = 182)
	@Override
	public Class433 method27003() {
		return this.aClass433_1;
	}

	@OriginalMember(owner = "client!hk", name = "bj", descriptor = "()Lclient!nd;", line = 182)
	@Override
	public Class433 method27034() {
		return this.aClass433_1;
	}

	@OriginalMember(owner = "client!hk", name = "bp", descriptor = "()Lclient!nd;", line = 182)
	@Override
	public Class433 method27033() {
		return this.aClass433_1;
	}

	@OriginalMember(owner = "client!hk", name = "v", descriptor = "()Lclient!mw;", line = 186)
	@Override
	public Class426 method27004() {
		return this.aClass426_1;
	}

	@OriginalMember(owner = "client!hk", name = "cl", descriptor = "()Lclient!mw;", line = 186)
	@Override
	public Class426 method27036() {
		return this.aClass426_1;
	}

	@OriginalMember(owner = "client!hk", name = "bs", descriptor = "()Lclient!mw;", line = 186)
	@Override
	public Class426 method27035() {
		return this.aClass426_1;
	}

	@OriginalMember(owner = "client!hk", name = "o", descriptor = "(ILclient!nd;Lclient!mw;I)V", line = 190)
	@Override
	public void method26999(@OriginalArg(0) int arg0, @OriginalArg(1) Class433 arg1, @OriginalArg(2) Class426 arg2, @OriginalArg(3) int arg3) {
		this.anInt4075 = arg3;
		if (!this.method27058(arg0, arg1, arg2)) {
			throw new RuntimeException("");
		}
		this.aClass433_1 = arg1;
		this.aClass426_1 = arg2;
	}

	@OriginalMember(owner = "client!hk", name = "cg", descriptor = "(ILclient!nd;Lclient!mw;I)V", line = 190)
	@Override
	public void method27037(@OriginalArg(0) int arg0, @OriginalArg(1) Class433 arg1, @OriginalArg(2) Class426 arg2, @OriginalArg(3) int arg3) {
		this.anInt4075 = arg3;
		if (!this.method27058(arg0, arg1, arg2)) {
			throw new RuntimeException("");
		}
		this.aClass433_1 = arg1;
		this.aClass426_1 = arg2;
	}

	@OriginalMember(owner = "client!hk", name = "cu", descriptor = "(ILclient!nd;Lclient!mw;I)V", line = 190)
	@Override
	public void method27039(@OriginalArg(0) int arg0, @OriginalArg(1) Class433 arg1, @OriginalArg(2) Class426 arg2, @OriginalArg(3) int arg3) {
		this.anInt4075 = arg3;
		if (!this.method27058(arg0, arg1, arg2)) {
			throw new RuntimeException("");
		}
		this.aClass433_1 = arg1;
		this.aClass426_1 = arg2;
	}

	@OriginalMember(owner = "client!hk", name = "ci", descriptor = "(ILclient!nd;Lclient!mw;I)V", line = 190)
	@Override
	public void method27042(@OriginalArg(0) int arg0, @OriginalArg(1) Class433 arg1, @OriginalArg(2) Class426 arg2, @OriginalArg(3) int arg3) {
		this.anInt4075 = arg3;
		if (!this.method27058(arg0, arg1, arg2)) {
			throw new RuntimeException("");
		}
		this.aClass433_1 = arg1;
		this.aClass426_1 = arg2;
	}

	@OriginalMember(owner = "client!hk", name = "ce", descriptor = "(ILclient!nd;Lclient!mw;I)V", line = 190)
	@Override
	public void method27038(@OriginalArg(0) int arg0, @OriginalArg(1) Class433 arg1, @OriginalArg(2) Class426 arg2, @OriginalArg(3) int arg3) {
		this.anInt4075 = arg3;
		if (!this.method27058(arg0, arg1, arg2)) {
			throw new RuntimeException("");
		}
		this.aClass433_1 = arg1;
		this.aClass426_1 = arg2;
	}

	@OriginalMember(owner = "client!hk", name = "s", descriptor = "(ILclient!nd;Lclient!mw;)Z", line = 199)
	boolean method27058(@OriginalArg(0) int arg0, @OriginalArg(1) Class433 arg1, @OriginalArg(2) Class426 arg2) {
		if (arg1 == Class433.aClass433_3) {
			return true;
		} else if (arg1 == Class433.aClass433_4) {
			return true;
		} else if (arg1 == Class433.aClass433_2) {
			return true;
		} else {
			return arg1 == Class433.aClass433_5;
		}
	}

	@OriginalMember(owner = "client!hk", name = "cn", descriptor = "(ILclient!nd;Lclient!mw;)Z", line = 199)
	boolean method27059(@OriginalArg(0) int arg0, @OriginalArg(1) Class433 arg1, @OriginalArg(2) Class426 arg2) {
		if (arg1 == Class433.aClass433_3) {
			return true;
		} else if (arg1 == Class433.aClass433_4) {
			return true;
		} else if (arg1 == Class433.aClass433_2) {
			return true;
		} else {
			return arg1 == Class433.aClass433_5;
		}
	}

	@OriginalMember(owner = "client!hk", name = "cv", descriptor = "(ILclient!nd;Lclient!mw;)Z", line = 199)
	boolean method27060(@OriginalArg(0) int arg0, @OriginalArg(1) Class433 arg1, @OriginalArg(2) Class426 arg2) {
		if (arg1 == Class433.aClass433_3) {
			return true;
		} else if (arg1 == Class433.aClass433_4) {
			return true;
		} else if (arg1 == Class433.aClass433_2) {
			return true;
		} else {
			return arg1 == Class433.aClass433_5;
		}
	}

	@OriginalMember(owner = "client!hk", name = "cp", descriptor = "(ILclient!nd;Lclient!mw;)Z", line = 199)
	boolean method27061(@OriginalArg(0) int arg0, @OriginalArg(1) Class433 arg1, @OriginalArg(2) Class426 arg2) {
		if (arg1 == Class433.aClass433_3) {
			return true;
		} else if (arg1 == Class433.aClass433_4) {
			return true;
		} else if (arg1 == Class433.aClass433_2) {
			return true;
		} else {
			return arg1 == Class433.aClass433_5;
		}
	}

	@OriginalMember(owner = "client!hk", name = "ca", descriptor = "()I", line = 207)
	int method27062() {
		if (!this.aBoolean703) {
			throw new RuntimeException("");
		}
		return this.anInt4064;
	}

	@OriginalMember(owner = "client!hk", name = "cx", descriptor = "()I", line = 207)
	int method27063() {
		if (!this.aBoolean703) {
			throw new RuntimeException("");
		}
		return this.anInt4064;
	}

	@OriginalMember(owner = "client!hk", name = "y", descriptor = "()I", line = 207)
	int method27064() {
		if (!this.aBoolean703) {
			throw new RuntimeException("");
		}
		return this.anInt4064;
	}

	@OriginalMember(owner = "client!hk", name = "q", descriptor = "()I", line = 214)
	@Override
	public int method27005() {
		if (!this.aBoolean703) {
			throw new RuntimeException("");
		}
		return this.method27064() < this.anInt4075 ? this.anInt4075 : this.method27064();
	}

	@OriginalMember(owner = "client!hk", name = "cw", descriptor = "()I", line = 214)
	@Override
	public int method27045() {
		if (!this.aBoolean703) {
			throw new RuntimeException("");
		}
		return this.method27064() < this.anInt4075 ? this.anInt4075 : this.method27064();
	}

	@OriginalMember(owner = "client!hk", name = "ct", descriptor = "()I", line = 214)
	@Override
	public int method27040() {
		if (!this.aBoolean703) {
			throw new RuntimeException("");
		}
		return this.method27064() < this.anInt4075 ? this.anInt4075 : this.method27064();
	}

	@OriginalMember(owner = "client!hk", name = "cf", descriptor = "()I", line = 214)
	@Override
	public int method27043() {
		if (!this.aBoolean703) {
			throw new RuntimeException("");
		}
		return this.method27064() < this.anInt4075 ? this.anInt4075 : this.method27064();
	}

	@OriginalMember(owner = "client!hk", name = "co", descriptor = "()I", line = 214)
	@Override
	public int method27044() {
		if (!this.aBoolean703) {
			throw new RuntimeException("");
		}
		return this.method27064() < this.anInt4075 ? this.anInt4075 : this.method27064();
	}

	@OriginalMember(owner = "client!hk", name = "cr", descriptor = "()Z", line = 221)
	@Override
	public synchronized boolean method27002() {
		return this.aBoolean704;
	}

	@OriginalMember(owner = "client!hk", name = "cm", descriptor = "()Z", line = 221)
	@Override
	public synchronized boolean method27046() {
		return this.aBoolean704;
	}

	@OriginalMember(owner = "client!hk", name = "x", descriptor = "()Z", line = 221)
	@Override
	public synchronized boolean method27011() {
		return this.aBoolean704;
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(Z)V", line = 225)
	synchronized void method27065(@OriginalArg(0) boolean arg0) {
		this.aBoolean704 = arg0;
	}

	@OriginalMember(owner = "client!hk", name = "cq", descriptor = "(Z)V", line = 225)
	synchronized void method27066(@OriginalArg(0) boolean arg0) {
		this.aBoolean704 = arg0;
	}

	@OriginalMember(owner = "client!hk", name = "ch", descriptor = "(Z)V", line = 225)
	synchronized void method27067(@OriginalArg(0) boolean arg0) {
		this.aBoolean704 = arg0;
	}

	@OriginalMember(owner = "client!hk", name = "cb", descriptor = "(Z)V", line = 225)
	synchronized void method27068(@OriginalArg(0) boolean arg0) {
		this.aBoolean704 = arg0;
	}

	@OriginalMember(owner = "client!hk", name = "cy", descriptor = "(Z)V", line = 225)
	synchronized void method27069(@OriginalArg(0) boolean arg0) {
		this.aBoolean704 = arg0;
	}

	@OriginalMember(owner = "client!hk", name = "cs", descriptor = "(Z)V", line = 225)
	synchronized void method27070(@OriginalArg(0) boolean arg0) {
		this.aBoolean704 = arg0;
	}

	@OriginalMember(owner = "client!hk", name = "h", descriptor = "(II)[Lclient!hb;", line = 229)
	Class308[] method27071(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Class308[] local2 = new Class308[arg0];
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			local2[local4] = this.method27076(arg1);
		}
		return local2;
	}

	@OriginalMember(owner = "client!hk", name = "cc", descriptor = "(II)[Lclient!hb;", line = 229)
	Class308[] method27072(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Class308[] local2 = new Class308[arg0];
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			local2[local4] = this.method27076(arg1);
		}
		return local2;
	}

	@OriginalMember(owner = "client!hk", name = "cz", descriptor = "(II)[Lclient!hb;", line = 229)
	Class308[] method27073(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Class308[] local2 = new Class308[arg0];
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			local2[local4] = this.method27076(arg1);
		}
		return local2;
	}

	@OriginalMember(owner = "client!hk", name = "ck", descriptor = "(I)Lclient!hb;", line = 237)
	Class308 method27074(@OriginalArg(0) int arg0) {
		@Pc(2) Class240 local2 = aClass240_78;
		synchronized (aClass240_78) {
			@Pc(5) Class308 local5 = null;
			local5 = (Class308) aClass240_78.method25865(1893897135);
			@Pc(12) Class308 local12 = null;
			@Pc(14) int local14 = arg0;
			while (local5 != null) {
				if (local5.aFloatArray103.length > arg0 && !local5.aBoolean679 && (local12 == null || local5.aFloatArray103.length < local14)) {
					local12 = local5;
					local14 = local5.aFloatArray103.length;
				}
				if (local5.aFloatArray103.length == arg0 && !local5.aBoolean679) {
					break;
				}
				local5 = (Class308) aClass240_78.method25867(-1178677118);
			}
			if (local5 == null) {
				local5 = local12;
			}
			@Pc(65) int local65;
			if (local5 == null) {
				local5 = new Class308(this);
				local65 = 0;
				@Pc(67) boolean local67 = false;
				while (!local67 && local65 < 1000) {
					if (aClass240_78.method25829((long) local65) == null) {
						local67 = true;
					} else {
						local65++;
					}
				}
				local5.anInt3948 = local65;
				@Pc(88) float[] local88 = new float[arg0];
				local5.aFloatArray103 = local88;
				local5.aBoolean679 = true;
				local5.anInt3947 = arg0;
				if (aClass240_78.method25854((byte) 122) < arg0 * 4) {
				}
				aClass240_78.method25840(local5, (long) local5.anInt3948, local88.length * 4, 45463102);
			} else {
				for (local65 = 0; local65 < local5.aFloatArray103.length; local65++) {
					local5.aFloatArray103[local65] = 0.0F;
				}
				local5.anInt3947 = arg0;
			}
			local5.aBoolean679 = true;
			return local5;
		}
	}

	@OriginalMember(owner = "client!hk", name = "cj", descriptor = "(I)Lclient!hb;", line = 237)
	Class308 method27075(@OriginalArg(0) int arg0) {
		@Pc(2) Class240 local2 = aClass240_78;
		synchronized (aClass240_78) {
			@Pc(5) Class308 local5 = null;
			local5 = (Class308) aClass240_78.method25865(1967836458);
			@Pc(12) Class308 local12 = null;
			@Pc(14) int local14 = arg0;
			while (local5 != null) {
				if (local5.aFloatArray103.length > arg0 && !local5.aBoolean679 && (local12 == null || local5.aFloatArray103.length < local14)) {
					local12 = local5;
					local14 = local5.aFloatArray103.length;
				}
				if (local5.aFloatArray103.length == arg0 && !local5.aBoolean679) {
					break;
				}
				local5 = (Class308) aClass240_78.method25867(-1241931400);
			}
			if (local5 == null) {
				local5 = local12;
			}
			@Pc(65) int local65;
			if (local5 == null) {
				local5 = new Class308(this);
				local65 = 0;
				@Pc(67) boolean local67 = false;
				while (!local67 && local65 < 1000) {
					if (aClass240_78.method25829((long) local65) == null) {
						local67 = true;
					} else {
						local65++;
					}
				}
				local5.anInt3948 = local65;
				@Pc(88) float[] local88 = new float[arg0];
				local5.aFloatArray103 = local88;
				local5.aBoolean679 = true;
				local5.anInt3947 = arg0;
				if (aClass240_78.method25854((byte) 121) < arg0 * 4) {
				}
				aClass240_78.method25840(local5, (long) local5.anInt3948, local88.length * 4, 91683900);
			} else {
				for (local65 = 0; local65 < local5.aFloatArray103.length; local65++) {
					local5.aFloatArray103[local65] = 0.0F;
				}
				local5.anInt3947 = arg0;
			}
			local5.aBoolean679 = true;
			return local5;
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)Lclient!hb;", line = 237)
	Class308 method27076(@OriginalArg(0) int arg0) {
		@Pc(2) Class240 local2 = aClass240_78;
		synchronized (aClass240_78) {
			@Pc(5) Class308 local5 = null;
			local5 = (Class308) aClass240_78.method25865(1851879417);
			@Pc(12) Class308 local12 = null;
			@Pc(14) int local14 = arg0;
			while (local5 != null) {
				if (local5.aFloatArray103.length > arg0 && !local5.aBoolean679 && (local12 == null || local5.aFloatArray103.length < local14)) {
					local12 = local5;
					local14 = local5.aFloatArray103.length;
				}
				if (local5.aFloatArray103.length == arg0 && !local5.aBoolean679) {
					break;
				}
				local5 = (Class308) aClass240_78.method25867(-1142619747);
			}
			if (local5 == null) {
				local5 = local12;
			}
			@Pc(65) int local65;
			if (local5 == null) {
				local5 = new Class308(this);
				local65 = 0;
				@Pc(67) boolean local67 = false;
				while (!local67 && local65 < 1000) {
					if (aClass240_78.method25829((long) local65) == null) {
						local67 = true;
					} else {
						local65++;
					}
				}
				local5.anInt3948 = local65;
				@Pc(88) float[] local88 = new float[arg0];
				local5.aFloatArray103 = local88;
				local5.aBoolean679 = true;
				local5.anInt3947 = arg0;
				if (aClass240_78.method25854((byte) 120) < arg0 * 4) {
				}
				aClass240_78.method25840(local5, (long) local5.anInt3948, local88.length * 4, 386990751);
			} else {
				for (local65 = 0; local65 < local5.aFloatArray103.length; local65++) {
					local5.aFloatArray103[local65] = 0.0F;
				}
				local5.anInt3947 = arg0;
			}
			local5.aBoolean679 = true;
			return local5;
		}
	}

	@OriginalMember(owner = "client!hk", name = "g", descriptor = "(Lclient!hb;)V", line = 293)
	void method27077(@OriginalArg(0) Class308 arg0) {
		if (arg0 != null) {
			@Pc(5) Class240 local5 = aClass240_78;
			synchronized (aClass240_78) {
				arg0.aBoolean679 = false;
			}
		}
	}

	@OriginalMember(owner = "client!hk", name = "cd", descriptor = "(Lclient!hb;)V", line = 293)
	void method27078(@OriginalArg(0) Class308 arg0) {
		if (arg0 != null) {
			@Pc(5) Class240 local5 = aClass240_78;
			synchronized (aClass240_78) {
				arg0.aBoolean679 = false;
			}
		}
	}

	@OriginalMember(owner = "client!hk", name = "dr", descriptor = "([Lclient!hb;)V", line = 300)
	void method27079(@OriginalArg(0) Class308[] arg0) {
		if (arg0 != null) {
			for (@Pc(4) int local4 = 0; local4 < arg0.length; local4++) {
				this.method27077(arg0[local4]);
			}
		}
	}

	@OriginalMember(owner = "client!hk", name = "dd", descriptor = "([Lclient!hb;)V", line = 300)
	void method27080(@OriginalArg(0) Class308[] arg0) {
		if (arg0 != null) {
			for (@Pc(4) int local4 = 0; local4 < arg0.length; local4++) {
				this.method27077(arg0[local4]);
			}
		}
	}

	@OriginalMember(owner = "client!hk", name = "i", descriptor = "([Lclient!hb;)V", line = 300)
	void method27081(@OriginalArg(0) Class308[] arg0) {
		if (arg0 != null) {
			for (@Pc(4) int local4 = 0; local4 < arg0.length; local4++) {
				this.method27077(arg0[local4]);
			}
		}
	}

	@OriginalMember(owner = "client!hk", name = "da", descriptor = "([Lclient!hb;)V", line = 300)
	void method27082(@OriginalArg(0) Class308[] arg0) {
		if (arg0 != null) {
			for (@Pc(4) int local4 = 0; local4 < arg0.length; local4++) {
				this.method27077(arg0[local4]);
			}
		}
	}

	@OriginalMember(owner = "client!hk", name = "dt", descriptor = "([Lclient!hb;)V", line = 300)
	void method27083(@OriginalArg(0) Class308[] arg0) {
		if (arg0 != null) {
			for (@Pc(4) int local4 = 0; local4 < arg0.length; local4++) {
				this.method27077(arg0[local4]);
			}
		}
	}

	@OriginalMember(owner = "client!hk", name = "j", descriptor = "(Z)V", line = 307)
	synchronized void method27084(@OriginalArg(0) boolean arg0) {
		if (!arg0) {
			this.anInt4071 = 0;
			this.anInt4067 = 0;
			this.aBooleanArray25 = null;
			this.anIntArray384 = null;
			this.method27081(this.aClass308Array3);
			this.aClass308Array3 = null;
			this.method27081(this.aClass308Array1);
			this.aClass308Array1 = null;
			this.anInt4068 = 0;
			this.anInt4072 = 0;
			this.aBooleanArray27 = null;
			this.method27081(this.aClass308Array2);
			this.aClass308Array2 = null;
			this.method27077(this.aClass308_2);
			this.method27077(this.aClass308_3);
			this.method27077(this.aClass308_4);
			this.method27077(this.aClass308_5);
			this.method27077(this.aClass308_6);
			this.method27077(this.aClass308_1);
			this.aClass308_2 = null;
			this.aClass308_3 = null;
			this.aClass308_4 = null;
			this.aClass308_5 = null;
			this.aClass308_6 = null;
			this.aClass308_1 = null;
			this.anIntArray385 = null;
			this.anIntArray386 = null;
		}
		this.anInt4085 = 0;
		@Pc(98) Iterator local98 = this.aList17.iterator();
		while (local98.hasNext()) {
			@Pc(105) Packet local105 = (Packet) local98.next();
			local105.release((byte) 1);
		}
		this.aList17.clear();
		this.aBoolean705 = false;
		if (this.aPacket_15 != null) {
			@Pc(122) Packet local122 = this.aPacket_15;
			synchronized (this.aPacket_15) {
				this.aPacket_15.release((byte) 1);
				this.aPacket_15 = null;
			}
		}
		this.anInt4076 = 0;
		this.anInt4078 = 0;
		@Pc(162) Packet local162;
		@Pc(150) List local150;
		@Pc(155) Iterator local155;
		if (!arg0) {
			local150 = this.aList16;
			synchronized (this.aList16) {
				local155 = this.aList16.iterator();
				while (true) {
					if (!local155.hasNext()) {
						this.aList16.clear();
						break;
					}
					local162 = (Packet) local155.next();
					local162.release((byte) 1);
				}
			}
			this.anInt4087 = 0;
		}
		local150 = this.aList14;
		synchronized (this.aList14) {
			local155 = this.aList14.iterator();
			while (true) {
				if (!local155.hasNext()) {
					this.aList14.clear();
					break;
				}
				local162 = (Packet) local155.next();
				local162.release((byte) 1);
			}
		}
		this.aBoolean702 = false;
		this.anInt4079 = 0;
		this.anInt4077 = -1;
		this.anInt4082 = -1;
		if (arg0) {
			this.anInt4084++;
			this.aBoolean706 = true;
			return;
		}
		this.method27065(false);
		this.aBoolean703 = false;
		this.anInt4090 = -1;
		this.anInt4070 = -1;
		this.anInt4083 = 0;
		this.anInt4084 = 0;
		this.anInt4074 = -1;
		this.anInt4088 = -1;
		this.anInt4080 = -1;
		this.anInt4081 = -1;
		this.aBoolean706 = false;
		this.aBoolean707 = false;
	}

	@OriginalMember(owner = "client!hk", name = "do", descriptor = "(Z)V", line = 307)
	synchronized void method27085(@OriginalArg(0) boolean arg0) {
		if (!arg0) {
			this.anInt4071 = 0;
			this.anInt4067 = 0;
			this.aBooleanArray25 = null;
			this.anIntArray384 = null;
			this.method27081(this.aClass308Array3);
			this.aClass308Array3 = null;
			this.method27081(this.aClass308Array1);
			this.aClass308Array1 = null;
			this.anInt4068 = 0;
			this.anInt4072 = 0;
			this.aBooleanArray27 = null;
			this.method27081(this.aClass308Array2);
			this.aClass308Array2 = null;
			this.method27077(this.aClass308_2);
			this.method27077(this.aClass308_3);
			this.method27077(this.aClass308_4);
			this.method27077(this.aClass308_5);
			this.method27077(this.aClass308_6);
			this.method27077(this.aClass308_1);
			this.aClass308_2 = null;
			this.aClass308_3 = null;
			this.aClass308_4 = null;
			this.aClass308_5 = null;
			this.aClass308_6 = null;
			this.aClass308_1 = null;
			this.anIntArray385 = null;
			this.anIntArray386 = null;
		}
		this.anInt4085 = 0;
		@Pc(98) Iterator local98 = this.aList17.iterator();
		while (local98.hasNext()) {
			@Pc(105) Packet local105 = (Packet) local98.next();
			local105.release((byte) 1);
		}
		this.aList17.clear();
		this.aBoolean705 = false;
		if (this.aPacket_15 != null) {
			@Pc(122) Packet local122 = this.aPacket_15;
			synchronized (this.aPacket_15) {
				this.aPacket_15.release((byte) 1);
				this.aPacket_15 = null;
			}
		}
		this.anInt4076 = 0;
		this.anInt4078 = 0;
		@Pc(162) Packet local162;
		@Pc(150) List local150;
		@Pc(155) Iterator local155;
		if (!arg0) {
			local150 = this.aList16;
			synchronized (this.aList16) {
				local155 = this.aList16.iterator();
				while (true) {
					if (!local155.hasNext()) {
						this.aList16.clear();
						break;
					}
					local162 = (Packet) local155.next();
					local162.release((byte) 1);
				}
			}
			this.anInt4087 = 0;
		}
		local150 = this.aList14;
		synchronized (this.aList14) {
			local155 = this.aList14.iterator();
			while (true) {
				if (!local155.hasNext()) {
					this.aList14.clear();
					break;
				}
				local162 = (Packet) local155.next();
				local162.release((byte) 1);
			}
		}
		this.aBoolean702 = false;
		this.anInt4079 = 0;
		this.anInt4077 = -1;
		this.anInt4082 = -1;
		if (arg0) {
			this.anInt4084++;
			this.aBoolean706 = true;
			return;
		}
		this.method27065(false);
		this.aBoolean703 = false;
		this.anInt4090 = -1;
		this.anInt4070 = -1;
		this.anInt4083 = 0;
		this.anInt4084 = 0;
		this.anInt4074 = -1;
		this.anInt4088 = -1;
		this.anInt4080 = -1;
		this.anInt4081 = -1;
		this.aBoolean706 = false;
		this.aBoolean707 = false;
	}

	@OriginalMember(owner = "client!hk", name = "dz", descriptor = "(Z)V", line = 307)
	synchronized void method27086(@OriginalArg(0) boolean arg0) {
		if (!arg0) {
			this.anInt4071 = 0;
			this.anInt4067 = 0;
			this.aBooleanArray25 = null;
			this.anIntArray384 = null;
			this.method27081(this.aClass308Array3);
			this.aClass308Array3 = null;
			this.method27081(this.aClass308Array1);
			this.aClass308Array1 = null;
			this.anInt4068 = 0;
			this.anInt4072 = 0;
			this.aBooleanArray27 = null;
			this.method27081(this.aClass308Array2);
			this.aClass308Array2 = null;
			this.method27077(this.aClass308_2);
			this.method27077(this.aClass308_3);
			this.method27077(this.aClass308_4);
			this.method27077(this.aClass308_5);
			this.method27077(this.aClass308_6);
			this.method27077(this.aClass308_1);
			this.aClass308_2 = null;
			this.aClass308_3 = null;
			this.aClass308_4 = null;
			this.aClass308_5 = null;
			this.aClass308_6 = null;
			this.aClass308_1 = null;
			this.anIntArray385 = null;
			this.anIntArray386 = null;
		}
		this.anInt4085 = 0;
		@Pc(98) Iterator local98 = this.aList17.iterator();
		while (local98.hasNext()) {
			@Pc(105) Packet local105 = (Packet) local98.next();
			local105.release((byte) 1);
		}
		this.aList17.clear();
		this.aBoolean705 = false;
		if (this.aPacket_15 != null) {
			@Pc(122) Packet local122 = this.aPacket_15;
			synchronized (this.aPacket_15) {
				this.aPacket_15.release((byte) 1);
				this.aPacket_15 = null;
			}
		}
		this.anInt4076 = 0;
		this.anInt4078 = 0;
		@Pc(162) Packet local162;
		@Pc(150) List local150;
		@Pc(155) Iterator local155;
		if (!arg0) {
			local150 = this.aList16;
			synchronized (this.aList16) {
				local155 = this.aList16.iterator();
				while (true) {
					if (!local155.hasNext()) {
						this.aList16.clear();
						break;
					}
					local162 = (Packet) local155.next();
					local162.release((byte) 1);
				}
			}
			this.anInt4087 = 0;
		}
		local150 = this.aList14;
		synchronized (this.aList14) {
			local155 = this.aList14.iterator();
			while (true) {
				if (!local155.hasNext()) {
					this.aList14.clear();
					break;
				}
				local162 = (Packet) local155.next();
				local162.release((byte) 1);
			}
		}
		this.aBoolean702 = false;
		this.anInt4079 = 0;
		this.anInt4077 = -1;
		this.anInt4082 = -1;
		if (arg0) {
			this.anInt4084++;
			this.aBoolean706 = true;
			return;
		}
		this.method27065(false);
		this.aBoolean703 = false;
		this.anInt4090 = -1;
		this.anInt4070 = -1;
		this.anInt4083 = 0;
		this.anInt4084 = 0;
		this.anInt4074 = -1;
		this.anInt4088 = -1;
		this.anInt4080 = -1;
		this.anInt4081 = -1;
		this.aBoolean706 = false;
		this.aBoolean707 = false;
	}

	@OriginalMember(owner = "client!hk", name = "dv", descriptor = "(Z)V", line = 307)
	synchronized void method27087(@OriginalArg(0) boolean arg0) {
		if (!arg0) {
			this.anInt4071 = 0;
			this.anInt4067 = 0;
			this.aBooleanArray25 = null;
			this.anIntArray384 = null;
			this.method27081(this.aClass308Array3);
			this.aClass308Array3 = null;
			this.method27081(this.aClass308Array1);
			this.aClass308Array1 = null;
			this.anInt4068 = 0;
			this.anInt4072 = 0;
			this.aBooleanArray27 = null;
			this.method27081(this.aClass308Array2);
			this.aClass308Array2 = null;
			this.method27077(this.aClass308_2);
			this.method27077(this.aClass308_3);
			this.method27077(this.aClass308_4);
			this.method27077(this.aClass308_5);
			this.method27077(this.aClass308_6);
			this.method27077(this.aClass308_1);
			this.aClass308_2 = null;
			this.aClass308_3 = null;
			this.aClass308_4 = null;
			this.aClass308_5 = null;
			this.aClass308_6 = null;
			this.aClass308_1 = null;
			this.anIntArray385 = null;
			this.anIntArray386 = null;
		}
		this.anInt4085 = 0;
		@Pc(98) Iterator local98 = this.aList17.iterator();
		while (local98.hasNext()) {
			@Pc(105) Packet local105 = (Packet) local98.next();
			local105.release((byte) 1);
		}
		this.aList17.clear();
		this.aBoolean705 = false;
		if (this.aPacket_15 != null) {
			@Pc(122) Packet local122 = this.aPacket_15;
			synchronized (this.aPacket_15) {
				this.aPacket_15.release((byte) 1);
				this.aPacket_15 = null;
			}
		}
		this.anInt4076 = 0;
		this.anInt4078 = 0;
		@Pc(162) Packet local162;
		@Pc(150) List local150;
		@Pc(155) Iterator local155;
		if (!arg0) {
			local150 = this.aList16;
			synchronized (this.aList16) {
				local155 = this.aList16.iterator();
				while (true) {
					if (!local155.hasNext()) {
						this.aList16.clear();
						break;
					}
					local162 = (Packet) local155.next();
					local162.release((byte) 1);
				}
			}
			this.anInt4087 = 0;
		}
		local150 = this.aList14;
		synchronized (this.aList14) {
			local155 = this.aList14.iterator();
			while (true) {
				if (!local155.hasNext()) {
					this.aList14.clear();
					break;
				}
				local162 = (Packet) local155.next();
				local162.release((byte) 1);
			}
		}
		this.aBoolean702 = false;
		this.anInt4079 = 0;
		this.anInt4077 = -1;
		this.anInt4082 = -1;
		if (arg0) {
			this.anInt4084++;
			this.aBoolean706 = true;
			return;
		}
		this.method27065(false);
		this.aBoolean703 = false;
		this.anInt4090 = -1;
		this.anInt4070 = -1;
		this.anInt4083 = 0;
		this.anInt4084 = 0;
		this.anInt4074 = -1;
		this.anInt4088 = -1;
		this.anInt4080 = -1;
		this.anInt4081 = -1;
		this.aBoolean706 = false;
		this.aBoolean707 = false;
	}

	@OriginalMember(owner = "client!hk", name = "dm", descriptor = "()V", line = 399)
	void method27088() {
		if (this.method27041() != Class413.aClass413_6) {
			this.method27136();
			if (this.method27041() == Class413.aClass413_4) {
				this.method27054(Class413.aClass413_3);
			}
		}
	}

	@OriginalMember(owner = "client!hk", name = "t", descriptor = "()V", line = 399)
	void method27089() {
		if (this.method27041() != Class413.aClass413_6) {
			this.method27136();
			if (this.method27041() == Class413.aClass413_4) {
				this.method27054(Class413.aClass413_3);
			}
		}
	}

	@OriginalMember(owner = "client!hk", name = "dq", descriptor = "()V", line = 399)
	void method27090() {
		if (this.method27041() != Class413.aClass413_6) {
			this.method27136();
			if (this.method27041() == Class413.aClass413_4) {
				this.method27054(Class413.aClass413_3);
			}
		}
	}

	@OriginalMember(owner = "client!hk", name = "dc", descriptor = "(Lclient!alw;)V", line = 409)
	void method27091(@OriginalArg(0) Packet arg0) {
		this.aList17.add(arg0);
	}

	@OriginalMember(owner = "client!hk", name = "di", descriptor = "(Lclient!alw;)V", line = 409)
	void method27092(@OriginalArg(0) Packet arg0) {
		this.aList17.add(arg0);
	}

	@OriginalMember(owner = "client!hk", name = "ae", descriptor = "(Lclient!alw;)V", line = 409)
	void method27093(@OriginalArg(0) Packet arg0) {
		this.aList17.add(arg0);
	}

	@OriginalMember(owner = "client!hk", name = "ag", descriptor = "()Z", line = 413)
	boolean method27094() {
		return this.aBoolean705;
	}

	@OriginalMember(owner = "client!hk", name = "dn", descriptor = "()Z", line = 413)
	boolean method27095() {
		return this.aBoolean705;
	}

	@OriginalMember(owner = "client!hk", name = "dk", descriptor = "()Z", line = 413)
	boolean method27096() {
		return this.aBoolean705;
	}

	@OriginalMember(owner = "client!hk", name = "df", descriptor = "()Z", line = 413)
	boolean method27097() {
		return this.aBoolean705;
	}

	@OriginalMember(owner = "client!hk", name = "ah", descriptor = "(Lclient!alw;)Z", line = 417)
	boolean method27098(@OriginalArg(0) Packet arg0) {
		return arg0.g1((short) 16384) == 79 && arg0.g1((short) 16384) == 103 && arg0.g1((short) 16384) == 103 && arg0.g1((short) 16384) == 83;
	}

	@OriginalMember(owner = "client!hk", name = "dw", descriptor = "(Lclient!alw;)Z", line = 417)
	boolean method27099(@OriginalArg(0) Packet arg0) {
		return arg0.g1((short) 16384) == 79 && arg0.g1((short) 16384) == 103 && arg0.g1((short) 16384) == 103 && arg0.g1((short) 16384) == 83;
	}

	@OriginalMember(owner = "client!hk", name = "al", descriptor = "([BII)Z", line = 424)
	boolean method27100(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0[arg1] == arg2) {
			return arg0[arg1 + 1] == 118 && arg0[arg1 + 2] == 111 && arg0[arg1 + 3] == 114 && arg0[arg1 + 4] == 98 && arg0[arg1 + 5] == 105 && arg0[arg1 + 6] == 115;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!hk", name = "du", descriptor = "([BII)Z", line = 424)
	boolean method27101(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0[arg1] == arg2) {
			return arg0[arg1 + 1] == 118 && arg0[arg1 + 2] == 111 && arg0[arg1 + 3] == 114 && arg0[arg1 + 4] == 98 && arg0[arg1 + 5] == 105 && arg0[arg1 + 6] == 115;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!hk", name = "ds", descriptor = "([BII)Z", line = 424)
	boolean method27102(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0[arg1] == arg2) {
			return arg0[arg1 + 1] == 118 && arg0[arg1 + 2] == 111 && arg0[arg1 + 3] == 114 && arg0[arg1 + 4] == 98 && arg0[arg1 + 5] == 105 && arg0[arg1 + 6] == 115;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!hk", name = "ac", descriptor = "(I)F", line = 434)
	float method27103(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!hk", name = "dl", descriptor = "(I)F", line = 434)
	float method27104(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0 & 0x1FFFFF;
		@Pc(7) int local7 = arg0 & Integer.MIN_VALUE;
		@Pc(13) int local13 = arg0 >> 21 & 0x3FF;
		if (local7 != 0) {
			local3 = -local3;
		}
		return (float) ((double) local3 * Math.pow(2.0D, (double) (local13 - 788)));
	}

	@OriginalMember(owner = "client!hk", name = "ai", descriptor = "()I", line = 442)
	int method27105() {
		return this.anInt4089;
	}

	@OriginalMember(owner = "client!hk", name = "dp", descriptor = "()I", line = 442)
	int method27106() {
		return this.anInt4089;
	}

	@OriginalMember(owner = "client!hk", name = "dy", descriptor = "()I", line = 446)
	int method27107() {
		return this.anInt4091;
	}

	@OriginalMember(owner = "client!hk", name = "aw", descriptor = "()I", line = 446)
	int method27108() {
		return this.anInt4091;
	}

	@OriginalMember(owner = "client!hk", name = "db", descriptor = "()I", line = 446)
	int method27109() {
		return this.anInt4091;
	}

	@OriginalMember(owner = "client!hk", name = "as", descriptor = "([BI)V", line = 450)
	void method27110(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.aByteArray79 = arg0;
		this.anInt4089 = arg1;
		this.anInt4091 = 0;
	}

	@OriginalMember(owner = "client!hk", name = "dh", descriptor = "([BI)V", line = 450)
	void method27111(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.aByteArray79 = arg0;
		this.anInt4089 = arg1;
		this.anInt4091 = 0;
	}

	@OriginalMember(owner = "client!hk", name = "at", descriptor = "()I", line = 456)
	int method27112() {
		@Pc(10) int local10 = this.aByteArray79[this.anInt4089] >> this.anInt4091 & 0x1;
		this.anInt4091++;
		this.anInt4089 += this.anInt4091 >> 3;
		this.anInt4091 &= 0x7;
		return local10;
	}

	@OriginalMember(owner = "client!hk", name = "dx", descriptor = "()I", line = 456)
	int method27113() {
		@Pc(10) int local10 = this.aByteArray79[this.anInt4089] >> this.anInt4091 & 0x1;
		this.anInt4091++;
		this.anInt4089 += this.anInt4091 >> 3;
		this.anInt4091 &= 0x7;
		return local10;
	}

	@OriginalMember(owner = "client!hk", name = "dg", descriptor = "(I)I", line = 464)
	int method27114(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(14) int local14;
		while (arg0 >= 8 - this.anInt4091) {
			local14 = 8 - this.anInt4091;
			@Pc(20) int local20 = (0x1 << local14) - 1;
			local1 += (this.aByteArray79[this.anInt4089] >> this.anInt4091 & local20) << local3;
			this.anInt4091 = 0;
			this.anInt4089++;
			local3 += local14;
			arg0 -= local14;
		}
		if (arg0 > 0) {
			local14 = (0x1 << arg0) - 1;
			local1 += (this.aByteArray79[this.anInt4089] >> this.anInt4091 & local14) << local3;
			this.anInt4091 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!hk", name = "de", descriptor = "(I)I", line = 464)
	int method27115(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(14) int local14;
		while (arg0 >= 8 - this.anInt4091) {
			local14 = 8 - this.anInt4091;
			@Pc(20) int local20 = (0x1 << local14) - 1;
			local1 += (this.aByteArray79[this.anInt4089] >> this.anInt4091 & local20) << local3;
			this.anInt4091 = 0;
			this.anInt4089++;
			local3 += local14;
			arg0 -= local14;
		}
		if (arg0 > 0) {
			local14 = (0x1 << arg0) - 1;
			local1 += (this.aByteArray79[this.anInt4089] >> this.anInt4091 & local14) << local3;
			this.anInt4091 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!hk", name = "ad", descriptor = "(I)I", line = 464)
	int method27116(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(14) int local14;
		while (arg0 >= 8 - this.anInt4091) {
			local14 = 8 - this.anInt4091;
			@Pc(20) int local20 = (0x1 << local14) - 1;
			local1 += (this.aByteArray79[this.anInt4089] >> this.anInt4091 & local20) << local3;
			this.anInt4091 = 0;
			this.anInt4089++;
			local3 += local14;
			arg0 -= local14;
		}
		if (arg0 > 0) {
			local14 = (0x1 << arg0) - 1;
			local1 += (this.aByteArray79[this.anInt4089] >> this.anInt4091 & local14) << local3;
			this.anInt4091 += arg0;
		}
		return local1;
	}

	@OriginalMember(owner = "client!hk", name = "am", descriptor = "()V", line = 484)
	void method27117() {
		this.aByteArray79 = null;
	}

	@OriginalMember(owner = "client!hk", name = "au", descriptor = "()V", line = 488)
	void method27118() {
		@Pc(5) int local5 = this.method27116(8) + 1;
		@Pc(8) Iterator local8 = aList15.iterator();
		@Pc(15) Class307 local15;
		do {
			if (!local8.hasNext()) {
				this.aClass324Array2 = new Class324[local5];
				for (@Pc(69) int local69 = 0; local69 < local5; local69++) {
					if (this.aClass324Array2[local69] == null) {
						this.aClass324Array2[local69] = new Class324();
					}
					this.aClass324Array2[local69].method27285(this);
				}
				@Pc(108) Class307 local108 = new Class307(this.anInt4064, this.anInt4073, this.anInt4065, this.anInt4066, this.anInt4069, this.aClass324Array2);
				aList15.add(local108);
				return;
			}
			local15 = (Class307) local8.next();
		} while (local15.anInt3943 != 0 || local15.anInt3946 != 0 || local15.aClass324Array1.length != local5 || local15.anInt3942 != this.anInt4064 || local15.anInt3944 != this.anInt4073 || local15.anInt3945 != this.anInt4069);
		this.aClass324Array2 = local15.aClass324Array1;
		for (@Pc(48) int local48 = 0; local48 < this.aClass324Array2.length; local48++) {
			this.aClass324Array2[local48].method27282(this);
		}
	}

	@OriginalMember(owner = "client!hk", name = "dj", descriptor = "()V", line = 488)
	void method27119() {
		@Pc(5) int local5 = this.method27116(8) + 1;
		@Pc(8) Iterator local8 = aList15.iterator();
		@Pc(15) Class307 local15;
		do {
			if (!local8.hasNext()) {
				this.aClass324Array2 = new Class324[local5];
				for (@Pc(69) int local69 = 0; local69 < local5; local69++) {
					if (this.aClass324Array2[local69] == null) {
						this.aClass324Array2[local69] = new Class324();
					}
					this.aClass324Array2[local69].method27285(this);
				}
				@Pc(108) Class307 local108 = new Class307(this.anInt4064, this.anInt4073, this.anInt4065, this.anInt4066, this.anInt4069, this.aClass324Array2);
				aList15.add(local108);
				return;
			}
			local15 = (Class307) local8.next();
		} while (local15.anInt3943 != 0 || local15.anInt3946 != 0 || local15.aClass324Array1.length != local5 || local15.anInt3942 != this.anInt4064 || local15.anInt3944 != this.anInt4073 || local15.anInt3945 != this.anInt4069);
		this.aClass324Array2 = local15.aClass324Array1;
		for (@Pc(48) int local48 = 0; local48 < this.aClass324Array2.length; local48++) {
			this.aClass324Array2[local48].method27282(this);
		}
	}

	@OriginalMember(owner = "client!hk", name = "ar", descriptor = "([BI)V", line = 516)
	void method27120(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt4085 = 0;
		if (this.method27011()) {
			return;
		}
		if (arg0 == null) {
			throw new RuntimeException("");
		}
		@Pc(15) byte local15 = 0;
		if (this.method27100(arg0, arg1, 1)) {
			local15 = 1;
		} else if (this.method27100(arg0, arg1, 3)) {
			local15 = 3;
		} else if (this.method27100(arg0, arg1, 5)) {
			local15 = 5;
		} else {
			throw new RuntimeException("" + local15);
		}
		@Pc(67) int local67;
		@Pc(112) int local112;
		if (local15 == 1) {
			this.method27110(arg0, arg1 + 7);
			local67 = this.method27116(32);
			this.anInt4064 = this.method27116(8);
			this.anInt4073 = this.method27116(32);
			this.anInt4065 = this.method27116(32);
			this.anInt4069 = this.method27116(32);
			this.anInt4066 = this.method27116(32);
			this.anInt4071 = 0x1 << this.method27116(4);
			this.anInt4067 = 0x1 << this.method27116(4);
			local112 = 0x1 << this.method27116(1);
			if (local67 != 0 || local112 == 0) {
				throw new RuntimeException("");
			}
			this.aBoolean703 = true;
			this.anInt4077++;
		} else if (local15 != 3 && local15 == 5) {
			if (!this.method27100(arg0, arg1, 5)) {
				throw new RuntimeException("");
			}
			this.method27110(arg0, arg1 + 7);
			if (this.aClass308Array2 != null) {
				this.method27081(this.aClass308Array2);
				this.aClass308Array2 = null;
			}
			this.aClass308Array2 = this.method27071(this.anInt4064, this.anInt4067);
			@Pc(190) int local190;
			@Pc(194) int local194;
			@Pc(198) int local198;
			for (local67 = 0; local67 < 2; local67++) {
				local112 = local67 == 0 ? this.anInt4071 : this.anInt4067;
				local190 = local112 >> 1;
				local194 = local112 >> 2;
				local198 = local112 >> 3;
				@Pc(202) Class308 local202 = this.method27076(local190);
				for (@Pc(204) int local204 = 0; local204 < local194; local204++) {
					local202.aFloatArray103[local204 * 2] = (float) Math.cos((double) (local204 * 4) * 3.141592653589793D / (double) local112);
					local202.aFloatArray103[local204 * 2 + 1] = -((float) Math.sin((double) (local204 * 4) * 3.141592653589793D / (double) local112));
				}
				@Pc(250) Class308 local250 = this.method27076(local190);
				for (@Pc(252) int local252 = 0; local252 < local194; local252++) {
					local250.aFloatArray103[local252 * 2] = (float) Math.cos((double) (local252 * 2 + 1) * 3.141592653589793D / (double) (local112 * 2));
					local250.aFloatArray103[local252 * 2 + 1] = (float) Math.sin((double) (local252 * 2 + 1) * 3.141592653589793D / (double) (local112 * 2));
				}
				@Pc(305) Class308 local305 = this.method27076(local194);
				for (@Pc(307) int local307 = 0; local307 < local198; local307++) {
					local305.aFloatArray103[local307 * 2] = (float) Math.cos((double) (local307 * 4 + 2) * 3.141592653589793D / (double) local112);
					local305.aFloatArray103[local307 * 2 + 1] = -((float) Math.sin((double) (local307 * 4 + 2) * 3.141592653589793D / (double) local112));
				}
				@Pc(356) int[] local356 = new int[local198];
				@Pc(362) int local362 = Class548.method31010(local198 - 1, -1225483021);
				for (@Pc(364) int local364 = 0; local364 < local198; local364++) {
					local356[local364] = Class438.method28828(local364, local362, 2073155620);
				}
				if (local67 == 0) {
					this.aClass308_2 = local202;
					this.aClass308_3 = local250;
					this.aClass308_4 = local305;
					this.anIntArray385 = local356;
				} else {
					this.aClass308_5 = local202;
					this.aClass308_6 = local250;
					this.aClass308_1 = local305;
					this.anIntArray386 = local356;
				}
			}
			this.method27118();
			local67 = this.method27116(6) + 1;
			for (local112 = 0; local112 < local67; local112++) {
				this.method27116(16);
			}
			local67 = this.method27116(6) + 1;
			if (this.aClass317Array1 == null || this.aClass317Array1.length != local67) {
				this.aClass317Array1 = new Class317[local67];
			}
			for (local112 = 0; local112 < local67; local112++) {
				if (this.aClass317Array1[local112] == null) {
					this.aClass317Array1[local112] = new Class317();
				}
				this.aClass317Array1[local112].method27170(this, this.anInt4064);
			}
			local112 = this.method27116(6) + 1;
			if (this.aClass289Array1 == null || this.aClass289Array1.length != local112) {
				this.aClass289Array1 = new Class289[local112];
			}
			for (local190 = 0; local190 < local112; local190++) {
				if (this.aClass289Array1[local190] == null) {
					this.aClass289Array1[local190] = new Class289();
				}
				this.aClass289Array1[local190].method26551(this);
			}
			local190 = this.method27116(6) + 1;
			if (this.aClass316Array1 == null || this.aClass316Array1.length != local190) {
				this.aClass316Array1 = new Class316[local190];
			}
			for (local194 = 0; local194 < local190; local194++) {
				if (this.aClass316Array1[local194] == null) {
					this.aClass316Array1[local194] = new Class316();
				}
				this.aClass316Array1[local194].method27162(this);
			}
			local194 = this.method27116(6) + 1;
			this.aBooleanArray25 = new boolean[local194];
			this.anIntArray384 = new int[local194];
			for (local198 = 0; local198 < local194; local198++) {
				this.aBooleanArray25[local198] = this.method27112() != 0;
				this.method27116(16);
				this.method27116(16);
				this.anIntArray384[local198] = this.method27116(8);
			}
			this.method27065(true);
		}
	}

	@OriginalMember(owner = "client!hk", name = "eo", descriptor = "([BI)V", line = 516)
	void method27121(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt4085 = 0;
		if (this.method27011()) {
			return;
		}
		if (arg0 == null) {
			throw new RuntimeException("");
		}
		@Pc(15) byte local15 = 0;
		if (this.method27100(arg0, arg1, 1)) {
			local15 = 1;
		} else if (this.method27100(arg0, arg1, 3)) {
			local15 = 3;
		} else if (this.method27100(arg0, arg1, 5)) {
			local15 = 5;
		} else {
			throw new RuntimeException("" + local15);
		}
		@Pc(67) int local67;
		@Pc(112) int local112;
		if (local15 == 1) {
			this.method27110(arg0, arg1 + 7);
			local67 = this.method27116(32);
			this.anInt4064 = this.method27116(8);
			this.anInt4073 = this.method27116(32);
			this.anInt4065 = this.method27116(32);
			this.anInt4069 = this.method27116(32);
			this.anInt4066 = this.method27116(32);
			this.anInt4071 = 0x1 << this.method27116(4);
			this.anInt4067 = 0x1 << this.method27116(4);
			local112 = 0x1 << this.method27116(1);
			if (local67 != 0 || local112 == 0) {
				throw new RuntimeException("");
			}
			this.aBoolean703 = true;
			this.anInt4077++;
		} else if (local15 != 3 && local15 == 5) {
			if (!this.method27100(arg0, arg1, 5)) {
				throw new RuntimeException("");
			}
			this.method27110(arg0, arg1 + 7);
			if (this.aClass308Array2 != null) {
				this.method27081(this.aClass308Array2);
				this.aClass308Array2 = null;
			}
			this.aClass308Array2 = this.method27071(this.anInt4064, this.anInt4067);
			@Pc(190) int local190;
			@Pc(194) int local194;
			@Pc(198) int local198;
			for (local67 = 0; local67 < 2; local67++) {
				local112 = local67 == 0 ? this.anInt4071 : this.anInt4067;
				local190 = local112 >> 1;
				local194 = local112 >> 2;
				local198 = local112 >> 3;
				@Pc(202) Class308 local202 = this.method27076(local190);
				for (@Pc(204) int local204 = 0; local204 < local194; local204++) {
					local202.aFloatArray103[local204 * 2] = (float) Math.cos((double) (local204 * 4) * 3.141592653589793D / (double) local112);
					local202.aFloatArray103[local204 * 2 + 1] = -((float) Math.sin((double) (local204 * 4) * 3.141592653589793D / (double) local112));
				}
				@Pc(250) Class308 local250 = this.method27076(local190);
				for (@Pc(252) int local252 = 0; local252 < local194; local252++) {
					local250.aFloatArray103[local252 * 2] = (float) Math.cos((double) (local252 * 2 + 1) * 3.141592653589793D / (double) (local112 * 2));
					local250.aFloatArray103[local252 * 2 + 1] = (float) Math.sin((double) (local252 * 2 + 1) * 3.141592653589793D / (double) (local112 * 2));
				}
				@Pc(305) Class308 local305 = this.method27076(local194);
				for (@Pc(307) int local307 = 0; local307 < local198; local307++) {
					local305.aFloatArray103[local307 * 2] = (float) Math.cos((double) (local307 * 4 + 2) * 3.141592653589793D / (double) local112);
					local305.aFloatArray103[local307 * 2 + 1] = -((float) Math.sin((double) (local307 * 4 + 2) * 3.141592653589793D / (double) local112));
				}
				@Pc(356) int[] local356 = new int[local198];
				@Pc(362) int local362 = Class548.method31010(local198 - 1, -616261194);
				for (@Pc(364) int local364 = 0; local364 < local198; local364++) {
					local356[local364] = Class438.method28828(local364, local362, 2073155620);
				}
				if (local67 == 0) {
					this.aClass308_2 = local202;
					this.aClass308_3 = local250;
					this.aClass308_4 = local305;
					this.anIntArray385 = local356;
				} else {
					this.aClass308_5 = local202;
					this.aClass308_6 = local250;
					this.aClass308_1 = local305;
					this.anIntArray386 = local356;
				}
			}
			this.method27118();
			local67 = this.method27116(6) + 1;
			for (local112 = 0; local112 < local67; local112++) {
				this.method27116(16);
			}
			local67 = this.method27116(6) + 1;
			if (this.aClass317Array1 == null || this.aClass317Array1.length != local67) {
				this.aClass317Array1 = new Class317[local67];
			}
			for (local112 = 0; local112 < local67; local112++) {
				if (this.aClass317Array1[local112] == null) {
					this.aClass317Array1[local112] = new Class317();
				}
				this.aClass317Array1[local112].method27170(this, this.anInt4064);
			}
			local112 = this.method27116(6) + 1;
			if (this.aClass289Array1 == null || this.aClass289Array1.length != local112) {
				this.aClass289Array1 = new Class289[local112];
			}
			for (local190 = 0; local190 < local112; local190++) {
				if (this.aClass289Array1[local190] == null) {
					this.aClass289Array1[local190] = new Class289();
				}
				this.aClass289Array1[local190].method26551(this);
			}
			local190 = this.method27116(6) + 1;
			if (this.aClass316Array1 == null || this.aClass316Array1.length != local190) {
				this.aClass316Array1 = new Class316[local190];
			}
			for (local194 = 0; local194 < local190; local194++) {
				if (this.aClass316Array1[local194] == null) {
					this.aClass316Array1[local194] = new Class316();
				}
				this.aClass316Array1[local194].method27162(this);
			}
			local194 = this.method27116(6) + 1;
			this.aBooleanArray25 = new boolean[local194];
			this.anIntArray384 = new int[local194];
			for (local198 = 0; local198 < local194; local198++) {
				this.aBooleanArray25[local198] = this.method27112() != 0;
				this.method27116(16);
				this.method27116(16);
				this.anIntArray384[local198] = this.method27116(8);
			}
			this.method27065(true);
		}
	}

	@OriginalMember(owner = "client!hk", name = "ed", descriptor = "([BI)V", line = 516)
	void method27122(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt4085 = 0;
		if (this.method27011()) {
			return;
		}
		if (arg0 == null) {
			throw new RuntimeException("");
		}
		@Pc(15) byte local15 = 0;
		if (this.method27100(arg0, arg1, 1)) {
			local15 = 1;
		} else if (this.method27100(arg0, arg1, 3)) {
			local15 = 3;
		} else if (this.method27100(arg0, arg1, 5)) {
			local15 = 5;
		} else {
			throw new RuntimeException("" + local15);
		}
		@Pc(67) int local67;
		@Pc(112) int local112;
		if (local15 == 1) {
			this.method27110(arg0, arg1 + 7);
			local67 = this.method27116(32);
			this.anInt4064 = this.method27116(8);
			this.anInt4073 = this.method27116(32);
			this.anInt4065 = this.method27116(32);
			this.anInt4069 = this.method27116(32);
			this.anInt4066 = this.method27116(32);
			this.anInt4071 = 0x1 << this.method27116(4);
			this.anInt4067 = 0x1 << this.method27116(4);
			local112 = 0x1 << this.method27116(1);
			if (local67 != 0 || local112 == 0) {
				throw new RuntimeException("");
			}
			this.aBoolean703 = true;
			this.anInt4077++;
		} else if (local15 != 3 && local15 == 5) {
			if (!this.method27100(arg0, arg1, 5)) {
				throw new RuntimeException("");
			}
			this.method27110(arg0, arg1 + 7);
			if (this.aClass308Array2 != null) {
				this.method27081(this.aClass308Array2);
				this.aClass308Array2 = null;
			}
			this.aClass308Array2 = this.method27071(this.anInt4064, this.anInt4067);
			@Pc(190) int local190;
			@Pc(194) int local194;
			@Pc(198) int local198;
			for (local67 = 0; local67 < 2; local67++) {
				local112 = local67 == 0 ? this.anInt4071 : this.anInt4067;
				local190 = local112 >> 1;
				local194 = local112 >> 2;
				local198 = local112 >> 3;
				@Pc(202) Class308 local202 = this.method27076(local190);
				for (@Pc(204) int local204 = 0; local204 < local194; local204++) {
					local202.aFloatArray103[local204 * 2] = (float) Math.cos((double) (local204 * 4) * 3.141592653589793D / (double) local112);
					local202.aFloatArray103[local204 * 2 + 1] = -((float) Math.sin((double) (local204 * 4) * 3.141592653589793D / (double) local112));
				}
				@Pc(250) Class308 local250 = this.method27076(local190);
				for (@Pc(252) int local252 = 0; local252 < local194; local252++) {
					local250.aFloatArray103[local252 * 2] = (float) Math.cos((double) (local252 * 2 + 1) * 3.141592653589793D / (double) (local112 * 2));
					local250.aFloatArray103[local252 * 2 + 1] = (float) Math.sin((double) (local252 * 2 + 1) * 3.141592653589793D / (double) (local112 * 2));
				}
				@Pc(305) Class308 local305 = this.method27076(local194);
				for (@Pc(307) int local307 = 0; local307 < local198; local307++) {
					local305.aFloatArray103[local307 * 2] = (float) Math.cos((double) (local307 * 4 + 2) * 3.141592653589793D / (double) local112);
					local305.aFloatArray103[local307 * 2 + 1] = -((float) Math.sin((double) (local307 * 4 + 2) * 3.141592653589793D / (double) local112));
				}
				@Pc(356) int[] local356 = new int[local198];
				@Pc(362) int local362 = Class548.method31010(local198 - 1, -1207039547);
				for (@Pc(364) int local364 = 0; local364 < local198; local364++) {
					local356[local364] = Class438.method28828(local364, local362, 2073155620);
				}
				if (local67 == 0) {
					this.aClass308_2 = local202;
					this.aClass308_3 = local250;
					this.aClass308_4 = local305;
					this.anIntArray385 = local356;
				} else {
					this.aClass308_5 = local202;
					this.aClass308_6 = local250;
					this.aClass308_1 = local305;
					this.anIntArray386 = local356;
				}
			}
			this.method27118();
			local67 = this.method27116(6) + 1;
			for (local112 = 0; local112 < local67; local112++) {
				this.method27116(16);
			}
			local67 = this.method27116(6) + 1;
			if (this.aClass317Array1 == null || this.aClass317Array1.length != local67) {
				this.aClass317Array1 = new Class317[local67];
			}
			for (local112 = 0; local112 < local67; local112++) {
				if (this.aClass317Array1[local112] == null) {
					this.aClass317Array1[local112] = new Class317();
				}
				this.aClass317Array1[local112].method27170(this, this.anInt4064);
			}
			local112 = this.method27116(6) + 1;
			if (this.aClass289Array1 == null || this.aClass289Array1.length != local112) {
				this.aClass289Array1 = new Class289[local112];
			}
			for (local190 = 0; local190 < local112; local190++) {
				if (this.aClass289Array1[local190] == null) {
					this.aClass289Array1[local190] = new Class289();
				}
				this.aClass289Array1[local190].method26551(this);
			}
			local190 = this.method27116(6) + 1;
			if (this.aClass316Array1 == null || this.aClass316Array1.length != local190) {
				this.aClass316Array1 = new Class316[local190];
			}
			for (local194 = 0; local194 < local190; local194++) {
				if (this.aClass316Array1[local194] == null) {
					this.aClass316Array1[local194] = new Class316();
				}
				this.aClass316Array1[local194].method27162(this);
			}
			local194 = this.method27116(6) + 1;
			this.aBooleanArray25 = new boolean[local194];
			this.anIntArray384 = new int[local194];
			for (local198 = 0; local198 < local194; local198++) {
				this.aBooleanArray25[local198] = this.method27112() != 0;
				this.method27116(16);
				this.method27116(16);
				this.anIntArray384[local198] = this.method27116(8);
			}
			this.method27065(true);
		}
	}

	@OriginalMember(owner = "client!hk", name = "eu", descriptor = "([BI)V", line = 516)
	void method27123(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt4085 = 0;
		if (this.method27011()) {
			return;
		}
		if (arg0 == null) {
			throw new RuntimeException("");
		}
		@Pc(15) byte local15 = 0;
		if (this.method27100(arg0, arg1, 1)) {
			local15 = 1;
		} else if (this.method27100(arg0, arg1, 3)) {
			local15 = 3;
		} else if (this.method27100(arg0, arg1, 5)) {
			local15 = 5;
		} else {
			throw new RuntimeException("" + local15);
		}
		@Pc(67) int local67;
		@Pc(112) int local112;
		if (local15 == 1) {
			this.method27110(arg0, arg1 + 7);
			local67 = this.method27116(32);
			this.anInt4064 = this.method27116(8);
			this.anInt4073 = this.method27116(32);
			this.anInt4065 = this.method27116(32);
			this.anInt4069 = this.method27116(32);
			this.anInt4066 = this.method27116(32);
			this.anInt4071 = 0x1 << this.method27116(4);
			this.anInt4067 = 0x1 << this.method27116(4);
			local112 = 0x1 << this.method27116(1);
			if (local67 != 0 || local112 == 0) {
				throw new RuntimeException("");
			}
			this.aBoolean703 = true;
			this.anInt4077++;
		} else if (local15 != 3 && local15 == 5) {
			if (!this.method27100(arg0, arg1, 5)) {
				throw new RuntimeException("");
			}
			this.method27110(arg0, arg1 + 7);
			if (this.aClass308Array2 != null) {
				this.method27081(this.aClass308Array2);
				this.aClass308Array2 = null;
			}
			this.aClass308Array2 = this.method27071(this.anInt4064, this.anInt4067);
			@Pc(190) int local190;
			@Pc(194) int local194;
			@Pc(198) int local198;
			for (local67 = 0; local67 < 2; local67++) {
				local112 = local67 == 0 ? this.anInt4071 : this.anInt4067;
				local190 = local112 >> 1;
				local194 = local112 >> 2;
				local198 = local112 >> 3;
				@Pc(202) Class308 local202 = this.method27076(local190);
				for (@Pc(204) int local204 = 0; local204 < local194; local204++) {
					local202.aFloatArray103[local204 * 2] = (float) Math.cos((double) (local204 * 4) * 3.141592653589793D / (double) local112);
					local202.aFloatArray103[local204 * 2 + 1] = -((float) Math.sin((double) (local204 * 4) * 3.141592653589793D / (double) local112));
				}
				@Pc(250) Class308 local250 = this.method27076(local190);
				for (@Pc(252) int local252 = 0; local252 < local194; local252++) {
					local250.aFloatArray103[local252 * 2] = (float) Math.cos((double) (local252 * 2 + 1) * 3.141592653589793D / (double) (local112 * 2));
					local250.aFloatArray103[local252 * 2 + 1] = (float) Math.sin((double) (local252 * 2 + 1) * 3.141592653589793D / (double) (local112 * 2));
				}
				@Pc(305) Class308 local305 = this.method27076(local194);
				for (@Pc(307) int local307 = 0; local307 < local198; local307++) {
					local305.aFloatArray103[local307 * 2] = (float) Math.cos((double) (local307 * 4 + 2) * 3.141592653589793D / (double) local112);
					local305.aFloatArray103[local307 * 2 + 1] = -((float) Math.sin((double) (local307 * 4 + 2) * 3.141592653589793D / (double) local112));
				}
				@Pc(356) int[] local356 = new int[local198];
				@Pc(362) int local362 = Class548.method31010(local198 - 1, -912053816);
				for (@Pc(364) int local364 = 0; local364 < local198; local364++) {
					local356[local364] = Class438.method28828(local364, local362, 2073155620);
				}
				if (local67 == 0) {
					this.aClass308_2 = local202;
					this.aClass308_3 = local250;
					this.aClass308_4 = local305;
					this.anIntArray385 = local356;
				} else {
					this.aClass308_5 = local202;
					this.aClass308_6 = local250;
					this.aClass308_1 = local305;
					this.anIntArray386 = local356;
				}
			}
			this.method27118();
			local67 = this.method27116(6) + 1;
			for (local112 = 0; local112 < local67; local112++) {
				this.method27116(16);
			}
			local67 = this.method27116(6) + 1;
			if (this.aClass317Array1 == null || this.aClass317Array1.length != local67) {
				this.aClass317Array1 = new Class317[local67];
			}
			for (local112 = 0; local112 < local67; local112++) {
				if (this.aClass317Array1[local112] == null) {
					this.aClass317Array1[local112] = new Class317();
				}
				this.aClass317Array1[local112].method27170(this, this.anInt4064);
			}
			local112 = this.method27116(6) + 1;
			if (this.aClass289Array1 == null || this.aClass289Array1.length != local112) {
				this.aClass289Array1 = new Class289[local112];
			}
			for (local190 = 0; local190 < local112; local190++) {
				if (this.aClass289Array1[local190] == null) {
					this.aClass289Array1[local190] = new Class289();
				}
				this.aClass289Array1[local190].method26551(this);
			}
			local190 = this.method27116(6) + 1;
			if (this.aClass316Array1 == null || this.aClass316Array1.length != local190) {
				this.aClass316Array1 = new Class316[local190];
			}
			for (local194 = 0; local194 < local190; local194++) {
				if (this.aClass316Array1[local194] == null) {
					this.aClass316Array1[local194] = new Class316();
				}
				this.aClass316Array1[local194].method27162(this);
			}
			local194 = this.method27116(6) + 1;
			this.aBooleanArray25 = new boolean[local194];
			this.anIntArray384 = new int[local194];
			for (local198 = 0; local198 < local194; local198++) {
				this.aBooleanArray25[local198] = this.method27112() != 0;
				this.method27116(16);
				this.method27116(16);
				this.anIntArray384[local198] = this.method27116(8);
			}
			this.method27065(true);
		}
	}

	@OriginalMember(owner = "client!hk", name = "ey", descriptor = "([BI)V", line = 516)
	void method27124(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt4085 = 0;
		if (this.method27011()) {
			return;
		}
		if (arg0 == null) {
			throw new RuntimeException("");
		}
		@Pc(15) byte local15 = 0;
		if (this.method27100(arg0, arg1, 1)) {
			local15 = 1;
		} else if (this.method27100(arg0, arg1, 3)) {
			local15 = 3;
		} else if (this.method27100(arg0, arg1, 5)) {
			local15 = 5;
		} else {
			throw new RuntimeException("" + local15);
		}
		@Pc(67) int local67;
		@Pc(112) int local112;
		if (local15 == 1) {
			this.method27110(arg0, arg1 + 7);
			local67 = this.method27116(32);
			this.anInt4064 = this.method27116(8);
			this.anInt4073 = this.method27116(32);
			this.anInt4065 = this.method27116(32);
			this.anInt4069 = this.method27116(32);
			this.anInt4066 = this.method27116(32);
			this.anInt4071 = 0x1 << this.method27116(4);
			this.anInt4067 = 0x1 << this.method27116(4);
			local112 = 0x1 << this.method27116(1);
			if (local67 != 0 || local112 == 0) {
				throw new RuntimeException("");
			}
			this.aBoolean703 = true;
			this.anInt4077++;
		} else if (local15 != 3 && local15 == 5) {
			if (!this.method27100(arg0, arg1, 5)) {
				throw new RuntimeException("");
			}
			this.method27110(arg0, arg1 + 7);
			if (this.aClass308Array2 != null) {
				this.method27081(this.aClass308Array2);
				this.aClass308Array2 = null;
			}
			this.aClass308Array2 = this.method27071(this.anInt4064, this.anInt4067);
			@Pc(190) int local190;
			@Pc(194) int local194;
			@Pc(198) int local198;
			for (local67 = 0; local67 < 2; local67++) {
				local112 = local67 == 0 ? this.anInt4071 : this.anInt4067;
				local190 = local112 >> 1;
				local194 = local112 >> 2;
				local198 = local112 >> 3;
				@Pc(202) Class308 local202 = this.method27076(local190);
				for (@Pc(204) int local204 = 0; local204 < local194; local204++) {
					local202.aFloatArray103[local204 * 2] = (float) Math.cos((double) (local204 * 4) * 3.141592653589793D / (double) local112);
					local202.aFloatArray103[local204 * 2 + 1] = -((float) Math.sin((double) (local204 * 4) * 3.141592653589793D / (double) local112));
				}
				@Pc(250) Class308 local250 = this.method27076(local190);
				for (@Pc(252) int local252 = 0; local252 < local194; local252++) {
					local250.aFloatArray103[local252 * 2] = (float) Math.cos((double) (local252 * 2 + 1) * 3.141592653589793D / (double) (local112 * 2));
					local250.aFloatArray103[local252 * 2 + 1] = (float) Math.sin((double) (local252 * 2 + 1) * 3.141592653589793D / (double) (local112 * 2));
				}
				@Pc(305) Class308 local305 = this.method27076(local194);
				for (@Pc(307) int local307 = 0; local307 < local198; local307++) {
					local305.aFloatArray103[local307 * 2] = (float) Math.cos((double) (local307 * 4 + 2) * 3.141592653589793D / (double) local112);
					local305.aFloatArray103[local307 * 2 + 1] = -((float) Math.sin((double) (local307 * 4 + 2) * 3.141592653589793D / (double) local112));
				}
				@Pc(356) int[] local356 = new int[local198];
				@Pc(362) int local362 = Class548.method31010(local198 - 1, -1846707322);
				for (@Pc(364) int local364 = 0; local364 < local198; local364++) {
					local356[local364] = Class438.method28828(local364, local362, 2073155620);
				}
				if (local67 == 0) {
					this.aClass308_2 = local202;
					this.aClass308_3 = local250;
					this.aClass308_4 = local305;
					this.anIntArray385 = local356;
				} else {
					this.aClass308_5 = local202;
					this.aClass308_6 = local250;
					this.aClass308_1 = local305;
					this.anIntArray386 = local356;
				}
			}
			this.method27118();
			local67 = this.method27116(6) + 1;
			for (local112 = 0; local112 < local67; local112++) {
				this.method27116(16);
			}
			local67 = this.method27116(6) + 1;
			if (this.aClass317Array1 == null || this.aClass317Array1.length != local67) {
				this.aClass317Array1 = new Class317[local67];
			}
			for (local112 = 0; local112 < local67; local112++) {
				if (this.aClass317Array1[local112] == null) {
					this.aClass317Array1[local112] = new Class317();
				}
				this.aClass317Array1[local112].method27170(this, this.anInt4064);
			}
			local112 = this.method27116(6) + 1;
			if (this.aClass289Array1 == null || this.aClass289Array1.length != local112) {
				this.aClass289Array1 = new Class289[local112];
			}
			for (local190 = 0; local190 < local112; local190++) {
				if (this.aClass289Array1[local190] == null) {
					this.aClass289Array1[local190] = new Class289();
				}
				this.aClass289Array1[local190].method26551(this);
			}
			local190 = this.method27116(6) + 1;
			if (this.aClass316Array1 == null || this.aClass316Array1.length != local190) {
				this.aClass316Array1 = new Class316[local190];
			}
			for (local194 = 0; local194 < local190; local194++) {
				if (this.aClass316Array1[local194] == null) {
					this.aClass316Array1[local194] = new Class316();
				}
				this.aClass316Array1[local194].method27162(this);
			}
			local194 = this.method27116(6) + 1;
			this.aBooleanArray25 = new boolean[local194];
			this.anIntArray384 = new int[local194];
			for (local198 = 0; local198 < local194; local198++) {
				this.aBooleanArray25[local198] = this.method27112() != 0;
				this.method27116(16);
				this.method27116(16);
				this.anIntArray384[local198] = this.method27116(8);
			}
			this.method27065(true);
		}
	}

	@OriginalMember(owner = "client!hk", name = "ap", descriptor = "(I)I", line = 645)
	int method27125(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		while (arg0 > 0) {
			local1++;
			arg0 >>= 0x1;
		}
		return local1;
	}

	@OriginalMember(owner = "client!hk", name = "ei", descriptor = "(I)I", line = 645)
	int method27126(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		while (arg0 > 0) {
			local1++;
			arg0 >>= 0x1;
		}
		return local1;
	}

	@OriginalMember(owner = "client!hk", name = "ee", descriptor = "(I)I", line = 645)
	int method27127(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		while (arg0 > 0) {
			local1++;
			arg0 >>= 0x1;
		}
		return local1;
	}

	@OriginalMember(owner = "client!hk", name = "es", descriptor = "(I)I", line = 645)
	int method27128(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		while (arg0 > 0) {
			local1++;
			arg0 >>= 0x1;
		}
		return local1;
	}

	@OriginalMember(owner = "client!hk", name = "el", descriptor = "(I)I", line = 645)
	int method27129(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		while (arg0 > 0) {
			local1++;
			arg0 >>= 0x1;
		}
		return local1;
	}

	@OriginalMember(owner = "client!hk", name = "ec", descriptor = "([BIILjava/util/concurrent/atomic/AtomicReference;)Z", line = 654)
	boolean method27130(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) AtomicReference arg3) {
		if (arg0 == null) {
			throw new RuntimeException("");
		} else if (arg1 + arg2 > arg0.length) {
			return false;
		} else {
			this.method27110(arg0, arg1);
			@Pc(21) int local21 = this.method27112();
			if (local21 != 0) {
				this.method27120(arg0, arg1);
				return false;
			} else if (this.method27011()) {
				@Pc(46) int local46 = this.method27116(this.method27125(this.anIntArray384.length - 1));
				@Pc(51) boolean local51 = this.aBooleanArray25[local46];
				@Pc(59) int local59 = local51 ? this.anInt4067 : this.anInt4071;
				@Pc(61) boolean local61 = false;
				@Pc(63) boolean local63 = false;
				if (local51) {
					local61 = this.method27112() != 0;
					local63 = this.method27112() != 0;
				}
				@Pc(83) int local83 = local59 >> 1;
				@Pc(96) int local96;
				@Pc(105) int local105;
				@Pc(110) int local110;
				if (local51 && !local61) {
					local96 = (local59 >> 2) - (this.anInt4071 >> 2);
					local105 = (local59 >> 2) + (this.anInt4071 >> 2);
					local110 = this.anInt4071 >> 1;
				} else {
					local96 = 0;
					local105 = local83;
					local110 = local59 >> 1;
				}
				@Pc(134) int local134;
				@Pc(145) int local145;
				@Pc(150) int local150;
				if (local51 && !local63) {
					local134 = local59 - (local59 >> 2) - (this.anInt4071 >> 2);
					local145 = local59 - (local59 >> 2) + (this.anInt4071 >> 2);
					local150 = this.anInt4071 >> 1;
				} else {
					local134 = local83;
					local145 = local59;
					local150 = local59 >> 1;
				}
				@Pc(167) Class316 local167 = this.aClass316Array1[this.anIntArray384[local46]];
				if (this.aBooleanArray28 == null || this.aBooleanArray28.length != this.anInt4064) {
					this.aBooleanArray28 = new boolean[this.anInt4064];
					this.aBooleanArray24 = new boolean[this.anInt4064];
				}
				@Pc(188) int local188;
				@Pc(202) int local202;
				@Pc(209) int local209;
				for (local188 = 0; local188 < this.anInt4064; local188++) {
					local202 = local167.anIntArray387 == null ? 0 : local167.anIntArray387[local188];
					local209 = local167.anIntArray390[local202];
					this.aBooleanArray28[local188] = !this.aClass317Array1[local209].method27198(local188);
					this.aBooleanArray24[local188] = this.aBooleanArray28[local188];
				}
				for (local188 = 0; local188 < local167.anInt4093; local188++) {
					if (!this.aBooleanArray28[local167.anIntArray388[local188]] || !this.aBooleanArray28[local167.anIntArray391[local188]]) {
						this.aBooleanArray28[local167.anIntArray388[local188]] = false;
						this.aBooleanArray28[local167.anIntArray391[local188]] = false;
					}
				}
				if (this.aBooleanArray26 == null || this.aBooleanArray26.length != this.anInt4064) {
					this.aBooleanArray26 = new boolean[this.anInt4064];
				}
				@Pc(297) int local297;
				@Pc(349) int local349;
				@Pc(455) int local455;
				for (local188 = 0; local188 < local167.anInt4092; local188++) {
					local202 = 0;
					for (local297 = 0; local297 < this.anInt4064; local297++) {
						local209 = local167.anIntArray387 == null ? local188 : local167.anIntArray387[local297];
						if (local209 == local188) {
							this.aBooleanArray26[local202++] = this.aBooleanArray28[local297];
						}
					}
					@Pc(333) Class289 local333 = this.aClass289Array1[local167.anIntArray389[local188]];
					@Pc(335) Class308[] local335 = null;
					if (local333.anInt3909 == 2) {
						@Pc(347) Class308[] local347 = this.method27071(1, this.anInt4064 * local59);
						local349 = 0;
						while (true) {
							@Pc(354) int local354;
							if (local349 >= local59) {
								local347 = local333.method26555(local347, local59 >> 1, this.aBooleanArray26);
								local335 = this.aClass308Array2;
								for (local349 = 0; local349 < local59; local349++) {
									for (local354 = 0; local354 < this.anInt4064; local354++) {
										try {
											local335[local354].aFloatArray103[local349] = local347[0].aFloatArray103[this.anInt4064 * local349 + local354];
										} catch (@Pc(426) ArrayIndexOutOfBoundsException local426) {
											local426.printStackTrace();
										}
									}
								}
								this.method27081(local347);
								local347 = null;
								break;
							}
							for (local354 = 0; local354 < this.anInt4064; local354++) {
								try {
									local347[0].aFloatArray103[local349 * this.anInt4064 + local354] = this.aClass308Array2[local354].aFloatArray103[local349];
								} catch (@Pc(378) ArrayIndexOutOfBoundsException local378) {
									local378.printStackTrace();
								}
							}
							local349++;
						}
					} else {
						local335 = local333.method26555(this.aClass308Array2, local59 >> 1, this.aBooleanArray26);
					}
					if (local167.anIntArray387 == null) {
						if (this.aClass308Array2 != local335) {
							this.method27081(this.aClass308Array2);
						}
						this.aClass308Array2 = local335;
					} else {
						local202 = 0;
						for (local455 = 0; local455 < this.anInt4064; local455++) {
							local349 = local167.anIntArray387[local455];
							if (local349 == local188) {
								this.aClass308Array2[local455] = local335[local202++];
							}
						}
					}
				}
				for (local188 = local167.anInt4093 - 1; local188 >= 0; local188--) {
					@Pc(506) Class308 local506 = this.aClass308Array2[local167.anIntArray388[local188]];
					@Pc(514) Class308 local514 = this.aClass308Array2[local167.anIntArray391[local188]];
					for (local209 = 0; local209 < local506.anInt3947; local209++) {
						@Pc(525) float local525 = local506.aFloatArray103[local209];
						@Pc(530) float local530 = local514.aFloatArray103[local209];
						@Pc(548) float local548;
						@Pc(544) float local544;
						if (local525 > 0.0F) {
							if (local530 > 0.0F) {
								local544 = local525;
								local548 = local525 - local530;
							} else {
								local548 = local525;
								local544 = local525 + local530;
							}
						} else if (local530 > 0.0F) {
							local544 = local525;
							local548 = local525 + local530;
						} else {
							local548 = local525;
							local544 = local525 - local530;
						}
						local506.aFloatArray103[local209] = local544;
						local514.aFloatArray103[local209] = local548;
					}
				}
				for (local188 = 0; local188 < this.aBooleanArray28.length; local188++) {
					this.aBooleanArray28[local188] = this.aBooleanArray24[local188];
				}
				for (local188 = 0; local188 < this.anInt4064; local188++) {
					if (!this.aBooleanArray28[local188]) {
						local202 = local167.anIntArray387 == null ? 0 : local167.anIntArray387[local188];
						local209 = local167.anIntArray390[local202];
						this.aClass317Array1[local209].method27201(local188);
						this.aClass317Array1[local209].method27205(this.aClass308Array2[local188], local59 >> 1, local188);
					}
				}
				for (local188 = 0; local188 < this.anInt4064; local188++) {
					if (this.aBooleanArray28[local188]) {
						for (local202 = local59 >> 1; local202 < local59; local202++) {
							this.aClass308Array2[local188].aFloatArray103[local202] = 0.0F;
						}
					} else {
						local202 = local59 >> 1;
						local297 = local59 >> 2;
						local209 = local59 >> 3;
						@Pc(699) Class308 local699 = this.aClass308Array2[local188];
						for (local349 = 0; local349 < local202; local349++) {
							local699.aFloatArray103[local349] *= 0.5F;
						}
						for (local349 = local202; local349 < local59; local349++) {
							local699.aFloatArray103[local349] = -local699.aFloatArray103[local59 - local349 - 1];
						}
						@Pc(742) Class308 local742 = local51 ? this.aClass308_5 : this.aClass308_2;
						@Pc(750) Class308 local750 = local51 ? this.aClass308_6 : this.aClass308_3;
						@Pc(758) Class308 local758 = local51 ? this.aClass308_1 : this.aClass308_4;
						@Pc(766) int[] local766 = local51 ? this.anIntArray386 : this.anIntArray385;
						@Pc(768) int local768;
						@Pc(789) float local789;
						@Pc(809) float local809;
						@Pc(816) float local816;
						@Pc(825) float local825;
						for (local768 = 0; local768 < local297; local768++) {
							local789 = local699.aFloatArray103[local768 * 4] - local699.aFloatArray103[local59 - local768 * 4 - 1];
							local809 = local699.aFloatArray103[local768 * 4 + 2] - local699.aFloatArray103[local59 - local768 * 4 - 3];
							local816 = local742.aFloatArray103[local768 * 2];
							local825 = local742.aFloatArray103[local768 * 2 + 1];
							local699.aFloatArray103[local59 - local768 * 4 - 1] = local789 * local816 - local809 * local825;
							local699.aFloatArray103[local59 - local768 * 4 - 3] = local789 * local825 + local809 * local816;
						}
						@Pc(943) float local943;
						@Pc(954) float local954;
						for (local768 = 0; local768 < local209; local768++) {
							local789 = local699.aFloatArray103[local202 + 3 + local768 * 4];
							local809 = local699.aFloatArray103[local202 + 1 + local768 * 4];
							local816 = local699.aFloatArray103[local768 * 4 + 3];
							local825 = local699.aFloatArray103[local768 * 4 + 1];
							local699.aFloatArray103[local202 + 3 + local768 * 4] = local789 + local816;
							local699.aFloatArray103[local202 + 1 + local768 * 4] = local809 + local825;
							local943 = local742.aFloatArray103[local202 - 4 - local768 * 4];
							local954 = local742.aFloatArray103[local202 - 3 - local768 * 4];
							local699.aFloatArray103[local768 * 4 + 3] = (local789 - local816) * local943 - (local809 - local825) * local954;
							local699.aFloatArray103[local768 * 4 + 1] = (local809 - local825) * local943 + (local789 - local816) * local954;
						}
						local768 = Class548.method31010(local59 - 1, 395872928);
						@Pc(1002) int local1002;
						@Pc(1013) int local1013;
						@Pc(1017) int local1017;
						@Pc(1019) int local1019;
						for (local1002 = 0; local1002 < local768 - 3; local1002++) {
							local1013 = local59 >> local1002 + 2;
							local1017 = 0x8 << local1002;
							for (local1019 = 0; local1019 < 0x2 << local1002; local1019++) {
								@Pc(1032) int local1032 = local59 - local1013 * 2 * local1019;
								@Pc(1042) int local1042 = local59 - local1013 * (local1019 * 2 + 1);
								for (@Pc(1044) int local1044 = 0; local1044 < local59 >> local1002 + 4; local1044++) {
									@Pc(1055) int local1055 = local1044 * 4;
									@Pc(1064) float local1064 = local699.aFloatArray103[local1032 - 1 - local1055];
									@Pc(1073) float local1073 = local699.aFloatArray103[local1032 - 3 - local1055];
									@Pc(1082) float local1082 = local699.aFloatArray103[local1042 - 1 - local1055];
									@Pc(1091) float local1091 = local699.aFloatArray103[local1042 - 3 - local1055];
									local699.aFloatArray103[local1032 - 1 - local1055] = local1064 + local1082;
									local699.aFloatArray103[local1032 - 3 - local1055] = local1073 + local1091;
									@Pc(1120) float local1120 = local742.aFloatArray103[local1044 * local1017];
									@Pc(1129) float local1129 = local742.aFloatArray103[local1044 * local1017 + 1];
									local699.aFloatArray103[local1042 - 1 - local1055] = (local1064 - local1082) * local1120 - (local1073 - local1091) * local1129;
									local699.aFloatArray103[local1042 - 3 - local1055] = (local1073 - local1091) * local1120 + (local1064 - local1082) * local1129;
								}
							}
						}
						for (local1002 = 1; local1002 < local209 - 1; local1002++) {
							local1013 = local766[local1002];
							if (local1002 < local1013) {
								local1017 = local1002 * 8;
								local1019 = local1013 * 8;
								local943 = local699.aFloatArray103[local1017 + 1];
								local699.aFloatArray103[local1017 + 1] = local699.aFloatArray103[local1019 + 1];
								local699.aFloatArray103[local1019 + 1] = local943;
								local943 = local699.aFloatArray103[local1017 + 3];
								local699.aFloatArray103[local1017 + 3] = local699.aFloatArray103[local1019 + 3];
								local699.aFloatArray103[local1019 + 3] = local943;
								local943 = local699.aFloatArray103[local1017 + 5];
								local699.aFloatArray103[local1017 + 5] = local699.aFloatArray103[local1019 + 5];
								local699.aFloatArray103[local1019 + 5] = local943;
								local943 = local699.aFloatArray103[local1017 + 7];
								local699.aFloatArray103[local1017 + 7] = local699.aFloatArray103[local1019 + 7];
								local699.aFloatArray103[local1019 + 7] = local943;
							}
						}
						for (local1002 = 0; local1002 < local202; local1002++) {
							local699.aFloatArray103[local1002] = local699.aFloatArray103[local1002 * 2 + 1];
						}
						for (local1002 = 0; local1002 < local209; local1002++) {
							local699.aFloatArray103[local59 - 1 - local1002 * 2] = local699.aFloatArray103[local1002 * 4];
							local699.aFloatArray103[local59 - 2 - local1002 * 2] = local699.aFloatArray103[local1002 * 4 + 1];
							local699.aFloatArray103[local59 - local297 - 1 - local1002 * 2] = local699.aFloatArray103[local1002 * 4 + 2];
							local699.aFloatArray103[local59 - local297 - 2 - local1002 * 2] = local699.aFloatArray103[local1002 * 4 + 3];
						}
						for (local1002 = 0; local1002 < local209; local1002++) {
							local809 = local758.aFloatArray103[local1002 * 2];
							local816 = local758.aFloatArray103[local1002 * 2 + 1];
							local825 = local699.aFloatArray103[local202 + local1002 * 2];
							local943 = local699.aFloatArray103[local202 + local1002 * 2 + 1];
							local954 = local699.aFloatArray103[local59 - 2 - local1002 * 2];
							@Pc(1464) float local1464 = local699.aFloatArray103[local59 - 1 - local1002 * 2];
							@Pc(1476) float local1476 = local816 * (local825 - local954) + local809 * (local943 + local1464);
							local699.aFloatArray103[local202 + local1002 * 2] = (local825 + local954 + local1476) * 0.5F;
							local699.aFloatArray103[local59 - 2 - local1002 * 2] = (local825 + local954 - local1476) * 0.5F;
							@Pc(1520) float local1520 = local816 * (local943 + local1464) - local809 * (local825 - local954);
							local699.aFloatArray103[local202 + local1002 * 2 + 1] = (local943 - local1464 + local1520) * 0.5F;
							local699.aFloatArray103[local59 - 1 - local1002 * 2] = (-local943 + local1464 + local1520) * 0.5F;
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray103[local1002] = local699.aFloatArray103[local1002 * 2 + local202] * local750.aFloatArray103[local1002 * 2] + local699.aFloatArray103[local1002 * 2 + 1 + local202] * local750.aFloatArray103[local1002 * 2 + 1];
							local699.aFloatArray103[local202 - 1 - local1002] = local699.aFloatArray103[local1002 * 2 + local202] * local750.aFloatArray103[local1002 * 2 + 1] - local699.aFloatArray103[local1002 * 2 + 1 + local202] * local750.aFloatArray103[local1002 * 2];
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray103[local59 - local297 + local1002] = -local699.aFloatArray103[local1002];
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray103[local1002] = local699.aFloatArray103[local297 + local1002];
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray103[local297 + local1002] = -local699.aFloatArray103[local297 - local1002 - 1];
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray103[local202 + local1002] = local699.aFloatArray103[local59 - local1002 - 1];
						}
						for (local1002 = local96; local1002 < local105; local1002++) {
							local809 = (float) Math.sin(((double) (local1002 - local96) + 0.5D) / (double) local110 * 0.5D * 3.141592653589793D);
							this.aClass308Array2[local188].aFloatArray103[local1002] *= (float) Math.sin((double) local809 * 1.5707963267948966D * (double) local809);
						}
						for (local1002 = local134; local1002 < local145; local1002++) {
							local809 = (float) Math.sin(((double) (local1002 - local134) + 0.5D) / (double) local150 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
							this.aClass308Array2[local188].aFloatArray103[local1002] *= (float) Math.sin((double) local809 * 1.5707963267948966D * (double) local809);
						}
					}
				}
				@Pc(1816) Class308[] local1816 = null;
				if (this.anInt4068 > 0) {
					local202 = this.anInt4068 + local59 >> 2;
					local1816 = this.method27071(this.anInt4064, local202);
					for (local297 = 0; local297 < this.anInt4064; local297++) {
						if (!this.aBooleanArray27[local297]) {
							for (local209 = 0; local209 < this.anInt4072; local209++) {
								local455 = (this.anInt4068 >> 1) + local209;
								local1816[local297].aFloatArray103[local209] += this.aClass308Array1[local297].aFloatArray103[local455];
							}
						}
						if (!this.aBooleanArray28[local297]) {
							for (local209 = local96; local209 < local59 >> 1; local209++) {
								local455 = local1816[local297].anInt3947 - (local59 >> 1) + local209;
								local1816[local297].aFloatArray103[local455] += this.aClass308Array2[local297].aFloatArray103[local209];
							}
						}
					}
				}
				@Pc(1920) Class308[] local1920 = this.aClass308Array1;
				this.aClass308Array1 = this.aClass308Array2;
				this.aClass308Array2 = local1920;
				this.anInt4068 = local59;
				this.anInt4072 = local145 - (local59 >> 1);
				this.aBooleanArray27 = this.aBooleanArray28;
				arg3.set(local1816);
				return true;
			} else {
				throw new RuntimeException();
			}
		}
	}

	@OriginalMember(owner = "client!hk", name = "aq", descriptor = "([BIILjava/util/concurrent/atomic/AtomicReference;)Z", line = 654)
	boolean method27131(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) AtomicReference arg3) {
		if (arg0 == null) {
			throw new RuntimeException("");
		} else if (arg1 + arg2 > arg0.length) {
			return false;
		} else {
			this.method27110(arg0, arg1);
			@Pc(21) int local21 = this.method27112();
			if (local21 != 0) {
				this.method27120(arg0, arg1);
				return false;
			} else if (this.method27011()) {
				@Pc(46) int local46 = this.method27116(this.method27125(this.anIntArray384.length - 1));
				@Pc(51) boolean local51 = this.aBooleanArray25[local46];
				@Pc(59) int local59 = local51 ? this.anInt4067 : this.anInt4071;
				@Pc(61) boolean local61 = false;
				@Pc(63) boolean local63 = false;
				if (local51) {
					local61 = this.method27112() != 0;
					local63 = this.method27112() != 0;
				}
				@Pc(83) int local83 = local59 >> 1;
				@Pc(96) int local96;
				@Pc(105) int local105;
				@Pc(110) int local110;
				if (local51 && !local61) {
					local96 = (local59 >> 2) - (this.anInt4071 >> 2);
					local105 = (local59 >> 2) + (this.anInt4071 >> 2);
					local110 = this.anInt4071 >> 1;
				} else {
					local96 = 0;
					local105 = local83;
					local110 = local59 >> 1;
				}
				@Pc(134) int local134;
				@Pc(145) int local145;
				@Pc(150) int local150;
				if (local51 && !local63) {
					local134 = local59 - (local59 >> 2) - (this.anInt4071 >> 2);
					local145 = local59 - (local59 >> 2) + (this.anInt4071 >> 2);
					local150 = this.anInt4071 >> 1;
				} else {
					local134 = local83;
					local145 = local59;
					local150 = local59 >> 1;
				}
				@Pc(167) Class316 local167 = this.aClass316Array1[this.anIntArray384[local46]];
				if (this.aBooleanArray28 == null || this.aBooleanArray28.length != this.anInt4064) {
					this.aBooleanArray28 = new boolean[this.anInt4064];
					this.aBooleanArray24 = new boolean[this.anInt4064];
				}
				@Pc(188) int local188;
				@Pc(202) int local202;
				@Pc(209) int local209;
				for (local188 = 0; local188 < this.anInt4064; local188++) {
					local202 = local167.anIntArray387 == null ? 0 : local167.anIntArray387[local188];
					local209 = local167.anIntArray390[local202];
					this.aBooleanArray28[local188] = !this.aClass317Array1[local209].method27198(local188);
					this.aBooleanArray24[local188] = this.aBooleanArray28[local188];
				}
				for (local188 = 0; local188 < local167.anInt4093; local188++) {
					if (!this.aBooleanArray28[local167.anIntArray388[local188]] || !this.aBooleanArray28[local167.anIntArray391[local188]]) {
						this.aBooleanArray28[local167.anIntArray388[local188]] = false;
						this.aBooleanArray28[local167.anIntArray391[local188]] = false;
					}
				}
				if (this.aBooleanArray26 == null || this.aBooleanArray26.length != this.anInt4064) {
					this.aBooleanArray26 = new boolean[this.anInt4064];
				}
				@Pc(297) int local297;
				@Pc(349) int local349;
				@Pc(455) int local455;
				for (local188 = 0; local188 < local167.anInt4092; local188++) {
					local202 = 0;
					for (local297 = 0; local297 < this.anInt4064; local297++) {
						local209 = local167.anIntArray387 == null ? local188 : local167.anIntArray387[local297];
						if (local209 == local188) {
							this.aBooleanArray26[local202++] = this.aBooleanArray28[local297];
						}
					}
					@Pc(333) Class289 local333 = this.aClass289Array1[local167.anIntArray389[local188]];
					@Pc(335) Class308[] local335 = null;
					if (local333.anInt3909 == 2) {
						@Pc(347) Class308[] local347 = this.method27071(1, this.anInt4064 * local59);
						local349 = 0;
						while (true) {
							@Pc(354) int local354;
							if (local349 >= local59) {
								local347 = local333.method26555(local347, local59 >> 1, this.aBooleanArray26);
								local335 = this.aClass308Array2;
								for (local349 = 0; local349 < local59; local349++) {
									for (local354 = 0; local354 < this.anInt4064; local354++) {
										try {
											local335[local354].aFloatArray103[local349] = local347[0].aFloatArray103[this.anInt4064 * local349 + local354];
										} catch (@Pc(426) ArrayIndexOutOfBoundsException local426) {
											local426.printStackTrace();
										}
									}
								}
								this.method27081(local347);
								local347 = null;
								break;
							}
							for (local354 = 0; local354 < this.anInt4064; local354++) {
								try {
									local347[0].aFloatArray103[local349 * this.anInt4064 + local354] = this.aClass308Array2[local354].aFloatArray103[local349];
								} catch (@Pc(378) ArrayIndexOutOfBoundsException local378) {
									local378.printStackTrace();
								}
							}
							local349++;
						}
					} else {
						local335 = local333.method26555(this.aClass308Array2, local59 >> 1, this.aBooleanArray26);
					}
					if (local167.anIntArray387 == null) {
						if (this.aClass308Array2 != local335) {
							this.method27081(this.aClass308Array2);
						}
						this.aClass308Array2 = local335;
					} else {
						local202 = 0;
						for (local455 = 0; local455 < this.anInt4064; local455++) {
							local349 = local167.anIntArray387[local455];
							if (local349 == local188) {
								this.aClass308Array2[local455] = local335[local202++];
							}
						}
					}
				}
				for (local188 = local167.anInt4093 - 1; local188 >= 0; local188--) {
					@Pc(506) Class308 local506 = this.aClass308Array2[local167.anIntArray388[local188]];
					@Pc(514) Class308 local514 = this.aClass308Array2[local167.anIntArray391[local188]];
					for (local209 = 0; local209 < local506.anInt3947; local209++) {
						@Pc(525) float local525 = local506.aFloatArray103[local209];
						@Pc(530) float local530 = local514.aFloatArray103[local209];
						@Pc(548) float local548;
						@Pc(544) float local544;
						if (local525 > 0.0F) {
							if (local530 > 0.0F) {
								local544 = local525;
								local548 = local525 - local530;
							} else {
								local548 = local525;
								local544 = local525 + local530;
							}
						} else if (local530 > 0.0F) {
							local544 = local525;
							local548 = local525 + local530;
						} else {
							local548 = local525;
							local544 = local525 - local530;
						}
						local506.aFloatArray103[local209] = local544;
						local514.aFloatArray103[local209] = local548;
					}
				}
				for (local188 = 0; local188 < this.aBooleanArray28.length; local188++) {
					this.aBooleanArray28[local188] = this.aBooleanArray24[local188];
				}
				for (local188 = 0; local188 < this.anInt4064; local188++) {
					if (!this.aBooleanArray28[local188]) {
						local202 = local167.anIntArray387 == null ? 0 : local167.anIntArray387[local188];
						local209 = local167.anIntArray390[local202];
						this.aClass317Array1[local209].method27201(local188);
						this.aClass317Array1[local209].method27205(this.aClass308Array2[local188], local59 >> 1, local188);
					}
				}
				for (local188 = 0; local188 < this.anInt4064; local188++) {
					if (this.aBooleanArray28[local188]) {
						for (local202 = local59 >> 1; local202 < local59; local202++) {
							this.aClass308Array2[local188].aFloatArray103[local202] = 0.0F;
						}
					} else {
						local202 = local59 >> 1;
						local297 = local59 >> 2;
						local209 = local59 >> 3;
						@Pc(699) Class308 local699 = this.aClass308Array2[local188];
						for (local349 = 0; local349 < local202; local349++) {
							local699.aFloatArray103[local349] *= 0.5F;
						}
						for (local349 = local202; local349 < local59; local349++) {
							local699.aFloatArray103[local349] = -local699.aFloatArray103[local59 - local349 - 1];
						}
						@Pc(742) Class308 local742 = local51 ? this.aClass308_5 : this.aClass308_2;
						@Pc(750) Class308 local750 = local51 ? this.aClass308_6 : this.aClass308_3;
						@Pc(758) Class308 local758 = local51 ? this.aClass308_1 : this.aClass308_4;
						@Pc(766) int[] local766 = local51 ? this.anIntArray386 : this.anIntArray385;
						@Pc(768) int local768;
						@Pc(789) float local789;
						@Pc(809) float local809;
						@Pc(816) float local816;
						@Pc(825) float local825;
						for (local768 = 0; local768 < local297; local768++) {
							local789 = local699.aFloatArray103[local768 * 4] - local699.aFloatArray103[local59 - local768 * 4 - 1];
							local809 = local699.aFloatArray103[local768 * 4 + 2] - local699.aFloatArray103[local59 - local768 * 4 - 3];
							local816 = local742.aFloatArray103[local768 * 2];
							local825 = local742.aFloatArray103[local768 * 2 + 1];
							local699.aFloatArray103[local59 - local768 * 4 - 1] = local789 * local816 - local809 * local825;
							local699.aFloatArray103[local59 - local768 * 4 - 3] = local789 * local825 + local809 * local816;
						}
						@Pc(943) float local943;
						@Pc(954) float local954;
						for (local768 = 0; local768 < local209; local768++) {
							local789 = local699.aFloatArray103[local202 + 3 + local768 * 4];
							local809 = local699.aFloatArray103[local202 + 1 + local768 * 4];
							local816 = local699.aFloatArray103[local768 * 4 + 3];
							local825 = local699.aFloatArray103[local768 * 4 + 1];
							local699.aFloatArray103[local202 + 3 + local768 * 4] = local789 + local816;
							local699.aFloatArray103[local202 + 1 + local768 * 4] = local809 + local825;
							local943 = local742.aFloatArray103[local202 - 4 - local768 * 4];
							local954 = local742.aFloatArray103[local202 - 3 - local768 * 4];
							local699.aFloatArray103[local768 * 4 + 3] = (local789 - local816) * local943 - (local809 - local825) * local954;
							local699.aFloatArray103[local768 * 4 + 1] = (local809 - local825) * local943 + (local789 - local816) * local954;
						}
						local768 = Class548.method31010(local59 - 1, -1748959743);
						@Pc(1002) int local1002;
						@Pc(1013) int local1013;
						@Pc(1017) int local1017;
						@Pc(1019) int local1019;
						for (local1002 = 0; local1002 < local768 - 3; local1002++) {
							local1013 = local59 >> local1002 + 2;
							local1017 = 0x8 << local1002;
							for (local1019 = 0; local1019 < 0x2 << local1002; local1019++) {
								@Pc(1032) int local1032 = local59 - local1013 * 2 * local1019;
								@Pc(1042) int local1042 = local59 - local1013 * (local1019 * 2 + 1);
								for (@Pc(1044) int local1044 = 0; local1044 < local59 >> local1002 + 4; local1044++) {
									@Pc(1055) int local1055 = local1044 * 4;
									@Pc(1064) float local1064 = local699.aFloatArray103[local1032 - 1 - local1055];
									@Pc(1073) float local1073 = local699.aFloatArray103[local1032 - 3 - local1055];
									@Pc(1082) float local1082 = local699.aFloatArray103[local1042 - 1 - local1055];
									@Pc(1091) float local1091 = local699.aFloatArray103[local1042 - 3 - local1055];
									local699.aFloatArray103[local1032 - 1 - local1055] = local1064 + local1082;
									local699.aFloatArray103[local1032 - 3 - local1055] = local1073 + local1091;
									@Pc(1120) float local1120 = local742.aFloatArray103[local1044 * local1017];
									@Pc(1129) float local1129 = local742.aFloatArray103[local1044 * local1017 + 1];
									local699.aFloatArray103[local1042 - 1 - local1055] = (local1064 - local1082) * local1120 - (local1073 - local1091) * local1129;
									local699.aFloatArray103[local1042 - 3 - local1055] = (local1073 - local1091) * local1120 + (local1064 - local1082) * local1129;
								}
							}
						}
						for (local1002 = 1; local1002 < local209 - 1; local1002++) {
							local1013 = local766[local1002];
							if (local1002 < local1013) {
								local1017 = local1002 * 8;
								local1019 = local1013 * 8;
								local943 = local699.aFloatArray103[local1017 + 1];
								local699.aFloatArray103[local1017 + 1] = local699.aFloatArray103[local1019 + 1];
								local699.aFloatArray103[local1019 + 1] = local943;
								local943 = local699.aFloatArray103[local1017 + 3];
								local699.aFloatArray103[local1017 + 3] = local699.aFloatArray103[local1019 + 3];
								local699.aFloatArray103[local1019 + 3] = local943;
								local943 = local699.aFloatArray103[local1017 + 5];
								local699.aFloatArray103[local1017 + 5] = local699.aFloatArray103[local1019 + 5];
								local699.aFloatArray103[local1019 + 5] = local943;
								local943 = local699.aFloatArray103[local1017 + 7];
								local699.aFloatArray103[local1017 + 7] = local699.aFloatArray103[local1019 + 7];
								local699.aFloatArray103[local1019 + 7] = local943;
							}
						}
						for (local1002 = 0; local1002 < local202; local1002++) {
							local699.aFloatArray103[local1002] = local699.aFloatArray103[local1002 * 2 + 1];
						}
						for (local1002 = 0; local1002 < local209; local1002++) {
							local699.aFloatArray103[local59 - 1 - local1002 * 2] = local699.aFloatArray103[local1002 * 4];
							local699.aFloatArray103[local59 - 2 - local1002 * 2] = local699.aFloatArray103[local1002 * 4 + 1];
							local699.aFloatArray103[local59 - local297 - 1 - local1002 * 2] = local699.aFloatArray103[local1002 * 4 + 2];
							local699.aFloatArray103[local59 - local297 - 2 - local1002 * 2] = local699.aFloatArray103[local1002 * 4 + 3];
						}
						for (local1002 = 0; local1002 < local209; local1002++) {
							local809 = local758.aFloatArray103[local1002 * 2];
							local816 = local758.aFloatArray103[local1002 * 2 + 1];
							local825 = local699.aFloatArray103[local202 + local1002 * 2];
							local943 = local699.aFloatArray103[local202 + local1002 * 2 + 1];
							local954 = local699.aFloatArray103[local59 - 2 - local1002 * 2];
							@Pc(1464) float local1464 = local699.aFloatArray103[local59 - 1 - local1002 * 2];
							@Pc(1476) float local1476 = local816 * (local825 - local954) + local809 * (local943 + local1464);
							local699.aFloatArray103[local202 + local1002 * 2] = (local825 + local954 + local1476) * 0.5F;
							local699.aFloatArray103[local59 - 2 - local1002 * 2] = (local825 + local954 - local1476) * 0.5F;
							@Pc(1520) float local1520 = local816 * (local943 + local1464) - local809 * (local825 - local954);
							local699.aFloatArray103[local202 + local1002 * 2 + 1] = (local943 - local1464 + local1520) * 0.5F;
							local699.aFloatArray103[local59 - 1 - local1002 * 2] = (-local943 + local1464 + local1520) * 0.5F;
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray103[local1002] = local699.aFloatArray103[local1002 * 2 + local202] * local750.aFloatArray103[local1002 * 2] + local699.aFloatArray103[local1002 * 2 + 1 + local202] * local750.aFloatArray103[local1002 * 2 + 1];
							local699.aFloatArray103[local202 - 1 - local1002] = local699.aFloatArray103[local1002 * 2 + local202] * local750.aFloatArray103[local1002 * 2 + 1] - local699.aFloatArray103[local1002 * 2 + 1 + local202] * local750.aFloatArray103[local1002 * 2];
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray103[local59 - local297 + local1002] = -local699.aFloatArray103[local1002];
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray103[local1002] = local699.aFloatArray103[local297 + local1002];
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray103[local297 + local1002] = -local699.aFloatArray103[local297 - local1002 - 1];
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray103[local202 + local1002] = local699.aFloatArray103[local59 - local1002 - 1];
						}
						for (local1002 = local96; local1002 < local105; local1002++) {
							local809 = (float) Math.sin(((double) (local1002 - local96) + 0.5D) / (double) local110 * 0.5D * 3.141592653589793D);
							this.aClass308Array2[local188].aFloatArray103[local1002] *= (float) Math.sin((double) local809 * 1.5707963267948966D * (double) local809);
						}
						for (local1002 = local134; local1002 < local145; local1002++) {
							local809 = (float) Math.sin(((double) (local1002 - local134) + 0.5D) / (double) local150 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
							this.aClass308Array2[local188].aFloatArray103[local1002] *= (float) Math.sin((double) local809 * 1.5707963267948966D * (double) local809);
						}
					}
				}
				@Pc(1816) Class308[] local1816 = null;
				if (this.anInt4068 > 0) {
					local202 = this.anInt4068 + local59 >> 2;
					local1816 = this.method27071(this.anInt4064, local202);
					for (local297 = 0; local297 < this.anInt4064; local297++) {
						if (!this.aBooleanArray27[local297]) {
							for (local209 = 0; local209 < this.anInt4072; local209++) {
								local455 = (this.anInt4068 >> 1) + local209;
								local1816[local297].aFloatArray103[local209] += this.aClass308Array1[local297].aFloatArray103[local455];
							}
						}
						if (!this.aBooleanArray28[local297]) {
							for (local209 = local96; local209 < local59 >> 1; local209++) {
								local455 = local1816[local297].anInt3947 - (local59 >> 1) + local209;
								local1816[local297].aFloatArray103[local455] += this.aClass308Array2[local297].aFloatArray103[local209];
							}
						}
					}
				}
				@Pc(1920) Class308[] local1920 = this.aClass308Array1;
				this.aClass308Array1 = this.aClass308Array2;
				this.aClass308Array2 = local1920;
				this.anInt4068 = local59;
				this.anInt4072 = local145 - (local59 >> 1);
				this.aBooleanArray27 = this.aBooleanArray28;
				arg3.set(local1816);
				return true;
			} else {
				throw new RuntimeException();
			}
		}
	}

	@OriginalMember(owner = "client!hk", name = "ej", descriptor = "([BIILjava/util/concurrent/atomic/AtomicReference;)Z", line = 654)
	boolean method27132(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) AtomicReference arg3) {
		if (arg0 == null) {
			throw new RuntimeException("");
		} else if (arg1 + arg2 > arg0.length) {
			return false;
		} else {
			this.method27110(arg0, arg1);
			@Pc(21) int local21 = this.method27112();
			if (local21 != 0) {
				this.method27120(arg0, arg1);
				return false;
			} else if (this.method27011()) {
				@Pc(46) int local46 = this.method27116(this.method27125(this.anIntArray384.length - 1));
				@Pc(51) boolean local51 = this.aBooleanArray25[local46];
				@Pc(59) int local59 = local51 ? this.anInt4067 : this.anInt4071;
				@Pc(61) boolean local61 = false;
				@Pc(63) boolean local63 = false;
				if (local51) {
					local61 = this.method27112() != 0;
					local63 = this.method27112() != 0;
				}
				@Pc(83) int local83 = local59 >> 1;
				@Pc(96) int local96;
				@Pc(105) int local105;
				@Pc(110) int local110;
				if (local51 && !local61) {
					local96 = (local59 >> 2) - (this.anInt4071 >> 2);
					local105 = (local59 >> 2) + (this.anInt4071 >> 2);
					local110 = this.anInt4071 >> 1;
				} else {
					local96 = 0;
					local105 = local83;
					local110 = local59 >> 1;
				}
				@Pc(134) int local134;
				@Pc(145) int local145;
				@Pc(150) int local150;
				if (local51 && !local63) {
					local134 = local59 - (local59 >> 2) - (this.anInt4071 >> 2);
					local145 = local59 - (local59 >> 2) + (this.anInt4071 >> 2);
					local150 = this.anInt4071 >> 1;
				} else {
					local134 = local83;
					local145 = local59;
					local150 = local59 >> 1;
				}
				@Pc(167) Class316 local167 = this.aClass316Array1[this.anIntArray384[local46]];
				if (this.aBooleanArray28 == null || this.aBooleanArray28.length != this.anInt4064) {
					this.aBooleanArray28 = new boolean[this.anInt4064];
					this.aBooleanArray24 = new boolean[this.anInt4064];
				}
				@Pc(188) int local188;
				@Pc(202) int local202;
				@Pc(209) int local209;
				for (local188 = 0; local188 < this.anInt4064; local188++) {
					local202 = local167.anIntArray387 == null ? 0 : local167.anIntArray387[local188];
					local209 = local167.anIntArray390[local202];
					this.aBooleanArray28[local188] = !this.aClass317Array1[local209].method27198(local188);
					this.aBooleanArray24[local188] = this.aBooleanArray28[local188];
				}
				for (local188 = 0; local188 < local167.anInt4093; local188++) {
					if (!this.aBooleanArray28[local167.anIntArray388[local188]] || !this.aBooleanArray28[local167.anIntArray391[local188]]) {
						this.aBooleanArray28[local167.anIntArray388[local188]] = false;
						this.aBooleanArray28[local167.anIntArray391[local188]] = false;
					}
				}
				if (this.aBooleanArray26 == null || this.aBooleanArray26.length != this.anInt4064) {
					this.aBooleanArray26 = new boolean[this.anInt4064];
				}
				@Pc(297) int local297;
				@Pc(349) int local349;
				@Pc(455) int local455;
				for (local188 = 0; local188 < local167.anInt4092; local188++) {
					local202 = 0;
					for (local297 = 0; local297 < this.anInt4064; local297++) {
						local209 = local167.anIntArray387 == null ? local188 : local167.anIntArray387[local297];
						if (local209 == local188) {
							this.aBooleanArray26[local202++] = this.aBooleanArray28[local297];
						}
					}
					@Pc(333) Class289 local333 = this.aClass289Array1[local167.anIntArray389[local188]];
					@Pc(335) Class308[] local335 = null;
					if (local333.anInt3909 == 2) {
						@Pc(347) Class308[] local347 = this.method27071(1, this.anInt4064 * local59);
						local349 = 0;
						while (true) {
							@Pc(354) int local354;
							if (local349 >= local59) {
								local347 = local333.method26555(local347, local59 >> 1, this.aBooleanArray26);
								local335 = this.aClass308Array2;
								for (local349 = 0; local349 < local59; local349++) {
									for (local354 = 0; local354 < this.anInt4064; local354++) {
										try {
											local335[local354].aFloatArray103[local349] = local347[0].aFloatArray103[this.anInt4064 * local349 + local354];
										} catch (@Pc(426) ArrayIndexOutOfBoundsException local426) {
											local426.printStackTrace();
										}
									}
								}
								this.method27081(local347);
								local347 = null;
								break;
							}
							for (local354 = 0; local354 < this.anInt4064; local354++) {
								try {
									local347[0].aFloatArray103[local349 * this.anInt4064 + local354] = this.aClass308Array2[local354].aFloatArray103[local349];
								} catch (@Pc(378) ArrayIndexOutOfBoundsException local378) {
									local378.printStackTrace();
								}
							}
							local349++;
						}
					} else {
						local335 = local333.method26555(this.aClass308Array2, local59 >> 1, this.aBooleanArray26);
					}
					if (local167.anIntArray387 == null) {
						if (this.aClass308Array2 != local335) {
							this.method27081(this.aClass308Array2);
						}
						this.aClass308Array2 = local335;
					} else {
						local202 = 0;
						for (local455 = 0; local455 < this.anInt4064; local455++) {
							local349 = local167.anIntArray387[local455];
							if (local349 == local188) {
								this.aClass308Array2[local455] = local335[local202++];
							}
						}
					}
				}
				for (local188 = local167.anInt4093 - 1; local188 >= 0; local188--) {
					@Pc(506) Class308 local506 = this.aClass308Array2[local167.anIntArray388[local188]];
					@Pc(514) Class308 local514 = this.aClass308Array2[local167.anIntArray391[local188]];
					for (local209 = 0; local209 < local506.anInt3947; local209++) {
						@Pc(525) float local525 = local506.aFloatArray103[local209];
						@Pc(530) float local530 = local514.aFloatArray103[local209];
						@Pc(548) float local548;
						@Pc(544) float local544;
						if (local525 > 0.0F) {
							if (local530 > 0.0F) {
								local544 = local525;
								local548 = local525 - local530;
							} else {
								local548 = local525;
								local544 = local525 + local530;
							}
						} else if (local530 > 0.0F) {
							local544 = local525;
							local548 = local525 + local530;
						} else {
							local548 = local525;
							local544 = local525 - local530;
						}
						local506.aFloatArray103[local209] = local544;
						local514.aFloatArray103[local209] = local548;
					}
				}
				for (local188 = 0; local188 < this.aBooleanArray28.length; local188++) {
					this.aBooleanArray28[local188] = this.aBooleanArray24[local188];
				}
				for (local188 = 0; local188 < this.anInt4064; local188++) {
					if (!this.aBooleanArray28[local188]) {
						local202 = local167.anIntArray387 == null ? 0 : local167.anIntArray387[local188];
						local209 = local167.anIntArray390[local202];
						this.aClass317Array1[local209].method27201(local188);
						this.aClass317Array1[local209].method27205(this.aClass308Array2[local188], local59 >> 1, local188);
					}
				}
				for (local188 = 0; local188 < this.anInt4064; local188++) {
					if (this.aBooleanArray28[local188]) {
						for (local202 = local59 >> 1; local202 < local59; local202++) {
							this.aClass308Array2[local188].aFloatArray103[local202] = 0.0F;
						}
					} else {
						local202 = local59 >> 1;
						local297 = local59 >> 2;
						local209 = local59 >> 3;
						@Pc(699) Class308 local699 = this.aClass308Array2[local188];
						for (local349 = 0; local349 < local202; local349++) {
							local699.aFloatArray103[local349] *= 0.5F;
						}
						for (local349 = local202; local349 < local59; local349++) {
							local699.aFloatArray103[local349] = -local699.aFloatArray103[local59 - local349 - 1];
						}
						@Pc(742) Class308 local742 = local51 ? this.aClass308_5 : this.aClass308_2;
						@Pc(750) Class308 local750 = local51 ? this.aClass308_6 : this.aClass308_3;
						@Pc(758) Class308 local758 = local51 ? this.aClass308_1 : this.aClass308_4;
						@Pc(766) int[] local766 = local51 ? this.anIntArray386 : this.anIntArray385;
						@Pc(768) int local768;
						@Pc(789) float local789;
						@Pc(809) float local809;
						@Pc(816) float local816;
						@Pc(825) float local825;
						for (local768 = 0; local768 < local297; local768++) {
							local789 = local699.aFloatArray103[local768 * 4] - local699.aFloatArray103[local59 - local768 * 4 - 1];
							local809 = local699.aFloatArray103[local768 * 4 + 2] - local699.aFloatArray103[local59 - local768 * 4 - 3];
							local816 = local742.aFloatArray103[local768 * 2];
							local825 = local742.aFloatArray103[local768 * 2 + 1];
							local699.aFloatArray103[local59 - local768 * 4 - 1] = local789 * local816 - local809 * local825;
							local699.aFloatArray103[local59 - local768 * 4 - 3] = local789 * local825 + local809 * local816;
						}
						@Pc(943) float local943;
						@Pc(954) float local954;
						for (local768 = 0; local768 < local209; local768++) {
							local789 = local699.aFloatArray103[local202 + 3 + local768 * 4];
							local809 = local699.aFloatArray103[local202 + 1 + local768 * 4];
							local816 = local699.aFloatArray103[local768 * 4 + 3];
							local825 = local699.aFloatArray103[local768 * 4 + 1];
							local699.aFloatArray103[local202 + 3 + local768 * 4] = local789 + local816;
							local699.aFloatArray103[local202 + 1 + local768 * 4] = local809 + local825;
							local943 = local742.aFloatArray103[local202 - 4 - local768 * 4];
							local954 = local742.aFloatArray103[local202 - 3 - local768 * 4];
							local699.aFloatArray103[local768 * 4 + 3] = (local789 - local816) * local943 - (local809 - local825) * local954;
							local699.aFloatArray103[local768 * 4 + 1] = (local809 - local825) * local943 + (local789 - local816) * local954;
						}
						local768 = Class548.method31010(local59 - 1, -444506734);
						@Pc(1002) int local1002;
						@Pc(1013) int local1013;
						@Pc(1017) int local1017;
						@Pc(1019) int local1019;
						for (local1002 = 0; local1002 < local768 - 3; local1002++) {
							local1013 = local59 >> local1002 + 2;
							local1017 = 0x8 << local1002;
							for (local1019 = 0; local1019 < 0x2 << local1002; local1019++) {
								@Pc(1032) int local1032 = local59 - local1013 * 2 * local1019;
								@Pc(1042) int local1042 = local59 - local1013 * (local1019 * 2 + 1);
								for (@Pc(1044) int local1044 = 0; local1044 < local59 >> local1002 + 4; local1044++) {
									@Pc(1055) int local1055 = local1044 * 4;
									@Pc(1064) float local1064 = local699.aFloatArray103[local1032 - 1 - local1055];
									@Pc(1073) float local1073 = local699.aFloatArray103[local1032 - 3 - local1055];
									@Pc(1082) float local1082 = local699.aFloatArray103[local1042 - 1 - local1055];
									@Pc(1091) float local1091 = local699.aFloatArray103[local1042 - 3 - local1055];
									local699.aFloatArray103[local1032 - 1 - local1055] = local1064 + local1082;
									local699.aFloatArray103[local1032 - 3 - local1055] = local1073 + local1091;
									@Pc(1120) float local1120 = local742.aFloatArray103[local1044 * local1017];
									@Pc(1129) float local1129 = local742.aFloatArray103[local1044 * local1017 + 1];
									local699.aFloatArray103[local1042 - 1 - local1055] = (local1064 - local1082) * local1120 - (local1073 - local1091) * local1129;
									local699.aFloatArray103[local1042 - 3 - local1055] = (local1073 - local1091) * local1120 + (local1064 - local1082) * local1129;
								}
							}
						}
						for (local1002 = 1; local1002 < local209 - 1; local1002++) {
							local1013 = local766[local1002];
							if (local1002 < local1013) {
								local1017 = local1002 * 8;
								local1019 = local1013 * 8;
								local943 = local699.aFloatArray103[local1017 + 1];
								local699.aFloatArray103[local1017 + 1] = local699.aFloatArray103[local1019 + 1];
								local699.aFloatArray103[local1019 + 1] = local943;
								local943 = local699.aFloatArray103[local1017 + 3];
								local699.aFloatArray103[local1017 + 3] = local699.aFloatArray103[local1019 + 3];
								local699.aFloatArray103[local1019 + 3] = local943;
								local943 = local699.aFloatArray103[local1017 + 5];
								local699.aFloatArray103[local1017 + 5] = local699.aFloatArray103[local1019 + 5];
								local699.aFloatArray103[local1019 + 5] = local943;
								local943 = local699.aFloatArray103[local1017 + 7];
								local699.aFloatArray103[local1017 + 7] = local699.aFloatArray103[local1019 + 7];
								local699.aFloatArray103[local1019 + 7] = local943;
							}
						}
						for (local1002 = 0; local1002 < local202; local1002++) {
							local699.aFloatArray103[local1002] = local699.aFloatArray103[local1002 * 2 + 1];
						}
						for (local1002 = 0; local1002 < local209; local1002++) {
							local699.aFloatArray103[local59 - 1 - local1002 * 2] = local699.aFloatArray103[local1002 * 4];
							local699.aFloatArray103[local59 - 2 - local1002 * 2] = local699.aFloatArray103[local1002 * 4 + 1];
							local699.aFloatArray103[local59 - local297 - 1 - local1002 * 2] = local699.aFloatArray103[local1002 * 4 + 2];
							local699.aFloatArray103[local59 - local297 - 2 - local1002 * 2] = local699.aFloatArray103[local1002 * 4 + 3];
						}
						for (local1002 = 0; local1002 < local209; local1002++) {
							local809 = local758.aFloatArray103[local1002 * 2];
							local816 = local758.aFloatArray103[local1002 * 2 + 1];
							local825 = local699.aFloatArray103[local202 + local1002 * 2];
							local943 = local699.aFloatArray103[local202 + local1002 * 2 + 1];
							local954 = local699.aFloatArray103[local59 - 2 - local1002 * 2];
							@Pc(1464) float local1464 = local699.aFloatArray103[local59 - 1 - local1002 * 2];
							@Pc(1476) float local1476 = local816 * (local825 - local954) + local809 * (local943 + local1464);
							local699.aFloatArray103[local202 + local1002 * 2] = (local825 + local954 + local1476) * 0.5F;
							local699.aFloatArray103[local59 - 2 - local1002 * 2] = (local825 + local954 - local1476) * 0.5F;
							@Pc(1520) float local1520 = local816 * (local943 + local1464) - local809 * (local825 - local954);
							local699.aFloatArray103[local202 + local1002 * 2 + 1] = (local943 - local1464 + local1520) * 0.5F;
							local699.aFloatArray103[local59 - 1 - local1002 * 2] = (-local943 + local1464 + local1520) * 0.5F;
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray103[local1002] = local699.aFloatArray103[local1002 * 2 + local202] * local750.aFloatArray103[local1002 * 2] + local699.aFloatArray103[local1002 * 2 + 1 + local202] * local750.aFloatArray103[local1002 * 2 + 1];
							local699.aFloatArray103[local202 - 1 - local1002] = local699.aFloatArray103[local1002 * 2 + local202] * local750.aFloatArray103[local1002 * 2 + 1] - local699.aFloatArray103[local1002 * 2 + 1 + local202] * local750.aFloatArray103[local1002 * 2];
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray103[local59 - local297 + local1002] = -local699.aFloatArray103[local1002];
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray103[local1002] = local699.aFloatArray103[local297 + local1002];
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray103[local297 + local1002] = -local699.aFloatArray103[local297 - local1002 - 1];
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray103[local202 + local1002] = local699.aFloatArray103[local59 - local1002 - 1];
						}
						for (local1002 = local96; local1002 < local105; local1002++) {
							local809 = (float) Math.sin(((double) (local1002 - local96) + 0.5D) / (double) local110 * 0.5D * 3.141592653589793D);
							this.aClass308Array2[local188].aFloatArray103[local1002] *= (float) Math.sin((double) local809 * 1.5707963267948966D * (double) local809);
						}
						for (local1002 = local134; local1002 < local145; local1002++) {
							local809 = (float) Math.sin(((double) (local1002 - local134) + 0.5D) / (double) local150 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
							this.aClass308Array2[local188].aFloatArray103[local1002] *= (float) Math.sin((double) local809 * 1.5707963267948966D * (double) local809);
						}
					}
				}
				@Pc(1816) Class308[] local1816 = null;
				if (this.anInt4068 > 0) {
					local202 = this.anInt4068 + local59 >> 2;
					local1816 = this.method27071(this.anInt4064, local202);
					for (local297 = 0; local297 < this.anInt4064; local297++) {
						if (!this.aBooleanArray27[local297]) {
							for (local209 = 0; local209 < this.anInt4072; local209++) {
								local455 = (this.anInt4068 >> 1) + local209;
								local1816[local297].aFloatArray103[local209] += this.aClass308Array1[local297].aFloatArray103[local455];
							}
						}
						if (!this.aBooleanArray28[local297]) {
							for (local209 = local96; local209 < local59 >> 1; local209++) {
								local455 = local1816[local297].anInt3947 - (local59 >> 1) + local209;
								local1816[local297].aFloatArray103[local455] += this.aClass308Array2[local297].aFloatArray103[local209];
							}
						}
					}
				}
				@Pc(1920) Class308[] local1920 = this.aClass308Array1;
				this.aClass308Array1 = this.aClass308Array2;
				this.aClass308Array2 = local1920;
				this.anInt4068 = local59;
				this.anInt4072 = local145 - (local59 >> 1);
				this.aBooleanArray27 = this.aBooleanArray28;
				arg3.set(local1816);
				return true;
			} else {
				throw new RuntimeException();
			}
		}
	}

	@OriginalMember(owner = "client!hk", name = "ep", descriptor = "([BIILjava/util/concurrent/atomic/AtomicReference;)Z", line = 654)
	boolean method27133(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) AtomicReference arg3) {
		if (arg0 == null) {
			throw new RuntimeException("");
		} else if (arg1 + arg2 > arg0.length) {
			return false;
		} else {
			this.method27110(arg0, arg1);
			@Pc(21) int local21 = this.method27112();
			if (local21 != 0) {
				this.method27120(arg0, arg1);
				return false;
			} else if (this.method27011()) {
				@Pc(46) int local46 = this.method27116(this.method27125(this.anIntArray384.length - 1));
				@Pc(51) boolean local51 = this.aBooleanArray25[local46];
				@Pc(59) int local59 = local51 ? this.anInt4067 : this.anInt4071;
				@Pc(61) boolean local61 = false;
				@Pc(63) boolean local63 = false;
				if (local51) {
					local61 = this.method27112() != 0;
					local63 = this.method27112() != 0;
				}
				@Pc(83) int local83 = local59 >> 1;
				@Pc(96) int local96;
				@Pc(105) int local105;
				@Pc(110) int local110;
				if (local51 && !local61) {
					local96 = (local59 >> 2) - (this.anInt4071 >> 2);
					local105 = (local59 >> 2) + (this.anInt4071 >> 2);
					local110 = this.anInt4071 >> 1;
				} else {
					local96 = 0;
					local105 = local83;
					local110 = local59 >> 1;
				}
				@Pc(134) int local134;
				@Pc(145) int local145;
				@Pc(150) int local150;
				if (local51 && !local63) {
					local134 = local59 - (local59 >> 2) - (this.anInt4071 >> 2);
					local145 = local59 - (local59 >> 2) + (this.anInt4071 >> 2);
					local150 = this.anInt4071 >> 1;
				} else {
					local134 = local83;
					local145 = local59;
					local150 = local59 >> 1;
				}
				@Pc(167) Class316 local167 = this.aClass316Array1[this.anIntArray384[local46]];
				if (this.aBooleanArray28 == null || this.aBooleanArray28.length != this.anInt4064) {
					this.aBooleanArray28 = new boolean[this.anInt4064];
					this.aBooleanArray24 = new boolean[this.anInt4064];
				}
				@Pc(188) int local188;
				@Pc(202) int local202;
				@Pc(209) int local209;
				for (local188 = 0; local188 < this.anInt4064; local188++) {
					local202 = local167.anIntArray387 == null ? 0 : local167.anIntArray387[local188];
					local209 = local167.anIntArray390[local202];
					this.aBooleanArray28[local188] = !this.aClass317Array1[local209].method27198(local188);
					this.aBooleanArray24[local188] = this.aBooleanArray28[local188];
				}
				for (local188 = 0; local188 < local167.anInt4093; local188++) {
					if (!this.aBooleanArray28[local167.anIntArray388[local188]] || !this.aBooleanArray28[local167.anIntArray391[local188]]) {
						this.aBooleanArray28[local167.anIntArray388[local188]] = false;
						this.aBooleanArray28[local167.anIntArray391[local188]] = false;
					}
				}
				if (this.aBooleanArray26 == null || this.aBooleanArray26.length != this.anInt4064) {
					this.aBooleanArray26 = new boolean[this.anInt4064];
				}
				@Pc(297) int local297;
				@Pc(349) int local349;
				@Pc(455) int local455;
				for (local188 = 0; local188 < local167.anInt4092; local188++) {
					local202 = 0;
					for (local297 = 0; local297 < this.anInt4064; local297++) {
						local209 = local167.anIntArray387 == null ? local188 : local167.anIntArray387[local297];
						if (local209 == local188) {
							this.aBooleanArray26[local202++] = this.aBooleanArray28[local297];
						}
					}
					@Pc(333) Class289 local333 = this.aClass289Array1[local167.anIntArray389[local188]];
					@Pc(335) Class308[] local335 = null;
					if (local333.anInt3909 == 2) {
						@Pc(347) Class308[] local347 = this.method27071(1, this.anInt4064 * local59);
						local349 = 0;
						while (true) {
							@Pc(354) int local354;
							if (local349 >= local59) {
								local347 = local333.method26555(local347, local59 >> 1, this.aBooleanArray26);
								local335 = this.aClass308Array2;
								for (local349 = 0; local349 < local59; local349++) {
									for (local354 = 0; local354 < this.anInt4064; local354++) {
										try {
											local335[local354].aFloatArray103[local349] = local347[0].aFloatArray103[this.anInt4064 * local349 + local354];
										} catch (@Pc(426) ArrayIndexOutOfBoundsException local426) {
											local426.printStackTrace();
										}
									}
								}
								this.method27081(local347);
								local347 = null;
								break;
							}
							for (local354 = 0; local354 < this.anInt4064; local354++) {
								try {
									local347[0].aFloatArray103[local349 * this.anInt4064 + local354] = this.aClass308Array2[local354].aFloatArray103[local349];
								} catch (@Pc(378) ArrayIndexOutOfBoundsException local378) {
									local378.printStackTrace();
								}
							}
							local349++;
						}
					} else {
						local335 = local333.method26555(this.aClass308Array2, local59 >> 1, this.aBooleanArray26);
					}
					if (local167.anIntArray387 == null) {
						if (this.aClass308Array2 != local335) {
							this.method27081(this.aClass308Array2);
						}
						this.aClass308Array2 = local335;
					} else {
						local202 = 0;
						for (local455 = 0; local455 < this.anInt4064; local455++) {
							local349 = local167.anIntArray387[local455];
							if (local349 == local188) {
								this.aClass308Array2[local455] = local335[local202++];
							}
						}
					}
				}
				for (local188 = local167.anInt4093 - 1; local188 >= 0; local188--) {
					@Pc(506) Class308 local506 = this.aClass308Array2[local167.anIntArray388[local188]];
					@Pc(514) Class308 local514 = this.aClass308Array2[local167.anIntArray391[local188]];
					for (local209 = 0; local209 < local506.anInt3947; local209++) {
						@Pc(525) float local525 = local506.aFloatArray103[local209];
						@Pc(530) float local530 = local514.aFloatArray103[local209];
						@Pc(548) float local548;
						@Pc(544) float local544;
						if (local525 > 0.0F) {
							if (local530 > 0.0F) {
								local544 = local525;
								local548 = local525 - local530;
							} else {
								local548 = local525;
								local544 = local525 + local530;
							}
						} else if (local530 > 0.0F) {
							local544 = local525;
							local548 = local525 + local530;
						} else {
							local548 = local525;
							local544 = local525 - local530;
						}
						local506.aFloatArray103[local209] = local544;
						local514.aFloatArray103[local209] = local548;
					}
				}
				for (local188 = 0; local188 < this.aBooleanArray28.length; local188++) {
					this.aBooleanArray28[local188] = this.aBooleanArray24[local188];
				}
				for (local188 = 0; local188 < this.anInt4064; local188++) {
					if (!this.aBooleanArray28[local188]) {
						local202 = local167.anIntArray387 == null ? 0 : local167.anIntArray387[local188];
						local209 = local167.anIntArray390[local202];
						this.aClass317Array1[local209].method27201(local188);
						this.aClass317Array1[local209].method27205(this.aClass308Array2[local188], local59 >> 1, local188);
					}
				}
				for (local188 = 0; local188 < this.anInt4064; local188++) {
					if (this.aBooleanArray28[local188]) {
						for (local202 = local59 >> 1; local202 < local59; local202++) {
							this.aClass308Array2[local188].aFloatArray103[local202] = 0.0F;
						}
					} else {
						local202 = local59 >> 1;
						local297 = local59 >> 2;
						local209 = local59 >> 3;
						@Pc(699) Class308 local699 = this.aClass308Array2[local188];
						for (local349 = 0; local349 < local202; local349++) {
							local699.aFloatArray103[local349] *= 0.5F;
						}
						for (local349 = local202; local349 < local59; local349++) {
							local699.aFloatArray103[local349] = -local699.aFloatArray103[local59 - local349 - 1];
						}
						@Pc(742) Class308 local742 = local51 ? this.aClass308_5 : this.aClass308_2;
						@Pc(750) Class308 local750 = local51 ? this.aClass308_6 : this.aClass308_3;
						@Pc(758) Class308 local758 = local51 ? this.aClass308_1 : this.aClass308_4;
						@Pc(766) int[] local766 = local51 ? this.anIntArray386 : this.anIntArray385;
						@Pc(768) int local768;
						@Pc(789) float local789;
						@Pc(809) float local809;
						@Pc(816) float local816;
						@Pc(825) float local825;
						for (local768 = 0; local768 < local297; local768++) {
							local789 = local699.aFloatArray103[local768 * 4] - local699.aFloatArray103[local59 - local768 * 4 - 1];
							local809 = local699.aFloatArray103[local768 * 4 + 2] - local699.aFloatArray103[local59 - local768 * 4 - 3];
							local816 = local742.aFloatArray103[local768 * 2];
							local825 = local742.aFloatArray103[local768 * 2 + 1];
							local699.aFloatArray103[local59 - local768 * 4 - 1] = local789 * local816 - local809 * local825;
							local699.aFloatArray103[local59 - local768 * 4 - 3] = local789 * local825 + local809 * local816;
						}
						@Pc(943) float local943;
						@Pc(954) float local954;
						for (local768 = 0; local768 < local209; local768++) {
							local789 = local699.aFloatArray103[local202 + 3 + local768 * 4];
							local809 = local699.aFloatArray103[local202 + 1 + local768 * 4];
							local816 = local699.aFloatArray103[local768 * 4 + 3];
							local825 = local699.aFloatArray103[local768 * 4 + 1];
							local699.aFloatArray103[local202 + 3 + local768 * 4] = local789 + local816;
							local699.aFloatArray103[local202 + 1 + local768 * 4] = local809 + local825;
							local943 = local742.aFloatArray103[local202 - 4 - local768 * 4];
							local954 = local742.aFloatArray103[local202 - 3 - local768 * 4];
							local699.aFloatArray103[local768 * 4 + 3] = (local789 - local816) * local943 - (local809 - local825) * local954;
							local699.aFloatArray103[local768 * 4 + 1] = (local809 - local825) * local943 + (local789 - local816) * local954;
						}
						local768 = Class548.method31010(local59 - 1, -3269982);
						@Pc(1002) int local1002;
						@Pc(1013) int local1013;
						@Pc(1017) int local1017;
						@Pc(1019) int local1019;
						for (local1002 = 0; local1002 < local768 - 3; local1002++) {
							local1013 = local59 >> local1002 + 2;
							local1017 = 0x8 << local1002;
							for (local1019 = 0; local1019 < 0x2 << local1002; local1019++) {
								@Pc(1032) int local1032 = local59 - local1013 * 2 * local1019;
								@Pc(1042) int local1042 = local59 - local1013 * (local1019 * 2 + 1);
								for (@Pc(1044) int local1044 = 0; local1044 < local59 >> local1002 + 4; local1044++) {
									@Pc(1055) int local1055 = local1044 * 4;
									@Pc(1064) float local1064 = local699.aFloatArray103[local1032 - 1 - local1055];
									@Pc(1073) float local1073 = local699.aFloatArray103[local1032 - 3 - local1055];
									@Pc(1082) float local1082 = local699.aFloatArray103[local1042 - 1 - local1055];
									@Pc(1091) float local1091 = local699.aFloatArray103[local1042 - 3 - local1055];
									local699.aFloatArray103[local1032 - 1 - local1055] = local1064 + local1082;
									local699.aFloatArray103[local1032 - 3 - local1055] = local1073 + local1091;
									@Pc(1120) float local1120 = local742.aFloatArray103[local1044 * local1017];
									@Pc(1129) float local1129 = local742.aFloatArray103[local1044 * local1017 + 1];
									local699.aFloatArray103[local1042 - 1 - local1055] = (local1064 - local1082) * local1120 - (local1073 - local1091) * local1129;
									local699.aFloatArray103[local1042 - 3 - local1055] = (local1073 - local1091) * local1120 + (local1064 - local1082) * local1129;
								}
							}
						}
						for (local1002 = 1; local1002 < local209 - 1; local1002++) {
							local1013 = local766[local1002];
							if (local1002 < local1013) {
								local1017 = local1002 * 8;
								local1019 = local1013 * 8;
								local943 = local699.aFloatArray103[local1017 + 1];
								local699.aFloatArray103[local1017 + 1] = local699.aFloatArray103[local1019 + 1];
								local699.aFloatArray103[local1019 + 1] = local943;
								local943 = local699.aFloatArray103[local1017 + 3];
								local699.aFloatArray103[local1017 + 3] = local699.aFloatArray103[local1019 + 3];
								local699.aFloatArray103[local1019 + 3] = local943;
								local943 = local699.aFloatArray103[local1017 + 5];
								local699.aFloatArray103[local1017 + 5] = local699.aFloatArray103[local1019 + 5];
								local699.aFloatArray103[local1019 + 5] = local943;
								local943 = local699.aFloatArray103[local1017 + 7];
								local699.aFloatArray103[local1017 + 7] = local699.aFloatArray103[local1019 + 7];
								local699.aFloatArray103[local1019 + 7] = local943;
							}
						}
						for (local1002 = 0; local1002 < local202; local1002++) {
							local699.aFloatArray103[local1002] = local699.aFloatArray103[local1002 * 2 + 1];
						}
						for (local1002 = 0; local1002 < local209; local1002++) {
							local699.aFloatArray103[local59 - 1 - local1002 * 2] = local699.aFloatArray103[local1002 * 4];
							local699.aFloatArray103[local59 - 2 - local1002 * 2] = local699.aFloatArray103[local1002 * 4 + 1];
							local699.aFloatArray103[local59 - local297 - 1 - local1002 * 2] = local699.aFloatArray103[local1002 * 4 + 2];
							local699.aFloatArray103[local59 - local297 - 2 - local1002 * 2] = local699.aFloatArray103[local1002 * 4 + 3];
						}
						for (local1002 = 0; local1002 < local209; local1002++) {
							local809 = local758.aFloatArray103[local1002 * 2];
							local816 = local758.aFloatArray103[local1002 * 2 + 1];
							local825 = local699.aFloatArray103[local202 + local1002 * 2];
							local943 = local699.aFloatArray103[local202 + local1002 * 2 + 1];
							local954 = local699.aFloatArray103[local59 - 2 - local1002 * 2];
							@Pc(1464) float local1464 = local699.aFloatArray103[local59 - 1 - local1002 * 2];
							@Pc(1476) float local1476 = local816 * (local825 - local954) + local809 * (local943 + local1464);
							local699.aFloatArray103[local202 + local1002 * 2] = (local825 + local954 + local1476) * 0.5F;
							local699.aFloatArray103[local59 - 2 - local1002 * 2] = (local825 + local954 - local1476) * 0.5F;
							@Pc(1520) float local1520 = local816 * (local943 + local1464) - local809 * (local825 - local954);
							local699.aFloatArray103[local202 + local1002 * 2 + 1] = (local943 - local1464 + local1520) * 0.5F;
							local699.aFloatArray103[local59 - 1 - local1002 * 2] = (-local943 + local1464 + local1520) * 0.5F;
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray103[local1002] = local699.aFloatArray103[local1002 * 2 + local202] * local750.aFloatArray103[local1002 * 2] + local699.aFloatArray103[local1002 * 2 + 1 + local202] * local750.aFloatArray103[local1002 * 2 + 1];
							local699.aFloatArray103[local202 - 1 - local1002] = local699.aFloatArray103[local1002 * 2 + local202] * local750.aFloatArray103[local1002 * 2 + 1] - local699.aFloatArray103[local1002 * 2 + 1 + local202] * local750.aFloatArray103[local1002 * 2];
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray103[local59 - local297 + local1002] = -local699.aFloatArray103[local1002];
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray103[local1002] = local699.aFloatArray103[local297 + local1002];
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray103[local297 + local1002] = -local699.aFloatArray103[local297 - local1002 - 1];
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray103[local202 + local1002] = local699.aFloatArray103[local59 - local1002 - 1];
						}
						for (local1002 = local96; local1002 < local105; local1002++) {
							local809 = (float) Math.sin(((double) (local1002 - local96) + 0.5D) / (double) local110 * 0.5D * 3.141592653589793D);
							this.aClass308Array2[local188].aFloatArray103[local1002] *= (float) Math.sin((double) local809 * 1.5707963267948966D * (double) local809);
						}
						for (local1002 = local134; local1002 < local145; local1002++) {
							local809 = (float) Math.sin(((double) (local1002 - local134) + 0.5D) / (double) local150 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
							this.aClass308Array2[local188].aFloatArray103[local1002] *= (float) Math.sin((double) local809 * 1.5707963267948966D * (double) local809);
						}
					}
				}
				@Pc(1816) Class308[] local1816 = null;
				if (this.anInt4068 > 0) {
					local202 = this.anInt4068 + local59 >> 2;
					local1816 = this.method27071(this.anInt4064, local202);
					for (local297 = 0; local297 < this.anInt4064; local297++) {
						if (!this.aBooleanArray27[local297]) {
							for (local209 = 0; local209 < this.anInt4072; local209++) {
								local455 = (this.anInt4068 >> 1) + local209;
								local1816[local297].aFloatArray103[local209] += this.aClass308Array1[local297].aFloatArray103[local455];
							}
						}
						if (!this.aBooleanArray28[local297]) {
							for (local209 = local96; local209 < local59 >> 1; local209++) {
								local455 = local1816[local297].anInt3947 - (local59 >> 1) + local209;
								local1816[local297].aFloatArray103[local455] += this.aClass308Array2[local297].aFloatArray103[local209];
							}
						}
					}
				}
				@Pc(1920) Class308[] local1920 = this.aClass308Array1;
				this.aClass308Array1 = this.aClass308Array2;
				this.aClass308Array2 = local1920;
				this.anInt4068 = local59;
				this.anInt4072 = local145 - (local59 >> 1);
				this.aBooleanArray27 = this.aBooleanArray28;
				arg3.set(local1816);
				return true;
			} else {
				throw new RuntimeException();
			}
		}
	}

	@OriginalMember(owner = "client!hk", name = "ev", descriptor = "([BIILjava/util/concurrent/atomic/AtomicReference;)Z", line = 654)
	boolean method27134(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) AtomicReference arg3) {
		if (arg0 == null) {
			throw new RuntimeException("");
		} else if (arg1 + arg2 > arg0.length) {
			return false;
		} else {
			this.method27110(arg0, arg1);
			@Pc(21) int local21 = this.method27112();
			if (local21 != 0) {
				this.method27120(arg0, arg1);
				return false;
			} else if (this.method27011()) {
				@Pc(46) int local46 = this.method27116(this.method27125(this.anIntArray384.length - 1));
				@Pc(51) boolean local51 = this.aBooleanArray25[local46];
				@Pc(59) int local59 = local51 ? this.anInt4067 : this.anInt4071;
				@Pc(61) boolean local61 = false;
				@Pc(63) boolean local63 = false;
				if (local51) {
					local61 = this.method27112() != 0;
					local63 = this.method27112() != 0;
				}
				@Pc(83) int local83 = local59 >> 1;
				@Pc(96) int local96;
				@Pc(105) int local105;
				@Pc(110) int local110;
				if (local51 && !local61) {
					local96 = (local59 >> 2) - (this.anInt4071 >> 2);
					local105 = (local59 >> 2) + (this.anInt4071 >> 2);
					local110 = this.anInt4071 >> 1;
				} else {
					local96 = 0;
					local105 = local83;
					local110 = local59 >> 1;
				}
				@Pc(134) int local134;
				@Pc(145) int local145;
				@Pc(150) int local150;
				if (local51 && !local63) {
					local134 = local59 - (local59 >> 2) - (this.anInt4071 >> 2);
					local145 = local59 - (local59 >> 2) + (this.anInt4071 >> 2);
					local150 = this.anInt4071 >> 1;
				} else {
					local134 = local83;
					local145 = local59;
					local150 = local59 >> 1;
				}
				@Pc(167) Class316 local167 = this.aClass316Array1[this.anIntArray384[local46]];
				if (this.aBooleanArray28 == null || this.aBooleanArray28.length != this.anInt4064) {
					this.aBooleanArray28 = new boolean[this.anInt4064];
					this.aBooleanArray24 = new boolean[this.anInt4064];
				}
				@Pc(188) int local188;
				@Pc(202) int local202;
				@Pc(209) int local209;
				for (local188 = 0; local188 < this.anInt4064; local188++) {
					local202 = local167.anIntArray387 == null ? 0 : local167.anIntArray387[local188];
					local209 = local167.anIntArray390[local202];
					this.aBooleanArray28[local188] = !this.aClass317Array1[local209].method27198(local188);
					this.aBooleanArray24[local188] = this.aBooleanArray28[local188];
				}
				for (local188 = 0; local188 < local167.anInt4093; local188++) {
					if (!this.aBooleanArray28[local167.anIntArray388[local188]] || !this.aBooleanArray28[local167.anIntArray391[local188]]) {
						this.aBooleanArray28[local167.anIntArray388[local188]] = false;
						this.aBooleanArray28[local167.anIntArray391[local188]] = false;
					}
				}
				if (this.aBooleanArray26 == null || this.aBooleanArray26.length != this.anInt4064) {
					this.aBooleanArray26 = new boolean[this.anInt4064];
				}
				@Pc(297) int local297;
				@Pc(349) int local349;
				@Pc(455) int local455;
				for (local188 = 0; local188 < local167.anInt4092; local188++) {
					local202 = 0;
					for (local297 = 0; local297 < this.anInt4064; local297++) {
						local209 = local167.anIntArray387 == null ? local188 : local167.anIntArray387[local297];
						if (local209 == local188) {
							this.aBooleanArray26[local202++] = this.aBooleanArray28[local297];
						}
					}
					@Pc(333) Class289 local333 = this.aClass289Array1[local167.anIntArray389[local188]];
					@Pc(335) Class308[] local335 = null;
					if (local333.anInt3909 == 2) {
						@Pc(347) Class308[] local347 = this.method27071(1, this.anInt4064 * local59);
						local349 = 0;
						while (true) {
							@Pc(354) int local354;
							if (local349 >= local59) {
								local347 = local333.method26555(local347, local59 >> 1, this.aBooleanArray26);
								local335 = this.aClass308Array2;
								for (local349 = 0; local349 < local59; local349++) {
									for (local354 = 0; local354 < this.anInt4064; local354++) {
										try {
											local335[local354].aFloatArray103[local349] = local347[0].aFloatArray103[this.anInt4064 * local349 + local354];
										} catch (@Pc(426) ArrayIndexOutOfBoundsException local426) {
											local426.printStackTrace();
										}
									}
								}
								this.method27081(local347);
								local347 = null;
								break;
							}
							for (local354 = 0; local354 < this.anInt4064; local354++) {
								try {
									local347[0].aFloatArray103[local349 * this.anInt4064 + local354] = this.aClass308Array2[local354].aFloatArray103[local349];
								} catch (@Pc(378) ArrayIndexOutOfBoundsException local378) {
									local378.printStackTrace();
								}
							}
							local349++;
						}
					} else {
						local335 = local333.method26555(this.aClass308Array2, local59 >> 1, this.aBooleanArray26);
					}
					if (local167.anIntArray387 == null) {
						if (this.aClass308Array2 != local335) {
							this.method27081(this.aClass308Array2);
						}
						this.aClass308Array2 = local335;
					} else {
						local202 = 0;
						for (local455 = 0; local455 < this.anInt4064; local455++) {
							local349 = local167.anIntArray387[local455];
							if (local349 == local188) {
								this.aClass308Array2[local455] = local335[local202++];
							}
						}
					}
				}
				for (local188 = local167.anInt4093 - 1; local188 >= 0; local188--) {
					@Pc(506) Class308 local506 = this.aClass308Array2[local167.anIntArray388[local188]];
					@Pc(514) Class308 local514 = this.aClass308Array2[local167.anIntArray391[local188]];
					for (local209 = 0; local209 < local506.anInt3947; local209++) {
						@Pc(525) float local525 = local506.aFloatArray103[local209];
						@Pc(530) float local530 = local514.aFloatArray103[local209];
						@Pc(548) float local548;
						@Pc(544) float local544;
						if (local525 > 0.0F) {
							if (local530 > 0.0F) {
								local544 = local525;
								local548 = local525 - local530;
							} else {
								local548 = local525;
								local544 = local525 + local530;
							}
						} else if (local530 > 0.0F) {
							local544 = local525;
							local548 = local525 + local530;
						} else {
							local548 = local525;
							local544 = local525 - local530;
						}
						local506.aFloatArray103[local209] = local544;
						local514.aFloatArray103[local209] = local548;
					}
				}
				for (local188 = 0; local188 < this.aBooleanArray28.length; local188++) {
					this.aBooleanArray28[local188] = this.aBooleanArray24[local188];
				}
				for (local188 = 0; local188 < this.anInt4064; local188++) {
					if (!this.aBooleanArray28[local188]) {
						local202 = local167.anIntArray387 == null ? 0 : local167.anIntArray387[local188];
						local209 = local167.anIntArray390[local202];
						this.aClass317Array1[local209].method27201(local188);
						this.aClass317Array1[local209].method27205(this.aClass308Array2[local188], local59 >> 1, local188);
					}
				}
				for (local188 = 0; local188 < this.anInt4064; local188++) {
					if (this.aBooleanArray28[local188]) {
						for (local202 = local59 >> 1; local202 < local59; local202++) {
							this.aClass308Array2[local188].aFloatArray103[local202] = 0.0F;
						}
					} else {
						local202 = local59 >> 1;
						local297 = local59 >> 2;
						local209 = local59 >> 3;
						@Pc(699) Class308 local699 = this.aClass308Array2[local188];
						for (local349 = 0; local349 < local202; local349++) {
							local699.aFloatArray103[local349] *= 0.5F;
						}
						for (local349 = local202; local349 < local59; local349++) {
							local699.aFloatArray103[local349] = -local699.aFloatArray103[local59 - local349 - 1];
						}
						@Pc(742) Class308 local742 = local51 ? this.aClass308_5 : this.aClass308_2;
						@Pc(750) Class308 local750 = local51 ? this.aClass308_6 : this.aClass308_3;
						@Pc(758) Class308 local758 = local51 ? this.aClass308_1 : this.aClass308_4;
						@Pc(766) int[] local766 = local51 ? this.anIntArray386 : this.anIntArray385;
						@Pc(768) int local768;
						@Pc(789) float local789;
						@Pc(809) float local809;
						@Pc(816) float local816;
						@Pc(825) float local825;
						for (local768 = 0; local768 < local297; local768++) {
							local789 = local699.aFloatArray103[local768 * 4] - local699.aFloatArray103[local59 - local768 * 4 - 1];
							local809 = local699.aFloatArray103[local768 * 4 + 2] - local699.aFloatArray103[local59 - local768 * 4 - 3];
							local816 = local742.aFloatArray103[local768 * 2];
							local825 = local742.aFloatArray103[local768 * 2 + 1];
							local699.aFloatArray103[local59 - local768 * 4 - 1] = local789 * local816 - local809 * local825;
							local699.aFloatArray103[local59 - local768 * 4 - 3] = local789 * local825 + local809 * local816;
						}
						@Pc(943) float local943;
						@Pc(954) float local954;
						for (local768 = 0; local768 < local209; local768++) {
							local789 = local699.aFloatArray103[local202 + 3 + local768 * 4];
							local809 = local699.aFloatArray103[local202 + 1 + local768 * 4];
							local816 = local699.aFloatArray103[local768 * 4 + 3];
							local825 = local699.aFloatArray103[local768 * 4 + 1];
							local699.aFloatArray103[local202 + 3 + local768 * 4] = local789 + local816;
							local699.aFloatArray103[local202 + 1 + local768 * 4] = local809 + local825;
							local943 = local742.aFloatArray103[local202 - 4 - local768 * 4];
							local954 = local742.aFloatArray103[local202 - 3 - local768 * 4];
							local699.aFloatArray103[local768 * 4 + 3] = (local789 - local816) * local943 - (local809 - local825) * local954;
							local699.aFloatArray103[local768 * 4 + 1] = (local809 - local825) * local943 + (local789 - local816) * local954;
						}
						local768 = Class548.method31010(local59 - 1, -582350680);
						@Pc(1002) int local1002;
						@Pc(1013) int local1013;
						@Pc(1017) int local1017;
						@Pc(1019) int local1019;
						for (local1002 = 0; local1002 < local768 - 3; local1002++) {
							local1013 = local59 >> local1002 + 2;
							local1017 = 0x8 << local1002;
							for (local1019 = 0; local1019 < 0x2 << local1002; local1019++) {
								@Pc(1032) int local1032 = local59 - local1013 * 2 * local1019;
								@Pc(1042) int local1042 = local59 - local1013 * (local1019 * 2 + 1);
								for (@Pc(1044) int local1044 = 0; local1044 < local59 >> local1002 + 4; local1044++) {
									@Pc(1055) int local1055 = local1044 * 4;
									@Pc(1064) float local1064 = local699.aFloatArray103[local1032 - 1 - local1055];
									@Pc(1073) float local1073 = local699.aFloatArray103[local1032 - 3 - local1055];
									@Pc(1082) float local1082 = local699.aFloatArray103[local1042 - 1 - local1055];
									@Pc(1091) float local1091 = local699.aFloatArray103[local1042 - 3 - local1055];
									local699.aFloatArray103[local1032 - 1 - local1055] = local1064 + local1082;
									local699.aFloatArray103[local1032 - 3 - local1055] = local1073 + local1091;
									@Pc(1120) float local1120 = local742.aFloatArray103[local1044 * local1017];
									@Pc(1129) float local1129 = local742.aFloatArray103[local1044 * local1017 + 1];
									local699.aFloatArray103[local1042 - 1 - local1055] = (local1064 - local1082) * local1120 - (local1073 - local1091) * local1129;
									local699.aFloatArray103[local1042 - 3 - local1055] = (local1073 - local1091) * local1120 + (local1064 - local1082) * local1129;
								}
							}
						}
						for (local1002 = 1; local1002 < local209 - 1; local1002++) {
							local1013 = local766[local1002];
							if (local1002 < local1013) {
								local1017 = local1002 * 8;
								local1019 = local1013 * 8;
								local943 = local699.aFloatArray103[local1017 + 1];
								local699.aFloatArray103[local1017 + 1] = local699.aFloatArray103[local1019 + 1];
								local699.aFloatArray103[local1019 + 1] = local943;
								local943 = local699.aFloatArray103[local1017 + 3];
								local699.aFloatArray103[local1017 + 3] = local699.aFloatArray103[local1019 + 3];
								local699.aFloatArray103[local1019 + 3] = local943;
								local943 = local699.aFloatArray103[local1017 + 5];
								local699.aFloatArray103[local1017 + 5] = local699.aFloatArray103[local1019 + 5];
								local699.aFloatArray103[local1019 + 5] = local943;
								local943 = local699.aFloatArray103[local1017 + 7];
								local699.aFloatArray103[local1017 + 7] = local699.aFloatArray103[local1019 + 7];
								local699.aFloatArray103[local1019 + 7] = local943;
							}
						}
						for (local1002 = 0; local1002 < local202; local1002++) {
							local699.aFloatArray103[local1002] = local699.aFloatArray103[local1002 * 2 + 1];
						}
						for (local1002 = 0; local1002 < local209; local1002++) {
							local699.aFloatArray103[local59 - 1 - local1002 * 2] = local699.aFloatArray103[local1002 * 4];
							local699.aFloatArray103[local59 - 2 - local1002 * 2] = local699.aFloatArray103[local1002 * 4 + 1];
							local699.aFloatArray103[local59 - local297 - 1 - local1002 * 2] = local699.aFloatArray103[local1002 * 4 + 2];
							local699.aFloatArray103[local59 - local297 - 2 - local1002 * 2] = local699.aFloatArray103[local1002 * 4 + 3];
						}
						for (local1002 = 0; local1002 < local209; local1002++) {
							local809 = local758.aFloatArray103[local1002 * 2];
							local816 = local758.aFloatArray103[local1002 * 2 + 1];
							local825 = local699.aFloatArray103[local202 + local1002 * 2];
							local943 = local699.aFloatArray103[local202 + local1002 * 2 + 1];
							local954 = local699.aFloatArray103[local59 - 2 - local1002 * 2];
							@Pc(1464) float local1464 = local699.aFloatArray103[local59 - 1 - local1002 * 2];
							@Pc(1476) float local1476 = local816 * (local825 - local954) + local809 * (local943 + local1464);
							local699.aFloatArray103[local202 + local1002 * 2] = (local825 + local954 + local1476) * 0.5F;
							local699.aFloatArray103[local59 - 2 - local1002 * 2] = (local825 + local954 - local1476) * 0.5F;
							@Pc(1520) float local1520 = local816 * (local943 + local1464) - local809 * (local825 - local954);
							local699.aFloatArray103[local202 + local1002 * 2 + 1] = (local943 - local1464 + local1520) * 0.5F;
							local699.aFloatArray103[local59 - 1 - local1002 * 2] = (-local943 + local1464 + local1520) * 0.5F;
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray103[local1002] = local699.aFloatArray103[local1002 * 2 + local202] * local750.aFloatArray103[local1002 * 2] + local699.aFloatArray103[local1002 * 2 + 1 + local202] * local750.aFloatArray103[local1002 * 2 + 1];
							local699.aFloatArray103[local202 - 1 - local1002] = local699.aFloatArray103[local1002 * 2 + local202] * local750.aFloatArray103[local1002 * 2 + 1] - local699.aFloatArray103[local1002 * 2 + 1 + local202] * local750.aFloatArray103[local1002 * 2];
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray103[local59 - local297 + local1002] = -local699.aFloatArray103[local1002];
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray103[local1002] = local699.aFloatArray103[local297 + local1002];
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray103[local297 + local1002] = -local699.aFloatArray103[local297 - local1002 - 1];
						}
						for (local1002 = 0; local1002 < local297; local1002++) {
							local699.aFloatArray103[local202 + local1002] = local699.aFloatArray103[local59 - local1002 - 1];
						}
						for (local1002 = local96; local1002 < local105; local1002++) {
							local809 = (float) Math.sin(((double) (local1002 - local96) + 0.5D) / (double) local110 * 0.5D * 3.141592653589793D);
							this.aClass308Array2[local188].aFloatArray103[local1002] *= (float) Math.sin((double) local809 * 1.5707963267948966D * (double) local809);
						}
						for (local1002 = local134; local1002 < local145; local1002++) {
							local809 = (float) Math.sin(((double) (local1002 - local134) + 0.5D) / (double) local150 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
							this.aClass308Array2[local188].aFloatArray103[local1002] *= (float) Math.sin((double) local809 * 1.5707963267948966D * (double) local809);
						}
					}
				}
				@Pc(1816) Class308[] local1816 = null;
				if (this.anInt4068 > 0) {
					local202 = this.anInt4068 + local59 >> 2;
					local1816 = this.method27071(this.anInt4064, local202);
					for (local297 = 0; local297 < this.anInt4064; local297++) {
						if (!this.aBooleanArray27[local297]) {
							for (local209 = 0; local209 < this.anInt4072; local209++) {
								local455 = (this.anInt4068 >> 1) + local209;
								local1816[local297].aFloatArray103[local209] += this.aClass308Array1[local297].aFloatArray103[local455];
							}
						}
						if (!this.aBooleanArray28[local297]) {
							for (local209 = local96; local209 < local59 >> 1; local209++) {
								local455 = local1816[local297].anInt3947 - (local59 >> 1) + local209;
								local1816[local297].aFloatArray103[local455] += this.aClass308Array2[local297].aFloatArray103[local209];
							}
						}
					}
				}
				@Pc(1920) Class308[] local1920 = this.aClass308Array1;
				this.aClass308Array1 = this.aClass308Array2;
				this.aClass308Array2 = local1920;
				this.anInt4068 = local59;
				this.anInt4072 = local145 - (local59 >> 1);
				this.aBooleanArray27 = this.aBooleanArray28;
				arg3.set(local1816);
				return true;
			} else {
				throw new RuntimeException();
			}
		}
	}

	@OriginalMember(owner = "client!hk", name = "ek", descriptor = "()V", line = 972)
	void method27135() {
		if (this.method27041() == Class413.aClass413_2 || (this.method27041() == Class413.aClass413_5 || this.aBoolean704 && (float) (this.anInt4087 / this.method27055()) > this.aFloat285)) {
			return;
		}
		if (!this.method27094()) {
			@Pc(41) Packet local41 = (Packet) (this.aList14 == null || this.aList14.isEmpty() ? null : this.aList14.get(0));
			if (local41 == null) {
				if (!this.aBoolean702) {
					this.method27054(Class413.aClass413_5);
					this.anInterface41_1.method30622(1676026677);
					this.aBoolean702 = true;
				}
				return;
			}
			this.aBoolean702 = false;
			this.aBoolean705 = true;
			this.aList14.remove(0);
			this.method27093(local41);
		}
		this.method27139();
	}

	@OriginalMember(owner = "client!hk", name = "ax", descriptor = "()V", line = 972)
	void method27136() {
		if (this.method27041() == Class413.aClass413_2 || (this.method27041() == Class413.aClass413_5 || this.aBoolean704 && (float) (this.anInt4087 / this.method27055()) > this.aFloat285)) {
			return;
		}
		if (!this.method27094()) {
			@Pc(41) Packet local41 = (Packet) (this.aList14 == null || this.aList14.isEmpty() ? null : this.aList14.get(0));
			if (local41 == null) {
				if (!this.aBoolean702) {
					this.method27054(Class413.aClass413_5);
					this.anInterface41_1.method30622(1676026677);
					this.aBoolean702 = true;
				}
				return;
			}
			this.aBoolean702 = false;
			this.aBoolean705 = true;
			this.aList14.remove(0);
			this.method27093(local41);
		}
		this.method27139();
	}

	@OriginalMember(owner = "client!hk", name = "av", descriptor = "(Lclient!alw;)V", line = 1000)
	synchronized void method27137(@OriginalArg(0) Packet arg0) {
		this.aList14.add(arg0);
		this.method27054(Class413.aClass413_3);
	}

	@OriginalMember(owner = "client!hk", name = "em", descriptor = "(Lclient!alw;)V", line = 1000)
	synchronized void method27138(@OriginalArg(0) Packet arg0) {
		this.aList14.add(arg0);
		this.method27054(Class413.aClass413_3);
	}

	@OriginalMember(owner = "client!hk", name = "ao", descriptor = "()V", line = 1005)
	synchronized void method27139() {
		@Pc(10) int local10 = this.aPacket_15 == null ? 0 : this.aPacket_15.pos * 212851357;
		@Pc(12) int local12 = 0;
		@Pc(16) Iterator local16 = this.aList17.iterator();
		@Pc(23) Packet local23;
		while (local16.hasNext()) {
			local23 = (Packet) local16.next();
			local12 += local23.pos * 212851357;
		}
		if (this.aPacket_15 == null) {
			this.aPacket_15 = this.method27155(local12);
			this.anInt4076 = 0;
			local10 = 0;
		} else if (this.aPacket_15.data.length - this.aPacket_15.pos * 212851357 < local12) {
			@Pc(53) Packet local53 = this.method27155(local12 + this.anInt4076);
			local53.pdata(this.aPacket_15.data, this.aPacket_15.pos * 212851357 - this.anInt4078, this.anInt4076, 2026842986);
			this.aPacket_15.release((byte) 1);
			this.aPacket_15 = local53;
			local10 = this.anInt4078;
		}
		local16 = this.aList17.iterator();
		while (local16.hasNext()) {
			local23 = (Packet) local16.next();
			this.aPacket_15.pdata(local23.data, 0, local23.pos * 212851357, 2026842986);
			this.anInt4076 += local23.pos * 212851357;
			local23.release((byte) 1);
		}
		this.aPacket_15.pos = (local10 - this.anInt4078) * -1445626955;
		this.anInt4078 = 0;
		this.aList17.clear();
		label286: while (true) {
			if (this.aBoolean705) {
				if (this.aPacket_15.pos * 212851357 < this.aPacket_15.data.length) {
					if (this.aBoolean704 && (float) (this.anInt4087 / this.method27055()) > this.aFloat285) {
						return;
					}
					if (this.aPacket_15 != null && this.anInt4076 >= 27) {
						@Pc(205) int local205 = this.aPacket_15.pos * 212851357;
						@Pc(207) byte local207 = 0;
						@Pc(209) int local209 = 0;
						if (!this.method27098(this.aPacket_15)) {
							return;
						}
						this.anInt4082++;
						if (this.anInt4081 < 0) {
							this.anInt4080++;
						}
						this.aList18.clear();
						this.aList19.clear();
						this.aPacket_15.g1((short) 16384);
						@Pc(246) int local246 = this.aPacket_15.g1((short) 16384);
						@Pc(278) int local278 = this.aPacket_15.g1((short) 16384) & 0xFF | (this.aPacket_15.g1((short) 16384) & 0xFF) << 8 | (this.aPacket_15.g1((short) 16384) & 0xFF) << 16 | this.aPacket_15.g1((short) 16384) << 24;
						@Pc(282) int local282 = local278 - local207;
						this.aPacket_15.pos += -1655194800;
						@Pc(294) int local294 = this.aPacket_15.g1((short) 16384);
						@Pc(300) int local300 = this.aPacket_15.pos * 212851357;
						@Pc(304) int local304 = local300 + local294;
						if (local304 > local205 + this.anInt4076) {
							this.aPacket_15.pos = (local205 + this.anInt4076) * -1445626955;
							this.anInt4078 = this.aPacket_15.pos * 212851357 - local205;
							this.aBoolean705 = false;
						}
						@Pc(333) int local333 = local304;
						@Pc(335) int local335 = 0;
						@Pc(352) int local352;
						if (this.aBoolean705) {
							for (@Pc(340) int local340 = 0; local340 < local294; local340++) {
								local352 = this.aPacket_15.data[local300++] & 0xFF;
								local304 += local352;
								local335 += local352;
								if (local304 > local205 + this.anInt4076) {
									this.aPacket_15.pos = (local205 + this.anInt4076) * -1445626955;
									this.anInt4078 = this.aPacket_15.pos * 212851357 - local205;
									this.aBoolean705 = false;
									break;
								}
								if (local352 < 255) {
									this.aList18.add(local333);
									this.aList19.add(local335);
									local333 = local304;
									local335 = 0;
								}
							}
						}
						if (!this.aBoolean705) {
							continue;
						}
						local352 = -1;
						@Pc(420) Iterator local420 = this.aList18.iterator();
						@Pc(424) Iterator local424 = this.aList19.iterator();
						@Pc(426) boolean local426 = false;
						this.anInt4086 = 0;
						while (true) {
							while (local420.hasNext()) {
								@Pc(436) Integer local436 = (Integer) local420.next();
								@Pc(440) Integer local440 = (Integer) local424.next();
								local352++;
								if (this.method27011() && this.aBoolean706 && this.anInt4082 < this.anInt4080 && local352 < this.anInt4081) {
									this.anInt4079 += local426 ? 0 : local282;
									local426 = true;
								} else {
									this.anAtomicReference1.set(null);
									@Pc(486) boolean local486 = this.method27131(this.aPacket_15.data, local436, local440, this.anAtomicReference1);
									@Pc(492) Class308[] local492 = (Class308[]) this.anAtomicReference1.get();
									if (!local486 || this.aBoolean706 && this.anInt4082 < this.anInt4080 && local352 < this.anInt4081) {
										if (this.method27011()) {
											this.anInt4068 = 0;
											if (this.aClass308Array1 == null || this.aClass308Array1 != null && (this.aClass308Array1.length != this.anInt4064 || this.aClass308Array1[0].anInt3947 != this.anInt4067)) {
												if (this.aClass308Array1 != null) {
													this.method27081(this.aClass308Array1);
												}
												this.aClass308Array1 = this.method27071(this.anInt4064, this.anInt4067);
											}
										}
									} else if (local492 != null) {
										@Pc(514) int local514 = local492[0].anInt3947;
										this.anInt4085 += local514;
										if (this.anInt4085 > local278 && local246 == 4) {
											this.anInt4086 = this.anInt4085 - local278 - this.anInt4086;
											local514 -= this.anInt4086;
											if (this.anInt4086 > local492[0].anInt3947) {
												this.anInt4086 = local492[0].anInt3947;
											}
											if (local514 < 0) {
												local514 = 0;
											}
										}
										@Pc(560) int local560 = 0;
										@Pc(567) int local567 = this.method27006(local514) * local492.length;
										@Pc(578) int local578;
										if (this.aBoolean706 && this.anInt4079 < this.anInt4090) {
											local578 = local567;
											local567 -= this.method27006(this.anInt4090 - this.anInt4079);
											if (local567 <= 0) {
												this.anInt4079 += this.method27050(local578);
												this.method27081(local492);
												local492 = null;
												continue;
											}
											local560 += this.anInt4090 - this.anInt4079;
										}
										if (this.anInt4079 + local514 > this.anInt4070 && (this.anInt4084 < this.anInt4083 || this.anInt4083 < 0) && this.aBoolean707) {
											local567 -= this.method27006(this.anInt4079 + local514 - this.anInt4070 - 1);
											if (local567 <= 0) {
												this.method27081(local492);
												local492 = null;
												continue;
											}
										}
										local578 = this.method27005();
										if (this.method27064() < this.method27005()) {
											@Pc(666) int local666 = this.method27005() - this.method27064();
											local567 += local567 / this.method27064() * local666;
										}
										@Pc(679) Packet local679 = this.method27155(local567);
										for (@Pc(681) int local681 = local560; local681 < local514; local681++) {
											@Pc(687) boolean local687 = this.aBoolean706;
											if (this.anInt4083 != 0) {
												if (this.anInt4079 == this.anInt4090) {
													if (this.anInt4074 < 0) {
														this.anInt4074 = this.anInt4077;
														this.anInt4081 = local352;
													}
													this.aBoolean706 = false;
												}
												if (this.anInt4079 == this.anInt4070 && this.anInt4088 < 0) {
													this.anInt4088 = this.anInt4077;
												}
												if (this.anInt4079 > this.anInt4070 && (this.anInt4084 < this.anInt4083 || this.anInt4083 < 0) && this.aBoolean707) {
													local687 = true;
												}
											}
											if (local687 && (this.anInt4079 < this.anInt4090 || this.anInt4079 > this.anInt4070)) {
												this.anInt4079++;
												local209++;
												if (local209 > local282) {
													throw new RuntimeException();
												}
											} else {
												for (@Pc(766) int local766 = 0; local766 < local578; local766++) {
													@Pc(780) float local780;
													if (local766 < local492.length) {
														local780 = local492[local766].aFloatArray103[local681];
													} else {
														local780 = local492[local766 % this.method27064()].aFloatArray103[local681];
													}
													@Pc(799) int local799;
													if (this.aClass433_1 == Class433.aClass433_3) {
														local799 = this.method27143(local780);
														if (this.aClass426_1 == Class426.aClass426_3) {
															local679.ip2(local799, -780121020);
														} else {
															local679.p2(local799, 2130664763);
														}
													} else if (this.aClass433_1 == Class433.aClass433_2) {
														local799 = this.method27144(local780);
														if (this.aClass426_1 == Class426.aClass426_3) {
															local679.ip2(local799, -1047882561);
														} else {
															local679.p2(local799, 2128695869);
														}
													} else if (this.aClass433_1 == Class433.aClass433_4) {
														local799 = this.method27147(local780);
														local679.p1(local799, (byte) -5);
													} else if (this.aClass433_1 == Class433.aClass433_5) {
														local799 = this.method27148(local780);
														local679.p1(local799, (byte) -108);
													}
												}
												this.anInt4079++;
												local209++;
											}
										}
										@Pc(875) List local875 = this.aList16;
										synchronized (this.aList16) {
											this.anInt4087 += this.method27050(local679.pos * 212851357) / this.method27005();
											this.aList16.add(local679);
										}
									}
									this.method27081(local492);
									local492 = null;
								}
							}
							this.aPacket_15.pos = local304 * -1445626955;
							this.anInt4076 -= local304 - local205;
							continue label286;
						}
					}
					if (this.aPacket_15 != null) {
						this.anInt4078 = this.anInt4076;
						this.aPacket_15.pos += this.anInt4076 * -1445626955;
					}
					this.aBoolean705 = false;
					return;
				}
				this.aBoolean705 = false;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!hk", name = "eh", descriptor = "()V", line = 1005)
	synchronized void method27140() {
		@Pc(10) int local10 = this.aPacket_15 == null ? 0 : this.aPacket_15.pos * 212851357;
		@Pc(12) int local12 = 0;
		@Pc(16) Iterator local16 = this.aList17.iterator();
		@Pc(23) Packet local23;
		while (local16.hasNext()) {
			local23 = (Packet) local16.next();
			local12 += local23.pos * 212851357;
		}
		if (this.aPacket_15 == null) {
			this.aPacket_15 = this.method27155(local12);
			this.anInt4076 = 0;
			local10 = 0;
		} else if (this.aPacket_15.data.length - this.aPacket_15.pos * 212851357 < local12) {
			@Pc(53) Packet local53 = this.method27155(local12 + this.anInt4076);
			local53.pdata(this.aPacket_15.data, this.aPacket_15.pos * 212851357 - this.anInt4078, this.anInt4076, 2026842986);
			this.aPacket_15.release((byte) 1);
			this.aPacket_15 = local53;
			local10 = this.anInt4078;
		}
		local16 = this.aList17.iterator();
		while (local16.hasNext()) {
			local23 = (Packet) local16.next();
			this.aPacket_15.pdata(local23.data, 0, local23.pos * 212851357, 2026842986);
			this.anInt4076 += local23.pos * 212851357;
			local23.release((byte) 1);
		}
		this.aPacket_15.pos = (local10 - this.anInt4078) * -1445626955;
		this.anInt4078 = 0;
		this.aList17.clear();
		label286: while (true) {
			if (this.aBoolean705) {
				if (this.aPacket_15.pos * 212851357 < this.aPacket_15.data.length) {
					if (this.aBoolean704 && (float) (this.anInt4087 / this.method27055()) > this.aFloat285) {
						return;
					}
					if (this.aPacket_15 != null && this.anInt4076 >= 27) {
						@Pc(205) int local205 = this.aPacket_15.pos * 212851357;
						@Pc(207) byte local207 = 0;
						@Pc(209) int local209 = 0;
						if (!this.method27098(this.aPacket_15)) {
							return;
						}
						this.anInt4082++;
						if (this.anInt4081 < 0) {
							this.anInt4080++;
						}
						this.aList18.clear();
						this.aList19.clear();
						this.aPacket_15.g1((short) 16384);
						@Pc(246) int local246 = this.aPacket_15.g1((short) 16384);
						@Pc(278) int local278 = this.aPacket_15.g1((short) 16384) & 0xFF | (this.aPacket_15.g1((short) 16384) & 0xFF) << 8 | (this.aPacket_15.g1((short) 16384) & 0xFF) << 16 | this.aPacket_15.g1((short) 16384) << 24;
						@Pc(282) int local282 = local278 - local207;
						this.aPacket_15.pos += -1655194800;
						@Pc(294) int local294 = this.aPacket_15.g1((short) 16384);
						@Pc(300) int local300 = this.aPacket_15.pos * 212851357;
						@Pc(304) int local304 = local300 + local294;
						if (local304 > local205 + this.anInt4076) {
							this.aPacket_15.pos = (local205 + this.anInt4076) * -1445626955;
							this.anInt4078 = this.aPacket_15.pos * 212851357 - local205;
							this.aBoolean705 = false;
						}
						@Pc(333) int local333 = local304;
						@Pc(335) int local335 = 0;
						@Pc(352) int local352;
						if (this.aBoolean705) {
							for (@Pc(340) int local340 = 0; local340 < local294; local340++) {
								local352 = this.aPacket_15.data[local300++] & 0xFF;
								local304 += local352;
								local335 += local352;
								if (local304 > local205 + this.anInt4076) {
									this.aPacket_15.pos = (local205 + this.anInt4076) * -1445626955;
									this.anInt4078 = this.aPacket_15.pos * 212851357 - local205;
									this.aBoolean705 = false;
									break;
								}
								if (local352 < 255) {
									this.aList18.add(local333);
									this.aList19.add(local335);
									local333 = local304;
									local335 = 0;
								}
							}
						}
						if (!this.aBoolean705) {
							continue;
						}
						local352 = -1;
						@Pc(420) Iterator local420 = this.aList18.iterator();
						@Pc(424) Iterator local424 = this.aList19.iterator();
						@Pc(426) boolean local426 = false;
						this.anInt4086 = 0;
						while (true) {
							while (local420.hasNext()) {
								@Pc(436) Integer local436 = (Integer) local420.next();
								@Pc(440) Integer local440 = (Integer) local424.next();
								local352++;
								if (this.method27011() && this.aBoolean706 && this.anInt4082 < this.anInt4080 && local352 < this.anInt4081) {
									this.anInt4079 += local426 ? 0 : local282;
									local426 = true;
								} else {
									this.anAtomicReference1.set(null);
									@Pc(486) boolean local486 = this.method27131(this.aPacket_15.data, local436, local440, this.anAtomicReference1);
									@Pc(492) Class308[] local492 = (Class308[]) this.anAtomicReference1.get();
									if (!local486 || this.aBoolean706 && this.anInt4082 < this.anInt4080 && local352 < this.anInt4081) {
										if (this.method27011()) {
											this.anInt4068 = 0;
											if (this.aClass308Array1 == null || this.aClass308Array1 != null && (this.aClass308Array1.length != this.anInt4064 || this.aClass308Array1[0].anInt3947 != this.anInt4067)) {
												if (this.aClass308Array1 != null) {
													this.method27081(this.aClass308Array1);
												}
												this.aClass308Array1 = this.method27071(this.anInt4064, this.anInt4067);
											}
										}
									} else if (local492 != null) {
										@Pc(514) int local514 = local492[0].anInt3947;
										this.anInt4085 += local514;
										if (this.anInt4085 > local278 && local246 == 4) {
											this.anInt4086 = this.anInt4085 - local278 - this.anInt4086;
											local514 -= this.anInt4086;
											if (this.anInt4086 > local492[0].anInt3947) {
												this.anInt4086 = local492[0].anInt3947;
											}
											if (local514 < 0) {
												local514 = 0;
											}
										}
										@Pc(560) int local560 = 0;
										@Pc(567) int local567 = this.method27006(local514) * local492.length;
										@Pc(578) int local578;
										if (this.aBoolean706 && this.anInt4079 < this.anInt4090) {
											local578 = local567;
											local567 -= this.method27006(this.anInt4090 - this.anInt4079);
											if (local567 <= 0) {
												this.anInt4079 += this.method27050(local578);
												this.method27081(local492);
												local492 = null;
												continue;
											}
											local560 += this.anInt4090 - this.anInt4079;
										}
										if (this.anInt4079 + local514 > this.anInt4070 && (this.anInt4084 < this.anInt4083 || this.anInt4083 < 0) && this.aBoolean707) {
											local567 -= this.method27006(this.anInt4079 + local514 - this.anInt4070 - 1);
											if (local567 <= 0) {
												this.method27081(local492);
												local492 = null;
												continue;
											}
										}
										local578 = this.method27005();
										if (this.method27064() < this.method27005()) {
											@Pc(666) int local666 = this.method27005() - this.method27064();
											local567 += local567 / this.method27064() * local666;
										}
										@Pc(679) Packet local679 = this.method27155(local567);
										for (@Pc(681) int local681 = local560; local681 < local514; local681++) {
											@Pc(687) boolean local687 = this.aBoolean706;
											if (this.anInt4083 != 0) {
												if (this.anInt4079 == this.anInt4090) {
													if (this.anInt4074 < 0) {
														this.anInt4074 = this.anInt4077;
														this.anInt4081 = local352;
													}
													this.aBoolean706 = false;
												}
												if (this.anInt4079 == this.anInt4070 && this.anInt4088 < 0) {
													this.anInt4088 = this.anInt4077;
												}
												if (this.anInt4079 > this.anInt4070 && (this.anInt4084 < this.anInt4083 || this.anInt4083 < 0) && this.aBoolean707) {
													local687 = true;
												}
											}
											if (local687 && (this.anInt4079 < this.anInt4090 || this.anInt4079 > this.anInt4070)) {
												this.anInt4079++;
												local209++;
												if (local209 > local282) {
													throw new RuntimeException();
												}
											} else {
												for (@Pc(766) int local766 = 0; local766 < local578; local766++) {
													@Pc(780) float local780;
													if (local766 < local492.length) {
														local780 = local492[local766].aFloatArray103[local681];
													} else {
														local780 = local492[local766 % this.method27064()].aFloatArray103[local681];
													}
													@Pc(799) int local799;
													if (this.aClass433_1 == Class433.aClass433_3) {
														local799 = this.method27143(local780);
														if (this.aClass426_1 == Class426.aClass426_3) {
															local679.ip2(local799, -673462710);
														} else {
															local679.p2(local799, 2129349536);
														}
													} else if (this.aClass433_1 == Class433.aClass433_2) {
														local799 = this.method27144(local780);
														if (this.aClass426_1 == Class426.aClass426_3) {
															local679.ip2(local799, -2063974716);
														} else {
															local679.p2(local799, 2144521847);
														}
													} else if (this.aClass433_1 == Class433.aClass433_4) {
														local799 = this.method27147(local780);
														local679.p1(local799, (byte) -24);
													} else if (this.aClass433_1 == Class433.aClass433_5) {
														local799 = this.method27148(local780);
														local679.p1(local799, (byte) -128);
													}
												}
												this.anInt4079++;
												local209++;
											}
										}
										@Pc(875) List local875 = this.aList16;
										synchronized (this.aList16) {
											this.anInt4087 += this.method27050(local679.pos * 212851357) / this.method27005();
											this.aList16.add(local679);
										}
									}
									this.method27081(local492);
									local492 = null;
								}
							}
							this.aPacket_15.pos = local304 * -1445626955;
							this.anInt4076 -= local304 - local205;
							continue label286;
						}
					}
					if (this.aPacket_15 != null) {
						this.anInt4078 = this.anInt4076;
						this.aPacket_15.pos += this.anInt4076 * -1445626955;
					}
					this.aBoolean705 = false;
					return;
				}
				this.aBoolean705 = false;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!hk", name = "eq", descriptor = "()V", line = 1005)
	synchronized void method27141() {
		@Pc(10) int local10 = this.aPacket_15 == null ? 0 : this.aPacket_15.pos * 212851357;
		@Pc(12) int local12 = 0;
		@Pc(16) Iterator local16 = this.aList17.iterator();
		@Pc(23) Packet local23;
		while (local16.hasNext()) {
			local23 = (Packet) local16.next();
			local12 += local23.pos * 212851357;
		}
		if (this.aPacket_15 == null) {
			this.aPacket_15 = this.method27155(local12);
			this.anInt4076 = 0;
			local10 = 0;
		} else if (this.aPacket_15.data.length - this.aPacket_15.pos * 212851357 < local12) {
			@Pc(53) Packet local53 = this.method27155(local12 + this.anInt4076);
			local53.pdata(this.aPacket_15.data, this.aPacket_15.pos * 212851357 - this.anInt4078, this.anInt4076, 2026842986);
			this.aPacket_15.release((byte) 1);
			this.aPacket_15 = local53;
			local10 = this.anInt4078;
		}
		local16 = this.aList17.iterator();
		while (local16.hasNext()) {
			local23 = (Packet) local16.next();
			this.aPacket_15.pdata(local23.data, 0, local23.pos * 212851357, 2026842986);
			this.anInt4076 += local23.pos * 212851357;
			local23.release((byte) 1);
		}
		this.aPacket_15.pos = (local10 - this.anInt4078) * -1445626955;
		this.anInt4078 = 0;
		this.aList17.clear();
		label286: while (true) {
			if (this.aBoolean705) {
				if (this.aPacket_15.pos * 212851357 < this.aPacket_15.data.length) {
					if (this.aBoolean704 && (float) (this.anInt4087 / this.method27055()) > this.aFloat285) {
						return;
					}
					if (this.aPacket_15 != null && this.anInt4076 >= 27) {
						@Pc(205) int local205 = this.aPacket_15.pos * 212851357;
						@Pc(207) byte local207 = 0;
						@Pc(209) int local209 = 0;
						if (!this.method27098(this.aPacket_15)) {
							return;
						}
						this.anInt4082++;
						if (this.anInt4081 < 0) {
							this.anInt4080++;
						}
						this.aList18.clear();
						this.aList19.clear();
						this.aPacket_15.g1((short) 16384);
						@Pc(246) int local246 = this.aPacket_15.g1((short) 16384);
						@Pc(278) int local278 = this.aPacket_15.g1((short) 16384) & 0xFF | (this.aPacket_15.g1((short) 16384) & 0xFF) << 8 | (this.aPacket_15.g1((short) 16384) & 0xFF) << 16 | this.aPacket_15.g1((short) 16384) << 24;
						@Pc(282) int local282 = local278 - local207;
						this.aPacket_15.pos += -1655194800;
						@Pc(294) int local294 = this.aPacket_15.g1((short) 16384);
						@Pc(300) int local300 = this.aPacket_15.pos * 212851357;
						@Pc(304) int local304 = local300 + local294;
						if (local304 > local205 + this.anInt4076) {
							this.aPacket_15.pos = (local205 + this.anInt4076) * -1445626955;
							this.anInt4078 = this.aPacket_15.pos * 212851357 - local205;
							this.aBoolean705 = false;
						}
						@Pc(333) int local333 = local304;
						@Pc(335) int local335 = 0;
						@Pc(352) int local352;
						if (this.aBoolean705) {
							for (@Pc(340) int local340 = 0; local340 < local294; local340++) {
								local352 = this.aPacket_15.data[local300++] & 0xFF;
								local304 += local352;
								local335 += local352;
								if (local304 > local205 + this.anInt4076) {
									this.aPacket_15.pos = (local205 + this.anInt4076) * -1445626955;
									this.anInt4078 = this.aPacket_15.pos * 212851357 - local205;
									this.aBoolean705 = false;
									break;
								}
								if (local352 < 255) {
									this.aList18.add(local333);
									this.aList19.add(local335);
									local333 = local304;
									local335 = 0;
								}
							}
						}
						if (!this.aBoolean705) {
							continue;
						}
						local352 = -1;
						@Pc(420) Iterator local420 = this.aList18.iterator();
						@Pc(424) Iterator local424 = this.aList19.iterator();
						@Pc(426) boolean local426 = false;
						this.anInt4086 = 0;
						while (true) {
							while (local420.hasNext()) {
								@Pc(436) Integer local436 = (Integer) local420.next();
								@Pc(440) Integer local440 = (Integer) local424.next();
								local352++;
								if (this.method27011() && this.aBoolean706 && this.anInt4082 < this.anInt4080 && local352 < this.anInt4081) {
									this.anInt4079 += local426 ? 0 : local282;
									local426 = true;
								} else {
									this.anAtomicReference1.set(null);
									@Pc(486) boolean local486 = this.method27131(this.aPacket_15.data, local436, local440, this.anAtomicReference1);
									@Pc(492) Class308[] local492 = (Class308[]) this.anAtomicReference1.get();
									if (!local486 || this.aBoolean706 && this.anInt4082 < this.anInt4080 && local352 < this.anInt4081) {
										if (this.method27011()) {
											this.anInt4068 = 0;
											if (this.aClass308Array1 == null || this.aClass308Array1 != null && (this.aClass308Array1.length != this.anInt4064 || this.aClass308Array1[0].anInt3947 != this.anInt4067)) {
												if (this.aClass308Array1 != null) {
													this.method27081(this.aClass308Array1);
												}
												this.aClass308Array1 = this.method27071(this.anInt4064, this.anInt4067);
											}
										}
									} else if (local492 != null) {
										@Pc(514) int local514 = local492[0].anInt3947;
										this.anInt4085 += local514;
										if (this.anInt4085 > local278 && local246 == 4) {
											this.anInt4086 = this.anInt4085 - local278 - this.anInt4086;
											local514 -= this.anInt4086;
											if (this.anInt4086 > local492[0].anInt3947) {
												this.anInt4086 = local492[0].anInt3947;
											}
											if (local514 < 0) {
												local514 = 0;
											}
										}
										@Pc(560) int local560 = 0;
										@Pc(567) int local567 = this.method27006(local514) * local492.length;
										@Pc(578) int local578;
										if (this.aBoolean706 && this.anInt4079 < this.anInt4090) {
											local578 = local567;
											local567 -= this.method27006(this.anInt4090 - this.anInt4079);
											if (local567 <= 0) {
												this.anInt4079 += this.method27050(local578);
												this.method27081(local492);
												local492 = null;
												continue;
											}
											local560 += this.anInt4090 - this.anInt4079;
										}
										if (this.anInt4079 + local514 > this.anInt4070 && (this.anInt4084 < this.anInt4083 || this.anInt4083 < 0) && this.aBoolean707) {
											local567 -= this.method27006(this.anInt4079 + local514 - this.anInt4070 - 1);
											if (local567 <= 0) {
												this.method27081(local492);
												local492 = null;
												continue;
											}
										}
										local578 = this.method27005();
										if (this.method27064() < this.method27005()) {
											@Pc(666) int local666 = this.method27005() - this.method27064();
											local567 += local567 / this.method27064() * local666;
										}
										@Pc(679) Packet local679 = this.method27155(local567);
										for (@Pc(681) int local681 = local560; local681 < local514; local681++) {
											@Pc(687) boolean local687 = this.aBoolean706;
											if (this.anInt4083 != 0) {
												if (this.anInt4079 == this.anInt4090) {
													if (this.anInt4074 < 0) {
														this.anInt4074 = this.anInt4077;
														this.anInt4081 = local352;
													}
													this.aBoolean706 = false;
												}
												if (this.anInt4079 == this.anInt4070 && this.anInt4088 < 0) {
													this.anInt4088 = this.anInt4077;
												}
												if (this.anInt4079 > this.anInt4070 && (this.anInt4084 < this.anInt4083 || this.anInt4083 < 0) && this.aBoolean707) {
													local687 = true;
												}
											}
											if (local687 && (this.anInt4079 < this.anInt4090 || this.anInt4079 > this.anInt4070)) {
												this.anInt4079++;
												local209++;
												if (local209 > local282) {
													throw new RuntimeException();
												}
											} else {
												for (@Pc(766) int local766 = 0; local766 < local578; local766++) {
													@Pc(780) float local780;
													if (local766 < local492.length) {
														local780 = local492[local766].aFloatArray103[local681];
													} else {
														local780 = local492[local766 % this.method27064()].aFloatArray103[local681];
													}
													@Pc(799) int local799;
													if (this.aClass433_1 == Class433.aClass433_3) {
														local799 = this.method27143(local780);
														if (this.aClass426_1 == Class426.aClass426_3) {
															local679.ip2(local799, -1318826549);
														} else {
															local679.p2(local799, 2128322208);
														}
													} else if (this.aClass433_1 == Class433.aClass433_2) {
														local799 = this.method27144(local780);
														if (this.aClass426_1 == Class426.aClass426_3) {
															local679.ip2(local799, -1599476284);
														} else {
															local679.p2(local799, 2135066686);
														}
													} else if (this.aClass433_1 == Class433.aClass433_4) {
														local799 = this.method27147(local780);
														local679.p1(local799, (byte) -79);
													} else if (this.aClass433_1 == Class433.aClass433_5) {
														local799 = this.method27148(local780);
														local679.p1(local799, (byte) -120);
													}
												}
												this.anInt4079++;
												local209++;
											}
										}
										@Pc(875) List local875 = this.aList16;
										synchronized (this.aList16) {
											this.anInt4087 += this.method27050(local679.pos * 212851357) / this.method27005();
											this.aList16.add(local679);
										}
									}
									this.method27081(local492);
									local492 = null;
								}
							}
							this.aPacket_15.pos = local304 * -1445626955;
							this.anInt4076 -= local304 - local205;
							continue label286;
						}
					}
					if (this.aPacket_15 != null) {
						this.anInt4078 = this.anInt4076;
						this.aPacket_15.pos += this.anInt4076 * -1445626955;
					}
					this.aBoolean705 = false;
					return;
				}
				this.aBoolean705 = false;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!hk", name = "eg", descriptor = "(F)I", line = 1252)
	int method27142(@OriginalArg(0) float arg0) {
		@Pc(4) int local4 = (int) (arg0 * 32767.0F);
		if (local4 > 32767) {
			return 32767;
		} else if (local4 < -32768) {
			return -32768;
		} else {
			return local4;
		}
	}

	@OriginalMember(owner = "client!hk", name = "aj", descriptor = "(F)I", line = 1252)
	int method27143(@OriginalArg(0) float arg0) {
		@Pc(4) int local4 = (int) (arg0 * 32767.0F);
		if (local4 > 32767) {
			return 32767;
		} else if (local4 < -32768) {
			return -32768;
		} else {
			return local4;
		}
	}

	@OriginalMember(owner = "client!hk", name = "ay", descriptor = "(F)I", line = 1259)
	int method27144(@OriginalArg(0) float arg0) {
		@Pc(6) int local6 = (int) (arg0 * 32767.0F + 32768.0F);
		if (local6 > 65535) {
			return 65535;
		} else if (local6 < 0) {
			return 0;
		} else {
			return local6;
		}
	}

	@OriginalMember(owner = "client!hk", name = "ez", descriptor = "(F)I", line = 1259)
	int method27145(@OriginalArg(0) float arg0) {
		@Pc(6) int local6 = (int) (arg0 * 32767.0F + 32768.0F);
		if (local6 > 65535) {
			return 65535;
		} else if (local6 < 0) {
			return 0;
		} else {
			return local6;
		}
	}

	@OriginalMember(owner = "client!hk", name = "ef", descriptor = "(F)I", line = 1266)
	int method27146(@OriginalArg(0) float arg0) {
		@Pc(4) int local4 = (int) (arg0 * 127.0F);
		if (local4 > 127) {
			return 127;
		} else if (local4 < -128) {
			return -128;
		} else {
			return local4;
		}
	}

	@OriginalMember(owner = "client!hk", name = "ab", descriptor = "(F)I", line = 1266)
	int method27147(@OriginalArg(0) float arg0) {
		@Pc(4) int local4 = (int) (arg0 * 127.0F);
		if (local4 > 127) {
			return 127;
		} else if (local4 < -128) {
			return -128;
		} else {
			return local4;
		}
	}

	@OriginalMember(owner = "client!hk", name = "az", descriptor = "(F)I", line = 1273)
	int method27148(@OriginalArg(0) float arg0) {
		@Pc(6) int local6 = (int) (arg0 * 127.0F + 128.0F);
		if (local6 > 255) {
			return 255;
		} else if (local6 < 0) {
			return 0;
		} else {
			return local6;
		}
	}

	@OriginalMember(owner = "client!hk", name = "et", descriptor = "(F)I", line = 1273)
	int method27149(@OriginalArg(0) float arg0) {
		@Pc(6) int local6 = (int) (arg0 * 127.0F + 128.0F);
		if (local6 > 255) {
			return 255;
		} else if (local6 < 0) {
			return 0;
		} else {
			return local6;
		}
	}

	@OriginalMember(owner = "client!hk", name = "er", descriptor = "(I)Lclient!alw;", line = 1280)
    Packet method27150(@OriginalArg(0) int arg0) {
		@Pc(5) Packet local5 = this.method27155(this.method27006(arg0));
		@Pc(7) int local7 = arg0;
		@Pc(11) List local11 = this.aList16;
		synchronized (this.aList16) {
			while (!this.aList16.isEmpty()) {
				@Pc(22) Packet local22 = (Packet) this.aList16.remove(0);
				this.anInt4087 -= this.method27050(local22.pos * 212851357) / this.method27005();
				@Pc(40) int local40 = this.method27006(local7);
				@Pc(53) int local53 = local22.pos * 212851357 < local40 ? local22.pos * 212851357 : local40;
				local5.pdata(local22.data, 0, local53, 2026842986);
				local7 -= this.method27050(local53);
				@Pc(73) int local73 = local22.pos * 212851357 - local53;
				if (local73 == 0) {
					local22.release((byte) 1);
				} else {
					System.arraycopy(local22.data, local53, local22.data, 0, local73);
					local22.pos = local73 * -1445626955;
					this.anInt4087 += this.method27050(local73) / this.method27005();
					this.aList16.add(0, local22);
				}
				if (local7 <= 0) {
					break;
				}
			}
			if (this.aList16.isEmpty() && this.method27041() == Class413.aClass413_6) {
				this.method27054(Class413.aClass413_7);
			}
			return local5;
		}
	}

	@OriginalMember(owner = "client!hk", name = "aa", descriptor = "(I)Lclient!alw;", line = 1280)
    Packet method27151(@OriginalArg(0) int arg0) {
		@Pc(5) Packet local5 = this.method27155(this.method27006(arg0));
		@Pc(7) int local7 = arg0;
		@Pc(11) List local11 = this.aList16;
		synchronized (this.aList16) {
			while (!this.aList16.isEmpty()) {
				@Pc(22) Packet local22 = (Packet) this.aList16.remove(0);
				this.anInt4087 -= this.method27050(local22.pos * 212851357) / this.method27005();
				@Pc(40) int local40 = this.method27006(local7);
				@Pc(53) int local53 = local22.pos * 212851357 < local40 ? local22.pos * 212851357 : local40;
				local5.pdata(local22.data, 0, local53, 2026842986);
				local7 -= this.method27050(local53);
				@Pc(73) int local73 = local22.pos * 212851357 - local53;
				if (local73 == 0) {
					local22.release((byte) 1);
				} else {
					System.arraycopy(local22.data, local53, local22.data, 0, local73);
					local22.pos = local73 * -1445626955;
					this.anInt4087 += this.method27050(local73) / this.method27005();
					this.aList16.add(0, local22);
				}
				if (local7 <= 0) {
					break;
				}
			}
			if (this.aList16.isEmpty() && this.method27041() == Class413.aClass413_6) {
				this.method27054(Class413.aClass413_7);
			}
			return local5;
		}
	}

	@OriginalMember(owner = "client!hk", name = "ew", descriptor = "(I)Lclient!alw;", line = 1280)
    Packet method27152(@OriginalArg(0) int arg0) {
		@Pc(5) Packet local5 = this.method27155(this.method27006(arg0));
		@Pc(7) int local7 = arg0;
		@Pc(11) List local11 = this.aList16;
		synchronized (this.aList16) {
			while (!this.aList16.isEmpty()) {
				@Pc(22) Packet local22 = (Packet) this.aList16.remove(0);
				this.anInt4087 -= this.method27050(local22.pos * 212851357) / this.method27005();
				@Pc(40) int local40 = this.method27006(local7);
				@Pc(53) int local53 = local22.pos * 212851357 < local40 ? local22.pos * 212851357 : local40;
				local5.pdata(local22.data, 0, local53, 2026842986);
				local7 -= this.method27050(local53);
				@Pc(73) int local73 = local22.pos * 212851357 - local53;
				if (local73 == 0) {
					local22.release((byte) 1);
				} else {
					System.arraycopy(local22.data, local53, local22.data, 0, local73);
					local22.pos = local73 * -1445626955;
					this.anInt4087 += this.method27050(local73) / this.method27005();
					this.aList16.add(0, local22);
				}
				if (local7 <= 0) {
					break;
				}
			}
			if (this.aList16.isEmpty() && this.method27041() == Class413.aClass413_6) {
				this.method27054(Class413.aClass413_7);
			}
			return local5;
		}
	}

	@OriginalMember(owner = "client!hk", name = "ea", descriptor = "(I)Lclient!alw;", line = 1280)
    Packet method27153(@OriginalArg(0) int arg0) {
		@Pc(5) Packet local5 = this.method27155(this.method27006(arg0));
		@Pc(7) int local7 = arg0;
		@Pc(11) List local11 = this.aList16;
		synchronized (this.aList16) {
			while (!this.aList16.isEmpty()) {
				@Pc(22) Packet local22 = (Packet) this.aList16.remove(0);
				this.anInt4087 -= this.method27050(local22.pos * 212851357) / this.method27005();
				@Pc(40) int local40 = this.method27006(local7);
				@Pc(53) int local53 = local22.pos * 212851357 < local40 ? local22.pos * 212851357 : local40;
				local5.pdata(local22.data, 0, local53, 2026842986);
				local7 -= this.method27050(local53);
				@Pc(73) int local73 = local22.pos * 212851357 - local53;
				if (local73 == 0) {
					local22.release((byte) 1);
				} else {
					System.arraycopy(local22.data, local53, local22.data, 0, local73);
					local22.pos = local73 * -1445626955;
					this.anInt4087 += this.method27050(local73) / this.method27005();
					this.aList16.add(0, local22);
				}
				if (local7 <= 0) {
					break;
				}
			}
			if (this.aList16.isEmpty() && this.method27041() == Class413.aClass413_6) {
				this.method27054(Class413.aClass413_7);
			}
			return local5;
		}
	}

	@OriginalMember(owner = "client!hk", name = "en", descriptor = "(I)Lclient!alw;", line = 1308)
    Packet method27154(@OriginalArg(0) int arg0) {
		return new Packet(arg0, true);
	}

	@OriginalMember(owner = "client!hk", name = "af", descriptor = "(I)Lclient!alw;", line = 1308)
    Packet method27155(@OriginalArg(0) int arg0) {
		return new Packet(arg0, true);
	}

	@OriginalMember(owner = "client!hk", name = "eb", descriptor = "(I)Lclient!alw;", line = 1308)
    Packet method27156(@OriginalArg(0) int arg0) {
		return new Packet(arg0, true);
	}

	@OriginalMember(owner = "client!hk", name = "ak", descriptor = "()I", line = 1312)
	int method27157() {
		return this.anInt4087;
	}

	@OriginalMember(owner = "client!hk", name = "an", descriptor = "(ZIII)V", line = 1316)
	@Override
	public void method27013(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aBoolean707 = arg0;
		this.anInt4083 = arg1;
		this.anInt4090 = arg2;
		this.anInt4070 = arg3;
	}

	@OriginalMember(owner = "client!hk", name = "ex", descriptor = "(ZIII)V", line = 1316)
	@Override
	public void method27047(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aBoolean707 = arg0;
		this.anInt4083 = arg1;
		this.anInt4090 = arg2;
		this.anInt4070 = arg3;
	}

	@OriginalMember(owner = "client!hk", name = "fg", descriptor = "(ZIII)V", line = 1316)
	@Override
	public void method27048(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aBoolean707 = arg0;
		this.anInt4083 = arg1;
		this.anInt4090 = arg2;
		this.anInt4070 = arg3;
	}
}
