package com.jagex;

import java.util.Iterator;
import java.util.LinkedList;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gx")
public class Class303 {

	@OriginalMember(owner = "client!gx", name = "m", descriptor = "I")
	int anInt3934 = 1686049987;

	@OriginalMember(owner = "client!gx", name = "k", descriptor = "Ljava/util/LinkedList;")
	LinkedList aLinkedList1 = new LinkedList();

	@OriginalMember(owner = "client!gx", name = "n", descriptor = "Lclient!gu;")
	final Interface27 anInterface27_2;

	@OriginalMember(owner = "client!gx", name = "e", descriptor = "J")
	final long aLong254;

	@OriginalMember(owner = "client!gx", name = "<init>", descriptor = "(Lclient!alw;Lclient!gu;)V", line = 16)
	public Class303(@OriginalArg(0) Packet arg0, @OriginalArg(1) Interface27 arg1) {
		this.anInterface27_2 = arg1;
		this.aLong254 = arg0.g8(-1554374053) * -1768670706583714723L;
		this.anInt3934 = arg0.g4(-118643075) * -1686049987;
		for (@Pc(30) int local30 = arg0.g1((short) 16384); local30 != 0; local30 = arg0.g1((short) 16384)) {
			@Pc(40) Class299 local40 = (Class299) Class107.method18116(Class299.method26710((byte) 14), local30, -1915563430);
			@Pc(51) Object local51;
			switch(local40.anInt3927 * 443037581) {
				case 0:
					local51 = new Class296(this, arg0);
					break;
				case 1:
					local51 = new Class300(this, arg0);
					break;
				case 2:
					local51 = new Class288(this, arg0);
					break;
				case 3:
					local51 = new Class292(this, arg0);
					break;
				case 4:
					local51 = new Class261(this, arg0);
					break;
				case 5:
					local51 = new Class291(this);
					break;
				case 6:
					local51 = new Class295(this, arg0);
					break;
				case 7:
					local51 = new Class294(this, arg0);
					break;
				case 8:
					local51 = new Class284(this, arg0);
					break;
				case 9:
					local51 = new Class266(this, arg0);
					break;
				case 10:
					local51 = new Class273(this, arg0);
					break;
				case 11:
					local51 = new Class287(this, arg0);
					break;
				case 12:
					local51 = new Class293(this, arg0);
					break;
				case 13:
					local51 = new Class298(this);
					break;
				default:
					throw new IllegalStateException("");
			}
			this.aLinkedList1.add(local51);
		}
	}

	@OriginalMember(owner = "client!gx", name = "k", descriptor = "(Lclient!gq;)V", line = 76)
	public void method26740(@OriginalArg(0) Class297 arg0) {
		if (this.aLong254 * -3927960772106276875L != arg0.aLong252 * 2439707864836714975L || arg0.method26617(358849593) != this.anInt3934 * 549110805) {
			throw new IllegalStateException("");
		}
		@Pc(26) Iterator local26 = this.aLinkedList1.iterator();
		while (local26.hasNext()) {
			@Pc(33) Interface26 local33 = (Interface26) local26.next();
			local33.method26715(arg0, (byte) -4);
		}
		arg0.method26621((byte) 17);
	}

	@OriginalMember(owner = "client!gx", name = "e", descriptor = "(Lclient!gq;I)V", line = 76)
	public void method26741(@OriginalArg(0) Class297 arg0, @OriginalArg(1) int arg1) {
		if (this.aLong254 * -3927960772106276875L != arg0.aLong252 * 2439707864836714975L || arg0.method26617(358849593) != this.anInt3934 * 549110805) {
			throw new IllegalStateException("");
		}
		@Pc(26) Iterator local26 = this.aLinkedList1.iterator();
		while (local26.hasNext()) {
			@Pc(33) Interface26 local33 = (Interface26) local26.next();
			local33.method26715(arg0, (byte) -50);
		}
		arg0.method26621((byte) 18);
	}

	@OriginalMember(owner = "client!gx", name = "n", descriptor = "(Lclient!gq;)V", line = 76)
	public void method26742(@OriginalArg(0) Class297 arg0) {
		if (this.aLong254 * -3927960772106276875L != arg0.aLong252 * 2439707864836714975L || arg0.method26617(358849593) != this.anInt3934 * 549110805) {
			throw new IllegalStateException("");
		}
		@Pc(26) Iterator local26 = this.aLinkedList1.iterator();
		while (local26.hasNext()) {
			@Pc(33) Interface26 local33 = (Interface26) local26.next();
			local33.method26715(arg0, (byte) -22);
		}
		arg0.method26621((byte) 89);
	}

	@OriginalMember(owner = "client!gx", name = "m", descriptor = "(Lclient!gq;)V", line = 76)
	public void method26743(@OriginalArg(0) Class297 arg0) {
		if (this.aLong254 * -3927960772106276875L != arg0.aLong252 * 2439707864836714975L || arg0.method26617(358849593) != this.anInt3934 * 549110805) {
			throw new IllegalStateException("");
		}
		@Pc(26) Iterator local26 = this.aLinkedList1.iterator();
		while (local26.hasNext()) {
			@Pc(33) Interface26 local33 = (Interface26) local26.next();
			local33.method26715(arg0, (byte) -37);
		}
		arg0.method26621((byte) 123);
	}
}
