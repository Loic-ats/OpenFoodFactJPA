package utils;

import org.apache.commons.lang3.math.NumberUtils;

public class ConversionDouble {

    public static Double stringToDouble(String value) {
        if (NumberUtils.isCreatable(value)) {
            return Double.parseDouble(value);
        }
        return 0.0;
    }
}
