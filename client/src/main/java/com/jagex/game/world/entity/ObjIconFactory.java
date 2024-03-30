package com.jagex.game.world.entity;

import com.jagex.core.datastruct.IterableQueue;
import com.jagex.game.config.iftype.Component;
import com.jagex.graphics.DefaultSprites;
import com.jagex.graphics.Font;
import com.jagex.graphics.FontMetrics;
import com.jagex.graphics.Renderer;
import com.jagex.graphics.SpriteDataProvider;
import deob.ObfuscatedName;
import rs2.client.Client;

import java.awt.*;

@ObfuscatedName("ag")
public class ObjIconFactory {

	@ObfuscatedName("ag.e")
	public static Renderer field630;

	@ObfuscatedName("ag.n")
	public static Font field629;

	@ObfuscatedName("ag.m")
	public static IterableQueue field631 = new IterableQueue();

	public ObjIconFactory() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("y.e(Ldh;Lhf;I)V")
	public static void method539(Renderer arg0, Component arg1) {
		boolean var2 = Client.objTypeList.method18900(arg0, arg1.invobject, arg1.invcount, arg1.outline, arg1.graphicshadow | 0xFF000000, arg1.field2241, arg1.field2246 ? Client.localPlayerEntity.model : null) == null;
		if (var2) {
			field631.pushBack(new ObjIconRequest(arg1.invobject, arg1.invcount, arg1.outline, arg1.graphicshadow | 0xFF000000, arg1.field2241, arg1.field2246));
			Client.method4616(arg1);
		}
	}

	@ObfuscatedName("xk.n(Ldh;S)V")
	public static void method10323(Renderer arg0) {
		if (field631.length() == 0) {
			return;
		}
		if (Client.preferences.displayMode.getValue() == 0) {
			for (ObjIconRequest var1 = (ObjIconRequest) field631.peekFront(); var1 != null; var1 = (ObjIconRequest) field631.prev()) {
				Client.objTypeList.method18905(arg0, arg0, var1.field11256, var1.field11255, var1.field11258, var1.field11257, false, false, var1.field11254, DefaultSprites.p11FullFont, var1.field11259 ? Client.localPlayerEntity.model : null, Client.graphicsDefaults);
				var1.remove();
			}
			Client.method9734();
			return;
		}
		if (field630 == null) {
			Canvas var2 = new Canvas();
			var2.setSize(36, 32);
			field630 = Renderer.create(0, var2, Client.materialList, Client.textureList, Client.basicBillboardTypeList, Client.basicParticleEmitterTypeList, Client.basicParticleEffectorTypeList, Client.shadersJs5, 0);
			field629 = field630.createFont(FontMetrics.createFontMetrics(Client.fontmetricsJs5, DefaultSprites.p11_full, 0), SpriteDataProvider.method1609(Client.spritesJs5, DefaultSprites.p11_full, 0), true);
		}
		for (ObjIconRequest var3 = (ObjIconRequest) field631.peekFront(); var3 != null; var3 = (ObjIconRequest) field631.prev()) {
			Client.objTypeList.method18905(field630, arg0, var3.field11256, var3.field11255, var3.field11258, var3.field11257, false, false, var3.field11254, field629, var3.field11259 ? Client.localPlayerEntity.model : null, Client.graphicsDefaults);
			var3.remove();
		}
	}

	@ObfuscatedName("akf.m(I)V")
	public static void method17658() {
		if (field630 != null) {
			field630.dispose();
			field630 = null;
			field629 = null;
		}
	}
}
