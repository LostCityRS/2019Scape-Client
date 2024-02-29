package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aqi")
public class Class93_Sub4_Sub2 extends Class93_Sub4 {

	@OriginalMember(owner = "client!aqi", name = "d", descriptor = "Ljava/lang/String;")
	static final String aString71 = "void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";

	@OriginalMember(owner = "client!aqi", name = "s", descriptor = "Ljava/lang/String;")
	static final String aString72 = "void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";

	@OriginalMember(owner = "client!aqi", name = "p", descriptor = "Ljava/lang/String;")
	static final String aString73 = "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n";

	@OriginalMember(owner = "client!aqi", name = "c", descriptor = "Ljava/lang/String;")
	static final String aString74 = "void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";

	@OriginalMember(owner = "client!aqi", name = "r", descriptor = "Ljava/lang/String;")
	static final String aString75 = "void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\toutCol += mix( texture2D(remap_3, coordA), texture2D(remap_3, coordB), UVFrac.z ).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";

	@OriginalMember(owner = "client!aqi", name = "o", descriptor = "Ljava/lang/String;")
	static final String aString76 = "void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";

	@OriginalMember(owner = "client!aqi", name = "v", descriptor = "Ljava/lang/String;")
	static final String aString77 = "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n";

	@OriginalMember(owner = "client!aqi", name = "y", descriptor = "Ljava/lang/String;")
	static final String aString78 = "void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\toutCol += texture3D(remap_3, col).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n";

