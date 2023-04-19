package evaluacion.abril.servicios;

import evaluacion.abril.entidades.estudiante;

import java.util.ArrayList;

public class metodosEst {
        private ArrayList<estudiante> listaEstudiantes = new ArrayList<>();

        public metodosEst(){
            listaEstudiantes.add(new estudiante(12345,"Francisca","Perez","A103",3.4));
            listaEstudiantes.add(new estudiante(23410,"Valeria","Cifuentes","B203",2.3));
            listaEstudiantes.add(new estudiante(56789,"Andres","Garcia","A101",4.4));
            listaEstudiantes.add(new estudiante(10112,"Marlon","Arboleda","A101",3.9));
            listaEstudiantes.add(new estudiante(13141,"Maria Jose","Fernadez","A103",2.1));
            listaEstudiantes.add(new estudiante(89890,"Hernan","Gomez","C103",3.2));
            listaEstudiantes.add(new estudiante(12983,"Andrea","Dominguez","A103",3.4));
            listaEstudiantes.add(new estudiante(98760,"Alejandro","Pabon","B203",1.0));
            listaEstudiantes.add(new estudiante(97961,"Jose","Martinez","A101",4.8));
            listaEstudiantes.add(new estudiante(35467,"Esteban","Escobar","C103",2.9));
        }

        /*public ArrayList<estudiante> MostrarTodosEst(){
            System.out.println("Estudiantes-------");
            for (estudiante e:listaEstudiantes) {
                System.out.println(e.toString());
            }
            return listaEstudiantes;
        }*/

        public ArrayList<estudiante> MostrarTodosEst(){
            EstablecerObservacion();
            return listaEstudiantes;
        }

        public void EstablecerObservacion(){
            for (estudiante e:listaEstudiantes) {
                if(e.getNotaFinal()<3.0){
                    e.setObservacion("reprobado");
                }
                else {
                    e.setObservacion("aprobado");
                }
            }
            /*for (estudiante e:listaEstudiantes) {
                System.out.println(e.toString());
            }*/
        }

        //Elimnar registros de estudiantes que no aprobaron
        /*public ArrayList<estudiante> EliminarReprobados(){
            EstablecerObservacion();
            ArrayList<estudiante> Aprobados = new ArrayList<>();
            for (estudiante e:listaEstudiantes) {
                if(e.getObservacion().equalsIgnoreCase("aprobado")){
                    System.out.println(e.toString());
                    Aprobados.add(e);
                }
            }
            return Aprobados;
        }*/

    public ArrayList<estudiante> EliminarReprobados(){
        EstablecerObservacion();
        ArrayList<estudiante> listaclonada = new ArrayList();
        listaclonada = (ArrayList)listaEstudiantes.clone();
        listaEstudiantes.clear();

        for (estudiante e:listaclonada){
            if(e.getObservacion().equalsIgnoreCase("aprobado")){
                System.out.println(e.toString());
                listaEstudiantes.add(e);
            }
        }

        return listaEstudiantes;
    }

        //Actualizar nota de un estudiante
        public String actualizarNota(int doc, double notaAct){
            String msm="";
            for (estudiante e:listaEstudiantes) {
                if (e.getDocumento()==doc){
                    e.setNotaFinal(notaAct);
                    msm="Se actualizo la nota";
                    break;
                }
                else {
                    msm="No se encontro el documento para actualizar";
                }
            }
            return msm;
        }
}
