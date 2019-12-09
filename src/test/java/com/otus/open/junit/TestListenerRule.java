package com.otus.open.junit;

import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

public class TestListenerRule extends TestWatcher {


    @Override
    public Statement apply(Statement base, Description description) {
        return super.apply(base, description);
    }

    @Override
    protected void succeeded(Description description) {
        System.out.println("succeeded");
        System.out.println(description.getDisplayName());
        super.succeeded(description);
    }

    @Override
    protected void failed(Throwable e, Description description) {
        System.out.println("failed");
        System.out.println(description.getDisplayName());
        System.out.println(e.getClass().getName());
        super.failed(e, description);
    }

    @Override
    protected void starting(Description description) {
        System.out.println("start " + description.getDisplayName());
        super.starting(description);
    }

    @Override
    protected void finished(Description description) {
        System.out.println("finish " + description.getDisplayName());
        super.finished(description);
    }
}
