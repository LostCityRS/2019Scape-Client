package jagex3;

import java.util.HashMap;
import java.util.Map;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!akf")
public final class Class93_Sub16 extends Class93 {

	@OriginalMember(owner = "client!akf", name = "x", descriptor = "I")
	int anInt1528;

	@OriginalMember(owner = "client!akf", name = "q", descriptor = "J")
	long aLong73;

	@OriginalMember(owner = "client!akf", name = "d", descriptor = "I")
	int anInt1532;

	@OriginalMember(owner = "client!akf", name = "c", descriptor = "J")
	long aLong74;

	@OriginalMember(owner = "client!akf", name = "y", descriptor = "I")
	int anInt1534;

	@OriginalMember(owner = "client!akf", name = "r", descriptor = "I")
	int anInt1536;

	@OriginalMember(owner = "client!akf", name = "k", descriptor = "Lclient!ox;")
	public Class472 aClass472_47 = new Class472();

	@OriginalMember(owner = "client!akf", name = "f", descriptor = "I")
	int anInt1529;

	@OriginalMember(owner = "client!akf", name = "w", descriptor = "I")
	int anInt1530;

	@OriginalMember(owner = "client!akf", name = "p", descriptor = "I")
	int anInt1531;

	@OriginalMember(owner = "client!akf", name = "z", descriptor = "I")
	int anInt1535;

	@OriginalMember(owner = "client!akf", name = "u", descriptor = "I")
	int anInt1533;

	@OriginalMember(owner = "client!akf", name = "l", descriptor = "F")
	float aFloat144;

	@OriginalMember(owner = "client!akf", name = "s", descriptor = "F")
	float aFloat146;

	@OriginalMember(owner = "client!akf", name = "o", descriptor = "F")
	float aFloat145;

	@OriginalMember(owner = "client!akf", name = "v", descriptor = "F")
	float aFloat147;

	@OriginalMember(owner = "client!akf", name = "e", descriptor = "(Ljava/lang/Class;IB)Lclient!za;")
	public static Interface75 method13572(@OriginalArg(0) Class arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		@Pc(2) Map local2 = Class711.aMap27;
		synchronized (Class711.aMap27) {
			@Pc(8) Map local8 = (Map) Class711.aMap27.get(arg0);
			if (local8 == null) {
				local8 = new HashMap();
				@Pc(19) Interface75[] local19 = (Interface75[]) arg0.getEnumConstants();
				for (@Pc(21) int local21 = 0; local21 < local19.length; local21++) {
					@Pc(29) Interface75 local29 = local19[local21];
					local8.put(local29.method37101(), local29);
				}
				Class711.aMap27.put(arg0, local8);
			}
			return (Interface75) local8.get(arg1);
		}
	}

	@OriginalMember(owner = "client!akf", name = "m", descriptor = "(I)V")
	static void method13573(@OriginalArg(0) int arg0) {
		if (Class114.aClass104_8 != null) {
			Class114.aClass104_8.method20889(-1071210768);
			Class114.aClass104_8 = null;
			Class114.aClass106_2 = null;
		}
	}

	@OriginalMember(owner = "client!akf", name = "<init>", descriptor = "(IIIIIF)V")
	Class93_Sub16(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.aClass472_47.method29718((float) arg0, (float) arg1, (float) arg2);
		this.anInt1529 = arg3 * 1739377559;
		this.anInt1530 = arg4 * 1815567643;
		this.anInt1531 = this.anInt1530 * -221082403;
		this.anInt1535 = this.anInt1530 * -917091335;
		this.anInt1533 = this.anInt1530 * 1391030175;
		this.aFloat144 = arg5;
		this.aFloat146 = 1.0F;
		this.aFloat145 = 1.0F;
		this.aFloat147 = 1.0F;
	}

	@OriginalMember(owner = "client!akf", name = "ac", descriptor = "()I")
	public int method13519() {
		return this.anInt1531 * 589853359;
	}

