package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aki")
public final class Class93_Sub19 extends Class93 {

	@OriginalMember(owner = "client!aki", name = "u", descriptor = "I")
	public static final int anInt1542 = 16;

	@OriginalMember(owner = "client!aki", name = "f", descriptor = "I")
	public static final int anInt1543 = 2;

	@OriginalMember(owner = "client!aki", name = "k", descriptor = "I")
	public static final int anInt1544 = 1;

	@OriginalMember(owner = "client!aki", name = "l", descriptor = "I")
	public static final int anInt1545 = 8;

	@OriginalMember(owner = "client!aki", name = "z", descriptor = "I")
	public static final int anInt1547 = 32;

	@OriginalMember(owner = "client!aki", name = "p", descriptor = "I")
	public static final int anInt1548 = 64;

	@OriginalMember(owner = "client!aki", name = "w", descriptor = "I")
	public static final int anInt1549 = 4;

	@OriginalMember(owner = "client!aki", name = "d", descriptor = "Lclient!aki;")
	static final Class93_Sub19 aClass93_Sub19_1 = new Class93_Sub19(0, -1);

	@OriginalMember(owner = "client!aki", name = "c", descriptor = "I")
	public final int anInt1550;

	@OriginalMember(owner = "client!aki", name = "r", descriptor = "I")
	public final int anInt1546;

	@OriginalMember(owner = "client!aki", name = "t", descriptor = "(I)I")
	static int method13633(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!aki", name = "ae", descriptor = "(I)I")
	static int method13638(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!aki", name = "<init>", descriptor = "(II)V")
	public Class93_Sub19(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1550 = arg0 * 576365597;
		this.anInt1546 = arg1 * 1291471223;
	}

	@OriginalMember(owner = "client!aki", name = "at", descriptor = "()Z")
	public boolean method13617() {
		return (this.anInt1550 * -622772683 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!aki", name = "e", descriptor = "(B)Z")
	public boolean method13618(@OriginalArg(0) byte arg0) {
		return (this.anInt1550 * -622772683 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!aki", name = "n", descriptor = "(II)Z")
	public boolean method13619(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (this.anInt1550 * -622772683 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!aki", name = "m", descriptor = "(S)I")
	public int method13620(@OriginalArg(0) short arg0) {
		return Class122_Sub1.method20238(this.anInt1550 * -622772683, (byte) -37);
	}

	@OriginalMember(owner = "client!aki", name = "as", descriptor = "()Z")
	public boolean method13621() {
		return (this.anInt1550 * -622772683 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!aki", name = "w", descriptor = "(I)Z")
	public boolean method13622(@OriginalArg(0) int arg0) {
		return (this.anInt1550 * -622772683 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!aki", name = "c", descriptor = "()Z")
	public boolean method13623() {
		return (this.anInt1550 * -622772683 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!aki", name = "z", descriptor = "()Z")
	public boolean method13624() {
		return (this.anInt1550 * -622772683 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!aki", name = "p", descriptor = "()Z")
	public boolean method13625() {
		return (this.anInt1550 * -622772683 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!aki", name = "d", descriptor = "()Z")
	public boolean method13626() {
		return (this.anInt1550 * -622772683 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!aki", name = "y", descriptor = "(I)Z")
	public boolean method13627(@OriginalArg(0) int arg0) {
		return (this.anInt1550 * -622772683 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!aki", name = "r", descriptor = "(I)Z")
	public boolean method13628(@OriginalArg(0) int arg0) {
		return (this.anInt1550 * -622772683 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!aki", name = "v", descriptor = "(I)Z")
	public boolean method13629(@OriginalArg(0) int arg0) {
		return (this.anInt1550 * -622772683 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!aki", name = "u", descriptor = "(I)Z")
	public boolean method13630(@OriginalArg(0) int arg0) {
		return (this.anInt1550 * -622772683 >> 23 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!aki", name = "am", descriptor = "()Z")
	public boolean method13631() {
		return (this.anInt1550 * -622772683 >> 23 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!aki", name = "h", descriptor = "()I")
	public int method13632() {
		return Class122_Sub1.method20238(this.anInt1550 * -622772683, (byte) -14);
	}

	@OriginalMember(owner = "client!aki", name = "g", descriptor = "()I")
	public int method13634() {
		return Class122_Sub1.method20238(this.anInt1550 * -622772683, (byte) -71);
	}

	@OriginalMember(owner = "client!aki", name = "ag", descriptor = "()I")
	public int method13635() {
		return this.anInt1550 * -622772683 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!aki", name = "j", descriptor = "()I")
	public int method13636() {
		return Class122_Sub1.method20238(this.anInt1550 * -622772683, (byte) -51);
	}

	@OriginalMember(owner = "client!aki", name = "l", descriptor = "(I)Z")
	public boolean method13637(@OriginalArg(0) int arg0) {
		return (this.anInt1550 * -622772683 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!aki", name = "f", descriptor = "(I)I")
	public int method13639(@OriginalArg(0) int arg0) {
		return this.anInt1550 * -622772683 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!aki", name = "ah", descriptor = "()I")
	public int method13640() {
		return this.anInt1550 * -622772683 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!aki", name = "al", descriptor = "()I")
	public int method13641() {
		return this.anInt1550 * -622772683 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!aki", name = "ac", descriptor = "()Z")
	public boolean method13642() {
		return (this.anInt1550 * -622772683 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!aki", name = "ai", descriptor = "()Z")
	public boolean method13643() {
		return (this.anInt1550 * -622772683 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!aki", name = "aw", descriptor = "()Z")
	public boolean method13644() {
		return (this.anInt1550 * -622772683 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!aki", name = "i", descriptor = "()I")
	public int method13645() {
		return Class122_Sub1.method20238(this.anInt1550 * -622772683, (byte) -68);
	}

	@OriginalMember(owner = "client!aki", name = "x", descriptor = "(I)Z")
	public boolean method13646(@OriginalArg(0) int arg0) {
		return (this.anInt1550 * -622772683 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!aki", name = "ad", descriptor = "()Z")
	public boolean method13647() {
		return (this.anInt1550 * -622772683 >> 23 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!aki", name = "a", descriptor = "()I")
	public int method13648() {
		return Class122_Sub1.method20238(this.anInt1550 * -622772683, (byte) -50);
	}

	@OriginalMember(owner = "client!aki", name = "au", descriptor = "()Z")
	public boolean method13649() {
		return (this.anInt1550 * -622772683 >> 23 & 0x1) != 0;
	}
}
