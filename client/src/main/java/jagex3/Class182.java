package jagex3;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public final class Class182 {

	@OriginalMember(owner = "client!be", name = "e", descriptor = "I")
	final int anInt3330;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lclient!afa;I)V")
	Class182(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.anInt3330 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!be", name = "n", descriptor = "()V")
	void method24569() {
		OpenGL.glEndList();
	}

	@OriginalMember(owner = "client!be", name = "l", descriptor = "(C)V")
	void method24570(@OriginalArg(0) char arg0) {
		OpenGL.glCallList(this.anInt3330 + arg0);
	}

	@OriginalMember(owner = "client!be", name = "e", descriptor = "(I)V")
	void method24571(@OriginalArg(0) int arg0) {
		OpenGL.glNewList(this.anInt3330 + arg0, 4864);
	}

	@OriginalMember(owner = "client!be", name = "m", descriptor = "(C)V")
	void method24572(@OriginalArg(0) char arg0) {
		OpenGL.glCallList(this.anInt3330 + arg0);
	}

	@OriginalMember(owner = "client!be", name = "k", descriptor = "(I)V")
	void method24573(@OriginalArg(0) int arg0) {
		OpenGL.glNewList(this.anInt3330 + arg0, 4864);
	}

	@OriginalMember(owner = "client!be", name = "f", descriptor = "()V")
	void method24574() {
		OpenGL.glEndList();
	}

	@OriginalMember(owner = "client!be", name = "u", descriptor = "(C)V")
	void method24575(@OriginalArg(0) char arg0) {
		OpenGL.glCallList(this.anInt3330 + arg0);
	}

	@OriginalMember(owner = "client!be", name = "w", descriptor = "()V")
	void method24576() {
		OpenGL.glEndList();
	}
}
