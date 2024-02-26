package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!abd")
public final class Class30 implements Interface69 {

	@OriginalMember(owner = "client!abd", name = "u", descriptor = "I")
	int anInt97;

	@OriginalMember(owner = "client!abd", name = "f", descriptor = "I")
	int anInt98;

	@OriginalMember(owner = "client!abd", name = "e", descriptor = "I")
	int anInt99;

	@OriginalMember(owner = "client!abd", name = "t", descriptor = "I")
	int anInt100;

	@OriginalMember(owner = "client!abd", name = "l", descriptor = "I")
	int anInt101;

	@OriginalMember(owner = "client!abd", name = "i", descriptor = "Z")
	boolean aBoolean18;

	@OriginalMember(owner = "client!abd", name = "g", descriptor = "I")
	int anInt102;

	@OriginalMember(owner = "client!abd", name = "<init>", descriptor = "()V")
	Class30() {
	}

	@OriginalMember(owner = "client!abd", name = "t", descriptor = "()J")
	@Override
	public long method674() {
		@Pc(1) long[] local1 = Packet.crc64table;
		@Pc(3) long local3 = -1L;
		@Pc(20) long local20 = local3 >>> 8 ^ local1[(int) ((local3 ^ (long) (this.anInt100 * -2027337575)) & 0xFFL)];
		@Pc(39) long local39 = local20 >>> 8 ^ local1[(int) ((local20 ^ (long) (this.anInt98 * -971921325 >> 8)) & 0xFFL)];
		@Pc(56) long local56 = local39 >>> 8 ^ local1[(int) ((local39 ^ (long) (this.anInt98 * -971921325)) & 0xFFL)];
		@Pc(75) long local75 = local56 >>> 8 ^ local1[(int) ((local56 ^ (long) (this.anInt99 * 308480081 >> 24)) & 0xFFL)];
		@Pc(94) long local94 = local75 >>> 8 ^ local1[(int) ((local75 ^ (long) (this.anInt99 * 308480081 >> 16)) & 0xFFL)];
		@Pc(113) long local113 = local94 >>> 8 ^ local1[(int) ((local94 ^ (long) (this.anInt99 * 308480081 >> 8)) & 0xFFL)];
		@Pc(130) long local130 = local113 >>> 8 ^ local1[(int) ((local113 ^ (long) (this.anInt99 * 308480081)) & 0xFFL)];
		@Pc(147) long local147 = local130 >>> 8 ^ local1[(int) ((local130 ^ (long) (this.anInt97 * 11004233)) & 0xFFL)];
		@Pc(166) long local166 = local147 >>> 8 ^ local1[(int) ((local147 ^ (long) (this.anInt101 * 573487959 >> 24)) & 0xFFL)];
		@Pc(185) long local185 = local166 >>> 8 ^ local1[(int) ((local166 ^ (long) (this.anInt101 * 573487959 >> 16)) & 0xFFL)];
		@Pc(204) long local204 = local185 >>> 8 ^ local1[(int) ((local185 ^ (long) (this.anInt101 * 573487959 >> 8)) & 0xFFL)];
		@Pc(221) long local221 = local204 >>> 8 ^ local1[(int) ((local204 ^ (long) (this.anInt101 * 573487959)) & 0xFFL)];
		@Pc(238) long local238 = local221 >>> 8 ^ local1[(int) ((local221 ^ (long) (this.anInt102 * 1550171997)) & 0xFFL)];
		return local238 >>> 8 ^ local1[(int) ((local238 ^ (long) (this.aBoolean18 ? 1 : 0)) & 0xFFL)];
	}

