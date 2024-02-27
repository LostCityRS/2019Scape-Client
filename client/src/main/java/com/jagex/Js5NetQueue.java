package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pz")
public abstract class Js5NetQueue {

	@OriginalMember(owner = "client!pz", name = "l", descriptor = "I")
	static final int anInt1244 = 5;

	@OriginalMember(owner = "client!pz", name = "f", descriptor = "I")
	static final int anInt1245 = 500;

	@OriginalMember(owner = "client!pz", name = "u", descriptor = "I")
	static final int anInt1246 = 102400;

	@OriginalMember(owner = "client!pz", name = "e", descriptor = "I")
	static final int anInt1247 = 500;

	@OriginalMember(owner = "client!pz", name = "g", descriptor = "I")
	static final int anInt1248 = 5;

	@OriginalMember(owner = "client!pz", name = "t", descriptor = "I")
	static final int anInt1254 = 4;

	@OriginalMember(owner = "client!pz", name = "a", descriptor = "I")
	int latency;

	@OriginalMember(owner = "client!pz", name = "s", descriptor = "J")
	long previousLoop;

	@OriginalMember(owner = "client!pz", name = "i", descriptor = "Lclient!aaa;")
	SecondaryLinkedList pendingUrgentRequests = new SecondaryLinkedList();

	@OriginalMember(owner = "client!pz", name = "m", descriptor = "Lclient!aaa;")
	SecondaryLinkedList inFlightUrgentRequests = new SecondaryLinkedList();

	@OriginalMember(owner = "client!pz", name = "o", descriptor = "Lclient!aaa;")
	SecondaryLinkedList pendingPrefetchRequests = new SecondaryLinkedList();

	@OriginalMember(owner = "client!pz", name = "j", descriptor = "Lclient!aaa;")
	SecondaryLinkedList inFlightPrefetchRequests = new SecondaryLinkedList();

	@OriginalMember(owner = "client!pz", name = "k", descriptor = "Lclient!ald;")
	Packet outBuffer = new Packet(6);

	@OriginalMember(owner = "client!pz", name = "x", descriptor = "B")
	byte encryptionKey = 0;

	@OriginalMember(owner = "client!pz", name = "w", descriptor = "I")
	public volatile int errorCount = 0;

	@OriginalMember(owner = "client!pz", name = "r", descriptor = "I")
	public volatile int errorCode = 0;

	@OriginalMember(owner = "client!pz", name = "q", descriptor = "I")
	public volatile int errorArchive = -644123047;

	@OriginalMember(owner = "client!pz", name = "h", descriptor = "I")
	public volatile int errorGroup = -975887797;

	@OriginalMember(owner = "client!pz", name = "d", descriptor = "Lclient!ald;")
	Packet chunkHeader = new Packet(5);

	@OriginalMember(owner = "client!pz", name = "z", descriptor = "Lclient!ald;")
	Packet groupHeader = new Packet(5);

	@OriginalMember(owner = "client!pz", name = "p", descriptor = "I")
	int blockPosition = 0;

	@OriginalMember(owner = "client!pz", name = "v", descriptor = "Lclient!aun;")
	Js5NetRequest inBuffer = null;

	@OriginalMember(owner = "client!pz", name = "jj", descriptor = "(Lclient!yp;B)V")
	static void method10803(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5778 -= -221471862;
	}

	@OriginalMember(owner = "client!pz", name = "beo", descriptor = "(Lclient!yp;I)V")
	static void method10804(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = "";
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
	}

	@OriginalMember(owner = "client!pz", name = "<init>", descriptor = "()V")
	public Js5NetQueue() {
	}

	@OriginalMember(owner = "client!pz", name = "ac", descriptor = "()V")
	public abstract void method10762();

	@OriginalMember(owner = "client!pz", name = "z", descriptor = "()I")
	final int method10763() {
		return this.pendingPrefetchRequests.method47(910297490) + this.inFlightPrefetchRequests.method47(960731776);
	}

	@OriginalMember(owner = "client!pz", name = "f", descriptor = "(B)Z")
	public final boolean method10764(@OriginalArg(0) byte arg0) {
		return this.getPrefetchRequestCount(-580640978) >= 500;
	}

	@OriginalMember(owner = "client!pz", name = "aj", descriptor = "()V")
	public abstract void method10765();

	@OriginalMember(owner = "client!pz", name = "u", descriptor = "(I)I")
	public final int getPrefetchRequestCount(@OriginalArg(0) int arg0) {
		return this.pendingPrefetchRequests.method47(531355041) + this.inFlightPrefetchRequests.method47(1028588657);
	}

