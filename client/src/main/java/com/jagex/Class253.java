package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ex")
public final class Class253 {

	@OriginalMember(owner = "client!ex", name = "pg", descriptor = "I")
	static int anInt3851;

	@OriginalMember(owner = "client!ex", name = "to", descriptor = "Lclient!akr;")
	public static Class93_Sub28 aClass93_Sub28_3;

	@OriginalMember(owner = "client!ex", name = "e", descriptor = "Lclient!aky;")
	Class93_Sub1 aClass93_Sub1_69 = new Class93_Sub1();

	@OriginalMember(owner = "client!ex", name = "f", descriptor = "Lclient!aap;")
	Class18 aClass18_14 = new Class18();

	@OriginalMember(owner = "client!ex", name = "n", descriptor = "I")
	int anInt3849;

	@OriginalMember(owner = "client!ex", name = "m", descriptor = "I")
	int anInt3850;

	@OriginalMember(owner = "client!ex", name = "k", descriptor = "Lclient!aan;")
	Class16 aClass16_25;

	@OriginalMember(owner = "client!ex", name = "<init>", descriptor = "(I)V", line = 14)
	public Class253(@OriginalArg(0) int arg0) {
		this.anInt3849 = arg0 * 2102327603;
		this.anInt3850 = arg0 * 1690780507;
		@Pc(23) int local23;
		for (local23 = 1; local23 + local23 < arg0; local23 += local23) {
		}
		this.aClass16_25 = new Class16(local23);
	}

	@OriginalMember(owner = "client!ex", name = "e", descriptor = "(J)Lclient!aky;", line = 23)
	public Class93_Sub1 method25983(@OriginalArg(0) long arg0) {
		@Pc(5) Class93_Sub1 local5 = (Class93_Sub1) this.aClass16_25.method214(arg0);
		if (local5 != null) {
			this.aClass18_14.method250(local5, 2020829652);
		}
		return local5;
	}

	@OriginalMember(owner = "client!ex", name = "f", descriptor = "(J)Lclient!aky;", line = 23)
	public Class93_Sub1 method25984(@OriginalArg(0) long arg0) {
		@Pc(5) Class93_Sub1 local5 = (Class93_Sub1) this.aClass16_25.method214(arg0);
		if (local5 != null) {
			this.aClass18_14.method250(local5, 1654446193);
		}
		return local5;
	}

	@OriginalMember(owner = "client!ex", name = "k", descriptor = "(J)Lclient!aky;", line = 23)
	public Class93_Sub1 method25985(@OriginalArg(0) long arg0) {
		@Pc(5) Class93_Sub1 local5 = (Class93_Sub1) this.aClass16_25.method214(arg0);
		if (local5 != null) {
			this.aClass18_14.method250(local5, 347112075);
		}
		return local5;
	}

	@OriginalMember(owner = "client!ex", name = "n", descriptor = "(Lclient!aky;J)V", line = 32)
	public void method25986(@OriginalArg(0) Class93_Sub1 arg0, @OriginalArg(1) long arg1) {
		if (this.anInt3850 * -1756416813 == 0) {
			@Pc(9) Class93_Sub1 local9 = this.aClass18_14.method254((byte) 8);
			local9.method23969(1121160218);
			local9.method23976((short) -4587);
			if (local9 == this.aClass93_Sub1_69) {
				local9 = this.aClass18_14.method254((byte) 8);
				local9.method23969(-206270457);
				local9.method23976((short) 2287);
			}
		} else {
			this.anInt3850 -= 1690780507;
		}
		this.aClass16_25.method220(arg0, arg1);
		this.aClass18_14.method250(arg0, 895431022);
	}

