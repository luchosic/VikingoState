
public class Ebrio extends Estado {

	public Ebrio(){
		super(7,2);
	}
	
	@Override
	public final Estado beber() {
		return this;
	}
	@Override
	public final Estado sacudir() {
		return new Normal();
	}
	
}