	@OriginalMember(owner = "client!aqi", name = "w", descriptor = "[F")
	static float[] aFloatArray56 = new float[] { 0.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!aqi", name = "l", descriptor = "F")
	static float aFloat191 = 1.0F;

	@OriginalMember(owner = "client!aqi", name = "u", descriptor = "I")
	static int anInt2758 = 1;

	@OriginalMember(owner = "client!aqi", name = "z", descriptor = "[Lclient!aep;")
	static Class102_Sub1[] aClass102_Sub1Array1 = new Class102_Sub1[] { null, null, null };

	@OriginalMember(owner = "client!aqi", name = "q", descriptor = "[Lclient!bn;")
	Class191[] aClass191Array1 = null;

	@OriginalMember(owner = "client!aqi", name = "<init>", descriptor = "(Lclient!afa;)V", line = 24)
	Class93_Sub4_Sub2(@OriginalArg(0) Class104_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!aqi", name = "ao", descriptor = "()Z", line = 28)
	boolean method19814() {
		return this.aClass104_Sub1_38.aBoolean103;
	}

	@OriginalMember(owner = "client!aqi", name = "e", descriptor = "()Z", line = 32)
	@Override
	boolean method20179() {
		return this.aClass191Array1 != null;
	}

	@OriginalMember(owner = "client!aqi", name = "r", descriptor = "()Z", line = 32)
	@Override
	boolean method20182() {
		return this.aClass191Array1 != null;
	}

	@OriginalMember(owner = "client!aqi", name = "v", descriptor = "()Z", line = 32)
	@Override
	boolean method20173() {
		return this.aClass191Array1 != null;
	}

	@OriginalMember(owner = "client!aqi", name = "n", descriptor = "()Z", line = 36)
	@Override
	boolean method20174() {
		if (!this.aClass104_Sub1_38.aBoolean103) {
			return false;
		}
		this.aClass191Array1 = new Class191[3];
		@Pc(70) int local70;
		if (this.aClass104_Sub1_38.aBoolean75) {
			this.aClass191Array1[0] = Class191.method24589(this.aClass104_Sub1_38, new Class190[] { Class190.method24585(this.aClass104_Sub1_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			this.aClass191Array1[1] = Class191.method24589(this.aClass104_Sub1_38, new Class190[] { Class190.method24585(this.aClass104_Sub1_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			this.aClass191Array1[2] = Class191.method24589(this.aClass104_Sub1_38, new Class190[] { Class190.method24585(this.aClass104_Sub1_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\toutCol += texture3D(remap_3, col).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			for (local70 = 0; local70 < 3; local70++) {
				if (this.aClass191Array1[local70] == null) {
					return false;
				}
			}
		} else {
			this.aClass191Array1[0] = Class191.method24589(this.aClass104_Sub1_38, new Class190[] { Class190.method24585(this.aClass104_Sub1_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			this.aClass191Array1[1] = Class191.method24589(this.aClass104_Sub1_38, new Class190[] { Class190.method24585(this.aClass104_Sub1_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			this.aClass191Array1[2] = Class191.method24589(this.aClass104_Sub1_38, new Class190[] { Class190.method24585(this.aClass104_Sub1_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\toutCol += mix( texture2D(remap_3, coordA), texture2D(remap_3, coordB), UVFrac.z ).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			for (local70 = 0; local70 < 3; local70++) {
				if (this.aClass191Array1[local70] == null) {
					return false;
				}
			}
		}
		return this.aClass191Array1 != null;
	}

	@OriginalMember(owner = "client!aqi", name = "y", descriptor = "()Z", line = 36)
	@Override
	boolean method20184() {
		if (!this.aClass104_Sub1_38.aBoolean103) {
			return false;
		}
		this.aClass191Array1 = new Class191[3];
		@Pc(70) int local70;
		if (this.aClass104_Sub1_38.aBoolean75) {
			this.aClass191Array1[0] = Class191.method24589(this.aClass104_Sub1_38, new Class190[] { Class190.method24585(this.aClass104_Sub1_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			this.aClass191Array1[1] = Class191.method24589(this.aClass104_Sub1_38, new Class190[] { Class190.method24585(this.aClass104_Sub1_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			this.aClass191Array1[2] = Class191.method24589(this.aClass104_Sub1_38, new Class190[] { Class190.method24585(this.aClass104_Sub1_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\toutCol += texture3D(remap_3, col).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			for (local70 = 0; local70 < 3; local70++) {
				if (this.aClass191Array1[local70] == null) {
					return false;
				}
			}
		} else {
			this.aClass191Array1[0] = Class191.method24589(this.aClass104_Sub1_38, new Class190[] { Class190.method24585(this.aClass104_Sub1_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			this.aClass191Array1[1] = Class191.method24589(this.aClass104_Sub1_38, new Class190[] { Class190.method24585(this.aClass104_Sub1_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			this.aClass191Array1[2] = Class191.method24589(this.aClass104_Sub1_38, new Class190[] { Class190.method24585(this.aClass104_Sub1_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\toutCol += mix( texture2D(remap_3, coordA), texture2D(remap_3, coordB), UVFrac.z ).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			for (local70 = 0; local70 < 3; local70++) {
				if (this.aClass191Array1[local70] == null) {
					return false;
				}
			}
		}
		return this.aClass191Array1 != null;
	}

	@OriginalMember(owner = "client!aqi", name = "x", descriptor = "()Z", line = 36)
	@Override
	boolean method20185() {
		if (!this.aClass104_Sub1_38.aBoolean103) {
			return false;
		}
		this.aClass191Array1 = new Class191[3];
		@Pc(70) int local70;
		if (this.aClass104_Sub1_38.aBoolean75) {
			this.aClass191Array1[0] = Class191.method24589(this.aClass104_Sub1_38, new Class190[] { Class190.method24585(this.aClass104_Sub1_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			this.aClass191Array1[1] = Class191.method24589(this.aClass104_Sub1_38, new Class190[] { Class190.method24585(this.aClass104_Sub1_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			this.aClass191Array1[2] = Class191.method24589(this.aClass104_Sub1_38, new Class190[] { Class190.method24585(this.aClass104_Sub1_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\toutCol += texture3D(remap_3, col).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			for (local70 = 0; local70 < 3; local70++) {
				if (this.aClass191Array1[local70] == null) {
					return false;
				}
			}
		} else {
			this.aClass191Array1[0] = Class191.method24589(this.aClass104_Sub1_38, new Class190[] { Class190.method24585(this.aClass104_Sub1_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			this.aClass191Array1[1] = Class191.method24589(this.aClass104_Sub1_38, new Class190[] { Class190.method24585(this.aClass104_Sub1_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			this.aClass191Array1[2] = Class191.method24589(this.aClass104_Sub1_38, new Class190[] { Class190.method24585(this.aClass104_Sub1_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\toutCol += mix( texture2D(remap_3, coordA), texture2D(remap_3, coordB), UVFrac.z ).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			for (local70 = 0; local70 < 3; local70++) {
				if (this.aClass191Array1[local70] == null) {
					return false;
				}
			}
		}
		return this.aClass191Array1 != null;
	}

	@OriginalMember(owner = "client!aqi", name = "h", descriptor = "()Z", line = 36)
	@Override
	boolean method20176() {
		if (!this.aClass104_Sub1_38.aBoolean103) {
			return false;
		}
		this.aClass191Array1 = new Class191[3];
		@Pc(70) int local70;
		if (this.aClass104_Sub1_38.aBoolean75) {
			this.aClass191Array1[0] = Class191.method24589(this.aClass104_Sub1_38, new Class190[] { Class190.method24585(this.aClass104_Sub1_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			this.aClass191Array1[1] = Class191.method24589(this.aClass104_Sub1_38, new Class190[] { Class190.method24585(this.aClass104_Sub1_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			this.aClass191Array1[2] = Class191.method24589(this.aClass104_Sub1_38, new Class190[] { Class190.method24585(this.aClass104_Sub1_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler3D remap_1, remap_2, remap_3, remap_4;\n\n".concat("void main() {\n\tvec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n\tcol = clamp(col,0.0,1.0);\n\tvec3 outCol = col * paramsWeightings.x;\n\t//Clamp the colour coords so we sample correctly\n\tfloat minC = 0.03125; // 0.5/16.0\n\tfloat maxC = 0.96875; // 1.0-(0.5/16.0)\n\tcol = mix(vec3(minC,minC,minC), vec3(maxC,maxC,maxC), col);\n\n\toutCol += texture3D(remap_1, col).rgb * paramsWeightings.y;\n\toutCol += texture3D(remap_2, col).rgb * paramsWeightings.z;\n\toutCol += texture3D(remap_3, col).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			for (local70 = 0; local70 < 3; local70++) {
				if (this.aClass191Array1[local70] == null) {
					return false;
				}
			}
		} else {
			this.aClass191Array1[0] = Class191.method24589(this.aClass104_Sub1_38, new Class190[] { Class190.method24585(this.aClass104_Sub1_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			this.aClass191Array1[1] = Class191.method24589(this.aClass104_Sub1_38, new Class190[] { Class190.method24585(this.aClass104_Sub1_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			this.aClass191Array1[2] = Class191.method24589(this.aClass104_Sub1_38, new Class190[] { Class190.method24585(this.aClass104_Sub1_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec4 paramsWeightings;\nuniform sampler2DRect sceneTex;\nuniform sampler2D remap_1, remap_2, remap_3, remap_4;\n\nvec3 remap_uv(vec3 in_coord) {\n\tfloat Scale = 15.0 / 16.0;\n\tfloat IntB = floor(in_coord.b * 14.9999) / 16.0;\n\tfloat FracB = in_coord.b * 15.0 - IntB * 16.0;\n\tfloat U = IntB + in_coord.r * Scale / 16.0;\n\tfloat V = in_coord.g * Scale;\n\treturn vec3(U,V,FracB);\n}\n\n".concat("void main() {\n\tvec3 outCol = clamp(texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz,0.0,1.0);\n\tvec2 Offset = vec2(0.5 / 256.0, 0.5 / 16.0);\n\tvec3 UVFrac = remap_uv(outCol);\n\tvec2 coordA = Offset + vec2(UVFrac.x , UVFrac.y);\n\tvec2 coordB = coordA + vec2(1.0 / 16.0, 0.0);\n\toutCol *= paramsWeightings.x;\n\n\toutCol += mix( texture2D(remap_1, coordA), texture2D(remap_1, coordB), UVFrac.z ).rgb * paramsWeightings.y;\n\toutCol += mix( texture2D(remap_2, coordA), texture2D(remap_2, coordB), UVFrac.z ).rgb * paramsWeightings.z;\n\toutCol += mix( texture2D(remap_3, coordA), texture2D(remap_3, coordB), UVFrac.z ).rgb * paramsWeightings.w;\n\n\tgl_FragColor = vec4(outCol, 1.0);\n}\n")) });
			for (local70 = 0; local70 < 3; local70++) {
				if (this.aClass191Array1[local70] == null) {
					return false;
				}
			}
		}
		return this.aClass191Array1 != null;
	}

	@OriginalMember(owner = "client!aqi", name = "j", descriptor = "(II)V", line = 55)
	@Override
	void method20189(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aqi", name = "k", descriptor = "(II)V", line = 55)
	@Override
	void method20180(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aqi", name = "t", descriptor = "(II)V", line = 55)
	@Override
	void method20194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aqi", name = "ae", descriptor = "(II)V", line = 55)
	@Override
	void method20191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aqi", name = "m", descriptor = "()V", line = 58)
	@Override
	void method20199() {
		if (this.aClass191Array1 != null) {
			for (@Pc(4) int local4 = 0; local4 < this.aClass191Array1.length; local4++) {
				this.aClass191Array1[local4] = null;
			}
			this.aClass191Array1 = null;
		}
	}

	@OriginalMember(owner = "client!aqi", name = "a", descriptor = "()V", line = 58)
	@Override
	void method20181() {
		if (this.aClass191Array1 != null) {
			for (@Pc(4) int local4 = 0; local4 < this.aClass191Array1.length; local4++) {
				this.aClass191Array1[local4] = null;
			}
			this.aClass191Array1 = null;
		}
	}

	@OriginalMember(owner = "client!aqi", name = "g", descriptor = "()V", line = 58)
	@Override
	void method20175() {
		if (this.aClass191Array1 != null) {
			for (@Pc(4) int local4 = 0; local4 < this.aClass191Array1.length; local4++) {
				this.aClass191Array1[local4] = null;
			}
			this.aClass191Array1 = null;
		}
	}

	@OriginalMember(owner = "client!aqi", name = "i", descriptor = "()V", line = 58)
	@Override
	void method20172() {
		if (this.aClass191Array1 != null) {
			for (@Pc(4) int local4 = 0; local4 < this.aClass191Array1.length; local4++) {
				this.aClass191Array1[local4] = null;
			}
			this.aClass191Array1 = null;
		}
	}

	@OriginalMember(owner = "client!aqi", name = "f", descriptor = "(ILclient!adt;Lclient!adt;II)V", line = 65)
	@Override
	void method20177(@OriginalArg(0) int arg0, @OriginalArg(1) Class88_Sub2 arg1, @OriginalArg(2) Class88_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (anInt2758 < 1 || anInt2758 > 3) {
			return;
		}
		@Pc(14) int local14 = this.aClass191Array1[anInt2758 - 1].anInt3349;
		OpenGL.glUseProgram(local14);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local14, "sceneTex"), 0);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(local14, "paramsWeightings"), aFloat191, aFloatArray56[0], aFloatArray56[1], aFloatArray56[2]);
		this.aClass104_Sub1_38.method3882(0);
		this.aClass104_Sub1_38.method3887(arg1);
		for (@Pc(47) int local47 = anInt2758 - 1; local47 >= 0; local47--) {
			if (aClass102_Sub1Array1[local47] != null) {
				if (local47 == 0) {
					OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local14, "remap_1"), 1);
				}
				if (local47 == 1) {
					OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local14, "remap_2"), 2);
				}
				if (local47 == 2) {
					OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local14, "remap_3"), 3);
				}
				this.aClass104_Sub1_38.method3882(local47 + 1);
				@Pc(87) Class88 local87 = aClass102_Sub1Array1[local47].method2581();
				if (local87 != null) {
					this.aClass104_Sub1_38.method3887(local87);
				}
			}
		}
	}

	@OriginalMember(owner = "client!aqi", name = "ax", descriptor = "(ILclient!adt;Lclient!adt;II)V", line = 65)
	@Override
	void method20190(@OriginalArg(0) int arg0, @OriginalArg(1) Class88_Sub2 arg1, @OriginalArg(2) Class88_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (anInt2758 < 1 || anInt2758 > 3) {
			return;
		}
		@Pc(14) int local14 = this.aClass191Array1[anInt2758 - 1].anInt3349;
		OpenGL.glUseProgram(local14);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local14, "sceneTex"), 0);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(local14, "paramsWeightings"), aFloat191, aFloatArray56[0], aFloatArray56[1], aFloatArray56[2]);
		this.aClass104_Sub1_38.method3882(0);
		this.aClass104_Sub1_38.method3887(arg1);
		for (@Pc(47) int local47 = anInt2758 - 1; local47 >= 0; local47--) {
			if (aClass102_Sub1Array1[local47] != null) {
				if (local47 == 0) {
					OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local14, "remap_1"), 1);
				}
				if (local47 == 1) {
					OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local14, "remap_2"), 2);
				}
				if (local47 == 2) {
					OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local14, "remap_3"), 3);
				}
				this.aClass104_Sub1_38.method3882(local47 + 1);
				@Pc(87) Class88 local87 = aClass102_Sub1Array1[local47].method2581();
				if (local87 != null) {
					this.aClass104_Sub1_38.method3887(local87);
				}
			}
		}
	}

	@OriginalMember(owner = "client!aqi", name = "ap", descriptor = "(ILclient!adt;Lclient!adt;II)V", line = 65)
	@Override
	void method20197(@OriginalArg(0) int arg0, @OriginalArg(1) Class88_Sub2 arg1, @OriginalArg(2) Class88_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (anInt2758 < 1 || anInt2758 > 3) {
			return;
		}
		@Pc(14) int local14 = this.aClass191Array1[anInt2758 - 1].anInt3349;
		OpenGL.glUseProgram(local14);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local14, "sceneTex"), 0);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(local14, "paramsWeightings"), aFloat191, aFloatArray56[0], aFloatArray56[1], aFloatArray56[2]);
		this.aClass104_Sub1_38.method3882(0);
		this.aClass104_Sub1_38.method3887(arg1);
		for (@Pc(47) int local47 = anInt2758 - 1; local47 >= 0; local47--) {
			if (aClass102_Sub1Array1[local47] != null) {
				if (local47 == 0) {
					OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local14, "remap_1"), 1);
				}
				if (local47 == 1) {
					OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local14, "remap_2"), 2);
				}
				if (local47 == 2) {
					OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local14, "remap_3"), 3);
				}
				this.aClass104_Sub1_38.method3882(local47 + 1);
				@Pc(87) Class88 local87 = aClass102_Sub1Array1[local47].method2581();
				if (local87 != null) {
					this.aClass104_Sub1_38.method3887(local87);
				}
			}
		}
	}

	@OriginalMember(owner = "client!aqi", name = "aq", descriptor = "(ILclient!adt;Lclient!adt;II)V", line = 65)
	@Override
	void method20198(@OriginalArg(0) int arg0, @OriginalArg(1) Class88_Sub2 arg1, @OriginalArg(2) Class88_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (anInt2758 < 1 || anInt2758 > 3) {
			return;
		}
		@Pc(14) int local14 = this.aClass191Array1[anInt2758 - 1].anInt3349;
		OpenGL.glUseProgram(local14);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local14, "sceneTex"), 0);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(local14, "paramsWeightings"), aFloat191, aFloatArray56[0], aFloatArray56[1], aFloatArray56[2]);
		this.aClass104_Sub1_38.method3882(0);
		this.aClass104_Sub1_38.method3887(arg1);
		for (@Pc(47) int local47 = anInt2758 - 1; local47 >= 0; local47--) {
			if (aClass102_Sub1Array1[local47] != null) {
				if (local47 == 0) {
					OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local14, "remap_1"), 1);
				}
				if (local47 == 1) {
					OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local14, "remap_2"), 2);
				}
				if (local47 == 2) {
					OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local14, "remap_3"), 3);
				}
				this.aClass104_Sub1_38.method3882(local47 + 1);
				@Pc(87) Class88 local87 = aClass102_Sub1Array1[local47].method2581();
				if (local87 != null) {
					this.aClass104_Sub1_38.method3887(local87);
				}
			}
		}
	}

	@OriginalMember(owner = "client!aqi", name = "av", descriptor = "(ILclient!adt;Lclient!adt;II)V", line = 65)
	@Override
	void method20186(@OriginalArg(0) int arg0, @OriginalArg(1) Class88_Sub2 arg1, @OriginalArg(2) Class88_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (anInt2758 < 1 || anInt2758 > 3) {
			return;
		}
		@Pc(14) int local14 = this.aClass191Array1[anInt2758 - 1].anInt3349;
		OpenGL.glUseProgram(local14);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local14, "sceneTex"), 0);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(local14, "paramsWeightings"), aFloat191, aFloatArray56[0], aFloatArray56[1], aFloatArray56[2]);
		this.aClass104_Sub1_38.method3882(0);
		this.aClass104_Sub1_38.method3887(arg1);
		for (@Pc(47) int local47 = anInt2758 - 1; local47 >= 0; local47--) {
			if (aClass102_Sub1Array1[local47] != null) {
				if (local47 == 0) {
					OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local14, "remap_1"), 1);
				}
				if (local47 == 1) {
					OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local14, "remap_2"), 2);
				}
				if (local47 == 2) {
					OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local14, "remap_3"), 3);
				}
				this.aClass104_Sub1_38.method3882(local47 + 1);
				@Pc(87) Class88 local87 = aClass102_Sub1Array1[local47].method2581();
				if (local87 != null) {
					this.aClass104_Sub1_38.method3887(local87);
				}
			}
		}
	}

	@OriginalMember(owner = "client!aqi", name = "w", descriptor = "(I)V", line = 88)
	@Override
	void method20178(@OriginalArg(0) int arg0) {
		OpenGL.glUseProgram(0);
		for (@Pc(3) int local3 = anInt2758; local3 >= 0; local3--) {
			this.aClass104_Sub1_38.method3882(local3);
			this.aClass104_Sub1_38.method3887(null);
		}
	}

	@OriginalMember(owner = "client!aqi", name = "ag", descriptor = "(I)V", line = 88)
	@Override
	void method20192(@OriginalArg(0) int arg0) {
		OpenGL.glUseProgram(0);
		for (@Pc(3) int local3 = anInt2758; local3 >= 0; local3--) {
			this.aClass104_Sub1_38.method3882(local3);
			this.aClass104_Sub1_38.method3887(null);
		}
	}

	@OriginalMember(owner = "client!aqi", name = "p", descriptor = "()Lclient!dg;", line = 96)
	@Override
	Class226 method20166() {
		return Class226.aClass226_22;
	}

	@OriginalMember(owner = "client!aqi", name = "aw", descriptor = "()Lclient!dg;", line = 96)
	@Override
	Class226 method20167() {
		return Class226.aClass226_22;
	}

	@OriginalMember(owner = "client!aqi", name = "as", descriptor = "()Lclient!dg;", line = 96)
	@Override
	Class226 method20168() {
		return Class226.aClass226_22;
	}

	@OriginalMember(owner = "client!aqi", name = "al", descriptor = "()I", line = 100)
	@Override
	int method20193() {
		return 2;
	}

	@OriginalMember(owner = "client!aqi", name = "u", descriptor = "()I", line = 100)
	@Override
	int method20183() {
		return 2;
	}

	@OriginalMember(owner = "client!aqi", name = "am", descriptor = "()Z", line = 104)
	@Override
	boolean method20195() {
		return aFloat191 == 1.0F || aFloatArray56[0] + aFloatArray56[1] + aFloatArray56[2] == 0.0F || aClass102_Sub1Array1[0] == null && aClass102_Sub1Array1[1] == null && aClass102_Sub1Array1[2] == null;
	}

	@OriginalMember(owner = "client!aqi", name = "c", descriptor = "()Z", line = 104)
	@Override
	boolean method20187() {
		return aFloat191 == 1.0F || aFloatArray56[0] + aFloatArray56[1] + aFloatArray56[2] == 0.0F || aClass102_Sub1Array1[0] == null && aClass102_Sub1Array1[1] == null && aClass102_Sub1Array1[2] == null;
	}

	@OriginalMember(owner = "client!aqi", name = "au", descriptor = "()Z", line = 104)
	@Override
	boolean method20188() {
		return aFloat191 == 1.0F || aFloatArray56[0] + aFloatArray56[1] + aFloatArray56[2] == 0.0F || aClass102_Sub1Array1[0] == null && aClass102_Sub1Array1[1] == null && aClass102_Sub1Array1[2] == null;
	}

	@OriginalMember(owner = "client!aqi", name = "ar", descriptor = "()Z", line = 104)
	@Override
	boolean method20196() {
		return aFloat191 == 1.0F || aFloatArray56[0] + aFloatArray56[1] + aFloatArray56[2] == 0.0F || aClass102_Sub1Array1[0] == null && aClass102_Sub1Array1[1] == null && aClass102_Sub1Array1[2] == null;
	}
}
