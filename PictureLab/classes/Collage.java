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
        //initializing all the pictures
        Picture me1 = new Picture("me.jpg");
        Picture me2 = new Picture("me.jpg");
        Picture me3 = new Picture("me.jpg");
        Picture me4 = new Picture("me.jpg");
        Picture me5 = new Picture("me.jpg");
        Picture me6 = new Picture("me.jpg");
        Picture me7 = new Picture("me.jpg");
        Picture me8 = new Picture("me.jpg");
        Picture me9 = new Picture("me.jpg");

        //running the various methods and filters on the pictures
        me1.posterize();
        me2.negate();
        me3.keepOnlyBlue();
        me4.mirrorVertical();
        //leave me5 in original form
        me6.mirrorVerticalRightToLeft();

        Picture canvas = new Picture(1240, 1540);
        canvas.setBlack();
        //using CropAndCopy to fit all the pictures onto the collage canvas
        canvas.cropAndCopy(me1, 0, 399, 0, 499, 10, 10);
        canvas.cropAndCopy(me2, 0, 399, 0, 499, 10, 520);
        canvas.cropAndCopy(me3, 0, 399, 0, 499, 10, 1030);
        canvas.cropAndCopy(me4, 0, 399, 0, 499, 420, 10);
        canvas.cropAndCopy(me5, 0, 399, 0, 499, 420, 520);
        canvas.cropAndCopy(me6, 0, 399, 0, 499, 420, 1030);
        canvas.cropAndCopy(me7, 0, 399, 0, 499, 830, 10);
        canvas.cropAndCopy(me8, 0, 399, 0, 499, 830, 520);
        canvas.cropAndCopy(me9, 0, 399, 0, 499, 830, 1030);

        //creating a "picture frame" around all the pictures"
        canvas.explore();
    }
}
