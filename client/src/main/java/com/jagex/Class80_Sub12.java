package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!akb")
public final class Class80_Sub12 extends Class80 {

	@OriginalMember(owner = "client!akb", name = "a", descriptor = "I")
	int anInt1534;

	@OriginalMember(owner = "client!akb", name = "s", descriptor = "J")
	long aLong81;

	@OriginalMember(owner = "client!akb", name = "k", descriptor = "I")
	int anInt1535;

	@OriginalMember(owner = "client!akb", name = "q", descriptor = "I")
	int anInt1537;

	@OriginalMember(owner = "client!akb", name = "h", descriptor = "J")
	long aLong82;

	@OriginalMember(owner = "client!akb", name = "d", descriptor = "I")
	int anInt1538;

	@OriginalMember(owner = "client!akb", name = "u", descriptor = "Lclient!on;")
	public Class463 aClass463_45 = new Class463();

	@OriginalMember(owner = "client!akb", name = "l", descriptor = "I")
	int anInt1531;

	@OriginalMember(owner = "client!akb", name = "g", descriptor = "I")
	int anInt1532;

	@OriginalMember(owner = "client!akb", name = "j", descriptor = "I")
	int anInt1533;

	@OriginalMember(owner = "client!akb", name = "o", descriptor = "I")
	int anInt1530;

	@OriginalMember(owner = "client!akb", name = "m", descriptor = "I")
	int anInt1536;

	@OriginalMember(owner = "client!akb", name = "i", descriptor = "F")
	float aFloat141;

	@OriginalMember(owner = "client!akb", name = "r", descriptor = "F")
	float aFloat140;

	@OriginalMember(owner = "client!akb", name = "w", descriptor = "F")
	float aFloat142;

	@OriginalMember(owner = "client!akb", name = "x", descriptor = "F")
	float aFloat139;

	@OriginalMember(owner = "client!akb", name = "kj", descriptor = "(IIIIIIIII)V")
	static void method14000(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (Class71.method18185(arg0, null, (byte) 100)) {
			Class165_Sub12.method16065(Class709.aClass310Array1[arg0].method27455((byte) 46), -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg7 < 0, 942931131);
		} else if (arg7 == -1) {
			for (@Pc(14) int local14 = 0; local14 < 106; local14++) {
				client.aBooleanArray19[local14] = true;
			}
		} else {
			client.aBooleanArray19[arg7] = true;
		}
	}

	@OriginalMember(owner = "client!akb", name = "<init>", descriptor = "(IIIIIF)V")
	Class80_Sub12(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		this.aClass463_45.method29477((float) arg0, (float) arg1, (float) arg2);
		this.anInt1531 = arg3 * -1148277929;
		this.anInt1532 = arg4 * -1670021197;
		this.anInt1533 = this.anInt1532 * -1158198669;
		this.anInt1530 = this.anInt1532 * -2109935323;
		this.anInt1536 = this.anInt1532 * -2132159791;
		this.aFloat141 = arg5;
		this.aFloat140 = 1.0F;
		this.aFloat142 = 1.0F;
		this.aFloat139 = 1.0F;
	}

	@OriginalMember(owner = "client!akb", name = "am", descriptor = "()F")
	public float method13948() {
		return this.aFloat140;
	}

	@OriginalMember(owner = "client!akb", name = "t", descriptor = "(B)I")
	public int method13949(@OriginalArg(0) byte arg0) {
		return (int) this.aClass463_45.aFloat297;
	}

	@OriginalMember(owner = "client!akb", name = "f", descriptor = "(I)I")
	public int method13950(@OriginalArg(0) int arg0) {
		return (int) this.aClass463_45.aFloat295;
	}

	@OriginalMember(owner = "client!akb", name = "aa", descriptor = "(III)V")
	public void method13951(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass463_45.method29477((float) arg0, (float) arg1, (float) arg2);
	}

	@OriginalMember(owner = "client!akb", name = "u", descriptor = "(I)I")
	public int method13952(@OriginalArg(0) int arg0) {
		return this.anInt1531 * -1550487449;
	}

