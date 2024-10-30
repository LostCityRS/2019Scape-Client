package com.jagex.game.client;

import deob.ObfuscatedName;
import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

@ObfuscatedName("atu")
public class GameCanvas extends Canvas {

	@ObfuscatedName("atu.e")
	public Component field12487;

	public GameCanvas(Component arg0) {
		this.field12487 = arg0;
	}

	public final void update(Graphics arg0) {
		this.field12487.update(arg0);
	}

	public final void paint(Graphics arg0) {
		this.field12487.paint(arg0);
	}
}
