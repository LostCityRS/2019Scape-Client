package com.jagex;

import jaggl.OpenGL;
import java.util.HashMap;
import java.util.Map;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!agl")
public class Class116_Sub1 extends Class116 {

	@OriginalMember(owner = "client!agl", name = "f", descriptor = "I")
	static final int anInt956 = 35632;

	@OriginalMember(owner = "client!agl", name = "w", descriptor = "I")
	static final int anInt957 = 13;

	@OriginalMember(owner = "client!agl", name = "k", descriptor = "I")
	static final int anInt961 = 35633;

	@OriginalMember(owner = "client!agl", name = "v", descriptor = "[I")
	static final int[] anIntArray85 = new int[2];

	@OriginalMember(owner = "client!agl", name = "o", descriptor = "[F")
	static final float[] aFloatArray31 = new float[16];

	@OriginalMember(owner = "client!agl", name = "s", descriptor = "Ljava/util/Map;")
	final Map aMap10;

	@OriginalMember(owner = "client!agl", name = "c", descriptor = "Z")
	boolean aBoolean175;

	@OriginalMember(owner = "client!agl", name = "z", descriptor = "I")
	int anInt958;

	@OriginalMember(owner = "client!agl", name = "p", descriptor = "I")
	int anInt959;

	@OriginalMember(owner = "client!agl", name = "d", descriptor = "I")
	int anInt960;

	@OriginalMember(owner = "client!agl", name = "r", descriptor = "[I")
	int[] anIntArray84;

	@OriginalMember(owner = "client!agl", name = "h", descriptor = "Ljava/lang/String;")
	String aString36;

	@OriginalMember(owner = "client!agl", name = "y", descriptor = "Ljava/util/Map;")
	final Map aMap11;

	@OriginalMember(owner = "client!agl", name = "x", descriptor = "Ljava/util/Map;")
	final Map aMap12;

	@OriginalMember(owner = "client!agl", name = "q", descriptor = "Ljava/util/Map;")
	final Map aMap13;

	@OriginalMember(owner = "client!agl", name = "b", descriptor = "Ljava/util/Map;")
	final Map aMap14;

	@OriginalMember(owner = "client!agl", name = "a", descriptor = "Ljava/lang/String;")
	String aString37;

	@OriginalMember(owner = "client!agl", name = "u", descriptor = "Lclient!ago;")
	Class115_Sub2 aClass115_Sub2_1;

	@OriginalMember(owner = "client!agl", name = "l", descriptor = "Lclient!aqv;")
	Class104_Sub2_Sub2 aClass104_Sub2_Sub2_1;

	@OriginalMember(owner = "client!agl", name = "<init>", descriptor = "(Lclient!aqv;Lclient!ago;Lclient!hn;)V", line = 35)
	Class116_Sub1(@OriginalArg(0) Class104_Sub2_Sub2 arg0, @OriginalArg(1) Class115_Sub2 arg1, @OriginalArg(2) Class318 arg2) {
		this(arg0, arg2);
		this.aClass115_Sub2_1 = arg1;
		this.aClass104_Sub2_Sub2_1 = arg0;
	}

	@OriginalMember(owner = "client!agl", name = "<init>", descriptor = "(Lclient!aqv;Lclient!hn;)V", line = 40)
	Class116_Sub1(@OriginalArg(0) Class104_Sub2_Sub2 arg0, @OriginalArg(1) Class318 arg1) {
		this.anInt958 = 0;
		this.anInt959 = 0;
		this.anInt960 = 0;
		this.aBoolean175 = false;
		this.anIntArray84 = new int[13];
		this.aMap10 = new HashMap();
		this.aMap11 = new HashMap();
		this.aMap13 = new HashMap();
		this.aMap12 = new HashMap();
		this.aMap14 = new HashMap();
		this.aString40 = arg1.aString172;
		@Pc(50) StringBuilder local50 = new StringBuilder();
		@Pc(63) Class309[] local63;
		@Pc(65) int local65;
		@Pc(73) Class309 local73;
		if (arg1.aString170 != null) {
			this.aString39 = arg1.aString170;
			if (arg1.aClass309Array1 != null) {
				local63 = arg1.aClass309Array1;
				for (local65 = 0; local65 < local63.length; local65++) {
					local73 = local63[local65];
					local50.append("#define " + local73.aString161 + " " + local73.aString160 + '\n');
				}
			}
			local50.append(new String(arg0.method21298(this.aString39)));
			this.aString36 = local50.toString();
		}
		if (arg1.aString171 != null) {
			this.aString41 = arg1.aString171;
			local50.setLength(0);
			if (arg1.aClass309Array2 != null) {
				local63 = arg1.aClass309Array2;
				for (local65 = 0; local65 < local63.length; local65++) {
					local73 = local63[local65];
					local50.append("#define " + local73.aString161 + " " + local73.aString160 + '\n');
				}
			}
			local50.append(new String(arg0.method21298(this.aString41)));
			this.aString37 = local50.toString();
		}
		Class713.method36859(this.anIntArray84, 0, this.anIntArray84.length, -1);
	}

