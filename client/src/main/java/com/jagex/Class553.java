package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@OriginalClass("client!sl")
public final class Class553 {

	@OriginalMember(owner = "client!sl", name = "f", descriptor = "Ljava/io/File;")
	static File aFile4;

	@OriginalMember(owner = "client!sl", name = "bv", descriptor = "Lclient!aan;")
	static Class15 aClass15_11;

	@OriginalMember(owner = "client!sl", name = "t", descriptor = "Z")
	static boolean aBoolean913 = false;

	@OriginalMember(owner = "client!sl", name = "e", descriptor = "Ljava/util/Hashtable;")
	static Hashtable aHashtable9 = new Hashtable(16);

	@OriginalMember(owner = "client!sl", name = "l", descriptor = "(Ljava/io/File;)V")
	static void method31355(@OriginalArg(0) File arg0) {
		aFile4 = arg0;
		if (!aFile4.exists()) {
			throw new RuntimeException("");
		}
		aBoolean913 = true;
	}

	@OriginalMember(owner = "client!sl", name = "u", descriptor = "(Ljava/io/File;)V")
	static void method31356(@OriginalArg(0) File arg0) {
		aFile4 = arg0;
		if (!aFile4.exists()) {
			throw new RuntimeException("");
		}
		aBoolean913 = true;
	}

	@OriginalMember(owner = "client!sl", name = "o", descriptor = "()Ljava/lang/String;")
	public static String method31357() {
		return aFile4.getAbsolutePath();
	}

	@OriginalMember(owner = "client!sl", name = "g", descriptor = "()Ljava/lang/String;")
	public static String method31358() {
		return aFile4.getAbsolutePath();
	}

	@OriginalMember(owner = "client!sl", name = "i", descriptor = "()Ljava/lang/String;")
	public static String method31359() {
		return aFile4.getAbsolutePath();
	}

	@OriginalMember(owner = "client!sl", name = "m", descriptor = "()Ljava/lang/String;")
	public static String method31360() {
		return aFile4.getAbsolutePath();
	}

