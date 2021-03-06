// Copyright (c) 2012 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.ui;

/**
 * Provide Android internal resources to Chrome's ui layer.  This allows classes
 * that access resources via org.chromium.ui.R to function properly in webview.
 * In a normal Chrome build, ui resources live in a res folder in the ui layer
 * and the org.chromium.ui.R class is generated at build time based on these
 * resources.  In webview, resources live in the Android framework and can't be
 * accessed directly from the ui layer.  Instead, we copy resources needed by ui
 * into the Android framework and use this R class to map resources IDs from
 * org.chromium.ui.R to com.android.internal.R.
 */
public final class R {
    public static final class string {
        public static int accessibility_date_picker_month;
        public static int accessibility_date_picker_week;
        public static int accessibility_date_picker_year;
        public static int accessibility_datetime_picker_date;
        public static int accessibility_datetime_picker_time;
        public static int copy_to_clipboard_failure_message;
        public static int low_memory_error;
        public static int opening_file_error;
        public static int color_picker_button_more;
        public static int color_picker_hue;
        public static int color_picker_saturation;
        public static int color_picker_value;
        public static int color_picker_button_set;
        public static int color_picker_button_cancel;
        public static int color_picker_dialog_title;
        public static int color_picker_button_red;
        public static int color_picker_button_cyan;
        public static int color_picker_button_blue;
        public static int color_picker_button_green;
        public static int color_picker_button_magenta;
        public static int color_picker_button_yellow;
        public static int color_picker_button_black;
        public static int color_picker_button_white;
        public static int date_picker_dialog_clear;
        public static int date_picker_dialog_set;
        public static int date_picker_dialog_title;
        public static int date_picker_dialog_other_button_label;
        public static int date_time_picker_dialog_title;
        public static int time_picker_dialog_am;
        public static int time_picker_dialog_hour_minute_separator;
        public static int time_picker_dialog_minute_second_separator;
        public static int time_picker_dialog_second_subsecond_separator;
        public static int time_picker_dialog_pm;
        public static int time_picker_dialog_title;
        public static int week_picker_dialog_title;
        public static int month_picker_dialog_title;
    }
    public static final class id {
        public static int dropdown_label;
        public static int dropdown_popup_window;
        public static int dropdown_sublabel;
        public static int selected_color_view;
        public static int title;
        public static int more_colors_button;
        public static int color_picker_advanced;
        public static int color_picker_simple;
        public static int color_button_swatch;
        public static int more_colors_button_border;
        public static int gradient;
        public static int text;
        public static int seek_bar;
        public static int milli;
        public static int minute;
        public static int pickers;
        public static int position_in_year;
        public static int second;
        public static int second_colon;
        public static int second_dot;
        public static int date_picker;
        public static int date_time_suggestion_value;
        public static int date_time_suggestion_label;
        public static int hour;
        public static int ampm;
        public static int time_picker;
        public static int year;
    }
    public static final class layout {
        public static int dropdown_item;
        public static int color_picker_dialog_title;
        public static int color_picker_dialog_content;
        public static int color_picker_advanced_component;
        public static int date_time_picker_dialog;
        public static int date_time_suggestion;
        public static int two_field_date_picker;
        public static int multi_field_time_picker_dialog;
    }
    public static final class drawable {
        public static int color_button_background;
        public static int color_picker_advanced_select_handle;
    }
    public static final class style {
        public static int DropdownPopupWindow;
    }
    public static final class color {
        public static int dropdown_dark_divider_color;
        public static int dropdown_divider_color;
        public static int color_picker_border_color;
    }
    public static final class dimen {
        public static int dropdown_item_height;
        public static int dropdown_item_divider_height;
        public static int color_button_height;
        public static int config_min_scaling_span;
        public static int config_min_scaling_touch_major;
    }
}
