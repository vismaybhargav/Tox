package tox.core.math;

/**
 * A 2D Vector implementation that represents a 2D point in space
 * <br><br>Example usage:
 * <pre>
 * {@code
 * Vector2 vec = new Vector2(1, 1);
 * Vector2 vec2 = new Vector2(2, 2);
 * System.out.println(vec.add(vec2).mult(2));
 * }
 * </pre>
 */
public class Vector2 {
    /** X Location of the Vector */
    public double x;
    /** Y Location of the Vector */
    public double y;

    /**
     * Create a Vector2 with x, and y locations
     * @param x X Location
     * @param y Y Location
     */
    public Vector2(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Adds two vectors together and mutates the addend and not the adder
     * @param other The other vector that represents the adder
     * @return this
     */
    public Vector2 add(Vector2 other) {
        x += other.x;y += other.y;
        return this;
    }

    /**
     * Adds to this vector by a scalar value
     * @param scalar value to add by
     * @return this
     */
    public Vector2 add(double scalar) {
        x += scalar; y += scalar;
        return this;
    }

    /**
     * Subtracts two vectors and mutates the subbend and not the subber
     * @param other The other vector that represents the subber
     * @return this
     */
    public Vector2 sub(Vector2 other) {
        x -= other.x;y -= other.y;
        return this;
    }

    /**
     * Subtracts from this vector by a scalar value
     * @param scalar value to subtract
     * @return this
     */
    public Vector2 sub(double scalar) {
        x -= scalar; y -= scalar;
        return this;
    }

    /**
     * Multiplies two vectors and mutates only the multiplicand (is this a real world)
     * @param other The other vector to multiply
     * @return this
     */
    public Vector2 mult(Vector2 other) {
        x *= other.x;y *= other.y;
        return this;
    }

    /**
     * Multiplies a vector by a scalar value.
     * @param scalar The Scalar value to multiply
     * @return this
     */
    public Vector2 mult(double scalar) {
        x *= scalar; y *= scalar;
        return this;
    }

    /**
     * Sets the x and y of the Vector2
     * @param x X location
     * @param y Y location
     * @return this
     */
    public Vector2 set(double x, double y) {
        this.x = x;this.y = y;
        return this;
    }

    /**
     * Lerps towards a target vector by alpha
     * @param target Target vector to lerp towards
     * @param alpha Alpha value to lerp by
     */
    public void lerp(Vector2 target, double alpha) {
        x += alpha * (target.x - x);
        y += alpha * (target.y - y);
    }

    /**
     * Get the magnitude of a vector
     * @return magnitude of a vector
     */
    public double getMagnitude() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    /**
     * Get the Magnitude of a vector squared
     * @return Magnitude of a vector squared
     */
    public double getMagnitudeSq() {
        return Math.pow(x, 2) + Math.pow(y, 2);
    }

    /**
     * Normalizes a vector
     * @return this
     */
    public Vector2 normalize() {
        double mag = getMagnitude();
        x /= mag;
        y /= mag;
        return this;
    }

    /**
     * Get the distance to another vector
     * @param other other vector
     * @return the distance between two vectors
     */
    public double distanceTo(Vector2 other) {
        return Math.sqrt((Math.pow((other.x - x), 2)) + (Math.pow((other.y - y), 2)));
    }

    /**
     * Get the distance to another vector squared
     * @param other other vector
     * @return the distance between two vectors squared
     */
    public double distanceToSq(Vector2 other) {
        return (Math.pow((other.x - x), 2)) + (Math.pow((other.y - y), 2));
    }

    public static double clamp(double n, double low, double high) {
        if(n >= low && n <= high) {
            return n;
        } else if(n > high) {
            return high;
        } else return low;
    }


    /**
     * Checks if the x and y value of a vector is equal ot another
     * @param obj Other vector to check
     * @return if vector is equal to the other
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Vector2) {
            Vector2 vec = (Vector2)obj;
            return vec.x == this.x && vec.y == this.y;
        }
        return false;
    }

    /**
     * Returns the string representation of the vector
     * @return string representation of the vector
     */
    @Override
    public String toString() {
        return STR."[\{x} , \{y}]";
    }
}