	@OriginalMember(owner = "client!sl", name = "j", descriptor = "()Ljava/lang/String;")
	public static String method31361() {
		return aFile4.getAbsolutePath();
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/File;")
	public static File method31362(@OriginalArg(0) String arg0) {
		if (!aBoolean913) {
			throw new RuntimeException("");
		}
		@Pc(11) File local11 = (File) aHashtable9.get(arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(22) File local22 = new File(aFile4, arg0);
		@Pc(24) RandomAccessFile local24 = null;
		try {
			@Pc(30) File local30 = new File(local22.getParent());
			if (!local30.exists()) {
				throw new RuntimeException("");
			}
			local24 = new RandomAccessFile(local22, "rw");
			@Pc(47) int local47 = local24.read();
			local24.seek(0L);
			local24.write(local47);
			local24.seek(0L);
			local24.close();
			aHashtable9.put(arg0, local22);
			return local22;
		} catch (@Pc(66) Exception local66) {
			try {
				if (local24 != null) {
					local24.close();
					local24 = null;
				}
			} catch (@Pc(75) Exception local75) {
			}
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sl", name = "o", descriptor = "(Lclient!yp;I)V")
	static void method31363(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[arg0.anInt5778 * 1896589581 - 2] = ((Class352) Class106.aClass73_Sub1_6.method18054(arg0.anIntArray525[arg0.anInt5778 * 1896589581 - 2], 1783758782)).method28036(Class672.aClass134_1, arg0.anIntArray525[arg0.anInt5778 * 1896589581 - 1], 16711680) ? 1 : 0;
		arg0.anInt5778 -= 2036747717;
	}

	@OriginalMember(owner = "client!sl", name = "xi", descriptor = "(Lclient!yp;I)V")
	static void method31364(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class80_Sub33 local13 = (Class80_Sub33) arg0.anObjectArray46[(arg0.anInt5776 -= -825189621) * -2070619997];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local13.anInt1652 * 1085842725;
	}

	@OriginalMember(owner = "client!sl", name = "apr", descriptor = "(Lclient!yp;I)V")
	static void method31365(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		if (!Class353.method28071(2016176610)) {
			Class324.method27619((byte) 0);
		}
	}

	@OriginalMember(owner = "client!sl", name = "p", descriptor = "(Lclient!sp;Lclient!yp;I)V")
	static void method31366(@OriginalArg(0) Class557 arg0, @OriginalArg(1) Class690 arg1, @OriginalArg(2) int arg2) throws Exception_Sub3, Exception_Sub6 {
		switch(arg0.anInt5179 * 122729371) {
			case 0:
				Class650.method33121(arg1, (byte) -86);
				return;
			case 1:
				Class41_Sub14.method17601(arg1, (byte) 126);
				return;
			case 2:
				Class683.method36767(arg1, -1270746413);
				return;
			case 3:
				Class661.method33321(arg1, -644013438);
				return;
			case 4:
				Class517.method30579(arg1, -460283174);
				return;
			case 5:
			case 478:
			case 1062:
			case 1350:
			case 1373:
			default:
				throw new RuntimeException();
			case 6:
				Class695.method37032(arg1, 1263371976);
				return;
			case 7:
				Class659.method33283(arg1, (short) 255);
				return;
			case 8:
				Class174.method24635(arg1, 491898122);
				return;
			case 9:
				Class687.method36832(arg1, -1404520671);
				return;
			case 10:
				Class244.method26302(arg1, (byte) 7);
				return;
			case 11:
				Class80_Sub20.method14172(arg1, 2144892219);
				return;
			case 12:
				Class277.method26829(arg1, (byte) -32);
				return;
			case 13:
				Class440.method29171(arg1, (byte) -17);
				return;
			case 14:
				Class557.method31377(arg1, -1058896867);
				return;
			case 15:
				Class2_Sub1.method1838(arg1, 1211043119);
				return;
			case 16:
				Class203.method24975(arg1, 904009318);
				return;
			case 17:
				Class165_Sub15.method16123(arg1, -457947262);
				return;
			case 18:
				Class545.method31204(arg1, (byte) -43);
				return;
			case 19:
				Class545.method31205(arg1, (byte) -72);
				return;
			case 20:
				Class511.method30552(arg1, (byte) 124);
				return;
			case 21:
				Class340.method27907(arg1, 1947779913);
				return;
			case 22:
				Class653.method33143(arg1, 65134230);
				return;
			case 23:
				Class649.method33112(arg1, -569842029);
				return;
			case 24:
				Class667.method33471(arg1, 1513579414);
				return;
			case 25:
				Class533.method30831(arg1, (byte) 3);
				return;
			case 26:
				Class598.method32025(arg1, -370994697);
				return;
			case 27:
				Class621.method32343(arg1, 1097004550);
				return;
			case 28:
				Class3.method68(arg1, -77374291);
				return;
			case 29:
				Class636.method32865(arg1, -1912401704);
				return;
			case 30:
				Class500.method30414(arg1, 2035010350);
				return;
			case 31:
				Class700.method37080(arg1, 289679058);
				return;
			case 32:
				Class369.method28339(arg1, 1549265561);
				return;
			case 33:
				Class310.method27459(arg1, -848034732);
				return;
			case 34:
				Class575.method31782(arg1, 1319912622);
				return;
			case 35:
				Class89.method1805(arg1, 1263112859);
				return;
			case 36:
				Class594.method31954(arg1, (byte) 35);
				return;
			case 37:
				Class682.method36705(arg1, (byte) 95);
				return;
			case 38:
				Class290.method26930(arg1, -1774674639);
				return;
			case 39:
				Class120_Sub1_Sub2_Sub2.method13701(arg1, -782411319);
				return;
			case 40:
				Class474.method29880(arg1, 2035429909);
				return;
			case 41:
				Class286.method26897(arg1, -1395768089);
				return;
			case 42:
				Class138.method11534(arg1, -171286715);
				return;
			case 43:
				Class504.method30458(arg1, -1315094886);
				return;
			case 44:
				Class8.method313(arg1, -1908190466);
				return;
			case 45:
				Class391.method28673(arg1, -1855967605);
				return;
			case 46:
				Class608.method32190(arg1, 1518494373);
				return;
			case 47:
				Class498.method30360(arg1, -431143422);
				return;
			case 48:
				Class433.method29111(arg1, (byte) 42);
				return;
			case 49:
				Class593.method31947(arg1, -1661600870);
				return;
			case 50:
				Class464.method29618(arg1, -1959596068);
				return;
			case 51:
				Class336.method27869(arg1, 563669637);
				return;
			case 52:
				Class29.method665(arg1, -1091775860);
				return;
			case 53:
				Class260.method26470(arg1, -436626016);
				return;
			case 54:
				Class420.method29005(arg1, 1855995201);
				return;
			case 55:
				Class434.method29115(arg1, -854823974);
				return;
			case 56:
				Class386.method28604(arg1, 1939136233);
				return;
			case 57:
				Class244.method26304(arg1, (byte) -46);
				return;
			case 58:
				Class244.method26303(arg1, 16711935);
				return;
			case 59:
				Class667.method33474(arg1, (byte) 0);
				return;
			case 60:
				Class697.method37054(arg1, 30449599);
				return;
			case 61:
				Class533.method30829(arg1, 1190692343);
				return;
			case 62:
				Class103_Sub18.method8400(arg1, 716786437);
				return;
			case 63:
				ByteArrayPool.method37097(arg1, 513500097);
				return;
			case 64:
				Class239.method26213(arg1, 100529487);
				return;
			case 65:
				Class543.method31176(arg1, 16711935);
				return;
			case 66:
				Class594.method31955(arg1, (byte) 12);
				return;
			case 67:
				Class720.method37296(arg1, -1173450677);
				return;
			case 68:
				Class374.method28436(arg1, -3484158);
				return;
			case 69:
				Class80.method24401(arg1, (byte) 127);
				return;
			case 70:
				Class155.method15060(arg1, 159050007);
				return;
			case 71:
				Class507.method30515(arg1, 2117952769);
				return;
			case 72:
				Class511.method30550(arg1, 152427341);
				return;
			case 73:
				Class445.method29240(arg1, -1838844066);
				return;
			case 74:
				Class636.method32864(arg1, (byte) 0);
				return;
			case 75:
				Class568.method31527(arg1, (byte) 4);
				return;
			case 76:
				Class168.method18548(arg1, 735937393);
				return;
			case 77:
				Class630.method32715(arg1, (byte) 3);
				return;
			case 78:
				Class20_Sub5.method16947(arg1, -464748641);
				return;
			case 79:
				Class165_Sub41.method16813(arg1, (byte) 70);
				return;
			case 80:
				Class577.method31793(arg1, (byte) -54);
				return;
			case 81:
				Class76.method1362(arg1, (short) -24198);
				return;
			case 82:
				Class102_Sub2.method5122(arg1, -683126728);
				return;
			case 83:
				Class677.method33594(arg1, (byte) 69);
				return;
			case 84:
				Class78.method1373(arg1, -599542930);
				return;
			case 85:
				Class150.method14521(arg1, (byte) 112);
				return;
			case 86:
				Class359.method28139(arg1, 1884492531);
				return;
			case 87:
				Class529.method30810(arg1, (byte) 8);
				return;
			case 88:
				Class385.method28601(arg1, -1565894751);
				return;
			case 89:
				Class133.method10404(arg1, (short) 13162);
				return;
			case 90:
				Class156.method15159(arg1, 1854048903);
				return;
			case 91:
				Class677.method33595(arg1, (byte) 50);
				return;
			case 92:
				Class313.method27480(arg1, -1837742829);
				return;
			case 93:
				Class575.method31783(arg1, 1905727510);
				return;
			case 94:
				Class519.method30607(arg1, 537461747);
				return;
			case 95:
				Class226.method25965(arg1, 2036747717);
				return;
			case 96:
				Class546.method31210(arg1, 267005222);
				return;
			case 97:
				Class511.method30551(arg1, 193518815);
				return;
			case 98:
				Class80_Sub1_Sub2.method1686(arg1, -398144971);
				return;
			case 99:
				Class363.method28161(arg1, -1212311497);
				return;
			case 100:
				Class361.method28151(arg1, 1072827887);
				return;
			case 101:
				Class80_Sub1_Sub17.method22912(arg1, -1915673799);
				return;
			case 102:
				Class98.method2706(arg1, (byte) 104);
				return;
			case 103:
				Class597.method32018(arg1, -1276948162);
				return;
			case 104:
				Class103_Sub12.method7925(arg1, (short) 10599);
				return;
			case 105:
				Class312.method27472(arg1, (byte) 93);
				return;
			case 106:
				Class200.method24927(arg1, -918020935);
				return;
			case 107:
				Class716.method37228(arg1, -2122483947);
				return;
			case 108:
				Class645.method33041(arg1, (byte) -1);
				return;
			case 109:
				Class18.method460(arg1, -166496299);
				return;
			case 110:
				Class113.method8381(arg1, (byte) -26);
				return;
			case 111:
				Class441.method29187(arg1, (byte) 1);
				return;
			case 112:
				Class155_Sub1.method15103(arg1, (byte) 92);
				return;
			case 113:
				Class542.method31172(arg1, 1004897157);
				return;
			case 114:
				Class375.method28453(arg1, -1933263244);
				return;
			case 115:
				Class440.method29168(arg1, 1791547589);
				return;
			case 116:
				Class163.method15762(arg1, 2047267458);
				return;
			case 117:
				Class492.method30267(arg1, -1674406613);
				return;
			case 118:
				Class74.method1310(arg1, -327522936);
				return;
			case 119:
				Class342.method27941(arg1, 1850775073);
				return;
			case 120:
				Class57.method1162(arg1, 168899586);
				return;
			case 121:
				Class126.method20381(arg1, (byte) 76);
				return;
			case 122:
				Class242.method26241(arg1, (short) 30978);
				return;
			case 123:
				Class348.method27989(arg1, 663664571);
				return;
			case 124:
				Class11.method333(arg1, 1613341792);
				return;
			case 125:
				Class387.method28618(arg1, 1526163241);
				return;
			case 126:
				Class453.method29291(arg1, 595951703);
				return;
			case 127:
				Class259.method26448(arg1, (byte) -101);
				return;
			case 128:
				Class294.method26964(arg1, 100057967);
				return;
			case 129:
				Class647.method33054(arg1, 1431119206);
				return;
			case 130:
				Class482.method30019(arg1, -568058279);
				return;
			case 131:
				Class714.method37207(arg1, 328718929);
				return;
			case 132:
				Class285.method26892(arg1, -1177156090);
				return;
			case 133:
				Class517.method30582(arg1, (byte) 75);
				return;
			case 134:
				Class461.method29436(arg1, 1552916013);
				return;
			case 135:
				Class147_Sub3.method23935(arg1, -118468513);
				return;
			case 136:
				Class251.method26368(arg1, -1380987821);
				return;
			case 137:
				Class354.method28087(arg1, (byte) -33);
				return;
			case 138:
				Class425.method29052(arg1, (byte) 60);
				return;
			case 139:
				Class314.method27491(arg1, 1703749069);
				return;
			case 140:
				Class80_Sub19.method14160(arg1, 759183269);
				return;
			case 141:
				Class354.method28079(arg1, -529093915);
				return;
			case 142:
				Class663.method33349(arg1, (byte) 59);
				return;
			case 143:
				Class177.method24670(arg1, -850513966);
				return;
			case 144:
				Class260.method26468(arg1, (byte) 57);
				return;
			case 145:
				Class165_Sub24.method16316(arg1, -226537497);
				return;
			case 146:
				Class147_Sub1.method13119(arg1, (byte) 119);
				return;
			case 147:
				Class133.method10408(arg1, -189506579);
				return;
			case 148:
				Class595.method31976(arg1, -1441456007);
				return;
			case 149:
				Class377.method28475(arg1, 113820706);
				return;
			case 150:
				Class251.method26370(arg1, 2000250392);
				return;
			case 151:
				Class524.method30652(arg1, -1168259004);
				return;
			case 152:
				Class165_Sub47.method16974(arg1, (byte) -92);
				return;
			case 153:
				Class376.method28458(arg1, -1962071523);
				return;
			case 154:
				Class500.method30411(arg1, 1324121103);
				return;
			case 155:
				Class676.method33590(arg1, (byte) -21);
				return;
			case 156:
				Class680.method33637(arg1, 343031549);
				return;
			case 157:
				Class41_Sub13.method17576(arg1, 1148500878);
				return;
			case 158:
				Class375.method28451(arg1, -1314613127);
				return;
			case 159:
				Class108_Sub2.method24061(arg1, (byte) 87);
				return;
			case 160:
				Class590.method31917(arg1, 576200489);
				return;
			case 161:
				Class176.method24661(arg1, -1434430108);
				return;
			case 162:
				Class654.method33169(arg1, (byte) 107);
				return;
			case 163:
				Class490.method30237(arg1, 1841258256);
				return;
			case 164:
				Class371.method28389(arg1, (byte) -74);
				return;
			case 165:
				Class372.method28404(arg1, -1624905374);
				return;
			case 166:
				Class488.method30211(arg1, -2032201213);
				return;
			case 167:
				Class92.method1880(arg1, true, (byte) -77);
				return;
			case 168:
				Class54.method1097(arg1, (byte) -54);
				return;
			case 169:
				Class211.method25818(arg1, (byte) -3);
				return;
			case 170:
				Class251.method26374(arg1, 1262920479);
				return;
			case 171:
				Class646.method33046(arg1, -1396847492);
				return;
			case 172:
				Class587.method31892(arg1, (byte) 102);
				return;
			case 173:
				Class74.method1307(arg1, -1369295054);
				return;
			case 174:
				Class503.method30450(arg1, 2094645396);
				return;
			case 175:
				Class279.method26851(arg1, (byte) -81);
				return;
			case 176:
				Class631.method32721(arg1, -1669781741);
				return;
			case 177:
				Class685.method36791(arg1, -919811598);
				return;
			case 178:
				Class111.method7795(arg1, -587717067);
				return;
			case 179:
				Class121.method9720(arg1, (byte) 70);
				return;
			case 180:
				Class317.method27514(arg1, 2109373089);
				return;
			case 181:
				Class267.method26664(arg1, -743322597);
				return;
			case 182:
				Class271.method26703(arg1, -2107976962);
				return;
			case 183:
				Class333.method27803(arg1, (byte) 102);
				return;
			case 184:
				Class183.method24698(arg1, (byte) -39);
				return;
			case 185:
				Class124_Sub1.method9833(arg1, -2147483646);
				return;
			case 186:
				Class500.method30412(arg1, 2052169690);
				return;
			case 187:
				Class586.method31880(arg1, 734328011);
				return;
			case 188:
				Class263.method26635(arg1, (byte) 19);
				return;
			case 189:
				Class629.method32557(arg1, (byte) 110);
				return;
			case 190:
				Class498.method30357(arg1, 1547850289);
				return;
			case 191:
				Class494.method30295(arg1, (byte) -64);
				return;
			case 192:
				Class16.method426(arg1, 2021162798);
				return;
			case 193:
				Class508.method30526(arg1, 622383439);
				return;
			case 194:
				Class615.method32285(arg1, (short) 512);
				return;
			case 195:
				Class659.method33282(arg1, (byte) -108);
				return;
			case 196:
				Class407.method28945(arg1, 1701473132);
				return;
			case 197:
				Class364.method28216(arg1, 1996095697);
				return;
			case 198:
				Class354.method28078(arg1, -2032987723);
				return;
			case 199:
				Class118.method8828(arg1, -746752049);
				return;
			case 200:
				Class387.method28617(arg1, (byte) -62);
				return;
			case 201:
				Class448.method29258(arg1, (byte) 0);
				return;
			case 202:
				Class80_Sub28.method22228(arg1, 1496447757);
				return;
			case 203:
				Class325.method27625(arg1, 335421548);
				return;
			case 204:
				Class317.method27515(arg1, (byte) 44);
				return;
			case 205:
				Class163.method15764(arg1, (byte) -108);
				return;
			case 206:
				Class51.method1068(arg1, 1264057760);
				return;
			case 207:
				Class253.method26381(arg1, 1896351766);
				return;
			case 208:
				Class354.method28080(arg1, 1077790461);
				return;
			case 209:
				Class98.method2705(arg1, 1174000034);
				return;
			case 210:
				Class642.method32965(arg1, true, 2082850140);
				return;
			case 211:
				Class530.method30814(arg1, 1380907824);
				return;
			case 212:
				Class107.method7194(arg1, 74556433);
				return;
			case 213:
				Class636.method32866(arg1, 336529689);
				return;
			case 214:
				Class561.method31426(arg1, (byte) 125);
				return;
			case 215:
				Class481.method30016(arg1, 188097551);
				return;
			case 216:
				Class353.method28068(arg1, 1974858302);
				return;
			case 217:
				Class420.method29007(arg1, 2010383890);
				return;
			case 218:
				Class92.method1880(arg1, false, (byte) -58);
				return;
			case 219:
				Class439.method29151(arg1, -136294398);
				return;
			case 220:
				Class293.method26956(arg1, (byte) -127);
				return;
			case 221:
				Class103_Sub15.method8227(arg1, 1978731277);
				return;
			case 222:
				Class175.method24652(arg1, 954804955);
				return;
			case 223:
				Class83.method1566(arg1, 624439254);
				return;
			case 224:
				Class480.method30003(arg1, (byte) 24);
				return;
			case 225:
				Class512.method30558(arg1, (byte) 93);
				return;
			case 226:
				Class563.method31458(arg1, (byte) 72);
				return;
			case 227:
				Class708.method37151(arg1, -589964118);
				return;
			case 228:
				Class156.method15157(arg1, 1251199556);
				return;
			case 229:
				Class286.method26898(arg1, 1135115979);
				return;
			case 230:
				RuntimeException_Sub3.method23803(arg1, -472439245);
				return;
			case 231:
				Class596.method31994(arg1, (byte) 40);
				return;
			case 232:
				Class579.method31807(arg1, (byte) 0);
				return;
			case 233:
				Class118.method8826(arg1, -933262333);
				return;
			case 234:
				Class334.method27816(arg1, (byte) 87);
				return;
			case 235:
				Class156.method15155(arg1, (byte) 11);
				return;
			case 236:
				Class345.method27957(arg1, -1451590651);
				return;
			case 237:
				Class562.method31443(arg1, -1119158362);
				return;
			case 238:
				Class694.method37022(arg1, -1273877527);
				return;
			case 239:
				Class286.method26899(arg1, (byte) -51);
				return;
			case 240:
				Class226.method25967(arg1, (byte) -20);
				return;
			case 241:
				Class544.method31182(arg1, (byte) -102);
				return;
			case 242:
				Class289.method26924(arg1, 990462502);
				return;
			case 243:
				Class256.method26415(arg1, 463263833);
				return;
			case 244:
				Class405.method28915(arg1, -1549507598);
				return;
			case 245:
				Class668.method33488(arg1, -1847521783);
				return;
			case 246:
				Class506.method30496(arg1, 2119992987);
				return;
			case 247:
				Class560.method31422(arg1, -1965466994);
				return;
			case 248:
				Class640.method32893(arg1, -498051830);
				return;
			case 249:
				Class627.method32541(arg1, 2024356989);
				return;
			case 250:
				Class492.method30269(arg1, 615694342);
				return;
			case 251:
				Class373.method28413(arg1, (byte) 14);
				return;
			case 252:
				Class123_Sub3.method10026(arg1, 2102322355);
				return;
			case 253:
				Class130.method10202(arg1, (byte) 14);
				return;
			case 254:
				Class223.method25943(arg1, (byte) -39);
				return;
			case 255:
				Class513.method30568(arg1, 562622377);
				return;
			case 256:
				Class453.method29297(arg1, -1013243217);
				return;
			case 257:
				Class176.method24664(arg1, (byte) 3);
				return;
			case 258:
				Class288.method26913(arg1, (byte) -93);
				return;
			case 259:
				Class565.method31483(arg1, 1876934952);
				return;
			case 260:
				Class333.method27805(arg1, (byte) -109);
				return;
			case 261:
				Class389.method28649(arg1, -2083287642);
				return;
			case 262:
				Class80_Sub42.method15604(arg1, -1428481148);
				return;
			case 263:
				Class601.method32102(arg1, (byte) 9);
				return;
			case 264:
				Class599.method32043(arg1, 750005279);
				return;
			case 265:
				Class615.method32286(arg1, 1209900381);
				return;
			case 266:
				Class279.method26848(arg1, 2146997518);
				return;
			case 267:
				Class571.method31735(arg1, (byte) -73);
				return;
			case 268:
				Class716.method37227(arg1, 2138068435);
				return;
			case 269:
				Class535.method30857(arg1, -1595859550);
				return;
			case 270:
				Class544.method31178(arg1, 1763379744);
				return;
			case 271:
				Class360.method28145(arg1, (byte) 54);
				return;
			case 272:
				Class389.method28651(arg1, 2029854416);
				return;
			case 273:
				Class460.method29417(arg1, -182288793);
				return;
			case 274:
				Class667.method33469(arg1, (byte) -68);
				return;
			case 275:
				Class714.method37209(arg1, (byte) 24);
				return;
			case 276:
				Class305.method27206(arg1, -1377672915);
				return;
			case 277:
				Class230.method26002(arg1, -2060438009);
				return;
			case 278:
				Class24.method585(arg1, -1876026997);
				return;
			case 279:
				Class520.method30613(arg1, (byte) -15);
				return;
			case 280:
				Class678.method33617(arg1, 1247626742);
				return;
			case 281:
				Class165_Sub7.method15957(arg1, (byte) 113);
				return;
			case 282:
				Class598.method32028(arg1, (byte) 32);
				return;
			case 283:
				Class628.method32556(arg1, -667471665);
				return;
			case 284:
				Class379.method28545(arg1, -154257886);
				return;
			case 285:
				Class112.method7806(arg1, -1238221678);
				return;
			case 286:
				Class103_Sub3.method7211(arg1, (short) -29301);
				return;
			case 287:
				Class333.method27801(arg1, (short) -2380);
				return;
			case 288:
				Class643.method33024(arg1, (byte) 40);
				return;
			case 289:
				Class286.method26900(arg1, -1992722287);
				return;
			case 290:
				Class312.method27464(arg1, (byte) 126);
				return;
			case 291:
				Class1.method22(arg1, -1240193147);
				return;
			case 292:
				Class622.method32434(arg1, 315074377);
				return;
			case 293:
				Class654.method33166(arg1, (short) 1064);
				return;
			case 294:
				Class645.method33045(arg1, 1257319850);
				return;
			case 295:
				Class125.method20586(arg1, (byte) -37);
				return;
			case 296:
				Class444.method29231(arg1, 1157332921);
				return;
			case 297:
				Class306.method27216(arg1, -1771585959);
				return;
			case 298:
				Class287.method26907(arg1, -501065249);
				return;
			case 299:
				Class696.method37041(arg1, (short) 2278);
				return;
			case 300:
				Class435.method29123(arg1, (byte) 75);
				return;
			case 301:
				Class194.method24851(arg1, 2104137820);
				return;
			case 302:
				Class353.method28072(arg1, (byte) 103);
				return;
			case 303:
				Class336.method27867(arg1, 505371730);
				return;
			case 304:
				Class605.method32152(arg1, -3028908);
				return;
			case 305:
				Class431.method29090(arg1, 574860652);
				return;
			case 306:
				Class148.method13458(arg1, -797303174);
				return;
			case 307:
				Class651.method33128(arg1, -280750383);
				return;
			case 308:
				Class143_Sub5.method11843(arg1, 1342177740);
				return;
			case 309:
				Class273.method26775(arg1, -494459899);
				return;
			case 310:
				Class256.method26416(arg1, 925757606);
				return;
			case 311:
				Class625.method32501(arg1, (byte) 2);
				return;
			case 312:
				Class649.method33117(arg1, 1582140635);
				return;
			case 313:
				Class36.method786(arg1, -437129040);
				return;
			case 314:
				Class148.method13457(arg1, 2016431307);
				return;
			case 315:
				Class570.method31721(arg1, (byte) 76);
				return;
			case 316:
				Class273.method26776(arg1, (byte) 42);
				return;
			case 317:
				Class332.method27796(arg1, 516939036);
				return;
			case 318:
				Class12.method347(arg1, 886599040);
				return;
			case 319:
				Class238.method26208(arg1, -338050166);
				return;
			case 320:
				Class143_Sub5.method11842(true, arg1, 1617301635);
				return;
			case 321:
				Class677.method33593(arg1, 423126627);
				return;
			case 322:
				Class382.method28569(arg1, (byte) 1);
				return;
			case 323:
				Class500.method30409(arg1, -106869841);
				return;
			case 324:
				Class79.method1433(arg1, (byte) -103);
				return;
			case 325:
				Class312.method27465(arg1, -1044450155);
				return;
			case 326:
				Class335.method27858(arg1, -1091545712);
				return;
			case 327:
				Class239.method26214(arg1, (byte) -62);
				return;
			case 328:
				Class124_Sub1.method9832(arg1, (byte) 4);
				return;
			case 329:
				Class167.method17875(arg1, 2141707540);
				return;
			case 330:
				Class332.method27798(arg1, (byte) -56);
				return;
			case 331:
				Class559.method31405(arg1, 1059080703);
				return;
			case 332:
				Class706.method37136(arg1, -1606803039);
				return;
			case 333:
				Class531.method30817(arg1, (byte) 60);
				return;
			case 334:
				Class303.method27113(arg1, (byte) -104);
				return;
			case 335:
				Class583.method31838(arg1, 164576663);
				return;
			case 336:
				Class330.method27769(arg1, -1820804408);
				return;
			case 337:
				Class254.method26403(arg1, -78804493);
				return;
			case 338:
				Class15.method423(arg1, (byte) 1);
				return;
			case 339:
				Class302.method27106(arg1, (byte) 59);
				return;
			case 340:
				Class477.method29906(arg1, -596151804);
				return;
			case 341:
				Class356.method28101(arg1, (byte) -94);
				return;
			case 342:
				Class273.method26777(arg1, 779807012);
				return;
			case 343:
				Class344.method27951(arg1, -435172992);
				return;
			case 344:
				Class376.method28462(arg1, -974426969);
				return;
			case 345:
				Class168.method18549(arg1, -1641294815);
				return;
			case 346:
				Class678.method33616(arg1, (byte) 89);
				return;
			case 347:
				Class714.method37206(arg1, (byte) -22);
				return;
			case 348:
				Class7.method222(arg1, (byte) -63);
				return;
			case 349:
				Class41.method17944(arg1, 393521836);
				return;
			case 350:
				Class527.method30713(arg1, 1541440477);
				return;
			case 351:
				Class655.method33218(arg1, -1316783043);
				return;
			case 352:
				Class80_Sub37.method14963(arg1, -1967430739);
				return;
			case 353:
				Class499.method30398(arg1, (byte) 4);
				return;
			case 354:
				Class635.method32819(arg1, 618704739);
				return;
			case 355:
				Class261.method26498(arg1, (short) 9573);
				return;
			case 356:
				Class586.method31879(arg1, -2005421885);
				return;
			case 357:
				Class687.method36834(arg1, -2132834878);
				return;
			case 358:
				Class585.method31853(arg1, -420073898);
				return;
			case 359:
				Class382.method28570(arg1, 65536);
				return;
			case 360:
				Class506.method30492(arg1, 2103552870);
				return;
			case 361:
				Class365.method28247(arg1, -338299037);
				return;
			case 362:
				Class218.method25873(arg1, -228127452);
				return;
			case 363:
				Class632.method32728(arg1, 2123209613);
				return;
			case 364:
				Class345.method27958(arg1, (byte) -50);
				return;
			case 365:
				Class628.method32553(arg1, 1961490345);
				return;
			case 366:
				Class143_Sub4.method11769(arg1, (byte) 5);
				return;
			case 367:
				Class686.method36802(arg1, (byte) -3);
				return;
			case 368:
				Class354.method28075(arg1, (byte) 36);
				return;
			case 369:
				Class325.method27627(arg1, (byte) 0);
				return;
			case 370:
				Class205.method24989(arg1, 322442250);
				return;
			case 371:
				Class145.method12038(arg1, (short) 5121);
				return;
			case 372:
				Class154.method14988(arg1, -1063032243);
				return;
			case 373:
				Class480.method30004(arg1, (short) 3997);
				return;
			case 374:
				Class695.method37035(arg1, (short) 20785);
				return;
			case 375:
				Class386.method28605(arg1, (byte) -110);
				return;
			case 376:
				Class322.method27604(arg1, -347058630);
				return;
			case 377:
				Class578.method31794(arg1, (byte) -74);
				return;
			case 378:
				Class8.method312(arg1, -2004078113);
				return;
			case 379:
				Class360.method28146(arg1, -1093072155);
				return;
			case 380:
				Class354.method28077(arg1, (byte) -1);
				return;
			case 381:
				Class723.method37347(arg1, 501818234);
				return;
			case 382:
				Class655.method33215(arg1, -221471862);
				return;
			case 383:
				Class208.method25011(arg1, -13278752);
				return;
			case 384:
				Class631.method32720(arg1, 1393941684);
				return;
			case 385:
				Class245.method26315(arg1, (byte) -6);
				return;
			case 386:
				Class336.method27866(arg1, (byte) 28);
				return;
			case 387:
				Class520.method30614(arg1, 1299246175);
				return;
			case 388:
				Class361.method28149(arg1, 1929978929);
				return;
			case 389:
				Class486.method30061(arg1, 1413526037);
				return;
			case 390:
				Class420.method29008(arg1, (byte) 25);
				return;
			case 391:
				Class618.method32301(arg1, (byte) 15);
				return;
			case 392:
				Class103.method19209(arg1, -2103948420);
				return;
			case 393:
				Class449.method29262(arg1, -582589068);
				return;
			case 394:
				Class500.method30410(arg1, 1818624440);
				return;
			case 395:
				Class304.method27126(arg1, 1683722550);
				return;
			case 396:
				Class21.method531(arg1, 1175814102);
				return;
			case 397:
				Class309.method27450(arg1, 1517936925);
				return;
			case 398:
				Class479.method29909(arg1, -1234138891);
				return;
			case 399:
				Class383.method28578(arg1, 1987738991);
				return;
			case 400:
				Class625.method32504(arg1, 1337765907);
				return;
			case 401:
				Class106.method18206(arg1, (byte) -10);
				return;
			case 402:
				Class116.method8760(arg1, 390059815);
				return;
			case 403:
				Class620.method32307(arg1, 1343052902);
				return;
			case 404:
				Class552.method31353(arg1, -1810269074);
				return;
			case 405:
				Class1.method23(arg1, -1902918988);
				return;
			case 406:
				Class556.method31371(arg1, (byte) 75);
				return;
			case 407:
				Class45.method17298(arg1, 73007762);
				return;
			case 408:
				Class533.method30833(arg1, -1975531694);
				return;
			case 409:
				Class650.method33123(arg1, -260722761);
				return;
			case 410:
				Class419.method28999(arg1, (byte) 12);
				return;
			case 411:
				Class405.method28911(arg1, 330492437);
				return;
			case 412:
				Class112.method7807(arg1, (short) 12512);
				return;
			case 413:
				Class365.method28248(arg1, (byte) -62);
				return;
			case 414:
				Class165_Sub17.method16168(arg1, 1120795374);
				return;
			case 415:
				Class439.method29148(arg1, 202453491);
				return;
			case 416:
				Class278.method26834(arg1, -1540230233);
				return;
			case 417:
				Class366.method28271(arg1, (short) 995);
				return;
			case 418:
				Class341.method27939(arg1, 1211703375);
				return;
			case 419:
				Class592.method31944(arg1, -1921397657);
				return;
			case 420:
				Class499.method30400(arg1, 1849830976);
				return;
			case 421:
				Class599.method32046(arg1, (byte) -15);
				return;
			case 422:
				Class476.method29897(arg1, 1414328959);
				return;
			case 423:
				Class389.method28652(arg1, -585996657);
				return;
			case 424:
				Class445.method29243(arg1, 781975081);
				return;
			case 425:
				Class490.method30240(arg1, -764132198);
				return;
			case 426:
				Class642.method32961(arg1, 285024340);
				return;
			case 427:
				Class674.method33584(arg1, -969127327);
				return;
			case 428:
				Class439.method29149(arg1, (byte) -12);
				return;
			case 429:
				Class585.method31852(arg1, (byte) -24);
				return;
			case 430:
				Class645.method33043(arg1, (byte) 29);
				return;
			case 431:
				Class653.method33144(arg1, -1652867993);
				return;
			case 432:
				Class236.method26136(arg1, 570067144);
				return;
			case 433:
				Class268.method26680(arg1, -122805532);
				return;
			case 434:
				Class543.method31175(arg1, 2755307);
				return;
			case 435:
				Class529.method30811(arg1, -1180268256);
				return;
			case 436:
				Class163_Sub1.method15772(arg1, 1007117177);
				return;
			case 437:
				Class106.method18204(arg1, (short) 255);
				return;
			case 438:
				Class512.method30560(arg1, 1223477058);
				return;
			case 439:
				Class93.method1883(arg1, -1212063842);
				return;
			case 440:
				Class539.method31035(arg1, 1953556700);
				return;
			case 441:
				Class441.method29188(arg1, (byte) -91);
				return;
			case 442:
				Class80_Sub31.method14416(arg1, 2036747717);
				return;
			case 443:
				Class253.method26382(arg1, 2040474071);
				return;
			case 444:
				Class111.method7793(arg1, 1145496288);
				return;
			case 445:
				Class494.method30293(arg1, -513924067);
				return;
			case 446:
				Class324.method27617(arg1, 605914390);
				return;
			case 447:
				Class236.method26131(arg1, 1082829146);
				return;
			case 448:
				Class130.method10201(arg1, (byte) 123);
				return;
			case 449:
				Class21.method530(arg1, -112356933);
				return;
			case 450:
				Class205.method24988(arg1, (byte) 72);
				return;
			case 451:
				Class272.method26710(arg1, 2036747717);
				return;
			case 452:
				Class203.method24973(arg1, -325748414);
				return;
			case 453:
				Class53.method1083(arg1, -1282656803);
				return;
			case 454:
				Class231.method26035(arg1, 1592396050);
				return;
			case 455:
				Class539.method31036(arg1, -443048202);
				return;
			case 456:
				Class420.method29004(arg1, 1401224354);
				return;
			case 457:
				Class611.method32219(arg1, (short) 1194);
				return;
			case 458:
				Class506.method30491(arg1, 2031832385);
				return;
			case 459:
				Class480.method30001(arg1, -167702633);
				return;
			case 460:
				Class293.method26955(arg1, 257972662);
				return;
			case 461:
				Class499.method30399(arg1, 142900759);
				return;
			case 462:
				Class620.method32306(arg1, 1566058206);
				return;
			case 463:
				Class143.method11840(arg1, -660166003);
				return;
			case 464:
				Class34.method744(arg1, -1781027933);
				return;
			case 465:
				Class567.method31524(arg1, 817709703);
				return;
			case 466:
				Class591.method31925(arg1, (short) -26729);
				return;
			case 467:
				Class642.method32962(arg1, 1889753354);
				return;
			case 468:
				Class683.method36768(arg1, (byte) 2);
				return;
			case 469:
				Class312.method27470(arg1, (byte) -102);
				return;
			case 470:
				Class188.method24827(arg1, 2048823096);
				return;
			case 471:
				Class125.method20588(arg1, -1648247929);
				return;
			case 472:
				Class492.method30270(arg1, 395777396);
				return;
			case 473:
				Class510.method30537(arg1, (byte) -31);
				return;
			case 474:
				Class714.method37212(arg1, -369163318);
				return;
			case 475:
				Class571.method31732(arg1, -1616081328);
				return;
			case 476:
				Class233.method26087(arg1, -747131781);
				return;
			case 477:
				Class511.method30549(arg1, -113587394);
				return;
			case 479:
				Class176.method24665(arg1, 2146219443);
				return;
			case 480:
				Class20.method23096(arg1, -2132102104);
				return;
			case 481:
				Class331.method27783(arg1, -2053489901);
				return;
			case 482:
				Class266.method26658(arg1, -2000353190);
				return;
			case 483:
				Class104_Sub2.method4580(arg1, (byte) -27);
				return;
			case 484:
				Class348.method27990(arg1, 2089418971);
				return;
			case 485:
				Class149.method13924(arg1, 1983339255);
				return;
			case 486:
				Class686.method36801(arg1, 483662602);
				return;
			case 487:
				Class165_Sub27.method16406(arg1, 190298615);
				return;
			case 488:
				Class384.method28590(arg1, 2036747717);
				return;
			case 489:
				Class318.method27522(arg1, 1187754661);
				return;
			case 490:
				Class450.method29277(arg1, 313156449);
				return;
			case 491:
				Class21.method533(arg1, (byte) -4);
				return;
			case 492:
				Class585.method31854(arg1, 30945591);
				return;
			case 493:
				Class129.method20281(arg1, 760260552);
				return;
			case 494:
				Class568.method31526(arg1, -1876652735);
				return;
			case 495:
				Class103_Sub11.method7905(arg1, (byte) -9);
				return;
			case 496:
				Class568.method31531(arg1, 267359898);
				return;
			case 497:
				Class359.method28142(arg1, (byte) 0);
				return;
			case 498:
				Class521.method30632(arg1, 342563880);
				return;
			case 499:
				Class208.method25012(arg1, -1072550945);
				return;
			case 500:
				Class602.method32123(arg1, (byte) 125);
				return;
			case 501:
				Class262.method26506(arg1, 1321640696);
				return;
			case 502:
				Class123.method20526(arg1, -38102914);
				return;
			case 503:
				Class238.method26205(arg1, 156203604);
				return;
			case 504:
				Class626.method32537(arg1, 601592301);
				return;
			case 505:
				Class116_Sub1.method8762(arg1, -1779540265);
				return;
			case 506:
				Class490.method30238(arg1, (byte) -8);
				return;
			case 507:
				Class129_Sub3.method10353(arg1, 592916939);
				return;
			case 508:
				Class151.method14544(arg1, -1272669087);
				return;
			case 509:
				Class262.method26510(arg1, (byte) 15);
				return;
			case 510:
				Class238.method26204(arg1, -981393340);
				return;
			case 511:
				method31368(arg1, 640731907);
				return;
			case 512:
				Class245.method26317(arg1, (byte) 75);
				return;
			case 513:
				Class681.method36702(arg1, 1865875671);
				return;
			case 514:
				Class354.method28076(arg1, 741516354);
				return;
			case 515:
				Class515.method30574(arg1, -1861416043);
				return;
			case 516:
				Class46.method954(arg1, -1417736599);
				return;
			case 517:
				Class693.method37004(arg1, 1335414028);
				return;
			case 518:
				Class453.method29292(arg1, -1082976216);
				return;
			case 519:
				Class515.method30575(arg1, (short) 255);
				return;
			case 520:
				Class236.method26132(arg1, (byte) 1);
				return;
			case 521:
				Class265.method26650(arg1, (byte) 48);
				return;
			case 522:
				Class104_Sub6.method7697(arg1, 175301049);
				return;
			case 523:
				Class376.method28460(arg1, (byte) 0);
				return;
			case 524:
				Class27.method645(arg1, 1433911656);
				return;
			case 525:
				Class108.method24051(arg1, (short) -2203);
				return;
			case 526:
				Class28.method660(arg1, 805360324);
				return;
			case 527:
				Class233.method26086(arg1, -855339131);
				return;
			case 528:
				Class308.method27441(arg1, 557985445);
				return;
			case 529:
				Class315.method27498(arg1, -878795033);
				return;
			case 530:
				Class680.method33640(arg1, 1838584060);
				return;
			case 531:
				Class441.method29183(arg1, -627485180);
				return;
			case 532:
				Class220.method25904(arg1, (byte) -65);
				return;
			case 533:
				Class51.method1064(arg1, (byte) 47);
				return;
			case 534:
				Class228.method25995(arg1, -1653401265);
				return;
			case 535:
				Class584.method31846(arg1, 977359530);
				return;
			case 536:
				Class242.method26242(arg1, -1387783497);
				return;
			case 537:
				Class251.method26369(arg1, 1955281468);
				return;
			case 538:
				Class620.method32310(arg1, (byte) -110);
				return;
			case 539:
				Class121_Sub1.method9725(arg1, 844249883);
				return;
			case 540:
				Class225.method25956(arg1, (byte) 0);
				return;
			case 541:
				Class382.method28572(arg1, (byte) 2);
				return;
			case 542:
				Class506.method30490(arg1, -1668021527);
				return;
			case 543:
				Class513.method30569(arg1, -1037608193);
				return;
			case 544:
				Class160.method15568(arg1, 672119684);
				return;
			case 545:
				Class88.method1791(arg1, (byte) 45);
				return;
			case 546:
				Class420.method29009(arg1, (byte) -66);
				return;
			case 547:
				Class167.method17878(arg1, (byte) 12);
				return;
			case 548:
				Class389.method28650(arg1, -426027065);
				return;
			case 549:
				Class353.method28069(arg1, -1453688719);
				return;
			case 550:
				Class125_Sub3.method10221(arg1, 2133333722);
				return;
			case 551:
				Class80_Sub20.method14173(arg1, -2081291975);
				return;
			case 552:
				Class663.method33348(arg1, (byte) -5);
				return;
			case 553:
				Class649.method33114(arg1, (byte) 120);
				return;
			case 554:
				Class18.method459(arg1, -1328480579);
				return;
			case 555:
				Class445.method29245(arg1, 1780658629);
				return;
			case 556:
				Class143_Sub3.method11565(arg1, 1428387572);
				return;
			case 557:
				Class509.method30531(arg1, 1933397648);
				return;
			case 558:
				Class309.method27448(arg1, -2141187873);
				return;
			case 559:
				Class174.method24634(arg1, -1465992355);
				return;
			case 560:
				Class561.method31425(arg1, -379362944);
				return;
			case 561:
				Class430.method29087(arg1, -825524012);
				return;
			case 562:
				Class123.method20524(arg1, -927416280);
				return;
			case 563:
				Class211.method25816(arg1, (byte) -84);
				return;
			case 564:
				Class693.method37003(arg1, 437232500);
				return;
			case 565:
				Class230.method26001(arg1, (byte) 1);
				return;
			case 566:
				Class344.method27952(arg1, (byte) 16);
				return;
			case 567:
				Class488.method30212(arg1, -1216954807);
				return;
			case 568:
				Class595.method31973(arg1, -856786367);
				return;
			case 569:
				Class211.method25817(arg1, (byte) 25);
				return;
			case 570:
				Class260.method26471(arg1, 1845072334);
				return;
			case 571:
				Class350.method28011(arg1, (byte) 35);
				return;
			case 572:
				Class461.method29435(arg1, -1826950879);
				return;
			case 573:
				Class332.method27795(arg1, -156985187);
				return;
			case 574:
				Class230.method26000(arg1, 1215178576);
				return;
			case 575:
				Class334.method27821(arg1, -634648903);
				return;
			case 576:
				Class719.method37288(arg1, (byte) 0);
				return;
			case 577:
				Class679.method33618(arg1, 1251369623);
				return;
			case 578:
				Class436.method29131(arg1, -707074525);
				return;
			case 579:
				Class375.method28450(arg1, 1149107773);
				return;
			case 580:
				Class269.method26683(arg1, -1218141935);
				return;
			case 581:
				Class301.method27042(arg1, (byte) -19);
				return;
			case 582:
				Class350.method28009(arg1, 1531600709);
				return;
			case 583:
				Class366.method28273(arg1, -1484699347);
				return;
			case 584:
				Class100.method2955(arg1, -2135898145);
				return;
			case 585:
				Class117.method8816(arg1, (byte) -107);
				return;
			case 586:
				Class608.method32186(arg1, -1309058682);
				return;
			case 587:
				Class490.method30241(arg1, -1542029994);
				return;
			case 588:
				Class277.method26830(arg1, -1954870845);
				return;
			case 589:
				Class284.method26888(arg1, 102580389);
				return;
			case 590:
				Class372.method28407(arg1, -1210557885);
				return;
			case 591:
				Class692.method36972(arg1, (byte) 1);
				return;
			case 592:
				Class584.method31842(arg1, -649343168);
				return;
			case 593:
				Class665.method33453(arg1, -88000123);
				return;
			case 594:
				Class508.method30529(arg1, (byte) 111);
				return;
			case 595:
				Class611.method32218(arg1, -569031);
				return;
			case 596:
				Class504.method30460(arg1, 2098084202);
				return;
			case 597:
				Class275.method26804(arg1, 2036747717);
				return;
			case 598:
				Class122_Sub2.method10325(arg1, (byte) 68);
				return;
			case 599:
				Class117.method8815(arg1, 2036747717);
				return;
			case 600:
				Class194.method24854(arg1, 1303846993);
				return;
			case 601:
				Class25.method595(arg1, -2087229462);
				return;
			case 602:
				Class593.method31946(arg1, -1135819345);
				return;
			case 603:
				Class349.method28001(arg1, 1215310526);
				return;
			case 604:
				Class653.method33142(arg1, -113798906);
				return;
			case 605:
				Class351.method28018(arg1, -1381690150);
				return;
			case 606:
				Class284.method26886(arg1, 2144573767);
				return;
			case 607:
				Class229.method25999(arg1, -929690978);
				return;
			case 608:
				Class289.method26923(arg1, 1018999754);
				return;
			case 609:
				Class175.method24650(arg1, -1474235005);
				return;
			case 610:
				Class80_Sub28_Sub4.method21863(arg1, -1479987305);
				return;
			case 611:
				Class558.method31403(arg1, -605039303);
				return;
			case 612:
				Class367.method28288(arg1, (byte) -42);
				return;
			case 613:
				Class498.method30354(arg1, -1036089739);
				return;
			case 614:
				Class119_Sub1.method8898(arg1, (byte) 1);
				return;
			case 615:
				Class236.method26130(arg1, (short) 128);
				return;
			case 616:
				Class639.method32884(arg1, 511226876);
				return;
			case 617:
				Class165_Sub16.method16147(arg1, -2000204835);
				return;
			case 618:
				Class76.method1364(arg1, 1700563122);
				return;
			case 619:
				Class107.method7192(arg1, 744287788);
				return;
			case 620:
				Class531.method30816(arg1, -624975318);
				return;
			case 621:
				Class568.method31529(arg1, 1189911429);
				return;
			case 622:
				Class492.method30271(arg1, 1682311043);
				return;
			case 623:
				Class464.method29621(arg1, (byte) 31);
				return;
			case 624:
				Class257.method26426(false, arg1, (byte) 0);
				return;
			case 625:
				Class610.method32206(arg1, (byte) -64);
				return;
			case 626:
				Class57.method1164(arg1, (byte) 124);
				return;
			case 627:
				Class203.method24974(arg1, 1558547958);
				return;
			case 628:
				Class144.method11994(arg1, (short) -11751);
				return;
			case 629:
				Class443.method29210(arg1, -1006418834);
				return;
			case 630:
				Class435.method29126(arg1, (short) -29721);
				return;
			case 631:
				Class275.method26803(arg1, (byte) -127);
				return;
			case 632:
				Class263.method26631(arg1, 2117646128);
				return;
			case 633:
				Class380.method28558(arg1, (byte) 2);
				return;
			case 634:
				Class108_Sub1.method23911(arg1, (short) 895);
				return;
			case 635:
				Class230.method26003(arg1, 730627588);
				return;
			case 636:
				Class115_Sub1.method8672(arg1, (byte) 1);
				return;
			case 637:
				Class92.method1879(arg1, (short) -17805);
				return;
			case 638:
				Class86.method1701(arg1, -475484234);
				return;
			case 639:
				Class275.method26802(arg1, 1170953582);
				return;
			case 640:
				Class7.method221(arg1, -1918091225);
				return;
			case 641:
				ByteArrayPool.method37095(arg1, (byte) 3);
				return;
			case 642:
				Class566.method31504(arg1, 1225287224);
				return;
			case 643:
				Class714.method37205(arg1, 1271278558);
				return;
			case 644:
				Class331.method27785(arg1, 2090555409);
				return;
			case 645:
				Class614.method32272(arg1, 717795234);
				return;
			case 646:
				Class313.method27481(arg1, -2076631505);
				return;
			case 647:
				Class379.method28544(arg1, -308915159);
				return;
			case 648:
				Class169.method21688(arg1, (byte) -27);
				return;
			case 649:
				Class433.method29109(arg1, 305655657);
				return;
			case 650:
				Class719.method37294(arg1, 2109126269);
				return;
			case 651:
				Class154.method14989(arg1, (byte) -7);
				return;
			case 652:
				Class536.method30877(arg1, 1360519479);
				return;
			case 653:
				Class493.method30274(arg1, 335176021);
				return;
			case 654:
				Class176.method24659(arg1, 836147518);
				return;
			case 655:
				Class241.method26231(arg1, -2098068751);
				return;
			case 656:
				Class479.method29910(arg1, 959604809);
				return;
			case 657:
				Class666.method33457(arg1, -1673570895);
				return;
			case 658:
				Class540.method31059(arg1, -1404715546);
				return;
			case 659:
				Class263.method26637(arg1, -1727868692);
				return;
			case 660:
				Class625.method32503(arg1, -1560188513);
				return;
			case 661:
				Class80_Sub22.method21674(arg1, (byte) -33);
				return;
			case 662:
				Class107.method7193(arg1, (byte) -31);
				return;
			case 663:
				Class7.method223(arg1, -2038259160);
				return;
			case 664:
				Class152_Sub1.method14637(arg1, (byte) 114);
				return;
			case 665:
				Class350.method28008(arg1, true, false, (byte) 18);
				return;
			case 666:
				Class97.method2116(arg1, -190588007);
				return;
			case 667:
				Class486.method30064(arg1, 65280);
				return;
			case 668:
				Class289.method26926(arg1, (byte) -33);
				return;
			case 669:
				Class165_Sub16.method16148(arg1, (short) 25535);
				return;
			case 670:
				Class671.method33520(arg1, (byte) 11);
				return;
			case 671:
				Class449.method29267(arg1, 1612041685);
				return;
			case 672:
				Class510.method30538(arg1, (byte) 30);
				return;
			case 673:
				Class618.method32295(arg1, 1683157013);
				return;
			case 674:
				Class670.method33509(arg1, (byte) -18);
				return;
			case 675:
				Class149.method13923(arg1, (short) -1787);
				return;
			case 676:
				Class354.method28086(arg1, 695936521);
				return;
			case 677:
				Class358.method28128(arg1, (byte) 36);
				return;
			case 678:
				Class591.method31926(arg1, 1406942792);
				return;
			case 679:
				Class103_Sub13.method7941(arg1, (byte) 22);
				return;
			case 680:
				Class303.method27115(arg1, 1686910297);
				return;
			case 681:
				Class719.method37292(arg1, (short) 1410);
				return;
			case 682:
				Class233.method26089(arg1, 26543103);
				return;
			case 683:
				Class628.method32552(arg1, -2062950135);
				return;
			case 684:
				Class245.method26316(arg1, 2026033514);
				return;
			case 685:
				Class285.method26893(arg1, (byte) 0);
				return;
			case 686:
				Class391.method28672(arg1, -1828689502);
				return;
			case 687:
				Class80_Sub40.method23439(arg1, (byte) -25);
				return;
			case 688:
				Class389.method28653(arg1, (byte) 13);
				return;
			case 689:
				Class270.method26693(arg1, -470926957);
				return;
			case 690:
				Class358.method28125(arg1, -1115923546);
				return;
			case 691:
				Class300.method27031(arg1, 1851484009);
				return;
			case 692:
				Class103_Sub12.method7924(arg1, 2133165350);
				return;
			case 693:
				Class717.method37238(arg1, (byte) -3);
				return;
			case 694:
				Class145.method12034(arg1, 123625501);
				return;
			case 695:
				Class501.method30422(arg1, (byte) 67);
				return;
			case 696:
				Class294.method26962(arg1, (byte) -30);
				return;
			case 697:
				Class252.method26375(arg1, 1644113809);
				return;
			case 698:
				Class469.method29740(arg1, -598714218);
				return;
			case 699:
				Class405.method28910(arg1, 26158322);
				return;
			case 700:
				Class440.method29166(arg1, 1406996954);
				return;
			case 701:
				Class129.method20282(arg1, -2045653499);
				return;
			case 702:
				Class227.method25984(arg1, -1960818398);
				return;
			case 703:
				Class265.method26648(arg1, -1760099292);
				return;
			case 704:
				Class440.method29169(arg1, 1711297653);
				return;
			case 705:
				Class544.method31177(arg1, (byte) -102);
				return;
			case 706:
				Class53.method1088(arg1, (byte) 26);
				return;
			case 707:
				Class614.method32268(arg1, (byte) 3);
				return;
			case 708:
				Class671.method33519(arg1, 1922983257);
				return;
			case 709:
				Class254.method26401(arg1, (byte) 0);
				return;
			case 710:
				Class376.method28461(arg1, 1166703946);
				return;
			case 711:
				Class341.method27938(arg1, 2015811112);
				return;
			case 712:
				Class661.method33318(arg1, 1014272891);
				return;
			case 713:
				Class679.method33619(arg1, -92732715);
				return;
			case 714:
				Class427.method29054(arg1, -243795975);
				return;
			case 715:
				Class108.method24049(arg1, 1667140394);
				return;
			case 716:
				Class372.method28405(arg1, 412526145);
				return;
			case 717:
				Class168.method18550(arg1, 1151146337);
				return;
			case 718:
				Class143.method11836(arg1, 247089085);
				return;
			case 719:
				Class133.method10405(arg1, (short) -15054);
				return;
			case 720:
				Class93.method1884(arg1, 1785517884);
				return;
			case 721:
				Class367.method28285(arg1, (byte) 1);
				return;
			case 722:
				Class613.method32263(arg1, 946101315);
				return;
			case 723:
				Class98_Sub2.method2143(arg1, 1559294228);
				return;
			case 724:
				Class145.method12035(arg1, -525387643);
				return;
			case 725:
				Class203.method24972(arg1, -690455282);
				return;
			case 726:
				Class625.method32506(arg1, -2134598802);
				return;
			case 727:
				Class541.method31168(arg1, (byte) -3);
				return;
			case 728:
				Class238.method26203(arg1, 1701101416);
				return;
			case 729:
				Class654.method33168(arg1, 1594289748);
				return;
			case 730:
				Class147_Sub5.method13541(arg1, (byte) -8);
				return;
			case 731:
				Class606.method32160(arg1, (byte) -51);
				return;
			case 732:
				Class333.method27802(arg1, 806284006);
				return;
			case 733:
				Class512.method30563(arg1, 1422525796);
				return;
			case 734:
				Class595.method31977(arg1, (short) 1008);
				return;
			case 735:
				Class569.method31535(arg1, 549509359);
				return;
			case 736:
				Class53.method1091(arg1, (byte) -62);
				return;
			case 737:
				Class107_Sub1.method5712(arg1, -563792339);
				return;
			case 738:
				Class365.method28249(arg1, 2030892519);
				return;
			case 739:
				Class629.method32558(arg1, 1517356037);
				return;
			case 740:
				Class564.method31473(arg1, (byte) -81);
				return;
			case 741:
				Class263.method26632(arg1, 2101607060);
				return;
			case 742:
				Class267.method26662(arg1, -1836495456);
				return;
			case 743:
				Class268.method26681(arg1, (byte) 19);
				return;
			case 744:
				Class587.method31891(arg1, 1137480196);
				return;
			case 745:
				Class312.method27469(arg1, 860834725);
				return;
			case 746:
				Class177.method24669(arg1, (byte) 85);
				return;
			case 747:
				Class445.method29246(arg1, -525412479);
				return;
			case 748:
				Class87.method1702(arg1, 17944161);
				return;
			case 749:
				Class607.method32180(arg1, -881473138);
				return;
			case 750:
				Class696.method37037(arg1, -1210418336);
				return;
			case 751:
				Class103.method19208(arg1, (byte) 0);
				return;
			case 752:
				Class328.method27722(arg1, 1934350679);
				return;
			case 753:
				Class224.method25947(arg1, -1522305751);
				return;
			case 754:
				Class324.method27615(arg1, -2141788785);
				return;
			case 755:
				Class612.method32227(arg1, 1402226876);
				return;
			case 756:
				Class225.method25959(arg1, (byte) 0);
				return;
			case 757:
				Class664.method33360(arg1, 1648567698);
				return;
			case 758:
				Class252.method26376(arg1, (short) -20427);
				return;
			case 759:
				Class692.method36976(arg1, -556529988);
				return;
			case 760:
				Class567.method31520(arg1, (byte) 5);
				return;
			case 761:
				Class130.method10198(arg1, 16711680);
				return;
			case 762:
				Class61.method1189(arg1, -1278775209);
				return;
			case 763:
				Class147.method23928(arg1, (byte) 109);
				return;
			case 764:
				Class354.method28083(arg1, (byte) -34);
				return;
			case 765:
				Class449.method29264(arg1, 1734859723);
				return;
			case 766:
				Class494.method30294(arg1, (byte) 29);
				return;
			case 767:
				Class597.method32019(arg1, 1896589581);
				return;
			case 768:
				Class263.method26638(arg1, -1890958703);
				return;
			case 769:
				Class265.method26649(arg1, -240108400);
				return;
			case 770:
				Class127_Sub1.method9904(arg1, (byte) 113);
				return;
			case 771:
				Class670.method33510(arg1, (byte) -66);
				return;
			case 772:
				Class340.method27906(arg1, (byte) 4);
				return;
			case 773:
				Class270.method26692(arg1, 1402938625);
				return;
			case 774:
				Class501.method30424(arg1, -969794559);
				return;
			case 775:
				Class218.method25874(arg1, 1962322215);
				return;
			case 776:
				Class407.method28946(arg1, 1810836716);
				return;
			case 777:
				Class540.method31058(arg1, 205353101);
				return;
			case 778:
				Class541.method31169(arg1, (byte) -52);
				return;
			case 779:
				Class434.method29114(arg1, -313684266);
				return;
			case 780:
				Class567.method31523(arg1, (byte) 100);
				return;
			case 781:
				Class238.method26207(arg1, (byte) 88);
				return;
			case 782:
				Class625.method32500(arg1, (byte) 46);
				return;
			case 783:
				Class138.method11535(arg1, -2060544470);
				return;
			case 784:
				Class506.method30493(arg1, 506180010);
				return;
			case 785:
				Class694.method37024(arg1, (short) 26415);
				return;
			case 786:
				Class407.method28947(arg1, (byte) 87);
				return;
			case 787:
				Class164.method15805(arg1, (byte) -10);
				return;
			case 788:
				Class498.method30358(arg1, (byte) 73);
				return;
			case 789:
				Class333.method27804(arg1, (byte) 1);
				return;
			case 790:
				Class482.method30022(arg1, 1524637427);
				return;
			case 791:
				Class693.method37002(arg1, 788211035);
				return;
			case 792:
				Class705.method37129(arg1, 471936051);
				return;
			case 793:
				Class625.method32502(arg1, -627016264);
				return;
			case 794:
				Class2_Sub1.method1839(arg1, (byte) 0);
				return;
			case 795:
				Class607.method32177(arg1, (byte) 8);
				return;
			case 796:
				Class330.method27770(arg1, 1762327936);
				return;
			case 797:
				Class337.method27876(arg1, -1809689888);
				return;
			case 798:
				Class325.method27626(arg1, 1753871803);
				return;
			case 799:
				Class628.method32554(arg1, 528946395);
				return;
			case 800:
				Class453.method29293(arg1, -714138945);
				return;
			case 801:
				Class505.method30466(arg1, 2105196004);
				return;
			case 802:
				Class557.method31378(arg1, -1457847601);
				return;
			case 803:
				Class690.method36958(arg1, 1602057400);
				return;
			case 804:
				Class696.method37039(arg1, 1896589581);
				return;
			case 805:
				Class98.method2708(arg1, 317588995);
				return;
			case 806:
				Class365.method28246(arg1, (byte) 0);
				return;
			case 807:
				Class492.method30268(arg1, (short) 18236);
				return;
			case 808:
				Class176.method24657(arg1, -1210740990);
				return;
			case 809:
				Class689.method36954(arg1, -1352949785);
				return;
			case 810:
				Class262.method26509(arg1, 290126575);
				return;
			case 811:
				Class629.method32559(arg1, 1699970287);
				return;
			case 812:
				Class262.method26508(arg1, 1181935009);
				return;
			case 813:
				Class716.method37230(arg1, (byte) -71);
				return;
			case 814:
				Class544.method31180(arg1, (byte) -4);
				return;
			case 815:
				Class435.method29124(arg1, (byte) -4);
				return;
			case 816:
				Class618.method32294(arg1, 1452232292);
				return;
			case 817:
				Class78.method1376(arg1, 1878252735);
				return;
			case 818:
				Class308.method27440(arg1, 404486686);
				return;
			case 819:
				Class364.method28218(arg1, -1795109724);
				return;
			case 820:
				Class147_Sub5.method13539(arg1, 1896589581);
				return;
			case 821:
				Class218.method25877(arg1, -1951356049);
				return;
			case 822:
				Class324.method27618(arg1, 600823840);
				return;
			case 823:
				Class569.method31534(arg1, (byte) -113);
				return;
			case 824:
				Class625.method32499(arg1, -1630512034);
				return;
			case 825:
				Class346.method27972(arg1, -573360415);
				return;
			case 826:
				Class669.method33498(arg1, -493694938);
				return;
			case 827:
				Class131_Sub1_Sub1.method20207(arg1, -749539381);
				return;
			case 828:
				Class501.method30421(arg1, (byte) -72);
				return;
			case 829:
				Class322.method27605(arg1, 511988748);
				return;
			case 830:
				Class635.method32818(arg1, (byte) 24);
				return;
			case 831:
				Class343.method27945(arg1, 746880184);
				return;
			case 832:
				Class367.method28287(arg1, (byte) -44);
				return;
			case 833:
				Class80_Sub27.method14334(arg1, (short) 32767);
				return;
			case 834:
				Class171.method23504(arg1, 842302586);
				return;
			case 835:
				Class218.method25876(arg1, (byte) -95);
				return;
			case 836:
				Class594.method31957(arg1, 2009806220);
				return;
			case 837:
				Class670.method33512(arg1, 1230361835);
				return;
			case 838:
				Class292.method26946(arg1, -433995320);
				return;
			case 839:
				Class120_Sub1_Sub3_Sub2.method13851(arg1, 1896589581);
				return;
			case 840:
				Class205.method24985(arg1, -1952383137);
				return;
			case 841:
				method31365(arg1, 985935384);
				return;
			case 842:
				Class669.method33493(arg1, (byte) -21);
				return;
			case 843:
				Class378.method28539(arg1, (byte) -46);
				return;
			case 844:
				Class708.method37148(arg1, -1330166181);
				return;
			case 845:
				Class162.method15796(arg1, -117921098);
				return;
			case 846:
				Class660.method33291(arg1, -723548897);
				return;
			case 847:
				Class143.method11834(arg1, -2070619997);
				return;
			case 848:
				Class371.method28390(arg1, (short) -812);
				return;
			case 849:
				Class617.method32291(arg1, -827086666);
				return;
			case 850:
				Class374.method28435(arg1, -201294229);
				return;
			case 851:
				Class528.method30717(arg1, (short) -11916);
				return;
			case 852:
				Class133.method10406(arg1, 633653332);
				return;
			case 853:
				Class668.method33491(arg1, 1036242005);
				return;
			case 854:
				Class501.method30423(arg1, 2108258609);
				return;
			case 855:
				Class312.method27466(arg1, -542145915);
				return;
			case 856:
				Class719.method37289(arg1, 1231004582);
				return;
			case 857:
				Class68.method1247(arg1, -824075339);
				return;
			case 858:
				Class386.method28606(arg1, (byte) 62);
				return;
			case 859:
				Class689.method36957(arg1, -1760587387);
				return;
			case 860:
				Class644.method33034(arg1, (short) 22419);
				return;
			case 861:
				Class446.method29252(arg1, 2132042295);
				return;
			case 862:
				Class162.method15797(arg1, -660895735);
				return;
			case 863:
				Class602.method32122(arg1, (byte) 81);
				return;
			case 864:
				Class449.method29266(arg1, (short) -9605);
				return;
			case 865:
				Class503.method30452(arg1, 248089609);
				return;
			case 866:
				Class493.method30275(arg1, -752322200);
				return;
			case 867:
				Class317.method27513(arg1, -476518954);
				return;
			case 868:
				Class267.method26663(arg1, 1994758437);
				return;
			case 869:
				Class70.method1257(arg1, -1816371761);
				return;
			case 870:
				Class626.method32533(arg1, 57177169);
				return;
			case 871:
				Class535.method30853(arg1, -635169323);
				return;
			case 872:
				Class147_Sub3.method23936(arg1, -587892460);
				return;
			case 873:
				Class303.method27112(arg1, -904619933);
				return;
			case 874:
				Class283.method26878(arg1, 1064571879);
				return;
			case 875:
				Class391.method28676(arg1, -984370045);
				return;
			case 876:
				Class578.method31797(arg1, 285036365);
				return;
			case 877:
				Class2_Sub1.method1837(arg1, -582905716);
				return;
			case 878:
				Class134.method10451(arg1, (byte) -29);
				return;
			case 879:
				Class303.method27117(arg1, (byte) 3);
				return;
			case 880:
				Class710.method37160(arg1, -1389241849);
				return;
			case 881:
				Class141.method10905(arg1, 928592693);
				return;
			case 882:
				Class115.method8668(arg1, -1708827761);
				return;
			case 883:
				Class668.method33487(arg1, 1964045915);
				return;
			case 884:
				Class171.method23503(arg1, -1371500210);
				return;
			case 885:
				Class557.method31379(arg1, -1382055439);
				return;
			case 886:
				Class296.method26997(arg1, -1588067124);
				return;
			case 887:
				Class618.method32298(arg1, 1518543095);
				return;
			case 888:
				Class435.method29125(arg1, (byte) -26);
				return;
			case 889:
				Class354.method28085(arg1, (byte) 0);
				return;
			case 890:
				Class103_Sub23.method8702(arg1, -1886398117);
				return;
			case 891:
				Class613.method32262(arg1, 171501664);
				return;
			case 892:
				Class359.method28141(arg1, -1177292427);
				return;
			case 893:
				Class222.method25922(arg1, -1559380117);
				return;
			case 894:
				Class314.method27492(arg1, 132573545);
				return;
			case 895:
				Class370.method28377(arg1, -1826714869);
				return;
			case 896:
				Class80_Sub30.method14391(arg1, -2023184157);
				return;
			case 897:
				Class75.method1342(arg1, 1859750517);
				return;
			case 898:
				Class433.method29107(arg1, -881881636);
				return;
			case 899:
				Class45_Sub1.method17304(arg1, (short) 2975);
				return;
			case 900:
				Class78.method1374(arg1, 840067243);
				return;
			case 901:
				Class188.method24828(arg1, -2094295956);
				return;
			case 902:
				Class612.method32228(arg1, (byte) 0);
				return;
			case 903:
				Class133.method10407(arg1, (byte) 60);
				return;
			case 904:
				Class56.method1139(arg1, 991717016);
				return;
			case 905:
				Class347.method27981(arg1, 1373659437);
				return;
			case 906:
				Class441.method29185(arg1, 879865787);
				return;
			case 907:
				Class111.method7794(arg1, 1966130762);
				return;
			case 908:
				Class36.method784(arg1, -1652673706);
				return;
			case 909:
				Class350.method28008(arg1, false, false, (byte) 17);
				return;
			case 910:
				Class384.method28591(arg1, (byte) 9);
				return;
			case 911:
				Class39.method825(arg1, -330913556);
				return;
			case 912:
				Class632.method32726(arg1, (byte) 32);
				return;
			case 913:
				Class386.method28607(arg1, -1171839954);
				return;
			case 914:
				Class51.method1067(arg1, (byte) -111);
				return;
			case 915:
				Class579.method31805(arg1, 1306239133);
				return;
			case 916:
				Class112.method7805(arg1, (byte) 0);
				return;
			case 917:
				Class644.method33033(arg1, -1813074831);
				return;
			case 918:
				Class405.method28912(arg1, 1290504675);
				return;
			case 919:
				Class723.method37346(arg1, (byte) 2);
				return;
			case 920:
				Class225.method25957(arg1, (short) -29114);
				return;
			case 921:
				Class369.method28338(arg1, (byte) -69);
				return;
			case 922:
				Class721.method37335(arg1, -331043836);
				return;
			case 923:
				Class611.method32217(arg1, (byte) -30);
				return;
			case 924:
				Class235.method26125(arg1, (byte) 1);
				return;
			case 925:
				Class80_Sub28_Sub4.method21864(arg1, (byte) -101);
				return;
			case 926:
				Class156.method15156(arg1, 208302850);
				return;
			case 927:
				Class351.method28021(arg1, 1033447000);
				return;
			case 928:
				Class169.method21689(arg1, (short) 12288);
				return;
			case 929:
				Class654.method33165(arg1, -1749056917);
				return;
			case 930:
				Class291.method26938(arg1, (byte) -40);
				return;
			case 931:
				Class636.method32863(arg1, 363014024);
				return;
			case 932:
				Class143_Sub3.method11564(arg1, (byte) 52);
				return;
			case 933:
				Class557.method31380(arg1, -1459311108);
				return;
			case 934:
				Class283.method26876(arg1, -2093195524);
				return;
			case 935:
				Class51.method1066(arg1, -1021022876);
				return;
			case 936:
				Class599.method32048(arg1, (byte) 0);
				return;
			case 937:
				Class502.method30445(arg1, -1877613516);
				return;
			case 938:
				Class585.method31851(arg1, 2077541009);
				return;
			case 939:
				Class507.method30513(arg1, -588971927);
				return;
			case 940:
				Class715.method37217(arg1, (short) 21127);
				return;
			case 941:
				Class358.method28126(arg1, 1896589581);
				return;
			case 942:
				Class113.method8378(arg1, (byte) 124);
				return;
			case 943:
				Class626.method32534(arg1, -405805202);
				return;
			case 944:
				Class309.method27452(arg1, 2145545445);
				return;
			case 945:
				Class188.method24826(arg1, (short) 4244);
				return;
			case 946:
				Class104_Sub6.method7694(arg1, -1581019278);
				return;
			case 947:
				Class119_Sub1.method8901(arg1, -1292539388);
				return;
			case 948:
				Class510.method30540(arg1, 201228069);
				return;
			case 949:
				Class75.method1341(arg1, (byte) 0);
				return;
			case 950:
				Class561.method31427(arg1, -167923805);
				return;
			case 951:
				Class562.method31442(arg1, 118710824);
				return;
			case 952:
				Class284.method26885(arg1, (byte) 59);
				return;
			case 953:
				Class559.method31407(arg1, -896017425);
				return;
			case 954:
				Class118.method8827(arg1, 1244479855);
				return;
			case 955:
				Class697.method37047(arg1, 1249773691);
				return;
			case 956:
				Class288.method26914(arg1, (byte) -39);
				return;
			case 957:
				Class538.method30882(arg1, -1235922097);
				return;
			case 958:
				Class144.method11996(arg1, 390296245);
				return;
			case 959:
				Class649.method33111(arg1, 1905599562);
				return;
			case 960:
				Class227.method25982(arg1, 1896589581);
				return;
			case 961:
				Class346.method27974(arg1, 1994152530);
				return;
			case 962:
				method31367(arg1, 927680283);
				return;
			case 963:
				Class679.method33620(arg1, 2140969229);
				return;
			case 964:
				Class655.method33216(arg1, 16711935);
				return;
			case 965:
				Class433.method29106(arg1, 217355987);
				return;
			case 966:
				Class145.method12036(arg1, -19981589);
				return;
			case 967:
				Class260.method26472(arg1, -1843447268);
				return;
			case 968:
				Class66.method1239(arg1, -313853908);
				return;
			case 969:
				Class282.method26871(arg1, (byte) 28);
				return;
			case 970:
				Class235.method26126(arg1, 1308921252);
				return;
			case 971:
				method31370(arg1, 1092974361);
				return;
			case 972:
				Class283.method26877(arg1, 2065070649);
				return;
			case 973:
				Class278.method26833(arg1, -1353846425);
				return;
			case 974:
				Class716.method37231(arg1, (byte) 125);
				return;
			case 975:
				Class584.method31841(arg1, (short) 23397);
				return;
			case 976:
				Class125.method20587(arg1, 1181327359);
				return;
			case 977:
				Class59.method1178(arg1, -1391208315);
				return;
			case 978:
				Class623.method32441(arg1, -1772780306);
				return;
			case 979:
				Class227.method25983(arg1, -1798895042);
				return;
			case 980:
				Class464.method29619(arg1, -1134027609);
				return;
			case 981:
				Class436.method29133(arg1, (short) 9241);
				return;
			case 982:
				Class639.method32882(arg1, (byte) -91);
				return;
			case 983:
				Class478.method29907(arg1, -1795708868);
				return;
			case 984:
				Class80_Sub1_Sub1.method1492(arg1, -2130923103);
				return;
			case 985:
				Class642.method32965(arg1, false, 1769190356);
				return;
			case 986:
				Class205.method24986(arg1, -407178877);
				return;
			case 987:
				Class486.method30062(arg1, (byte) 12);
				return;
			case 988:
				Class101.method2982(arg1, (byte) 0);
				return;
			case 989:
				Class390.method28667(arg1, (byte) 27);
				return;
			case 990:
				Class659.method33284(arg1, (byte) 114);
				return;
			case 991:
				Class360.method28147(arg1, (byte) 56);
				return;
			case 992:
				Class104_Sub6.method7695(arg1, 1854467669);
				return;
			case 993:
				Class413.method28990(arg1, (byte) 1);
				return;
			case 994:
				Class262.method26507(arg1, 840477902);
				return;
			case 995:
				Class289.method26922(arg1, -1103166279);
				return;
			case 996:
				Class506.method30494(arg1, 956125440);
				return;
			case 997:
				Class567.method31518(arg1, -1907984471);
				return;
			case 998:
				Class669.method33492(arg1, -1873539572);
				return;
			case 999:
				Class697.method37057(arg1, -1933594716);
				return;
			case 1000:
				Class592.method31945(arg1, -662762653);
				return;
			case 1001:
				Class103_Sub6.method7834(arg1, -701810925);
				return;
			case 1002:
				Class282.method26872(arg1, (short) 8093);
				return;
			case 1003:
				Class494.method30292(arg1, 2123258122);
				return;
			case 1004:
				Class222.method25924(arg1, 1562861633);
				return;
			case 1005:
				Class542.method31174(arg1, -341756324);
				return;
			case 1006:
				Class712.method37180(arg1, (byte) -40);
				return;
			case 1007:
				Class392.method28681(arg1, (byte) 10);
				return;
			case 1008:
				Class598.method32027(arg1, 792475926);
				return;
			case 1009:
				Class719.method37293(arg1, 1373281967);
				return;
			case 1010:
				Class627.method32542(arg1, 2005106709);
				return;
			case 1011:
				Class682.method36704(arg1, -691205466);
				return;
			case 1012:
				Class508.method30525(arg1, 1996000583);
				return;
			case 1013:
				Class584.method31844(arg1, 1896589581);
				return;
			case 1014:
				Class115.method8667(arg1, -1962964746);
				return;
			case 1015:
				Class116.method8757(arg1, -1014628894);
				return;
			case 1016:
				Class31.method682(arg1, 2079841151);
				return;
			case 1017:
				Class176.method24658(arg1, (byte) 106);
				return;
			case 1018:
				Class323.method27609(arg1, 1760715827);
				return;
			case 1019:
				Class56.method1141(arg1, -1172012384);
				return;
			case 1020:
				Class51.method1065(arg1, (byte) 48);
				return;
			case 1021:
				Class370.method28378(arg1, 236870042);
				return;
			case 1022:
				Class67.method1241(arg1, 1682209477);
				return;
			case 1023:
				Class519.method30608(arg1, (byte) -26);
				return;
			case 1024:
				Class176.method24662(arg1, 1916795910);
				return;
			case 1025:
				Class367.method28284(arg1, 278400140);
				return;
			case 1026:
				Class211.method25819(arg1, 1548158278);
				return;
			case 1027:
				Class245.method26318(arg1, (byte) 22);
				return;
			case 1028:
				Class233.method26088(arg1, -1659903947);
				return;
			case 1029:
				Class606.method32159(arg1, 689343447);
				return;
			case 1030:
				Class143_Sub4.method11770(arg1, (byte) 124);
				return;
			case 1031:
				Class419.method29000(arg1, 1729706942);
				return;
			case 1032:
				Class236.method26129(arg1, (byte) 11);
				return;
			case 1033:
				Class86.method1698(arg1, 1626900225);
				return;
			case 1034:
				Class224.method25946(arg1, -1820203927);
				return;
			case 1035:
				Class80_Sub34.method14506(arg1, (byte) -54);
				return;
			case 1036:
				Class1.method24(arg1, -657802493);
				return;
			case 1037:
				Class132.method10373(arg1, (byte) -92);
				return;
			case 1038:
				Class294.method26965(arg1, (byte) 0);
				return;
			case 1039:
				Class558.method31401(arg1, (byte) -66);
				return;
			case 1040:
				Class208.method25009(arg1, -1067537501);
				return;
			case 1041:
				Class587.method31894(arg1, 68691701);
				return;
			case 1042:
				Class490.method30236(arg1, 507640853);
				return;
			case 1043:
				Class331.method27787(arg1, (byte) 31);
				return;
			case 1044:
				Class165_Sub28.method16426(arg1, (byte) 29);
				return;
			case 1045:
				Class454.method29304(arg1, -858345597);
				return;
			case 1046:
				Class165_Sub20.method16229(arg1, 1427919574);
				return;
			case 1047:
				Class225.method25960(arg1, 2107754867);
				return;
			case 1048:
				Class432.method29094(arg1, (byte) 1);
				return;
			case 1049:
				Class611.method32216(arg1, (byte) -37);
				return;
			case 1050:
				Class366.method28274(arg1, -679313156);
				return;
			case 1051:
				Class491.method30256(arg1, -2068348574);
				return;
			case 1052:
				Class619.method32303(arg1, (byte) -79);
				return;
			case 1053:
				Class700.method37082(arg1, (byte) 8);
				return;
			case 1054:
				Class254.method26402(arg1, -130302719);
				return;
			case 1055:
				Class318.method27524(arg1, 2028201306);
				return;
			case 1056:
				Class719.method37290(arg1, 2022323788);
				return;
			case 1057:
				Class624.method32445(arg1, (byte) 13);
				return;
			case 1058:
				Class303.method27116(arg1, -2024208993);
				return;
			case 1059:
				Class127_Sub1.method9903(arg1, 225770517);
				return;
			case 1060:
				Class183.method24700(arg1, 1955936461);
				return;
			case 1061:
				Class560.method31424(arg1, (byte) 105);
				return;
			case 1063:
				Class113.method8383(arg1, -156143629);
				return;
			case 1064:
				Class129.method20283(arg1, 1893131078);
				return;
			case 1065:
				Class41_Sub15.method17719(arg1, (byte) 72);
				return;
			case 1066:
				Class670.method33514(arg1, -543635989);
				return;
			case 1067:
				Class269.method26685(arg1, 2122396959);
				return;
			case 1068:
				Class567.method31517(arg1, (byte) -39);
				return;
			case 1069:
				Class517.method30580(arg1, 1779193776);
				return;
			case 1070:
				Class503.method30448(arg1, 777252294);
				return;
			case 1071:
				Class345.method27955(arg1, 1729660258);
				return;
			case 1072:
				Class374.method28440(arg1, -1017991027);
				return;
			case 1073:
				Class113.method8379(arg1, -1643169675);
				return;
			case 1074:
				Class405.method28914(arg1, 996278112);
				return;
			case 1075:
				Class123.method20525(arg1, -1230067993);
				return;
			case 1076:
				Class320.method27563(arg1, (short) 10860);
				return;
			case 1077:
				Class61.method1188(arg1, -20394741);
				return;
			case 1078:
				Class627.method32539(arg1, 1008380270);
				return;
			case 1079:
				Class639.method32886(arg1, -681938208);
				return;
			case 1080:
				Class533.method30830(arg1, (byte) 4);
				return;
			case 1081:
				Class29.method662(arg1, (byte) 55);
				return;
			case 1082:
				Class344.method27950(arg1, -478255750);
				return;
			case 1083:
				Class90.method1871(arg1, 458512132);
				return;
			case 1084:
				Class290.method26931(arg1, (byte) -56);
				return;
			case 1085:
				Class639.method32885(arg1, (byte) 68);
				return;
			case 1086:
				Class500.method30413(arg1, 321697625);
				return;
			case 1087:
				Class154.method14986(arg1, 1804311934);
				return;
			case 1088:
				Class41_Sub9.method17346(arg1, -1687166745);
				return;
			case 1089:
				Class299.method27026(arg1, 1743290592);
				return;
			case 1090:
				Class518.method30586(arg1, (byte) -120);
				return;
			case 1091:
				Class143_Sub5.method11844(arg1, 635934386);
				return;
			case 1092:
				Class654.method33167(arg1, 50737905);
				return;
			case 1093:
				Class432.method29093(arg1, -1951269375);
				return;
			case 1094:
				Class361.method28152(arg1, -1014899862);
				return;
			case 1095:
				Class151.method14542(arg1, 474737298);
				return;
			case 1096:
				Class205.method24987(arg1, (byte) -17);
				return;
			case 1097:
				Class433.method29108(arg1, (byte) -115);
				return;
			case 1098:
				Class318.method27525(arg1, -1698135494);
				return;
			case 1099:
				Class29.method663(arg1, 765247633);
				return;
			case 1100:
				Class538.method30885(arg1, (byte) -103);
				return;
			case 1101:
				Class480.method30008(arg1, -764330628);
				return;
			case 1102:
				Class115.method8670(arg1, 810112943);
				return;
			case 1103:
				Class439.method29152(arg1, (byte) 7);
				return;
			case 1104:
				Class440.method29167(arg1, (byte) -85);
				return;
			case 1105:
				Class364.method28219(arg1, 1115451176);
				return;
			case 1106:
				Class557.method31376(arg1, -1101244636);
				return;
			case 1107:
				Class630.method32717(arg1, 65280);
				return;
			case 1108:
				Class358.method28130(arg1, (byte) 2);
				return;
			case 1109:
				Class218.method25875(arg1, (short) 14280);
				return;
			case 1110:
				Class72.method15575(arg1, (byte) 36);
				return;
			case 1111:
				Class441.method29184(arg1, 1088530286);
				return;
			case 1112:
				Class263.method26633(arg1, (byte) -2);
				return;
			case 1113:
				Class650.method33122(arg1, 858712837);
				return;
			case 1114:
				Class200.method24928(arg1, (byte) -9);
				return;
			case 1115:
				Class294.method26963(arg1, -1872873530);
				return;
			case 1116:
				Class587.method31889(arg1, (short) -15972);
				return;
			case 1117:
				Class305.method27207(arg1, (short) 28283);
				return;
			case 1118:
				Class3.method69(arg1, 1600903457);
				return;
			case 1119:
				Class328.method27724(arg1, 1665189190);
				return;
			case 1120:
				Class120_Sub1_Sub3_Sub2.method13852(arg1, (byte) 126);
				return;
			case 1121:
				Class670.method33511(arg1, 1004072024);
				return;
			case 1122:
				Class445.method29242(arg1, 846951508);
				return;
			case 1123:
				Class714.method37208(arg1, (byte) 1);
				return;
			case 1124:
				Class486.method30063(arg1, 399676879);
				return;
			case 1125:
				Class354.method28082(arg1, (byte) -45);
				return;
			case 1126:
				Class327.method27714(arg1, -182185427);
				return;
			case 1127:
				Class248.method26338(arg1, -234350127);
				return;
			case 1128:
				Class720.method37295(arg1, (byte) -88);
				return;
			case 1129:
				Class697.method37053(arg1, (byte) -7);
				return;
			case 1130:
				Class425.method29053(arg1, -341581482);
				return;
			case 1131:
				Class469.method29738(arg1, -1382357800);
				return;
			case 1132:
				Class611.method32221(arg1, 1575311316);
				return;
			case 1133:
				Class292.method26947(arg1, 1380578379);
				return;
			case 1134:
				Class380.method28559(arg1, (byte) -102);
				return;
			case 1135:
				Class205.method24990(arg1, -1098889764);
				return;
			case 1136:
				Class275.method26805(arg1, -952208974);
				return;
			case 1137:
				Class438.method29145(arg1, 1779110909);
				return;
			case 1138:
				Class165.method16959(arg1, 1652863760);
				return;
			case 1139:
				Class491.method30255(arg1, 1309653482);
				return;
			case 1140:
				Class367.method28286(arg1, 923331874);
				return;
			case 1141:
				Class606.method32161(arg1, (byte) 120);
				return;
			case 1142:
				Class143.method11835(arg1, (byte) 6);
				return;
			case 1143:
				Class672.method33563(arg1, -509459142);
				return;
			case 1144:
				Class453.method29294(arg1, 876002679);
				return;
			case 1145:
				Class453.method29295(arg1, -1999428423);
				return;
			case 1146:
				Class405.method28913(arg1, (byte) 121);
				return;
			case 1147:
				Class377.method28476(arg1, 754944202);
				return;
			case 1148:
				Class522.method30639(arg1, (byte) -96);
				return;
			case 1149:
				Class139.method10803(arg1, (byte) -80);
				return;
			case 1150:
				Class632.method32727(arg1, (short) 1066);
				return;
			case 1151:
				Class521.method30633(arg1, (byte) 13);
				return;
			case 1152:
				Class607.method32181(arg1, (byte) 32);
				return;
			case 1153:
				Class563.method31456(arg1, (short) 26937);
				return;
			case 1154:
				Class278.method26837(arg1, (byte) -29);
				return;
			case 1155:
				Class74.method1308(arg1, 1978564316);
				return;
			case 1156:
				Class390.method28668(arg1, (byte) 65);
				return;
			case 1157:
				Class638.method32876(arg1, -1647858720);
				return;
			case 1158:
				Class350.method28016(arg1, (byte) -118);
				return;
			case 1159:
				Class393.method28689(arg1, 56719585);
				return;
			case 1160:
				Class80_Sub13.method23985(arg1, 1853460118);
				return;
			case 1161:
				Class608.method32191(arg1, 1783734070);
				return;
			case 1162:
				Class697.method37045(arg1, (short) -15617);
				return;
			case 1163:
				Class279.method26850(arg1, -170566094);
				return;
			case 1164:
				Class559.method31410(arg1, -592828607);
				return;
			case 1165:
				Class674.method33582(arg1, 31145287);
				return;
			case 1166:
				method31364(arg1, -1967239371);
				return;
			case 1167:
				Class680.method33636(arg1, -968077280);
				return;
			case 1168:
				Class281.method26863(arg1, (byte) -25);
				return;
			case 1169:
				Class320.method27562(arg1, 574904585);
				return;
			case 1170:
				Class653.method33146(arg1, -1920043143);
				return;
			case 1171:
				Class103_Sub21.method8570(arg1, 326248838);
				return;
			case 1172:
				Class448.method29261(arg1, (byte) -32);
				return;
			case 1173:
				Class491.method30260(arg1, (byte) -104);
				return;
			case 1174:
				Class548.method31272(arg1, -1201401006);
				return;
			case 1175:
				Class120_Sub1_Sub1_Sub1.method19050(arg1, -105886206);
				return;
			case 1176:
				Class518.method30585(arg1, 1078420805);
				return;
			case 1177:
				Class29.method664(arg1, 1679156386);
				return;
			case 1178:
				Class601.method32101(arg1, (byte) 7);
				return;
			case 1179:
				Class165_Sub43.method16859(arg1, (byte) 16);
				return;
			case 1180:
				Class587.method31893(arg1, 1921889026);
				return;
			case 1181:
				Class143_Sub5.method11842(false, arg1, 884338097);
				return;
			case 1182:
				Class610.method32208(arg1, (byte) 13);
				return;
			case 1183:
				Class619.method32304(arg1, (byte) 67);
				return;
			case 1184:
				Class288.method26912(arg1, (byte) 45);
				return;
			case 1185:
				Class503.method30449(arg1, (byte) -69);
				return;
			case 1186:
				Class688.method36894(arg1, 719400511);
				return;
			case 1187:
				Class518.method30584(arg1, 2113529038);
				return;
			case 1188:
				Class231.method26034(arg1, 1689530376);
				return;
			case 1189:
				Class249.method26351(arg1, (byte) -20);
				return;
			case 1190:
				Class699.method37065(arg1, 65280);
				return;
			case 1191:
				Class75.method1340(arg1, 2104410962);
				return;
			case 1192:
				Class607.method32179(arg1, -98322983);
				return;
			case 1193:
				Class205.method24984(arg1, -1905544108);
				return;
			case 1194:
				Class134.method10450(arg1, 200884815);
				return;
			case 1195:
				Class231.method26033(arg1, (byte) -5);
				return;
			case 1196:
				Class694.method37023(arg1, -533319033);
				return;
			case 1197:
				Class667.method33470(arg1, (byte) 6);
				return;
			case 1198:
				Class129_Sub2.method20292(arg1, 1927951244);
				return;
			case 1199:
				Class282.method26868(arg1, (byte) 0);
				return;
			case 1200:
				Class634.method32808(arg1, (short) 185);
				return;
			case 1201:
				Class367.method28291(arg1, (short) 4300);
				return;
			case 1202:
				Class165_Sub31.method16480(arg1, -1311710401);
				return;
			case 1203:
				Class655.method33214(arg1, -967556119);
				return;
			case 1204:
				Class102.method21131(arg1, (byte) -105);
				return;
			case 1205:
				Class318.method27527(arg1, (byte) -107);
				return;
			case 1206:
				Class564.method31476(arg1, -1561777241);
				return;
			case 1207:
				Class622.method32435(arg1, (byte) -27);
				return;
			case 1208:
				Class256.method26418(arg1, -1545945922);
				return;
			case 1209:
				Class391.method28674(arg1, (byte) -12);
				return;
			case 1210:
				Class601.method32100(arg1, 1052460537);
				return;
			case 1211:
				Class263.method26634(arg1, 1046393723);
				return;
			case 1212:
				Class248.method26339(arg1, (byte) 51);
				return;
			case 1213:
				Class509.method30532(arg1, -603175594);
				return;
			case 1214:
				Class583.method31837(arg1, (byte) -12);
				return;
			case 1215:
				Class126.method20384(arg1, 1863332471);
				return;
			case 1216:
				Class249.method26350(arg1, -461246438);
				return;
			case 1217:
				Class120_Sub1_Sub1_Sub2.method12208(arg1, 1060982559);
				return;
			case 1218:
				Class309.method27449(arg1, -1835007403);
				return;
			case 1219:
				Class149.method13925(arg1, (byte) 26);
				return;
			case 1220:
				Class134.method10452(arg1, 600129565);
				return;
			case 1221:
				Class538.method30886(arg1, 499008928);
				return;
			case 1222:
				Class259.method26447(arg1, 1257254346);
				return;
			case 1223:
				Class598.method32026(arg1, -970428811);
				return;
			case 1224:
				Class644.method33032(arg1, -2039978801);
				return;
			case 1225:
				Class444.method29230(arg1, 2057630219);
				return;
			case 1226:
				Class609.method32196(arg1, (byte) 79);
				return;
			case 1227:
				Class540.method31061(arg1, (byte) 97);
				return;
			case 1228:
				Class126.method20382(arg1, -1868226649);
				return;
			case 1229:
				Class482.method30021(arg1, 1409963830);
				return;
			case 1230:
				Class436.method29132(arg1, 1098115260);
				return;
			case 1231:
				Class491.method30259(arg1, -1736355726);
				return;
			case 1232:
				Class86.method1699(arg1, 1656270238);
				return;
			case 1233:
				Class47.method989(arg1, -1140870650);
				return;
			case 1234:
				Class483.method30028(arg1, (byte) 127);
				return;
			case 1235:
				Class257.method26427(arg1, (byte) 48);
				return;
			case 1236:
				Class694.method37021(arg1, 1862927973);
				return;
			case 1237:
				Class325.method27629(arg1, (byte) 9);
				return;
			case 1238:
				Class364.method28217(arg1, 1542880680);
				return;
			case 1239:
				Class336.method27868(arg1, -1837398038);
				return;
			case 1240:
				Class645.method33042(arg1, -1917699962);
				return;
			case 1241:
				Class36.method785(arg1, 2067119789);
				return;
			case 1242:
				Class601.method32099(arg1, -641940394);
				return;
			case 1243:
				Class356.method28100(arg1, -84328577);
				return;
			case 1244:
				Class350.method28008(arg1, true, true, (byte) -92);
				return;
			case 1245:
				Class80_Sub1_Sub19.method23073(arg1, -1810543467);
				return;
			case 1246:
				Class251.method26367(arg1, (byte) 36);
				return;
			case 1247:
				Class544.method31181(arg1, -2072528124);
				return;
			case 1248:
				Class287.method26905(arg1, -1681137466);
				return;
			case 1249:
				Class53.method1077(arg1, -122565340);
				return;
			case 1250:
				Class642.method32963(arg1, -1664296164);
				return;
			case 1251:
				Class261.method26499(arg1, -255202897);
				return;
			case 1252:
				Class519.method30605(arg1, -820477530);
				return;
			case 1253:
				Class544.method31179(arg1, 324944493);
				return;
			case 1254:
				Class383.method28579(arg1, -826951018);
				return;
			case 1255:
				Class257.method26426(true, arg1, (byte) 0);
				return;
			case 1256:
				Class536.method30874(arg1, -213650350);
				return;
			case 1257:
				Class5.method116(arg1, (short) 6821);
				return;
			case 1258:
				Class126_Sub2.method20385(arg1, 1257361174);
				return;
			case 1259:
				Class599.method32047(arg1, (byte) 37);
				return;
			case 1260:
				Class366.method28272(arg1, 16711680);
				return;
			case 1261:
				Class210.method25805(arg1, (short) -13644);
				return;
			case 1262:
				Class129_Sub2.method20290(arg1, 1131278307);
				return;
			case 1263:
				Class372.method28406(arg1, -821411513);
				return;
			case 1264:
				Class243.method26295(arg1, 970884336);
				return;
			case 1265:
				Class315.method27501(arg1, 671136973);
				return;
			case 1266:
				Class175.method24653(arg1, -540538921);
				return;
			case 1267:
				Class638.method32879(arg1, 1921786815);
				return;
			case 1268:
				Class240.method26226(arg1, -672285122);
				return;
			case 1269:
				Class634.method32807(arg1, 32884);
				return;
			case 1270:
				Class498.method30356(arg1, (byte) -32);
				return;
			case 1271:
				Class269.method26684(arg1, (byte) -93);
				return;
			case 1272:
				Class641.method32898(arg1, 1884304720);
				return;
			case 1273:
				Class567.method31519(arg1, -1241314080);
				return;
			case 1274:
				Class318.method27526(arg1, 1992095198);
				return;
			case 1275:
				Class139.method10804(arg1, 643027306);
				return;
			case 1276:
				Class663.method33347(arg1, -2044777207);
				return;
			case 1277:
				Class345.method27959(arg1, -1871093047);
				return;
			case 1278:
				Class303.method27114(arg1, (byte) 108);
				return;
			case 1279:
				Class603.method32132(arg1, 1954910917);
				return;
			case 1280:
				Class147.method23929(arg1, (byte) 0);
				return;
			case 1281:
				Class151_Sub1.method14553(arg1, 1849382311);
				return;
			case 1282:
				Class667.method33472(arg1, -1096943609);
				return;
			case 1283:
				Class276.method26820(arg1, (byte) 99);
				return;
			case 1284:
				Class277.method26828(arg1, -786223204);
				return;
			case 1285:
				Class420.method29003(arg1, -1896972704);
				return;
			case 1286:
				Class719.method37287(arg1, (byte) 8);
				return;
			case 1287:
				Class708.method37150(arg1, -1257593544);
				return;
			case 1288:
				Class443.method29213(arg1, (byte) 49);
				return;
			case 1289:
				Class239.method26215(arg1, (byte) 8);
				return;
			case 1290:
				Class382.method28567(arg1, (byte) 16);
				return;
			case 1291:
				Class285.method26894(arg1, (byte) 1);
				return;
			case 1292:
				Class536.method30876(arg1, -2024105787);
				return;
			case 1293:
				Class505.method30471(arg1, -1926814007);
				return;
			case 1294:
				Class584.method31843(arg1, 115943384);
				return;
			case 1295:
				Class688.method36895(arg1, -2044389659);
				return;
			case 1296:
				Class445.method29241(arg1, 1246515965);
				return;
			case 1297:
				Class602.method32124(arg1, (short) 1028);
				return;
			case 1298:
				Class297.method27003(arg1, -921912342);
				return;
			case 1299:
				Class183.method24701(arg1, (byte) 116);
				return;
			case 1300:
				Class491.method30254(arg1, -1282176622);
				return;
			case 1301:
				Class586.method31881(arg1, (byte) -46);
				return;
			case 1302:
				Class113.method8380(arg1, (byte) -2);
				return;
			case 1303:
				return;
			case 1304:
				Class263.method26636(arg1, -33529321);
				return;
			case 1305:
				Class80_Sub15.method14079(arg1, 234080195);
				return;
			case 1306:
				Class281.method26862(arg1, 944684387);
				return;
			case 1307:
				Class120_Sub1_Sub4_Sub1.method13028(arg1, 1987180146);
				return;
			case 1308:
				Class432.method29092(arg1, -1770835578);
				return;
			case 1309:
				Class492.method30265(arg1, (byte) 7);
				return;
			case 1310:
				Class649.method33113(arg1, (short) 255);
				return;
			case 1311:
				Class628.method32555(arg1, -2126779284);
				return;
			case 1312:
				Class635.method32817(arg1, 126949532);
				return;
			case 1313:
				Class440.method29170(arg1, 652304674);
				return;
			case 1314:
				Class449.method29269(arg1, (byte) 16);
				return;
			case 1315:
				Class607.method32178(arg1, -1493703783);
				return;
			case 1316:
				Class554.method25309(arg1, 1598302462);
				return;
			case 1317:
				Class427.method29055(arg1, 1539847073);
				return;
			case 1318:
				Class482.method30020(arg1, -1722824737);
				return;
			case 1319:
				Class60.method1186(arg1, -1180839615);
				return;
			case 1320:
				Class41_Sub18.method17795(arg1, (byte) -86);
				return;
			case 1321:
				Class590.method31918(arg1, -847157751);
				return;
			case 1322:
				Class163.method15761(arg1, 348287597);
				return;
			case 1323:
				Class674.method33583(arg1, 469139509);
				return;
			case 1324:
				Class696.method37038(arg1, (byte) 102);
				return;
			case 1325:
				Class165_Sub33.method16546(arg1, (byte) 51);
				return;
			case 1326:
				Class518.method30587(arg1, (byte) -59);
				return;
			case 1327:
				Class663.method33351(arg1, 2036747717);
				return;
			case 1328:
				Class4.method87(arg1, 39260827);
				return;
			case 1329:
				Class208.method25010(arg1, (short) 7063);
				return;
			case 1330:
				Class714.method37210(arg1, 584392999);
				return;
			case 1331:
				Class80_Sub28_Sub6.method21914(arg1, (byte) 28);
				return;
			case 1332:
				Class220.method25905(arg1, -2046916274);
				return;
			case 1333:
				Class681.method23415(arg1, (byte) -31);
				return;
			case 1334:
				Class106.method18205(arg1, (byte) -116);
				return;
			case 1335:
				Class669.method33494(arg1, -658310195);
				return;
			case 1336:
				Class636.method32862(arg1, (byte) 1);
				return;
			case 1337:
				Class449.method29268(arg1, 2056645898);
				return;
			case 1338:
				Class359.method28140(arg1, -395679401);
				return;
			case 1339:
				Class492.method30264(arg1, -734353682);
				return;
			case 1340:
				Class527.method30712(arg1, (byte) 7);
				return;
			case 1341:
				Class372.method28408(arg1, 598987023);
				return;
			case 1342:
				Class649.method33115(arg1, -1271083628);
				return;
			case 1343:
				Class642.method32964(arg1, -613974023);
				return;
			case 1344:
				Class300.method27032(arg1, 164732484);
				return;
			case 1345:
				Class570.method31720(arg1, (byte) 103);
				return;
			case 1346:
				Class452.method29288(arg1, -1247132720);
				return;
			case 1347:
				Class90.method1868(arg1, -2036408665);
				return;
			case 1348:
				Class337.method27875(arg1, (byte) 64);
				return;
			case 1349:
				Class1.method25(arg1, -1360179967);
				return;
			case 1351:
				Class55.method1113(arg1, 1040362587);
				return;
			case 1352:
				Class295.method26969(arg1, (byte) 102);
				return;
			case 1353:
				Class575.method31784(arg1, 871550600);
				return;
			case 1354:
				Class287.method26904(arg1, (short) -23132);
				return;
			case 1355:
				Class242.method26243(arg1, -809333328);
				return;
			case 1356:
				Class382.method28571(arg1, 1265366556);
				return;
			case 1357:
				Class442.method29209(arg1, -1384215404);
				return;
			case 1358:
				Class685.method36792(arg1, -2132860889);
				return;
			case 1359:
				method31363(arg1, 1466992684);
				return;
			case 1360:
				Class261.method26497(arg1, (short) 15360);
				return;
			case 1361:
				Class638.method32878(arg1, -282808054);
				return;
			case 1362:
				Class13.method352(arg1, 987614627);
				return;
			case 1363:
				Class535.method30854(arg1, (short) 6571);
				return;
			case 1364:
				Class282.method26870(arg1, -728764273);
				return;
			case 1365:
				Class74.method1312(arg1, 1402500972);
				return;
			case 1366:
				Class80.method24403(arg1, 709836103);
				return;
			case 1367:
				Class115.method8669(arg1, -1953011029);
				return;
			case 1368:
				Class493.method30273(arg1, -1199354718);
				return;
			case 1369:
				Class18.method458(arg1, -2100547906);
				return;
			case 1370:
				Class245.method26319(arg1, (byte) 5);
				return;
			case 1371:
				Class329.method27755(arg1, -1923858039);
				return;
			case 1372:
				Class104_Sub5.method6645(arg1, 984660518);
				return;
			case 1374:
				Class120_Sub1_Sub4_Sub1.method13027(arg1, -834204239);
				return;
			case 1375:
				Class2.method1813(arg1, (byte) -24);
				return;
			case 1376:
				Class715.method37218(arg1, (byte) 9);
				return;
			case 1377:
				Class121.method9719(arg1, (byte) -13);
				return;
			case 1378:
				Class588.method31904(arg1, (byte) -80);
				return;
			case 1379:
				Class80.method24402(arg1, (short) 11088);
				return;
			case 1380:
				Class627.method32540(arg1, (byte) 102);
				return;
			case 1381:
				Class119_Sub1.method8902(arg1, 1120268063);
				return;
			case 1382:
				Class626.method32535(arg1, (byte) 0);
				return;
			case 1383:
				Class258.method26440(arg1, -1305975959);
				return;
			case 1384:
				Class654.method33170(arg1, -620581379);
				return;
			case 1385:
				Class103.method19207(arg1, (byte) -1);
				return;
			case 1386:
				Class558.method31402(arg1, 610597230);
				return;
			case 1387:
				Class108_Sub1.method23912(arg1, 994489162);
				return;
			case 1388:
				Class638.method32877(arg1, 247496114);
				return;
			case 1389:
				Class682.method36703(arg1, (byte) 0);
				return;
			case 1390:
				Class507.method30511(arg1, 988305882);
				return;
			case 1391:
				Class225.method25958(arg1, (byte) 7);
				return;
			case 1392:
				Class350.method28015(arg1, (byte) -81);
				return;
			case 1393:
				Class578.method31795(arg1, -573803549);
				return;
			case 1394:
				Class587.method31890(arg1, (short) -16703);
				return;
			case 1395:
				Class375.method28452(arg1, (short) -21165);
				return;
			case 1396:
				Class338.method27885(arg1, 3251178);
				return;
			case 1397:
				Class443.method29212(arg1, 85157119);
				return;
			case 1398:
				Class158.method15518(arg1, (short) 3585);
				return;
			case 1399:
				Class176.method24660(arg1, -632147659);
				return;
			case 1400:
				Class509.method30533(arg1, -991752109);
				return;
			case 1401:
				Class103_Sub18.method8401(arg1, (byte) -78);
				return;
			case 1402:
				Class324.method27616(arg1, -513365418);
				return;
			case 1403:
				Class154.method14985(arg1, (short) -14155);
				return;
			case 1404:
				Class505.method30467(arg1, -280933384);
				return;
			case 1405:
				Class353.method28070(arg1, (byte) -54);
				return;
			case 1406:
				Class258.method26439(arg1, 1881495613);
				return;
			case 1407:
				Class633.method32784(arg1, 142918868);
				return;
			case 1408:
				Class241.method26230(arg1, 1744228924);
				return;
			case 1409:
				Class529.method30809(arg1, (byte) -90);
				return;
			case 1410:
				Class17.method439(arg1, 623945004);
				return;
			case 1411:
				Class361.method28150(arg1, 1735450691);
				return;
			case 1412:
				Class249.method26349(arg1, 1229558870);
				return;
			case 1413:
				Class80_Sub28_Sub9.method21997(arg1, (byte) 0);
				return;
			case 1414:
				Class614.method32267(arg1, -662423608);
				return;
			case 1415:
				Class434.method29113(arg1, (byte) 4);
				return;
			case 1416:
				Class481.method30018(arg1, (byte) -30);
				return;
			case 1417:
				Class448.method29257(arg1, 1957623451);
				return;
			case 1418:
				Class474.method29879(arg1, (byte) 127);
				return;
			case 1419:
				Class505.method30465(arg1, 2077943739);
				return;
			case 1420:
				Class695.method37031(arg1, 794282209);
				return;
			case 1421:
				Class110.method7295(arg1, 814776966);
				return;
			case 1422:
				Class329.method27756(arg1, (byte) 0);
				return;
			case 1423:
				Class460.method29416(arg1, 971544622);
				return;
			case 1424:
				Class61.method1190(arg1, (short) 16736);
				return;
			case 1425:
				Class436.method29136(arg1, 1232421347);
				return;
			case 1426:
				Class381.method28566(arg1, 281041005);
				return;
			case 1427:
				Class20_Sub5.method16946(arg1, (byte) -50);
				return;
			case 1428:
				Class626.method32538(arg1, -1211186317);
				return;
			case 1429:
				Class345.method27956(arg1, 1880631034);
				return;
			case 1430:
				Class639.method32883(arg1, 2003596041);
				return;
			case 1431:
				Class211.method25820(arg1, 134446646);
		}
	}

	@OriginalMember(owner = "client!sl", name = "ahr", descriptor = "(Lclient!yp;I)V")
	static void method31367(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5776 -= -1650379242;
		@Pc(14) String local14 = (String) arg0.anObjectArray46[arg0.anInt5776 * -2070619997];
		@Pc(25) String local25 = (String) arg0.anObjectArray46[arg0.anInt5776 * -2070619997 + 1];
		if (client.anInt3512 * -780671365 == 0 && (client.aBoolean748 && !client.aBoolean724 || client.aBoolean733)) {
			return;
		}
		@Pc(40) Class75 local40 = Class52.method1074(16777215);
		@Pc(46) Class80_Sub31 local46 = Class623.method32440(Class443.aClass443_53, local40.aClass22_1, -191270971);
		local46.aPacketBit_2.p2(0);
		@Pc(57) int local57 = local46.aPacketBit_2.pos * -1380987821;
		local46.aPacketBit_2.pjstr(local14);
		Class120_Sub1_Sub3_Sub2.method13850(local46.aPacketBit_2, local25, (short) 22330);
		local46.aPacketBit_2.p2check(local46.aPacketBit_2.pos * -1380987821 - local57);
		local40.method1325(local46, (byte) -57);
	}

	@OriginalMember(owner = "client!sl", name = "aqb", descriptor = "(Lclient!yp;I)V")
	static void method31368(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5776 -= 1819398433;
		@Pc(14) String local14 = (String) arg0.anObjectArray46[arg0.anInt5776 * -2070619997];
		@Pc(25) String local25 = (String) arg0.anObjectArray46[arg0.anInt5776 * -2070619997 + 1];
		@Pc(36) String local36 = (String) arg0.anObjectArray46[arg0.anInt5776 * -2070619997 + 2];
		@Pc(54) boolean local54 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581] == 1;
		Class682.method36708(local14, local25, local36, local54, 16777215);
	}

	@OriginalMember(owner = "client!sl", name = "jj", descriptor = "(IIIIIII)V")
	static void method31369(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		for (@Pc(4) Class147_Sub5 local4 = (Class147_Sub5) client.aClass5_8.method93((byte) 62); local4 != null; local4 = (Class147_Sub5) client.aClass5_8.method110(992037005)) {
			if (client.anInt3436 >= local4.anInt1495 * -1697532161) {
				local4.method23926(1483193607);
			} else {
				Class66.method1240(local4.anInt1494 * 1535256661, (local4.anInt1491 * -1872873415 << 9) + 256, (local4.anInt1493 * 2032435185 << 9) + 256, 0, local4.anInt1492 * 281452690, false, false, -2073641592);
				Class8.aClass104_1.method7642(local4.aString45, (int) (client.aFloatArray95[0] + (float) arg0), (int) ((float) arg1 + client.aFloatArray95[1]), -553736291 * local4.anInt1496 | 0xFF000000, 0, 1211017219);
			}
		}
	}

	@OriginalMember(owner = "client!sl", name = "vf", descriptor = "(Lclient!yp;I)V")
	static void method31370(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2008809074);
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = client.method25326(local16).method14325(-504084363);
	}

	@OriginalMember(owner = "client!sl", name = "<init>", descriptor = "()V")
	Class553() throws Throwable {
		throw new Error();
	}
}
