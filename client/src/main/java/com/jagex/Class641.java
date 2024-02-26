package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wm")
public final class Class641 {

	@OriginalMember(owner = "client!wm", name = "nm", descriptor = "Lclient!aqc;")
	public static Class120_Sub1_Sub1_Sub1_Sub2 aClass120_Sub1_Sub1_Sub1_Sub2_3;

	@OriginalMember(owner = "client!wm", name = "l", descriptor = "Lclient!vk;")
	public Class615 aClass615_1;

	@OriginalMember(owner = "client!wm", name = "f", descriptor = "Lclient!ve;")
	public Interface67 anInterface67_1;

	@OriginalMember(owner = "client!wm", name = "e", descriptor = "Lclient!ve;")
	public Interface67 anInterface67_2;

	@OriginalMember(owner = "client!wm", name = "u", descriptor = "Lclient!ve;")
	public Interface67 anInterface67_3;

	@OriginalMember(owner = "client!wm", name = "t", descriptor = "Lclient!ve;")
	public Interface67 anInterface67_4;

	@OriginalMember(owner = "client!wm", name = "o", descriptor = "I")
	public int anInt5639;

	@OriginalMember(owner = "client!wm", name = "i", descriptor = "Lclient!vk;")
	public Class615 aClass615_2;

	@OriginalMember(owner = "client!wm", name = "m", descriptor = "I")
	public int anInt5640;

	@OriginalMember(owner = "client!wm", name = "g", descriptor = "Lclient!vk;")
	public Class615 aClass615_3;

	@OriginalMember(owner = "client!wm", name = "j", descriptor = "Z")
	public boolean aBoolean965;

