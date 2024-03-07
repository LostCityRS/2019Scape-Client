package com.jagex;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ul")
public class Class597 {

	@OriginalMember(owner = "client!ul", name = "n", descriptor = "I")
	static final int anInt5499 = 1;

	@OriginalMember(owner = "client!ul", name = "v", descriptor = "I")
	static final int anInt5500 = 9;

	@OriginalMember(owner = "client!ul", name = "k", descriptor = "I")
	static final int anInt5501 = 3;

	@OriginalMember(owner = "client!ul", name = "d", descriptor = "I")
	static final int anInt5503 = 6;

	@OriginalMember(owner = "client!ul", name = "l", descriptor = "I")
	static final int anInt5504 = 2;

	@OriginalMember(owner = "client!ul", name = "s", descriptor = "I")
	static final int anInt5505 = 11;

	@OriginalMember(owner = "client!ul", name = "f", descriptor = "I")
	static final int anInt5506 = 4;

	@OriginalMember(owner = "client!ul", name = "u", descriptor = "I")
	static final int anInt5508 = 3;

	@OriginalMember(owner = "client!ul", name = "c", descriptor = "I")
	static final int anInt5509 = 7;

	@OriginalMember(owner = "client!ul", name = "e", descriptor = "I")
	public static final int anInt5510 = 0;

	@OriginalMember(owner = "client!ul", name = "z", descriptor = "I")
	static final int anInt5511 = 4;

	@OriginalMember(owner = "client!ul", name = "o", descriptor = "I")
	static final int anInt5512 = 10;

	@OriginalMember(owner = "client!ul", name = "w", descriptor = "I")
	static final int anInt5513 = 5;

	@OriginalMember(owner = "client!ul", name = "y", descriptor = "I")
	static final int anInt5514 = 12;

	@OriginalMember(owner = "client!ul", name = "q", descriptor = "I")
	static final int anInt5515 = 13;

