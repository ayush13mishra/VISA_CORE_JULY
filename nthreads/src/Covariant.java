import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Covariant {

	public static void main(String[] args) {
		Object[] elems = new String[3]; // valid

		elems[0] = "A";
		elems[1] = new Date();
	}

}
