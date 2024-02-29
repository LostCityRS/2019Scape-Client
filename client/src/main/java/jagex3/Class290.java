package jagex3;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gj")
final class Class290 implements Iterator {

	@OriginalMember(owner = "client!gj", name = "ua", descriptor = "I")
	static int anInt3952;

	@OriginalMember(owner = "client!gj", name = "e", descriptor = "I")
	int anInt3951;

	// $FF: synthetic field
	@OriginalMember(owner = "client!gj", name = "this$0", descriptor = "Lclient!adj;")
	final Class79_Sub1_Sub1 aClass79_Sub1_Sub1_3;

	@OriginalMember(owner = "client!gj", name = "f", descriptor = "(I)V")
	static void method26656(@OriginalArg(0) int arg0) {
		Class288.anIntArray372 = Class122_Sub3.method10157(2048, 35, 8, 8, 4, 0.4F, true, 2085440513);
	}

	@OriginalMember(owner = "client!gj", name = "aga", descriptor = "(Lclient!yf;I)V")
	static void method26657(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Character.toLowerCase((char) local12);
	}

	@OriginalMember(owner = "client!gj", name = "zo", descriptor = "(Lclient!yf;I)V")
	static void method26658(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(26) String local26 = (String) arg0.anObjectArray45[(arg0.anInt6049 -= 957530791) * 587908375];
		if (local12 == -1) {
			throw new RuntimeException();
		}
		@Pc(39) Class39 local39 = (Class39) Class19.aClass32_Sub7_5.method18273(local12, 1819008273);
		if (local39.aClass519_1 != Class519.aClass519_7) {
			throw new RuntimeException();
		}
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local39.method751(local26, (byte) 0) ? 1 : 0;
	}

	@OriginalMember(owner = "client!gj", name = "auk", descriptor = "(Lclient!yf;I)V")
	static void method26659(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub4_1.method15436((byte) 78);
	}

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(Lclient!adj;)V")
	Class290(@OriginalArg(0) Class79_Sub1_Sub1 arg0) {
		this.aClass79_Sub1_Sub1_3 = arg0;
	}

	@OriginalMember(owner = "client!gj", name = "hasNext", descriptor = "()Z")
	@Override
	public boolean hasNext() {
		return this.anInt3951 * 1001134045 < this.aClass79_Sub1_Sub1_3.method18274(1957922455);
	}

	@OriginalMember(owner = "client!gj", name = "n", descriptor = "()Z")
	public boolean method26650() {
		return this.anInt3951 * 1001134045 < this.aClass79_Sub1_Sub1_3.method18274(1852923904);
	}

	@OriginalMember(owner = "client!gj", name = "remove", descriptor = "()V")
	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!gj", name = "e", descriptor = "()Z")
	public boolean method26651() {
		return this.anInt3951 * 1001134045 < this.aClass79_Sub1_Sub1_3.method18274(1489512930);
	}

	@OriginalMember(owner = "client!gj", name = "next", descriptor = "()Ljava/lang/Object;")
	@Override
	public Object next() {
		@Pc(11) int local11 = (this.anInt3951 += -1577584523) * 1001134045 - 1;
		@Pc(19) Class108_Sub1 local19 = (Class108_Sub1) this.aClass79_Sub1_Sub1_3.aClass240_5.method25932((long) local11);
		return local19 == null ? this.aClass79_Sub1_Sub1_3.method1419(local11, -1922638820) : local19;
	}

	@OriginalMember(owner = "client!gj", name = "m", descriptor = "()Ljava/lang/Object;")
	public Object method26652() {
		@Pc(11) int local11 = (this.anInt3951 += -1577584523) * 1001134045 - 1;
		@Pc(19) Class108_Sub1 local19 = (Class108_Sub1) this.aClass79_Sub1_Sub1_3.aClass240_5.method25932((long) local11);
		return local19 == null ? this.aClass79_Sub1_Sub1_3.method1419(local11, -1956622138) : local19;
	}

	@OriginalMember(owner = "client!gj", name = "k", descriptor = "()Ljava/lang/Object;")
	public Object method26653() {
		@Pc(11) int local11 = (this.anInt3951 += -1577584523) * 1001134045 - 1;
		@Pc(19) Class108_Sub1 local19 = (Class108_Sub1) this.aClass79_Sub1_Sub1_3.aClass240_5.method25932((long) local11);
		return local19 == null ? this.aClass79_Sub1_Sub1_3.method1419(local11, -2084386048) : local19;
	}

	@OriginalMember(owner = "client!gj", name = "f", descriptor = "()V")
	public void method26654() {
		throw new UnsupportedOperationException();
	}

	@OriginalMember(owner = "client!gj", name = "w", descriptor = "()V")
	public void method26655() {
		throw new UnsupportedOperationException();
	}
}
