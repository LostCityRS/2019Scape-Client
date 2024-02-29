package com.jagex;

import java.lang.management.GarbageCollectorMXBean;
import java.util.BitSet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!akr")
public class Class93_Sub28 extends Class93 {

	@OriginalMember(owner = "client!akr", name = "wk", descriptor = "Ljava/lang/management/GarbageCollectorMXBean;")
	static GarbageCollectorMXBean aGarbageCollectorMXBean1;

	@OriginalMember(owner = "client!akr", name = "d", descriptor = "B")
	public byte aByte55;

	@OriginalMember(owner = "client!akr", name = "w", descriptor = "[Lclient!kb;")
	public Class373[] aClass373Array1;

	@OriginalMember(owner = "client!akr", name = "u", descriptor = "[I")
	int[] anIntArray182;

	@OriginalMember(owner = "client!akr", name = "z", descriptor = "J")
	long aLong89;

	@OriginalMember(owner = "client!akr", name = "k", descriptor = "Z")
	boolean aBoolean339;

	@OriginalMember(owner = "client!akr", name = "c", descriptor = "B")
	public byte aByte56;

	@OriginalMember(owner = "client!akr", name = "f", descriptor = "Z")
	boolean aBoolean338 = true;

	@OriginalMember(owner = "client!akr", name = "l", descriptor = "I")
	public int anInt1602 = 0;

	@OriginalMember(owner = "client!akr", name = "p", descriptor = "Ljava/lang/String;")
	public String aString44 = null;

	static {
		new BitSet(65536);
	}

	@OriginalMember(owner = "client!akr", name = "e", descriptor = "(IB)V", line = 24)
	void method13822(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (this.aClass373Array1 == null) {
			this.aClass373Array1 = new Class373[arg0];
		} else {
			System.arraycopy(this.aClass373Array1, 0, this.aClass373Array1 = new Class373[arg0], 0, this.anInt1602 * -1052058559);
		}
	}

	@OriginalMember(owner = "client!akr", name = "u", descriptor = "(I)V", line = 24)
	void method13823(@OriginalArg(0) int arg0) {
		if (this.aClass373Array1 == null) {
			this.aClass373Array1 = new Class373[arg0];
		} else {
			System.arraycopy(this.aClass373Array1, 0, this.aClass373Array1 = new Class373[arg0], 0, this.anInt1602 * -1052058559);
		}
	}

	@OriginalMember(owner = "client!akr", name = "z", descriptor = "(I)V", line = 24)
	void method13824(@OriginalArg(0) int arg0) {
		if (this.aClass373Array1 == null) {
			this.aClass373Array1 = new Class373[arg0];
		} else {
			System.arraycopy(this.aClass373Array1, 0, this.aClass373Array1 = new Class373[arg0], 0, this.anInt1602 * -1052058559);
		}
	}

	@OriginalMember(owner = "client!akr", name = "l", descriptor = "(I)V", line = 24)
	void method13825(@OriginalArg(0) int arg0) {
		if (this.aClass373Array1 == null) {
			this.aClass373Array1 = new Class373[arg0];
		} else {
			System.arraycopy(this.aClass373Array1, 0, this.aClass373Array1 = new Class373[arg0], 0, this.anInt1602 * -1052058559);
		}
	}

	@OriginalMember(owner = "client!akr", name = "<init>", descriptor = "(Lclient!alw;)V", line = 28)
	public Class93_Sub28(@OriginalArg(0) Class93_Sub41 arg0) {
		this.method13836(arg0, 1336303159);
	}

	@OriginalMember(owner = "client!akr", name = "n", descriptor = "(I)[I", line = 33)
	public int[] method13826(@OriginalArg(0) int arg0) {
		if (this.anIntArray182 == null) {
			@Pc(8) String[] local8 = new String[this.anInt1602 * -1052058559];
			this.anIntArray182 = new int[this.anInt1602 * -1052058559];
			@Pc(17) int local17 = 0;
			while (local17 < this.anInt1602 * -1052058559) {
				local8[local17] = this.aClass373Array1[local17].aString191;
				this.anIntArray182[local17] = local17++;
			}
			Class118.method8407(local8, this.anIntArray182, 1929997099);
		}
		return this.anIntArray182;
	}

