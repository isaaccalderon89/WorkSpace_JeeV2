package modelo.dao;

import java.util.ArrayList;
import java.util.List;

import modelo.javabeans.Empleado;

public class EmpleadoDaoImplList implements EmpleadoDao {
	
	private List<Empleado> lista;
	
	public EmpleadoDaoImplList() {
		lista = new ArrayList<>();
		cargarDatos();
	}
	
	private void cargarDatos() {
		lista.add(new Empleado(114, "Raphaelly", 110000));
		lista.add(new Empleado(115, "Koo", 20000));
		lista.add(new Empleado(116, "Baida", 30000));
		lista.add(new Empleado(117, "Colmenares", 24000));
		lista.add(new Empleado(118, "Himuro", 15000));
		lista.add(new Empleado(119, "Tobias", 22000));
		
	}
	
	
	
	
	
	

	public List<Empleado> getLista() {
		return lista;
	}

	public void setLista(List<Empleado> lista) {
		this.lista = lista;
	}

	@Override
	public Empleado buscarUno(int idEmpleado) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Empleado> buscarTodos() {
		// TODO Auto-generated method stub
		return lista;
	}

	@Override
	public int altaEmpleado(Empleado empleado) {
		if (!lista.contains(empleado)) {//Si la lista no contiene al empleado
			lista.add(empleado);//<---- AÑADIMOS AL EMPLEADO
			return 1;
		}
		return 0;
	}

	@Override
	public int eliminarEmpleado(int idEmpleado) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean eliminarEmpleado(Empleado empleado) {
		 return lista.remove(empleado);
	}
	

}
