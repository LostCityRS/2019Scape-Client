package com.jagex.game.client;

import com.jagex.core.datastruct.LinkList;
import com.jagex.core.io.Packet;
import deob.ObfuscatedName;
import rs2.client.Client;

import java.util.Iterator;

@ObfuscatedName("xb")
public abstract class MouseLogger {

	@ObfuscatedName("xb.e")
	public final LinkList field7955 = new LinkList();

	@ObfuscatedName("xb.n")
	public long field7952 = -1L;

	@ObfuscatedName("xb.m")
	public long field7953 = -1L;

	@ObfuscatedName("xb.k")
	public int field7954 = -1;

	@ObfuscatedName("xb.f")
	public int field7951 = -1;

	@ObfuscatedName("xb.e(S)V")
	public void method10280() {
		if (this.method10272()) {
			ClientMessage var1 = null;
			int var2 = 0;
			int var3 = 0;
			int var4 = 0;
			Iterator var5 = this.field7955.iterator();
			label102: while (true) {
				while (true) {
					if (!var5.hasNext()) {
						break label102;
					}
					MouseEvent var6 = (MouseEvent) var5.next();
					if (var1 != null && var1.buf.pos - var2 >= 252 - (this.method10263() + 6)) {
						break label102;
					}
					var6.unlink();
					int var7 = var6.getMouseClickY();
					if (var7 < -1) {
						var7 = -1;
					} else if (var7 > 65534) {
						var7 = 65534;
					}
					int var8 = var6.getMouseClickX();
					if (var8 < -1) {
						var8 = -1;
					} else if (var8 > 65534) {
						var8 = 65534;
					}
					if (this.field7954 == var8 && this.field7951 == var7) {
						var6.release();
					} else {
						if (var1 == null) {
							var1 = this.method10267();
							var1.buf.p1(0);
							var2 = var1.buf.pos;
							var1.buf.pos += 2;
							var3 = 0;
							var4 = 0;
						}
						int var9;
						int var10;
						int var11;
						if (this.field7953 == -1L) {
							var9 = var8;
							var10 = var7;
							var11 = Integer.MAX_VALUE;
						} else {
							var9 = var8 - this.field7954;
							var10 = var7 - this.field7951;
							var11 = (int) ((var6.method17834() - this.field7953) / 20L);
							var3 = (int) ((long) var3 + (var6.method17834() - this.field7953) % 20L);
						}
						this.field7954 = var8;
						this.field7951 = var7;
						if (var11 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
							var9 += 32;
							var10 += 32;
							var1.buf.p2((var9 << 6) + (var11 << 12) + var10);
						} else if (var11 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
							var9 += 128;
							var10 += 128;
							var1.buf.p1(var11 + 128);
							var1.buf.p2((var9 << 8) + var10);
						} else if (var11 < 32) {
							var1.buf.p1(var11 + 192);
							if (var8 == -1 || var7 == -1) {
								var1.buf.p4(Integer.MIN_VALUE);
							} else {
								var1.buf.p4(var8 | var7 << 16);
							}
						} else {
							var1.buf.p2((var11 & 0x1FFF) + 57344);
							if (var8 == -1 || var7 == -1) {
								var1.buf.p4(Integer.MIN_VALUE);
							} else {
								var1.buf.p4(var8 | var7 << 16);
							}
						}
						var4++;
						this.method10264(var1.buf, var6);
						this.field7953 = var6.method17834();
						var6.release();
					}
				}
			}
			if (var1 != null) {
				var1.buf.psize1(var1.buf.pos - var2);
				int var12 = var1.buf.pos;
				var1.buf.pos = var2;
				var1.buf.p1(var3 / var4);
				var1.buf.p1(var3 % var4);
				var1.buf.pos = var12;
				Client.gameConnection.queue(var1);
			}
		}
		this.method10270();
	}

	@ObfuscatedName("xb.n(I)V")
	public void method10260() {
		this.field7955.removeAll();
		this.field7952 = -1L;
		this.field7953 = -1L;
		this.field7954 = -1;
		this.field7951 = -1;
	}

	@ObfuscatedName("xb.m(Lakm;I)V")
	public void method10261(MouseEvent arg0) {
		this.field7955.addTail(arg0);
	}

	@ObfuscatedName("xb.k(Lakm;II)I")
	public int method10262(MouseEvent arg0, int arg1) {
		long var3;
		if (this.field7952 == -1L) {
			var3 = arg1;
		} else {
			var3 = arg0.method17834() - this.field7952;
			if (var3 > (long) arg1) {
				var3 = arg1;
			}
		}
		this.field7952 = arg0.method17834();
		return (int) var3;
	}

	@ObfuscatedName("xb.f(I)I")
	public abstract int method10263();

	@ObfuscatedName("xb.w(Lalw;Lakm;I)V")
	public abstract void method10264(Packet arg0, MouseEvent arg1);

	@ObfuscatedName("xb.z(S)Lakl;")
	public abstract ClientMessage method10267();

	@ObfuscatedName("xb.l(I)V")
	public abstract void method10270();

	@ObfuscatedName("xb.u(I)Z")
	public abstract boolean method10272();
}