	@OriginalMember(owner = "client!agl", name = "af", descriptor = "(ILjava/lang/String;Ljava/lang/String;)I", line = 80)
	int method8158(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		if (arg1 == null) {
			return 0;
		}
		@Pc(6) int local6 = OpenGL.glCreateShader(arg0);
		OpenGL.glShaderSource(local6, arg1);
		OpenGL.glCompileShader(local6);
		OpenGL.glGetShaderiv(local6, 35713, anIntArray85, 0);
		if (anIntArray85[0] == 0) {
			OpenGL.glDeleteShader(local6);
			local6 = 0;
		}
		return local6;
	}

	@OriginalMember(owner = "client!agl", name = "ak", descriptor = "(ILjava/lang/String;Ljava/lang/String;)I", line = 80)
	int method8159(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		if (arg1 == null) {
			return 0;
		}
		@Pc(6) int local6 = OpenGL.glCreateShader(arg0);
		OpenGL.glShaderSource(local6, arg1);
		OpenGL.glCompileShader(local6);
		OpenGL.glGetShaderiv(local6, 35713, anIntArray85, 0);
		if (anIntArray85[0] == 0) {
			OpenGL.glDeleteShader(local6);
			local6 = 0;
		}
		return local6;
	}

	@OriginalMember(owner = "client!agl", name = "an", descriptor = "(ILjava/lang/String;Ljava/lang/String;)I", line = 80)
	int method8160(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		if (arg1 == null) {
			return 0;
		}
		@Pc(6) int local6 = OpenGL.glCreateShader(arg0);
		OpenGL.glShaderSource(local6, arg1);
		OpenGL.glCompileShader(local6);
		OpenGL.glGetShaderiv(local6, 35713, anIntArray85, 0);
		if (anIntArray85[0] == 0) {
			OpenGL.glDeleteShader(local6);
			local6 = 0;
		}
		return local6;
	}

	@OriginalMember(owner = "client!agl", name = "n", descriptor = "()Z", line = 95)
	@Override
	public boolean method8444() {
		if (this.aBoolean175) {
			return true;
		}
		this.aClass104_Sub2_Sub2_1.aClass116_Sub1_2 = null;
		this.anInt959 = this.method8158(35633, this.aString36, this.aString39);
		this.anInt960 = this.method8158(35632, this.aString37, this.aString41);
		if (this.anInt959 == 0 || this.anInt960 == 0) {
			if (this.anInt959 != 0) {
				OpenGL.glDeleteShader(this.anInt959);
			}
			if (this.anInt960 != 0) {
				OpenGL.glDeleteShader(this.anInt960);
			}
			return false;
		}
		this.anInt958 = OpenGL.glCreateProgram();
		if (this.anInt959 != 0) {
			OpenGL.glAttachShader(this.anInt958, this.anInt959);
		}
		if (this.anInt960 != 0) {
			OpenGL.glAttachShader(this.anInt958, this.anInt960);
		}
		OpenGL.glLinkProgram(this.anInt958);
		OpenGL.glGetProgramiv(this.anInt958, 35714, anIntArray85, 0);
		if (anIntArray85[0] == 0) {
			if (this.anInt959 != 0) {
				OpenGL.glDetachShader(this.anInt958, this.anInt959);
				OpenGL.glDeleteShader(this.anInt959);
			}
			if (this.anInt960 != 0) {
				OpenGL.glDetachShader(this.anInt958, this.anInt960);
				OpenGL.glDeleteShader(this.anInt960);
			}
			OpenGL.glDeleteProgram(this.anInt958);
			return false;
		}
		OpenGL.glUseProgram(this.anInt958);
		@Pc(110) int local110 = -1;
		@Pc(112) int local112;
		for (local112 = 0; local112 < this.aClass115_Sub2_1.method8200((byte) -81); local112++) {
			if (this.aClass115_Sub2_1.method8203(local112, -1596755927) == this) {
				local110 = local112;
				break;
			}
		}
		if (local110 == -1) {
			return false;
		}
		@Pc(149) Class93_Sub33_Sub1 local149;
		for (local112 = 0; local112 < this.aClass115_Sub2_1.method8285(-348623653); local112++) {
			local149 = this.aClass115_Sub2_1.method8288(local112, -2119497531);
			if (local149 != null) {
				local149.method23661(local110);
			}
		}
		for (local112 = 0; local112 < this.aClass115_Sub2_1.method8277(198685086); local112++) {
			local149 = this.aClass115_Sub2_1.method8282(local112, (byte) 6);
			if (local149 != null) {
				local149.method23661(local110);
			}
		}
		this.aString36 = null;
		this.aString37 = null;
		this.aBoolean175 = true;
		return true;
	}

