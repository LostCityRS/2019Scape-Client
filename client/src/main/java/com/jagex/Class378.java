package com.jagex;

import jaclib.ping.Ping;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kg")
public class Class378 implements Interface33 {

	@OriginalMember(owner = "client!kg", name = "ca", descriptor = "Lclient!hf;")
	static Class312 aClass312_10;

	@OriginalMember(owner = "client!kg", name = "w", descriptor = "I")
	int anInt4618;

	@OriginalMember(owner = "client!kg", name = "k", descriptor = "Lclient!eu;")
	Class106 aClass106_11;

	@OriginalMember(owner = "client!kg", name = "f", descriptor = "J")
	long aLong266 = 302932814116787885L;

	@OriginalMember(owner = "client!kg", name = "n", descriptor = "Lclient!py;")
	final Class497 aClass497_107;

	@OriginalMember(owner = "client!kg", name = "m", descriptor = "Lclient!py;")
	final Class497 aClass497_108;

	@OriginalMember(owner = "client!kg", name = "e", descriptor = "Lclient!km;")
	final Class382 aClass382_1;

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Lclient!py;Lclient!py;Lclient!km;)V", line = 20)
	Class378(@OriginalArg(0) Class497 arg0, @OriginalArg(1) Class497 arg1, @OriginalArg(2) Class382 arg2) {
		this.aClass497_107 = arg0;
		this.aClass497_108 = arg1;
		this.aClass382_1 = arg2;
	}

	@OriginalMember(owner = "client!kg", name = "k", descriptor = "(Z)V", line = 27)
	@Override
	public void method28281(@OriginalArg(0) boolean arg0) {
		@Pc(15) int local15 = this.aClass382_1.aClass390_9.method28274(0, client.anInt3511 * 2040043391, 1870819171) + this.aClass382_1.anInt4630 * -396223381;
		@Pc(31) int local31 = this.aClass382_1.aClass392_9.method28291(0, client.anInt3512 * -817449061, (short) 255) + this.aClass382_1.anInt4628 * -1025648387;
		@Pc(41) String local41;
		switch(this.aClass382_1.anInt4625 * 2110757975) {
			case 0:
				local41 = Class653.aClass357_1.method27754(-403061430);
				break;
			case 1:
				local41 = "" + Class653.aClass357_1.method27749(1285578807) + "%";
				break;
			case 2:
				local41 = Class653.aClass357_1.method27751((byte) -78);
				break;
			default:
				local41 = "";
		}
		@Pc(67) int local67 = Class653.aClass357_1.method27749(1285578807);
		if (this.aLong266 * 1467976703334007515L < 0L || local67 == 0 || this.anInt4618 * 1941071467 != local67) {
			this.aLong266 = Class305.method26797(1483751854) * -302932814116787885L;
			this.anInt4618 = local67 * 923145795;
		}
		if (this.aClass382_1.anInt4625 * 2110757975 != 1 && Class305.method26797(-341537321) - this.aLong266 * 1467976703334007515L > 10000L) {
			local41 = local41 + " (" + Class653.aClass357_1.method27760(602155627).anInt4590 * -909097621 + ")";
		}
		this.aClass106_11.method7530(local41, local15, local31, this.aClass382_1.anInt4632 * 1058203625, -1, 1357185837);
	}

	@OriginalMember(owner = "client!kg", name = "n", descriptor = "(ZI)V", line = 27)
	@Override
	public void method28285(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = this.aClass382_1.aClass390_9.method28274(0, client.anInt3511 * 2040043391, 1563708627) + this.aClass382_1.anInt4630 * -396223381;
		@Pc(31) int local31 = this.aClass382_1.aClass392_9.method28291(0, client.anInt3512 * -817449061, (short) 255) + this.aClass382_1.anInt4628 * -1025648387;
		@Pc(41) String local41;
		switch(this.aClass382_1.anInt4625 * 2110757975) {
			case 0:
				local41 = Class653.aClass357_1.method27754(1542503091);
				break;
			case 1:
				local41 = "" + Class653.aClass357_1.method27749(1285578807) + "%";
				break;
			case 2:
				local41 = Class653.aClass357_1.method27751((byte) -70);
				break;
			default:
				local41 = "";
		}
		@Pc(67) int local67 = Class653.aClass357_1.method27749(1285578807);
		if (this.aLong266 * 1467976703334007515L < 0L || local67 == 0 || this.anInt4618 * 1941071467 != local67) {
			this.aLong266 = Class305.method26797(2143353252) * -302932814116787885L;
			this.anInt4618 = local67 * 923145795;
		}
		if (this.aClass382_1.anInt4625 * 2110757975 != 1 && Class305.method26797(-411643746) - this.aLong266 * 1467976703334007515L > 10000L) {
			local41 = local41 + " (" + Class653.aClass357_1.method27760(602155627).anInt4590 * -909097621 + ")";
		}
		this.aClass106_11.method7530(local41, local15, local31, this.aClass382_1.anInt4632 * 1058203625, -1, 1357185837);
	}

	@OriginalMember(owner = "client!kg", name = "f", descriptor = "(Z)V", line = 27)
	@Override
	public void method28282(@OriginalArg(0) boolean arg0) {
		@Pc(15) int local15 = this.aClass382_1.aClass390_9.method28274(0, client.anInt3511 * 2040043391, 1799118294) + this.aClass382_1.anInt4630 * -396223381;
		@Pc(31) int local31 = this.aClass382_1.aClass392_9.method28291(0, client.anInt3512 * -817449061, (short) 255) + this.aClass382_1.anInt4628 * -1025648387;
		@Pc(41) String local41;
		switch(this.aClass382_1.anInt4625 * 2110757975) {
			case 0:
				local41 = Class653.aClass357_1.method27754(991480073);
				break;
			case 1:
				local41 = "" + Class653.aClass357_1.method27749(1285578807) + "%";
				break;
			case 2:
				local41 = Class653.aClass357_1.method27751((byte) -88);
				break;
			default:
				local41 = "";
		}
		@Pc(67) int local67 = Class653.aClass357_1.method27749(1285578807);
		if (this.aLong266 * 1467976703334007515L < 0L || local67 == 0 || this.anInt4618 * 1941071467 != local67) {
			this.aLong266 = Class305.method26797(283559803) * -302932814116787885L;
			this.anInt4618 = local67 * 923145795;
		}
		if (this.aClass382_1.anInt4625 * 2110757975 != 1 && Class305.method26797(432763257) - this.aLong266 * 1467976703334007515L > 10000L) {
			local41 = local41 + " (" + Class653.aClass357_1.method27760(602155627).anInt4590 * -909097621 + ")";
		}
		this.aClass106_11.method7530(local41, local15, local31, this.aClass382_1.anInt4632 * 1058203625, -1, 1357185837);
	}

	@OriginalMember(owner = "client!kg", name = "m", descriptor = "(I)Z", line = 64)
	@Override
	public boolean method28279(@OriginalArg(0) int arg0) {
		@Pc(1) boolean local1 = true;
		if (!this.aClass497_107.method30071(this.aClass382_1.anInt4631 * 1722585703, -512225963)) {
			local1 = false;
		}
		if (!this.aClass497_108.method30071(this.aClass382_1.anInt4631 * 1722585703, -512225963)) {
			local1 = false;
		}
		return local1;
	}

	@OriginalMember(owner = "client!kg", name = "u", descriptor = "()Z", line = 64)
	@Override
	public boolean method28278() {
		@Pc(1) boolean local1 = true;
		if (!this.aClass497_107.method30071(this.aClass382_1.anInt4631 * 1722585703, -512225963)) {
			local1 = false;
		}
		if (!this.aClass497_108.method30071(this.aClass382_1.anInt4631 * 1722585703, -512225963)) {
			local1 = false;
		}
		return local1;
	}

	@OriginalMember(owner = "client!kg", name = "e", descriptor = "(I)V", line = 71)
	@Override
	public void method28280(@OriginalArg(0) int arg0) {
		@Pc(10) Class5 local10 = Class691.method36548(this.aClass497_108, this.aClass382_1.anInt4631 * 1722585703, Class157.aClass462_2, -1437190144);
		this.aClass106_11 = Class694.aClass104_14.method20593(local10, Class203.method24653(this.aClass497_107, this.aClass382_1.anInt4631 * 1722585703), true);
	}

	@OriginalMember(owner = "client!kg", name = "l", descriptor = "()V", line = 71)
	@Override
	public void method28284() {
		@Pc(10) Class5 local10 = Class691.method36548(this.aClass497_108, this.aClass382_1.anInt4631 * 1722585703, Class157.aClass462_2, 1231956020);
		this.aClass106_11 = Class694.aClass104_14.method20593(local10, Class203.method24653(this.aClass497_107, this.aClass382_1.anInt4631 * 1722585703), true);
	}

	@OriginalMember(owner = "client!kg", name = "w", descriptor = "()V", line = 71)
	@Override
	public void method28283() {
		@Pc(10) Class5 local10 = Class691.method36548(this.aClass497_108, this.aClass382_1.anInt4631 * 1722585703, Class157.aClass462_2, 867654599);
		this.aClass106_11 = Class694.aClass104_14.method20593(local10, Class203.method24653(this.aClass497_107, this.aClass382_1.anInt4631 * 1722585703), true);
	}

	@OriginalMember(owner = "client!kg", name = "e", descriptor = "(I)I", line = 71)
	public static int method28069(@OriginalArg(0) int arg0) {
		if (Class487.anInt5150 * -303781075 == 0) {
			Class57.aClass57_3.method1086(new Class475("jaclib"), -945808467);
			if (Class57.aClass57_3.method1085(160569037).method30020(2050223958) != 100) {
				return 1;
			}
			if (!((Class475) Class57.aClass57_3.method1085(160569037)).method29674((byte) -36) && !Class448.method28921((byte) -1)) {
				try {
					Class717.aClient1.method24933((byte) 0);
					Class211.method25420(-934148245);
					Ping.init();
				} catch (@Pc(39) Exception_Sub1 local39) {
					Class166_Sub6.method15480(Class72.aClass72_2, local39.aString64, local39.anInt2449 * 1117594989, local39.getCause(), 1260031788);
				} catch (@Pc(52) Throwable local52) {
				}
			}
			Class487.anInt5150 = -1334846299;
		}
		@Pc(258) int local258;
		@Pc(280) int local280;
		@Pc(298) int local298;
		if (Class487.anInt5150 * -303781075 == 1) {
			Class487.aClass57Array1 = Class57.method1078((byte) 57);
			Class57.aClass57_26.method1086(new Class495(Class222.aClass497_97), -2006111533);
			Class57.aClass57_16.method1086(new Class475("jaggl"), -542141013);
			@Pc(81) Class475 local81 = new Class475("jagdx");
			if (!Class339.aString179.startsWith("win")) {
				local81.method29677((byte) 86);
			}
			Class57.aClass57_20.method1086(local81, -1918420315);
			Class57.aClass57_4.method1086(new Class475("sw3d"), -854572179);
			Class57.aClass57_6.method1086(new Class475("hw3d"), -1637596832);
			Class57.aClass57_5.method1086(new Class475("RuneScape-Setup.exe", true), -1311314082);
			Class57.aClass57_27.method1086(new Class495(Class364.aClass497_105), -639258925);
			Class57.aClass57_7.method1086(new Class495(Class108_Sub1.aClass497_19), -1968032840);
			Class57.aClass57_8.method1086(new Class495(Class166_Sub45.aClass497_60), -1797603970);
			Class57.aClass57_9.method1086(new Class495(Class493.aClass497_124), -2076680531);
			Class57.aClass57_10.method1086(new Class495(Class47.aClass497_6), -1606942693);
			Class57.aClass57_11.method1086(new Class495(Class514.aClass497_128), -1323241189);
			Class57.aClass57_24.method1086(new Class495(Class157.aClass497_49), -2111969485);
			Class57.aClass57_12.method1086(new Class495(Class705.aClass497_141), -833663953);
			Class57.aClass57_23.method1086(new Class495(Class327.aClass497_102), -532314416);
			Class57.aClass57_14.method1086(new Class495(Class443.aClass497_115), -779742375);
			Class57.aClass57_15.method1086(new Class495(Class621.aClass497_135), -968695734);
			Class57.aClass57_2.method1086(new Class495(Class486.aClass497_123), -1355310053);
			Class57.aClass57_17.method1086(new Class495(Class304.aClass497_101), -1241803217);
			Class57.aClass57_18.method1086(new Class495(Class577.aClass497_130), -1427185002);
			Class57.aClass57_19.method1086(new Class495(Class75.aClass497_11), -592139772);
			Class57.aClass57_25.method1086(new Class476(Class40.aClass497_4, "huffman"), -910934153);
			Class57.aClass57_21.method1086(new Class495(Class200.aClass497_96), -672332823);
			Class57.aClass57_22.method1086(new Class495(Class542.aClass497_129), -985737604);
			Class57.aClass57_1.method1086(new Class495(Class633.aClass497_137), -2100956870);
			Class57.aClass57_13.method1086(new Class485(Class144_Sub1.aClass497_42, 0), -1416721112);
			for (local258 = 0; local258 < Class487.aClass57Array1.length; local258++) {
				if (Class487.aClass57Array1[local258].method1085(160569037) == null) {
					throw new RuntimeException();
				}
			}
			local258 = 0;
			@Pc(278) Class57[] local278 = Class487.aClass57Array1;
			for (local280 = 0; local280 < local278.length; local280++) {
				@Pc(288) Class57 local288 = local278[local280];
				@Pc(292) int local292 = local288.method1082(1290454838);
				local298 = local288.method1085(160569037).method30020(1043470465);
				local258 += local292 * local298 / 100;
			}
			Class487.anInt5151 = local258 * -1420497609;
			Class487.anInt5150 = 1625274698;
		}
		if (Class487.aClass57Array1 == null) {
			return 100;
		}
		@Pc(321) int local321 = 0;
		local258 = 0;
		@Pc(325) boolean local325 = true;
		@Pc(327) Class57[] local327 = Class487.aClass57Array1;
		for (@Pc(329) int local329 = 0; local329 < local327.length; local329++) {
			@Pc(337) Class57 local337 = local327[local329];
			local298 = local337.method1082(1739522507);
			@Pc(347) int local347 = local337.method1085(160569037).method30020(1457021215);
			if (local347 < 100) {
				local325 = false;
			}
			local321 += local298;
			local258 += local347 * local298 / 100;
		}
		if (local325) {
			Class487.aClass57Array1 = null;
		}
		local258 -= Class487.anInt5151 * -1498130297;
		local321 -= Class487.anInt5151 * -1498130297;
		local280 = local321 > 0 ? local258 * 100 / local321 : 100;
		if (!local325 && local280 > 99) {
			local280 = 99;
		}
		return local280;
	}

	@OriginalMember(owner = "client!kg", name = "e", descriptor = "(I)Z", line = 118)
	static boolean method28070(@OriginalArg(0) int arg0) {
		return Class411.anInt4746 * 276097583 == -1 ? Class666.method32902(Class411.username, Class411.aString201, -869588093) : Class529.method30400(-1373744230);
	}

	@OriginalMember(owner = "client!kg", name = "l", descriptor = "(Lclient!aqk;I)V", line = 268)
	public static void method28071(@OriginalArg(0) Class132_Sub1_Sub1_Sub1_Sub2 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class93_Sub13 local8 = (Class93_Sub13) Class93_Sub13.aClass16_11.method214((long) (arg0.anInt2768 * -1688488127));
		if (local8 == null) {
			return;
		}
		if (local8.aClass539_3 != null) {
			local8.aClass539_3.method30803(100, (byte) -14);
			Class274.aClass258_1.method26088(local8.aClass539_3, 1869825942);
			local8.aClass539_3 = null;
		}
		local8.method23969(231328106);
	}

	@OriginalMember(owner = "client!kg", name = "yw", descriptor = "(Lclient!yf;I)V", line = 9303)
	static final void method28072(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class106.lang.getId();
	}
}
