package jagex3;

import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uk")
public final class Class596 implements Interface13 {

	@OriginalMember(owner = "client!uk", name = "n", descriptor = "I")
	static final int anInt5649 = 70;

	@OriginalMember(owner = "client!uk", name = "sr", descriptor = "Lclient!afu;")
	public static Class113_Sub1 aClass113_Sub1_1;

	@OriginalMember(owner = "client!uk", name = "m", descriptor = "I")
	public int anInt5656 = -211070433;

	@OriginalMember(owner = "client!uk", name = "k", descriptor = "I")
	public int anInt5651 = 175136337;

	@OriginalMember(owner = "client!uk", name = "f", descriptor = "I")
	public int anInt5652 = -1574465001;

	@OriginalMember(owner = "client!uk", name = "w", descriptor = "I")
	public int anInt5653 = 1096236339;

	@OriginalMember(owner = "client!uk", name = "l", descriptor = "I")
	public int anInt5659 = 1414489714;

	@OriginalMember(owner = "client!uk", name = "u", descriptor = "I")
	public int anInt5650 = -1792977653;

	@OriginalMember(owner = "client!uk", name = "z", descriptor = "I")
	public int anInt5648 = 585876987;

	@OriginalMember(owner = "client!uk", name = "p", descriptor = "I")
	public int anInt5657 = 1912693335;

