package com.jagex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rw")
public class Class539 {

	@OriginalMember(owner = "client!rw", name = "v", descriptor = "F")
	float aFloat330;

	@OriginalMember(owner = "client!rw", name = "p", descriptor = "I")
	int anInt5281;

	@OriginalMember(owner = "client!rw", name = "l", descriptor = "Lclient!ox;")
	Class472 aClass472_63;

	@OriginalMember(owner = "client!rw", name = "z", descriptor = "Z")
	boolean aBoolean801;

	@OriginalMember(owner = "client!rw", name = "o", descriptor = "I")
	int anInt5282;

	@OriginalMember(owner = "client!rw", name = "s", descriptor = "Z")
	boolean aBoolean802;

	@OriginalMember(owner = "client!rw", name = "d", descriptor = "F")
	float aFloat331;

	@OriginalMember(owner = "client!rw", name = "c", descriptor = "Lclient!ro;")
	Interface58 anInterface58_6;

	@OriginalMember(owner = "client!rw", name = "r", descriptor = "F")
	float aFloat332;

	@OriginalMember(owner = "client!rw", name = "x", descriptor = "F")
	float aFloat333;

	@OriginalMember(owner = "client!rw", name = "n", descriptor = "Lclient!wr;")
	Interface70 anInterface70_1;

	@OriginalMember(owner = "client!rw", name = "u", descriptor = "I")
	int anInt5283;

	@OriginalMember(owner = "client!rw", name = "y", descriptor = "Ljava/lang/Object;")
	Object anObject25;

	@OriginalMember(owner = "client!rw", name = "w", descriptor = "Ljava/lang/Object;")
	Object anObject26;

	@OriginalMember(owner = "client!rw", name = "m", descriptor = "Lclient!rs;")
	Class536 aClass536_11 = Class536.aClass536_7;

	@OriginalMember(owner = "client!rw", name = "k", descriptor = "Z")
	boolean aBoolean800 = false;

	@OriginalMember(owner = "client!rw", name = "q", descriptor = "I")
	int anInt5284 = 0;

	@OriginalMember(owner = "client!rw", name = "e", descriptor = "Lclient!mt;")
	Class146 aClass146_3;

	@OriginalMember(owner = "client!rw", name = "f", descriptor = "Ljava/util/List;")
	List aList21;

	@OriginalMember(owner = "client!rw", name = "e", descriptor = "(I)[Lclient!gw;", line = 30)
	static Class302[] method30785(@OriginalArg(0) int arg0) {
		return new Class302[] { Class302.aClass302_16, Class302.aClass302_5, Class302.aClass302_1, Class302.aClass302_14, Class302.aClass302_10, Class302.aClass302_2, Class302.aClass302_18, Class302.aClass302_17, Class302.aClass302_4, Class302.aClass302_7, Class302.aClass302_9, Class302.aClass302_6, Class302.aClass302_3, Class302.aClass302_13, Class302.aClass302_15, Class302.aClass302_12, Class302.aClass302_8, Class302.aClass302_11 };
	}

	@OriginalMember(owner = "client!rw", name = "<init>", descriptor = "(Lclient!mt;)V", line = 33)
	public Class539(@OriginalArg(0) Class146 arg0) {
		this.aClass146_3 = arg0;
		this.aList21 = new ArrayList();
	}

	@OriginalMember(owner = "client!rw", name = "e", descriptor = "(I)V", line = 39)
	void method30786(@OriginalArg(0) int arg0) {
		this.anInterface70_1 = null;
		this.aClass536_11 = Class536.aClass536_7;
		this.aBoolean800 = false;
		this.aList21.clear();
		this.anObject26 = null;
		this.aClass472_63 = null;
		this.anInt5283 = -1720273925;
		this.aBoolean801 = false;
		this.anInt5281 = 0;
		this.aFloat331 = 0.0F;
		this.anInterface58_6 = null;
		this.aFloat332 = 0.0F;
		this.aFloat330 = 0.0F;
		this.anInt5282 = 0;
		this.aBoolean802 = false;
		this.anObject25 = null;
		this.anInt5284 = 0;
		this.aFloat333 = 1.0F;
	}

	@OriginalMember(owner = "client!rw", name = "ai", descriptor = "()V", line = 39)
	void method30787() {
		this.anInterface70_1 = null;
		this.aClass536_11 = Class536.aClass536_7;
		this.aBoolean800 = false;
		this.aList21.clear();
		this.anObject26 = null;
		this.aClass472_63 = null;
		this.anInt5283 = -1720273925;
		this.aBoolean801 = false;
		this.anInt5281 = 0;
		this.aFloat331 = 0.0F;
		this.anInterface58_6 = null;
		this.aFloat332 = 0.0F;
		this.aFloat330 = 0.0F;
		this.anInt5282 = 0;
		this.aBoolean802 = false;
		this.anObject25 = null;
		this.anInt5284 = 0;
		this.aFloat333 = 1.0F;
	}

	@OriginalMember(owner = "client!rw", name = "n", descriptor = "(Lclient!wr;I)V", line = 60)
	public void method30788(@OriginalArg(0) Interface70 arg0, @OriginalArg(1) int arg1) {
		this.anInterface70_1 = arg0;
		this.aFloat331 = 0.0F;
		this.aClass536_11 = Class536.aClass536_1;
	}

	@OriginalMember(owner = "client!rw", name = "aw", descriptor = "(Lclient!wr;)V", line = 60)
	public void method30789(@OriginalArg(0) Interface70 arg0) {
		this.anInterface70_1 = arg0;
		this.aFloat331 = 0.0F;
		this.aClass536_11 = Class536.aClass536_1;
	}

	@OriginalMember(owner = "client!rw", name = "as", descriptor = "(Lclient!wr;)V", line = 60)
	public void method30790(@OriginalArg(0) Interface70 arg0) {
		this.anInterface70_1 = arg0;
		this.aFloat331 = 0.0F;
		this.aClass536_11 = Class536.aClass536_1;
	}

	@OriginalMember(owner = "client!rw", name = "at", descriptor = "(Lclient!wr;)V", line = 60)
	public void method30791(@OriginalArg(0) Interface70 arg0) {
		this.anInterface70_1 = arg0;
		this.aFloat331 = 0.0F;
		this.aClass536_11 = Class536.aClass536_1;
	}

	@OriginalMember(owner = "client!rw", name = "am", descriptor = "(Lclient!wr;)V", line = 60)
	public void method30792(@OriginalArg(0) Interface70 arg0) {
		this.anInterface70_1 = arg0;
		this.aFloat331 = 0.0F;
		this.aClass536_11 = Class536.aClass536_1;
	}

	@OriginalMember(owner = "client!rw", name = "ad", descriptor = "(Lclient!wr;)V", line = 60)
	public void method30793(@OriginalArg(0) Interface70 arg0) {
		this.anInterface70_1 = arg0;
		this.aFloat331 = 0.0F;
		this.aClass536_11 = Class536.aClass536_1;
	}

