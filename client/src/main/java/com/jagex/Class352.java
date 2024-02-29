package com.jagex;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ix")
public class Class352 {

	@OriginalMember(owner = "client!ix", name = "e", descriptor = "Lclient!aan;")
	Class16 aClass16_32;

	@OriginalMember(owner = "client!ix", name = "n", descriptor = "[Lclient!akw;")
	Class93_Sub33[] aClass93_Sub33Array1;

	@OriginalMember(owner = "client!ix", name = "m", descriptor = "Lclient!it;")
	final Interface28 anInterface28_4;

	@OriginalMember(owner = "client!ix", name = "<init>", descriptor = "(ILclient!it;)V", line = 11)
	public Class352(@OriginalArg(0) int arg0, @OriginalArg(1) Interface28 arg1) {
		@Pc(3) int local3;
		for (local3 = 1; local3 < arg0; local3 += local3) {
		}
		this.aClass16_32 = new Class16(local3);
		this.aClass93_Sub33Array1 = new Class93_Sub33[local3];
		this.anInterface28_4 = arg1;
	}

	@OriginalMember(owner = "client!ix", name = "e", descriptor = "(I)[Lclient!aaj;", line = 11)
	static Class12[] method27651(@OriginalArg(0) int arg0) {
		return new Class12[] { Class12.aClass12_3, Class12.aClass12_1, Class12.aClass12_2 };
	}

