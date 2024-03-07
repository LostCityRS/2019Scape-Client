package com.jagex;

import java.util.Iterator;
import java.util.LinkedList;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public class Class567 {

	@OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
	static int anInt5388 = 0;

	@OriginalMember(owner = "client!ta", name = "l", descriptor = "Ljava/util/LinkedList;")
	LinkedList aLinkedList4;

	@OriginalMember(owner = "client!ta", name = "u", descriptor = "Z")
	boolean aBoolean813;

	@OriginalMember(owner = "client!ta", name = "n", descriptor = "I")
	final int anInt5386;

	@OriginalMember(owner = "client!ta", name = "m", descriptor = "I")
	final int anInt5387;

	@OriginalMember(owner = "client!ta", name = "k", descriptor = "[I")
	final int[] anIntArray468;

	@OriginalMember(owner = "client!ta", name = "f", descriptor = "[I")
	final int[] anIntArray469;

	@OriginalMember(owner = "client!ta", name = "w", descriptor = "Lclient!do;")
	public Class109 aClass109_8;

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Lclient!dh;Lclient!alw;I)V", line = 27)
	public Class567(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Packet arg1, @OriginalArg(2) int arg2) {
		this.anInt5386 = arg2 * -264360161;
		this.anInt5387 = arg1.gSmart1or2s(-358186793) * -2092434507;
		this.anIntArray468 = new int[this.anInt5387 * 554261149];
		this.anIntArray469 = new int[this.anInt5387 * 554261149];
		@Pc(31) int local31 = arg1.g2(-1434290800);
		@Pc(35) int local35 = arg1.g2(-1434290800);
		for (@Pc(37) int local37 = 0; local37 < this.anInt5387 * 554261149; local37++) {
			this.anIntArray468[local37] = local31 + arg1.g1b(2042379259);
			this.anIntArray469[local37] = local35 + arg1.g1b(1818791330);
		}
		this.aClass109_8 = this.method31260(arg0, (short) 255);
	}

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "(Lclient!dh;)Lclient!do;", line = 42)
	Class109 method31259(@OriginalArg(0) Class104 arg0) {
		@Pc(7) Class231 local7 = Class231.method25655(Class86.aClass497_15, this.anInt5386 * 368086239, 0);
		if (local7 == null) {
			return null;
		} else {
			if (local7.anInt3738 < 13) {
				local7.method25691(2);
			}
			return arg0.method20597(local7, 2048, anInt5388 * 1726905857, 64, 768);
		}
	}

	@OriginalMember(owner = "client!ta", name = "e", descriptor = "(Lclient!dh;S)Lclient!do;", line = 42)
	Class109 method31260(@OriginalArg(0) Class104 arg0, @OriginalArg(1) short arg1) {
		@Pc(7) Class231 local7 = Class231.method25655(Class86.aClass497_15, this.anInt5386 * 368086239, 0);
		if (local7 == null) {
			return null;
		} else {
			if (local7.anInt3738 < 13) {
				local7.method25691(2);
			}
			return arg0.method20597(local7, 2048, anInt5388 * 1726905857, 64, 768);
		}
	}

	@OriginalMember(owner = "client!ta", name = "z", descriptor = "(Lclient!dh;)Lclient!do;", line = 42)
	Class109 method31261(@OriginalArg(0) Class104 arg0) {
		@Pc(7) Class231 local7 = Class231.method25655(Class86.aClass497_15, this.anInt5386 * 368086239, 0);
		if (local7 == null) {
			return null;
		} else {
			if (local7.anInt3738 < 13) {
				local7.method25691(2);
			}
			return arg0.method20597(local7, 2048, anInt5388 * 1726905857, 64, 768);
		}
	}

	@OriginalMember(owner = "client!ta", name = "p", descriptor = "(Lclient!dh;)Lclient!do;", line = 42)
	Class109 method31262(@OriginalArg(0) Class104 arg0) {
		@Pc(7) Class231 local7 = Class231.method25655(Class86.aClass497_15, this.anInt5386 * 368086239, 0);
		if (local7 == null) {
			return null;
		} else {
			if (local7.anInt3738 < 13) {
				local7.method25691(2);
			}
			return arg0.method20597(local7, 2048, anInt5388 * 1726905857, 64, 768);
		}
	}

	@OriginalMember(owner = "client!ta", name = "d", descriptor = "(Lclient!dh;)Lclient!do;", line = 42)
	Class109 method31263(@OriginalArg(0) Class104 arg0) {
		@Pc(7) Class231 local7 = Class231.method25655(Class86.aClass497_15, this.anInt5386 * 368086239, 0);
		if (local7 == null) {
			return null;
		} else {
			if (local7.anInt3738 < 13) {
				local7.method25691(2);
			}
			return arg0.method20597(local7, 2048, anInt5388 * 1726905857, 64, 768);
		}
	}

	@OriginalMember(owner = "client!ta", name = "r", descriptor = "(Lclient!dh;)Lclient!do;", line = 42)
	Class109 method31264(@OriginalArg(0) Class104 arg0) {
		@Pc(7) Class231 local7 = Class231.method25655(Class86.aClass497_15, this.anInt5386 * 368086239, 0);
		if (local7 == null) {
			return null;
		} else {
			if (local7.anInt3738 < 13) {
				local7.method25691(2);
			}
			return arg0.method20597(local7, 2048, anInt5388 * 1726905857, 64, 768);
		}
	}

	@OriginalMember(owner = "client!ta", name = "n", descriptor = "(Lclient!tx;B)V", line = 49)
	public void method31265(@OriginalArg(0) Class585 arg0, @OriginalArg(1) byte arg1) {
		if (arg0 == null || this.anInt5387 * 554261149 <= 0) {
			return;
		}
		this.method31270(arg0, (byte) -40);
		@Pc(14) Iterator local14 = this.aLinkedList4.iterator();
		while (local14.hasNext()) {
			@Pc(21) Class132_Sub1_Sub1_Sub6 local21 = (Class132_Sub1_Sub1_Sub6) local14.next();
			arg0.method31495(local21, false, -1990476630);
		}
		this.aBoolean813 = true;
	}

	@OriginalMember(owner = "client!ta", name = "v", descriptor = "(Lclient!tx;)V", line = 49)
	public void method31266(@OriginalArg(0) Class585 arg0) {
		if (arg0 == null || this.anInt5387 * 554261149 <= 0) {
			return;
		}
		this.method31270(arg0, (byte) -18);
		@Pc(14) Iterator local14 = this.aLinkedList4.iterator();
		while (local14.hasNext()) {
			@Pc(21) Class132_Sub1_Sub1_Sub6 local21 = (Class132_Sub1_Sub1_Sub6) local14.next();
			arg0.method31495(local21, false, -1880366099);
		}
		this.aBoolean813 = true;
	}

	@OriginalMember(owner = "client!ta", name = "m", descriptor = "(Lclient!tx;B)V", line = 62)
	public void method31267(@OriginalArg(0) Class585 arg0, @OriginalArg(1) byte arg1) {
		if (arg0 == null || this.aLinkedList4 == null) {
			return;
		}
		@Pc(9) Iterator local9 = this.aLinkedList4.iterator();
		while (local9.hasNext()) {
			@Pc(16) Class132_Sub1_Sub1_Sub6 local16 = (Class132_Sub1_Sub1_Sub6) local9.next();
			arg0.method31525(local16.aByte100, local16.aShort129, local16.aShort128, new Class579(local16), -864883262);
		}
	}

	@OriginalMember(owner = "client!ta", name = "o", descriptor = "(Lclient!tx;)V", line = 62)
	public void method31268(@OriginalArg(0) Class585 arg0) {
		if (arg0 == null || this.aLinkedList4 == null) {
			return;
		}
		@Pc(9) Iterator local9 = this.aLinkedList4.iterator();
		while (local9.hasNext()) {
			@Pc(16) Class132_Sub1_Sub1_Sub6 local16 = (Class132_Sub1_Sub1_Sub6) local9.next();
			arg0.method31525(local16.aByte100, local16.aShort129, local16.aShort128, new Class579(local16), -656815608);
		}
	}

	@OriginalMember(owner = "client!ta", name = "s", descriptor = "(Lclient!tx;)V", line = 73)
	void method31269(@OriginalArg(0) Class585 arg0) {
		this.aLinkedList4 = new LinkedList();
		@Pc(8) Class520 local8 = client.world.method30487(-1261392332);
		@Pc(12) Class611 local12 = client.world.method30455(2012769476);
		@Pc(27) Class611 local27 = new Class611(Class512.anInt5209 * 1177442423, this.anIntArray468[0], this.anIntArray469[0]);
		for (@Pc(29) int local29 = 1; local29 < this.anInt5387 * 554261149; local29++) {
			@Pc(50) Class611 local50 = new Class611(Class512.anInt5209 * 1177442423, this.anIntArray468[local29], this.anIntArray469[local29]);
			while (local27.anInt5623 * 270611681 != local50.anInt5623 * 270611681 || local27.anInt5624 * -1994307635 != local50.anInt5624 * -1994307635) {
				if (local27.anInt5623 * 270611681 < local50.anInt5623 * 270611681) {
					local27.anInt5623 += 2122256161;
				} else if (local27.anInt5623 * 270611681 > local50.anInt5623 * 270611681) {
					local27.anInt5623 -= 2122256161;
				}
				if (local27.anInt5624 * -1994307635 < local50.anInt5624 * -1994307635) {
					local27.anInt5624 += -67830523;
				} else if (local27.anInt5624 * -1994307635 > local50.anInt5624 * -1994307635) {
					local27.anInt5624 -= -67830523;
				}
				@Pc(134) int local134 = Class512.anInt5209 * 1177442423;
				@Pc(144) int local144 = local27.anInt5623 * 270611681 - local12.anInt5623 * 270611681;
				@Pc(154) int local154 = local27.anInt5624 * -1994307635 - local12.anInt5624 * -1994307635;
				if (local144 >= 0 && local144 < arg0.anInt5443 * -200159665 && local154 >= 0 && local154 < arg0.anInt5444 * -1943751559) {
					@Pc(176) int local176 = (local144 << 9) + 256;
					@Pc(182) int local182 = (local154 << 9) + 256;
					if (local8.method30330(local144, local154, -662808309)) {
						local134++;
					}
					this.aLinkedList4.add(new Class132_Sub1_Sub1_Sub6(arg0, this, Class512.anInt5209 * 1177442423, local134, local176, Class305.method26802(local176, local182, Class512.anInt5209 * 1177442423, (byte) -77), local182));
				}
			}
			local27 = local50;
		}
	}

	@OriginalMember(owner = "client!ta", name = "k", descriptor = "(Lclient!tx;B)V", line = 73)
	void method31270(@OriginalArg(0) Class585 arg0, @OriginalArg(1) byte arg1) {
		this.aLinkedList4 = new LinkedList();
		@Pc(8) Class520 local8 = client.world.method30487(1928147315);
		@Pc(12) Class611 local12 = client.world.method30455(2006744981);
		@Pc(27) Class611 local27 = new Class611(Class512.anInt5209 * 1177442423, this.anIntArray468[0], this.anIntArray469[0]);
		for (@Pc(29) int local29 = 1; local29 < this.anInt5387 * 554261149; local29++) {
			@Pc(50) Class611 local50 = new Class611(Class512.anInt5209 * 1177442423, this.anIntArray468[local29], this.anIntArray469[local29]);
			while (local27.anInt5623 * 270611681 != local50.anInt5623 * 270611681 || local27.anInt5624 * -1994307635 != local50.anInt5624 * -1994307635) {
				if (local27.anInt5623 * 270611681 < local50.anInt5623 * 270611681) {
					local27.anInt5623 += 2122256161;
				} else if (local27.anInt5623 * 270611681 > local50.anInt5623 * 270611681) {
					local27.anInt5623 -= 2122256161;
				}
				if (local27.anInt5624 * -1994307635 < local50.anInt5624 * -1994307635) {
					local27.anInt5624 += -67830523;
				} else if (local27.anInt5624 * -1994307635 > local50.anInt5624 * -1994307635) {
					local27.anInt5624 -= -67830523;
				}
				@Pc(134) int local134 = Class512.anInt5209 * 1177442423;
				@Pc(144) int local144 = local27.anInt5623 * 270611681 - local12.anInt5623 * 270611681;
				@Pc(154) int local154 = local27.anInt5624 * -1994307635 - local12.anInt5624 * -1994307635;
				if (local144 >= 0 && local144 < arg0.anInt5443 * -200159665 && local154 >= 0 && local154 < arg0.anInt5444 * -1943751559) {
					@Pc(176) int local176 = (local144 << 9) + 256;
					@Pc(182) int local182 = (local154 << 9) + 256;
					if (local8.method30330(local144, local154, -662808309)) {
						local134++;
					}
					this.aLinkedList4.add(new Class132_Sub1_Sub1_Sub6(arg0, this, Class512.anInt5209 * 1177442423, local134, local176, Class305.method26802(local176, local182, Class512.anInt5209 * 1177442423, (byte) -53), local182));
				}
			}
			local27 = local50;
		}
	}

	@OriginalMember(owner = "client!ta", name = "y", descriptor = "(Lclient!tx;)V", line = 73)
	void method31271(@OriginalArg(0) Class585 arg0) {
		this.aLinkedList4 = new LinkedList();
		@Pc(8) Class520 local8 = client.world.method30487(1357705550);
		@Pc(12) Class611 local12 = client.world.method30455(2088962294);
		@Pc(27) Class611 local27 = new Class611(Class512.anInt5209 * 1177442423, this.anIntArray468[0], this.anIntArray469[0]);
		for (@Pc(29) int local29 = 1; local29 < this.anInt5387 * 554261149; local29++) {
			@Pc(50) Class611 local50 = new Class611(Class512.anInt5209 * 1177442423, this.anIntArray468[local29], this.anIntArray469[local29]);
			while (local27.anInt5623 * 270611681 != local50.anInt5623 * 270611681 || local27.anInt5624 * -1994307635 != local50.anInt5624 * -1994307635) {
				if (local27.anInt5623 * 270611681 < local50.anInt5623 * 270611681) {
					local27.anInt5623 += 2122256161;
				} else if (local27.anInt5623 * 270611681 > local50.anInt5623 * 270611681) {
					local27.anInt5623 -= 2122256161;
				}
				if (local27.anInt5624 * -1994307635 < local50.anInt5624 * -1994307635) {
					local27.anInt5624 += -67830523;
				} else if (local27.anInt5624 * -1994307635 > local50.anInt5624 * -1994307635) {
					local27.anInt5624 -= -67830523;
				}
				@Pc(134) int local134 = Class512.anInt5209 * 1177442423;
				@Pc(144) int local144 = local27.anInt5623 * 270611681 - local12.anInt5623 * 270611681;
				@Pc(154) int local154 = local27.anInt5624 * -1994307635 - local12.anInt5624 * -1994307635;
				if (local144 >= 0 && local144 < arg0.anInt5443 * -200159665 && local154 >= 0 && local154 < arg0.anInt5444 * -1943751559) {
					@Pc(176) int local176 = (local144 << 9) + 256;
					@Pc(182) int local182 = (local154 << 9) + 256;
					if (local8.method30330(local144, local154, -662808309)) {
						local134++;
					}
					this.aLinkedList4.add(new Class132_Sub1_Sub1_Sub6(arg0, this, Class512.anInt5209 * 1177442423, local134, local176, Class305.method26802(local176, local182, Class512.anInt5209 * 1177442423, (byte) -19), local182));
				}
			}
			local27 = local50;
		}
	}

	@OriginalMember(owner = "client!ta", name = "q", descriptor = "(Lclient!tx;)V", line = 73)
	void method31272(@OriginalArg(0) Class585 arg0) {
		this.aLinkedList4 = new LinkedList();
		@Pc(8) Class520 local8 = client.world.method30487(1209348711);
		@Pc(12) Class611 local12 = client.world.method30455(2101845940);
		@Pc(27) Class611 local27 = new Class611(Class512.anInt5209 * 1177442423, this.anIntArray468[0], this.anIntArray469[0]);
		for (@Pc(29) int local29 = 1; local29 < this.anInt5387 * 554261149; local29++) {
			@Pc(50) Class611 local50 = new Class611(Class512.anInt5209 * 1177442423, this.anIntArray468[local29], this.anIntArray469[local29]);
			while (local27.anInt5623 * 270611681 != local50.anInt5623 * 270611681 || local27.anInt5624 * -1994307635 != local50.anInt5624 * -1994307635) {
				if (local27.anInt5623 * 270611681 < local50.anInt5623 * 270611681) {
					local27.anInt5623 += 2122256161;
				} else if (local27.anInt5623 * 270611681 > local50.anInt5623 * 270611681) {
					local27.anInt5623 -= 2122256161;
				}
				if (local27.anInt5624 * -1994307635 < local50.anInt5624 * -1994307635) {
					local27.anInt5624 += -67830523;
				} else if (local27.anInt5624 * -1994307635 > local50.anInt5624 * -1994307635) {
					local27.anInt5624 -= -67830523;
				}
				@Pc(134) int local134 = Class512.anInt5209 * 1177442423;
				@Pc(144) int local144 = local27.anInt5623 * 270611681 - local12.anInt5623 * 270611681;
				@Pc(154) int local154 = local27.anInt5624 * -1994307635 - local12.anInt5624 * -1994307635;
				if (local144 >= 0 && local144 < arg0.anInt5443 * -200159665 && local154 >= 0 && local154 < arg0.anInt5444 * -1943751559) {
					@Pc(176) int local176 = (local144 << 9) + 256;
					@Pc(182) int local182 = (local154 << 9) + 256;
					if (local8.method30330(local144, local154, -662808309)) {
						local134++;
					}
					this.aLinkedList4.add(new Class132_Sub1_Sub1_Sub6(arg0, this, Class512.anInt5209 * 1177442423, local134, local176, Class305.method26802(local176, local182, Class512.anInt5209 * 1177442423, (byte) -108), local182));
				}
			}
			local27 = local50;
		}
	}

	@OriginalMember(owner = "client!ta", name = "x", descriptor = "(Lclient!tx;)V", line = 73)
	void method31273(@OriginalArg(0) Class585 arg0) {
		this.aLinkedList4 = new LinkedList();
		@Pc(8) Class520 local8 = client.world.method30487(580292846);
		@Pc(12) Class611 local12 = client.world.method30455(2101151843);
		@Pc(27) Class611 local27 = new Class611(Class512.anInt5209 * 1177442423, this.anIntArray468[0], this.anIntArray469[0]);
		for (@Pc(29) int local29 = 1; local29 < this.anInt5387 * 554261149; local29++) {
			@Pc(50) Class611 local50 = new Class611(Class512.anInt5209 * 1177442423, this.anIntArray468[local29], this.anIntArray469[local29]);
			while (local27.anInt5623 * 270611681 != local50.anInt5623 * 270611681 || local27.anInt5624 * -1994307635 != local50.anInt5624 * -1994307635) {
				if (local27.anInt5623 * 270611681 < local50.anInt5623 * 270611681) {
					local27.anInt5623 += 2122256161;
				} else if (local27.anInt5623 * 270611681 > local50.anInt5623 * 270611681) {
					local27.anInt5623 -= 2122256161;
				}
				if (local27.anInt5624 * -1994307635 < local50.anInt5624 * -1994307635) {
					local27.anInt5624 += -67830523;
				} else if (local27.anInt5624 * -1994307635 > local50.anInt5624 * -1994307635) {
					local27.anInt5624 -= -67830523;
				}
				@Pc(134) int local134 = Class512.anInt5209 * 1177442423;
				@Pc(144) int local144 = local27.anInt5623 * 270611681 - local12.anInt5623 * 270611681;
				@Pc(154) int local154 = local27.anInt5624 * -1994307635 - local12.anInt5624 * -1994307635;
				if (local144 >= 0 && local144 < arg0.anInt5443 * -200159665 && local154 >= 0 && local154 < arg0.anInt5444 * -1943751559) {
					@Pc(176) int local176 = (local144 << 9) + 256;
					@Pc(182) int local182 = (local154 << 9) + 256;
					if (local8.method30330(local144, local154, -662808309)) {
						local134++;
					}
					this.aLinkedList4.add(new Class132_Sub1_Sub1_Sub6(arg0, this, Class512.anInt5209 * 1177442423, local134, local176, Class305.method26802(local176, local182, Class512.anInt5209 * 1177442423, (byte) -99), local182));
				}
			}
			local27 = local50;
		}
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)V", line = 99)
	public static void method31274(@OriginalArg(0) int arg0) {
		anInt5388 = arg0 * 655720961;
	}

	@OriginalMember(owner = "client!ta", name = "w", descriptor = "(I)V", line = 103)
	public void method31275(@OriginalArg(0) int arg0) {
		this.aBoolean813 = false;
		this.aClass109_8 = null;
	}

	@OriginalMember(owner = "client!ta", name = "h", descriptor = "()V", line = 103)
	public void method31276() {
		this.aBoolean813 = false;
		this.aClass109_8 = null;
	}

	@OriginalMember(owner = "client!ta", name = "i", descriptor = "()V", line = 103)
	public void method31277() {
		this.aBoolean813 = false;
		this.aClass109_8 = null;
	}

	@OriginalMember(owner = "client!ta", name = "g", descriptor = "()V", line = 103)
	public void method31278() {
		this.aBoolean813 = false;
		this.aClass109_8 = null;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "()V", line = 103)
	public void method31279() {
		this.aBoolean813 = false;
		this.aClass109_8 = null;
	}

	@OriginalMember(owner = "client!ta", name = "l", descriptor = "(I)Z", line = 108)
	public boolean method31280(@OriginalArg(0) int arg0) {
		return this.aBoolean813;
	}

	@OriginalMember(owner = "client!ta", name = "j", descriptor = "()Z", line = 108)
	public boolean method31281() {
		return this.aBoolean813;
	}

	@OriginalMember(owner = "client!ta", name = "u", descriptor = "(Lclient!dh;I)Z", line = 112)
	public boolean method31282(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		this.aClass109_8 = this.method31260(arg0, (short) 255);
		return this.aClass109_8 != null;
	}

	@OriginalMember(owner = "client!ta", name = "t", descriptor = "(Lclient!dh;)Z", line = 112)
	public boolean method31283(@OriginalArg(0) Class104 arg0) {
		this.aClass109_8 = this.method31260(arg0, (short) 255);
		return this.aClass109_8 != null;
	}

	@OriginalMember(owner = "client!ta", name = "bcl", descriptor = "(Lclient!yf;B)V", line = 14579)
	static final void method31284(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		Class688.method36521(arg0.aClass132_Sub1_Sub5_Sub1_1, arg0, 1265451683);
	}
}
