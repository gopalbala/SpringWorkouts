package com.gb.springsamples.xmlconfiguration.SpringXmlConfigurationSample;

/**
 * Created by fax6 on 01/11/17.
 */
public class CricketCoach implements Coach {

    FortuneService fortuneService;

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    String emailAddress;
    String teamName;


    public void setFortuneService(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    public FortuneService getFortuneService(){
        return this.fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        System.out.println(getTeamName());
        System.out.println(getEmailAddress());
        return "Practice in nets for 30 minutes";
    }

    @Override
    public String getFortune() {
        return getFortuneService().getFortune();
    }
}
