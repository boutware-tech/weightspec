package org.boutwaretech.weightspec.services.iface;

import java.time.ZonedDateTime;

/**
 * This interface defines the methods used to get the current date and time.
 */
public interface DateTimeService {
    ZonedDateTime getCurrentDateAndTime();
}
