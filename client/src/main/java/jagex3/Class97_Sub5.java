package jagex3;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aes")
public final class Class97_Sub5 extends Class97 {

	@OriginalMember(owner = "client!aes", name = "m", descriptor = "Ljava/lang/String;")
	static final String aString15 = "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n";

	@OriginalMember(owner = "client!aes", name = "k", descriptor = "Ljava/lang/String;")
	static final String aString16 = "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n";

	@OriginalMember(owner = "client!aes", name = "n", descriptor = "Ljava/lang/String;")
	static final String aString17 = "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n";

	@OriginalMember(owner = "client!aes", name = "f", descriptor = "Ljava/lang/String;")
	static final String aString18 = "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n";

	@OriginalMember(owner = "client!aes", name = "o", descriptor = "[F")
	static final float[] aFloatArray3 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!aes", name = "u", descriptor = "Z")
	boolean aBoolean61;

	@OriginalMember(owner = "client!aes", name = "l", descriptor = "Z")
	boolean aBoolean62;

	@OriginalMember(owner = "client!aes", name = "z", descriptor = "Z")
	boolean aBoolean60 = false;

	@OriginalMember(owner = "client!aes", name = "v", descriptor = "Lclient!bu;")
	Class196 aClass196_4;

	@OriginalMember(owner = "client!aes", name = "r", descriptor = "Lclient!bu;")
	Class196 aClass196_1;

	@OriginalMember(owner = "client!aes", name = "c", descriptor = "Lclient!bu;")
	Class196 aClass196_3;

	@OriginalMember(owner = "client!aes", name = "d", descriptor = "Lclient!bu;")
	Class196 aClass196_2;

	@OriginalMember(owner = "client!aes", name = "p", descriptor = "Lclient!adt;")
	Class88_Sub2 aClass88_Sub2_1;

	@OriginalMember(owner = "client!aes", name = "w", descriptor = "Z")
	final boolean aBoolean63;

