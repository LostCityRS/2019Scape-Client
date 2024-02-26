package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aeu")
public final class Class96_Sub7 extends Class96 {

	@OriginalMember(owner = "client!aeu", name = "l", descriptor = "Ljava/lang/String;")
	static final String aString19 = "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n";

	@OriginalMember(owner = "client!aeu", name = "f", descriptor = "Ljava/lang/String;")
	static final String aString20 = "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n";

	@OriginalMember(owner = "client!aeu", name = "u", descriptor = "Ljava/lang/String;")
	static final String aString21 = "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n";

	@OriginalMember(owner = "client!aeu", name = "e", descriptor = "Ljava/lang/String;")
	static final String aString22 = "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n";

	@OriginalMember(owner = "client!aeu", name = "w", descriptor = "[F")
	static final float[] aFloatArray2 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!aeu", name = "i", descriptor = "Z")
	boolean aBoolean74;

	@OriginalMember(owner = "client!aeu", name = "m", descriptor = "Z")
	boolean aBoolean75;

	@OriginalMember(owner = "client!aeu", name = "o", descriptor = "Z")
	boolean aBoolean76 = false;

	@OriginalMember(owner = "client!aeu", name = "x", descriptor = "Lclient!bb;")
	Class179 aClass179_4;

	@OriginalMember(owner = "client!aeu", name = "k", descriptor = "Lclient!bb;")
	Class179 aClass179_2;

	@OriginalMember(owner = "client!aeu", name = "s", descriptor = "Lclient!bb;")
	Class179 aClass179_1;

	@OriginalMember(owner = "client!aeu", name = "a", descriptor = "Lclient!bb;")
	Class179 aClass179_3;

	@OriginalMember(owner = "client!aeu", name = "j", descriptor = "Lclient!adm;")
	Class84_Sub1 aClass84_Sub1_1;

	@OriginalMember(owner = "client!aeu", name = "g", descriptor = "Z")
	final boolean aBoolean73;

