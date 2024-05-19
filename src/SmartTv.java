
public class SmartTv {

	boolean ligada=false;
	int canal=1;
	int volume=1;
	int volumeAntesDoMudo;
	
	public void ligar() {
		if(ligada==false) {
			System.out.println("Tentando ligar a TV...");
			System.out.println("Agora a TV está ligada");
			ligada=true;
		}else {
			System.out.println("Tentando ligar a TV...");
			System.out.println("A TV já está ligada, não farei nada!");
		}
	}
	
	public void desligar() {
		if(ligada==true) {
			System.out.println("Tentando desligar a TV...");
			System.out.println("Agora a TV está desligada");
			ligada=false;
		}else {
			System.out.println("Tentando desligar a TV...");
			System.out.println("A TV já está desligada, não farei nada!");
		}
	}
	
	public void aumentarVolume() {
		if(volume<100) {
			System.out.println("Tentando aumentar o volume da TV...");
			volume++;
			System.out.println("Volume aumentado com sucesso, agora o volume é "+volume);
		}else {
			System.out.println("Tentando aumentar o volume da TV...");
			System.out.println("O volume já está no máximo, não farei nada!");
		}
	}
	
	public void abaixarVolume() {
		if(volume>0) {
			System.out.println("Tentando diminuir o volume da TV...");
			volume--;
			System.out.println("Volume diminuido com sucesso, agora o volume é "+volume);
		}else {
			System.out.println("Tentando diminuir o volume da TV...");
			System.out.println("O volume já está no mínimo, não farei nada!");
		}
	}
	public void mutarVolume() {
		volumeAntesDoMudo=volume;
		volume=0;
		System.out.println("Agora a TV está no mudo!");
	}
	
	public void desmutarVolume() {
		volume=volumeAntesDoMudo;
		volumeAntesDoMudo=0;
		System.out.println("Agora a TV não está mais no mudo!");
	}
	
	public void aumentarCanal() {
		System.out.println("Tentando aumentar o canal da TV...");
		canal++;
		System.out.println("Canal aumentado para "+canal);
	}
	
	public void diminuirCanar() {
		System.out.println("Tentando diminuir o canal da TV...");
		canal--;
		System.out.println("Canal diminuido para "+canal);
	}
	
	public void mudarCanal(int novoCanal) {
		System.out.println("Tentando mudar do canal "+canal+" para o canal "+novoCanal);
		canal = novoCanal;
		System.out.println("Canal mudado com sucesso!");
	}
}
