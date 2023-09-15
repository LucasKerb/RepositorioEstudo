package estudoLab2;

public class Main {

	public static void main(String[] args) {
		Arcondicionado ar = new Arcondicionado();
		
		System.out.println("Aumentando a temperatura em 30");
		ar.aumentaTemperatura(30);
		
		System.out.println("Aumentando a temperatura em 30");
		try{
		ar.aumentaTemperatura_2(30);
		}catch(IllegalArgumentException e) {
			System.out.println("Erro: temperatura invalida, temperatura mantida em:" +ar.getTemperaturaAtual());
		}
		System.out.println("Fim do programa");
		
		

	}

}