	@OriginalMember(owner = "client!aeu", name = "<init>", descriptor = "(Lclient!afm;)V")
	Class96_Sub7(@OriginalArg(0) Class102_Sub3 arg0) {
		super(arg0);
		if (this.aClass102_Sub3_24.aBoolean153) {
			this.aClass179_4 = Class179.method24674(this.aClass102_Sub3_24, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
			this.aClass179_2 = Class179.method24674(this.aClass102_Sub3_24, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
			this.aClass179_1 = Class179.method24674(this.aClass102_Sub3_24, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
			this.aClass179_3 = Class179.method24674(this.aClass102_Sub3_24, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
			if (this.aClass179_4 != null & this.aClass179_2 != null & this.aClass179_1 != null & this.aClass179_3 != null) {
				this.aClass84_Sub1_1 = new Class84_Sub1(arg0, 3553, Class210.aClass210_17, Class236.aClass236_21, 2, 1, false, new byte[] { 0, -1 }, Class210.aClass210_17, false);
				this.aClass84_Sub1_1.method18355(false, false);
				this.aBoolean73 = true;
			} else {
				this.aBoolean73 = false;
			}
		} else {
			this.aBoolean73 = false;
		}
	}

	@OriginalMember(owner = "client!aeu", name = "e", descriptor = "(Z)V")
	@Override
	void method2888(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!aeu", name = "t", descriptor = "()Z")
	@Override
	boolean method2897() {
		return this.aBoolean73;
	}

	@OriginalMember(owner = "client!aeu", name = "f", descriptor = "(Z)V")
	@Override
	void method2887(@OriginalArg(0) boolean arg0) {
		this.aBoolean75 = arg0;
		this.aClass102_Sub3_24.method6386(1);
		this.aClass102_Sub3_24.method6339(this.aClass84_Sub1_1);
		this.aClass102_Sub3_24.method6389(34165, 7681);
		this.aClass102_Sub3_24.method6390(0, 34166, 768);
		this.aClass102_Sub3_24.method6390(2, 5890, 770);
		this.aClass102_Sub3_24.method6391(0, 34168, 770);
		this.aClass102_Sub3_24.method6386(0);
		this.method2734();
	}

	@OriginalMember(owner = "client!aeu", name = "u", descriptor = "()V")
	@Override
	void method2885() {
		if (this.aBoolean74) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean74 = false;
		}
		this.aClass102_Sub3_24.method6386(1);
		this.aClass102_Sub3_24.method6339(null);
		this.aClass102_Sub3_24.method6389(8448, 8448);
		this.aClass102_Sub3_24.method6390(0, 5890, 768);
		this.aClass102_Sub3_24.method6390(2, 34166, 770);
		this.aClass102_Sub3_24.method6391(0, 5890, 770);
		this.aClass102_Sub3_24.method6386(0);
		if (this.aBoolean76) {
			this.aClass102_Sub3_24.method6390(0, 5890, 768);
			this.aClass102_Sub3_24.method6391(0, 5890, 770);
			this.aBoolean76 = false;
		}
	}

	@OriginalMember(owner = "client!aeu", name = "k", descriptor = "(Z)V")
	@Override
	void method2886(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!aeu", name = "y", descriptor = "()V")
	void method2732() {
		if (!this.aBoolean74) {
			return;
		}
		@Pc(6) float local6 = this.aClass102_Sub3_24.aFloat64;
		@Pc(10) float local10 = this.aClass102_Sub3_24.aFloat63;
		@Pc(18) float local18 = local6 - (local6 - local10) * 0.125F;
		@Pc(26) float local26 = local6 - (local6 - local10) * 0.25F;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local26, local18, 256.0F / (float) (this.aClass102_Sub3_24.aClass229_2.anInt3685 * -692202347), (float) (this.aClass102_Sub3_24.aClass229_2.anInt3686 * -1722392473) / 255.0F);
		this.aClass102_Sub3_24.method6386(1);
		this.aClass102_Sub3_24.method6392(this.aClass102_Sub3_24.aClass229_2.anInt3687 * 1682209477);
		this.aClass102_Sub3_24.method6386(0);
	}

	@OriginalMember(owner = "client!aeu", name = "j", descriptor = "(Z)V")
	@Override
	void method2889(@OriginalArg(0) boolean arg0) {
		this.aBoolean75 = arg0;
		this.aClass102_Sub3_24.method6386(1);
		this.aClass102_Sub3_24.method6339(this.aClass84_Sub1_1);
		this.aClass102_Sub3_24.method6389(34165, 7681);
		this.aClass102_Sub3_24.method6390(0, 34166, 768);
		this.aClass102_Sub3_24.method6390(2, 5890, 770);
		this.aClass102_Sub3_24.method6391(0, 34168, 770);
		this.aClass102_Sub3_24.method6386(0);
		this.method2734();
	}

	@OriginalMember(owner = "client!aeu", name = "c", descriptor = "()V")
	void method2733() {
		@Pc(3) Class487 local3 = this.aClass102_Sub3_24.aClass487_28;
		if (this.aBoolean75) {
			OpenGL.glBindProgramARB(34336, this.aClass102_Sub3_24.anInt814 == Integer.MAX_VALUE ? this.aClass179_2.anInt3312 : this.aClass179_3.anInt3312);
		} else {
			OpenGL.glBindProgramARB(34336, this.aClass102_Sub3_24.anInt814 == Integer.MAX_VALUE ? this.aClass179_4.anInt3312 : this.aClass179_1.anInt3312);
		}
		@Pc(40) float local40 = (float) this.aClass102_Sub3_24.anInt814;
		@Pc(52) float local52 = local3.aFloatArray114[4] * local40 + local3.aFloatArray114[12];
		@Pc(64) float local64 = local3.aFloatArray114[5] * local40 + local3.aFloatArray114[13];
		@Pc(76) float local76 = local3.aFloatArray114[6] * local40 + local3.aFloatArray114[14];
		aFloatArray2[0] = -local3.aFloatArray114[4];
		aFloatArray2[1] = -local3.aFloatArray114[5];
		aFloatArray2[2] = -local3.aFloatArray114[6];
		aFloatArray2[3] = -(aFloatArray2[0] * local52 + aFloatArray2[1] * local64 + aFloatArray2[2] * local76);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, aFloatArray2[0], aFloatArray2[1], aFloatArray2[2], aFloatArray2[3]);
		OpenGL.glEnable(34336);
		this.aBoolean74 = true;
		this.method2732();
	}

	@OriginalMember(owner = "client!aeu", name = "h", descriptor = "(II)V")
	@Override
	void method2903(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aeu", name = "i", descriptor = "()Z")
	@Override
	boolean method2894() {
		return this.aBoolean73;
	}

	@OriginalMember(owner = "client!aeu", name = "m", descriptor = "(Z)V")
	@Override
	void method2892(@OriginalArg(0) boolean arg0) {
		this.aBoolean75 = arg0;
		this.aClass102_Sub3_24.method6386(1);
		this.aClass102_Sub3_24.method6339(this.aClass84_Sub1_1);
		this.aClass102_Sub3_24.method6389(34165, 7681);
		this.aClass102_Sub3_24.method6390(0, 34166, 768);
		this.aClass102_Sub3_24.method6390(2, 5890, 770);
		this.aClass102_Sub3_24.method6391(0, 34168, 770);
		this.aClass102_Sub3_24.method6386(0);
		this.method2734();
	}

	@OriginalMember(owner = "client!aeu", name = "o", descriptor = "(Z)V")
	@Override
	void method2893(@OriginalArg(0) boolean arg0) {
		this.aBoolean75 = arg0;
		this.aClass102_Sub3_24.method6386(1);
		this.aClass102_Sub3_24.method6339(this.aClass84_Sub1_1);
		this.aClass102_Sub3_24.method6389(34165, 7681);
		this.aClass102_Sub3_24.method6390(0, 34166, 768);
		this.aClass102_Sub3_24.method6390(2, 5890, 770);
		this.aClass102_Sub3_24.method6391(0, 34168, 770);
		this.aClass102_Sub3_24.method6386(0);
		this.method2734();
	}

	@OriginalMember(owner = "client!aeu", name = "p", descriptor = "(Lclient!bz;I)V")
	@Override
	void method2905(@OriginalArg(0) Class84 arg0, @OriginalArg(1) int arg1) {
		if (arg0 != null) {
			if (this.aBoolean76) {
				this.aClass102_Sub3_24.method6390(0, 5890, 768);
				this.aClass102_Sub3_24.method6391(0, 5890, 770);
				this.aBoolean76 = false;
			}
			this.aClass102_Sub3_24.method6339(arg0);
			this.aClass102_Sub3_24.method6543(arg1);
		} else if (!this.aBoolean76) {
			this.aClass102_Sub3_24.method6339(this.aClass102_Sub3_24.aClass84_Sub1_2);
			this.aClass102_Sub3_24.method6543(1);
			this.aClass102_Sub3_24.method6390(0, 34168, 768);
			this.aClass102_Sub3_24.method6391(0, 34168, 770);
			this.aBoolean76 = true;
		}
	}

	@OriginalMember(owner = "client!aeu", name = "g", descriptor = "(Lclient!bz;I)V")
	@Override
	void method2891(@OriginalArg(0) Class84 arg0, @OriginalArg(1) int arg1) {
		if (arg0 != null) {
			if (this.aBoolean76) {
				this.aClass102_Sub3_24.method6390(0, 5890, 768);
				this.aClass102_Sub3_24.method6391(0, 5890, 770);
				this.aBoolean76 = false;
			}
			this.aClass102_Sub3_24.method6339(arg0);
			this.aClass102_Sub3_24.method6543(arg1);
		} else if (!this.aBoolean76) {
			this.aClass102_Sub3_24.method6339(this.aClass102_Sub3_24.aClass84_Sub1_2);
			this.aClass102_Sub3_24.method6543(1);
			this.aClass102_Sub3_24.method6390(0, 34168, 768);
			this.aClass102_Sub3_24.method6391(0, 34168, 770);
			this.aBoolean76 = true;
		}
	}

	@OriginalMember(owner = "client!aeu", name = "s", descriptor = "(Z)V")
	@Override
	void method2896(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!aeu", name = "a", descriptor = "(Z)V")
	@Override
	void method2895(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!aeu", name = "x", descriptor = "()V")
	@Override
	void method2898() {
		if (this.aBoolean74) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean74 = false;
		}
		this.aClass102_Sub3_24.method6386(1);
		this.aClass102_Sub3_24.method6339(null);
		this.aClass102_Sub3_24.method6389(8448, 8448);
		this.aClass102_Sub3_24.method6390(0, 5890, 768);
		this.aClass102_Sub3_24.method6390(2, 34166, 770);
		this.aClass102_Sub3_24.method6391(0, 5890, 770);
		this.aClass102_Sub3_24.method6386(0);
		if (this.aBoolean76) {
			this.aClass102_Sub3_24.method6390(0, 5890, 768);
			this.aClass102_Sub3_24.method6391(0, 5890, 770);
			this.aBoolean76 = false;
		}
	}

	@OriginalMember(owner = "client!aeu", name = "w", descriptor = "()V")
	@Override
	void method2899() {
		if (this.aBoolean74) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean74 = false;
		}
		this.aClass102_Sub3_24.method6386(1);
		this.aClass102_Sub3_24.method6339(null);
		this.aClass102_Sub3_24.method6389(8448, 8448);
		this.aClass102_Sub3_24.method6390(0, 5890, 768);
		this.aClass102_Sub3_24.method6390(2, 34166, 770);
		this.aClass102_Sub3_24.method6391(0, 5890, 770);
		this.aClass102_Sub3_24.method6386(0);
		if (this.aBoolean76) {
			this.aClass102_Sub3_24.method6390(0, 5890, 768);
			this.aClass102_Sub3_24.method6391(0, 5890, 770);
			this.aBoolean76 = false;
		}
	}

	@OriginalMember(owner = "client!aeu", name = "r", descriptor = "()V")
	@Override
	void method2900() {
		if (this.aBoolean74) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean74 = false;
		}
		this.aClass102_Sub3_24.method6386(1);
		this.aClass102_Sub3_24.method6339(null);
		this.aClass102_Sub3_24.method6389(8448, 8448);
		this.aClass102_Sub3_24.method6390(0, 5890, 768);
		this.aClass102_Sub3_24.method6390(2, 34166, 770);
		this.aClass102_Sub3_24.method6391(0, 5890, 770);
		this.aClass102_Sub3_24.method6386(0);
		if (this.aBoolean76) {
			this.aClass102_Sub3_24.method6390(0, 5890, 768);
			this.aClass102_Sub3_24.method6391(0, 5890, 770);
			this.aBoolean76 = false;
		}
	}

	@OriginalMember(owner = "client!aeu", name = "q", descriptor = "()V")
	@Override
	void method2901() {
		if (this.aBoolean74) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean74 = false;
		}
		this.aClass102_Sub3_24.method6386(1);
		this.aClass102_Sub3_24.method6339(null);
		this.aClass102_Sub3_24.method6389(8448, 8448);
		this.aClass102_Sub3_24.method6390(0, 5890, 768);
		this.aClass102_Sub3_24.method6390(2, 34166, 770);
		this.aClass102_Sub3_24.method6391(0, 5890, 770);
		this.aClass102_Sub3_24.method6386(0);
		if (this.aBoolean76) {
			this.aClass102_Sub3_24.method6390(0, 5890, 768);
			this.aClass102_Sub3_24.method6391(0, 5890, 770);
			this.aBoolean76 = false;
		}
	}

	@OriginalMember(owner = "client!aeu", name = "d", descriptor = "(II)V")
	@Override
	void method2902(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aeu", name = "z", descriptor = "(Lclient!bz;I)V")
	@Override
	void method2904(@OriginalArg(0) Class84 arg0, @OriginalArg(1) int arg1) {
		if (arg0 != null) {
			if (this.aBoolean76) {
				this.aClass102_Sub3_24.method6390(0, 5890, 768);
				this.aClass102_Sub3_24.method6391(0, 5890, 770);
				this.aBoolean76 = false;
			}
			this.aClass102_Sub3_24.method6339(arg0);
			this.aClass102_Sub3_24.method6543(arg1);
		} else if (!this.aBoolean76) {
			this.aClass102_Sub3_24.method6339(this.aClass102_Sub3_24.aClass84_Sub1_2);
			this.aClass102_Sub3_24.method6543(1);
			this.aClass102_Sub3_24.method6390(0, 34168, 768);
			this.aClass102_Sub3_24.method6391(0, 34168, 770);
			this.aBoolean76 = true;
		}
	}

	@OriginalMember(owner = "client!aeu", name = "v", descriptor = "()V")
	void method2734() {
		@Pc(3) Class487 local3 = this.aClass102_Sub3_24.aClass487_28;
		if (this.aBoolean75) {
			OpenGL.glBindProgramARB(34336, this.aClass102_Sub3_24.anInt814 == Integer.MAX_VALUE ? this.aClass179_2.anInt3312 : this.aClass179_3.anInt3312);
		} else {
			OpenGL.glBindProgramARB(34336, this.aClass102_Sub3_24.anInt814 == Integer.MAX_VALUE ? this.aClass179_4.anInt3312 : this.aClass179_1.anInt3312);
		}
		@Pc(40) float local40 = (float) this.aClass102_Sub3_24.anInt814;
		@Pc(52) float local52 = local3.aFloatArray114[4] * local40 + local3.aFloatArray114[12];
		@Pc(64) float local64 = local3.aFloatArray114[5] * local40 + local3.aFloatArray114[13];
		@Pc(76) float local76 = local3.aFloatArray114[6] * local40 + local3.aFloatArray114[14];
		aFloatArray2[0] = -local3.aFloatArray114[4];
		aFloatArray2[1] = -local3.aFloatArray114[5];
		aFloatArray2[2] = -local3.aFloatArray114[6];
		aFloatArray2[3] = -(aFloatArray2[0] * local52 + aFloatArray2[1] * local64 + aFloatArray2[2] * local76);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, aFloatArray2[0], aFloatArray2[1], aFloatArray2[2], aFloatArray2[3]);
		OpenGL.glEnable(34336);
		this.aBoolean74 = true;
		this.method2732();
	}

	@OriginalMember(owner = "client!aeu", name = "n", descriptor = "()V")
	void method2735() {
		@Pc(3) Class487 local3 = this.aClass102_Sub3_24.aClass487_28;
		if (this.aBoolean75) {
			OpenGL.glBindProgramARB(34336, this.aClass102_Sub3_24.anInt814 == Integer.MAX_VALUE ? this.aClass179_2.anInt3312 : this.aClass179_3.anInt3312);
		} else {
			OpenGL.glBindProgramARB(34336, this.aClass102_Sub3_24.anInt814 == Integer.MAX_VALUE ? this.aClass179_4.anInt3312 : this.aClass179_1.anInt3312);
		}
		@Pc(40) float local40 = (float) this.aClass102_Sub3_24.anInt814;
		@Pc(52) float local52 = local3.aFloatArray114[4] * local40 + local3.aFloatArray114[12];
		@Pc(64) float local64 = local3.aFloatArray114[5] * local40 + local3.aFloatArray114[13];
		@Pc(76) float local76 = local3.aFloatArray114[6] * local40 + local3.aFloatArray114[14];
		aFloatArray2[0] = -local3.aFloatArray114[4];
		aFloatArray2[1] = -local3.aFloatArray114[5];
		aFloatArray2[2] = -local3.aFloatArray114[6];
		aFloatArray2[3] = -(aFloatArray2[0] * local52 + aFloatArray2[1] * local64 + aFloatArray2[2] * local76);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, aFloatArray2[0], aFloatArray2[1], aFloatArray2[2], aFloatArray2[3]);
		OpenGL.glEnable(34336);
		this.aBoolean74 = true;
		this.method2732();
	}

	@OriginalMember(owner = "client!aeu", name = "l", descriptor = "(II)V")
	@Override
	void method2890(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aeu", name = "b", descriptor = "()V")
	void method2736() {
		@Pc(3) Class487 local3 = this.aClass102_Sub3_24.aClass487_28;
		if (this.aBoolean75) {
			OpenGL.glBindProgramARB(34336, this.aClass102_Sub3_24.anInt814 == Integer.MAX_VALUE ? this.aClass179_2.anInt3312 : this.aClass179_3.anInt3312);
		} else {
			OpenGL.glBindProgramARB(34336, this.aClass102_Sub3_24.anInt814 == Integer.MAX_VALUE ? this.aClass179_4.anInt3312 : this.aClass179_1.anInt3312);
		}
		@Pc(40) float local40 = (float) this.aClass102_Sub3_24.anInt814;
		@Pc(52) float local52 = local3.aFloatArray114[4] * local40 + local3.aFloatArray114[12];
		@Pc(64) float local64 = local3.aFloatArray114[5] * local40 + local3.aFloatArray114[13];
		@Pc(76) float local76 = local3.aFloatArray114[6] * local40 + local3.aFloatArray114[14];
		aFloatArray2[0] = -local3.aFloatArray114[4];
		aFloatArray2[1] = -local3.aFloatArray114[5];
		aFloatArray2[2] = -local3.aFloatArray114[6];
		aFloatArray2[3] = -(aFloatArray2[0] * local52 + aFloatArray2[1] * local64 + aFloatArray2[2] * local76);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, aFloatArray2[0], aFloatArray2[1], aFloatArray2[2], aFloatArray2[3]);
		OpenGL.glEnable(34336);
		this.aBoolean74 = true;
		this.method2732();
	}

	@OriginalMember(owner = "client!aeu", name = "ax", descriptor = "()V")
	void method2737() {
		@Pc(3) Class487 local3 = this.aClass102_Sub3_24.aClass487_28;
		if (this.aBoolean75) {
			OpenGL.glBindProgramARB(34336, this.aClass102_Sub3_24.anInt814 == Integer.MAX_VALUE ? this.aClass179_2.anInt3312 : this.aClass179_3.anInt3312);
		} else {
			OpenGL.glBindProgramARB(34336, this.aClass102_Sub3_24.anInt814 == Integer.MAX_VALUE ? this.aClass179_4.anInt3312 : this.aClass179_1.anInt3312);
		}
		@Pc(40) float local40 = (float) this.aClass102_Sub3_24.anInt814;
		@Pc(52) float local52 = local3.aFloatArray114[4] * local40 + local3.aFloatArray114[12];
		@Pc(64) float local64 = local3.aFloatArray114[5] * local40 + local3.aFloatArray114[13];
		@Pc(76) float local76 = local3.aFloatArray114[6] * local40 + local3.aFloatArray114[14];
		aFloatArray2[0] = -local3.aFloatArray114[4];
		aFloatArray2[1] = -local3.aFloatArray114[5];
		aFloatArray2[2] = -local3.aFloatArray114[6];
		aFloatArray2[3] = -(aFloatArray2[0] * local52 + aFloatArray2[1] * local64 + aFloatArray2[2] * local76);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, aFloatArray2[0], aFloatArray2[1], aFloatArray2[2], aFloatArray2[3]);
		OpenGL.glEnable(34336);
		this.aBoolean74 = true;
		this.method2732();
	}

