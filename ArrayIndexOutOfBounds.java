

public class ArrayIndexOutOfBounds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			int arra[]={4,5,6,7,8,9};
			int i=arra.length;
			System.out.println(arra[7]);
			
		}
		catch (ArrayIndexOutOfBoundsException e){
				System.out.println("Your array size is 5, How can you print the value of 7th position" );
				System.out.println(e.getMessage().toString());
				System.out.println("Above Lines are printed due to ArrayIndexOutOfBoundsException");
				
		}
		
	}
}


