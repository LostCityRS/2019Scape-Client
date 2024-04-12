package com.jagex.graphics;

import com.jagex.core.datastruct.LinkList;
import com.jagex.core.datastruct.Node;
import com.jagex.game.client.DataType;
import com.jagex.graphics.gl.GlFrameBuffer;
import com.jagex.graphics.gl.GlTexture_Sub1;
import com.jagex.graphics.gl.GlToolkit;
import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("cv")
public class GlPostProcessing {

	@ObfuscatedName("cv.e")
	public final GlToolkit field1169;

	@ObfuscatedName("cv.n")
	public GlFrameBuffer field1162;

	@ObfuscatedName("cv.m")
	public GlFrameBuffer field1163;

	@ObfuscatedName("cv.k")
	public GlFrameBuffer field1164;

	@ObfuscatedName("cv.f")
	public int field1165 = 0;

	@ObfuscatedName("cv.w")
	public int field1166 = 0;

	@ObfuscatedName("cv.l")
	public int field1177 = 1;

	@ObfuscatedName("cv.u")
	public int field1167 = 1;

	@ObfuscatedName("cv.z")
	public boolean field1180;

	@ObfuscatedName("cv.p")
	public LinkList field1170 = new LinkList();

	@ObfuscatedName("cv.d")
	public boolean field1171 = true;

	@ObfuscatedName("cv.c")
	public boolean field1172 = true;

	@ObfuscatedName("cv.r")
	public boolean field1173 = true;

	@ObfuscatedName("cv.v")
	public boolean field1174 = true;

	@ObfuscatedName("cv.o")
	public GlTexture_Sub1[] field1175 = new GlTexture_Sub1[2];

	@ObfuscatedName("cv.s")
	public PostProcessingRelated field1176;

	@ObfuscatedName("cv.y")
	public GlTexture_Sub1 field1161;

	@ObfuscatedName("cv.q")
	public PostProcessingRelated field1178;

	@ObfuscatedName("cv.x")
	public boolean field1179 = false;

	@ObfuscatedName("cv.b")
	public int field1168 = 0;

	@ObfuscatedName("cv.h")
	public DataType field1181 = DataType.UNSIGNED_INT_8;

	public GlPostProcessing(GlToolkit arg0) {
		this.field1169 = arg0;
		if (this.field1169.field9985 && this.field1169.field9965) {
			this.field1164 = this.field1162 = new GlFrameBuffer(this.field1169);
			if (this.field1169.field9967 > 1 && this.field1169.field9901 && this.field1169.field9987) {
				this.field1164 = this.field1163 = new GlFrameBuffer(this.field1169);
			}
		}
	}

	@ObfuscatedName("cv.e()V")
	public void method1375() {
		this.field1162 = null;
		this.field1163 = null;
		this.field1164 = null;
		this.field1178 = null;
		this.field1161 = null;
		this.field1175 = null;
		this.field1176 = null;
		if (!this.field1170._isEmpty()) {
			for (Node var1 = this.field1170.head(); var1 != this.field1170.sentinel; var1 = var1.next) {
				((PostProcessingFilter) var1).method17570();
			}
		}
		this.field1167 = 1;
		this.field1177 = 1;
	}

	@ObfuscatedName("cv.n()Z")
	public boolean method1363() {
		return this.field1164 != null;
	}

	@ObfuscatedName("cv.m()Z")
	public boolean method1378() {
		return this.field1180;
	}

	@ObfuscatedName("cv.k()Z")
	public boolean method1364() {
		for (PostProcessingFilter var1 = (PostProcessingFilter) this.field1170.head(); var1 != null; var1 = (PostProcessingFilter) this.field1170.next()) {
			if (!var1.method17551()) {
				return false;
			}
		}
		return true;
	}

