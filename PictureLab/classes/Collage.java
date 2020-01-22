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
        Picture me1 = new Picture("me.jpg");
        Picture me2 = new Picture("me.jpg");
        Picture me3 = new Picture("me.jpg");
        Picture me4 = new Picture("me.jpg");
        Picture me5 = new Picture("me.jpg");
        Picture me6 = new Picture("me.jpg");
        Picture me7 = new Picture("me.jpg");
        Picture me8 = new Picture("me.jpg");
        Picture me9 = new Picture("me.jpg");
        me2.mirrorVerticalRightToLeft();
        me3.zeroBlue();
        Picture canvas = new Picture(1200, 1500);
        canvas.cropAndCopy(me1, 0, 399, 0, 499, 0, 0);
        canvas.cropAndCopy(me2, 0, 399, 0, 499, 0, 500);
        canvas.cropAndCopy(me3, 0, 399, 0, 499, 400, 0);
        canvas.cropAndCopy(me4, 0, 399, 0, 499, 400, 500);
        canvas.cropAndCopy(me5, 0, 399, 0, 499, 800, 500);
        canvas.cropAndCopy(me6, 0, 399, 0, 499, 400, 1000);
        canvas.cropAndCopy(me7, 0, 399, 0, 499, 800, 1000);
        canvas.cropAndCopy(me8, 0, 399, 0, 499, 0, 1000);
        canvas.cropAndCopy(me9, 0, 399, 0, 499, 800, 0);
        canvas.explore();
    }
}
