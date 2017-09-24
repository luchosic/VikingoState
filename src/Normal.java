
public class Normal extends Estado {
	
	
	public Normal(){
		super(10,5);
	}
	
	@Override
	public final Estado beber() {
		return new Ebrio();
	}
	@Override
	public final Estado sacudir() {
		return new Enojado();
	}
	
}
