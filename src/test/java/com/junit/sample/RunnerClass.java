package com.junit.sample;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({Sample.class, FacebookLogin.class})
public class RunnerClass {

}
