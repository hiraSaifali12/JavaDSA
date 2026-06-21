package com.SystemDesign.LowLevelDesign.RateLimiter;

public class LeakyBucketRateLimiter {
    private  RateLimitConfig rateLimitConfig;

    public LeakyBucketRateLimiter(RateLimitConfig rateLimitConfig) {
        this.rateLimitConfig = rateLimitConfig;
    }
}
