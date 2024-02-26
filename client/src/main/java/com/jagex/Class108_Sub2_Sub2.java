package com.jagex;

import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!apb")
public final class Class108_Sub2_Sub2 extends Class108_Sub2 {

	@OriginalMember(owner = "client!apb", name = "g", descriptor = "I")
	int anInt2473;

	@OriginalMember(owner = "client!apb", name = "l", descriptor = "I")
	int anInt2474;

	@OriginalMember(owner = "client!apb", name = "i", descriptor = "Z")
	boolean aBoolean430;

	@OriginalMember(owner = "client!apb", name = "m", descriptor = "Z")
	boolean aBoolean431;

	@OriginalMember(owner = "client!apb", name = "t", descriptor = "Lclient!afm;")
	final Class102_Sub3 aClass102_Sub3_31;

	@OriginalMember(owner = "client!apb", name = "f", descriptor = "Ljava/awt/Canvas;")
	final Canvas aCanvas2;

	@OriginalMember(owner = "client!apb", name = "e", descriptor = "Lclient!jaggl/OpenGL;")
	final OpenGL anOpenGL2;

	@OriginalMember(owner = "client!apb", name = "u", descriptor = "J")
	final long aLong154;

	@OriginalMember(owner = "client!apb", name = "<init>", descriptor = "(Lclient!afm;Ljava/awt/Canvas;J)V")
	Class108_Sub2_Sub2(@OriginalArg(0) Class102_Sub3 arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) long arg2) {
		this.aBoolean430 = false;
		this.aBoolean431 = false;
		this.aClass102_Sub3_31 = arg0;
		this.aCanvas2 = arg1;
		this.anOpenGL2 = arg0.anOpenGL1;
		this.aLong154 = arg2;
		this.method17909();
	}

	@OriginalMember(owner = "client!apb", name = "<init>", descriptor = "(Lclient!afm;Ljava/awt/Canvas;)V")
	Class108_Sub2_Sub2(@OriginalArg(0) Class102_Sub3 arg0, @OriginalArg(1) Canvas arg1) {
		this(arg0, arg1, arg0.anOpenGL1.prepareSurface(arg1));
	}

	@OriginalMember(owner = "client!apb", name = "j", descriptor = "()Z")
	@Override
	boolean method24045() {
		if (this.aBoolean430) {
			throw new IllegalStateException();
		}
		if (!this.aBoolean431) {
			this.anOpenGL2.setSurface(this.aLong154);
			this.aBoolean431 = true;
		}
		this.aClass102_Sub3_31.method6333();
		return true;
	}

	@OriginalMember(owner = "client!apb", name = "t", descriptor = "()I")
	@Override
	public int method24036() {
		return this.anInt2474;
	}

	@OriginalMember(owner = "client!apb", name = "x", descriptor = "()V")
	@Override
	public void method24038() {
		if (this.aBoolean430) {
			throw new IllegalStateException();
		}
		this.anOpenGL2.releaseSurface(this.aCanvas2, this.aLong154);
		this.aBoolean430 = true;
		this.aBoolean431 = false;
	}

	@OriginalMember(owner = "client!apb", name = "d", descriptor = "(II)V")
	@Override
	void method24052(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean430) {
			throw new IllegalStateException();
		}
		this.anOpenGL2.surfaceResized(this.aLong154);
		this.method17909();
		if (this.aClass102_Sub3_31.method20677(2056260403) == this) {
			this.aClass102_Sub3_31.method6334();
		}
	}

	@OriginalMember(owner = "client!apb", name = "w", descriptor = "()V")
	void method17909() {
		@Pc(3) Dimension local3 = this.aCanvas2.getSize();
		this.anInt2473 = local3.height;
		this.anInt2474 = local3.width;
	}

	@OriginalMember(owner = "client!apb", name = "q", descriptor = "()I")
	@Override
	public int method24053() {
		if (this.aBoolean430) {
			throw new IllegalStateException();
		}
		this.anOpenGL2.swapBuffers(this.aLong154);
		return 0;
	}

	@OriginalMember(owner = "client!apb", name = "h", descriptor = "(II)I")
	@Override
	public int method24059(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 0;
	}

	@OriginalMember(owner = "client!apb", name = "u", descriptor = "()Z")
	@Override
	boolean method24039() {
		if (this.aBoolean430) {
			throw new IllegalStateException();
		}
		if (!this.aBoolean431) {
			this.anOpenGL2.setSurface(this.aLong154);
			this.aBoolean431 = true;
		}
		this.aClass102_Sub3_31.method6333();
		return true;
	}

	@OriginalMember(owner = "client!apb", name = "l", descriptor = "()Z")
	@Override
	boolean method24044() {
		return true;
	}

	@OriginalMember(owner = "client!apb", name = "e", descriptor = "()V")
	@Override
	public void method24046() {
		if (this.aBoolean430) {
			throw new IllegalStateException();
		}
		this.anOpenGL2.releaseSurface(this.aCanvas2, this.aLong154);
		this.aBoolean430 = true;
		this.aBoolean431 = false;
	}

	@OriginalMember(owner = "client!apb", name = "g", descriptor = "()I")
	@Override
	public int method24041() {
		return this.anInt2474;
	}

	@OriginalMember(owner = "client!apb", name = "i", descriptor = "()I")
	@Override
	public int method24042() {
		return this.anInt2474;
	}

	@OriginalMember(owner = "client!apb", name = "m", descriptor = "()I")
	@Override
	public int method24035() {
		return this.anInt2474;
	}

	@OriginalMember(owner = "client!apb", name = "o", descriptor = "()I")
	@Override
	public int method24043() {
		return this.anInt2473;
	}

	@OriginalMember(owner = "client!apb", name = "z", descriptor = "(II)V")
	@Override
	void method24055(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean430) {
			throw new IllegalStateException();
		}
		this.anOpenGL2.surfaceResized(this.aLong154);
		this.method17909();
		if (this.aClass102_Sub3_31.method20677(1910804815) == this) {
			this.aClass102_Sub3_31.method6334();
		}
	}

	@OriginalMember(owner = "client!apb", name = "k", descriptor = "()Z")
	@Override
	boolean method24048() {
		return true;
	}

	@OriginalMember(owner = "client!apb", name = "p", descriptor = "()I")
	@Override
	public int method24056() {
		if (this.aBoolean430) {
			throw new IllegalStateException();
		}
		this.anOpenGL2.swapBuffers(this.aLong154);
		return 0;
	}

	@OriginalMember(owner = "client!apb", name = "a", descriptor = "()Z")
	@Override
	boolean method24040() {
		if (this.aBoolean430) {
			throw new IllegalStateException();
		}
		if (!this.aBoolean431) {
			this.anOpenGL2.setSurface(this.aLong154);
			this.aBoolean431 = true;
		}
		this.aClass102_Sub3_31.method6333();
		return true;
	}

	@OriginalMember(owner = "client!apb", name = "f", descriptor = "()I")
	@Override
	public int method24037() {
		return this.anInt2473;
	}

	@OriginalMember(owner = "client!apb", name = "v", descriptor = "()I")
	@Override
	public int method24057() {
		if (this.aBoolean430) {
			throw new IllegalStateException();
		}
		this.anOpenGL2.swapBuffers(this.aLong154);
		return 0;
	}

	@OriginalMember(owner = "client!apb", name = "y", descriptor = "(II)I")
	@Override
	public int method24058(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 0;
	}

	@OriginalMember(owner = "client!apb", name = "n", descriptor = "(II)I")
	@Override
	public int method24054(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 0;
	}

	@OriginalMember(owner = "client!apb", name = "s", descriptor = "()Z")
	@Override
	boolean method24047() {
		return true;
	}

	@OriginalMember(owner = "client!apb", name = "r", descriptor = "()V")
	void method17910() {
		@Pc(3) Dimension local3 = this.aCanvas2.getSize();
		this.anInt2473 = local3.height;
		this.anInt2474 = local3.width;
	}
}
