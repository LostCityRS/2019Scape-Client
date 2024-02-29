package jagex3;

import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gn")
public final class Class294 implements Interface26 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!gn", name = "this$0", descriptor = "Lclient!gx;")
	final Class303 aClass303_10;

	@OriginalMember(owner = "client!gn", name = "e", descriptor = "I")
	final int anInt3957;

	@OriginalMember(owner = "client!gn", name = "n", descriptor = "I")
	final int anInt3958;

	@OriginalMember(owner = "client!gn", name = "w", descriptor = "([SI)V")
	public static void method26689(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			arg0[local1] = 1024;
		}
	}

	@OriginalMember(owner = "client!gn", name = "e", descriptor = "(Ljava/io/File;B)V")
	static void method26690(@OriginalArg(0) File arg0, @OriginalArg(1) byte arg1) {
		Class556.aFile3 = arg0;
		if (!Class556.aFile3.exists()) {
			throw new RuntimeException("");
		}
		Class556.aBoolean813 = true;
	}

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Lclient!gx;Lclient!alw;)V")
	Class294(@OriginalArg(0) Class303 arg0, @OriginalArg(1) Class93_Sub41 arg1) {
		this.aClass303_10 = arg0;
		this.anInt3957 = arg1.method22427(-1434290800) * -417669931;
		this.anInt3958 = arg1.method22425((short) 16384) * -1576349769;
	}

	@OriginalMember(owner = "client!gn", name = "n", descriptor = "(Lclient!gq;)V")
	@Override
	public void method26807(@OriginalArg(0) Class297 arg0) {
		arg0.method26722(this.anInt3957 * -624984963, this.anInt3958 * 1539980807, -19580420);
		arg0.method26715(this.anInt3957 * -624984963, -432972930).method26849(-1942433304);
	}

	@OriginalMember(owner = "client!gn", name = "e", descriptor = "(Lclient!gq;B)V")
	@Override
	public void method26808(@OriginalArg(0) Class297 arg0, @OriginalArg(1) byte arg1) {
		arg0.method26722(this.anInt3957 * -624984963, this.anInt3958 * 1539980807, -1490245419);
		arg0.method26715(this.anInt3957 * -624984963, -443942604).method26849(-1942433304);
	}

	@OriginalMember(owner = "client!gn", name = "m", descriptor = "(Lclient!gq;)V")
	@Override
	public void method26806(@OriginalArg(0) Class297 arg0) {
		arg0.method26722(this.anInt3957 * -624984963, this.anInt3958 * 1539980807, -131177103);
		arg0.method26715(this.anInt3957 * -624984963, -1881666327).method26849(-1942433304);
	}
}
