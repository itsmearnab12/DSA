// 1344. Angle Between Hands of a Clock | Medium

// Given two numbers, hour and minutes, return the smaller angle (in degrees) formed between the hour and the minute hand.
// Answers within 10-5 of the actual value will be accepted as correct.

// Example 1:

// Input: hour = 12, minutes = 30
// Output: 165
// Example 2:

// Input: hour = 3, minutes = 30
// Output: 75
// Example 3:

// Input: hour = 3, minutes = 15
// Output: 7.5

public class Problem1344 {
    public double angleClock(int hour, int minutes) {
        double hourAngle = 30 * (hour % 12) + 0.5 * minutes;
        double minutesAngle = 6 * minutes;
        double angle = Math.abs(hourAngle - minutesAngle);
        return Math.min(angle, 360 - angle);
    }
}
