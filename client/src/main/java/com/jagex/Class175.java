package com.jagex;

import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ay")
public final class Class175 {

	@OriginalMember(owner = "client!ay", name = "t", descriptor = "Lclient!di;")
	static Class102 aClass102_8;

	@OriginalMember(owner = "client!ay", name = "e", descriptor = "Lclient!aag;")
	static Class8 aClass8_43 = new Class8();

	@OriginalMember(owner = "client!ay", name = "w", descriptor = "()V")
	static void method24637() {
		if (aClass102_8 != null) {
			aClass102_8.method20660(-1135219822);
			aClass102_8 = null;
			Class255.aClass104_23 = null;
		}
	}

	@OriginalMember(owner = "client!ay", name = "u", descriptor = "(Lclient!di;Lclient!hx;)V")
	static void method24638(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class327 arg1) {
		@Pc(37) boolean local37 = Class25.aClass41_Sub9_1.method17334(arg0, arg1.anInt4167 * 1052460537, arg1.anInt4141 * 857016887, arg1.anInt4118 * -971113929, arg1.anInt4096 * -449602255 | 0xFF000000, arg1.anInt4134 * -555154585, arg1.aBoolean816 ? Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aClass672_1 : null, -142955878) == null;
		if (local37) {
			aClass8_43.method232(new Class80_Sub10(arg1.anInt4167 * 1052460537, arg1.anInt4141 * 857016887, arg1.anInt4118 * -971113929, arg1.anInt4096 * -449602255 | 0xFF000000, arg1.anInt4134 * -555154585, arg1.aBoolean816), 82765712);
			Class296.method26998(arg1, 778941592);
		}
	}

	@OriginalMember(owner = "client!ay", name = "l", descriptor = "(Lclient!di;Lclient!hx;)V")
	static void method24639(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class327 arg1) {
		@Pc(37) boolean local37 = Class25.aClass41_Sub9_1.method17334(arg0, arg1.anInt4167 * 1052460537, arg1.anInt4141 * 857016887, arg1.anInt4118 * -971113929, arg1.anInt4096 * -449602255 | 0xFF000000, arg1.anInt4134 * -555154585, arg1.aBoolean816 ? Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aClass672_1 : null, 1972892464) == null;
		if (local37) {
			aClass8_43.method232(new Class80_Sub10(arg1.anInt4167 * 1052460537, arg1.anInt4141 * 857016887, arg1.anInt4118 * -971113929, arg1.anInt4096 * -449602255 | 0xFF000000, arg1.anInt4134 * -555154585, arg1.aBoolean816), 1038354853);
			Class296.method26998(arg1, -609390118);
		}
	}

	@OriginalMember(owner = "client!ay", name = "i", descriptor = "(Lclient!di;)V")
	static void method24640(@OriginalArg(0) Class102 arg0) {
		if (aClass8_43.method239((byte) -37) == 0) {
			return;
		}
		@Pc(14) Class80_Sub10 local14;
		if (Class703.aClass80_Sub37_49.aClass165_Sub1_2.method15834(-1972516520) == 0) {
			for (local14 = (Class80_Sub10) aClass8_43.method247(129206984); local14 != null; local14 = (Class80_Sub10) aClass8_43.method237(-721099822)) {
				Class25.aClass41_Sub9_1.method17329(arg0, arg0, local14.anInt1514 * 280006311, local14.anInt1511 * -2139920331, local14.anInt1510 * 1316303167, local14.anInt1513 * 1945413367, false, false, local14.anInt1512 * -876731593, Class108.aClass104_22, local14.aBoolean347 ? Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aClass672_1 : null, Class698.aClass638_1, -1768820128);
				local14.method24395((byte) 27);
			}
			Class138_Sub1.method10718((byte) 41);
			return;
		}
		if (aClass102_8 == null) {
			@Pc(72) Canvas local72 = new Canvas();
			local72.setSize(36, 32);
			aClass102_8 = Class620.method32309(0, local72, Class626.aClass235_8, Class39.anInterface23_1, Class475.aClass445_1, Class447.aClass450_1, Class380.aClass444_1, Class80_Sub15.aClass480_35, 0, (byte) -112);
			Class255.aClass104_23 = aClass102_8.method20749(Class427.method29056(Class569.aClass480_124, Class495.anInt5032 * -1666529807, 0, (byte) 99), Class212.method25822(Class708.aClass480_136, Class495.anInt5032 * -1666529807, 0), true);
		}
		for (local14 = (Class80_Sub10) aClass8_43.method247(129206984); local14 != null; local14 = (Class80_Sub10) aClass8_43.method237(-1041548020)) {
			Class25.aClass41_Sub9_1.method17329(aClass102_8, arg0, local14.anInt1514 * 280006311, local14.anInt1511 * -2139920331, local14.anInt1510 * 1316303167, local14.anInt1513 * 1945413367, false, false, local14.anInt1512 * -876731593, Class255.aClass104_23, local14.aBoolean347 ? Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aClass672_1 : null, Class698.aClass638_1, -1328385307);
			local14.method24395((byte) 60);
		}
	}

