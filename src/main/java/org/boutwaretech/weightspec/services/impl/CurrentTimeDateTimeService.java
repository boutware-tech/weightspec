package org.boutwaretech.weightspec.services.impl;

import java.time.ZonedDateTime;

import org.boutwaretech.weightspec.services.iface.DateTimeService;

/**
 * This class returns the current time.
 */
public class CurrentTimeDateTimeService implements DateTimeService {

    @Override
    public ZonedDateTime getCurrentDateAndTime() {
        return ZonedDateTime.now();
    }
}
