package evaluacion.abril.entidades;

public class estudiante {
    private int documento;
    private String nombre;
    private String apellido;
    private String curso;
    private Double notaFinal;

    private String observacion;

    public estudiante(int documento, String nombre, String apellido, String curso, Double notaFinal) {
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.notaFinal = notaFinal;
    }

    public estudiante(int documento, String nombre, String apellido, String curso, Double notaFinal, String observacion) {
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.notaFinal = notaFinal;
        this.observacion = observacion;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(Double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    @Override
    public String toString() {
        return "estudiante{" +
                "documento=" + documento +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", curso='" + curso + '\'' +
                ", notaFinal=" + notaFinal +
                ", observacion=" + observacion +
                '}';
    }
}
