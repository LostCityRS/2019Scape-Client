package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class181 {

	@OriginalMember(owner = "client!be", name = "f", descriptor = "I")
	static final int anInt3316 = 35632;

	@OriginalMember(owner = "client!be", name = "t", descriptor = "I")
	static final int anInt3317 = 35633;

	@OriginalMember(owner = "client!be", name = "e", descriptor = "[I")
	static final int[] anIntArray292 = new int[2];

	@OriginalMember(owner = "client!be", name = "u", descriptor = "Lclient!afm;")
	final Class102_Sub3 aClass102_Sub3_40;

	@OriginalMember(owner = "client!be", name = "l", descriptor = "I")
	final int anInt3318;

	@OriginalMember(owner = "client!be", name = "t", descriptor = "(Lclient!afm;ILjava/lang/String;)Lclient!be;")
	static Class181 method24681(@OriginalArg(0) Class102_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		@Pc(2) int local2 = OpenGL.glCreateShader(arg1);
		OpenGL.glShaderSource(local2, arg2);
		OpenGL.glCompileShader(local2);
		OpenGL.glGetShaderiv(local2, 35713, anIntArray292, 0);
		if (anIntArray292[0] == 0) {
			@Pc(18) boolean local18 = false;
			if (anIntArray292[0] == 0) {
				local18 = true;
				System.out.println("");
			}
			OpenGL.glGetShaderiv(local2, 35716, anIntArray292, 1);
			if (anIntArray292[1] > 1) {
				@Pc(42) byte[] local42 = new byte[anIntArray292[1]];
				OpenGL.glGetShaderInfoLog(local2, anIntArray292[1], anIntArray292, 0, local42, 0);
				System.out.println(new String(local42));
			}
			if (local18) {
				OpenGL.glDeleteShader(local2);
				return null;
			}
		}
		return new Class181(arg0, local2, arg1);
	}

	@OriginalMember(owner = "client!be", name = "f", descriptor = "(Lclient!afm;ILjava/lang/String;)Lclient!be;")
	static Class181 method24682(@OriginalArg(0) Class102_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		@Pc(2) int local2 = OpenGL.glCreateShader(arg1);
		OpenGL.glShaderSource(local2, arg2);
		OpenGL.glCompileShader(local2);
		OpenGL.glGetShaderiv(local2, 35713, anIntArray292, 0);
		if (anIntArray292[0] == 0) {
			@Pc(18) boolean local18 = false;
			if (anIntArray292[0] == 0) {
				local18 = true;
				System.out.println("");
			}
			OpenGL.glGetShaderiv(local2, 35716, anIntArray292, 1);
			if (anIntArray292[1] > 1) {
				@Pc(42) byte[] local42 = new byte[anIntArray292[1]];
				OpenGL.glGetShaderInfoLog(local2, anIntArray292[1], anIntArray292, 0, local42, 0);
				System.out.println(new String(local42));
			}
			if (local18) {
				OpenGL.glDeleteShader(local2);
				return null;
			}
		}
		return new Class181(arg0, local2, arg1);
	}

	@OriginalMember(owner = "client!be", name = "e", descriptor = "(Lclient!afm;ILjava/lang/String;)Lclient!be;")
	static Class181 method24683(@OriginalArg(0) Class102_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		@Pc(2) int local2 = OpenGL.glCreateShader(arg1);
		OpenGL.glShaderSource(local2, arg2);
		OpenGL.glCompileShader(local2);
		OpenGL.glGetShaderiv(local2, 35713, anIntArray292, 0);
		if (anIntArray292[0] == 0) {
			@Pc(18) boolean local18 = false;
			if (anIntArray292[0] == 0) {
				local18 = true;
				System.out.println("");
			}
			OpenGL.glGetShaderiv(local2, 35716, anIntArray292, 1);
			if (anIntArray292[1] > 1) {
				@Pc(42) byte[] local42 = new byte[anIntArray292[1]];
				OpenGL.glGetShaderInfoLog(local2, anIntArray292[1], anIntArray292, 0, local42, 0);
				System.out.println(new String(local42));
			}
			if (local18) {
				OpenGL.glDeleteShader(local2);
				return null;
			}
		}
		return new Class181(arg0, local2, arg1);
	}

	@OriginalMember(owner = "client!be", name = "u", descriptor = "(Lclient!afm;ILjava/lang/String;)Lclient!be;")
	static Class181 method24684(@OriginalArg(0) Class102_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		@Pc(2) int local2 = OpenGL.glCreateShader(arg1);
		OpenGL.glShaderSource(local2, arg2);
		OpenGL.glCompileShader(local2);
		OpenGL.glGetShaderiv(local2, 35713, anIntArray292, 0);
		if (anIntArray292[0] == 0) {
			@Pc(18) boolean local18 = false;
			if (anIntArray292[0] == 0) {
				local18 = true;
				System.out.println("");
			}
			OpenGL.glGetShaderiv(local2, 35716, anIntArray292, 1);
			if (anIntArray292[1] > 1) {
				@Pc(42) byte[] local42 = new byte[anIntArray292[1]];
				OpenGL.glGetShaderInfoLog(local2, anIntArray292[1], anIntArray292, 0, local42, 0);
				System.out.println(new String(local42));
			}
			if (local18) {
				OpenGL.glDeleteShader(local2);
				return null;
			}
		}
		return new Class181(arg0, local2, arg1);
	}

	@OriginalMember(owner = "client!be", name = "l", descriptor = "(Lclient!afm;ILjava/lang/String;)Lclient!be;")
	static Class181 method24685(@OriginalArg(0) Class102_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		@Pc(2) int local2 = OpenGL.glCreateShader(arg1);
		OpenGL.glShaderSource(local2, arg2);
		OpenGL.glCompileShader(local2);
		OpenGL.glGetShaderiv(local2, 35713, anIntArray292, 0);
		if (anIntArray292[0] == 0) {
			@Pc(18) boolean local18 = false;
			if (anIntArray292[0] == 0) {
				local18 = true;
				System.out.println("");
			}
			OpenGL.glGetShaderiv(local2, 35716, anIntArray292, 1);
			if (anIntArray292[1] > 1) {
				@Pc(42) byte[] local42 = new byte[anIntArray292[1]];
				OpenGL.glGetShaderInfoLog(local2, anIntArray292[1], anIntArray292, 0, local42, 0);
				System.out.println(new String(local42));
			}
			if (local18) {
				OpenGL.glDeleteShader(local2);
				return null;
			}
		}
		return new Class181(arg0, local2, arg1);
	}

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lclient!afm;II)V")
	Class181(@OriginalArg(0) Class102_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass102_Sub3_40 = arg0;
		this.anInt3318 = arg1;
	}

	@OriginalMember(owner = "client!be", name = "ht", descriptor = "()V")
	void method24678() throws Throwable {
		this.aClass102_Sub3_40.method6409((long) this.anInt3318);
		super.finalize();
	}

	@OriginalMember(owner = "client!be", name = "hj", descriptor = "()V")
	void method24679() throws Throwable {
		this.aClass102_Sub3_40.method6409((long) this.anInt3318);
		super.finalize();
	}

	@OriginalMember(owner = "client!be", name = "hy", descriptor = "()V")
	void method24680() throws Throwable {
		this.aClass102_Sub3_40.method6409((long) this.anInt3318);
		super.finalize();
	}

	@OriginalMember(owner = "client!be", name = "finalize", descriptor = "()V")
	@Override
	void finalize() throws Throwable {
		this.aClass102_Sub3_40.method6409((long) this.anInt3318);
		super.finalize();
	}
}
