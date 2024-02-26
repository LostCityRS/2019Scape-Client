package jaclib.memory;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaclib/memory/Stream")
public final class Stream {

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "g", descriptor = "Z")
	private static final boolean g = getLSB(-65536) == -1;

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "t", descriptor = "Lclient!jaclib/memory/Buffer;")
	private Buffer t;

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "f", descriptor = "I")
	private int f;

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "I")
	private int e;

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "u", descriptor = "I")
	private int u;

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "l", descriptor = "[B")
	private final byte[] l;

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "m", descriptor = "()Z")
	public static boolean m() {
		return g;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "floatToRawIntBits", descriptor = "(F)I")
	public static native int floatToRawIntBits(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "getLSB", descriptor = "(I)B")
	private static native byte getLSB(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "()Z")
	public static boolean b() {
		return g;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "ax", descriptor = "()Z")
	public static boolean ax() {
		return g;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "()V")
	public Stream() {
		this(4096);
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(I)V")
	private Stream(@OriginalArg(0) int arg0) {
		this.l = new byte[arg0];
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Lclient!jaclib/memory/Buffer;)V")
	public Stream(@OriginalArg(0) Buffer arg0) {
		this(arg0, 0, arg0.t());
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Lclient!jaclib/memory/Buffer;II)V")
	private Stream(@OriginalArg(0) Buffer arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this(arg0.t() < 4096 ? arg0.t() : 4096);
		this.t(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "t", descriptor = "(Lclient!jaclib/memory/Buffer;II)V")
	private void t(@OriginalArg(0) Buffer arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.i();
		this.t = arg0;
		this.e = arg1 * 1908064153;
		this.f = (arg2 + arg1) * -1158406383;
		if (this.f * -210456079 > arg0.t()) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "f", descriptor = "()I")
	public int f() {
		return this.u * 544167597 + this.e * 1119233193;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "(I)V")
	public void e(@OriginalArg(0) int arg0) {
		this.i();
		this.e = arg0 * 1908064153;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "u", descriptor = "(I)V")
	public void u(@OriginalArg(0) int arg0) {
		if (this.u * 544167597 >= this.l.length) {
			this.i();
		}
		this.l[(this.u += 1303280933) * 544167597 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "l", descriptor = "(F)V")
	public void l(@OriginalArg(0) float arg0) {
		if (this.u * 544167597 + 3 >= this.l.length) {
			this.i();
		}
		@Pc(14) int local14 = floatToRawIntBits(arg0);
		this.l[(this.u += 1303280933) * 544167597 - 1] = (byte) (local14 >> 24);
		this.l[(this.u += 1303280933) * 544167597 - 1] = (byte) (local14 >> 16);
		this.l[(this.u += 1303280933) * 544167597 - 1] = (byte) (local14 >> 8);
		this.l[(this.u += 1303280933) * 544167597 - 1] = (byte) local14;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "g", descriptor = "(F)V")
	public void g(@OriginalArg(0) float arg0) {
		if (this.u * 544167597 + 3 >= this.l.length) {
			this.i();
		}
		@Pc(14) int local14 = floatToRawIntBits(arg0);
		this.l[(this.u += 1303280933) * 544167597 - 1] = (byte) local14;
		this.l[(this.u += 1303280933) * 544167597 - 1] = (byte) (local14 >> 8);
		this.l[(this.u += 1303280933) * 544167597 - 1] = (byte) (local14 >> 16);
		this.l[(this.u += 1303280933) * 544167597 - 1] = (byte) (local14 >> 24);
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "i", descriptor = "()V")
	public void i() {
		if (this.u * 544167597 <= 0) {
			return;
		}
		if (this.u * 544167597 + this.e * 1119233193 > this.f * -210456079) {
			throw new RuntimeException();
		}
		this.t.e(this.l, 0, this.e * 1119233193, this.u * 544167597);
		this.e += this.u * -890773403;
		this.u = 0;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "o", descriptor = "(Lclient!jaclib/memory/Buffer;II)V")
	private void o(@OriginalArg(0) Buffer arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.i();
		this.t = arg0;
		this.e = arg1 * 1908064153;
		this.f = (arg2 + arg1) * -1158406383;
		if (this.f * -210456079 > arg0.t()) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "j", descriptor = "()I")
	public int j() {
		return this.u * 544167597 + this.e * 1119233193;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "()I")
	public int a() {
		return this.u * 544167597 + this.e * 1119233193;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "s", descriptor = "(I)V")
	public void s(@OriginalArg(0) int arg0) {
		this.i();
		this.e = arg0 * 1908064153;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "k", descriptor = "(I)V")
	public void k(@OriginalArg(0) int arg0) {
		this.i();
		this.e = arg0 * 1908064153;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "x", descriptor = "(I)V")
	public void x(@OriginalArg(0) int arg0) {
		this.i();
		this.e = arg0 * 1908064153;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "w", descriptor = "(I)V")
	public void w(@OriginalArg(0) int arg0) {
		this.i();
		this.e = arg0 * 1908064153;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "r", descriptor = "(I)V")
	public void r(@OriginalArg(0) int arg0) {
		this.i();
		this.e = arg0 * 1908064153;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "q", descriptor = "(I)V")
	public void q(@OriginalArg(0) int arg0) {
		if (this.u * 544167597 >= this.l.length) {
			this.i();
		}
		this.l[(this.u += 1303280933) * 544167597 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "h", descriptor = "(I)V")
	public void h(@OriginalArg(0) int arg0) {
		if (this.u * 544167597 >= this.l.length) {
			this.i();
		}
		this.l[(this.u += 1303280933) * 544167597 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "(I)V")
	public void d(@OriginalArg(0) int arg0) {
		if (this.u * 544167597 >= this.l.length) {
			this.i();
		}
		this.l[(this.u += 1303280933) * 544167597 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "z", descriptor = "(F)V")
	public void z(@OriginalArg(0) float arg0) {
		if (this.u * 544167597 + 3 >= this.l.length) {
			this.i();
		}
		@Pc(14) int local14 = floatToRawIntBits(arg0);
		this.l[(this.u += 1303280933) * 544167597 - 1] = (byte) (local14 >> 24);
		this.l[(this.u += 1303280933) * 544167597 - 1] = (byte) (local14 >> 16);
		this.l[(this.u += 1303280933) * 544167597 - 1] = (byte) (local14 >> 8);
		this.l[(this.u += 1303280933) * 544167597 - 1] = (byte) local14;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "p", descriptor = "(F)V")
	public void p(@OriginalArg(0) float arg0) {
		if (this.u * 544167597 + 3 >= this.l.length) {
			this.i();
		}
		@Pc(14) int local14 = floatToRawIntBits(arg0);
		this.l[(this.u += 1303280933) * 544167597 - 1] = (byte) (local14 >> 24);
		this.l[(this.u += 1303280933) * 544167597 - 1] = (byte) (local14 >> 16);
		this.l[(this.u += 1303280933) * 544167597 - 1] = (byte) (local14 >> 8);
		this.l[(this.u += 1303280933) * 544167597 - 1] = (byte) local14;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "v", descriptor = "(F)V")
	public void v(@OriginalArg(0) float arg0) {
		if (this.u * 544167597 + 3 >= this.l.length) {
			this.i();
		}
		@Pc(14) int local14 = floatToRawIntBits(arg0);
		this.l[(this.u += 1303280933) * 544167597 - 1] = (byte) (local14 >> 24);
		this.l[(this.u += 1303280933) * 544167597 - 1] = (byte) (local14 >> 16);
		this.l[(this.u += 1303280933) * 544167597 - 1] = (byte) (local14 >> 8);
		this.l[(this.u += 1303280933) * 544167597 - 1] = (byte) local14;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "y", descriptor = "(F)V")
	public void y(@OriginalArg(0) float arg0) {
		if (this.u * 544167597 + 3 >= this.l.length) {
			this.i();
		}
		@Pc(14) int local14 = floatToRawIntBits(arg0);
		this.l[(this.u += 1303280933) * 544167597 - 1] = (byte) local14;
		this.l[(this.u += 1303280933) * 544167597 - 1] = (byte) (local14 >> 8);
		this.l[(this.u += 1303280933) * 544167597 - 1] = (byte) (local14 >> 16);
		this.l[(this.u += 1303280933) * 544167597 - 1] = (byte) (local14 >> 24);
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "n", descriptor = "(F)V")
	public void n(@OriginalArg(0) float arg0) {
		if (this.u * 544167597 + 3 >= this.l.length) {
			this.i();
		}
		@Pc(14) int local14 = floatToRawIntBits(arg0);
		this.l[(this.u += 1303280933) * 544167597 - 1] = (byte) local14;
		this.l[(this.u += 1303280933) * 544167597 - 1] = (byte) (local14 >> 8);
		this.l[(this.u += 1303280933) * 544167597 - 1] = (byte) (local14 >> 16);
		this.l[(this.u += 1303280933) * 544167597 - 1] = (byte) (local14 >> 24);
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "(F)V")
	public void c(@OriginalArg(0) float arg0) {
		if (this.u * 544167597 + 3 >= this.l.length) {
			this.i();
		}
		@Pc(14) int local14 = floatToRawIntBits(arg0);
		this.l[(this.u += 1303280933) * 544167597 - 1] = (byte) local14;
		this.l[(this.u += 1303280933) * 544167597 - 1] = (byte) (local14 >> 8);
		this.l[(this.u += 1303280933) * 544167597 - 1] = (byte) (local14 >> 16);
		this.l[(this.u += 1303280933) * 544167597 - 1] = (byte) (local14 >> 24);
	}
}
