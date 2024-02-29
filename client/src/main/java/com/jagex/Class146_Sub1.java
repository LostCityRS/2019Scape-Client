package com.jagex;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aiw")
public class Class146_Sub1 extends Class146 {

	@OriginalMember(owner = "client!aiw", name = "e", descriptor = "F")
	static final float aFloat140 = 2.0F;

	@OriginalMember(owner = "client!aiw", name = "k", descriptor = "Z")
	volatile boolean aBoolean258 = false;

	@OriginalMember(owner = "client!aiw", name = "l", descriptor = "J")
	long aLong49 = Class305.method26797(1728522643) * 4786657289008338497L;

	@OriginalMember(owner = "client!aiw", name = "u", descriptor = "Ljava/lang/Runnable;")
	Runnable aRunnable1 = new Class246(this);

	@OriginalMember(owner = "client!aiw", name = "z", descriptor = "Ljava/lang/Runnable;")
	Runnable aRunnable2 = new Class245(this);

	@OriginalMember(owner = "client!aiw", name = "m", descriptor = "Lclient!mb;")
	Class412 aClass412_1 = new Class412(this);

	@OriginalMember(owner = "client!aiw", name = "n", descriptor = "Ljava/util/HashMap;")
	HashMap aHashMap2 = new HashMap();

	@OriginalMember(owner = "client!aiw", name = "f", descriptor = "Ljava/lang/Thread;")
	Thread aThread1;

	@OriginalMember(owner = "client!aiw", name = "w", descriptor = "Ljava/lang/Thread;")
	Thread aThread2;

	@OriginalMember(owner = "client!aiw", name = "aw", descriptor = "(I)Ljava/util/HashMap;", line = 78)
	HashMap method11612(@OriginalArg(0) int arg0) {
		return this.aHashMap2;
	}

	@OriginalMember(owner = "client!aiw", name = "<init>", descriptor = "(Lclient!xf;)V", line = 81)
	public Class146_Sub1(@OriginalArg(0) Class657 arg0) {
		@Pc(38) Iterator local38 = arg0.aHashMap13.keySet().iterator();
		@Pc(45) Class508 local45;
		while (local38.hasNext()) {
			local45 = (Class508) local38.next();
			this.aHashMap2.put(local45, new Class535[(Integer) arg0.aHashMap13.get(local45)]);
		}
		local38 = this.aHashMap2.keySet().iterator();
		while (local38.hasNext()) {
			local45 = (Class508) local38.next();
			@Pc(77) Class535[] local77 = (Class535[]) this.aHashMap2.get(local45);
			for (@Pc(79) int local79 = 0; local79 < local77.length; local79++) {
				@Pc(88) Class315 local88 = new Class315(2.0F);
				local88.method26999(0, Class433.aClass433_3, Class426.aClass426_3, 2);
				local77[local79] = new Class535(local45, 32768, 3, local88, this);
			}
		}
		this.aThread1 = new Thread(this.aRunnable2);
		this.aThread2 = new Thread(this.aRunnable1);
		this.aThread1.setPriority(1);
		this.aThread2.setPriority(1);
		this.aThread1.start();
		this.aThread2.start();
	}

