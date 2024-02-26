package com.jagex;

import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!asx")
public final class PacketGl extends Packet {

	@OriginalMember(owner = "client!asx", name = "<init>", descriptor = "(I)V")
	PacketGl(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!asx", name = "jp", descriptor = "(F)V")
	void method23416(@OriginalArg(0) float arg0) {
		@Pc(2) int local2 = Stream.floatToRawIntBits(arg0);
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) local2;
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (local2 >> 8);
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (local2 >> 16);
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (local2 >> 24);
	}

	@OriginalMember(owner = "client!asx", name = "ji", descriptor = "(F)V")
	void method23417(@OriginalArg(0) float arg0) {
		@Pc(2) int local2 = Stream.floatToRawIntBits(arg0);
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) local2;
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (local2 >> 8);
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (local2 >> 16);
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (local2 >> 24);
	}

	@OriginalMember(owner = "client!asx", name = "js", descriptor = "(F)V")
	void method23418(@OriginalArg(0) float arg0) {
		@Pc(2) int local2 = Stream.floatToRawIntBits(arg0);
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) local2;
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (local2 >> 8);
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (local2 >> 16);
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (local2 >> 24);
	}

	@OriginalMember(owner = "client!asx", name = "jb", descriptor = "(F)V")
	void method23419(@OriginalArg(0) float arg0) {
		@Pc(2) int local2 = Stream.floatToRawIntBits(arg0);
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (local2 >> 24);
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (local2 >> 16);
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (local2 >> 8);
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) local2;
	}

	@OriginalMember(owner = "client!asx", name = "je", descriptor = "(F)V")
	void method23420(@OriginalArg(0) float arg0) {
		@Pc(2) int local2 = Stream.floatToRawIntBits(arg0);
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (local2 >> 24);
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (local2 >> 16);
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (local2 >> 8);
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) local2;
	}

	@OriginalMember(owner = "client!asx", name = "jf", descriptor = "(F)V")
	void method23421(@OriginalArg(0) float arg0) {
		@Pc(2) int local2 = Stream.floatToRawIntBits(arg0);
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (local2 >> 24);
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (local2 >> 16);
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (local2 >> 8);
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) local2;
	}

	@OriginalMember(owner = "client!asx", name = "jg", descriptor = "(F)V")
	void method23422(@OriginalArg(0) float arg0) {
		@Pc(2) int local2 = Stream.floatToRawIntBits(arg0);
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (local2 >> 24);
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (local2 >> 16);
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (local2 >> 8);
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) local2;
	}

	@OriginalMember(owner = "client!asx", name = "jc", descriptor = "(F)V")
	void method23423(@OriginalArg(0) float arg0) {
		@Pc(2) int local2 = Stream.floatToRawIntBits(arg0);
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) local2;
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (local2 >> 8);
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (local2 >> 16);
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (local2 >> 24);
	}

	@OriginalMember(owner = "client!asx", name = "ja", descriptor = "(F)V")
	void method23424(@OriginalArg(0) float arg0) {
		@Pc(2) int local2 = Stream.floatToRawIntBits(arg0);
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) local2;
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (local2 >> 8);
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (local2 >> 16);
		this.data[(this.pos += 1034180571) * -1380987821 - 1] = (byte) (local2 >> 24);
	}
}
