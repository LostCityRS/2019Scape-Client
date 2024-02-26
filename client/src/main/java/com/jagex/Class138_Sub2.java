package com.jagex;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aiq")
public final class Class138_Sub2 extends Class138 {

	@OriginalMember(owner = "client!aiq", name = "t", descriptor = "F")
	static final float aFloat134 = 2.0F;

	@OriginalMember(owner = "client!aiq", name = "u", descriptor = "Z")
	volatile boolean aBoolean240 = false;

	@OriginalMember(owner = "client!aiq", name = "i", descriptor = "J")
	long aLong48 = Class303.method27111((byte) 34) * -1933457669006000555L;

	@OriginalMember(owner = "client!aiq", name = "m", descriptor = "Ljava/lang/Runnable;")
	Runnable aRunnable3 = new Class255(this);

	@OriginalMember(owner = "client!aiq", name = "o", descriptor = "Ljava/lang/Runnable;")
	Runnable aRunnable4 = new Class241(this);

	@OriginalMember(owner = "client!aiq", name = "e", descriptor = "Lclient!mt;")
	Class425 aClass425_2 = new Class425(this);

	@OriginalMember(owner = "client!aiq", name = "f", descriptor = "Ljava/util/HashMap;")
	HashMap aHashMap3 = new HashMap();

	@OriginalMember(owner = "client!aiq", name = "l", descriptor = "Ljava/lang/Thread;")
	Thread aThread3;

	@OriginalMember(owner = "client!aiq", name = "g", descriptor = "Ljava/lang/Thread;")
	Thread aThread4;

	@OriginalMember(owner = "client!aiq", name = "t", descriptor = "(Lclient!pf;Lclient!pf;IB)V")
	public static void method11541(@OriginalArg(0) Class480 arg0, @OriginalArg(1) Class480 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		Class103_Sub7.aClass480_19 = arg0;
		Class337.aClass480_96 = arg1;
	}

	@OriginalMember(owner = "client!aiq", name = "<init>", descriptor = "(Lclient!xv;)V")
	public Class138_Sub2(@OriginalArg(0) Class671 arg0) {
		@Pc(38) Iterator local38 = arg0.aHashMap13.keySet().iterator();
		@Pc(45) Class516 local45;
		while (local38.hasNext()) {
			local45 = (Class516) local38.next();
			this.aHashMap3.put(local45, new Class541[(Integer) arg0.aHashMap13.get(local45)]);
		}
		local38 = this.aHashMap3.keySet().iterator();
		while (local38.hasNext()) {
			local45 = (Class516) local38.next();
			@Pc(77) Class541[] local77 = (Class541[]) this.aHashMap3.get(local45);
			for (@Pc(79) int local79 = 0; local79 < local77.length; local79++) {
				@Pc(88) Class307 local88 = new Class307(2.0F);
				local88.method27280(0, Class449.aClass449_2, Class420.aClass420_3, 2);
				local77[local79] = new Class541(local45, 32768, 3, local88, this);
			}
		}
		this.aThread3 = new Thread(this.aRunnable4);
		this.aThread4 = new Thread(this.aRunnable3);
		this.aThread3.setPriority(1);
		this.aThread4.setPriority(1);
		this.aThread3.start();
		this.aThread4.start();
	}

	@OriginalMember(owner = "client!aiq", name = "ay", descriptor = "()Ljava/util/HashMap;")
	HashMap method11539() {
		return this.aHashMap3;
	}

