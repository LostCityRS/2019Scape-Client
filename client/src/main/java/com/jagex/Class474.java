package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.io.EOFException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

@OriginalClass("client!p")
public final class Class474 {

	@OriginalMember(owner = "client!p", name = "f", descriptor = "I")
	static final int anInt4959 = 10;

	@OriginalMember(owner = "client!p", name = "t", descriptor = "I")
	static final int anInt4960 = 1;

	@OriginalMember(owner = "client!p", name = "e", descriptor = "Ljava/util/LinkedHashMap;")
	LinkedHashMap aLinkedHashMap1;

	@OriginalMember(owner = "client!p", name = "r", descriptor = "()Lclient!p;")
	public static Class474 method29862() {
		@Pc(1) Class40 local1 = null;
		boolean var12 = false;
		@Pc(50) Class474 var19;
		label114: {
			@Pc(64) Class474 local64;
			try {
				var12 = true;
				local1 = Class3.method70("3", client.aClass722_4.aString247, false, -599234849);
				@Pc(16) byte[] local16 = new byte[(int) local1.method839((byte) 0)];
				@Pc(30) int local30;
				for (int var18 = 0; var18 < local16.length; var18 += local30) {
					local30 = local1.method832(local16, var18, local16.length - var18, (byte) -109);
					if (local30 == -1) {
						throw new EOFException();
					}
				}
				var19 = new Class474(new Packet(local16));
				var12 = false;
				break label114;
			} catch (@Pc(60) Exception local60) {
				local64 = new Class474();
				var12 = false;
			} finally {
				if (var12) {
					try {
						if (local1 != null) {
							local1.method838(-1900850143);
						}
					} catch (@Pc(81) Exception local81) {
					}
				}
			}
			try {
				if (local1 != null) {
					local1.method838(75644635);
				}
			} catch (@Pc(71) Exception local71) {
			}
			return local64;
		}
		try {
			if (local1 != null) {
				local1.method838(-408071996);
			}
		} catch (@Pc(57) Exception local57) {
		}
		return var19;
	}

	@OriginalMember(owner = "client!p", name = "q", descriptor = "()Lclient!p;")
	public static Class474 method29876() {
		@Pc(1) Class40 local1 = null;
		boolean var12 = false;
		@Pc(50) Class474 var19;
		label114: {
			@Pc(64) Class474 local64;
			try {
				var12 = true;
				local1 = Class3.method70("3", client.aClass722_4.aString247, false, -930490884);
				@Pc(16) byte[] local16 = new byte[(int) local1.method839((byte) 0)];
				@Pc(30) int local30;
				for (int var18 = 0; var18 < local16.length; var18 += local30) {
					local30 = local1.method832(local16, var18, local16.length - var18, (byte) -13);
					if (local30 == -1) {
						throw new EOFException();
					}
				}
				var19 = new Class474(new Packet(local16));
				var12 = false;
				break label114;
			} catch (@Pc(60) Exception local60) {
				local64 = new Class474();
				var12 = false;
			} finally {
				if (var12) {
					try {
						if (local1 != null) {
							local1.method838(1700406083);
						}
					} catch (@Pc(81) Exception local81) {
					}
				}
			}
			try {
				if (local1 != null) {
					local1.method838(-797258594);
				}
			} catch (@Pc(71) Exception local71) {
			}
			return local64;
		}
		try {
			if (local1 != null) {
				local1.method838(326226687);
			}
		} catch (@Pc(57) Exception local57) {
		}
		return var19;
	}

	@OriginalMember(owner = "client!p", name = "x", descriptor = "(I)V")
	static void method29878(@OriginalArg(0) int arg0) {
		if (Class630.aClass80_Sub1_Sub4_1 != null) {
			Class630.aClass80_Sub1_Sub4_1 = null;
			Class312.method27468(Class41_Sub12.anInt2441 * 1627981811, Class630.anInt5557 * -1965654097, Class40.anInt116 * -477951091, Class681.anInt5749 * -1929920381, -136798746);
		}
	}

	@OriginalMember(owner = "client!p", name = "k", descriptor = "(Lclient!yp;B)V")
	static void method29879(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class719.method37274(1072454610);
	}

	@OriginalMember(owner = "client!p", name = "zi", descriptor = "(Lclient!yp;I)V")
	static void method29880(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		if (client.anInt3577 * 740205413 == 2 && local12 < client.anInt3573 * 975306769) {
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = client.aClass676Array1[local12].aString239;
		} else {
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = "";
		}
	}

