package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!asq")
public class Class93_Sub1_Sub18 extends Class93_Sub1 {

	@OriginalMember(owner = "client!asq", name = "z", descriptor = "[I")
	int[] anIntArray265;

	@OriginalMember(owner = "client!asq", name = "p", descriptor = "[[I")
	int[][] anIntArrayArray46;

	@OriginalMember(owner = "client!asq", name = "u", descriptor = "[Ljava/lang/String;")
	String[] aStringArray21;

	@OriginalMember(owner = "client!asq", name = "l", descriptor = "Lclient!ach;")
	Class58 aClass58_1;

	@OriginalMember(owner = "client!asq", name = "d", descriptor = "[I")
	public int[] anIntArray266;

	@OriginalMember(owner = "client!asq", name = "c", descriptor = "Z")
	public boolean aBoolean513 = true;

	@OriginalMember(owner = "client!asq", name = "<init>", descriptor = "()V", line = 16)
	Class93_Sub1_Sub18() {
	}

	@OriginalMember(owner = "client!asq", name = "p", descriptor = "(Lclient!alw;)V", line = 20)
	void method22916(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22465((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method22921(arg0, local3, (byte) 32);
		}
	}

	@OriginalMember(owner = "client!asq", name = "d", descriptor = "(Lclient!alw;)V", line = 20)
	void method22917(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22465((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method22921(arg0, local3, (byte) 73);
		}
	}

	@OriginalMember(owner = "client!asq", name = "c", descriptor = "(Lclient!alw;)V", line = 20)
	void method22918(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22465((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method22921(arg0, local3, (byte) 17);
		}
	}

	@OriginalMember(owner = "client!asq", name = "e", descriptor = "(Lclient!alw;I)V", line = 20)
	void method22919(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.method22465((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method22921(arg0, local3, (byte) 42);
		}
	}

	@OriginalMember(owner = "client!asq", name = "v", descriptor = "(Lclient!alw;I)V", line = 27)
	void method22920(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aStringArray21 = client.method24953(arg0.method22509(1128505285), '<', 1771584241);
			return;
		}
		@Pc(18) int local18;
		@Pc(24) int local24;
		if (arg1 == 2) {
			local18 = arg0.method22465((short) 16384);
			this.anIntArray266 = new int[local18];
			for (local24 = 0; local24 < local18; local24++) {
				this.anIntArray266[local24] = arg0.method22472(-1434290800);
			}
		} else if (arg1 == 3) {
			local18 = arg0.method22465((short) 16384);
			this.anIntArray265 = new int[local18];
			this.anIntArrayArray46 = new int[local18][];
			for (local24 = 0; local24 < local18; local24++) {
				@Pc(61) int local61 = arg0.method22472(-1434290800);
				@Pc(65) Class669 local65 = Class573.method31338(local61, 1206101623);
				if (local65 != null) {
					this.anIntArray265[local24] = local61;
					this.anIntArrayArray46[local24] = new int[local65.anInt5851 * -1775819283];
					for (@Pc(84) int local84 = 0; local84 < local65.anInt5851 * -1775819283; local84++) {
						this.anIntArrayArray46[local24][local84] = arg0.method22472(-1434290800);
					}
				}
			}
		} else if (arg1 == 4) {
			this.aBoolean513 = false;
		}
	}

	@OriginalMember(owner = "client!asq", name = "n", descriptor = "(Lclient!alw;IB)V", line = 27)
	void method22921(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (arg1 == 1) {
			this.aStringArray21 = client.method24953(arg0.method22509(802627326), '<', 1972213578);
			return;
		}
		@Pc(18) int local18;
		@Pc(24) int local24;
		if (arg1 == 2) {
			local18 = arg0.method22465((short) 16384);
			this.anIntArray266 = new int[local18];
			for (local24 = 0; local24 < local18; local24++) {
				this.anIntArray266[local24] = arg0.method22472(-1434290800);
			}
		} else if (arg1 == 3) {
			local18 = arg0.method22465((short) 16384);
			this.anIntArray265 = new int[local18];
			this.anIntArrayArray46 = new int[local18][];
			for (local24 = 0; local24 < local18; local24++) {
				@Pc(61) int local61 = arg0.method22472(-1434290800);
				@Pc(65) Class669 local65 = Class573.method31338(local61, -557748748);
				if (local65 != null) {
					this.anIntArray265[local24] = local61;
					this.anIntArrayArray46[local24] = new int[local65.anInt5851 * -1775819283];
					for (@Pc(84) int local84 = 0; local84 < local65.anInt5851 * -1775819283; local84++) {
						this.anIntArrayArray46[local24][local84] = arg0.method22472(-1434290800);
					}
				}
			}
		} else if (arg1 == 4) {
			this.aBoolean513 = false;
		}
	}

	@OriginalMember(owner = "client!asq", name = "r", descriptor = "(Lclient!alw;I)V", line = 27)
	void method22922(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aStringArray21 = client.method24953(arg0.method22509(2126221792), '<', 2073624696);
			return;
		}
		@Pc(18) int local18;
		@Pc(24) int local24;
		if (arg1 == 2) {
			local18 = arg0.method22465((short) 16384);
			this.anIntArray266 = new int[local18];
			for (local24 = 0; local24 < local18; local24++) {
				this.anIntArray266[local24] = arg0.method22472(-1434290800);
			}
		} else if (arg1 == 3) {
			local18 = arg0.method22465((short) 16384);
			this.anIntArray265 = new int[local18];
			this.anIntArrayArray46 = new int[local18][];
			for (local24 = 0; local24 < local18; local24++) {
				@Pc(61) int local61 = arg0.method22472(-1434290800);
				@Pc(65) Class669 local65 = Class573.method31338(local61, 2059298898);
				if (local65 != null) {
					this.anIntArray265[local24] = local61;
					this.anIntArrayArray46[local24] = new int[local65.anInt5851 * -1775819283];
					for (@Pc(84) int local84 = 0; local84 < local65.anInt5851 * -1775819283; local84++) {
						this.anIntArrayArray46[local24][local84] = arg0.method22472(-1434290800);
					}
				}
			}
		} else if (arg1 == 4) {
			this.aBoolean513 = false;
		}
	}

	@OriginalMember(owner = "client!asq", name = "a", descriptor = "(Lclient!alw;[I)V", line = 55)
	public void method22923(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int[] arg1) {
		if (this.anIntArray265 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.anIntArray265.length && local5 < arg1.length; local5++) {
			@Pc(22) int local22 = this.method22935(local5, (byte) -90).anInt5853 * -2006530395;
			if (local22 > 0) {
				arg0.method22425((long) arg1[local5], local22, 2010424915);
			}
		}
	}

	@OriginalMember(owner = "client!asq", name = "m", descriptor = "(Lclient!alw;[II)V", line = 55)
	public void method22924(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		if (this.anIntArray265 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.anIntArray265.length && local5 < arg1.length; local5++) {
			@Pc(22) int local22 = this.method22935(local5, (byte) -37).anInt5853 * -2006530395;
			if (local22 > 0) {
				arg0.method22425((long) arg1[local5], local22, 1316257943);
			}
		}
	}

	@OriginalMember(owner = "client!asq", name = "y", descriptor = "(Lclient!alw;[I)V", line = 55)
	public void method22925(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int[] arg1) {
		if (this.anIntArray265 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.anIntArray265.length && local5 < arg1.length; local5++) {
			@Pc(22) int local22 = this.method22935(local5, (byte) -43).anInt5853 * -2006530395;
			if (local22 > 0) {
				arg0.method22425((long) arg1[local5], local22, 1197842550);
			}
		}
	}

	@OriginalMember(owner = "client!asq", name = "x", descriptor = "(Lclient!alw;[I)V", line = 55)
	public void method22926(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int[] arg1) {
		if (this.anIntArray265 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.anIntArray265.length && local5 < arg1.length; local5++) {
			@Pc(22) int local22 = this.method22935(local5, (byte) -67).anInt5853 * -2006530395;
			if (local22 > 0) {
				arg0.method22425((long) arg1[local5], local22, 841036994);
			}
		}
	}

	@OriginalMember(owner = "client!asq", name = "h", descriptor = "(Lclient!alw;[I)V", line = 55)
	public void method22927(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int[] arg1) {
		if (this.anIntArray265 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.anIntArray265.length && local5 < arg1.length; local5++) {
			@Pc(22) int local22 = this.method22935(local5, (byte) -71).anInt5853 * -2006530395;
			if (local22 > 0) {
				arg0.method22425((long) arg1[local5], local22, 580108022);
			}
		}
	}

	@OriginalMember(owner = "client!asq", name = "k", descriptor = "(Lclient!alw;B)Ljava/lang/String;", line = 63)
	public String method22928(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) byte arg1) {
		@Pc(4) StringBuilder local4 = new StringBuilder(80);
		if (this.anIntArray265 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.anIntArray265.length; local10++) {
				local4.append(this.aStringArray21[local10]);
				local4.append(this.aClass58_1.method1096(this.method22935(local10, (byte) -35), this.anIntArrayArray46[local10], arg0.method22501(Class573.method31338(this.anIntArray265[local10], 1449752659).anInt5854 * -1499792773, -2140812451)));
			}
		}
		local4.append(this.aStringArray21[this.aStringArray21.length - 1]);
		return local4.toString();
	}