	@OriginalMember(owner = "client!wm", name = "bdu", descriptor = "(Lclient!yp;I)V")
	static void method32898(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = client.aClass274_1.method26792(local12, 326461728).method26714((byte) -93);
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIIII)V")
	public static void method32899(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(4) Class80_Sub21 local4;
		for (local4 = (Class80_Sub21) Class80_Sub21.aClass8_22.method247(129206984); local4 != null; local4 = (Class80_Sub21) Class80_Sub21.aClass8_22.method237(-308946686)) {
			Class253.method26383(local4, arg0, arg1, arg2, arg3, 414828046);
		}
		@Pc(29) byte local29;
		@Pc(34) Class621 local34;
		@Pc(40) int local40;
		@Pc(115) int local115;
		@Pc(219) Class463 local219;
		for (local4 = (Class80_Sub21) Class80_Sub21.aClass8_21.method247(129206984); local4 != null; local4 = (Class80_Sub21) Class80_Sub21.aClass8_21.method237(-2121366770)) {
			local29 = 1;
			local34 = local4.aClass120_Sub1_Sub1_Sub1_Sub1_1.method18952((byte) -67);
			local40 = local4.aClass120_Sub1_Sub1_Sub1_Sub1_1.aClass6_Sub3_3.method23582(-5578219);
			if (local40 == -1 || local4.aClass120_Sub1_Sub1_Sub1_Sub1_1.aClass6_Sub3_3.aBoolean429) {
				local29 = 0;
			} else if (local34.anInt5445 * 228988343 == local40 || local40 == local34.anInt5437 * -457826299 || local40 == local34.anInt5448 * 1960834245 || local40 == local34.anInt5458 * 929486699) {
				local29 = 2;
			} else if (local40 == local34.anInt5449 * -1435917229 || local34.anInt5450 * -1567148933 == local40 || local34.anInt5463 * 1578952449 == local40 || local34.anInt5446 * -1532002241 == local40) {
				local29 = 3;
			}
			if (local29 != local4.anInt1601 * -73842175) {
				local115 = Class336.method27870(local4.aClass120_Sub1_Sub1_Sub1_Sub1_1, (short) 1749);
				@Pc(119) Class335 local119 = local4.aClass120_Sub1_Sub1_Sub1_Sub1_1.aClass335_1;
				if (local119.anIntArray416 != null) {
					local119 = local119.method27836(Class672.aClass134_1, Class672.aClass134_1, -2061686966);
				}
				if (local119 == null || local115 == -1) {
					local4.anInt1606 = -1322638539;
					local4.anInt1601 = local29 * -244662783;
				} else if (local115 == local4.anInt1606 * -2023184157) {
					local4.anInt1601 = local29 * -244662783;
					local4.anInt1597 = local119.anInt4221 * -463929735;
				} else {
					@Pc(151) boolean local151 = false;
					if (local4.aClass529_3 == null) {
						local151 = true;
					} else {
						local4.anInt1597 -= 63959552;
						if (local4.anInt1597 * -803853751 <= 0) {
							local4.aClass529_3.method30788(100, 149996664);
							Class490.aClass263_13.method26582(local4.aClass529_3, (byte) 43);
							local4.aClass529_3 = null;
							local151 = true;
						}
					}
					if (local151) {
						local4.anInt1597 = local119.anInt4221 * -463929735;
						local4.anInt1606 = local115 * 1322638539;
						local4.anInt1601 = local29 * -244662783;
					}
				}
			}
			local219 = local4.aClass120_Sub1_Sub1_Sub1_Sub1_1.method24552().aClass463_61;
			local4.anInt1602 = (int) local219.aFloat297 * 1442581325;
			local4.anInt1593 = ((int) local219.aFloat297 + (local4.aClass120_Sub1_Sub1_Sub1_Sub1_1.method18966((byte) -77) << 8)) * -53776127;
			local4.anInt1599 = (int) local219.aFloat296 * 45625337;
			local4.anInt1596 = ((int) local219.aFloat296 + (local4.aClass120_Sub1_Sub1_Sub1_Sub1_1.method18966((byte) -30) << 8)) * 655931665;
			local4.anInt1591 = local4.aClass120_Sub1_Sub1_Sub1_Sub1_1.aByte99 * 635495667;
			Class253.method26383(local4, arg0, arg1, arg2, arg3, 378830794);
		}
		for (local4 = (Class80_Sub21) Class80_Sub21.aClass24_12.method580((byte) -91); local4 != null; local4 = (Class80_Sub21) Class80_Sub21.aClass24_12.method566((byte) 7)) {
			local29 = 1;
			local34 = local4.aClass120_Sub1_Sub1_Sub1_Sub2_1.method18952((byte) -37);
			local40 = local4.aClass120_Sub1_Sub1_Sub1_Sub2_1.aClass6_Sub3_3.method23582(-1683073504);
			if (local40 == -1 || local4.aClass120_Sub1_Sub1_Sub1_Sub2_1.aClass6_Sub3_3.aBoolean429) {
				local29 = 0;
			} else if (local40 == local34.anInt5445 * 228988343 || local34.anInt5437 * -457826299 == local40 || local40 == local34.anInt5448 * 1960834245 || local40 == local34.anInt5458 * 929486699) {
				local29 = 2;
			} else if (local34.anInt5449 * -1435917229 == local40 || local34.anInt5450 * -1567148933 == local40 || local40 == local34.anInt5463 * 1578952449 || local34.anInt5446 * -1532002241 == local40) {
				local29 = 3;
			}
			if (local4.anInt1601 * -73842175 != local29) {
				local115 = Class43.method930(local4.aClass120_Sub1_Sub1_Sub1_Sub2_1, (byte) 16);
				if (local115 == local4.anInt1606 * -2023184157) {
					local4.anInt1597 = local4.aClass120_Sub1_Sub1_Sub1_Sub2_1.anInt2720 * -1071821255;
					local4.anInt1601 = local29 * -244662783;
				} else {
					@Pc(385) boolean local385 = false;
					if (local4.aClass529_3 == null) {
						local385 = true;
					} else {
						local4.anInt1597 -= 63959552;
						if (local4.anInt1597 * -803853751 <= 0) {
							local4.aClass529_3.method30788(100, -1474925103);
							Class490.aClass263_13.method26582(local4.aClass529_3, (byte) 12);
							local4.aClass529_3 = null;
							local385 = true;
						}
					}
					if (local385) {
						local4.anInt1597 = local4.aClass120_Sub1_Sub1_Sub1_Sub2_1.anInt2720 * -1071821255;
						local4.anInt1606 = local115 * 1322638539;
						local4.anInt1601 = local29 * -244662783;
					}
				}
			}
			local219 = local4.aClass120_Sub1_Sub1_Sub1_Sub2_1.method24552().aClass463_61;
			local4.anInt1602 = (int) local219.aFloat297 * 1442581325;
			local4.anInt1593 = ((int) local219.aFloat297 + (local4.aClass120_Sub1_Sub1_Sub1_Sub2_1.method18966((byte) -68) << 8)) * -53776127;
			local4.anInt1599 = (int) local219.aFloat296 * 45625337;
			local4.anInt1596 = ((int) local219.aFloat296 + (local4.aClass120_Sub1_Sub1_Sub1_Sub2_1.method18966((byte) -89) << 8)) * 655931665;
			local4.anInt1591 = local4.aClass120_Sub1_Sub1_Sub1_Sub2_1.aByte99 * 635495667;
			Class253.method26383(local4, arg0, arg1, arg2, arg3, 752498401);
		}
	}

