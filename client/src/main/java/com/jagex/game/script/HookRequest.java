package com.jagex.game.script;

import com.jagex.core.datastruct.Node;
import com.jagex.game.config.iftype.Component;
import deob.ObfuscatedName;

@ObfuscatedName("als")
public class HookRequest extends Node {

	@ObfuscatedName("als.k")
	public Object[] onop;

	@ObfuscatedName("als.f")
	public boolean isMouseHook;

	@ObfuscatedName("als.w")
	public Component component;

	@ObfuscatedName("als.l")
	public int mouseX;

	@ObfuscatedName("als.u")
	public int mouseY;

	@ObfuscatedName("als.z")
	public int opindex;

	@ObfuscatedName("als.p")
	public Component drop;

	@ObfuscatedName("als.d")
	public int key;

	@ObfuscatedName("als.c")
	public int keychar;

	@ObfuscatedName("als.r")
	public String opbase;

	@ObfuscatedName("als.v")
	public int nestedCount;
}
