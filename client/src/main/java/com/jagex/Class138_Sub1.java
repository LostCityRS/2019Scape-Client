package com.jagex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aie")
public final class Class138_Sub1 extends Class138 {

	@OriginalMember(owner = "client!aie", name = "t", descriptor = "F")
	static final float aFloat130 = 2.0F;

	@OriginalMember(owner = "client!aie", name = "u", descriptor = "Z")
	volatile boolean aBoolean225 = false;

	@OriginalMember(owner = "client!aie", name = "i", descriptor = "Ljava/util/List;")
	List aList1 = new ArrayList();

	@OriginalMember(owner = "client!aie", name = "m", descriptor = "Ljava/lang/Runnable;")
	Runnable aRunnable1 = new Class569(this);

	@OriginalMember(owner = "client!aie", name = "o", descriptor = "Ljava/lang/Runnable;")
	Runnable aRunnable2 = new Class585(this);

	@OriginalMember(owner = "client!aie", name = "e", descriptor = "Lclient!mt;")
	Class425 aClass425_1 = new Class425(this);

	@OriginalMember(owner = "client!aie", name = "f", descriptor = "Ljava/util/HashMap;")
	HashMap aHashMap2 = new HashMap();

	@OriginalMember(owner = "client!aie", name = "l", descriptor = "Ljava/lang/Thread;")
	Thread aThread1;

	@OriginalMember(owner = "client!aie", name = "g", descriptor = "Ljava/lang/Thread;")
	Thread aThread2;

	@OriginalMember(owner = "client!aie", name = "lz", descriptor = "(B)V")
	static void method10718(@OriginalArg(0) byte arg0) {
		for (@Pc(1) int local1 = 0; local1 < 106; local1++) {
			client.aBooleanArray19[local1] = true;
		}
	}

	@OriginalMember(owner = "client!aie", name = "<init>", descriptor = "(Lclient!xv;)V")
	public Class138_Sub1(@OriginalArg(0) Class671 arg0) {
		@Pc(37) Iterator local37 = arg0.aHashMap13.keySet().iterator();
		@Pc(44) Class516 local44;
		while (local37.hasNext()) {
			local44 = (Class516) local37.next();
			this.aHashMap2.put(local44, new Class541[(Integer) arg0.aHashMap13.get(local44)]);
		}
		local37 = this.aHashMap2.keySet().iterator();
		while (local37.hasNext()) {
			local44 = (Class516) local37.next();
			@Pc(76) Class541[] local76 = (Class541[]) this.aHashMap2.get(local44);
			for (@Pc(78) int local78 = 0; local78 < local76.length; local78++) {
				@Pc(87) Class307 local87 = new Class307(2.0F);
				local87.method27280(0, Class449.aClass449_2, Class420.aClass420_3, 2);
				local76[local78] = new Class541(local44, 8192, 3, local87, this);
			}
		}
		@Pc(114) Class575 local114 = new Class575(this, 44100.0F, 32768);
		@Pc(121) Class575 local121 = new Class575(this, 22050.0F, 16384);
		this.aList1.add(local114);
		this.aList1.add(local121);
		this.aThread1 = new Thread(this.aRunnable2);
		this.aThread2 = new Thread(this.aRunnable1);
		this.aThread1.setPriority(10);
		this.aThread2.setPriority(10);
		this.aThread1.start();
		this.aThread2.start();
	}

	@OriginalMember(owner = "client!aie", name = "a", descriptor = "(Ljava/lang/Object;)V")
	@Override
	public void method11517(@OriginalArg(0) Object arg0) {
		if (arg0 == null || !(arg0 instanceof Class571)) {
			return;
		}
		@Pc(8) Class571 local8 = (Class571) arg0;
		@Pc(12) Class575 local12 = local8.aClass575_1;
		synchronized (local8.aClass575_1) {
			local8.aClass575_1.method31775(local8, 927198509);
		}
	}

