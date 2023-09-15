package estudoLab3;
//Recursao, nao usar laco!!!

public class Exercicios_lista1 {
	public void imprimeReverso(int[]array) throws IllegalArgumentException{
		if(array == null) throw new IllegalArgumentException();
		imprimeReverso(array, array.length-1);
		
	} 
	private void imprimeReverso(int[] array, int i) {
		if(i >= 0 ) {
			System.out.println(array[i]);
			imprimeReverso(array, --i);
			}
		}
	public double somaValoresArrayBidimensional(double[][] m) throws IllegalArgumentException {
		if(m == null) throw new IllegalArgumentException();
		return somaValoresArrayBidimensional(m, 0, 0);
	}
	
	private double somaValoresArrayBidimensional(double[][] m, int i, int j) {
		if(i >= m.length) return 0;
		if(j >= m[i].length)return somaValoresArrayBidimensional(m, i+1, 0);
		return m[i][j] + somaValoresArrayBidimensional(m, i, j+1);
		
	}
	public int encontraPosicaoMenorValor(int[] v) throws IllegalArgumentException{
		if(v == null)throw new IllegalArgumentException();
		return encontraPosicaoMenorValor(v, 1, 0);
		
	}
	private int encontraPosicaoMenorValor(int[] v, int i, int posicaoMenor){
		if(i >= v.length) return posicaoMenor;
		if(v[i] < v[posicaoMenor])
			posicaoMenor = i;
		return encontraPosicaoMenorValor(v, i+1, posicaoMenor);
		
	}
	
	public void printPrimaryDiagonal(int[][]m) throws IllegalArgumentException, MatrixNotPossibleException{
		if(m == null) throw new IllegalArgumentException();
		if(m.length != m[0].length)throw new MatrixNotPossibleException();
		printPrimaryDiagonal(m,0);
		
	}
	
	private void printPrimaryDiagonal(int[][] m, int i) {
		if(i < m.length) {
			System.out.println(m[i][i]);
			printPrimaryDiagonal(m, i+1);
		}
		
	}
	public int binaryToDecimal(String s)throws IllegalArgumentException{
		if(s == null || s.length() != 8) throw new IllegalArgumentException();
		return binaryToDecimal(s, 0);
		
	}
	
	private int binaryToDecimal(String s, int i) {
		if (i >= s.length())return 0;
		char digito = s.charAt(s.length()-1-i );
		if(digito =='1') return (int)Math.pow (2,1) + binaryToDecimal(s, i+1);
		
		
		
	}
	

	public static void main(String[] args) {
		String s = "11010001";
		int[]array = {1, 2, -3, 4, 5, -6};
		int[][]arrayBi = {{-1, 2, 3}, {4, -5, 6}, {4, 7, -6}};
		
		Exercicios_lista1 e = new Exercicios_lista1();
		System.out.println(e.binaryToDecimal(s));
		

		}

	}
	
	
	


