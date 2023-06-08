package com.katemoko.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${env}.properties"
})
public interface WebDriverConfig extends Config {

    @Key("baseUrl")
    @DefaultValue("https://koronapay.com")
    String getBaseUrl();

    @Key("browser")
    @DefaultValue("CHROME")
    String getBrowser();

    @Key("browserVersion")
    String getBrowserVersion();

    @Key("isRemote")
    @DefaultValue("false")
    Boolean getIsRemote();

    @Key("remoteUrl")
    String getRemoteUrl();
}