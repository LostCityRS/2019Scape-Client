package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public final class Class611 {

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
	public int anInt5786;

	@OriginalMember(owner = "client!ve", name = "n", descriptor = "I")
	public int anInt5784;

	@OriginalMember(owner = "client!ve", name = "m", descriptor = "I")
	public int anInt5785;

	@OriginalMember(owner = "client!ve", name = "hc", descriptor = "(Lclient!yf;B)V")
	static void method32227(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class453.method29146(local11, local14, arg0, Class310.aClass310_2, (byte) 73);
	}

	@OriginalMember(owner = "client!ve", name = "kp", descriptor = "(Lclient!hf;I)V")
	static void method32228(@OriginalArg(0) Class312 arg0, @OriginalArg(1) int arg1) {
		if (Class312.anInt3995 * -270313193 != arg0.anInt4013 * -1428659995) {
			return;
		}
		if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aString82 == null) {
			arg0.anInt4078 = 0;
			arg0.anInt4079 = 0;
			return;
		}
		arg0.anInt4047 = -1268657782;
		arg0.anInt4048 = ((int) (Math.sin((double) client.anInt3485 / 40.0D) * 256.0D) & 0x7FF) * 1060356621;
		arg0.anInt4042 = -2003331097;
		arg0.anInt4078 = client.anInt3513 * 1786756713;
		arg0.anInt4079 = Class704.method36912(Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aString82, 304329139) * 1171936085;
		@Pc(54) Class19_Sub3 local54 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aClass19_Sub3_3;
		if (local54 == null) {
			arg0.aClass19_6 = null;
			return;
		}
		if (arg0.aClass19_6 == null) {
			arg0.aClass19_6 = new Class19_Sub2();
		}
		arg0.anInt4064 = local54.method23566((byte) 28) * 600145537;
		arg0.aClass19_6.method23588(local54, 751447761);
	}

	@OriginalMember(owner = "client!ve", name = "zn", descriptor = "(Lclient!yf;S)V")
	static void method32229(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt6049 -= 957530791) * 587908375];
		if (Class108_Sub2.aString24 != null && Class108_Sub2.aString24.equalsIgnoreCase(local13)) {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 1;
		} else {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
		}
	}

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(III)V")
	public Class611(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5786 = arg0 * -715656041;
		this.anInt5784 = arg1 * 2122256161;
		this.anInt5785 = arg2 * -67830523;
	}

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(I)V")
	public Class611(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			this.anInt5786 = 715656041;
		} else {
			this.anInt5786 = (arg0 >> 28 & 0x3) * -715656041;
			this.anInt5784 = (arg0 >> 14 & 0x3FFF) * 2122256161;
			this.anInt5785 = (arg0 & 0x3FFF) * -67830523;
		}
	}

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "()V")
	public Class611() {
		this.anInt5786 = 715656041;
	}

	@OriginalMember(owner = "client!ve", name = "r", descriptor = "(Lclient!ve;)Z")
	boolean method32204(@OriginalArg(0) Class611 arg0) {
		return this.method32224(arg0.anInt5786 * -78984409, arg0.anInt5784 * 270611681, arg0.anInt5785 * -1994307635, -868291596);
	}

	@OriginalMember(owner = "client!ve", name = "rq", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method32205(@OriginalArg(0) Object arg0) {
		if (arg0 == this) {
			return true;
		} else if (arg0 instanceof Class611) {
			return this.method32210((Class611) arg0, -990229751);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ve", name = "rj", descriptor = "()Ljava/lang/String;")
	public String method32206() {
		return this.method32211(",", -2090607187);
	}

	@OriginalMember(owner = "client!ve", name = "n", descriptor = "(S)I")
	public int method32207(@OriginalArg(0) short arg0) {
		return this.anInt5786 * -78984409 << 28 | this.anInt5784 * 270611681 << 14 | this.anInt5785 * -1994307635;
	}

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "(Lclient!akt;B)V")
	public void method32208(@OriginalArg(0) CoordFine arg0, @OriginalArg(1) byte arg1) {
		this.anInt5786 = arg0.anInt1609 * 1839387951;
		this.anInt5784 = (arg0.anInt1610 * -427776677 >> 9) * 2122256161;
		this.anInt5785 = (arg0.anInt1612 * 671628745 >> 9) * -67830523;
	}

	@OriginalMember(owner = "client!ve", name = "rs", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method32209(@OriginalArg(0) Object arg0) {
		if (arg0 == this) {
			return true;
		} else if (arg0 instanceof Class611) {
			return this.method32210((Class611) arg0, -1012593485);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ve", name = "hashCode", descriptor = "()I")
	@Override
	public int hashCode() {
		return this.method32207((short) 448);
	}

	@OriginalMember(owner = "client!ve", name = "m", descriptor = "(Lclient!ve;I)Z")
	boolean method32210(@OriginalArg(0) Class611 arg0, @OriginalArg(1) int arg1) {
		return this.method32224(arg0.anInt5786 * -78984409, arg0.anInt5784 * 270611681, arg0.anInt5785 * -1994307635, 1608601108);
	}

	@OriginalMember(owner = "client!ve", name = "f", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	String method32211(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return this.anInt5786 * -78984409 + arg0 + (this.anInt5784 * 270611681 >> 6) + arg0 + (this.anInt5785 * -1994307635 >> 6) + arg0 + (this.anInt5784 * 270611681 & 0x3F) + arg0 + (this.anInt5785 * -1994307635 & 0x3F);
	}

	@OriginalMember(owner = "client!ve", name = "l", descriptor = "(Lclient!akt;)V")
	public void method32212(@OriginalArg(0) CoordFine arg0) {
		this.anInt5786 = arg0.anInt1609 * 1839387951;
		this.anInt5784 = (arg0.anInt1610 * -427776677 >> 9) * 2122256161;
		this.anInt5785 = (arg0.anInt1612 * 671628745 >> 9) * -67830523;
	}

	@OriginalMember(owner = "client!ve", name = "rp", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method32213(@OriginalArg(0) Object arg0) {
		if (arg0 == this) {
			return true;
		} else if (arg0 instanceof Class611) {
			return this.method32210((Class611) arg0, -1523529240);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ve", name = "ro", descriptor = "(Ljava/lang/Object;)Z")
	public boolean method32214(@OriginalArg(0) Object arg0) {
		if (arg0 == this) {
			return true;
		} else if (arg0 instanceof Class611) {
			return this.method32210((Class611) arg0, -1376301893);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ve", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		return this.method32211(",", -2089023050);
	}

	@OriginalMember(owner = "client!ve", name = "rk", descriptor = "()I")
	public int method32215() {
		return this.method32207((short) 448);
	}

	@OriginalMember(owner = "client!ve", name = "rm", descriptor = "()I")
	public int method32216() {
		return this.method32207((short) 448);
	}

	@OriginalMember(owner = "client!ve", name = "ri", descriptor = "()I")
	public int method32217() {
		return this.method32207((short) 448);
	}

	@OriginalMember(owner = "client!ve", name = "w", descriptor = "(Lclient!akt;)V")
	public void method32218(@OriginalArg(0) CoordFine arg0) {
		this.anInt5786 = arg0.anInt1609 * 1839387951;
		this.anInt5784 = (arg0.anInt1610 * -427776677 >> 9) * 2122256161;
		this.anInt5785 = (arg0.anInt1612 * 671628745 >> 9) * -67830523;
	}

	@OriginalMember(owner = "client!ve", name = "equals", descriptor = "(Ljava/lang/Object;)Z")
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		if (arg0 == this) {
			return true;
		} else if (arg0 instanceof Class611) {
			return this.method32210((Class611) arg0, -1476282459);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ve", name = "u", descriptor = "(Lclient!akt;)V")
	public void method32219(@OriginalArg(0) CoordFine arg0) {
		this.anInt5786 = arg0.anInt1609 * 1839387951;
		this.anInt5784 = (arg0.anInt1610 * -427776677 >> 9) * 2122256161;
		this.anInt5785 = (arg0.anInt1612 * 671628745 >> 9) * -67830523;
	}

	@OriginalMember(owner = "client!ve", name = "z", descriptor = "()I")
	public int method32220() {
		return this.anInt5786 * -78984409 << 28 | this.anInt5784 * 270611681 << 14 | this.anInt5785 * -1994307635;
	}

	@OriginalMember(owner = "client!ve", name = "p", descriptor = "()I")
	public int method32221() {
		return this.anInt5786 * -78984409 << 28 | this.anInt5784 * 270611681 << 14 | this.anInt5785 * -1994307635;
	}

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "()I")
	public int method32222() {
		return this.anInt5786 * -78984409 << 28 | this.anInt5784 * 270611681 << 14 | this.anInt5785 * -1994307635;
	}

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "(Lclient!ve;)Z")
	boolean method32223(@OriginalArg(0) Class611 arg0) {
		return this.method32224(arg0.anInt5786 * -78984409, arg0.anInt5784 * 270611681, arg0.anInt5785 * -1994307635, -1535209391);
	}

	@OriginalMember(owner = "client!ve", name = "k", descriptor = "(IIII)Z")
	boolean method32224(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 != this.anInt5786 * -78984409) {
			return false;
		} else if (this.anInt5784 * 270611681 == arg1) {
			return arg2 == this.anInt5785 * -1994307635;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ve", name = "v", descriptor = "(III)Z")
	boolean method32225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 != this.anInt5786 * -78984409) {
			return false;
		} else if (this.anInt5784 * 270611681 == arg1) {
			return arg2 == this.anInt5785 * -1994307635;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ve", name = "o", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
	String method32226(@OriginalArg(0) String arg0) {
		return this.anInt5786 * -78984409 + arg0 + (this.anInt5784 * 270611681 >> 6) + arg0 + (this.anInt5785 * -1994307635 >> 6) + arg0 + (this.anInt5784 * 270611681 & 0x3F) + arg0 + (this.anInt5785 * -1994307635 & 0x3F);
	}
}
