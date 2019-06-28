package ru.creditpilot.gateway.backend.controller.REST;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


//getMonthlyDealersFees.do?mm=01&yy=2018&companyId=4
@RestController
@RequestMapping(value = "reports/accounting/")
public class DealerController {
    @GetMapping(value = "/getMonthlyDealersFees.do")
    ResponseEntity getXml(@RequestParam String mm,
                          @RequestParam String yy,
                          @RequestParam Long   companyId){

        System.out.println();
        return null;
    }
}
