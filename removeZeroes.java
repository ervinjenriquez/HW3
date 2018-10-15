import java.util.ArrayList;

public class removeZeroes {

	public static ArrayList<Integer> list1 = new ArrayList<Integer>();

	public static ArrayList removeZeroes(ArrayList<Integer> newList) {
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		for (int i = 0; i < list1.size() - 1; i++ ) {
			if (list1.get(i) == 0) {
				//Do nothing
			} else if (list1.get(i) != 0) {
				list2.add(list1.get(i));
			} else {
				System.out.println("Error");
			}
		}
		return list2;
	}
	
	public static void main(String[] args) {
		
		//Create list
		list1.add(0);
		list1.add(4);
		list1.add(5);
		list1.add(0);
		list1.add(6);
		list1.add(0);
		list1.add(1);
		
		System.out.print("The initial array is: ");
		System.out.print(list1);
		System.out.println("");
		System.out.print("The new array is: ");
		System.out.print(removeZeroes(list1));
		
	}

}