	@OriginalMember(owner = "client!aiw", name = "p", descriptor = "()V", line = 112)
	@Override
	public void method11682() {
		if (this.aClass412_1 != null) {
			this.aClass412_1.method28657(-1245067333);
		}
		@Pc(12) Iterator local12 = this.aHashMap2.keySet().iterator();
		while (true) {
			@Pc(26) Class535[] local26;
			@Pc(69) int local69;
			@Pc(62) byte local62;
			do {
				if (!local12.hasNext()) {
					return;
				}
				@Pc(19) Class508 local19 = (Class508) local12.next();
				local26 = (Class535[]) this.aHashMap2.get(local19);
				if (!local19.aBoolean786) {
					@Pc(31) boolean local31 = false;
					for (@Pc(33) int local33 = 0; local33 < local26.length; local33++) {
						local26[local33].method30691((byte) 0);
						local31 |= local26[local33].method30689((byte) 0);
					}
					if (local31) {
						Arrays.sort(local26, new Class247(this));
					}
				}
				local62 = 3;
				@Pc(64) boolean local64 = false;
				local69 = local26.length - 1;
				while (!local64) {
					@Pc(78) float local78 = local26[local69].method30681(1010766785);
					@Pc(84) Class511 local84 = local26[local69].method30631(-2057256311);
					if (local78 >= 0.0F) {
						local64 = true;
					} else if (local84 == Class511.aClass511_6 || Class511.aClass511_4 == local84 || local84 == Class511.aClass511_5) {
						local26[local69].method30664(-1268329901);
					}
					local69--;
					if (local69 < 0) {
						local64 = true;
					}
				}
			} while (local69 < local26.length - local62);
			while (local69 >= local26.length - local62) {
				@Pc(129) Class511 local129 = local26[local69].method30631(-2131841288);
				if (local129 == Class511.aClass511_6) {
					local26[local69].method30664(-1353156640);
				}
				local69--;
			}
		}
	}

	@OriginalMember(owner = "client!aiw", name = "e", descriptor = "(I)V", line = 112)
	@Override
	public void method11686(@OriginalArg(0) int arg0) {
		if (this.aClass412_1 != null) {
			this.aClass412_1.method28657(-1904978473);
		}
		@Pc(12) Iterator local12 = this.aHashMap2.keySet().iterator();
		while (true) {
			@Pc(26) Class535[] local26;
			@Pc(69) int local69;
			@Pc(62) byte local62;
			do {
				if (!local12.hasNext()) {
					return;
				}
				@Pc(19) Class508 local19 = (Class508) local12.next();
				local26 = (Class535[]) this.aHashMap2.get(local19);
				if (!local19.aBoolean786) {
					@Pc(31) boolean local31 = false;
					for (@Pc(33) int local33 = 0; local33 < local26.length; local33++) {
						local26[local33].method30691((byte) 0);
						local31 |= local26[local33].method30689((byte) 0);
					}
					if (local31) {
						Arrays.sort(local26, new Class247(this));
					}
				}
				local62 = 3;
				@Pc(64) boolean local64 = false;
				local69 = local26.length - 1;
				while (!local64) {
					@Pc(78) float local78 = local26[local69].method30681(-778058228);
					@Pc(84) Class511 local84 = local26[local69].method30631(-1723051060);
					if (local78 >= 0.0F) {
						local64 = true;
					} else if (local84 == Class511.aClass511_6 || Class511.aClass511_4 == local84 || local84 == Class511.aClass511_5) {
						local26[local69].method30664(-361792943);
					}
					local69--;
					if (local69 < 0) {
						local64 = true;
					}
				}
			} while (local69 < local26.length - local62);
			while (local69 >= local26.length - local62) {
				@Pc(129) Class511 local129 = local26[local69].method30631(-1727827719);
				if (local129 == Class511.aClass511_6) {
					local26[local69].method30664(-1301582749);
				}
				local69--;
			}
		}
	}

	@OriginalMember(owner = "client!aiw", name = "f", descriptor = "(Ljava/lang/Object;I)I", line = 172)
	@Override
	public int method11676(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
		@Pc(2) long local2 = Class305.method26797(1912241529);
		@Pc(15) int local15 = (int) (180000.0F / ((float) (local2 - this.aLong49 * 4944910247795538369L) / 1000.0F));
		this.aLong49 = local2 * 4786657289008338497L;
		return local15;
	}

	@OriginalMember(owner = "client!aiw", name = "c", descriptor = "(Ljava/lang/Object;)I", line = 172)
	@Override
	public int method11683(@OriginalArg(0) Object arg0) {
		@Pc(2) long local2 = Class305.method26797(1556658126);
		@Pc(15) int local15 = (int) (180000.0F / ((float) (local2 - this.aLong49 * 4944910247795538369L) / 1000.0F));
		this.aLong49 = local2 * 4786657289008338497L;
		return local15;
	}

