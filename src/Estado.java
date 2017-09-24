
public abstract class Estado {
	private int da�o;
	private int defensa;
	public Estado(int da�o, int defensa) {
		this.da�o = da�o;
		this.defensa = defensa;
	}
	public int getDa�o() {
		return da�o;
	}
	public int getDefensa() {
		return defensa;
	}
	public abstract Estado beber() ;
	public abstract Estado sacudir() ;
}
