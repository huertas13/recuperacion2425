package fpDual.documentacion;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import fpDual.persona.Alumno;
import fpDual.persona.TutorDocente;
import fpDual.persona.TutorLaboral;

public class Convenio {

	private int cod;
	private static int contador = 1;
	private Empresa empresa;
	private int numAlumnos;
	private List<Alumno> alumnos;
	private LocalDate firmaTutorLaboral;
	private LocalDate firmaTutorDocente;
	private TutorDocente tutorDocente;
	private TutorLaboral tutorLaboral;



	public Convenio (Empresa empresa, int numAlumnos) {
		
			if (empresa.getNumTrabajadores() < numAlumnos * 2) {
				
				throw new IllegalArgumentException("Debe haber al menos dos empleados por cada alumno");
				
				
			}
		
		this.cod = contador ++;
		this.empresa = empresa;
		this.numAlumnos = numAlumnos;
		this.alumnos = new ArrayList<Alumno>();
		this.firmaTutorDocente = null;
		this.firmaTutorLaboral = null;
		this.tutorDocente = null;
		this.tutorLaboral = null;
		
	}



	public boolean completo() {
		
		return this.numAlumnos == alumnos.size();
	}
	
	
	public void resumen(){
		
		
		if ()
		
		
	}






























}