	@OriginalMember(owner = "client!ex", name = "l", descriptor = "(Lclient!aky;J)V", line = 32)
	public void method25987(@OriginalArg(0) Class93_Sub1 arg0, @OriginalArg(1) long arg1) {
		if (this.anInt3850 * -1756416813 == 0) {
			@Pc(9) Class93_Sub1 local9 = this.aClass18_14.method254((byte) 8);
			local9.method23969(-4368563);
			local9.method23976((short) -986);
			if (local9 == this.aClass93_Sub1_69) {
				local9 = this.aClass18_14.method254((byte) 8);
				local9.method23969(-1945180892);
				local9.method23976((short) -20444);
			}
		} else {
			this.anInt3850 -= 1690780507;
		}
		this.aClass16_25.method220(arg0, arg1);
		this.aClass18_14.method250(arg0, -305816688);
	}

	@OriginalMember(owner = "client!ex", name = "w", descriptor = "(Lclient!aky;J)V", line = 32)
	public void method25988(@OriginalArg(0) Class93_Sub1 arg0, @OriginalArg(1) long arg1) {
		if (this.anInt3850 * -1756416813 == 0) {
			@Pc(9) Class93_Sub1 local9 = this.aClass18_14.method254((byte) 8);
			local9.method23969(214299403);
			local9.method23976((short) -1310);
			if (local9 == this.aClass93_Sub1_69) {
				local9 = this.aClass18_14.method254((byte) 8);
				local9.method23969(832814753);
				local9.method23976((short) -18429);
			}
		} else {
			this.anInt3850 -= 1690780507;
		}
		this.aClass16_25.method220(arg0, arg1);
		this.aClass18_14.method250(arg0, 703077293);
	}

	@OriginalMember(owner = "client!ex", name = "u", descriptor = "()V", line = 48)
	public void method25989() {
		this.aClass18_14.method244(305073107);
		this.aClass16_25.method225((byte) 97);
		this.aClass93_Sub1_69 = new Class93_Sub1();
		this.anInt3850 = this.anInt3849 * 1244470585;
	}

	@OriginalMember(owner = "client!ex", name = "m", descriptor = "(I)V", line = 48)
	public void method25990(@OriginalArg(0) int arg0) {
		this.aClass18_14.method244(669027226);
		this.aClass16_25.method225((byte) 108);
		this.aClass93_Sub1_69 = new Class93_Sub1();
		this.anInt3850 = this.anInt3849 * 1244470585;
	}

	@OriginalMember(owner = "client!ex", name = "m", descriptor = "(B)Z", line = 53)
	static boolean method25991(@OriginalArg(0) byte arg0) {
		return Class1.aBoolean1;
	}

	@OriginalMember(owner = "client!ex", name = "aax", descriptor = "(Lclient!yf;I)V", line = 9670)
	static final void method25992(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5888 -= 1915061582;
		@Pc(14) String local14 = (String) arg0.anObjectArray45[arg0.anInt5888 * 587908375];
		@Pc(25) String local25 = (String) arg0.anObjectArray45[arg0.anInt5888 * 587908375 + 1];
		Class35.method688(local14, local25, -109226398);
	}

	@OriginalMember(owner = "client!ex", name = "abs", descriptor = "(Lclient!yf;I)V", line = 10451)
	static final void method25993(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		if (local13 <= 700 && local23 <= 700) {
			@Pc(59) double local59 = (Math.random() * (double) (local23 + local13) - (double) local13 + 800.0D) / 100.0D;
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = (int) (Math.pow(2.0D, local59) + 0.5D);
		} else {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 256;
		}
	}

	@OriginalMember(owner = "client!ex", name = "afn", descriptor = "(Lclient!yf;I)V", line = 10604)
	static final void method25994(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt5888 -= 957530791) * 587908375];
		arg0.anInt5891 -= -1915563430;
		@Pc(27) int local27 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(37) int local37 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = local13.substring(local27, local37);
	}

	@OriginalMember(owner = "client!ex", name = "agi", descriptor = "(Lclient!yf;I)V", line = 10646)
	static final void method25995(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Character.toUpperCase((char) local12);
	}
}
