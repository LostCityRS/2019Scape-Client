package jagex3;

import jaclib.nanotime.QueryPerformanceCounter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ajp")
public final class Class147_Sub2 extends Class147 {

	@OriginalMember(owner = "client!ajp", name = "e", descriptor = "J")
	long aLong59 = 0L;

	@OriginalMember(owner = "client!ajp", name = "n", descriptor = "J")
	long aLong60 = 0L;

	@OriginalMember(owner = "client!ajp", name = "m", descriptor = "J")
	long aLong58 = 0L;

	@OriginalMember(owner = "client!ajp", name = "k", descriptor = "[J")
	long[] aLongArray11 = new long[10];

	@OriginalMember(owner = "client!ajp", name = "f", descriptor = "I")
	int anInt1446 = 0;

	@OriginalMember(owner = "client!ajp", name = "w", descriptor = "I")
	int anInt1445 = 1035713869;

	@OriginalMember(owner = "client!ajp", name = "<init>", descriptor = "()V")
	Class147_Sub2() {
		this.aLong60 = (this.aLong59 = QueryPerformanceCounter.nanoTime() * 1033677142139799571L) * -8011619036957016171L;
		if (this.aLong59 * -1982833551118302693L == 0L) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ajp", name = "z", descriptor = "(J)I")
	@Override
	int method12692(@OriginalArg(0) long arg0) {
		if (this.aLong60 * -880111412343943441L > this.aLong59 * -1982833551118302693L) {
			this.aLong58 += this.aLong60 * 8676954745773687447L - this.aLong59 * -7165002494970533149L;
			this.aLong59 += this.aLong60 * -2419425159895067715L - this.aLong59;
			this.aLong60 += arg0 * -4090613776643907569L;
			return 1;
		}
		@Pc(49) int local49 = 0;
		do {
			local49++;
			this.aLong60 += arg0 * -4090613776643907569L;
		} while (local49 < 10 && this.aLong60 * -880111412343943441L < this.aLong59 * -1982833551118302693L);
		if (this.aLong60 * -880111412343943441L < this.aLong59 * -1982833551118302693L) {
			this.aLong60 = this.aLong59 * -8011619036957016171L;
		}
		return local49;
	}

	@OriginalMember(owner = "client!ajp", name = "m", descriptor = "(B)V")
	@Override
	void method12684(@OriginalArg(0) byte arg0) {
		this.aLong58 = 0L;
		if (this.aLong60 * -880111412343943441L > this.aLong59 * -1982833551118302693L) {
			this.aLong59 += this.aLong60 * -2419425159895067715L - this.aLong59;
		}
	}

	@OriginalMember(owner = "client!ajp", name = "k", descriptor = "(I)J")
	@Override
	long method12687(@OriginalArg(0) int arg0) {
		this.aLong59 += this.method12706(1059089952) * 1033677142139799571L;
		return this.aLong60 * -880111412343943441L > this.aLong59 * -1982833551118302693L ? (this.aLong60 * -880111412343943441L - this.aLong59 * -1982833551118302693L) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!ajp", name = "f", descriptor = "(J)I")
	@Override
	int method12688(@OriginalArg(0) long arg0) {
		if (this.aLong60 * -880111412343943441L > this.aLong59 * -1982833551118302693L) {
			this.aLong58 += this.aLong60 * 8676954745773687447L - this.aLong59 * -7165002494970533149L;
			this.aLong59 += this.aLong60 * -2419425159895067715L - this.aLong59;
			this.aLong60 += arg0 * -4090613776643907569L;
			return 1;
		}
		@Pc(49) int local49 = 0;
		do {
			local49++;
			this.aLong60 += arg0 * -4090613776643907569L;
		} while (local49 < 10 && this.aLong60 * -880111412343943441L < this.aLong59 * -1982833551118302693L);
		if (this.aLong60 * -880111412343943441L < this.aLong59 * -1982833551118302693L) {
			this.aLong60 = this.aLong59 * -8011619036957016171L;
		}
		return local49;
	}

	@OriginalMember(owner = "client!ajp", name = "l", descriptor = "()V")
	@Override
	void method12690() {
		this.aLong58 = 0L;
		if (this.aLong60 * -880111412343943441L > this.aLong59 * -1982833551118302693L) {
			this.aLong59 += this.aLong60 * -2419425159895067715L - this.aLong59;
		}
	}

	@OriginalMember(owner = "client!ajp", name = "r", descriptor = "(J)I")
	@Override
	int method12698(@OriginalArg(0) long arg0) {
		if (this.aLong60 * -880111412343943441L > this.aLong59 * -1982833551118302693L) {
			this.aLong58 += this.aLong60 * 8676954745773687447L - this.aLong59 * -7165002494970533149L;
			this.aLong59 += this.aLong60 * -2419425159895067715L - this.aLong59;
			this.aLong60 += arg0 * -4090613776643907569L;
			return 1;
		}
		@Pc(49) int local49 = 0;
		do {
			local49++;
			this.aLong60 += arg0 * -4090613776643907569L;
		} while (local49 < 10 && this.aLong60 * -880111412343943441L < this.aLong59 * -1982833551118302693L);
		if (this.aLong60 * -880111412343943441L < this.aLong59 * -1982833551118302693L) {
			this.aLong60 = this.aLong59 * -8011619036957016171L;
		}
		return local49;
	}

	@OriginalMember(owner = "client!ajp", name = "c", descriptor = "(J)I")
	@Override
	int method12695(@OriginalArg(0) long arg0) {
		if (this.aLong60 * -880111412343943441L > this.aLong59 * -1982833551118302693L) {
			this.aLong58 += this.aLong60 * 8676954745773687447L - this.aLong59 * -7165002494970533149L;
			this.aLong59 += this.aLong60 * -2419425159895067715L - this.aLong59;
			this.aLong60 += arg0 * -4090613776643907569L;
			return 1;
		}
		@Pc(49) int local49 = 0;
		do {
			local49++;
			this.aLong60 += arg0 * -4090613776643907569L;
		} while (local49 < 10 && this.aLong60 * -880111412343943441L < this.aLong59 * -1982833551118302693L);
		if (this.aLong60 * -880111412343943441L < this.aLong59 * -1982833551118302693L) {
			this.aLong60 = this.aLong59 * -8011619036957016171L;
		}
		return local49;
	}

	@OriginalMember(owner = "client!ajp", name = "u", descriptor = "()J")
	@Override
	long method12691() {
		this.aLong59 += this.method12706(1318017803) * 1033677142139799571L;
		return this.aLong60 * -880111412343943441L > this.aLong59 * -1982833551118302693L ? (this.aLong60 * -880111412343943441L - this.aLong59 * -1982833551118302693L) / 1000000L : 0L;
	}

	@OriginalMember(owner = "client!ajp", name = "h", descriptor = "(I)J")
	long method12706(@OriginalArg(0) int arg0) {
		@Pc(1) long local1 = QueryPerformanceCounter.nanoTime();
		@Pc(8) long local8 = local1 - this.aLong58 * 3675282577504868713L;
		this.aLong58 = local1 * 4769804016922527449L;
		if (local8 > -5000000000L && local8 < 5000000000L) {
			this.aLongArray11[this.anInt1446 * -1193966387] = local8;
			this.anInt1446 = (this.anInt1446 * -1193966387 + 1) % 10 * 107350021;
			if (this.anInt1445 * 1322894213 < 1) {
				this.anInt1445 += 1035713869;
			}
		}
		@Pc(55) long local55 = 0L;
		for (@Pc(57) int local57 = 1; local57 <= this.anInt1445 * 1322894213; local57++) {
			local55 += this.aLongArray11[(this.anInt1446 * -1193966387 - local57 + 10) % 10];
		}
		return local55 / (long) (this.anInt1445 * 1322894213);
	}

	@OriginalMember(owner = "client!ajp", name = "p", descriptor = "(J)I")
	@Override
	int method12693(@OriginalArg(0) long arg0) {
		if (this.aLong60 * -880111412343943441L > this.aLong59 * -1982833551118302693L) {
			this.aLong58 += this.aLong60 * 8676954745773687447L - this.aLong59 * -7165002494970533149L;
			this.aLong59 += this.aLong60 * -2419425159895067715L - this.aLong59;
			this.aLong60 += arg0 * -4090613776643907569L;
			return 1;
		}
		@Pc(49) int local49 = 0;
		do {
			local49++;
			this.aLong60 += arg0 * -4090613776643907569L;
		} while (local49 < 10 && this.aLong60 * -880111412343943441L < this.aLong59 * -1982833551118302693L);
		if (this.aLong60 * -880111412343943441L < this.aLong59 * -1982833551118302693L) {
			this.aLong60 = this.aLong59 * -8011619036957016171L;
		}
		return local49;
	}

	@OriginalMember(owner = "client!ajp", name = "d", descriptor = "(J)I")
	@Override
	int method12694(@OriginalArg(0) long arg0) {
		if (this.aLong60 * -880111412343943441L > this.aLong59 * -1982833551118302693L) {
			this.aLong58 += this.aLong60 * 8676954745773687447L - this.aLong59 * -7165002494970533149L;
			this.aLong59 += this.aLong60 * -2419425159895067715L - this.aLong59;
			this.aLong60 += arg0 * -4090613776643907569L;
			return 1;
		}
		@Pc(49) int local49 = 0;
		do {
			local49++;
			this.aLong60 += arg0 * -4090613776643907569L;
		} while (local49 < 10 && this.aLong60 * -880111412343943441L < this.aLong59 * -1982833551118302693L);
		if (this.aLong60 * -880111412343943441L < this.aLong59 * -1982833551118302693L) {
			this.aLong60 = this.aLong59 * -8011619036957016171L;
		}
		return local49;
	}

	@OriginalMember(owner = "client!ajp", name = "w", descriptor = "(I)J")
	@Override
	long method12701(@OriginalArg(0) int arg0) {
		return this.aLong59 * -1982833551118302693L;
	}

	@OriginalMember(owner = "client!ajp", name = "o", descriptor = "()J")
	@Override
	long method12696() {
		return this.aLong59 * -1982833551118302693L;
	}

	@OriginalMember(owner = "client!ajp", name = "a", descriptor = "()J")
	long method12707() {
		@Pc(1) long local1 = QueryPerformanceCounter.nanoTime();
		@Pc(8) long local8 = local1 - this.aLong58 * 3675282577504868713L;
		this.aLong58 = local1 * 4769804016922527449L;
		if (local8 > -5000000000L && local8 < 5000000000L) {
			this.aLongArray11[this.anInt1446 * -1193966387] = local8;
			this.anInt1446 = (this.anInt1446 * -1193966387 + 1) % 10 * 107350021;
			if (this.anInt1445 * 1322894213 < 1) {
				this.anInt1445 += 1035713869;
			}
		}
		@Pc(55) long local55 = 0L;
		for (@Pc(57) int local57 = 1; local57 <= this.anInt1445 * 1322894213; local57++) {
			local55 += this.aLongArray11[(this.anInt1446 * -1193966387 - local57 + 10) % 10];
		}
		return local55 / (long) (this.anInt1445 * 1322894213);
	}

	@OriginalMember(owner = "client!ajp", name = "s", descriptor = "()J")
	@Override
	long method12699() {
		return this.aLong59 * -1982833551118302693L;
	}

	@OriginalMember(owner = "client!ajp", name = "y", descriptor = "()J")
	@Override
	long method12700() {
		return this.aLong59 * -1982833551118302693L;
	}

	@OriginalMember(owner = "client!ajp", name = "v", descriptor = "()J")
	@Override
	long method12697() {
		return this.aLong59 * -1982833551118302693L;
	}

	@OriginalMember(owner = "client!ajp", name = "g", descriptor = "()J")
	long method12708() {
		@Pc(1) long local1 = QueryPerformanceCounter.nanoTime();
		@Pc(8) long local8 = local1 - this.aLong58 * 3675282577504868713L;
		this.aLong58 = local1 * 4769804016922527449L;
		if (local8 > -5000000000L && local8 < 5000000000L) {
			this.aLongArray11[this.anInt1446 * -1193966387] = local8;
			this.anInt1446 = (this.anInt1446 * -1193966387 + 1) % 10 * 107350021;
			if (this.anInt1445 * 1322894213 < 1) {
				this.anInt1445 += 1035713869;
			}
		}
		@Pc(55) long local55 = 0L;
		for (@Pc(57) int local57 = 1; local57 <= this.anInt1445 * 1322894213; local57++) {
			local55 += this.aLongArray11[(this.anInt1446 * -1193966387 - local57 + 10) % 10];
		}
		return local55 / (long) (this.anInt1445 * 1322894213);
	}

	@OriginalMember(owner = "client!ajp", name = "i", descriptor = "()J")
	long method12709() {
		@Pc(1) long local1 = QueryPerformanceCounter.nanoTime();
		@Pc(8) long local8 = local1 - this.aLong58 * 3675282577504868713L;
		this.aLong58 = local1 * 4769804016922527449L;
		if (local8 > -5000000000L && local8 < 5000000000L) {
			this.aLongArray11[this.anInt1446 * -1193966387] = local8;
			this.anInt1446 = (this.anInt1446 * -1193966387 + 1) % 10 * 107350021;
			if (this.anInt1445 * 1322894213 < 1) {
				this.anInt1445 += 1035713869;
			}
		}
		@Pc(55) long local55 = 0L;
		for (@Pc(57) int local57 = 1; local57 <= this.anInt1445 * 1322894213; local57++) {
			local55 += this.aLongArray11[(this.anInt1446 * -1193966387 - local57 + 10) % 10];
		}
		return local55 / (long) (this.anInt1445 * 1322894213);
	}
}
