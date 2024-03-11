package com.jagex.game.client;

import deob.ObfuscatedName;

import java.applet.Applet;
import java.awt.*;

@ObfuscatedName("se")
public interface GameShellStub {

	void stop();

	void init();

	void destroy();

	void update(Graphics arg0);

	void paint(Graphics arg0);

	void supplyApplet(Applet arg0);

	void start();
}
