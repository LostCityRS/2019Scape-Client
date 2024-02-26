package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aey")
public final class Class96_Sub9 extends Class96 {

	@OriginalMember(owner = "client!aey", name = "e", descriptor = "C")
	static final char aChar9 = '\u0000';

	@OriginalMember(owner = "client!aey", name = "u", descriptor = "C")
	static final char aChar10 = '\u0001';

	@OriginalMember(owner = "client!aey", name = "f", descriptor = "Ljava/lang/String;")
	static final String aString23 = "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND";

	@OriginalMember(owner = "client!aey", name = "a", descriptor = "[F")
	static final float[] aFloatArray4 = new float[4];

	@OriginalMember(owner = "client!aey", name = "g", descriptor = "I")
	int anInt444;

	@OriginalMember(owner = "client!aey", name = "l", descriptor = "Lclient!bv;")
	Class197 aClass197_5;

	@OriginalMember(owner = "client!aey", name = "m", descriptor = "F")
	float aFloat22;

	@OriginalMember(owner = "client!aey", name = "j", descriptor = "Lclient!bf;")
	final Class182 aClass182_5;

	@OriginalMember(owner = "client!aey", name = "o", descriptor = "Lclient!bb;")
	Class179 aClass179_5;

	@OriginalMember(owner = "client!aey", name = "i", descriptor = "[F")
	float[] aFloatArray5;

	@OriginalMember(owner = "client!aey", name = "<init>", descriptor = "(Lclient!afm;Lclient!bf;)V")
	Class96_Sub9(@OriginalArg(0) Class102_Sub3 arg0, @OriginalArg(1) Class182 arg1) {
		super(arg0);
		this.aClass182_5 = arg1;
		if (this.aClass102_Sub3_24.aBoolean153 && this.aClass102_Sub3_24.anInt809 >= 2) {
			this.aClass179_5 = Class179.method24674(this.aClass102_Sub3_24, 34336, "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND");
			if (this.aClass179_5 == null) {
				return;
			}
			@Pc(36) int[][] local36 = Class165_Sub25.method16336(64, 256, 0, 4, 4, 3, 0.4F, false, -1965108127);
			@Pc(47) int[][] local47 = Class165_Sub25.method16336(64, 256, 8, 4, 4, 3, 0.4F, false, 1192923080);
			@Pc(49) int local49 = 0;
			this.aFloatArray5 = new float[32768];
			for (@Pc(55) int local55 = 0; local55 < 256; local55++) {
				@Pc(62) int[] local62 = local36[local55];
				@Pc(66) int[] local66 = local47[local55];
				for (@Pc(68) int local68 = 0; local68 < 64; local68++) {
					this.aFloatArray5[local49++] = (float) local62[local68] / 4096.0F;
					this.aFloatArray5[local49++] = (float) local66[local68] / 4096.0F;
				}
			}
			this.method2906();
		}
	}

