package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.util.*;

@OriginalClass("client!ath")
public final class AbstractQueue_Sub1 extends AbstractQueue {

	@OriginalMember(owner = "client!ath", name = "u", descriptor = "Ljava/util/Comparator;")
	final Comparator aComparator1;

	@OriginalMember(owner = "client!ath", name = "f", descriptor = "Ljava/util/Map;")
	Map aMap14;

	@OriginalMember(owner = "client!ath", name = "t", descriptor = "[Lclient!ng;")
	Class437[] aClass437Array1;

	@OriginalMember(owner = "client!ath", name = "e", descriptor = "I")
	int anInt3224;

	@OriginalMember(owner = "client!ath", name = "l", descriptor = "I")
	int anInt3225;

	@OriginalMember(owner = "client!ath", name = "<init>", descriptor = "(I)V")
	public AbstractQueue_Sub1(@OriginalArg(0) int arg0) {
		this(arg0, (Comparator) null);
	}

	@OriginalMember(owner = "client!ath", name = "<init>", descriptor = "(ILjava/util/Comparator;)V")
	public AbstractQueue_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Comparator arg1) {
		this.anInt3225 = 0;
		this.aClass437Array1 = new Class437[arg0];
		this.aMap14 = new HashMap();
		this.aComparator1 = arg1;
	}

	@OriginalMember(owner = "client!ath", name = "x", descriptor = "()Ljava/lang/Object;")
	public Object method23699() {
		if (this.anInt3224 * 451065463 == 0) {
			return null;
		}
		this.anInt3225 += 298510975;
		@Pc(19) Object local19 = this.aClass437Array1[0].anObject18;
		this.aMap14.remove(local19);
		this.anInt3224 -= -404487353;
		if (this.anInt3224 * 451065463 == 0) {
			this.aClass437Array1[this.anInt3224 * 451065463] = null;
		} else {
			this.aClass437Array1[0] = this.aClass437Array1[this.anInt3224 * 451065463];
			this.aClass437Array1[0].anInt4804 = 0;
			this.aClass437Array1[this.anInt3224 * 451065463] = null;
			this.method23703(0, (byte) 88);
		}
		return local19;
	}

	@OriginalMember(owner = "client!ath", name = "bj", descriptor = "()I")
	public int method23700() {
		return this.anInt3224 * 451065463;
	}

	@OriginalMember(owner = "client!ath", name = "r", descriptor = "(I)V")
	void method23701(@OriginalArg(0) int arg0) {
		@Pc(4) Class437 local4 = this.aClass437Array1[arg0];
		while (arg0 > 0) {
			@Pc(12) int local12 = arg0 - 1 >>> 1;
			@Pc(17) Class437 local17 = this.aClass437Array1[local12];
			if (this.aComparator1 == null) {
				if (((Comparable) local4.anObject18).compareTo(local17.anObject18) >= 0) {
					break;
				}
			} else if (this.aComparator1.compare(local4.anObject18, local17.anObject18) >= 0) {
				break;
			}
			this.aClass437Array1[arg0] = local17;
			this.aClass437Array1[arg0].anInt4804 = arg0 * -2050094309;
			arg0 = local12;
		}
		this.aClass437Array1[arg0] = local4;
		this.aClass437Array1[arg0].anInt4804 = arg0 * -2050094309;
	}

	@OriginalMember(owner = "client!ath", name = "size", descriptor = "()I")
	@Override
	public int size() {
		return this.anInt3224 * 451065463;
	}

	@OriginalMember(owner = "client!ath", name = "offer", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean offer(@OriginalArg(0) Object arg0) {
		if (this.aMap14.containsKey(arg0)) {
			throw new IllegalArgumentException("");
		}
		this.anInt3225 += 298510975;
		@Pc(20) int local20 = this.anInt3224 * 451065463;
		if (local20 >= this.aClass437Array1.length) {
			this.method23705(-1082258873);
		}
		this.anInt3224 += -404487353;
		if (local20 == 0) {
			this.aClass437Array1[0] = new Class437(arg0, 0);
			this.aMap14.put(arg0, this.aClass437Array1[0]);
		} else {
			this.aClass437Array1[local20] = new Class437(arg0, local20);
			this.aMap14.put(arg0, this.aClass437Array1[local20]);
			this.method23704(local20, -145549794);
		}
		return true;
	}

	@OriginalMember(owner = "client!ath", name = "peek", descriptor = "()Ljava/lang/Object;")
	@Override
	public Object peek() {
		return this.anInt3224 * 451065463 == 0 ? null : this.aClass437Array1[0].anObject18;
	}

	@OriginalMember(owner = "client!ath", name = "poll", descriptor = "()Ljava/lang/Object;")
	@Override
	public Object poll() {
		if (this.anInt3224 * 451065463 == 0) {
			return null;
		}
		this.anInt3225 += 298510975;
		@Pc(19) Object local19 = this.aClass437Array1[0].anObject18;
		this.aMap14.remove(local19);
		this.anInt3224 -= -404487353;
		if (this.anInt3224 * 451065463 == 0) {
			this.aClass437Array1[this.anInt3224 * 451065463] = null;
		} else {
			this.aClass437Array1[0] = this.aClass437Array1[this.anInt3224 * 451065463];
			this.aClass437Array1[0].anInt4804 = 0;
			this.aClass437Array1[this.anInt3224 * 451065463] = null;
			this.method23703(0, (byte) 40);
		}
		return local19;
	}

	@OriginalMember(owner = "client!ath", name = "g", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method23702(@OriginalArg(0) Object arg0) {
		if (this.aMap14.containsKey(arg0)) {
			throw new IllegalArgumentException("");
		}
		this.anInt3225 += 298510975;
		@Pc(20) int local20 = this.anInt3224 * 451065463;
		if (local20 >= this.aClass437Array1.length) {
			this.method23705(-723917565);
		}
		this.anInt3224 += -404487353;
		if (local20 == 0) {
			this.aClass437Array1[0] = new Class437(arg0, 0);
			this.aMap14.put(arg0, this.aClass437Array1[0]);
		} else {
			this.aClass437Array1[local20] = new Class437(arg0, local20);
			this.aMap14.put(arg0, this.aClass437Array1[local20]);
			this.method23704(local20, 1707588116);
		}
		return true;
	}

	@OriginalMember(owner = "client!ath", name = "e", descriptor = "(IB)V")
	void method23703(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(4) Class437 local4 = this.aClass437Array1[arg0];
		@Pc(11) int local11 = this.anInt3224 * 451065463 >>> 1;
		while (arg0 < local11) {
			@Pc(20) int local20 = (arg0 << 1) + 1;
			@Pc(25) Class437 local25 = this.aClass437Array1[local20];
			@Pc(31) int local31 = (arg0 << 1) + 2;
			@Pc(36) Class437 local36 = this.aClass437Array1[local31];
			@Pc(55) int local55;
			if (this.aComparator1 == null) {
				if (local31 < this.anInt3224 * 451065463 && ((Comparable) local25.anObject18).compareTo(local36.anObject18) > 0) {
					local55 = local31;
				} else {
					local55 = local20;
				}
			} else if (local31 < this.anInt3224 * 451065463 && this.aComparator1.compare(local25.anObject18, local36.anObject18) > 0) {
				local55 = local31;
			} else {
				local55 = local20;
			}
			if (this.aComparator1 == null) {
				if (((Comparable) local4.anObject18).compareTo(this.aClass437Array1[local55].anObject18) <= 0) {
					break;
				}
			} else if (this.aComparator1.compare(local4.anObject18, this.aClass437Array1[local55].anObject18) <= 0) {
				break;
			}
			this.aClass437Array1[arg0] = this.aClass437Array1[local55];
			this.aClass437Array1[arg0].anInt4804 = arg0 * -2050094309;
			arg0 = local55;
		}
		this.aClass437Array1[arg0] = local4;
		this.aClass437Array1[arg0].anInt4804 = arg0 * -2050094309;
	}

	@OriginalMember(owner = "client!ath", name = "contains", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean contains(@OriginalArg(0) Object arg0) {
		return this.aMap14.containsKey(arg0);
	}

	@OriginalMember(owner = "client!ath", name = "toArray", descriptor = "()[Ljava/lang/Object;")
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

	@OriginalMember(owner = "client!ath", name = "f", descriptor = "(II)V")
	void method23704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class437 local4 = this.aClass437Array1[arg0];
		while (arg0 > 0) {
			@Pc(12) int local12 = arg0 - 1 >>> 1;
			@Pc(17) Class437 local17 = this.aClass437Array1[local12];
			if (this.aComparator1 == null) {
				if (((Comparable) local4.anObject18).compareTo(local17.anObject18) >= 0) {
					break;
				}
			} else if (this.aComparator1.compare(local4.anObject18, local17.anObject18) >= 0) {
				break;
			}
			this.aClass437Array1[arg0] = local17;
			this.aClass437Array1[arg0].anInt4804 = arg0 * -2050094309;
			arg0 = local12;
		}
		this.aClass437Array1[arg0] = local4;
		this.aClass437Array1[arg0].anInt4804 = arg0 * -2050094309;
	}

	@OriginalMember(owner = "client!ath", name = "t", descriptor = "(I)V")
	void method23705(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = (this.aClass437Array1.length << 1) + 1;
		this.aClass437Array1 = (Class437[]) Arrays.copyOf(this.aClass437Array1, local7);
	}

	@OriginalMember(owner = "client!ath", name = "j", descriptor = "()Ljava/util/Iterator;")
	public Iterator method23706() {
		return new Class446(this);
	}

	@OriginalMember(owner = "client!ath", name = "a", descriptor = "()Ljava/util/Iterator;")
	public Iterator method23707() {
		return new Class446(this);
	}

	@OriginalMember(owner = "client!ath", name = "b", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method23708(@OriginalArg(0) Object arg0) {
		return this.aMap14.containsKey(arg0);
	}

	@OriginalMember(owner = "client!ath", name = "l", descriptor = "()V")
	void method23709() {
		@Pc(7) int local7 = (this.aClass437Array1.length << 1) + 1;
		this.aClass437Array1 = (Class437[]) Arrays.copyOf(this.aClass437Array1, local7);
	}

	@OriginalMember(owner = "client!ath", name = "o", descriptor = "()Ljava/util/Iterator;")
	public Iterator method23710() {
		return new Class446(this);
	}

	@OriginalMember(owner = "client!ath", name = "i", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method23711(@OriginalArg(0) Object arg0) {
		if (this.aMap14.containsKey(arg0)) {
			throw new IllegalArgumentException("");
		}
		this.anInt3225 += 298510975;
		@Pc(20) int local20 = this.anInt3224 * 451065463;
		if (local20 >= this.aClass437Array1.length) {
			this.method23705(-1699777509);
		}
		this.anInt3224 += -404487353;
		if (local20 == 0) {
			this.aClass437Array1[0] = new Class437(arg0, 0);
			this.aMap14.put(arg0, this.aClass437Array1[0]);
		} else {
			this.aClass437Array1[local20] = new Class437(arg0, local20);
			this.aMap14.put(arg0, this.aClass437Array1[local20]);
			this.method23704(local20, -1878558116);
		}
		return true;
	}

	@OriginalMember(owner = "client!ath", name = "m", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method23712(@OriginalArg(0) Object arg0) {
		if (this.aMap14.containsKey(arg0)) {
			throw new IllegalArgumentException("");
		}
		this.anInt3225 += 298510975;
		@Pc(20) int local20 = this.anInt3224 * 451065463;
		if (local20 >= this.aClass437Array1.length) {
			this.method23705(-1556851740);
		}
		this.anInt3224 += -404487353;
		if (local20 == 0) {
			this.aClass437Array1[0] = new Class437(arg0, 0);
			this.aMap14.put(arg0, this.aClass437Array1[0]);
		} else {
			this.aClass437Array1[local20] = new Class437(arg0, local20);
			this.aMap14.put(arg0, this.aClass437Array1[local20]);
			this.method23704(local20, -1634375656);
		}
		return true;
	}

	@OriginalMember(owner = "client!ath", name = "p", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method23713(@OriginalArg(0) Object arg0) {
		@Pc(5) Class437 local5 = (Class437) this.aMap14.remove(arg0);
		if (local5 == null) {
			return false;
		}
		this.anInt3225 += 298510975;
		this.anInt3224 -= -404487353;
		if (local5.anInt4804 * 465393427 == this.anInt3224 * 451065463) {
			this.aClass437Array1[this.anInt3224 * 451065463] = null;
			return true;
		}
		@Pc(49) Class437 local49 = this.aClass437Array1[this.anInt3224 * 451065463];
		this.aClass437Array1[this.anInt3224 * 451065463] = null;
		this.aClass437Array1[local5.anInt4804 * 465393427] = local49;
		this.aClass437Array1[local5.anInt4804 * 465393427].anInt4804 = local5.anInt4804;
		this.method23703(local5.anInt4804 * 465393427, (byte) 86);
		if (this.aClass437Array1[local5.anInt4804 * 465393427] == local49) {
			this.method23704(local5.anInt4804 * 465393427, -502612183);
		}
		return true;
	}

	@OriginalMember(owner = "client!ath", name = "k", descriptor = "()Ljava/lang/Object;")
	public Object method23714() {
		return this.anInt3224 * 451065463 == 0 ? null : this.aClass437Array1[0].anObject18;
	}

	@OriginalMember(owner = "client!ath", name = "y", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method23715(@OriginalArg(0) Object arg0) {
		@Pc(5) Class437 local5 = (Class437) this.aMap14.remove(arg0);
		if (local5 == null) {
			return false;
		}
		this.anInt3225 += 298510975;
		this.anInt3224 -= -404487353;
		if (local5.anInt4804 * 465393427 == this.anInt3224 * 451065463) {
			this.aClass437Array1[this.anInt3224 * 451065463] = null;
			return true;
		}
		@Pc(49) Class437 local49 = this.aClass437Array1[this.anInt3224 * 451065463];
		this.aClass437Array1[this.anInt3224 * 451065463] = null;
		this.aClass437Array1[local5.anInt4804 * 465393427] = local49;
		this.aClass437Array1[local5.anInt4804 * 465393427].anInt4804 = local5.anInt4804;
		this.method23703(local5.anInt4804 * 465393427, (byte) 80);
		if (this.aClass437Array1[local5.anInt4804 * 465393427] == local49) {
			this.method23704(local5.anInt4804 * 465393427, -1934047364);
		}
		return true;
	}

	@OriginalMember(owner = "client!ath", name = "w", descriptor = "()Ljava/lang/Object;")
	public Object method23716() {
		if (this.anInt3224 * 451065463 == 0) {
			return null;
		}
		this.anInt3225 += 298510975;
		@Pc(19) Object local19 = this.aClass437Array1[0].anObject18;
		this.aMap14.remove(local19);
		this.anInt3224 -= -404487353;
		if (this.anInt3224 * 451065463 == 0) {
			this.aClass437Array1[this.anInt3224 * 451065463] = null;
		} else {
			this.aClass437Array1[0] = this.aClass437Array1[this.anInt3224 * 451065463];
			this.aClass437Array1[0].anInt4804 = 0;
			this.aClass437Array1[this.anInt3224 * 451065463] = null;
			this.method23703(0, (byte) 16);
		}
		return local19;
	}

	@OriginalMember(owner = "client!ath", name = "z", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method23717(@OriginalArg(0) Object arg0) {
		@Pc(5) Class437 local5 = (Class437) this.aMap14.remove(arg0);
		if (local5 == null) {
			return false;
		}
		this.anInt3225 += 298510975;
		this.anInt3224 -= -404487353;
		if (local5.anInt4804 * 465393427 == this.anInt3224 * 451065463) {
			this.aClass437Array1[this.anInt3224 * 451065463] = null;
			return true;
		}
		@Pc(49) Class437 local49 = this.aClass437Array1[this.anInt3224 * 451065463];
		this.aClass437Array1[this.anInt3224 * 451065463] = null;
		this.aClass437Array1[local5.anInt4804 * 465393427] = local49;
		this.aClass437Array1[local5.anInt4804 * 465393427].anInt4804 = local5.anInt4804;
		this.method23703(local5.anInt4804 * 465393427, (byte) 60);
		if (this.aClass437Array1[local5.anInt4804 * 465393427] == local49) {
			this.method23704(local5.anInt4804 * 465393427, -1332600636);
		}
		return true;
	}

	@OriginalMember(owner = "client!ath", name = "remove", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean remove(@OriginalArg(0) Object arg0) {
		@Pc(5) Class437 local5 = (Class437) this.aMap14.remove(arg0);
		if (local5 == null) {
			return false;
		}
		this.anInt3225 += 298510975;
		this.anInt3224 -= -404487353;
		if (local5.anInt4804 * 465393427 == this.anInt3224 * 451065463) {
			this.aClass437Array1[this.anInt3224 * 451065463] = null;
			return true;
		}
		@Pc(49) Class437 local49 = this.aClass437Array1[this.anInt3224 * 451065463];
		this.aClass437Array1[this.anInt3224 * 451065463] = null;
		this.aClass437Array1[local5.anInt4804 * 465393427] = local49;
		this.aClass437Array1[local5.anInt4804 * 465393427].anInt4804 = local5.anInt4804;
		this.method23703(local5.anInt4804 * 465393427, (byte) 20);
		if (this.aClass437Array1[local5.anInt4804 * 465393427] == local49) {
			this.method23704(local5.anInt4804 * 465393427, -1732514375);
		}
		return true;
	}

	@OriginalMember(owner = "client!ath", name = "v", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method23718(@OriginalArg(0) Object arg0) {
		@Pc(5) Class437 local5 = (Class437) this.aMap14.remove(arg0);
		if (local5 == null) {
			return false;
		}
		this.anInt3225 += 298510975;
		this.anInt3224 -= -404487353;
		if (local5.anInt4804 * 465393427 == this.anInt3224 * 451065463) {
			this.aClass437Array1[this.anInt3224 * 451065463] = null;
			return true;
		}
		@Pc(49) Class437 local49 = this.aClass437Array1[this.anInt3224 * 451065463];
		this.aClass437Array1[this.anInt3224 * 451065463] = null;
		this.aClass437Array1[local5.anInt4804 * 465393427] = local49;
		this.aClass437Array1[local5.anInt4804 * 465393427].anInt4804 = local5.anInt4804;
		this.method23703(local5.anInt4804 * 465393427, (byte) 71);
		if (this.aClass437Array1[local5.anInt4804 * 465393427] == local49) {
			this.method23704(local5.anInt4804 * 465393427, -1597574104);
		}
		return true;
	}

	@OriginalMember(owner = "client!ath", name = "s", descriptor = "()Ljava/lang/Object;")
	public Object method23719() {
		return this.anInt3224 * 451065463 == 0 ? null : this.aClass437Array1[0].anObject18;
	}

	@OriginalMember(owner = "client!ath", name = "n", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method23720(@OriginalArg(0) Object arg0) {
		@Pc(5) Class437 local5 = (Class437) this.aMap14.remove(arg0);
		if (local5 == null) {
			return false;
		}
		this.anInt3225 += 298510975;
		this.anInt3224 -= -404487353;
		if (local5.anInt4804 * 465393427 == this.anInt3224 * 451065463) {
			this.aClass437Array1[this.anInt3224 * 451065463] = null;
			return true;
		}
		@Pc(49) Class437 local49 = this.aClass437Array1[this.anInt3224 * 451065463];
		this.aClass437Array1[this.anInt3224 * 451065463] = null;
		this.aClass437Array1[local5.anInt4804 * 465393427] = local49;
		this.aClass437Array1[local5.anInt4804 * 465393427].anInt4804 = local5.anInt4804;
		this.method23703(local5.anInt4804 * 465393427, (byte) 114);
		if (this.aClass437Array1[local5.anInt4804 * 465393427] == local49) {
			this.method23704(local5.anInt4804 * 465393427, -1077253598);
		}
		return true;
	}

	@OriginalMember(owner = "client!ath", name = "u", descriptor = "()V")
	void method23721() {
		@Pc(7) int local7 = (this.aClass437Array1.length << 1) + 1;
		this.aClass437Array1 = (Class437[]) Arrays.copyOf(this.aClass437Array1, local7);
	}

	@OriginalMember(owner = "client!ath", name = "h", descriptor = "(I)V")
	void method23722(@OriginalArg(0) int arg0) {
		@Pc(4) Class437 local4 = this.aClass437Array1[arg0];
		@Pc(11) int local11 = this.anInt3224 * 451065463 >>> 1;
		while (arg0 < local11) {
			@Pc(20) int local20 = (arg0 << 1) + 1;
			@Pc(25) Class437 local25 = this.aClass437Array1[local20];
			@Pc(31) int local31 = (arg0 << 1) + 2;
			@Pc(36) Class437 local36 = this.aClass437Array1[local31];
			@Pc(55) int local55;
			if (this.aComparator1 == null) {
				if (local31 < this.anInt3224 * 451065463 && ((Comparable) local25.anObject18).compareTo(local36.anObject18) > 0) {
					local55 = local31;
				} else {
					local55 = local20;
				}
			} else if (local31 < this.anInt3224 * 451065463 && this.aComparator1.compare(local25.anObject18, local36.anObject18) > 0) {
				local55 = local31;
			} else {
				local55 = local20;
			}
			if (this.aComparator1 == null) {
				if (((Comparable) local4.anObject18).compareTo(this.aClass437Array1[local55].anObject18) <= 0) {
					break;
				}
			} else if (this.aComparator1.compare(local4.anObject18, this.aClass437Array1[local55].anObject18) <= 0) {
				break;
			}
			this.aClass437Array1[arg0] = this.aClass437Array1[local55];
			this.aClass437Array1[arg0].anInt4804 = arg0 * -2050094309;
			arg0 = local55;
		}
		this.aClass437Array1[arg0] = local4;
		this.aClass437Array1[arg0].anInt4804 = arg0 * -2050094309;
	}

	@OriginalMember(owner = "client!ath", name = "d", descriptor = "(I)V")
	void method23723(@OriginalArg(0) int arg0) {
		@Pc(4) Class437 local4 = this.aClass437Array1[arg0];
		@Pc(11) int local11 = this.anInt3224 * 451065463 >>> 1;
		while (arg0 < local11) {
			@Pc(20) int local20 = (arg0 << 1) + 1;
			@Pc(25) Class437 local25 = this.aClass437Array1[local20];
			@Pc(31) int local31 = (arg0 << 1) + 2;
			@Pc(36) Class437 local36 = this.aClass437Array1[local31];
			@Pc(55) int local55;
			if (this.aComparator1 == null) {
				if (local31 < this.anInt3224 * 451065463 && ((Comparable) local25.anObject18).compareTo(local36.anObject18) > 0) {
					local55 = local31;
				} else {
					local55 = local20;
				}
			} else if (local31 < this.anInt3224 * 451065463 && this.aComparator1.compare(local25.anObject18, local36.anObject18) > 0) {
				local55 = local31;
			} else {
				local55 = local20;
			}
			if (this.aComparator1 == null) {
				if (((Comparable) local4.anObject18).compareTo(this.aClass437Array1[local55].anObject18) <= 0) {
					break;
				}
			} else if (this.aComparator1.compare(local4.anObject18, this.aClass437Array1[local55].anObject18) <= 0) {
				break;
			}
			this.aClass437Array1[arg0] = this.aClass437Array1[local55];
			this.aClass437Array1[arg0].anInt4804 = arg0 * -2050094309;
			arg0 = local55;
		}
		this.aClass437Array1[arg0] = local4;
		this.aClass437Array1[arg0].anInt4804 = arg0 * -2050094309;
	}

	@OriginalMember(owner = "client!ath", name = "c", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method23724(@OriginalArg(0) Object arg0) {
		return this.aMap14.containsKey(arg0);
	}

	@OriginalMember(owner = "client!ath", name = "aq", descriptor = "()[Ljava/lang/Object;")
	public Object[] method23725() {
		@Pc(2) Object[] local2 = super.toArray();
		if (this.aComparator1 == null) {
			Arrays.sort(local2);
		} else {
			Arrays.sort(local2, this.aComparator1);
		}
		return local2;
	}

	@OriginalMember(owner = "client!ath", name = "ax", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method23726(@OriginalArg(0) Object arg0) {
		return this.aMap14.containsKey(arg0);
	}

	@OriginalMember(owner = "client!ath", name = "ay", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method23727(@OriginalArg(0) Object arg0) {
		return this.aMap14.containsKey(arg0);
	}

	@OriginalMember(owner = "client!ath", name = "iterator", descriptor = "()Ljava/util/Iterator;")
	@Override
	public Iterator iterator() {
		return new Class446(this);
	}

	@OriginalMember(owner = "client!ath", name = "ai", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method23728(@OriginalArg(0) Object arg0) {
		return this.aMap14.containsKey(arg0);
	}

	@OriginalMember(owner = "client!ath", name = "ao", descriptor = "()[Ljava/lang/Object;")
	public Object[] method23729() {
		@Pc(2) Object[] local2 = super.toArray();
		if (this.aComparator1 == null) {
			Arrays.sort(local2);
		} else {
			Arrays.sort(local2, this.aComparator1);
		}
		return local2;
	}

	@OriginalMember(owner = "client!ath", name = "bt", descriptor = "()I")
	public int method23730() {
		return this.anInt3224 * 451065463;
	}

	@OriginalMember(owner = "client!ath", name = "bs", descriptor = "()I")
	public int method23731() {
		return this.anInt3224 * 451065463;
	}

	@OriginalMember(owner = "client!ath", name = "q", descriptor = "(I)V")
	void method23732(@OriginalArg(0) int arg0) {
		@Pc(4) Class437 local4 = this.aClass437Array1[arg0];
		@Pc(11) int local11 = this.anInt3224 * 451065463 >>> 1;
		while (arg0 < local11) {
			@Pc(20) int local20 = (arg0 << 1) + 1;
			@Pc(25) Class437 local25 = this.aClass437Array1[local20];
			@Pc(31) int local31 = (arg0 << 1) + 2;
			@Pc(36) Class437 local36 = this.aClass437Array1[local31];
			@Pc(55) int local55;
			if (this.aComparator1 == null) {
				if (local31 < this.anInt3224 * 451065463 && ((Comparable) local25.anObject18).compareTo(local36.anObject18) > 0) {
					local55 = local31;
				} else {
					local55 = local20;
				}
			} else if (local31 < this.anInt3224 * 451065463 && this.aComparator1.compare(local25.anObject18, local36.anObject18) > 0) {
				local55 = local31;
			} else {
				local55 = local20;
			}
			if (this.aComparator1 == null) {
				if (((Comparable) local4.anObject18).compareTo(this.aClass437Array1[local55].anObject18) <= 0) {
					break;
				}
			} else if (this.aComparator1.compare(local4.anObject18, this.aClass437Array1[local55].anObject18) <= 0) {
				break;
			}
			this.aClass437Array1[arg0] = this.aClass437Array1[local55];
			this.aClass437Array1[arg0].anInt4804 = arg0 * -2050094309;
			arg0 = local55;
		}
		this.aClass437Array1[arg0] = local4;
		this.aClass437Array1[arg0].anInt4804 = arg0 * -2050094309;
	}

	@OriginalMember(owner = "client!ath", name = "by", descriptor = "()I")
	public int method23733() {
		return this.anInt3224 * 451065463;
	}
}
