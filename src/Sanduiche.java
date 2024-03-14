import java.util.ArrayList;

abstract public class Sanduiche {
	String nome;
	String pao;
	String implemento;
	ArrayList molhos = new ArrayList();

	public String getName() {
		return nome;
	}

	public void prepare() {
		System.out.println("Preparando " + nome);
	}

	public void bake() {
		System.out.println("Assando " + nome);
	}

	public void cut() {
		System.out.println("Cortando " + nome);
	}

	public void box() {
		System.out.println("Entregando " + nome);
	}

	public String toString() {
		// code to display pizza name and ingredients
		StringBuffer display = new StringBuffer();
		display.append("---- " + nome + " ----\n");
		display.append(pao + "\n");
		display.append(implemento + "\n");
		for (int i = 0; i < molhos.size(); i++) {
			display.append((String )molhos.get(i) + "\n");
		}
		return display.toString();
	}
}
