package org.boutwaretech.weightspec.controllers;

import org.boutwaretech.weightspec.domain.Person;
import org.boutwaretech.weightspec.services.iface.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/athletes")
public class AthleteController {

    private PersonService<? extends Person> personService;
    
    @Autowired
    public void setPersonService(PersonService<? extends Person> personService) {
        this.personService = personService;
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("athletes", personService.listAllPersons());
        return "athletes";
    }
    
    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public String athlete(Model model, @PathVariable("id") String personId) {
        return null;
    }
}
