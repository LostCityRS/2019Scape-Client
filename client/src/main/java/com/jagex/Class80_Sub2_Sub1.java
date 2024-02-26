package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aqn")
public final class Class80_Sub2_Sub1 extends Class80_Sub2 {

	@OriginalMember(owner = "client!aqn", name = "j", descriptor = "Ljava/lang/String;")
	static final String aString79 = "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n";

	@OriginalMember(owner = "client!aqn", name = "w", descriptor = "Ljava/lang/String;")
	static final String aString80 = "void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";

	@OriginalMember(owner = "client!aqn", name = "a", descriptor = "Ljava/lang/String;")
	static final String aString81 = "void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";

	@OriginalMember(owner = "client!aqn", name = "k", descriptor = "Ljava/lang/String;")
	static final String aString82 = "void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\toutCol += mix( texture2D(remap_3, coordA), texture2D(remap_3, coordB), UVFrac.z ).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";

	@OriginalMember(owner = "client!aqn", name = "x", descriptor = "Ljava/lang/String;")
	static final String aString83 = "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n";

	@OriginalMember(owner = "client!aqn", name = "s", descriptor = "Ljava/lang/String;")
	static final String aString84 = "void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";

	@OriginalMember(owner = "client!aqn", name = "r", descriptor = "Ljava/lang/String;")
	static final String aString85 = "void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";

	@OriginalMember(owner = "client!aqn", name = "q", descriptor = "Ljava/lang/String;")
	static final String aString86 = "void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\toutCol += texture3D(remap_3, col).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";

