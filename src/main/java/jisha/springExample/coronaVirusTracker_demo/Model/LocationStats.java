package jisha.springExample.coronaVirusTracker_demo.Model;

import lombok.Data;
import lombok.Setter;
import org.springframework.stereotype.Component;



@Component
@Data
public class LocationStats {
    @Setter
    private String state;
    private String country;
    private long totalCases;
    private long DifferenceFromPreviousDay;
//
//    public String getState() {
//        return state;
//    }
//
//    public void setState(String state) {
//        this.state = state;
//    }
//
//    public String getCountry() {
//        return country;
//    }
//
//    public void setCountry(String country) {
//        this.country = country;
//    }
//
//    public long getTotalCases() {
//        return totalCases;
//    }
//
//    public void setTotalCases(long totalCases) {
//        this.totalCases = totalCases;
//    }
}
