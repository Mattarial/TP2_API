package fr.ensim.tp5.controller;

import fr.ensim.tp5.model.Address;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class InsertAddressController {

    @GetMapping("addresse")
    public String formAddresse(){

        /*String form =
                "<html>" +
                        "<body>" +
                            "<form action='/meteo' method='post'>" +
                                "<div>" +
                                  "<label for='address'>Please input your address:</label>" +
                                  "<input name='address' id='address'>" +
                                "</div>" +
                                "<div>" +
                                  "<button>Get the weather at the given address !</button>" +
                                "</div>" +
                            "</form>" +
                        "</body>" +
                "</html>";

        return form;*/
        return "addresse";
    }



}
