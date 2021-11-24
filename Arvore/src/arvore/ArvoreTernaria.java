
package arvore;

public class ArvoreTernaria {
	No raiz;

	public ArvoreTernaria() {
		raiz = null;
	}

	public No getRaiz() {
		return raiz;
	}

	public void insere(int info) {
		No p, ant = null;
		boolean inseriu = false;
		if (raiz == null)
			raiz = new No(info);
		else {
			p = raiz;
			while ((p != null) && (!inseriu)) {
				if (p.getTl() == 1) {
					if (info < p.getInfo1()) {
						p.setInfo2(p.getInfo1());
						p.setInfo1(info);
					} else
						p.setInfo2(info);
					p.setTl(2);
					inseriu = true;
				} else {
					ant = p;
					if (info < p.getInfo1())
						p = p.getLig1();
					else if (info < p.getInfo2())
						p = p.getLig2();
					else
						p = p.getLig3();
				}
			}
			if (!inseriu) {
				if (info < ant.getInfo1())
					ant.setLig1(new No(info));
				else if (info < ant.getInfo2())
					ant.setLig2(new No(info));
				else
					ant.setLig3(new No(info));
			}
		}
	}

	public void exibe(No raiz) {
		if (raiz != null) {
			exibe(raiz.getLig1());
			System.out.println(raiz.getInfo1());
			if (raiz.getInfo2() != 0)
				System.out.println(raiz.getInfo2());
			exibe(raiz.getLig2());
			exibe(raiz.getLig3());

		}
	}
}
