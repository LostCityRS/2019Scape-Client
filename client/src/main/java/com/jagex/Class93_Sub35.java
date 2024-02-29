package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!akz")
public abstract class Class93_Sub35 extends Class93 {

	@OriginalMember(owner = "client!akz", name = "<init>", descriptor = "()V", line = 6)
	Class93_Sub35() {
	}

	@OriginalMember(owner = "client!akz", name = "f", descriptor = "(Lclient!ase;IS)V", line = 210)
	static void method19706(@OriginalArg(0) Class93_Sub41_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) short arg2) {
		@Pc(3) Class611 local3 = client.aClass532_1.method30455(2075446028);
		@Pc(13) boolean local13 = arg0.method22686(1, -2036436358) == 1;
		if (local13) {
			Class174.anIntArray279[(Class174.anInt3292 += 981825405) * 2140666325 - 1] = arg1;
		}
		@Pc(32) int local32 = arg0.method22686(2, -1678222890);
		@Pc(36) Class132_Sub1_Sub1_Sub1_Sub2 local36 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[arg1];
		if (local32 != 0) {
			@Pc(162) int local162;
			@Pc(167) int local167;
			@Pc(172) int local172;
			@Pc(177) int local177;
			@Pc(190) int local190;
			if (local32 == 1) {
				local162 = arg0.method22686(3, -504190790);
				local167 = arg0.method22686(1, 2069073106);
				local172 = local36.anIntArray240[0];
				local177 = local36.anIntArray239[0];
				if (local167 == 1) {
					Class174.aByteArray64[arg1] = Class707.aClass707_3.aByte176;
					local190 = arg0.method22686(2, 1489263378);
					switch(local190) {
						case 0:
							local36.method20074(local172, local177 + 1, Class174.aByteArray64[arg1], (byte) 122);
							break;
						case 1:
							local36.method20074(local172 - 1, local177, Class174.aByteArray64[arg1], (byte) 105);
							break;
						case 2:
							local36.method20074(local172 + 1, local177, Class174.aByteArray64[arg1], (byte) 30);
							break;
						case 3:
							local36.method20074(local172, local177 - 1, Class174.aByteArray64[arg1], (byte) 33);
					}
				}
				if (local162 == 0) {
					local172--;
					local177--;
				} else if (local162 == 1) {
					local177--;
				} else if (local162 == 2) {
					local172++;
					local177--;
				} else if (local162 == 3) {
					local172--;
				} else if (local162 == 4) {
					local172++;
				} else if (local162 == 5) {
					local172--;
					local177++;
				} else if (local162 == 6) {
					local177++;
				} else if (local162 == 7) {
					local172++;
					local177++;
				}
				local36.method20074(local172, local177, Class174.aByteArray64[arg1], (byte) 38);
			} else if (local32 == 2) {
				local162 = arg0.method22686(4, 293283928);
				local167 = local36.anIntArray240[0];
				local172 = local36.anIntArray239[0];
				if (local162 == 0) {
					local167 -= 2;
					local172 -= 2;
				} else if (local162 == 1) {
					local167--;
					local172 -= 2;
				} else if (local162 == 2) {
					local172 -= 2;
				} else if (local162 == 3) {
					local167++;
					local172 -= 2;
				} else if (local162 == 4) {
					local167 += 2;
					local172 -= 2;
				} else if (local162 == 5) {
					local167 -= 2;
					local172--;
				} else if (local162 == 6) {
					local167 += 2;
					local172--;
				} else if (local162 == 7) {
					local167 -= 2;
				} else if (local162 == 8) {
					local167 += 2;
				} else if (local162 == 9) {
					local167 -= 2;
					local172++;
				} else if (local162 == 10) {
					local167 += 2;
					local172++;
				} else if (local162 == 11) {
					local167 -= 2;
					local172 += 2;
				} else if (local162 == 12) {
					local167--;
					local172 += 2;
				} else if (local162 == 13) {
					local172 += 2;
				} else if (local162 == 14) {
					local167++;
					local172 += 2;
				} else if (local162 == 15) {
					local167 += 2;
					local172 += 2;
				}
				local36.method20074(local167, local172, Class174.aByteArray64[arg1], (byte) 59);
			} else {
				local162 = arg0.method22686(1, -348987267);
				@Pc(442) int local442;
				@Pc(453) int local453;
				@Pc(460) int local460;
				if (local162 == 0) {
					local167 = arg0.method22686(15, -900827812);
					local172 = local167 >> 12 & 0x7;
					local177 = (byte) (local167 >> 10) & 0x3;
					local190 = local167 >> 5 & 0x1F;
					if (local190 > 15) {
						local190 -= 32;
					}
					local442 = local167 & 0x1F;
					if (local442 > 15) {
						local442 -= 32;
					}
					local453 = local190 + local36.anIntArray240[0];
					local460 = local442 + local36.anIntArray239[0];
					if (local172 == Class707.aClass707_4.anInt5958 * -793472015) {
						local36.method20076(local453, local460, (byte) 1);
					} else {
						Class174.aByteArray64[arg1] = (byte) (local172 - 1);
						local36.method20074(local453, local460, Class174.aByteArray64[arg1], (byte) 120);
					}
					local36.aByte100 = local36.aByte99 = (byte) (local36.aByte100 + local177 & 0x3);
					if (client.aClass532_1.method30487(1695451641).method30330(local453, local460, -662808309)) {
						local36.aByte99++;
					}
					if (client.anInt3513 * -859840571 == arg1 && Class512.anInt5209 * 1177442423 != local36.aByte100) {
						Class512.anInt5209 = local36.aByte100 * -69533369;
					}
				} else {
					local167 = arg0.method22686(3, 1150118268);
					local172 = arg0.method22686(30, 1014192385);
					local177 = local172 >> 28 & 0x3;
					local190 = local172 >> 14 & 0x3FFF;
					local442 = local172 & 0x3FFF;
					local453 = (local36.anIntArray240[0] + local3.anInt5623 * 270611681 + local190 & 0x3FFF) - local3.anInt5623 * 270611681;
					local460 = (local442 + local3.anInt5624 * -1994307635 + local36.anIntArray239[0] & 0x3FFF) - local3.anInt5624 * -1994307635;
					if (local167 == Class707.aClass707_4.anInt5958 * -793472015) {
						local36.method20076(local453, local460, (byte) 1);
					} else {
						Class174.aByteArray64[arg1] = (byte) (local167 - 1);
						local36.method20074(local453, local460, Class174.aByteArray64[arg1], (byte) 109);
					}
					local36.aByte100 = local36.aByte99 = (byte) (local177 + local36.aByte100 & 0x3);
					if (client.aClass532_1.method30487(1137438638).method30330(local453, local460, -662808309)) {
						local36.aByte99++;
					}
					if (client.anInt3513 * -859840571 == arg1) {
						Class512.anInt5209 = local36.aByte100 * -69533369;
					}
				}
			}
		} else if (!local13) {
			if (client.anInt3513 * -859840571 == arg1) {
				throw new RuntimeException();
			}
			@Pc(59) Class200 local59 = Class174.aClass200Array1[arg1] = new Class200();
			Class707.method36744(1576935057);
			local59.anInt3377 = ((local3.anInt5623 * 270611681 + local36.anIntArray240[0] >> 6 << 14) + (local36.aByte100 << 28) + (local36.anIntArray239[0] + -1994307635 * local3.anInt5624 >> 6)) * -1383292861;
			if (local36.anInt2799 * 1643784853 == -1) {
				local59.anInt3376 = local36.aClass523_7.method30365(-210358709) * -373179301;
			} else {
				local59.anInt3376 = local36.anInt2799 * 1116180215;
			}
			local59.anInt3375 = local36.anInt2772 * 1830096795;
			local59.aClass286_2 = local36.aClass286_1;
			local59.aBoolean578 = local36.aBoolean455;
			if (local36.anInt2807 * -1513940767 > 0) {
				Class378.method28071(local36, -1314427900);
			}
			client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[arg1] = null;
			if (arg0.method22686(1, 1402643434) != 0) {
				Class18.method272(arg0, arg1, 1694438313);
			}
		}
	}

	@OriginalMember(owner = "client!akz", name = "adz", descriptor = "(Lclient!yf;I)V", line = 10111)
	static final void method19707(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = arg0.aClass93_Sub28_4.aClass373Array1[local12].aByte150;
	}
}
