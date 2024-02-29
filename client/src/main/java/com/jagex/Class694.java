package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!yv")
public class Class694 {

	@OriginalMember(owner = "client!yv", name = "cd", descriptor = "Lclient!dh;")
	public static Class104 aClass104_14;

	@OriginalMember(owner = "client!yv", name = "e", descriptor = "Lclient!ve;")
	final Class611 aClass611_4;

	@OriginalMember(owner = "client!yv", name = "n", descriptor = "I")
	final int anInt5938;

	@OriginalMember(owner = "client!yv", name = "m", descriptor = "I")
	final int anInt5939;

	@OriginalMember(owner = "client!yv", name = "<init>", descriptor = "(Lclient!ve;III)V", line = 12)
	public Class694(@OriginalArg(0) Class611 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass611_4 = arg0;
		this.anInt5938 = arg1 * -1722054243;
		this.anInt5939 = arg3 * -424058111;
	}

	@OriginalMember(owner = "client!yv", name = "e", descriptor = "(I)I", line = 19)
	int method36619(@OriginalArg(0) int arg0) {
		return client.anIntArray309[this.anInt5938 * -528333643];
	}

	@OriginalMember(owner = "client!yv", name = "k", descriptor = "()I", line = 19)
	int method36620() {
		return client.anIntArray309[this.anInt5938 * -528333643];
	}

	@OriginalMember(owner = "client!yv", name = "n", descriptor = "(I)Lclient!st;", line = 23)
	public Interface61 method36621(@OriginalArg(0) int arg0) {
		@Pc(3) Interface61 local3 = this.method36624(1508625200);
		if (local3 == null) {
			return null;
		} else if (local3.method13423(-1037211373) == this.anInt5939 * 445619457) {
			return local3;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!yv", name = "w", descriptor = "()Lclient!st;", line = 23)
	public Interface61 method36622() {
		@Pc(3) Interface61 local3 = this.method36624(803431860);
		if (local3 == null) {
			return null;
		} else if (local3.method13423(-1037211373) == this.anInt5939 * 445619457) {
			return local3;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!yv", name = "f", descriptor = "()Lclient!st;", line = 23)
	public Interface61 method36623() {
		@Pc(3) Interface61 local3 = this.method36624(1658097950);
		if (local3 == null) {
			return null;
		} else if (local3.method13423(-1037211373) == this.anInt5939 * 445619457) {
			return local3;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!yv", name = "m", descriptor = "(I)Lclient!st;", line = 30)
	Interface61 method36624(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = this.aClass611_4.anInt5625 * -78984409;
		@Pc(9) Class611 local9 = client.aClass532_1.method30455(1988559923);
		@Pc(20) int local20 = this.aClass611_4.anInt5623 * 270611681 - local9.anInt5623 * 270611681;
		@Pc(31) int local31 = this.aClass611_4.anInt5624 * -1994307635 - local9.anInt5624 * -1994307635;
		if (local20 < 0 || local31 < 0 || local20 >= client.aClass532_1.method30459(-578639380) || local31 >= client.aClass532_1.method30466((short) 128) || client.aClass532_1.method30481(-1669107956) == null) {
			return null;
		}
		switch(this.method36619(-1383222052)) {
			case 0:
				return (Interface61) client.aClass532_1.method30481(-1209332388).method31534(local5, local20, local31, -1309876799);
			case 1:
				return (Interface61) client.aClass532_1.method30481(-1949294567).method31544(local5, local20, local31, -2024451543);
			case 2:
				return (Interface61) client.aClass532_1.method30481(-1753294593).method31551(local5, local20, local31, client.anInterface62_1, (byte) 3);
			case 3:
				return (Interface61) client.aClass532_1.method30481(-1631282216).method31556(local5, local20, local31, -968156135);
			default:
				return null;
		}
	}

	@OriginalMember(owner = "client!yv", name = "l", descriptor = "()Lclient!st;", line = 30)
	Interface61 method36625() {
		@Pc(5) int local5 = this.aClass611_4.anInt5625 * -78984409;
		@Pc(9) Class611 local9 = client.aClass532_1.method30455(1729457609);
		@Pc(20) int local20 = this.aClass611_4.anInt5623 * 270611681 - local9.anInt5623 * 270611681;
		@Pc(31) int local31 = this.aClass611_4.anInt5624 * -1994307635 - local9.anInt5624 * -1994307635;
		if (local20 < 0 || local31 < 0 || local20 >= client.aClass532_1.method30459(267975953) || local31 >= client.aClass532_1.method30466((short) 128) || client.aClass532_1.method30481(-1055036015) == null) {
			return null;
		}
		switch(this.method36619(-1696609477)) {
			case 0:
				return (Interface61) client.aClass532_1.method30481(-1188767444).method31534(local5, local20, local31, -1309876799);
			case 1:
				return (Interface61) client.aClass532_1.method30481(-1909616057).method31544(local5, local20, local31, -2114854632);
			case 2:
				return (Interface61) client.aClass532_1.method30481(-1509042913).method31551(local5, local20, local31, client.anInterface62_1, (byte) 3);
			case 3:
				return (Interface61) client.aClass532_1.method30481(-1854612136).method31556(local5, local20, local31, -968156135);
			default:
				return null;
		}
	}

	@OriginalMember(owner = "client!yv", name = "u", descriptor = "()Lclient!st;", line = 30)
	Interface61 method36626() {
		@Pc(5) int local5 = this.aClass611_4.anInt5625 * -78984409;
		@Pc(9) Class611 local9 = client.aClass532_1.method30455(1850210501);
		@Pc(20) int local20 = this.aClass611_4.anInt5623 * 270611681 - local9.anInt5623 * 270611681;
		@Pc(31) int local31 = this.aClass611_4.anInt5624 * -1994307635 - local9.anInt5624 * -1994307635;
		if (local20 < 0 || local31 < 0 || local20 >= client.aClass532_1.method30459(-281198630) || local31 >= client.aClass532_1.method30466((short) 128) || client.aClass532_1.method30481(-926340580) == null) {
			return null;
		}
		switch(this.method36619(1636886417)) {
			case 0:
				return (Interface61) client.aClass532_1.method30481(-1851804638).method31534(local5, local20, local31, -1309876799);
			case 1:
				return (Interface61) client.aClass532_1.method30481(-1101792128).method31544(local5, local20, local31, -2050312111);
			case 2:
				return (Interface61) client.aClass532_1.method30481(-2074447200).method31551(local5, local20, local31, client.anInterface62_1, (byte) 3);
			case 3:
				return (Interface61) client.aClass532_1.method30481(-1284553634).method31556(local5, local20, local31, -968156135);
			default:
				return null;
		}
	}

	@OriginalMember(owner = "client!yv", name = "mi", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V", line = 7251)
	static final void method36627(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt5888 -= 957530791) * 587908375];
		if (Class532.method30597(local13, arg2, 1518522314) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray42 = Class499.method30149(local13, arg2, 497393944);
		arg0.aBoolean680 = true;
	}

	@OriginalMember(owner = "client!yv", name = "ajj", descriptor = "(Lclient!yf;I)V", line = 11431)
	static final void method36628(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		throw new RuntimeException("");
	}
}
