package com.jagex;

import com.jagex.deob.ObfuscatedName;
import com.jagex.deob.Statics;

@ObfuscatedName("ali")
public class class998 extends class532 {

	@ObfuscatedName("ali.u")
	public final class696 field11510;

	@ObfuscatedName("ali.z")
	public final class710 field11513;

	@ObfuscatedName("ali.p")
	public class1055 field11514;

	@ObfuscatedName("ali.d")
	public class1052 field11537;

	@ObfuscatedName("ali.c")
	public class1052 field11516;

	@ObfuscatedName("ali.r")
	public class1058 field11517;

	@ObfuscatedName("ali.v")
	public class1050 field11519;

	@ObfuscatedName("ali.o")
	public class1025 field11549;

	@ObfuscatedName("ali.s")
	public class1043 field11520;

	@ObfuscatedName("ali.y")
	public class1059 field11521;

	@ObfuscatedName("ali.q")
	public class1057 field11522;

	@ObfuscatedName("ali.x")
	public class1026 field11523;

	@ObfuscatedName("ali.b")
	public class1028 field11564;

	@ObfuscatedName("ali.h")
	public class1054 field11525;

	@ObfuscatedName("ali.a")
	public class1033 field11526;

	@ObfuscatedName("ali.g")
	public class1053 field11546;

	@ObfuscatedName("ali.i")
	public class1022 field11528;

	@ObfuscatedName("ali.j")
	public class1037 field11529;

	@ObfuscatedName("ali.t")
	public class1030 field11530;

	@ObfuscatedName("ali.ae")
	public class1036 field11531;

	@ObfuscatedName("ali.ag")
	public class1031 field11532;

	@ObfuscatedName("ali.ah")
	public class1034 field11533;

	@ObfuscatedName("ali.al")
	public class1034 field11534;

	@ObfuscatedName("ali.ac")
	public class1044 field11539;

	@ObfuscatedName("ali.ai")
	public class1048 field11508;

	@ObfuscatedName("ali.aw")
	public class1029 field11568;

	@ObfuscatedName("ali.as")
	public class1027 field11538;

	@ObfuscatedName("ali.at")
	public class1041 field11524;

	@ObfuscatedName("ali.ad")
	public class1041 field11540;

	@ObfuscatedName("ali.am")
	public class1038 field11541;

	@ObfuscatedName("ali.au")
	public class1040 field11542;

	@ObfuscatedName("ali.ar")
	public class1040 field11543;

	@ObfuscatedName("ali.ap")
	public class1024 field11544;

	@ObfuscatedName("ali.aq")
	public class1047 field11545;

	@ObfuscatedName("ali.ax")
	public class1039 field11527;

	@ObfuscatedName("ali.av")
	public class1035 field11547;

	@ObfuscatedName("ali.ao")
	public class1046 field11548;

	@ObfuscatedName("ali.aj")
	public class1045 field11555;

	@ObfuscatedName("ali.ay")
	public class1056 field11550;

	@ObfuscatedName("ali.ab")
	public class1042 field11518;

	@ObfuscatedName("ali.az")
	public class1051 field11552;

	@ObfuscatedName("ali.aa")
	public class1032 field11553;

	@ObfuscatedName("ali.af")
	public class1023 field11551;

	@ObfuscatedName("ali.ak")
	public class1049 field11554;

	@ObfuscatedName("ali.an")
	public class1068 field11556;

	@ObfuscatedName("ali.bf")
	public class1062 field11515;

	@ObfuscatedName("ali.bl")
	public class1063 field11560;

	@ObfuscatedName("ali.bk")
	public class1061 field11559;

	@ObfuscatedName("ali.bh")
	public class1064 field11536;

	@ObfuscatedName("ali.bx")
	public class1065 field11561;

	@ObfuscatedName("ali.bd")
	public class1060 field11562;

	@ObfuscatedName("ali.bc")
	public class1067 field11563;

	@ObfuscatedName("ali.bi")
	public class1067 field11511;

	@ObfuscatedName("ali.bn")
	public class1067 field11565;