	@OriginalMember(owner = "client!uk", name = "d", descriptor = "I")
	public int anInt5658 = -903374255;

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "I")
	public int anInt5655 = -1845932589;

	@OriginalMember(owner = "client!uk", name = "r", descriptor = "I")
	public int anInt5654 = -1355432475;

	@OriginalMember(owner = "client!uk", name = "e", descriptor = "Lclient!uy;")
	final Class156 aClass156_1;

	@OriginalMember(owner = "client!uk", name = "p", descriptor = "(II)I")
	static int method31942(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 16711935 ? -1 : Class682.method33457(arg0, -1432208910);
	}

	@OriginalMember(owner = "client!uk", name = "pc", descriptor = "(Lclient!yf;B)V")
	static void method31943(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class28.method603(local11, local14, arg0, (byte) -115);
	}

	@OriginalMember(owner = "client!uk", name = "asl", descriptor = "(Lclient!yf;I)V")
	static void method31944(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub36_1, arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091], (byte) 116);
		Class106_Sub1.method5148(138249748);
	}

	@OriginalMember(owner = "client!uk", name = "e", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)V")
	public static void method31945(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		Class564.anApplet3 = arg0;
		Class564.aString237 = arg1;
	}

	@OriginalMember(owner = "client!uk", name = "e", descriptor = "(B)[Lclient!db;")
	static Class222[] method31946(@OriginalArg(0) byte arg0) {
		return new Class222[] { Class222.aClass222_2, Class222.aClass222_5, Class222.aClass222_3, Class222.aClass222_4, Class222.aClass222_1 };
	}

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(ILclient!uy;)V")
	Class596(@OriginalArg(0) int arg0, @OriginalArg(1) Class156 arg1) {
		this.aClass156_1 = arg1;
	}

	@OriginalMember(owner = "client!uk", name = "e", descriptor = "(Lclient!alw;B)V")
	@Override
	public void method36835(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) byte arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method31931(arg0, local3, 1431562713);
		}
	}

	@OriginalMember(owner = "client!uk", name = "q", descriptor = "(Lclient!dh;)V")
	void method31930(@OriginalArg(0) Class104 arg0) {
		this.method31933(arg0, this.anInt5650 * -1393086115, 680192989);
		this.method31933(arg0, this.anInt5648 * 816546509, -1004585619);
		this.method31933(arg0, this.anInt5657 * 857036441, -434924340);
		this.method31933(arg0, this.anInt5658 * 168300879, 790777752);
		this.method31933(arg0, this.anInt5655 * -128291419, -1707027654);
		this.method31933(arg0, this.anInt5654 * -1920415725, -602504146);
	}

	@OriginalMember(owner = "client!uk", name = "u", descriptor = "(Lclient!alw;II)V")
	void method31931(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 1) {
			arg0.method22427(-1434290800);
		} else if (arg1 == 2) {
			this.anInt5656 = arg0.method22425((short) 16384) * 807636705;
		} else if (arg1 == 3) {
			this.anInt5651 = arg0.method22425((short) 16384) * -706719569;
		} else if (arg1 == 4) {
			this.anInt5652 = 0;
		} else if (arg1 == 5) {
			this.anInt5659 = arg0.method22427(-1434290800) * 1615480563;
		} else if (arg1 == 6) {
			arg0.method22425((short) 16384);
		} else if (arg1 == 7) {
			this.anInt5650 = arg0.method22448(-59609869) * 1792977653;
		} else if (arg1 == 8) {
			this.anInt5648 = arg0.method22448(-830125417) * -585876987;
		} else if (arg1 == 9) {
			this.anInt5657 = arg0.method22448(-571479904) * -1912693335;
		} else if (arg1 == 10) {
			this.anInt5658 = arg0.method22448(-1487729724) * 903374255;
		} else if (arg1 == 11) {
			this.anInt5652 = arg0.method22427(-1434290800) * 1574465001;
		} else if (arg1 == 12) {
			this.anInt5655 = arg0.method22448(-613389699) * 1845932589;
		} else if (arg1 == 13) {
			this.anInt5654 = arg0.method22448(-156704551) * 1355432475;
		}
	}

	@OriginalMember(owner = "client!uk", name = "z", descriptor = "(Lclient!dh;IB)Lclient!cm;")
	public Class100 method31932(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (arg1 < 0) {
			return null;
		}
		@Pc(11) Class100 local11 = (Class100) this.aClass156_1.aClass240_23.method25932((long) arg1);
		if (local11 == null) {
			this.method31934(arg0, -1581055043);
			local11 = (Class100) this.aClass156_1.aClass240_23.method25932((long) arg1);
		}
		return local11;
	}

	@OriginalMember(owner = "client!uk", name = "p", descriptor = "(Lclient!dh;II)V")
	void method31933(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class497 local3 = this.aClass156_1.aClass497_47;
		if (arg1 >= 0 && this.aClass156_1.aClass240_23.method25932((long) arg1) == null && local3.method30235(arg1, -512225963)) {
			@Pc(21) Class105 local21 = Class203.method24662(local3, arg1);
			this.aClass156_1.aClass240_23.method25923(arg0.method20511(local21, true), (long) arg1);
		}
	}

	@OriginalMember(owner = "client!uk", name = "d", descriptor = "(Lclient!dh;I)V")
	void method31934(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		this.method31933(arg0, this.anInt5650 * -1393086115, -850572670);
		this.method31933(arg0, this.anInt5648 * 816546509, -446791328);
		this.method31933(arg0, this.anInt5657 * 857036441, 1564069708);
		this.method31933(arg0, this.anInt5658 * 168300879, -814310435);
		this.method31933(arg0, this.anInt5655 * -128291419, 779292493);
		this.method31933(arg0, this.anInt5654 * -1920415725, 2133236713);
	}

	@OriginalMember(owner = "client!uk", name = "x", descriptor = "(Lclient!dh;)V")
	void method31935(@OriginalArg(0) Class104 arg0) {
		this.method31933(arg0, this.anInt5650 * -1393086115, -1222561437);
		this.method31933(arg0, this.anInt5648 * 816546509, 151446484);
		this.method31933(arg0, this.anInt5657 * 857036441, -1259352210);
		this.method31933(arg0, this.anInt5658 * 168300879, 386086763);
		this.method31933(arg0, this.anInt5655 * -128291419, -264456894);
		this.method31933(arg0, this.anInt5654 * -1920415725, 702264914);
	}

	@OriginalMember(owner = "client!uk", name = "m", descriptor = "(Lclient!alw;)V")
	@Override
	public void method36836(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method31931(arg0, local3, 687325200);
		}
	}

	@OriginalMember(owner = "client!uk", name = "k", descriptor = "(Lclient!alw;)V")
	@Override
	public void method36837(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method31931(arg0, local3, -470678572);
		}
	}

	@OriginalMember(owner = "client!uk", name = "f", descriptor = "(Lclient!alw;)V")
	@Override
	public void method36838(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method31931(arg0, local3, 948632456);
		}
	}

	@OriginalMember(owner = "client!uk", name = "w", descriptor = "(Lclient!alw;)V")
	@Override
	public void method36839(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method31931(arg0, local3, 1364934864);
		}
	}

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "(Lclient!alw;I)V")
	void method31936(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			arg0.method22427(-1434290800);
		} else if (arg1 == 2) {
			this.anInt5656 = arg0.method22425((short) 16384) * 807636705;
		} else if (arg1 == 3) {
			this.anInt5651 = arg0.method22425((short) 16384) * -706719569;
		} else if (arg1 == 4) {
			this.anInt5652 = 0;
		} else if (arg1 == 5) {
			this.anInt5659 = arg0.method22427(-1434290800) * 1615480563;
		} else if (arg1 == 6) {
			arg0.method22425((short) 16384);
		} else if (arg1 == 7) {
			this.anInt5650 = arg0.method22448(-1911236077) * 1792977653;
		} else if (arg1 == 8) {
			this.anInt5648 = arg0.method22448(-502598892) * -585876987;
		} else if (arg1 == 9) {
			this.anInt5657 = arg0.method22448(-674577347) * -1912693335;
		} else if (arg1 == 10) {
			this.anInt5658 = arg0.method22448(-1817691263) * 903374255;
		} else if (arg1 == 11) {
			this.anInt5652 = arg0.method22427(-1434290800) * 1574465001;
		} else if (arg1 == 12) {
			this.anInt5655 = arg0.method22448(-1006948826) * 1845932589;
		} else if (arg1 == 13) {
			this.anInt5654 = arg0.method22448(-651560597) * 1355432475;
		}
	}

	@OriginalMember(owner = "client!uk", name = "n", descriptor = "(I)V")
	@Override
	public void method36834(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!uk", name = "r", descriptor = "(Lclient!alw;I)V")
	void method31937(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			arg0.method22427(-1434290800);
		} else if (arg1 == 2) {
			this.anInt5656 = arg0.method22425((short) 16384) * 807636705;
		} else if (arg1 == 3) {
			this.anInt5651 = arg0.method22425((short) 16384) * -706719569;
		} else if (arg1 == 4) {
			this.anInt5652 = 0;
		} else if (arg1 == 5) {
			this.anInt5659 = arg0.method22427(-1434290800) * 1615480563;
		} else if (arg1 == 6) {
			arg0.method22425((short) 16384);
		} else if (arg1 == 7) {
			this.anInt5650 = arg0.method22448(-49522556) * 1792977653;
		} else if (arg1 == 8) {
			this.anInt5648 = arg0.method22448(-1125724718) * -585876987;
		} else if (arg1 == 9) {
			this.anInt5657 = arg0.method22448(-658763671) * -1912693335;
		} else if (arg1 == 10) {
			this.anInt5658 = arg0.method22448(-15695181) * 903374255;
		} else if (arg1 == 11) {
			this.anInt5652 = arg0.method22427(-1434290800) * 1574465001;
		} else if (arg1 == 12) {
			this.anInt5655 = arg0.method22448(-388110835) * 1845932589;
		} else if (arg1 == 13) {
			this.anInt5654 = arg0.method22448(-2012933072) * 1355432475;
		}
	}

	@OriginalMember(owner = "client!uk", name = "v", descriptor = "(Lclient!dh;I)Lclient!cm;")
	public Class100 method31938(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		if (arg1 < 0) {
			return null;
		}
		@Pc(11) Class100 local11 = (Class100) this.aClass156_1.aClass240_23.method25932((long) arg1);
		if (local11 == null) {
			this.method31934(arg0, -1358042784);
			local11 = (Class100) this.aClass156_1.aClass240_23.method25932((long) arg1);
		}
		return local11;
	}

	@OriginalMember(owner = "client!uk", name = "o", descriptor = "(Lclient!dh;I)Lclient!cm;")
	public Class100 method31939(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		if (arg1 < 0) {
			return null;
		}
		@Pc(11) Class100 local11 = (Class100) this.aClass156_1.aClass240_23.method25932((long) arg1);
		if (local11 == null) {
			this.method31934(arg0, -2017839628);
			local11 = (Class100) this.aClass156_1.aClass240_23.method25932((long) arg1);
		}
		return local11;
	}

	@OriginalMember(owner = "client!uk", name = "s", descriptor = "(Lclient!dh;I)Lclient!cm;")
	public Class100 method31940(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		if (arg1 < 0) {
			return null;
		}
		@Pc(11) Class100 local11 = (Class100) this.aClass156_1.aClass240_23.method25932((long) arg1);
		if (local11 == null) {
			this.method31934(arg0, -1154896092);
			local11 = (Class100) this.aClass156_1.aClass240_23.method25932((long) arg1);
		}
		return local11;
	}

	@OriginalMember(owner = "client!uk", name = "y", descriptor = "(Lclient!dh;I)V")
	void method31941(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class497 local3 = this.aClass156_1.aClass497_47;
		if (arg1 >= 0 && this.aClass156_1.aClass240_23.method25932((long) arg1) == null && local3.method30235(arg1, -512225963)) {
			@Pc(21) Class105 local21 = Class203.method24662(local3, arg1);
			this.aClass156_1.aClass240_23.method25923(arg0.method20511(local21, true), (long) arg1);
		}
	}

	@OriginalMember(owner = "client!uk", name = "l", descriptor = "()V")
	@Override
	public void method36840() {
	}
}