	@OriginalMember(owner = "client!akb", name = "l", descriptor = "(B)I")
	public int method13953(@OriginalArg(0) byte arg0) {
		return this.anInt1533 * 317138137;
	}

	@OriginalMember(owner = "client!akb", name = "g", descriptor = "(I)F")
	public float method13954(@OriginalArg(0) int arg0) {
		return this.aFloat141;
	}

	@OriginalMember(owner = "client!akb", name = "i", descriptor = "(B)F")
	public float method13955(@OriginalArg(0) byte arg0) {
		return this.aFloat140;
	}

	@OriginalMember(owner = "client!akb", name = "m", descriptor = "(FI)V")
	public void method13956(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1) {
		this.aFloat141 = arg0;
	}

	@OriginalMember(owner = "client!akb", name = "o", descriptor = "(IIII)V")
	public void method13957(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass463_45.method29477((float) arg0, (float) arg1, (float) arg2);
	}

	@OriginalMember(owner = "client!akb", name = "au", descriptor = "()I")
	public int method13958() {
		return this.anInt1534 * -1095958621;
	}

	@OriginalMember(owner = "client!akb", name = "a", descriptor = "(B)I")
	public int method13959(@OriginalArg(0) byte arg0) {
		return this.anInt1534 * -1095958621;
	}

	@OriginalMember(owner = "client!akb", name = "x", descriptor = "(B)I")
	public int method13960(@OriginalArg(0) byte arg0) {
		return this.anInt1537 * -383062401;
	}

	@OriginalMember(owner = "client!akb", name = "ae", descriptor = "()I")
	public int method13961() {
		return this.anInt1534 * -1095958621;
	}

	@OriginalMember(owner = "client!akb", name = "z", descriptor = "(IB)V")
	public void method13962(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.anInt1533 = arg0 * -2090394775;
	}

	@OriginalMember(owner = "client!akb", name = "p", descriptor = "(FB)V")
	public void method13963(@OriginalArg(0) float arg0, @OriginalArg(1) byte arg1) {
		this.aFloat140 = arg0;
	}

	@OriginalMember(owner = "client!akb", name = "v", descriptor = "(III)V")
	public void method13964(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1536 = arg0 * -661055709;
		this.anInt1530 = this.anInt1533 * -769886201;
		this.anInt1535 = arg1 * -542767557;
		if (this.anInt1536 * 1625084043 == -1) {
			this.anInt1536 = this.anInt1532 * -2132159791;
		}
		this.anInt1534 = arg1 * 2028678155;
		this.aLong81 = Class303.currentTimeMillis((byte) 42) * -3277204844630146777L;
	}

	@OriginalMember(owner = "client!akb", name = "y", descriptor = "(FII)V")
	public void method13965(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aFloat139 = arg0;
		this.aFloat142 = this.aFloat140;
		this.anInt1538 = arg1 * 1312206469;
		if (this.aFloat139 < 0.0F) {
			this.aFloat139 = 1.0F;
		}
		this.anInt1537 = arg1 * -1778200193;
		this.aLong82 = Class303.currentTimeMillis((byte) 51) * -4138414860134479215L;
	}