	@ObfuscatedName("cv.f()Z")
	public boolean method1362() {
		if (this.field1172) {
			if (this.field1178 != null) {
				this.field1178.delete();
				this.field1178 = null;
			}
			if (this.field1161 != null) {
				this.field1161.method1089();
				this.field1161 = null;
			}
		}
		if (this.field1171) {
			if (this.field1176 != null) {
				this.field1176.delete();
				this.field1176 = null;
			}
			if (this.field1175[0] != null) {
				this.field1175[0].method1089();
				this.field1175[0] = null;
			}
			if (this.field1175[1] != null) {
				this.field1175[1].method1089();
				this.field1175[1] = null;
			}
		}
		if (this.field1172) {
			if (this.field1163 != null) {
				this.field1178 = new PostProcessingRelated(this.field1169, TextureFormat.DEPTH, DataType.UNSIGNED_INT_24, this.field1177, this.field1167, this.field1169.field9967);
			}
			if (this.field1179) {
				this.field1161 = new GlTexture_Sub1(this.field1169, 34037, TextureFormat.DEPTH, DataType.UNSIGNED_INT_24, this.field1177, this.field1167);
			} else if (this.field1178 == null) {
				this.field1178 = new PostProcessingRelated(this.field1169, TextureFormat.DEPTH, DataType.UNSIGNED_INT_24, this.field1177, this.field1167);
			}
			this.field1172 = false;
			this.field1173 = true;
			this.field1174 = true;
		}
		if (this.field1171) {
			if (this.field1163 != null) {
				this.field1176 = new PostProcessingRelated(this.field1169, TextureFormat.RGBA, this.field1181, this.field1177, this.field1167, this.field1169.field9967);
			}
			this.field1175[0] = new GlTexture_Sub1(this.field1169, 34037, TextureFormat.RGBA, this.field1181, this.field1177, this.field1167);
			this.field1175[1] = this.field1168 > 1 ? new GlTexture_Sub1(this.field1169, 34037, TextureFormat.RGBA, this.field1181, this.field1177, this.field1167) : null;
			this.field1171 = false;
			this.field1173 = true;
			this.field1174 = true;
		}
		if (this.field1173) {
			if (this.field1163 == null) {
				this.field1169.method2142(this.field1162);
				this.field1162.method15441(null);
				this.field1162.method15439(0, null);
				this.field1162.method15439(1, null);
				this.field1162.method15439(0, this.field1175[0].method15317(0));
				this.field1162.method15439(1, this.field1168 > 1 ? this.field1175[1].method15317(0) : null);
				if (this.field1179) {
					this.field1162.method15441(this.field1161.method15320(0));
				} else {
					this.field1162.method15441(this.field1178);
				}
				this.field1169.method2143(this.field1162);
			} else {
				this.field1169.method2142(this.field1162);
				this.field1162.method15441(null);
				this.field1162.method15439(0, null);
				this.field1162.method15439(1, null);
				this.field1162.method15439(0, this.field1175[0].method15317(0));
				this.field1162.method15439(1, this.field1168 > 1 ? this.field1175[1].method15317(0) : null);
				if (this.field1179) {
					this.field1162.method15441(this.field1161.method15320(0));
				}
				this.field1169.method2143(this.field1162);
				this.field1169.method2142(this.field1163);
				this.field1163.method15441(null);
				this.field1163.method15439(0, null);
				this.field1163.method15439(0, this.field1176);
				this.field1163.method15441(this.field1178);
				this.field1169.method2143(this.field1163);
			}
			this.field1173 = false;
			this.field1174 = true;
		}
		if (this.field1174) {
			this.field1169.method2142(this.field1164);
			this.field1174 = !this.field1164.method15446();
			this.field1169.method2143(this.field1164);
		}
		return !this.field1174;
	}

	@ObfuscatedName("cv.w(IIII)Z")
	public boolean method1367(int arg0, int arg1, int arg2, int arg3) {
		if (this.field1164 == null || this.field1170._isEmpty() || this.method1364()) {
			return false;
		}
		if (this.field1177 != arg2 || this.field1167 != arg3) {
			this.field1177 = arg2;
			this.field1167 = arg3;
			for (Node var5 = this.field1170.head(); var5 != this.field1170.sentinel; var5 = var5.next) {
				((PostProcessingFilter) var5).method17540(this.field1177, this.field1167);
			}
			this.field1171 = true;
			this.field1172 = true;
			this.field1173 = true;
		}
		if (!this.method1362()) {
			return false;
		}
		this.field1165 = arg0;
		this.field1166 = arg1;
		this.field1180 = true;
		this.field1169.method15925(-this.field1165, this.field1167 + this.field1166 - this.field1169.getRenderTarget().getHeight());
		this.field1169.method2142(this.field1164);
		this.field1164.method18966(0);
		this.field1169.method2475(3, 0);
		return true;
	}

