package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aeu")
public class Class97_Sub7 extends Class97 {

	@OriginalMember(owner = "client!aeu", name = "n", descriptor = "Ljava/lang/String;")
	static final String aString19 = "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND";

	@OriginalMember(owner = "client!aeu", name = "m", descriptor = "C")
	static final char aChar7 = '\u0000';

	@OriginalMember(owner = "client!aeu", name = "k", descriptor = "C")
	static final char aChar8 = '\u0001';

	@OriginalMember(owner = "client!aeu", name = "d", descriptor = "[F")
	static final float[] aFloatArray5 = new float[4];

	@OriginalMember(owner = "client!aeu", name = "f", descriptor = "Lclient!be;")
	Class182 aClass182_4;

	@OriginalMember(owner = "client!aeu", name = "w", descriptor = "I")
	int anInt429;

	@OriginalMember(owner = "client!aeu", name = "u", descriptor = "F")
	float aFloat25;

	@OriginalMember(owner = "client!aeu", name = "p", descriptor = "Lclient!bz;")
	final Class199 aClass199_4;

	@OriginalMember(owner = "client!aeu", name = "z", descriptor = "Lclient!bu;")
	Class196 aClass196_5;

	@OriginalMember(owner = "client!aeu", name = "l", descriptor = "[F")
	float[] aFloatArray6;

