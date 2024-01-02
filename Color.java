// Assignment: 4
// Author: Ram Nagid, ID: 318692779
package enums.colors;

/**
 * The Color enum represents different colors with their respective RGB levels.
 */
public enum Color {
    RED(255, 0, 0),       // Red color with RGB levels (255, 0, 0)
    GREEN(0, 255, 0),     // Green color with RGB levels (0, 255, 0)
    BLUE(0, 0, 255),      // Blue color with RGB levels (0, 0, 255)
    WHITE(255, 255, 255), // White color with RGB levels (255, 255, 255)
    BLACK(0, 0, 0);       // Black color with RGB levels (0, 0, 0)

    final int level1;     // Level 1 (red component) of the color
    final int level2;     // Level 2 (green component) of the color
    final int level3;     // Level 3 (blue component) of the color

    /**
     * Constructs a Color object with the specified RGB levels.
     *
     * @param level1 the level of the color's level 1 (red component)
     * @param level2 the level of the color's level 2 (green component)
     * @param level3 the level of the color's level 3 (blue component)
     */
    Color(int level1, int level2, int level3) {
        this.level1 = level1;
        this.level2 = level2;
        this.level3 = level3;
    }
}