
package arvore;

public class Aplicacao_N_Area {
	ArvoreTernaria avr;

	public Aplicacao_N_Area() {
		avr = new ArvoreTernaria();
	}

	public void executa() {
		avr.insere(20);
		avr.insere(15);
		avr.insere(40);
		avr.insere(17);
		avr.insere(31);
		avr.insere(9);
		avr.exibe(avr.getRaiz());
	}

	public static void main(String[] args) {
		Aplicacao_N_Area a = new Aplicacao_N_Area();
		a.executa();
	}
}
