package com.jagex.game.client;

import com.jagex.core.datastruct.LinkList;
import com.jagex.core.utils.MonotonicTime;
import com.jagex.game.shared.framework.input.Mouse;
import deob.ObfuscatedName;

import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

@ObfuscatedName("alb")
public class JavaMouse extends Mouse implements MouseListener, MouseMotionListener, MouseWheelListener {

	@ObfuscatedName("alb.k")
	public int field11689;

	@ObfuscatedName("alb.f")
	public int field11690;

	@ObfuscatedName("alb.w")
	public int field11692;

	@ObfuscatedName("alb.l")
	public LinkList field11695 = new LinkList();

	@ObfuscatedName("alb.u")
	public int field11693;

	@ObfuscatedName("alb.z")
	public int field11694;

	@ObfuscatedName("alb.p")
	public int field11698;

	@ObfuscatedName("alb.d")
	public LinkList field11696 = new LinkList();

	@ObfuscatedName("alb.c")
	public java.awt.Component field11697;

	@ObfuscatedName("alb.r")
	public boolean field11687;

	public JavaMouse(java.awt.Component arg0, boolean arg1) {
		this.method18295(arg0);
		this.field11687 = arg1;
	}

	@ObfuscatedName("alb.ao(Ljava/awt/Component;I)V")
	public void method18295(java.awt.Component arg0) {
		this.method18297();
		this.field11697 = arg0;
		this.field11697.addMouseListener(this);
		this.field11697.addMouseMotionListener(this);
		this.field11697.addMouseWheelListener(this);
	}

	@ObfuscatedName("alb.aj(B)V")
	public void method18297() {
		if (this.field11697 == null) {
			return;
		}
		this.field11697.removeMouseWheelListener(this);
		this.field11697.removeMouseMotionListener(this);
		this.field11697.removeMouseListener(this);
		this.field11697 = null;
		this.field11692 = 0;
		this.field11690 = 0;
		this.field11689 = 0;
		this.field11698 = 0;
		this.field11694 = 0;
		this.field11693 = 0;
		this.field11695 = null;
		this.field11696 = null;
	}

	@ObfuscatedName("alb.ay(IIIIB)V")
	public void method18303(int arg0, int arg1, int arg2, int arg3) {
		BasicMouseEvent var5 = BasicMouseEvent.method8438(arg0, arg1, arg2, MonotonicTime.get(), arg3);
        this.field11696.addTail(var5);
	}

	@ObfuscatedName("alb.ab(III)V")
	public void method18293(int arg0, int arg1) {
		this.field11693 = arg0;
		this.field11694 = arg1;
		if (this.field11687) {
			this.method18303(-1, arg0, arg1, 0);
		}
	}

	@ObfuscatedName("alb.p(I)Lakm;")
	public MouseEvent pollEvent() {
		return (MouseEvent) this.field11695.removeHead();
	}

	@ObfuscatedName("alb.m(I)V")
	public synchronized void method9087() {
		this.field11689 = this.field11693;
		this.field11690 = this.field11694;
		this.field11692 = this.field11698;
		LinkList var1 = this.field11695;
		this.field11695 = this.field11696;
		this.field11696 = var1;
		this.field11696.removeAll();
	}

	@ObfuscatedName("alb.k(B)Z")
	public boolean method9101() {
		return (this.field11692 & 0x1) != 0;
	}

	@ObfuscatedName("alb.f(I)Z")
	public boolean method9121() {
		return (this.field11692 & 0x2) != 0;
	}

	@ObfuscatedName("alb.w(I)Z")
	public boolean method9125() {
		return (this.field11692 & 0x4) != 0;
	}

	@ObfuscatedName("alb.u(I)I")
	public int getX() {
		return this.field11689;
	}

	@ObfuscatedName("alb.z(I)I")
	public int getY() {
		return this.field11690;
	}

	@ObfuscatedName("alb.d(I)V")
	public void unbind() {
		this.method18297();
	}

	public synchronized void mouseClicked(java.awt.event.MouseEvent arg0) {
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	public synchronized void mouseEntered(java.awt.event.MouseEvent arg0) {
		this.method18293(arg0.getX(), arg0.getY());
	}

	public synchronized void mouseExited(java.awt.event.MouseEvent arg0) {
		this.method18293(arg0.getX(), arg0.getY());
	}

	@ObfuscatedName("alb.az(Ljava/awt/event/MouseEvent;B)I")
	public int method18294(java.awt.event.MouseEvent arg0) {
		if (arg0.getButton() == 1) {
			return arg0.isMetaDown() ? 4 : 1;
		} else if (arg0.getButton() == 2) {
			return 2;
		} else if (arg0.getButton() == 3) {
			return 4;
		} else {
			return 0;
		}
	}

	public synchronized void mousePressed(java.awt.event.MouseEvent arg0) {
		int var2 = this.method18294(arg0);
		if (var2 == 1) {
			this.method18303(0, arg0.getX(), arg0.getY(), arg0.getClickCount());
		} else if (var2 == 4) {
			this.method18303(2, arg0.getX(), arg0.getY(), arg0.getClickCount());
		} else if (var2 == 2) {
			this.method18303(1, arg0.getX(), arg0.getY(), arg0.getClickCount());
		}
		this.field11698 |= var2;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	public synchronized void mouseReleased(java.awt.event.MouseEvent arg0) {
		int var2 = this.method18294(arg0);
		if ((this.field11698 & var2) == 0) {
			var2 = this.field11698;
		}
		if ((var2 & 0x1) != 0) {
			this.method18303(3, arg0.getX(), arg0.getY(), arg0.getClickCount());
		}
		if ((var2 & 0x4) != 0) {
			this.method18303(5, arg0.getX(), arg0.getY(), arg0.getClickCount());
		}
		if ((var2 & 0x2) != 0) {
			this.method18303(4, arg0.getX(), arg0.getY(), arg0.getClickCount());
		}
		this.field11698 &= ~var2;
		if (arg0.isPopupTrigger()) {
			arg0.consume();
		}
	}

	public synchronized void mouseDragged(java.awt.event.MouseEvent arg0) {
		this.method18293(arg0.getX(), arg0.getY());
	}

	public synchronized void mouseMoved(java.awt.event.MouseEvent arg0) {
		this.method18293(arg0.getX(), arg0.getY());
	}

	public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
		int var2 = arg0.getX();
		int var3 = arg0.getY();
		int var4 = arg0.getWheelRotation();
		this.method18303(6, var2, var3, var4);
		arg0.consume();
	}
}