	@ObfuscatedName("cv.l(II)V")
	public void method1368(int arg0, int arg1) {
		if (!this.field1180) {
			return;
		}
		if (this.field1163 != null) {
			this.field1169.method2143(this.field1163);
			this.field1169.method2142(this.field1162);
			this.field1162.method18966(0);
			this.field1163.method15440(0, 0, this.field1177, this.field1167, 0, 0, true, this.field1179);
		}
		this.field1169.method15772();
		this.field1169.method15791(0);
		this.field1169.method15778(1);
		this.field1169.resetClip();
		int var3 = 0;
		int var4 = 1;
		int var5 = 0;
		int var6 = 0;
		int var7 = 0;
		Object var8 = null;
		for (PostProcessingFilter var9 = (PostProcessingFilter) this.field1170.head(); var9 != null; var9 = (PostProcessingFilter) this.field1170.next()) {
			if (!var9.method17551()) {
				var6++;
			}
		}
		PostProcessingFilter[] var10 = new PostProcessingFilter[var6];
		int var11 = 0;
		for (PostProcessingFilter var12 = (PostProcessingFilter) this.field1170.head(); var12 != null; var12 = (PostProcessingFilter) this.field1170.next()) {
			if (!var12.method17551()) {
				var10[var11++] = var12;
			}
		}
		while (var5 < var11) {
			for (int var13 = 0; var13 < var11; var13++) {
				PostProcessingFilter var14 = var10[var13];
				if (var14.method17546() == var7) {
					int var15 = var14.method17569();
					for (int var16 = 0; var16 < var15; var16++) {
						this.field1169.method15925(0, 0);
						var14.method17537(var16, this.field1175[var3], this.field1161, arg1, arg0);
						if (var15 - 1 == var16 && var11 - 1 == var5) {
							this.field1169.method2143(this.field1162);
							OpenGL.glBegin(7);
							OpenGL.glTexCoord2f(0.0F, (float) this.field1167);
							OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
							OpenGL.glVertex2i(this.field1165, this.field1166);
							OpenGL.glTexCoord2f(0.0F, (float) (this.field1167 - arg1));
							OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
							OpenGL.glVertex2i(this.field1165, this.field1166 + arg1);
							OpenGL.glTexCoord2f((float) arg0, (float) (this.field1167 - arg1));
							OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
							OpenGL.glVertex2i(this.field1165 + arg0, this.field1166 + arg1);
							OpenGL.glTexCoord2f((float) arg0, (float) this.field1167);
							OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
							OpenGL.glVertex2i(this.field1165 + arg0, this.field1166);
							OpenGL.glEnd();
						} else {
							this.field1162.method18966(var4);
							OpenGL.glBegin(7);
							OpenGL.glTexCoord2f(0.0F, (float) this.field1167);
							OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
							OpenGL.glVertex2i(0, 0);
							OpenGL.glTexCoord2f(0.0F, (float) (this.field1167 - arg1));
							OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
							OpenGL.glVertex2i(0, arg1);
							OpenGL.glTexCoord2f((float) arg0, (float) (this.field1167 - arg1));
							OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
							OpenGL.glVertex2i(arg0, arg1);
							OpenGL.glTexCoord2f((float) arg0, (float) this.field1167);
							OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
							OpenGL.glVertex2i(arg0, 0);
							OpenGL.glEnd();
						}
						var14.method17538(var16);
						var4 = var4 + 1 & 0x1;
						var3 = var3 + 1 & 0x1;
					}
					var5++;
				}
			}
			var7++;
		}
		this.field1180 = false;
		Object var17 = null;
	}

	@ObfuscatedName("cv.u(Lajl;)Z")
	public boolean method1369(PostProcessingFilter arg0) {
		if (this.field1164 != null) {
			if (arg0.method17539() || arg0.method17534()) {
				this.field1170.addTail(arg0);
				this.method1365();
				if (arg0.method17546() >= 0 && this.method1362()) {
					if (this.field1177 != -1 && this.field1167 != -1) {
						arg0.method17540(this.field1177, this.field1167);
					}
					arg0.field11271 = true;
					return true;
				}
			}
			this.method1370(arg0);
		}
		return false;
	}

	@ObfuscatedName("cv.z(Lajl;)V")
	public void method1370(PostProcessingFilter arg0) {
		arg0.field11271 = false;
		arg0.method17570();
		arg0.unlink();
		this.method1365();
	}

	@ObfuscatedName("cv.p()V")
	public void method1365() {
		int var1 = 0;
		boolean var2 = false;
		DataType var3 = DataType.UNSIGNED_INT_8;
		for (PostProcessingFilter var4 = (PostProcessingFilter) this.field1170.head(); var4 != null; var4 = (PostProcessingFilter) this.field1170.next()) {
			DataType var5 = var4.method17542();
			if (var5.field1652 > var3.field1652) {
				var3 = var5;
			}
			var2 |= var4.method17541();
			var1 += var4.method17569();
		}
		if (this.field1181 != var3) {
			this.field1181 = var3;
			this.field1171 = true;
		}
		int var6 = this.field1168 > 2 ? 2 : this.field1168;
		int var7 = var1 > 2 ? 2 : var1;
		if (var6 != var7) {
			this.field1171 = true;
			this.field1173 = true;
		}
		if (this.field1179 != var2) {
			this.field1179 = var2;
			this.field1172 = true;
		}
		this.field1168 = var1;
	}
}