	@OriginalMember(owner = "client!aey", name = "s", descriptor = "(Z)V")
	@Override
	void method2896(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!aey", name = "t", descriptor = "()Z")
	@Override
	boolean method2897() {
		return true;
	}

	@OriginalMember(owner = "client!aey", name = "v", descriptor = "()V")
	void method2906() {
		this.aClass197_5 = new Class197(this.aClass102_Sub3_24, 2);
		this.aClass197_5.method24905(0);
		this.aClass102_Sub3_24.method6386(1);
		this.aClass102_Sub3_24.method6392(-16777216);
		this.aClass102_Sub3_24.method6389(260, 7681);
		this.aClass102_Sub3_24.method6391(0, 34166, 770);
		this.aClass102_Sub3_24.method6386(0);
		OpenGL.glBindProgramARB(34336, this.aClass179_5.anInt3312);
		OpenGL.glEnable(34336);
		this.aClass197_5.method24913();
		this.aClass197_5.method24905(1);
		this.aClass102_Sub3_24.method6386(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		this.aClass102_Sub3_24.method6543(0);
		this.aClass102_Sub3_24.method6391(0, 5890, 770);
		this.aClass102_Sub3_24.method6386(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		this.aClass197_5.method24913();
	}

	@OriginalMember(owner = "client!aey", name = "w", descriptor = "()V")
	@Override
	void method2899() {
		if (this.aClass197_5 != null) {
			this.aClass197_5.method24907('\u0001');
			this.aClass102_Sub3_24.method6386(1);
			this.aClass102_Sub3_24.method6339(null);
			this.aClass102_Sub3_24.method6386(0);
		}
	}

	@OriginalMember(owner = "client!aey", name = "p", descriptor = "(Lclient!bz;I)V")
	@Override
	void method2905(@OriginalArg(0) Class84 arg0, @OriginalArg(1) int arg1) {
		this.aClass102_Sub3_24.method6339(arg0);
		this.aClass102_Sub3_24.method6543(arg1);
	}

	@OriginalMember(owner = "client!aey", name = "u", descriptor = "()V")
	@Override
	void method2885() {
		if (this.aClass197_5 != null) {
			this.aClass197_5.method24907('\u0001');
			this.aClass102_Sub3_24.method6386(1);
			this.aClass102_Sub3_24.method6339(null);
			this.aClass102_Sub3_24.method6386(0);
		}
	}

	@OriginalMember(owner = "client!aey", name = "l", descriptor = "(II)V")
	@Override
	void method2890(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass197_5 == null) {
			return;
		}
		this.aClass102_Sub3_24.method6386(1);
		@Pc(30) int local30;
		if ((arg0 & 0x80) != 0) {
			this.aClass102_Sub3_24.method6339(null);
		} else if ((arg1 & 0x1) != 1) {
			if (this.aClass182_5.aBoolean675) {
				this.aClass102_Sub3_24.method6339(this.aClass182_5.aClass84_Sub3_1);
			} else {
				this.aClass102_Sub3_24.method6339(this.aClass182_5.aClass84_Sub1Array2[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass182_5.aBoolean675) {
			this.aClass102_Sub3_24.method6339(this.aClass182_5.aClass84_Sub3_1);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat22, 0.0F, 0.0F, 1.0F);
		} else {
			local30 = this.aClass102_Sub3_24.anInt770 % 4000 * 16 / 4000;
			this.aClass102_Sub3_24.method6339(this.aClass182_5.aClass84_Sub1Array2[local30]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.aClass102_Sub3_24.method6386(0);
		if ((arg0 & 0x40) == 0) {
			aFloatArray4[0] = this.aClass102_Sub3_24.aFloat72 * this.aClass102_Sub3_24.aFloat66;
			aFloatArray4[1] = this.aClass102_Sub3_24.aFloat72 * this.aClass102_Sub3_24.aFloat74;
			aFloatArray4[2] = this.aClass102_Sub3_24.aFloat72 * this.aClass102_Sub3_24.aFloat65;
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, aFloatArray4, 0);
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

	@OriginalMember(owner = "client!aey", name = "g", descriptor = "(Lclient!bz;I)V")
	@Override
	void method2891(@OriginalArg(0) Class84 arg0, @OriginalArg(1) int arg1) {
		this.aClass102_Sub3_24.method6339(arg0);
		this.aClass102_Sub3_24.method6543(arg1);
	}

	@OriginalMember(owner = "client!aey", name = "a", descriptor = "(Z)V")
	@Override
	void method2895(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!aey", name = "r", descriptor = "()V")
	@Override
	void method2900() {
		if (this.aClass197_5 != null) {
			this.aClass197_5.method24907('\u0001');
			this.aClass102_Sub3_24.method6386(1);
			this.aClass102_Sub3_24.method6339(null);
			this.aClass102_Sub3_24.method6386(0);
		}
	}

	@OriginalMember(owner = "client!aey", name = "m", descriptor = "(Z)V")
	@Override
	void method2892(@OriginalArg(0) boolean arg0) {
		if (this.aClass197_5 == null) {
			return;
		}
		this.aClass197_5.method24907('\u0000');
		this.aClass102_Sub3_24.method6386(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(this.aClass102_Sub3_24.aClass487_23.aFloatArray114, 0);
		OpenGL.glMatrixMode(5888);
		this.aClass102_Sub3_24.method6386(0);
		if (this.anInt444 == this.aClass102_Sub3_24.anInt770) {
			return;
		}
		@Pc(41) int local41 = this.aClass102_Sub3_24.anInt770 % 5000 * 128 / 5000;
		for (@Pc(43) int local43 = 0; local43 < 64; local43++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local43, this.aFloatArray5, local41);
			local41 += 2;
		}
		if (this.aClass182_5.aBoolean675) {
			this.aFloat22 = (float) (this.aClass102_Sub3_24.anInt770 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt444 = this.aClass102_Sub3_24.anInt770;
	}

	@OriginalMember(owner = "client!aey", name = "o", descriptor = "(Z)V")
	@Override
	void method2893(@OriginalArg(0) boolean arg0) {
		if (this.aClass197_5 == null) {
			return;
		}
		this.aClass197_5.method24907('\u0000');
		this.aClass102_Sub3_24.method6386(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(this.aClass102_Sub3_24.aClass487_23.aFloatArray114, 0);
		OpenGL.glMatrixMode(5888);
		this.aClass102_Sub3_24.method6386(0);
		if (this.anInt444 == this.aClass102_Sub3_24.anInt770) {
			return;
		}
		@Pc(41) int local41 = this.aClass102_Sub3_24.anInt770 % 5000 * 128 / 5000;
		for (@Pc(43) int local43 = 0; local43 < 64; local43++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local43, this.aFloatArray5, local41);
			local41 += 2;
		}
		if (this.aClass182_5.aBoolean675) {
			this.aFloat22 = (float) (this.aClass102_Sub3_24.anInt770 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt444 = this.aClass102_Sub3_24.anInt770;
	}

	@OriginalMember(owner = "client!aey", name = "e", descriptor = "(Z)V")
	@Override
	void method2888(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!aey", name = "x", descriptor = "()V")
	@Override
	void method2898() {
		if (this.aClass197_5 != null) {
			this.aClass197_5.method24907('\u0001');
			this.aClass102_Sub3_24.method6386(1);
			this.aClass102_Sub3_24.method6339(null);
			this.aClass102_Sub3_24.method6386(0);
		}
	}

	@OriginalMember(owner = "client!aey", name = "k", descriptor = "(Z)V")
	@Override
	void method2886(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!aey", name = "y", descriptor = "()V")
	void method2907() {
		this.aClass197_5 = new Class197(this.aClass102_Sub3_24, 2);
		this.aClass197_5.method24905(0);
		this.aClass102_Sub3_24.method6386(1);
		this.aClass102_Sub3_24.method6392(-16777216);
		this.aClass102_Sub3_24.method6389(260, 7681);
		this.aClass102_Sub3_24.method6391(0, 34166, 770);
		this.aClass102_Sub3_24.method6386(0);
		OpenGL.glBindProgramARB(34336, this.aClass179_5.anInt3312);
		OpenGL.glEnable(34336);
		this.aClass197_5.method24913();
		this.aClass197_5.method24905(1);
		this.aClass102_Sub3_24.method6386(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		this.aClass102_Sub3_24.method6543(0);
		this.aClass102_Sub3_24.method6391(0, 5890, 770);
		this.aClass102_Sub3_24.method6386(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		this.aClass197_5.method24913();
	}

	@OriginalMember(owner = "client!aey", name = "j", descriptor = "(Z)V")
	@Override
	void method2889(@OriginalArg(0) boolean arg0) {
		if (this.aClass197_5 == null) {
			return;
		}
		this.aClass197_5.method24907('\u0000');
		this.aClass102_Sub3_24.method6386(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(this.aClass102_Sub3_24.aClass487_23.aFloatArray114, 0);
		OpenGL.glMatrixMode(5888);
		this.aClass102_Sub3_24.method6386(0);
		if (this.anInt444 == this.aClass102_Sub3_24.anInt770) {
			return;
		}
		@Pc(41) int local41 = this.aClass102_Sub3_24.anInt770 % 5000 * 128 / 5000;
		for (@Pc(43) int local43 = 0; local43 < 64; local43++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local43, this.aFloatArray5, local41);
			local41 += 2;
		}
		if (this.aClass182_5.aBoolean675) {
			this.aFloat22 = (float) (this.aClass102_Sub3_24.anInt770 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt444 = this.aClass102_Sub3_24.anInt770;
	}

	@OriginalMember(owner = "client!aey", name = "f", descriptor = "(Z)V")
	@Override
	void method2887(@OriginalArg(0) boolean arg0) {
		if (this.aClass197_5 == null) {
			return;
		}
		this.aClass197_5.method24907('\u0000');
		this.aClass102_Sub3_24.method6386(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadMatrixf(this.aClass102_Sub3_24.aClass487_23.aFloatArray114, 0);
		OpenGL.glMatrixMode(5888);
		this.aClass102_Sub3_24.method6386(0);
		if (this.anInt444 == this.aClass102_Sub3_24.anInt770) {
			return;
		}
		@Pc(41) int local41 = this.aClass102_Sub3_24.anInt770 % 5000 * 128 / 5000;
		for (@Pc(43) int local43 = 0; local43 < 64; local43++) {
			OpenGL.glProgramLocalParameter4fvARB(34336, local43, this.aFloatArray5, local41);
			local41 += 2;
		}
		if (this.aClass182_5.aBoolean675) {
			this.aFloat22 = (float) (this.aClass102_Sub3_24.anInt770 % 4000) / 4000.0F;
		} else {
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.anInt444 = this.aClass102_Sub3_24.anInt770;
	}

	@OriginalMember(owner = "client!aey", name = "q", descriptor = "()V")
	@Override
	void method2901() {
		if (this.aClass197_5 != null) {
			this.aClass197_5.method24907('\u0001');
			this.aClass102_Sub3_24.method6386(1);
			this.aClass102_Sub3_24.method6339(null);
			this.aClass102_Sub3_24.method6386(0);
		}
	}

	@OriginalMember(owner = "client!aey", name = "h", descriptor = "(II)V")
	@Override
	void method2903(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass197_5 == null) {
			return;
		}
		this.aClass102_Sub3_24.method6386(1);
		@Pc(30) int local30;
		if ((arg0 & 0x80) != 0) {
			this.aClass102_Sub3_24.method6339(null);
		} else if ((arg1 & 0x1) != 1) {
			if (this.aClass182_5.aBoolean675) {
				this.aClass102_Sub3_24.method6339(this.aClass182_5.aClass84_Sub3_1);
			} else {
				this.aClass102_Sub3_24.method6339(this.aClass182_5.aClass84_Sub1Array2[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass182_5.aBoolean675) {
			this.aClass102_Sub3_24.method6339(this.aClass182_5.aClass84_Sub3_1);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat22, 0.0F, 0.0F, 1.0F);
		} else {
			local30 = this.aClass102_Sub3_24.anInt770 % 4000 * 16 / 4000;
			this.aClass102_Sub3_24.method6339(this.aClass182_5.aClass84_Sub1Array2[local30]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.aClass102_Sub3_24.method6386(0);
		if ((arg0 & 0x40) == 0) {
			aFloatArray4[0] = this.aClass102_Sub3_24.aFloat72 * this.aClass102_Sub3_24.aFloat66;
			aFloatArray4[1] = this.aClass102_Sub3_24.aFloat72 * this.aClass102_Sub3_24.aFloat74;
			aFloatArray4[2] = this.aClass102_Sub3_24.aFloat72 * this.aClass102_Sub3_24.aFloat65;
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, aFloatArray4, 0);
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

	@OriginalMember(owner = "client!aey", name = "d", descriptor = "(II)V")
	@Override
	void method2902(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass197_5 == null) {
			return;
		}
		this.aClass102_Sub3_24.method6386(1);
		@Pc(30) int local30;
		if ((arg0 & 0x80) != 0) {
			this.aClass102_Sub3_24.method6339(null);
		} else if ((arg1 & 0x1) != 1) {
			if (this.aClass182_5.aBoolean675) {
				this.aClass102_Sub3_24.method6339(this.aClass182_5.aClass84_Sub3_1);
			} else {
				this.aClass102_Sub3_24.method6339(this.aClass182_5.aClass84_Sub1Array2[0]);
			}
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		} else if (this.aClass182_5.aBoolean675) {
			this.aClass102_Sub3_24.method6339(this.aClass182_5.aClass84_Sub3_1);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, this.aFloat22, 0.0F, 0.0F, 1.0F);
		} else {
			local30 = this.aClass102_Sub3_24.anInt770 % 4000 * 16 / 4000;
			this.aClass102_Sub3_24.method6339(this.aClass182_5.aClass84_Sub1Array2[local30]);
			OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
		}
		this.aClass102_Sub3_24.method6386(0);
		if ((arg0 & 0x40) == 0) {
			aFloatArray4[0] = this.aClass102_Sub3_24.aFloat72 * this.aClass102_Sub3_24.aFloat66;
			aFloatArray4[1] = this.aClass102_Sub3_24.aFloat72 * this.aClass102_Sub3_24.aFloat74;
			aFloatArray4[2] = this.aClass102_Sub3_24.aFloat72 * this.aClass102_Sub3_24.aFloat65;
			OpenGL.glProgramLocalParameter4fvARB(34336, 66, aFloatArray4, 0);
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

	@OriginalMember(owner = "client!aey", name = "z", descriptor = "(Lclient!bz;I)V")
	@Override
	void method2904(@OriginalArg(0) Class84 arg0, @OriginalArg(1) int arg1) {
		this.aClass102_Sub3_24.method6339(arg0);
		this.aClass102_Sub3_24.method6543(arg1);
	}

	@OriginalMember(owner = "client!aey", name = "i", descriptor = "()Z")
	@Override
	boolean method2894() {
		return true;
	}
}