	@OriginalMember(owner = "client!asq", name = "g", descriptor = "(Lclient!alw;)Ljava/lang/String;", line = 63)
	public String method22929(@OriginalArg(0) Class93_Sub41 arg0) {
		@Pc(4) StringBuilder local4 = new StringBuilder(80);
		if (this.anIntArray265 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.anIntArray265.length; local10++) {
				local4.append(this.aStringArray21[local10]);
				local4.append(this.aClass58_1.method1096(this.method22935(local10, (byte) -81), this.anIntArrayArray46[local10], arg0.method22501(Class573.method31338(this.anIntArray265[local10], -936189345).anInt5854 * -1499792773, 1836890668)));
			}
		}
		local4.append(this.aStringArray21[this.aStringArray21.length - 1]);
		return local4.toString();
	}

	@OriginalMember(owner = "client!asq", name = "i", descriptor = "()Ljava/lang/String;", line = 75)
	public String method22930() {
		@Pc(4) StringBuilder local4 = new StringBuilder(80);
		if (this.aStringArray21 == null) {
			return "";
		}
		local4.append(this.aStringArray21[0]);
		for (@Pc(18) int local18 = 1; local18 < this.aStringArray21.length; local18++) {
			for (@Pc(25) int local25 = 0; local25 < 3; local25++) {
				local4.append('.');
			}
			local4.append(this.aStringArray21[local18]);
		}
		return local4.toString();
	}

	@OriginalMember(owner = "client!asq", name = "f", descriptor = "(I)Ljava/lang/String;", line = 75)
	public String method22931(@OriginalArg(0) int arg0) {
		@Pc(4) StringBuilder local4 = new StringBuilder(80);
		if (this.aStringArray21 == null) {
			return "";
		}
		local4.append(this.aStringArray21[0]);
		for (@Pc(18) int local18 = 1; local18 < this.aStringArray21.length; local18++) {
			for (@Pc(25) int local25 = 0; local25 < 3; local25++) {
				local4.append('.');
			}
			local4.append(this.aStringArray21[local18]);
		}
		return local4.toString();
	}

	@OriginalMember(owner = "client!asq", name = "w", descriptor = "(I)I", line = 86)
	public int method22932(@OriginalArg(0) int arg0) {
		return this.anIntArray265 == null ? 0 : this.anIntArray265.length;
	}

	@OriginalMember(owner = "client!asq", name = "j", descriptor = "()I", line = 86)
	public int method22933() {
		return this.anIntArray265 == null ? 0 : this.anIntArray265.length;
	}

	@OriginalMember(owner = "client!asq", name = "ae", descriptor = "()I", line = 86)
	public int method22934() {
		return this.anIntArray265 == null ? 0 : this.anIntArray265.length;
	}

	@OriginalMember(owner = "client!asq", name = "l", descriptor = "(IB)Lclient!xs;", line = 91)
	public Class669 method22935(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return this.anIntArray265 == null || arg0 < 0 || arg0 > this.anIntArray265.length ? null : Class573.method31338(this.anIntArray265[arg0], 66598609);
	}

	@OriginalMember(owner = "client!asq", name = "al", descriptor = "(I)Lclient!xs;", line = 91)
	public Class669 method22936(@OriginalArg(0) int arg0) {
		return this.anIntArray265 == null || arg0 < 0 || arg0 > this.anIntArray265.length ? null : Class573.method31338(this.anIntArray265[arg0], 1571567367);
	}

	@OriginalMember(owner = "client!asq", name = "ag", descriptor = "(I)Lclient!xs;", line = 91)
	public Class669 method22937(@OriginalArg(0) int arg0) {
		return this.anIntArray265 == null || arg0 < 0 || arg0 > this.anIntArray265.length ? null : Class573.method31338(this.anIntArray265[arg0], -187134238);
	}

	@OriginalMember(owner = "client!asq", name = "ah", descriptor = "(I)Lclient!xs;", line = 91)
	public Class669 method22938(@OriginalArg(0) int arg0) {
		return this.anIntArray265 == null || arg0 < 0 || arg0 > this.anIntArray265.length ? null : Class573.method31338(this.anIntArray265[arg0], -187579739);
	}

	@OriginalMember(owner = "client!asq", name = "u", descriptor = "(III)I", line = 96)
	public int method22939(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anIntArray265 == null || arg0 < 0 || arg0 > this.anIntArray265.length) {
			return -1;
		} else if (this.anIntArrayArray46[arg0] == null || arg1 < 0 || arg1 > this.anIntArrayArray46[arg0].length) {
			return -1;
		} else {
			return this.anIntArrayArray46[arg0][arg1];
		}
	}

	@OriginalMember(owner = "client!asq", name = "ac", descriptor = "(II)I", line = 96)
	public int method22940(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray265 == null || arg0 < 0 || arg0 > this.anIntArray265.length) {
			return -1;
		} else if (this.anIntArrayArray46[arg0] == null || arg1 < 0 || arg1 > this.anIntArrayArray46[arg0].length) {
			return -1;
		} else {
			return this.anIntArrayArray46[arg0][arg1];
		}
	}

	@OriginalMember(owner = "client!asq", name = "ai", descriptor = "(II)I", line = 96)
	public int method22941(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArray265 == null || arg0 < 0 || arg0 > this.anIntArray265.length) {
			return -1;
		} else if (this.anIntArrayArray46[arg0] == null || arg1 < 0 || arg1 > this.anIntArrayArray46[arg0].length) {
			return -1;
		} else {
			return this.anIntArrayArray46[arg0][arg1];
		}
	}

	@OriginalMember(owner = "client!asq", name = "aw", descriptor = "()V", line = 102)
	void method22942() {
		if (this.anIntArray266 != null) {
			for (@Pc(4) int local4 = 0; local4 < this.anIntArray266.length; local4++) {
				this.anIntArray266[local4] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!asq", name = "ad", descriptor = "()V", line = 102)
	void method22943() {
		if (this.anIntArray266 != null) {
			for (@Pc(4) int local4 = 0; local4 < this.anIntArray266.length; local4++) {
				this.anIntArray266[local4] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!asq", name = "z", descriptor = "(B)V", line = 102)
	void method22944(@OriginalArg(0) byte arg0) {
		if (this.anIntArray266 != null) {
			for (@Pc(4) int local4 = 0; local4 < this.anIntArray266.length; local4++) {
				this.anIntArray266[local4] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!asq", name = "am", descriptor = "()V", line = 102)
	void method22945() {
		if (this.anIntArray266 != null) {
			for (@Pc(4) int local4 = 0; local4 < this.anIntArray266.length; local4++) {
				this.anIntArray266[local4] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!asq", name = "as", descriptor = "()V", line = 102)
	void method22946() {
		if (this.anIntArray266 != null) {
			for (@Pc(4) int local4 = 0; local4 < this.anIntArray266.length; local4++) {
				this.anIntArray266[local4] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!asq", name = "at", descriptor = "()V", line = 102)
	void method22947() {
		if (this.anIntArray266 != null) {
			for (@Pc(4) int local4 = 0; local4 < this.anIntArray266.length; local4++) {
				this.anIntArray266[local4] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!asq", name = "au", descriptor = "()V", line = 102)
	void method22948() {
		if (this.anIntArray266 != null) {
			for (@Pc(4) int local4 = 0; local4 < this.anIntArray266.length; local4++) {
				this.anIntArray266[local4] |= 0x8000;
			}
		}
	}
}
