package com.jagex;

import java.io.EOFException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map.Entry;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public final class Class306 {

	@OriginalMember(owner = "client!h", name = "n", descriptor = "I")
	static final int anInt3981 = 10;

	@OriginalMember(owner = "client!h", name = "e", descriptor = "I")
	static final int anInt3982 = 1;

	@OriginalMember(owner = "client!h", name = "m", descriptor = "Ljava/util/LinkedHashMap;")
	LinkedHashMap aLinkedHashMap1;

	@OriginalMember(owner = "client!h", name = "v", descriptor = "()Lclient!h;")
	public static Class306 method26899() {
		@Pc(1) Class38 local1 = null;
		boolean var12 = false;
		@Pc(50) Class306 var19;
		label114: {
			@Pc(65) Class306 local65;
			try {
				var12 = true;
				local1 = Class166_Sub18.method15755("3", client.aClass702_4.aString250, false, 199047110);
				@Pc(16) byte[] local16 = new byte[(int) local1.method735(1585643083)];
				@Pc(30) int local30;
				for (int var18 = 0; var18 < local16.length; var18 += local30) {
					local30 = local1.method726(local16, var18, local16.length - var18, (byte) -10);
					if (local30 == -1) {
						throw new EOFException();
					}
				}
				var19 = new Class306(new Class93_Sub41(local16));
				var12 = false;
				break label114;
			} catch (@Pc(61) Exception local61) {
				local65 = new Class306();
				var12 = false;
			} finally {
				if (var12) {
					try {
						if (local1 != null) {
							local1.method732(203068645);
						}
					} catch (@Pc(84) Exception local84) {
					}
				}
			}
			try {
				if (local1 != null) {
					local1.method732(-672879136);
				}
			} catch (@Pc(73) Exception local73) {
			}
			return local65;
		}
		try {
			if (local1 != null) {
				local1.method732(-861132259);
			}
		} catch (@Pc(58) Exception local58) {
		}
		return var19;
	}

	@OriginalMember(owner = "client!h", name = "t", descriptor = "(Lclient!dh;JIIB)V")
	public static void method26913(@OriginalArg(0) Class104 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		@Pc(9) int local9;
		if (arg0.method20671() && arg0.method20813() > -1) {
			local9 = arg0.method20813();
			@Pc(11) Class626 local11 = null;
			if (!Class625.aLinkedList7.isEmpty()) {
				local11 = (Class626) Class625.aLinkedList7.getFirst();
			}
			if (local11 != null && local11.anInt5862 * -471012383 == local9) {
				Class625.aLinkedList7.removeFirst();
				arg0.method20514();
				@Pc(39) boolean local39 = false;
				@Pc(64) int local64;
				if (local11.aLinkedList9.isEmpty() && arg0.method20464()) {
					@Pc(55) long local55 = arg0.method20469(Class314.anInt4104 * 1161430833, Class17.anInt60 * -1559495963);
					local64 = Class166_Sub13.aTwitchTV1.SubmitFrame(local55, arg0.method20615(), Class625.aBoolean859, arg2, arg3);
					arg0.method20470(local55);
				} else {
					arg0.method20471(Class314.anInt4104 * 1161430833, Class17.anInt60 * -1559495963, Class364.anIntArray429, Class183.anIntArray293);
					Class347.method27703(Class364.anIntArray429, local11.aLinkedList9, local11.anInt5864 * 2135765083, local11.anInt5863 * 430444085, local11.aFloat346, 1744135677);
					local64 = Class166_Sub13.aTwitchTV1.SubmitFrameRaw(Class364.anIntArray429, Class625.aBoolean859, arg2, arg3);
				}
				arg0.method20515();
				if (local64 == 2072) {
					Class625.aLong296 = arg1 * -4106413465911637191L;
				} else if (local64 == 23) {
					Class625.aLong297 = arg1 * 8308705867590167991L;
				} else if (local64 != -995 && local64 != 0) {
				}
			} else {
				arg0.method20467();
				Class625.aLinkedList7.clear();
			}
		}
		if (!Class625.aBoolean858) {
			return;
		}
		if (Class364.anIntArray429 == null) {
			Class364.anIntArray429 = new int[Class625.aBoolean859 ? arg3 * arg2 : Class314.anInt4104 * 1161430833 * -1559495963 * Class17.anInt60];
			Class183.anIntArray293 = new int[Class625.aBoolean859 ? arg3 * arg2 : Class314.anInt4104 * 1161430833 * Class17.anInt60 * -1559495963];
		}
		if (arg0.method20671()) {
			arg0.method20474(client.anInt3485, Class314.anInt4104 * 1161430833, Class17.anInt60 * -1559495963);
			Class625.aLinkedList7.add(new Class626(client.anInt3485, Class625.aLinkedList8, arg0.anInt2899 * 1081362515, arg0.anInt2903 * -779214253, arg0.aFloat199));
			Class625.aLinkedList8 = new LinkedList();
		} else {
			arg0.method20514();
			arg0.method20471(Class314.anInt4104 * 1161430833, Class17.anInt60 * -1559495963, Class364.anIntArray429, Class183.anIntArray293);
			Class347.method27703(Class364.anIntArray429, Class625.aLinkedList8, arg0.anInt2899 * 1081362515, arg0.anInt2903 * -779214253, arg0.aFloat199, 1708086096);
			local9 = Class166_Sub13.aTwitchTV1.SubmitFrameRaw(Class364.anIntArray429, Class625.aBoolean859, arg2, arg3);
			arg0.method20515();
			Class625.aLinkedList8.clear();
			if (local9 == 2072) {
				Class625.aLong296 = arg1 * -4106413465911637191L;
			} else if (local9 == 23) {
				Class625.aLong297 = arg1 * 8308705867590167991L;
			} else if (local9 != -995 && local9 != 0) {
			}
		}
		Class625.aBoolean858 = false;
	}

	@OriginalMember(owner = "client!h", name = "un", descriptor = "(Lclient!yf;I)V")
	static void method26914(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(14) Class312 local14 = Class659.method32986(arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091], -234056249);
		if (local14.anInt4086 * 307668159 == -1) {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
		} else {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local14.anInt4087 * -570377411;
		}
	}

	@OriginalMember(owner = "client!h", name = "xx", descriptor = "(Lclient!yf;I)V")
	static void method26915(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class611 local3 = new Class611();
		local3.method32208((Class93_Sub30) arg0.anObjectArray45[(arg0.anInt6049 -= 957530791) * 587908375], (byte) 89);
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local3.method32207((short) 448);
	}

	@OriginalMember(owner = "client!h", name = "n", descriptor = "(II)Ljava/lang/String;")
	public static String method26916(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return "<col=" + Integer.toHexString(arg0) + ">";
	}

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "(Lclient!alw;)V")
	Class306(@OriginalArg(0) Class93_Sub41 arg0) {
		this.aLinkedHashMap1 = new LinkedHashMap();
		if (arg0 != null && arg0.aByteArray58 != null) {
			@Pc(16) int local16 = arg0.method22425((short) 16384);
			if (local16 > 0 && local16 <= 1) {
				@Pc(26) int local26 = arg0.method22425((short) 16384);
				for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
					@Pc(35) long local35 = arg0.method22435(-177308755);
					@Pc(39) int local39 = arg0.method22431(-118643075);
					this.aLinkedHashMap1.put(local35, local39);
				}
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "()V")
	Class306() {
		this((Class93_Sub41) null);
	}

	@OriginalMember(owner = "client!h", name = "k", descriptor = "(J)I")
	int method26897(@OriginalArg(0) long arg0) {
		return (Integer) this.aLinkedHashMap1.get(arg0);
	}

	@OriginalMember(owner = "client!h", name = "w", descriptor = "(B)V")
	void method26898(@OriginalArg(0) byte arg0) {
		@Pc(1) Class38 local1 = null;
		boolean var11 = false;
		label88: {
			try {
				var11 = true;
				local1 = Class166_Sub18.method15755("3", client.aClass702_4.aString250, true, 199047110);
				@Pc(15) Class93_Sub41 local15 = new Class93_Sub41(5000);
				this.method26900(local15, (byte) 2);
				local1.method722(local15.aByteArray58, 0, local15.anInt3070 * 212851357, 1540615972);
				var11 = false;
				break label88;
			} catch (@Pc(37) Exception local37) {
				var11 = false;
			} finally {
				if (var11) {
					try {
						if (local1 != null) {
							local1.method732(175136795);
						}
					} catch (@Pc(55) Exception local55) {
					}
				}
			}
			try {
				if (local1 != null) {
					local1.method732(641657129);
					return;
				}
			} catch (@Pc(45) Exception local45) {
			}
			return;
		}
		try {
			if (local1 != null) {
				local1.method732(-512112396);
			}
		} catch (@Pc(35) Exception local35) {
		}
	}

	@OriginalMember(owner = "client!h", name = "e", descriptor = "(Lclient!alw;B)V")
	void method26900(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) byte arg1) {
		arg0.method22522(1, (byte) -73);
		arg0.method22522(this.aLinkedHashMap1.size(), (byte) -112);
		@Pc(14) Iterator local14 = this.aLinkedHashMap1.entrySet().iterator();
		while (local14.hasNext()) {
			@Pc(21) Entry local21 = (Entry) local14.next();
			arg0.method22411((Long) local21.getKey());
			arg0.method22407((Integer) local21.getValue(), (byte) 33);
		}
	}

	@OriginalMember(owner = "client!h", name = "o", descriptor = "()V")
	void method26901() {
		@Pc(1) Class38 local1 = null;
		boolean var10 = false;
		label88: {
			try {
				var10 = true;
				local1 = Class166_Sub18.method15755("3", client.aClass702_4.aString250, true, 199047110);
				@Pc(15) Class93_Sub41 local15 = new Class93_Sub41(5000);
				this.method26900(local15, (byte) 2);
				local1.method722(local15.aByteArray58, 0, local15.anInt3070 * 212851357, -161745629);
				var10 = false;
				break label88;
			} catch (@Pc(37) Exception local37) {
				var10 = false;
			} finally {
				if (var10) {
					try {
						if (local1 != null) {
							local1.method732(-1489889032);
						}
					} catch (@Pc(55) Exception local55) {
					}
				}
			}
			try {
				if (local1 != null) {
					local1.method732(-308726369);
					return;
				}
			} catch (@Pc(45) Exception local45) {
			}
			return;
		}
		try {
			if (local1 != null) {
				local1.method732(-967645966);
			}
		} catch (@Pc(35) Exception local35) {
		}
	}

	@OriginalMember(owner = "client!h", name = "l", descriptor = "(Lclient!alw;)V")
	void method26902(@OriginalArg(0) Class93_Sub41 arg0) {
		arg0.method22522(1, (byte) -13);
		arg0.method22522(this.aLinkedHashMap1.size(), (byte) -19);
		@Pc(14) Iterator local14 = this.aLinkedHashMap1.entrySet().iterator();
		while (local14.hasNext()) {
			@Pc(21) Entry local21 = (Entry) local14.next();
			arg0.method22411((Long) local21.getKey());
			arg0.method22407((Integer) local21.getValue(), (byte) -17);
		}
	}

	@OriginalMember(owner = "client!h", name = "u", descriptor = "(JI)V")
	void method26903(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		if (this.aLinkedHashMap1.size() >= 10 && !this.aLinkedHashMap1.containsKey(arg0)) {
			@Pc(15) Iterator local15 = this.aLinkedHashMap1.entrySet().iterator();
			local15.next();
			local15.remove();
		}
		this.aLinkedHashMap1.put(arg0, arg1);
		this.method26898((byte) -6);
	}

	@OriginalMember(owner = "client!h", name = "z", descriptor = "(JI)V")
	void method26904(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		if (this.aLinkedHashMap1.size() >= 10 && !this.aLinkedHashMap1.containsKey(arg0)) {
			@Pc(15) Iterator local15 = this.aLinkedHashMap1.entrySet().iterator();
			local15.next();
			local15.remove();
		}
		this.aLinkedHashMap1.put(arg0, arg1);
		this.method26898((byte) -22);
	}

	@OriginalMember(owner = "client!h", name = "p", descriptor = "(J)Z")
	boolean method26905(@OriginalArg(0) long arg0) {
		return this.aLinkedHashMap1.containsKey(arg0);
	}

	@OriginalMember(owner = "client!h", name = "d", descriptor = "(J)Z")
	boolean method26906(@OriginalArg(0) long arg0) {
		return this.aLinkedHashMap1.containsKey(arg0);
	}

	@OriginalMember(owner = "client!h", name = "c", descriptor = "(J)I")
	int method26907(@OriginalArg(0) long arg0) {
		return (Integer) this.aLinkedHashMap1.get(arg0);
	}

	@OriginalMember(owner = "client!h", name = "r", descriptor = "(J)I")
	int method26908(@OriginalArg(0) long arg0) {
		return (Integer) this.aLinkedHashMap1.get(arg0);
	}

	@OriginalMember(owner = "client!h", name = "m", descriptor = "(J)Z")
	boolean method26909(@OriginalArg(0) long arg0) {
		return this.aLinkedHashMap1.containsKey(arg0);
	}

	@OriginalMember(owner = "client!h", name = "n", descriptor = "(JII)V")
	void method26910(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aLinkedHashMap1.size() >= 10 && !this.aLinkedHashMap1.containsKey(arg0)) {
			@Pc(15) Iterator local15 = this.aLinkedHashMap1.entrySet().iterator();
			local15.next();
			local15.remove();
		}
		this.aLinkedHashMap1.put(arg0, arg1);
		this.method26898((byte) -21);
	}

	@OriginalMember(owner = "client!h", name = "s", descriptor = "()V")
	void method26911() {
		@Pc(1) Class38 local1 = null;
		boolean var10 = false;
		label88: {
			try {
				var10 = true;
				local1 = Class166_Sub18.method15755("3", client.aClass702_4.aString250, true, 199047110);
				@Pc(15) Class93_Sub41 local15 = new Class93_Sub41(5000);
				this.method26900(local15, (byte) 2);
				local1.method722(local15.aByteArray58, 0, local15.anInt3070 * 212851357, 407279871);
				var10 = false;
				break label88;
			} catch (@Pc(37) Exception local37) {
				var10 = false;
			} finally {
				if (var10) {
					try {
						if (local1 != null) {
							local1.method732(-2106514520);
						}
					} catch (@Pc(55) Exception local55) {
					}
				}
			}
			try {
				if (local1 != null) {
					local1.method732(-303020680);
					return;
				}
			} catch (@Pc(45) Exception local45) {
			}
			return;
		}
		try {
			if (local1 != null) {
				local1.method732(-407369145);
			}
		} catch (@Pc(35) Exception local35) {
		}
	}

	@OriginalMember(owner = "client!h", name = "y", descriptor = "()V")
	void method26912() {
		@Pc(1) Class38 local1 = null;
		boolean var10 = false;
		label88: {
			try {
				var10 = true;
				local1 = Class166_Sub18.method15755("3", client.aClass702_4.aString250, true, 199047110);
				@Pc(15) Class93_Sub41 local15 = new Class93_Sub41(5000);
				this.method26900(local15, (byte) 2);
				local1.method722(local15.aByteArray58, 0, local15.anInt3070 * 212851357, 444681064);
				var10 = false;
				break label88;
			} catch (@Pc(37) Exception local37) {
				var10 = false;
			} finally {
				if (var10) {
					try {
						if (local1 != null) {
							local1.method732(-1635442388);
						}
					} catch (@Pc(55) Exception local55) {
					}
				}
			}
			try {
				if (local1 != null) {
					local1.method732(-877878317);
					return;
				}
			} catch (@Pc(45) Exception local45) {
			}
			return;
		}
		try {
			if (local1 != null) {
				local1.method732(883781159);
			}
		} catch (@Pc(35) Exception local35) {
		}
	}
}
