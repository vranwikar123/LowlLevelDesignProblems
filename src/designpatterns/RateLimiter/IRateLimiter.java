package RateLimiter;

public interface IRateLimiter {
    boolean isAllowed(UserRequest userRequest);
}
