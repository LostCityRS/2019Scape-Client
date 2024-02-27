package com.jagex;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aap")
public final class Class18 implements Iterable {

	@OriginalMember(owner = "client!aap", name = "n", descriptor = "Lclient!aky;")
	Class93_Sub1 aClass93_Sub1_3;

	@OriginalMember(owner = "client!aap", name = "e", descriptor = "Lclient!aky;")
	public Class93_Sub1 aClass93_Sub1_4 = new Class93_Sub1();

	@OriginalMember(owner = "client!aap", name = "x", descriptor = "(Lclient!aky;Lclient!aky;)V")
	public static void method259(@OriginalArg(0) Class93_Sub1 arg0, @OriginalArg(1) Class93_Sub1 arg1) {
		if (arg0.aClass93_Sub1_67 != null) {
			arg0.method23988((short) -13877);
		}
		arg0.aClass93_Sub1_67 = arg1;
		arg0.aClass93_Sub1_68 = arg1.aClass93_Sub1_68;
		arg0.aClass93_Sub1_67.aClass93_Sub1_68 = arg0;
		arg0.aClass93_Sub1_68.aClass93_Sub1_67 = arg0;
	}

	@OriginalMember(owner = "client!aap", name = "b", descriptor = "(Lclient!aky;Lclient!aky;)V")
	public static void method260(@OriginalArg(0) Class93_Sub1 arg0, @OriginalArg(1) Class93_Sub1 arg1) {
		if (arg0.aClass93_Sub1_67 != null) {
			arg0.method23988((short) -14024);
		}
		arg0.aClass93_Sub1_67 = arg1;
		arg0.aClass93_Sub1_68 = arg1.aClass93_Sub1_68;
		arg0.aClass93_Sub1_67.aClass93_Sub1_68 = arg0;
		arg0.aClass93_Sub1_68.aClass93_Sub1_67 = arg0;
	}

	@OriginalMember(owner = "client!aap", name = "h", descriptor = "(Lclient!aky;Lclient!aky;)V")
	public static void method261(@OriginalArg(0) Class93_Sub1 arg0, @OriginalArg(1) Class93_Sub1 arg1) {
		if (arg0.aClass93_Sub1_67 != null) {
			arg0.method23988((short) 4480);
		}
		arg0.aClass93_Sub1_67 = arg1;
		arg0.aClass93_Sub1_68 = arg1.aClass93_Sub1_68;
		arg0.aClass93_Sub1_67.aClass93_Sub1_68 = arg0;
		arg0.aClass93_Sub1_68.aClass93_Sub1_67 = arg0;
	}

	@OriginalMember(owner = "client!aap", name = "e", descriptor = "(Lclient!alw;I)Lclient!ew;")
	static Class110 method271(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0.method22425((short) 16384);
		@Pc(7) Class89 local7 = Class271.method26399(local3, (byte) 80);
		@Pc(9) Class110 local9 = null;
		switch(local7.anInt291 * -380728599) {
			case 0:
				local9 = new Class110_Sub12(arg0);
				break;
			case 1:
				local9 = new Class110_Sub3(arg0);
				break;
			case 2:
				local9 = new Class110_Sub1(arg0);
				break;
			case 3:
				local9 = new Class110_Sub23(arg0);
				break;
			case 4:
				local9 = new Class110_Sub22(arg0, true);
				break;
			case 5:
				local9 = new Class110_Sub16(arg0);
				break;
			case 6:
				local9 = new Class110_Sub17(arg0);
			case 7:
			case 17:
			case 18:
			default:
				break;
			case 8:
				local9 = new Class110_Sub7(arg0);
				break;
			case 9:
				local9 = new Class110_Sub2(arg0);
				break;
			case 10:
				local9 = new Class110_Sub11(arg0, 1, 1);
				break;
			case 11:
				local9 = new Class110_Sub10(arg0);
				break;
			case 12:
				local9 = new Class110_Sub14(arg0);
				break;
			case 13:
				local9 = new Class110_Sub13(arg0);
				break;
			case 14:
				local9 = new Class110_Sub9(arg0);
				break;
			case 15:
				local9 = new Class110_Sub11(arg0, 0, 0);
				break;
			case 16:
				local9 = new Class110_Sub22(arg0, false);
				break;
			case 19:
				local9 = new Class110_Sub18(arg0);
				break;
			case 20:
				local9 = new Class110_Sub21(arg0);
				break;
			case 21:
				local9 = new Class110_Sub20(arg0);
				break;
			case 22:
				local9 = new Class110_Sub19(arg0);
				break;
			case 23:
				local9 = new Class110_Sub4(arg0);
				break;
			case 24:
				local9 = new Class110_Sub15_Sub1(arg0);
				break;
			case 25:
				local9 = new Class110_Sub6(arg0);
				break;
			case 26:
				local9 = new Class110_Sub11(arg0, 0, 1);
				break;
			case 27:
				local9 = new Class110_Sub11(arg0, 1, 0);
				break;
			case 28:
				local9 = new Class110_Sub15_Sub2(arg0);
				break;
			case 29:
				local9 = new Class110_Sub8(arg0);
				break;
			case 30:
				local9 = new Class110_Sub5(arg0);
		}
		return local9;
	}

