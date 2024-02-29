package jagex3;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sg")
public final class Class549 {

	@OriginalMember(owner = "client!sg", name = "e", descriptor = "I")
	static final int anInt5452 = 5;

	@OriginalMember(owner = "client!sg", name = "pb", descriptor = "I")
	public static int anInt5453;

	@OriginalMember(owner = "client!sg", name = "n", descriptor = "Lclient!sz;")
	static Class565 aClass565_2;

	static {
		new Class545();
		aClass565_2 = new Class565();
	}

	@OriginalMember(owner = "client!sg", name = "m", descriptor = "(Lclient!alw;I)[B")
	public static byte[] method31198(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) throws IOException {
		@Pc(5) ByteArrayInputStream local5 = new ByteArrayInputStream(arg0.aByteArray58);
		local5.skip((long) (arg0.anInt3070 * 212851357));
		return Class352.method27759(local5, arg1, 65280);
	}

	@OriginalMember(owner = "client!sg", name = "k", descriptor = "(Lclient!alw;I)[B")
	public static byte[] method31199(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) throws IOException {
		@Pc(5) ByteArrayInputStream local5 = new ByteArrayInputStream(arg0.aByteArray58);
		local5.skip((long) (arg0.anInt3070 * 212851357));
		return Class352.method27759(local5, arg1, 65280);
	}

	@OriginalMember(owner = "client!sg", name = "l", descriptor = "(Lclient!alw;I)[B")
	public static byte[] method31200(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) throws IOException {
		@Pc(5) ByteArrayInputStream local5 = new ByteArrayInputStream(arg0.aByteArray58);
		local5.skip((long) (arg0.anInt3070 * 212851357));
		return Class352.method27759(local5, arg1, 65280);
	}

	@OriginalMember(owner = "client!sg", name = "f", descriptor = "(Lclient!alw;I)[B")
	public static byte[] method31201(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) throws IOException {
		@Pc(5) ByteArrayInputStream local5 = new ByteArrayInputStream(arg0.aByteArray58);
		local5.skip((long) (arg0.anInt3070 * 212851357));
		return Class352.method27759(local5, arg1, 65280);
	}

	@OriginalMember(owner = "client!sg", name = "w", descriptor = "(Lclient!alw;I)[B")
	public static byte[] method31202(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) throws IOException {
		@Pc(5) ByteArrayInputStream local5 = new ByteArrayInputStream(arg0.aByteArray58);
		local5.skip((long) (arg0.anInt3070 * 212851357));
		return Class352.method27759(local5, arg1, 65280);
	}

	@OriginalMember(owner = "client!sg", name = "u", descriptor = "(Ljava/io/InputStream;I)[B")
	static byte[] method31203(@OriginalArg(0) InputStream arg0, @OriginalArg(1) int arg1) throws IOException {
		@Pc(2) byte[] local2 = new byte[5];
		if (arg0.read(local2, 0, 5) != 5) {
			throw new IOException("2");
		}
		@Pc(19) ByteArrayOutputStream local19 = new ByteArrayOutputStream(arg1);
		@Pc(22) Class565 local22 = aClass565_2;
		synchronized (aClass565_2) {
			if (!aClass565_2.method31419(local2, 806397475)) {
				throw new IOException("3");
			}
			aClass565_2.method31416(arg0, local19, (long) arg1);
		}
		local19.flush();
		return local19.toByteArray();
	}

	@OriginalMember(owner = "client!sg", name = "aam", descriptor = "(Lclient!yf;I)V")
	static void method31204(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt6049 -= 957530791) * 587908375];
		if (local13.startsWith(Class346.method27663(0, -1614681388)) || local13.startsWith(Class346.method27663(1, -1614681388))) {
			local13 = local13.substring(7);
		}
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class500.method30347(local13, -598449122);
	}

	@OriginalMember(owner = "client!sg", name = "ane", descriptor = "(Lclient!yf;I)V")
	static void method31205(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		Class164.method15298(-1882789398);
	}

	@OriginalMember(owner = "client!sg", name = "m", descriptor = "(II)Z")
	public static boolean method31206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 >= Class615.aClass615_13.anInt5789 * 948246811 && arg0 <= Class615.aClass615_5.anInt5789 * 948246811 || arg0 == Class615.aClass615_6.anInt5789 * 948246811;
	}

	@OriginalMember(owner = "client!sg", name = "bfx", descriptor = "(Lclient!yf;I)V")
	static void method31207(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= 1189701933;
	}

	@OriginalMember(owner = "client!sg", name = "f", descriptor = "(CI)C")
	static char method31208(@OriginalArg(0) char arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "()V")
	Class549() throws Throwable {
		throw new Error();
	}
}
