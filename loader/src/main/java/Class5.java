import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!i")
final class Class5 {

	@OriginalMember(owner = "loader!i", name = "a", descriptor = "I")
	static int anInt47;

	@OriginalMember(owner = "loader!i", name = "a", descriptor = "([BLloader!d;Z)[B")
	static byte[] method29(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) boolean arg2) throws IllegalBlockSizeException, BadPaddingException {
		if (arg2) {
			anInt47++;
			return ((Cipher) ((Class1_Sub1) arg1).anObject12).doFinal(arg0);
		} else {
			return (byte[]) null;
		}
	}
}
