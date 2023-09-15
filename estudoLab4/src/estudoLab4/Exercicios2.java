package estudoLab4;

public class Exercicios2 {
	public int exercicio7(int d, int n)throws IllegalArgumentException{
		if(d<0 || n<0 ||  d>9) throw new IllegalArgumentException();
		return exercicio7r(d, n);	
		
	}
	private int exercicio7r(int d, int n){
		if(n == 0)return 0;
		return n %10 == d? 1 + exercicio7r(d, n/10) : exercicio7r(d, n/10);
		}
	public double exercicio8(int n) throws IllegalArgumentException{
		if(n<=0)throw new IllegalArgumentException();
		return exercicio8(n, 0, 0);
		
	}
	private double exercicio8(int n, double soma, int quantDigitos) {
		if(n == 0) return soma/quantDigitos;
		return exercicio8(n/10, soma + (n%10), quantDigitos +1);
		
	}
	public boolean exercicio9(int n)throws IllegalArgumentException {
		if(n<=0) throw new IllegalArgumentException();
		return exercicio9(n, 0, 1);
		
	}
	private boolean exercicio9(int n, int soma, int i){
		if(i == n) return soma == n;
		if(n % i == 0)
			return exercicio9(n, soma +i, i+1);
		return exercicio9(n, soma, i+1);
		
		
	}
	
	public static void main(String[] args) {
		Exercicios2 e = new Exercicios2();
		System.out.println(e.exercicio9(28));
	}
	
	
}