	@OriginalMember(owner = "client!abd", name = "e", descriptor = "()J")
	@Override
	public long method673() {
		@Pc(1) long[] local1 = Packet.crc64table;
		@Pc(3) long local3 = -1L;
		@Pc(20) long local20 = local3 >>> 8 ^ local1[(int) ((local3 ^ (long) (this.anInt100 * -2027337575)) & 0xFFL)];
		@Pc(39) long local39 = local20 >>> 8 ^ local1[(int) ((local20 ^ (long) (this.anInt98 * -971921325 >> 8)) & 0xFFL)];
		@Pc(56) long local56 = local39 >>> 8 ^ local1[(int) ((local39 ^ (long) (this.anInt98 * -971921325)) & 0xFFL)];
		@Pc(75) long local75 = local56 >>> 8 ^ local1[(int) ((local56 ^ (long) (this.anInt99 * 308480081 >> 24)) & 0xFFL)];
		@Pc(94) long local94 = local75 >>> 8 ^ local1[(int) ((local75 ^ (long) (this.anInt99 * 308480081 >> 16)) & 0xFFL)];
		@Pc(113) long local113 = local94 >>> 8 ^ local1[(int) ((local94 ^ (long) (this.anInt99 * 308480081 >> 8)) & 0xFFL)];
		@Pc(130) long local130 = local113 >>> 8 ^ local1[(int) ((local113 ^ (long) (this.anInt99 * 308480081)) & 0xFFL)];
		@Pc(147) long local147 = local130 >>> 8 ^ local1[(int) ((local130 ^ (long) (this.anInt97 * 11004233)) & 0xFFL)];
		@Pc(166) long local166 = local147 >>> 8 ^ local1[(int) ((local147 ^ (long) (this.anInt101 * 573487959 >> 24)) & 0xFFL)];
		@Pc(185) long local185 = local166 >>> 8 ^ local1[(int) ((local166 ^ (long) (this.anInt101 * 573487959 >> 16)) & 0xFFL)];
		@Pc(204) long local204 = local185 >>> 8 ^ local1[(int) ((local185 ^ (long) (this.anInt101 * 573487959 >> 8)) & 0xFFL)];
		@Pc(221) long local221 = local204 >>> 8 ^ local1[(int) ((local204 ^ (long) (this.anInt101 * 573487959)) & 0xFFL)];
		@Pc(238) long local238 = local221 >>> 8 ^ local1[(int) ((local221 ^ (long) (this.anInt102 * 1550171997)) & 0xFFL)];
		return local238 >>> 8 ^ local1[(int) ((local238 ^ (long) (this.aBoolean18 ? 1 : 0)) & 0xFFL)];
	}

	@OriginalMember(owner = "client!abd", name = "f", descriptor = "(Lclient!wk;)Z")
	@Override
	public boolean method675(@OriginalArg(0) Interface69 arg0) {
		if (!(arg0 instanceof Class30)) {
			return false;
		}
		@Pc(7) Class30 local7 = (Class30) arg0;
		if (local7.anInt100 * -2027337575 != this.anInt100 * -2027337575) {
			return false;
		} else if (this.anInt98 * -971921325 != local7.anInt98 * -971921325) {
			return false;
		} else if (this.anInt99 * 308480081 != local7.anInt99 * 308480081) {
			return false;
		} else if (local7.anInt97 * 11004233 != this.anInt97 * 11004233) {
			return false;
		} else if (local7.anInt101 * 573487959 != this.anInt101 * 573487959) {
			return false;
		} else if (local7.anInt102 * 1550171997 == this.anInt102 * 1550171997) {
			return local7.aBoolean18 == this.aBoolean18;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!abd", name = "u", descriptor = "(Lclient!wk;)Z")
	@Override
	public boolean method672(@OriginalArg(0) Interface69 arg0) {
		if (!(arg0 instanceof Class30)) {
			return false;
		}
		@Pc(7) Class30 local7 = (Class30) arg0;
		if (local7.anInt100 * -2027337575 != this.anInt100 * -2027337575) {
			return false;
		} else if (this.anInt98 * -971921325 != local7.anInt98 * -971921325) {
			return false;
		} else if (this.anInt99 * 308480081 != local7.anInt99 * 308480081) {
			return false;
		} else if (local7.anInt97 * 11004233 != this.anInt97 * 11004233) {
			return false;
		} else if (local7.anInt101 * 573487959 != this.anInt101 * 573487959) {
			return false;
		} else if (local7.anInt102 * 1550171997 == this.anInt102 * 1550171997) {
			return local7.aBoolean18 == this.aBoolean18;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!abd", name = "l", descriptor = "(Lclient!wk;)Z")
	@Override
	public boolean method671(@OriginalArg(0) Interface69 arg0) {
		if (!(arg0 instanceof Class30)) {
			return false;
		}
		@Pc(7) Class30 local7 = (Class30) arg0;
		if (local7.anInt100 * -2027337575 != this.anInt100 * -2027337575) {
			return false;
		} else if (this.anInt98 * -971921325 != local7.anInt98 * -971921325) {
			return false;
		} else if (this.anInt99 * 308480081 != local7.anInt99 * 308480081) {
			return false;
		} else if (local7.anInt97 * 11004233 != this.anInt97 * 11004233) {
			return false;
		} else if (local7.anInt101 * 573487959 != this.anInt101 * 573487959) {
			return false;
		} else if (local7.anInt102 * 1550171997 == this.anInt102 * 1550171997) {
			return local7.aBoolean18 == this.aBoolean18;
		} else {
			return false;
		}
	}
}
