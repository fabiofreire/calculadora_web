import javax.faces.bean.ManagedBean;

@ManagedBean
public class CalculadoraMB {
	private double x;
	private double y;
	private double r;
	private CalculadoraInterface c;
	
	public double getX() { return x; }
	public double getY() { return y; }
	public double getR() { return r; }
	public void setX(double x) { this.x = x; }
	public void setY(double y) { this.y = y; }
	public void setR(double r) { this.r = r; }

	public CalculadoraMB() { 
		this.c = new CalculadoraLib();
	}
	
	public void som() {
		this.setR(c.soma(this.x, this.y));
	}
	
	public void sub() {
		this.setR(c.subtracao(this.x, this.y));
	}
	
	public void dividir() {
		this.setR(c.divisao(this.x, this.y));
	}
	
	public void mul() {
		this.setR(c.multiplicacao(this.x, this.y));
	}
}
