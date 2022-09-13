package org.example.structural.proxy;

public class ApplicationRunner {
    public static void main(String[] args) {
        Service service = new AuthorizationProxyService("admin");
        service.doJob();

        Service service2 = new AuthorizationProxyService("John");
        service2.doJob();
    }
}
