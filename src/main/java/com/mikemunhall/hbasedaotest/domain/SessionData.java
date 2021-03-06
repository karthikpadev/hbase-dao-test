package com.mikemunhall.hbasedaotest.domain;

public class SessionData {

    private String sessionId;
    private String identity;
    private String providerId;
    private String platform;

    public SessionData() { }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getIdentity() {
        return identity;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    public String getProviderId() {
        return providerId;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getPlatform() {
        return platform;
    }
}
