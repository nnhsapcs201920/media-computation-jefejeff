import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author jcheng3
 */
public class Picture extends SimplePicture 
{
    ///////////////////// constructors //////////////////////////////////

    /**
     * Constructor that takes no arguments 
     */
    public Picture ()
    {
        /* not needed but use it to show students the implicit call to super()
         * child constructors always call a parent constructor 
         */
        super();  
    }

    /**
     * Constructor that takes a file name and creates the picture 
     * @param fileName the name of the file to create the picture from
     */
    public Picture(String fileName)
    {
        // let the parent class handle this fileName
        super(fileName);
    }

    /**
     * Constructor that takes the width and height
     * @param height the height of the desired picture
     * @param width the width of the desired picture
     */
    public Picture(int height, int width)
    {
        // let the parent class handle this width and height
        super(width,height);
    }

    /**
     * Constructor that takes a picture and creates a 
     * copy of that picture
     * @param copyPicture the picture to copy
     */
    public Picture(Picture copyPicture)
    {
        // let the parent class do the copy
        super(copyPicture);
    }

    /**
     * Constructor that takes a buffered image
     * @param image the buffered image to use
     */
    public Picture(BufferedImage image)
    {
        super(image);
    }

    ////////////////////// methods ///////////////////////////////////////

    /**
     * Method to return a string with information about this picture.
     * @return a string with information about the picture such as fileName,
     * height and width.
     */
    public String toString()
    {
        String output = "Picture, filename " + getFileName() + 
            " height " + getHeight() 
            + " width " + getWidth();
        return output;

    }

    /** Method to set the blue to 0 */
    public void zeroBlue()
    {
        Pixel[][] pixels = this.getPixels2D();
        for (Pixel[] rowArray : pixels)
        {
            for (Pixel pixelObj : rowArray)
            {
                pixelObj.setBlue(0);
            }
        }
    }

    /** Method to keep only the blue */
    public void keepOnlyBlue()
    {
        Pixel[][] pixels = this.getPixels2D();
        for (Pixel[] rowArray : pixels)
        {
            for (Pixel pixelObj : rowArray)
            {
                pixelObj.setRed(0);
                pixelObj.setGreen(0);
            }
        }
    }

    /** Method to negate the picture */
    public void negate()
    {
        Pixel[][] pixels = this.getPixels2D();
        for (Pixel[] rowArray : pixels)
        {
            for (Pixel pixelObj : rowArray)
            {
                pixelObj.setRed(255-pixelObj.getRed());
                pixelObj.setGreen(255-pixelObj.getGreen());
                pixelObj.setBlue(255-pixelObj.getBlue());
            }
        }
    }

    /** Method to turn the picture to grayscale */
    public void grayscale()
    {
        Pixel[][] pixels = this.getPixels2D();
        for (Pixel[] rowArray : pixels)
        {
            for (Pixel pixelObj : rowArray)
            {
                int red = pixelObj.getRed();
                int blue = pixelObj.getBlue();
                int green = pixelObj.getGreen();
                int avg = (red + blue + green) / 3;
                pixelObj.setRed(avg);
                pixelObj.setGreen(avg);
                pixelObj.setBlue(avg);
            }
        }
    }

    /** Method that mirrors the picture around a 
     * vertical mirror in the center of the picture
     * from left to right */
    public void mirrorVertical()
    {
        Pixel[][] pixels = this.getPixels2D();
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        int width = pixels[0].length;
        for (int row = 0; row < pixels.length; row++)
        {
            for (int col = 0; col < width / 2; col++)
            {
                leftPixel = pixels[row][col];
                rightPixel = pixels[row][width - 1 - col];
                rightPixel.setColor(leftPixel.getColor());
            }
        } 
    }

    /**  Method that mirrors a picture around a mirror placed vertically from right to left. */
    public void mirrorVerticalRightToLeft()
    {
        Pixel[][] pixels = this.getPixels2D();
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        int width = pixels[0].length;
        for (int row = 0; row < pixels.length; row++)
        {
            for (int col = 0; col < width / 2; col++)
            {
                leftPixel = pixels[row][col];
                rightPixel = pixels[row][width - 1 - col];
                leftPixel.setColor(rightPixel.getColor());
            }
        } 
    }

    /** Method that mirrors a picture around a mirror placed horizontally at the middle of the height of the picture. */
    public void mirrorHorizontal()
    {
        Pixel [] [] pixels = this.getPixels2D();
        Pixel topPixel = null;
        Pixel botPixel = null;
        for (int row = 0; row < pixels.length / 2; row++)
        {
            for (int col = 0; col < pixels[0].length; col++)
            {
                topPixel = pixels[row][col];
                botPixel = pixels[pixels.length - 1 - row][col];
                botPixel.setColor(topPixel.getColor());
            }
        }
    }

    /** Method that mirrors the picture around a mirror placed horizontally from bottom to top. */
    public void mirrorHorizontalBotToTop()
    {
        Pixel [] [] pixels = this.getPixels2D();
        Pixel topPixel = null;
        Pixel botPixel = null;
        for (int row = 0; row < pixels.length / 2; row++)
        {
            for (int col = 0; col < pixels[0].length; col++)
            {
                topPixel = pixels[row][col];
                botPixel = pixels[pixels.length - 1 - row][col];
                topPixel.setColor(botPixel.getColor());
            }
        }
    }