	@OriginalMember(owner = "client!aap", name = "w", descriptor = "(Lclient!ase;II)Z")
	static boolean method272(@OriginalArg(0) Class93_Sub41_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = arg0.method22701(2, -1249348482);
		@Pc(22) int local22;
		@Pc(27) int local27;
		@Pc(121) int local121;
		@Pc(125) int local125;
		@Pc(131) int local131;
		@Pc(135) int local135;
		if (local4 == 0) {
			if (arg0.method22701(1, 2022185544) != 0) {
				method272(arg0, arg1, 1181703894);
			}
			local22 = arg0.method22701(6, -1897194506);
			local27 = arg0.method22701(6, -2059073893);
			@Pc(37) boolean local37 = arg0.method22701(1, 1372140904) == 1;
			if (local37) {
				Class174.anIntArray279[(Class174.anInt3292 += 981825405) * 2140666325 - 1] = arg1;
			}
			if (client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[arg1] != null) {
				throw new RuntimeException();
			}
			@Pc(64) Class200 local64 = Class174.aClass200Array1[arg1];
			@Pc(75) Class132_Sub1_Sub1_Sub1_Sub2 local75 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[arg1] = new Class132_Sub1_Sub1_Sub1_Sub2(client.aClass532_1.method30640(-1820788427));
			local75.anInt2768 = arg1 * 171759809;
			if (Class174.aClass93_Sub41Array2[arg1] != null) {
				local75.method20078(Class174.aClass93_Sub41Array2[arg1], 2070630033);
			}
			if (Class174.aClass93_Sub41Array1[arg1] != null) {
				local75.method20060(Class174.aClass93_Sub41Array1[arg1], -1086348893);
			}
			local75.method19964(local64.anInt3376 * -659221549, true, -1693723577);
			local75.anInt2772 = local64.anInt3375 * 715767443;
			local121 = local64.anInt3377 * -930829205;
			local125 = local121 >> 28;
			local131 = local121 >> 14 & 0xFF;
			local135 = local121 & 0xFF;
			@Pc(139) Class611 local139 = client.aClass532_1.method30624(1759915115);
			@Pc(150) int local150 = (local131 << 6) + local22 - local139.anInt5784 * 270611681;
			@Pc(161) int local161 = (local135 << 6) + local27 - local139.anInt5785 * -1994307635;
			local75.aClass286_1 = local64.aClass286_2;
			local75.aBoolean456 = local64.aBoolean580;
			local75.aByteArray47[0] = Class174.aByteArray64[arg1];
			local75.aByte100 = local75.aByte99 = (byte) local125;
			if (client.aClass532_1.method30690(-277650001).method30511(local150, local161, -662808309)) {
				local75.aByte99++;
			}
			local75.method20067(local150, local161, (byte) 1);
			Class174.aClass200Array1[arg1] = null;
			return true;
		} else if (local4 == 1) {
			local22 = arg0.method22701(2, 1384763225);
			local27 = Class174.aClass200Array1[arg1].anInt3377 * -930829205;
			Class174.aClass200Array1[arg1].anInt3377 = ((local27 & 0xFFFFFFF) + ((local22 + (local27 >> 28) & 0x3) << 28)) * -1383292861;
			return false;
		} else {
			@Pc(263) int local263;
			@Pc(270) int local270;
			@Pc(293) int local293;
			if (local4 != 2) {
				local22 = arg0.method22701(20, -675729298);
				local27 = local22 >> 18 & 0x3;
				local263 = local22 >> 16 & 0x3;
				local270 = local22 >> 8 & 0xFF;
				local293 = local22 & 0xFF;
				local121 = Class174.aClass200Array1[arg1].anInt3377 * -930829205;
				Class174.aByteArray64[arg1] = (byte) (local27 - 1);
				if (!Class174.aBoolean564 && (Class174.aByteArray64[arg1] < 0 || Class174.aByteArray64[arg1] > 3)) {
					throw new AssertionError();
				}
				local125 = (local121 >> 28) + local263 & 0x3;
				local131 = (local121 >> 14) + local270 & 0xFF;
				local135 = local121 + local293 & 0xFF;
				Class107.method18131(Class707.method36926(1375636269), local27 - 1, -1915563430);
				Class174.aClass200Array1[arg1].anInt3377 = ((local125 << 28) + (local131 << 14) + local135) * -1383292861;
				return false;
			}
			local22 = arg0.method22701(5, 1000755576);
			local27 = local22 >> 3 & 0x3;
			local263 = local22 & 0x7;
			local270 = Class174.aClass200Array1[arg1].anInt3377 * -930829205;
			if (!Class174.aBoolean564 && (Class174.aByteArray64[arg1] < 0 || Class174.aByteArray64[arg1] > 3)) {
				throw new AssertionError();
			}
			local293 = local27 + (local270 >> 28) & 0x3;
			local121 = local270 >> 14 & 0xFF;
			local125 = local270 & 0xFF;
			if (local263 == 0) {
				local121--;
				local125--;
			}
			if (local263 == 1) {
				local125--;
			}
			if (local263 == 2) {
				local121++;
				local125--;
			}
			if (local263 == 3) {
				local121--;
			}
			if (local263 == 4) {
				local121++;
			}
			if (local263 == 5) {
				local121--;
				local125++;
			}
			if (local263 == 6) {
				local125++;
			}
			if (local263 == 7) {
				local121++;
				local125++;
			}
			Class107.method18131(Class707.method36926(945261972), Class174.aByteArray64[arg1], -1915563430);
			Class174.aClass200Array1[arg1].anInt3377 = (local125 + (local293 << 28) + (local121 << 14)) * -1383292861;
			return false;
		}
	}

