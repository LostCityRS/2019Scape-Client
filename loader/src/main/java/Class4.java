import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!k")
final class Class4 {

	@OriginalMember(owner = "loader!k", name = "a", descriptor = "I")
	static int anInt37;

	@OriginalMember(owner = "loader!k", name = "a", descriptor = "([BBLloader!e;)[B")
	static byte[] method28(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) Class1 arg2) throws IllegalBlockSizeException, BadPaddingException {
		anInt37++;
		return arg1 == -76 ? ((Cipher) ((Class1_Sub1) arg2).anObject12).doFinal(arg0) : (byte[]) null;
	}
}