	@OriginalMember(owner = "client!rw", name = "m", descriptor = "(I)V", line = 66)
	public void method30794(@OriginalArg(0) int arg0) {
		if (this.aClass536_11 != Class536.aClass536_2 && this.aClass536_11 != Class536.aClass536_8) {
			this.method30803(0, (byte) -44);
		}
		@Pc(15) Iterator local15 = this.aList21.iterator();
		while (local15.hasNext()) {
			@Pc(22) Class535 local22 = (Class535) local15.next();
			if (local22.method30746(-2087611449) == this) {
				local22.method30645((byte) 8);
			} else {
				local15.remove();
			}
		}
		this.method30786(806406106);
		this.aClass536_11 = Class536.aClass536_10;
	}

	@OriginalMember(owner = "client!rw", name = "au", descriptor = "()V", line = 66)
	public void method30795() {
		if (this.aClass536_11 != Class536.aClass536_2 && this.aClass536_11 != Class536.aClass536_8) {
			this.method30803(0, (byte) -30);
		}
		@Pc(15) Iterator local15 = this.aList21.iterator();
		while (local15.hasNext()) {
			@Pc(22) Class535 local22 = (Class535) local15.next();
			if (local22.method30746(-2087611449) == this) {
				local22.method30645((byte) 8);
			} else {
				local15.remove();
			}
		}
		this.method30786(512272026);
		this.aClass536_11 = Class536.aClass536_10;
	}

	@OriginalMember(owner = "client!rw", name = "ar", descriptor = "()V", line = 66)
	public void method30796() {
		if (this.aClass536_11 != Class536.aClass536_2 && this.aClass536_11 != Class536.aClass536_8) {
			this.method30803(0, (byte) -118);
		}
		@Pc(15) Iterator local15 = this.aList21.iterator();
		while (local15.hasNext()) {
			@Pc(22) Class535 local22 = (Class535) local15.next();
			if (local22.method30746(-2087611449) == this) {
				local22.method30645((byte) 8);
			} else {
				local15.remove();
			}
		}
		this.method30786(-649314036);
		this.aClass536_11 = Class536.aClass536_10;
	}

	@OriginalMember(owner = "client!rw", name = "k", descriptor = "(I)V", line = 83)
	public void method30797(@OriginalArg(0) int arg0) {
		if (!this.aBoolean800 && (this.aClass536_11 != Class536.aClass536_9 && Class536.aClass536_10 != this.aClass536_11 && Class536.aClass536_7 != this.aClass536_11 && this.aClass536_11 != Class536.aClass536_6 && (this.aClass536_11.anInt5277 * -621510697 <= Class536.aClass536_1.anInt5277 * -621510697 || this.aClass536_11.anInt5277 * -621510697 >= Class536.aClass536_2.anInt5277 * -621510697))) {
			this.aClass536_11 = Class536.aClass536_3;
		}
	}

	@OriginalMember(owner = "client!rw", name = "ap", descriptor = "()V", line = 83)
	public void method30798() {
		if (!this.aBoolean800 && (this.aClass536_11 != Class536.aClass536_9 && Class536.aClass536_10 != this.aClass536_11 && Class536.aClass536_7 != this.aClass536_11 && this.aClass536_11 != Class536.aClass536_6 && (this.aClass536_11.anInt5277 * -621510697 <= Class536.aClass536_1.anInt5277 * -621510697 || this.aClass536_11.anInt5277 * -621510697 >= Class536.aClass536_2.anInt5277 * -621510697))) {
			this.aClass536_11 = Class536.aClass536_3;
		}
	}

	@OriginalMember(owner = "client!rw", name = "aq", descriptor = "()V", line = 83)
	public void method30799() {
		if (!this.aBoolean800 && (this.aClass536_11 != Class536.aClass536_9 && Class536.aClass536_10 != this.aClass536_11 && Class536.aClass536_7 != this.aClass536_11 && this.aClass536_11 != Class536.aClass536_6 && (this.aClass536_11.anInt5277 * -621510697 <= Class536.aClass536_1.anInt5277 * -621510697 || this.aClass536_11.anInt5277 * -621510697 >= Class536.aClass536_2.anInt5277 * -621510697))) {
			this.aClass536_11 = Class536.aClass536_3;
		}
	}

	@OriginalMember(owner = "client!rw", name = "ax", descriptor = "()V", line = 94)
	public void method30800() {
		if (Class536.aClass536_9 == this.aClass536_11 || this.aClass536_11 == Class536.aClass536_10 || Class536.aClass536_7 == this.aClass536_11 || this.aClass536_11 == Class536.aClass536_6) {
			return;
		}
		if ((Class536.aClass536_3 == this.aClass536_11 || Class536.aClass536_4 == this.aClass536_11) && !this.aBoolean800) {
			this.aBoolean800 = true;
		} else if (this.aClass536_11.anInt5277 * -621510697 < Class536.aClass536_3.anInt5277 * -621510697 || this.aClass536_11.anInt5277 * -621510697 >= Class536.aClass536_2.anInt5277 * -621510697) {
			this.aClass536_11 = Class536.aClass536_3;
			this.aBoolean800 = true;
		}
	}

	@OriginalMember(owner = "client!rw", name = "av", descriptor = "()V", line = 94)
	public void method30801() {
		if (Class536.aClass536_9 == this.aClass536_11 || this.aClass536_11 == Class536.aClass536_10 || Class536.aClass536_7 == this.aClass536_11 || this.aClass536_11 == Class536.aClass536_6) {
			return;
		}
		if ((Class536.aClass536_3 == this.aClass536_11 || Class536.aClass536_4 == this.aClass536_11) && !this.aBoolean800) {
			this.aBoolean800 = true;
		} else if (this.aClass536_11.anInt5277 * -621510697 < Class536.aClass536_3.anInt5277 * -621510697 || this.aClass536_11.anInt5277 * -621510697 >= Class536.aClass536_2.anInt5277 * -621510697) {
			this.aClass536_11 = Class536.aClass536_3;
			this.aBoolean800 = true;
		}
	}

	@OriginalMember(owner = "client!rw", name = "f", descriptor = "(I)V", line = 94)
	public void method30802(@OriginalArg(0) int arg0) {
		if (Class536.aClass536_9 == this.aClass536_11 || this.aClass536_11 == Class536.aClass536_10 || Class536.aClass536_7 == this.aClass536_11 || this.aClass536_11 == Class536.aClass536_6) {
			return;
		}
		if ((Class536.aClass536_3 == this.aClass536_11 || Class536.aClass536_4 == this.aClass536_11) && !this.aBoolean800) {
			this.aBoolean800 = true;
		} else if (this.aClass536_11.anInt5277 * -621510697 < Class536.aClass536_3.anInt5277 * -621510697 || this.aClass536_11.anInt5277 * -621510697 >= Class536.aClass536_2.anInt5277 * -621510697) {
			this.aClass536_11 = Class536.aClass536_3;
			this.aBoolean800 = true;
		}
	}

