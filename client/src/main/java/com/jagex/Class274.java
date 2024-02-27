package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.util.ArrayList;
import java.util.List;

@OriginalClass("client!ft")
public final class Class274 {

	@OriginalMember(owner = "client!ft", name = "t", descriptor = "I")
	static final int anInt3923 = 5;

	@OriginalMember(owner = "client!ft", name = "tl", descriptor = "I")
	public static int anInt3924;

	@OriginalMember(owner = "client!ft", name = "f", descriptor = "Ljava/util/List;")
	final List aList13 = new ArrayList();

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "([J[Ljava/lang/Object;B)V")
	public static void method26798(@OriginalArg(0) long[] arg0, @OriginalArg(1) Object[] arg1, @OriginalArg(2) byte arg2) {
		Class68.method1248(arg0, arg1, 0, arg0.length - 1, 1823648861);
	}

	@OriginalMember(owner = "client!ft", name = "le", descriptor = "(Lclient!hx;III)V")
	static void method26799(@OriginalArg(0) Class327 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class323 local4 = arg0.method27643(Class279.aClass102_9, 1477428010);
		if (local4 == null) {
			return;
		}
		Class279.aClass102_9.method20986(arg1, arg2, arg0.anInt4103 * 1892149809 + arg1, arg2 + arg0.anInt4104 * 1990157877);
		if (Class27.anInt86 * 104994417 >= 3) {
			Class279.aClass102_9.method20748(-16777216, local4.aClass98_1, arg1, arg2);
			return;
		}
		@Pc(42) int local42;
		if (Class368.anInt4502 * -1583611537 == 3) {
			local42 = (int) -((double) BufferedSocket.aClass121_Sub1_2.method9648(-414253226) * 2607.5945876176133D);
		} else {
			local42 = (int) -client.aFloat255;
		}
		local42 = client.anInt3474 * 458103510 + local42 & 0x3FFF;
		local42 <<= 0x2;
		Class103_Sub17_Sub2.aClass99_18.method18238((float) (arg0.anInt4103 * 1892149809) / 2.0F + (float) arg1, (float) (arg0.anInt4104 * 1990157877) / 2.0F + (float) arg2, 4353, local42, local4.aClass98_1, arg1, arg2);
	}

	@OriginalMember(owner = "client!ft", name = "m", descriptor = "()I")
	public int method26778() {
		return this.aList13.size();
	}

	@OriginalMember(owner = "client!ft", name = "t", descriptor = "(I)I")
	public int method26779(@OriginalArg(0) int arg0) {
		return this.aList13.size();
	}

	@OriginalMember(owner = "client!ft", name = "f", descriptor = "(II)I")
	public int method26780(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.aList13.size(); local1++) {
			if (((Class273) this.aList13.get(local1)).anInt3920 * -1506819259 == arg0) {
				return local1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ft", name = "h", descriptor = "(I)V")
	public void method26781(@OriginalArg(0) int arg0) {
		this.aList13.remove(arg0);
	}

	@OriginalMember(owner = "client!ft", name = "u", descriptor = "(Lclient!fs;I)I")
	public int method26782(@OriginalArg(0) Class273 arg0, @OriginalArg(1) int arg1) {
		return this.method26794(arg0, -1, -1929287686);
	}

	@OriginalMember(owner = "client!ft", name = "r", descriptor = "(Lclient!fs;I)I")
	public int method26783(@OriginalArg(0) Class273 arg0, @OriginalArg(1) int arg1) {
		if (this.aList13.size() == 5) {
			throw new RuntimeException("");
		} else if (this.method26780(arg0.anInt3920 * -1506819259, 1079442383) == -1) {
			if (arg1 == -1) {
				arg1 = this.aList13.size();
			}
			this.aList13.add(arg1, arg0);
			return arg1;
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!ft", name = "g", descriptor = "(IB)V")
	public void method26784(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aList13.remove(arg0);
	}

	@OriginalMember(owner = "client!ft", name = "i", descriptor = "(I)V")
	public void method26785(@OriginalArg(0) int arg0) {
		this.aList13.clear();
	}

	@OriginalMember(owner = "client!ft", name = "x", descriptor = "(Lclient!fs;I)I")
	public int method26786(@OriginalArg(0) Class273 arg0, @OriginalArg(1) int arg1) {
		if (this.aList13.size() == 5) {
			throw new RuntimeException("");
		} else if (this.method26780(arg0.anInt3920 * -1506819259, 1021655817) == -1) {
			if (arg1 == -1) {
				arg1 = this.aList13.size();
			}
			this.aList13.add(arg1, arg0);
			return arg1;
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!ft", name = "o", descriptor = "(I)I")
	public int method26787(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.aList13.size(); local1++) {
			if (((Class273) this.aList13.get(local1)).anInt3920 * -1506819259 == arg0) {
				return local1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ft", name = "j", descriptor = "(I)I")
	public int method26788(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.aList13.size(); local1++) {
			if (((Class273) this.aList13.get(local1)).anInt3920 * -1506819259 == arg0) {
				return local1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(I)Lclient!fs;")
	public Class273 method26789(@OriginalArg(0) int arg0) {
		return (Class273) this.aList13.get(arg0);
	}

	@OriginalMember(owner = "client!ft", name = "s", descriptor = "(Lclient!fs;)I")
	public int method26790(@OriginalArg(0) Class273 arg0) {
		return this.method26794(arg0, -1, -785823484);
	}

	@OriginalMember(owner = "client!ft", name = "k", descriptor = "(Lclient!fs;I)I")
	public int method26791(@OriginalArg(0) Class273 arg0, @OriginalArg(1) int arg1) {
		if (this.aList13.size() == 5) {
			throw new RuntimeException("");
		} else if (this.method26780(arg0.anInt3920 * -1506819259, 1568828951) == -1) {
			if (arg1 == -1) {
				arg1 = this.aList13.size();
			}
			this.aList13.add(arg1, arg0);
			return arg1;
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!ft", name = "e", descriptor = "(II)Lclient!fs;")
	public Class273 method26792(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Class273) this.aList13.get(arg0);
	}

	@OriginalMember(owner = "client!ft", name = "w", descriptor = "(Lclient!fs;I)I")
	public int method26793(@OriginalArg(0) Class273 arg0, @OriginalArg(1) int arg1) {
		if (this.aList13.size() == 5) {
			throw new RuntimeException("");
		} else if (this.method26780(arg0.anInt3920 * -1506819259, 591405136) == -1) {
			if (arg1 == -1) {
				arg1 = this.aList13.size();
			}
			this.aList13.add(arg1, arg0);
			return arg1;
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!ft", name = "l", descriptor = "(Lclient!fs;II)I")
	public int method26794(@OriginalArg(0) Class273 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aList13.size() == 5) {
			throw new RuntimeException("");
		} else if (this.method26780(arg0.anInt3920 * -1506819259, 1406763160) == -1) {
			if (arg1 == -1) {
				arg1 = this.aList13.size();
			}
			this.aList13.add(arg1, arg0);
			return arg1;
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!ft", name = "q", descriptor = "(Lclient!fs;I)I")
	public int method26795(@OriginalArg(0) Class273 arg0, @OriginalArg(1) int arg1) {
		if (this.aList13.size() == 5) {
			throw new RuntimeException("");
		} else if (this.method26780(arg0.anInt3920 * -1506819259, 2130649497) == -1) {
			if (arg1 == -1) {
				arg1 = this.aList13.size();
			}
			this.aList13.add(arg1, arg0);
			return arg1;
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!ft", name = "d", descriptor = "(I)V")
	public void method26796(@OriginalArg(0) int arg0) {
		this.aList13.remove(arg0);
	}

	@OriginalMember(owner = "client!ft", name = "z", descriptor = "(I)V")
	public void method26797(@OriginalArg(0) int arg0) {
		this.aList13.remove(arg0);
	}
}
