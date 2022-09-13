package org.example.structural.proxy;

public class AuthorizationProxyService implements Service {
    private final String user;

    public AuthorizationProxyService(String user) {
        this.user = user;
    }

    @Override
    public void doJob() {
        if (user.equalsIgnoreCase("admin")) {
            ServiceImpl service = new ServiceImpl();
            service.doJob();
        } else {
            System.out.printf("User %s is not authorized to do this job.", user);
        }
    }
}
