package com.jagex;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wt")
public final class Class647 {

	@OriginalMember(owner = "client!wt", name = "bk", descriptor = "Lclient!cm;")
	public static Class99 aClass99_39;

	@OriginalMember(owner = "client!wt", name = "t", descriptor = "I")
	public int anInt5647 = 1384520609;

	@OriginalMember(owner = "client!wt", name = "f", descriptor = "I")
	public int anInt5648 = -1027266189;

	@OriginalMember(owner = "client!wt", name = "m", descriptor = "(I)V")
	static void method33052(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) File local5 = new File(Class588.aString227, "random.dat");
			@Pc(29) int local29;
			if (local5.exists()) {
				Class554.aClass36_4 = new Class36(new Class40(local5, "rw", 25L), 24, 0);
			} else {
				label34: for (@Pc(23) int local23 = 0; local23 < Class112.aStringArray13.length; local23++) {
					for (local29 = 0; local29 < Class501.aStringArray31.length; local29++) {
						@Pc(53) File local53 = new File(Class501.aStringArray31[local29] + Class112.aStringArray13[local23] + File.separatorChar + "random.dat");
						if (local53.exists()) {
							Class554.aClass36_4 = new Class36(new Class40(local53, "rw", 25L), 24, 0);
							break label34;
						}
					}
				}
			}
			if (Class554.aClass36_4 == null) {
				@Pc(81) RandomAccessFile local81 = new RandomAccessFile(local5, "rw");
				local29 = local81.read();
				local81.seek(0L);
				local81.write(local29);
				local81.seek(0L);
				local81.close();
				Class554.aClass36_4 = new Class36(new Class40(local5, "rw", 25L), 24, 0);
			}
		} catch (@Pc(109) IOException local109) {
		}
	}

	@OriginalMember(owner = "client!wt", name = "f", descriptor = "(B)V")
	static void method33053(@OriginalArg(0) byte arg0) {
		Class681.anInt5747 -= 1406238269;
	}

	@OriginalMember(owner = "client!wt", name = "abp", descriptor = "(Lclient!yp;I)V")
	static void method33054(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class134.aClass305_1.method27140(local12, -1948711714).method27057(-1735640362) ? 1 : 0;
	}

	@OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(Lclient!pf;)V")
	public Class647(@OriginalArg(0) Class480 arg0) {
		@Pc(15) byte[] local15 = arg0.method29926(Class639.aClass639_10.anInt5637 * 1101033235, 1472047355);
		this.method33050(new Class80_Sub36(local15), -242725907);
	}

	@OriginalMember(owner = "client!wt", name = "t", descriptor = "(Lclient!ald;I)V")
	void method33050(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.method23362(-1374175117);
			switch(local3) {
				case 0:
					return;
				case 1:
					this.anInt5647 = arg0.method23210((byte) 49) * -1384520609;
					this.anInt5648 = arg0.method23210((byte) 127) * 1027266189;
					break;
				default:
					return;
			}
		}
	}

	@OriginalMember(owner = "client!wt", name = "f", descriptor = "(Lclient!ald;)V")
	void method33051(@OriginalArg(0) Class80_Sub36 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method23362(-1769321172);
			switch(local3) {
				case 0:
					return;
				case 1:
					this.anInt5647 = arg0.method23210((byte) 21) * -1384520609;
					this.anInt5648 = arg0.method23210((byte) 97) * 1027266189;
					break;
				default:
					return;
			}
		}
	}
}
