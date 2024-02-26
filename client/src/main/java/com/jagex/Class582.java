package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

@OriginalClass("client!tt")
public final class Class582 {

	@OriginalMember(owner = "client!tt", name = "t", descriptor = "Ljava/util/List;")
	public List aList24 = new LinkedList();

	@OriginalMember(owner = "client!tt", name = "f", descriptor = "Z")
	boolean aBoolean922 = false;

	@OriginalMember(owner = "client!tt", name = "e", descriptor = "I")
	int anInt5301 = 0;

	@OriginalMember(owner = "client!tt", name = "u", descriptor = "I")
	int anInt5302 = 0;

	@OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(Z)V")
	Class582(@OriginalArg(0) boolean arg0) {
		this.aBoolean922 = arg0;
	}

	@OriginalMember(owner = "client!tt", name = "l", descriptor = "(Lclient!tj;)V")
	void method31823(@OriginalArg(0) Class573 arg0) {
		@Pc(2) Class120_Sub1 local2 = arg0.aClass120_Sub1_25;
		@Pc(4) boolean local4 = true;
		@Pc(8) Class246[] local8 = arg0.aClass120_Sub1_25.aClass246Array21;
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			if (local8[local10].aBoolean773) {
				local4 = false;
				break;
			}
		}
		if (local4) {
			return;
		}
		arg0.aClass582_2 = this;
		@Pc(44) Class573 local44;
		if (this.aBoolean922) {
			@Pc(37) Iterator local37 = this.aList24.iterator();
			while (local37.hasNext()) {
				local44 = (Class573) local37.next();
				if (local2 == local44.aClass120_Sub1_25) {
					local37.remove();
					Class558.method31398(local44, (byte) 0);
				}
			}
		}
		@Pc(58) ListIterator local58 = this.aList24.listIterator();
		do {
			if (!local58.hasNext()) {
				this.aList24.add(arg0);
				return;
			}
			local44 = (Class573) local58.next();
		} while (local2.anInt3297 * -1640540455 < local44.aClass120_Sub1_25.anInt3297 * -1640540455);
		local58.previous();
		local58.add(arg0);
	}

	@OriginalMember(owner = "client!tt", name = "t", descriptor = "(I)V")
	public void method31824(@OriginalArg(0) int arg0) {
		@Pc(3) Iterator local3 = this.aList24.iterator();
		while (local3.hasNext()) {
			@Pc(10) Class573 local10 = (Class573) local3.next();
			local3.remove();
			Class558.method31398(local10, (byte) 0);
		}
	}

	@OriginalMember(owner = "client!tt", name = "e", descriptor = "(Lclient!tj;)V")
	void method31825(@OriginalArg(0) Class573 arg0) {
		@Pc(2) Class120_Sub1 local2 = arg0.aClass120_Sub1_25;
		@Pc(4) boolean local4 = true;
		@Pc(8) Class246[] local8 = arg0.aClass120_Sub1_25.aClass246Array21;
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			if (local8[local10].aBoolean773) {
				local4 = false;
				break;
			}
		}
		if (local4) {
			return;
		}
		arg0.aClass582_2 = this;
		@Pc(44) Class573 local44;
		if (this.aBoolean922) {
			@Pc(37) Iterator local37 = this.aList24.iterator();
			while (local37.hasNext()) {
				local44 = (Class573) local37.next();
				if (local2 == local44.aClass120_Sub1_25) {
					local37.remove();
					Class558.method31398(local44, (byte) 0);
				}
			}
		}
		@Pc(58) ListIterator local58 = this.aList24.listIterator();
		do {
			if (!local58.hasNext()) {
				this.aList24.add(arg0);
				return;
			}
			local44 = (Class573) local58.next();
		} while (local2.anInt3297 * -1640540455 < local44.aClass120_Sub1_25.anInt3297 * -1640540455);
		local58.previous();
		local58.add(arg0);
	}

	@OriginalMember(owner = "client!tt", name = "u", descriptor = "(Lclient!tj;)V")
	void method31826(@OriginalArg(0) Class573 arg0) {
		@Pc(2) Class120_Sub1 local2 = arg0.aClass120_Sub1_25;
		@Pc(4) boolean local4 = true;
		@Pc(8) Class246[] local8 = arg0.aClass120_Sub1_25.aClass246Array21;
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			if (local8[local10].aBoolean773) {
				local4 = false;
				break;
			}
		}
		if (local4) {
			return;
		}
		arg0.aClass582_2 = this;
		@Pc(44) Class573 local44;
		if (this.aBoolean922) {
			@Pc(37) Iterator local37 = this.aList24.iterator();
			while (local37.hasNext()) {
				local44 = (Class573) local37.next();
				if (local2 == local44.aClass120_Sub1_25) {
					local37.remove();
					Class558.method31398(local44, (byte) 0);
				}
			}
		}
		@Pc(58) ListIterator local58 = this.aList24.listIterator();
		do {
			if (!local58.hasNext()) {
				this.aList24.add(arg0);
				return;
			}
			local44 = (Class573) local58.next();
		} while (local2.anInt3297 * -1640540455 < local44.aClass120_Sub1_25.anInt3297 * -1640540455);
		local58.previous();
		local58.add(arg0);
	}

	@OriginalMember(owner = "client!tt", name = "m", descriptor = "(Lclient!tj;)V")
	void method31827(@OriginalArg(0) Class573 arg0) {
		@Pc(2) Class120_Sub1 local2 = arg0.aClass120_Sub1_25;
		@Pc(4) boolean local4 = true;
		@Pc(8) Class246[] local8 = arg0.aClass120_Sub1_25.aClass246Array21;
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			if (local8[local10].aBoolean773) {
				local4 = false;
				break;
			}
		}
		if (local4) {
			return;
		}
		arg0.aClass582_2 = this;
		@Pc(44) Class573 local44;
		if (this.aBoolean922) {
			@Pc(37) Iterator local37 = this.aList24.iterator();
			while (local37.hasNext()) {
				local44 = (Class573) local37.next();
				if (local2 == local44.aClass120_Sub1_25) {
					local37.remove();
					Class558.method31398(local44, (byte) 0);
				}
			}
		}
		@Pc(58) ListIterator local58 = this.aList24.listIterator();
		do {
			if (!local58.hasNext()) {
				this.aList24.add(arg0);
				return;
			}
			local44 = (Class573) local58.next();
		} while (local2.anInt3297 * -1640540455 < local44.aClass120_Sub1_25.anInt3297 * -1640540455);
		local58.previous();
		local58.add(arg0);
	}

	@OriginalMember(owner = "client!tt", name = "g", descriptor = "(Lclient!tj;)V")
	void method31828(@OriginalArg(0) Class573 arg0) {
		@Pc(2) Class120_Sub1 local2 = arg0.aClass120_Sub1_25;
		@Pc(4) boolean local4 = true;
		@Pc(8) Class246[] local8 = arg0.aClass120_Sub1_25.aClass246Array21;
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			if (local8[local10].aBoolean773) {
				local4 = false;
				break;
			}
		}
		if (local4) {
			return;
		}
		arg0.aClass582_2 = this;
		@Pc(44) Class573 local44;
		if (this.aBoolean922) {
			@Pc(37) Iterator local37 = this.aList24.iterator();
			while (local37.hasNext()) {
				local44 = (Class573) local37.next();
				if (local2 == local44.aClass120_Sub1_25) {
					local37.remove();
					Class558.method31398(local44, (byte) 0);
				}
			}
		}
		@Pc(58) ListIterator local58 = this.aList24.listIterator();
		do {
			if (!local58.hasNext()) {
				this.aList24.add(arg0);
				return;
			}
			local44 = (Class573) local58.next();
		} while (local2.anInt3297 * -1640540455 < local44.aClass120_Sub1_25.anInt3297 * -1640540455);
		local58.previous();
		local58.add(arg0);
	}

	@OriginalMember(owner = "client!tt", name = "f", descriptor = "(Lclient!tj;I)V")
	void method31829(@OriginalArg(0) Class573 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Class120_Sub1 local2 = arg0.aClass120_Sub1_25;
		@Pc(4) boolean local4 = true;
		@Pc(8) Class246[] local8 = arg0.aClass120_Sub1_25.aClass246Array21;
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			if (local8[local10].aBoolean773) {
				local4 = false;
				break;
			}
		}
		if (local4) {
			return;
		}
		arg0.aClass582_2 = this;
		@Pc(44) Class573 local44;
		if (this.aBoolean922) {
			@Pc(37) Iterator local37 = this.aList24.iterator();
			while (local37.hasNext()) {
				local44 = (Class573) local37.next();
				if (local2 == local44.aClass120_Sub1_25) {
					local37.remove();
					Class558.method31398(local44, (byte) 0);
				}
			}
		}
		@Pc(58) ListIterator local58 = this.aList24.listIterator();
		do {
			if (!local58.hasNext()) {
				this.aList24.add(arg0);
				return;
			}
			local44 = (Class573) local58.next();
		} while (local2.anInt3297 * -1640540455 < local44.aClass120_Sub1_25.anInt3297 * -1640540455);
		local58.previous();
		local58.add(arg0);
	}

	@OriginalMember(owner = "client!tt", name = "i", descriptor = "(Lclient!tj;)V")
	void method31830(@OriginalArg(0) Class573 arg0) {
		@Pc(2) Class120_Sub1 local2 = arg0.aClass120_Sub1_25;
		@Pc(4) boolean local4 = true;
		@Pc(8) Class246[] local8 = arg0.aClass120_Sub1_25.aClass246Array21;
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			if (local8[local10].aBoolean773) {
				local4 = false;
				break;
			}
		}
		if (local4) {
			return;
		}
		arg0.aClass582_2 = this;
		@Pc(44) Class573 local44;
		if (this.aBoolean922) {
			@Pc(37) Iterator local37 = this.aList24.iterator();
			while (local37.hasNext()) {
				local44 = (Class573) local37.next();
				if (local2 == local44.aClass120_Sub1_25) {
					local37.remove();
					Class558.method31398(local44, (byte) 0);
				}
			}
		}
		@Pc(58) ListIterator local58 = this.aList24.listIterator();
		do {
			if (!local58.hasNext()) {
				this.aList24.add(arg0);
				return;
			}
			local44 = (Class573) local58.next();
		} while (local2.anInt3297 * -1640540455 < local44.aClass120_Sub1_25.anInt3297 * -1640540455);
		local58.previous();
		local58.add(arg0);
	}
}
