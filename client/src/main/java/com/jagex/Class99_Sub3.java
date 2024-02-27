package com.jagex;

import java.nio.ByteBuffer;
import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aem")
public final class Class99_Sub3 extends Class99 {

	@OriginalMember(owner = "client!aem", name = "w", descriptor = "I")
	static final int anInt422 = 1;

	@OriginalMember(owner = "client!aem", name = "l", descriptor = "I")
	static final int anInt425 = 74;

	@OriginalMember(owner = "client!aem", name = "r", descriptor = "I")
	int anInt420;

	@OriginalMember(owner = "client!aem", name = "ac", descriptor = "Lclient!lo;")
	Class145 aClass145_1;

	@OriginalMember(owner = "client!aem", name = "ag", descriptor = "[Lclient!tj;")
	Class93[] aClass93Array3;

	@OriginalMember(owner = "client!aem", name = "ar", descriptor = "[Lclient!tj;")
	Class93[] aClass93Array4;

	@OriginalMember(owner = "client!aem", name = "aw", descriptor = "I")
	int anInt421;

	@OriginalMember(owner = "client!aem", name = "i", descriptor = "[[[I")
	int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!aem", name = "ah", descriptor = "Lclient!lr;")
	Interface37 anInterface37_1;

	@OriginalMember(owner = "client!aem", name = "al", descriptor = "Lclient!lr;")
	Interface37 anInterface37_2;

	@OriginalMember(owner = "client!aem", name = "ai", descriptor = "I")
	int anInt423;

	@OriginalMember(owner = "client!aem", name = "v", descriptor = "I")
	int anInt424;

	@OriginalMember(owner = "client!aem", name = "ap", descriptor = "I")
	int anInt426;

	@OriginalMember(owner = "client!aem", name = "aq", descriptor = "Ljava/nio/ByteBuffer;")
	ByteBuffer aByteBuffer1;

	@OriginalMember(owner = "client!aem", name = "ax", descriptor = "Ljava/nio/ByteBuffer;")
	ByteBuffer aByteBuffer2;

	@OriginalMember(owner = "client!aem", name = "av", descriptor = "I")
	int anInt427;

	@OriginalMember(owner = "client!aem", name = "ay", descriptor = "I")
	int anInt428;

	@OriginalMember(owner = "client!aem", name = "s", descriptor = "F")
	float aFloat23 = Float.MAX_VALUE;

	@OriginalMember(owner = "client!aem", name = "y", descriptor = "F")
	float aFloat24 = -3.4028235E38F;

	@OriginalMember(owner = "client!aem", name = "ae", descriptor = "Lclient!aat;")
	Class22 aClass22_4 = new Class22();

	@OriginalMember(owner = "client!aem", name = "ao", descriptor = "[I")
	int[] anIntArray32 = new int[1];

	@OriginalMember(owner = "client!aem", name = "aj", descriptor = "[I")
	int[] anIntArray33 = new int[1];

	@OriginalMember(owner = "client!aem", name = "ab", descriptor = "[I")
	int[] anIntArray34 = new int[1];

	@OriginalMember(owner = "client!aem", name = "u", descriptor = "Lclient!afc;")
	final Class104_Sub2 aClass104_Sub2_2;

	@OriginalMember(owner = "client!aem", name = "z", descriptor = "I")
	int anInt416;

	@OriginalMember(owner = "client!aem", name = "p", descriptor = "I")
	int anInt417;

	@OriginalMember(owner = "client!aem", name = "d", descriptor = "I")
	int anInt418;

	@OriginalMember(owner = "client!aem", name = "c", descriptor = "I")
	final int anInt419;

