package modelo.javabeans;

import java.io.Serializable;
import java.util.Objects;

public class Empleado implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int idEmpleado;
	private String nombre;
	private  double salario;
	
	public Empleado() {
		// TODO Auto-generated constructor stub
	}

	public Empleado(int idEmpleado, String nombre, double salario) {
		super();
		this.idEmpleado = idEmpleado;
		this.nombre = nombre;
		this.salario = salario;
	}

	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idEmpleado);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Empleado))
			return false;
		Empleado other = (Empleado) obj;
		return idEmpleado == other.idEmpleado;
	}

	@Override
	public String toString() {
		return "Empleado [idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", salario=" + salario + "]";
	}
	
	//luego aquí vendrán los metodos propios de la clase (video05/10/2022 21:21)
	public double salarioMensual(int meses) {
		return salario/meses;
	}
	
}
