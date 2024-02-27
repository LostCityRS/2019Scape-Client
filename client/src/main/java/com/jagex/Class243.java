package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ej")
public final class Class243 {

	@OriginalMember(owner = "client!ej", name = "l", descriptor = "Lclient!ei;")
	Interface20 anInterface20_1;

	@OriginalMember(owner = "client!ej", name = "u", descriptor = "Lclient!aaa;")
	SecondaryLinkedList aSecondaryLinkedList_13;

	@OriginalMember(owner = "client!ej", name = "t", descriptor = "I")
	int anInt3860;

	@OriginalMember(owner = "client!ej", name = "f", descriptor = "I")
	int anInt3859;

	@OriginalMember(owner = "client!ej", name = "e", descriptor = "Lclient!aax;")
	Class24 aClass24_23;

	@OriginalMember(owner = "client!ej", name = "acc", descriptor = "(Lclient!yp;I)V")
	static void method26295(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		if (Class327.aClass378_1 == null) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 1;
			arg0.aClass378_3 = Class327.aClass378_1;
			arg0.aMap23.put(Class143.aClass143_63, Class699.method37067(arg0.aClass378_3, -1533298205));
		}
	}

	@OriginalMember(owner = "client!ej", name = "i", descriptor = "(Lclient!aqc;I)V")
	public static void method26296(@OriginalArg(0) Class120_Sub1_Sub1_Sub1_Sub2 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class80_Sub21 local8 = (Class80_Sub21) Class80_Sub21.aClass24_12.method560((long) (arg0.anInt2671 * 1078276675));
		if (local8 == null) {
			return;
		}
		if (local8.aClass529_3 != null) {
			local8.aClass529_3.method30788(100, -1910883393);
			Class490.aClass263_13.method26582(local8.aClass529_3, (byte) 6);
			local8.aClass529_3 = null;
		}
		local8.method24395((byte) 119);
	}

	@OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(II)V")
	public Class243(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aSecondaryLinkedList_13 = new SecondaryLinkedList();
		this.anInt3860 = arg0 * -809765537;
		this.anInt3859 = arg0 * 923192057;
		@Pc(18) int local18;
		for (local18 = 1; local18 + local18 < arg0 && local18 < arg1; local18 += local18) {
		}
		this.aClass24_23 = new Class24(local18);
	}

	@OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(I)V")
	public Class243(@OriginalArg(0) int arg0) {
		this(arg0, arg0);
	}

	@OriginalMember(owner = "client!ej", name = "i", descriptor = "(IB)V")
	public void method26247(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		for (@Pc(5) Class80_Sub1_Sub16 local5 = (Class80_Sub1_Sub16) this.aSecondaryLinkedList_13.head((byte) 20); local5 != null; local5 = (Class80_Sub1_Sub16) this.aSecondaryLinkedList_13.next((byte) -102)) {
			if (local5.method24077((byte) 9)) {
				if (local5.method24083(1431977934) == null) {
					local5.method24395((byte) 18);
					local5.unlinkSecondary(Integer.MIN_VALUE);
					this.anInt3859 += local5.anInt3267 * 98561721;
				}
			} else if ((local5.dualKey += -4191731634426926145L) * 4203303297430504511L > (long) arg0) {
				@Pc(56) Class80_Sub1_Sub16_Sub2 local56 = new Class80_Sub1_Sub16_Sub2(local5.method24083(1136664039), local5.anInt3267 * -726568511);
				this.aClass24_23.method563(local56, local5.aLong338 * 3209506792906532031L);
				Class653.method33145(local56, local5, 191527309);
				local5.method24395((byte) 13);
				local5.unlinkSecondary(-2147483646);
			}
		}
	}

	@OriginalMember(owner = "client!ej", name = "t", descriptor = "(Lclient!ei;B)V")
	public void method26248(@OriginalArg(0) Interface20 arg0, @OriginalArg(1) byte arg1) {
		this.anInterface20_1 = arg0;
	}

	@OriginalMember(owner = "client!ej", name = "aj", descriptor = "()I")
	public int method26249() {
		return this.anInt3860 * -382097761;
	}

	@OriginalMember(owner = "client!ej", name = "w", descriptor = "(Lclient!ei;)V")
	public void method26250(@OriginalArg(0) Interface20 arg0) {
		this.anInterface20_1 = arg0;
	}

	@OriginalMember(owner = "client!ej", name = "e", descriptor = "(J)V")
	public void method26251(@OriginalArg(0) long arg0) {
		@Pc(5) Class80_Sub1_Sub16 local5 = (Class80_Sub1_Sub16) this.aClass24_23.method560(arg0);
		this.method26252(local5, -1274221019);
	}

	@OriginalMember(owner = "client!ej", name = "u", descriptor = "(Lclient!asl;I)V")
	void method26252(@OriginalArg(0) Class80_Sub1_Sub16 arg0, @OriginalArg(1) int arg1) {
		if (arg0 != null) {
			arg0.method24395((byte) 85);
			arg0.unlinkSecondary(-2147483641);
			this.anInt3859 += arg0.anInt3267 * 98561721;
		}
	}

	@OriginalMember(owner = "client!ej", name = "l", descriptor = "(Ljava/lang/Object;J)V")
	public void method26253(@OriginalArg(0) Object arg0, @OriginalArg(1) long arg1) {
		this.method26254(arg0, arg1, 1, (byte) -125);
	}

	@OriginalMember(owner = "client!ej", name = "g", descriptor = "(Ljava/lang/Object;JIB)V")
	public void method26254(@OriginalArg(0) Object arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		if (arg2 > this.anInt3860 * -382097761) {
			throw new IllegalStateException();
		}
		this.method26251(arg1);
		this.anInt3859 -= arg2 * 923192057;
		while (this.anInt3859 * -1801332919 < 0) {
			@Pc(31) Class80_Sub1_Sub16 local31 = (Class80_Sub1_Sub16) this.aSecondaryLinkedList_13.method67(-1701292623);
			if (local31 == null) {
				throw new RuntimeException("");
			}
			if (!local31.method24077((byte) 57)) {
			}
			this.method26252(local31, -2047499866);
			if (this.anInterface20_1 != null) {
				this.anInterface20_1.method26695(local31.method24083(1569385038), (byte) 59);
			}
		}
		@Pc(63) Class80_Sub1_Sub16_Sub1 local63 = new Class80_Sub1_Sub16_Sub1(arg0, arg2);
		this.aClass24_23.method563(local63, arg1);
		this.aSecondaryLinkedList_13.addTail(local63, 1599142138);
		local63.dualKey = 0L;
	}

	@OriginalMember(owner = "client!ej", name = "r", descriptor = "(Lclient!ei;)V")
	public void method26255(@OriginalArg(0) Interface20 arg0) {
		this.anInterface20_1 = arg0;
	}

	@OriginalMember(owner = "client!ej", name = "m", descriptor = "(I)V")
	public void method26256(@OriginalArg(0) int arg0) {
		this.aSecondaryLinkedList_13.method41(-252802305);
		this.aClass24_23.method564(979681382);
		this.anInt3859 = this.anInt3860 * 1732675239;
	}

	@OriginalMember(owner = "client!ej", name = "j", descriptor = "(B)I")
	public int method26257(@OriginalArg(0) byte arg0) {
		return this.anInt3859 * -1801332919;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)I")
	public int method26258(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		for (@Pc(7) Class80_Sub1_Sub16 local7 = (Class80_Sub1_Sub16) this.aSecondaryLinkedList_13.head((byte) -114); local7 != null; local7 = (Class80_Sub1_Sub16) this.aSecondaryLinkedList_13.next((byte) -102)) {
			if (!local7.method24077((byte) 56)) {
				local1++;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!ej", name = "s", descriptor = "(B)V")
	public void method26259(@OriginalArg(0) byte arg0) {
		for (@Pc(5) Class80_Sub1_Sub16 local5 = (Class80_Sub1_Sub16) this.aSecondaryLinkedList_13.head((byte) -35); local5 != null; local5 = (Class80_Sub1_Sub16) this.aSecondaryLinkedList_13.next((byte) -102)) {
			if (local5.method24077((byte) 111)) {
				local5.method24395((byte) 99);
				local5.unlinkSecondary(-2147483642);
				this.anInt3859 += local5.anInt3267 * 98561721;
			}
		}
	}

	@OriginalMember(owner = "client!ej", name = "ab", descriptor = "()I")
	public int method26260() {
		return this.anInt3859 * -1801332919;
	}

	@OriginalMember(owner = "client!ej", name = "af", descriptor = "()V")
	public void method26261() {
		for (@Pc(5) Class80_Sub1_Sub16 local5 = (Class80_Sub1_Sub16) this.aSecondaryLinkedList_13.head((byte) -61); local5 != null; local5 = (Class80_Sub1_Sub16) this.aSecondaryLinkedList_13.next((byte) -102)) {
			if (local5.method24077((byte) 125)) {
				local5.method24395((byte) 14);
				local5.unlinkSecondary(-2147483642);
				this.anInt3859 += local5.anInt3267 * 98561721;
			}
		}
	}

	@OriginalMember(owner = "client!ej", name = "ag", descriptor = "()I")
	public int method26262() {
		return this.anInt3859 * -1801332919;
	}

	@OriginalMember(owner = "client!ej", name = "x", descriptor = "(I)Ljava/lang/Object;")
	public Object method26263(@OriginalArg(0) int arg0) {
		@Pc(5) Class80_Sub1_Sub16 local5 = (Class80_Sub1_Sub16) this.aClass24_23.method566((byte) 7);
		while (local5 != null) {
			@Pc(12) Object local12 = local5.method24083(1579897710);
			if (local12 != null) {
				return local12;
			}
			@Pc(16) Class80_Sub1_Sub16 local16 = local5;
			local5 = (Class80_Sub1_Sub16) this.aClass24_23.method566((byte) 7);
			local16.method24395((byte) 83);
			local16.unlinkSecondary(-2147483642);
			this.anInt3859 += local16.anInt3267 * 98561721;
		}
		return null;
	}

	@OriginalMember(owner = "client!ej", name = "q", descriptor = "(Lclient!ei;)V")
	public void method26264(@OriginalArg(0) Interface20 arg0) {
		this.anInterface20_1 = arg0;
	}

	@OriginalMember(owner = "client!ej", name = "h", descriptor = "(J)Ljava/lang/Object;")
	public Object method26265(@OriginalArg(0) long arg0) {
		@Pc(5) Class80_Sub1_Sub16 local5 = (Class80_Sub1_Sub16) this.aClass24_23.method560(arg0);
		if (local5 == null) {
			return null;
		}
		@Pc(13) Object local13 = local5.method24083(1492515577);
		if (local13 == null) {
			local5.method24395((byte) 16);
			local5.unlinkSecondary(-2147483640);
			this.anInt3859 += local5.anInt3267 * 98561721;
			return null;
		}
		if (local5.method24077((byte) 57)) {
			@Pc(46) Class80_Sub1_Sub16_Sub1 local46 = new Class80_Sub1_Sub16_Sub1(local13, local5.anInt3267 * -726568511);
			this.aClass24_23.method563(local46, local5.aLong338 * 3209506792906532031L);
			this.aSecondaryLinkedList_13.addTail(local46, 1599142138);
			local46.dualKey = 0L;
			local5.method24395((byte) 110);
			local5.unlinkSecondary(-2147483640);
		} else {
			this.aSecondaryLinkedList_13.addTail(local5, 1599142138);
			local5.dualKey = 0L;
		}
		return local13;
	}

	@OriginalMember(owner = "client!ej", name = "d", descriptor = "(J)Ljava/lang/Object;")
	public Object method26266(@OriginalArg(0) long arg0) {
		@Pc(5) Class80_Sub1_Sub16 local5 = (Class80_Sub1_Sub16) this.aClass24_23.method560(arg0);
		if (local5 == null) {
			return null;
		}
		@Pc(13) Object local13 = local5.method24083(2111785577);
		if (local13 == null) {
			local5.method24395((byte) 41);
			local5.unlinkSecondary(-2147483646);
			this.anInt3859 += local5.anInt3267 * 98561721;
			return null;
		}
		if (local5.method24077((byte) 14)) {
			@Pc(46) Class80_Sub1_Sub16_Sub1 local46 = new Class80_Sub1_Sub16_Sub1(local13, local5.anInt3267 * -726568511);
			this.aClass24_23.method563(local46, local5.aLong338 * 3209506792906532031L);
			this.aSecondaryLinkedList_13.addTail(local46, 1599142138);
			local46.dualKey = 0L;
			local5.method24395((byte) 104);
			local5.unlinkSecondary(-2147483644);
		} else {
			this.aSecondaryLinkedList_13.addTail(local5, 1599142138);
			local5.dualKey = 0L;
		}
		return local13;
	}

	@OriginalMember(owner = "client!ej", name = "z", descriptor = "(J)Ljava/lang/Object;")
	public Object method26267(@OriginalArg(0) long arg0) {
		@Pc(5) Class80_Sub1_Sub16 local5 = (Class80_Sub1_Sub16) this.aClass24_23.method560(arg0);
		if (local5 == null) {
			return null;
		}
		@Pc(13) Object local13 = local5.method24083(2030622721);
		if (local13 == null) {
			local5.method24395((byte) 66);
			local5.unlinkSecondary(-2147483646);
			this.anInt3859 += local5.anInt3267 * 98561721;
			return null;
		}
		if (local5.method24077((byte) 99)) {
			@Pc(46) Class80_Sub1_Sub16_Sub1 local46 = new Class80_Sub1_Sub16_Sub1(local13, local5.anInt3267 * -726568511);
			this.aClass24_23.method563(local46, local5.aLong338 * 3209506792906532031L);
			this.aSecondaryLinkedList_13.addTail(local46, 1599142138);
			local46.dualKey = 0L;
			local5.method24395((byte) 87);
			local5.unlinkSecondary(-2147483643);
		} else {
			this.aSecondaryLinkedList_13.addTail(local5, 1599142138);
			local5.dualKey = 0L;
		}
		return local13;
	}

	@OriginalMember(owner = "client!ej", name = "p", descriptor = "(J)V")
	public void method26268(@OriginalArg(0) long arg0) {
		@Pc(5) Class80_Sub1_Sub16 local5 = (Class80_Sub1_Sub16) this.aClass24_23.method560(arg0);
		this.method26252(local5, -1684693553);
	}

	@OriginalMember(owner = "client!ej", name = "v", descriptor = "(J)V")
	public void method26269(@OriginalArg(0) long arg0) {
		@Pc(5) Class80_Sub1_Sub16 local5 = (Class80_Sub1_Sub16) this.aClass24_23.method560(arg0);
		this.method26252(local5, -1451879964);
	}

	@OriginalMember(owner = "client!ej", name = "y", descriptor = "(Lclient!asl;)V")
	void method26270(@OriginalArg(0) Class80_Sub1_Sub16 arg0) {
		if (arg0 != null) {
			arg0.method24395((byte) 112);
			arg0.unlinkSecondary(-2147483646);
			this.anInt3859 += arg0.anInt3267 * 98561721;
		}
	}

	@OriginalMember(owner = "client!ej", name = "n", descriptor = "(Lclient!asl;)V")
	void method26271(@OriginalArg(0) Class80_Sub1_Sub16 arg0) {
		if (arg0 != null) {
			arg0.method24395((byte) 9);
			arg0.unlinkSecondary(Integer.MIN_VALUE);
			this.anInt3859 += arg0.anInt3267 * 98561721;
		}
	}

	@OriginalMember(owner = "client!ej", name = "c", descriptor = "(Ljava/lang/Object;JI)V")
	public void method26272(@OriginalArg(0) Object arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		if (arg2 > this.anInt3860 * -382097761) {
			throw new IllegalStateException();
		}
		this.method26251(arg1);
		this.anInt3859 -= arg2 * 923192057;
		while (this.anInt3859 * -1801332919 < 0) {
			@Pc(31) Class80_Sub1_Sub16 local31 = (Class80_Sub1_Sub16) this.aSecondaryLinkedList_13.method67(-998431199);
			if (local31 == null) {
				throw new RuntimeException("");
			}
			if (!local31.method24077((byte) 33)) {
			}
			this.method26252(local31, -1865391263);
			if (this.anInterface20_1 != null) {
				this.anInterface20_1.method26695(local31.method24083(1218794373), (byte) 6);
			}
		}
		@Pc(63) Class80_Sub1_Sub16_Sub1 local63 = new Class80_Sub1_Sub16_Sub1(arg0, arg2);
		this.aClass24_23.method563(local63, arg1);
		this.aSecondaryLinkedList_13.addTail(local63, 1599142138);
		local63.dualKey = 0L;
	}

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(Ljava/lang/Object;JI)V")
	public void method26273(@OriginalArg(0) Object arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		if (arg2 > this.anInt3860 * -382097761) {
			throw new IllegalStateException();
		}
		this.method26251(arg1);
		this.anInt3859 -= arg2 * 923192057;
		while (this.anInt3859 * -1801332919 < 0) {
			@Pc(31) Class80_Sub1_Sub16 local31 = (Class80_Sub1_Sub16) this.aSecondaryLinkedList_13.method67(-157380689);
			if (local31 == null) {
				throw new RuntimeException("");
			}
			if (!local31.method24077((byte) 110)) {
			}
			this.method26252(local31, -1195341599);
			if (this.anInterface20_1 != null) {
				this.anInterface20_1.method26695(local31.method24083(1290435897), (byte) 121);
			}
		}
		@Pc(63) Class80_Sub1_Sub16_Sub1 local63 = new Class80_Sub1_Sub16_Sub1(arg0, arg2);
		this.aClass24_23.method563(local63, arg1);
		this.aSecondaryLinkedList_13.addTail(local63, 1599142138);
		local63.dualKey = 0L;
	}

	@OriginalMember(owner = "client!ej", name = "ax", descriptor = "(I)V")
	public void method26274(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class80_Sub1_Sub16 local5 = (Class80_Sub1_Sub16) this.aSecondaryLinkedList_13.head((byte) 31); local5 != null; local5 = (Class80_Sub1_Sub16) this.aSecondaryLinkedList_13.next((byte) -102)) {
			if (local5.method24077((byte) 117)) {
				if (local5.method24083(1442897376) == null) {
					local5.method24395((byte) 66);
					local5.unlinkSecondary(-2147483643);
					this.anInt3859 += local5.anInt3267 * 98561721;
				}
			} else if ((local5.dualKey += -4191731634426926145L) * 4203303297430504511L > (long) arg0) {
				@Pc(56) Class80_Sub1_Sub16_Sub2 local56 = new Class80_Sub1_Sub16_Sub2(local5.method24083(1466483816), local5.anInt3267 * -726568511);
				this.aClass24_23.method563(local56, local5.aLong338 * 3209506792906532031L);
				Class653.method33145(local56, local5, -643964363);
				local5.method24395((byte) 43);
				local5.unlinkSecondary(Integer.MIN_VALUE);
			}
		}
	}

	@OriginalMember(owner = "client!ej", name = "ay", descriptor = "(I)V")
	public void method26275(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class80_Sub1_Sub16 local5 = (Class80_Sub1_Sub16) this.aSecondaryLinkedList_13.head((byte) 74); local5 != null; local5 = (Class80_Sub1_Sub16) this.aSecondaryLinkedList_13.next((byte) -102)) {
			if (local5.method24077((byte) 4)) {
				if (local5.method24083(2065040954) == null) {
					local5.method24395((byte) 22);
					local5.unlinkSecondary(-2147483646);
					this.anInt3859 += local5.anInt3267 * 98561721;
				}
			} else if ((local5.dualKey += -4191731634426926145L) * 4203303297430504511L > (long) arg0) {
				@Pc(56) Class80_Sub1_Sub16_Sub2 local56 = new Class80_Sub1_Sub16_Sub2(local5.method24083(1284372645), local5.anInt3267 * -726568511);
				this.aClass24_23.method563(local56, local5.aLong338 * 3209506792906532031L);
				Class653.method33145(local56, local5, 537149134);
				local5.method24395((byte) 66);
				local5.unlinkSecondary(-2147483647);
			}
		}
	}

	@OriginalMember(owner = "client!ej", name = "ai", descriptor = "(I)V")
	public void method26276(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class80_Sub1_Sub16 local5 = (Class80_Sub1_Sub16) this.aSecondaryLinkedList_13.head((byte) -53); local5 != null; local5 = (Class80_Sub1_Sub16) this.aSecondaryLinkedList_13.next((byte) -102)) {
			if (local5.method24077((byte) 64)) {
				if (local5.method24083(1594971793) == null) {
					local5.method24395((byte) 110);
					local5.unlinkSecondary(-2147483647);
					this.anInt3859 += local5.anInt3267 * 98561721;
				}
			} else if ((local5.dualKey += -4191731634426926145L) * 4203303297430504511L > (long) arg0) {
				@Pc(56) Class80_Sub1_Sub16_Sub2 local56 = new Class80_Sub1_Sub16_Sub2(local5.method24083(2139619403), local5.anInt3267 * -726568511);
				this.aClass24_23.method563(local56, local5.aLong338 * 3209506792906532031L);
				Class653.method33145(local56, local5, 317127973);
				local5.method24395((byte) 60);
				local5.unlinkSecondary(Integer.MIN_VALUE);
			}
		}
	}

	@OriginalMember(owner = "client!ej", name = "aq", descriptor = "(I)V")
	public void method26277(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class80_Sub1_Sub16 local5 = (Class80_Sub1_Sub16) this.aSecondaryLinkedList_13.head((byte) 88); local5 != null; local5 = (Class80_Sub1_Sub16) this.aSecondaryLinkedList_13.next((byte) -102)) {
			if (local5.method24077((byte) 10)) {
				if (local5.method24083(1194644026) == null) {
					local5.method24395((byte) 108);
					local5.unlinkSecondary(-2147483644);
					this.anInt3859 += local5.anInt3267 * 98561721;
				}
			} else if ((local5.dualKey += -4191731634426926145L) * 4203303297430504511L > (long) arg0) {
				@Pc(56) Class80_Sub1_Sub16_Sub2 local56 = new Class80_Sub1_Sub16_Sub2(local5.method24083(1387657915), local5.anInt3267 * -726568511);
				this.aClass24_23.method563(local56, local5.aLong338 * 3209506792906532031L);
				Class653.method33145(local56, local5, 1853031354);
				local5.method24395((byte) 37);
				local5.unlinkSecondary(-2147483645);
			}
		}
	}

	@OriginalMember(owner = "client!ej", name = "ao", descriptor = "()V")
	public void method26278() {
		this.aSecondaryLinkedList_13.method41(-252802305);
		this.aClass24_23.method564(-843476475);
		this.anInt3859 = this.anInt3860 * 1732675239;
	}

	@OriginalMember(owner = "client!ej", name = "o", descriptor = "(B)I")
	public int method26279(@OriginalArg(0) byte arg0) {
		return this.anInt3860 * -382097761;
	}

	@OriginalMember(owner = "client!ej", name = "ac", descriptor = "()I")
	public int method26280() {
		return this.anInt3859 * -1801332919;
	}

	@OriginalMember(owner = "client!ej", name = "ah", descriptor = "()I")
	public int method26281() {
		@Pc(1) int local1 = 0;
		for (@Pc(7) Class80_Sub1_Sub16 local7 = (Class80_Sub1_Sub16) this.aSecondaryLinkedList_13.head((byte) -22); local7 != null; local7 = (Class80_Sub1_Sub16) this.aSecondaryLinkedList_13.next((byte) -102)) {
			if (!local7.method24077((byte) 41)) {
				local1++;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!ej", name = "f", descriptor = "(J)Ljava/lang/Object;")
	public Object method26282(@OriginalArg(0) long arg0) {
		@Pc(5) Class80_Sub1_Sub16 local5 = (Class80_Sub1_Sub16) this.aClass24_23.method560(arg0);
		if (local5 == null) {
			return null;
		}
		@Pc(13) Object local13 = local5.method24083(1709124058);
		if (local13 == null) {
			local5.method24395((byte) 21);
			local5.unlinkSecondary(-2147483644);
			this.anInt3859 += local5.anInt3267 * 98561721;
			return null;
		}
		if (local5.method24077((byte) 47)) {
			@Pc(46) Class80_Sub1_Sub16_Sub1 local46 = new Class80_Sub1_Sub16_Sub1(local13, local5.anInt3267 * -726568511);
			this.aClass24_23.method563(local46, local5.aLong338 * 3209506792906532031L);
			this.aSecondaryLinkedList_13.addTail(local46, 1599142138);
			local46.dualKey = 0L;
			local5.method24395((byte) 36);
			local5.unlinkSecondary(-2147483647);
		} else {
			this.aSecondaryLinkedList_13.addTail(local5, 1599142138);
			local5.dualKey = 0L;
		}
		return local13;
	}

	@OriginalMember(owner = "client!ej", name = "al", descriptor = "()I")
	public int method26283() {
		@Pc(1) int local1 = 0;
		for (@Pc(7) Class80_Sub1_Sub16 local7 = (Class80_Sub1_Sub16) this.aSecondaryLinkedList_13.head((byte) -50); local7 != null; local7 = (Class80_Sub1_Sub16) this.aSecondaryLinkedList_13.next((byte) -102)) {
			if (!local7.method24077((byte) 57)) {
				local1++;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!ej", name = "k", descriptor = "(B)Ljava/lang/Object;")
	public Object method26284(@OriginalArg(0) byte arg0) {
		@Pc(5) Class80_Sub1_Sub16 local5 = (Class80_Sub1_Sub16) this.aClass24_23.method580((byte) -25);
		while (local5 != null) {
			@Pc(12) Object local12 = local5.method24083(1662955425);
			if (local12 != null) {
				return local12;
			}
			@Pc(17) Class80_Sub1_Sub16 local17 = local5;
			local5 = (Class80_Sub1_Sub16) this.aClass24_23.method566((byte) 7);
			local17.method24395((byte) 25);
			local17.unlinkSecondary(-2147483646);
			this.anInt3859 += local17.anInt3267 * 98561721;
		}
		return null;
	}

	@OriginalMember(owner = "client!ej", name = "av", descriptor = "()Ljava/lang/Object;")
	public Object method26285() {
		@Pc(5) Class80_Sub1_Sub16 local5 = (Class80_Sub1_Sub16) this.aClass24_23.method580((byte) 1);
		while (local5 != null) {
			@Pc(12) Object local12 = local5.method24083(1369912307);
			if (local12 != null) {
				return local12;
			}
			@Pc(17) Class80_Sub1_Sub16 local17 = local5;
			local5 = (Class80_Sub1_Sub16) this.aClass24_23.method566((byte) 7);
			local17.method24395((byte) 118);
			local17.unlinkSecondary(-2147483647);
			this.anInt3859 += local17.anInt3267 * 98561721;
		}
		return null;
	}

	@OriginalMember(owner = "client!ej", name = "ak", descriptor = "()V")
	public void method26286() {
		for (@Pc(5) Class80_Sub1_Sub16 local5 = (Class80_Sub1_Sub16) this.aSecondaryLinkedList_13.head((byte) -38); local5 != null; local5 = (Class80_Sub1_Sub16) this.aSecondaryLinkedList_13.next((byte) -102)) {
			if (local5.method24077((byte) 10)) {
				local5.method24395((byte) 114);
				local5.unlinkSecondary(-2147483642);
				this.anInt3859 += local5.anInt3267 * 98561721;
			}
		}
	}

	@OriginalMember(owner = "client!ej", name = "at", descriptor = "()Ljava/lang/Object;")
	public Object method26287() {
		@Pc(5) Class80_Sub1_Sub16 local5 = (Class80_Sub1_Sub16) this.aClass24_23.method580((byte) -43);
		while (local5 != null) {
			@Pc(12) Object local12 = local5.method24083(2057244850);
			if (local12 != null) {
				return local12;
			}
			@Pc(17) Class80_Sub1_Sub16 local17 = local5;
			local5 = (Class80_Sub1_Sub16) this.aClass24_23.method566((byte) 7);
			local17.method24395((byte) 94);
			local17.unlinkSecondary(-2147483642);
			this.anInt3859 += local17.anInt3267 * 98561721;
		}
		return null;
	}

	@OriginalMember(owner = "client!ej", name = "am", descriptor = "()V")
	public void method26288() {
		for (@Pc(5) Class80_Sub1_Sub16 local5 = (Class80_Sub1_Sub16) this.aSecondaryLinkedList_13.head((byte) -89); local5 != null; local5 = (Class80_Sub1_Sub16) this.aSecondaryLinkedList_13.next((byte) -102)) {
			if (local5.method24077((byte) 58)) {
				local5.method24395((byte) 66);
				local5.unlinkSecondary(-2147483647);
				this.anInt3859 += local5.anInt3267 * 98561721;
			}
		}
	}

	@OriginalMember(owner = "client!ej", name = "ad", descriptor = "()Ljava/lang/Object;")
	public Object method26289() {
		@Pc(5) Class80_Sub1_Sub16 local5 = (Class80_Sub1_Sub16) this.aClass24_23.method580((byte) -16);
		while (local5 != null) {
			@Pc(12) Object local12 = local5.method24083(1151478440);
			if (local12 != null) {
				return local12;
			}
			@Pc(17) Class80_Sub1_Sub16 local17 = local5;
			local5 = (Class80_Sub1_Sub16) this.aClass24_23.method566((byte) 7);
			local17.method24395((byte) 98);
			local17.unlinkSecondary(-2147483646);
			this.anInt3859 += local17.anInt3267 * 98561721;
		}
		return null;
	}

	@OriginalMember(owner = "client!ej", name = "an", descriptor = "()Ljava/lang/Object;")
	public Object method26290() {
		@Pc(5) Class80_Sub1_Sub16 local5 = (Class80_Sub1_Sub16) this.aClass24_23.method566((byte) 7);
		while (local5 != null) {
			@Pc(12) Object local12 = local5.method24083(1865680233);
			if (local12 != null) {
				return local12;
			}
			@Pc(16) Class80_Sub1_Sub16 local16 = local5;
			local5 = (Class80_Sub1_Sub16) this.aClass24_23.method566((byte) 7);
			local16.method24395((byte) 49);
			local16.unlinkSecondary(-2147483642);
			this.anInt3859 += local16.anInt3267 * 98561721;
		}
		return null;
	}

	@OriginalMember(owner = "client!ej", name = "aa", descriptor = "()Ljava/lang/Object;")
	public Object method26291() {
		@Pc(5) Class80_Sub1_Sub16 local5 = (Class80_Sub1_Sub16) this.aClass24_23.method566((byte) 7);
		while (local5 != null) {
			@Pc(12) Object local12 = local5.method24083(1918756481);
			if (local12 != null) {
				return local12;
			}
			@Pc(16) Class80_Sub1_Sub16 local16 = local5;
			local5 = (Class80_Sub1_Sub16) this.aClass24_23.method566((byte) 7);
			local16.method24395((byte) 73);
			local16.unlinkSecondary(-2147483645);
			this.anInt3859 += local16.anInt3267 * 98561721;
		}
		return null;
	}

	@OriginalMember(owner = "client!ej", name = "ae", descriptor = "()Ljava/lang/Object;")
	public Object method26292() {
		@Pc(5) Class80_Sub1_Sub16 local5 = (Class80_Sub1_Sub16) this.aClass24_23.method566((byte) 7);
		while (local5 != null) {
			@Pc(12) Object local12 = local5.method24083(1855885722);
			if (local12 != null) {
				return local12;
			}
			@Pc(16) Class80_Sub1_Sub16 local16 = local5;
			local5 = (Class80_Sub1_Sub16) this.aClass24_23.method566((byte) 7);
			local16.method24395((byte) 53);
			local16.unlinkSecondary(-2147483645);
			this.anInt3859 += local16.anInt3267 * 98561721;
		}
		return null;
	}

	@OriginalMember(owner = "client!ej", name = "ap", descriptor = "()Ljava/lang/Object;")
	public Object method26293() {
		@Pc(5) Class80_Sub1_Sub16 local5 = (Class80_Sub1_Sub16) this.aClass24_23.method566((byte) 7);
		while (local5 != null) {
			@Pc(12) Object local12 = local5.method24083(1572323513);
			if (local12 != null) {
				return local12;
			}
			@Pc(16) Class80_Sub1_Sub16 local16 = local5;
			local5 = (Class80_Sub1_Sub16) this.aClass24_23.method566((byte) 7);
			local16.method24395((byte) 87);
			local16.unlinkSecondary(-2147483641);
			this.anInt3859 += local16.anInt3267 * 98561721;
		}
		return null;
	}

	@OriginalMember(owner = "client!ej", name = "ar", descriptor = "()Ljava/lang/Object;")
	public Object method26294() {
		@Pc(5) Class80_Sub1_Sub16 local5 = (Class80_Sub1_Sub16) this.aClass24_23.method566((byte) 7);
		while (local5 != null) {
			@Pc(12) Object local12 = local5.method24083(2077446101);
			if (local12 != null) {
				return local12;
			}
			@Pc(16) Class80_Sub1_Sub16 local16 = local5;
			local5 = (Class80_Sub1_Sub16) this.aClass24_23.method566((byte) 7);
			local16.method24395((byte) 7);
			local16.unlinkSecondary(-2147483645);
			this.anInt3859 += local16.anInt3267 * 98561721;
		}
		return null;
	}
}
