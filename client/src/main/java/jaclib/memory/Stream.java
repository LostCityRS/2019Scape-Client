package jaclib.memory;

import deob.ObfuscatedName;

public final class Stream {

	@ObfuscatedName("jaclib/memory/Stream.e")
	public Buffer field403;

	@ObfuscatedName("jaclib/memory/Stream.n")
	public int field404;

	@ObfuscatedName("jaclib/memory/Stream.m")
	public int field405;

	@ObfuscatedName("jaclib/memory/Stream.k")
	public int field406;

	@ObfuscatedName("jaclib/memory/Stream.f")
	public final byte[] field407;

	@ObfuscatedName("jaclib/memory/Stream.w")
	public static final boolean field408 = getLSB(-65536) == -1;

	public Stream() {
		this(4096);
	}

	public Stream(int arg0) {
		this.field407 = new byte[arg0];
	}

	public Stream(Buffer arg0) {
		this(arg0, 0, arg0.method48());
	}

	public Stream(Buffer arg0, int arg1, int arg2) {
		this(arg0.method48() < 4096 ? arg0.method48() : 4096);
		this.method54(arg0, arg1, arg2);
	}

	@ObfuscatedName("jaclib/memory/Stream.e(Ljaclib/memory/Buffer;II)V")
	public void method54(Buffer arg0, int arg1, int arg2) {
		this.method60();
		this.field403 = arg0;
		this.field405 = arg1;
		this.field404 = arg1 + arg2;
		if (this.field404 > arg0.method48()) {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("jaclib/memory/Stream.n()I")
	public int method55() {
		return this.field406 + this.field405;
	}

	@ObfuscatedName("jaclib/memory/Stream.m(I)V")
	public void method56(int arg0) {
		this.method60();
		this.field405 = arg0;
	}

	@ObfuscatedName("jaclib/memory/Stream.k(I)V")
	public void method57(int arg0) {
		if (this.field406 >= this.field407.length) {
			this.method60();
		}
		this.field407[++this.field406 - 1] = (byte) arg0;
	}

	@ObfuscatedName("jaclib/memory/Stream.f(F)V")
	public void method58(float arg0) {
		if (this.field406 + 3 >= this.field407.length) {
			this.method60();
		}
		int var2 = floatToRawIntBits(arg0);
		this.field407[++this.field406 - 1] = (byte) (var2 >> 24);
		this.field407[++this.field406 - 1] = (byte) (var2 >> 16);
		this.field407[++this.field406 - 1] = (byte) (var2 >> 8);
		this.field407[++this.field406 - 1] = (byte) var2;
	}

	@ObfuscatedName("jaclib/memory/Stream.w(F)V")
	public void method59(float arg0) {
		if (this.field406 + 3 >= this.field407.length) {
			this.method60();
		}
		int var2 = floatToRawIntBits(arg0);
		this.field407[++this.field406 - 1] = (byte) var2;
		this.field407[++this.field406 - 1] = (byte) (var2 >> 8);
		this.field407[++this.field406 - 1] = (byte) (var2 >> 16);
		this.field407[++this.field406 - 1] = (byte) (var2 >> 24);
	}

	@ObfuscatedName("jaclib/memory/Stream.l()V")
	public void method60() {
		if (this.field406 <= 0) {
			return;
		}
		if (this.field406 + this.field405 > this.field404) {
			throw new RuntimeException();
		}
		this.field403.method8(this.field407, 0, this.field405, this.field406);
		this.field405 += this.field406;
		this.field406 = 0;
	}

	@ObfuscatedName("jaclib/memory/Stream.u()Z")
	public static final boolean method61() {
		return field408;
	}

	public static native int floatToRawIntBits(float arg0);

	public static final native byte getLSB(int arg0);
}
