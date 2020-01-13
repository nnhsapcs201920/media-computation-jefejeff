public class IntArrayWorker
{
    /** two dimensional matrix */
    private int[][] matrix = null;

    /** set the matrix to the passed one
     * @param theMatrix the one to use
     */
    public void setMatrix(int[][] theMatrix)
    {
        matrix = theMatrix;
    }

    /**
     * Method to return the total 
     * @return the total of the values in the array
     */
    public int getTotal()
    {
        int total = 0;
        for (int row = 0; row < matrix.length; row++)
        {
            for (int col = 0; col < matrix[0].length; col++)
            {
                total = total + matrix[row][col];
            }
        }
        return total;
    }

    /**
     * Method to return the total using a nested for-each loop
     * @return the total of the values in the array
     */
    public int getTotalNested()
    {
        int total = 0;
        for (int[] rowArray : matrix)
        {
            for (int item : rowArray)
            {
                total = total + item;
            }
        }
        return total;
    }

    /**
     * Method to fill with an increasing count
     */
    public void fillCount()
    {
        int numCols = matrix[0].length;
        int count = 1;
        for (int row = 0; row < matrix.length; row++)
        {
            for (int col = 0; col < numCols; col++)
            {
                matrix[row][col] = count;
                count++;
            }
        }
    }

    /**
     * returns the count of the number of times a passed integer value is found in the matrix.
     * 
     * @return number of times a passed integer value is found in the matrix
     */
    public int getCount(int find)
    {
        int count = 0;
        for (int [] rowArray : matrix)
        {
            for (int item : rowArray)
            {
                if (item == find)
                {
                    count++;
                }
            }
        }
        return count;
    }

    /**
     *  returns the largest value in the matrix.
     *  
     *  @return the largest value in the matrix
     */
    public int getLargest()
    {
        int max = 0;
        for (int [] rowArray : matrix)
        {
            for (int item : rowArray)
            {
                if (item > max)
                {
                    max = item;
                }
            }
        }
        return max;
    }

    /**
     * returns the total of all integers in a specified column 
     * 
     * @ return the total of all integers in a specified column
     */
    public int getColTotal(int col)
    {
        int total = 0;
        for (int [] rowArray : matrix)
        {
            total += rowArray[col];
        }
        return total;
    }

    /**
     * print the values in the array in rows and columns
     */
    public void print()
    {
        for (int row = 0; row < matrix.length; row++)
        {
            for (int col = 0; col < matrix[0].length; col++)
            {
                System.out.print( matrix[row][col] + " " );
            }
            System.out.println();
        }
        System.out.println();
    }

    /** 
     * fill the array with a pattern
     */
    public void fillPattern1()
    {
        for (int row = 0; row < matrix.length; row++)
        {
            for (int col = 0; col < matrix[0].length; 
            col++)
            {
                if (row < col)
                    matrix[row][col] = 1;
                else if (row == col)
                    matrix[row][col] = 2;
                else
                    matrix[row][col] = 3;
            }
        }
    }

}