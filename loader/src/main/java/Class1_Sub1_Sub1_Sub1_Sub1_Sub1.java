import java.net.URL;
import java.security.AllPermission;
import java.security.CodeSource;
import java.security.Permissions;
import java.security.ProtectionDomain;
import java.security.cert.Certificate;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!k")
final class Class1_Sub1_Sub1_Sub1_Sub1_Sub1 extends Class1_Sub1_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "loader!k", name = "r", descriptor = "I")
	static int anInt56;

	@OriginalMember(owner = "loader!k", name = "p", descriptor = "[I")
	static int[] anIntArray1 = new int[128];

	@OriginalMember(owner = "loader!k", name = "q", descriptor = "Ljava/lang/Object;")
	Object anObject16;

	static {
		@Pc(25) int local25;
		for (local25 = 0; local25 < anIntArray1.length; local25++) {
			anIntArray1[local25] = -1;
		}
		for (local25 = 65; local25 <= 90; local25++) {
			anIntArray1[local25] = local25 + -65;
		}
		for (local25 = 97; local25 <= 122; local25++) {
			anIntArray1[local25] = local25 + -97 + 26;
		}
		for (local25 = 48; local25 <= 57; local25++) {
			anIntArray1[local25] = local25 + 52 - 48;
		}
		anIntArray1[43] = 62;
		@Pc(98) int[] local98 = anIntArray1;
		local98[42] = 62;
		anIntArray1[47] = 63;
		@Pc(108) int[] local108 = anIntArray1;
		local108[45] = 63;
	}

	@OriginalMember(owner = "loader!k", name = "a", descriptor = "(ZLloader!d;Lloader!d;)Lloader!d;")
	static Class1 method35(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) Class1 arg2) {
		((Class1_Sub1_Sub1) arg1).anObject13 = Class3.method25(arg1, (byte) -101);
		if (!arg0) {
			anIntArray1 = null;
		}
		anInt56++;
		((Class1_Sub1) arg1).anObject12 = arg2;
		((Class1_Sub1_Sub1_Sub1) arg1).anObject14 = new Hashtable();
		((Class1_Sub1_Sub1_Sub1_Sub1_Sub1) arg1).anObject16 = new Hashtable();
		@Pc(39) Permissions local39 = new Permissions();
		local39.add(new AllPermission());
		((Class1_Sub1_Sub1_Sub1_Sub1) arg1).anObject15 = new ProtectionDomain(new CodeSource(null, (Certificate[]) null), local39);
		return arg1;
	}

	@OriginalMember(owner = "loader!k", name = "<init>", descriptor = "(I)V")
	Class1_Sub1_Sub1_Sub1_Sub1_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}
}
