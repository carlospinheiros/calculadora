package test;

public class Calculadora {

	public double soma(double i, double j) {
		return i+j;
	}

	public double subtracao(double i, double j) {
		return i-j;
	}
	
	public double multiplicacao(double i, double j) {
		return i*j;
	}
	
	public double divisao(double i, double j) {
		if (j == 0) {
			throw new divisaoPorZeroException("Não é possível dividir por zero!");
		}
		return i/j;
	}
	
	public double exponenciacao(double i, double j) {
		return Math.pow(i,j);
	}
	
	public double raizquadrada(double k) {
		return Math.sqrt(k);
	}
	
	@SuppressWarnings("serial")
	public class divisaoPorZeroException extends ArithmeticException  {
		public divisaoPorZeroException(String msg) {
			super(msg);
		}
	}

}
