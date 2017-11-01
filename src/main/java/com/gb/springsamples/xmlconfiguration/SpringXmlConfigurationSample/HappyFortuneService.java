package com.gb.springsamples.xmlconfiguration.SpringXmlConfigurationSample;

import java.time.LocalDateTime;

/**
 * Created by fax6 on 01/11/17.
 */
public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Today " + LocalDateTime.now() + "is good day for you.";
    }
}
