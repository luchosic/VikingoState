
public class Vikingo {
	private  static final int SALUD = 100;
	
	private Estado estado;
	private int salud;

	public Vikingo(){
		estado = new Normal();
		salud  = SALUD;
	}
	
	
	public Estado getEstado() {
		return estado;
	}
	public int getSalud() {
		return salud;
	}

	public void sacudir(){
		estado = estado.sacudir();
	}
	
	public void beber(){
		estado = estado.beber();	
	}

	public void atacarA(Vikingo v) {
		v.recibirDañoDe(this.estado.getDaño());
	}
	
	public void recibirDañoDe(int valor) {
		salud -= (valor-this.estado.getDefensa());
	}

}