	@OriginalMember(owner = "client!rw", name = "w", descriptor = "(IB)V", line = 109)
	public void method30803(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (this.aClass536_11.anInt5277 * -621510697 >= Class536.aClass536_2.anInt5277 * -621510697) {
			return;
		}
		if (this.aClass536_11.anInt5277 * -621510697 < Class536.aClass536_5.anInt5277 * -621510697) {
			this.aClass536_11 = Class536.aClass536_2;
			this.aBoolean800 = false;
			return;
		}
		@Pc(33) Iterator local33;
		@Pc(40) Class535 local40;
		if (arg0 > 0) {
			this.aClass536_11 = Class536.aClass536_6;
			local33 = this.aList21.iterator();
			while (local33.hasNext()) {
				local40 = (Class535) local33.next();
				if (local40.method30746(-2087611449) == this) {
					local40.method30649(0.0F, arg0, -37570847);
				} else {
					local33.remove();
				}
			}
			return;
		}
		local33 = this.aList21.iterator();
		while (local33.hasNext()) {
			local40 = (Class535) local33.next();
			if (local40.method30746(-2087611449) == this) {
				local40.method30664(-735234476);
			} else {
				local33.remove();
			}
		}
		this.aClass536_11 = Class536.aClass536_2;
		this.aBoolean800 = false;
	}

	@OriginalMember(owner = "client!rw", name = "ay", descriptor = "(I)V", line = 109)
	public void method30804(@OriginalArg(0) int arg0) {
		if (this.aClass536_11.anInt5277 * -621510697 >= Class536.aClass536_2.anInt5277 * -621510697) {
			return;
		}
		if (this.aClass536_11.anInt5277 * -621510697 < Class536.aClass536_5.anInt5277 * -621510697) {
			this.aClass536_11 = Class536.aClass536_2;
			this.aBoolean800 = false;
			return;
		}
		@Pc(33) Iterator local33;
		@Pc(40) Class535 local40;
		if (arg0 > 0) {
			this.aClass536_11 = Class536.aClass536_6;
			local33 = this.aList21.iterator();
			while (local33.hasNext()) {
				local40 = (Class535) local33.next();
				if (local40.method30746(-2087611449) == this) {
					local40.method30649(0.0F, arg0, -37570847);
				} else {
					local33.remove();
				}
			}
			return;
		}
		local33 = this.aList21.iterator();
		while (local33.hasNext()) {
			local40 = (Class535) local33.next();
			if (local40.method30746(-2087611449) == this) {
				local40.method30664(63813566);
			} else {
				local33.remove();
			}
		}
		this.aClass536_11 = Class536.aClass536_2;
		this.aBoolean800 = false;
	}

	@OriginalMember(owner = "client!rw", name = "ao", descriptor = "(I)V", line = 109)
	public void method30805(@OriginalArg(0) int arg0) {
		if (this.aClass536_11.anInt5277 * -621510697 >= Class536.aClass536_2.anInt5277 * -621510697) {
			return;
		}
		if (this.aClass536_11.anInt5277 * -621510697 < Class536.aClass536_5.anInt5277 * -621510697) {
			this.aClass536_11 = Class536.aClass536_2;
			this.aBoolean800 = false;
			return;
		}
		@Pc(33) Iterator local33;
		@Pc(40) Class535 local40;
		if (arg0 > 0) {
			this.aClass536_11 = Class536.aClass536_6;
			local33 = this.aList21.iterator();
			while (local33.hasNext()) {
				local40 = (Class535) local33.next();
				if (local40.method30746(-2087611449) == this) {
					local40.method30649(0.0F, arg0, -37570847);
				} else {
					local33.remove();
				}
			}
			return;
		}
		local33 = this.aList21.iterator();
		while (local33.hasNext()) {
			local40 = (Class535) local33.next();
			if (local40.method30746(-2087611449) == this) {
				local40.method30664(-934112303);
			} else {
				local33.remove();
			}
		}
		this.aClass536_11 = Class536.aClass536_2;
		this.aBoolean800 = false;
	}

	@OriginalMember(owner = "client!rw", name = "aj", descriptor = "(I)V", line = 109)
	public void method30806(@OriginalArg(0) int arg0) {
		if (this.aClass536_11.anInt5277 * -621510697 >= Class536.aClass536_2.anInt5277 * -621510697) {
			return;
		}
		if (this.aClass536_11.anInt5277 * -621510697 < Class536.aClass536_5.anInt5277 * -621510697) {
			this.aClass536_11 = Class536.aClass536_2;
			this.aBoolean800 = false;
			return;
		}
		@Pc(33) Iterator local33;
		@Pc(40) Class535 local40;
		if (arg0 > 0) {
			this.aClass536_11 = Class536.aClass536_6;
			local33 = this.aList21.iterator();
			while (local33.hasNext()) {
				local40 = (Class535) local33.next();
				if (local40.method30746(-2087611449) == this) {
					local40.method30649(0.0F, arg0, -37570847);
				} else {
					local33.remove();
				}
			}
			return;
		}
		local33 = this.aList21.iterator();
		while (local33.hasNext()) {
			local40 = (Class535) local33.next();
			if (local40.method30746(-2087611449) == this) {
				local40.method30664(-29123957);
			} else {
				local33.remove();
			}
		}
		this.aClass536_11 = Class536.aClass536_2;
		this.aBoolean800 = false;
	}

	@OriginalMember(owner = "client!rw", name = "l", descriptor = "(B)V", line = 145)
	public void method30807(@OriginalArg(0) byte arg0) {
		@Pc(3) Iterator local3 = this.aList21.iterator();
		this.aClass536_11 = Class536.aClass536_2;
		while (local3.hasNext()) {
			@Pc(13) Class535 local13 = (Class535) local3.next();
			if (local13.method30746(-2087611449) == this) {
				local13.method30706(1484348792);
			}
		}
	}

	@OriginalMember(owner = "client!rw", name = "ab", descriptor = "()V", line = 145)
	public void method30808() {
		@Pc(3) Iterator local3 = this.aList21.iterator();
		this.aClass536_11 = Class536.aClass536_2;
		while (local3.hasNext()) {
			@Pc(13) Class535 local13 = (Class535) local3.next();
			if (local13.method30746(-2087611449) == this) {
				local13.method30706(-2112218984);
			}
		}
	}

	@OriginalMember(owner = "client!rw", name = "aa", descriptor = "()V", line = 145)
	public void method30809() {
		@Pc(3) Iterator local3 = this.aList21.iterator();
		this.aClass536_11 = Class536.aClass536_2;
		while (local3.hasNext()) {
			@Pc(13) Class535 local13 = (Class535) local3.next();
			if (local13.method30746(-2087611449) == this) {
				local13.method30706(-509844590);
			}
		}
	}

	@OriginalMember(owner = "client!rw", name = "af", descriptor = "()V", line = 145)
	public void method30810() {
		@Pc(3) Iterator local3 = this.aList21.iterator();
		this.aClass536_11 = Class536.aClass536_2;
		while (local3.hasNext()) {
			@Pc(13) Class535 local13 = (Class535) local3.next();
			if (local13.method30746(-2087611449) == this) {
				local13.method30706(1213150922);
			}
		}
	}

	@OriginalMember(owner = "client!rw", name = "az", descriptor = "()V", line = 145)
	public void method30811() {
		@Pc(3) Iterator local3 = this.aList21.iterator();
		this.aClass536_11 = Class536.aClass536_2;
		while (local3.hasNext()) {
			@Pc(13) Class535 local13 = (Class535) local3.next();
			if (local13.method30746(-2087611449) == this) {
				local13.method30706(516326134);
			}
		}
	}

