package com.mycompany.testing;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println(" ----- Inside onTestStart -----");

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println(" ----- Inside onTestSuccess -----");

    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println(" ----- Inside onTestFailure -----");

    }

    @Override
    public void onTestSkipped(ITestResult result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println(" ----- Inside onStart -----");

    }

    @Override
    public void onFinish(ITestContext context) {

    }
}
