package evaluacion.abril.controlador;

import evaluacion.abril.entidades.estudiante;
import evaluacion.abril.servicios.metodosEst;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin(origins = "*",maxAge = 3600)
@RestController
public class contEst {
    metodosEst estudiantess = new metodosEst();

    @GetMapping("/verTodosEsts")
    public ArrayList<estudiante> mostrar(){
        return estudiantess.MostrarTodosEst();
    }

    @GetMapping("/eliminarReprobados")
    public ArrayList<estudiante> aprobados(){
        return estudiantess.EliminarReprobados();
    }

    @PutMapping("/actualizarNota/{doc}/{nota}")
    public String actualizar(@PathVariable("doc") int doc,@PathVariable("nota") double nota){
        return estudiantess.actualizarNota(doc,nota);
    }

    public void obs(){
        estudiantess.EstablecerObservacion();
    }

}
