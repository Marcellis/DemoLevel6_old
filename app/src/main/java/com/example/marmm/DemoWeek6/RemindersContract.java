package com.example.marmm.DemoWeek6;

import android.provider.BaseColumns;

/**
 * Created by marmm on 10/2/17.
 */

public final class RemindersContract {

    private RemindersContract() {}

    /* Inner class that defines the table contents */
    public static class ReminderEntry implements BaseColumns {
        public static final String TABLE_NAME = "Reminders";
        public static final String COLUMN_NAME_REMINDER = "reminder";

    }
}


