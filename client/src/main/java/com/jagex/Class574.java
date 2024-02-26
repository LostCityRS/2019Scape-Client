package com.jagex;

import java.util.Iterator;
import java.util.LinkedList;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tk")
public final class Class574 {

	@OriginalMember(owner = "client!tk", name = "t", descriptor = "I")
	static int anInt5284 = 0;

	@OriginalMember(owner = "client!tk", name = "i", descriptor = "Ljava/util/LinkedList;")
	LinkedList aLinkedList4;

	@OriginalMember(owner = "client!tk", name = "m", descriptor = "Z")
	boolean aBoolean920;

	@OriginalMember(owner = "client!tk", name = "f", descriptor = "I")
	final int anInt5282;

	@OriginalMember(owner = "client!tk", name = "e", descriptor = "I")
	final int anInt5283;

	@OriginalMember(owner = "client!tk", name = "u", descriptor = "[I")
	final int[] anIntArray476;

	@OriginalMember(owner = "client!tk", name = "l", descriptor = "[I")
	final int[] anIntArray477;

	@OriginalMember(owner = "client!tk", name = "g", descriptor = "Lclient!dn;")
	public Class105 aClass105_9;

	@OriginalMember(owner = "client!tk", name = "w", descriptor = "(I)V")
	public static void method31755(@OriginalArg(0) int arg0) {
		anInt5284 = arg0 * 463720165;
	}

	@OriginalMember(owner = "client!tk", name = "r", descriptor = "(I)V")
	public static void method31763(@OriginalArg(0) int arg0) {
		anInt5284 = arg0 * 463720165;
	}

	@OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(Lclient!di;Lclient!ald;I)V")
	public Class574(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class80_Sub36 arg1, @OriginalArg(2) int arg2) {
		this.anInt5282 = arg2 * 1307820025;
		this.anInt5283 = arg1.method23194(35000) * -316069809;
		this.anIntArray476 = new int[this.anInt5283 * -1889734993];
		this.anIntArray477 = new int[this.anInt5283 * -1889734993];
		@Pc(31) int local31 = arg1.method23178((byte) -104);
		@Pc(35) int local35 = arg1.method23178((byte) -87);
		for (@Pc(37) int local37 = 0; local37 < this.anInt5283 * -1889734993; local37++) {
			this.anIntArray476[local37] = local31 + arg1.method23177((byte) -13);
			this.anIntArray477[local37] = local35 + arg1.method23177((byte) -100);
		}
		this.aClass105_9 = this.method31753(arg0, (short) 24017);
	}

	@OriginalMember(owner = "client!tk", name = "g", descriptor = "(B)V")
	public void method31748(@OriginalArg(0) byte arg0) {
		this.aBoolean920 = false;
		this.aClass105_9 = null;
	}

	@OriginalMember(owner = "client!tk", name = "v", descriptor = "(Lclient!di;)Z")
	public boolean method31749(@OriginalArg(0) Class102 arg0) {
		this.aClass105_9 = this.method31753(arg0, (short) 10176);
		return this.aClass105_9 != null;
	}

	@OriginalMember(owner = "client!tk", name = "f", descriptor = "(Lclient!te;I)V")
	public void method31750(@OriginalArg(0) Class570 arg0, @OriginalArg(1) int arg1) {
		if (arg0 == null || this.anInt5283 * -1889734993 <= 0) {
			return;
		}
		this.method31752(arg0, (short) 2154);
		@Pc(14) Iterator local14 = this.aLinkedList4.iterator();
		while (local14.hasNext()) {
			@Pc(21) Class120_Sub1_Sub1_Sub6 local21 = (Class120_Sub1_Sub1_Sub6) local14.next();
			arg0.method31696(local21, false, 6898847);
		}
		this.aBoolean920 = true;
	}

	@OriginalMember(owner = "client!tk", name = "e", descriptor = "(Lclient!te;I)V")
	public void method31751(@OriginalArg(0) Class570 arg0, @OriginalArg(1) int arg1) {
		if (arg0 == null || this.aLinkedList4 == null) {
			return;
		}
		@Pc(9) Iterator local9 = this.aLinkedList4.iterator();
		while (local9.hasNext()) {
			@Pc(16) Class120_Sub1_Sub1_Sub6 local16 = (Class120_Sub1_Sub1_Sub6) local9.next();
			arg0.method31543(local16.aByte99, local16.aShort129, local16.aShort127, new Class576(local16), -1479771108);
		}
	}