	@OriginalMember(owner = "client!aem", name = "g", descriptor = "[[[I")
	int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!aem", name = "q", descriptor = "[[[Lclient!akh;")
	Class93_Sub18[][][] aClass93_Sub18ArrayArrayArray1;

	@OriginalMember(owner = "client!aem", name = "h", descriptor = "[[[I")
	int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!aem", name = "a", descriptor = "[[[I")
	int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!aem", name = "x", descriptor = "[[[I")
	int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!aem", name = "b", descriptor = "[[[I")
	int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!aem", name = "o", descriptor = "[[S")
	short[][] aShortArrayArray3;

	@OriginalMember(owner = "client!aem", name = "j", descriptor = "[[B")
	byte[][] aByteArrayArray8;

	@OriginalMember(owner = "client!aem", name = "as", descriptor = "[[B")
	byte[][] aByteArrayArray9;

	@OriginalMember(owner = "client!aem", name = "at", descriptor = "[[F")
	float[][] aFloatArrayArray4;

	@OriginalMember(owner = "client!aem", name = "ad", descriptor = "[[F")
	float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!aem", name = "am", descriptor = "[[F")
	float[][] aFloatArrayArray5;

	@OriginalMember(owner = "client!aem", name = "au", descriptor = "Lclient!aan;")
	Class16 aClass16_5;

	@OriginalMember(owner = "client!aem", name = "t", descriptor = "Lclient!lg;")
	Class397 aClass397_1;

	@OriginalMember(owner = "client!aem", name = "<init>", descriptor = "(Lclient!afc;IIII[[I[[II)V")
	Class99_Sub3(@OriginalArg(0) Class104_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg3, arg4, arg7, arg5);
		this.aClass104_Sub2_2 = arg0;
		this.anInt416 = this.anInt415 * -373302705 - 2;
		this.anInt417 = 0x1 << this.anInt416;
		this.anInt418 = arg1;
		this.anInt419 = arg2;
		this.anIntArrayArrayArray9 = new int[arg3][arg4][];
		this.aClass93_Sub18ArrayArrayArray1 = new Class93_Sub18[arg3][arg4][];
		this.anIntArrayArrayArray11 = new int[arg3][arg4][];
		this.anIntArrayArrayArray8 = new int[arg3][arg4][];
		this.anIntArrayArrayArray12 = new int[arg3][arg4][];
		this.anIntArrayArrayArray7 = new int[arg3][arg4][];
		this.aShortArrayArray3 = new short[arg3 * arg4][];
		this.aByteArrayArray8 = new byte[arg3][arg4];
		this.aByteArrayArray9 = new byte[arg3 + 1][arg4 + 1];
		this.aFloatArrayArray4 = new float[this.anInt414 * -1667858293 + 1][this.anInt413 * -143202029 + 1];
		this.aFloatArrayArray6 = new float[this.anInt414 * -1667858293 + 1][this.anInt413 * -143202029 + 1];
		this.aFloatArrayArray5 = new float[this.anInt414 * -1667858293 + 1][this.anInt413 * -143202029 + 1];
		for (@Pc(148) int local148 = 0; local148 <= this.anInt413 * -143202029; local148++) {
			for (@Pc(156) int local156 = 0; local156 <= this.anInt414 * -1667858293; local156++) {
				@Pc(169) int local169 = this.anIntArrayArray7[local156][local148];
				if ((float) local169 < this.aFloat23) {
					this.aFloat23 = local169;
				}
				if ((float) local169 > this.aFloat24) {
					this.aFloat24 = local169;
				}
				if (local156 > 0 && local148 > 0 && local156 < this.anInt414 * -1667858293 && local148 < this.anInt413 * -143202029) {
					@Pc(221) int local221 = arg6[local156 + 1][local148] - arg6[local156 - 1][local148];
					@Pc(237) int local237 = arg6[local156][local148 + 1] - arg6[local156][local148 - 1];
					@Pc(256) float local256 = (float) (1.0D / Math.sqrt((double) (local221 * local221 + arg7 * 4 * arg7 + local237 * local237)));
					this.aFloatArrayArray4[local156][local148] = (float) local221 * local256;
					this.aFloatArrayArray6[local156][local148] = (float) (-arg7 * 2) * local256;
					this.aFloatArrayArray5[local156][local148] = (float) local237 * local256;
				}
			}
		}
		this.aFloat23--;
		this.aFloat24++;
		this.aClass16_5 = new Class16(128);
		if ((this.anInt419 & 0x10) != 0) {
			this.aClass397_1 = new Class397(this.aClass104_Sub2_2, this);
		}
	}

	@OriginalMember(owner = "client!aem", name = "h", descriptor = "(III[[ZZI)V")
	@Override
	public void method2494(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (this.aClass93Array3 == null) {
			return;
		}
		@Pc(8) int local8 = arg2 + arg2 + 1;
		@Pc(12) int local12 = local8 * local8;
		if (this.anIntArray34.length < local12) {
			this.anIntArray34 = new int[local12];
		}
		@Pc(25) int local25 = arg0 - arg2;
		@Pc(27) int local27 = local25;
		if (local25 < 0) {
			local25 = 0;
		}
		@Pc(35) int local35 = arg1 - arg2;
		@Pc(37) int local37 = local35;
		if (local35 < 0) {
			local35 = 0;
		}
		@Pc(45) int local45 = arg0 + arg2;
		if (local45 > this.anInt414 * -1667858293 - 1) {
			local45 = this.anInt414 * -1667858293 - 1;
		}
		@Pc(64) int local64 = arg1 + arg2;
		if (local64 > this.anInt413 * -143202029 - 1) {
			local64 = this.anInt413 * -143202029 - 1;
		}
		this.anInt428 = 0;
		for (@Pc(84) int local84 = local25; local84 <= local45; local84++) {
			@Pc(93) boolean[] local93 = arg3[local84 - local27];
			for (@Pc(95) int local95 = local35; local95 <= local64; local95++) {
				if (local93[local95 - local37]) {
					this.anIntArray34[this.anInt428++] = local95 * this.anInt414 * -1667858293 + local84;
				}
			}
		}
		@Pc(130) ByteBuffer local130 = this.aClass104_Sub2_2.aByteBuffer7;
		local130.clear();
		@Pc(135) int local135;
		for (local135 = 0; local135 < this.aClass93Array3.length; local135++) {
			@Pc(146) Class93_Sub18 local146 = (Class93_Sub18) this.aClass93Array3[local135];
			local146.method13596(this.anIntArray34, this.anInt428);
		}
		local135 = local130.position();
		@Pc(161) Class131 local161 = this.aClass104_Sub2_2.aClass131_3;
		this.aClass104_Sub2_2.method20962();
		if (this.aClass104_Sub2_2.anInt2947 > 0) {
			local161.aClass472_41.method29718((float) (this.aClass104_Sub2_2.anInt2957 >> 16 & 0xFF) / 255.0F, (float) (this.aClass104_Sub2_2.anInt2957 >> 8 & 0xFF) / 255.0F, (float) (this.aClass104_Sub2_2.anInt2957 >> 0 & 0xFF) / 255.0F);
			local161.aClass460_9.method29375(0.0F, 0.0F, 1.0F, -this.aClass104_Sub2_2.aFloat216);
			local161.aClass460_9.method29393(this.aClass104_Sub2_2.aClass489_87);
			local161.aClass460_9.method29380(1.0F / (this.aClass104_Sub2_2.aFloat209 - this.aClass104_Sub2_2.aFloat216));
		} else {
			local161.aClass460_9.method29375(0.0F, 0.0F, 0.0F, 0.0F);
			local161.aClass472_41.method29718(0.0F, 0.0F, 0.0F);
		}
		if (local135 != 0) {
			@Pc(252) Interface40 local252 = this.aClass104_Sub2_2.method20928(local135 / 2);
			local252.method29514(0, local135, this.aClass104_Sub2_2.aLong132);
			this.aClass104_Sub2_2.method21060(0, this.anInterface37_1);
			this.aClass104_Sub2_2.method21042(local252);
			local161.method10101(Class489.aClass489_99);
			@Pc(280) int local280;
			@Pc(282) int local282;
			@Pc(293) Class93_Sub18 local293;
			@Pc(411) Class235 local411;
			if ((this.anInt419 & 0x7) == 0) {
				local280 = 0;
				for (local282 = 0; local282 < this.aClass93Array3.length; local282++) {
					local293 = (Class93_Sub18) this.aClass93Array3[local282];
					if (local293.anInt1541 != 0) {
						if (this.aClass104_Sub2_2.aBoolean473) {
							this.aClass104_Sub2_2.method20557(0, local293.aClass237_3);
							local161.aClass460_8.method29375(0.0F, 1.0F, 0.0F, (float) this.aClass104_Sub2_2.anInt2946 + (float) (local293.aClass237_3.anInt3860 * -94478965) / 255.0F * (float) (local293.aClass237_3.anInt3856 * -2052057497));
							local161.aClass460_8.method29380(1.0F / (float) (local293.aClass237_3.anInt3856 * -2052057497));
							local161.aClass472_40.method29718((float) (local293.aClass237_3.anInt3858 * -1393096381 >> 16 & 0xFF) / 255.0F, (float) (local293.aClass237_3.anInt3858 * -1393096381 >> 8 & 0xFF) / 255.0F, (float) (local293.aClass237_3.anInt3858 * -1393096381 >> 0 & 0xFF) / 255.0F);
						} else {
							local161.aClass460_8.method29375(0.0F, 0.0F, 0.0F, 0.0F);
							local161.aClass472_40.method29718(0.0F, 0.0F, 0.0F);
						}
						@Pc(399) boolean local399 = false;
						if (local293.anInt1538 == -1) {
							local161.anInterface38_18 = this.aClass104_Sub2_2.anInterface38_23;
						} else {
							local411 = this.aClass104_Sub2_2.aClass225_6.method25690(local293.anInt1538, -826033933);
							local161.anInterface38_18 = this.aClass104_Sub2_2.aClass406_3.method28743(local411);
							local399 = !Class588.method31830(local411.aByte114, (byte) 10);
						}
						this.aClass104_Sub2_2.method21060(1, local293.anInterface37_10);
						this.aClass104_Sub2_2.method21118(this.aClass145_1);
						local161.aClass489_46.method30026(1.0F / local293.aFloat148, 1.0F / local293.aFloat148, 1.0F, 1.0F);
						local161.anInt1140 = local293.anInt1537;
						local161.anInt1141 = local293.anInt1540 - local293.anInt1537 + 1;
						local161.anInt1138 = local280;
						local161.anInt1137 = local293.anInt1541 / 3;
						local161.method10102(local399);
						local280 += local293.anInt1541;
					}
				}
			} else {
				local161.aClass472_42.method29718(this.aClass104_Sub2_2.aFloatArray63[0], this.aClass104_Sub2_2.aFloatArray63[1], this.aClass104_Sub2_2.aFloatArray63[2]);
				local161.aClass472_43.method29718(this.aClass104_Sub2_2.aFloat212 * this.aClass104_Sub2_2.aFloat214, this.aClass104_Sub2_2.aFloat212 * this.aClass104_Sub2_2.aFloat210, this.aClass104_Sub2_2.aFloat212 * this.aClass104_Sub2_2.aFloat217);
				local161.aClass472_44.method29718(-this.aClass104_Sub2_2.aFloat213 * this.aClass104_Sub2_2.aFloat214, -this.aClass104_Sub2_2.aFloat213 * this.aClass104_Sub2_2.aFloat210, -this.aClass104_Sub2_2.aFloat213 * this.aClass104_Sub2_2.aFloat217);
				local161.aClass472_38.method29718(this.aClass104_Sub2_2.aFloat211 * this.aClass104_Sub2_2.aFloat214, this.aClass104_Sub2_2.aFloat211 * this.aClass104_Sub2_2.aFloat210, this.aClass104_Sub2_2.aFloat211 * this.aClass104_Sub2_2.aFloat217);
				local280 = 0;
				for (local282 = 0; local282 < this.aClass93Array3.length; local282++) {
					local293 = (Class93_Sub18) this.aClass93Array3[local282];
					if (local293.anInt1541 > 0) {
						if (this.aClass104_Sub2_2.aBoolean473) {
							this.aClass104_Sub2_2.method20557(0, local293.aClass237_3);
							@Pc(613) float local613 = 0.15F;
							local161.aClass460_8.method29375(0.0F, 1.0F / ((float) (local293.aClass237_3.anInt3856 * -2052057497) * local613), 0.0F, 256.0F / ((float) (local293.aClass237_3.anInt3856 * -2052057497) * local613));
							local161.aClass472_40.method29718((float) (local293.aClass237_3.anInt3858 * -1393096381 >> 16 & 0xFF) / 255.0F, (float) (local293.aClass237_3.anInt3858 * -1393096381 >> 8 & 0xFF) / 255.0F, (float) (local293.aClass237_3.anInt3858 * -1393096381 >> 0 & 0xFF) / 255.0F);
						} else {
							local161.aClass460_8.method29375(0.0F, 0.0F, 0.0F, 0.0F);
							local161.aClass472_40.method29718(0.0F, 0.0F, 0.0F);
						}
						@Pc(693) byte local693 = 11;
						if (local293.anInt1538 == -1) {
							local161.anInterface38_18 = this.aClass104_Sub2_2.anInterface38_23;
						} else {
							local411 = this.aClass104_Sub2_2.aClass225_6.method25690(local293.anInt1538, -860390985);
							local693 = local411.aByte114;
							local161.anInterface38_18 = this.aClass104_Sub2_2.aClass406_3.method28743(local411);
							local161.method10119(local411.aByte112);
						}
						this.aClass104_Sub2_2.method21060(1, local293.anInterface37_10);
						this.aClass104_Sub2_2.method21118(this.aClass145_1);
						local161.aClass489_46.method30026(1.0F / local293.aFloat148, 1.0F / local293.aFloat148, 1.0F, 1.0F);
						local161.anInt1140 = local293.anInt1537;
						local161.anInt1141 = local293.anInt1540 - local293.anInt1537 + 1;
						local161.anInt1138 = local280;
						local161.anInt1137 = local293.anInt1541 / 3;
						switch(local693) {
							case 1:
								local161.aClass472_39.method29718(this.aClass104_Sub2_2.aClass489_72.aFloatArray116[12], this.aClass104_Sub2_2.aClass489_72.aFloatArray116[13], this.aClass104_Sub2_2.aClass489_72.aFloatArray116[14]);
								if (this.aClass104_Sub2_2.aBoolean473) {
									local161.method10107();
								} else {
									local161.method10114(0);
								}
								break;
							case 2:
							case 4:
							case 8:
							case 9:
								if (this.aClass104_Sub2_2.aBoolean463 || (this.anInt419 & 0x8) == 0 || !this.aClass104_Sub2_2.aClass128_Sub1_Sub1_6.method19654(-1171661504)) {
									local161.method10103(0);
								} else {
									@Pc(834) Class128_Sub1_Sub1 local834 = this.aClass104_Sub2_2.aClass128_Sub1_Sub1_6;
									if (local693 == 2) {
										local834 = this.aClass104_Sub2_2.aClass128_Sub1_Sub1_5;
									}
									local834.aClass489_71.method30018(this.aClass104_Sub2_2.aClass489_84);
									local834.aClass489_70.method30026(1.0F / (local293.aFloat148 * (float) (local293.aClass237_3.anInt3859 * -8330653)), 1.0F / (local293.aFloat148 * (float) (local293.aClass237_3.anInt3859 * -8330653)), 1.0F, 1.0F);
									local834.aClass472_56.method29718(this.aClass104_Sub2_2.aClass489_72.aFloatArray116[12], this.aClass104_Sub2_2.aClass489_72.aFloatArray116[13], this.aClass104_Sub2_2.aClass489_72.aFloatArray116[14]);
									@Pc(903) Class235 local903 = this.aClass104_Sub2_2.aClass225_6.method25690(local293.anInt1538, 1146119922);
									local834.anInt2749 = local903.aByte112 * 796741929;
									local834.anInt2747 = local293.anInt1537 * -72899815;
									local834.anInt2748 = (local293.anInt1540 - local293.anInt1537 + 1) * -1423895923;
									local834.anInt2746 = local280 * -854029149;
									local834.anInt2750 = local293.anInt1541 / 3 * 184654049;
									local834.aClass460_16.method29376(local161.aClass460_8);
									local834.aClass472_57.method29719(local161.aClass472_40);
									local834.aClass460_12.method29376(local161.aClass460_9);
									local834.aClass472_58.method29719(local161.aClass472_41);
									local834.method19655((byte) -1);
								}
								break;
							case 3:
							case 5:
							default:
								if (this.aClass104_Sub2_2.aBoolean473) {
									local161.method10106();
								} else {
									local161.method10103(0);
								}
								break;
							case 6:
								local161.method10102(!Class588.method31830(local693, (byte) 10));
								break;
							case 7:
								local161.aClass472_39.method29718(this.aClass104_Sub2_2.aClass489_72.aFloatArray116[12], this.aClass104_Sub2_2.aClass489_72.aFloatArray116[13], this.aClass104_Sub2_2.aClass489_72.aFloatArray116[14]);
								local161.aClass489_45.method30017();
								local161.anInterface44_3 = this.aClass104_Sub2_2.method20934();
								local161.method10109(0);
						}
						local280 += local293.anInt1541;
					}
				}
			}
		}
		if (!this.aClass22_4.method418(1867167889)) {
			this.aClass104_Sub2_2.method20994(128);
			this.aClass104_Sub2_2.method21302(false);
			@Pc(1036) Class472 local1036 = new Class472(local161.aClass472_41);
			local161.aClass472_41.method29718(0.0F, 0.0F, 0.0F);
			@Pc(1046) Iterator local1046 = this.aClass22_4.iterator();
			while (local1046.hasNext()) {
				@Pc(1053) Class93_Sub34 local1053 = (Class93_Sub34) local1046.next();
				local1053.method13955(local161, arg0, arg1, arg2, arg3, arg4);
			}
			local161.aClass472_41.method29719(local1036);
		}
		if (this.aClass397_1 == null) {
			return;
		}
		this.aClass104_Sub2_2.method20994(1);
		this.aClass104_Sub2_2.method21060(0, this.anInterface37_1);
		this.aClass104_Sub2_2.method21060(1, this.anInterface37_2);
		this.aClass104_Sub2_2.method21118(this.aClass145_1);
		@Pc(1094) Class489 local1094 = this.aClass104_Sub2_2.aClass489_78;
		local1094.method30017();
		local1094.aFloatArray116[13] = -1.0F;
		local161.method10101(local1094);
		this.aClass397_1.method28653(local161, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!aem", name = "e", descriptor = "(III)V")
	@Override
	public void method2474(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = Math.min(this.aByteArrayArray9.length - 1, Math.max(0, arg0));
		@Pc(21) int local21 = Math.min(this.aByteArrayArray9[local9].length - 1, Math.max(0, arg1));
		if ((this.aByteArrayArray9[local9][local21] & 0xFF) < arg2) {
			this.aByteArrayArray9[local9][local21] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!aem", name = "ac", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method2490(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean[][] arg7) {
		if (this.anInt423 <= 0) {
			return;
		}
		@Pc(9) Interface40 local9 = this.aClass104_Sub2_2.method20928(this.anInt424);
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 32767;
		@Pc(15) int local15 = -32768;
		@Pc(19) ByteBuffer local19 = this.aClass104_Sub2_2.aByteBuffer7;
		local19.clear();
		for (@Pc(24) int local24 = arg4; local24 < arg6; local24++) {
			@Pc(36) int local36 = local24 * this.anInt414 * -1667858293 + arg3;
			for (@Pc(38) int local38 = arg3; local38 < arg5; local38++) {
				if (arg7[local38 - arg3][local24 - arg4]) {
					@Pc(56) short[] local56 = this.aShortArrayArray3[local36];
					if (local56 != null) {
						for (@Pc(60) int local60 = 0; local60 < local56.length; local60++) {
							@Pc(70) int local70 = local56[local60] & 0xFFFF;
							if (local70 > local15) {
								local15 = local70;
							}
							if (local70 < local13) {
								local13 = local70;
							}
							local19.putShort((short) local70);
							local11++;
						}
					}
				}
				local36++;
			}
		}
		local9.method29514(0, local19.position(), this.aClass104_Sub2_2.aLong132);
		if (local11 <= 0) {
			return;
		}
		this.aClass104_Sub2_2.method20962();
		@Pc(111) Class131 local111 = this.aClass104_Sub2_2.aClass131_3;
		this.aClass104_Sub2_2.method21060(0, this.anInterface37_1);
		this.aClass104_Sub2_2.method21060(1, this.anInterface37_2);
		this.aClass104_Sub2_2.method21118(this.aClass145_1);
		this.aClass104_Sub2_2.method21042(local9);
		this.aClass104_Sub2_2.method20528(Class470.aClass470_54);
		@Pc(143) float local143 = (float) this.aClass104_Sub2_2.method20446((byte) -56).method23748();
		@Pc(150) float local150 = (float) this.aClass104_Sub2_2.method20446((byte) -55).method23749();
		@Pc(154) Class470 local154 = new Class470();
		@Pc(158) Class470 local158 = new Class470();
		local154.method29551(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F);
		local158.method29601((float) arg2 / ((float) (this.anInt412 * -1678286317) * 256.0F), (float) -arg2 / ((float) (this.anInt412 * -1678286317) * 256.0F), 1.0F / (this.aFloat24 - this.aFloat23));
		local158.method29568((float) arg0 - (float) (arg3 * arg2) / 256.0F, (float) arg1 + (float) (arg6 * arg2) / 256.0F, -this.aFloat23 / (this.aFloat24 - this.aFloat23));
		local158.method29565(2.0F / local143, 2.0F / local150, 1.0F);
		local158.method29568(-1.0F, -1.0F, 0.0F);
		this.aClass104_Sub2_2.aClass470_36.method29570(local154, local158);
		this.aClass104_Sub2_2.aClass489_78.method30023(this.aClass104_Sub2_2.aClass470_36);
		this.aClass104_Sub2_2.method20531(this.aClass104_Sub2_2.aClass489_78);
		local111.method10101(Class489.aClass489_99);
		local111.aClass460_9.method29375(0.0F, 0.0F, 0.0F, 0.0F);
		local111.aClass472_41.method29718(0.0F, 0.0F, 0.0F);
		local111.aClass460_8.method29375(0.0F, 0.0F, 0.0F, 0.0F);
		local111.aClass472_40.method29718(0.0F, 0.0F, 0.0F);
		local111.anInterface38_18 = this.aClass104_Sub2_2.anInterface38_23;
		local111.aClass489_46.method30017();
		local111.anInt1140 = local13;
		local111.anInt1141 = local15 - local13 + 1;
		local111.anInt1138 = 0;
		local111.anInt1137 = local11 / 3;
		if (this.aClass104_Sub2_2.aBoolean464) {
			this.aClass104_Sub2_2.method20530(false);
			local111.method10102(false);
			this.aClass104_Sub2_2.method20530(true);
		} else {
			local111.method10102(false);
		}
	}

	@OriginalMember(owner = "client!aem", name = "m", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[ILclient!dy;Z)V")
	@Override
	public void method2478(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) Class237 arg13, @OriginalArg(14) boolean arg14) {
		@Pc(2) int local2 = arg9.length;
		@Pc(7) int[] local7 = new int[local2 * 3];
		@Pc(12) int[] local12 = new int[local2 * 3];
		@Pc(17) int[] local17 = new int[local2 * 3];
		@Pc(22) int[] local22 = new int[local2 * 3];
		@Pc(27) int[] local27 = new int[local2 * 3];
		@Pc(32) int[] local32 = new int[local2 * 3];
		@Pc(41) int[] local41 = arg3 == null ? null : new int[local2 * 3];
		@Pc(50) int[] local50 = arg5 == null ? null : new int[local2 * 3];
		@Pc(52) int local52 = 0;
		for (@Pc(54) int local54 = 0; local54 < local2; local54++) {
			@Pc(61) int local61 = arg6[local54];
			@Pc(65) int local65 = arg7[local54];
			@Pc(69) int local69 = arg8[local54];
			local7[local52] = arg2[local61];
			local12[local52] = arg4[local61];
			local17[local52] = arg9[local54];
			local27[local52] = arg11[local54];
			local32[local52] = arg12[local54];
			local22[local52] = arg10 == null ? arg9[local54] : arg10[local54];
			if (arg3 != null) {
				local41[local52] = arg3[local61];
			}
			if (arg5 != null) {
				local50[local52] = arg5[local61];
			}
			local52++;
			local7[local52] = arg2[local65];
			local12[local52] = arg4[local65];
			local17[local52] = arg9[local54];
			local27[local52] = arg11[local54];
			local32[local52] = arg12[local54];
			local22[local52] = arg10 == null ? arg9[local54] : arg10[local54];
			if (arg3 != null) {
				local41[local52] = arg3[local65];
			}
			if (arg5 != null) {
				local50[local52] = arg5[local65];
			}
			local52++;
			local7[local52] = arg2[local69];
			local12[local52] = arg4[local69];
			local17[local52] = arg9[local54];
			local27[local52] = arg11[local54];
			local32[local52] = arg12[local54];
			local22[local52] = arg10 == null ? arg9[local54] : arg10[local54];
			if (arg3 != null) {
				local41[local52] = arg3[local69];
			}
			if (arg5 != null) {
				local50[local52] = arg5[local69];
			}
			local52++;
		}
		this.method2510(arg0, arg1, local7, local41, local12, local50, local17, local22, local27, local32, arg13, arg14);
	}

	@OriginalMember(owner = "client!aem", name = "as", descriptor = "(Lclient!ara;IIIIZ)Z")
	@Override
	public boolean method2506(@OriginalArg(0) Class93_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass397_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(20) int local20 = arg1 - (arg2 * this.aClass104_Sub2_2.anInt2937 >> 8) >> this.aClass104_Sub2_2.anInt2936;
			@Pc(34) int local34 = arg3 - (arg2 * this.aClass104_Sub2_2.anInt2938 >> 8) >> this.aClass104_Sub2_2.anInt2936;
			return this.aClass397_1.method28648(arg0, local20, local34);
		}
	}

	@OriginalMember(owner = "client!aem", name = "av", descriptor = "()V")
	void method2516() {
		this.anInterface37_2 = this.aClass104_Sub2_2.method21025(false);
		this.anInterface37_2.method29496(this.anInt420 * 4, 4);
		this.anInterface37_2.method29514(0, this.anInt420 * 4, this.aClass104_Sub2_2.method20903(this.aByteBuffer1));
		this.anInterface37_1 = this.aClass104_Sub2_2.method21025(false);
		this.anInterface37_1.method29496(this.anInt420 * this.anInt427, this.anInt427);
		this.anInterface37_1.method29514(0, this.anInt420 * this.anInt427, this.aClass104_Sub2_2.method20903(this.aByteBuffer2));
		this.aByteBuffer1.clear();
		this.aByteBuffer1 = null;
		this.aByteBuffer2.clear();
		this.aByteBuffer2 = null;
		if ((this.anInt419 & 0x7) == 0) {
			if (this.anIntArrayArrayArray10 == null) {
				this.aClass145_1 = this.aClass104_Sub2_2.method21005(new Class400[] { new Class400(new Class399[] { Class399.aClass399_9, Class399.aClass399_1 }), new Class400(Class399.aClass399_10) });
			} else {
				this.aClass145_1 = this.aClass104_Sub2_2.method21005(new Class400[] { new Class400(new Class399[] { Class399.aClass399_9, Class399.aClass399_1, Class399.aClass399_3 }), new Class400(Class399.aClass399_10) });
			}
		} else if (this.anIntArrayArrayArray10 == null) {
			this.aClass145_1 = this.aClass104_Sub2_2.method21005(new Class400[] { new Class400(new Class399[] { Class399.aClass399_9, Class399.aClass399_1, Class399.aClass399_2 }), new Class400(Class399.aClass399_10) });
		} else {
			this.aClass145_1 = this.aClass104_Sub2_2.method21005(new Class400[] { new Class400(new Class399[] { Class399.aClass399_9, Class399.aClass399_1, Class399.aClass399_3, Class399.aClass399_2 }), new Class400(Class399.aClass399_10) });
		}
		for (@Pc(226) int local226 = 0; local226 < this.anInt426; local226++) {
			@Pc(236) Class93_Sub18 local236 = (Class93_Sub18) this.aClass93Array4[local226];
			local236.method13595(this.anInt420);
		}
		if (this.aClass397_1 != null) {
			this.aClass397_1.method28657();
		}
		this.method2517();
	}

	@OriginalMember(owner = "client!aem", name = "ao", descriptor = "()V")
	void method2517() {
		if ((this.anInt418 & 0x2) == 0) {
			this.anIntArrayArrayArray8 = null;
			this.anIntArrayArrayArray11 = null;
			this.anIntArrayArrayArray12 = null;
		}
		this.anIntArrayArrayArray10 = null;
		this.anIntArrayArrayArray7 = null;
		this.anIntArrayArrayArray9 = null;
		this.aClass93_Sub18ArrayArrayArray1 = null;
		this.aByteArrayArray9 = null;
		this.aClass16_5 = null;
		this.aClass93Array4 = null;
		this.aFloatArrayArray5 = null;
		this.aFloatArrayArray6 = null;
		this.aFloatArrayArray4 = null;
	}

	@OriginalMember(owner = "client!aem", name = "aj", descriptor = "(II[[B[Lclient!akh;Lclient!aan;[Lclient!akh;)V")
	void method2518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) Class93_Sub18[] arg3, @OriginalArg(4) Class16 arg4, @OriginalArg(5) Class93_Sub18[] arg5) {
		if (this.anIntArrayArrayArray12[arg0][arg1] == null) {
			return;
		}
		@Pc(14) Class93_Sub18[] local14 = this.aClass93_Sub18ArrayArrayArray1[arg0][arg1];
		@Pc(21) int[] local21 = this.anIntArrayArrayArray11[arg0][arg1];
		@Pc(28) int[] local28 = this.anIntArrayArrayArray8[arg0][arg1];
		@Pc(35) int[] local35 = this.anIntArrayArrayArray7[arg0][arg1];
		@Pc(42) int[] local42 = this.anIntArrayArrayArray12[arg0][arg1];
		@Pc(54) int[] local54 = this.anIntArrayArrayArray9 == null ? null : this.anIntArrayArrayArray9[arg0][arg1];
		@Pc(66) int[] local66 = this.anIntArrayArrayArray10 == null ? null : this.anIntArrayArrayArray10[arg0][arg1];
		if (local35 == null) {
			local35 = local42;
		}
		@Pc(77) float local77 = this.aFloatArrayArray4[arg0][arg1];
		@Pc(84) float local84 = this.aFloatArrayArray6[arg0][arg1];
		@Pc(91) float local91 = this.aFloatArrayArray5[arg0][arg1];
		@Pc(100) float local100 = this.aFloatArrayArray4[arg0][arg1 + 1];
		@Pc(109) float local109 = this.aFloatArrayArray6[arg0][arg1 + 1];
		@Pc(118) float local118 = this.aFloatArrayArray5[arg0][arg1 + 1];
		@Pc(129) float local129 = this.aFloatArrayArray4[arg0 + 1][arg1 + 1];
		@Pc(140) float local140 = this.aFloatArrayArray6[arg0 + 1][arg1 + 1];
		@Pc(151) float local151 = this.aFloatArrayArray5[arg0 + 1][arg1 + 1];
		@Pc(160) float local160 = this.aFloatArrayArray4[arg0 + 1][arg1];
		@Pc(169) float local169 = this.aFloatArrayArray6[arg0 + 1][arg1];
		@Pc(178) float local178 = this.aFloatArrayArray5[arg0 + 1][arg1];
		@Pc(186) int local186 = arg2[arg0][arg1] & 0xFF;
		@Pc(196) int local196 = arg2[arg0][arg1 + 1] & 0xFF;
		@Pc(208) int local208 = arg2[arg0 + 1][arg1 + 1] & 0xFF;
		@Pc(218) int local218 = arg2[arg0 + 1][arg1] & 0xFF;
		@Pc(220) int local220 = 0;
		@Pc(232) int local232;
		label185: for (@Pc(222) int local222 = 0; local222 < local42.length; local222++) {
			@Pc(230) Class93_Sub18 local230 = local14[local222];
			for (local232 = 0; local232 < local220; local232++) {
				if (arg3[local232] == local230) {
					continue label185;
				}
			}
			arg3[local220++] = local230;
		}
		@Pc(266) short[] local266 = this.aShortArrayArray3[arg1 * this.anInt414 * -1667858293 + arg0] = new short[local42.length];
		for (@Pc(268) int local268 = 0; local268 < local42.length; local268++) {
			@Pc(283) int local283 = (arg0 << this.anInt415 * -373302705) + local21[local268];
			@Pc(294) int local294 = (arg1 << this.anInt415 * -373302705) + local28[local268];
			@Pc(299) int local299 = local283 >> this.anInt416;
			@Pc(304) int local304 = local294 >> this.anInt416;
			@Pc(308) int local308 = local42[local268];
			@Pc(312) int local312 = local35[local268];
			@Pc(320) int local320 = local54 == null ? 0 : local54[local268];
			@Pc(338) long local338 = (long) local312 << 48 | (long) local308 << 32 | (long) (local299 << 16) | (long) local304;
			@Pc(342) int local342 = local21[local268];
			@Pc(346) int local346 = local28[local268];
			@Pc(348) byte local348 = 74;
			@Pc(350) int local350 = 0;
			@Pc(352) float local352 = 1.0F;
			@Pc(358) float local358;
			@Pc(360) float local360;
			@Pc(362) float local362;
			@Pc(462) float local462;
			@Pc(366) int local366;
			if (local342 == 0 && local346 == 0) {
				local358 = local77;
				local360 = local84;
				local362 = local91;
				local366 = local348 - local186;
			} else if (local342 == 0 && local346 == this.anInt412 * -1678286317) {
				local358 = local100;
				local360 = local109;
				local362 = local118;
				local366 = local348 - local196;
			} else if (local342 == this.anInt412 * -1678286317 && local346 == this.anInt412 * -1678286317) {
				local358 = local129;
				local360 = local140;
				local362 = local151;
				local366 = local348 - local208;
			} else if (local342 == this.anInt412 * -1678286317 && local346 == 0) {
				local358 = local160;
				local360 = local169;
				local362 = local178;
				local366 = local348 - local218;
			} else {
				@Pc(437) float local437 = (float) local342 / (float) (this.anInt412 * -1678286317);
				@Pc(446) float local446 = (float) local346 / (float) (this.anInt412 * -1678286317);
				@Pc(454) float local454 = local77 + (local160 - local77) * local437;
				local462 = local84 + (local169 - local84) * local437;
				@Pc(470) float local470 = local91 + (local178 - local91) * local437;
				@Pc(478) float local478 = local100 + (local129 - local100) * local437;
				@Pc(486) float local486 = local109 + (local140 - local109) * local437;
				@Pc(494) float local494 = local118 + (local151 - local118) * local437;
				local358 = local454 + (local478 - local454) * local446;
				local360 = local462 + (local486 - local462) * local446;
				local362 = local470 + (local494 - local470) * local446;
				@Pc(531) int local531 = local186 + ((local218 - local186) * local342 >> this.anInt415 * -373302705);
				@Pc(544) int local544 = local196 + ((local208 - local196) * local342 >> this.anInt415 * -373302705);
				local366 = local348 - (local531 + ((local544 - local531) * local346 >> this.anInt415 * -373302705));
			}
			if (local308 != -1) {
				@Pc(570) int local570 = (local308 & 0x7F) * local366 >> 7;
				if (local570 < 2) {
					local570 = 2;
				} else if (local570 > 126) {
					local570 = 126;
				}
				local350 = Class685.anIntArray525[local308 & 0xFF80 | local570];
				if ((this.anInt419 & 0x7) == 0) {
					local352 = this.aClass104_Sub2_2.aFloatArray63[0] * local358 + this.aClass104_Sub2_2.aFloatArray63[1] * local360 + this.aClass104_Sub2_2.aFloatArray63[2] * local362;
					local352 = this.aClass104_Sub2_2.aFloat211 + local352 * (local352 > 0.0F ? this.aClass104_Sub2_2.aFloat212 : this.aClass104_Sub2_2.aFloat213);
				}
			}
			@Pc(638) Class93 local638 = null;
			if ((local283 & this.anInt417 - 1) == 0 && (local294 & this.anInt417 - 1) == 0) {
				local638 = arg4.method215(local338);
			}
			@Pc(688) int local688;
			if (local638 == null) {
				@Pc(669) int local669;
				if (local312 == local308) {
					local688 = local350;
				} else {
					local669 = (local312 & 0x7F) * local366 >> 7;
					if (local669 < 2) {
						local669 = 2;
					} else if (local669 > 126) {
						local669 = 126;
					}
					local688 = Class685.anIntArray525[local312 & 0xFF80 | local669];
					if ((this.anInt419 & 0x7) == 0) {
						@Pc(716) float local716 = this.aClass104_Sub2_2.aFloatArray63[0] * local358 + this.aClass104_Sub2_2.aFloatArray63[1] * local360 + this.aClass104_Sub2_2.aFloatArray63[2] * local362;
						local462 = this.aClass104_Sub2_2.aFloat211 + local352 * (local352 > 0.0F ? this.aClass104_Sub2_2.aFloat212 : this.aClass104_Sub2_2.aFloat213);
						@Pc(741) int local741 = local688 >> 16 & 0xFF;
						@Pc(747) int local747 = local688 >> 8 & 0xFF;
						@Pc(751) int local751 = local688 & 0xFF;
						local741 = (int) ((float) local741 * local462);
						if (local741 < 0) {
							local741 = 0;
						} else if (local741 > 255) {
							local741 = 255;
						}
						local747 = (int) ((float) local747 * local462);
						if (local747 < 0) {
							local747 = 0;
						} else if (local747 > 255) {
							local747 = 255;
						}
						local751 = (int) ((float) local751 * local462);
						if (local751 < 0) {
							local751 = 0;
						} else if (local751 > 255) {
							local751 = 255;
						}
						local688 = local741 << 16 | local747 << 8 | local751;
					}
				}
				this.aByteBuffer2.putFloat((float) local283);
				this.aByteBuffer2.putFloat((float) (this.method2480(local283, local294, 1861581806) + local320));
				this.aByteBuffer2.putFloat((float) local294);
				this.aByteBuffer2.putFloat((float) local283);
				this.aByteBuffer2.putFloat((float) local294);
				if (this.anIntArrayArrayArray10 != null) {
					this.aByteBuffer2.putFloat(local66 == null ? 0.0F : (float) (local66[local268] - 1));
				}
				if ((this.anInt419 & 0x7) != 0) {
					this.aByteBuffer2.putFloat(local358);
					this.aByteBuffer2.putFloat(local360);
					this.aByteBuffer2.putFloat(local362);
				}
				if (this.aClass104_Sub2_2.anInt2953 == 0) {
					local669 = local688 & 0xFF00FF00;
					local669 |= local688 >> 16 & 0xFF;
					local669 |= (local688 & 0xFF) << 16;
					local688 = local669;
				}
				this.aByteBuffer1.putInt(local688 | 0xFF000000);
				local232 = this.anInt420++;
				local266[local268] = (short) local232;
				if (local308 != -1) {
					arg5[local232] = local14[local268];
				}
				arg4.method221(new Class93_Sub20(local266[local268]), local338);
			} else {
				local266[local268] = ((Class93_Sub20) local638).aShort98;
				local232 = local266[local268] & 0xFFFF;
				if (local308 != -1 && local14[local268].aLong232 * -3750704643647536275L < arg5[local232].aLong232 * -3750704643647536275L) {
					arg5[local232] = local14[local268];
				}
			}
			for (local688 = 0; local688 < local220; local688++) {
				arg3[local688].method13591(local232, local350, local366, local352);
			}
			this.anInt424++;
		}
	}

	@OriginalMember(owner = "client!aem", name = "f", descriptor = "(III[[ZZI)V")
	@Override
	public void method2501(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (this.aClass93Array3 == null) {
			return;
		}
		@Pc(8) int local8 = arg2 + arg2 + 1;
		@Pc(12) int local12 = local8 * local8;
		if (this.anIntArray34.length < local12) {
			this.anIntArray34 = new int[local12];
		}
		@Pc(25) int local25 = arg0 - arg2;
		@Pc(27) int local27 = local25;
		if (local25 < 0) {
			local25 = 0;
		}
		@Pc(35) int local35 = arg1 - arg2;
		@Pc(37) int local37 = local35;
		if (local35 < 0) {
			local35 = 0;
		}
		@Pc(45) int local45 = arg0 + arg2;
		if (local45 > this.anInt414 * -1667858293 - 1) {
			local45 = this.anInt414 * -1667858293 - 1;
		}
		@Pc(64) int local64 = arg1 + arg2;
		if (local64 > this.anInt413 * -143202029 - 1) {
			local64 = this.anInt413 * -143202029 - 1;
		}
		this.anInt428 = 0;
		for (@Pc(84) int local84 = local25; local84 <= local45; local84++) {
			@Pc(93) boolean[] local93 = arg3[local84 - local27];
			for (@Pc(95) int local95 = local35; local95 <= local64; local95++) {
				if (local93[local95 - local37]) {
					this.anIntArray34[this.anInt428++] = local95 * this.anInt414 * -1667858293 + local84;
				}
			}
		}
		@Pc(130) ByteBuffer local130 = this.aClass104_Sub2_2.aByteBuffer7;
		local130.clear();
		@Pc(135) int local135;
		for (local135 = 0; local135 < this.aClass93Array3.length; local135++) {
			@Pc(146) Class93_Sub18 local146 = (Class93_Sub18) this.aClass93Array3[local135];
			local146.method13596(this.anIntArray34, this.anInt428);
		}
		local135 = local130.position();
		@Pc(161) Class131 local161 = this.aClass104_Sub2_2.aClass131_3;
		this.aClass104_Sub2_2.method20962();
		if (this.aClass104_Sub2_2.anInt2947 > 0) {
			local161.aClass472_41.method29718((float) (this.aClass104_Sub2_2.anInt2957 >> 16 & 0xFF) / 255.0F, (float) (this.aClass104_Sub2_2.anInt2957 >> 8 & 0xFF) / 255.0F, (float) (this.aClass104_Sub2_2.anInt2957 >> 0 & 0xFF) / 255.0F);
			local161.aClass460_9.method29375(0.0F, 0.0F, 1.0F, -this.aClass104_Sub2_2.aFloat216);
			local161.aClass460_9.method29393(this.aClass104_Sub2_2.aClass489_87);
			local161.aClass460_9.method29380(1.0F / (this.aClass104_Sub2_2.aFloat209 - this.aClass104_Sub2_2.aFloat216));
		} else {
			local161.aClass460_9.method29375(0.0F, 0.0F, 0.0F, 0.0F);
			local161.aClass472_41.method29718(0.0F, 0.0F, 0.0F);
		}
		if (local135 != 0) {
			@Pc(252) Interface40 local252 = this.aClass104_Sub2_2.method20928(local135 / 2);
			local252.method29514(0, local135, this.aClass104_Sub2_2.aLong132);
			this.aClass104_Sub2_2.method21060(0, this.anInterface37_1);
			this.aClass104_Sub2_2.method21042(local252);
			local161.method10101(Class489.aClass489_99);
			@Pc(280) int local280;
			@Pc(282) int local282;
			@Pc(293) Class93_Sub18 local293;
			@Pc(411) Class235 local411;
			if ((this.anInt419 & 0x7) == 0) {
				local280 = 0;
				for (local282 = 0; local282 < this.aClass93Array3.length; local282++) {
					local293 = (Class93_Sub18) this.aClass93Array3[local282];
					if (local293.anInt1541 != 0) {
						if (this.aClass104_Sub2_2.aBoolean473) {
							this.aClass104_Sub2_2.method20557(0, local293.aClass237_3);
							local161.aClass460_8.method29375(0.0F, 1.0F, 0.0F, (float) this.aClass104_Sub2_2.anInt2946 + (float) (local293.aClass237_3.anInt3860 * -94478965) / 255.0F * (float) (local293.aClass237_3.anInt3856 * -2052057497));
							local161.aClass460_8.method29380(1.0F / (float) (local293.aClass237_3.anInt3856 * -2052057497));
							local161.aClass472_40.method29718((float) (local293.aClass237_3.anInt3858 * -1393096381 >> 16 & 0xFF) / 255.0F, (float) (local293.aClass237_3.anInt3858 * -1393096381 >> 8 & 0xFF) / 255.0F, (float) (local293.aClass237_3.anInt3858 * -1393096381 >> 0 & 0xFF) / 255.0F);
						} else {
							local161.aClass460_8.method29375(0.0F, 0.0F, 0.0F, 0.0F);
							local161.aClass472_40.method29718(0.0F, 0.0F, 0.0F);
						}
						@Pc(399) boolean local399 = false;
						if (local293.anInt1538 == -1) {
							local161.anInterface38_18 = this.aClass104_Sub2_2.anInterface38_23;
						} else {
							local411 = this.aClass104_Sub2_2.aClass225_6.method25690(local293.anInt1538, -1417395765);
							local161.anInterface38_18 = this.aClass104_Sub2_2.aClass406_3.method28743(local411);
							local399 = !Class588.method31830(local411.aByte114, (byte) 10);
						}
						this.aClass104_Sub2_2.method21060(1, local293.anInterface37_10);
						this.aClass104_Sub2_2.method21118(this.aClass145_1);
						local161.aClass489_46.method30026(1.0F / local293.aFloat148, 1.0F / local293.aFloat148, 1.0F, 1.0F);
						local161.anInt1140 = local293.anInt1537;
						local161.anInt1141 = local293.anInt1540 - local293.anInt1537 + 1;
						local161.anInt1138 = local280;
						local161.anInt1137 = local293.anInt1541 / 3;
						local161.method10102(local399);
						local280 += local293.anInt1541;
					}
				}
			} else {
				local161.aClass472_42.method29718(this.aClass104_Sub2_2.aFloatArray63[0], this.aClass104_Sub2_2.aFloatArray63[1], this.aClass104_Sub2_2.aFloatArray63[2]);
				local161.aClass472_43.method29718(this.aClass104_Sub2_2.aFloat212 * this.aClass104_Sub2_2.aFloat214, this.aClass104_Sub2_2.aFloat212 * this.aClass104_Sub2_2.aFloat210, this.aClass104_Sub2_2.aFloat212 * this.aClass104_Sub2_2.aFloat217);
				local161.aClass472_44.method29718(-this.aClass104_Sub2_2.aFloat213 * this.aClass104_Sub2_2.aFloat214, -this.aClass104_Sub2_2.aFloat213 * this.aClass104_Sub2_2.aFloat210, -this.aClass104_Sub2_2.aFloat213 * this.aClass104_Sub2_2.aFloat217);
				local161.aClass472_38.method29718(this.aClass104_Sub2_2.aFloat211 * this.aClass104_Sub2_2.aFloat214, this.aClass104_Sub2_2.aFloat211 * this.aClass104_Sub2_2.aFloat210, this.aClass104_Sub2_2.aFloat211 * this.aClass104_Sub2_2.aFloat217);
				local280 = 0;
				for (local282 = 0; local282 < this.aClass93Array3.length; local282++) {
					local293 = (Class93_Sub18) this.aClass93Array3[local282];
					if (local293.anInt1541 > 0) {
						if (this.aClass104_Sub2_2.aBoolean473) {
							this.aClass104_Sub2_2.method20557(0, local293.aClass237_3);
							@Pc(613) float local613 = 0.15F;
							local161.aClass460_8.method29375(0.0F, 1.0F / ((float) (local293.aClass237_3.anInt3856 * -2052057497) * local613), 0.0F, 256.0F / ((float) (local293.aClass237_3.anInt3856 * -2052057497) * local613));
							local161.aClass472_40.method29718((float) (local293.aClass237_3.anInt3858 * -1393096381 >> 16 & 0xFF) / 255.0F, (float) (local293.aClass237_3.anInt3858 * -1393096381 >> 8 & 0xFF) / 255.0F, (float) (local293.aClass237_3.anInt3858 * -1393096381 >> 0 & 0xFF) / 255.0F);
						} else {
							local161.aClass460_8.method29375(0.0F, 0.0F, 0.0F, 0.0F);
							local161.aClass472_40.method29718(0.0F, 0.0F, 0.0F);
						}
						@Pc(693) byte local693 = 11;
						if (local293.anInt1538 == -1) {
							local161.anInterface38_18 = this.aClass104_Sub2_2.anInterface38_23;
						} else {
							local411 = this.aClass104_Sub2_2.aClass225_6.method25690(local293.anInt1538, 675127309);
							local693 = local411.aByte114;
							local161.anInterface38_18 = this.aClass104_Sub2_2.aClass406_3.method28743(local411);
							local161.method10119(local411.aByte112);
						}
						this.aClass104_Sub2_2.method21060(1, local293.anInterface37_10);
						this.aClass104_Sub2_2.method21118(this.aClass145_1);
						local161.aClass489_46.method30026(1.0F / local293.aFloat148, 1.0F / local293.aFloat148, 1.0F, 1.0F);
						local161.anInt1140 = local293.anInt1537;
						local161.anInt1141 = local293.anInt1540 - local293.anInt1537 + 1;
						local161.anInt1138 = local280;
						local161.anInt1137 = local293.anInt1541 / 3;
						switch(local693) {
							case 1:
								local161.aClass472_39.method29718(this.aClass104_Sub2_2.aClass489_72.aFloatArray116[12], this.aClass104_Sub2_2.aClass489_72.aFloatArray116[13], this.aClass104_Sub2_2.aClass489_72.aFloatArray116[14]);
								if (this.aClass104_Sub2_2.aBoolean473) {
									local161.method10107();
								} else {
									local161.method10114(0);
								}
								break;
							case 2:
							case 4:
							case 8:
							case 9:
								if (this.aClass104_Sub2_2.aBoolean463 || (this.anInt419 & 0x8) == 0 || !this.aClass104_Sub2_2.aClass128_Sub1_Sub1_6.method19654(-1338897291)) {
									local161.method10103(0);
								} else {
									@Pc(834) Class128_Sub1_Sub1 local834 = this.aClass104_Sub2_2.aClass128_Sub1_Sub1_6;
									if (local693 == 2) {
										local834 = this.aClass104_Sub2_2.aClass128_Sub1_Sub1_5;
									}
									local834.aClass489_71.method30018(this.aClass104_Sub2_2.aClass489_84);
									local834.aClass489_70.method30026(1.0F / (local293.aFloat148 * (float) (local293.aClass237_3.anInt3859 * -8330653)), 1.0F / (local293.aFloat148 * (float) (local293.aClass237_3.anInt3859 * -8330653)), 1.0F, 1.0F);
									local834.aClass472_56.method29718(this.aClass104_Sub2_2.aClass489_72.aFloatArray116[12], this.aClass104_Sub2_2.aClass489_72.aFloatArray116[13], this.aClass104_Sub2_2.aClass489_72.aFloatArray116[14]);
									@Pc(903) Class235 local903 = this.aClass104_Sub2_2.aClass225_6.method25690(local293.anInt1538, 2090283958);
									local834.anInt2749 = local903.aByte112 * 796741929;
									local834.anInt2747 = local293.anInt1537 * -72899815;
									local834.anInt2748 = (local293.anInt1540 - local293.anInt1537 + 1) * -1423895923;
									local834.anInt2746 = local280 * -854029149;
									local834.anInt2750 = local293.anInt1541 / 3 * 184654049;
									local834.aClass460_16.method29376(local161.aClass460_8);
									local834.aClass472_57.method29719(local161.aClass472_40);
									local834.aClass460_12.method29376(local161.aClass460_9);
									local834.aClass472_58.method29719(local161.aClass472_41);
									local834.method19655((byte) -1);
								}
								break;
							case 3:
							case 5:
							default:
								if (this.aClass104_Sub2_2.aBoolean473) {
									local161.method10106();
								} else {
									local161.method10103(0);
								}
								break;
							case 6:
								local161.method10102(!Class588.method31830(local693, (byte) 10));
								break;
							case 7:
								local161.aClass472_39.method29718(this.aClass104_Sub2_2.aClass489_72.aFloatArray116[12], this.aClass104_Sub2_2.aClass489_72.aFloatArray116[13], this.aClass104_Sub2_2.aClass489_72.aFloatArray116[14]);
								local161.aClass489_45.method30017();
								local161.anInterface44_3 = this.aClass104_Sub2_2.method20934();
								local161.method10109(0);
						}
						local280 += local293.anInt1541;
					}
				}
			}
		}
		if (!this.aClass22_4.method418(1826833686)) {
			this.aClass104_Sub2_2.method20994(128);
			this.aClass104_Sub2_2.method21302(false);
			@Pc(1036) Class472 local1036 = new Class472(local161.aClass472_41);
			local161.aClass472_41.method29718(0.0F, 0.0F, 0.0F);
			@Pc(1046) Iterator local1046 = this.aClass22_4.iterator();
			while (local1046.hasNext()) {
				@Pc(1053) Class93_Sub34 local1053 = (Class93_Sub34) local1046.next();
				local1053.method13955(local161, arg0, arg1, arg2, arg3, arg4);
			}
			local161.aClass472_41.method29719(local1036);
		}
		if (this.aClass397_1 == null) {
			return;
		}
		this.aClass104_Sub2_2.method20994(1);
		this.aClass104_Sub2_2.method21060(0, this.anInterface37_1);
		this.aClass104_Sub2_2.method21060(1, this.anInterface37_2);
		this.aClass104_Sub2_2.method21118(this.aClass145_1);
		@Pc(1094) Class489 local1094 = this.aClass104_Sub2_2.aClass489_78;
		local1094.method30017();
		local1094.aFloatArray116[13] = -1.0F;
		local161.method10101(local1094);
		this.aClass397_1.method28653(local161, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!aem", name = "w", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method2479(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean[][] arg7) {
		if (this.anInt423 <= 0) {
			return;
		}
		@Pc(9) Interface40 local9 = this.aClass104_Sub2_2.method20928(this.anInt424);
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 32767;
		@Pc(15) int local15 = -32768;
		@Pc(19) ByteBuffer local19 = this.aClass104_Sub2_2.aByteBuffer7;
		local19.clear();
		for (@Pc(24) int local24 = arg4; local24 < arg6; local24++) {
			@Pc(36) int local36 = local24 * this.anInt414 * -1667858293 + arg3;
			for (@Pc(38) int local38 = arg3; local38 < arg5; local38++) {
				if (arg7[local38 - arg3][local24 - arg4]) {
					@Pc(56) short[] local56 = this.aShortArrayArray3[local36];
					if (local56 != null) {
						for (@Pc(60) int local60 = 0; local60 < local56.length; local60++) {
							@Pc(70) int local70 = local56[local60] & 0xFFFF;
							if (local70 > local15) {
								local15 = local70;
							}
							if (local70 < local13) {
								local13 = local70;
							}
							local19.putShort((short) local70);
							local11++;
						}
					}
				}
				local36++;
			}
		}
		local9.method29514(0, local19.position(), this.aClass104_Sub2_2.aLong132);
		if (local11 <= 0) {
			return;
		}
		this.aClass104_Sub2_2.method20962();
		@Pc(111) Class131 local111 = this.aClass104_Sub2_2.aClass131_3;
		this.aClass104_Sub2_2.method21060(0, this.anInterface37_1);
		this.aClass104_Sub2_2.method21060(1, this.anInterface37_2);
		this.aClass104_Sub2_2.method21118(this.aClass145_1);
		this.aClass104_Sub2_2.method21042(local9);
		this.aClass104_Sub2_2.method20528(Class470.aClass470_54);
		@Pc(143) float local143 = (float) this.aClass104_Sub2_2.method20446((byte) -51).method23748();
		@Pc(150) float local150 = (float) this.aClass104_Sub2_2.method20446((byte) -7).method23749();
		@Pc(154) Class470 local154 = new Class470();
		@Pc(158) Class470 local158 = new Class470();
		local154.method29551(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F);
		local158.method29601((float) arg2 / ((float) (this.anInt412 * -1678286317) * 256.0F), (float) -arg2 / ((float) (this.anInt412 * -1678286317) * 256.0F), 1.0F / (this.aFloat24 - this.aFloat23));
		local158.method29568((float) arg0 - (float) (arg3 * arg2) / 256.0F, (float) arg1 + (float) (arg6 * arg2) / 256.0F, -this.aFloat23 / (this.aFloat24 - this.aFloat23));
		local158.method29565(2.0F / local143, 2.0F / local150, 1.0F);
		local158.method29568(-1.0F, -1.0F, 0.0F);
		this.aClass104_Sub2_2.aClass470_36.method29570(local154, local158);
		this.aClass104_Sub2_2.aClass489_78.method30023(this.aClass104_Sub2_2.aClass470_36);
		this.aClass104_Sub2_2.method20531(this.aClass104_Sub2_2.aClass489_78);
		local111.method10101(Class489.aClass489_99);
		local111.aClass460_9.method29375(0.0F, 0.0F, 0.0F, 0.0F);
		local111.aClass472_41.method29718(0.0F, 0.0F, 0.0F);
		local111.aClass460_8.method29375(0.0F, 0.0F, 0.0F, 0.0F);
		local111.aClass472_40.method29718(0.0F, 0.0F, 0.0F);
		local111.anInterface38_18 = this.aClass104_Sub2_2.anInterface38_23;
		local111.aClass489_46.method30017();
		local111.anInt1140 = local13;
		local111.anInt1141 = local15 - local13 + 1;
		local111.anInt1138 = 0;
		local111.anInt1137 = local11 / 3;
		if (this.aClass104_Sub2_2.aBoolean464) {
			this.aClass104_Sub2_2.method20530(false);
			local111.method10102(false);
			this.aClass104_Sub2_2.method20530(true);
		} else {
			local111.method10102(false);
		}
	}

	@OriginalMember(owner = "client!aem", name = "d", descriptor = "(IILclient!ara;)Lclient!ara;")
	@Override
	public Class93_Sub1_Sub4 method2484(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class93_Sub1_Sub4 arg2) {
		if ((this.aByteArrayArray8[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(19) int local19 = this.anInt412 * -1678286317 >> this.aClass104_Sub2_2.anInt2936;
		@Pc(22) Class93_Sub1_Sub4_Sub1 local22 = (Class93_Sub1_Sub4_Sub1) arg2;
		@Pc(31) Class93_Sub1_Sub4_Sub1 local31;
		if (local22 != null && local22.method23492(local19, local19)) {
			local31 = local22;
			local22.method23483();
		} else {
			local31 = new Class93_Sub1_Sub4_Sub1(this.aClass104_Sub2_2, local19, local19);
		}
		local31.method23481(0, 0, local19, local19);
		this.method2519(local31, arg0, arg1);
		return local31;
	}

	@OriginalMember(owner = "client!aem", name = "ay", descriptor = "(Lclient!ati;II)V")
	void method2519(@OriginalArg(0) Class93_Sub1_Sub4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) int[] local6 = this.anIntArrayArrayArray11[arg1][arg2];
		@Pc(13) int[] local13 = this.anIntArrayArrayArray8[arg1][arg2];
		@Pc(16) int local16 = local6.length;
		if (this.anIntArray32.length < local16) {
			this.anIntArray32 = new int[local16];
			this.anIntArray33 = new int[local16];
		}
		@Pc(31) int local31;
		for (local31 = 0; local31 < local16; local31++) {
			this.anIntArray32[local31] = local6[local31] >> this.aClass104_Sub2_2.anInt2936;
			this.anIntArray33[local31] = local13[local31] >> this.aClass104_Sub2_2.anInt2936;
		}
		local31 = 0;
		while (local31 < local16) {
			@Pc(68) int local68 = this.anIntArray32[local31];
			@Pc(74) int local74 = this.anIntArray33[local31++];
			@Pc(79) int local79 = this.anIntArray32[local31];
			@Pc(85) int local85 = this.anIntArray33[local31++];
			@Pc(90) int local90 = this.anIntArray32[local31];
			@Pc(96) int local96 = this.anIntArray33[local31++];
			if ((local68 - local79) * (local85 - local96) - (local85 - local74) * (local90 - local79) > 0) {
				arg0.method23484(local74, local85, local96, local68, local79, local90);
			}
		}
	}

	@OriginalMember(owner = "client!aem", name = "v", descriptor = "(Lclient!ara;IIIIZ)Z")
	@Override
	public boolean method2488(@OriginalArg(0) Class93_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass397_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(20) int local20 = arg1 - (arg2 * this.aClass104_Sub2_2.anInt2937 >> 8) >> this.aClass104_Sub2_2.anInt2936;
			@Pc(34) int local34 = arg3 - (arg2 * this.aClass104_Sub2_2.anInt2938 >> 8) >> this.aClass104_Sub2_2.anInt2936;
			return this.aClass397_1.method28648(arg0, local20, local34);
		}
	}

	@OriginalMember(owner = "client!aem", name = "az", descriptor = "()V")
	void method2520() {
		if ((this.anInt418 & 0x2) == 0) {
			this.anIntArrayArrayArray8 = null;
			this.anIntArrayArrayArray11 = null;
			this.anIntArrayArrayArray12 = null;
		}
		this.anIntArrayArrayArray10 = null;
		this.anIntArrayArrayArray7 = null;
		this.anIntArrayArrayArray9 = null;
		this.aClass93_Sub18ArrayArrayArray1 = null;
		this.aByteArrayArray9 = null;
		this.aClass16_5 = null;
		this.aClass93Array4 = null;
		this.aFloatArrayArray5 = null;
		this.aFloatArrayArray6 = null;
		this.aFloatArrayArray4 = null;
	}

	@OriginalMember(owner = "client!aem", name = "r", descriptor = "(Lclient!ara;IIIIZ)V")
	@Override
	public void method2496(@OriginalArg(0) Class93_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass397_1 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass104_Sub2_2.anInt2937 >> 8) >> this.aClass104_Sub2_2.anInt2936;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass104_Sub2_2.anInt2938 >> 8) >> this.aClass104_Sub2_2.anInt2936;
			this.aClass397_1.method28659(arg0, local19, local33);
		}
	}

	@OriginalMember(owner = "client!aem", name = "o", descriptor = "(Lclient!akf;[I)V")
	@Override
	public void method2502(@OriginalArg(0) Class93_Sub16 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass22_4.method407(new Class93_Sub34(this.aClass104_Sub2_2, this, arg0, arg1), -1736205364);
	}

	@OriginalMember(owner = "client!aem", name = "n", descriptor = "(II[I[I[I[I[I[I[I[ILclient!dy;Z)V")
	@Override
	public void method2510(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) Class237 arg10, @OriginalArg(11) boolean arg11) {
		@Pc(3) Class225 local3 = this.aClass104_Sub2_2.aClass225_6;
		if (arg5 != null && this.anIntArrayArrayArray10 == null) {
			this.anIntArrayArrayArray10 = new int[this.anInt414 * -1667858293][this.anInt413 * -143202029][];
		}
		if (arg3 != null && this.anIntArrayArrayArray9 == null) {
			this.anIntArrayArrayArray9 = new int[this.anInt414 * -1667858293][this.anInt413 * -143202029][];
		}
		this.anIntArrayArrayArray11[arg0][arg1] = arg2;
		this.anIntArrayArrayArray8[arg0][arg1] = arg4;
		this.anIntArrayArrayArray12[arg0][arg1] = arg6;
		this.anIntArrayArrayArray7[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray10 != null) {
			this.anIntArrayArrayArray10[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray9 != null) {
			this.anIntArrayArrayArray9[arg0][arg1] = arg3;
		}
		@Pc(94) Class93_Sub18[] local94 = this.aClass93_Sub18ArrayArrayArray1[arg0][arg1] = new Class93_Sub18[arg6.length];
		for (@Pc(96) int local96 = 0; local96 < arg6.length; local96++) {
			@Pc(104) int local104 = arg8[local96];
			@Pc(108) int local108 = arg9[local96];
			if ((this.anInt419 & 0x20) != 0 && local104 != -1 && local3.method25690(local104, -1379010840).aBoolean660) {
				local108 = 128;
				local104 = -1;
			}
			@Pc(158) long local158 = (long) (arg10.anInt3860 * -94478965) << 48 | (long) (arg10.anInt3856 * -2052057497) << 42 | (long) (arg10.anInt3858 * -1393096381) << 28 | (long) (local108 << 14) | (long) local104;
			@Pc(163) Class93 local163;
			for (local163 = this.aClass16_5.method215(local158); local163 != null; local163 = this.aClass16_5.method216(-1796956099)) {
				@Pc(168) Class93_Sub18 local168 = (Class93_Sub18) local163;
				if (local168.anInt1538 == local104 && local168.aFloat148 == (float) local108 && local168.aClass237_3.method25862(arg10, -1033068328)) {
					break;
				}
			}
			if (local163 == null) {
				local94[local96] = new Class93_Sub18(this, local104, local108, arg10);
				this.aClass16_5.method221(local94[local96], local158);
			} else {
				local94[local96] = (Class93_Sub18) local163;
			}
		}
		if (arg11) {
			this.aByteArrayArray8[arg0][arg1] = (byte) (this.aByteArrayArray8[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt421) {
			this.anInt421 = arg6.length;
		}
		this.anInt423 += arg6.length;
	}

	@OriginalMember(owner = "client!aem", name = "t", descriptor = "(Lclient!ara;IIIIZ)V")
	@Override
	public void method2500(@OriginalArg(0) Class93_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass397_1 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass104_Sub2_2.anInt2937 >> 8) >> this.aClass104_Sub2_2.anInt2936;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass104_Sub2_2.anInt2938 >> 8) >> this.aClass104_Sub2_2.anInt2936;
			this.aClass397_1.method28646(arg0, local19, local33);
		}
	}

	@OriginalMember(owner = "client!aem", name = "q", descriptor = "(II[I[I[I[I[I[I[I[ILclient!dy;Z)V")
	@Override
	public void method2473(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) Class237 arg10, @OriginalArg(11) boolean arg11) {
		@Pc(3) Class225 local3 = this.aClass104_Sub2_2.aClass225_6;
		if (arg5 != null && this.anIntArrayArrayArray10 == null) {
			this.anIntArrayArrayArray10 = new int[this.anInt414 * -1667858293][this.anInt413 * -143202029][];
		}
		if (arg3 != null && this.anIntArrayArrayArray9 == null) {
			this.anIntArrayArrayArray9 = new int[this.anInt414 * -1667858293][this.anInt413 * -143202029][];
		}
		this.anIntArrayArrayArray11[arg0][arg1] = arg2;
		this.anIntArrayArrayArray8[arg0][arg1] = arg4;
		this.anIntArrayArrayArray12[arg0][arg1] = arg6;
		this.anIntArrayArrayArray7[arg0][arg1] = arg7;
		if (this.anIntArrayArrayArray10 != null) {
			this.anIntArrayArrayArray10[arg0][arg1] = arg5;
		}
		if (this.anIntArrayArrayArray9 != null) {
			this.anIntArrayArrayArray9[arg0][arg1] = arg3;
		}
		@Pc(94) Class93_Sub18[] local94 = this.aClass93_Sub18ArrayArrayArray1[arg0][arg1] = new Class93_Sub18[arg6.length];
		for (@Pc(96) int local96 = 0; local96 < arg6.length; local96++) {
			@Pc(104) int local104 = arg8[local96];
			@Pc(108) int local108 = arg9[local96];
			if ((this.anInt419 & 0x20) != 0 && local104 != -1 && local3.method25690(local104, 2004749369).aBoolean660) {
				local108 = 128;
				local104 = -1;
			}
			@Pc(158) long local158 = (long) (arg10.anInt3860 * -94478965) << 48 | (long) (arg10.anInt3856 * -2052057497) << 42 | (long) (arg10.anInt3858 * -1393096381) << 28 | (long) (local108 << 14) | (long) local104;
			@Pc(163) Class93 local163;
			for (local163 = this.aClass16_5.method215(local158); local163 != null; local163 = this.aClass16_5.method216(-1796956099)) {
				@Pc(168) Class93_Sub18 local168 = (Class93_Sub18) local163;
				if (local168.anInt1538 == local104 && local168.aFloat148 == (float) local108 && local168.aClass237_3.method25862(arg10, -862565487)) {
					break;
				}
			}
			if (local163 == null) {
				local94[local96] = new Class93_Sub18(this, local104, local108, arg10);
				this.aClass16_5.method221(local94[local96], local158);
			} else {
				local94[local96] = (Class93_Sub18) local163;
			}
		}
		if (arg11) {
			this.aByteArrayArray8[arg0][arg1] = (byte) (this.aByteArrayArray8[arg0][arg1] | 0x1);
		}
		if (arg6.length > this.anInt421) {
			this.anInt421 = arg6.length;
		}
		this.anInt423 += arg6.length;
	}

	@OriginalMember(owner = "client!aem", name = "x", descriptor = "()V")
	@Override
	public void method2492() {
		if (this.anInt423 <= 0) {
			this.aClass397_1 = null;
			this.method2517();
			return;
		}
		@Pc(22) byte[][] local22 = new byte[this.anInt414 * -1667858293 + 1][this.anInt413 * -143202029 + 1];
		@Pc(24) int local24;
		@Pc(32) int local32;
		for (local24 = 1; local24 < this.anInt414 * -1667858293; local24++) {
			for (local32 = 1; local32 < this.anInt413 * -143202029; local32++) {
				local22[local24][local32] = (byte) ((this.aByteArrayArray9[local24 - 1][local32] >> 2) + (this.aByteArrayArray9[local24 + 1][local32] >> 3) + (this.aByteArrayArray9[local24][local32 - 1] >> 2) + (this.aByteArrayArray9[local24][local32 + 1] >> 3) + (this.aByteArrayArray9[local24][local32] >> 1));
			}
		}
		this.aClass93Array4 = new Class93[this.aClass16_5.method218(2024693358)];
		this.aClass16_5.method217(this.aClass93Array4, (byte) 0);
		for (local24 = 0; local24 < this.aClass93Array4.length; local24++) {
			((Class93_Sub18) this.aClass93Array4[local24]).method13590(this.anInt423);
		}
		this.anInt427 = 20;
		if (this.anIntArrayArrayArray10 != null) {
			this.anInt427 += 4;
		}
		if ((this.anInt419 & 0x7) != 0) {
			this.anInt427 += 12;
		}
		this.aByteBuffer1 = this.aClass104_Sub2_2.method21092(this.anInt423 * 4);
		this.aByteBuffer2 = this.aClass104_Sub2_2.method21092(this.anInt423 * this.anInt427);
		@Pc(177) Class93_Sub18[] local177 = new Class93_Sub18[this.anInt423];
		local32 = Class278.method26458(this.anInt423 / 4, 423254006);
		if (local32 < 1) {
			local32 = 1;
		}
		@Pc(194) Class16 local194 = new Class16(local32);
		@Pc(198) Class93_Sub18[] local198 = new Class93_Sub18[this.anInt421];
		@Pc(200) int local200;
		@Pc(208) int local208;
		for (local200 = 0; local200 < this.anInt414 * -1667858293; local200++) {
			for (local208 = 0; local208 < this.anInt413 * -143202029; local208++) {
				this.method2518(local200, local208, local22, local198, local194, local177);
			}
		}
		@Pc(236) Class93_Sub18 local236;
		for (local200 = 0; local200 < this.anInt420; local200++) {
			local236 = local177[local200];
			if (local236 != null) {
				local236.method13592(local200);
			}
		}
		for (local200 = 0; local200 < this.anInt414 * -1667858293; local200++) {
			for (local208 = 0; local208 < this.anInt413 * -143202029; local208++) {
				@Pc(271) short[] local271 = this.aShortArrayArray3[local208 * this.anInt414 * -1667858293 + local200];
				if (local271 != null) {
					@Pc(275) int local275 = 0;
					@Pc(277) int local277 = 0;
					while (local277 < local271.length) {
						@Pc(288) int local288 = local271[local277++] & 0xFFFF;
						@Pc(295) int local295 = local271[local277++] & 0xFFFF;
						@Pc(302) int local302 = local271[local277++] & 0xFFFF;
						@Pc(306) Class93_Sub18 local306 = local177[local288];
						@Pc(310) Class93_Sub18 local310 = local177[local295];
						@Pc(314) Class93_Sub18 local314 = local177[local302];
						@Pc(316) Class93_Sub18 local316 = null;
						if (local306 != null) {
							local306.method13593(local200, local208, local275);
							local316 = local306;
						}
						if (local310 != null) {
							local310.method13593(local200, local208, local275);
							if (local316 == null || local310.aLong232 * -3750704643647536275L < local316.aLong232 * -3750704643647536275L) {
								local316 = local310;
							}
						}
						if (local314 != null) {
							local314.method13593(local200, local208, local275);
							if (local316 == null || local314.aLong232 * -3750704643647536275L < local316.aLong232 * -3750704643647536275L) {
								local316 = local314;
							}
						}
						if (local316 != null) {
							if (local306 != null) {
								local316.method13592(local288);
							}
							if (local310 != null) {
								local316.method13592(local295);
							}
							if (local314 != null) {
								local316.method13592(local302);
							}
							local316.method13593(local200, local208, local275);
						}
						local275++;
					}
				}
			}
		}
		this.anInt426 = 0;
		for (local200 = 0; local200 < this.aClass93Array4.length; local200++) {
			local236 = (Class93_Sub18) this.aClass93Array4[local200];
			if (local236.anInt1539 > 0) {
				this.aClass93Array4[this.anInt426++] = local236;
			}
		}
		this.aClass93Array3 = new Class93[this.anInt426];
		@Pc(436) long[] local436 = new long[this.anInt426];
		for (local208 = 0; local208 < this.anInt426; local208++) {
			@Pc(448) Class93_Sub18 local448 = (Class93_Sub18) this.aClass93Array4[local208];
			local436[local208] = local448.aLong232 * -3750704643647536275L;
			this.aClass93Array3[local208] = local448;
		}
		Class659.method32994(local436, this.aClass93Array3, -2082159576);
		this.method2516();
	}

	@OriginalMember(owner = "client!aem", name = "k", descriptor = "()V")
	@Override
	public void method2508() {
		if (this.anInt423 <= 0) {
			this.aClass397_1 = null;
			this.method2517();
			return;
		}
		@Pc(22) byte[][] local22 = new byte[this.anInt414 * -1667858293 + 1][this.anInt413 * -143202029 + 1];
		@Pc(24) int local24;
		@Pc(32) int local32;
		for (local24 = 1; local24 < this.anInt414 * -1667858293; local24++) {
			for (local32 = 1; local32 < this.anInt413 * -143202029; local32++) {
				local22[local24][local32] = (byte) ((this.aByteArrayArray9[local24 - 1][local32] >> 2) + (this.aByteArrayArray9[local24 + 1][local32] >> 3) + (this.aByteArrayArray9[local24][local32 - 1] >> 2) + (this.aByteArrayArray9[local24][local32 + 1] >> 3) + (this.aByteArrayArray9[local24][local32] >> 1));
			}
		}
		this.aClass93Array4 = new Class93[this.aClass16_5.method218(-585490185)];
		this.aClass16_5.method217(this.aClass93Array4, (byte) 0);
		for (local24 = 0; local24 < this.aClass93Array4.length; local24++) {
			((Class93_Sub18) this.aClass93Array4[local24]).method13590(this.anInt423);
		}
		this.anInt427 = 20;
		if (this.anIntArrayArrayArray10 != null) {
			this.anInt427 += 4;
		}
		if ((this.anInt419 & 0x7) != 0) {
			this.anInt427 += 12;
		}
		this.aByteBuffer1 = this.aClass104_Sub2_2.method21092(this.anInt423 * 4);
		this.aByteBuffer2 = this.aClass104_Sub2_2.method21092(this.anInt423 * this.anInt427);
		@Pc(177) Class93_Sub18[] local177 = new Class93_Sub18[this.anInt423];
		local32 = Class278.method26458(this.anInt423 / 4, 423254006);
		if (local32 < 1) {
			local32 = 1;
		}
		@Pc(194) Class16 local194 = new Class16(local32);
		@Pc(198) Class93_Sub18[] local198 = new Class93_Sub18[this.anInt421];
		@Pc(200) int local200;
		@Pc(208) int local208;
		for (local200 = 0; local200 < this.anInt414 * -1667858293; local200++) {
			for (local208 = 0; local208 < this.anInt413 * -143202029; local208++) {
				this.method2518(local200, local208, local22, local198, local194, local177);
			}
		}
		@Pc(236) Class93_Sub18 local236;
		for (local200 = 0; local200 < this.anInt420; local200++) {
			local236 = local177[local200];
			if (local236 != null) {
				local236.method13592(local200);
			}
		}
		for (local200 = 0; local200 < this.anInt414 * -1667858293; local200++) {
			for (local208 = 0; local208 < this.anInt413 * -143202029; local208++) {
				@Pc(271) short[] local271 = this.aShortArrayArray3[local208 * this.anInt414 * -1667858293 + local200];
				if (local271 != null) {
					@Pc(275) int local275 = 0;
					@Pc(277) int local277 = 0;
					while (local277 < local271.length) {
						@Pc(288) int local288 = local271[local277++] & 0xFFFF;
						@Pc(295) int local295 = local271[local277++] & 0xFFFF;
						@Pc(302) int local302 = local271[local277++] & 0xFFFF;
						@Pc(306) Class93_Sub18 local306 = local177[local288];
						@Pc(310) Class93_Sub18 local310 = local177[local295];
						@Pc(314) Class93_Sub18 local314 = local177[local302];
						@Pc(316) Class93_Sub18 local316 = null;
						if (local306 != null) {
							local306.method13593(local200, local208, local275);
							local316 = local306;
						}
						if (local310 != null) {
							local310.method13593(local200, local208, local275);
							if (local316 == null || local310.aLong232 * -3750704643647536275L < local316.aLong232 * -3750704643647536275L) {
								local316 = local310;
							}
						}
						if (local314 != null) {
							local314.method13593(local200, local208, local275);
							if (local316 == null || local314.aLong232 * -3750704643647536275L < local316.aLong232 * -3750704643647536275L) {
								local316 = local314;
							}
						}
						if (local316 != null) {
							if (local306 != null) {
								local316.method13592(local288);
							}
							if (local310 != null) {
								local316.method13592(local295);
							}
							if (local314 != null) {
								local316.method13592(local302);
							}
							local316.method13593(local200, local208, local275);
						}
						local275++;
					}
				}
			}
		}
		this.anInt426 = 0;
		for (local200 = 0; local200 < this.aClass93Array4.length; local200++) {
			local236 = (Class93_Sub18) this.aClass93Array4[local200];
			if (local236.anInt1539 > 0) {
				this.aClass93Array4[this.anInt426++] = local236;
			}
		}
		this.aClass93Array3 = new Class93[this.anInt426];
		@Pc(436) long[] local436 = new long[this.anInt426];
		for (local208 = 0; local208 < this.anInt426; local208++) {
			@Pc(448) Class93_Sub18 local448 = (Class93_Sub18) this.aClass93Array4[local208];
			local436[local208] = local448.aLong232 * -3750704643647536275L;
			this.aClass93Array3[local208] = local448;
		}
		Class659.method32994(local436, this.aClass93Array3, -392639590);
		this.method2516();
	}

	@OriginalMember(owner = "client!aem", name = "s", descriptor = "(III)V")
	@Override
	public void method2505(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = Math.min(this.aByteArrayArray9.length - 1, Math.max(0, arg0));
		@Pc(21) int local21 = Math.min(this.aByteArrayArray9[local9].length - 1, Math.max(0, arg1));
		if ((this.aByteArrayArray9[local9][local21] & 0xFF) < arg2) {
			this.aByteArrayArray9[local9][local21] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!aem", name = "a", descriptor = "(III[[ZZI)V")
	@Override
	public void method2495(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (this.aClass93Array3 == null) {
			return;
		}
		@Pc(8) int local8 = arg2 + arg2 + 1;
		@Pc(12) int local12 = local8 * local8;
		if (this.anIntArray34.length < local12) {
			this.anIntArray34 = new int[local12];
		}
		@Pc(25) int local25 = arg0 - arg2;
		@Pc(27) int local27 = local25;
		if (local25 < 0) {
			local25 = 0;
		}
		@Pc(35) int local35 = arg1 - arg2;
		@Pc(37) int local37 = local35;
		if (local35 < 0) {
			local35 = 0;
		}
		@Pc(45) int local45 = arg0 + arg2;
		if (local45 > this.anInt414 * -1667858293 - 1) {
			local45 = this.anInt414 * -1667858293 - 1;
		}
		@Pc(64) int local64 = arg1 + arg2;
		if (local64 > this.anInt413 * -143202029 - 1) {
			local64 = this.anInt413 * -143202029 - 1;
		}
		this.anInt428 = 0;
		for (@Pc(84) int local84 = local25; local84 <= local45; local84++) {
			@Pc(93) boolean[] local93 = arg3[local84 - local27];
			for (@Pc(95) int local95 = local35; local95 <= local64; local95++) {
				if (local93[local95 - local37]) {
					this.anIntArray34[this.anInt428++] = local95 * this.anInt414 * -1667858293 + local84;
				}
			}
		}
		@Pc(130) ByteBuffer local130 = this.aClass104_Sub2_2.aByteBuffer7;
		local130.clear();
		@Pc(135) int local135;
		for (local135 = 0; local135 < this.aClass93Array3.length; local135++) {
			@Pc(146) Class93_Sub18 local146 = (Class93_Sub18) this.aClass93Array3[local135];
			local146.method13596(this.anIntArray34, this.anInt428);
		}
		local135 = local130.position();
		@Pc(161) Class131 local161 = this.aClass104_Sub2_2.aClass131_3;
		this.aClass104_Sub2_2.method20962();
		if (this.aClass104_Sub2_2.anInt2947 > 0) {
			local161.aClass472_41.method29718((float) (this.aClass104_Sub2_2.anInt2957 >> 16 & 0xFF) / 255.0F, (float) (this.aClass104_Sub2_2.anInt2957 >> 8 & 0xFF) / 255.0F, (float) (this.aClass104_Sub2_2.anInt2957 >> 0 & 0xFF) / 255.0F);
			local161.aClass460_9.method29375(0.0F, 0.0F, 1.0F, -this.aClass104_Sub2_2.aFloat216);
			local161.aClass460_9.method29393(this.aClass104_Sub2_2.aClass489_87);
			local161.aClass460_9.method29380(1.0F / (this.aClass104_Sub2_2.aFloat209 - this.aClass104_Sub2_2.aFloat216));
		} else {
			local161.aClass460_9.method29375(0.0F, 0.0F, 0.0F, 0.0F);
			local161.aClass472_41.method29718(0.0F, 0.0F, 0.0F);
		}
		if (local135 != 0) {
			@Pc(252) Interface40 local252 = this.aClass104_Sub2_2.method20928(local135 / 2);
			local252.method29514(0, local135, this.aClass104_Sub2_2.aLong132);
			this.aClass104_Sub2_2.method21060(0, this.anInterface37_1);
			this.aClass104_Sub2_2.method21042(local252);
			local161.method10101(Class489.aClass489_99);
			@Pc(280) int local280;
			@Pc(282) int local282;
			@Pc(293) Class93_Sub18 local293;
			@Pc(411) Class235 local411;
			if ((this.anInt419 & 0x7) == 0) {
				local280 = 0;
				for (local282 = 0; local282 < this.aClass93Array3.length; local282++) {
					local293 = (Class93_Sub18) this.aClass93Array3[local282];
					if (local293.anInt1541 != 0) {
						if (this.aClass104_Sub2_2.aBoolean473) {
							this.aClass104_Sub2_2.method20557(0, local293.aClass237_3);
							local161.aClass460_8.method29375(0.0F, 1.0F, 0.0F, (float) this.aClass104_Sub2_2.anInt2946 + (float) (local293.aClass237_3.anInt3860 * -94478965) / 255.0F * (float) (local293.aClass237_3.anInt3856 * -2052057497));
							local161.aClass460_8.method29380(1.0F / (float) (local293.aClass237_3.anInt3856 * -2052057497));
							local161.aClass472_40.method29718((float) (local293.aClass237_3.anInt3858 * -1393096381 >> 16 & 0xFF) / 255.0F, (float) (local293.aClass237_3.anInt3858 * -1393096381 >> 8 & 0xFF) / 255.0F, (float) (local293.aClass237_3.anInt3858 * -1393096381 >> 0 & 0xFF) / 255.0F);
						} else {
							local161.aClass460_8.method29375(0.0F, 0.0F, 0.0F, 0.0F);
							local161.aClass472_40.method29718(0.0F, 0.0F, 0.0F);
						}
						@Pc(399) boolean local399 = false;
						if (local293.anInt1538 == -1) {
							local161.anInterface38_18 = this.aClass104_Sub2_2.anInterface38_23;
						} else {
							local411 = this.aClass104_Sub2_2.aClass225_6.method25690(local293.anInt1538, 1308202015);
							local161.anInterface38_18 = this.aClass104_Sub2_2.aClass406_3.method28743(local411);
							local399 = !Class588.method31830(local411.aByte114, (byte) 10);
						}
						this.aClass104_Sub2_2.method21060(1, local293.anInterface37_10);
						this.aClass104_Sub2_2.method21118(this.aClass145_1);
						local161.aClass489_46.method30026(1.0F / local293.aFloat148, 1.0F / local293.aFloat148, 1.0F, 1.0F);
						local161.anInt1140 = local293.anInt1537;
						local161.anInt1141 = local293.anInt1540 - local293.anInt1537 + 1;
						local161.anInt1138 = local280;
						local161.anInt1137 = local293.anInt1541 / 3;
						local161.method10102(local399);
						local280 += local293.anInt1541;
					}
				}
			} else {
				local161.aClass472_42.method29718(this.aClass104_Sub2_2.aFloatArray63[0], this.aClass104_Sub2_2.aFloatArray63[1], this.aClass104_Sub2_2.aFloatArray63[2]);
				local161.aClass472_43.method29718(this.aClass104_Sub2_2.aFloat212 * this.aClass104_Sub2_2.aFloat214, this.aClass104_Sub2_2.aFloat212 * this.aClass104_Sub2_2.aFloat210, this.aClass104_Sub2_2.aFloat212 * this.aClass104_Sub2_2.aFloat217);
				local161.aClass472_44.method29718(-this.aClass104_Sub2_2.aFloat213 * this.aClass104_Sub2_2.aFloat214, -this.aClass104_Sub2_2.aFloat213 * this.aClass104_Sub2_2.aFloat210, -this.aClass104_Sub2_2.aFloat213 * this.aClass104_Sub2_2.aFloat217);
				local161.aClass472_38.method29718(this.aClass104_Sub2_2.aFloat211 * this.aClass104_Sub2_2.aFloat214, this.aClass104_Sub2_2.aFloat211 * this.aClass104_Sub2_2.aFloat210, this.aClass104_Sub2_2.aFloat211 * this.aClass104_Sub2_2.aFloat217);
				local280 = 0;
				for (local282 = 0; local282 < this.aClass93Array3.length; local282++) {
					local293 = (Class93_Sub18) this.aClass93Array3[local282];
					if (local293.anInt1541 > 0) {
						if (this.aClass104_Sub2_2.aBoolean473) {
							this.aClass104_Sub2_2.method20557(0, local293.aClass237_3);
							@Pc(613) float local613 = 0.15F;
							local161.aClass460_8.method29375(0.0F, 1.0F / ((float) (local293.aClass237_3.anInt3856 * -2052057497) * local613), 0.0F, 256.0F / ((float) (local293.aClass237_3.anInt3856 * -2052057497) * local613));
							local161.aClass472_40.method29718((float) (local293.aClass237_3.anInt3858 * -1393096381 >> 16 & 0xFF) / 255.0F, (float) (local293.aClass237_3.anInt3858 * -1393096381 >> 8 & 0xFF) / 255.0F, (float) (local293.aClass237_3.anInt3858 * -1393096381 >> 0 & 0xFF) / 255.0F);
						} else {
							local161.aClass460_8.method29375(0.0F, 0.0F, 0.0F, 0.0F);
							local161.aClass472_40.method29718(0.0F, 0.0F, 0.0F);
						}
						@Pc(693) byte local693 = 11;
						if (local293.anInt1538 == -1) {
							local161.anInterface38_18 = this.aClass104_Sub2_2.anInterface38_23;
						} else {
							local411 = this.aClass104_Sub2_2.aClass225_6.method25690(local293.anInt1538, 1276411924);
							local693 = local411.aByte114;
							local161.anInterface38_18 = this.aClass104_Sub2_2.aClass406_3.method28743(local411);
							local161.method10119(local411.aByte112);
						}
						this.aClass104_Sub2_2.method21060(1, local293.anInterface37_10);
						this.aClass104_Sub2_2.method21118(this.aClass145_1);
						local161.aClass489_46.method30026(1.0F / local293.aFloat148, 1.0F / local293.aFloat148, 1.0F, 1.0F);
						local161.anInt1140 = local293.anInt1537;
						local161.anInt1141 = local293.anInt1540 - local293.anInt1537 + 1;
						local161.anInt1138 = local280;
						local161.anInt1137 = local293.anInt1541 / 3;
						switch(local693) {
							case 1:
								local161.aClass472_39.method29718(this.aClass104_Sub2_2.aClass489_72.aFloatArray116[12], this.aClass104_Sub2_2.aClass489_72.aFloatArray116[13], this.aClass104_Sub2_2.aClass489_72.aFloatArray116[14]);
								if (this.aClass104_Sub2_2.aBoolean473) {
									local161.method10107();
								} else {
									local161.method10114(0);
								}
								break;
							case 2:
							case 4:
							case 8:
							case 9:
								if (this.aClass104_Sub2_2.aBoolean463 || (this.anInt419 & 0x8) == 0 || !this.aClass104_Sub2_2.aClass128_Sub1_Sub1_6.method19654(-1595083094)) {
									local161.method10103(0);
								} else {
									@Pc(834) Class128_Sub1_Sub1 local834 = this.aClass104_Sub2_2.aClass128_Sub1_Sub1_6;
									if (local693 == 2) {
										local834 = this.aClass104_Sub2_2.aClass128_Sub1_Sub1_5;
									}
									local834.aClass489_71.method30018(this.aClass104_Sub2_2.aClass489_84);
									local834.aClass489_70.method30026(1.0F / (local293.aFloat148 * (float) (local293.aClass237_3.anInt3859 * -8330653)), 1.0F / (local293.aFloat148 * (float) (local293.aClass237_3.anInt3859 * -8330653)), 1.0F, 1.0F);
									local834.aClass472_56.method29718(this.aClass104_Sub2_2.aClass489_72.aFloatArray116[12], this.aClass104_Sub2_2.aClass489_72.aFloatArray116[13], this.aClass104_Sub2_2.aClass489_72.aFloatArray116[14]);
									@Pc(903) Class235 local903 = this.aClass104_Sub2_2.aClass225_6.method25690(local293.anInt1538, -36937760);
									local834.anInt2749 = local903.aByte112 * 796741929;
									local834.anInt2747 = local293.anInt1537 * -72899815;
									local834.anInt2748 = (local293.anInt1540 - local293.anInt1537 + 1) * -1423895923;
									local834.anInt2746 = local280 * -854029149;
									local834.anInt2750 = local293.anInt1541 / 3 * 184654049;
									local834.aClass460_16.method29376(local161.aClass460_8);
									local834.aClass472_57.method29719(local161.aClass472_40);
									local834.aClass460_12.method29376(local161.aClass460_9);
									local834.aClass472_58.method29719(local161.aClass472_41);
									local834.method19655((byte) -1);
								}
								break;
							case 3:
							case 5:
							default:
								if (this.aClass104_Sub2_2.aBoolean473) {
									local161.method10106();
								} else {
									local161.method10103(0);
								}
								break;
							case 6:
								local161.method10102(!Class588.method31830(local693, (byte) 10));
								break;
							case 7:
								local161.aClass472_39.method29718(this.aClass104_Sub2_2.aClass489_72.aFloatArray116[12], this.aClass104_Sub2_2.aClass489_72.aFloatArray116[13], this.aClass104_Sub2_2.aClass489_72.aFloatArray116[14]);
								local161.aClass489_45.method30017();
								local161.anInterface44_3 = this.aClass104_Sub2_2.method20934();
								local161.method10109(0);
						}
						local280 += local293.anInt1541;
					}
				}
			}
		}
		if (!this.aClass22_4.method418(1697813791)) {
			this.aClass104_Sub2_2.method20994(128);
			this.aClass104_Sub2_2.method21302(false);
			@Pc(1036) Class472 local1036 = new Class472(local161.aClass472_41);
			local161.aClass472_41.method29718(0.0F, 0.0F, 0.0F);
			@Pc(1046) Iterator local1046 = this.aClass22_4.iterator();
			while (local1046.hasNext()) {
				@Pc(1053) Class93_Sub34 local1053 = (Class93_Sub34) local1046.next();
				local1053.method13955(local161, arg0, arg1, arg2, arg3, arg4);
			}
			local161.aClass472_41.method29719(local1036);
		}
		if (this.aClass397_1 == null) {
			return;
		}
		this.aClass104_Sub2_2.method20994(1);
		this.aClass104_Sub2_2.method21060(0, this.anInterface37_1);
		this.aClass104_Sub2_2.method21060(1, this.anInterface37_2);
		this.aClass104_Sub2_2.method21118(this.aClass145_1);
		@Pc(1094) Class489 local1094 = this.aClass104_Sub2_2.aClass489_78;
		local1094.method30017();
		local1094.aFloatArray116[13] = -1.0F;
		local161.method10101(local1094);
		this.aClass397_1.method28653(local161, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!aem", name = "g", descriptor = "(IILclient!ara;)Lclient!ara;")
	@Override
	public Class93_Sub1_Sub4 method2475(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class93_Sub1_Sub4 arg2) {
		if ((this.aByteArrayArray8[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(19) int local19 = this.anInt412 * -1678286317 >> this.aClass104_Sub2_2.anInt2936;
		@Pc(22) Class93_Sub1_Sub4_Sub1 local22 = (Class93_Sub1_Sub4_Sub1) arg2;
		@Pc(31) Class93_Sub1_Sub4_Sub1 local31;
		if (local22 != null && local22.method23492(local19, local19)) {
			local31 = local22;
			local22.method23483();
		} else {
			local31 = new Class93_Sub1_Sub4_Sub1(this.aClass104_Sub2_2, local19, local19);
		}
		local31.method23481(0, 0, local19, local19);
		this.method2519(local31, arg0, arg1);
		return local31;
	}

	@OriginalMember(owner = "client!aem", name = "i", descriptor = "(IILclient!ara;)Lclient!ara;")
	@Override
	public Class93_Sub1_Sub4 method2497(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class93_Sub1_Sub4 arg2) {
		if ((this.aByteArrayArray8[arg0][arg1] & 0x1) == 0) {
			return null;
		}
		@Pc(19) int local19 = this.anInt412 * -1678286317 >> this.aClass104_Sub2_2.anInt2936;
		@Pc(22) Class93_Sub1_Sub4_Sub1 local22 = (Class93_Sub1_Sub4_Sub1) arg2;
		@Pc(31) Class93_Sub1_Sub4_Sub1 local31;
		if (local22 != null && local22.method23492(local19, local19)) {
			local31 = local22;
			local22.method23483();
		} else {
			local31 = new Class93_Sub1_Sub4_Sub1(this.aClass104_Sub2_2, local19, local19);
		}
		local31.method23481(0, 0, local19, local19);
		this.method2519(local31, arg0, arg1);
		return local31;
	}

	@OriginalMember(owner = "client!aem", name = "j", descriptor = "(Lclient!ara;IIIIZ)V")
	@Override
	public void method2498(@OriginalArg(0) Class93_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass397_1 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass104_Sub2_2.anInt2937 >> 8) >> this.aClass104_Sub2_2.anInt2936;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass104_Sub2_2.anInt2938 >> 8) >> this.aClass104_Sub2_2.anInt2936;
			this.aClass397_1.method28646(arg0, local19, local33);
		}
	}

	@OriginalMember(owner = "client!aem", name = "c", descriptor = "(Lclient!ara;IIIIZ)V")
	@Override
	public void method2485(@OriginalArg(0) Class93_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass397_1 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass104_Sub2_2.anInt2937 >> 8) >> this.aClass104_Sub2_2.anInt2936;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass104_Sub2_2.anInt2938 >> 8) >> this.aClass104_Sub2_2.anInt2936;
			this.aClass397_1.method28646(arg0, local19, local33);
		}
	}

	@OriginalMember(owner = "client!aem", name = "ae", descriptor = "(Lclient!akf;[I)V")
	@Override
	public void method2489(@OriginalArg(0) Class93_Sub16 arg0, @OriginalArg(1) int[] arg1) {
		this.aClass22_4.method407(new Class93_Sub34(this.aClass104_Sub2_2, this, arg0, arg1), -424588083);
	}

	@OriginalMember(owner = "client!aem", name = "ag", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[ILclient!dy;Z)V")
	@Override
	public void method2487(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) Class237 arg13, @OriginalArg(14) boolean arg14) {
		@Pc(2) int local2 = arg9.length;
		@Pc(7) int[] local7 = new int[local2 * 3];
		@Pc(12) int[] local12 = new int[local2 * 3];
		@Pc(17) int[] local17 = new int[local2 * 3];
		@Pc(22) int[] local22 = new int[local2 * 3];
		@Pc(27) int[] local27 = new int[local2 * 3];
		@Pc(32) int[] local32 = new int[local2 * 3];
		@Pc(41) int[] local41 = arg3 == null ? null : new int[local2 * 3];
		@Pc(50) int[] local50 = arg5 == null ? null : new int[local2 * 3];
		@Pc(52) int local52 = 0;
		for (@Pc(54) int local54 = 0; local54 < local2; local54++) {
			@Pc(61) int local61 = arg6[local54];
			@Pc(65) int local65 = arg7[local54];
			@Pc(69) int local69 = arg8[local54];
			local7[local52] = arg2[local61];
			local12[local52] = arg4[local61];
			local17[local52] = arg9[local54];
			local27[local52] = arg11[local54];
			local32[local52] = arg12[local54];
			local22[local52] = arg10 == null ? arg9[local54] : arg10[local54];
			if (arg3 != null) {
				local41[local52] = arg3[local61];
			}
			if (arg5 != null) {
				local50[local52] = arg5[local61];
			}
			local52++;
			local7[local52] = arg2[local65];
			local12[local52] = arg4[local65];
			local17[local52] = arg9[local54];
			local27[local52] = arg11[local54];
			local32[local52] = arg12[local54];
			local22[local52] = arg10 == null ? arg9[local54] : arg10[local54];
			if (arg3 != null) {
				local41[local52] = arg3[local65];
			}
			if (arg5 != null) {
				local50[local52] = arg5[local65];
			}
			local52++;
			local7[local52] = arg2[local69];
			local12[local52] = arg4[local69];
			local17[local52] = arg9[local54];
			local27[local52] = arg11[local54];
			local32[local52] = arg12[local54];
			local22[local52] = arg10 == null ? arg9[local54] : arg10[local54];
			if (arg3 != null) {
				local41[local52] = arg3[local69];
			}
			if (arg5 != null) {
				local50[local52] = arg5[local69];
			}
			local52++;
		}
		this.method2510(arg0, arg1, local7, local41, local12, local50, local17, local22, local27, local32, arg13, arg14);
	}

	@OriginalMember(owner = "client!aem", name = "ab", descriptor = "()V")
	void method2521() {
		this.anInterface37_2 = this.aClass104_Sub2_2.method21025(false);
		this.anInterface37_2.method29496(this.anInt420 * 4, 4);
		this.anInterface37_2.method29514(0, this.anInt420 * 4, this.aClass104_Sub2_2.method20903(this.aByteBuffer1));
		this.anInterface37_1 = this.aClass104_Sub2_2.method21025(false);
		this.anInterface37_1.method29496(this.anInt420 * this.anInt427, this.anInt427);
		this.anInterface37_1.method29514(0, this.anInt420 * this.anInt427, this.aClass104_Sub2_2.method20903(this.aByteBuffer2));
		this.aByteBuffer1.clear();
		this.aByteBuffer1 = null;
		this.aByteBuffer2.clear();
		this.aByteBuffer2 = null;
		if ((this.anInt419 & 0x7) == 0) {
			if (this.anIntArrayArrayArray10 == null) {
				this.aClass145_1 = this.aClass104_Sub2_2.method21005(new Class400[] { new Class400(new Class399[] { Class399.aClass399_9, Class399.aClass399_1 }), new Class400(Class399.aClass399_10) });
			} else {
				this.aClass145_1 = this.aClass104_Sub2_2.method21005(new Class400[] { new Class400(new Class399[] { Class399.aClass399_9, Class399.aClass399_1, Class399.aClass399_3 }), new Class400(Class399.aClass399_10) });
			}
		} else if (this.anIntArrayArrayArray10 == null) {
			this.aClass145_1 = this.aClass104_Sub2_2.method21005(new Class400[] { new Class400(new Class399[] { Class399.aClass399_9, Class399.aClass399_1, Class399.aClass399_2 }), new Class400(Class399.aClass399_10) });
		} else {
			this.aClass145_1 = this.aClass104_Sub2_2.method21005(new Class400[] { new Class400(new Class399[] { Class399.aClass399_9, Class399.aClass399_1, Class399.aClass399_3, Class399.aClass399_2 }), new Class400(Class399.aClass399_10) });
		}
		for (@Pc(226) int local226 = 0; local226 < this.anInt426; local226++) {
			@Pc(236) Class93_Sub18 local236 = (Class93_Sub18) this.aClass93Array4[local226];
			local236.method13595(this.anInt420);
		}
		if (this.aClass397_1 != null) {
			this.aClass397_1.method28657();
		}
		this.method2517();
	}

	@OriginalMember(owner = "client!aem", name = "al", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[ILclient!dy;Z)V")
	@Override
	public void method2503(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) Class237 arg13, @OriginalArg(14) boolean arg14) {
		@Pc(2) int local2 = arg9.length;
		@Pc(7) int[] local7 = new int[local2 * 3];
		@Pc(12) int[] local12 = new int[local2 * 3];
		@Pc(17) int[] local17 = new int[local2 * 3];
		@Pc(22) int[] local22 = new int[local2 * 3];
		@Pc(27) int[] local27 = new int[local2 * 3];
		@Pc(32) int[] local32 = new int[local2 * 3];
		@Pc(41) int[] local41 = arg3 == null ? null : new int[local2 * 3];
		@Pc(50) int[] local50 = arg5 == null ? null : new int[local2 * 3];
		@Pc(52) int local52 = 0;
		for (@Pc(54) int local54 = 0; local54 < local2; local54++) {
			@Pc(61) int local61 = arg6[local54];
			@Pc(65) int local65 = arg7[local54];
			@Pc(69) int local69 = arg8[local54];
			local7[local52] = arg2[local61];
			local12[local52] = arg4[local61];
			local17[local52] = arg9[local54];
			local27[local52] = arg11[local54];
			local32[local52] = arg12[local54];
			local22[local52] = arg10 == null ? arg9[local54] : arg10[local54];
			if (arg3 != null) {
				local41[local52] = arg3[local61];
			}
			if (arg5 != null) {
				local50[local52] = arg5[local61];
			}
			local52++;
			local7[local52] = arg2[local65];
			local12[local52] = arg4[local65];
			local17[local52] = arg9[local54];
			local27[local52] = arg11[local54];
			local32[local52] = arg12[local54];
			local22[local52] = arg10 == null ? arg9[local54] : arg10[local54];
			if (arg3 != null) {
				local41[local52] = arg3[local65];
			}
			if (arg5 != null) {
				local50[local52] = arg5[local65];
			}
			local52++;
			local7[local52] = arg2[local69];
			local12[local52] = arg4[local69];
			local17[local52] = arg9[local54];
			local27[local52] = arg11[local54];
			local32[local52] = arg12[local54];
			local22[local52] = arg10 == null ? arg9[local54] : arg10[local54];
			if (arg3 != null) {
				local41[local52] = arg3[local69];
			}
			if (arg5 != null) {
				local50[local52] = arg5[local69];
			}
			local52++;
		}
		this.method2510(arg0, arg1, local7, local41, local12, local50, local17, local22, local27, local32, arg13, arg14);
	}

	@OriginalMember(owner = "client!aem", name = "b", descriptor = "()V")
	@Override
	public void method2493() {
		if (this.anInt423 <= 0) {
			this.aClass397_1 = null;
			this.method2517();
			return;
		}
		@Pc(22) byte[][] local22 = new byte[this.anInt414 * -1667858293 + 1][this.anInt413 * -143202029 + 1];
		@Pc(24) int local24;
		@Pc(32) int local32;
		for (local24 = 1; local24 < this.anInt414 * -1667858293; local24++) {
			for (local32 = 1; local32 < this.anInt413 * -143202029; local32++) {
				local22[local24][local32] = (byte) ((this.aByteArrayArray9[local24 - 1][local32] >> 2) + (this.aByteArrayArray9[local24 + 1][local32] >> 3) + (this.aByteArrayArray9[local24][local32 - 1] >> 2) + (this.aByteArrayArray9[local24][local32 + 1] >> 3) + (this.aByteArrayArray9[local24][local32] >> 1));
			}
		}
		this.aClass93Array4 = new Class93[this.aClass16_5.method218(-430468511)];
		this.aClass16_5.method217(this.aClass93Array4, (byte) 0);
		for (local24 = 0; local24 < this.aClass93Array4.length; local24++) {
			((Class93_Sub18) this.aClass93Array4[local24]).method13590(this.anInt423);
		}
		this.anInt427 = 20;
		if (this.anIntArrayArrayArray10 != null) {
			this.anInt427 += 4;
		}
		if ((this.anInt419 & 0x7) != 0) {
			this.anInt427 += 12;
		}
		this.aByteBuffer1 = this.aClass104_Sub2_2.method21092(this.anInt423 * 4);
		this.aByteBuffer2 = this.aClass104_Sub2_2.method21092(this.anInt423 * this.anInt427);
		@Pc(177) Class93_Sub18[] local177 = new Class93_Sub18[this.anInt423];
		local32 = Class278.method26458(this.anInt423 / 4, 423254006);
		if (local32 < 1) {
			local32 = 1;
		}
		@Pc(194) Class16 local194 = new Class16(local32);
		@Pc(198) Class93_Sub18[] local198 = new Class93_Sub18[this.anInt421];
		@Pc(200) int local200;
		@Pc(208) int local208;
		for (local200 = 0; local200 < this.anInt414 * -1667858293; local200++) {
			for (local208 = 0; local208 < this.anInt413 * -143202029; local208++) {
				this.method2518(local200, local208, local22, local198, local194, local177);
			}
		}
		@Pc(236) Class93_Sub18 local236;
		for (local200 = 0; local200 < this.anInt420; local200++) {
			local236 = local177[local200];
			if (local236 != null) {
				local236.method13592(local200);
			}
		}
		for (local200 = 0; local200 < this.anInt414 * -1667858293; local200++) {
			for (local208 = 0; local208 < this.anInt413 * -143202029; local208++) {
				@Pc(271) short[] local271 = this.aShortArrayArray3[local208 * this.anInt414 * -1667858293 + local200];
				if (local271 != null) {
					@Pc(275) int local275 = 0;
					@Pc(277) int local277 = 0;
					while (local277 < local271.length) {
						@Pc(288) int local288 = local271[local277++] & 0xFFFF;
						@Pc(295) int local295 = local271[local277++] & 0xFFFF;
						@Pc(302) int local302 = local271[local277++] & 0xFFFF;
						@Pc(306) Class93_Sub18 local306 = local177[local288];
						@Pc(310) Class93_Sub18 local310 = local177[local295];
						@Pc(314) Class93_Sub18 local314 = local177[local302];
						@Pc(316) Class93_Sub18 local316 = null;
						if (local306 != null) {
							local306.method13593(local200, local208, local275);
							local316 = local306;
						}
						if (local310 != null) {
							local310.method13593(local200, local208, local275);
							if (local316 == null || local310.aLong232 * -3750704643647536275L < local316.aLong232 * -3750704643647536275L) {
								local316 = local310;
							}
						}
						if (local314 != null) {
							local314.method13593(local200, local208, local275);
							if (local316 == null || local314.aLong232 * -3750704643647536275L < local316.aLong232 * -3750704643647536275L) {
								local316 = local314;
							}
						}
						if (local316 != null) {
							if (local306 != null) {
								local316.method13592(local288);
							}
							if (local310 != null) {
								local316.method13592(local295);
							}
							if (local314 != null) {
								local316.method13592(local302);
							}
							local316.method13593(local200, local208, local275);
						}
						local275++;
					}
				}
			}
		}
		this.anInt426 = 0;
		for (local200 = 0; local200 < this.aClass93Array4.length; local200++) {
			local236 = (Class93_Sub18) this.aClass93Array4[local200];
			if (local236.anInt1539 > 0) {
				this.aClass93Array4[this.anInt426++] = local236;
			}
		}
		this.aClass93Array3 = new Class93[this.anInt426];
		@Pc(436) long[] local436 = new long[this.anInt426];
		for (local208 = 0; local208 < this.anInt426; local208++) {
			@Pc(448) Class93_Sub18 local448 = (Class93_Sub18) this.aClass93Array4[local208];
			local436[local208] = local448.aLong232 * -3750704643647536275L;
			this.aClass93Array3[local208] = local448;
		}
		Class659.method32994(local436, this.aClass93Array3, -1045554615);
		this.method2516();
	}

	@OriginalMember(owner = "client!aem", name = "ai", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method2504(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean[][] arg7) {
		if (this.anInt423 <= 0) {
			return;
		}
		@Pc(9) Interface40 local9 = this.aClass104_Sub2_2.method20928(this.anInt424);
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 32767;
		@Pc(15) int local15 = -32768;
		@Pc(19) ByteBuffer local19 = this.aClass104_Sub2_2.aByteBuffer7;
		local19.clear();
		for (@Pc(24) int local24 = arg4; local24 < arg6; local24++) {
			@Pc(36) int local36 = local24 * this.anInt414 * -1667858293 + arg3;
			for (@Pc(38) int local38 = arg3; local38 < arg5; local38++) {
				if (arg7[local38 - arg3][local24 - arg4]) {
					@Pc(56) short[] local56 = this.aShortArrayArray3[local36];
					if (local56 != null) {
						for (@Pc(60) int local60 = 0; local60 < local56.length; local60++) {
							@Pc(70) int local70 = local56[local60] & 0xFFFF;
							if (local70 > local15) {
								local15 = local70;
							}
							if (local70 < local13) {
								local13 = local70;
							}
							local19.putShort((short) local70);
							local11++;
						}
					}
				}
				local36++;
			}
		}
		local9.method29514(0, local19.position(), this.aClass104_Sub2_2.aLong132);
		if (local11 <= 0) {
			return;
		}
		this.aClass104_Sub2_2.method20962();
		@Pc(111) Class131 local111 = this.aClass104_Sub2_2.aClass131_3;
		this.aClass104_Sub2_2.method21060(0, this.anInterface37_1);
		this.aClass104_Sub2_2.method21060(1, this.anInterface37_2);
		this.aClass104_Sub2_2.method21118(this.aClass145_1);
		this.aClass104_Sub2_2.method21042(local9);
		this.aClass104_Sub2_2.method20528(Class470.aClass470_54);
		@Pc(143) float local143 = (float) this.aClass104_Sub2_2.method20446((byte) -93).method23748();
		@Pc(150) float local150 = (float) this.aClass104_Sub2_2.method20446((byte) -35).method23749();
		@Pc(154) Class470 local154 = new Class470();
		@Pc(158) Class470 local158 = new Class470();
		local154.method29551(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F);
		local158.method29601((float) arg2 / ((float) (this.anInt412 * -1678286317) * 256.0F), (float) -arg2 / ((float) (this.anInt412 * -1678286317) * 256.0F), 1.0F / (this.aFloat24 - this.aFloat23));
		local158.method29568((float) arg0 - (float) (arg3 * arg2) / 256.0F, (float) arg1 + (float) (arg6 * arg2) / 256.0F, -this.aFloat23 / (this.aFloat24 - this.aFloat23));
		local158.method29565(2.0F / local143, 2.0F / local150, 1.0F);
		local158.method29568(-1.0F, -1.0F, 0.0F);
		this.aClass104_Sub2_2.aClass470_36.method29570(local154, local158);
		this.aClass104_Sub2_2.aClass489_78.method30023(this.aClass104_Sub2_2.aClass470_36);
		this.aClass104_Sub2_2.method20531(this.aClass104_Sub2_2.aClass489_78);
		local111.method10101(Class489.aClass489_99);
		local111.aClass460_9.method29375(0.0F, 0.0F, 0.0F, 0.0F);
		local111.aClass472_41.method29718(0.0F, 0.0F, 0.0F);
		local111.aClass460_8.method29375(0.0F, 0.0F, 0.0F, 0.0F);
		local111.aClass472_40.method29718(0.0F, 0.0F, 0.0F);
		local111.anInterface38_18 = this.aClass104_Sub2_2.anInterface38_23;
		local111.aClass489_46.method30017();
		local111.anInt1140 = local13;
		local111.anInt1141 = local15 - local13 + 1;
		local111.anInt1138 = 0;
		local111.anInt1137 = local11 / 3;
		if (this.aClass104_Sub2_2.aBoolean464) {
			this.aClass104_Sub2_2.method20530(false);
			local111.method10102(false);
			this.aClass104_Sub2_2.method20530(true);
		} else {
			local111.method10102(false);
		}
	}

	@OriginalMember(owner = "client!aem", name = "aw", descriptor = "(Lclient!ara;IIIIZ)Z")
	@Override
	public boolean method2477(@OriginalArg(0) Class93_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass397_1 == null || arg0 == null) {
			return false;
		} else {
			@Pc(20) int local20 = arg1 - (arg2 * this.aClass104_Sub2_2.anInt2937 >> 8) >> this.aClass104_Sub2_2.anInt2936;
			@Pc(34) int local34 = arg3 - (arg2 * this.aClass104_Sub2_2.anInt2938 >> 8) >> this.aClass104_Sub2_2.anInt2936;
			return this.aClass397_1.method28648(arg0, local20, local34);
		}
	}

	@OriginalMember(owner = "client!aem", name = "at", descriptor = "(Lclient!ara;IIIIZ)V")
	@Override
	public void method2507(@OriginalArg(0) Class93_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (this.aClass397_1 != null && arg0 != null) {
			@Pc(19) int local19 = arg1 - (arg2 * this.aClass104_Sub2_2.anInt2937 >> 8) >> this.aClass104_Sub2_2.anInt2936;
			@Pc(33) int local33 = arg3 - (arg2 * this.aClass104_Sub2_2.anInt2938 >> 8) >> this.aClass104_Sub2_2.anInt2936;
			this.aClass397_1.method28659(arg0, local19, local33);
		}
	}

	@OriginalMember(owner = "client!aem", name = "an", descriptor = "(Lclient!ati;II)V")
	void method2522(@OriginalArg(0) Class93_Sub1_Sub4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) int[] local6 = this.anIntArrayArrayArray11[arg1][arg2];
		@Pc(13) int[] local13 = this.anIntArrayArrayArray8[arg1][arg2];
		@Pc(16) int local16 = local6.length;
		if (this.anIntArray32.length < local16) {
			this.anIntArray32 = new int[local16];
			this.anIntArray33 = new int[local16];
		}
		@Pc(31) int local31;
		for (local31 = 0; local31 < local16; local31++) {
			this.anIntArray32[local31] = local6[local31] >> this.aClass104_Sub2_2.anInt2936;
			this.anIntArray33[local31] = local13[local31] >> this.aClass104_Sub2_2.anInt2936;
		}
		local31 = 0;
		while (local31 < local16) {
			@Pc(68) int local68 = this.anIntArray32[local31];
			@Pc(74) int local74 = this.anIntArray33[local31++];
			@Pc(79) int local79 = this.anIntArray32[local31];
			@Pc(85) int local85 = this.anIntArray33[local31++];
			@Pc(90) int local90 = this.anIntArray32[local31];
			@Pc(96) int local96 = this.anIntArray33[local31++];
			if ((local68 - local79) * (local85 - local96) - (local85 - local74) * (local90 - local79) > 0) {
				arg0.method23484(local74, local85, local96, local68, local79, local90);
			}
		}
	}

	@OriginalMember(owner = "client!aem", name = "y", descriptor = "(III)V")
	@Override
	public void method2486(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) int local9 = Math.min(this.aByteArrayArray9.length - 1, Math.max(0, arg0));
		@Pc(21) int local21 = Math.min(this.aByteArrayArray9[local9].length - 1, Math.max(0, arg1));
		if ((this.aByteArrayArray9[local9][local21] & 0xFF) < arg2) {
			this.aByteArrayArray9[local9][local21] = (byte) arg2;
		}
	}

	@OriginalMember(owner = "client!aem", name = "aa", descriptor = "()V")
	void method2523() {
		if ((this.anInt418 & 0x2) == 0) {
			this.anIntArrayArrayArray8 = null;
			this.anIntArrayArrayArray11 = null;
			this.anIntArrayArrayArray12 = null;
		}
		this.anIntArrayArrayArray10 = null;
		this.anIntArrayArrayArray7 = null;
		this.anIntArrayArrayArray9 = null;
		this.aClass93_Sub18ArrayArrayArray1 = null;
		this.aByteArrayArray9 = null;
		this.aClass16_5 = null;
		this.aClass93Array4 = null;
		this.aFloatArrayArray5 = null;
		this.aFloatArrayArray6 = null;
		this.aFloatArrayArray4 = null;
	}

	@OriginalMember(owner = "client!aem", name = "af", descriptor = "()V")
	void method2524() {
		if ((this.anInt418 & 0x2) == 0) {
			this.anIntArrayArrayArray8 = null;
			this.anIntArrayArrayArray11 = null;
			this.anIntArrayArrayArray12 = null;
		}
		this.anIntArrayArrayArray10 = null;
		this.anIntArrayArrayArray7 = null;
		this.anIntArrayArrayArray9 = null;
		this.aClass93_Sub18ArrayArrayArray1 = null;
		this.aByteArrayArray9 = null;
		this.aClass16_5 = null;
		this.aClass93Array4 = null;
		this.aFloatArrayArray5 = null;
		this.aFloatArrayArray6 = null;
		this.aFloatArrayArray4 = null;
	}

	@OriginalMember(owner = "client!aem", name = "ak", descriptor = "()V")
	void method2525() {
		if ((this.anInt418 & 0x2) == 0) {
			this.anIntArrayArrayArray8 = null;
			this.anIntArrayArrayArray11 = null;
			this.anIntArrayArrayArray12 = null;
		}
		this.anIntArrayArrayArray10 = null;
		this.anIntArrayArrayArray7 = null;
		this.anIntArrayArrayArray9 = null;
		this.aClass93_Sub18ArrayArrayArray1 = null;
		this.aByteArrayArray9 = null;
		this.aClass16_5 = null;
		this.aClass93Array4 = null;
		this.aFloatArrayArray5 = null;
		this.aFloatArrayArray6 = null;
		this.aFloatArrayArray4 = null;
	}

	@OriginalMember(owner = "client!aem", name = "ah", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[ILclient!dy;Z)V")
	@Override
	public void method2476(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) Class237 arg13, @OriginalArg(14) boolean arg14) {
		@Pc(2) int local2 = arg9.length;
		@Pc(7) int[] local7 = new int[local2 * 3];
		@Pc(12) int[] local12 = new int[local2 * 3];
		@Pc(17) int[] local17 = new int[local2 * 3];
		@Pc(22) int[] local22 = new int[local2 * 3];
		@Pc(27) int[] local27 = new int[local2 * 3];
		@Pc(32) int[] local32 = new int[local2 * 3];
		@Pc(41) int[] local41 = arg3 == null ? null : new int[local2 * 3];
		@Pc(50) int[] local50 = arg5 == null ? null : new int[local2 * 3];
		@Pc(52) int local52 = 0;
		for (@Pc(54) int local54 = 0; local54 < local2; local54++) {
			@Pc(61) int local61 = arg6[local54];
			@Pc(65) int local65 = arg7[local54];
			@Pc(69) int local69 = arg8[local54];
			local7[local52] = arg2[local61];
			local12[local52] = arg4[local61];
			local17[local52] = arg9[local54];
			local27[local52] = arg11[local54];
			local32[local52] = arg12[local54];
			local22[local52] = arg10 == null ? arg9[local54] : arg10[local54];
			if (arg3 != null) {
				local41[local52] = arg3[local61];
			}
			if (arg5 != null) {
				local50[local52] = arg5[local61];
			}
			local52++;
			local7[local52] = arg2[local65];
			local12[local52] = arg4[local65];
			local17[local52] = arg9[local54];
			local27[local52] = arg11[local54];
			local32[local52] = arg12[local54];
			local22[local52] = arg10 == null ? arg9[local54] : arg10[local54];
			if (arg3 != null) {
				local41[local52] = arg3[local65];
			}
			if (arg5 != null) {
				local50[local52] = arg5[local65];
			}
			local52++;
			local7[local52] = arg2[local69];
			local12[local52] = arg4[local69];
			local17[local52] = arg9[local54];
			local27[local52] = arg11[local54];
			local32[local52] = arg12[local54];
			local22[local52] = arg10 == null ? arg9[local54] : arg10[local54];
			if (arg3 != null) {
				local41[local52] = arg3[local69];
			}
			if (arg5 != null) {
				local50[local52] = arg5[local69];
			}
			local52++;
		}
		this.method2510(arg0, arg1, local7, local41, local12, local50, local17, local22, local27, local32, arg13, arg14);
	}

	@OriginalMember(owner = "client!aem", name = "bf", descriptor = "(Lclient!ati;II)V")
	void method2526(@OriginalArg(0) Class93_Sub1_Sub4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) int[] local6 = this.anIntArrayArrayArray11[arg1][arg2];
		@Pc(13) int[] local13 = this.anIntArrayArrayArray8[arg1][arg2];
		@Pc(16) int local16 = local6.length;
		if (this.anIntArray32.length < local16) {
			this.anIntArray32 = new int[local16];
			this.anIntArray33 = new int[local16];
		}
		@Pc(31) int local31;
		for (local31 = 0; local31 < local16; local31++) {
			this.anIntArray32[local31] = local6[local31] >> this.aClass104_Sub2_2.anInt2936;
			this.anIntArray33[local31] = local13[local31] >> this.aClass104_Sub2_2.anInt2936;
		}
		local31 = 0;
		while (local31 < local16) {
			@Pc(68) int local68 = this.anIntArray32[local31];
			@Pc(74) int local74 = this.anIntArray33[local31++];
			@Pc(79) int local79 = this.anIntArray32[local31];
			@Pc(85) int local85 = this.anIntArray33[local31++];
			@Pc(90) int local90 = this.anIntArray32[local31];
			@Pc(96) int local96 = this.anIntArray33[local31++];
			if ((local68 - local79) * (local85 - local96) - (local85 - local74) * (local90 - local79) > 0) {
				arg0.method23484(local74, local85, local96, local68, local79, local90);
			}
		}
	}
}
