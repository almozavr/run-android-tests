package com.sromku.sample.runtests.all;

import android.content.Context;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.espresso.intent.rule.IntentsTestRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import com.sromku.sample.runtests.MainActivity;
import com.sromku.sample.runtests.Utils;

import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertEquals;

@RunWith(AndroidJUnit4.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AllTwo {

    @Rule
    public IntentsTestRule<MainActivity> mActivity = new IntentsTestRule<>(MainActivity.class);

    @Test
    public void testA() throws Exception {
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        Utils.sleep(2000);
        assertEquals("com.sromku.sample.runtests", appContext.getPackageName());
    }

}
