package classroom;

public class Asignatura {

    String nombre;
    String n = nombre;
    int codigoInterno;
    int codigoExterno;

    Asignatura() {
        this("Sin nombre");
    }

    Asignatura(int codigo, String tipo) {
    	if(tipo == "Interno") {
    		nombre="Sin nombre"; codigoInterno=codigo;
    	}
    	else if(tipo=="Externo"){
    		nombre="Sin nombre"; codigoExterno=codigo;
    	}
    }

    Asignatura(String nombre) {
        this(nombre, 0, 0);
    }

    Asignatura(String nombre, int codigoInterno, int codigoExterno) {
        this.nombre = nombre;
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
    }

    void cambiarDatos(int codigoInterno, int codigoExterno, String nombre) {
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
        this.nombre = nombre;
    }

    void cambiarDatosI(int codigoInterno) {
        this.codigoInterno = codigoInterno;
    }

    void cambiarDatosE(int codigoExterno) {
        this.codigoExterno = codigoExterno;
    }

    void cambiarDatos(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigoInterno(int codigoInterno) {
        this.codigoInterno = codigoInterno;
    }
    
    public void setCodigoInterno(double codigoInterno) {
        this.codigoInterno = (int) codigoInterno;
    }
}
