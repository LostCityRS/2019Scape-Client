package jagex3;

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
public final class SortedQueue extends AbstractQueue {

	@OriginalMember(owner = "client!att", name = "m", descriptor = "I")
	public int size;

	@OriginalMember(owner = "client!att", name = "f", descriptor = "I")
	public int modCount;

	@OriginalMember(owner = "client!att", name = "e", descriptor = "[Lclient!nl;")
	public SortedQueueEntry[] sortedEntries;

	@OriginalMember(owner = "client!att", name = "n", descriptor = "Ljava/util/Map;")
	public Map entries;

	@OriginalMember(owner = "client!att", name = "k", descriptor = "Ljava/util/Comparator;")
	public final Comparator comparator;

	@OriginalMember(owner = "client!att", name = "<init>", descriptor = "(ILjava/util/Comparator;)V")
	public SortedQueue(@OriginalArg(0) int arg0, @OriginalArg(1) Comparator arg1) {
		this.modCount = 0;
		this.sortedEntries = new SortedQueueEntry[arg0];
		this.entries = new HashMap();
		this.comparator = arg1;
	}

	@OriginalMember(owner = "client!att", name = "<init>", descriptor = "(I)V")
	public SortedQueue(@OriginalArg(0) int arg0) {
		this(arg0, (Comparator) null);
	}

	@OriginalMember(owner = "client!att", name = "w", descriptor = "()Ljava/lang/Object;")
	public Object method23716() {
		return this.size * 2087138905 == 0 ? null : this.sortedEntries[0].anObject18;
	}

	@OriginalMember(owner = "client!att", name = "j", descriptor = "(I)V")
	void method23717(@OriginalArg(0) int arg0) {
		@Pc(4) SortedQueueEntry local4 = this.sortedEntries[arg0];
		@Pc(11) int local11 = this.size * 2087138905 >>> 1;
		while (arg0 < local11) {
			@Pc(20) int local20 = (arg0 << 1) + 1;
			@Pc(25) SortedQueueEntry local25 = this.sortedEntries[local20];
			@Pc(31) int local31 = (arg0 << 1) + 2;
			@Pc(36) SortedQueueEntry local36 = this.sortedEntries[local31];
			@Pc(55) int local55;
			if (this.comparator == null) {
				if (local31 < this.size * 2087138905 && ((Comparable) local25.anObject18).compareTo(local36.anObject18) > 0) {
					local55 = local31;
				} else {
					local55 = local20;
				}
			} else if (local31 < this.size * 2087138905 && this.comparator.compare(local25.anObject18, local36.anObject18) > 0) {
				local55 = local31;
			} else {
				local55 = local20;
			}
			if (this.comparator == null) {
				if (((Comparable) local4.anObject18).compareTo(this.sortedEntries[local55].anObject18) <= 0) {
					break;
				}
			} else if (this.comparator.compare(local4.anObject18, this.sortedEntries[local55].anObject18) <= 0) {
				break;
			}
			this.sortedEntries[arg0] = this.sortedEntries[local55];
			this.sortedEntries[arg0].anInt5046 = arg0 * 1240994129;
			arg0 = local55;
		}
		this.sortedEntries[arg0] = local4;
		this.sortedEntries[arg0].anInt5046 = arg0 * 1240994129;
	}

	@OriginalMember(owner = "client!att", name = "e", descriptor = "(I)V")
	void method23718(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = (this.sortedEntries.length << 1) + 1;
		this.sortedEntries = (SortedQueueEntry[]) Arrays.copyOf(this.sortedEntries, local7);
	}

	@OriginalMember(owner = "client!att", name = "size", descriptor = "()I")
	@Override
	public int size() {
		return this.size * 2087138905;
	}

