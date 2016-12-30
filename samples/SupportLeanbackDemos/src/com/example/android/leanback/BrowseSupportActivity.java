/* This file is auto-generated from BrowseActivity.java.  DO NOT MODIFY. */

/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.example.android.leanback;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

public class BrowseSupportActivity extends FragmentActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.browse_support);
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        BackgroundHelper.attach(this);
    }

    @Override
    public void onStop() {
        BackgroundHelper.release(this);
        super.onStop();
    }
}
