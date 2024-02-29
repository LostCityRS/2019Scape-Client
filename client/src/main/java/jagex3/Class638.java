package jagex3;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wi")
public final class Class638 implements Iterator {

	@OriginalMember(owner = "client!wi", name = "hq", descriptor = "Lclient!api;")
	public static Class32_Sub22 aClass32_Sub22_1;

	@OriginalMember(owner = "client!wi", name = "n", descriptor = "I")
	int anInt5910;

	@OriginalMember(owner = "client!wi", name = "e", descriptor = "[Lclient!wm;")
	Class640[] aClass640Array1;

	@OriginalMember(owner = "client!wi", name = "ax", descriptor = "(Lclient!yf;I)V")
	static void method32643(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6049 -= 957530791;
	}

	@OriginalMember(owner = "client!wi", name = "tw", descriptor = "(Lclient!hf;Lclient!yf;B)V")
	static void method32644(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class681 arg1, @OriginalArg(2) byte arg2) {
		arg1.anInt6052 -= -987882558;
		@Pc(15) int local15 = arg1.anIntArray521[arg1.anInt6052 * -1497248091] - 1;
		@Pc(25) int local25 = arg1.anIntArray521[arg1.anInt6052 * -1497248091 + 1];
		@Pc(35) int local35 = arg1.anIntArray521[arg1.anInt6052 * -1497248091 + 2];
		@Pc(47) int local47 = Math.max(1, arg1.anIntArray521[arg1.anInt6052 * -1497248091 + 3]);
		@Pc(53) float local53 = (float) local35 / (float) local47;
		@Pc(63) int local63 = arg1.anIntArray521[arg1.anInt6052 * -1497248091 + 4];
		@Pc(73) int local73 = arg1.anIntArray521[arg1.anInt6052 * -1497248091 + 5];
		@Pc(83) int local83 = arg1.anIntArray521[arg1.anInt6052 * -1497248091 + 6];
		@Pc(93) int local93 = arg1.anIntArray521[arg1.anInt6052 * -1497248091 + 7];
		@Pc(103) int local103 = arg1.anIntArray521[arg1.anInt6052 * -1497248091 + 8];
		@Pc(113) int local113 = arg1.anIntArray521[arg1.anInt6052 * -1497248091 + 9];
		if (arg0.anInt4042 * 1553054515 != 6) {
			throw new RuntimeException("");
		} else if (local15 >= 0 && local15 < 12) {
			Class420.method28921(arg0, local15, local25, local53, local63, local73, local83, local93, local103, local113, (byte) 30);
			Class354.method27789(arg0, -1174743804);
		} else {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!wi", name = "um", descriptor = "(Lclient!yf;I)V")
	static void method32645(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, 293584451);
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = client.method24983(local16) ? 1 : 0;
	}

	@OriginalMember(owner = "client!wi", name = "tc", descriptor = "(Lclient!yf;I)V")
	static void method32646(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, -424798920);
		Class229.method25712(local16, arg0, (byte) 34);
	}

	@OriginalMember(owner = "client!wi", name = "afs", descriptor = "(Lclient!yf;B)V")
	static void method32647(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class93_Sub32.method13931((char) local12, -1679821656) ? 1 : 0;
	}

	@OriginalMember(owner = "client!wi", name = "<init>", descriptor = "([Lclient!wm;)V")
	Class638(@OriginalArg(0) Class640[] arg0) {
		this.aClass640Array1 = arg0;
	}

	@OriginalMember(owner = "client!wi", name = "m", descriptor = "()Ljava/lang/Object;")
	public Object method32637() {
		return this.aClass640Array1[(this.anInt5910 += -1533215613) * 1030763051 - 1];
	}

	@OriginalMember(owner = "client!wi", name = "next", descriptor = "()Ljava/lang/Object;")
	@Override
	public Object next() {
		return this.aClass640Array1[(this.anInt5910 += -1533215613) * 1030763051 - 1];
	}

	@OriginalMember(owner = "client!wi", name = "hasNext", descriptor = "()Z")
	@Override
	public boolean hasNext() {
		return this.anInt5910 * 1030763051 < this.aClass640Array1.length;
	}

	@OriginalMember(owner = "client!wi", name = "remove", descriptor = "()V")
	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!wi", name = "e", descriptor = "()Z")
	public boolean method32638() {
		return this.anInt5910 * 1030763051 < this.aClass640Array1.length;
	}

	@OriginalMember(owner = "client!wi", name = "n", descriptor = "()Z")
	public boolean method32639() {
		return this.anInt5910 * 1030763051 < this.aClass640Array1.length;
	}

	@OriginalMember(owner = "client!wi", name = "k", descriptor = "()Ljava/lang/Object;")
	public Object method32640() {
		return this.aClass640Array1[(this.anInt5910 += -1533215613) * 1030763051 - 1];
	}

	@OriginalMember(owner = "client!wi", name = "f", descriptor = "()V")
	public void method32641() {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!wi", name = "w", descriptor = "()V")
	public void method32642() {
		throw new UnsupportedOperationException();
	}
}