	@OriginalMember(owner = "client!agl", name = "a", descriptor = "()Z", line = 95)
	@Override
	public boolean method8460() {
		if (this.aBoolean175) {
			return true;
		}
		this.aClass104_Sub2_Sub2_1.aClass116_Sub1_2 = null;
		this.anInt959 = this.method8158(35633, this.aString36, this.aString39);
		this.anInt960 = this.method8158(35632, this.aString37, this.aString41);
		if (this.anInt959 == 0 || this.anInt960 == 0) {
			if (this.anInt959 != 0) {
				OpenGL.glDeleteShader(this.anInt959);
			}
			if (this.anInt960 != 0) {
				OpenGL.glDeleteShader(this.anInt960);
			}
			return false;
		}
		this.anInt958 = OpenGL.glCreateProgram();
		if (this.anInt959 != 0) {
			OpenGL.glAttachShader(this.anInt958, this.anInt959);
		}
		if (this.anInt960 != 0) {
			OpenGL.glAttachShader(this.anInt958, this.anInt960);
		}
		OpenGL.glLinkProgram(this.anInt958);
		OpenGL.glGetProgramiv(this.anInt958, 35714, anIntArray85, 0);
		if (anIntArray85[0] == 0) {
			if (this.anInt959 != 0) {
				OpenGL.glDetachShader(this.anInt958, this.anInt959);
				OpenGL.glDeleteShader(this.anInt959);
			}
			if (this.anInt960 != 0) {
				OpenGL.glDetachShader(this.anInt958, this.anInt960);
				OpenGL.glDeleteShader(this.anInt960);
			}
			OpenGL.glDeleteProgram(this.anInt958);
			return false;
		}
		OpenGL.glUseProgram(this.anInt958);
		@Pc(110) int local110 = -1;
		@Pc(112) int local112;
		for (local112 = 0; local112 < this.aClass115_Sub2_1.method8200((byte) -5); local112++) {
			if (this.aClass115_Sub2_1.method8203(local112, -1316554355) == this) {
				local110 = local112;
				break;
			}
		}
		if (local110 == -1) {
			return false;
		}
		@Pc(149) Class93_Sub33_Sub1 local149;
		for (local112 = 0; local112 < this.aClass115_Sub2_1.method8285(-1330985516); local112++) {
			local149 = this.aClass115_Sub2_1.method8288(local112, -1073492800);
			if (local149 != null) {
				local149.method23661(local110);
			}
		}
		for (local112 = 0; local112 < this.aClass115_Sub2_1.method8277(-11161597); local112++) {
			local149 = this.aClass115_Sub2_1.method8282(local112, (byte) 6);
			if (local149 != null) {
				local149.method23661(local110);
			}
		}
		this.aString36 = null;
		this.aString37 = null;
		this.aBoolean175 = true;
		return true;
	}