    /** Method that mirrors the picture along a diagonal placed from bottom left to top right     */
    public void mirrorDiagonal()
    {
        Pixel [] [] pixels = this.getPixels2D();
        Pixel topPixel = null;
        Pixel botPixel = null;
        for (int row = 0; row < pixels.length / 2; row++)
        {
            for (int col = 0; col < pixels[0].length; col++)
            {
                topPixel = pixels[row][col];
                botPixel = pixels[pixels.length - 1 - row][pixels[0].length - 1 - col];
                botPixel.setColor(topPixel.getColor());
            }
        }
    }

    /** Mirror just part of a picture of a temple */
    public void mirrorTemple()
    {
        int mirrorPoint = 276;
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        int count = 0;
        Pixel[][] pixels = this.getPixels2D();

        // loop through the rows
        for (int row = 27; row < 97; row++)
        {
            // loop from 13 to just before the mirror point
            for (int col = 13; col < mirrorPoint; col++)
            {
                count++;
                leftPixel = pixels[row][col];      
                rightPixel = pixels[row]                       
                [mirrorPoint - col + mirrorPoint];
                rightPixel.setColor(leftPixel.getColor());
            }
        }
        System.out.println("The code was executed " + count + " times!");
    }

    /** Mirror the arms of the snowman */
    public void mirrorArms()
    {
        int mirrorPoint = 191;
        int mirrorPoint2 = 196;
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        Pixel[][] pixels = this.getPixels2D();

        // loop through the cols
        for (int row = 158; row < mirrorPoint; row++)
        {
            // loop from 158 to just before the mirror point
            for (int col = 105; col < 170; col++)
            {
                leftPixel = pixels[row][col];      
                rightPixel = pixels[mirrorPoint - row + mirrorPoint][col];
                rightPixel.setColor(leftPixel.getColor());
            }
        }

        // loop through the cols
        for (int row = 172; row < mirrorPoint2; row++)
        {
            // loop from 158 to just before the mirror point
            for (int col = 239; col < 294; col++)
            {
                leftPixel = pixels[row][col];      
                rightPixel = pixels[mirrorPoint - row + mirrorPoint2][col];
                rightPixel.setColor(leftPixel.getColor());
            }
        }
    }

    /** Mirror the seagulls on the beach  */
    public void mirrorGull()
    {
        int mirrorPoint = 355;
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        Pixel[][] pixels = this.getPixels2D();

        // loop through the rows
        for (int row = 230; row < 325; row++)
        {
            // loop from 230 to just before the mirror point
            for (int col = 230; col < mirrorPoint; col++)
            {
                leftPixel = pixels[row][col];      
                rightPixel = pixels[row]                       
                [mirrorPoint - col + mirrorPoint];
                rightPixel.setColor(leftPixel.getColor());
            }
        }
    }

    /** Method to show large changes in color 
     * @param edgeDist the distance for finding edges
     */
    public void edgeDetection(int edgeDist)
    {
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        Pixel[][] pixels = this.getPixels2D();
        Color rightColor = null;
        for (int row = 0; row < pixels.length; row++)
        {
            for (int col = 0; 
            col < pixels[0].length-1; col++)
            {
                leftPixel = pixels[row][col];
                rightPixel = pixels[row][col+1];
                rightColor = rightPixel.getColor();
                if (leftPixel.colorDistance(rightColor) > 
                edgeDist)
                    leftPixel.setColor(Color.BLACK);
                else
                    leftPixel.setColor(Color.WHITE);
            }
        }
    }

    /**
     * Method to show the fish in the water
     */
    public void fixUnderwater()
    {
        Pixel[][] pixels = this.getPixels2D();
        for(Pixel[] rowArray : pixels)
        {
            for(Pixel pixelObj : rowArray)
            {
                int red = pixelObj.getRed();
                int green = pixelObj.getGreen();
                int blue = pixelObj.getBlue();
                pixelObj.setRed(red + 70);
                pixelObj.setBlue(blue - 30);
                pixelObj.setGreen(green - 10);
            }
        }
    }

    /**
     * Method to crop and copy a part of a picture and put it into another picture
     */
    public void cropAndCopy(Picture sourcePicture, int startSourceRow, int endSourceRow, int startSourceCol, int endSourceCol, int startDestRow, int startDestCol)
    {
        Pixel pix1 = null;
        Pixel pix2 = null;
        Pixel[][] pixels = this.getPixels2D();
        startDestRow--;
        int start = startDestCol;

        // loop through the rows
        for (int row = startSourceRow; row <= endSourceRow; row++)
        {
            startDestRow++;
            startDestCol = start;
            for (int col = startSourceCol; col <= endSourceCol; col++)
            {
                pix1 = sourcePicture.getPixels2D()[row][col];      
                pix2 = pixels[startDestRow][startDestCol];
                pix2.setColor(pix1.getColor());
                startDestCol++;
            }
        }
    }

    /* Main method for testing - each class in Java can have a main 
     * method 
     */
    public static void main(String[] args) 
    {
        Picture beach = new Picture("beach.jpg");
        beach.explore();
        beach.zeroBlue();
        beach.explore();
    }

} // this } is the end of class Picture, put all new methods before this
