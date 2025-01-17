package dcc.tp2.enseignantservice.client;

import lombok.Getter;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "Chercheur-service", url = "http://localhost:8083")
public interface ChercheurRestFeign {

    @GetMapping("/Chercheurs/Enseignant/{id}")
    Long nb_chercheur_Enseignant(@PathVariable Long id);

}
