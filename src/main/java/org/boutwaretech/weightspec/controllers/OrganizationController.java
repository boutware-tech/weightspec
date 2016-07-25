package org.boutwaretech.weightspec.controllers;

import org.boutwaretech.weightspec.domain.Organization;
import org.boutwaretech.weightspec.services.iface.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/organizations")
public class OrganizationController {

    private OrganizationService<? extends Organization> organizationService;
    
    @Autowired
    public void setOrganizationService(OrganizationService<? extends Organization> organizationService) {
        this.organizationService = organizationService;
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("organizations", organizationService.listAllOrganizations());
        return "organizations";
    }
    
    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public String organization(Model model, @PathVariable("id") String orgId) {
        return null;
    }
}
