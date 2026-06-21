package com.SystemDesign.LowLevelDesign.RateLimiter;

public abstract class  RateLimiter {
    protected final RateLimitType rateLimitType;
     protected  final RateLimitConfig rateLimitConfig;

    public RateLimiter(RateLimitType rateLimitType, RateLimitConfig rateLimitConfig) {
        this.rateLimitType = rateLimitType;
        this.rateLimitConfig = rateLimitConfig;
    }

    public abstract boolean allowRequest(String userId);
}
