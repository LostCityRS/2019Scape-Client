package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!amf")
public class Class166_Sub6 extends Class166 {

	@OriginalMember(owner = "client!amf", name = "l", descriptor = "I")
	public static final int anInt2104 = 1;

	@OriginalMember(owner = "client!amf", name = "w", descriptor = "I")
	public static final int anInt2105 = 2;

	@OriginalMember(owner = "client!amf", name = "u", descriptor = "I")
	public static final int anInt2106 = 0;

	@OriginalMember(owner = "client!amf", name = "gz", descriptor = "Lclient!aof;")
	public static Class32_Sub5 aClass32_Sub5_1;

	@OriginalMember(owner = "client!amf", name = "<init>", descriptor = "(Lclient!ali;)V", line = 13)
	public Class166_Sub6(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
		Class325.method27299(this.anInt2379 * 960141055, 1333210654);
	}

	@OriginalMember(owner = "client!amf", name = "<init>", descriptor = "(ILclient!ali;)V", line = 18)
	public Class166_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
		Class325.method27299(this.anInt2379 * 960141055, 1042133145);
	}

	@OriginalMember(owner = "client!amf", name = "m", descriptor = "(IB)[[[B", line = 22)
	public static byte[][][] method15472(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) byte[][][] local3 = new byte[8][4][];
		@Pc(5) int local5 = arg0;
		@Pc(7) int local7 = arg0;
		@Pc(12) byte[] local12 = new byte[arg0 * arg0];
		@Pc(14) int local14 = 0;
		@Pc(16) int local16;
		@Pc(21) int local21;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 <= local16) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[0][0] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = local7 - 1; local16 >= 0; local16--) {
			for (local21 = 0; local21 < local7; local21++) {
				if (local21 <= local16) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[0][1] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 >= local16) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[0][2] = local12;
		local12 = new byte[local5 * local7];
		local14 = 0;
		for (local16 = local7 - 1; local16 >= 0; local16--) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 >= local16) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[0][3] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = local7 - 1; local16 >= 0; local16--) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 <= local16 >> 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[1][0] = local12;
		local12 = new byte[local5 * local7];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local14 >= 0 && local14 < local12.length) {
					if (local21 >= local16 << 1) {
						local12[local14] = -1;
					}
					local14++;
				} else {
					local14++;
				}
			}
		}
		local3[1][1] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = local5 - 1; local21 >= 0; local21--) {
				if (local21 <= local16 >> 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[1][2] = local12;
		local12 = new byte[local5 * local7];
		local14 = 0;
		for (local16 = local7 - 1; local16 >= 0; local16--) {
			for (local21 = local5 - 1; local21 >= 0; local21--) {
				if (local21 >= local16 << 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[1][3] = local12;
		local12 = new byte[local5 * local7];
		local14 = 0;
		for (local16 = local7 - 1; local16 >= 0; local16--) {
			for (local21 = local5 - 1; local21 >= 0; local21--) {
				if (local21 <= local16 >> 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[2][0] = local12;
		local12 = new byte[local5 * local7];
		local14 = 0;
		for (local16 = local7 - 1; local16 >= 0; local16--) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 >= local16 << 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[2][1] = local12;
		local12 = new byte[local5 * local7];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 <= local16 >> 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[2][2] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = local5 - 1; local21 >= 0; local21--) {
				if (local21 >= local16 << 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[2][3] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = local7 - 1; local16 >= 0; local16--) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 >= local16 >> 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[3][0] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 <= local16 << 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[3][1] = local12;
		local12 = new byte[local5 * local7];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = local5 - 1; local21 >= 0; local21--) {
				if (local21 >= local16 >> 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[3][2] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = local7 - 1; local16 >= 0; local16--) {
			for (local21 = local5 - 1; local21 >= 0; local21--) {
				if (local21 <= local16 << 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[3][3] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = local7 - 1; local16 >= 0; local16--) {
			for (local21 = local5 - 1; local21 >= 0; local21--) {
				if (local21 >= local16 >> 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[4][0] = local12;
		local12 = new byte[local5 * local7];
		local14 = 0;
		for (local16 = local7 - 1; local16 >= 0; local16--) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 <= local16 << 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[4][1] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 >= local16 >> 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[4][2] = local12;
		local12 = new byte[local5 * local7];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = local5 - 1; local21 >= 0; local21--) {
				if (local21 <= local16 << 1) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[4][3] = local12;
		local12 = new byte[local5 * local7];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 <= local5 / 2) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[5][0] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local16 <= local7 / 2) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[5][1] = local12;
		local12 = new byte[local5 * local7];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 >= local5 / 2) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[5][2] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local16 >= local7 / 2) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[5][3] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 <= local16 - local7 / 2) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[6][0] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = local7 - 1; local16 >= 0; local16--) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 <= local16 - local7 / 2) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[6][1] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = local7 - 1; local16 >= 0; local16--) {
			for (local21 = local5 - 1; local21 >= 0; local21--) {
				if (local21 <= local16 - local7 / 2) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[6][2] = local12;
		local12 = new byte[local5 * local7];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = local5 - 1; local21 >= 0; local21--) {
				if (local21 <= local16 - local7 / 2) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[6][3] = local12;
		local12 = new byte[local5 * local7];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 >= local16 - local7 / 2) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[7][0] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = local7 - 1; local16 >= 0; local16--) {
			for (local21 = 0; local21 < local5; local21++) {
				if (local21 >= local16 - local7 / 2) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[7][1] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = local7 - 1; local16 >= 0; local16--) {
			for (local21 = local5 - 1; local21 >= 0; local21--) {
				if (local21 >= local16 - local7 / 2) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[7][2] = local12;
		local12 = new byte[local7 * local5];
		local14 = 0;
		for (local16 = 0; local16 < local7; local16++) {
			for (local21 = local5 - 1; local21 >= 0; local21--) {
				if (local21 >= local16 - local7 / 2) {
					local12[local14] = -1;
				}
				local14++;
			}
		}
		local3[7][3] = local12;
		return local3;
	}

	@OriginalMember(owner = "client!amf", name = "o", descriptor = "(I)V", line = 23)
	public void method15473(@OriginalArg(0) int arg0) {
		if (this.aClass93_Sub36_49.method14378(580444600).method137((byte) -43) < 245) {
			this.anInt2379 = 0;
		}
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 2) {
			this.anInt2379 = this.method16545((byte) -75) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amf", name = "b", descriptor = "()V", line = 23)
	public void method15474() {
		if (this.aClass93_Sub36_49.method14378(-1234138995).method137((byte) -20) < 245) {
			this.anInt2379 = 0;
		}
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 2) {
			this.anInt2379 = this.method16545((byte) -91) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amf", name = "q", descriptor = "()V", line = 23)
	public void method15475() {
		if (this.aClass93_Sub36_49.method14378(2132097952).method137((byte) -50) < 245) {
			this.anInt2379 = 0;
		}
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 2) {
			this.anInt2379 = this.method16545((byte) 33) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amf", name = "x", descriptor = "()V", line = 23)
	public void method15476() {
		if (this.aClass93_Sub36_49.method14378(-427746633).method137((byte) -37) < 245) {
			this.anInt2379 = 0;
		}
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 2) {
			this.anInt2379 = this.method16545((byte) -20) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amf", name = "h", descriptor = "()V", line = 23)
	public void method15477() {
		if (this.aClass93_Sub36_49.method14378(-1709893743).method137((byte) -107) < 245) {
			this.anInt2379 = 0;
		}
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 2) {
			this.anInt2379 = this.method16545((byte) -11) * -88839937;
		}
	}

	@OriginalMember(owner = "client!amf", name = "f", descriptor = "()I", line = 28)
	@Override
	int method16544() {
		return this.aClass93_Sub36_49.method14378(-1869745180).method137((byte) -125) < 245 ? 0 : 2;
	}

	@OriginalMember(owner = "client!amf", name = "u", descriptor = "()I", line = 28)
	@Override
	int method16550() {
		return this.aClass93_Sub36_49.method14378(1504116838).method137((byte) -48) < 245 ? 0 : 2;
	}

	@OriginalMember(owner = "client!amf", name = "e", descriptor = "(B)I", line = 28)
	@Override
	int method16545(@OriginalArg(0) byte arg0) {
		return this.aClass93_Sub36_49.method14378(-817709165).method137((byte) -85) < 245 ? 0 : 2;
	}

	@OriginalMember(owner = "client!amf", name = "w", descriptor = "()I", line = 28)
	@Override
	int method16552() {
		return this.aClass93_Sub36_49.method14378(774568049).method137((byte) -33) < 245 ? 0 : 2;
	}

	@OriginalMember(owner = "client!amf", name = "l", descriptor = "()I", line = 28)
	@Override
	int method16549() {
		return this.aClass93_Sub36_49.method14378(1390250455).method137((byte) 6) < 245 ? 0 : 2;
	}

	@OriginalMember(owner = "client!amf", name = "s", descriptor = "(S)Z", line = 33)
	public boolean method15478(@OriginalArg(0) short arg0) {
		return this.aClass93_Sub36_49.method14378(-1114987535).method137((byte) -9) >= 245;
	}

	@OriginalMember(owner = "client!amf", name = "a", descriptor = "()Z", line = 33)
	public boolean method15479() {
		return this.aClass93_Sub36_49.method14378(-749343809).method137((byte) -122) >= 245;
	}

	@OriginalMember(owner = "client!amf", name = "f", descriptor = "(Lclient!acw;Ljava/lang/String;ILjava/lang/Throwable;I)V", line = 36)
	public static void method15480(@OriginalArg(0) Class72 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Throwable arg3, @OriginalArg(4) int arg4) {
		Class370.method27996(new Class601(arg0, arg1, arg2, arg3), -818774123);
	}

	@OriginalMember(owner = "client!amf", name = "z", descriptor = "(I)I", line = 38)
	@Override
	public int method16551(@OriginalArg(0) int arg0) {
		return this.aClass93_Sub36_49.method14378(1028486323).method137((byte) -125) < 245 ? 3 : 1;
	}

	@OriginalMember(owner = "client!amf", name = "p", descriptor = "(I)I", line = 38)
	@Override
	public int method16543(@OriginalArg(0) int arg0) {
		return this.aClass93_Sub36_49.method14378(1638033873).method137((byte) -2) < 245 ? 3 : 1;
	}

	@OriginalMember(owner = "client!amf", name = "n", descriptor = "(II)I", line = 38)
	@Override
	public int method16546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aClass93_Sub36_49.method14378(1504245062).method137((byte) -18) < 245 ? 3 : 1;
	}

	@OriginalMember(owner = "client!amf", name = "k", descriptor = "(II)V", line = 43)
	@Override
	void method16547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2379 = arg0 * -88839937;
		Class325.method27299(this.anInt2379 * 960141055, 6110017);
	}

	@OriginalMember(owner = "client!amf", name = "d", descriptor = "(I)V", line = 43)
	@Override
	void method16548(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
		Class325.method27299(this.anInt2379 * 960141055, -487946828);
	}

	@OriginalMember(owner = "client!amf", name = "c", descriptor = "(I)V", line = 43)
	@Override
	void method16553(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
		Class325.method27299(this.anInt2379 * 960141055, 1170771213);
	}

	@OriginalMember(owner = "client!amf", name = "n", descriptor = "(B)V", line = 46)
	static void method15481(@OriginalArg(0) byte arg0) {
		Class588.aClass588_3 = Class588.aClass588_1;
		Class676.aClass709_1 = Class709.aClass709_11;
		Class490.aClass700_1 = Class700.aClass700_20;
		Class103.aClass721_1 = Class721.aClass721_2;
		Class676.aClass704_1 = Class704.aClass704_5;
		Class325.aClass715_1 = Class715.aClass715_5;
		Class355.aString184 = null;
	}

	@OriginalMember(owner = "client!amf", name = "y", descriptor = "(I)I", line = 48)
	public int method15482(@OriginalArg(0) int arg0) {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amf", name = "g", descriptor = "()I", line = 48)
	public int method15483() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!amf", name = "p", descriptor = "(I)Lclient!zb;", line = 127)
	public static Class700 method15484(@OriginalArg(0) int arg0) {
		return Class490.aClass700_1 == null ? Class700.aClass700_20 : Class490.aClass700_1;
	}

	@OriginalMember(owner = "client!amf", name = "go", descriptor = "(B)V", line = 3438)
	static final void method15485(@OriginalArg(0) byte arg0) {
		@Pc(5) int local5 = Class26.anInt90 * 1489927680 + 256;
		@Pc(11) int local11 = Class20.anInt70 * -1850666496 + 256;
		@Pc(23) int local23 = Class305.method26802(local5, local11, Class512.anInt5209 * 1177442423, (byte) -63) - Class165.anInt2068 * -1400777707;
		if (Class256.anInt3853 * 1151351583 >= 100) {
			Class163.anInt2002 = Class26.anInt90 * 884609536 + -2035173632;
			Class270.anInt3884 = Class20.anInt70 * 243676672 + 1435337472;
			Class130_Sub2.anInt1117 = (Class305.method26802(Class163.anInt2002 * -1331168249, Class270.anInt3884 * 466086187, Class512.anInt5209 * 1177442423, (byte) -19) - Class165.anInt2068 * -1400777707) * 1820517185;
		} else {
			if (Class163.anInt2002 * -1331168249 < local5) {
				Class163.anInt2002 += ((local5 - Class163.anInt2002 * -1331168249) * 1151351583 * Class256.anInt3853 / 1000 + Class366.anInt4585 * -1516483055) * 1636217271;
				if (Class163.anInt2002 * -1331168249 > local5) {
					Class163.anInt2002 = local5 * 1636217271;
				}
			}
			if (Class163.anInt2002 * -1331168249 > local5) {
				Class163.anInt2002 -= (Class366.anInt4585 * -1516483055 + (Class163.anInt2002 * -1331168249 - local5) * Class256.anInt3853 * 1151351583 / 1000) * 1636217271;
				if (Class163.anInt2002 * -1331168249 < local5) {
					Class163.anInt2002 = local5 * 1636217271;
				}
			}
			if (Class130_Sub2.anInt1117 * 1055108289 < local23) {
				Class130_Sub2.anInt1117 += (Class366.anInt4585 * -1516483055 + (local23 - Class130_Sub2.anInt1117 * 1055108289) * Class256.anInt3853 * 1151351583 / 1000) * 1820517185;
				if (Class130_Sub2.anInt1117 * 1055108289 > local23) {
					Class130_Sub2.anInt1117 = local23 * 1820517185;
				}
			}
			if (Class130_Sub2.anInt1117 * 1055108289 > local23) {
				Class130_Sub2.anInt1117 -= (Class366.anInt4585 * -1516483055 + (Class130_Sub2.anInt1117 * 1055108289 - local23) * Class256.anInt3853 * 1151351583 / 1000) * 1820517185;
				if (Class130_Sub2.anInt1117 * 1055108289 < local23) {
					Class130_Sub2.anInt1117 = local23 * 1820517185;
				}
			}
			if (Class270.anInt3884 * 466086187 < local11) {
				Class270.anInt3884 += (-1516483055 * Class366.anInt4585 + Class256.anInt3853 * 1151351583 * (local11 - Class270.anInt3884 * 466086187) / 1000) * -967471741;
				if (Class270.anInt3884 * 466086187 > local11) {
					Class270.anInt3884 = local11 * -967471741;
				}
			}
			if (Class270.anInt3884 * 466086187 > local11) {
				Class270.anInt3884 -= (-1516483055 * Class366.anInt4585 + Class256.anInt3853 * 1151351583 * (Class270.anInt3884 * 466086187 - local11) / 1000) * -967471741;
				if (Class270.anInt3884 * 466086187 < local11) {
					Class270.anInt3884 = local11 * -967471741;
				}
			}
		}
		local5 = Class545.anInt5289 * -717754880 + 256;
		local11 = Class349.anInt4201 * -970841600 + 256;
		local23 = Class305.method26802(local5, local11, Class512.anInt5209 * 1177442423, (byte) -44) - Class290.anInt3911 * -1980774829;
		@Pc(293) int local293 = local5 - Class163.anInt2002 * -1331168249;
		@Pc(299) int local299 = local23 - Class130_Sub2.anInt1117 * 1055108289;
		@Pc(305) int local305 = local11 - Class270.anInt3884 * 466086187;
		@Pc(316) int local316 = (int) Math.sqrt((double) (local305 * local305 + local293 * local293));
		@Pc(327) int local327 = (int) (Math.atan2((double) local299, (double) local316) * 2607.5945876176133D) & 0x3FFF;
		@Pc(338) int local338 = (int) (Math.atan2((double) local293, (double) local305) * -2607.5945876176133D) & 0x3FFF;
		if (local327 < 1024) {
			local327 = 1024;
		}
		if (local327 > 3072) {
			local327 = 3072;
		}
		if (Class620.anInt5644 * 607613741 < local327) {
			Class620.anInt5644 += (Class5.anInt14 * 1762938653 + (local327 - Class620.anInt5644 * 607613741 >> 3) * Class174.anInt3297 * -283420141 / 1000 << 3) * -1151839067;
			if (Class620.anInt5644 * 607613741 > local327) {
				Class620.anInt5644 = local327 * -1151839067;
			}
		}
		if (Class620.anInt5644 * 607613741 > local327) {
			Class620.anInt5644 -= (Class5.anInt14 * 1762938653 + Class174.anInt3297 * -283420141 * (Class620.anInt5644 * 607613741 - local327 >> 3) / 1000 << 3) * -1151839067;
			if (Class620.anInt5644 * 607613741 < local327) {
				Class620.anInt5644 = local327 * -1151839067;
			}
		}
		@Pc(430) int local430 = local338 - Class24.anInt82 * -20667523;
		if (local430 > 8192) {
			local430 -= 16384;
		}
		if (local430 < -8192) {
			local430 += 16384;
		}
		local430 >>= 0x3;
		if (local430 > 0) {
			Class24.anInt82 += (Class174.anInt3297 * -283420141 * local430 / 1000 + Class5.anInt14 * 1762938653 << 3) * 1056124373;
			Class24.anInt82 = (Class24.anInt82 * -20667523 & 0x3FFF) * 1056124373;
		}
		if (local430 < 0) {
			Class24.anInt82 -= (-local430 * -283420141 * Class174.anInt3297 / 1000 + Class5.anInt14 * 1762938653 << 3) * 1056124373;
			Class24.anInt82 = (Class24.anInt82 * -20667523 & 0x3FFF) * 1056124373;
		}
		@Pc(505) int local505 = local338 - Class24.anInt82 * -20667523;
		if (local505 > 8192) {
			local505 -= 16384;
		}
		if (local505 < -8192) {
			local505 += 16384;
		}
		if (local505 < 0 && local430 > 0 || local505 > 0 && local430 < 0) {
			Class24.anInt82 = local338 * 1056124373;
		}
		Class348.anInt4199 = 0;
	}
}