	@OriginalMember(owner = "client!pz", name = "l", descriptor = "(B)I")
	public final int getUrgentRequestCount(@OriginalArg(0) byte arg0) {
		return this.pendingUrgentRequests.method47(1264539883) + this.inFlightUrgentRequests.method47(936580035);
	}

	@OriginalMember(owner = "client!pz", name = "g", descriptor = "(III)V")
	abstract void rekey(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!pz", name = "i", descriptor = "(I)Z")
	public abstract boolean cycle(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!pz", name = "ax", descriptor = "()Z")
	public abstract boolean method10770();

	@OriginalMember(owner = "client!pz", name = "o", descriptor = "(ZB)V")
	public abstract void writeLoggedIn(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte arg1);

	@OriginalMember(owner = "client!pz", name = "j", descriptor = "(I)V")
	public abstract void method10772(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!pz", name = "a", descriptor = "(B)V")
	public abstract void close(@OriginalArg(0) byte arg0);

	@OriginalMember(owner = "client!pz", name = "s", descriptor = "(I)V")
	public abstract void method10774(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!pz", name = "k", descriptor = "(IIBZ)Lclient!aun;")
	final Js5NetRequest method10775(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) long local7 = (long) arg1 + ((long) arg0 << 32);
		@Pc(11) Js5NetRequest local11 = new Js5NetRequest();
		local11.dualKey = local7 * -4191731634426926145L;
		local11.trailerLen = arg2;
		local11.aBoolean663 = arg3;
		if (arg3) {
			if (this.getUrgentRequestCount((byte) 68) >= 500) {
				throw new RuntimeException();
			}
			this.pendingUrgentRequests.addTail(local11, 1599142138);
		} else if (this.getPrefetchRequestCount(-186543626) < 500) {
			this.pendingPrefetchRequests.addTail(local11, 1599142138);
		} else {
			throw new RuntimeException();
		}
		return local11;
	}

	@OriginalMember(owner = "client!pz", name = "ak", descriptor = "()V")
	public abstract void method10776();

	@OriginalMember(owner = "client!pz", name = "w", descriptor = "(IIBZ)Lclient!aun;")
	final Js5NetRequest method10777(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) long local7 = (long) arg1 + ((long) arg0 << 32);
		@Pc(11) Js5NetRequest local11 = new Js5NetRequest();
		local11.dualKey = local7 * -4191731634426926145L;
		local11.trailerLen = arg2;
		local11.aBoolean663 = arg3;
		if (arg3) {
			if (this.getUrgentRequestCount((byte) 28) >= 500) {
				throw new RuntimeException();
			}
			this.pendingUrgentRequests.addTail(local11, 1599142138);
		} else if (this.getPrefetchRequestCount(-497066423) < 500) {
			this.pendingPrefetchRequests.addTail(local11, 1599142138);
		} else {
			throw new RuntimeException();
		}
		return local11;
	}

	@OriginalMember(owner = "client!pz", name = "ag", descriptor = "()V")
	public abstract void method10778();

	@OriginalMember(owner = "client!pz", name = "q", descriptor = "(IIBZ)Lclient!aun;")
	final Js5NetRequest method10779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) long local7 = (long) arg1 + ((long) arg0 << 32);
		@Pc(11) Js5NetRequest local11 = new Js5NetRequest();
		local11.dualKey = local7 * -4191731634426926145L;
		local11.trailerLen = arg2;
		local11.aBoolean663 = arg3;
		if (arg3) {
			if (this.getUrgentRequestCount((byte) 1) >= 500) {
				throw new RuntimeException();
			}
			this.pendingUrgentRequests.addTail(local11, 1599142138);
		} else if (this.getPrefetchRequestCount(1930158185) < 500) {
			this.pendingPrefetchRequests.addTail(local11, 1599142138);
		} else {
			throw new RuntimeException();
		}
		return local11;
	}

	@OriginalMember(owner = "client!pz", name = "h", descriptor = "()Z")
	public final boolean method10780() {
		return this.getPrefetchRequestCount(-78564994) >= 500;
	}

	@OriginalMember(owner = "client!pz", name = "b", descriptor = "()Z")
	public abstract boolean method10781();

