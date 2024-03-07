package com.jagex;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!abn")
public class Class40 implements Interface3 {

	@OriginalMember(owner = "client!abn", name = "fp", descriptor = "Lclient!py;")
	public static Class497 aClass497_4;

	@OriginalMember(owner = "client!abn", name = "e", descriptor = "Ljava/util/Map;")
	Map aMap3;

	@OriginalMember(owner = "client!abn", name = "n", descriptor = "Lclient!os;")
	final Interface51 anInterface51_1;

	@OriginalMember(owner = "client!abn", name = "<init>", descriptor = "(Lclient!os;)V", line = 11)
	public Class40(@OriginalArg(0) Interface51 arg0) {
		this.anInterface51_1 = arg0;
	}

	@OriginalMember(owner = "client!abn", name = "e", descriptor = "(II)I", line = 16)
	@Override
	public int method781(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aMap3 != null) {
			@Pc(10) Class466 local10 = (Class466) this.aMap3.get(arg0);
			if (local10 != null) {
				return (Integer) local10.anObject19;
			}
		}
		return (Integer) this.anInterface51_1.method1460(arg0, (byte) 72);
	}

	@OriginalMember(owner = "client!abn", name = "z", descriptor = "(I)I", line = 16)
	@Override
	public int method790(@OriginalArg(0) int arg0) {
		if (this.aMap3 != null) {
			@Pc(10) Class466 local10 = (Class466) this.aMap3.get(arg0);
			if (local10 != null) {
				return (Integer) local10.anObject19;
			}
		}
		return (Integer) this.anInterface51_1.method1460(arg0, (byte) 22);
	}

	@OriginalMember(owner = "client!abn", name = "r", descriptor = "(I)I", line = 16)
	@Override
	public int method780(@OriginalArg(0) int arg0) {
		if (this.aMap3 != null) {
			@Pc(10) Class466 local10 = (Class466) this.aMap3.get(arg0);
			if (local10 != null) {
				return (Integer) local10.anObject19;
			}
		}
		return (Integer) this.anInterface51_1.method1460(arg0, (byte) 30);
	}

	@OriginalMember(owner = "client!abn", name = "n", descriptor = "(IIII)I", line = 19)
	public static int method794(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return 7 - arg0;
		} else if (local3 == 2) {
			return 7 - arg1;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!abn", name = "n", descriptor = "(IIB)V", line = 24)
	@Override
	public void method772(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (this.aMap3 == null) {
			this.aMap3 = new HashMap();
			this.aMap3.put(arg0, new Class466(arg0, arg1));
			return;
		}
		@Pc(27) Class466 local27 = (Class466) this.aMap3.get(arg0);
		if (local27 == null) {
			this.aMap3.put(arg0, new Class466(arg0, arg1));
		} else {
			local27.anObject19 = arg1;
		}
	}

	@OriginalMember(owner = "client!abn", name = "v", descriptor = "(II)V", line = 24)
	@Override
	public void method792(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aMap3 == null) {
			this.aMap3 = new HashMap();
			this.aMap3.put(arg0, new Class466(arg0, arg1));
			return;
		}
		@Pc(27) Class466 local27 = (Class466) this.aMap3.get(arg0);
		if (local27 == null) {
			this.aMap3.put(arg0, new Class466(arg0, arg1));
		} else {
			local27.anObject19 = arg1;
		}
	}

	@OriginalMember(owner = "client!abn", name = "m", descriptor = "(II)J", line = 36)
	@Override
	public long method779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aMap3 != null) {
			@Pc(9) Class466 local9 = (Class466) this.aMap3.get(arg0);
			if (local9 != null) {
				return (Long) local9.anObject19;
			}
		}
		return (Long) this.anInterface51_1.method1460(arg0, (byte) 60);
	}

	@OriginalMember(owner = "client!abn", name = "s", descriptor = "(I)J", line = 36)
	@Override
	public long method783(@OriginalArg(0) int arg0) {
		if (this.aMap3 != null) {
			@Pc(9) Class466 local9 = (Class466) this.aMap3.get(arg0);
			if (local9 != null) {
				return (Long) local9.anObject19;
			}
		}
		return (Long) this.anInterface51_1.method1460(arg0, (byte) 126);
	}

	@OriginalMember(owner = "client!abn", name = "o", descriptor = "(I)J", line = 36)
	@Override
	public long method771(@OriginalArg(0) int arg0) {
		if (this.aMap3 != null) {
			@Pc(9) Class466 local9 = (Class466) this.aMap3.get(arg0);
			if (local9 != null) {
				return (Long) local9.anObject19;
			}
		}
		return (Long) this.anInterface51_1.method1460(arg0, (byte) 38);
	}

	@OriginalMember(owner = "client!abn", name = "y", descriptor = "(I)J", line = 36)
	@Override
	public long method784(@OriginalArg(0) int arg0) {
		if (this.aMap3 != null) {
			@Pc(9) Class466 local9 = (Class466) this.aMap3.get(arg0);
			if (local9 != null) {
				return (Long) local9.anObject19;
			}
		}
		return (Long) this.anInterface51_1.method1460(arg0, (byte) 32);
	}

	@OriginalMember(owner = "client!abn", name = "k", descriptor = "(IJ)V", line = 44)
	@Override
	public void method787(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		if (this.aMap3 == null) {
			this.aMap3 = new HashMap();
			this.aMap3.put(arg0, new Class466(arg0, arg1));
			return;
		}
		@Pc(27) Class466 local27 = (Class466) this.aMap3.get(arg0);
		if (local27 == null) {
			this.aMap3.put(arg0, new Class466(arg0, arg1));
		} else {
			local27.anObject19 = arg1;
		}
	}

	@OriginalMember(owner = "client!abn", name = "q", descriptor = "(IJ)V", line = 44)
	@Override
	public void method785(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		if (this.aMap3 == null) {
			this.aMap3 = new HashMap();
			this.aMap3.put(arg0, new Class466(arg0, arg1));
			return;
		}
		@Pc(27) Class466 local27 = (Class466) this.aMap3.get(arg0);
		if (local27 == null) {
			this.aMap3.put(arg0, new Class466(arg0, arg1));
		} else {
			local27.anObject19 = arg1;
		}
	}

	@OriginalMember(owner = "client!abn", name = "f", descriptor = "(II)Ljava/lang/Object;", line = 56)
	@Override
	public Object method775(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aMap3 != null) {
			@Pc(9) Class466 local9 = (Class466) this.aMap3.get(arg0);
			if (local9 != null) {
				return local9.anObject19;
			}
		}
		return this.anInterface51_1.method1460(arg0, (byte) 47);
	}

	@OriginalMember(owner = "client!abn", name = "x", descriptor = "(I)Ljava/lang/Object;", line = 56)
	@Override
	public Object method786(@OriginalArg(0) int arg0) {
		if (this.aMap3 != null) {
			@Pc(9) Class466 local9 = (Class466) this.aMap3.get(arg0);
			if (local9 != null) {
				return local9.anObject19;
			}
		}
		return this.anInterface51_1.method1460(arg0, (byte) 10);
	}

	@OriginalMember(owner = "client!abn", name = "b", descriptor = "(I)Ljava/lang/Object;", line = 56)
	@Override
	public Object method793(@OriginalArg(0) int arg0) {
		if (this.aMap3 != null) {
			@Pc(9) Class466 local9 = (Class466) this.aMap3.get(arg0);
			if (local9 != null) {
				return local9.anObject19;
			}
		}
		return this.anInterface51_1.method1460(arg0, (byte) 77);
	}

	@OriginalMember(owner = "client!abn", name = "w", descriptor = "(ILjava/lang/Object;B)V", line = 64)
	@Override
	public void method776(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) byte arg2) {
		if (this.aMap3 == null) {
			this.aMap3 = new HashMap();
			this.aMap3.put(arg0, new Class466(arg0, arg1));
			return;
		}
		@Pc(27) Class466 local27 = (Class466) this.aMap3.get(arg0);
		if (local27 == null) {
			this.aMap3.put(arg0, new Class466(arg0, arg1));
		} else {
			local27.anObject19 = arg1;
		}
	}

	@OriginalMember(owner = "client!abn", name = "h", descriptor = "(ILjava/lang/Object;)V", line = 64)
	@Override
	public void method782(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1) {
		if (this.aMap3 == null) {
			this.aMap3 = new HashMap();
			this.aMap3.put(arg0, new Class466(arg0, arg1));
			return;
		}
		@Pc(27) Class466 local27 = (Class466) this.aMap3.get(arg0);
		if (local27 == null) {
			this.aMap3.put(arg0, new Class466(arg0, arg1));
		} else {
			local27.anObject19 = arg1;
		}
	}

	@OriginalMember(owner = "client!abn", name = "n", descriptor = "(JLjava/lang/String;B)I", line = 66)
	public static final int method795(@OriginalArg(0) long arg0, @OriginalArg(1) String arg1, @OriginalArg(2) byte arg2) {
		@Pc(3) Random local3 = new Random();
		@Pc(8) Packet local8 = new Packet(128);
		@Pc(13) Packet local13 = new Packet(128);
		@Pc(16) int[] local16 = new int[] { local3.nextInt(), local3.nextInt(), (int) (arg0 >> 32), (int) arg0 };
		local8.p1(10, (byte) 4);
		@Pc(44) int local44;
		for (local44 = 0; local44 < 4; local44++) {
			local8.p4(local3.nextInt(), (byte) -62);
		}
		local8.p4(local16[0], (byte) 51);
		local8.p4(local16[1], (byte) -56);
		local8.p8(arg0);
		local8.p8(0L);
		for (local44 = 0; local44 < 4; local44++) {
			local8.p4(local3.nextInt(), (byte) -61);
		}
		local8.rsaenc(Class630.aBigInteger7, Class630.aBigInteger8, (byte) -33);
		local13.p1(10, (byte) -48);
		for (local44 = 0; local44 < 3; local44++) {
			local13.p4(local3.nextInt(), (byte) 105);
		}
		local13.p8(local3.nextLong());
		local13.p6(local3.nextLong());
		Class314.method26940(local13, 1451401383);
		local13.p8(local3.nextLong());
		local13.rsaenc(Class630.aBigInteger7, Class630.aBigInteger8, (byte) -4);
		local44 = Packet.pjstrlen(arg1, -2064764933);
		if (local44 % 8 != 0) {
			local44 += 8 - local44 % 8;
		}
		@Pc(146) Packet local146 = new Packet(local44);
		local146.pjstr(arg1, -1839653749);
		local146.pos = local44 * -1445626955;
		local146.tinyenc(local16, 1548514198);
		@Pc(179) Packet local179 = new Packet(local13.pos * 212851357 + 5 + local8.pos * 212851357 + local146.pos * 212851357);
		local179.p1(2, (byte) -31);
		local179.p1(local8.pos * 212851357, (byte) -29);
		local179.pdata(local8.data, 0, local8.pos * 212851357, 2026842986);
		local179.p1(local13.pos * 212851357, (byte) -50);
		local179.pdata(local13.data, 0, local13.pos * 212851357, 2026842986);
		local179.p2(local146.pos * 212851357, 2125175357);
		local179.pdata(local146.data, 0, local146.pos * 212851357, 2026842986);
		@Pc(239) String local239 = Class669.method32941(local179.data, 1995793666);
		try {
			@Pc(254) URL local254 = new URL(Class119.method8605("services", false, -816530585) + "m=accountappeal/login.ws");
			@Pc(257) URLConnection local257 = local254.openConnection();
			local257.setDoInput(true);
			local257.setDoOutput(true);
			local257.setConnectTimeout(5000);
			@Pc(272) OutputStreamWriter local272 = new OutputStreamWriter(local257.getOutputStream());
			local272.write("data2=" + Class25_Sub2.method16018(local239, (byte) 73) + "&dest=" + Class25_Sub2.method16018("passwordchoice.ws", (byte) 73));
			local272.flush();
			@Pc(295) InputStream local295 = local257.getInputStream();
			local179 = new Packet(new byte[1000]);
			do {
				@Pc(316) int local316 = local295.read(local179.data, local179.pos * 212851357, 1000 - local179.pos * 212851357);
				if (local316 == -1) {
					local272.close();
					local295.close();
					@Pc(347) String local347 = new String(local179.data);
					if (local347.startsWith("OFFLINE")) {
						return 4;
					} else if (local347.startsWith("WRONG")) {
						return 7;
					} else if (local347.startsWith("RELOAD")) {
						return 3;
					} else if (local347.startsWith("Not permitted for social network accounts.")) {
						return 6;
					} else {
						local179.tinydec(local16, 1328909720);
						while (local179.pos * 212851357 > 0 && local179.data[local179.pos * 212851357 - 1] == 0) {
							local179.pos -= -1445626955;
						}
						local347 = new String(local179.data, 0, local179.pos * 212851357);
						if (Class89.method1600(local347, (byte) 16)) {
							Class338.method27464(local347, true, client.aBoolean596, (byte) -58);
							return 2;
						} else {
							return 5;
						}
					}
				}
				local179.pos += local316 * -1445626955;
			} while (local179.pos * 212851357 < 1000);
			return 5;
		} catch (@Pc(423) Throwable local423) {
			local423.printStackTrace();
			return 5;
		}
	}

	@OriginalMember(owner = "client!abn", name = "a", descriptor = "()V", line = 76)
	@Override
	public void method789() {
		if (this.aMap3 != null) {
			this.aMap3.clear();
		}
	}

	@OriginalMember(owner = "client!abn", name = "g", descriptor = "()V", line = 76)
	@Override
	public void method788() {
		if (this.aMap3 != null) {
			this.aMap3.clear();
		}
	}

	@OriginalMember(owner = "client!abn", name = "l", descriptor = "(I)V", line = 76)
	@Override
	public void method777(@OriginalArg(0) int arg0) {
		if (this.aMap3 != null) {
			this.aMap3.clear();
		}
	}

	@OriginalMember(owner = "client!abn", name = "i", descriptor = "(I)V", line = 80)
	@Override
	public void method791(@OriginalArg(0) int arg0) {
		if (this.aMap3 != null) {
			this.aMap3.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!abn", name = "u", descriptor = "(IB)V", line = 80)
	@Override
	public void method778(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (this.aMap3 != null) {
			this.aMap3.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!abn", name = "j", descriptor = "(I)V", line = 80)
	@Override
	public void method774(@OriginalArg(0) int arg0) {
		if (this.aMap3 != null) {
			this.aMap3.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!abn", name = "t", descriptor = "(I)V", line = 80)
	@Override
	public void method773(@OriginalArg(0) int arg0) {
		if (this.aMap3 != null) {
			this.aMap3.remove(arg0);
		}
	}

	@OriginalMember(owner = "client!abn", name = "p", descriptor = "()Ljava/util/Iterator;", line = 84)
	public Iterator method796() {
		return this.aMap3 == null ? Collections.emptyList().iterator() : this.aMap3.values().iterator();
	}

	@OriginalMember(owner = "client!abn", name = "iterator", descriptor = "()Ljava/util/Iterator;", line = 84)
	@Override
	public Iterator iterator() {
		return this.aMap3 == null ? Collections.emptyList().iterator() : this.aMap3.values().iterator();
	}

	@OriginalMember(owner = "client!abn", name = "d", descriptor = "()Ljava/util/Iterator;", line = 84)
	public Iterator method797() {
		return this.aMap3 == null ? Collections.emptyList().iterator() : this.aMap3.values().iterator();
	}

	@OriginalMember(owner = "client!abn", name = "c", descriptor = "()Ljava/util/Iterator;", line = 84)
	public Iterator method798() {
		return this.aMap3 == null ? Collections.emptyList().iterator() : this.aMap3.values().iterator();
	}

	@OriginalMember(owner = "client!abn", name = "adr", descriptor = "(Lclient!yf;I)V", line = 10138)
	static final void method799(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = client.aClass531ArrayArray1[local23][local13].method30434((byte) -64);
	}

	@OriginalMember(owner = "client!abn", name = "kl", descriptor = "(Lclient!hf;I)Lclient!hf;", line = 11810)
	static Class312 method800(@OriginalArg(0) Class312 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Class312 local2 = client.method25367(arg0);
		if (local2 == null) {
			local2 = arg0.aClass312_9;
		}
		return local2;
	}
}
