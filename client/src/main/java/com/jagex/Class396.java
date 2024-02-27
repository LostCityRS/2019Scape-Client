package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class Class396 {

	@OriginalMember(owner = "client!lf", name = "p", descriptor = "(II)Z")
	static boolean method28535(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "(II)Z")
	static boolean method28536(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!lf", name = "n", descriptor = "(II)Z")
	static boolean method28537(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!lf", name = "m", descriptor = "(II)Z")
	static boolean method28538(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!lf", name = "r", descriptor = "(II)Z")
	static boolean method28539(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!lf", name = "f", descriptor = "(II)Z")
	static boolean method28540(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x220) == 544 | (arg0 & 0x18) != 0;
	}

	@OriginalMember(owner = "client!lf", name = "cd", descriptor = "(II)Z")
	static boolean method28541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!lf", name = "bx", descriptor = "(II)Z")
	static boolean method28542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0xC580) != 0;
	}

	@OriginalMember(owner = "client!lf", name = "af", descriptor = "(II)Z")
	static boolean method28543(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!lf", name = "z", descriptor = "(II)Z")
	static boolean method28544(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!lf", name = "cy", descriptor = "(II)Z")
	static boolean method28545(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "(II)Z")
	static boolean method28546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0xC580) != 0;
	}

	@OriginalMember(owner = "client!lf", name = "bq", descriptor = "(II)Z")
	static boolean method28547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!lf", name = "cr", descriptor = "(II)Z")
	static boolean method28548(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method28572(arg0, arg1) || method28555(arg0, arg1);
	}

	@OriginalMember(owner = "client!lf", name = "v", descriptor = "(II)Z")
	static boolean method28549(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!lf", name = "o", descriptor = "(II)Z")
	static boolean method28550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!lf", name = "s", descriptor = "(II)Z")
	static boolean method28551(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!lf", name = "y", descriptor = "(II)Z")
	static boolean method28552(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!lf", name = "q", descriptor = "(II)Z")
	static boolean method28553(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (method28536(arg0, arg1) | method28537(arg0, arg1) | method28538(arg0, arg1)) & method28539(arg0, arg1);
	}

	@OriginalMember(owner = "client!lf", name = "bn", descriptor = "(II)Z")
	static boolean method28554(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(II)Z")
	static boolean method28555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (method28550(arg0, arg1)) {
			return (arg0 & 0x9000) != 0 | method28572(arg0, arg1) | method28559(arg0, arg1) ? true : (arg1 & 0x37) == 0 & ((arg0 & 0x2000) != 0 | method28540(arg0, arg1) | method28556(arg0, arg1));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "(II)Z")
	static boolean method28556(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)Z")
	static boolean method28557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method28544(arg0, arg1) & method28552(arg0, arg1);
	}

	@OriginalMember(owner = "client!lf", name = "cm", descriptor = "(II)Z")
	static boolean method28558(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x40000) != 0 | method28559(arg0, arg1) || method28555(arg0, arg1);
	}

	@OriginalMember(owner = "client!lf", name = "l", descriptor = "(II)Z")
	static boolean method28559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x100) != 0;
	}

	@OriginalMember(owner = "client!lf", name = "j", descriptor = "(II)Z")
	static boolean method28560(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 || method28538(arg0, arg1) || method28553(arg0, arg1);
	}

	@OriginalMember(owner = "client!lf", name = "t", descriptor = "(II)Z")
	static boolean method28561(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) boolean local11 = (arg1 & 0x37) == 0 ? method28555(arg0, arg1) : method28628(arg0, arg1);
		return (arg0 & 0x10000) != 0 | method28540(arg0, arg1) | local11;
	}

	@OriginalMember(owner = "client!lf", name = "ae", descriptor = "(II)Z")
	static boolean method28562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method28572(arg0, arg1) || method28555(arg0, arg1);
	}

	@OriginalMember(owner = "client!lf", name = "ag", descriptor = "(II)Z")
	static boolean method28563(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x40000) != 0 | method28559(arg0, arg1) || method28555(arg0, arg1);
	}

	@OriginalMember(owner = "client!lf", name = "ah", descriptor = "(II)Z")
	static boolean method28564(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method28615(arg0, arg1) || method28592(arg0, arg1);
	}

	@OriginalMember(owner = "client!lf", name = "bj", descriptor = "(II)Z")
	static boolean method28565(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (method28550(arg0, arg1)) {
			return (arg0 & 0x9000) != 0 | method28572(arg0, arg1) | method28559(arg0, arg1) ? true : (arg1 & 0x37) == 0 & ((arg0 & 0x2000) != 0 | method28540(arg0, arg1) | method28556(arg0, arg1));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lf", name = "ac", descriptor = "(II)Z")
	static boolean method28566(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!lf", name = "ai", descriptor = "(II)Z")
	static boolean method28567(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!lf", name = "ct", descriptor = "(II)Z")
	static boolean method28568(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) boolean local11 = (arg1 & 0x37) == 0 ? method28555(arg0, arg1) : method28628(arg0, arg1);
		return (arg0 & 0x10000) != 0 | method28540(arg0, arg1) | local11;
	}

	@OriginalMember(owner = "client!lf", name = "as", descriptor = "(II)Z")
	static boolean method28569(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0 | method28535(arg0, arg1) || method28555(arg0, arg1);
	}

	@OriginalMember(owner = "client!lf", name = "at", descriptor = "(II)Z")
	static boolean method28570(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!lf", name = "ad", descriptor = "(II)Z")
	static boolean method28571(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!lf", name = "w", descriptor = "(II)Z")
	static boolean method28572(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!lf", name = "au", descriptor = "(II)Z")
	static boolean method28573(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!lf", name = "ar", descriptor = "(II)Z")
	static boolean method28574(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!lf", name = "cb", descriptor = "(II)Z")
	static boolean method28575(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method28615(arg0, arg1) || method28592(arg0, arg1);
	}

	@OriginalMember(owner = "client!lf", name = "aq", descriptor = "(II)Z")
	static boolean method28576(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!lf", name = "ax", descriptor = "(II)Z")
	static boolean method28577(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!lf", name = "cp", descriptor = "(II)Z")
	static boolean method28578(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 || method28537(arg0, arg1) || method28553(arg0, arg1);
	}

	@OriginalMember(owner = "client!lf", name = "ao", descriptor = "(II)Z")
	static boolean method28579(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x220) == 544 | (arg0 & 0x18) != 0;
	}

	@OriginalMember(owner = "client!lf", name = "aj", descriptor = "(II)Z")
	static boolean method28580(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x220) == 544 | (arg0 & 0x18) != 0;
	}

	@OriginalMember(owner = "client!lf", name = "ay", descriptor = "(II)Z")
	static boolean method28581(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x220) == 544 | (arg0 & 0x18) != 0;
	}

	@OriginalMember(owner = "client!lf", name = "ab", descriptor = "(II)Z")
	static boolean method28582(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!lf", name = "az", descriptor = "(II)Z")
	static boolean method28583(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x100) != 0;
	}

	@OriginalMember(owner = "client!lf", name = "aa", descriptor = "(II)Z")
	static boolean method28584(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!lf", name = "cc", descriptor = "(II)Z")
	static boolean method28585(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!lf", name = "cn", descriptor = "(II)Z")
	static boolean method28586(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 || method28536(arg0, arg1) || method28553(arg0, arg1);
	}

	@OriginalMember(owner = "client!lf", name = "aw", descriptor = "(II)Z")
	static boolean method28587(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x60000) != 0 | method28544(arg0, arg1) || method28557(arg0, arg1);
	}

	@OriginalMember(owner = "client!lf", name = "bf", descriptor = "(II)Z")
	static boolean method28588(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!lf", name = "bl", descriptor = "(II)Z")
	static boolean method28589(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!lf", name = "bk", descriptor = "(II)Z")
	static boolean method28590(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!lf", name = "bh", descriptor = "(II)Z")
	static boolean method28591(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0xC580) != 0;
	}

	@OriginalMember(owner = "client!lf", name = "h", descriptor = "(II)Z")
	static boolean method28592(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method28615(arg0, arg1) & method28551(arg0, arg1);
	}

	@OriginalMember(owner = "client!lf", name = "bd", descriptor = "(II)Z")
	static boolean method28593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!lf", name = "bc", descriptor = "(II)Z")
	static boolean method28594(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!lf", name = "bi", descriptor = "(II)Z")
	static boolean method28595(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!lf", name = "do", descriptor = "(II)Z")
	static boolean method28596(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0 | method28535(arg0, arg1) || method28555(arg0, arg1);
	}

	@OriginalMember(owner = "client!lf", name = "al", descriptor = "(II)Z")
	static boolean method28597(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!lf", name = "cu", descriptor = "(II)Z")
	static boolean method28598(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method28615(arg0, arg1) & method28551(arg0, arg1);
	}

	@OriginalMember(owner = "client!lf", name = "bm", descriptor = "(II)Z")
	static boolean method28599(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!lf", name = "bb", descriptor = "(II)Z")
	static boolean method28600(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!lf", name = "ap", descriptor = "(II)Z")
	static boolean method28601(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!lf", name = "be", descriptor = "(II)Z")
	static boolean method28602(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!lf", name = "bu", descriptor = "(II)Z")
	static boolean method28603(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!lf", name = "bw", descriptor = "(II)Z")
	static boolean method28604(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!lf", name = "bo", descriptor = "(II)Z")
	static boolean method28605(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!lf", name = "bz", descriptor = "(II)Z")
	static boolean method28606(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!lf", name = "bv", descriptor = "(II)Z")
	static boolean method28607(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!lf", name = "av", descriptor = "(II)Z")
	static boolean method28608(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!lf", name = "bg", descriptor = "(II)Z")
	static boolean method28609(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!lf", name = "ba", descriptor = "(II)Z")
	static boolean method28610(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method28549(arg0, arg1) & ((arg0 & 0x2000) != 0 | method28540(arg0, arg1) | method28556(arg0, arg1));
	}

	@OriginalMember(owner = "client!lf", name = "bp", descriptor = "(II)Z")
	static boolean method28611(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method28549(arg0, arg1) & ((arg0 & 0x2000) != 0 | method28540(arg0, arg1) | method28556(arg0, arg1));
	}

	@OriginalMember(owner = "client!lf", name = "am", descriptor = "(II)Z")
	static boolean method28612(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!lf", name = "bs", descriptor = "(II)Z")
	static boolean method28613(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (method28550(arg0, arg1)) {
			return (arg0 & 0x9000) != 0 | method28572(arg0, arg1) | method28559(arg0, arg1) ? true : (arg1 & 0x37) == 0 & ((arg0 & 0x2000) != 0 | method28540(arg0, arg1) | method28556(arg0, arg1));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lf", name = "cl", descriptor = "(II)Z")
	static boolean method28614(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method28615(arg0, arg1) & method28551(arg0, arg1);
	}

	@OriginalMember(owner = "client!lf", name = "u", descriptor = "(II)Z")
	static boolean method28615(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!lf", name = "ce", descriptor = "(II)Z")
	static boolean method28616(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method28615(arg0, arg1) & method28551(arg0, arg1);
	}

	@OriginalMember(owner = "client!lf", name = "cj", descriptor = "(II)Z")
	static boolean method28617(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!lf", name = "ak", descriptor = "(II)Z")
	static boolean method28618(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!lf", name = "cv", descriptor = "(II)Z")
	static boolean method28619(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 || method28537(arg0, arg1) || method28553(arg0, arg1);
	}

	@OriginalMember(owner = "client!lf", name = "ci", descriptor = "(II)Z")
	static boolean method28620(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 || method28536(arg0, arg1) || method28553(arg0, arg1);
	}

	@OriginalMember(owner = "client!lf", name = "ca", descriptor = "(II)Z")
	static boolean method28621(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 || method28538(arg0, arg1) || method28553(arg0, arg1);
	}

	@OriginalMember(owner = "client!lf", name = "cx", descriptor = "(II)Z")
	static boolean method28622(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 || method28538(arg0, arg1) || method28553(arg0, arg1);
	}

	@OriginalMember(owner = "client!lf", name = "cw", descriptor = "(II)Z")
	static boolean method28623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) boolean local11 = (arg1 & 0x37) == 0 ? method28555(arg0, arg1) : method28628(arg0, arg1);
		return (arg0 & 0x10000) != 0 | method28540(arg0, arg1) | local11;
	}

	@OriginalMember(owner = "client!lf", name = "br", descriptor = "(II)Z")
	static boolean method28624(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!lf", name = "cf", descriptor = "(II)Z")
	static boolean method28625(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) boolean local11 = (arg1 & 0x37) == 0 ? method28555(arg0, arg1) : method28628(arg0, arg1);
		return (arg0 & 0x10000) != 0 | method28540(arg0, arg1) | local11;
	}

	@OriginalMember(owner = "client!lf", name = "co", descriptor = "(II)Z")
	static boolean method28626(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method28572(arg0, arg1) || method28555(arg0, arg1);
	}

	@OriginalMember(owner = "client!lf", name = "dd", descriptor = "(II)Z")
	static boolean method28627(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x60000) != 0 | method28544(arg0, arg1) || method28557(arg0, arg1);
	}

	@OriginalMember(owner = "client!lf", name = "x", descriptor = "(II)Z")
	static boolean method28628(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method28549(arg0, arg1) & ((arg0 & 0x2000) != 0 | method28540(arg0, arg1) | method28556(arg0, arg1));
	}

	@OriginalMember(owner = "client!lf", name = "cq", descriptor = "(II)Z")
	static boolean method28629(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x40000) != 0 | method28559(arg0, arg1) || method28555(arg0, arg1);
	}

	@OriginalMember(owner = "client!lf", name = "g", descriptor = "(II)Z")
	static boolean method28630(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 || method28536(arg0, arg1) || method28553(arg0, arg1);
	}

	@OriginalMember(owner = "client!lf", name = "k", descriptor = "(II)Z")
	static boolean method28631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!lf", name = "cs", descriptor = "(II)Z")
	static boolean method28632(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method28615(arg0, arg1) || method28592(arg0, arg1);
	}

	@OriginalMember(owner = "client!lf", name = "i", descriptor = "(II)Z")
	static boolean method28633(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 || method28537(arg0, arg1) || method28553(arg0, arg1);
	}

	@OriginalMember(owner = "client!lf", name = "cg", descriptor = "(II)Z")
	static boolean method28634(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method28615(arg0, arg1) & method28551(arg0, arg1);
	}

	@OriginalMember(owner = "client!lf", name = "cz", descriptor = "(II)Z")
	static boolean method28635(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!lf", name = "ck", descriptor = "(II)Z")
	static boolean method28636(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!lf", name = "by", descriptor = "(II)Z")
	static boolean method28637(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!lf", name = "bt", descriptor = "(II)Z")
	static boolean method28638(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!lf", name = "an", descriptor = "(II)Z")
	static boolean method28639(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!lf", name = "dr", descriptor = "(II)Z")
	static boolean method28640(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x60000) != 0 | method28544(arg0, arg1) || method28557(arg0, arg1);
	}

	@OriginalMember(owner = "client!lf", name = "da", descriptor = "(II)Z")
	static boolean method28641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0 | method28535(arg0, arg1) || method28555(arg0, arg1);
	}

	@OriginalMember(owner = "client!lf", name = "dt", descriptor = "(II)Z")
	static boolean method28642(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0 | method28535(arg0, arg1) || method28555(arg0, arg1);
	}

	@OriginalMember(owner = "client!lf", name = "ch", descriptor = "(II)Z")
	static boolean method28643(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method28615(arg0, arg1) || method28592(arg0, arg1);
	}

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "()V")
	Class396() throws Throwable {
		throw new Error();
	}
}
