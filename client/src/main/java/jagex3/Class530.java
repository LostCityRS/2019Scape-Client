package jagex3;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public final class Class530 implements Interface56 {

	@OriginalMember(owner = "client!ri", name = "e", descriptor = "I")
	final int anInt5392;

	@OriginalMember(owner = "client!ri", name = "n", descriptor = "Lclient!aig;")
	final Class141_Sub1 aClass141_Sub1_1;

	@OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(Lclient!aig;I)V")
	Class530(@OriginalArg(0) Class141_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.anInt5392 = arg1;
		this.aClass141_Sub1_1 = arg0;
	}

	@OriginalMember(owner = "client!ri", name = "n", descriptor = "()I")
	@Override
	public int method31069() {
		return this.aClass141_Sub1_1.method11340();
	}

	@OriginalMember(owner = "client!ri", name = "m", descriptor = "()V")
	@Override
	public void method31065() {
	}

	@OriginalMember(owner = "client!ri", name = "e", descriptor = "()I")
	@Override
	public int method31071() {
		return this.aClass141_Sub1_1.method11362();
	}

	@OriginalMember(owner = "client!ri", name = "z", descriptor = "(I)V")
	@Override
	public void method31076(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferTexture2DEXT(36160, arg0, this.aClass141_Sub1_1.anInt1373, this.aClass141_Sub1_1.anInt1369, this.anInt5392);
	}

	@OriginalMember(owner = "client!ri", name = "k", descriptor = "()I")
	@Override
	public int method31070() {
		return this.aClass141_Sub1_1.method11362();
	}

	@OriginalMember(owner = "client!ri", name = "f", descriptor = "()I")
	@Override
	public int method31067() {
		return this.aClass141_Sub1_1.method11362();
	}

	@OriginalMember(owner = "client!ri", name = "w", descriptor = "()I")
	@Override
	public int method31068() {
		return this.aClass141_Sub1_1.method11340();
	}

	@OriginalMember(owner = "client!ri", name = "u", descriptor = "()V")
	@Override
	public void method31066() {
	}

	@OriginalMember(owner = "client!ri", name = "l", descriptor = "()I")
	@Override
	public int method31072() {
		return this.aClass141_Sub1_1.method11340();
	}

	@OriginalMember(owner = "client!ri", name = "p", descriptor = "(I)V")
	@Override
	public void method31073(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferTexture2DEXT(36160, arg0, this.aClass141_Sub1_1.anInt1373, this.aClass141_Sub1_1.anInt1369, this.anInt5392);
	}

	@OriginalMember(owner = "client!ri", name = "d", descriptor = "(I)V")
	@Override
	public void method31075(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferTexture2DEXT(36160, arg0, this.aClass141_Sub1_1.anInt1373, this.aClass141_Sub1_1.anInt1369, this.anInt5392);
	}

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "(I)V")
	@Override
	public void method31074(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferTexture2DEXT(36160, arg0, this.aClass141_Sub1_1.anInt1373, this.aClass141_Sub1_1.anInt1369, this.anInt5392);
	}
}
