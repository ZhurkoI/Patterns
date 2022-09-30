package org.example.structural.proxy;

public class ServiceImpl implements Service {

    @Override
    public void doJob() {
        System.out.println("Web service is doing its work...");
    }
}