	@OriginalMember(owner = "client!aiw", name = "d", descriptor = "(Ljava/lang/Object;)I", line = 172)
	@Override
	public int method11701(@OriginalArg(0) Object arg0) {
		@Pc(2) long local2 = Class305.method26797(1178738522);
		@Pc(15) int local15 = (int) (180000.0F / ((float) (local2 - this.aLong49 * 4944910247795538369L) / 1000.0F));
		this.aLong49 = local2 * 4786657289008338497L;
		return local15;
	}

	@OriginalMember(owner = "client!aiw", name = "r", descriptor = "(IILclient!nd;Lclient!mw;IF)Ljava/lang/Object;", line = 179)
	@Override
	public Object method11684(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class433 arg2, @OriginalArg(3) Class426 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Object();
	}

	@OriginalMember(owner = "client!aiw", name = "v", descriptor = "(IILclient!nd;Lclient!mw;IF)Ljava/lang/Object;", line = 179)
	@Override
	public Object method11685(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class433 arg2, @OriginalArg(3) Class426 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Object();
	}

	@OriginalMember(owner = "client!aiw", name = "o", descriptor = "(IILclient!nd;Lclient!mw;IF)Ljava/lang/Object;", line = 179)
	@Override
	public Object method11689(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class433 arg2, @OriginalArg(3) Class426 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Object();
	}

