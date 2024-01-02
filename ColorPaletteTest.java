// Assignment: 4
// Author: Ram Nagid, ID: 318692779
package enums.colors;

/**
 * Possible main check for ArrayQueue.
 */
public class ColorPaletteTest {
    public static void main(String [] args){
        Color [] colors= Color.values();
        new ColorPalette(colors);
        for (int i = 0; i < colors.length; i++) {
            System.out.println(ColorPalette.getColorByName(String.valueOf(colors[i]))+" ("+colors[i].level1+", "+colors[i].level2+" ,"+colors[i].level3+")");
        }

    }
}