	@OriginalMember(owner = "client!tk", name = "u", descriptor = "(Lclient!te;S)V")
	void method31752(@OriginalArg(0) Class570 arg0, @OriginalArg(1) short arg1) {
		this.aLinkedList4 = new LinkedList();
		@Pc(8) Class502 local8 = client.aClass539_1.method30903(-463929735);
		@Pc(12) Class626 local12 = client.aClass539_1.method30893((byte) -15);
		@Pc(27) Class626 local27 = new Class626(Class507.anInt5045 * -1170417853, this.anIntArray476[0], this.anIntArray477[0]);
		for (@Pc(29) int local29 = 1; local29 < this.anInt5283 * -1889734993; local29++) {
			@Pc(50) Class626 local50 = new Class626(Class507.anInt5045 * -1170417853, this.anIntArray476[local29], this.anIntArray477[local29]);
			while (local50.anInt5540 * -390642507 != local27.anInt5540 * -390642507 || local50.anInt5537 * -894305615 != local27.anInt5537 * -894305615) {
				if (local27.anInt5540 * -390642507 < local50.anInt5540 * -390642507) {
					local27.anInt5540 += 1346275741;
				} else if (local27.anInt5540 * -390642507 > local50.anInt5540 * -390642507) {
					local27.anInt5540 -= 1346275741;
				}
				if (local27.anInt5537 * -894305615 < local50.anInt5537 * -894305615) {
					local27.anInt5537 += 1813646929;
				} else if (local27.anInt5537 * -894305615 > local50.anInt5537 * -894305615) {
					local27.anInt5537 -= 1813646929;
				}
				@Pc(134) int local134 = Class507.anInt5045 * -1170417853;
				@Pc(144) int local144 = local27.anInt5540 * -390642507 - local12.anInt5540 * -390642507;
				@Pc(154) int local154 = local27.anInt5537 * -894305615 - local12.anInt5537 * -894305615;
				if (local144 >= 0 && local144 < arg0.anInt5245 * 1487025827 && local154 >= 0 && local154 < arg0.anInt5246 * -1561777241) {
					@Pc(176) int local176 = (local144 << 9) + 256;
					@Pc(182) int local182 = (local154 << 9) + 256;
					if (local8.method30429(local144, local154, 1190298094)) {
						local134++;
					}
					this.aLinkedList4.add(new Class120_Sub1_Sub1_Sub6(arg0, this, Class507.anInt5045 * -1170417853, local134, local176, Class439.method29150(local176, local182, Class507.anInt5045 * -1170417853, 1037753497), local182));
				}
			}
			local27 = local50;
		}
	}

	@OriginalMember(owner = "client!tk", name = "t", descriptor = "(Lclient!di;S)Lclient!dn;")
	Class105 method31753(@OriginalArg(0) Class102 arg0, @OriginalArg(1) short arg1) {
		@Pc(7) Class232 local7 = Class232.method26043(Class626.aClass480_129, this.anInt5282 * 723833417, 0);
		if (local7 == null) {
			return null;
		} else {
			if (local7.anInt3781 < 13) {
				local7.method26085(2);
			}
			return arg0.method20753(local7, 2048, anInt5284 * 912670445, 64, 768);
		}
	}

	@OriginalMember(owner = "client!tk", name = "m", descriptor = "(Lclient!di;S)Z")
	public boolean method31754(@OriginalArg(0) Class102 arg0, @OriginalArg(1) short arg1) {
		this.aClass105_9 = this.method31753(arg0, (short) 14165);
		return this.aClass105_9 != null;
	}

	@OriginalMember(owner = "client!tk", name = "n", descriptor = "(Lclient!di;)Z")
	public boolean method31756(@OriginalArg(0) Class102 arg0) {
		this.aClass105_9 = this.method31753(arg0, (short) 26269);
		return this.aClass105_9 != null;
	}

	@OriginalMember(owner = "client!tk", name = "j", descriptor = "(Lclient!te;)V")
	public void method31757(@OriginalArg(0) Class570 arg0) {
		if (arg0 == null || this.anInt5283 * -1889734993 <= 0) {
			return;
		}
		this.method31752(arg0, (short) -868);
		@Pc(14) Iterator local14 = this.aLinkedList4.iterator();
		while (local14.hasNext()) {
			@Pc(21) Class120_Sub1_Sub1_Sub6 local21 = (Class120_Sub1_Sub1_Sub6) local14.next();
			arg0.method31696(local21, false, 6898847);
		}
		this.aBoolean920 = true;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lclient!te;)V")
	public void method31758(@OriginalArg(0) Class570 arg0) {
		if (arg0 == null || this.anInt5283 * -1889734993 <= 0) {
			return;
		}
		this.method31752(arg0, (short) 2798);
		@Pc(14) Iterator local14 = this.aLinkedList4.iterator();
		while (local14.hasNext()) {
			@Pc(21) Class120_Sub1_Sub1_Sub6 local21 = (Class120_Sub1_Sub1_Sub6) local14.next();
			arg0.method31696(local21, false, 6898847);
		}
		this.aBoolean920 = true;
	}

