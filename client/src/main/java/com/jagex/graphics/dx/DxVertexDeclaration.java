package com.jagex.graphics.dx;

import com.jagex.graphics.VertexDeclaration;
import com.jagex.graphics.VertexDeclarationElement;
import com.jagex.graphics.VertexDeclarationElementComponent;
import deob.ObfuscatedName;
import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

import java.nio.ByteBuffer;

@ObfuscatedName("ait")
public class DxVertexDeclaration extends VertexDeclaration {

	@ObfuscatedName("ait.n")
	public DxToolkit renderer;

	@ObfuscatedName("ait.m")
	public long pointer = 0L;

	public DxVertexDeclaration(DxToolkit arg0, VertexDeclarationElement[] arg1) {
		super(arg1);
		this.renderer = arg0;
		byte var3 = 0;
		ByteBuffer var4 = this.renderer.temporaryBuffer;
		var4.clear();
		for (short var5 = 0; var5 < this.elements.length; var5++) {
			short var6 = 0;
			VertexDeclarationElement var7 = this.elements[var5];
			for (int var8 = 0; var8 < var7.method5776(); var8++) {
				VertexDeclarationElementComponent var9 = var7.method5777(var8);
				if (VertexDeclarationElementComponent.VERTEX == var9) {
					this.method16795(var4, var5, var6, (byte) 2, (byte) 0, (byte) 0, (byte) 0);
				} else if (VertexDeclarationElementComponent.NORMAL == var9) {
					this.method16795(var4, var5, var6, (byte) 2, (byte) 0, (byte) 3, (byte) 0);
				} else if (VertexDeclarationElementComponent.COLOR == var9) {
					this.method16795(var4, var5, var6, (byte) 4, (byte) 0, (byte) 10, (byte) 0);
				} else if (VertexDeclarationElementComponent.TEX_COORD_1 == var9) {
					this.method16795(var4, var5, var6, (byte) 0, (byte) 0, (byte) 5, var3++);
				} else if (VertexDeclarationElementComponent.TEX_COORD_2 == var9) {
					this.method16795(var4, var5, var6, (byte) 1, (byte) 0, (byte) 5, var3++);
				} else if (VertexDeclarationElementComponent.TEX_COORD_3 == var9) {
					this.method16795(var4, var5, var6, (byte) 2, (byte) 0, (byte) 5, var3++);
				} else if (VertexDeclarationElementComponent.TEX_COORD_4 == var9) {
					this.method16795(var4, var5, var6, (byte) 3, (byte) 0, (byte) 5, var3++);
				}
				var6 = (short) (var9.size + var6);
			}
		}
		this.method16795(var4, (short) 255, (short) 0, (byte) 17, (byte) 0, (byte) 0, (byte) 0);
		this.pointer = IDirect3DDevice.CreateVertexDeclaration(this.renderer.device, this.renderer.temporaryBufferAddress);
		this.renderer.method15985(this);
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
	public void delete() {
		if (this.pointer != 0L) {
			IUnknown.Release(this.pointer);
			this.pointer = 0L;
		}
		this.renderer.method16198(this);
	}

	@ObfuscatedName("ait.n()V")
	public void method16794() {
		if (this.pointer != 0L) {
			this.renderer.method19023(this.pointer);
			this.pointer = 0L;
		}
	}

	public void finalize() {
		this.method16794();
	}
}
