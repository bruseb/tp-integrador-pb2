package ar.unlam.intraconsulta;

import java.time.LocalDate;

public class Alumno {

	private String nombreAlumno;
	private String apellidoAlumno;
	private Integer dniAlumno;
	private LocalDate fechaDeIngreso;

	public Alumno(String nombreAlumno, String apellidoAlumno, Integer dniAlumno, LocalDate fechaDeIngreso) {

		this.nombreAlumno = nombreAlumno;
		this.apellidoAlumno = apellidoAlumno;
		this.dniAlumno = dniAlumno;
		this.fechaDeIngreso = fechaDeIngreso;

	}

	public Alumno() {
		// TODO Auto-generated constructor stub
	}

	public Alumno(Integer dniAlumno2) {
		this.dniAlumno = dniAlumno2;
	}

	public String getNombreAlumno() {
		return nombreAlumno;
	}

	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}

	public String getApellidoAlumno() {
		return apellidoAlumno;
	}

	public void setApellidoAlumno(String apellidoAlumno) {
		this.apellidoAlumno = apellidoAlumno;
	}

	public Integer getDniAlumno() {
		return dniAlumno;
	}

	public void setDniAlumno(Integer dniAlumno) {
		this.dniAlumno = dniAlumno;
	}

	public LocalDate getFechaDeIngreso() {
		return fechaDeIngreso;
	}

	public void setFechaDeIngreso(LocalDate fechaDeIngreso) {
		this.fechaDeIngreso = fechaDeIngreso;
	}

	
}
