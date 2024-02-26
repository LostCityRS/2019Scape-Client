package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ajh")
public final class Class146_Sub1 extends Class146 {

	@OriginalMember(owner = "client!ajh", name = "t", descriptor = "J")
	long aLong59 = 0L;

	@OriginalMember(owner = "client!ajh", name = "f", descriptor = "J")
	long aLong58 = 0L;

	@OriginalMember(owner = "client!ajh", name = "e", descriptor = "J")
	long aLong60 = 0L;

	@OriginalMember(owner = "client!ajh", name = "u", descriptor = "[J")
	long[] aLongArray10 = new long[10];

	@OriginalMember(owner = "client!ajh", name = "l", descriptor = "I")
	int anInt1443 = 0;

	@OriginalMember(owner = "client!ajh", name = "g", descriptor = "I")
	int anInt1444 = 1561072959;

	@OriginalMember(owner = "client!ajh", name = "<init>", descriptor = "()V")
	Class146_Sub1() {
		this.aLong59 = System.nanoTime() * -7774000983923228843L;
		this.aLong58 = System.nanoTime() * 5014745771939662459L;
	}

	@OriginalMember(owner = "client!ajh", name = "w", descriptor = "()J")
	@Override
	long method13866() {
		return this.aLong59 * -738951968080525827L;
	}