	@OriginalMember(owner = "client!aiw", name = "n", descriptor = "(IILclient!nd;Lclient!mw;IFB)Ljava/lang/Object;", line = 179)
	@Override
	public Object method11673(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class433 arg2, @OriginalArg(3) Class426 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) byte arg6) {
		return new Object();
	}

	@OriginalMember(owner = "client!aiw", name = "s", descriptor = "(Ljava/lang/Object;)V", line = 182)
	@Override
	public void method11681(@OriginalArg(0) Object arg0) {
	}

	@OriginalMember(owner = "client!aiw", name = "y", descriptor = "(Ljava/lang/Object;)V", line = 182)
	@Override
	public void method11688(@OriginalArg(0) Object arg0) {
	}

	@OriginalMember(owner = "client!aiw", name = "m", descriptor = "(Ljava/lang/Object;I)V", line = 182)
	@Override
	public void method11675(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aiw", name = "q", descriptor = "(Ljava/lang/Object;[BII)V", line = 183)
	@Override
	public void method11679(@OriginalArg(0) Object arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!aiw", name = "x", descriptor = "(Ljava/lang/Object;[BII)V", line = 183)
	@Override
	public void method11690(@OriginalArg(0) Object arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!aiw", name = "b", descriptor = "(Ljava/lang/Object;[BII)V", line = 183)
	@Override
	public void method11691(@OriginalArg(0) Object arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!aiw", name = "k", descriptor = "(Ljava/lang/Object;[BIII)V", line = 183)
	@Override
	public void method11687(@OriginalArg(0) Object arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!aiw", name = "a", descriptor = "(Lclient!qk;)Lclient!rq;", line = 186)
	@Override
	public Class535 method11693(@OriginalArg(0) Class508 arg0) {
		@Pc(3) HashMap local3 = this.aHashMap2;
		synchronized (this.aHashMap2) {
			@Pc(11) Class535[] local11 = (Class535[]) this.aHashMap2.get(arg0);
			if (local11 == null) {
				return null;
			}
			for (@Pc(20) int local20 = 0; local20 < local11.length; local20++) {
				@Pc(28) Class535 local28 = local11[local20];
				@Pc(32) Class511 local32 = local28.method30631(-1726879620);
				if (local32 == Class511.aClass511_2) {
					local28.method30644(338889278);
					return local28;
				}
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!aiw", name = "w", descriptor = "(Lclient!qk;B)Lclient!rq;", line = 186)
	@Override
	public Class535 method11677(@OriginalArg(0) Class508 arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) HashMap local3 = this.aHashMap2;
		synchronized (this.aHashMap2) {
			@Pc(11) Class535[] local11 = (Class535[]) this.aHashMap2.get(arg0);
			if (local11 == null) {
				return null;
			}
			for (@Pc(20) int local20 = 0; local20 < local11.length; local20++) {
				@Pc(28) Class535 local28 = local11[local20];
				@Pc(32) Class511 local32 = local28.method30631(-1689264311);
				if (local32 == Class511.aClass511_2) {
					local28.method30644(1125196266);
					return local28;
				}
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!aiw", name = "h", descriptor = "(Lclient!qk;)Lclient!rq;", line = 186)
	@Override
	public Class535 method11697(@OriginalArg(0) Class508 arg0) {
		@Pc(3) HashMap local3 = this.aHashMap2;
		synchronized (this.aHashMap2) {
			@Pc(11) Class535[] local11 = (Class535[]) this.aHashMap2.get(arg0);
			if (local11 == null) {
				return null;
			}
			for (@Pc(20) int local20 = 0; local20 < local11.length; local20++) {
				@Pc(28) Class535 local28 = local11[local20];
				@Pc(32) Class511 local32 = local28.method30631(-1812634558);
				if (local32 == Class511.aClass511_2) {
					local28.method30644(-756860905);
					return local28;
				}
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!aiw", name = "g", descriptor = "(Lclient!qk;)Lclient!rq;", line = 186)
	@Override
	public Class535 method11694(@OriginalArg(0) Class508 arg0) {
		@Pc(3) HashMap local3 = this.aHashMap2;
		synchronized (this.aHashMap2) {
			@Pc(11) Class535[] local11 = (Class535[]) this.aHashMap2.get(arg0);
			if (local11 == null) {
				return null;
			}
			for (@Pc(20) int local20 = 0; local20 < local11.length; local20++) {
				@Pc(28) Class535 local28 = local11[local20];
				@Pc(32) Class511 local32 = local28.method30631(-1847652397);
				if (local32 == Class511.aClass511_2) {
					local28.method30644(633173123);
					return local28;
				}
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!aiw", name = "t", descriptor = "(Lclient!mj;)Ljava/lang/Object;", line = 202)
	@Override
	Object method11674(@OriginalArg(0) Class420 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!aiw", name = "l", descriptor = "(Lclient!mj;I)Ljava/lang/Object;", line = 202)
	@Override
	Object method11678(@OriginalArg(0) Class420 arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!aiw", name = "j", descriptor = "(Lclient!mj;)Ljava/lang/Object;", line = 202)
	@Override
	Object method11696(@OriginalArg(0) Class420 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!aiw", name = "i", descriptor = "(Lclient!mj;)Ljava/lang/Object;", line = 202)
	@Override
	Object method11695(@OriginalArg(0) Class420 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!aiw", name = "ae", descriptor = "()Lclient!mb;", line = 206)
	@Override
	public Class412 method11698() {
		return this.aClass412_1;
	}

	@OriginalMember(owner = "client!aiw", name = "u", descriptor = "(I)Lclient!mb;", line = 206)
	@Override
	public Class412 method11692(@OriginalArg(0) int arg0) {
		return this.aClass412_1;
	}

	@OriginalMember(owner = "client!aiw", name = "ag", descriptor = "()Lclient!mb;", line = 206)
	@Override
	public Class412 method11699() {
		return this.aClass412_1;
	}

	@OriginalMember(owner = "client!aiw", name = "ah", descriptor = "()Lclient!mb;", line = 206)
	@Override
	public Class412 method11700() {
		return this.aClass412_1;
	}

	@OriginalMember(owner = "client!aiw", name = "al", descriptor = "()Lclient!mb;", line = 206)
	@Override
	public Class412 method11672() {
		return this.aClass412_1;
	}

	@OriginalMember(owner = "client!aiw", name = "z", descriptor = "(B)V", line = 210)
	@Override
	public void method11680(@OriginalArg(0) byte arg0) {
		@Pc(3) HashMap local3 = this.method11612(-1707407832);
		synchronized (local3) {
			@Pc(11) Iterator local11 = local3.keySet().iterator();
			while (local11.hasNext()) {
				@Pc(18) Class508 local18 = (Class508) local11.next();
				@Pc(24) Class535[] local24 = (Class535[]) local3.get(local18);
				for (@Pc(26) int local26 = 0; local26 < local24.length; local26++) {
					if (local24[local26].method30631(-1714273549) != Class511.aClass511_2) {
						local24[local26].method30664(235431295);
						local24[local26].method30645((byte) 8);
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
					@Pc(79) Class508 local79 = (Class508) local72.next();
					@Pc(85) Class535[] local85 = (Class535[]) local3.get(local79);
					for (@Pc(87) int local87 = 0; local87 < local85.length; local87++) {
						if (local85[local87].method30631(-2071952800) != Class511.aClass511_2) {
							local85[local87].method30691((byte) 0);
							local60 = false;
						}
					}
				}
			}
			Class212.method25431(10L);
		}
		this.aBoolean258 = true;
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

	@OriginalMember(owner = "client!aiw", name = "ac", descriptor = "()V", line = 210)
	@Override
	public void method11702() {
		@Pc(3) HashMap local3 = this.method11612(-1521326104);
		synchronized (local3) {
			@Pc(11) Iterator local11 = local3.keySet().iterator();
			while (local11.hasNext()) {
				@Pc(18) Class508 local18 = (Class508) local11.next();
				@Pc(24) Class535[] local24 = (Class535[]) local3.get(local18);
				for (@Pc(26) int local26 = 0; local26 < local24.length; local26++) {
					if (local24[local26].method30631(-2070712437) != Class511.aClass511_2) {
						local24[local26].method30664(-694122279);
						local24[local26].method30645((byte) 8);
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
					@Pc(79) Class508 local79 = (Class508) local72.next();
					@Pc(85) Class535[] local85 = (Class535[]) local3.get(local79);
					for (@Pc(87) int local87 = 0; local87 < local85.length; local87++) {
						if (local85[local87].method30631(-1768901447) != Class511.aClass511_2) {
							local85[local87].method30691((byte) 0);
							local60 = false;
						}
					}
				}
			}
			Class212.method25431(10L);
		}
		this.aBoolean258 = true;
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

	@OriginalMember(owner = "client!aiw", name = "ai", descriptor = "()V", line = 210)
	@Override
	public void method11703() {
		@Pc(3) HashMap local3 = this.method11612(-1994459956);
		synchronized (local3) {
			@Pc(11) Iterator local11 = local3.keySet().iterator();
			while (local11.hasNext()) {
				@Pc(18) Class508 local18 = (Class508) local11.next();
				@Pc(24) Class535[] local24 = (Class535[]) local3.get(local18);
				for (@Pc(26) int local26 = 0; local26 < local24.length; local26++) {
					if (local24[local26].method30631(-1804138788) != Class511.aClass511_2) {
						local24[local26].method30664(-229896311);
						local24[local26].method30645((byte) 8);
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
					@Pc(79) Class508 local79 = (Class508) local72.next();
					@Pc(85) Class535[] local85 = (Class535[]) local3.get(local79);
					for (@Pc(87) int local87 = 0; local87 < local85.length; local87++) {
						if (local85[local87].method30631(-1993243280) != Class511.aClass511_2) {
							local85[local87].method30691((byte) 0);
							local60 = false;
						}
					}
				}
			}
			Class212.method25431(10L);
		}
		this.aBoolean258 = true;
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
}
