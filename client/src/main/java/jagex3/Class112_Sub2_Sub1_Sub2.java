package jagex3;

import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!atx")
public final class Class112_Sub2_Sub1_Sub2 extends Class112_Sub2_Sub1 {

	@OriginalMember(owner = "client!atx", name = "k", descriptor = "J")
	long aLong227;

	@OriginalMember(owner = "client!atx", name = "f", descriptor = "I")
	int anInt3232;

	@OriginalMember(owner = "client!atx", name = "m", descriptor = "Lclient!jaggl/OpenGL;")
	final OpenGL anOpenGL4;

	@OriginalMember(owner = "client!atx", name = "n", descriptor = "Ljava/awt/Canvas;")
	final Canvas aCanvas6;

	@OriginalMember(owner = "client!atx", name = "w", descriptor = "I")
	int anInt3233;

	@OriginalMember(owner = "client!atx", name = "l", descriptor = "Z")
	boolean aBoolean535;

	@OriginalMember(owner = "client!atx", name = "<init>", descriptor = "(Lclient!aqv;Ljava/awt/Canvas;)V")
	Class112_Sub2_Sub1_Sub2(@OriginalArg(0) Class104_Sub2_Sub2 arg0, @OriginalArg(1) Canvas arg1) {
		this(arg0, arg1, arg0.anOpenGL3.prepareSurface(arg1));
	}