	@OriginalMember(owner = "client!ajh", name = "n", descriptor = "()J")
	long method13086() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(8) long local8 = local1 - this.aLong60 * -251229116046227681L;
		this.aLong60 = local1 * -2702283641573837601L;
		if (local8 > -5000000000L && local8 < 5000000000L) {
			this.aLongArray10[this.anInt1443 * 1130418967] = local8;
			this.anInt1443 = (this.anInt1443 * 1130418967 + 1) % 10 * 549164199;
			if (this.anInt1444 * 1987861183 < 1) {
				this.anInt1444 += 1561072959;
			}
		}
		@Pc(55) long local55 = 0L;
		for (@Pc(57) int local57 = 1; local57 <= this.anInt1444 * 1987861183; local57++) {
			local55 += this.aLongArray10[(this.anInt1443 * 1130418967 - local57 + 10) % 10];
		}
		return local55 / (long) (this.anInt1444 * 1987861183);
	}

	@OriginalMember(owner = "client!ajh", name = "u", descriptor = "(B)J")
	@Override
	long method13857(@OriginalArg(0) byte arg0) {
		this.aLong59 += this.method13087((short) 16605) * -7774000983923228843L;
		return this.aLong58 * -2641810171629845325L > this.aLong59 * -738951968080525827L ? (this.aLong58 * -2641810171629845325L - this.aLong59 * -738951968080525827L) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!ajh", name = "e", descriptor = "(B)V")
	@Override
	void method13855(@OriginalArg(0) byte arg0) {
		this.aLong60 = 0L;
		if (this.aLong58 * -2641810171629845325L > this.aLong59 * -738951968080525827L) {
			this.aLong59 += this.aLong58 * 3849037236175314031L - this.aLong59;
		}
	}

	@OriginalMember(owner = "client!ajh", name = "m", descriptor = "()V")
	@Override
	void method13860() {
		this.aLong60 = 0L;
		if (this.aLong58 * -2641810171629845325L > this.aLong59 * -738951968080525827L) {
			this.aLong59 += this.aLong58 * 3849037236175314031L - this.aLong59;
		}
	}

	@OriginalMember(owner = "client!ajh", name = "k", descriptor = "(J)I")
	@Override
	int method13864(@OriginalArg(0) long arg0) {
		if (this.aLong58 * -2641810171629845325L > this.aLong59 * -738951968080525827L) {
			this.aLong60 += this.aLong58 * -5583188149306395667L - this.aLong59 * 2515486509597186915L;
			this.aLong59 += this.aLong58 * 3849037236175314031L - this.aLong59;
			this.aLong58 += arg0 * 5014745771939662459L;
			return 1;
		}
		@Pc(49) int local49 = 0;
		do {
			local49++;
			this.aLong58 += arg0 * 5014745771939662459L;
		} while (local49 < 10 && this.aLong58 * -2641810171629845325L < this.aLong59 * -738951968080525827L);
		if (this.aLong58 * -2641810171629845325L < this.aLong59 * -738951968080525827L) {
			this.aLong58 = this.aLong59 * 6893597871376024207L;
		}
		return local49;
	}

	@OriginalMember(owner = "client!ajh", name = "i", descriptor = "()V")
	@Override
	void method13870() {
		this.aLong60 = 0L;
		if (this.aLong58 * -2641810171629845325L > this.aLong59 * -738951968080525827L) {
			this.aLong59 += this.aLong58 * 3849037236175314031L - this.aLong59;
		}
	}

	@OriginalMember(owner = "client!ajh", name = "o", descriptor = "()J")
	@Override
	long method13861() {
		this.aLong59 += this.method13087((short) 2866) * -7774000983923228843L;
		return this.aLong58 * -2641810171629845325L > this.aLong59 * -738951968080525827L ? (this.aLong58 * -2641810171629845325L - this.aLong59 * -738951968080525827L) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!ajh", name = "l", descriptor = "(J)I")
	@Override
	int method13859(@OriginalArg(0) long arg0) {
		if (this.aLong58 * -2641810171629845325L > this.aLong59 * -738951968080525827L) {
			this.aLong60 += this.aLong58 * -5583188149306395667L - this.aLong59 * 2515486509597186915L;
			this.aLong59 += this.aLong58 * 3849037236175314031L - this.aLong59;
			this.aLong58 += arg0 * 5014745771939662459L;
			return 1;
		}
		@Pc(49) int local49 = 0;
		do {
			local49++;
			this.aLong58 += arg0 * 5014745771939662459L;
		} while (local49 < 10 && this.aLong58 * -2641810171629845325L < this.aLong59 * -738951968080525827L);
		if (this.aLong58 * -2641810171629845325L < this.aLong59 * -738951968080525827L) {
			this.aLong58 = this.aLong59 * 6893597871376024207L;
		}
		return local49;
	}

	@OriginalMember(owner = "client!ajh", name = "a", descriptor = "()J")
	@Override
	long method13862() {
		this.aLong59 += this.method13087((short) 8963) * -7774000983923228843L;
		return this.aLong58 * -2641810171629845325L > this.aLong59 * -738951968080525827L ? (this.aLong58 * -2641810171629845325L - this.aLong59 * -738951968080525827L) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!ajh", name = "s", descriptor = "()J")
	@Override
	long method13863() {
		this.aLong59 += this.method13087((short) 9171) * -7774000983923228843L;
		return this.aLong58 * -2641810171629845325L > this.aLong59 * -738951968080525827L ? (this.aLong58 * -2641810171629845325L - this.aLong59 * -738951968080525827L) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!ajh", name = "g", descriptor = "(B)J")
	@Override
	long method13858(@OriginalArg(0) byte arg0) {
		return this.aLong59 * -738951968080525827L;
	}

	@OriginalMember(owner = "client!ajh", name = "x", descriptor = "(J)I")
	@Override
	int method13865(@OriginalArg(0) long arg0) {
		if (this.aLong58 * -2641810171629845325L > this.aLong59 * -738951968080525827L) {
			this.aLong60 += this.aLong58 * -5583188149306395667L - this.aLong59 * 2515486509597186915L;
			this.aLong59 += this.aLong58 * 3849037236175314031L - this.aLong59;
			this.aLong58 += arg0 * 5014745771939662459L;
			return 1;
		}
		@Pc(49) int local49 = 0;
		do {
			local49++;
			this.aLong58 += arg0 * 5014745771939662459L;
		} while (local49 < 10 && this.aLong58 * -2641810171629845325L < this.aLong59 * -738951968080525827L);
		if (this.aLong58 * -2641810171629845325L < this.aLong59 * -738951968080525827L) {
			this.aLong58 = this.aLong59 * 6893597871376024207L;
		}
		return local49;
	}

	@OriginalMember(owner = "client!ajh", name = "v", descriptor = "(S)J")
	long method13087(@OriginalArg(0) short arg0) {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(8) long local8 = local1 - this.aLong60 * -251229116046227681L;
		this.aLong60 = local1 * -2702283641573837601L;
		if (local8 > -5000000000L && local8 < 5000000000L) {
			this.aLongArray10[this.anInt1443 * 1130418967] = local8;
			this.anInt1443 = (this.anInt1443 * 1130418967 + 1) % 10 * 549164199;
			if (this.anInt1444 * 1987861183 < 1) {
				this.anInt1444 += 1561072959;
			}
		}
		@Pc(55) long local55 = 0L;
		for (@Pc(57) int local57 = 1; local57 <= this.anInt1444 * 1987861183; local57++) {
			local55 += this.aLongArray10[(this.anInt1443 * 1130418967 - local57 + 10) % 10];
		}
		return local55 / (long) (this.anInt1444 * 1987861183);
	}

	@OriginalMember(owner = "client!ajh", name = "r", descriptor = "()J")
	@Override
	long method13853() {
		return this.aLong59 * -738951968080525827L;
	}

	@OriginalMember(owner = "client!ajh", name = "y", descriptor = "()J")
	long method13088() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(8) long local8 = local1 - this.aLong60 * -251229116046227681L;
		this.aLong60 = local1 * -2702283641573837601L;
		if (local8 > -5000000000L && local8 < 5000000000L) {
			this.aLongArray10[this.anInt1443 * 1130418967] = local8;
			this.anInt1443 = (this.anInt1443 * 1130418967 + 1) % 10 * 549164199;
			if (this.anInt1444 * 1987861183 < 1) {
				this.anInt1444 += 1561072959;
			}
		}
		@Pc(55) long local55 = 0L;
		for (@Pc(57) int local57 = 1; local57 <= this.anInt1444 * 1987861183; local57++) {
			local55 += this.aLongArray10[(this.anInt1443 * 1130418967 - local57 + 10) % 10];
		}
		return local55 / (long) (this.anInt1444 * 1987861183);
	}

	@OriginalMember(owner = "client!ajh", name = "j", descriptor = "()J")
	@Override
	long method13856() {
		this.aLong59 += this.method13087((short) 8137) * -7774000983923228843L;
		return this.aLong58 * -2641810171629845325L > this.aLong59 * -738951968080525827L ? (this.aLong58 * -2641810171629845325L - this.aLong59 * -738951968080525827L) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!ajh", name = "c", descriptor = "()J")
	long method13089() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(8) long local8 = local1 - this.aLong60 * -251229116046227681L;
		this.aLong60 = local1 * -2702283641573837601L;
		if (local8 > -5000000000L && local8 < 5000000000L) {
			this.aLongArray10[this.anInt1443 * 1130418967] = local8;
			this.anInt1443 = (this.anInt1443 * 1130418967 + 1) % 10 * 549164199;
			if (this.anInt1444 * 1987861183 < 1) {
				this.anInt1444 += 1561072959;
			}
		}
		@Pc(55) long local55 = 0L;
		for (@Pc(57) int local57 = 1; local57 <= this.anInt1444 * 1987861183; local57++) {
			local55 += this.aLongArray10[(this.anInt1443 * 1130418967 - local57 + 10) % 10];
		}
		return local55 / (long) (this.anInt1444 * 1987861183);
	}
}
