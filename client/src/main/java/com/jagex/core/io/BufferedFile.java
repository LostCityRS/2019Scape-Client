package com.jagex.core.io;

import com.jagex.game.client.FileOnDisk;
import deob.ObfuscatedName;

import java.io.EOFException;
import java.io.IOException;

@ObfuscatedName("abp")
public class BufferedFile {

	@ObfuscatedName("abp.n")
	public FileOnDisk fileOnDisk;

	@ObfuscatedName("abp.m")
	public byte[] field8765;

	@ObfuscatedName("abp.k")
	public long field8766 = -1L;

	@ObfuscatedName("abp.f")
	public int field8764;

	@ObfuscatedName("abp.w")
	public byte[] field8768;

	@ObfuscatedName("abp.l")
	public long field8769 = -1L;

	@ObfuscatedName("abp.u")
	public int field8770 = 0;

	@ObfuscatedName("abp.z")
	public long field8771;

	@ObfuscatedName("abp.p")
	public long field8763;

	@ObfuscatedName("abp.d")
	public long field8767;

	@ObfuscatedName("abp.c")
	public long field8774;

	public BufferedFile(FileOnDisk arg0, int arg1, int arg2) throws IOException {
		this.fileOnDisk = arg0;
		this.field8767 = this.field8763 = arg0.length();
		this.field8765 = new byte[arg1];
		this.field8768 = new byte[arg2];
		this.field8771 = 0L;
	}

	@ObfuscatedName("abp.e(I)V")
	public void method14834() throws IOException {
		this.method14822();
		this.fileOnDisk.close();
	}