	@OriginalMember(owner = "client!aie", name = "t", descriptor = "(B)V")
	@Override
	public void method11509(@OriginalArg(0) byte arg0) {
		if (this.aClass425_1 != null) {
			this.aClass425_1.method29047(1575670646);
		}
		@Pc(11) Iterator local11 = this.aHashMap2.keySet().iterator();
		while (true) {
			@Pc(25) Class541[] local25;
			@Pc(68) int local68;
			@Pc(61) byte local61;
			do {
				if (!local11.hasNext()) {
					return;
				}
				@Pc(18) Class516 local18 = (Class516) local11.next();
				local25 = (Class541[]) this.aHashMap2.get(local18);
				if (!local18.aBoolean886) {
					@Pc(30) boolean local30 = false;
					for (@Pc(32) int local32 = 0; local32 < local25.length; local32++) {
						local25[local32].method31080((byte) 96);
						local30 |= local25[local32].method31079((byte) 17);
					}
					if (local30) {
						Arrays.sort(local25, new Class579(this));
					}
				}
				local61 = 6;
				@Pc(63) boolean local63 = false;
				local68 = local25.length - 1;
				while (!local63) {
					@Pc(77) float local77 = local25[local68].method31077(2133614899);
					@Pc(83) Class515 local83 = local25[local68].method31063((byte) -76);
					if (local77 >= 0.0F) {
						local63 = true;
					} else if (local83 == Class515.aClass515_3 || Class515.aClass515_4 == local83 || local83 == Class515.aClass515_7) {
						local25[local68].method31073(-825189621);
					}
					local68--;
					if (local68 < 0) {
						local63 = true;
					}
				}
			} while (local68 < local25.length - local61);
			while (local68 >= local25.length - local61) {
				@Pc(128) Class515 local128 = local25[local68].method31063((byte) -93);
				if (local128 == Class515.aClass515_3) {
					local25[local68].method31073(-825189621);
				}
				local68--;
			}
		}
	}

	@OriginalMember(owner = "client!aie", name = "l", descriptor = "(Ljava/lang/Object;I)I")
	@Override
	public int method11513(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		if (arg0 == null || !(arg0 instanceof Class571)) {
			return 0;
		}
		@Pc(8) Class571 local8 = (Class571) arg0;
		@Pc(12) Class575 local12 = local8.aClass575_1;
		synchronized (local8.aClass575_1) {
			return local8.method31727(-262737782);
		}
	}