	@OriginalMember(owner = "client!akb", name = "n", descriptor = "(I)V")
	public void method13966(@OriginalArg(0) int arg0) {
		@Pc(11) long local11;
		@Pc(18) long local18;
		if (this.anInt1533 * 317138137 != this.anInt1536 * 1625084043) {
			local11 = Class303.currentTimeMillis((byte) 48);
			local18 = local11 - this.aLong81 * -4875598587704385897L;
			this.anInt1534 = (int) ((long) this.anInt1534 - local18 * 2028678155L);
			if (this.anInt1534 * -1095958621 > 0) {
				this.anInt1533 = Class335.method27856(this.anInt1530 * 1638368287, this.anInt1536 * 1625084043, (float) (this.anInt1535 * -449256717 - this.anInt1534 * -1095958621) / (float) (this.anInt1535 * -449256717) * 255.0F, 1464685627) * -2090394775;
			} else {
				this.anInt1533 = this.anInt1536 * 226308611;
			}
			this.aLong81 = local11 * -3277204844630146777L;
		}
		if (this.aFloat139 == this.aFloat140) {
			return;
		}
		local11 = Class303.currentTimeMillis((byte) 113);
		local18 = local11 - this.aLong82 * 3275358663915107953L;
		this.anInt1537 = (int) ((long) this.anInt1537 - local18 * -1778200193L);
		if (this.anInt1537 * -383062401 > 0) {
			this.aFloat140 = this.aFloat142 + (float) (this.anInt1538 * 1992563277 - this.anInt1537 * -383062401) / (float) (this.anInt1538 * 1992563277) * (this.aFloat139 - this.aFloat142);
		} else {
			this.aFloat140 = this.aFloat139;
		}
		this.aLong82 = local11 * -4138414860134479215L;
	}

	@OriginalMember(owner = "client!akb", name = "ay", descriptor = "()I")
	public int method13967() {
		return (int) this.aClass463_45.aFloat296;
	}

	@OriginalMember(owner = "client!akb", name = "j", descriptor = "(B)I")
	public int method13968(@OriginalArg(0) byte arg0) {
		return this.anInt1536 * 1625084043;
	}

	@OriginalMember(owner = "client!akb", name = "bl", descriptor = "(II)V")
	public void method13969(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1536 = arg0 * -661055709;
		this.anInt1530 = this.anInt1533 * -769886201;
		this.anInt1535 = arg1 * -542767557;
		if (this.anInt1536 * 1625084043 == -1) {
			this.anInt1536 = this.anInt1532 * -2132159791;
		}
		this.anInt1534 = arg1 * 2028678155;
		this.aLong81 = Class303.currentTimeMillis((byte) 116) * -3277204844630146777L;
	}

	@OriginalMember(owner = "client!akb", name = "e", descriptor = "(I)I")
	public int method13970(@OriginalArg(0) int arg0) {
		return (int) this.aClass463_45.aFloat296;
	}

	@OriginalMember(owner = "client!akb", name = "ai", descriptor = "()I")
	public int method13971() {
		return this.anInt1531 * -1550487449;
	}

	@OriginalMember(owner = "client!akb", name = "aq", descriptor = "()I")
	public int method13972() {
		return this.anInt1531 * -1550487449;
	}

	@OriginalMember(owner = "client!akb", name = "ao", descriptor = "()I")
	public int method13973() {
		return this.anInt1531 * -1550487449;
	}

	@OriginalMember(owner = "client!akb", name = "s", descriptor = "(I)F")
	public float method13974(@OriginalArg(0) int arg0) {
		return this.aFloat139;
	}

	@OriginalMember(owner = "client!akb", name = "aj", descriptor = "()I")
	public int method13975() {
		return this.anInt1531 * -1550487449;
	}

	@OriginalMember(owner = "client!akb", name = "ag", descriptor = "()I")
	public int method13976() {
		return this.anInt1533 * 317138137;
	}

	@OriginalMember(owner = "client!akb", name = "b", descriptor = "()I")
	public int method13977() {
		return (int) this.aClass463_45.aFloat295;
	}

	@OriginalMember(owner = "client!akb", name = "al", descriptor = "()I")
	public int method13978() {
		return this.anInt1533 * 317138137;
	}

	@OriginalMember(owner = "client!akb", name = "ah", descriptor = "()I")
	public int method13979() {
		return this.anInt1533 * 317138137;
	}

	@OriginalMember(owner = "client!akb", name = "af", descriptor = "()F")
	public float method13980() {
		return this.aFloat141;
	}

