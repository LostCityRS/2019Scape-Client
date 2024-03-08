package com.jagex;

import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("aes")
public class class821 extends class74 {

	@ObfuscatedName("aes.w")
	public final boolean field9323;

	@ObfuscatedName("aes.l")
	public boolean field9319;

	@ObfuscatedName("aes.u")
	public boolean field9317;

	@ObfuscatedName("aes.z")
	public boolean field9312 = false;

	@ObfuscatedName("aes.p")
	public class812 field9320;

	@ObfuscatedName("aes.d")
	public class75 field9321;

	@ObfuscatedName("aes.c")
	public class75 field9322;

	@ObfuscatedName("aes.r")
	public class75 field9315;

	@ObfuscatedName("aes.v")
	public class75 field9324;

	@ObfuscatedName("aes.o")
	public static final float[] field9325 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

	public class821(class849 arg0) {
		super(arg0);
		if (this.field1021.field9999) {
			this.field9324 = class75.method1271(this.field1021, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
			this.field9315 = class75.method1271(this.field1021, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n");
			this.field9322 = class75.method1271(this.field1021, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
			this.field9321 = class75.method1271(this.field1021, 34336, "!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n");
			if (this.field9324 != null & this.field9315 != null & this.field9322 != null & this.field9321 != null) {
				this.field9320 = new class812(arg0, 3553, class109.field1270, class135.field1645, 2, 1, false, new byte[] { 0, -1 }, class109.field1270, false);
				this.field9320.method15312(false, false);
				this.field9323 = true;
			} else {
				this.field9323 = false;
			}
		} else {
			this.field9323 = false;
		}
	}

	@ObfuscatedName("aes.e()Z")
	public boolean method1252() {
		return this.field9323;
	}

	@ObfuscatedName("aes.n(Z)V")
	public void method1263(boolean arg0) {
		this.field9317 = arg0;
		this.field1021.method15776(1);
		this.field1021.method15777(this.field9320);
		this.field1021.method15810(34165, 7681);
		this.field1021.method15780(0, 34166, 768);
		this.field1021.method15780(2, 5890, 770);
		this.field1021.method15781(0, 34168, 770);
		this.field1021.method15776(0);
		this.method15343();
	}

	@ObfuscatedName("aes.m(Z)V")
	public void method1254(boolean arg0) {
	}

	@ObfuscatedName("aes.k()V")
	public void method1255() {
		if (this.field9319) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.field9319 = false;
		}
		this.field1021.method15776(1);
		this.field1021.method15777(null);
		this.field1021.method15810(8448, 8448);
		this.field1021.method15780(0, 5890, 768);
		this.field1021.method15780(2, 34166, 770);
		this.field1021.method15781(0, 5890, 770);
		this.field1021.method15776(0);
		if (this.field9312) {
			this.field1021.method15780(0, 5890, 768);
			this.field1021.method15781(0, 5890, 770);
			this.field9312 = false;
		}
	}

	@ObfuscatedName("aes.b()V")
	public void method15343() {
		class426 var1 = this.field1021.field9903;
		if (this.field9317) {
			OpenGL.glBindProgramARB(34336, this.field1021.field10028 == Integer.MAX_VALUE ? this.field9315.field1024 : this.field9321.field1024);
		} else {
			OpenGL.glBindProgramARB(34336, this.field1021.field10028 == Integer.MAX_VALUE ? this.field9324.field1024 : this.field9322.field1024);
		}
		float var2 = (float) this.field1021.field10028;
		float var3 = var1.field4315[4] * var2 + var1.field4315[12];
		float var4 = var1.field4315[5] * var2 + var1.field4315[13];
		float var5 = var1.field4315[6] * var2 + var1.field4315[14];
		field9325[0] = -var1.field4315[4];
		field9325[1] = -var1.field4315[5];
		field9325[2] = -var1.field4315[6];
		field9325[3] = -(field9325[2] * var5 + field9325[0] * var3 + field9325[1] * var4);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, field9325[0], field9325[1], field9325[2], field9325[3]);
		OpenGL.glEnable(34336);
		this.field9319 = true;
		this.method15344();
	}

	@ObfuscatedName("aes.h()V")
	public void method15344() {
		if (!this.field9319) {
			return;
		}
		float var1 = this.field1021.field9917;
		float var2 = this.field1021.field9916;
		float var3 = var1 - (var1 - var2) * 0.125F;
		float var4 = var1 - (var1 - var2) * 0.25F;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, var4, var3, 256.0F / (float) this.field1021.field9892.field1573, (float) this.field1021.field9892.field1577 / 255.0F);
		this.field1021.method15776(1);
		this.field1021.method15765(this.field1021.field9892.field1575);
		this.field1021.method15776(0);
	}

	@ObfuscatedName("aes.w(Lbq;I)V")
	public void method1251(class70 arg0, int arg1) {
		if (arg0 != null) {
			if (this.field9312) {
				this.field1021.method15780(0, 5890, 768);
				this.field1021.method15781(0, 5890, 770);
				this.field9312 = false;
			}
			this.field1021.method15777(arg0);
			this.field1021.method15778(arg1);
		} else if (!this.field9312) {
			this.field1021.method15777(this.field1021.field9974);
			this.field1021.method15778(1);
			this.field1021.method15780(0, 34168, 768);
			this.field1021.method15781(0, 34168, 770);
			this.field9312 = true;
		}
	}

	@ObfuscatedName("aes.f(II)V")
	public void method1256(int arg0, int arg1) {
	}
}
