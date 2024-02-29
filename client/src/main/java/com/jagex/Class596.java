package com.jagex;

import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uk")
public class Class596 implements Interface13 {

	@OriginalMember(owner = "client!uk", name = "n", descriptor = "I")
	static final int anInt5488 = 70;

	@OriginalMember(owner = "client!uk", name = "sr", descriptor = "Lclient!afu;")
	public static Class113_Sub1 aClass113_Sub1_1;

	@OriginalMember(owner = "client!uk", name = "m", descriptor = "I")
	public int anInt5495 = -211070433;

	@OriginalMember(owner = "client!uk", name = "k", descriptor = "I")
	public int anInt5490 = 175136337;

	@OriginalMember(owner = "client!uk", name = "f", descriptor = "I")
	public int anInt5491 = -1574465001;

	@OriginalMember(owner = "client!uk", name = "w", descriptor = "I")
	public int anInt5492 = 1096236339;

	@OriginalMember(owner = "client!uk", name = "l", descriptor = "I")
	public int anInt5498 = 1414489714;

	@OriginalMember(owner = "client!uk", name = "u", descriptor = "I")
	public int anInt5489 = -1792977653;

	@OriginalMember(owner = "client!uk", name = "z", descriptor = "I")
	public int anInt5487 = 585876987;

	@OriginalMember(owner = "client!uk", name = "p", descriptor = "I")
	public int anInt5496 = 1912693335;

