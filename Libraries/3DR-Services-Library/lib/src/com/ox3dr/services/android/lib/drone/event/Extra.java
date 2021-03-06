package com.ox3dr.services.android.lib.drone.event;

/**
 * Holds handles used to retrieve additional information broadcast along a drone event.
 */
public class Extra {

    private static final String CLAZZ_NAME = Extra.class.getName();

    public static final String EXTRA_CALIBRATION_IMU_MESSAGE = CLAZZ_NAME +
            ".CALIBRATION_IMU_MESSAGE";

    public static final String EXTRA_PARAMETERS_COUNT = CLAZZ_NAME + ".PARAMETERS_COUNT";
    public static final String EXTRA_PARAMETER_INDEX = CLAZZ_NAME + ".PARAMETER_INDEX";
}