	@OriginalMember(owner = "client!aap", name = "<init>", descriptor = "()V")
	public Class18() {
		this.aClass93_Sub1_4.aClass93_Sub1_68 = this.aClass93_Sub1_4;
		this.aClass93_Sub1_4.aClass93_Sub1_67 = this.aClass93_Sub1_4;
	}

	@OriginalMember(owner = "client!aap", name = "p", descriptor = "()Ljava/util/Iterator;")
	public Iterator method242() {
		return new Class11(this);
	}

	@OriginalMember(owner = "client!aap", name = "r", descriptor = "()V")
	public void method243() {
		while (this.aClass93_Sub1_4.aClass93_Sub1_68 != this.aClass93_Sub1_4) {
			this.aClass93_Sub1_4.aClass93_Sub1_68.method23988((short) 289);
		}
	}

	@OriginalMember(owner = "client!aap", name = "f", descriptor = "(B)Lclient!aky;")
	public Class93_Sub1 method244(@OriginalArg(0) byte arg0) {
		@Pc(3) Class93_Sub1 local3 = this.aClass93_Sub1_4.aClass93_Sub1_68;
		if (this.aClass93_Sub1_4 == local3) {
			return null;
		} else {
			local3.method23988((short) 2465);
			return local3;
		}
	}

	@OriginalMember(owner = "client!aap", name = "e", descriptor = "(I)V")
	public void method245(@OriginalArg(0) int arg0) {
		while (this.aClass93_Sub1_4.aClass93_Sub1_68 != this.aClass93_Sub1_4) {
			this.aClass93_Sub1_4.aClass93_Sub1_68.method23988((short) 1220);
		}
	}

	@OriginalMember(owner = "client!aap", name = "w", descriptor = "(I)Lclient!aky;")
	public Class93_Sub1 method246(@OriginalArg(0) int arg0) {
		return this.method247(null, -580144460);
	}

	@OriginalMember(owner = "client!aap", name = "l", descriptor = "(Lclient!aky;I)Lclient!aky;")
	Class93_Sub1 method247(@OriginalArg(0) Class93_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class93_Sub1 local5;
		if (arg0 == null) {
			local5 = this.aClass93_Sub1_4.aClass93_Sub1_68;
		} else {
			local5 = arg0;
		}
		if (local5 == this.aClass93_Sub1_4) {
			this.aClass93_Sub1_3 = null;
			return null;
		} else {
			this.aClass93_Sub1_3 = local5.aClass93_Sub1_68;
			return local5;
		}
	}

	@OriginalMember(owner = "client!aap", name = "i", descriptor = "()Lclient!aky;")
	public Class93_Sub1 method248() {
		return this.method247(null, -580144460);
	}