	@OriginalMember(owner = "client!akr", name = "p", descriptor = "()[I", line = 33)
	public int[] method13827() {
		if (this.anIntArray182 == null) {
			@Pc(8) String[] local8 = new String[this.anInt1602 * -1052058559];
			this.anIntArray182 = new int[this.anInt1602 * -1052058559];
			@Pc(17) int local17 = 0;
			while (local17 < this.anInt1602 * -1052058559) {
				local8[local17] = this.aClass373Array1[local17].aString191;
				this.anIntArray182[local17] = local17++;
			}
			Class118.method8407(local8, this.anIntArray182, 1579895135);
		}
		return this.anIntArray182;
	}

	@OriginalMember(owner = "client!akr", name = "m", descriptor = "(Lclient!kb;I)V", line = 46)
	void method13828(@OriginalArg(0) Class373 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass373Array1 == null || this.anInt1602 * -1052058559 >= this.aClass373Array1.length) {
			this.method13822(this.anInt1602 * -1052058559 + 5, (byte) -29);
		}
		this.aClass373Array1[(this.anInt1602 += -1125174335) * -1052058559 - 1] = arg0;
		this.anIntArray182 = null;
	}

	@OriginalMember(owner = "client!akr", name = "d", descriptor = "(Lclient!kb;)V", line = 46)
	void method13829(@OriginalArg(0) Class373 arg0) {
		if (this.aClass373Array1 == null || this.anInt1602 * -1052058559 >= this.aClass373Array1.length) {
			this.method13822(this.anInt1602 * -1052058559 + 5, (byte) 7);
		}
		this.aClass373Array1[(this.anInt1602 += -1125174335) * -1052058559 - 1] = arg0;
		this.anIntArray182 = null;
	}

	@OriginalMember(owner = "client!akr", name = "c", descriptor = "(I)V", line = 52)
	void method13830(@OriginalArg(0) int arg0) {
		this.anInt1602 -= -1125174335;
		if (this.anInt1602 * -1052058559 == 0) {
			this.aClass373Array1 = null;
		} else {
			System.arraycopy(this.aClass373Array1, arg0 + 1, this.aClass373Array1, arg0, this.anInt1602 * -1052058559 - arg0);
		}
		this.anIntArray182 = null;
	}

	@OriginalMember(owner = "client!akr", name = "k", descriptor = "(II)V", line = 52)
	void method13831(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1602 -= -1125174335;
		if (this.anInt1602 * -1052058559 == 0) {
			this.aClass373Array1 = null;
		} else {
			System.arraycopy(this.aClass373Array1, arg0 + 1, this.aClass373Array1, arg0, this.anInt1602 * -1052058559 - arg0);
		}
		this.anIntArray182 = null;
	}

	@OriginalMember(owner = "client!akr", name = "r", descriptor = "(I)V", line = 52)
	void method13832(@OriginalArg(0) int arg0) {
		this.anInt1602 -= -1125174335;
		if (this.anInt1602 * -1052058559 == 0) {
			this.aClass373Array1 = null;
		} else {
			System.arraycopy(this.aClass373Array1, arg0 + 1, this.aClass373Array1, arg0, this.anInt1602 * -1052058559 - arg0);
		}
		this.anIntArray182 = null;
	}

	@OriginalMember(owner = "client!akr", name = "f", descriptor = "(Ljava/lang/String;B)I", line = 59)
	public int method13833(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1602 * -1052058559; local1++) {
			if (this.aClass373Array1[local1].aString191.equalsIgnoreCase(arg0)) {
				return local1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!akr", name = "v", descriptor = "(Ljava/lang/String;)I", line = 59)
	public int method13834(@OriginalArg(0) String arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1602 * -1052058559; local1++) {
			if (this.aClass373Array1[local1].aString191.equalsIgnoreCase(arg0)) {
				return local1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!akr", name = "y", descriptor = "(Ljava/lang/String;)I", line = 59)
	public int method13835(@OriginalArg(0) String arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1602 * -1052058559; local1++) {
			if (this.aClass373Array1[local1].aString191.equalsIgnoreCase(arg0)) {
				return local1;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!akr", name = "w", descriptor = "(Lclient!alw;I)V", line = 66)
	void method13836(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0.method22465((short) 16384);
		if ((local3 & 0x1) != 0) {
			this.aBoolean339 = true;
		}
		if ((local3 & 0x2) != 0) {
			this.aBoolean338 = true;
		}
		@Pc(21) int local21 = 2;
		if ((local3 & 0x4) != 0) {
			local21 = arg0.method22465((short) 16384);
		}
		this.aLong232 = arg0.method22495(1716787865) * -284080703297520027L;
		this.aLong89 = arg0.method22495(-1617892798) * -8713487650679722559L;
		this.aString44 = arg0.method22509(929635250);
		arg0.method22465((short) 16384);
		this.aByte56 = arg0.method22468(725992699);
		this.aByte55 = arg0.method22468(1940838573);
		this.anInt1602 = arg0.method22472(-1434290800) * -1125174335;
		if (this.anInt1602 * -1052058559 <= 0) {
			return;
		}
		this.aClass373Array1 = new Class373[this.anInt1602 * -1052058559];
		for (@Pc(84) int local84 = 0; local84 < this.anInt1602 * -1052058559; local84++) {
			@Pc(94) Class373 local94 = new Class373();
			if (this.aBoolean339) {
				arg0.method22495(1050717539);
			}
			if (this.aBoolean338) {
				local94.aString191 = arg0.method22509(1071713046);
			}
			local94.aByte150 = arg0.method22468(1454895866);
			local94.anInt4597 = arg0.method22472(-1434290800) * -1542465575;
			if (local21 >= 3) {
				arg0.method22465((short) 16384);
			}
			this.aClass373Array1[local84] = local94;
		}
	}

	@OriginalMember(owner = "client!akr", name = "h", descriptor = "(Lclient!alw;)V", line = 66)
	void method13837(@OriginalArg(0) Class93_Sub41 arg0) {
		@Pc(3) int local3 = arg0.method22465((short) 16384);
		if ((local3 & 0x1) != 0) {
			this.aBoolean339 = true;
		}
		if ((local3 & 0x2) != 0) {
			this.aBoolean338 = true;
		}
		@Pc(21) int local21 = 2;
		if ((local3 & 0x4) != 0) {
			local21 = arg0.method22465((short) 16384);
		}
		this.aLong232 = arg0.method22495(-1632333873) * -284080703297520027L;
		this.aLong89 = arg0.method22495(-1460949801) * -8713487650679722559L;
		this.aString44 = arg0.method22509(811166998);
		arg0.method22465((short) 16384);
		this.aByte56 = arg0.method22468(1277799625);
		this.aByte55 = arg0.method22468(1265793076);
		this.anInt1602 = arg0.method22472(-1434290800) * -1125174335;
		if (this.anInt1602 * -1052058559 <= 0) {
			return;
		}
		this.aClass373Array1 = new Class373[this.anInt1602 * -1052058559];
		for (@Pc(84) int local84 = 0; local84 < this.anInt1602 * -1052058559; local84++) {
			@Pc(94) Class373 local94 = new Class373();
			if (this.aBoolean339) {
				arg0.method22495(733980518);
			}
			if (this.aBoolean338) {
				local94.aString191 = arg0.method22509(724735356);
			}
			local94.aByte150 = arg0.method22468(1711724058);
			local94.anInt4597 = arg0.method22472(-1434290800) * -1542465575;
			if (local21 >= 3) {
				arg0.method22465((short) 16384);
			}
			this.aClass373Array1[local84] = local94;
		}
	}

	@OriginalMember(owner = "client!akr", name = "x", descriptor = "(Lclient!alw;)V", line = 66)
	void method13838(@OriginalArg(0) Class93_Sub41 arg0) {
		@Pc(3) int local3 = arg0.method22465((short) 16384);
		if ((local3 & 0x1) != 0) {
			this.aBoolean339 = true;
		}
		if ((local3 & 0x2) != 0) {
			this.aBoolean338 = true;
		}
		@Pc(21) int local21 = 2;
		if ((local3 & 0x4) != 0) {
			local21 = arg0.method22465((short) 16384);
		}
		this.aLong232 = arg0.method22495(1312585054) * -284080703297520027L;
		this.aLong89 = arg0.method22495(1572409146) * -8713487650679722559L;
		this.aString44 = arg0.method22509(1763467286);
		arg0.method22465((short) 16384);
		this.aByte56 = arg0.method22468(1944505585);
		this.aByte55 = arg0.method22468(719939242);
		this.anInt1602 = arg0.method22472(-1434290800) * -1125174335;
		if (this.anInt1602 * -1052058559 <= 0) {
			return;
		}
		this.aClass373Array1 = new Class373[this.anInt1602 * -1052058559];
		for (@Pc(84) int local84 = 0; local84 < this.anInt1602 * -1052058559; local84++) {
			@Pc(94) Class373 local94 = new Class373();
			if (this.aBoolean339) {
				arg0.method22495(-496143310);
			}
			if (this.aBoolean338) {
				local94.aString191 = arg0.method22509(1005898774);
			}
			local94.aByte150 = arg0.method22468(906235362);
			local94.anInt4597 = arg0.method22472(-1434290800) * -1542465575;
			if (local21 >= 3) {
				arg0.method22465((short) 16384);
			}
			this.aClass373Array1[local84] = local94;
		}
	}

	@OriginalMember(owner = "client!akr", name = "a", descriptor = "(Lclient!alw;)V", line = 66)
	void method13839(@OriginalArg(0) Class93_Sub41 arg0) {
		@Pc(3) int local3 = arg0.method22465((short) 16384);
		if ((local3 & 0x1) != 0) {
			this.aBoolean339 = true;
		}
		if ((local3 & 0x2) != 0) {
			this.aBoolean338 = true;
		}
		@Pc(21) int local21 = 2;
		if ((local3 & 0x4) != 0) {
			local21 = arg0.method22465((short) 16384);
		}
		this.aLong232 = arg0.method22495(-147223289) * -284080703297520027L;
		this.aLong89 = arg0.method22495(-152749174) * -8713487650679722559L;
		this.aString44 = arg0.method22509(1298401702);
		arg0.method22465((short) 16384);
		this.aByte56 = arg0.method22468(564534713);
		this.aByte55 = arg0.method22468(658939030);
		this.anInt1602 = arg0.method22472(-1434290800) * -1125174335;
		if (this.anInt1602 * -1052058559 <= 0) {
			return;
		}
		this.aClass373Array1 = new Class373[this.anInt1602 * -1052058559];
		for (@Pc(84) int local84 = 0; local84 < this.anInt1602 * -1052058559; local84++) {
			@Pc(94) Class373 local94 = new Class373();
			if (this.aBoolean339) {
				arg0.method22495(1401016987);
			}
			if (this.aBoolean338) {
				local94.aString191 = arg0.method22509(1285384266);
			}
			local94.aByte150 = arg0.method22468(1278357445);
			local94.anInt4597 = arg0.method22472(-1434290800) * -1542465575;
			if (local21 >= 3) {
				arg0.method22465((short) 16384);
			}
			this.aClass373Array1[local84] = local94;
		}
	}

	@OriginalMember(owner = "client!akr", name = "ij", descriptor = "(Lclient!yf;I)V", line = 6458)
	static final void method13840(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, 862080406);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class453.method28966(local16, local22, arg0, Class121.aClass93_Sub28_2 == arg0.aClass93_Sub28_4 ? Class310.aClass310_5 : Class310.aClass310_1, (byte) -102);
	}

	@OriginalMember(owner = "client!akr", name = "bcx", descriptor = "(Lclient!yf;B)V", line = 14522)
	static final void method13841(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = ((Class132_Sub1) arg0.anInterface61_1).method24270(899866876);
	}
}
