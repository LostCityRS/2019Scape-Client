package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lm")
public final class Class399 {

	@OriginalMember(owner = "client!lm", name = "bx", descriptor = "(II)Z")
	static boolean method28732(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (method28758(arg0, arg1)) {
			return (arg0 & 0x9000) != 0 | method28738(arg0, arg1) | method28739(arg0, arg1) ? true : (arg1 & 0x37) == 0 & ((arg0 & 0x2000) != 0 | method28737(arg0, arg1) | method28795(arg0, arg1));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lm", name = "t", descriptor = "(II)Z")
	static boolean method28733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "f", descriptor = "(II)Z")
	static boolean method28734(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "e", descriptor = "(II)Z")
	static boolean method28735(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "an", descriptor = "(II)Z")
	static boolean method28736(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "l", descriptor = "(II)Z")
	static boolean method28737(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x220) == 544 | (arg0 & 0x18) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "g", descriptor = "(II)Z")
	static boolean method28738(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "i", descriptor = "(II)Z")
	static boolean method28739(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x100) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "m", descriptor = "(II)Z")
	static boolean method28740(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!lm", name = "be", descriptor = "(II)Z")
	static boolean method28741(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "j", descriptor = "(II)Z")
	static boolean method28742(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(II)Z")
	static boolean method28743(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0xC580) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "ae", descriptor = "(II)Z")
	static boolean method28744(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x100) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "k", descriptor = "(II)Z")
	static boolean method28745(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "co", descriptor = "(II)Z")
	static boolean method28746(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "bz", descriptor = "(II)Z")
	static boolean method28747(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "r", descriptor = "(II)Z")
	static boolean method28748(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "q", descriptor = "(II)Z")
	static boolean method28749(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "h", descriptor = "(II)Z")
	static boolean method28750(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (method28733(arg0, arg1) | method28734(arg0, arg1) | method28735(arg0, arg1)) & method28745(arg0, arg1);
	}

	@OriginalMember(owner = "client!lm", name = "d", descriptor = "(II)Z")
	static boolean method28751(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method28804(arg0, arg1) & ((arg0 & 0x2000) != 0 | method28737(arg0, arg1) | method28795(arg0, arg1));
	}

	@OriginalMember(owner = "client!lm", name = "z", descriptor = "(II)Z")
	static boolean method28752(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (method28758(arg0, arg1)) {
			return (arg0 & 0x9000) != 0 | method28738(arg0, arg1) | method28739(arg0, arg1) ? true : (arg1 & 0x37) == 0 & ((arg0 & 0x2000) != 0 | method28737(arg0, arg1) | method28795(arg0, arg1));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lm", name = "p", descriptor = "(II)Z")
	static boolean method28753(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method28740(arg0, arg1) & method28748(arg0, arg1);
	}

	@OriginalMember(owner = "client!lm", name = "v", descriptor = "(II)Z")
	static boolean method28754(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method28755(arg0, arg1) & method28749(arg0, arg1);
	}

	@OriginalMember(owner = "client!lm", name = "o", descriptor = "(II)Z")
	static boolean method28755(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "n", descriptor = "(II)Z")
	static boolean method28756(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 || method28734(arg0, arg1) || method28750(arg0, arg1);
	}

	@OriginalMember(owner = "client!lm", name = "az", descriptor = "(II)Z")
	static boolean method28757(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "w", descriptor = "(II)Z")
	static boolean method28758(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "ax", descriptor = "(II)Z")
	static boolean method28759(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method28738(arg0, arg1) || method28752(arg0, arg1);
	}

	@OriginalMember(owner = "client!lm", name = "ay", descriptor = "(II)Z")
	static boolean method28760(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x40000) != 0 | method28739(arg0, arg1) || method28752(arg0, arg1);
	}

	@OriginalMember(owner = "client!lm", name = "u", descriptor = "(II)Z")
	static boolean method28761(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "ag", descriptor = "(II)Z")
	static boolean method28762(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0 | method28742(arg0, arg1) || method28752(arg0, arg1);
	}

	@OriginalMember(owner = "client!lm", name = "ao", descriptor = "(II)Z")
	static boolean method28763(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "cm", descriptor = "(II)Z")
	static boolean method28764(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method28738(arg0, arg1) || method28752(arg0, arg1);
	}

	@OriginalMember(owner = "client!lm", name = "ac", descriptor = "(II)Z")
	static boolean method28765(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x60000) != 0 | method28755(arg0, arg1) || method28754(arg0, arg1);
	}

	@OriginalMember(owner = "client!lm", name = "bi", descriptor = "(II)Z")
	static boolean method28766(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (method28758(arg0, arg1)) {
			return (arg0 & 0x9000) != 0 | method28738(arg0, arg1) | method28739(arg0, arg1) ? true : (arg1 & 0x37) == 0 & ((arg0 & 0x2000) != 0 | method28737(arg0, arg1) | method28795(arg0, arg1));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lm", name = "av", descriptor = "(II)Z")
	static boolean method28767(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "al", descriptor = "(II)Z")
	static boolean method28768(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "cr", descriptor = "(II)Z")
	static boolean method28769(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method28738(arg0, arg1) || method28752(arg0, arg1);
	}

	@OriginalMember(owner = "client!lm", name = "bm", descriptor = "(II)Z")
	static boolean method28770(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method28740(arg0, arg1) & method28748(arg0, arg1);
	}

	@OriginalMember(owner = "client!lm", name = "am", descriptor = "(II)Z")
	static boolean method28771(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "cx", descriptor = "(II)Z")
	static boolean method28772(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "at", descriptor = "(II)Z")
	static boolean method28773(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "ad", descriptor = "(II)Z")
	static boolean method28774(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x220) == 544 | (arg0 & 0x18) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "bb", descriptor = "(II)Z")
	static boolean method28775(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "cd", descriptor = "(II)Z")
	static boolean method28776(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 || method28733(arg0, arg1) || method28750(arg0, arg1);
	}

	@OriginalMember(owner = "client!lm", name = "y", descriptor = "(II)Z")
	static boolean method28777(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 || method28733(arg0, arg1) || method28750(arg0, arg1);
	}

	@OriginalMember(owner = "client!lm", name = "cp", descriptor = "(II)Z")
	static boolean method28778(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x40000) != 0 | method28739(arg0, arg1) || method28752(arg0, arg1);
	}

	@OriginalMember(owner = "client!lm", name = "ap", descriptor = "(II)Z")
	static boolean method28779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x100) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "ar", descriptor = "(II)Z")
	static boolean method28780(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!lm", name = "au", descriptor = "(II)Z")
	static boolean method28781(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!lm", name = "bf", descriptor = "(II)Z")
	static boolean method28782(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method28804(arg0, arg1) & ((arg0 & 0x2000) != 0 | method28737(arg0, arg1) | method28795(arg0, arg1));
	}

	@OriginalMember(owner = "client!lm", name = "as", descriptor = "(II)Z")
	static boolean method28783(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "aw", descriptor = "(II)Z")
	static boolean method28784(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "bg", descriptor = "(II)Z")
	static boolean method28785(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0xC580) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "bl", descriptor = "(II)Z")
	static boolean method28786(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0xC580) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "br", descriptor = "(II)Z")
	static boolean method28787(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "bn", descriptor = "(II)Z")
	static boolean method28788(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "ba", descriptor = "(II)Z")
	static boolean method28789(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "bt", descriptor = "(II)Z")
	static boolean method28790(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "bs", descriptor = "(II)Z")
	static boolean method28791(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "bj", descriptor = "(II)Z")
	static boolean method28792(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "by", descriptor = "(II)Z")
	static boolean method28793(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "bk", descriptor = "(II)Z")
	static boolean method28794(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "s", descriptor = "(II)Z")
	static boolean method28795(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "ai", descriptor = "(II)Z")
	static boolean method28796(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method28740(arg0, arg1) || method28753(arg0, arg1);
	}

	@OriginalMember(owner = "client!lm", name = "bh", descriptor = "(II)Z")
	static boolean method28797(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "bv", descriptor = "(II)Z")
	static boolean method28798(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "bp", descriptor = "(II)Z")
	static boolean method28799(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "aj", descriptor = "(II)Z")
	static boolean method28800(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "bo", descriptor = "(II)Z")
	static boolean method28801(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "bc", descriptor = "(II)Z")
	static boolean method28802(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method28804(arg0, arg1) & ((arg0 & 0x2000) != 0 | method28737(arg0, arg1) | method28795(arg0, arg1));
	}

	@OriginalMember(owner = "client!lm", name = "ch", descriptor = "(II)Z")
	static boolean method28803(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 || method28735(arg0, arg1) || method28750(arg0, arg1);
	}

	@OriginalMember(owner = "client!lm", name = "x", descriptor = "(II)Z")
	static boolean method28804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "cv", descriptor = "(II)Z")
	static boolean method28805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 || method28733(arg0, arg1) || method28750(arg0, arg1);
	}

	@OriginalMember(owner = "client!lm", name = "ab", descriptor = "(II)Z")
	static boolean method28806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "bu", descriptor = "(II)Z")
	static boolean method28807(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method28740(arg0, arg1) & method28748(arg0, arg1);
	}

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "(II)Z")
	static boolean method28808(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 || method28735(arg0, arg1) || method28750(arg0, arg1);
	}

	@OriginalMember(owner = "client!lm", name = "ck", descriptor = "(II)Z")
	static boolean method28809(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) boolean local11 = (arg1 & 0x37) == 0 ? method28752(arg0, arg1) : method28751(arg0, arg1);
		return (arg0 & 0x10000) != 0 | method28737(arg0, arg1) | local11;
	}

	@OriginalMember(owner = "client!lm", name = "bd", descriptor = "(II)Z")
	static boolean method28810(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method28755(arg0, arg1) & method28749(arg0, arg1);
	}

	@OriginalMember(owner = "client!lm", name = "aq", descriptor = "(II)Z")
	static boolean method28811(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "aa", descriptor = "(II)Z")
	static boolean method28812(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "cn", descriptor = "(II)Z")
	static boolean method28813(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 || method28733(arg0, arg1) || method28750(arg0, arg1);
	}

	@OriginalMember(owner = "client!lm", name = "cy", descriptor = "(II)Z")
	static boolean method28814(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 || method28734(arg0, arg1) || method28750(arg0, arg1);
	}

	@OriginalMember(owner = "client!lm", name = "bq", descriptor = "(II)Z")
	static boolean method28815(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method28755(arg0, arg1) & method28749(arg0, arg1);
	}

	@OriginalMember(owner = "client!lm", name = "cc", descriptor = "(II)Z")
	static boolean method28816(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 || method28735(arg0, arg1) || method28750(arg0, arg1);
	}

	@OriginalMember(owner = "client!lm", name = "cu", descriptor = "(II)Z")
	static boolean method28817(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 || method28735(arg0, arg1) || method28750(arg0, arg1);
	}

	@OriginalMember(owner = "client!lm", name = "ce", descriptor = "(II)Z")
	static boolean method28818(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) boolean local11 = (arg1 & 0x37) == 0 ? method28752(arg0, arg1) : method28751(arg0, arg1);
		return (arg0 & 0x10000) != 0 | method28737(arg0, arg1) | local11;
	}

	@OriginalMember(owner = "client!lm", name = "cs", descriptor = "(II)Z")
	static boolean method28819(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) boolean local11 = (arg1 & 0x37) == 0 ? method28752(arg0, arg1) : method28751(arg0, arg1);
		return (arg0 & 0x10000) != 0 | method28737(arg0, arg1) | local11;
	}

	@OriginalMember(owner = "client!lm", name = "cj", descriptor = "(II)Z")
	static boolean method28820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) boolean local11 = (arg1 & 0x37) == 0 ? method28752(arg0, arg1) : method28751(arg0, arg1);
		return (arg0 & 0x10000) != 0 | method28737(arg0, arg1) | local11;
	}

	@OriginalMember(owner = "client!lm", name = "ct", descriptor = "(II)Z")
	static boolean method28821(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 || method28733(arg0, arg1) || method28750(arg0, arg1);
	}

	@OriginalMember(owner = "client!lm", name = "ca", descriptor = "(II)Z")
	static boolean method28822(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method28738(arg0, arg1) || method28752(arg0, arg1);
	}

	@OriginalMember(owner = "client!lm", name = "ah", descriptor = "(II)Z")
	static boolean method28823(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "ci", descriptor = "(II)Z")
	static boolean method28824(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method28738(arg0, arg1) || method28752(arg0, arg1);
	}

	@OriginalMember(owner = "client!lm", name = "dd", descriptor = "(II)Z")
	static boolean method28825(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x60000) != 0 | method28755(arg0, arg1) || method28754(arg0, arg1);
	}

	@OriginalMember(owner = "client!lm", name = "af", descriptor = "(II)Z")
	static boolean method28826(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "cg", descriptor = "(II)Z")
	static boolean method28827(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method28740(arg0, arg1) || method28753(arg0, arg1);
	}

	@OriginalMember(owner = "client!lm", name = "cb", descriptor = "(II)Z")
	static boolean method28828(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "cw", descriptor = "(II)Z")
	static boolean method28829(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "cl", descriptor = "(II)Z")
	static boolean method28830(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "dc", descriptor = "(II)Z")
	static boolean method28831(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0 | method28742(arg0, arg1) || method28752(arg0, arg1);
	}

	@OriginalMember(owner = "client!lm", name = "cf", descriptor = "(II)Z")
	static boolean method28832(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "ak", descriptor = "(II)Z")
	static boolean method28833(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "cz", descriptor = "(II)Z")
	static boolean method28834(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!lm", name = "cq", descriptor = "(II)Z")
	static boolean method28835(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x60000) != 0 | method28755(arg0, arg1) || method28754(arg0, arg1);
	}

	@OriginalMember(owner = "client!lm", name = "dg", descriptor = "(II)Z")
	static boolean method28836(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x60000) != 0 | method28755(arg0, arg1) || method28754(arg0, arg1);
	}

	@OriginalMember(owner = "client!lm", name = "dh", descriptor = "(II)Z")
	static boolean method28837(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x60000) != 0 | method28755(arg0, arg1) || method28754(arg0, arg1);
	}

	@OriginalMember(owner = "client!lm", name = "bw", descriptor = "(II)Z")
	static boolean method28838(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method28804(arg0, arg1) & ((arg0 & 0x2000) != 0 | method28737(arg0, arg1) | method28795(arg0, arg1));
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(II)Z")
	static boolean method28839(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) boolean local11 = (arg1 & 0x37) == 0 ? method28752(arg0, arg1) : method28751(arg0, arg1);
		return (arg0 & 0x10000) != 0 | method28737(arg0, arg1) | local11;
	}

	@OriginalMember(owner = "client!lm", name = "dn", descriptor = "(II)Z")
	static boolean method28840(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0 | method28742(arg0, arg1) || method28752(arg0, arg1);
	}

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "()V")
	Class399() throws Throwable {
		throw new Error();
	}
}
