package calculos;

public class PegarMaxMIn {
	public static void main(String[] args) {
		System.out.println("Máximo: "+ Math.max(5,10));
		System.out.println("Mínimo: "+ Math.min(5,10));

		double a = 3.5;
		System.out.println("Ceil: "+ Math.ceil(a));
		System.out.println("Floor: "+ Math.floor(a));
		
		int[] arr = { 4,2,5,3,6};
		int max2 = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			max2 = Math.max(max2, arr[i]);
		}
		System.out.println("Max: "+max2);
	}
}