	@OriginalMember(owner = "client!rw", name = "u", descriptor = "(I)V", line = 154)
	public void method30812(@OriginalArg(0) int arg0) {
		@Pc(3) Iterator local3 = this.aList21.iterator();
		this.aClass536_11 = Class536.aClass536_3;
		while (local3.hasNext()) {
			@Pc(13) Class535 local13 = (Class535) local3.next();
			if (local13.method30746(-2087611449) == this) {
				local13.method30710(-764271943);
			}
		}
	}

	@OriginalMember(owner = "client!rw", name = "ak", descriptor = "()V", line = 154)
	public void method30813() {
		@Pc(3) Iterator local3 = this.aList21.iterator();
		this.aClass536_11 = Class536.aClass536_3;
		while (local3.hasNext()) {
			@Pc(13) Class535 local13 = (Class535) local3.next();
			if (local13.method30746(-2087611449) == this) {
				local13.method30710(-290048945);
			}
		}
	}

	@OriginalMember(owner = "client!rw", name = "an", descriptor = "()V", line = 154)
	public void method30814() {
		@Pc(3) Iterator local3 = this.aList21.iterator();
		this.aClass536_11 = Class536.aClass536_3;
		while (local3.hasNext()) {
			@Pc(13) Class535 local13 = (Class535) local3.next();
			if (local13.method30746(-2087611449) == this) {
				local13.method30710(-1475096021);
			}
		}
	}

	@OriginalMember(owner = "client!rw", name = "bf", descriptor = "()V", line = 154)
	public void method30815() {
		@Pc(3) Iterator local3 = this.aList21.iterator();
		this.aClass536_11 = Class536.aClass536_3;
		while (local3.hasNext()) {
			@Pc(13) Class535 local13 = (Class535) local3.next();
			if (local13.method30746(-2087611449) == this) {
				local13.method30710(-638183776);
			}
		}
	}

	@OriginalMember(owner = "client!rw", name = "z", descriptor = "(Lclient!ro;I)V", line = 163)
	public void method30816(@OriginalArg(0) Interface58 arg0, @OriginalArg(1) int arg1) {
		this.anInterface58_6 = arg0;
	}

