package com.jagex.graphics.gl;

import com.jagex.core.datastruct.SoftLruHashTable;
import com.jagex.game.client.DataType;
import com.jagex.graphics.*;
import deob.ObfuscatedName;

@ObfuscatedName("ca")
public class GlRelated2 {

	@ObfuscatedName("ca.e")
	public final GlToolkit field1187;

	@ObfuscatedName("ca.n")
	public final TextureList field1186;

	@ObfuscatedName("ca.m")
	public final SoftLruHashTable field1185 = new SoftLruHashTable(10485760, 256);

	public GlRelated2(GlToolkit arg0, TextureList arg1) {
		this.field1187 = arg0;
		this.field1186 = arg1;
	}

	@ObfuscatedName("ca.e(Ldv;)Ladt;")
	public GlTexture_Sub1 method1404(Material arg0) {
		return this.method1398(arg0, arg0.size);
	}

	@ObfuscatedName("ca.n(Ldv;I)Ladt;")
	public GlTexture_Sub1 method1398(Material arg0, int arg1) {
		GlTexture_Sub1 var3 = (GlTexture_Sub1) this.field1185.get((long) arg0.field1329);
		if (var3 != null) {
			return var3;
		} else if (this.method1397(TextureRelated2.field7586, arg0, arg1)) {
			if (arg1 == -1) {
				arg1 = arg0.size;
			}
			GlTexture_Sub1 var5;
			if (arg0.field1336 && this.field1187.isBloomEnabled()) {
				float[] var4 = this.field1186.method1984(TextureRelated2.field7586, arg0.diffuseTexture, arg0.field1302, 0.7F, arg1, arg1, false);
				var5 = new GlTexture_Sub1(this.field1187, 3553, TextureFormat.RGBA, DataType.FLOAT_16, arg1, arg1, arg0.field1332 != 0, var4, TextureFormat.RGBA);
			} else {
				int[] var6;
				if (MaterialAlphaMode.NONE == arg0.alphaMode && Material.method261(arg0.effect)) {
					var6 = this.field1186.getTexture(TextureRelated2.field7586, arg0.diffuseTexture, 0.7F, arg1, arg1, true);
				} else {
					var6 = this.field1186.getSpecialTexture(TextureRelated2.field7586, arg0.diffuseTexture, 0.7F, arg1, arg1, false);
				}
				var5 = new GlTexture_Sub1(this.field1187, 3553, arg1, arg1, arg0.field1332 != 0, var6, 0, 0, false);
			}
			var5.method15312(arg0.repeatS == 1, arg0.repeatT == 1);
			this.field1185.put(var5, (long) arg0.field1329, arg1 * arg1);
			return var5;
		} else {
			return null;
		}
	}

	@ObfuscatedName("ca.m(Lvk;Ldv;I)Z")
	public boolean method1397(TextureRelated2 arg0, Material arg1, int arg2) {
		if (arg2 == -1) {
			arg2 = arg1.size;
		}
		if (arg1.field1336 && this.field1187.isBloomEnabled()) {
			return this.field1186.loadTexture(arg0, arg1.diffuseTexture, arg1.field1302, TextureRelated1.field7570, 0.7F, arg2, arg2, false);
		} else if (MaterialAlphaMode.NONE == arg1.alphaMode && Material.method261(arg1.effect)) {
			return this.field1186.loadTexture(arg0, arg1.diffuseTexture, -1, TextureRelated1.field7568, 0.7F, arg2, arg2, true);
		} else {
			return this.field1186.loadTexture(arg0, arg1.diffuseTexture, -1, TextureRelated1.field7569, 0.7F, arg2, arg2, false);
		}
	}

	@ObfuscatedName("ca.k()V")
	public void method1402() {
		this.field1185.clean(5);
	}

	@ObfuscatedName("ca.f()V")
	public void method1399() {
		this.field1185.reset();
	}
}
