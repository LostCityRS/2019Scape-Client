package com.jagex;

import java.io.File;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aou")
public final class Class19_Sub2 extends Class19 {

	@OriginalMember(owner = "client!aou", name = "m", descriptor = "(Ljava/lang/String;I)Ljava/io/File;")
	public static File method17383(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (!Class556.aBoolean813) {
			throw new RuntimeException("");
		}
		@Pc(11) File local11 = (File) Class556.aHashtable9.get(arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(22) File local22 = new File(Class556.aFile3, arg0);
		@Pc(24) RandomAccessFile local24 = null;
		try {
			@Pc(30) File local30 = new File(local22.getParent());
			if (!local30.exists()) {
				throw new RuntimeException("");
			}
			local24 = new RandomAccessFile(local22, "rw");
			@Pc(47) int local47 = local24.read();
			local24.seek(0L);
			local24.write(local47);
			local24.seek(0L);
			local24.close();
			Class556.aHashtable9.put(arg0, local22);
			return local22;
		} catch (@Pc(66) Exception local66) {
			try {
				if (local24 != null) {
					local24.close();
					local24 = null;
				}
			} catch (@Pc(75) Exception local75) {
			}
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!aou", name = "<init>", descriptor = "()V")
	public Class19_Sub2() {
		super(true);
	}

	@OriginalMember(owner = "client!aou", name = "ai", descriptor = "(Lclient!fg;I)V")
	@Override
	void method23635(@OriginalArg(0) Class263 arg0, @OriginalArg(1) int arg1) {
		Class274.aClass258_11.method26157(arg0, arg1, 282095088);
	}

	@OriginalMember(owner = "client!aou", name = "ag", descriptor = "(Lclient!fg;II)V")
	@Override
	void method23625(@OriginalArg(0) Class263 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Class274.aClass258_11.method26157(arg0, arg1, -805941607);
	}
}
