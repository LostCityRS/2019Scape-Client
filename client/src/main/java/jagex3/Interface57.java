package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public interface Interface57 {

	@OriginalMember(owner = "client!rn", name = "l", descriptor = "(Ljava/lang/String;)Z")
	boolean method31795(@OriginalArg(0) String arg0);

	@OriginalMember(owner = "client!rn", name = "n", descriptor = "(Ljava/lang/String;I)Z")
	boolean method31796(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!rn", name = "d", descriptor = "()Z")
	boolean method31797();

	@OriginalMember(owner = "client!rn", name = "e", descriptor = "(Ljava/lang/String;B)V")
	void method31798(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) throws Exception_Sub1;

	@OriginalMember(owner = "client!rn", name = "f", descriptor = "(Ljava/lang/String;)V")
	void method31799(@OriginalArg(0) String arg0) throws Exception_Sub1;

	@OriginalMember(owner = "client!rn", name = "w", descriptor = "(Ljava/lang/String;)V")
	void method31800(@OriginalArg(0) String arg0) throws Exception_Sub1;

	@OriginalMember(owner = "client!rn", name = "u", descriptor = "(Ljava/lang/String;)Z")
	boolean method31801(@OriginalArg(0) String arg0);

	@OriginalMember(owner = "client!rn", name = "k", descriptor = "(Ljava/lang/String;)V")
	void method31802(@OriginalArg(0) String arg0) throws Exception_Sub1;

	@OriginalMember(owner = "client!rn", name = "z", descriptor = "(Ljava/lang/String;)Z")
	boolean method31803(@OriginalArg(0) String arg0);

	@OriginalMember(owner = "client!rn", name = "p", descriptor = "(Ljava/lang/String;)Z")
	boolean method31804(@OriginalArg(0) String arg0);

	@OriginalMember(owner = "client!rn", name = "m", descriptor = "(I)Z")
	boolean method31805(@OriginalArg(0) int arg0);
}
