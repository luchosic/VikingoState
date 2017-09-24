
public abstract class Estado {
	private int daño;
	private int defensa;
	public Estado(int daño, int defensa) {
		this.daño = daño;
		this.defensa = defensa;
	}
	public int getDaño() {
		return daño;
	}
	public int getDefensa() {
		return defensa;
	}
	public abstract Estado beber() ;
	public abstract Estado sacudir() ;
}
