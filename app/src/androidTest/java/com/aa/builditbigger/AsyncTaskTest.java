package com.aa.builditbigger;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(AndroidJUnit4.class)

public class AsyncTaskTest {

    @Rule
    public ActivityTestRule<MainActivity> rule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void useAppContext() throws ExecutionException, InterruptedException {

        EndpointsAsyncTask asyncTask = new EndpointsAsyncTask(rule.getActivity());

        String joke = asyncTask.execute().get();
        assertNotNull(joke);
        assertNotEquals(joke, "");
    }
}