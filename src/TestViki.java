import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class TestViki {

	@Test
	public void atacaNormal() {
		Vikingo v = new Vikingo();
		Vikingo v2 = new Vikingo();
		v.atacarA(v2);
		Assert.assertEquals(95, v2.getSalud());
	}
	@Test
	public void sacudirNormal() {
		Vikingo v = new Vikingo();
		v.sacudir();
		Assert.assertEquals(v.getEstado().getClass() , Enojado.class);
	}

	@Test
	public void sacudirEbrio() {
		Vikingo v = new Vikingo();
		v.beber();
		v.sacudir();
		Assert.assertEquals(v.getEstado().getClass() , Normal.class);
	}

	@Test
	public void sacudirEnojado() {
		Vikingo v = new Vikingo();
		v.sacudir();
		v.sacudir();
		Assert.assertEquals(v.getEstado().getClass() , Enojado.class);
	}
	@Test
	public void beberEnojado() {
		Vikingo v = new Vikingo();
		v.sacudir();
		v.sacudir();
		v.beber();
		Assert.assertEquals(v.getEstado().getClass() , Normal.class);
	}

	
}
