package org.openmrs.module.laboratoryapp.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LabUtils {
    public static String formatDateTime(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        return sdf.format(date);
    }
}
