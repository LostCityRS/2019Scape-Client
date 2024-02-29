package jagex3;

import java.util.Iterator;
import java.util.LinkedList;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public final class Class567 {

	@OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
	static int anInt5549 = 0;

	@OriginalMember(owner = "client!ta", name = "l", descriptor = "Ljava/util/LinkedList;")
	LinkedList aLinkedList5;

	@OriginalMember(owner = "client!ta", name = "u", descriptor = "Z")
	boolean aBoolean822;

	@OriginalMember(owner = "client!ta", name = "n", descriptor = "I")
	final int anInt5547;

	@OriginalMember(owner = "client!ta", name = "m", descriptor = "I")
	final int anInt5548;

	@OriginalMember(owner = "client!ta", name = "k", descriptor = "[I")
	final int[] anIntArray470;

	@OriginalMember(owner = "client!ta", name = "f", descriptor = "[I")
	final int[] anIntArray471;

	@OriginalMember(owner = "client!ta", name = "w", descriptor = "Lclient!do;")
	public Class109 aClass109_9;

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)V")
	public static void method31458(@OriginalArg(0) int arg0) {
		anInt5549 = arg0 * 655720961;
	}

	@OriginalMember(owner = "client!ta", name = "bcl", descriptor = "(Lclient!yf;B)V")
	static void method31465(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		Class688.method36701(arg0.aClass132_Sub1_Sub5_Sub1_1, arg0, 1265451683);
	}

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Lclient!dh;Lclient!alw;I)V")
	public Class567(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class93_Sub41 arg1, @OriginalArg(2) int arg2) {
		this.anInt5547 = arg2 * -264360161;
		this.anInt5548 = arg1.method22443(-358186793) * -2092434507;
		this.anIntArray470 = new int[this.anInt5548 * 554261149];
		this.anIntArray471 = new int[this.anInt5548 * 554261149];
		@Pc(31) int local31 = arg1.method22427(-1434290800);
		@Pc(35) int local35 = arg1.method22427(-1434290800);
		for (@Pc(37) int local37 = 0; local37 < this.anInt5548 * 554261149; local37++) {
			this.anIntArray470[local37] = local31 + arg1.method22426(2042379259);
			this.anIntArray471[local37] = local35 + arg1.method22426(1818791330);
		}
		this.aClass109_9 = this.method31441(arg0, (short) 255);
	}

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "(Lclient!dh;)Lclient!do;")
	Class109 method31440(@OriginalArg(0) Class104 arg0) {
		@Pc(7) Class231 local7 = Class231.method25748(Class86.aClass497_15, this.anInt5547 * 368086239, 0);
		if (local7 == null) {
			return null;
		} else {
			if (local7.anInt3779 < 13) {
				local7.method25764(2);
			}
			return arg0.method20522(local7, 2048, anInt5549 * 1726905857, 64, 768);
		}
	}

	@OriginalMember(owner = "client!ta", name = "e", descriptor = "(Lclient!dh;S)Lclient!do;")
	Class109 method31441(@OriginalArg(0) Class104 arg0, @OriginalArg(1) short arg1) {
		@Pc(7) Class231 local7 = Class231.method25748(Class86.aClass497_15, this.anInt5547 * 368086239, 0);
		if (local7 == null) {
			return null;
		} else {
			if (local7.anInt3779 < 13) {
				local7.method25764(2);
			}
			return arg0.method20522(local7, 2048, anInt5549 * 1726905857, 64, 768);
		}
	}

	@OriginalMember(owner = "client!ta", name = "s", descriptor = "(Lclient!tx;)V")
	void method31442(@OriginalArg(0) Class585 arg0) {
		this.aLinkedList5 = new LinkedList();
		@Pc(8) Class520 local8 = client.aClass532_1.method30690(-1261392332);
		@Pc(12) Class611 local12 = client.aClass532_1.method30624(2012769476);
		@Pc(27) Class611 local27 = new Class611(BaseVarTypeComponentHook.anInt5370 * 1177442423, this.anIntArray470[0], this.anIntArray471[0]);
		for (@Pc(29) int local29 = 1; local29 < this.anInt5548 * 554261149; local29++) {
			@Pc(50) Class611 local50 = new Class611(BaseVarTypeComponentHook.anInt5370 * 1177442423, this.anIntArray470[local29], this.anIntArray471[local29]);
			while (local27.anInt5784 * 270611681 != local50.anInt5784 * 270611681 || local27.anInt5785 * -1994307635 != local50.anInt5785 * -1994307635) {
				if (local27.anInt5784 * 270611681 < local50.anInt5784 * 270611681) {
					local27.anInt5784 += 2122256161;
				} else if (local27.anInt5784 * 270611681 > local50.anInt5784 * 270611681) {
					local27.anInt5784 -= 2122256161;
				}
				if (local27.anInt5785 * -1994307635 < local50.anInt5785 * -1994307635) {
					local27.anInt5785 += -67830523;
				} else if (local27.anInt5785 * -1994307635 > local50.anInt5785 * -1994307635) {
					local27.anInt5785 -= -67830523;
				}
				@Pc(134) int local134 = BaseVarTypeComponentHook.anInt5370 * 1177442423;
				@Pc(144) int local144 = local27.anInt5784 * 270611681 - local12.anInt5784 * 270611681;
				@Pc(154) int local154 = local27.anInt5785 * -1994307635 - local12.anInt5785 * -1994307635;
				if (local144 >= 0 && local144 < arg0.anInt5604 * -200159665 && local154 >= 0 && local154 < arg0.anInt5605 * -1943751559) {
					@Pc(176) int local176 = (local144 << 9) + 256;
					@Pc(182) int local182 = (local154 << 9) + 256;
					if (local8.method30511(local144, local154, -662808309)) {
						local134++;
					}
					this.aLinkedList5.add(new Class132_Sub1_Sub1_Sub6(arg0, this, BaseVarTypeComponentHook.anInt5370 * 1177442423, local134, local176, Class305.method26894(local176, local182, BaseVarTypeComponentHook.anInt5370 * 1177442423, (byte) -77), local182));
				}
			}
			local27 = local50;
		}
	}

	@OriginalMember(owner = "client!ta", name = "m", descriptor = "(Lclient!tx;B)V")
	public void method31443(@OriginalArg(0) Class585 arg0, @OriginalArg(1) byte arg1) {
		if (arg0 == null || this.aLinkedList5 == null) {
			return;
		}
		@Pc(9) Iterator local9 = this.aLinkedList5.iterator();
		while (local9.hasNext()) {
			@Pc(16) Class132_Sub1_Sub1_Sub6 local16 = (Class132_Sub1_Sub1_Sub6) local9.next();
			arg0.method31622(local16.aByte100, local16.aShort129, local16.aShort128, new Class579(local16), -864883262);
		}
	}

	@OriginalMember(owner = "client!ta", name = "k", descriptor = "(Lclient!tx;B)V")
	void method31444(@OriginalArg(0) Class585 arg0, @OriginalArg(1) byte arg1) {
		this.aLinkedList5 = new LinkedList();
		@Pc(8) Class520 local8 = client.aClass532_1.method30690(1928147315);
		@Pc(12) Class611 local12 = client.aClass532_1.method30624(2006744981);
		@Pc(27) Class611 local27 = new Class611(BaseVarTypeComponentHook.anInt5370 * 1177442423, this.anIntArray470[0], this.anIntArray471[0]);
		for (@Pc(29) int local29 = 1; local29 < this.anInt5548 * 554261149; local29++) {
			@Pc(50) Class611 local50 = new Class611(BaseVarTypeComponentHook.anInt5370 * 1177442423, this.anIntArray470[local29], this.anIntArray471[local29]);
			while (local27.anInt5784 * 270611681 != local50.anInt5784 * 270611681 || local27.anInt5785 * -1994307635 != local50.anInt5785 * -1994307635) {
				if (local27.anInt5784 * 270611681 < local50.anInt5784 * 270611681) {
					local27.anInt5784 += 2122256161;
				} else if (local27.anInt5784 * 270611681 > local50.anInt5784 * 270611681) {
					local27.anInt5784 -= 2122256161;
				}
				if (local27.anInt5785 * -1994307635 < local50.anInt5785 * -1994307635) {
					local27.anInt5785 += -67830523;
				} else if (local27.anInt5785 * -1994307635 > local50.anInt5785 * -1994307635) {
					local27.anInt5785 -= -67830523;
				}
				@Pc(134) int local134 = BaseVarTypeComponentHook.anInt5370 * 1177442423;
				@Pc(144) int local144 = local27.anInt5784 * 270611681 - local12.anInt5784 * 270611681;
				@Pc(154) int local154 = local27.anInt5785 * -1994307635 - local12.anInt5785 * -1994307635;
				if (local144 >= 0 && local144 < arg0.anInt5604 * -200159665 && local154 >= 0 && local154 < arg0.anInt5605 * -1943751559) {
					@Pc(176) int local176 = (local144 << 9) + 256;
					@Pc(182) int local182 = (local154 << 9) + 256;
					if (local8.method30511(local144, local154, -662808309)) {
						local134++;
					}
					this.aLinkedList5.add(new Class132_Sub1_Sub1_Sub6(arg0, this, BaseVarTypeComponentHook.anInt5370 * 1177442423, local134, local176, Class305.method26894(local176, local182, BaseVarTypeComponentHook.anInt5370 * 1177442423, (byte) -53), local182));
				}
			}
			local27 = local50;
		}
	}

	@OriginalMember(owner = "client!ta", name = "w", descriptor = "(I)V")
	public void method31445(@OriginalArg(0) int arg0) {
		this.aBoolean822 = false;
		this.aClass109_9 = null;
	}

	@OriginalMember(owner = "client!ta", name = "l", descriptor = "(I)Z")
	public boolean method31446(@OriginalArg(0) int arg0) {
		return this.aBoolean822;
	}

	@OriginalMember(owner = "client!ta", name = "u", descriptor = "(Lclient!dh;I)Z")
	public boolean method31447(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		this.aClass109_9 = this.method31441(arg0, (short) 255);
		return this.aClass109_9 != null;
	}

	@OriginalMember(owner = "client!ta", name = "z", descriptor = "(Lclient!dh;)Lclient!do;")
	Class109 method31448(@OriginalArg(0) Class104 arg0) {
		@Pc(7) Class231 local7 = Class231.method25748(Class86.aClass497_15, this.anInt5547 * 368086239, 0);
		if (local7 == null) {
			return null;
		} else {
			if (local7.anInt3779 < 13) {
				local7.method25764(2);
			}
			return arg0.method20522(local7, 2048, anInt5549 * 1726905857, 64, 768);
		}
	}

	@OriginalMember(owner = "client!ta", name = "p", descriptor = "(Lclient!dh;)Lclient!do;")
	Class109 method31449(@OriginalArg(0) Class104 arg0) {
		@Pc(7) Class231 local7 = Class231.method25748(Class86.aClass497_15, this.anInt5547 * 368086239, 0);
		if (local7 == null) {
			return null;
		} else {
			if (local7.anInt3779 < 13) {
				local7.method25764(2);
			}
			return arg0.method20522(local7, 2048, anInt5549 * 1726905857, 64, 768);
		}
	}

	@OriginalMember(owner = "client!ta", name = "d", descriptor = "(Lclient!dh;)Lclient!do;")
	Class109 method31450(@OriginalArg(0) Class104 arg0) {
		@Pc(7) Class231 local7 = Class231.method25748(Class86.aClass497_15, this.anInt5547 * 368086239, 0);
		if (local7 == null) {
			return null;
		} else {
			if (local7.anInt3779 < 13) {
				local7.method25764(2);
			}
			return arg0.method20522(local7, 2048, anInt5549 * 1726905857, 64, 768);
		}
	}

	@OriginalMember(owner = "client!ta", name = "n", descriptor = "(Lclient!tx;B)V")
	public void method31451(@OriginalArg(0) Class585 arg0, @OriginalArg(1) byte arg1) {
		if (arg0 == null || this.anInt5548 * 554261149 <= 0) {
			return;
		}
		this.method31444(arg0, (byte) -40);
		@Pc(14) Iterator local14 = this.aLinkedList5.iterator();
		while (local14.hasNext()) {
			@Pc(21) Class132_Sub1_Sub1_Sub6 local21 = (Class132_Sub1_Sub1_Sub6) local14.next();
			arg0.method31678(local21, false, -1990476630);
		}
		this.aBoolean822 = true;
	}

	@OriginalMember(owner = "client!ta", name = "v", descriptor = "(Lclient!tx;)V")
	public void method31452(@OriginalArg(0) Class585 arg0) {
		if (arg0 == null || this.anInt5548 * 554261149 <= 0) {
			return;
		}
		this.method31444(arg0, (byte) -18);
		@Pc(14) Iterator local14 = this.aLinkedList5.iterator();
		while (local14.hasNext()) {
			@Pc(21) Class132_Sub1_Sub1_Sub6 local21 = (Class132_Sub1_Sub1_Sub6) local14.next();
			arg0.method31678(local21, false, -1880366099);
		}
		this.aBoolean822 = true;
	}

	@OriginalMember(owner = "client!ta", name = "o", descriptor = "(Lclient!tx;)V")
	public void method31453(@OriginalArg(0) Class585 arg0) {
		if (arg0 == null || this.aLinkedList5 == null) {
			return;
		}
		@Pc(9) Iterator local9 = this.aLinkedList5.iterator();
		while (local9.hasNext()) {
			@Pc(16) Class132_Sub1_Sub1_Sub6 local16 = (Class132_Sub1_Sub1_Sub6) local9.next();
			arg0.method31622(local16.aByte100, local16.aShort129, local16.aShort128, new Class579(local16), -656815608);
		}
	}

	@OriginalMember(owner = "client!ta", name = "r", descriptor = "(Lclient!dh;)Lclient!do;")
	Class109 method31454(@OriginalArg(0) Class104 arg0) {
		@Pc(7) Class231 local7 = Class231.method25748(Class86.aClass497_15, this.anInt5547 * 368086239, 0);
		if (local7 == null) {
			return null;
		} else {
			if (local7.anInt3779 < 13) {
				local7.method25764(2);
			}
			return arg0.method20522(local7, 2048, anInt5549 * 1726905857, 64, 768);
		}
	}

	@OriginalMember(owner = "client!ta", name = "y", descriptor = "(Lclient!tx;)V")
	void method31455(@OriginalArg(0) Class585 arg0) {
		this.aLinkedList5 = new LinkedList();
		@Pc(8) Class520 local8 = client.aClass532_1.method30690(1357705550);
		@Pc(12) Class611 local12 = client.aClass532_1.method30624(2088962294);
		@Pc(27) Class611 local27 = new Class611(BaseVarTypeComponentHook.anInt5370 * 1177442423, this.anIntArray470[0], this.anIntArray471[0]);
		for (@Pc(29) int local29 = 1; local29 < this.anInt5548 * 554261149; local29++) {
			@Pc(50) Class611 local50 = new Class611(BaseVarTypeComponentHook.anInt5370 * 1177442423, this.anIntArray470[local29], this.anIntArray471[local29]);
			while (local27.anInt5784 * 270611681 != local50.anInt5784 * 270611681 || local27.anInt5785 * -1994307635 != local50.anInt5785 * -1994307635) {
				if (local27.anInt5784 * 270611681 < local50.anInt5784 * 270611681) {
					local27.anInt5784 += 2122256161;
				} else if (local27.anInt5784 * 270611681 > local50.anInt5784 * 270611681) {
					local27.anInt5784 -= 2122256161;
				}
				if (local27.anInt5785 * -1994307635 < local50.anInt5785 * -1994307635) {
					local27.anInt5785 += -67830523;
				} else if (local27.anInt5785 * -1994307635 > local50.anInt5785 * -1994307635) {
					local27.anInt5785 -= -67830523;
				}
				@Pc(134) int local134 = BaseVarTypeComponentHook.anInt5370 * 1177442423;
				@Pc(144) int local144 = local27.anInt5784 * 270611681 - local12.anInt5784 * 270611681;
				@Pc(154) int local154 = local27.anInt5785 * -1994307635 - local12.anInt5785 * -1994307635;
				if (local144 >= 0 && local144 < arg0.anInt5604 * -200159665 && local154 >= 0 && local154 < arg0.anInt5605 * -1943751559) {
					@Pc(176) int local176 = (local144 << 9) + 256;
					@Pc(182) int local182 = (local154 << 9) + 256;
					if (local8.method30511(local144, local154, -662808309)) {
						local134++;
					}
					this.aLinkedList5.add(new Class132_Sub1_Sub1_Sub6(arg0, this, BaseVarTypeComponentHook.anInt5370 * 1177442423, local134, local176, Class305.method26894(local176, local182, BaseVarTypeComponentHook.anInt5370 * 1177442423, (byte) -19), local182));
				}
			}
			local27 = local50;
		}
	}

	@OriginalMember(owner = "client!ta", name = "q", descriptor = "(Lclient!tx;)V")
	void method31456(@OriginalArg(0) Class585 arg0) {
		this.aLinkedList5 = new LinkedList();
		@Pc(8) Class520 local8 = client.aClass532_1.method30690(1209348711);
		@Pc(12) Class611 local12 = client.aClass532_1.method30624(2101845940);
		@Pc(27) Class611 local27 = new Class611(BaseVarTypeComponentHook.anInt5370 * 1177442423, this.anIntArray470[0], this.anIntArray471[0]);
		for (@Pc(29) int local29 = 1; local29 < this.anInt5548 * 554261149; local29++) {
			@Pc(50) Class611 local50 = new Class611(BaseVarTypeComponentHook.anInt5370 * 1177442423, this.anIntArray470[local29], this.anIntArray471[local29]);
			while (local27.anInt5784 * 270611681 != local50.anInt5784 * 270611681 || local27.anInt5785 * -1994307635 != local50.anInt5785 * -1994307635) {
				if (local27.anInt5784 * 270611681 < local50.anInt5784 * 270611681) {
					local27.anInt5784 += 2122256161;
				} else if (local27.anInt5784 * 270611681 > local50.anInt5784 * 270611681) {
					local27.anInt5784 -= 2122256161;
				}
				if (local27.anInt5785 * -1994307635 < local50.anInt5785 * -1994307635) {
					local27.anInt5785 += -67830523;
				} else if (local27.anInt5785 * -1994307635 > local50.anInt5785 * -1994307635) {
					local27.anInt5785 -= -67830523;
				}
				@Pc(134) int local134 = BaseVarTypeComponentHook.anInt5370 * 1177442423;
				@Pc(144) int local144 = local27.anInt5784 * 270611681 - local12.anInt5784 * 270611681;
				@Pc(154) int local154 = local27.anInt5785 * -1994307635 - local12.anInt5785 * -1994307635;
				if (local144 >= 0 && local144 < arg0.anInt5604 * -200159665 && local154 >= 0 && local154 < arg0.anInt5605 * -1943751559) {
					@Pc(176) int local176 = (local144 << 9) + 256;
					@Pc(182) int local182 = (local154 << 9) + 256;
					if (local8.method30511(local144, local154, -662808309)) {
						local134++;
					}
					this.aLinkedList5.add(new Class132_Sub1_Sub1_Sub6(arg0, this, BaseVarTypeComponentHook.anInt5370 * 1177442423, local134, local176, Class305.method26894(local176, local182, BaseVarTypeComponentHook.anInt5370 * 1177442423, (byte) -108), local182));
				}
			}
			local27 = local50;
		}
	}

	@OriginalMember(owner = "client!ta", name = "x", descriptor = "(Lclient!tx;)V")
	void method31457(@OriginalArg(0) Class585 arg0) {
		this.aLinkedList5 = new LinkedList();
		@Pc(8) Class520 local8 = client.aClass532_1.method30690(580292846);
		@Pc(12) Class611 local12 = client.aClass532_1.method30624(2101151843);
		@Pc(27) Class611 local27 = new Class611(BaseVarTypeComponentHook.anInt5370 * 1177442423, this.anIntArray470[0], this.anIntArray471[0]);
		for (@Pc(29) int local29 = 1; local29 < this.anInt5548 * 554261149; local29++) {
			@Pc(50) Class611 local50 = new Class611(BaseVarTypeComponentHook.anInt5370 * 1177442423, this.anIntArray470[local29], this.anIntArray471[local29]);
			while (local27.anInt5784 * 270611681 != local50.anInt5784 * 270611681 || local27.anInt5785 * -1994307635 != local50.anInt5785 * -1994307635) {
				if (local27.anInt5784 * 270611681 < local50.anInt5784 * 270611681) {
					local27.anInt5784 += 2122256161;
				} else if (local27.anInt5784 * 270611681 > local50.anInt5784 * 270611681) {
					local27.anInt5784 -= 2122256161;
				}
				if (local27.anInt5785 * -1994307635 < local50.anInt5785 * -1994307635) {
					local27.anInt5785 += -67830523;
				} else if (local27.anInt5785 * -1994307635 > local50.anInt5785 * -1994307635) {
					local27.anInt5785 -= -67830523;
				}
				@Pc(134) int local134 = BaseVarTypeComponentHook.anInt5370 * 1177442423;
				@Pc(144) int local144 = local27.anInt5784 * 270611681 - local12.anInt5784 * 270611681;
				@Pc(154) int local154 = local27.anInt5785 * -1994307635 - local12.anInt5785 * -1994307635;
				if (local144 >= 0 && local144 < arg0.anInt5604 * -200159665 && local154 >= 0 && local154 < arg0.anInt5605 * -1943751559) {
					@Pc(176) int local176 = (local144 << 9) + 256;
					@Pc(182) int local182 = (local154 << 9) + 256;
					if (local8.method30511(local144, local154, -662808309)) {
						local134++;
					}
					this.aLinkedList5.add(new Class132_Sub1_Sub1_Sub6(arg0, this, BaseVarTypeComponentHook.anInt5370 * 1177442423, local134, local176, Class305.method26894(local176, local182, BaseVarTypeComponentHook.anInt5370 * 1177442423, (byte) -99), local182));
				}
			}
			local27 = local50;
		}
	}

	@OriginalMember(owner = "client!ta", name = "h", descriptor = "()V")
	public void method31459() {
		this.aBoolean822 = false;
		this.aClass109_9 = null;
	}

	@OriginalMember(owner = "client!ta", name = "i", descriptor = "()V")
	public void method31460() {
		this.aBoolean822 = false;
		this.aClass109_9 = null;
	}

	@OriginalMember(owner = "client!ta", name = "g", descriptor = "()V")
	public void method31461() {
		this.aBoolean822 = false;
		this.aClass109_9 = null;
	}

	@OriginalMember(owner = "client!ta", name = "j", descriptor = "()Z")
	public boolean method31462() {
		return this.aBoolean822;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "()V")
	public void method31463() {
		this.aBoolean822 = false;
		this.aClass109_9 = null;
	}

	@OriginalMember(owner = "client!ta", name = "t", descriptor = "(Lclient!dh;)Z")
	public boolean method31464(@OriginalArg(0) Class104 arg0) {
		this.aClass109_9 = this.method31441(arg0, (short) 255);
		return this.aClass109_9 != null;
	}
}