	@OriginalMember(owner = "client!wm", name = "j", descriptor = "(Lclient!akx;B)Lclient!akx;")
	public static Class80_Sub33 method32900(@OriginalArg(0) Class80_Sub33 arg0, @OriginalArg(1) byte arg1) {
		@Pc(2) Class80_Sub33[] local2 = Class80_Sub33.aClass80_Sub33Array1;
		synchronized (Class80_Sub33.aClass80_Sub33Array1) {
			if (Class80_Sub33.anInt1651 * 24502281 == 0) {
				return new Class80_Sub33(arg0);
			} else {
				Class80_Sub33.aClass80_Sub33Array1[(Class80_Sub33.anInt1651 -= 1399041593) * 24502281].method14474(arg0, 1096330498);
				return Class80_Sub33.aClass80_Sub33Array1[Class80_Sub33.anInt1651 * 24502281];
			}
		}
	}

	@OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(Lclient!pf;)V")
	public Class641(@OriginalArg(0) Class480 arg0) {
		@Pc(9) byte[] local9 = arg0.method29926(Class639.aClass639_7.anInt5637 * 1101033235, 1472047355);
		this.method32896(new Packet(local9), (byte) 6);
	}

	@OriginalMember(owner = "client!wm", name = "e", descriptor = "(Lclient!ald;)V")
	void method32894(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.g1();
			if (local3 == 0) {
				return;
			}
			if (local3 == 1) {
				this.anInterface67_4 = Class567.method31521(arg0, (byte) -30);
			} else if (local3 == 2) {
				this.anInterface67_1 = Class567.method31521(arg0, (byte) -111);
			} else if (local3 == 3) {
				this.anInterface67_2 = Class567.method31521(arg0, (byte) -20);
			} else if (local3 == 4) {
				this.anInterface67_3 = Class567.method31521(arg0, (byte) -52);
			} else if (local3 == 5) {
				this.aClass615_1 = Class630.method32712(arg0, 910683236);
			} else if (local3 == 6) {
				this.aClass615_3 = Class630.method32712(arg0, 1166368436);
			} else if (local3 == 7) {
				this.aClass615_2 = Class630.method32712(arg0, 1519255108);
			} else if (local3 == 8) {
				Class567.method31521(arg0, (byte) -48);
			} else if (local3 == 9) {
				Class567.method31521(arg0, (byte) -57);
			} else if (local3 == 10) {
				Class567.method31521(arg0, (byte) -30);
			} else if (local3 == 11) {
				this.aBoolean965 = true;
			} else if (local3 == 12) {
				this.anInt5640 = arg0.g4() * -959731039;
			} else if (local3 == 13) {
				this.anInt5639 = arg0.g4() * 1462101403;
			}
		}
	}

	@OriginalMember(owner = "client!wm", name = "f", descriptor = "(Lclient!ald;)V")
	void method32895(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.g1();
			if (local3 == 0) {
				return;
			}
			if (local3 == 1) {
				this.anInterface67_4 = Class567.method31521(arg0, (byte) -45);
			} else if (local3 == 2) {
				this.anInterface67_1 = Class567.method31521(arg0, (byte) -21);
			} else if (local3 == 3) {
				this.anInterface67_2 = Class567.method31521(arg0, (byte) -119);
			} else if (local3 == 4) {
				this.anInterface67_3 = Class567.method31521(arg0, (byte) -13);
			} else if (local3 == 5) {
				this.aClass615_1 = Class630.method32712(arg0, -956496);
			} else if (local3 == 6) {
				this.aClass615_3 = Class630.method32712(arg0, 1313803644);
			} else if (local3 == 7) {
				this.aClass615_2 = Class630.method32712(arg0, 1322383329);
			} else if (local3 == 8) {
				Class567.method31521(arg0, (byte) -84);
			} else if (local3 == 9) {
				Class567.method31521(arg0, (byte) -62);
			} else if (local3 == 10) {
				Class567.method31521(arg0, (byte) -121);
			} else if (local3 == 11) {
				this.aBoolean965 = true;
			} else if (local3 == 12) {
				this.anInt5640 = arg0.g4() * -959731039;
			} else if (local3 == 13) {
				this.anInt5639 = arg0.g4() * 1462101403;
			}
		}
	}

	@OriginalMember(owner = "client!wm", name = "t", descriptor = "(Lclient!ald;B)V")
	void method32896(@OriginalArg(0) Packet arg0, @OriginalArg(1) byte arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.g1();
			if (local3 == 0) {
				return;
			}
			if (local3 == 1) {
				this.anInterface67_4 = Class567.method31521(arg0, (byte) -109);
			} else if (local3 == 2) {
				this.anInterface67_1 = Class567.method31521(arg0, (byte) -106);
			} else if (local3 == 3) {
				this.anInterface67_2 = Class567.method31521(arg0, (byte) -88);
			} else if (local3 == 4) {
				this.anInterface67_3 = Class567.method31521(arg0, (byte) -69);
			} else if (local3 == 5) {
				this.aClass615_1 = Class630.method32712(arg0, 1750105348);
			} else if (local3 == 6) {
				this.aClass615_3 = Class630.method32712(arg0, 1470838434);
			} else if (local3 == 7) {
				this.aClass615_2 = Class630.method32712(arg0, 535806452);
			} else if (local3 == 8) {
				Class567.method31521(arg0, (byte) -89);
			} else if (local3 == 9) {
				Class567.method31521(arg0, (byte) -118);
			} else if (local3 == 10) {
				Class567.method31521(arg0, (byte) -117);
			} else if (local3 == 11) {
				this.aBoolean965 = true;
			} else if (local3 == 12) {
				this.anInt5640 = arg0.g4() * -959731039;
			} else if (local3 == 13) {
				this.anInt5639 = arg0.g4() * 1462101403;
			}
		}
	}

	@OriginalMember(owner = "client!wm", name = "u", descriptor = "(Lclient!ald;)V")
	void method32897(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.g1();
			if (local3 == 0) {
				return;
			}
			if (local3 == 1) {
				this.anInterface67_4 = Class567.method31521(arg0, (byte) -27);
			} else if (local3 == 2) {
				this.anInterface67_1 = Class567.method31521(arg0, (byte) -73);
			} else if (local3 == 3) {
				this.anInterface67_2 = Class567.method31521(arg0, (byte) -114);
			} else if (local3 == 4) {
				this.anInterface67_3 = Class567.method31521(arg0, (byte) 0);
			} else if (local3 == 5) {
				this.aClass615_1 = Class630.method32712(arg0, 1654943106);
			} else if (local3 == 6) {
				this.aClass615_3 = Class630.method32712(arg0, 657599942);
			} else if (local3 == 7) {
				this.aClass615_2 = Class630.method32712(arg0, 1596933440);
			} else if (local3 == 8) {
				Class567.method31521(arg0, (byte) -49);
			} else if (local3 == 9) {
				Class567.method31521(arg0, (byte) -5);
			} else if (local3 == 10) {
				Class567.method31521(arg0, (byte) -90);
			} else if (local3 == 11) {
				this.aBoolean965 = true;
			} else if (local3 == 12) {
				this.anInt5640 = arg0.g4() * -959731039;
			} else if (local3 == 13) {
				this.anInt5639 = arg0.g4() * 1462101403;
			}
		}
	}
}