	@OriginalMember(owner = "client!ay", name = "m", descriptor = "(Lclient!di;)V")
	static void method24641(@OriginalArg(0) Class102 arg0) {
		if (aClass8_43.method239((byte) -102) == 0) {
			return;
		}
		@Pc(14) Class80_Sub10 local14;
		if (Class703.aClass80_Sub37_49.aClass165_Sub1_2.method15834(-860626508) == 0) {
			for (local14 = (Class80_Sub10) aClass8_43.method247(129206984); local14 != null; local14 = (Class80_Sub10) aClass8_43.method237(-666400420)) {
				Class25.aClass41_Sub9_1.method17329(arg0, arg0, local14.anInt1514 * 280006311, local14.anInt1511 * -2139920331, local14.anInt1510 * 1316303167, local14.anInt1513 * 1945413367, false, false, local14.anInt1512 * -876731593, Class108.aClass104_22, local14.aBoolean347 ? Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aClass672_1 : null, Class698.aClass638_1, -2093122887);
				local14.method24395((byte) 66);
			}
			Class138_Sub1.method10718((byte) 72);
			return;
		}
		if (aClass102_8 == null) {
			@Pc(72) Canvas local72 = new Canvas();
			local72.setSize(36, 32);
			aClass102_8 = Class620.method32309(0, local72, Class626.aClass235_8, Class39.anInterface23_1, Class475.aClass445_1, Class447.aClass450_1, Class380.aClass444_1, Class80_Sub15.aClass480_35, 0, (byte) 10);
			Class255.aClass104_23 = aClass102_8.method20749(Class427.method29056(Class569.aClass480_124, Class495.anInt5032 * -1666529807, 0, (byte) 14), Class212.method25822(Class708.aClass480_136, Class495.anInt5032 * -1666529807, 0), true);
		}
		for (local14 = (Class80_Sub10) aClass8_43.method247(129206984); local14 != null; local14 = (Class80_Sub10) aClass8_43.method237(-1817234301)) {
			Class25.aClass41_Sub9_1.method17329(aClass102_8, arg0, local14.anInt1514 * 280006311, local14.anInt1511 * -2139920331, local14.anInt1510 * 1316303167, local14.anInt1513 * 1945413367, false, false, local14.anInt1512 * -876731593, Class255.aClass104_23, local14.aBoolean347 ? Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aClass672_1 : null, Class698.aClass638_1, -1339902847);
			local14.method24395((byte) 71);
		}
	}

