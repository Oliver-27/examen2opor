package ito.poo.app;
import java.time.LocalDate;
import ito.poo.clases.sim;
public class myApp {
    
	static void run() {
		sim x; 
		x= new sim(271134567,50,20,LocalDate.of(21, 6, 8));
		System.out.println(x);
		System.out.println("Recarga="+x.getUltimaRecarga());
		System.out.println("Saldo nuevo="+x.hacerRecarga(50));
	}
	public static void main(String[] args) {
		run();
	}

}
