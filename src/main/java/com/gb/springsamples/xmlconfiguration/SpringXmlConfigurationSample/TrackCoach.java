package com.gb.springsamples.xmlconfiguration.SpringXmlConfigurationSample;

/**
 * Created by fax6 on 01/11/17.
 */
class TrackCoach implements Coach{
    FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }
    public String getDailyWorkout(){
        return "Run for 30 minutes a day.";
    }

    public String getFortune(){
        return fortuneService.getFortune();
    }
}