	@OriginalMember(owner = "client!ay", name = "o", descriptor = "(Lclient!di;)V")
	static void method24642(@OriginalArg(0) Class102 arg0) {
		if (aClass8_43.method239((byte) -22) == 0) {
			return;
		}
		@Pc(14) Class80_Sub10 local14;
		if (Class703.aClass80_Sub37_49.aClass165_Sub1_2.method15834(-597962929) == 0) {
			for (local14 = (Class80_Sub10) aClass8_43.method247(129206984); local14 != null; local14 = (Class80_Sub10) aClass8_43.method237(-1753901038)) {
				Class25.aClass41_Sub9_1.method17329(arg0, arg0, local14.anInt1514 * 280006311, local14.anInt1511 * -2139920331, local14.anInt1510 * 1316303167, local14.anInt1513 * 1945413367, false, false, local14.anInt1512 * -876731593, Class108.aClass104_22, local14.aBoolean347 ? Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aClass672_1 : null, Class698.aClass638_1, -1806402561);
				local14.method24395((byte) 64);
			}
			Class138_Sub1.method10718((byte) 79);
			return;
		}
		if (aClass102_8 == null) {
			@Pc(72) Canvas local72 = new Canvas();
			local72.setSize(36, 32);
			aClass102_8 = Class620.method32309(0, local72, Class626.aClass235_8, Class39.anInterface23_1, Class475.aClass445_1, Class447.aClass450_1, Class380.aClass444_1, Class80_Sub15.aClass480_35, 0, (byte) -96);
			Class255.aClass104_23 = aClass102_8.method20749(Class427.method29056(Class569.aClass480_124, Class495.anInt5032 * -1666529807, 0, (byte) 123), Class212.method25822(Class708.aClass480_136, Class495.anInt5032 * -1666529807, 0), true);
		}
		for (local14 = (Class80_Sub10) aClass8_43.method247(129206984); local14 != null; local14 = (Class80_Sub10) aClass8_43.method237(581953993)) {
			Class25.aClass41_Sub9_1.method17329(aClass102_8, arg0, local14.anInt1514 * 280006311, local14.anInt1511 * -2139920331, local14.anInt1510 * 1316303167, local14.anInt1513 * 1945413367, false, false, local14.anInt1512 * -876731593, Class255.aClass104_23, local14.aBoolean347 ? Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aClass672_1 : null, Class698.aClass638_1, -1678409904);
			local14.method24395((byte) 91);
		}
	}

	@OriginalMember(owner = "client!ay", name = "a", descriptor = "(Lclient!di;)V")
	static void method24643(@OriginalArg(0) Class102 arg0) {
		if (aClass8_43.method239((byte) -14) == 0) {
			return;
		}
		@Pc(14) Class80_Sub10 local14;
		if (Class703.aClass80_Sub37_49.aClass165_Sub1_2.method15834(-2013487228) == 0) {
			for (local14 = (Class80_Sub10) aClass8_43.method247(129206984); local14 != null; local14 = (Class80_Sub10) aClass8_43.method237(-887475312)) {
				Class25.aClass41_Sub9_1.method17329(arg0, arg0, local14.anInt1514 * 280006311, local14.anInt1511 * -2139920331, local14.anInt1510 * 1316303167, local14.anInt1513 * 1945413367, false, false, local14.anInt1512 * -876731593, Class108.aClass104_22, local14.aBoolean347 ? Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aClass672_1 : null, Class698.aClass638_1, -1809289724);
				local14.method24395((byte) 38);
			}
			Class138_Sub1.method10718((byte) 39);
			return;
		}
		if (aClass102_8 == null) {
			@Pc(72) Canvas local72 = new Canvas();
			local72.setSize(36, 32);
			aClass102_8 = Class620.method32309(0, local72, Class626.aClass235_8, Class39.anInterface23_1, Class475.aClass445_1, Class447.aClass450_1, Class380.aClass444_1, Class80_Sub15.aClass480_35, 0, (byte) -7);
			Class255.aClass104_23 = aClass102_8.method20749(Class427.method29056(Class569.aClass480_124, Class495.anInt5032 * -1666529807, 0, (byte) 89), Class212.method25822(Class708.aClass480_136, Class495.anInt5032 * -1666529807, 0), true);
		}
		for (local14 = (Class80_Sub10) aClass8_43.method247(129206984); local14 != null; local14 = (Class80_Sub10) aClass8_43.method237(679970479)) {
			Class25.aClass41_Sub9_1.method17329(aClass102_8, arg0, local14.anInt1514 * 280006311, local14.anInt1511 * -2139920331, local14.anInt1510 * 1316303167, local14.anInt1513 * 1945413367, false, false, local14.anInt1512 * -876731593, Class255.aClass104_23, local14.aBoolean347 ? Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aClass672_1 : null, Class698.aClass638_1, -2147424951);
			local14.method24395((byte) 21);
		}
	}