	@OriginalMember(owner = "client!akf", name = "e", descriptor = "(I)I")
	public int method13520(@OriginalArg(0) int arg0) {
		return (int) this.aClass472_47.aFloat325;
	}

	@OriginalMember(owner = "client!akf", name = "n", descriptor = "(I)I")
	public int method13521(@OriginalArg(0) int arg0) {
		return (int) this.aClass472_47.aFloat326;
	}

	@OriginalMember(owner = "client!akf", name = "m", descriptor = "(I)I")
	public int method13522(@OriginalArg(0) int arg0) {
		return (int) this.aClass472_47.aFloat327;
	}

	@OriginalMember(owner = "client!akf", name = "k", descriptor = "(B)I")
	public int method13523(@OriginalArg(0) byte arg0) {
		return this.anInt1529 * 1892312103;
	}

	@OriginalMember(owner = "client!akf", name = "bk", descriptor = "(FI)V")
	public void method13524(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1) {
		this.aFloat147 = arg0;
		this.aFloat145 = this.aFloat146;
		this.anInt1528 = arg1 * -343744271;
		if (this.aFloat147 < 0.0F) {
			this.aFloat147 = 1.0F;
		}
		this.anInt1534 = arg1 * -1061885795;
		this.aLong73 = Class305.method26889(84671911) * -2834922336505842927L;
	}

	@OriginalMember(owner = "client!akf", name = "w", descriptor = "(I)F")
	public float method13525(@OriginalArg(0) int arg0) {
		return this.aFloat144;
	}

	@OriginalMember(owner = "client!akf", name = "i", descriptor = "()I")
	public int method13526() {
		return (int) this.aClass472_47.aFloat326;
	}

	@OriginalMember(owner = "client!akf", name = "u", descriptor = "(FB)V")
	public void method13527(@OriginalArg(0) float arg0, @OriginalArg(1) byte arg1) {
		this.aFloat144 = arg0;
	}

	@OriginalMember(owner = "client!akf", name = "j", descriptor = "()I")
	public int method13528() {
		return (int) this.aClass472_47.aFloat327;
	}

	@OriginalMember(owner = "client!akf", name = "am", descriptor = "(F)V")
	public void method13529(@OriginalArg(0) float arg0) {
		this.aFloat144 = arg0;
	}

	@OriginalMember(owner = "client!akf", name = "d", descriptor = "(I)I")
	public int method13530(@OriginalArg(0) int arg0) {
		return this.anInt1532 * 1570863755;
	}

	@OriginalMember(owner = "client!akf", name = "t", descriptor = "()I")
	public int method13531() {
		return (int) this.aClass472_47.aFloat327;
	}

	@OriginalMember(owner = "client!akf", name = "r", descriptor = "(I)I")
	public int method13532(@OriginalArg(0) int arg0) {
		return this.anInt1534 * 1239997877;
	}

	@OriginalMember(owner = "client!akf", name = "v", descriptor = "(II)V")
	public void method13533(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1531 = arg0 * -1730403249;
	}

	@OriginalMember(owner = "client!akf", name = "g", descriptor = "()I")
	public int method13534() {
		return (int) this.aClass472_47.aFloat326;
	}

	@OriginalMember(owner = "client!akf", name = "x", descriptor = "(III)V")
	public void method13535(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1533 = arg0 * -1688958779;
		this.anInt1535 = this.anInt1531 * 1535511501;
		this.anInt1536 = arg1 * -79484065;
		if (this.anInt1533 * 858109453 == -1) {
			this.anInt1533 = this.anInt1530 * 1391030175;
		}
		this.anInt1532 = arg1 * -1443914461;
		this.aLong74 = Class305.method26889(-299710577) * 3795665274651405733L;
	}

	@OriginalMember(owner = "client!akf", name = "h", descriptor = "(FIB)V")
	public void method13536(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		this.aFloat147 = arg0;
		this.aFloat145 = this.aFloat146;
		this.anInt1528 = arg1 * -343744271;
		if (this.aFloat147 < 0.0F) {
			this.aFloat147 = 1.0F;
		}
		this.anInt1534 = arg1 * -1061885795;
		this.aLong73 = Class305.method26889(1910097402) * -2834922336505842927L;
	}

