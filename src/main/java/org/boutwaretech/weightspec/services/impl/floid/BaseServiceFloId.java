package org.boutwaretech.weightspec.services.impl.floid;

import javax.annotation.PostConstruct;

import org.boutwaretech.weightspec.constants.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@PropertySource("classpath:floid.properties")
public abstract class BaseServiceFloId {
    
    protected String floidBasepath;
    
    @Autowired
    private Environment env;
    
    @PostConstruct
    public void setFloidBasepath() {
        this.floidBasepath = env.getProperty(Constants.FLOID_BASEPATH_PROPERTY);
    }
}
