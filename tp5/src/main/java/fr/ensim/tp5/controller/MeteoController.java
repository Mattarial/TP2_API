package fr.ensim.tp5.controller;

import fr.ensim.tp5.Tp5Application;
import fr.ensim.tp5.model.Address;
import fr.ensim.tp5.model.EtelabAddresse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Controller
public class MeteoController {

    @RequestMapping(value = "/meteo", method = RequestMethod.POST)
    public String meteo(Address address, Model model){


        RestTemplate restTemplate = new RestTemplate();
        EtelabAddresse E_Adresse = restTemplate.getForObject("https://api-adresse.data.gouv.fr/search/?q=" + address.getContent(),EtelabAddresse.class);

        model.addAttribute("addresse",address.getContent());

        model.addAttribute("info_addresse",E_Adresse.getFeatures().get(0).getProperties().getLabel());


        return "meteo";
    }

}
