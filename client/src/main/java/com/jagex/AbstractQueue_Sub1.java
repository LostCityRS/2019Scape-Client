package com.jagex;

import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!att")
public class AbstractQueue_Sub1 extends AbstractQueue {

	@OriginalMember(owner = "client!att", name = "e", descriptor = "[Lclient!nl;")
	Class441[] aClass441Array1;

	@OriginalMember(owner = "client!att", name = "n", descriptor = "Ljava/util/Map;")
	Map aMap17;

	@OriginalMember(owner = "client!att", name = "m", descriptor = "I")
	int anInt3230;

	@OriginalMember(owner = "client!att", name = "k", descriptor = "Ljava/util/Comparator;")
	final Comparator aComparator1;

	@OriginalMember(owner = "client!att", name = "f", descriptor = "I")
	int anInt3231;

	@OriginalMember(owner = "client!att", name = "<init>", descriptor = "(I)V", line = 13)
	public AbstractQueue_Sub1(@OriginalArg(0) int arg0) {
		this(arg0, (Comparator) null);
	}

	@OriginalMember(owner = "client!att", name = "<init>", descriptor = "(ILjava/util/Comparator;)V", line = 16)
	public AbstractQueue_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Comparator arg1) {
		this.anInt3231 = 0;
		this.aClass441Array1 = new Class441[arg0];
		this.aMap17 = new HashMap();
		this.aComparator1 = arg1;
	}

	@OriginalMember(owner = "client!att", name = "e", descriptor = "(I)V", line = 23)
	void method23704(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = (this.aClass441Array1.length << 1) + 1;
		this.aClass441Array1 = (Class441[]) Arrays.copyOf(this.aClass441Array1, local7);
	}

	@OriginalMember(owner = "client!att", name = "f", descriptor = "()V", line = 23)
	void method23705() {
		@Pc(7) int local7 = (this.aClass441Array1.length << 1) + 1;
		this.aClass441Array1 = (Class441[]) Arrays.copyOf(this.aClass441Array1, local7);
	}

	@OriginalMember(owner = "client!att", name = "k", descriptor = "()V", line = 23)
	void method23706() {
		@Pc(7) int local7 = (this.aClass441Array1.length << 1) + 1;
		this.aClass441Array1 = (Class441[]) Arrays.copyOf(this.aClass441Array1, local7);
	}

	@OriginalMember(owner = "client!att", name = "size", descriptor = "()I", line = 28)
	@Override
	public int size() {
		return this.anInt3230 * 2087138905;
	}

	@OriginalMember(owner = "client!att", name = "b", descriptor = "()I", line = 28)
	public int method23707() {
		return this.anInt3230 * 2087138905;
	}

	@OriginalMember(owner = "client!att", name = "h", descriptor = "()I", line = 28)
	public int method23708() {
		return this.anInt3230 * 2087138905;
	}

	@OriginalMember(owner = "client!att", name = "offer", descriptor = "(Ljava/lang/Object;)Z", line = 32)
	@Override
	public boolean offer(@OriginalArg(0) Object arg0) {
		if (this.aMap17.containsKey(arg0)) {
			throw new IllegalArgumentException("");
		}
		this.anInt3231 += 1440967229;
		@Pc(20) int local20 = this.anInt3230 * 2087138905;
		if (local20 >= this.aClass441Array1.length) {
			this.method23704(-861177447);
		}
		this.anInt3230 += -1109610007;
		if (local20 == 0) {
			this.aClass441Array1[0] = new Class441(arg0, 0);
			this.aMap17.put(arg0, this.aClass441Array1[0]);
		} else {
			this.aClass441Array1[local20] = new Class441(arg0, local20);
			this.aMap17.put(arg0, this.aClass441Array1[local20]);
			this.method23716(local20, 1741552882);
		}
		return true;
	}

	@OriginalMember(owner = "client!att", name = "w", descriptor = "()Ljava/lang/Object;", line = 50)
	public Object method23709() {
		return this.anInt3230 * 2087138905 == 0 ? null : this.aClass441Array1[0].anObject18;
	}

	@OriginalMember(owner = "client!att", name = "peek", descriptor = "()Ljava/lang/Object;", line = 50)
	@Override
	public Object peek() {
		return this.anInt3230 * 2087138905 == 0 ? null : this.aClass441Array1[0].anObject18;
	}

	@OriginalMember(owner = "client!att", name = "u", descriptor = "()Ljava/lang/Object;", line = 50)
	public Object method23710() {
		return this.anInt3230 * 2087138905 == 0 ? null : this.aClass441Array1[0].anObject18;
	}

	@OriginalMember(owner = "client!att", name = "l", descriptor = "()Ljava/lang/Object;", line = 50)
	public Object method23711() {
		return this.anInt3230 * 2087138905 == 0 ? null : this.aClass441Array1[0].anObject18;
	}

	@OriginalMember(owner = "client!att", name = "z", descriptor = "()Ljava/lang/Object;", line = 50)
	public Object method23712() {
		return this.anInt3230 * 2087138905 == 0 ? null : this.aClass441Array1[0].anObject18;
	}

	@OriginalMember(owner = "client!att", name = "poll", descriptor = "()Ljava/lang/Object;", line = 55)
	@Override
	public Object poll() {
		if (this.anInt3230 * 2087138905 == 0) {
			return null;
		}
		this.anInt3231 += 1440967229;
		@Pc(18) Object local18 = this.aClass441Array1[0].anObject18;
		this.aMap17.remove(local18);
		this.anInt3230 -= -1109610007;
		if (this.anInt3230 * 2087138905 == 0) {
			this.aClass441Array1[this.anInt3230 * 2087138905] = null;
		} else {
			this.aClass441Array1[0] = this.aClass441Array1[this.anInt3230 * 2087138905];
			this.aClass441Array1[0].anInt4885 = 0;
			this.aClass441Array1[this.anInt3230 * 2087138905] = null;
			this.method23722(0, 983107809);
		}
		return local18;
	}

	@OriginalMember(owner = "client!att", name = "r", descriptor = "()Ljava/lang/Object;", line = 55)
	public Object method23713() {
		if (this.anInt3230 * 2087138905 == 0) {
			return null;
		}
		this.anInt3231 += 1440967229;
		@Pc(18) Object local18 = this.aClass441Array1[0].anObject18;
		this.aMap17.remove(local18);
		this.anInt3230 -= -1109610007;
		if (this.anInt3230 * 2087138905 == 0) {
			this.aClass441Array1[this.anInt3230 * 2087138905] = null;
		} else {
			this.aClass441Array1[0] = this.aClass441Array1[this.anInt3230 * 2087138905];
			this.aClass441Array1[0].anInt4885 = 0;
			this.aClass441Array1[this.anInt3230 * 2087138905] = null;
			this.method23722(0, 1262395826);
		}
		return local18;
	}

	@OriginalMember(owner = "client!att", name = "v", descriptor = "()Ljava/lang/Object;", line = 55)
	public Object method23714() {
		if (this.anInt3230 * 2087138905 == 0) {
			return null;
		}
		this.anInt3231 += 1440967229;
		@Pc(18) Object local18 = this.aClass441Array1[0].anObject18;
		this.aMap17.remove(local18);
		this.anInt3230 -= -1109610007;
		if (this.anInt3230 * 2087138905 == 0) {
			this.aClass441Array1[this.anInt3230 * 2087138905] = null;
		} else {
			this.aClass441Array1[0] = this.aClass441Array1[this.anInt3230 * 2087138905];
			this.aClass441Array1[0].anInt4885 = 0;
			this.aClass441Array1[this.anInt3230 * 2087138905] = null;
			this.method23722(0, -1078627603);
		}
		return local18;
	}

	@OriginalMember(owner = "client!att", name = "remove", descriptor = "(Ljava/lang/Object;)Z", line = 71)
	@Override
	public boolean remove(@OriginalArg(0) Object arg0) {
		@Pc(5) Class441 local5 = (Class441) this.aMap17.remove(arg0);
		if (local5 == null) {
			return false;
		}
		this.anInt3231 += 1440967229;
		this.anInt3230 -= -1109610007;
		if (local5.anInt4885 * 1369561009 == this.anInt3230 * 2087138905) {
			this.aClass441Array1[this.anInt3230 * 2087138905] = null;
			return true;
		}
		@Pc(48) Class441 local48 = this.aClass441Array1[this.anInt3230 * 2087138905];
		this.aClass441Array1[this.anInt3230 * 2087138905] = null;
		this.aClass441Array1[local5.anInt4885 * 1369561009] = local48;
		this.aClass441Array1[local5.anInt4885 * 1369561009].anInt4885 = local5.anInt4885;
		this.method23722(local5.anInt4885 * 1369561009, 604624722);
		if (local48 == this.aClass441Array1[local5.anInt4885 * 1369561009]) {
			this.method23716(local5.anInt4885 * 1369561009, 1741552882);
		}
		return true;
	}

	@OriginalMember(owner = "client!att", name = "bz", descriptor = "(Ljava/lang/Object;)Z", line = 71)
	public boolean method23715(@OriginalArg(0) Object arg0) {
		@Pc(5) Class441 local5 = (Class441) this.aMap17.remove(arg0);
		if (local5 == null) {
			return false;
		}
		this.anInt3231 += 1440967229;
		this.anInt3230 -= -1109610007;
		if (local5.anInt4885 * 1369561009 == this.anInt3230 * 2087138905) {
			this.aClass441Array1[this.anInt3230 * 2087138905] = null;
			return true;
		}
		@Pc(48) Class441 local48 = this.aClass441Array1[this.anInt3230 * 2087138905];
		this.aClass441Array1[this.anInt3230 * 2087138905] = null;
		this.aClass441Array1[local5.anInt4885 * 1369561009] = local48;
		this.aClass441Array1[local5.anInt4885 * 1369561009].anInt4885 = local5.anInt4885;
		this.method23722(local5.anInt4885 * 1369561009, -1620982263);
		if (local48 == this.aClass441Array1[local5.anInt4885 * 1369561009]) {
			this.method23716(local5.anInt4885 * 1369561009, 1741552882);
		}
		return true;
	}

	@OriginalMember(owner = "client!att", name = "n", descriptor = "(II)V", line = 89)
	void method23716(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class441 local4 = this.aClass441Array1[arg0];
		while (arg0 > 0) {
			@Pc(12) int local12 = arg0 - 1 >>> 1;
			@Pc(17) Class441 local17 = this.aClass441Array1[local12];
			if (this.aComparator1 == null) {
				if (((Comparable) local4.anObject18).compareTo(local17.anObject18) >= 0) {
					break;
				}
			} else if (this.aComparator1.compare(local4.anObject18, local17.anObject18) >= 0) {
				break;
			}
			this.aClass441Array1[arg0] = local17;
			this.aClass441Array1[arg0].anInt4885 = arg0 * 1240994129;
			arg0 = local12;
		}
		this.aClass441Array1[arg0] = local4;
		this.aClass441Array1[arg0].anInt4885 = arg0 * 1240994129;
	}

	@OriginalMember(owner = "client!att", name = "q", descriptor = "(I)V", line = 89)
	void method23717(@OriginalArg(0) int arg0) {
		@Pc(4) Class441 local4 = this.aClass441Array1[arg0];
		while (arg0 > 0) {
			@Pc(12) int local12 = arg0 - 1 >>> 1;
			@Pc(17) Class441 local17 = this.aClass441Array1[local12];
			if (this.aComparator1 == null) {
				if (((Comparable) local4.anObject18).compareTo(local17.anObject18) >= 0) {
					break;
				}
			} else if (this.aComparator1.compare(local4.anObject18, local17.anObject18) >= 0) {
				break;
			}
			this.aClass441Array1[arg0] = local17;
			this.aClass441Array1[arg0].anInt4885 = arg0 * 1240994129;
			arg0 = local12;
		}
		this.aClass441Array1[arg0] = local4;
		this.aClass441Array1[arg0].anInt4885 = arg0 * 1240994129;
	}

	@OriginalMember(owner = "client!att", name = "s", descriptor = "(I)V", line = 89)
	void method23718(@OriginalArg(0) int arg0) {
		@Pc(4) Class441 local4 = this.aClass441Array1[arg0];
		while (arg0 > 0) {
			@Pc(12) int local12 = arg0 - 1 >>> 1;
			@Pc(17) Class441 local17 = this.aClass441Array1[local12];
			if (this.aComparator1 == null) {
				if (((Comparable) local4.anObject18).compareTo(local17.anObject18) >= 0) {
					break;
				}
			} else if (this.aComparator1.compare(local4.anObject18, local17.anObject18) >= 0) {
				break;
			}
			this.aClass441Array1[arg0] = local17;
			this.aClass441Array1[arg0].anInt4885 = arg0 * 1240994129;
			arg0 = local12;
		}
		this.aClass441Array1[arg0] = local4;
		this.aClass441Array1[arg0].anInt4885 = arg0 * 1240994129;
	}

	@OriginalMember(owner = "client!att", name = "y", descriptor = "(I)V", line = 89)
	void method23719(@OriginalArg(0) int arg0) {
		@Pc(4) Class441 local4 = this.aClass441Array1[arg0];
		while (arg0 > 0) {
			@Pc(12) int local12 = arg0 - 1 >>> 1;
			@Pc(17) Class441 local17 = this.aClass441Array1[local12];
			if (this.aComparator1 == null) {
				if (((Comparable) local4.anObject18).compareTo(local17.anObject18) >= 0) {
					break;
				}
			} else if (this.aComparator1.compare(local4.anObject18, local17.anObject18) >= 0) {
				break;
			}
			this.aClass441Array1[arg0] = local17;
			this.aClass441Array1[arg0].anInt4885 = arg0 * 1240994129;
			arg0 = local12;
		}
		this.aClass441Array1[arg0] = local4;
		this.aClass441Array1[arg0].anInt4885 = arg0 * 1240994129;
	}

	@OriginalMember(owner = "client!att", name = "o", descriptor = "(I)V", line = 89)
	void method23720(@OriginalArg(0) int arg0) {
		@Pc(4) Class441 local4 = this.aClass441Array1[arg0];
		while (arg0 > 0) {
			@Pc(12) int local12 = arg0 - 1 >>> 1;
			@Pc(17) Class441 local17 = this.aClass441Array1[local12];
			if (this.aComparator1 == null) {
				if (((Comparable) local4.anObject18).compareTo(local17.anObject18) >= 0) {
					break;
				}
			} else if (this.aComparator1.compare(local4.anObject18, local17.anObject18) >= 0) {
				break;
			}
			this.aClass441Array1[arg0] = local17;
			this.aClass441Array1[arg0].anInt4885 = arg0 * 1240994129;
			arg0 = local12;
		}
		this.aClass441Array1[arg0] = local4;
		this.aClass441Array1[arg0].anInt4885 = arg0 * 1240994129;
	}

	@OriginalMember(owner = "client!att", name = "j", descriptor = "(I)V", line = 108)
	void method23721(@OriginalArg(0) int arg0) {
		@Pc(4) Class441 local4 = this.aClass441Array1[arg0];
		@Pc(11) int local11 = this.anInt3230 * 2087138905 >>> 1;
		while (arg0 < local11) {
			@Pc(20) int local20 = (arg0 << 1) + 1;
			@Pc(25) Class441 local25 = this.aClass441Array1[local20];
			@Pc(31) int local31 = (arg0 << 1) + 2;
			@Pc(36) Class441 local36 = this.aClass441Array1[local31];
			@Pc(55) int local55;
			if (this.aComparator1 == null) {
				if (local31 < this.anInt3230 * 2087138905 && ((Comparable) local25.anObject18).compareTo(local36.anObject18) > 0) {
					local55 = local31;
				} else {
					local55 = local20;
				}
			} else if (local31 < this.anInt3230 * 2087138905 && this.aComparator1.compare(local25.anObject18, local36.anObject18) > 0) {
				local55 = local31;
			} else {
				local55 = local20;
			}
			if (this.aComparator1 == null) {
				if (((Comparable) local4.anObject18).compareTo(this.aClass441Array1[local55].anObject18) <= 0) {
					break;
				}
			} else if (this.aComparator1.compare(local4.anObject18, this.aClass441Array1[local55].anObject18) <= 0) {
				break;
			}
			this.aClass441Array1[arg0] = this.aClass441Array1[local55];
			this.aClass441Array1[arg0].anInt4885 = arg0 * 1240994129;
			arg0 = local55;
		}
		this.aClass441Array1[arg0] = local4;
		this.aClass441Array1[arg0].anInt4885 = arg0 * 1240994129;
	}

	@OriginalMember(owner = "client!att", name = "m", descriptor = "(II)V", line = 108)
	void method23722(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class441 local4 = this.aClass441Array1[arg0];
		@Pc(11) int local11 = this.anInt3230 * 2087138905 >>> 1;
		while (arg0 < local11) {
			@Pc(20) int local20 = (arg0 << 1) + 1;
			@Pc(25) Class441 local25 = this.aClass441Array1[local20];
			@Pc(31) int local31 = (arg0 << 1) + 2;
			@Pc(36) Class441 local36 = this.aClass441Array1[local31];
			@Pc(55) int local55;
			if (this.aComparator1 == null) {
				if (local31 < this.anInt3230 * 2087138905 && ((Comparable) local25.anObject18).compareTo(local36.anObject18) > 0) {
					local55 = local31;
				} else {
					local55 = local20;
				}
			} else if (local31 < this.anInt3230 * 2087138905 && this.aComparator1.compare(local25.anObject18, local36.anObject18) > 0) {
				local55 = local31;
			} else {
				local55 = local20;
			}
			if (this.aComparator1 == null) {
				if (((Comparable) local4.anObject18).compareTo(this.aClass441Array1[local55].anObject18) <= 0) {
					break;
				}
			} else if (this.aComparator1.compare(local4.anObject18, this.aClass441Array1[local55].anObject18) <= 0) {
				break;
			}
			this.aClass441Array1[arg0] = this.aClass441Array1[local55];
			this.aClass441Array1[arg0].anInt4885 = arg0 * 1240994129;
			arg0 = local55;
		}
		this.aClass441Array1[arg0] = local4;
		this.aClass441Array1[arg0].anInt4885 = arg0 * 1240994129;
	}

	@OriginalMember(owner = "client!att", name = "x", descriptor = "(I)V", line = 108)
	void method23723(@OriginalArg(0) int arg0) {
		@Pc(4) Class441 local4 = this.aClass441Array1[arg0];
		@Pc(11) int local11 = this.anInt3230 * 2087138905 >>> 1;
		while (arg0 < local11) {
			@Pc(20) int local20 = (arg0 << 1) + 1;
			@Pc(25) Class441 local25 = this.aClass441Array1[local20];
			@Pc(31) int local31 = (arg0 << 1) + 2;
			@Pc(36) Class441 local36 = this.aClass441Array1[local31];
			@Pc(55) int local55;
			if (this.aComparator1 == null) {
				if (local31 < this.anInt3230 * 2087138905 && ((Comparable) local25.anObject18).compareTo(local36.anObject18) > 0) {
					local55 = local31;
				} else {
					local55 = local20;
				}
			} else if (local31 < this.anInt3230 * 2087138905 && this.aComparator1.compare(local25.anObject18, local36.anObject18) > 0) {
				local55 = local31;
			} else {
				local55 = local20;
			}
			if (this.aComparator1 == null) {
				if (((Comparable) local4.anObject18).compareTo(this.aClass441Array1[local55].anObject18) <= 0) {
					break;
				}
			} else if (this.aComparator1.compare(local4.anObject18, this.aClass441Array1[local55].anObject18) <= 0) {
				break;
			}
			this.aClass441Array1[arg0] = this.aClass441Array1[local55];
			this.aClass441Array1[arg0].anInt4885 = arg0 * 1240994129;
			arg0 = local55;
		}
		this.aClass441Array1[arg0] = local4;
		this.aClass441Array1[arg0].anInt4885 = arg0 * 1240994129;
	}

	@OriginalMember(owner = "client!att", name = "t", descriptor = "(I)V", line = 108)
	void method23724(@OriginalArg(0) int arg0) {
		@Pc(4) Class441 local4 = this.aClass441Array1[arg0];
		@Pc(11) int local11 = this.anInt3230 * 2087138905 >>> 1;
		while (arg0 < local11) {
			@Pc(20) int local20 = (arg0 << 1) + 1;
			@Pc(25) Class441 local25 = this.aClass441Array1[local20];
			@Pc(31) int local31 = (arg0 << 1) + 2;
			@Pc(36) Class441 local36 = this.aClass441Array1[local31];
			@Pc(55) int local55;
			if (this.aComparator1 == null) {
				if (local31 < this.anInt3230 * 2087138905 && ((Comparable) local25.anObject18).compareTo(local36.anObject18) > 0) {
					local55 = local31;
				} else {
					local55 = local20;
				}
			} else if (local31 < this.anInt3230 * 2087138905 && this.aComparator1.compare(local25.anObject18, local36.anObject18) > 0) {
				local55 = local31;
			} else {
				local55 = local20;
			}
			if (this.aComparator1 == null) {
				if (((Comparable) local4.anObject18).compareTo(this.aClass441Array1[local55].anObject18) <= 0) {
					break;
				}
			} else if (this.aComparator1.compare(local4.anObject18, this.aClass441Array1[local55].anObject18) <= 0) {
				break;
			}
			this.aClass441Array1[arg0] = this.aClass441Array1[local55];
			this.aClass441Array1[arg0].anInt4885 = arg0 * 1240994129;
			arg0 = local55;
		}
		this.aClass441Array1[arg0] = local4;
		this.aClass441Array1[arg0].anInt4885 = arg0 * 1240994129;
	}

	@OriginalMember(owner = "client!att", name = "ae", descriptor = "(I)V", line = 108)
	void method23725(@OriginalArg(0) int arg0) {
		@Pc(4) Class441 local4 = this.aClass441Array1[arg0];
		@Pc(11) int local11 = this.anInt3230 * 2087138905 >>> 1;
		while (arg0 < local11) {
			@Pc(20) int local20 = (arg0 << 1) + 1;
			@Pc(25) Class441 local25 = this.aClass441Array1[local20];
			@Pc(31) int local31 = (arg0 << 1) + 2;
			@Pc(36) Class441 local36 = this.aClass441Array1[local31];
			@Pc(55) int local55;
			if (this.aComparator1 == null) {
				if (local31 < this.anInt3230 * 2087138905 && ((Comparable) local25.anObject18).compareTo(local36.anObject18) > 0) {
					local55 = local31;
				} else {
					local55 = local20;
				}
			} else if (local31 < this.anInt3230 * 2087138905 && this.aComparator1.compare(local25.anObject18, local36.anObject18) > 0) {
				local55 = local31;
			} else {
				local55 = local20;
			}
			if (this.aComparator1 == null) {
				if (((Comparable) local4.anObject18).compareTo(this.aClass441Array1[local55].anObject18) <= 0) {
					break;
				}
			} else if (this.aComparator1.compare(local4.anObject18, this.aClass441Array1[local55].anObject18) <= 0) {
				break;
			}
			this.aClass441Array1[arg0] = this.aClass441Array1[local55];
			this.aClass441Array1[arg0].anInt4885 = arg0 * 1240994129;
			arg0 = local55;
		}
		this.aClass441Array1[arg0] = local4;
		this.aClass441Array1[arg0].anInt4885 = arg0 * 1240994129;
	}

	@OriginalMember(owner = "client!att", name = "contains", descriptor = "(Ljava/lang/Object;)Z", line = 139)
	@Override
	public boolean contains(@OriginalArg(0) Object arg0) {
		return this.aMap17.containsKey(arg0);
	}

	@OriginalMember(owner = "client!att", name = "g", descriptor = "(Ljava/lang/Object;)Z", line = 139)
	public boolean method23726(@OriginalArg(0) Object arg0) {
		return this.aMap17.containsKey(arg0);
	}

	@OriginalMember(owner = "client!att", name = "a", descriptor = "(Ljava/lang/Object;)Z", line = 139)
	public boolean method23727(@OriginalArg(0) Object arg0) {
		return this.aMap17.containsKey(arg0);
	}

	@OriginalMember(owner = "client!att", name = "toArray", descriptor = "()[Ljava/lang/Object;", line = 143)
	@Override
	public Object[] toArray() {
		@Pc(2) Object[] local2 = super.toArray();
		if (this.aComparator1 == null) {
			Arrays.sort(local2);
		} else {
			Arrays.sort(local2, this.aComparator1);
		}
		return local2;
	}

	@OriginalMember(owner = "client!att", name = "i", descriptor = "()[Ljava/lang/Object;", line = 143)
	public Object[] method23728() {
		@Pc(2) Object[] local2 = super.toArray();
		if (this.aComparator1 == null) {
			Arrays.sort(local2);
		} else {
			Arrays.sort(local2, this.aComparator1);
		}
		return local2;
	}

	@OriginalMember(owner = "client!att", name = "c", descriptor = "()Ljava/util/Iterator;", line = 150)
	public Iterator method23729() {
		return new Class436(this);
	}

	@OriginalMember(owner = "client!att", name = "p", descriptor = "()Ljava/util/Iterator;", line = 150)
	public Iterator method23730() {
		return new Class436(this);
	}

	@OriginalMember(owner = "client!att", name = "iterator", descriptor = "()Ljava/util/Iterator;", line = 150)
	@Override
	public Iterator iterator() {
		return new Class436(this);
	}

	@OriginalMember(owner = "client!att", name = "d", descriptor = "()Ljava/util/Iterator;", line = 150)
	public Iterator method23731() {
		return new Class436(this);
	}
}