	@OriginalMember(owner = "client!rw", name = "p", descriptor = "(B)V", line = 167)
	public void method30817(@OriginalArg(0) byte arg0) {
		if (this.aClass536_11 == Class536.aClass536_3) {
			@Pc(8) Class639 local8 = this.anInterface70_1.method32567(248045642);
			if (Class639.aClass639_3 == local8) {
				this.aClass536_11 = Class536.aClass536_4;
			}
		}
		@Pc(38) boolean local38;
		if (this.aClass536_11 == Class536.aClass536_4 && this.aBoolean800) {
			@Pc(31) Class535 local31 = this.aClass146_3.method11677(this.anInterface70_1.method32531(859157841), (byte) 19);
			if (local31 != null) {
				local38 = this.anInterface70_1.method32527(827202555);
				@Pc(43) Class518 local43 = new Class518(this);
				@Pc(84) boolean local84 = local31.method30656(local38 ? null : this.anInterface70_1.method32529(0, 1643894185), local38 ? local43 : null, this.anInt5283 * 1397727437, this.anInt5284 * 1084945595 > 0 ? 0.0F : this.aFloat331, false, this.aBoolean801, this.anInt5281 * 722478837, this.aFloat333, this, 1221408403);
				if (local84) {
					this.aClass536_11 = Class536.aClass536_5;
					local31.method30665(this.anInterface58_6, -1540719604);
					local31.method30649(this.aFloat331, this.anInt5284 * 1084945595, -37570847);
					local31.method30658(55935924);
					this.aList21.add(local31);
					this.aBoolean800 = false;
				} else {
					if (local31.method30631(-1945830439) == Class511.aClass511_8) {
						this.aClass536_11 = Class536.aClass536_8;
					}
					local31.method30645((byte) 8);
				}
			}
		}
		@Pc(131) Iterator local131 = this.aList21.iterator();
		local38 = true;
		while (true) {
			while (local131.hasNext()) {
				@Pc(140) Class535 local140 = (Class535) local131.next();
				if (local140.method30746(-2087611449) == this) {
					if (Class536.aClass536_6 == this.aClass536_11) {
						if (local140.method30654(700480837) == 0.0F) {
							local140.method30664(-26842720);
						} else {
							local38 = false;
						}
					}
					if (local140.method30641((byte) -12) || local140.method30640(-511245246)) {
						local140.method30645((byte) 8);
						local131.remove();
					} else {
						local38 = false;
					}
				} else {
					local131.remove();
				}
			}
			if (local38 && this.aClass536_11.anInt5277 * -621510697 >= Class536.aClass536_5.anInt5277 * -621510697 && this.aClass536_11.anInt5277 * -621510697 < Class536.aClass536_2.anInt5277 * -621510697) {
				if (Class536.aClass536_6 == this.aClass536_11) {
					this.aClass536_11 = Class536.aClass536_2;
				} else {
					this.aClass536_11 = Class536.aClass536_8;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!rw", name = "bl", descriptor = "()V", line = 167)
	public void method30818() {
		if (this.aClass536_11 == Class536.aClass536_3) {
			@Pc(8) Class639 local8 = this.anInterface70_1.method32567(1583897237);
			if (Class639.aClass639_3 == local8) {
				this.aClass536_11 = Class536.aClass536_4;
			}
		}
		@Pc(38) boolean local38;
		if (this.aClass536_11 == Class536.aClass536_4 && this.aBoolean800) {
			@Pc(31) Class535 local31 = this.aClass146_3.method11677(this.anInterface70_1.method32531(-873763613), (byte) 4);
			if (local31 != null) {
				local38 = this.anInterface70_1.method32527(1143490218);
				@Pc(43) Class518 local43 = new Class518(this);
				@Pc(84) boolean local84 = local31.method30656(local38 ? null : this.anInterface70_1.method32529(0, 751327781), local38 ? local43 : null, this.anInt5283 * 1397727437, this.anInt5284 * 1084945595 > 0 ? 0.0F : this.aFloat331, false, this.aBoolean801, this.anInt5281 * 722478837, this.aFloat333, this, 900697747);
				if (local84) {
					this.aClass536_11 = Class536.aClass536_5;
					local31.method30665(this.anInterface58_6, 389589187);
					local31.method30649(this.aFloat331, this.anInt5284 * 1084945595, -37570847);
					local31.method30658(-217573438);
					this.aList21.add(local31);
					this.aBoolean800 = false;
				} else {
					if (local31.method30631(-1697507842) == Class511.aClass511_8) {
						this.aClass536_11 = Class536.aClass536_8;
					}
					local31.method30645((byte) 8);
				}
			}
		}
		@Pc(131) Iterator local131 = this.aList21.iterator();
		local38 = true;
		while (true) {
			while (local131.hasNext()) {
				@Pc(140) Class535 local140 = (Class535) local131.next();
				if (local140.method30746(-2087611449) == this) {
					if (Class536.aClass536_6 == this.aClass536_11) {
						if (local140.method30654(-743503147) == 0.0F) {
							local140.method30664(-392961540);
						} else {
							local38 = false;
						}
					}
					if (local140.method30641((byte) 46) || local140.method30640(-511245246)) {
						local140.method30645((byte) 8);
						local131.remove();
					} else {
						local38 = false;
					}
				} else {
					local131.remove();
				}
			}
			if (local38 && this.aClass536_11.anInt5277 * -621510697 >= Class536.aClass536_5.anInt5277 * -621510697 && this.aClass536_11.anInt5277 * -621510697 < Class536.aClass536_2.anInt5277 * -621510697) {
				if (Class536.aClass536_6 == this.aClass536_11) {
					this.aClass536_11 = Class536.aClass536_2;
				} else {
					this.aClass536_11 = Class536.aClass536_8;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!rw", name = "bk", descriptor = "()V", line = 167)
	public void method30819() {
		if (this.aClass536_11 == Class536.aClass536_3) {
			@Pc(8) Class639 local8 = this.anInterface70_1.method32567(-965905303);
			if (Class639.aClass639_3 == local8) {
				this.aClass536_11 = Class536.aClass536_4;
			}
		}
		@Pc(38) boolean local38;
		if (this.aClass536_11 == Class536.aClass536_4 && this.aBoolean800) {
			@Pc(31) Class535 local31 = this.aClass146_3.method11677(this.anInterface70_1.method32531(1009769798), (byte) 116);
			if (local31 != null) {
				local38 = this.anInterface70_1.method32527(2045886865);
				@Pc(43) Class518 local43 = new Class518(this);
				@Pc(84) boolean local84 = local31.method30656(local38 ? null : this.anInterface70_1.method32529(0, 536926244), local38 ? local43 : null, this.anInt5283 * 1397727437, this.anInt5284 * 1084945595 > 0 ? 0.0F : this.aFloat331, false, this.aBoolean801, this.anInt5281 * 722478837, this.aFloat333, this, 1980668717);
				if (local84) {
					this.aClass536_11 = Class536.aClass536_5;
					local31.method30665(this.anInterface58_6, -1661705536);
					local31.method30649(this.aFloat331, this.anInt5284 * 1084945595, -37570847);
					local31.method30658(2102025745);
					this.aList21.add(local31);
					this.aBoolean800 = false;
				} else {
					if (local31.method30631(-1999226342) == Class511.aClass511_8) {
						this.aClass536_11 = Class536.aClass536_8;
					}
					local31.method30645((byte) 8);
				}
			}
		}
		@Pc(131) Iterator local131 = this.aList21.iterator();
		local38 = true;
		while (true) {
			while (local131.hasNext()) {
				@Pc(140) Class535 local140 = (Class535) local131.next();
				if (local140.method30746(-2087611449) == this) {
					if (Class536.aClass536_6 == this.aClass536_11) {
						if (local140.method30654(-2007417145) == 0.0F) {
							local140.method30664(-1094787234);
						} else {
							local38 = false;
						}
					}
					if (local140.method30641((byte) -25) || local140.method30640(-511245246)) {
						local140.method30645((byte) 8);
						local131.remove();
					} else {
						local38 = false;
					}
				} else {
					local131.remove();
				}
			}
			if (local38 && this.aClass536_11.anInt5277 * -621510697 >= Class536.aClass536_5.anInt5277 * -621510697 && this.aClass536_11.anInt5277 * -621510697 < Class536.aClass536_2.anInt5277 * -621510697) {
				if (Class536.aClass536_6 == this.aClass536_11) {
					this.aClass536_11 = Class536.aClass536_2;
				} else {
					this.aClass536_11 = Class536.aClass536_8;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!rw", name = "bh", descriptor = "()V", line = 167)
	public void method30820() {
		if (this.aClass536_11 == Class536.aClass536_3) {
			@Pc(8) Class639 local8 = this.anInterface70_1.method32567(-1867497882);
			if (Class639.aClass639_3 == local8) {
				this.aClass536_11 = Class536.aClass536_4;
			}
		}
		@Pc(38) boolean local38;
		if (this.aClass536_11 == Class536.aClass536_4 && this.aBoolean800) {
			@Pc(31) Class535 local31 = this.aClass146_3.method11677(this.anInterface70_1.method32531(1217178029), (byte) 57);
			if (local31 != null) {
				local38 = this.anInterface70_1.method32527(93896837);
				@Pc(43) Class518 local43 = new Class518(this);
				@Pc(84) boolean local84 = local31.method30656(local38 ? null : this.anInterface70_1.method32529(0, 750174722), local38 ? local43 : null, this.anInt5283 * 1397727437, this.anInt5284 * 1084945595 > 0 ? 0.0F : this.aFloat331, false, this.aBoolean801, this.anInt5281 * 722478837, this.aFloat333, this, 1325443871);
				if (local84) {
					this.aClass536_11 = Class536.aClass536_5;
					local31.method30665(this.anInterface58_6, -668552746);
					local31.method30649(this.aFloat331, this.anInt5284 * 1084945595, -37570847);
					local31.method30658(268925977);
					this.aList21.add(local31);
					this.aBoolean800 = false;
				} else {
					if (local31.method30631(-2020195530) == Class511.aClass511_8) {
						this.aClass536_11 = Class536.aClass536_8;
					}
					local31.method30645((byte) 8);
				}
			}
		}
		@Pc(131) Iterator local131 = this.aList21.iterator();
		local38 = true;
		while (true) {
			while (local131.hasNext()) {
				@Pc(140) Class535 local140 = (Class535) local131.next();
				if (local140.method30746(-2087611449) == this) {
					if (Class536.aClass536_6 == this.aClass536_11) {
						if (local140.method30654(-437375755) == 0.0F) {
							local140.method30664(-56427456);
						} else {
							local38 = false;
						}
					}
					if (local140.method30641((byte) 16) || local140.method30640(-511245246)) {
						local140.method30645((byte) 8);
						local131.remove();
					} else {
						local38 = false;
					}
				} else {
					local131.remove();
				}
			}
			if (local38 && this.aClass536_11.anInt5277 * -621510697 >= Class536.aClass536_5.anInt5277 * -621510697 && this.aClass536_11.anInt5277 * -621510697 < Class536.aClass536_2.anInt5277 * -621510697) {
				if (Class536.aClass536_6 == this.aClass536_11) {
					this.aClass536_11 = Class536.aClass536_2;
				} else {
					this.aClass536_11 = Class536.aClass536_8;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!rw", name = "d", descriptor = "(I)Lclient!rs;", line = 230)
	public Class536 method30821(@OriginalArg(0) int arg0) {
		return this.aClass536_11;
	}

	@OriginalMember(owner = "client!rw", name = "bx", descriptor = "()Lclient!rs;", line = 230)
	public Class536 method30822() {
		return this.aClass536_11;
	}

	@OriginalMember(owner = "client!rw", name = "bd", descriptor = "()Lclient!rs;", line = 230)
	public Class536 method30823() {
		return this.aClass536_11;
	}

	@OriginalMember(owner = "client!rw", name = "bi", descriptor = "(Ljava/lang/Object;)V", line = 234)
	public void method30824(@OriginalArg(0) Object arg0) {
		this.anObject26 = arg0;
	}

	@OriginalMember(owner = "client!rw", name = "bc", descriptor = "(Ljava/lang/Object;)V", line = 234)
	public void method30825(@OriginalArg(0) Object arg0) {
		this.anObject26 = arg0;
	}

	@OriginalMember(owner = "client!rw", name = "c", descriptor = "(Ljava/lang/Object;B)V", line = 234)
	public void method30826(@OriginalArg(0) Object arg0, @OriginalArg(1) byte arg1) {
		this.anObject26 = arg0;
	}

	@OriginalMember(owner = "client!rw", name = "bt", descriptor = "()Ljava/lang/Object;", line = 238)
	public Object method30827() {
		return this.anObject26;
	}

	@OriginalMember(owner = "client!rw", name = "r", descriptor = "(I)Ljava/lang/Object;", line = 238)
	public Object method30828(@OriginalArg(0) int arg0) {
		return this.anObject26;
	}

	@OriginalMember(owner = "client!rw", name = "bn", descriptor = "()Ljava/lang/Object;", line = 238)
	public Object method30829() {
		return this.anObject26;
	}

	@OriginalMember(owner = "client!rw", name = "bq", descriptor = "()Ljava/lang/Object;", line = 238)
	public Object method30830() {
		return this.anObject26;
	}

	@OriginalMember(owner = "client!rw", name = "v", descriptor = "(Ljava/lang/Object;I)V", line = 242)
	public void method30831(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		this.anObject25 = arg0;
	}

	@OriginalMember(owner = "client!rw", name = "bm", descriptor = "(Ljava/lang/Object;)V", line = 242)
	public void method30832(@OriginalArg(0) Object arg0) {
		this.anObject25 = arg0;
	}

	@OriginalMember(owner = "client!rw", name = "bb", descriptor = "(Ljava/lang/Object;)V", line = 242)
	public void method30833(@OriginalArg(0) Object arg0) {
		this.anObject25 = arg0;
	}

	@OriginalMember(owner = "client!rw", name = "be", descriptor = "()Ljava/lang/Object;", line = 246)
	public Object method30834() {
		return this.anObject25;
	}

	@OriginalMember(owner = "client!rw", name = "o", descriptor = "(I)Ljava/lang/Object;", line = 246)
	public Object method30835(@OriginalArg(0) int arg0) {
		return this.anObject25;
	}

	@OriginalMember(owner = "client!rw", name = "bu", descriptor = "()I", line = 250)
	public int method30836() {
		return this.anInt5283 * 1397727437;
	}

	@OriginalMember(owner = "client!rw", name = "s", descriptor = "(I)I", line = 250)
	public int method30837(@OriginalArg(0) int arg0) {
		return this.anInt5283 * 1397727437;
	}

	@OriginalMember(owner = "client!rw", name = "by", descriptor = "()I", line = 250)
	public int method30838() {
		return this.anInt5283 * 1397727437;
	}

	@OriginalMember(owner = "client!rw", name = "y", descriptor = "(IB)V", line = 254)
	public void method30839(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.anInt5283 = arg0 * 1720273925;
	}

	@OriginalMember(owner = "client!rw", name = "bw", descriptor = "(I)V", line = 254)
	public void method30840(@OriginalArg(0) int arg0) {
		this.anInt5283 = arg0 * 1720273925;
	}

	@OriginalMember(owner = "client!rw", name = "bo", descriptor = "(I)V", line = 254)
	public void method30841(@OriginalArg(0) int arg0) {
		this.anInt5283 = arg0 * 1720273925;
	}

	@OriginalMember(owner = "client!rw", name = "q", descriptor = "(ZB)V", line = 257)
	public void method30842(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte arg1) {
	}

	@OriginalMember(owner = "client!rw", name = "bz", descriptor = "(Z)V", line = 257)
	public void method30843(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!rw", name = "br", descriptor = "(Z)V", line = 257)
	public void method30844(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!rw", name = "bv", descriptor = "(Z)V", line = 257)
	public void method30845(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!rw", name = "x", descriptor = "(I)Lclient!wr;", line = 260)
	public Interface70 method30846(@OriginalArg(0) int arg0) {
		return this.anInterface70_1;
	}

	@OriginalMember(owner = "client!rw", name = "ba", descriptor = "()Lclient!wr;", line = 260)
	public Interface70 method30847() {
		return this.anInterface70_1;
	}

	@OriginalMember(owner = "client!rw", name = "bg", descriptor = "()Lclient!wr;", line = 260)
	public Interface70 method30848() {
		return this.anInterface70_1;
	}

	@OriginalMember(owner = "client!rw", name = "b", descriptor = "(Lclient!ox;I)V", line = 264)
	public void method30849(@OriginalArg(0) Class472 arg0, @OriginalArg(1) int arg1) {
		this.aClass472_63 = arg0;
	}

	@OriginalMember(owner = "client!rw", name = "bj", descriptor = "(Lclient!ox;)V", line = 264)
	public void method30850(@OriginalArg(0) Class472 arg0) {
		this.aClass472_63 = arg0;
	}

	@OriginalMember(owner = "client!rw", name = "bs", descriptor = "(Lclient!ox;)V", line = 264)
	public void method30851(@OriginalArg(0) Class472 arg0) {
		this.aClass472_63 = arg0;
	}

	@OriginalMember(owner = "client!rw", name = "cl", descriptor = "(Lclient!ox;)V", line = 264)
	public void method30852(@OriginalArg(0) Class472 arg0) {
		this.aClass472_63 = arg0;
	}

	@OriginalMember(owner = "client!rw", name = "bp", descriptor = "(Lclient!ox;)V", line = 264)
	public void method30853(@OriginalArg(0) Class472 arg0) {
		this.aClass472_63 = arg0;
	}

	@OriginalMember(owner = "client!rw", name = "h", descriptor = "(S)Lclient!ox;", line = 268)
	public Class472 method30854(@OriginalArg(0) short arg0) {
		return this.aClass472_63;
	}

	@OriginalMember(owner = "client!rw", name = "cg", descriptor = "()Lclient!ox;", line = 268)
	public Class472 method30855() {
		return this.aClass472_63;
	}

	@OriginalMember(owner = "client!rw", name = "ce", descriptor = "()Lclient!ox;", line = 268)
	public Class472 method30856() {
		return this.aClass472_63;
	}

	@OriginalMember(owner = "client!rw", name = "cu", descriptor = "()F", line = 272)
	public float method30857() {
		return this.aFloat332;
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(I)F", line = 272)
	public float method30858(@OriginalArg(0) int arg0) {
		return this.aFloat332;
	}

	@OriginalMember(owner = "client!rw", name = "ci", descriptor = "()F", line = 272)
	public float method30859() {
		return this.aFloat332;
	}

	@OriginalMember(owner = "client!rw", name = "g", descriptor = "(B)F", line = 276)
	public float method30860(@OriginalArg(0) byte arg0) {
		return this.aFloat330;
	}

	@OriginalMember(owner = "client!rw", name = "cn", descriptor = "()F", line = 276)
	public float method30861() {
		return this.aFloat330;
	}

	@OriginalMember(owner = "client!rw", name = "i", descriptor = "(FB)V", line = 280)
	public void method30862(@OriginalArg(0) float arg0, @OriginalArg(1) byte arg1) {
		this.aFloat332 = arg0;
	}

	@OriginalMember(owner = "client!rw", name = "cp", descriptor = "(F)V", line = 280)
	public void method30863(@OriginalArg(0) float arg0) {
		this.aFloat332 = arg0;
	}

	@OriginalMember(owner = "client!rw", name = "cv", descriptor = "(F)V", line = 280)
	public void method30864(@OriginalArg(0) float arg0) {
		this.aFloat332 = arg0;
	}

	@OriginalMember(owner = "client!rw", name = "ca", descriptor = "(F)V", line = 284)
	public void method30865(@OriginalArg(0) float arg0) {
		this.aFloat330 = arg0;
	}

	@OriginalMember(owner = "client!rw", name = "cx", descriptor = "(F)V", line = 284)
	public void method30866(@OriginalArg(0) float arg0) {
		this.aFloat330 = arg0;
	}

	@OriginalMember(owner = "client!rw", name = "j", descriptor = "(FB)V", line = 284)
	public void method30867(@OriginalArg(0) float arg0, @OriginalArg(1) byte arg1) {
		this.aFloat330 = arg0;
	}

	@OriginalMember(owner = "client!rw", name = "t", descriptor = "(IZB)V", line = 288)
	public void method30868(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte arg2) {
		this.aBoolean802 = arg1;
		this.anInt5282 = arg0 * -1497850955;
	}

	@OriginalMember(owner = "client!rw", name = "ae", descriptor = "(B)Z", line = 293)
	public boolean method30869(@OriginalArg(0) byte arg0) {
		this.aBoolean802 = false;
		return this.anInt5282 * 1064024733 != 0;
	}

	@OriginalMember(owner = "client!rw", name = "cw", descriptor = "()Z", line = 293)
	public boolean method30870() {
		this.aBoolean802 = false;
		return this.anInt5282 * 1064024733 != 0;
	}

	@OriginalMember(owner = "client!rw", name = "ct", descriptor = "()Z", line = 293)
	public boolean method30871() {
		this.aBoolean802 = false;
		return this.anInt5282 * 1064024733 != 0;
	}

	@OriginalMember(owner = "client!rw", name = "ag", descriptor = "(B)V", line = 298)
	public void method30872(@OriginalArg(0) byte arg0) {
		if (this.anInt5282 * 1064024733 > -1 && !this.aBoolean802) {
			this.anInt5282 -= -1497850955;
		}
		if (this.anInt5282 * 1064024733 == 0) {
			this.method30802(-892311472);
		}
	}

	@OriginalMember(owner = "client!rw", name = "ah", descriptor = "(FII)V", line = 303)
	public void method30873(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat331 = arg0;
		@Pc(4) int local4 = 0;
		@Pc(8) Iterator local8 = this.aList21.iterator();
		while (local8.hasNext()) {
			@Pc(15) Class535 local15 = (Class535) local8.next();
			if (local15.method30746(-2087611449) == this) {
				local15.method30649(this.aFloat331, arg1, -37570847);
				local4++;
			} else {
				this.aList21.remove(local15);
			}
		}
		if (local4 == 0) {
			this.anInt5284 = arg1 * 862138483;
		}
	}

	@OriginalMember(owner = "client!rw", name = "cf", descriptor = "(FI)V", line = 303)
	public void method30874(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1) {
		this.aFloat331 = arg0;
		@Pc(4) int local4 = 0;
		@Pc(8) Iterator local8 = this.aList21.iterator();
		while (local8.hasNext()) {
			@Pc(15) Class535 local15 = (Class535) local8.next();
			if (local15.method30746(-2087611449) == this) {
				local15.method30649(this.aFloat331, arg1, -37570847);
				local4++;
			} else {
				this.aList21.remove(local15);
			}
		}
		if (local4 == 0) {
			this.anInt5284 = arg1 * 862138483;
		}
	}

	@OriginalMember(owner = "client!rw", name = "co", descriptor = "(FI)V", line = 303)
	public void method30875(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1) {
		this.aFloat331 = arg0;
		@Pc(4) int local4 = 0;
		@Pc(8) Iterator local8 = this.aList21.iterator();
		while (local8.hasNext()) {
			@Pc(15) Class535 local15 = (Class535) local8.next();
			if (local15.method30746(-2087611449) == this) {
				local15.method30649(this.aFloat331, arg1, -37570847);
				local4++;
			} else {
				this.aList21.remove(local15);
			}
		}
		if (local4 == 0) {
			this.anInt5284 = arg1 * 862138483;
		}
	}

	@OriginalMember(owner = "client!rw", name = "cr", descriptor = "(FI)V", line = 303)
	public void method30876(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1) {
		this.aFloat331 = arg0;
		@Pc(4) int local4 = 0;
		@Pc(8) Iterator local8 = this.aList21.iterator();
		while (local8.hasNext()) {
			@Pc(15) Class535 local15 = (Class535) local8.next();
			if (local15.method30746(-2087611449) == this) {
				local15.method30649(this.aFloat331, arg1, -37570847);
				local4++;
			} else {
				this.aList21.remove(local15);
			}
		}
		if (local4 == 0) {
			this.anInt5284 = arg1 * 862138483;
		}
	}

	@OriginalMember(owner = "client!rw", name = "ch", descriptor = "(ZI)V", line = 322)
	public void method30877(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		this.aBoolean801 = arg0;
		this.anInt5281 = arg1 * 1557714269;
	}

	@OriginalMember(owner = "client!rw", name = "cm", descriptor = "(ZI)V", line = 322)
	public void method30878(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		this.aBoolean801 = arg0;
		this.anInt5281 = arg1 * 1557714269;
	}

	@OriginalMember(owner = "client!rw", name = "al", descriptor = "(ZIB)V", line = 322)
	public void method30879(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		this.aBoolean801 = arg0;
		this.anInt5281 = arg1 * 1557714269;
	}

	@OriginalMember(owner = "client!rw", name = "cq", descriptor = "(ZI)V", line = 322)
	public void method30880(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		this.aBoolean801 = arg0;
		this.anInt5281 = arg1 * 1557714269;
	}

	@OriginalMember(owner = "client!rw", name = "ac", descriptor = "(FI)V", line = 327)
	public void method30881(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1) {
		if (!(arg0 < 0.0F)) {
			this.aFloat333 = arg0;
		}
	}

	@OriginalMember(owner = "client!rw", name = "cb", descriptor = "(F)V", line = 327)
	public void method30882(@OriginalArg(0) float arg0) {
		if (!(arg0 < 0.0F)) {
			this.aFloat333 = arg0;
		}
	}

	@OriginalMember(owner = "client!rw", name = "hy", descriptor = "([[[Lclient!tk;IIIZI)Z", line = 4992)
	static final boolean method30883(@OriginalArg(0) Class572[][][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		@Pc(3) byte[][][] local3 = client.world.method30504((byte) -98);
		@Pc(14) byte local14 = arg4 ? 1 : (byte) (client.anInt3495 * 1815175593 & 0xFF);
		if (local14 == local3[Class512.anInt5209 * 1177442423][arg2][arg3]) {
			return false;
		}
		@Pc(31) Class520 local31 = client.world.method30487(-1466943068);
		if ((local31.aByteArrayArrayArray12[Class512.anInt5209 * 1177442423][arg2][arg3] & 0x4) == 0) {
			return false;
		}
		@Pc(49) byte local49 = 0;
		@Pc(51) int local51 = 0;
		client.anIntArray331[local49] = arg2;
		@Pc(58) int local58 = local49 + 1;
		client.anIntArray317[local49] = arg3;
		local3[Class512.anInt5209 * 1177442423][arg2][arg3] = local14;
		while (local51 != local58) {
			@Pc(79) int local79 = client.anIntArray331[local51] & 0xFFFF;
			@Pc(87) int local87 = client.anIntArray331[local51] >> 16 & 0xFF;
			@Pc(95) int local95 = client.anIntArray331[local51] >> 24 & 0xFF;
			@Pc(101) int local101 = client.anIntArray317[local51] & 0xFFFF;
			@Pc(109) int local109 = client.anIntArray317[local51] >> 16 & 0xFF;
			local51 = local51 + 1 & 0xFFF;
			@Pc(117) boolean local117 = false;
			if ((local31.aByteArrayArrayArray12[Class512.anInt5209 * 1177442423][local79][local101] & 0x4) == 0) {
				local117 = true;
			}
			@Pc(134) boolean local134 = false;
			@Pc(143) int local143;
			@Pc(186) int local186;
			@Pc(226) int local226;
			if (arg0 != null) {
				label240: for (local143 = Class512.anInt5209 * 1177442423 + 1; local143 <= 3; local143++) {
					if (arg0[local143] != null && (local31.aByteArrayArrayArray12[local143][local79][local101] & 0x8) == 0) {
						@Pc(318) Class132_Sub1_Sub1 local318;
						@Pc(328) int local328;
						@Pc(332) int local332;
						@Pc(343) int local343;
						@Pc(306) Class572 local306;
						@Pc(312) Class590 local312;
						if (local117 && arg0[local143][local79][local101] != null) {
							if (arg0[local143][local79][local101].aClass132_Sub1_Sub2_1 != null) {
								local186 = Class111.method6797(local87, -1392619295);
								if (arg0[local143][local79][local101].aClass132_Sub1_Sub2_1.aShort84 == local186 || arg0[local143][local79][local101].aClass132_Sub1_Sub2_2 != null && local186 == arg0[local143][local79][local101].aClass132_Sub1_Sub2_2.aShort84) {
									continue;
								}
								if (local95 != 0) {
									local226 = Class111.method6797(local95, -989909894);
									if (arg0[local143][local79][local101].aClass132_Sub1_Sub2_1.aShort84 == local226 || arg0[local143][local79][local101].aClass132_Sub1_Sub2_2 != null && local226 == arg0[local143][local79][local101].aClass132_Sub1_Sub2_2.aShort84) {
										continue;
									}
								}
								if (local109 != 0) {
									local226 = Class111.method6797(local109, 842116572);
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
				local143 = client.world.method30481(-1948542630).aClass99Array1[Class512.anInt5209 * 1177442423 + 1].method2480(local79, local101, -1740548441);
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
				if (local79 >= 1 && local14 != local3[Class512.anInt5209 * 1177442423][local79 - 1][local101]) {
					client.anIntArray331[local58] = local79 - 1 | 0x120000 | 0xD3000000;
					client.anIntArray317[local58] = local101 | 0x130000;
					local58 = local58 + 1 & 0xFFF;
					local3[Class512.anInt5209 * 1177442423][local79 - 1][local101] = local14;
				}
				local101++;
				if (local101 < client.world.method30466((short) 128)) {
					if (local79 - 1 >= 0 && local14 != local3[Class512.anInt5209 * 1177442423][local79 - 1][local101] && (local31.aByteArrayArrayArray12[Class512.anInt5209 * 1177442423][local79][local101] & 0x4) == 0 && (local31.aByteArrayArrayArray12[Class512.anInt5209 * 1177442423][local79 - 1][local101 - 1] & 0x4) == 0) {
						client.anIntArray331[local58] = local79 - 1 | 0x120000 | 0x52000000;
						client.anIntArray317[local58] = local101 | 0x130000;
						local58 = local58 + 1 & 0xFFF;
						local3[Class512.anInt5209 * 1177442423][local79 - 1][local101] = local14;
					}
					if (local3[Class512.anInt5209 * 1177442423][local79][local101] != local14) {
						client.anIntArray331[local58] = local79 | 0x520000 | 0x13000000;
						client.anIntArray317[local58] = local101 | 0x530000;
						local58 = local58 + 1 & 0xFFF;
						local3[Class512.anInt5209 * 1177442423][local79][local101] = local14;
					}
					if (local79 + 1 < client.world.method30459(1277779931) && local14 != local3[Class512.anInt5209 * 1177442423][local79 + 1][local101] && (local31.aByteArrayArrayArray12[Class512.anInt5209 * 1177442423][local79][local101] & 0x4) == 0 && (local31.aByteArrayArrayArray12[Class512.anInt5209 * 1177442423][local79 + 1][local101 - 1] & 0x4) == 0) {
						client.anIntArray331[local58] = local79 + 1 | 0x520000 | 0x92000000;
						client.anIntArray317[local58] = local101 | 0x530000;
						local58 = local58 + 1 & 0xFFF;
						local3[Class512.anInt5209 * 1177442423][local79 + 1][local101] = local14;
					}
				}
				local101--;
				if (local79 + 1 < client.world.method30459(139032878) && local14 != local3[Class512.anInt5209 * 1177442423][local79 + 1][local101]) {
					client.anIntArray331[local58] = local79 + 1 | 0x920000 | 0x53000000;
					client.anIntArray317[local58] = local101 | 0x930000;
					local58 = local58 + 1 & 0xFFF;
					local3[Class512.anInt5209 * 1177442423][local79 + 1][local101] = local14;
				}
				local101--;
				if (local101 >= 0) {
					if (local79 - 1 >= 0 && local14 != local3[Class512.anInt5209 * 1177442423][local79 - 1][local101] && (local31.aByteArrayArrayArray12[Class512.anInt5209 * 1177442423][local79][local101] & 0x4) == 0 && (local31.aByteArrayArrayArray12[Class512.anInt5209 * 1177442423][local79 - 1][local101 + 1] & 0x4) == 0) {
						client.anIntArray331[local58] = local79 - 1 | 0xD20000 | 0x12000000;
						client.anIntArray317[local58] = local101 | 0xD30000;
						local58 = local58 + 1 & 0xFFF;
						local3[Class512.anInt5209 * 1177442423][local79 - 1][local101] = local14;
					}
					if (local14 != local3[Class512.anInt5209 * 1177442423][local79][local101]) {
						client.anIntArray331[local58] = local79 | 0xD20000 | 0x93000000;
						client.anIntArray317[local58] = local101 | 0xD30000;
						local58 = local58 + 1 & 0xFFF;
						local3[Class512.anInt5209 * 1177442423][local79][local101] = local14;
					}
					if (local79 + 1 < client.world.method30459(330584158) && local3[Class512.anInt5209 * 1177442423][local79 + 1][local101] != local14 && (local31.aByteArrayArrayArray12[Class512.anInt5209 * 1177442423][local79][local101] & 0x4) == 0 && (local31.aByteArrayArrayArray12[Class512.anInt5209 * 1177442423][local79 + 1][local101 + 1] & 0x4) == 0) {
						client.anIntArray331[local58] = local79 + 1 | 0x920000 | 0xD2000000;
						client.anIntArray317[local58] = local101 | 0x930000;
						local58 = local58 + 1 & 0xFFF;
						local3[Class512.anInt5209 * 1177442423][local79 + 1][local101] = local14;
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
}
