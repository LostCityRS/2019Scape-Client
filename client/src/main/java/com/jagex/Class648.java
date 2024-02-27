package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wu")
public final class Class648 {

	@OriginalMember(owner = "client!wu", name = "u", descriptor = "Lclient!aaa;")
	SecondaryLinkedList aSecondaryLinkedList_18 = new SecondaryLinkedList();

	@OriginalMember(owner = "client!wu", name = "t", descriptor = "I")
	int anInt5650;

	@OriginalMember(owner = "client!wu", name = "f", descriptor = "I")
	int anInt5649;

	@OriginalMember(owner = "client!wu", name = "e", descriptor = "Lclient!aax;")
	Class24 aClass24_37;

	@OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(I)V")
	public Class648(@OriginalArg(0) int arg0) {
		this.anInt5650 = arg0;
		this.anInt5649 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; local14 + local14 < arg0; local14 += local14) {
		}
		this.aClass24_37 = new Class24(local14);
	}

	@OriginalMember(owner = "client!wu", name = "p", descriptor = "()V")
	public void method33055() {
		this.aSecondaryLinkedList_18.method41(-252802305);
		this.aClass24_37.method564(-1988052392);
		this.anInt5649 = this.anInt5650;
	}

	@OriginalMember(owner = "client!wu", name = "t", descriptor = "(Lclient!wk;)Ljava/lang/Object;")
	public Object method33056(@OriginalArg(0) Interface69 arg0) {
		@Pc(2) long local2 = arg0.method674();
		for (@Pc(8) Class80_Sub1_Sub18 local8 = (Class80_Sub1_Sub18) this.aClass24_37.method560(local2); local8 != null; local8 = (Class80_Sub1_Sub18) this.aClass24_37.method558((byte) 0)) {
			if (local8.anInterface69_3.method675(arg0)) {
				@Pc(19) Object local19 = local8.method24407();
				if (local19 != null) {
					if (local8.method24408()) {
						@Pc(46) Class80_Sub1_Sub18_Sub1 local46 = new Class80_Sub1_Sub18_Sub1(arg0, local19, local8.anInt3294);
						this.aClass24_37.method563(local46, local8.aLong338 * 3209506792906532031L);
						this.aSecondaryLinkedList_18.addTail(local46, 1599142138);
						local46.dualKey = 0L;
						local8.method24395((byte) 115);
						local8.unlinkSecondary(Integer.MIN_VALUE);
					} else {
						this.aSecondaryLinkedList_18.addTail(local8, 1599142138);
						local8.dualKey = 0L;
					}
					return local19;
				}
				local8.method24395((byte) 126);
				local8.unlinkSecondary(-2147483641);
				this.anInt5649 += local8.anInt3294;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!wu", name = "n", descriptor = "()V")
	public void method33057() {
		for (@Pc(5) Class80_Sub1_Sub18 local5 = (Class80_Sub1_Sub18) this.aSecondaryLinkedList_18.head((byte) -48); local5 != null; local5 = (Class80_Sub1_Sub18) this.aSecondaryLinkedList_18.next((byte) -102)) {
			if (local5.method24408()) {
				local5.method24395((byte) 116);
				local5.unlinkSecondary(Integer.MIN_VALUE);
				this.anInt5649 += local5.anInt3294;
			}
		}
	}

	@OriginalMember(owner = "client!wu", name = "e", descriptor = "(Lclient!aso;)V")
	void method33058(@OriginalArg(0) Class80_Sub1_Sub18 arg0) {
		if (arg0 != null) {
			arg0.method24395((byte) 32);
			arg0.unlinkSecondary(-2147483646);
			this.anInt5649 += arg0.anInt3294;
		}
	}

	@OriginalMember(owner = "client!wu", name = "u", descriptor = "(Ljava/lang/Object;Lclient!wk;)V")
	public void method33059(@OriginalArg(0) Object arg0, @OriginalArg(1) Interface69 arg1) {
		this.method33060(arg0, arg1, 1);
	}

	@OriginalMember(owner = "client!wu", name = "l", descriptor = "(Ljava/lang/Object;Lclient!wk;I)V")
	void method33060(@OriginalArg(0) Object arg0, @OriginalArg(1) Interface69 arg1, @OriginalArg(2) int arg2) {
		if (arg2 > this.anInt5650) {
			throw new IllegalStateException();
		}
		this.method33063(arg1);
		this.anInt5649 -= arg2;
		while (this.anInt5649 < 0) {
			@Pc(25) Class80_Sub1_Sub18 local25 = (Class80_Sub1_Sub18) this.aSecondaryLinkedList_18.method67(-1791637565);
			this.method33058(local25);
		}
		@Pc(36) Class80_Sub1_Sub18_Sub1 local36 = new Class80_Sub1_Sub18_Sub1(arg1, arg0, arg2);
		this.aClass24_37.method563(local36, arg1.method674());
		this.aSecondaryLinkedList_18.addTail(local36, 1599142138);
		local36.dualKey = 0L;
	}

	@OriginalMember(owner = "client!wu", name = "g", descriptor = "(I)V")
	public void method33061(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class80_Sub1_Sub18 local5 = (Class80_Sub1_Sub18) this.aSecondaryLinkedList_18.head((byte) 28); local5 != null; local5 = (Class80_Sub1_Sub18) this.aSecondaryLinkedList_18.next((byte) -102)) {
			if (local5.method24408()) {
				if (local5.method24407() == null) {
					local5.method24395((byte) 87);
					local5.unlinkSecondary(-2147483642);
					this.anInt5649 += local5.anInt3294;
				}
			} else if ((local5.dualKey += -4191731634426926145L) * 4203303297430504511L > (long) arg0) {
				@Pc(50) Class80_Sub1_Sub18_Sub2 local50 = new Class80_Sub1_Sub18_Sub2(local5.anInterface69_3, local5.method24407(), local5.anInt3294);
				this.aClass24_37.method563(local50, local5.aLong338 * 3209506792906532031L);
				Class653.method33145(local50, local5, 88506994);
				local5.method24395((byte) 38);
				local5.unlinkSecondary(Integer.MIN_VALUE);
			}
		}
	}

	@OriginalMember(owner = "client!wu", name = "d", descriptor = "(Ljava/lang/Object;Lclient!wk;)V")
	public void method33062(@OriginalArg(0) Object arg0, @OriginalArg(1) Interface69 arg1) {
		this.method33060(arg0, arg1, 1);
	}

	@OriginalMember(owner = "client!wu", name = "f", descriptor = "(Lclient!wk;)V")
	void method33063(@OriginalArg(0) Interface69 arg0) {
		@Pc(2) long local2 = arg0.method674();
		for (@Pc(8) Class80_Sub1_Sub18 local8 = (Class80_Sub1_Sub18) this.aClass24_37.method560(local2); local8 != null; local8 = (Class80_Sub1_Sub18) this.aClass24_37.method558((byte) 0)) {
			if (local8.anInterface69_3.method675(arg0)) {
				this.method33058(local8);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!wu", name = "o", descriptor = "(Lclient!wk;)Ljava/lang/Object;")
	public Object method33064(@OriginalArg(0) Interface69 arg0) {
		@Pc(2) long local2 = arg0.method674();
		for (@Pc(8) Class80_Sub1_Sub18 local8 = (Class80_Sub1_Sub18) this.aClass24_37.method560(local2); local8 != null; local8 = (Class80_Sub1_Sub18) this.aClass24_37.method558((byte) 0)) {
			if (local8.anInterface69_3.method675(arg0)) {
				@Pc(19) Object local19 = local8.method24407();
				if (local19 != null) {
					if (local8.method24408()) {
						@Pc(46) Class80_Sub1_Sub18_Sub1 local46 = new Class80_Sub1_Sub18_Sub1(arg0, local19, local8.anInt3294);
						this.aClass24_37.method563(local46, local8.aLong338 * 3209506792906532031L);
						this.aSecondaryLinkedList_18.addTail(local46, 1599142138);
						local46.dualKey = 0L;
						local8.method24395((byte) 22);
						local8.unlinkSecondary(-2147483641);
					} else {
						this.aSecondaryLinkedList_18.addTail(local8, 1599142138);
						local8.dualKey = 0L;
					}
					return local19;
				}
				local8.method24395((byte) 74);
				local8.unlinkSecondary(-2147483644);
				this.anInt5649 += local8.anInt3294;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!wu", name = "j", descriptor = "(Lclient!wk;)Ljava/lang/Object;")
	public Object method33065(@OriginalArg(0) Interface69 arg0) {
		@Pc(2) long local2 = arg0.method674();
		for (@Pc(8) Class80_Sub1_Sub18 local8 = (Class80_Sub1_Sub18) this.aClass24_37.method560(local2); local8 != null; local8 = (Class80_Sub1_Sub18) this.aClass24_37.method558((byte) 0)) {
			if (local8.anInterface69_3.method675(arg0)) {
				@Pc(19) Object local19 = local8.method24407();
				if (local19 != null) {
					if (local8.method24408()) {
						@Pc(46) Class80_Sub1_Sub18_Sub1 local46 = new Class80_Sub1_Sub18_Sub1(arg0, local19, local8.anInt3294);
						this.aClass24_37.method563(local46, local8.aLong338 * 3209506792906532031L);
						this.aSecondaryLinkedList_18.addTail(local46, 1599142138);
						local46.dualKey = 0L;
						local8.method24395((byte) 121);
						local8.unlinkSecondary(Integer.MIN_VALUE);
					} else {
						this.aSecondaryLinkedList_18.addTail(local8, 1599142138);
						local8.dualKey = 0L;
					}
					return local19;
				}
				local8.method24395((byte) 29);
				local8.unlinkSecondary(-2147483646);
				this.anInt5649 += local8.anInt3294;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lclient!wk;)Ljava/lang/Object;")
	public Object method33066(@OriginalArg(0) Interface69 arg0) {
		@Pc(2) long local2 = arg0.method674();
		for (@Pc(8) Class80_Sub1_Sub18 local8 = (Class80_Sub1_Sub18) this.aClass24_37.method560(local2); local8 != null; local8 = (Class80_Sub1_Sub18) this.aClass24_37.method558((byte) 0)) {
			if (local8.anInterface69_3.method675(arg0)) {
				@Pc(19) Object local19 = local8.method24407();
				if (local19 != null) {
					if (local8.method24408()) {
						@Pc(46) Class80_Sub1_Sub18_Sub1 local46 = new Class80_Sub1_Sub18_Sub1(arg0, local19, local8.anInt3294);
						this.aClass24_37.method563(local46, local8.aLong338 * 3209506792906532031L);
						this.aSecondaryLinkedList_18.addTail(local46, 1599142138);
						local46.dualKey = 0L;
						local8.method24395((byte) 100);
						local8.unlinkSecondary(-2147483646);
					} else {
						this.aSecondaryLinkedList_18.addTail(local8, 1599142138);
						local8.dualKey = 0L;
					}
					return local19;
				}
				local8.method24395((byte) 112);
				local8.unlinkSecondary(-2147483647);
				this.anInt5649 += local8.anInt3294;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!wu", name = "s", descriptor = "(Lclient!wk;)Ljava/lang/Object;")
	public Object method33067(@OriginalArg(0) Interface69 arg0) {
		@Pc(2) long local2 = arg0.method674();
		for (@Pc(8) Class80_Sub1_Sub18 local8 = (Class80_Sub1_Sub18) this.aClass24_37.method560(local2); local8 != null; local8 = (Class80_Sub1_Sub18) this.aClass24_37.method558((byte) 0)) {
			if (local8.anInterface69_3.method675(arg0)) {
				@Pc(19) Object local19 = local8.method24407();
				if (local19 != null) {
					if (local8.method24408()) {
						@Pc(46) Class80_Sub1_Sub18_Sub1 local46 = new Class80_Sub1_Sub18_Sub1(arg0, local19, local8.anInt3294);
						this.aClass24_37.method563(local46, local8.aLong338 * 3209506792906532031L);
						this.aSecondaryLinkedList_18.addTail(local46, 1599142138);
						local46.dualKey = 0L;
						local8.method24395((byte) 126);
						local8.unlinkSecondary(Integer.MIN_VALUE);
					} else {
						this.aSecondaryLinkedList_18.addTail(local8, 1599142138);
						local8.dualKey = 0L;
					}
					return local19;
				}
				local8.method24395((byte) 83);
				local8.unlinkSecondary(-2147483646);
				this.anInt5649 += local8.anInt3294;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!wu", name = "k", descriptor = "(Lclient!wk;)V")
	void method33068(@OriginalArg(0) Interface69 arg0) {
		@Pc(2) long local2 = arg0.method674();
		for (@Pc(8) Class80_Sub1_Sub18 local8 = (Class80_Sub1_Sub18) this.aClass24_37.method560(local2); local8 != null; local8 = (Class80_Sub1_Sub18) this.aClass24_37.method558((byte) 0)) {
			if (local8.anInterface69_3.method675(arg0)) {
				this.method33058(local8);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!wu", name = "x", descriptor = "(Lclient!aso;)V")
	void method33069(@OriginalArg(0) Class80_Sub1_Sub18 arg0) {
		if (arg0 != null) {
			arg0.method24395((byte) 13);
			arg0.unlinkSecondary(-2147483646);
			this.anInt5649 += arg0.anInt3294;
		}
	}

	@OriginalMember(owner = "client!wu", name = "w", descriptor = "(Lclient!aso;)V")
	void method33070(@OriginalArg(0) Class80_Sub1_Sub18 arg0) {
		if (arg0 != null) {
			arg0.method24395((byte) 115);
			arg0.unlinkSecondary(-2147483641);
			this.anInt5649 += arg0.anInt3294;
		}
	}

	@OriginalMember(owner = "client!wu", name = "r", descriptor = "(Lclient!aso;)V")
	void method33071(@OriginalArg(0) Class80_Sub1_Sub18 arg0) {
		if (arg0 != null) {
			arg0.method24395((byte) 62);
			arg0.unlinkSecondary(-2147483645);
			this.anInt5649 += arg0.anInt3294;
		}
	}

	@OriginalMember(owner = "client!wu", name = "q", descriptor = "(Ljava/lang/Object;Lclient!wk;)V")
	public void method33072(@OriginalArg(0) Object arg0, @OriginalArg(1) Interface69 arg1) {
		this.method33060(arg0, arg1, 1);
	}

	@OriginalMember(owner = "client!wu", name = "h", descriptor = "(Ljava/lang/Object;Lclient!wk;)V")
	public void method33073(@OriginalArg(0) Object arg0, @OriginalArg(1) Interface69 arg1) {
		this.method33060(arg0, arg1, 1);
	}

	@OriginalMember(owner = "client!wu", name = "c", descriptor = "()V")
	public void method33074() {
		for (@Pc(5) Class80_Sub1_Sub18 local5 = (Class80_Sub1_Sub18) this.aSecondaryLinkedList_18.head((byte) -34); local5 != null; local5 = (Class80_Sub1_Sub18) this.aSecondaryLinkedList_18.next((byte) -102)) {
			if (local5.method24408()) {
				local5.method24395((byte) 30);
				local5.unlinkSecondary(Integer.MIN_VALUE);
				this.anInt5649 += local5.anInt3294;
			}
		}
	}

	@OriginalMember(owner = "client!wu", name = "z", descriptor = "(I)V")
	public void method33075(@OriginalArg(0) int arg0) {
		for (@Pc(5) Class80_Sub1_Sub18 local5 = (Class80_Sub1_Sub18) this.aSecondaryLinkedList_18.head((byte) -6); local5 != null; local5 = (Class80_Sub1_Sub18) this.aSecondaryLinkedList_18.next((byte) -102)) {
			if (local5.method24408()) {
				if (local5.method24407() == null) {
					local5.method24395((byte) 29);
					local5.unlinkSecondary(-2147483647);
					this.anInt5649 += local5.anInt3294;
				}
			} else if ((local5.dualKey += -4191731634426926145L) * 4203303297430504511L > (long) arg0) {
				@Pc(50) Class80_Sub1_Sub18_Sub2 local50 = new Class80_Sub1_Sub18_Sub2(local5.anInterface69_3, local5.method24407(), local5.anInt3294);
				this.aClass24_37.method563(local50, local5.aLong338 * 3209506792906532031L);
				Class653.method33145(local50, local5, -1821184783);
				local5.method24395((byte) 124);
				local5.unlinkSecondary(-2147483640);
			}
		}
	}

	@OriginalMember(owner = "client!wu", name = "i", descriptor = "()V")
	public void method33076() {
		this.aSecondaryLinkedList_18.method41(-252802305);
		this.aClass24_37.method564(238489891);
		this.anInt5649 = this.anInt5650;
	}

	@OriginalMember(owner = "client!wu", name = "y", descriptor = "()V")
	public void method33077() {
		for (@Pc(5) Class80_Sub1_Sub18 local5 = (Class80_Sub1_Sub18) this.aSecondaryLinkedList_18.head((byte) -46); local5 != null; local5 = (Class80_Sub1_Sub18) this.aSecondaryLinkedList_18.next((byte) -102)) {
			if (local5.method24408()) {
				local5.method24395((byte) 85);
				local5.unlinkSecondary(-2147483643);
				this.anInt5649 += local5.anInt3294;
			}
		}
	}

	@OriginalMember(owner = "client!wu", name = "v", descriptor = "()V")
	public void method33078() {
		for (@Pc(5) Class80_Sub1_Sub18 local5 = (Class80_Sub1_Sub18) this.aSecondaryLinkedList_18.head((byte) 47); local5 != null; local5 = (Class80_Sub1_Sub18) this.aSecondaryLinkedList_18.next((byte) -102)) {
			if (local5.method24408()) {
				local5.method24395((byte) 85);
				local5.unlinkSecondary(-2147483643);
				this.anInt5649 += local5.anInt3294;
			}
		}
	}

	@OriginalMember(owner = "client!wu", name = "m", descriptor = "()V")
	public void method33079() {
		for (@Pc(5) Class80_Sub1_Sub18 local5 = (Class80_Sub1_Sub18) this.aSecondaryLinkedList_18.head((byte) 98); local5 != null; local5 = (Class80_Sub1_Sub18) this.aSecondaryLinkedList_18.next((byte) -102)) {
			if (local5.method24408()) {
				local5.method24395((byte) 56);
				local5.unlinkSecondary(-2147483645);
				this.anInt5649 += local5.anInt3294;
			}
		}
	}
}
