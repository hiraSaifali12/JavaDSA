package com.SystemDesign.LowLevelDesign.RateLimiter;

public class RateLimitConfig {
    private final int maxReq;
    private final int timeWindow;

    public RateLimitConfig(int maxReq, int timeWindow) {
        this.maxReq = maxReq;
        this.timeWindow = timeWindow;
    }

    public int getMaxReq() {
        return maxReq;
    }

    public int getTimeWindow() {
        return timeWindow;
    }
}
