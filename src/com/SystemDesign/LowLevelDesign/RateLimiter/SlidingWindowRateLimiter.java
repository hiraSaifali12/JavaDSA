package com.SystemDesign.LowLevelDesign.RateLimiter;

public class SlidingWindowRateLimiter {
  private  RateLimitConfig rateLimitConfig;

    public SlidingWindowRateLimiter(RateLimitConfig rateLimitConfig) {
        this.rateLimitConfig = rateLimitConfig;
    }
}