	@OriginalMember(owner = "client!uk", name = "d", descriptor = "I")
	public int anInt5497 = -903374255;

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "I")
	public int anInt5494 = -1845932589;

	@OriginalMember(owner = "client!uk", name = "r", descriptor = "I")
	public int anInt5493 = -1355432475;

	@OriginalMember(owner = "client!uk", name = "e", descriptor = "Lclient!uy;")
	final Class156 aClass156_1;

	@OriginalMember(owner = "client!uk", name = "e", descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)V", line = 23)
	public static void method31749(@OriginalArg(0) Applet arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		Class564.anApplet3 = arg0;
		Class564.aString228 = arg1;
	}

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(ILclient!uy;)V", line = 25)
	Class596(@OriginalArg(0) int arg0, @OriginalArg(1) Class156 arg1) {
		this.aClass156_1 = arg1;
	}

	@OriginalMember(owner = "client!uk", name = "e", descriptor = "(Lclient!alw;B)V", line = 31)
	@Override
	public void method36654(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) byte arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.method22465((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method31750(arg0, local3, 1431562713);
		}
	}

	@OriginalMember(owner = "client!uk", name = "m", descriptor = "(Lclient!alw;)V", line = 31)
	@Override
	public void method36655(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22465((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method31750(arg0, local3, 687325200);
		}
	}

	@OriginalMember(owner = "client!uk", name = "k", descriptor = "(Lclient!alw;)V", line = 31)
	@Override
	public void method36656(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22465((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method31750(arg0, local3, -470678572);
		}
	}

	@OriginalMember(owner = "client!uk", name = "f", descriptor = "(Lclient!alw;)V", line = 31)
	@Override
	public void method36657(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22465((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method31750(arg0, local3, 948632456);
		}
	}

	@OriginalMember(owner = "client!uk", name = "w", descriptor = "(Lclient!alw;)V", line = 31)
	@Override
	public void method36658(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22465((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method31750(arg0, local3, 1364934864);
		}
	}

	@OriginalMember(owner = "client!uk", name = "u", descriptor = "(Lclient!alw;II)V", line = 38)
	void method31750(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 1) {
			arg0.method22472(-1434290800);
		} else if (arg1 == 2) {
			this.anInt5495 = arg0.method22465((short) 16384) * 807636705;
		} else if (arg1 == 3) {
			this.anInt5490 = arg0.method22465((short) 16384) * -706719569;
		} else if (arg1 == 4) {
			this.anInt5491 = 0;
		} else if (arg1 == 5) {
			this.anInt5498 = arg0.method22472(-1434290800) * 1615480563;
		} else if (arg1 == 6) {
			arg0.method22465((short) 16384);
		} else if (arg1 == 7) {
			this.anInt5489 = arg0.method22542(-59609869) * 1792977653;
		} else if (arg1 == 8) {
			this.anInt5487 = arg0.method22542(-830125417) * -585876987;
		} else if (arg1 == 9) {
			this.anInt5496 = arg0.method22542(-571479904) * -1912693335;
		} else if (arg1 == 10) {
			this.anInt5497 = arg0.method22542(-1487729724) * 903374255;
		} else if (arg1 == 11) {
			this.anInt5491 = arg0.method22472(-1434290800) * 1574465001;
		} else if (arg1 == 12) {
			this.anInt5494 = arg0.method22542(-613389699) * 1845932589;
		} else if (arg1 == 13) {
			this.anInt5493 = arg0.method22542(-156704551) * 1355432475;
		}
	}

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "(Lclient!alw;I)V", line = 38)
	void method31751(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			arg0.method22472(-1434290800);
		} else if (arg1 == 2) {
			this.anInt5495 = arg0.method22465((short) 16384) * 807636705;
		} else if (arg1 == 3) {
			this.anInt5490 = arg0.method22465((short) 16384) * -706719569;
		} else if (arg1 == 4) {
			this.anInt5491 = 0;
		} else if (arg1 == 5) {
			this.anInt5498 = arg0.method22472(-1434290800) * 1615480563;
		} else if (arg1 == 6) {
			arg0.method22465((short) 16384);
		} else if (arg1 == 7) {
			this.anInt5489 = arg0.method22542(-1911236077) * 1792977653;
		} else if (arg1 == 8) {
			this.anInt5487 = arg0.method22542(-502598892) * -585876987;
		} else if (arg1 == 9) {
			this.anInt5496 = arg0.method22542(-674577347) * -1912693335;
		} else if (arg1 == 10) {
			this.anInt5497 = arg0.method22542(-1817691263) * 903374255;
		} else if (arg1 == 11) {
			this.anInt5491 = arg0.method22472(-1434290800) * 1574465001;
		} else if (arg1 == 12) {
			this.anInt5494 = arg0.method22542(-1006948826) * 1845932589;
		} else if (arg1 == 13) {
			this.anInt5493 = arg0.method22542(-651560597) * 1355432475;
		}
	}

	@OriginalMember(owner = "client!uk", name = "r", descriptor = "(Lclient!alw;I)V", line = 38)
	void method31752(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			arg0.method22472(-1434290800);
		} else if (arg1 == 2) {
			this.anInt5495 = arg0.method22465((short) 16384) * 807636705;
		} else if (arg1 == 3) {
			this.anInt5490 = arg0.method22465((short) 16384) * -706719569;
		} else if (arg1 == 4) {
			this.anInt5491 = 0;
		} else if (arg1 == 5) {
			this.anInt5498 = arg0.method22472(-1434290800) * 1615480563;
		} else if (arg1 == 6) {
			arg0.method22465((short) 16384);
		} else if (arg1 == 7) {
			this.anInt5489 = arg0.method22542(-49522556) * 1792977653;
		} else if (arg1 == 8) {
			this.anInt5487 = arg0.method22542(-1125724718) * -585876987;
		} else if (arg1 == 9) {
			this.anInt5496 = arg0.method22542(-658763671) * -1912693335;
		} else if (arg1 == 10) {
			this.anInt5497 = arg0.method22542(-15695181) * 903374255;
		} else if (arg1 == 11) {
			this.anInt5491 = arg0.method22472(-1434290800) * 1574465001;
		} else if (arg1 == 12) {
			this.anInt5494 = arg0.method22542(-388110835) * 1845932589;
		} else if (arg1 == 13) {
			this.anInt5493 = arg0.method22542(-2012933072) * 1355432475;
		}
	}

	@OriginalMember(owner = "client!uk", name = "z", descriptor = "(Lclient!dh;IB)Lclient!cm;", line = 59)
	public Class100 method31753(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (arg1 < 0) {
			return null;
		}
		@Pc(11) Class100 local11 = (Class100) this.aClass156_1.aClass240_23.method25829((long) arg1);
		if (local11 == null) {
			this.method31761(arg0, -1581055043);
			local11 = (Class100) this.aClass156_1.aClass240_23.method25829((long) arg1);
		}
		return local11;
	}

	@OriginalMember(owner = "client!uk", name = "v", descriptor = "(Lclient!dh;I)Lclient!cm;", line = 59)
	public Class100 method31754(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		if (arg1 < 0) {
			return null;
		}
		@Pc(11) Class100 local11 = (Class100) this.aClass156_1.aClass240_23.method25829((long) arg1);
		if (local11 == null) {
			this.method31761(arg0, -1358042784);
			local11 = (Class100) this.aClass156_1.aClass240_23.method25829((long) arg1);
		}
		return local11;
	}

	@OriginalMember(owner = "client!uk", name = "o", descriptor = "(Lclient!dh;I)Lclient!cm;", line = 59)
	public Class100 method31755(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		if (arg1 < 0) {
			return null;
		}
		@Pc(11) Class100 local11 = (Class100) this.aClass156_1.aClass240_23.method25829((long) arg1);
		if (local11 == null) {
			this.method31761(arg0, -2017839628);
			local11 = (Class100) this.aClass156_1.aClass240_23.method25829((long) arg1);
		}
		return local11;
	}

	@OriginalMember(owner = "client!uk", name = "s", descriptor = "(Lclient!dh;I)Lclient!cm;", line = 59)
	public Class100 method31756(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		if (arg1 < 0) {
			return null;
		}
		@Pc(11) Class100 local11 = (Class100) this.aClass156_1.aClass240_23.method25829((long) arg1);
		if (local11 == null) {
			this.method31761(arg0, -1154896092);
			local11 = (Class100) this.aClass156_1.aClass240_23.method25829((long) arg1);
		}
		return local11;
	}

	@OriginalMember(owner = "client!uk", name = "p", descriptor = "(II)I", line = 66)
	static int method31757(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 16711935 ? -1 : Class682.method33269(arg0, -1432208910);
	}

	@OriginalMember(owner = "client!uk", name = "p", descriptor = "(Lclient!dh;II)V", line = 69)
	void method31758(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class497 local3 = this.aClass156_1.aClass497_47;
		if (arg1 >= 0 && this.aClass156_1.aClass240_23.method25829((long) arg1) == null && local3.method30071(arg1, -512225963)) {
			@Pc(21) Class105 local21 = Class203.method24653(local3, arg1);
			this.aClass156_1.aClass240_23.method25838(arg0.method20589(local21, true), (long) arg1);
		}
	}

	@OriginalMember(owner = "client!uk", name = "y", descriptor = "(Lclient!dh;I)V", line = 69)
	void method31759(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class497 local3 = this.aClass156_1.aClass497_47;
		if (arg1 >= 0 && this.aClass156_1.aClass240_23.method25829((long) arg1) == null && local3.method30071(arg1, -512225963)) {
			@Pc(21) Class105 local21 = Class203.method24653(local3, arg1);
			this.aClass156_1.aClass240_23.method25838(arg0.method20589(local21, true), (long) arg1);
		}
	}

	@OriginalMember(owner = "client!uk", name = "q", descriptor = "(Lclient!dh;)V", line = 79)
	void method31760(@OriginalArg(0) Class104 arg0) {
		this.method31758(arg0, this.anInt5489 * -1393086115, 680192989);
		this.method31758(arg0, this.anInt5487 * 816546509, -1004585619);
		this.method31758(arg0, this.anInt5496 * 857036441, -434924340);
		this.method31758(arg0, this.anInt5497 * 168300879, 790777752);
		this.method31758(arg0, this.anInt5494 * -128291419, -1707027654);
		this.method31758(arg0, this.anInt5493 * -1920415725, -602504146);
	}

	@OriginalMember(owner = "client!uk", name = "d", descriptor = "(Lclient!dh;I)V", line = 79)
	void method31761(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		this.method31758(arg0, this.anInt5489 * -1393086115, -850572670);
		this.method31758(arg0, this.anInt5487 * 816546509, -446791328);
		this.method31758(arg0, this.anInt5496 * 857036441, 1564069708);
		this.method31758(arg0, this.anInt5497 * 168300879, -814310435);
		this.method31758(arg0, this.anInt5494 * -128291419, 779292493);
		this.method31758(arg0, this.anInt5493 * -1920415725, 2133236713);
	}

	@OriginalMember(owner = "client!uk", name = "x", descriptor = "(Lclient!dh;)V", line = 79)
	void method31762(@OriginalArg(0) Class104 arg0) {
		this.method31758(arg0, this.anInt5489 * -1393086115, -1222561437);
		this.method31758(arg0, this.anInt5487 * 816546509, 151446484);
		this.method31758(arg0, this.anInt5496 * 857036441, -1259352210);
		this.method31758(arg0, this.anInt5497 * 168300879, 386086763);
		this.method31758(arg0, this.anInt5494 * -128291419, -264456894);
		this.method31758(arg0, this.anInt5493 * -1920415725, 702264914);
	}

	@OriginalMember(owner = "client!uk", name = "n", descriptor = "(I)V", line = 87)
	@Override
	public void method36653(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!uk", name = "l", descriptor = "()V", line = 87)
	@Override
	public void method36659() {
	}

	@OriginalMember(owner = "client!uk", name = "e", descriptor = "(B)[Lclient!db;", line = 140)
	static Class222[] method31763(@OriginalArg(0) byte arg0) {
		return new Class222[] { Class222.aClass222_2, Class222.aClass222_5, Class222.aClass222_3, Class222.aClass222_4, Class222.aClass222_1 };
	}

	@OriginalMember(owner = "client!uk", name = "pc", descriptor = "(Lclient!yf;B)V", line = 7860)
	static final void method31764(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class28.method603(local11, local14, arg0, (byte) -115);
	}

	@OriginalMember(owner = "client!uk", name = "asl", descriptor = "(Lclient!yf;I)V", line = 13142)
	static final void method31765(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		Class51.aClass93_Sub36_1.method14363(Class51.aClass93_Sub36_1.aClass166_Sub36_1, arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091], (byte) 116);
		Class106_Sub1.method5135(138249748);
	}
}
