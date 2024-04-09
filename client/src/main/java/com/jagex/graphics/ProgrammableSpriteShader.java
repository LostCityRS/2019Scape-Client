package com.jagex.graphics;

import com.jagex.game.client.PrimitiveType;
import com.jagex.math.Vector4;
import deob.ObfuscatedName;

@ObfuscatedName("ahz")
public final class ProgrammableSpriteShader extends SpriteShader {

	@ObfuscatedName("ahz.p")
	public GpuShader field10532;

	@ObfuscatedName("ahz.g")
	public final GpuProgram[] field10527 = new GpuProgram[3];

	@ObfuscatedName("ahz.i")
	public final int[][] field10533 = new int[3][7];

	@ObfuscatedName("ahz.j")
	public int[] field10534;

	@ObfuscatedName("ahz.t")
	public Vector4 field10535 = new Vector4(1.0F, 1.0F, 1.0F, 1.0F);

	@ObfuscatedName("ahz.ae")
	public Vector4 field10536 = new Vector4(0.0F, 0.0F, 0.0F, 0.0F);

	public ProgrammableSpriteShader(GpuToolkit arg0) throws ShaderException {
		super(arg0);
		this.method16651();
	}

	@ObfuscatedName("ahz.u(B)Z")
	public boolean method16651() throws ShaderException {
		this.field10532 = this.field3002.createShader("Sprite");
		ProgramUniform var1 = this.field10532.getUniform("WVPMatrix");
		ProgramUniform var2 = this.field10532.getUniform("SpriteSampler");
		ProgramUniform var3 = this.field10532.getUniform("MaskSampler");
		ProgramUniform var4 = this.field10532.getUniform("MulColour");
		ProgramUniform var5 = this.field10532.getUniform("AddColour");
		ProgramUniform var6 = this.field10532.getUniform("SpriteTexCoordMatrix");
		ProgramUniform var7 = this.field10532.getUniform("MaskTexCoordMatrix");
		this.field10527[0] = this.field10532.getProgram("Normal");
		this.field10527[1] = this.field10532.getProgram("Masked");
		this.field10527[2] = this.field10532.getProgram("AlphaTex");
		for (int var8 = 0; var8 < 3; var8++) {
			int var9 = this.field10532.getProgramIndex(this.field10527[var8]);
			this.field10533[var8][0] = var1.getLocation(var9);
			this.field10533[var8][1] = var2.getLocation(var9);
			this.field10533[var8][2] = var3.getLocation(var9);
			this.field10533[var8][5] = var4.getLocation(var9);
			this.field10533[var8][6] = var5.getLocation(var9);
			this.field10533[var8][3] = var6.getLocation(var9);
			this.field10533[var8][4] = var7.getLocation(var9);
		}
		this.field10532.setCurrentProgram(this.field10527[0]);
		return true;
	}

	@ObfuscatedName("ahz.e(II)V")
	public void method5050(int arg0, int arg1) {
		switch(arg0) {
			case 0:
				this.field10535.method6249(arg1);
				this.field10536.method6249(0);
				break;
			case 1:
				this.field10535.method6249(-1);
				this.field10536.method6249(0);
				break;
			case 2:
				this.field10535.method6249(arg1);
				this.field10536.method6249(0);
				break;
			case 3:
				this.field10535.method6249(arg1 & 0xFF000000 | 0xFFFFFF);
				this.field10536.method6249(arg1 & 0xFFFFFF);
				break;
			case 4:
				this.field10535.method6249(-1);
				this.field10536.method6249(arg1);
				this.field10536.method6259();
		}
	}

	@ObfuscatedName("ahz.z(I)V")
	public void method16649() {
		this.field10532.setUniform1i(this.field10534[1], 0, this.field2997);
		this.field3002.method16006(this.field2995);
		this.field10532.setUniform4fv(this.field10534[0], this.field2995);
		this.field10532.setUniform2fv(this.field10534[3], this.field2998);
		this.field10532.setUniform4f(this.field10534[5], this.field10535.field4244, this.field10535.field4243, this.field10535.field4242, this.field10535.field4245);
		this.field10532.setUniform4f(this.field10534[6], this.field10536.field4244, this.field10536.field4243, this.field10536.field4242, this.field10536.field4245);
		this.field3002.setStreamSource(0, this.field3000);
		this.field3002.setVertexDeclaration(this.field2994);
		this.field3002.drawPrimitive(PrimitiveType.TRIANGLEFAN, this.field3001, 2);
	}

	@ObfuscatedName("ahz.n()V")
	public void method5051() {
		this.field10532.setCurrentProgram(this.field10527[0]);
		this.field10532.enable();
		this.field10534 = this.field10533[this.field10532.getCurrentProgramIndex()];
		this.method16649();
	}

	@ObfuscatedName("ahz.m()V")
	public void method5054() {
		this.field10532.setCurrentProgram(this.field10527[1]);
		this.field10532.enable();
		this.field10534 = this.field10533[this.field10532.getCurrentProgramIndex()];
		this.field10532.setUniform1i(this.field10534[2], 1, this.field2996);
		this.field10532.setUniform2fv(this.field10534[4], this.field2999);
		this.method16649();
	}
}
