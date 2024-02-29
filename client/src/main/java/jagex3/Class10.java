package jagex3;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aah")
public final class Class10 implements Iterator {

	@OriginalMember(owner = "client!aah", name = "m", descriptor = "I")
	int anInt24;

	@OriginalMember(owner = "client!aah", name = "n", descriptor = "Lclient!tj;")
	Class93 aClass93_2;

	@OriginalMember(owner = "client!aah", name = "k", descriptor = "Lclient!tj;")
	Class93 aClass93_1 = null;

	@OriginalMember(owner = "client!aah", name = "e", descriptor = "Lclient!aan;")
	Class16 aClass16_1;

	@OriginalMember(owner = "client!aah", name = "l", descriptor = "([I[F[FB)V")
	public static void method165(@OriginalArg(0) int[] arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) byte arg3) {
		Class685.method33632(arg0, arg1, arg2, 0, arg0.length - 1, -1751929437);
	}

	@OriginalMember(owner = "client!aah", name = "m", descriptor = "(I)Z")
	public static boolean method166(@OriginalArg(0) int arg0) {
		return Class525.anInterface57_1 != null;
	}

	@OriginalMember(owner = "client!aah", name = "<init>", descriptor = "(Lclient!aan;)V")
	public Class10(@OriginalArg(0) Class16 arg0) {
		this.aClass16_1 = arg0;
		this.method163((byte) 52);
	}

	@OriginalMember(owner = "client!aah", name = "p", descriptor = "()V")
	void method154() {
		this.aClass93_2 = this.aClass16_1.aClass93Array1[0].aClass93_227;
		this.anInt24 = 1626443017;
		this.aClass93_1 = null;
	}

	@OriginalMember(owner = "client!aah", name = "w", descriptor = "()V")
	public void method155() {
		if (this.aClass93_1 == null) {
			throw new IllegalStateException();
		}
		this.aClass93_1.method23981(661899152);
		this.aClass93_1 = null;
	}

	@OriginalMember(owner = "client!aah", name = "next", descriptor = "()Ljava/lang/Object;")
	@Override
	public Object next() {
		@Pc(15) Class93 local15;
		if (this.aClass16_1.aClass93Array1[this.anInt24 * -779480775 - 1] != this.aClass93_2) {
			local15 = this.aClass93_2;
			this.aClass93_2 = local15.aClass93_227;
			this.aClass93_1 = local15;
			return local15;
		}
		do {
			if (this.anInt24 * -779480775 >= this.aClass16_1.anInt58 * 1214539343) {
				return null;
			}
			local15 = this.aClass16_1.aClass93Array1[(this.anInt24 += 1626443017) * -779480775 - 1].aClass93_227;
		} while (this.aClass16_1.aClass93Array1[this.anInt24 * -779480775 - 1] == local15);
		this.aClass93_2 = local15.aClass93_227;
		this.aClass93_1 = local15;
		return local15;
	}

	@OriginalMember(owner = "client!aah", name = "hasNext", descriptor = "()Z")
	@Override
	public boolean hasNext() {
		if (this.aClass93_2 != this.aClass16_1.aClass93Array1[this.anInt24 * -779480775 - 1]) {
			return true;
		}
		while (this.anInt24 * -779480775 < this.aClass16_1.anInt58 * 1214539343) {
			if (this.aClass16_1.aClass93Array1[(this.anInt24 += 1626443017) * -779480775 - 1].aClass93_227 != this.aClass16_1.aClass93Array1[this.anInt24 * -779480775 - 1]) {
				this.aClass93_2 = this.aClass16_1.aClass93Array1[this.anInt24 * -779480775 - 1].aClass93_227;
				return true;
			}
			this.aClass93_2 = this.aClass16_1.aClass93Array1[this.anInt24 * -779480775 - 1];
		}
		return false;
	}

	@OriginalMember(owner = "client!aah", name = "remove", descriptor = "()V")
	@Override
	public void remove() {
		if (this.aClass93_1 == null) {
			throw new IllegalStateException();
		}
		this.aClass93_1.method23981(-70093651);
		this.aClass93_1 = null;
	}

	@OriginalMember(owner = "client!aah", name = "e", descriptor = "()Z")
	public boolean method156() {
		if (this.aClass93_2 != this.aClass16_1.aClass93Array1[this.anInt24 * -779480775 - 1]) {
			return true;
		}
		while (this.anInt24 * -779480775 < this.aClass16_1.anInt58 * 1214539343) {
			if (this.aClass16_1.aClass93Array1[(this.anInt24 += 1626443017) * -779480775 - 1].aClass93_227 != this.aClass16_1.aClass93Array1[this.anInt24 * -779480775 - 1]) {
				this.aClass93_2 = this.aClass16_1.aClass93Array1[this.anInt24 * -779480775 - 1].aClass93_227;
				return true;
			}
			this.aClass93_2 = this.aClass16_1.aClass93Array1[this.anInt24 * -779480775 - 1];
		}
		return false;
	}

	@OriginalMember(owner = "client!aah", name = "n", descriptor = "()Z")
	public boolean method157() {
		if (this.aClass93_2 != this.aClass16_1.aClass93Array1[this.anInt24 * -779480775 - 1]) {
			return true;
		}
		while (this.anInt24 * -779480775 < this.aClass16_1.anInt58 * 1214539343) {
			if (this.aClass16_1.aClass93Array1[(this.anInt24 += 1626443017) * -779480775 - 1].aClass93_227 != this.aClass16_1.aClass93Array1[this.anInt24 * -779480775 - 1]) {
				this.aClass93_2 = this.aClass16_1.aClass93Array1[this.anInt24 * -779480775 - 1].aClass93_227;
				return true;
			}
			this.aClass93_2 = this.aClass16_1.aClass93Array1[this.anInt24 * -779480775 - 1];
		}
		return false;
	}

	@OriginalMember(owner = "client!aah", name = "m", descriptor = "()Ljava/lang/Object;")
	public Object method158() {
		@Pc(15) Class93 local15;
		if (this.aClass16_1.aClass93Array1[this.anInt24 * -779480775 - 1] != this.aClass93_2) {
			local15 = this.aClass93_2;
			this.aClass93_2 = local15.aClass93_227;
			this.aClass93_1 = local15;
			return local15;
		}
		do {
			if (this.anInt24 * -779480775 >= this.aClass16_1.anInt58 * 1214539343) {
				return null;
			}
			local15 = this.aClass16_1.aClass93Array1[(this.anInt24 += 1626443017) * -779480775 - 1].aClass93_227;
		} while (this.aClass16_1.aClass93Array1[this.anInt24 * -779480775 - 1] == local15);
		this.aClass93_2 = local15.aClass93_227;
		this.aClass93_1 = local15;
		return local15;
	}

	@OriginalMember(owner = "client!aah", name = "k", descriptor = "()Ljava/lang/Object;")
	public Object method159() {
		@Pc(15) Class93 local15;
		if (this.aClass16_1.aClass93Array1[this.anInt24 * -779480775 - 1] != this.aClass93_2) {
			local15 = this.aClass93_2;
			this.aClass93_2 = local15.aClass93_227;
			this.aClass93_1 = local15;
			return local15;
		}
		do {
			if (this.anInt24 * -779480775 >= this.aClass16_1.anInt58 * 1214539343) {
				return null;
			}
			local15 = this.aClass16_1.aClass93Array1[(this.anInt24 += 1626443017) * -779480775 - 1].aClass93_227;
		} while (this.aClass16_1.aClass93Array1[this.anInt24 * -779480775 - 1] == local15);
		this.aClass93_2 = local15.aClass93_227;
		this.aClass93_1 = local15;
		return local15;
	}

	@OriginalMember(owner = "client!aah", name = "u", descriptor = "(B)Lclient!tj;")
	public Class93 method160(@OriginalArg(0) byte arg0) {
		this.method163((byte) -34);
		return (Class93) this.next();
	}

	@OriginalMember(owner = "client!aah", name = "f", descriptor = "()V")
	public void method161() {
		if (this.aClass93_1 == null) {
			throw new IllegalStateException();
		}
		this.aClass93_1.method23981(-1623306999);
		this.aClass93_1 = null;
	}

	@OriginalMember(owner = "client!aah", name = "z", descriptor = "()V")
	void method162() {
		this.aClass93_2 = this.aClass16_1.aClass93Array1[0].aClass93_227;
		this.anInt24 = 1626443017;
		this.aClass93_1 = null;
	}

	@OriginalMember(owner = "client!aah", name = "l", descriptor = "(B)V")
	void method163(@OriginalArg(0) byte arg0) {
		this.aClass93_2 = this.aClass16_1.aClass93Array1[0].aClass93_227;
		this.anInt24 = 1626443017;
		this.aClass93_1 = null;
	}

	@OriginalMember(owner = "client!aah", name = "d", descriptor = "()V")
	void method164() {
		this.aClass93_2 = this.aClass16_1.aClass93Array1[0].aClass93_227;
		this.anInt24 = 1626443017;
		this.aClass93_1 = null;
	}
}
