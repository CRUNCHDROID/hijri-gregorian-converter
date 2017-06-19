/* Copyright (c) 2017, Fikrul Arif
 * (under LGPL license - see COPYING file)
 */
package net.crunchdroid.hijri.gregorian.converter;

import java.util.Locale;
import java.util.ResourceBundle;

final class HijriNames {

    private ResourceBundle res;

    HijriNames(Locale locale) {
        if (locale == null)
            locale = Locale.getDefault();

        this.res = ResourceBundle.getBundle("messages", locale);
    }

    String get(String key) {
        return res.getString(key);
    }
}