	@OriginalMember(owner = "client!aeu", name = "ay", descriptor = "()V")
	void method2738() {
		@Pc(3) Class487 local3 = this.aClass102_Sub3_24.aClass487_28;
		if (this.aBoolean75) {
			OpenGL.glBindProgramARB(34336, this.aClass102_Sub3_24.anInt814 == Integer.MAX_VALUE ? this.aClass179_2.anInt3312 : this.aClass179_3.anInt3312);
		} else {
			OpenGL.glBindProgramARB(34336, this.aClass102_Sub3_24.anInt814 == Integer.MAX_VALUE ? this.aClass179_4.anInt3312 : this.aClass179_1.anInt3312);
		}
		@Pc(40) float local40 = (float) this.aClass102_Sub3_24.anInt814;
		@Pc(52) float local52 = local3.aFloatArray114[4] * local40 + local3.aFloatArray114[12];
		@Pc(64) float local64 = local3.aFloatArray114[5] * local40 + local3.aFloatArray114[13];
		@Pc(76) float local76 = local3.aFloatArray114[6] * local40 + local3.aFloatArray114[14];
		aFloatArray2[0] = -local3.aFloatArray114[4];
		aFloatArray2[1] = -local3.aFloatArray114[5];
		aFloatArray2[2] = -local3.aFloatArray114[6];
		aFloatArray2[3] = -(aFloatArray2[0] * local52 + aFloatArray2[1] * local64 + aFloatArray2[2] * local76);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, aFloatArray2[0], aFloatArray2[1], aFloatArray2[2], aFloatArray2[3]);
		OpenGL.glEnable(34336);
		this.aBoolean74 = true;
		this.method2732();
	}

	@OriginalMember(owner = "client!aeu", name = "ai", descriptor = "()V")
	void method2739() {
		if (!this.aBoolean74) {
			return;
		}
		@Pc(6) float local6 = this.aClass102_Sub3_24.aFloat64;
		@Pc(10) float local10 = this.aClass102_Sub3_24.aFloat63;
		@Pc(18) float local18 = local6 - (local6 - local10) * 0.125F;
		@Pc(26) float local26 = local6 - (local6 - local10) * 0.25F;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local26, local18, 256.0F / (float) (this.aClass102_Sub3_24.aClass229_2.anInt3685 * -692202347), (float) (this.aClass102_Sub3_24.aClass229_2.anInt3686 * -1722392473) / 255.0F);
		this.aClass102_Sub3_24.method6386(1);
		this.aClass102_Sub3_24.method6392(this.aClass102_Sub3_24.aClass229_2.anInt3687 * 1682209477);
		this.aClass102_Sub3_24.method6386(0);
	}

	@OriginalMember(owner = "client!aeu", name = "aq", descriptor = "()V")
	void method2740() {
		if (!this.aBoolean74) {
			return;
		}
		@Pc(6) float local6 = this.aClass102_Sub3_24.aFloat64;
		@Pc(10) float local10 = this.aClass102_Sub3_24.aFloat63;
		@Pc(18) float local18 = local6 - (local6 - local10) * 0.125F;
		@Pc(26) float local26 = local6 - (local6 - local10) * 0.25F;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local26, local18, 256.0F / (float) (this.aClass102_Sub3_24.aClass229_2.anInt3685 * -692202347), (float) (this.aClass102_Sub3_24.aClass229_2.anInt3686 * -1722392473) / 255.0F);
		this.aClass102_Sub3_24.method6386(1);
		this.aClass102_Sub3_24.method6392(this.aClass102_Sub3_24.aClass229_2.anInt3687 * 1682209477);
		this.aClass102_Sub3_24.method6386(0);
	}
}