	@OriginalMember(owner = "client!akf", name = "a", descriptor = "(I)V")
	public void method13537(@OriginalArg(0) int arg0) {
		@Pc(11) long local11;
		@Pc(18) long local18;
		if (this.anInt1531 * 589853359 != this.anInt1533 * 858109453) {
			local11 = Class305.method26889(1896359579);
			local18 = local11 - this.aLong74 * -2452759870572383699L;
			this.anInt1532 = (int) ((long) this.anInt1532 - local18 * -1443914461L);
			if (this.anInt1532 * 1570863755 > 0) {
				this.anInt1531 = Class125_Sub2_Sub1.method21481(this.anInt1535 * -410282901, this.anInt1533 * 858109453, (float) (this.anInt1536 * 2059530399 - this.anInt1532 * 1570863755) / (float) (this.anInt1536 * 2059530399) * 255.0F, 1306653889) * -1730403249;
			} else {
				this.anInt1531 = this.anInt1533 * 1097400835;
			}
			this.aLong74 = local11 * 3795665274651405733L;
		}
		if (this.aFloat146 == this.aFloat147) {
			return;
		}
		local11 = Class305.method26889(2143273690);
		local18 = local11 - this.aLong73 * 3335590366832729585L;
		this.anInt1534 = (int) ((long) this.anInt1534 - local18 * -1061885795L);
		if (this.anInt1534 * 1239997877 > 0) {
			this.aFloat146 = (float) (this.anInt1528 * 306188305 - this.anInt1534 * 1239997877) / (float) (this.anInt1528 * 306188305) * (this.aFloat147 - this.aFloat145) + this.aFloat145;
		} else {
			this.aFloat146 = this.aFloat147;
		}
		this.aLong73 = local11 * -2834922336505842927L;
	}

	@OriginalMember(owner = "client!akf", name = "ax", descriptor = "()I")
	public int method13538() {
		return this.anInt1532 * 1570863755;
	}

	@OriginalMember(owner = "client!akf", name = "f", descriptor = "(B)I")
	public int method13539(@OriginalArg(0) byte arg0) {
		return this.anInt1531 * 589853359;
	}

	@OriginalMember(owner = "client!akf", name = "bl", descriptor = "(FI)V")
	public void method13540(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1) {
		this.aFloat147 = arg0;
		this.aFloat145 = this.aFloat146;
		this.anInt1528 = arg1 * -343744271;
		if (this.aFloat147 < 0.0F) {
			this.aFloat147 = 1.0F;
		}
		this.anInt1534 = arg1 * -1061885795;
		this.aLong73 = Class305.method26889(1716503372) * -2834922336505842927L;
	}

	@OriginalMember(owner = "client!akf", name = "ae", descriptor = "()I")
	public int method13541() {
		return this.anInt1529 * 1892312103;
	}

	@OriginalMember(owner = "client!akf", name = "ag", descriptor = "()I")
	public int method13542() {
		return this.anInt1529 * 1892312103;
	}

	@OriginalMember(owner = "client!akf", name = "z", descriptor = "(IIII)V")
	public void method13543(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass472_47.method29718((float) arg0, (float) arg1, (float) arg2);
	}

	@OriginalMember(owner = "client!akf", name = "c", descriptor = "(I)F")
	public float method13544(@OriginalArg(0) int arg0) {
		return this.aFloat147;
	}

	@OriginalMember(owner = "client!akf", name = "au", descriptor = "(F)V")
	public void method13545(@OriginalArg(0) float arg0) {
		this.aFloat144 = arg0;
	}

	@OriginalMember(owner = "client!akf", name = "ai", descriptor = "()F")
	public float method13546() {
		return this.aFloat144;
	}

	@OriginalMember(owner = "client!akf", name = "ay", descriptor = "(I)V")
	public void method13547(@OriginalArg(0) int arg0) {
		this.anInt1531 = arg0 * -1730403249;
	}