	@OriginalMember(owner = "client!aeu", name = "<init>", descriptor = "(Lclient!afa;Lclient!bz;)V", line = 23)
	Class97_Sub7(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) Class199 arg1) {
		super(arg0);
		this.aClass199_4 = arg1;
		if (this.aClass104_Sub1_25.aBoolean100 && this.aClass104_Sub1_25.anInt573 >= 2) {
			this.aClass196_5 = Class196.method24614(this.aClass104_Sub1_25, 34336, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
			if (this.aClass196_5 == null) {
				return;
			}
			@Pc(36) int[][] local36 = Class174.method24339(64, 256, 0, 4, 4, 3, 0.4F, false, 196764202);
			@Pc(47) int[][] local47 = Class174.method24339(64, 256, 8, 4, 4, 3, 0.4F, false, -715326154);
			@Pc(49) int local49 = 0;
			this.aFloatArray6 = new float[32768];
			for (@Pc(55) int local55 = 0; local55 < 256; local55++) {
				@Pc(62) int[] local62 = local36[local55];
				@Pc(66) int[] local66 = local47[local55];
				for (@Pc(68) int local68 = 0; local68 < 64; local68++) {
					this.aFloatArray6[local49++] = (float) local62[local68] / 4096.0F;
					this.aFloatArray6[local49++] = (float) local66[local68] / 4096.0F;
				}
			}
			this.method2683();
		}
	}

	@OriginalMember(owner = "client!aeu", name = "e", descriptor = "()Z", line = 45)
	@Override
	boolean method2790() {
		return true;
	}

	@OriginalMember(owner = "client!aeu", name = "u", descriptor = "()Z", line = 45)
	@Override
	boolean method2802() {
		return true;
	}

	@OriginalMember(owner = "client!aeu", name = "l", descriptor = "()Z", line = 45)
	@Override
	boolean method2796() {
		return true;
	}

	@OriginalMember(owner = "client!aeu", name = "z", descriptor = "()Z", line = 45)
	@Override
	boolean method2798() {
		return true;
	}

	@OriginalMember(owner = "client!aeu", name = "p", descriptor = "()Z", line = 45)
	@Override
	boolean method2791() {
		return true;
	}

	@OriginalMember(owner = "client!aeu", name = "d", descriptor = "()Z", line = 45)
	@Override
	boolean method2799() {
		return true;
	}

	@OriginalMember(owner = "client!aeu", name = "b", descriptor = "()V", line = 49)
	void method2683() {
		this.aClass182_4 = new Class182(this.aClass104_Sub1_25, 2);
		this.aClass182_4.method24557(0);
		this.aClass104_Sub1_25.method3882(1);
		this.aClass104_Sub1_25.method3906(-16777216);
		this.aClass104_Sub1_25.method3894(260, 7681);
		this.aClass104_Sub1_25.method3903(0, 34166, 770);
		this.aClass104_Sub1_25.method3882(0);
		OpenGL.glBindProgramARB(34336, this.aClass196_5.anInt3365);
		OpenGL.glEnable(34336);
		this.aClass182_4.method24559();
		this.aClass182_4.method24557(1);
		this.aClass104_Sub1_25.method3882(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		this.aClass104_Sub1_25.method3888(0);
		this.aClass104_Sub1_25.method3903(0, 5890, 770);
		this.aClass104_Sub1_25.method3882(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		this.aClass182_4.method24559();
	}

	@OriginalMember(owner = "client!aeu", name = "h", descriptor = "()V", line = 49)
	void method2684() {
		this.aClass182_4 = new Class182(this.aClass104_Sub1_25, 2);
		this.aClass182_4.method24557(0);
		this.aClass104_Sub1_25.method3882(1);
		this.aClass104_Sub1_25.method3906(-16777216);
		this.aClass104_Sub1_25.method3894(260, 7681);
		this.aClass104_Sub1_25.method3903(0, 34166, 770);
		this.aClass104_Sub1_25.method3882(0);
		OpenGL.glBindProgramARB(34336, this.aClass196_5.anInt3365);
		OpenGL.glEnable(34336);
		this.aClass182_4.method24559();
		this.aClass182_4.method24557(1);
		this.aClass104_Sub1_25.method3882(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		this.aClass104_Sub1_25.method3888(0);
		this.aClass104_Sub1_25.method3903(0, 5890, 770);
		this.aClass104_Sub1_25.method3882(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		this.aClass182_4.method24559();
	}

	@OriginalMember(owner = "client!aeu", name = "n", descriptor = "(Z)V", line = 73)
	@Override
	void method2801(@OriginalArg(0) boolean arg0) {
		if (this.aClass182_4 == null) {
			return;
		}
		this.aClass182_4.method24563('\u0000');
		this.aClass104_Sub1_25.method3882(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(this.aClass104_Sub1_25.aClass489_4.aFloatArray116, 0);
		OpenGL.glMatrixMode(5888);
		this.aClass104_Sub1_25.method3882(0);
		if (this.anInt429 == this.aClass104_Sub1_25.anInt530) {
			return;
		}
		@Pc(41) int local41 = this.aClass104_Sub1_25.anInt530 % 5000 * 128 / 5000;
		for (@Pc(43) int local43 = 0; local43 < 64; local43++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local43, this.aFloatArray6, local41);
			local41 += 2;
		}
		if (this.aClass199_4.aBoolean577) {
			this.aFloat25 = (float) (this.aClass104_Sub1_25.anInt530 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt429 = this.aClass104_Sub1_25.anInt530;
	}

	@OriginalMember(owner = "client!aeu", name = "c", descriptor = "(Z)V", line = 73)
	@Override
	void method2800(@OriginalArg(0) boolean arg0) {
		if (this.aClass182_4 == null) {
			return;
		}
		this.aClass182_4.method24563('\u0000');
		this.aClass104_Sub1_25.method3882(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(this.aClass104_Sub1_25.aClass489_4.aFloatArray116, 0);
		OpenGL.glMatrixMode(5888);
		this.aClass104_Sub1_25.method3882(0);
		if (this.anInt429 == this.aClass104_Sub1_25.anInt530) {
			return;
		}
		@Pc(41) int local41 = this.aClass104_Sub1_25.anInt530 % 5000 * 128 / 5000;
		for (@Pc(43) int local43 = 0; local43 < 64; local43++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local43, this.aFloatArray6, local41);
			local41 += 2;
		}
		if (this.aClass199_4.aBoolean577) {
			this.aFloat25 = (float) (this.aClass104_Sub1_25.anInt530 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt429 = this.aClass104_Sub1_25.anInt530;
	}

	@OriginalMember(owner = "client!aeu", name = "m", descriptor = "(Z)V", line = 96)
	@Override
	void method2792(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!aeu", name = "r", descriptor = "(Z)V", line = 96)
	@Override
	void method2797(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!aeu", name = "k", descriptor = "()V", line = 99)
	@Override
	void method2793() {
		if (this.aClass182_4 != null) {
			this.aClass182_4.method24563('\u0001');
			this.aClass104_Sub1_25.method3882(1);
			this.aClass104_Sub1_25.method3887(null);
			this.aClass104_Sub1_25.method3882(0);
		}
	}

	@OriginalMember(owner = "client!aeu", name = "v", descriptor = "()V", line = 99)
	@Override
	void method2795() {
		if (this.aClass182_4 != null) {
			this.aClass182_4.method24563('\u0001');
			this.aClass104_Sub1_25.method3882(1);
			this.aClass104_Sub1_25.method3887(null);
			this.aClass104_Sub1_25.method3882(0);
		}
	}

	@OriginalMember(owner = "client!aeu", name = "y", descriptor = "(II)V", line = 107)
	@Override
	void method2805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass182_4 == null) {
			return;
		}
		this.aClass104_Sub1_25.method3882(1);
		@Pc(30) int local30;
		if ((arg0 & 0x80) != 0) {
			this.aClass104_Sub1_25.method3887(null);
		} else if ((arg1 & 0x1) != 1) {
			if (this.aClass199_4.aBoolean577) {
				this.aClass104_Sub1_25.method3887(this.aClass199_4.aClass88_Sub3_2);
			} else {
				this.aClass104_Sub1_25.method3887(this.aClass199_4.aClass88_Sub2Array2[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass199_4.aBoolean577) {
			this.aClass104_Sub1_25.method3887(this.aClass199_4.aClass88_Sub3_2);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat25, 0.0F, 0.0F, 1.0F);
		} else {
			local30 = this.aClass104_Sub1_25.anInt530 % 4000 * 16 / 4000;
			this.aClass104_Sub1_25.method3887(this.aClass199_4.aClass88_Sub2Array2[local30]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.aClass104_Sub1_25.method3882(0);
		if ((arg0 & 0x40) == 0) {
			aFloatArray5[0] = this.aClass104_Sub1_25.aFloat42 * this.aClass104_Sub1_25.aFloat32;
			aFloatArray5[1] = this.aClass104_Sub1_25.aFloat42 * this.aClass104_Sub1_25.aFloat40;
			aFloatArray5[2] = this.aClass104_Sub1_25.aFloat42 * this.aClass104_Sub1_25.aFloat41;
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, aFloatArray5, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local30 = arg0 & 0x3;
		if (local30 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local30 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!aeu", name = "o", descriptor = "(II)V", line = 107)
	@Override
	void method2803(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass182_4 == null) {
			return;
		}
		this.aClass104_Sub1_25.method3882(1);
		@Pc(30) int local30;
		if ((arg0 & 0x80) != 0) {
			this.aClass104_Sub1_25.method3887(null);
		} else if ((arg1 & 0x1) != 1) {
			if (this.aClass199_4.aBoolean577) {
				this.aClass104_Sub1_25.method3887(this.aClass199_4.aClass88_Sub3_2);
			} else {
				this.aClass104_Sub1_25.method3887(this.aClass199_4.aClass88_Sub2Array2[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass199_4.aBoolean577) {
			this.aClass104_Sub1_25.method3887(this.aClass199_4.aClass88_Sub3_2);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat25, 0.0F, 0.0F, 1.0F);
		} else {
			local30 = this.aClass104_Sub1_25.anInt530 % 4000 * 16 / 4000;
			this.aClass104_Sub1_25.method3887(this.aClass199_4.aClass88_Sub2Array2[local30]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.aClass104_Sub1_25.method3882(0);
		if ((arg0 & 0x40) == 0) {
			aFloatArray5[0] = this.aClass104_Sub1_25.aFloat42 * this.aClass104_Sub1_25.aFloat32;
			aFloatArray5[1] = this.aClass104_Sub1_25.aFloat42 * this.aClass104_Sub1_25.aFloat40;
			aFloatArray5[2] = this.aClass104_Sub1_25.aFloat42 * this.aClass104_Sub1_25.aFloat41;
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, aFloatArray5, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local30 = arg0 & 0x3;
		if (local30 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local30 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!aeu", name = "s", descriptor = "(II)V", line = 107)
	@Override
	void method2804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass182_4 == null) {
			return;
		}
		this.aClass104_Sub1_25.method3882(1);
		@Pc(30) int local30;
		if ((arg0 & 0x80) != 0) {
			this.aClass104_Sub1_25.method3887(null);
		} else if ((arg1 & 0x1) != 1) {
			if (this.aClass199_4.aBoolean577) {
				this.aClass104_Sub1_25.method3887(this.aClass199_4.aClass88_Sub3_2);
			} else {
				this.aClass104_Sub1_25.method3887(this.aClass199_4.aClass88_Sub2Array2[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass199_4.aBoolean577) {
			this.aClass104_Sub1_25.method3887(this.aClass199_4.aClass88_Sub3_2);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat25, 0.0F, 0.0F, 1.0F);
		} else {
			local30 = this.aClass104_Sub1_25.anInt530 % 4000 * 16 / 4000;
			this.aClass104_Sub1_25.method3887(this.aClass199_4.aClass88_Sub2Array2[local30]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.aClass104_Sub1_25.method3882(0);
		if ((arg0 & 0x40) == 0) {
			aFloatArray5[0] = this.aClass104_Sub1_25.aFloat42 * this.aClass104_Sub1_25.aFloat32;
			aFloatArray5[1] = this.aClass104_Sub1_25.aFloat42 * this.aClass104_Sub1_25.aFloat40;
			aFloatArray5[2] = this.aClass104_Sub1_25.aFloat42 * this.aClass104_Sub1_25.aFloat41;
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, aFloatArray5, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local30 = arg0 & 0x3;
		if (local30 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local30 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!aeu", name = "f", descriptor = "(II)V", line = 107)
	@Override
	void method2794(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass182_4 == null) {
			return;
		}
		this.aClass104_Sub1_25.method3882(1);
		@Pc(30) int local30;
		if ((arg0 & 0x80) != 0) {
			this.aClass104_Sub1_25.method3887(null);
		} else if ((arg1 & 0x1) != 1) {
			if (this.aClass199_4.aBoolean577) {
				this.aClass104_Sub1_25.method3887(this.aClass199_4.aClass88_Sub3_2);
			} else {
				this.aClass104_Sub1_25.method3887(this.aClass199_4.aClass88_Sub2Array2[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass199_4.aBoolean577) {
			this.aClass104_Sub1_25.method3887(this.aClass199_4.aClass88_Sub3_2);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat25, 0.0F, 0.0F, 1.0F);
		} else {
			local30 = this.aClass104_Sub1_25.anInt530 % 4000 * 16 / 4000;
			this.aClass104_Sub1_25.method3887(this.aClass199_4.aClass88_Sub2Array2[local30]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.aClass104_Sub1_25.method3882(0);
		if ((arg0 & 0x40) == 0) {
			aFloatArray5[0] = this.aClass104_Sub1_25.aFloat42 * this.aClass104_Sub1_25.aFloat32;
			aFloatArray5[1] = this.aClass104_Sub1_25.aFloat42 * this.aClass104_Sub1_25.aFloat40;
			aFloatArray5[2] = this.aClass104_Sub1_25.aFloat42 * this.aClass104_Sub1_25.aFloat41;
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, aFloatArray5, 0);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
		}
		local30 = arg0 & 0x3;
		if (local30 == 2) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
		} else if (local30 == 3) {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!aeu", name = "w", descriptor = "(Lclient!bq;I)V", line = 145)
	@Override
	void method2789(@OriginalArg(0) Class88 arg0, @OriginalArg(1) int arg1) {
		this.aClass104_Sub1_25.method3887(arg0);
		this.aClass104_Sub1_25.method3888(arg1);
	}

	@OriginalMember(owner = "client!aeu", name = "q", descriptor = "(Lclient!bq;I)V", line = 145)
	@Override
	void method2806(@OriginalArg(0) Class88 arg0, @OriginalArg(1) int arg1) {
		this.aClass104_Sub1_25.method3887(arg0);
		this.aClass104_Sub1_25.method3888(arg1);
	}

	@OriginalMember(owner = "client!aeu", name = "x", descriptor = "(Lclient!bq;I)V", line = 145)
	@Override
	void method2807(@OriginalArg(0) Class88 arg0, @OriginalArg(1) int arg1) {
		this.aClass104_Sub1_25.method3887(arg0);
		this.aClass104_Sub1_25.method3888(arg1);
	}
}
