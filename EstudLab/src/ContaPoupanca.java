
public class ContaPoupanca extends ContaBancaria implements Rentavel{
	private double taxaRendimento;

	@Override
	public void saca(double valor) {
		setSaldo(getSaldo() - valor);	
	}

	@Override
	public void deposita(double valor) {
		setSaldo(getSaldo() + valor);

	}

	public ContaPoupanca(String senha) {
		super(senha);
		
	}
	

	public ContaPoupanca(String senha, double taxaRendimento) {
		super(senha);
		this.taxaRendimento = taxaRendimento;
	}

	@Override
	public void tiraExtrato() {
		System.out.println(this.toString());
	}


	public double getTaxaRendimento() {
		return taxaRendimento;
	}

	public void setTaxaRendimento(double taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}

	@Override
	public String toString() {
		return "CpntaPoupanca [taxaRendimento=" + taxaRendimento + ", toString()=" + super.toString() + "]";
	}

	@Override
	public double calculaRendimento() {
		return super.getSaldo()* this.taxaRendimento;
	}
}