	@OriginalMember(owner = "client!p", name = "ai", descriptor = "(I)V")
	public static void method29881(@OriginalArg(0) int arg0) {
		for (@Pc(4) Class80_Sub1_Sub4 local4 = (Class80_Sub1_Sub4) Class630.aClass3_17.method50((byte) -7); local4 != null; local4 = (Class80_Sub1_Sub4) Class630.aClass3_17.method46((byte) -102)) {
			if (local4.anInt3022 * 855388281 > 1) {
				local4.anInt3022 = 0;
				Class630.aClass243_89.method26253(local4, ((Class80_Sub1_Sub11) local4.aClass3_10.aClass80_Sub1_2.aClass80_Sub1_68).aLong249 * -6321316696381466459L);
				local4.aClass3_10.method41(-252802305);
			}
		}
		Class630.anInt5554 = 0;
		Class630.anInt5553 = 0;
		Class630.aClass8_55.method260(-805154400);
		Class630.aClass24_35.method564(-180647991);
		Class630.aClass3_17.method41(-252802305);
		Class630.aBoolean955 = false;
	}

	@OriginalMember(owner = "client!p", name = "af", descriptor = "(III)V")
	static void method29882(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(5, (long) arg0);
		local4.method22135(-457826299);
		local4.anInt3064 = arg1 * -1221031713;
	}

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Lclient!ald;)V")
	Class474(@OriginalArg(0) Packet arg0) {
		this.aLinkedHashMap1 = new LinkedHashMap();
		if (arg0 != null && arg0.data != null) {
			@Pc(18) int local18 = arg0.g1();
			if (local18 > 0 && local18 <= 1) {
				@Pc(28) int local28 = arg0.g1();
				for (@Pc(30) int local30 = 0; local30 < local28; local30++) {
					@Pc(37) long local37 = arg0.g8();
					@Pc(41) int local41 = arg0.g4();
					this.aLinkedHashMap1.put(local37, local41);
				}
			}
		}
	}

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "()V")
	Class474() {
		this((Packet) null);
	}

	@OriginalMember(owner = "client!p", name = "j", descriptor = "(JI)V")
	void method29861(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		if (this.aLinkedHashMap1.size() >= 10 && !this.aLinkedHashMap1.containsKey(arg0)) {
			@Pc(15) Iterator local15 = this.aLinkedHashMap1.entrySet().iterator();
			local15.next();
			local15.remove();
		}
		this.aLinkedHashMap1.put(arg0, arg1);
		this.method29870(-1547116682);
	}

	@OriginalMember(owner = "client!p", name = "u", descriptor = "(J)I")
	int method29863(@OriginalArg(0) long arg0) {
		return (Integer) this.aLinkedHashMap1.get(arg0);
	}

	@OriginalMember(owner = "client!p", name = "e", descriptor = "(J)Z")
	boolean method29864(@OriginalArg(0) long arg0) {
		return this.aLinkedHashMap1.containsKey(arg0);
	}

	@OriginalMember(owner = "client!p", name = "f", descriptor = "(JII)V")
	void method29865(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aLinkedHashMap1.size() >= 10 && !this.aLinkedHashMap1.containsKey(arg0)) {
			@Pc(15) Iterator local15 = this.aLinkedHashMap1.entrySet().iterator();
			local15.next();
			local15.remove();
		}
		this.aLinkedHashMap1.put(arg0, arg1);
		this.method29870(-1547116682);
	}

	@OriginalMember(owner = "client!p", name = "i", descriptor = "(Lclient!ald;)V")
	void method29866(@OriginalArg(0) Packet arg0) {
		arg0.p1(1);
		arg0.p1(this.aLinkedHashMap1.size());
		@Pc(14) Iterator local14 = this.aLinkedHashMap1.entrySet().iterator();
		while (local14.hasNext()) {
			@Pc(21) Entry local21 = (Entry) local14.next();
			arg0.p8((Long) local21.getKey());
			arg0.p4((Integer) local21.getValue());
		}
	}

	@OriginalMember(owner = "client!p", name = "m", descriptor = "(Lclient!ald;)V")
	void method29867(@OriginalArg(0) Packet arg0) {
		arg0.p1(1);
		arg0.p1(this.aLinkedHashMap1.size());
		@Pc(14) Iterator local14 = this.aLinkedHashMap1.entrySet().iterator();
		while (local14.hasNext()) {
			@Pc(21) Entry local21 = (Entry) local14.next();
			arg0.p8((Long) local21.getKey());
			arg0.p4((Integer) local21.getValue());
		}
	}

	@OriginalMember(owner = "client!p", name = "o", descriptor = "(Lclient!ald;)V")
	void method29868(@OriginalArg(0) Packet arg0) {
		arg0.p1(1);
		arg0.p1(this.aLinkedHashMap1.size());
		@Pc(14) Iterator local14 = this.aLinkedHashMap1.entrySet().iterator();
		while (local14.hasNext()) {
			@Pc(21) Entry local21 = (Entry) local14.next();
			arg0.p8((Long) local21.getKey());
			arg0.p4((Integer) local21.getValue());
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(J)Z")
	boolean method29869(@OriginalArg(0) long arg0) {
		return this.aLinkedHashMap1.containsKey(arg0);
	}

	@OriginalMember(owner = "client!p", name = "g", descriptor = "(I)V")
	void method29870(@OriginalArg(0) int arg0) {
		@Pc(1) Class40 local1 = null;
		boolean var11 = false;
		label88: {
			try {
				var11 = true;
				local1 = Class3.method70("3", client.aClass722_4.aString247, true, -675246207);
				@Pc(15) Packet local15 = new Packet(5000);
				this.method29875(local15, (byte) 45);
				local1.method834(local15.data, 0, local15.pos * -1380987821, (byte) 1);
				var11 = false;
				break label88;
			} catch (@Pc(37) Exception local37) {
				var11 = false;
			} finally {
				if (var11) {
					try {
						if (local1 != null) {
							local1.method838(-1488246703);
						}
					} catch (@Pc(55) Exception local55) {
					}
				}
			}
			try {
				if (local1 != null) {
					local1.method838(828415780);
					return;
				}
			} catch (@Pc(45) Exception local45) {
			}
			return;
		}
		try {
			if (local1 != null) {
				local1.method838(-1894458506);
			}
		} catch (@Pc(35) Exception local35) {
		}
	}

	@OriginalMember(owner = "client!p", name = "s", descriptor = "(J)Z")
	boolean method29871(@OriginalArg(0) long arg0) {
		return this.aLinkedHashMap1.containsKey(arg0);
	}

	@OriginalMember(owner = "client!p", name = "k", descriptor = "(J)Z")
	boolean method29872(@OriginalArg(0) long arg0) {
		return this.aLinkedHashMap1.containsKey(arg0);
	}

	@OriginalMember(owner = "client!p", name = "x", descriptor = "(J)I")
	int method29873(@OriginalArg(0) long arg0) {
		return (Integer) this.aLinkedHashMap1.get(arg0);
	}

	@OriginalMember(owner = "client!p", name = "w", descriptor = "(J)I")
	int method29874(@OriginalArg(0) long arg0) {
		return (Integer) this.aLinkedHashMap1.get(arg0);
	}

	@OriginalMember(owner = "client!p", name = "t", descriptor = "(Lclient!ald;B)V")
	void method29875(@OriginalArg(0) Packet arg0, @OriginalArg(1) byte arg1) {
		arg0.p1(1);
		arg0.p1(this.aLinkedHashMap1.size());
		@Pc(14) Iterator local14 = this.aLinkedHashMap1.entrySet().iterator();
		while (local14.hasNext()) {
			@Pc(21) Entry local21 = (Entry) local14.next();
			arg0.p8((Long) local21.getKey());
			arg0.p4((Integer) local21.getValue());
		}
	}

	@OriginalMember(owner = "client!p", name = "h", descriptor = "()V")
	void method29877() {
		@Pc(1) Class40 local1 = null;
		boolean var10 = false;
		label88: {
			try {
				var10 = true;
				local1 = Class3.method70("3", client.aClass722_4.aString247, true, -853529767);
				@Pc(15) Packet local15 = new Packet(5000);
				this.method29875(local15, (byte) 91);
				local1.method834(local15.data, 0, local15.pos * -1380987821, (byte) 1);
				var10 = false;
				break label88;
			} catch (@Pc(37) Exception local37) {
				var10 = false;
			} finally {
				if (var10) {
					try {
						if (local1 != null) {
							local1.method838(-137044048);
						}
					} catch (@Pc(55) Exception local55) {
					}
				}
			}
			try {
				if (local1 != null) {
					local1.method838(1034632299);
					return;
				}
			} catch (@Pc(45) Exception local45) {
			}
			return;
		}
		try {
			if (local1 != null) {
				local1.method838(-1138233861);
			}
		} catch (@Pc(35) Exception local35) {
		}
	}
}