	@OriginalMember(owner = "client!ay", name = "g", descriptor = "(Lclient!di;Lclient!hx;)V")
	static void method24644(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class327 arg1) {
		@Pc(37) boolean local37 = Class25.aClass41_Sub9_1.method17334(arg0, arg1.anInt4167 * 1052460537, arg1.anInt4141 * 857016887, arg1.anInt4118 * -971113929, arg1.anInt4096 * -449602255 | 0xFF000000, arg1.anInt4134 * -555154585, arg1.aBoolean816 ? Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aClass672_1 : null, 2031278104) == null;
		if (local37) {
			aClass8_43.method232(new Class80_Sub10(arg1.anInt4167 * 1052460537, arg1.anInt4141 * 857016887, arg1.anInt4118 * -971113929, arg1.anInt4096 * -449602255 | 0xFF000000, arg1.anInt4134 * -555154585, arg1.aBoolean816), 1696547977);
			Class296.method26998(arg1, 2035994103);
		}
	}

	@OriginalMember(owner = "client!ay", name = "s", descriptor = "()V")
	static void method24645() {
		if (aClass102_8 != null) {
			aClass102_8.method20660(-693154972);
			aClass102_8 = null;
			Class255.aClass104_23 = null;
		}
	}

	@OriginalMember(owner = "client!ay", name = "k", descriptor = "()V")
	static void method24646() {
		if (aClass102_8 != null) {
			aClass102_8.method20660(-704037348);
			aClass102_8 = null;
			Class255.aClass104_23 = null;
		}
	}

	@OriginalMember(owner = "client!ay", name = "x", descriptor = "()V")
	static void method24647() {
		if (aClass102_8 != null) {
			aClass102_8.method20660(-1052546622);
			aClass102_8 = null;
			Class255.aClass104_23 = null;
		}
	}

