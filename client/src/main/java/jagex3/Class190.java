package jagex3;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bm")
public final class Class190 {

	@OriginalMember(owner = "client!bm", name = "n", descriptor = "I")
	static final int anInt3346 = 35632;

	@OriginalMember(owner = "client!bm", name = "e", descriptor = "I")
	static final int anInt3347 = 35633;

	@OriginalMember(owner = "client!bm", name = "m", descriptor = "[I")
	static final int[] anIntArray298 = new int[2];

	@OriginalMember(owner = "client!bm", name = "k", descriptor = "Lclient!afa;")
	final Class104_Sub1 aClass104_Sub1_39;

	@OriginalMember(owner = "client!bm", name = "f", descriptor = "I")
	final int anInt3348;

	@OriginalMember(owner = "client!bm", name = "e", descriptor = "(Lclient!afa;ILjava/lang/String;)Lclient!bm;")
	static Class190 method24597(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		@Pc(2) int local2 = OpenGL.glCreateShader(arg1);
		OpenGL.glShaderSource(local2, arg2);
		OpenGL.glCompileShader(local2);
		OpenGL.glGetShaderiv(local2, 35713, anIntArray298, 0);
		if (anIntArray298[0] == 0) {
			@Pc(18) boolean local18 = false;
			if (anIntArray298[0] == 0) {
				local18 = true;
				System.out.println("");
			}
			OpenGL.glGetShaderiv(local2, 35716, anIntArray298, 1);
			if (anIntArray298[1] > 1) {
				@Pc(42) byte[] local42 = new byte[anIntArray298[1]];
				OpenGL.glGetShaderInfoLog(local2, anIntArray298[1], anIntArray298, 0, local42, 0);
				System.out.println(new String(local42));
			}
			if (local18) {
				OpenGL.glDeleteShader(local2);
				return null;
			}
		}
		return new Class190(arg0, local2, arg1);
	}

	@OriginalMember(owner = "client!bm", name = "n", descriptor = "(Lclient!afa;ILjava/lang/String;)Lclient!bm;")
	static Class190 method24598(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		@Pc(2) int local2 = OpenGL.glCreateShader(arg1);
		OpenGL.glShaderSource(local2, arg2);
		OpenGL.glCompileShader(local2);
		OpenGL.glGetShaderiv(local2, 35713, anIntArray298, 0);
		if (anIntArray298[0] == 0) {
			@Pc(18) boolean local18 = false;
			if (anIntArray298[0] == 0) {
				local18 = true;
				System.out.println("");
			}
			OpenGL.glGetShaderiv(local2, 35716, anIntArray298, 1);
			if (anIntArray298[1] > 1) {
				@Pc(42) byte[] local42 = new byte[anIntArray298[1]];
				OpenGL.glGetShaderInfoLog(local2, anIntArray298[1], anIntArray298, 0, local42, 0);
				System.out.println(new String(local42));
			}
			if (local18) {
				OpenGL.glDeleteShader(local2);
				return null;
			}
		}
		return new Class190(arg0, local2, arg1);
	}

	@OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(Lclient!afa;II)V")
	Class190(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass104_Sub1_39 = arg0;
		this.anInt3348 = arg1;
	}

	@OriginalMember(owner = "client!bm", name = "finalize", descriptor = "()V")
	@Override
	protected void finalize() throws Throwable {
		this.aClass104_Sub1_39.method3843((long) this.anInt3348);
		super.finalize();
	}

	@OriginalMember(owner = "client!bm", name = "hl", descriptor = "()V")
	void method24599() throws Throwable {
		this.aClass104_Sub1_39.method3843((long) this.anInt3348);
		super.finalize();
	}
}
