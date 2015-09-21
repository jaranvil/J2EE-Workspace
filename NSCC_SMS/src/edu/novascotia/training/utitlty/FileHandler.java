package edu.novascotia.training.utitlty;

import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author W0296430
 * handle dealing with files.
 *
 */
public final class FileHandler
{
    /**
     * @param fileName to get config from.
     * @throws FileNotFoundException when can't locate the file.
     * @throws IOException when IO error occurs.
     * @return lines read.
     */
    public static List<String> loadConfig(final String fileName) throws FileNotFoundException, IOException
    {
    	
    	
        try (BufferedReader bfr = new BufferedReader(new FileReader(fileName)))
        {
            String temp;
            List<String> list = new ArrayList<String>();
            while ((temp = bfr.readLine()) != null)
            {
                list.add(temp);
            }
            return list;
        }

    }

    /**
     * prevent instantiation.
     */
    private FileHandler()
    {
    }

}
