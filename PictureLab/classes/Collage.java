/**
 * A lab where different filters are applied to an image multiple times
 *
 * @author jcheng3
 * @version 17 January 2020
 */
public class Collage
{
    public static void main(String[] args)
    {
        Picture me = new Picture("me.jpg");
        Picture canvas = new Picture(3200, 4000);
        canvas.cropAndCopy(me, 0, 799, 0, 999, 0, 0);

        canvas.explore();
    }
}
