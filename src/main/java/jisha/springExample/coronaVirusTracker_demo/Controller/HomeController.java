package jisha.springExample.coronaVirusTracker_demo.Controller;

import jisha.springExample.coronaVirusTracker_demo.Model.LocationStats;
import jisha.springExample.coronaVirusTracker_demo.Services.CoronaVirusDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@ComponentScan
@Controller
@RequestMapping("/home/Covid19/Tracker")
public class HomeController {

    @Autowired
    CoronaVirusDataService service;
    @GetMapping("/HomePage")
    public String Home(Model model){
        List<LocationStats> data=service.getAllStats();
    model.addAttribute("Data",data);
    model.addAttribute("totalCases",data.stream().mapToLong(stas->stas.getTotalCases()).sum());
        model.addAttribute("totalNewCases",data.stream().mapToLong(stas->stas.getDifferenceFromPreviousDay()).sum());
        return "Home";
    }
}
