package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

import java.net.URL;

@OriginalClass("client!rv")
public interface Interface59 {

	@OriginalMember(owner = "client!rv", name = "t", descriptor = "(I)Ljava/net/URL;")
	URL method30887(@OriginalArg(0) int arg0);
}
