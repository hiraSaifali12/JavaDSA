package com.SystemDesign.LowLevelDesign.RateLimiter;

public class FixedWindowRateLimiter {
    private  RateLimitConfig rateLimitConfig;

    public FixedWindowRateLimiter(RateLimitConfig rateLimitConfig) {
        this.rateLimitConfig = rateLimitConfig;
    }
}
