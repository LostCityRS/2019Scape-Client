package com.jagex.graphics.dx;

import com.jagex.graphics.VertexDeclarationElement;
import com.jagex.graphics.VertexDeclaration;
import com.jagex.graphics.VertexDeclarationElementComponent;
import deob.ObfuscatedName;
import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

import java.nio.ByteBuffer;

@ObfuscatedName("ait")
public class Direct3DVertexDeclaration extends VertexDeclaration {

	@ObfuscatedName("ait.n")
	public Direct3DRenderer field10620;

	@ObfuscatedName("ait.m")
	public long field10621 = 0L;

	public Direct3DVertexDeclaration(Direct3DRenderer arg0, VertexDeclarationElement[] arg1) {
		super(arg1);
		this.field10620 = arg0;
		byte var3 = 0;
		ByteBuffer var4 = this.field10620.field10071;
		var4.clear();
		for (short var5 = 0; var5 < this.field3241.length; var5++) {
			short var6 = 0;
			VertexDeclarationElement var7 = this.field3241[var5];
			for (int var8 = 0; var8 < var7.method5776(); var8++) {
				VertexDeclarationElementComponent var9 = var7.method5777(var8);
				if (VertexDeclarationElementComponent.field3310 == var9) {
					this.method16795(var4, var5, var6, (byte) 2, (byte) 0, (byte) 0, (byte) 0);
				} else if (VertexDeclarationElementComponent.field3301 == var9) {
					this.method16795(var4, var5, var6, (byte) 2, (byte) 0, (byte) 3, (byte) 0);
				} else if (VertexDeclarationElementComponent.field3311 == var9) {
					this.method16795(var4, var5, var6, (byte) 4, (byte) 0, (byte) 10, (byte) 0);
				} else if (VertexDeclarationElementComponent.field3303 == var9) {
					this.method16795(var4, var5, var6, (byte) 0, (byte) 0, (byte) 5, var3++);
				} else if (VertexDeclarationElementComponent.field3300 == var9) {
					this.method16795(var4, var5, var6, (byte) 1, (byte) 0, (byte) 5, var3++);
				} else if (VertexDeclarationElementComponent.field3305 == var9) {
					this.method16795(var4, var5, var6, (byte) 2, (byte) 0, (byte) 5, var3++);
				} else if (VertexDeclarationElementComponent.field3306 == var9) {
					this.method16795(var4, var5, var6, (byte) 3, (byte) 0, (byte) 5, var3++);
				}
				var6 = (short) (var9.field3313 + var6);
			}
		}
		this.method16795(var4, (short) 255, (short) 0, (byte) 17, (byte) 0, (byte) 0, (byte) 0);
		this.field10621 = IDirect3DDevice.CreateVertexDeclaration(this.field10620.device, this.field10620.field10046);
		this.field10620.method15985(this);
	}

	@ObfuscatedName("ait.e(Ljava/nio/ByteBuffer;SSBBBB)V")
	public void method16795(ByteBuffer arg0, short arg1, short arg2, byte arg3, byte arg4, byte arg5, byte arg6) {
		arg0.putShort(arg1);
		arg0.putShort(arg2);
		arg0.put(arg3);
		arg0.put(arg4);
		arg0.put(arg5);
		arg0.put(arg6);
	}

	@ObfuscatedName("ait.m()V")
	public void method1010() {
		if (this.field10621 != 0L) {
			IUnknown.Release(this.field10621);
			this.field10621 = 0L;
		}
		this.field10620.method16198(this);
	}

	@ObfuscatedName("ait.n()V")
	public void method16794() {
		if (this.field10621 != 0L) {
			this.field10620.method19023(this.field10621);
			this.field10621 = 0L;
		}
	}

	public void finalize() {
		this.method16794();
	}
}