	@OriginalMember(owner = "client!pz", name = "ai", descriptor = "(Ljava/lang/Object;Z)V")
	public abstract void method10782(@OriginalArg(0) Object arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!pz", name = "p", descriptor = "()I")
	final int method10783() {
		return this.pendingPrefetchRequests.method47(700162451) + this.inFlightPrefetchRequests.method47(1572359495);
	}

	@OriginalMember(owner = "client!pz", name = "v", descriptor = "()I")
	public final int method10784() {
		return this.pendingUrgentRequests.method47(1052390310) + this.inFlightUrgentRequests.method47(426123515);
	}

	@OriginalMember(owner = "client!pz", name = "y", descriptor = "()I")
	public final int method10785() {
		return this.pendingUrgentRequests.method47(1907370664) + this.inFlightUrgentRequests.method47(2040914656);
	}

	@OriginalMember(owner = "client!pz", name = "d", descriptor = "()I")
	final int method10786() {
		return this.pendingPrefetchRequests.method47(140941510) + this.inFlightPrefetchRequests.method47(1298984762);
	}

	@OriginalMember(owner = "client!pz", name = "c", descriptor = "(II)V")
	abstract void method10787(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!pz", name = "e", descriptor = "(S)Z")
	public final boolean isRequestQueueFull(@OriginalArg(0) short arg0) {
		return this.getUrgentRequestCount((byte) -31) >= 500;
	}

	@OriginalMember(owner = "client!pz", name = "af", descriptor = "()V")
	public abstract void method10789();

	@OriginalMember(owner = "client!pz", name = "ay", descriptor = "(Ljava/lang/Object;Z)V")
	public abstract void method10790(@OriginalArg(0) Object arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!pz", name = "m", descriptor = "(Ljava/lang/Object;ZI)V")
	public abstract void start(@OriginalArg(0) Object arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!pz", name = "aq", descriptor = "(Z)V")
	public abstract void method10792(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!pz", name = "ao", descriptor = "(Z)V")
	public abstract void method10793(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!pz", name = "r", descriptor = "(IIBZ)Lclient!aun;")
	final Js5NetRequest method10794(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) long local7 = (long) arg1 + ((long) arg0 << 32);
		@Pc(11) Js5NetRequest local11 = new Js5NetRequest();
		local11.dualKey = local7 * -4191731634426926145L;
		local11.trailerLen = arg2;
		local11.aBoolean663 = arg3;
		if (arg3) {
			if (this.getUrgentRequestCount((byte) -43) >= 500) {
				throw new RuntimeException();
			}
			this.pendingUrgentRequests.addTail(local11, 1599142138);
		} else if (this.getPrefetchRequestCount(909069017) < 500) {
			this.pendingPrefetchRequests.addTail(local11, 1599142138);
		} else {
			throw new RuntimeException();
		}
		return local11;
	}

	@OriginalMember(owner = "client!pz", name = "x", descriptor = "(IIBZ)Lclient!aun;")
	final Js5NetRequest method10795(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) long local7 = (long) arg1 + ((long) arg0 << 32);
		@Pc(11) Js5NetRequest local11 = new Js5NetRequest();
		local11.dualKey = local7 * -4191731634426926145L;
		local11.trailerLen = arg2;
		local11.aBoolean663 = arg3;
		if (arg3) {
			if (this.getUrgentRequestCount((byte) 75) >= 500) {
				throw new RuntimeException();
			}
			this.pendingUrgentRequests.addTail(local11, 1599142138);
		} else if (this.getPrefetchRequestCount(285484758) < 500) {
			this.pendingPrefetchRequests.addTail(local11, 1599142138);
		} else {
			throw new RuntimeException();
		}
		return local11;
	}

	@OriginalMember(owner = "client!pz", name = "ab", descriptor = "()V")
	public abstract void method10796();

	@OriginalMember(owner = "client!pz", name = "n", descriptor = "(II)V")
	abstract void method10797(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!pz", name = "ah", descriptor = "()V")
	public abstract void method10798();

	@OriginalMember(owner = "client!pz", name = "t", descriptor = "(IIBZI)Lclient!aun;")
	final Js5NetRequest requestGroup(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		ClientConfig.printVerbose("Requesting archive " + arg0 + " group " + arg1 + " (" + arg3 + ")");
		@Pc(7) long local7 = (long) arg1 + ((long) arg0 << 32);
		@Pc(11) Js5NetRequest local11 = new Js5NetRequest();
		local11.dualKey = local7 * -4191731634426926145L;
		local11.trailerLen = arg2;
		local11.aBoolean663 = arg3;
		if (arg3) {
			if (this.getUrgentRequestCount((byte) -23) >= 500) {
				throw new RuntimeException();
			}
			this.pendingUrgentRequests.addTail(local11, 1599142138);
		} else if (this.getPrefetchRequestCount(-729627583) < 500) {
			this.pendingPrefetchRequests.addTail(local11, 1599142138);
		} else {
			throw new RuntimeException();
		}
		return local11;
	}

	@OriginalMember(owner = "client!pz", name = "am", descriptor = "()V")
	public abstract void method10800();

	@OriginalMember(owner = "client!pz", name = "al", descriptor = "()V")
	public abstract void method10801();

	@OriginalMember(owner = "client!pz", name = "at", descriptor = "()V")
	public abstract void method10802();
}