	@ObfuscatedName("ali.bt")
	public class1067 field11566;

	@ObfuscatedName("ali.bq")
	public class1067 field11567;

	@ObfuscatedName("ali.bm")
	public class1066 field11557;

	public class998(class696 arg0, int arg1) {
		this.field11510 = arg0;
		this.field11513 = new class710(class507.field6616, class507.field6623, Statics.field2153.toLowerCase().indexOf("arm") != -1, Statics.field2601.startsWith("win"), false);
		this.field11540 = new class1041(arg1, this);
		this.method18154(true, true);
	}

	public class998(class997 arg0, class696 arg1, int arg2) {
		this.field11510 = arg1;
		this.field11513 = new class710(class507.field6616, class507.field6623, Statics.field2153.indexOf("arm") != -1, Statics.field2601.startsWith("win"), false);
		this.field11540 = new class1041(arg2, this);
		this.method18163(arg0);
	}

	@ObfuscatedName("ali.e(Lalw;B)V")
	public void method18163(class997 arg0) {
		if (arg0 == null || arg0.field11502 == null) {
			this.method18154(true, true);
		} else {
			int var2 = arg0.method17904();
			if (var2 < 23) {
				try {
					this.method18155(arg0, var2);
				} catch (Exception var4) {
					this.method18154(true, true);
				}
				this.method18154(false, true);
			} else if (var2 > 38) {
				this.method18154(true, true);
			} else {
				if (var2 >= 29) {
					this.field11514 = new class1055(arg0.method17904(), this);
				}
				this.field11537 = new class1052(arg0.method17904(), this);
				if (var2 >= 31) {
					this.field11517 = new class1058(arg0.method17904(), this);
				}
				this.field11516 = new class1052(this.field11537.method18639(), this);
				this.field11519 = new class1050(arg0.method17904(), this);
				this.field11549 = new class1025(arg0.method17904(), this);
				this.field11520 = new class1043(arg0.method17904(), this);
				if (var2 >= 27) {
					this.field11522 = new class1057(arg0.method17904(), this);
				}
				this.field11523 = new class1026(arg0.method17904(), this);
				this.field11564 = new class1028(arg0.method17904(), this);
				this.field11525 = new class1054(arg0.method17904(), this);
				this.field11526 = new class1033(arg0.method17904(), this);
				this.field11546 = new class1053(arg0.method17904(), this);
				this.field11528 = new class1022(arg0.method17904(), this);
				this.field11529 = new class1037(arg0.method17904(), this);
				if (var2 >= 33) {
					this.field11530 = new class1030(arg0.method17904(), this);
				}
				if (var2 >= 34) {
					arg0.method17904();
				}
				if (var2 >= 24) {
					this.field11531 = new class1036(arg0.method17904(), this);
				}
				this.field11532 = new class1031(arg0.method17904(), this);
				this.field11533 = new class1034(arg0.method17904(), this);
				this.field11534 = new class1034(this.field11533.method18496(), this);
				this.field11539 = new class1044(arg0.method17904(), this);
				if (var2 >= 25) {
					this.field11508 = new class1048(arg0.method17904(), this);
				}
				this.field11568 = new class1029(arg0.method17904(), this);
				if (var2 <= 25) {
					arg0.field11503 += -1445626955;
				}
				this.field11538 = new class1027(arg0.method17904(), this);
				this.field11524 = new class1041(arg0.method17904(), this);
				this.field11540 = new class1041(this.field11524.method18545(), this);
				arg0.method17904();
				this.field11541 = new class1038(arg0.method17904(), this);
				this.field11542 = new class1040(arg0.method17904(), this);
				if (var2 >= 35) {
					this.field11545 = new class1047(arg0.method17904(), this);
					this.field11527 = new class1039(arg0.method17904(), this);
					this.field11547 = new class1035(arg0.method17904(), this);
					this.field11544 = new class1024(arg0.method17904(), this);
					this.field11548 = new class1046(arg0.method17904(), this);
					this.field11555 = new class1045(arg0.method17905(), this);
				}
				if (var2 >= 36) {
					this.field11550 = new class1056(arg0.method17904(), this);
					this.field11518 = new class1042(arg0.method17904(), this);
				}
				if (var2 >= 37) {
					this.field11552 = new class1051(arg0.method17906(), this);
					this.field11553 = new class1032(arg0.method17906(), this);
				}
				if (var2 >= 38) {
					this.field11551 = new class1023(arg0.method17906(), this);
					this.field11554 = new class1049(arg0.method17906(), this);
				}
				this.field11543 = new class1040(this.field11542.method18539(), this);
				this.field11556 = new class1068(arg0.method17904(), this);
				this.field11515 = new class1062(arg0.method17904(), this);
				this.field11560 = new class1063(arg0.method17904(), this);
				this.field11559 = new class1061(arg0.method17904(), this);
				this.field11536 = new class1064(arg0.method17904(), this);
				if (var2 >= 26) {
					this.field11561 = new class1065(arg0.method17904(), this);
				}
				if (var2 >= 28) {
					this.field11562 = new class1060(arg0.method17904(), this);
				}
				if (var2 >= 30) {
					this.field11521 = new class1059(arg0.method17904(), this);
				}
				this.field11563 = new class1067(arg0.method17904(), this);
				this.field11511 = new class1067(arg0.method17904(), this);
				this.field11565 = new class1067(arg0.method17904(), this);
				this.field11566 = new class1067(arg0.method17904(), this);
				this.field11567 = new class1067(arg0.method17904(), this);
				this.field11557 = new class1066(arg0.method17904(), this);
				this.method18154(false, var2 < 32);
			}
		}
		this.method18179();
	}