	@OriginalMember(owner = "client!aqn", name = "g", descriptor = "[F")
	static float[] aFloatArray58 = new float[] { 0.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!aqn", name = "i", descriptor = "F")
	static float aFloat189 = 1.0F;

	@OriginalMember(owner = "client!aqn", name = "m", descriptor = "I")
	static int anInt2865 = 1;

	@OriginalMember(owner = "client!aqn", name = "o", descriptor = "[Lclient!aej;")
	static Class97_Sub2[] aClass97_Sub2Array1 = new Class97_Sub2[] { null, null, null };

	@OriginalMember(owner = "client!aqn", name = "h", descriptor = "[Lclient!by;")
	Class199[] aClass199Array1 = null;

	@OriginalMember(owner = "client!aqn", name = "<init>", descriptor = "(Lclient!afm;)V")
	Class80_Sub2_Sub1(@OriginalArg(0) Class102_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!aqn", name = "ag", descriptor = "()Lclient!dy;")
	@Override
	Class236 method21651() {
		return Class236.aClass236_21;
	}

	@OriginalMember(owner = "client!aqn", name = "av", descriptor = "()Z")
	boolean method20374() {
		return this.aClass102_Sub3_38.aBoolean155;
	}

	@OriginalMember(owner = "client!aqn", name = "t", descriptor = "()Z")
	@Override
	boolean method21626() {
		return this.aClass199Array1 != null;
	}

	@OriginalMember(owner = "client!aqn", name = "f", descriptor = "()Z")
	@Override
	boolean method21636() {
		if (!this.aClass102_Sub3_38.aBoolean155) {
			return false;
		}
		this.aClass199Array1 = new Class199[3];
		@Pc(70) int local70;
		if (this.aClass102_Sub3_38.aBoolean138) {
			this.aClass199Array1[0] = Class199.method24921(this.aClass102_Sub3_38, new Class181[] { Class181.method24681(this.aClass102_Sub3_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			this.aClass199Array1[1] = Class199.method24921(this.aClass102_Sub3_38, new Class181[] { Class181.method24681(this.aClass102_Sub3_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			this.aClass199Array1[2] = Class199.method24921(this.aClass102_Sub3_38, new Class181[] { Class181.method24681(this.aClass102_Sub3_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\toutCol += texture3D(remap_3, col).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			for (local70 = 0; local70 < 3; local70++) {
				if (this.aClass199Array1[local70] == null) {
					return false;
				}
			}
		} else {
			this.aClass199Array1[0] = Class199.method24921(this.aClass102_Sub3_38, new Class181[] { Class181.method24681(this.aClass102_Sub3_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			this.aClass199Array1[1] = Class199.method24921(this.aClass102_Sub3_38, new Class181[] { Class181.method24681(this.aClass102_Sub3_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			this.aClass199Array1[2] = Class199.method24921(this.aClass102_Sub3_38, new Class181[] { Class181.method24681(this.aClass102_Sub3_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\toutCol += mix( texture2D(remap_3, coordA), texture2D(remap_3, coordB), UVFrac.z ).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			for (local70 = 0; local70 < 3; local70++) {
				if (this.aClass199Array1[local70] == null) {
					return false;
				}
			}
		}
		return this.aClass199Array1 != null;
	}

	@OriginalMember(owner = "client!aqn", name = "u", descriptor = "(II)V")
	@Override
	void method21629(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aqn", name = "l", descriptor = "(ILclient!adm;Lclient!adm;II)V")
	@Override
	void method21630(@OriginalArg(0) int arg0, @OriginalArg(1) Class84_Sub1 arg1, @OriginalArg(2) Class84_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (anInt2865 < 1 || anInt2865 > 3) {
			return;
		}
		@Pc(14) int local14 = this.aClass199Array1[anInt2865 - 1].anInt3371;
		OpenGL.glUseProgram(local14);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local14, "sceneTex"), 0);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(local14, "paramsWeightings"), aFloat189, aFloatArray58[0], aFloatArray58[1], aFloatArray58[2]);
		this.aClass102_Sub3_38.method6386(0);
		this.aClass102_Sub3_38.method6339(arg1);
		for (@Pc(47) int local47 = anInt2865 - 1; local47 >= 0; local47--) {
			if (aClass97_Sub2Array1[local47] != null) {
				if (local47 == 0) {
					OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local14, "remap_1"), 1);
				}
				if (local47 == 1) {
					OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local14, "remap_2"), 2);
				}
				if (local47 == 2) {
					OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local14, "remap_3"), 3);
				}
				this.aClass102_Sub3_38.method6386(local47 + 1);
				@Pc(87) Class84 local87 = aClass97_Sub2Array1[local47].method2122();
				if (local87 != null) {
					this.aClass102_Sub3_38.method6339(local87);
				}
			}
		}
	}

	@OriginalMember(owner = "client!aqn", name = "g", descriptor = "(I)V")
	@Override
	void method21631(@OriginalArg(0) int arg0) {
		OpenGL.glUseProgram(0);
		for (@Pc(3) int local3 = anInt2865; local3 >= 0; local3--) {
			this.aClass102_Sub3_38.method6386(local3);
			this.aClass102_Sub3_38.method6339(null);
		}
	}

	@OriginalMember(owner = "client!aqn", name = "ad", descriptor = "()I")
	@Override
	int method21635() {
		return 2;
	}

	@OriginalMember(owner = "client!aqn", name = "ax", descriptor = "(II)V")
	@Override
	void method21645(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aqn", name = "e", descriptor = "()V")
	@Override
	void method21628() {
		if (this.aClass199Array1 != null) {
			for (@Pc(4) int local4 = 0; local4 < this.aClass199Array1.length; local4++) {
				this.aClass199Array1[local4] = null;
			}
			this.aClass199Array1 = null;
		}
	}

	@OriginalMember(owner = "client!aqn", name = "x", descriptor = "()Z")
	@Override
	boolean method21638() {
		return this.aClass199Array1 != null;
	}

	@OriginalMember(owner = "client!aqn", name = "z", descriptor = "()Z")
	@Override
	boolean method21639() {
		return this.aClass199Array1 != null;
	}

	@OriginalMember(owner = "client!aqn", name = "p", descriptor = "()Z")
	@Override
	boolean method21640() {
		if (!this.aClass102_Sub3_38.aBoolean155) {
			return false;
		}
		this.aClass199Array1 = new Class199[3];
		@Pc(70) int local70;
		if (this.aClass102_Sub3_38.aBoolean138) {
			this.aClass199Array1[0] = Class199.method24921(this.aClass102_Sub3_38, new Class181[] { Class181.method24681(this.aClass102_Sub3_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			this.aClass199Array1[1] = Class199.method24921(this.aClass102_Sub3_38, new Class181[] { Class181.method24681(this.aClass102_Sub3_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			this.aClass199Array1[2] = Class199.method24921(this.aClass102_Sub3_38, new Class181[] { Class181.method24681(this.aClass102_Sub3_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\toutCol += texture3D(remap_3, col).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			for (local70 = 0; local70 < 3; local70++) {
				if (this.aClass199Array1[local70] == null) {
					return false;
				}
			}
		} else {
			this.aClass199Array1[0] = Class199.method24921(this.aClass102_Sub3_38, new Class181[] { Class181.method24681(this.aClass102_Sub3_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			this.aClass199Array1[1] = Class199.method24921(this.aClass102_Sub3_38, new Class181[] { Class181.method24681(this.aClass102_Sub3_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			this.aClass199Array1[2] = Class199.method24921(this.aClass102_Sub3_38, new Class181[] { Class181.method24681(this.aClass102_Sub3_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\toutCol += mix( texture2D(remap_3, coordA), texture2D(remap_3, coordB), UVFrac.z ).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			for (local70 = 0; local70 < 3; local70++) {
				if (this.aClass199Array1[local70] == null) {
					return false;
				}
			}
		}
		return this.aClass199Array1 != null;
	}

	@OriginalMember(owner = "client!aqn", name = "v", descriptor = "()Z")
	@Override
	boolean method21625() {
		if (!this.aClass102_Sub3_38.aBoolean155) {
			return false;
		}
		this.aClass199Array1 = new Class199[3];
		@Pc(70) int local70;
		if (this.aClass102_Sub3_38.aBoolean138) {
			this.aClass199Array1[0] = Class199.method24921(this.aClass102_Sub3_38, new Class181[] { Class181.method24681(this.aClass102_Sub3_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			this.aClass199Array1[1] = Class199.method24921(this.aClass102_Sub3_38, new Class181[] { Class181.method24681(this.aClass102_Sub3_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			this.aClass199Array1[2] = Class199.method24921(this.aClass102_Sub3_38, new Class181[] { Class181.method24681(this.aClass102_Sub3_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\toutCol += texture3D(remap_3, col).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			for (local70 = 0; local70 < 3; local70++) {
				if (this.aClass199Array1[local70] == null) {
					return false;
				}
			}
		} else {
			this.aClass199Array1[0] = Class199.method24921(this.aClass102_Sub3_38, new Class181[] { Class181.method24681(this.aClass102_Sub3_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			this.aClass199Array1[1] = Class199.method24921(this.aClass102_Sub3_38, new Class181[] { Class181.method24681(this.aClass102_Sub3_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			this.aClass199Array1[2] = Class199.method24921(this.aClass102_Sub3_38, new Class181[] { Class181.method24681(this.aClass102_Sub3_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\toutCol += mix( texture2D(remap_3, coordA), texture2D(remap_3, coordB), UVFrac.z ).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			for (local70 = 0; local70 < 3; local70++) {
				if (this.aClass199Array1[local70] == null) {
					return false;
				}
			}
		}
		return this.aClass199Array1 != null;
	}

	@OriginalMember(owner = "client!aqn", name = "y", descriptor = "()Z")
	@Override
	boolean method21641() {
		if (!this.aClass102_Sub3_38.aBoolean155) {
			return false;
		}
		this.aClass199Array1 = new Class199[3];
		@Pc(70) int local70;
		if (this.aClass102_Sub3_38.aBoolean138) {
			this.aClass199Array1[0] = Class199.method24921(this.aClass102_Sub3_38, new Class181[] { Class181.method24681(this.aClass102_Sub3_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			this.aClass199Array1[1] = Class199.method24921(this.aClass102_Sub3_38, new Class181[] { Class181.method24681(this.aClass102_Sub3_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			this.aClass199Array1[2] = Class199.method24921(this.aClass102_Sub3_38, new Class181[] { Class181.method24681(this.aClass102_Sub3_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\toutCol += texture3D(remap_3, col).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			for (local70 = 0; local70 < 3; local70++) {
				if (this.aClass199Array1[local70] == null) {
					return false;
				}
			}
		} else {
			this.aClass199Array1[0] = Class199.method24921(this.aClass102_Sub3_38, new Class181[] { Class181.method24681(this.aClass102_Sub3_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			this.aClass199Array1[1] = Class199.method24921(this.aClass102_Sub3_38, new Class181[] { Class181.method24681(this.aClass102_Sub3_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			this.aClass199Array1[2] = Class199.method24921(this.aClass102_Sub3_38, new Class181[] { Class181.method24681(this.aClass102_Sub3_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\toutCol += mix( texture2D(remap_3, coordA), texture2D(remap_3, coordB), UVFrac.z ).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			for (local70 = 0; local70 < 3; local70++) {
				if (this.aClass199Array1[local70] == null) {
					return false;
				}
			}
		}
		return this.aClass199Array1 != null;
	}

	@OriginalMember(owner = "client!aqn", name = "n", descriptor = "()V")
	@Override
	void method21648() {
		if (this.aClass199Array1 != null) {
			for (@Pc(4) int local4 = 0; local4 < this.aClass199Array1.length; local4++) {
				this.aClass199Array1[local4] = null;
			}
			this.aClass199Array1 = null;
		}
	}

	@OriginalMember(owner = "client!aqn", name = "c", descriptor = "()V")
	@Override
	void method21643() {
		if (this.aClass199Array1 != null) {
			for (@Pc(4) int local4 = 0; local4 < this.aClass199Array1.length; local4++) {
				this.aClass199Array1[local4] = null;
			}
			this.aClass199Array1 = null;
		}
	}

	@OriginalMember(owner = "client!aqn", name = "ah", descriptor = "()Z")
	@Override
	boolean method21655() {
		return aFloat189 == 1.0F || aFloatArray58[0] + aFloatArray58[1] + aFloatArray58[2] == 0.0F || aClass97_Sub2Array1[0] == null && aClass97_Sub2Array1[1] == null && aClass97_Sub2Array1[2] == null;
	}

	@OriginalMember(owner = "client!aqn", name = "s", descriptor = "()Z")
	@Override
	boolean method21637() {
		return aFloat189 == 1.0F || aFloatArray58[0] + aFloatArray58[1] + aFloatArray58[2] == 0.0F || aClass97_Sub2Array1[0] == null && aClass97_Sub2Array1[1] == null && aClass97_Sub2Array1[2] == null;
	}

	@OriginalMember(owner = "client!aqn", name = "ay", descriptor = "(ILclient!adm;Lclient!adm;II)V")
	@Override
	void method21644(@OriginalArg(0) int arg0, @OriginalArg(1) Class84_Sub1 arg1, @OriginalArg(2) Class84_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (anInt2865 < 1 || anInt2865 > 3) {
			return;
		}
		@Pc(14) int local14 = this.aClass199Array1[anInt2865 - 1].anInt3371;
		OpenGL.glUseProgram(local14);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local14, "sceneTex"), 0);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(local14, "paramsWeightings"), aFloat189, aFloatArray58[0], aFloatArray58[1], aFloatArray58[2]);
		this.aClass102_Sub3_38.method6386(0);
		this.aClass102_Sub3_38.method6339(arg1);
		for (@Pc(47) int local47 = anInt2865 - 1; local47 >= 0; local47--) {
			if (aClass97_Sub2Array1[local47] != null) {
				if (local47 == 0) {
					OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local14, "remap_1"), 1);
				}
				if (local47 == 1) {
					OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local14, "remap_2"), 2);
				}
				if (local47 == 2) {
					OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local14, "remap_3"), 3);
				}
				this.aClass102_Sub3_38.method6386(local47 + 1);
				@Pc(87) Class84 local87 = aClass97_Sub2Array1[local47].method2122();
				if (local87 != null) {
					this.aClass102_Sub3_38.method6339(local87);
				}
			}
		}
	}

	@OriginalMember(owner = "client!aqn", name = "ai", descriptor = "(ILclient!adm;Lclient!adm;II)V")
	@Override
	void method21647(@OriginalArg(0) int arg0, @OriginalArg(1) Class84_Sub1 arg1, @OriginalArg(2) Class84_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (anInt2865 < 1 || anInt2865 > 3) {
			return;
		}
		@Pc(14) int local14 = this.aClass199Array1[anInt2865 - 1].anInt3371;
		OpenGL.glUseProgram(local14);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local14, "sceneTex"), 0);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(local14, "paramsWeightings"), aFloat189, aFloatArray58[0], aFloatArray58[1], aFloatArray58[2]);
		this.aClass102_Sub3_38.method6386(0);
		this.aClass102_Sub3_38.method6339(arg1);
		for (@Pc(47) int local47 = anInt2865 - 1; local47 >= 0; local47--) {
			if (aClass97_Sub2Array1[local47] != null) {
				if (local47 == 0) {
					OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local14, "remap_1"), 1);
				}
				if (local47 == 1) {
					OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local14, "remap_2"), 2);
				}
				if (local47 == 2) {
					OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local14, "remap_3"), 3);
				}
				this.aClass102_Sub3_38.method6386(local47 + 1);
				@Pc(87) Class84 local87 = aClass97_Sub2Array1[local47].method2122();
				if (local87 != null) {
					this.aClass102_Sub3_38.method6339(local87);
				}
			}
		}
	}

	@OriginalMember(owner = "client!aqn", name = "j", descriptor = "()Lclient!dy;")
	@Override
	Class236 method21649() {
		return Class236.aClass236_21;
	}

	@OriginalMember(owner = "client!aqn", name = "ao", descriptor = "(I)V")
	@Override
	void method21634(@OriginalArg(0) int arg0) {
		OpenGL.glUseProgram(0);
		for (@Pc(3) int local3 = anInt2865; local3 >= 0; local3--) {
			this.aClass102_Sub3_38.method6386(local3);
			this.aClass102_Sub3_38.method6339(null);
		}
	}

	@OriginalMember(owner = "client!aqn", name = "aj", descriptor = "()Lclient!dy;")
	@Override
	Class236 method21650() {
		return Class236.aClass236_21;
	}

	@OriginalMember(owner = "client!aqn", name = "ac", descriptor = "()Lclient!dy;")
	@Override
	Class236 method21652() {
		return Class236.aClass236_21;
	}

	@OriginalMember(owner = "client!aqn", name = "af", descriptor = "()Z")
	@Override
	boolean method21656() {
		return aFloat189 == 1.0F || aFloatArray58[0] + aFloatArray58[1] + aFloatArray58[2] == 0.0F || aClass97_Sub2Array1[0] == null && aClass97_Sub2Array1[1] == null && aClass97_Sub2Array1[2] == null;
	}

	@OriginalMember(owner = "client!aqn", name = "aq", descriptor = "(ILclient!adm;Lclient!adm;II)V")
	@Override
	void method21627(@OriginalArg(0) int arg0, @OriginalArg(1) Class84_Sub1 arg1, @OriginalArg(2) Class84_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (anInt2865 < 1 || anInt2865 > 3) {
			return;
		}
		@Pc(14) int local14 = this.aClass199Array1[anInt2865 - 1].anInt3371;
		OpenGL.glUseProgram(local14);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local14, "sceneTex"), 0);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(local14, "paramsWeightings"), aFloat189, aFloatArray58[0], aFloatArray58[1], aFloatArray58[2]);
		this.aClass102_Sub3_38.method6386(0);
		this.aClass102_Sub3_38.method6339(arg1);
		for (@Pc(47) int local47 = anInt2865 - 1; local47 >= 0; local47--) {
			if (aClass97_Sub2Array1[local47] != null) {
				if (local47 == 0) {
					OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local14, "remap_1"), 1);
				}
				if (local47 == 1) {
					OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local14, "remap_2"), 2);
				}
				if (local47 == 2) {
					OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local14, "remap_3"), 3);
				}
				this.aClass102_Sub3_38.method6386(local47 + 1);
				@Pc(87) Class84 local87 = aClass97_Sub2Array1[local47].method2122();
				if (local87 != null) {
					this.aClass102_Sub3_38.method6339(local87);
				}
			}
		}
	}

	@OriginalMember(owner = "client!aqn", name = "m", descriptor = "()I")
	@Override
	int method21633() {
		return 2;
	}

	@OriginalMember(owner = "client!aqn", name = "am", descriptor = "()Z")
	@Override
	boolean method21657() {
		return aFloat189 == 1.0F || aFloatArray58[0] + aFloatArray58[1] + aFloatArray58[2] == 0.0F || aClass97_Sub2Array1[0] == null && aClass97_Sub2Array1[1] == null && aClass97_Sub2Array1[2] == null;
	}

	@OriginalMember(owner = "client!aqn", name = "ak", descriptor = "()Z")
	@Override
	boolean method21658() {
		return aFloat189 == 1.0F || aFloatArray58[0] + aFloatArray58[1] + aFloatArray58[2] == 0.0F || aClass97_Sub2Array1[0] == null && aClass97_Sub2Array1[1] == null && aClass97_Sub2Array1[2] == null;
	}

	@OriginalMember(owner = "client!aqn", name = "at", descriptor = "()Z")
	@Override
	boolean method21659() {
		return aFloat189 == 1.0F || aFloatArray58[0] + aFloatArray58[1] + aFloatArray58[2] == 0.0F || aClass97_Sub2Array1[0] == null && aClass97_Sub2Array1[1] == null && aClass97_Sub2Array1[2] == null;
	}

	@OriginalMember(owner = "client!aqn", name = "b", descriptor = "()V")
	@Override
	void method21660() {
		if (this.aClass199Array1 != null) {
			for (@Pc(4) int local4 = 0; local4 < this.aClass199Array1.length; local4++) {
				this.aClass199Array1[local4] = null;
			}
			this.aClass199Array1 = null;
		}
	}

	@OriginalMember(owner = "client!aqn", name = "an", descriptor = "()Z")
	boolean method20375() {
		return this.aClass102_Sub3_38.aBoolean155;
	}

	@OriginalMember(owner = "client!aqn", name = "aa", descriptor = "()Z")
	boolean method20376() {
		return this.aClass102_Sub3_38.aBoolean155;
	}
}
