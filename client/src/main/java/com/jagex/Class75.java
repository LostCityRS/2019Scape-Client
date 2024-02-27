package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.io.IOException;

@OriginalClass("client!ad")
public final class Class75 {

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "Lclient!nu;")
	Class448 aClass448_1;

	@OriginalMember(owner = "client!ad", name = "t", descriptor = "Lclient!ug;")
	BufferedSocket aBufferedSocket_1;

	@OriginalMember(owner = "client!ad", name = "w", descriptor = "I")
	int anInt242;

	@OriginalMember(owner = "client!ad", name = "l", descriptor = "Lclient!aav;")
	public Class22 aClass22_1;

	@OriginalMember(owner = "client!ad", name = "r", descriptor = "I")
	int anInt244;

	@OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
	int anInt246;

	@OriginalMember(owner = "client!ad", name = "x", descriptor = "I")
	int anInt247;

	@OriginalMember(owner = "client!ad", name = "i", descriptor = "Lclient!aav;")
	Class22 aClass22_2;

	@OriginalMember(owner = "client!ad", name = "q", descriptor = "Lclient!nu;")
	Class448 aClass448_3;

	@OriginalMember(owner = "client!ad", name = "h", descriptor = "Lclient!nu;")
	Class448 aClass448_4;

	@OriginalMember(owner = "client!ad", name = "f", descriptor = "Lclient!aag;")
	Class8 aClass8_4 = new Class8();

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
	public int anInt249 = 0;

	@OriginalMember(owner = "client!ad", name = "u", descriptor = "Lclient!ald;")
	Packet aPacket_1 = new Packet(1700);

	@OriginalMember(owner = "client!ad", name = "g", descriptor = "Lclient!asa;")
	PacketBit aPacketBit_1 = new PacketBit(40000);

	@OriginalMember(owner = "client!ad", name = "m", descriptor = "Lclient!nu;")
	Class448 aClass448_2 = null;

	@OriginalMember(owner = "client!ad", name = "o", descriptor = "I")
	int anInt248 = 0;

	@OriginalMember(owner = "client!ad", name = "j", descriptor = "Z")
	boolean aBoolean34 = true;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
	int anInt245 = 0;

	@OriginalMember(owner = "client!ad", name = "s", descriptor = "I")
	public int anInt243 = 0;

	@OriginalMember(owner = "client!ad", name = "z", descriptor = "Z")
	public boolean aBoolean35 = false;

	@OriginalMember(owner = "client!ad", name = "p", descriptor = "Lclient!t;")
	Class566 aClass566_1 = new Class566();

	@OriginalMember(owner = "client!ad", name = "he", descriptor = "(Lclient!yp;I)V")
	static void method1340(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class630.method32716(local11, local14, false, 1, arg0, -1102022993);
	}

	@OriginalMember(owner = "client!ad", name = "aqs", descriptor = "(Lclient!yp;B)V")
	static void method1341(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5776 -= -825189621;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = -1;
	}

	@OriginalMember(owner = "client!ad", name = "axm", descriptor = "(Lclient!yp;I)V")
	static void method1342(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class43.anInt172 * 339534121;
	}

	@OriginalMember(owner = "client!ad", name = "w", descriptor = "(Lclient!di;IILclient!hx;Lclient!cg;III)V")
	static void method1343(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class327 arg3, @OriginalArg(4) Class98 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		for (@Pc(1) int local1 = 0; local1 < client.anInt3453 * -1702559601; local1++) {
			@Pc(14) Class80_Sub19 local14 = (Class80_Sub19) client.aClass24_18.method560((long) client.anIntArray304[local1]);
			if (local14 != null) {
				@Pc(20) Class120_Sub1_Sub1_Sub1_Sub1 local20 = (Class120_Sub1_Sub1_Sub1_Sub1) local14.anObject5;
				if (local20.method18805((byte) 0) && Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99 == local20.aByte99) {
					@Pc(32) Class335 local32 = local20.aClass335_1;
					if (local32 != null && local32.anIntArray416 != null) {
						local32 = local32.method27836(Class672.aClass134_1, Class672.aClass134_1, 1986616282);
					}
					if (local32 != null && local32.aBoolean822 && local32.aBoolean821) {
						@Pc(56) Class463 local56 = local20.method24552().aClass463_61;
						@Pc(66) int local66 = (int) local56.aFloat297 / 128 - arg1 / 128;
						@Pc(76) int local76 = (int) local56.aFloat296 / 128 - arg2 / 128;
						if (local32.anInt4224 * 302757259 == -1) {
							Class174.method24632(arg3, arg4, arg5, arg6, local66, local76, Class697.aClass99Array9[1], 1005680407);
						} else {
							Class669.method33495(arg0, arg4, arg3, arg5, arg6, local66, local76, local32.anInt4224 * 302757259, -2144877483);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "f", descriptor = "(II)I")
	public static int method1344(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!ad", name = "l", descriptor = "(IIFLclient!ms;I)V")
	public static void method1345(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Interface43 arg3, @OriginalArg(4) int arg4) {
		if (Class659.aClass138_6 != null) {
			Class659.aClass138_6.method11516(15439498).method29046(arg0, arg1, arg2, arg3, -1395334136);
		}
	}

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "()V")
	Class75() {
		@Pc(50) Thread local50 = new Thread(this.aClass566_1);
		local50.setDaemon(true);
		local50.setPriority(1);
		local50.start();
	}

	@OriginalMember(owner = "client!ad", name = "s", descriptor = "()V")
	public void method1313() throws IOException {
		if (this.aBufferedSocket_1 == null || this.anInt249 * 982154633 <= 0) {
			return;
		}
		this.aPacket_1.pos = 0;
		while (true) {
			@Pc(18) Class80_Sub31 local18 = (Class80_Sub31) this.aClass8_4.method247(129206984);
			if (local18 == null || local18.anInt1647 * -883470063 > this.aPacket_1.data.length - this.aPacket_1.pos * -1380987821) {
				this.aBufferedSocket_1.write(this.aPacket_1.data, 0, this.aPacket_1.pos * -1380987821, 779552044);
				this.anInt246 += this.aPacket_1.pos * 2145693327;
				this.anInt243 = 0;
				break;
			}
			this.aPacket_1.pdata(local18.aPacketBit_2.data, 0, local18.anInt1647 * -883470063);
			this.anInt249 -= local18.anInt1647 * 1566121289;
			local18.method24395((byte) 47);
			local18.aPacketBit_2.release();
			local18.method14403(-2050484493);
		}
	}

	@OriginalMember(owner = "client!ad", name = "t", descriptor = "(I)V")
	void method1314(@OriginalArg(0) int arg0) {
		this.aClass8_4.method260(598726277);
		this.anInt249 = 0;
	}

	@OriginalMember(owner = "client!ad", name = "f", descriptor = "(I)V")
	public void method1315(@OriginalArg(0) int arg0) throws IOException {
		if (this.aBufferedSocket_1 == null || this.anInt249 * 982154633 <= 0) {
			return;
		}
		this.aPacket_1.pos = 0;
		while (true) {
			@Pc(18) Class80_Sub31 local18 = (Class80_Sub31) this.aClass8_4.method247(129206984);
			if (local18 == null || local18.anInt1647 * -883470063 > this.aPacket_1.data.length - this.aPacket_1.pos * -1380987821) {
				this.aBufferedSocket_1.write(this.aPacket_1.data, 0, this.aPacket_1.pos * -1380987821, 779552044);
				this.anInt246 += this.aPacket_1.pos * 2145693327;
				this.anInt243 = 0;
				break;
			}
			this.aPacket_1.pdata(local18.aPacketBit_2.data, 0, local18.anInt1647 * -883470063);
			this.anInt249 -= local18.anInt1647 * 1566121289;
			local18.method24395((byte) 48);
			local18.aPacketBit_2.release();
			local18.method14403(-1963133313);
		}
	}

	@OriginalMember(owner = "client!ad", name = "l", descriptor = "(Lclient!ug;Ljava/lang/String;I)V")
	void method1316(@OriginalArg(0) BufferedSocket arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		this.aBufferedSocket_1 = arg0;
		this.aClass566_1.method31485(arg1, 470217233);
	}

	@OriginalMember(owner = "client!ad", name = "u", descriptor = "(B)V")
	void method1317(@OriginalArg(0) byte arg0) {
		if (client.currentCycle % 50 == 0) {
			this.anInt242 = this.anInt246 * -415615545;
			this.anInt246 = 0;
			this.anInt244 = this.anInt247 * -1637913863;
			this.anInt247 = 0;
		}
	}

	@OriginalMember(owner = "client!ad", name = "y", descriptor = "()V")
	void method1318() {
		if (this.aBufferedSocket_1 != null) {
			this.aBufferedSocket_1.close((short) -2193);
			this.aBufferedSocket_1 = null;
		}
		this.aClass566_1.method31485(null, 1948527449);
	}

	@OriginalMember(owner = "client!ad", name = "g", descriptor = "(S)V")
	void method1319(@OriginalArg(0) short arg0) {
		if (this.aBufferedSocket_1 != null) {
			this.aBufferedSocket_1.close((short) 2807);
			this.aBufferedSocket_1 = null;
		}
		this.aClass566_1.method31485(null, -589594244);
	}

	@OriginalMember(owner = "client!ad", name = "i", descriptor = "(I)V")
	void method1320(@OriginalArg(0) int arg0) {
		this.aBufferedSocket_1 = null;
		this.aClass566_1.method31485(null, -1503470621);
	}

	@OriginalMember(owner = "client!ad", name = "m", descriptor = "(B)Lclient!ug;")
	public BufferedSocket method1321(@OriginalArg(0) byte arg0) {
		return this.aBufferedSocket_1;
	}

	@OriginalMember(owner = "client!ad", name = "o", descriptor = "()V")
	void method1322() {
		this.aClass8_4.method260(757163201);
		this.anInt249 = 0;
	}

	@OriginalMember(owner = "client!ad", name = "w", descriptor = "(Lclient!aku;)V")
	public void method1323(@OriginalArg(0) Class80_Sub31 arg0) {
		this.aClass8_4.method232(arg0, 248656428);
		arg0.anInt1647 = arg0.aPacketBit_2.pos * 352601891;
		arg0.aPacketBit_2.pos = 0;
		this.anInt249 += arg0.anInt1647 * 1566121289;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "()V")
	void method1324() {
		this.aClass8_4.method260(1777986540);
		this.anInt249 = 0;
	}

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "(Lclient!aku;B)V")
	public void method1325(@OriginalArg(0) Class80_Sub31 arg0, @OriginalArg(1) byte arg1) {
		this.aClass8_4.method232(arg0, 2123943193);
		arg0.anInt1647 = arg0.aPacketBit_2.pos * 352601891;
		arg0.aPacketBit_2.pos = 0;
		this.anInt249 += arg0.anInt1647 * 1566121289;
	}

	@OriginalMember(owner = "client!ad", name = "k", descriptor = "()V")
	public void method1326() throws IOException {
		if (this.aBufferedSocket_1 == null || this.anInt249 * 982154633 <= 0) {
			return;
		}
		this.aPacket_1.pos = 0;
		while (true) {
			@Pc(18) Class80_Sub31 local18 = (Class80_Sub31) this.aClass8_4.method247(129206984);
			if (local18 == null || local18.anInt1647 * -883470063 > this.aPacket_1.data.length - this.aPacket_1.pos * -1380987821) {
				this.aBufferedSocket_1.write(this.aPacket_1.data, 0, this.aPacket_1.pos * -1380987821, 779552044);
				this.anInt246 += this.aPacket_1.pos * 2145693327;
				this.anInt243 = 0;
				break;
			}
			this.aPacket_1.pdata(local18.aPacketBit_2.data, 0, local18.anInt1647 * -883470063);
			this.anInt249 -= local18.anInt1647 * 1566121289;
			local18.method24395((byte) 22);
			local18.aPacketBit_2.release();
			local18.method14403(1519504256);
		}
	}

	@OriginalMember(owner = "client!ad", name = "x", descriptor = "(Lclient!aku;)V")
	public void method1327(@OriginalArg(0) Class80_Sub31 arg0) {
		this.aClass8_4.method232(arg0, -59718997);
		arg0.anInt1647 = arg0.aPacketBit_2.pos * 352601891;
		arg0.aPacketBit_2.pos = 0;
		this.anInt249 += arg0.anInt1647 * 1566121289;
	}

	@OriginalMember(owner = "client!ad", name = "r", descriptor = "(Lclient!aku;)V")
	public void method1328(@OriginalArg(0) Class80_Sub31 arg0) {
		this.aClass8_4.method232(arg0, 474819907);
		arg0.anInt1647 = arg0.aPacketBit_2.pos * 352601891;
		arg0.aPacketBit_2.pos = 0;
		this.anInt249 += arg0.anInt1647 * 1566121289;
	}

	@OriginalMember(owner = "client!ad", name = "q", descriptor = "(Lclient!aku;)V")
	public void method1329(@OriginalArg(0) Class80_Sub31 arg0) {
		this.aClass8_4.method232(arg0, 2024533934);
		arg0.anInt1647 = arg0.aPacketBit_2.pos * 352601891;
		arg0.aPacketBit_2.pos = 0;
		this.anInt249 += arg0.anInt1647 * 1566121289;
	}

	@OriginalMember(owner = "client!ad", name = "h", descriptor = "()V")
	void method1330() {
		if (client.currentCycle % 50 == 0) {
			this.anInt242 = this.anInt246 * -415615545;
			this.anInt246 = 0;
			this.anInt244 = this.anInt247 * -1637913863;
			this.anInt247 = 0;
		}
	}

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "(Lclient!ug;Ljava/lang/String;)V")
	void method1331(@OriginalArg(0) BufferedSocket arg0, @OriginalArg(1) String arg1) {
		this.aBufferedSocket_1 = arg0;
		this.aClass566_1.method31485(arg1, -102323749);
	}

	@OriginalMember(owner = "client!ad", name = "z", descriptor = "(Lclient!ug;Ljava/lang/String;)V")
	void method1332(@OriginalArg(0) BufferedSocket arg0, @OriginalArg(1) String arg1) {
		this.aBufferedSocket_1 = arg0;
		this.aClass566_1.method31485(arg1, -1477534283);
	}

	@OriginalMember(owner = "client!ad", name = "p", descriptor = "(Lclient!ug;Ljava/lang/String;)V")
	void method1333(@OriginalArg(0) BufferedSocket arg0, @OriginalArg(1) String arg1) {
		this.aBufferedSocket_1 = arg0;
		this.aClass566_1.method31485(arg1, 1335607427);
	}

	@OriginalMember(owner = "client!ad", name = "v", descriptor = "()V")
	void method1334() {
		if (this.aBufferedSocket_1 != null) {
			this.aBufferedSocket_1.close((short) -16355);
			this.aBufferedSocket_1 = null;
		}
		this.aClass566_1.method31485(null, -1601353017);
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "()V")
	void method1335() {
		this.aBufferedSocket_1 = null;
		this.aClass566_1.method31485(null, -1468832917);
	}

	@OriginalMember(owner = "client!ad", name = "n", descriptor = "()V")
	void method1336() {
		if (this.aBufferedSocket_1 != null) {
			this.aBufferedSocket_1.close((short) -1726);
			this.aBufferedSocket_1 = null;
		}
		this.aClass566_1.method31485(null, 418033736);
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "()V")
	void method1337() {
		this.aBufferedSocket_1 = null;
		this.aClass566_1.method31485(null, -1650393570);
	}

	@OriginalMember(owner = "client!ad", name = "j", descriptor = "()V")
	void method1338() {
		this.aClass8_4.method260(1368126782);
		this.anInt249 = 0;
	}

	@OriginalMember(owner = "client!ad", name = "ax", descriptor = "()Lclient!ug;")
	public BufferedSocket method1339() {
		return this.aBufferedSocket_1;
	}
}
