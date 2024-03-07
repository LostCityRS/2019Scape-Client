package com.jagex;

import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gn")
public class Class294 implements Interface26 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!gn", name = "this$0", descriptor = "Lclient!gx;")
	final Class303 this$0;

	@OriginalMember(owner = "client!gn", name = "e", descriptor = "I")
	final int anInt3916;

	@OriginalMember(owner = "client!gn", name = "n", descriptor = "I")
	final int anInt3917;

	@OriginalMember(owner = "client!gn", name = "e", descriptor = "(Ljava/io/File;B)V", line = 16)
	static void method26596(@OriginalArg(0) File arg0, @OriginalArg(1) byte arg1) {
		Class556.aFile3 = arg0;
		if (!Class556.aFile3.exists()) {
			throw new RuntimeException("");
		}
		Class556.aBoolean804 = true;
	}

	@OriginalMember(owner = "client!gn", name = "w", descriptor = "([SI)V", line = 68)
	public static void method26597(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			arg0[local1] = 1024;
		}
	}

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Lclient!gx;Lclient!alw;)V", line = 189)
	Class294(@OriginalArg(0) Class303 arg0, @OriginalArg(1) Packet arg1) {
		this.this$0 = arg0;
		this.anInt3916 = arg1.g2(-1434290800) * -417669931;
		this.anInt3917 = arg1.g1((short) 16384) * -1576349769;
	}

	@OriginalMember(owner = "client!gn", name = "n", descriptor = "(Lclient!gq;)V", line = 195)
	@Override
	public void method26714(@OriginalArg(0) Class297 arg0) {
		arg0.method26670(this.anInt3916 * -624984963, this.anInt3917 * 1539980807, -19580420);
		arg0.method26646(this.anInt3916 * -624984963, -432972930).method26776(-1942433304);
	}

	@OriginalMember(owner = "client!gn", name = "e", descriptor = "(Lclient!gq;B)V", line = 195)
	@Override
	public void method26715(@OriginalArg(0) Class297 arg0, @OriginalArg(1) byte arg1) {
		arg0.method26670(this.anInt3916 * -624984963, this.anInt3917 * 1539980807, -1490245419);
		arg0.method26646(this.anInt3916 * -624984963, -443942604).method26776(-1942433304);
	}

	@OriginalMember(owner = "client!gn", name = "m", descriptor = "(Lclient!gq;)V", line = 195)
	@Override
	public void method26713(@OriginalArg(0) Class297 arg0) {
		arg0.method26670(this.anInt3916 * -624984963, this.anInt3917 * 1539980807, -131177103);
		arg0.method26646(this.anInt3916 * -624984963, -1881666327).method26776(-1942433304);
	}
}
