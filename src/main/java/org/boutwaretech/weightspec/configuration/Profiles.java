package org.boutwaretech.weightspec.configuration;

/**
 * This class defines the Spring profiles used in the project. The idea behind
 * this class is that it helps us to avoid typos when we are using these
 * profiles. At the moment there are two profiles which are described in the
 * following:
 * <ul>
 * <li>The APPLICATION profile is used when we run our example application.</li>
 * <li>The INTEGRATION_TEST profile is used when we run the integration tests of
 * our example application.</li>
 * </ul>
 */
public class Profiles {
    public static final String LIVE = "live";
    public static final String INTEGRATION_TEST = "integrationtest";
    public static final String DEV = "dev";

    /**
     * Prevent instantiation.
     */
    private Profiles() {
    }
}
