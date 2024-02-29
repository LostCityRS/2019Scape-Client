import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!k")
final class Class727 {

	@OriginalMember(owner = "loader!k", name = "a", descriptor = "I")
	static int anInt6005;

	@OriginalMember(owner = "loader!k", name = "a", descriptor = "([BBLloader!e;)[B", line = 7)
	static final byte[] method36971(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) Class724 arg2) throws IllegalBlockSizeException, BadPaddingException {
		anInt6005++;
		return arg1 == -76 ? ((Cipher) ((Class724_Sub1) arg2).anObject39).doFinal(arg0) : (byte[]) null;
	}
}
