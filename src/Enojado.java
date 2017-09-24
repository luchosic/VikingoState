
public class Enojado extends Estado {

	public Enojado(){
		super(30,0);
	}
	
	@Override
	public final Estado beber() {
		return new Normal();
	}
	@Override
	public final Estado sacudir() {
		return this;
	}
}
