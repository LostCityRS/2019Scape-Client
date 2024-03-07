package com.jagex;

import java.io.EOFException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afu")
public final class Class113_Sub1 extends Class113 {

	@OriginalMember(owner = "client!afu", name = "n", descriptor = "I")
	static final int anInt864 = 1;

	@OriginalMember(owner = "client!afu", name = "jz", descriptor = "I")
	static int zoneUpdateX;

	@OriginalMember(owner = "client!afu", name = "u", descriptor = "[Lclient!on;")
	Class466[] aClass466Array1;

	@OriginalMember(owner = "client!afu", name = "m", descriptor = "Z")
	public boolean aBoolean171 = false;

	@OriginalMember(owner = "client!afu", name = "k", descriptor = "J")
	public long aLong26 = 2265688048181101683L;

	@OriginalMember(owner = "client!afu", name = "f", descriptor = "Z")
	boolean aBoolean172 = false;

	@OriginalMember(owner = "client!afu", name = "l", descriptor = "J")
	long aLong27 = 1570658587136822319L;

	@OriginalMember(owner = "client!afu", name = "z", descriptor = "I")
	int anInt865 = 0;

	@OriginalMember(owner = "client!afu", name = "p", descriptor = "[Lclient!qj;")
	final Class507[] aClass507Array1;

	@OriginalMember(owner = "client!afu", name = "w", descriptor = "Ljava/util/Set;")
	Set aSet1;

	@OriginalMember(owner = "client!afu", name = "<init>", descriptor = "(Lclient!add;)V", line = 28)
	public Class113_Sub1(@OriginalArg(0) Class79_Sub1 arg0) {
		super(arg0);
		this.aClass507Array1 = new Class507[arg0.method18262(1527635403)];
		for (@Pc(25) int local25 = 0; local25 < arg0.method18262(1715330233); local25++) {
			this.aClass507Array1[local25] = ((Class108) arg0.get(local25, -1916410122)).aClass507_3;
		}
		this.aSet1 = new HashSet(arg0.method18262(518377990));
	}

	@OriginalMember(owner = "client!afu", name = "l", descriptor = "(Lclient!ec;I)V", line = 37)
	@Override
	public void method33470(@OriginalArg(0) Class108 arg0, @OriginalArg(1) int arg1) {
		if (Class507.aClass507_4 == this.aClass507Array1[arg0.anInt867 * -1284841473]) {
			this.aBoolean171 = true;
		} else if (Class507.aClass507_6 == this.aClass507Array1[arg0.anInt867 * -1284841473] && this.method33455(arg0, -443781596) != arg1) {
			this.aBoolean172 = true;
			this.aSet1.add(arg0.anInt867 * -1284841473);
		}
		super.method33464(arg0, arg1, 908369267);
	}

