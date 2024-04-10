package com.jagex.graphics.scenegraph;

import com.jagex.math.*;
import deob.ObfuscatedName;

@ObfuscatedName("yq")
public class GraphNode {

	@ObfuscatedName("yq.e")
	public ScaleRotTrans field8173 = new ScaleRotTrans();

	@ObfuscatedName("yq.n")
	public ScaleRotTrans field8170 = new ScaleRotTrans();

	@ObfuscatedName("yq.m")
	public boolean field8171 = true;

	@ObfuscatedName("yq.k")
	public ScaleRotTrans field8172 = new ScaleRotTrans();

	@ObfuscatedName("yq.f")
	public boolean field8177 = true;

	@ObfuscatedName("yq.w")
	public Matrix4x3 field8179;

	@ObfuscatedName("yq.l")
	public boolean field8175;

	@ObfuscatedName("yq.u")
	public boolean field8176;

	@ObfuscatedName("yq.z")
	public GraphNode field8169;

	@ObfuscatedName("yq.p")
	public GraphNode field8178;

	@ObfuscatedName("yq.d")
	public GraphNode field8174;

	public GraphNode() {
		new Matrix4x4();
		new Matrix4x4();
		this.field8179 = new Matrix4x3();
		this.field8175 = true;
		this.field8176 = true;
		this.field8169 = null;
		this.field8178 = null;
		this.field8174 = null;
	}

	@ObfuscatedName("yq.ae()Loe;")
	public final ScaleRotTrans method10525() {
		return this.field8173;
	}

	@ObfuscatedName("yq.ag()Loe;")
	public final ScaleRotTrans getTransform() {
		if (this.field8171) {
			this.field8171 = false;
			this.field8170.setTo(this.field8173);
			if (this.field8169 != null) {
				this.field8170.multiply(this.field8169.getTransform());
			}
		}
		return this.field8170;
	}

	@ObfuscatedName("yq.ah()Loe;")
	public final ScaleRotTrans method10527() {
		if (this.field8177) {
			this.field8177 = false;
			this.field8172.setTo(this.getTransform());
			this.field8172.invert();
		}
		return this.field8170;
	}

	@ObfuscatedName("yq.al()Lou;")
	public final Matrix4x3 method10533() {
		if (this.field8175) {
			this.field8175 = false;
			this.field8179.setToTransform(this.getTransform());
		}
		return this.field8179;
	}

	@ObfuscatedName("yq.ac(Loe;)V")
	public final void method10529(ScaleRotTrans arg0) {
		this.field8173.setTo(arg0);
		this.method10535();
		if (this.field8178 != null) {
			this.field8178.method10549();
		}
	}

	@ObfuscatedName("yq.ai(Lov;)V")
	public final void setRotation(Quaternion arg0) {
		this.field8173.rot.setTo(arg0);
		this.method10535();
		if (this.field8178 != null) {
			this.field8178.method10549();
		}
	}

	@ObfuscatedName("yq.aw(Lox;)V")
	public final void method10531(Vector3 arg0) {
		this.field8173.trans.setTo(arg0);
		this.method10535();
		if (this.field8178 != null) {
			this.field8178.method10549();
		}
	}

	@ObfuscatedName("yq.as(FFF)V")
	public final void method10532(float arg0, float arg1, float arg2) {
		this.setPosition(this.field8173.trans.x + arg0, this.field8173.trans.y + arg1, this.field8173.trans.z + arg2);
	}

	@ObfuscatedName("yq.at(FFF)V")
	public final void setPosition(float arg0, float arg1, float arg2) {
		this.field8173.trans.setTo(arg0, arg1, arg2);
		this.method10535();
		if (this.field8178 != null) {
			this.field8178.method10549();
		}
	}

	@ObfuscatedName("yq.ad(Loe;)V")
	public final void method10534(ScaleRotTrans arg0) {
		if (this.field8169 == null) {
			this.method10529(arg0);
		} else {
			ScaleRotTrans var2 = new ScaleRotTrans(arg0);
			var2.multiply(this.field8169.method10527());
			this.method10529(var2);
		}
	}

	@ObfuscatedName("yq.am()V")
	public final void method10535() {
		this.field8171 = true;
		this.field8177 = true;
		this.field8175 = true;
		this.field8176 = true;
	}

	@ObfuscatedName("yq.au()V")
	public final void method10549() {
		this.method10535();
		if (this.field8178 != null) {
			this.field8178.method10549();
		}
		if (this.field8174 != null) {
			this.field8174.method10549();
		}
	}

	@ObfuscatedName("yq.ar()V")
	public final void method10537() {
		if (this.field8169 != null) {
			GraphNode var1 = this.field8169.field8178;
			if (var1 == this) {
				this.field8169.field8178 = this.field8174;
			} else {
				while (var1.field8174 != this) {
					var1 = var1.field8174;
				}
				var1.field8174 = this.field8174;
			}
		}
		this.method10535();
		if (this.field8178 != null) {
			this.field8178.method10549();
			GraphNode var2 = this.field8178;
			while (true) {
				var2.field8173.multiply(this.field8173);
				var2.field8169 = this.field8169;
				if (var2.field8174 == null) {
					var2.field8174 = this.field8169.field8178;
					this.field8169.field8178 = this.field8178;
					break;
				}
				var2 = var2.field8174;
			}
		}
		this.field8169 = null;
		this.field8174 = null;
		this.field8178 = null;
	}
}
