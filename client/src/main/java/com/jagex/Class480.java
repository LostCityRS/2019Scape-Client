package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public class Class480 implements Runnable {

	@OriginalMember(owner = "client!pf", name = "e", descriptor = "Lclient!aap;")
	Class18 aClass18_17 = new Class18();

	@OriginalMember(owner = "client!pf", name = "n", descriptor = "I")
	int anInt5134 = 0;

	@OriginalMember(owner = "client!pf", name = "m", descriptor = "Z")
	boolean aBoolean780 = false;

	@OriginalMember(owner = "client!pf", name = "k", descriptor = "Ljava/lang/Thread;")
	Thread aThread8 = new Thread(this);

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "()V", line = 13)
	public Class480() {
		this.aThread8.setDaemon(true);
		this.aThread8.start();
		this.aThread8.setPriority(1);
	}

	@OriginalMember(owner = "client!pf", name = "l", descriptor = "(ILclient!uf;)Lclient!atf;", line = 21)
	Class93_Sub1_Sub16_Sub2 method29730(@OriginalArg(0) int arg0, @OriginalArg(1) Class593 arg1) {
		@Pc(3) Class93_Sub1_Sub16_Sub2 local3 = new Class93_Sub1_Sub16_Sub2();
		local3.anInt3193 = -1552763519;
		@Pc(10) Class18 local10 = this.aClass18_17;
		synchronized (this.aClass18_17) {
			@Pc(17) Class93_Sub1_Sub16_Sub2 local17 = (Class93_Sub1_Sub16_Sub2) this.aClass18_17.method256(-84221696);
			while (true) {
				if (local17 == null) {
					break;
				}
				if ((long) arg0 == local17.aLong233 * -5980455722457358841L && arg1 == local17.aClass593_3 && local17.anInt3193 * -1998878079 == 2) {
					local3.aByteArray60 = local17.aByteArray60;
					local3.aBoolean546 = false;
					return local3;
				}
				local17 = (Class93_Sub1_Sub16_Sub2) this.aClass18_17.method264(204545165);
			}
		}
		local3.aByteArray60 = arg1.method31706(arg0, -1338893645);
		local3.aBoolean546 = false;
		local3.aBoolean544 = true;
		return local3;
	}

	@OriginalMember(owner = "client!pf", name = "e", descriptor = "(ILclient!uf;S)Lclient!atf;", line = 21)
	Class93_Sub1_Sub16_Sub2 method29731(@OriginalArg(0) int arg0, @OriginalArg(1) Class593 arg1, @OriginalArg(2) short arg2) {
		@Pc(3) Class93_Sub1_Sub16_Sub2 local3 = new Class93_Sub1_Sub16_Sub2();
		local3.anInt3193 = -1552763519;
		@Pc(10) Class18 local10 = this.aClass18_17;
		synchronized (this.aClass18_17) {
			@Pc(17) Class93_Sub1_Sub16_Sub2 local17 = (Class93_Sub1_Sub16_Sub2) this.aClass18_17.method256(-319021202);
			while (true) {
				if (local17 == null) {
					break;
				}
				if ((long) arg0 == local17.aLong233 * -5980455722457358841L && arg1 == local17.aClass593_3 && local17.anInt3193 * -1998878079 == 2) {
					local3.aByteArray60 = local17.aByteArray60;
					local3.aBoolean546 = false;
					return local3;
				}
				local17 = (Class93_Sub1_Sub16_Sub2) this.aClass18_17.method264(-1638279423);
			}
		}
		local3.aByteArray60 = arg1.method31706(arg0, -1338893645);
		local3.aBoolean546 = false;
		local3.aBoolean544 = true;
		return local3;
	}

	@OriginalMember(owner = "client!pf", name = "n", descriptor = "(I[BLclient!uf;I)Lclient!atf;", line = 39)
	Class93_Sub1_Sub16_Sub2 method29732(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) Class593 arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class93_Sub1_Sub16_Sub2 local3 = new Class93_Sub1_Sub16_Sub2();
		local3.anInt3193 = 1189440258;
		local3.aLong233 = (long) arg0 * -5463674641158180937L;
		local3.aByteArray60 = arg1;
		local3.aClass593_3 = arg2;
		local3.aBoolean544 = false;
		this.method29736(local3, -1639857845);
		return local3;
	}

	@OriginalMember(owner = "client!pf", name = "u", descriptor = "(I[BLclient!uf;)Lclient!atf;", line = 39)
	Class93_Sub1_Sub16_Sub2 method29733(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) Class593 arg2) {
		@Pc(3) Class93_Sub1_Sub16_Sub2 local3 = new Class93_Sub1_Sub16_Sub2();
		local3.anInt3193 = 1189440258;
		local3.aLong233 = (long) arg0 * -5463674641158180937L;
		local3.aByteArray60 = arg1;
		local3.aClass593_3 = arg2;
		local3.aBoolean544 = false;
		this.method29736(local3, -2070014084);
		return local3;
	}

	@OriginalMember(owner = "client!pf", name = "z", descriptor = "(I[BLclient!uf;)Lclient!atf;", line = 39)
	Class93_Sub1_Sub16_Sub2 method29734(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) Class593 arg2) {
		@Pc(3) Class93_Sub1_Sub16_Sub2 local3 = new Class93_Sub1_Sub16_Sub2();
		local3.anInt3193 = 1189440258;
		local3.aLong233 = (long) arg0 * -5463674641158180937L;
		local3.aByteArray60 = arg1;
		local3.aClass593_3 = arg2;
		local3.aBoolean544 = false;
		this.method29736(local3, -1002638385);
		return local3;
	}

	@OriginalMember(owner = "client!pf", name = "m", descriptor = "(ILclient!uf;B)Lclient!atf;", line = 50)
	Class93_Sub1_Sub16_Sub2 method29735(@OriginalArg(0) int arg0, @OriginalArg(1) Class593 arg1, @OriginalArg(2) byte arg2) {
		@Pc(3) Class93_Sub1_Sub16_Sub2 local3 = new Class93_Sub1_Sub16_Sub2();
		local3.anInt3193 = -363323261;
		local3.aLong233 = (long) arg0 * -5463674641158180937L;
		local3.aClass593_3 = arg1;
		local3.aBoolean544 = false;
		this.method29736(local3, -1392062291);
		return local3;
	}

	@OriginalMember(owner = "client!pf", name = "k", descriptor = "(Lclient!atf;I)V", line = 60)
	void method29736(@OriginalArg(0) Class93_Sub1_Sub16_Sub2 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class18 local3 = this.aClass18_17;
		synchronized (this.aClass18_17) {
			this.aClass18_17.method250(arg0, 1053761227);
			this.anInt5134 += 973030675;
			this.aClass18_17.notifyAll();
		}
	}

	@OriginalMember(owner = "client!pf", name = "p", descriptor = "(Lclient!atf;)V", line = 60)
	void method29737(@OriginalArg(0) Class93_Sub1_Sub16_Sub2 arg0) {
		@Pc(3) Class18 local3 = this.aClass18_17;
		synchronized (this.aClass18_17) {
			this.aClass18_17.method250(arg0, 1375240929);
			this.anInt5134 += 973030675;
			this.aClass18_17.notifyAll();
		}
	}

	@OriginalMember(owner = "client!pf", name = "d", descriptor = "(Lclient!atf;)V", line = 60)
	void method29738(@OriginalArg(0) Class93_Sub1_Sub16_Sub2 arg0) {
		@Pc(3) Class18 local3 = this.aClass18_17;
		synchronized (this.aClass18_17) {
			this.aClass18_17.method250(arg0, 512494686);
			this.anInt5134 += 973030675;
			this.aClass18_17.notifyAll();
		}
	}

	@OriginalMember(owner = "client!pf", name = "s", descriptor = "(Lclient!atf;)V", line = 60)
	void method29739(@OriginalArg(0) Class93_Sub1_Sub16_Sub2 arg0) {
		@Pc(3) Class18 local3 = this.aClass18_17;
		synchronized (this.aClass18_17) {
			this.aClass18_17.method250(arg0, 738865436);
			this.anInt5134 += 973030675;
			this.aClass18_17.notifyAll();
		}
	}

	@OriginalMember(owner = "client!pf", name = "run", descriptor = "()V", line = 68)
	@Override
	public void run() {
		while (!this.aBoolean780) {
			@Pc(6) Class18 local6 = this.aClass18_17;
			@Pc(13) Class93_Sub1_Sub16_Sub2 local13;
			synchronized (this.aClass18_17) {
				local13 = (Class93_Sub1_Sub16_Sub2) this.aClass18_17.method254((byte) 8);
				if (local13 == null) {
					try {
						this.aClass18_17.wait();
					} catch (@Pc(27) InterruptedException local27) {
					}
					continue;
				}
				this.anInt5134 -= 973030675;
			}
			try {
				if (local13.anInt3193 * -1998878079 == 2) {
					local13.aClass593_3.method31711((int) (local13.aLong233 * -5980455722457358841L), local13.aByteArray60, local13.aByteArray60.length, -1778918765);
				} else if (local13.anInt3193 * -1998878079 == 3) {
					local13.aByteArray60 = local13.aClass593_3.method31706((int) (local13.aLong233 * -5980455722457358841L), -1338893645);
				}
			} catch (@Pc(79) Exception local79) {
				Class646.method32608(null, local79, 1413979620);
			}
			local13.aBoolean546 = false;
		}
	}

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "()V", line = 68)
	public void method29740() {
		while (!this.aBoolean780) {
			@Pc(6) Class18 local6 = this.aClass18_17;
			@Pc(13) Class93_Sub1_Sub16_Sub2 local13;
			synchronized (this.aClass18_17) {
				local13 = (Class93_Sub1_Sub16_Sub2) this.aClass18_17.method254((byte) 8);
				if (local13 == null) {
					try {
						this.aClass18_17.wait();
					} catch (@Pc(27) InterruptedException local27) {
					}
					continue;
				}
				this.anInt5134 -= 973030675;
			}
			try {
				if (local13.anInt3193 * -1998878079 == 2) {
					local13.aClass593_3.method31711((int) (local13.aLong233 * -5980455722457358841L), local13.aByteArray60, local13.aByteArray60.length, 599322661);
				} else if (local13.anInt3193 * -1998878079 == 3) {
					local13.aByteArray60 = local13.aClass593_3.method31706((int) (local13.aLong233 * -5980455722457358841L), -1338893645);
				}
			} catch (@Pc(79) Exception local79) {
				Class646.method32608(null, local79, 604727425);
			}
			local13.aBoolean546 = false;
		}
	}

	@OriginalMember(owner = "client!pf", name = "r", descriptor = "()V", line = 68)
	public void method29741() {
		while (!this.aBoolean780) {
			@Pc(6) Class18 local6 = this.aClass18_17;
			@Pc(13) Class93_Sub1_Sub16_Sub2 local13;
			synchronized (this.aClass18_17) {
				local13 = (Class93_Sub1_Sub16_Sub2) this.aClass18_17.method254((byte) 8);
				if (local13 == null) {
					try {
						this.aClass18_17.wait();
					} catch (@Pc(27) InterruptedException local27) {
					}
					continue;
				}
				this.anInt5134 -= 973030675;
			}
			try {
				if (local13.anInt3193 * -1998878079 == 2) {
					local13.aClass593_3.method31711((int) (local13.aLong233 * -5980455722457358841L), local13.aByteArray60, local13.aByteArray60.length, -1103051181);
				} else if (local13.anInt3193 * -1998878079 == 3) {
					local13.aByteArray60 = local13.aClass593_3.method31706((int) (local13.aLong233 * -5980455722457358841L), -1338893645);
				}
			} catch (@Pc(79) Exception local79) {
				Class646.method32608(null, local79, 1316275568);
			}
			local13.aBoolean546 = false;
		}
	}

	@OriginalMember(owner = "client!pf", name = "v", descriptor = "()V", line = 68)
	public void method29742() {
		while (!this.aBoolean780) {
			@Pc(6) Class18 local6 = this.aClass18_17;
			@Pc(13) Class93_Sub1_Sub16_Sub2 local13;
			synchronized (this.aClass18_17) {
				local13 = (Class93_Sub1_Sub16_Sub2) this.aClass18_17.method254((byte) 8);
				if (local13 == null) {
					try {
						this.aClass18_17.wait();
					} catch (@Pc(27) InterruptedException local27) {
					}
					continue;
				}
				this.anInt5134 -= 973030675;
			}
			try {
				if (local13.anInt3193 * -1998878079 == 2) {
					local13.aClass593_3.method31711((int) (local13.aLong233 * -5980455722457358841L), local13.aByteArray60, local13.aByteArray60.length, -1813610025);
				} else if (local13.anInt3193 * -1998878079 == 3) {
					local13.aByteArray60 = local13.aClass593_3.method31706((int) (local13.aLong233 * -5980455722457358841L), -1338893645);
				}
			} catch (@Pc(79) Exception local79) {
				Class646.method32608(null, local79, 430998760);
			}
			local13.aBoolean546 = false;
		}
	}

	@OriginalMember(owner = "client!pf", name = "o", descriptor = "()V", line = 68)
	public void method29743() {
		while (!this.aBoolean780) {
			@Pc(6) Class18 local6 = this.aClass18_17;
			@Pc(13) Class93_Sub1_Sub16_Sub2 local13;
			synchronized (this.aClass18_17) {
				local13 = (Class93_Sub1_Sub16_Sub2) this.aClass18_17.method254((byte) 8);
				if (local13 == null) {
					try {
						this.aClass18_17.wait();
					} catch (@Pc(27) InterruptedException local27) {
					}
					continue;
				}
				this.anInt5134 -= 973030675;
			}
			try {
				if (local13.anInt3193 * -1998878079 == 2) {
					local13.aClass593_3.method31711((int) (local13.aLong233 * -5980455722457358841L), local13.aByteArray60, local13.aByteArray60.length, 1643072900);
				} else if (local13.anInt3193 * -1998878079 == 3) {
					local13.aByteArray60 = local13.aClass593_3.method31706((int) (local13.aLong233 * -5980455722457358841L), -1338893645);
				}
			} catch (@Pc(79) Exception local79) {
				Class646.method32608(null, local79, 209088102);
			}
			local13.aBoolean546 = false;
		}
	}

	@OriginalMember(owner = "client!pf", name = "l", descriptor = "(IZS)I", line = 94)
	public static int method29744(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) short arg2) {
		if (arg1) {
			return 0;
		}
		@Pc(8) Class93_Sub6 local8 = Class557.method31064(arg0, arg1, (short) 255);
		if (local8 == null) {
			return ((Class93_Sub1_Sub2) Class638.aClass32_Sub22_1.get(arg0, 380980563)).anInt316 * 820091969;
		}
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < local8.anIntArray173.length; local23++) {
			if (local8.anIntArray173[local23] == -1) {
				local21++;
			}
		}
		return local21 + (((Class93_Sub1_Sub2) Class638.aClass32_Sub22_1.get(arg0, -537088877)).anInt316 * 820091969 - local8.anIntArray173.length);
	}

	@OriginalMember(owner = "client!pf", name = "f", descriptor = "(I)I", line = 97)
	public int method29745(@OriginalArg(0) int arg0) {
		@Pc(3) Class18 local3 = this.aClass18_17;
		synchronized (this.aClass18_17) {
			return this.anInt5134 * -283161317;
		}
	}

	@OriginalMember(owner = "client!pf", name = "y", descriptor = "()I", line = 97)
	public int method29746() {
		@Pc(3) Class18 local3 = this.aClass18_17;
		synchronized (this.aClass18_17) {
			return this.anInt5134 * -283161317;
		}
	}

	@OriginalMember(owner = "client!pf", name = "w", descriptor = "(I)V", line = 103)
	public void method29747(@OriginalArg(0) int arg0) {
		this.aBoolean780 = true;
		@Pc(6) Class18 local6 = this.aClass18_17;
		synchronized (this.aClass18_17) {
			this.aClass18_17.notifyAll();
		}
		try {
			this.aThread8.join();
		} catch (@Pc(23) InterruptedException local23) {
		}
		this.aThread8 = null;
	}

	@OriginalMember(owner = "client!pf", name = "q", descriptor = "()V", line = 103)
	public void method29748() {
		this.aBoolean780 = true;
		@Pc(6) Class18 local6 = this.aClass18_17;
		synchronized (this.aClass18_17) {
			this.aClass18_17.notifyAll();
		}
		try {
			this.aThread8.join();
		} catch (@Pc(23) InterruptedException local23) {
		}
		this.aThread8 = null;
	}

	@OriginalMember(owner = "client!pf", name = "dh", descriptor = "(Lclient!dh;IIIIS)V", line = 307)
	static void method29749(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short arg5) {
		arg0.method20569(arg1, arg2, arg1 + arg3, arg4 + arg2);
		@Pc(22) int local22;
		@Pc(32) int local32;
		if (Class159_Sub1.anInt1950 * -1574654625 < 100) {
			@Pc(16) byte local16 = 20;
			local22 = arg1 + arg3 / 2;
			local32 = arg2 + arg4 / 2 - 18 - local16;
			arg0.method20721(arg1, arg2, arg3, arg4, -16777216, 0);
			arg0.method20573(local22 - 152, local32, 304, 34, client.aColorArray2[client.anInt3427 * 182213747].getRGB(), 0);
			arg0.method20721(local22 - 150, local32 + 2, Class159_Sub1.anInt1950 * -428996579, 30, client.aColorArray1[client.anInt3427 * 182213747].getRGB(), 0);
			Class118_Sub1.aClass106_3.method7530(Class74.aClass74_131.method1259(Class106.lang, (byte) -41), local22, local32 + local16, client.aColorArray3[client.anInt3427 * 182213747].getRGB(), -1, 1357185837);
			return;
		}
		@Pc(103) int local103 = Class93_Sub14.anInt1527 * -1951188017 - (int) ((float) arg3 / Class159_Sub1.aFloat152);
		local22 = Class159_Sub1.anInt1952 * -1606693775 + (int) ((float) arg4 / Class159_Sub1.aFloat152);
		local32 = Class93_Sub14.anInt1527 * -1951188017 + (int) ((float) arg3 / Class159_Sub1.aFloat152);
		@Pc(133) int local133 = Class159_Sub1.anInt1952 * -1606693775 - (int) ((float) arg4 / Class159_Sub1.aFloat152);
		Class344.anInt4190 = (Class93_Sub14.anInt1527 * -1951188017 - (int) ((float) arg3 / Class159_Sub1.aFloat152)) * -2111696771;
		Class657.anInt5811 = (-1606693775 * Class159_Sub1.anInt1952 - (int) ((float) arg4 / Class159_Sub1.aFloat152)) * -123898291;
		Class386.anInt4648 = (int) ((float) (arg3 * 2) / Class159_Sub1.aFloat152) * 1242810649;
		Class138.anInt1383 = (int) ((float) (arg4 * 2) / Class159_Sub1.aFloat152) * 1182553313;
		Class159_Sub1.aClass240_35 = Class159_Sub1.aClass240_33;
		Class159_Sub1.method14557(Class159_Sub1.anInt1915 + local103, local22 + Class159_Sub1.anInt1921, Class159_Sub1.anInt1915 + local32, local133 + Class159_Sub1.anInt1921, arg1, arg2, arg1 + arg3, arg2 + 1 + arg4);
		Class159_Sub1.method14558(arg0, !Class159_Sub1.aBoolean350, !Class159_Sub1.aBoolean349, client.mapMember, false);
		@Pc(219) Class22 local219 = Class159_Sub1.method14579(arg0);
		Class169.method18339(arg0, local219, 0, 0, (byte) -4);
		if (client.aBoolean599) {
			@Pc(233) int local233 = arg1 + arg3 - 5;
			@Pc(239) int local239 = arg2 + arg4 - 8;
			Class82.aClass106_1.method7527("Fps: " + Class553.anInt3407 * 1249273355 + " (" + Class553.anInt3417 * -2066467757 + " ms)", local233, local239, 16776960, -1, 1336485814);
			@Pc(265) int local265 = local239 - 15;
			@Pc(267) Runtime local267 = Runtime.getRuntime();
			@Pc(276) int local276 = (int) ((local267.totalMemory() - local267.freeMemory()) / 1024L);
			@Pc(278) int local278 = 16776960;
			if (local276 > 65536) {
				local278 = 16711680;
			}
			Class82.aClass106_1.method7527("Mem:" + local276 + "k", local233, local265, local278, -1, 1336485814);
			local239 = local265 - 15;
		}
		Class159_Sub1.aClass240_33.method25843(5, (byte) -30);
	}

	@OriginalMember(owner = "client!pf", name = "x", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZI)V", line = 522)
	static void method29750(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		@Pc(2) Class175 local2 = Class330.method27371(-1981318146);
		if (local2.getStream((byte) 27) == null) {
			return;
		}
		@Pc(12) ClientMessage local12 = Class102.createGameMessage(ClientProt.aClientProt_27, local2.clientIsaac, (byte) 124);
		local12.packet.p2(Packet.pjstrlen(arg0, -1553492743) + Packet.pjstrlen(arg1, -2061658131) + Packet.pjstrlen(arg2, -1984974626) + 1, 2126703870);
		local12.packet.pjstr(arg0, -1212929370);
		local12.packet.pjstr(arg1, 107167147);
		local12.packet.pjstr(arg2, -2062750704);
		@Pc(46) int local46 = 0;
		if (arg3) {
			local46 |= 0x1;
		}
		if (arg4) {
			local46 |= 0x2;
		}
		local12.packet.p1(local46, (byte) -46);
		local2.send(local12, -1817238704);
	}

	@OriginalMember(owner = "client!pf", name = "bv", descriptor = "(FFFFFFII)F", line = 1925)
	static float method29751(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(1) float local1 = 0.0F;
		@Pc(5) float local5 = arg3 - arg0;
		@Pc(9) float local9 = arg4 - arg1;
		@Pc(13) float local13 = arg5 - arg2;
		@Pc(15) float local15 = 0.0F;
		@Pc(17) float local17 = 0.0F;
		@Pc(19) float local19 = 0.0F;
		@Pc(23) Class585 local23 = client.world.method30481(-1170801764);
		while (local1 < 1.1F) {
			@Pc(33) float local33 = arg0 + local5 * local1;
			@Pc(39) float local39 = local9 * local1 + arg1;
			@Pc(45) float local45 = arg2 + local1 * local13;
			@Pc(50) int local50 = (int) local33 >> 9;
			@Pc(55) int local55 = (int) local45 >> 9;
			if (local50 > 0 && local55 > 0 && local50 < client.world.method30459(1448389296) && local55 < client.world.method30466((short) 128)) {
				@Pc(72) int local72 = Class520.selfPlayer.aByte100;
				if (local72 < 3 && (client.world.method30487(2096861293).aByteArrayArrayArray12[1][local50][local55] & 0x2) != 0) {
					local72++;
				}
				@Pc(100) int local100 = local23.aClass99Array2[local72].method2473((int) local33, (int) local45, 1712015066);
				if ((float) local100 < local39) {
					if (arg6 >= 2) {
						return local1 - 0.1F + method29751(local15, local17, local19, local33, local39, local45, arg6 - 1, -874705229) * 0.1F;
					}
					return local1;
				}
			}
			local15 = local33;
			local17 = local39;
			local19 = local45;
			local1 += 0.1F;
		}
		return -1.0F;
	}

	@OriginalMember(owner = "client!pf", name = "jc", descriptor = "(Lclient!yf;S)V", line = 6705)
	static final void method29752(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		arg0.anInt5891 -= 1189701933;
	}
}