	@ObfuscatedName("abp.n(J)V")
	public void method14824(long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException("");
		}
		this.field8771 = arg0;
	}

	@ObfuscatedName("abp.m(B)J")
	public long method14825() {
		return this.field8767;
	}

	@ObfuscatedName("abp.k([BI)V")
	public void method14826(byte[] arg0) throws IOException {
		this.method14827(arg0, 0, arg0.length);
	}

	@ObfuscatedName("abp.f([BIII)V")
	public void method14827(byte[] arg0, int arg1, int arg2) throws IOException {
		try {
			if (arg1 + arg2 > arg0.length) {
				throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
			}
			if (this.field8769 != -1L && this.field8771 >= this.field8769 && this.field8771 + (long) arg2 <= this.field8769 + (long) this.field8770) {
				System.arraycopy(this.field8768, (int) (this.field8771 - this.field8769), arg0, arg1, arg2);
				this.field8771 += arg2;
				return;
			}
			long var4 = this.field8771;
			int var6 = arg1;
			int var7 = arg2;
			if (this.field8771 >= this.field8766 && this.field8771 < this.field8766 + (long) this.field8764) {
				int var8 = (int) ((long) this.field8764 - (this.field8771 - this.field8766));
				if (var8 > arg2) {
					var8 = arg2;
				}
				System.arraycopy(this.field8765, (int) (this.field8771 - this.field8766), arg0, arg1, var8);
				this.field8771 += var8;
				arg1 += var8;
				arg2 -= var8;
			}
			if (arg2 > this.field8765.length) {
				this.fileOnDisk.seek(this.field8771);
				this.field8774 = this.field8771;
				while (arg2 > 0) {
					int var9 = this.fileOnDisk.read(arg0, arg1, arg2);
					if (var9 == -1) {
						break;
					}
					this.field8774 += var9;
					this.field8771 += var9;
					arg1 += var9;
					arg2 -= var9;
				}
			} else if (arg2 > 0) {
				this.method14840();
				int var10 = arg2;
				if (arg2 > this.field8764) {
					var10 = this.field8764;
				}
				System.arraycopy(this.field8765, 0, arg0, arg1, var10);
				arg1 += var10;
				arg2 -= var10;
				this.field8771 += var10;
			}
			if (this.field8769 != -1L) {
				if (this.field8769 > this.field8771 && arg2 > 0) {
					int var11 = (int) (this.field8769 - this.field8771) + arg1;
					if (var11 > arg1 + arg2) {
						var11 = arg1 + arg2;
					}
					while (arg1 < var11) {
						arg0[arg1++] = 0;
						arg2--;
						this.field8771++;
					}
				}
				long var12 = -1L;
				long var14 = -1L;
				if (this.field8769 >= var4 && this.field8769 < (long) var7 + var4) {
					var12 = this.field8769;
				} else if (var4 >= this.field8769 && var4 < this.field8769 + (long) this.field8770) {
					var12 = var4;
				}
				if (this.field8769 + (long) this.field8770 > var4 && this.field8769 + (long) this.field8770 <= (long) var7 + var4) {
					var14 = this.field8769 + (long) this.field8770;
				} else if ((long) var7 + var4 > this.field8769 && (long) var7 + var4 <= this.field8769 + (long) this.field8770) {
					var14 = (long) var7 + var4;
				}
				if (var12 > -1L && var14 > var12) {
					int var16 = (int) (var14 - var12);
					System.arraycopy(this.field8768, (int) (var12 - this.field8769), arg0, (int) (var12 - var4) + var6, var16);
					if (var14 > this.field8771) {
						arg2 = (int) ((long) arg2 - (var14 - this.field8771));
						this.field8771 = var14;
					}
				}
			}
		} catch (IOException var18) {
			this.field8774 = -1L;
			throw var18;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@ObfuscatedName("abp.w(B)V")
	public void method14840() throws IOException {
		this.field8764 = 0;
		if (this.field8774 != this.field8771) {
			this.fileOnDisk.seek(this.field8771);
			this.field8774 = this.field8771;
		}
		this.field8766 = this.field8771;
		while (this.field8764 < this.field8765.length) {
			int var1 = this.field8765.length - this.field8764;
			if (var1 > 200000000) {
				var1 = 200000000;
			}
			int var2 = this.fileOnDisk.read(this.field8765, this.field8764, var1);
			if (var2 == -1) {
				break;
			}
			this.field8774 += var2;
			this.field8764 += var2;
		}
	}

	@ObfuscatedName("abp.l([BIII)V")
	public void method14828(byte[] arg0, int arg1, int arg2) throws IOException {
		try {
			if (this.field8771 + (long) arg2 > this.field8767) {
				this.field8767 = this.field8771 + (long) arg2;
			}
			if (this.field8769 != -1L && (this.field8771 < this.field8769 || this.field8771 > this.field8769 + (long) this.field8770)) {
				this.method14822();
			}
			if (this.field8769 != -1L && this.field8771 + (long) arg2 > this.field8769 + (long) this.field8768.length) {
				int var4 = (int) ((long) this.field8768.length - (this.field8771 - this.field8769));
				System.arraycopy(arg0, arg1, this.field8768, (int) (this.field8771 - this.field8769), var4);
				this.field8771 += var4;
				arg1 += var4;
				arg2 -= var4;
				this.field8770 = this.field8768.length;
				this.method14822();
			}
			if (arg2 > this.field8768.length) {
				if (this.field8774 != this.field8771) {
					this.fileOnDisk.seek(this.field8771);
					this.field8774 = this.field8771;
				}
				this.fileOnDisk.write(arg0, arg1, arg2);
				this.field8774 += arg2;
				if (this.field8774 > this.field8763) {
					this.field8763 = this.field8774;
				}
				long var5 = -1L;
				long var7 = -1L;
				if (this.field8771 >= this.field8766 && this.field8771 < this.field8766 + (long) this.field8764) {
					var5 = this.field8771;
				} else if (this.field8766 >= this.field8771 && this.field8766 < this.field8771 + (long) arg2) {
					var5 = this.field8766;
				}
				if (this.field8771 + (long) arg2 > this.field8766 && this.field8771 + (long) arg2 <= this.field8766 + (long) this.field8764) {
					var7 = this.field8771 + (long) arg2;
				} else if (this.field8766 + (long) this.field8764 > this.field8771 && this.field8766 + (long) this.field8764 <= this.field8771 + (long) arg2) {
					var7 = this.field8766 + (long) this.field8764;
				}
				if (var5 > -1L && var7 > var5) {
					int var9 = (int) (var7 - var5);
					System.arraycopy(arg0, (int) ((long) arg1 + var5 - this.field8771), this.field8765, (int) (var5 - this.field8766), var9);
				}
				this.field8771 += arg2;
			} else if (arg2 > 0) {
				if (this.field8769 == -1L) {
					this.field8769 = this.field8771;
				}
				System.arraycopy(arg0, arg1, this.field8768, (int) (this.field8771 - this.field8769), arg2);
				this.field8771 += arg2;
				if (this.field8771 - this.field8769 > (long) this.field8770) {
					this.field8770 = (int) (this.field8771 - this.field8769);
				}
			}
		} catch (IOException var11) {
			this.field8774 = -1L;
			throw var11;
		}
	}

	@ObfuscatedName("abp.u(B)V")
	public void method14822() throws IOException {
		if (this.field8769 == -1L) {
			return;
		}
		if (this.field8774 != this.field8769) {
			this.fileOnDisk.seek(this.field8769);
			this.field8774 = this.field8769;
		}
		this.fileOnDisk.write(this.field8768, 0, this.field8770);
		this.field8774 += (long) (this.field8770);
		if (this.field8774 > this.field8763) {
			this.field8763 = this.field8774;
		}
		long var1 = -1L;
		long var3 = -1L;
		if (this.field8769 >= this.field8766 && this.field8769 < this.field8766 + (long) this.field8764) {
			var1 = this.field8769;
		} else if (this.field8766 >= this.field8769 && this.field8766 < this.field8769 + (long) this.field8770) {
			var1 = this.field8766;
		}
		if (this.field8769 + (long) this.field8770 > this.field8766 && this.field8769 + (long) this.field8770 <= this.field8766 + (long) this.field8764) {
			var3 = this.field8769 + (long) this.field8770;
		} else if (this.field8766 + (long) this.field8764 > this.field8769 && this.field8766 + (long) this.field8764 <= this.field8769 + (long) this.field8770) {
			var3 = this.field8766 + (long) this.field8764;
		}
		if (var1 > -1L && var3 > var1) {
			int var5 = (int) (var3 - var1);
			System.arraycopy(this.field8768, (int) (var1 - this.field8769), this.field8765, (int) (var1 - this.field8766), var5);
		}
		this.field8769 = -1L;
		this.field8770 = 0;
	}
}
