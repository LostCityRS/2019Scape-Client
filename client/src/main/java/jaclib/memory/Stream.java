package jaclib.memory;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaclib/memory/Stream")
public final class Stream {

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "w", descriptor = "Z")
	private static final boolean aBoolean731 = getLSB(-65536) == -1;

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "Lclient!jaclib/memory/Buffer;")
	private Buffer aBuffer4;

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "n", descriptor = "I")
	private int anInt4262;

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "m", descriptor = "I")
	private int anInt4263;

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "k", descriptor = "I")
	private int anInt4264;

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "f", descriptor = "[B")
	private final byte[] aByteArray86;

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "u", descriptor = "()Z")
	public static boolean method27827() {
		return aBoolean731;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "floatToRawIntBits", descriptor = "(F)I")
	public static native int floatToRawIntBits(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "getLSB", descriptor = "(I)B")
	private static native byte getLSB(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "t", descriptor = "()Z")
	public static boolean method27845() {
		return aBoolean731;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "()V")
	public Stream() {
		this(4096);
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(I)V")
	private Stream(@OriginalArg(0) int arg0) {
		this.aByteArray86 = new byte[arg0];
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Lclient!jaclib/memory/Buffer;)V")
	public Stream(@OriginalArg(0) Buffer arg0) {
		this(arg0, 0, arg0.method27895());
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "<init>", descriptor = "(Lclient!jaclib/memory/Buffer;II)V")
	private Stream(@OriginalArg(0) Buffer arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this(arg0.method27895() < 4096 ? arg0.method27895() : 4096);
		this.method27820(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "e", descriptor = "(Lclient!jaclib/memory/Buffer;II)V")
	private void method27820(@OriginalArg(0) Buffer arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method27826();
		this.aBuffer4 = arg0;
		this.anInt4263 = arg1 * -147005843;
		this.anInt4262 = (arg1 + arg2) * -839734555;
		if (this.anInt4262 * -1562770707 > arg0.method27895()) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "n", descriptor = "()I")
	public int method27821() {
		return this.anInt4264 * -966196205 + this.anInt4263 * -932586651;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "m", descriptor = "(I)V")
	public void method27822(@OriginalArg(0) int arg0) {
		this.method27826();
		this.anInt4263 = arg0 * -147005843;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "k", descriptor = "(I)V")
	public void method27823(@OriginalArg(0) int arg0) {
		if (this.anInt4264 * -966196205 >= this.aByteArray86.length) {
			this.method27826();
		}
		this.aByteArray86[(this.anInt4264 += -283154917) * -966196205 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "f", descriptor = "(F)V")
	public void method27824(@OriginalArg(0) float arg0) {
		if (this.anInt4264 * -966196205 + 3 >= this.aByteArray86.length) {
			this.method27826();
		}
		@Pc(14) int local14 = floatToRawIntBits(arg0);
		this.aByteArray86[(this.anInt4264 += -283154917) * -966196205 - 1] = (byte) (local14 >> 24);
		this.aByteArray86[(this.anInt4264 += -283154917) * -966196205 - 1] = (byte) (local14 >> 16);
		this.aByteArray86[(this.anInt4264 += -283154917) * -966196205 - 1] = (byte) (local14 >> 8);
		this.aByteArray86[(this.anInt4264 += -283154917) * -966196205 - 1] = (byte) local14;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "w", descriptor = "(F)V")
	public void method27825(@OriginalArg(0) float arg0) {
		if (this.anInt4264 * -966196205 + 3 >= this.aByteArray86.length) {
			this.method27826();
		}
		@Pc(14) int local14 = floatToRawIntBits(arg0);
		this.aByteArray86[(this.anInt4264 += -283154917) * -966196205 - 1] = (byte) local14;
		this.aByteArray86[(this.anInt4264 += -283154917) * -966196205 - 1] = (byte) (local14 >> 8);
		this.aByteArray86[(this.anInt4264 += -283154917) * -966196205 - 1] = (byte) (local14 >> 16);
		this.aByteArray86[(this.anInt4264 += -283154917) * -966196205 - 1] = (byte) (local14 >> 24);
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "l", descriptor = "()V")
	public void method27826() {
		if (this.anInt4264 * -966196205 <= 0) {
			return;
		}
		if (this.anInt4263 * -932586651 + this.anInt4264 * -966196205 > this.anInt4262 * -1562770707) {
			throw new RuntimeException();
		}
		this.aBuffer4.method27897(this.aByteArray86, 0, this.anInt4263 * -932586651, this.anInt4264 * -966196205);
		this.anInt4263 += this.anInt4264 * -709675497;
		this.anInt4264 = 0;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "z", descriptor = "(Lclient!jaclib/memory/Buffer;II)V")
	private void method27828(@OriginalArg(0) Buffer arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method27826();
		this.aBuffer4 = arg0;
		this.anInt4263 = arg1 * -147005843;
		this.anInt4262 = (arg1 + arg2) * -839734555;
		if (this.anInt4262 * -1562770707 > arg0.method27895()) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "p", descriptor = "(Lclient!jaclib/memory/Buffer;II)V")
	private void method27829(@OriginalArg(0) Buffer arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method27826();
		this.aBuffer4 = arg0;
		this.anInt4263 = arg1 * -147005843;
		this.anInt4262 = (arg1 + arg2) * -839734555;
		if (this.anInt4262 * -1562770707 > arg0.method27895()) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "d", descriptor = "()I")
	public int method27830() {
		return this.anInt4264 * -966196205 + this.anInt4263 * -932586651;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "c", descriptor = "()I")
	public int method27831() {
		return this.anInt4264 * -966196205 + this.anInt4263 * -932586651;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "r", descriptor = "()I")
	public int method27832() {
		return this.anInt4264 * -966196205 + this.anInt4263 * -932586651;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "v", descriptor = "(I)V")
	public void method27833(@OriginalArg(0) int arg0) {
		this.method27826();
		this.anInt4263 = arg0 * -147005843;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "o", descriptor = "(I)V")
	public void method27834(@OriginalArg(0) int arg0) {
		if (this.anInt4264 * -966196205 >= this.aByteArray86.length) {
			this.method27826();
		}
		this.aByteArray86[(this.anInt4264 += -283154917) * -966196205 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "s", descriptor = "(I)V")
	public void method27835(@OriginalArg(0) int arg0) {
		if (this.anInt4264 * -966196205 >= this.aByteArray86.length) {
			this.method27826();
		}
		this.aByteArray86[(this.anInt4264 += -283154917) * -966196205 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "y", descriptor = "(I)V")
	public void method27836(@OriginalArg(0) int arg0) {
		if (this.anInt4264 * -966196205 >= this.aByteArray86.length) {
			this.method27826();
		}
		this.aByteArray86[(this.anInt4264 += -283154917) * -966196205 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "q", descriptor = "(I)V")
	public void method27837(@OriginalArg(0) int arg0) {
		if (this.anInt4264 * -966196205 >= this.aByteArray86.length) {
			this.method27826();
		}
		this.aByteArray86[(this.anInt4264 += -283154917) * -966196205 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "x", descriptor = "(F)V")
	public void method27838(@OriginalArg(0) float arg0) {
		if (this.anInt4264 * -966196205 + 3 >= this.aByteArray86.length) {
			this.method27826();
		}
		@Pc(14) int local14 = floatToRawIntBits(arg0);
		this.aByteArray86[(this.anInt4264 += -283154917) * -966196205 - 1] = (byte) local14;
		this.aByteArray86[(this.anInt4264 += -283154917) * -966196205 - 1] = (byte) (local14 >> 8);
		this.aByteArray86[(this.anInt4264 += -283154917) * -966196205 - 1] = (byte) (local14 >> 16);
		this.aByteArray86[(this.anInt4264 += -283154917) * -966196205 - 1] = (byte) (local14 >> 24);
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "b", descriptor = "(F)V")
	public void method27839(@OriginalArg(0) float arg0) {
		if (this.anInt4264 * -966196205 + 3 >= this.aByteArray86.length) {
			this.method27826();
		}
		@Pc(14) int local14 = floatToRawIntBits(arg0);
		this.aByteArray86[(this.anInt4264 += -283154917) * -966196205 - 1] = (byte) local14;
		this.aByteArray86[(this.anInt4264 += -283154917) * -966196205 - 1] = (byte) (local14 >> 8);
		this.aByteArray86[(this.anInt4264 += -283154917) * -966196205 - 1] = (byte) (local14 >> 16);
		this.aByteArray86[(this.anInt4264 += -283154917) * -966196205 - 1] = (byte) (local14 >> 24);
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "h", descriptor = "(F)V")
	public void method27840(@OriginalArg(0) float arg0) {
		if (this.anInt4264 * -966196205 + 3 >= this.aByteArray86.length) {
			this.method27826();
		}
		@Pc(14) int local14 = floatToRawIntBits(arg0);
		this.aByteArray86[(this.anInt4264 += -283154917) * -966196205 - 1] = (byte) local14;
		this.aByteArray86[(this.anInt4264 += -283154917) * -966196205 - 1] = (byte) (local14 >> 8);
		this.aByteArray86[(this.anInt4264 += -283154917) * -966196205 - 1] = (byte) (local14 >> 16);
		this.aByteArray86[(this.anInt4264 += -283154917) * -966196205 - 1] = (byte) (local14 >> 24);
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "a", descriptor = "(F)V")
	public void method27841(@OriginalArg(0) float arg0) {
		if (this.anInt4264 * -966196205 + 3 >= this.aByteArray86.length) {
			this.method27826();
		}
		@Pc(14) int local14 = floatToRawIntBits(arg0);
		this.aByteArray86[(this.anInt4264 += -283154917) * -966196205 - 1] = (byte) local14;
		this.aByteArray86[(this.anInt4264 += -283154917) * -966196205 - 1] = (byte) (local14 >> 8);
		this.aByteArray86[(this.anInt4264 += -283154917) * -966196205 - 1] = (byte) (local14 >> 16);
		this.aByteArray86[(this.anInt4264 += -283154917) * -966196205 - 1] = (byte) (local14 >> 24);
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "g", descriptor = "(F)V")
	public void method27842(@OriginalArg(0) float arg0) {
		if (this.anInt4264 * -966196205 + 3 >= this.aByteArray86.length) {
			this.method27826();
		}
		@Pc(14) int local14 = floatToRawIntBits(arg0);
		this.aByteArray86[(this.anInt4264 += -283154917) * -966196205 - 1] = (byte) local14;
		this.aByteArray86[(this.anInt4264 += -283154917) * -966196205 - 1] = (byte) (local14 >> 8);
		this.aByteArray86[(this.anInt4264 += -283154917) * -966196205 - 1] = (byte) (local14 >> 16);
		this.aByteArray86[(this.anInt4264 += -283154917) * -966196205 - 1] = (byte) (local14 >> 24);
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "i", descriptor = "()V")
	public void method27843() {
		if (this.anInt4264 * -966196205 <= 0) {
			return;
		}
		if (this.anInt4263 * -932586651 + this.anInt4264 * -966196205 > this.anInt4262 * -1562770707) {
			throw new RuntimeException();
		}
		this.aBuffer4.method27897(this.aByteArray86, 0, this.anInt4263 * -932586651, this.anInt4264 * -966196205);
		this.anInt4263 += this.anInt4264 * -709675497;
		this.anInt4264 = 0;
	}

	@OriginalMember(owner = "client!jaclib/memory/Stream", name = "j", descriptor = "()V")
	public void method27844() {
		if (this.anInt4264 * -966196205 <= 0) {
			return;
		}
		if (this.anInt4263 * -932586651 + this.anInt4264 * -966196205 > this.anInt4262 * -1562770707) {
			throw new RuntimeException();
		}
		this.aBuffer4.method27897(this.aByteArray86, 0, this.anInt4263 * -932586651, this.anInt4264 * -966196205);
		this.anInt4263 += this.anInt4264 * -709675497;
		this.anInt4264 = 0;
	}
}