	@OriginalMember(owner = "client!atx", name = "<init>", descriptor = "(Lclient!aqv;Ljava/awt/Canvas;J)V")
	Class112_Sub2_Sub1_Sub2(@OriginalArg(0) Class104_Sub2_Sub2 arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) long arg2) {
		super(arg0);
		this.aBoolean535 = false;
		this.aCanvas6 = arg1;
		this.anOpenGL4 = arg0.anOpenGL3;
		this.aLong227 = arg2;
		this.method23774();
	}

	@OriginalMember(owner = "client!atx", name = "s", descriptor = "()Z")
	@Override
	boolean method23761() {
		return true;
	}

	@OriginalMember(owner = "client!atx", name = "v", descriptor = "()Z")
	@Override
	boolean method23760() {
		if (this.aLong227 == 0L) {
			throw new IllegalStateException("");
		}
		@Pc(11) boolean local11 = true;
		if (!this.aBoolean535) {
			local11 = this.anOpenGL4.setSurface(this.aLong227);
			this.aBoolean535 = true;
		}
		return local11 && super.method23751();
	}

	@OriginalMember(owner = "client!atx", name = "e", descriptor = "()I")
	@Override
	public int method23748() {
		return this.anInt3232;
	}

	@OriginalMember(owner = "client!atx", name = "l", descriptor = "()I")
	@Override
	public int method23756() {
		return this.anInt3232;
	}

	@OriginalMember(owner = "client!atx", name = "m", descriptor = "()V")
	@Override
	public void method23750() {
		if (this.aLong227 != 0L) {
			this.anOpenGL4.releaseSurface(this.aCanvas6, this.aLong227);
			this.aLong227 = 0L;
		}
	}

	@OriginalMember(owner = "client!atx", name = "x", descriptor = "()V")
	void method23774() {
		@Pc(3) Dimension local3 = this.aCanvas6.getSize();
		this.anInt3233 = local3.height;
		this.anInt3232 = local3.width;
	}

	@OriginalMember(owner = "client!atx", name = "a", descriptor = "()I")
	@Override
	public int method23767() {
		if (this.aLong227 == 0L) {
			throw new IllegalStateException("");
		}
		this.anOpenGL4.swapBuffers(this.aLong227);
		return 0;
	}

	@OriginalMember(owner = "client!atx", name = "g", descriptor = "(II)I")
	@Override
	public int method23766(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 0;
	}

	@OriginalMember(owner = "client!atx", name = "p", descriptor = "()I")
	@Override
	public int method23757() {
		return this.anInt3232;
	}

	@OriginalMember(owner = "client!atx", name = "f", descriptor = "()Z")
	@Override
	boolean method23752() {
		return true;
	}

	@OriginalMember(owner = "client!atx", name = "c", descriptor = "()I")
	@Override
	public int method23758() {
		return this.anInt3233;
	}

	@OriginalMember(owner = "client!atx", name = "w", descriptor = "()I")
	@Override
	public int method23764() {
		return this.anInt3232;
	}

	@OriginalMember(owner = "client!atx", name = "k", descriptor = "()Z")
	@Override
	boolean method23751() {
		if (this.aLong227 == 0L) {
			throw new IllegalStateException("");
		}
		@Pc(11) boolean local11 = true;
		if (!this.aBoolean535) {
			local11 = this.anOpenGL4.setSurface(this.aLong227);
			this.aBoolean535 = true;
		}
		return local11 && super.method23751();
	}

	@OriginalMember(owner = "client!atx", name = "u", descriptor = "()I")
	@Override
	public int method23755() {
		return this.anInt3232;
	}

	@OriginalMember(owner = "client!atx", name = "i", descriptor = "(II)V")
	@Override
	void method23769(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aLong227 == 0L) {
			throw new IllegalStateException("");
		}
		this.anOpenGL4.surfaceResized(this.aLong227);
		this.method23774();
		super.method23769(arg0, arg1);
	}

	@OriginalMember(owner = "client!atx", name = "y", descriptor = "()V")
	@Override
	public void method23763() {
		if (this.aLong227 != 0L) {
			this.anOpenGL4.releaseSurface(this.aCanvas6, this.aLong227);
			this.aLong227 = 0L;
		}
	}

	@OriginalMember(owner = "client!atx", name = "d", descriptor = "()I")
	@Override
	public int method23747() {
		return this.anInt3232;
	}

	@OriginalMember(owner = "client!atx", name = "r", descriptor = "()I")
	@Override
	public int method23759() {
		return this.anInt3233;
	}

	@OriginalMember(owner = "client!atx", name = "z", descriptor = "()I")
	@Override
	public int method23753() {
		return this.anInt3232;
	}

	@OriginalMember(owner = "client!atx", name = "q", descriptor = "()V")
	@Override
	public void method23762() {
		if (this.aLong227 != 0L) {
			this.anOpenGL4.releaseSurface(this.aCanvas6, this.aLong227);
			this.aLong227 = 0L;
		}
	}

	@OriginalMember(owner = "client!atx", name = "o", descriptor = "()Z")
	@Override
	boolean method23754() {
		if (this.aLong227 == 0L) {
			throw new IllegalStateException("");
		}
		@Pc(11) boolean local11 = true;
		if (!this.aBoolean535) {
			local11 = this.anOpenGL4.setSurface(this.aLong227);
			this.aBoolean535 = true;
		}
		return local11 && super.method23751();
	}

	@OriginalMember(owner = "client!atx", name = "n", descriptor = "()I")
	@Override
	public int method23749() {
		return this.anInt3233;
	}

	@OriginalMember(owner = "client!atx", name = "j", descriptor = "(II)V")
	@Override
	void method23768(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aLong227 == 0L) {
			throw new IllegalStateException("");
		}
		this.anOpenGL4.surfaceResized(this.aLong227);
		this.method23774();
		super.method23769(arg0, arg1);
	}

	@OriginalMember(owner = "client!atx", name = "t", descriptor = "(II)V")
	@Override
	void method23770(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aLong227 == 0L) {
			throw new IllegalStateException("");
		}
		this.anOpenGL4.surfaceResized(this.aLong227);
		this.method23774();
		super.method23769(arg0, arg1);
	}

	@OriginalMember(owner = "client!atx", name = "ae", descriptor = "()I")
	@Override
	public int method23771() {
		if (this.aLong227 == 0L) {
			throw new IllegalStateException("");
		}
		this.anOpenGL4.swapBuffers(this.aLong227);
		return 0;
	}

	@OriginalMember(owner = "client!atx", name = "ag", descriptor = "(II)I")
	@Override
	public int method23772(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 0;
	}

	@OriginalMember(owner = "client!atx", name = "b", descriptor = "()V")
	void method23775() {
		@Pc(3) Dimension local3 = this.aCanvas6.getSize();
		this.anInt3233 = local3.height;
		this.anInt3232 = local3.width;
	}

	@OriginalMember(owner = "client!atx", name = "h", descriptor = "()V")
	void method23776() {
		@Pc(3) Dimension local3 = this.aCanvas6.getSize();
		this.anInt3233 = local3.height;
		this.anInt3232 = local3.width;
	}

	@OriginalMember(owner = "client!atx", name = "ah", descriptor = "()V")
	void method23777() {
		@Pc(3) Dimension local3 = this.aCanvas6.getSize();
		this.anInt3233 = local3.height;
		this.anInt3232 = local3.width;
	}
}
