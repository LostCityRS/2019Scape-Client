package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public interface Interface58 {

	@OriginalMember(owner = "client!rq", name = "e", descriptor = "(I)Z")
	boolean method31856(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!rq", name = "i", descriptor = "()Z")
	boolean method31857();

	@OriginalMember(owner = "client!rq", name = "u", descriptor = "(Ljava/lang/String;)V")
	void method31858(@OriginalArg(0) String arg0) throws Exception_Sub7;

	@OriginalMember(owner = "client!rq", name = "t", descriptor = "(Ljava/lang/String;I)V")
	void method31859(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) throws Exception_Sub7;

	@OriginalMember(owner = "client!rq", name = "l", descriptor = "(Ljava/lang/String;)V")
	void method31860(@OriginalArg(0) String arg0) throws Exception_Sub7;

	@OriginalMember(owner = "client!rq", name = "g", descriptor = "()Z")
	boolean method31861();

	@OriginalMember(owner = "client!rq", name = "f", descriptor = "(Ljava/lang/String;I)Z")
	boolean method31862(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!rq", name = "m", descriptor = "(Ljava/lang/String;)Z")
	boolean method31863(@OriginalArg(0) String arg0);
}
