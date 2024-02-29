package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public interface Interface67 {

	@OriginalMember(owner = "client!vt", name = "m", descriptor = "(Lclient!akm;[Lclient!ut;ILclient!ub;)Z")
	boolean method32432(@OriginalArg(0) Class93_Sub23 arg0, @OriginalArg(1) Interface66[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class158 arg3);

	@OriginalMember(owner = "client!vt", name = "n", descriptor = "(Lclient!akm;[Lclient!ut;ILclient!ub;)Z")
	boolean method32433(@OriginalArg(0) Class93_Sub23 arg0, @OriginalArg(1) Interface66[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class158 arg3);

	@OriginalMember(owner = "client!vt", name = "e", descriptor = "(Lclient!akm;[Lclient!ut;ILclient!ub;I)Z")
	boolean method32434(@OriginalArg(0) Class93_Sub23 arg0, @OriginalArg(1) Interface66[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class158 arg3, @OriginalArg(4) int arg4);
}