	@OriginalMember(owner = "client!aes", name = "<init>", descriptor = "(Lclient!afa;)V")
	Class97_Sub5(@OriginalArg(0) Class104_Sub1 arg0) {
		super(arg0);
		if (this.aClass104_Sub1_25.aBoolean100) {
			this.aClass196_4 = Class196.method24626(this.aClass104_Sub1_25, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
			this.aClass196_1 = Class196.method24626(this.aClass104_Sub1_25, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
			this.aClass196_3 = Class196.method24626(this.aClass104_Sub1_25, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
			this.aClass196_2 = Class196.method24626(this.aClass104_Sub1_25, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
			if (this.aClass196_4 != null & this.aClass196_1 != null & this.aClass196_3 != null & this.aClass196_2 != null) {
				this.aClass88_Sub2_1 = new Class88_Sub2(arg0, 3553, Class206.aClass206_19, Class226.aClass226_22, 2, 1, false, new byte[] { 0, -1 }, Class206.aClass206_19, false);
				this.aClass88_Sub2_1.method18092(false, false);
				this.aBoolean63 = true;
			} else {
				this.aBoolean63 = false;
			}
		} else {
			this.aBoolean63 = false;
		}
	}

	@OriginalMember(owner = "client!aes", name = "b", descriptor = "()V")
	void method2637() {
		@Pc(3) Class489 local3 = this.aClass104_Sub1_25.aClass489_3;
		if (this.aBoolean61) {
			OpenGL.glBindProgramARB(34336, this.aClass104_Sub1_25.anInt581 == Integer.MAX_VALUE ? this.aClass196_1.anInt3365 : this.aClass196_2.anInt3365);
		} else {
			OpenGL.glBindProgramARB(34336, this.aClass104_Sub1_25.anInt581 == Integer.MAX_VALUE ? this.aClass196_4.anInt3365 : this.aClass196_3.anInt3365);
		}
		@Pc(40) float local40 = (float) this.aClass104_Sub1_25.anInt581;
		@Pc(52) float local52 = local3.aFloatArray116[4] * local40 + local3.aFloatArray116[12];
		@Pc(64) float local64 = local3.aFloatArray116[5] * local40 + local3.aFloatArray116[13];
		@Pc(76) float local76 = local3.aFloatArray116[6] * local40 + local3.aFloatArray116[14];
		aFloatArray3[0] = -local3.aFloatArray116[4];
		aFloatArray3[1] = -local3.aFloatArray116[5];
		aFloatArray3[2] = -local3.aFloatArray116[6];
		aFloatArray3[3] = -(aFloatArray3[0] * local52 + aFloatArray3[1] * local64 + aFloatArray3[2] * local76);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, aFloatArray3[0], aFloatArray3[1], aFloatArray3[2], aFloatArray3[3]);
		OpenGL.glEnable(34336);
		this.aBoolean62 = true;
		this.method2638();
	}

	@OriginalMember(owner = "client!aes", name = "e", descriptor = "()Z")
	@Override
	boolean method2790() {
		return this.aBoolean63;
	}

	@OriginalMember(owner = "client!aes", name = "r", descriptor = "(Z)V")
	@Override
	void method2797(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!aes", name = "m", descriptor = "(Z)V")
	@Override
	void method2792(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!aes", name = "s", descriptor = "(II)V")
	@Override
	void method2804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aes", name = "l", descriptor = "()Z")
	@Override
	boolean method2796() {
		return this.aBoolean63;
	}

	@OriginalMember(owner = "client!aes", name = "h", descriptor = "()V")
	void method2638() {
		if (!this.aBoolean62) {
			return;
		}
		@Pc(6) float local6 = this.aClass104_Sub1_25.aFloat39;
		@Pc(10) float local10 = this.aClass104_Sub1_25.aFloat38;
		@Pc(18) float local18 = local6 - (local6 - local10) * 0.125F;
		@Pc(26) float local26 = local6 - (local6 - local10) * 0.25F;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local26, local18, 256.0F / (float) (this.aClass104_Sub1_25.aClass237_1.anInt3856 * -2052057497), (float) (this.aClass104_Sub1_25.aClass237_1.anInt3860 * -94478965) / 255.0F);
		this.aClass104_Sub1_25.method3803(1);
		this.aClass104_Sub1_25.method3792(this.aClass104_Sub1_25.aClass237_1.anInt3858 * -1393096381);
		this.aClass104_Sub1_25.method3803(0);
	}

	@OriginalMember(owner = "client!aes", name = "w", descriptor = "(Lclient!bq;I)V")
	@Override
	void method2789(@OriginalArg(0) Class88 arg0, @OriginalArg(1) int arg1) {
		if (arg0 != null) {
			if (this.aBoolean60) {
				this.aClass104_Sub1_25.method3807(0, 5890, 768);
				this.aClass104_Sub1_25.method3808(0, 5890, 770);
				this.aBoolean60 = false;
			}
			this.aClass104_Sub1_25.method3804(arg0);
			this.aClass104_Sub1_25.method3805(arg1);
		} else if (!this.aBoolean60) {
			this.aClass104_Sub1_25.method3804(this.aClass104_Sub1_25.aClass88_Sub2_2);
			this.aClass104_Sub1_25.method3805(1);
			this.aClass104_Sub1_25.method3807(0, 34168, 768);
			this.aClass104_Sub1_25.method3808(0, 34168, 770);
			this.aBoolean60 = true;
		}
	}

	@OriginalMember(owner = "client!aes", name = "o", descriptor = "(II)V")
	@Override
	void method2803(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aes", name = "u", descriptor = "()Z")
	@Override
	boolean method2802() {
		return this.aBoolean63;
	}

	@OriginalMember(owner = "client!aes", name = "n", descriptor = "(Z)V")
	@Override
	void method2801(@OriginalArg(0) boolean arg0) {
		this.aBoolean61 = arg0;
		this.aClass104_Sub1_25.method3803(1);
		this.aClass104_Sub1_25.method3804(this.aClass88_Sub2_1);
		this.aClass104_Sub1_25.method3837(34165, 7681);
		this.aClass104_Sub1_25.method3807(0, 34166, 768);
		this.aClass104_Sub1_25.method3807(2, 5890, 770);
		this.aClass104_Sub1_25.method3808(0, 34168, 770);
		this.aClass104_Sub1_25.method3803(0);
		this.method2637();
	}

	@OriginalMember(owner = "client!aes", name = "p", descriptor = "()Z")
	@Override
	boolean method2791() {
		return this.aBoolean63;
	}

	@OriginalMember(owner = "client!aes", name = "d", descriptor = "()Z")
	@Override
	boolean method2799() {
		return this.aBoolean63;
	}

	@OriginalMember(owner = "client!aes", name = "c", descriptor = "(Z)V")
	@Override
	void method2800(@OriginalArg(0) boolean arg0) {
		this.aBoolean61 = arg0;
		this.aClass104_Sub1_25.method3803(1);
		this.aClass104_Sub1_25.method3804(this.aClass88_Sub2_1);
		this.aClass104_Sub1_25.method3837(34165, 7681);
		this.aClass104_Sub1_25.method3807(0, 34166, 768);
		this.aClass104_Sub1_25.method3807(2, 5890, 770);
		this.aClass104_Sub1_25.method3808(0, 34168, 770);
		this.aClass104_Sub1_25.method3803(0);
		this.method2637();
	}

	@OriginalMember(owner = "client!aes", name = "a", descriptor = "()V")
	void method2639() {
		@Pc(3) Class489 local3 = this.aClass104_Sub1_25.aClass489_3;
		if (this.aBoolean61) {
			OpenGL.glBindProgramARB(34336, this.aClass104_Sub1_25.anInt581 == Integer.MAX_VALUE ? this.aClass196_1.anInt3365 : this.aClass196_2.anInt3365);
		} else {
			OpenGL.glBindProgramARB(34336, this.aClass104_Sub1_25.anInt581 == Integer.MAX_VALUE ? this.aClass196_4.anInt3365 : this.aClass196_3.anInt3365);
		}
		@Pc(40) float local40 = (float) this.aClass104_Sub1_25.anInt581;
		@Pc(52) float local52 = local3.aFloatArray116[4] * local40 + local3.aFloatArray116[12];
		@Pc(64) float local64 = local3.aFloatArray116[5] * local40 + local3.aFloatArray116[13];
		@Pc(76) float local76 = local3.aFloatArray116[6] * local40 + local3.aFloatArray116[14];
		aFloatArray3[0] = -local3.aFloatArray116[4];
		aFloatArray3[1] = -local3.aFloatArray116[5];
		aFloatArray3[2] = -local3.aFloatArray116[6];
		aFloatArray3[3] = -(aFloatArray3[0] * local52 + aFloatArray3[1] * local64 + aFloatArray3[2] * local76);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, aFloatArray3[0], aFloatArray3[1], aFloatArray3[2], aFloatArray3[3]);
		OpenGL.glEnable(34336);
		this.aBoolean62 = true;
		this.method2638();
	}

	@OriginalMember(owner = "client!aes", name = "v", descriptor = "()V")
	@Override
	void method2795() {
		if (this.aBoolean62) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean62 = false;
		}
		this.aClass104_Sub1_25.method3803(1);
		this.aClass104_Sub1_25.method3804(null);
		this.aClass104_Sub1_25.method3837(8448, 8448);
		this.aClass104_Sub1_25.method3807(0, 5890, 768);
		this.aClass104_Sub1_25.method3807(2, 34166, 770);
		this.aClass104_Sub1_25.method3808(0, 5890, 770);
		this.aClass104_Sub1_25.method3803(0);
		if (this.aBoolean60) {
			this.aClass104_Sub1_25.method3807(0, 5890, 768);
			this.aClass104_Sub1_25.method3808(0, 5890, 770);
			this.aBoolean60 = false;
		}
	}

	@OriginalMember(owner = "client!aes", name = "q", descriptor = "(Lclient!bq;I)V")
	@Override
	void method2806(@OriginalArg(0) Class88 arg0, @OriginalArg(1) int arg1) {
		if (arg0 != null) {
			if (this.aBoolean60) {
				this.aClass104_Sub1_25.method3807(0, 5890, 768);
				this.aClass104_Sub1_25.method3808(0, 5890, 770);
				this.aBoolean60 = false;
			}
			this.aClass104_Sub1_25.method3804(arg0);
			this.aClass104_Sub1_25.method3805(arg1);
		} else if (!this.aBoolean60) {
			this.aClass104_Sub1_25.method3804(this.aClass104_Sub1_25.aClass88_Sub2_2);
			this.aClass104_Sub1_25.method3805(1);
			this.aClass104_Sub1_25.method3807(0, 34168, 768);
			this.aClass104_Sub1_25.method3808(0, 34168, 770);
			this.aBoolean60 = true;
		}
	}

	@OriginalMember(owner = "client!aes", name = "z", descriptor = "()Z")
	@Override
	boolean method2798() {
		return this.aBoolean63;
	}

	@OriginalMember(owner = "client!aes", name = "y", descriptor = "(II)V")
	@Override
	void method2805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aes", name = "f", descriptor = "(II)V")
	@Override
	void method2794(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aes", name = "x", descriptor = "(Lclient!bq;I)V")
	@Override
	void method2807(@OriginalArg(0) Class88 arg0, @OriginalArg(1) int arg1) {
		if (arg0 != null) {
			if (this.aBoolean60) {
				this.aClass104_Sub1_25.method3807(0, 5890, 768);
				this.aClass104_Sub1_25.method3808(0, 5890, 770);
				this.aBoolean60 = false;
			}
			this.aClass104_Sub1_25.method3804(arg0);
			this.aClass104_Sub1_25.method3805(arg1);
		} else if (!this.aBoolean60) {
			this.aClass104_Sub1_25.method3804(this.aClass104_Sub1_25.aClass88_Sub2_2);
			this.aClass104_Sub1_25.method3805(1);
			this.aClass104_Sub1_25.method3807(0, 34168, 768);
			this.aClass104_Sub1_25.method3808(0, 34168, 770);
			this.aBoolean60 = true;
		}
	}

	@OriginalMember(owner = "client!aes", name = "k", descriptor = "()V")
	@Override
	void method2793() {
		if (this.aBoolean62) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean62 = false;
		}
		this.aClass104_Sub1_25.method3803(1);
		this.aClass104_Sub1_25.method3804(null);
		this.aClass104_Sub1_25.method3837(8448, 8448);
		this.aClass104_Sub1_25.method3807(0, 5890, 768);
		this.aClass104_Sub1_25.method3807(2, 34166, 770);
		this.aClass104_Sub1_25.method3808(0, 5890, 770);
		this.aClass104_Sub1_25.method3803(0);
		if (this.aBoolean60) {
			this.aClass104_Sub1_25.method3807(0, 5890, 768);
			this.aClass104_Sub1_25.method3808(0, 5890, 770);
			this.aBoolean60 = false;
		}
	}

	@OriginalMember(owner = "client!aes", name = "g", descriptor = "()V")
	void method2640() {
		@Pc(3) Class489 local3 = this.aClass104_Sub1_25.aClass489_3;
		if (this.aBoolean61) {
			OpenGL.glBindProgramARB(34336, this.aClass104_Sub1_25.anInt581 == Integer.MAX_VALUE ? this.aClass196_1.anInt3365 : this.aClass196_2.anInt3365);
		} else {
			OpenGL.glBindProgramARB(34336, this.aClass104_Sub1_25.anInt581 == Integer.MAX_VALUE ? this.aClass196_4.anInt3365 : this.aClass196_3.anInt3365);
		}
		@Pc(40) float local40 = (float) this.aClass104_Sub1_25.anInt581;
		@Pc(52) float local52 = local3.aFloatArray116[4] * local40 + local3.aFloatArray116[12];
		@Pc(64) float local64 = local3.aFloatArray116[5] * local40 + local3.aFloatArray116[13];
		@Pc(76) float local76 = local3.aFloatArray116[6] * local40 + local3.aFloatArray116[14];
		aFloatArray3[0] = -local3.aFloatArray116[4];
		aFloatArray3[1] = -local3.aFloatArray116[5];
		aFloatArray3[2] = -local3.aFloatArray116[6];
		aFloatArray3[3] = -(aFloatArray3[0] * local52 + aFloatArray3[1] * local64 + aFloatArray3[2] * local76);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, aFloatArray3[0], aFloatArray3[1], aFloatArray3[2], aFloatArray3[3]);
		OpenGL.glEnable(34336);
		this.aBoolean62 = true;
		this.method2638();
	}

	@OriginalMember(owner = "client!aes", name = "i", descriptor = "()V")
	void method2641() {
		if (!this.aBoolean62) {
			return;
		}
		@Pc(6) float local6 = this.aClass104_Sub1_25.aFloat39;
		@Pc(10) float local10 = this.aClass104_Sub1_25.aFloat38;
		@Pc(18) float local18 = local6 - (local6 - local10) * 0.125F;
		@Pc(26) float local26 = local6 - (local6 - local10) * 0.25F;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local26, local18, 256.0F / (float) (this.aClass104_Sub1_25.aClass237_1.anInt3856 * -2052057497), (float) (this.aClass104_Sub1_25.aClass237_1.anInt3860 * -94478965) / 255.0F);
		this.aClass104_Sub1_25.method3803(1);
		this.aClass104_Sub1_25.method3792(this.aClass104_Sub1_25.aClass237_1.anInt3858 * -1393096381);
		this.aClass104_Sub1_25.method3803(0);
	}

	@OriginalMember(owner = "client!aes", name = "j", descriptor = "()V")
	void method2642() {
		if (!this.aBoolean62) {
			return;
		}
		@Pc(6) float local6 = this.aClass104_Sub1_25.aFloat39;
		@Pc(10) float local10 = this.aClass104_Sub1_25.aFloat38;
		@Pc(18) float local18 = local6 - (local6 - local10) * 0.125F;
		@Pc(26) float local26 = local6 - (local6 - local10) * 0.25F;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local26, local18, 256.0F / (float) (this.aClass104_Sub1_25.aClass237_1.anInt3856 * -2052057497), (float) (this.aClass104_Sub1_25.aClass237_1.anInt3860 * -94478965) / 255.0F);
		this.aClass104_Sub1_25.method3803(1);
		this.aClass104_Sub1_25.method3792(this.aClass104_Sub1_25.aClass237_1.anInt3858 * -1393096381);
		this.aClass104_Sub1_25.method3803(0);
	}
}
