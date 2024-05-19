
public class Usuario {
	public static void main (String[] args) {
		SmartTv smartTv = new SmartTv();
		System.out.println("A TV está ligada? "+smartTv.ligada);
		System.out.println("Em qual canal a TV está ligada? "+smartTv.canal);
		System.out.println("E qual o volume da TV agora? "+smartTv.volume);
		
		smartTv.ligar();
		System.out.println("Agora, a TV está ligada? "+smartTv.ligada);
		smartTv.ligar();
	}
}