	@OriginalMember(owner = "client!ix", name = "n", descriptor = "(Lclient!yf;B)V", line = 17)
	static void method27652(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = ((Class347) Class288.aClass55_Sub2_1.method18261(arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091], -507738355)).aString182;
	}

	@OriginalMember(owner = "client!ix", name = "e", descriptor = "(I)[Lclient!kt;", line = 19)
	public static Class388[] method27653(@OriginalArg(0) int arg0) {
		return new Class388[] { Class388.aClass388_4, Class388.aClass388_2, Class388.aClass388_3, Class388.aClass388_7, Class388.aClass388_5, Class388.aClass388_8, Class388.aClass388_6, Class388.aClass388_1, Class388.aClass388_9, Class388.aClass388_10, Class388.aClass388_11 };
	}

	@OriginalMember(owner = "client!ix", name = "f", descriptor = "(I)Lclient!akw;", line = 20)
	public Class93_Sub33 method27654(@OriginalArg(0) int arg0) {
		return arg0 >= this.aClass93_Sub33Array1.length ? null : this.aClass93_Sub33Array1[arg0];
	}

	@OriginalMember(owner = "client!ix", name = "w", descriptor = "(I)Lclient!akw;", line = 20)
	public Class93_Sub33 method27655(@OriginalArg(0) int arg0) {
		return arg0 >= this.aClass93_Sub33Array1.length ? null : this.aClass93_Sub33Array1[arg0];
	}

	@OriginalMember(owner = "client!ix", name = "e", descriptor = "(II)Lclient!akw;", line = 20)
	public Class93_Sub33 method27656(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 >= this.aClass93_Sub33Array1.length ? null : this.aClass93_Sub33Array1[arg0];
	}

	@OriginalMember(owner = "client!ix", name = "l", descriptor = "(Ljava/lang/String;)Lclient!akw;", line = 25)
	public Class93_Sub33 method27657(@OriginalArg(0) String arg0) {
		@Pc(5) long local5 = this.anInterface28_4.method26840(arg0, -242564869);
		for (@Pc(11) Class93_Sub33 local11 = (Class93_Sub33) this.aClass16_32.method214(local5); local11 != null; local11 = (Class93_Sub33) this.aClass16_32.method216(-1796956099)) {
			if (local11.aString120.equals(arg0)) {
				return local11;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ix", name = "n", descriptor = "(Ljava/lang/String;B)Lclient!akw;", line = 25)
	public Class93_Sub33 method27658(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		@Pc(5) long local5 = this.anInterface28_4.method26840(arg0, -420642437);
		for (@Pc(11) Class93_Sub33 local11 = (Class93_Sub33) this.aClass16_32.method214(local5); local11 != null; local11 = (Class93_Sub33) this.aClass16_32.method216(-1796956099)) {
			if (local11.aString120.equals(arg0)) {
				return local11;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ix", name = "u", descriptor = "(Ljava/lang/String;)Lclient!akw;", line = 25)
	public Class93_Sub33 method27659(@OriginalArg(0) String arg0) {
		@Pc(5) long local5 = this.anInterface28_4.method26840(arg0, -1269142059);
		for (@Pc(11) Class93_Sub33 local11 = (Class93_Sub33) this.aClass16_32.method214(local5); local11 != null; local11 = (Class93_Sub33) this.aClass16_32.method216(-1796956099)) {
			if (local11.aString120.equals(arg0)) {
				return local11;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ix", name = "n", descriptor = "(Ljava/io/InputStream;II)[B", line = 26)
	static byte[] method27660(@OriginalArg(0) InputStream arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		@Pc(2) byte[] local2 = new byte[5];
		if (arg0.read(local2, 0, 5) != 5) {
			throw new IOException("2");
		}
		@Pc(19) ByteArrayOutputStream local19 = new ByteArrayOutputStream(arg1);
		@Pc(22) Class565 local22 = Class549.aClass565_1;
		synchronized (Class549.aClass565_1) {
			if (!Class549.aClass565_1.method31249(local2, -1201282622)) {
				throw new IOException("3");
			}
			Class549.aClass565_1.method31246(arg0, local19, (long) arg1);
		}
		local19.flush();
		return local19.toByteArray();
	}

	@OriginalMember(owner = "client!ix", name = "p", descriptor = "(I)V", line = 35)
	void method27661(@OriginalArg(0) int arg0) {
		@Pc(4) Class93_Sub33 local4 = this.method27656(arg0, -1511884902);
		if (local4 != null) {
			local4.method23969(1735770450);
			this.aClass93_Sub33Array1[local4.anInt3226 * -612431395] = null;
		}
	}

	@OriginalMember(owner = "client!ix", name = "z", descriptor = "(I)V", line = 35)
	void method27662(@OriginalArg(0) int arg0) {
		@Pc(4) Class93_Sub33 local4 = this.method27656(arg0, 1356607212);
		if (local4 != null) {
			local4.method23969(1848139809);
			this.aClass93_Sub33Array1[local4.anInt3226 * -612431395] = null;
		}
	}

	@OriginalMember(owner = "client!ix", name = "m", descriptor = "(II)V", line = 35)
	void method27663(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class93_Sub33 local4 = this.method27656(arg0, -546215270);
		if (local4 != null) {
			local4.method23969(-133756483);
			this.aClass93_Sub33Array1[local4.anInt3226 * -612431395] = null;
		}
	}

	@OriginalMember(owner = "client!ix", name = "d", descriptor = "(I)V", line = 35)
	void method27664(@OriginalArg(0) int arg0) {
		@Pc(4) Class93_Sub33 local4 = this.method27656(arg0, -1993491878);
		if (local4 != null) {
			local4.method23969(1796870356);
			this.aClass93_Sub33Array1[local4.anInt3226 * -612431395] = null;
		}
	}

	@OriginalMember(owner = "client!ix", name = "c", descriptor = "(ILjava/lang/String;Lclient!akw;)V", line = 43)
	public void method27665(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class93_Sub33 arg2) {
		@Pc(4) Class93_Sub33 local4 = this.method27658(arg1, (byte) 57);
		if (local4 != null && local4.anInt3226 * -612431395 != arg0) {
			throw new IllegalArgumentException(arg1);
		}
		this.method27663(arg0, -178771717);
		if (arg0 >= this.aClass93_Sub33Array1.length) {
			@Pc(30) int local30;
			for (local30 = this.aClass93_Sub33Array1.length; local30 <= arg0; local30 += local30) {
			}
			this.aClass16_32 = new Class16(local30);
			for (@Pc(46) int local46 = 0; local46 < this.aClass93_Sub33Array1.length; local46++) {
				@Pc(56) Class93_Sub33 local56 = this.aClass93_Sub33Array1[local46];
				if (local56 != null) {
					this.aClass16_32.method220(local56, local56.aLong232 * -3750704643647536275L);
				}
			}
			@Pc(71) Class93_Sub33[] local71 = new Class93_Sub33[local30];
			for (@Pc(73) int local73 = 0; local73 < this.aClass93_Sub33Array1.length; local73++) {
				local71[local73] = this.aClass93_Sub33Array1[local73];
			}
			this.aClass93_Sub33Array1 = local71;
		}
		arg2.anInt3226 = arg0 * -474114443;
		arg2.aString120 = arg1;
		this.aClass16_32.method220(arg2, this.anInterface28_4.method26840(arg1, 1687016731));
		this.aClass93_Sub33Array1[arg0] = arg2;
	}

	@OriginalMember(owner = "client!ix", name = "v", descriptor = "(ILjava/lang/String;Lclient!akw;)V", line = 43)
	public void method27666(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class93_Sub33 arg2) {
		@Pc(4) Class93_Sub33 local4 = this.method27658(arg1, (byte) 76);
		if (local4 != null && local4.anInt3226 * -612431395 != arg0) {
			throw new IllegalArgumentException(arg1);
		}
		this.method27663(arg0, 1170214005);
		if (arg0 >= this.aClass93_Sub33Array1.length) {
			@Pc(30) int local30;
			for (local30 = this.aClass93_Sub33Array1.length; local30 <= arg0; local30 += local30) {
			}
			this.aClass16_32 = new Class16(local30);
			for (@Pc(46) int local46 = 0; local46 < this.aClass93_Sub33Array1.length; local46++) {
				@Pc(56) Class93_Sub33 local56 = this.aClass93_Sub33Array1[local46];
				if (local56 != null) {
					this.aClass16_32.method220(local56, local56.aLong232 * -3750704643647536275L);
				}
			}
			@Pc(71) Class93_Sub33[] local71 = new Class93_Sub33[local30];
			for (@Pc(73) int local73 = 0; local73 < this.aClass93_Sub33Array1.length; local73++) {
				local71[local73] = this.aClass93_Sub33Array1[local73];
			}
			this.aClass93_Sub33Array1 = local71;
		}
		arg2.anInt3226 = arg0 * -474114443;
		arg2.aString120 = arg1;
		this.aClass16_32.method220(arg2, this.anInterface28_4.method26840(arg1, -1185553730));
		this.aClass93_Sub33Array1[arg0] = arg2;
	}

	@OriginalMember(owner = "client!ix", name = "r", descriptor = "(ILjava/lang/String;Lclient!akw;)V", line = 43)
	public void method27667(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class93_Sub33 arg2) {
		@Pc(4) Class93_Sub33 local4 = this.method27658(arg1, (byte) 122);
		if (local4 != null && local4.anInt3226 * -612431395 != arg0) {
			throw new IllegalArgumentException(arg1);
		}
		this.method27663(arg0, -1840374418);
		if (arg0 >= this.aClass93_Sub33Array1.length) {
			@Pc(30) int local30;
			for (local30 = this.aClass93_Sub33Array1.length; local30 <= arg0; local30 += local30) {
			}
			this.aClass16_32 = new Class16(local30);
			for (@Pc(46) int local46 = 0; local46 < this.aClass93_Sub33Array1.length; local46++) {
				@Pc(56) Class93_Sub33 local56 = this.aClass93_Sub33Array1[local46];
				if (local56 != null) {
					this.aClass16_32.method220(local56, local56.aLong232 * -3750704643647536275L);
				}
			}
			@Pc(71) Class93_Sub33[] local71 = new Class93_Sub33[local30];
			for (@Pc(73) int local73 = 0; local73 < this.aClass93_Sub33Array1.length; local73++) {
				local71[local73] = this.aClass93_Sub33Array1[local73];
			}
			this.aClass93_Sub33Array1 = local71;
		}
		arg2.anInt3226 = arg0 * -474114443;
		arg2.aString120 = arg1;
		this.aClass16_32.method220(arg2, this.anInterface28_4.method26840(arg1, 633658383));
		this.aClass93_Sub33Array1[arg0] = arg2;
	}

	@OriginalMember(owner = "client!ix", name = "k", descriptor = "(ILjava/lang/String;Lclient!akw;B)V", line = 43)
	public void method27668(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class93_Sub33 arg2, @OriginalArg(3) byte arg3) {
		@Pc(4) Class93_Sub33 local4 = this.method27658(arg1, (byte) 37);
		if (local4 != null && local4.anInt3226 * -612431395 != arg0) {
			throw new IllegalArgumentException(arg1);
		}
		this.method27663(arg0, -798924541);
		if (arg0 >= this.aClass93_Sub33Array1.length) {
			@Pc(30) int local30;
			for (local30 = this.aClass93_Sub33Array1.length; local30 <= arg0; local30 += local30) {
			}
			this.aClass16_32 = new Class16(local30);
			for (@Pc(46) int local46 = 0; local46 < this.aClass93_Sub33Array1.length; local46++) {
				@Pc(56) Class93_Sub33 local56 = this.aClass93_Sub33Array1[local46];
				if (local56 != null) {
					this.aClass16_32.method220(local56, local56.aLong232 * -3750704643647536275L);
				}
			}
			@Pc(71) Class93_Sub33[] local71 = new Class93_Sub33[local30];
			for (@Pc(73) int local73 = 0; local73 < this.aClass93_Sub33Array1.length; local73++) {
				local71[local73] = this.aClass93_Sub33Array1[local73];
			}
			this.aClass93_Sub33Array1 = local71;
		}
		arg2.anInt3226 = arg0 * -474114443;
		arg2.aString120 = arg1;
		this.aClass16_32.method220(arg2, this.anInterface28_4.method26840(arg1, -387623651));
		this.aClass93_Sub33Array1[arg0] = arg2;
	}

	@OriginalMember(owner = "client!ix", name = "c", descriptor = "(Lclient!dh;IIIIIIII)V", line = 347)
	static void method27669(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) Class585 local3 = client.aClass532_1.method30481(-2139063039);
		@Pc(11) Interface61 local11 = (Interface61) local3.method31534(arg1, arg2, arg3, -1309876799);
		@Pc(24) Class610 local24;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(50) int local50;
		if (local11 != null) {
			local24 = (Class610) client.aClass532_1.method30496(850690886).method18261(local11.method13423(-1037211373), -444023650);
			local30 = local11.method13404(1783887286) & 0x3;
			local34 = local11.method13420(1287426884);
			if (local24.anInt5601 * -303013723 == -1) {
				local50 = arg6;
				if (local24.anInt5592 * 1067969079 > 0) {
					local50 = arg7;
				}
				if (local34 == Class615.aClass615_13.anInt5628 * 948246811 || local34 == Class615.aClass615_4.anInt5628 * 948246811) {
					if (local30 == 0) {
						arg0.method20476(arg4, arg5, 4, local50, 2130777307);
					} else if (local30 == 1) {
						arg0.method20474(arg4, arg5, 4, local50, (byte) -56);
					} else if (local30 == 2) {
						arg0.method20476(arg4 + 3, arg5, 4, local50, 2097149623);
					} else if (local30 == 3) {
						arg0.method20474(arg4, arg5 + 3, 4, local50, (byte) -100);
					}
				}
				if (Class615.aClass615_5.anInt5628 * 948246811 == local34) {
					if (local30 == 0) {
						arg0.method20469(arg4, arg5, 1, 1, local50, (byte) 124);
					} else if (local30 == 1) {
						arg0.method20469(arg4 + 3, arg5, 1, 1, local50, (byte) 22);
					} else if (local30 == 2) {
						arg0.method20469(arg4 + 3, arg5 + 3, 1, 1, local50, (byte) 73);
					} else if (local30 == 3) {
						arg0.method20469(arg4, arg5 + 3, 1, 1, local50, (byte) 19);
					}
				}
				if (local34 == Class615.aClass615_4.anInt5628 * 948246811) {
					if (local30 == 0) {
						arg0.method20474(arg4, arg5, 4, local50, (byte) 23);
					} else if (local30 == 1) {
						arg0.method20476(arg4 + 3, arg5, 4, local50, 1683525921);
					} else if (local30 == 2) {
						arg0.method20474(arg4, arg5 + 3, 4, local50, (byte) 78);
					} else if (local30 == 3) {
						arg0.method20476(arg4, arg5, 4, local50, 1995268999);
					}
				}
			} else {
				Class107.method18119(arg0, local24, local30, arg4, arg5, 665727664);
			}
		}
		local11 = (Interface61) local3.method31551(arg1, arg2, arg3, client.anInterface62_1, (byte) 3);
		if (local11 != null) {
			local24 = (Class610) client.aClass532_1.method30496(1023330810).method18261(local11.method13423(-1037211373), 580832347);
			local30 = local11.method13404(1627243811) & 0x3;
			local34 = local11.method13420(1681465668);
			if (-303013723 * local24.anInt5601 != -1) {
				Class107.method18119(arg0, local24, local30, arg4, arg5, 676405181);
			} else if (Class615.aClass615_6.anInt5628 * 948246811 == local34) {
				local50 = -1118482;
				if (local24.anInt5592 * 1067969079 > 0) {
					local50 = -1179648;
				}
				if (local30 == 0 || local30 == 2) {
					arg0.method20479(arg4, arg5 + 3, arg4 + 3, arg5, local50, 242132452);
				} else {
					arg0.method20479(arg4, arg5, arg4 + 3, arg5 + 3, local50, -1416038410);
				}
			}
		}
		local11 = (Interface61) local3.method31556(arg1, arg2, arg3, -968156135);
		if (local11 == null) {
			return;
		}
		local24 = (Class610) client.aClass532_1.method30496(1742546820).method18261(local11.method13423(-1037211373), 592037436);
		local30 = local11.method13404(2001249884) & 0x3;
		if (-303013723 * local24.anInt5601 != -1) {
			Class107.method18119(arg0, local24, local30, arg4, arg5, 2144043100);
		}
	}

	@OriginalMember(owner = "client!ix", name = "bbq", descriptor = "(Lclient!yf;I)V", line = 14395)
	static final void method27670(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -1915563430;
	}

	@OriginalMember(owner = "client!ix", name = "bdz", descriptor = "(Lclient!yf;I)V", line = 14784)
	static final void method27671(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = client.aClass270_1.method26275(1824602219);
	}
}
