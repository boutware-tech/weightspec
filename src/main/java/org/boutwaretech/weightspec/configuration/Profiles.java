package org.boutwaretech.weightspec.configuration;

/**
 * This class defines the Spring profiles used in the project. The idea behind
 * this class is that it helps us to avoid typos when we are using these profiles.
 */
public class Profiles {
    public static final String PROD = "prod";
    public static final String INTEGRATION_TEST = "integrationtest";
    public static final String DEV = "dev";
    public static final String FAKE_TEAMSVC = "faketeamsvc";
    public static final String FLOID_TEAMSVC = "floteamsvc";
    public static final String FLOID_ORGSVC = "floorgsvc";
    
    /** Features */
    public static final String BASIC_AUTH = "basicauth";

    /**
     * Prevent instantiation.
     */
    private Profiles() {
    }
}