	@ObfuscatedName("ali.n(ZZB)V")
	public void method18154(boolean arg0, boolean arg1) {
		if (arg0 || this.field11514 == null) {
			this.field11514 = new class1055(this);
		}
		if (arg0 || this.field11537 == null) {
			this.field11537 = new class1052(this);
		}
		if (arg0 || this.field11517 == null) {
			this.field11517 = new class1058(this);
		}
		if (arg0 || this.field11516 == null) {
			this.field11516 = new class1052(this.field11537.method18639(), this);
		}
		if (arg0 || this.field11519 == null) {
			this.field11519 = new class1050(this);
		}
		if (arg0 || this.field11549 == null) {
			this.field11549 = new class1025(this);
		}
		if (arg0 || this.field11520 == null) {
			this.field11520 = new class1043(this);
		}
		if (arg0 || this.field11522 == null) {
			this.field11522 = new class1057(this);
		}
		if (arg0 || this.field11523 == null) {
			this.field11523 = new class1026(this);
		}
		if (arg0 || this.field11564 == null) {
			this.field11564 = new class1028(this);
		}
		if (arg0 || this.field11525 == null) {
			this.field11525 = new class1054(this);
		}
		if (arg0 || this.field11526 == null) {
			this.field11526 = new class1033(this);
		}
		if (arg0 || this.field11546 == null) {
			this.field11546 = new class1053(this);
		}
		if (arg0 || this.field11528 == null) {
			this.field11528 = new class1022(this);
		}
		if (arg0 || this.field11529 == null) {
			this.field11529 = new class1037(this);
		}
		if (arg0 || this.field11530 == null) {
			this.field11530 = new class1030(this);
		}
		if (arg0 || this.field11531 == null) {
			this.field11531 = new class1036(this);
		}
		if (arg0 || this.field11532 == null) {
			this.field11532 = new class1031(this);
		}
		if (arg0 || this.field11533 == null) {
			this.field11533 = new class1034(this);
		}
		if (arg0 || this.field11534 == null) {
			this.field11534 = new class1034(this.field11533.method18496(), this);
		}
		if (arg0 || this.field11539 == null) {
			this.field11539 = new class1044(this);
		}
		if (arg0 || this.field11508 == null) {
			this.field11508 = new class1048(this);
		}
		if (arg0 || this.field11568 == null) {
			this.field11568 = new class1029(this);
		}
		if (arg0 || this.field11538 == null) {
			this.field11538 = new class1027(this);
		}
		if (arg0 || this.field11524 == null) {
			this.field11524 = new class1041(this);
		}
		if (arg0 || this.field11540 == null) {
			this.field11540 = new class1041(this.field11524.method18545(), this);
		}
		if (arg0 || this.field11541 == null) {
			this.field11541 = new class1038(this);
		}
		if (arg0 || this.field11542 == null) {
			this.field11542 = new class1040(this);
		}
		if (arg0 || this.field11543 == null) {
			this.field11543 = new class1040(this.field11542.method18539(), this);
		}
		if (arg0 || this.field11544 == null) {
			this.field11544 = new class1024(this);
		}
		if (arg0 || this.field11545 == null) {
			this.field11545 = new class1047(this);
		}
		if (arg0 || this.field11527 == null) {
			this.field11527 = new class1039(this);
		}
		if (arg0 || this.field11547 == null) {
			this.field11547 = new class1035(this);
		}
		if (arg0 || this.field11548 == null) {
			this.field11548 = new class1046(this);
		}
		if (arg0 || this.field11555 == null) {
			this.field11555 = new class1045(this);
		}
		if (arg0 || this.field11550 == null) {
			this.field11550 = new class1056(this);
		}
		if (arg0 || this.field11518 == null) {
			this.field11518 = new class1042(this);
		}
		if (arg0 || this.field11552 == null) {
			this.field11552 = new class1051(this);
		}
		if (arg0 || this.field11553 == null) {
			this.field11553 = new class1032(this);
		}
		if (arg0 || this.field11551 == null) {
			this.field11551 = new class1023(this);
		}
		if (arg0 || this.field11554 == null) {
			this.field11554 = new class1049(this);
		}
		if (arg0 || this.field11556 == null) {
			this.field11556 = new class1068(this);
		}
		if (arg0 || this.field11515 == null) {
			this.field11515 = new class1062(this);
		}
		if (arg0 || this.field11560 == null) {
			this.field11560 = new class1063(this);
		}
		if (arg0 || this.field11559 == null) {
			this.field11559 = new class1061(this);
		}
		if (arg0 || this.field11536 == null) {
			this.field11536 = new class1064(this);
		}
		if (arg0 || this.field11561 == null) {
			this.field11561 = new class1065(this);
		}
		if (arg0 || this.field11562 == null) {
			this.field11562 = new class1060(this);
		}
		if (arg0 || this.field11521 == null) {
			this.field11521 = new class1059(this);
		}
		if (arg0 || arg1 || this.field11563 == null) {
			this.field11563 = new class1067(this);
		}
		if (arg0 || arg1 || this.field11511 == null) {
			this.field11511 = new class1067(this);
		}
		if (arg0 || arg1 || this.field11565 == null) {
			this.field11565 = new class1067(this);
		}
		if (arg0 || arg1 || this.field11566 == null) {
			this.field11566 = new class1067(this);
		}
		if (arg0 || arg1 || this.field11567 == null) {
			this.field11567 = new class1067(this);
		}
		if (arg0 || arg1 || this.field11557 == null) {
			this.field11557 = new class1066(this);
		}
	}

