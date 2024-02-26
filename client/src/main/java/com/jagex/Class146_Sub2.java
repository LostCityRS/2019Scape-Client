package com.jagex;

import jaclib.nanotime.QueryPerformanceCounter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ajz")
public final class Class146_Sub2 extends Class146 {

	@OriginalMember(owner = "client!ajz", name = "t", descriptor = "J")
	long aLong76 = 0L;

	@OriginalMember(owner = "client!ajz", name = "f", descriptor = "J")
	long aLong74 = 0L;

	@OriginalMember(owner = "client!ajz", name = "e", descriptor = "J")
	long aLong75 = 0L;

	@OriginalMember(owner = "client!ajz", name = "u", descriptor = "[J")
	long[] aLongArray11 = new long[10];

	@OriginalMember(owner = "client!ajz", name = "l", descriptor = "I")
	int anInt1519 = 0;

	@OriginalMember(owner = "client!ajz", name = "g", descriptor = "I")
	int anInt1520 = -1348219867;

	@OriginalMember(owner = "client!ajz", name = "<init>", descriptor = "()V")
	Class146_Sub2() {
		this.aLong74 = (this.aLong76 = QueryPerformanceCounter.nanoTime() * -6310483353593038197L) * 2920883619168981441L;
		if (this.aLong76 * 405083417523838243L == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ajz", name = "k", descriptor = "(J)I")
	@Override
	int method13864(@OriginalArg(0) long arg0) {
		if (this.aLong74 * -381914546848538653L > this.aLong76 * 405083417523838243L) {
			this.aLong75 += this.aLong74 * -48277676895696897L - this.aLong76 * 4381209759651984959L;
			this.aLong76 += this.aLong74 * 9051734201833619009L - this.aLong76;
			this.aLong74 += arg0 * 6964589055072951755L;
			return 1;
		}
		@Pc(49) int local49 = 0;
		do {
			local49++;
			this.aLong74 += arg0 * 6964589055072951755L;
		} while (local49 < 10 && this.aLong74 * -381914546848538653L < this.aLong76 * 405083417523838243L);
		if (this.aLong74 * -381914546848538653L < this.aLong76 * 405083417523838243L) {
			this.aLong74 = this.aLong76 * 2920883619168981441L;
		}
		return local49;
	}

	@OriginalMember(owner = "client!ajz", name = "n", descriptor = "()J")
	long method13876() {
		@Pc(1) long local1 = QueryPerformanceCounter.nanoTime();
		@Pc(8) long local8 = local1 - this.aLong75 * 6566124049191143453L;
		this.aLong75 = local1 * -8448898152814413259L;
		if (local8 > -5000000000L && local8 < 5000000000L) {
			this.aLongArray11[this.anInt1519 * 28832843] = local8;
			this.anInt1519 = (this.anInt1519 * 28832843 + 1) % 10 * -113560221;
			if (this.anInt1520 * 909078445 < 1) {
				this.anInt1520 += -1348219867;
			}
		}
		@Pc(55) long local55 = 0L;
		for (@Pc(57) int local57 = 1; local57 <= this.anInt1520 * 909078445; local57++) {
			local55 += this.aLongArray11[(this.anInt1519 * 28832843 - local57 + 10) % 10];
		}
		return local55 / (long) (this.anInt1520 * 909078445);
	}

	@OriginalMember(owner = "client!ajz", name = "u", descriptor = "(B)J")
	@Override
	long method13857(@OriginalArg(0) byte arg0) {
		this.aLong76 += this.method13877((byte) -68) * -6310483353593038197L;
		return this.aLong74 * -381914546848538653L > this.aLong76 * 405083417523838243L ? (this.aLong74 * -381914546848538653L - this.aLong76 * 405083417523838243L) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!ajz", name = "l", descriptor = "(J)I")
	@Override
	int method13859(@OriginalArg(0) long arg0) {
		if (this.aLong74 * -381914546848538653L > this.aLong76 * 405083417523838243L) {
			this.aLong75 += this.aLong74 * -48277676895696897L - this.aLong76 * 4381209759651984959L;
			this.aLong76 += this.aLong74 * 9051734201833619009L - this.aLong76;
			this.aLong74 += arg0 * 6964589055072951755L;
			return 1;
		}
		@Pc(49) int local49 = 0;
		do {
			local49++;
			this.aLong74 += arg0 * 6964589055072951755L;
		} while (local49 < 10 && this.aLong74 * -381914546848538653L < this.aLong76 * 405083417523838243L);
		if (this.aLong74 * -381914546848538653L < this.aLong76 * 405083417523838243L) {
			this.aLong74 = this.aLong76 * 2920883619168981441L;
		}
		return local49;
	}

	@OriginalMember(owner = "client!ajz", name = "g", descriptor = "(B)J")
	@Override
	long method13858(@OriginalArg(0) byte arg0) {
		return this.aLong76 * 405083417523838243L;
	}

	@OriginalMember(owner = "client!ajz", name = "v", descriptor = "(B)J")
	long method13877(@OriginalArg(0) byte arg0) {
		@Pc(1) long local1 = QueryPerformanceCounter.nanoTime();
		@Pc(8) long local8 = local1 - this.aLong75 * 6566124049191143453L;
		this.aLong75 = local1 * -8448898152814413259L;
		if (local8 > -5000000000L && local8 < 5000000000L) {
			this.aLongArray11[this.anInt1519 * 28832843] = local8;
			this.anInt1519 = (this.anInt1519 * 28832843 + 1) % 10 * -113560221;
			if (this.anInt1520 * 909078445 < 1) {
				this.anInt1520 += -1348219867;
			}
		}
		@Pc(55) long local55 = 0L;
		for (@Pc(57) int local57 = 1; local57 <= this.anInt1520 * 909078445; local57++) {
			local55 += this.aLongArray11[(this.anInt1519 * 28832843 - local57 + 10) % 10];
		}
		return local55 / (long) (this.anInt1520 * 909078445);
	}

	@OriginalMember(owner = "client!ajz", name = "i", descriptor = "()V")
	@Override
	void method13870() {
		this.aLong75 = 0L;
		if (this.aLong74 * -381914546848538653L > this.aLong76 * 405083417523838243L) {
			this.aLong76 += this.aLong74 * 9051734201833619009L - this.aLong76;
		}
	}

	@OriginalMember(owner = "client!ajz", name = "m", descriptor = "()V")
	@Override
	void method13860() {
		this.aLong75 = 0L;
		if (this.aLong74 * -381914546848538653L > this.aLong76 * 405083417523838243L) {
			this.aLong76 += this.aLong74 * 9051734201833619009L - this.aLong76;
		}
	}

	@OriginalMember(owner = "client!ajz", name = "j", descriptor = "()J")
	@Override
	long method13856() {
		this.aLong76 += this.method13877((byte) -122) * -6310483353593038197L;
		return this.aLong74 * -381914546848538653L > this.aLong76 * 405083417523838243L ? (this.aLong74 * -381914546848538653L - this.aLong76 * 405083417523838243L) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!ajz", name = "y", descriptor = "()J")
	long method13878() {
		@Pc(1) long local1 = QueryPerformanceCounter.nanoTime();
		@Pc(8) long local8 = local1 - this.aLong75 * 6566124049191143453L;
		this.aLong75 = local1 * -8448898152814413259L;
		if (local8 > -5000000000L && local8 < 5000000000L) {
			this.aLongArray11[this.anInt1519 * 28832843] = local8;
			this.anInt1519 = (this.anInt1519 * 28832843 + 1) % 10 * -113560221;
			if (this.anInt1520 * 909078445 < 1) {
				this.anInt1520 += -1348219867;
			}
		}
		@Pc(55) long local55 = 0L;
		for (@Pc(57) int local57 = 1; local57 <= this.anInt1520 * 909078445; local57++) {
			local55 += this.aLongArray11[(this.anInt1519 * 28832843 - local57 + 10) % 10];
		}
		return local55 / (long) (this.anInt1520 * 909078445);
	}

	@OriginalMember(owner = "client!ajz", name = "s", descriptor = "()J")
	@Override
	long method13863() {
		this.aLong76 += this.method13877((byte) -51) * -6310483353593038197L;
		return this.aLong74 * -381914546848538653L > this.aLong76 * 405083417523838243L ? (this.aLong74 * -381914546848538653L - this.aLong76 * 405083417523838243L) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!ajz", name = "x", descriptor = "(J)I")
	@Override
	int method13865(@OriginalArg(0) long arg0) {
		if (this.aLong74 * -381914546848538653L > this.aLong76 * 405083417523838243L) {
			this.aLong75 += this.aLong74 * -48277676895696897L - this.aLong76 * 4381209759651984959L;
			this.aLong76 += this.aLong74 * 9051734201833619009L - this.aLong76;
			this.aLong74 += arg0 * 6964589055072951755L;
			return 1;
		}
		@Pc(49) int local49 = 0;
		do {
			local49++;
			this.aLong74 += arg0 * 6964589055072951755L;
		} while (local49 < 10 && this.aLong74 * -381914546848538653L < this.aLong76 * 405083417523838243L);
		if (this.aLong74 * -381914546848538653L < this.aLong76 * 405083417523838243L) {
			this.aLong74 = this.aLong76 * 2920883619168981441L;
		}
		return local49;
	}

	@OriginalMember(owner = "client!ajz", name = "a", descriptor = "()J")
	@Override
	long method13862() {
		this.aLong76 += this.method13877((byte) -80) * -6310483353593038197L;
		return this.aLong74 * -381914546848538653L > this.aLong76 * 405083417523838243L ? (this.aLong74 * -381914546848538653L - this.aLong76 * 405083417523838243L) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!ajz", name = "e", descriptor = "(B)V")
	@Override
	void method13855(@OriginalArg(0) byte arg0) {
		this.aLong75 = 0L;
		if (this.aLong74 * -381914546848538653L > this.aLong76 * 405083417523838243L) {
			this.aLong76 += this.aLong74 * 9051734201833619009L - this.aLong76;
		}
	}

	@OriginalMember(owner = "client!ajz", name = "r", descriptor = "()J")
	@Override
	long method13853() {
		return this.aLong76 * 405083417523838243L;
	}

	@OriginalMember(owner = "client!ajz", name = "w", descriptor = "()J")
	@Override
	long method13866() {
		return this.aLong76 * 405083417523838243L;
	}

	@OriginalMember(owner = "client!ajz", name = "o", descriptor = "()J")
	@Override
	long method13861() {
		this.aLong76 += this.method13877((byte) -18) * -6310483353593038197L;
		return this.aLong74 * -381914546848538653L > this.aLong76 * 405083417523838243L ? (this.aLong74 * -381914546848538653L - this.aLong76 * 405083417523838243L) / 1000000L : 0L;
	}
}