	@OriginalMember(owner = "client!att", name = "offer", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean offer(@OriginalArg(0) Object arg0) {
		if (this.entries.containsKey(arg0)) {
			throw new IllegalArgumentException("");
		}
		this.modCount += 1440967229;
		@Pc(20) int local20 = this.size * 2087138905;
		if (local20 >= this.sortedEntries.length) {
			this.method23718(-861177447);
		}
		this.size += -1109610007;
		if (local20 == 0) {
			this.sortedEntries[0] = new SortedQueueEntry(arg0, 0);
			this.entries.put(arg0, this.sortedEntries[0]);
		} else {
			this.sortedEntries[local20] = new SortedQueueEntry(arg0, local20);
			this.entries.put(arg0, this.sortedEntries[local20]);
			this.method23719(local20, 1741552882);
		}
		return true;
	}

	@OriginalMember(owner = "client!att", name = "peek", descriptor = "()Ljava/lang/Object;")
	@Override
	public Object peek() {
		return this.size * 2087138905 == 0 ? null : this.sortedEntries[0].anObject18;
	}

	@OriginalMember(owner = "client!att", name = "poll", descriptor = "()Ljava/lang/Object;")
	@Override
	public Object poll() {
		if (this.size * 2087138905 == 0) {
			return null;
		}
		this.modCount += 1440967229;
		@Pc(18) Object local18 = this.sortedEntries[0].anObject18;
		this.entries.remove(local18);
		this.size -= -1109610007;
		if (this.size * 2087138905 == 0) {
			this.sortedEntries[this.size * 2087138905] = null;
		} else {
			this.sortedEntries[0] = this.sortedEntries[this.size * 2087138905];
			this.sortedEntries[0].anInt5046 = 0;
			this.sortedEntries[this.size * 2087138905] = null;
			this.method23720(0, 983107809);
		}
		return local18;
	}

	@OriginalMember(owner = "client!att", name = "remove", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean remove(@OriginalArg(0) Object arg0) {
		@Pc(5) SortedQueueEntry local5 = (SortedQueueEntry) this.entries.remove(arg0);
		if (local5 == null) {
			return false;
		}
		this.modCount += 1440967229;
		this.size -= -1109610007;
		if (local5.anInt5046 * 1369561009 == this.size * 2087138905) {
			this.sortedEntries[this.size * 2087138905] = null;
			return true;
		}
		@Pc(48) SortedQueueEntry local48 = this.sortedEntries[this.size * 2087138905];
		this.sortedEntries[this.size * 2087138905] = null;
		this.sortedEntries[local5.anInt5046 * 1369561009] = local48;
		this.sortedEntries[local5.anInt5046 * 1369561009].anInt5046 = local5.anInt5046;
		this.method23720(local5.anInt5046 * 1369561009, 604624722);
		if (local48 == this.sortedEntries[local5.anInt5046 * 1369561009]) {
			this.method23719(local5.anInt5046 * 1369561009, 1741552882);
		}
		return true;
	}

	@OriginalMember(owner = "client!att", name = "n", descriptor = "(II)V")
	void method23719(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) SortedQueueEntry local4 = this.sortedEntries[arg0];
		while (arg0 > 0) {
			@Pc(12) int local12 = arg0 - 1 >>> 1;
			@Pc(17) SortedQueueEntry local17 = this.sortedEntries[local12];
			if (this.comparator == null) {
				if (((Comparable) local4.anObject18).compareTo(local17.anObject18) >= 0) {
					break;
				}
			} else if (this.comparator.compare(local4.anObject18, local17.anObject18) >= 0) {
				break;
			}
			this.sortedEntries[arg0] = local17;
			this.sortedEntries[arg0].anInt5046 = arg0 * 1240994129;
			arg0 = local12;
		}
		this.sortedEntries[arg0] = local4;
		this.sortedEntries[arg0].anInt5046 = arg0 * 1240994129;
	}

	@OriginalMember(owner = "client!att", name = "m", descriptor = "(II)V")
	void method23720(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) SortedQueueEntry local4 = this.sortedEntries[arg0];
		@Pc(11) int local11 = this.size * 2087138905 >>> 1;
		while (arg0 < local11) {
			@Pc(20) int local20 = (arg0 << 1) + 1;
			@Pc(25) SortedQueueEntry local25 = this.sortedEntries[local20];
			@Pc(31) int local31 = (arg0 << 1) + 2;
			@Pc(36) SortedQueueEntry local36 = this.sortedEntries[local31];
			@Pc(55) int local55;
			if (this.comparator == null) {
				if (local31 < this.size * 2087138905 && ((Comparable) local25.anObject18).compareTo(local36.anObject18) > 0) {
					local55 = local31;
				} else {
					local55 = local20;
				}
			} else if (local31 < this.size * 2087138905 && this.comparator.compare(local25.anObject18, local36.anObject18) > 0) {
				local55 = local31;
			} else {
				local55 = local20;
			}
			if (this.comparator == null) {
				if (((Comparable) local4.anObject18).compareTo(this.sortedEntries[local55].anObject18) <= 0) {
					break;
				}
			} else if (this.comparator.compare(local4.anObject18, this.sortedEntries[local55].anObject18) <= 0) {
				break;
			}
			this.sortedEntries[arg0] = this.sortedEntries[local55];
			this.sortedEntries[arg0].anInt5046 = arg0 * 1240994129;
			arg0 = local55;
		}
		this.sortedEntries[arg0] = local4;
		this.sortedEntries[arg0].anInt5046 = arg0 * 1240994129;
	}

