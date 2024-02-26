package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public final class Class184 {

	@OriginalMember(owner = "client!bh", name = "j", descriptor = "(II)Z")
	static boolean method24702(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!bh", name = "t", descriptor = "(II)Z")
	static boolean method24703(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!bh", name = "f", descriptor = "(II)Z")
	static boolean method24704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!bh", name = "bu", descriptor = "(II)Z")
	static boolean method24705(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method24710(arg0, arg1) & method24797(arg0, arg1);
	}

	@OriginalMember(owner = "client!bh", name = "u", descriptor = "(II)Z")
	static boolean method24706(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!bh", name = "bo", descriptor = "(II)Z")
	static boolean method24707(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!bh", name = "g", descriptor = "(II)Z")
	static boolean method24708(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!bh", name = "x", descriptor = "(II)Z")
	static boolean method24709(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!bh", name = "m", descriptor = "(II)Z")
	static boolean method24710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!bh", name = "i", descriptor = "(II)Z")
	static boolean method24711(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x100100) != 0;
	}

	@OriginalMember(owner = "client!bh", name = "bk", descriptor = "(II)Z")
	static boolean method24712(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!bh", name = "bs", descriptor = "(II)Z")
	static boolean method24713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!bh", name = "s", descriptor = "(II)Z")
	static boolean method24714(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!bh", name = "y", descriptor = "(II)Z")
	static boolean method24715(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 | method24703(arg0, arg1) || method24720(arg0, arg1);
	}

	@OriginalMember(owner = "client!bh", name = "cl", descriptor = "(II)Z")
	static boolean method24716(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0 | method24702(arg0, arg1) || method24722(arg0, arg1);
	}

	@OriginalMember(owner = "client!bh", name = "w", descriptor = "(II)Z")
	static boolean method24717(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!bh", name = "al", descriptor = "(II)Z")
	static boolean method24718(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!bh", name = "q", descriptor = "(II)Z")
	static boolean method24719(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!bh", name = "h", descriptor = "(II)Z")
	static boolean method24720(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (method24703(arg0, arg1) | method24704(arg0, arg1) | method24766(arg0, arg1)) & method24761(arg0, arg1);
	}

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "(II)Z")
	static boolean method24721(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return ((arg0 & 0x2000) != 0 | method24725(arg0, arg1) | method24714(arg0, arg1)) & method24709(arg0, arg1);
	}

	@OriginalMember(owner = "client!bh", name = "z", descriptor = "(II)Z")
	static boolean method24722(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (method24717(arg0, arg1)) {
			return (arg0 & 0xB000) != 0 | method24708(arg0, arg1) | method24711(arg0, arg1) ? true : (arg1 & 0x37) == 0 & (method24725(arg0, arg1) | method24714(arg0, arg1));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bh", name = "p", descriptor = "(II)Z")
	static boolean method24723(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method24710(arg0, arg1) & method24797(arg0, arg1);
	}

	@OriginalMember(owner = "client!bh", name = "v", descriptor = "(II)Z")
	static boolean method24724(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method24790(arg0, arg1) & method24719(arg0, arg1);
	}

	@OriginalMember(owner = "client!bh", name = "l", descriptor = "(II)Z")
	static boolean method24725(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x220) == 544 | (arg0 & 0x18) != 0;
	}

	@OriginalMember(owner = "client!bh", name = "n", descriptor = "(II)Z")
	static boolean method24726(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 | method24704(arg0, arg1) || method24720(arg0, arg1);
	}

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "(II)Z")
	static boolean method24727(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 | method24766(arg0, arg1) || method24720(arg0, arg1);
	}

	@OriginalMember(owner = "client!bh", name = "cc", descriptor = "(II)Z")
	static boolean method24728(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method24708(arg0, arg1) || method24722(arg0, arg1);
	}

	@OriginalMember(owner = "client!bh", name = "ax", descriptor = "(II)Z")
	static boolean method24729(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method24708(arg0, arg1) || method24722(arg0, arg1);
	}

	@OriginalMember(owner = "client!bh", name = "ay", descriptor = "(II)Z")
	static boolean method24730(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x40000) != 0 | method24711(arg0, arg1) || method24722(arg0, arg1);
	}

	@OriginalMember(owner = "client!bh", name = "ai", descriptor = "(II)Z")
	static boolean method24731(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method24710(arg0, arg1) || method24723(arg0, arg1);
	}

	@OriginalMember(owner = "client!bh", name = "aq", descriptor = "(II)Z")
	static boolean method24732(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!bh", name = "ao", descriptor = "(II)Z")
	static boolean method24733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!bh", name = "cs", descriptor = "(II)Z")
	static boolean method24734(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x40000) != 0 | method24711(arg0, arg1) || method24722(arg0, arg1);
	}

	@OriginalMember(owner = "client!bh", name = "ac", descriptor = "(II)Z")
	static boolean method24735(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x60000) != 0 | method24790(arg0, arg1) || method24722(arg0, arg1) || method24724(arg0, arg1);
	}

	@OriginalMember(owner = "client!bh", name = "ag", descriptor = "(II)Z")
	static boolean method24736(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0 | method24702(arg0, arg1) || method24722(arg0, arg1);
	}

	@OriginalMember(owner = "client!bh", name = "ab", descriptor = "(II)Z")
	static boolean method24737(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!bh", name = "cb", descriptor = "(II)Z")
	static boolean method24738(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x60000) != 0 | method24790(arg0, arg1) || method24722(arg0, arg1) || method24724(arg0, arg1);
	}

	@OriginalMember(owner = "client!bh", name = "ah", descriptor = "(II)Z")
	static boolean method24739(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!bh", name = "af", descriptor = "(II)Z")
	static boolean method24740(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!bh", name = "am", descriptor = "(II)Z")
	static boolean method24741(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!bh", name = "cd", descriptor = "(II)Z")
	static boolean method24742(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 | method24704(arg0, arg1) || method24720(arg0, arg1);
	}

	@OriginalMember(owner = "client!bh", name = "at", descriptor = "(II)Z")
	static boolean method24743(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!bh", name = "ad", descriptor = "(II)Z")
	static boolean method24744(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x220) == 544 | (arg0 & 0x18) != 0;
	}

	@OriginalMember(owner = "client!bh", name = "cm", descriptor = "(II)Z")
	static boolean method24745(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!bh", name = "an", descriptor = "(II)Z")
	static boolean method24746(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x100100) != 0;
	}

	@OriginalMember(owner = "client!bh", name = "aa", descriptor = "(II)Z")
	static boolean method24747(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x100100) != 0;
	}

	@OriginalMember(owner = "client!bh", name = "ae", descriptor = "(II)Z")
	static boolean method24748(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!bh", name = "ap", descriptor = "(II)Z")
	static boolean method24749(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!bh", name = "ar", descriptor = "(II)Z")
	static boolean method24750(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!bh", name = "au", descriptor = "(II)Z")
	static boolean method24751(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!bh", name = "az", descriptor = "(II)Z")
	static boolean method24752(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!bh", name = "as", descriptor = "(II)Z")
	static boolean method24753(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!bh", name = "ck", descriptor = "(II)Z")
	static boolean method24754(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method24710(arg0, arg1) || method24723(arg0, arg1);
	}

	@OriginalMember(owner = "client!bh", name = "bg", descriptor = "(II)Z")
	static boolean method24755(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0xC580) != 0;
	}

	@OriginalMember(owner = "client!bh", name = "bl", descriptor = "(II)Z")
	static boolean method24756(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0xC580) != 0;
	}

	@OriginalMember(owner = "client!bh", name = "br", descriptor = "(II)Z")
	static boolean method24757(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!bh", name = "bh", descriptor = "(II)Z")
	static boolean method24758(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!bh", name = "ba", descriptor = "(II)Z")
	static boolean method24759(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!bh", name = "bt", descriptor = "(II)Z")
	static boolean method24760(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!bh", name = "k", descriptor = "(II)Z")
	static boolean method24761(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!bh", name = "bj", descriptor = "(II)Z")
	static boolean method24762(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!bh", name = "by", descriptor = "(II)Z")
	static boolean method24763(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!bh", name = "bz", descriptor = "(II)Z")
	static boolean method24764(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!bh", name = "aw", descriptor = "(II)Z")
	static boolean method24765(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0xC580) != 0;
	}

	@OriginalMember(owner = "client!bh", name = "e", descriptor = "(II)Z")
	static boolean method24766(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!bh", name = "bn", descriptor = "(II)Z")
	static boolean method24767(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!bh", name = "bv", descriptor = "(II)Z")
	static boolean method24768(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!bh", name = "bp", descriptor = "(II)Z")
	static boolean method24769(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!bh", name = "bb", descriptor = "(II)Z")
	static boolean method24770(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!bh", name = "aj", descriptor = "(II)Z")
	static boolean method24771(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!bh", name = "bc", descriptor = "(II)Z")
	static boolean method24772(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return ((arg0 & 0x2000) != 0 | method24725(arg0, arg1) | method24714(arg0, arg1)) & method24709(arg0, arg1);
	}

	@OriginalMember(owner = "client!bh", name = "bf", descriptor = "(II)Z")
	static boolean method24773(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return ((arg0 & 0x2000) != 0 | method24725(arg0, arg1) | method24714(arg0, arg1)) & method24709(arg0, arg1);
	}

	@OriginalMember(owner = "client!bh", name = "bw", descriptor = "(II)Z")
	static boolean method24774(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (method24717(arg0, arg1)) {
			return (arg0 & 0xB000) != 0 | method24708(arg0, arg1) | method24711(arg0, arg1) ? true : (arg1 & 0x37) == 0 & (method24725(arg0, arg1) | method24714(arg0, arg1));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bh", name = "ak", descriptor = "(II)Z")
	static boolean method24775(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!bh", name = "bi", descriptor = "(II)Z")
	static boolean method24776(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method24710(arg0, arg1) & method24797(arg0, arg1);
	}

	@OriginalMember(owner = "client!bh", name = "bm", descriptor = "(II)Z")
	static boolean method24777(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method24790(arg0, arg1) & method24719(arg0, arg1);
	}

	@OriginalMember(owner = "client!bh", name = "bx", descriptor = "(II)Z")
	static boolean method24778(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method24710(arg0, arg1) & method24797(arg0, arg1);
	}

	@OriginalMember(owner = "client!bh", name = "bq", descriptor = "(II)Z")
	static boolean method24779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 | method24703(arg0, arg1) || method24720(arg0, arg1);
	}

	@OriginalMember(owner = "client!bh", name = "bd", descriptor = "(II)Z")
	static boolean method24780(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 | method24704(arg0, arg1) || method24720(arg0, arg1);
	}

	@OriginalMember(owner = "client!bh", name = "cv", descriptor = "(II)Z")
	static boolean method24781(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 | method24704(arg0, arg1) || method24720(arg0, arg1);
	}

	@OriginalMember(owner = "client!bh", name = "ct", descriptor = "(II)Z")
	static boolean method24782(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 | method24766(arg0, arg1) || method24720(arg0, arg1);
	}

	@OriginalMember(owner = "client!bh", name = "cn", descriptor = "(II)Z")
	static boolean method24783(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if ((arg0 & 0x10000) != 0 | method24725(arg0, arg1) || method24721(arg0, arg1)) {
			return true;
		} else {
			return (arg1 & 0x37) == 0 && method24722(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!bh", name = "be", descriptor = "(II)Z")
	static boolean method24784(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!bh", name = "ch", descriptor = "(II)Z")
	static boolean method24785(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if ((arg0 & 0x10000) != 0 | method24725(arg0, arg1) || method24721(arg0, arg1)) {
			return true;
		} else {
			return (arg1 & 0x37) == 0 && method24722(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!bh", name = "cj", descriptor = "(II)Z")
	static boolean method24786(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method24710(arg0, arg1) || method24723(arg0, arg1);
	}

	@OriginalMember(owner = "client!bh", name = "cp", descriptor = "(II)Z")
	static boolean method24787(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!bh", name = "ce", descriptor = "(II)Z")
	static boolean method24788(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method24708(arg0, arg1) || method24722(arg0, arg1);
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)Z")
	static boolean method24789(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0xC580) != 0;
	}

	@OriginalMember(owner = "client!bh", name = "o", descriptor = "(II)Z")
	static boolean method24790(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!bh", name = "cg", descriptor = "(II)Z")
	static boolean method24791(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!bh", name = "av", descriptor = "(II)Z")
	static boolean method24792(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!bh", name = "cr", descriptor = "(II)Z")
	static boolean method24793(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!bh", name = "ci", descriptor = "(II)Z")
	static boolean method24794(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!bh", name = "ca", descriptor = "(II)Z")
	static boolean method24795(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!bh", name = "cy", descriptor = "(II)Z")
	static boolean method24796(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if ((arg0 & 0x10000) != 0 | method24725(arg0, arg1) || method24721(arg0, arg1)) {
			return true;
		} else {
			return (arg1 & 0x37) == 0 && method24722(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!bh", name = "r", descriptor = "(II)Z")
	static boolean method24797(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(II)Z")
	static boolean method24798(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if ((arg0 & 0x10000) != 0 | method24725(arg0, arg1) || method24721(arg0, arg1)) {
			return true;
		} else {
			return (arg1 & 0x37) == 0 && method24722(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!bh", name = "cw", descriptor = "(II)Z")
	static boolean method24799(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x60000) != 0 | method24790(arg0, arg1) || method24722(arg0, arg1) || method24724(arg0, arg1);
	}

	@OriginalMember(owner = "client!bh", name = "cu", descriptor = "(II)Z")
	static boolean method24800(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method24708(arg0, arg1) || method24722(arg0, arg1);
	}

	@OriginalMember(owner = "client!bh", name = "cx", descriptor = "(II)Z")
	static boolean method24801(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0 | method24702(arg0, arg1) || method24722(arg0, arg1);
	}

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "()V")
	Class184() throws Throwable {
		throw new Error();
	}
}
