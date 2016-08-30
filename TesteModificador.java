class TesteModificador{
	public static void main(String[] args){
		Conta guimaraes = new Conta();
		guimaraes.numero = 1234;
		guimaraes.setLimite(100);

		guimaraes.deposito(100.0);
		
		double valorSerSacado = 20;
		guimaraes.saca(valorSerSacado);
		System.out.println(guimaraes.getSaldo());
	}
}
