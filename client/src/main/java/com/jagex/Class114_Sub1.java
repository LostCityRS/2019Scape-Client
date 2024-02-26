package com.jagex;

import jaggl.OpenGL;
import java.util.HashMap;
import java.util.Map;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!agq")
public final class Class114_Sub1 extends Class114 {

	@OriginalMember(owner = "client!agq", name = "l", descriptor = "I")
	static final int anInt999 = 35632;

	@OriginalMember(owner = "client!agq", name = "g", descriptor = "I")
	static final int anInt1000 = 13;

	@OriginalMember(owner = "client!agq", name = "u", descriptor = "I")
	static final int anInt1003 = 35633;

	@OriginalMember(owner = "client!agq", name = "x", descriptor = "[I")
	static final int[] anIntArray95 = new int[2];

	@OriginalMember(owner = "client!agq", name = "w", descriptor = "[F")
	static final float[] aFloatArray31 = new float[16];

	@OriginalMember(owner = "client!agq", name = "i", descriptor = "Lclient!aqi;")
	Class102_Sub1_Sub1 aClass102_Sub1_Sub1_2;

	@OriginalMember(owner = "client!agq", name = "m", descriptor = "Lclient!ago;")
	Class113_Sub2 aClass113_Sub2_1;

	@OriginalMember(owner = "client!agq", name = "o", descriptor = "I")
	int anInt1004;

	@OriginalMember(owner = "client!agq", name = "j", descriptor = "I")
	int anInt1001;

	@OriginalMember(owner = "client!agq", name = "a", descriptor = "I")
	int anInt1002;

	@OriginalMember(owner = "client!agq", name = "s", descriptor = "Z")
	boolean aBoolean183;

	@OriginalMember(owner = "client!agq", name = "k", descriptor = "[I")
	int[] anIntArray96;

	@OriginalMember(owner = "client!agq", name = "r", descriptor = "Ljava/util/Map;")
	final Map aMap6;

	@OriginalMember(owner = "client!agq", name = "q", descriptor = "Ljava/util/Map;")
	final Map aMap7;

	@OriginalMember(owner = "client!agq", name = "h", descriptor = "Ljava/util/Map;")
	final Map aMap5;

	@OriginalMember(owner = "client!agq", name = "d", descriptor = "Ljava/util/Map;")
	final Map aMap8;

	@OriginalMember(owner = "client!agq", name = "z", descriptor = "Ljava/util/Map;")
	final Map aMap9;

	@OriginalMember(owner = "client!agq", name = "p", descriptor = "Ljava/lang/String;")
	String aString39;

	@OriginalMember(owner = "client!agq", name = "v", descriptor = "Ljava/lang/String;")
	String aString38;

	@OriginalMember(owner = "client!agq", name = "<init>", descriptor = "(Lclient!aqi;Lclient!hj;)V")
	Class114_Sub1(@OriginalArg(0) Class102_Sub1_Sub1 arg0, @OriginalArg(1) Class315 arg1) {
		this.anInt1004 = 0;
		this.anInt1001 = 0;
		this.anInt1002 = 0;
		this.aBoolean183 = false;
		this.anIntArray96 = new int[13];
		this.aMap6 = new HashMap();
		this.aMap7 = new HashMap();
		this.aMap5 = new HashMap();
		this.aMap8 = new HashMap();
		this.aMap9 = new HashMap();
		this.aString40 = arg1.aString175;
		@Pc(50) StringBuilder local50 = new StringBuilder();
		@Pc(63) Class312[] local63;
		@Pc(65) int local65;
		@Pc(73) Class312 local73;
		if (arg1.aString176 != null) {
			this.aString41 = arg1.aString176;
			if (arg1.aClass312Array2 != null) {
				local63 = arg1.aClass312Array2;
				for (local65 = 0; local65 < local63.length; local65++) {
					local73 = local63[local65];
					local50.append("#define " + local73.aString171 + " " + local73.aString172 + '\n');
				}
			}
			local50.append(new String(arg0.method20115(this.aString41)));
			this.aString39 = local50.toString();
		}
		if (arg1.aString177 != null) {
			this.aString42 = arg1.aString177;
			local50.setLength(0);
			if (arg1.aClass312Array1 != null) {
				local63 = arg1.aClass312Array1;
				for (local65 = 0; local65 < local63.length; local65++) {
					local73 = local63[local65];
					local50.append("#define " + local73.aString171 + " " + local73.aString172 + '\n');
				}
			}
			local50.append(new String(arg0.method20115(this.aString42)));
			this.aString38 = local50.toString();
		}
		Class718.method37248(this.anIntArray96, 0, this.anIntArray96.length, -1);
	}

	@OriginalMember(owner = "client!agq", name = "<init>", descriptor = "(Lclient!aqi;Lclient!ago;Lclient!hj;)V")
	Class114_Sub1(@OriginalArg(0) Class102_Sub1_Sub1 arg0, @OriginalArg(1) Class113_Sub2 arg1, @OriginalArg(2) Class315 arg2) {
		this(arg0, arg2);
		this.aClass113_Sub2_1 = arg1;
		this.aClass102_Sub1_Sub1_2 = arg0;
	}

