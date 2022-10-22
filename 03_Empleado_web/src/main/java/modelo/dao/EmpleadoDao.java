package modelo.dao;

import java.util.List;

import modelo.javabeans.Empleado;

public interface EmpleadoDao {
	
	Empleado buscarUno(int idEmpleado);
	List<Empleado> buscarTodos();
	int altaEmpleado(Empleado empleado);
	int eliminarEmpleado(int idEmpleado);
	boolean eliminarEmpleado(Empleado empleado);

}