	@OriginalMember(owner = "client!aie", name = "k", descriptor = "(Ljava/lang/Object;[BII)V")
	@Override
	public void method11511(@OriginalArg(0) Object arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 == null || !(arg0 instanceof Class571)) {
			return;
		}
		@Pc(7) Class571 local7 = (Class571) arg0;
		@Pc(11) Class575 local11 = local7.aClass575_1;
		synchronized (local7.aClass575_1) {
			local7.method31729(arg1, arg2, arg3, (byte) 31);
		}
	}

	@OriginalMember(owner = "client!aie", name = "w", descriptor = "(Lclient!mb;)Ljava/lang/Object;")
	@Override
	Object method11522(@OriginalArg(0) Class413 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!aie", name = "e", descriptor = "(Ljava/lang/Object;I)V")
	@Override
	public void method11524(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		if (arg0 == null || !(arg0 instanceof Class571)) {
			return;
		}
		@Pc(8) Class571 local8 = (Class571) arg0;
		@Pc(12) Class575 local12 = local8.aClass575_1;
		synchronized (local8.aClass575_1) {
			local8.aClass575_1.method31775(local8, 1478773026);
		}
	}

	@OriginalMember(owner = "client!aie", name = "u", descriptor = "(Ljava/lang/Object;[BIII)V")
	@Override
	public void method11512(@OriginalArg(0) Object arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 == null || !(arg0 instanceof Class571)) {
			return;
		}
		@Pc(7) Class571 local7 = (Class571) arg0;
		@Pc(11) Class575 local11 = local7.aClass575_1;
		synchronized (local7.aClass575_1) {
			local7.method31729(arg1, arg2, arg3, (byte) -24);
		}
	}

	@OriginalMember(owner = "client!aie", name = "g", descriptor = "(Lclient!qr;I)Lclient!ry;")
	@Override
	public Class541 method11508(@OriginalArg(0) Class516 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) HashMap local3 = this.aHashMap2;
		synchronized (this.aHashMap2) {
			@Pc(11) Class541[] local11 = (Class541[]) this.aHashMap2.get(arg0);
			if (local11 == null) {
				return null;
			}
			for (@Pc(20) int local20 = 0; local20 < local11.length; local20++) {
				@Pc(28) Class541 local28 = local11[local20];
				@Pc(32) Class515 local32 = local28.method31063((byte) -51);
				if (Class515.aClass515_2 == local32) {
					local28.method31067((byte) 31);
					return local28;
				}
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!aie", name = "i", descriptor = "(Lclient!mb;I)Ljava/lang/Object;")
	@Override
	Object method11515(@OriginalArg(0) Class413 arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!aie", name = "m", descriptor = "(I)Lclient!mt;")
	@Override
	public Class425 method11516(@OriginalArg(0) int arg0) {
		return this.aClass425_1;
	}

	@OriginalMember(owner = "client!aie", name = "v", descriptor = "(IILclient!nv;Lclient!mm;IF)Ljava/lang/Object;")
	@Override
	public Object method11529(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class449 arg2, @OriginalArg(3) Class420 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		@Pc(7) Class575 local7 = this.method10712((float) arg1 * arg5, 108500832);
		@Pc(43) Class571 local43 = new Class571(this, local7, arg4, arg5 * (float) arg1, arg2.anInt4888 * -1033265337, arg0 < 2 ? 2 : arg0, Class449.aClass449_2 == arg2 || arg2 == Class449.aClass449_4, arg3 == Class420.aClass420_2);
		@Pc(47) Class575 local47 = local43.aClass575_1;
		synchronized (local43.aClass575_1) {
			local43.aClass575_1.method31774(local43, -469610362);
			return local43;
		}
	}

	@OriginalMember(owner = "client!aie", name = "x", descriptor = "(Lclient!mb;)Ljava/lang/Object;")
	@Override
	Object method11521(@OriginalArg(0) Class413 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!aie", name = "o", descriptor = "(I)V")
	@Override
	public void method11528(@OriginalArg(0) int arg0) {
		@Pc(3) HashMap local3 = this.method10711(47756659);
		synchronized (local3) {
			@Pc(11) Iterator local11 = local3.keySet().iterator();
			while (local11.hasNext()) {
				@Pc(18) Class516 local18 = (Class516) local11.next();
				@Pc(24) Class541[] local24 = (Class541[]) local3.get(local18);
				for (@Pc(26) int local26 = 0; local26 < local24.length; local26++) {
					if (local24[local26].method31063((byte) -11) != Class515.aClass515_2) {
						local24[local26].method31073(-825189621);
						local24[local26].method31146(1896589581);
					}
				}
			}
		}
		@Pc(60) boolean local60 = false;
		while (!local60) {
			local60 = true;
			synchronized (local3) {
				@Pc(72) Iterator local72 = local3.keySet().iterator();
				while (local72.hasNext()) {
					@Pc(79) Class516 local79 = (Class516) local72.next();
					@Pc(85) Class541[] local85 = (Class541[]) local3.get(local79);
					for (@Pc(87) int local87 = 0; local87 < local85.length; local87++) {
						if (local85[local87].method31063((byte) -3) != Class515.aClass515_2) {
							local85[local87].method31080((byte) -32);
							local60 = false;
						}
					}
				}
			}
			Class217.method25866(10L);
		}
		this.aBoolean225 = true;
		try {
			this.aThread1.join();
		} catch (@Pc(127) InterruptedException local127) {
			local127.printStackTrace();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(134) InterruptedException local134) {
			local134.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!aie", name = "s", descriptor = "(Ljava/lang/Object;[BII)V")
	@Override
	public void method11520(@OriginalArg(0) Object arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 == null || !(arg0 instanceof Class571)) {
			return;
		}
		@Pc(7) Class571 local7 = (Class571) arg0;
		@Pc(11) Class575 local11 = local7.aClass575_1;
		synchronized (local7.aClass575_1) {
			local7.method31729(arg1, arg2, arg3, (byte) -84);
		}
	}

	@OriginalMember(owner = "client!aie", name = "r", descriptor = "(Lclient!mb;)Ljava/lang/Object;")
	@Override
	Object method11523(@OriginalArg(0) Class413 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!aie", name = "f", descriptor = "(IILclient!nv;Lclient!mm;IFI)Ljava/lang/Object;")
	@Override
	public Object method11532(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class449 arg2, @OriginalArg(3) Class420 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6) {
		@Pc(7) Class575 local7 = this.method10712((float) arg1 * arg5, -1171404429);
		@Pc(43) Class571 local43 = new Class571(this, local7, arg4, arg5 * (float) arg1, arg2.anInt4888 * -1033265337, arg0 < 2 ? 2 : arg0, Class449.aClass449_2 == arg2 || arg2 == Class449.aClass449_4, arg3 == Class420.aClass420_2);
		@Pc(47) Class575 local47 = local43.aClass575_1;
		synchronized (local43.aClass575_1) {
			local43.aClass575_1.method31774(local43, -465012895);
			return local43;
		}
	}

	@OriginalMember(owner = "client!aie", name = "j", descriptor = "(Ljava/lang/Object;)I")
	@Override
	public int method11514(@OriginalArg(0) Object arg0) {
		if (arg0 == null || !(arg0 instanceof Class571)) {
			return 0;
		}
		@Pc(8) Class571 local8 = (Class571) arg0;
		@Pc(12) Class575 local12 = local8.aClass575_1;
		synchronized (local8.aClass575_1) {
			return local8.method31727(-1755312753);
		}
	}

	@OriginalMember(owner = "client!aie", name = "d", descriptor = "()V")
	@Override
	public void method11526() {
		if (this.aClass425_1 != null) {
			this.aClass425_1.method29047(1129646576);
		}
		@Pc(11) Iterator local11 = this.aHashMap2.keySet().iterator();
		while (true) {
			@Pc(25) Class541[] local25;
			@Pc(68) int local68;
			@Pc(61) byte local61;
			do {
				if (!local11.hasNext()) {
					return;
				}
				@Pc(18) Class516 local18 = (Class516) local11.next();
				local25 = (Class541[]) this.aHashMap2.get(local18);
				if (!local18.aBoolean886) {
					@Pc(30) boolean local30 = false;
					for (@Pc(32) int local32 = 0; local32 < local25.length; local32++) {
						local25[local32].method31080((byte) 28);
						local30 |= local25[local32].method31079((byte) 34);
					}
					if (local30) {
						Arrays.sort(local25, new Class579(this));
					}
				}
				local61 = 6;
				@Pc(63) boolean local63 = false;
				local68 = local25.length - 1;
				while (!local63) {
					@Pc(77) float local77 = local25[local68].method31077(2113094208);
					@Pc(83) Class515 local83 = local25[local68].method31063((byte) -73);
					if (local77 >= 0.0F) {
						local63 = true;
					} else if (local83 == Class515.aClass515_3 || Class515.aClass515_4 == local83 || local83 == Class515.aClass515_7) {
						local25[local68].method31073(-825189621);
					}
					local68--;
					if (local68 < 0) {
						local63 = true;
					}
				}
			} while (local68 < local25.length - local61);
			while (local68 >= local25.length - local61) {
				@Pc(128) Class515 local128 = local25[local68].method31063((byte) -47);
				if (local128 == Class515.aClass515_3) {
					local25[local68].method31073(-825189621);
				}
				local68--;
			}
		}
	}

	@OriginalMember(owner = "client!aie", name = "q", descriptor = "()Lclient!mt;")
	@Override
	public Class425 method11518() {
		return this.aClass425_1;
	}

	@OriginalMember(owner = "client!aie", name = "ax", descriptor = "(I)Ljava/util/HashMap;")
	HashMap method10711(@OriginalArg(0) int arg0) {
		return this.aHashMap2;
	}

	@OriginalMember(owner = "client!aie", name = "p", descriptor = "(IILclient!nv;Lclient!mm;IF)Ljava/lang/Object;")
	@Override
	public Object method11510(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class449 arg2, @OriginalArg(3) Class420 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		@Pc(7) Class575 local7 = this.method10712((float) arg1 * arg5, 384221052);
		@Pc(43) Class571 local43 = new Class571(this, local7, arg4, arg5 * (float) arg1, arg2.anInt4888 * -1033265337, arg0 < 2 ? 2 : arg0, Class449.aClass449_2 == arg2 || arg2 == Class449.aClass449_4, arg3 == Class420.aClass420_2);
		@Pc(47) Class575 local47 = local43.aClass575_1;
		synchronized (local43.aClass575_1) {
			local43.aClass575_1.method31774(local43, -282215108);
			return local43;
		}
	}

	@OriginalMember(owner = "client!aie", name = "z", descriptor = "(IILclient!nv;Lclient!mm;IF)Ljava/lang/Object;")
	@Override
	public Object method11527(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class449 arg2, @OriginalArg(3) Class420 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		@Pc(7) Class575 local7 = this.method10712((float) arg1 * arg5, -1152860584);
		@Pc(43) Class571 local43 = new Class571(this, local7, arg4, arg5 * (float) arg1, arg2.anInt4888 * -1033265337, arg0 < 2 ? 2 : arg0, Class449.aClass449_2 == arg2 || arg2 == Class449.aClass449_4, arg3 == Class420.aClass420_2);
		@Pc(47) Class575 local47 = local43.aClass575_1;
		synchronized (local43.aClass575_1) {
			local43.aClass575_1.method31774(local43, -508995469);
			return local43;
		}
	}

	@OriginalMember(owner = "client!aie", name = "ay", descriptor = "(FI)Lclient!tl;")
	Class575 method10712(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1) {
		@Pc(1) float local1 = -1.0F;
		@Pc(3) float local3 = Float.MAX_VALUE;
		@Pc(5) Class575 local5 = null;
		@Pc(9) Iterator local9 = this.aList1.iterator();
		while (true) {
			@Pc(16) Class575 local16;
			@Pc(19) float local19;
			@Pc(24) float local24;
			do {
				if (!local9.hasNext()) {
					return local5;
				}
				local16 = (Class575) local9.next();
				local19 = local16.aFloat335;
				local24 = Math.abs(local19 - arg0);
			} while (!(local1 < 0.0F) && !(local24 < local3));
			local1 = local19;
			local3 = local24;
			local5 = local16;
		}
	}

	@OriginalMember(owner = "client!aie", name = "h", descriptor = "()V")
	@Override
	public void method11525() {
		if (this.aClass425_1 != null) {
			this.aClass425_1.method29047(1262557217);
		}
		@Pc(11) Iterator local11 = this.aHashMap2.keySet().iterator();
		while (true) {
			@Pc(25) Class541[] local25;
			@Pc(68) int local68;
			@Pc(61) byte local61;
			do {
				if (!local11.hasNext()) {
					return;
				}
				@Pc(18) Class516 local18 = (Class516) local11.next();
				local25 = (Class541[]) this.aHashMap2.get(local18);
				if (!local18.aBoolean886) {
					@Pc(30) boolean local30 = false;
					for (@Pc(32) int local32 = 0; local32 < local25.length; local32++) {
						local25[local32].method31080((byte) 99);
						local30 |= local25[local32].method31079((byte) 49);
					}
					if (local30) {
						Arrays.sort(local25, new Class579(this));
					}
				}
				local61 = 6;
				@Pc(63) boolean local63 = false;
				local68 = local25.length - 1;
				while (!local63) {
					@Pc(77) float local77 = local25[local68].method31077(2100638719);
					@Pc(83) Class515 local83 = local25[local68].method31063((byte) -43);
					if (local77 >= 0.0F) {
						local63 = true;
					} else if (local83 == Class515.aClass515_3 || Class515.aClass515_4 == local83 || local83 == Class515.aClass515_7) {
						local25[local68].method31073(-825189621);
					}
					local68--;
					if (local68 < 0) {
						local63 = true;
					}
				}
			} while (local68 < local25.length - local61);
			while (local68 >= local25.length - local61) {
				@Pc(128) Class515 local128 = local25[local68].method31063((byte) -101);
				if (local128 == Class515.aClass515_3) {
					local25[local68].method31073(-825189621);
				}
				local68--;
			}
		}
	}

	@OriginalMember(owner = "client!aie", name = "y", descriptor = "(Lclient!qr;)Lclient!ry;")
	@Override
	public Class541 method11530(@OriginalArg(0) Class516 arg0) {
		@Pc(3) HashMap local3 = this.aHashMap2;
		synchronized (this.aHashMap2) {
			@Pc(11) Class541[] local11 = (Class541[]) this.aHashMap2.get(arg0);
			if (local11 == null) {
				return null;
			}
			for (@Pc(20) int local20 = 0; local20 < local11.length; local20++) {
				@Pc(28) Class541 local28 = local11[local20];
				@Pc(32) Class515 local32 = local28.method31063((byte) -103);
				if (Class515.aClass515_2 == local32) {
					local28.method31067((byte) 49);
					return local28;
				}
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!aie", name = "n", descriptor = "(Lclient!qr;)Lclient!ry;")
	@Override
	public Class541 method11531(@OriginalArg(0) Class516 arg0) {
		@Pc(3) HashMap local3 = this.aHashMap2;
		synchronized (this.aHashMap2) {
			@Pc(11) Class541[] local11 = (Class541[]) this.aHashMap2.get(arg0);
			if (local11 == null) {
				return null;
			}
			for (@Pc(20) int local20 = 0; local20 < local11.length; local20++) {
				@Pc(28) Class541 local28 = local11[local20];
				@Pc(32) Class515 local32 = local28.method31063((byte) -78);
				if (Class515.aClass515_2 == local32) {
					local28.method31067((byte) 34);
					return local28;
				}
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!aie", name = "c", descriptor = "(Lclient!qr;)Lclient!ry;")
	@Override
	public Class541 method11519(@OriginalArg(0) Class516 arg0) {
		@Pc(3) HashMap local3 = this.aHashMap2;
		synchronized (this.aHashMap2) {
			@Pc(11) Class541[] local11 = (Class541[]) this.aHashMap2.get(arg0);
			if (local11 == null) {
				return null;
			}
			for (@Pc(20) int local20 = 0; local20 < local11.length; local20++) {
				@Pc(28) Class541 local28 = local11[local20];
				@Pc(32) Class515 local32 = local28.method31063((byte) -75);
				if (Class515.aClass515_2 == local32) {
					local28.method31067((byte) -30);
					return local28;
				}
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!aie", name = "b", descriptor = "()V")
	@Override
	public void method11533() {
		@Pc(3) HashMap local3 = this.method10711(-906101242);
		synchronized (local3) {
			@Pc(11) Iterator local11 = local3.keySet().iterator();
			while (local11.hasNext()) {
				@Pc(18) Class516 local18 = (Class516) local11.next();
				@Pc(24) Class541[] local24 = (Class541[]) local3.get(local18);
				for (@Pc(26) int local26 = 0; local26 < local24.length; local26++) {
					if (local24[local26].method31063((byte) -9) != Class515.aClass515_2) {
						local24[local26].method31073(-825189621);
						local24[local26].method31146(1896589581);
					}
				}
			}
		}
		@Pc(60) boolean local60 = false;
		while (!local60) {
			local60 = true;
			synchronized (local3) {
				@Pc(72) Iterator local72 = local3.keySet().iterator();
				while (local72.hasNext()) {
					@Pc(79) Class516 local79 = (Class516) local72.next();
					@Pc(85) Class541[] local85 = (Class541[]) local3.get(local79);
					for (@Pc(87) int local87 = 0; local87 < local85.length; local87++) {
						if (local85[local87].method31063((byte) -120) != Class515.aClass515_2) {
							local85[local87].method31080((byte) -79);
							local60 = false;
						}
					}
				}
			}
			Class217.method25866(10L);
		}
		this.aBoolean225 = true;
		try {
			this.aThread1.join();
		} catch (@Pc(127) InterruptedException local127) {
			local127.printStackTrace();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(134) InterruptedException local134) {
			local134.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!aie", name = "ai", descriptor = "()Ljava/util/HashMap;")
	HashMap method10713() {
		return this.aHashMap2;
	}

	@OriginalMember(owner = "client!aie", name = "aq", descriptor = "()Ljava/util/HashMap;")
	HashMap method10714() {
		return this.aHashMap2;
	}

	@OriginalMember(owner = "client!aie", name = "ao", descriptor = "()Ljava/util/HashMap;")
	HashMap method10715() {
		return this.aHashMap2;
	}

	@OriginalMember(owner = "client!aie", name = "aj", descriptor = "()Ljava/util/HashMap;")
	HashMap method10716() {
		return this.aHashMap2;
	}

	@OriginalMember(owner = "client!aie", name = "ac", descriptor = "(F)Lclient!tl;")
	Class575 method10717(@OriginalArg(0) float arg0) {
		@Pc(1) float local1 = -1.0F;
		@Pc(3) float local3 = Float.MAX_VALUE;
		@Pc(5) Class575 local5 = null;
		@Pc(9) Iterator local9 = this.aList1.iterator();
		while (true) {
			@Pc(16) Class575 local16;
			@Pc(19) float local19;
			@Pc(24) float local24;
			do {
				if (!local9.hasNext()) {
					return local5;
				}
				local16 = (Class575) local9.next();
				local19 = local16.aFloat335;
				local24 = Math.abs(local19 - arg0);
			} while (!(local1 < 0.0F) && !(local24 < local3));
			local1 = local19;
			local3 = local24;
			local5 = local16;
		}
	}
}
