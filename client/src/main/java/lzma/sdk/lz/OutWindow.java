package lzma.sdk.lz;

import deob.ObfuscatedName;
import java.io.IOException;
import java.io.OutputStream;

@ObfuscatedName("ru")
public class OutWindow {

	@ObfuscatedName("ru.e")
	public byte[] _buffer;

	@ObfuscatedName("ru.n")
	public int _pos;

	@ObfuscatedName("ru.m")
	public int _windowSize = 0;

	@ObfuscatedName("ru.k")
	public int _streamPos;

	@ObfuscatedName("ru.f")
	public OutputStream _stream;

	@ObfuscatedName("ru.e(II)V")
	public void create(int arg0) {
		if (this._buffer == null || this._windowSize != arg0) {
			this._buffer = new byte[arg0];
		}
		this._windowSize = arg0;
		this._pos = 0;
		this._streamPos = 0;
	}

	@ObfuscatedName("ru.n(Ljava/io/OutputStream;S)V")
	public void setStream(OutputStream arg0) throws IOException {
		this.releaseStream();
		this._stream = arg0;
	}

	@ObfuscatedName("ru.m(B)V")
	public void releaseStream() throws IOException {
		this.flush();
		this._stream = null;
	}

	@ObfuscatedName("ru.k(ZI)V")
	public void init(boolean arg0) {
		if (!arg0) {
			this._streamPos = 0;
			this._pos = 0;
		}
	}

	@ObfuscatedName("ru.f(B)V")
	public void flush() throws IOException {
		int var1 = this._pos - this._streamPos;
		if (var1 == 0) {
			return;
		}
		this._stream.write(this._buffer, this._streamPos, var1);
		if (this._pos >= this._windowSize) {
			this._pos = 0;
		}
		this._streamPos = this._pos;
	}

	@ObfuscatedName("ru.w(IIB)V")
	public void copyBlock(int arg0, int arg1) throws IOException {
		int var3 = this._pos - arg0 - 1;
		if (var3 < 0) {
			var3 += this._windowSize;
		}
		while (arg1 != 0) {
			if (var3 >= this._windowSize) {
				var3 = 0;
			}
			this._buffer[++this._pos - 1] = this._buffer[var3++];
			if (this._pos >= this._windowSize) {
				this.flush();
			}
			arg1--;
		}
	}

	@ObfuscatedName("ru.l(BB)V")
	public void putByte(byte arg0) throws IOException {
		this._buffer[++this._pos - 1] = arg0;
		if (this._pos >= this._windowSize) {
			this.flush();
		}
	}

	@ObfuscatedName("ru.u(II)B")
	public byte getByte(int arg0) {
		int var2 = this._pos - arg0 - 1;
		if (var2 < 0) {
			var2 += this._windowSize;
		}
		return this._buffer[var2];
	}
}