	@ObfuscatedName("ali.m(Lalw;IB)V")
	public void method18155(class997 arg0, int arg1) {
		this.field11549 = new class1025(arg0.method17904(), this);
		arg0.field11503 += -1445626955;
		this.field11533 = new class1034(arg0.method17904() + 1, this);
		this.field11526 = new class1033(arg0.method17904(), this);
		arg0.field11503 += -1445626955;
		this.field11546 = new class1053(arg0.method17904(), this);
		this.field11523 = new class1026(arg0.method17904(), this);
		arg0.method17904();
		this.field11568 = new class1029(arg0.method17904(), this);
		int var3 = arg0.method17904();
		int var4 = 0;
		if (arg1 >= 17) {
			var4 = arg0.method17904();
		}
		this.field11529 = new class1037(var3 > var4 ? var3 : var4, this);
		boolean var5 = true;
		boolean var6 = true;
		boolean var7;
		if (arg1 >= 2) {
			var7 = arg0.method17904() == 1;
			if (arg1 >= 17) {
				var6 = arg0.method17904() == 1;
			}
		} else {
			var7 = arg0.method17904() == 1;
			arg0.method17904();
		}
		this.field11528 = new class1022(var7 | var6 ? 1 : 0, this);
		this.field11541 = new class1038(arg0.method17904(), this);
		this.field11564 = new class1028(arg0.method17904(), this);
		this.field11537 = new class1052(arg0.method17904(), this);
		this.field11557 = new class1066(arg0.method17904(), this);
		this.field11563 = new class1067(arg0.method17904(), this);
		if (arg1 >= 20) {
			this.field11565 = new class1067(arg0.method17904(), this);
		} else {
			this.field11565 = new class1067(this.field11563.method18763(), this);
		}
		this.field11566 = new class1067(arg0.method17904(), this);
		this.field11511 = new class1067(arg0.method17904(), this);
		if (arg1 >= 21) {
			this.field11567 = new class1067(arg0.method17904(), this);
		} else {
			this.field11567 = new class1067(this.field11566.method18763(), this);
		}
		if (arg1 >= 1) {
			arg0.method17906();
			arg0.method17906();
		}
		if (arg1 >= 3 && arg1 < 6) {
			arg0.method17904();
		}
		if (arg1 >= 4) {
			this.field11532 = new class1031(arg0.method17904(), this);
		}
		arg0.method17910();
		if (arg1 >= 6) {
			this.field11542 = new class1040(arg0.method17904(), this);
		}
		if (arg1 >= 7) {
			this.field11536 = new class1064(arg0.method17904(), this);
		}
		if (arg1 >= 8) {
			arg0.method17904();
		}
		if (arg1 >= 9) {
			this.field11520 = new class1043(arg0.method17904(), this);
		}
		if (arg1 >= 10) {
			this.field11519 = new class1050(arg0.method17904(), this);
		}
		if (arg1 >= 11) {
			this.field11556 = new class1068(arg0.method17904(), this);
		}
		if (arg1 >= 12) {
			this.field11546 = new class1053(arg0.method17904(), this);
		}
		if (arg1 >= 13) {
			this.field11525 = new class1054(arg0.method17904(), this);
		}
		if (arg1 >= 14) {
			this.field11524 = new class1041(arg0.method17904(), this);
		}
		if (arg1 >= 15) {
			this.field11560 = new class1063(arg0.method17904(), this);
		}
		if (arg1 >= 16) {
			this.field11538 = new class1027(arg0.method17904(), this);
		}
		if (arg1 >= 18) {
			this.field11515 = new class1062(arg0.method17904(), this);
		}
		if (arg1 >= 19) {
			this.field11539 = new class1044(arg0.method17904(), this);
		}
		if (arg1 >= 22) {
			this.field11559 = new class1061(arg0.method17904(), this);
		}
	}