	@OriginalMember(owner = "client!agq", name = "ba", descriptor = "(ILjava/lang/String;Ljava/lang/String;)I")
	int method8520(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		if (arg1 == null) {
			return 0;
		}
		@Pc(6) int local6 = OpenGL.glCreateShader(arg0);
		OpenGL.glShaderSource(local6, arg1);
		OpenGL.glCompileShader(local6);
		OpenGL.glGetShaderiv(local6, 35713, anIntArray95, 0);
		if (anIntArray95[0] == 0) {
			OpenGL.glDeleteShader(local6);
			local6 = 0;
		}
		return local6;
	}

	@OriginalMember(owner = "client!agq", name = "e", descriptor = "()V")
	@Override
	public void method30837() {
		if (this.anInt1004 == 0) {
			return;
		}
		this.aClass102_Sub1_Sub1_2.method20101(this.anInt1004);
		if (this.anInt1001 != 0) {
			this.aClass102_Sub1_Sub1_2.method20110((long) this.anInt1001);
		}
		if (this.anInt1002 != 0) {
			this.aClass102_Sub1_Sub1_2.method20110((long) this.anInt1002);
		}
		this.anInt1004 = 0;
		this.anInt1001 = 0;
		this.anInt1002 = 0;
	}

	@OriginalMember(owner = "client!agq", name = "f", descriptor = "()Z")
	@Override
	public boolean method8577() {
		if (this.aBoolean183) {
			return true;
		}
		this.aClass102_Sub1_Sub1_2.aClass114_Sub1_2 = null;
		this.anInt1001 = this.method8524(35633, this.aString39, this.aString41);
		this.anInt1002 = this.method8524(35632, this.aString38, this.aString42);
		if (this.anInt1001 == 0 || this.anInt1002 == 0) {
			if (this.anInt1001 != 0) {
				OpenGL.glDeleteShader(this.anInt1001);
			}
			if (this.anInt1002 != 0) {
				OpenGL.glDeleteShader(this.anInt1002);
			}
			return false;
		}
		this.anInt1004 = OpenGL.glCreateProgram();
		if (this.anInt1001 != 0) {
			OpenGL.glAttachShader(this.anInt1004, this.anInt1001);
		}
		if (this.anInt1002 != 0) {
			OpenGL.glAttachShader(this.anInt1004, this.anInt1002);
		}
		OpenGL.glLinkProgram(this.anInt1004);
		OpenGL.glGetProgramiv(this.anInt1004, 35714, anIntArray95, 0);
		if (anIntArray95[0] == 0) {
			if (this.anInt1001 != 0) {
				OpenGL.glDetachShader(this.anInt1004, this.anInt1001);
				OpenGL.glDeleteShader(this.anInt1001);
			}
			if (this.anInt1002 != 0) {
				OpenGL.glDetachShader(this.anInt1004, this.anInt1002);
				OpenGL.glDeleteShader(this.anInt1002);
			}
			OpenGL.glDeleteProgram(this.anInt1004);
			return false;
		}
		OpenGL.glUseProgram(this.anInt1004);
		@Pc(110) int local110 = -1;
		@Pc(112) int local112;
		for (local112 = 0; local112 < this.aClass113_Sub2_1.method8262((byte) 0); local112++) {
			if (this.aClass113_Sub2_1.method8263(local112, (byte) 1) == this) {
				local110 = local112;
				break;
			}
		}
		if (local110 == -1) {
			return false;
		}
		@Pc(149) Class80_Sub13_Sub1 local149;
		for (local112 = 0; local112 < this.aClass113_Sub2_1.method8344((byte) 22); local112++) {
			local149 = this.aClass113_Sub2_1.method8294(local112, -1806789063);
			if (local149 != null) {
				local149.method23992(local110);
			}
		}
		for (local112 = 0; local112 < this.aClass113_Sub2_1.method8364(-2111061563); local112++) {
			local149 = this.aClass113_Sub2_1.method8291(local112, -1515251330);
			if (local149 != null) {
				local149.method23992(local110);
			}
		}
		this.aString39 = null;
		this.aString38 = null;
		this.aBoolean183 = true;
		return true;
	}

