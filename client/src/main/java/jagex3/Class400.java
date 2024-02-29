package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lk")
public final class Class400 {

	@OriginalMember(owner = "client!lk", name = "e", descriptor = "I")
	int anInt4840;

	@OriginalMember(owner = "client!lk", name = "n", descriptor = "J")
	long aLong271;

	@OriginalMember(owner = "client!lk", name = "<init>", descriptor = "([Lclient!lj;)V")
	Class400(@OriginalArg(0) Class399[] arg0) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			this.method28682(arg0[local3]);
		}
	}

	@OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(Lclient!lj;)V")
	Class400(@OriginalArg(0) Class399 arg0) {
		this.aLong271 = arg0.anInt4838;
		this.anInt4840 = 1;
	}

	@OriginalMember(owner = "client!lk", name = "m", descriptor = "(I)I")
	int method28678(@OriginalArg(0) int arg0) {
		return (int) (this.aLong271 >> Class399.anInt4834 * arg0) & 0xF;
	}

	@OriginalMember(owner = "client!lk", name = "e", descriptor = "()I")
	public int method28679() {
		return this.anInt4840;
	}

	@OriginalMember(owner = "client!lk", name = "n", descriptor = "(I)Lclient!lj;")
	public Class399 method28680(@OriginalArg(0) int arg0) {
		return Class399.method28675(this.method28678(arg0));
	}

	@OriginalMember(owner = "client!lk", name = "w", descriptor = "()I")
	public int method28681() {
		return this.anInt4840;
	}

	@OriginalMember(owner = "client!lk", name = "k", descriptor = "(Lclient!lj;)V")
	void method28682(@OriginalArg(0) Class399 arg0) {
		this.aLong271 |= arg0.anInt4838 << Class399.anInt4834 * this.anInt4840++;
	}

	@OriginalMember(owner = "client!lk", name = "f", descriptor = "()I")
	public int method28683() {
		return this.anInt4840;
	}

	@OriginalMember(owner = "client!lk", name = "p", descriptor = "(I)I")
	int method28684(@OriginalArg(0) int arg0) {
		return (int) (this.aLong271 >> Class399.anInt4834 * arg0) & 0xF;
	}

	@OriginalMember(owner = "client!lk", name = "u", descriptor = "()I")
	public int method28685() {
		return this.anInt4840;
	}

	@OriginalMember(owner = "client!lk", name = "z", descriptor = "(I)Lclient!lj;")
	public Class399 method28686(@OriginalArg(0) int arg0) {
		return Class399.method28675(this.method28678(arg0));
	}

	@OriginalMember(owner = "client!lk", name = "l", descriptor = "()I")
	public int method28687() {
		return this.anInt4840;
	}

	@OriginalMember(owner = "client!lk", name = "d", descriptor = "(I)I")
	int method28688(@OriginalArg(0) int arg0) {
		return (int) (this.aLong271 >> Class399.anInt4834 * arg0) & 0xF;
	}
}