	@OriginalMember(owner = "client!akb", name = "ba", descriptor = "()V")
	public void method13981() {
		@Pc(11) long local11;
		@Pc(18) long local18;
		if (this.anInt1533 * 317138137 != this.anInt1536 * 1625084043) {
			local11 = Class303.currentTimeMillis((byte) 30);
			local18 = local11 - this.aLong81 * -4875598587704385897L;
			this.anInt1534 = (int) ((long) this.anInt1534 - local18 * 2028678155L);
			if (this.anInt1534 * -1095958621 > 0) {
				this.anInt1533 = Class335.method27856(this.anInt1530 * 1638368287, this.anInt1536 * 1625084043, (float) (this.anInt1535 * -449256717 - this.anInt1534 * -1095958621) / (float) (this.anInt1535 * -449256717) * 255.0F, 1350888581) * -2090394775;
			} else {
				this.anInt1533 = this.anInt1536 * 226308611;
			}
			this.aLong81 = local11 * -3277204844630146777L;
		}
		if (this.aFloat139 == this.aFloat140) {
			return;
		}
		local11 = Class303.currentTimeMillis((byte) 45);
		local18 = local11 - this.aLong82 * 3275358663915107953L;
		this.anInt1537 = (int) ((long) this.anInt1537 - local18 * -1778200193L);
		if (this.anInt1537 * -383062401 > 0) {
			this.aFloat140 = this.aFloat142 + (float) (this.anInt1538 * 1992563277 - this.anInt1537 * -383062401) / (float) (this.anInt1538 * 1992563277) * (this.aFloat139 - this.aFloat142);
		} else {
			this.aFloat140 = this.aFloat139;
		}
		this.aLong82 = local11 * -4138414860134479215L;
	}

	@OriginalMember(owner = "client!akb", name = "ak", descriptor = "()F")
	public float method13982() {
		return this.aFloat140;
	}

	@OriginalMember(owner = "client!akb", name = "at", descriptor = "()F")
	public float method13983() {
		return this.aFloat140;
	}

	@OriginalMember(owner = "client!akb", name = "ad", descriptor = "()F")
	public float method13984() {
		return this.aFloat140;
	}

	@OriginalMember(owner = "client!akb", name = "av", descriptor = "(F)V")
	public void method13985(@OriginalArg(0) float arg0) {
		this.aFloat141 = arg0;
	}

	@OriginalMember(owner = "client!akb", name = "an", descriptor = "(III)V")
	public void method13986(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass463_45.method29477((float) arg0, (float) arg1, (float) arg2);
	}

	@OriginalMember(owner = "client!akb", name = "ax", descriptor = "()I")
	public int method13987() {
		return (int) this.aClass463_45.aFloat296;
	}

	@OriginalMember(owner = "client!akb", name = "ap", descriptor = "()I")
	public int method13988() {
		return this.anInt1534 * -1095958621;
	}

	@OriginalMember(owner = "client!akb", name = "c", descriptor = "()I")
	public int method13989() {
		return (int) this.aClass463_45.aFloat297;
	}

	@OriginalMember(owner = "client!akb", name = "bn", descriptor = "()V")
	public void method13990() {
		@Pc(11) long local11;
		@Pc(18) long local18;
		if (this.anInt1533 * 317138137 != this.anInt1536 * 1625084043) {
			local11 = Class303.currentTimeMillis((byte) 101);
			local18 = local11 - this.aLong81 * -4875598587704385897L;
			this.anInt1534 = (int) ((long) this.anInt1534 - local18 * 2028678155L);
			if (this.anInt1534 * -1095958621 > 0) {
				this.anInt1533 = Class335.method27856(this.anInt1530 * 1638368287, this.anInt1536 * 1625084043, (float) (this.anInt1535 * -449256717 - this.anInt1534 * -1095958621) / (float) (this.anInt1535 * -449256717) * 255.0F, 643714144) * -2090394775;
			} else {
				this.anInt1533 = this.anInt1536 * 226308611;
			}
			this.aLong81 = local11 * -3277204844630146777L;
		}
		if (this.aFloat139 == this.aFloat140) {
			return;
		}
		local11 = Class303.currentTimeMillis((byte) 66);
		local18 = local11 - this.aLong82 * 3275358663915107953L;
		this.anInt1537 = (int) ((long) this.anInt1537 - local18 * -1778200193L);
		if (this.anInt1537 * -383062401 > 0) {
			this.aFloat140 = this.aFloat142 + (float) (this.anInt1538 * 1992563277 - this.anInt1537 * -383062401) / (float) (this.anInt1538 * 1992563277) * (this.aFloat139 - this.aFloat142);
		} else {
			this.aFloat140 = this.aFloat139;
		}
		this.aLong82 = local11 * -4138414860134479215L;
	}