	@ObfuscatedName("ali.k(I)Lalw;")
	public class997 method18156() {
		class997 var1 = new class997(59);
		var1.method18001(38);
		var1.method18001(this.field11514.method18665());
		var1.method18001(this.field11537.method18639());
		var1.method18001(this.field11517.method18695());
		var1.method18001(this.field11519.method18625());
		var1.method18001(this.field11549.method18408());
		var1.method18001(this.field11520.method18570());
		var1.method18001(this.field11522.method18688());
		var1.method18001(this.field11523.method18419());
		var1.method18001(this.field11564.method18434());
		var1.method18001(this.field11525.method18651());
		var1.method18001(this.field11526.method18489());
		var1.method18001(this.field11546.method18645());
		var1.method18001(this.field11528.method18389());
		var1.method18001(this.field11529.method18515());
		var1.method18001(this.field11530.method18458());
		var1.method18001(0);
		var1.method18001(this.field11531.method18504());
		var1.method18001(this.field11532.method18468());
		var1.method18001(this.field11533.method18496());
		var1.method18001(this.field11539.method18581());
		var1.method18001(this.field11508.method18607());
		var1.method18001(this.field11568.method18453());
		var1.method18001(this.field11538.method18426());
		var1.method18001(this.field11524.method18545());
		var1.method18001(0);
		var1.method18001(this.field11541.method18522());
		var1.method18001(this.field11542.method18539());
		var1.method18001(this.field11545.method18601());
		var1.method18001(this.field11527.method18533());
		var1.method18001(this.field11547.method18498());
		var1.method18001(this.field11544.method18400());
		var1.method18001(this.field11548.method18594());
		var1.method18001(this.field11555.method18588());
		var1.method18001(this.field11550.method18676());
		var1.method18001(this.field11518.method18559());
		var1.method17945(this.field11552.method18633());
		var1.method17945(this.field11553.method18482());
		var1.method17945(this.field11551.method18391());
		var1.method17945(this.field11554.method18621());
		var1.method18001(this.field11556.method18771());
		var1.method18001(this.field11515.method18721());
		var1.method18001(this.field11560.method18735());
		var1.method18001(this.field11559.method18714());
		var1.method18001(this.field11536.method18740());
		var1.method18001(this.field11561.method18750());
		var1.method18001(this.field11562.method18707());
		var1.method18001(this.field11521.method18701());
		var1.method18001(this.field11563.method18763());
		var1.method18001(this.field11511.method18763());
		var1.method18001(this.field11565.method18763());
		var1.method18001(this.field11566.method18763());
		var1.method18001(this.field11567.method18763());
		var1.method18001(this.field11557.method18758());
		return var1;
	}