	@OriginalMember(owner = "client!agq", name = "u", descriptor = "(Lclient!aqv;F)V")
	@Override
	void method8578(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) float arg1) {
		@Pc(3) int local3 = ((Class80_Sub13_Sub1_Sub2) arg0).method24004();
		if (local3 == -1 || this.aMap6.get(local3) != null && (Float) this.aMap6.get(local3) == arg1) {
			return;
		}
		this.aMap6.put(local3, arg1);
		if (arg0.method23989(36064) != Class317.aClass317_32 && arg0.method23989(36064) != Class317.aClass317_78) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		OpenGL.glUniform1f(local3, arg1);
	}

	@OriginalMember(owner = "client!agq", name = "aj", descriptor = "(Lclient!aqv;Lclient!pm;)V")
	@Override
	void method8602(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) Class487 arg1) {
		assert arg0.method23989(36064) == Class317.aClass317_130;
		@Pc(14) int local14 = ((Class80_Sub13_Sub1_Sub2) arg0).method24004();
		if (local14 != -1) {
			OpenGL.glUniform4fv(local14, 4, arg1.method30102(aFloatArray31), 0);
		}
	}

	@OriginalMember(owner = "client!agq", name = "ap", descriptor = "(Lclient!aqv;FF)V")
	@Override
	void method8613(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(3) int local3 = ((Class80_Sub13_Sub1_Sub2) arg0).method24004();
		if (local3 == -1 || this.aMap6.get(local3) != null && this.aMap7.get(local3) != null && (Float) this.aMap6.get(local3) == arg1 && (Float) this.aMap7.get(local3) == arg2) {
			return;
		}
		this.aMap6.put(local3, arg1);
		this.aMap7.put(local3, arg2);
		if (arg0.method23989(36064) != Class317.aClass317_34) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		OpenGL.glUniform2f(local3, arg1, arg2);
	}

	@OriginalMember(owner = "client!agq", name = "i", descriptor = "(Lclient!aqv;FFFF)V")
	@Override
	void method8611(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		@Pc(3) int local3 = ((Class80_Sub13_Sub1_Sub2) arg0).method24004();
		if (local3 == -1 || this.aMap6.get(local3) != null && this.aMap7.get(local3) != null && this.aMap5.get(local3) != null && this.aMap8.get(local3) != null && (Float) this.aMap6.get(local3) == arg1 && (Float) this.aMap7.get(local3) == arg2 && (Float) this.aMap5.get(local3) == arg3 && (Float) this.aMap8.get(local3) == arg4) {
			return;
		}
		this.aMap6.put(local3, arg1);
		this.aMap7.put(local3, arg2);
		this.aMap5.put(local3, arg3);
		this.aMap8.put(local3, arg4);
		if (arg0.method23989(36064) != Class317.aClass317_91) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		OpenGL.glUniform4f(local3, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!agq", name = "a", descriptor = "(Lclient!aqv;[FI)V")
	@Override
	void method8604(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = ((Class80_Sub13_Sub1_Sub2) arg0).method24004();
		if (local3 != -1) {
			OpenGL.glUniform4fv(local3, arg2, arg1, 0);
		}
	}

	@OriginalMember(owner = "client!agq", name = "h", descriptor = "(ILclient!pm;)V")
	@Override
	void method8608(@OriginalArg(0) int arg0, @OriginalArg(1) Class487 arg1) {
		OpenGL.glUniform3fv(arg0, 3, arg1.method30104(aFloatArray31), 0);
	}

	@OriginalMember(owner = "client!agq", name = "as", descriptor = "(Lclient!aqv;[FI)V")
	@Override
	void method8621(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = ((Class80_Sub13_Sub1_Sub2) arg0).method24004();
		if (local3 != -1) {
			OpenGL.glUniform4fv(local3, arg2, arg1, 0);
		}
	}

	@OriginalMember(owner = "client!agq", name = "x", descriptor = "(Lclient!aqv;ILclient!mf;)V")
	@Override
	void method8581(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface39 arg2) {
		@Pc(3) int local3 = ((Class80_Sub13_Sub1_Sub2) arg0).method24004();
		if (local3 == -1) {
			return;
		}
		if (arg2 == null) {
			arg2 = this.aClass102_Sub1_Sub1_2.anInterface34_23;
		}
		if (arg1 < this.aClass102_Sub1_Sub1_2.anInt2998) {
			this.aClass102_Sub1_Sub1_2.method21217(arg1);
			this.aClass102_Sub1_Sub1_2.method21429(arg2);
		} else {
			OpenGL.glActiveTexture(arg1 + 33984);
			OpenGL.glBindTexture(((Class140) arg2).anInt1324, ((Class140) arg2).anInt1327);
		}
		if (this.aMap9.get(local3) == null || (Integer) this.aMap9.get(local3) != arg1) {
			this.aMap9.put(local3, arg1);
			OpenGL.glUniform1i(local3, arg1);
		}
	}

	@OriginalMember(owner = "client!agq", name = "w", descriptor = "(IFFF)V")
	@Override
	void method8585(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		OpenGL.glUniform3f(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!agq", name = "r", descriptor = "(IFFFF)V")
	@Override
	void method8586(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		OpenGL.glUniform4f(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!agq", name = "q", descriptor = "(I[FI)V")
	@Override
	void method8587(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		OpenGL.glUniform4fv(arg0, arg2, arg1, 0);
	}

	@OriginalMember(owner = "client!agq", name = "am", descriptor = "(ILclient!pm;)V")
	@Override
	void method8609(@OriginalArg(0) int arg0, @OriginalArg(1) Class487 arg1) {
		OpenGL.glUniform2fv(arg0, 4, arg1.method30106(aFloatArray31), 0);
	}

	@OriginalMember(owner = "client!agq", name = "d", descriptor = "(ILclient!pm;)V")
	@Override
	void method8589(@OriginalArg(0) int arg0, @OriginalArg(1) Class487 arg1) {
		OpenGL.glUniform2fv(arg0, 4, arg1.method30106(aFloatArray31), 0);
	}

	@OriginalMember(owner = "client!agq", name = "z", descriptor = "(ILclient!pm;)V")
	@Override
	void method8618(@OriginalArg(0) int arg0, @OriginalArg(1) Class487 arg1) {
		OpenGL.glUniform4fv(arg0, 4, arg1.method30102(aFloatArray31), 0);
	}

	@OriginalMember(owner = "client!agq", name = "p", descriptor = "(IILclient!mf;)V")
	@Override
	void method8591(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface39 arg2) {
		this.aClass102_Sub1_Sub1_2.method21217(arg1);
		this.aClass102_Sub1_Sub1_2.method21429(arg2);
		OpenGL.glUniform1i(arg0, arg1);
	}

	@OriginalMember(owner = "client!agq", name = "aa", descriptor = "(IILclient!mf;)V")
	@Override
	void method8615(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface39 arg2) {
		this.aClass102_Sub1_Sub1_2.method21217(arg1);
		this.aClass102_Sub1_Sub1_2.method21429(arg2);
		OpenGL.glUniform1i(arg0, arg1);
	}

	@OriginalMember(owner = "client!agq", name = "finalize", descriptor = "()V")
	@Override
	protected void finalize() {
		this.method30837();
	}

	@OriginalMember(owner = "client!agq", name = "m", descriptor = "()V")
	@Override
	public void method30835() {
		if (this.anInt1004 == 0) {
			return;
		}
		this.aClass102_Sub1_Sub1_2.method20101(this.anInt1004);
		if (this.anInt1001 != 0) {
			this.aClass102_Sub1_Sub1_2.method20110((long) this.anInt1001);
		}
		if (this.anInt1002 != 0) {
			this.aClass102_Sub1_Sub1_2.method20110((long) this.anInt1002);
		}
		this.anInt1004 = 0;
		this.anInt1001 = 0;
		this.anInt1002 = 0;
	}

	@OriginalMember(owner = "client!agq", name = "az", descriptor = "(Lclient!aqv;[FI)V")
	@Override
	void method8620(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = ((Class80_Sub13_Sub1_Sub2) arg0).method24004();
		if (local3 != -1) {
			OpenGL.glUniform4fv(local3, arg2, arg1, 0);
		}
	}

	@OriginalMember(owner = "client!agq", name = "j", descriptor = "()V")
	@Override
	public void method30834() {
		if (this.anInt1004 == 0) {
			return;
		}
		this.aClass102_Sub1_Sub1_2.method20101(this.anInt1004);
		if (this.anInt1001 != 0) {
			this.aClass102_Sub1_Sub1_2.method20110((long) this.anInt1001);
		}
		if (this.anInt1002 != 0) {
			this.aClass102_Sub1_Sub1_2.method20110((long) this.anInt1002);
		}
		this.anInt1004 = 0;
		this.anInt1001 = 0;
		this.anInt1002 = 0;
	}

	@OriginalMember(owner = "client!agq", name = "hy", descriptor = "()V")
	void method8521() {
		this.method30837();
	}

	@OriginalMember(owner = "client!agq", name = "av", descriptor = "(IILclient!mf;)V")
	@Override
	void method8625(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface39 arg2) {
		this.aClass102_Sub1_Sub1_2.method21217(arg1);
		this.aClass102_Sub1_Sub1_2.method21429(arg2);
		OpenGL.glUniform1i(arg0, arg1);
	}

	@OriginalMember(owner = "client!agq", name = "ht", descriptor = "()V")
	void method8522() {
		this.method30837();
	}

	@OriginalMember(owner = "client!agq", name = "bj", descriptor = "(ILjava/lang/String;Ljava/lang/String;)I")
	int method8523(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		if (arg1 == null) {
			return 0;
		}
		@Pc(6) int local6 = OpenGL.glCreateShader(arg0);
		OpenGL.glShaderSource(local6, arg1);
		OpenGL.glCompileShader(local6);
		OpenGL.glGetShaderiv(local6, 35713, anIntArray95, 0);
		if (anIntArray95[0] == 0) {
			OpenGL.glDeleteShader(local6);
			local6 = 0;
		}
		return local6;
	}

	@OriginalMember(owner = "client!agq", name = "bg", descriptor = "(IFFF)V")
	@Override
	void method8619(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		OpenGL.glUniform3f(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!agq", name = "ab", descriptor = "(IFFFF)V")
	@Override
	void method8579(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		OpenGL.glUniform4f(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!agq", name = "b", descriptor = "(Lclient!aqv;F)V")
	@Override
	void method8596(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) float arg1) {
		@Pc(3) int local3 = ((Class80_Sub13_Sub1_Sub2) arg0).method24004();
		if (local3 == -1 || this.aMap6.get(local3) != null && (Float) this.aMap6.get(local3) == arg1) {
			return;
		}
		this.aMap6.put(local3, arg1);
		if (arg0.method23989(36064) != Class317.aClass317_32 && arg0.method23989(36064) != Class317.aClass317_78) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		OpenGL.glUniform1f(local3, arg1);
	}

	@OriginalMember(owner = "client!agq", name = "ax", descriptor = "(Lclient!aqv;FFF)V")
	@Override
	void method8597(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(3) int local3 = ((Class80_Sub13_Sub1_Sub2) arg0).method24004();
		if (local3 == -1 || this.aMap6.get(local3) != null && this.aMap7.get(local3) != null && this.aMap5.get(local3) != null && (Float) this.aMap6.get(local3) == arg1 && (Float) this.aMap7.get(local3) == arg2 && (Float) this.aMap5.get(local3) == arg3) {
			return;
		}
		this.aMap6.put(local3, arg1);
		this.aMap7.put(local3, arg2);
		this.aMap5.put(local3, arg3);
		if (arg0.method23989(36064) != Class317.aClass317_106) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		OpenGL.glUniform3f(local3, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!agq", name = "y", descriptor = "()Z")
	@Override
	public boolean method8593() {
		if (this.aBoolean183) {
			return true;
		}
		this.aClass102_Sub1_Sub1_2.aClass114_Sub1_2 = null;
		this.anInt1001 = this.method8524(35633, this.aString39, this.aString41);
		this.anInt1002 = this.method8524(35632, this.aString38, this.aString42);
		if (this.anInt1001 == 0 || this.anInt1002 == 0) {
			if (this.anInt1001 != 0) {
				OpenGL.glDeleteShader(this.anInt1001);
			}
			if (this.anInt1002 != 0) {
				OpenGL.glDeleteShader(this.anInt1002);
			}
			return false;
		}
		this.anInt1004 = OpenGL.glCreateProgram();
		if (this.anInt1001 != 0) {
			OpenGL.glAttachShader(this.anInt1004, this.anInt1001);
		}
		if (this.anInt1002 != 0) {
			OpenGL.glAttachShader(this.anInt1004, this.anInt1002);
		}
		OpenGL.glLinkProgram(this.anInt1004);
		OpenGL.glGetProgramiv(this.anInt1004, 35714, anIntArray95, 0);
		if (anIntArray95[0] == 0) {
			if (this.anInt1001 != 0) {
				OpenGL.glDetachShader(this.anInt1004, this.anInt1001);
				OpenGL.glDeleteShader(this.anInt1001);
			}
			if (this.anInt1002 != 0) {
				OpenGL.glDetachShader(this.anInt1004, this.anInt1002);
				OpenGL.glDeleteShader(this.anInt1002);
			}
			OpenGL.glDeleteProgram(this.anInt1004);
			return false;
		}
		OpenGL.glUseProgram(this.anInt1004);
		@Pc(110) int local110 = -1;
		@Pc(112) int local112;
		for (local112 = 0; local112 < this.aClass113_Sub2_1.method8262((byte) 0); local112++) {
			if (this.aClass113_Sub2_1.method8263(local112, (byte) 1) == this) {
				local110 = local112;
				break;
			}
		}
		if (local110 == -1) {
			return false;
		}
		@Pc(149) Class80_Sub13_Sub1 local149;
		for (local112 = 0; local112 < this.aClass113_Sub2_1.method8344((byte) -2); local112++) {
			local149 = this.aClass113_Sub2_1.method8294(local112, -1354352678);
			if (local149 != null) {
				local149.method23992(local110);
			}
		}
		for (local112 = 0; local112 < this.aClass113_Sub2_1.method8364(-2086702481); local112++) {
			local149 = this.aClass113_Sub2_1.method8291(local112, -1734068092);
			if (local149 != null) {
				local149.method23992(local110);
			}
		}
		this.aString39 = null;
		this.aString38 = null;
		this.aBoolean183 = true;
		return true;
	}

	@OriginalMember(owner = "client!agq", name = "ai", descriptor = "(Lclient!aqv;FFFF)V")
	@Override
	void method8599(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		@Pc(3) int local3 = ((Class80_Sub13_Sub1_Sub2) arg0).method24004();
		if (local3 == -1 || this.aMap6.get(local3) != null && this.aMap7.get(local3) != null && this.aMap5.get(local3) != null && this.aMap8.get(local3) != null && (Float) this.aMap6.get(local3) == arg1 && (Float) this.aMap7.get(local3) == arg2 && (Float) this.aMap5.get(local3) == arg3 && (Float) this.aMap8.get(local3) == arg4) {
			return;
		}
		this.aMap6.put(local3, arg1);
		this.aMap7.put(local3, arg2);
		this.aMap5.put(local3, arg3);
		this.aMap8.put(local3, arg4);
		if (arg0.method23989(36064) != Class317.aClass317_91) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		OpenGL.glUniform4f(local3, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!agq", name = "aq", descriptor = "(Lclient!aqv;FFFF)V")
	@Override
	void method8600(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		@Pc(3) int local3 = ((Class80_Sub13_Sub1_Sub2) arg0).method24004();
		if (local3 == -1 || this.aMap6.get(local3) != null && this.aMap7.get(local3) != null && this.aMap5.get(local3) != null && this.aMap8.get(local3) != null && (Float) this.aMap6.get(local3) == arg1 && (Float) this.aMap7.get(local3) == arg2 && (Float) this.aMap5.get(local3) == arg3 && (Float) this.aMap8.get(local3) == arg4) {
			return;
		}
		this.aMap6.put(local3, arg1);
		this.aMap7.put(local3, arg2);
		this.aMap5.put(local3, arg3);
		this.aMap8.put(local3, arg4);
		if (arg0.method23989(36064) != Class317.aClass317_91) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		OpenGL.glUniform4f(local3, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!agq", name = "c", descriptor = "(Lclient!aqv;F)V")
	@Override
	void method8595(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) float arg1) {
		@Pc(3) int local3 = ((Class80_Sub13_Sub1_Sub2) arg0).method24004();
		if (local3 == -1 || this.aMap6.get(local3) != null && (Float) this.aMap6.get(local3) == arg1) {
			return;
		}
		this.aMap6.put(local3, arg1);
		if (arg0.method23989(36064) != Class317.aClass317_32 && arg0.method23989(36064) != Class317.aClass317_78) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		OpenGL.glUniform1f(local3, arg1);
	}

	@OriginalMember(owner = "client!agq", name = "g", descriptor = "(Lclient!aqv;FFF)V")
	@Override
	void method8580(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(3) int local3 = ((Class80_Sub13_Sub1_Sub2) arg0).method24004();
		if (local3 == -1 || this.aMap6.get(local3) != null && this.aMap7.get(local3) != null && this.aMap5.get(local3) != null && (Float) this.aMap6.get(local3) == arg1 && (Float) this.aMap7.get(local3) == arg2 && (Float) this.aMap5.get(local3) == arg3) {
			return;
		}
		this.aMap6.put(local3, arg1);
		this.aMap7.put(local3, arg2);
		this.aMap5.put(local3, arg3);
		if (arg0.method23989(36064) != Class317.aClass317_106) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		OpenGL.glUniform3f(local3, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!agq", name = "ac", descriptor = "(Lclient!aqv;ILclient!mf;)V")
	@Override
	void method8603(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface39 arg2) {
		@Pc(3) int local3 = ((Class80_Sub13_Sub1_Sub2) arg0).method24004();
		if (local3 == -1) {
			return;
		}
		if (arg2 == null) {
			arg2 = this.aClass102_Sub1_Sub1_2.anInterface34_23;
		}
		if (arg1 < this.aClass102_Sub1_Sub1_2.anInt2998) {
			this.aClass102_Sub1_Sub1_2.method21217(arg1);
			this.aClass102_Sub1_Sub1_2.method21429(arg2);
		} else {
			OpenGL.glActiveTexture(arg1 + 33984);
			OpenGL.glBindTexture(((Class140) arg2).anInt1324, ((Class140) arg2).anInt1327);
		}
		if (this.aMap9.get(local3) == null || (Integer) this.aMap9.get(local3) != arg1) {
			this.aMap9.put(local3, arg1);
			OpenGL.glUniform1i(local3, arg1);
		}
	}

	@OriginalMember(owner = "client!agq", name = "ag", descriptor = "(IFFFF)V")
	@Override
	void method8624(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		OpenGL.glUniform4f(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!agq", name = "n", descriptor = "(Lclient!aqv;F)V")
	@Override
	void method8584(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) float arg1) {
		@Pc(3) int local3 = ((Class80_Sub13_Sub1_Sub2) arg0).method24004();
		if (local3 == -1 || this.aMap6.get(local3) != null && (Float) this.aMap6.get(local3) == arg1) {
			return;
		}
		this.aMap6.put(local3, arg1);
		if (arg0.method23989(36064) != Class317.aClass317_32 && arg0.method23989(36064) != Class317.aClass317_78) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		OpenGL.glUniform1f(local3, arg1);
	}

	@OriginalMember(owner = "client!agq", name = "al", descriptor = "(I[FI)V")
	@Override
	void method8606(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		OpenGL.glUniform4fv(arg0, arg2, arg1, 0);
	}

	@OriginalMember(owner = "client!agq", name = "ah", descriptor = "(ILclient!pm;)V")
	@Override
	void method8607(@OriginalArg(0) int arg0, @OriginalArg(1) Class487 arg1) {
		OpenGL.glUniform3fv(arg0, 3, arg1.method30104(aFloatArray31), 0);
	}

	@OriginalMember(owner = "client!agq", name = "ad", descriptor = "(ILclient!pm;)V")
	@Override
	void method8612(@OriginalArg(0) int arg0, @OriginalArg(1) Class487 arg1) {
		OpenGL.glUniform4fv(arg0, 4, arg1.method30102(aFloatArray31), 0);
	}

	@OriginalMember(owner = "client!agq", name = "s", descriptor = "(Lclient!aqv;Lclient!pm;)V")
	@Override
	void method8582(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) Class487 arg1) {
		assert arg0.method23989(36064) == Class317.aClass317_49;
		@Pc(14) int local14 = ((Class80_Sub13_Sub1_Sub2) arg0).method24004();
		if (local14 != -1) {
			OpenGL.glUniform2fv(local14, 4, arg1.method30106(aFloatArray31), 0);
		}
	}

	@OriginalMember(owner = "client!agq", name = "ak", descriptor = "(ILclient!pm;)V")
	@Override
	void method8610(@OriginalArg(0) int arg0, @OriginalArg(1) Class487 arg1) {
		OpenGL.glUniform2fv(arg0, 4, arg1.method30106(aFloatArray31), 0);
	}

	@OriginalMember(owner = "client!agq", name = "at", descriptor = "(ILclient!pm;)V")
	@Override
	void method8575(@OriginalArg(0) int arg0, @OriginalArg(1) Class487 arg1) {
		OpenGL.glUniform4fv(arg0, 4, arg1.method30102(aFloatArray31), 0);
	}

	@OriginalMember(owner = "client!agq", name = "af", descriptor = "(ILclient!pm;)V")
	@Override
	void method8623(@OriginalArg(0) int arg0, @OriginalArg(1) Class487 arg1) {
		OpenGL.glUniform3fv(arg0, 3, arg1.method30104(aFloatArray31), 0);
	}

	@OriginalMember(owner = "client!agq", name = "aw", descriptor = "(Lclient!aqv;[FI)V")
	@Override
	void method8622(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = ((Class80_Sub13_Sub1_Sub2) arg0).method24004();
		if (local3 != -1) {
			OpenGL.glUniform4fv(local3, arg2, arg1, 0);
		}
	}

	@OriginalMember(owner = "client!agq", name = "an", descriptor = "(IILclient!mf;)V")
	@Override
	void method8614(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface39 arg2) {
		this.aClass102_Sub1_Sub1_2.method21217(arg1);
		this.aClass102_Sub1_Sub1_2.method21429(arg2);
		OpenGL.glUniform1i(arg0, arg1);
	}

	@OriginalMember(owner = "client!agq", name = "o", descriptor = "()V")
	@Override
	public void method30836() {
		if (this.anInt1004 == 0) {
			return;
		}
		this.aClass102_Sub1_Sub1_2.method20101(this.anInt1004);
		if (this.anInt1001 != 0) {
			this.aClass102_Sub1_Sub1_2.method20110((long) this.anInt1001);
		}
		if (this.anInt1002 != 0) {
			this.aClass102_Sub1_Sub1_2.method20110((long) this.anInt1002);
		}
		this.anInt1004 = 0;
		this.anInt1001 = 0;
		this.anInt1002 = 0;
	}

	@OriginalMember(owner = "client!agq", name = "ae", descriptor = "(Lclient!aqv;FF)V")
	@Override
	void method8605(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(3) int local3 = ((Class80_Sub13_Sub1_Sub2) arg0).method24004();
		if (local3 == -1 || this.aMap6.get(local3) != null && this.aMap7.get(local3) != null && (Float) this.aMap6.get(local3) == arg1 && (Float) this.aMap7.get(local3) == arg2) {
			return;
		}
		this.aMap6.put(local3, arg1);
		this.aMap7.put(local3, arg2);
		if (arg0.method23989(36064) != Class317.aClass317_34) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		OpenGL.glUniform2f(local3, arg1, arg2);
	}

	@OriginalMember(owner = "client!agq", name = "ay", descriptor = "(Lclient!aqv;FFFF)V")
	@Override
	void method8598(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		@Pc(3) int local3 = ((Class80_Sub13_Sub1_Sub2) arg0).method24004();
		if (local3 == -1 || this.aMap6.get(local3) != null && this.aMap7.get(local3) != null && this.aMap5.get(local3) != null && this.aMap8.get(local3) != null && (Float) this.aMap6.get(local3) == arg1 && (Float) this.aMap7.get(local3) == arg2 && (Float) this.aMap5.get(local3) == arg3 && (Float) this.aMap8.get(local3) == arg4) {
			return;
		}
		this.aMap6.put(local3, arg1);
		this.aMap7.put(local3, arg2);
		this.aMap5.put(local3, arg3);
		this.aMap8.put(local3, arg4);
		if (arg0.method23989(36064) != Class317.aClass317_91) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		OpenGL.glUniform4f(local3, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!agq", name = "ar", descriptor = "(Lclient!aqv;FF)V")
	@Override
	void method8594(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(3) int local3 = ((Class80_Sub13_Sub1_Sub2) arg0).method24004();
		if (local3 == -1 || this.aMap6.get(local3) != null && this.aMap7.get(local3) != null && (Float) this.aMap6.get(local3) == arg1 && (Float) this.aMap7.get(local3) == arg2) {
			return;
		}
		this.aMap6.put(local3, arg1);
		this.aMap7.put(local3, arg2);
		if (arg0.method23989(36064) != Class317.aClass317_34) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		OpenGL.glUniform2f(local3, arg1, arg2);
	}

	@OriginalMember(owner = "client!agq", name = "au", descriptor = "(Lclient!aqv;[FI)V")
	@Override
	void method8616(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = ((Class80_Sub13_Sub1_Sub2) arg0).method24004();
		if (local3 != -1) {
			OpenGL.glUniform4fv(local3, arg2, arg1, 0);
		}
	}

	@OriginalMember(owner = "client!agq", name = "ao", descriptor = "(Lclient!aqv;Lclient!pm;)V")
	@Override
	void method8601(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) Class487 arg1) {
		assert arg0.method23989(36064) == Class317.aClass317_49;
		@Pc(14) int local14 = ((Class80_Sub13_Sub1_Sub2) arg0).method24004();
		if (local14 != -1) {
			OpenGL.glUniform2fv(local14, 4, arg1.method30106(aFloatArray31), 0);
		}
	}

	@OriginalMember(owner = "client!agq", name = "bn", descriptor = "(ILjava/lang/String;Ljava/lang/String;)I")
	int method8524(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		if (arg1 == null) {
			return 0;
		}
		@Pc(6) int local6 = OpenGL.glCreateShader(arg0);
		OpenGL.glShaderSource(local6, arg1);
		OpenGL.glCompileShader(local6);
		OpenGL.glGetShaderiv(local6, 35713, anIntArray95, 0);
		if (anIntArray95[0] == 0) {
			OpenGL.glDeleteShader(local6);
			local6 = 0;
		}
		return local6;
	}

	@OriginalMember(owner = "client!agq", name = "hj", descriptor = "()V")
	void method8525() {
		this.method30837();
	}

	@OriginalMember(owner = "client!agq", name = "bl", descriptor = "(IFFF)V")
	@Override
	void method8588(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		OpenGL.glUniform3f(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!agq", name = "br", descriptor = "(IFFF)V")
	@Override
	void method8617(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		OpenGL.glUniform3f(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!agq", name = "k", descriptor = "(Lclient!aqv;Lclient!pm;)V")
	@Override
	void method8583(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) Class487 arg1) {
		assert arg0.method23989(36064) == Class317.aClass317_130;
		@Pc(14) int local14 = ((Class80_Sub13_Sub1_Sub2) arg0).method24004();
		if (local14 != -1) {
			OpenGL.glUniform4fv(local14, 4, arg1.method30102(aFloatArray31), 0);
		}
	}

	@OriginalMember(owner = "client!agq", name = "bt", descriptor = "(ILjava/lang/String;Ljava/lang/String;)I")
	int method8526(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		if (arg1 == null) {
			return 0;
		}
		@Pc(6) int local6 = OpenGL.glCreateShader(arg0);
		OpenGL.glShaderSource(local6, arg1);
		OpenGL.glCompileShader(local6);
		OpenGL.glGetShaderiv(local6, 35713, anIntArray95, 0);
		if (anIntArray95[0] == 0) {
			OpenGL.glDeleteShader(local6);
			local6 = 0;
		}
		return local6;
	}

	@OriginalMember(owner = "client!agq", name = "bs", descriptor = "(ILjava/lang/String;Ljava/lang/String;)I")
	int method8527(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		if (arg1 == null) {
			return 0;
		}
		@Pc(6) int local6 = OpenGL.glCreateShader(arg0);
		OpenGL.glShaderSource(local6, arg1);
		OpenGL.glCompileShader(local6);
		OpenGL.glGetShaderiv(local6, 35713, anIntArray95, 0);
		if (anIntArray95[0] == 0) {
			OpenGL.glDeleteShader(local6);
			local6 = 0;
		}
		return local6;
	}

	@OriginalMember(owner = "client!agq", name = "l", descriptor = "(Lclient!aqv;FF)V")
	@Override
	void method8592(@OriginalArg(0) Class80_Sub13_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(3) int local3 = ((Class80_Sub13_Sub1_Sub2) arg0).method24004();
		if (local3 == -1 || this.aMap6.get(local3) != null && this.aMap7.get(local3) != null && (Float) this.aMap6.get(local3) == arg1 && (Float) this.aMap7.get(local3) == arg2) {
			return;
		}
		this.aMap6.put(local3, arg1);
		this.aMap7.put(local3, arg2);
		if (arg0.method23989(36064) != Class317.aClass317_34) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		OpenGL.glUniform2f(local3, arg1, arg2);
	}
}