	@OriginalMember(owner = "client!akb", name = "ac", descriptor = "()I")
	public int method13991() {
		return this.anInt1533 * 317138137;
	}

	@OriginalMember(owner = "client!akb", name = "as", descriptor = "()I")
	public int method13992() {
		return this.anInt1537 * -383062401;
	}

	@OriginalMember(owner = "client!akb", name = "aw", descriptor = "(I)V")
	public void method13993(@OriginalArg(0) int arg0) {
		this.anInt1533 = arg0 * -2090394775;
	}

	@OriginalMember(owner = "client!akb", name = "bg", descriptor = "(I)V")
	public void method13994(@OriginalArg(0) int arg0) {
		this.anInt1533 = arg0 * -2090394775;
	}

	@OriginalMember(owner = "client!akb", name = "ab", descriptor = "()I")
	public int method13995() {
		return this.anInt1533 * 317138137;
	}

	@OriginalMember(owner = "client!akb", name = "br", descriptor = "(FI)V")
	public void method13996(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1) {
		this.aFloat139 = arg0;
		this.aFloat142 = this.aFloat140;
		this.anInt1538 = arg1 * 1312206469;
		if (this.aFloat139 < 0.0F) {
			this.aFloat139 = 1.0F;
		}
		this.anInt1537 = arg1 * -1778200193;
		this.aLong82 = Class303.currentTimeMillis((byte) 69) * -4138414860134479215L;
	}

	@OriginalMember(owner = "client!akb", name = "az", descriptor = "()F")
	public float method13997() {
		return this.aFloat139;
	}

	@OriginalMember(owner = "client!akb", name = "ar", descriptor = "()I")
	public int method13998() {
		return this.anInt1534 * -1095958621;
	}

	@OriginalMember(owner = "client!akb", name = "bt", descriptor = "()V")
	public void method13999() {
		@Pc(11) long local11;
		@Pc(18) long local18;
		if (this.anInt1533 * 317138137 != this.anInt1536 * 1625084043) {
			local11 = Class303.currentTimeMillis((byte) 40);
			local18 = local11 - this.aLong81 * -4875598587704385897L;
			this.anInt1534 = (int) ((long) this.anInt1534 - local18 * 2028678155L);
			if (this.anInt1534 * -1095958621 > 0) {
				this.anInt1533 = Class335.method27856(this.anInt1530 * 1638368287, this.anInt1536 * 1625084043, (float) (this.anInt1535 * -449256717 - this.anInt1534 * -1095958621) / (float) (this.anInt1535 * -449256717) * 255.0F, 2118838208) * -2090394775;
			} else {
				this.anInt1533 = this.anInt1536 * 226308611;
			}
			this.aLong81 = local11 * -3277204844630146777L;
		}
		if (this.aFloat139 == this.aFloat140) {
			return;
		}
		local11 = Class303.currentTimeMillis((byte) 32);
		local18 = local11 - this.aLong82 * 3275358663915107953L;
		this.anInt1537 = (int) ((long) this.anInt1537 - local18 * -1778200193L);
		if (this.anInt1537 * -383062401 > 0) {
			this.aFloat140 = this.aFloat142 + (float) (this.anInt1538 * 1992563277 - this.anInt1537 * -383062401) / (float) (this.anInt1538 * 1992563277) * (this.aFloat139 - this.aFloat142);
		} else {
			this.aFloat140 = this.aFloat139;
		}
		this.aLong82 = local11 * -4138414860134479215L;
	}
}