	@ObfuscatedName("ali.f(Lzf;IB)V")
	public void method18157(class709 arg0, int arg1) {
		arg0.method14071(arg1);
		this.method18179();
	}

	@ObfuscatedName("ali.w(Lamd;ZI)V")
	public void method18177(class1041 arg0, boolean arg1) {
		arg0.method18544(arg1);
		this.method18179();
	}

	@ObfuscatedName("ali.l(I)V")
	public void method18179() {
		this.field11514.method18663();
		this.field11537.method18637();
		this.field11517.method18694();
		this.field11516.method18637();
		this.field11519.method18626();
		this.field11549.method18416();
		this.field11520.method18568();
		this.field11522.method18687();
		this.field11523.method18418();
		this.field11564.method18430();
		this.field11525.method18653();
		this.field11526.method18490();
		this.field11546.method18643();
		this.field11528.method18390();
		this.field11529.method18513();
		this.field11530.method18455();
		this.field11531.method18510();
		this.field11532.method18465();
		this.field11533.method18495();
		this.field11534.method18495();
		this.field11539.method18579();
		this.field11508.method18608();
		this.field11568.method18446();
		this.field11538.method18423();
		this.field11524.method18549();
		this.field11540.method18549();
		this.field11541.method18523();
		this.field11542.method18536();
		this.field11543.method18536();
		this.field11544.method18401();
		this.field11545.method18600();
		this.field11527.method18532();
		this.field11547.method18497();
		this.field11548.method18595();
		this.field11555.method18592();
		this.field11550.method18675();
		this.field11518.method18558();
		this.field11552.method18631();
		this.field11553.method18480();
		this.field11551.method18393();
		this.field11554.method18622();
		this.field11556.method18770();
		this.field11515.method18720();
		this.field11560.method18729();
		this.field11559.method18713();
		this.field11536.method18739();
		this.field11561.method18749();
		this.field11562.method18706();
		this.field11521.method18700();
		this.field11563.method18762();
		this.field11511.method18762();
		this.field11565.method18762();
		this.field11566.method18762();
		this.field11567.method18762();
		this.field11557.method18757();
	}

	@ObfuscatedName("ali.u(B)Lzd;")
	public class696 method18159() {
		return this.field11510;
	}

	@ObfuscatedName("ali.z(I)Laag;")
	public class710 method18165() {
		return this.field11513;
	}
}
