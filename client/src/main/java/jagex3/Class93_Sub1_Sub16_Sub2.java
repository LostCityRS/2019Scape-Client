package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!atf")
public final class Class93_Sub1_Sub16_Sub2 extends Class93_Sub1_Sub16 {

	@OriginalMember(owner = "client!atf", name = "c", descriptor = "I")
	static final int anInt3192 = 3;

	@OriginalMember(owner = "client!atf", name = "p", descriptor = "I")
	static final int anInt3194 = 1;

	@OriginalMember(owner = "client!atf", name = "d", descriptor = "I")
	static final int anInt3195 = 2;

	@OriginalMember(owner = "client!atf", name = "v", descriptor = "Lclient!uf;")
	Class593 aClass593_3;

	@OriginalMember(owner = "client!atf", name = "o", descriptor = "[B")
	byte[] aByteArray60;

	@OriginalMember(owner = "client!atf", name = "r", descriptor = "I")
	int anInt3193;

	@OriginalMember(owner = "client!atf", name = "aie", descriptor = "(Lclient!yf;I)V")
	static void method23389(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class449.aClass514_1.method30448(local13, (byte) 53).aCharArray3[local23];
	}

	@OriginalMember(owner = "client!atf", name = "<init>", descriptor = "()V")
	Class93_Sub1_Sub16_Sub2() {
	}

	@OriginalMember(owner = "client!atf", name = "e", descriptor = "(I)[B")
	@Override
	byte[] method23993(@OriginalArg(0) int arg0) {
		if (this.aBoolean547) {
			throw new RuntimeException();
		}
		return this.aByteArray60;
	}

	@OriginalMember(owner = "client!atf", name = "n", descriptor = "(I)I")
	@Override
	int method23995(@OriginalArg(0) int arg0) {
		return this.aBoolean547 ? 0 : 100;
	}

	@OriginalMember(owner = "client!atf", name = "m", descriptor = "()[B")
	@Override
	byte[] method23992() {
		if (this.aBoolean547) {
			throw new RuntimeException();
		}
		return this.aByteArray60;
	}

	@OriginalMember(owner = "client!atf", name = "k", descriptor = "()[B")
	@Override
	byte[] method23994() {
		if (this.aBoolean547) {
			throw new RuntimeException();
		}
		return this.aByteArray60;
	}

	@OriginalMember(owner = "client!atf", name = "f", descriptor = "()I")
	@Override
	int method23991() {
		return this.aBoolean547 ? 0 : 100;
	}

	@OriginalMember(owner = "client!atf", name = "w", descriptor = "()I")
	@Override
	int method23996() {
		return this.aBoolean547 ? 0 : 100;
	}
}
