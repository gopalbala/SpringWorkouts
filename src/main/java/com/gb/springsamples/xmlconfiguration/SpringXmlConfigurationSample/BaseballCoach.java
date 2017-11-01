package com.gb.springsamples.xmlconfiguration.SpringXmlConfigurationSample;

/**
 * Created by fax6 on 01/11/17.
 */
class BaseballCoach implements Coach{

    FortuneService fortuneService;
public BaseballCoach(){}
    public BaseballCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting and blowling daily.";
    }

    public String getFortune() {
        return fortuneService.getFortune();
    }
}