	@OriginalMember(owner = "client!ay", name = "j", descriptor = "(Lclient!di;)V")
	static void method24648(@OriginalArg(0) Class102 arg0) {
		if (aClass8_43.method239((byte) -126) == 0) {
			return;
		}
		@Pc(14) Class80_Sub10 local14;
		if (Class703.aClass80_Sub37_49.aClass165_Sub1_2.method15834(-1032501971) == 0) {
			for (local14 = (Class80_Sub10) aClass8_43.method247(129206984); local14 != null; local14 = (Class80_Sub10) aClass8_43.method237(-980003790)) {
				Class25.aClass41_Sub9_1.method17329(arg0, arg0, local14.anInt1514 * 280006311, local14.anInt1511 * -2139920331, local14.anInt1510 * 1316303167, local14.anInt1513 * 1945413367, false, false, local14.anInt1512 * -876731593, Class108.aClass104_22, local14.aBoolean347 ? Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aClass672_1 : null, Class698.aClass638_1, -1927897429);
				local14.method24395((byte) 58);
			}
			Class138_Sub1.method10718((byte) 51);
			return;
		}
		if (aClass102_8 == null) {
			@Pc(72) Canvas local72 = new Canvas();
			local72.setSize(36, 32);
			aClass102_8 = Class620.method32309(0, local72, Class626.aClass235_8, Class39.anInterface23_1, Class475.aClass445_1, Class447.aClass450_1, Class380.aClass444_1, Class80_Sub15.aClass480_35, 0, (byte) -44);
			Class255.aClass104_23 = aClass102_8.method20749(Class427.method29056(Class569.aClass480_124, Class495.anInt5032 * -1666529807, 0, (byte) 34), Class212.method25822(Class708.aClass480_136, Class495.anInt5032 * -1666529807, 0), true);
		}
		for (local14 = (Class80_Sub10) aClass8_43.method247(129206984); local14 != null; local14 = (Class80_Sub10) aClass8_43.method237(-2082625197)) {
			Class25.aClass41_Sub9_1.method17329(aClass102_8, arg0, local14.anInt1514 * 280006311, local14.anInt1511 * -2139920331, local14.anInt1510 * 1316303167, local14.anInt1513 * 1945413367, false, false, local14.anInt1512 * -876731593, Class255.aClass104_23, local14.aBoolean347 ? Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aClass672_1 : null, Class698.aClass638_1, -1883939809);
			local14.method24395((byte) 105);
		}
	}

	@OriginalMember(owner = "client!ay", name = "r", descriptor = "()V")
	static void method24649() {
		if (aClass102_8 != null) {
			aClass102_8.method20660(-992458411);
			aClass102_8 = null;
			Class255.aClass104_23 = null;
		}
	}

	@OriginalMember(owner = "client!ay", name = "bn", descriptor = "(Lclient!yp;I)V")
	static void method24650(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5777 -= -1672568046;
		if (arg0.aLongArray27[arg0.anInt5777 * -628853575] <= arg0.aLongArray27[arg0.anInt5777 * -628853575 + 1]) {
			arg0.anInt5780 += arg0.anIntArray526[arg0.anInt5780 * -1336568839] * -1216954807;
		}
	}

	@OriginalMember(owner = "client!ay", name = "anx", descriptor = "(Lclient!yp;Lclient!ahb;B)V")
	static void method24651(@OriginalArg(0) Class690 arg0, @OriginalArg(1) Class120_Sub1_Sub1_Sub1 arg1, @OriginalArg(2) byte arg2) {
		arg0.anInt5778 -= -442943724;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(33) int local33 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 2];
		@Pc(48) boolean local48 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 3] == 1;
		if (Class160.aClass121_Sub1_2.method9702(809873951) != Class347.aClass347_3) {
			throw new RuntimeException();
		}
		@Pc(62) Class20_Sub5 local62 = (Class20_Sub5) Class160.aClass121_Sub1_2.method9693(1541629729);
		if (arg1 != null) {
			local62.method16938(arg1, new Class463((float) local13, (float) local23, (float) local33), local48, 1265686049);
		}
		client.aBoolean726 = true;
	}

	@OriginalMember(owner = "client!ay", name = "aqv", descriptor = "(Lclient!yp;I)V")
	static void method24652(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5776 -= -825189621;
	}

	@OriginalMember(owner = "client!ay", name = "bft", descriptor = "(Lclient!yp;I)V")
	static void method24653(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 1;
	}

	@OriginalMember(owner = "client!ay", name = "km", descriptor = "(Lclient!hx;Lclient!yp;I)V")
	static void method24654(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class690 arg1, @OriginalArg(2) int arg2) {
		@Pc(1) byte local1 = 10;
		@Pc(14) int local14 = arg1.anIntArray525[(arg1.anInt5778 -= 2036747717) * 1896589581];
		Class388.method28634(arg0, local1, local14, arg1, 84865685);
	}

	@OriginalMember(owner = "client!ay", name = "<init>", descriptor = "()V")
	Class175() throws Throwable {
		throw new Error();
	}
}
