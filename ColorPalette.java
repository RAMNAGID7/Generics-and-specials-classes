// Assignment: 4
// Author: Ram Nagid, ID: 318692779
package enums.colors;

/**
 * The ColorPalette class represents a palette of colors.
 */
public class ColorPalette {
    Color[] colors;

    /**
     * Constructs a ColorPalette object with the specified array of colors.
     *
     * @param colors the array of colors
     */
    public ColorPalette(Color[] colors) {
        this.colors = colors;
    }

    /**
     * Retrieves the color from the palette based on its name.
     *
     * @param color the name of the color
     * @return the Color object corresponding to the given color name, or null if the color is not found
     */
    static Color getColorByName(String color) {
        if (Color.valueOf(color) == Color.RED) {
            return Color.RED;
        }
        if (Color.valueOf(color) == Color.BLACK) {
            return Color.BLACK;
        }
        if (Color.valueOf(color) == Color.BLUE) {
            return Color.BLUE;
        }
        if (Color.valueOf(color) == Color.WHITE) {
            return Color.WHITE;
        }
        if (Color.valueOf(color) == Color.GREEN) {
            return Color.GREEN;
        }
        return null;
    }
}