	@OriginalMember(owner = "client!att", name = "contains", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean contains(@OriginalArg(0) Object arg0) {
		return this.entries.containsKey(arg0);
	}

	@OriginalMember(owner = "client!att", name = "toArray", descriptor = "()[Ljava/lang/Object;")
	@Override
	public Object[] toArray() {
		@Pc(2) Object[] local2 = super.toArray();
		if (this.comparator == null) {
			Arrays.sort(local2);
		} else {
			Arrays.sort(local2, this.comparator);
		}
		return local2;
	}

	@OriginalMember(owner = "client!att", name = "x", descriptor = "(I)V")
	void method23721(@OriginalArg(0) int arg0) {
		@Pc(4) SortedQueueEntry local4 = this.sortedEntries[arg0];
		@Pc(11) int local11 = this.size * 2087138905 >>> 1;
		while (arg0 < local11) {
			@Pc(20) int local20 = (arg0 << 1) + 1;
			@Pc(25) SortedQueueEntry local25 = this.sortedEntries[local20];
			@Pc(31) int local31 = (arg0 << 1) + 2;
			@Pc(36) SortedQueueEntry local36 = this.sortedEntries[local31];
			@Pc(55) int local55;
			if (this.comparator == null) {
				if (local31 < this.size * 2087138905 && ((Comparable) local25.anObject18).compareTo(local36.anObject18) > 0) {
					local55 = local31;
				} else {
					local55 = local20;
				}
			} else if (local31 < this.size * 2087138905 && this.comparator.compare(local25.anObject18, local36.anObject18) > 0) {
				local55 = local31;
			} else {
				local55 = local20;
			}
			if (this.comparator == null) {
				if (((Comparable) local4.anObject18).compareTo(this.sortedEntries[local55].anObject18) <= 0) {
					break;
				}
			} else if (this.comparator.compare(local4.anObject18, this.sortedEntries[local55].anObject18) <= 0) {
				break;
			}
			this.sortedEntries[arg0] = this.sortedEntries[local55];
			this.sortedEntries[arg0].anInt5046 = arg0 * 1240994129;
			arg0 = local55;
		}
		this.sortedEntries[arg0] = local4;
		this.sortedEntries[arg0].anInt5046 = arg0 * 1240994129;
	}

	@OriginalMember(owner = "client!att", name = "u", descriptor = "()Ljava/lang/Object;")
	public Object method23722() {
		return this.size * 2087138905 == 0 ? null : this.sortedEntries[0].anObject18;
	}

	@OriginalMember(owner = "client!att", name = "i", descriptor = "()[Ljava/lang/Object;")
	public Object[] method23723() {
		@Pc(2) Object[] local2 = super.toArray();
		if (this.comparator == null) {
			Arrays.sort(local2);
		} else {
			Arrays.sort(local2, this.comparator);
		}
		return local2;
	}

	@OriginalMember(owner = "client!att", name = "c", descriptor = "()Ljava/util/Iterator;")
	public Iterator method23724() {
		return new Class436(this);
	}

	@OriginalMember(owner = "client!att", name = "b", descriptor = "()I")
	public int method23725() {
		return this.size * 2087138905;
	}

	@OriginalMember(owner = "client!att", name = "q", descriptor = "(I)V")
	void method23726(@OriginalArg(0) int arg0) {
		@Pc(4) SortedQueueEntry local4 = this.sortedEntries[arg0];
		while (arg0 > 0) {
			@Pc(12) int local12 = arg0 - 1 >>> 1;
			@Pc(17) SortedQueueEntry local17 = this.sortedEntries[local12];
			if (this.comparator == null) {
				if (((Comparable) local4.anObject18).compareTo(local17.anObject18) >= 0) {
					break;
				}
			} else if (this.comparator.compare(local4.anObject18, local17.anObject18) >= 0) {
				break;
			}
			this.sortedEntries[arg0] = local17;
			this.sortedEntries[arg0].anInt5046 = arg0 * 1240994129;
			arg0 = local12;
		}
		this.sortedEntries[arg0] = local4;
		this.sortedEntries[arg0].anInt5046 = arg0 * 1240994129;
	}

	@OriginalMember(owner = "client!att", name = "g", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method23727(@OriginalArg(0) Object arg0) {
		return this.entries.containsKey(arg0);
	}

	@OriginalMember(owner = "client!att", name = "f", descriptor = "()V")
	void method23728() {
		@Pc(7) int local7 = (this.sortedEntries.length << 1) + 1;
		this.sortedEntries = (SortedQueueEntry[]) Arrays.copyOf(this.sortedEntries, local7);
	}

	@OriginalMember(owner = "client!att", name = "l", descriptor = "()Ljava/lang/Object;")
	public Object method23729() {
		return this.size * 2087138905 == 0 ? null : this.sortedEntries[0].anObject18;
	}

	@OriginalMember(owner = "client!att", name = "h", descriptor = "()I")
	public int method23730() {
		return this.size * 2087138905;
	}

	@OriginalMember(owner = "client!att", name = "p", descriptor = "()Ljava/util/Iterator;")
	public Iterator method23731() {
		return new Class436(this);
	}

	@OriginalMember(owner = "client!att", name = "r", descriptor = "()Ljava/lang/Object;")
	public Object method23732() {
		if (this.size * 2087138905 == 0) {
			return null;
		}
		this.modCount += 1440967229;
		@Pc(18) Object local18 = this.sortedEntries[0].anObject18;
		this.entries.remove(local18);
		this.size -= -1109610007;
		if (this.size * 2087138905 == 0) {
			this.sortedEntries[this.size * 2087138905] = null;
		} else {
			this.sortedEntries[0] = this.sortedEntries[this.size * 2087138905];
			this.sortedEntries[0].anInt5046 = 0;
			this.sortedEntries[this.size * 2087138905] = null;
			this.method23720(0, 1262395826);
		}
		return local18;
	}

	@OriginalMember(owner = "client!att", name = "v", descriptor = "()Ljava/lang/Object;")
	public Object method23733() {
		if (this.size * 2087138905 == 0) {
			return null;
		}
		this.modCount += 1440967229;
		@Pc(18) Object local18 = this.sortedEntries[0].anObject18;
		this.entries.remove(local18);
		this.size -= -1109610007;
		if (this.size * 2087138905 == 0) {
			this.sortedEntries[this.size * 2087138905] = null;
		} else {
			this.sortedEntries[0] = this.sortedEntries[this.size * 2087138905];
			this.sortedEntries[0].anInt5046 = 0;
			this.sortedEntries[this.size * 2087138905] = null;
			this.method23720(0, -1078627603);
		}
		return local18;
	}

	@OriginalMember(owner = "client!att", name = "s", descriptor = "(I)V")
	void method23734(@OriginalArg(0) int arg0) {
		@Pc(4) SortedQueueEntry local4 = this.sortedEntries[arg0];
		while (arg0 > 0) {
			@Pc(12) int local12 = arg0 - 1 >>> 1;
			@Pc(17) SortedQueueEntry local17 = this.sortedEntries[local12];
			if (this.comparator == null) {
				if (((Comparable) local4.anObject18).compareTo(local17.anObject18) >= 0) {
					break;
				}
			} else if (this.comparator.compare(local4.anObject18, local17.anObject18) >= 0) {
				break;
			}
			this.sortedEntries[arg0] = local17;
			this.sortedEntries[arg0].anInt5046 = arg0 * 1240994129;
			arg0 = local12;
		}
		this.sortedEntries[arg0] = local4;
		this.sortedEntries[arg0].anInt5046 = arg0 * 1240994129;
	}

	@OriginalMember(owner = "client!att", name = "y", descriptor = "(I)V")
	void method23735(@OriginalArg(0) int arg0) {
		@Pc(4) SortedQueueEntry local4 = this.sortedEntries[arg0];
		while (arg0 > 0) {
			@Pc(12) int local12 = arg0 - 1 >>> 1;
			@Pc(17) SortedQueueEntry local17 = this.sortedEntries[local12];
			if (this.comparator == null) {
				if (((Comparable) local4.anObject18).compareTo(local17.anObject18) >= 0) {
					break;
				}
			} else if (this.comparator.compare(local4.anObject18, local17.anObject18) >= 0) {
				break;
			}
			this.sortedEntries[arg0] = local17;
			this.sortedEntries[arg0].anInt5046 = arg0 * 1240994129;
			arg0 = local12;
		}
		this.sortedEntries[arg0] = local4;
		this.sortedEntries[arg0].anInt5046 = arg0 * 1240994129;
	}

	@OriginalMember(owner = "client!att", name = "iterator", descriptor = "()Ljava/util/Iterator;")
	@Override
	public Iterator iterator() {
		return new Class436(this);
	}

	@OriginalMember(owner = "client!att", name = "k", descriptor = "()V")
	void method23736() {
		@Pc(7) int local7 = (this.sortedEntries.length << 1) + 1;
		this.sortedEntries = (SortedQueueEntry[]) Arrays.copyOf(this.sortedEntries, local7);
	}

	@OriginalMember(owner = "client!att", name = "d", descriptor = "()Ljava/util/Iterator;")
	public Iterator method23737() {
		return new Class436(this);
	}

	@OriginalMember(owner = "client!att", name = "t", descriptor = "(I)V")
	void method23738(@OriginalArg(0) int arg0) {
		@Pc(4) SortedQueueEntry local4 = this.sortedEntries[arg0];
		@Pc(11) int local11 = this.size * 2087138905 >>> 1;
		while (arg0 < local11) {
			@Pc(20) int local20 = (arg0 << 1) + 1;
			@Pc(25) SortedQueueEntry local25 = this.sortedEntries[local20];
			@Pc(31) int local31 = (arg0 << 1) + 2;
			@Pc(36) SortedQueueEntry local36 = this.sortedEntries[local31];
			@Pc(55) int local55;
			if (this.comparator == null) {
				if (local31 < this.size * 2087138905 && ((Comparable) local25.anObject18).compareTo(local36.anObject18) > 0) {
					local55 = local31;
				} else {
					local55 = local20;
				}
			} else if (local31 < this.size * 2087138905 && this.comparator.compare(local25.anObject18, local36.anObject18) > 0) {
				local55 = local31;
			} else {
				local55 = local20;
			}
			if (this.comparator == null) {
				if (((Comparable) local4.anObject18).compareTo(this.sortedEntries[local55].anObject18) <= 0) {
					break;
				}
			} else if (this.comparator.compare(local4.anObject18, this.sortedEntries[local55].anObject18) <= 0) {
				break;
			}
			this.sortedEntries[arg0] = this.sortedEntries[local55];
			this.sortedEntries[arg0].anInt5046 = arg0 * 1240994129;
			arg0 = local55;
		}
		this.sortedEntries[arg0] = local4;
		this.sortedEntries[arg0].anInt5046 = arg0 * 1240994129;
	}

	@OriginalMember(owner = "client!att", name = "ae", descriptor = "(I)V")
	void method23739(@OriginalArg(0) int arg0) {
		@Pc(4) SortedQueueEntry local4 = this.sortedEntries[arg0];
		@Pc(11) int local11 = this.size * 2087138905 >>> 1;
		while (arg0 < local11) {
			@Pc(20) int local20 = (arg0 << 1) + 1;
			@Pc(25) SortedQueueEntry local25 = this.sortedEntries[local20];
			@Pc(31) int local31 = (arg0 << 1) + 2;
			@Pc(36) SortedQueueEntry local36 = this.sortedEntries[local31];
			@Pc(55) int local55;
			if (this.comparator == null) {
				if (local31 < this.size * 2087138905 && ((Comparable) local25.anObject18).compareTo(local36.anObject18) > 0) {
					local55 = local31;
				} else {
					local55 = local20;
				}
			} else if (local31 < this.size * 2087138905 && this.comparator.compare(local25.anObject18, local36.anObject18) > 0) {
				local55 = local31;
			} else {
				local55 = local20;
			}
			if (this.comparator == null) {
				if (((Comparable) local4.anObject18).compareTo(this.sortedEntries[local55].anObject18) <= 0) {
					break;
				}
			} else if (this.comparator.compare(local4.anObject18, this.sortedEntries[local55].anObject18) <= 0) {
				break;
			}
			this.sortedEntries[arg0] = this.sortedEntries[local55];
			this.sortedEntries[arg0].anInt5046 = arg0 * 1240994129;
			arg0 = local55;
		}
		this.sortedEntries[arg0] = local4;
		this.sortedEntries[arg0].anInt5046 = arg0 * 1240994129;
	}

	@OriginalMember(owner = "client!att", name = "a", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method23740(@OriginalArg(0) Object arg0) {
		return this.entries.containsKey(arg0);
	}

	@OriginalMember(owner = "client!att", name = "o", descriptor = "(I)V")
	void method23741(@OriginalArg(0) int arg0) {
		@Pc(4) SortedQueueEntry local4 = this.sortedEntries[arg0];
		while (arg0 > 0) {
			@Pc(12) int local12 = arg0 - 1 >>> 1;
			@Pc(17) SortedQueueEntry local17 = this.sortedEntries[local12];
			if (this.comparator == null) {
				if (((Comparable) local4.anObject18).compareTo(local17.anObject18) >= 0) {
					break;
				}
			} else if (this.comparator.compare(local4.anObject18, local17.anObject18) >= 0) {
				break;
			}
			this.sortedEntries[arg0] = local17;
			this.sortedEntries[arg0].anInt5046 = arg0 * 1240994129;
			arg0 = local12;
		}
		this.sortedEntries[arg0] = local4;
		this.sortedEntries[arg0].anInt5046 = arg0 * 1240994129;
	}

	@OriginalMember(owner = "client!att", name = "z", descriptor = "()Ljava/lang/Object;")
	public Object method23742() {
		return this.size * 2087138905 == 0 ? null : this.sortedEntries[0].anObject18;
	}

	@OriginalMember(owner = "client!att", name = "bz", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method23743(@OriginalArg(0) Object arg0) {
		@Pc(5) SortedQueueEntry local5 = (SortedQueueEntry) this.entries.remove(arg0);
		if (local5 == null) {
			return false;
		}
		this.modCount += 1440967229;
		this.size -= -1109610007;
		if (local5.anInt5046 * 1369561009 == this.size * 2087138905) {
			this.sortedEntries[this.size * 2087138905] = null;
			return true;
		}
		@Pc(48) SortedQueueEntry local48 = this.sortedEntries[this.size * 2087138905];
		this.sortedEntries[this.size * 2087138905] = null;
		this.sortedEntries[local5.anInt5046 * 1369561009] = local48;
		this.sortedEntries[local5.anInt5046 * 1369561009].anInt5046 = local5.anInt5046;
		this.method23720(local5.anInt5046 * 1369561009, -1620982263);
		if (local48 == this.sortedEntries[local5.anInt5046 * 1369561009]) {
			this.method23719(local5.anInt5046 * 1369561009, 1741552882);
		}
		return true;
	}
}
