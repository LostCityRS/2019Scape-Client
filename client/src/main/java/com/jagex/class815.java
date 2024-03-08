package com.jagex;

import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("aeu")
public class class815 extends class74 {

	@ObfuscatedName("aeu.f")
	public class73 field9284;

	@ObfuscatedName("aeu.w")
	public int field9285;

	@ObfuscatedName("aeu.l")
	public float[] field9290;

	@ObfuscatedName("aeu.u")
	public float field9287;

	@ObfuscatedName("aeu.z")
	public class75 field9289;

	@ObfuscatedName("aeu.p")
	public final class78 field9288;

	@ObfuscatedName("aeu.d")
	public static final float[] field9286 = new float[4];

	public class815(class849 arg0, class78 arg1) {
		super(arg0);
		this.field9288 = arg1;
		if (this.field1021.field9999 && this.field1021.field9982 >= 2) {
			this.field9289 = class75.method1271(this.field1021, 34336, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
			if (this.field9289 == null) {
				return;
			}
			int[][] var3 = class1195.method749(64, 256, 0, 4, 4, 3, 0.4F, false);
			int[][] var4 = class1195.method749(64, 256, 8, 4, 4, 3, 0.4F, false);
			int var5 = 0;
			this.field9290 = new float[32768];
			for (int var6 = 0; var6 < 256; var6++) {
				int[] var7 = var3[var6];
				int[] var8 = var4[var6];
				for (int var9 = 0; var9 < 64; var9++) {
					this.field9290[var5++] = (float) var7[var9] / 4096.0F;
					this.field9290[var5++] = (float) var8[var9] / 4096.0F;
				}
			}
			this.method15339();
		}
	}

	@ObfuscatedName("aeu.e()Z")
	public boolean method1252() {
		return true;
	}

	@ObfuscatedName("aeu.b()V")
	public void method15339() {
		this.field9284 = new class73(this.field1021, 2);
		this.field9284.method1245(0);
		this.field1021.method15776(1);
		this.field1021.method15765(-16777216);
		this.field1021.method15810(260, 7681);
		this.field1021.method15781(0, 34166, 770);
		this.field1021.method15776(0);
		OpenGL.glBindProgramARB(34336, this.field9289.field1024);
		OpenGL.glEnable(34336);
		this.field9284.method1243();
		this.field9284.method1245(1);
		this.field1021.method15776(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		this.field1021.method15778(0);
		this.field1021.method15781(0, 5890, 770);
		this.field1021.method15776(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		this.field9284.method1243();
	}

	@ObfuscatedName("aeu.n(Z)V")
	public void method1263(boolean arg0) {
		if (this.field9284 == null) {
			return;
		}
		this.field9284.method1246('\u0000');
		this.field1021.method15776(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(this.field1021.field9904.field4315, 0);
		OpenGL.glMatrixMode(5888);
		this.field1021.method15776(0);
		if (this.field1021.field9872 == this.field9285) {
			return;
		}
		int var2 = this.field1021.field9872 % 5000 * 128 / 5000;
		for (int var3 = 0; var3 < 64; var3++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, var3, this.field9290, var2);
			var2 += 2;
		}
		if (this.field9288.field1040) {
			this.field9287 = (float) (this.field1021.field9872 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.field9285 = this.field1021.field9872;
	}

	@ObfuscatedName("aeu.m(Z)V")
	public void method1254(boolean arg0) {
	}

	@ObfuscatedName("aeu.k()V")
	public void method1255() {
		if (this.field9284 != null) {
			this.field9284.method1246('\u0001');
			this.field1021.method15776(1);
			this.field1021.method15777(null);
			this.field1021.method15776(0);
		}
	}

	@ObfuscatedName("aeu.f(II)V")
	public void method1256(int arg0, int arg1) {
		if (this.field9284 == null) {
			return;
		}
		this.field1021.method15776(1);
		if ((arg0 & 0x80) != 0) {
			this.field1021.method15777(null);
		} else if ((arg1 & 0x1) != 1) {
			if (this.field9288.field1040) {
				this.field1021.method15777(this.field9288.field1042);
			} else {
				this.field1021.method15777(this.field9288.field1041[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.field9288.field1040) {
			this.field1021.method15777(this.field9288.field1042);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.field9287, 0.0F, 0.0F, 1.0F);
		} else {
			int var3 = this.field1021.field9872 % 4000 * 16 / 4000;
			this.field1021.method15777(this.field9288.field1041[var3]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.field1021.method15776(0);
		if ((arg0 & 0x40) == 0) {
			field9286[0] = this.field1021.field9946 * this.field1021.field9863;
			field9286[1] = this.field1021.field9946 * this.field1021.field9944;
			field9286[2] = this.field1021.field9946 * this.field1021.field9945;
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, field9286, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		int var4 = arg0 & 0x3;
		if (var4 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (var4 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	@ObfuscatedName("aeu.w(Lbq;I)V")
	public void method1251(class70 arg0, int arg1) {
		this.field1021.method15777(arg0);
		this.field1021.method15778(arg1);
	}
}
