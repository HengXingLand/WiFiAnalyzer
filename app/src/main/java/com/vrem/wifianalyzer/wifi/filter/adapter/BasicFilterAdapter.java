/*
 * WiFiAnalyzer
 * Copyright (C) 2015 - 2020 VREM Software Development <VREMSoftwareDevelopment@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */

package com.vrem.wifianalyzer.wifi.filter.adapter;

import com.vrem.wifianalyzer.settings.Settings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import androidx.annotation.NonNull;

public abstract class BasicFilterAdapter<T> {
    private Set<T> values;

    BasicFilterAdapter(@NonNull Set<T> values) {
        setValues(values);
    }

    @NonNull
    public Set<T> getValues() {
        return values;
    }

    public void setValues(@NonNull Set<T> values) {
        this.values = new HashSet<>(values);
    }

    public void setValues(@NonNull T[] values) {
        this.values = new HashSet<>(Arrays.asList(values));
    }

    abstract boolean isActive();

    abstract void reset();

    abstract void save(@NonNull Settings settings);
}
