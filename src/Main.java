import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {

		
		Queue<Hasta> acilServis = new PriorityQueue<Hasta>();
		
		acilServis.offer(new Hasta ("Cemal","Geçer"));
		acilServis.offer(new Hasta ("Okan","Bas Agrısı"));
		acilServis.offer(new Hasta ("Elif","Apandısıt"));
		acilServis.offer(new Hasta ("Oguz","Yanık"));
		acilServis.offer(new Hasta ("Merve","Yanık"));
		acilServis.offer(new Hasta ("Gızem","Apandısıt"));
		
		int i = 1;
		
		while (acilServis.isEmpty() != true) {
			
			System.out.println("***************************");
			System.out.println(i + ".sırada");
			System.out.println(acilServis.poll());
			System.out.println("***************************");
			
			i++;
			
		}
		
		
	}

}