	@OriginalMember(owner = "client!agl", name = "g", descriptor = "(Lclient!aql;F)V", line = 147)
	@Override
	void method8481(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) float arg1) {
		@Pc(3) int local3 = ((Class93_Sub33_Sub1_Sub2) arg0).method23668();
		if (local3 == -1 || this.aMap10.get(local3) != null && (Float) this.aMap10.get(local3) == arg1) {
			return;
		}
		this.aMap10.put(local3, arg1);
		if (arg0.method23654(-811031715) != Class323.aClass323_92 && arg0.method23654(283681093) != Class323.aClass323_77) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		OpenGL.glUniform1f(local3, arg1);
	}

	@OriginalMember(owner = "client!agl", name = "k", descriptor = "(Lclient!aql;F)V", line = 147)
	@Override
	void method8445(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) float arg1) {
		@Pc(3) int local3 = ((Class93_Sub33_Sub1_Sub2) arg0).method23668();
		if (local3 == -1 || this.aMap10.get(local3) != null && (Float) this.aMap10.get(local3) == arg1) {
			return;
		}
		this.aMap10.put(local3, arg1);
		if (arg0.method23654(964724587) != Class323.aClass323_92 && arg0.method23654(-343838246) != Class323.aClass323_77) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		OpenGL.glUniform1f(local3, arg1);
	}

	@OriginalMember(owner = "client!agl", name = "i", descriptor = "(Lclient!aql;F)V", line = 147)
	@Override
	void method8462(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) float arg1) {
		@Pc(3) int local3 = ((Class93_Sub33_Sub1_Sub2) arg0).method23668();
		if (local3 == -1 || this.aMap10.get(local3) != null && (Float) this.aMap10.get(local3) == arg1) {
			return;
		}
		this.aMap10.put(local3, arg1);
		if (arg0.method23654(-1525763991) != Class323.aClass323_92 && arg0.method23654(-1829538548) != Class323.aClass323_77) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		OpenGL.glUniform1f(local3, arg1);
	}

	@OriginalMember(owner = "client!agl", name = "j", descriptor = "(Lclient!aql;F)V", line = 147)
	@Override
	void method8463(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) float arg1) {
		@Pc(3) int local3 = ((Class93_Sub33_Sub1_Sub2) arg0).method23668();
		if (local3 == -1 || this.aMap10.get(local3) != null && (Float) this.aMap10.get(local3) == arg1) {
			return;
		}
		this.aMap10.put(local3, arg1);
		if (arg0.method23654(-554121446) != Class323.aClass323_92 && arg0.method23654(-1617881755) != Class323.aClass323_77) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		OpenGL.glUniform1f(local3, arg1);
	}

	@OriginalMember(owner = "client!agl", name = "f", descriptor = "(Lclient!aql;FF)V", line = 157)
	@Override
	void method8446(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(3) int local3 = ((Class93_Sub33_Sub1_Sub2) arg0).method23668();
		if (local3 == -1 || this.aMap10.get(local3) != null && this.aMap11.get(local3) != null && (Float) this.aMap10.get(local3) == arg1 && (Float) this.aMap11.get(local3) == arg2) {
			return;
		}
		this.aMap10.put(local3, arg1);
		this.aMap11.put(local3, arg2);
		if (arg0.method23654(738288180) != Class323.aClass323_63) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		OpenGL.glUniform2f(local3, arg1, arg2);
	}

	@OriginalMember(owner = "client!agl", name = "t", descriptor = "(Lclient!aql;FF)V", line = 157)
	@Override
	void method8471(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(3) int local3 = ((Class93_Sub33_Sub1_Sub2) arg0).method23668();
		if (local3 == -1 || this.aMap10.get(local3) != null && this.aMap11.get(local3) != null && (Float) this.aMap10.get(local3) == arg1 && (Float) this.aMap11.get(local3) == arg2) {
			return;
		}
		this.aMap10.put(local3, arg1);
		this.aMap11.put(local3, arg2);
		if (arg0.method23654(2132270744) != Class323.aClass323_63) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		OpenGL.glUniform2f(local3, arg1, arg2);
	}

	@OriginalMember(owner = "client!agl", name = "w", descriptor = "(Lclient!aql;FFF)V", line = 168)
	@Override
	void method8467(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(3) int local3 = ((Class93_Sub33_Sub1_Sub2) arg0).method23668();
		if (local3 == -1 || this.aMap10.get(local3) != null && this.aMap11.get(local3) != null && this.aMap13.get(local3) != null && (Float) this.aMap10.get(local3) == arg1 && (Float) this.aMap11.get(local3) == arg2 && (Float) this.aMap13.get(local3) == arg3) {
			return;
		}
		this.aMap10.put(local3, arg1);
		this.aMap11.put(local3, arg2);
		this.aMap13.put(local3, arg3);
		if (arg0.method23654(-1548677525) != Class323.aClass323_107) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		OpenGL.glUniform3f(local3, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!agl", name = "ae", descriptor = "(Lclient!aql;FFF)V", line = 168)
	@Override
	void method8465(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		@Pc(3) int local3 = ((Class93_Sub33_Sub1_Sub2) arg0).method23668();
		if (local3 == -1 || this.aMap10.get(local3) != null && this.aMap11.get(local3) != null && this.aMap13.get(local3) != null && (Float) this.aMap10.get(local3) == arg1 && (Float) this.aMap11.get(local3) == arg2 && (Float) this.aMap13.get(local3) == arg3) {
			return;
		}
		this.aMap10.put(local3, arg1);
		this.aMap11.put(local3, arg2);
		this.aMap13.put(local3, arg3);
		if (arg0.method23654(-1404800417) != Class323.aClass323_107) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		OpenGL.glUniform3f(local3, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!agl", name = "l", descriptor = "(Lclient!aql;FFFF)V", line = 180)
	@Override
	void method8448(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		@Pc(3) int local3 = ((Class93_Sub33_Sub1_Sub2) arg0).method23668();
		if (local3 == -1 || this.aMap10.get(local3) != null && this.aMap11.get(local3) != null && this.aMap13.get(local3) != null && this.aMap12.get(local3) != null && (Float) this.aMap10.get(local3) == arg1 && (Float) this.aMap11.get(local3) == arg2 && (Float) this.aMap13.get(local3) == arg3 && (Float) this.aMap12.get(local3) == arg4) {
			return;
		}
		this.aMap10.put(local3, arg1);
		this.aMap11.put(local3, arg2);
		this.aMap13.put(local3, arg3);
		this.aMap12.put(local3, arg4);
		if (arg0.method23654(35138706) != Class323.aClass323_34) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		OpenGL.glUniform4f(local3, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!agl", name = "ax", descriptor = "(Lclient!aql;FFFF)V", line = 180)
	@Override
	void method8479(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		@Pc(3) int local3 = ((Class93_Sub33_Sub1_Sub2) arg0).method23668();
		if (local3 == -1 || this.aMap10.get(local3) != null && this.aMap11.get(local3) != null && this.aMap13.get(local3) != null && this.aMap12.get(local3) != null && (Float) this.aMap10.get(local3) == arg1 && (Float) this.aMap11.get(local3) == arg2 && (Float) this.aMap13.get(local3) == arg3 && (Float) this.aMap12.get(local3) == arg4) {
			return;
		}
		this.aMap10.put(local3, arg1);
		this.aMap11.put(local3, arg2);
		this.aMap13.put(local3, arg3);
		this.aMap12.put(local3, arg4);
		if (arg0.method23654(-208980163) != Class323.aClass323_34) {
			throw new IllegalArgumentException_Sub1(arg0, "");
		}
		OpenGL.glUniform4f(local3, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!agl", name = "z", descriptor = "(Lclient!aql;[FI)V", line = 193)
	@Override
	void method8447(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = ((Class93_Sub33_Sub1_Sub2) arg0).method23668();
		if (local3 != -1) {
			OpenGL.glUniform4fv(local3, arg2, arg1, 0);
		}
	}

	@OriginalMember(owner = "client!agl", name = "ag", descriptor = "(Lclient!aql;[FI)V", line = 193)
	@Override
	void method8478(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = ((Class93_Sub33_Sub1_Sub2) arg0).method23668();
		if (local3 != -1) {
			OpenGL.glUniform4fv(local3, arg2, arg1, 0);
		}
	}

	@OriginalMember(owner = "client!agl", name = "p", descriptor = "(Lclient!aql;Lclient!pq;)V", line = 199)
	@Override
	void method8450(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) Class489 arg1) {
		assert arg0.method23654(1453655088) == Class323.aClass323_48;
		@Pc(14) int local14 = ((Class93_Sub33_Sub1_Sub2) arg0).method23668();
		if (local14 != -1) {
			OpenGL.glUniform2fv(local14, 4, arg1.method29949(aFloatArray31), 0);
		}
	}

	@OriginalMember(owner = "client!agl", name = "ah", descriptor = "(Lclient!aql;Lclient!pq;)V", line = 199)
	@Override
	void method8459(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) Class489 arg1) {
		assert arg0.method23654(406257278) == Class323.aClass323_48;
		@Pc(14) int local14 = ((Class93_Sub33_Sub1_Sub2) arg0).method23668();
		if (local14 != -1) {
			OpenGL.glUniform2fv(local14, 4, arg1.method29949(aFloatArray31), 0);
		}
	}

	@OriginalMember(owner = "client!agl", name = "aw", descriptor = "(Lclient!aql;Lclient!pq;)V", line = 206)
	@Override
	void method8470(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) Class489 arg1) {
		assert arg0.method23654(-1718821514) == Class323.aClass323_50;
		@Pc(14) int local14 = ((Class93_Sub33_Sub1_Sub2) arg0).method23668();
		if (local14 != -1) {
			OpenGL.glUniform4fv(local14, 4, arg1.method29940(aFloatArray31), 0);
		}
	}

	@OriginalMember(owner = "client!agl", name = "d", descriptor = "(Lclient!aql;Lclient!pq;)V", line = 206)
	@Override
	void method8461(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) Class489 arg1) {
		assert arg0.method23654(296480459) == Class323.aClass323_50;
		@Pc(14) int local14 = ((Class93_Sub33_Sub1_Sub2) arg0).method23668();
		if (local14 != -1) {
			OpenGL.glUniform4fv(local14, 4, arg1.method29940(aFloatArray31), 0);
		}
	}

	@OriginalMember(owner = "client!agl", name = "ai", descriptor = "(Lclient!aql;Lclient!pq;)V", line = 206)
	@Override
	void method8464(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) Class489 arg1) {
		assert arg0.method23654(1360623807) == Class323.aClass323_50;
		@Pc(14) int local14 = ((Class93_Sub33_Sub1_Sub2) arg0).method23668();
		if (local14 != -1) {
			OpenGL.glUniform4fv(local14, 4, arg1.method29940(aFloatArray31), 0);
		}
	}

	@OriginalMember(owner = "client!agl", name = "al", descriptor = "(Lclient!aql;Lclient!pq;)V", line = 206)
	@Override
	void method8484(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) Class489 arg1) {
		assert arg0.method23654(1430627427) == Class323.aClass323_50;
		@Pc(14) int local14 = ((Class93_Sub33_Sub1_Sub2) arg0).method23668();
		if (local14 != -1) {
			OpenGL.glUniform4fv(local14, 4, arg1.method29940(aFloatArray31), 0);
		}
	}

	@OriginalMember(owner = "client!agl", name = "ac", descriptor = "(Lclient!aql;Lclient!pq;)V", line = 206)
	@Override
	void method8468(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) Class489 arg1) {
		assert arg0.method23654(-429771548) == Class323.aClass323_50;
		@Pc(14) int local14 = ((Class93_Sub33_Sub1_Sub2) arg0).method23668();
		if (local14 != -1) {
			OpenGL.glUniform4fv(local14, 4, arg1.method29940(aFloatArray31), 0);
		}
	}

	@OriginalMember(owner = "client!agl", name = "c", descriptor = "(Lclient!aql;ILclient!mq;)V", line = 213)
	@Override
	void method8443(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface43 arg2) {
		@Pc(3) int local3 = ((Class93_Sub33_Sub1_Sub2) arg0).method23668();
		if (local3 == -1) {
			return;
		}
		if (arg2 == null) {
			arg2 = this.aClass104_Sub2_Sub2_1.anInterface38_23;
		}
		if (arg1 < this.aClass104_Sub2_Sub2_1.anInt2954) {
			this.aClass104_Sub2_Sub2_1.method21057(arg1);
			this.aClass104_Sub2_Sub2_1.method21061(arg2);
		} else {
			OpenGL.glActiveTexture(arg1 + 33984);
			OpenGL.glBindTexture(((Class141) arg2).anInt1373, ((Class141) arg2).anInt1369);
		}
		if (this.aMap14.get(local3) == null || (Integer) this.aMap14.get(local3) != arg1) {
			this.aMap14.put(local3, arg1);
			OpenGL.glUniform1i(local3, arg1);
		}
	}

	@OriginalMember(owner = "client!agl", name = "as", descriptor = "(Lclient!aql;ILclient!mq;)V", line = 213)
	@Override
	void method8480(@OriginalArg(0) Class93_Sub33_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface43 arg2) {
		@Pc(3) int local3 = ((Class93_Sub33_Sub1_Sub2) arg0).method23668();
		if (local3 == -1) {
			return;
		}
		if (arg2 == null) {
			arg2 = this.aClass104_Sub2_Sub2_1.anInterface38_23;
		}
		if (arg1 < this.aClass104_Sub2_Sub2_1.anInt2954) {
			this.aClass104_Sub2_Sub2_1.method21057(arg1);
			this.aClass104_Sub2_Sub2_1.method21061(arg2);
		} else {
			OpenGL.glActiveTexture(arg1 + 33984);
			OpenGL.glBindTexture(((Class141) arg2).anInt1373, ((Class141) arg2).anInt1369);
		}
		if (this.aMap14.get(local3) == null || (Integer) this.aMap14.get(local3) != arg1) {
			this.aMap14.put(local3, arg1);
			OpenGL.glUniform1i(local3, arg1);
		}
	}

	@OriginalMember(owner = "client!agl", name = "r", descriptor = "(IFFF)V", line = 233)
	@Override
	void method8449(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		OpenGL.glUniform3f(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!agl", name = "at", descriptor = "(IFFF)V", line = 233)
	@Override
	void method8472(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		OpenGL.glUniform3f(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!agl", name = "v", descriptor = "(IFFFF)V", line = 237)
	@Override
	void method8482(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		OpenGL.glUniform4f(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!agl", name = "aj", descriptor = "(IFFFF)V", line = 237)
	@Override
	void method8476(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4) {
		OpenGL.glUniform4f(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!agl", name = "o", descriptor = "(I[FI)V", line = 241)
	@Override
	void method8454(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		OpenGL.glUniform4fv(arg0, arg2, arg1, 0);
	}

	@OriginalMember(owner = "client!agl", name = "ad", descriptor = "(I[FI)V", line = 241)
	@Override
	void method8452(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2) {
		OpenGL.glUniform4fv(arg0, arg2, arg1, 0);
	}

	@OriginalMember(owner = "client!agl", name = "aa", descriptor = "(ILclient!pq;)V", line = 245)
	@Override
	void method8486(@OriginalArg(0) int arg0, @OriginalArg(1) Class489 arg1) {
		OpenGL.glUniform3fv(arg0, 3, arg1.method29946(aFloatArray31), 0);
	}

	@OriginalMember(owner = "client!agl", name = "az", descriptor = "(ILclient!pq;)V", line = 245)
	@Override
	void method8485(@OriginalArg(0) int arg0, @OriginalArg(1) Class489 arg1) {
		OpenGL.glUniform3fv(arg0, 3, arg1.method29946(aFloatArray31), 0);
	}

	@OriginalMember(owner = "client!agl", name = "s", descriptor = "(ILclient!pq;)V", line = 245)
	@Override
	void method8455(@OriginalArg(0) int arg0, @OriginalArg(1) Class489 arg1) {
		OpenGL.glUniform3fv(arg0, 3, arg1.method29946(aFloatArray31), 0);
	}

	@OriginalMember(owner = "client!agl", name = "ab", descriptor = "(ILclient!pq;)V", line = 245)
	@Override
	void method8451(@OriginalArg(0) int arg0, @OriginalArg(1) Class489 arg1) {
		OpenGL.glUniform3fv(arg0, 3, arg1.method29946(aFloatArray31), 0);
	}

	@OriginalMember(owner = "client!agl", name = "ay", descriptor = "(ILclient!pq;)V", line = 245)
	@Override
	void method8483(@OriginalArg(0) int arg0, @OriginalArg(1) Class489 arg1) {
		OpenGL.glUniform3fv(arg0, 3, arg1.method29946(aFloatArray31), 0);
	}

	@OriginalMember(owner = "client!agl", name = "y", descriptor = "(ILclient!pq;)V", line = 249)
	@Override
	void method8456(@OriginalArg(0) int arg0, @OriginalArg(1) Class489 arg1) {
		OpenGL.glUniform2fv(arg0, 4, arg1.method29949(aFloatArray31), 0);
	}

	@OriginalMember(owner = "client!agl", name = "au", descriptor = "(ILclient!pq;)V", line = 249)
	@Override
	void method8475(@OriginalArg(0) int arg0, @OriginalArg(1) Class489 arg1) {
		OpenGL.glUniform2fv(arg0, 4, arg1.method29949(aFloatArray31), 0);
	}

	@OriginalMember(owner = "client!agl", name = "am", descriptor = "(ILclient!pq;)V", line = 249)
	@Override
	void method8474(@OriginalArg(0) int arg0, @OriginalArg(1) Class489 arg1) {
		OpenGL.glUniform2fv(arg0, 4, arg1.method29949(aFloatArray31), 0);
	}

	@OriginalMember(owner = "client!agl", name = "ar", descriptor = "(ILclient!pq;)V", line = 253)
	@Override
	void method8473(@OriginalArg(0) int arg0, @OriginalArg(1) Class489 arg1) {
		OpenGL.glUniform4fv(arg0, 4, arg1.method29940(aFloatArray31), 0);
	}

	@OriginalMember(owner = "client!agl", name = "ap", descriptor = "(ILclient!pq;)V", line = 253)
	@Override
	void method8477(@OriginalArg(0) int arg0, @OriginalArg(1) Class489 arg1) {
		OpenGL.glUniform4fv(arg0, 4, arg1.method29940(aFloatArray31), 0);
	}

	@OriginalMember(owner = "client!agl", name = "aq", descriptor = "(ILclient!pq;)V", line = 253)
	@Override
	void method8469(@OriginalArg(0) int arg0, @OriginalArg(1) Class489 arg1) {
		OpenGL.glUniform4fv(arg0, 4, arg1.method29940(aFloatArray31), 0);
	}

	@OriginalMember(owner = "client!agl", name = "q", descriptor = "(ILclient!pq;)V", line = 253)
	@Override
	void method8457(@OriginalArg(0) int arg0, @OriginalArg(1) Class489 arg1) {
		OpenGL.glUniform4fv(arg0, 4, arg1.method29940(aFloatArray31), 0);
	}

	@OriginalMember(owner = "client!agl", name = "x", descriptor = "(IILclient!mq;)V", line = 257)
	@Override
	void method8458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface43 arg2) {
		this.aClass104_Sub2_Sub2_1.method21057(arg1);
		this.aClass104_Sub2_Sub2_1.method21061(arg2);
		OpenGL.glUniform1i(arg0, arg1);
	}

	@OriginalMember(owner = "client!agl", name = "av", descriptor = "(IILclient!mq;)V", line = 257)
	@Override
	void method8466(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface43 arg2) {
		this.aClass104_Sub2_Sub2_1.method21057(arg1);
		this.aClass104_Sub2_Sub2_1.method21061(arg2);
		OpenGL.glUniform1i(arg0, arg1);
	}

	@OriginalMember(owner = "client!agl", name = "ao", descriptor = "(IILclient!mq;)V", line = 257)
	@Override
	void method8453(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Interface43 arg2) {
		this.aClass104_Sub2_Sub2_1.method21057(arg1);
		this.aClass104_Sub2_Sub2_1.method21061(arg2);
		OpenGL.glUniform1i(arg0, arg1);
	}

	@OriginalMember(owner = "client!agl", name = "u", descriptor = "()V", line = 263)
	@Override
	public void method30885() {
		if (this.anInt958 == 0) {
			return;
		}
		this.aClass104_Sub2_Sub2_1.method21328(this.anInt958);
		if (this.anInt959 != 0) {
			this.aClass104_Sub2_Sub2_1.method21327((long) this.anInt959);
		}
		if (this.anInt960 != 0) {
			this.aClass104_Sub2_Sub2_1.method21327((long) this.anInt960);
		}
		this.anInt958 = 0;
		this.anInt959 = 0;
		this.anInt960 = 0;
	}

	@OriginalMember(owner = "client!agl", name = "m", descriptor = "()V", line = 263)
	@Override
	public void method30884() {
		if (this.anInt958 == 0) {
			return;
		}
		this.aClass104_Sub2_Sub2_1.method21328(this.anInt958);
		if (this.anInt959 != 0) {
			this.aClass104_Sub2_Sub2_1.method21327((long) this.anInt959);
		}
		if (this.anInt960 != 0) {
			this.aClass104_Sub2_Sub2_1.method21327((long) this.anInt960);
		}
		this.anInt958 = 0;
		this.anInt959 = 0;
		this.anInt960 = 0;
	}

	@OriginalMember(owner = "client!agl", name = "finalize", descriptor = "()V", line = 274)
	@Override
	void finalize() {
		this.method30884();
	}

	@OriginalMember(owner = "client!agl", name = "hl", descriptor = "()V", line = 274)
	void method8161() {
		this.method30884();
	}
}
