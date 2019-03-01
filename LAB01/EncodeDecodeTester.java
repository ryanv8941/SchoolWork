package LAB01;

public class EncodeDecodeTester {

	public static void main(String[] args) {
		String[] originalList = {"abcdABCDxyzXYZ" , "1234567890" , "He11O", "!nV41iD Ch@r$" , "fCjJm"};
		
		EncodeDecode encoder = new EncodeDecode(originalList);
		System.out.println("The original list is: ");
		for (int i = 0; i < originalList.length; i++) {
			System.out.println(originalList[i]);
		}
		System.out.println();
		
		System.out.println("The encoded list is: ");
		for (int i = 0; i < encoder.getEncodedList().length; i++) {
			System.out.println(encoder.getEncodedList()[i]);
		}
		System.out.println();
		
		System.out.println("The decoded list is: ");
		for (int i = 0; i < encoder.getDecodedList().length; i++) {
			System.out.println(encoder.getDecodedList()[i]);
		}
	}
}

