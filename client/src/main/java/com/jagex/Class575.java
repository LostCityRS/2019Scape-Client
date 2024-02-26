package com.jagex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine.Info;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tl")
public final class Class575 {

	@OriginalMember(owner = "client!tl", name = "l", descriptor = "I")
	int anInt5285;

	@OriginalMember(owner = "client!tl", name = "g", descriptor = "I")
	int anInt5286;

	// $FF: synthetic field
	@OriginalMember(owner = "client!tl", name = "this$0", descriptor = "Lclient!aie;")
	final Class138_Sub1 aClass138_Sub1_3;

	@OriginalMember(owner = "client!tl", name = "o", descriptor = "I")
	int anInt5288;

	@OriginalMember(owner = "client!tl", name = "j", descriptor = "I")
	int anInt5289;

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "Ljava/util/List;")
	List aList23;

	@OriginalMember(owner = "client!tl", name = "m", descriptor = "F")
	float aFloat335;

	@OriginalMember(owner = "client!tl", name = "f", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
	SourceDataLine aSourceDataLine1;

	@OriginalMember(owner = "client!tl", name = "e", descriptor = "[B")
	byte[] aByteArray103;

	@OriginalMember(owner = "client!tl", name = "u", descriptor = "[B")
	byte[] aByteArray102;

	@OriginalMember(owner = "client!tl", name = "i", descriptor = "I")
	int anInt5287;

	@OriginalMember(owner = "client!tl", name = "t", descriptor = "Z")
	boolean aBoolean921;

	@OriginalMember(owner = "client!tl", name = "nl", descriptor = "(Lclient!yp;I)V")
	static void method31782(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2126732858);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class515.method30573(local16, local22, arg0, 2140457216);
	}

	@OriginalMember(owner = "client!tl", name = "aeo", descriptor = "(Lclient!yp;I)V")
	static void method31783(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		if (local13 == 0) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = (int) Math.pow((double) local13, (double) local23);
		}
	}

	@OriginalMember(owner = "client!tl", name = "ahn", descriptor = "(Lclient!yp;I)V")
	static void method31784(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = client.anInt3513 * -1403352079;
	}

	@OriginalMember(owner = "client!tl", name = "ef", descriptor = "(ZI)V")
	public static void method31785(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		Class159_Sub1.aBoolean405 = arg0;
	}

	@OriginalMember(owner = "client!tl", name = "jk", descriptor = "(IIIIIII)V")
	static void method31786(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) Class101[] local1 = client.aClass101Array1;
		for (@Pc(3) int local3 = 0; local3 < local1.length; local3++) {
			@Pc(11) Class101 local11 = local1[local3];
			if (local11 != null && local11.anInt467 * 1614016575 == 2) {
				Class66.method1240(local11.anInt463 * -299343395, local11.anInt466 * -191529145, local11.anInt465 * -1207974023, 0, local11.anInt468 * -1914249634, false, false, -1995742121);
				if (client.aFloatArray95[0] > -1.0F && client.anInt3436 % 20 < 10) {
					@Pc(59) Class99 local59 = Class668.aClass99Array8[local11.anInt461 * -168952975];
					@Pc(69) int local69 = (int) (client.aFloatArray95[0] + (float) arg0 - 12.0F);
					@Pc(79) int local79 = (int) ((float) arg1 + client.aFloatArray95[1] - 28.0F);
					local59.method18225(local69, local79);
				}
			}
		}
	}

	@OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(Lclient!aie;FI)V")
	Class575(@OriginalArg(0) Class138_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2) {
		this.aClass138_Sub1_3 = arg0;
		this.anInt5288 = -1511444592;
		this.anInt5289 = -2032526494;
		this.aList23 = new ArrayList();
		if (!this.aBoolean921) {
			this.aFloat335 = arg1;
			if (this.anInt5288 * -1155035319 > 16) {
				throw new RuntimeException("");
			}
			try {
				@Pc(49) AudioFormat local49 = new AudioFormat(this.aFloat335, this.anInt5288 * -1155035319, this.anInt5289 * -1390601391, true, false);
				try {
					@Pc(56) Info local56 = new Info(SourceDataLine.class, local49, arg2);
					this.aSourceDataLine1 = (SourceDataLine) AudioSystem.getLine(local56);
				} catch (@Pc(63) IllegalArgumentException local63) {
					return;
				}
				this.aSourceDataLine1.open(local49, arg2);
				this.aSourceDataLine1.start();
			} catch (@Pc(74) LineUnavailableException local74) {
				return;
			}
			this.aByteArray103 = new byte[arg2];
			this.aByteArray102 = new byte[this.anInt5288 * -1155035319 / 8];
			this.anInt5287 = 0;
			this.aBoolean921 = true;
		}
	}

	@OriginalMember(owner = "client!tl", name = "e", descriptor = "(B)V")
	void method31771(@OriginalArg(0) byte arg0) {
		synchronized (this) {
			@Pc(5) int local5 = Integer.MAX_VALUE;
			@Pc(18) double local18 = (double) (this.anInt5289 * -1390601391 * (this.anInt5288 * -1155035319 / 8));
			@Pc(20) boolean local20 = false;
			@Pc(24) Iterator local24 = this.aList23.iterator();
			while (local24.hasNext()) {
				@Pc(31) Class571 local31 = (Class571) local24.next();
				@Pc(40) int local40 = local31.aByteArray100.length - local31.anInt5272 * -1305975959;
				if (local31.aFloat334 != this.aFloat335) {
					local40 = (int) ((float) local40 * (this.aFloat335 / local31.aFloat334));
					local40 = (int) (local18 * Math.ceil((double) local40 / local18));
				}
				local31.anInt5268 = local40 * 577552175;
				if (local40 > 0 && local40 < local5) {
					local20 = true;
					local5 = local40;
				}
			}
			if (local5 > this.anInt5285 * 14563069) {
				local5 = this.anInt5285 * 14563069;
			}
			if (local5 != 0 && local20) {
				@Pc(105) int local105 = this.anInt5288 * -1155035319 / 8;
				@Pc(109) Iterator local109 = this.aList23.iterator();
				while (true) {
					@Pc(116) Class571 local116;
					do {
						if (!local109.hasNext()) {
							this.anInt5286 = local5 * 71284873;
							return;
						}
						local116 = (Class571) local109.next();
					} while (local116.anInt5268 * -606935089 < local5);
					@Pc(128) int local128 = this.anInt5287 * 1543257827;
					@Pc(130) int local130 = 0;
					@Pc(137) int local137 = local116.anInt5270 * -328462021 / 8;
					@Pc(139) double local139 = 0.0D;
					@Pc(141) int local141 = 0;
					@Pc(145) double local145 = (double) this.aFloat335;
					@Pc(149) double local149 = (double) local116.aFloat334;
					@Pc(154) int local154 = local116.anInt5269 * -782283683;
					while (local116.anInt5268 * -606935089 > 0 && local130 < local5) {
						@Pc(164) short local164 = 0;
						@Pc(166) short local166 = 0;
						@Pc(169) byte[] local169 = this.aByteArray102;
						for (@Pc(171) int local171 = 0; local171 < local169.length; local171++) {
							local169[local171] = this.aByteArray103[local128 + local171];
							local164 = (short) (local164 | (local169[local171] & 0xFF) << local171 * 8);
						}
						@Pc(208) byte[] local208;
						if (this.aFloat335 == local116.aFloat334) {
							local208 = local116.aByteArray101;
							for (@Pc(396) int local396 = 0; local396 < local208.length; local396++) {
								local208[local396] = local116.aByteArray100[local396 + local116.anInt5269 * -782283683];
								local166 = (short) (local166 | (local208[local396] & 0xFF) << local396 * 8);
							}
							local116.anInt5269 += local137 * -1422596107;
							local116.anInt5269 = -782283683 * local116.anInt5269 % local116.aByteArray100.length * -1422596107;
							local116.anInt5272 += local137 * 1484414169;
						} else {
							local208 = local116.aByteArray101;
							@Pc(215) float local215 = (float) (local139 / local145 * local149);
							@Pc(220) float local220 = (float) Math.floor((double) local215);
							@Pc(222) short local222 = 0;
							@Pc(224) short local224 = 0;
							@Pc(229) int local229 = (int) Math.floor((double) local215);
							@Pc(234) int local234 = (int) Math.ceil((double) local215);
							@Pc(249) int local249 = local116.anInt5271 * 635496503 * local208.length * local229 + local141 * local208.length;
							@Pc(264) int local264 = local116.anInt5271 * 635496503 * local208.length * local234 + local208.length * local141;
							@Pc(268) int local268 = local249 + local154;
							@Pc(272) int local272 = local264 + local154;
							@Pc(278) int local278 = local268 % local116.aByteArray100.length;
							@Pc(284) int local284 = local272 % local116.aByteArray100.length;
							@Pc(286) int local286;
							for (local286 = 0; local286 < local208.length; local286++) {
								local208[local286] = local116.aByteArray100[local286 + local278];
								local222 = (short) (local222 | (local208[local286] & 0xFF) << local286 * 8);
							}
							for (local286 = 0; local286 < local208.length; local286++) {
								local208[local286] = local116.aByteArray100[local284 + local286];
								local224 = (short) (local224 | (local208[local286] & 0xFF) << local286 * 8);
							}
							@Pc(348) float local348 = local215 - local220;
							if (local348 < 0.0F || local348 > 1.0F) {
								throw new RuntimeException("");
							}
							@Pc(366) float local366 = (float) (local224 - local222);
							local166 = (short) ((float) local222 + local366 * local348);
							local141++;
							local141 %= local116.anInt5271 * 635496503;
							if (local141 == 0) {
								local139++;
							}
						}
						local166 += local164;
						if (local166 > 32767) {
							local166 = 32767;
						}
						if (local166 < -32768) {
							local166 = -32768;
						}
						this.aByteArray103[local128] = (byte) local166;
						this.aByteArray103[local128 + 1] = (byte) (local166 >> 8);
						local128 += local105;
						local128 %= this.aByteArray103.length;
						local130 += local137;
					}
					if (local116.aFloat334 != this.aFloat335) {
						@Pc(516) double local516 = local149 / local145 * (double) local5;
						@Pc(524) int local524 = (int) (local18 * Math.ceil(local516 / local18));
						local116.anInt5269 += local524 * -1422596107;
						local116.anInt5269 = local116.anInt5269 * -782283683 % local116.aByteArray100.length * -1422596107;
						local116.anInt5272 += local524 * 1484414169;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tl", name = "t", descriptor = "(I)V")
	void method31772(@OriginalArg(0) int arg0) {
		if (this.aBoolean921 && this.aSourceDataLine1 != null) {
			this.anInt5285 = this.aSourceDataLine1.available() * 517346901;
		}
	}

	@OriginalMember(owner = "client!tl", name = "f", descriptor = "(I)V")
	void method31773(@OriginalArg(0) int arg0) {
		this.anInt5286 = 0;
		this.method31771((byte) -94);
		while (this.anInt5286 * -765248071 > 0) {
			@Pc(15) int local15 = this.anInt5286 * -765248071;
			if (local15 + this.anInt5287 * 1543257827 >= this.aByteArray103.length) {
				local15 = this.aByteArray103.length - this.anInt5287 * 1543257827;
			}
			this.aSourceDataLine1.write(this.aByteArray103, this.anInt5287 * 1543257827, local15);
			for (@Pc(47) int local47 = 0; local47 < local15; local47++) {
				this.aByteArray103[local47 + this.anInt5287 * 1543257827] = 0;
			}
			this.anInt5287 += local15 * -989530421;
			this.anInt5287 = this.anInt5287 * 1543257827 % this.aByteArray103.length * -989530421;
			this.anInt5286 -= local15 * 71284873;
		}
	}

	@OriginalMember(owner = "client!tl", name = "u", descriptor = "(Lclient!tf;I)V")
	void method31774(@OriginalArg(0) Class571 arg0, @OriginalArg(1) int arg1) {
		this.aList23.add(arg0);
	}

	@OriginalMember(owner = "client!tl", name = "l", descriptor = "(Lclient!tf;I)V")
	void method31775(@OriginalArg(0) Class571 arg0, @OriginalArg(1) int arg1) {
		this.aList23.remove(arg0);
	}

	@OriginalMember(owner = "client!tl", name = "j", descriptor = "(Lclient!tf;)V")
	void method31776(@OriginalArg(0) Class571 arg0) {
		this.aList23.add(arg0);
	}

	@OriginalMember(owner = "client!tl", name = "i", descriptor = "(Lclient!tf;)V")
	void method31777(@OriginalArg(0) Class571 arg0) {
		this.aList23.add(arg0);
	}

	@OriginalMember(owner = "client!tl", name = "m", descriptor = "(Lclient!tf;)V")
	void method31778(@OriginalArg(0) Class571 arg0) {
		this.aList23.add(arg0);
	}

	@OriginalMember(owner = "client!tl", name = "g", descriptor = "()V")
	void method31779() {
		if (this.aBoolean921 && this.aSourceDataLine1 != null) {
			this.anInt5285 = this.aSourceDataLine1.available() * 517346901;
		}
	}

	@OriginalMember(owner = "client!tl", name = "o", descriptor = "(Lclient!tf;)V")
	void method31780(@OriginalArg(0) Class571 arg0) {
		this.aList23.add(arg0);
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lclient!tf;)V")
	void method31781(@OriginalArg(0) Class571 arg0) {
		this.aList23.remove(arg0);
	}
}