	@OriginalMember(owner = "client!aap", name = "z", descriptor = "(I)I")
	public int method249(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class93_Sub1 local5 = this.aClass93_Sub1_4.aClass93_Sub1_68; local5 != this.aClass93_Sub1_4; local5 = local5.aClass93_Sub1_68) {
			local1++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!aap", name = "iterator", descriptor = "()Ljava/util/Iterator;")
	@Override
	public Iterator iterator() {
		return new Class11(this);
	}

	@OriginalMember(owner = "client!aap", name = "ag", descriptor = "(Lclient!aky;)Lclient!aky;")
	Class93_Sub1 method250(@OriginalArg(0) Class93_Sub1 arg0) {
		@Pc(5) Class93_Sub1 local5;
		if (arg0 == null) {
			local5 = this.aClass93_Sub1_4.aClass93_Sub1_68;
		} else {
			local5 = arg0;
		}
		if (local5 == this.aClass93_Sub1_4) {
			this.aClass93_Sub1_3 = null;
			return null;
		} else {
			this.aClass93_Sub1_3 = local5.aClass93_Sub1_68;
			return local5;
		}
	}

	@OriginalMember(owner = "client!aap", name = "d", descriptor = "()Ljava/util/Iterator;")
	public Iterator method251() {
		return new Class11(this);
	}

	@OriginalMember(owner = "client!aap", name = "c", descriptor = "()Ljava/util/Iterator;")
	public Iterator method252() {
		return new Class11(this);
	}

	@OriginalMember(owner = "client!aap", name = "u", descriptor = "(I)Lclient!aky;")
	public Class93_Sub1 method253(@OriginalArg(0) int arg0) {
		@Pc(2) Class93_Sub1 local2 = this.aClass93_Sub1_3;
		if (local2 == this.aClass93_Sub1_4) {
			this.aClass93_Sub1_3 = null;
			return null;
		} else {
			this.aClass93_Sub1_3 = local2.aClass93_Sub1_68;
			return local2;
		}
	}

	@OriginalMember(owner = "client!aap", name = "v", descriptor = "()V")
	public void method254() {
		while (this.aClass93_Sub1_4.aClass93_Sub1_68 != this.aClass93_Sub1_4) {
			this.aClass93_Sub1_4.aClass93_Sub1_68.method23988((short) -17249);
		}
	}

	@OriginalMember(owner = "client!aap", name = "ah", descriptor = "()Lclient!aky;")
	public Class93_Sub1 method255() {
		@Pc(2) Class93_Sub1 local2 = this.aClass93_Sub1_3;
		if (local2 == this.aClass93_Sub1_4) {
			this.aClass93_Sub1_3 = null;
			return null;
		} else {
			this.aClass93_Sub1_3 = local2.aClass93_Sub1_68;
			return local2;
		}
	}

	@OriginalMember(owner = "client!aap", name = "s", descriptor = "(Lclient!aky;)V")
	public void method256(@OriginalArg(0) Class93_Sub1 arg0) {
		if (arg0.aClass93_Sub1_67 != null) {
			arg0.method23988((short) -4459);
		}
		arg0.aClass93_Sub1_67 = this.aClass93_Sub1_4.aClass93_Sub1_67;
		arg0.aClass93_Sub1_68 = this.aClass93_Sub1_4;
		arg0.aClass93_Sub1_67.aClass93_Sub1_68 = arg0;
		arg0.aClass93_Sub1_68.aClass93_Sub1_67 = arg0;
	}

	@OriginalMember(owner = "client!aap", name = "y", descriptor = "(Lclient!aky;)V")
	public void method257(@OriginalArg(0) Class93_Sub1 arg0) {
		if (arg0.aClass93_Sub1_67 != null) {
			arg0.method23988((short) -16064);
		}
		arg0.aClass93_Sub1_67 = this.aClass93_Sub1_4.aClass93_Sub1_67;
		arg0.aClass93_Sub1_68 = this.aClass93_Sub1_4;
		arg0.aClass93_Sub1_67.aClass93_Sub1_68 = arg0;
		arg0.aClass93_Sub1_68.aClass93_Sub1_67 = arg0;
	}

	@OriginalMember(owner = "client!aap", name = "q", descriptor = "(Lclient!aky;)V")
	public void method258(@OriginalArg(0) Class93_Sub1 arg0) {
		if (arg0.aClass93_Sub1_67 != null) {
			arg0.method23988((short) -10216);
		}
		arg0.aClass93_Sub1_67 = this.aClass93_Sub1_4.aClass93_Sub1_67;
		arg0.aClass93_Sub1_68 = this.aClass93_Sub1_4;
		arg0.aClass93_Sub1_67.aClass93_Sub1_68 = arg0;
		arg0.aClass93_Sub1_68.aClass93_Sub1_67 = arg0;
	}

	@OriginalMember(owner = "client!aap", name = "a", descriptor = "()Lclient!aky;")
	public Class93_Sub1 method262() {
		@Pc(3) Class93_Sub1 local3 = this.aClass93_Sub1_4.aClass93_Sub1_68;
		if (this.aClass93_Sub1_4 == local3) {
			return null;
		} else {
			local3.method23988((short) -9154);
			return local3;
		}
	}

	@OriginalMember(owner = "client!aap", name = "g", descriptor = "()Lclient!aky;")
	public Class93_Sub1 method263() {
		return this.method247(null, -580144460);
	}

	@OriginalMember(owner = "client!aap", name = "j", descriptor = "(Lclient!aky;)Lclient!aky;")
	Class93_Sub1 method264(@OriginalArg(0) Class93_Sub1 arg0) {
		@Pc(5) Class93_Sub1 local5;
		if (arg0 == null) {
			local5 = this.aClass93_Sub1_4.aClass93_Sub1_68;
		} else {
			local5 = arg0;
		}
		if (local5 == this.aClass93_Sub1_4) {
			this.aClass93_Sub1_3 = null;
			return null;
		} else {
			this.aClass93_Sub1_3 = local5.aClass93_Sub1_68;
			return local5;
		}
	}

	@OriginalMember(owner = "client!aap", name = "t", descriptor = "(Lclient!aky;)Lclient!aky;")
	Class93_Sub1 method265(@OriginalArg(0) Class93_Sub1 arg0) {
		@Pc(5) Class93_Sub1 local5;
		if (arg0 == null) {
			local5 = this.aClass93_Sub1_4.aClass93_Sub1_68;
		} else {
			local5 = arg0;
		}
		if (local5 == this.aClass93_Sub1_4) {
			this.aClass93_Sub1_3 = null;
			return null;
		} else {
			this.aClass93_Sub1_3 = local5.aClass93_Sub1_68;
			return local5;
		}
	}

	@OriginalMember(owner = "client!aap", name = "ae", descriptor = "(Lclient!aky;)Lclient!aky;")
	Class93_Sub1 method266(@OriginalArg(0) Class93_Sub1 arg0) {
		@Pc(5) Class93_Sub1 local5;
		if (arg0 == null) {
			local5 = this.aClass93_Sub1_4.aClass93_Sub1_68;
		} else {
			local5 = arg0;
		}
		if (local5 == this.aClass93_Sub1_4) {
			this.aClass93_Sub1_3 = null;
			return null;
		} else {
			this.aClass93_Sub1_3 = local5.aClass93_Sub1_68;
			return local5;
		}
	}

	@OriginalMember(owner = "client!aap", name = "ac", descriptor = "()I")
	public int method267() {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class93_Sub1 local5 = this.aClass93_Sub1_4.aClass93_Sub1_68; local5 != this.aClass93_Sub1_4; local5 = local5.aClass93_Sub1_68) {
			local1++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!aap", name = "n", descriptor = "(Lclient!aky;I)V")
	public void method268(@OriginalArg(0) Class93_Sub1 arg0, @OriginalArg(1) int arg1) {
		if (arg0.aClass93_Sub1_67 != null) {
			arg0.method23988((short) 18814);
		}
		arg0.aClass93_Sub1_67 = this.aClass93_Sub1_4.aClass93_Sub1_67;
		arg0.aClass93_Sub1_68 = this.aClass93_Sub1_4;
		arg0.aClass93_Sub1_67.aClass93_Sub1_68 = arg0;
		arg0.aClass93_Sub1_68.aClass93_Sub1_67 = arg0;
	}

	@OriginalMember(owner = "client!aap", name = "al", descriptor = "()I")
	public int method269() {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class93_Sub1 local5 = this.aClass93_Sub1_4.aClass93_Sub1_68; local5 != this.aClass93_Sub1_4; local5 = local5.aClass93_Sub1_68) {
			local1++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!aap", name = "o", descriptor = "()V")
	public void method270() {
		while (this.aClass93_Sub1_4.aClass93_Sub1_68 != this.aClass93_Sub1_4) {
			this.aClass93_Sub1_4.aClass93_Sub1_68.method23988((short) -8559);
		}
	}
}
