package com.jagex.game.client;

import com.jagex.core.datastruct.LinkList;
import com.jagex.core.utils.Cp1252;
import com.jagex.core.utils.MonotonicTime;
import com.jagex.game.shared.framework.input.Keyboard;
import deob.ObfuscatedName;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("alg")
public final class JavaKeyboard extends Keyboard implements KeyListener, FocusListener {

	@ObfuscatedName("alg.do")
	public LinkList field11681 = new LinkList();

	@ObfuscatedName("alg.dz")
	public LinkList field11682 = new LinkList();

	@ObfuscatedName("alg.dv")
	public boolean[] field11683 = new boolean[112];

	@ObfuscatedName("alg.dm")
	public java.awt.Component field11684;

	@ObfuscatedName("alg.dq")
	public static int[] field11680 = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 85, 80, 84, 0, 91, 0, 0, 0, 81, 82, 86, 0, 0, 0, 0, 0, 0, 0, 0, 13, 0, 0, 0, 0, 83, 104, 105, 103, 102, 96, 98, 97, 99, 0, 0, 0, 0, 0, 0, 0, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, 0, 0, 0, 0, 0, 0, 0, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, 0, 0, 0, 0, 0, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, 89, 87, 0, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0, 0, 0, 101, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 0, 0, 0, 0, 0, 0, 150, 151, 152, 153, 0, 100, 0, 0, 0, 0, 160, 161, 162, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

	@ObfuscatedName("acs.s(I)V")
	public static void method15142() {
		field11680[44] = 71;
		field11680[45] = 26;
		field11680[46] = 72;
		field11680[47] = 73;
		field11680[59] = 57;
		field11680[61] = 27;
		field11680[91] = 42;
		field11680[92] = 74;
		field11680[93] = 43;
		field11680[192] = 28;
		field11680[222] = 58;
		field11680[520] = 59;
	}

	public JavaKeyboard(java.awt.Component arg0) {
		method15142();
		this.method18262(arg0);
	}

	@ObfuscatedName("alg.y(Ljava/awt/Component;I)V")
	public void method18262(java.awt.Component arg0) {
		this.method18263();
		this.field11684 = arg0;
		this.field11684.addKeyListener(this);
		this.field11684.addFocusListener(this);
	}

	@ObfuscatedName("alg.q(I)V")
	public void method18263() {
		if (this.field11684 == null) {
			return;
		}
		this.field11684.removeKeyListener(this);
		this.field11684.removeFocusListener(this);
		this.field11684 = null;
		for (int var1 = 0; var1 < 112; var1++) {
			this.field11683[var1] = false;
		}
		this.field11681.removeAll();
		this.field11682.removeAll();
	}

	@ObfuscatedName("alg.x(ICII)V")
	public void method18264(int arg0, char arg1, int arg2) {
		BasicKeyboardEvent var4 = new BasicKeyboardEvent();
		var4.field11466 = arg0;
		var4.field11464 = arg1;
		var4.field11465 = arg2;
		var4.field11462 = MonotonicTime.get();
		this.field11682.addTail(var4);
	}

	@ObfuscatedName("alg.k(I)Lut;")
	public KeyboardEvent method9075() {
		return (KeyboardEvent) this.field11681.removeHead();
	}

	@ObfuscatedName("alg.m(II)Z")
	public boolean keyheld(int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.field11683[arg0] : false;
	}

	@ObfuscatedName("alg.n(I)V")
	public synchronized void method9069() {
		this.field11681.removeAll();
		for (BasicKeyboardEvent var1 = (BasicKeyboardEvent) this.field11682.removeHead(); var1 != null; var1 = (BasicKeyboardEvent) this.field11682.removeHead()) {
			var1.field11467 = this.method18266();
			if (var1.field11466 == 0) {
				if (!this.field11683[var1.field11465]) {
					BasicKeyboardEvent var2 = new BasicKeyboardEvent();
					var2.field11466 = 0;
					var2.field11464 = (char) 65535;
					var2.field11465 = var1.field11465;
					var2.field11462 = var1.field11462;
					var2.field11467 = var1.field11467;
					this.field11681.addTail(var2);
					this.field11683[var1.field11465] = true;
				}
				var1.field11466 = 2;
				this.field11681.addTail(var1);
			} else if (var1.field11466 == 1) {
				if (this.field11683[var1.field11465]) {
					this.field11681.addTail(var1);
					this.field11683[var1.field11465] = false;
				}
			} else if (var1.field11466 == -1) {
				for (int var3 = 0; var3 < 112; var3++) {
					if (this.field11683[var3]) {
						BasicKeyboardEvent var4 = new BasicKeyboardEvent();
						var4.field11466 = 1;
						var4.field11464 = (char) 65535;
						var4.field11465 = var3;
						var4.field11462 = var1.field11462;
						var4.field11467 = var1.field11467;
						this.field11681.addTail(var4);
						this.field11683[var3] = false;
					}
				}
			} else if (var1.field11466 == 3) {
				this.field11681.addTail(var1);
			}
		}
	}

	@ObfuscatedName("alg.b(I)I")
	public int method18266() {
		int var1 = 0;
		if (this.field11683[81]) {
			var1 |= 0x1;
		}
		if (this.field11683[82]) {
			var1 |= 0x4;
		}
		if (this.field11683[86]) {
			var1 |= 0x2;
		}
		return var1;
	}

	@ObfuscatedName("alg.f(I)V")
	public void unbind() {
		this.method18263();
	}

	@ObfuscatedName("alg.h(Ljava/awt/event/KeyEvent;II)V")
	public void method18270(KeyEvent arg0, int arg1) {
		int var3 = arg0.getKeyCode();
		int var5;
		if (var3 == 0) {
			var5 = 0;
		} else if (var3 >= 0 && var3 < field11680.length) {
			int var4 = field11680[var3];
			if (arg1 == 0 && (var4 & 0x80) != 0) {
				var5 = 0;
			} else {
				var5 = var4 & 0xFFFFFF7F;
			}
		} else {
			var5 = 0;
		}
		if (var5 != 0) {
			this.method18264(arg1, (char) 65535, var5);
			arg0.consume();
		}
	}

	public synchronized void keyPressed(KeyEvent arg0) {
		this.method18270(arg0, 0);
	}

	public synchronized void keyReleased(KeyEvent arg0) {
		this.method18270(arg0, 1);
	}

	public synchronized void keyTyped(KeyEvent arg0) {
		char var2 = arg0.getKeyChar();
		if (var2 != 65535 && Cp1252.method231(var2)) {
			this.method18264(3, var2, -1);
			arg0.consume();
		}
	}

	public void focusGained(FocusEvent arg0) {
	}

	public synchronized void focusLost(FocusEvent arg0) {
		this.method18264(-1, '\u0000', 0);
	}
}
