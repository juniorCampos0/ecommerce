package br.ufrn.imd.ecommerce.controllers;

import br.ufrn.imd.ecommerce.dtos.RegistrationClientDTO;
import br.ufrn.imd.ecommerce.dtos.RegistrationVendorDTO;
import br.ufrn.imd.ecommerce.services.RegistrationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = {"/api/v1/registration"})
@AllArgsConstructor
public class RegistrationController {

    private final RegistrationService registrationService;

    @PostMapping(value = "register-costumer")
    public String registerCostumer(@RequestBody RegistrationClientDTO request){
        return registrationService.registerCostumer(request);
    }

    @PostMapping(value = "register-vendor")
    public String registerVendor(@RequestBody RegistrationVendorDTO request){
        return registrationService.registerVendor(request);
    }

    @GetMapping
    public void confirm(@RequestParam String token ){
        registrationService.confirmToken(token);
    }

}
