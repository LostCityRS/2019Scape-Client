package com.jagex;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sg")
public class Class549 {

	@OriginalMember(owner = "client!sg", name = "e", descriptor = "I")
	static final int anInt5291 = 5;

	@OriginalMember(owner = "client!sg", name = "pb", descriptor = "I")
	public static int anInt5292;

	@OriginalMember(owner = "client!sg", name = "n", descriptor = "Lclient!sz;")
	static Class565 aClass565_1;

	static {
		new Class545();
		aClass565_1 = new Class565();
	}

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "()V", line = 15)
	Class549() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!sg", name = "m", descriptor = "(Lclient!alw;I)[B", line = 20)
	public static byte[] method31017(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) throws IOException {
		@Pc(5) ByteArrayInputStream local5 = new ByteArrayInputStream(arg0.aByteArray58);
		local5.skip((long) (arg0.anInt3070 * 212851357));
		return Class352.method27660(local5, arg1, 65280);
	}

	@OriginalMember(owner = "client!sg", name = "k", descriptor = "(Lclient!alw;I)[B", line = 20)
	public static byte[] method31018(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) throws IOException {
		@Pc(5) ByteArrayInputStream local5 = new ByteArrayInputStream(arg0.aByteArray58);
		local5.skip((long) (arg0.anInt3070 * 212851357));
		return Class352.method27660(local5, arg1, 65280);
	}

	@OriginalMember(owner = "client!sg", name = "l", descriptor = "(Lclient!alw;I)[B", line = 20)
	public static byte[] method31019(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) throws IOException {
		@Pc(5) ByteArrayInputStream local5 = new ByteArrayInputStream(arg0.aByteArray58);
		local5.skip((long) (arg0.anInt3070 * 212851357));
		return Class352.method27660(local5, arg1, 65280);
	}

	@OriginalMember(owner = "client!sg", name = "f", descriptor = "(Lclient!alw;I)[B", line = 20)
	public static byte[] method31020(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) throws IOException {
		@Pc(5) ByteArrayInputStream local5 = new ByteArrayInputStream(arg0.aByteArray58);
		local5.skip((long) (arg0.anInt3070 * 212851357));
		return Class352.method27660(local5, arg1, 65280);
	}

	@OriginalMember(owner = "client!sg", name = "w", descriptor = "(Lclient!alw;I)[B", line = 20)
	public static byte[] method31021(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) throws IOException {
		@Pc(5) ByteArrayInputStream local5 = new ByteArrayInputStream(arg0.aByteArray58);
		local5.skip((long) (arg0.anInt3070 * 212851357));
		return Class352.method27660(local5, arg1, 65280);
	}

	@OriginalMember(owner = "client!sg", name = "u", descriptor = "(Ljava/io/InputStream;I)[B", line = 26)
	static byte[] method31022(@OriginalArg(0) InputStream arg0, @OriginalArg(1) int arg1) throws IOException {
		@Pc(2) byte[] local2 = new byte[5];
		if (arg0.read(local2, 0, 5) != 5) {
			throw new IOException("2");
		}
		@Pc(19) ByteArrayOutputStream local19 = new ByteArrayOutputStream(arg1);
		@Pc(22) Class565 local22 = aClass565_1;
		synchronized (aClass565_1) {
			if (!aClass565_1.method31249(local2, 806397475)) {
				throw new IOException("3");
			}
			aClass565_1.method31246(arg0, local19, (long) arg1);
		}
		local19.flush();
		return local19.toByteArray();
	}

	@OriginalMember(owner = "client!sg", name = "m", descriptor = "(II)Z", line = 48)
	public static boolean method31023(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 >= Class615.aClass615_13.anInt5628 * 948246811 && arg0 <= Class615.aClass615_5.anInt5628 * 948246811 || arg0 == Class615.aClass615_6.anInt5628 * 948246811;
	}

	@OriginalMember(owner = "client!sg", name = "f", descriptor = "(CI)C", line = 72)
	static char method31024(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
		switch(arg0) {
			case ' ':
			case '-':
			case '_':
			case ' ':
				return '_';
			case '#':
			case '[':
			case ']':
				return arg0;
			case 'À':
			case 'Á':
			case 'Â':
			case 'Ã':
			case 'Ä':
			case 'à':
			case 'á':
			case 'â':
			case 'ã':
			case 'ä':
				return 'a';
			case 'Ç':
			case 'ç':
				return 'c';
			case 'È':
			case 'É':
			case 'Ê':
			case 'Ë':
			case 'è':
			case 'é':
			case 'ê':
			case 'ë':
				return 'e';
			case 'Í':
			case 'Î':
			case 'Ï':
			case 'í':
			case 'î':
			case 'ï':
				return 'i';
			case 'Ñ':
			case 'ñ':
				return 'n';
			case 'Ò':
			case 'Ó':
			case 'Ô':
			case 'Õ':
			case 'Ö':
			case 'ò':
			case 'ó':
			case 'ô':
			case 'õ':
			case 'ö':
				return 'o';
			case 'Ù':
			case 'Ú':
			case 'Û':
			case 'Ü':
			case 'ù':
			case 'ú':
			case 'û':
			case 'ü':
				return 'u';
			case 'ß':
				return 'b';
			case 'ÿ':
			case 'Ÿ':
				return 'y';
			default:
				return Character.toLowerCase(arg0);
		}
	}

	@OriginalMember(owner = "client!sg", name = "aam", descriptor = "(Lclient!yf;I)V", line = 9793)
	static final void method31025(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt5888 -= 957530791) * 587908375];
		if (local13.startsWith(Class346.method27565(0, -1614681388)) || local13.startsWith(Class346.method27565(1, -1614681388))) {
			local13 = local13.substring(7);
		}
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class500.method30167(local13, -598449122);
	}

	@OriginalMember(owner = "client!sg", name = "ane", descriptor = "(Lclient!yf;I)V", line = 12178)
	static final void method31026(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		Class164.method15286(-1882789398);
	}

	@OriginalMember(owner = "client!sg", name = "bfx", descriptor = "(Lclient!yf;I)V", line = 15141)
	static final void method31027(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= 1189701933;
	}
}
