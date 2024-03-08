package com.jagex;

import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("aqi")
public class class1146 extends class968 {

	@ObfuscatedName("aqi.w")
	public static float[] field12183 = new float[] { 0.0F, 0.0F, 0.0F };

	@ObfuscatedName("aqi.l")
	public static float field12174 = 1.0F;

	@ObfuscatedName("aqi.u")
	public static int field12175 = 1;

	@ObfuscatedName("aqi.z")
	public static class838[] field12179 = new class838[] { null, null, null };

	@ObfuscatedName("aqi.q")
	public class68[] field12185 = null;

	public class1146(class849 arg0) {
		super(arg0);
	}

	@ObfuscatedName("aqi.ao()Z")
	public boolean method19234() {
		return this.field11270.field10002;
	}

	@ObfuscatedName("aqi.e()Z")
	public boolean method17539() {
		return this.field12185 != null;
	}

	@ObfuscatedName("aqi.n()Z")
	public boolean method17534() {
		if (!this.field11270.field10002) {
			return false;
		}
		this.field12185 = new class68[3];
		if (this.field11270.field9889) {
			this.field12185[0] = class68.method1065(this.field11270, new class71[] { class71.method1120(this.field11270, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			this.field12185[1] = class68.method1065(this.field11270, new class71[] { class71.method1120(this.field11270, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			this.field12185[2] = class68.method1065(this.field11270, new class71[] { class71.method1120(this.field11270, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\toutCol += texture3D(remap_3, col).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			for (int var1 = 0; var1 < 3; var1++) {
				if (this.field12185[var1] == null) {
					return false;
				}
			}
		} else {
			this.field12185[0] = class68.method1065(this.field11270, new class71[] { class71.method1120(this.field11270, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			this.field12185[1] = class68.method1065(this.field11270, new class71[] { class71.method1120(this.field11270, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			this.field12185[2] = class68.method1065(this.field11270, new class71[] { class71.method1120(this.field11270, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\toutCol += mix( texture2D(remap_3, coordA), texture2D(remap_3, coordB), UVFrac.z ).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			for (int var2 = 0; var2 < 3; var2++) {
				if (this.field12185[var2] == null) {
					return false;
				}
			}
		}
		return this.field12185 != null;
	}

	@ObfuscatedName("aqi.k(II)V")
	public void method17540(int arg0, int arg1) {
	}

	@ObfuscatedName("aqi.m()V")
	public void method17570() {
		if (this.field12185 != null) {
			for (int var1 = 0; var1 < this.field12185.length; var1++) {
				this.field12185[var1] = null;
			}
			this.field12185 = null;
		}
	}

	@ObfuscatedName("aqi.f(ILadt;Ladt;II)V")
	public void method17537(int arg0, class812 arg1, class812 arg2, int arg3, int arg4) {
		if (field12175 < 1 || field12175 > 3) {
			return;
		}
		int var6 = this.field12185[field12175 - 1].field987;
		OpenGL.glUseProgram(var6);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var6, "sceneTex"), 0);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(var6, "paramsWeightings"), field12174, field12183[0], field12183[1], field12183[2]);
		this.field11270.method15776(0);
		this.field11270.method15777(arg1);
		for (int var7 = field12175 - 1; var7 >= 0; var7--) {
			if (field12179[var7] != null) {
				if (var7 == 0) {
					OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var6, "remap_1"), 1);
				}
				if (var7 == 1) {
					OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var6, "remap_2"), 2);
				}
				if (var7 == 2) {
					OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var6, "remap_3"), 3);
				}
				this.field11270.method15776(var7 + 1);
				class70 var8 = field12179[var7].method15425();
				if (var8 != null) {
					this.field11270.method15777(var8);
				}
			}
		}
	}

	@ObfuscatedName("aqi.w(I)V")
	public void method17538(int arg0) {
		OpenGL.glUseProgram(0);
		for (int var2 = field12175; var2 >= 0; var2--) {
			this.field11270.method15776(var2);
			this.field11270.method15777(null);
		}
	}

	@ObfuscatedName("aqi.p()Ldg;")
	public class135 method17542() {
		return class135.field1645;
	}

	@ObfuscatedName("aqi.u()I")
	public int method17546() {
		return 2;
	}

	@ObfuscatedName("aqi.c()Z")
	public boolean method17551() {
		return field12174 == 1.0F || field12183[0] + field12183[1] + field12183[2] == 0.0F || field12179[0] == null && field12179[1] == null && field12179[2] == null;
	}
}