	@OriginalMember(owner = "client!akf", name = "as", descriptor = "()F")
	public float method13548() {
		return this.aFloat144;
	}

	@OriginalMember(owner = "client!akf", name = "at", descriptor = "()F")
	public float method13549() {
		return this.aFloat146;
	}

	@OriginalMember(owner = "client!akf", name = "ad", descriptor = "(F)V")
	public void method13550(@OriginalArg(0) float arg0) {
		this.aFloat144 = arg0;
	}

	@OriginalMember(owner = "client!akf", name = "y", descriptor = "(FS)V")
	public void method13551(@OriginalArg(0) float arg0, @OriginalArg(1) short arg1) {
		this.aFloat146 = arg0;
	}

	@OriginalMember(owner = "client!akf", name = "bx", descriptor = "()V")
	public void method13552() {
		@Pc(11) long local11;
		@Pc(18) long local18;
		if (this.anInt1531 * 589853359 != this.anInt1533 * 858109453) {
			local11 = Class305.method26889(1969153874);
			local18 = local11 - this.aLong74 * -2452759870572383699L;
			this.anInt1532 = (int) ((long) this.anInt1532 - local18 * -1443914461L);
			if (this.anInt1532 * 1570863755 > 0) {
				this.anInt1531 = Class125_Sub2_Sub1.method21481(this.anInt1535 * -410282901, this.anInt1533 * 858109453, (float) (this.anInt1536 * 2059530399 - this.anInt1532 * 1570863755) / (float) (this.anInt1536 * 2059530399) * 255.0F, 2106143898) * -1730403249;
			} else {
				this.anInt1531 = this.anInt1533 * 1097400835;
			}
			this.aLong74 = local11 * 3795665274651405733L;
		}
		if (this.aFloat146 == this.aFloat147) {
			return;
		}
		local11 = Class305.method26889(1196618071);
		local18 = local11 - this.aLong73 * 3335590366832729585L;
		this.anInt1534 = (int) ((long) this.anInt1534 - local18 * -1061885795L);
		if (this.anInt1534 * 1239997877 > 0) {
			this.aFloat146 = (float) (this.anInt1528 * 306188305 - this.anInt1534 * 1239997877) / (float) (this.anInt1528 * 306188305) * (this.aFloat147 - this.aFloat145) + this.aFloat145;
		} else {
			this.aFloat146 = this.aFloat147;
		}
		this.aLong73 = local11 * -2834922336505842927L;
	}

	@OriginalMember(owner = "client!akf", name = "ar", descriptor = "(III)V")
	public void method13553(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass472_47.method29718((float) arg0, (float) arg1, (float) arg2);
	}

	@OriginalMember(owner = "client!akf", name = "ap", descriptor = "()I")
	public int method13554() {
		return this.anInt1533 * 858109453;
	}

	@OriginalMember(owner = "client!akf", name = "aq", descriptor = "()I")
	public int method13555() {
		return this.anInt1532 * 1570863755;
	}

	@OriginalMember(owner = "client!akf", name = "al", descriptor = "()I")
	public int method13556() {
		return this.anInt1531 * 589853359;
	}

	@OriginalMember(owner = "client!akf", name = "av", descriptor = "()F")
	public float method13557() {
		return this.aFloat147;
	}

	@OriginalMember(owner = "client!akf", name = "ao", descriptor = "()I")
	public int method13558() {
		return this.anInt1534 * 1239997877;
	}

	@OriginalMember(owner = "client!akf", name = "aj", descriptor = "(I)V")
	public void method13559(@OriginalArg(0) int arg0) {
		this.anInt1531 = arg0 * -1730403249;
	}

	@OriginalMember(owner = "client!akf", name = "ak", descriptor = "(F)V")
	public void method13560(@OriginalArg(0) float arg0) {
		this.aFloat146 = arg0;
	}

	@OriginalMember(owner = "client!akf", name = "ab", descriptor = "(I)V")
	public void method13561(@OriginalArg(0) int arg0) {
		this.anInt1531 = arg0 * -1730403249;
	}

