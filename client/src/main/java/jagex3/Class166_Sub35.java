package jagex3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!anl")
public final class Class166_Sub35 extends Class166 {

	@OriginalMember(owner = "client!anl", name = "l", descriptor = "I")
	static final int anInt2301 = 255;

	@OriginalMember(owner = "client!anl", name = "w", descriptor = "I")
	static final int anInt2302 = 0;

	@OriginalMember(owner = "client!anl", name = "m", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	static String method16241(@OriginalArg(0) Throwable arg0, @OriginalArg(1) int arg1) throws IOException {
		@Pc(15) String local15;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(5) RuntimeException_Sub1 local5 = (RuntimeException_Sub1) arg0;
			local15 = local5.aString115 + " | ";
			arg0 = local5.aThrowable1;
		} else {
			local15 = "";
		}
		@Pc(25) StringWriter local25 = new StringWriter();
		@Pc(30) PrintWriter local30 = new PrintWriter(local25);
		arg0.printStackTrace(local30);
		local30.close();
		@Pc(38) String local38 = local25.toString();
		@Pc(46) BufferedReader local46 = new BufferedReader(new StringReader(local38));
		@Pc(49) String local49 = local46.readLine();
		while (true) {
			@Pc(52) String local52 = local46.readLine();
			if (local52 == null) {
				return local15 + "| " + local49;
			}
			@Pc(59) int local59 = local52.indexOf(40);
			@Pc(66) int local66 = local52.indexOf(41, local59 + 1);
			@Pc(74) String local74;
			if (local59 == -1) {
				local74 = local52;
			} else {
				local74 = local52.substring(0, local59);
			}
			local74 = local74.trim();
			local74 = local74.substring(local74.lastIndexOf(32) + 1);
			local74 = local74.substring(local74.lastIndexOf(9) + 1);
			local15 = local15 + local74;
			if (local59 != -1 && local66 != -1) {
				@Pc(116) int local116 = local52.indexOf(".java:", local59);
				if (local116 >= 0) {
					local15 = local15 + local52.substring(local116 + 5, local66);
				}
			}
			local15 = local15 + ' ';
		}
	}

	@OriginalMember(owner = "client!anl", name = "<init>", descriptor = "(ILclient!ali;)V")
	public Class166_Sub35(@OriginalArg(0) int arg0, @OriginalArg(1) Class93_Sub36 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!anl", name = "<init>", descriptor = "(Lclient!ali;)V")
	public Class166_Sub35(@OriginalArg(0) Class93_Sub36 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!anl", name = "a", descriptor = "()I")
	public int method16233() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!anl", name = "o", descriptor = "(B)V")
	public void method16234(@OriginalArg(0) byte arg0) {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 255) {
			this.anInt2379 = this.method16554((byte) -110) * -88839937;
		}
	}

	@OriginalMember(owner = "client!anl", name = "u", descriptor = "()I")
	@Override
	int method16560() {
		return 127;
	}

	@OriginalMember(owner = "client!anl", name = "n", descriptor = "(II)I")
	@Override
	int method16555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return 1;
	}

	@OriginalMember(owner = "client!anl", name = "k", descriptor = "(II)V")
	@Override
	void method16557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!anl", name = "s", descriptor = "(I)I")
	public int method16235(@OriginalArg(0) int arg0) {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!anl", name = "f", descriptor = "()I")
	@Override
	int method16553() {
		return 127;
	}

	@OriginalMember(owner = "client!anl", name = "b", descriptor = "()I")
	public int method16236() {
		return this.anInt2379 * 960141055;
	}

	@OriginalMember(owner = "client!anl", name = "d", descriptor = "(I)V")
	@Override
	void method16558(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!anl", name = "e", descriptor = "(B)I")
	@Override
	int method16554(@OriginalArg(0) byte arg0) {
		return 127;
	}

	@OriginalMember(owner = "client!anl", name = "z", descriptor = "(I)I")
	@Override
	int method16561(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!anl", name = "p", descriptor = "(I)I")
	@Override
	int method16552(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!anl", name = "w", descriptor = "()I")
	@Override
	int method16562() {
		return 127;
	}

	@OriginalMember(owner = "client!anl", name = "c", descriptor = "(I)V")
	@Override
	void method16563(@OriginalArg(0) int arg0) {
		this.anInt2379 = arg0 * -88839937;
	}

	@OriginalMember(owner = "client!anl", name = "y", descriptor = "()V")
	public void method16237() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 255) {
			this.anInt2379 = this.method16554((byte) -40) * -88839937;
		}
	}

	@OriginalMember(owner = "client!anl", name = "q", descriptor = "()V")
	public void method16238() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 255) {
			this.anInt2379 = this.method16554((byte) -28) * -88839937;
		}
	}

	@OriginalMember(owner = "client!anl", name = "x", descriptor = "()V")
	public void method16239() {
		if (this.anInt2379 * 960141055 < 0 || this.anInt2379 * 960141055 > 255) {
			this.anInt2379 = this.method16554((byte) -50) * -88839937;
		}
	}

	@OriginalMember(owner = "client!anl", name = "l", descriptor = "()I")
	@Override
	int method16559() {
		return 127;
	}

	@OriginalMember(owner = "client!anl", name = "h", descriptor = "()I")
	public int method16240() {
		return this.anInt2379 * 960141055;
	}
}