	@OriginalMember(owner = "client!tk", name = "p", descriptor = "(Lclient!di;)Z")
	public boolean method31759(@OriginalArg(0) Class102 arg0) {
		this.aClass105_9 = this.method31753(arg0, (short) 6098);
		return this.aClass105_9 != null;
	}

	@OriginalMember(owner = "client!tk", name = "k", descriptor = "(Lclient!te;)V")
	public void method31760(@OriginalArg(0) Class570 arg0) {
		if (arg0 == null || this.aLinkedList4 == null) {
			return;
		}
		@Pc(9) Iterator local9 = this.aLinkedList4.iterator();
		while (local9.hasNext()) {
			@Pc(16) Class120_Sub1_Sub1_Sub6 local16 = (Class120_Sub1_Sub1_Sub6) local9.next();
			arg0.method31543(local16.aByte99, local16.aShort129, local16.aShort127, new Class576(local16), -1286226054);
		}
	}

	@OriginalMember(owner = "client!tk", name = "x", descriptor = "(Lclient!te;)V")
	public void method31761(@OriginalArg(0) Class570 arg0) {
		if (arg0 == null || this.aLinkedList4 == null) {
			return;
		}
		@Pc(9) Iterator local9 = this.aLinkedList4.iterator();
		while (local9.hasNext()) {
			@Pc(16) Class120_Sub1_Sub1_Sub6 local16 = (Class120_Sub1_Sub1_Sub6) local9.next();
			arg0.method31543(local16.aByte99, local16.aShort129, local16.aShort127, new Class576(local16), -1885577825);
		}
	}

	@OriginalMember(owner = "client!tk", name = "i", descriptor = "(I)Z")
	public boolean method31762(@OriginalArg(0) int arg0) {
		return this.aBoolean920;
	}

	@OriginalMember(owner = "client!tk", name = "q", descriptor = "()V")
	public void method31764() {
		this.aBoolean920 = false;
		this.aClass105_9 = null;
	}

	@OriginalMember(owner = "client!tk", name = "h", descriptor = "()V")
	public void method31765() {
		this.aBoolean920 = false;
		this.aClass105_9 = null;
	}

	@OriginalMember(owner = "client!tk", name = "z", descriptor = "(Lclient!di;)Z")
	public boolean method31766(@OriginalArg(0) Class102 arg0) {
		this.aClass105_9 = this.method31753(arg0, (short) 5485);
		return this.aClass105_9 != null;
	}

	@OriginalMember(owner = "client!tk", name = "d", descriptor = "()Z")
	public boolean method31767() {
		return this.aBoolean920;
	}

	@OriginalMember(owner = "client!tk", name = "o", descriptor = "(Lclient!di;)Lclient!dn;")
	Class105 method31768(@OriginalArg(0) Class102 arg0) {
		@Pc(7) Class232 local7 = Class232.method26043(Class626.aClass480_129, this.anInt5282 * 723833417, 0);
		if (local7 == null) {
			return null;
		} else {
			if (local7.anInt3781 < 13) {
				local7.method26085(2);
			}
			return arg0.method20753(local7, 2048, anInt5284 * 912670445, 64, 768);
		}
	}

	@OriginalMember(owner = "client!tk", name = "y", descriptor = "(Lclient!di;)Z")
	public boolean method31769(@OriginalArg(0) Class102 arg0) {
		this.aClass105_9 = this.method31753(arg0, (short) 29625);
		return this.aClass105_9 != null;
	}

	@OriginalMember(owner = "client!tk", name = "s", descriptor = "(Lclient!te;)V")
	public void method31770(@OriginalArg(0) Class570 arg0) {
		if (arg0 == null || this.anInt5283 * -1889734993 <= 0) {
			return;
		}
		this.method31752(arg0, (short) -29421);
		@Pc(14) Iterator local14 = this.aLinkedList4.iterator();
		while (local14.hasNext()) {
			@Pc(21) Class120_Sub1_Sub1_Sub6 local21 = (Class120_Sub1_Sub1_Sub6) local14.next();
			arg0.method31696(local21, false, 6898847);
		}
		this.aBoolean920 = true;
	}
}