	@OriginalMember(owner = "client!akf", name = "ah", descriptor = "()I")
	public int method13562() {
		return this.anInt1531 * 589853359;
	}

	@OriginalMember(owner = "client!akf", name = "aa", descriptor = "(F)V")
	public void method13563(@OriginalArg(0) float arg0) {
		this.aFloat146 = arg0;
	}

	@OriginalMember(owner = "client!akf", name = "af", descriptor = "(F)V")
	public void method13564(@OriginalArg(0) float arg0) {
		this.aFloat146 = arg0;
	}

	@OriginalMember(owner = "client!akf", name = "aw", descriptor = "()F")
	public float method13565() {
		return this.aFloat144;
	}

	@OriginalMember(owner = "client!akf", name = "an", descriptor = "(II)V")
	public void method13566(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1533 = arg0 * -1688958779;
		this.anInt1535 = this.anInt1531 * 1535511501;
		this.anInt1536 = arg1 * -79484065;
		if (this.anInt1533 * 858109453 == -1) {
			this.anInt1533 = this.anInt1530 * 1391030175;
		}
		this.anInt1532 = arg1 * -1443914461;
		this.aLong74 = Class305.method26889(1147255061) * 3795665274651405733L;
	}

	@OriginalMember(owner = "client!akf", name = "l", descriptor = "(B)F")
	public float method13567(@OriginalArg(0) byte arg0) {
		return this.aFloat146;
	}

	@OriginalMember(owner = "client!akf", name = "bh", descriptor = "()V")
	public void method13568() {
		@Pc(11) long local11;
		@Pc(18) long local18;
		if (this.anInt1531 * 589853359 != this.anInt1533 * 858109453) {
			local11 = Class305.method26889(1391861962);
			local18 = local11 - this.aLong74 * -2452759870572383699L;
			this.anInt1532 = (int) ((long) this.anInt1532 - local18 * -1443914461L);
			if (this.anInt1532 * 1570863755 > 0) {
				this.anInt1531 = Class125_Sub2_Sub1.method21481(this.anInt1535 * -410282901, this.anInt1533 * 858109453, (float) (this.anInt1536 * 2059530399 - this.anInt1532 * 1570863755) / (float) (this.anInt1536 * 2059530399) * 255.0F, 1530366803) * -1730403249;
			} else {
				this.anInt1531 = this.anInt1533 * 1097400835;
			}
			this.aLong74 = local11 * 3795665274651405733L;
		}
		if (this.aFloat146 == this.aFloat147) {
			return;
		}
		local11 = Class305.method26889(1182573497);
		local18 = local11 - this.aLong73 * 3335590366832729585L;
		this.anInt1534 = (int) ((long) this.anInt1534 - local18 * -1061885795L);
		if (this.anInt1534 * 1239997877 > 0) {
			this.aFloat146 = (float) (this.anInt1528 * 306188305 - this.anInt1534 * 1239997877) / (float) (this.anInt1528 * 306188305) * (this.aFloat147 - this.aFloat145) + this.aFloat145;
		} else {
			this.aFloat146 = this.aFloat147;
		}
		this.aLong73 = local11 * -2834922336505842927L;
	}

	@OriginalMember(owner = "client!akf", name = "az", descriptor = "(F)V")
	public void method13569(@OriginalArg(0) float arg0) {
		this.aFloat146 = arg0;
	}

	@OriginalMember(owner = "client!akf", name = "bf", descriptor = "(FI)V")
	public void method13570(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1) {
		this.aFloat147 = arg0;
		this.aFloat145 = this.aFloat146;
		this.anInt1528 = arg1 * -343744271;
		if (this.aFloat147 < 0.0F) {
			this.aFloat147 = 1.0F;
		}
		this.anInt1534 = arg1 * -1061885795;
		this.aLong73 = Class305.method26889(1664315226) * -2834922336505842927L;
	}

	@OriginalMember(owner = "client!akf", name = "p", descriptor = "(I)I")
	public int method13571(@OriginalArg(0) int arg0) {
		return this.anInt1533 * 858109453;
	}
}
