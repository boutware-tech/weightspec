package org.boutwaretech.weightspec.providers;

import org.boutwaretech.weightspec.configuration.Profiles;
import org.boutwaretech.weightspec.constants.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;

/**
 * This component returns the username of the authenticated user.
 */
public class UsernameAuditorAware implements AuditorAware<String> {
    
    @Autowired
    Environment env;

    @Override
    public String getCurrentAuditor() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        if (authentication == null || !authentication.isAuthenticated()) {
            return (env.acceptsProfiles(Profiles.PROD)) ? null : Constants.BOOTSTRAP;
        }

        return ((User) authentication.getPrincipal()).getUsername();
    }
}