	@OriginalMember(owner = "client!afu", name = "e", descriptor = "(Lclient!ec;II)V", line = 37)
	@Override
	public void method33464(@OriginalArg(0) Class108 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Class507.aClass507_4 == this.aClass507Array1[arg0.anInt867 * -1284841473]) {
			this.aBoolean171 = true;
		} else if (Class507.aClass507_6 == this.aClass507Array1[arg0.anInt867 * -1284841473] && this.method33455(arg0, -366723757) != arg1) {
			this.aBoolean172 = true;
			this.aSet1.add(arg0.anInt867 * -1284841473);
		}
		super.method33464(arg0, arg1, 908369267);
	}

	@OriginalMember(owner = "client!afu", name = "m", descriptor = "(Lclient!ec;J)V", line = 46)
	@Override
	public void method33466(@OriginalArg(0) Class108 arg0, @OriginalArg(1) long arg1) {
		if (this.aClass507Array1[arg0.anInt867 * -1284841473] == Class507.aClass507_4) {
			this.aBoolean171 = true;
		} else if (Class507.aClass507_6 == this.aClass507Array1[arg0.anInt867 * -1284841473] && this.method33465(arg0, 1779043114) != arg1) {
			this.aBoolean172 = true;
			this.aSet1.add(arg0.anInt867 * -1284841473);
		}
		super.method33466(arg0, arg1);
	}

	@OriginalMember(owner = "client!afu", name = "d", descriptor = "(Lclient!ec;J)V", line = 46)
	@Override
	public void method33474(@OriginalArg(0) Class108 arg0, @OriginalArg(1) long arg1) {
		if (this.aClass507Array1[arg0.anInt867 * -1284841473] == Class507.aClass507_4) {
			this.aBoolean171 = true;
		} else if (Class507.aClass507_6 == this.aClass507Array1[arg0.anInt867 * -1284841473] && this.method33465(arg0, 1401820791) != arg1) {
			this.aBoolean172 = true;
			this.aSet1.add(arg0.anInt867 * -1284841473);
		}
		super.method33466(arg0, arg1);
	}

	@OriginalMember(owner = "client!afu", name = "c", descriptor = "(Lclient!ec;J)V", line = 46)
	@Override
	public void method33475(@OriginalArg(0) Class108 arg0, @OriginalArg(1) long arg1) {
		if (this.aClass507Array1[arg0.anInt867 * -1284841473] == Class507.aClass507_4) {
			this.aBoolean171 = true;
		} else if (Class507.aClass507_6 == this.aClass507Array1[arg0.anInt867 * -1284841473] && this.method33465(arg0, 1309795971) != arg1) {
			this.aBoolean172 = true;
			this.aSet1.add(arg0.anInt867 * -1284841473);
		}
		super.method33466(arg0, arg1);
	}

	@OriginalMember(owner = "client!afu", name = "f", descriptor = "(Lclient!ec;Ljava/lang/Object;I)V", line = 55)
	@Override
	public void method33468(@OriginalArg(0) Class108 arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2) {
		if (Class507.aClass507_4 == this.aClass507Array1[arg0.anInt867 * -1284841473]) {
			this.aBoolean171 = true;
		} else if (Class507.aClass507_6 == this.aClass507Array1[arg0.anInt867 * -1284841473]) {
			if (arg1 instanceof String) {
				@Pc(27) String local27 = (String) arg1;
				if (local27.length() > 80) {
					arg1 = local27.substring(0, 80);
				}
			}
			@Pc(41) Object local41 = this.method33467(arg0, (byte) 103);
			if (arg1 != null && local41 != null && !arg1.equals(local41)) {
				this.aBoolean172 = true;
				this.aSet1.add(arg0.anInt867 * -1284841473);
			} else if ((local41 == null) != (arg1 == null)) {
				this.aBoolean172 = true;
				this.aSet1.add(arg0.anInt867 * -1284841473);
			}
		}
		super.method33468(arg0, arg1, -1393491443);
	}

	@OriginalMember(owner = "client!afu", name = "r", descriptor = "(Lclient!ec;Ljava/lang/Object;)V", line = 55)
	@Override
	public void method33476(@OriginalArg(0) Class108 arg0, @OriginalArg(1) Object arg1) {
		if (Class507.aClass507_4 == this.aClass507Array1[arg0.anInt867 * -1284841473]) {
			this.aBoolean171 = true;
		} else if (Class507.aClass507_6 == this.aClass507Array1[arg0.anInt867 * -1284841473]) {
			if (arg1 instanceof String) {
				@Pc(27) String local27 = (String) arg1;
				if (local27.length() > 80) {
					arg1 = local27.substring(0, 80);
				}
			}
			@Pc(41) Object local41 = this.method33467(arg0, (byte) 95);
			if (arg1 != null && local41 != null && !arg1.equals(local41)) {
				this.aBoolean172 = true;
				this.aSet1.add(arg0.anInt867 * -1284841473);
			} else if ((local41 == null) != (arg1 == null)) {
				this.aBoolean172 = true;
				this.aSet1.add(arg0.anInt867 * -1284841473);
			}
		}
		super.method33468(arg0, arg1, -2014779087);
	}

	@OriginalMember(owner = "client!afu", name = "v", descriptor = "(Lclient!ec;Ljava/lang/Object;)V", line = 55)
	@Override
	public void method33477(@OriginalArg(0) Class108 arg0, @OriginalArg(1) Object arg1) {
		if (Class507.aClass507_4 == this.aClass507Array1[arg0.anInt867 * -1284841473]) {
			this.aBoolean171 = true;
		} else if (Class507.aClass507_6 == this.aClass507Array1[arg0.anInt867 * -1284841473]) {
			if (arg1 instanceof String) {
				@Pc(27) String local27 = (String) arg1;
				if (local27.length() > 80) {
					arg1 = local27.substring(0, 80);
				}
			}
			@Pc(41) Object local41 = this.method33467(arg0, (byte) 93);
			if (arg1 != null && local41 != null && !arg1.equals(local41)) {
				this.aBoolean172 = true;
				this.aSet1.add(arg0.anInt867 * -1284841473);
			} else if ((local41 == null) != (arg1 == null)) {
				this.aBoolean172 = true;
				this.aSet1.add(arg0.anInt867 * -1284841473);
			}
		}
		super.method33468(arg0, arg1, -2088417164);
	}

	@OriginalMember(owner = "client!afu", name = "o", descriptor = "(Lclient!ec;Ljava/lang/Object;)V", line = 55)
	@Override
	public void method33478(@OriginalArg(0) Class108 arg0, @OriginalArg(1) Object arg1) {
		if (Class507.aClass507_4 == this.aClass507Array1[arg0.anInt867 * -1284841473]) {
			this.aBoolean171 = true;
		} else if (Class507.aClass507_6 == this.aClass507Array1[arg0.anInt867 * -1284841473]) {
			if (arg1 instanceof String) {
				@Pc(27) String local27 = (String) arg1;
				if (local27.length() > 80) {
					arg1 = local27.substring(0, 80);
				}
			}
			@Pc(41) Object local41 = this.method33467(arg0, (byte) 49);
			if (arg1 != null && local41 != null && !arg1.equals(local41)) {
				this.aBoolean172 = true;
				this.aSet1.add(arg0.anInt867 * -1284841473);
			} else if ((local41 == null) != (arg1 == null)) {
				this.aBoolean172 = true;
				this.aSet1.add(arg0.anInt867 * -1284841473);
			}
		}
		super.method33468(arg0, arg1, -1789684799);
	}

	@OriginalMember(owner = "client!afu", name = "s", descriptor = "(Lclient!ec;Ljava/lang/Object;)V", line = 55)
	@Override
	public void method33483(@OriginalArg(0) Class108 arg0, @OriginalArg(1) Object arg1) {
		if (Class507.aClass507_4 == this.aClass507Array1[arg0.anInt867 * -1284841473]) {
			this.aBoolean171 = true;
		} else if (Class507.aClass507_6 == this.aClass507Array1[arg0.anInt867 * -1284841473]) {
			if (arg1 instanceof String) {
				@Pc(27) String local27 = (String) arg1;
				if (local27.length() > 80) {
					arg1 = local27.substring(0, 80);
				}
			}
			@Pc(41) Object local41 = this.method33467(arg0, (byte) 91);
			if (arg1 != null && local41 != null && !arg1.equals(local41)) {
				this.aBoolean172 = true;
				this.aSet1.add(arg0.anInt867 * -1284841473);
			} else if ((local41 == null) != (arg1 == null)) {
				this.aBoolean172 = true;
				this.aSet1.add(arg0.anInt867 * -1284841473);
			}
		}
		super.method33468(arg0, arg1, -1980822128);
	}

	@OriginalMember(owner = "client!afu", name = "i", descriptor = "(I)V", line = 75)
	public void method7412(@OriginalArg(0) int arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass507Array1.length; local1++) {
			if (this.aClass507Array1[local1] == Class507.aClass507_5 || this.aClass507Array1[local1] == Class507.aClass507_6) {
				this.anInterface3_2.method778(local1, (byte) -64);
			}
		}
		this.aSet1.clear();
		this.aBoolean172 = false;
		this.aClass466Array1 = null;
		this.aLong27 = 1570658587136822319L;
	}

	@OriginalMember(owner = "client!afu", name = "am", descriptor = "()V", line = 85)
	public void method7413() {
		this.anInt865 = 0;
	}

	@OriginalMember(owner = "client!afu", name = "j", descriptor = "(I)V", line = 85)
	public void method7414(@OriginalArg(0) int arg0) {
		this.anInt865 = 0;
	}

	@OriginalMember(owner = "client!afu", name = "au", descriptor = "()V", line = 85)
	public void method7415() {
		this.anInt865 = 0;
	}

	@OriginalMember(owner = "client!afu", name = "ar", descriptor = "(Lclient!abl;)V", line = 90)
	public void method7416(@OriginalArg(0) Class38 arg0) {
		boolean var20 = false;
		label255: {
			label242: {
				label243: {
					label256: {
						label257: {
							try {
								var20 = true;
								@Pc(7) byte[] local7 = new byte[(int) arg0.method732(1237073824)];
								@Pc(21) int local21;
								for (int var3 = 0; var3 < local7.length; var3 += local21) {
									local21 = arg0.method734(local7, var3, local7.length - var3, (byte) -16);
									if (local21 == -1) {
										throw new EOFException();
									}
								}
								@Pc(38) Packet local38 = new Packet(local7);
								if (local38.data.length - local38.pos * 212851357 < 1) {
									var20 = false;
									break label242;
								}
								@Pc(58) int local58 = local38.g1((short) 16384);
								if (local58 < 0) {
									var20 = false;
									break label255;
								}
								if (local58 > 1) {
									var20 = false;
									break label255;
								}
								if (local38.data.length - local38.pos * 212851357 < 2) {
									var20 = false;
									break label243;
								}
								@Pc(89) int local89 = local38.g2(-1434290800);
								if (local38.data.length - local38.pos * 212851357 < local89 * 6) {
									var20 = false;
									break label256;
								}
								@Pc(109) int local109 = 0;
								while (true) {
									if (local109 >= local89) {
										var20 = false;
										break;
									}
									@Pc(117) Class466 local117 = Class72.aClass79_Sub1_Sub2_2.method1468(local38, (byte) 80);
									if (this.aClass507Array1[local117.anInt5092 * -1181855333] == Class507.aClass507_4 && ((Class108) Class72.aClass79_Sub1_Sub2_2.get(local117.anInt5092 * -1181855333, -2028069293)).aClass519_6.method30313((byte) 36).aClass2.isAssignableFrom(local117.anObject19.getClass())) {
										this.anInterface3_2.method776(local117.anInt5092 * -1181855333, local117.anObject19, (byte) 2);
									}
									local109++;
								}
							} catch (@Pc(164) Exception local164) {
								var20 = false;
								break label257;
							} finally {
								if (var20) {
									try {
										arg0.method728(-1545995856);
									} catch (@Pc(176) Exception local176) {
									}
								}
							}
							try {
								arg0.method728(484121670);
							} catch (@Pc(162) Exception local162) {
							}
							return;
						}
						try {
							arg0.method728(-1457944438);
						} catch (@Pc(169) Exception local169) {
						}
						return;
					}
					try {
						arg0.method728(906750477);
					} catch (@Pc(106) Exception local106) {
					}
					return;
				}
				try {
					arg0.method728(13599299);
				} catch (@Pc(84) Exception local84) {
				}
				return;
			}
			try {
				arg0.method728(-2142736760);
			} catch (@Pc(53) Exception local53) {
			}
			return;
		}
		try {
			arg0.method728(1269141843);
		} catch (@Pc(68) Exception local68) {
		}
	}

	@OriginalMember(owner = "client!afu", name = "t", descriptor = "(Lclient!abl;B)V", line = 90)
	public void method7417(@OriginalArg(0) Class38 arg0, @OriginalArg(1) byte arg1) {
		boolean var21 = false;
		label255: {
			label242: {
				label243: {
					label256: {
						label257: {
							try {
								var21 = true;
								@Pc(7) byte[] local7 = new byte[(int) arg0.method732(1507843463)];
								@Pc(21) int local21;
								for (int var4 = 0; var4 < local7.length; var4 += local21) {
									local21 = arg0.method734(local7, var4, local7.length - var4, (byte) -1);
									if (local21 == -1) {
										throw new EOFException();
									}
								}
								@Pc(38) Packet local38 = new Packet(local7);
								if (local38.data.length - local38.pos * 212851357 < 1) {
									var21 = false;
									break label242;
								}
								@Pc(58) int local58 = local38.g1((short) 16384);
								if (local58 < 0) {
									var21 = false;
									break label255;
								}
								if (local58 > 1) {
									var21 = false;
									break label255;
								}
								if (local38.data.length - local38.pos * 212851357 < 2) {
									var21 = false;
									break label243;
								}
								@Pc(89) int local89 = local38.g2(-1434290800);
								if (local38.data.length - local38.pos * 212851357 < local89 * 6) {
									var21 = false;
									break label256;
								}
								@Pc(109) int local109 = 0;
								while (true) {
									if (local109 >= local89) {
										var21 = false;
										break;
									}
									@Pc(117) Class466 local117 = Class72.aClass79_Sub1_Sub2_2.method1468(local38, (byte) 9);
									if (this.aClass507Array1[local117.anInt5092 * -1181855333] == Class507.aClass507_4 && ((Class108) Class72.aClass79_Sub1_Sub2_2.get(local117.anInt5092 * -1181855333, -2073808347)).aClass519_6.method30313((byte) 36).aClass2.isAssignableFrom(local117.anObject19.getClass())) {
										this.anInterface3_2.method776(local117.anInt5092 * -1181855333, local117.anObject19, (byte) 68);
									}
									local109++;
								}
							} catch (@Pc(164) Exception local164) {
								var21 = false;
								break label257;
							} finally {
								if (var21) {
									try {
										arg0.method728(-88198573);
									} catch (@Pc(176) Exception local176) {
									}
								}
							}
							try {
								arg0.method728(-1370581231);
							} catch (@Pc(162) Exception local162) {
							}
							return;
						}
						try {
							arg0.method728(1216269339);
						} catch (@Pc(169) Exception local169) {
						}
						return;
					}
					try {
						arg0.method728(-488636056);
					} catch (@Pc(106) Exception local106) {
					}
					return;
				}
				try {
					arg0.method728(-197157777);
				} catch (@Pc(84) Exception local84) {
				}
				return;
			}
			try {
				arg0.method728(-2098329720);
			} catch (@Pc(53) Exception local53) {
			}
			return;
		}
		try {
			arg0.method728(-1854076600);
		} catch (@Pc(68) Exception local68) {
		}
	}

	@OriginalMember(owner = "client!afu", name = "u", descriptor = "(II)V", line = 115)
	public static void method7418(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (client.state * -849002901 == 0) {
			@Pc(10) ClientMessage local10 = Class102.createGameMessage(ClientProt.aClientProt_120, client.aClass175_1.clientIsaac, (byte) 7);
			local10.packet.p1(arg0, (byte) -78);
			client.aClass175_1.send(local10, -2112472349);
		}
	}

	@OriginalMember(owner = "client!afu", name = "ae", descriptor = "(Lclient!abl;B)V", line = 124)
	public void method7419(@OriginalArg(0) Class38 arg0, @OriginalArg(1) byte arg1) {
		boolean var15 = false;
		label109: {
			label108: {
				try {
					var15 = true;
					@Pc(3) int local3 = 3;
					@Pc(5) int local5 = 0;
					Iterator var5 = this.anInterface3_2.iterator();
					while (var5.hasNext()) {
						@Pc(14) Class466 local14 = (Class466) var5.next();
						if (Class507.aClass507_4 == this.aClass507Array1[local14.anInt5092 * -1181855333]) {
							local3 += Class72.aClass79_Sub1_Sub2_2.method1462(local14, (byte) -5);
							local5++;
						}
					}
					@Pc(37) Packet local37 = new Packet(local3);
					local37.p1(1, (byte) -51);
					local37.p2(local5, 2129287945);
					@Pc(49) Iterator local49 = this.anInterface3_2.iterator();
					while (local49.hasNext()) {
						@Pc(56) Class466 local56 = (Class466) local49.next();
						if (Class507.aClass507_4 == this.aClass507Array1[local56.anInt5092 * -1181855333]) {
							Class72.aClass79_Sub1_Sub2_2.method1465(local37, local56, 987538283);
						}
					}
					arg0.method725(local37.data, 0, local37.pos * 212851357, -948523775);
					var15 = false;
					break label108;
				} catch (@Pc(88) Exception local88) {
					var15 = false;
				} finally {
					if (var15) {
						try {
							arg0.method728(-1686425938);
						} catch (@Pc(100) Exception local100) {
						}
					}
				}
				try {
					arg0.method728(-2044019865);
				} catch (@Pc(93) Exception local93) {
				}
				break label109;
			}
			try {
				arg0.method728(-1304223696);
			} catch (@Pc(86) Exception local86) {
			}
		}
		this.aLong26 = Class305.method26797(-212452098) * -2265688048181101683L;
		this.aBoolean171 = false;
	}

	@OriginalMember(owner = "client!afu", name = "ap", descriptor = "(Lclient!abl;)V", line = 124)
	public void method7420(@OriginalArg(0) Class38 arg0) {
		boolean var14 = false;
		label109: {
			label108: {
				try {
					var14 = true;
					@Pc(3) int local3 = 3;
					@Pc(5) int local5 = 0;
					Iterator var4 = this.anInterface3_2.iterator();
					while (var4.hasNext()) {
						@Pc(14) Class466 local14 = (Class466) var4.next();
						if (Class507.aClass507_4 == this.aClass507Array1[local14.anInt5092 * -1181855333]) {
							local3 += Class72.aClass79_Sub1_Sub2_2.method1462(local14, (byte) 30);
							local5++;
						}
					}
					@Pc(37) Packet local37 = new Packet(local3);
					local37.p1(1, (byte) -93);
					local37.p2(local5, 2141211611);
					@Pc(49) Iterator local49 = this.anInterface3_2.iterator();
					while (local49.hasNext()) {
						@Pc(56) Class466 local56 = (Class466) local49.next();
						if (Class507.aClass507_4 == this.aClass507Array1[local56.anInt5092 * -1181855333]) {
							Class72.aClass79_Sub1_Sub2_2.method1465(local37, local56, 1635406615);
						}
					}
					arg0.method725(local37.data, 0, local37.pos * 212851357, -1755997044);
					var14 = false;
					break label108;
				} catch (@Pc(88) Exception local88) {
					var14 = false;
				} finally {
					if (var14) {
						try {
							arg0.method728(-1703231042);
						} catch (@Pc(100) Exception local100) {
						}
					}
				}
				try {
					arg0.method728(1062851743);
				} catch (@Pc(93) Exception local93) {
				}
				break label109;
			}
			try {
				arg0.method728(-853169749);
			} catch (@Pc(86) Exception local86) {
			}
		}
		this.aLong26 = Class305.method26797(-150741539) * -2265688048181101683L;
		this.aBoolean171 = false;
	}

	@OriginalMember(owner = "client!afu", name = "aq", descriptor = "(Lclient!abl;)V", line = 124)
	public void method7421(@OriginalArg(0) Class38 arg0) {
		boolean var14 = false;
		label109: {
			label108: {
				try {
					var14 = true;
					@Pc(3) int local3 = 3;
					@Pc(5) int local5 = 0;
					Iterator var4 = this.anInterface3_2.iterator();
					while (var4.hasNext()) {
						@Pc(14) Class466 local14 = (Class466) var4.next();
						if (Class507.aClass507_4 == this.aClass507Array1[local14.anInt5092 * -1181855333]) {
							local3 += Class72.aClass79_Sub1_Sub2_2.method1462(local14, (byte) 28);
							local5++;
						}
					}
					@Pc(37) Packet local37 = new Packet(local3);
					local37.p1(1, (byte) -89);
					local37.p2(local5, 2133865078);
					@Pc(49) Iterator local49 = this.anInterface3_2.iterator();
					while (local49.hasNext()) {
						@Pc(56) Class466 local56 = (Class466) local49.next();
						if (Class507.aClass507_4 == this.aClass507Array1[local56.anInt5092 * -1181855333]) {
							Class72.aClass79_Sub1_Sub2_2.method1465(local37, local56, 1390263862);
						}
					}
					arg0.method725(local37.data, 0, local37.pos * 212851357, 579451472);
					var14 = false;
					break label108;
				} catch (@Pc(88) Exception local88) {
					var14 = false;
				} finally {
					if (var14) {
						try {
							arg0.method728(-1354333124);
						} catch (@Pc(100) Exception local100) {
						}
					}
				}
				try {
					arg0.method728(-1329466914);
				} catch (@Pc(93) Exception local93) {
				}
				break label109;
			}
			try {
				arg0.method728(-1350678039);
			} catch (@Pc(86) Exception local86) {
			}
		}
		this.aLong26 = Class305.method26797(1016503932) * -2265688048181101683L;
		this.aBoolean171 = false;
	}

	@OriginalMember(owner = "client!afu", name = "ag", descriptor = "(I)V", line = 158)
	public void method7422(@OriginalArg(0) int arg0) {
		if (Class305.method26797(593627234) < this.aLong27 * 1159186737028678961L) {
			return;
		}
		@Pc(35) int local35;
		if (this.aClass466Array1 == null) {
			if (!this.aBoolean172) {
				return;
			}
			this.aClass466Array1 = new Class466[this.aSet1.size()];
			@Pc(23) int local23 = 0;
			@Pc(27) Iterator local27 = this.aSet1.iterator();
			while (local27.hasNext()) {
				local35 = (Integer) local27.next();
				this.aClass466Array1[local23++] = new Class466(local35, this.anInterface3_2.method775(local35, -1188722494));
			}
			this.anInt865 = 0;
			this.aBoolean172 = false;
			this.aSet1.clear();
		}
		if (this.aClass466Array1 == null || this.anInt865 * -866505885 >= this.aClass466Array1.length) {
			return;
		}
		@Pc(73) Class175 local73 = Class330.method27371(-1979308137);
		if (local73.anInt3299 * 195575097 > 1200) {
			return;
		}
		@Pc(86) ClientMessage local86 = Class102.createGameMessage(ClientProt.aClientProt_53, local73.clientIsaac, (byte) 9);
		local86.packet.p2(0, 2138201948);
		local35 = local86.packet.pos * 212851357;
		local86.packet.pos += -1445626955;
		while (this.anInt865 * -866505885 < this.aClass466Array1.length) {
			@Pc(120) Class466 local120 = this.aClass466Array1[this.anInt865 * -866505885];
			if (local86.packet.pos * 212851357 + local73.anInt3299 * 195575097 + Class72.aClass79_Sub1_Sub2_2.method1462(local120, (byte) 17) > 1500) {
				break;
			}
			Class72.aClass79_Sub1_Sub2_2.method1465(local86.packet, local120, 1803396975);
			this.anInt865 += -1626821045;
		}
		local86.packet.psize2(local86.packet.pos * 212851357 - local35, 810164877);
		if (this.anInt865 * -866505885 >= this.aClass466Array1.length) {
			local86.packet.data[local35] = 1;
		} else {
			local86.packet.data[local35] = 0;
		}
		local73.send(local86, -1435756525);
		this.aLong27 = (Class305.method26797(1428123275) + 1000L) * -1570658587136822319L;
	}

	@OriginalMember(owner = "client!afu", name = "ao", descriptor = "()V", line = 158)
	public void method7423() {
		if (Class305.method26797(952254604) < this.aLong27 * 1159186737028678961L) {
			return;
		}
		@Pc(35) int local35;
		if (this.aClass466Array1 == null) {
			if (!this.aBoolean172) {
				return;
			}
			this.aClass466Array1 = new Class466[this.aSet1.size()];
			@Pc(23) int local23 = 0;
			@Pc(27) Iterator local27 = this.aSet1.iterator();
			while (local27.hasNext()) {
				local35 = (Integer) local27.next();
				this.aClass466Array1[local23++] = new Class466(local35, this.anInterface3_2.method775(local35, 223718390));
			}
			this.anInt865 = 0;
			this.aBoolean172 = false;
			this.aSet1.clear();
		}
		if (this.aClass466Array1 == null || this.anInt865 * -866505885 >= this.aClass466Array1.length) {
			return;
		}
		@Pc(73) Class175 local73 = Class330.method27371(-1511587473);
		if (local73.anInt3299 * 195575097 > 1200) {
			return;
		}
		@Pc(86) ClientMessage local86 = Class102.createGameMessage(ClientProt.aClientProt_53, local73.clientIsaac, (byte) 52);
		local86.packet.p2(0, 2136273513);
		local35 = local86.packet.pos * 212851357;
		local86.packet.pos += -1445626955;
		while (this.anInt865 * -866505885 < this.aClass466Array1.length) {
			@Pc(120) Class466 local120 = this.aClass466Array1[this.anInt865 * -866505885];
			if (local86.packet.pos * 212851357 + local73.anInt3299 * 195575097 + Class72.aClass79_Sub1_Sub2_2.method1462(local120, (byte) 32) > 1500) {
				break;
			}
			Class72.aClass79_Sub1_Sub2_2.method1465(local86.packet, local120, 1411790795);
			this.anInt865 += -1626821045;
		}
		local86.packet.psize2(local86.packet.pos * 212851357 - local35, 1212927647);
		if (this.anInt865 * -866505885 >= this.aClass466Array1.length) {
			local86.packet.data[local35] = 1;
		} else {
			local86.packet.data[local35] = 0;
		}
		local73.send(local86, -1784685613);
		this.aLong27 = (Class305.method26797(-336313948) + 1000L) * -1570658587136822319L;
	}

	@OriginalMember(owner = "client!afu", name = "ax", descriptor = "()V", line = 158)
	public void method7424() {
		if (Class305.method26797(-154550489) < this.aLong27 * 1159186737028678961L) {
			return;
		}
		@Pc(35) int local35;
		if (this.aClass466Array1 == null) {
			if (!this.aBoolean172) {
				return;
			}
			this.aClass466Array1 = new Class466[this.aSet1.size()];
			@Pc(23) int local23 = 0;
			@Pc(27) Iterator local27 = this.aSet1.iterator();
			while (local27.hasNext()) {
				local35 = (Integer) local27.next();
				this.aClass466Array1[local23++] = new Class466(local35, this.anInterface3_2.method775(local35, 1278177178));
			}
			this.anInt865 = 0;
			this.aBoolean172 = false;
			this.aSet1.clear();
		}
		if (this.aClass466Array1 == null || this.anInt865 * -866505885 >= this.aClass466Array1.length) {
			return;
		}
		@Pc(73) Class175 local73 = Class330.method27371(-1687992933);
		if (local73.anInt3299 * 195575097 > 1200) {
			return;
		}
		@Pc(86) ClientMessage local86 = Class102.createGameMessage(ClientProt.aClientProt_53, local73.clientIsaac, (byte) 33);
		local86.packet.p2(0, 2135477586);
		local35 = local86.packet.pos * 212851357;
		local86.packet.pos += -1445626955;
		while (this.anInt865 * -866505885 < this.aClass466Array1.length) {
			@Pc(120) Class466 local120 = this.aClass466Array1[this.anInt865 * -866505885];
			if (local86.packet.pos * 212851357 + local73.anInt3299 * 195575097 + Class72.aClass79_Sub1_Sub2_2.method1462(local120, (byte) -56) > 1500) {
				break;
			}
			Class72.aClass79_Sub1_Sub2_2.method1465(local86.packet, local120, 1530331711);
			this.anInt865 += -1626821045;
		}
		local86.packet.psize2(local86.packet.pos * 212851357 - local35, -1536370504);
		if (this.anInt865 * -866505885 >= this.aClass466Array1.length) {
			local86.packet.data[local35] = 1;
		} else {
			local86.packet.data[local35] = 0;
		}
		local73.send(local86, -2102565645);
		this.aLong27 = (Class305.method26797(1556519612) + 1000L) * -1570658587136822319L;
	}

	@OriginalMember(owner = "client!afu", name = "av", descriptor = "()V", line = 158)
	public void method7425() {
		if (Class305.method26797(140476184) < this.aLong27 * 1159186737028678961L) {
			return;
		}
		@Pc(35) int local35;
		if (this.aClass466Array1 == null) {
			if (!this.aBoolean172) {
				return;
			}
			this.aClass466Array1 = new Class466[this.aSet1.size()];
			@Pc(23) int local23 = 0;
			@Pc(27) Iterator local27 = this.aSet1.iterator();
			while (local27.hasNext()) {
				local35 = (Integer) local27.next();
				this.aClass466Array1[local23++] = new Class466(local35, this.anInterface3_2.method775(local35, 2082592266));
			}
			this.anInt865 = 0;
			this.aBoolean172 = false;
			this.aSet1.clear();
		}
		if (this.aClass466Array1 == null || this.anInt865 * -866505885 >= this.aClass466Array1.length) {
			return;
		}
		@Pc(73) Class175 local73 = Class330.method27371(-1517696522);
		if (local73.anInt3299 * 195575097 > 1200) {
			return;
		}
		@Pc(86) ClientMessage local86 = Class102.createGameMessage(ClientProt.aClientProt_53, local73.clientIsaac, (byte) 125);
		local86.packet.p2(0, 2125731311);
		local35 = local86.packet.pos * 212851357;
		local86.packet.pos += -1445626955;
		while (this.anInt865 * -866505885 < this.aClass466Array1.length) {
			@Pc(120) Class466 local120 = this.aClass466Array1[this.anInt865 * -866505885];
			if (local86.packet.pos * 212851357 + local73.anInt3299 * 195575097 + Class72.aClass79_Sub1_Sub2_2.method1462(local120, (byte) 43) > 1500) {
				break;
			}
			Class72.aClass79_Sub1_Sub2_2.method1465(local86.packet, local120, 1548134889);
			this.anInt865 += -1626821045;
		}
		local86.packet.psize2(local86.packet.pos * 212851357 - local35, 1251982343);
		if (this.anInt865 * -866505885 >= this.aClass466Array1.length) {
			local86.packet.data[local35] = 1;
		} else {
			local86.packet.data[local35] = 0;
		}
		local73.send(local86, -2068777433);
		this.aLong27 = (Class305.method26797(1109693824) + 1000L) * -1570658587136822319L;
	}

	@OriginalMember(owner = "client!afu", name = "ad", descriptor = "(I)V", line = 195)
	public void method7426(@OriginalArg(0) int arg0) {
		if (this.aClass466Array1 != null && this.anInt865 * -866505885 >= this.aClass466Array1.length) {
			this.aClass466Array1 = null;
			this.anInt865 = 0;
		}
	}

	@OriginalMember(owner = "client!afu", name = "aj", descriptor = "()V", line = 195)
	public void method7427() {
		if (this.aClass466Array1 != null && this.anInt865 * -866505885 >= this.aClass466Array1.length) {
			this.aClass466Array1 = null;
			this.anInt865 = 0;
		}
	}
}
