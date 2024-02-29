package jaclib.memory;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaclib/memory/Stream")
public final class Stream {

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "w", descriptor = "Z")
	private static final boolean w = getLSB(-65536) == -1;

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "Lclient!jaclib/memory/Buffer;")
	private Buffer e;

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "n", descriptor = "I")
	private int n;

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "m", descriptor = "I")
	private int m;

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "k", descriptor = "I")
	private int k;

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "f", descriptor = "[B")
	private final byte[] f;

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "()V", line = 16)
	public Stream() {
		this(4096);
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(I)V", line = 19)
	private Stream(@OriginalArg(0) int arg0) {
		this.f = new byte[arg0];
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Lclient!jaclib/memory/Buffer;)V", line = 24)
	public Stream(@OriginalArg(0) Buffer arg0) {
		this(arg0, 0, arg0.e());
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Lclient!jaclib/memory/Buffer;II)V", line = 28)
	private Stream(@OriginalArg(0) Buffer arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this(arg0.e() < 4096 ? arg0.e() : 4096);
		this.e(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "(Lclient!jaclib/memory/Buffer;II)V", line = 33)
	private void e(@OriginalArg(0) Buffer arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.l();
		this.e = arg0;
		this.m = arg1 * -147005843;
		this.n = (arg1 + arg2) * -839734555;
		if (this.n * -1562770707 > arg0.e()) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "z", descriptor = "(Lclient!jaclib/memory/Buffer;II)V", line = 33)
	private void z(@OriginalArg(0) Buffer arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.l();
		this.e = arg0;
		this.m = arg1 * -147005843;
		this.n = (arg1 + arg2) * -839734555;
		if (this.n * -1562770707 > arg0.e()) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "p", descriptor = "(Lclient!jaclib/memory/Buffer;II)V", line = 33)
	private void p(@OriginalArg(0) Buffer arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.l();
		this.e = arg0;
		this.m = arg1 * -147005843;
		this.n = (arg1 + arg2) * -839734555;
		if (this.n * -1562770707 > arg0.e()) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "n", descriptor = "()I", line = 41)
	public int n() {
		return this.k * -966196205 + this.m * -932586651;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "()I", line = 41)
	public int d() {
		return this.k * -966196205 + this.m * -932586651;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "()I", line = 41)
	public int c() {
		return this.k * -966196205 + this.m * -932586651;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "r", descriptor = "()I", line = 41)
	public int r() {
		return this.k * -966196205 + this.m * -932586651;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "m", descriptor = "(I)V", line = 45)
	public void m(@OriginalArg(0) int arg0) {
		this.l();
		this.m = arg0 * -147005843;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "v", descriptor = "(I)V", line = 45)
	public void v(@OriginalArg(0) int arg0) {
		this.l();
		this.m = arg0 * -147005843;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "k", descriptor = "(I)V", line = 50)
	public void k(@OriginalArg(0) int arg0) {
		if (this.k * -966196205 >= this.f.length) {
			this.l();
		}
		this.f[(this.k += -283154917) * -966196205 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "o", descriptor = "(I)V", line = 50)
	public void o(@OriginalArg(0) int arg0) {
		if (this.k * -966196205 >= this.f.length) {
			this.l();
		}
		this.f[(this.k += -283154917) * -966196205 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "s", descriptor = "(I)V", line = 50)
	public void s(@OriginalArg(0) int arg0) {
		if (this.k * -966196205 >= this.f.length) {
			this.l();
		}
		this.f[(this.k += -283154917) * -966196205 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "y", descriptor = "(I)V", line = 50)
	public void y(@OriginalArg(0) int arg0) {
		if (this.k * -966196205 >= this.f.length) {
			this.l();
		}
		this.f[(this.k += -283154917) * -966196205 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "q", descriptor = "(I)V", line = 50)
	public void q(@OriginalArg(0) int arg0) {
		if (this.k * -966196205 >= this.f.length) {
			this.l();
		}
		this.f[(this.k += -283154917) * -966196205 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "f", descriptor = "(F)V", line = 55)
	public void f(@OriginalArg(0) float arg0) {
		if (this.k * -966196205 + 3 >= this.f.length) {
			this.l();
		}
		@Pc(14) int local14 = floatToRawIntBits(arg0);
		this.f[(this.k += -283154917) * -966196205 - 1] = (byte) (local14 >> 24);
		this.f[(this.k += -283154917) * -966196205 - 1] = (byte) (local14 >> 16);
		this.f[(this.k += -283154917) * -966196205 - 1] = (byte) (local14 >> 8);
		this.f[(this.k += -283154917) * -966196205 - 1] = (byte) local14;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "w", descriptor = "(F)V", line = 64)
	public void w(@OriginalArg(0) float arg0) {
		if (this.k * -966196205 + 3 >= this.f.length) {
			this.l();
		}
		@Pc(14) int local14 = floatToRawIntBits(arg0);
		this.f[(this.k += -283154917) * -966196205 - 1] = (byte) local14;
		this.f[(this.k += -283154917) * -966196205 - 1] = (byte) (local14 >> 8);
		this.f[(this.k += -283154917) * -966196205 - 1] = (byte) (local14 >> 16);
		this.f[(this.k += -283154917) * -966196205 - 1] = (byte) (local14 >> 24);
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "x", descriptor = "(F)V", line = 64)
	public void x(@OriginalArg(0) float arg0) {
		if (this.k * -966196205 + 3 >= this.f.length) {
			this.l();
		}
		@Pc(14) int local14 = floatToRawIntBits(arg0);
		this.f[(this.k += -283154917) * -966196205 - 1] = (byte) local14;
		this.f[(this.k += -283154917) * -966196205 - 1] = (byte) (local14 >> 8);
		this.f[(this.k += -283154917) * -966196205 - 1] = (byte) (local14 >> 16);
		this.f[(this.k += -283154917) * -966196205 - 1] = (byte) (local14 >> 24);
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(F)V", line = 64)
	public void b(@OriginalArg(0) float arg0) {
		if (this.k * -966196205 + 3 >= this.f.length) {
			this.l();
		}
		@Pc(14) int local14 = floatToRawIntBits(arg0);
		this.f[(this.k += -283154917) * -966196205 - 1] = (byte) local14;
		this.f[(this.k += -283154917) * -966196205 - 1] = (byte) (local14 >> 8);
		this.f[(this.k += -283154917) * -966196205 - 1] = (byte) (local14 >> 16);
		this.f[(this.k += -283154917) * -966196205 - 1] = (byte) (local14 >> 24);
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "h", descriptor = "(F)V", line = 64)
	public void h(@OriginalArg(0) float arg0) {
		if (this.k * -966196205 + 3 >= this.f.length) {
			this.l();
		}
		@Pc(14) int local14 = floatToRawIntBits(arg0);
		this.f[(this.k += -283154917) * -966196205 - 1] = (byte) local14;
		this.f[(this.k += -283154917) * -966196205 - 1] = (byte) (local14 >> 8);
		this.f[(this.k += -283154917) * -966196205 - 1] = (byte) (local14 >> 16);
		this.f[(this.k += -283154917) * -966196205 - 1] = (byte) (local14 >> 24);
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(F)V", line = 64)
	public void a(@OriginalArg(0) float arg0) {
		if (this.k * -966196205 + 3 >= this.f.length) {
			this.l();
		}
		@Pc(14) int local14 = floatToRawIntBits(arg0);
		this.f[(this.k += -283154917) * -966196205 - 1] = (byte) local14;
		this.f[(this.k += -283154917) * -966196205 - 1] = (byte) (local14 >> 8);
		this.f[(this.k += -283154917) * -966196205 - 1] = (byte) (local14 >> 16);
		this.f[(this.k += -283154917) * -966196205 - 1] = (byte) (local14 >> 24);
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "g", descriptor = "(F)V", line = 64)
	public void g(@OriginalArg(0) float arg0) {
		if (this.k * -966196205 + 3 >= this.f.length) {
			this.l();
		}
		@Pc(14) int local14 = floatToRawIntBits(arg0);
		this.f[(this.k += -283154917) * -966196205 - 1] = (byte) local14;
		this.f[(this.k += -283154917) * -966196205 - 1] = (byte) (local14 >> 8);
		this.f[(this.k += -283154917) * -966196205 - 1] = (byte) (local14 >> 16);
		this.f[(this.k += -283154917) * -966196205 - 1] = (byte) (local14 >> 24);
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "l", descriptor = "()V", line = 73)
	public void l() {
		if (this.k * -966196205 <= 0) {
			return;
		}
		if (this.m * -932586651 + this.k * -966196205 > this.n * -1562770707) {
			throw new RuntimeException();
		}
		this.e.m(this.f, 0, this.m * -932586651, this.k * -966196205);
		this.m += this.k * -709675497;
		this.k = 0;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "i", descriptor = "()V", line = 73)
	public void i() {
		if (this.k * -966196205 <= 0) {
			return;
		}
		if (this.m * -932586651 + this.k * -966196205 > this.n * -1562770707) {
			throw new RuntimeException();
		}
		this.e.m(this.f, 0, this.m * -932586651, this.k * -966196205);
		this.m += this.k * -709675497;
		this.k = 0;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "j", descriptor = "()V", line = 73)
	public void j() {
		if (this.k * -966196205 <= 0) {
			return;
		}
		if (this.m * -932586651 + this.k * -966196205 > this.n * -1562770707) {
			throw new RuntimeException();
		}
		this.e.m(this.f, 0, this.m * -932586651, this.k * -966196205);
		this.m += this.k * -709675497;
		this.k = 0;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "u", descriptor = "()Z", line = 82)
	public static final boolean u() {
		return w;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "t", descriptor = "()Z", line = 82)
	public static final boolean t() {
		return w;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "floatToRawIntBits", descriptor = "(F)I")
	public static native int floatToRawIntBits(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "getLSB", descriptor = "(I)B")
	private static final native byte getLSB(@OriginalArg(0) int arg0);
}