	@OriginalMember(owner = "client!ul", name = "x", descriptor = "I")
	static final int anInt5516 = 14;

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "I")
	static final int anInt5517 = 15;

	@OriginalMember(owner = "client!ul", name = "h", descriptor = "I")
	static final int anInt5518 = 16;

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "I")
	public static final int anInt5519 = 31;

	@OriginalMember(owner = "client!ul", name = "m", descriptor = "I")
	static final int anInt5521 = 2;

	@OriginalMember(owner = "client!ul", name = "r", descriptor = "I")
	static final int anInt5522 = 8;

	@OriginalMember(owner = "client!ul", name = "p", descriptor = "I")
	static final int anInt5526 = 5;

	@OriginalMember(owner = "client!ul", name = "xg", descriptor = "Ljava/util/Iterator;")
	static Iterator anIterator2;

	@OriginalMember(owner = "client!ul", name = "ai", descriptor = "I")
	int anInt5502;

	@OriginalMember(owner = "client!ul", name = "g", descriptor = "Lclient!akf;")
	public Class93_Sub16 aClass93_Sub16_3;

	@OriginalMember(owner = "client!ul", name = "ah", descriptor = "I")
	int anInt5523;

	@OriginalMember(owner = "client!ul", name = "al", descriptor = "I")
	int anInt5524;

	@OriginalMember(owner = "client!ul", name = "aw", descriptor = "I")
	int anInt5527;

	@OriginalMember(owner = "client!ul", name = "at", descriptor = "I")
	int anInt5507 = 1667838963;

	@OriginalMember(owner = "client!ul", name = "t", descriptor = "I")
	public int anInt5520;

	@OriginalMember(owner = "client!ul", name = "i", descriptor = "Z")
	boolean aBoolean821;

	@OriginalMember(owner = "client!ul", name = "j", descriptor = "Z")
	boolean aBoolean822;

	@OriginalMember(owner = "client!ul", name = "ae", descriptor = "[S")
	short[] aShortArray142;

	@OriginalMember(owner = "client!ul", name = "ag", descriptor = "I")
	public int anInt5528;

	@OriginalMember(owner = "client!ul", name = "ac", descriptor = "I")
	int anInt5525;

	@OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Lclient!dh;ILclient!alw;I)V", line = 46)
	public Class597(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Packet arg2, @OriginalArg(3) int arg3) {
		if (Class288.anIntArray370 == null) {
			Class290.method26563(182292977);
		}
		this.anInt5520 = arg2.g1((short) 16384) * -348646843;
		this.aBoolean821 = (this.anInt5520 * -1484967795 & 0x8) != 0;
		this.aBoolean822 = (this.anInt5520 * -1484967795 & 0x10) != 0;
		this.anInt5520 = (this.anInt5520 * -1484967795 & 0x7) * -348646843;
		@Pc(56) int local56 = arg2.g2(-1434290800) << arg3;
		@Pc(62) int local62 = arg2.g2(-1434290800) << arg3;
		@Pc(68) int local68 = arg2.g2(-1434290800) << arg3;
		@Pc(72) int local72 = arg2.g1((short) 16384);
		@Pc(78) int local78 = local72 * 2 + 1;
		this.aShortArray142 = new short[local78];
		@Pc(84) int local84;
		for (local84 = 0; local84 < this.aShortArray142.length; local84++) {
			@Pc(94) short local94 = (short) arg2.g2(-1434290800);
			@Pc(98) int local98 = local94 >>> 8;
			@Pc(102) int local102 = local94 & 0xFF;
			if (local98 >= local78) {
				local98 = local78 - 1;
			}
			if (local102 > local78 - local98) {
				local102 = local78 - local98;
			}
			this.aShortArray142[local84] = (short) (local98 << 8 | local102);
		}
		local72 = (0x1 << arg1 >> 1) + (local72 << arg1);
		local84 = Class685.anIntArray524 == null ? Class685.anIntArray522[Class366.method27947(arg2.g2(-1434290800), -328645812) & 0xFFFF] : Class685.anIntArray524[arg2.g2(-1434290800)];
		@Pc(163) int local163 = arg2.g1((short) 16384);
		this.anInt5528 = (local163 & 0x1F) * 219824953;
		this.anInt5525 = ((local163 & 0xE0) << 3) * -102991915;
		if (this.anInt5528 * 365017865 != 31) {
			this.method31772(-1852746510);
		}
		this.anInt5507 = arg2.g2s((byte) -97) * -1667838963;
		this.method31766(arg0, local56, local68, local62, local72, local84, 1702353788);
	}

	@OriginalMember(owner = "client!ul", name = "e", descriptor = "(Lclient!dh;IIIIII)V", line = 77)
	void method31766(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass93_Sub16_3 = arg0.method20507(arg1, arg2, arg3, arg4, arg5, 1.0F);
	}

	@OriginalMember(owner = "client!ul", name = "w", descriptor = "(Lclient!dh;IIIII)V", line = 77)
	void method31767(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass93_Sub16_3 = arg0.method20507(arg1, arg2, arg3, arg4, arg5, 1.0F);
	}

	@OriginalMember(owner = "client!ul", name = "n", descriptor = "(IIIII)V", line = 81)
	public void method31768(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt5523 = arg0 * -225441611;
		this.anInt5527 = arg3 * 1691663947;
		this.anInt5502 = arg2 * 1968954047;
		this.anInt5524 = arg1 * 291390787;
	}

	@OriginalMember(owner = "client!ul", name = "l", descriptor = "(IIII)V", line = 81)
	public void method31769(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5523 = arg0 * -225441611;
		this.anInt5527 = arg3 * 1691663947;
		this.anInt5502 = arg2 * 1968954047;
		this.anInt5524 = arg1 * 291390787;
	}

	@OriginalMember(owner = "client!ul", name = "u", descriptor = "(IIII)V", line = 81)
	public void method31770(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5523 = arg0 * -225441611;
		this.anInt5527 = arg3 * 1691663947;
		this.anInt5502 = arg2 * 1968954047;
		this.anInt5524 = arg1 * 291390787;
	}

	@OriginalMember(owner = "client!ul", name = "z", descriptor = "()V", line = 88)
	void method31771() {
		switch(this.anInt5528 * 365017865) {
			case 2:
				this.anInt5523 = -225441611;
				this.anInt5527 = 0;
				this.anInt5502 = -556402688;
				this.anInt5524 = -232122368;
				break;
			case 3:
				this.anInt5523 = -225441611;
				this.anInt5527 = 0;
				this.anInt5502 = -556402688;
				this.anInt5524 = -464244736;
				break;
			case 4:
				this.anInt5523 = -901766444;
				this.anInt5527 = 0;
				this.anInt5502 = -556402688;
				this.anInt5524 = -232122368;
				break;
			case 5:
				this.anInt5523 = -901766444;
				this.anInt5527 = 0;
				this.anInt5502 = -556402688;
				this.anInt5524 = -928489472;
				break;
			case 6:
				this.anInt5523 = -676324833;
				this.anInt5527 = 666334976;
				this.anInt5502 = 328219904;
				this.anInt5524 = -232122368;
				break;
			case 7:
				this.anInt5523 = -676324833;
				this.anInt5527 = 666334976;
				this.anInt5502 = 328219904;
				this.anInt5524 = -464244736;
				break;
			case 8:
				this.anInt5523 = -676324833;
				this.anInt5527 = 1392061440;
				this.anInt5502 = 1869282304;
				this.anInt5524 = -232122368;
				break;
			case 9:
				this.anInt5523 = -676324833;
				this.anInt5527 = 1392061440;
				this.anInt5502 = 1869282304;
				this.anInt5524 = -464244736;
				break;
			case 10:
				this.anInt5523 = -676324833;
				this.anInt5527 = -59391488;
				this.anInt5502 = -1212842496;
				this.anInt5524 = -232122368;
				break;
			case 11:
				this.anInt5523 = -676324833;
				this.anInt5527 = -59391488;
				this.anInt5502 = -1212842496;
				this.anInt5524 = -464244736;
				break;
			case 12:
				this.anInt5523 = -450883222;
				this.anInt5527 = 0;
				this.anInt5502 = -556402688;
				this.anInt5524 = -232122368;
				break;
			case 13:
				this.anInt5523 = -450883222;
				this.anInt5527 = 0;
				this.anInt5502 = -556402688;
				this.anInt5524 = -928489472;
				break;
			case 14:
				this.anInt5523 = -225441611;
				this.anInt5527 = 666334976;
				this.anInt5502 = 328219904;
				this.anInt5524 = -232122368;
				break;
			case 15:
				this.anInt5523 = -225441611;
				this.anInt5527 = -59391488;
				this.anInt5502 = -1212842496;
				this.anInt5524 = -464244736;
				break;
			case 16:
				this.anInt5523 = -225441611;
				this.anInt5527 = -785117952;
				this.anInt5502 = 1541062400;
				this.anInt5524 = -928489472;
				break;
			default:
				this.anInt5527 = 0;
				this.anInt5523 = 0;
				this.anInt5502 = -556402688;
				this.anInt5524 = -232122368;
		}
	}

	@OriginalMember(owner = "client!ul", name = "m", descriptor = "(I)V", line = 88)
	void method31772(@OriginalArg(0) int arg0) {
		switch(this.anInt5528 * 365017865) {
			case 2:
				this.anInt5523 = -225441611;
				this.anInt5527 = 0;
				this.anInt5502 = -556402688;
				this.anInt5524 = -232122368;
				break;
			case 3:
				this.anInt5523 = -225441611;
				this.anInt5527 = 0;
				this.anInt5502 = -556402688;
				this.anInt5524 = -464244736;
				break;
			case 4:
				this.anInt5523 = -901766444;
				this.anInt5527 = 0;
				this.anInt5502 = -556402688;
				this.anInt5524 = -232122368;
				break;
			case 5:
				this.anInt5523 = -901766444;
				this.anInt5527 = 0;
				this.anInt5502 = -556402688;
				this.anInt5524 = -928489472;
				break;
			case 6:
				this.anInt5523 = -676324833;
				this.anInt5527 = 666334976;
				this.anInt5502 = 328219904;
				this.anInt5524 = -232122368;
				break;
			case 7:
				this.anInt5523 = -676324833;
				this.anInt5527 = 666334976;
				this.anInt5502 = 328219904;
				this.anInt5524 = -464244736;
				break;
			case 8:
				this.anInt5523 = -676324833;
				this.anInt5527 = 1392061440;
				this.anInt5502 = 1869282304;
				this.anInt5524 = -232122368;
				break;
			case 9:
				this.anInt5523 = -676324833;
				this.anInt5527 = 1392061440;
				this.anInt5502 = 1869282304;
				this.anInt5524 = -464244736;
				break;
			case 10:
				this.anInt5523 = -676324833;
				this.anInt5527 = -59391488;
				this.anInt5502 = -1212842496;
				this.anInt5524 = -232122368;
				break;
			case 11:
				this.anInt5523 = -676324833;
				this.anInt5527 = -59391488;
				this.anInt5502 = -1212842496;
				this.anInt5524 = -464244736;
				break;
			case 12:
				this.anInt5523 = -450883222;
				this.anInt5527 = 0;
				this.anInt5502 = -556402688;
				this.anInt5524 = -232122368;
				break;
			case 13:
				this.anInt5523 = -450883222;
				this.anInt5527 = 0;
				this.anInt5502 = -556402688;
				this.anInt5524 = -928489472;
				break;
			case 14:
				this.anInt5523 = -225441611;
				this.anInt5527 = 666334976;
				this.anInt5502 = 328219904;
				this.anInt5524 = -232122368;
				break;
			case 15:
				this.anInt5523 = -225441611;
				this.anInt5527 = -59391488;
				this.anInt5502 = -1212842496;
				this.anInt5524 = -464244736;
				break;
			case 16:
				this.anInt5523 = -225441611;
				this.anInt5527 = -785117952;
				this.anInt5502 = 1541062400;
				this.anInt5524 = -928489472;
				break;
			default:
				this.anInt5527 = 0;
				this.anInt5523 = 0;
				this.anInt5502 = -556402688;
				this.anInt5524 = -232122368;
		}
	}

	@OriginalMember(owner = "client!ul", name = "k", descriptor = "(IZI)V", line = 190)
	void method31773(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(32) int local32;
		if (arg1) {
			local32 = 2048;
		} else {
			@Pc(17) int local17 = this.anInt5525 * 253167997 + arg0 * this.anInt5524 * 2057006955 / 50 & 0x7FF;
			switch(this.anInt5523 * -694770275) {
				case 1:
					local32 = (Class464.anIntArray451[local17 << 3] >> 4) + 1024;
					break;
				case 2:
					local32 = local17;
					break;
				case 3:
					local32 = Class288.anIntArray370[local17] >> 1;
					break;
				case 4:
					local32 = local17 >> 10 << 11;
					break;
				case 5:
					local32 = (local17 < 1024 ? local17 : 2048 - local17) << 1;
					break;
				default:
					local32 = 2048;
			}
		}
		@Pc(84) float local84 = (float) (this.anInt5527 * -643196061 + (this.anInt5502 * 15504703 * local32 >> 11)) / 2048.0F;
		@Pc(91) float local91 = local84 * this.aClass93_Sub16_3.method13540((byte) 47);
		this.aClass93_Sub16_3.method13541(local91, (byte) 18);
		this.aClass93_Sub16_3.method13571(1893439023);
	}

	@OriginalMember(owner = "client!ul", name = "p", descriptor = "(IZ)V", line = 190)
	void method31774(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(32) int local32;
		if (arg1) {
			local32 = 2048;
		} else {
			@Pc(17) int local17 = this.anInt5525 * 253167997 + arg0 * this.anInt5524 * 2057006955 / 50 & 0x7FF;
			switch(this.anInt5523 * -694770275) {
				case 1:
					local32 = (Class464.anIntArray451[local17 << 3] >> 4) + 1024;
					break;
				case 2:
					local32 = local17;
					break;
				case 3:
					local32 = Class288.anIntArray370[local17] >> 1;
					break;
				case 4:
					local32 = local17 >> 10 << 11;
					break;
				case 5:
					local32 = (local17 < 1024 ? local17 : 2048 - local17) << 1;
					break;
				default:
					local32 = 2048;
			}
		}
		@Pc(84) float local84 = (float) (this.anInt5527 * -643196061 + (this.anInt5502 * 15504703 * local32 >> 11)) / 2048.0F;
		@Pc(91) float local91 = local84 * this.aClass93_Sub16_3.method13540((byte) 97);
		this.aClass93_Sub16_3.method13541(local91, (byte) 2);
		this.aClass93_Sub16_3.method13571(1893439023);
	}

	@OriginalMember(owner = "client!ul", name = "d", descriptor = "(IZ)V", line = 190)
	void method31775(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(32) int local32;
		if (arg1) {
			local32 = 2048;
		} else {
			@Pc(17) int local17 = this.anInt5525 * 253167997 + arg0 * this.anInt5524 * 2057006955 / 50 & 0x7FF;
			switch(this.anInt5523 * -694770275) {
				case 1:
					local32 = (Class464.anIntArray451[local17 << 3] >> 4) + 1024;
					break;
				case 2:
					local32 = local17;
					break;
				case 3:
					local32 = Class288.anIntArray370[local17] >> 1;
					break;
				case 4:
					local32 = local17 >> 10 << 11;
					break;
				case 5:
					local32 = (local17 < 1024 ? local17 : 2048 - local17) << 1;
					break;
				default:
					local32 = 2048;
			}
		}
		@Pc(84) float local84 = (float) (this.anInt5527 * -643196061 + (this.anInt5502 * 15504703 * local32 >> 11)) / 2048.0F;
		@Pc(91) float local91 = local84 * this.aClass93_Sub16_3.method13540((byte) 108);
		this.aClass93_Sub16_3.method13541(local91, (byte) -47);
		this.aClass93_Sub16_3.method13571(1893439023);
	}

	@OriginalMember(owner = "client!ul", name = "r", descriptor = "()V", line = 221)
	static void method31776() {
		Class288.anIntArray370 = Class122_Sub3.method10156(2048, 35, 8, 8, 4, 0.4F, true, 2018772054);
	}

	@OriginalMember(owner = "client!ul", name = "c", descriptor = "()V", line = 221)
	static void method31777() {
		Class288.anIntArray370 = Class122_Sub3.method10156(2048, 35, 8, 8, 4, 0.4F, true, 2117174641);
	}

	@OriginalMember(owner = "client!ul", name = "v", descriptor = "()V", line = 221)
	static void method31778() {
		Class288.anIntArray370 = Class122_Sub3.method10156(2048, 35, 8, 8, 4, 0.4F, true, 2064110556);
	}

	@OriginalMember(owner = "client!ul", name = "as", descriptor = "(ILjava/lang/String;Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;I)V", line = 718)
	public static final void method31779(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Color arg2, @OriginalArg(3) Color arg3, @OriginalArg(4) Color arg4, @OriginalArg(5) int arg5) {
		try {
			@Pc(2) Graphics local2 = Class125_Sub3.aCanvas1.getGraphics();
			if (Class68.aFont1 == null) {
				Class68.aFont1 = new Font("Helvetica", 1, 13);
			}
			if (arg2 == null) {
				arg2 = new Color(140, 17, 17);
			}
			if (arg3 == null) {
				arg3 = new Color(140, 17, 17);
			}
			if (arg4 == null) {
				arg4 = new Color(255, 255, 255);
			}
			@Pc(75) int local75;
			@Pc(83) int local83;
			try {
				if (Class115.anImage3 == null) {
					Class115.anImage3 = Class125_Sub3.aCanvas1.createImage(Class553.width * -1378711501, Class553.height * 2091353777);
				}
				@Pc(54) Graphics local54 = Class115.anImage3.getGraphics();
				local54.setColor(Color.black);
				local54.fillRect(0, 0, Class553.width * -1378711501, Class553.height * 2091353777);
				local75 = Class553.width * -1378711501 / 2 - 152;
				local83 = Class553.height * 2091353777 / 2 - 18;
				local54.setColor(arg3);
				local54.drawRect(local75, local83, 303, 33);
				local54.setColor(arg2);
				local54.fillRect(local75 + 2, local83 + 2, arg0 * 3, 30);
				local54.setColor(Color.black);
				local54.drawRect(local75 + 1, local83 + 1, 301, 31);
				local54.fillRect(arg0 * 3 + 2 + local75, local83 + 2, 300 - arg0 * 3, 30);
				local54.setFont(Class68.aFont1);
				local54.setColor(arg4);
				local54.drawString(arg1, local75 + (304 - arg1.length() * 6) / 2, local83 + 22);
				if (Class553.aString133 != null) {
					local54.setFont(Class68.aFont1);
					local54.setColor(arg4);
					local54.drawString(Class553.aString133, Class553.width * -1378711501 / 2 - Class553.aString133.length() * 6 / 2, Class553.height * 2091353777 / 2 - 26);
				}
				local2.drawImage(Class115.anImage3, 0, 0, null);
			} catch (@Pc(200) Exception local200) {
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Class553.width * -1378711501, Class553.height * 2091353777);
				local75 = Class553.width * -1378711501 / 2 - 152;
				local83 = Class553.height * 2091353777 / 2 - 18;
				local2.setColor(arg3);
				local2.drawRect(local75, local83, 303, 33);
				local2.setColor(arg2);
				local2.fillRect(local75 + 2, local83 + 2, arg0 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local75 + 1, local83 + 1, 301, 31);
				local2.fillRect(arg0 * 3 + local75 + 2, local83 + 2, 300 - arg0 * 3, 30);
				local2.setFont(Class68.aFont1);
				local2.setColor(arg4);
				if (Class553.aString133 != null) {
					local2.setFont(Class68.aFont1);
					local2.setColor(arg4);
					local2.drawString(Class553.aString133, Class553.width * -1378711501 / 2 - Class553.aString133.length() * 6 / 2, Class553.height * 2091353777 / 2 - 26);
				}
				local2.drawString(arg1, local75 + (304 - arg1.length() * 6) / 2, local83 + 22);
			}
		} catch (@Pc(338) Exception local338) {
			Class125_Sub3.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!ul", name = "br", descriptor = "(Lclient!yf;I)V", line = 5232)
	static final void method31780(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(16) boolean local16 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091] != 0;
		if (Class520.selfPlayer.aClass658_1 != null) {
			Class520.selfPlayer.aClass658_1.method32768(local16, (byte) 73);
		}
	}

	@OriginalMember(owner = "client!ul", name = "xk", descriptor = "(Lclient!yf;I)V", line = 9222)
	static final void method31781(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class431.method28772(local13, local23, true, (byte) 113);
	}

	@OriginalMember(owner = "client!ul", name = "agl", descriptor = "(Lclient!yf;I)V", line = 10767)
	static final void method31782(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		@Pc(29) Class87 local29 = (Class87) Class124.aClass32_Sub21_7.method18261(local23, -705495115);
		if (local29.method1511(1429228259)) {
			arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = ((Class47) Class277.aClass32_Sub12_1.method18261(local13, -1108511711)).method949(local23, local29.aString11, (byte) -76);
		} else {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = ((Class47) Class277.aClass32_Sub12_1.method18261(local13, -83147903)).method943(local23, local29.anInt265 * 951920133, 1208021862);
		}
	}

	@OriginalMember(owner = "client!ul", name = "atz", descriptor = "(Lclient!yf;I)V", line = 13293)
	static final void method31783(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class51.options.aClass166_Sub7_1.method15506((byte) -125);
	}

	@OriginalMember(owner = "client!ul", name = "aze", descriptor = "(Lclient!yf;I)V", line = 14119)
	static final void method31784(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) boolean local1 = true;
		if (client.javascript) {
			try {
				@Pc(7) Object local7 = Class447.aClass447_8.method28906((short) 255);
				if (local7 != null) {
					local1 = (Boolean) local7;
				}
			} catch (@Pc(15) Throwable local15) {
			}
		}
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local1 ? 1 : 0;
	}
}
