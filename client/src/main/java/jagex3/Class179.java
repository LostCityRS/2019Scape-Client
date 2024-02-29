package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public final class Class179 {

	@OriginalMember(owner = "client!bb", name = "o", descriptor = "(II)Z")
	static boolean method24402(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!bb", name = "e", descriptor = "(II)Z")
	static boolean method24403(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!bb", name = "n", descriptor = "(II)Z")
	static boolean method24404(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!bb", name = "m", descriptor = "(II)Z")
	static boolean method24405(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!bb", name = "k", descriptor = "(II)Z")
	static boolean method24406(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!bb", name = "f", descriptor = "(II)Z")
	static boolean method24407(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x220) == 544 | (arg0 & 0x18) != 0;
	}

	@OriginalMember(owner = "client!bb", name = "w", descriptor = "(II)Z")
	static boolean method24408(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!bb", name = "cr", descriptor = "(II)Z")
	static boolean method24409(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 | method24404(arg0, arg1) || method24419(arg0, arg1);
	}

	@OriginalMember(owner = "client!bb", name = "u", descriptor = "(II)Z")
	static boolean method24410(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!bb", name = "z", descriptor = "(II)Z")
	static boolean method24411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!bb", name = "cf", descriptor = "(II)Z")
	static boolean method24412(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 | method24404(arg0, arg1) || method24419(arg0, arg1);
	}

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "(II)Z")
	static boolean method24413(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0xC580) != 0;
	}

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "(II)Z")
	static boolean method24414(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!bb", name = "bj", descriptor = "(II)Z")
	static boolean method24415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (method24403(arg0, arg1) | method24404(arg0, arg1) | method24405(arg0, arg1)) & method24457(arg0, arg1);
	}

	@OriginalMember(owner = "client!bb", name = "p", descriptor = "(II)Z")
	static boolean method24416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!bb", name = "bw", descriptor = "(II)Z")
	static boolean method24417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!bb", name = "y", descriptor = "(II)Z")
	static boolean method24418(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!bb", name = "q", descriptor = "(II)Z")
	static boolean method24419(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (method24403(arg0, arg1) | method24404(arg0, arg1) | method24405(arg0, arg1)) & method24457(arg0, arg1);
	}

	@OriginalMember(owner = "client!bb", name = "i", descriptor = "(II)Z")
	static boolean method24420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 | method24404(arg0, arg1) || method24419(arg0, arg1);
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(II)Z")
	static boolean method24421(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (method24402(arg0, arg1)) {
			return (arg0 & 0xB000) != 0 | method24408(arg0, arg1) | method24479(arg0, arg1) ? true : (arg1 & 0x37) == 0 & (method24407(arg0, arg1) | method24414(arg0, arg1));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bb", name = "bz", descriptor = "(II)Z")
	static boolean method24422(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)Z")
	static boolean method24423(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method24411(arg0, arg1) & method24418(arg0, arg1);
	}

	@OriginalMember(owner = "client!bb", name = "dn", descriptor = "(II)Z")
	static boolean method24424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x60000) != 0 | method24411(arg0, arg1) || method24421(arg0, arg1) || method24423(arg0, arg1);
	}

	@OriginalMember(owner = "client!bb", name = "v", descriptor = "(II)Z")
	static boolean method24425(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!bb", name = "j", descriptor = "(II)Z")
	static boolean method24426(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 | method24405(arg0, arg1) || method24419(arg0, arg1);
	}

	@OriginalMember(owner = "client!bb", name = "t", descriptor = "(II)Z")
	static boolean method24427(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if ((arg0 & 0x10000) != 0 | method24407(arg0, arg1) || method24450(arg0, arg1)) {
			return true;
		} else {
			return (arg1 & 0x37) == 0 && method24421(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!bb", name = "ae", descriptor = "(II)Z")
	static boolean method24428(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method24408(arg0, arg1) || method24421(arg0, arg1);
	}

	@OriginalMember(owner = "client!bb", name = "ag", descriptor = "(II)Z")
	static boolean method24429(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x40000) != 0 | method24479(arg0, arg1) || method24421(arg0, arg1);
	}

	@OriginalMember(owner = "client!bb", name = "ah", descriptor = "(II)Z")
	static boolean method24430(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method24410(arg0, arg1) || method24505(arg0, arg1);
	}

	@OriginalMember(owner = "client!bb", name = "al", descriptor = "(II)Z")
	static boolean method24431(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!bb", name = "ac", descriptor = "(II)Z")
	static boolean method24432(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!bb", name = "ai", descriptor = "(II)Z")
	static boolean method24433(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!bb", name = "co", descriptor = "(II)Z")
	static boolean method24434(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 | method24404(arg0, arg1) || method24419(arg0, arg1);
	}

	@OriginalMember(owner = "client!bb", name = "as", descriptor = "(II)Z")
	static boolean method24435(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0 | method24416(arg0, arg1) || method24421(arg0, arg1);
	}

	@OriginalMember(owner = "client!bb", name = "df", descriptor = "(II)Z")
	static boolean method24436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x60000) != 0 | method24411(arg0, arg1) || method24421(arg0, arg1) || method24423(arg0, arg1);
	}

	@OriginalMember(owner = "client!bb", name = "ad", descriptor = "(II)Z")
	static boolean method24437(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!bb", name = "ar", descriptor = "(II)Z")
	static boolean method24438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!bb", name = "au", descriptor = "(II)Z")
	static boolean method24439(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!bb", name = "ci", descriptor = "(II)Z")
	static boolean method24440(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (method24402(arg0, arg1)) {
			return (arg0 & 0xB000) != 0 | method24408(arg0, arg1) | method24479(arg0, arg1) ? true : (arg1 & 0x37) == 0 & (method24407(arg0, arg1) | method24414(arg0, arg1));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bb", name = "dt", descriptor = "(II)Z")
	static boolean method24441(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!bb", name = "aj", descriptor = "(II)Z")
	static boolean method24442(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!bb", name = "ct", descriptor = "(II)Z")
	static boolean method24443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 | method24403(arg0, arg1) || method24419(arg0, arg1);
	}

	@OriginalMember(owner = "client!bb", name = "av", descriptor = "(II)Z")
	static boolean method24444(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!bb", name = "at", descriptor = "(II)Z")
	static boolean method24445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!bb", name = "dr", descriptor = "(II)Z")
	static boolean method24446(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!bb", name = "ay", descriptor = "(II)Z")
	static boolean method24447(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x100100) != 0;
	}

	@OriginalMember(owner = "client!bb", name = "cv", descriptor = "(II)Z")
	static boolean method24448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method24410(arg0, arg1) & method24470(arg0, arg1);
	}

	@OriginalMember(owner = "client!bb", name = "az", descriptor = "(II)Z")
	static boolean method24449(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x100100) != 0;
	}

	@OriginalMember(owner = "client!bb", name = "x", descriptor = "(II)Z")
	static boolean method24450(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return ((arg0 & 0x2000) != 0 | method24407(arg0, arg1) | method24414(arg0, arg1)) & method24425(arg0, arg1);
	}

	@OriginalMember(owner = "client!bb", name = "af", descriptor = "(II)Z")
	static boolean method24451(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!bb", name = "ak", descriptor = "(II)Z")
	static boolean method24452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!bb", name = "an", descriptor = "(II)Z")
	static boolean method24453(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!bb", name = "bf", descriptor = "(II)Z")
	static boolean method24454(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!bb", name = "bl", descriptor = "(II)Z")
	static boolean method24455(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!bb", name = "dz", descriptor = "(II)Z")
	static boolean method24456(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!bb", name = "r", descriptor = "(II)Z")
	static boolean method24457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!bb", name = "bx", descriptor = "(II)Z")
	static boolean method24458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!bb", name = "bd", descriptor = "(II)Z")
	static boolean method24459(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!bb", name = "bc", descriptor = "(II)Z")
	static boolean method24460(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!bb", name = "bi", descriptor = "(II)Z")
	static boolean method24461(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!bb", name = "bn", descriptor = "(II)Z")
	static boolean method24462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0xC580) != 0;
	}

	@OriginalMember(owner = "client!bb", name = "bt", descriptor = "(II)Z")
	static boolean method24463(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!bb", name = "bq", descriptor = "(II)Z")
	static boolean method24464(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!bb", name = "do", descriptor = "(II)Z")
	static boolean method24465(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!bb", name = "bb", descriptor = "(II)Z")
	static boolean method24466(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!bb", name = "be", descriptor = "(II)Z")
	static boolean method24467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!bb", name = "by", descriptor = "(II)Z")
	static boolean method24468(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!bb", name = "bu", descriptor = "(II)Z")
	static boolean method24469(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!bb", name = "s", descriptor = "(II)Z")
	static boolean method24470(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!bb", name = "cn", descriptor = "(II)Z")
	static boolean method24471(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (method24402(arg0, arg1)) {
			return (arg0 & 0xB000) != 0 | method24408(arg0, arg1) | method24479(arg0, arg1) ? true : (arg1 & 0x37) == 0 & (method24407(arg0, arg1) | method24414(arg0, arg1));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bb", name = "cz", descriptor = "(II)Z")
	static boolean method24472(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method24410(arg0, arg1) || method24505(arg0, arg1);
	}

	@OriginalMember(owner = "client!bb", name = "bo", descriptor = "(II)Z")
	static boolean method24473(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!bb", name = "cd", descriptor = "(II)Z")
	static boolean method24474(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method24410(arg0, arg1) || method24505(arg0, arg1);
	}

	@OriginalMember(owner = "client!bb", name = "bg", descriptor = "(II)Z")
	static boolean method24475(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!bb", name = "ao", descriptor = "(II)Z")
	static boolean method24476(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!bb", name = "bp", descriptor = "(II)Z")
	static boolean method24477(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (method24403(arg0, arg1) | method24404(arg0, arg1) | method24405(arg0, arg1)) & method24457(arg0, arg1);
	}

	@OriginalMember(owner = "client!bb", name = "bh", descriptor = "(II)Z")
	static boolean method24478(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!bb", name = "l", descriptor = "(II)Z")
	static boolean method24479(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x100100) != 0;
	}

	@OriginalMember(owner = "client!bb", name = "cl", descriptor = "(II)Z")
	static boolean method24480(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return ((arg0 & 0x2000) != 0 | method24407(arg0, arg1) | method24414(arg0, arg1)) & method24425(arg0, arg1);
	}

	@OriginalMember(owner = "client!bb", name = "cg", descriptor = "(II)Z")
	static boolean method24481(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return ((arg0 & 0x2000) != 0 | method24407(arg0, arg1) | method24414(arg0, arg1)) & method24425(arg0, arg1);
	}

	@OriginalMember(owner = "client!bb", name = "ce", descriptor = "(II)Z")
	static boolean method24482(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return ((arg0 & 0x2000) != 0 | method24407(arg0, arg1) | method24414(arg0, arg1)) & method24425(arg0, arg1);
	}

	@OriginalMember(owner = "client!bb", name = "cu", descriptor = "(II)Z")
	static boolean method24483(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (method24402(arg0, arg1)) {
			return (arg0 & 0xB000) != 0 | method24408(arg0, arg1) | method24479(arg0, arg1) ? true : (arg1 & 0x37) == 0 & (method24407(arg0, arg1) | method24414(arg0, arg1));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bb", name = "br", descriptor = "(II)Z")
	static boolean method24484(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!bb", name = "g", descriptor = "(II)Z")
	static boolean method24485(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 | method24403(arg0, arg1) || method24419(arg0, arg1);
	}

	@OriginalMember(owner = "client!bb", name = "ap", descriptor = "(II)Z")
	static boolean method24486(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!bb", name = "cp", descriptor = "(II)Z")
	static boolean method24487(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method24410(arg0, arg1) & method24470(arg0, arg1);
	}

	@OriginalMember(owner = "client!bb", name = "ca", descriptor = "(II)Z")
	static boolean method24488(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method24411(arg0, arg1) & method24418(arg0, arg1);
	}

	@OriginalMember(owner = "client!bb", name = "cx", descriptor = "(II)Z")
	static boolean method24489(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 | method24403(arg0, arg1) || method24419(arg0, arg1);
	}

	@OriginalMember(owner = "client!bb", name = "bv", descriptor = "(II)Z")
	static boolean method24490(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!bb", name = "dm", descriptor = "(II)Z")
	static boolean method24491(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!bb", name = "bm", descriptor = "(II)Z")
	static boolean method24492(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!bb", name = "ab", descriptor = "(II)Z")
	static boolean method24493(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x100100) != 0;
	}

	@OriginalMember(owner = "client!bb", name = "aw", descriptor = "(II)Z")
	static boolean method24494(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x60000) != 0 | method24411(arg0, arg1) || method24421(arg0, arg1) || method24423(arg0, arg1);
	}

	@OriginalMember(owner = "client!bb", name = "cm", descriptor = "(II)Z")
	static boolean method24495(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 | method24405(arg0, arg1) || method24419(arg0, arg1);
	}

	@OriginalMember(owner = "client!bb", name = "cq", descriptor = "(II)Z")
	static boolean method24496(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 | method24405(arg0, arg1) || method24419(arg0, arg1);
	}

	@OriginalMember(owner = "client!bb", name = "ch", descriptor = "(II)Z")
	static boolean method24497(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if ((arg0 & 0x10000) != 0 | method24407(arg0, arg1) || method24450(arg0, arg1)) {
			return true;
		} else {
			return (arg1 & 0x37) == 0 && method24421(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!bb", name = "cb", descriptor = "(II)Z")
	static boolean method24498(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method24408(arg0, arg1) || method24421(arg0, arg1);
	}

	@OriginalMember(owner = "client!bb", name = "cs", descriptor = "(II)Z")
	static boolean method24499(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x40000) != 0 | method24479(arg0, arg1) || method24421(arg0, arg1);
	}

	@OriginalMember(owner = "client!bb", name = "aa", descriptor = "(II)Z")
	static boolean method24500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x100100) != 0;
	}

	@OriginalMember(owner = "client!bb", name = "cc", descriptor = "(II)Z")
	static boolean method24501(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x40000) != 0 | method24479(arg0, arg1) || method24421(arg0, arg1);
	}

	@OriginalMember(owner = "client!bb", name = "bk", descriptor = "(II)Z")
	static boolean method24502(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x10) != 0;
	}

	@OriginalMember(owner = "client!bb", name = "ck", descriptor = "(II)Z")
	static boolean method24503(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method24410(arg0, arg1) || method24505(arg0, arg1);
	}

	@OriginalMember(owner = "client!bb", name = "cj", descriptor = "(II)Z")
	static boolean method24504(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method24410(arg0, arg1) || method24505(arg0, arg1);
	}

	@OriginalMember(owner = "client!bb", name = "h", descriptor = "(II)Z")
	static boolean method24505(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method24410(arg0, arg1) & method24470(arg0, arg1);
	}

	@OriginalMember(owner = "client!bb", name = "dd", descriptor = "(II)Z")
	static boolean method24506(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!bb", name = "aq", descriptor = "(II)Z")
	static boolean method24507(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x220) == 544 | (arg0 & 0x18) != 0;
	}

	@OriginalMember(owner = "client!bb", name = "da", descriptor = "(II)Z")
	static boolean method24508(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!bb", name = "cw", descriptor = "(II)Z")
	static boolean method24509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 | method24403(arg0, arg1) || method24419(arg0, arg1);
	}

	@OriginalMember(owner = "client!bb", name = "cy", descriptor = "(II)Z")
	static boolean method24510(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x40000) != 0 | method24479(arg0, arg1) || method24421(arg0, arg1);
	}

	@OriginalMember(owner = "client!bb", name = "ax", descriptor = "(II)Z")
	static boolean method24511(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x220) == 544 | (arg0 & 0x18) != 0;
	}

	@OriginalMember(owner = "client!bb", name = "dv", descriptor = "(II)Z")
	static boolean method24512(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!bb", name = "am", descriptor = "(II)Z")
	static boolean method24513(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!bb", name = "dq", descriptor = "(II)Z")
	static boolean method24514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!bb", name = "dc", descriptor = "(II)Z")
	static boolean method24515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!bb", name = "di", descriptor = "(II)Z")
	static boolean method24516(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!bb", name = "dk", descriptor = "(II)Z")
	static boolean method24517(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x60000) != 0 | method24411(arg0, arg1) || method24421(arg0, arg1) || method24423(arg0, arg1);
	}

	@OriginalMember(owner = "client!bb", name = "ba", descriptor = "(II)Z")
	static boolean method24518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!bb", name = "bs", descriptor = "(II)Z")
	static boolean method24519(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return ((arg0 & 0x2000) != 0 | method24407(arg0, arg1) | method24414(arg0, arg1)) & method24425(arg0, arg1);
	}

	@OriginalMember(owner = "client!bb", name = "dw", descriptor = "(II)Z")
	static boolean method24520(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0 | method24416(arg0, arg1) || method24421(arg0, arg1);
	}

	@OriginalMember(owner = "client!bb", name = "ds", descriptor = "(II)Z")
	static boolean method24521(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0 | method24416(arg0, arg1) || method24421(arg0, arg1);
	}

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "()V")
	Class179() throws Throwable {
		throw new Error();
	}
}