	@OriginalMember(owner = "client!aiq", name = "k", descriptor = "(Ljava/lang/Object;[BII)V")
	@Override
	public void method11511(@OriginalArg(0) Object arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!aiq", name = "t", descriptor = "(B)V")
	@Override
	public void method11509(@OriginalArg(0) byte arg0) {
		if (this.aClass425_2 != null) {
			this.aClass425_2.method29047(243891957);
		}
		@Pc(11) Iterator local11 = this.aHashMap3.keySet().iterator();
		while (true) {
			@Pc(25) Class541[] local25;
			@Pc(68) int local68;
			@Pc(61) byte local61;
			do {
				if (!local11.hasNext()) {
					return;
				}
				@Pc(18) Class516 local18 = (Class516) local11.next();
				local25 = (Class541[]) this.aHashMap3.get(local18);
				if (!local18.aBoolean886) {
					@Pc(30) boolean local30 = false;
					for (@Pc(32) int local32 = 0; local32 < local25.length; local32++) {
						local25[local32].method31080((byte) -52);
						local30 |= local25[local32].method31079((byte) -79);
					}
					if (local30) {
						Arrays.sort(local25, new Class242(this));
					}
				}
				local61 = 3;
				@Pc(63) boolean local63 = false;
				local68 = local25.length - 1;
				while (!local63) {
					@Pc(77) float local77 = local25[local68].method31077(2097517893);
					@Pc(83) Class515 local83 = local25[local68].method31063((byte) -45);
					if (local77 >= 0.0F) {
						local63 = true;
					} else if (local83 == Class515.aClass515_3 || local83 == Class515.aClass515_4 || local83 == Class515.aClass515_7) {
						local25[local68].method31073(-825189621);
					}
					local68--;
					if (local68 < 0) {
						local63 = true;
					}
				}
			} while (local68 < local25.length - local61);
			while (local68 >= local25.length - local61) {
				@Pc(128) Class515 local128 = local25[local68].method31063((byte) -87);
				if (local128 == Class515.aClass515_3) {
					local25[local68].method31073(-825189621);
				}
				local68--;
			}
		}
	}

	@OriginalMember(owner = "client!aiq", name = "l", descriptor = "(Ljava/lang/Object;I)I")
	@Override
	public int method11513(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		@Pc(2) long local2 = Class303.method27111((byte) 36);
		@Pc(15) int local15 = (int) (180000.0F / ((float) (local2 - this.aLong48 * 654637171565432573L) / 1000.0F));
		this.aLong48 = local2 * -1933457669006000555L;
		return local15;
	}

	@OriginalMember(owner = "client!aiq", name = "f", descriptor = "(IILclient!nv;Lclient!mm;IFI)Ljava/lang/Object;")
	@Override
	public Object method11532(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class449 arg2, @OriginalArg(3) Class420 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6) {
		return new Object();
	}

	@OriginalMember(owner = "client!aiq", name = "e", descriptor = "(Ljava/lang/Object;I)V")
	@Override
	public void method11524(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aiq", name = "u", descriptor = "(Ljava/lang/Object;[BIII)V")
	@Override
	public void method11512(@OriginalArg(0) Object arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!aiq", name = "g", descriptor = "(Lclient!qr;I)Lclient!ry;")
	@Override
	public Class541 method11508(@OriginalArg(0) Class516 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) HashMap local3 = this.aHashMap3;
		synchronized (this.aHashMap3) {
			@Pc(11) Class541[] local11 = (Class541[]) this.aHashMap3.get(arg0);
			if (local11 == null) {
				return null;
			}
			for (@Pc(20) int local20 = 0; local20 < local11.length; local20++) {
				@Pc(28) Class541 local28 = local11[local20];
				@Pc(32) Class515 local32 = local28.method31063((byte) -9);
				if (local32 == Class515.aClass515_2) {
					local28.method31067((byte) 2);
					return local28;
				}
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!aiq", name = "i", descriptor = "(Lclient!mb;I)Ljava/lang/Object;")
	@Override
	Object method11515(@OriginalArg(0) Class413 arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!aiq", name = "m", descriptor = "(I)Lclient!mt;")
	@Override
	public Class425 method11516(@OriginalArg(0) int arg0) {
		return this.aClass425_2;
	}

	@OriginalMember(owner = "client!aiq", name = "y", descriptor = "(Lclient!qr;)Lclient!ry;")
	@Override
	public Class541 method11530(@OriginalArg(0) Class516 arg0) {
		@Pc(3) HashMap local3 = this.aHashMap3;
		synchronized (this.aHashMap3) {
			@Pc(11) Class541[] local11 = (Class541[]) this.aHashMap3.get(arg0);
			if (local11 == null) {
				return null;
			}
			for (@Pc(20) int local20 = 0; local20 < local11.length; local20++) {
				@Pc(28) Class541 local28 = local11[local20];
				@Pc(32) Class515 local32 = local28.method31063((byte) -125);
				if (local32 == Class515.aClass515_2) {
					local28.method31067((byte) 35);
					return local28;
				}
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!aiq", name = "ax", descriptor = "(I)Ljava/util/HashMap;")
	HashMap method11540(@OriginalArg(0) int arg0) {
		return this.aHashMap3;
	}

	@OriginalMember(owner = "client!aiq", name = "j", descriptor = "(Ljava/lang/Object;)I")
	@Override
	public int method11514(@OriginalArg(0) Object arg0) {
		@Pc(2) long local2 = Class303.method27111((byte) 106);
		@Pc(15) int local15 = (int) (180000.0F / ((float) (local2 - this.aLong48 * 654637171565432573L) / 1000.0F));
		this.aLong48 = local2 * -1933457669006000555L;
		return local15;
	}

	@OriginalMember(owner = "client!aiq", name = "s", descriptor = "(Ljava/lang/Object;[BII)V")
	@Override
	public void method11520(@OriginalArg(0) Object arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!aiq", name = "a", descriptor = "(Ljava/lang/Object;)V")
	@Override
	public void method11517(@OriginalArg(0) Object arg0) {
	}

	@OriginalMember(owner = "client!aiq", name = "x", descriptor = "(Lclient!mb;)Ljava/lang/Object;")
	@Override
	Object method11521(@OriginalArg(0) Class413 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!aiq", name = "w", descriptor = "(Lclient!mb;)Ljava/lang/Object;")
	@Override
	Object method11522(@OriginalArg(0) Class413 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!aiq", name = "b", descriptor = "()V")
	@Override
	public void method11533() {
		@Pc(3) HashMap local3 = this.method11540(1087326933);
		synchronized (local3) {
			@Pc(11) Iterator local11 = local3.keySet().iterator();
			while (local11.hasNext()) {
				@Pc(18) Class516 local18 = (Class516) local11.next();
				@Pc(24) Class541[] local24 = (Class541[]) local3.get(local18);
				for (@Pc(26) int local26 = 0; local26 < local24.length; local26++) {
					if (local24[local26].method31063((byte) -12) != Class515.aClass515_2) {
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
						if (local85[local87].method31063((byte) -26) != Class515.aClass515_2) {
							local85[local87].method31080((byte) -39);
							local60 = false;
						}
					}
				}
			}
			Class217.method25866(10L);
		}
		this.aBoolean240 = true;
		try {
			this.aThread3.join();
		} catch (@Pc(127) InterruptedException local127) {
			local127.printStackTrace();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(134) InterruptedException local134) {
			local134.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!aiq", name = "q", descriptor = "()Lclient!mt;")
	@Override
	public Class425 method11518() {
		return this.aClass425_2;
	}

	@OriginalMember(owner = "client!aiq", name = "h", descriptor = "()V")
	@Override
	public void method11525() {
		if (this.aClass425_2 != null) {
			this.aClass425_2.method29047(-395735070);
		}
		@Pc(11) Iterator local11 = this.aHashMap3.keySet().iterator();
		while (true) {
			@Pc(25) Class541[] local25;
			@Pc(68) int local68;
			@Pc(61) byte local61;
			do {
				if (!local11.hasNext()) {
					return;
				}
				@Pc(18) Class516 local18 = (Class516) local11.next();
				local25 = (Class541[]) this.aHashMap3.get(local18);
				if (!local18.aBoolean886) {
					@Pc(30) boolean local30 = false;
					for (@Pc(32) int local32 = 0; local32 < local25.length; local32++) {
						local25[local32].method31080((byte) -85);
						local30 |= local25[local32].method31079((byte) 9);
					}
					if (local30) {
						Arrays.sort(local25, new Class242(this));
					}
				}
				local61 = 3;
				@Pc(63) boolean local63 = false;
				local68 = local25.length - 1;
				while (!local63) {
					@Pc(77) float local77 = local25[local68].method31077(2095873445);
					@Pc(83) Class515 local83 = local25[local68].method31063((byte) -41);
					if (local77 >= 0.0F) {
						local63 = true;
					} else if (local83 == Class515.aClass515_3 || local83 == Class515.aClass515_4 || local83 == Class515.aClass515_7) {
						local25[local68].method31073(-825189621);
					}
					local68--;
					if (local68 < 0) {
						local63 = true;
					}
				}
			} while (local68 < local25.length - local61);
			while (local68 >= local25.length - local61) {
				@Pc(128) Class515 local128 = local25[local68].method31063((byte) -46);
				if (local128 == Class515.aClass515_3) {
					local25[local68].method31073(-825189621);
				}
				local68--;
			}
		}
	}

	@OriginalMember(owner = "client!aiq", name = "d", descriptor = "()V")
	@Override
	public void method11526() {
		if (this.aClass425_2 != null) {
			this.aClass425_2.method29047(1073923225);
		}
		@Pc(11) Iterator local11 = this.aHashMap3.keySet().iterator();
		while (true) {
			@Pc(25) Class541[] local25;
			@Pc(68) int local68;
			@Pc(61) byte local61;
			do {
				if (!local11.hasNext()) {
					return;
				}
				@Pc(18) Class516 local18 = (Class516) local11.next();
				local25 = (Class541[]) this.aHashMap3.get(local18);
				if (!local18.aBoolean886) {
					@Pc(30) boolean local30 = false;
					for (@Pc(32) int local32 = 0; local32 < local25.length; local32++) {
						local25[local32].method31080((byte) 47);
						local30 |= local25[local32].method31079((byte) 26);
					}
					if (local30) {
						Arrays.sort(local25, new Class242(this));
					}
				}
				local61 = 3;
				@Pc(63) boolean local63 = false;
				local68 = local25.length - 1;
				while (!local63) {
					@Pc(77) float local77 = local25[local68].method31077(2125285026);
					@Pc(83) Class515 local83 = local25[local68].method31063((byte) -17);
					if (local77 >= 0.0F) {
						local63 = true;
					} else if (local83 == Class515.aClass515_3 || local83 == Class515.aClass515_4 || local83 == Class515.aClass515_7) {
						local25[local68].method31073(-825189621);
					}
					local68--;
					if (local68 < 0) {
						local63 = true;
					}
				}
			} while (local68 < local25.length - local61);
			while (local68 >= local25.length - local61) {
				@Pc(128) Class515 local128 = local25[local68].method31063((byte) -79);
				if (local128 == Class515.aClass515_3) {
					local25[local68].method31073(-825189621);
				}
				local68--;
			}
		}
	}

	@OriginalMember(owner = "client!aiq", name = "z", descriptor = "(IILclient!nv;Lclient!mm;IF)Ljava/lang/Object;")
	@Override
	public Object method11527(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class449 arg2, @OriginalArg(3) Class420 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Object();
	}

	@OriginalMember(owner = "client!aiq", name = "n", descriptor = "(Lclient!qr;)Lclient!ry;")
	@Override
	public Class541 method11531(@OriginalArg(0) Class516 arg0) {
		@Pc(3) HashMap local3 = this.aHashMap3;
		synchronized (this.aHashMap3) {
			@Pc(11) Class541[] local11 = (Class541[]) this.aHashMap3.get(arg0);
			if (local11 == null) {
				return null;
			}
			for (@Pc(20) int local20 = 0; local20 < local11.length; local20++) {
				@Pc(28) Class541 local28 = local11[local20];
				@Pc(32) Class515 local32 = local28.method31063((byte) -111);
				if (local32 == Class515.aClass515_2) {
					local28.method31067((byte) -90);
					return local28;
				}
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!aiq", name = "v", descriptor = "(IILclient!nv;Lclient!mm;IF)Ljava/lang/Object;")
	@Override
	public Object method11529(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class449 arg2, @OriginalArg(3) Class420 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Object();
	}

	@OriginalMember(owner = "client!aiq", name = "r", descriptor = "(Lclient!mb;)Ljava/lang/Object;")
	@Override
	Object method11523(@OriginalArg(0) Class413 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!aiq", name = "p", descriptor = "(IILclient!nv;Lclient!mm;IF)Ljava/lang/Object;")
	@Override
	public Object method11510(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class449 arg2, @OriginalArg(3) Class420 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Object();
	}

	@OriginalMember(owner = "client!aiq", name = "c", descriptor = "(Lclient!qr;)Lclient!ry;")
	@Override
	public Class541 method11519(@OriginalArg(0) Class516 arg0) {
		@Pc(3) HashMap local3 = this.aHashMap3;
		synchronized (this.aHashMap3) {
			@Pc(11) Class541[] local11 = (Class541[]) this.aHashMap3.get(arg0);
			if (local11 == null) {
				return null;
			}
			for (@Pc(20) int local20 = 0; local20 < local11.length; local20++) {
				@Pc(28) Class541 local28 = local11[local20];
				@Pc(32) Class515 local32 = local28.method31063((byte) -38);
				if (local32 == Class515.aClass515_2) {
					local28.method31067((byte) -34);
					return local28;
				}
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!aiq", name = "o", descriptor = "(I)V")
	@Override
	public void method11528(@OriginalArg(0) int arg0) {
		@Pc(3) HashMap local3 = this.method11540(-593073597);
		synchronized (local3) {
			@Pc(11) Iterator local11 = local3.keySet().iterator();
			while (local11.hasNext()) {
				@Pc(18) Class516 local18 = (Class516) local11.next();
				@Pc(24) Class541[] local24 = (Class541[]) local3.get(local18);
				for (@Pc(26) int local26 = 0; local26 < local24.length; local26++) {
					if (local24[local26].method31063((byte) -93) != Class515.aClass515_2) {
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
						if (local85[local87].method31063((byte) -87) != Class515.aClass515_2) {
							local85[local87].method31080((byte) 38);
							local60 = false;
						}
					}
				}
			}
			Class217.method25866(10L);
		}
		this.aBoolean240 = true;
		try {
			this.aThread3.join();
		} catch (@Pc(127) InterruptedException local127) {
			local127.printStackTrace();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(134) InterruptedException local134) {
			local134.printStackTrace();
		}
	}
}
