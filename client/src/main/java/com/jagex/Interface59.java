package com.jagex;

import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public interface Interface59 {

	@OriginalMember(owner = "client!rr", name = "e", descriptor = "(B)Ljava/net/URL;")
	URL method30938(@OriginalArg(0) byte arg0);
}
